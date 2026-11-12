package z2;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g0 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f201584a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r1 f201585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z3.e f201586c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o1 f201587d;

    public /* synthetic */ g0(o1 o1Var, r1 r1Var, z3.e eVar) {
        this.f201587d = o1Var;
        this.f201585b = r1Var;
        this.f201586c = eVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f201584a;
        o1 o1Var = this.f201587d;
        z3.e eVar = this.f201586c;
        r1 r1Var = this.f201585b;
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i14) {
            case 0:
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    gl1.y.c(o1Var, z3.f.c(-284825865, new g0(r1Var, eVar, o1Var), mVar), mVar, 48);
                } else {
                    mVar.e();
                }
                break;
            default:
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    p3.x1 x1Var2 = p3.n.f135158a;
                    p3.v.a(s1.f201786a.c(r1Var), z3.f.c(610483127, new p006l2.i0(eVar, o1Var), mVar), mVar, 56);
                } else {
                    mVar.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ g0(r1 r1Var, z3.e eVar, o1 o1Var) {
        this.f201585b = r1Var;
        this.f201586c = eVar;
        this.f201587d = o1Var;
    }
}
