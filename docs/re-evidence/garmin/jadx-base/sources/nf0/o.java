package nf0;

import android.content.Context;
import android.net.Uri;
import android.widget.Toast;
import androidx.lifecycle.v1;
import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lnf0/o;", "Lnf0/d;", "", "deviceUnitId", "<init>", "(J)V", "a", "gcm-electrocardiogram_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class o extends d {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f125820q = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f125821c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final mv0.e f125822d = (mv0.e) KoinJavaComponent.get$default(mv0.e.class, null, null, 6, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public y0<g3<Unit>> f125823e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final y0<g3<Uri>> f125824f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final y0 f125825g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public x f125826h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final y0<Boolean> f125827i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final y0 f125828j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String[] f125829k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final jf0.a f125830l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final y0<Integer> f125831m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final y0<Integer> f125832n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final y0 f125833o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y0 f125834p;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.ecg.presentation.onboarding.OnboardingViewModel$requestFetchECGOnboardingVideoWithRetryCount$1", f = "OnboardingViewModel.kt", l = {282}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f125835a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f125836b;

        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            b bVar = o.this.new b(dVar);
            bVar.f125836b = obj;
            return bVar;
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            o53.b0 b0Var = (o53.b0) this.f125836b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f125835a;
            o oVar = o.this;
            try {
                if (i14 == 0) {
                    o13.r.b(obj);
                    oVar.f125824f.j(g3.a.c(g3.f35298f));
                    rd2.j jVar = rd2.f.a().f152045a;
                    long j8 = oVar.f125821c;
                    jVar.getClass();
                    sd2.f fVarI = rd2.j.i(j8, null);
                    String productNumber = fVarI != null ? fVarI.getProductNumber() : null;
                    if (productNumber == null) {
                        o.I4(oVar);
                    } else {
                        jf0.a aVar2 = (jf0.a) KoinJavaComponent.get$default(jf0.a.class, null, null, 6, null);
                        this.f125836b = b0Var;
                        this.f125835a = 1;
                        obj = aVar2.g(productNumber, (4 & 2) != 0, false, this);
                        if (obj == aVar) {
                            return aVar;
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
                String str = (String) obj;
                if (str == null || d53.w.J(str)) {
                    o.I4(oVar);
                } else {
                    oVar.f125831m.j(new Integer(0));
                    y0<g3<Uri>> y0Var = oVar.f125824f;
                    g3.a aVar3 = g3.f35298f;
                    Uri uri = Uri.parse(str);
                    aVar3.getClass();
                    y0Var.j(g3.a.d(uri));
                }
            } catch (Exception e4) {
                a2 a2Var = a2.ONBOARDING;
                String strD = com.airbnb.lottie.animation.keyframe.a.d(e4, "[requestFetchECGOnboardingVideoWithRetryCount] error: ");
                i2.f36769a.getClass();
                i2.a.f(a2Var, "EcgOnboardingViewModel", strD);
                o.I4(oVar);
            }
            return Unit.INSTANCE;
        }
    }

    static {
        new a(null);
    }

    public o(long j8) {
        this.f125821c = j8;
        y0<g3<Uri>> y0Var = new y0<>();
        this.f125824f = y0Var;
        this.f125825g = y0Var;
        y0<Boolean> y0Var2 = new y0<>(Boolean.FALSE);
        this.f125827i = y0Var2;
        this.f125828j = y0Var2;
        this.f125829k = new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"};
        this.f125830l = (jf0.a) KoinJavaComponent.get$default(jf0.a.class, null, null, 6, null);
        y0<Integer> y0Var3 = new y0<>(0);
        this.f125831m = y0Var3;
        y0<Integer> y0Var4 = new y0<>(0);
        this.f125832n = y0Var4;
        this.f125833o = y0Var3;
        this.f125834p = y0Var4;
    }

    public static final void H4(o oVar) {
        y0<Integer> y0Var = oVar.f125832n;
        Integer numD = y0Var.d();
        y0Var.j(Integer.valueOf((numD != null ? numD.intValue() : 0) + 1));
        oVar.f125824f.j(g3.a.a(g3.f35298f, "", null, null, null, 14));
    }

    public static final void I4(o oVar) {
        y0<Integer> y0Var = oVar.f125831m;
        Integer numD = y0Var.d();
        y0Var.j(Integer.valueOf((numD != null ? numD.intValue() : 0) + 1));
        oVar.f125824f.j(g3.a.a(g3.f35298f, "", null, null, null, 14));
    }

    public static final void J4(o oVar) {
        oVar.getClass();
        if (((bv.d) KoinJavaComponent.get$default(bv.d.class, null, null, 6, null)).O()) {
            Toast.makeText(((c22.o) KoinJavaComponent.get$default(c22.o.class, null, null, 6, null)).c(), "ECG not supported by device", 1).show();
        }
    }

    public final void K4() {
        this.f125827i.j(Boolean.TRUE);
    }

    public final boolean L4() {
        Context contextC = ((c22.o) KoinJavaComponent.get$default(c22.o.class, null, null, 6, null)).c();
        for (String str : this.f125829k) {
            if (a7.b.checkSelfPermission(contextC, str) == 0) {
                return true;
            }
        }
        return false;
    }

    public final void M4() {
        ge1.b.T(v1.a(this), null, null, new b(null), 3);
    }

    public final void N4() {
        x xVar = this.f125826h;
        if (xVar != null) {
            da2.d.b().f58886a.i(xVar);
        }
        this.f125826h = null;
    }

    @Override // androidx.lifecycle.u1
    public final void onCleared() {
        super.onCleared();
        N4();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lnf0/o$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-electrocardiogram_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
