package l72;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class z implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f111389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u4.d f111390b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f111391c;

    public /* synthetic */ z(u4.d dVar, boolean z14, int i14) {
        this.f111389a = 4;
        this.f111390b = dVar;
        this.f111391c = z14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f111389a) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                f0 f0Var = f0.f110999a;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    d92.b.f58623a.getClass();
                    i0.a(this.f111390b, d92.b.a(mVar).k().f63527d, this.f111391c, mVar, 0);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                f0.a aVar = f0.a.f111000a;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    p3.x1 x1Var2 = p3.n.f135158a;
                    d92.b.f58623a.getClass();
                    i0.a(this.f111390b, d92.b.a(mVar2).f().f63508c, this.f111391c, mVar2, 0);
                } else {
                    mVar2.e();
                }
                break;
            case 2:
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                f0.a aVar2 = f0.a.f111000a;
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    p3.x1 x1Var3 = p3.n.f135158a;
                    i0.a(this.f111390b, ds.e0.b(d92.b.f58623a, mVar3), this.f111391c, mVar3, 0);
                } else {
                    mVar3.e();
                }
                break;
            case 3:
                p3.m mVar4 = (p3.m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                f0.a aVar3 = f0.a.f111000a;
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    p3.x1 x1Var4 = p3.n.f135158a;
                    d92.b.f58623a.getClass();
                    i0.a(this.f111390b, d92.b.a(mVar4).f().c(), this.f111391c, mVar4, 0);
                } else {
                    mVar4.e();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                li0.z.i(this.f111390b, this.f111391c, (p3.m) obj, p3.p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ z(u4.d dVar, boolean z14, int i14, byte b14) {
        this.f111389a = i14;
        this.f111390b = dVar;
        this.f111391c = z14;
    }
}
