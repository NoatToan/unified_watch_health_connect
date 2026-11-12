package ky0;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a0 implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f107170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m3.r f107171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p3.p1 f107172c;

    public /* synthetic */ a0(m3.s sVar, p3.p1 p1Var, int i14) {
        this.f107170a = i14;
        this.f107171b = sVar;
        this.f107172c = p1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f107170a;
        p3.p1 p1Var = this.f107172c;
        switch (i14) {
            case 0:
                c2.t tVar = (c2.t) obj;
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                tVar.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= mVar.B(tVar) ? 4 : 2;
                }
                if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    m3.i iVar = m3.i.f116250a;
                    boolean zBooleanValue = ((Boolean) p1Var.getF182175a()).booleanValue();
                    gl.c.f77766a.getClass();
                    gl.e eVar = gl.c.f77767b;
                    long j8 = eVar.f77773c;
                    long j14 = eVar.f77797o;
                    h4.r.a aVar = h4.r.S;
                    h4.d.f81522a.getClass();
                    iVar.a(this.f107171b, zBooleanValue, tVar.c(aVar, h4.d.a.f81525c), j8, j14, 0.0f, mVar, 0, 32);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                c2.t tVar2 = (c2.t) obj;
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                tVar2.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= mVar2.B(tVar2) ? 4 : 2;
                }
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    p3.x1 x1Var2 = p3.n.f135158a;
                    m3.i iVar2 = m3.i.f116250a;
                    boolean zBooleanValue2 = ((Boolean) p1Var.getF182175a()).booleanValue();
                    gl.c.f77766a.getClass();
                    gl.e eVar2 = gl.c.f77767b;
                    long j15 = eVar2.f77773c;
                    long j16 = eVar2.f77797o;
                    h4.r.a aVar2 = h4.r.S;
                    h4.d.f81522a.getClass();
                    iVar2.a(this.f107171b, zBooleanValue2, h4.p.b(tVar2.c(aVar2, h4.d.a.f81525c), Float.MAX_VALUE), j15, j16, 0.0f, mVar2, 0, 32);
                } else {
                    mVar2.e();
                }
                break;
            case 2:
                c2.t tVar3 = (c2.t) obj;
                p3.m mVar3 = (p3.m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                tVar3.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= mVar3.B(tVar3) ? 4 : 2;
                }
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    p3.x1 x1Var3 = p3.n.f135158a;
                    m3.i iVar3 = m3.i.f116250a;
                    boolean zBooleanValue3 = ((Boolean) p1Var.getF182175a()).booleanValue();
                    gl.c.f77766a.getClass();
                    gl.e eVar3 = gl.c.f77767b;
                    long j17 = eVar3.f77773c;
                    long j18 = eVar3.f77797o;
                    h4.r.a aVar3 = h4.r.S;
                    h4.d.f81522a.getClass();
                    iVar3.a(this.f107171b, zBooleanValue3, h4.p.b(tVar3.c(aVar3, h4.d.a.f81525c), Float.MAX_VALUE), j17, j18, 0.0f, mVar3, 0, 32);
                } else {
                    mVar3.e();
                }
                break;
            default:
                c2.t tVar4 = (c2.t) obj;
                p3.m mVar4 = (p3.m) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                tVar4.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= mVar4.B(tVar4) ? 4 : 2;
                }
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    p3.x1 x1Var4 = p3.n.f135158a;
                    b82.f1.a(tVar4, ((Boolean) p1Var.getF182175a()).booleanValue(), this.f107171b, mVar4, iIntValue4 & 14);
                } else {
                    mVar4.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
