package defpackage;

import android.content.Context;
import com.amap.api.maps.AMap;
import com.amap.api.maps.CameraUpdateFactory;
import com.amap.api.maps.CoordinateConverter;
import com.amap.api.maps.model.BitmapDescriptorFactory;
import com.amap.api.maps.model.LatLng;
import com.amap.api.maps.model.LatLngBounds;
import com.amap.api.maps.model.Marker;
import com.amap.api.maps.model.MarkerOptions;
import com.amap.api.maps.model.animation.Animation;
import com.amap.api.maps.model.animation.ScaleAnimation;
import com.xiaomi.fit.data.common.data.sport.Location;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.commonbase.data.sportmodel.util.MarkerParamsUtilKt;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class l5 extends emh {

    public class a implements Animation.AnimationListener {
        public a(ic1 ic1Var) {
        }

        @Override // com.amap.api.maps.model.animation.Animation.AnimationListener
        public void onAnimationEnd() {
        }

        @Override // com.amap.api.maps.model.animation.Animation.AnimationListener
        public void onAnimationStart() {
        }
    }

    public static void A(AMap aMap, List<LatLng> list, int i, int i2, int i3, int i4) {
        if (list == null || list.size() == 0) {
            return;
        }
        aMap.moveCamera(CameraUpdateFactory.newLatLngBoundsRect(w(list), i, i2, i3, i4));
    }

    public static void B(Marker marker, ic1 ic1Var) {
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f);
        scaleAnimation.setDuration(800L);
        marker.setAnimation(scaleAnimation);
        marker.setAnimationListener(new a(ic1Var));
        marker.startAnimation();
    }

    public static Marker C(Context context, AMap aMap, List<LatLng> list, ic1 ic1Var, i5f i5fVar) {
        if (list.size() > 0) {
            return j(context, aMap, list.get(list.size() - 1), i5fVar, ic1Var);
        }
        return null;
    }

    public static Marker D(Context context, AMap aMap, List<LatLng> list, ic1 ic1Var, i5f i5fVar) {
        if (list.size() > 0) {
            return j(context, aMap, list.get(0), i5fVar, ic1Var);
        }
        return null;
    }

    public static void E(List<Integer> list) {
        if (list.isEmpty()) {
            return;
        }
        Integer numValueOf = 0;
        Integer num = list.get(0);
        int i = 1;
        while (i < list.size()) {
            Integer num2 = list.get(i);
            if (!num2.equals(num)) {
                l(list, numValueOf, Integer.valueOf(i));
                numValueOf = Integer.valueOf(i);
            }
            i++;
            num = num2;
        }
    }

    public static Marker j(Context context, AMap aMap, LatLng latLng, i5f i5fVar, ic1 ic1Var) {
        Marker markerO = o(context, aMap, latLng, i5fVar);
        B(markerO, ic1Var);
        return markerO;
    }

    public static void k(Marker marker) {
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f);
        scaleAnimation.setDuration(1000L);
        marker.setAnimation(scaleAnimation);
        marker.startAnimation();
    }

    public static void l(List<Integer> list, Integer num, Integer num2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(x44.a(ali.f1176b)));
        arrayList.add(Integer.valueOf(x44.a(ali.e)));
        arrayList.add(Integer.valueOf(x44.a(ali.f)));
        arrayList.add(Integer.valueOf(x44.a(ali.g)));
        arrayList.add(Integer.valueOf(x44.a(ali.h)));
        arrayList.add(Integer.valueOf(x44.a(ali.i)));
        arrayList.add(Integer.valueOf(x44.a(ali.j)));
        arrayList.add(Integer.valueOf(x44.a(ali.f1177k)));
        arrayList.add(Integer.valueOf(x44.a(ali.l)));
        arrayList.add(Integer.valueOf(x44.a(ali.c)));
        int iIntValue = num2.intValue() - num.intValue();
        if (iIntValue <= 1) {
            return;
        }
        int iIndexOf = arrayList.indexOf(list.get(num.intValue()));
        int iIndexOf2 = arrayList.indexOf(list.get(num2.intValue())) - iIndexOf;
        for (int i = 0; i <= iIntValue; i++) {
            int iIntValue2 = num.intValue() + i;
            int iRound = Math.round((i * iIndexOf2) / iIntValue) + iIndexOf;
            if (iRound >= 0 && iRound < arrayList.size()) {
                Integer num3 = (Integer) arrayList.get(iRound);
                if (iIntValue2 >= list.size()) {
                    return;
                } else {
                    list.set(iIntValue2, num3);
                }
            }
        }
    }

    public static List<LatLng> m(List<s2b> list) {
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            s2b s2bVar = list.get(i);
            arrayList.add(new LatLng(s2bVar.a(), s2bVar.b()));
        }
        return arrayList;
    }

    public static LatLng n(LatLng latLng) {
        CoordinateConverter coordinateConverter = new CoordinateConverter(AppUtil.getApp());
        coordinateConverter.from(CoordinateConverter.CoordType.GPS);
        coordinateConverter.coord(latLng);
        return coordinateConverter.convert();
    }

    public static Marker o(Context context, AMap aMap, LatLng latLng, i5f i5fVar) {
        if (latLng == null) {
            return null;
        }
        return aMap.addMarker(new MarkerOptions().position(latLng).icon(BitmapDescriptorFactory.fromView(MarkerParamsUtilKt.INSTANCE.createCircleMarkerView(context, i5fVar))));
    }

    /* JADX WARN: Code duplicated, block: B:16:0x006f  */
    /* JADX WARN: Code duplicated, block: B:17:0x007d  */
    /* JADX WARN: Code duplicated, block: B:18:0x008a  */
    public static Integer p(Location location, int i, int i2) {
        int iG;
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(x44.a(ali.f1176b)));
        arrayList.add(Integer.valueOf(x44.a(ali.e)));
        arrayList.add(Integer.valueOf(x44.a(ali.f)));
        arrayList.add(Integer.valueOf(x44.a(ali.g)));
        arrayList.add(Integer.valueOf(x44.a(ali.h)));
        int iA = x44.a(ali.i);
        if (i == 1) {
            iG = emh.g(emh.i(location.speed, 7.5f, 15.0f));
        } else if (i == 2 || i == 4) {
            iG = emh.g(emh.i(location.speed, 3.5f, 7.5f));
        } else if (i == 5) {
            iG = emh.g(emh.i(location.speed, 7.5f, 15.0f));
        } else if (i == 6) {
            iG = emh.g(emh.i(location.speed, 0.0f, 45.0f));
        } else if (i != 15) {
            switch (i) {
                case 708:
                case 709:
                case 710:
                    iG = emh.g(emh.i(location.speed, 0.0f, 45.0f));
                    break;
                default:
                    iG = emh.f(emh.h(location.speed));
                    break;
            }
        } else {
            iG = emh.g(emh.i(location.speed, 3.5f, 7.5f));
        }
        return (arrayList.contains(Integer.valueOf(i2)) == arrayList.contains(Integer.valueOf(iG)) || i2 == iA) ? Integer.valueOf(iG) : Integer.valueOf(iA);
    }

    public static List<Integer> q(List<Location> list, int i) {
        ArrayList arrayList = new ArrayList();
        if (list != null && list.size() != 0) {
            Integer numValueOf = Integer.valueOf(x44.a(ali.f1176b));
            for (int i2 = 0; i2 < list.size(); i2++) {
                Location location = list.get(i2);
                if (i2 % 4 == 0) {
                    numValueOf = p(location, i, numValueOf.intValue());
                }
                arrayList.add(arrayList.size(), numValueOf);
            }
            E(arrayList);
        }
        return arrayList;
    }

    public static LatLng r(Location location) {
        s2b s2bVarB = t4i.b(location.latitude, location.longitude);
        if (s2bVarB.a() <= 90.0d && s2bVarB.a() >= -90.0d) {
            return new LatLng(s2bVarB.a(), s2bVarB.b());
        }
        Logger.i("LatLngError", "locationLatLng " + s2bVarB.a());
        return null;
    }

    public static List<LatLng> s(List<Location> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null && list.size() != 0) {
            ArrayList arrayList2 = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                LatLng latLngR = r(list.get(i));
                if (latLngR != null) {
                    arrayList2.add(latLngR);
                }
            }
            arrayList.addAll(arrayList2);
        }
        return arrayList;
    }

    public static Marker t(Context context, AMap aMap, LatLng latLng, i5f i5fVar) {
        if (latLng == null) {
            return null;
        }
        return aMap.addMarker(new MarkerOptions().position(latLng).icon(BitmapDescriptorFactory.fromBitmap(MarkerParamsUtilKt.INSTANCE.createCircleMarker(context, i5fVar))).anchor(0.5f, 0.5f).setFlat(false).zIndex(3.0f));
    }

    public static List<Marker> u(Context context, AMap aMap, List<Location> list) {
        return v(context, aMap, list, MarkerParamsUtilKt.INSTANCE.createMarkerParams(50, 50, 10, 11));
    }

    public static List<Marker> v(Context context, AMap aMap, List<Location> list, i5f i5fVar) {
        int i;
        ArrayList arrayList = new ArrayList();
        if (list != null && list.size() != 0) {
            for (Location location : new ArrayList(list)) {
                if (location != null && (i = location.kilometer) > 0) {
                    i5fVar.e = String.valueOf(i);
                    LatLng latLngR = r(location);
                    if (latLngR != null) {
                        Marker markerT = t(context, aMap, latLngR, i5fVar);
                        markerT.setVisible(false);
                        arrayList.add(markerT);
                    }
                }
            }
        }
        return arrayList;
    }

    public static LatLngBounds w(List<LatLng> list) {
        LatLngBounds.Builder builder = LatLngBounds.builder();
        if (list == null) {
            return builder.build();
        }
        for (int i = 0; i < list.size(); i++) {
            builder.include(list.get(i));
        }
        return builder.build();
    }

    public static LatLng x(List<LatLng> list) {
        LatLngBounds latLngBoundsW = w(list);
        LatLng latLng = latLngBoundsW.northeast;
        LatLng latLng2 = latLngBoundsW.southwest;
        return new LatLng((latLng.latitude + latLng2.latitude) / 2.0d, (latLng.longitude + latLng2.longitude) / 2.0d);
    }

    public static Boolean y(Double d, Double d2) {
        new CoordinateConverter(AppUtil.getApp());
        return Boolean.valueOf(CoordinateConverter.isAMapDataAvailable(d.doubleValue(), d2.doubleValue()));
    }

    public static void z(AMap aMap, List<LatLng> list, int i) {
        if (list == null || list.size() == 0) {
            return;
        }
        aMap.moveCamera(list.size() == 1 ? CameraUpdateFactory.newLatLng(list.get(0)) : CameraUpdateFactory.newLatLngBounds(w(list), i));
    }
}
