package im;

import android.content.UriMatcher;
import com.garmin.android.apps.connectmobile.activities.map.ActivityMapActivity;
import com.garmin.android.apps.connectmobile.contentprovider.DevicesProvider;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.gfdi.configuration.SupportedCapability;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Predicate;
import ps.o1;
import ps.x0;
import ps.x1;
import zb0.n0;
import zb0.u0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class c implements Predicate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f94137a;

    public /* synthetic */ c(int i14) {
        this.f94137a = i14;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f94137a) {
            case 0:
                return "directSpeed".equals(((com.garmin.android.apps.connectmobile.activities.newmodel.y) obj).F());
            case 1:
                return "sumElapsedDuration".equals(((com.garmin.android.apps.connectmobile.activities.newmodel.y) obj).F());
            case 2:
                x0 x0Var = (x0) obj;
                if (x0Var.S0() != null) {
                    qs.p pVarS0 = x0Var.S0();
                    pVarS0.getClass();
                    if (pVarS0 == qs.p.ASCENT || pVarS0 == qs.p.DESCENT || pVarS0 == qs.p.TRANSITION) {
                        return true;
                    }
                }
                return false;
            case 3:
                return Objects.equals(((o1) obj).getSplitType(), qs.x.DOWNHILL_RUN.f147220a);
            case 4:
                return Objects.equals(((o1) obj).getSplitType(), qs.x.SKI_RUN.f147220a);
            case 5:
                return Objects.equals(((o1) obj).getSplitType(), qs.x.DOWNHILL_RUN.f147220a);
            case 6:
                String str = (String) obj;
                UriMatcher uriMatcher = DevicesProvider.f32752a;
                if (str != null && !str.trim().isEmpty()) {
                    try {
                        Integer.parseInt(str);
                        return true;
                    } catch (NumberFormatException e4) {
                        i2.i("DeviceProvider", "Invalid product number: " + str + ", exception: " + e4);
                    }
                }
                return false;
            case 7:
                int i14 = ActivityMapActivity.f29218k0;
                return com.garmin.android.library.mapsdkadapter.m.e(((ie2.j) obj).getPosition());
            case 8:
                int i15 = ActivityMapActivity.f29218k0;
                List<com.garmin.android.library.mapsdkadapter.f> listD = ((com.garmin.android.library.mapsdkadapter.l) obj).d();
                return !listD.isEmpty() && (com.garmin.android.library.mapsdkadapter.m.e(listD.get(0)) || com.garmin.android.library.mapsdkadapter.m.e((com.garmin.android.library.mapsdkadapter.f) com.airbnb.lottie.animation.keyframe.a.c(1, listD)));
            case 9:
                int i16 = po.h.E1;
                return ((x1) obj).a2() == qs.x.OBSTACLE;
            case 10:
                int i17 = po.h.E1;
                return ((x1) obj).a2() == qs.x.VIRTUAL_ACTIVITY_SECTION;
            case 11:
                return ((x1) obj).a2() == qs.x.OBSTACLE;
            case 12:
                sd2.f fVar = (sd2.f) obj;
                Map<u0, vg1.t> map = n0.f203577a;
                return km2.a.i(fVar.getUnitID(), null, SupportedCapability.WEATHER_CONDITIONS.ordinal()) || km2.a.i(fVar.getUnitID(), null, SupportedCapability.WEATHER_ALERTS.ordinal());
            default:
                Map<u0, vg1.t> map2 = n0.f203577a;
                return u0.v(((sd2.f) obj).getProductNumber());
        }
    }
}
