package defpackage;

import android.location.Location;
import com.huawei.healthcloud.plugintrack.trackanimation.gpsutil.LatLong;
import com.huawei.healthcloud.plugintrack.trackanimation.gpsutil.LenLatLong;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public class jfa {
    public static void c(LatLong latLong, LatLong latLong2) {
        float[] fArr = new float[2];
        Location.distanceBetween(latLong.getLatLng().d, latLong.getLatLng().f38787a, latLong2.getLatLng().d, latLong2.getLatLng().f38787a, fArr);
        latLong.setDistance(Math.abs(fArr[0]));
        latLong.setAngle((fArr[1] + 360.0f) % 360.0f);
    }

    public static void c(LenLatLong lenLatLong, LenLatLong lenLatLong2, ArrayList<LatLong> arrayList) {
        float[] fArr = new float[2];
        Location.distanceBetween(lenLatLong.getLatLng().d, lenLatLong.getLatLng().f38787a, lenLatLong2.getLatLng().d, lenLatLong2.getLatLng().f38787a, fArr);
        lenLatLong.setAngle((fArr[1] + 360.0f) % 360.0f);
        double distance = 0.0d;
        for (int index = lenLatLong.getIndex(); index <= lenLatLong2.getIndex(); index++) {
            if (!njy.e(arrayList, index)) {
                distance += arrayList.get(index).getDistance();
            }
        }
        lenLatLong.setDistance(distance);
    }

    public static double b(LatLong latLong, LatLong latLong2) {
        float[] fArr = new float[1];
        Location.distanceBetween(latLong.getLatLng().d, latLong.getLatLng().f38787a, latLong2.getLatLng().d, latLong2.getLatLng().f38787a, fArr);
        return Math.abs(fArr[0]);
    }

    public static double a(double d, double d2, double d3, double d4) {
        float[] fArr = new float[1];
        Location.distanceBetween(d, d2, d3, d4, fArr);
        return Math.abs(fArr[0]);
    }
}
