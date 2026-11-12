package as;

import c2.b0;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import g02.f1;
import h5.e0;
import i3.mh;
import i3.ve;
import l72.f0;
import lc.u0;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p0;
import p3.x1;
import p5.v;
import s5.x0;
import v62.k6;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class f implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f12630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f12631c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.a f12632d;

    public /* synthetic */ f(int i14, e23.a aVar, int i15) {
        this.f12629a = 0;
        this.f12630b = i14;
        this.f12632d = aVar;
        this.f12631c = i15;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:41:0x0254  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f12629a;
        int i15 = this.f12631c;
        int i16 = this.f12630b;
        e23.a aVar = this.f12632d;
        int i17 = 1;
        switch (i14) {
            case 0:
                ((Integer) obj2).getClass();
                k.b(aVar, i16, (p3.m) obj, p0.t(i15 | 1));
                return Unit.INSTANCE;
            case 1:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    h4.r.a aVar2 = h4.r.S;
                    h4.r rVarF = x2.f(aVar2, 1.0f);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar = j92.b.f97899b;
                    float f14 = eVar.f97920e;
                    float f15 = eVar.f97921f;
                    h4.r rVarZ = c2.l.z(rVarF, f15, f14);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    h4.g.a aVar3 = h4.d.a.f81536n;
                    z zVarA = y.a(kVar, aVar3, mVar, 0);
                    int iHashCode = Long.hashCode(mVar.getU());
                    i2 i2VarX = mVar.x();
                    h4.r rVarC = h4.k.c(rVarZ, mVar);
                    h5.g.V.getClass();
                    e0.a aVar4 = h5.g.a.f81805b;
                    if (mVar.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar.z();
                    if (mVar.getT()) {
                        mVar.M(aVar4);
                    } else {
                        mVar.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, mVar);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar);
                    b0 b0Var = b0.f22601a;
                    h4.g.a aVar5 = h4.d.a.f81537o;
                    h4.r rVarB = b0Var.b(aVar2, aVar5);
                    s62.a.f157643a.getClass();
                    g02.i.a(rVarB, k6.a(t62.b.f162798a), u0.f(mVar), d92.b.a(mVar).e().g(), j92.b.f97901d.f97906e, 0.0f, null, mVar, 0, 224);
                    c2.l.f(x2.h(aVar2, eVar.f97920e), mVar);
                    f1.j(x2.f(aVar2, 1.0f), R.color.surface_3, false, n5.a.a(mVar, R.color.surface_background_hero_inverted), (i16 / i15) * 100, 0.0f, 0.0f, mVar, 6, 100);
                    c2.l.f(x2.h(aVar2, eVar.f97918c), mVar);
                    String strP = gl1.y.P(R.string.uploading_photo_count, new Object[]{Integer.valueOf(i16), Integer.valueOf(i15)}, mVar);
                    String strP2 = gl1.y.P(R.string.uploading_photo_count_accessibility, new Object[]{Integer.valueOf(i16), Integer.valueOf(i15)}, mVar);
                    d92.b.f58624b.getClass();
                    x0 x0VarF = d92.c.f(j92.f.f97933j, mVar);
                    h4.r rVarB2 = b0Var.b(aVar2, aVar3);
                    boolean zB = mVar.B(strP2);
                    Object objQ = mVar.q();
                    p3.m.a aVar6 = p3.m.f135153a;
                    if (zB) {
                        objQ = new cq.t(strP2, 22);
                        mVar.K(objQ);
                    } else {
                        aVar6.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new cq.t(strP2, 22);
                            mVar.K(objQ);
                        }
                    }
                    mh.c(strP, v.c((e23.l) objQ, rVarB2, false), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, mVar, 0, 0, 131068);
                    c2.l.f(x2.h(aVar2, f15), mVar);
                    f0.a aVar7 = f0.a.f111000a;
                    String strQ = gl1.y.Q(mVar, R.string.cancel_photo_upload);
                    h4.r rVarB3 = b0Var.b(aVar2, aVar5);
                    boolean zB2 = mVar.B(aVar);
                    Object objQ2 = mVar.q();
                    if (zB2) {
                        objQ2 = new e52.c(aVar, 24);
                        mVar.K(objQ2);
                    } else {
                        aVar6.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new e52.c(aVar, 24);
                            mVar.K(objQ2);
                        }
                    }
                    aVar7.j(strQ, rVarB3, false, (e23.a) objQ2, mVar, 0, 4);
                    mVar.y();
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 2:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    k2.h hVarA = k2.i.a(j92.b.f97900c.f97911c);
                    long jA = d92.b.a(mVar2).c().a();
                    i3.a.f87402a.getClass();
                    ve.a(null, hVarA, jA, 0L, i3.a.f87403b, 0.0f, null, z3.f.c(2050205018, new f(i16, i15, i17, aVar), mVar2), mVar2, 12582912, 105);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                r20.f.a(aVar, p0.t(i16 | 1), (p3.m) obj, i15);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ f(int i14, int i15, int i16, e23.a aVar) {
        this.f12629a = i16;
        this.f12630b = i14;
        this.f12631c = i15;
        this.f12632d = aVar;
    }

    public /* synthetic */ f(e23.a aVar, int i14, int i15) {
        this.f12629a = 3;
        this.f12632d = aVar;
        this.f12630b = i14;
        this.f12631c = i15;
    }
}
