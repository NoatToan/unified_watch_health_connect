package a3;

import c2.k3;
import c2.n3;
import c2.p3;
import c2.q2;
import c2.q3;
import c2.s2;
import c2.u2;
import com.garmin.android.apps.connectmobile.view.reusablecomponents.InlineUnitsTextFieldView;
import com.garmin.device.filetransfer.core.util.CoreTransferException;
import i3.mh;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import o72.g2;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.x1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.p f634b;

    public /* synthetic */ d(e23.p pVar, int i14) {
        this.f633a = i14;
        this.f634b = pVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f633a;
        int i15 = 2;
        e23.p pVar = this.f634b;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    p3.j0 j0Var = w.f867a;
                    v.f860a.getClass();
                    p3.v.a(j0Var.c(Float.valueOf(v.a(1.0f, 0.87f, mVar))), z3.f.c(-1654653485, new d(pVar, 3), mVar), mVar, 56);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    p3.j0 j0Var2 = w.f867a;
                    v.f860a.getClass();
                    p3.v.a(j0Var2.c(Float.valueOf(v.a(0.74f, 0.6f, mVar2))), z3.f.c(-2126650894, new d(pVar, i15), mVar2), mVar2, 56);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 2:
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    o0.f762a.getClass();
                    s1.a(((t1) mVar3.A(u1.f859b)).f845j, pVar, mVar3, 0);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 3:
                p3.m mVar4 = (p3.m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var4 = p3.n.f135158a;
                    o0.f762a.getClass();
                    s1.a(((t1) mVar4.A(u1.f859b)).f842g, pVar, mVar4, 0);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 4:
                String str = (String) obj;
                String str2 = (String) obj2;
                str.getClass();
                str2.getClass();
                ((ht.i) KoinJavaComponent.get$default(ht.i.class, null, null, 6, null)).b(ht.k.PROCEED, ht.m.CONFIGURATION, ht.l.PLAN_SELECTION, p13.w.c(new ht.n("partNumber", str2)));
                pVar.invoke(str, str2);
                return Unit.INSTANCE;
            case 5:
                p3.m mVar5 = (p3.m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x1 x1Var5 = p3.n.f135158a;
                    pVar.invoke(mVar5, 0);
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 6:
                p3.m mVar6 = (p3.m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    x1 x1Var6 = p3.n.f135158a;
                    pVar.invoke(mVar6, 0);
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 7:
                return com.garmin.android.apps.connectmobile.d.initComposeScreen$lambda$0(pVar, (p3.m) obj, ((Integer) obj2).intValue());
            case 8:
                d4.n nVar = (d4.n) obj;
                List list = (List) pVar.invoke(nVar, obj2);
                int size = list.size();
                for (int i16 = 0; i16 < size; i16++) {
                    Object obj3 = list.get(i16);
                    if (obj3 != null && !nVar.a(obj3)) {
                        q6.f.v(" can't be saved: ", "item at index ", i16, obj3);
                        return null;
                    }
                }
                if (!list.isEmpty()) {
                    return new ArrayList(list);
                }
                return null;
            case 9:
                ArrayList arrayList = new ArrayList();
                for (Map.Entry entry : ((Map) pVar.invoke((d4.n) obj, obj2)).entrySet()) {
                    arrayList.add(entry.getKey());
                    arrayList.add(entry.getValue());
                }
                return arrayList;
            case 10:
                p3.m mVar7 = (p3.m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (mVar7.n(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    x1 x1Var7 = p3.n.f135158a;
                    if (pVar == null) {
                        mVar7.C(-1414388793);
                    } else {
                        mVar7.C(-1154004102);
                        pVar.invoke(mVar7, 0);
                    }
                    mVar7.f();
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 11:
                InlineUnitsTextFieldView.a aVar = (InlineUnitsTextFieldView.a) obj;
                Number number = (Number) obj2;
                aVar.getClass();
                bg0.a.b bVar = ((eg0.b) aVar).f63972a;
                pVar.invoke(number != null ? new bg0.a.c(number, bVar) : null, bVar);
                return Unit.INSTANCE;
            case 12:
                String str3 = (String) obj;
                Boolean bool = (Boolean) obj2;
                bool.booleanValue();
                str3.getClass();
                pVar.invoke(str3, bool);
                return Unit.INSTANCE;
            case 13:
                p3.m mVar8 = (p3.m) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (mVar8.n(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    x1 x1Var8 = p3.n.f135158a;
                    pVar.invoke(mVar8, 0);
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 14:
                p3.m mVar9 = (p3.m) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (mVar9.n(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    x1 x1Var9 = p3.n.f135158a;
                    if (pVar == null) {
                        mVar9.C(-1101450027);
                    } else {
                        mVar9.C(-2113740628);
                        pVar.invoke(mVar9, 0);
                    }
                    mVar9.f();
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 15:
                ((Integer) obj2).getClass();
                g02.g0.a(pVar, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 16:
                pVar.invoke((zf2.i) obj, (String) obj2);
                return Unit.INSTANCE;
            case 17:
                Integer num = (Integer) obj;
                num.intValue();
                Integer num2 = (Integer) obj2;
                num2.intValue();
                pVar.invoke(num, num2);
                return Unit.INSTANCE;
            case 18:
                Integer num3 = (Integer) obj;
                num3.intValue();
                j90.n nVar2 = (j90.n) obj2;
                nVar2.getClass();
                pVar.invoke(num3, nVar2);
                return Unit.INSTANCE;
            case 19:
                String str4 = (String) obj;
                String str5 = (String) obj2;
                str4.getClass();
                str5.getClass();
                pVar.invoke(str4, str5);
                return Unit.INSTANCE;
            case 20:
                String str6 = (String) obj;
                String str7 = (String) obj2;
                str6.getClass();
                str7.getClass();
                pVar.invoke(str6, str7);
                return Unit.INSTANCE;
            case 21:
                p3.m mVar10 = (p3.m) obj;
                ((Integer) obj2).getClass();
                l72.w wVar = l72.w.f111301a;
                mVar10.C(1852968283);
                x1 x1Var10 = p3.n.f135158a;
                k3 k3Var = (k3) pVar.invoke(mVar10, 0);
                p3.f22815b.getClass();
                c2.x1 x1VarD = n3.d(k3Var, p3.f22826m);
                int i17 = k3.f22728a;
                c2.a aVar2 = new c2.a(x1VarD, n3.d(q3.b(mVar10), p3.f22822i));
                mVar10.f();
                return aVar2;
            case 22:
                p3.m mVar11 = (p3.m) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (mVar11.n(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    x1 x1Var11 = p3.n.f135158a;
                    pVar.invoke(mVar11, 0);
                } else {
                    mVar11.e();
                }
                return Unit.INSTANCE;
            case 23:
                p3.m mVar12 = (p3.m) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (mVar12.n(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    x1 x1Var12 = p3.n.f135158a;
                    pVar.invoke(mVar12, 0);
                } else {
                    mVar12.e();
                }
                return Unit.INSTANCE;
            case 24:
                p3.m mVar13 = (p3.m) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                if (mVar13.n(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    x1 x1Var13 = p3.n.f135158a;
                    h4.r.a aVar3 = h4.r.S;
                    g6.f.a aVar4 = g6.f.f75994b;
                    h4.r rVarY = c2.l.y(aVar3, 16);
                    h4.d.f81522a.getClass();
                    h4.g.b bVar2 = h4.d.a.f81534l;
                    c2.j.f22691a.getClass();
                    s2 s2VarA = q2.a(c2.j.f22692b, bVar2, mVar13, 48);
                    int iHashCode = Long.hashCode(mVar13.getU());
                    i2 i2VarX = mVar13.x();
                    h4.r rVarC = h4.k.c(rVarY, mVar13);
                    h5.g.V.getClass();
                    h5.e0.a aVar5 = h5.g.a.f81805b;
                    if (mVar13.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar13.z();
                    if (mVar13.getT()) {
                        mVar13.M(aVar5);
                    } else {
                        mVar13.c();
                    }
                    h5.g.a.e eVar = h5.g.a.f81810g;
                    b4.c(eVar, s2VarA, mVar13);
                    h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                    b4.c(c1623g, i2VarX, mVar13);
                    h5.g.a.b bVar3 = h5.g.a.f81813j;
                    if (mVar13.getT() || !p005kotlin.jvm.internal.s.g(mVar13.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar13, iHashCode, bVar3);
                    }
                    h5.g.a.f fVar = h5.g.a.f81807d;
                    b4.c(fVar, rVarC, mVar13);
                    u2 u2Var = u2.f22900a;
                    pVar.invoke(mVar13, 0);
                    h4.r rVarC2 = c2.l.C(aVar3, 12, 0.0f, 0.0f, 0.0f, 14);
                    c2.z zVarA = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, mVar13, 0);
                    int iHashCode2 = Long.hashCode(mVar13.getU());
                    i2 i2VarX2 = mVar13.x();
                    h4.r rVarC3 = h4.k.c(rVarC2, mVar13);
                    if (mVar13.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar13.z();
                    if (mVar13.getT()) {
                        mVar13.M(aVar5);
                    } else {
                        mVar13.c();
                    }
                    b4.c(eVar, zVarA, mVar13);
                    b4.c(c1623g, i2VarX2, mVar13);
                    if (mVar13.getT() || !p005kotlin.jvm.internal.s.g(mVar13.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar13, iHashCode2, bVar3);
                    }
                    b4.c(fVar, rVarC3, mVar13);
                    c2.b0 b0Var = c2.b0.f22601a;
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c("Card Label", null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.e(d92.c.b(j92.f.f97932i, mVar13)), mVar13, 6, 0, 131070);
                    mh.c("Sub Label", c2.l.C(aVar3, 0.0f, 4, 0.0f, 0.0f, 13), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, mVar13), mVar13, 54, 0, 131068);
                    mVar13.y();
                    s5.x0 x0VarB = d92.c.b(j92.f.f97931h, mVar13);
                    h4.r rVarA = u2Var.a(aVar3, 1.0f, true);
                    d6.h.f57752b.getClass();
                    mh.c("Data", rVarA, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57758h), 0L, 0, false, 0, 0, null, x0VarB, mVar13, 6, 0, 130044);
                    mVar13.y();
                } else {
                    mVar13.e();
                }
                return Unit.INSTANCE;
            case 25:
                p3.m mVar14 = (p3.m) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                if (mVar14.n(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    x1 x1Var14 = p3.n.f135158a;
                    h4.r.a aVar6 = h4.r.S;
                    g6.f.a aVar7 = g6.f.f75994b;
                    h4.r rVarY2 = c2.l.y(aVar6, 16);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    h4.g.a aVar8 = h4.d.a.f81536n;
                    c2.z zVarA2 = c2.y.a(kVar, aVar8, mVar14, 0);
                    int iHashCode3 = Long.hashCode(mVar14.getU());
                    i2 i2VarX3 = mVar14.x();
                    h4.r rVarC4 = h4.k.c(rVarY2, mVar14);
                    h5.g.V.getClass();
                    h5.e0.a aVar9 = h5.g.a.f81805b;
                    if (mVar14.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar14.z();
                    if (mVar14.getT()) {
                        mVar14.M(aVar9);
                    } else {
                        mVar14.c();
                    }
                    h5.g.a.e eVar2 = h5.g.a.f81810g;
                    b4.c(eVar2, zVarA2, mVar14);
                    h5.g.a.C1623g c1623g2 = h5.g.a.f81809f;
                    b4.c(c1623g2, i2VarX3, mVar14);
                    h5.g.a.b bVar4 = h5.g.a.f81813j;
                    if (mVar14.getT() || !p005kotlin.jvm.internal.s.g(mVar14.q(), Integer.valueOf(iHashCode3))) {
                        v.h.z(iHashCode3, mVar14, iHashCode3, bVar4);
                    }
                    h5.g.a.f fVar2 = h5.g.a.f81807d;
                    b4.c(fVar2, rVarC4, mVar14);
                    c2.b0 b0Var2 = c2.b0.f22601a;
                    h4.g.b bVar5 = h4.d.a.f81534l;
                    c2.j.C0343j c0343j = c2.j.f22692b;
                    s2 s2VarA2 = q2.a(c0343j, bVar5, mVar14, 48);
                    int iHashCode4 = Long.hashCode(mVar14.getU());
                    i2 i2VarX4 = mVar14.x();
                    h4.r rVarC5 = h4.k.c(aVar6, mVar14);
                    if (mVar14.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar14.z();
                    if (mVar14.getT()) {
                        mVar14.M(aVar9);
                    } else {
                        mVar14.c();
                    }
                    b4.c(eVar2, s2VarA2, mVar14);
                    b4.c(c1623g2, i2VarX4, mVar14);
                    if (mVar14.getT() || !p005kotlin.jvm.internal.s.g(mVar14.q(), Integer.valueOf(iHashCode4))) {
                        v.h.z(iHashCode4, mVar14, iHashCode4, bVar4);
                    }
                    b4.c(fVar2, rVarC5, mVar14);
                    u2 u2Var2 = u2.f22900a;
                    float f14 = 12;
                    h4.r rVarC6 = c2.l.C(aVar6, f14, 0.0f, 0.0f, 0.0f, 14);
                    c2.z zVarA3 = c2.y.a(kVar, aVar8, mVar14, 0);
                    int iHashCode5 = Long.hashCode(mVar14.getU());
                    i2 i2VarX5 = mVar14.x();
                    h4.r rVarC7 = h4.k.c(rVarC6, mVar14);
                    if (mVar14.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar14.z();
                    if (mVar14.getT()) {
                        mVar14.M(aVar9);
                    } else {
                        mVar14.c();
                    }
                    b4.c(eVar2, zVarA3, mVar14);
                    b4.c(c1623g2, i2VarX5, mVar14);
                    if (mVar14.getT() || !p005kotlin.jvm.internal.s.g(mVar14.q(), Integer.valueOf(iHashCode5))) {
                        v.h.z(iHashCode5, mVar14, iHashCode5, bVar4);
                    }
                    b4.c(fVar2, rVarC7, mVar14);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c("Card Label", null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.e(d92.c.b(j92.f.f97932i, mVar14)), mVar14, 6, 0, 131070);
                    mh.c("Sub Label", c2.l.C(aVar6, 0.0f, 4, 0.0f, 0.0f, 13), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, mVar14), mVar14, 54, 0, 131068);
                    mVar14.y();
                    s5.x0 x0VarB2 = d92.c.b(j92.f.f97931h, mVar14);
                    h4.r rVarA2 = u2Var2.a(aVar6, 1.0f, true);
                    d6.h.f57752b.getClass();
                    mh.c("Data", rVarA2, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57758h), 0L, 0, false, 0, 0, null, x0VarB2, mVar14, 6, 0, 130044);
                    mVar14.y();
                    h4.r rVarC8 = c2.l.C(aVar6, 0.0f, f14, 0.0f, 0.0f, 13);
                    s2 s2VarA3 = q2.a(c0343j, h4.d.a.f81533k, mVar14, 0);
                    int iHashCode6 = Long.hashCode(mVar14.getU());
                    i2 i2VarX6 = mVar14.x();
                    h4.r rVarC9 = h4.k.c(rVarC8, mVar14);
                    if (mVar14.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar14.z();
                    if (mVar14.getT()) {
                        mVar14.M(aVar9);
                    } else {
                        mVar14.c();
                    }
                    b4.c(eVar2, s2VarA3, mVar14);
                    b4.c(c1623g2, i2VarX6, mVar14);
                    if (mVar14.getT() || !p005kotlin.jvm.internal.s.g(mVar14.q(), Integer.valueOf(iHashCode6))) {
                        v.h.z(iHashCode6, mVar14, iHashCode6, bVar4);
                    }
                    b4.c(fVar2, rVarC9, mVar14);
                    c2.l.f(u2Var2.a(aVar6, 1.0f, true), mVar14);
                    pVar.invoke(mVar14, 0);
                    mVar14.y();
                    mVar14.y();
                } else {
                    mVar14.e();
                }
                return Unit.INSTANCE;
            case 26:
                ((Integer) obj2).getClass();
                g2.a(pVar, (p3.m) obj, p3.p0.t(7));
                return Unit.INSTANCE;
            case 27:
                al2.b bVar6 = (al2.b) obj;
                CoreTransferException coreTransferException = (CoreTransferException) obj2;
                bVar6.getClass();
                if (pVar != null) {
                    al2.f.a aVar10 = al2.f.f3791c;
                    nw0.p pVar2 = new nw0.p(pVar, 8, bVar6, coreTransferException);
                    aVar10.getClass();
                    al2.f.a.a(pVar2);
                }
                return Unit.INSTANCE;
            case 28:
                k31.c cVar = (k31.c) obj;
                d31.c cVar2 = (d31.c) obj2;
                cVar.getClass();
                cVar2.getClass();
                pVar.invoke(cVar, cVar2);
                return Unit.INSTANCE;
            default:
                p3.m mVar15 = (p3.m) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                if (mVar15.n(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    x1 x1Var15 = p3.n.f135158a;
                    if (pVar == null) {
                        mVar15.C(-84389390);
                    } else {
                        mVar15.C(1521298415);
                        pVar.invoke(mVar15, 0);
                    }
                    mVar15.f();
                } else {
                    mVar15.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ d(e23.p pVar, int i14, int i15) {
        this.f633a = i15;
        this.f634b = pVar;
    }
}
