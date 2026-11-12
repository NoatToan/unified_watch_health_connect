package defpackage;

import android.annotation.SuppressLint;
import com.xiaomi.hm.health.bt.profile.hr.HeartRateConfig;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"NewApi"})
public class zxs {
    public static final UUID e = tet.F("180D");
    public static final UUID f = tet.F("2A39");
    public static final UUID g = tet.F("2A37");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AtomicInteger f41793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f41794b;
    public jg c;
    public lg d;

    public interface a {
        void onHeartRateChanged(int i);
    }

    public zxs(jet jetVar) {
        this(c(jetVar, f), c(jetVar, g));
    }

    public static n2 c(jet jetVar, UUID uuid) {
        return new nd(jetVar, e, uuid);
    }

    public void d(a aVar) {
        this.f41794b = aVar;
    }

    public final /* synthetic */ void e(byte[] bArr) {
        t5t.m("HMHeartRateProfile", "HeartRate:" + tet.x(bArr));
        a aVar = this.f41794b;
        if (aVar != null) {
            aVar.onHeartRateChanged(bArr[1] & 255);
        }
    }

    public synchronized boolean f() {
        t5t.d("HeartRateCenter", "deInit, referenceCount: " + this.f41793a.get());
        if (this.f41793a.get() > 1) {
            this.f41793a.decrementAndGet();
            return true;
        }
        if (this.f41793a.get() > 0) {
            this.f41793a.decrementAndGet();
        }
        return this.c.deInit() && this.d.a() && this.d.deInit();
    }

    public boolean g(int i) {
        return this.c.a(i);
    }

    public boolean h(jg.a aVar, jg.b bVar) {
        return this.c.a(aVar, bVar);
    }

    public final /* synthetic */ void i(byte[] bArr) {
        t5t.m("HMHeartRateProfile", "HeartRate:" + tet.x(bArr));
        a aVar = this.f41794b;
        if (aVar != null) {
            aVar.onHeartRateChanged(bArr[1] & 255);
        }
    }

    public synchronized boolean j() {
        t5t.d("HeartRateCenter", "deInit, referenceCount: " + this.f41793a.get());
        if (this.f41793a.get() > 1) {
            this.f41793a.decrementAndGet();
            return true;
        }
        if (this.f41793a.get() > 0) {
            this.f41793a.decrementAndGet();
        }
        return this.d.a() && this.d.deInit();
    }

    public boolean k() {
        return this.c.a();
    }

    public HeartRateConfig l() {
        return this.c.getHeartRateConfig();
    }

    public synchronized boolean m() {
        t5t.d("HeartRateCenter", "init, referenceCount: " + this.f41793a.get());
        boolean z = true;
        if (this.f41793a.get() > 0) {
            this.f41793a.incrementAndGet();
            return true;
        }
        if (!this.c.init() || !this.d.init() || !this.d.a(new w5() { // from class: xxs
            @Override // defpackage.w5
            public final void a(byte[] bArr) {
                this.f39573a.e(bArr);
            }
        })) {
            z = false;
        }
        if (z) {
            this.f41793a.incrementAndGet();
        }
        return z;
    }

    public synchronized boolean n() {
        t5t.d("HeartRateCenter", "init, referenceCount: " + this.f41793a.get());
        boolean z = true;
        if (this.f41793a.get() > 0) {
            this.f41793a.incrementAndGet();
            return true;
        }
        if (!this.d.init() || !this.d.a(new w5() { // from class: yxs
            @Override // defpackage.w5
            public final void a(byte[] bArr) {
                this.f40677a.i(bArr);
            }
        })) {
            z = false;
        }
        if (z) {
            this.f41793a.incrementAndGet();
        }
        return z;
    }

    public void o() {
        this.f41794b = null;
    }

    public zxs(n2 n2Var, n2 n2Var2) {
        this.f41793a = new AtomicInteger(0);
        this.f41794b = null;
        this.c = new kg(n2Var);
        this.d = new mg(n2Var2);
    }
}
