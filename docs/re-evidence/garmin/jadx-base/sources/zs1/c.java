package zs1;

import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import e2.f0;
import h5.e0;
import i3.i7;
import i3.mh;
import lc.u0;
import o4.m1;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import s5.x0;

/* JADX INFO: loaded from: classes10.dex */
public final class c {
    /* JADX WARN: Code duplicated, block: B:19:0x0039  */
    /* JADX WARN: Code duplicated, block: B:21:0x003e  */
    /* JADX WARN: Code duplicated, block: B:23:0x0042  */
    /* JADX WARN: Code duplicated, block: B:25:0x004a  */
    /* JADX WARN: Code duplicated, block: B:26:0x004c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    /* JADX WARN: Code duplicated, block: B:31:0x0059  */
    /* JADX WARN: Code duplicated, block: B:34:0x0062 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0064  */
    /* JADX WARN: Code duplicated, block: B:36:0x0066  */
    /* JADX WARN: Code duplicated, block: B:38:0x0069  */
    /* JADX WARN: Code duplicated, block: B:39:0x006b  */
    /* JADX WARN: Code duplicated, block: B:42:0x0092  */
    /* JADX WARN: Code duplicated, block: B:43:0x0094  */
    /* JADX WARN: Code duplicated, block: B:46:0x0099  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:58:? A[RETURN, SYNTHETIC] */
    public static final void a(h4.r rVar, boolean z14, boolean z15, p3.m mVar, int i14, int i15) {
        boolean z16;
        int i16;
        boolean z17;
        int i17;
        boolean z18;
        final boolean z19;
        boolean z24;
        p2 p2VarI0;
        final boolean z25;
        boolean z26;
        boolean z27;
        Object objQ;
        o0 o0VarE = mVar.E(266840440);
        int i18 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        int i19 = i15 & 2;
        if (i19 == 0) {
            if ((i14 & 48) == 0) {
                z16 = z14;
                i18 |= o0VarE.h(z16) ? 32 : 16;
            }
            i16 = i15 & 4;
            if (i16 != 0) {
                if ((i14 & 384) == 0) {
                    z17 = z15;
                    if (o0VarE.h(z17)) {
                        i17 = 256;
                    } else {
                        i17 = 128;
                    }
                    i18 |= i17;
                }
                if ((i18 & 147) != 146) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                if (o0VarE.n(i18 & 1, z18)) {
                    if (i19 != 0) {
                        z19 = false;
                    } else {
                        z19 = z16;
                    }
                    if (i16 != 0) {
                        z25 = false;
                    } else {
                        z25 = z17;
                    }
                    x1 x1Var = p3.n.f135158a;
                    h4.r rVarE = u1.n.e(x2.f(rVar, 1.0f), tn.k.b(d92.b.f58623a, o0VarE), m1.f128891a);
                    d92.b.f58625c.getClass();
                    h4.r rVarA = c2.l.A(rVarE, 0.0f, j92.b.f97899b.f97920e, 1);
                    if ((i18 & 112) == 32) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    z27 = z26 | ((i18 & 896) == 256);
                    objQ = o0VarE.q();
                    if (z27) {
                        objQ = new e23.l() { // from class: zs1.a
                            @Override // e23.l
                            public final Object invoke(Object obj) {
                                f0 f0Var = (f0) obj;
                                f0Var.getClass();
                                final int i24 = 0;
                                final boolean z28 = z19;
                                final boolean z29 = z25;
                                f0.b(f0Var, null, new z3.e(-1836603699, true, new e23.q() { // from class: zs1.b
                                    @Override // e23.q
                                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                        int i25;
                                        int i26;
                                        int i27;
                                        int i28;
                                        int i29 = i24;
                                        String strH = null;
                                        boolean z34 = z29;
                                        boolean z35 = z28;
                                        switch (i29) {
                                            case 0:
                                                p3.m mVar2 = (p3.m) obj3;
                                                int iIntValue = ((Integer) obj4).intValue();
                                                ((e2.d) obj2).getClass();
                                                if (mVar2.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                                                    x1 x1Var2 = p3.n.f135158a;
                                                    if (z35) {
                                                        i25 = 255406343;
                                                        i26 = R.string.trails_zoom_in_to_view_title;
                                                    } else if (z34) {
                                                        i25 = 255409424;
                                                        i26 = R.string.trail_filter_no_matching_trails_title;
                                                    } else {
                                                        i25 = 255412360;
                                                        i26 = R.string.nearby_trails_no_trails_title;
                                                    }
                                                    String strH2 = sn.a.h(mVar2, i25, i26, mVar2);
                                                    h4.r.a aVar = h4.r.S;
                                                    d92.b.f58623a.getClass();
                                                    d92.b.f58625c.getClass();
                                                    j92.e eVar = j92.b.f97899b;
                                                    h4.r rVarZ = c2.l.z(aVar, eVar.f97920e, eVar.f97917b);
                                                    h4.d.f81522a.getClass();
                                                    h4.g.b bVar = h4.d.a.f81534l;
                                                    c2.j.f22691a.getClass();
                                                    s2 s2VarA = q2.a(c2.j.f22692b, bVar, mVar2, 48);
                                                    int iHashCode = Long.hashCode(mVar2.getU());
                                                    i2 i2VarX = mVar2.x();
                                                    h4.r rVarC = h4.k.c(rVarZ, mVar2);
                                                    h5.g.V.getClass();
                                                    e0.a aVar2 = h5.g.a.f81805b;
                                                    if (mVar2.F() == null) {
                                                        p0.l();
                                                        throw null;
                                                    }
                                                    mVar2.z();
                                                    if (mVar2.getT()) {
                                                        mVar2.M(aVar2);
                                                    } else {
                                                        mVar2.c();
                                                    }
                                                    b4.c(h5.g.a.f81810g, s2VarA, mVar2);
                                                    b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                                                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                                                    if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                                                        v.h.z(iHashCode, mVar2, iHashCode, bVar2);
                                                    }
                                                    b4.c(h5.g.a.f81807d, rVarC, mVar2);
                                                    u2 u2Var = u2.f22900a;
                                                    i7.a(n5.c.a(2131233511, mVar2, 0), null, null, u0.f(mVar2), mVar2, 48, 4);
                                                    h4.r rVarC2 = c2.l.C(aVar, eVar.f97918c, 0.0f, 0.0f, 0.0f, 14);
                                                    d92.b.f58624b.getClass();
                                                    mh.c(strH2, rVarC2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97930g), mVar2), mVar2, 0, 0, 131068);
                                                    mVar2.y();
                                                } else {
                                                    mVar2.e();
                                                }
                                                return Unit.INSTANCE;
                                            default:
                                                p3.m mVar3 = (p3.m) obj3;
                                                int iIntValue2 = ((Integer) obj4).intValue();
                                                ((e2.d) obj2).getClass();
                                                if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                    x1 x1Var3 = p3.n.f135158a;
                                                    if (z35) {
                                                        mVar3.C(-541086855);
                                                        mVar3.f();
                                                    } else {
                                                        if (z34) {
                                                            i27 = -1402926192;
                                                            i28 = R.string.trail_filter_no_matching_nearby_trails_caption;
                                                        } else {
                                                            i27 = -1402922847;
                                                            i28 = R.string.nearby_trails_no_trails_message;
                                                        }
                                                        strH = sn.a.h(mVar3, i27, i28, mVar3);
                                                    }
                                                    if (strH == null) {
                                                        mVar3.C(-540829431);
                                                        mVar3.f();
                                                    } else {
                                                        mVar3.C(-540829430);
                                                        d92.b.f58623a.getClass();
                                                        d92.b.f58624b.getClass();
                                                        x0 x0VarF = d92.c.f(j92.f.f97932i, mVar3);
                                                        h4.r.a aVar3 = h4.r.S;
                                                        d92.b.f58625c.getClass();
                                                        mh.c(strH, c2.l.A(aVar3, j92.b.f97899b.f97920e, 0.0f, 2), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, mVar3, 0, 0, 131068);
                                                        mVar3.f();
                                                    }
                                                } else {
                                                    mVar3.e();
                                                }
                                                return Unit.INSTANCE;
                                        }
                                    }
                                }), 3);
                                final int i25 = 1;
                                f0.b(f0Var, null, new z3.e(1822001796, true, new e23.q() { // from class: zs1.b
                                    @Override // e23.q
                                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                        int i26;
                                        int i27;
                                        int i28;
                                        int i29;
                                        int i210 = i25;
                                        String strH = null;
                                        boolean z34 = z29;
                                        boolean z35 = z28;
                                        switch (i210) {
                                            case 0:
                                                p3.m mVar2 = (p3.m) obj3;
                                                int iIntValue = ((Integer) obj4).intValue();
                                                ((e2.d) obj2).getClass();
                                                if (mVar2.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                                                    x1 x1Var2 = p3.n.f135158a;
                                                    if (z35) {
                                                        i26 = 255406343;
                                                        i27 = R.string.trails_zoom_in_to_view_title;
                                                    } else if (z34) {
                                                        i26 = 255409424;
                                                        i27 = R.string.trail_filter_no_matching_trails_title;
                                                    } else {
                                                        i26 = 255412360;
                                                        i27 = R.string.nearby_trails_no_trails_title;
                                                    }
                                                    String strH2 = sn.a.h(mVar2, i26, i27, mVar2);
                                                    h4.r.a aVar = h4.r.S;
                                                    d92.b.f58623a.getClass();
                                                    d92.b.f58625c.getClass();
                                                    j92.e eVar = j92.b.f97899b;
                                                    h4.r rVarZ = c2.l.z(aVar, eVar.f97920e, eVar.f97917b);
                                                    h4.d.f81522a.getClass();
                                                    h4.g.b bVar = h4.d.a.f81534l;
                                                    c2.j.f22691a.getClass();
                                                    s2 s2VarA = q2.a(c2.j.f22692b, bVar, mVar2, 48);
                                                    int iHashCode = Long.hashCode(mVar2.getU());
                                                    i2 i2VarX = mVar2.x();
                                                    h4.r rVarC = h4.k.c(rVarZ, mVar2);
                                                    h5.g.V.getClass();
                                                    e0.a aVar2 = h5.g.a.f81805b;
                                                    if (mVar2.F() == null) {
                                                        p0.l();
                                                        throw null;
                                                    }
                                                    mVar2.z();
                                                    if (mVar2.getT()) {
                                                        mVar2.M(aVar2);
                                                    } else {
                                                        mVar2.c();
                                                    }
                                                    b4.c(h5.g.a.f81810g, s2VarA, mVar2);
                                                    b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                                                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                                                    if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                                                        v.h.z(iHashCode, mVar2, iHashCode, bVar2);
                                                    }
                                                    b4.c(h5.g.a.f81807d, rVarC, mVar2);
                                                    u2 u2Var = u2.f22900a;
                                                    i7.a(n5.c.a(2131233511, mVar2, 0), null, null, u0.f(mVar2), mVar2, 48, 4);
                                                    h4.r rVarC2 = c2.l.C(aVar, eVar.f97918c, 0.0f, 0.0f, 0.0f, 14);
                                                    d92.b.f58624b.getClass();
                                                    mh.c(strH2, rVarC2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97930g), mVar2), mVar2, 0, 0, 131068);
                                                    mVar2.y();
                                                } else {
                                                    mVar2.e();
                                                }
                                                return Unit.INSTANCE;
                                            default:
                                                p3.m mVar3 = (p3.m) obj3;
                                                int iIntValue2 = ((Integer) obj4).intValue();
                                                ((e2.d) obj2).getClass();
                                                if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                    x1 x1Var3 = p3.n.f135158a;
                                                    if (z35) {
                                                        mVar3.C(-541086855);
                                                        mVar3.f();
                                                    } else {
                                                        if (z34) {
                                                            i28 = -1402926192;
                                                            i29 = R.string.trail_filter_no_matching_nearby_trails_caption;
                                                        } else {
                                                            i28 = -1402922847;
                                                            i29 = R.string.nearby_trails_no_trails_message;
                                                        }
                                                        strH = sn.a.h(mVar3, i28, i29, mVar3);
                                                    }
                                                    if (strH == null) {
                                                        mVar3.C(-540829431);
                                                        mVar3.f();
                                                    } else {
                                                        mVar3.C(-540829430);
                                                        d92.b.f58623a.getClass();
                                                        d92.b.f58624b.getClass();
                                                        x0 x0VarF = d92.c.f(j92.f.f97932i, mVar3);
                                                        h4.r.a aVar3 = h4.r.S;
                                                        d92.b.f58625c.getClass();
                                                        mh.c(strH, c2.l.A(aVar3, j92.b.f97899b.f97920e, 0.0f, 2), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, mVar3, 0, 0, 131068);
                                                        mVar3.f();
                                                    }
                                                } else {
                                                    mVar3.e();
                                                }
                                                return Unit.INSTANCE;
                                        }
                                    }
                                }), 3);
                                return Unit.INSTANCE;
                            }
                        };
                        o0VarE.K(objQ);
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new e23.l() { // from class: zs1.a
                                @Override // e23.l
                                public final Object invoke(Object obj) {
                                    f0 f0Var = (f0) obj;
                                    f0Var.getClass();
                                    final int i24 = 0;
                                    final boolean z28 = z19;
                                    final boolean z29 = z25;
                                    f0.b(f0Var, null, new z3.e(-1836603699, true, new e23.q() { // from class: zs1.b
                                        @Override // e23.q
                                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                            int i26;
                                            int i27;
                                            int i28;
                                            int i29;
                                            int i210 = i24;
                                            String strH = null;
                                            boolean z34 = z29;
                                            boolean z35 = z28;
                                            switch (i210) {
                                                case 0:
                                                    p3.m mVar2 = (p3.m) obj3;
                                                    int iIntValue = ((Integer) obj4).intValue();
                                                    ((e2.d) obj2).getClass();
                                                    if (mVar2.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                                                        x1 x1Var2 = p3.n.f135158a;
                                                        if (z35) {
                                                            i26 = 255406343;
                                                            i27 = R.string.trails_zoom_in_to_view_title;
                                                        } else if (z34) {
                                                            i26 = 255409424;
                                                            i27 = R.string.trail_filter_no_matching_trails_title;
                                                        } else {
                                                            i26 = 255412360;
                                                            i27 = R.string.nearby_trails_no_trails_title;
                                                        }
                                                        String strH2 = sn.a.h(mVar2, i26, i27, mVar2);
                                                        h4.r.a aVar = h4.r.S;
                                                        d92.b.f58623a.getClass();
                                                        d92.b.f58625c.getClass();
                                                        j92.e eVar = j92.b.f97899b;
                                                        h4.r rVarZ = c2.l.z(aVar, eVar.f97920e, eVar.f97917b);
                                                        h4.d.f81522a.getClass();
                                                        h4.g.b bVar = h4.d.a.f81534l;
                                                        c2.j.f22691a.getClass();
                                                        s2 s2VarA = q2.a(c2.j.f22692b, bVar, mVar2, 48);
                                                        int iHashCode = Long.hashCode(mVar2.getU());
                                                        i2 i2VarX = mVar2.x();
                                                        h4.r rVarC = h4.k.c(rVarZ, mVar2);
                                                        h5.g.V.getClass();
                                                        e0.a aVar2 = h5.g.a.f81805b;
                                                        if (mVar2.F() == null) {
                                                            p0.l();
                                                            throw null;
                                                        }
                                                        mVar2.z();
                                                        if (mVar2.getT()) {
                                                            mVar2.M(aVar2);
                                                        } else {
                                                            mVar2.c();
                                                        }
                                                        b4.c(h5.g.a.f81810g, s2VarA, mVar2);
                                                        b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                                                        h5.g.a.b bVar2 = h5.g.a.f81813j;
                                                        if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                                                            v.h.z(iHashCode, mVar2, iHashCode, bVar2);
                                                        }
                                                        b4.c(h5.g.a.f81807d, rVarC, mVar2);
                                                        u2 u2Var = u2.f22900a;
                                                        i7.a(n5.c.a(2131233511, mVar2, 0), null, null, u0.f(mVar2), mVar2, 48, 4);
                                                        h4.r rVarC2 = c2.l.C(aVar, eVar.f97918c, 0.0f, 0.0f, 0.0f, 14);
                                                        d92.b.f58624b.getClass();
                                                        mh.c(strH2, rVarC2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97930g), mVar2), mVar2, 0, 0, 131068);
                                                        mVar2.y();
                                                    } else {
                                                        mVar2.e();
                                                    }
                                                    return Unit.INSTANCE;
                                                default:
                                                    p3.m mVar3 = (p3.m) obj3;
                                                    int iIntValue2 = ((Integer) obj4).intValue();
                                                    ((e2.d) obj2).getClass();
                                                    if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                        x1 x1Var3 = p3.n.f135158a;
                                                        if (z35) {
                                                            mVar3.C(-541086855);
                                                            mVar3.f();
                                                        } else {
                                                            if (z34) {
                                                                i28 = -1402926192;
                                                                i29 = R.string.trail_filter_no_matching_nearby_trails_caption;
                                                            } else {
                                                                i28 = -1402922847;
                                                                i29 = R.string.nearby_trails_no_trails_message;
                                                            }
                                                            strH = sn.a.h(mVar3, i28, i29, mVar3);
                                                        }
                                                        if (strH == null) {
                                                            mVar3.C(-540829431);
                                                            mVar3.f();
                                                        } else {
                                                            mVar3.C(-540829430);
                                                            d92.b.f58623a.getClass();
                                                            d92.b.f58624b.getClass();
                                                            x0 x0VarF = d92.c.f(j92.f.f97932i, mVar3);
                                                            h4.r.a aVar3 = h4.r.S;
                                                            d92.b.f58625c.getClass();
                                                            mh.c(strH, c2.l.A(aVar3, j92.b.f97899b.f97920e, 0.0f, 2), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, mVar3, 0, 0, 131068);
                                                            mVar3.f();
                                                        }
                                                    } else {
                                                        mVar3.e();
                                                    }
                                                    return Unit.INSTANCE;
                                            }
                                        }
                                    }), 3);
                                    final int i25 = 1;
                                    f0.b(f0Var, null, new z3.e(1822001796, true, new e23.q() { // from class: zs1.b
                                        @Override // e23.q
                                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                            int i26;
                                            int i27;
                                            int i28;
                                            int i29;
                                            int i210 = i25;
                                            String strH = null;
                                            boolean z34 = z29;
                                            boolean z35 = z28;
                                            switch (i210) {
                                                case 0:
                                                    p3.m mVar2 = (p3.m) obj3;
                                                    int iIntValue = ((Integer) obj4).intValue();
                                                    ((e2.d) obj2).getClass();
                                                    if (mVar2.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                                                        x1 x1Var2 = p3.n.f135158a;
                                                        if (z35) {
                                                            i26 = 255406343;
                                                            i27 = R.string.trails_zoom_in_to_view_title;
                                                        } else if (z34) {
                                                            i26 = 255409424;
                                                            i27 = R.string.trail_filter_no_matching_trails_title;
                                                        } else {
                                                            i26 = 255412360;
                                                            i27 = R.string.nearby_trails_no_trails_title;
                                                        }
                                                        String strH2 = sn.a.h(mVar2, i26, i27, mVar2);
                                                        h4.r.a aVar = h4.r.S;
                                                        d92.b.f58623a.getClass();
                                                        d92.b.f58625c.getClass();
                                                        j92.e eVar = j92.b.f97899b;
                                                        h4.r rVarZ = c2.l.z(aVar, eVar.f97920e, eVar.f97917b);
                                                        h4.d.f81522a.getClass();
                                                        h4.g.b bVar = h4.d.a.f81534l;
                                                        c2.j.f22691a.getClass();
                                                        s2 s2VarA = q2.a(c2.j.f22692b, bVar, mVar2, 48);
                                                        int iHashCode = Long.hashCode(mVar2.getU());
                                                        i2 i2VarX = mVar2.x();
                                                        h4.r rVarC = h4.k.c(rVarZ, mVar2);
                                                        h5.g.V.getClass();
                                                        e0.a aVar2 = h5.g.a.f81805b;
                                                        if (mVar2.F() == null) {
                                                            p0.l();
                                                            throw null;
                                                        }
                                                        mVar2.z();
                                                        if (mVar2.getT()) {
                                                            mVar2.M(aVar2);
                                                        } else {
                                                            mVar2.c();
                                                        }
                                                        b4.c(h5.g.a.f81810g, s2VarA, mVar2);
                                                        b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                                                        h5.g.a.b bVar2 = h5.g.a.f81813j;
                                                        if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                                                            v.h.z(iHashCode, mVar2, iHashCode, bVar2);
                                                        }
                                                        b4.c(h5.g.a.f81807d, rVarC, mVar2);
                                                        u2 u2Var = u2.f22900a;
                                                        i7.a(n5.c.a(2131233511, mVar2, 0), null, null, u0.f(mVar2), mVar2, 48, 4);
                                                        h4.r rVarC2 = c2.l.C(aVar, eVar.f97918c, 0.0f, 0.0f, 0.0f, 14);
                                                        d92.b.f58624b.getClass();
                                                        mh.c(strH2, rVarC2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97930g), mVar2), mVar2, 0, 0, 131068);
                                                        mVar2.y();
                                                    } else {
                                                        mVar2.e();
                                                    }
                                                    return Unit.INSTANCE;
                                                default:
                                                    p3.m mVar3 = (p3.m) obj3;
                                                    int iIntValue2 = ((Integer) obj4).intValue();
                                                    ((e2.d) obj2).getClass();
                                                    if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                        x1 x1Var3 = p3.n.f135158a;
                                                        if (z35) {
                                                            mVar3.C(-541086855);
                                                            mVar3.f();
                                                        } else {
                                                            if (z34) {
                                                                i28 = -1402926192;
                                                                i29 = R.string.trail_filter_no_matching_nearby_trails_caption;
                                                            } else {
                                                                i28 = -1402922847;
                                                                i29 = R.string.nearby_trails_no_trails_message;
                                                            }
                                                            strH = sn.a.h(mVar3, i28, i29, mVar3);
                                                        }
                                                        if (strH == null) {
                                                            mVar3.C(-540829431);
                                                            mVar3.f();
                                                        } else {
                                                            mVar3.C(-540829430);
                                                            d92.b.f58623a.getClass();
                                                            d92.b.f58624b.getClass();
                                                            x0 x0VarF = d92.c.f(j92.f.f97932i, mVar3);
                                                            h4.r.a aVar3 = h4.r.S;
                                                            d92.b.f58625c.getClass();
                                                            mh.c(strH, c2.l.A(aVar3, j92.b.f97899b.f97920e, 0.0f, 2), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, mVar3, 0, 0, 131068);
                                                            mVar3.f();
                                                        }
                                                    } else {
                                                        mVar3.e();
                                                    }
                                                    return Unit.INSTANCE;
                                            }
                                        }
                                    }), 3);
                                    return Unit.INSTANCE;
                                }
                            };
                            o0VarE.K(objQ);
                        }
                    }
                    e2.c.b(rVarA, null, null, null, null, null, false, null, (e23.l) objQ, o0VarE, 0, 510);
                    z24 = z25;
                } else {
                    o0VarE.e();
                    z19 = z16;
                    z24 = z17;
                }
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new fz1.m(rVar, z19, z24, i14, i15);
                }
            }
            i18 |= 384;
            z17 = z15;
            if ((i18 & 147) != 146) {
                z18 = true;
            } else {
                z18 = false;
            }
            if (o0VarE.n(i18 & 1, z18)) {
                if (i19 != 0) {
                    z19 = false;
                } else {
                    z19 = z16;
                }
                if (i16 != 0) {
                    z25 = false;
                } else {
                    z25 = z17;
                }
                x1 x1Var2 = p3.n.f135158a;
                h4.r rVarE2 = u1.n.e(x2.f(rVar, 1.0f), tn.k.b(d92.b.f58623a, o0VarE), m1.f128891a);
                d92.b.f58625c.getClass();
                h4.r rVarA2 = c2.l.A(rVarE2, 0.0f, j92.b.f97899b.f97920e, 1);
                if ((i18 & 112) == 32) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                z27 = z26 | ((i18 & 896) == 256);
                objQ = o0VarE.q();
                if (z27) {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new e23.l() { // from class: zs1.a
                            @Override // e23.l
                            public final Object invoke(Object obj) {
                                f0 f0Var = (f0) obj;
                                f0Var.getClass();
                                final int i24 = 0;
                                final boolean z28 = z19;
                                final boolean z29 = z25;
                                f0.b(f0Var, null, new z3.e(-1836603699, true, new e23.q() { // from class: zs1.b
                                    @Override // e23.q
                                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                        int i26;
                                        int i27;
                                        int i28;
                                        int i29;
                                        int i210 = i24;
                                        String strH = null;
                                        boolean z34 = z29;
                                        boolean z35 = z28;
                                        switch (i210) {
                                            case 0:
                                                p3.m mVar2 = (p3.m) obj3;
                                                int iIntValue = ((Integer) obj4).intValue();
                                                ((e2.d) obj2).getClass();
                                                if (mVar2.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                                                    x1 x1Var3 = p3.n.f135158a;
                                                    if (z35) {
                                                        i26 = 255406343;
                                                        i27 = R.string.trails_zoom_in_to_view_title;
                                                    } else if (z34) {
                                                        i26 = 255409424;
                                                        i27 = R.string.trail_filter_no_matching_trails_title;
                                                    } else {
                                                        i26 = 255412360;
                                                        i27 = R.string.nearby_trails_no_trails_title;
                                                    }
                                                    String strH2 = sn.a.h(mVar2, i26, i27, mVar2);
                                                    h4.r.a aVar = h4.r.S;
                                                    d92.b.f58623a.getClass();
                                                    d92.b.f58625c.getClass();
                                                    j92.e eVar = j92.b.f97899b;
                                                    h4.r rVarZ = c2.l.z(aVar, eVar.f97920e, eVar.f97917b);
                                                    h4.d.f81522a.getClass();
                                                    h4.g.b bVar = h4.d.a.f81534l;
                                                    c2.j.f22691a.getClass();
                                                    s2 s2VarA = q2.a(c2.j.f22692b, bVar, mVar2, 48);
                                                    int iHashCode = Long.hashCode(mVar2.getU());
                                                    i2 i2VarX = mVar2.x();
                                                    h4.r rVarC = h4.k.c(rVarZ, mVar2);
                                                    h5.g.V.getClass();
                                                    e0.a aVar2 = h5.g.a.f81805b;
                                                    if (mVar2.F() == null) {
                                                        p0.l();
                                                        throw null;
                                                    }
                                                    mVar2.z();
                                                    if (mVar2.getT()) {
                                                        mVar2.M(aVar2);
                                                    } else {
                                                        mVar2.c();
                                                    }
                                                    b4.c(h5.g.a.f81810g, s2VarA, mVar2);
                                                    b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                                                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                                                    if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                                                        v.h.z(iHashCode, mVar2, iHashCode, bVar2);
                                                    }
                                                    b4.c(h5.g.a.f81807d, rVarC, mVar2);
                                                    u2 u2Var = u2.f22900a;
                                                    i7.a(n5.c.a(2131233511, mVar2, 0), null, null, u0.f(mVar2), mVar2, 48, 4);
                                                    h4.r rVarC2 = c2.l.C(aVar, eVar.f97918c, 0.0f, 0.0f, 0.0f, 14);
                                                    d92.b.f58624b.getClass();
                                                    mh.c(strH2, rVarC2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97930g), mVar2), mVar2, 0, 0, 131068);
                                                    mVar2.y();
                                                } else {
                                                    mVar2.e();
                                                }
                                                return Unit.INSTANCE;
                                            default:
                                                p3.m mVar3 = (p3.m) obj3;
                                                int iIntValue2 = ((Integer) obj4).intValue();
                                                ((e2.d) obj2).getClass();
                                                if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                    x1 x1Var4 = p3.n.f135158a;
                                                    if (z35) {
                                                        mVar3.C(-541086855);
                                                        mVar3.f();
                                                    } else {
                                                        if (z34) {
                                                            i28 = -1402926192;
                                                            i29 = R.string.trail_filter_no_matching_nearby_trails_caption;
                                                        } else {
                                                            i28 = -1402922847;
                                                            i29 = R.string.nearby_trails_no_trails_message;
                                                        }
                                                        strH = sn.a.h(mVar3, i28, i29, mVar3);
                                                    }
                                                    if (strH == null) {
                                                        mVar3.C(-540829431);
                                                        mVar3.f();
                                                    } else {
                                                        mVar3.C(-540829430);
                                                        d92.b.f58623a.getClass();
                                                        d92.b.f58624b.getClass();
                                                        x0 x0VarF = d92.c.f(j92.f.f97932i, mVar3);
                                                        h4.r.a aVar3 = h4.r.S;
                                                        d92.b.f58625c.getClass();
                                                        mh.c(strH, c2.l.A(aVar3, j92.b.f97899b.f97920e, 0.0f, 2), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, mVar3, 0, 0, 131068);
                                                        mVar3.f();
                                                    }
                                                } else {
                                                    mVar3.e();
                                                }
                                                return Unit.INSTANCE;
                                        }
                                    }
                                }), 3);
                                final int i25 = 1;
                                f0.b(f0Var, null, new z3.e(1822001796, true, new e23.q() { // from class: zs1.b
                                    @Override // e23.q
                                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                        int i26;
                                        int i27;
                                        int i28;
                                        int i29;
                                        int i210 = i25;
                                        String strH = null;
                                        boolean z34 = z29;
                                        boolean z35 = z28;
                                        switch (i210) {
                                            case 0:
                                                p3.m mVar2 = (p3.m) obj3;
                                                int iIntValue = ((Integer) obj4).intValue();
                                                ((e2.d) obj2).getClass();
                                                if (mVar2.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                                                    x1 x1Var3 = p3.n.f135158a;
                                                    if (z35) {
                                                        i26 = 255406343;
                                                        i27 = R.string.trails_zoom_in_to_view_title;
                                                    } else if (z34) {
                                                        i26 = 255409424;
                                                        i27 = R.string.trail_filter_no_matching_trails_title;
                                                    } else {
                                                        i26 = 255412360;
                                                        i27 = R.string.nearby_trails_no_trails_title;
                                                    }
                                                    String strH2 = sn.a.h(mVar2, i26, i27, mVar2);
                                                    h4.r.a aVar = h4.r.S;
                                                    d92.b.f58623a.getClass();
                                                    d92.b.f58625c.getClass();
                                                    j92.e eVar = j92.b.f97899b;
                                                    h4.r rVarZ = c2.l.z(aVar, eVar.f97920e, eVar.f97917b);
                                                    h4.d.f81522a.getClass();
                                                    h4.g.b bVar = h4.d.a.f81534l;
                                                    c2.j.f22691a.getClass();
                                                    s2 s2VarA = q2.a(c2.j.f22692b, bVar, mVar2, 48);
                                                    int iHashCode = Long.hashCode(mVar2.getU());
                                                    i2 i2VarX = mVar2.x();
                                                    h4.r rVarC = h4.k.c(rVarZ, mVar2);
                                                    h5.g.V.getClass();
                                                    e0.a aVar2 = h5.g.a.f81805b;
                                                    if (mVar2.F() == null) {
                                                        p0.l();
                                                        throw null;
                                                    }
                                                    mVar2.z();
                                                    if (mVar2.getT()) {
                                                        mVar2.M(aVar2);
                                                    } else {
                                                        mVar2.c();
                                                    }
                                                    b4.c(h5.g.a.f81810g, s2VarA, mVar2);
                                                    b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                                                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                                                    if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                                                        v.h.z(iHashCode, mVar2, iHashCode, bVar2);
                                                    }
                                                    b4.c(h5.g.a.f81807d, rVarC, mVar2);
                                                    u2 u2Var = u2.f22900a;
                                                    i7.a(n5.c.a(2131233511, mVar2, 0), null, null, u0.f(mVar2), mVar2, 48, 4);
                                                    h4.r rVarC2 = c2.l.C(aVar, eVar.f97918c, 0.0f, 0.0f, 0.0f, 14);
                                                    d92.b.f58624b.getClass();
                                                    mh.c(strH2, rVarC2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97930g), mVar2), mVar2, 0, 0, 131068);
                                                    mVar2.y();
                                                } else {
                                                    mVar2.e();
                                                }
                                                return Unit.INSTANCE;
                                            default:
                                                p3.m mVar3 = (p3.m) obj3;
                                                int iIntValue2 = ((Integer) obj4).intValue();
                                                ((e2.d) obj2).getClass();
                                                if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                    x1 x1Var4 = p3.n.f135158a;
                                                    if (z35) {
                                                        mVar3.C(-541086855);
                                                        mVar3.f();
                                                    } else {
                                                        if (z34) {
                                                            i28 = -1402926192;
                                                            i29 = R.string.trail_filter_no_matching_nearby_trails_caption;
                                                        } else {
                                                            i28 = -1402922847;
                                                            i29 = R.string.nearby_trails_no_trails_message;
                                                        }
                                                        strH = sn.a.h(mVar3, i28, i29, mVar3);
                                                    }
                                                    if (strH == null) {
                                                        mVar3.C(-540829431);
                                                        mVar3.f();
                                                    } else {
                                                        mVar3.C(-540829430);
                                                        d92.b.f58623a.getClass();
                                                        d92.b.f58624b.getClass();
                                                        x0 x0VarF = d92.c.f(j92.f.f97932i, mVar3);
                                                        h4.r.a aVar3 = h4.r.S;
                                                        d92.b.f58625c.getClass();
                                                        mh.c(strH, c2.l.A(aVar3, j92.b.f97899b.f97920e, 0.0f, 2), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, mVar3, 0, 0, 131068);
                                                        mVar3.f();
                                                    }
                                                } else {
                                                    mVar3.e();
                                                }
                                                return Unit.INSTANCE;
                                        }
                                    }
                                }), 3);
                                return Unit.INSTANCE;
                            }
                        };
                        o0VarE.K(objQ);
                    }
                } else {
                    objQ = new e23.l() { // from class: zs1.a
                        @Override // e23.l
                        public final Object invoke(Object obj) {
                            f0 f0Var = (f0) obj;
                            f0Var.getClass();
                            final int i24 = 0;
                            final boolean z28 = z19;
                            final boolean z29 = z25;
                            f0.b(f0Var, null, new z3.e(-1836603699, true, new e23.q() { // from class: zs1.b
                                @Override // e23.q
                                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                    int i26;
                                    int i27;
                                    int i28;
                                    int i29;
                                    int i210 = i24;
                                    String strH = null;
                                    boolean z34 = z29;
                                    boolean z35 = z28;
                                    switch (i210) {
                                        case 0:
                                            p3.m mVar2 = (p3.m) obj3;
                                            int iIntValue = ((Integer) obj4).intValue();
                                            ((e2.d) obj2).getClass();
                                            if (mVar2.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                                                x1 x1Var3 = p3.n.f135158a;
                                                if (z35) {
                                                    i26 = 255406343;
                                                    i27 = R.string.trails_zoom_in_to_view_title;
                                                } else if (z34) {
                                                    i26 = 255409424;
                                                    i27 = R.string.trail_filter_no_matching_trails_title;
                                                } else {
                                                    i26 = 255412360;
                                                    i27 = R.string.nearby_trails_no_trails_title;
                                                }
                                                String strH2 = sn.a.h(mVar2, i26, i27, mVar2);
                                                h4.r.a aVar = h4.r.S;
                                                d92.b.f58623a.getClass();
                                                d92.b.f58625c.getClass();
                                                j92.e eVar = j92.b.f97899b;
                                                h4.r rVarZ = c2.l.z(aVar, eVar.f97920e, eVar.f97917b);
                                                h4.d.f81522a.getClass();
                                                h4.g.b bVar = h4.d.a.f81534l;
                                                c2.j.f22691a.getClass();
                                                s2 s2VarA = q2.a(c2.j.f22692b, bVar, mVar2, 48);
                                                int iHashCode = Long.hashCode(mVar2.getU());
                                                i2 i2VarX = mVar2.x();
                                                h4.r rVarC = h4.k.c(rVarZ, mVar2);
                                                h5.g.V.getClass();
                                                e0.a aVar2 = h5.g.a.f81805b;
                                                if (mVar2.F() == null) {
                                                    p0.l();
                                                    throw null;
                                                }
                                                mVar2.z();
                                                if (mVar2.getT()) {
                                                    mVar2.M(aVar2);
                                                } else {
                                                    mVar2.c();
                                                }
                                                b4.c(h5.g.a.f81810g, s2VarA, mVar2);
                                                b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                                                h5.g.a.b bVar2 = h5.g.a.f81813j;
                                                if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                                                    v.h.z(iHashCode, mVar2, iHashCode, bVar2);
                                                }
                                                b4.c(h5.g.a.f81807d, rVarC, mVar2);
                                                u2 u2Var = u2.f22900a;
                                                i7.a(n5.c.a(2131233511, mVar2, 0), null, null, u0.f(mVar2), mVar2, 48, 4);
                                                h4.r rVarC2 = c2.l.C(aVar, eVar.f97918c, 0.0f, 0.0f, 0.0f, 14);
                                                d92.b.f58624b.getClass();
                                                mh.c(strH2, rVarC2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97930g), mVar2), mVar2, 0, 0, 131068);
                                                mVar2.y();
                                            } else {
                                                mVar2.e();
                                            }
                                            return Unit.INSTANCE;
                                        default:
                                            p3.m mVar3 = (p3.m) obj3;
                                            int iIntValue2 = ((Integer) obj4).intValue();
                                            ((e2.d) obj2).getClass();
                                            if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                x1 x1Var4 = p3.n.f135158a;
                                                if (z35) {
                                                    mVar3.C(-541086855);
                                                    mVar3.f();
                                                } else {
                                                    if (z34) {
                                                        i28 = -1402926192;
                                                        i29 = R.string.trail_filter_no_matching_nearby_trails_caption;
                                                    } else {
                                                        i28 = -1402922847;
                                                        i29 = R.string.nearby_trails_no_trails_message;
                                                    }
                                                    strH = sn.a.h(mVar3, i28, i29, mVar3);
                                                }
                                                if (strH == null) {
                                                    mVar3.C(-540829431);
                                                    mVar3.f();
                                                } else {
                                                    mVar3.C(-540829430);
                                                    d92.b.f58623a.getClass();
                                                    d92.b.f58624b.getClass();
                                                    x0 x0VarF = d92.c.f(j92.f.f97932i, mVar3);
                                                    h4.r.a aVar3 = h4.r.S;
                                                    d92.b.f58625c.getClass();
                                                    mh.c(strH, c2.l.A(aVar3, j92.b.f97899b.f97920e, 0.0f, 2), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, mVar3, 0, 0, 131068);
                                                    mVar3.f();
                                                }
                                            } else {
                                                mVar3.e();
                                            }
                                            return Unit.INSTANCE;
                                    }
                                }
                            }), 3);
                            final int i25 = 1;
                            f0.b(f0Var, null, new z3.e(1822001796, true, new e23.q() { // from class: zs1.b
                                @Override // e23.q
                                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                    int i26;
                                    int i27;
                                    int i28;
                                    int i29;
                                    int i210 = i25;
                                    String strH = null;
                                    boolean z34 = z29;
                                    boolean z35 = z28;
                                    switch (i210) {
                                        case 0:
                                            p3.m mVar2 = (p3.m) obj3;
                                            int iIntValue = ((Integer) obj4).intValue();
                                            ((e2.d) obj2).getClass();
                                            if (mVar2.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                                                x1 x1Var3 = p3.n.f135158a;
                                                if (z35) {
                                                    i26 = 255406343;
                                                    i27 = R.string.trails_zoom_in_to_view_title;
                                                } else if (z34) {
                                                    i26 = 255409424;
                                                    i27 = R.string.trail_filter_no_matching_trails_title;
                                                } else {
                                                    i26 = 255412360;
                                                    i27 = R.string.nearby_trails_no_trails_title;
                                                }
                                                String strH2 = sn.a.h(mVar2, i26, i27, mVar2);
                                                h4.r.a aVar = h4.r.S;
                                                d92.b.f58623a.getClass();
                                                d92.b.f58625c.getClass();
                                                j92.e eVar = j92.b.f97899b;
                                                h4.r rVarZ = c2.l.z(aVar, eVar.f97920e, eVar.f97917b);
                                                h4.d.f81522a.getClass();
                                                h4.g.b bVar = h4.d.a.f81534l;
                                                c2.j.f22691a.getClass();
                                                s2 s2VarA = q2.a(c2.j.f22692b, bVar, mVar2, 48);
                                                int iHashCode = Long.hashCode(mVar2.getU());
                                                i2 i2VarX = mVar2.x();
                                                h4.r rVarC = h4.k.c(rVarZ, mVar2);
                                                h5.g.V.getClass();
                                                e0.a aVar2 = h5.g.a.f81805b;
                                                if (mVar2.F() == null) {
                                                    p0.l();
                                                    throw null;
                                                }
                                                mVar2.z();
                                                if (mVar2.getT()) {
                                                    mVar2.M(aVar2);
                                                } else {
                                                    mVar2.c();
                                                }
                                                b4.c(h5.g.a.f81810g, s2VarA, mVar2);
                                                b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                                                h5.g.a.b bVar2 = h5.g.a.f81813j;
                                                if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                                                    v.h.z(iHashCode, mVar2, iHashCode, bVar2);
                                                }
                                                b4.c(h5.g.a.f81807d, rVarC, mVar2);
                                                u2 u2Var = u2.f22900a;
                                                i7.a(n5.c.a(2131233511, mVar2, 0), null, null, u0.f(mVar2), mVar2, 48, 4);
                                                h4.r rVarC2 = c2.l.C(aVar, eVar.f97918c, 0.0f, 0.0f, 0.0f, 14);
                                                d92.b.f58624b.getClass();
                                                mh.c(strH2, rVarC2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97930g), mVar2), mVar2, 0, 0, 131068);
                                                mVar2.y();
                                            } else {
                                                mVar2.e();
                                            }
                                            return Unit.INSTANCE;
                                        default:
                                            p3.m mVar3 = (p3.m) obj3;
                                            int iIntValue2 = ((Integer) obj4).intValue();
                                            ((e2.d) obj2).getClass();
                                            if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                x1 x1Var4 = p3.n.f135158a;
                                                if (z35) {
                                                    mVar3.C(-541086855);
                                                    mVar3.f();
                                                } else {
                                                    if (z34) {
                                                        i28 = -1402926192;
                                                        i29 = R.string.trail_filter_no_matching_nearby_trails_caption;
                                                    } else {
                                                        i28 = -1402922847;
                                                        i29 = R.string.nearby_trails_no_trails_message;
                                                    }
                                                    strH = sn.a.h(mVar3, i28, i29, mVar3);
                                                }
                                                if (strH == null) {
                                                    mVar3.C(-540829431);
                                                    mVar3.f();
                                                } else {
                                                    mVar3.C(-540829430);
                                                    d92.b.f58623a.getClass();
                                                    d92.b.f58624b.getClass();
                                                    x0 x0VarF = d92.c.f(j92.f.f97932i, mVar3);
                                                    h4.r.a aVar3 = h4.r.S;
                                                    d92.b.f58625c.getClass();
                                                    mh.c(strH, c2.l.A(aVar3, j92.b.f97899b.f97920e, 0.0f, 2), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, mVar3, 0, 0, 131068);
                                                    mVar3.f();
                                                }
                                            } else {
                                                mVar3.e();
                                            }
                                            return Unit.INSTANCE;
                                    }
                                }
                            }), 3);
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(objQ);
                }
                e2.c.b(rVarA2, null, null, null, null, null, false, null, (e23.l) objQ, o0VarE, 0, 510);
                z24 = z25;
            } else {
                o0VarE.e();
                z19 = z16;
                z24 = z17;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new fz1.m(rVar, z19, z24, i14, i15);
            }
        }
        i18 |= 48;
        z16 = z14;
        i16 = i15 & 4;
        if (i16 != 0) {
            if ((i14 & 384) == 0) {
                z17 = z15;
                if (o0VarE.h(z17)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i18 |= i17;
            }
            if ((i18 & 147) != 146) {
                z18 = true;
            } else {
                z18 = false;
            }
            if (o0VarE.n(i18 & 1, z18)) {
                if (i19 != 0) {
                    z19 = false;
                } else {
                    z19 = z16;
                }
                if (i16 != 0) {
                    z25 = false;
                } else {
                    z25 = z17;
                }
                x1 x1Var3 = p3.n.f135158a;
                h4.r rVarE3 = u1.n.e(x2.f(rVar, 1.0f), tn.k.b(d92.b.f58623a, o0VarE), m1.f128891a);
                d92.b.f58625c.getClass();
                h4.r rVarA3 = c2.l.A(rVarE3, 0.0f, j92.b.f97899b.f97920e, 1);
                if ((i18 & 112) == 32) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                z27 = z26 | ((i18 & 896) == 256);
                objQ = o0VarE.q();
                if (z27) {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new e23.l() { // from class: zs1.a
                            @Override // e23.l
                            public final Object invoke(Object obj) {
                                f0 f0Var = (f0) obj;
                                f0Var.getClass();
                                final int i24 = 0;
                                final boolean z28 = z19;
                                final boolean z29 = z25;
                                f0.b(f0Var, null, new z3.e(-1836603699, true, new e23.q() { // from class: zs1.b
                                    @Override // e23.q
                                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                        int i26;
                                        int i27;
                                        int i28;
                                        int i29;
                                        int i210 = i24;
                                        String strH = null;
                                        boolean z34 = z29;
                                        boolean z35 = z28;
                                        switch (i210) {
                                            case 0:
                                                p3.m mVar2 = (p3.m) obj3;
                                                int iIntValue = ((Integer) obj4).intValue();
                                                ((e2.d) obj2).getClass();
                                                if (mVar2.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                                                    x1 x1Var4 = p3.n.f135158a;
                                                    if (z35) {
                                                        i26 = 255406343;
                                                        i27 = R.string.trails_zoom_in_to_view_title;
                                                    } else if (z34) {
                                                        i26 = 255409424;
                                                        i27 = R.string.trail_filter_no_matching_trails_title;
                                                    } else {
                                                        i26 = 255412360;
                                                        i27 = R.string.nearby_trails_no_trails_title;
                                                    }
                                                    String strH2 = sn.a.h(mVar2, i26, i27, mVar2);
                                                    h4.r.a aVar = h4.r.S;
                                                    d92.b.f58623a.getClass();
                                                    d92.b.f58625c.getClass();
                                                    j92.e eVar = j92.b.f97899b;
                                                    h4.r rVarZ = c2.l.z(aVar, eVar.f97920e, eVar.f97917b);
                                                    h4.d.f81522a.getClass();
                                                    h4.g.b bVar = h4.d.a.f81534l;
                                                    c2.j.f22691a.getClass();
                                                    s2 s2VarA = q2.a(c2.j.f22692b, bVar, mVar2, 48);
                                                    int iHashCode = Long.hashCode(mVar2.getU());
                                                    i2 i2VarX = mVar2.x();
                                                    h4.r rVarC = h4.k.c(rVarZ, mVar2);
                                                    h5.g.V.getClass();
                                                    e0.a aVar2 = h5.g.a.f81805b;
                                                    if (mVar2.F() == null) {
                                                        p0.l();
                                                        throw null;
                                                    }
                                                    mVar2.z();
                                                    if (mVar2.getT()) {
                                                        mVar2.M(aVar2);
                                                    } else {
                                                        mVar2.c();
                                                    }
                                                    b4.c(h5.g.a.f81810g, s2VarA, mVar2);
                                                    b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                                                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                                                    if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                                                        v.h.z(iHashCode, mVar2, iHashCode, bVar2);
                                                    }
                                                    b4.c(h5.g.a.f81807d, rVarC, mVar2);
                                                    u2 u2Var = u2.f22900a;
                                                    i7.a(n5.c.a(2131233511, mVar2, 0), null, null, u0.f(mVar2), mVar2, 48, 4);
                                                    h4.r rVarC2 = c2.l.C(aVar, eVar.f97918c, 0.0f, 0.0f, 0.0f, 14);
                                                    d92.b.f58624b.getClass();
                                                    mh.c(strH2, rVarC2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97930g), mVar2), mVar2, 0, 0, 131068);
                                                    mVar2.y();
                                                } else {
                                                    mVar2.e();
                                                }
                                                return Unit.INSTANCE;
                                            default:
                                                p3.m mVar3 = (p3.m) obj3;
                                                int iIntValue2 = ((Integer) obj4).intValue();
                                                ((e2.d) obj2).getClass();
                                                if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                    x1 x1Var5 = p3.n.f135158a;
                                                    if (z35) {
                                                        mVar3.C(-541086855);
                                                        mVar3.f();
                                                    } else {
                                                        if (z34) {
                                                            i28 = -1402926192;
                                                            i29 = R.string.trail_filter_no_matching_nearby_trails_caption;
                                                        } else {
                                                            i28 = -1402922847;
                                                            i29 = R.string.nearby_trails_no_trails_message;
                                                        }
                                                        strH = sn.a.h(mVar3, i28, i29, mVar3);
                                                    }
                                                    if (strH == null) {
                                                        mVar3.C(-540829431);
                                                        mVar3.f();
                                                    } else {
                                                        mVar3.C(-540829430);
                                                        d92.b.f58623a.getClass();
                                                        d92.b.f58624b.getClass();
                                                        x0 x0VarF = d92.c.f(j92.f.f97932i, mVar3);
                                                        h4.r.a aVar3 = h4.r.S;
                                                        d92.b.f58625c.getClass();
                                                        mh.c(strH, c2.l.A(aVar3, j92.b.f97899b.f97920e, 0.0f, 2), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, mVar3, 0, 0, 131068);
                                                        mVar3.f();
                                                    }
                                                } else {
                                                    mVar3.e();
                                                }
                                                return Unit.INSTANCE;
                                        }
                                    }
                                }), 3);
                                final int i25 = 1;
                                f0.b(f0Var, null, new z3.e(1822001796, true, new e23.q() { // from class: zs1.b
                                    @Override // e23.q
                                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                        int i26;
                                        int i27;
                                        int i28;
                                        int i29;
                                        int i210 = i25;
                                        String strH = null;
                                        boolean z34 = z29;
                                        boolean z35 = z28;
                                        switch (i210) {
                                            case 0:
                                                p3.m mVar2 = (p3.m) obj3;
                                                int iIntValue = ((Integer) obj4).intValue();
                                                ((e2.d) obj2).getClass();
                                                if (mVar2.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                                                    x1 x1Var4 = p3.n.f135158a;
                                                    if (z35) {
                                                        i26 = 255406343;
                                                        i27 = R.string.trails_zoom_in_to_view_title;
                                                    } else if (z34) {
                                                        i26 = 255409424;
                                                        i27 = R.string.trail_filter_no_matching_trails_title;
                                                    } else {
                                                        i26 = 255412360;
                                                        i27 = R.string.nearby_trails_no_trails_title;
                                                    }
                                                    String strH2 = sn.a.h(mVar2, i26, i27, mVar2);
                                                    h4.r.a aVar = h4.r.S;
                                                    d92.b.f58623a.getClass();
                                                    d92.b.f58625c.getClass();
                                                    j92.e eVar = j92.b.f97899b;
                                                    h4.r rVarZ = c2.l.z(aVar, eVar.f97920e, eVar.f97917b);
                                                    h4.d.f81522a.getClass();
                                                    h4.g.b bVar = h4.d.a.f81534l;
                                                    c2.j.f22691a.getClass();
                                                    s2 s2VarA = q2.a(c2.j.f22692b, bVar, mVar2, 48);
                                                    int iHashCode = Long.hashCode(mVar2.getU());
                                                    i2 i2VarX = mVar2.x();
                                                    h4.r rVarC = h4.k.c(rVarZ, mVar2);
                                                    h5.g.V.getClass();
                                                    e0.a aVar2 = h5.g.a.f81805b;
                                                    if (mVar2.F() == null) {
                                                        p0.l();
                                                        throw null;
                                                    }
                                                    mVar2.z();
                                                    if (mVar2.getT()) {
                                                        mVar2.M(aVar2);
                                                    } else {
                                                        mVar2.c();
                                                    }
                                                    b4.c(h5.g.a.f81810g, s2VarA, mVar2);
                                                    b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                                                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                                                    if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                                                        v.h.z(iHashCode, mVar2, iHashCode, bVar2);
                                                    }
                                                    b4.c(h5.g.a.f81807d, rVarC, mVar2);
                                                    u2 u2Var = u2.f22900a;
                                                    i7.a(n5.c.a(2131233511, mVar2, 0), null, null, u0.f(mVar2), mVar2, 48, 4);
                                                    h4.r rVarC2 = c2.l.C(aVar, eVar.f97918c, 0.0f, 0.0f, 0.0f, 14);
                                                    d92.b.f58624b.getClass();
                                                    mh.c(strH2, rVarC2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97930g), mVar2), mVar2, 0, 0, 131068);
                                                    mVar2.y();
                                                } else {
                                                    mVar2.e();
                                                }
                                                return Unit.INSTANCE;
                                            default:
                                                p3.m mVar3 = (p3.m) obj3;
                                                int iIntValue2 = ((Integer) obj4).intValue();
                                                ((e2.d) obj2).getClass();
                                                if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                    x1 x1Var5 = p3.n.f135158a;
                                                    if (z35) {
                                                        mVar3.C(-541086855);
                                                        mVar3.f();
                                                    } else {
                                                        if (z34) {
                                                            i28 = -1402926192;
                                                            i29 = R.string.trail_filter_no_matching_nearby_trails_caption;
                                                        } else {
                                                            i28 = -1402922847;
                                                            i29 = R.string.nearby_trails_no_trails_message;
                                                        }
                                                        strH = sn.a.h(mVar3, i28, i29, mVar3);
                                                    }
                                                    if (strH == null) {
                                                        mVar3.C(-540829431);
                                                        mVar3.f();
                                                    } else {
                                                        mVar3.C(-540829430);
                                                        d92.b.f58623a.getClass();
                                                        d92.b.f58624b.getClass();
                                                        x0 x0VarF = d92.c.f(j92.f.f97932i, mVar3);
                                                        h4.r.a aVar3 = h4.r.S;
                                                        d92.b.f58625c.getClass();
                                                        mh.c(strH, c2.l.A(aVar3, j92.b.f97899b.f97920e, 0.0f, 2), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, mVar3, 0, 0, 131068);
                                                        mVar3.f();
                                                    }
                                                } else {
                                                    mVar3.e();
                                                }
                                                return Unit.INSTANCE;
                                        }
                                    }
                                }), 3);
                                return Unit.INSTANCE;
                            }
                        };
                        o0VarE.K(objQ);
                    }
                } else {
                    objQ = new e23.l() { // from class: zs1.a
                        @Override // e23.l
                        public final Object invoke(Object obj) {
                            f0 f0Var = (f0) obj;
                            f0Var.getClass();
                            final int i24 = 0;
                            final boolean z28 = z19;
                            final boolean z29 = z25;
                            f0.b(f0Var, null, new z3.e(-1836603699, true, new e23.q() { // from class: zs1.b
                                @Override // e23.q
                                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                    int i26;
                                    int i27;
                                    int i28;
                                    int i29;
                                    int i210 = i24;
                                    String strH = null;
                                    boolean z34 = z29;
                                    boolean z35 = z28;
                                    switch (i210) {
                                        case 0:
                                            p3.m mVar2 = (p3.m) obj3;
                                            int iIntValue = ((Integer) obj4).intValue();
                                            ((e2.d) obj2).getClass();
                                            if (mVar2.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                                                x1 x1Var4 = p3.n.f135158a;
                                                if (z35) {
                                                    i26 = 255406343;
                                                    i27 = R.string.trails_zoom_in_to_view_title;
                                                } else if (z34) {
                                                    i26 = 255409424;
                                                    i27 = R.string.trail_filter_no_matching_trails_title;
                                                } else {
                                                    i26 = 255412360;
                                                    i27 = R.string.nearby_trails_no_trails_title;
                                                }
                                                String strH2 = sn.a.h(mVar2, i26, i27, mVar2);
                                                h4.r.a aVar = h4.r.S;
                                                d92.b.f58623a.getClass();
                                                d92.b.f58625c.getClass();
                                                j92.e eVar = j92.b.f97899b;
                                                h4.r rVarZ = c2.l.z(aVar, eVar.f97920e, eVar.f97917b);
                                                h4.d.f81522a.getClass();
                                                h4.g.b bVar = h4.d.a.f81534l;
                                                c2.j.f22691a.getClass();
                                                s2 s2VarA = q2.a(c2.j.f22692b, bVar, mVar2, 48);
                                                int iHashCode = Long.hashCode(mVar2.getU());
                                                i2 i2VarX = mVar2.x();
                                                h4.r rVarC = h4.k.c(rVarZ, mVar2);
                                                h5.g.V.getClass();
                                                e0.a aVar2 = h5.g.a.f81805b;
                                                if (mVar2.F() == null) {
                                                    p0.l();
                                                    throw null;
                                                }
                                                mVar2.z();
                                                if (mVar2.getT()) {
                                                    mVar2.M(aVar2);
                                                } else {
                                                    mVar2.c();
                                                }
                                                b4.c(h5.g.a.f81810g, s2VarA, mVar2);
                                                b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                                                h5.g.a.b bVar2 = h5.g.a.f81813j;
                                                if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                                                    v.h.z(iHashCode, mVar2, iHashCode, bVar2);
                                                }
                                                b4.c(h5.g.a.f81807d, rVarC, mVar2);
                                                u2 u2Var = u2.f22900a;
                                                i7.a(n5.c.a(2131233511, mVar2, 0), null, null, u0.f(mVar2), mVar2, 48, 4);
                                                h4.r rVarC2 = c2.l.C(aVar, eVar.f97918c, 0.0f, 0.0f, 0.0f, 14);
                                                d92.b.f58624b.getClass();
                                                mh.c(strH2, rVarC2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97930g), mVar2), mVar2, 0, 0, 131068);
                                                mVar2.y();
                                            } else {
                                                mVar2.e();
                                            }
                                            return Unit.INSTANCE;
                                        default:
                                            p3.m mVar3 = (p3.m) obj3;
                                            int iIntValue2 = ((Integer) obj4).intValue();
                                            ((e2.d) obj2).getClass();
                                            if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                x1 x1Var5 = p3.n.f135158a;
                                                if (z35) {
                                                    mVar3.C(-541086855);
                                                    mVar3.f();
                                                } else {
                                                    if (z34) {
                                                        i28 = -1402926192;
                                                        i29 = R.string.trail_filter_no_matching_nearby_trails_caption;
                                                    } else {
                                                        i28 = -1402922847;
                                                        i29 = R.string.nearby_trails_no_trails_message;
                                                    }
                                                    strH = sn.a.h(mVar3, i28, i29, mVar3);
                                                }
                                                if (strH == null) {
                                                    mVar3.C(-540829431);
                                                    mVar3.f();
                                                } else {
                                                    mVar3.C(-540829430);
                                                    d92.b.f58623a.getClass();
                                                    d92.b.f58624b.getClass();
                                                    x0 x0VarF = d92.c.f(j92.f.f97932i, mVar3);
                                                    h4.r.a aVar3 = h4.r.S;
                                                    d92.b.f58625c.getClass();
                                                    mh.c(strH, c2.l.A(aVar3, j92.b.f97899b.f97920e, 0.0f, 2), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, mVar3, 0, 0, 131068);
                                                    mVar3.f();
                                                }
                                            } else {
                                                mVar3.e();
                                            }
                                            return Unit.INSTANCE;
                                    }
                                }
                            }), 3);
                            final int i25 = 1;
                            f0.b(f0Var, null, new z3.e(1822001796, true, new e23.q() { // from class: zs1.b
                                @Override // e23.q
                                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                    int i26;
                                    int i27;
                                    int i28;
                                    int i29;
                                    int i210 = i25;
                                    String strH = null;
                                    boolean z34 = z29;
                                    boolean z35 = z28;
                                    switch (i210) {
                                        case 0:
                                            p3.m mVar2 = (p3.m) obj3;
                                            int iIntValue = ((Integer) obj4).intValue();
                                            ((e2.d) obj2).getClass();
                                            if (mVar2.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                                                x1 x1Var4 = p3.n.f135158a;
                                                if (z35) {
                                                    i26 = 255406343;
                                                    i27 = R.string.trails_zoom_in_to_view_title;
                                                } else if (z34) {
                                                    i26 = 255409424;
                                                    i27 = R.string.trail_filter_no_matching_trails_title;
                                                } else {
                                                    i26 = 255412360;
                                                    i27 = R.string.nearby_trails_no_trails_title;
                                                }
                                                String strH2 = sn.a.h(mVar2, i26, i27, mVar2);
                                                h4.r.a aVar = h4.r.S;
                                                d92.b.f58623a.getClass();
                                                d92.b.f58625c.getClass();
                                                j92.e eVar = j92.b.f97899b;
                                                h4.r rVarZ = c2.l.z(aVar, eVar.f97920e, eVar.f97917b);
                                                h4.d.f81522a.getClass();
                                                h4.g.b bVar = h4.d.a.f81534l;
                                                c2.j.f22691a.getClass();
                                                s2 s2VarA = q2.a(c2.j.f22692b, bVar, mVar2, 48);
                                                int iHashCode = Long.hashCode(mVar2.getU());
                                                i2 i2VarX = mVar2.x();
                                                h4.r rVarC = h4.k.c(rVarZ, mVar2);
                                                h5.g.V.getClass();
                                                e0.a aVar2 = h5.g.a.f81805b;
                                                if (mVar2.F() == null) {
                                                    p0.l();
                                                    throw null;
                                                }
                                                mVar2.z();
                                                if (mVar2.getT()) {
                                                    mVar2.M(aVar2);
                                                } else {
                                                    mVar2.c();
                                                }
                                                b4.c(h5.g.a.f81810g, s2VarA, mVar2);
                                                b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                                                h5.g.a.b bVar2 = h5.g.a.f81813j;
                                                if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                                                    v.h.z(iHashCode, mVar2, iHashCode, bVar2);
                                                }
                                                b4.c(h5.g.a.f81807d, rVarC, mVar2);
                                                u2 u2Var = u2.f22900a;
                                                i7.a(n5.c.a(2131233511, mVar2, 0), null, null, u0.f(mVar2), mVar2, 48, 4);
                                                h4.r rVarC2 = c2.l.C(aVar, eVar.f97918c, 0.0f, 0.0f, 0.0f, 14);
                                                d92.b.f58624b.getClass();
                                                mh.c(strH2, rVarC2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97930g), mVar2), mVar2, 0, 0, 131068);
                                                mVar2.y();
                                            } else {
                                                mVar2.e();
                                            }
                                            return Unit.INSTANCE;
                                        default:
                                            p3.m mVar3 = (p3.m) obj3;
                                            int iIntValue2 = ((Integer) obj4).intValue();
                                            ((e2.d) obj2).getClass();
                                            if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                x1 x1Var5 = p3.n.f135158a;
                                                if (z35) {
                                                    mVar3.C(-541086855);
                                                    mVar3.f();
                                                } else {
                                                    if (z34) {
                                                        i28 = -1402926192;
                                                        i29 = R.string.trail_filter_no_matching_nearby_trails_caption;
                                                    } else {
                                                        i28 = -1402922847;
                                                        i29 = R.string.nearby_trails_no_trails_message;
                                                    }
                                                    strH = sn.a.h(mVar3, i28, i29, mVar3);
                                                }
                                                if (strH == null) {
                                                    mVar3.C(-540829431);
                                                    mVar3.f();
                                                } else {
                                                    mVar3.C(-540829430);
                                                    d92.b.f58623a.getClass();
                                                    d92.b.f58624b.getClass();
                                                    x0 x0VarF = d92.c.f(j92.f.f97932i, mVar3);
                                                    h4.r.a aVar3 = h4.r.S;
                                                    d92.b.f58625c.getClass();
                                                    mh.c(strH, c2.l.A(aVar3, j92.b.f97899b.f97920e, 0.0f, 2), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, mVar3, 0, 0, 131068);
                                                    mVar3.f();
                                                }
                                            } else {
                                                mVar3.e();
                                            }
                                            return Unit.INSTANCE;
                                    }
                                }
                            }), 3);
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(objQ);
                }
                e2.c.b(rVarA3, null, null, null, null, null, false, null, (e23.l) objQ, o0VarE, 0, 510);
                z24 = z25;
            } else {
                o0VarE.e();
                z19 = z16;
                z24 = z17;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new fz1.m(rVar, z19, z24, i14, i15);
            }
        }
        i18 |= 384;
        z17 = z15;
        if ((i18 & 147) != 146) {
            z18 = true;
        } else {
            z18 = false;
        }
        if (o0VarE.n(i18 & 1, z18)) {
            if (i19 != 0) {
                z19 = false;
            } else {
                z19 = z16;
            }
            if (i16 != 0) {
                z25 = false;
            } else {
                z25 = z17;
            }
            x1 x1Var4 = p3.n.f135158a;
            h4.r rVarE4 = u1.n.e(x2.f(rVar, 1.0f), tn.k.b(d92.b.f58623a, o0VarE), m1.f128891a);
            d92.b.f58625c.getClass();
            h4.r rVarA4 = c2.l.A(rVarE4, 0.0f, j92.b.f97899b.f97920e, 1);
            if ((i18 & 112) == 32) {
                z26 = true;
            } else {
                z26 = false;
            }
            z27 = z26 | ((i18 & 896) == 256);
            objQ = o0VarE.q();
            if (z27) {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new e23.l() { // from class: zs1.a
                        @Override // e23.l
                        public final Object invoke(Object obj) {
                            f0 f0Var = (f0) obj;
                            f0Var.getClass();
                            final int i24 = 0;
                            final boolean z28 = z19;
                            final boolean z29 = z25;
                            f0.b(f0Var, null, new z3.e(-1836603699, true, new e23.q() { // from class: zs1.b
                                @Override // e23.q
                                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                    int i26;
                                    int i27;
                                    int i28;
                                    int i29;
                                    int i210 = i24;
                                    String strH = null;
                                    boolean z34 = z29;
                                    boolean z35 = z28;
                                    switch (i210) {
                                        case 0:
                                            p3.m mVar2 = (p3.m) obj3;
                                            int iIntValue = ((Integer) obj4).intValue();
                                            ((e2.d) obj2).getClass();
                                            if (mVar2.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                                                x1 x1Var5 = p3.n.f135158a;
                                                if (z35) {
                                                    i26 = 255406343;
                                                    i27 = R.string.trails_zoom_in_to_view_title;
                                                } else if (z34) {
                                                    i26 = 255409424;
                                                    i27 = R.string.trail_filter_no_matching_trails_title;
                                                } else {
                                                    i26 = 255412360;
                                                    i27 = R.string.nearby_trails_no_trails_title;
                                                }
                                                String strH2 = sn.a.h(mVar2, i26, i27, mVar2);
                                                h4.r.a aVar = h4.r.S;
                                                d92.b.f58623a.getClass();
                                                d92.b.f58625c.getClass();
                                                j92.e eVar = j92.b.f97899b;
                                                h4.r rVarZ = c2.l.z(aVar, eVar.f97920e, eVar.f97917b);
                                                h4.d.f81522a.getClass();
                                                h4.g.b bVar = h4.d.a.f81534l;
                                                c2.j.f22691a.getClass();
                                                s2 s2VarA = q2.a(c2.j.f22692b, bVar, mVar2, 48);
                                                int iHashCode = Long.hashCode(mVar2.getU());
                                                i2 i2VarX = mVar2.x();
                                                h4.r rVarC = h4.k.c(rVarZ, mVar2);
                                                h5.g.V.getClass();
                                                e0.a aVar2 = h5.g.a.f81805b;
                                                if (mVar2.F() == null) {
                                                    p0.l();
                                                    throw null;
                                                }
                                                mVar2.z();
                                                if (mVar2.getT()) {
                                                    mVar2.M(aVar2);
                                                } else {
                                                    mVar2.c();
                                                }
                                                b4.c(h5.g.a.f81810g, s2VarA, mVar2);
                                                b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                                                h5.g.a.b bVar2 = h5.g.a.f81813j;
                                                if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                                                    v.h.z(iHashCode, mVar2, iHashCode, bVar2);
                                                }
                                                b4.c(h5.g.a.f81807d, rVarC, mVar2);
                                                u2 u2Var = u2.f22900a;
                                                i7.a(n5.c.a(2131233511, mVar2, 0), null, null, u0.f(mVar2), mVar2, 48, 4);
                                                h4.r rVarC2 = c2.l.C(aVar, eVar.f97918c, 0.0f, 0.0f, 0.0f, 14);
                                                d92.b.f58624b.getClass();
                                                mh.c(strH2, rVarC2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97930g), mVar2), mVar2, 0, 0, 131068);
                                                mVar2.y();
                                            } else {
                                                mVar2.e();
                                            }
                                            return Unit.INSTANCE;
                                        default:
                                            p3.m mVar3 = (p3.m) obj3;
                                            int iIntValue2 = ((Integer) obj4).intValue();
                                            ((e2.d) obj2).getClass();
                                            if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                x1 x1Var6 = p3.n.f135158a;
                                                if (z35) {
                                                    mVar3.C(-541086855);
                                                    mVar3.f();
                                                } else {
                                                    if (z34) {
                                                        i28 = -1402926192;
                                                        i29 = R.string.trail_filter_no_matching_nearby_trails_caption;
                                                    } else {
                                                        i28 = -1402922847;
                                                        i29 = R.string.nearby_trails_no_trails_message;
                                                    }
                                                    strH = sn.a.h(mVar3, i28, i29, mVar3);
                                                }
                                                if (strH == null) {
                                                    mVar3.C(-540829431);
                                                    mVar3.f();
                                                } else {
                                                    mVar3.C(-540829430);
                                                    d92.b.f58623a.getClass();
                                                    d92.b.f58624b.getClass();
                                                    x0 x0VarF = d92.c.f(j92.f.f97932i, mVar3);
                                                    h4.r.a aVar3 = h4.r.S;
                                                    d92.b.f58625c.getClass();
                                                    mh.c(strH, c2.l.A(aVar3, j92.b.f97899b.f97920e, 0.0f, 2), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, mVar3, 0, 0, 131068);
                                                    mVar3.f();
                                                }
                                            } else {
                                                mVar3.e();
                                            }
                                            return Unit.INSTANCE;
                                    }
                                }
                            }), 3);
                            final int i25 = 1;
                            f0.b(f0Var, null, new z3.e(1822001796, true, new e23.q() { // from class: zs1.b
                                @Override // e23.q
                                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                    int i26;
                                    int i27;
                                    int i28;
                                    int i29;
                                    int i210 = i25;
                                    String strH = null;
                                    boolean z34 = z29;
                                    boolean z35 = z28;
                                    switch (i210) {
                                        case 0:
                                            p3.m mVar2 = (p3.m) obj3;
                                            int iIntValue = ((Integer) obj4).intValue();
                                            ((e2.d) obj2).getClass();
                                            if (mVar2.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                                                x1 x1Var5 = p3.n.f135158a;
                                                if (z35) {
                                                    i26 = 255406343;
                                                    i27 = R.string.trails_zoom_in_to_view_title;
                                                } else if (z34) {
                                                    i26 = 255409424;
                                                    i27 = R.string.trail_filter_no_matching_trails_title;
                                                } else {
                                                    i26 = 255412360;
                                                    i27 = R.string.nearby_trails_no_trails_title;
                                                }
                                                String strH2 = sn.a.h(mVar2, i26, i27, mVar2);
                                                h4.r.a aVar = h4.r.S;
                                                d92.b.f58623a.getClass();
                                                d92.b.f58625c.getClass();
                                                j92.e eVar = j92.b.f97899b;
                                                h4.r rVarZ = c2.l.z(aVar, eVar.f97920e, eVar.f97917b);
                                                h4.d.f81522a.getClass();
                                                h4.g.b bVar = h4.d.a.f81534l;
                                                c2.j.f22691a.getClass();
                                                s2 s2VarA = q2.a(c2.j.f22692b, bVar, mVar2, 48);
                                                int iHashCode = Long.hashCode(mVar2.getU());
                                                i2 i2VarX = mVar2.x();
                                                h4.r rVarC = h4.k.c(rVarZ, mVar2);
                                                h5.g.V.getClass();
                                                e0.a aVar2 = h5.g.a.f81805b;
                                                if (mVar2.F() == null) {
                                                    p0.l();
                                                    throw null;
                                                }
                                                mVar2.z();
                                                if (mVar2.getT()) {
                                                    mVar2.M(aVar2);
                                                } else {
                                                    mVar2.c();
                                                }
                                                b4.c(h5.g.a.f81810g, s2VarA, mVar2);
                                                b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                                                h5.g.a.b bVar2 = h5.g.a.f81813j;
                                                if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                                                    v.h.z(iHashCode, mVar2, iHashCode, bVar2);
                                                }
                                                b4.c(h5.g.a.f81807d, rVarC, mVar2);
                                                u2 u2Var = u2.f22900a;
                                                i7.a(n5.c.a(2131233511, mVar2, 0), null, null, u0.f(mVar2), mVar2, 48, 4);
                                                h4.r rVarC2 = c2.l.C(aVar, eVar.f97918c, 0.0f, 0.0f, 0.0f, 14);
                                                d92.b.f58624b.getClass();
                                                mh.c(strH2, rVarC2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97930g), mVar2), mVar2, 0, 0, 131068);
                                                mVar2.y();
                                            } else {
                                                mVar2.e();
                                            }
                                            return Unit.INSTANCE;
                                        default:
                                            p3.m mVar3 = (p3.m) obj3;
                                            int iIntValue2 = ((Integer) obj4).intValue();
                                            ((e2.d) obj2).getClass();
                                            if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                x1 x1Var6 = p3.n.f135158a;
                                                if (z35) {
                                                    mVar3.C(-541086855);
                                                    mVar3.f();
                                                } else {
                                                    if (z34) {
                                                        i28 = -1402926192;
                                                        i29 = R.string.trail_filter_no_matching_nearby_trails_caption;
                                                    } else {
                                                        i28 = -1402922847;
                                                        i29 = R.string.nearby_trails_no_trails_message;
                                                    }
                                                    strH = sn.a.h(mVar3, i28, i29, mVar3);
                                                }
                                                if (strH == null) {
                                                    mVar3.C(-540829431);
                                                    mVar3.f();
                                                } else {
                                                    mVar3.C(-540829430);
                                                    d92.b.f58623a.getClass();
                                                    d92.b.f58624b.getClass();
                                                    x0 x0VarF = d92.c.f(j92.f.f97932i, mVar3);
                                                    h4.r.a aVar3 = h4.r.S;
                                                    d92.b.f58625c.getClass();
                                                    mh.c(strH, c2.l.A(aVar3, j92.b.f97899b.f97920e, 0.0f, 2), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, mVar3, 0, 0, 131068);
                                                    mVar3.f();
                                                }
                                            } else {
                                                mVar3.e();
                                            }
                                            return Unit.INSTANCE;
                                    }
                                }
                            }), 3);
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(objQ);
                }
            } else {
                objQ = new e23.l() { // from class: zs1.a
                    @Override // e23.l
                    public final Object invoke(Object obj) {
                        f0 f0Var = (f0) obj;
                        f0Var.getClass();
                        final int i24 = 0;
                        final boolean z28 = z19;
                        final boolean z29 = z25;
                        f0.b(f0Var, null, new z3.e(-1836603699, true, new e23.q() { // from class: zs1.b
                            @Override // e23.q
                            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                int i26;
                                int i27;
                                int i28;
                                int i29;
                                int i210 = i24;
                                String strH = null;
                                boolean z34 = z29;
                                boolean z35 = z28;
                                switch (i210) {
                                    case 0:
                                        p3.m mVar2 = (p3.m) obj3;
                                        int iIntValue = ((Integer) obj4).intValue();
                                        ((e2.d) obj2).getClass();
                                        if (mVar2.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                                            x1 x1Var5 = p3.n.f135158a;
                                            if (z35) {
                                                i26 = 255406343;
                                                i27 = R.string.trails_zoom_in_to_view_title;
                                            } else if (z34) {
                                                i26 = 255409424;
                                                i27 = R.string.trail_filter_no_matching_trails_title;
                                            } else {
                                                i26 = 255412360;
                                                i27 = R.string.nearby_trails_no_trails_title;
                                            }
                                            String strH2 = sn.a.h(mVar2, i26, i27, mVar2);
                                            h4.r.a aVar = h4.r.S;
                                            d92.b.f58623a.getClass();
                                            d92.b.f58625c.getClass();
                                            j92.e eVar = j92.b.f97899b;
                                            h4.r rVarZ = c2.l.z(aVar, eVar.f97920e, eVar.f97917b);
                                            h4.d.f81522a.getClass();
                                            h4.g.b bVar = h4.d.a.f81534l;
                                            c2.j.f22691a.getClass();
                                            s2 s2VarA = q2.a(c2.j.f22692b, bVar, mVar2, 48);
                                            int iHashCode = Long.hashCode(mVar2.getU());
                                            i2 i2VarX = mVar2.x();
                                            h4.r rVarC = h4.k.c(rVarZ, mVar2);
                                            h5.g.V.getClass();
                                            e0.a aVar2 = h5.g.a.f81805b;
                                            if (mVar2.F() == null) {
                                                p0.l();
                                                throw null;
                                            }
                                            mVar2.z();
                                            if (mVar2.getT()) {
                                                mVar2.M(aVar2);
                                            } else {
                                                mVar2.c();
                                            }
                                            b4.c(h5.g.a.f81810g, s2VarA, mVar2);
                                            b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                                            h5.g.a.b bVar2 = h5.g.a.f81813j;
                                            if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                                                v.h.z(iHashCode, mVar2, iHashCode, bVar2);
                                            }
                                            b4.c(h5.g.a.f81807d, rVarC, mVar2);
                                            u2 u2Var = u2.f22900a;
                                            i7.a(n5.c.a(2131233511, mVar2, 0), null, null, u0.f(mVar2), mVar2, 48, 4);
                                            h4.r rVarC2 = c2.l.C(aVar, eVar.f97918c, 0.0f, 0.0f, 0.0f, 14);
                                            d92.b.f58624b.getClass();
                                            mh.c(strH2, rVarC2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97930g), mVar2), mVar2, 0, 0, 131068);
                                            mVar2.y();
                                        } else {
                                            mVar2.e();
                                        }
                                        return Unit.INSTANCE;
                                    default:
                                        p3.m mVar3 = (p3.m) obj3;
                                        int iIntValue2 = ((Integer) obj4).intValue();
                                        ((e2.d) obj2).getClass();
                                        if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                            x1 x1Var6 = p3.n.f135158a;
                                            if (z35) {
                                                mVar3.C(-541086855);
                                                mVar3.f();
                                            } else {
                                                if (z34) {
                                                    i28 = -1402926192;
                                                    i29 = R.string.trail_filter_no_matching_nearby_trails_caption;
                                                } else {
                                                    i28 = -1402922847;
                                                    i29 = R.string.nearby_trails_no_trails_message;
                                                }
                                                strH = sn.a.h(mVar3, i28, i29, mVar3);
                                            }
                                            if (strH == null) {
                                                mVar3.C(-540829431);
                                                mVar3.f();
                                            } else {
                                                mVar3.C(-540829430);
                                                d92.b.f58623a.getClass();
                                                d92.b.f58624b.getClass();
                                                x0 x0VarF = d92.c.f(j92.f.f97932i, mVar3);
                                                h4.r.a aVar3 = h4.r.S;
                                                d92.b.f58625c.getClass();
                                                mh.c(strH, c2.l.A(aVar3, j92.b.f97899b.f97920e, 0.0f, 2), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, mVar3, 0, 0, 131068);
                                                mVar3.f();
                                            }
                                        } else {
                                            mVar3.e();
                                        }
                                        return Unit.INSTANCE;
                                }
                            }
                        }), 3);
                        final int i25 = 1;
                        f0.b(f0Var, null, new z3.e(1822001796, true, new e23.q() { // from class: zs1.b
                            @Override // e23.q
                            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                int i26;
                                int i27;
                                int i28;
                                int i29;
                                int i210 = i25;
                                String strH = null;
                                boolean z34 = z29;
                                boolean z35 = z28;
                                switch (i210) {
                                    case 0:
                                        p3.m mVar2 = (p3.m) obj3;
                                        int iIntValue = ((Integer) obj4).intValue();
                                        ((e2.d) obj2).getClass();
                                        if (mVar2.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                                            x1 x1Var5 = p3.n.f135158a;
                                            if (z35) {
                                                i26 = 255406343;
                                                i27 = R.string.trails_zoom_in_to_view_title;
                                            } else if (z34) {
                                                i26 = 255409424;
                                                i27 = R.string.trail_filter_no_matching_trails_title;
                                            } else {
                                                i26 = 255412360;
                                                i27 = R.string.nearby_trails_no_trails_title;
                                            }
                                            String strH2 = sn.a.h(mVar2, i26, i27, mVar2);
                                            h4.r.a aVar = h4.r.S;
                                            d92.b.f58623a.getClass();
                                            d92.b.f58625c.getClass();
                                            j92.e eVar = j92.b.f97899b;
                                            h4.r rVarZ = c2.l.z(aVar, eVar.f97920e, eVar.f97917b);
                                            h4.d.f81522a.getClass();
                                            h4.g.b bVar = h4.d.a.f81534l;
                                            c2.j.f22691a.getClass();
                                            s2 s2VarA = q2.a(c2.j.f22692b, bVar, mVar2, 48);
                                            int iHashCode = Long.hashCode(mVar2.getU());
                                            i2 i2VarX = mVar2.x();
                                            h4.r rVarC = h4.k.c(rVarZ, mVar2);
                                            h5.g.V.getClass();
                                            e0.a aVar2 = h5.g.a.f81805b;
                                            if (mVar2.F() == null) {
                                                p0.l();
                                                throw null;
                                            }
                                            mVar2.z();
                                            if (mVar2.getT()) {
                                                mVar2.M(aVar2);
                                            } else {
                                                mVar2.c();
                                            }
                                            b4.c(h5.g.a.f81810g, s2VarA, mVar2);
                                            b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                                            h5.g.a.b bVar2 = h5.g.a.f81813j;
                                            if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                                                v.h.z(iHashCode, mVar2, iHashCode, bVar2);
                                            }
                                            b4.c(h5.g.a.f81807d, rVarC, mVar2);
                                            u2 u2Var = u2.f22900a;
                                            i7.a(n5.c.a(2131233511, mVar2, 0), null, null, u0.f(mVar2), mVar2, 48, 4);
                                            h4.r rVarC2 = c2.l.C(aVar, eVar.f97918c, 0.0f, 0.0f, 0.0f, 14);
                                            d92.b.f58624b.getClass();
                                            mh.c(strH2, rVarC2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97930g), mVar2), mVar2, 0, 0, 131068);
                                            mVar2.y();
                                        } else {
                                            mVar2.e();
                                        }
                                        return Unit.INSTANCE;
                                    default:
                                        p3.m mVar3 = (p3.m) obj3;
                                        int iIntValue2 = ((Integer) obj4).intValue();
                                        ((e2.d) obj2).getClass();
                                        if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                            x1 x1Var6 = p3.n.f135158a;
                                            if (z35) {
                                                mVar3.C(-541086855);
                                                mVar3.f();
                                            } else {
                                                if (z34) {
                                                    i28 = -1402926192;
                                                    i29 = R.string.trail_filter_no_matching_nearby_trails_caption;
                                                } else {
                                                    i28 = -1402922847;
                                                    i29 = R.string.nearby_trails_no_trails_message;
                                                }
                                                strH = sn.a.h(mVar3, i28, i29, mVar3);
                                            }
                                            if (strH == null) {
                                                mVar3.C(-540829431);
                                                mVar3.f();
                                            } else {
                                                mVar3.C(-540829430);
                                                d92.b.f58623a.getClass();
                                                d92.b.f58624b.getClass();
                                                x0 x0VarF = d92.c.f(j92.f.f97932i, mVar3);
                                                h4.r.a aVar3 = h4.r.S;
                                                d92.b.f58625c.getClass();
                                                mh.c(strH, c2.l.A(aVar3, j92.b.f97899b.f97920e, 0.0f, 2), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, mVar3, 0, 0, 131068);
                                                mVar3.f();
                                            }
                                        } else {
                                            mVar3.e();
                                        }
                                        return Unit.INSTANCE;
                                }
                            }
                        }), 3);
                        return Unit.INSTANCE;
                    }
                };
                o0VarE.K(objQ);
            }
            e2.c.b(rVarA4, null, null, null, null, null, false, null, (e23.l) objQ, o0VarE, 0, 510);
            z24 = z25;
        } else {
            o0VarE.e();
            z19 = z16;
            z24 = z17;
        }
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new fz1.m(rVar, z19, z24, i14, i15);
        }
    }
}
