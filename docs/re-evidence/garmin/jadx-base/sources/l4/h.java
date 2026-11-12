package l4;

import h5.x0;
import kotlin.m2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ll4/h;", "Lh5/x0;", "Ll4/g;", "Lkotlin/Function1;", "Lq4/f;", "", "onDraw", "<init>", "(Le23/l;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class h extends x0<g> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e23.l<q4.f, Unit> f109848a;

    /* JADX WARN: Multi-variable type inference failed */
    public h(e23.l<? super q4.f, Unit> lVar) {
        this.f109848a = lVar;
    }

    @Override // h5.x0
    public final h4.r.c create() {
        return new g(this.f109848a);
    }

    @Override // h5.x0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            return this.f109848a == ((h) obj).f109848a;
        }
        return false;
    }

    @Override // h5.x0
    public final int hashCode() {
        return this.f109848a.hashCode();
    }

    @Override // h5.x0
    public final void inspectableProperties(m2 m2Var) {
        m2Var.f91341a = "drawBehind";
        m2Var.f91343c.c(this.f109848a, "onDraw");
    }

    @Override // h5.x0
    public final void update(h4.r.c cVar) {
        ((g) cVar).f109847a = this.f109848a;
    }
}
