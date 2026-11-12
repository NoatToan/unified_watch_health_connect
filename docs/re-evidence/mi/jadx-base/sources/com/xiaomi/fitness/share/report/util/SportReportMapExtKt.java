package com.xiaomi.fitness.share.report.util;

import android.graphics.BitmapFactory;
import com.amap.api.maps.AMap;
import com.amap.api.maps.CameraUpdateFactory;
import com.amap.api.maps.model.BitmapDescriptorFactory;
import com.amap.api.maps.model.LatLng;
import com.amap.api.maps.model.LatLngBounds;
import com.amap.api.maps.model.MarkerOptions;
import com.amap.api.maps.model.PolylineOptions;
import com.xiaomi.fit.data.common.data.sport.Location;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.utils.UIUtils;
import defpackage.dki;
import defpackage.hoi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u001a\u0010\u0003\u001a\u00020\u0001*\u00020\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002\u001a\u001c\u0010\u0007\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0006H\u0002\u001a\u001a\u0010\u000b\u001a\u00020\u0001*\u00020\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002\u001a\u0018\u0010\r\u001a\u00020\u0001*\u00020\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u001a\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0005¨\u0006\u0010"}, d2 = {"configAMap", "", "Lcom/amap/api/maps/AMap;", "drawRouteTrace", "locationList", "", "Lcom/amap/api/maps/model/LatLng;", "addMarkerToEndpoint", "drawableResId", "", "latLng", "buildVisibleBounds", "list", "buildVisibleBoundsAndDrawTrace", "convertLocationListToLatLngList", "Lcom/xiaomi/fit/data/common/data/sport/Location;", "sport-record_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSportReportMapExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportReportMapExt.kt\ncom/xiaomi/fitness/share/report/util/SportReportMapExtKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,66:1\n1557#2:67\n1628#2,3:68\n1557#2:71\n1628#2,3:72\n*S KotlinDebug\n*F\n+ 1 SportReportMapExt.kt\ncom/xiaomi/fitness/share/report/util/SportReportMapExtKt\n*L\n51#1:67\n51#1:68,3\n65#1:71\n65#1:72,3\n*E\n"})
public final class SportReportMapExtKt {
    private static final void addMarkerToEndpoint(AMap aMap, int i, LatLng latLng) {
        aMap.addMarker(new MarkerOptions().position(latLng).anchor(0.5f, 1.0f).icon(BitmapDescriptorFactory.fromBitmap(BitmapFactory.decodeResource(ApplicationExtKt.getApplication().getResources(), i))));
    }

    private static final void buildVisibleBounds(AMap aMap, List<LatLng> list) {
        LatLngBounds.Builder builder = LatLngBounds.builder();
        List<LatLng> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(builder.include((LatLng) it.next()));
        }
        aMap.animateCamera(CameraUpdateFactory.newLatLngBoundsRect(builder.build(), 200, 200, 0, 900));
    }

    public static final void buildVisibleBoundsAndDrawTrace(@NotNull AMap aMap, @NotNull List<LatLng> list) {
        Intrinsics.checkNotNullParameter(aMap, "<this>");
        Intrinsics.checkNotNullParameter(list, "list");
        buildVisibleBounds(aMap, list);
        drawRouteTrace(aMap, list);
    }

    public static final void configAMap(@NotNull AMap aMap) {
        Intrinsics.checkNotNullParameter(aMap, "<this>");
        aMap.setMapType(UIUtils.isNightMode(ApplicationExtKt.getApplication()) ? 3 : 1);
        aMap.getUiSettings().setZoomControlsEnabled(false);
        aMap.getUiSettings().setLogoBottomMargin(-50);
        aMap.getUiSettings().setCompassEnabled(false);
        aMap.getUiSettings().setMyLocationButtonEnabled(false);
        aMap.getUiSettings().setAllGesturesEnabled(true);
    }

    @NotNull
    public static final List<LatLng> convertLocationListToLatLngList(@NotNull List<? extends Location> locationList) {
        Intrinsics.checkNotNullParameter(locationList, "locationList");
        List<? extends Location> list = locationList;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (Location location : list) {
            arrayList.add(new LatLng(location.latitude, location.longitude));
        }
        return arrayList;
    }

    private static final void drawRouteTrace(AMap aMap, List<LatLng> list) {
        int size = list.size() - 1;
        int color = ApplicationExtKt.getApplication().getResources().getColor(dki.f15626k, null);
        addMarkerToEndpoint(aMap, hoi.W, list.get(0));
        addMarkerToEndpoint(aMap, hoi.V, list.get(size));
        aMap.addPolyline(new PolylineOptions().addAll(list).width(15.0f).color(color));
    }
}
