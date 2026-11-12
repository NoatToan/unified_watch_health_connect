package b82;

import c2.q2;
import c2.s2;
import c2.u2;
import com.garmin.android.apps.connectmobile.R;
import i3.mh;
import java.util.List;
import java.util.Locale;
import l72.v2;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class l1 implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16662a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f16663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f16664c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f16665d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f16666e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f16667f;

    public /* synthetic */ l1(int i14, int i15, q1.a aVar, boolean z14, List list) {
        this.f16664c = i14;
        this.f16665d = i15;
        this.f16666e = aVar;
        this.f16663b = z14;
        this.f16667f = list;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x03cd  */
    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
        String lowerCase;
        p3.m mVar;
        String strP;
        int i14 = this.f16662a;
        int i15 = 1;
        Object obj4 = this.f16667f;
        Object obj5 = this.f16666e;
        switch (i14) {
            case 0:
                q1.a aVar = (q1.a) obj5;
                List list = (List) obj4;
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                q1 q1Var = q1.f16749a;
                ((c2.c1) obj).getClass();
                if (mVar2.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    h4.d.f81522a.getClass();
                    h4.g.b bVar = h4.d.a.f81534l;
                    h4.r.a aVar2 = h4.r.S;
                    int i16 = this.f16664c;
                    h4.r rVarA = v2.a(aVar2, i16 > 0, new a71.n(aVar, 8), mVar2, 6);
                    c2.j.f22691a.getClass();
                    s2 s2VarA = q2.a(c2.j.f22692b, bVar, mVar2, 48);
                    int iHashCode = Long.hashCode(mVar2.getU());
                    i2 i2VarX = mVar2.x();
                    h4.r rVarC = h4.k.c(rVarA, mVar2);
                    h5.g.V.getClass();
                    h5.e0.a aVar3 = h5.g.a.f81805b;
                    if (mVar2.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar3);
                    } else {
                        mVar2.c();
                    }
                    h5.g.a.e eVar = h5.g.a.f81810g;
                    b4.c(eVar, s2VarA, mVar2);
                    h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                    b4.c(c1623g, i2VarX, mVar2);
                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                    if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar2, iHashCode, bVar2);
                    }
                    h5.g.a.f fVar = h5.g.a.f81807d;
                    b4.c(fVar, rVarC, mVar2);
                    u2 u2Var = u2.f22900a;
                    f5.z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
                    int iHashCode2 = Long.hashCode(mVar2.getU());
                    i2 i2VarX2 = mVar2.x();
                    h4.r rVarC2 = h4.k.c(aVar2, mVar2);
                    if (mVar2.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar3);
                    } else {
                        mVar2.c();
                    }
                    b4.c(eVar, z0VarD, mVar2);
                    b4.c(c1623g, i2VarX2, mVar2);
                    if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar2, iHashCode2, bVar2);
                    }
                    b4.c(fVar, rVarC2, mVar2);
                    c2.u uVar = c2.u.f22885a;
                    mVar2.C(-805644827);
                    int i17 = 3;
                    int i18 = 0;
                    for (Object obj6 : p13.h0.S0(list, 3)) {
                        int i19 = i16;
                        int i24 = i18 + 1;
                        if (i18 < 0) {
                            p13.x.q();
                            throw null;
                        }
                        q1 q1Var2 = q1.f16749a;
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        float f14 = j92.b.f97901d.f97903b;
                        float f15 = i15;
                        g6.f.a aVar4 = g6.f.f75994b;
                        q1Var2.e(f14, obj6, c2.l.C(h4.p.b(h4.r.S, i17 - i18), i18 == 0 ? 0 : i18 * 14, 0.0f, 0.0f, 0.0f, 14), f15, j20.x.b(mVar2), mVar2, 1597824, 0);
                        i16 = i19;
                        i18 = i24;
                        i17 = 3;
                        i15 = 1;
                    }
                    int i25 = i16;
                    mVar2.f();
                    mVar2.y();
                    if (i25 <= 0) {
                        mVar2.C(1312309241);
                        String strQ = gl1.y.Q(mVar2, R.string.gak_lbl_be_the_first_like);
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        s5.x0 x0VarF = d92.c.f(j92.f.f97935l, mVar2);
                        g6.f.a aVar5 = g6.f.f75994b;
                        float f16 = 8;
                        mh.c(strQ, c2.l.B(h4.r.S, f16, f16, 16, f16), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, mVar2, 0, 0, 131068);
                        mVar = mVar2;
                        mVar.f();
                    } else {
                        mVar2.C(1312659975);
                        q1Var.getClass();
                        p3.x1 x1Var2 = p3.n.f135158a;
                        if (i25 <= 0) {
                            lowerCase = sn.a.h(mVar2, -220636010, R.string.gak_lbl_be_the_first_like, mVar2);
                        } else {
                            boolean z14 = this.f16663b;
                            if (i25 == 1 && z14) {
                                lowerCase = sn.a.h(mVar2, -220632869, R.string.gak_lbl_liked_by_you_and_other, mVar2);
                            } else if (i25 == 1) {
                                mVar2.C(-220628081);
                                lowerCase = gl1.y.P(R.string.gak_lbl_likes_count_singular, new Object[]{Integer.valueOf(i25)}, mVar2).toLowerCase(Locale.ROOT);
                                lowerCase.getClass();
                                mVar2.f();
                            } else if (i25 == 2 && z14) {
                                lowerCase = sn.a.h(mVar2, -220626146, R.string.gak_social_liked_by_you_and_other, mVar2);
                            } else if (z14) {
                                mVar2.C(-220623314);
                                lowerCase = gl1.y.P(R.string.gak_social_liked_by_you_and_others, new Object[]{Integer.valueOf(i25 - 1)}, mVar2);
                                mVar2.f();
                            } else {
                                mVar2.C(-220618545);
                                lowerCase = gl1.y.P(R.string.gak_lbl_likes_count, new Object[]{Integer.valueOf(i25)}, mVar2).toLowerCase(Locale.ROOT);
                                lowerCase.getClass();
                                mVar2.f();
                            }
                        }
                        String str = lowerCase;
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        s5.x0 x0Var = j92.f.f97935l;
                        long jE = ds.e0.e(mVar2);
                        g6.f.a aVar6 = g6.f.f75994b;
                        float f17 = 8;
                        mh.c(str, c2.l.B(h4.r.S, f17, f17, 16, f17), jE, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0Var, mVar2, 0, 0, 131064);
                        mVar = mVar2;
                        mVar.f();
                    }
                    mVar.y();
                    int i26 = this.f16665d;
                    if (i26 > 0) {
                        mVar.C(1706548133);
                        q1Var.getClass();
                        p3.x1 x1Var3 = p3.n.f135158a;
                        if (i26 <= 0) {
                            mVar.C(470144896);
                            mVar.f();
                            strP = "";
                        } else if (i26 == 1) {
                            mVar.C(-400474779);
                            strP = gl1.y.P(R.string.gak_lbl_comments_count_singular, new Object[]{Integer.valueOf(i26)}, mVar);
                            mVar.f();
                        } else {
                            mVar.C(-400471844);
                            strP = gl1.y.P(R.string.gak_lbl_comments_count, new Object[]{Integer.valueOf(i26)}, mVar);
                            mVar.f();
                        }
                        String lowerCase2 = strP.toLowerCase(Locale.ROOT);
                        lowerCase2.getClass();
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        s5.x0 x0Var2 = j92.f.f97935l;
                        long jE2 = ds.e0.e(mVar);
                        h4.r.a aVar7 = h4.r.S;
                        boolean zR = mVar.r(aVar);
                        Object objQ = mVar.q();
                        if (zR) {
                            objQ = new n1(aVar, 3);
                            mVar.K(objQ);
                        } else {
                            p3.m.f135153a.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new n1(aVar, 3);
                                mVar.K(objQ);
                            }
                        }
                        float f18 = 8;
                        p3.m mVar3 = mVar;
                        mh.c(lowerCase2, c2.l.C(u1.w.d(aVar7, false, null, null, (e23.a) objQ, 15), 0.0f, f18, 0.0f, f18, 5), jE2, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0Var2, mVar3, 0, 0, 131064);
                        mVar3.f();
                    } else {
                        mVar.C(1706929247);
                        mVar.f();
                    }
                    p3.x1 x1Var4 = p3.n.f135158a;
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            default:
                ew1.q1 q1Var3 = (ew1.q1) obj5;
                jv1.u uVar2 = (jv1.u) obj4;
                c2.a0 a0Var = (c2.a0) obj;
                p3.m mVar4 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ew1.q1.a aVar8 = ew1.q1.f66677f;
                a0Var.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= mVar4.B(a0Var) ? 4 : 2;
                }
                if (mVar4.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    p3.x1 x1Var5 = p3.n.f135158a;
                    h4.r.a aVar9 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    g02.b2.a(c2.l.C(aVar9, 0.0f, 0.0f, 0.0f, j92.b.f97899b.f97921f, 7), this.f16663b, this.f16664c, this.f16665d, gl1.y.Q(mVar4, R.string.garmin_coach_review_description), null, null, null, null, mVar4, 0, 480);
                    q1Var3.y6(uVar2.f101160c, mVar4, 0);
                    q1Var3.E6(uVar2.f101161d, mVar4, 0);
                    q1Var3.w6(uVar2.f101162e, mVar4, 0);
                    c2.l.f(a0Var.a(aVar9, 1.0f, true), mVar4);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ l1(boolean z14, int i14, int i15, ew1.q1 q1Var, jv1.u uVar) {
        this.f16663b = z14;
        this.f16664c = i14;
        this.f16665d = i15;
        this.f16666e = q1Var;
        this.f16667f = uVar;
    }
}
