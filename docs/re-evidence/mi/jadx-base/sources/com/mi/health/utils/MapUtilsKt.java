package com.mi.health.utils;

import android.location.LocationManager;
import android.os.Process;
import com.amap.api.location.AMapLocationClient;
import com.amap.api.maps.AMap;
import com.amap.api.maps.model.CustomMapStyleOptions;
import com.amap.api.maps.model.LatLng;
import com.amap.api.maps.model.Marker;
import com.amap.api.maps.model.MarkerOptions;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fit.data.common.data.sport.Location;
import com.xiaomi.fit.fitness.parser.sport.track.parser.CommonTrackData;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import defpackage.bxa;
import defpackage.ni4;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000V\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0005\u001a\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b\u001a\u000e\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000b\u001a\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\b\u001a\u000e\u0010\f\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010\u001a \u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\b\u001a&\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0015\u001a\u0010\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u0015H\u0002\u001a\u001a\u0010\u001d\u001a\u00020\u001e*\u00020\u001f2\u0006\u0010 \u001a\u00020\u00012\u0006\u0010!\u001a\u00020\u0001\u001a\u0012\u0010\"\u001a\u00020#*\u00020\u001f2\u0006\u0010$\u001a\u00020%\u001a\u0006\u0010&\u001a\u00020\u001e\u001a\b\u0010'\u001a\u00020(H\u0007\u001a!\u0010)\u001a\u00020(2\u0012\u0010*\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010+\"\u00020\u0001H\u0007¢\u0006\u0002\u0010,\u001a\u0006\u0010/\u001a\u00020\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001a\u001a\u00020\u0015X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010-\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010.\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u00060"}, d2 = {"MAP_STYLE_RES_ID_DARK_STYLE", "", "MAP_STYLE_NAME_DARK_STYLE", "MAP_STYLE_RES_ID_LIGHT_STYLE", "MAP_STYLE_NAME_LIGHT_STYLE", "MAP_STYLE_RES_ID_STYLE_SHARE", "MAP_STYLE_NAME_STYLE_SHARE", "createLatLngList", "", "Lcom/amap/api/maps/model/LatLng;", "locationList", "Lcom/xiaomi/fit/data/common/data/sport/Location;", "createLatLng", "location", "createTrackLatLngList", "trackList", "Lcom/xiaomi/fit/fitness/parser/sport/track/parser/CommonTrackData;", "trackDate", "convertCommonTrackToLatLngs", "trackData", "getDistance", "", "lon1", "lat1", "lon2", "lat2", "EARTH_RADIUS", "rad", PluginDeviceInfo.FICONOFF, "setCustomMapStyleWithOnlineStyleId", "", "Lcom/amap/api/maps/AMap;", "styleID", "styleNameStr", "addMarkerWithZIndex", "Lcom/amap/api/maps/model/Marker;", "options", "Lcom/amap/api/maps/model/MarkerOptions;", "updatePrivacy", "isLocationEnable", "", "isPermissionGranted", "permissions", "", "([Ljava/lang/String;)Z", "v8aUrl", "v7aUrl", "getSoDownloadUrl", "map-amap_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMapUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapUtils.kt\ncom/mi/health/utils/MapUtilsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,210:1\n1863#2:211\n1864#2:213\n1#3:212\n*S KotlinDebug\n*F\n+ 1 MapUtils.kt\ncom/mi/health/utils/MapUtilsKt\n*L\n83#1:211\n83#1:213\n*E\n"})
public final class MapUtilsKt {
    private static final double EARTH_RADIUS = 6371000.0d;

    @NotNull
    public static final String MAP_STYLE_NAME_DARK_STYLE = "dark_style";

    @NotNull
    public static final String MAP_STYLE_NAME_LIGHT_STYLE = "light_style";

    @NotNull
    public static final String MAP_STYLE_NAME_STYLE_SHARE = "style_share";

    @NotNull
    public static final String MAP_STYLE_RES_ID_DARK_STYLE = "8fc3506b28929620c9803a650d1b396a";

    @NotNull
    public static final String MAP_STYLE_RES_ID_LIGHT_STYLE = "a375c19659b0440421141022dc8cb378";

    @NotNull
    public static final String MAP_STYLE_RES_ID_STYLE_SHARE = "a5da16961586e01813ec1b9fb845ef55";

    @NotNull
    private static final String v7aUrl = "https://staging-cnbj2-fds.api.xiaomi.net/hlth-operate/appres/images/amap/so/armeabi-v7a/libAMapSDK_MAP_v10_1_300.so?Expires=9223372036854775807&GalaxyAccessKeyId=AKQAB4U5JA25UMUCY3&Signature=kvlOe/WDgNP81La1IV+mALYjzH0=";

    @NotNull
    private static final String v8aUrl = "https://staging-cnbj2-fds.api.xiaomi.net/hlth-operate/appres/images/amap/so/arm64-v8a/libAMapSDK_MAP_v10_1_300.so?Expires=9223372036854775807&GalaxyAccessKeyId=AKQAB4U5JA25UMUCY3&Signature=LbTAW8aWFh3K51AYEE4DWYBykLI=";

    @NotNull
    public static final Marker addMarkerWithZIndex(@NotNull AMap aMap, @NotNull MarkerOptions options) {
        Intrinsics.checkNotNullParameter(aMap, "<this>");
        Intrinsics.checkNotNullParameter(options, "options");
        options.zIndex(3.0f);
        Marker markerAddMarker = aMap.addMarker(options);
        Intrinsics.checkNotNullExpressionValue(markerAddMarker, "addMarker(...)");
        return markerAddMarker;
    }

