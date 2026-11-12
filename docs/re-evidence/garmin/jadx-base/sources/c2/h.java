package c2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h4.d.b f22670b;

    public /* synthetic */ h(h4.d.b bVar, int i14) {
        this.f22669a = i14;
        this.f22670b = bVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f22669a;
        h4.d.b bVar = this.f22670b;
        switch (i14) {
            case 0:
                j jVar = j.f22691a;
                return Integer.valueOf(bVar.a(0, ((Integer) obj).intValue(), (g6.o) obj2));
            default:
                return g6.k.a((((long) bVar.a(0, (int) (((g6.m) obj).f76013a >> 32), (g6.o) obj2)) << 32) | (((long) 0) & 4294967295L));
        }
    }
}
