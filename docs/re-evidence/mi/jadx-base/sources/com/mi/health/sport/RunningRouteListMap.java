package com.mi.health.sport;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.TextView;
import androidx.lifecycle.MutableLiveData;
import com.amap.api.location.AMapLocation;
import com.amap.api.location.AMapLocationClient;
import com.amap.api.location.AMapLocationClientOption;
import com.amap.api.location.AMapLocationListener;
import com.amap.api.maps.AMap;
import com.amap.api.maps.CameraUpdateFactory;
import com.amap.api.maps.MapView;
import com.amap.api.maps.UiSettings;
import com.amap.api.maps.model.BitmapDescriptorFactory;
import com.amap.api.maps.model.CameraPosition;
import com.amap.api.maps.model.CustomMapStyleOptions;
import com.amap.api.maps.model.LatLng;
import com.amap.api.maps.model.LatLngBounds;
import com.amap.api.maps.model.Marker;
import com.amap.api.maps.model.MarkerOptions;
import com.amap.api.maps.model.MyLocationStyle;
import com.amap.api.maps.model.Polyline;
import com.amap.api.maps.model.PolylineOptions;
import com.amap.api.maps.model.animation.ScaleAnimation;
import com.mi.health.sport.RunningRouteListMap;
import com.mi.health.utils.MapUtilsKt;
import com.mibi.sdk.component.params.SdkContants;
import com.miui.tsmclient.net.TSMAuthContants;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.parser.sport.track.parser.ParserHelper;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.commonbase.data.sportmodel.view.BaseMapView;
import defpackage.bxa;
import defpackage.lqi;
import defpackage.qti;
import defpackage.vmi;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u0080\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0006\u0080\u0001\u0081\u0001\u0082\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\fB\u001b\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\rJ\u0012\u0010H\u001a\u00020I2\b\u0010J\u001a\u0004\u0018\u00010KH\u0016J\b\u0010L\u001a\u00020IH\u0002J\b\u0010M\u001a\u00020IH\u0016J\u0010\u0010N\u001a\u00020I2\u0006\u0010O\u001a\u00020KH\u0016J\b\u0010P\u001a\u00020IH\u0016J\b\u0010Q\u001a\u00020IH\u0016J\b\u0010R\u001a\u00020IH\u0016J\u0006\u0010^\u001a\u00020IJ\u0014\u0010_\u001a\u00020I2\f\u0010`\u001a\b\u0012\u0004\u0012\u00020&0aJ6\u0010b\u001a\u00020I2\f\u0010`\u001a\b\u0012\u0004\u0012\u0002050a2\f\u0010c\u001a\b\u0012\u0004\u0012\u0002010a2\u0012\u0010d\u001a\u000e\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020I0eJ\u001a\u0010k\u001a\u00020I2\u0012\u0010f\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020I0eJ\u0006\u0010l\u001a\u00020IJ:\u0010m\u001a\u00020I2\b\u0010n\u001a\u0004\u0018\u00010\u00142\u0006\u0010o\u001a\u0002052\u0006\u0010p\u001a\u0002012\u0006\u0010q\u001a\u00020\b2\u0006\u0010r\u001a\u0002012\u0006\u0010s\u001a\u000201H\u0002J\u0016\u0010t\u001a\u00020I2\f\u0010u\u001a\b\u0012\u0004\u0012\u0002050aH\u0002J\b\u0010z\u001a\u00020IH\u0002J\b\u0010{\u001a\u00020IH\u0002J\b\u0010|\u001a\u00020IH\u0002J\u0016\u0010}\u001a\u00020I2\f\u0010~\u001a\b\u0012\u0004\u0012\u0002050aH\u0002J\b\u0010\u007f\u001a\u00020IH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u00020\u0002X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020 X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010!\"\u0004\b\"\u0010#R\"\u0010$\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010%X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R \u0010+\u001a\b\u0012\u0004\u0012\u00020,0%X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010(\"\u0004\b.\u0010*R\u001d\u0010/\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020&00¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u001d\u00104\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020500¢\u0006\b\n\u0000\u001a\u0004\b6\u00103R\u000e\u00107\u001a\u000208X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u00109\u001a\u0004\u0018\u00010:X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010;\u001a\u0004\u0018\u00010<X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010=\u001a\u0004\u0018\u00010>X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020 X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010@\u001a\u00020AX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010B\u001a\u00020AX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010C\u001a\u000201X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010D\u001a\u0004\u0018\u000105X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010E\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010F\u001a\u00020 X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010G\u001a\u00020 X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010S\u001a\u00020\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bT\u0010\u0010R\"\u0010U\u001a\n\u0012\u0004\u0012\u00020I\u0018\u00010VX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\"\u0010[\u001a\n\u0012\u0004\u0012\u00020I\u0018\u00010VX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\\\u0010X\"\u0004\b]\u0010ZR(\u0010f\u001a\u0010\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020I\u0018\u00010eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR\u000e\u0010v\u001a\u00020wX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010x\u001a\u00020yX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0083\u0001"}, d2 = {"Lcom/mi/health/sport/RunningRouteListMap;", "Lcom/xiaomi/fitness/commonbase/data/sportmodel/view/BaseMapView;", "Lcom/amap/api/maps/MapView;", "mContext", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "context", "(Landroid/content/Context;)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "mMapView", "getMMapView", "()Lcom/amap/api/maps/MapView;", "setMMapView", "(Lcom/amap/api/maps/MapView;)V", "curMarker", "Lcom/amap/api/maps/model/Marker;", "getCurMarker", "()Lcom/amap/api/maps/model/Marker;", "setCurMarker", "(Lcom/amap/api/maps/model/Marker;)V", "addPolyline", "Lcom/amap/api/maps/model/Polyline;", "getAddPolyline", "()Lcom/amap/api/maps/model/Polyline;", "setAddPolyline", "(Lcom/amap/api/maps/model/Polyline;)V", "isFirstLocation", "", "()Z", "setFirstLocation", "(Z)V", "routeSelectLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/mi/health/sport/RunningRouteListMap$MarkerModel;", "getRouteSelectLiveData", "()Landroidx/lifecycle/MutableLiveData;", "setRouteSelectLiveData", "(Landroidx/lifecycle/MutableLiveData;)V", "locationData", "Lcom/mi/health/sport/RunningRouteListMap$LocationData;", "getLocationData", "setLocationData", "map", "", "", "getMap", "()Ljava/util/Map;", "cityMap", "Lcom/amap/api/maps/model/LatLng;", "getCityMap", "mLocationClient", "Lcom/amap/api/location/AMapLocationClient;", "mLocationListener", "Lcom/amap/api/location/AMapLocationListener;", "scaleGestureDetector", "Landroid/view/ScaleGestureDetector;", "gestureDetector", "Landroid/view/GestureDetector;", "isFirstSelectMarker", "markerSelectTime", "", "setMarkersTime", "selectMarkerText", "curLocationdata", "locationMarker", "smallMapZoom", "isClickCityMarker", "onCreate", "", SdkContants.KEY_BUNDLE, "Landroid/os/Bundle;", "mapConfig", LifecycleConstantKt.ON_RESUME, "onSaveInstanceState", "outState", LifecycleConstantKt.ON_PAUSE, LifecycleConstantKt.ON_DESTROY, "onLowMemory", "mapView", "getMapView", "dismissBottomCard", "Lkotlin/Function0;", "getDismissBottomCard", "()Lkotlin/jvm/functions/Function0;", "setDismissBottomCard", "(Lkotlin/jvm/functions/Function0;)V", "showBottomCard", "getShowBottomCard", "setShowBottomCard", "startLocation", "setMarkers", "markerList", "", "setCityMarker", "markerContentList", "onMarkerClick", "Lkotlin/Function1;", "onCameraChange", "getOnCameraChange", "()Lkotlin/jvm/functions/Function1;", "setOnCameraChange", "(Lkotlin/jvm/functions/Function1;)V", "setOnCameraChangeListener", "clearMap", "selectMarker", "marker", "markerLocation", "routeUrl", "routeId", "name", "suffix", "drawPreLine", "latLngList", "scaleGestureDetectorListener", "Landroid/view/ScaleGestureDetector$OnScaleGestureListener;", "gestureDetectorListener", "Landroid/view/GestureDetector$SimpleOnGestureListener;", "cancelSelectMarker", "setListener", "showLocationMarker", "buildRouteVisibleBounds", "list", "setCustomMapStyle", "Companion", "MarkerModel", "LocationData", "map-amap_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRunningRouteListMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RunningRouteListMap.kt\ncom/mi/health/sport/RunningRouteListMap\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,489:1\n1#2:490\n*E\n"})
public final class RunningRouteListMap extends BaseMapView<MapView> {

    @NotNull
    public static final String TAG = "RunningRouteListMap";

    @Nullable
    private Polyline addPolyline;

    @NotNull
    private final Map<String, LatLng> cityMap;

    @Nullable
    private LatLng curLocationdata;

    @Nullable
    private Marker curMarker;

    @Nullable
    private Function0<Unit> dismissBottomCard;

    @Nullable
    private GestureDetector gestureDetector;

    @NotNull
    private final GestureDetector.SimpleOnGestureListener gestureDetectorListener;
    private boolean isClickCityMarker;
    private boolean isFirstLocation;
    private boolean isFirstSelectMarker;

    @NotNull
    private MutableLiveData<LocationData> locationData;

    @Nullable
    private Marker locationMarker;

    @NotNull
    private final Context mContext;

    @NotNull
    private final AMapLocationClient mLocationClient;

    @Nullable
    private AMapLocationListener mLocationListener;

    @NotNull
    private MapView mMapView;

    @NotNull
    private final Map<String, MarkerModel> map;
    private long markerSelectTime;

    @Nullable
    private Function1<? super Boolean, Unit> onCameraChange;

    @Nullable
    private MutableLiveData<MarkerModel> routeSelectLiveData;

    @Nullable
    private ScaleGestureDetector scaleGestureDetector;

    @NotNull
    private final ScaleGestureDetector.OnScaleGestureListener scaleGestureDetectorListener;

    @NotNull
    private String selectMarkerText;
    private long setMarkersTime;

    @Nullable
    private Function0<Unit> showBottomCard;
    private boolean smallMapZoom;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u001b"}, d2 = {"Lcom/mi/health/sport/RunningRouteListMap$LocationData;", "", "longitude", "", "latitude", "city", "", TSMAuthContants.PARAM_CITYCODE, "<init>", "(DDLjava/lang/String;Ljava/lang/String;)V", "getLongitude", "()D", "getLatitude", "getCity", "()Ljava/lang/String;", "getCityCode", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "map-amap_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LocationData {

        @NotNull
        private final String city;

        @NotNull
        private final String cityCode;
        private final double latitude;
        private final double longitude;

        public LocationData(double d, double d2, @NotNull String city, @NotNull String cityCode) {
            Intrinsics.checkNotNullParameter(city, "city");
            Intrinsics.checkNotNullParameter(cityCode, "cityCode");
            this.longitude = d;
            this.latitude = d2;
            this.city = city;
            this.cityCode = cityCode;
        }

        public static /* synthetic */ LocationData copy$default(LocationData locationData, double d, double d2, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                d = locationData.longitude;
            }
            double d3 = d;
            if ((i & 2) != 0) {
                d2 = locationData.latitude;
            }
            double d4 = d2;
            if ((i & 4) != 0) {
                str = locationData.city;
            }
            String str3 = str;
            if ((i & 8) != 0) {
                str2 = locationData.cityCode;
            }
            return locationData.copy(d3, d4, str3, str2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final double getLongitude() {
            return this.longitude;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final double getLatitude() {
            return this.latitude;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getCity() {
            return this.city;
        }

        @NotNull
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getCityCode() {
            return this.cityCode;
        }

        @NotNull
        public final LocationData copy(double longitude, double latitude, @NotNull String city, @NotNull String cityCode) {
            Intrinsics.checkNotNullParameter(city, "city");
            Intrinsics.checkNotNullParameter(cityCode, "cityCode");
            return new LocationData(longitude, latitude, city, cityCode);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LocationData)) {
                return false;
            }
            LocationData locationData = (LocationData) other;
            return Double.compare(this.longitude, locationData.longitude) == 0 && Double.compare(this.latitude, locationData.latitude) == 0 && Intrinsics.areEqual(this.city, locationData.city) && Intrinsics.areEqual(this.cityCode, locationData.cityCode);
        }

        @NotNull
        public final String getCity() {
            return this.city;
        }

        @NotNull
        public final String getCityCode() {
            return this.cityCode;
        }

        public final double getLatitude() {
            return this.latitude;
        }

        public final double getLongitude() {
            return this.longitude;
        }

        public int hashCode() {
            return (((((Double.hashCode(this.longitude) * 31) + Double.hashCode(this.latitude)) * 31) + this.city.hashCode()) * 31) + this.cityCode.hashCode();
        }

        @NotNull
        public String toString() {
            return "LocationData(longitude=" + this.longitude + ", latitude=" + this.latitude + ", city=" + this.city + ", cityCode=" + this.cityCode + ")";
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b*\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001Bo\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0006\u0012\u0006\u0010\u0011\u001a\u00020\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0006HÆ\u0003J\t\u0010'\u001a\u00020\bHÆ\u0003J\t\u0010(\u001a\u00020\bHÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\bHÆ\u0003J\t\u0010+\u001a\u00020\bHÆ\u0003J\t\u0010,\u001a\u00020\u0006HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0006HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\u008b\u0001\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u0003HÆ\u0001J\u0013\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00105\u001a\u00020\u0006HÖ\u0001J\t\u00106\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0011\u0010\f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u0011\u0010\r\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0015R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0015R\u0011\u0010\u0010\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0018R\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0015¨\u00067"}, d2 = {"Lcom/mi/health/sport/RunningRouteListMap$MarkerModel;", "", "name", "", "routeUrl", "routeId", "", "longitude", "", "latitude", "icon", "length", "distance", "category", "titleName", "traceFileUrl", "heat", "fileSuffix", "<init>", "(Ljava/lang/String;Ljava/lang/String;IDDLjava/lang/String;DDILjava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "getName", "()Ljava/lang/String;", "getRouteUrl", "getRouteId", "()I", "getLongitude", "()D", "getLatitude", "getIcon", "getLength", "getDistance", "getCategory", "getTitleName", "getTraceFileUrl", "getHeat", "getFileSuffix", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "equals", "", "other", "hashCode", "toString", "map-amap_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MarkerModel {
        private final int category;
        private final double distance;

        @NotNull
        private final String fileSuffix;
        private final int heat;

        @NotNull
        private final String icon;
        private final double latitude;
        private final double length;
        private final double longitude;

        @NotNull
        private final String name;
        private final int routeId;

        @NotNull
        private final String routeUrl;

        @NotNull
        private final String titleName;

        @NotNull
        private final String traceFileUrl;

        public MarkerModel(@NotNull String name, @NotNull String routeUrl, int i, double d, double d2, @NotNull String icon, double d3, double d4, int i2, @NotNull String titleName, @NotNull String traceFileUrl, int i3, @NotNull String fileSuffix) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(routeUrl, "routeUrl");
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(titleName, "titleName");
            Intrinsics.checkNotNullParameter(traceFileUrl, "traceFileUrl");
            Intrinsics.checkNotNullParameter(fileSuffix, "fileSuffix");
            this.name = name;
            this.routeUrl = routeUrl;
            this.routeId = i;
            this.longitude = d;
            this.latitude = d2;
            this.icon = icon;
            this.length = d3;
            this.distance = d4;
            this.category = i2;
            this.titleName = titleName;
            this.traceFileUrl = traceFileUrl;
            this.heat = i3;
            this.fileSuffix = fileSuffix;
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        @NotNull
        /* JADX INFO: renamed from: component10, reason: from getter */
        public final String getTitleName() {
            return this.titleName;
        }

        @NotNull
        /* JADX INFO: renamed from: component11, reason: from getter */
        public final String getTraceFileUrl() {
            return this.traceFileUrl;
        }

        /* JADX INFO: renamed from: component12, reason: from getter */
        public final int getHeat() {
            return this.heat;
        }

        @NotNull
        /* JADX INFO: renamed from: component13, reason: from getter */
        public final String getFileSuffix() {
            return this.fileSuffix;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getRouteUrl() {
            return this.routeUrl;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getRouteId() {
            return this.routeId;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final double getLongitude() {
            return this.longitude;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final double getLatitude() {
            return this.latitude;
        }

        @NotNull
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getIcon() {
            return this.icon;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final double getLength() {
            return this.length;
        }

        /* JADX INFO: renamed from: component8, reason: from getter */
        public final double getDistance() {
            return this.distance;
        }

        /* JADX INFO: renamed from: component9, reason: from getter */
        public final int getCategory() {
            return this.category;
        }

        @NotNull
        public final MarkerModel copy(@NotNull String name, @NotNull String routeUrl, int routeId, double longitude, double latitude, @NotNull String icon, double length, double distance, int category, @NotNull String titleName, @NotNull String traceFileUrl, int heat, @NotNull String fileSuffix) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(routeUrl, "routeUrl");
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(titleName, "titleName");
            Intrinsics.checkNotNullParameter(traceFileUrl, "traceFileUrl");
            Intrinsics.checkNotNullParameter(fileSuffix, "fileSuffix");
            return new MarkerModel(name, routeUrl, routeId, longitude, latitude, icon, length, distance, category, titleName, traceFileUrl, heat, fileSuffix);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MarkerModel)) {
                return false;
            }
            MarkerModel markerModel = (MarkerModel) other;
            return Intrinsics.areEqual(this.name, markerModel.name) && Intrinsics.areEqual(this.routeUrl, markerModel.routeUrl) && this.routeId == markerModel.routeId && Double.compare(this.longitude, markerModel.longitude) == 0 && Double.compare(this.latitude, markerModel.latitude) == 0 && Intrinsics.areEqual(this.icon, markerModel.icon) && Double.compare(this.length, markerModel.length) == 0 && Double.compare(this.distance, markerModel.distance) == 0 && this.category == markerModel.category && Intrinsics.areEqual(this.titleName, markerModel.titleName) && Intrinsics.areEqual(this.traceFileUrl, markerModel.traceFileUrl) && this.heat == markerModel.heat && Intrinsics.areEqual(this.fileSuffix, markerModel.fileSuffix);
        }

        public final int getCategory() {
            return this.category;
        }

        public final double getDistance() {
            return this.distance;
        }

        @NotNull
        public final String getFileSuffix() {
            return this.fileSuffix;
        }

        public final int getHeat() {
            return this.heat;
        }

        @NotNull
        public final String getIcon() {
            return this.icon;
        }

        public final double getLatitude() {
            return this.latitude;
        }

        public final double getLength() {
            return this.length;
        }

        public final double getLongitude() {
            return this.longitude;
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        public final int getRouteId() {
            return this.routeId;
        }

        @NotNull
        public final String getRouteUrl() {
            return this.routeUrl;
        }

        @NotNull
        public final String getTitleName() {
            return this.titleName;
        }

        @NotNull
        public final String getTraceFileUrl() {
            return this.traceFileUrl;
        }

        public int hashCode() {
            return (((((((((((((((((((((((this.name.hashCode() * 31) + this.routeUrl.hashCode()) * 31) + Integer.hashCode(this.routeId)) * 31) + Double.hashCode(this.longitude)) * 31) + Double.hashCode(this.latitude)) * 31) + this.icon.hashCode()) * 31) + Double.hashCode(this.length)) * 31) + Double.hashCode(this.distance)) * 31) + Integer.hashCode(this.category)) * 31) + this.titleName.hashCode()) * 31) + this.traceFileUrl.hashCode()) * 31) + Integer.hashCode(this.heat)) * 31) + this.fileSuffix.hashCode();
        }

        @NotNull
        public String toString() {
            return "MarkerModel(name=" + this.name + ", routeUrl=" + this.routeUrl + ", routeId=" + this.routeId + ", longitude=" + this.longitude + ", latitude=" + this.latitude + ", icon=" + this.icon + ", length=" + this.length + ", distance=" + this.distance + ", category=" + this.category + ", titleName=" + this.titleName + ", traceFileUrl=" + this.traceFileUrl + ", heat=" + this.heat + ", fileSuffix=" + this.fileSuffix + ")";
        }
    }

    /* JADX INFO: renamed from: com.mi.health.sport.RunningRouteListMap$selectMarker$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.mi.health.sport.RunningRouteListMap$selectMarker$2", f = "RunningRouteListMap.kt", i = {}, l = {314}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ LatLng $markerLocation;
        final /* synthetic */ int $routeId;
        final /* synthetic */ String $routeUrl;
        final /* synthetic */ String $suffix;
        int label;
        final /* synthetic */ RunningRouteListMap this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, String str2, int i, RunningRouteListMap runningRouteListMap, LatLng latLng, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$suffix = str;
            this.$routeUrl = str2;
            this.$routeId = i;
            this.this$0 = runningRouteListMap;
            this.$markerLocation = latLng;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$suffix, this.$routeUrl, this.$routeId, this.this$0, this.$markerLocation, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                RunningRouteListMap$selectMarker$2$routeByteData$1 runningRouteListMap$selectMarker$2$routeByteData$1 = new RunningRouteListMap$selectMarker$2$routeByteData$1(this.$routeUrl, this.$routeId, null);
                this.label = 1;
                obj = BuildersKt.withContext(io2, runningRouteListMap$selectMarker$2$routeByteData$1, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            List<LatLng> listCreateTrackLatLngList = MapUtilsKt.createTrackLatLngList((List) ParserHelper.readTrackFile$default(ParserHelper.INSTANCE, null, (byte[]) obj, this.$suffix, 1, null).getFirst());
            RunningRouteListMap runningRouteListMap = this.this$0;
            LatLng latLng = this.$markerLocation;
            runningRouteListMap.drawPreLine(listCreateTrackLatLngList);
            if (runningRouteListMap.isFirstSelectMarker) {
                runningRouteListMap.getMapView().getMap().animateCamera(CameraUpdateFactory.newLatLng(latLng));
                runningRouteListMap.getMapView().getMap().moveCamera(CameraUpdateFactory.zoomTo(runningRouteListMap.isClickCityMarker ? 11.0f : 15.0f));
            } else {
                runningRouteListMap.buildRouteVisibleBounds(listCreateTrackLatLngList);
            }
            runningRouteListMap.isFirstSelectMarker = false;
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RunningRouteListMap(@NotNull Context mContext, @Nullable AttributeSet attributeSet, int i) {
        super(mContext, attributeSet, i);
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        this.mContext = mContext;
        this.isFirstLocation = true;
        this.routeSelectLiveData = new MutableLiveData<>();
        this.locationData = new MutableLiveData<>();
        this.map = new HashMap();
        this.cityMap = new HashMap();
        this.mLocationClient = new AMapLocationClient(AppUtil.getApp());
        this.isFirstSelectMarker = true;
        this.selectMarkerText = "";
        this.smallMapZoom = true;
        AMapLocationClient.updatePrivacyShow(AppUtil.getApp(), true, true);
        AMapLocationClient.updatePrivacyAgree(AppUtil.getApp(), true);
        this.mMapView = (MapView) LayoutInflater.from(getContext()).inflate(qti.f31831b, this).findViewById(lqi.c);
        this.scaleGestureDetectorListener = new ScaleGestureDetector.OnScaleGestureListener() { // from class: com.mi.health.sport.RunningRouteListMap$scaleGestureDetectorListener$1
            @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
            public boolean onScale(ScaleGestureDetector detector) {
                Intrinsics.checkNotNullParameter(detector, "detector");
                Logger.d("RunningRouteListMap", "onScale");
                return false;
            }

            @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
            public boolean onScaleBegin(ScaleGestureDetector detector) {
                Intrinsics.checkNotNullParameter(detector, "detector");
                Logger.d("RunningRouteListMap", "onScaleBegin");
                return false;
            }

            @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
            public void onScaleEnd(ScaleGestureDetector detector) {
                Intrinsics.checkNotNullParameter(detector, "detector");
                Logger.d("RunningRouteListMap", "onScaleEnd");
            }
        };
        this.gestureDetectorListener = new GestureDetector.SimpleOnGestureListener() { // from class: com.mi.health.sport.RunningRouteListMap$gestureDetectorListener$1
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public boolean onSingleTapConfirmed(MotionEvent e) {
                Intrinsics.checkNotNullParameter(e, "e");
                Logger.d("RunningRouteListMap", "onSingleTapConfirmed , curMarker:" + this.this$0.getCurMarker());
                if (System.currentTimeMillis() - this.this$0.markerSelectTime <= 500) {
                    return false;
                }
                this.this$0.cancelSelectMarker();
                Function0<Unit> dismissBottomCard = this.this$0.getDismissBottomCard();
                if (dismissBottomCard == null) {
                    return false;
                }
                dismissBottomCard.invoke();
                return false;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void buildRouteVisibleBounds(List<LatLng> list) {
        LatLngBounds.Builder builder = LatLngBounds.builder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            builder.include(list.get(i));
        }
        getMapView().getMap().animateCamera(CameraUpdateFactory.newLatLngBounds(builder.build(), 150));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cancelSelectMarker() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.3f, 1.0f, 1.3f, 1.0f);
        scaleAnimation.setDuration(500L);
        scaleAnimation.setInterpolator(new OvershootInterpolator());
        scaleAnimation.setFillMode(0);
        View viewInflate = LayoutInflater.from(getContext()).inflate(qti.f, (ViewGroup) null);
        ((TextView) viewInflate.findViewById(lqi.d)).setText(this.selectMarkerText);
        Marker marker = this.curMarker;
        if (marker != null) {
            marker.setIcon(BitmapDescriptorFactory.fromView(viewInflate));
        }
        Marker marker2 = this.curMarker;
        if (marker2 != null) {
            marker2.setAnimation(scaleAnimation);
        }
        Marker marker3 = this.curMarker;
        if (marker3 != null) {
            marker3.startAnimation();
        }
        Polyline polyline = this.addPolyline;
        if (polyline != null) {
            polyline.remove();
        }
        this.curMarker = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void drawPreLine(List<LatLng> latLngList) {
        this.addPolyline = getMapView().getMap().addPolyline(new PolylineOptions().addAll(latLngList).width(DisplayUtil.INSTANCE.dip2pxF(6.0f)).color(Color.parseColor("#FF612E")));
    }

    private final void mapConfig() {
        AMap map = this.mMapView.getMap();
        UiSettings uiSettings = map.getUiSettings();
        uiSettings.setZoomControlsEnabled(false);
        uiSettings.setCompassEnabled(false);
        uiSettings.setCompassEnabled(false);
        uiSettings.setRotateGesturesEnabled(true);
        uiSettings.setTiltGesturesEnabled(false);
        map.moveCamera(CameraUpdateFactory.zoomTo(15.0f));
        this.smallMapZoom = true;
        setCustomMapStyle();
    }

    private final void selectMarker(Marker marker, LatLng markerLocation, String routeUrl, int routeId, String name, String suffix) {
        this.markerSelectTime = System.currentTimeMillis();
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 1.3f, 1.0f, 1.3f);
        scaleAnimation.setDuration(500L);
        scaleAnimation.setInterpolator(new OvershootInterpolator());
        scaleAnimation.setFillMode(0);
        View viewInflate = LayoutInflater.from(getContext()).inflate(qti.g, (ViewGroup) null);
        ((TextView) viewInflate.findViewById(lqi.d)).setText(name);
        if (marker != null) {
            marker.setIcon(BitmapDescriptorFactory.fromView(viewInflate));
        }
        if (marker != null) {
            marker.setAnimation(scaleAnimation);
        }
        if (marker != null) {
            marker.startAnimation();
        }
        Function0<Unit> function0 = this.showBottomCard;
        if (function0 != null) {
            function0.invoke();
        }
        cancelSelectMarker();
        this.curMarker = marker;
        this.selectMarkerText = name;
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new AnonymousClass2(suffix, routeUrl, routeId, this, markerLocation, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setCityMarker$lambda$6(RunningRouteListMap this$0, Function1 onMarkerClick, Marker marker) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(onMarkerClick, "$onMarkerClick");
        LatLng latLng = this$0.cityMap.get(marker.getId());
        if (latLng != null) {
            this$0.isClickCityMarker = true;
            onMarkerClick.invoke2(latLng);
        }
        return true;
    }

    private final void setCustomMapStyle() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        String str = UIUtils.isNightMode(context) ? MapUtilsKt.MAP_STYLE_RES_ID_DARK_STYLE : MapUtilsKt.MAP_STYLE_RES_ID_LIGHT_STYLE;
        CustomMapStyleOptions customMapStyleOptions = new CustomMapStyleOptions();
        customMapStyleOptions.setEnable(true);
        customMapStyleOptions.setStyleId(str);
        getMapView().getMap().setCustomMapStyle(customMapStyleOptions);
    }

    private final void setListener() {
        this.mMapView.getMap().setOnMapTouchListener(new AMap.OnMapTouchListener() { // from class: r4l
            @Override // com.amap.api.maps.AMap.OnMapTouchListener
            public final void onTouch(MotionEvent motionEvent) {
                RunningRouteListMap.setListener$lambda$10(this.f32184a, motionEvent);
            }
        });
        this.mLocationListener = new AMapLocationListener() { // from class: s4l
            @Override // com.amap.api.location.AMapLocationListener
            public final void onLocationChanged(AMapLocation aMapLocation) {
                RunningRouteListMap.setListener$lambda$11(this.f33285a, aMapLocation);
            }
        };
        this.mMapView.getMap().setOnCameraChangeListener(new AMap.OnCameraChangeListener() { // from class: com.mi.health.sport.RunningRouteListMap.setListener.3
            @Override // com.amap.api.maps.AMap.OnCameraChangeListener
            public void onCameraChange(CameraPosition position) {
                Intrinsics.checkNotNullParameter(position, "position");
                FitnessLogUtils.d("RunningRouteListMap", "onCameraChange,position:" + position + ",zoom:" + position.zoom);
            }

            @Override // com.amap.api.maps.AMap.OnCameraChangeListener
            public void onCameraChangeFinish(CameraPosition position) {
                Intrinsics.checkNotNullParameter(position, "position");
                FitnessLogUtils.d("RunningRouteListMap", "onCameraChangeFinish,position:" + position + ",zoom:" + position.zoom);
                float f = position.zoom;
                Function1<Boolean, Unit> onCameraChange = RunningRouteListMap.this.getOnCameraChange();
                if (onCameraChange != null) {
                    RunningRouteListMap runningRouteListMap = RunningRouteListMap.this;
                    if (f > 10.0f && !runningRouteListMap.smallMapZoom) {
                        runningRouteListMap.smallMapZoom = true;
                        onCameraChange.invoke2(Boolean.TRUE);
                    } else {
                        if (f > 10.0f || !runningRouteListMap.smallMapZoom) {
                            return;
                        }
                        runningRouteListMap.smallMapZoom = false;
                        onCameraChange.invoke2(Boolean.FALSE);
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$10(RunningRouteListMap this$0, MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ScaleGestureDetector scaleGestureDetector = this$0.scaleGestureDetector;
        if (scaleGestureDetector != null) {
            scaleGestureDetector.onTouchEvent(motionEvent);
        }
        GestureDetector gestureDetector = this$0.gestureDetector;
        if (gestureDetector != null) {
            gestureDetector.onTouchEvent(motionEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$11(RunningRouteListMap this$0, AMapLocation aMapLocation) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        double[] dArrB = bxa.b(aMapLocation.getLatitude(), aMapLocation.getLongitude());
        double d = dArrB[1];
        double d2 = dArrB[0];
        String city = aMapLocation.getCity();
        Intrinsics.checkNotNullExpressionValue(city, "getCity(...)");
        String cityCode = aMapLocation.getCityCode();
        Intrinsics.checkNotNullExpressionValue(cityCode, "getCityCode(...)");
        LocationData locationData = new LocationData(d, d2, city, cityCode);
        this$0.curLocationdata = new LatLng(aMapLocation.getLatitude(), aMapLocation.getLongitude());
        this$0.showLocationMarker();
        this$0.getMapView().getMap().moveCamera(CameraUpdateFactory.newLatLng(this$0.curLocationdata));
        Logger.i("RunningRouteListMap", "isFirstLocation:" + this$0.isFirstLocation + " , data:" + locationData);
        if (this$0.isFirstLocation) {
            this$0.locationData.postValue(locationData);
            this$0.isFirstLocation = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setMarkers$lambda$4(RunningRouteListMap this$0, Marker marker) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.d("RunningRouteListMap", "setOnMarkerClickListener , marker:" + marker);
        MarkerModel markerModel = this$0.map.get(marker.getId());
        if (markerModel == null) {
            return true;
        }
        MutableLiveData<MarkerModel> mutableLiveData = this$0.routeSelectLiveData;
        if (mutableLiveData != null) {
            mutableLiveData.postValue(markerModel);
        }
        LatLng position = marker.getPosition();
        Intrinsics.checkNotNullExpressionValue(position, "getPosition(...)");
        this$0.selectMarker(marker, position, markerModel.getRouteUrl(), markerModel.getRouteId(), markerModel.getName(), markerModel.getFileSuffix());
        return true;
    }

    private final void showLocationMarker() {
        Marker marker = this.locationMarker;
        if (marker != null) {
            marker.remove();
        }
        this.locationMarker = getMapView().getMap().addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.fromResource(vmi.c)).position(this.curLocationdata));
    }

    public final void clearMap() {
        this.mMapView.getMap().clear();
    }

    @Nullable
    public final Polyline getAddPolyline() {
        return this.addPolyline;
    }

    @NotNull
    public final Map<String, LatLng> getCityMap() {
        return this.cityMap;
    }

    @Nullable
    public final Marker getCurMarker() {
        return this.curMarker;
    }

    @Nullable
    public final Function0<Unit> getDismissBottomCard() {
        return this.dismissBottomCard;
    }

    @NotNull
    public final MutableLiveData<LocationData> getLocationData() {
        return this.locationData;
    }

    @NotNull
    public final MapView getMMapView() {
        return this.mMapView;
    }

    @NotNull
    public final Map<String, MarkerModel> getMap() {
        return this.map;
    }

    @Nullable
    public final Function1<Boolean, Unit> getOnCameraChange() {
        return this.onCameraChange;
    }

    @Nullable
    public final MutableLiveData<MarkerModel> getRouteSelectLiveData() {
        return this.routeSelectLiveData;
    }

    @Nullable
    public final Function0<Unit> getShowBottomCard() {
        return this.showBottomCard;
    }

    /* JADX INFO: renamed from: isFirstLocation, reason: from getter */
    public final boolean getIsFirstLocation() {
        return this.isFirstLocation;
    }

    @Override // com.xiaomi.fitness.commonbase.data.sportmodel.view.BaseMapView
    public void onCreate(@Nullable Bundle bundle) {
        this.mMapView.onCreate(bundle);
        mapConfig();
        setListener();
        this.scaleGestureDetector = new ScaleGestureDetector(getContext(), this.scaleGestureDetectorListener);
        this.gestureDetector = new GestureDetector(getContext(), this.gestureDetectorListener);
    }

    @Override // com.xiaomi.fitness.commonbase.data.sportmodel.view.BaseMapView
    public void onDestroy() {
        this.mMapView.onDestroy();
        this.map.clear();
        this.mLocationListener = null;
        this.mLocationClient.setLocationListener(null);
        this.mLocationClient.stopLocation();
        this.mLocationClient.onDestroy();
    }

    @Override // com.xiaomi.fitness.commonbase.data.sportmodel.view.BaseMapView
    public void onLowMemory() {
        this.mMapView.onLowMemory();
    }

    @Override // com.xiaomi.fitness.commonbase.data.sportmodel.view.BaseMapView
    public void onPause() {
        this.mMapView.onPause();
        this.mLocationClient.stopLocation();
    }

    @Override // com.xiaomi.fitness.commonbase.data.sportmodel.view.BaseMapView
    public void onResume() {
        this.mMapView.onResume();
    }

    @Override // com.xiaomi.fitness.commonbase.data.sportmodel.view.BaseMapView
    public void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        this.mMapView.onSaveInstanceState(outState);
    }

    public final void setAddPolyline(@Nullable Polyline polyline) {
        this.addPolyline = polyline;
    }

    public final void setCityMarker(@NotNull List<LatLng> markerList, @NotNull List<String> markerContentList, @NotNull final Function1<? super LatLng, Unit> onMarkerClick) {
        Intrinsics.checkNotNullParameter(markerList, "markerList");
        Intrinsics.checkNotNullParameter(markerContentList, "markerContentList");
        Intrinsics.checkNotNullParameter(onMarkerClick, "onMarkerClick");
        if (markerList.isEmpty()) {
            return;
        }
        int size = markerList.size();
        for (int i = 0; i < size; i++) {
            MarkerOptions markerOptions = new MarkerOptions();
            double[] dArrC = bxa.c(markerList.get(i).latitude, markerList.get(i).longitude);
            LatLng latLng = new LatLng(dArrC[0], dArrC[1]);
            View viewInflate = LayoutInflater.from(getContext()).inflate(qti.f, (ViewGroup) null);
            ((TextView) viewInflate.findViewById(lqi.d)).setText(markerContentList.get(i));
            markerOptions.icon(BitmapDescriptorFactory.fromView(viewInflate)).position(latLng);
            this.cityMap.put(getMapView().getMap().addMarker(markerOptions).getId(), markerList.get(i));
        }
        showLocationMarker();
        getMapView().getMap().setOnMarkerClickListener(new AMap.OnMarkerClickListener() { // from class: q4l
            @Override // com.amap.api.maps.AMap.OnMarkerClickListener
            public final boolean onMarkerClick(Marker marker) {
                return RunningRouteListMap.setCityMarker$lambda$6(this.f31097a, onMarkerClick, marker);
            }
        });
    }

    public final void setCurMarker(@Nullable Marker marker) {
        this.curMarker = marker;
    }

    public final void setDismissBottomCard(@Nullable Function0<Unit> function0) {
        this.dismissBottomCard = function0;
    }

    public final void setFirstLocation(boolean z) {
        this.isFirstLocation = z;
    }

    public final void setLocationData(@NotNull MutableLiveData<LocationData> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.locationData = mutableLiveData;
    }

    public final void setMMapView(@NotNull MapView mapView) {
        Intrinsics.checkNotNullParameter(mapView, "<set-?>");
        this.mMapView = mapView;
    }

    public final void setMarkers(@NotNull List<MarkerModel> markerList) {
        Intrinsics.checkNotNullParameter(markerList, "markerList");
        this.isFirstSelectMarker = true;
        Logger.d("RunningRouteListMap", "setMarkers , isFirstSelectMarker:true");
        if (markerList.isEmpty()) {
            return;
        }
        if (!this.map.isEmpty()) {
            double[] dArrC = bxa.c(markerList.get(0).getLatitude(), markerList.get(0).getLongitude());
            selectMarker(this.curMarker, new LatLng(dArrC[0], dArrC[1]), markerList.get(0).getRouteUrl(), markerList.get(0).getRouteId(), markerList.get(0).getName(), markerList.get(0).getFileSuffix());
            MutableLiveData<MarkerModel> mutableLiveData = this.routeSelectLiveData;
            if (mutableLiveData != null) {
                mutableLiveData.postValue(markerList.get(0));
                return;
            }
            return;
        }
        int size = markerList.size();
        for (int i = 0; i < size; i++) {
            MarkerOptions markerOptions = new MarkerOptions();
            double[] dArrC2 = bxa.c(markerList.get(i).getLatitude(), markerList.get(i).getLongitude());
            LatLng latLng = new LatLng(dArrC2[0], dArrC2[1]);
            View viewInflate = LayoutInflater.from(getContext()).inflate(qti.f, (ViewGroup) null);
            ((TextView) viewInflate.findViewById(lqi.d)).setText(markerList.get(i).getName());
            markerOptions.icon(BitmapDescriptorFactory.fromView(viewInflate)).position(latLng);
            Marker markerAddMarker = getMapView().getMap().addMarker(markerOptions);
            this.map.put(markerAddMarker.getId(), markerList.get(i));
            if (i == 0) {
                selectMarker(markerAddMarker, latLng, markerList.get(i).getRouteUrl(), markerList.get(i).getRouteId(), markerList.get(i).getName(), markerList.get(0).getFileSuffix());
                MutableLiveData<MarkerModel> mutableLiveData2 = this.routeSelectLiveData;
                if (mutableLiveData2 != null) {
                    mutableLiveData2.postValue(markerList.get(i));
                }
            }
        }
        showLocationMarker();
        getMapView().getMap().setOnMarkerClickListener(new AMap.OnMarkerClickListener() { // from class: t4l
            @Override // com.amap.api.maps.AMap.OnMarkerClickListener
            public final boolean onMarkerClick(Marker marker) {
                return RunningRouteListMap.setMarkers$lambda$4(this.f34311a, marker);
            }
        });
    }

    public final void setOnCameraChange(@Nullable Function1<? super Boolean, Unit> function1) {
        this.onCameraChange = function1;
    }

    public final void setOnCameraChangeListener(@NotNull Function1<? super Boolean, Unit> onCameraChange) {
        Intrinsics.checkNotNullParameter(onCameraChange, "onCameraChange");
        this.onCameraChange = onCameraChange;
    }

    public final void setRouteSelectLiveData(@Nullable MutableLiveData<MarkerModel> mutableLiveData) {
        this.routeSelectLiveData = mutableLiveData;
    }

    public final void setShowBottomCard(@Nullable Function0<Unit> function0) {
        this.showBottomCard = function0;
    }

    public final void startLocation() {
        Logger.i("RunningRouteListMap", "startLocation");
        AMapLocationClient aMapLocationClient = this.mLocationClient;
        AMapLocationClientOption aMapLocationClientOption = new AMapLocationClientOption();
        aMapLocationClientOption.setLocationMode(AMapLocationClientOption.AMapLocationMode.Hight_Accuracy);
        aMapLocationClientOption.setOnceLocation(true);
        aMapLocationClientOption.setLocationCacheEnable(true);
        aMapLocationClientOption.setNeedAddress(true);
        aMapLocationClient.setLocationOption(aMapLocationClientOption);
        MyLocationStyle myLocationStyle = new MyLocationStyle();
        myLocationStyle.myLocationType(1);
        myLocationStyle.radiusFillColor(Color.parseColor("#300e9eff"));
        myLocationStyle.strokeColor(Color.parseColor("#300e9eff"));
        this.mMapView.getMap().setMyLocationEnabled(false);
        this.mMapView.getMap().setMyLocationStyle(myLocationStyle);
        this.mLocationClient.setLocationListener(this.mLocationListener);
        this.mLocationClient.startLocation();
        mapConfig();
    }

    @Override // com.xiaomi.fitness.commonbase.data.sportmodel.view.BaseMapView
    @NotNull
    public MapView getMapView() {
        return this.mMapView;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RunningRouteListMap(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RunningRouteListMap(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
