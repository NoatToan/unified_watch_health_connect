package c2;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lc2/d;", "Lh5/x0;", "Lc2/e;", "Lf5/a;", "alignmentLine", "Lg6/f;", TtmlNode.ANNOTATION_POSITION_BEFORE, TtmlNode.ANNOTATION_POSITION_AFTER, "Lkotlin/Function1;", "Li5/m2;", "", "inspectorInfo", "<init>", "(Lf5/a;FFLe23/l;Lkotlin/jvm/internal/j;)V", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class d extends h5.x0<e> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f5.a f22615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f22616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f22617c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e23.l<kotlin.m2, Unit> f22618d;

    /* JADX WARN: Multi-variable type inference failed */
    private d(f5.a aVar, float f14, float f15, e23.l<? super kotlin.m2, Unit> lVar) {
        this.f22615a = aVar;
        this.f22616b = f14;
        this.f22617c = f15;
        this.f22618d = lVar;
        boolean z14 = true;
        boolean z15 = f14 >= 0.0f || Float.isNaN(f14);
        if (f15 < 0.0f && !Float.isNaN(f15)) {
            z14 = false;
        }
        if (!z15 || !z14) {
            d2.a.a("Padding from alignment line must be a non-negative number");
        }
    }

    @Override // h5.x0
    public final h4.r.c create() {
        return new e(this.f22615a, this.f22616b, this.f22617c, null);
    }

    @Override // h5.x0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        d dVar = obj instanceof d ? (d) obj : null;
        return dVar != null && p005kotlin.jvm.internal.s.g(this.f22615a, dVar.f22615a) && g6.f.c(this.f22616b, dVar.f22616b) && g6.f.c(this.f22617c, dVar.f22617c);
    }

    @Override // h5.x0
    public final int hashCode() {
        int iHashCode = this.f22615a.hashCode() * 31;
        g6.f.a aVar = g6.f.f75994b;
        return Float.hashCode(this.f22617c) + q6.f.d(this.f22616b, iHashCode, 31);
    }

    @Override // h5.x0
    public final void inspectableProperties(kotlin.m2 m2Var) {
        this.f22618d.invoke(m2Var);
    }

    @Override // h5.x0
    public final void update(h4.r.c cVar) {
        e eVar = (e) cVar;
        eVar.f22625a = this.f22615a;
        eVar.f22626b = this.f22616b;
        eVar.f22627c = this.f22617c;
    }

    public /* synthetic */ d(f5.a aVar, float f14, float f15, e23.l lVar, p005kotlin.jvm.internal.j jVar) {
        this(aVar, f14, f15, lVar);
    }
}
