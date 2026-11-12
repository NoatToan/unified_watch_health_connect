package org.apache.commons.io.output;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

/* JADX INFO: loaded from: classes23.dex */
public class DeferredFileOutputStream extends ThresholdingOutputStream {
    private ByteArrayOutputStream d;
    private OutputStream e;
    private File f;
    private final String g;
    private final String h;
    private final File i;
    private boolean j;

    public DeferredFileOutputStream(int i, File file) {
        this(i, file, null, null, null, 1024);
    }

    @Override // org.apache.commons.io.output.ThresholdingOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        super.close();
        this.j = true;
    }

    public byte[] getData() {
        ByteArrayOutputStream byteArrayOutputStream = this.d;
        if (byteArrayOutputStream != null) {
            return byteArrayOutputStream.toByteArray();
        }
        return null;
    }

    public File getFile() {
        return this.f;
    }

    @Override // org.apache.commons.io.output.ThresholdingOutputStream
    public OutputStream getStream() throws IOException {
        return this.e;
    }

    public boolean isInMemory() {
        return !isThresholdExceeded();
    }

    @Override // org.apache.commons.io.output.ThresholdingOutputStream
    public void thresholdReached() throws IOException {
        String str = this.g;
        if (str != null) {
            this.f = File.createTempFile(str, this.h, this.i);
        }
        FileUtils.forceMkdirParent(this.f);
        FileOutputStream fileOutputStream = new FileOutputStream(this.f);
        try {
            this.d.writeTo(fileOutputStream);
            this.e = fileOutputStream;
            this.d = null;
        } catch (IOException e) {
            fileOutputStream.close();
            throw e;
        }
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        if (!this.j) {
            throw new IOException("Stream not closed");
        }
        if (isInMemory()) {
            this.d.writeTo(outputStream);
            return;
        }
        FileInputStream fileInputStream = new FileInputStream(this.f);
        try {
            IOUtils.copy(fileInputStream, outputStream);
            fileInputStream.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    fileInputStream.close();
                } catch (Throwable th3) {
                    th.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    public DeferredFileOutputStream(int i, int i2, File file) {
        this(i, file, null, null, null, i2);
        if (i2 < 0) {
            throw new IllegalArgumentException("Initial buffer size must be atleast 0.");
        }
    }

    public DeferredFileOutputStream(int i, String str, String str2, File file) {
        this(i, null, str, str2, file, 1024);
        if (str == null) {
            throw new IllegalArgumentException("Temporary file prefix is missing");
        }
    }

    public DeferredFileOutputStream(int i, int i2, String str, String str2, File file) {
        this(i, null, str, str2, file, i2);
        if (str == null) {
            throw new IllegalArgumentException("Temporary file prefix is missing");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("Initial buffer size must be atleast 0.");
        }
    }

    private DeferredFileOutputStream(int i, File file, String str, String str2, File file2, int i2) {
        super(i);
        this.j = false;
        this.f = file;
        this.g = str;
        this.h = str2;
        this.i = file2;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i2);
        this.d = byteArrayOutputStream;
        this.e = byteArrayOutputStream;
    }
}
