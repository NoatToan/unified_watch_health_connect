package dj0;

import a42.f0;
import android.content.Context;
import b11.t;
import b21.b5;
import b63.v;
import b82.t0;
import b82.y1;
import c2.b0;
import c2.q2;
import c2.s2;
import c2.u;
import c2.u2;
import c2.x2;
import c2.y;
import c2.z;
import c22.o2;
import c22.x0;
import com.garmin.android.apps.connectmobile.R;
import d53.w;
import e11.c0;
import e2.i0;
import e23.p;
import f5.z0;
import h4.r;
import h5.e0;
import i3.h7;
import i3.mc;
import java.util.ArrayList;
import java.util.List;
import k11.a0;
import kotlin.t1;
import l72.c1;
import l72.i3;
import l72.p2;
import m4.q;
import o4.m1;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p006l2.a2;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.l1;
import p3.o1;
import p3.p0;
import p3.p1;
import p3.x1;
import p3.x3;
import r1.u0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class j implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f59920a = 5;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.a f59921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p1 f59922c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.l f59923d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.a f59924e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f59925f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f59926g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f59927h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f59928i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f59929j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f59930k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f59931l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f59932m;

    public /* synthetic */ j(aa1.e eVar, p pVar, l1 l1Var, e23.a aVar, e23.a aVar2, p1 p1Var, p pVar2, o1 o1Var, p1 p1Var2, e23.l lVar, e23.a aVar3, e23.l lVar2) {
        this.f59926g = eVar;
        this.f59927h = pVar;
        this.f59928i = l1Var;
        this.f59921b = aVar;
        this.f59924e = aVar2;
        this.f59922c = p1Var;
        this.f59929j = pVar2;
        this.f59930k = o1Var;
        this.f59931l = p1Var2;
        this.f59923d = lVar;
        this.f59932m = aVar3;
        this.f59925f = lVar2;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0432  */
    /* JADX WARN: Code duplicated, block: B:101:0x0439  */
    /* JADX WARN: Code duplicated, block: B:105:0x0460  */
    /* JADX WARN: Code duplicated, block: B:107:0x047b  */
    /* JADX WARN: Code duplicated, block: B:109:0x047e  */
    /* JADX WARN: Code duplicated, block: B:111:0x0481  */
    /* JADX WARN: Code duplicated, block: B:113:0x0484  */
    /* JADX WARN: Code duplicated, block: B:115:0x0487  */
    /* JADX WARN: Code duplicated, block: B:118:0x04a4  */
    /* JADX WARN: Code duplicated, block: B:120:0x04af  */
    /* JADX WARN: Code duplicated, block: B:121:0x04b6  */
    /* JADX WARN: Code duplicated, block: B:122:0x04bd  */
    /* JADX WARN: Code duplicated, block: B:127:0x0522  */
    /* JADX WARN: Code duplicated, block: B:131:0x055a  */
    /* JADX WARN: Code duplicated, block: B:136:0x0574  */
    /* JADX WARN: Code duplicated, block: B:138:0x059d  */
    /* JADX WARN: Code duplicated, block: B:140:0x05a9  */
    /* JADX WARN: Code duplicated, block: B:142:0x05af  */
    /* JADX WARN: Code duplicated, block: B:150:0x049c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0106  */
    /* JADX WARN: Code duplicated, block: B:25:0x010f  */
    /* JADX WARN: Code duplicated, block: B:26:0x0113  */
    /* JADX WARN: Code duplicated, block: B:31:0x0130  */
    /* JADX WARN: Code duplicated, block: B:34:0x0145  */
    /* JADX WARN: Code duplicated, block: B:37:0x0151  */
    /* JADX WARN: Code duplicated, block: B:40:0x016e  */
    /* JADX WARN: Code duplicated, block: B:41:0x017a  */
    /* JADX WARN: Code duplicated, block: B:44:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:46:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:47:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:52:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:58:0x0247  */
    /* JADX WARN: Code duplicated, block: B:68:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:87:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:90:0x03c6  */
    /* JADX WARN: Code duplicated, block: B:93:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:95:0x040d  */
    /* JADX WARN: Code duplicated, block: B:97:0x042d  */
    /* JADX WARN: Code duplicated, block: B:98:0x042f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private final Object a(Object obj, Object obj2) {
        e23.l lVar;
        h5.g.a.f fVar;
        s2 s2VarA;
        int iHashCode;
        i2 i2VarX;
        r rVarC;
        Object objQ;
        p3.m.a.C2565a c2565a;
        a2.j jVar;
        Object objQ2;
        p1 p1Var;
        Object objQ3;
        z0 z0VarD;
        int iHashCode2;
        i2 i2VarX2;
        r rVarC2;
        p1 p1Var2;
        boolean zR;
        Object objQ4;
        p3.m mVar;
        int iIndexOf;
        Integer numValueOf;
        Integer num;
        int iIntValue;
        ArrayList arrayList;
        m21.g gVar;
        p1 p1Var3;
        int i14;
        int i15;
        p3.m mVar2;
        int i16;
        int i17;
        int i18;
        String strH;
        boolean zR2;
        Object objQ5;
        boolean zR3;
        Object objQ6;
        boolean zR4;
        Object objQ7;
        m21.g gVar2 = (m21.g) this.f59926g;
        v21.e eVar = (v21.e) this.f59927h;
        p pVar = (p) this.f59928i;
        e23.l lVar2 = (e23.l) this.f59925f;
        e23.a aVar = (e23.a) this.f59929j;
        e23.l lVar3 = (e23.l) this.f59930k;
        e23.a aVar2 = (e23.a) this.f59931l;
        e23.a aVar3 = (e23.a) this.f59932m;
        p3.m mVar3 = (p3.m) obj;
        int iIntValue2 = ((Integer) obj2).intValue();
        if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            r.a aVar4 = r.S;
            r rVarD = c2.l.D(aVar4);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, mVar3, 0);
            int iHashCode3 = Long.hashCode(mVar3.getU());
            i2 i2VarX3 = mVar3.x();
            r rVarC3 = h4.k.c(rVarD, mVar3);
            h5.g.V.getClass();
            e0.a aVar5 = h5.g.a.f81805b;
            if (mVar3.F() == null) {
                p0.l();
                throw null;
            }
            mVar3.z();
            if (mVar3.getT()) {
                mVar3.M(aVar5);
            } else {
                mVar3.c();
            }
            h5.g.a.e eVar2 = h5.g.a.f81810g;
            b4.c(eVar2, zVarA, mVar3);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarX3, mVar3);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (mVar3.getT()) {
                lVar = lVar2;
            } else {
                lVar = lVar2;
                if (!s.g(mVar3.q(), Integer.valueOf(iHashCode3))) {
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC3, mVar3);
                b0 b0Var = b0.f22601a;
                r rVarE = u1.n.e(x2.f(aVar4, 1.0f), vb.h.e(d92.b.f58623a, mVar3), m1.f128891a);
                d92.b.f58625c.getClass();
                j92.e eVar3 = j92.b.f97899b;
                r rVarZ = c2.l.z(rVarE, eVar3.f97920e, eVar3.f97919d);
                s2VarA = q2.a(c2.j.f22692b, h4.d.a.f81534l, mVar3, 48);
                iHashCode = Long.hashCode(mVar3.getU());
                i2VarX = mVar3.x();
                rVarC = h4.k.c(rVarZ, mVar3);
                if (mVar3.F() != null) {
                    p0.l();
                    throw null;
                }
                mVar3.z();
                if (mVar3.getT()) {
                    mVar3.M(aVar5);
                } else {
                    mVar3.c();
                }
                b4.c(eVar2, s2VarA, mVar3);
                b4.c(c1623g, i2VarX, mVar3);
                if (mVar3.getT() || !s.g(mVar3.q(), Integer.valueOf(iHashCode))) {
                    v.h.z(iHashCode, mVar3, iHashCode, bVar);
                }
                b4.c(fVar, rVarC, mVar3);
                u2 u2Var = u2.f22900a;
                objQ = mVar3.q();
                p3.m.f135153a.getClass();
                c2565a = p3.m.a.f135155b;
                if (objQ == c2565a) {
                    objQ = tn.k.c(mVar3);
                }
                jVar = (a2.j) objQ;
                objQ2 = mVar3.q();
                if (objQ2 == c2565a) {
                    objQ2 = p0.n(Boolean.FALSE);
                    mVar3.K(objQ2);
                }
                p1Var = (p1) objQ2;
                q qVar = (q) mVar3.A(t1.f91491i);
                objQ3 = mVar3.q();
                if (objQ3 == c2565a) {
                    objQ3 = new l21.i.b(jVar, p1Var, null);
                    mVar3.K(objQ3);
                }
                l0.e((p) objQ3, jVar, mVar3);
                r rVarA = u2Var.a(aVar4, 1.0f, true);
                z0VarD = c2.q.d(h4.d.a.f81524b, false);
                iHashCode2 = Long.hashCode(mVar3.getU());
                i2VarX2 = mVar3.x();
                rVarC2 = h4.k.c(rVarA, mVar3);
                if (mVar3.F() != null) {
                    p0.l();
                    throw null;
                }
                mVar3.z();
                if (mVar3.getT()) {
                    mVar3.M(aVar5);
                } else {
                    mVar3.c();
                }
                b4.c(eVar2, z0VarD, mVar3);
                b4.c(c1623g, i2VarX2, mVar3);
                if (mVar3.getT() || !s.g(mVar3.q(), Integer.valueOf(iHashCode2))) {
                    v.h.z(iHashCode2, mVar3, iHashCode2, bVar);
                }
                b4.c(fVar, rVarC2, mVar3);
                u uVar = u.f22885a;
                t0 t0Var = t0.f16792a;
                r rVarF = x2.f(aVar4, 1.0f);
                long jA = n5.a.a(mVar3, R.color.default_text_inverted);
                p1Var2 = this.f59922c;
                String str = ((m21.e) p1Var2.getF182175a()).f116084a;
                String strQ = gl1.y.Q(mVar3, R.string.lbl_search);
                a2.f108340h.getClass();
                a2 a2Var = a2.f108341i;
                x5.p.f188918b.getClass();
                a2 a2Var2 = new a2(a2Var.f108342a, a2Var.f108343b, a2Var.f108344c, x5.p.f188922f, a2Var.f108346e, (Boolean) null, (z5.c) null, (p005kotlin.jvm.internal.j) null);
                zR = mVar3.r(gVar2) | mVar3.B(p1Var2);
                objQ4 = mVar3.q();
                if (zR || objQ4 == c2565a) {
                    objQ4 = new k41.e(28, gVar2, p1Var2);
                    mVar3.K(objQ4);
                }
                t0Var.g(rVarF, str, strQ, a2Var2, jVar, jA, (p) objQ4, mVar3, 24582, 0);
                mVar = mVar3;
                if (((Boolean) p1Var.getF182175a()).booleanValue() || ((m21.e) p1Var2.getF182175a()).f116084a.length() != 0) {
                    mVar.C(-1162554002);
                    mVar.f();
                } else {
                    mVar.C(-1163241117);
                    boolean zR5 = mVar.r(qVar);
                    Object objQ8 = mVar.q();
                    if (zR5 || objQ8 == c2565a) {
                        objQ8 = new au0.j(qVar, 1);
                        mVar.K(objQ8);
                    }
                    r rVarQ = x2.q(c2.l.C(uVar.c(aVar4, h4.d.a.f81529g), 0.0f, 0.0f, eVar3.f97918c, 0.0f, 11), j92.b.f97901d.f97904c);
                    l21.c.f109076a.getClass();
                    h7.a((e23.a) objQ8, rVarQ, false, null, null, l21.c.f109077b, mVar, 1572864, 60);
                    mVar = mVar;
                    mVar.f();
                }
                mVar.y();
                if (((Boolean) p1Var.getF182175a()).booleanValue() && ((m21.e) p1Var2.getF182175a()).f116103t) {
                    mVar.C(503814241);
                    r rVarE2 = u1.n.e(x2.q(c2.l.C(aVar4, eVar3.f97918c, 0.0f, 0.0f, 0.0f, 14), eVar3.f97922g), d92.b.a(mVar).d().a().a(), k2.i.f102406a);
                    z0 z0VarD2 = c2.q.d(h4.d.a.f81528f, false);
                    int iHashCode4 = Long.hashCode(mVar.getU());
                    i2 i2VarX4 = mVar.x();
                    r rVarC4 = h4.k.c(rVarE2, mVar);
                    if (mVar.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar.z();
                    if (mVar.getT()) {
                        mVar.M(aVar5);
                    } else {
                        mVar.c();
                    }
                    b4.c(eVar2, z0VarD2, mVar);
                    b4.c(c1623g, i2VarX4, mVar);
                    if (mVar.getT() || !s.g(mVar.q(), Integer.valueOf(iHashCode4))) {
                        v.h.z(iHashCode4, mVar, iHashCode4, bVar);
                    }
                    b4.c(fVar, rVarC4, mVar);
                    r rVarQ2 = x2.q(aVar4, eVar3.f97921f);
                    l21.c.f109076a.getClass();
                    p3.m mVar4 = mVar;
                    h7.a(this.f59921b, rVarQ2, false, null, null, l21.c.f109078c, mVar4, 1572864, 60);
                    mVar = mVar4;
                    mVar.y();
                    mVar.f();
                } else {
                    mVar.C(504908820);
                    mVar.f();
                }
                mVar.y();
                if (((m21.e) p1Var2.getF182175a()).f116096m) {
                    mVar.C(1327878623);
                    List<String> list = ((m21.e) p1Var2.getF182175a()).f116094k;
                    boolean z14 = ((m21.e) p1Var2.getF182175a()).f116095l;
                    zR4 = mVar.r(gVar2);
                    objQ7 = mVar.q();
                    if (zR4 || objQ7 == c2565a) {
                        objQ7 = new b5(gVar2, 2);
                        mVar.K(objQ7);
                    }
                    p3.m mVar5 = mVar;
                    j21.k.b(list, null, z14, (e23.l) objQ7, mVar5, 0, 2);
                    mVar2 = mVar5;
                    mVar2.f();
                    gVar = gVar2;
                    p1Var3 = p1Var2;
                    i15 = 0;
                    i14 = 1;
                } else {
                    mVar.C(1328385938);
                    iIndexOf = ((m21.e) p1Var2.getF182175a()).f116092i.indexOf(((m21.e) p1Var2.getF182175a()).f116093j);
                    numValueOf = Integer.valueOf(iIndexOf);
                    if (iIndexOf >= 0) {
                        num = numValueOf;
                    } else {
                        num = null;
                    }
                    if (num != null) {
                        iIntValue = num.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    y1 y1Var = y1.f16902a;
                    mVar.C(874135103);
                    i53.c<k21.a> cVar = ((m21.e) p1Var2.getF182175a()).f116092i;
                    arrayList = new ArrayList(p13.y.r(cVar, 10));
                    for (k21.a aVar6 : cVar) {
                        k21.a.f102445a.getClass();
                        aVar6.getClass();
                        x1 x1Var2 = p3.n.f135158a;
                        i16 = k21.a.C1965a.C1966a.f102453a[aVar6.ordinal()];
                        if (i16 != 1) {
                            i17 = -1190332357;
                            i18 = R.string.common_all;
                        } else if (i16 != 2) {
                            i17 = -1190330114;
                            i18 = R.string.lbl_favorites;
                        } else if (i16 != 3) {
                            if (i16 != 4) {
                                i17 = -1190325671;
                                i18 = R.string.my_meals;
                            } else {
                                if (i16 == 5) {
                                    throw n23.j.m(mVar, -1190333213);
                                }
                                mVar.C(-1190323462);
                                x0.f23314a.getClass();
                                strH = gl1.d.W(x0.f23614re);
                                mVar.f();
                            }
                            arrayList.add(strH);
                        } else {
                            i17 = -1190327815;
                            i18 = R.string.my_foods;
                        }
                        strH = sn.a.h(mVar, i17, i18, mVar);
                        arrayList.add(strH);
                    }
                    mVar.f();
                    i53.f fVarJ = i53.a.j(arrayList);
                    gVar = gVar2;
                    p1Var3 = p1Var2;
                    z3.e eVarC = z3.f.c(-73647082, new fo.i(p1Var3, gVar, eVar, this.f59923d, pVar, lVar, this.f59924e, aVar, lVar3, aVar2, aVar3), mVar);
                    y1 y1Var2 = y1.f16902a;
                    i14 = 1;
                    i15 = 0;
                    p3.m mVar6 = mVar;
                    y1Var.c(fVarJ, iIntValue, true, true, true, 0L, 0L, eVarC, mVar6, 12610944, 96);
                    mVar2 = mVar6;
                    mVar2.f();
                }
                mVar2.y();
                if (((m21.e) p1Var3.getF182175a()).f116090g) {
                    mVar2.C(-353561927);
                    c1 c1Var = c1.f110940a;
                    x0.f23314a.getClass();
                    String strW = gl1.d.W(x0.f23347be);
                    String strV = gl1.d.V(x0.f23713xf, new Object[]{50});
                    String strQ2 = gl1.y.Q(mVar2, R.string.lbl_ok);
                    zR2 = mVar2.r(gVar);
                    objQ5 = mVar2.q();
                    if (zR2 || objQ5 == p3.m.a.f135155b) {
                        objQ5 = new l21.f(gVar, i15);
                        mVar2.K(objQ5);
                    }
                    e23.a<Unit> aVar7 = (e23.a) objQ5;
                    zR3 = mVar2.r(gVar);
                    objQ6 = mVar2.q();
                    if (zR3 || objQ6 == p3.m.a.f135155b) {
                        objQ6 = new l21.f(gVar, i14);
                        mVar2.K(objQ6);
                    }
                    p3.m mVar7 = mVar2;
                    c1Var.a(true, strW, strV, null, null, strQ2, false, false, aVar7, null, (e23.a) objQ6, mVar7, 6, 0, 728);
                    mVar7.f();
                } else {
                    mVar2.C(-353080466);
                    mVar2.f();
                }
                x1 x1Var3 = p3.n.f135158a;
            }
            v.h.z(iHashCode3, mVar3, iHashCode3, bVar);
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC3, mVar3);
            b0 b0Var2 = b0.f22601a;
            r rVarE3 = u1.n.e(x2.f(aVar4, 1.0f), vb.h.e(d92.b.f58623a, mVar3), m1.f128891a);
            d92.b.f58625c.getClass();
            j92.e eVar4 = j92.b.f97899b;
            r rVarZ2 = c2.l.z(rVarE3, eVar4.f97920e, eVar4.f97919d);
            s2VarA = q2.a(c2.j.f22692b, h4.d.a.f81534l, mVar3, 48);
            iHashCode = Long.hashCode(mVar3.getU());
            i2VarX = mVar3.x();
            rVarC = h4.k.c(rVarZ2, mVar3);
            if (mVar3.F() != null) {
                p0.l();
                throw null;
            }
            mVar3.z();
            if (mVar3.getT()) {
                mVar3.M(aVar5);
            } else {
                mVar3.c();
            }
            b4.c(eVar2, s2VarA, mVar3);
            b4.c(c1623g, i2VarX, mVar3);
            if (mVar3.getT()) {
                v.h.z(iHashCode, mVar3, iHashCode, bVar);
            } else {
                v.h.z(iHashCode, mVar3, iHashCode, bVar);
            }
            b4.c(fVar, rVarC, mVar3);
            u2 u2Var2 = u2.f22900a;
            objQ = mVar3.q();
            p3.m.f135153a.getClass();
            c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = tn.k.c(mVar3);
            }
            jVar = (a2.j) objQ;
            objQ2 = mVar3.q();
            if (objQ2 == c2565a) {
                objQ2 = p0.n(Boolean.FALSE);
                mVar3.K(objQ2);
            }
            p1Var = (p1) objQ2;
            q qVar2 = (q) mVar3.A(t1.f91491i);
            objQ3 = mVar3.q();
            if (objQ3 == c2565a) {
                objQ3 = new l21.i.b(jVar, p1Var, null);
                mVar3.K(objQ3);
            }
            l0.e((p) objQ3, jVar, mVar3);
            r rVarA2 = u2Var2.a(aVar4, 1.0f, true);
            z0VarD = c2.q.d(h4.d.a.f81524b, false);
            iHashCode2 = Long.hashCode(mVar3.getU());
            i2VarX2 = mVar3.x();
            rVarC2 = h4.k.c(rVarA2, mVar3);
            if (mVar3.F() != null) {
                p0.l();
                throw null;
            }
            mVar3.z();
            if (mVar3.getT()) {
                mVar3.M(aVar5);
            } else {
                mVar3.c();
            }
            b4.c(eVar2, z0VarD, mVar3);
            b4.c(c1623g, i2VarX2, mVar3);
            if (mVar3.getT()) {
                v.h.z(iHashCode2, mVar3, iHashCode2, bVar);
            } else {
                v.h.z(iHashCode2, mVar3, iHashCode2, bVar);
            }
            b4.c(fVar, rVarC2, mVar3);
            u uVar2 = u.f22885a;
            t0 t0Var2 = t0.f16792a;
            r rVarF2 = x2.f(aVar4, 1.0f);
            long jA2 = n5.a.a(mVar3, R.color.default_text_inverted);
            p1Var2 = this.f59922c;
            String str2 = ((m21.e) p1Var2.getF182175a()).f116084a;
            String strQ3 = gl1.y.Q(mVar3, R.string.lbl_search);
            a2.f108340h.getClass();
            a2 a2Var3 = a2.f108341i;
            x5.p.f188918b.getClass();
            a2 a2Var4 = new a2(a2Var3.f108342a, a2Var3.f108343b, a2Var3.f108344c, x5.p.f188922f, a2Var3.f108346e, (Boolean) null, (z5.c) null, (p005kotlin.jvm.internal.j) null);
            zR = mVar3.r(gVar2) | mVar3.B(p1Var2);
            objQ4 = mVar3.q();
            if (zR) {
                objQ4 = new k41.e(28, gVar2, p1Var2);
                mVar3.K(objQ4);
            } else {
                objQ4 = new k41.e(28, gVar2, p1Var2);
                mVar3.K(objQ4);
            }
            t0Var2.g(rVarF2, str2, strQ3, a2Var4, jVar, jA2, (p) objQ4, mVar3, 24582, 0);
            mVar = mVar3;
            if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                mVar.C(-1162554002);
                mVar.f();
            } else {
                mVar.C(-1162554002);
                mVar.f();
            }
            mVar.y();
            if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                mVar.C(504908820);
                mVar.f();
            } else {
                mVar.C(504908820);
                mVar.f();
            }
            mVar.y();
            if (((m21.e) p1Var2.getF182175a()).f116096m) {
                mVar.C(1327878623);
                List<String> list2 = ((m21.e) p1Var2.getF182175a()).f116094k;
                boolean z15 = ((m21.e) p1Var2.getF182175a()).f116095l;
                zR4 = mVar.r(gVar2);
                objQ7 = mVar.q();
                if (zR4) {
                    objQ7 = new b5(gVar2, 2);
                    mVar.K(objQ7);
                } else {
                    objQ7 = new b5(gVar2, 2);
                    mVar.K(objQ7);
                }
                p3.m mVar8 = mVar;
                j21.k.b(list2, null, z15, (e23.l) objQ7, mVar8, 0, 2);
                mVar2 = mVar8;
                mVar2.f();
                gVar = gVar2;
                p1Var3 = p1Var2;
                i15 = 0;
                i14 = 1;
            } else {
                mVar.C(1328385938);
                iIndexOf = ((m21.e) p1Var2.getF182175a()).f116092i.indexOf(((m21.e) p1Var2.getF182175a()).f116093j);
                numValueOf = Integer.valueOf(iIndexOf);
                if (iIndexOf >= 0) {
                    num = numValueOf;
                } else {
                    num = null;
                }
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 0;
                }
                y1 y1Var3 = y1.f16902a;
                mVar.C(874135103);
                i53.c<k21.a> cVar2 = ((m21.e) p1Var2.getF182175a()).f116092i;
                arrayList = new ArrayList(p13.y.r(cVar2, 10));
                while (r2.hasNext()) {
                    k21.a.f102445a.getClass();
                    aVar6.getClass();
                    x1 x1Var4 = p3.n.f135158a;
                    i16 = k21.a.C1965a.C1966a.f102453a[aVar6.ordinal()];
                    if (i16 != 1) {
                        i17 = -1190332357;
                        i18 = R.string.common_all;
                    } else if (i16 != 2) {
                        i17 = -1190330114;
                        i18 = R.string.lbl_favorites;
                    } else if (i16 != 3) {
                        if (i16 != 4) {
                            i17 = -1190325671;
                            i18 = R.string.my_meals;
                        } else {
                            if (i16 == 5) {
                                throw n23.j.m(mVar, -1190333213);
                            }
                            mVar.C(-1190323462);
                            x0.f23314a.getClass();
                            strH = gl1.d.W(x0.f23614re);
                            mVar.f();
                        }
                        arrayList.add(strH);
                    } else {
                        i17 = -1190327815;
                        i18 = R.string.my_foods;
                    }
                    strH = sn.a.h(mVar, i17, i18, mVar);
                    arrayList.add(strH);
                }
                mVar.f();
                i53.f fVarJ2 = i53.a.j(arrayList);
                gVar = gVar2;
                p1Var3 = p1Var2;
                z3.e eVarC2 = z3.f.c(-73647082, new fo.i(p1Var3, gVar, eVar, this.f59923d, pVar, lVar, this.f59924e, aVar, lVar3, aVar2, aVar3), mVar);
                y1 y1Var4 = y1.f16902a;
                i14 = 1;
                i15 = 0;
                p3.m mVar9 = mVar;
                y1Var3.c(fVarJ2, iIntValue, true, true, true, 0L, 0L, eVarC2, mVar9, 12610944, 96);
                mVar2 = mVar9;
                mVar2.f();
            }
            mVar2.y();
            if (((m21.e) p1Var3.getF182175a()).f116090g) {
                mVar2.C(-353561927);
                c1 c1Var2 = c1.f110940a;
                x0.f23314a.getClass();
                String strW2 = gl1.d.W(x0.f23347be);
                String strV2 = gl1.d.V(x0.f23713xf, new Object[]{50});
                String strQ4 = gl1.y.Q(mVar2, R.string.lbl_ok);
                zR2 = mVar2.r(gVar);
                objQ5 = mVar2.q();
                if (zR2) {
                    objQ5 = new l21.f(gVar, i15);
                    mVar2.K(objQ5);
                } else {
                    objQ5 = new l21.f(gVar, i15);
                    mVar2.K(objQ5);
                }
                e23.a<Unit> aVar8 = (e23.a) objQ5;
                zR3 = mVar2.r(gVar);
                objQ6 = mVar2.q();
                if (zR3) {
                    objQ6 = new l21.f(gVar, i14);
                    mVar2.K(objQ6);
                } else {
                    objQ6 = new l21.f(gVar, i14);
                    mVar2.K(objQ6);
                }
                p3.m mVar10 = mVar2;
                c1Var2.a(true, strW2, strV2, null, null, strQ4, false, false, aVar8, null, (e23.a) objQ6, mVar10, 6, 0, 728);
                mVar10.f();
            } else {
                mVar2.C(-353080466);
                mVar2.f();
            }
            x1 x1Var5 = p3.n.f135158a;
        } else {
            mVar3.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0418  */
    /* JADX WARN: Code duplicated, block: B:114:0x0458  */
    /* JADX WARN: Code duplicated, block: B:124:0x04ec  */
    /* JADX WARN: Code duplicated, block: B:193:0x0795  */
    /* JADX WARN: Code duplicated, block: B:233:0x0928  */
    /* JADX WARN: Code duplicated, block: B:30:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:40:0x0164  */
    /* JADX WARN: Code duplicated, block: B:49:0x01de  */
    /* JADX WARN: Code duplicated, block: B:54:0x0205  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14;
        i53.c cVar;
        i53.f fVar;
        i53.c cVarE;
        gs1.d.c payload;
        List<gs1.d.b> listB;
        String str;
        int i15 = this.f59920a;
        p3.m.a aVar = p3.m.f135153a;
        Object obj3 = this.f59925f;
        Object obj4 = this.f59932m;
        Object obj5 = this.f59931l;
        Object obj6 = this.f59930k;
        Object obj7 = this.f59929j;
        Object obj8 = this.f59928i;
        Object obj9 = this.f59927h;
        Object obj10 = this.f59926g;
        switch (i15) {
            case 0:
                i53.f fVar2 = (i53.f) obj10;
                n82.f fVar3 = (n82.f) obj9;
                n82.b bVar = fVar3.f124961b;
                yd1.a aVar2 = (yd1.a) obj8;
                u82.d dVar = (u82.d) obj7;
                u82.d dVar2 = (u82.d) obj6;
                yi0.c cVar2 = (yi0.c) obj5;
                yi0.b bVar2 = (yi0.b) obj4;
                e23.l lVar = (e23.l) obj3;
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    r.a aVar3 = r.S;
                    r rVarE = u1.n.e(x2.d(aVar3, 1.0f), vb.h.e(d92.b.f58623a, mVar), m1.f128891a);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    z zVarA = y.a(kVar, h4.d.a.f81536n, mVar, 0);
                    int iHashCode = Long.hashCode(mVar.getU());
                    i2 i2VarX = mVar.x();
                    r rVarC = h4.k.c(rVarE, mVar);
                    h5.g.V.getClass();
                    e0.a aVar4 = h5.g.a.f81805b;
                    if (mVar.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar.z();
                    if (mVar.getT()) {
                        mVar.M(aVar4);
                    } else {
                        mVar.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, mVar);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar);
                    h5.g.a.b bVar3 = h5.g.a.f81813j;
                    if (mVar.getT() || !s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar, iHashCode, bVar3);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar);
                    b0 b0Var = b0.f22601a;
                    i53.c cVarE2 = i53.a.e(o2.b(fVar2, mVar));
                    int iIndexOf = fVar2.indexOf(bVar.a());
                    boolean zB = mVar.B(fVar3);
                    Object objQ = mVar.q();
                    if (zB) {
                        objQ = new f0(fVar3, fVar2, 4);
                        mVar.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new f0(fVar3, fVar2, 4);
                            mVar.K(objQ);
                        }
                    }
                    p3.m mVar2 = mVar;
                    t82.c.a(cVarE2, null, iIndexOf, 0.0f, (e23.l) objQ, mVar2, 0, 26);
                    if (bVar.a() != o82.g.f130849b) {
                        mVar2.C(-1826594744);
                        q82.a.a(x2.f(aVar3, 1.0f), new n82.n(fVar3, aVar2), null, mVar2, 6, 4);
                        mVar2 = mVar2;
                        mVar2.f();
                    } else {
                        mVar2.C(-1826386207);
                        mVar2.f();
                    }
                    n82.c.a(b0Var.a(aVar3, 1.0f, true), fVar3, 3, false, z3.f.c(791527615, new l(dVar, dVar2, cVar2, this.f59923d, this.f59921b, this.f59924e, this.f59922c, bVar2, lVar), mVar2), mVar2, 24960, 8);
                    mVar2.y();
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                o51.d dVar3 = (o51.d) obj10;
                m3.r rVar = (m3.r) obj9;
                o1 o1Var = (o1) obj8;
                i0 i0Var = (i0) obj7;
                e23.l lVar2 = (e23.l) obj3;
                e23.l lVar3 = (e23.l) obj6;
                p1 p1Var = (p1) obj5;
                e23.a aVar5 = (e23.a) obj4;
                p3.m mVar3 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    m3.l.b(dVar3.f129224b, this.f59921b, x2.d(r.S, 1.0f), rVar, null, z3.f.c(-265838320, new c0(25, dVar3, rVar), mVar3), z3.f.c(147067887, new a11.l(this.f59922c, this.f59923d, o1Var, dVar3, this.f59924e, i0Var, lVar2, lVar3, p1Var, aVar5), mVar3), mVar3, 1769856, 16);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 2:
                yb0.a aVar6 = (yb0.a) obj10;
                x3 x3Var = (x3) obj9;
                x3 x3Var2 = (x3) obj8;
                x3 x3Var3 = (x3) obj7;
                Context context = (Context) obj6;
                o53.b0 b0Var2 = (o53.b0) obj5;
                mc mcVar = (mc) obj3;
                qo0.a aVar7 = (qo0.a) obj4;
                p3.m mVar4 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (mVar4.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    if (((qo0.d) x3Var.getF182175a()).f145950d) {
                        mVar4.C(-1588834285);
                        String strQ = gl1.y.Q(mVar4, R.string.activity_details_heart_rate);
                        o82.g gVar = ((qo0.d) x3Var.getF182175a()).f145952f;
                        o82.g gVar2 = o82.g.f130850c;
                        p1 p1Var2 = this.f59922c;
                        if (gVar == gVar2) {
                            mVar4.C(-1588691964);
                            gs1.d dVar4 = (gs1.d) x3Var2.getF182175a();
                            boolean z14 = (dVar4 == null || (payload = dVar4.getPayload()) == null || (listB = payload.b()) == null || !(listB.isEmpty() ^ true)) ? false : true;
                            boolean z15 = aVar6.f195679b.h() > 0;
                            ArrayList<o13.p> arrayList = new ArrayList();
                            i14 = R.string.lbl_help;
                            boolean z16 = z14;
                            arrayList.add(new o13.p("MENU_ITEM_HELP_ID", Integer.valueOf(R.string.lbl_help)));
                            if (z15) {
                                arrayList.add(new o13.p("MENU_ITEM_ABNORMAL_HEART_RATE", Integer.valueOf(R.string.device_settings_abnormal_hr_settings)));
                            }
                            if (z16) {
                                arrayList.add(new o13.p("MENU_ITEM_DELETE_ABNORMAL_HEART_RATE", Integer.valueOf(R.string.lbl_delete_abnormal_hr)));
                            }
                            if (arrayList.size() == 1) {
                                mVar4.C(-1588396565);
                                mVar4.f();
                                p1Var2.setValue(Boolean.FALSE);
                                cVarE = null;
                            } else {
                                mVar4.C(-1588268969);
                                p1Var2.setValue(Boolean.TRUE);
                                ArrayList arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
                                for (o13.p pVar : arrayList) {
                                    arrayList2.add(new i3((String) pVar.f128594a, gl1.y.Q(mVar4, ((Number) pVar.f128595b).intValue()), false, (u4.d) null, (String) null, 28, (p005kotlin.jvm.internal.j) null));
                                }
                                cVarE = i53.a.e(arrayList2);
                                mVar4.f();
                            }
                            mVar4.f();
                            cVar = cVarE;
                        } else {
                            i14 = R.string.lbl_help;
                            mVar4.C(-1588037833);
                            mVar4.f();
                            p1Var2.setValue(Boolean.FALSE);
                            cVar = null;
                        }
                        if (((Boolean) p1Var2.getF182175a()).booleanValue()) {
                            mVar4.C(-1587720889);
                            mVar4.f();
                            fVar = null;
                        } else {
                            mVar4.C(-1587871890);
                            i53.f fVarA = i53.a.a(new i3("MENU_ITEM_HELP_ID", gl1.y.Q(mVar4, i14), false, (u4.d) null, (String) null, 28, (p005kotlin.jvm.internal.j) null));
                            mVar4.f();
                            fVar = fVarA;
                        }
                        boolean zB2 = mVar4.B(x3Var) | mVar4.B(x3Var2) | mVar4.B(x3Var3) | mVar4.r(context) | mVar4.r(aVar6);
                        e23.l lVar4 = this.f59923d;
                        boolean zB3 = zB2 | mVar4.B(lVar4);
                        e23.a aVar8 = this.f59924e;
                        boolean zB4 = zB3 | mVar4.B(aVar8) | mVar4.r(b0Var2) | mVar4.B(mcVar) | mVar4.r(aVar7);
                        Object objQ2 = mVar4.q();
                        if (zB4) {
                            av0.c cVar3 = new av0.c(context, aVar6, lVar4, aVar8, x3Var, x3Var2, x3Var3, b0Var2, aVar7, mcVar);
                            mVar4.K(cVar3);
                            objQ2 = cVar3;
                        } else {
                            aVar.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                av0.c cVar4 = new av0.c(context, aVar6, lVar4, aVar8, x3Var, x3Var2, x3Var3, b0Var2, aVar7, mcVar);
                                mVar4.K(cVar4);
                                objQ2 = cVar4;
                            }
                        }
                        z02.f.d(strQ, null, null, this.f59921b, fVar, cVar, (e23.l) objQ2, mVar4, 2359296, 22);
                        mVar4.f();
                    } else {
                        mVar4.C(-1584495773);
                        mVar4.f();
                    }
                    x1 x1Var4 = p3.n.f135158a;
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 3:
                l11.s sVar = (l11.s) obj10;
                mc mcVar2 = (mc) obj9;
                v21.e eVar = (v21.e) obj8;
                e23.l lVar5 = (e23.l) obj3;
                e23.l lVar6 = (e23.l) obj7;
                e23.l lVar7 = (e23.l) obj6;
                o53.b0 b0Var3 = (o53.b0) obj5;
                e23.l lVar8 = (e23.l) obj4;
                p3.m mVar5 = (p3.m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (mVar5.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var5 = p3.n.f135158a;
                    l11.r rVar2 = sVar.f108238b;
                    b11.l lVar9 = sVar.f108239c;
                    if (rVar2 != null) {
                        String str2 = rVar2.f108235f;
                        boolean z17 = rVar2.f108234e;
                        mVar5.C(1886404252);
                        b11.i.b bVar4 = rVar2.f108230a;
                        r.a aVar9 = r.S;
                        long jA = tn.k.a(d92.b.f58623a, mVar5);
                        m1.a aVar10 = m1.f128891a;
                        r rVarB = u1.a2.b(c2.l.D(u1.n.e(aVar9, jA, aVar10)), u1.a2.a(mVar5), true);
                        h4.d.f81522a.getClass();
                        h4.g.a aVar11 = h4.d.a.f81537o;
                        c2.j.f22691a.getClass();
                        z zVarA2 = y.a(c2.j.f22694d, aVar11, mVar5, 48);
                        int iHashCode2 = Long.hashCode(mVar5.getU());
                        i2 i2VarX2 = mVar5.x();
                        r rVarC2 = h4.k.c(rVarB, mVar5);
                        h5.g.V.getClass();
                        e0.a aVar12 = h5.g.a.f81805b;
                        if (mVar5.F() == null) {
                            p0.l();
                            throw null;
                        }
                        mVar5.z();
                        if (mVar5.getT()) {
                            mVar5.M(aVar12);
                        } else {
                            mVar5.c();
                        }
                        b4.c(h5.g.a.f81810g, zVarA2, mVar5);
                        b4.c(h5.g.a.f81809f, i2VarX2, mVar5);
                        h5.g.a.b bVar5 = h5.g.a.f81813j;
                        if (mVar5.getT() || !s.g(mVar5.q(), Integer.valueOf(iHashCode2))) {
                            v.h.z(iHashCode2, mVar5, iHashCode2, bVar5);
                        }
                        b4.c(h5.g.a.f81807d, rVarC2, mVar5);
                        b0 b0Var4 = b0.f22601a;
                        b11.d dVar5 = bVar4.f14311g;
                        double d14 = bVar4.f14308d;
                        b11.s sVar2 = bVar4.f14312h;
                        String str3 = dVar5.f14256d;
                        String str4 = dVar5.f14254b;
                        t tVar = bVar4.f14314j;
                        String str5 = tVar.f14379b;
                        if (str5 == null && (str5 = tVar.f14378a) == null) {
                            str5 = tVar.f14380c;
                        }
                        i11.e.a(24576, z3.f.c(221295881, new hl1.j(bVar4, sVar, lVar8, this.f59921b, this.f59924e, this.f59922c), mVar5), null, str3, str4, str5, mVar5);
                        d92.b.f58625c.getClass();
                        j92.e eVar2 = j92.b.f97899b;
                        float f14 = eVar2.f97920e;
                        c2.l.f(x2.h(aVar9, f14), mVar5);
                        double d15 = bVar4.f14308d;
                        a11.r rVar3 = sVar.f108246j;
                        l11.t.c cVar5 = sVar.f108237a;
                        i11.k.a(d15, rVar3, this.f59923d, eVar, cVar5 instanceof l11.t.c.f, cVar5 instanceof l11.t.c.k, lVar5, mVar5, 0);
                        a0.e(bVar4, mVar5, 0);
                        c2.l.f(x2.h(aVar9, f14), mVar5);
                        if (lVar9 == null) {
                            mVar5.C(-641817075);
                            mVar5.f();
                            str = null;
                        } else {
                            mVar5.C(672032884);
                            String strA = lVar9.a(w2.a0.s(mVar5));
                            mVar5.f();
                            str = strA;
                        }
                        if (sVar.f108250n) {
                            mVar5.C(-641699801);
                            if (z17) {
                                mVar5.C(-641294538);
                                mVar5.f();
                            } else {
                                mVar5.C(-641636375);
                                i53.c<b11.l> cVar6 = rVar2.f108233d;
                                Long lValueOf = lVar9 != null ? Long.valueOf(lVar9.f14331a) : null;
                                boolean z18 = rVar2.f108236g;
                                boolean zB5 = mVar5.B(lVar6);
                                Object objQ3 = mVar5.q();
                                if (zB5) {
                                    objQ3 = new k11.n(lVar6, 2);
                                    mVar5.K(objQ3);
                                } else {
                                    aVar.getClass();
                                    if (objQ3 == p3.m.a.f135155b) {
                                        objQ3 = new k11.n(lVar6, 2);
                                        mVar5.K(objQ3);
                                    }
                                }
                                y01.p.a(null, cVar6, lValueOf, (e23.l) objQ3, z18, mVar5, 0, 1);
                                mVar5.f();
                            }
                            v vVar = bVar4.f14307c;
                            Boolean boolValueOf = Boolean.valueOf(z17);
                            boolean zB6 = mVar5.B(lVar7);
                            Object objQ4 = mVar5.q();
                            if (zB6) {
                                objQ4 = new k11.n(lVar7, 3);
                                mVar5.K(objQ4);
                            } else {
                                aVar.getClass();
                                if (objQ4 == p3.m.a.f135155b) {
                                    objQ4 = new k11.n(lVar7, 3);
                                    mVar5.K(objQ4);
                                }
                            }
                            y01.n.a(eVar, vVar, str, boolValueOf, (e23.l) objQ4, mVar5, 0);
                            c2.l.f(x2.h(aVar9, f14), mVar5);
                            mVar5.f();
                        } else {
                            mVar5.C(-640885834);
                            mVar5.f();
                        }
                        r rVarY = c2.l.y(u1.n.e(aVar9, d92.b.a(mVar5).c().c(), aVar10), f14);
                        g21.f0 f0VarC = sVar2.f14375d.g().a().c(d14);
                        float f15 = eVar2.f97921f;
                        i53.c cVarB = sVar.f108244h;
                        if (cVarB == null) {
                            cVarB = j53.l.b();
                        }
                        y01.r.a(rVarY, eVar, f0VarC, f15, false, cVarB, mVar5, 0, 16);
                        p2 p2Var = p2.f111205a;
                        String strQ2 = gl1.y.Q(mVar5, R.string.view_full_nutrition);
                        boolean zR = mVar5.r(b0Var3) | mVar5.B(mcVar2);
                        Object objQ5 = mVar5.q();
                        if (zR) {
                            objQ5 = new cn1.t(b0Var3, mcVar2, 26);
                            mVar5.K(objQ5);
                        } else {
                            aVar.getClass();
                            if (objQ5 == p3.m.a.f135155b) {
                                objQ5 = new cn1.t(b0Var3, mcVar2, 26);
                                mVar5.K(objQ5);
                            }
                        }
                        p2Var.g(strQ2, null, null, null, null, false, false, (e23.a) objQ5, mVar5, 0, 254);
                        c2.l.f(x2.h(aVar9, f14), mVar5);
                        g21.h hVar = rVar2.f108232c;
                        g21.u uVar = hVar.f75428e;
                        b11.f fVar4 = sVar.f108242f;
                        if (fVar4 == null) {
                            fVar4 = hVar.f75429f;
                        }
                        g21.f0 f0VarG = fVar4.g();
                        g21.u uVar2 = sVar.f108241e;
                        g21.f0 f0Var = sVar.f108243g;
                        g21.f0 f0VarC2 = sVar2.f14375d.g().c(d14);
                        i53.c cVarB2 = sVar.f108245i;
                        if (cVarB2 == null) {
                            cVarB2 = j53.l.b();
                        }
                        z01.f.a(eVar, uVar, f0VarG, str, f0Var, uVar2, f0VarC2, cVarB2, mVar5, 0);
                        c2.l.f(x2.h(aVar9, f14), mVar5);
                        if (str2 == null || w.J(str2)) {
                            mVar5.C(-638984170);
                            mVar5.f();
                        } else {
                            mVar5.C(-639056245);
                            a0.a(str2, mVar5, 0);
                            mVar5.f();
                        }
                        mVar5.y();
                        r1.c0.e(mcVar2.e(), null, u0.l(), null, null, z3.f.c(-2006355442, new fb0.b(mcVar2, b0Var3, bVar4, eVar, 19), mVar5), mVar5, 196992, 26);
                        mVar5.f();
                    } else {
                        mVar5.C(1891857927);
                        mVar5.f();
                    }
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 4:
                return a(obj, obj2);
            default:
                aa1.e eVar3 = (aa1.e) obj10;
                p pVar2 = (p) obj9;
                l1 l1Var = (l1) obj8;
                p pVar3 = (p) obj7;
                o1 o1Var2 = (o1) obj6;
                p1 p1Var3 = (p1) obj5;
                e23.a aVar13 = (e23.a) obj4;
                e23.l lVar10 = (e23.l) obj3;
                p3.m mVar6 = (p3.m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (mVar6.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x1 x1Var6 = p3.n.f135158a;
                    if (eVar3.f2262d == null) {
                        mVar6.C(2138262954);
                        mVar6.f();
                    } else {
                        mVar6.C(2138262955);
                        if (eVar3.f2260b) {
                            mVar6.C(-1729898249);
                            r rVarD = x2.d(r.S, 1.0f);
                            h4.d.f81522a.getClass();
                            z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
                            int iHashCode3 = Long.hashCode(mVar6.getU());
                            i2 i2VarX3 = mVar6.x();
                            r rVarC3 = h4.k.c(rVarD, mVar6);
                            h5.g.V.getClass();
                            e0.a aVar14 = h5.g.a.f81805b;
                            if (mVar6.F() == null) {
                                p0.l();
                                throw null;
                            }
                            mVar6.z();
                            if (mVar6.getT()) {
                                mVar6.M(aVar14);
                            } else {
                                mVar6.c();
                            }
                            b4.c(h5.g.a.f81810g, z0VarD, mVar6);
                            b4.c(h5.g.a.f81809f, i2VarX3, mVar6);
                            h5.g.a.b bVar6 = h5.g.a.f81813j;
                            if (mVar6.getT() || !s.g(mVar6.q(), Integer.valueOf(iHashCode3))) {
                                v.h.z(iHashCode3, mVar6, iHashCode3, bVar6);
                            }
                            b4.c(h5.g.a.f81807d, rVarC3, mVar6);
                            u uVar3 = u.f22885a;
                            boolean zB7 = mVar6.B(lVar10) | mVar6.r(eVar3);
                            Object objQ6 = mVar6.q();
                            if (zB7) {
                                objQ6 = new wz1.c(12, lVar10, eVar3);
                                mVar6.K(objQ6);
                            } else {
                                aVar.getClass();
                                if (objQ6 == p3.m.a.f135155b) {
                                    objQ6 = new wz1.c(12, lVar10, eVar3);
                                    mVar6.K(objQ6);
                                }
                            }
                            x91.m.a((e23.a) objQ6, mVar6, 0);
                            mVar6.y();
                            mVar6.f();
                        } else if (eVar3.f2259a) {
                            mVar6.C(-1723754545);
                            mVar6.f();
                        } else {
                            mVar6.C(-1729442704);
                            r rVarE2 = u1.n.e(x2.d(r.S, 1.0f), tn.k.a(d92.b.f58623a, mVar6), m1.f128891a);
                            boolean zR2 = mVar6.r(eVar3) | mVar6.B(pVar2) | mVar6.B(l1Var);
                            e23.a aVar15 = this.f59921b;
                            boolean zB8 = zR2 | mVar6.B(aVar15);
                            e23.a aVar16 = this.f59924e;
                            boolean zB9 = zB8 | mVar6.B(aVar16);
                            p1 p1Var4 = this.f59922c;
                            boolean zB10 = zB9 | mVar6.B(p1Var4) | mVar6.B(pVar3) | mVar6.B(o1Var2) | mVar6.B(p1Var3);
                            Object objQ7 = mVar6.q();
                            if (zB10) {
                                objQ7 = new i3.b4(eVar3, pVar2, l1Var, aVar15, aVar16, p1Var4, pVar3, o1Var2, p1Var3, 7);
                                mVar6.K(objQ7);
                            } else {
                                aVar.getClass();
                                if (objQ7 == p3.m.a.f135155b) {
                                    objQ7 = new i3.b4(eVar3, pVar2, l1Var, aVar15, aVar16, p1Var4, pVar3, o1Var2, p1Var3, 7);
                                    mVar6.K(objQ7);
                                }
                            }
                            e2.c.b(rVarE2, null, null, null, null, null, false, null, (e23.l) objQ7, mVar6, 0, 510);
                            mVar6.f();
                        }
                        if (((Boolean) p1Var3.getF182175a()).booleanValue()) {
                            mVar6.C(-1723701349);
                            boolean zB11 = mVar6.B(p1Var3) | mVar6.B(pVar3) | mVar6.B(o1Var2) | mVar6.r(eVar3);
                            Object objQ8 = mVar6.q();
                            if (zB11) {
                                objQ8 = new ug2.k(p1Var3, pVar3, o1Var2, eVar3, 19);
                                mVar6.K(objQ8);
                            } else {
                                aVar.getClass();
                                if (objQ8 == p3.m.a.f135155b) {
                                    objQ8 = new ug2.k(p1Var3, pVar3, o1Var2, eVar3, 19);
                                    mVar6.K(objQ8);
                                }
                            }
                            e23.a aVar17 = (e23.a) objQ8;
                            boolean zB12 = mVar6.B(p1Var3);
                            Object objQ9 = mVar6.q();
                            if (zB12) {
                                objQ9 = new x91.d(p1Var3, 2);
                                mVar6.K(objQ9);
                            } else {
                                aVar.getClass();
                                if (objQ9 == p3.m.a.f135155b) {
                                    objQ9 = new x91.d(p1Var3, 2);
                                    mVar6.K(objQ9);
                                }
                            }
                            og2.k.e(aVar17, (e23.a) objQ9, mVar6, 0);
                            mVar6.f();
                        } else {
                            mVar6.C(-1723313105);
                            mVar6.f();
                        }
                        if (eVar3.f2261c) {
                            mVar6.C(-1723225530);
                            oi0.c.e(l1Var.getDoubleValue(), this.f59923d, aVar13, mVar6, 0);
                            mVar6.f();
                        } else {
                            mVar6.C(-1722956977);
                            mVar6.f();
                        }
                        mVar6.f();
                    }
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ j(i53.f fVar, n82.f fVar2, yd1.a aVar, u82.d dVar, u82.d dVar2, yi0.c cVar, e23.l lVar, e23.a aVar2, e23.a aVar3, p1 p1Var, yi0.b bVar, e23.l lVar2) {
        this.f59926g = fVar;
        this.f59927h = fVar2;
        this.f59928i = aVar;
        this.f59929j = dVar;
        this.f59930k = dVar2;
        this.f59931l = cVar;
        this.f59923d = lVar;
        this.f59921b = aVar2;
        this.f59924e = aVar3;
        this.f59922c = p1Var;
        this.f59932m = bVar;
        this.f59925f = lVar2;
    }

    public /* synthetic */ j(l11.s sVar, mc mcVar, e23.l lVar, v21.e eVar, e23.l lVar2, e23.l lVar3, e23.l lVar4, o53.b0 b0Var, e23.l lVar5, e23.a aVar, e23.a aVar2, p1 p1Var) {
        this.f59926g = sVar;
        this.f59927h = mcVar;
        this.f59923d = lVar;
        this.f59928i = eVar;
        this.f59925f = lVar2;
        this.f59929j = lVar3;
        this.f59930k = lVar4;
        this.f59931l = b0Var;
        this.f59932m = lVar5;
        this.f59921b = aVar;
        this.f59924e = aVar2;
        this.f59922c = p1Var;
    }

    public /* synthetic */ j(m21.g gVar, p1 p1Var, e23.a aVar, v21.e eVar, e23.l lVar, p pVar, e23.l lVar2, e23.a aVar2, e23.a aVar3, e23.l lVar3, e23.a aVar4, e23.a aVar5) {
        this.f59926g = gVar;
        this.f59922c = p1Var;
        this.f59921b = aVar;
        this.f59927h = eVar;
        this.f59923d = lVar;
        this.f59928i = pVar;
        this.f59925f = lVar2;
        this.f59924e = aVar2;
        this.f59929j = aVar3;
        this.f59930k = lVar3;
        this.f59931l = aVar4;
        this.f59932m = aVar5;
    }

    public /* synthetic */ j(o51.d dVar, e23.a aVar, m3.s sVar, p1 p1Var, e23.l lVar, o1 o1Var, e23.a aVar2, i0 i0Var, e23.l lVar2, e23.l lVar3, p1 p1Var2, e23.a aVar3) {
        this.f59926g = dVar;
        this.f59921b = aVar;
        this.f59927h = sVar;
        this.f59922c = p1Var;
        this.f59923d = lVar;
        this.f59928i = o1Var;
        this.f59924e = aVar2;
        this.f59929j = i0Var;
        this.f59925f = lVar2;
        this.f59930k = lVar3;
        this.f59931l = p1Var2;
        this.f59932m = aVar3;
    }

    public /* synthetic */ j(yb0.a aVar, e23.a aVar2, x3 x3Var, x3 x3Var2, x3 x3Var3, Context context, e23.l lVar, e23.a aVar3, o53.b0 b0Var, mc mcVar, qo0.a aVar4, p1 p1Var) {
        this.f59926g = aVar;
        this.f59921b = aVar2;
        this.f59927h = x3Var;
        this.f59928i = x3Var2;
        this.f59929j = x3Var3;
        this.f59930k = context;
        this.f59923d = lVar;
        this.f59924e = aVar3;
        this.f59931l = b0Var;
        this.f59925f = mcVar;
        this.f59932m = aVar4;
        this.f59922c = p1Var;
    }
}
