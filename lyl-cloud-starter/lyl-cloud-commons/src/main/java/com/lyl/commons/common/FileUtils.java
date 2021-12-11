package com.lyl.commons.common;

import java.io.*;

/**
 * Don't repeat yourself.
 * The code is simple , It is not just a bunch of garbage that machines can execute.
 * Created at 2021-09-08 23:33:20
 * <p>
 * FileUtils. copy from apache commons-io.
 *
 * @author duanfz
 */
public class FileUtils {
    private FileUtils() {
    }

    // -----------------------------------------------------------------------

    /**
     * Opens a {@link FileInputStream} for the specified file, providing better
     * error messages than simply calling <code>new FileInputStream(file)</code>.
     * <p>
     * At the end of the method either the stream will be successfully opened, or an
     * exception will have been thrown.
     * <p>
     * An exception is thrown if the file does not exist. An exception is thrown if the
     * file object exists but is a directory. An exception is thrown if the file exists
     * but cannot be read.
     *
     * @param file the file to open for input, must not be {@code null}
     * @return a new {@link FileInputStream} for the specified file
     * @throws FileNotFoundException if the file does not exist
     * @throws IOException                   if the file object is a directory
     * @throws IOException                   if the file cannot be read
     * @since 1.3
     */
    public static FileInputStream openInputStream(final File file) throws IOException {
        if (file.exists()) {
            if (file.isDirectory()) {
                throw new IOException("File '" + file + "' exists but is a directory");
            }
            if (!file.canRead()) {
                throw new IOException("File '" + file + "' cannot be read");
            }
        } else {
            throw new FileNotFoundException("File '" + file + "' does not exist");
        }
        return new FileInputStream(file);
    }

}
