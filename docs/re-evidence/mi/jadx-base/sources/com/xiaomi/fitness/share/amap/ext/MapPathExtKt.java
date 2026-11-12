package com.xiaomi.fitness.share.amap.ext;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.amap.api.maps.AMap;
import com.amap.api.maps.CameraUpdateFactory;
import com.amap.api.maps.model.BitmapDescriptorFactory;
import com.amap.api.maps.model.LatLng;
import com.amap.api.maps.model.LatLngBounds;
import com.amap.api.maps.model.Marker;
import com.amap.api.maps.model.MarkerOptions;
import com.amap.api.maps.model.Polyline;
import com.amap.api.maps.model.PolylineOptions;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.detail.video.share.util.TraceStyleResModel;
import com.xiaomi.fitness.share.amap.MapTraceData;
import com.xiaomi.fitness.share.amap.SharePathVideoAmapActivity;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000R\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u0012\u0010\u0003\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005\u001a\n\u0010\u0006\u001a\u00020\u0001*\u00020\u0002\u001a9\u0010\u0007\u001a\u0004\u0018\u00010\b*\u00020\u00022\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u000bj\b\u0012\u0004\u0012\u00020\u0005`\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010\u001a/\u0010\u0011\u001a\u00020\b*\u00020\u00022\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u000bj\b\u0012\u0004\u0012\u00020\u0005`\n2\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0012\u001a5\u0010\u0013\u001a\u00020\b*\u00020\u00022\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u000bj\b\u0012\u0004\u0012\u00020\u0005`\n2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0015¢\u0006\u0002\u0010\u0016\u001a$\u0010\u0017\u001a\u00020\u0018*\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001d\u001a\n\u0010\u001e\u001a\u00020\u0001*\u00020\u0002\u001a'\u0010\u001f\u001a\u00020\u0001*\u00020\u00022\u0016\u0010 \u001a\u0012\u0012\u0004\u0012\u00020\u00050\u000bj\b\u0012\u0004\u0012\u00020\u0005`\n¢\u0006\u0002\u0010!¨\u0006\""}, d2 = {"changeTilt", "", "Lcom/amap/api/maps/AMap;", "goStartPoint", "startPoint", "Lcom/amap/api/maps/model/LatLng;", "zoom", "setPreTrace", "Lcom/amap/api/maps/model/Polyline;", "mOriginalList", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "traceStyleResModel", "Lcom/xiaomi/fitness/detail/video/share/util/TraceStyleResModel;", "color", "", "(Lcom/amap/api/maps/AMap;Ljava/util/ArrayList;Lcom/xiaomi/fitness/detail/video/share/util/TraceStyleResModel;I)Lcom/amap/api/maps/model/Polyline;", "addPolylines", "(Lcom/amap/api/maps/AMap;Ljava/util/ArrayList;I)Lcom/amap/api/maps/model/Polyline;", "addPolyColorLine", "colorList", "", "(Lcom/amap/api/maps/AMap;Ljava/util/ArrayList;Ljava/util/List;)Lcom/amap/api/maps/model/Polyline;", "addCusMarker", "Lcom/amap/api/maps/model/Marker;", "latlng", "bitmap", "Landroid/graphics/Bitmap;", "shouldBeCentered", "", "configMap", "buildVisibleBounds", "list", "(Lcom/amap/api/maps/AMap;Ljava/util/ArrayList;)V", "sport-record_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class MapPathExtKt {
    @NotNull
    public static final Marker addCusMarker(@NotNull AMap aMap, @NotNull LatLng latlng, @NotNull Bitmap bitmap, boolean z) {
        Intrinsics.checkNotNullParameter(aMap, "<this>");
        Intrinsics.checkNotNullParameter(latlng, "latlng");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Marker markerAddMarker = aMap.addMarker(new MarkerOptions().position(latlng).anchor(0.5f, z ? 0.5f : 1.0f).icon(BitmapDescriptorFactory.fromBitmap(bitmap)).zIndex(3.0f));
        Intrinsics.checkNotNullExpressionValue(markerAddMarker, "addMarker(...)");
        return markerAddMarker;
    }

    public static /* synthetic */ Marker addCusMarker$default(AMap aMap, LatLng latLng, Bitmap bitmap, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return addCusMarker(aMap, latLng, bitmap, z);
    }

    @NotNull
    public static final Polyline addPolyColorLine(@NotNull AMap aMap, @NotNull ArrayList<LatLng> mOriginalList, @NotNull List<Integer> colorList) {
        Intrinsics.checkNotNullParameter(aMap, "<this>");
        Intrinsics.checkNotNullParameter(mOriginalList, "mOriginalList");
        Intrinsics.checkNotNullParameter(colorList, "colorList");
        Polyline polylineAddPolyline = aMap.addPolyline(new PolylineOptions().addAll(mOriginalList).width(MapTraceData.INSTANCE.getMapTraceWidth()).useGradient(true).colorValues(colorList));
        Intrinsics.checkNotNullExpressionValue(polylineAddPolyline, "addPolyline(...)");
        return polylineAddPolyline;
    }

    @NotNull
    public static final Polyline addPolylines(@NotNull AMap aMap, @NotNull ArrayList<LatLng> mOriginalList, int i) {
        Intrinsics.checkNotNullParameter(aMap, "<this>");
        Intrinsics.checkNotNullParameter(mOriginalList, "mOriginalList");
        Polyline polylineAddPolyline = aMap.addPolyline(new PolylineOptions().addAll(mOriginalList).width(MapTraceData.INSTANCE.getMapTraceWidth()).color(i));
        Intrinsics.checkNotNullExpressionValue(polylineAddPolyline, "addPolyline(...)");
        return polylineAddPolyline;
    }

    public static final void buildVisibleBounds(@NotNull AMap aMap, @NotNull ArrayList<LatLng> list) {
        Intrinsics.checkNotNullParameter(aMap, "<this>");
        Intrinsics.checkNotNullParameter(list, "list");
        LatLngBounds.Builder builder = LatLngBounds.builder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            builder.include(list.get(i));
        }
        aMap.animateCamera(CameraUpdateFactory.newLatLngBounds(builder.build(), 150));
    }

    public static final void changeTilt(@NotNull AMap aMap) {
        Intrinsics.checkNotNullParameter(aMap, "<this>");
        aMap.animateCamera(CameraUpdateFactory.changeTilt(40.0f), 1000L, new AMap.CancelableCallback() { // from class: com.xiaomi.fitness.share.amap.ext.MapPathExtKt.changeTilt.1
            @Override // com.amap.api.maps.AMap.CancelableCallback
            public void onCancel() {
            }

            @Override // com.amap.api.maps.AMap.CancelableCallback
            public void onFinish() {
            }
        });
    }

    public static final void configMap(@NotNull AMap aMap) {
        Intrinsics.checkNotNullParameter(aMap, "<this>");
        aMap.getUiSettings().setZoomControlsEnabled(false);
        aMap.getUiSettings().setLogoBottomMargin(-50);
        aMap.getUiSettings().setCompassEnabled(false);
        aMap.getUiSettings().setMyLocationButtonEnabled(false);
        aMap.getUiSettings().setAllGesturesEnabled(false);
    }

    public static final void goStartPoint(@NotNull AMap aMap, @NotNull LatLng startPoint) {
        Intrinsics.checkNotNullParameter(aMap, "<this>");
        Intrinsics.checkNotNullParameter(startPoint, "startPoint");
        aMap.animateCamera(CameraUpdateFactory.newLatLng(startPoint), 1000L, new AMap.CancelableCallback() { // from class: com.xiaomi.fitness.share.amap.ext.MapPathExtKt.goStartPoint.1
            @Override // com.amap.api.maps.AMap.CancelableCallback
            public void onCancel() {
            }

            @Override // com.amap.api.maps.AMap.CancelableCallback
            public void onFinish() {
            }
        });
    }

    @Nullable
    public static final Polyline setPreTrace(@NotNull AMap aMap, @NotNull ArrayList<LatLng> mOriginalList, @NotNull TraceStyleResModel traceStyleResModel, int i) {
        Intrinsics.checkNotNullParameter(aMap, "<this>");
        Intrinsics.checkNotNullParameter(mOriginalList, "mOriginalList");
        Intrinsics.checkNotNullParameter(traceStyleResModel, "traceStyleResModel");
        if (mOriginalList.isEmpty()) {
            return null;
        }
        LatLng latLng = mOriginalList.get(0);
        Intrinsics.checkNotNullExpressionValue(latLng, "get(...)");
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(AppUtil.getApp().getResources(), traceStyleResModel.getStartIcon());
        Intrinsics.checkNotNullExpressionValue(bitmapDecodeResource, "decodeResource(...)");
        addCusMarker(aMap, latLng, bitmapDecodeResource, traceStyleResModel.getShouldBeCentered());
        LatLng latLng2 = mOriginalList.get(mOriginalList.size() - 1);
        Intrinsics.checkNotNullExpressionValue(latLng2, "get(...)");
        Bitmap bitmapDecodeResource2 = BitmapFactory.decodeResource(AppUtil.getApp().getResources(), traceStyleResModel.getEndIcon());
        Intrinsics.checkNotNullExpressionValue(bitmapDecodeResource2, "decodeResource(...)");
        addCusMarker(aMap, latLng2, bitmapDecodeResource2, traceStyleResModel.getShouldBeCentered());
        Logger.d(SharePathVideoAmapActivity.TAG, "traceColor:" + traceStyleResModel.getTraceColor());
        return addPolylines(aMap, mOriginalList, i);
    }

    public static final void zoom(@NotNull AMap aMap) {
        Intrinsics.checkNotNullParameter(aMap, "<this>");
        aMap.animateCamera(CameraUpdateFactory.zoomTo(MapTraceData.INSTANCE.getMapZoom()), 1000L, new AMap.CancelableCallback() { // from class: com.xiaomi.fitness.share.amap.ext.MapPathExtKt.zoom.1
            @Override // com.amap.api.maps.AMap.CancelableCallback
            public void onCancel() {
            }

            @Override // com.amap.api.maps.AMap.CancelableCallback
            public void onFinish() {
            }
        });
    }
}
