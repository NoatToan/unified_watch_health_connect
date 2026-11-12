package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import org.greenrobot.eventbus.EventBusException;

/* JADX INFO: loaded from: classes3.dex */
public class okb extends Handler implements z4i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pqh f29242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f29243b;
    public final ld8 c;
    public boolean d;

    public okb(ld8 ld8Var, Looper looper, int i) {
        super(looper);
        this.c = ld8Var;
        this.f29243b = i;
        this.f29242a = new pqh();
    }

    @Override // defpackage.z4i
    public void a(ioo iooVar, Object obj) {
        nqh nqhVarA = nqh.a(iooVar, obj);
        synchronized (this) {
            try {
                this.f29242a.a(nqhVarA);
                if (!this.d) {
                    this.d = true;
                    if (!sendMessage(obtainMessage())) {
                        throw new EventBusException("Could not send handler message");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        try {
            long jUptimeMillis = SystemClock.uptimeMillis();
            do {
                nqh nqhVarB = this.f29242a.b();
                if (nqhVarB == null) {
                    synchronized (this) {
                        nqhVarB = this.f29242a.b();
                        if (nqhVarB == null) {
                            this.d = false;
                            return;
                        }
                    }
                }
                this.c.g(nqhVarB);
            } while (SystemClock.uptimeMillis() - jUptimeMillis < this.f29243b);
            if (!sendMessage(obtainMessage())) {
                throw new EventBusException("Could not send handler message");
            }
            this.d = true;
        } catch (Throwable th) {
            this.d = false;
            throw th;
        }
    }
}
