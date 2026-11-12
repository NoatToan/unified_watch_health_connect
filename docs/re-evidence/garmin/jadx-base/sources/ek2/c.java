package ek2;

import java.util.Timer;
import java.util.TimerTask;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lek2/c;", "Ljava/util/TimerTask;", "device-discovery_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c extends TimerTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f64522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f64523b;

    public c(b bVar, long j8) {
        this.f64522a = bVar;
        this.f64523b = j8;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        b bVar = this.f64522a;
        Object obj = bVar.f64515b;
        long j8 = this.f64523b;
        synchronized (obj) {
            try {
                long jB = bVar.b();
                if (jB <= j8) {
                    bVar.a(jB);
                    Unit unit = Unit.INSTANCE;
                } else {
                    Timer timer = bVar.f64518e;
                    if (timer != null) {
                        timer.cancel();
                        Unit unit2 = Unit.INSTANCE;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
