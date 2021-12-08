package com.lyl.commons.common;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * Don't repeat yourself.
 * The code is simple , It is not just a bunch of garbage that machines can execute.
 * Created at 2021-09-08 23:32:36
 * <p>
 * The Charsets constants, copy from apache commons-io.
 *
 * @author duanfz
 */
public class Charsets{
    private Charsets() {
    }

    /**
     * Constructs a sorted map from canonical charset names to charset objects required of
     * every implementation of the Java platform.
     * <p>
     * From the Java documentation
     * <a href="https://docs.oracle.com/javase/7/docs/api/java/nio/charset/Charset.html">
     * Standard charsets</a>:
     * </p>
     *
     * @return An immutable, case-insensitive map from canonical charset names to charset
     * objects.
     * @see Charset#availableCharsets()
     */
    public static SortedMap<String, Charset> requiredCharsets() {
        // maybe cache?
        final TreeMap<String, Charset> m = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
        m.put(StandardCharsets.ISO_8859_1.name(), StandardCharsets.ISO_8859_1);
        m.put(StandardCharsets.US_ASCII.name(), StandardCharsets.US_ASCII);
        m.put(StandardCharsets.UTF_16.name(), StandardCharsets.UTF_16);
        m.put(StandardCharsets.UTF_16BE.name(), StandardCharsets.UTF_16BE);
        m.put(StandardCharsets.UTF_16LE.name(), StandardCharsets.UTF_16LE);
        m.put(StandardCharsets.UTF_8.name(), StandardCharsets.UTF_8);
        return Collections.unmodifiableSortedMap(m);
    }

    /**
     * Returns the given Charset or the default Charset if the given Charset is null.
     *
     * @param charset A charset or null.
     * @return the given Charset or the default Charset if the given Charset is null
     */
    public static Charset toCharset(final Charset charset) {
        return charset == null ? Charset.defaultCharset() : charset;
    }

    /**
     * Returns a Charset for the named charset. If the name is null, return the default
     * Charset.
     *
     * @param charset The name of the requested charset, may be null.
     * @return a Charset for the named charset
     * @throws java.nio.charset.UnsupportedCharsetException If the named charset is
     *                                                      unavailable
     */
    public static Charset toCharset(final String charset) {
        return charset == null ? Charset.defaultCharset() : Charset.forName(charset);
    }

    /**
     * CharEncodingISO Latin Alphabet No. 1, a.k.a. ISO-LATIN-1.
     * <p>
     * Every implementation of the Java platform is required to support this character
     * encoding.
     * </p>
     *
     * @see <a href=
     * "https://docs.oracle.com/javase/7/docs/api/java/nio/charset/Charset.html">Standard
     * charsets</a>
     * @deprecated Use Java 7's {@link StandardCharsets}
     */
    @Deprecated
    public static final Charset ISO_8859_1 = StandardCharsets.ISO_8859_1;

    /**
     * <p>
     * Seven-bit ASCII, also known as ISO646-US, also known as the Basic Latin block of
     * the Unicode character set.
     * </p>
     * <p>
     * Every implementation of the Java platform is required to support this character
     * encoding.
     * </p>
     *
     * @see <a href=
     * "https://docs.oracle.com/javase/7/docs/api/java/nio/charset/Charset.html">Standard
     * charsets</a>
     * @deprecated Use Java 7's {@link StandardCharsets}
     */
    @Deprecated
    public static final Charset US_ASCII = StandardCharsets.US_ASCII;

    /**
     * <p>
     * Sixteen-bit Unicode Transformation Format, The byte order specified by a mandatory
     * initial byte-order mark (either order accepted on input, big-endian used on output)
     * </p>
     * <p>
     * Every implementation of the Java platform is required to support this character
     * encoding.
     * </p>
     *
     * @see <a href=
     * "https://docs.oracle.com/javase/7/docs/api/java/nio/charset/Charset.html">Standard
     * charsets</a>
     * @deprecated Use Java 7's {@link StandardCharsets}
     */
    @Deprecated
    public static final Charset UTF_16 = StandardCharsets.UTF_16;

    /**
     * <p>
     * Sixteen-bit Unicode Transformation Format, big-endian byte order.
     * </p>
     * <p>
     * Every implementation of the Java platform is required to support this character
     * encoding.
     * </p>
     *
     * @see <a href=
     * "https://docs.oracle.com/javase/7/docs/api/java/nio/charset/Charset.html">Standard
     * charsets</a>
     * @deprecated Use Java 7's {@link StandardCharsets}
     */
    @Deprecated
    public static final Charset UTF_16BE = StandardCharsets.UTF_16BE;

    /**
     * <p>
     * Sixteen-bit Unicode Transformation Format, little-endian byte order.
     * </p>
     * <p>
     * Every implementation of the Java platform is required to support this character
     * encoding.
     * </p>
     *
     * @see <a href=
     * "https://docs.oracle.com/javase/7/docs/api/java/nio/charset/Charset.html">Standard
     * charsets</a>
     * @deprecated Use Java 7's {@link StandardCharsets}
     */
    @Deprecated
    public static final Charset UTF_16LE = StandardCharsets.UTF_16LE;

    /**
     * <p>
     * Eight-bit Unicode Transformation Format.
     * </p>
     * <p>
     * Every implementation of the Java platform is required to support this character
     * encoding.
     * </p>
     *
     * @see <a href=
     * "https://docs.oracle.com/javase/7/docs/api/java/nio/charset/Charset.html">Standard
     * charsets</a>
     * @deprecated Use Java 7's {@link StandardCharsets}
     */
    @Deprecated
    public static final Charset UTF_8 = StandardCharsets.UTF_8;
}
