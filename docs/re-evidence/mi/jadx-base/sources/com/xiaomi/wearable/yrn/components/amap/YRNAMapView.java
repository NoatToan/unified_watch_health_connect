package com.xiaomi.wearable.yrn.components.amap;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.amap.api.location.AMapLocation;
import com.amap.api.location.AMapLocationClient;
import com.amap.api.location.AMapLocationClientOption;
import com.amap.api.location.AMapLocationListener;
import com.amap.api.maps.AMap;
import com.amap.api.maps.CameraUpdateFactory;
import com.amap.api.maps.MapView;
import com.amap.api.maps.Projection;
import com.amap.api.maps.UiSettings;
import com.amap.api.maps.model.BitmapDescriptor;
import com.amap.api.maps.model.BitmapDescriptorFactory;
import com.amap.api.maps.model.CameraPosition;
import com.amap.api.maps.model.LatLng;
import com.amap.api.maps.model.LatLngBounds;
import com.amap.api.maps.model.Marker;
import com.amap.api.maps.model.MarkerOptions;
import com.amap.api.maps.model.MyLocationStyle;
import com.amap.api.maps.model.VisibleRegion;
import com.amap.api.maps.model.animation.AlphaAnimation;
import com.amap.api.services.district.DistrictSearchQuery;
import com.mibi.sdk.component.params.SdkContants;
import com.miui.tsmclient.net.TSMAuthContants;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.commonbase.data.sportmodel.view.BaseMapView;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.smarthome.homeroom.model.Home;
import com.xiaomi.wearable.yrn.components.amap.YRNAMapView;
import com.xiaomi.wearable.yrn.components.amap.cluster.CLusterUtils;
import com.xiaomi.wearable.yrn.export.YRNHelper;
import com.xiaomi.wearable.yrn.export.YRNHelperExtKt;
import defpackage.nsi;
import defpackage.toi;
import defpackage.uvi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000Á\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r*\u0001K\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u000bB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\fJ\f\u0010#\u001a\u00020\b*\u00020$H\u0002J\u0010\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\bH\u0002J\u0016\u0010'\u001a\b\u0012\u0004\u0012\u00020\b0\u00192\u0006\u0010(\u001a\u00020\u0018H\u0002J\b\u0010)\u001a\u00020*H\u0014J\u000e\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020\u0011J\u0010\u0010-\u001a\u00020*2\u0006\u0010,\u001a\u00020\u0011H\u0002J\u000e\u0010.\u001a\u00020*2\u0006\u0010,\u001a\u00020\u0013J\u0010\u0010/\u001a\u00020*2\u0006\u0010,\u001a\u00020\u0013H\u0002J\u000e\u00100\u001a\u00020*2\u0006\u0010,\u001a\u000201J\u0016\u00102\u001a\u00020*2\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u00020$J \u00106\u001a\u00020*2\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u00020$2\b\b\u0002\u00107\u001a\u00020\bJ\u0006\u00108\u001a\u00020*J\u0006\u00109\u001a\u00020*J\u000e\u0010:\u001a\u00020*2\u0006\u0010;\u001a\u00020<J\u0006\u0010=\u001a\u00020*J\u0016\u0010>\u001a\u00020*2\u0006\u0010?\u001a\u0002042\u0006\u0010@\u001a\u000204J\u000e\u0010A\u001a\u00020*2\u0006\u0010B\u001a\u00020CJ\u0006\u0010D\u001a\u00020*J\u0006\u0010E\u001a\u00020*J\u0006\u0010H\u001a\u00020*J\u0006\u0010I\u001a\u00020*J\u0006\u0010M\u001a\u00020*J\u0006\u0010N\u001a\u00020*J\u0014\u0010R\u001a\u00020*2\f\u0010S\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0019J\u001e\u0010T\u001a\u00020*2\f\u0010S\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00192\u0006\u0010U\u001a\u00020<H\u0002J\u0006\u0010Z\u001a\u00020*J\u0006\u0010[\u001a\u00020*J\u0006\u0010\\\u001a\u00020*J\u0012\u0010]\u001a\u00020*2\b\u0010^\u001a\u0004\u0018\u00010_H\u0016J\b\u0010`\u001a\u00020*H\u0016J\b\u0010a\u001a\u00020*H\u0016J\u0010\u0010b\u001a\u00020*2\u0006\u0010c\u001a\u00020_H\u0016J\b\u0010d\u001a\u00020*H\u0016J\b\u0010e\u001a\u00020*H\u0016J\b\u0010f\u001a\u00020*H\u0014J\u0012\u0010g\u001a\u00020*2\b\u0010h\u001a\u0004\u0018\u00010\u001cH\u0002R\u0010\u0010\r\u001a\u0004\u0018\u00010\u0002X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R \u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00190\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R*\u0010\u001d\u001a\u001e\u0012\u0004\u0012\u00020\u001c\u0012\u0014\u0012\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u001f\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u001e0\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010F\u001a\u00020GX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010J\u001a\u00020KX\u0082\u0004¢\u0006\u0004\n\u0002\u0010LR\u000e\u0010O\u001a\u00020PX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010Q\u001a\u00020<X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010V\u001a\u00020WX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010X\u001a\u00020YX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010i\u001a\u00020\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bj\u0010k¨\u0006l"}, d2 = {"Lcom/xiaomi/wearable/yrn/components/amap/YRNAMapView;", "Lcom/xiaomi/fitness/commonbase/data/sportmodel/view/BaseMapView;", "Lcom/amap/api/maps/MapView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "mMapView", "mCenterMarker", "Landroid/widget/ImageView;", "mapProps", "Lcom/xiaomi/wearable/yrn/components/amap/YRNAMapProps;", "myLocationProps", "Lcom/xiaomi/wearable/yrn/components/amap/MyLocationProps;", "mLocationClient", "Lcom/amap/api/location/AMapLocationClient;", "mMarkers", "", "Lcom/amap/api/maps/model/LatLng;", "", "cacheMarkers", "Lcom/xiaomi/wearable/yrn/components/amap/ClusterData;", "Lcom/amap/api/maps/model/Marker;", "cacheIcons", "Lkotlin/Pair;", "Lcom/amap/api/maps/model/BitmapDescriptor;", "selectMarker", "currentZoom", "", "getDecimalPlaces", "", "getPrecisionTolerance", "precision", "findMatchingMarkerIds", "targetPosition", "onAttachedToWindow", "", "setUiSettings", "data", "applyYRNAMapProps", "setMyLocationStyle", "applyMyLocationProps", "startLocation", "Lcom/xiaomi/wearable/yrn/components/amap/LocationOption;", "moveCamera", "coordinate", "Lcom/xiaomi/wearable/yrn/components/amap/Coordinate;", "zoom", "animateCamera", "duration", "stopAnimation", "clearMap", "setMapType", "type", "", "runOnDrawFrame", "setMapStatusLimit", "northeast", "southwest", "setTouchPoiEnable", "enable", "", "setLocationListener", "removeLocationListener", "locationListener", "Lcom/amap/api/location/AMapLocationListener;", "setOnCameraChangeListener", "removeOnCameraChangeListener", "onCameraChangeListener", "com/xiaomi/wearable/yrn/components/amap/YRNAMapView$onCameraChangeListener$1", "Lcom/xiaomi/wearable/yrn/components/amap/YRNAMapView$onCameraChangeListener$1;", "setOnMapLoadedListener", "removeOnMapLoadedListener", "onMapLoadedListener", "Lcom/amap/api/maps/AMap$OnMapLoadedListener;", "renderToken", "addMarkers", "clusters", "cleanOldMarkers", "token", "onMarkerClickListener", "Lcom/amap/api/maps/AMap$OnMarkerClickListener;", "onMapClickListener", "Lcom/amap/api/maps/AMap$OnMapClickListener;", "setOnMapClickListener", "removeOnMapClickListener", "setOnMarkerClickListener", "onCreate", SdkContants.KEY_BUNDLE, "Landroid/os/Bundle;", LifecycleConstantKt.ON_RESUME, LifecycleConstantKt.ON_PAUSE, "onSaveInstanceState", "outState", LifecycleConstantKt.ON_DESTROY, "onLowMemory", "onDetachedFromWindow", "removeMarkerWithAnimation", "marker", "mapView", "getMapView", "()Lcom/amap/api/maps/MapView;", "components_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nYRNAMapView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 YRNAMapView.kt\ncom/xiaomi/wearable/yrn/components/amap/YRNAMapView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,514:1\n1557#2:515\n1628#2,3:516\n535#3:519\n520#3,6:520\n216#4,2:526\n216#4,2:529\n216#4,2:531\n1#5:528\n*S KotlinDebug\n*F\n+ 1 YRNAMapView.kt\ncom/xiaomi/wearable/yrn/components/amap/YRNAMapView\n*L\n377#1:515\n377#1:516,3\n409#1:519\n409#1:520,6\n410#1:526,2\n419#1:529,2\n441#1:531,2\n*E\n"})
public final class YRNAMapView extends BaseMapView<MapView> {

