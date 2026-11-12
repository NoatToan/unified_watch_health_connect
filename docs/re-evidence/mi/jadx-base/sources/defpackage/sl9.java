package defpackage;

import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileLock;

/* JADX INFO: loaded from: classes4.dex */
public final class sl9 implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public FileOutputStream f33757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public FileLock f33758b;

    public sl9(File file, boolean z) throws IOException {
        a(file, z);
    }

    public static sl9 b(File file) throws IOException {
        return new sl9(file, false);
    }

    public static sl9 c(File file) throws IOException {
        sl9 sl9Var = new sl9(file, true);
        if (sl9Var.f33758b != null) {
            return sl9Var;
        }
        sl9Var.close();
        return null;
    }

    public final void a(File file, boolean z) throws IOException {
        FileLock fileLockTryLock;
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        this.f33757a = fileOutputStream;
        try {
            if (z) {
                try {
                    fileLockTryLock = fileOutputStream.getChannel().tryLock();
                } catch (IOException unused) {
                    fileLockTryLock = null;
                }
            } else {
                fileLockTryLock = fileOutputStream.getChannel().lock();
            }
            if (fileLockTryLock == null) {
                this.f33757a.close();
            }
            this.f33758b = fileLockTryLock;
        } catch (Throwable th) {
            this.f33757a.close();
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            FileLock fileLock = this.f33758b;
            if (fileLock != null) {
                fileLock.release();
            }
        } finally {
            this.f33757a.close();
        }
    }
}
