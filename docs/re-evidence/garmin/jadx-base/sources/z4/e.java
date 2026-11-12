package z4;

import e23.l;
import h4.r;
import h5.x0;
import kotlin.m2;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B3\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lz4/e;", "Lh5/x0;", "Lz4/h;", "Lkotlin/Function1;", "Lz4/b;", "", "onKeyEvent", "onPreKeyEvent", "<init>", "(Le23/l;Le23/l;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class e extends x0<h> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l<b, Boolean> f202311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l<b, Boolean> f202312b;

    /* JADX WARN: Multi-variable type inference failed */
    public e(l<? super b, Boolean> lVar, l<? super b, Boolean> lVar2) {
        this.f202311a = lVar;
        this.f202312b = lVar2;
    }

    @Override // h5.x0
    public final r.c create() {
        return new h(this.f202311a, this.f202312b);
    }

    @Override // h5.x0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f202311a == eVar.f202311a && this.f202312b == eVar.f202312b;
    }

    @Override // h5.x0
    public final int hashCode() {
        l<b, Boolean> lVar = this.f202311a;
        int iHashCode = (lVar != null ? lVar.hashCode() : 0) * 31;
        l<b, Boolean> lVar2 = this.f202312b;
        return iHashCode + (lVar2 != null ? lVar2.hashCode() : 0);
    }

    @Override // h5.x0
    public final void inspectableProperties(m2 m2Var) {
        l<b, Boolean> lVar = this.f202311a;
        if (lVar != null) {
            m2Var.f91341a = "onKeyEvent";
            m2Var.f91343c.c(lVar, "onKeyEvent");
        }
        l<b, Boolean> lVar2 = this.f202312b;
        if (lVar2 != null) {
            m2Var.f91341a = "onPreviewKeyEvent";
            m2Var.f91343c.c(lVar2, "onPreviewKeyEvent");
        }
    }

    @Override // h5.x0
    public final void update(r.c cVar) {
        h hVar = (h) cVar;
        hVar.f202313a = this.f202311a;
        hVar.f202314b = this.f202312b;
    }
}
