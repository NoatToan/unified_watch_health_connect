package c2;

import kotlin.v3;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lc2/f3;", "Lh5/x0;", "Lc2/g3;", "Lg6/f;", "minWidth", "minHeight", "<init>", "(FFLkotlin/jvm/internal/j;)V", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class f3 extends h5.x0<g3> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f22651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f22652b;

    /* JADX WARN: Illegal instructions before constructor call */
    public f3(float f14, float f15, int i14, p005kotlin.jvm.internal.j jVar) {
        if ((i14 & 1) != 0) {
            g6.f.f75994b.getClass();
            f14 = g6.f.f75996d;
        }
        if ((i14 & 2) != 0) {
            g6.f.f75994b.getClass();
            f15 = g6.f.f75996d;
        }
        this(f14, f15, null);
    }

    @Override // h5.x0
    public final h4.r.c create() {
        return new g3(this.f22651a, this.f22652b, null);
    }

    @Override // h5.x0
    public final boolean equals(Object obj) {
        if (!(obj instanceof f3)) {
            return false;
        }
        f3 f3Var = (f3) obj;
        return g6.f.c(this.f22651a, f3Var.f22651a) && g6.f.c(this.f22652b, f3Var.f22652b);
    }

    @Override // h5.x0
    public final int hashCode() {
        g6.f.a aVar = g6.f.f75994b;
        return Float.hashCode(this.f22652b) + (Float.hashCode(this.f22651a) * 31);
    }

    @Override // h5.x0
    public final void inspectableProperties(kotlin.m2 m2Var) {
        m2Var.f91341a = "defaultMinSize";
        v3 v3Var = m2Var.f91343c;
        v3Var.c(g6.f.a(this.f22651a), "minWidth");
        v3Var.c(g6.f.a(this.f22652b), "minHeight");
    }

    @Override // h5.x0
    public final void update(h4.r.c cVar) {
        g3 g3Var = (g3) cVar;
        g3Var.f22667a = this.f22651a;
        g3Var.f22668b = this.f22652b;
    }

    private f3(float f14, float f15) {
        this.f22651a = f14;
        this.f22652b = f15;
    }

    public /* synthetic */ f3(float f14, float f15, p005kotlin.jvm.internal.j jVar) {
        this(f14, f15);
    }
}
