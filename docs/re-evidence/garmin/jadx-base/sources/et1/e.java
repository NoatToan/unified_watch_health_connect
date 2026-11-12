package et1;

import android.content.Context;
import c2.s2;
import c2.u2;
import c2.x2;
import com.airbnb.lottie.RenderMode;
import com.garmin.android.apps.connectmobile.R;
import i3.mc;
import i3.mh;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.m3;
import p005kotlin.Unit;
import p005kotlin.math.MathKt;
import p3.b4;
import p3.x3;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class e implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f65441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f65442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f65443c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f65444d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f65445e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f65446f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f65447g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f65448h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f65449i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f65450j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f65451k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f65452l;

    public /* synthetic */ e(e23.p pVar, Context context, String str, o90.a aVar, String str2, boolean z14, i53.c cVar, e23.a aVar2, p3.p1 p1Var, o53.b0 b0Var, mc mcVar) {
        this.f65441a = 3;
        this.f65444d = pVar;
        this.f65449i = context;
        this.f65443c = str;
        this.f65445e = aVar;
        this.f65446f = str2;
        this.f65442b = z14;
        this.f65447g = cVar;
        this.f65448h = aVar2;
        this.f65452l = p1Var;
        this.f65450j = b0Var;
        this.f65451k = mcVar;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0524  */
    /* JADX WARN: Code duplicated, block: B:108:0x05b7  */
    /* JADX WARN: Code duplicated, block: B:110:0x05ec  */
    /* JADX WARN: Code duplicated, block: B:112:0x05f2  */
    /* JADX WARN: Code duplicated, block: B:144:0x073e  */
    /* JADX WARN: Code duplicated, block: B:146:0x0747  */
    /* JADX WARN: Code duplicated, block: B:147:0x074b  */
    /* JADX WARN: Code duplicated, block: B:152:0x0768  */
    /* JADX WARN: Code duplicated, block: B:156:0x07cb A[LOOP:0: B:154:0x07c5->B:156:0x07cb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:160:0x07f0  */
    /* JADX WARN: Code duplicated, block: B:162:0x0804  */
    /* JADX WARN: Code duplicated, block: B:163:0x080c  */
    /* JADX WARN: Code duplicated, block: B:165:0x0815  */
    /* JADX WARN: Code duplicated, block: B:166:0x0820  */
    /* JADX WARN: Code duplicated, block: B:170:0x0849  */
    /* JADX WARN: Code duplicated, block: B:172:0x0850  */
    /* JADX WARN: Code duplicated, block: B:175:0x0868  */
    /* JADX WARN: Code duplicated, block: B:176:0x0875  */
    /* JADX WARN: Code duplicated, block: B:180:0x0887  */
    /* JADX WARN: Code duplicated, block: B:184:0x08c1 A[LOOP:2: B:182:0x08bb->B:184:0x08c1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:189:0x08ea  */
    /* JADX WARN: Code duplicated, block: B:194:0x0907  */
    /* JADX WARN: Code duplicated, block: B:199:0x0922  */
    /* JADX WARN: Code duplicated, block: B:203:0x095e A[LOOP:3: B:201:0x0958->B:203:0x095e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:208:0x0989  */
    /* JADX WARN: Code duplicated, block: B:213:0x09a4  */
    /* JADX WARN: Code duplicated, block: B:217:0x09e2 A[LOOP:4: B:215:0x09dc->B:217:0x09e2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:222:0x0a0d  */
    /* JADX WARN: Code duplicated, block: B:227:0x0a28  */
    /* JADX WARN: Code duplicated, block: B:232:0x0aa2  */
    /* JADX WARN: Code duplicated, block: B:234:0x0ad9  */
    /* JADX WARN: Code duplicated, block: B:54:0x0312  */
    /* JADX WARN: Code duplicated, block: B:56:0x031b  */
    /* JADX WARN: Code duplicated, block: B:57:0x031f  */
    /* JADX WARN: Code duplicated, block: B:62:0x033c  */
    /* JADX WARN: Code duplicated, block: B:65:0x0363  */
    /* JADX WARN: Code duplicated, block: B:67:0x036c  */
    /* JADX WARN: Code duplicated, block: B:68:0x0370  */
    /* JADX WARN: Code duplicated, block: B:73:0x038d  */
    /* JADX WARN: Code duplicated, block: B:76:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:82:0x0407  */
    /* JADX WARN: Code duplicated, block: B:86:0x045e  */
    /* JADX WARN: Code duplicated, block: B:89:0x0496  */
    /* JADX WARN: Code duplicated, block: B:91:0x04a8  */
    /* JADX WARN: Code duplicated, block: B:95:0x04c1  */
    /* JADX WARN: Code duplicated, block: B:98:0x050c  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        f4.s sVar;
        f4.s sVar2;
        h5.g.a.f fVar;
        j92.e eVar;
        c2.z zVarA;
        int iHashCode;
        p3.i2 i2VarX;
        h4.r rVarC;
        boolean z14;
        ArrayList arrayList;
        Iterator<T> it;
        ArrayList arrayList2;
        boolean zB;
        Object objQ;
        Object objQ2;
        p3.m.a.C2565a c2565a;
        p3.p1 p1Var;
        boolean zB2;
        Object objQ3;
        ArrayList arrayList3;
        Iterator<T> it3;
        boolean zR;
        Object objQ4;
        f4.s sVar3;
        boolean zB3;
        Object objQ5;
        boolean zB4;
        Object objQ6;
        ArrayList arrayList4;
        Iterator<T> it4;
        f4.s sVar4;
        boolean zB5;
        Object objQ7;
        boolean zB6;
        Object objQ8;
        ArrayList arrayList5;
        Iterator<T> it5;
        boolean zB7;
        Object objQ9;
        boolean zB8;
        Object objQ10;
        boolean zB9;
        Object objQ11;
        float f14;
        String string;
        long jF;
        m4.q qVar;
        h5.g.a.f fVar2;
        u2 u2Var;
        f5.z0 z0VarD;
        int iHashCode2;
        p3.i2 i2VarX2;
        h4.r rVarC2;
        c2.z zVarA2;
        int iHashCode3;
        p3.i2 i2VarX3;
        h4.r rVarC3;
        Object objQ12;
        boolean zR2;
        Object objQ13;
        m4.q qVar2;
        boolean zR3;
        Object objQ14;
        s5.x0 x0VarF;
        boolean zB10;
        Object objQ15;
        long jB;
        boolean z15;
        int i14 = this.f65441a;
        p3.m.a aVar = p3.m.f135153a;
        Object obj3 = this.f65452l;
        Object obj4 = this.f65451k;
        Object obj5 = this.f65450j;
        Object obj6 = this.f65449i;
        Object obj7 = this.f65443c;
        Object obj8 = this.f65448h;
        Object obj9 = this.f65447g;
        Object obj10 = this.f65446f;
        Object obj11 = this.f65445e;
        Object obj12 = this.f65444d;
        switch (i14) {
            case 0:
                u1.d2 d2Var = (u1.d2) obj12;
                e23.l lVar = (e23.l) obj7;
                f4.s sVar5 = (f4.s) obj11;
                Context context = (Context) obj6;
                f4.s sVar6 = (f4.s) obj10;
                f4.s sVar7 = (f4.s) obj9;
                f4.s sVar8 = (f4.s) obj8;
                bt1.u uVar = (bt1.u) obj5;
                bt1.u uVar2 = (bt1.u) obj4;
                p3.p1 p1Var2 = (p3.p1) obj3;
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    h4.r.a aVar2 = h4.r.S;
                    h4.r rVarD = x2.d(aVar2, 1.0f);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    h4.g.a aVar3 = h4.d.a.f81536n;
                    c2.z zVarA3 = c2.y.a(kVar, aVar3, mVar, 0);
                    int iHashCode4 = Long.hashCode(mVar.getU());
                    p3.i2 i2VarX4 = mVar.x();
                    h4.r rVarC4 = h4.k.c(rVarD, mVar);
                    h5.g.V.getClass();
                    h5.e0.a aVar4 = h5.g.a.f81805b;
                    if (mVar.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar.z();
                    if (mVar.getT()) {
                        mVar.M(aVar4);
                    } else {
                        mVar.c();
                    }
                    h5.g.a.e eVar2 = h5.g.a.f81810g;
                    b4.c(eVar2, zVarA3, mVar);
                    h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                    b4.c(c1623g, i2VarX4, mVar);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar.getT()) {
                        sVar = sVar6;
                        sVar2 = sVar7;
                    } else {
                        sVar2 = sVar7;
                        sVar = sVar6;
                        if (!p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode4))) {
                        }
                        fVar = h5.g.a.f81807d;
                        b4.c(fVar, rVarC4, mVar);
                        h4.r rVarE = u1.n.e(c2.b0.f22601a.a(u1.a2.b(aVar2, d2Var, true), 1.0f, false), tn.k.a(d92.b.f58623a, mVar), o4.m1.f128891a);
                        d92.b.f58625c.getClass();
                        eVar = j92.b.f97899b;
                        zVarA = c2.y.a(c2.j.i(eVar.f97918c), aVar3, mVar, 0);
                        iHashCode = Long.hashCode(mVar.getU());
                        i2VarX = mVar.x();
                        rVarC = h4.k.c(rVarE, mVar);
                        if (mVar.F() != null) {
                            p3.p0.l();
                            throw null;
                        }
                        mVar.z();
                        if (mVar.getT()) {
                            mVar.M(aVar4);
                        } else {
                            mVar.c();
                        }
                        b4.c(eVar2, zVarA, mVar);
                        b4.c(c1623g, i2VarX, mVar);
                        if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                            v.h.z(iHashCode, mVar, iHashCode, bVar);
                        }
                        b4.c(fVar, rVarC, mVar);
                        h4.r rVarC5 = c2.l.C(aVar2, 0.0f, eVar.f97918c, 0.0f, 0.0f, 13);
                        z14 = this.f65442b;
                        bt1.g.a(rVarC5, uVar, z14, null, mVar, 0);
                        bt1.i.a(null, uVar2, z14, null, mVar, 0);
                        String strQ = gl1.y.Q(mVar, R.string.lbl_trail_rating);
                        String strQ2 = gl1.y.Q(mVar, R.string.trail_filter_allow_not_rated_trails);
                        w13.c cVar = us1.j.f172422f;
                        arrayList = new ArrayList(p13.y.r(cVar, 10));
                        it = cVar.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((us1.j) it.next()).f172424b);
                        }
                        i53.c cVarE = i53.a.e(arrayList);
                        w13.c<us1.j> cVar2 = us1.j.f172422f;
                        arrayList2 = new ArrayList(p13.y.r(cVar2, 10));
                        for (us1.j jVar : cVar2) {
                            jVar.getClass();
                            context.getClass();
                            f14 = jVar.f172423a;
                            if (f14 == 1.0f) {
                                string = context.getString(R.string.one_star_rating_content_description);
                            } else if (f14 == 4.0f) {
                                string = context.getString(R.string.stars_rating_content_description, "4+");
                            } else {
                                string = context.getString(R.string.stars_rating_content_description, String.valueOf(MathKt.c(f14)));
                            }
                            string.getClass();
                            arrayList2.add(string);
                        }
                        i53.c cVarE2 = i53.a.e(arrayList2);
                        i53.c cVarE3 = i53.a.e(sVar8);
                        zB = mVar.B(sVar8);
                        objQ = mVar.q();
                        if (zB) {
                            objQ = new d(sVar8, 2);
                            mVar.K(objQ);
                        } else {
                            aVar.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new d(sVar8, 2);
                                mVar.K(objQ);
                            }
                        }
                        e23.a aVar5 = (e23.a) objQ;
                        objQ2 = mVar.q();
                        aVar.getClass();
                        c2565a = p3.m.a.f135155b;
                        if (objQ2 == c2565a) {
                            p1Var = p1Var2;
                            objQ2 = new a11.m(p1Var, 26);
                            mVar.K(objQ2);
                        } else {
                            p1Var = p1Var2;
                        }
                        e23.l lVar2 = (e23.l) objQ2;
                        zB2 = mVar.B(sVar8);
                        objQ3 = mVar.q();
                        if (zB2 || objQ3 == c2565a) {
                            objQ3 = new c(sVar8, 3);
                            mVar.K(objQ3);
                        }
                        bt1.l.b(null, strQ, strQ2, p1Var, cVarE, cVarE2, cVarE3, aVar5, lVar2, (e23.l) objQ3, mVar, 3072);
                        String strQ3 = gl1.y.Q(mVar, R.string.common_difficulty);
                        mVar.C(1751756065);
                        w13.c cVar3 = us1.h.f172406h;
                        arrayList3 = new ArrayList(p13.y.r(cVar3, 10));
                        it3 = cVar3.iterator();
                        while (it3.hasNext()) {
                            arrayList3.add(gl1.y.Q(mVar, ((us1.h) it3.next()).f172408b));
                        }
                        mVar.f();
                        i53.c cVarE4 = i53.a.e(arrayList3);
                        i53.c cVarE5 = i53.a.e(sVar);
                        zR = mVar.r(context);
                        objQ4 = mVar.q();
                        if (zR || objQ4 == p3.m.a.f135155b) {
                            objQ4 = new cy1.a(context, 6);
                            mVar.K(objQ4);
                        }
                        e23.a aVar6 = (e23.a) objQ4;
                        sVar3 = sVar;
                        zB3 = mVar.B(sVar3);
                        objQ5 = mVar.q();
                        if (zB3 || objQ5 == p3.m.a.f135155b) {
                            objQ5 = new d(sVar3, 3);
                            mVar.K(objQ5);
                        }
                        e23.a aVar7 = (e23.a) objQ5;
                        zB4 = mVar.B(sVar3);
                        objQ6 = mVar.q();
                        if (zB4 || objQ6 == p3.m.a.f135155b) {
                            objQ6 = new c(sVar3, 0);
                            mVar.K(objQ6);
                        }
                        bt1.l.a(null, strQ3, true, cVarE4, cVarE5, aVar6, aVar7, (e23.l) objQ6, mVar, 384, 1);
                        String strQ4 = gl1.y.Q(mVar, R.string.lbl_trail_type);
                        mVar.C(1751779745);
                        w13.c cVar4 = us1.m.f172440e;
                        arrayList4 = new ArrayList(p13.y.r(cVar4, 10));
                        it4 = cVar4.iterator();
                        while (it4.hasNext()) {
                            arrayList4.add(gl1.y.Q(mVar, ((us1.m) it4.next()).f172442b));
                        }
                        mVar.f();
                        i53.c cVarE6 = i53.a.e(arrayList4);
                        i53.c cVarE7 = i53.a.e(sVar2);
                        sVar4 = sVar2;
                        zB5 = mVar.B(sVar4);
                        objQ7 = mVar.q();
                        if (zB5 || objQ7 == p3.m.a.f135155b) {
                            objQ7 = new d(sVar4, 0);
                            mVar.K(objQ7);
                        }
                        e23.a aVar8 = (e23.a) objQ7;
                        zB6 = mVar.B(sVar4);
                        objQ8 = mVar.q();
                        if (zB6 || objQ8 == p3.m.a.f135155b) {
                            objQ8 = new c(sVar4, 1);
                            mVar.K(objQ8);
                        }
                        bt1.l.a(null, strQ4, false, cVarE6, cVarE7, null, aVar8, (e23.l) objQ8, mVar, 0, 37);
                        String strQ5 = gl1.y.Q(mVar, R.string.lbl_trail_features);
                        mVar.C(1751796705);
                        w13.c cVar5 = us1.i.f172416h;
                        arrayList5 = new ArrayList(p13.y.r(cVar5, 10));
                        it5 = cVar5.iterator();
                        while (it5.hasNext()) {
                            arrayList5.add(gl1.y.Q(mVar, ((us1.i) it5.next()).f172418b));
                        }
                        mVar.f();
                        i53.c cVarE8 = i53.a.e(arrayList5);
                        i53.c cVarE9 = i53.a.e(sVar5);
                        zB7 = mVar.B(sVar5);
                        objQ9 = mVar.q();
                        if (zB7 || objQ9 == p3.m.a.f135155b) {
                            objQ9 = new d(sVar5, 1);
                            mVar.K(objQ9);
                        }
                        e23.a aVar9 = (e23.a) objQ9;
                        zB8 = mVar.B(sVar5);
                        objQ10 = mVar.q();
                        if (zB8 || objQ10 == p3.m.a.f135155b) {
                            objQ10 = new c(sVar5, 2);
                            mVar.K(objQ10);
                        }
                        bt1.l.a(null, strQ5, false, cVarE8, cVarE9, null, aVar9, (e23.l) objQ10, mVar, 0, 37);
                        mVar.y();
                        l72.f0 f0Var = l72.f0.f110999a;
                        h4.r rVarF = x2.f(h4.r.S, 1.0f);
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        h4.r rVarY = c2.l.y(rVarF, j92.b.f97899b.f97920e);
                        String strQ6 = gl1.y.Q(mVar, R.string.lbl_apply);
                        zB9 = mVar.B(lVar) | mVar.B(sVar5) | mVar.r(context) | mVar.B(sVar3) | mVar.B(sVar4) | mVar.B(sVar8) | mVar.B(uVar) | mVar.h(z14) | mVar.B(uVar2);
                        objQ11 = mVar.q();
                        if (zB9 || objQ11 == p3.m.a.f135155b) {
                            objQ11 = new f(lVar, sVar5, sVar3, sVar4, p1Var, sVar8, uVar, z14, uVar2, context);
                            mVar.K(objQ11);
                        }
                        f0Var.d(0, 9, (e23.a) objQ11, rVarY, strQ6, mVar, null, false);
                        mVar.y();
                        p3.x1 x1Var2 = p3.n.f135158a;
                    }
                    v.h.z(iHashCode4, mVar, iHashCode4, bVar);
                    fVar = h5.g.a.f81807d;
                    b4.c(fVar, rVarC4, mVar);
                    h4.r rVarE2 = u1.n.e(c2.b0.f22601a.a(u1.a2.b(aVar2, d2Var, true), 1.0f, false), tn.k.a(d92.b.f58623a, mVar), o4.m1.f128891a);
                    d92.b.f58625c.getClass();
                    eVar = j92.b.f97899b;
                    zVarA = c2.y.a(c2.j.i(eVar.f97918c), aVar3, mVar, 0);
                    iHashCode = Long.hashCode(mVar.getU());
                    i2VarX = mVar.x();
                    rVarC = h4.k.c(rVarE2, mVar);
                    if (mVar.F() != null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar.z();
                    if (mVar.getT()) {
                        mVar.M(aVar4);
                    } else {
                        mVar.c();
                    }
                    b4.c(eVar2, zVarA, mVar);
                    b4.c(c1623g, i2VarX, mVar);
                    if (mVar.getT()) {
                        v.h.z(iHashCode, mVar, iHashCode, bVar);
                    } else {
                        v.h.z(iHashCode, mVar, iHashCode, bVar);
                    }
                    b4.c(fVar, rVarC, mVar);
                    h4.r rVarC6 = c2.l.C(aVar2, 0.0f, eVar.f97918c, 0.0f, 0.0f, 13);
                    z14 = this.f65442b;
                    bt1.g.a(rVarC6, uVar, z14, null, mVar, 0);
                    bt1.i.a(null, uVar2, z14, null, mVar, 0);
                    String strQ7 = gl1.y.Q(mVar, R.string.lbl_trail_rating);
                    String strQ8 = gl1.y.Q(mVar, R.string.trail_filter_allow_not_rated_trails);
                    w13.c cVar6 = us1.j.f172422f;
                    arrayList = new ArrayList(p13.y.r(cVar6, 10));
                    it = cVar6.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((us1.j) it.next()).f172424b);
                    }
                    i53.c cVarE10 = i53.a.e(arrayList);
                    w13.c<us1.j> cVar7 = us1.j.f172422f;
                    arrayList2 = new ArrayList(p13.y.r(cVar7, 10));
                    while (r3.hasNext()) {
                        jVar.getClass();
                        context.getClass();
                        f14 = jVar.f172423a;
                        if (f14 == 1.0f) {
                            string = context.getString(R.string.one_star_rating_content_description);
                        } else if (f14 == 4.0f) {
                            string = context.getString(R.string.stars_rating_content_description, "4+");
                        } else {
                            string = context.getString(R.string.stars_rating_content_description, String.valueOf(MathKt.c(f14)));
                        }
                        string.getClass();
                        arrayList2.add(string);
                    }
                    i53.c cVarE11 = i53.a.e(arrayList2);
                    i53.c cVarE12 = i53.a.e(sVar8);
                    zB = mVar.B(sVar8);
                    objQ = mVar.q();
                    if (zB) {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new d(sVar8, 2);
                            mVar.K(objQ);
                        }
                    } else {
                        objQ = new d(sVar8, 2);
                        mVar.K(objQ);
                    }
                    e23.a aVar10 = (e23.a) objQ;
                    objQ2 = mVar.q();
                    aVar.getClass();
                    c2565a = p3.m.a.f135155b;
                    if (objQ2 == c2565a) {
                        p1Var = p1Var2;
                        objQ2 = new a11.m(p1Var, 26);
                        mVar.K(objQ2);
                    } else {
                        p1Var = p1Var2;
                    }
                    e23.l lVar3 = (e23.l) objQ2;
                    zB2 = mVar.B(sVar8);
                    objQ3 = mVar.q();
                    if (zB2) {
                        objQ3 = new c(sVar8, 3);
                        mVar.K(objQ3);
                    } else {
                        objQ3 = new c(sVar8, 3);
                        mVar.K(objQ3);
                    }
                    bt1.l.b(null, strQ7, strQ8, p1Var, cVarE10, cVarE11, cVarE12, aVar10, lVar3, (e23.l) objQ3, mVar, 3072);
                    String strQ9 = gl1.y.Q(mVar, R.string.common_difficulty);
                    mVar.C(1751756065);
                    w13.c cVar8 = us1.h.f172406h;
                    arrayList3 = new ArrayList(p13.y.r(cVar8, 10));
                    it3 = cVar8.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(gl1.y.Q(mVar, ((us1.h) it3.next()).f172408b));
                    }
                    mVar.f();
                    i53.c cVarE13 = i53.a.e(arrayList3);
                    i53.c cVarE14 = i53.a.e(sVar);
                    zR = mVar.r(context);
                    objQ4 = mVar.q();
                    if (zR) {
                        objQ4 = new cy1.a(context, 6);
                        mVar.K(objQ4);
                    } else {
                        objQ4 = new cy1.a(context, 6);
                        mVar.K(objQ4);
                    }
                    e23.a aVar11 = (e23.a) objQ4;
                    sVar3 = sVar;
                    zB3 = mVar.B(sVar3);
                    objQ5 = mVar.q();
                    if (zB3) {
                        objQ5 = new d(sVar3, 3);
                        mVar.K(objQ5);
                    } else {
                        objQ5 = new d(sVar3, 3);
                        mVar.K(objQ5);
                    }
                    e23.a aVar12 = (e23.a) objQ5;
                    zB4 = mVar.B(sVar3);
                    objQ6 = mVar.q();
                    if (zB4) {
                        objQ6 = new c(sVar3, 0);
                        mVar.K(objQ6);
                    } else {
                        objQ6 = new c(sVar3, 0);
                        mVar.K(objQ6);
                    }
                    bt1.l.a(null, strQ9, true, cVarE13, cVarE14, aVar11, aVar12, (e23.l) objQ6, mVar, 384, 1);
                    String strQ10 = gl1.y.Q(mVar, R.string.lbl_trail_type);
                    mVar.C(1751779745);
                    w13.c cVar9 = us1.m.f172440e;
                    arrayList4 = new ArrayList(p13.y.r(cVar9, 10));
                    it4 = cVar9.iterator();
                    while (it4.hasNext()) {
                        arrayList4.add(gl1.y.Q(mVar, ((us1.m) it4.next()).f172442b));
                    }
                    mVar.f();
                    i53.c cVarE15 = i53.a.e(arrayList4);
                    i53.c cVarE16 = i53.a.e(sVar2);
                    sVar4 = sVar2;
                    zB5 = mVar.B(sVar4);
                    objQ7 = mVar.q();
                    if (zB5) {
                        objQ7 = new d(sVar4, 0);
                        mVar.K(objQ7);
                    } else {
                        objQ7 = new d(sVar4, 0);
                        mVar.K(objQ7);
                    }
                    e23.a aVar13 = (e23.a) objQ7;
                    zB6 = mVar.B(sVar4);
                    objQ8 = mVar.q();
                    if (zB6) {
                        objQ8 = new c(sVar4, 1);
                        mVar.K(objQ8);
                    } else {
                        objQ8 = new c(sVar4, 1);
                        mVar.K(objQ8);
                    }
                    bt1.l.a(null, strQ10, false, cVarE15, cVarE16, null, aVar13, (e23.l) objQ8, mVar, 0, 37);
                    String strQ11 = gl1.y.Q(mVar, R.string.lbl_trail_features);
                    mVar.C(1751796705);
                    w13.c cVar10 = us1.i.f172416h;
                    arrayList5 = new ArrayList(p13.y.r(cVar10, 10));
                    it5 = cVar10.iterator();
                    while (it5.hasNext()) {
                        arrayList5.add(gl1.y.Q(mVar, ((us1.i) it5.next()).f172418b));
                    }
                    mVar.f();
                    i53.c cVarE17 = i53.a.e(arrayList5);
                    i53.c cVarE18 = i53.a.e(sVar5);
                    zB7 = mVar.B(sVar5);
                    objQ9 = mVar.q();
                    if (zB7) {
                        objQ9 = new d(sVar5, 1);
                        mVar.K(objQ9);
                    } else {
                        objQ9 = new d(sVar5, 1);
                        mVar.K(objQ9);
                    }
                    e23.a aVar14 = (e23.a) objQ9;
                    zB8 = mVar.B(sVar5);
                    objQ10 = mVar.q();
                    if (zB8) {
                        objQ10 = new c(sVar5, 2);
                        mVar.K(objQ10);
                    } else {
                        objQ10 = new c(sVar5, 2);
                        mVar.K(objQ10);
                    }
                    bt1.l.a(null, strQ11, false, cVarE17, cVarE18, null, aVar14, (e23.l) objQ10, mVar, 0, 37);
                    mVar.y();
                    l72.f0 f0Var2 = l72.f0.f110999a;
                    h4.r rVarF2 = x2.f(h4.r.S, 1.0f);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h4.r rVarY2 = c2.l.y(rVarF2, j92.b.f97899b.f97920e);
                    String strQ12 = gl1.y.Q(mVar, R.string.lbl_apply);
                    zB9 = mVar.B(lVar) | mVar.B(sVar5) | mVar.r(context) | mVar.B(sVar3) | mVar.B(sVar4) | mVar.B(sVar8) | mVar.B(uVar) | mVar.h(z14) | mVar.B(uVar2);
                    objQ11 = mVar.q();
                    if (zB9) {
                        objQ11 = new f(lVar, sVar5, sVar3, sVar4, p1Var, sVar8, uVar, z14, uVar2, context);
                        mVar.K(objQ11);
                    } else {
                        objQ11 = new f(lVar, sVar5, sVar3, sVar4, p1Var, sVar8, uVar, z14, uVar2, context);
                        mVar.K(objQ11);
                    }
                    f0Var2.d(0, 9, (e23.a) objQ11, rVarY2, strQ12, mVar, null, false);
                    mVar.y();
                    p3.x1 x1Var3 = p3.n.f135158a;
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                h21.a0.b((x01.f) obj12, (o82.a) obj11, (ArrayList) obj10, this.f65442b, (g21.l) obj9, (List) obj8, (g21.b) obj6, (v21.e) obj5, (pi0.e) obj4, (Integer) obj3, (e23.l) obj7, (p3.m) obj, p3.p0.t(134217729));
                return Unit.INSTANCE;
            case 2:
                m3 m3Var = (m3) obj12;
                m4.b0 b0Var = (m4.b0) obj11;
                p3.p1 p1Var3 = (p3.p1) obj3;
                String str = (String) obj10;
                x3 x3Var = (x3) obj9;
                o53.b0 b0Var2 = (o53.b0) obj8;
                i2.a aVar15 = (i2.a) obj6;
                e23.l lVar4 = (e23.l) obj7;
                p3.p1 p1Var4 = (p3.p1) obj5;
                m4.q qVar3 = (m4.q) obj4;
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    p3.x1 x1Var4 = p3.n.f135158a;
                    h4.r.a aVar16 = h4.r.S;
                    if (this.f65442b) {
                        mVar2.C(-572716009);
                        d92.b.f58623a.getClass();
                        jF = d92.b.a(mVar2).c().e();
                    } else {
                        mVar2.C(-572714825);
                        d92.b.f58623a.getClass();
                        jF = d92.b.a(mVar2).c().f();
                    }
                    mVar2.f();
                    h4.r rVarE3 = u1.n.e(aVar16, jF, o4.m1.f128891a);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar3 = j92.b.f97899b;
                    h4.r rVarF3 = x2.f(c2.l.A(rVarE3, eVar3.f97920e, 0.0f, 2), 1.0f);
                    Object objQ16 = mVar2.q();
                    aVar.getClass();
                    p3.m.a.C2565a c2565a2 = p3.m.a.f135155b;
                    if (objQ16 == c2565a2) {
                        objQ16 = tn.k.c(mVar2);
                    }
                    a2.j jVar2 = (a2.j) objQ16;
                    boolean zB11 = mVar2.B(m3Var);
                    Object objQ17 = mVar2.q();
                    if (zB11 || objQ17 == c2565a2) {
                        objQ17 = new b82.h0(m3Var, b0Var, p1Var3, 2);
                        mVar2.K(objQ17);
                    }
                    h4.r rVarB = u1.w.b(rVarF3, jVar2, null, false, null, null, (e23.a) objQ17, 28);
                    h4.d.f81522a.getClass();
                    h4.g.b bVar2 = h4.d.a.f81534l;
                    c2.j jVar3 = c2.j.f22691a;
                    float f15 = eVar3.f97920e;
                    jVar3.getClass();
                    s2 s2VarA = c2.q2.a(c2.j.i(f15), bVar2, mVar2, 48);
                    int iHashCode5 = Long.hashCode(mVar2.getU());
                    p3.i2 i2VarX5 = mVar2.x();
                    h4.r rVarC7 = h4.k.c(rVarB, mVar2);
                    h5.g.V.getClass();
                    p3.p1 p1Var5 = p1Var3;
                    h5.e0.a aVar17 = h5.g.a.f81805b;
                    if (mVar2.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar17);
                    } else {
                        mVar2.c();
                    }
                    h5.g.a.e eVar4 = h5.g.a.f81810g;
                    b4.c(eVar4, s2VarA, mVar2);
                    h5.g.a.C1623g c1623g2 = h5.g.a.f81809f;
                    b4.c(c1623g2, i2VarX5, mVar2);
                    h5.g.a.b bVar3 = h5.g.a.f81813j;
                    if (mVar2.getT()) {
                        qVar = qVar3;
                    } else {
                        qVar = qVar3;
                        if (!p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode5))) {
                        }
                        fVar2 = h5.g.a.f81807d;
                        b4.c(fVar2, rVarC7, mVar2);
                        u2Var = u2.f22900a;
                        boolean z16 = !((Boolean) p1Var5.getF182175a()).booleanValue();
                        r1.v1 v1VarB = r1.u0.d(s1.l.d(300, 0, null, 6), 2).b(r1.u0.a(s1.l.d(300, 0, null, 6), null, 14));
                        r1.x1 x1VarB = r1.u0.e(s1.l.d(300, 0, null, 6), 2).b(r1.u0.h(s1.l.d(300, 0, null, 6), null, 14));
                        lm0.a.f113517a.getClass();
                        r1.c0.d(u2Var, z16, null, v1VarB, x1VarB, null, lm0.a.f113518b, mVar2, 1600518, 18);
                        h4.r rVarA = u2Var.a(r1.g0.a(c2.l.A(aVar16, 0.0f, eVar3.f97918c, 1), null, 3), 1.0f, true);
                        z0VarD = c2.q.d(new h4.g(-1.0f, ((Number) x3Var.getF182175a()).floatValue()), false);
                        iHashCode2 = Long.hashCode(mVar2.getU());
                        i2VarX2 = mVar2.x();
                        rVarC2 = h4.k.c(rVarA, mVar2);
                        if (mVar2.F() != null) {
                            p3.p0.l();
                            throw null;
                        }
                        mVar2.z();
                        if (mVar2.getT()) {
                            mVar2.M(aVar17);
                        } else {
                            mVar2.c();
                        }
                        b4.c(eVar4, z0VarD, mVar2);
                        b4.c(c1623g2, i2VarX2, mVar2);
                        if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode2))) {
                            v.h.z(iHashCode2, mVar2, iHashCode2, bVar3);
                        }
                        b4.c(fVar2, rVarC2, mVar2);
                        c2.u uVar3 = c2.u.f22885a;
                        zVarA2 = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, mVar2, 0);
                        iHashCode3 = Long.hashCode(mVar2.getU());
                        i2VarX3 = mVar2.x();
                        rVarC3 = h4.k.c(aVar16, mVar2);
                        if (mVar2.F() != null) {
                            p3.p0.l();
                            throw null;
                        }
                        mVar2.z();
                        if (mVar2.getT()) {
                            mVar2.M(aVar17);
                        } else {
                            mVar2.c();
                        }
                        b4.c(eVar4, zVarA2, mVar2);
                        b4.c(c1623g2, i2VarX3, mVar2);
                        if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode3))) {
                            v.h.z(iHashCode3, mVar2, iHashCode3, bVar3);
                        }
                        b4.c(fVar2, rVarC3, mVar2);
                        c2.b0 b0Var3 = c2.b0.f22601a;
                        h4.r rVarA2 = l4.k.a(aVar16, 0.0f);
                        objQ12 = mVar2.q();
                        if (objQ12 == c2565a2) {
                            objQ12 = new li0.x(12);
                            mVar2.K(objQ12);
                        }
                        h4.r rVarC8 = p5.v.c((e23.l) objQ12, rVarA2, false);
                        String strQ13 = gl1.y.Q(mVar2, R.string.lbl_other);
                        d92.b.f58624b.getClass();
                        s5.x0 x0Var = j92.f.f97931h;
                        mh.c(strQ13, rVarC8, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0Var, mVar2, 0, 0, 131068);
                        h4.r rVarA3 = m4.e.a(aVar16, b0Var);
                        zR2 = mVar2.r(b0Var2) | mVar2.r(aVar15) | mVar2.B(lVar4);
                        objQ13 = mVar2.q();
                        if (zR2 || objQ13 == c2565a2) {
                            objQ13 = new jv0.c(b0Var2, p1Var4, lVar4, p1Var5, aVar15, 5);
                            p1Var5 = p1Var5;
                            mVar2.K(objQ13);
                        }
                        h4.r rVarC9 = m4.e.c(rVarA3, (e23.l) objQ13);
                        x5.l0 l0Var = (x5.l0) p1Var4.getF182175a();
                        x5.v.f188954b.getClass();
                        int i15 = x5.v.f188955c;
                        x5.p.f188918b.getClass();
                        p006l2.a2 a2Var = new p006l2.a2(0, (Boolean) null, i15, x5.p.f188926j, (x5.f0) null, (Boolean) null, (z5.c) null, 115, (p005kotlin.jvm.internal.j) null);
                        qVar2 = qVar;
                        zR3 = mVar2.r(qVar2);
                        objQ14 = mVar2.q();
                        if (zR3 || objQ14 == c2565a2) {
                            objQ14 = new b82.k0(qVar2, 7);
                            mVar2.K(objQ14);
                        }
                        p006l2.z1 z1Var = new p006l2.z1((e23.l) objQ14, null, null, null, null, null, 62, null);
                        o4.t1 t1Var = new o4.t1(zl.a.a(mVar2), null);
                        if (((Boolean) p1Var5.getF182175a()).booleanValue()) {
                            mVar2.C(940587773);
                            x0VarF = d92.c.b(j92.f.f97933j, mVar2);
                        } else {
                            mVar2.C(940588959);
                            x0VarF = d92.c.f(j92.f.f97933j, mVar2);
                        }
                        mVar2.f();
                        s5.x0 x0Var2 = x0VarF;
                        zB10 = mVar2.B(lVar4);
                        objQ15 = mVar2.q();
                        if (zB10 || objQ15 == c2565a2) {
                            objQ15 = new a11.b0(lVar4, p1Var4, 21);
                            mVar2.K(objQ15);
                        }
                        p006l2.r.c(l0Var, (e23.l) objQ15, rVarC9, false, false, x0Var2, a2Var, z1Var, false, 0, 0, null, null, null, t1Var, null, mVar2, 102236160, 0, 48664);
                        mVar2.y();
                        h4.r rVarB2 = h4.p.b(aVar16, 1.0f);
                        String strQ14 = gl1.y.Q(mVar2, R.string.lbl_other);
                        if (((Boolean) p1Var5.getF182175a()).booleanValue()) {
                            mVar2.C(926905250);
                            jB = d92.b.a(mVar2).k().d();
                        } else {
                            mVar2.C(926906240);
                            jB = d92.b.a(mVar2).k().b();
                        }
                        mVar2.f();
                        mh.c(strQ14, rVarB2, jB, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0Var, mVar2, 48, 0, 131064);
                        mVar2.y();
                        boolean zBooleanValue = ((Boolean) p1Var5.getF182175a()).booleanValue();
                        r1.v1 v1VarD = r1.u0.d(s1.l.d(300, 0, null, 6), 2);
                        r1.w1.f149304a.getClass();
                        r1.x1 x1Var5 = r1.w1.f149305b;
                        r1.c0.d(u2Var, zBooleanValue, null, v1VarD, x1Var5, null, z3.f.c(-287764190, new eb0.a(p1Var4, 9), mVar2), mVar2, 1575942, 18);
                        if (((Boolean) p1Var5.getF182175a()).booleanValue() && (str == null || d53.w.J(str))) {
                            z15 = false;
                        } else {
                            z15 = true;
                        }
                        r1.c0.d(u2Var, z15, null, r1.u0.d(s1.l.d(300, 0, null, 6), 2), x1Var5, null, z3.f.c(-229781917, new fb0.b((Object) p1Var5, lVar4, (Object) str, (Object) p1Var4, 24), mVar2), mVar2, 1575942, 18);
                        mVar2.y();
                    }
                    v.h.z(iHashCode5, mVar2, iHashCode5, bVar3);
                    fVar2 = h5.g.a.f81807d;
                    b4.c(fVar2, rVarC7, mVar2);
                    u2Var = u2.f22900a;
                    boolean z17 = !((Boolean) p1Var5.getF182175a()).booleanValue();
                    r1.v1 v1VarB2 = r1.u0.d(s1.l.d(300, 0, null, 6), 2).b(r1.u0.a(s1.l.d(300, 0, null, 6), null, 14));
                    r1.x1 x1VarB2 = r1.u0.e(s1.l.d(300, 0, null, 6), 2).b(r1.u0.h(s1.l.d(300, 0, null, 6), null, 14));
                    lm0.a.f113517a.getClass();
                    r1.c0.d(u2Var, z17, null, v1VarB2, x1VarB2, null, lm0.a.f113518b, mVar2, 1600518, 18);
                    h4.r rVarA4 = u2Var.a(r1.g0.a(c2.l.A(aVar16, 0.0f, eVar3.f97918c, 1), null, 3), 1.0f, true);
                    z0VarD = c2.q.d(new h4.g(-1.0f, ((Number) x3Var.getF182175a()).floatValue()), false);
                    iHashCode2 = Long.hashCode(mVar2.getU());
                    i2VarX2 = mVar2.x();
                    rVarC2 = h4.k.c(rVarA4, mVar2);
                    if (mVar2.F() != null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar17);
                    } else {
                        mVar2.c();
                    }
                    b4.c(eVar4, z0VarD, mVar2);
                    b4.c(c1623g2, i2VarX2, mVar2);
                    if (mVar2.getT()) {
                        v.h.z(iHashCode2, mVar2, iHashCode2, bVar3);
                    } else {
                        v.h.z(iHashCode2, mVar2, iHashCode2, bVar3);
                    }
                    b4.c(fVar2, rVarC2, mVar2);
                    c2.u uVar4 = c2.u.f22885a;
                    zVarA2 = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, mVar2, 0);
                    iHashCode3 = Long.hashCode(mVar2.getU());
                    i2VarX3 = mVar2.x();
                    rVarC3 = h4.k.c(aVar16, mVar2);
                    if (mVar2.F() != null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar17);
                    } else {
                        mVar2.c();
                    }
                    b4.c(eVar4, zVarA2, mVar2);
                    b4.c(c1623g2, i2VarX3, mVar2);
                    if (mVar2.getT()) {
                        v.h.z(iHashCode3, mVar2, iHashCode3, bVar3);
                    } else {
                        v.h.z(iHashCode3, mVar2, iHashCode3, bVar3);
                    }
                    b4.c(fVar2, rVarC3, mVar2);
                    c2.b0 b0Var4 = c2.b0.f22601a;
                    h4.r rVarA5 = l4.k.a(aVar16, 0.0f);
                    objQ12 = mVar2.q();
                    if (objQ12 == c2565a2) {
                        objQ12 = new li0.x(12);
                        mVar2.K(objQ12);
                    }
                    h4.r rVarC10 = p5.v.c((e23.l) objQ12, rVarA5, false);
                    String strQ15 = gl1.y.Q(mVar2, R.string.lbl_other);
                    d92.b.f58624b.getClass();
                    s5.x0 x0Var3 = j92.f.f97931h;
                    mh.c(strQ15, rVarC10, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0Var3, mVar2, 0, 0, 131068);
                    h4.r rVarA6 = m4.e.a(aVar16, b0Var);
                    zR2 = mVar2.r(b0Var2) | mVar2.r(aVar15) | mVar2.B(lVar4);
                    objQ13 = mVar2.q();
                    if (zR2) {
                        objQ13 = new jv0.c(b0Var2, p1Var4, lVar4, p1Var5, aVar15, 5);
                        p1Var5 = p1Var5;
                        mVar2.K(objQ13);
                    } else {
                        objQ13 = new jv0.c(b0Var2, p1Var4, lVar4, p1Var5, aVar15, 5);
                        p1Var5 = p1Var5;
                        mVar2.K(objQ13);
                    }
                    h4.r rVarC11 = m4.e.c(rVarA6, (e23.l) objQ13);
                    x5.l0 l0Var2 = (x5.l0) p1Var4.getF182175a();
                    x5.v.f188954b.getClass();
                    int i16 = x5.v.f188955c;
                    x5.p.f188918b.getClass();
                    p006l2.a2 a2Var2 = new p006l2.a2(0, (Boolean) null, i16, x5.p.f188926j, (x5.f0) null, (Boolean) null, (z5.c) null, 115, (p005kotlin.jvm.internal.j) null);
                    qVar2 = qVar;
                    zR3 = mVar2.r(qVar2);
                    objQ14 = mVar2.q();
                    if (zR3) {
                        objQ14 = new b82.k0(qVar2, 7);
                        mVar2.K(objQ14);
                    } else {
                        objQ14 = new b82.k0(qVar2, 7);
                        mVar2.K(objQ14);
                    }
                    p006l2.z1 z1Var2 = new p006l2.z1((e23.l) objQ14, null, null, null, null, null, 62, null);
                    o4.t1 t1Var2 = new o4.t1(zl.a.a(mVar2), null);
                    if (((Boolean) p1Var5.getF182175a()).booleanValue()) {
                        mVar2.C(940587773);
                        x0VarF = d92.c.b(j92.f.f97933j, mVar2);
                    } else {
                        mVar2.C(940588959);
                        x0VarF = d92.c.f(j92.f.f97933j, mVar2);
                    }
                    mVar2.f();
                    s5.x0 x0Var4 = x0VarF;
                    zB10 = mVar2.B(lVar4);
                    objQ15 = mVar2.q();
                    if (zB10) {
                        objQ15 = new a11.b0(lVar4, p1Var4, 21);
                        mVar2.K(objQ15);
                    } else {
                        objQ15 = new a11.b0(lVar4, p1Var4, 21);
                        mVar2.K(objQ15);
                    }
                    p006l2.r.c(l0Var2, (e23.l) objQ15, rVarC11, false, false, x0Var4, a2Var2, z1Var2, false, 0, 0, null, null, null, t1Var2, null, mVar2, 102236160, 0, 48664);
                    mVar2.y();
                    h4.r rVarB3 = h4.p.b(aVar16, 1.0f);
                    String strQ16 = gl1.y.Q(mVar2, R.string.lbl_other);
                    if (((Boolean) p1Var5.getF182175a()).booleanValue()) {
                        mVar2.C(926905250);
                        jB = d92.b.a(mVar2).k().d();
                    } else {
                        mVar2.C(926906240);
                        jB = d92.b.a(mVar2).k().b();
                    }
                    mVar2.f();
                    mh.c(strQ16, rVarB3, jB, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0Var3, mVar2, 48, 0, 131064);
                    mVar2.y();
                    boolean zBooleanValue2 = ((Boolean) p1Var5.getF182175a()).booleanValue();
                    r1.v1 v1VarD2 = r1.u0.d(s1.l.d(300, 0, null, 6), 2);
                    r1.w1.f149304a.getClass();
                    r1.x1 x1Var6 = r1.w1.f149305b;
                    r1.c0.d(u2Var, zBooleanValue2, null, v1VarD2, x1Var6, null, z3.f.c(-287764190, new eb0.a(p1Var4, 9), mVar2), mVar2, 1575942, 18);
                    if (((Boolean) p1Var5.getF182175a()).booleanValue()) {
                        z15 = true;
                    } else {
                        z15 = true;
                    }
                    r1.c0.d(u2Var, z15, null, r1.u0.d(s1.l.d(300, 0, null, 6), 2), x1Var6, null, z3.f.c(-229781917, new fb0.b((Object) p1Var5, lVar4, (Object) str, (Object) p1Var4, 24), mVar2), mVar2, 1575942, 18);
                    mVar2.y();
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 3:
                e23.p pVar = (e23.p) obj12;
                Context context2 = (Context) obj6;
                String str2 = (String) obj7;
                o90.a aVar18 = (o90.a) obj11;
                String str3 = (String) obj10;
                i53.c cVar11 = (i53.c) obj9;
                e23.a aVar19 = (e23.a) obj8;
                p3.p1 p1Var6 = (p3.p1) obj3;
                o53.b0 b0Var5 = (o53.b0) obj5;
                mc mcVar = (mc) obj4;
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (mVar3.n(1 & iIntValue3, (iIntValue3 & 3) != 2)) {
                    p3.x1 x1Var7 = p3.n.f135158a;
                    b82.c.c(z3.f.c(-1518957139, new ta0.g1.b(pVar, context2, str2), mVar3), z3.f.c(1433301235, new av0.g(aVar18, str3, this.f65442b, cVar11, aVar19, p1Var6, b0Var5, mcVar, pVar, context2), mVar3), mVar3, 54);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                tb0.e.c((ub0.l) obj12, (ub0.m) obj11, (tb0.p) obj10, (String) obj9, (RenderMode) obj8, this.f65442b, (e23.a) obj6, (e23.a) obj5, (e23.a) obj4, (e23.l) obj7, (e23.l) obj3, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 5:
                ((Integer) obj2).getClass();
                xu0.e.e((List) obj12, this.f65442b, (e23.p) obj11, (e23.p) obj10, (e23.p) obj9, (e23.a) obj8, (e23.l) obj7, (e23.l) obj6, (e23.l) obj5, (e23.l) obj4, (e23.l) obj3, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                xu0.e.d((ev0.b) obj12, this.f65442b, (e23.p) obj11, (e23.p) obj10, (e23.p) obj9, (e23.a) obj8, (e23.l) obj7, (e23.l) obj6, (e23.l) obj5, (e23.l) obj4, (e23.l) obj3, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ e(Object obj, boolean z14, e23.p pVar, e23.p pVar2, e23.p pVar3, e23.a aVar, e23.l lVar, e23.l lVar2, e23.l lVar3, e23.l lVar4, e23.l lVar5, int i14, int i15) {
        this.f65441a = i15;
        this.f65444d = obj;
        this.f65442b = z14;
        this.f65445e = pVar;
        this.f65446f = pVar2;
        this.f65447g = pVar3;
        this.f65448h = aVar;
        this.f65443c = lVar;
        this.f65449i = lVar2;
        this.f65450j = lVar3;
        this.f65451k = lVar4;
        this.f65452l = lVar5;
    }

    public /* synthetic */ e(u1.d2 d2Var, e23.l lVar, f4.s sVar, Context context, f4.s sVar2, f4.s sVar3, f4.s sVar4, bt1.u uVar, boolean z14, bt1.u uVar2, p3.p1 p1Var) {
        this.f65441a = 0;
        this.f65444d = d2Var;
        this.f65443c = lVar;
        this.f65445e = sVar;
        this.f65449i = context;
        this.f65446f = sVar2;
        this.f65447g = sVar3;
        this.f65448h = sVar4;
        this.f65450j = uVar;
        this.f65442b = z14;
        this.f65451k = uVar2;
        this.f65452l = p1Var;
    }

    public /* synthetic */ e(ub0.l lVar, ub0.m mVar, tb0.p pVar, String str, RenderMode renderMode, boolean z14, e23.a aVar, e23.a aVar2, e23.a aVar3, e23.l lVar2, e23.l lVar3, int i14) {
        this.f65441a = 4;
        this.f65444d = lVar;
        this.f65445e = mVar;
        this.f65446f = pVar;
        this.f65447g = str;
        this.f65448h = renderMode;
        this.f65442b = z14;
        this.f65449i = aVar;
        this.f65450j = aVar2;
        this.f65451k = aVar3;
        this.f65443c = lVar2;
        this.f65452l = lVar3;
    }

    public /* synthetic */ e(x01.f fVar, o82.a aVar, ArrayList arrayList, boolean z14, g21.l lVar, List list, g21.b bVar, v21.e eVar, pi0.e eVar2, Integer num, e23.l lVar2, int i14) {
        this.f65441a = 1;
        this.f65444d = fVar;
        this.f65445e = aVar;
        this.f65446f = arrayList;
        this.f65442b = z14;
        this.f65447g = lVar;
        this.f65448h = list;
        this.f65449i = bVar;
        this.f65450j = eVar;
        this.f65451k = eVar2;
        this.f65452l = num;
        this.f65443c = lVar2;
    }

    public /* synthetic */ e(boolean z14, m3 m3Var, m4.b0 b0Var, p3.p1 p1Var, String str, x3 x3Var, o53.b0 b0Var2, i2.a aVar, e23.l lVar, p3.p1 p1Var2, m4.q qVar) {
        this.f65441a = 2;
        this.f65442b = z14;
        this.f65444d = m3Var;
        this.f65445e = b0Var;
        this.f65452l = p1Var;
        this.f65446f = str;
        this.f65447g = x3Var;
        this.f65448h = b0Var2;
        this.f65449i = aVar;
        this.f65443c = lVar;
        this.f65450j = p1Var2;
        this.f65451k = qVar;
    }
}
