package bd0;

/* JADX INFO: loaded from: classes8.dex */
public class w implements u.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f17630a;

    public w(v vVar) {
        this.f17630a = vVar;
    }

    @Override // bd0.u.b
    public final void b(yl2.e eVar) {
        v.c cVar = this.f17630a.f17620a;
        if (cVar != null) {
            cVar.b(eVar);
        }
    }

    @Override // bd0.u.b
    public final void c() {
        v.c cVar = this.f17630a.f17620a;
        if (cVar != null) {
            cVar.c();
        }
    }
}
