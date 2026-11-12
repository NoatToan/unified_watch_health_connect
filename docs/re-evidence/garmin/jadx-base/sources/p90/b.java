package p90;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.google.maps.android.BuildConfig;
import o13.r;
import o53.b0;
import o53.c0;
import o53.m0;
import o53.m1;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v.e0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000bB%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lp90/b;", "Lo53/b0;", "Lrm2/f;", "pairingPasskeyCallback", "", "timeoutInSeconds", "Lkotlin/Function0;", "", "onComplete", "<init>", "(Lrm2/f;ILe23/a;)V", "b", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rm2.f f136459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f136460b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e23.a<Unit> f136461c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t13.g f136462d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f136463e;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.domain.pairing.BleDevicePairRequestPasskey$1", f = "BleDevicePairRequestPasskey.kt", l = {26}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f136464a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f136465b;

        public a(t13.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = b.this.new a(dVar);
            aVar.f136465b = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            b0 b0Var = (b0) this.f136465b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f136464a;
            b bVar = b.this;
            if (i14 == 0) {
                r.b(obj);
                long j8 = ((long) bVar.f136460b) * 1000;
                this.f136465b = b0Var;
                this.f136464a = 1;
                if (m0.b(j8, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            a2 a2Var = a2.DEVICE_SETUP;
            String strF = e0.f(bVar.f136460b, "Passkey request timed out after ", " seconds");
            i2.f36769a.getClass();
            i2.a.b(a2Var, "BleDevicePairRequestPasskey", strF);
            bVar.a(null);
            return Unit.INSTANCE;
        }
    }

    static {
        new C2589b(null);
    }

    public b(rm2.f fVar, int i14, e23.a<Unit> aVar) {
        fVar.getClass();
        aVar.getClass();
        this.f136459a = fVar;
        this.f136460b = i14;
        this.f136461c = aVar;
        m1 m1VarC = g8.i.c();
        x53.c cVar = s0.f129406a;
        this.f136462d = t13.g.a.C3052a.d(u53.o.f168762a, m1VarC);
        ge1.b.T(this, null, null, new a(null), 3);
    }

    public final void a(String str) {
        if (this.f136463e) {
            return;
        }
        this.f136463e = true;
        c0.c(this, null);
        a2 a2Var = a2.DEVICE_SETUP;
        String strConcat = "Received passkey response: ".concat(str != null ? "****" : BuildConfig.TRAVIS);
        i2.f36769a.getClass();
        i2.a.b(a2Var, "BleDevicePairRequestPasskey", strConcat);
        ((sm2.o) this.f136459a).o(str);
        this.f136461c.invoke();
    }

    @Override // o53.b0
    /* JADX INFO: renamed from: getCoroutineContext, reason: from getter */
    public final t13.g getF195311f() {
        return this.f136462d;
    }

    /* JADX INFO: renamed from: p90.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lp90/b$b;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C2589b {
        public /* synthetic */ C2589b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C2589b() {
        }
    }
}
