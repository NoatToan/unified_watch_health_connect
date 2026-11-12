package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.xiaomi.fitness.repo.healthconnect.biz.daily.BaseSyncBiz;
import com.xiaomi.push.i;
import com.xiaomi.push.id;
import com.xiaomi.push.ig;
import com.xiaomi.push.ij;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;

/* JADX INFO: loaded from: classes11.dex */
public abstract class yps extends k5s.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f40412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f40413b;

    public yps(Context context, int i) {
        this.f40412a = i;
        this.f40413b = context;
    }

    public static void c(Context context, ij ijVar) {
        jps jpsVarA = mps.b().a();
        String strA = jpsVarA == null ? "" : jpsVarA.a();
        if (TextUtils.isEmpty(strA) || TextUtils.isEmpty(ijVar.a())) {
            return;
        }
        d(context, ijVar, strA);
    }

    public static void d(Context context, ij ijVar, String str) {
        BufferedOutputStream bufferedOutputStream;
        RandomAccessFile randomAccessFile;
        byte[] bArrD = qps.d(str, i.e(ijVar));
        if (bArrD == null || bArrD.length == 0) {
            return;
        }
        synchronized (sps.f33873a) {
            FileLock fileLock = null;
            BufferedOutputStream bufferedOutputStream2 = null;
            fileLock = null;
            fileLock = null;
            fileLock = null;
            try {
                try {
                    File file = new File(context.getFilesDir(), "push_cdata.lock");
                    mgt.f(file);
                    randomAccessFile = new RandomAccessFile(file, "rw");
                    try {
                        FileLock fileLockLock = randomAccessFile.getChannel().lock();
                        try {
                            File file2 = new File(context.getFilesDir(), "push_cdata.data");
                            if (egt.b(file2)) {
                                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file2, true));
                                try {
                                    bufferedOutputStream.write(j4s.b(bArrD.length));
                                    bufferedOutputStream.write(bArrD);
                                    bufferedOutputStream.flush();
                                    file2.setLastModified(0L);
                                    bufferedOutputStream2 = bufferedOutputStream;
                                } catch (IOException e) {
                                    e = e;
                                    fileLock = fileLockLock;
                                    try {
                                        e.printStackTrace();
                                        if (fileLock != null && fileLock.isValid()) {
                                            try {
                                                fileLock.release();
                                            } catch (IOException unused) {
                                            }
                                        }
                                        mgt.b(bufferedOutputStream);
                                    } catch (Throwable th) {
                                        th = th;
                                        if (fileLock != null && fileLock.isValid()) {
                                            try {
                                                fileLock.release();
                                            } catch (IOException unused2) {
                                            }
                                        }
                                        mgt.b(bufferedOutputStream);
                                        mgt.b(randomAccessFile);
                                        throw th;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    fileLock = fileLockLock;
                                    if (fileLock != null) {
                                        fileLock.release();
                                    }
                                    mgt.b(bufferedOutputStream);
                                    mgt.b(randomAccessFile);
                                    throw th;
                                }
                            }
                            if (fileLockLock != null && fileLockLock.isValid()) {
                                try {
                                    fileLockLock.release();
                                } catch (IOException unused3) {
                                }
                            }
                            mgt.b(bufferedOutputStream2);
                        } catch (IOException e2) {
                            e = e2;
                            bufferedOutputStream = null;
                        } catch (Throwable th3) {
                            th = th3;
                            bufferedOutputStream = null;
                        }
                    } catch (IOException e3) {
                        e = e3;
                        bufferedOutputStream = null;
                    } catch (Throwable th4) {
                        th = th4;
                        bufferedOutputStream = null;
                    }
                } catch (Throwable th5) {
                    throw th5;
                }
            } catch (IOException e4) {
                e = e4;
                bufferedOutputStream = null;
                randomAccessFile = null;
            } catch (Throwable th6) {
                th = th6;
                bufferedOutputStream = null;
                randomAccessFile = null;
            }
            mgt.b(randomAccessFile);
        }
    }

    public abstract id b();

    public boolean e() {
        return qps.b(this.f40413b, String.valueOf(a()), this.f40412a);
    }

    public abstract String f();

    public boolean g() {
        return true;
    }

    public final String h() {
        return "dc_job_result_time_" + a();
    }

    public boolean i() {
        return false;
    }

    public final String j() {
        return "dc_job_result_" + a();
    }

    @Override // java.lang.Runnable
    public void run() {
        String strF = f();
        if (TextUtils.isEmpty(strF)) {
            return;
        }
        if (e()) {
            x9s.o("DC run job mutual: " + a());
            return;
        }
        jps jpsVarA = mps.b().a();
        String strA = jpsVarA == null ? "" : jpsVarA.a();
        if (!TextUtils.isEmpty(strA) && g()) {
            if (i()) {
                SharedPreferences sharedPreferences = this.f40413b.getSharedPreferences("mipush_extra", 0);
                if (qcs.b(strF).equals(sharedPreferences.getString(j(), null))) {
                    long j = sharedPreferences.getLong(h(), 0L);
                    int iA = vas.d(this.f40413b).a(ig.DCJobUploadRepeatedInterval.a(), BaseSyncBiz.RECORD_MAX_LIFETIME);
                    if ((System.currentTimeMillis() - j) / 1000 < this.f40412a) {
                        return;
                    }
                    if ((System.currentTimeMillis() - j) / 1000 < iA) {
                        strF = "same_" + j;
                    }
                }
            }
            ij ijVar = new ij();
            ijVar.a(strF);
            ijVar.a(System.currentTimeMillis());
            ijVar.a(b());
            d(this.f40413b, ijVar, strA);
        }
    }
}
