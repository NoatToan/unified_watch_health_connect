package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import de.greenrobot.event.EventBusException;

/* JADX INFO: loaded from: classes2.dex */
public final class pkb extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qqh f30493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f30494b;
    public final kd8 c;
    public boolean d;

    public pkb(kd8 kd8Var, Looper looper, int i) {
        super(looper);
        this.c = kd8Var;
        this.f30494b = i;
        this.f30493a = new qqh();
    }

    public void a(loo looVar, Object obj) {
        oqh oqhVarA = oqh.a(looVar, obj);
        synchronized (this) {
            try {
                this.f30493a.a(oqhVarA);
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
                oqh oqhVarB = this.f30493a.b();
                if (oqhVarB == null) {
                    synchronized (this) {
                        oqhVarB = this.f30493a.b();
                        if (oqhVarB == null) {
                            this.d = false;
                            return;
                        }
                    }
                }
                this.c.e(oqhVarB);
            } while (SystemClock.uptimeMillis() - jUptimeMillis < this.f30494b);
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
