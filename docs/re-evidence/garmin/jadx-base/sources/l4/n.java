package l4;

import h5.x0;
import kotlin.m2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ll4/n;", "Lh5/x0;", "Ll4/o;", "Lkotlin/Function1;", "Lq4/c;", "", "onDraw", "<init>", "(Le23/l;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class n extends x0<o> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e23.l<q4.c, Unit> f109851a;

    /* JADX WARN: Multi-variable type inference failed */
    public n(e23.l<? super q4.c, Unit> lVar) {
        this.f109851a = lVar;
    }

    @Override // h5.x0
    public final h4.r.c create() {
        return new o(this.f109851a);
    }

    @Override // h5.x0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n) {
            return this.f109851a == ((n) obj).f109851a;
        }
        return false;
    }

    @Override // h5.x0
    public final int hashCode() {
        return this.f109851a.hashCode();
    }

    @Override // h5.x0
    public final void inspectableProperties(m2 m2Var) {
        m2Var.f91341a = "drawWithContent";
        m2Var.f91343c.c(this.f109851a, "onDraw");
    }

    @Override // h5.x0
    public final void update(h4.r.c cVar) {
        ((o) cVar).f109852a = this.f109851a;
    }
}
