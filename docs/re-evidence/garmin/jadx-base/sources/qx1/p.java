package qx1;

import b82.d1;
import c2.k3;
import c2.n3;
import c2.p3;
import c2.q3;
import c2.u;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import f5.z0;
import gl1.y;
import h4.r;
import h5.e0;
import i3.i7;
import org.koin.android.ext.koin.ModuleExtKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p13.l0;
import p3.b4;
import p3.i2;
import p3.p0;
import p3.x1;
import r22.w;
import sz1.t;
import v62.a8;
import v62.e1;
import v62.j1;
import v62.l2;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class p implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f148444a;

    public /* synthetic */ p(int i14) {
        this.f148444a = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f148444a;
        int i15 = 26;
        p3.m.a aVar = p3.m.f135153a;
        switch (i14) {
            case 0:
                ((Boolean) obj2).booleanValue();
                ((String) obj).getClass();
                return Unit.INSTANCE;
            case 1:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                qy0.b bVar = qy0.b.f148467a;
                if (mVar.n(1 & iIntValue, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    r.a aVar2 = r.S;
                    h4.d.f81522a.getClass();
                    z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
                    int iHashCode = Long.hashCode(mVar.getU());
                    i2 i2VarX = mVar.x();
                    r rVarC = h4.k.c(aVar2, mVar);
                    h5.g.V.getClass();
                    e0.a aVar3 = h5.g.a.f81805b;
                    if (mVar.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar.z();
                    if (mVar.getT()) {
                        mVar.M(aVar3);
                    } else {
                        mVar.c();
                    }
                    b4.c(h5.g.a.f81810g, z0VarD, mVar);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar);
                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                    if (mVar.getT() || !s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar, iHashCode, bVar2);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar);
                    u uVar = u.f22885a;
                    s62.a.f157643a.getClass();
                    u4.d dVarA = j1.a(t62.b.f162798a);
                    long jA = com.airbnb.lottie.animation.keyframe.a.a(d92.b.f58623a, mVar);
                    d92.b.f58625c.getClass();
                    i7.b(dVarA, "", x2.q(aVar2, j92.b.f97901d.f97904c), jA, mVar, 48, 0);
                    mVar.y();
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 2:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                qy0.b bVar3 = qy0.b.f148467a;
                if (mVar2.n(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    r.a aVar4 = r.S;
                    h4.d.f81522a.getClass();
                    z0 z0VarD2 = c2.q.d(h4.d.a.f81524b, false);
                    int iHashCode2 = Long.hashCode(mVar2.getU());
                    i2 i2VarX2 = mVar2.x();
                    r rVarC2 = h4.k.c(aVar4, mVar2);
                    h5.g.V.getClass();
                    e0.a aVar5 = h5.g.a.f81805b;
                    if (mVar2.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar5);
                    } else {
                        mVar2.c();
                    }
                    b4.c(h5.g.a.f81810g, z0VarD2, mVar2);
                    b4.c(h5.g.a.f81809f, i2VarX2, mVar2);
                    h5.g.a.b bVar4 = h5.g.a.f81813j;
                    if (mVar2.getT() || !s.g(mVar2.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar2, iHashCode2, bVar4);
                    }
                    b4.c(h5.g.a.f81807d, rVarC2, mVar2);
                    u uVar2 = u.f22885a;
                    s62.a.f157643a.getClass();
                    u4.d dVarA2 = j1.a(t62.b.f162798a);
                    long jA2 = com.airbnb.lottie.animation.keyframe.a.a(d92.b.f58623a, mVar2);
                    d92.b.f58625c.getClass();
                    i7.b(dVarA2, "", x2.q(aVar4, j92.b.f97901d.f97904c), jA2, mVar2, 48, 0);
                    mVar2.y();
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 3:
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                qy0.b bVar5 = qy0.b.f148467a;
                if (mVar3.n(1 & iIntValue3, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    r.a aVar6 = r.S;
                    h4.d.f81522a.getClass();
                    z0 z0VarD3 = c2.q.d(h4.d.a.f81524b, false);
                    int iHashCode3 = Long.hashCode(mVar3.getU());
                    i2 i2VarX3 = mVar3.x();
                    r rVarC3 = h4.k.c(aVar6, mVar3);
                    h5.g.V.getClass();
                    e0.a aVar7 = h5.g.a.f81805b;
                    if (mVar3.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar3.z();
                    if (mVar3.getT()) {
                        mVar3.M(aVar7);
                    } else {
                        mVar3.c();
                    }
                    b4.c(h5.g.a.f81810g, z0VarD3, mVar3);
                    b4.c(h5.g.a.f81809f, i2VarX3, mVar3);
                    h5.g.a.b bVar6 = h5.g.a.f81813j;
                    if (mVar3.getT() || !s.g(mVar3.q(), Integer.valueOf(iHashCode3))) {
                        v.h.z(iHashCode3, mVar3, iHashCode3, bVar6);
                    }
                    b4.c(h5.g.a.f81807d, rVarC3, mVar3);
                    u uVar3 = u.f22885a;
                    s62.a.f157643a.getClass();
                    u4.d dVarA3 = j1.a(t62.b.f162798a);
                    long jA3 = com.airbnb.lottie.animation.keyframe.a.a(d92.b.f58623a, mVar3);
                    d92.b.f58625c.getClass();
                    i7.b(dVarA3, "", x2.q(aVar6, j92.b.f97901d.f97904c), jA3, mVar3, 48, 0);
                    mVar3.y();
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 4:
                p3.m mVar4 = (p3.m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                qy0.b bVar7 = qy0.b.f148467a;
                if (mVar4.n(1 & iIntValue4, (iIntValue4 & 3) != 2)) {
                    x1 x1Var4 = p3.n.f135158a;
                    r.a aVar8 = r.S;
                    h4.d.f81522a.getClass();
                    z0 z0VarD4 = c2.q.d(h4.d.a.f81524b, false);
                    int iHashCode4 = Long.hashCode(mVar4.getU());
                    i2 i2VarX4 = mVar4.x();
                    r rVarC4 = h4.k.c(aVar8, mVar4);
                    h5.g.V.getClass();
                    e0.a aVar9 = h5.g.a.f81805b;
                    if (mVar4.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar4.z();
                    if (mVar4.getT()) {
                        mVar4.M(aVar9);
                    } else {
                        mVar4.c();
                    }
                    b4.c(h5.g.a.f81810g, z0VarD4, mVar4);
                    b4.c(h5.g.a.f81809f, i2VarX4, mVar4);
                    h5.g.a.b bVar8 = h5.g.a.f81813j;
                    if (mVar4.getT() || !s.g(mVar4.q(), Integer.valueOf(iHashCode4))) {
                        v.h.z(iHashCode4, mVar4, iHashCode4, bVar8);
                    }
                    b4.c(h5.g.a.f81807d, rVarC4, mVar4);
                    u uVar4 = u.f22885a;
                    s62.a.f157643a.getClass();
                    u4.d dVarA4 = j1.a(t62.b.f162798a);
                    long jA4 = com.airbnb.lottie.animation.keyframe.a.a(d92.b.f58623a, mVar4);
                    d92.b.f58625c.getClass();
                    i7.b(dVarA4, "", x2.q(aVar8, j92.b.f97901d.f97904c), jA4, mVar4, 48, 0);
                    mVar4.y();
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 5:
                p3.m mVar5 = (p3.m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                qy0.b bVar9 = qy0.b.f148467a;
                if (mVar5.n(1 & iIntValue5, (iIntValue5 & 3) != 2)) {
                    x1 x1Var5 = p3.n.f135158a;
                    r.a aVar10 = r.S;
                    h4.d.f81522a.getClass();
                    z0 z0VarD5 = c2.q.d(h4.d.a.f81524b, false);
                    int iHashCode5 = Long.hashCode(mVar5.getU());
                    i2 i2VarX5 = mVar5.x();
                    r rVarC5 = h4.k.c(aVar10, mVar5);
                    h5.g.V.getClass();
                    e0.a aVar11 = h5.g.a.f81805b;
                    if (mVar5.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar5.z();
                    if (mVar5.getT()) {
                        mVar5.M(aVar11);
                    } else {
                        mVar5.c();
                    }
                    b4.c(h5.g.a.f81810g, z0VarD5, mVar5);
                    b4.c(h5.g.a.f81809f, i2VarX5, mVar5);
                    h5.g.a.b bVar10 = h5.g.a.f81813j;
                    if (mVar5.getT() || !s.g(mVar5.q(), Integer.valueOf(iHashCode5))) {
                        v.h.z(iHashCode5, mVar5, iHashCode5, bVar10);
                    }
                    b4.c(h5.g.a.f81807d, rVarC5, mVar5);
                    u uVar5 = u.f22885a;
                    s62.a.f157643a.getClass();
                    u4.d dVarA5 = j1.a(t62.b.f162798a);
                    long jA5 = com.airbnb.lottie.animation.keyframe.a.a(d92.b.f58623a, mVar5);
                    d92.b.f58625c.getClass();
                    i7.b(dVarA5, "", x2.q(aVar10, j92.b.f97901d.f97904c), jA5, mVar5, 48, 0);
                    mVar5.y();
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 6:
                p3.m mVar6 = (p3.m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                qy0.b bVar11 = qy0.b.f148467a;
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    x1 x1Var6 = p3.n.f135158a;
                    Object objQ = mVar6.q();
                    aVar.getClass();
                    p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                    if (objQ == c2565a) {
                        objQ = new qv1.l(7);
                        mVar6.K(objQ);
                    }
                    e23.l lVar = (e23.l) objQ;
                    Object objQ2 = mVar6.q();
                    if (objQ2 == c2565a) {
                        objQ2 = new qv1.l(8);
                        mVar6.K(objQ2);
                    }
                    e23.l lVar2 = (e23.l) objQ2;
                    Object objQ3 = mVar6.q();
                    if (objQ3 == c2565a) {
                        objQ3 = new qv1.l(9);
                        mVar6.K(objQ3);
                    }
                    e23.l lVar3 = (e23.l) objQ3;
                    Object objQ4 = mVar6.q();
                    if (objQ4 == c2565a) {
                        objQ4 = new qy0.a(0);
                        mVar6.K(objQ4);
                    }
                    e23.a aVar12 = (e23.a) objQ4;
                    Object objQ5 = mVar6.q();
                    if (objQ5 == c2565a) {
                        objQ5 = new qy0.a(1);
                        mVar6.K(objQ5);
                    }
                    e23.a aVar13 = (e23.a) objQ5;
                    Object objQ6 = mVar6.q();
                    if (objQ6 == c2565a) {
                        objQ6 = new qy0.a(2);
                        mVar6.K(objQ6);
                    }
                    e23.a aVar14 = (e23.a) objQ6;
                    Object objQ7 = mVar6.q();
                    if (objQ7 == c2565a) {
                        objQ7 = new qv1.l(10);
                        mVar6.K(objQ7);
                    }
                    e23.l lVar4 = (e23.l) objQ7;
                    l0 l0Var = l0.f134950a;
                    Object objQ8 = mVar6.q();
                    if (objQ8 == c2565a) {
                        objQ8 = new qy0.a(3);
                        mVar6.K(objQ8);
                    }
                    e23.a aVar15 = (e23.a) objQ8;
                    Object objQ9 = mVar6.q();
                    if (objQ9 == c2565a) {
                        objQ9 = new qr.n(26);
                        mVar6.K(objQ9);
                    }
                    e23.a aVar16 = (e23.a) objQ9;
                    Object objQ10 = mVar6.q();
                    if (objQ10 == c2565a) {
                        objQ10 = new qr.n(27);
                        mVar6.K(objQ10);
                    }
                    e23.a aVar17 = (e23.a) objQ10;
                    Object objQ11 = mVar6.q();
                    if (objQ11 == c2565a) {
                        objQ11 = new qr.n(28);
                        mVar6.K(objQ11);
                    }
                    e23.a aVar18 = (e23.a) objQ11;
                    Object objQ12 = mVar6.q();
                    if (objQ12 == c2565a) {
                        objQ12 = new qr.n(29);
                        mVar6.K(objQ12);
                    }
                    qy0.k.a("name", lVar, null, null, lVar2, lVar3, null, null, false, true, false, null, aVar12, aVar13, aVar14, lVar4, l0Var, true, aVar15, aVar16, aVar17, aVar18, false, (e23.a) objQ12, mVar6, 807103926, 920350134, 3510, 384);
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 7:
                Scope scope = (Scope) obj;
                qz1.a aVar19 = qz1.a.f148628a;
                scope.getClass();
                ((ParametersHolder) obj2).getClass();
                pz1.b.a aVar20 = pz1.b.f141926c;
                f12.b bVar12 = (f12.b) scope.get((k23.d<?>) s0.f105811a.b(f12.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                nz1.a aVar21 = (nz1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, nz1.a.class, new c83.h.a[0], null, null, null, 120);
                aVar20.getClass();
                aVar21.getClass();
                bVar12.getClass();
                return new t(new pz1.b(aVar21, bVar12));
            case 8:
                Scope scope2 = (Scope) obj;
                ParametersHolder parametersHolder = (ParametersHolder) obj2;
                qz1.b bVar13 = qz1.b.f148630a;
                scope2.getClass();
                parametersHolder.getClass();
                return new uz1.c(new rz1.g(ModuleExtKt.androidContext(scope2), (r53.i) parametersHolder.elementAt(0, s0.f105811a.b(r53.i.class))));
            case 9:
                ParametersHolder parametersHolder2 = (ParametersHolder) obj2;
                qz1.b bVar14 = qz1.b.f148630a;
                ((Scope) obj).getClass();
                parametersHolder2.getClass();
                return new tz1.f((uz1.c) parametersHolder2.elementAt(0, s0.f105811a.b(uz1.c.class)));
            case 10:
                ParametersHolder parametersHolder3 = (ParametersHolder) obj2;
                qz1.b bVar15 = qz1.b.f148630a;
                ((Scope) obj).getClass();
                parametersHolder3.getClass();
                return new uz1.a(new rz1.d((r53.i) parametersHolder3.elementAt(0, s0.f105811a.b(r53.i.class))));
            case 11:
                ParametersHolder parametersHolder4 = (ParametersHolder) obj2;
                qz1.b bVar16 = qz1.b.f148630a;
                ((Scope) obj).getClass();
                parametersHolder4.getClass();
                return new tz1.i((uz1.a) parametersHolder4.elementAt(0, s0.f105811a.b(uz1.a.class)));
            case 12:
                ParametersHolder parametersHolder5 = (ParametersHolder) obj2;
                qz1.b bVar17 = qz1.b.f148630a;
                ((Scope) obj).getClass();
                parametersHolder5.getClass();
                return new uz1.b(new rz1.d((r53.i) parametersHolder5.elementAt(0, s0.f105811a.b(r53.i.class))));
            case 13:
                ParametersHolder parametersHolder6 = (ParametersHolder) obj2;
                qz1.b bVar18 = qz1.b.f148630a;
                ((Scope) obj).getClass();
                parametersHolder6.getClass();
                return new tz1.c((uz1.b) parametersHolder6.elementAt(0, s0.f105811a.b(uz1.b.class)));
            case 14:
                ((Integer) obj2).getClass();
                r20.e.b((p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 15:
                ((Integer) obj2).getClass();
                r20.e.c((p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 16:
                p3.m mVar7 = (p3.m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                r21.b bVar19 = r21.b.f149476a;
                if (mVar7.n(1 & iIntValue7, (iIntValue7 & 3) != 2)) {
                    x1 x1Var7 = p3.n.f135158a;
                    s62.a.f157643a.getClass();
                    i7.b(e1.a(t62.b.f162798a), y.Q(mVar7, R.string.selected), null, fb1.c.g(d92.b.f58623a, mVar7), mVar7, 0, 4);
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 17:
                p3.m mVar8 = (p3.m) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                r21.c cVar = r21.c.f149479a;
                if (mVar8.n(1 & iIntValue8, (iIntValue8 & 3) != 2)) {
                    x1 x1Var8 = p3.n.f135158a;
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 18:
                p3.m mVar9 = (p3.m) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                r21.c cVar2 = r21.c.f149479a;
                if (mVar9.n(1 & iIntValue9, (iIntValue9 & 3) != 2)) {
                    x1 x1Var9 = p3.n.f135158a;
                    i7.a(n5.c.a(R.drawable.close_circle, mVar9, 0), y.Q(mVar9, R.string.lbl_close), x2.d(r.S, 1.0f), com.airbnb.lottie.animation.keyframe.a.a(d92.b.f58623a, mVar9), mVar9, 384, 0);
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 19:
                p3.m mVar10 = (p3.m) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                r21.c cVar3 = r21.c.f149479a;
                if (mVar10.n(1 & iIntValue10, (iIntValue10 & 3) != 2)) {
                    x1 x1Var10 = p3.n.f135158a;
                    s62.a.f157643a.getClass();
                    i7.b(e1.a(t62.b.f162798a), y.Q(mVar10, R.string.selected), null, fb1.c.g(d92.b.f58623a, mVar10), mVar10, 0, 4);
                } else {
                    mVar10.e();
                }
                return Unit.INSTANCE;
            case 20:
                p3.m mVar11 = (p3.m) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                r21.d dVar = r21.d.f149483a;
                if (mVar11.n(1 & iIntValue11, (iIntValue11 & 3) != 2)) {
                    x1 x1Var11 = p3.n.f135158a;
                    r.a aVar22 = r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    c2.l.f(x2.u(aVar22, j92.b.f97899b.f97920e), mVar11);
                } else {
                    mVar11.e();
                }
                return Unit.INSTANCE;
            case 21:
                p3.m mVar12 = (p3.m) obj;
                ((Integer) obj2).getClass();
                mVar12.C(1991923252);
                x1 x1Var12 = p3.n.f135158a;
                int i16 = k3.f22728a;
                c2.g gVarD = q3.d(mVar12);
                p3.f22815b.getClass();
                c2.x1 x1VarD = n3.d(gVarD, p3.f22823j);
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                float f14 = j92.b.f97899b.f97920e;
                c2.a aVar23 = new c2.a(x1VarD, n3.b(0.0f, f14, 0.0f, f14, 5));
                mVar12.f();
                return aVar23;
            case 22:
                p3.m mVar13 = (p3.m) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                w wVar = w.f149908a;
                if (mVar13.n(1 & iIntValue12, (iIntValue12 & 3) != 2)) {
                    x1 x1Var13 = p3.n.f135158a;
                } else {
                    mVar13.e();
                }
                return Unit.INSTANCE;
            case 23:
                p3.m mVar14 = (p3.m) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                r31.a aVar24 = r31.a.f149985a;
                if (mVar14.n(1 & iIntValue13, (iIntValue13 & 3) != 2)) {
                    x1 x1Var14 = p3.n.f135158a;
                    d1 d1Var = d1.f16531a;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.c cVar4 = j92.b.f97901d;
                    float f15 = cVar4.f97906e;
                    s62.a.f157643a.getClass();
                    d1Var.b(f15, a8.a(t62.b.f162798a), cVar4.f97905d, d92.b.a(mVar14).f().f63508c, sn.a.b(mVar14), mVar14, 0);
                } else {
                    mVar14.e();
                }
                return Unit.INSTANCE;
            case 24:
                p3.m mVar15 = (p3.m) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                r31.a aVar25 = r31.a.f149985a;
                if (mVar15.n(1 & iIntValue14, (iIntValue14 & 3) != 2)) {
                    x1 x1Var15 = p3.n.f135158a;
                    s62.a.f157643a.getClass();
                    u4.d dVarA6 = e1.a(t62.b.f162798a);
                    long jA6 = com.airbnb.lottie.animation.keyframe.a.a(d92.b.f58623a, mVar15);
                    r.a aVar26 = r.S;
                    d92.b.f58625c.getClass();
                    i7.b(dVarA6, null, x2.q(aVar26, j92.b.f97901d.f97905d), jA6, mVar15, 48, 0);
                } else {
                    mVar15.e();
                }
                return Unit.INSTANCE;
            case 25:
                p3.m mVar16 = (p3.m) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                r31.a aVar27 = r31.a.f149985a;
                if (mVar16.n(1 & iIntValue15, (iIntValue15 & 3) != 2)) {
                    x1 x1Var16 = p3.n.f135158a;
                    r31.j jVar = new r31.j(12345L, "Forerunner 945", null, i53.a.a(k31.c.B, k31.c.f102626m1), i53.a.a(k31.c.f102616d1, k31.c.f102613a1), i53.a.a(k31.c.V0, k31.c.R0), false, false, 196, null);
                    Object objQ13 = mVar16.q();
                    aVar.getClass();
                    p3.m.a.C2565a c2565a2 = p3.m.a.f135155b;
                    if (objQ13 == c2565a2) {
                        objQ13 = new p(i15);
                        mVar16.K(objQ13);
                    }
                    e23.p pVar = (e23.p) objQ13;
                    Object objQ14 = mVar16.q();
                    if (objQ14 == c2565a2) {
                        objQ14 = new qy0.a(14);
                        mVar16.K(objQ14);
                    }
                    e23.a aVar28 = (e23.a) objQ14;
                    Object objQ15 = mVar16.q();
                    if (objQ15 == c2565a2) {
                        objQ15 = new qy0.a(15);
                        mVar16.K(objQ15);
                    }
                    r31.f.a(false, jVar, pVar, aVar28, (e23.a) objQ15, mVar16, 28038);
                } else {
                    mVar16.e();
                }
                return Unit.INSTANCE;
            case 26:
                r31.a aVar29 = r31.a.f149985a;
                ((k31.c) obj).getClass();
                ((d31.c) obj2).getClass();
                return Unit.INSTANCE;
            case 27:
                p3.m mVar17 = (p3.m) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                r51.a aVar30 = r51.a.f150473a;
                if (mVar17.n(1 & iIntValue16, (iIntValue16 & 3) != 2)) {
                    x1 x1Var17 = p3.n.f135158a;
                    s62.a.f157643a.getClass();
                    t62.b.f162798a.getClass();
                    u4.d dVarA7 = x62.n.a(l2.f175943a);
                    String strQ = y.Q(mVar17, R.string.lbl_send_to_device);
                    d92.b.f58623a.getClass();
                    long jA7 = d92.b.a(mVar17).k().a();
                    r.a aVar31 = r.S;
                    d92.b.f58625c.getClass();
                    i7.b(dVarA7, strQ, x2.q(aVar31, j92.b.f97901d.f97905d), jA7, mVar17, 0, 0);
                } else {
                    mVar17.e();
                }
                return Unit.INSTANCE;
            case 28:
                p3.m mVar18 = (p3.m) obj;
                int iIntValue17 = ((Integer) obj2).intValue();
                r51.a aVar32 = r51.a.f150473a;
                if (mVar18.n(1 & iIntValue17, (iIntValue17 & 3) != 2)) {
                    x1 x1Var18 = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, r51.a.f150474b, mVar18, 196608, 31);
                } else {
                    mVar18.e();
                }
                return Unit.INSTANCE;
            default:
                return Boolean.valueOf(s.g(obj, obj2));
        }
    }

    public /* synthetic */ p(int i14, int i15) {
        this.f148444a = i15;
    }
}
