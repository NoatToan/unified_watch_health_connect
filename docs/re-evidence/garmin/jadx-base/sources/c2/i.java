package c2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h4.d.c f22679b;

    public /* synthetic */ i(h4.d.c cVar, int i14) {
        this.f22678a = i14;
        this.f22679b = cVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f22678a;
        h4.d.c cVar = this.f22679b;
        switch (i14) {
            case 0:
                int iIntValue = ((Integer) obj).intValue();
                j jVar = j.f22691a;
                return Integer.valueOf(cVar.a(0, iIntValue));
            default:
                return g6.k.a((((long) cVar.a(0, (int) (((g6.m) obj).f76013a & 4294967295L))) & 4294967295L) | (((long) 0) << 32));
        }
    }
}
