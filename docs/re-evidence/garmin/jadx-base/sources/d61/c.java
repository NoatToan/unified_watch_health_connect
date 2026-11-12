package d61;

import com.garmin.android.apps.connectmobile.R;
import com.google.maps.android.compose.u;
import d50.i;
import m92.o;
import org.joda.time.LocalDate;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class c {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f57979a;

        static {
            int[] iArr = new int[c61.a.values().length];
            try {
                iArr[c61.a.ALTITUDE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c61.a.HEAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f57979a = iArr;
        }
    }

    public static final void a(i53.c<x61.e> cVar, LocalDate localDate, LocalDate localDate2, c61.a aVar, m mVar, int i14) {
        int i15;
        c61.a aVar2;
        String strJ;
        aVar.getClass();
        o0 o0VarE = mVar.E(666321324);
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(cVar) : o0VarE.r(cVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(localDate) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(localDate2) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.k(aVar.ordinal()) ? 2048 : 1024;
        }
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            int i16 = a.f57979a[aVar.ordinal()];
            if (i16 == 1) {
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 384673917, R.string.lbl_altitude_acclimation, o0VarE, false);
            } else {
                if (i16 != 2) {
                    throw kg.f.h(o0VarE, 384672110, false);
                }
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 384676537, R.string.lbl_heat_acclimation, o0VarE, false);
            }
            aVar2 = aVar;
            o.a(null, strJ, null, null, z3.f.c(-172823252, new i(localDate, localDate2, aVar2, cVar), o0VarE), null, null, o0VarE, 24576, 109);
        } else {
            aVar2 = aVar;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new u(cVar, localDate, localDate2, aVar2, i14, 7);
        }
    }
}
