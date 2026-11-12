package af1;

import c2.b0;
import c2.x2;
import c2.y;
import c2.z;
import c22.g0;
import com.garmin.android.apps.connectmobile.R;
import cw1.o0;
import f72.bb;
import h4.r;
import h5.e0;
import i3.i7;
import l72.f0;
import lc.u0;
import o62.q0;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.p0;
import p3.x1;
import zo1.f1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class g implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.a f3088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f3089c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f3090d;

    public /* synthetic */ g(String str, boolean z14, e23.a aVar) {
        this.f3087a = 15;
        this.f3090d = str;
        this.f3089c = z14;
        this.f3088b = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0054  */
    /* JADX WARN: Code duplicated, block: B:96:0x031d  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f3087a;
        p3.m.a aVar = p3.m.f135153a;
        e23.a aVar2 = this.f3088b;
        String str = this.f3090d;
        boolean z14 = this.f3089c;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(1 & iIntValue, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    c2.j jVar = c2.j.f22691a;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.c cVar = j92.b.f97901d;
                    float f14 = cVar.f97902a;
                    jVar.getClass();
                    c2.j.i iVarI = c2.j.i(f14);
                    h4.d.f81522a.getClass();
                    h4.g.a aVar3 = h4.d.a.f81537o;
                    r.a aVar4 = r.S;
                    z zVarA = y.a(iVarI, aVar3, mVar, 48);
                    int iHashCode = Long.hashCode(mVar.getU());
                    i2 i2VarX = mVar.x();
                    r rVarC = h4.k.c(aVar4, mVar);
                    h5.g.V.getClass();
                    e0.a aVar5 = h5.g.a.f81805b;
                    if (mVar.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar.z();
                    if (mVar.getT()) {
                        mVar.M(aVar5);
                    } else {
                        mVar.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, mVar);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar.getT() || !s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar);
                    b0 b0Var = b0.f22601a;
                    j92.e eVar = j92.b.f97899b;
                    c2.l.f(x2.h(aVar4, eVar.f97920e), mVar);
                    s62.a.f157643a.getClass();
                    i7.b(bb.a(t62.c.f162799a), null, c2.l.y(u1.n.e(x2.q(aVar4, cVar.f97907f), d92.b.a(mVar).e().g(), k2.i.f102406a), eVar.f97920e), u0.f(mVar), mVar, 48, 0);
                    int i15 = z14 ? R.string.msg_not_enough_data : R.string.msg_no_data_available;
                    int i16 = z14 ? R.string.running_economy_no_data_msg : R.string.running_economy_no_data_no_hrm_msg;
                    r rVarX = x2.x(aVar4, h4.d.a.f81533k, 2);
                    String strQ = gl1.y.Q(mVar, i15);
                    String strP = gl1.y.P(i16, new Object[]{str}, mVar);
                    String strQ2 = gl1.y.Q(mVar, R.string.common_learn_more);
                    boolean zB = mVar.B(aVar2);
                    Object objQ = mVar.q();
                    if (zB) {
                        objQ = new defpackage.c(aVar2, 5);
                        mVar.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new defpackage.c(aVar2, 5);
                            mVar.K(objQ);
                        }
                    }
                    b82.n.d(null, strQ, strP, rVarX, strQ2, (e23.a) objQ, null, null, mVar, 3072, 193);
                    mVar.y();
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                h.a(p0.t(1), aVar2, str, (p3.m) obj, z14);
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                g0.c(p0.t(1), aVar2, str, (p3.m) obj, z14);
                return Unit.INSTANCE;
            case 3:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    if (z14) {
                        mVar2.C(-240840442);
                        f0.f110999a.d(384, 9, this.f3088b, x2.f(r.S, 1.0f), this.f3090d, mVar2, null, false);
                        mVar2.f();
                    } else {
                        mVar2.C(-240578089);
                        mVar2.f();
                    }
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                cv1.f.a(p0.t(1), aVar2, str, (p3.m) obj, z14);
                return Unit.INSTANCE;
            case 5:
                ((Integer) obj2).getClass();
                cw1.l.a(p0.t(1), aVar2, str, (p3.m) obj, z14);
                return Unit.INSTANCE;
            case 6:
                ((Integer) obj2).getClass();
                cw1.f0.a(p0.t(1), aVar2, str, (p3.m) obj, z14);
                return Unit.INSTANCE;
            case 7:
                ((Integer) obj2).getClass();
                o0.c(p0.t(1), aVar2, str, (p3.m) obj, z14);
                return Unit.INSTANCE;
            case 8:
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    String str2 = this.f3090d;
                    if (z14) {
                        mVar3.C(1456959068);
                        z02.f.c(0, 54, null, this.f3088b, null, str2, mVar3, null);
                        mVar3.f();
                    } else {
                        mVar3.C(1457058981);
                        z02.f.a(0, 59, null, null, null, str2, mVar3, null);
                        mVar3.f();
                    }
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 9:
                ((Integer) obj2).getClass();
                j30.i.c(p0.t(1), aVar2, str, (p3.m) obj, z14);
                return Unit.INSTANCE;
            case 10:
                ((Integer) obj2).getClass();
                jy0.k.b(p0.t(1), aVar2, str, (p3.m) obj, z14);
                return Unit.INSTANCE;
            case 11:
                ((Integer) obj2).getClass();
                q0.a(p0.t(1), aVar2, str, (p3.m) obj, z14);
                return Unit.INSTANCE;
            case 12:
                ((Integer) obj2).getClass();
                og.a.d(p0.t(1), aVar2, str, (p3.m) obj, z14);
                return Unit.INSTANCE;
            case 13:
                ((Integer) obj2).getClass();
                t21.b.a(p0.t(1), aVar2, str, (p3.m) obj, z14);
                return Unit.INSTANCE;
            case 14:
                ((Integer) obj2).getClass();
                wv0.i.f(p0.t(1), aVar2, str, (p3.m) obj, z14);
                return Unit.INSTANCE;
            case 15:
                p3.m mVar4 = (p3.m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (mVar4.n(1 & iIntValue4, (iIntValue4 & 3) != 2)) {
                    x1 x1Var4 = p3.n.f135158a;
                    boolean zB2 = mVar4.B(aVar2);
                    Object objQ2 = mVar4.q();
                    if (zB2) {
                        objQ2 = new w51.j(aVar2, 25);
                        mVar4.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new w51.j(aVar2, 25);
                            mVar4.K(objQ2);
                        }
                    }
                    wv0.i.f(0, (e23.a) objQ2, str, mVar4, z14);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                f1.h(p0.t(1), aVar2, str, (p3.m) obj, z14);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ g(e23.a aVar, boolean z14, String str, int i14) {
        this.f3087a = 1;
        this.f3088b = aVar;
        this.f3089c = z14;
        this.f3090d = str;
    }

    public /* synthetic */ g(String str, boolean z14, e23.a aVar, int i14, int i15) {
        this.f3087a = i15;
        this.f3090d = str;
        this.f3089c = z14;
        this.f3088b = aVar;
    }

    public /* synthetic */ g(boolean z14, String str, e23.a aVar, int i14) {
        this.f3087a = 16;
        this.f3089c = z14;
        this.f3090d = str;
        this.f3088b = aVar;
    }

    public /* synthetic */ g(boolean z14, String str, e23.a aVar, int i14, byte b14) {
        this.f3087a = i14;
        this.f3089c = z14;
        this.f3090d = str;
        this.f3088b = aVar;
    }
}
