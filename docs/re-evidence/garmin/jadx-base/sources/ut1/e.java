package ut1;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import c22.s3;
import com.garmin.android.apps.connectmobile.g3;
import e23.q;
import fw.p;
import o13.m;
import o13.r;
import o13.t;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import p13.u;
import q92.v;
import r53.b2;
import r53.k2;
import r53.m2;
import r53.p2;
import r53.q2;
import r53.s;
import uf2.p0;
import v13.i;
import ww1.e0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lut1/e;", "Landroidx/lifecycle/u1;", "<init>", "()V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final st1.a f172582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final st1.c f172583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f172584c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b2 f172585d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b2 f172586e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b2 f172587f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b2 f172588g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p2 f172589h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b2 f172590i;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lq92/v;", "consentStatus", "Lcom/garmin/android/apps/connectmobile/g3;", "Lww1/e0;", "activePlans", "", "<anonymous>", "(Lq92/v;Lcom/garmin/android/apps/connectmobile/g3;)Z"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.activeplans.presentation.viewmodel.ActiveTrainingPlansViewModel$isCoachSupported$1", f = "ActiveTrainingPlansViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements q<v, g3<? extends e0>, t13.d<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ v f172591a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ g3 f172592b;

        public a(t13.d<? super a> dVar) {
            super(3, dVar);
        }

        @Override // e23.q
        public final Object invoke(v vVar, g3<? extends e0> g3Var, t13.d<? super Boolean> dVar) {
            a aVar = new a(dVar);
            aVar.f172591a = vVar;
            aVar.f172592b = g3Var;
            return aVar.invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            e0 e0Var;
            v vVar = this.f172591a;
            g3 g3Var = this.f172592b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            if (!s3.b()) {
                return Boolean.TRUE;
            }
            if (vVar == null) {
                return null;
            }
            if ((g3Var != null ? g3Var.f35300a : null) == p.LOADING) {
                return null;
            }
            if (vVar.b()) {
                return Boolean.TRUE;
            }
            if (g3Var == null || (e0Var = (e0) g3Var.f35301b) == null) {
                return null;
            }
            return Boolean.valueOf(!h0.C0(e0Var.f187748a, u.C(new ww1.f[]{e0Var.f187749b, e0Var.f187750c, e0Var.f187751d, e0Var.f187752e})).isEmpty());
        }
    }

    public e() {
        uw1.b.f172999a.getClass();
        uw1.b bVar = new uw1.b();
        gu1.b bVarA = gu1.b.a.a(gu1.b.f79047b);
        t tVarB = m.b(new p0(19));
        st1.a aVar = new st1.a(bVarA, bVar, (zf0.d) tVarB.getValue());
        this.f172582a = aVar;
        st1.c cVar = new st1.c(bVar, bVarA, (zf0.d) tVarB.getValue());
        this.f172583b = cVar;
        b2 b2Var = aVar.f160852e;
        this.f172585d = b2Var;
        this.f172586e = aVar.f160853f;
        this.f172587f = cVar.f160874f;
        this.f172588g = cVar.f160875g;
        p2 p2VarA = q2.a(null);
        this.f172589h = p2VarA;
        r53.v vVar = new r53.v(new d(this, null), p2VarA);
        w9.a aVarA = v1.a(this);
        k2.f150703a.getClass();
        m2 m2Var = k2.a.f150706c;
        this.f172590i = s.K(new r53.u1(s.K(vVar, aVarA, m2Var, null), b2Var, new a(null)), v1.a(this), m2Var, null);
    }
}
