package aq;

import android.os.Bundle;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Laq/u2;", "Landroidx/lifecycle/u1;", "Lam/m;", "activityRepo", "<init>", "(Lam/m;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class u2 extends androidx.lifecycle.u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final am.m f12259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.lifecycle.y0<w61.f<Object>> f12260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final androidx.lifecycle.y0<w61.f<Object>> f12261c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o13.t f12262d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o13.t f12263e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final androidx.lifecycle.w0<Object> f12264f;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements androidx.lifecycle.z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f12265a;

        public a(e23.l lVar) {
            lVar.getClass();
            this.f12265a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof androidx.lifecycle.z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f12265a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f12265a.invoke(obj);
        }
    }

    public u2(am.m mVar) {
        mVar.getClass();
        this.f12259a = mVar;
        this.f12260b = new androidx.lifecycle.y0<>();
        this.f12261c = new androidx.lifecycle.y0<>();
        this.f12262d = o13.m.b(new ak0.t(13));
        o13.t tVarB = o13.m.b(new ak0.t(14));
        this.f12263e = tVarB;
        androidx.lifecycle.w0<Object> w0Var = new androidx.lifecycle.w0<>();
        w0Var.n((androidx.lifecycle.y0) tVarB.getValue(), new a(new a42.i(12, w0Var, this)));
        this.f12264f = w0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object x4(u2 u2Var, v13.c cVar) {
        q2 q2Var;
        u2Var.getClass();
        if (cVar instanceof q2) {
            q2Var = (q2) cVar;
            int i14 = q2Var.f12168c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                q2Var.f12168c = i14 - Integer.MIN_VALUE;
            } else {
                q2Var = new q2(u2Var, cVar);
            }
        } else {
            q2Var = new q2(u2Var, cVar);
        }
        Object obj = q2Var.f12166a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = q2Var.f12168c;
        if (i15 == 0) {
            o13.r.b(obj);
            q2Var.f12168c = 1;
            if (o53.m0.b(5000L, q2Var) == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        u2Var.f12261c.m(new w61.f<>(new Integer(1)));
        return Unit.INSTANCE;
    }

    public final void y4(List<? extends Object> list) {
        list.getClass();
        o13.p<String, Long> pVarE = bm.m.e(list);
        if ((pVarE != null ? pVarE.f128594a : null) != null) {
            String str = pVarE.f128594a;
            Long l14 = pVarE.f128595b;
            List<String> listF = bm.m.f(str);
            if (listF == null || listF.size() <= 1) {
                return;
            }
            String str2 = listF.get(0);
            str2.getClass();
            String str3 = listF.get(1);
            str3.getClass();
            l14.getClass();
            ge1.b.T(androidx.lifecycle.v1.a(this), null, null, new s2(l14.longValue(), this, str2, str3, null), 3);
        }
    }

    public final androidx.lifecycle.y0 z4(long j8, am.x0 x0Var, boolean z14, boolean z15) {
        x0Var.getClass();
        is.a aVar = is.a.f94856a;
        String str = x0Var.f4358a;
        aVar.getClass();
        str.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("Screen", "ActivityDetails");
        bundle.putString("Action", "RestoreOriginal");
        bundle.putString("ActivityType", str);
        bundle.putBoolean("ExcludedFromPhysioMetrics", z15);
        bundle.putBoolean("Trimmed", z14);
        ht.a.f85464a.getClass();
        ht.a.a(bundle, "UserAction");
        if (am.z0.H(str)) {
            androidx.lifecycle.y0 y0Var = new androidx.lifecycle.y0();
            w9.a aVarA = androidx.lifecycle.v1.a(this);
            x53.c cVar = o53.s0.f129406a;
            ge1.b.T(aVarA, x53.b.f189152a, null, new t2(this, j8, y0Var, null), 2);
            return y0Var;
        }
        cw.a aVarM = cw.a.M();
        to.a aVar2 = new to.a(null, 1, null);
        aVarM.getClass();
        androidx.lifecycle.w0 w0VarK = new bm.k(j8, aVar2).k();
        w0VarK.getClass();
        return w0VarK;
    }
}
