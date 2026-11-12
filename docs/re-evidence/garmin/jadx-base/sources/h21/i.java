package h21;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class i implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f81089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o82.a f81090b;

    public /* synthetic */ i(o82.a aVar, int i14) {
        this.f81089a = i14;
        this.f81090b = aVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f81089a;
        o82.a aVar = this.f81090b;
        b63.o oVar = (b63.o) obj;
        switch (i14) {
            case 0:
                oVar.getClass();
                if (oVar.compareTo(aVar.f130844b) >= 0) {
                    return null;
                }
                b63.i.INSTANCE.getClass();
                return b63.q.e(oVar, 1, b63.i.f16190d);
            case 1:
                oVar.getClass();
                b63.i.INSTANCE.getClass();
                b63.o oVarE = b63.q.e(oVar, 1, b63.i.f16191e);
                if (oVarE.compareTo(aVar.f130844b) <= 0) {
                    return oVarE;
                }
                return null;
            case 2:
                v21.f fVar = v21.f.f175333a;
                oVar.getClass();
                if (oVar.compareTo(aVar.f130843a) <= 0) {
                    return null;
                }
                b63.i.INSTANCE.getClass();
                return b63.q.c(oVar, 1, b63.i.f16191e);
            default:
                v21.f fVar2 = v21.f.f175333a;
                oVar.getClass();
                b63.i.INSTANCE.getClass();
                if (b63.q.e(oVar, 6, b63.i.f16190d).compareTo(aVar.f130844b) < 0) {
                    return b63.q.e(oVar, 1, b63.i.f16191e);
                }
                return null;
        }
    }
}
