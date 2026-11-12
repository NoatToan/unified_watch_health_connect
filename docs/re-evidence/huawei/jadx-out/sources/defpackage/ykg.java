package defpackage;

import com.huawei.wearengine.p2p.SendCallback;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes46.dex */
public class ykg extends TimerTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f53580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SendCallback f53581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f53582c;
    private boolean e;

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        synchronized (this.f53580a) {
            yis.a("TimeoutTask", "sendUuid:" + this.f53582c + ", TimeoutTask is complete.");
            if (a()) {
                yis.a("TimeoutTask", "sendUuid:" + this.f53582c + ", TimeoutTask is cancelled.");
                return;
            }
            cancel();
            SendCallback sendCallback = this.f53581b;
            if (sendCallback != null) {
                sendCallback.onSendResult(206);
            }
        }
    }

    @Override // java.util.TimerTask
    public boolean cancel() {
        this.e = true;
        return super.cancel();
    }

    boolean a() {
        return this.e;
    }

    public final Object c() {
        return this.f53580a;
    }
}
