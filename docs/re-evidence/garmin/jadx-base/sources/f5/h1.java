package f5;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lf5/h1;", "Lh5/x0;", "Lf5/j1;", "Lkotlin/Function1;", "Lf5/c0;", "", "onGloballyPositioned", "<init>", "(Le23/l;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class h1 extends h5.x0<j1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e23.l<c0, Unit> f68956a;

    /* JADX WARN: Multi-variable type inference failed */
    public h1(e23.l<? super c0, Unit> lVar) {
        this.f68956a = lVar;
    }

    @Override // h5.x0
    public final h4.r.c create() {
        return new j1(this.f68956a);
    }

    @Override // h5.x0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h1) {
            return this.f68956a == ((h1) obj).f68956a;
        }
        return false;
    }

    @Override // h5.x0
    public final int hashCode() {
        return this.f68956a.hashCode();
    }

    @Override // h5.x0
    public final void inspectableProperties(kotlin.m2 m2Var) {
        m2Var.f91341a = "onGloballyPositioned";
        m2Var.f91343c.c(this.f68956a, "onGloballyPositioned");
    }

    @Override // h5.x0
    public final void update(h4.r.c cVar) {
        ((j1) cVar).f68976a = this.f68956a;
    }
}
