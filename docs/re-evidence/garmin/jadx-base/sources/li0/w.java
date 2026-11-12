package li0;

import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import i3.ef;
import i3.ff;
import i3.hf;
import i3.mh;
import i3.r1;
import i3.s1;
import java.util.ArrayList;
import java.util.List;
import o72.i3;
import o72.j2;
import o72.q1;
import o72.v1;
import p005kotlin.Unit;
import p006l2.a2;
import p3.b4;
import p3.i2;
import p3.p1;
import p3.x1;
import v62.s6;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class w implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f112881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p1 f112882b;

    public /* synthetic */ w(p1 p1Var, int i14) {
        this.f112881a = i14;
        this.f112882b = p1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f112881a;
        i53.c<y22.x> cVar = null;
        p3.m.a aVar = p3.m.f135153a;
        int i15 = 1;
        p1 p1Var = this.f112882b;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    s62.a.f157643a.getClass();
                    z.i(s6.a(t62.b.f162798a), ((Boolean) p1Var.getF182175a()).booleanValue(), mVar, 0);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    s62.a.f157643a.getClass();
                    z.i(s6.a(t62.b.f162798a), ((Boolean) p1Var.getF182175a()).booleanValue(), mVar2, 0);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 2:
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                        mVar3.C(-1085381579);
                        z.j(mVar3, 0);
                        mVar3.f();
                    } else {
                        mVar3.C(-1085338334);
                        mVar3.f();
                    }
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 3:
                p3.m mVar4 = (p3.m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var4 = p3.n.f135158a;
                    if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                        mVar4.C(-1102991733);
                        z.j(mVar4, 0);
                        mVar4.f();
                    } else {
                        mVar4.C(-1102948488);
                        mVar4.f();
                    }
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 4:
                p3.m mVar5 = (p3.m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x1 x1Var5 = p3.n.f135158a;
                    if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                        mVar5.C(1627152709);
                        z.j(mVar5, 0);
                        mVar5.f();
                    } else {
                        mVar5.C(1627195954);
                        mVar5.f();
                    }
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 5:
                p3.m mVar6 = (p3.m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    x1 x1Var6 = p3.n.f135158a;
                    if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                        mVar6.C(1394341821);
                        z.j(mVar6, 0);
                        mVar6.f();
                    } else {
                        mVar6.C(1394385066);
                        mVar6.f();
                    }
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 6:
                p3.m mVar7 = (p3.m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (mVar7.n(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    x1 x1Var7 = p3.n.f135158a;
                    String strQ = gl1.y.Q(mVar7, R.string.dialog_ok);
                    h4.r.a aVar2 = h4.r.S;
                    Object objQ = mVar7.q();
                    aVar.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new l51.c(p1Var, 21);
                        mVar7.K(objQ);
                    }
                    h4.r rVarD = u1.w.d(aVar2, false, null, null, (e23.a) objQ, 15);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(strQ, rVarD, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97936m, mVar7), mVar7, 0, 0, 131068);
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 7:
                p3.m mVar8 = (p3.m) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (mVar8.n(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    x1 x1Var8 = p3.n.f135158a;
                    String strQ2 = gl1.y.Q(mVar8, R.string.cm_cancel);
                    h4.r.a aVar3 = h4.r.S;
                    Object objQ2 = mVar8.q();
                    aVar.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new l51.c(p1Var, 22);
                        mVar8.K(objQ2);
                    }
                    h4.r rVarD2 = u1.w.d(aVar3, false, null, null, (e23.a) objQ2, 15);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(strQ2, rVarD2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97936m, mVar8), mVar8, 0, 0, 131068);
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 8:
                ((Integer) obj2).getClass();
                ((List) obj).getClass();
                p1Var.setValue(Boolean.valueOf(!((Boolean) p1Var.getF182175a()).booleanValue()));
                return Unit.INSTANCE;
            case 9:
                ((Integer) obj2).getClass();
                ((List) obj).getClass();
                p1Var.setValue(Boolean.valueOf(!((Boolean) p1Var.getF182175a()).booleanValue()));
                return Unit.INSTANCE;
            case 10:
                p3.m mVar9 = (p3.m) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (mVar9.n(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    x1 x1Var9 = p3.n.f135158a;
                    hf.a(((Boolean) p1Var.getF182175a()).booleanValue(), null, null, false, d92.c.a(ff.f88115a, mVar9), mVar9, 48, 92);
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 11:
                p3.m mVar10 = (p3.m) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (mVar10.n(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    x1 x1Var10 = p3.n.f135158a;
                    hf.a(((Boolean) p1Var.getF182175a()).booleanValue(), null, null, false, d92.c.a(ff.f88115a, mVar10), mVar10, 48, 92);
                } else {
                    mVar10.e();
                }
                return Unit.INSTANCE;
            case 12:
                p3.m mVar11 = (p3.m) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (mVar11.n(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    x1 x1Var11 = p3.n.f135158a;
                    l72.f0 f0Var = l72.f0.f110999a;
                    s62.a.f157643a.getClass();
                    u4.d dVarA = s6.a(t62.b.f162798a);
                    h4.r.a aVar4 = h4.r.S;
                    h4.r rVarF = x2.f(aVar4, 1.0f);
                    Object objQ3 = mVar11.q();
                    aVar.getClass();
                    p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                    if (objQ3 == c2565a) {
                        objQ3 = new q1(p1Var, 20);
                        mVar11.K(objQ3);
                    }
                    f0Var.d(25008, 8, (e23.a) objQ3, rVarF, "Action", mVar11, dVarA, false);
                    h4.r rVarF2 = x2.f(aVar4, 1.0f);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar = j92.b.f97899b;
                    h4.r rVarC = c2.l.C(rVarF2, 0.0f, eVar.f97920e, 0.0f, 0.0f, 13);
                    Object objQ4 = mVar11.q();
                    if (objQ4 == c2565a) {
                        objQ4 = new q1(p1Var, 21);
                        mVar11.K(objQ4);
                    }
                    f0Var.b("Action", rVarC, false, (e23.a) objQ4, mVar11, 3078, 4);
                    h4.r rVarC2 = c2.l.C(x2.f(aVar4, 1.0f), 0.0f, eVar.f97920e, 0.0f, 0.0f, 13);
                    Object objQ5 = mVar11.q();
                    if (objQ5 == c2565a) {
                        objQ5 = new q1(p1Var, 22);
                        mVar11.K(objQ5);
                    }
                    f0Var.k("Action", rVarC2, false, (e23.a) objQ5, mVar11, 3078, 4);
                } else {
                    mVar11.e();
                }
                return Unit.INSTANCE;
            case 13:
                String str = (String) obj;
                ((Boolean) obj2).getClass();
                str.getClass();
                p1Var.setValue(str);
                return Unit.INSTANCE;
            case 14:
                p3.m mVar12 = (p3.m) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                if (mVar12.n(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    x1 x1Var12 = p3.n.f135158a;
                    boolean zBooleanValue = ((Boolean) p1Var.getF182175a()).booleanValue();
                    r1 r1Var = r1.f89474a;
                    d92.b.f58623a.getClass();
                    long jA = d92.b.a(mVar12).f().a();
                    r1Var.getClass();
                    s1.a(zBooleanValue, null, null, false, r1.a(jA, 0L, mVar12, 62), mVar12, 48, 44);
                } else {
                    mVar12.e();
                }
                return Unit.INSTANCE;
            case 15:
                p3.m mVar13 = (p3.m) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                if (mVar13.n(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    x1 x1Var13 = p3.n.f135158a;
                    hf.a(((Boolean) p1Var.getF182175a()).booleanValue(), null, null, false, d92.c.a(ff.f88115a, mVar13), mVar13, 48, 92);
                } else {
                    mVar13.e();
                }
                return Unit.INSTANCE;
            case 16:
                p3.m mVar14 = (p3.m) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                if (mVar14.n(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    x1 x1Var14 = p3.n.f135158a;
                    i53.f fVarA = i53.a.a("Male", "Female", "Unspecified");
                    Object objQ6 = mVar14.q();
                    aVar.getClass();
                    if (objQ6 == p3.m.a.f135155b) {
                        objQ6 = new o50.a(4, fVarA, p1Var);
                        mVar14.K(objQ6);
                    }
                    r82.s.b("Female", fVarA, (e23.l) objQ6, mVar14, 438);
                } else {
                    mVar14.e();
                }
                return Unit.INSTANCE;
            case 17:
                p3.m mVar15 = (p3.m) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                if (mVar15.n(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    x1 x1Var15 = p3.n.f135158a;
                    h4.r.a aVar5 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar2 = j92.b.f97899b;
                    h4.r rVarF3 = x2.f(c2.l.y(aVar5, eVar2.f97920e), 1.0f);
                    h4.d.f81522a.getClass();
                    h4.g.a aVar6 = h4.d.a.f81537o;
                    c2.j.f22691a.getClass();
                    c2.z zVarA = c2.y.a(c2.j.f22694d, aVar6, mVar15, 48);
                    int iHashCode = Long.hashCode(mVar15.getU());
                    i2 i2VarX = mVar15.x();
                    h4.r rVarC3 = h4.k.c(rVarF3, mVar15);
                    h5.g.V.getClass();
                    h5.e0.a aVar7 = h5.g.a.f81805b;
                    if (mVar15.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar15.z();
                    if (mVar15.getT()) {
                        mVar15.M(aVar7);
                    } else {
                        mVar15.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, mVar15);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar15);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar15.getT() || !p005kotlin.jvm.internal.s.g(mVar15.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar15, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC3, mVar15);
                    c2.b0 b0Var = c2.b0.f22601a;
                    h4.r rVarF4 = x2.f(aVar5, 1.0f);
                    x5.v.f188954b.getClass();
                    a2 a2Var = new a2(0, (Boolean) null, x5.v.f188957e, 0, (x5.f0) null, (Boolean) null, (z5.c) null, 123, (p005kotlin.jvm.internal.j) null);
                    String str2 = (String) p1Var.getF182175a();
                    Object objQ7 = mVar15.q();
                    aVar.getClass();
                    p3.m.a.C2565a c2565a2 = p3.m.a.f135155b;
                    if (objQ7 == c2565a2) {
                        objQ7 = new v1(p1Var, 27);
                        mVar15.K(objQ7);
                    }
                    r82.s.a(rVarF4, a2Var, str2, 5, null, (e23.l) objQ7, mVar15, 199734, 16);
                    c2.l.f(x2.h(aVar5, eVar2.f97920e), mVar15);
                    Object objQ8 = mVar15.q();
                    if (objQ8 == c2565a2) {
                        objQ8 = new j2(p1Var, 21);
                        mVar15.K(objQ8);
                    }
                    h4.r rVarD3 = u1.w.d(aVar5, false, null, null, (e23.a) objQ8, 15);
                    d92.b.f58624b.getClass();
                    mh.c("Use default", rVarD3, ds.e0.e(mVar15), null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, j92.f.f97932i, mVar15, 6, 0, 131064);
                    c2.l.f(x2.h(aVar5, eVar2.f97922g), mVar15);
                    mh.c("Garmin Connect will store your goal and sync it to your device. You can change at any time.", null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, mVar15), mVar15, 6, 0, 131070);
                    mVar15.y();
                } else {
                    mVar15.e();
                }
                return Unit.INSTANCE;
            case 18:
                p3.m mVar16 = (p3.m) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                if (mVar16.n(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    x1 x1Var16 = p3.n.f135158a;
                    boolean zBooleanValue2 = ((Boolean) p1Var.getF182175a()).booleanValue();
                    ef efVarA = d92.c.a(ff.f88115a, mVar16);
                    Object objQ9 = mVar16.q();
                    aVar.getClass();
                    if (objQ9 == p3.m.a.f135155b) {
                        objQ9 = new i3(p1Var, i15);
                        mVar16.K(objQ9);
                    }
                    hf.a(zBooleanValue2, (e23.l) objQ9, null, false, efVarA, mVar16, 48, 92);
                } else {
                    mVar16.e();
                }
                return Unit.INSTANCE;
            case 19:
                p3.m mVar17 = (p3.m) obj;
                int iIntValue17 = ((Integer) obj2).intValue();
                if (mVar17.n(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    x1 x1Var17 = p3.n.f135158a;
                    if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                        mVar17.C(-1147076048);
                        z.j(mVar17, 0);
                        mVar17.f();
                    } else {
                        mVar17.C(-1147025115);
                        mVar17.f();
                    }
                } else {
                    mVar17.e();
                }
                return Unit.INSTANCE;
            case 20:
                p3.m mVar18 = (p3.m) obj;
                int iIntValue18 = ((Integer) obj2).intValue();
                if (mVar18.n(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    x1 x1Var18 = p3.n.f135158a;
                    if (((String) p1Var.getF182175a()).length() > 250) {
                        mVar18.C(2122399754);
                        uk0.o.a(mVar18, 6);
                        mVar18.f();
                    } else {
                        mVar18.C(2122486244);
                        mVar18.f();
                    }
                } else {
                    mVar18.e();
                }
                return Unit.INSTANCE;
            case 21:
                p3.m mVar19 = (p3.m) obj;
                int iIntValue19 = ((Integer) obj2).intValue();
                if (mVar19.n(iIntValue19 & 1, (iIntValue19 & 3) != 2)) {
                    x1 x1Var19 = p3.n.f135158a;
                    if (((String) p1Var.getF182175a()).length() > 250) {
                        mVar19.C(1321468040);
                        uk0.o.a(mVar19, 6);
                        mVar19.f();
                    } else {
                        mVar19.C(1321554530);
                        mVar19.f();
                    }
                } else {
                    mVar19.e();
                }
                return Unit.INSTANCE;
            case 22:
                String str3 = (String) obj;
                ((Boolean) obj2).booleanValue();
                str3.getClass();
                p1Var.setValue(str3);
                return Unit.INSTANCE;
            case 23:
                p3.m mVar20 = (p3.m) obj;
                int iIntValue20 = ((Integer) obj2).intValue();
                if (mVar20.n(iIntValue20 & 1, (iIntValue20 & 3) != 2)) {
                    x1 x1Var20 = p3.n.f135158a;
                    Object objQ10 = mVar20.q();
                    aVar.getClass();
                    if (objQ10 == p3.m.a.f135155b) {
                        objQ10 = new p40.k0(p1Var, 23);
                        mVar20.K(objQ10);
                    }
                    r72.d.a((e23.a) objQ10, mVar20, 6);
                } else {
                    mVar20.e();
                }
                return Unit.INSTANCE;
            case 24:
                String str4 = (String) obj;
                ((Boolean) obj2).booleanValue();
                str4.getClass();
                p1Var.setValue(str4);
                return Unit.INSTANCE;
            case 25:
                p3.m mVar21 = (p3.m) obj;
                int iIntValue21 = ((Integer) obj2).intValue();
                if (mVar21.n(iIntValue21 & 1, (iIntValue21 & 3) != 2)) {
                    x1 x1Var21 = p3.n.f135158a;
                    hf.a(((Boolean) p1Var.getF182175a()).booleanValue(), null, null, false, d92.c.a(ff.f88115a, mVar21), mVar21, 48, 92);
                } else {
                    mVar21.e();
                }
                return Unit.INSTANCE;
            case 26:
                p3.m mVar22 = (p3.m) obj;
                int iIntValue22 = ((Integer) obj2).intValue();
                if (mVar22.n(iIntValue22 & 1, (iIntValue22 & 3) != 2)) {
                    x1 x1Var22 = p3.n.f135158a;
                    boolean zBooleanValue3 = ((Boolean) p1Var.getF182175a()).booleanValue();
                    r1 r1Var2 = r1.f89474a;
                    d92.b.f58623a.getClass();
                    long jA2 = d92.b.a(mVar22).f().a();
                    r1Var2.getClass();
                    s1.a(zBooleanValue3, null, null, false, r1.a(jA2, 0L, mVar22, 62), mVar22, 48, 44);
                } else {
                    mVar22.e();
                }
                return Unit.INSTANCE;
            case 27:
                p3.m mVar23 = (p3.m) obj;
                int iIntValue23 = ((Integer) obj2).intValue();
                if (mVar23.n(iIntValue23 & 1, (iIntValue23 & 3) != 2)) {
                    x1 x1Var23 = p3.n.f135158a;
                    boolean zBooleanValue4 = ((Boolean) p1Var.getF182175a()).booleanValue();
                    r1 r1Var3 = r1.f89474a;
                    d92.b.f58623a.getClass();
                    long jA3 = d92.b.a(mVar23).f().a();
                    r1Var3.getClass();
                    s1.a(zBooleanValue4, null, null, false, r1.a(jA3, 0L, mVar23, 62), mVar23, 48, 44);
                } else {
                    mVar23.e();
                }
                return Unit.INSTANCE;
            case 28:
                p3.m mVar24 = (p3.m) obj;
                int iIntValue24 = ((Integer) obj2).intValue();
                if (mVar24.n(iIntValue24 & 1, (iIntValue24 & 3) != 2)) {
                    x1 x1Var24 = p3.n.f135158a;
                    h4.r.a aVar8 = h4.r.S;
                    Object objQ11 = mVar24.q();
                    aVar.getClass();
                    if (objQ11 == p3.m.a.f135155b) {
                        objQ11 = new se0.a(14);
                        mVar24.K(objQ11);
                    }
                    hf.a(((sk0.l0) p1Var.getF182175a()).f159725f, null, p5.v.b(aVar8, (e23.l) objQ11), false, d92.c.a(ff.f88115a, mVar24), mVar24, 48, 88);
                } else {
                    mVar24.e();
                }
                return Unit.INSTANCE;
            default:
                int iIntValue25 = ((Integer) obj).intValue();
                int iIntValue26 = ((Integer) obj2).intValue();
                i53.c<y22.x> cVar2 = ((sk0.l0) p1Var.getF182175a()).f159727h;
                if (iIntValue25 >= 0 && iIntValue25 < cVar2.size() && iIntValue26 >= 0 && iIntValue26 < cVar2.size()) {
                    cVar = cVar2;
                }
                if (cVar != null) {
                    ArrayList arrayList = new ArrayList(cVar);
                    arrayList.add(iIntValue26, (y22.x) arrayList.remove(iIntValue25));
                    p1Var.setValue(sk0.l0.b((sk0.l0) p1Var.getF182175a(), null, null, null, null, false, null, i53.a.e(arrayList), 127));
                }
                return Unit.INSTANCE;
        }
    }
}
