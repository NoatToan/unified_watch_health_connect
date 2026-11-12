package lv;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import c22.e1;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import dk2.f;
import dk2.g;
import dk2.h;
import java.util.Objects;
import java.util.Set;
import p006l2.v0;

/* JADX INFO: loaded from: classes7.dex */
public class a implements dk2.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f115020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f115021b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f115022c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f115023d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f115024e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Handler f115025f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final RunnableC2187a f115026g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public g f115027h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Set<String> f115028i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Handler f115029j;

    /* JADX INFO: renamed from: lv.a$a, reason: collision with other inner class name */
    public class RunnableC2187a implements Runnable {
        public RunnableC2187a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            a aVar = a.this;
            long j8 = aVar.f115023d;
            b bVar = aVar.f115021b;
            long j14 = aVar.f115022c;
            String str = aVar.f115020a;
            long j15 = j8 - 1000;
            aVar.f115023d = j15;
            if (j15 <= 0) {
                i2.a(a2.BIC, str, "Countdown finished");
                if (bVar != null) {
                    bVar.s4(null);
                }
                aVar.d();
                return;
            }
            i2.a(a2.BIC, str, "Countdown tick - elapsed seconds: " + ((j14 - aVar.f115023d) / 1000));
            if (bVar != null) {
                long j16 = aVar.f115023d;
                bVar.W1(j14 - j16, j16);
            }
            Handler handler = aVar.f115025f;
            RunnableC2187a runnableC2187a = aVar.f115026g;
            long j17 = aVar.f115023d;
            handler.postDelayed(runnableC2187a, j17 < 1000 ? j17 : 1000L);
        }
    }

    public a(long j8, b bVar) {
        this.f115024e = false;
        this.f115025f = new Handler();
        this.f115026g = new RunnableC2187a();
        this.f115029j = new Handler(Looper.getMainLooper());
        this.f115020a = "BleDeviceScanner@" + hashCode();
        this.f115022c = j8;
        this.f115021b = bVar;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0030  */
    @Override // dk2.e
    public final void a(h hVar) {
        boolean z14;
        boolean z15 = hVar instanceof dk2.d;
        String str = this.f115020a;
        if (!z15) {
            i2.i(str, "onDeviceFound: Unexpected device param " + hVar);
            return;
        }
        dk2.d dVar = (dk2.d) hVar;
        a2 a2Var = a2.BIC;
        StringBuilder sb3 = new StringBuilder(".onScanResult() -> inPairingMode=[");
        Integer num = dVar.f60241e;
        if (num != null) {
            z14 = (num.intValue() & 1) == 1;
        }
        sb3.append(z14);
        sb3.append("] ");
        sb3.append(dVar);
        i2.a(a2Var, str, sb3.toString());
        Set<String> set = this.f115028i;
        if (set == null || set.contains(dVar.f60239c)) {
            if (!TextUtils.isEmpty(dVar.f60240d.getAddress())) {
                if (this.f115021b != null) {
                    this.f115029j.post(new l0.e(3, this, dVar));
                }
            } else {
                i2.f36769a.getClass();
                i2.a.b(a2Var, str, ".handleDeviceFound() -> NULL or EMPTY mac address for device " + dVar);
            }
        }
    }

    @Override // dk2.e
    public final void b(f fVar) {
        i2.f(a2.BIC, this.f115020a, "onDiscoveryFailed -> " + fVar);
        b bVar = this.f115021b;
        if (bVar != null) {
            bVar.s4(fVar);
        }
    }

    public final void c(Context context, Set<String> set) {
        Set<String> set2;
        if (e1.a()) {
            this.f115024e = true;
            Handler handler = this.f115025f;
            RunnableC2187a runnableC2187a = this.f115026g;
            handler.removeCallbacks(runnableC2187a);
            long j8 = this.f115022c;
            this.f115023d = j8;
            handler.postDelayed(runnableC2187a, 1000L);
            d();
            i2.a(a2.BIC, this.f115020a, "startScanning");
            int i14 = (int) (j8 / 1000);
            if (this.f115027h != null && (set2 = this.f115028i) != null && set2.equals(set)) {
                this.f115027h.a(e.a(), this, i14, context);
                return;
            }
            this.f115028i = set;
            kp2.a aVar = new kp2.a(this, 16);
            gm2.b bVar = gm2.b.f78015a;
            Objects.requireNonNull(bVar);
            g gVar = new g(aVar, new v0(bVar, 15));
            this.f115027h = gVar;
            gVar.a(e.a(), this, i14, context);
        }
    }

    public final void d() {
        i2.a(a2.BIC, this.f115020a, ".stopScanning()");
        g gVar = this.f115027h;
        if (gVar != null) {
            gVar.b();
        }
    }

    public a(b bVar) {
        this(30000L, bVar);
    }
}
