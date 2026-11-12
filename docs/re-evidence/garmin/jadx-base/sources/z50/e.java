package z50;

import b82.t0;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import d53.s;
import d53.w;
import e23.l;
import gl1.y;
import h4.r;
import i3.e5;
import i3.mh;
import l72.p2;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.x1;
import ug2.p;

/* JADX INFO: loaded from: classes8.dex */
public final class e {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f202457a;

        static {
            int[] iArr = new int[t0.a.values().length];
            try {
                iArr[t0.a.ON_FOCUS_LOST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[t0.a.ON_FOCUS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f202457a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:61:0x010e  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final Double d14, final double d15, final double d16, final boolean z14, final l<? super Double, Unit> lVar, m mVar, final int i14) {
        int i15;
        int i16;
        int i17;
        int i18;
        String strValueOf;
        String strG;
        String strValueOf2;
        lVar.getClass();
        o0 o0VarE = mVar.E(-638060269);
        int i19 = i14 | (o0VarE.B(d14) ? 4 : 2) | (o0VarE.m(d15) ? 32 : 16) | (o0VarE.m(d16) ? 256 : 128) | (o0VarE.h(z14) ? 2048 : 1024) | (o0VarE.r(lVar) ? 16384 : 8192);
        if (o0VarE.n(i19 & 1, (i19 & 9363) != 9362)) {
            x1 x1Var = n.f135158a;
            if (z14) {
                i15 = 1004411730;
                i16 = R.string.lbl_km;
            } else {
                i15 = 1004412916;
                i16 = R.string.lbl_mile;
            }
            String strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, i15, i16, o0VarE, false);
            if (z14) {
                i17 = 1004415265;
                i18 = R.string.common_lbl_kilometers;
            } else {
                i17 = 1004416924;
                i18 = R.string.common_lbl_miles;
            }
            final String strJ2 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, i17, i18, o0VarE, false);
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = p0.n(Boolean.TRUE);
                o0VarE.K(objQ2);
            }
            p1 p1Var2 = (p1) objQ2;
            if (d14 != null) {
                double dDoubleValue = d14.doubleValue();
                strValueOf = dDoubleValue % 1.0d == 0.0d ? String.valueOf((long) dDoubleValue) : String.valueOf(dDoubleValue);
                if (strValueOf == null) {
                    strValueOf = "";
                }
            } else {
                strValueOf = "";
            }
            if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                strG = strValueOf;
            } else {
                Double dF = s.f(strValueOf);
                if (dF != null) {
                    double dDoubleValue2 = dF.doubleValue();
                    l3.f23124b.getClass();
                    strValueOf2 = String.valueOf(l3.a.T1(dDoubleValue2, 2));
                } else {
                    strValueOf2 = null;
                }
                if (g22.n.d(strValueOf2)) {
                    strG = e5.g(strValueOf2, StringUtils.SPACE, strJ);
                } else {
                    strG = strValueOf;
                }
            }
            boolean z15 = ((((Boolean) p1Var2.getF182175a()).booleanValue() && w.J(strValueOf)) || b60.a.b(d15, d16, d14)) ? false : true;
            p2 p2Var = p2.f111205a;
            p2Var.b(null, z3.f.c(-382359535, new p(strG, z15, lVar, p1Var2, p1Var), o0VarE), gg.b.o(((Boolean) p1Var.getF182175a()).booleanValue(), z3.f.c(-177087297, new vd0.b(strJ, 25), o0VarE), o0VarE), gg.b.o(!((Boolean) p1Var.getF182175a()).booleanValue() && z15, z3.f.c(1411407450, new e23.p() { // from class: z50.c
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    m mVar2 = (m) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                        x1 x1Var2 = n.f135158a;
                        l3.f23124b.getClass();
                        String strP = y.P(R.string.invalid_distance_description, new Object[]{String.valueOf(l3.a.T1(d15, 2)), String.valueOf(l3.a.T1(d16, 2)), strJ2}, mVar2);
                        r.a aVar = r.S;
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        j92.e eVar = j92.b.f97899b;
                        r rVarZ = c2.l.z(aVar, eVar.f97920e, eVar.f97917b);
                        d92.b.f58624b.getClass();
                        mh.c(strP, rVarZ, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97933j, mVar2), mVar2, 0, 0, 131068);
                    } else {
                        mVar2.e();
                    }
                    return Unit.INSTANCE;
                }
            }, o0VarE), o0VarE), o0VarE, 48, 1);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p(d14, d15, d16, z14, lVar, i14) { // from class: z50.d

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ Double f202452a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ double f202453b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ double f202454c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ boolean f202455d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ l f202456e;

                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iT = p0.t(1);
                    e.a(this.f202452a, this.f202453b, this.f202454c, this.f202455d, this.f202456e, (m) obj, iT);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
