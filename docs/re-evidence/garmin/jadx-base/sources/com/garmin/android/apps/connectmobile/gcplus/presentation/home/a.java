package com.garmin.android.apps.connectmobile.gcplus.presentation.home;

import a03.t0;
import c2.b0;
import c2.l;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import h4.k;
import h4.r;
import h5.e0;
import i3.mh;
import l72.u0;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import p5.v;
import s5.x0;
import w5.f0;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.gcplus.presentation.home.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C0610a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f35340a;

        static {
            int[] iArr = new int[c.d.values().length];
            try {
                iArr[c.d.API.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c.d.NO_PAIRED_DEVICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c.d.UNAVAILABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f35340a = iArr;
        }
    }

    public static final void a(c.d dVar, b.h hVar, m mVar, int i14) {
        c.d dVar2;
        b.h hVar2;
        int i15;
        int i16;
        int i17;
        boolean z14;
        int i18;
        int i19;
        boolean z15;
        int i24;
        int i25;
        dVar.getClass();
        o0 o0VarE = mVar.E(1941829746);
        int i26 = i14 | (o0VarE.k(dVar.ordinal()) ? 4 : 2) | (o0VarE.B(hVar) ? 32 : 16);
        if (o0VarE.n(i26 & 1, (i26 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            h4.d.f81522a.getClass();
            h4.g.a aVar = h4.d.a.f81537o;
            r.a aVar2 = r.S;
            r rVarD = x2.d(aVar2, 1.0f);
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            r rVarA = l.A(rVarD, eVar.f97920e, 0.0f, 2);
            c2.j.f22691a.getClass();
            z zVarA = y.a(c2.j.f22694d, aVar, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(rVarA, o0VarE);
            h5.g.V.getClass();
            e0.a aVar3 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            r rVarB = b0.f22601a.b(l.D(aVar2), h4.d.a.f81538p);
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new a81.m(16);
                o0VarE.K(objQ);
            }
            r rVarC2 = v.c((e23.l) objQ, rVarB, false);
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_close);
            int i27 = i26 & 112;
            boolean z16 = i27 == 32;
            Object objQ2 = o0VarE.q();
            if (z16 || objQ2 == c2565a) {
                objQ2 = new a03.e(hVar, 7);
                o0VarE.K(objQ2);
            }
            u0.a(rVarC2, null, strQ, null, (e23.a) objQ2, o0VarE, 0, 10);
            int i28 = i26 & 14;
            int[] iArr = C0610a.f35340a;
            int i29 = iArr[dVar.ordinal()];
            if (i29 != 1) {
                i15 = 2;
                if (i29 == 2) {
                    i16 = 3026093;
                    i17 = R.string.no_paired_devices_title_case;
                } else {
                    if (i29 != 3) {
                        throw kg.f.h(o0VarE, 3021117, false);
                    }
                    i16 = 93917757;
                    i17 = R.string.not_available_in_your_region;
                }
            } else {
                i15 = 2;
                i16 = 3022755;
                i17 = R.string.lbl_error_occurred;
            }
            String strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, i16, i17, o0VarE, false);
            d6.h.f57752b.getClass();
            int i30 = d6.h.f57755e;
            d6.h hVarA = d6.h.a(i30);
            j92.f fVar = d92.b.f58624b;
            fVar.getClass();
            x0 x0VarB = d92.c.b(j92.f.f97931h, o0VarE);
            f0.f182097b.getClass();
            int i34 = i15;
            mh.c(strJ, null, 0L, null, 0L, null, 0L, hVarA, 0L, 0, false, 0, 0, null, x0.a(x0VarB, 0L, 0L, f0.f182104i, null, 0L, null, null, 0, 0L, null, null, 16777211), o0VarE, 0, 0, 130046);
            bVar.getClass();
            l.f(x2.h(aVar2, eVar.f97918c), o0VarE);
            int i35 = iArr[dVar.ordinal()];
            if (i35 == 1) {
                z14 = false;
                i18 = 819926321;
                i19 = R.string.technical_challenge_message;
            } else if (i35 == i34) {
                z14 = false;
                i18 = 819929930;
                i19 = R.string.add_device_to_set_up;
            } else {
                if (i35 != 3) {
                    throw kg.f.h(o0VarE, 819924691, false);
                }
                i18 = -351874264;
                i19 = R.string.garmin_connect_plus_not_available_learn_more;
                z14 = false;
            }
            String strJ2 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, i18, i19, o0VarE, z14);
            d6.h hVarA2 = d6.h.a(i30);
            fVar.getClass();
            mh.c(strJ2, null, 0L, null, 0L, null, 0L, hVarA2, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97932i, o0VarE), o0VarE, 0, 0, 130046);
            bVar.getClass();
            l.f(x2.h(aVar2, eVar.f97921f), o0VarE);
            l72.f0 f0Var = l72.f0.f110999a;
            int i36 = iArr[dVar.ordinal()];
            if (i36 == 1) {
                z15 = false;
                i24 = -995168807;
                i25 = R.string.lbl_try_again;
            } else if (i36 == i34) {
                z15 = false;
                i24 = -995165636;
                i25 = R.string.common_button_ok;
            } else {
                if (i36 != 3) {
                    throw kg.f.h(o0VarE, -995170492, false);
                }
                i24 = -995162531;
                i25 = R.string.common_learn_more;
                z15 = false;
            }
            String strJ3 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, i24, i25, o0VarE, z15);
            boolean z17 = i28 == 4 ? true : z15;
            if (i27 == 32) {
                z15 = true;
            }
            boolean z18 = z17 | z15;
            Object objQ3 = o0VarE.q();
            if (z18 || objQ3 == c2565a) {
                dVar2 = dVar;
                hVar2 = hVar;
                objQ3 = new a11.n(19, dVar2, hVar2);
                o0VarE.K(objQ3);
            } else {
                dVar2 = dVar;
                hVar2 = hVar;
            }
            f0Var.d(0, 13, (e23.a) objQ3, null, strJ3, o0VarE, null, false);
            o0VarE = o0VarE;
            o0VarE.g0(true);
        } else {
            dVar2 = dVar;
            hVar2 = hVar;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new t0(dVar2, hVar2, i14, 6);
        }
    }
}
