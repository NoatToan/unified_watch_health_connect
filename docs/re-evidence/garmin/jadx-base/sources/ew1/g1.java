package ew1;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class g1 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f66470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i1 f66471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f66472c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vt1.o f66473d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vt1.f f66474e;

    public /* synthetic */ g1(i1 i1Var, boolean z14, vt1.o oVar, vt1.f fVar, int i14) {
        this.f66470a = 2;
        this.f66471b = i1Var;
        this.f66472c = z14;
        this.f66473d = oVar;
        this.f66474e = fVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f66470a) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                i1.a aVar = i1.f66514e;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(190097790, new g1(this.f66471b, this.f66472c, this.f66473d, this.f66474e, 1, (byte) 0), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                i1.a aVar2 = i1.f66514e;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    p3.x1 x1Var2 = p3.n.f135158a;
                    this.f66471b.w6(this.f66472c, this.f66473d, this.f66474e, mVar2, 0);
                } else {
                    mVar2.e();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                i1.a aVar3 = i1.f66514e;
                this.f66471b.w6(this.f66472c, this.f66473d, this.f66474e, (p3.m) obj, p3.p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ g1(i1 i1Var, boolean z14, vt1.o oVar, vt1.f fVar, int i14, byte b14) {
        this.f66470a = i14;
        this.f66471b = i1Var;
        this.f66472c = z14;
        this.f66473d = oVar;
        this.f66474e = fVar;
    }
}
