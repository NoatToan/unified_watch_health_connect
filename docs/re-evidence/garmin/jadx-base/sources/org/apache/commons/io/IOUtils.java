package org.apache.commons.io;

import am.j;
import ds.e0;
import fb1.c;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.CharArrayWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.HttpURLConnection;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.Selector;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import org.apache.commons.io.function.IOConsumer;
import org.apache.commons.io.output.AppendableWriter;
import org.apache.commons.io.output.ByteArrayOutputStream;
import org.apache.commons.io.output.NullOutputStream;
import org.apache.commons.io.output.StringBuilderWriter;
import org.apache.commons.lang3.e;
import tn.k;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
public class IOUtils {
    public static final int DEFAULT_BUFFER_SIZE = 8192;
    public static final char DIR_SEPARATOR_UNIX = '/';
    public static final char DIR_SEPARATOR_WINDOWS = '\\';
    public static final int EOF = -1;
    public static final String LINE_SEPARATOR_UNIX = "\n";
    public static final String LINE_SEPARATOR_WINDOWS = "\r\n";
    private static char[] SKIP_CHAR_BUFFER;
    private static final byte[] EMPTY_BYTE_ARRAY = new byte[0];
    public static final char DIR_SEPARATOR = File.separatorChar;

    @Deprecated
    public static final String LINE_SEPARATOR = System.lineSeparator();
    private static final byte[] SKIP_BYTE_BUFFER = new byte[8192];

    public static BufferedInputStream buffer(InputStream inputStream) {
        Objects.requireNonNull(inputStream, "inputStream");
        return inputStream instanceof BufferedInputStream ? (BufferedInputStream) inputStream : new BufferedInputStream(inputStream);
    }

    public static void close(Closeable... closeableArr) throws IOException {
        if (closeableArr != null) {
            for (Closeable closeable : closeableArr) {
                close(closeable);
            }
        }
    }

    @Deprecated
    public static void closeQuietly(Closeable... closeableArr) {
        if (closeableArr == null) {
            return;
        }
        for (Closeable closeable : closeableArr) {
            closeQuietly(closeable);
        }
    }

    public static long consume(InputStream inputStream) {
        return copyLarge(inputStream, NullOutputStream.NULL_OUTPUT_STREAM, SKIP_BYTE_BUFFER);
    }

    public static boolean contentEquals(InputStream inputStream, InputStream inputStream2) throws IOException {
        if (inputStream == inputStream2) {
            return true;
        }
        if ((inputStream == null) ^ (inputStream2 == null)) {
            return false;
        }
        BufferedInputStream bufferedInputStreamBuffer = buffer(inputStream);
        BufferedInputStream bufferedInputStreamBuffer2 = buffer(inputStream2);
        for (int i14 = bufferedInputStreamBuffer.read(); -1 != i14; i14 = bufferedInputStreamBuffer.read()) {
            if (i14 != bufferedInputStreamBuffer2.read()) {
                return false;
            }
        }
        return bufferedInputStreamBuffer2.read() == -1;
    }

    public static boolean contentEqualsIgnoreEOL(Reader reader, Reader reader2) throws IOException {
        if (reader == reader2) {
            return true;
        }
        if ((reader2 == null) ^ (reader == null)) {
            return false;
        }
        BufferedReader bufferedReader = toBufferedReader(reader);
        BufferedReader bufferedReader2 = toBufferedReader(reader2);
        String line = bufferedReader.readLine();
        String line2 = bufferedReader2.readLine();
        while (line != null && line.equals(line2)) {
            line = bufferedReader.readLine();
            line2 = bufferedReader2.readLine();
        }
        return Objects.equals(line, line2);
    }

    public static long copy(Reader reader, Appendable appendable, CharBuffer charBuffer) throws IOException {
        long j8 = 0;
        while (true) {
            int i14 = reader.read(charBuffer);
            if (-1 == i14) {
                return j8;
            }
            charBuffer.flip();
            appendable.append(charBuffer, 0, i14);
            j8 += (long) i14;
        }
    }

