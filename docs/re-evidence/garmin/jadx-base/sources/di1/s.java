package di1;

import com.garmin.android.apps.connectmobile.i2;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes10.dex */
public abstract class s<T> extends com.garmin.android.library.backgroundtaskmanagement.b<T> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f59776l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Timer f59777m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public s<T>.a f59778n;

    public s(com.garmin.android.library.backgroundtaskmanagement.b.a aVar) {
        super(com.garmin.android.library.backgroundtaskmanagement.b.d.DEFAULT_PRIORITY, aVar);
        this.f59776l = -1L;
        this.f59777m = null;
        this.f59778n = null;
    }

    public static String k() {
        return "WiFiNetworkOperation_" + Thread.currentThread().getName();
    }

    public final void l() {
        i2.d(k(), "startResponseWatcher begin");
        if (this.f59777m == null) {
            i2.d(k(), "startResponseWatcher @ " + System.currentTimeMillis());
            this.f59777m = new Timer();
            s<T>.a aVar = new a(this, 0);
            this.f59778n = aVar;
            this.f59777m.schedule(aVar, 31000L);
        }
        i2.d(k(), "startResponseWatcher end");
    }

    public final void m() {
        i2.d(k(), "stopResponseWatcher begin");
        if (this.f59777m != null) {
            i2.d(k(), "stopResponseWatcher @ " + System.currentTimeMillis());
            s<T>.a aVar = this.f59778n;
            if (aVar != null) {
                aVar.f59779a.set(false);
            }
            this.f59777m.cancel();
            this.f59777m.purge();
            this.f59777m = null;
        }
        i2.d(k(), "stopResponseWatcher end");
    }

    public class a extends TimerTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicBoolean f59779a;

        private a() {
            this.f59779a = new AtomicBoolean(true);
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            if (this.f59779a.get()) {
                s sVar = s.this;
                sVar.getClass();
                i2.d(s.k(), "*** TIMEOUT!!! ***");
                sVar.m();
                sVar.f50094d.set(com.garmin.android.library.backgroundtaskmanagement.b.c.DEVICE_TIMEOUT);
                sVar.g();
            }
        }

        public /* synthetic */ a(s sVar, int i14) {
            this();
        }
    }
}
