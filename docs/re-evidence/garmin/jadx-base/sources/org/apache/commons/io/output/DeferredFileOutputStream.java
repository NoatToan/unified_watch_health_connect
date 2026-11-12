package org.apache.commons.io.output;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
public class DeferredFileOutputStream extends ThresholdingOutputStream {
    private boolean closed;
    private OutputStream currentOutputStream;
    private final File directory;
    private ByteArrayOutputStream memoryOutputStream;
    private File outputFile;
    private final String prefix;
    private final String suffix;

    public DeferredFileOutputStream(int i14, int i15, String str, String str2, File file) {
        this(i14, null, str, str2, file, i15);
        if (str == null) {
            h.s("Temporary file prefix is missing");
            throw null;
        }
        if (i15 >= 0) {
            return;
        }
        h.s("Initial buffer size must be atleast 0.");
        throw null;
    }

    @Override // org.apache.commons.io.output.ThresholdingOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        super.close();
        this.closed = true;
    }

    public byte[] getData() {
        ByteArrayOutputStream byteArrayOutputStream = this.memoryOutputStream;
        if (byteArrayOutputStream != null) {
            return byteArrayOutputStream.toByteArray();
        }
        return null;
    }

    public File getFile() {
        return this.outputFile;
    }

    @Override // org.apache.commons.io.output.ThresholdingOutputStream
    public OutputStream getStream() {
        return this.currentOutputStream;
    }

    public boolean isInMemory() {
        return !isThresholdExceeded();
    }

    @Override // org.apache.commons.io.output.ThresholdingOutputStream
    public void thresholdReached() throws IOException {
        String str = this.prefix;
        if (str != null) {
            this.outputFile = File.createTempFile(str, this.suffix, this.directory);
        }
        FileUtils.forceMkdirParent(this.outputFile);
        FileOutputStream fileOutputStream = new FileOutputStream(this.outputFile);
        try {
            this.memoryOutputStream.writeTo(fileOutputStream);
            this.currentOutputStream = fileOutputStream;
            this.memoryOutputStream = null;
        } catch (IOException e4) {
            fileOutputStream.close();
            throw e4;
        }
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        if (!this.closed) {
            h.C("Stream not closed");
            return;
        }
        if (isInMemory()) {
            this.memoryOutputStream.writeTo(outputStream);
            return;
        }
        FileInputStream fileInputStream = new FileInputStream(this.outputFile);
        try {
            IOUtils.copy(fileInputStream, outputStream);
            fileInputStream.close();
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                try {
                    fileInputStream.close();
                } catch (Throwable th5) {
                    th3.addSuppressed(th5);
                }
                throw th4;
            }
        }
    }

    public DeferredFileOutputStream(int i14, int i15, File file) {
        this(i14, file, null, null, null, i15);
        if (i15 >= 0) {
            return;
        }
        h.s("Initial buffer size must be atleast 0.");
        throw null;
    }

    public DeferredFileOutputStream(int i14, String str, String str2, File file) {
        this(i14, null, str, str2, file, 1024);
        if (str != null) {
            return;
        }
        h.s("Temporary file prefix is missing");
        throw null;
    }

    public DeferredFileOutputStream(int i14, File file) {
        this(i14, file, null, null, null, 1024);
    }

    private DeferredFileOutputStream(int i14, File file, String str, String str2, File file2, int i15) {
        super(i14);
        this.closed = false;
        this.outputFile = file;
        this.prefix = str;
        this.suffix = str2;
        this.directory = file2;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i15);
        this.memoryOutputStream = byteArrayOutputStream;
        this.currentOutputStream = byteArrayOutputStream;
    }
}
