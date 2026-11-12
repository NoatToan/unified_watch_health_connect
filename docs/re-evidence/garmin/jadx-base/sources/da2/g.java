package da2;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import ch.qos.logback.classic.Logger;
import com.garmin.android.gfdi.configuration.GdiClientConfigurationUtil;
import java.util.Set;
import java.util.Timer;
import p13.l0;

/* JADX INFO: loaded from: classes7.dex */
@Deprecated
public class g extends Service {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f58897c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Logger f58898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f58899b;

    @SuppressLint({"NewApi"})
    public class a extends n {
        public a(g gVar) {
        }
    }

    public g() {
        String strA = oa2.d.a(this, "GdiService");
        int i14 = gt2.c.f79010a;
        this.f58898a = gt2.b.f79005a.i(strA);
        this.f58899b = new a(this);
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.f58899b;
    }

    @Override // android.app.Service
    public final void onCreate() {
        this.f58898a.info("Creating GdiService...");
        super.onCreate();
        la2.e eVar = d.c(this).f58886a;
        eVar.f111643b.clear();
        eVar.f111645d.clear();
        eVar.l();
        Set set = GdiClientConfigurationUtil.fromClientConfig(this).f58890a;
        if (set == null) {
            set = l0.f134950a;
        }
        if (set.contains(ma2.l.CONNECT_IQ)) {
            ch2.h.e(this);
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        this.f58898a.info("Destroying GdiService...");
        la2.e eVar = d.c(this).f58886a;
        eVar.n();
        h.f58902c.set(null);
        eVar.f111643b.clear();
        eVar.f111645d.clear();
        d.c(this).f58886a.f111646e.f58876a.clear();
        Timer andSet = h.f58903d.getAndSet(null);
        if (andSet != null) {
            andSet.cancel();
            andSet.purge();
        }
        h.f58904e.clear();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        return true;
    }
}
