package c2;

import ch.qos.logback.core.CoreConstants;
import com.mapbox.maps.MapboxMap;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B7\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0003¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lc2/b2;", "Lh5/x0;", "Lc2/c2;", "Lkotlin/Function1;", "Lg6/c;", "Lg6/k;", MapboxMap.QFE_OFFSET, "", "rtlAware", "Li5/m2;", "", "inspectorInfo", "<init>", "(Le23/l;ZLe23/l;)V", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class b2 extends h5.x0<c2> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e23.l<g6.c, g6.k> f22604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f22605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e23.l<kotlin.m2, Unit> f22606c;

    /* JADX WARN: Multi-variable type inference failed */
    public b2(e23.l<? super g6.c, g6.k> lVar, boolean z14, e23.l<? super kotlin.m2, Unit> lVar2) {
        this.f22604a = lVar;
        this.f22605b = z14;
        this.f22606c = lVar2;
    }

    @Override // h5.x0
    public final h4.r.c create() {
        return new c2(this.f22604a, this.f22605b);
    }

    @Override // h5.x0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        b2 b2Var = obj instanceof b2 ? (b2) obj : null;
        return b2Var != null && this.f22604a == b2Var.f22604a && this.f22605b == b2Var.f22605b;
    }

    @Override // h5.x0
    public final int hashCode() {
        return Boolean.hashCode(this.f22605b) + (this.f22604a.hashCode() * 31);
    }

    @Override // h5.x0
    public final void inspectableProperties(kotlin.m2 m2Var) {
        this.f22606c.invoke(m2Var);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("OffsetPxModifier(offset=");
        sb3.append(this.f22604a);
        sb3.append(", rtlAware=");
        return am.j.t(sb3, this.f22605b, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    @Override // h5.x0
    public final void update(h4.r.c cVar) {
        c2 c2Var = (c2) cVar;
        e23.l<? super g6.c, g6.k> lVar = c2Var.f22611a;
        e23.l<g6.c, g6.k> lVar2 = this.f22604a;
        boolean z14 = this.f22605b;
        if (lVar != lVar2 || c2Var.f22612b != z14) {
            h5.e0 e0VarG = h5.k.g(c2Var);
            h5.e0.d dVar = h5.e0.N0;
            e0VarG.i0(false);
        }
        c2Var.f22611a = lVar2;
        c2Var.f22612b = z14;
    }
}
