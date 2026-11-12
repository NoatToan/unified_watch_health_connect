package l73;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import org.greenrobot.eventbus.EventBusException;

/* JADX INFO: loaded from: classes3.dex */
public class e extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f111440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f111441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f111442c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f111443d;

    public e(c cVar, Looper looper, int i14) {
        super(looper);
        this.f111442c = cVar;
        this.f111441b = i14;
        this.f111440a = new j();
    }

    public final void a(Object obj, o oVar) {
        i iVarA = i.a(obj, oVar);
        synchronized (this) {
            try {
                this.f111440a.a(iVarA);
                if (!this.f111443d) {
                    this.f111443d = true;
                    if (!sendMessage(obtainMessage())) {
                        throw new EventBusException("Could not send handler message");
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        try {
            long jUptimeMillis = SystemClock.uptimeMillis();
            do {
                i iVarB = this.f111440a.b();
                if (iVarB == null) {
                    synchronized (this) {
                        iVarB = this.f111440a.b();
                        if (iVarB == null) {
                            this.f111443d = false;
                            return;
                        }
                    }
                }
                this.f111442c.d(iVarB);
            } while (SystemClock.uptimeMillis() - jUptimeMillis < this.f111441b);
            if (!sendMessage(obtainMessage())) {
                throw new EventBusException("Could not send handler message");
            }
            this.f111443d = true;
        } catch (Throwable th3) {
            this.f111443d = false;
            throw th3;
        }
    }
}
