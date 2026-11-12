package q83;

/* JADX INFO: loaded from: classes11.dex */
public class l implements j83.b.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m.f f143430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m.a f143431b;

    public l(m.a aVar, m.f fVar) {
        this.f143431b = aVar;
        this.f143430a = fVar;
    }

    @Override // n83.b
    public final void call(j83.d dVar) {
        m.c cVar;
        j83.d dVar2 = dVar;
        m.f fVar = this.f143430a;
        dVar2.b(fVar);
        j83.h.a aVar = this.f143431b.f143437a;
        int i14 = m.f.f143444a;
        j83.o oVar = fVar.get();
        if (oVar != m.f143433e && oVar == (cVar = m.f143432d)) {
            j83.o oVarA = fVar.a(aVar, dVar2);
            if (fVar.compareAndSet(cVar, oVarA)) {
                return;
            }
            oVarA.f();
        }
    }
}
