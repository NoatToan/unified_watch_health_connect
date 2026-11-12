package com.huawei.haf.common.os;

import health.compact.a.LogUtil;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;

/* JADX INFO: loaded from: classes2.dex */
public final class FileLockHelper implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final RandomAccessFile f5906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile boolean f5907b;
    private final FileLock e;

    private FileLockHelper(File file, boolean z) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, z ? "rws" : "rw");
        try {
            FileLock fileLockC = c(file, randomAccessFile);
            if (fileLockC == null) {
                FileUtils.a(randomAccessFile);
                randomAccessFile = null;
            }
            this.f5906a = randomAccessFile;
            this.e = fileLockC;
        } catch (Throwable th) {
            FileUtils.a(randomAccessFile);
            throw th;
        }
    }

    private FileLock c(File file, RandomAccessFile randomAccessFile) throws IOException {
        FileLock fileLockLock = null;
        Throwable e = null;
        for (int i = 0; i < 3; i++) {
            try {
                fileLockLock = randomAccessFile.getChannel().lock();
                if (fileLockLock != null) {
                    break;
                }
            } catch (IOException | OverlappingFileLockException e2) {
                e = e2;
                LogUtil.d("HAF_FileLockHelper", "getFileLock failed time:", 10, ", ex=", LogUtil.c(e));
            }
            if (i < 3) {
                try {
                    Thread.sleep(10L);
                } catch (InterruptedException e3) {
                    LogUtil.d("HAF_FileLockHelper", "getFileLock Thread sleep ex=", LogUtil.c(e3));
                }
            }
        }
        if (fileLockLock != null) {
            return fileLockLock;
        }
        throw new IOException("FileLockHelper lock file failed: " + file.getPath(), e);
    }

    public static FileLockHelper d(File file) throws IOException {
        return new FileLockHelper(file, false);
    }

    public static FileLockHelper c(File file) throws IOException {
        return new FileLockHelper(file, true);
    }

    public boolean b() {
        FileLock fileLock = this.e;
        if (fileLock == null) {
            return false;
        }
        return fileLock.isValid();
    }

    public void c(byte[] bArr) throws IOException {
        this.f5906a.seek(0L);
        this.f5906a.write(bArr);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f5907b) {
            return;
        }
        this.f5907b = true;
        FileUtils.c(this.e);
        FileUtils.a(this.f5906a);
    }
}
