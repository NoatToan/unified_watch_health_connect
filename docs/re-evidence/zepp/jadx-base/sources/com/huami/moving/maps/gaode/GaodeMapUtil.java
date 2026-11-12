package com.huami.moving.maps.gaode;

import android.content.Context;
import com.amap.api.maps.CoordinateConverter;
import com.amap.api.maps.model.LatLng;
import com.huami.mifit.sportlib.model.GPSPoint;
import com.huami.tools.log.HMLog;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class GaodeMapUtil {
    private CoordinateConverter a;

    public GaodeMapUtil(Context context) {
        CoordinateConverter coordinateConverter = new CoordinateConverter(context);
        this.a = coordinateConverter;
        coordinateConverter.from(CoordinateConverter.CoordType.GPS);
    }

    private LatLng a(GPSPoint gPSPoint) {
        if (gPSPoint == null || gPSPoint.isMaskPoint()) {
            return null;
        }
        if (gPSPoint.getVersion() < 11) {
            return new LatLng(gPSPoint.mLatitude, gPSPoint.mLongitude);
        }
        if (gPSPoint.getProviderType() == 2) {
            return new LatLng(gPSPoint.mLatitude, gPSPoint.mLongitude);
        }
        return !isLocForAmapAvailable(gPSPoint.mLatitude, gPSPoint.mLongitude) ? new LatLng(gPSPoint.mLatitude, gPSPoint.mLongitude) : b(gPSPoint.mLatitude, gPSPoint.mLongitude);
    }

    private LatLng b(double d, double d2) {
        this.a.coord(new LatLng(d, d2, false));
        return this.a.convert();
    }

    public static boolean isLocForAmapAvailable(double d, double d2) {
        return CoordinateConverter.isAMapDataAvailable(d, d2);
    }

    public LatLng convertToLatLng(GPSPoint gPSPoint) {
        if (gPSPoint != null) {
            return a(gPSPoint);
        }
        HMLog.i("IllegalArgumentException", "GaodeMapUtil convertToLatLng", new Object[0]);
        throw new IllegalArgumentException();
    }

    public List<LatLng> convertToLatLngFromGPSPoint(List<GPSPoint> list) {
        int i = 0;
        if (list == null) {
            HMLog.i("IllegalArgumentException", "GaodeMapUtil convertToLatLngFromGPSPoint", new Object[0]);
            throw new IllegalArgumentException();
        }
        int size = list.size();
        if (size == 0) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(size);
        for (GPSPoint gPSPoint : list) {
            if (gPSPoint != null) {
                arrayList.add(i, a(gPSPoint));
                i++;
            }
        }
        return arrayList;
    }
}
