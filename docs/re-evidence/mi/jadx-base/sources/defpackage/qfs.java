package defpackage;

import android.content.Context;
import com.xiaomi.push.Cif;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;

/* JADX INFO: loaded from: classes11.dex */
public class qfs implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f31490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Cif f31491b;

    public qfs(Context context, Cif cif) {
        this.f31490a = context;
        this.f31491b = cif;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.nio.channels.FileLock] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v7 */
    @Override // java.lang.Runnable
    public void run() {
        RandomAccessFile randomAccessFile;
        synchronized (nfs.f27894a) {
            ?? r1 = 0;
            fileLockLock = null;
            FileLock fileLockLock = null;
            r1 = 0;
            try {
                try {
                    File file = new File(this.f31490a.getFilesDir(), "tiny_data.lock");
                    mgt.f(file);
                    randomAccessFile = new RandomAccessFile(file, "rw");
                    try {
                        fileLockLock = randomAccessFile.getChannel().lock();
                        nfs.e(this.f31490a, this.f31491b);
                        r1 = fileLockLock;
                        if (fileLockLock != null && fileLockLock.isValid()) {
                            try {
                                r1 = fileLockLock;
                                fileLockLock.release();
                                r1 = fileLockLock;
                            } catch (IOException e) {
                                x9s.s(e);
                                r1 = e;
                            }
                        }
                    } catch (Exception e2) {
                        e = e2;
                        x9s.s(e);
                        r1 = fileLockLock;
                        if (fileLockLock != null && fileLockLock.isValid()) {
                            try {
                                r1 = fileLockLock;
                                fileLockLock.release();
                                r1 = fileLockLock;
                            } catch (IOException e3) {
                                x9s.s(e3);
                                r1 = e3;
                            }
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    if (r1 != 0 && r1.isValid()) {
                        try {
                            r1.release();
                        } catch (IOException e4) {
                            x9s.s(e4);
                        }
                    }
                    mgt.b(randomAccessFile);
                    throw th;
                }
            } catch (Exception e5) {
                e = e5;
                randomAccessFile = null;
            } catch (Throwable th2) {
                th = th2;
                randomAccessFile = null;
                if (r1 != 0) {
                    r1.release();
                }
                mgt.b(randomAccessFile);
                throw th;
            }
            r1 = fileLockLock;
            r1 = fileLockLock;
            mgt.b(randomAccessFile);
        }
    }
}
