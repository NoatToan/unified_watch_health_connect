package de.greenrobot.event;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes22.dex */
final class c extends Handler {
    private final e a;
    private final int b;
    private final EventBus c;
    private boolean d;

    public c(EventBus eventBus, Looper looper, int i) {
        super(looper);
        this.c = eventBus;
        this.b = i;
        this.a = new e();
    }

    public void a(h hVar, Object obj) {
        d dVarA = d.a(hVar, obj);
        synchronized (this) {
            this.a.a(dVarA);
            if (!this.d) {
                this.d = true;
                if (!sendMessage(obtainMessage())) {
                    throw new EventBusException("Could not send handler message");
                }
            }
        }
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        try {
            long jUptimeMillis = SystemClock.uptimeMillis();
            do {
                d dVarB = this.a.b();
                if (dVarB == null) {
                    synchronized (this) {
                        dVarB = this.a.b();
                        if (dVarB == null) {
                            this.d = false;
                            this.d = false;
                            return;
                        }
                    }
                }
                this.c.d(dVarB);
            } while (SystemClock.uptimeMillis() - jUptimeMillis < this.b);
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
