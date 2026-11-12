package aa2;

import a42.d0;
import am.h1;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import b21.d7;
import b21.j0;
import c2.q2;
import c2.s2;
import c2.t;
import c2.u2;
import c2.x2;
import c22.p3;
import c42.i0;
import ca0.a1;
import ca0.b1;
import ca0.e4;
import ca0.f4;
import ca0.m2;
import ca0.n1;
import ca0.o0;
import ca0.s1;
import ca0.t1;
import ca0.t2;
import ca0.u0;
import com.garmin.android.apps.connectmobile.R;
import d81.z;
import e23.p;
import et1.a2;
import et1.v0;
import et1.w0;
import f21.g0;
import f5.z0;
import gw0.h0;
import h2.c0;
import h5.e0;
import i3.mh;
import java.util.Iterator;
import java.util.List;
import l72.f0;
import lc.m0;
import o4.m1;
import org.joda.time.LocalDate;
import org.koin.bundle.CreationExtrasExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.compose.KoinApplicationKt;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;
import p005kotlin.math.MathKt;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.n;
import p3.p0;
import p3.p1;
import p3.x1;
import p3.y3;
import p3.z1;
import r1.n2;
import r53.b2;
import r53.k2;
import r53.l1;
import r53.o2;
import s1.y;
import s5.x0;
import ta0.a0;
import u1.y0;
import w02.b0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class r implements e23.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2372c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f2373d;

    public /* synthetic */ r(int i14, e23.l lVar, Object obj, Object obj2) {
        this.f2370a = i14;
        this.f2371b = obj;
        this.f2373d = lVar;
        this.f2372c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x005e  */
    /* JADX WARN: Code duplicated, block: B:54:0x0239  */
    private final Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        jf.d dVar;
        p3.m mVar;
        zc.d dVar2 = (zc.d) this.f2371b;
        e23.l lVar = (e23.l) this.f2373d;
        c2.w wVar = (c2.w) this.f2372c;
        int iIntValue = ((Integer) obj2).intValue();
        p3.m mVar2 = (p3.m) obj3;
        int iIntValue2 = ((Integer) obj4).intValue();
        ((c0) obj).getClass();
        x1 x1Var = p3.n.f135158a;
        Unit unit = Unit.INSTANCE;
        boolean zR = ((((iIntValue2 & 112) ^ 48) > 32 && mVar2.k(iIntValue)) || (iIntValue2 & 48) == 32) | mVar2.r(dVar2) | mVar2.B(lVar);
        Object objQ = mVar2.q();
        p3.m.a aVar = p3.m.f135153a;
        if (zR) {
            objQ = new v0(dVar2, iIntValue, lVar, null);
            mVar2.K(objQ);
        } else {
            aVar.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new v0(dVar2, iIntValue, lVar, null);
                mVar2.K(objQ);
            }
        }
        l0.e((e23.p) objQ, unit, mVar2);
        y3 y3Var = AndroidCompositionLocals_androidKt.f6042b;
        wf.f.a aVar2 = new wf.f.a((Context) mVar2.A(y3Var));
        kt1.b bVar = (kt1.b) dVar2.a(iIntValue);
        aVar2.f184930c = bVar != null ? bVar.f106448b : null;
        int iC = MathKt.c(b0.g(wVar.j(), mVar2));
        int iC2 = MathKt.c(b0.g(wVar.g(), mVar2));
        xf.b.a(iC);
        xf.a.C3547a c3547aA = xf.a.C3547a.a(iC);
        xf.b.a(iC2);
        aVar2.c(new xf.g(c3547aA, xf.a.C3547a.a(iC2)));
        jf.d dVarA = jf.s.a(aVar2.a(), null, mVar2, 0, 30);
        p1 p1VarC = p0.c(dVarA.f98632q, mVar2, 0);
        wf.f.a aVar3 = new wf.f.a((Context) mVar2.A(y3Var));
        kt1.b bVar2 = (kt1.b) dVar2.a(iIntValue);
        aVar3.f184930c = bVar2 != null ? bVar2.f106449c : null;
        int iC3 = MathKt.c(b0.g(wVar.j(), mVar2));
        int iC4 = MathKt.c(b0.g(wVar.g(), mVar2));
        xf.b.a(iC3);
        xf.a.C3547a c3547aA2 = xf.a.C3547a.a(iC3);
        xf.b.a(iC4);
        aVar3.c(new xf.g(c3547aA2, xf.a.C3547a.a(iC4)));
        jf.d dVarA2 = jf.s.a(aVar3.a(), null, mVar2, 0, 30);
        p1 p1VarC2 = p0.c(dVarA2.f98632q, mVar2, 0);
        if (((jf.d.c) p1VarC.getF182175a()) instanceof jf.d.c.C1894d) {
            dVar = dVarA;
        } else {
            dVar = ((jf.d.c) p1VarC2.getF182175a()) instanceof jf.d.c.C1894d ? dVarA2 : null;
        }
        if (dVar == null) {
            mVar2.C(2144095762);
            t4.c cVar = new t4.c(com.airbnb.lottie.animation.keyframe.a.a(d92.b.f58623a, mVar2), null);
            f5.k.f68985a.getClass();
            y0.a(cVar, null, x2.h(x2.f(h4.r.S, 1.0f), gl.b.q(mVar2, R.dimen.trail_full_screen_image_height)), null, f5.k.a.f68988c, 0.0f, null, mVar2, 24624, 104);
            mVar2.f();
            return unit;
        }
        mVar2.C(2142594990);
        long f162260d = dVar.getF162260d();
        kt1.b bVar3 = (kt1.b) dVar2.a(iIntValue);
        if (bVar3 == null || !bVar3.f106454h) {
            mVar2.C(2143610922);
            y yVarA = n2.a(mVar2);
            boolean zB = mVar2.B(yVarA);
            Object objQ2 = mVar2.q();
            if (zB) {
                objQ2 = new r02.m(yVarA, 1.0f, 0.0f, 0.0f);
                mVar2.K(objQ2);
            } else {
                aVar.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new r02.m(yVarA, 1.0f, 0.0f, 0.0f);
                    mVar2.K(objQ2);
                }
            }
            r02.m mVar3 = (r02.m) objQ2;
            float f14 = mVar3.f148905m;
            z1 z1Var = mVar3.f148895c;
            if (f14 != 1.0f) {
                mVar3.f148905m = 1.0f;
                mVar3.l(z1Var.getFloatValue());
            }
            if (mVar3.f148906n != 4.0f) {
                mVar3.f148906n = 4.0f;
                mVar3.l(z1Var.getFloatValue());
            }
            mVar3.f148908p = 2.0f;
            mVar3.f148907o.setValue(null);
            r02.l.a(null, mVar3, false, z3.f.c(117456258, new z(dVar, f162260d, 2), mVar2), mVar2, 3072);
            mVar = mVar2;
            mVar.f();
        } else {
            mVar2.C(2142722524);
            h4.r.a aVar4 = h4.r.S;
            h4.r rVarD = x2.d(aVar4, 1.0f);
            h4.d.f81522a.getClass();
            z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
            int iHashCode = Long.hashCode(mVar2.getU());
            i2 i2VarX = mVar2.x();
            h4.r rVarC = h4.k.c(rVarD, mVar2);
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
            b4.c(h5.g.a.f81810g, z0VarD, mVar2);
            b4.c(h5.g.a.f81809f, i2VarX, mVar2);
            h5.g.a.b bVar4 = h5.g.a.f81813j;
            if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                v.h.z(iHashCode, mVar2, iHashCode, bVar4);
            }
            b4.c(h5.g.a.f81807d, rVarC, mVar2);
            c2.u uVar = c2.u.f22885a;
            h4.g gVar = h4.d.a.f81528f;
            w0.a(uVar.c(aVar4, gVar), dVar, f162260d, true, mVar2, 3072, 0);
            h4.r rVarC2 = uVar.c(aVar4, gVar);
            String strQ = gl1.y.Q(mVar2, R.string.review_photo_hidden_message);
            d6.h.f57752b.getClass();
            int i14 = d6.h.f57755e;
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            mh.c(strQ, rVarC2, 0L, null, 0L, null, 0L, d6.h.a(i14), 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, mVar2), mVar2, 0, 0, 130044);
            mVar = mVar2;
            mVar.y();
            mVar.f();
        }
        mVar.f();
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object b(Object obj, Object obj2, Object obj3, Object obj4) {
        g21.g gVar = (g21.g) this.f2371b;
        x01.e eVar = (x01.e) this.f2372c;
        h21.w wVar = (h21.w) this.f2373d;
        ((Integer) obj2).getClass();
        p3.m mVar = (p3.m) obj3;
        int iIntValue = ((Integer) obj4).intValue();
        ((e2.d) obj).getClass();
        if (mVar.n(iIntValue & 1, (iIntValue & 129) != 128)) {
            x1 x1Var = p3.n.f135158a;
            Object objQ = mVar.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(Boolean.FALSE);
                mVar.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            h4.d.f81522a.getClass();
            h4.g gVar2 = h4.d.a.f81532j;
            h4.r.a aVar = h4.r.S;
            z0 z0VarD = c2.q.d(gVar2, false);
            int iHashCode = Long.hashCode(mVar.getU());
            i2 i2VarX = mVar.x();
            h4.r rVarC = h4.k.c(aVar, mVar);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
            if (mVar.F() == null) {
                p0.l();
                throw null;
            }
            mVar.z();
            if (mVar.getT()) {
                mVar.M(aVar2);
            } else {
                mVar.c();
            }
            h5.g.a.e eVar2 = h5.g.a.f81810g;
            b4.c(eVar2, z0VarD, mVar);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarX, mVar);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                v.h.z(iHashCode, mVar, iHashCode, bVar);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, mVar);
            c2.u uVar = c2.u.f22885a;
            h4.r rVarE = u1.n.e(x2.f(aVar, 1.0f), tn.k.a(d92.b.f58623a, mVar), m1.f128891a);
            d92.b.f58625c.getClass();
            j92.e eVar3 = j92.b.f97899b;
            h4.r rVarY = c2.l.y(rVarE, eVar3.f97920e);
            c2.j.f22691a.getClass();
            s2 s2VarA = q2.a(c2.j.f22698h, h4.d.a.f81534l, mVar, 54);
            int iHashCode2 = Long.hashCode(mVar.getU());
            i2 i2VarX2 = mVar.x();
            h4.r rVarC2 = h4.k.c(rVarY, mVar);
            if (mVar.F() == null) {
                p0.l();
                throw null;
            }
            mVar.z();
            if (mVar.getT()) {
                mVar.M(aVar2);
            } else {
                mVar.c();
            }
            b4.c(eVar2, s2VarA, mVar);
            b4.c(c1623g, i2VarX2, mVar);
            if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode2))) {
                v.h.z(iHashCode2, mVar, iHashCode2, bVar);
            }
            b4.c(fVar, rVarC2, mVar);
            u2 u2Var = u2.f22900a;
            String strT = gl1.d.T(gVar.f75422b, mVar, 0);
            d92.b.f58624b.getClass();
            x0 x0VarB = d92.c.b(d92.c.e(j92.f.f97931h), mVar);
            Object objQ2 = mVar.q();
            if (objQ2 == c2565a) {
                objQ2 = new g0(0);
                mVar.K(objQ2);
            }
            mh.c(strT, p5.v.c((e23.l) objQ2, aVar, false), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, mVar, 0, 0, 131068);
            f0.a aVar3 = f0.a.f111000a;
            f21.d.f68493a.getClass();
            z3.e eVar4 = f21.d.f68494b;
            Object objQ3 = mVar.q();
            if (objQ3 == c2565a) {
                objQ3 = new a2(p1Var, 5);
                mVar.K(objQ3);
            }
            aVar3.g(3078, 6, (e23.a) objQ3, eVar4, null, mVar, false);
            mVar.y();
            s2 s2VarA2 = q2.a(c2.j.f22692b, h4.d.a.f81533k, mVar, 0);
            int iHashCode3 = Long.hashCode(mVar.getU());
            i2 i2VarX3 = mVar.x();
            h4.r rVarC3 = h4.k.c(aVar, mVar);
            if (mVar.F() == null) {
                p0.l();
                throw null;
            }
            mVar.z();
            if (mVar.getT()) {
                mVar.M(aVar2);
            } else {
                mVar.c();
            }
            b4.c(eVar2, s2VarA2, mVar);
            b4.c(c1623g, i2VarX3, mVar);
            if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode3))) {
                v.h.z(iHashCode3, mVar, iHashCode3, bVar);
            }
            b4.c(fVar, rVarC3, mVar);
            boolean zBooleanValue = ((Boolean) p1Var.getF182175a()).booleanValue();
            Object objQ4 = mVar.q();
            if (objQ4 == c2565a) {
                objQ4 = new a2(p1Var, 6);
                mVar.K(objQ4);
            }
            e23.a aVar4 = (e23.a) objQ4;
            h4.r rVarU = x2.u(aVar, v21.d.f175305i);
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(eVar3.f97920e)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(eVar3.f97918c)));
            int i14 = g6.g.f75998b;
            i3.u.a(zBooleanValue, aVar4, rVarU, jFloatToRawIntBits, null, null, k2.i.a(j92.b.f97900c.f97910b), com.nimbusds.jose.shaded.gson.internal.a.c(mVar), 0.0f, 0.0f, z3.f.c(658348057, new a42.a(eVar, 24, wVar, p1Var), mVar), mVar, 432, 48, 1840);
            mVar.y();
            mVar.y();
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object c(Object obj, Object obj2, Object obj3, Object obj4) {
        e23.a aVar = (e23.a) this.f2371b;
        gl1.a aVar2 = (gl1.a) this.f2372c;
        j0 j0Var = (j0) this.f2373d;
        p3.m mVar = (p3.m) obj3;
        r1.q2.t((Integer) obj4, (r1.l) obj, (lc.v) obj2);
        x1 x1Var = p3.n.f135158a;
        mVar.L(-1614864554);
        v9.a.f176280a.getClass();
        ViewModelStoreOwner viewModelStoreOwnerA = v9.a.a(mVar);
        if (viewModelStoreOwnerA == null) {
            vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            return null;
        }
        u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(s0.f105811a.b(ll1.m.class), viewModelStoreOwnerA.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA), null, KoinApplicationKt.currentKoinScope(mVar, 0), null);
        mVar.R();
        ll1.i.c((ll1.m) u1VarResolveViewModel, aVar, aVar2, j0Var, mVar, 0);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0080  */
    /* JADX WARN: Code duplicated, block: B:20:0x00d5  */
    private final Object d(Object obj, Object obj2, Object obj3, Object obj4) {
        Object next;
        kl1.a aVar = (kl1.a) this.f2371b;
        gl1.c cVar = (gl1.c) this.f2372c;
        e23.a aVar2 = (e23.a) this.f2373d;
        lc.v vVar = (lc.v) obj2;
        p3.m mVar = (p3.m) obj3;
        ((Integer) obj4).getClass();
        ((r1.l) obj).getClass();
        vVar.getClass();
        x1 x1Var = p3.n.f135158a;
        t0 t0Var = s0.f105811a;
        long j8 = ((gl1.e) lc.w.a(vVar, t0Var.b(gl1.e.class))).f77834a;
        String str = ((gl1.e) lc.w.a(vVar, t0Var.b(gl1.e.class))).f77835b;
        kl1.c.f105264a.getClass();
        Iterator<T> it = il1.a.f93986m.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!p005kotlin.jvm.internal.s.g(((il1.a) next).f93987a, str));
        il1.a aVar3 = (il1.a) next;
        boolean zL = mVar.l(j8);
        Object objQ = mVar.q();
        p3.m.a aVar4 = p3.m.f135153a;
        if (zL) {
            objQ = new a90.b(j8, 6);
            mVar.K(objQ);
        } else {
            aVar4.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new a90.b(j8, 6);
                mVar.K(objQ);
            }
        }
        e23.a aVar5 = (e23.a) objQ;
        mVar.L(-1614864554);
        v9.a.f176280a.getClass();
        ViewModelStoreOwner viewModelStoreOwnerA = v9.a.a(mVar);
        if (viewModelStoreOwnerA == null) {
            vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            return null;
        }
        u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(s0.f105811a.b(hl1.c.class), viewModelStoreOwnerA.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA), null, KoinApplicationKt.currentKoinScope(mVar, 0), aVar5);
        mVar.R();
        hl1.c cVar2 = (hl1.c) u1VarResolveViewModel;
        boolean zB = mVar.B(cVar) | mVar.l(j8);
        Object objQ2 = mVar.q();
        if (zB) {
            objQ2 = new gl1.l(cVar, j8, 1);
            mVar.K(objQ2);
        } else {
            aVar4.getClass();
            if (objQ2 == p3.m.a.f135155b) {
                objQ2 = new gl1.l(cVar, j8, 1);
                mVar.K(objQ2);
            }
        }
        hl1.a.a(cVar2, aVar3, aVar, (e23.s) objQ2, aVar2, mVar, 0);
        x1 x1Var2 = p3.n.f135158a;
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:6:0x004e  */
    private final Object e(Object obj, Object obj2, Object obj3, Object obj4) {
        kl1.a aVar = (kl1.a) this.f2371b;
        lc.y yVar = (lc.y) this.f2372c;
        e23.a aVar2 = (e23.a) this.f2373d;
        lc.v vVar = (lc.v) obj2;
        p3.m mVar = (p3.m) obj3;
        ((Integer) obj4).getClass();
        ((r1.l) obj).getClass();
        vVar.getClass();
        x1 x1Var = p3.n.f135158a;
        t0 t0Var = s0.f105811a;
        long j8 = ((gl1.g) lc.w.a(vVar, t0Var.b(gl1.g.class))).f77839a;
        boolean zL = mVar.l(j8);
        Object objQ = mVar.q();
        p3.m.a aVar3 = p3.m.f135153a;
        if (zL) {
            objQ = new a90.b(j8, 7);
            mVar.K(objQ);
        } else {
            aVar3.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new a90.b(j8, 7);
                mVar.K(objQ);
            }
        }
        e23.a aVar4 = (e23.a) objQ;
        mVar.L(-1614864554);
        v9.a.f176280a.getClass();
        ViewModelStoreOwner viewModelStoreOwnerA = v9.a.a(mVar);
        if (viewModelStoreOwnerA == null) {
            vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            return null;
        }
        int i14 = 0;
        u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(t0Var.b(jl1.g.class), viewModelStoreOwnerA.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA), null, KoinApplicationKt.currentKoinScope(mVar, 0), aVar4);
        mVar.R();
        jl1.g gVar = (jl1.g) u1VarResolveViewModel;
        boolean zR = mVar.r(yVar) | mVar.B(aVar2);
        Object objQ2 = mVar.q();
        if (zR) {
            objQ2 = new gl1.n(i14, aVar2, yVar);
            mVar.K(objQ2);
        } else {
            aVar3.getClass();
            if (objQ2 == p3.m.a.f135155b) {
                objQ2 = new gl1.n(i14, aVar2, yVar);
                mVar.K(objQ2);
            }
        }
        jl1.f.d(gVar, aVar, false, (e23.l) objQ2, aVar2, mVar, 0, 4);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x002e  */
    private final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        gk1.b bVar = (gk1.b) this.f2371b;
        ak0.i iVar = (ak0.i) this.f2372c;
        lc.y yVar = (lc.y) this.f2373d;
        lc.v vVar = (lc.v) obj2;
        p3.m mVar = (p3.m) obj3;
        r1.q2.t((Integer) obj4, (r1.l) obj, vVar);
        x1 x1Var = p3.n.f135158a;
        boolean zB = mVar.B(vVar);
        Object objQ = mVar.q();
        if (zB) {
            objQ = yVar.c(s0.f105811a.b(gl1.s.class));
            mVar.K(objQ);
        } else {
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = yVar.c(s0.f105811a.b(gl1.s.class));
                mVar.K(objQ);
            }
        }
        ml1.b.d(((gl1.s) lc.w.a((lc.v) objQ, s0.f105811a.b(gl1.s.class))).f77864b, bVar, iVar, mVar, 0);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        int i14;
        final gw0.u uVar = (gw0.u) this.f2371b;
        final p1 p1Var = (p1) this.f2372c;
        final ug2.x xVar = (ug2.x) this.f2373d;
        final o82.g gVar = (o82.g) obj;
        final o82.a aVar = (o82.a) obj2;
        p3.m mVar = (p3.m) obj3;
        int iD = vb.h.d((Integer) obj4, gVar, aVar);
        if ((iD & 6) == 0) {
            i14 = (mVar.k(gVar.ordinal()) ? 4 : 2) | iD;
        } else {
            i14 = iD;
        }
        if ((iD & 48) == 0) {
            i14 |= mVar.B(aVar) ? 32 : 16;
        }
        if (mVar.n(i14 & 1, (i14 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            int i15 = gw0.t.a.f79757a[gVar.ordinal()];
            if (i15 == 1) {
                mVar.C(-1929913773);
                u82.e.b(aVar, uVar.f79776q, null, false, z3.f.c(-1475122308, new ao1.f(12, aVar, uVar), mVar), mVar, ((i14 >> 3) & 14) | 27648, 4);
                mVar.f();
            } else if (i15 == 2 || i15 == 3) {
                mVar.C(-1929887762);
                final int i16 = 0;
                u82.e.b(new gw0.e(((h0) p1Var.getF182175a()).f79609a.f141413a, 0L, aVar.f130843a, aVar.f130844b, 2, null), uVar.f79777r, null, false, z3.f.c(1348026419, new e23.r() { // from class: gw0.r
                    /* JADX WARN: Code duplicated, block: B:22:0x0067  */
                    /* JADX WARN: Code duplicated, block: B:46:0x00e6  */
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // e23.r
                    public final Object invoke(Object obj5, Object obj6, Object obj7, Object obj8) {
                        int i17 = i16;
                        p3.m.a aVar2 = p3.m.f135153a;
                        p1 p1Var2 = p1Var;
                        switch (i17) {
                            case 0:
                                final u82.f fVar = (u82.f) obj6;
                                p3.m mVar2 = (p3.m) obj7;
                                int iC = vb.h.c((Integer) obj8, (c2.t) obj5, fVar);
                                if ((iC & 48) == 0) {
                                    iC |= (iC & 64) == 0 ? mVar2.B(fVar) : mVar2.r(fVar) ? 32 : 16;
                                }
                                if (mVar2.n(iC & 1, (iC & 145) != 144)) {
                                    x1 x1Var2 = p3.n.f135158a;
                                    pv0.r rVar = ((h0) p1Var2.getF182175a()).f79609a;
                                    final u uVar2 = uVar;
                                    boolean zR = mVar2.r(uVar2);
                                    Object objQ = mVar2.q();
                                    if (zR) {
                                        objQ = new p(uVar2, 0);
                                        mVar2.K(objQ);
                                    } else {
                                        aVar2.getClass();
                                        if (objQ == p3.m.a.f135155b) {
                                            objQ = new p(uVar2, 0);
                                            mVar2.K(objQ);
                                        }
                                    }
                                    final int i18 = 0;
                                    final o82.a aVar3 = aVar;
                                    final o82.g gVar2 = gVar;
                                    final ug2.x xVar2 = xVar;
                                    t.d(rVar, (e23.l) objQ, z3.f.c(572186743, new e23.p() { // from class: gw0.q
                                        /* JADX WARN: Code duplicated, block: B:22:0x008a  */
                                        @Override // e23.p
                                        public final Object invoke(Object obj9, Object obj10) {
                                            int i19 = i18;
                                            o82.a aVar4 = aVar3;
                                            u82.f fVar2 = fVar;
                                            switch (i19) {
                                                case 0:
                                                    p3.m mVar3 = (p3.m) obj9;
                                                    int iIntValue = ((Integer) obj10).intValue();
                                                    if (mVar3.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                                                        x1 x1Var3 = p3.n.f135158a;
                                                        pv0.v vVar = (pv0.v) fVar2.a();
                                                        b63.t tVarD = aVar4.f130843a.d(aVar4.f130844b);
                                                        u uVar3 = uVar2;
                                                        boolean zR2 = mVar3.r(uVar3);
                                                        Object objQ2 = mVar3.q();
                                                        if (zR2) {
                                                            objQ2 = new p(uVar3, 2);
                                                            mVar3.K(objQ2);
                                                        } else {
                                                            p3.m.f135153a.getClass();
                                                            if (objQ2 == p3.m.a.f135155b) {
                                                                objQ2 = new p(uVar3, 2);
                                                                mVar3.K(objQ2);
                                                            }
                                                        }
                                                        g0.b(vVar, tVarD, gVar2, uVar3, xVar2, (e23.l) objQ2, mVar3, pv0.v.f141426e, 0);
                                                    } else {
                                                        mVar3.e();
                                                    }
                                                    break;
                                                default:
                                                    p3.m mVar4 = (p3.m) obj9;
                                                    int iIntValue2 = ((Integer) obj10).intValue();
                                                    if (mVar4.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                        x1 x1Var4 = p3.n.f135158a;
                                                        g0.b((pv0.v) fVar2.a(), aVar4.f130843a.d(aVar4.f130844b), gVar2, uVar2, xVar2, null, mVar4, pv0.v.f141426e, 32);
                                                    } else {
                                                        mVar4.e();
                                                    }
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }, mVar2), mVar2, 384);
                                } else {
                                    mVar2.e();
                                }
                                break;
                            default:
                                final u82.f fVar2 = (u82.f) obj6;
                                p3.m mVar3 = (p3.m) obj7;
                                int iC2 = vb.h.c((Integer) obj8, (c2.t) obj5, fVar2);
                                if ((iC2 & 48) == 0) {
                                    iC2 |= (iC2 & 64) == 0 ? mVar3.B(fVar2) : mVar3.r(fVar2) ? 32 : 16;
                                }
                                if (mVar3.n(iC2 & 1, (iC2 & 145) != 144)) {
                                    x1 x1Var3 = p3.n.f135158a;
                                    pv0.r rVar2 = ((h0) p1Var2.getF182175a()).f79609a;
                                    final u uVar3 = uVar;
                                    boolean zR2 = mVar3.r(uVar3);
                                    Object objQ2 = mVar3.q();
                                    if (zR2) {
                                        objQ2 = new p(uVar3, 3);
                                        mVar3.K(objQ2);
                                    } else {
                                        aVar2.getClass();
                                        if (objQ2 == p3.m.a.f135155b) {
                                            objQ2 = new p(uVar3, 3);
                                            mVar3.K(objQ2);
                                        }
                                    }
                                    final int i19 = 1;
                                    final o82.a aVar4 = aVar;
                                    final o82.g gVar3 = gVar;
                                    final ug2.x xVar3 = xVar;
                                    t.d(rVar2, (e23.l) objQ2, z3.f.c(1530327895, new e23.p() { // from class: gw0.q
                                        /* JADX WARN: Code duplicated, block: B:22:0x008a  */
                                        @Override // e23.p
                                        public final Object invoke(Object obj9, Object obj10) {
                                            int i110 = i19;
                                            o82.a aVar5 = aVar4;
                                            u82.f fVar3 = fVar2;
                                            switch (i110) {
                                                case 0:
                                                    p3.m mVar4 = (p3.m) obj9;
                                                    int iIntValue = ((Integer) obj10).intValue();
                                                    if (mVar4.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                                                        x1 x1Var4 = p3.n.f135158a;
                                                        pv0.v vVar = (pv0.v) fVar3.a();
                                                        b63.t tVarD = aVar5.f130843a.d(aVar5.f130844b);
                                                        u uVar4 = uVar3;
                                                        boolean zR3 = mVar4.r(uVar4);
                                                        Object objQ3 = mVar4.q();
                                                        if (zR3) {
                                                            objQ3 = new p(uVar4, 2);
                                                            mVar4.K(objQ3);
                                                        } else {
                                                            p3.m.f135153a.getClass();
                                                            if (objQ3 == p3.m.a.f135155b) {
                                                                objQ3 = new p(uVar4, 2);
                                                                mVar4.K(objQ3);
                                                            }
                                                        }
                                                        g0.b(vVar, tVarD, gVar3, uVar4, xVar3, (e23.l) objQ3, mVar4, pv0.v.f141426e, 0);
                                                    } else {
                                                        mVar4.e();
                                                    }
                                                    break;
                                                default:
                                                    p3.m mVar5 = (p3.m) obj9;
                                                    int iIntValue2 = ((Integer) obj10).intValue();
                                                    if (mVar5.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                        x1 x1Var5 = p3.n.f135158a;
                                                        g0.b((pv0.v) fVar3.a(), aVar5.f130843a.d(aVar5.f130844b), gVar3, uVar3, xVar3, null, mVar5, pv0.v.f141426e, 32);
                                                    } else {
                                                        mVar5.e();
                                                    }
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }, mVar3), mVar3, 384);
                                } else {
                                    mVar3.e();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, mVar), mVar, 24576, 12);
                mVar.f();
            } else {
                mVar.C(-1929845767);
                final int i17 = 1;
                u82.e.b(new gw0.e(((h0) p1Var.getF182175a()).f79609a.f141413a, 0L, aVar.f130843a, aVar.f130844b, 2, null), uVar.f79777r, null, false, z3.f.c(-801992429, new e23.r() { // from class: gw0.r
                    /* JADX WARN: Code duplicated, block: B:22:0x0067  */
                    /* JADX WARN: Code duplicated, block: B:46:0x00e6  */
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // e23.r
                    public final Object invoke(Object obj5, Object obj6, Object obj7, Object obj8) {
                        int i18 = i17;
                        p3.m.a aVar2 = p3.m.f135153a;
                        p1 p1Var2 = p1Var;
                        switch (i18) {
                            case 0:
                                final u82.f fVar = (u82.f) obj6;
                                p3.m mVar2 = (p3.m) obj7;
                                int iC = vb.h.c((Integer) obj8, (c2.t) obj5, fVar);
                                if ((iC & 48) == 0) {
                                    iC |= (iC & 64) == 0 ? mVar2.B(fVar) : mVar2.r(fVar) ? 32 : 16;
                                }
                                if (mVar2.n(iC & 1, (iC & 145) != 144)) {
                                    x1 x1Var2 = p3.n.f135158a;
                                    pv0.r rVar = ((h0) p1Var2.getF182175a()).f79609a;
                                    final u uVar2 = uVar;
                                    boolean zR = mVar2.r(uVar2);
                                    Object objQ = mVar2.q();
                                    if (zR) {
                                        objQ = new p(uVar2, 0);
                                        mVar2.K(objQ);
                                    } else {
                                        aVar2.getClass();
                                        if (objQ == p3.m.a.f135155b) {
                                            objQ = new p(uVar2, 0);
                                            mVar2.K(objQ);
                                        }
                                    }
                                    final int i19 = 0;
                                    final o82.a aVar3 = aVar;
                                    final o82.g gVar2 = gVar;
                                    final ug2.x xVar2 = xVar;
                                    t.d(rVar, (e23.l) objQ, z3.f.c(572186743, new e23.p() { // from class: gw0.q
                                        /* JADX WARN: Code duplicated, block: B:22:0x008a  */
                                        @Override // e23.p
                                        public final Object invoke(Object obj9, Object obj10) {
                                            int i110 = i19;
                                            o82.a aVar5 = aVar3;
                                            u82.f fVar3 = fVar;
                                            switch (i110) {
                                                case 0:
                                                    p3.m mVar4 = (p3.m) obj9;
                                                    int iIntValue = ((Integer) obj10).intValue();
                                                    if (mVar4.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                                                        x1 x1Var4 = p3.n.f135158a;
                                                        pv0.v vVar = (pv0.v) fVar3.a();
                                                        b63.t tVarD = aVar5.f130843a.d(aVar5.f130844b);
                                                        u uVar4 = uVar2;
                                                        boolean zR3 = mVar4.r(uVar4);
                                                        Object objQ3 = mVar4.q();
                                                        if (zR3) {
                                                            objQ3 = new p(uVar4, 2);
                                                            mVar4.K(objQ3);
                                                        } else {
                                                            p3.m.f135153a.getClass();
                                                            if (objQ3 == p3.m.a.f135155b) {
                                                                objQ3 = new p(uVar4, 2);
                                                                mVar4.K(objQ3);
                                                            }
                                                        }
                                                        g0.b(vVar, tVarD, gVar2, uVar4, xVar2, (e23.l) objQ3, mVar4, pv0.v.f141426e, 0);
                                                    } else {
                                                        mVar4.e();
                                                    }
                                                    break;
                                                default:
                                                    p3.m mVar5 = (p3.m) obj9;
                                                    int iIntValue2 = ((Integer) obj10).intValue();
                                                    if (mVar5.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                        x1 x1Var5 = p3.n.f135158a;
                                                        g0.b((pv0.v) fVar3.a(), aVar5.f130843a.d(aVar5.f130844b), gVar2, uVar2, xVar2, null, mVar5, pv0.v.f141426e, 32);
                                                    } else {
                                                        mVar5.e();
                                                    }
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }, mVar2), mVar2, 384);
                                } else {
                                    mVar2.e();
                                }
                                break;
                            default:
                                final u82.f fVar2 = (u82.f) obj6;
                                p3.m mVar3 = (p3.m) obj7;
                                int iC2 = vb.h.c((Integer) obj8, (c2.t) obj5, fVar2);
                                if ((iC2 & 48) == 0) {
                                    iC2 |= (iC2 & 64) == 0 ? mVar3.B(fVar2) : mVar3.r(fVar2) ? 32 : 16;
                                }
                                if (mVar3.n(iC2 & 1, (iC2 & 145) != 144)) {
                                    x1 x1Var3 = p3.n.f135158a;
                                    pv0.r rVar2 = ((h0) p1Var2.getF182175a()).f79609a;
                                    final u uVar3 = uVar;
                                    boolean zR2 = mVar3.r(uVar3);
                                    Object objQ2 = mVar3.q();
                                    if (zR2) {
                                        objQ2 = new p(uVar3, 3);
                                        mVar3.K(objQ2);
                                    } else {
                                        aVar2.getClass();
                                        if (objQ2 == p3.m.a.f135155b) {
                                            objQ2 = new p(uVar3, 3);
                                            mVar3.K(objQ2);
                                        }
                                    }
                                    final int i110 = 1;
                                    final o82.a aVar4 = aVar;
                                    final o82.g gVar3 = gVar;
                                    final ug2.x xVar3 = xVar;
                                    t.d(rVar2, (e23.l) objQ2, z3.f.c(1530327895, new e23.p() { // from class: gw0.q
                                        /* JADX WARN: Code duplicated, block: B:22:0x008a  */
                                        @Override // e23.p
                                        public final Object invoke(Object obj9, Object obj10) {
                                            int i111 = i110;
                                            o82.a aVar5 = aVar4;
                                            u82.f fVar3 = fVar2;
                                            switch (i111) {
                                                case 0:
                                                    p3.m mVar4 = (p3.m) obj9;
                                                    int iIntValue = ((Integer) obj10).intValue();
                                                    if (mVar4.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                                                        x1 x1Var4 = p3.n.f135158a;
                                                        pv0.v vVar = (pv0.v) fVar3.a();
                                                        b63.t tVarD = aVar5.f130843a.d(aVar5.f130844b);
                                                        u uVar4 = uVar3;
                                                        boolean zR3 = mVar4.r(uVar4);
                                                        Object objQ3 = mVar4.q();
                                                        if (zR3) {
                                                            objQ3 = new p(uVar4, 2);
                                                            mVar4.K(objQ3);
                                                        } else {
                                                            p3.m.f135153a.getClass();
                                                            if (objQ3 == p3.m.a.f135155b) {
                                                                objQ3 = new p(uVar4, 2);
                                                                mVar4.K(objQ3);
                                                            }
                                                        }
                                                        g0.b(vVar, tVarD, gVar3, uVar4, xVar3, (e23.l) objQ3, mVar4, pv0.v.f141426e, 0);
                                                    } else {
                                                        mVar4.e();
                                                    }
                                                    break;
                                                default:
                                                    p3.m mVar5 = (p3.m) obj9;
                                                    int iIntValue2 = ((Integer) obj10).intValue();
                                                    if (mVar5.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                        x1 x1Var5 = p3.n.f135158a;
                                                        g0.b((pv0.v) fVar3.a(), aVar5.f130843a.d(aVar5.f130844b), gVar3, uVar3, xVar3, null, mVar5, pv0.v.f141426e, 32);
                                                    } else {
                                                        mVar5.e();
                                                    }
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }, mVar3), mVar3, 384);
                                } else {
                                    mVar3.e();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, mVar), mVar, 24576, 12);
                mVar.f();
            }
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        int i14;
        h60.h hVar = (h60.h) this.f2371b;
        o82.g gVar = (o82.g) this.f2372c;
        n82.f fVar = (n82.f) this.f2373d;
        o82.g gVar2 = (o82.g) obj;
        o82.a aVar = (o82.a) obj2;
        p3.m mVar = (p3.m) obj3;
        int iD = vb.h.d((Integer) obj4, gVar2, aVar);
        if ((iD & 6) == 0) {
            i14 = (mVar.k(gVar2.ordinal()) ? 4 : 2) | iD;
        } else {
            i14 = iD;
        }
        if ((iD & 48) == 0) {
            i14 |= mVar.B(aVar) ? 32 : 16;
        }
        int i15 = i14;
        if (mVar.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            int i16 = h60.g.a.f82163a[gVar2.ordinal()];
            if (i16 == 1) {
                mVar.C(571307197);
                h4.r rVarC = x2.c(h4.r.S, 1.0f);
                u82.a aVar2 = hVar.f82171g;
                h60.a.f82151a.getClass();
                u82.e.b(aVar, aVar2, rVarC, false, h60.a.f82152b, mVar, ((i15 >> 3) & 14) | 28032, 0);
                mVar.f();
            } else if (i16 == 2) {
                mVar.C(571802670);
                u82.e.b(aVar, hVar.f82172h, u1.n.e(h4.r.S, tn.k.a(d92.b.f58623a, mVar), m1.f128891a), false, z3.f.c(137908305, new r(aVar, 28, gVar, hVar), mVar), mVar, ((i15 >> 3) & 14) | 24576, 8);
                mVar.f();
            } else if (i16 == 3 || i16 == 4) {
                mVar.C(573021683);
                u82.e.b(aVar, hVar.f82173i, u1.n.e(h4.r.S, tn.k.a(d92.b.f58623a, mVar), m1.f128891a), false, z3.f.c(-1572764176, new d0(aVar, gVar, hVar, fVar, 22), mVar), mVar, ((i15 >> 3) & 14) | 24576, 8);
                mVar.f();
            } else {
                mVar.C(711262836);
                mVar.f();
            }
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x006d  */
    /* JADX WARN: Code duplicated, block: B:6:0x0050  */
    private final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        o82.a aVar = (o82.a) this.f2371b;
        o82.g gVar = (o82.g) this.f2372c;
        h60.h hVar = (h60.h) this.f2373d;
        u82.f fVar = (u82.f) obj2;
        p3.m mVar = (p3.m) obj3;
        ((Integer) obj4).getClass();
        ((c2.t) obj).getClass();
        fVar.getClass();
        x1 x1Var = p3.n.f135158a;
        LocalDate localDateH = g22.l.h(aVar.f130843a);
        LocalDate localDateH2 = g22.l.h(aVar.f130844b);
        n60.b bVar = (n60.b) fVar.a();
        boolean zR = mVar.r(hVar) | mVar.k(gVar.ordinal());
        Object objQ = mVar.q();
        p3.m.a aVar2 = p3.m.f135153a;
        if (zR) {
            objQ = new h60.e(hVar, gVar, 0);
            mVar.K(objQ);
        } else {
            aVar2.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new h60.e(hVar, gVar, 0);
                mVar.K(objQ);
            }
        }
        e23.a aVar3 = (e23.a) objQ;
        boolean zR2 = mVar.r(hVar);
        Object objQ2 = mVar.q();
        if (zR2) {
            objQ2 = new h60.d(hVar, 1);
            mVar.K(objQ2);
        } else {
            aVar2.getClass();
            if (objQ2 == p3.m.a.f135155b) {
                objQ2 = new h60.d(hVar, 1);
                mVar.K(objQ2);
            }
        }
        r60.d.a(localDateH, localDateH2, gVar, bVar, aVar3, (e23.l) objQ2, mVar, 0);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:148:0x0436  */
    /* JADX WARN: Code duplicated, block: B:153:0x0458  */
    /* JADX WARN: Code duplicated, block: B:158:0x0475  */
    /* JADX WARN: Code duplicated, block: B:171:0x051d  */
    /* JADX WARN: Code duplicated, block: B:176:0x053a  */
    /* JADX WARN: Code duplicated, block: B:183:0x05a3  */
    /* JADX WARN: Code duplicated, block: B:190:0x0602  */
    /* JADX WARN: Code duplicated, block: B:195:0x062d  */
    /* JADX WARN: Code duplicated, block: B:215:0x06fe  */
    /* JADX WARN: Code duplicated, block: B:225:0x0773  */
    /* JADX WARN: Code duplicated, block: B:232:0x07c5  */
    /* JADX WARN: Code duplicated, block: B:237:0x07ec  */
    /* JADX WARN: Code duplicated, block: B:242:0x080b  */
    /* JADX WARN: Code duplicated, block: B:249:0x0871  */
    /* JADX WARN: Code duplicated, block: B:254:0x0894  */
    /* JADX WARN: Code duplicated, block: B:259:0x08e7  */
    /* JADX WARN: Code duplicated, block: B:266:0x0959  */
    /* JADX WARN: Code duplicated, block: B:271:0x097b  */
    /* JADX WARN: Code duplicated, block: B:276:0x099f  */
    /* JADX WARN: Code duplicated, block: B:281:0x09c3  */
    /* JADX WARN: Code duplicated, block: B:298:0x0aa1  */
    /* JADX WARN: Code duplicated, block: B:303:0x0ad1  */
    /* JADX WARN: Code duplicated, block: B:349:0x0be8  */
    /* JADX WARN: Code duplicated, block: B:360:0x0c3d  */
    /* JADX WARN: Code duplicated, block: B:58:0x01c6  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        Object obj10;
        Object obj11;
        Object obj12;
        Object obj13;
        Object obj14;
        Object obj15;
        String str;
        String str2;
        int i14;
        int i15;
        int i16 = this.f2370a;
        Unit unit = null;
        p3.m.a aVar = p3.m.f135153a;
        boolean z14 = true;
        boolean z15 = true;
        boolean z16 = true;
        Object obj16 = this.f2373d;
        Object obj17 = this.f2372c;
        Object obj18 = this.f2371b;
        boolean z17 = false;
        switch (i16) {
            case 0:
                e23.r rVar = (e23.r) obj18;
                u uVar = (u) obj17;
                e23.l lVar = (e23.l) obj16;
                p3.m mVar = (p3.m) obj3;
                r1.q2.t((Integer) obj4, (r1.l) obj, (lc.v) obj2);
                x1 x1Var = p3.n.f135158a;
                if (rVar == null) {
                    mVar.C(-1994151287);
                    mVar.f();
                } else {
                    mVar.C(-1994151286);
                    s.d(gl1.y.Q(mVar, uVar.f2389a.f26602b), null, rVar, z3.f.c(-1126892998, new l(uVar, lVar), mVar), mVar, 3120);
                    mVar.f();
                    unit = Unit.INSTANCE;
                }
                if (unit == null) {
                    mVar.C(905513978);
                    s.a(uVar, lVar, mVar, 0);
                } else {
                    mVar.C(905503593);
                }
                mVar.f();
                return Unit.INSTANCE;
            case 1:
                bk0.d dVar = (bk0.d) obj18;
                ak0.v vVar = (ak0.v) obj17;
                ak0.u uVar2 = (ak0.u) obj16;
                int iIntValue = ((Integer) obj2).intValue();
                p3.m mVar2 = (p3.m) obj3;
                ((Integer) obj4).getClass();
                ((c0) obj).getClass();
                x1 x1Var2 = p3.n.f135158a;
                if (iIntValue == com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.i.EnumC0614c.EDUCATION.ordinal()) {
                    mVar2.C(-1173897801);
                    boolean zR = mVar2.r(vVar);
                    Object objQ = mVar2.q();
                    if (zR) {
                        objQ = new com.garmin.android.apps.connectmobile.gcplus.presentation.home.d.a(vVar);
                        mVar2.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new com.garmin.android.apps.connectmobile.gcplus.presentation.home.d.a(vVar);
                            mVar2.K(objQ);
                        }
                    }
                    bk0.e.a(dVar, (e23.l) ((k23.g) objQ), mVar2, 0);
                    mVar2.f();
                } else if (iIntValue == com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.i.EnumC0614c.SETTINGS.ordinal()) {
                    mVar2.C(-1173705539);
                    com.garmin.android.apps.connectmobile.gcplus.presentation.home.d.c(vVar, uVar2, mVar2, 0);
                    mVar2.f();
                } else {
                    mVar2.C(-1173612849);
                    mVar2.f();
                }
                return Unit.INSTANCE;
            case 2:
                List list = (List) obj18;
                am.x0 x0Var = (am.x0) obj17;
                e23.l lVar2 = (e23.l) obj16;
                int iIntValue2 = ((Integer) obj2).intValue();
                p3.m mVar3 = (p3.m) obj3;
                int iIntValue3 = ((Integer) obj4).intValue();
                ((e2.d) obj).getClass();
                if ((iIntValue3 & 48) == 0) {
                    iIntValue3 |= mVar3.k(iIntValue2) ? 32 : 16;
                }
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 145) != 144)) {
                    x1 x1Var3 = p3.n.f135158a;
                    am.x0 x0Var2 = (am.x0) list.get(iIntValue2);
                    boolean z18 = x0Var2 == x0Var;
                    boolean zB = mVar3.B(lVar2) | mVar3.k(x0Var2.ordinal());
                    Object objQ2 = mVar3.q();
                    if (zB) {
                        objQ2 = new h1(lVar2, x0Var2, 0);
                        mVar3.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new h1(lVar2, x0Var2, 0);
                            mVar3.K(objQ2);
                        }
                    }
                    am.p1.a(x0Var2, z18, (e23.a) objQ2, mVar3, 0);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 3:
                zc.d dVar2 = (zc.d) obj18;
                e23.l lVar3 = (e23.l) obj16;
                e23.l lVar4 = (e23.l) obj17;
                int iIntValue4 = ((Integer) obj2).intValue();
                p3.m mVar4 = (p3.m) obj3;
                int iIntValue5 = ((Integer) obj4).intValue();
                ((e2.d) obj).getClass();
                if ((iIntValue5 & 48) == 0) {
                    iIntValue5 |= mVar4.k(iIntValue4) ? 32 : 16;
                }
                if (mVar4.n(iIntValue5 & 1, (iIntValue5 & 145) != 144)) {
                    x1 x1Var4 = p3.n.f135158a;
                    km0.m mVar5 = (km0.m) dVar2.a(iIntValue4);
                    if (mVar5 == null) {
                        mVar4.C(-815127135);
                        mVar4.f();
                    } else {
                        mVar4.C(-815127134);
                        an0.e.a(mVar5, lVar3, lVar4, mVar4, hi0.l.f83843k);
                        mVar4.f();
                    }
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 4:
                c42.p pVar = (c42.p) obj18;
                e23.a aVar2 = (e23.a) obj17;
                lc.y yVar = (lc.y) obj16;
                lc.v vVar2 = (lc.v) obj2;
                p3.m mVar6 = (p3.m) obj3;
                ((Integer) obj4).getClass();
                ((r1.l) obj).getClass();
                vVar2.getClass();
                x1 x1Var5 = p3.n.f135158a;
                boolean zB2 = mVar6.B(vVar2);
                Object objQ3 = mVar6.q();
                if (zB2) {
                    obj5 = objQ3;
                    lc.v vVarC = yVar.c(s0.f105811a.b(c42.n.c.class));
                    mVar6.K(vVarC);
                    obj5 = vVarC;
                } else {
                    aVar.getClass();
                    if (objQ3 == p3.m.a.f135155b) {
                        obj5 = objQ3;
                        lc.v vVarC2 = yVar.c(s0.f105811a.b(c42.n.c.class));
                        mVar6.K(vVarC2);
                        obj5 = vVarC2;
                    }
                }
                obj5 = objQ3;
                t0 t0Var = s0.f105811a;
                List<sd2.f> list2 = ((c42.n.c) lc.w.a((lc.v) obj5, t0Var.b(c42.n.c.class))).f24420a.f24352a;
                boolean zR2 = mVar6.r(list2);
                Object objQ4 = mVar6.q();
                if (zR2) {
                    obj6 = objQ4;
                    ad.b bVar = new ad.b(list2, 2);
                    mVar6.K(bVar);
                    obj6 = bVar;
                } else {
                    aVar.getClass();
                    if (objQ4 == p3.m.a.f135155b) {
                        obj6 = objQ4;
                        ad.b bVar2 = new ad.b(list2, 2);
                        mVar6.K(bVar2);
                        obj6 = bVar2;
                    }
                }
                obj6 = objQ4;
                e23.a aVar3 = (e23.a) obj6;
                mVar6.L(-1614864554);
                v9.a.f176280a.getClass();
                ViewModelStoreOwner viewModelStoreOwnerA = v9.a.a(mVar6);
                if (viewModelStoreOwnerA == null) {
                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return null;
                }
                u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(t0Var.b(i0.class), viewModelStoreOwnerA.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA), null, KoinApplicationKt.currentKoinScope(mVar6, 0), aVar3);
                mVar6.R();
                c42.h0.c((i0) u1VarResolveViewModel, pVar, aVar2, mVar6, 0);
                return Unit.INSTANCE;
            case 5:
                e50.h hVar = (e50.h) obj18;
                e23.l lVar5 = (e23.l) obj16;
                e50.e eVar = (e50.e) obj17;
                int iIntValue6 = ((Integer) obj2).intValue();
                p3.m mVar7 = (p3.m) obj3;
                ((Integer) obj4).getClass();
                ((c0) obj).getClass();
                x1 x1Var6 = p3.n.f135158a;
                if (iIntValue6 == 0) {
                    mVar7.C(2060915958);
                    c50.h.a(hVar, lVar5, mVar7, 0);
                    mVar7.f();
                } else if (iIntValue6 != 1) {
                    mVar7.C(2061300265);
                    mVar7.f();
                } else {
                    mVar7.C(2061116280);
                    c50.e.a(eVar, lVar5, mVar7, 0);
                    mVar7.f();
                }
                return Unit.INSTANCE;
            case 6:
                lc.v vVar3 = (lc.v) obj2;
                p3.m mVar8 = (p3.m) obj3;
                r1.q2.t((Integer) obj4, (r1.l) obj, vVar3);
                x1 x1Var7 = p3.n.f135158a;
                gv.a aVarValueOf = gv.a.valueOf(((ca0.d.c) lc.w.a(vVar3, s0.f105811a.b(ca0.d.c.class))).f26184a);
                l90.b bVar3 = ca0.b.a(vVar3, (e23.a) obj17, mVar8).f143495c;
                ea0.i.a(bVar3.f111521f, bVar3.f111526k, aVarValueOf, (ca0.u1) obj18, (e23.l) obj16, mVar8, 0);
                return Unit.INSTANCE;
            case 7:
                final o0 o0Var = (o0) obj18;
                m0 m0Var = (m0) obj17;
                e23.l lVar6 = (e23.l) obj16;
                lc.v vVar4 = (lc.v) obj2;
                p3.m mVar9 = (p3.m) obj3;
                ((Integer) obj4).intValue();
                ((r1.l) obj).getClass();
                vVar4.getClass();
                x1 x1Var8 = p3.n.f135158a;
                b1.l lVar7 = (b1.l) lc.w.a(vVar4, s0.f105811a.b(b1.l.class));
                final ta0.x xVarA = ca0.y0.a(vVar4, m0Var, mVar9);
                boolean zR3 = mVar9.r(xVarA) | mVar9.B(o0Var);
                Object objQ5 = mVar9.q();
                if (zR3) {
                    obj7 = objQ5;
                    final int i17 = z17 ? 1 : 0;
                    e23.a aVar4 = new e23.a() { // from class: ca0.w0
                        @Override // e23.a
                        public final Object invoke() {
                            switch (i17) {
                                case 0:
                                    xVarA.x4();
                                    o0Var.invoke();
                                    break;
                                default:
                                    xVarA.x4();
                                    o0Var.invoke();
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    mVar9.K(aVar4);
                    obj7 = aVar4;
                } else {
                    aVar.getClass();
                    if (objQ5 == p3.m.a.f135155b) {
                        obj7 = objQ5;
                        final int i18 = z17 ? 1 : 0;
                        e23.a aVar5 = new e23.a() { // from class: ca0.w0
                            @Override // e23.a
                            public final Object invoke() {
                                switch (i18) {
                                    case 0:
                                        xVarA.x4();
                                        o0Var.invoke();
                                        break;
                                    default:
                                        xVarA.x4();
                                        o0Var.invoke();
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar9.K(aVar5);
                        obj7 = aVar5;
                    }
                }
                obj7 = objQ5;
                c.w.a(0, 1, (e23.a) obj7, mVar9, false);
                l90.b bVar4 = lVar7.f26109a;
                Long l14 = lVar7.f26110b;
                boolean zR4 = mVar9.r(m0Var);
                Object objQ6 = mVar9.q();
                if (zR4) {
                    obj8 = objQ6;
                    d7 d7Var = new d7(m0Var, 8);
                    mVar9.K(d7Var);
                    obj8 = d7Var;
                } else {
                    aVar.getClass();
                    if (objQ6 == p3.m.a.f135155b) {
                        obj8 = objQ6;
                        d7 d7Var2 = new d7(m0Var, 8);
                        mVar9.K(d7Var2);
                        obj8 = d7Var2;
                    }
                }
                obj8 = objQ6;
                e23.l lVar8 = (e23.l) obj8;
                boolean zR5 = mVar9.r(m0Var) | mVar9.r(lVar7);
                Object objQ7 = mVar9.q();
                if (zR5) {
                    obj9 = objQ7;
                    bb0.d dVar3 = new bb0.d(27, m0Var, lVar7);
                    mVar9.K(dVar3);
                    obj9 = dVar3;
                } else {
                    aVar.getClass();
                    if (objQ7 == p3.m.a.f135155b) {
                        obj9 = objQ7;
                        bb0.d dVar4 = new bb0.d(27, m0Var, lVar7);
                        mVar9.K(dVar4);
                        obj9 = dVar4;
                    }
                }
                obj9 = objQ7;
                e23.a aVar6 = (e23.a) obj9;
                boolean zR6 = mVar9.r(xVarA) | mVar9.B(o0Var);
                Object objQ8 = mVar9.q();
                if (zR6) {
                    obj10 = objQ8;
                    final boolean z19 = z14 ? 1 : 0;
                    e23.a aVar7 = new e23.a() { // from class: ca0.w0
                        @Override // e23.a
                        public final Object invoke() {
                            switch (z19) {
                                case 0:
                                    xVarA.x4();
                                    o0Var.invoke();
                                    break;
                                default:
                                    xVarA.x4();
                                    o0Var.invoke();
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    mVar9.K(aVar7);
                    obj10 = aVar7;
                } else {
                    aVar.getClass();
                    if (objQ8 == p3.m.a.f135155b) {
                        obj10 = objQ8;
                        final int z110 = z14 ? 1 : 0;
                        e23.a aVar8 = new e23.a() { // from class: ca0.w0
                            @Override // e23.a
                            public final Object invoke() {
                                switch (z110) {
                                    case 0:
                                        xVarA.x4();
                                        o0Var.invoke();
                                        break;
                                    default:
                                        xVarA.x4();
                                        o0Var.invoke();
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar9.K(aVar8);
                        obj10 = aVar8;
                    }
                }
                obj10 = objQ8;
                ta0.w0.a(xVarA, bVar4, l14, lVar8, aVar6, (e23.a) obj10, lVar6, mVar9, 0);
                return Unit.INSTANCE;
            case 8:
                e23.a aVar9 = (e23.a) obj18;
                c42.c0 c0Var = (c42.c0) obj17;
                m0 m0Var2 = (m0) obj16;
                lc.v vVar5 = (lc.v) obj2;
                p3.m mVar10 = (p3.m) obj3;
                ((Integer) obj4).intValue();
                ((r1.l) obj).getClass();
                vVar5.getClass();
                x1 x1Var9 = p3.n.f135158a;
                b1.n nVar = (b1.n) lc.w.a(vVar5, s0.f105811a.b(b1.n.class));
                String str3 = nVar.f26114a;
                String str4 = nVar.f26115b;
                ta0.x xVarA2 = ca0.y0.a(vVar5, m0Var2, mVar10);
                boolean zB3 = mVar10.B(aVar9);
                Object objQ9 = mVar10.q();
                if (zB3) {
                    obj11 = objQ9;
                    ca0.v0 v0Var = new ca0.v0(aVar9, 0);
                    mVar10.K(v0Var);
                    obj11 = v0Var;
                } else {
                    aVar.getClass();
                    if (objQ9 == p3.m.a.f135155b) {
                        obj11 = objQ9;
                        ca0.v0 v0Var2 = new ca0.v0(aVar9, 0);
                        mVar10.K(v0Var2);
                        obj11 = v0Var2;
                    }
                }
                obj11 = objQ9;
                c.w.a(0, 1, (e23.a) obj11, mVar10, false);
                boolean zB4 = mVar10.B(str3) | mVar10.B(str4);
                Object objQ10 = mVar10.q();
                if (zB4) {
                    obj12 = objQ10;
                    b2 b2VarK = r53.s.K(new a0(new l1(xVarA2.f163469m), xVarA2, str3, str4), v1.a(xVarA2), k2.a.a(k2.f150703a, 2), null);
                    mVar10.K(b2VarK);
                    obj12 = b2VarK;
                } else {
                    aVar.getClass();
                    if (objQ10 == p3.m.a.f135155b) {
                        obj12 = objQ10;
                        b2 b2VarK2 = r53.s.K(new a0(new l1(xVarA2.f163469m), xVarA2, str3, str4), v1.a(xVarA2), k2.a.a(k2.f150703a, 2), null);
                        mVar10.K(b2VarK2);
                        obj12 = b2VarK2;
                    }
                }
                obj12 = objQ10;
                p1 p1VarC = s9.c.c((o2) obj12, mVar10);
                Context context = (Context) mVar10.A(AndroidCompositionLocals_androidKt.f6042b);
                o13.q qVar = (o13.q) p1VarC.getF182175a();
                boolean zB5 = mVar10.B(p1VarC) | mVar10.B(c0Var) | mVar10.r(context) | mVar10.r(m0Var2);
                Object objQ11 = mVar10.q();
                if (zB5) {
                    a1 a1Var = new a1(p1VarC, c0Var, context, m0Var2, null);
                    mVar10.K(a1Var);
                    objQ11 = a1Var;
                } else {
                    aVar.getClass();
                    if (objQ11 == p3.m.a.f135155b) {
                        a1 a1Var2 = new a1(p1VarC, c0Var, context, m0Var2, null);
                        mVar10.K(a1Var2);
                        objQ11 = a1Var2;
                    }
                }
                l0.e((e23.p) objQ11, qVar, mVar10);
                da0.p.d(null, true, null, null, null, null, null, mVar10, 48, 253);
                return Unit.INSTANCE;
            case 9:
                final o0 o0Var2 = (o0) obj18;
                m0 m0Var3 = (m0) obj17;
                t1 t1Var = (t1) obj16;
                lc.v vVar6 = (lc.v) obj2;
                p3.m mVar11 = (p3.m) obj3;
                ((Integer) obj4).getClass();
                ((r1.l) obj).getClass();
                vVar6.getClass();
                x1 x1Var10 = p3.n.f135158a;
                b1.e eVar2 = (b1.e) lc.w.a(vVar6, s0.f105811a.b(b1.e.class));
                boolean zB6 = mVar11.B(o0Var2);
                Object objQ12 = mVar11.q();
                if (zB6) {
                    final int i19 = z17 ? 1 : 0;
                    objQ12 = new e23.a() { // from class: ca0.t0
                        @Override // e23.a
                        public final Object invoke() {
                            switch (i19) {
                                case 0:
                                    o0Var2.invoke();
                                    break;
                                default:
                                    o0Var2.invoke();
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    mVar11.K(objQ12);
                } else {
                    aVar.getClass();
                    if (objQ12 == p3.m.a.f135155b) {
                        final int i110 = z17 ? 1 : 0;
                        objQ12 = new e23.a() { // from class: ca0.t0
                            @Override // e23.a
                            public final Object invoke() {
                                switch (i110) {
                                    case 0:
                                        o0Var2.invoke();
                                        break;
                                    default:
                                        o0Var2.invoke();
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar11.K(objQ12);
                    }
                }
                c.w.a(0, 1, (e23.a) objQ12, mVar11, false);
                l90.b bVar5 = eVar2.f26093a;
                String str5 = eVar2.f26094b;
                boolean zR7 = mVar11.r(m0Var3) | mVar11.B(t1Var);
                Object objQ13 = mVar11.q();
                if (zR7) {
                    objQ13 = new bp.h(17, m0Var3, t1Var);
                    mVar11.K(objQ13);
                } else {
                    aVar.getClass();
                    if (objQ13 == p3.m.a.f135155b) {
                        objQ13 = new bp.h(17, m0Var3, t1Var);
                        mVar11.K(objQ13);
                    }
                }
                e23.l lVar9 = (e23.l) objQ13;
                boolean zB7 = mVar11.B(o0Var2);
                Object objQ14 = mVar11.q();
                if (zB7) {
                    final boolean z24 = z15 ? 1 : 0;
                    objQ14 = new e23.a() { // from class: ca0.t0
                        @Override // e23.a
                        public final Object invoke() {
                            switch (z24) {
                                case 0:
                                    o0Var2.invoke();
                                    break;
                                default:
                                    o0Var2.invoke();
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    mVar11.K(objQ14);
                } else {
                    aVar.getClass();
                    if (objQ14 == p3.m.a.f135155b) {
                        final int z25 = z15 ? 1 : 0;
                        objQ14 = new e23.a() { // from class: ca0.t0
                            @Override // e23.a
                            public final Object invoke() {
                                switch (z25) {
                                    case 0:
                                        o0Var2.invoke();
                                        break;
                                    default:
                                        o0Var2.invoke();
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar11.K(objQ14);
                    }
                }
                ta0.v0.b(bVar5, str5, null, lVar9, (e23.a) objQ14, mVar11, 0);
                return Unit.INSTANCE;
            case 10:
                s1 s1Var = (s1) obj18;
                o0 o0Var3 = (o0) obj17;
                m0 m0Var4 = (m0) obj16;
                p3.m mVar12 = (p3.m) obj3;
                r1.q2.t((Integer) obj4, (r1.l) obj, (lc.v) obj2);
                x1 x1Var11 = p3.n.f135158a;
                q90.d dVar5 = (q90.d) s1Var.invoke();
                if (dVar5 == null) {
                    o0Var3.invoke();
                    return Unit.INSTANCE;
                }
                n80.a aVar10 = new n80.a(dVar5.getMacAddress(), dVar5.getProductDisplayName(), dVar5.getProductNumber(), dVar5 instanceof q90.d.a);
                boolean zB8 = mVar12.B(s1Var) | mVar12.r(m0Var4) | mVar12.B(o0Var3);
                Object objQ15 = mVar12.q();
                if (zB8) {
                    objQ15 = new ca0.h1(s1Var, m0Var4, o0Var3, 0);
                    mVar12.K(objQ15);
                } else {
                    aVar.getClass();
                    if (objQ15 == p3.m.a.f135155b) {
                        objQ15 = new ca0.h1(s1Var, m0Var4, o0Var3, 0);
                        mVar12.K(objQ15);
                    }
                }
                ya0.f.a(aVar10, null, (e23.a) objQ15, mVar12, n80.a.f124926e);
                return Unit.INSTANCE;
            case 11:
                m0 m0Var5 = (m0) obj18;
                o0 o0Var4 = (o0) obj17;
                e23.l lVar10 = (e23.l) obj16;
                lc.v vVar7 = (lc.v) obj2;
                p3.m mVar13 = (p3.m) obj3;
                r1.q2.t((Integer) obj4, (r1.l) obj, vVar7);
                x1 x1Var12 = p3.n.f135158a;
                n1.g gVar = (n1.g) lc.w.a(vVar7, s0.f105811a.b(n1.g.class));
                q90.c cVar = gVar.f26365a;
                long j8 = cVar.f143493a;
                l90.b bVar6 = cVar.f143495c;
                boolean zR8 = mVar13.r(m0Var5) | mVar13.r(gVar);
                Object objQ16 = mVar13.q();
                if (zR8) {
                    obj13 = objQ16;
                    bb0.d dVar6 = new bb0.d(29, m0Var5, gVar);
                    mVar13.K(dVar6);
                    obj13 = dVar6;
                } else {
                    aVar.getClass();
                    if (objQ16 == p3.m.a.f135155b) {
                        obj13 = objQ16;
                        bb0.d dVar7 = new bb0.d(29, m0Var5, gVar);
                        mVar13.K(dVar7);
                        obj13 = dVar7;
                    }
                }
                obj13 = objQ16;
                ya0.p.a(j8, bVar6, (e23.a) obj13, null, o0Var4, lVar10, mVar13, 0);
                return Unit.INSTANCE;
            case 12:
                ca0.u1 u1Var = (ca0.u1) obj18;
                m0 m0Var6 = (m0) obj17;
                lc.v vVar8 = (lc.v) obj2;
                p3.m mVar14 = (p3.m) obj3;
                ((Integer) obj4).intValue();
                ((r1.l) obj).getClass();
                vVar8.getClass();
                x1 x1Var13 = p3.n.f135158a;
                p1 p1VarC2 = s9.c.c(ca0.o2.a(vVar8, (ca0.v0) obj16, m0Var6, mVar14).f183769f, mVar14);
                Boolean boolValueOf = Boolean.valueOf(((wa0.c.b) p1VarC2.getF182175a()).f183771b);
                boolean zB9 = mVar14.B(p1VarC2) | mVar14.B(u1Var);
                Object objQ17 = mVar14.q();
                if (zB9) {
                    obj14 = objQ17;
                    m2 m2Var = new m2(u1Var, p1VarC2, null);
                    mVar14.K(m2Var);
                    obj14 = m2Var;
                } else {
                    aVar.getClass();
                    if (objQ17 == p3.m.a.f135155b) {
                        obj14 = objQ17;
                        m2 m2Var2 = new m2(u1Var, p1VarC2, null);
                        mVar14.K(m2Var2);
                        obj14 = m2Var2;
                    }
                }
                obj14 = objQ17;
                l0.e((e23.p) obj14, boolValueOf, mVar14);
                Boolean bool = ((wa0.c.b) p1VarC2.getF182175a()).f183772c;
                boolean zB10 = mVar14.B(p1VarC2) | mVar14.r(m0Var6);
                Object objQ18 = mVar14.q();
                if (zB10) {
                    obj15 = objQ18;
                    ca0.n2 n2Var = new ca0.n2(m0Var6, p1VarC2, null);
                    mVar14.K(n2Var);
                    obj15 = n2Var;
                } else {
                    aVar.getClass();
                    if (objQ18 == p3.m.a.f135155b) {
                        obj15 = objQ18;
                        ca0.n2 n2Var2 = new ca0.n2(m0Var6, p1VarC2, null);
                        mVar14.K(n2Var2);
                        obj15 = n2Var2;
                    }
                }
                obj15 = objQ18;
                l0.e((e23.p) obj15, bool, mVar14);
                h4.r.a aVar11 = h4.r.S;
                h4.r rVarD = x2.d(aVar11, 1.0f);
                h4.d.f81522a.getClass();
                z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
                int iHashCode = Long.hashCode(mVar14.getU());
                i2 i2VarX = mVar14.x();
                h4.r rVarC = h4.k.c(rVarD, mVar14);
                h5.g.V.getClass();
                e0.a aVar12 = h5.g.a.f81805b;
                if (mVar14.F() == null) {
                    p0.l();
                    throw null;
                }
                mVar14.z();
                if (mVar14.getT()) {
                    mVar14.M(aVar12);
                } else {
                    mVar14.c();
                }
                b4.c(h5.g.a.f81810g, z0VarD, mVar14);
                b4.c(h5.g.a.f81809f, i2VarX, mVar14);
                h5.g.a.b bVar7 = h5.g.a.f81813j;
                if (mVar14.getT() || !p005kotlin.jvm.internal.s.g(mVar14.q(), Integer.valueOf(iHashCode))) {
                    v.h.z(iHashCode, mVar14, iHashCode, bVar7);
                }
                b4.c(h5.g.a.f81807d, rVarC, mVar14);
                g02.s0.b(c2.u.f22885a.c(aVar11, h4.d.a.f81528f), 0.0f, mVar14, 0, 2);
                mVar14.y();
                return Unit.INSTANCE;
            case 13:
                m0 m0Var7 = (m0) obj18;
                ca0.u1 u1Var2 = (ca0.u1) obj17;
                lc.v vVar9 = (lc.v) obj2;
                p3.m mVar15 = (p3.m) obj3;
                r1.q2.t((Integer) obj4, (r1.l) obj, vVar9);
                x1 x1Var14 = p3.n.f135158a;
                za0.i iVarA = t2.a(vVar9, (e23.a) obj16, m0Var7, mVar15);
                p1 p1VarC3 = s9.c.c(iVarA.f203251f, mVar15);
                za0.i.b bVar8 = (za0.i.b) p1VarC3.getF182175a();
                boolean zB11 = mVar15.B(p1VarC3) | mVar15.r(m0Var7) | mVar15.r(iVarA) | mVar15.B(u1Var2);
                Object objQ19 = mVar15.q();
                if (zB11) {
                    ca0.s2 s2Var = new ca0.s2(m0Var7, iVarA, u1Var2, p1VarC3, null);
                    mVar15.K(s2Var);
                    objQ19 = s2Var;
                } else {
                    aVar.getClass();
                    if (objQ19 == p3.m.a.f135155b) {
                        ca0.s2 s2Var2 = new ca0.s2(m0Var7, iVarA, u1Var2, p1VarC3, null);
                        mVar15.K(s2Var2);
                        objQ19 = s2Var2;
                    }
                }
                l0.e((e23.p) objQ19, bVar8, mVar15);
                return Unit.INSTANCE;
            case 14:
                ca0.u1 u1Var3 = (ca0.u1) obj18;
                m0 m0Var8 = (m0) obj17;
                lc.v vVar10 = (lc.v) obj2;
                p3.m mVar16 = (p3.m) obj3;
                ((Integer) obj4).intValue();
                ((r1.l) obj).getClass();
                vVar10.getClass();
                x1 x1Var15 = p3.n.f135158a;
                sa0.n nVarA = f4.a(vVar10, (e23.a) obj16, m0Var8, mVar16);
                p1 p1VarC4 = s9.c.c(nVarA.f158213d, mVar16);
                sa0.n.b bVar9 = (sa0.n.b) p1VarC4.getF182175a();
                boolean z26 = ((sa0.n.b) p1VarC4.getF182175a()).f158215b;
                boolean zB12 = mVar16.B(u1Var3);
                Object objQ20 = mVar16.q();
                if (zB12) {
                    objQ20 = new e4(u1Var3, 0);
                    mVar16.K(objQ20);
                } else {
                    aVar.getClass();
                    if (objQ20 == p3.m.a.f135155b) {
                        objQ20 = new e4(u1Var3, 0);
                        mVar16.K(objQ20);
                    }
                }
                e23.a aVar13 = (e23.a) objQ20;
                boolean zR9 = mVar16.r(m0Var8);
                Object objQ21 = mVar16.q();
                if (zR9) {
                    objQ21 = new u0(m0Var8, 20);
                    mVar16.K(objQ21);
                } else {
                    aVar.getClass();
                    if (objQ21 == p3.m.a.f135155b) {
                        objQ21 = new u0(m0Var8, 20);
                        mVar16.K(objQ21);
                    }
                }
                sa0.l.b(bVar9, nVarA, z26, aVar13, (e23.a) objQ21, mVar16, 0);
                return Unit.INSTANCE;
            case 15:
                g81.f fVar = (g81.f) obj18;
                m92.p0 p0Var = (m92.p0) obj17;
                e23.a aVar14 = (e23.a) obj16;
                int iIntValue7 = ((Integer) obj2).intValue();
                p3.m mVar17 = (p3.m) obj3;
                ((Integer) obj4).getClass();
                ((c0) obj).getClass();
                x1 x1Var16 = p3.n.f135158a;
                if (iIntValue7 == 0) {
                    mVar17.C(61015033);
                    d81.h0.c(fVar.f76320a, p0Var, aVar14, mVar17, 0);
                    mVar17.f();
                } else {
                    mVar17.C(61024093);
                    d81.h0.c(fVar.f76321b, p0Var, aVar14, mVar17, 0);
                    mVar17.f();
                }
                return Unit.INSTANCE;
            case 16:
                zs.c cVar2 = (zs.c) obj18;
                m0 m0Var9 = (m0) obj17;
                e23.a aVar15 = (e23.a) obj16;
                p3.m mVar18 = (p3.m) obj3;
                ((Integer) obj4).getClass();
                ((r1.l) obj).getClass();
                ((lc.v) obj2).getClass();
                x1 x1Var17 = p3.n.f135158a;
                vs.d dVar8 = (vs.d) cVar2.f206795k.getValue();
                if (dVar8 == null || (str = dVar8.f179703a) == null) {
                    str = "";
                }
                String str6 = str;
                String strF = ((ws.a) KoinJavaComponent.get$default(ws.a.class, null, null, 6, null)).f();
                int iF = ((c22.o) KoinJavaComponent.get$default(c22.o.class, null, null, 6, null)).f();
                if (iF <= 120) {
                    str2 = p3.LDPI.f23201a;
                } else if (iF <= 160) {
                    str2 = p3.MDPI.f23201a;
                } else if (iF <= 240) {
                    str2 = p3.HDPI.f23201a;
                } else if (iF <= 320) {
                    str2 = p3.XHDPI.f23201a;
                } else {
                    str2 = (iF > 480 && iF <= 640) ? p3.XXXHDPI.f23201a : p3.XXHDPI.f23201a;
                }
                String strH = com.nimbusds.jose.shaded.gson.internal.a.h(strF, "/images/activities/", str2, "/activity_recording.png");
                boolean zR10 = mVar18.r(cVar2);
                Object objQ22 = mVar18.q();
                if (zR10) {
                    objQ22 = new dt.d(cVar2, z17 ? 1 : 0);
                    mVar18.K(objQ22);
                } else {
                    aVar.getClass();
                    if (objQ22 == p3.m.a.f135155b) {
                        objQ22 = new dt.d(cVar2, z17 ? 1 : 0);
                        mVar18.K(objQ22);
                    }
                }
                e23.a aVar16 = (e23.a) objQ22;
                boolean zR11 = mVar18.r(m0Var9) | mVar18.B(aVar15);
                Object objQ23 = mVar18.q();
                if (zR11) {
                    objQ23 = new dt.b(m0Var9, aVar15, 1);
                    mVar18.K(objQ23);
                } else {
                    aVar.getClass();
                    if (objQ23 == p3.m.a.f135155b) {
                        objQ23 = new dt.b(m0Var9, aVar15, 1);
                        mVar18.K(objQ23);
                    }
                }
                e23.a aVar17 = (e23.a) objQ23;
                boolean zR12 = mVar18.r(m0Var9);
                Object objQ24 = mVar18.q();
                if (zR12) {
                    objQ24 = new u0(m0Var9, 23);
                    mVar18.K(objQ24);
                } else {
                    aVar.getClass();
                    if (objQ24 == p3.m.a.f135155b) {
                        objQ24 = new u0(m0Var9, 23);
                        mVar18.K(objQ24);
                    }
                }
                et.a.a(str6, strH, aVar16, aVar17, (e23.a) objQ24, mVar18, 0);
                return Unit.INSTANCE;
            case 17:
                return a(obj, obj2, obj3, obj4);
            case 18:
                pt1.a0 a0Var = (pt1.a0) obj18;
                p1 p1Var = (p1) obj17;
                e23.l lVar11 = (e23.l) obj16;
                ((Integer) obj2).getClass();
                p3.m mVar19 = (p3.m) obj3;
                int iIntValue8 = ((Integer) obj4).intValue();
                ((e2.d) obj).getClass();
                if (mVar19.n(iIntValue8 & 1, (iIntValue8 & 129) != 128)) {
                    x1 x1Var18 = p3.n.f135158a;
                    h4.r.a aVar18 = h4.r.S;
                    h4.r rVarE = u1.n.e(x2.j(x2.f(aVar18, 1.0f), 0.0f, gl.b.q(mVar19, R.dimen.review_sort_header_max_height), 1), tn.k.a(d92.b.f58623a, mVar19), m1.f128891a);
                    h4.d.f81522a.getClass();
                    z0 z0VarD2 = c2.q.d(h4.d.a.f81524b, false);
                    int iHashCode2 = Long.hashCode(mVar19.getU());
                    i2 i2VarX2 = mVar19.x();
                    h4.r rVarC2 = h4.k.c(rVarE, mVar19);
                    h5.g.V.getClass();
                    e0.a aVar19 = h5.g.a.f81805b;
                    if (mVar19.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar19.z();
                    if (mVar19.getT()) {
                        mVar19.M(aVar19);
                    } else {
                        mVar19.c();
                    }
                    b4.c(h5.g.a.f81810g, z0VarD2, mVar19);
                    b4.c(h5.g.a.f81809f, i2VarX2, mVar19);
                    h5.g.a.b bVar10 = h5.g.a.f81813j;
                    if (mVar19.getT() || !p005kotlin.jvm.internal.s.g(mVar19.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar19, iHashCode2, bVar10);
                    }
                    b4.c(h5.g.a.f81807d, rVarC2, mVar19);
                    et1.q2.a(c2.u.f22885a.c(aVar18, h4.d.a.f81529g), a0Var.f140807e, us1.o.f172455h, p1Var, lVar11, mVar19, 3072);
                    mVar19.y();
                } else {
                    mVar19.e();
                }
                return Unit.INSTANCE;
            case 19:
                return b(obj, obj2, obj3, obj4);
            case 20:
                fe1.n nVar2 = (fe1.n) obj18;
                n82.f fVar2 = (n82.f) obj17;
                p1 p1Var2 = (p1) obj16;
                o82.g gVar2 = (o82.g) obj;
                o82.a aVar20 = (o82.a) obj2;
                p3.m mVar20 = (p3.m) obj3;
                int iD = vb.h.d((Integer) obj4, gVar2, aVar20);
                if ((iD & 6) == 0) {
                    i14 = (mVar20.k(gVar2.ordinal()) ? 4 : 2) | iD;
                } else {
                    i14 = iD;
                }
                if ((iD & 48) == 0) {
                    i14 |= mVar20.B(aVar20) ? 32 : 16;
                }
                if (mVar20.n(i14 & 1, (i14 & 147) != 146)) {
                    x1 x1Var19 = p3.n.f135158a;
                    int i24 = fe1.m.a.f70556a[gVar2.ordinal()];
                    if (i24 == 1) {
                        mVar20.C(-1505802691);
                        u82.e.b(aVar20, nVar2.f70563g, null, false, z3.f.c(875527086, new ao1.f(9, aVar20, nVar2), mVar20), mVar20, ((i14 >> 3) & 14) | 24576, 12);
                        mVar20.f();
                    } else if (i24 == 2 || i24 == 3) {
                        mVar20.C(-1505377216);
                        u82.e.b(aVar20, nVar2.f70564h, null, false, z3.f.c(-2030405915, new r(aVar20, 21, fVar2, p1Var2), mVar20), mVar20, ((i14 >> 3) & 14) | 27648, 4);
                        mVar20.f();
                    } else {
                        mVar20.C(1475478922);
                        mVar20.f();
                    }
                } else {
                    mVar20.e();
                }
                return Unit.INSTANCE;
            case 21:
                o82.a aVar21 = (o82.a) obj18;
                n82.f fVar3 = (n82.f) obj17;
                u82.f fVar4 = (u82.f) obj2;
                p3.m mVar21 = (p3.m) obj3;
                ((Integer) obj4).getClass();
                ((c2.t) obj).getClass();
                fVar4.getClass();
                x1 x1Var20 = p3.n.f135158a;
                Integer num = ((fe1.o) ((p1) obj16).getF182175a()).f70583e;
                int iIntValue9 = num != null ? num.intValue() : 0;
                List list3 = (List) fVar4.a();
                b63.o oVar = aVar21.f130843a;
                b63.o oVar2 = aVar21.f130844b;
                boolean zB13 = mVar21.B(fVar3);
                Object objQ25 = mVar21.q();
                if (zB13) {
                    objQ25 = new d52.k(fVar3, 1);
                    mVar21.K(objQ25);
                } else {
                    aVar.getClass();
                    if (objQ25 == p3.m.a.f135155b) {
                        objQ25 = new d52.k(fVar3, 1);
                        mVar21.K(objQ25);
                    }
                }
                me1.e.a(list3, iIntValue9, oVar, oVar2, (e23.l) objQ25, mVar21, 0);
                return Unit.INSTANCE;
            case 22:
                return c(obj, obj2, obj3, obj4);
            case 23:
                return d(obj, obj2, obj3, obj4);
            case 24:
                return e(obj, obj2, obj3, obj4);
            case 25:
                return f(obj, obj2, obj3, obj4);
            case 26:
                return g(obj, obj2, obj3, obj4);
            case 27:
                return h(obj, obj2, obj3, obj4);
            case 28:
                return i(obj, obj2, obj3, obj4);
            default:
                final qo0.a aVar22 = (qo0.a) obj18;
                final n82.f fVar5 = (n82.f) obj17;
                e23.l lVar12 = (e23.l) obj16;
                o82.g gVar3 = (o82.g) obj;
                final o82.a aVar23 = (o82.a) obj2;
                p3.m mVar22 = (p3.m) obj3;
                int iD2 = vb.h.d((Integer) obj4, gVar3, aVar23);
                if ((iD2 & 6) == 0) {
                    i15 = (mVar22.k(gVar3.ordinal()) ? 4 : 2) | iD2;
                } else {
                    i15 = iD2;
                }
                if ((iD2 & 48) == 0) {
                    i15 |= mVar22.B(aVar23) ? 32 : 16;
                }
                if (mVar22.n(i15 & 1, (i15 & 147) != 146)) {
                    x1 x1Var21 = p3.n.f135158a;
                    int i25 = ho0.m.f.f84779a[gVar3.ordinal()];
                    if (i25 == 1) {
                        mVar22.C(1127367406);
                        u82.e.b(aVar23, aVar22.f145928m, u1.n.e(h4.r.S, tn.k.a(d92.b.f58623a, mVar22), m1.f128891a), false, z3.f.c(1060314251, new d0(fVar5, aVar23, aVar22, false, lVar12, 23), mVar22), mVar22, ((i15 >> 3) & 14) | 24576, 8);
                        mVar22.f();
                    } else if (i25 == 2 || i25 == 3) {
                        mVar22.C(1128693896);
                        u82.a aVar24 = aVar22.f145929n;
                        h4.r rVarE2 = u1.n.e(h4.r.S, tn.k.a(d92.b.f58623a, mVar22), m1.f128891a);
                        final int i26 = z17 ? 1 : 0;
                        u82.e.b(aVar23, aVar24, rVarE2, false, z3.f.c(-1064282942, new e23.r() { // from class: ho0.k
                            /* JADX WARN: Code duplicated, block: B:13:0x0078  */
                            /* JADX WARN: Code duplicated, block: B:20:0x00b9  */
                            /* JADX WARN: Code duplicated, block: B:25:0x00ec  */
                            /* JADX WARN: Code duplicated, block: B:8:0x0045  */
                            @Override // e23.r
                            public final Object invoke(Object obj19, Object obj20, Object obj21, Object obj22) {
                                int i27 = i26;
                                p3.m.a aVar25 = p3.m.f135153a;
                                t tVar = (t) obj19;
                                u82.f fVar6 = (u82.f) obj20;
                                p3.m mVar23 = (p3.m) obj21;
                                ((Integer) obj22).intValue();
                                switch (i27) {
                                    case 0:
                                        tVar.getClass();
                                        fVar6.getClass();
                                        x1 x1Var22 = n.f135158a;
                                        n82.f fVar7 = fVar5;
                                        boolean zB14 = mVar23.B(fVar7);
                                        o82.a aVar26 = aVar23;
                                        boolean zB15 = zB14 | mVar23.B(aVar26);
                                        qo0.a aVar27 = aVar22;
                                        boolean zR13 = zB15 | mVar23.r(aVar27) | mVar23.r(fVar6);
                                        Object objQ26 = mVar23.q();
                                        if (zR13) {
                                            m.c cVar3 = new m.c(fVar7, aVar26, aVar27, fVar6, null);
                                            mVar23.K(cVar3);
                                            objQ26 = cVar3;
                                        } else {
                                            aVar25.getClass();
                                            if (objQ26 == p3.m.a.f135155b) {
                                                m.c cVar4 = new m.c(fVar7, aVar26, aVar27, fVar6, null);
                                                mVar23.K(cVar4);
                                                objQ26 = cVar4;
                                            }
                                        }
                                        l0.e((p) objQ26, fVar6, mVar23);
                                        co0.c cVar5 = (co0.c) fVar6.a();
                                        LocalDate localDateH = g22.l.h(aVar26.f130843a);
                                        LocalDate localDateH2 = g22.l.h(aVar26.f130844b);
                                        boolean zB16 = mVar23.B(fVar7);
                                        Object objQ27 = mVar23.q();
                                        if (zB16) {
                                            objQ27 = new d52.k(fVar7, 6);
                                            mVar23.K(objQ27);
                                        } else {
                                            aVar25.getClass();
                                            if (objQ27 == p3.m.a.f135155b) {
                                                objQ27 = new d52.k(fVar7, 6);
                                                mVar23.K(objQ27);
                                            }
                                        }
                                        po0.g.a(cVar5, localDateH, localDateH2, (e23.l) objQ27, mVar23, 0);
                                        break;
                                    default:
                                        tVar.getClass();
                                        fVar6.getClass();
                                        x1 x1Var23 = n.f135158a;
                                        n82.f fVar8 = fVar5;
                                        boolean zB17 = mVar23.B(fVar8);
                                        o82.a aVar28 = aVar23;
                                        boolean zB18 = zB17 | mVar23.B(aVar28);
                                        qo0.a aVar29 = aVar22;
                                        boolean zR14 = zB18 | mVar23.r(aVar29) | mVar23.r(fVar6);
                                        Object objQ28 = mVar23.q();
                                        if (zR14) {
                                            m.d dVar9 = new m.d(fVar8, aVar28, aVar29, fVar6, null);
                                            mVar23.K(dVar9);
                                            objQ28 = dVar9;
                                        } else {
                                            aVar25.getClass();
                                            if (objQ28 == p3.m.a.f135155b) {
                                                m.d dVar10 = new m.d(fVar8, aVar28, aVar29, fVar6, null);
                                                mVar23.K(dVar10);
                                                objQ28 = dVar10;
                                            }
                                        }
                                        l0.e((p) objQ28, fVar6, mVar23);
                                        co0.c cVar6 = (co0.c) fVar6.a();
                                        LocalDate localDateH3 = g22.l.h(aVar28.f130843a);
                                        LocalDate localDateH4 = g22.l.h(aVar28.f130844b);
                                        boolean zB19 = mVar23.B(fVar8);
                                        Object objQ29 = mVar23.q();
                                        if (zB19) {
                                            objQ29 = new d52.k(fVar8, 5);
                                            mVar23.K(objQ29);
                                        } else {
                                            aVar25.getClass();
                                            if (objQ29 == p3.m.a.f135155b) {
                                                objQ29 = new d52.k(fVar8, 5);
                                                mVar23.K(objQ29);
                                            }
                                        }
                                        po0.h.a(cVar6, localDateH3, localDateH4, (e23.l) objQ29, mVar23, 0);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }, mVar22), mVar22, ((i15 >> 3) & 14) | 24576, 8);
                        mVar22.f();
                    } else if (i25 != 4) {
                        mVar22.C(1699062663);
                        mVar22.f();
                    } else {
                        mVar22.C(1130048007);
                        u82.a aVar25 = aVar22.f145930o;
                        h4.r rVarE3 = u1.n.e(h4.r.S, tn.k.a(d92.b.f58623a, mVar22), m1.f128891a);
                        final boolean z27 = z16 ? 1 : 0;
                        u82.e.b(aVar23, aVar25, rVarE3, false, z3.f.c(-1653217469, new e23.r() { // from class: ho0.k
                            /* JADX WARN: Code duplicated, block: B:13:0x0078  */
                            /* JADX WARN: Code duplicated, block: B:20:0x00b9  */
                            /* JADX WARN: Code duplicated, block: B:25:0x00ec  */
                            /* JADX WARN: Code duplicated, block: B:8:0x0045  */
                            @Override // e23.r
                            public final Object invoke(Object obj19, Object obj20, Object obj21, Object obj22) {
                                int i27 = z27;
                                p3.m.a aVar26 = p3.m.f135153a;
                                t tVar = (t) obj19;
                                u82.f fVar6 = (u82.f) obj20;
                                p3.m mVar23 = (p3.m) obj21;
                                ((Integer) obj22).intValue();
                                switch (i27) {
                                    case 0:
                                        tVar.getClass();
                                        fVar6.getClass();
                                        x1 x1Var22 = n.f135158a;
                                        n82.f fVar7 = fVar5;
                                        boolean zB14 = mVar23.B(fVar7);
                                        o82.a aVar27 = aVar23;
                                        boolean zB15 = zB14 | mVar23.B(aVar27);
                                        qo0.a aVar28 = aVar22;
                                        boolean zR13 = zB15 | mVar23.r(aVar28) | mVar23.r(fVar6);
                                        Object objQ26 = mVar23.q();
                                        if (zR13) {
                                            m.c cVar4 = new m.c(fVar7, aVar27, aVar28, fVar6, null);
                                            mVar23.K(cVar4);
                                            objQ26 = cVar4;
                                        } else {
                                            aVar26.getClass();
                                            if (objQ26 == p3.m.a.f135155b) {
                                                m.c cVar5 = new m.c(fVar7, aVar27, aVar28, fVar6, null);
                                                mVar23.K(cVar5);
                                                objQ26 = cVar5;
                                            }
                                        }
                                        l0.e((p) objQ26, fVar6, mVar23);
                                        co0.c cVar6 = (co0.c) fVar6.a();
                                        LocalDate localDateH = g22.l.h(aVar27.f130843a);
                                        LocalDate localDateH2 = g22.l.h(aVar27.f130844b);
                                        boolean zB16 = mVar23.B(fVar7);
                                        Object objQ27 = mVar23.q();
                                        if (zB16) {
                                            objQ27 = new d52.k(fVar7, 6);
                                            mVar23.K(objQ27);
                                        } else {
                                            aVar26.getClass();
                                            if (objQ27 == p3.m.a.f135155b) {
                                                objQ27 = new d52.k(fVar7, 6);
                                                mVar23.K(objQ27);
                                            }
                                        }
                                        po0.g.a(cVar6, localDateH, localDateH2, (e23.l) objQ27, mVar23, 0);
                                        break;
                                    default:
                                        tVar.getClass();
                                        fVar6.getClass();
                                        x1 x1Var23 = n.f135158a;
                                        n82.f fVar8 = fVar5;
                                        boolean zB17 = mVar23.B(fVar8);
                                        o82.a aVar29 = aVar23;
                                        boolean zB18 = zB17 | mVar23.B(aVar29);
                                        qo0.a aVar210 = aVar22;
                                        boolean zR14 = zB18 | mVar23.r(aVar210) | mVar23.r(fVar6);
                                        Object objQ28 = mVar23.q();
                                        if (zR14) {
                                            m.d dVar10 = new m.d(fVar8, aVar29, aVar210, fVar6, null);
                                            mVar23.K(dVar10);
                                            objQ28 = dVar10;
                                        } else {
                                            aVar26.getClass();
                                            if (objQ28 == p3.m.a.f135155b) {
                                                m.d dVar11 = new m.d(fVar8, aVar29, aVar210, fVar6, null);
                                                mVar23.K(dVar11);
                                                objQ28 = dVar11;
                                            }
                                        }
                                        l0.e((p) objQ28, fVar6, mVar23);
                                        co0.c cVar7 = (co0.c) fVar6.a();
                                        LocalDate localDateH3 = g22.l.h(aVar29.f130843a);
                                        LocalDate localDateH4 = g22.l.h(aVar29.f130844b);
                                        boolean zB19 = mVar23.B(fVar8);
                                        Object objQ29 = mVar23.q();
                                        if (zB19) {
                                            objQ29 = new d52.k(fVar8, 5);
                                            mVar23.K(objQ29);
                                        } else {
                                            aVar26.getClass();
                                            if (objQ29 == p3.m.a.f135155b) {
                                                objQ29 = new d52.k(fVar8, 5);
                                                mVar23.K(objQ29);
                                            }
                                        }
                                        po0.h.a(cVar7, localDateH3, localDateH4, (e23.l) objQ29, mVar23, 0);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }, mVar22), mVar22, ((i15 >> 3) & 14) | 24576, 8);
                        mVar22.f();
                    }
                } else {
                    mVar22.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ r(Object obj, int i14, Object obj2, Object obj3) {
        this.f2370a = i14;
        this.f2371b = obj;
        this.f2372c = obj2;
        this.f2373d = obj3;
    }
}
