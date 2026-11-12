package l4;

import h5.x0;
import kotlin.m2;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ll4/m;", "Lh5/x0;", "Ll4/c;", "Lkotlin/Function1;", "Ll4/f;", "Ll4/l;", "onBuildDrawCache", "<init>", "(Le23/l;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class m extends x0<c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e23.l<f, l> f109850a;

    /* JADX WARN: Multi-variable type inference failed */
    public m(e23.l<? super f, l> lVar) {
        this.f109850a = lVar;
    }

    @Override // h5.x0
    public final h4.r.c create() {
        return new c(new f(), this.f109850a);
    }

    @Override // h5.x0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m) {
            return this.f109850a == ((m) obj).f109850a;
        }
        return false;
    }

    @Override // h5.x0
    public final int hashCode() {
        return this.f109850a.hashCode();
    }

    @Override // h5.x0
    public final void inspectableProperties(m2 m2Var) {
        m2Var.f91341a = "drawWithCache";
        m2Var.f91343c.c(this.f109850a, "onBuildDrawCache");
    }

    @Override // h5.x0
    public final void update(h4.r.c cVar) {
        c cVar2 = (c) cVar;
        cVar2.f109840d = this.f109850a;
        cVar2.l0();
    }
}
