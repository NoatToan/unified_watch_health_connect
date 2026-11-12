package b43;

/* JADX INFO: loaded from: classes3.dex */
public final class q implements e23.l<t23.b, Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t23.e f15732a;

    public q(t23.e eVar) {
        this.f15732a = eVar;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0020  */
    @Override // e23.l
    public final Boolean invoke(t23.b bVar) {
        boolean z14;
        t23.b bVar2 = bVar;
        if (t23.q.e(bVar2.getVisibility())) {
            z14 = false;
        } else {
            t23.e eVar = this.f15732a;
            if (eVar == null) {
                t23.q.a(3);
                throw null;
            }
            if (t23.q.c(t23.q.f162059n, bVar2, eVar) == null) {
                z14 = true;
            } else {
                z14 = false;
            }
        }
        return Boolean.valueOf(z14);
    }
}
