package s20;

import android.content.Context;
import android.text.TextUtils;
import c22.l3;
import c22.m3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO;
import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.SphericalUtil;
import gg1.o0;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p13.y;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ls20/d;", "", "<init>", "()V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f156005a = new d();

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f156006a;

        static {
            int[] iArr = new int[bg0.a.b.values().length];
            try {
                iArr[bg0.a.b.METER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[bg0.a.b.KILOMETER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[bg0.a.b.MILE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[bg0.a.b.YARD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f156006a = iArr;
        }
    }

    private d() {
    }

    public static final String a(Context context, String str) {
        if (context == null) {
            return "";
        }
        if (!TextUtils.isEmpty(str)) {
            return str == null ? "" : str;
        }
        String string = context.getString(R.string.txt_untitle);
        string.getClass();
        return string;
    }

    public static gg0.i b(gg0.i iVar) {
        if (iVar != null) {
            return iVar;
        }
        bg0.a.f17827a.getClass();
        int i14 = a.f156006a[bg0.a.C0255a.a().ordinal()];
        if (i14 == 1) {
            return gg0.i.METER;
        }
        if (i14 == 2) {
            return gg0.i.KILOMETER;
        }
        if (i14 == 3) {
            return gg0.i.MILE;
        }
        if (i14 == 4) {
            return gg0.i.YARD;
        }
        u0.r();
        return null;
    }

    public static final String c(double d14, Context context, boolean z14) {
        if (context == null) {
            return null;
        }
        if (Double.isNaN(d14)) {
            return context.getString(R.string.no_value);
        }
        m3 m3Var = z14 ? m3.KILOMETER : m3.MILE;
        l3.a aVar = l3.f23124b;
        DecimalFormat decimalFormat = l3.f23129g;
        aVar.getClass();
        return l3.a.O(context, d14, m3Var, decimalFormat, true);
    }

    public static String d(Context context, double d14, boolean z14, boolean z15) {
        if (context == null) {
            return null;
        }
        if (Double.isNaN(d14)) {
            return context.getString(R.string.no_value);
        }
        m3 m3Var = z14 ? m3.KILOMETER : m3.MILE;
        l3.a aVar = l3.f23124b;
        DecimalFormat decimalFormat = l3.f23129g;
        aVar.getClass();
        return l3.a.O(context, d14, m3Var, decimalFormat, z15);
    }

    public static final String e(Context context, double d14, o0 o0Var, boolean z14, boolean z15) {
        if (context == null) {
            return null;
        }
        if (Double.isNaN(d14)) {
            return context.getString(R.string.no_value);
        }
        l3.f23124b.getClass();
        return l3.a.a0(context, d14, o0Var, z14, z15);
    }

    public static ArrayList f(List list, boolean z14) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        double d14 = z14 ? 1000.0d : 1609.344d;
        ArrayList<GeoPointDTO> arrayList = new ArrayList();
        for (Object obj : list) {
            if (((GeoPointDTO) obj).b()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(y.r(arrayList, 10));
        for (GeoPointDTO geoPointDTO : arrayList) {
            Double d15 = geoPointDTO.latitude;
            double dDoubleValue = 0.0d;
            double dDoubleValue2 = d15 != null ? d15.doubleValue() : 0.0d;
            Double d16 = geoPointDTO.longitude;
            if (d16 != null) {
                dDoubleValue = d16.doubleValue();
            }
            arrayList2.add(new LatLng(dDoubleValue2, dDoubleValue));
        }
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList2.size() - 1;
        double d17 = d14;
        int i14 = 0;
        int i15 = 0;
        while (i14 < size) {
            LatLng latLng = (LatLng) arrayList2.get(i14);
            i14++;
            LatLng latLng2 = (LatLng) arrayList2.get(i14);
            if (latLng != null && latLng2 != null) {
                double dComputeDistanceBetween = SphericalUtil.computeDistanceBetween(latLng, latLng2);
                if (d17 <= dComputeDistanceBetween) {
                    LatLng latLngComputeOffset = SphericalUtil.computeOffset(latLng, d17, SphericalUtil.computeHeading(latLng, latLng2));
                    latLngComputeOffset.getClass();
                    i15++;
                    arrayList3.add(new com.garmin.android.apps.connectmobile.courses.model.g(String.valueOf(i15), latLngComputeOffset));
                    double dComputeDistanceBetween2 = SphericalUtil.computeDistanceBetween(latLngComputeOffset, latLng2);
                    if (dComputeDistanceBetween2 >= d14) {
                        int i16 = (int) (dComputeDistanceBetween2 / d14);
                        for (int i17 = 0; i17 < i16; i17++) {
                            latLngComputeOffset = SphericalUtil.computeOffset(latLngComputeOffset, d14, SphericalUtil.computeHeading(latLngComputeOffset, latLng2));
                            latLngComputeOffset.getClass();
                            i15++;
                            arrayList3.add(new com.garmin.android.apps.connectmobile.courses.model.g(String.valueOf(i15), latLngComputeOffset));
                        }
                        dComputeDistanceBetween2 = SphericalUtil.computeDistanceBetween(latLngComputeOffset, latLng2);
                    }
                    d17 = d14 - dComputeDistanceBetween2;
                } else {
                    d17 -= dComputeDistanceBetween;
                }
            }
        }
        return arrayList3;
    }
}
