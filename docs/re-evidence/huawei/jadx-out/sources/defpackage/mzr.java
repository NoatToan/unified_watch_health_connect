package defpackage;

import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.huawei.haf.handler.ExtendHandler;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.hwdevice.phoneprocess.mgr.hwtwsmgr.BaseTwsTask;
import com.huawei.hwdevice.phoneprocess.mgr.hwtwsmgr.ProfileUpdate;
import com.huawei.hwdevice.phoneprocess.mgr.hwtwsmgr.TwsExecutorListener;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.profile.client.connect.ServiceConnectCallback;

/* JADX INFO: loaded from: classes11.dex */
public class mzr {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private TwsExecutorListener f42768c;
    private String h;
    private d e = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile boolean f42766a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private BaseTwsTask f42767b = null;
    private ServiceConnectCallback j = new ServiceConnectCallback() { // from class: mzr.3
        @Override // com.huawei.profile.client.connect.ServiceConnectCallback
        public void onConnect() {
            LogUtil.a("HwTwsExecutor", "profile connected.");
            if (mzr.this.d != null) {
                mzr.this.d.sendEmptyMessage(2);
            }
        }

        @Override // com.huawei.profile.client.connect.ServiceConnectCallback
        public void onDisconnect() {
            LogUtil.a("HwTwsExecutor", "profileCallback disconnected.");
            if (mzr.this.d != null) {
                mzr.this.d.sendEmptyMessage(3);
            }
        }
    };
    private ExtendHandler d = HandlerCenter.b(this.e, "HwTwsExecutor");
    private ProfileUpdate f = ProfileUpdate.PROFILE_UPDATE_BY_APK;

    mzr(TwsExecutorListener twsExecutorListener) {
        this.f42768c = twsExecutorListener;
    }

    public void e() {
        synchronized (this) {
            if (this.f42766a) {
                LogUtil.j("HwTwsExecutor", "startExecutor but is running");
                return;
            }
            if (this.d != null) {
                this.f42766a = true;
                this.d.sendEmptyMessage(1);
            }
        }
    }

    public void d() {
        this.f42766a = false;
        this.f.disconnectProfile();
    }

    public void c(final String str, final byte[] bArr) {
        String str2 = this.h;
        if (str2 != null && str2.equals(str)) {
            LogUtil.a("HwTwsExecutor", "doWaitMessage :", str);
            ExtendHandler extendHandler = this.d;
            if (extendHandler != null) {
                extendHandler.postTask(new Runnable() { // from class: mzr.1
                    @Override // java.lang.Runnable
                    public void run() {
                        mzr.this.a(str, bArr);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, byte[] bArr) {
        BaseTwsTask baseTwsTask = this.f42767b;
        if (baseTwsTask != null && !baseTwsTask.onWaitFor(str, bArr) && g()) {
            LogUtil.a("HwTwsExecutor", "doWaitMessage find another wait massage");
            return;
        }
        this.f42768c.onTaskFinish(this.f42767b);
        h();
        ExtendHandler extendHandler = this.d;
        if (extendHandler != null) {
            extendHandler.sendEmptyMessage(1);
        }
    }

    private void h() {
        ExtendHandler extendHandler = this.d;
        if (extendHandler != null) {
            extendHandler.removeMessages(4);
        }
        this.f42767b = null;
        this.h = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:12:0x0041  */
    /* JADX WARN: Code duplicated, block: B:17:0x0030 A[SYNTHETIC] */
    public void b() {
        LogUtil.a("HwTwsExecutor", "dealTaskCheck entry");
        do {
            if (this.f42767b == null) {
                BaseTwsTask baseTwsTaskOnGetNextTask = this.f42768c.onGetNextTask();
                if (baseTwsTaskOnGetNextTask == null) {
                    LogUtil.a("HwTwsExecutor", "dealTaskCheck find all task finish");
                    this.f42768c.onAllTaskFinish();
                    break;
                }
                this.f42767b = baseTwsTaskOnGetNextTask;
                if (!this.f.isConnected()) {
                    LogUtil.a("HwTwsExecutor", "dealTaskCheck first use profile,wait for connect");
                    this.f.connectProfile(this.j);
                    break;
                }
                LogUtil.a("HwTwsExecutor", "dealTaskCheck start do task");
            } else {
                if (!this.f.isConnected()) {
                    LogUtil.a("HwTwsExecutor", "dealTaskCheck first use profile,wait for connect");
                    this.f.connectProfile(this.j);
                    break;
                }
                LogUtil.a("HwTwsExecutor", "dealTaskCheck start do task");
            }
        } while (f());
        LogUtil.a("HwTwsExecutor", "dealTaskCheck exit");
    }

    private boolean f() {
        this.f42768c.onTaskBegin(this.f42767b);
        if (!this.f42767b.onExecutor(this.f.getProfileClient()) && g()) {
            LogUtil.a("HwTwsExecutor", "doTask need wait message:", this.f42767b.getTaskName());
            return false;
        }
        this.f42768c.onTaskFinish(this.f42767b);
        h();
        return true;
    }

    private boolean g() {
        String waitMessage = this.f42767b.getWaitMessage();
        if (TextUtils.isEmpty(waitMessage)) {
            LogUtil.j("HwTwsExecutor", "sendWaitMessage ,but not find wait message,maybe error");
            return false;
        }
        this.h = waitMessage;
        if (this.d != null) {
            LogUtil.a("HwTwsExecutor", "sendWaitMessage find wait message:", this.f42767b.getWaitMessage(), ",wait time:", Long.valueOf(this.f42767b.getWaitTimeout()));
            this.d.sendEmptyMessage(4, this.f42767b.getWaitTimeout());
            return true;
        }
        LogUtil.j("HwTwsExecutor", "sendWaitMessage not finish ,but handle is null");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        LogUtil.a("HwTwsExecutor", "dealTaskTimeout taskName:", this.f42767b.getTaskName(), ",waitFor:", this.h);
        this.f42768c.onTaskTimeout(this.f42767b);
        this.f42768c.onTaskFinish(this.f42767b);
        h();
        ExtendHandler extendHandler = this.d;
        if (extendHandler != null) {
            extendHandler.sendEmptyMessage(1);
        }
    }

    public void a() {
        ExtendHandler extendHandler = this.d;
        if (extendHandler != null) {
            extendHandler.removeTasksAndMessages();
            this.d = null;
        }
    }

    class d implements Handler.Callback {
        private d() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                LogUtil.a("HwTwsExecutor", "dealMessage start check");
                mzr.this.b();
                return true;
            }
            if (i == 2) {
                LogUtil.a("HwTwsExecutor", "dealMessage profile connected");
                mzr.this.b();
                return true;
            }
            if (i == 3) {
                LogUtil.a("HwTwsExecutor", "dealMessage profile disconnect");
                return true;
            }
            if (i == 4) {
                mzr.this.c();
                return true;
            }
            LogUtil.j("HwTwsExecutor", "dealMessage find default:", Integer.valueOf(message.what));
            return false;
        }
    }
}
