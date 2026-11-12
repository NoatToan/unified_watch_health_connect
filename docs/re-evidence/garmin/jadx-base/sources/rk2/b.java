package rk2;

import a42.f0;
import android.content.Context;
import android.os.Bundle;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.b0;
import c2.x2;
import c2.z;
import c22.o2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO;
import e23.l;
import e23.p;
import g6.q;
import gl1.y;
import h4.r;
import h5.e0;
import i3.i7;
import java.util.ArrayList;
import java.util.List;
import lc.u0;
import n82.j;
import o4.d0;
import o4.m1;
import o4.q1;
import org.koin.android.ext.koin.ModuleExtKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;
import p13.x;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.p0;
import p3.x1;
import rr0.s;
import rr0.u;
import s5.g0;
import s5.w0;
import tn.k;
import v62.o1;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class b implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f153358a;

    /* JADX WARN: Code duplicated, block: B:102:0x0445  */
    /* JADX WARN: Code duplicated, block: B:104:0x044e  */
    /* JADX WARN: Code duplicated, block: B:105:0x0452  */
    /* JADX WARN: Code duplicated, block: B:110:0x046f  */
    /* JADX WARN: Code duplicated, block: B:114:0x0493  */
    /* JADX WARN: Code duplicated, block: B:116:0x04d2  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        yd1.a aVar;
        h5.g.a.f fVar;
        z zVarA;
        int iHashCode;
        i2 i2VarX;
        r rVarC;
        boolean zB;
        Object objQ;
        int i14 = this.f153358a;
        m.a aVar2 = m.f135153a;
        switch (i14) {
            case 0:
                c.C2901c c2901c = c.f153359i;
                ((rs2.c) obj).getClass();
                ((jy2.a) obj2).getClass();
                return Boolean.TRUE;
            case 1:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                ro0.a aVar3 = ro0.a.f153748a;
                if (mVar.n(1 & iIntValue, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    vy0.i.a(mVar, 0);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 2:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                ro0.b bVar = ro0.b.f153750a;
                if (mVar2.n(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    vy0.i.a(mVar2, 0);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 3:
                m mVar3 = (m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                ro0.b bVar2 = ro0.b.f153750a;
                if (mVar3.n(1 & iIntValue3, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = n.f135158a;
                    vy0.i.a(mVar3, 0);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 4:
                m mVar4 = (m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                rr0.c cVar = rr0.c.f154196a;
                if (mVar4.n(1 & iIntValue4, (iIntValue4 & 3) != 2)) {
                    x1 x1Var4 = n.f135158a;
                    r.a aVar4 = r.S;
                    h4.d.f81522a.getClass();
                    b82.n.c(null, y.Q(mVar4, R.string.intensity_lbl_no_im_data), y.Q(mVar4, R.string.intensity_msg_no_data_description), x2.x(aVar4, h4.d.a.f81533k, 2), null, mVar4, 3072, 17);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 5:
                m mVar5 = (m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                rr0.d dVar = rr0.d.f154198a;
                if (mVar5.n(1 & iIntValue5, (iIntValue5 & 3) != 2)) {
                    x1 x1Var5 = n.f135158a;
                    u.a(null, null, mVar5, 0, 3);
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 6:
                ((Integer) obj2).getClass();
                s.a((m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 7:
                m mVar6 = (m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                rw0.a aVar5 = rw0.a.f154819a;
                if (mVar6.n(1 & iIntValue6, (iIntValue6 & 3) != 2)) {
                    x1 x1Var6 = n.f135158a;
                    r.a aVar6 = r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    i7.a(n5.c.a(R.drawable.layers, mVar6, 0), y.Q(mVar6, R.string.lbl_map_settings), x2.q(aVar6, j92.b.f97901d.f97905d), n5.a.a(mVar6, R.color.gray_70_static), mVar6, 0, 0);
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 8:
                m mVar7 = (m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                rw0.a aVar7 = rw0.a.f154819a;
                if (mVar7.n(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    x1 x1Var7 = n.f135158a;
                    Object objQ2 = mVar7.q();
                    aVar2.getClass();
                    m.a.C2565a c2565a = m.a.f135155b;
                    if (objQ2 == c2565a) {
                        objQ2 = new rk0.n(29);
                        mVar7.K(objQ2);
                    }
                    l lVar = (l) objQ2;
                    Object objQ3 = mVar7.q();
                    if (objQ3 == c2565a) {
                        objQ3 = new ro0.h(6);
                        mVar7.K(objQ3);
                    }
                    rw0.i.a(true, true, lVar, (e23.a) objQ3, null, 0.0f, null, mVar7, 3510, 112);
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 9:
                m mVar8 = (m) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                rx0.a aVar8 = rx0.a.f154943a;
                if (mVar8.n(1 & iIntValue8, (iIntValue8 & 3) != 2)) {
                    x1 x1Var8 = n.f135158a;
                    Context context = (Context) mVar8.A(AndroidCompositionLocals_androidKt.f6042b);
                    Object objQ4 = mVar8.q();
                    aVar2.getClass();
                    Object obj3 = m.a.f135155b;
                    if (objQ4 == obj3) {
                        Object aVar9 = new n82.f.a(null, null, null, 7, null);
                        mVar8.K(aVar9);
                        objQ4 = aVar9;
                    }
                    n82.f fVarA = j.a((n82.f.a) objQ4, null, mVar8, 2);
                    Object objQ5 = mVar8.q();
                    if (objQ5 == obj3) {
                        objQ5 = i53.a.a(o82.g.f130850c, o82.g.f130851d, o82.g.f130853f, o82.g.f130854g);
                        mVar8.K(objQ5);
                    }
                    i53.f fVar2 = (i53.f) objQ5;
                    Object objQ6 = mVar8.q();
                    if (objQ6 == obj3) {
                        objQ6 = new yd1.a(context);
                        mVar8.K(objQ6);
                    }
                    yd1.a aVar10 = (yd1.a) objQ6;
                    r.a aVar11 = r.S;
                    r rVarD = x2.d(aVar11, 1.0f);
                    long jA = k.a(d92.b.f58623a, mVar8);
                    m1.a aVar12 = m1.f128891a;
                    r rVarE = u1.n.e(rVarD, jA, aVar12);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    h4.g.a aVar13 = h4.d.a.f81536n;
                    z zVarA2 = c2.y.a(kVar, aVar13, mVar8, 0);
                    int iHashCode2 = Long.hashCode(mVar8.getU());
                    i2 i2VarX2 = mVar8.x();
                    r rVarC2 = h4.k.c(rVarE, mVar8);
                    h5.g.V.getClass();
                    e0.a aVar14 = h5.g.a.f81805b;
                    if (mVar8.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar8.z();
                    if (mVar8.getT()) {
                        mVar8.M(aVar14);
                    } else {
                        mVar8.c();
                    }
                    h5.g.a.e eVar = h5.g.a.f81810g;
                    b4.c(eVar, zVarA2, mVar8);
                    h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                    b4.c(c1623g, i2VarX2, mVar8);
                    h5.g.a.b bVar3 = h5.g.a.f81813j;
                    if (mVar8.getT()) {
                        aVar = aVar10;
                    } else {
                        aVar = aVar10;
                        if (!p005kotlin.jvm.internal.s.g(mVar8.q(), Integer.valueOf(iHashCode2))) {
                        }
                        fVar = h5.g.a.f81807d;
                        b4.c(fVar, rVarC2, mVar8);
                        b0 b0Var = b0.f22601a;
                        r rVarE2 = u1.n.e(aVar11, d92.b.a(mVar8).c().c(), aVar12);
                        d92.b.f58625c.getClass();
                        r rVarC3 = c2.l.C(rVarE2, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13);
                        zVarA = c2.y.a(kVar, aVar13, mVar8, 0);
                        iHashCode = Long.hashCode(mVar8.getU());
                        i2VarX = mVar8.x();
                        rVarC = h4.k.c(rVarC3, mVar8);
                        if (mVar8.F() != null) {
                            p0.l();
                            throw null;
                        }
                        mVar8.z();
                        if (mVar8.getT()) {
                            mVar8.M(aVar14);
                        } else {
                            mVar8.c();
                        }
                        b4.c(eVar, zVarA, mVar8);
                        b4.c(c1623g, i2VarX, mVar8);
                        if (mVar8.getT() || !p005kotlin.jvm.internal.s.g(mVar8.q(), Integer.valueOf(iHashCode))) {
                            v.h.z(iHashCode, mVar8, iHashCode, bVar3);
                        }
                        b4.c(fVar, rVarC, mVar8);
                        i53.c cVarE = i53.a.e(o2.b(fVar2, mVar8));
                        int iIndexOf = fVar2.indexOf(fVarA.f124961b.a());
                        zB = mVar8.B(fVarA);
                        objQ = mVar8.q();
                        if (zB || objQ == obj3) {
                            objQ = new f0(fVarA, fVar2, 14);
                            mVar8.K(objQ);
                        }
                        t82.c.a(cVarE, null, iIndexOf, 0.0f, (l) objQ, mVar8, 0, 26);
                        q82.a.a(x2.f(aVar11, 1.0f), new n82.n(fVarA, aVar), null, mVar8, 6, 4);
                        mVar8.y();
                        n82.c.a(null, fVarA, 3, false, rx0.a.f154944b, mVar8, 24960, 9);
                        mVar8.y();
                    }
                    v.h.z(iHashCode2, mVar8, iHashCode2, bVar3);
                    fVar = h5.g.a.f81807d;
                    b4.c(fVar, rVarC2, mVar8);
                    b0 b0Var2 = b0.f22601a;
                    r rVarE3 = u1.n.e(aVar11, d92.b.a(mVar8).c().c(), aVar12);
                    d92.b.f58625c.getClass();
                    r rVarC4 = c2.l.C(rVarE3, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13);
                    zVarA = c2.y.a(kVar, aVar13, mVar8, 0);
                    iHashCode = Long.hashCode(mVar8.getU());
                    i2VarX = mVar8.x();
                    rVarC = h4.k.c(rVarC4, mVar8);
                    if (mVar8.F() != null) {
                        p0.l();
                        throw null;
                    }
                    mVar8.z();
                    if (mVar8.getT()) {
                        mVar8.M(aVar14);
                    } else {
                        mVar8.c();
                    }
                    b4.c(eVar, zVarA, mVar8);
                    b4.c(c1623g, i2VarX, mVar8);
                    if (mVar8.getT()) {
                        v.h.z(iHashCode, mVar8, iHashCode, bVar3);
                    } else {
                        v.h.z(iHashCode, mVar8, iHashCode, bVar3);
                    }
                    b4.c(fVar, rVarC, mVar8);
                    i53.c cVarE2 = i53.a.e(o2.b(fVar2, mVar8));
                    int iIndexOf2 = fVar2.indexOf(fVarA.f124961b.a());
                    zB = mVar8.B(fVarA);
                    objQ = mVar8.q();
                    if (zB) {
                        objQ = new f0(fVarA, fVar2, 14);
                        mVar8.K(objQ);
                    } else {
                        objQ = new f0(fVarA, fVar2, 14);
                        mVar8.K(objQ);
                    }
                    t82.c.a(cVarE2, null, iIndexOf2, 0.0f, (l) objQ, mVar8, 0, 26);
                    q82.a.a(x2.f(aVar11, 1.0f), new n82.n(fVarA, aVar), null, mVar8, 6, 4);
                    mVar8.y();
                    n82.c.a(null, fVarA, 3, false, rx0.a.f154944b, mVar8, 24960, 9);
                    mVar8.y();
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 10:
                m mVar9 = (m) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                rx1.c cVar2 = rx1.c.f154948a;
                if (mVar9.n(1 & iIntValue9, (iIntValue9 & 3) != 2)) {
                    x1 x1Var9 = n.f135158a;
                    r.a aVar15 = r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    r rVarQ = x2.q(aVar15, j92.b.f97901d.f97905d);
                    s62.a.f157643a.getClass();
                    i7.b(o1.a(t62.b.f162798a), y.Q(mVar9, R.string.lbl_close), rVarQ, u0.f(mVar9), mVar9, 0, 0);
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 11:
                m mVar10 = (m) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                rx1.d dVar2 = rx1.d.f154950a;
                if (mVar10.n(1 & iIntValue10, (iIntValue10 & 3) != 2)) {
                    x1 x1Var10 = n.f135158a;
                    i7.a(n5.c.a(R.drawable.close_circle, mVar10, 0), y.Q(mVar10, R.string.lbl_clear), null, 0L, mVar10, 0, 12);
                } else {
                    mVar10.e();
                }
                return Unit.INSTANCE;
            case 12:
                ((Integer) obj).intValue();
                dy1.u uVar = (dy1.u) obj2;
                uVar.getClass();
                return uVar.a();
            case 13:
                GeoPointDTO geoPointDTO = (GeoPointDTO) obj2;
                int i15 = s20.m.f156023b;
                Double d14 = ((GeoPointDTO) obj).distance;
                double dDoubleValue = d14 != null ? d14.doubleValue() : 0.0d;
                Double d15 = geoPointDTO.distance;
                return Integer.valueOf(dDoubleValue >= (d15 != null ? d15.doubleValue() : 0.0d) ? 0 : 1);
            case 14:
                s41.b bVar4 = s41.b.f157060a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                r41.a.f150289c.getClass();
                return r41.a.C2825a.a();
            case 15:
                s41.b bVar5 = s41.b.f157060a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return u0.g(d60.b.f57806c);
            case 16:
                Scope scope = (Scope) obj;
                s41.b bVar6 = s41.b.f157060a;
                scope.getClass();
                ((ParametersHolder) obj2).getClass();
                Context contextAndroidContext = ModuleExtKt.androidContext(scope);
                t0 t0Var = s0.f105811a;
                return new p51.c(contextAndroidContext, (r41.a) scope.get((k23.d<?>) t0Var.b(r41.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (s41.a) scope.get((k23.d<?>) t0Var.b(s41.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 17:
                ParametersHolder parametersHolder = (ParametersHolder) obj2;
                s41.b bVar7 = s41.b.f157060a;
                ((Scope) obj).getClass();
                parametersHolder.getClass();
                return new p51.e((Bundle) parametersHolder.elementAt(0, s0.f105811a.b(Bundle.class)));
            case 18:
                Scope scope2 = (Scope) obj;
                ParametersHolder parametersHolder2 = (ParametersHolder) obj2;
                s41.b bVar8 = s41.b.f157060a;
                scope2.getClass();
                parametersHolder2.getClass();
                t0 t0Var2 = s0.f105811a;
                return new p51.b(ModuleExtKt.androidContext(scope2), (u41.a) parametersHolder2.elementAt(0, t0Var2.b(u41.a.class)), (r41.a) scope2.get((k23.d<?>) t0Var2.b(r41.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (d60.b) scope2.get((k23.d<?>) t0Var2.b(d60.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (s41.a) scope2.get((k23.d<?>) t0Var2.b(s41.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (f12.l) scope2.get((k23.d<?>) t0Var2.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (f12.b) scope2.get((k23.d<?>) t0Var2.b(f12.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (qw0.s) scope2.get((k23.d<?>) t0Var2.b(qw0.s.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 19:
                s5.c cVar3 = (s5.c) obj2;
                return x.d(cVar3.f157138b, s5.f0.a(cVar3.f157137a, s5.f0.f157160b, (d4.n) obj));
            case 20:
                return Integer.valueOf(((d6.i) obj2).f57764a);
            case 21:
                d6.m mVar11 = (d6.m) obj2;
                return x.d(Float.valueOf(mVar11.f57777a), Float.valueOf(mVar11.f57778b));
            case 22:
                d4.n nVar = (d4.n) obj;
                d6.n nVar2 = (d6.n) obj2;
                q qVarA = q.a(nVar2.f57781a);
                g0 g0Var = s5.f0.f157182x;
                return x.d(s5.f0.a(qVarA, g0Var, nVar), s5.f0.a(q.a(nVar2.f57782b), g0Var, nVar));
            case 23:
                return Integer.valueOf(((w5.f0) obj2).f182107a);
            case 24:
                s5.m.b bVar9 = (s5.m.b) obj2;
                return x.d(bVar9.f157242a, s5.f0.a(bVar9.f157243b, s5.f0.f157168j, (d4.n) obj));
            case 25:
                return Float.valueOf(((d6.a) obj2).f57704a);
            case 26:
                d4.n nVar3 = (d4.n) obj;
                List list = (List) obj2;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i16 = 0; i16 < size; i16++) {
                    arrayList.add(s5.f0.a((s5.c.d) list.get(i16), s5.f0.f157161c, nVar3));
                }
                return arrayList;
            case 27:
                w0 w0Var = (w0) obj2;
                return x.d(Integer.valueOf((int) (w0Var.f157317a >> 32)), Integer.valueOf((int) (w0Var.f157317a & 4294967295L)));
            case 28:
                d4.n nVar4 = (d4.n) obj;
                q1 q1Var = (q1) obj2;
                return x.d(s5.f0.a(d0.a(q1Var.f128958a), s5.f0.f157176r, nVar4), s5.f0.a(n4.c.a(q1Var.f128959b), s5.f0.f157184z, nVar4), Float.valueOf(q1Var.f128960c));
            default:
                return Integer.valueOf(((d6.h) obj2).f57759a);
        }
    }

    public /* synthetic */ b(byte b14, int i14) {
        this.f153358a = i14;
    }
}
