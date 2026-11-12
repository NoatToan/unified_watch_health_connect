package com.xiaomi.fitness.share.amap.ext;

import android.graphics.Color;
import com.xiaomi.fit.data.common.data.sport.Location;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import com.xiaomi.smarthome.core.server.internal.globaldynamicsetting.GlobalDynamicSettingConst;
import defpackage.ali;
import defpackage.l5;
import defpackage.x44;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\u001a0\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00072\u0006\u0010\f\u001a\u00020\u000b\u001a\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u001a\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\bH\u0002\u001a\u0018\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\bH\u0002\"\u001a\u0010\u0000\u001a\u00020\u0001X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0004\b\u0004\u0010\u0005¨\u0006\u0012"}, d2 = {"curTimeStamp", "", "getCurTimeStamp", "()J", "setCurTimeStamp", "(J)V", "evenlyDistributeLatLngs", "", "Lcom/xiaomi/fit/data/common/data/sport/Location;", "latlngs", "colorList", "", "type", "distanceBetweenLatLngs", "", GlobalDynamicSettingConst.COUNTRY_DOMAIN_PV, "p2", "bearingBetweenLatLngs", "sport-record_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class LatLngsEvenlyDistributeUtilsKt {
    private static long curTimeStamp;

    private static final double bearingBetweenLatLngs(Location location, Location location2) {
        double radians = Math.toRadians(location.latitude);
        double radians2 = Math.toRadians(location.longitude);
        double radians3 = Math.toRadians(location2.latitude);
        double radians4 = Math.toRadians(location2.longitude) - radians2;
        return Math.toDegrees(Math.atan2(Math.sin(radians4) * Math.cos(radians3), (Math.cos(radians) * Math.sin(radians3)) - ((Math.sin(radians) * Math.cos(radians3)) * Math.cos(radians4))));
    }

    private static final double distanceBetweenLatLngs(Location location, Location location2) {
        double d = location.latitude;
        double d2 = location.longitude;
        double d3 = location2.latitude;
        double d4 = location2.longitude;
        double radians = Math.toRadians(d3 - d);
        double radians2 = Math.toRadians(d4 - d2);
        double d5 = 2;
        double d6 = radians / d5;
        double d7 = radians2 / d5;
        double dSin = (Math.sin(d6) * Math.sin(d6)) + (Math.cos(Math.toRadians(d)) * Math.cos(Math.toRadians(d3)) * Math.sin(d7) * Math.sin(d7));
        return ((double) 6371000) * d5 * Math.atan2(Math.sqrt(dSin), Math.sqrt(((double) 1) - dSin));
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0065  */
    @NotNull
    public static final List<Location> evenlyDistributeLatLngs(@NotNull List<? extends Location> list, @NotNull List<Integer> list2, int i) {
        int i2;
        int i3;
        List latlngs = list;
        List<Integer> colorList = list2;
        Intrinsics.checkNotNullParameter(latlngs, "latlngs");
        Intrinsics.checkNotNullParameter(colorList, "colorList");
        if (list.size() < 2) {
            return latlngs;
        }
        ArrayList arrayList = new ArrayList();
        int iA = x44.a(ali.f1176b);
        int i4 = 0;
        arrayList.add(latlngs.get(0));
        ListExtKt.add(colorList, l5.p((Location) latlngs.get(0), i, iA));
        int i5 = 1;
        int size = list.size() - 1;
        while (i4 < size) {
            Location location = (Location) latlngs.get(i4);
            curTimeStamp = location.timeStamp;
            int i6 = i4 + 1;
            Location location2 = (Location) latlngs.get(i6);
            double dDistanceBetweenLatLngs = distanceBetweenLatLngs(location, location2);
            if (dDistanceBetweenLatLngs < 1.0d || dDistanceBetweenLatLngs > 1000.0d) {
                i2 = i6;
                i3 = size;
            } else {
                bearingBetweenLatLngs(location, location2);
                int i7 = (int) (dDistanceBetweenLatLngs / ((double) i5));
                if (i7 < i5) {
                    i2 = i6;
                    i3 = size;
                } else {
                    Integer numP = l5.p(location, i, iA);
                    Intrinsics.checkNotNull(numP);
                    Integer numP2 = l5.p(location2, i, numP.intValue());
                    int iIntValue = numP.intValue();
                    int iAlpha = Color.alpha(numP.intValue());
                    int iRed = Color.red(numP.intValue());
                    int iGreen = Color.green(numP.intValue());
                    int iBlue = Color.blue(numP.intValue());
                    Intrinsics.checkNotNull(numP2);
                    int iAlpha2 = Color.alpha(numP2.intValue());
                    int iRed2 = Color.red(numP2.intValue());
                    int i8 = (iAlpha2 - iAlpha) / i7;
                    int i9 = (iRed2 - iRed) / i7;
                    int iGreen2 = (Color.green(numP2.intValue()) - iGreen) / i7;
                    int iBlue2 = (Color.blue(numP2.intValue()) - iBlue) / i7;
                    while (i5 < i7) {
                        int i10 = i6;
                        Integer num = numP2;
                        int i11 = iIntValue;
                        double d = ((double) i5) / ((double) i7);
                        Location location3 = new Location();
                        double d2 = location.latitude;
                        int i12 = iRed;
                        int i13 = iGreen;
                        location3.latitude = d2 + ((location2.latitude - d2) * d);
                        double d3 = location.longitude;
                        location3.longitude = d3 + (d * (location2.longitude - d3));
                        location3.timeStamp = curTimeStamp;
                        location3.total_distance = location.total_distance;
                        location3.speed = location.speed;
                        location3.pace = location.pace;
                        arrayList.add(location3);
                        colorList = list2;
                        ListExtKt.add(colorList, Integer.valueOf(Color.argb((i5 * i8) + iAlpha, i12 + (i5 * i9), i13 + (i5 * iGreen2), (i5 * iBlue2) + iBlue)));
                        i5++;
                        iRed = i12;
                        size = size;
                        i6 = i10;
                        numP2 = num;
                        iIntValue = i11;
                        iGreen = i13;
                    }
                    i2 = i6;
                    i3 = size;
                    ListExtKt.add(colorList, numP2);
                    arrayList.add(location2);
                    iA = iIntValue;
                }
            }
            latlngs = list;
            size = i3;
            i4 = i2;
            i5 = 1;
        }
        return arrayList;
    }

    public static final long getCurTimeStamp() {
        return curTimeStamp;
    }

    public static final void setCurTimeStamp(long j) {
        curTimeStamp = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final List<Location> evenlyDistributeLatLngs(@NotNull List<? extends Location> latlngs) {
        Intrinsics.checkNotNullParameter(latlngs, "latlngs");
        if (latlngs.size() < 2) {
            return latlngs;
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        arrayList.add(latlngs.get(0));
        int size = latlngs.size() - 1;
        while (i < size) {
            Location location = (Location) latlngs.get(i);
            curTimeStamp = location.timeStamp;
            i++;
            Location location2 = (Location) latlngs.get(i);
            double dDistanceBetweenLatLngs = distanceBetweenLatLngs(location, location2);
            if (dDistanceBetweenLatLngs >= 1.0d) {
                bearingBetweenLatLngs(location, location2);
                int i2 = (int) (dDistanceBetweenLatLngs / ((double) 1));
                for (int i3 = 1; i3 < i2; i3++) {
                    double d = ((double) i3) / ((double) i2);
                    Location location3 = new Location();
                    double d2 = location.latitude;
                    location3.latitude = d2 + ((location2.latitude - d2) * d);
                    double d3 = location.longitude;
                    location3.longitude = d3 + (d * (location2.longitude - d3));
                    location3.timeStamp = curTimeStamp;
                    location3.speed = location.speed;
                    location3.pace = location.pace;
                    arrayList.add(location3);
                }
                arrayList.add(location2);
            }
        }
        return arrayList;
    }
}
