package p002j6;

import e23.l;
import h4.r;
import h5.x0;
import kotlin.m2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B5\u0012,\u0010\b\u001a(\u0012\u001a\u0012\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003j\u0004\u0018\u0001`\u0006\u0012\u0004\u0012\u00020\u00050\u0003j\u0002`\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lj6/d;", "Lh5/x0;", "Lj6/f;", "Lkotlin/Function1;", "Ln4/d;", "", "Landroidx/compose/ui/viewinterop/BringIntoViewRequester;", "Landroidx/compose/ui/viewinterop/OnRequesterReady;", "onRequesterReady", "<init>", "(Le23/l;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class d extends x0<f> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l<l<? super n4.d, Unit>, Unit> f97226a;

    /* JADX WARN: Multi-variable type inference failed */
    public d(l<? super l<? super n4.d, Unit>, Unit> lVar) {
        this.f97226a = lVar;
    }

    @Override // h5.x0
    public final r.c create() {
        return new f(this.f97226a);
    }

    @Override // h5.x0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            return this.f97226a == ((d) obj).f97226a;
        }
        return false;
    }

    @Override // h5.x0
    public final int hashCode() {
        return this.f97226a.hashCode();
    }

    @Override // h5.x0
    public final void inspectableProperties(m2 m2Var) {
        m2Var.f91341a = "requestRectangleBringIntoViewBridge";
    }

    @Override // h5.x0
    public final void update(r.c cVar) {
        f fVar = (f) cVar;
        l<l<? super n4.d, Unit>, Unit> lVar = this.f97226a;
        fVar.f97231a = lVar;
        if (fVar.getIsAttached()) {
            lVar.invoke(fVar.f97232b);
        }
    }
}
