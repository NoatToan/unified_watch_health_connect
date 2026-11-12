package defpackage;

import android.content.Context;
import android.os.Environment;
import android.os.Handler;
import android.os.Message;
import androidx.media3.common.C;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes11.dex */
public class nvw implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ReentrantLock f43846b = new ReentrantLock();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f43847a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f43848c;
    private Handler d;
    private Context e;
    private final boolean g;

    public nvw(Context context, Handler handler, boolean z, boolean z2, boolean z3) {
        this.e = context;
        this.d = handler;
        this.f43847a = z;
        this.f43848c = z2;
        this.g = z3;
    }

    @Override // java.lang.Runnable
    public void run() {
        LogUtil.a("DownloadService", "DownloadService run");
        g();
        try {
            try {
                try {
                    ReentrantLock reentrantLock = f43846b;
                    reentrantLock.lock();
                    nuw.d(-1);
                    d();
                    a();
                    reentrantLock.unlock();
                } catch (RuntimeException unused) {
                    LogUtil.e("DownloadService", "run RuntimeException e");
                    f43846b.unlock();
                }
            } catch (Exception unused2) {
                LogUtil.e("DownloadService", "run Exception");
                f43846b.unlock();
            }
        } catch (Throwable th) {
            f43846b.unlock();
            throw th;
        }
    }

    private void a() {
        while (nuw.j() != 1) {
            if (nuw.j() == 0) {
                try {
                    LogUtil.d("DownloadService", "downloadingState DOWNLOADING_STATE_START");
                    Thread.sleep(2000L);
                } catch (InterruptedException e) {
                    LogUtil.e("DownloadService", "downloadingState InterruptedException e:", e.getMessage());
                }
            } else {
                if (nuw.j() == 3 && b()) {
                    return;
                }
                if (nuw.a(this.e)) {
                    e();
                    if (nuw.g()) {
                        LogUtil.a("DownloadService", "downloadingState downloadThread already running,do not start new download");
                    } else {
                        LogUtil.a("DownloadService", "downloadingState start downloadThread");
                        nuw.d(0);
                        new nvu(this.e, this.d, this.f43847a, this.f43848c, this.g).c();
                        nuw.d(true);
                    }
                } else {
                    nuw.d(3);
                }
            }
        }
        LogUtil.a("DownloadService", "downloadingState DOWNLOADING_STATE_END");
    }

    private void e() {
        LogUtil.a("DownloadService", "downLoadDelay NetworkAvailable");
        try {
            Thread.sleep(500L);
        } catch (InterruptedException e) {
            LogUtil.e("DownloadService", "downLoadDelay Exception ", e.getMessage());
        }
    }

    private void g() {
        LogUtil.a("DownloadService", "enter setCancelDownloadFlagDelay getDownloadThreadRunningFlag:", Boolean.valueOf(nuw.g()));
        if (!nuw.g()) {
            nvu.a(false);
            return;
        }
        try {
            Thread.sleep(2000L);
        } catch (InterruptedException e) {
            LogUtil.e("DownloadService", "setCancelDownloadFlagDelay InterruptedException ", e.getMessage());
        }
        if (nuw.g()) {
            LogUtil.a("DownloadService", "setCancelDownloadFlagDelay DownloadThread not stopped in 2s");
            try {
                Thread.sleep(C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
            } catch (InterruptedException e2) {
                LogUtil.e("DownloadService", "setCancelDownloadFlagDelay InterruptedException ", e2.getMessage());
            }
        }
        if (nuw.g()) {
            LogUtil.a("DownloadService", "setCancelDownloadFlagDelay DownloadThread not stopped in 5s");
            try {
                Thread.sleep(5000L);
            } catch (InterruptedException e3) {
                LogUtil.e("DownloadService", "setCancelDownloadFlagDelay InterruptedException ", e3.getMessage());
            }
        }
        nvu.a(false);
        LogUtil.a("DownloadService", "setCancelDownloadFlagDelay leaving");
    }

    private boolean b() {
        int iL = nuw.l();
        LogUtil.a("DownloadService", "processRetryState retryNum is ", Integer.valueOf(iL));
        if (CommonUtil.ah(this.e)) {
            LogUtil.a("DownloadService", "processRetryState first isTypeMobile is true");
            nuw.c(11, this.f43847a, this.f43848c, this.g);
            d(null, 11);
            nuw.d(-1);
            return true;
        }
        if (iL < 3) {
            try {
                LogUtil.a("DownloadService", "processRetryState, retry in 10S,current retryNum is ", Integer.valueOf(iL));
                Thread.sleep(5000L);
                if (CommonUtil.ah(this.e)) {
                    LogUtil.a("DownloadService", "processRetryState second isTypeMobile is true");
                    nuw.c(11, this.f43847a, this.f43848c, this.g);
                    d(null, 11);
                    nuw.d(-1);
                    return true;
                }
                nuw.a(iL + 1);
                return false;
            } catch (InterruptedException e) {
                LogUtil.e("DownloadService", "processRetryState InterruptedException ", e.getMessage());
            }
        } else {
            LogUtil.a("DownloadService", "processRetryState retryOver so stop send message DOWNLOAD_FAILED_CONNECT_ERROR");
            nuw.d(1);
            nuw.c(3, this.f43847a, this.f43848c, this.g);
            d(null, 3);
            return true;
        }
    }

    private void d() throws IOException {
        num numVarC = c();
        if (numVarC == null) {
            LogUtil.e("DownloadService", "initPath null info");
            return;
        }
        String strT = numVarC.t();
        if (Environment.getExternalStorageState().equals("mounted")) {
            numVarC.o(CommonUtil.f(this.e).getCanonicalPath() + File.separator + "download" + File.separator + strT);
        } else {
            numVarC.o(this.e.getFilesDir() + File.separator + strT);
        }
        LogUtil.d("DownloadService", "initPath apk storage path = ", numVarC.s(), "; mContext.getFilesDir() + File.separator =", this.e.getFilesDir(), File.separator);
        nuw.a(0);
    }

    private void d(Object obj, int i) {
        if (this.d != null) {
            Message messageObtain = Message.obtain();
            messageObtain.obj = obj;
            messageObtain.what = i;
            this.d.sendMessage(messageObtain);
        }
    }

    private num c() {
        if (this.f43847a) {
            return nuw.b();
        }
        if (this.f43848c) {
            return nuw.c();
        }
        if (this.g) {
            return nuw.o();
        }
        return nuw.a();
    }
}
