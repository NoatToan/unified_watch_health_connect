package cb0;

import ak0.z;
import am.j1;
import b63.o;
import c2.a0;
import c2.j;
import c2.l;
import c2.q2;
import c2.s2;
import c2.t2;
import c2.u2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.C;
import d6.h;
import d92.c;
import e23.q;
import gl1.y;
import h4.k;
import h4.r;
import h5.e0;
import h5.g;
import i3.h1;
import i3.i7;
import i3.mh;
import j92.d;
import j92.e;
import k2.i;
import l72.c1;
import o72.i1;
import o72.i3;
import oa0.f;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.p0;
import p3.p1;
import p3.x1;
import p40.k0;
import s5.x0;
import u1.w;
import v62.e1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p1 f26638b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p1 f26639c;

    public /* synthetic */ a(p1 p1Var, p1 p1Var2, int i14) {
        this.f26637a = i14;
        this.f26638b = p1Var;
        this.f26639c = p1Var2;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0450  */
    /* JADX WARN: Code duplicated, block: B:107:0x04a0  */
    /* JADX WARN: Code duplicated, block: B:108:0x04c7  */
    /* JADX WARN: Code duplicated, block: B:111:0x04dd  */
    /* JADX WARN: Code duplicated, block: B:112:0x04e1  */
    /* JADX WARN: Code duplicated, block: B:115:0x0547  */
    /* JADX WARN: Code duplicated, block: B:117:0x055d  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:53:0x015b  */
    /* JADX WARN: Code duplicated, block: B:85:0x0369  */
    /* JADX WARN: Code duplicated, block: B:86:0x0392  */
    /* JADX WARN: Code duplicated, block: B:89:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:90:0x03d6  */
    /* JADX WARN: Code duplicated, block: B:93:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:96:0x0422  */
    /* JADX WARN: Code duplicated, block: B:98:0x042b  */
    /* JADX WARN: Code duplicated, block: B:99:0x0431  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        g.a.C1623g c1623g;
        h4.g.b bVar;
        g.a.f fVar;
        u2 u2Var;
        x0 x0Var;
        m mVar;
        f fVar2;
        f fVar3;
        boolean z14;
        Object objQ;
        s2 s2VarA;
        int iHashCode;
        i2 i2VarX;
        r rVarC;
        m mVar2;
        int i14;
        m mVar3;
        Object objQ2;
        int i15 = this.f26637a;
        int i16 = 16;
        m.a aVar = m.f135153a;
        p1 p1Var = this.f26639c;
        p1 p1Var2 = this.f26638b;
        switch (i15) {
            case 0:
                a0 a0Var = (a0) obj;
                m mVar4 = (m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                a0Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= mVar4.B(a0Var) ? 4 : 2;
                }
                if (mVar4.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                    x1 x1Var = n.f135158a;
                    o oVar = (o) p1Var2.getF182175a();
                    Object objQ3 = mVar4.q();
                    aVar.getClass();
                    if (objQ3 == m.a.f135155b) {
                        objQ3 = new z(p1Var, 25);
                        mVar4.K(objQ3);
                    }
                    b.b(oVar, (e23.a) objQ3, mVar4, 48);
                    r.a aVar2 = r.S;
                    l.f(a0Var.a(aVar2, 1.0f, true), mVar4);
                    r rVarF = x2.f(aVar2, 1.0f);
                    String strQ = y.Q(mVar4, R.string.msg_profile_information_privacy);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(strQ, rVarF, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c.f(j92.f.f97933j, mVar4), mVar4, 48, 0, 131068);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 1:
                m mVar5 = (m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((a0) obj).getClass();
                if (mVar5.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    x1 x1Var2 = n.f135158a;
                    String strQ2 = y.Q(mVar5, R.string.lbl_where_to_wear_most);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    x0 x0Var2 = j92.f.f97932i;
                    x0 x0VarB = c.b(x0Var2, mVar5);
                    h.f57752b.getClass();
                    int i17 = h.f57757g;
                    r.a aVar3 = r.S;
                    r rVarF2 = x2.f(aVar3, 1.0f);
                    d92.b.f58625c.getClass();
                    e eVar = j92.b.f97899b;
                    float f14 = eVar.f97922g;
                    float f15 = eVar.f97920e;
                    mh.c(strQ2, l.C(rVarF2, 0.0f, f14, 0.0f, 0.0f, 13), 0L, null, 0L, null, 0L, h.a(i17), 0L, 0, false, 0, 0, null, x0VarB, mVar5, 0, 0, 130044);
                    r rVarC2 = l.C(x2.f(aVar3, 1.0f), 0.0f, eVar.f97918c, 0.0f, 0.0f, 13);
                    long jC = com.nimbusds.jose.shaded.gson.internal.a.c(mVar5);
                    d dVar = j92.b.f97900c;
                    float f16 = dVar.f97911c;
                    r rVarE = u1.n.e(rVarC2, jC, i.c(f16, f16, 0.0f, 0.0f, 12));
                    f fVar4 = (f) p1Var2.getF182175a();
                    f fVar5 = f.f131056e;
                    r rVarE2 = wz1.i.e(rVarE, fVar4 == fVar5, new i1(9), mVar5, 0);
                    Object objQ4 = mVar5.q();
                    aVar.getClass();
                    m.a.C2565a c2565a = m.a.f135155b;
                    if (objQ4 == c2565a) {
                        objQ4 = new j1(p1Var2, p1Var, 18);
                        mVar5.K(objQ4);
                    }
                    r rVarY = l.y(w.d(rVarE2, false, null, null, (e23.a) objQ4, 15), f15);
                    j.f22691a.getClass();
                    j.C0343j c0343j = j.f22692b;
                    h4.d.f81522a.getClass();
                    h4.g.b bVar2 = h4.d.a.f81533k;
                    s2 s2VarA2 = q2.a(c0343j, bVar2, mVar5, 0);
                    int iHashCode2 = Long.hashCode(mVar5.getU());
                    i2 i2VarX2 = mVar5.x();
                    r rVarC3 = k.c(rVarY, mVar5);
                    g.V.getClass();
                    e0.a aVar4 = g.a.f81805b;
                    if (mVar5.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar5.z();
                    if (mVar5.getT()) {
                        mVar5.M(aVar4);
                    } else {
                        mVar5.c();
                    }
                    g.a.e eVar2 = g.a.f81810g;
                    b4.c(eVar2, s2VarA2, mVar5);
                    g.a.C1623g c1623g2 = g.a.f81809f;
                    b4.c(c1623g2, i2VarX2, mVar5);
                    g.a.b bVar3 = g.a.f81813j;
                    if (mVar5.getT()) {
                        c1623g = c1623g2;
                        bVar = bVar2;
                    } else {
                        bVar = bVar2;
                        c1623g = c1623g2;
                        if (!s.g(mVar5.q(), Integer.valueOf(iHashCode2))) {
                        }
                        fVar = g.a.f81807d;
                        b4.c(fVar, rVarC3, mVar5);
                        u2Var = u2.f22900a;
                        String strT = gl1.d.T(fVar5.f131059a.f131055a, mVar5, 0);
                        x0Var = j92.f.f97931h;
                        x0 x0VarB2 = c.b(x0Var, mVar5);
                        h4.g.b bVar4 = bVar;
                        mh.c(strT, u2Var.a(aVar3, 1.0f, true), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB2, mVar5, 0, 0, 131068);
                        mVar = mVar5;
                        if (((f) p1Var2.getF182175a()) == fVar5) {
                            mVar.C(-1233956845);
                            s62.a.f157643a.getClass();
                            i7.b(e1.a(t62.b.f162798a), null, null, androidx.room.a0.c(mVar), mVar, 48, 4);
                            mVar = mVar;
                            mVar.f();
                        } else {
                            mVar.C(-1233757918);
                            mVar.f();
                        }
                        mVar.y();
                        r rVarC4 = l.C(x2.f(aVar3, 1.0f), 0.0f, 0.0f, 0.0f, eVar.f97923h, 7);
                        long jC2 = com.nimbusds.jose.shaded.gson.internal.a.c(mVar);
                        float f17 = dVar.f97911c;
                        r rVarE3 = u1.n.e(rVarC4, jC2, i.c(0.0f, 0.0f, f17, f17, 3));
                        fVar2 = (f) p1Var2.getF182175a();
                        fVar3 = f.f131057f;
                        if (fVar2 == fVar3) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        r rVarE4 = wz1.i.e(rVarE3, z14, new i1(10), mVar, 0);
                        objQ = mVar.q();
                        if (objQ == c2565a) {
                            objQ = new j1(p1Var2, p1Var, 17);
                            mVar.K(objQ);
                        }
                        r rVarY2 = l.y(w.d(rVarE4, false, null, null, (e23.a) objQ, 15), f15);
                        s2VarA = q2.a(c0343j, bVar4, mVar, 0);
                        iHashCode = Long.hashCode(mVar.getU());
                        i2VarX = mVar.x();
                        rVarC = k.c(rVarY2, mVar);
                        if (mVar.F() != null) {
                            p0.l();
                            throw null;
                        }
                        mVar.z();
                        if (mVar.getT()) {
                            mVar.M(aVar4);
                        } else {
                            mVar.c();
                        }
                        b4.c(eVar2, s2VarA, mVar);
                        b4.c(c1623g, i2VarX, mVar);
                        if (mVar.getT() || !s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                            v.h.z(iHashCode, mVar, iHashCode, bVar3);
                        }
                        b4.c(fVar, rVarC, mVar);
                        m mVar6 = mVar;
                        mh.c(gl1.d.T(fVar3.f131059a.f131055a, mVar, 0), u2Var.a(aVar3, 1.0f, true), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c.b(x0Var, mVar), mVar6, 0, 0, 131068);
                        mVar2 = mVar6;
                        if (((f) p1Var2.getF182175a()) == fVar3) {
                            mVar2.C(-521970550);
                            s62.a.f157643a.getClass();
                            i7.b(e1.a(t62.b.f162798a), null, null, androidx.room.a0.c(mVar2), mVar2, 48, 4);
                            mVar2 = mVar2;
                            mVar2.f();
                        } else {
                            mVar2.C(-521771623);
                            mVar2.f();
                        }
                        mVar2.y();
                        if (((f) p1Var2.getF182175a()) == fVar5) {
                            i14 = R.string.msg_which_wrist;
                        } else {
                            i14 = R.string.msg_which_arm;
                        }
                        mVar3 = mVar2;
                        mh.c(y.Q(mVar2, i14), l.C(x2.f(aVar3, 1.0f), 0.0f, eVar.f97917b, 0.0f, eVar.f97920e, 5), 0L, null, 0L, null, 0L, h.a(i17), 0L, 0, false, 0, 0, null, c.b(x0Var2, mVar2), mVar3, 0, 0, 130044);
                        oa0.e.a aVar5 = ((f) p1Var2.getF182175a()).f131060b;
                        oa0.e.a aVar6 = ((f) p1Var2.getF182175a()).f131061c;
                        j90.o oVar2 = (j90.o) p1Var.getF182175a();
                        objQ2 = mVar3.q();
                        if (objQ2 == c2565a) {
                            objQ2 = new i3(p1Var, 4);
                            mVar3.K(objQ2);
                        }
                        oa0.i.a(aVar5, aVar6, oVar2, (e23.l) objQ2, mVar3, 3072);
                    }
                    v.h.z(iHashCode2, mVar5, iHashCode2, bVar3);
                    fVar = g.a.f81807d;
                    b4.c(fVar, rVarC3, mVar5);
                    u2Var = u2.f22900a;
                    String strT2 = gl1.d.T(fVar5.f131059a.f131055a, mVar5, 0);
                    x0Var = j92.f.f97931h;
                    x0 x0VarB3 = c.b(x0Var, mVar5);
                    h4.g.b bVar5 = bVar;
                    mh.c(strT2, u2Var.a(aVar3, 1.0f, true), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB3, mVar5, 0, 0, 131068);
                    mVar = mVar5;
                    if (((f) p1Var2.getF182175a()) == fVar5) {
                        mVar.C(-1233956845);
                        s62.a.f157643a.getClass();
                        i7.b(e1.a(t62.b.f162798a), null, null, androidx.room.a0.c(mVar), mVar, 48, 4);
                        mVar = mVar;
                        mVar.f();
                    } else {
                        mVar.C(-1233757918);
                        mVar.f();
                    }
                    mVar.y();
                    r rVarC5 = l.C(x2.f(aVar3, 1.0f), 0.0f, 0.0f, 0.0f, eVar.f97923h, 7);
                    long jC3 = com.nimbusds.jose.shaded.gson.internal.a.c(mVar);
                    float f18 = dVar.f97911c;
                    r rVarE5 = u1.n.e(rVarC5, jC3, i.c(0.0f, 0.0f, f18, f18, 3));
                    fVar2 = (f) p1Var2.getF182175a();
                    fVar3 = f.f131057f;
                    if (fVar2 == fVar3) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    r rVarE6 = wz1.i.e(rVarE5, z14, new i1(10), mVar, 0);
                    objQ = mVar.q();
                    if (objQ == c2565a) {
                        objQ = new j1(p1Var2, p1Var, 17);
                        mVar.K(objQ);
                    }
                    r rVarY3 = l.y(w.d(rVarE6, false, null, null, (e23.a) objQ, 15), f15);
                    s2VarA = q2.a(c0343j, bVar5, mVar, 0);
                    iHashCode = Long.hashCode(mVar.getU());
                    i2VarX = mVar.x();
                    rVarC = k.c(rVarY3, mVar);
                    if (mVar.F() != null) {
                        p0.l();
                        throw null;
                    }
                    mVar.z();
                    if (mVar.getT()) {
                        mVar.M(aVar4);
                    } else {
                        mVar.c();
                    }
                    b4.c(eVar2, s2VarA, mVar);
                    b4.c(c1623g, i2VarX, mVar);
                    if (mVar.getT()) {
                        v.h.z(iHashCode, mVar, iHashCode, bVar3);
                    } else {
                        v.h.z(iHashCode, mVar, iHashCode, bVar3);
                    }
                    b4.c(fVar, rVarC, mVar);
                    m mVar7 = mVar;
                    mh.c(gl1.d.T(fVar3.f131059a.f131055a, mVar, 0), u2Var.a(aVar3, 1.0f, true), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c.b(x0Var, mVar), mVar7, 0, 0, 131068);
                    mVar2 = mVar7;
                    if (((f) p1Var2.getF182175a()) == fVar3) {
                        mVar2.C(-521970550);
                        s62.a.f157643a.getClass();
                        i7.b(e1.a(t62.b.f162798a), null, null, androidx.room.a0.c(mVar2), mVar2, 48, 4);
                        mVar2 = mVar2;
                        mVar2.f();
                    } else {
                        mVar2.C(-521771623);
                        mVar2.f();
                    }
                    mVar2.y();
                    if (((f) p1Var2.getF182175a()) == fVar5) {
                        i14 = R.string.msg_which_wrist;
                    } else {
                        i14 = R.string.msg_which_arm;
                    }
                    mVar3 = mVar2;
                    mh.c(y.Q(mVar2, i14), l.C(x2.f(aVar3, 1.0f), 0.0f, eVar.f97917b, 0.0f, eVar.f97920e, 5), 0L, null, 0L, null, 0L, h.a(i17), 0L, 0, false, 0, 0, null, c.b(x0Var2, mVar2), mVar3, 0, 0, 130044);
                    oa0.e.a aVar7 = ((f) p1Var2.getF182175a()).f131060b;
                    oa0.e.a aVar8 = ((f) p1Var2.getF182175a()).f131061c;
                    j90.o oVar3 = (j90.o) p1Var.getF182175a();
                    objQ2 = mVar3.q();
                    if (objQ2 == c2565a) {
                        objQ2 = new i3(p1Var, 4);
                        mVar3.K(objQ2);
                    }
                    oa0.i.a(aVar7, aVar8, oVar3, (e23.l) objQ2, mVar3, 3072);
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 2:
                m mVar8 = (m) obj2;
                ((Integer) obj3).getClass();
                ((r1.e0) obj).getClass();
                x1 x1Var3 = n.f135158a;
                c1 c1Var = c1.f110940a;
                String str = ((km1.i) p1Var.getF182175a()).f105528d;
                String strQ3 = y.Q(mVar8, R.string.lbl_ok);
                boolean zB = mVar8.B(p1Var2);
                Object objQ5 = mVar8.q();
                if (zB) {
                    objQ5 = new k0(p1Var2, 15);
                    mVar8.K(objQ5);
                } else {
                    aVar.getClass();
                    if (objQ5 == m.a.f135155b) {
                        objQ5 = new k0(p1Var2, 15);
                        mVar8.K(objQ5);
                    }
                }
                c1Var.a(false, null, str, null, null, strQ3, false, false, (e23.a) objQ5, null, null, mVar8, 6, 0, 1754);
                return Unit.INSTANCE;
            case 3:
                m mVar9 = (m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((t2) obj).getClass();
                if (mVar9.n(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    x1 x1Var4 = n.f135158a;
                    boolean z15 = ((j70.r) p1Var.getF182175a()) != null;
                    boolean zB2 = mVar9.B(p1Var2);
                    Object objQ6 = mVar9.q();
                    if (zB2) {
                        objQ6 = new rk0.w(p1Var2, 22);
                        mVar9.K(objQ6);
                    } else {
                        aVar.getClass();
                        if (objQ6 == m.a.f135155b) {
                            objQ6 = new rk0.w(p1Var2, 22);
                            mVar9.K(objQ6);
                        }
                    }
                    h1.c((e23.a) objQ6, null, z15, null, null, null, null, null, z3.f.c(1453287223, new eb0.a(p1Var, i16), mVar9), mVar9, C.ENCODING_PCM_32BIT, 506);
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            default:
                float fFloatValue = ((Float) obj).floatValue();
                m mVar10 = (m) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= mVar10.i(fFloatValue) ? 4 : 2;
                }
                if (mVar10.n(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    x1 x1Var5 = n.f135158a;
                    int i18 = w11.d.c.f181210a[((x11.a) p1Var2.getF182175a()).ordinal()];
                    if (i18 == 1) {
                        mVar10.C(-711239956);
                        u11.d.b(x2.d(r.S, 1.0f), fFloatValue, mVar10, ((iIntValue4 << 3) & 112) | 6);
                        mVar10.f();
                    } else {
                        if (i18 != 2) {
                            throw n23.j.m(mVar10, -711241166);
                        }
                        mVar10.C(-711232973);
                        r rVarD = x2.d(r.S, 1.0f);
                        Object objQ7 = mVar10.q();
                        aVar.getClass();
                        if (objQ7 == m.a.f135155b) {
                            objQ7 = new vd0.d(p1Var, 16);
                            mVar10.K(objQ7);
                        }
                        u11.a.b(rVarD, (e23.l) objQ7, fFloatValue, mVar10, ((iIntValue4 << 6) & 896) | 54);
                        mVar10.f();
                    }
                } else {
                    mVar10.e();
                }
                return Unit.INSTANCE;
        }
    }
}