    @NotNull
    private Map<com.amap.api.maps.model.Marker, Pair<BitmapDescriptor, BitmapDescriptor>> cacheIcons;

    @NotNull
    private Map<ClusterData, com.amap.api.maps.model.Marker> cacheMarkers;
    private float currentZoom;

    @NotNull
    private final AMapLocationListener locationListener;

    @Nullable
    private ImageView mCenterMarker;

    @Nullable
    private AMapLocationClient mLocationClient;

    @Nullable
    private MapView mMapView;

    @NotNull
    private final Map<LatLng, List<Integer>> mMarkers;

    @Nullable
    private YRNAMapProps mapProps;

    @Nullable
    private MyLocationProps myLocationProps;

    @NotNull
    private final YRNAMapView$onCameraChangeListener$1 onCameraChangeListener;

    @NotNull
    private final AMap.OnMapClickListener onMapClickListener;

    @NotNull
    private final AMap.OnMapLoadedListener onMapLoadedListener;

    @NotNull
    private final AMap.OnMarkerClickListener onMarkerClickListener;

    @NotNull
    private volatile String renderToken;

    @Nullable
    private com.amap.api.maps.model.Marker selectMarker;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.xiaomi.wearable.yrn.components.amap.YRNAMapView$onCameraChangeListener$1] */
    public YRNAMapView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mMarkers = new LinkedHashMap();
        this.cacheMarkers = new LinkedHashMap();
        this.cacheIcons = new LinkedHashMap();
        AMapLocationClient.updatePrivacyShow(context, true, true);
        AMapLocationClient.updatePrivacyAgree(context, true);
        this.mLocationClient = new AMapLocationClient(context);
        this.locationListener = new AMapLocationListener() { // from class: aur
            @Override // com.amap.api.location.AMapLocationListener
            public final void onLocationChanged(AMapLocation aMapLocation) {
                YRNAMapView.locationListener$lambda$3(this.f3474a, aMapLocation);
            }
        };
        this.onCameraChangeListener = new AMap.OnCameraChangeListener() { // from class: com.xiaomi.wearable.yrn.components.amap.YRNAMapView$onCameraChangeListener$1
            @Override // com.amap.api.maps.AMap.OnCameraChangeListener
            public void onCameraChange(CameraPosition p0) {
                LatLng latLng;
                LatLng latLng2;
                LatLng latLng3;
                LatLng latLng4;
                AMap map;
                Projection projection;
                if (p0 == null) {
                    return;
                }
                MapView mapView = this.this$0.mMapView;
                Double dValueOf = null;
                VisibleRegion visibleRegion = (mapView == null || (map = mapView.getMap()) == null || (projection = map.getProjection()) == null) ? null : projection.getVisibleRegion();
                YRNHelper yRNHelperExtKt = YRNHelperExtKt.getInstance(YRNHelper.INSTANCE);
                Pair[] pairArr = new Pair[5];
                Pair[] pairArr2 = new Pair[2];
                LatLng latLng5 = p0.target;
                pairArr2[0] = TuplesKt.to("latitude", latLng5 != null ? Double.valueOf(latLng5.latitude) : null);
                LatLng latLng6 = p0.target;
                pairArr2[1] = TuplesKt.to("longitude", latLng6 != null ? Double.valueOf(latLng6.longitude) : null);
                pairArr[0] = TuplesKt.to("target", MapsKt__MapsKt.mapOf(pairArr2));
                pairArr[1] = TuplesKt.to("zoom", Float.valueOf(p0.zoom));
                pairArr[2] = TuplesKt.to("finish", Boolean.FALSE);
                Pair[] pairArr3 = new Pair[2];
                pairArr3[0] = TuplesKt.to("latitude", (visibleRegion == null || (latLng4 = visibleRegion.farRight) == null) ? null : Double.valueOf(latLng4.latitude));
                pairArr3[1] = TuplesKt.to("longitude", (visibleRegion == null || (latLng3 = visibleRegion.farRight) == null) ? null : Double.valueOf(latLng3.longitude));
                pairArr[3] = TuplesKt.to("northEast", MapsKt__MapsKt.mapOf(pairArr3));
                Pair[] pairArr4 = new Pair[2];
                pairArr4[0] = TuplesKt.to("latitude", (visibleRegion == null || (latLng2 = visibleRegion.nearLeft) == null) ? null : Double.valueOf(latLng2.latitude));
                if (visibleRegion != null && (latLng = visibleRegion.nearLeft) != null) {
                    dValueOf = Double.valueOf(latLng.longitude);
                }
                pairArr4[1] = TuplesKt.to("longitude", dValueOf);
                pairArr[4] = TuplesKt.to("southWest", MapsKt__MapsKt.mapOf(pairArr4));
                yRNHelperExtKt.sendJSEvent("ON_MAP_CAMERA_CHANGE", MapsKt__MapsKt.mapOf(pairArr));
            }

            @Override // com.amap.api.maps.AMap.OnCameraChangeListener
            public void onCameraChangeFinish(CameraPosition p0) {
                LatLng latLng;
                LatLng latLng2;
                LatLng latLng3;
                LatLng latLng4;
                AMap map;
                Projection projection;
                if (p0 == null) {
                    return;
                }
                MapView mapView = this.this$0.mMapView;
                VisibleRegion visibleRegion = (mapView == null || (map = mapView.getMap()) == null || (projection = map.getProjection()) == null) ? null : projection.getVisibleRegion();
                YRNHelper yRNHelperExtKt = YRNHelperExtKt.getInstance(YRNHelper.INSTANCE);
                Pair[] pairArr = new Pair[5];
                Pair[] pairArr2 = new Pair[2];
                LatLng latLng5 = p0.target;
                pairArr2[0] = TuplesKt.to("latitude", latLng5 != null ? Double.valueOf(latLng5.latitude) : null);
                LatLng latLng6 = p0.target;
                pairArr2[1] = TuplesKt.to("longitude", latLng6 != null ? Double.valueOf(latLng6.longitude) : null);
                pairArr[0] = TuplesKt.to("target", MapsKt__MapsKt.mapOf(pairArr2));
                pairArr[1] = TuplesKt.to("zoom", Float.valueOf(p0.zoom));
                pairArr[2] = TuplesKt.to("finish", Boolean.TRUE);
                Pair[] pairArr3 = new Pair[2];
                pairArr3[0] = TuplesKt.to("latitude", (visibleRegion == null || (latLng4 = visibleRegion.farRight) == null) ? null : Double.valueOf(latLng4.latitude));
                pairArr3[1] = TuplesKt.to("longitude", (visibleRegion == null || (latLng3 = visibleRegion.farRight) == null) ? null : Double.valueOf(latLng3.longitude));
                pairArr[3] = TuplesKt.to("northEast", MapsKt__MapsKt.mapOf(pairArr3));
                Pair[] pairArr4 = new Pair[2];
                pairArr4[0] = TuplesKt.to("latitude", (visibleRegion == null || (latLng2 = visibleRegion.nearLeft) == null) ? null : Double.valueOf(latLng2.latitude));
                pairArr4[1] = TuplesKt.to("longitude", (visibleRegion == null || (latLng = visibleRegion.nearLeft) == null) ? null : Double.valueOf(latLng.longitude));
                pairArr[4] = TuplesKt.to("southWest", MapsKt__MapsKt.mapOf(pairArr4));
                yRNHelperExtKt.sendJSEvent("ON_MAP_CAMERA_CHANGE", MapsKt__MapsKt.mapOf(pairArr));
                if (Math.abs(this.this$0.currentZoom - p0.zoom) >= 0.1d) {
                    this.this$0.currentZoom = p0.zoom;
                    Map map2 = this.this$0.cacheMarkers;
                    YRNAMapView yRNAMapView = this.this$0;
                    Iterator it = map2.entrySet().iterator();
                    while (it.hasNext()) {
                        com.amap.api.maps.model.Marker marker = (com.amap.api.maps.model.Marker) ((Map.Entry) it.next()).getValue();
                        if (Intrinsics.areEqual(marker, yRNAMapView.selectMarker)) {
                            Pair pair = (Pair) yRNAMapView.cacheIcons.get(marker);
                            com.amap.api.maps.model.Marker marker2 = yRNAMapView.selectMarker;
                            if (marker2 != null) {
                                marker2.setIcon(pair != null ? (BitmapDescriptor) pair.getFirst() : null);
                            }
                        }
                    }
                    this.this$0.selectMarker = null;
                }
            }
        };
        this.onMapLoadedListener = new AMap.OnMapLoadedListener() { // from class: bur
            @Override // com.amap.api.maps.AMap.OnMapLoadedListener
            public final void onMapLoaded() {
                YRNAMapView.onMapLoadedListener$lambda$4();
            }
        };
        this.renderToken = "";
        this.onMarkerClickListener = new AMap.OnMarkerClickListener() { // from class: cur
            @Override // com.amap.api.maps.AMap.OnMarkerClickListener
            public final boolean onMarkerClick(Marker marker) {
                return YRNAMapView.onMarkerClickListener$lambda$11(this.f14756a, marker);
            }
        };
        this.onMapClickListener = new AMap.OnMapClickListener() { // from class: dur
            @Override // com.amap.api.maps.AMap.OnMapClickListener
            public final void onMapClick(LatLng latLng) {
                YRNAMapView.onMapClickListener$lambda$13(this.f15947a, latLng);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addMarkers$lambda$7(YRNAMapView this$0, String currentToken, ClusterData cluster, AtomicInteger pendingCount, List clusters, MarkerOptions markerOptions, BitmapDescriptor bitmapDescriptor, BitmapDescriptor bitmapDescriptor2) {
        AMap map;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(currentToken, "$currentToken");
        Intrinsics.checkNotNullParameter(cluster, "$cluster");
        Intrinsics.checkNotNullParameter(pendingCount, "$pendingCount");
        Intrinsics.checkNotNullParameter(clusters, "$clusters");
        Intrinsics.checkNotNullParameter(markerOptions, "markerOptions");
        if (!Intrinsics.areEqual(this$0.renderToken, currentToken)) {
            return Unit.INSTANCE;
        }
        MapView mapView = this$0.mMapView;
        com.amap.api.maps.model.Marker markerAddMarker = (mapView == null || (map = mapView.getMap()) == null) ? null : map.addMarker(markerOptions);
        if (markerAddMarker != null) {
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(200L);
            markerAddMarker.setAnimation(alphaAnimation);
            markerAddMarker.startAnimation();
            this$0.cacheMarkers.put(cluster, markerAddMarker);
            this$0.cacheIcons.put(markerAddMarker, new Pair<>(bitmapDescriptor, bitmapDescriptor2));
        }
        if (pendingCount.decrementAndGet() == 0) {
            this$0.cleanOldMarkers(clusters, currentToken);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void animateCamera$default(YRNAMapView yRNAMapView, Coordinate coordinate, double d, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 250;
        }
        yRNAMapView.animateCamera(coordinate, d, i);
    }

    private final void applyMyLocationProps(MyLocationProps data) {
        AMap map;
        AMap map2;
        MapView mapView = this.mMapView;
        if (mapView != null && (map2 = mapView.getMap()) != null) {
            MyLocationStyle myLocationStyle = new MyLocationStyle();
            myLocationStyle.anchor((float) data.getAnchorU(), (float) data.getAnchorV());
            myLocationStyle.myLocationIcon(BitmapDescriptorFactory.fromResource(toi.f34895b));
            if (data.getRadiusFillColor() != null) {
                myLocationStyle.radiusFillColor(data.getRadiusFillColor().intValue());
            }
            if (data.getStrokeColor() != null) {
                myLocationStyle.strokeColor(data.getStrokeColor().intValue());
            }
            if (data.getStrokeWidth() != null) {
                myLocationStyle.strokeWidth((float) data.getStrokeWidth().doubleValue());
            }
            myLocationStyle.myLocationType(data.getMyLocationType());
            myLocationStyle.showMyLocation(data.getShowMyLocation());
            map2.setMyLocationStyle(myLocationStyle);
        }
        MapView mapView2 = this.mMapView;
        if (mapView2 != null && (map = mapView2.getMap()) != null) {
            map.setMyLocationEnabled(data.getShowMyLocation());
        }
        setMapType((getResources().getConfiguration().uiMode & 48) == 32 ? "night" : "normal");
    }

    private final void applyYRNAMapProps(YRNAMapProps data) {
        AMap map;
        UiSettings uiSettings;
        MapView mapView = this.mMapView;
        if (mapView != null && (map = mapView.getMap()) != null && (uiSettings = map.getUiSettings()) != null) {
            uiSettings.setZoomControlsEnabled(data.isZoomControlsEnabled());
            uiSettings.setCompassEnabled(data.isCompassEnabled());
            uiSettings.setRotateGesturesEnabled(data.isRotateGesturesEnabled());
            uiSettings.setZoomGesturesEnabled(data.isZoomGesturesEnabled());
            uiSettings.setScrollGesturesEnabled(data.isScrollGesturesEnabled());
            uiSettings.setTiltGesturesEnabled(data.isTiltGesturesEnabled());
            uiSettings.setMyLocationButtonEnabled(data.isMyLocationButtonEnabled());
            uiSettings.setIndoorSwitchEnabled(data.isIndoorSwitchEnabled());
            uiSettings.setZoomInByScreenCenter(data.isZoomInByScreenCenter());
            if (data.isAllGesturesEnabled() != null) {
                uiSettings.setAllGesturesEnabled(data.isAllGesturesEnabled().booleanValue());
            }
        }
        if (data.isCenterIconShow()) {
            ImageView imageView = this.mCenterMarker;
            if (imageView != null) {
                ViewExtKt.visible(imageView);
                return;
            }
            return;
        }
        ImageView imageView2 = this.mCenterMarker;
        if (imageView2 != null) {
            ViewExtKt.invisible(imageView2);
        }
    }

    private final void cleanOldMarkers(List<ClusterData> clusters, String token) {
        if (Intrinsics.areEqual(token, this.renderToken)) {
            Map<ClusterData, com.amap.api.maps.model.Marker> map = this.cacheMarkers;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<ClusterData, com.amap.api.maps.model.Marker> entry : map.entrySet()) {
                if (!clusters.contains(entry.getKey())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                ClusterData clusterData = (ClusterData) entry2.getKey();
                com.amap.api.maps.model.Marker marker = (com.amap.api.maps.model.Marker) entry2.getValue();
                this.cacheMarkers.remove(clusterData);
                this.cacheIcons.remove(marker);
                removeMarkerWithAnimation(marker);
            }
        }
    }

    private final List<Integer> findMatchingMarkerIds(LatLng targetPosition) {
        for (Map.Entry<LatLng, List<Integer>> entry : this.mMarkers.entrySet()) {
            LatLng key = entry.getKey();
            List<Integer> value = entry.getValue();
            int decimalPlaces = getDecimalPlaces(key.latitude);
            int decimalPlaces2 = getDecimalPlaces(key.longitude);
            int decimalPlaces3 = getDecimalPlaces(targetPosition.latitude);
            int decimalPlaces4 = getDecimalPlaces(targetPosition.longitude);
            double dAbs = Math.abs(targetPosition.latitude - key.latitude);
            double dAbs2 = Math.abs(targetPosition.longitude - key.longitude);
            boolean z = decimalPlaces == decimalPlaces3 && decimalPlaces2 == decimalPlaces4;
            if (!z) {
                decimalPlaces = Math.max(decimalPlaces - 1, 0);
            }
            double precisionTolerance = getPrecisionTolerance(decimalPlaces);
            if (!z) {
                decimalPlaces2 = Math.max(decimalPlaces2 - 1, 0);
            }
            double precisionTolerance2 = getPrecisionTolerance(decimalPlaces2);
            if (dAbs <= precisionTolerance && dAbs2 <= precisionTolerance2) {
                return value;
            }
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    private final int getDecimalPlaces(double d) {
        String strValueOf = String.valueOf(d);
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) strValueOf, '.', 0, false, 6, (Object) null);
        if (iIndexOf$default == -1) {
            return 0;
        }
        return (strValueOf.length() - iIndexOf$default) - 1;
    }

    private final double getPrecisionTolerance(int precision) {
        return Math.pow(10.0d, -precision);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void locationListener$lambda$3(YRNAMapView this$0, AMapLocation aMapLocation) {
        LatLng latLng;
        LatLng latLng2;
        LatLng latLng3;
        LatLng latLng4;
        AMap map;
        Projection projection;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        MapView mapView = this$0.mMapView;
        Double dValueOf = null;
        VisibleRegion visibleRegion = (mapView == null || (map = mapView.getMap()) == null || (projection = map.getProjection()) == null) ? null : projection.getVisibleRegion();
        YRNHelper yRNHelperExtKt = YRNHelperExtKt.getInstance(YRNHelper.INSTANCE);
        Pair[] pairArr = new Pair[21];
        pairArr[0] = TuplesKt.to("target", MapsKt__MapsKt.mapOf(TuplesKt.to("latitude", Double.valueOf(aMapLocation.getLatitude())), TuplesKt.to("longitude", Double.valueOf(aMapLocation.getLongitude()))));
        Pair[] pairArr2 = new Pair[2];
        pairArr2[0] = TuplesKt.to("latitude", (visibleRegion == null || (latLng4 = visibleRegion.farRight) == null) ? null : Double.valueOf(latLng4.latitude));
        pairArr2[1] = TuplesKt.to("longitude", (visibleRegion == null || (latLng3 = visibleRegion.farRight) == null) ? null : Double.valueOf(latLng3.longitude));
        pairArr[1] = TuplesKt.to("northEast", MapsKt__MapsKt.mapOf(pairArr2));
        Pair[] pairArr3 = new Pair[2];
        pairArr3[0] = TuplesKt.to("latitude", (visibleRegion == null || (latLng2 = visibleRegion.nearLeft) == null) ? null : Double.valueOf(latLng2.latitude));
        if (visibleRegion != null && (latLng = visibleRegion.nearLeft) != null) {
            dValueOf = Double.valueOf(latLng.longitude);
        }
        pairArr3[1] = TuplesKt.to("longitude", dValueOf);
        pairArr[2] = TuplesKt.to("southWest", MapsKt__MapsKt.mapOf(pairArr3));
        pairArr[3] = TuplesKt.to("altitude", Double.valueOf(aMapLocation.getAltitude()));
        pairArr[4] = TuplesKt.to("accuracy", Float.valueOf(aMapLocation.getAccuracy()));
        pairArr[5] = TuplesKt.to("bearing", Float.valueOf(aMapLocation.getBearing()));
        pairArr[6] = TuplesKt.to("speed", Float.valueOf(aMapLocation.getSpeed()));
        pairArr[7] = TuplesKt.to("coordType", aMapLocation.getCoordType());
        pairArr[8] = TuplesKt.to("country", aMapLocation.getCountry());
        pairArr[9] = TuplesKt.to("province", aMapLocation.getProvince());
        pairArr[10] = TuplesKt.to("city", aMapLocation.getCity());
        pairArr[11] = TuplesKt.to(DistrictSearchQuery.KEYWORDS_DISTRICT, aMapLocation.getDistrict());
        pairArr[12] = TuplesKt.to("street", aMapLocation.getStreet());
        pairArr[13] = TuplesKt.to("streetNum", aMapLocation.getStreetNum());
        pairArr[14] = TuplesKt.to(Home.JSON_KEY_ADDRESS, aMapLocation.getAddress());
        pairArr[15] = TuplesKt.to(TSMAuthContants.PARAM_CITYCODE, aMapLocation.getCityCode());
        pairArr[16] = TuplesKt.to("adCode", aMapLocation.getAdCode());
        pairArr[17] = TuplesKt.to("poiName", aMapLocation.getPoiName());
        pairArr[18] = TuplesKt.to("satellites", Integer.valueOf(aMapLocation.getSatellites()));
        pairArr[19] = TuplesKt.to(Constants.EXTRA_ERROR_MESSAGE, aMapLocation.getErrorInfo());
        pairArr[20] = TuplesKt.to("errorCode", Integer.valueOf(aMapLocation.getErrorCode()));
        yRNHelperExtKt.sendJSEvent("ON_MAP_LOCATION_CHANGE", MapsKt__MapsKt.mapOf(pairArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onMapClickListener$lambda$13(YRNAMapView this$0, LatLng latLng) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        YRNHelperExtKt.getInstance(YRNHelper.INSTANCE).sendJSEvent("ON_MAP_CLICK", MapsKt__MapsKt.emptyMap());
        Iterator<Map.Entry<ClusterData, com.amap.api.maps.model.Marker>> it = this$0.cacheMarkers.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                this$0.selectMarker = null;
                return;
            }
            com.amap.api.maps.model.Marker value = it.next().getValue();
            if (Intrinsics.areEqual(value, this$0.selectMarker)) {
                Pair<BitmapDescriptor, BitmapDescriptor> pair = this$0.cacheIcons.get(value);
                com.amap.api.maps.model.Marker marker = this$0.selectMarker;
                if (marker != null) {
                    marker.setIcon(pair != null ? pair.getFirst() : null);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onMapLoadedListener$lambda$4() {
        YRNHelperExtKt.getInstance(YRNHelper.INSTANCE).sendJSEvent("ON_MAP_LOADED", null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onMarkerClickListener$lambda$11(YRNAMapView this$0, com.amap.api.maps.model.Marker marker) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Iterator<Map.Entry<ClusterData, com.amap.api.maps.model.Marker>> it = this$0.cacheMarkers.entrySet().iterator();
        while (it.hasNext()) {
            com.amap.api.maps.model.Marker value = it.next().getValue();
            if (Intrinsics.areEqual(value, this$0.selectMarker)) {
                Pair<BitmapDescriptor, BitmapDescriptor> pair = this$0.cacheIcons.get(value);
                com.amap.api.maps.model.Marker marker2 = this$0.selectMarker;
                if (marker2 != null) {
                    marker2.setIcon(pair != null ? pair.getFirst() : null);
                }
            }
            if (Intrinsics.areEqual(value, marker)) {
                Pair<BitmapDescriptor, BitmapDescriptor> pair2 = this$0.cacheIcons.get(value);
                marker.setIcon(pair2 != null ? pair2.getSecond() : null);
            }
        }
        this$0.selectMarker = marker;
        LatLng position = marker.getPosition();
        Intrinsics.checkNotNull(position);
        return YRNHelperExtKt.getInstance(YRNHelper.INSTANCE).sendJSEvent("ON_MARKER_CLICK", MapsKt__MapsJVMKt.mapOf(TuplesKt.to("ids", this$0.findMatchingMarkerIds(position))));
    }

    private final void removeMarkerWithAnimation(com.amap.api.maps.model.Marker marker) {
        if (marker != null) {
            marker.remove();
        }
    }

    public final void addMarkers(@NotNull final List<ClusterData> clusters) {
        Intrinsics.checkNotNullParameter(clusters, "clusters");
        setOnMarkerClickListener();
        this.mMarkers.clear();
        final String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.renderToken = string;
        final AtomicInteger atomicInteger = new AtomicInteger(clusters.size());
        if (clusters.isEmpty()) {
            cleanOldMarkers(CollectionsKt__CollectionsKt.emptyList(), string);
            return;
        }
        for (final ClusterData clusterData : clusters) {
            List<MarkerProps> markers = clusterData.getMarkers();
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(markers, 10));
            Iterator<T> it = markers.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((MarkerProps) it.next()).getId()));
            }
            this.mMarkers.put(clusterData.getPosition().toLatLng(), arrayList);
            if (!this.cacheMarkers.containsKey(clusterData)) {
                CLusterUtils cLusterUtils = CLusterUtils.INSTANCE;
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                cLusterUtils.getMarker(context, clusterData, new Function3() { // from class: ztr
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        return YRNAMapView.addMarkers$lambda$7(this.f41671a, string, clusterData, atomicInteger, clusters, (MarkerOptions) obj, (BitmapDescriptor) obj2, (BitmapDescriptor) obj3);
                    }
                });
            } else if (atomicInteger.decrementAndGet() == 0) {
                cleanOldMarkers(clusters, string);
            }
        }
    }

    public final void animateCamera(@NotNull Coordinate coordinate, double zoom, int duration) {
        AMap map;
        Intrinsics.checkNotNullParameter(coordinate, "coordinate");
        MapView mapView = this.mMapView;
        if (mapView == null || (map = mapView.getMap()) == null) {
            return;
        }
        map.animateCamera(CameraUpdateFactory.newLatLngZoom(coordinate.toLatLng(), (float) zoom), duration, null);
    }

    public final void clearMap() {
        AMap map;
        MapView mapView = this.mMapView;
        if (mapView == null || (map = mapView.getMap()) == null) {
            return;
        }
        map.clear();
    }

    public final void moveCamera(@NotNull Coordinate coordinate, double zoom) {
        AMap map;
        Intrinsics.checkNotNullParameter(coordinate, "coordinate");
        MapView mapView = this.mMapView;
        if (mapView == null || (map = mapView.getMap()) == null) {
            return;
        }
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(coordinate.toLatLng(), (float) zoom));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        AMap map;
        super.onAttachedToWindow();
        View viewInflate = LayoutInflater.from(getContext()).inflate(uvi.f36190a, (ViewGroup) this, true);
        this.mMapView = (MapView) viewInflate.findViewById(nsi.i);
        this.mCenterMarker = (ImageView) viewInflate.findViewById(nsi.h);
        MapView mapView = this.mMapView;
        if (mapView != null) {
            mapView.onCreate(null);
        }
        setOnMapLoadedListener();
        setLocationListener();
        setOnCameraChangeListener();
        setOnMapClickListener();
        MapView mapView2 = this.mMapView;
        if (mapView2 != null && (map = mapView2.getMap()) != null) {
            map.setMyLocationEnabled(true);
        }
        YRNAMapProps yRNAMapProps = this.mapProps;
        if (yRNAMapProps != null) {
            Intrinsics.checkNotNull(yRNAMapProps);
            applyYRNAMapProps(yRNAMapProps);
        }
        MyLocationProps myLocationProps = this.myLocationProps;
        if (myLocationProps != null) {
            Intrinsics.checkNotNull(myLocationProps);
            applyMyLocationProps(myLocationProps);
        }
    }

    @Override // com.xiaomi.fitness.commonbase.data.sportmodel.view.BaseMapView
    public void onCreate(@Nullable Bundle bundle) {
        MapView mapView = this.mMapView;
        if (mapView != null) {
            mapView.onCreate(bundle);
        }
    }

    @Override // com.xiaomi.fitness.commonbase.data.sportmodel.view.BaseMapView
    public void onDestroy() {
        removeOnMapLoadedListener();
        removeOnCameraChangeListener();
        removeOnMapClickListener();
        MapView mapView = this.mMapView;
        if (mapView != null) {
            mapView.onDestroy();
        }
        AMapLocationClient aMapLocationClient = this.mLocationClient;
        if (aMapLocationClient != null) {
            aMapLocationClient.stopLocation();
        }
        AMapLocationClient aMapLocationClient2 = this.mLocationClient;
        if (aMapLocationClient2 != null) {
            aMapLocationClient2.stopAssistantLocation();
        }
        removeLocationListener();
        AMapLocationClient aMapLocationClient3 = this.mLocationClient;
        if (aMapLocationClient3 != null) {
            aMapLocationClient3.onDestroy();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeOnMapLoadedListener();
        removeOnCameraChangeListener();
        removeOnMapClickListener();
        MapView mapView = this.mMapView;
        if (mapView != null) {
            mapView.onDestroy();
        }
        AMapLocationClient aMapLocationClient = this.mLocationClient;
        if (aMapLocationClient != null) {
            aMapLocationClient.stopLocation();
        }
        AMapLocationClient aMapLocationClient2 = this.mLocationClient;
        if (aMapLocationClient2 != null) {
            aMapLocationClient2.stopAssistantLocation();
        }
        removeLocationListener();
        AMapLocationClient aMapLocationClient3 = this.mLocationClient;
        if (aMapLocationClient3 != null) {
            aMapLocationClient3.onDestroy();
        }
    }

    @Override // com.xiaomi.fitness.commonbase.data.sportmodel.view.BaseMapView
    public void onLowMemory() {
        MapView mapView = this.mMapView;
        if (mapView != null) {
            mapView.onLowMemory();
        }
    }

    @Override // com.xiaomi.fitness.commonbase.data.sportmodel.view.BaseMapView
    public void onPause() {
        MapView mapView = this.mMapView;
        if (mapView != null) {
            mapView.onPause();
        }
    }

    @Override // com.xiaomi.fitness.commonbase.data.sportmodel.view.BaseMapView
    public void onResume() {
        MapView mapView = this.mMapView;
        if (mapView != null) {
            mapView.onResume();
        }
    }

    @Override // com.xiaomi.fitness.commonbase.data.sportmodel.view.BaseMapView
    public void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        MapView mapView = this.mMapView;
        if (mapView != null) {
            mapView.onSaveInstanceState(outState);
        }
    }

    public final void removeLocationListener() {
        AMapLocationClient aMapLocationClient = this.mLocationClient;
        if (aMapLocationClient != null) {
            aMapLocationClient.unRegisterLocationListener(this.locationListener);
        }
    }

    public final void removeOnCameraChangeListener() {
        AMap map;
        MapView mapView = this.mMapView;
        if (mapView == null || (map = mapView.getMap()) == null) {
            return;
        }
        map.removeOnCameraChangeListener(this.onCameraChangeListener);
    }

    public final void removeOnMapClickListener() {
        AMap map;
        MapView mapView = this.mMapView;
        if (mapView == null || (map = mapView.getMap()) == null) {
            return;
        }
        map.removeOnMapClickListener(this.onMapClickListener);
    }

    public final void removeOnMapLoadedListener() {
        AMap map;
        MapView mapView = this.mMapView;
        if (mapView == null || (map = mapView.getMap()) == null) {
            return;
        }
        map.removeOnMapLoadedListener(this.onMapLoadedListener);
    }

    public final void runOnDrawFrame() {
        AMap map;
        MapView mapView = this.mMapView;
        if (mapView == null || (map = mapView.getMap()) == null) {
            return;
        }
        map.runOnDrawFrame();
    }

    public final void setLocationListener() {
        AMapLocationClient aMapLocationClient = this.mLocationClient;
        if (aMapLocationClient != null) {
            aMapLocationClient.setLocationListener(this.locationListener);
        }
    }

    public final void setMapStatusLimit(@NotNull Coordinate northeast, @NotNull Coordinate southwest) {
        AMap map;
        Intrinsics.checkNotNullParameter(northeast, "northeast");
        Intrinsics.checkNotNullParameter(southwest, "southwest");
        MapView mapView = this.mMapView;
        if (mapView == null || (map = mapView.getMap()) == null) {
            return;
        }
        map.setMapStatusLimits(new LatLngBounds(southwest.toLatLng(), northeast.toLatLng()));
    }

    public final void setMapType(@NotNull String type) {
        AMap map;
        int i;
        Intrinsics.checkNotNullParameter(type, "type");
        MapView mapView = this.mMapView;
        if (mapView == null || (map = mapView.getMap()) == null) {
            return;
        }
        if (Intrinsics.areEqual(type, "satellite")) {
            i = 2;
        } else {
            i = Intrinsics.areEqual(type, "night") ? 3 : 1;
        }
        map.setMapType(i);
    }

    public final void setMyLocationStyle(@NotNull MyLocationProps data) {
        Intrinsics.checkNotNullParameter(data, "data");
        if (this.mMapView == null) {
            this.myLocationProps = data;
        } else {
            applyMyLocationProps(data);
        }
    }

    public final void setOnCameraChangeListener() {
        AMap map;
        MapView mapView = this.mMapView;
        if (mapView == null || (map = mapView.getMap()) == null) {
            return;
        }
        map.setOnCameraChangeListener(this.onCameraChangeListener);
    }

    public final void setOnMapClickListener() {
        AMap map;
        MapView mapView = this.mMapView;
        if (mapView == null || (map = mapView.getMap()) == null) {
            return;
        }
        map.addOnMapClickListener(this.onMapClickListener);
    }

    public final void setOnMapLoadedListener() {
        AMap map;
        MapView mapView = this.mMapView;
        if (mapView == null || (map = mapView.getMap()) == null) {
            return;
        }
        map.setOnMapLoadedListener(this.onMapLoadedListener);
    }

    public final void setOnMarkerClickListener() {
        AMap map;
        MapView mapView = this.mMapView;
        if (mapView == null || (map = mapView.getMap()) == null) {
            return;
        }
        map.addOnMarkerClickListener(this.onMarkerClickListener);
    }

    public final void setTouchPoiEnable(boolean enable) {
        AMap map;
        MapView mapView = this.mMapView;
        if (mapView == null || (map = mapView.getMap()) == null) {
            return;
        }
        map.setTouchPoiEnable(enable);
    }

    public final void setUiSettings(@NotNull YRNAMapProps data) {
        Intrinsics.checkNotNullParameter(data, "data");
        if (this.mMapView == null) {
            this.mapProps = data;
        } else {
            applyYRNAMapProps(data);
        }
    }

    public final void startLocation(@NotNull LocationOption data) {
        AMapLocationClientOption.AMapLocationMode aMapLocationMode;
        Intrinsics.checkNotNullParameter(data, "data");
        AMapLocationClient aMapLocationClient = this.mLocationClient;
        if (aMapLocationClient != null) {
            AMapLocationClientOption aMapLocationClientOption = new AMapLocationClientOption();
            String locationMode = data.getLocationMode();
            if (Intrinsics.areEqual(locationMode, "batterySaving")) {
                aMapLocationMode = AMapLocationClientOption.AMapLocationMode.Battery_Saving;
            } else {
                aMapLocationMode = Intrinsics.areEqual(locationMode, "deviceSensors") ? AMapLocationClientOption.AMapLocationMode.Device_Sensors : AMapLocationClientOption.AMapLocationMode.Hight_Accuracy;
            }
            aMapLocationClientOption.setLocationMode(aMapLocationMode);
            aMapLocationClientOption.setInterval(data.getInterval());
            aMapLocationClientOption.setOnceLocation(data.isOnceLocation());
            aMapLocationClientOption.setLocationCacheEnable(data.isLocationCacheEnable());
            aMapLocationClientOption.setNeedAddress(data.isNeedAddress());
            aMapLocationClientOption.setGpsFirst(data.isGpsFirst());
            aMapLocationClientOption.setGpsFirstTimeout(data.getGpsFirstTimeout());
            aMapLocationClientOption.setSensorEnable(data.isSensorEnable());
            aMapLocationClientOption.setDeviceModeDistanceFilter(data.getDeviceModeDistanceFilter());
            aMapLocationClient.setLocationOption(aMapLocationClientOption);
        }
        AMapLocationClient aMapLocationClient2 = this.mLocationClient;
        if (aMapLocationClient2 != null) {
            aMapLocationClient2.startLocation();
        }
    }

    public final void stopAnimation() {
        AMap map;
        MapView mapView = this.mMapView;
        if (mapView == null || (map = mapView.getMap()) == null) {
            return;
        }
        map.stopAnimation();
    }

    @Override // com.xiaomi.fitness.commonbase.data.sportmodel.view.BaseMapView
    @NotNull
    public MapView getMapView() {
        MapView mapView = this.mMapView;
        Intrinsics.checkNotNull(mapView);
        return mapView;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public YRNAMapView(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public YRNAMapView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
