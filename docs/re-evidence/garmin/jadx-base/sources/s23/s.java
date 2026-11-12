package s23;

/* JADX INFO: loaded from: classes3.dex */
public class s implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f156287a;

    public s(u uVar) {
        this.f156287a = uVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0024  */
    @Override // e23.l
    public final Object invoke(Object obj) {
        boolean z14;
        t23.b bVar = (t23.b) obj;
        k23.l<Object>[] lVarArr = u.f156289i;
        if (bVar.getKind() == t23.b.a.DECLARATION) {
            d dVar = this.f156287a.f156291b;
            t23.l lVarD = bVar.d();
            lVarD.getClass();
            dVar.getClass();
            if (d.b((t23.e) lVarD)) {
                z14 = true;
            } else {
                z14 = false;
            }
        } else {
            z14 = false;
        }
        return Boolean.valueOf(z14);
    }
}
