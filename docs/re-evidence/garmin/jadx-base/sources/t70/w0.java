package t70;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class w0 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f163043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i02.f f163044b;

    public /* synthetic */ w0(i02.f fVar, int i14) {
        this.f163043a = i14;
        this.f163044b = fVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        boolean zEquals;
        int i14 = this.f163043a;
        i02.f fVar = this.f163044b;
        String str = (String) obj;
        switch (i14) {
            case 0:
                int i15 = x0.A;
                str.getClass();
                zEquals = str.equals(fVar.f86852b);
                break;
            default:
                int i16 = x0.A;
                str.getClass();
                zEquals = str.equals(fVar.f86852b);
                break;
        }
        return Boolean.valueOf(zEquals);
    }
}