    public static long copyLarge(InputStream inputStream, OutputStream outputStream, long j8, long j14, byte[] bArr) throws IOException {
        long j15 = 0;
        if (j8 > 0) {
            skipFully(inputStream, j8);
        }
        if (j14 == 0) {
            return 0L;
        }
        int length = bArr.length;
        int iMin = (j14 <= 0 || j14 >= ((long) length)) ? length : (int) j14;
        while (iMin > 0) {
            int i14 = inputStream.read(bArr, 0, iMin);
            if (-1 == i14) {
                break;
            }
            outputStream.write(bArr, 0, i14);
            j15 += (long) i14;
            if (j14 > 0) {
                iMin = (int) Math.min(j14 - j15, length);
            }
        }
        return j15;
    }

    public static int length(CharSequence charSequence) {
        if (charSequence == null) {
            return 0;
        }
        return charSequence.length();
    }

    public static LineIterator lineIterator(InputStream inputStream, Charset charset) {
        return new LineIterator(new InputStreamReader(inputStream, Charsets.toCharset(charset)));
    }

    public static int read(InputStream inputStream, byte[] bArr, int i14, int i15) throws IOException {
        if (i15 < 0) {
            h.s(j.h(i15, "Length must not be negative: "));
            return 0;
        }
        int i16 = i15;
        while (i16 > 0) {
            int i17 = inputStream.read(bArr, (i15 - i16) + i14, i16);
            if (-1 == i17) {
                break;
            }
            i16 -= i17;
        }
        return i15 - i16;
    }

    public static void readFully(ReadableByteChannel readableByteChannel, ByteBuffer byteBuffer) throws EOFException {
        int iRemaining = byteBuffer.remaining();
        int i14 = read(readableByteChannel, byteBuffer);
        if (i14 != iRemaining) {
            throw new EOFException(k.e(iRemaining, i14, "Length to read: ", " actual: "));
        }
    }

