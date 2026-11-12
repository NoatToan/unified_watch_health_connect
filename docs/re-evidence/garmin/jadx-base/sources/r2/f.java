package r2;

import h4.r;
import h5.x0;
import kotlin.m2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B-\u0012$\u0010\b\u001a \b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lr2/f;", "Lh5/x0;", "Lr2/g;", "Lkotlin/Function2;", "Ln4/c;", "Lt13/d;", "", "", "onPreShowContextMenu", "<init>", "(Le23/p;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class f extends x0<g> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e23.p<n4.c, t13.d<? super Unit>, Object> f149436a;

    /* JADX WARN: Multi-variable type inference failed */
    public f(e23.p<? super n4.c, ? super t13.d<? super Unit>, ? extends Object> pVar) {
        this.f149436a = pVar;
    }

    @Override // h5.x0
    public final r.c create() {
        return new g(this.f149436a);
    }

    @Override // h5.x0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            return this.f149436a == ((f) obj).f149436a;
        }
        return false;
    }

    @Override // h5.x0
    public final int hashCode() {
        e23.p<n4.c, t13.d<? super Unit>, Object> pVar = this.f149436a;
        if (pVar != null) {
            return pVar.hashCode();
        }
        return 0;
    }

    @Override // h5.x0
    public final void inspectableProperties(m2 m2Var) {
        m2Var.f91341a = "TextContextMenuGestures";
        m2Var.f91343c.c(this.f149436a, "onPreShowContextMenu");
    }

    @Override // h5.x0
    public final void update(r.c cVar) {
        ((g) cVar).f149438c = this.f149436a;
    }
}
