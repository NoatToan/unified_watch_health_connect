package f5;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\u0012\u001e\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0003¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lf5/e0;", "Lh5/x0;", "Lf5/p0;", "Lkotlin/Function3;", "Lf5/b1;", "Lf5/y0;", "Lg6/a;", "Lf5/a1;", "measure", "<init>", "(Le23/q;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class e0 extends h5.x0<p0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e23.q<b1, y0, g6.a, a1> f68930a;

    /* JADX WARN: Multi-variable type inference failed */
    public e0(e23.q<? super b1, ? super y0, ? super g6.a, ? extends a1> qVar) {
        this.f68930a = qVar;
    }

    @Override // h5.x0
    public final h4.r.c create() {
        return new p0(this.f68930a);
    }

    @Override // h5.x0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e0) {
            return this.f68930a == ((e0) obj).f68930a;
        }
        return false;
    }

    @Override // h5.x0
    public final int hashCode() {
        return this.f68930a.hashCode();
    }

    @Override // h5.x0
    public final void inspectableProperties(kotlin.m2 m2Var) {
        m2Var.f91341a = TtmlNode.TAG_LAYOUT;
        m2Var.f91343c.c(this.f68930a, "measure");
    }

    @Override // h5.x0
    public final void update(h4.r.c cVar) {
        ((p0) cVar).f69016a = this.f68930a;
    }
}
