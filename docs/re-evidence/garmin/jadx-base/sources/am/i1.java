package am;

import android.app.Activity;
import android.content.Context;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.follow.domain.FriendDiscoverActivity;
import com.garmin.android.apps.connectmobile.workouts.presentation.details.doworkout.StartWorkoutCapableDeviceSelectionActivity;
import ew1.e3;
import i3.i7;
import i3.mh;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import l72.p2;
import l72.y2;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Unit;
import p3.b4;
import v62.j5;
import v62.r6;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class i1 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f4020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4021c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f4022d;

    public /* synthetic */ i1(boolean z14, i53.c cVar, e23.p pVar, int i14) {
        this.f4019a = 26;
        this.f4020b = z14;
        this.f4022d = cVar;
        this.f4021c = pVar;
    }

    private final Object a(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        int iT = p3.p0.t(433);
        mc1.i.b((h4.r) this.f4022d, this.f4020b, (z3.e) this.f4021c, (p3.m) obj, iT);
        return Unit.INSTANCE;
    }

    private final Object b(Object obj, Object obj2) {
        long jF;
        kw0.f fVar = (kw0.f) this.f4022d;
        pv0.r rVar = (pv0.r) this.f4021c;
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            ArrayList arrayList = new ArrayList();
            boolean z14 = this.f4020b;
            if (z14) {
                mVar.C(1511429003);
                List<kw0.a> list = fVar.f106949f;
                if (list != null && !list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            mVar.C(1511713831);
                            mVar.f();
                            break;
                        }
                        if (gl1.d.H((kw0.a) it.next())) {
                            mVar.C(1511456283);
                            String strQ = gl1.y.Q(mVar, R.string.lbl_yes);
                            bw0.a aVar = bw0.a.f21562a;
                            pv0.s sVar = pv0.s.YES;
                            aVar.getClass();
                            arrayList.add(new j82.f(strQ, new j82.g.a(bw0.a.a(sVar, mVar), null), null, 4, null));
                            mVar.f();
                            break;
                        }
                    }
                } else {
                    mVar.C(1511713831);
                    mVar.f();
                    break;
                }
                if (list != null && !list.isEmpty()) {
                    Iterator<T> it3 = list.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            mVar.C(1512025319);
                            mVar.f();
                            break;
                        }
                        if (!gl1.d.H((kw0.a) it3.next())) {
                            mVar.C(1511768732);
                            String strQ2 = gl1.y.Q(mVar, R.string.lbl_no);
                            bw0.a aVar2 = bw0.a.f21562a;
                            pv0.s sVar2 = pv0.s.NO;
                            aVar2.getClass();
                            arrayList.add(new j82.f(strQ2, new j82.g.f(bw0.a.a(sVar2, mVar), null), null, 4, null));
                            mVar.f();
                            break;
                        }
                    }
                } else {
                    mVar.C(1512025319);
                    mVar.f();
                    break;
                }
                if (list != null && !list.isEmpty()) {
                    Iterator<T> it4 = list.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            mVar.C(1512341767);
                            mVar.f();
                            break;
                        }
                        kw0.a aVar3 = (kw0.a) it4.next();
                        aVar3.getClass();
                        if (aVar3.f106904b == null) {
                            mVar.C(1512079414);
                            String strQ3 = gl1.y.Q(mVar, R.string.lbl_missing_log);
                            bw0.a.f21562a.getClass();
                            arrayList.add(new j82.f(strQ3, new j82.g.p(bw0.a.a(null, mVar), null), null, 4, null));
                            mVar.f();
                            break;
                        }
                    }
                } else {
                    mVar.C(1512341767);
                    mVar.f();
                    break;
                }
                mVar.f();
            } else {
                mVar.C(1512347719);
                mVar.f();
            }
            if (z14) {
                mVar.C(880071497);
                bw0.a.C0329a.f21563a.getClass();
                p3.x1 x1Var2 = p3.n.f135158a;
                gl.c.f77766a.getClass();
                jF = gl.c.a(mVar).g();
            } else {
                mVar.C(880073065);
                bw0.a.c.f21565a.getClass();
                p3.x1 x1Var3 = p3.n.f135158a;
                gl.c.f77766a.getClass();
                jF = gl.c.a(mVar).f();
            }
            mVar.f();
            j82.g.l lVar = new j82.g.l(jF, null);
            if (gl1.d.E(fVar)) {
                mVar.C(1512607282);
                if (rVar == pv0.r.OVERNIGHT_HRV) {
                    mVar.C(1512655301);
                    String strQ4 = gl1.y.Q(mVar, R.string.ohrv_baseline);
                    bw0.a.C0329a.f21563a.getClass();
                    gl.c.f77766a.getClass();
                    arrayList.add(new j82.f(strQ4, new j82.g.a(gl.c.a(mVar).g(), null), null, 4, null));
                    arrayList.add(new j82.f(gl1.y.Q(mVar, R.string.overnight_avg), lVar, null, 4, null));
                    mVar.f();
                } else {
                    mVar.C(1513132763);
                    zv0.d dVar = zv0.d.f207169a;
                    l22.a aVarS = w2.a0.s(mVar);
                    dVar.getClass();
                    arrayList.add(new j82.f(zv0.d.b(rVar, aVarS), lVar, null, 4, null));
                    mVar.f();
                }
                mVar.f();
            } else {
                mVar.C(1513396263);
                mVar.f();
            }
            i53.c cVarE = i53.a.e(p13.h0.b1(arrayList));
            h4.r.a aVar4 = h4.r.S;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            j82.e.h(cVarE, c2.l.A(aVar4, j92.b.f97899b.f97918c, 0.0f, 2), null, mVar, 0, 4);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object c(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        int iT = p3.p0.t(1);
        n40.n.b(this.f4020b, (i53.c) this.f4022d, (e23.p) this.f4021c, (p3.m) obj, iT);
        return Unit.INSTANCE;
    }

    private final Object d(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        int iT = p3.p0.t(1);
        ok0.s.a((ok0.t.b) this.f4022d, this.f4020b, (e23.a) this.f4021c, (p3.m) obj, iT);
        return Unit.INSTANCE;
    }

    private final Object e(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        com.garmin.android.apps.connectmobile.training.itp.a.C0880a c0880a = com.garmin.android.apps.connectmobile.training.itp.a.f45600c;
        int iT = p3.p0.t(1);
        ((com.garmin.android.apps.connectmobile.training.itp.a) this.f4022d).u6((vw1.e) this.f4021c, this.f4020b, (p3.m) obj, iT);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:108:0x039d  */
    /* JADX WARN: Code duplicated, block: B:123:0x0400  */
    /* JADX WARN: Code duplicated, block: B:133:0x0468  */
    /* JADX WARN: Code duplicated, block: B:13:0x0067  */
    /* JADX WARN: Code duplicated, block: B:143:0x04dc  */
    /* JADX WARN: Code duplicated, block: B:153:0x054c  */
    /* JADX WARN: Code duplicated, block: B:269:0x095d  */
    /* JADX WARN: Code duplicated, block: B:272:0x098f  */
    /* JADX WARN: Code duplicated, block: B:274:0x0998  */
    /* JADX WARN: Code duplicated, block: B:275:0x099c  */
    /* JADX WARN: Code duplicated, block: B:280:0x09b9  */
    /* JADX WARN: Code duplicated, block: B:283:0x09e9  */
    /* JADX WARN: Code duplicated, block: B:285:0x09f2  */
    /* JADX WARN: Code duplicated, block: B:286:0x09f6  */
    /* JADX WARN: Code duplicated, block: B:291:0x0a13  */
    /* JADX WARN: Code duplicated, block: B:294:0x0a91  */
    /* JADX WARN: Code duplicated, block: B:295:0x0a93  */
    /* JADX WARN: Code duplicated, block: B:297:0x0a96  */
    /* JADX WARN: Code duplicated, block: B:301:0x0ad2  */
    /* JADX WARN: Code duplicated, block: B:304:0x0b3f  */
    /* JADX WARN: Code duplicated, block: B:306:0x0b48  */
    /* JADX WARN: Code duplicated, block: B:307:0x0b4c  */
    /* JADX WARN: Code duplicated, block: B:312:0x0b69  */
    /* JADX WARN: Code duplicated, block: B:315:0x0b95  */
    /* JADX WARN: Code duplicated, block: B:317:0x0b9e  */
    /* JADX WARN: Code duplicated, block: B:318:0x0ba2  */
    /* JADX WARN: Code duplicated, block: B:323:0x0bbf  */
    /* JADX WARN: Code duplicated, block: B:326:0x0c23  */
    /* JADX WARN: Code duplicated, block: B:327:0x0c28  */
    /* JADX WARN: Code duplicated, block: B:329:0x0c2c  */
    /* JADX WARN: Code duplicated, block: B:330:0x0c2f  */
    /* JADX WARN: Code duplicated, block: B:335:0x0c4d  */
    /* JADX WARN: Code duplicated, block: B:338:0x0c54  */
    /* JADX WARN: Code duplicated, block: B:339:0x0c79  */
    /* JADX WARN: Code duplicated, block: B:341:0x0c89  */
    /* JADX WARN: Code duplicated, block: B:343:0x0c8f  */
    /* JADX WARN: Code duplicated, block: B:345:0x0c95  */
    /* JADX WARN: Code duplicated, block: B:347:0x0c9b  */
    /* JADX WARN: Code duplicated, block: B:66:0x0234  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, o13.l] */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        float f14;
        h5.g.a.f fVar;
        Object objQ;
        p3.m.a.C2565a c2565a;
        s2 s2VarA;
        int iHashCode;
        p3.i2 i2VarX;
        h4.r rVarC;
        u2 u2Var;
        h4.g.a aVar;
        c2.z zVarA;
        int iHashCode2;
        p3.i2 i2VarX2;
        h4.r rVarC2;
        float f15;
        g6.o oVar;
        float f16;
        boolean zK;
        Object objQ2;
        j92.e eVar;
        s2 s2VarA2;
        int iHashCode3;
        p3.i2 i2VarX3;
        h4.r rVarC3;
        c2.z zVarA2;
        int iHashCode4;
        p3.i2 i2VarX4;
        h4.r rVarC4;
        ck0.c cVar;
        b63.o oVar2;
        boolean z14;
        String str;
        String str2;
        String str3;
        int i14;
        int i15;
        u4.d dVarA;
        long jA;
        int i16 = this.f4019a;
        int i17 = 4;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        p3.m.a aVar2 = p3.m.f135153a;
        boolean z15 = this.f4020b;
        Object obj3 = this.f4021c;
        ?? r14 = this.f4022d;
        switch (i16) {
            case 0:
                ((Integer) obj2).getClass();
                p1.a((x0) r14, z15, (e23.a) obj3, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                bg2.c.b((bg2.h) r14, z15, (e23.a) obj3, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                bk0.j.a((bk0.g) r14, z15, (e23.l) obj3, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                bv1.y.d((iw1.a) r14, z15, (Activity) obj3, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 4:
                c2.a0 a0Var = (c2.a0) r14;
                String str4 = (String) obj3;
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    r1.c0.c(a0Var, z15 && str4 != null, null, null, null, null, z3.f.c(-1731534045, new as.s(str4, i17), mVar), mVar, 1572864, 30);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 5:
                g6.o oVar3 = (g6.o) r14;
                ck0.t tVar = (ck0.t) obj3;
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    p3.x1 x1Var2 = p3.n.f135158a;
                    h4.r.a aVar3 = h4.r.S;
                    h4.r rVarO = c2.l.o(aVar3, c2.q1.Min);
                    h4.d.f81522a.getClass();
                    f5.z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
                    int iHashCode5 = Long.hashCode(mVar2.getU());
                    p3.i2 i2VarX5 = mVar2.x();
                    h4.r rVarC5 = h4.k.c(rVarO, mVar2);
                    h5.g.V.getClass();
                    h5.e0.a aVar4 = h5.g.a.f81805b;
                    if (mVar2.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar4);
                    } else {
                        mVar2.c();
                    }
                    h5.g.a.e eVar2 = h5.g.a.f81810g;
                    b4.c(eVar2, z0VarD, mVar2);
                    h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                    b4.c(c1623g, i2VarX5, mVar2);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar2.getT()) {
                        f14 = 0.0f;
                    } else {
                        f14 = 0.0f;
                        if (!p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode5))) {
                        }
                        fVar = h5.g.a.f81807d;
                        b4.c(fVar, rVarC5, mVar2);
                        c2.u uVar = c2.u.f22885a;
                        objQ = mVar2.q();
                        aVar2.getClass();
                        c2565a = p3.m.a.f135155b;
                        if (objQ == c2565a) {
                            objQ = new ch1.f(6);
                            mVar2.K(objQ);
                        }
                        h4.r rVarC6 = p5.v.c((e23.l) objQ, aVar3, false);
                        c2.j.f22691a.getClass();
                        s2VarA = q2.a(c2.j.f22692b, h4.d.a.f81533k, mVar2, 0);
                        iHashCode = Long.hashCode(mVar2.getU());
                        i2VarX = mVar2.x();
                        rVarC = h4.k.c(rVarC6, mVar2);
                        if (mVar2.F() != null) {
                            p3.p0.l();
                            throw null;
                        }
                        mVar2.z();
                        if (mVar2.getT()) {
                            mVar2.M(aVar4);
                        } else {
                            mVar2.c();
                        }
                        b4.c(eVar2, s2VarA, mVar2);
                        b4.c(c1623g, i2VarX, mVar2);
                        if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                            v.h.z(iHashCode, mVar2, iHashCode, bVar);
                        }
                        b4.c(fVar, rVarC, mVar2);
                        u2Var = u2.f22900a;
                        h4.r rVarA = u2Var.a(aVar3, 1.0f, true);
                        c2.j.k kVar = c2.j.f22694d;
                        aVar = h4.d.a.f81536n;
                        zVarA = c2.y.a(kVar, aVar, mVar2, 0);
                        iHashCode2 = Long.hashCode(mVar2.getU());
                        i2VarX2 = mVar2.x();
                        rVarC2 = h4.k.c(rVarA, mVar2);
                        if (mVar2.F() != null) {
                            p3.p0.l();
                            throw null;
                        }
                        mVar2.z();
                        if (mVar2.getT()) {
                            mVar2.M(aVar4);
                        } else {
                            mVar2.c();
                        }
                        b4.c(eVar2, zVarA, mVar2);
                        b4.c(c1623g, i2VarX2, mVar2);
                        if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode2))) {
                            v.h.z(iHashCode2, mVar2, iHashCode2, bVar);
                        }
                        b4.c(fVar, rVarC2, mVar2);
                        c2.b0 b0Var = c2.b0.f22601a;
                        mVar2.y();
                        t4.d dVarA2 = n5.c.a(R.drawable.device_setup_2_background, mVar2, 0);
                        f5.k.f68985a.getClass();
                        f5.k.a.d dVar = f5.k.a.f68990e;
                        o4.e0.a aVar5 = o4.e0.f128843b;
                        d92.b.f58623a.getClass();
                        o4.r rVarA2 = o4.e0.a.a(aVar5, d92.b.a(mVar2).c().a());
                        o4.w.a aVar6 = o4.w.f129023a;
                        f15 = f14;
                        o13.p[] pVarArr = {new o13.p(Float.valueOf(f14), o4.d0.a(o4.d0.c(f15, d92.b.a(mVar2).e().g(), 14))), new o13.p(Float.valueOf(0.6f), o4.d0.a(d92.b.a(mVar2).e().g()))};
                        oVar = g6.o.Ltr;
                        if (oVar3 == oVar) {
                            f16 = f15;
                        } else {
                            f16 = Float.POSITIVE_INFINITY;
                        }
                        if (oVar3 == oVar) {
                            f15 = Float.POSITIVE_INFINITY;
                        }
                        h4.r rVarA3 = u2Var.a(u1.n.d(aVar3, o4.w.a.c(aVar6, pVarArr, f16, f15, 8), null, 6), 1.0f, true);
                        o4.n0.f128892b.getClass();
                        h4.r rVarC7 = o4.s0.c(rVarA3, 0.0f, 0.0f, 0.0f, 0.0f, null, o4.n0.f128893c, 458751);
                        zK = mVar2.k(oVar3.ordinal());
                        objQ2 = mVar2.q();
                        if (zK || objQ2 == c2565a) {
                            objQ2 = new b41.a(oVar3, 24);
                            mVar2.K(objQ2);
                        }
                        g6.f.a aVar7 = g6.f.f75994b;
                        u1.y0.a(dVarA2, null, x2.h(x2.c(l4.k.f(rVarC7, (e23.l) objQ2), 1.0f), 0), null, dVar, 0.0f, rVarA2, mVar2, 24624, 40);
                        mVar2.y();
                        h4.r rVarX = x2.x(x2.f(aVar3, 1.0f), null, 3);
                        d92.b.f58625c.getClass();
                        eVar = j92.b.f97899b;
                        h4.r rVarY = c2.l.y(rVarX, eVar.f97920e);
                        s2VarA2 = q2.a(c2.j.i(eVar.f97920e), h4.d.a.f81534l, mVar2, 48);
                        iHashCode3 = Long.hashCode(mVar2.getU());
                        i2VarX3 = mVar2.x();
                        rVarC3 = h4.k.c(rVarY, mVar2);
                        if (mVar2.F() != null) {
                            p3.p0.l();
                            throw null;
                        }
                        mVar2.z();
                        if (mVar2.getT()) {
                            mVar2.M(aVar4);
                        } else {
                            mVar2.c();
                        }
                        b4.c(eVar2, s2VarA2, mVar2);
                        b4.c(c1623g, i2VarX3, mVar2);
                        if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode3))) {
                            v.h.z(iHashCode3, mVar2, iHashCode3, bVar);
                        }
                        b4.c(fVar, rVarC3, mVar2);
                        h4.r rVarA4 = u2Var.a(aVar3, 1.0f, true);
                        zVarA2 = c2.y.a(c2.j.f22696f, aVar, mVar2, 6);
                        iHashCode4 = Long.hashCode(mVar2.getU());
                        i2VarX4 = mVar2.x();
                        rVarC4 = h4.k.c(rVarA4, mVar2);
                        if (mVar2.F() != null) {
                            p3.p0.l();
                            throw null;
                        }
                        mVar2.z();
                        if (mVar2.getT()) {
                            mVar2.M(aVar4);
                        } else {
                            mVar2.c();
                        }
                        b4.c(eVar2, zVarA2, mVar2);
                        b4.c(c1623g, i2VarX4, mVar2);
                        if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode4))) {
                            v.h.z(iHashCode4, mVar2, iHashCode4, bVar);
                        }
                        b4.c(fVar, rVarC4, mVar2);
                        String str5 = tVar.f27885c;
                        d92.b.f58624b.getClass();
                        mh.c(str5, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97932i, mVar2), mVar2, 0, 0, 131070);
                        c2.l.f(x2.h(aVar3, eVar.f97917b), mVar2);
                        mh.c(tVar.f27888f, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97930g), mVar2), mVar2, 0, 0, 131070);
                        c2.l.f(x2.h(aVar3, eVar.f97918c), mVar2);
                        cVar = tVar.f27889g;
                        if (cVar != null) {
                            oVar2 = cVar.f27821b;
                        } else {
                            oVar2 = null;
                        }
                        if (cVar != null) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        ck0.p.a(null, oVar2, z14, tVar.f27893k, null, mVar2, 0);
                        mVar2.y();
                        ck0.q qVar = tVar.f27892j;
                        str = qVar.f27878a;
                        if (z15 || (str3 = qVar.f27880c) == null) {
                            str2 = str;
                        } else {
                            str2 = str3;
                        }
                        if (str2 != null) {
                            mVar2.C(1502435047);
                            jf.r.a(str2, null, x2.q(aVar3, 100), null, h4.d.a.f81528f, f5.k.a.f68988c, null, mVar2, 1769904, 1944);
                            mVar2.f();
                        } else {
                            mVar2.C(1502763430);
                            mVar2.f();
                        }
                        mVar2.y();
                        mVar2.y();
                    }
                    v.h.z(iHashCode5, mVar2, iHashCode5, bVar);
                    fVar = h5.g.a.f81807d;
                    b4.c(fVar, rVarC5, mVar2);
                    c2.u uVar2 = c2.u.f22885a;
                    objQ = mVar2.q();
                    aVar2.getClass();
                    c2565a = p3.m.a.f135155b;
                    if (objQ == c2565a) {
                        objQ = new ch1.f(6);
                        mVar2.K(objQ);
                    }
                    h4.r rVarC8 = p5.v.c((e23.l) objQ, aVar3, false);
                    c2.j.f22691a.getClass();
                    s2VarA = q2.a(c2.j.f22692b, h4.d.a.f81533k, mVar2, 0);
                    iHashCode = Long.hashCode(mVar2.getU());
                    i2VarX = mVar2.x();
                    rVarC = h4.k.c(rVarC8, mVar2);
                    if (mVar2.F() != null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar4);
                    } else {
                        mVar2.c();
                    }
                    b4.c(eVar2, s2VarA, mVar2);
                    b4.c(c1623g, i2VarX, mVar2);
                    if (mVar2.getT()) {
                        v.h.z(iHashCode, mVar2, iHashCode, bVar);
                    } else {
                        v.h.z(iHashCode, mVar2, iHashCode, bVar);
                    }
                    b4.c(fVar, rVarC, mVar2);
                    u2Var = u2.f22900a;
                    h4.r rVarA5 = u2Var.a(aVar3, 1.0f, true);
                    c2.j.k kVar2 = c2.j.f22694d;
                    aVar = h4.d.a.f81536n;
                    zVarA = c2.y.a(kVar2, aVar, mVar2, 0);
                    iHashCode2 = Long.hashCode(mVar2.getU());
                    i2VarX2 = mVar2.x();
                    rVarC2 = h4.k.c(rVarA5, mVar2);
                    if (mVar2.F() != null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar4);
                    } else {
                        mVar2.c();
                    }
                    b4.c(eVar2, zVarA, mVar2);
                    b4.c(c1623g, i2VarX2, mVar2);
                    if (mVar2.getT()) {
                        v.h.z(iHashCode2, mVar2, iHashCode2, bVar);
                    } else {
                        v.h.z(iHashCode2, mVar2, iHashCode2, bVar);
                    }
                    b4.c(fVar, rVarC2, mVar2);
                    c2.b0 b0Var2 = c2.b0.f22601a;
                    mVar2.y();
                    t4.d dVarA3 = n5.c.a(R.drawable.device_setup_2_background, mVar2, 0);
                    f5.k.f68985a.getClass();
                    f5.k.a.d dVar2 = f5.k.a.f68990e;
                    o4.e0.a aVar8 = o4.e0.f128843b;
                    d92.b.f58623a.getClass();
                    o4.r rVarA6 = o4.e0.a.a(aVar8, d92.b.a(mVar2).c().a());
                    o4.w.a aVar9 = o4.w.f129023a;
                    f15 = f14;
                    o13.p[] pVarArr2 = {new o13.p(Float.valueOf(f14), o4.d0.a(o4.d0.c(f15, d92.b.a(mVar2).e().g(), 14))), new o13.p(Float.valueOf(0.6f), o4.d0.a(d92.b.a(mVar2).e().g()))};
                    oVar = g6.o.Ltr;
                    if (oVar3 == oVar) {
                        f16 = f15;
                    } else {
                        f16 = Float.POSITIVE_INFINITY;
                    }
                    if (oVar3 == oVar) {
                        f15 = Float.POSITIVE_INFINITY;
                    }
                    h4.r rVarA7 = u2Var.a(u1.n.d(aVar3, o4.w.a.c(aVar9, pVarArr2, f16, f15, 8), null, 6), 1.0f, true);
                    o4.n0.f128892b.getClass();
                    h4.r rVarC9 = o4.s0.c(rVarA7, 0.0f, 0.0f, 0.0f, 0.0f, null, o4.n0.f128893c, 458751);
                    zK = mVar2.k(oVar3.ordinal());
                    objQ2 = mVar2.q();
                    if (zK) {
                        objQ2 = new b41.a(oVar3, 24);
                        mVar2.K(objQ2);
                    } else {
                        objQ2 = new b41.a(oVar3, 24);
                        mVar2.K(objQ2);
                    }
                    g6.f.a aVar10 = g6.f.f75994b;
                    u1.y0.a(dVarA3, null, x2.h(x2.c(l4.k.f(rVarC9, (e23.l) objQ2), 1.0f), 0), null, dVar2, 0.0f, rVarA6, mVar2, 24624, 40);
                    mVar2.y();
                    h4.r rVarX2 = x2.x(x2.f(aVar3, 1.0f), null, 3);
                    d92.b.f58625c.getClass();
                    eVar = j92.b.f97899b;
                    h4.r rVarY2 = c2.l.y(rVarX2, eVar.f97920e);
                    s2VarA2 = q2.a(c2.j.i(eVar.f97920e), h4.d.a.f81534l, mVar2, 48);
                    iHashCode3 = Long.hashCode(mVar2.getU());
                    i2VarX3 = mVar2.x();
                    rVarC3 = h4.k.c(rVarY2, mVar2);
                    if (mVar2.F() != null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar4);
                    } else {
                        mVar2.c();
                    }
                    b4.c(eVar2, s2VarA2, mVar2);
                    b4.c(c1623g, i2VarX3, mVar2);
                    if (mVar2.getT()) {
                        v.h.z(iHashCode3, mVar2, iHashCode3, bVar);
                    } else {
                        v.h.z(iHashCode3, mVar2, iHashCode3, bVar);
                    }
                    b4.c(fVar, rVarC3, mVar2);
                    h4.r rVarA8 = u2Var.a(aVar3, 1.0f, true);
                    zVarA2 = c2.y.a(c2.j.f22696f, aVar, mVar2, 6);
                    iHashCode4 = Long.hashCode(mVar2.getU());
                    i2VarX4 = mVar2.x();
                    rVarC4 = h4.k.c(rVarA8, mVar2);
                    if (mVar2.F() != null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar4);
                    } else {
                        mVar2.c();
                    }
                    b4.c(eVar2, zVarA2, mVar2);
                    b4.c(c1623g, i2VarX4, mVar2);
                    if (mVar2.getT()) {
                        v.h.z(iHashCode4, mVar2, iHashCode4, bVar);
                    } else {
                        v.h.z(iHashCode4, mVar2, iHashCode4, bVar);
                    }
                    b4.c(fVar, rVarC4, mVar2);
                    String str6 = tVar.f27885c;
                    d92.b.f58624b.getClass();
                    mh.c(str6, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97932i, mVar2), mVar2, 0, 0, 131070);
                    c2.l.f(x2.h(aVar3, eVar.f97917b), mVar2);
                    mh.c(tVar.f27888f, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97930g), mVar2), mVar2, 0, 0, 131070);
                    c2.l.f(x2.h(aVar3, eVar.f97918c), mVar2);
                    cVar = tVar.f27889g;
                    if (cVar != null) {
                        oVar2 = cVar.f27821b;
                    } else {
                        oVar2 = null;
                    }
                    if (cVar != null) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    ck0.p.a(null, oVar2, z14, tVar.f27893k, null, mVar2, 0);
                    mVar2.y();
                    ck0.q qVar2 = tVar.f27892j;
                    str = qVar2.f27878a;
                    if (z15) {
                        str2 = str;
                    } else {
                        str2 = str;
                    }
                    if (str2 != null) {
                        mVar2.C(1502435047);
                        jf.r.a(str2, null, x2.q(aVar3, 100), null, h4.d.a.f81528f, f5.k.a.f68988c, null, mVar2, 1769904, 1944);
                        mVar2.f();
                    } else {
                        mVar2.C(1502763430);
                        mVar2.f();
                    }
                    mVar2.y();
                    mVar2.y();
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 6:
                ((Integer) obj2).getClass();
                ck0.u.a((ck0.t) r14, (e23.a) obj3, z15, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 7:
                h4.r rVar = (h4.r) r14;
                i53.f fVar2 = (i53.f) obj3;
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    p3.x1 x1Var3 = p3.n.f135158a;
                    h4.d.f81522a.getClass();
                    h4.g.b bVar2 = h4.d.a.f81534l;
                    c2.j.f22691a.getClass();
                    s2 s2VarA3 = q2.a(c2.j.f22698h, bVar2, mVar3, 54);
                    int iHashCode6 = Long.hashCode(mVar3.getU());
                    p3.i2 i2VarX6 = mVar3.x();
                    h4.r rVarC10 = h4.k.c(rVar, mVar3);
                    h5.g.V.getClass();
                    h5.e0.a aVar11 = h5.g.a.f81805b;
                    if (mVar3.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar3.z();
                    if (mVar3.getT()) {
                        mVar3.M(aVar11);
                    } else {
                        mVar3.c();
                    }
                    b4.c(h5.g.a.f81810g, s2VarA3, mVar3);
                    b4.c(h5.g.a.f81809f, i2VarX6, mVar3);
                    h5.g.a.b bVar3 = h5.g.a.f81813j;
                    if (mVar3.getT() || !p005kotlin.jvm.internal.s.g(mVar3.q(), Integer.valueOf(iHashCode6))) {
                        v.h.z(iHashCode6, mVar3, iHashCode6, bVar3);
                    }
                    b4.c(h5.g.a.f81807d, rVarC10, mVar3);
                    u2 u2Var2 = u2.f22900a;
                    if (z15) {
                        mVar3.C(977509239);
                        String str7 = (String) p13.h0.b0(fVar2);
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        s5.x0 x0Var = j92.f.f97935l;
                        g02.c.a(str7, null, 0L, null, 0, false, 1, d92.c.f(x0Var, mVar3), 0.0d, mVar3, 1572864, 318);
                        g02.c.a((String) p13.h0.m0(fVar2), null, 0L, null, 0, false, 1, d92.c.f(x0Var, mVar3), 0.0d, mVar3, 1572864, 318);
                        mVar3.f();
                    } else {
                        mVar3.C(977905419);
                        String str8 = (String) p13.h0.b0(fVar2);
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        s5.x0 x0Var2 = j92.f.f97935l;
                        mh.c(str8, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(x0Var2, mVar3), mVar3, 0, 0, 131070);
                        mh.c((String) p13.h0.m0(fVar2), null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(x0Var2, mVar3), mVar3, 0, 0, 131070);
                        mVar3.f();
                    }
                    mVar3.y();
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 8:
                ((Integer) obj2).getClass();
                cv0.g.a((ge2.b) r14, z15, (e23.l) obj3, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 9:
                StartWorkoutCapableDeviceSelectionActivity startWorkoutCapableDeviceSelectionActivity = (StartWorkoutCapableDeviceSelectionActivity) obj3;
                p3.m mVar4 = (p3.m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                StartWorkoutCapableDeviceSelectionActivity.a aVar12 = StartWorkoutCapableDeviceSelectionActivity.f48554a;
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    p3.x1 x1Var4 = p3.n.f135158a;
                    p3.p1 p1VarC = p3.p0.c(((d62.h) r14.getValue()).f58015a, mVar4, 0);
                    Object objQ3 = mVar4.q();
                    aVar2.getClass();
                    if (objQ3 == p3.m.a.f135155b) {
                        objQ3 = p3.p0.n(null);
                        mVar4.K(objQ3);
                    }
                    z02.b.a(false, null, null, null, false, z3.f.c(-998761126, new ad0.g(this.f4020b, startWorkoutCapableDeviceSelectionActivity, p1VarC, (p3.p1) objQ3, 7), mVar4), mVar4, 196608, 31);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 10:
                ej0.b bVar4 = (ej0.b) r14;
                yi0.d dVar3 = (yi0.d) obj3;
                p3.m mVar5 = (p3.m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                int i18 = dj0.h.f59916g;
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    p3.x1 x1Var5 = p3.n.f135158a;
                    yi0.b bVar5 = dVar3.f197345a;
                    l22.b bVar6 = bVar4.f64399a;
                    String strA = bVar6.a(R.string.string_space_string_bracket_pattern, z15 ? (String) bVar4.f64401c.getValue() : (String) bVar4.f64402d.getValue(), bVar6.getString(bVar5 == yi0.b.W_PER_KG ? R.string.lbl_watt_kg : R.string.common_watts));
                    oi0.b bVar7 = new oi0.b(bVar6, strA);
                    bVar7.Y();
                    o13.p pVar = new o13.p(strA, bVar7.f132238b);
                    h82.r.f82497a.m(384, 0, (String) pVar.f128594a, (String) pVar.f128595b, mVar5);
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 11:
                ((Integer) obj2).getClass();
                e60.c.a((z20.e) r14, z15, (e23.a) obj3, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 12:
                ((Integer) obj2).getClass();
                ew1.i0.a((androidx.fragment.app.m) r14, z15, (e3) obj3, (p3.m) obj, p3.p0.t(49));
                return Unit.INSTANCE;
            case 13:
                ((Integer) obj2).getClass();
                ew1.e1.a aVar13 = ew1.e1.f66409d;
                ((ew1.e1) r14).w6(z15, (e23.a) obj3, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 14:
                ((Integer) obj2).getClass();
                ew1.u2.a aVar14 = ew1.u2.f66789c;
                ((ew1.u2) r14).w6(z15, (e23.a) obj3, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 15:
                e23.p<? super p3.m, ? super Integer, Unit> pVar2 = (e23.p) r14;
                e23.p<? super p3.m, ? super Integer, Unit> pVar3 = (e23.p) obj3;
                p3.m mVar6 = (p3.m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    p3.x1 x1Var6 = p3.n.f135158a;
                    y2.f111386a.d(this.f4020b, pVar2, pVar3, null, false, mVar6, 24576, 8);
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 16:
                v21.e eVar3 = (v21.e) r14;
                g21.f0 f0Var = (g21.f0) obj3;
                p3.m mVar7 = (p3.m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (mVar7.n(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    p3.x1 x1Var7 = p3.n.f135158a;
                    String strQ = gl1.y.Q(mVar7, R.string.lbl_calories);
                    String strC = eVar3.c(f0Var.f75417a);
                    String strH = eVar3.H(strQ, strC, false);
                    h4.r.a aVar15 = h4.r.S;
                    boolean zB = mVar7.B(strH);
                    Object objQ4 = mVar7.q();
                    if (zB) {
                        objQ4 = new fp0.c(strH, 24);
                        mVar7.K(objQ4);
                    } else {
                        aVar2.getClass();
                        if (objQ4 == p3.m.a.f135155b) {
                            objQ4 = new fp0.c(strH, 24);
                            mVar7.K(objQ4);
                        }
                    }
                    h4.r rVarC11 = p5.v.c((e23.l) objQ4, aVar15, false);
                    c2.q1 q1Var = c2.q1.Max;
                    h4.r rVarE = c2.l.E(rVarC11, q1Var);
                    if (z15) {
                        strQ = sn.a.h(mVar7, 1760052234, R.string.calories_abbreviation, mVar7);
                    } else {
                        mVar7.C(1760147280);
                        mVar7.f();
                    }
                    String str9 = strQ;
                    f02.u.f67749a.getClass();
                    g11.d.a(rVarE, strC, str9, new l72.x0.a(f02.u.b(mVar7), objArr4 == true ? 1 : 0), mVar7, 0);
                    String strQ2 = gl1.y.Q(mVar7, R.string.protein);
                    String strD = v21.e.d(eVar3, f0Var.f75420d, null, 6);
                    String strH2 = eVar3.H(strQ2, strD, true);
                    boolean zB2 = mVar7.B(strH2);
                    Object objQ5 = mVar7.q();
                    if (zB2) {
                        objQ5 = new fp0.c(strH2, 25);
                        mVar7.K(objQ5);
                    } else {
                        aVar2.getClass();
                        if (objQ5 == p3.m.a.f135155b) {
                            objQ5 = new fp0.c(strH2, 25);
                            mVar7.K(objQ5);
                        }
                    }
                    h4.r rVarE2 = c2.l.E(p5.v.c((e23.l) objQ5, aVar15, false), q1Var);
                    String strP = gl1.y.P(R.string.string_space_string_pattern, new Object[]{strD, gl1.y.Q(mVar7, R.string.unit_g)}, mVar7);
                    if (z15) {
                        strQ2 = sn.a.h(mVar7, 1761136459, R.string.protein_abbreviation, mVar7);
                    } else {
                        mVar7.C(1761230513);
                        mVar7.f();
                    }
                    g11.d.a(rVarE2, strP, strQ2, new l72.x0.a(f02.u.g(mVar7), objArr3 == true ? 1 : 0), mVar7, 0);
                    String strQ3 = gl1.y.Q(mVar7, R.string.fat);
                    String strD2 = v21.e.d(eVar3, f0Var.f75419c, null, 6);
                    String strH3 = eVar3.H(strQ3, strD2, true);
                    boolean zB3 = mVar7.B(strH3);
                    Object objQ6 = mVar7.q();
                    if (zB3) {
                        objQ6 = new fp0.c(strH3, 26);
                        mVar7.K(objQ6);
                    } else {
                        aVar2.getClass();
                        if (objQ6 == p3.m.a.f135155b) {
                            objQ6 = new fp0.c(strH3, 26);
                            mVar7.K(objQ6);
                        }
                    }
                    h4.r rVarE3 = c2.l.E(p5.v.c((e23.l) objQ6, aVar15, false), q1Var);
                    String strP2 = gl1.y.P(R.string.string_space_string_pattern, new Object[]{strD2, gl1.y.Q(mVar7, R.string.unit_g)}, mVar7);
                    if (z15) {
                        strQ3 = sn.a.h(mVar7, 1762181903, R.string.fat_abbreviation, mVar7);
                    } else {
                        mVar7.C(1762271989);
                        mVar7.f();
                    }
                    g11.d.a(rVarE3, strP2, strQ3, new l72.x0.a(f02.u.f(mVar7), objArr2 == true ? 1 : 0), mVar7, 0);
                    String strQ4 = gl1.y.Q(mVar7, R.string.carbs);
                    String strD3 = v21.e.d(eVar3, f0Var.f75418b, null, 6);
                    String strH4 = eVar3.H(strQ4, strD3, true);
                    boolean zB4 = mVar7.B(strH4);
                    Object objQ7 = mVar7.q();
                    if (zB4) {
                        objQ7 = new fp0.c(strH4, 27);
                        mVar7.K(objQ7);
                    } else {
                        aVar2.getClass();
                        if (objQ7 == p3.m.a.f135155b) {
                            objQ7 = new fp0.c(strH4, 27);
                            mVar7.K(objQ7);
                        }
                    }
                    h4.r rVarE4 = c2.l.E(p5.v.c((e23.l) objQ7, aVar15, false), q1Var);
                    String strP3 = gl1.y.P(R.string.string_space_string_pattern, new Object[]{strD3, gl1.y.Q(mVar7, R.string.unit_g)}, mVar7);
                    if (z15) {
                        strQ4 = sn.a.h(mVar7, 1763233485, R.string.carbs_abbreviation, mVar7);
                    } else {
                        mVar7.C(1763325555);
                        mVar7.f();
                    }
                    g11.d.a(rVarE4, strP3, strQ4, new l72.x0.a(f02.u.e(mVar7), objArr == true ? 1 : 0), mVar7, 0);
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 17:
                FriendDiscoverActivity friendDiscoverActivity = (FriendDiscoverActivity) r14;
                p003ji0.j jVar = (p003ji0.j) obj3;
                p3.m mVar8 = (p3.m) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                FriendDiscoverActivity.a aVar16 = FriendDiscoverActivity.f35251b;
                if (mVar8.n(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    p3.x1 x1Var8 = p3.n.f135158a;
                    mi0.c cVar2 = (mi0.c) friendDiscoverActivity.f35252a.getValue();
                    boolean zR = mVar8.r(friendDiscoverActivity);
                    Object objQ8 = mVar8.q();
                    if (zR) {
                        objQ8 = new FriendDiscoverActivity.b(friendDiscoverActivity);
                        mVar8.K(objQ8);
                    } else {
                        aVar2.getClass();
                        if (objQ8 == p3.m.a.f135155b) {
                            objQ8 = new FriendDiscoverActivity.b(friendDiscoverActivity);
                            mVar8.K(objQ8);
                        }
                    }
                    ii0.m.a(cVar2, this.f4020b, jVar, (e23.a) objQ8, mVar8, mi0.c.f118707j);
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 18:
                ((Integer) obj2).getClass();
                hq.v.a((hq.k) r14, z15, (String) obj3, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 19:
                h82.r rVar2 = (h82.r) r14;
                Context context = (Context) obj3;
                p3.m mVar9 = (p3.m) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                ic1.i.a aVar17 = ic1.i.f92620g;
                if (mVar9.n(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    p3.x1 x1Var9 = p3.n.f135158a;
                    if (z15) {
                        i14 = 1845527726;
                        i15 = R.string.lbl_value_of_pulse_ox_jpn;
                    } else {
                        i14 = 1845529514;
                        i15 = R.string.lbl_value_of_pulse_ox;
                    }
                    rVar2.s(0, 2, sn.a.h(mVar9, i14, i15, mVar9), null, mVar9);
                    if (z15) {
                        mVar9.C(1376930081);
                        rVar2.q(gl1.y.Q(mVar9, R.string.msg_value_of_pulse_ox_jpn), mVar9, 0);
                        mVar9.f();
                    } else {
                        mVar9.C(1377040937);
                        String strQ5 = gl1.y.Q(mVar9, R.string.msg_value_of_pulse_ox);
                        Object objQ9 = mVar9.q();
                        aVar2.getClass();
                        if (objQ9 == p3.m.a.f135155b) {
                            objQ9 = new ic1.g(1);
                            mVar9.K(objQ9);
                        }
                        rVar2.o(R.string.msg_value_of_pulse_ox, 0, 0, oi0.c.A(context, (e23.l) objQ9, strQ5), mVar9);
                        mVar9.f();
                    }
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 20:
                e23.l lVar = (e23.l) r14;
                u4.d dVar4 = (u4.d) obj3;
                p3.m mVar10 = (p3.m) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (mVar10.n(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    p3.x1 x1Var10 = p3.n.f135158a;
                    s62.a aVar18 = s62.a.f157643a;
                    if (z15) {
                        aVar18.getClass();
                        dVarA = j5.a(t62.b.f162798a);
                    } else {
                        aVar18.getClass();
                        dVarA = r6.a(t62.b.f162798a);
                    }
                    u4.d dVar5 = dVarA;
                    h4.r.a aVar19 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar4 = j92.b.f97899b;
                    h4.r rVarC12 = c2.l.C(aVar19, 0.0f, 0.0f, eVar4.f97918c, 0.0f, 11);
                    j92.c cVar3 = j92.b.f97901d;
                    h4.r rVarQ = x2.q(rVarC12, cVar3.f97904c);
                    boolean zB5 = mVar10.B(lVar) | mVar10.h(z15);
                    Object objQ10 = mVar10.q();
                    if (zB5) {
                        objQ10 = new ad0.e(lVar, z15, 10);
                        mVar10.K(objQ10);
                    } else {
                        aVar2.getClass();
                        if (objQ10 == p3.m.a.f135155b) {
                            objQ10 = new ad0.e(lVar, z15, 10);
                            mVar10.K(objQ10);
                        }
                    }
                    h4.r rVarD = u1.w.d(rVarQ, false, null, null, (e23.a) objQ10, 15);
                    if (z15) {
                        mVar10.C(-358286487);
                        jA = d92.b.a(mVar10).f().f();
                    } else {
                        mVar10.C(-358285560);
                        jA = d92.b.a(mVar10).f().a();
                    }
                    mVar10.f();
                    i7.b(dVar5, null, rVarD, jA, mVar10, 48, 0);
                    h4.r rVarQ2 = x2.q(c2.l.A(aVar19, eVar4.f97918c, 0.0f, 2), cVar3.f97905d);
                    gl.c.f77766a.getClass();
                    i7.b(dVar4, null, rVarQ2, gl.c.a(mVar10).f(), mVar10, 48, 0);
                } else {
                    mVar10.e();
                }
                return Unit.INSTANCE;
            case 21:
                ((Integer) obj2).getClass();
                kf1.j.a((kf1.e) r14, (o82.g) obj3, z15, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 22:
                ih0.s sVar = (ih0.s) r14;
                dh0.a aVar20 = (dh0.a) obj3;
                p3.m mVar11 = (p3.m) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (mVar11.n(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    p3.x1 x1Var11 = p3.n.f135158a;
                    if (z15) {
                        mVar11.C(-1170449106);
                        sVar.getClass();
                        kh0.g.d(ih0.s.y4(aVar20, false), mVar11, 0);
                        mVar11.f();
                    } else {
                        mVar11.C(-1170317976);
                        dh0.l lVar2 = new dh0.l(dh0.m.CURRENT, null, 2, null);
                        dh0.m mVar12 = dh0.m.REAL;
                        Integer num = aVar20.f59542a;
                        kh0.g.d(new dh0.n(null, lVar2, new dh0.l(mVar12, num != null ? Double.valueOf(num.intValue()) : null), 1, null), mVar11, 0);
                        mVar11.f();
                    }
                    sVar.getClass();
                    kh0.g.f(ih0.n.e.f93469a, mVar11, 0);
                } else {
                    mVar11.e();
                }
                return Unit.INSTANCE;
            case 23:
                ((Integer) obj2).getClass();
                m82.d.a((c2.t) r14, z15, (h2.j0) obj3, (p3.m) obj, p3.p0.t(7));
                return Unit.INSTANCE;
            case 24:
                return a(obj, obj2);
            case 25:
                return b(obj, obj2);
            case 26:
                return c(obj, obj2);
            case 27:
                return d(obj, obj2);
            case 28:
                return e(obj, obj2);
            default:
                Set set = (Set) r14;
                e23.a aVar21 = (e23.a) obj3;
                p3.m mVar13 = (p3.m) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                if (mVar13.n(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    p3.x1 x1Var12 = p3.n.f135158a;
                    p2 p2Var = p2.f111205a;
                    String strQ6 = gl1.y.Q(mVar13, R.string.lbl_activites);
                    String strD4 = org.apache.commons.lang3.e.d(set.size(), StringUtils.SPACE, gl1.y.Q(mVar13, R.string.lbl_activites));
                    qy0.b.f148467a.getClass();
                    z3.e eVar5 = qy0.b.f148471e;
                    boolean zB6 = mVar13.B(aVar21);
                    Object objQ11 = mVar13.q();
                    if (zB6) {
                        objQ11 = new qk0.o(aVar21, 4);
                        mVar13.K(objQ11);
                    } else {
                        aVar2.getClass();
                        if (objQ11 == p3.m.a.f135155b) {
                            objQ11 = new qk0.o(aVar21, 4);
                            mVar13.K(objQ11);
                        }
                    }
                    p2Var.h(strQ6, strD4, null, null, null, false, false, null, eVar5, null, (e23.a) objQ11, mVar13, 100663296, 0, 764);
                    if (z15) {
                        mVar13.C(1505374428);
                        h4.r.a aVar22 = h4.r.S;
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        j92.e eVar6 = j92.b.f97899b;
                        h4.r rVarZ = c2.l.z(aVar22, eVar6.f97920e, eVar6.f97918c);
                        c22.x0.f23314a.getClass();
                        String strW = gl1.d.W(c22.x0.Fa);
                        d92.b.f58624b.getClass();
                        mh.c(strW, rVarZ, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, mVar13), mVar13, 0, 0, 131068);
                        mVar13.f();
                    } else {
                        mVar13.C(1505702687);
                        mVar13.f();
                    }
                } else {
                    mVar13.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ i1(Object obj, Object obj2, boolean z14, int i14, int i15) {
        this.f4019a = i15;
        this.f4022d = obj;
        this.f4021c = obj2;
        this.f4020b = z14;
    }

    public /* synthetic */ i1(Object obj, boolean z14, Object obj2, int i14) {
        this.f4019a = i14;
        this.f4022d = obj;
        this.f4020b = z14;
        this.f4021c = obj2;
    }

    public /* synthetic */ i1(Object obj, boolean z14, Object obj2, int i14, int i15) {
        this.f4019a = i15;
        this.f4022d = obj;
        this.f4020b = z14;
        this.f4021c = obj2;
    }

    public /* synthetic */ i1(Object obj, Object obj2, boolean z14, int i14) {
        this.f4019a = i14;
        this.f4022d = obj;
        this.f4021c = obj2;
        this.f4020b = z14;
    }

    public /* synthetic */ i1(boolean z14, Object obj, Object obj2, int i14) {
        this.f4019a = i14;
        this.f4020b = z14;
        this.f4022d = obj;
        this.f4021c = obj2;
    }
}
