package a5;

import h4.r;
import h5.x0;
import kotlin.m2;
import kotlin.v3;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"La5/e;", "Lh5/x0;", "La5/g;", "La5/a;", "connection", "La5/b;", "dispatcher", "<init>", "(La5/a;La5/b;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class e extends x0<g> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f1216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f1217b;

    public e(a aVar, b bVar) {
        this.f1216a = aVar;
        this.f1217b = bVar;
    }

    @Override // h5.x0
    public final r.c create() {
        return new g(this.f1216a, this.f1217b);
    }

    @Override // h5.x0
    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return s.g(eVar.f1216a, this.f1216a) && s.g(eVar.f1217b, this.f1217b);
    }

    @Override // h5.x0
    public final int hashCode() {
        int iHashCode = this.f1216a.hashCode() * 31;
        b bVar = this.f1217b;
        return iHashCode + (bVar != null ? bVar.hashCode() : 0);
    }

    @Override // h5.x0
    public final void inspectableProperties(m2 m2Var) {
        m2Var.f91341a = "nestedScroll";
        v3 v3Var = m2Var.f91343c;
        v3Var.c(this.f1216a, "connection");
        v3Var.c(this.f1217b, "dispatcher");
    }

    @Override // h5.x0
    public final void update(r.c cVar) {
        g gVar = (g) cVar;
        gVar.f1218a = this.f1216a;
        b bVar = gVar.f1219b;
        if (bVar.f1205a == gVar) {
            bVar.f1205a = null;
        }
        b bVar2 = this.f1217b;
        if (bVar2 == null) {
            gVar.f1219b = new b();
        } else if (!bVar2.equals(bVar)) {
            gVar.f1219b = bVar2;
        }
        if (gVar.getIsAttached()) {
            b bVar3 = gVar.f1219b;
            bVar3.f1205a = gVar;
            bVar3.f1206b = null;
            gVar.f1220c = null;
            bVar3.f1207c = new h(gVar);
            gVar.f1219b.f1208d = gVar.getCoroutineScope();
        }
    }
}
