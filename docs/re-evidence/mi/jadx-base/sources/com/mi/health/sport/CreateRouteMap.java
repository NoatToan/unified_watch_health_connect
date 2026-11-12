package com.mi.health.sport;

import android.content.Context;
import android.graphics.Color;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.Display;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.OvershootInterpolator;
import android.widget.TextView;
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
import com.amap.api.maps.utils.SpatialRelationUtil;
import com.mi.health.sport.CreateRouteMap;
import com.mi.health.utils.MapUtilsKt;
import com.mibi.sdk.component.params.SdkContants;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.commonbase.data.sportmodel.view.BaseMapView;
import defpackage.bxa;
import defpackage.lqi;
import defpackage.qti;
import defpackage.vmi;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
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
@Metadata(d1 = {"\u0000ã\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f*\u0001]\u0018\u0000  \u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0006 \u0001¡\u0001¢\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\fB\u001b\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\rJ\b\u0010d\u001a\u00020eH\u0002J\u0012\u0010f\u001a\u00020e2\b\u0010g\u001a\u0004\u0018\u00010hH\u0016J\b\u0010i\u001a\u00020eH\u0002J\u0010\u0010j\u001a\u00020e2\u0006\u0010k\u001a\u00020SH\u0002J\u000e\u0010l\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0004J\u0006\u0010m\u001a\u00020eJ*\u0010n\u001a\u00020e2\"\u0010o\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0q\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00140pJ\b\u0010r\u001a\u00020eH\u0016J\u0010\u0010s\u001a\u00020e2\u0006\u0010t\u001a\u00020hH\u0016J\b\u0010u\u001a\u00020eH\u0016J\b\u0010v\u001a\u00020eH\u0016J\b\u0010w\u001a\u00020eH\u0016J\u0007\u0010\u0083\u0001\u001a\u00020eJ\u0011\u0010\u0084\u0001\u001a\u00020e2\b\u0010\u0085\u0001\u001a\u00030\u0086\u0001J\u0010\u0010\u0087\u0001\u001a\u00020e2\u0007\u0010\u0088\u0001\u001a\u00020;J8\u0010\u0089\u0001\u001a\u00020e2\t\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u00142\u0007\u0010\u008b\u0001\u001a\u00020;2\u0007\u0010\u008c\u0001\u001a\u00020&2\u0007\u0010\u008d\u0001\u001a\u00020\b2\u0007\u0010\u008e\u0001\u001a\u00020&H\u0002J\u0018\u0010\u008f\u0001\u001a\u00020e2\r\u0010\u0090\u0001\u001a\b\u0012\u0004\u0012\u00020;0qH\u0002J\t\u0010\u0095\u0001\u001a\u00020eH\u0002J\t\u0010\u0096\u0001\u001a\u00020eH\u0002J\u0007\u0010\u0097\u0001\u001a\u00020eJ\u0012\u0010\u0098\u0001\u001a\u00020e2\u0007\u0010\u0099\u0001\u001a\u00020;H\u0002J\u0007\u0010\u009a\u0001\u001a\u00020eJ\u000f\u0010\u009b\u0001\u001a\u00020e2\u0006\u0010k\u001a\u00020SJ\u0016\u0010\u009c\u0001\u001a\u00020e2\r\u0010\u009d\u0001\u001a\b\u0012\u0004\u0012\u00020;0qJ\t\u0010\u009e\u0001\u001a\u00020eH\u0002J\u0007\u0010\u009f\u0001\u001a\u00020 R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u00020\u0002X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020 X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010!\"\u0004\b\"\u0010#R\u001d\u0010$\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0%¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u001a\u0010*\u001a\u00020+X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u0010\u00100\u001a\u0004\u0018\u000101X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00102\u001a\u0004\u0018\u000103X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00104\u001a\u0004\u0018\u000105X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020 X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u000208X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020&X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010:\u001a\u0004\u0018\u00010;X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u001c\u0010@\u001a\u0004\u0018\u00010\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010\u0016\"\u0004\bB\u0010\u0018R\u0017\u0010C\u001a\b\u0012\u0004\u0012\u00020\u001a0D¢\u0006\b\n\u0000\u001a\u0004\bE\u0010FR\u0017\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00140D¢\u0006\b\n\u0000\u001a\u0004\bH\u0010FR\u000e\u0010I\u001a\u00020 X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010J\u001a\u0004\u0018\u00010KX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010L\u001a\u0004\u0018\u00010MX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\u001a\u0010R\u001a\u00020SX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\u000e\u0010X\u001a\u00020SX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010Y\u001a\u00020SX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010Z\u001a\u00020SX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010[\u001a\u00020SX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\\\u001a\u00020]X\u0082\u0004¢\u0006\u0004\n\u0002\u0010^R\u000e\u0010_\u001a\u00020`X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010a\u001a\u00020`X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010b\u001a\u0004\u0018\u00010cX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010x\u001a\u00020\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\by\u0010\u0010R\"\u0010z\u001a\n\u0012\u0004\u0012\u00020e\u0018\u00010{X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b|\u0010}\"\u0004\b~\u0010\u007fR%\u0010\u0080\u0001\u001a\n\u0012\u0004\u0012\u00020e\u0018\u00010{X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0081\u0001\u0010}\"\u0005\b\u0082\u0001\u0010\u007fR\u0010\u0010\u0091\u0001\u001a\u00030\u0092\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0093\u0001\u001a\u00030\u0094\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006£\u0001"}, d2 = {"Lcom/mi/health/sport/CreateRouteMap;", "Lcom/xiaomi/fitness/commonbase/data/sportmodel/view/BaseMapView;", "Lcom/amap/api/maps/MapView;", "mContext", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "context", "(Landroid/content/Context;)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "mMapView", "getMMapView", "()Lcom/amap/api/maps/MapView;", "setMMapView", "(Lcom/amap/api/maps/MapView;)V", "curMarker", "Lcom/amap/api/maps/model/Marker;", "getCurMarker", "()Lcom/amap/api/maps/model/Marker;", "setCurMarker", "(Lcom/amap/api/maps/model/Marker;)V", "addPolyline", "Lcom/amap/api/maps/model/Polyline;", "getAddPolyline", "()Lcom/amap/api/maps/model/Polyline;", "setAddPolyline", "(Lcom/amap/api/maps/model/Polyline;)V", "isFirstLocation", "", "()Z", "setFirstLocation", "(Z)V", "map", "", "", "Lcom/mi/health/sport/CreateRouteMap$MarkerModel;", "getMap", "()Ljava/util/Map;", "mLocationClient", "Lcom/amap/api/location/AMapLocationClient;", "getMLocationClient", "()Lcom/amap/api/location/AMapLocationClient;", "setMLocationClient", "(Lcom/amap/api/location/AMapLocationClient;)V", "mLocationListener", "Lcom/amap/api/location/AMapLocationListener;", "scaleGestureDetector", "Landroid/view/ScaleGestureDetector;", "gestureDetector", "Landroid/view/GestureDetector;", "isFirstSelectMarker", "markerSelectTime", "", "selectMarkerText", "curLocationdata", "Lcom/amap/api/maps/model/LatLng;", "getCurLocationdata", "()Lcom/amap/api/maps/model/LatLng;", "setCurLocationdata", "(Lcom/amap/api/maps/model/LatLng;)V", "locationMarker", "getLocationMarker", "setLocationMarker", "polyLineList", "", "getPolyLineList", "()Ljava/util/List;", "markerList", "getMarkerList", "isPause", "sensorManager", "Landroid/hardware/SensorManager;", "cameraPosition", "Lcom/amap/api/maps/model/CameraPosition;", "getCameraPosition", "()Lcom/amap/api/maps/model/CameraPosition;", "setCameraPosition", "(Lcom/amap/api/maps/model/CameraPosition;)V", "mapRotation", "", "getMapRotation", "()F", "setMapRotation", "(F)V", "ALPHA", "ANGLE_THRESHOLD", "smoothedAngle", "lastAngle", "sensorListener", "com/mi/health/sport/CreateRouteMap$sensorListener$1", "Lcom/mi/health/sport/CreateRouteMap$sensorListener$1;", "rotationMatrix", "", "orientationValues", "rotationVectorSensor", "Landroid/hardware/Sensor;", "initSensor", "", "onCreate", SdkContants.KEY_BUNDLE, "Landroid/os/Bundle;", "mapConfig", "updateMarkerRotation", "angle", "getScreenRotationOnPhone", "clearMap", "setMapLineData", "triple", "Lkotlin/Triple;", "", LifecycleConstantKt.ON_RESUME, "onSaveInstanceState", "outState", LifecycleConstantKt.ON_PAUSE, LifecycleConstantKt.ON_DESTROY, "onLowMemory", "mapView", "getMapView", "dismissBottomCard", "Lkotlin/Function0;", "getDismissBottomCard", "()Lkotlin/jvm/functions/Function0;", "setDismissBottomCard", "(Lkotlin/jvm/functions/Function0;)V", "showBottomCard", "getShowBottomCard", "setShowBottomCard", "setStartLocation", "setOnCameraChange", "cameraChange", "Lcom/amap/api/maps/AMap$OnCameraChangeListener;", "animateLatLng", "latLng", "selectMarker", "marker", "markerLocation", "routeUrl", "routeId", "name", "drawPreLine", "latLngList", "scaleGestureDetectorListener", "Landroid/view/ScaleGestureDetector$OnScaleGestureListener;", "gestureDetectorListener", "Landroid/view/GestureDetector$SimpleOnGestureListener;", "cancelSelectMarker", "setListener", "moveCameraToCurrentLocation", "updateLocationMarker", "location", "showLocationMarker", "mapRotate", "buildRouteVisibleBounds", "list", "setCustomMapStyle", "adjustCurrentLocationWhenShown", "Companion", "MarkerModel", "LocationData", "map-amap_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCreateRouteMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CreateRouteMap.kt\ncom/mi/health/sport/CreateRouteMap\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Color.kt\nandroidx/core/graphics/ColorKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,579:1\n1863#2,2:580\n1863#2,2:582\n470#3:584\n470#3:585\n470#3:587\n1#4:586\n*S KotlinDebug\n*F\n+ 1 CreateRouteMap.kt\ncom/mi/health/sport/CreateRouteMap\n*L\n225#1:580,2\n229#1:582,2\n306#1:584\n307#1:585\n374#1:587\n*E\n"})
public final class CreateRouteMap extends BaseMapView<MapView> {

    @NotNull
    public static final String TAG = "RunningRouteListMap";
    private final float ALPHA;
    private final float ANGLE_THRESHOLD;

    @Nullable
    private Polyline addPolyline;

    @Nullable
    private CameraPosition cameraPosition;

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
    private boolean isFirstLocation;
    private boolean isFirstSelectMarker;
    private boolean isPause;
    private float lastAngle;

    @Nullable
    private Marker locationMarker;

    @NotNull
    private final Context mContext;
    public AMapLocationClient mLocationClient;

    @Nullable
    private AMapLocationListener mLocationListener;

    @NotNull
    private MapView mMapView;

    @NotNull
    private final Map<String, MarkerModel> map;
    private float mapRotation;

    @NotNull
    private final List<Marker> markerList;
    private long markerSelectTime;

    @NotNull
    private final float[] orientationValues;

    @NotNull
    private final List<Polyline> polyLineList;

    @NotNull
    private final float[] rotationMatrix;

    @Nullable
    private Sensor rotationVectorSensor;

    @Nullable
    private ScaleGestureDetector scaleGestureDetector;

    @NotNull
    private final ScaleGestureDetector.OnScaleGestureListener scaleGestureDetectorListener;

    @NotNull
    private String selectMarkerText;

    @NotNull
    private final CreateRouteMap$sensorListener$1 sensorListener;

    @Nullable
    private SensorManager sensorManager;

    @Nullable
    private Function0<Unit> showBottomCard;
    private float smoothedAngle;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/mi/health/sport/CreateRouteMap$LocationData;", "", "longitude", "", "latitude", "city", "", "<init>", "(DDLjava/lang/String;)V", "getLongitude", "()D", "getLatitude", "getCity", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "map-amap_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LocationData {

        @NotNull
        private final String city;
        private final double latitude;
        private final double longitude;

        public LocationData(double d, double d2, @NotNull String city) {
            Intrinsics.checkNotNullParameter(city, "city");
            this.longitude = d;
            this.latitude = d2;
            this.city = city;
        }

        public static /* synthetic */ LocationData copy$default(LocationData locationData, double d, double d2, String str, int i, Object obj) {
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
            return locationData.copy(d3, d4, str);
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
        public final LocationData copy(double longitude, double latitude, @NotNull String city) {
            Intrinsics.checkNotNullParameter(city, "city");
            return new LocationData(longitude, latitude, city);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LocationData)) {
                return false;
            }
            LocationData locationData = (LocationData) other;
            return Double.compare(this.longitude, locationData.longitude) == 0 && Double.compare(this.latitude, locationData.latitude) == 0 && Intrinsics.areEqual(this.city, locationData.city);
        }

        @NotNull
        public final String getCity() {
            return this.city;
        }

        public final double getLatitude() {
            return this.latitude;
        }

        public final double getLongitude() {
            return this.longitude;
        }

        public int hashCode() {
            return (((Double.hashCode(this.longitude) * 31) + Double.hashCode(this.latitude)) * 31) + this.city.hashCode();
        }

        @NotNull
        public String toString() {
            return "LocationData(longitude=" + this.longitude + ", latitude=" + this.latitude + ", city=" + this.city + ")";
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b'\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0006HÆ\u0003J\t\u0010%\u001a\u00020\bHÆ\u0003J\t\u0010&\u001a\u00020\bHÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\bHÆ\u0003J\t\u0010)\u001a\u00020\bHÆ\u0003J\t\u0010*\u001a\u00020\u0006HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0006HÆ\u0003J\u0081\u0001\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u0006HÆ\u0001J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u00020\u0006HÖ\u0001J\t\u00103\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0019R\u0011\u0010\f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019R\u0011\u0010\r\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0014R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0014R\u0011\u0010\u0010\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0017¨\u00064"}, d2 = {"Lcom/mi/health/sport/CreateRouteMap$MarkerModel;", "", "name", "", "routeUrl", "routeId", "", "longitude", "", "latitude", "icon", "length", "distance", "category", "titleName", "traceFileUrl", "heat", "<init>", "(Ljava/lang/String;Ljava/lang/String;IDDLjava/lang/String;DDILjava/lang/String;Ljava/lang/String;I)V", "getName", "()Ljava/lang/String;", "getRouteUrl", "getRouteId", "()I", "getLongitude", "()D", "getLatitude", "getIcon", "getLength", "getDistance", "getCategory", "getTitleName", "getTraceFileUrl", "getHeat", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", "", "other", "hashCode", "toString", "map-amap_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MarkerModel {
        private final int category;
        private final double distance;
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

        public MarkerModel(@NotNull String name, @NotNull String routeUrl, int i, double d, double d2, @NotNull String icon, double d3, double d4, int i2, @NotNull String titleName, @NotNull String traceFileUrl, int i3) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(routeUrl, "routeUrl");
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(titleName, "titleName");
            Intrinsics.checkNotNullParameter(traceFileUrl, "traceFileUrl");
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
        public final MarkerModel copy(@NotNull String name, @NotNull String routeUrl, int routeId, double longitude, double latitude, @NotNull String icon, double length, double distance, int category, @NotNull String titleName, @NotNull String traceFileUrl, int heat) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(routeUrl, "routeUrl");
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(titleName, "titleName");
            Intrinsics.checkNotNullParameter(traceFileUrl, "traceFileUrl");
            return new MarkerModel(name, routeUrl, routeId, longitude, latitude, icon, length, distance, category, titleName, traceFileUrl, heat);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MarkerModel)) {
                return false;
            }
            MarkerModel markerModel = (MarkerModel) other;
            return Intrinsics.areEqual(this.name, markerModel.name) && Intrinsics.areEqual(this.routeUrl, markerModel.routeUrl) && this.routeId == markerModel.routeId && Double.compare(this.longitude, markerModel.longitude) == 0 && Double.compare(this.latitude, markerModel.latitude) == 0 && Intrinsics.areEqual(this.icon, markerModel.icon) && Double.compare(this.length, markerModel.length) == 0 && Double.compare(this.distance, markerModel.distance) == 0 && this.category == markerModel.category && Intrinsics.areEqual(this.titleName, markerModel.titleName) && Intrinsics.areEqual(this.traceFileUrl, markerModel.traceFileUrl) && this.heat == markerModel.heat;
        }

        public final int getCategory() {
            return this.category;
        }

        public final double getDistance() {
            return this.distance;
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
            return (((((((((((((((((((((this.name.hashCode() * 31) + this.routeUrl.hashCode()) * 31) + Integer.hashCode(this.routeId)) * 31) + Double.hashCode(this.longitude)) * 31) + Double.hashCode(this.latitude)) * 31) + this.icon.hashCode()) * 31) + Double.hashCode(this.length)) * 31) + Double.hashCode(this.distance)) * 31) + Integer.hashCode(this.category)) * 31) + this.titleName.hashCode()) * 31) + this.traceFileUrl.hashCode()) * 31) + Integer.hashCode(this.heat);
        }

        @NotNull
        public String toString() {
            return "MarkerModel(name=" + this.name + ", routeUrl=" + this.routeUrl + ", routeId=" + this.routeId + ", longitude=" + this.longitude + ", latitude=" + this.latitude + ", icon=" + this.icon + ", length=" + this.length + ", distance=" + this.distance + ", category=" + this.category + ", titleName=" + this.titleName + ", traceFileUrl=" + this.traceFileUrl + ", heat=" + this.heat + ")";
        }
    }

    /* JADX INFO: renamed from: com.mi.health.sport.CreateRouteMap$selectMarker$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.mi.health.sport.CreateRouteMap$selectMarker$2", f = "CreateRouteMap.kt", i = {}, l = {347}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ LatLng $markerLocation;
        final /* synthetic */ int $routeId;
        final /* synthetic */ String $routeUrl;
        int label;
        final /* synthetic */ CreateRouteMap this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, int i, CreateRouteMap createRouteMap, LatLng latLng, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$routeUrl = str;
            this.$routeId = i;
            this.this$0 = createRouteMap;
            this.$markerLocation = latLng;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$routeUrl, this.$routeId, this.this$0, this.$markerLocation, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                CreateRouteMap$selectMarker$2$routeGpsData$1 createRouteMap$selectMarker$2$routeGpsData$1 = new CreateRouteMap$selectMarker$2$routeGpsData$1(this.$routeUrl, this.$routeId, null);
                this.label = 1;
                obj = BuildersKt.withContext(io2, createRouteMap$selectMarker$2$routeGpsData$1, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            List<LatLng> listCreateLatLngList = MapUtilsKt.createLatLngList((List) obj);
            CreateRouteMap createRouteMap = this.this$0;
            LatLng latLng = this.$markerLocation;
            createRouteMap.drawPreLine(listCreateLatLngList);
            if (createRouteMap.isFirstSelectMarker) {
                createRouteMap.getMapView().getMap().animateCamera(CameraUpdateFactory.newLatLng(latLng));
                createRouteMap.getMapView().getMap().moveCamera(CameraUpdateFactory.zoomTo(15.0f));
            } else {
                createRouteMap.buildRouteVisibleBounds(listCreateLatLngList);
            }
            createRouteMap.isFirstSelectMarker = false;
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r3v7, types: [com.mi.health.sport.CreateRouteMap$sensorListener$1] */
    public CreateRouteMap(@NotNull Context mContext, @Nullable AttributeSet attributeSet, int i) {
        super(mContext, attributeSet, i);
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        this.mContext = mContext;
        this.isFirstLocation = true;
        this.map = new HashMap();
        this.isFirstSelectMarker = true;
        this.selectMarkerText = "";
        this.polyLineList = new ArrayList();
        this.markerList = new ArrayList();
        this.ALPHA = 1.0f;
        this.ANGLE_THRESHOLD = 0.01f;
        this.sensorListener = new SensorEventListener() { // from class: com.mi.health.sport.CreateRouteMap$sensorListener$1
            @Override // android.hardware.SensorEventListener
            public void onAccuracyChanged(Sensor sensor, int accuracy) {
            }

            @Override // android.hardware.SensorEventListener
            public void onSensorChanged(SensorEvent event) {
                Intrinsics.checkNotNullParameter(event, "event");
                if (event.sensor.getType() == 11) {
                    SensorManager.getRotationMatrixFromVector(this.this$0.rotationMatrix, event.values);
                    SensorManager.getOrientation(this.this$0.rotationMatrix, this.this$0.orientationValues);
                    float degrees = ((float) Math.toDegrees(this.this$0.orientationValues[0])) - this.this$0.smoothedAngle;
                    if (Math.abs(degrees) > 180.0f) {
                        degrees = degrees > 0.0f ? degrees - SpatialRelationUtil.A_CIRCLE_DEGREE : degrees + SpatialRelationUtil.A_CIRCLE_DEGREE;
                    }
                    this.this$0.smoothedAngle += this.this$0.ALPHA * degrees;
                    if (Math.abs(this.this$0.smoothedAngle - this.this$0.lastAngle) > this.this$0.ANGLE_THRESHOLD) {
                        CreateRouteMap createRouteMap = this.this$0;
                        createRouteMap.lastAngle = createRouteMap.smoothedAngle;
                        CreateRouteMap createRouteMap2 = this.this$0;
                        createRouteMap2.updateMarkerRotation(createRouteMap2.lastAngle);
                    }
                }
            }
        };
        this.rotationMatrix = new float[9];
        this.orientationValues = new float[3];
        AMapLocationClient.updatePrivacyShow(getContext(), true, true);
        AMapLocationClient.updatePrivacyAgree(getContext(), true);
        View viewInflate = LayoutInflater.from(getContext()).inflate(qti.f31831b, this);
        setMLocationClient(new AMapLocationClient(getContext().getApplicationContext()));
        this.mMapView = (MapView) viewInflate.findViewById(lqi.c);
        initSensor();
        this.scaleGestureDetectorListener = new ScaleGestureDetector.OnScaleGestureListener() { // from class: com.mi.health.sport.CreateRouteMap$scaleGestureDetectorListener$1
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
        this.gestureDetectorListener = new GestureDetector.SimpleOnGestureListener() { // from class: com.mi.health.sport.CreateRouteMap$gestureDetectorListener$1
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

    private final void initSensor() {
        Object systemService = this.mContext.getApplicationContext().getSystemService("sensor");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.hardware.SensorManager");
        SensorManager sensorManager = (SensorManager) systemService;
        this.sensorManager = sensorManager;
        Sensor defaultSensor = sensorManager != null ? sensorManager.getDefaultSensor(11) : null;
        this.rotationVectorSensor = defaultSensor;
        if (defaultSensor == null) {
            Logger.e("RunningRouteListMap", "Device does not support rotationVectorSensor field sensors");
        }
    }

    private final void mapConfig() {
        AMap map = this.mMapView.getMap();
        UiSettings uiSettings = map.getUiSettings();
        uiSettings.setZoomControlsEnabled(false);
        uiSettings.setCompassEnabled(false);
        uiSettings.setCompassEnabled(false);
        uiSettings.setRotateGesturesEnabled(true);
        uiSettings.setTiltGesturesEnabled(false);
        map.setMinZoomLevel(10.0f);
        map.moveCamera(CameraUpdateFactory.zoomTo(15.0f));
        setCustomMapStyle();
    }

    private final void selectMarker(Marker marker, LatLng markerLocation, String routeUrl, int routeId, String name) {
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
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new AnonymousClass2(routeUrl, routeId, this, markerLocation, null), 3, null);
    }

    private final void setCustomMapStyle() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        String str = UIUtils.isNightMode(context) ? MapUtilsKt.MAP_STYLE_RES_ID_DARK_STYLE : null;
        if (str == null) {
            return;
        }
        final CustomMapStyleOptions customMapStyleOptions = new CustomMapStyleOptions();
        customMapStyleOptions.setEnable(true);
        customMapStyleOptions.setStyleId(str);
        AMap map = getMapView().getMap();
        if (map != null) {
            map.setOnMapLoadedListener(new AMap.OnMapLoadedListener() { // from class: j35
                @Override // com.amap.api.maps.AMap.OnMapLoadedListener
                public final void onMapLoaded() {
                    CreateRouteMap.setCustomMapStyle$lambda$13(this.f22370a, customMapStyleOptions);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setCustomMapStyle$lambda$13(CreateRouteMap this$0, CustomMapStyleOptions customMapStyleOptions) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(customMapStyleOptions, "$customMapStyleOptions");
        this$0.getMapView().getMap().setCustomMapStyle(customMapStyleOptions);
    }

    private final void setListener() {
        this.mMapView.getMap().setOnMapTouchListener(new AMap.OnMapTouchListener() { // from class: k35
            @Override // com.amap.api.maps.AMap.OnMapTouchListener
            public final void onTouch(MotionEvent motionEvent) {
                CreateRouteMap.setListener$lambda$9(this.f23376a, motionEvent);
            }
        });
        this.mLocationListener = new AMapLocationListener() { // from class: l35
            @Override // com.amap.api.location.AMapLocationListener
            public final void onLocationChanged(AMapLocation aMapLocation) {
                CreateRouteMap.setListener$lambda$10(this.f24593a, aMapLocation);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$10(CreateRouteMap this$0, AMapLocation aMapLocation) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (aMapLocation == null || aMapLocation.getErrorCode() != 0) {
            Logger.e("RunningRouteListMap", "定位失败, 错误码: " + aMapLocation.getErrorCode() + ", 错误信息: " + aMapLocation.getErrorInfo());
            return;
        }
        bxa.b(aMapLocation.getLatitude(), aMapLocation.getLongitude());
        LatLng latLng = new LatLng(aMapLocation.getLatitude(), aMapLocation.getLongitude());
        this$0.curLocationdata = latLng;
        this$0.updateLocationMarker(latLng);
        if (this$0.isFirstLocation) {
            this$0.isFirstLocation = false;
            this$0.getMapView().getMap().moveCamera(CameraUpdateFactory.newLatLngZoom(latLng, 18.0f));
            Logger.i("RunningRouteListMap", "map第一次定位成功, 定位类型: " + aMapLocation.getLocationType() + " , 纬度: " + aMapLocation.getLatitude() + ", 经度: " + aMapLocation.getLongitude() + ", 精度: " + aMapLocation.getAccuracy() + ", 城市: " + aMapLocation.getCity());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$9(CreateRouteMap this$0, MotionEvent motionEvent) {
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

    private final void updateLocationMarker(LatLng location) {
        Marker marker = this.locationMarker;
        if (marker == null) {
            this.locationMarker = getMapView().getMap().addMarker(new MarkerOptions().position(location).anchor(0.5f, 0.5f).icon(BitmapDescriptorFactory.fromResource(vmi.f37031b)));
        } else if (marker != null) {
            marker.setPosition(location);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateMarkerRotation(float angle) {
        if (this.curLocationdata == null || this.locationMarker == null) {
            return;
        }
        float f = SpatialRelationUtil.A_CIRCLE_DEGREE;
        float screenRotationOnPhone = (((this.mapRotation + f) - angle) + getScreenRotationOnPhone(this.mContext)) % f;
        Marker marker = this.locationMarker;
        if (marker != null) {
            marker.setRotateAngle(screenRotationOnPhone);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x004f  */
    public final boolean adjustCurrentLocationWhenShown() {
        boolean z;
        if (this.cameraPosition != null) {
            CameraPosition cameraPosition = this.mMapView.getMap().getCameraPosition();
            CameraPosition cameraPosition2 = this.cameraPosition;
            Intrinsics.checkNotNull(cameraPosition2);
            if (cameraPosition2.target.latitude == cameraPosition.target.latitude) {
                CameraPosition cameraPosition3 = this.cameraPosition;
                Intrinsics.checkNotNull(cameraPosition3);
                if (cameraPosition3.target.longitude == cameraPosition.target.longitude) {
                    CameraPosition cameraPosition4 = this.cameraPosition;
                    Intrinsics.checkNotNull(cameraPosition4);
                    if (cameraPosition4.zoom == cameraPosition.zoom) {
                    }
                    if (z) {
                        Logger.i("RunningRouteListMap", "adjustCurrentLocationWhenShown  moveCamera");
                        AMap map = this.mMapView.getMap();
                        CameraPosition cameraPosition5 = this.cameraPosition;
                        Intrinsics.checkNotNull(cameraPosition5);
                        double d = cameraPosition5.target.latitude;
                        CameraPosition cameraPosition6 = this.cameraPosition;
                        Intrinsics.checkNotNull(cameraPosition6);
                        map.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(d, cameraPosition6.target.longitude), 18.0f));
                    }
                    return z;
                }
            }
            z = true;
            if (z) {
                Logger.i("RunningRouteListMap", "adjustCurrentLocationWhenShown  moveCamera");
                AMap map2 = this.mMapView.getMap();
                CameraPosition cameraPosition7 = this.cameraPosition;
                Intrinsics.checkNotNull(cameraPosition7);
                double d2 = cameraPosition7.target.latitude;
                CameraPosition cameraPosition8 = this.cameraPosition;
                Intrinsics.checkNotNull(cameraPosition8);
                map2.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(d2, cameraPosition8.target.longitude), 18.0f));
            }
            return z;
        }
        this.cameraPosition = this.mMapView.getMap().getCameraPosition();
        z = false;
        if (z) {
            Logger.i("RunningRouteListMap", "adjustCurrentLocationWhenShown  moveCamera");
            AMap map3 = this.mMapView.getMap();
            CameraPosition cameraPosition9 = this.cameraPosition;
            Intrinsics.checkNotNull(cameraPosition9);
            double d3 = cameraPosition9.target.latitude;
            CameraPosition cameraPosition10 = this.cameraPosition;
            Intrinsics.checkNotNull(cameraPosition10);
            map3.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(d3, cameraPosition10.target.longitude), 18.0f));
        }
        return z;
    }

    public final void animateLatLng(@NotNull LatLng latLng) {
        Intrinsics.checkNotNullParameter(latLng, "latLng");
        getMapView().getMap().animateCamera(CameraUpdateFactory.newLatLng(latLng));
    }

    public final void buildRouteVisibleBounds(@NotNull List<LatLng> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        LatLngBounds.Builder builder = LatLngBounds.builder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            builder.include(list.get(i));
        }
        getMapView().getMap().animateCamera(CameraUpdateFactory.newLatLngBounds(builder.build(), 150));
    }

    public final void clearMap() {
        Iterator<T> it = this.polyLineList.iterator();
        while (it.hasNext()) {
            ((Polyline) it.next()).remove();
        }
        this.polyLineList.clear();
        Iterator<T> it2 = this.markerList.iterator();
        while (it2.hasNext()) {
            ((Marker) it2.next()).remove();
        }
    }

    @Nullable
    public final Polyline getAddPolyline() {
        return this.addPolyline;
    }

    @Nullable
    public final CameraPosition getCameraPosition() {
        return this.cameraPosition;
    }

    @Nullable
    public final LatLng getCurLocationdata() {
        return this.curLocationdata;
    }

    @Nullable
    public final Marker getCurMarker() {
        return this.curMarker;
    }

    @Nullable
    public final Function0<Unit> getDismissBottomCard() {
        return this.dismissBottomCard;
    }

    @Nullable
    public final Marker getLocationMarker() {
        return this.locationMarker;
    }

    @NotNull
    public final AMapLocationClient getMLocationClient() {
        AMapLocationClient aMapLocationClient = this.mLocationClient;
        if (aMapLocationClient != null) {
            return aMapLocationClient;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mLocationClient");
        return null;
    }

    @NotNull
    public final MapView getMMapView() {
        return this.mMapView;
    }

    @NotNull
    public final Map<String, MarkerModel> getMap() {
        return this.map;
    }

    public final float getMapRotation() {
        return this.mapRotation;
    }

    @NotNull
    public final List<Marker> getMarkerList() {
        return this.markerList;
    }

    @NotNull
    public final List<Polyline> getPolyLineList() {
        return this.polyLineList;
    }

    public final int getScreenRotationOnPhone(@NotNull Context context) {
        Display defaultDisplay;
        Intrinsics.checkNotNullParameter(context, "context");
        if (Build.VERSION.SDK_INT >= 30) {
            defaultDisplay = context.getDisplay();
        } else {
            Object systemService = context.getApplicationContext().getSystemService("window");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        }
        Integer numValueOf = defaultDisplay != null ? Integer.valueOf(defaultDisplay.getRotation()) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            return 0;
        }
        if (numValueOf != null && numValueOf.intValue() == 1) {
            return 90;
        }
        if (numValueOf != null && numValueOf.intValue() == 2) {
            return 180;
        }
        return (numValueOf != null && numValueOf.intValue() == 3) ? -90 : 0;
    }

    @Nullable
    public final Function0<Unit> getShowBottomCard() {
        return this.showBottomCard;
    }

    /* JADX INFO: renamed from: isFirstLocation, reason: from getter */
    public final boolean getIsFirstLocation() {
        return this.isFirstLocation;
    }

    public final void mapRotate(float angle) {
        getMapView().getMap().animateCamera(CameraUpdateFactory.changeBearing(angle));
    }

    public final void moveCameraToCurrentLocation() {
        LatLng latLng = this.curLocationdata;
        if (latLng != null) {
            getMapView().getMap().animateCamera(CameraUpdateFactory.newLatLng(latLng));
        }
    }

    @Override // com.xiaomi.fitness.commonbase.data.sportmodel.view.BaseMapView
    public void onCreate(@Nullable Bundle bundle) {
        this.mMapView.onCreate(bundle);
        mapConfig();
        setListener();
        this.scaleGestureDetector = new ScaleGestureDetector(getContext(), this.scaleGestureDetectorListener);
        this.gestureDetector = new GestureDetector(getContext(), this.gestureDetectorListener);
        setStartLocation();
    }

    @Override // com.xiaomi.fitness.commonbase.data.sportmodel.view.BaseMapView
    public void onDestroy() {
        this.mMapView.onDestroy();
        this.map.clear();
        this.mLocationListener = null;
        getMLocationClient().setLocationListener(null);
        SensorManager sensorManager = this.sensorManager;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this.sensorListener);
        }
        getMLocationClient().stopLocation();
        getMLocationClient().onDestroy();
    }

    @Override // com.xiaomi.fitness.commonbase.data.sportmodel.view.BaseMapView
    public void onLowMemory() {
        this.mMapView.onLowMemory();
    }

    @Override // com.xiaomi.fitness.commonbase.data.sportmodel.view.BaseMapView
    public void onPause() {
        this.isPause = true;
        SensorManager sensorManager = this.sensorManager;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this.sensorListener);
        }
        getMLocationClient().stopLocation();
        this.mMapView.onPause();
    }

    @Override // com.xiaomi.fitness.commonbase.data.sportmodel.view.BaseMapView
    public void onResume() {
        SensorManager sensorManager;
        this.isPause = false;
        Sensor sensor = this.rotationVectorSensor;
        if (sensor != null && (sensorManager = this.sensorManager) != null) {
            sensorManager.registerListener(this.sensorListener, sensor, 2);
        }
        this.mMapView.onResume();
        this.mMapView.getMap().moveCamera(CameraUpdateFactory.changeBearing(this.mapRotation));
        getMLocationClient().startLocation();
    }

    @Override // com.xiaomi.fitness.commonbase.data.sportmodel.view.BaseMapView
    public void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        this.mMapView.onSaveInstanceState(outState);
    }

    public final void setAddPolyline(@Nullable Polyline polyline) {
        this.addPolyline = polyline;
    }

    public final void setCameraPosition(@Nullable CameraPosition cameraPosition) {
        this.cameraPosition = cameraPosition;
    }

    public final void setCurLocationdata(@Nullable LatLng latLng) {
        this.curLocationdata = latLng;
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

    public final void setLocationMarker(@Nullable Marker marker) {
        this.locationMarker = marker;
    }

    public final void setMLocationClient(@NotNull AMapLocationClient aMapLocationClient) {
        Intrinsics.checkNotNullParameter(aMapLocationClient, "<set-?>");
        this.mLocationClient = aMapLocationClient;
    }

    public final void setMMapView(@NotNull MapView mapView) {
        Intrinsics.checkNotNullParameter(mapView, "<set-?>");
        this.mMapView = mapView;
    }

    public final void setMapLineData(@NotNull Triple<? extends List<? extends Polyline>, Marker, Marker> triple) {
        Intrinsics.checkNotNullParameter(triple, "triple");
        this.polyLineList.addAll(triple.getFirst());
        List<Marker> list = this.markerList;
        Marker second = triple.getSecond();
        Intrinsics.checkNotNull(second);
        list.add(second);
        List<Marker> list2 = this.markerList;
        Marker third = triple.getThird();
        Intrinsics.checkNotNull(third);
        list2.add(third);
    }

    public final void setMapRotation(float f) {
        this.mapRotation = f;
    }

    public final void setOnCameraChange(@NotNull AMap.OnCameraChangeListener cameraChange) {
        Intrinsics.checkNotNullParameter(cameraChange, "cameraChange");
        getMapView().getMap().setOnCameraChangeListener(cameraChange);
    }

    public final void setShowBottomCard(@Nullable Function0<Unit> function0) {
        this.showBottomCard = function0;
    }

    public final void setStartLocation() {
        Logger.i("RunningRouteListMap", "startLocation");
        AMapLocationClient mLocationClient = getMLocationClient();
        AMapLocationClientOption aMapLocationClientOption = new AMapLocationClientOption();
        aMapLocationClientOption.setLocationMode(AMapLocationClientOption.AMapLocationMode.Hight_Accuracy);
        aMapLocationClientOption.setOnceLocation(false);
        aMapLocationClientOption.setLocationCacheEnable(true);
        aMapLocationClientOption.setNeedAddress(true);
        aMapLocationClientOption.setInterval(2400L);
        mLocationClient.setLocationOption(aMapLocationClientOption);
        MyLocationStyle myLocationStyle = new MyLocationStyle();
        myLocationStyle.myLocationType(1);
        myLocationStyle.radiusFillColor(Color.parseColor("#300e9eff"));
        myLocationStyle.strokeColor(Color.parseColor("#300e9eff"));
        this.mMapView.getMap().setMyLocationEnabled(false);
        this.mMapView.getMap().setMyLocationStyle(myLocationStyle);
        getMLocationClient().setLocationListener(this.mLocationListener);
    }

    public final void showLocationMarker() {
        Marker marker = this.locationMarker;
        if (marker != null) {
            marker.remove();
        }
        this.locationMarker = getMapView().getMap().addMarker(new MarkerOptions().anchor(0.5f, 0.5f).icon(BitmapDescriptorFactory.fromResource(vmi.f37031b)).position(this.curLocationdata));
    }

    @Override // com.xiaomi.fitness.commonbase.data.sportmodel.view.BaseMapView
    @NotNull
    public MapView getMapView() {
        return this.mMapView;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CreateRouteMap(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CreateRouteMap(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