    public static List<String> readLines(Reader reader) throws IOException {
        BufferedReader bufferedReader = toBufferedReader(reader);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                return arrayList;
            }
            arrayList.add(line);
        }
    }

    public static byte[] resourceToByteArray(String str, ClassLoader classLoader) {
        return toByteArray(resourceToURL(str, classLoader));
    }

    public static String resourceToString(String str, Charset charset, ClassLoader classLoader) {
        return toString(resourceToURL(str, classLoader), charset);
    }

    public static URL resourceToURL(String str, ClassLoader classLoader) throws IOException {
        URL resource = classLoader == null ? IOUtils.class.getResource(str) : classLoader.getResource(str);
        if (resource != null) {
            return resource;
        }
        h.C(c.n("Resource not found: ", str));
        return null;
    }

    public static long skip(ReadableByteChannel readableByteChannel, long j8) throws IOException {
        if (j8 < 0) {
            h.s(e.e(j8, "Skip count must be non-negative, actual: "));
            return 0L;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate((int) Math.min(j8, SKIP_BYTE_BUFFER.length));
        long j14 = j8;
        while (j14 > 0) {
            byteBufferAllocate.position(0);
            byteBufferAllocate.limit((int) Math.min(j14, SKIP_BYTE_BUFFER.length));
            int i14 = readableByteChannel.read(byteBufferAllocate);
            if (i14 == -1) {
                break;
            }
            j14 -= (long) i14;
        }
        return j8 - j14;
    }

    public static void skipFully(InputStream inputStream, long j8) throws EOFException {
        if (j8 < 0) {
            h.s(e.e(j8, "Bytes to skip must not be negative: "));
            return;
        }
        long jSkip = skip(inputStream, j8);
        if (jSkip == j8) {
            return;
        }
        StringBuilder sbK = e0.k(j8, "Bytes to skip: ", " actual: ");
        sbK.append(jSkip);
        throw new EOFException(sbK.toString());
    }

    public static InputStream toBufferedInputStream(InputStream inputStream) {
        return ByteArrayOutputStream.toBufferedInputStream(inputStream);
    }

    public static BufferedReader toBufferedReader(Reader reader) {
        return reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader);
    }

    public static byte[] toByteArray(InputStream inputStream, int i14) throws IOException {
        if (i14 < 0) {
            h.s(j.h(i14, "Size must be equal or greater than zero: "));
            return null;
        }
        if (i14 == 0) {
            return EMPTY_BYTE_ARRAY;
        }
        byte[] bArr = new byte[i14];
        int i15 = 0;
        while (i15 < i14) {
            int i16 = inputStream.read(bArr, i15, i14 - i15);
            if (i16 == -1) {
                break;
            }
            i15 += i16;
        }
        if (i15 == i14) {
            return bArr;
        }
        h.C(k.e(i15, i14, "Unexpected read size. current: ", ", expected: "));
        return null;
    }

    public static char[] toCharArray(InputStream inputStream, Charset charset) {
        CharArrayWriter charArrayWriter = new CharArrayWriter();
        copy(inputStream, charArrayWriter, charset);
        return charArrayWriter.toCharArray();
    }

    public static InputStream toInputStream(String str, Charset charset) {
        return new ByteArrayInputStream(str.getBytes(Charsets.toCharset(charset)));
    }

    public static String toString(InputStream inputStream, Charset charset) {
        StringBuilderWriter stringBuilderWriter = new StringBuilderWriter();
        try {
            copy(inputStream, stringBuilderWriter, charset);
            String string = stringBuilderWriter.toString();
            stringBuilderWriter.close();
            return string;
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                try {
                    stringBuilderWriter.close();
                } catch (Throwable th5) {
                    th3.addSuppressed(th5);
                }
                throw th4;
            }
        }
    }

    public static void write(char[] cArr, OutputStream outputStream, Charset charset) throws IOException {
        if (cArr != null) {
            outputStream.write(new String(cArr).getBytes(Charsets.toCharset(charset)));
        }
    }

    public static void writeChunked(byte[] bArr, OutputStream outputStream) throws IOException {
        if (bArr != null) {
            int length = bArr.length;
            int i14 = 0;
            while (length > 0) {
                int iMin = Math.min(length, 8192);
                outputStream.write(bArr, i14, iMin);
                length -= iMin;
                i14 += iMin;
            }
        }
    }

    public static void writeLines(Collection<?> collection, String str, OutputStream outputStream, Charset charset) throws IOException {
        if (collection == null) {
            return;
        }
        if (str == null) {
            str = System.lineSeparator();
        }
        Charset charset2 = Charsets.toCharset(charset);
        for (Object obj : collection) {
            if (obj != null) {
                outputStream.write(obj.toString().getBytes(charset2));
            }
            outputStream.write(str.getBytes(charset2));
        }
    }

    public static Writer writer(Appendable appendable) {
        Objects.requireNonNull(appendable, "appendable");
        if (appendable instanceof Writer) {
            return (Writer) appendable;
        }
        return appendable instanceof StringBuilder ? new StringBuilderWriter((StringBuilder) appendable) : new AppendableWriter(appendable);
    }

    public static InputStream toBufferedInputStream(InputStream inputStream, int i14) {
        return ByteArrayOutputStream.toBufferedInputStream(inputStream, i14);
    }

    public static int length(char[] cArr) {
        if (cArr == null) {
            return 0;
        }
        return cArr.length;
    }

    public static byte[] resourceToByteArray(String str) {
        return resourceToByteArray(str, null);
    }

    public static String resourceToString(String str, Charset charset) {
        return resourceToString(str, charset, null);
    }

    public static int length(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        return bArr.length;
    }

    public static int length(Object[] objArr) {
        if (objArr == null) {
            return 0;
        }
        return objArr.length;
    }

    public static BufferedReader toBufferedReader(Reader reader, int i14) {
        return reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader, i14);
    }

    @Deprecated
    public static char[] toCharArray(InputStream inputStream) {
        return toCharArray(inputStream, Charset.defaultCharset());
    }

    public static char[] toCharArray(InputStream inputStream, String str) {
        return toCharArray(inputStream, Charsets.toCharset(str));
    }

    public static InputStream toInputStream(CharSequence charSequence, Charset charset) {
        return toInputStream(charSequence.toString(), charset);
    }

    public static void close(Closeable closeable) throws IOException {
        if (closeable != null) {
            closeable.close();
        }
    }

    public static LineIterator lineIterator(InputStream inputStream, String str) {
        return lineIterator(inputStream, Charsets.toCharset(str));
    }

    public static char[] toCharArray(Reader reader) {
        CharArrayWriter charArrayWriter = new CharArrayWriter();
        copy(reader, (Writer) charArrayWriter);
        return charArrayWriter.toCharArray();
    }

    public static InputStream toInputStream(CharSequence charSequence, String str) {
        return toInputStream(charSequence, Charsets.toCharset(str));
    }

    public static void close(Closeable closeable, IOConsumer<IOException> iOConsumer) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e4) {
                if (iOConsumer != null) {
                    iOConsumer.accept(e4);
                }
            }
        }
    }

    @Deprecated
    public static void closeQuietly(Closeable closeable) {
        closeQuietly(closeable, null);
    }

    public static LineIterator lineIterator(Reader reader) {
        return new LineIterator(reader);
    }

    @Deprecated
    public static InputStream toInputStream(String str) {
        return toInputStream(str, Charset.defaultCharset());
    }

    public static void closeQuietly(Closeable closeable, Consumer<IOException> consumer) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e4) {
                if (consumer != null) {
                    consumer.accept(e4);
                }
            }
        }
    }

    @Deprecated
    public static InputStream toInputStream(CharSequence charSequence) {
        return toInputStream(charSequence, Charset.defaultCharset());
    }

    public static BufferedInputStream buffer(InputStream inputStream, int i14) {
        Objects.requireNonNull(inputStream, "inputStream");
        return inputStream instanceof BufferedInputStream ? (BufferedInputStream) inputStream : new BufferedInputStream(inputStream, i14);
    }

    public static void close(URLConnection uRLConnection) {
        if (uRLConnection instanceof HttpURLConnection) {
            ((HttpURLConnection) uRLConnection).disconnect();
        }
    }

    public static InputStream toInputStream(String str, String str2) {
        return new ByteArrayInputStream(str.getBytes(Charsets.toCharset(str2)));
    }

    @Deprecated
    public static void closeQuietly(InputStream inputStream) {
        closeQuietly((Closeable) inputStream);
    }

    @Deprecated
    public static void write(byte[] bArr, Writer writer) throws IOException {
        write(bArr, writer, Charset.defaultCharset());
    }

    public static void writeChunked(char[] cArr, Writer writer) throws IOException {
        if (cArr != null) {
            int length = cArr.length;
            int i14 = 0;
            while (length > 0) {
                int iMin = Math.min(length, 8192);
                writer.write(cArr, i14, iMin);
                length -= iMin;
                i14 += iMin;
            }
        }
    }

    public static BufferedOutputStream buffer(OutputStream outputStream) {
        Objects.requireNonNull(outputStream, "outputStream");
        return outputStream instanceof BufferedOutputStream ? (BufferedOutputStream) outputStream : new BufferedOutputStream(outputStream);
    }

    @Deprecated
    public static void closeQuietly(OutputStream outputStream) {
        closeQuietly((Closeable) outputStream);
    }

    public static long copy(InputStream inputStream, OutputStream outputStream, int i14) {
        return copyLarge(inputStream, outputStream, new byte[i14]);
    }

    public static List<String> readLines(InputStream inputStream, Charset charset) {
        return readLines(new InputStreamReader(inputStream, Charsets.toCharset(charset)));
    }

    public static void write(byte[] bArr, Writer writer, Charset charset) throws IOException {
        if (bArr != null) {
            writer.write(new String(bArr, Charsets.toCharset(charset)));
        }
    }

    @Deprecated
    public static void closeQuietly(Reader reader) {
        closeQuietly((Closeable) reader);
    }

    @Deprecated
    public static void copy(InputStream inputStream, Writer writer) {
        copy(inputStream, writer, Charset.defaultCharset());
    }

    public static void write(byte[] bArr, Writer writer, String str) throws IOException {
        write(bArr, writer, Charsets.toCharset(str));
    }

    public static BufferedOutputStream buffer(OutputStream outputStream, int i14) {
        Objects.requireNonNull(outputStream, "outputStream");
        return outputStream instanceof BufferedOutputStream ? (BufferedOutputStream) outputStream : new BufferedOutputStream(outputStream, i14);
    }

    @Deprecated
    public static void closeQuietly(Selector selector) {
        closeQuietly((Closeable) selector);
    }

    public static void copy(InputStream inputStream, Writer writer, Charset charset) {
        copy((Reader) new InputStreamReader(inputStream, Charsets.toCharset(charset)), writer);
    }

    public static List<String> readLines(InputStream inputStream, String str) {
        return readLines(inputStream, Charsets.toCharset(str));
    }

    @Deprecated
    public static void write(char[] cArr, OutputStream outputStream) throws IOException {
        write(cArr, outputStream, Charset.defaultCharset());
    }

    @Deprecated
    public static void closeQuietly(ServerSocket serverSocket) {
        closeQuietly((Closeable) serverSocket);
    }

    @Deprecated
    public static List<String> readLines(InputStream inputStream) {
        return readLines(inputStream, Charset.defaultCharset());
    }

    public static void write(byte[] bArr, OutputStream outputStream) throws IOException {
        if (bArr != null) {
            outputStream.write(bArr);
        }
    }

    public static BufferedReader buffer(Reader reader) {
        return reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader);
    }

    @Deprecated
    public static void closeQuietly(Socket socket) {
        closeQuietly((Closeable) socket);
    }

    public static void copy(InputStream inputStream, Writer writer, String str) {
        copy(inputStream, writer, Charsets.toCharset(str));
    }

    public static void write(char[] cArr, OutputStream outputStream, String str) throws IOException {
        write(cArr, outputStream, Charsets.toCharset(str));
    }

    public static BufferedReader buffer(Reader reader, int i14) {
        return reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader, i14);
    }

    @Deprecated
    public static void closeQuietly(Writer writer) {
        closeQuietly((Closeable) writer);
    }

    public static long copy(Reader reader, Appendable appendable) {
        return copy(reader, appendable, CharBuffer.allocate(8192));
    }

    public static void readFully(InputStream inputStream, byte[] bArr, int i14, int i15) throws IOException {
        int i16 = read(inputStream, bArr, i14, i15);
        if (i16 != i15) {
            throw new EOFException(k.e(i15, i16, "Length to read: ", " actual: "));
        }
    }

    public static void write(char[] cArr, Writer writer) throws IOException {
        if (cArr != null) {
            writer.write(cArr);
        }
    }

    public static BufferedWriter buffer(Writer writer) {
        return writer instanceof BufferedWriter ? (BufferedWriter) writer : new BufferedWriter(writer);
    }

    public static int copy(InputStream inputStream, OutputStream outputStream) {
        long jCopyLarge = copyLarge(inputStream, outputStream);
        if (jCopyLarge > 2147483647L) {
            return -1;
        }
        return (int) jCopyLarge;
    }

    @Deprecated
    public static void write(CharSequence charSequence, OutputStream outputStream) throws IOException {
        write(charSequence, outputStream, Charset.defaultCharset());
    }

    public static BufferedWriter buffer(Writer writer, int i14) {
        return writer instanceof BufferedWriter ? (BufferedWriter) writer : new BufferedWriter(writer, i14);
    }

    @Deprecated
    public static void copy(Reader reader, OutputStream outputStream) throws IOException {
        copy(reader, outputStream, Charset.defaultCharset());
    }

    public static URL resourceToURL(String str) {
        return resourceToURL(str, null);
    }

    public static void write(CharSequence charSequence, OutputStream outputStream, Charset charset) throws IOException {
        if (charSequence != null) {
            write(charSequence.toString(), outputStream, charset);
        }
    }

    public static void copy(Reader reader, OutputStream outputStream, Charset charset) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, Charsets.toCharset(charset));
        copy(reader, (Writer) outputStreamWriter);
        outputStreamWriter.flush();
    }

    public static String toString(byte[] bArr, String str) {
        return new String(bArr, Charsets.toCharset(str));
    }

    public static void write(CharSequence charSequence, OutputStream outputStream, String str) throws IOException {
        write(charSequence, outputStream, Charsets.toCharset(str));
    }

    public static byte[] readFully(InputStream inputStream, int i14) throws IOException {
        byte[] bArr = new byte[i14];
        readFully(inputStream, bArr, 0, i14);
        return bArr;
    }

    @Deprecated
    public static String toString(InputStream inputStream) {
        return toString(inputStream, Charset.defaultCharset());
    }

    public static void write(CharSequence charSequence, Writer writer) throws IOException {
        if (charSequence != null) {
            write(charSequence.toString(), writer);
        }
    }

    @Deprecated
    public static String toString(byte[] bArr) {
        return new String(bArr, Charset.defaultCharset());
    }

    @Deprecated
    public static void write(String str, OutputStream outputStream) throws IOException {
        write(str, outputStream, Charset.defaultCharset());
    }

    public static void copy(Reader reader, OutputStream outputStream, String str) throws IOException {
        copy(reader, outputStream, Charsets.toCharset(str));
    }

    public static int read(InputStream inputStream, byte[] bArr) {
        return read(inputStream, bArr, 0, bArr.length);
    }

    public static void readFully(InputStream inputStream, byte[] bArr) throws IOException {
        readFully(inputStream, bArr, 0, bArr.length);
    }

    public static String toString(InputStream inputStream, String str) {
        return toString(inputStream, Charsets.toCharset(str));
    }

    public static void write(String str, OutputStream outputStream, Charset charset) throws IOException {
        if (str != null) {
            outputStream.write(str.getBytes(Charsets.toCharset(charset)));
        }
    }

    public static int copy(Reader reader, Writer writer) {
        long jCopyLarge = copyLarge(reader, writer);
        if (jCopyLarge > 2147483647L) {
            return -1;
        }
        return (int) jCopyLarge;
    }

    public static int read(ReadableByteChannel readableByteChannel, ByteBuffer byteBuffer) {
        int iRemaining = byteBuffer.remaining();
        while (byteBuffer.remaining() > 0 && -1 != readableByteChannel.read(byteBuffer)) {
        }
        return iRemaining - byteBuffer.remaining();
    }

    public static void readFully(Reader reader, char[] cArr) throws IOException {
        readFully(reader, cArr, 0, cArr.length);
    }

    public static String toString(Reader reader) {
        StringBuilderWriter stringBuilderWriter = new StringBuilderWriter();
        try {
            copy(reader, (Writer) stringBuilderWriter);
            String string = stringBuilderWriter.toString();
            stringBuilderWriter.close();
            return string;
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                try {
                    stringBuilderWriter.close();
                } catch (Throwable th5) {
                    th3.addSuppressed(th5);
                }
                throw th4;
            }
        }
    }

    public static void write(String str, OutputStream outputStream, String str2) throws IOException {
        write(str, outputStream, Charsets.toCharset(str2));
    }

    public static void readFully(Reader reader, char[] cArr, int i14, int i15) throws IOException {
        int i16 = read(reader, cArr, i14, i15);
        if (i16 != i15) {
            throw new EOFException(k.e(i15, i16, "Length to read: ", " actual: "));
        }
    }

    public static void write(String str, Writer writer) throws IOException {
        if (str != null) {
            writer.write(str);
        }
    }

    @Deprecated
    public static void write(StringBuffer stringBuffer, OutputStream outputStream) throws IOException {
        write(stringBuffer, outputStream, (String) null);
    }

    @Deprecated
    public static void write(StringBuffer stringBuffer, OutputStream outputStream, String str) throws IOException {
        if (stringBuffer != null) {
            outputStream.write(stringBuffer.toString().getBytes(Charsets.toCharset(str)));
        }
    }

    public static int read(Reader reader, char[] cArr) {
        return read(reader, cArr, 0, cArr.length);
    }

    @Deprecated
    public static void write(StringBuffer stringBuffer, Writer writer) throws IOException {
        if (stringBuffer != null) {
            writer.write(stringBuffer.toString());
        }
    }

    public static int read(Reader reader, char[] cArr, int i14, int i15) throws IOException {
        if (i15 < 0) {
            h.s(j.h(i15, "Length must not be negative: "));
            return 0;
        }
        int i16 = i15;
        while (i16 > 0) {
            int i17 = reader.read(cArr, (i15 - i16) + i14, i16);
            if (-1 == i17) {
                break;
            }
            i16 -= i17;
        }
        return i15 - i16;
    }

    @Deprecated
    public static String toString(URI uri) {
        return toString(uri, Charset.defaultCharset());
    }

    public static String toString(URI uri, Charset charset) {
        return toString(uri.toURL(), Charsets.toCharset(charset));
    }

    public static String toString(URI uri, String str) {
        return toString(uri, Charsets.toCharset(str));
    }

    @Deprecated
    public static String toString(URL url) {
        return toString(url, Charset.defaultCharset());
    }

    public static String toString(URL url, Charset charset) throws IOException {
        InputStream inputStreamOpenStream = url.openStream();
        try {
            String string = toString(inputStreamOpenStream, charset);
            if (inputStreamOpenStream != null) {
                inputStreamOpenStream.close();
            }
            return string;
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                if (inputStreamOpenStream != null) {
                    try {
                        inputStreamOpenStream.close();
                    } catch (Throwable th5) {
                        th3.addSuppressed(th5);
                    }
                }
                throw th4;
            }
        }
    }

    public static void skipFully(ReadableByteChannel readableByteChannel, long j8) throws IOException {
        if (j8 >= 0) {
            long jSkip = skip(readableByteChannel, j8);
            if (jSkip == j8) {
                return;
            }
            StringBuilder sbK = e0.k(j8, "Bytes to skip: ", " actual: ");
            sbK.append(jSkip);
            throw new EOFException(sbK.toString());
        }
        h.s(e.e(j8, "Bytes to skip must not be negative: "));
    }

    public static String toString(URL url, String str) {
        return toString(url, Charsets.toCharset(str));
    }

    public static byte[] toByteArray(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            copy(inputStream, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th5) {
                    th3.addSuppressed(th5);
                }
                throw th4;
            }
        }
    }

    @Deprecated
    public static void writeLines(Collection<?> collection, String str, OutputStream outputStream) throws IOException {
        writeLines(collection, str, outputStream, Charset.defaultCharset());
    }

    public static void writeLines(Collection<?> collection, String str, OutputStream outputStream, String str2) throws IOException {
        writeLines(collection, str, outputStream, Charsets.toCharset(str2));
    }

    public static void writeLines(Collection<?> collection, String str, Writer writer) throws IOException {
        if (collection == null) {
            return;
        }
        if (str == null) {
            str = System.lineSeparator();
        }
        for (Object obj : collection) {
            if (obj != null) {
                writer.write(obj.toString());
            }
            writer.write(str);
        }
    }

    public static long copyLarge(InputStream inputStream, OutputStream outputStream, byte[] bArr) throws IOException {
        long j8 = 0;
        if (inputStream != null) {
            while (true) {
                int i14 = inputStream.read(bArr);
                if (-1 == i14) {
                    break;
                }
                outputStream.write(bArr, 0, i14);
                j8 += (long) i14;
            }
        }
        return j8;
    }

    public static void skipFully(Reader reader, long j8) throws EOFException {
        long jSkip = skip(reader, j8);
        if (jSkip == j8) {
            return;
        }
        StringBuilder sbK = e0.k(j8, "Chars to skip: ", " actual: ");
        sbK.append(jSkip);
        throw new EOFException(sbK.toString());
    }

    public static boolean contentEquals(Reader reader, Reader reader2) throws IOException {
        if (reader == reader2) {
            return true;
        }
        if ((reader == null) ^ (reader2 == null)) {
            return false;
        }
        BufferedReader bufferedReader = toBufferedReader(reader);
        BufferedReader bufferedReader2 = toBufferedReader(reader2);
        for (int i14 = bufferedReader.read(); -1 != i14; i14 = bufferedReader.read()) {
            if (i14 != bufferedReader2.read()) {
                return false;
            }
        }
        return bufferedReader2.read() == -1;
    }

    public static long copyLarge(InputStream inputStream, OutputStream outputStream, long j8, long j14) {
        return copyLarge(inputStream, outputStream, j8, j14, new byte[8192]);
    }

    public static long copyLarge(InputStream inputStream, OutputStream outputStream) {
        return copy(inputStream, outputStream, 8192);
    }

    public static byte[] toByteArray(InputStream inputStream, long j8) {
        if (j8 <= 2147483647L) {
            return toByteArray(inputStream, (int) j8);
        }
        h.s(e.e(j8, "Size cannot be greater than Integer max value: "));
        return null;
    }

    public static long copyLarge(Reader reader, Writer writer) {
        return copyLarge(reader, writer, new char[8192]);
    }

    public static long copyLarge(Reader reader, Writer writer, char[] cArr) throws IOException {
        long j8 = 0;
        while (true) {
            int i14 = reader.read(cArr);
            if (-1 == i14) {
                return j8;
            }
            writer.write(cArr, 0, i14);
            j8 += (long) i14;
        }
    }

    public static long copyLarge(Reader reader, Writer writer, long j8, long j14) {
        return copyLarge(reader, writer, j8, j14, new char[8192]);
    }

    @Deprecated
    public static byte[] toByteArray(Reader reader) {
        return toByteArray(reader, Charset.defaultCharset());
    }

    public static long copyLarge(Reader reader, Writer writer, long j8, long j14, char[] cArr) throws IOException {
        long j15 = 0;
        if (j8 > 0) {
            skipFully(reader, j8);
        }
        if (j14 == 0) {
            return 0L;
        }
        int length = cArr.length;
        if (j14 > 0 && j14 < cArr.length) {
            length = (int) j14;
        }
        while (length > 0) {
            int i14 = reader.read(cArr, 0, length);
            if (-1 == i14) {
                break;
            }
            writer.write(cArr, 0, i14);
            j15 += (long) i14;
            if (j14 > 0) {
                length = (int) Math.min(j14 - j15, cArr.length);
            }
        }
        return j15;
    }

    public static byte[] toByteArray(Reader reader, Charset charset) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            copy(reader, byteArrayOutputStream, charset);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th5) {
                    th3.addSuppressed(th5);
                }
                throw th4;
            }
        }
    }

    public static long skip(InputStream inputStream, long j8) {
        if (j8 < 0) {
            h.s(e.e(j8, "Skip count must be non-negative, actual: "));
            return 0L;
        }
        long j14 = j8;
        while (j14 > 0) {
            byte[] bArr = SKIP_BYTE_BUFFER;
            long j15 = inputStream.read(bArr, 0, (int) Math.min(j14, bArr.length));
            if (j15 < 0) {
                break;
            }
            j14 -= j15;
        }
        return j8 - j14;
    }

    public static byte[] toByteArray(Reader reader, String str) {
        return toByteArray(reader, Charsets.toCharset(str));
    }

    @Deprecated
    public static byte[] toByteArray(String str) {
        return str.getBytes(Charset.defaultCharset());
    }

    public static byte[] toByteArray(URI uri) {
        return toByteArray(uri.toURL());
    }

    public static long skip(Reader reader, long j8) {
        if (j8 >= 0) {
            if (SKIP_CHAR_BUFFER == null) {
                SKIP_CHAR_BUFFER = new char[SKIP_BYTE_BUFFER.length];
            }
            long j14 = j8;
            while (j14 > 0) {
                long j15 = reader.read(SKIP_CHAR_BUFFER, 0, (int) Math.min(j14, SKIP_BYTE_BUFFER.length));
                if (j15 < 0) {
                    break;
                }
                j14 -= j15;
            }
            return j8 - j14;
        }
        h.s(e.e(j8, "Skip count must be non-negative, actual: "));
        return 0L;
    }

    public static byte[] toByteArray(URL url) throws IOException {
        URLConnection uRLConnectionOpenConnection = url.openConnection();
        try {
            return toByteArray(uRLConnectionOpenConnection);
        } finally {
            close(uRLConnectionOpenConnection);
        }
    }

    public static byte[] toByteArray(URLConnection uRLConnection) throws IOException {
        InputStream inputStream = uRLConnection.getInputStream();
        try {
            byte[] byteArray = toByteArray(inputStream);
            if (inputStream != null) {
                inputStream.close();
            }
            return byteArray;
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Throwable th5) {
                        th3.addSuppressed(th5);
                    }
                }
                throw th4;
            }
        }
    }
}
