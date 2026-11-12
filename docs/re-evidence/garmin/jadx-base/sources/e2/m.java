package e2;

import com.google.firebase.analytics.FirebaseAnalytics;
import g2.p1;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Le2/m;", "Lg2/u;", "Le2/j;", "Le2/f0;", "Lkotlin/Function1;", "", FirebaseAnalytics.Param.CONTENT, "<init>", "(Le23/l;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class m extends g2.u<j> implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p1<j> f62487a = new p1<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p1.h0 f62488b;

    public m(e23.l<? super f0, Unit> lVar) {
        lVar.invoke(this);
    }

    @Override // e2.f0
    public final void a(int i14, e23.l<? super Integer, ? extends Object> lVar, e23.l<? super Integer, ? extends Object> lVar2, e23.r<? super d, ? super Integer, ? super p3.m, ? super Integer, Unit> rVar) {
        this.f62487a.a(i14, new j(lVar, lVar2, rVar));
    }

    @Override // e2.f0
    public final void c(Object obj, e23.q qVar) {
        this.f62487a.a(1, new j(obj != null ? new k(obj, 0) : null, new dv0.n(18), new z3.e(-857469575, true, new l(qVar, 0))));
    }

    @Override // e2.f0
    public final void k(Object obj, z3.e eVar) {
        p1.h0 h0Var = this.f62488b;
        if (h0Var == null) {
            h0Var = new p1.h0(0, 1, null);
            this.f62488b = h0Var;
        }
        p1<j> p1Var = this.f62487a;
        h0Var.d(p1Var.f75198b);
        c(obj, new z3.e(-1588696110, true, new af1.l(eVar, p1Var.f75198b, 3)));
    }

    @Override // g2.u
    /* JADX INFO: renamed from: m, reason: from getter */
    public final p1 getF62487a() {
        return this.f62487a;
    }
}
