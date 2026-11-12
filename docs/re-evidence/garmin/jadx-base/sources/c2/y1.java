package c2;

import ch.qos.logback.core.CoreConstants;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lc2/y1;", "Lh5/x0;", "Lc2/a2;", "Lg6/f;", "x", JWKParameterNames.ELLIPTIC_CURVE_Y_COORDINATE, "", "rtlAware", "Lkotlin/Function1;", "Li5/m2;", "", "inspectorInfo", "<init>", "(FFZLe23/l;Lkotlin/jvm/internal/j;)V", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class y1 extends h5.x0<a2> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f22950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f22951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f22952c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e23.l<kotlin.m2, Unit> f22953d;

    /* JADX WARN: Multi-variable type inference failed */
    private y1(float f14, float f15, boolean z14, e23.l<? super kotlin.m2, Unit> lVar) {
        this.f22950a = f14;
        this.f22951b = f15;
        this.f22952c = z14;
        this.f22953d = lVar;
    }

    @Override // h5.x0
    public final h4.r.c create() {
        return new a2(this.f22950a, this.f22951b, this.f22952c, null);
    }

    @Override // h5.x0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        y1 y1Var = obj instanceof y1 ? (y1) obj : null;
        return y1Var != null && g6.f.c(this.f22950a, y1Var.f22950a) && g6.f.c(this.f22951b, y1Var.f22951b) && this.f22952c == y1Var.f22952c;
    }

    @Override // h5.x0
    public final int hashCode() {
        g6.f.a aVar = g6.f.f75994b;
        return Boolean.hashCode(this.f22952c) + q6.f.d(this.f22951b, Float.hashCode(this.f22950a) * 31, 31);
    }

    @Override // h5.x0
    public final void inspectableProperties(kotlin.m2 m2Var) {
        this.f22953d.invoke(m2Var);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("OffsetModifierElement(x=");
        tn.k.l(this.f22950a, ", y=", sb3);
        tn.k.l(this.f22951b, ", rtlAware=", sb3);
        return am.j.t(sb3, this.f22952c, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    @Override // h5.x0
    public final void update(h4.r.c cVar) {
        a2 a2Var = (a2) cVar;
        float f14 = a2Var.f22589a;
        float f15 = this.f22950a;
        boolean zC = g6.f.c(f14, f15);
        float f16 = this.f22951b;
        boolean z14 = this.f22952c;
        if (!zC || !g6.f.c(a2Var.f22590b, f16) || a2Var.f22591c != z14) {
            h5.e0 e0VarG = h5.k.g(a2Var);
            h5.e0.d dVar = h5.e0.N0;
            e0VarG.i0(false);
        }
        a2Var.f22589a = f15;
        a2Var.f22590b = f16;
        a2Var.f22591c = z14;
    }

    public /* synthetic */ y1(float f14, float f15, boolean z14, e23.l lVar, p005kotlin.jvm.internal.j jVar) {
        this(f14, f15, z14, lVar);
    }
}
