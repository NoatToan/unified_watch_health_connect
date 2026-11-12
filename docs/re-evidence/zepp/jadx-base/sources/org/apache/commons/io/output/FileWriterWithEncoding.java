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

/* JADX INFO: loaded from: classes23.dex */
public class FileWriterWithEncoding extends Writer {
    private final Writer a;

    public FileWriterWithEncoding(String str, String str2) throws IOException {
        this(new File(str), str2, false);
    }

    private static Writer a(File file, Object obj, boolean z) throws Exception {
        Objects.requireNonNull(file, "File is missing");
        Objects.requireNonNull(obj, "Encoding is missing");
        FileOutputStream fileOutputStream = null;
        boolean zExists = file.exists();
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file, z);
            try {
                if (obj instanceof Charset) {
                    return new OutputStreamWriter(fileOutputStream2, (Charset) obj);
                }
                return obj instanceof CharsetEncoder ? new OutputStreamWriter(fileOutputStream2, (CharsetEncoder) obj) : new OutputStreamWriter(fileOutputStream2, (String) obj);
            } catch (IOException | RuntimeException e) {
                e = e;
                fileOutputStream = fileOutputStream2;
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (IOException e2) {
                        e.addSuppressed(e2);
                    }
                }
                if (zExists) {
                    throw e;
                }
                FileUtils.deleteQuietly(file);
                throw e;
            }
        } catch (IOException e3) {
            e = e3;
        } catch (RuntimeException e4) {
            e = e4;
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.a.close();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() throws IOException {
        this.a.flush();
    }

    @Override // java.io.Writer
    public void write(int i) throws IOException {
        this.a.write(i);
    }

    public FileWriterWithEncoding(String str, String str2, boolean z) throws IOException {
        this(new File(str), str2, z);
    }

    @Override // java.io.Writer
    public void write(char[] cArr) throws IOException {
        this.a.write(cArr);
    }

    public FileWriterWithEncoding(String str, Charset charset) throws IOException {
        this(new File(str), charset, false);
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) throws IOException {
        this.a.write(cArr, i, i2);
    }

    public FileWriterWithEncoding(String str, Charset charset, boolean z) throws IOException {
        this(new File(str), charset, z);
    }

    @Override // java.io.Writer
    public void write(String str) throws IOException {
        this.a.write(str);
    }

    public FileWriterWithEncoding(String str, CharsetEncoder charsetEncoder) throws IOException {
        this(new File(str), charsetEncoder, false);
    }

    @Override // java.io.Writer
    public void write(String str, int i, int i2) throws IOException {
        this.a.write(str, i, i2);
    }

    public FileWriterWithEncoding(String str, CharsetEncoder charsetEncoder, boolean z) throws IOException {
        this(new File(str), charsetEncoder, z);
    }

    public FileWriterWithEncoding(File file, String str) throws IOException {
        this(file, str, false);
    }

    public FileWriterWithEncoding(File file, String str, boolean z) throws IOException {
        this.a = a(file, str, z);
    }

    public FileWriterWithEncoding(File file, Charset charset) throws IOException {
        this(file, charset, false);
    }

    public FileWriterWithEncoding(File file, Charset charset, boolean z) throws IOException {
        this.a = a(file, charset, z);
    }

    public FileWriterWithEncoding(File file, CharsetEncoder charsetEncoder) throws IOException {
        this(file, charsetEncoder, false);
    }

    public FileWriterWithEncoding(File file, CharsetEncoder charsetEncoder, boolean z) throws IOException {
        this.a = a(file, charsetEncoder, z);
    }
}
