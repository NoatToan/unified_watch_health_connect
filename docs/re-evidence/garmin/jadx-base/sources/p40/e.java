package p40;

import am.b2;
import android.content.Context;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.k1;
import f5.z0;
import i3.i7;
import i3.mh;
import i3.ve;
import org.koin.android.ext.koin.ModuleExtKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.x1;
import s5.x0;
import v62.e1;
import v62.j1;
import v62.o7;
import v62.s6;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class e implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f135657a;

    public /* synthetic */ e(int i14) {
        this.f135657a = i14;
    }

    private final Object a(Object obj, Object obj2) {
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        pa0.c cVar = pa0.c.f136708a;
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            ve.a(x2.d(h4.r.S, 1.0f), null, tn.k.a(d92.b.f58623a, mVar), 0L, 0.0f, 0.0f, null, pa0.c.f136715h, mVar, 12582918, 122);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object b(Object obj, Object obj2) {
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        pa0.c cVar = pa0.c.f136708a;
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            Object objQ = mVar.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new f(8);
                mVar.K(objQ);
            }
            e23.a aVar = (e23.a) objQ;
            Object objQ2 = mVar.q();
            if (objQ2 == c2565a) {
                objQ2 = new f(9);
                mVar.K(objQ2);
            }
            pa0.g.g(aVar, (e23.a) objQ2, mVar, 54);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f135657a;
        p3.m.a aVar = p3.m.f135153a;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                g gVar = g.f135661a;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    Object objQ = mVar.q();
                    aVar.getClass();
                    p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                    if (objQ == c2565a) {
                        objQ = new f(0);
                        mVar.K(objQ);
                    }
                    e23.a aVar2 = (e23.a) objQ;
                    Object objQ2 = mVar.q();
                    if (objQ2 == c2565a) {
                        objQ2 = new f(1);
                        mVar.K(objQ2);
                    }
                    l0.a(aVar2, (e23.a) objQ2, mVar, 54);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                i iVar = i.f135676a;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    h4.r.a aVar3 = h4.r.S;
                    q40.b bVar = new q40.b(0L, "Course Point", "4.05", "km", "678", "m", com.garmin.android.apps.connectmobile.courses.model.f.BRIDGE, "Test Note", 10000, 20000, true, true, true, 0.0d, 0.0d);
                    Object objQ3 = mVar2.q();
                    aVar.getClass();
                    p3.m.a.C2565a c2565a2 = p3.m.a.f135155b;
                    if (objQ3 == c2565a2) {
                        objQ3 = new ot1.t(26);
                        mVar2.K(objQ3);
                    }
                    e23.l lVar = (e23.l) objQ3;
                    Object objQ4 = mVar2.q();
                    if (objQ4 == c2565a2) {
                        objQ4 = new ot1.t(27);
                        mVar2.K(objQ4);
                    }
                    e23.l lVar2 = (e23.l) objQ4;
                    Object objQ5 = mVar2.q();
                    if (objQ5 == c2565a2) {
                        objQ5 = new ot1.t(28);
                        mVar2.K(objQ5);
                    }
                    e23.l lVar3 = (e23.l) objQ5;
                    Object objQ6 = mVar2.q();
                    if (objQ6 == c2565a2) {
                        objQ6 = new ot1.t(29);
                        mVar2.K(objQ6);
                    }
                    e23.l lVar4 = (e23.l) objQ6;
                    Object objQ7 = mVar2.q();
                    if (objQ7 == c2565a2) {
                        objQ7 = new h(false ? 1 : 0);
                        mVar2.K(objQ7);
                    }
                    r0.d(aVar3, bVar, lVar, lVar2, lVar3, lVar4, (e23.l) objQ7, mVar2, 1797510);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 2:
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                i iVar2 = i.f135676a;
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    String strQ = gl1.y.Q(mVar3, R.string.message_confirmation_remove_course_point);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    x0 x0VarB = d92.c.b(j92.f.f97932i, mVar3);
                    g6.f.a aVar4 = g6.f.f75994b;
                    h4.r rVarC = c2.l.C(x2.f(h4.r.S, 1.0f), 0.0f, 8, 0.0f, 0.0f, 13);
                    d6.h.f57752b.getClass();
                    mh.c(strQ, rVarC, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarB, mVar3, 48, 0, 130044);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 3:
                p3.m mVar4 = (p3.m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                i iVar3 = i.f135676a;
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var4 = p3.n.f135158a;
                    h4.r.a aVar5 = h4.r.S;
                    h4.d.f81522a.getClass();
                    z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
                    int iHashCode = Long.hashCode(mVar4.getU());
                    i2 i2VarX = mVar4.x();
                    h4.r rVarC2 = h4.k.c(aVar5, mVar4);
                    h5.g.V.getClass();
                    h5.e0.a aVar6 = h5.g.a.f81805b;
                    if (mVar4.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar4.z();
                    if (mVar4.getT()) {
                        mVar4.M(aVar6);
                    } else {
                        mVar4.c();
                    }
                    b4.c(h5.g.a.f81810g, z0VarD, mVar4);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar4);
                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                    if (mVar4.getT() || !p005kotlin.jvm.internal.s.g(mVar4.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar4, iHashCode, bVar2);
                    }
                    b4.c(h5.g.a.f81807d, rVarC2, mVar4);
                    c2.u uVar = c2.u.f22885a;
                    s62.a.f157643a.getClass();
                    u4.d dVarA = s6.a(t62.b.f162798a);
                    String strQ2 = gl1.y.Q(mVar4, R.string.lbl_add);
                    long jG = fb1.c.g(d92.b.f58623a, mVar4);
                    d92.b.f58625c.getClass();
                    i7.b(dVarA, strQ2, x2.q(aVar5, j92.b.f97901d.f97905d), jG, mVar4, 0, 0);
                    mVar4.y();
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 4:
                p3.m mVar5 = (p3.m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                i iVar4 = i.f135676a;
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x1 x1Var5 = p3.n.f135158a;
                    h4.r.a aVar7 = h4.r.S;
                    h4.d.f81522a.getClass();
                    z0 z0VarD2 = c2.q.d(h4.d.a.f81524b, false);
                    int iHashCode2 = Long.hashCode(mVar5.getU());
                    i2 i2VarX2 = mVar5.x();
                    h4.r rVarC3 = h4.k.c(aVar7, mVar5);
                    h5.g.V.getClass();
                    h5.e0.a aVar8 = h5.g.a.f81805b;
                    if (mVar5.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar5.z();
                    if (mVar5.getT()) {
                        mVar5.M(aVar8);
                    } else {
                        mVar5.c();
                    }
                    b4.c(h5.g.a.f81810g, z0VarD2, mVar5);
                    b4.c(h5.g.a.f81809f, i2VarX2, mVar5);
                    h5.g.a.b bVar3 = h5.g.a.f81813j;
                    if (mVar5.getT() || !p005kotlin.jvm.internal.s.g(mVar5.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar5, iHashCode2, bVar3);
                    }
                    b4.c(h5.g.a.f81807d, rVarC3, mVar5);
                    c2.u uVar2 = c2.u.f22885a;
                    s62.a.f157643a.getClass();
                    u4.d dVarA2 = j1.a(t62.b.f162798a);
                    long jA = com.airbnb.lottie.animation.keyframe.a.a(d92.b.f58623a, mVar5);
                    String strQ3 = gl1.y.Q(mVar5, R.string.lbl_edit);
                    d92.b.f58625c.getClass();
                    i7.b(dVarA2, strQ3, x2.q(aVar7, j92.b.f97901d.f97905d), jA, mVar5, 0, 0);
                    mVar5.y();
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 5:
                p3.m mVar6 = (p3.m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                i iVar5 = i.f135676a;
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    x1 x1Var6 = p3.n.f135158a;
                    h4.r.a aVar9 = h4.r.S;
                    h4.d.f81522a.getClass();
                    z0 z0VarD3 = c2.q.d(h4.d.a.f81524b, false);
                    int iHashCode3 = Long.hashCode(mVar6.getU());
                    i2 i2VarX3 = mVar6.x();
                    h4.r rVarC4 = h4.k.c(aVar9, mVar6);
                    h5.g.V.getClass();
                    h5.e0.a aVar10 = h5.g.a.f81805b;
                    if (mVar6.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar6.z();
                    if (mVar6.getT()) {
                        mVar6.M(aVar10);
                    } else {
                        mVar6.c();
                    }
                    b4.c(h5.g.a.f81810g, z0VarD3, mVar6);
                    b4.c(h5.g.a.f81809f, i2VarX3, mVar6);
                    h5.g.a.b bVar4 = h5.g.a.f81813j;
                    if (mVar6.getT() || !p005kotlin.jvm.internal.s.g(mVar6.q(), Integer.valueOf(iHashCode3))) {
                        v.h.z(iHashCode3, mVar6, iHashCode3, bVar4);
                    }
                    b4.c(h5.g.a.f81807d, rVarC4, mVar6);
                    c2.u uVar3 = c2.u.f22885a;
                    s62.a.f157643a.getClass();
                    u4.d dVarA3 = s6.a(t62.b.f162798a);
                    String strQ4 = gl1.y.Q(mVar6, R.string.lbl_add);
                    long jG2 = fb1.c.g(d92.b.f58623a, mVar6);
                    d92.b.f58625c.getClass();
                    i7.b(dVarA3, strQ4, x2.q(aVar9, j92.b.f97901d.f97905d), jG2, mVar6, 0, 0);
                    mVar6.y();
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 6:
                p3.m mVar7 = (p3.m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                i iVar6 = i.f135676a;
                if (mVar7.n(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    x1 x1Var7 = p3.n.f135158a;
                    h4.r.a aVar11 = h4.r.S;
                    h4.d.f81522a.getClass();
                    z0 z0VarD4 = c2.q.d(h4.d.a.f81524b, false);
                    int iHashCode4 = Long.hashCode(mVar7.getU());
                    i2 i2VarX4 = mVar7.x();
                    h4.r rVarC5 = h4.k.c(aVar11, mVar7);
                    h5.g.V.getClass();
                    h5.e0.a aVar12 = h5.g.a.f81805b;
                    if (mVar7.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar7.z();
                    if (mVar7.getT()) {
                        mVar7.M(aVar12);
                    } else {
                        mVar7.c();
                    }
                    b4.c(h5.g.a.f81810g, z0VarD4, mVar7);
                    b4.c(h5.g.a.f81809f, i2VarX4, mVar7);
                    h5.g.a.b bVar5 = h5.g.a.f81813j;
                    if (mVar7.getT() || !p005kotlin.jvm.internal.s.g(mVar7.q(), Integer.valueOf(iHashCode4))) {
                        v.h.z(iHashCode4, mVar7, iHashCode4, bVar5);
                    }
                    b4.c(h5.g.a.f81807d, rVarC5, mVar7);
                    c2.u uVar4 = c2.u.f22885a;
                    s62.a.f157643a.getClass();
                    u4.d dVarA4 = j1.a(t62.b.f162798a);
                    long jA2 = com.airbnb.lottie.animation.keyframe.a.a(d92.b.f58623a, mVar7);
                    String strQ5 = gl1.y.Q(mVar7, R.string.lbl_remove);
                    d92.b.f58625c.getClass();
                    i7.b(dVarA4, strQ5, x2.q(aVar11, j92.b.f97901d.f97905d), jA2, mVar7, 0, 0);
                    mVar7.y();
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 7:
                p3.m mVar8 = (p3.m) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (mVar8.n(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    x1 x1Var8 = p3.n.f135158a;
                    h4.r.a aVar13 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h4.r rVarA = c2.l.A(aVar13, j92.b.f97899b.f97918c, 0.0f, 2);
                    c2.j.f22691a.getClass();
                    c2.j.c cVar = c2.j.f22696f;
                    h4.d.f81522a.getClass();
                    c2.z zVarA = c2.y.a(cVar, h4.d.a.f81537o, mVar8, 54);
                    int iHashCode5 = Long.hashCode(mVar8.getU());
                    i2 i2VarX5 = mVar8.x();
                    h4.r rVarC6 = h4.k.c(rVarA, mVar8);
                    h5.g.V.getClass();
                    h5.e0.a aVar14 = h5.g.a.f81805b;
                    if (mVar8.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar8.z();
                    if (mVar8.getT()) {
                        mVar8.M(aVar14);
                    } else {
                        mVar8.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, mVar8);
                    b4.c(h5.g.a.f81809f, i2VarX5, mVar8);
                    h5.g.a.b bVar6 = h5.g.a.f81813j;
                    if (mVar8.getT() || !p005kotlin.jvm.internal.s.g(mVar8.q(), Integer.valueOf(iHashCode5))) {
                        v.h.z(iHashCode5, mVar8, iHashCode5, bVar6);
                    }
                    b4.c(h5.g.a.f81807d, rVarC6, mVar8);
                    c2.b0 b0Var = c2.b0.f22601a;
                    d92.b.f58624b.getClass();
                    mh.c("min", null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, j92.f.f97932i, mVar8, 0, 0, 131070);
                    mVar8.y();
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 8:
                p3.m mVar9 = (p3.m) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (mVar9.n(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    x1 x1Var9 = p3.n.f135158a;
                    h4.r.a aVar15 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h4.r rVarA2 = c2.l.A(aVar15, j92.b.f97899b.f97918c, 0.0f, 2);
                    c2.j.f22691a.getClass();
                    c2.j.c cVar2 = c2.j.f22696f;
                    h4.d.f81522a.getClass();
                    c2.z zVarA2 = c2.y.a(cVar2, h4.d.a.f81537o, mVar9, 54);
                    int iHashCode6 = Long.hashCode(mVar9.getU());
                    i2 i2VarX6 = mVar9.x();
                    h4.r rVarC7 = h4.k.c(rVarA2, mVar9);
                    h5.g.V.getClass();
                    h5.e0.a aVar16 = h5.g.a.f81805b;
                    if (mVar9.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar9.z();
                    if (mVar9.getT()) {
                        mVar9.M(aVar16);
                    } else {
                        mVar9.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA2, mVar9);
                    b4.c(h5.g.a.f81809f, i2VarX6, mVar9);
                    h5.g.a.b bVar7 = h5.g.a.f81813j;
                    if (mVar9.getT() || !p005kotlin.jvm.internal.s.g(mVar9.q(), Integer.valueOf(iHashCode6))) {
                        v.h.z(iHashCode6, mVar9, iHashCode6, bVar7);
                    }
                    b4.c(h5.g.a.f81807d, rVarC7, mVar9);
                    c2.b0 b0Var2 = c2.b0.f22601a;
                    d92.b.f58624b.getClass();
                    mh.c("sec", null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, j92.f.f97932i, mVar9, 0, 0, 131070);
                    mVar9.y();
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 9:
                p3.m mVar10 = (p3.m) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (mVar10.n(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    x1 x1Var10 = p3.n.f135158a;
                    h4.r.a aVar17 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h4.r rVarA3 = c2.l.A(aVar17, j92.b.f97899b.f97918c, 0.0f, 2);
                    c2.j.f22691a.getClass();
                    c2.j.c cVar3 = c2.j.f22696f;
                    h4.d.f81522a.getClass();
                    c2.z zVarA3 = c2.y.a(cVar3, h4.d.a.f81537o, mVar10, 54);
                    int iHashCode7 = Long.hashCode(mVar10.getU());
                    i2 i2VarX7 = mVar10.x();
                    h4.r rVarC8 = h4.k.c(rVarA3, mVar10);
                    h5.g.V.getClass();
                    h5.e0.a aVar18 = h5.g.a.f81805b;
                    if (mVar10.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar10.z();
                    if (mVar10.getT()) {
                        mVar10.M(aVar18);
                    } else {
                        mVar10.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA3, mVar10);
                    b4.c(h5.g.a.f81809f, i2VarX7, mVar10);
                    h5.g.a.b bVar8 = h5.g.a.f81813j;
                    if (mVar10.getT() || !p005kotlin.jvm.internal.s.g(mVar10.q(), Integer.valueOf(iHashCode7))) {
                        v.h.z(iHashCode7, mVar10, iHashCode7, bVar8);
                    }
                    b4.c(h5.g.a.f81807d, rVarC8, mVar10);
                    c2.b0 b0Var3 = c2.b0.f22601a;
                    d92.b.f58624b.getClass();
                    mh.c(":", null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, j92.f.f97932i, mVar10, 0, 0, 131070);
                    mVar10.y();
                } else {
                    mVar10.e();
                }
                return Unit.INSTANCE;
            case 10:
                p3.m mVar11 = (p3.m) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (mVar11.n(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    x1 x1Var11 = p3.n.f135158a;
                    h4.r.a aVar19 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h4.r rVarA4 = c2.l.A(aVar19, j92.b.f97899b.f97918c, 0.0f, 2);
                    c2.j.f22691a.getClass();
                    c2.j.c cVar4 = c2.j.f22696f;
                    h4.d.f81522a.getClass();
                    c2.z zVarA4 = c2.y.a(cVar4, h4.d.a.f81537o, mVar11, 54);
                    int iHashCode8 = Long.hashCode(mVar11.getU());
                    i2 i2VarX8 = mVar11.x();
                    h4.r rVarC9 = h4.k.c(rVarA4, mVar11);
                    h5.g.V.getClass();
                    h5.e0.a aVar20 = h5.g.a.f81805b;
                    if (mVar11.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar11.z();
                    if (mVar11.getT()) {
                        mVar11.M(aVar20);
                    } else {
                        mVar11.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA4, mVar11);
                    b4.c(h5.g.a.f81809f, i2VarX8, mVar11);
                    h5.g.a.b bVar9 = h5.g.a.f81813j;
                    if (mVar11.getT() || !p005kotlin.jvm.internal.s.g(mVar11.q(), Integer.valueOf(iHashCode8))) {
                        v.h.z(iHashCode8, mVar11, iHashCode8, bVar9);
                    }
                    b4.c(h5.g.a.f81807d, rVarC9, mVar11);
                    c2.b0 b0Var4 = c2.b0.f22601a;
                    d92.b.f58624b.getClass();
                    mh.c(":", null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, j92.f.f97932i, mVar11, 0, 0, 131070);
                    mVar11.y();
                } else {
                    mVar11.e();
                }
                return Unit.INSTANCE;
            case 11:
                p3.m mVar12 = (p3.m) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                if (mVar12.n(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    x1 x1Var12 = p3.n.f135158a;
                    h4.r.a aVar21 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h4.r rVarA5 = c2.l.A(aVar21, j92.b.f97899b.f97918c, 0.0f, 2);
                    c2.j.f22691a.getClass();
                    c2.j.c cVar5 = c2.j.f22696f;
                    h4.d.f81522a.getClass();
                    c2.z zVarA5 = c2.y.a(cVar5, h4.d.a.f81537o, mVar12, 54);
                    int iHashCode9 = Long.hashCode(mVar12.getU());
                    i2 i2VarX9 = mVar12.x();
                    h4.r rVarC10 = h4.k.c(rVarA5, mVar12);
                    h5.g.V.getClass();
                    h5.e0.a aVar22 = h5.g.a.f81805b;
                    if (mVar12.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar12.z();
                    if (mVar12.getT()) {
                        mVar12.M(aVar22);
                    } else {
                        mVar12.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA5, mVar12);
                    b4.c(h5.g.a.f81809f, i2VarX9, mVar12);
                    h5.g.a.b bVar10 = h5.g.a.f81813j;
                    if (mVar12.getT() || !p005kotlin.jvm.internal.s.g(mVar12.q(), Integer.valueOf(iHashCode9))) {
                        v.h.z(iHashCode9, mVar12, iHashCode9, bVar10);
                    }
                    b4.c(h5.g.a.f81807d, rVarC10, mVar12);
                    c2.b0 b0Var5 = c2.b0.f22601a;
                    d92.b.f58624b.getClass();
                    mh.c("", null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, j92.f.f97932i, mVar12, 0, 0, 131070);
                    mVar12.y();
                } else {
                    mVar12.e();
                }
                return Unit.INSTANCE;
            case 12:
                p3.m mVar13 = (p3.m) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                p50.b bVar11 = p50.b.f136104a;
                if (mVar13.n(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    x1 x1Var13 = p3.n.f135158a;
                    s62.a.f157643a.getClass();
                    u4.d dVarA5 = e1.a(t62.b.f162798a);
                    String strQ6 = gl1.y.Q(mVar13, R.string.lbl_selected);
                    d92.b.f58623a.getClass();
                    long jA3 = d92.b.a(mVar13).k().a();
                    h4.r.a aVar23 = h4.r.S;
                    d92.b.f58625c.getClass();
                    i7.b(dVarA5, strQ6, x2.q(aVar23, j92.b.f97901d.f97905d), jA3, mVar13, 0, 0);
                } else {
                    mVar13.e();
                }
                return Unit.INSTANCE;
            case 13:
                p3.m mVar14 = (p3.m) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                p50.b bVar12 = p50.b.f136104a;
                if (mVar14.n(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    x1 x1Var14 = p3.n.f135158a;
                    h4.r.a aVar24 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    c2.l.f(x2.h(aVar24, j92.b.f97899b.f97920e), mVar14);
                } else {
                    mVar14.e();
                }
                return Unit.INSTANCE;
            case 14:
                p3.m mVar15 = (p3.m) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                p50.b bVar13 = p50.b.f136104a;
                if (mVar15.n(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    x1 x1Var15 = p3.n.f135158a;
                    h4.r.a aVar25 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h4.r rVarA6 = c2.l.A(aVar25, j92.b.f97899b.f97920e, 0.0f, 2);
                    c2.j.f22691a.getClass();
                    c2.j.c cVar6 = c2.j.f22696f;
                    h4.d.f81522a.getClass();
                    c2.z zVarA6 = c2.y.a(cVar6, h4.d.a.f81537o, mVar15, 54);
                    int iHashCode10 = Long.hashCode(mVar15.getU());
                    i2 i2VarX10 = mVar15.x();
                    h4.r rVarC11 = h4.k.c(rVarA6, mVar15);
                    h5.g.V.getClass();
                    h5.e0.a aVar26 = h5.g.a.f81805b;
                    if (mVar15.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar15.z();
                    if (mVar15.getT()) {
                        mVar15.M(aVar26);
                    } else {
                        mVar15.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA6, mVar15);
                    b4.c(h5.g.a.f81809f, i2VarX10, mVar15);
                    h5.g.a.b bVar14 = h5.g.a.f81813j;
                    if (mVar15.getT() || !p005kotlin.jvm.internal.s.g(mVar15.q(), Integer.valueOf(iHashCode10))) {
                        v.h.z(iHashCode10, mVar15, iHashCode10, bVar14);
                    }
                    b4.c(h5.g.a.f81807d, rVarC11, mVar15);
                    c2.b0 b0Var6 = c2.b0.f22601a;
                    mVar15.y();
                } else {
                    mVar15.e();
                }
                return Unit.INSTANCE;
            case 15:
                p3.m mVar16 = (p3.m) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                p72.a aVar27 = p72.a.f136312a;
                if (mVar16.n(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    x1 x1Var16 = p3.n.f135158a;
                    s62.a.f157643a.getClass();
                    i7.b(o7.a(t62.b.f162798a), null, null, com.airbnb.lottie.animation.keyframe.a.a(d92.b.f58623a, mVar16), mVar16, 48, 4);
                } else {
                    mVar16.e();
                }
                return Unit.INSTANCE;
            case 16:
                ((Integer) obj2).getClass();
                p72.d.a((p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 17:
                ((Integer) obj2).getClass();
                p72.d.e((p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 18:
                ((Integer) obj2).getClass();
                p72.d.c((p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 19:
                ((Integer) obj2).getClass();
                p72.d.b((p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 20:
                p91.b bVar15 = p91.b.f136560a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return (m91.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, m91.a.class, new c83.h.a[0], null, null, null, 120);
            case 21:
                Scope scope = (Scope) obj;
                p91.b bVar16 = p91.b.f136560a;
                scope.getClass();
                ((ParametersHolder) obj2).getClass();
                return new o91.g((m91.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(m91.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 22:
                Scope scope2 = (Scope) obj;
                p91.b bVar17 = p91.b.f136560a;
                scope2.getClass();
                ((ParametersHolder) obj2).getClass();
                return new zp.b((b2) scope2.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(b2.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 23:
                Scope scope3 = (Scope) obj;
                ParametersHolder parametersHolder = (ParametersHolder) obj2;
                p91.b bVar18 = p91.b.f136560a;
                scope3.getClass();
                parametersHolder.getClass();
                p005kotlin.jvm.internal.t0 t0Var = p005kotlin.jvm.internal.s0.f105811a;
                Long l14 = (Long) parametersHolder.elementAt(0, t0Var.b(Long.class));
                Context contextAndroidContext = ModuleExtKt.androidContext(scope3);
                androidx.lifecycle.j1 j1Var = (androidx.lifecycle.j1) scope3.get((k23.d<?>) t0Var.b(androidx.lifecycle.j1.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                o91.a aVar28 = (o91.a) scope3.get((k23.d<?>) t0Var.b(o91.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                ru1.d dVar = (ru1.d) scope3.get((k23.d<?>) t0Var.b(ru1.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                bn.a aVar29 = (bn.a) scope3.get((k23.d<?>) t0Var.b(bn.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                bv.b.f21239a.getClass();
                bv.b.a();
                return new ba1.d(contextAndroidContext, j1Var, aVar28, dVar, k1.f37122a, aVar29, (f12.l) scope3.get((k23.d<?>) t0Var.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zp.a) scope3.get((k23.d<?>) t0Var.b(zp.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), l14);
            case 24:
                p3.m mVar17 = (p3.m) obj;
                int iIntValue17 = ((Integer) obj2).intValue();
                pa0.c cVar7 = pa0.c.f136708a;
                if (mVar17.n(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    x1 x1Var17 = p3.n.f135158a;
                    Object objQ8 = mVar17.q();
                    aVar.getClass();
                    p3.m.a.C2565a c2565a3 = p3.m.a.f135155b;
                    if (objQ8 == c2565a3) {
                        objQ8 = new f(5);
                        mVar17.K(objQ8);
                    }
                    e23.a aVar30 = (e23.a) objQ8;
                    Object objQ9 = mVar17.q();
                    if (objQ9 == c2565a3) {
                        objQ9 = new f(6);
                        mVar17.K(objQ9);
                    }
                    e23.a aVar31 = (e23.a) objQ9;
                    Object objQ10 = mVar17.q();
                    if (objQ10 == c2565a3) {
                        objQ10 = new f(7);
                        mVar17.K(objQ10);
                    }
                    pa0.g.a("Fenix 8", false, aVar30, aVar31, (e23.a) objQ10, mVar17, 28086);
                } else {
                    mVar17.e();
                }
                return Unit.INSTANCE;
            case 25:
                p3.m mVar18 = (p3.m) obj;
                int iIntValue18 = ((Integer) obj2).intValue();
                pa0.c cVar8 = pa0.c.f136708a;
                if (mVar18.n(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    x1 x1Var18 = p3.n.f135158a;
                    ve.a(x2.d(h4.r.S, 1.0f), null, tn.k.a(d92.b.f58623a, mVar18), 0L, 0.0f, 0.0f, null, pa0.c.f136714g, mVar18, 12582918, 122);
                } else {
                    mVar18.e();
                }
                return Unit.INSTANCE;
            case 26:
                p3.m mVar19 = (p3.m) obj;
                int iIntValue19 = ((Integer) obj2).intValue();
                pa0.c cVar9 = pa0.c.f136708a;
                if (mVar19.n(iIntValue19 & 1, (iIntValue19 & 3) != 2)) {
                    x1 x1Var19 = p3.n.f135158a;
                    Object objQ11 = mVar19.q();
                    aVar.getClass();
                    p3.m.a.C2565a c2565a4 = p3.m.a.f135155b;
                    if (objQ11 == c2565a4) {
                        objQ11 = new f(10);
                        mVar19.K(objQ11);
                    }
                    e23.a aVar32 = (e23.a) objQ11;
                    Object objQ12 = mVar19.q();
                    if (objQ12 == c2565a4) {
                        objQ12 = new f(11);
                        mVar19.K(objQ12);
                    }
                    pa0.g.e(aVar32, (e23.a) objQ12, mVar19, 54);
                } else {
                    mVar19.e();
                }
                return Unit.INSTANCE;
            case 27:
                return a(obj, obj2);
            case 28:
                return b(obj, obj2);
            default:
                p3.m mVar20 = (p3.m) obj;
                int iIntValue20 = ((Integer) obj2).intValue();
                pa0.c cVar10 = pa0.c.f136708a;
                if (mVar20.n(iIntValue20 & 1, (iIntValue20 & 3) != 2)) {
                    x1 x1Var20 = p3.n.f135158a;
                    ve.a(x2.d(h4.r.S, 1.0f), null, tn.k.a(d92.b.f58623a, mVar20), 0L, 0.0f, 0.0f, null, pa0.c.f136716i, mVar20, 12582918, 122);
                } else {
                    mVar20.e();
                }
                return Unit.INSTANCE;
        }
    }
}
