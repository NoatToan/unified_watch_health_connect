package rr0;

import android.content.Context;
import b82.k0;
import c2.x2;
import ds.e0;
import i3.ba;
import i3.eh;
import i3.sg;
import m4.b0;
import o4.d0;
import o72.h3;
import p005kotlin.Unit;
import p006l2.a2;
import p006l2.z1;
import p3.x1;
import s5.w0;
import s5.x0;
import x5.f0;
import x5.l0;
import x5.r0;
import z2.t2;
import z2.u2;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class k implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f154218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f154219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b0 f154220c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.l f154221d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m4.q f154222e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Integer f154223f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Context f154224g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ e23.l f154225h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f154226i;

    public /* synthetic */ k(String str, b0 b0Var, e23.l lVar, m4.q qVar, Integer num, Context context, e23.l lVar2, String str2, int i14) {
        this.f154218a = i14;
        this.f154219b = str;
        this.f154220c = b0Var;
        this.f154221d = lVar;
        this.f154222e = qVar;
        this.f154223f = num;
        this.f154224g = context;
        this.f154225h = lVar2;
        this.f154226i = str2;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0069  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        switch (this.f154218a) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(1 & iIntValue, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    d92.b.f58623a.getClass();
                    p3.v.a(u2.f201804a.c(new t2(d92.b.a(mVar).k().a(), d0.c(0.4f, d92.b.a(mVar).k().a(), 14), null)), z3.f.c(-62594088, new k(this.f154219b, this.f154220c, this.f154221d, this.f154222e, this.f154223f, this.f154224g, this.f154225h, this.f154226i, 1), mVar), mVar, 56);
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    String str = this.f154219b;
                    String str2 = str == null ? "" : str;
                    int length = str != null ? str.length() : 0;
                    l0 l0Var = new l0(str2, og.a.l(length, length), (w0) null, 4, (p005kotlin.jvm.internal.j) null);
                    g6.f.a aVar = g6.f.f75994b;
                    h4.r rVarA = m4.e.a(x2.u(h4.r.S, 80), this.f154220c);
                    e23.l lVar = this.f154221d;
                    boolean zB = mVar2.B(lVar);
                    Object objQ = mVar2.q();
                    p3.m.a aVar2 = p3.m.f135153a;
                    if (zB) {
                        obj3 = objQ;
                        qe2.c cVar = new qe2.c(lVar, 12);
                        mVar2.K(cVar);
                        obj3 = cVar;
                    } else {
                        aVar2.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            obj3 = objQ;
                            qe2.c cVar2 = new qe2.c(lVar, 12);
                            mVar2.K(cVar2);
                            obj3 = cVar2;
                        }
                    }
                    obj3 = objQ;
                    h4.r rVarC = m4.e.c(rVarA, (e23.l) obj3);
                    r0.f188941a.getClass();
                    nb0.b bVar = r0.a.f188943b;
                    Object objQ2 = mVar2.q();
                    aVar2.getClass();
                    p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                    Object objC = objQ2;
                    if (objQ2 == c2565a) {
                        objC = tn.k.c(mVar2);
                    }
                    a2.j jVar = (a2.j) objC;
                    x5.v.f188954b.getClass();
                    int i14 = x5.v.f188957e;
                    x5.p.f188918b.getClass();
                    a2 a2Var = new a2(0, (Boolean) null, i14, x5.p.f188926j, (f0) null, (Boolean) null, (z5.c) null, 115, (p005kotlin.jvm.internal.j) null);
                    m4.q qVar = this.f154222e;
                    boolean zR = mVar2.r(qVar);
                    Object objQ3 = mVar2.q();
                    Object obj4 = objQ3;
                    if (zR || objQ3 == c2565a) {
                        k0 k0Var = new k0(qVar, 12);
                        mVar2.K(k0Var);
                        obj4 = k0Var;
                    }
                    z1 z1Var = new z1((e23.l) obj4, null, null, null, null, null, 62, null);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    x0 x0VarB = d92.c.b(j92.f.f97931h, mVar2);
                    d6.h.f57752b.getClass();
                    x0 x0VarA = x0.a(x0VarB, 0L, 0L, null, null, 0L, null, null, d6.h.f57755e, 0L, null, null, 16744447);
                    ba baVar = ba.f87580a;
                    long jE = e0.e(mVar2);
                    long jB = j20.x.b(mVar2);
                    long jB2 = j20.x.b(mVar2);
                    long jA = d92.b.a(mVar2).j().a();
                    long jE2 = d92.b.a(mVar2).c().e();
                    baVar.getClass();
                    sg sgVarC = ba.c(0L, jB, jB2, 0L, 0L, jE, null, jA, jE2, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, mVar2, 2147477199);
                    Integer num = this.f154223f;
                    boolean zB2 = mVar2.B(num);
                    Context context = this.f154224g;
                    boolean zR2 = zB2 | mVar2.r(context);
                    e23.l lVar2 = this.f154225h;
                    boolean zB3 = zR2 | mVar2.B(lVar2);
                    Object objQ4 = mVar2.q();
                    Object obj5 = objQ4;
                    if (zB3 || objQ4 == c2565a) {
                        rp.b bVar2 = new rp.b(num, 2, context, lVar2);
                        mVar2.K(bVar2);
                        obj5 = bVar2;
                    }
                    eh.b(l0Var, (e23.l) obj5, rVarC, false, x0VarA, null, z3.f.c(970947027, new h3(this.f154226i, 15), mVar2), null, null, null, false, bVar, a2Var, z1Var, true, 0, 0, jVar, null, sgVarC, mVar2, 12582912, 12804096, 6, 2899800);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
