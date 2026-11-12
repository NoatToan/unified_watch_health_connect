package d62;

import am.x0;
import bs2.nv;
import c22.c3;
import com.garmin.android.apps.connectmobile.R;
import p3.x1;
import u62.y;

/* JADX INFO: loaded from: classes9.dex */
public final class k {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f58034a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f58035b;

        static {
            int[] iArr = new int[j.values().length];
            try {
                iArr[j.f58019f.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[j.f58020g.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[j.f58021h.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f58034a = iArr;
            int[] iArr2 = new int[nv.values().length];
            try {
                iArr2[nv.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[nv.CYCLING.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            f58035b = iArr2;
        }
    }

    public static final u4.d a(j jVar) {
        u4.d dVar;
        jVar.getClass();
        int i14 = a.f58034a[jVar.ordinal()];
        if (i14 == 1) {
            s62.a.f157643a.getClass();
            return u62.m.a(t62.a.f162797a);
        }
        if (i14 == 2) {
            s62.a.f157643a.getClass();
            return y.a(t62.a.f162797a);
        }
        if (i14 == 3) {
            s62.a.f157643a.getClass();
            return u62.t.a(t62.a.f162797a);
        }
        x0 x0Var = jVar.f58026c;
        if (x0Var != null && (dVar = x0Var.f4362e) != null) {
            return dVar;
        }
        s62.a.f157643a.getClass();
        return u62.a.a(t62.a.f162797a);
    }

    public static final String b(j jVar, p3.m mVar) {
        int i14;
        int i15;
        jVar.getClass();
        x1 x1Var = p3.n.f135158a;
        int i16 = a.f58034a[jVar.ordinal()];
        if (i16 == 1) {
            i14 = -1157137451;
            i15 = R.string.activity_type_bike_commute;
        } else if (i16 == 2) {
            i14 = -1157134382;
            i15 = R.string.activity_type_bike_tour;
        } else {
            if (i16 != 3) {
                mVar.C(-1511276719);
                x0 x0Var = jVar.f58026c;
                String strT = null;
                c3 c3Var = x0Var != null ? x0Var.f4360c : null;
                if (c3Var == null) {
                    mVar.C(-1511248603);
                } else {
                    mVar.C(-1511248602);
                    strT = gl1.d.T(c3Var, mVar, 0);
                }
                mVar.f();
                if (strT == null) {
                    mVar.C(-1157127628);
                    strT = gl1.d.T(x0.f4346x.f4360c, mVar, 0);
                } else {
                    mVar.C(-1157129519);
                }
                mVar.f();
                mVar.f();
                return strT;
            }
            i14 = -1157131414;
            i15 = R.string.lbl_road_biking;
        }
        return sn.a.h(mVar, i14, i15, mVar);
    }
}
