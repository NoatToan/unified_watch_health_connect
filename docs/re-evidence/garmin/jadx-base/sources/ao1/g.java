package ao1;

import as.s;
import c2.x2;
import ca0.v0;
import com.google.android.exoplayer2.C;
import e23.p;
import g02.h0;
import h4.r;
import i3.h1;
import i3.h7;
import j53.l;
import java.util.LinkedHashMap;
import l72.f0;
import l72.v1;
import o72.b3;
import o72.r1;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.p0;
import p3.x1;
import s70.c0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f11559b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a f11560c;

    public /* synthetic */ g(String str, e23.a aVar) {
        this.f11558a = 9;
        this.f11560c = aVar;
        this.f11559b = str;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:144:0x0396  */
    /* JADX WARN: Code duplicated, block: B:167:0x0417  */
    /* JADX WARN: Code duplicated, block: B:72:0x01d5  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f11558a;
        m.a aVar = m.f135153a;
        String str = this.f11559b;
        e23.a aVar2 = this.f11560c;
        int i15 = 1;
        switch (i14) {
            case 0:
                ((Integer) obj2).getClass();
                k.d(p0.t(1), aVar2, str, (m) obj);
                break;
            case 1:
                ((Integer) obj2).getClass();
                ap1.a.a(p0.t(1), aVar2, str, (m) obj);
                break;
            case 2:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    f0 f0Var = f0.f110999a;
                    r rVarF = x2.f(r.S, 1.0f);
                    boolean zB = mVar.B(aVar2);
                    Object objQ = mVar.q();
                    if (zB) {
                        objQ = new as.n(aVar2, 16);
                        mVar.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new as.n(aVar2, 16);
                            mVar.K(objQ);
                        }
                    }
                    f0Var.d(384, 9, (e23.a) objQ, rVarF, this.f11559b, mVar, null, false);
                } else {
                    mVar.e();
                }
                break;
            case 3:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    f0.f110999a.d(384, 9, this.f11560c, x2.f(r.S, 1.0f), this.f11559b, mVar2, null, false);
                } else {
                    mVar2.e();
                }
                break;
            case 4:
                m mVar3 = (m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = n.f135158a;
                    f0 f0Var2 = f0.f110999a;
                    r rVarF2 = x2.f(r.S, 1.0f);
                    boolean z14 = aVar2 != null;
                    z3.e eVarC = z3.f.c(1455730186, new cq0.p(aVar2, i15), mVar3);
                    boolean zB2 = mVar3.B(aVar2);
                    Object objQ2 = mVar3.q();
                    if (zB2) {
                        objQ2 = new v0(aVar2, 21);
                        mVar3.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == m.a.f135155b) {
                            objQ2 = new v0(aVar2, 21);
                            mVar3.K(objQ2);
                        }
                    }
                    f0Var2.a(eVarC, this.f11559b, rVarF2, z14, (e23.a) objQ2, mVar3, 54, 0);
                } else {
                    mVar3.e();
                }
                break;
            case 5:
                m mVar4 = (m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var4 = n.f135158a;
                    z02.f.d(this.f11559b, null, null, this.f11560c, l.b(), null, null, mVar4, 458752, 214);
                } else {
                    mVar4.e();
                }
                break;
            case 6:
                m mVar5 = (m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x1 x1Var5 = n.f135158a;
                    z02.f.d(this.f11559b, null, null, this.f11560c, l.b(), null, null, mVar5, 458752, 214);
                } else {
                    mVar5.e();
                }
                break;
            case 7:
                ((Integer) obj2).getClass();
                f51.a.a(p0.t(1), aVar2, str, (m) obj);
                break;
            case 8:
                ((Integer) obj2).getClass();
                fv0.f.e(p0.t(1), aVar2, str, (m) obj);
                break;
            case 9:
                m mVar6 = (m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    x1 x1Var6 = n.f135158a;
                    boolean zB3 = mVar6.B(aVar2);
                    Object objQ3 = mVar6.q();
                    if (zB3) {
                        objQ3 = new h0(aVar2, 5);
                        mVar6.K(objQ3);
                    } else {
                        aVar.getClass();
                        if (objQ3 == m.a.f135155b) {
                            objQ3 = new h0(aVar2, 5);
                            mVar6.K(objQ3);
                        }
                    }
                    h1.c((e23.a) objQ3, null, false, null, null, null, null, null, z3.f.c(748452628, new s(str, 20), mVar6), mVar6, C.ENCODING_PCM_32BIT, 510);
                } else {
                    mVar6.e();
                }
                break;
            case 10:
                ((Integer) obj2).getClass();
                gp.l.d(p0.t(1), aVar2, str, (m) obj);
                break;
            case 11:
                ((Integer) obj2).getClass();
                gp.l.c(p0.t(49), aVar2, str, (m) obj);
                break;
            case 12:
                ((Integer) obj2).getClass();
                i51.h.a(p0.t(1), aVar2, str, (m) obj);
                break;
            case 13:
                m mVar7 = (m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (mVar7.n(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    x1 x1Var7 = n.f135158a;
                    z3.e eVarC2 = z3.f.c(-2038646489, new g(str, aVar2, 15), mVar7);
                    ii0.c.f93563a.getClass();
                    z02.d.a(false, eVarC2, null, null, null, ii0.c.f93564b, mVar7, 196656, 29);
                } else {
                    mVar7.e();
                }
                break;
            case 14:
                ((Integer) obj2).getClass();
                gg.b.c(p0.t(1), aVar2, str, (m) obj);
                break;
            case 15:
                m mVar8 = (m) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (mVar8.n(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    x1 x1Var8 = n.f135158a;
                    boolean zB4 = mVar8.B(aVar2);
                    Object objQ4 = mVar8.q();
                    if (zB4) {
                        objQ4 = new ii0.h(aVar2, 6);
                        mVar8.K(objQ4);
                    } else {
                        aVar.getClass();
                        if (objQ4 == m.a.f135155b) {
                            objQ4 = new ii0.h(aVar2, 6);
                            mVar8.K(objQ4);
                        }
                    }
                    z02.f.c(0, 54, null, (e23.a) objQ4, null, this.f11559b, mVar8, null);
                } else {
                    mVar8.e();
                }
                break;
            case 16:
                ((Integer) obj2).getClass();
                jk1.d.b(p0.t(1), aVar2, str, (m) obj);
                break;
            case 17:
                ((Integer) obj2).getClass();
                g8.i.b(p0.t(1), aVar2, str, (m) obj);
                break;
            case 18:
                ((Integer) obj2).getClass();
                kh0.l.a(p0.t(1), aVar2, str, (m) obj);
                break;
            case 19:
                ((Integer) obj2).getClass();
                v1.a(p0.t(1), aVar2, str, (m) obj);
                break;
            case 20:
                m mVar9 = (m) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (mVar9.n(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    x1 x1Var9 = n.f135158a;
                    z02.f.c(0, 54, null, this.f11560c, null, this.f11559b, mVar9, null);
                } else {
                    mVar9.e();
                }
                break;
            case 21:
                m mVar10 = (m) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (mVar10.n(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    x1 x1Var10 = n.f135158a;
                    if (str.length() > 0) {
                        mVar10.C(-1457815619);
                        nw0.c.f128001a.getClass();
                        h7.a(this.f11560c, null, false, null, null, nw0.c.f128004d, mVar10, 1572864, 62);
                        mVar10.f();
                    } else {
                        mVar10.C(-1457495606);
                        mVar10.f();
                    }
                } else {
                    mVar10.e();
                }
                break;
            case 22:
                m mVar11 = (m) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (mVar11.n(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    x1 x1Var11 = n.f135158a;
                    int i16 = b3.a.f15501a;
                    u4.d dVarA = c3.a.a();
                    b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
                    LinkedHashMap linkedHashMap = c0235a.f16962a;
                    String str2 = this.f11559b;
                    linkedHashMap.put("navigateIconDescription", str2);
                    b92.a aVarB = c0235a.b();
                    int i17 = b92.a.f16960b;
                    z02.f.a(0, 40, aVarB, this.f11560c, null, str2, mVar11, dVarA);
                } else {
                    mVar11.e();
                }
                break;
            case 23:
                ((Integer) obj2).getClass();
                r1.a(p0.t(55), aVar2, str, (m) obj);
                break;
            case 24:
                ((Integer) obj2).getClass();
                b3.a(p0.t(55), aVar2, str, (m) obj);
                break;
            case 25:
                m mVar12 = (m) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                if (mVar12.n(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    x1 x1Var12 = n.f135158a;
                    f0.f110999a.d(384, 9, this.f11560c, x2.f(r.S, 1.0f), this.f11559b, mVar12, null, false);
                } else {
                    mVar12.e();
                }
                break;
            case 26:
                ((Integer) obj2).getClass();
                c0.d(p0.t(49), aVar2, str, (m) obj);
                break;
            case 27:
                ((Integer) obj2).getClass();
                sg0.i.a(p0.t(1), aVar2, str, (m) obj);
                break;
            case 28:
                ((Integer) obj2).getClass();
                t42.g.a(p0.t(1), aVar2, str, (m) obj);
                break;
            default:
                ((Integer) obj2).getClass();
                tw.g.a(p0.t(1), aVar2, str, (m) obj);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ g(e23.a aVar, String str, int i14) {
        this.f11558a = 0;
        this.f11560c = aVar;
        this.f11559b = str;
    }

    public /* synthetic */ g(String str, e23.a aVar, int i14) {
        this.f11558a = i14;
        this.f11559b = str;
        this.f11560c = aVar;
    }

    public /* synthetic */ g(String str, e23.a aVar, int i14, int i15) {
        this.f11558a = i15;
        this.f11559b = str;
        this.f11560c = aVar;
    }
}
