package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;

/* JADX INFO: loaded from: classes11.dex */
public class yes {
    public static volatile yes j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f40110a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f40111b = new Object();
    public final String c = "mipush_region";
    public final String d = "mipush_country_code";
    public final String e = "mipush_region.lock";
    public final String f = "mipush_country_code.lock";
    public volatile String g;
    public volatile String h;
    public Context i;

    public yes(Context context) {
        this.i = context;
    }

    public static yes a(Context context) {
        if (j == null) {
            synchronized (yes.class) {
                try {
                    if (j == null) {
                        j = new yes(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return j;
    }

    public String b() {
        if (TextUtils.isEmpty(this.g)) {
            this.g = c(this.i, "mipush_region", "mipush_region.lock", this.f40110a);
        }
        return this.g;
    }

    public final String c(Context context, String str, String str2, Object obj) {
        RandomAccessFile randomAccessFile;
        FileLock fileLockLock;
        File file = new File(context.getFilesDir(), str);
        FileLock fileLock = null;
        if (!file.exists()) {
            x9s.o("No ready file to get data from " + str);
            return null;
        }
        synchronized (obj) {
            try {
                File file2 = new File(context.getFilesDir(), str2);
                mgt.f(file2);
                randomAccessFile = new RandomAccessFile(file2, "rw");
                try {
                    fileLockLock = randomAccessFile.getChannel().lock();
                    try {
                        try {
                            String strA = mgt.a(file);
                            if (fileLockLock != null && fileLockLock.isValid()) {
                                try {
                                    fileLockLock.release();
                                } catch (IOException e) {
                                    x9s.s(e);
                                }
                            }
                            mgt.b(randomAccessFile);
                            return strA;
                        } catch (Exception e2) {
                            e = e2;
                            x9s.s(e);
                            if (fileLockLock != null && fileLockLock.isValid()) {
                                try {
                                    fileLockLock.release();
                                } catch (IOException e3) {
                                    x9s.s(e3);
                                }
                            }
                            mgt.b(randomAccessFile);
                            return null;
                        }
                    } catch (Throwable th) {
                        th = th;
                        fileLock = fileLockLock;
                        if (fileLock != null && fileLock.isValid()) {
                            try {
                                fileLock.release();
                            } catch (IOException e4) {
                                x9s.s(e4);
                            }
                        }
                        mgt.b(randomAccessFile);
                        throw th;
                    }
                } catch (Exception e5) {
                    e = e5;
                    fileLockLock = null;
                } catch (Throwable th2) {
                    th = th2;
                    if (fileLock != null) {
                        fileLock.release();
                    }
                    mgt.b(randomAccessFile);
                    throw th;
                }
            } catch (Exception e6) {
                e = e6;
                randomAccessFile = null;
                fileLockLock = null;
            } catch (Throwable th3) {
                th = th3;
                randomAccessFile = null;
            }
        }
    }

    public final void d(Context context, String str, String str2, String str3, Object obj) {
        RandomAccessFile randomAccessFile;
        synchronized (obj) {
            FileLock fileLockLock = null;
            try {
                File file = new File(context.getFilesDir(), str3);
                mgt.f(file);
                randomAccessFile = new RandomAccessFile(file, "rw");
                try {
                    try {
                        fileLockLock = randomAccessFile.getChannel().lock();
                        mgt.d(new File(context.getFilesDir(), str2), str);
                        if (fileLockLock != null && fileLockLock.isValid()) {
                            try {
                                fileLockLock.release();
                            } catch (IOException e) {
                                x9s.s(e);
                            }
                        }
                    } catch (Exception e2) {
                        e = e2;
                        x9s.s(e);
                        if (fileLockLock != null && fileLockLock.isValid()) {
                            try {
                                fileLockLock.release();
                            } catch (IOException e3) {
                                x9s.s(e3);
                            }
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    if (fileLockLock != null && fileLockLock.isValid()) {
                        try {
                            fileLockLock.release();
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
                if (fileLockLock != null) {
                    fileLockLock.release();
                }
                mgt.b(randomAccessFile);
                throw th;
            }
            mgt.b(randomAccessFile);
        }
    }

    public void e(String str, boolean z) {
        if (!TextUtils.equals(str, this.g)) {
            this.g = str;
        }
        if (z) {
            d(this.i, str, "mipush_region", "mipush_region.lock", this.f40110a);
        }
    }

    public String f() {
        if (TextUtils.isEmpty(this.h)) {
            this.h = c(this.i, "mipush_country_code", "mipush_country_code.lock", this.f40111b);
        }
        return this.h;
    }

    public void g(String str, boolean z) {
        if (!TextUtils.equals(str, this.h)) {
            this.h = str;
        }
        if (z) {
            d(this.i, str, "mipush_country_code", "mipush_region.lock", this.f40110a);
        }
    }
}
