package org.apache.commons.io.output;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import o2.c;
import org.apache.commons.io.Charsets;
import org.apache.commons.io.FileUtils;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
public class LockableFileWriter extends Writer {
    private static final String LCK = ".lck";
    private final File lockFile;
    private final Writer out;

    public LockableFileWriter(File file, Charset charset, boolean z14, String str) throws IOException {
        File absoluteFile = file.getAbsoluteFile();
        if (absoluteFile.getParentFile() != null) {
            FileUtils.forceMkdir(absoluteFile.getParentFile());
        }
        if (absoluteFile.isDirectory()) {
            h.C("File specified is a directory");
            throw null;
        }
        File file2 = new File(str == null ? System.getProperty("java.io.tmpdir") : str);
        FileUtils.forceMkdir(file2);
        testLockDir(file2);
        this.lockFile = new File(file2, absoluteFile.getName() + LCK);
        createLock();
        this.out = initWriter(absoluteFile, charset, z14);
    }

    private void createLock() {
        synchronized (LockableFileWriter.class) {
            try {
                if (!this.lockFile.createNewFile()) {
                    throw new IOException("Can't write file, lock " + this.lockFile.getAbsolutePath() + " exists");
                }
                this.lockFile.deleteOnExit();
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    private Writer initWriter(File file, Charset charset, boolean z14) {
        boolean zExists = file.exists();
        try {
            return new OutputStreamWriter(new FileOutputStream(file.getAbsolutePath(), z14), Charsets.toCharset(charset));
        } catch (IOException | RuntimeException e4) {
            FileUtils.deleteQuietly(this.lockFile);
            if (!zExists) {
                FileUtils.deleteQuietly(file);
            }
            throw e4;
        }
    }

    private void testLockDir(File file) throws IOException {
        if (!file.exists()) {
            c.u(file.getAbsolutePath(), "Could not find lockDir: ");
        } else {
            if (file.canWrite()) {
                return;
            }
            c.u(file.getAbsolutePath(), "Could not write to lockDir: ");
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            this.out.close();
        } finally {
            this.lockFile.delete();
        }
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

    public LockableFileWriter(String str, boolean z14) {
        this(str, z14, (String) null);
    }

    public LockableFileWriter(String str, boolean z14, String str2) {
        this(new File(str), z14, str2);
    }

    public LockableFileWriter(File file) {
        this(file, false, (String) null);
    }

    public LockableFileWriter(File file, boolean z14) {
        this(file, z14, (String) null);
    }

    @Deprecated
    public LockableFileWriter(File file, boolean z14, String str) {
        this(file, Charset.defaultCharset(), z14, str);
    }

    public LockableFileWriter(File file, Charset charset) {
        this(file, charset, false, (String) null);
    }

    public LockableFileWriter(File file, String str) {
        this(file, str, false, (String) null);
    }

    public LockableFileWriter(String str) {
        this(str, false, (String) null);
    }

    public LockableFileWriter(File file, String str, boolean z14, String str2) {
        this(file, Charsets.toCharset(str), z14, str2);
    }
}