    @NotNull
    public static final List<List<LatLng>> convertCommonTrackToLatLngs(@NotNull List<CommonTrackData> trackData) {
        Intrinsics.checkNotNullParameter(trackData, "trackData");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (CommonTrackData commonTrackData : trackData) {
            arrayList2.add(new LatLng(commonTrackData.getLatitude(), commonTrackData.getLongitude()));
            if (commonTrackData.getFlagSegment()) {
                ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll(arrayList2);
                arrayList.add(arrayList3);
                Logger.i("convertCommonTrackToLatLngs", "current segment index:" + arrayList.size() + ",current segment size:" + arrayList2.size());
                arrayList2.clear();
            }
        }
        arrayList.add(arrayList2);
        Logger.i("convertCommonTrackToLatLngs", "current segment index:" + arrayList.size() + ",current segment size:" + arrayList2.size());
        return arrayList;
    }

    @NotNull
    public static final LatLng createLatLng(@NotNull Location location) {
        Intrinsics.checkNotNullParameter(location, "location");
        double[] dArrC = bxa.c(location.latitude, location.longitude);
        return new LatLng(dArrC[0], dArrC[1]);
    }

    @NotNull
    public static final List<LatLng> createLatLngList(@Nullable List<? extends Location> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                arrayList2.add(createLatLng(list.get(i)));
            }
            arrayList.addAll(arrayList2);
        }
        return arrayList;
    }

    @NotNull
    public static final List<LatLng> createTrackLatLngList(@Nullable List<CommonTrackData> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                arrayList2.add(createLatLng(list.get(i)));
            }
            arrayList.addAll(arrayList2);
        }
        return arrayList;
    }

    public static final double getDistance(double d, double d2, double d3, double d4) {
        double dRad = rad(d2);
        double dRad2 = rad(d4);
        double dRad3 = rad(d) - rad(d3);
        double d5 = 2;
        return Math.round(((d5 * Math.asin(Math.sqrt(Math.pow(Math.sin((dRad - dRad2) / d5), 2.0d) + ((Math.cos(dRad) * Math.cos(dRad2)) * Math.pow(Math.sin(dRad3 / d5), 2.0d))))) * EARTH_RADIUS) * ((double) 10000)) / ((long) 10000);
    }

    @NotNull
    public static final String getSoDownloadUrl() {
        return Process.is64Bit() ? v8aUrl : v7aUrl;
    }

    @JvmOverloads
    public static final boolean isLocationEnable() {
        LocationManager locationManager = (LocationManager) AppUtil.getApp().getSystemService("location");
        if (locationManager == null) {
            return false;
        }
        try {
            return locationManager.isProviderEnabled("gps") || locationManager.isProviderEnabled("network");
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001d A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:? A[RETURN, SYNTHETIC] */
    @JvmOverloads
    public static final boolean isPermissionGranted(@NotNull String... permissions) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        for (String str : permissions) {
            if (ni4.a(AppUtil.getApp(), str) != 0) {
                if (str == null) {
                    return true;
                }
                return false;
            }
        }
        str = null;
        if (str == null) {
            return true;
        }
        return false;
    }

    private static final double rad(double d) {
        return (d * 3.141592653589793d) / 180.0d;
    }

    public static final void setCustomMapStyleWithOnlineStyleId(@NotNull AMap aMap, @NotNull String styleID, @NotNull String styleNameStr) {
        Intrinsics.checkNotNullParameter(aMap, "<this>");
        Intrinsics.checkNotNullParameter(styleID, "styleID");
        Intrinsics.checkNotNullParameter(styleNameStr, "styleNameStr");
        Logger.i("MAP STYLE", "setCustomMapStyleWithOnlineStyleId:" + styleID + " " + styleNameStr);
        if (Intrinsics.areEqual(styleID, "-1")) {
            aMap.showMapText(false);
            aMap.setMapType(1);
            CustomMapStyleOptions customMapStyleOptions = new CustomMapStyleOptions();
            customMapStyleOptions.setEnable(false);
            customMapStyleOptions.setStyleId(styleNameStr);
            aMap.setCustomMapStyle(customMapStyleOptions);
            return;
        }
        aMap.showMapText(true);
        if (!StringsKt__StringsKt.isBlank(styleNameStr)) {
            CustomMapStyleOptions customMapStyleOptions2 = new CustomMapStyleOptions();
            customMapStyleOptions2.setEnable(true);
            customMapStyleOptions2.setStyleId(styleID);
            aMap.setCustomMapStyle(customMapStyleOptions2);
            return;
        }
        CustomMapStyleOptions customMapStyleOptions3 = new CustomMapStyleOptions();
        customMapStyleOptions3.setEnable(false);
        customMapStyleOptions3.setStyleId("");
        aMap.setMapType(2);
        aMap.setCustomMapStyle(customMapStyleOptions3);
    }

    public static final void updatePrivacy() {
        AMapLocationClient.updatePrivacyShow(AppUtil.getApp(), true, true);
        AMapLocationClient.updatePrivacyAgree(AppUtil.getApp(), true);
    }

    @NotNull
    public static final LatLng createLatLng(@NotNull CommonTrackData trackDate) {
        Intrinsics.checkNotNullParameter(trackDate, "trackDate");
        double[] dArrC = bxa.c(trackDate.getLatitude(), trackDate.getLongitude());
        return new LatLng(dArrC[0], dArrC[1]);
    }
}
