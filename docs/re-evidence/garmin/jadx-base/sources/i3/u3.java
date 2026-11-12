package i3;

import java.io.IOException;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u3 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f89865a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f89866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f89867c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f89868d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f89869e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f89870f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f89871g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f89872h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f89873i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f89874j;

    public /* synthetic */ u3(h4.r rVar, m4.q qVar, e23.p pVar, String str, p006l2.a2 a2Var, a2.j jVar, p3.p1 p1Var, long j8, String str2) {
        this.f89867c = rVar;
        this.f89868d = qVar;
        this.f89869e = pVar;
        this.f89870f = str;
        this.f89871g = a2Var;
        this.f89872h = jVar;
        this.f89873i = p1Var;
        this.f89866b = j8;
        this.f89874j = str2;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0112  */
    /* JADX WARN: Code duplicated, block: B:47:0x013a  */
    /* JADX WARN: Code duplicated, block: B:52:0x0171  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) throws IOException {
        int i14 = this.f89865a;
        Object obj3 = this.f89874j;
        Object obj4 = this.f89873i;
        Object obj5 = this.f89872h;
        Object obj6 = this.f89871g;
        Object obj7 = this.f89870f;
        Object obj8 = this.f89869e;
        Object obj9 = this.f89868d;
        Object obj10 = this.f89867c;
        switch (i14) {
            case 0:
                ((Integer) obj2).getClass();
                x3.c((Long) obj10, this.f89866b, (e23.l) obj9, (e23.l) obj8, (l3.e0) obj7, (j23.l) obj6, (l3) obj5, (bc) obj4, (b3) obj3, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 1:
                h4.r rVar = (h4.r) obj10;
                m4.q qVar = (m4.q) obj9;
                e23.p pVar = (e23.p) obj8;
                String str = (String) obj7;
                p006l2.a2 a2Var = (p006l2.a2) obj6;
                a2.j jVar = (a2.j) obj5;
                p3.p1 p1Var = (p3.p1) obj4;
                String str2 = (String) obj3;
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(1 & iIntValue, (iIntValue & 3) != 2)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    g6.f.a aVar = g6.f.f75994b;
                    h4.r rVarH = c2.x2.h(rVar, 42);
                    x5.l0 l0Var = (x5.l0) p1Var.getF182175a();
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    s5.x0 x0VarB = d92.c.b(j92.f.f97931h, mVar);
                    boolean zR = mVar.r(qVar) | mVar.B(pVar) | mVar.B(str);
                    Object objQ = mVar.q();
                    p3.m.a aVar2 = p3.m.f135153a;
                    if (zR) {
                        objQ = new b82.q0(qVar, pVar, str, 2);
                        mVar.K(objQ);
                    } else {
                        aVar2.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new b82.q0(qVar, pVar, str, 2);
                            mVar.K(objQ);
                        }
                    }
                    e23.l lVar = (e23.l) objQ;
                    boolean zR2 = mVar.r(qVar) | mVar.B(pVar) | mVar.B(str);
                    Object objQ2 = mVar.q();
                    if (zR2) {
                        objQ2 = new b82.q0(qVar, pVar, str, 3);
                        mVar.K(objQ2);
                    } else {
                        aVar2.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new b82.q0(qVar, pVar, str, 3);
                            mVar.K(objQ2);
                        }
                    }
                    p006l2.z1 z1Var = new p006l2.z1(lVar, null, null, null, (e23.l) objQ2, null, 46, null);
                    o4.t1 t1Var = new o4.t1(ds.e0.e(mVar), null);
                    boolean zB = mVar.B(pVar);
                    Object objQ3 = mVar.q();
                    if (zB) {
                        objQ3 = new et1.i(pVar, p1Var, 3);
                        mVar.K(objQ3);
                    } else {
                        aVar2.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new et1.i(pVar, p1Var, 3);
                            mVar.K(objQ3);
                        }
                    }
                    p006l2.r.c(l0Var, (e23.l) objQ3, rVarH, false, false, x0VarB, a2Var, z1Var, true, 0, 0, null, null, jVar, t1Var, z3.f.c(-196118279, new ho.x(this.f89866b, str, jVar, str2, 4), mVar), mVar, 100663296, 196608, 7704);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            default:
                p005kotlin.jvm.internal.m0 m0Var = (p005kotlin.jvm.internal.m0) obj10;
                p005kotlin.jvm.internal.q0 q0Var = (p005kotlin.jvm.internal.q0) obj9;
                w63.b0 b0Var = (w63.b0) obj8;
                p005kotlin.jvm.internal.q0 q0Var2 = (p005kotlin.jvm.internal.q0) obj7;
                p005kotlin.jvm.internal.q0 q0Var3 = (p005kotlin.jvm.internal.q0) obj6;
                p005kotlin.jvm.internal.r0 r0Var = (p005kotlin.jvm.internal.r0) obj5;
                p005kotlin.jvm.internal.r0 r0Var2 = (p005kotlin.jvm.internal.r0) obj4;
                p005kotlin.jvm.internal.r0 r0Var3 = (p005kotlin.jvm.internal.r0) obj3;
                int iIntValue2 = ((Integer) obj).intValue();
                long jLongValue = ((Long) obj2).longValue();
                if (iIntValue2 != 1) {
                    if (iIntValue2 == 10) {
                        if (jLongValue < 4) {
                            vb.h.C("bad zip: NTFS extra too short");
                            return null;
                        }
                        b0Var.skip(4L);
                        x63.k.e(b0Var, (int) (jLongValue - 4), new x63.i(r0Var, b0Var, r0Var2, r0Var3));
                    }
                } else {
                    if (m0Var.f105804a) {
                        vb.h.C("bad zip: zip64 extra repeated");
                        return null;
                    }
                    m0Var.f105804a = true;
                    if (jLongValue < this.f89866b) {
                        vb.h.C("bad zip: zip64 extra too short");
                        return null;
                    }
                    long jE = q0Var.f105808a;
                    if (jE == 4294967295L) {
                        jE = b0Var.e();
                    }
                    q0Var.f105808a = jE;
                    q0Var2.f105808a = q0Var2.f105808a == 4294967295L ? b0Var.e() : 0L;
                    q0Var3.f105808a = q0Var3.f105808a == 4294967295L ? b0Var.e() : 0L;
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ u3(Long l14, long j8, e23.l lVar, e23.l lVar2, l3.e0 e0Var, j23.l lVar3, l3 l3Var, bc bcVar, b3 b3Var, int i14) {
        this.f89867c = l14;
        this.f89866b = j8;
        this.f89868d = lVar;
        this.f89869e = lVar2;
        this.f89870f = e0Var;
        this.f89871g = lVar3;
        this.f89872h = l3Var;
        this.f89873i = bcVar;
        this.f89874j = b3Var;
    }

    public /* synthetic */ u3(p005kotlin.jvm.internal.m0 m0Var, long j8, p005kotlin.jvm.internal.q0 q0Var, w63.b0 b0Var, p005kotlin.jvm.internal.q0 q0Var2, p005kotlin.jvm.internal.q0 q0Var3, p005kotlin.jvm.internal.r0 r0Var, p005kotlin.jvm.internal.r0 r0Var2, p005kotlin.jvm.internal.r0 r0Var3) {
        this.f89867c = m0Var;
        this.f89866b = j8;
        this.f89868d = q0Var;
        this.f89869e = b0Var;
        this.f89870f = q0Var2;
        this.f89871g = q0Var3;
        this.f89872h = r0Var;
        this.f89873i = r0Var2;
        this.f89874j = r0Var3;
    }
}
