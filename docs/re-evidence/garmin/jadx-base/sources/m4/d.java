package m4;

import h5.x0;
import kotlin.m2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lm4/d;", "Lh5/x0;", "Lm4/f;", "Lkotlin/Function1;", "Lm4/g0;", "", "onFocusChanged", "<init>", "(Le23/l;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class d extends x0<f> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e23.l<g0, Unit> f116462a;

    /* JADX WARN: Multi-variable type inference failed */
    public d(e23.l<? super g0, Unit> lVar) {
        this.f116462a = lVar;
    }

    @Override // h5.x0
    public final h4.r.c create() {
        return new f(this.f116462a);
    }

    @Override // h5.x0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            return this.f116462a == ((d) obj).f116462a;
        }
        return false;
    }

    @Override // h5.x0
    public final int hashCode() {
        return this.f116462a.hashCode();
    }

    @Override // h5.x0
    public final void inspectableProperties(m2 m2Var) {
        m2Var.f91341a = "onFocusChanged";
        m2Var.f91343c.c(this.f116462a, "onFocusChanged");
    }

    @Override // h5.x0
    public final void update(h4.r.c cVar) {
        ((f) cVar).f116463a = this.f116462a;
    }
}
