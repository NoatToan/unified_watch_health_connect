package ds;

import android.content.Context;
import android.graphics.Bitmap;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.g3;
import f5.z0;
import i3.i7;
import java.util.List;
import l72.v2;
import lc.u0;
import nr.p0;
import o4.m1;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p1;
import p3.x1;
import p3.x3;
import u1.a2;
import v62.o2;
import v62.p2;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class u implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f61041a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.a f61042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a f61043c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f61044d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f61045e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f61046f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f61047g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f61048h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f61049i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f61050j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f61051k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f61052l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f61053m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f61054n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f61055o;

    public /* synthetic */ u(o82.a aVar, x01.e eVar, i21.d dVar, n82.f fVar, v21.e eVar2, i21.c cVar, e23.p pVar, e23.p pVar2, e23.r rVar, e23.r rVar2, e23.r rVar3, e23.a aVar2, e23.a aVar3, int i14) {
        this.f61045e = aVar;
        this.f61046f = eVar;
        this.f61047g = dVar;
        this.f61048h = fVar;
        this.f61049i = eVar2;
        this.f61050j = cVar;
        this.f61051k = pVar;
        this.f61052l = pVar2;
        this.f61053m = rVar;
        this.f61054n = rVar2;
        this.f61055o = rVar3;
        this.f61042b = aVar2;
        this.f61043c = aVar3;
        this.f61044d = i14;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:103:0x0407  */
    /* JADX WARN: Code duplicated, block: B:104:0x040b  */
    /* JADX WARN: Code duplicated, block: B:108:0x043e  */
    /* JADX WARN: Code duplicated, block: B:111:0x0454  */
    /* JADX WARN: Code duplicated, block: B:113:0x047e  */
    /* JADX WARN: Code duplicated, block: B:116:0x0486  */
    /* JADX WARN: Code duplicated, block: B:117:0x0488  */
    /* JADX WARN: Code duplicated, block: B:120:0x04aa  */
    /* JADX WARN: Code duplicated, block: B:123:0x04b2  */
    /* JADX WARN: Code duplicated, block: B:124:0x04b4  */
    /* JADX WARN: Code duplicated, block: B:127:0x04cc  */
    /* JADX WARN: Code duplicated, block: B:128:0x04d9  */
    /* JADX WARN: Code duplicated, block: B:131:0x04fa  */
    /* JADX WARN: Code duplicated, block: B:133:0x0509  */
    /* JADX WARN: Code duplicated, block: B:135:0x050d  */
    /* JADX WARN: Code duplicated, block: B:28:0x015f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0168  */
    /* JADX WARN: Code duplicated, block: B:31:0x016c  */
    /* JADX WARN: Code duplicated, block: B:36:0x0189  */
    /* JADX WARN: Code duplicated, block: B:39:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:41:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:45:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:47:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:58:0x0245  */
    /* JADX WARN: Code duplicated, block: B:74:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:78:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:81:0x0325  */
    /* JADX WARN: Code duplicated, block: B:83:0x032e  */
    /* JADX WARN: Code duplicated, block: B:84:0x0332  */
    /* JADX WARN: Code duplicated, block: B:89:0x034f  */
    /* JADX WARN: Code duplicated, block: B:92:0x035d  */
    /* JADX WARN: Code duplicated, block: B:94:0x036d  */
    /* JADX WARN: Code duplicated, block: B:96:0x037b  */
    /* JADX WARN: Code duplicated, block: B:98:0x03b5  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        x3 x3Var;
        h5.g.a.f fVar;
        c2.u uVar;
        c2.z zVarA;
        int iHashCode;
        i2 i2VarX;
        h4.r rVarC;
        boolean zBooleanValue;
        e23.a aVar;
        p3.m.a aVar2;
        p3.m mVar;
        e23.a aVar3;
        h4.r.a aVar4;
        k0 k0Var;
        e23.a aVar5;
        z0 z0VarD;
        int iHashCode2;
        i2 i2VarX2;
        h4.r rVarC2;
        p3.m mVar2;
        x3 x3Var2;
        boolean zB;
        Object objQ;
        qr.t tVar;
        x3 x3Var3;
        boolean zB2;
        Object objQ2;
        e23.a aVar6;
        boolean zR;
        Object objQ3;
        Object objQ4;
        p1 p1Var;
        u4.d dVarA;
        float f14;
        Object objQ5;
        p3.m.a.C2565a c2565a;
        boolean zR2;
        Object objQ6;
        int i14 = this.f61041a;
        Object obj3 = this.f61055o;
        Object obj4 = this.f61054n;
        Object obj5 = this.f61053m;
        Object obj6 = this.f61052l;
        Object obj7 = this.f61051k;
        Object obj8 = this.f61050j;
        Object obj9 = this.f61049i;
        Object obj10 = this.f61048h;
        Object obj11 = this.f61047g;
        Object obj12 = this.f61046f;
        Object obj13 = this.f61045e;
        switch (i14) {
            case 0:
                qr.t tVar2 = (qr.t) obj13;
                n4.d dVar = (n4.d) obj12;
                p0 p0Var = (p0) obj11;
                Bitmap bitmap = (Bitmap) obj10;
                e23.l lVar = (e23.l) obj9;
                p1 p1Var2 = (p1) obj8;
                x3 x3Var4 = (x3) obj5;
                p1 p1Var3 = (p1) obj7;
                p1 p1Var4 = (p1) obj6;
                Context context = (Context) obj3;
                x3 x3Var5 = (x3) obj4;
                p3.m mVar3 = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar3.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    h4.r.a aVar7 = h4.r.S;
                    h4.r rVarD = x2.d(aVar7, 1.0f);
                    h4.d.f81522a.getClass();
                    h4.g gVar = h4.d.a.f81524b;
                    z0 z0VarD2 = c2.q.d(gVar, false);
                    int iHashCode3 = Long.hashCode(mVar3.getU());
                    i2 i2VarX3 = mVar3.x();
                    h4.r rVarC3 = h4.k.c(rVarD, mVar3);
                    h5.g.V.getClass();
                    p1 p1Var5 = p1Var4;
                    h5.e0.a aVar8 = h5.g.a.f81805b;
                    if (mVar3.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar3.z();
                    if (mVar3.getT()) {
                        mVar3.M(aVar8);
                    } else {
                        mVar3.c();
                    }
                    x3 x3Var6 = x3Var5;
                    h5.g.a.e eVar = h5.g.a.f81810g;
                    b4.c(eVar, z0VarD2, mVar3);
                    h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                    b4.c(c1623g, i2VarX3, mVar3);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar3.getT()) {
                        x3Var = x3Var4;
                    } else {
                        x3Var = x3Var4;
                        if (!p005kotlin.jvm.internal.s.g(mVar3.q(), Integer.valueOf(iHashCode3))) {
                        }
                        fVar = h5.g.a.f81807d;
                        b4.c(fVar, rVarC3, mVar3);
                        uVar = c2.u.f22885a;
                        h4.r rVarB = a2.b(u1.n.e(x2.d(aVar7, 1.0f), tn.k.a(d92.b.f58623a, mVar3), m1.f128891a), a2.a(mVar3), true);
                        c2.j.f22691a.getClass();
                        zVarA = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, mVar3, 0);
                        iHashCode = Long.hashCode(mVar3.getU());
                        i2VarX = mVar3.x();
                        rVarC = h4.k.c(rVarB, mVar3);
                        if (mVar3.F() != null) {
                            p3.p0.l();
                            throw null;
                        }
                        mVar3.z();
                        if (mVar3.getT()) {
                            mVar3.M(aVar8);
                        } else {
                            mVar3.c();
                        }
                        b4.c(eVar, zVarA, mVar3);
                        b4.c(c1623g, i2VarX, mVar3);
                        if (mVar3.getT() || !p005kotlin.jvm.internal.s.g(mVar3.q(), Integer.valueOf(iHashCode))) {
                            v.h.z(iHashCode, mVar3, iHashCode, bVar);
                        }
                        b4.c(fVar, rVarC, mVar3);
                        c2.b0 b0Var = c2.b0.f22601a;
                        zBooleanValue = ((Boolean) p1Var2.getF182175a()).booleanValue();
                        aVar = this.f61042b;
                        aVar2 = p3.m.f135153a;
                        if (zBooleanValue) {
                            mVar3.C(-1431570495);
                            g3 g3Var = (g3) x3Var.getF182175a();
                            objQ5 = mVar3.q();
                            aVar2.getClass();
                            c2565a = p3.m.a.f135155b;
                            if (objQ5 == c2565a) {
                                objQ5 = new a11.m(p1Var2, 16);
                                mVar3.K(objQ5);
                            }
                            e23.l lVar2 = (e23.l) objQ5;
                            zR2 = mVar3.r(tVar2) | mVar3.B(dVar) | mVar3.B(aVar);
                            objQ6 = mVar3.q();
                            if (zR2 || objQ6 == c2565a) {
                                objQ6 = new ci0.b(tVar2, 10, dVar, aVar);
                                mVar3.K(objQ6);
                            }
                            fs.j.a(g3Var, lVar2, (e23.l) objQ6, mVar3, g3.f35299g | 48);
                            mVar3.f();
                        } else {
                            mVar3.C(-1431133240);
                            mVar3.f();
                        }
                        if (p0Var != null || bitmap == null) {
                            mVar = mVar3;
                            aVar3 = aVar;
                            aVar4 = aVar7;
                            mVar.C(-1429916056);
                            mVar.f();
                        } else {
                            mVar3.C(-1431030816);
                            aVar4 = aVar7;
                            h4.r rVarF = x2.f(aVar4, 1.0f);
                            if (((n) p1Var3.getF182175a()) == n.f61012i) {
                                d92.b.f58625c.getClass();
                                f14 = j92.b.f97899b.f97922g;
                            } else {
                                f14 = 0;
                                g6.f.a aVar9 = g6.f.f75994b;
                            }
                            h4.r rVarA = c2.l.A(rVarF, f14, 0.0f, 2);
                            boolean zB3 = mVar3.B(lVar);
                            Object objQ7 = mVar3.q();
                            if (zB3) {
                                objQ7 = new ci0.f(lVar, 9);
                                mVar3.K(objQ7);
                            } else {
                                aVar2.getClass();
                                if (objQ7 == p3.m.a.f135155b) {
                                    objQ7 = new ci0.f(lVar, 9);
                                    mVar3.K(objQ7);
                                }
                            }
                            h4.r rVarF2 = f5.g0.f(rVarA, (e23.l) objQ7);
                            z0 z0VarD3 = c2.q.d(gVar, false);
                            int iHashCode4 = Long.hashCode(mVar3.getU());
                            i2 i2VarX4 = mVar3.x();
                            h4.r rVarC4 = h4.k.c(rVarF2, mVar3);
                            if (mVar3.F() == null) {
                                p3.p0.l();
                                throw null;
                            }
                            mVar3.z();
                            if (mVar3.getT()) {
                                mVar3.M(aVar8);
                            } else {
                                mVar3.c();
                            }
                            b4.c(eVar, z0VarD3, mVar3);
                            b4.c(c1623g, i2VarX4, mVar3);
                            if (mVar3.getT() || !p005kotlin.jvm.internal.s.g(mVar3.q(), Integer.valueOf(iHashCode4))) {
                                v.h.z(iHashCode4, mVar3, iHashCode4, bVar);
                            }
                            b4.c(fVar, rVarC4, mVar3);
                            aVar3 = aVar;
                            is.h.a(null, (n) p1Var3.getF182175a(), bitmap, this.f61044d, p0Var, true, this.f61043c, mVar3, 196608, 1);
                            mVar = mVar3;
                            mVar.y();
                            mVar.f();
                        }
                        h4.r rVarA2 = b0Var.a(x2.f(aVar4, 1.0f), 1.0f, true);
                        k0 k0Var2 = (k0) p1Var5.getF182175a();
                        k0Var = k0.Hidden;
                        aVar5 = aVar3;
                        h4.r rVarA3 = v2.a(rVarA2, k0Var2 != k0Var, new bk0.i(25), mVar, 0);
                        z0VarD = c2.q.d(gVar, false);
                        iHashCode2 = Long.hashCode(mVar.getU());
                        i2VarX2 = mVar.x();
                        rVarC2 = h4.k.c(rVarA3, mVar);
                        if (mVar.F() != null) {
                            p3.p0.l();
                            throw null;
                        }
                        mVar.z();
                        if (mVar.getT()) {
                            mVar.M(aVar8);
                        } else {
                            mVar.c();
                        }
                        b4.c(eVar, z0VarD, mVar);
                        b4.c(c1623g, i2VarX2, mVar);
                        if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode2))) {
                            v.h.z(iHashCode2, mVar, iHashCode2, bVar);
                        }
                        b4.c(fVar, rVarC2, mVar);
                        if (((k0) p1Var5.getF182175a()) != k0Var) {
                            mVar.C(2038792963);
                            if (((k0) p1Var5.getF182175a()) == k0.Opened) {
                                s62.a.f157643a.getClass();
                                dVarA = p2.a(t62.b.f162798a);
                            } else {
                                s62.a.f157643a.getClass();
                                dVarA = o2.a(t62.b.f162798a);
                            }
                            u4.d dVar2 = dVarA;
                            long jF = u0.f(mVar);
                            d92.b.f58625c.getClass();
                            p3.m mVar4 = mVar;
                            i7.b(dVar2, "", uVar.c(x2.q(aVar4, j92.b.f97901d.f97906e), h4.d.a.f81528f), jF, mVar4, 48, 0);
                            mVar2 = mVar4;
                            mVar2.f();
                            tVar = tVar2;
                            aVar5 = aVar5;
                        } else {
                            mVar2 = mVar;
                            mVar2.C(2039288560);
                            l72.f0.a aVar10 = l72.f0.a.f111000a;
                            p.f61026a.getClass();
                            z3.e eVar2 = p.f61027b;
                            String strQ = gl1.y.Q(mVar2, R.string.lbl_add_stickers);
                            h4.r rVarF3 = x2.f(aVar4, 1.0f);
                            d92.b.f58625c.getClass();
                            h4.r rVarC5 = uVar.c(c2.l.y(rVarF3, j92.b.f97899b.f97920e), h4.d.a.f81531i);
                            x3Var2 = x3Var;
                            zB = mVar2.B(x3Var2) | mVar2.r(tVar2) | mVar2.r(context);
                            objQ = mVar2.q();
                            if (zB) {
                                tVar = tVar2;
                                objQ = new af0.e((Object) tVar, (Object) context, (Object) x3Var2, (x3) p1Var2, 18);
                                mVar2.K(objQ);
                            } else {
                                aVar2.getClass();
                                if (objQ == p3.m.a.f135155b) {
                                    tVar = tVar2;
                                    objQ = new af0.e((Object) tVar, (Object) context, (Object) x3Var2, (x3) p1Var2, 18);
                                    mVar2.K(objQ);
                                } else {
                                    tVar = tVar2;
                                }
                            }
                            aVar10.i(eVar2, strQ, rVarC5, false, (e23.a) objQ, mVar2, 6, 8);
                            mVar2.f();
                        }
                        mVar2.y();
                        mVar2.y();
                        if (((List) x3Var6.getF182175a()).isEmpty()) {
                            mVar2.C(2069567550);
                            mVar2.f();
                        } else {
                            mVar2.C(2068653639);
                            for (fs.f fVar2 : (List) x3Var6.getF182175a()) {
                                mVar2.N(263882146, fVar2.f73386a);
                                x3Var3 = x3Var6;
                                zB2 = mVar2.B(x3Var3) | mVar2.r(fVar2) | mVar2.r(tVar) | mVar2.B(aVar5);
                                objQ2 = mVar2.q();
                                if (zB2) {
                                    aVar6 = aVar5;
                                    qr.t tVar3 = tVar;
                                    af0.e eVar3 = new af0.e((Object) fVar2, (Object) tVar3, (Object) aVar6, x3Var3, 19);
                                    tVar = tVar3;
                                    mVar2.K(eVar3);
                                    objQ2 = eVar3;
                                } else {
                                    aVar2.getClass();
                                    if (objQ2 == p3.m.a.f135155b) {
                                        aVar6 = aVar5;
                                        qr.t tVar4 = tVar;
                                        af0.e eVar4 = new af0.e((Object) fVar2, (Object) tVar4, (Object) aVar6, x3Var3, 19);
                                        tVar = tVar4;
                                        mVar2.K(eVar4);
                                        objQ2 = eVar4;
                                    } else {
                                        aVar6 = aVar5;
                                    }
                                }
                                e23.a aVar11 = (e23.a) objQ2;
                                zR = mVar2.r(tVar) | mVar2.r(fVar2);
                                objQ3 = mVar2.q();
                                if (zR) {
                                    objQ3 = new dl0.g(2, tVar, fVar2);
                                    mVar2.K(objQ3);
                                } else {
                                    aVar2.getClass();
                                    if (objQ3 == p3.m.a.f135155b) {
                                        objQ3 = new dl0.g(2, tVar, fVar2);
                                        mVar2.K(objQ3);
                                    }
                                }
                                e23.a aVar12 = (e23.a) objQ3;
                                objQ4 = mVar2.q();
                                aVar2.getClass();
                                if (objQ4 == p3.m.a.f135155b) {
                                    p1Var = p1Var5;
                                    objQ4 = new a11.m(p1Var, 17);
                                    mVar2.K(objQ4);
                                } else {
                                    p1Var = p1Var5;
                                }
                                fs.d.a(fVar2, true, aVar11, aVar12, dVar, (e23.l) objQ4, mVar2, 196656, 0);
                                mVar2.Q();
                                aVar5 = aVar6;
                                x3Var6 = x3Var3;
                                p1Var5 = p1Var;
                            }
                            mVar2.f();
                        }
                        mVar2.y();
                        x1 x1Var2 = p3.n.f135158a;
                    }
                    v.h.z(iHashCode3, mVar3, iHashCode3, bVar);
                    fVar = h5.g.a.f81807d;
                    b4.c(fVar, rVarC3, mVar3);
                    uVar = c2.u.f22885a;
                    h4.r rVarB2 = a2.b(u1.n.e(x2.d(aVar7, 1.0f), tn.k.a(d92.b.f58623a, mVar3), m1.f128891a), a2.a(mVar3), true);
                    c2.j.f22691a.getClass();
                    zVarA = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, mVar3, 0);
                    iHashCode = Long.hashCode(mVar3.getU());
                    i2VarX = mVar3.x();
                    rVarC = h4.k.c(rVarB2, mVar3);
                    if (mVar3.F() != null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar3.z();
                    if (mVar3.getT()) {
                        mVar3.M(aVar8);
                    } else {
                        mVar3.c();
                    }
                    b4.c(eVar, zVarA, mVar3);
                    b4.c(c1623g, i2VarX, mVar3);
                    if (mVar3.getT()) {
                        v.h.z(iHashCode, mVar3, iHashCode, bVar);
                    } else {
                        v.h.z(iHashCode, mVar3, iHashCode, bVar);
                    }
                    b4.c(fVar, rVarC, mVar3);
                    c2.b0 b0Var2 = c2.b0.f22601a;
                    zBooleanValue = ((Boolean) p1Var2.getF182175a()).booleanValue();
                    aVar = this.f61042b;
                    aVar2 = p3.m.f135153a;
                    if (zBooleanValue) {
                        mVar3.C(-1431570495);
                        g3 g3Var2 = (g3) x3Var.getF182175a();
                        objQ5 = mVar3.q();
                        aVar2.getClass();
                        c2565a = p3.m.a.f135155b;
                        if (objQ5 == c2565a) {
                            objQ5 = new a11.m(p1Var2, 16);
                            mVar3.K(objQ5);
                        }
                        e23.l lVar3 = (e23.l) objQ5;
                        zR2 = mVar3.r(tVar2) | mVar3.B(dVar) | mVar3.B(aVar);
                        objQ6 = mVar3.q();
                        if (zR2) {
                            objQ6 = new ci0.b(tVar2, 10, dVar, aVar);
                            mVar3.K(objQ6);
                        } else {
                            objQ6 = new ci0.b(tVar2, 10, dVar, aVar);
                            mVar3.K(objQ6);
                        }
                        fs.j.a(g3Var2, lVar3, (e23.l) objQ6, mVar3, g3.f35299g | 48);
                        mVar3.f();
                    } else {
                        mVar3.C(-1431133240);
                        mVar3.f();
                    }
                    if (p0Var != null) {
                        mVar = mVar3;
                        aVar3 = aVar;
                        aVar4 = aVar7;
                        mVar.C(-1429916056);
                        mVar.f();
                    } else {
                        mVar = mVar3;
                        aVar3 = aVar;
                        aVar4 = aVar7;
                        mVar.C(-1429916056);
                        mVar.f();
                    }
                    h4.r rVarA4 = b0Var2.a(x2.f(aVar4, 1.0f), 1.0f, true);
                    k0 k0Var3 = (k0) p1Var5.getF182175a();
                    k0Var = k0.Hidden;
                    aVar5 = aVar3;
                    h4.r rVarA5 = v2.a(rVarA4, k0Var3 != k0Var, new bk0.i(25), mVar, 0);
                    z0VarD = c2.q.d(gVar, false);
                    iHashCode2 = Long.hashCode(mVar.getU());
                    i2VarX2 = mVar.x();
                    rVarC2 = h4.k.c(rVarA5, mVar);
                    if (mVar.F() != null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar.z();
                    if (mVar.getT()) {
                        mVar.M(aVar8);
                    } else {
                        mVar.c();
                    }
                    b4.c(eVar, z0VarD, mVar);
                    b4.c(c1623g, i2VarX2, mVar);
                    if (mVar.getT()) {
                        v.h.z(iHashCode2, mVar, iHashCode2, bVar);
                    } else {
                        v.h.z(iHashCode2, mVar, iHashCode2, bVar);
                    }
                    b4.c(fVar, rVarC2, mVar);
                    if (((k0) p1Var5.getF182175a()) != k0Var) {
                        mVar.C(2038792963);
                        if (((k0) p1Var5.getF182175a()) == k0.Opened) {
                            s62.a.f157643a.getClass();
                            dVarA = p2.a(t62.b.f162798a);
                        } else {
                            s62.a.f157643a.getClass();
                            dVarA = o2.a(t62.b.f162798a);
                        }
                        u4.d dVar3 = dVarA;
                        long jF2 = u0.f(mVar);
                        d92.b.f58625c.getClass();
                        p3.m mVar5 = mVar;
                        i7.b(dVar3, "", uVar.c(x2.q(aVar4, j92.b.f97901d.f97906e), h4.d.a.f81528f), jF2, mVar5, 48, 0);
                        mVar2 = mVar5;
                        mVar2.f();
                        tVar = tVar2;
                        aVar5 = aVar5;
                    } else {
                        mVar2 = mVar;
                        mVar2.C(2039288560);
                        l72.f0.a aVar13 = l72.f0.a.f111000a;
                        p.f61026a.getClass();
                        z3.e eVar5 = p.f61027b;
                        String strQ2 = gl1.y.Q(mVar2, R.string.lbl_add_stickers);
                        h4.r rVarF4 = x2.f(aVar4, 1.0f);
                        d92.b.f58625c.getClass();
                        h4.r rVarC6 = uVar.c(c2.l.y(rVarF4, j92.b.f97899b.f97920e), h4.d.a.f81531i);
                        x3Var2 = x3Var;
                        zB = mVar2.B(x3Var2) | mVar2.r(tVar2) | mVar2.r(context);
                        objQ = mVar2.q();
                        if (zB) {
                            aVar2.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                tVar = tVar2;
                                objQ = new af0.e((Object) tVar, (Object) context, (Object) x3Var2, (x3) p1Var2, 18);
                                mVar2.K(objQ);
                            } else {
                                tVar = tVar2;
                            }
                        } else {
                            tVar = tVar2;
                            objQ = new af0.e((Object) tVar, (Object) context, (Object) x3Var2, (x3) p1Var2, 18);
                            mVar2.K(objQ);
                        }
                        aVar13.i(eVar5, strQ2, rVarC6, false, (e23.a) objQ, mVar2, 6, 8);
                        mVar2.f();
                    }
                    mVar2.y();
                    mVar2.y();
                    if (((List) x3Var6.getF182175a()).isEmpty()) {
                        mVar2.C(2068653639);
                        while (r9.hasNext()) {
                            mVar2.N(263882146, fVar2.f73386a);
                            x3Var3 = x3Var6;
                            zB2 = mVar2.B(x3Var3) | mVar2.r(fVar2) | mVar2.r(tVar) | mVar2.B(aVar5);
                            objQ2 = mVar2.q();
                            if (zB2) {
                                aVar2.getClass();
                                if (objQ2 == p3.m.a.f135155b) {
                                    aVar6 = aVar5;
                                    qr.t tVar5 = tVar;
                                    af0.e eVar6 = new af0.e((Object) fVar2, (Object) tVar5, (Object) aVar6, x3Var3, 19);
                                    tVar = tVar5;
                                    mVar2.K(eVar6);
                                    objQ2 = eVar6;
                                } else {
                                    aVar6 = aVar5;
                                }
                            } else {
                                aVar6 = aVar5;
                                qr.t tVar6 = tVar;
                                af0.e eVar7 = new af0.e((Object) fVar2, (Object) tVar6, (Object) aVar6, x3Var3, 19);
                                tVar = tVar6;
                                mVar2.K(eVar7);
                                objQ2 = eVar7;
                            }
                            e23.a aVar14 = (e23.a) objQ2;
                            zR = mVar2.r(tVar) | mVar2.r(fVar2);
                            objQ3 = mVar2.q();
                            if (zR) {
                                aVar2.getClass();
                                if (objQ3 == p3.m.a.f135155b) {
                                    objQ3 = new dl0.g(2, tVar, fVar2);
                                    mVar2.K(objQ3);
                                }
                            } else {
                                objQ3 = new dl0.g(2, tVar, fVar2);
                                mVar2.K(objQ3);
                            }
                            e23.a aVar15 = (e23.a) objQ3;
                            objQ4 = mVar2.q();
                            aVar2.getClass();
                            if (objQ4 == p3.m.a.f135155b) {
                                p1Var = p1Var5;
                                objQ4 = new a11.m(p1Var, 17);
                                mVar2.K(objQ4);
                            } else {
                                p1Var = p1Var5;
                            }
                            fs.d.a(fVar2, true, aVar14, aVar15, dVar, (e23.l) objQ4, mVar2, 196656, 0);
                            mVar2.Q();
                            aVar5 = aVar6;
                            x3Var6 = x3Var3;
                            p1Var5 = p1Var;
                        }
                        mVar2.f();
                    } else {
                        mVar2.C(2069567550);
                        mVar2.f();
                    }
                    mVar2.y();
                    x1 x1Var3 = p3.n.f135158a;
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                h21.y.c((o82.a) obj13, (x01.e) obj12, (i21.d) obj11, (n82.f) obj10, (v21.e) obj9, (i21.c) obj8, (e23.p) obj7, (e23.p) obj6, (e23.r) obj5, (e23.r) obj4, (e23.r) obj3, this.f61042b, this.f61043c, (p3.m) obj, p3.p0.t(this.f61044d | 1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ u(qr.t tVar, n4.d dVar, e23.a aVar, p0 p0Var, Bitmap bitmap, e23.l lVar, p1 p1Var, p1 p1Var2, p1 p1Var3, int i14, e23.a aVar2, p1 p1Var4, Context context, p1 p1Var5) {
        this.f61045e = tVar;
        this.f61046f = dVar;
        this.f61042b = aVar;
        this.f61047g = p0Var;
        this.f61048h = bitmap;
        this.f61049i = lVar;
        this.f61050j = p1Var;
        this.f61053m = p1Var2;
        this.f61051k = p1Var3;
        this.f61044d = i14;
        this.f61043c = aVar2;
        this.f61052l = p1Var4;
        this.f61055o = context;
        this.f61054n = p1Var5;
    }
}
