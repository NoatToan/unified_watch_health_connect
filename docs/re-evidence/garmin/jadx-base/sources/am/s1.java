package am;

import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import com.google.android.gms.maps.model.LatLng;
import java.util.List;
import org.joda.time.DateTime;
import p005kotlin.math.MathKt;

/* JADX INFO: loaded from: classes7.dex */
public final class s1 {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4192a;

        static {
            int[] iArr = new int[x0.values().length];
            try {
                iArr[x0.E.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[x0.f4355z1.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[x0.A1.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[x0.f4351y1.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[x0.f4344w2.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[x0.C2.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[x0.f4326r2.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[x0.f4329s2.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[x0.f4309n1.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f4192a = iArr;
        }
    }

    public static final Integer a(x0 x0Var, List<ps.x1> list) {
        Integer numValueOf = Integer.valueOf(R.string.lbl_resort_ski_runs);
        if (list != null && !list.isEmpty()) {
            if (z0.d0(x0Var != null ? x0Var.f4358a : null)) {
                return Integer.valueOf(R.string.header_windsurfing_runs);
            }
            if (z0.P(x0Var != null ? x0Var.f4358a : null)) {
                return numValueOf;
            }
            if (z0.o(x0Var != null ? x0Var.f4358a : null)) {
                return Integer.valueOf(R.string.pacepro_lbl_plan_splits_type);
            }
            if (z0.x(x0Var != null ? x0Var.f4358a : null)) {
                return numValueOf;
            }
            if (z0.b(x0.R0, x0Var != null ? x0Var.f4358a : null)) {
                return numValueOf;
            }
        }
        return null;
    }

    public static final boolean b(DateTime dateTime) {
        return DateTime.now().withTimeAtStartOfDay().getMillis() - dateTime.withTimeAtStartOfDay().getMillis() > 7776000000L;
    }

    public static final ActivityListItemDTO c(com.garmin.android.apps.connectmobile.activities.newmodel.h hVar) {
        LatLng latLng = null;
        if (hVar == null) {
            return null;
        }
        ActivityListItemDTO activityListItemDTO = new ActivityListItemDTO();
        activityListItemDTO.f29250b = hVar.f29448a;
        activityListItemDTO.f29265g = hVar.C();
        activityListItemDTO.A = (int) hVar.f29451d;
        ps.a1 a1Var = hVar.f29459l;
        activityListItemDTO.D = (a1Var == null || a1Var.getUserInfoDto() == null) ? null : hVar.f29459l.getUserInfoDto().getProfileImageUrlSmall();
        ps.a1 a1Var2 = hVar.f29459l;
        activityListItemDTO.E = (a1Var2 == null || a1Var2.getUserInfoDto() == null) ? null : hVar.f29459l.getUserInfoDto().getProfileImageUrlMedium();
        ps.a1 a1Var3 = hVar.f29459l;
        activityListItemDTO.B = (a1Var3 == null || a1Var3.getUserInfoDto() == null) ? null : hVar.f29459l.getUserInfoDto().getDisplayName();
        ps.a1 a1Var4 = hVar.f29459l;
        activityListItemDTO.C = (a1Var4 == null || a1Var4.getUserInfoDto() == null) ? null : hVar.f29459l.getUserInfoDto().getFullName();
        activityListItemDTO.f29253c = hVar.f29449b;
        ps.a1 a1Var5 = hVar.f29459l;
        activityListItemDTO.f29260e1 = (a1Var5 == null || a1Var5.getPersonalRecord() == null || !hVar.f29459l.getPersonalRecord().booleanValue()) ? false : true;
        ps.a1 a1Var6 = hVar.f29459l;
        activityListItemDTO.f29257d1 = a1Var6 != null ? a1Var6.getIsFavorite() : false;
        activityListItemDTO.E1 = hVar.f29464q;
        activityListItemDTO.f29268h = hVar.f29456i;
        List<ps.j> listD = hVar.f29459l.d();
        if (listD != null) {
            activityListItemDTO.Q0 = listD;
        }
        String videoUrl = hVar.f29459l.getVideoUrl();
        if (videoUrl != null) {
            activityListItemDTO.P0 = videoUrl;
        }
        Integer lapCount = hVar.f29459l.getLapCount();
        if (lapCount != null) {
            activityListItemDTO.f29285o1 = lapCount.intValue();
        }
        com.garmin.android.apps.connectmobile.activities.newmodel.i0 i0Var = hVar.f29460m;
        if (i0Var != null) {
            activityListItemDTO.f29259e = i0Var.f29484a;
            activityListItemDTO.f29262f = i0Var.f29488b;
            LatLng latLng2 = (Double.isNaN(i0Var.f29496d) || Double.isNaN(i0Var.f29500e)) ? null : new LatLng(i0Var.f29496d, i0Var.f29500e);
            com.garmin.android.apps.connectmobile.activities.newmodel.i0 i0Var2 = hVar.f29460m;
            if (!Double.isNaN(i0Var2.f29504f) && !Double.isNaN(i0Var2.f29508g)) {
                latLng = new LatLng(i0Var2.f29504f, i0Var2.f29508g);
            }
            ps.a1 a1Var7 = hVar.f29459l;
            if ((a1Var7 != null && a1Var7.getHasPolyline() != null && a1Var7.getHasPolyline().booleanValue()) || latLng2 != null || latLng != null) {
                activityListItemDTO.f29288q = i0Var.f29496d;
                activityListItemDTO.f29290r = i0Var.f29500e;
                activityListItemDTO.f29293t = i0Var.f29504f;
                activityListItemDTO.f29296v = i0Var.f29508g;
            }
            activityListItemDTO.f29275k = i0Var.f29516i;
            activityListItemDTO.f29273j = i0Var.f29512h;
            activityListItemDTO.f29303y1 = i0Var.f29519j;
            activityListItemDTO.f29278l = i0Var.f29522k;
            activityListItemDTO.f29280m = i0Var.f29526l;
            activityListItemDTO.f29282n = i0Var.f29529m;
            activityListItemDTO.f29284o = i0Var.f29538p;
            activityListItemDTO.f29286p = i0Var.f29544r;
            activityListItemDTO.T = i0Var.f29549t;
            activityListItemDTO.X = i0Var.f29560x;
            activityListItemDTO.Y = i0Var.f29563y;
            activityListItemDTO.f29276k0 = i0Var.T;
            activityListItemDTO.f29251b1 = i0Var.f29501e1;
            activityListItemDTO.f29254c1 = i0Var.f29509g1;
            activityListItemDTO.f29269h1 = i0Var.f29517i1;
            activityListItemDTO.f29272i1 = i0Var.V1;
            activityListItemDTO.f29279l1 = i0Var.f29502e2;
            activityListItemDTO.f29283n1 = i0Var.X1;
            activityListItemDTO.f29287p1 = Double.isNaN(i0Var.R1) ? 0 : MathKt.b(i0Var.R1);
            activityListItemDTO.f29289q1 = i0Var.T1;
            activityListItemDTO.f29297v1 = i0Var.f29553u2;
            activityListItemDTO.f29299w1 = i0Var.E2;
            activityListItemDTO.f29301x1 = i0Var.F2;
            activityListItemDTO.f29305z1 = i0Var.Q2;
            activityListItemDTO.A1 = i0Var.B2;
            activityListItemDTO.P1 = Integer.valueOf(i0Var.Y2);
            activityListItemDTO.Q1 = i0Var.Z2;
            activityListItemDTO.R1 = i0Var.f29487a3;
            activityListItemDTO.W1 = i0Var.J2;
            activityListItemDTO.X1 = i0Var.K2;
            activityListItemDTO.f29255c2 = i0Var.f29503e3;
            activityListItemDTO.f29272i1 = i0Var.V1;
            activityListItemDTO.f29281m1 = i0Var.f29498d2;
            double d14 = i0Var.f29565y2;
            if (d14 != -1.0d) {
                activityListItemDTO.f29295u1 = Math.round(d14 * 1000.0d);
            }
        }
        return activityListItemDTO;
    }
}
