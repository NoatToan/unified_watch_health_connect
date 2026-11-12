package org.apache.commons.io.output;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.Objects;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

/* JADX INFO: loaded from: classes3.dex */
public class FileWriterWithEncoding extends Writer {
    private final Writer out;

    public FileWriterWithEncoding(String str, String str2) {
        this(new File(str), str2, false);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0046  */
    /* JADX WARN: Code duplicated, block: B:33:? A[SYNTHETIC] */
    private static Writer initWriter(File file, Object obj, boolean z14) throws Throwable {
        Objects.requireNonNull(file, "file");
        Objects.requireNonNull(obj, "encoding");
        boolean zExists = file.exists();
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file, z14);
            try {
                if (obj instanceof Charset) {
                    return new OutputStreamWriter(fileOutputStream2, (Charset) obj);
                }
                return obj instanceof CharsetEncoder ? new OutputStreamWriter(fileOutputStream2, (CharsetEncoder) obj) : new OutputStreamWriter(fileOutputStream2, (String) obj);
            } catch (IOException e4) {
                e = e4;
                fileOutputStream = fileOutputStream2;
                try {
                    IOUtils.close(fileOutputStream);
                } catch (IOException e14) {
                    e.addSuppressed(e14);
                }
                if (!zExists) {
                    throw e;
                }
                FileUtils.deleteQuietly(file);
                throw e;
            } catch (RuntimeException e15) {
                e = e15;
                fileOutputStream = fileOutputStream2;
                IOUtils.close(fileOutputStream);
                if (!zExists) {
                    throw e;
                }
                FileUtils.deleteQuietly(file);
                throw e;
            }
        } catch (IOException e16) {
            e = e16;
        } catch (RuntimeException e17) {
            e = e17;
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.out.close();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() throws IOException {
        this.out.flush();
    }

    @Override // java.io.Writer
    public void write(int i14) throws IOException {
        this.out.write(i14);
    }

    @Override // java.io.Writer
    public void write(char[] cArr) throws IOException {
        this.out.write(cArr);
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i14, int i15) throws IOException {
        this.out.write(cArr, i14, i15);
    }

    @Override // java.io.Writer
    public void write(String str) throws IOException {
        this.out.write(str);
    }

    @Override // java.io.Writer
    public void write(String str, int i14, int i15) throws IOException {
        this.out.write(str, i14, i15);
    }

    public FileWriterWithEncoding(String str, String str2, boolean z14) {
        this(new File(str), str2, z14);
    }

    public FileWriterWithEncoding(String str, Charset charset) {
        this(new File(str), charset, false);
    }

    public FileWriterWithEncoding(String str, Charset charset, boolean z14) {
        this(new File(str), charset, z14);
    }

    public FileWriterWithEncoding(String str, CharsetEncoder charsetEncoder) {
        this(new File(str), charsetEncoder, false);
    }

    public FileWriterWithEncoding(String str, CharsetEncoder charsetEncoder, boolean z14) {
        this(new File(str), charsetEncoder, z14);
    }

    public FileWriterWithEncoding(File file, String str) {
        this(file, str, false);
    }

    public FileWriterWithEncoding(File file, String str, boolean z14) {
        this.out = initWriter(file, str, z14);
    }

    public FileWriterWithEncoding(File file, Charset charset) {
        this(file, charset, false);
    }

    public FileWriterWithEncoding(File file, Charset charset, boolean z14) {
        this.out = initWriter(file, charset, z14);
    }

    public FileWriterWithEncoding(File file, CharsetEncoder charsetEncoder) {
        this(file, charsetEncoder, false);
    }

    public FileWriterWithEncoding(File file, CharsetEncoder charsetEncoder, boolean z14) {
        this.out = initWriter(file, charsetEncoder, z14);
    }
}
