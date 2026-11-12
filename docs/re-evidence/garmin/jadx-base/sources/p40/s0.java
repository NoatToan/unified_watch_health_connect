package p40;

import c2.x2;
import p005kotlin.Unit;
import p3.p1;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class s0 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f135742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q40.b f135743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t0 f135744c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g0 f135745d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g0 f135746e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g0 f135747f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ g0 f135748g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ g0 f135749h;

    public /* synthetic */ s0(q40.b bVar, t0 t0Var, g0 g0Var, g0 g0Var2, g0 g0Var3, g0 g0Var4, g0 g0Var5, int i14) {
        this.f135742a = i14;
        this.f135743b = bVar;
        this.f135744c = t0Var;
        this.f135745d = g0Var;
        this.f135746e = g0Var2;
        this.f135747f = g0Var3;
        this.f135748g = g0Var4;
        this.f135749h = g0Var5;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0039  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f135742a) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(-1891139890, new s0(this.f135743b, this.f135744c, this.f135745d, this.f135746e, this.f135747f, this.f135748g, this.f135749h, 1), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    q40.b bVar = this.f135743b;
                    boolean zB = mVar2.B(bVar);
                    Object objQ = mVar2.q();
                    if (zB) {
                        objQ = p3.p0.n(bVar);
                        mVar2.K(objQ);
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = p3.p0.n(bVar);
                            mVar2.K(objQ);
                        }
                    }
                    p1 p1Var = (p1) objQ;
                    this.f135744c.f135759b = (q40.b) p1Var.getF182175a();
                    r0.d(x2.d(h4.r.S, 1.0f), (q40.b) p1Var.getF182175a(), this.f135745d, this.f135746e, this.f135747f, this.f135748g, this.f135749h, mVar2, 6);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
