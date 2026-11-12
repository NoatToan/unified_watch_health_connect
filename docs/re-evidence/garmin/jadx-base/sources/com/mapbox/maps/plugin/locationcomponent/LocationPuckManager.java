package com.mapbox.maps.plugin.locationcomponent;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.messaging.Constants;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.Value;
import com.mapbox.common.location.LocationError;
import com.mapbox.geojson.Point;
import com.mapbox.maps.MapboxLocationComponentException;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.maps.MapboxStyleManager;
import com.mapbox.maps.plugin.LocationPuck;
import com.mapbox.maps.plugin.LocationPuck2D;
import com.mapbox.maps.plugin.LocationPuck3D;
import com.mapbox.maps.plugin.delegates.MapDelegateProvider;
import com.mapbox.maps.plugin.locationcomponent.animators.PuckAnimatorManager;
import com.mapbox.maps.plugin.locationcomponent.generated.LocationComponentSettings;
import e23.l;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import lc.u0;
import n23.j;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;
import p005kotlin.jvm.internal.w0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000{\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0013\n\u0002\u0010\u0006\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\b\u000e*\u0001a\b\u0001\u0018\u0000 m2\u00020\u0001:\u0001mB5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0011¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0011¢\u0006\u0004\b\u001c\u0010\u0016J\r\u0010\u001d\u001a\u00020\u0011¢\u0006\u0004\b\u001d\u0010\u0016J9\u0010$\u001a\u00020\u00112\u0012\u0010 \u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001f0\u001e\"\u00020\u001f2\u0016\b\u0002\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u0011\u0018\u00010!¢\u0006\u0004\b$\u0010%J;\u0010*\u001a\u00020\u00112\n\u0010(\u001a\u00020&\"\u00020'2\u0016\b\u0002\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u0011\u0018\u00010!2\b\b\u0002\u0010)\u001a\u00020\u0017¢\u0006\u0004\b*\u0010+J7\u0010,\u001a\u00020\u00112\u0006\u0010(\u001a\u00020&2\u0016\b\u0002\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u0011\u0018\u00010!2\u0006\u0010)\u001a\u00020\u0017H\u0007¢\u0006\u0004\b,\u0010+J1\u0010.\u001a\u00020\u00112\n\u0010-\u001a\u00020&\"\u00020'2\u0016\b\u0002\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u0011\u0018\u00010!¢\u0006\u0004\b.\u0010/J\u0017\u00102\u001a\u00020\u00112\u0006\u0010-\u001a\u00020'H\u0001¢\u0006\u0004\b0\u00101J!\u00104\u001a\u00020\u00112\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00110!¢\u0006\u0004\b4\u00105J!\u00106\u001a\u00020\u00112\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00110!¢\u0006\u0004\b6\u00105J!\u00107\u001a\u00020\u00112\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00110!¢\u0006\u0004\b7\u00105J\u0015\u0010:\u001a\u00020\u00112\u0006\u00109\u001a\u000208¢\u0006\u0004\b:\u0010;J\u0017\u0010<\u001a\u00020\u00112\b\b\u0002\u0010)\u001a\u00020\u0017¢\u0006\u0004\b<\u0010=J\r\u0010>\u001a\u00020\u0011¢\u0006\u0004\b>\u0010\u0016J\u0017\u0010@\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b?\u0010\u001bJ\u0017\u0010B\u001a\u00020A2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\bB\u0010CR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010\u001bR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010HR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010IR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010JR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010KR(\u0010L\u001a\u00020\u00178\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\bL\u0010M\u0012\u0004\bP\u0010\u0016\u001a\u0004\bN\u0010\u0019\"\u0004\bO\u0010=R*\u0010Q\u001a\u0004\u0018\u00010\u001f8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\bQ\u0010R\u0012\u0004\bW\u0010\u0016\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR \u0010X\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00110!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR(\u0010Z\u001a\u00020'8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\bZ\u0010[\u0012\u0004\b_\u0010\u0016\u001a\u0004\b\\\u0010]\"\u0004\b^\u00101R \u0010`\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00110!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010YR\u0014\u0010b\u001a\u00020a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u0016\u0010d\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010[R \u0010e\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00110!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010YR(\u0010f\u001a\u00020A8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\bf\u0010g\u0012\u0004\bl\u0010\u0016\u001a\u0004\bh\u0010i\"\u0004\bj\u0010k¨\u0006n"}, d2 = {"Lcom/mapbox/maps/plugin/locationcomponent/LocationPuckManager;", "", "Lcom/mapbox/maps/plugin/locationcomponent/generated/LocationComponentSettings;", "settings", "Ljava/lang/ref/WeakReference;", "Landroid/content/Context;", "weakContext", "Lcom/mapbox/maps/plugin/delegates/MapDelegateProvider;", "delegateProvider", "Lcom/mapbox/maps/plugin/locationcomponent/LocationComponentPositionManager;", "positionManager", "Lcom/mapbox/maps/plugin/locationcomponent/animators/PuckAnimatorManager;", "animationManager", "<init>", "(Lcom/mapbox/maps/plugin/locationcomponent/generated/LocationComponentSettings;Ljava/lang/ref/WeakReference;Lcom/mapbox/maps/plugin/delegates/MapDelegateProvider;Lcom/mapbox/maps/plugin/locationcomponent/LocationComponentPositionManager;Lcom/mapbox/maps/plugin/locationcomponent/animators/PuckAnimatorManager;)V", "Lcom/mapbox/maps/MapboxStyleManager;", TtmlNode.TAG_STYLE, "", "updateStyle", "(Lcom/mapbox/maps/MapboxStyleManager;)V", "initialize", "cleanUp", "()V", "", "isLayerInitialised", "()Z", "updateSettings", "(Lcom/mapbox/maps/plugin/locationcomponent/generated/LocationComponentSettings;)V", "onStart", "onStop", "", "Lcom/mapbox/geojson/Point;", "points", "Lkotlin/Function1;", "Landroid/animation/ValueAnimator;", "options", "updateCurrentPosition", "([Lcom/mapbox/geojson/Point;Le23/l;)V", "", "", "bearings", "forceUpdate", "updateCurrentBearing", "([DLe23/l;Z)V", "animateToBearing", "radius", "updateHorizontalAccuracyRadius", "([DLe23/l;)V", "updateMaxPulsingRadiusToFollowAccuracyRing$plugin_locationcomponent_release", "(D)V", "updateMaxPulsingRadiusToFollowAccuracyRing", "block", "updateLocationAnimator", "(Le23/l;)V", "updateBearingAnimator", "updateAccuracyRadiusAnimator", "Lcom/mapbox/common/location/LocationError;", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "onLocationError", "(Lcom/mapbox/common/location/LocationError;)V", "show", "(Z)V", "hide", "styleScaling$plugin_locationcomponent_release", "styleScaling", "Lcom/mapbox/maps/plugin/locationcomponent/LocationLayerRenderer;", "getLocationLayerRenderer", "(Lcom/mapbox/maps/plugin/locationcomponent/generated/LocationComponentSettings;)Lcom/mapbox/maps/plugin/locationcomponent/LocationLayerRenderer;", "Lcom/mapbox/maps/plugin/locationcomponent/generated/LocationComponentSettings;", "getSettings", "()Lcom/mapbox/maps/plugin/locationcomponent/generated/LocationComponentSettings;", "setSettings", "Ljava/lang/ref/WeakReference;", "Lcom/mapbox/maps/plugin/delegates/MapDelegateProvider;", "Lcom/mapbox/maps/plugin/locationcomponent/LocationComponentPositionManager;", "Lcom/mapbox/maps/plugin/locationcomponent/animators/PuckAnimatorManager;", "isHidden", "Z", "isHidden$plugin_locationcomponent_release", "setHidden$plugin_locationcomponent_release", "isHidden$plugin_locationcomponent_release$annotations", "lastLocation", "Lcom/mapbox/geojson/Point;", "getLastLocation$plugin_locationcomponent_release", "()Lcom/mapbox/geojson/Point;", "setLastLocation$plugin_locationcomponent_release", "(Lcom/mapbox/geojson/Point;)V", "getLastLocation$plugin_locationcomponent_release$annotations", "onLocationUpdated", "Le23/l;", "lastBearing", "D", "getLastBearing$plugin_locationcomponent_release", "()D", "setLastBearing$plugin_locationcomponent_release", "getLastBearing$plugin_locationcomponent_release$annotations", "onBearingUpdated", "com/mapbox/maps/plugin/locationcomponent/LocationPuckManager$disablePuckAnimationOnEnd$1", "disablePuckAnimationOnEnd", "Lcom/mapbox/maps/plugin/locationcomponent/LocationPuckManager$disablePuckAnimationOnEnd$1;", "lastAccuracyRadius", "onAccuracyRadiusUpdated", "locationLayerRenderer", "Lcom/mapbox/maps/plugin/locationcomponent/LocationLayerRenderer;", "getLocationLayerRenderer$plugin_locationcomponent_release", "()Lcom/mapbox/maps/plugin/locationcomponent/LocationLayerRenderer;", "setLocationLayerRenderer$plugin_locationcomponent_release", "(Lcom/mapbox/maps/plugin/locationcomponent/LocationLayerRenderer;)V", "getLocationLayerRenderer$plugin_locationcomponent_release$annotations", "Companion", "plugin-locationcomponent_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class LocationPuckManager {

    @Deprecated
    public static final double BEARING_UPDATE_THRESHOLD = 1.0d;
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final String TAG = "LocationPuckManager";
    private final PuckAnimatorManager animationManager;
    private final MapDelegateProvider delegateProvider;
    private final LocationPuckManager$disablePuckAnimationOnEnd$1 disablePuckAnimationOnEnd;
    private boolean isHidden;
    private double lastAccuracyRadius;
    private double lastBearing;
    private Point lastLocation;
    private LocationLayerRenderer locationLayerRenderer;
    private final l<Double, Unit> onAccuracyRadiusUpdated;
    private final l<Double, Unit> onBearingUpdated;
    private final l<Point, Unit> onLocationUpdated;
    private final LocationComponentPositionManager positionManager;
    private LocationComponentSettings settings;
    private final WeakReference<Context> weakContext;

    /* JADX WARN: Type inference failed for: r1v7, types: [com.mapbox.maps.plugin.locationcomponent.LocationPuckManager$disablePuckAnimationOnEnd$1] */
    public LocationPuckManager(LocationComponentSettings locationComponentSettings, WeakReference<Context> weakReference, MapDelegateProvider mapDelegateProvider, LocationComponentPositionManager locationComponentPositionManager, PuckAnimatorManager puckAnimatorManager) {
        locationComponentSettings.getClass();
        weakReference.getClass();
        mapDelegateProvider.getClass();
        locationComponentPositionManager.getClass();
        puckAnimatorManager.getClass();
        this.settings = locationComponentSettings;
        this.weakContext = weakReference;
        this.delegateProvider = mapDelegateProvider;
        this.positionManager = locationComponentPositionManager;
        this.animationManager = puckAnimatorManager;
        this.isHidden = true;
        this.onLocationUpdated = new LocationPuckManager$onLocationUpdated$1(this);
        this.lastBearing = mapDelegateProvider.getMapCameraManagerDelegate().getCameraState().getBearing();
        this.onBearingUpdated = new LocationPuckManager$onBearingUpdated$1(this);
        this.disablePuckAnimationOnEnd = new AnimatorListenerAdapter() { // from class: com.mapbox.maps.plugin.locationcomponent.LocationPuckManager$disablePuckAnimationOnEnd$1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                animation.getClass();
                this.this$0.animationManager.setPuckAnimationEnabled$plugin_locationcomponent_release(false);
                animation.removeListener(this);
            }
        };
        this.onAccuracyRadiusUpdated = new LocationPuckManager$onAccuracyRadiusUpdated$1(this);
        this.locationLayerRenderer = getLocationLayerRenderer(this.settings);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void animateToBearing$default(LocationPuckManager locationPuckManager, double[] dArr, l lVar, boolean z14, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            lVar = null;
        }
        locationPuckManager.animateToBearing(dArr, lVar, z14);
    }

    public static /* synthetic */ void getLastBearing$plugin_locationcomponent_release$annotations() {
    }

    public static /* synthetic */ void getLastLocation$plugin_locationcomponent_release$annotations() {
    }

    private final LocationLayerRenderer getLocationLayerRenderer(LocationComponentSettings settings) {
        LocationPuck locationPuck = settings.getLocationPuck();
        if (locationPuck instanceof LocationPuck2D) {
            return LayerSourceProvider.INSTANCE.getLocationIndicatorLayerRenderer((LocationPuck2D) locationPuck, this.weakContext);
        }
        if (locationPuck instanceof LocationPuck3D) {
            return LayerSourceProvider.INSTANCE.getModelLayerRenderer((LocationPuck3D) locationPuck);
        }
        u0.r();
        return null;
    }

    public static /* synthetic */ void getLocationLayerRenderer$plugin_locationcomponent_release$annotations() {
    }

    public static /* synthetic */ void isHidden$plugin_locationcomponent_release$annotations() {
    }

    public static /* synthetic */ void show$default(LocationPuckManager locationPuckManager, boolean z14, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            z14 = false;
        }
        locationPuckManager.show(z14);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void updateCurrentBearing$default(LocationPuckManager locationPuckManager, double[] dArr, l lVar, boolean z14, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            lVar = null;
        }
        if ((i14 & 4) != 0) {
            z14 = false;
        }
        locationPuckManager.updateCurrentBearing(dArr, lVar, z14);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void updateCurrentPosition$default(LocationPuckManager locationPuckManager, Point[] pointArr, l lVar, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            lVar = null;
        }
        locationPuckManager.updateCurrentPosition(pointArr, lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void updateHorizontalAccuracyRadius$default(LocationPuckManager locationPuckManager, double[] dArr, l lVar, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            lVar = null;
        }
        locationPuckManager.updateHorizontalAccuracyRadius(dArr, lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void animateToBearing(double[] bearings, l<? super ValueAnimator, Unit> options, boolean forceUpdate) {
        bearings.getClass();
        if (!forceUpdate) {
            if (bearings.length == 0) {
                j.s("Array is empty.");
                return;
            } else if (Math.abs(bearings[bearings.length - 1] - this.lastBearing) < 1.0d) {
                return;
            }
        }
        p005kotlin.jvm.internal.l lVar = new p005kotlin.jvm.internal.l(2);
        double d14 = this.lastBearing;
        int i14 = lVar.f105794b;
        int i15 = i14 + 1;
        lVar.f105794b = i15;
        lVar.f105802d[i14] = d14;
        lVar.f105794b = i14 + 2;
        lVar.f105795c[i15] = bearings;
        double[] dArrA = lVar.a();
        this.animationManager.animateBearing(Arrays.copyOf(dArrA, dArrA.length), options);
    }

    public final void cleanUp() {
        hide();
        this.animationManager.onStop();
        this.locationLayerRenderer.clearBitmaps();
        this.locationLayerRenderer.removeLayers();
    }

    /* JADX INFO: renamed from: getLastBearing$plugin_locationcomponent_release, reason: from getter */
    public final double getLastBearing() {
        return this.lastBearing;
    }

    /* JADX INFO: renamed from: getLastLocation$plugin_locationcomponent_release, reason: from getter */
    public final Point getLastLocation() {
        return this.lastLocation;
    }

    /* JADX INFO: renamed from: getLocationLayerRenderer$plugin_locationcomponent_release, reason: from getter */
    public final LocationLayerRenderer getLocationLayerRenderer() {
        return this.locationLayerRenderer;
    }

    public final LocationComponentSettings getSettings() {
        return this.settings;
    }

    public final void hide() {
        this.isHidden = true;
        this.locationLayerRenderer.hide();
    }

    public final void initialize(MapboxStyleManager style) {
        style.getClass();
        if (this.locationLayerRenderer.isRendererInitialised()) {
            return;
        }
        this.animationManager.setUpdateListeners(this.onLocationUpdated, this.onBearingUpdated, this.onAccuracyRadiusUpdated);
        this.animationManager.setLocationLayerRenderer(this.locationLayerRenderer);
        this.animationManager.applySettings(this.settings);
        Point point = this.lastLocation;
        if (point != null) {
            updateCurrentPosition$default(this, new Point[]{point}, null, 2, null);
        }
        updateCurrentBearing$default(this, new double[]{this.lastBearing}, null, true, 2, null);
        this.locationLayerRenderer.addLayers(this.positionManager);
        this.locationLayerRenderer.initializeComponents(style);
        styleScaling$plugin_locationcomponent_release(this.settings);
        if (this.lastLocation == null || !this.settings.getEnabled()) {
            hide();
        } else {
            show(true);
        }
        if (this.settings.getShowAccuracyRing()) {
            updateHorizontalAccuracyRadius$default(this, new double[]{this.lastAccuracyRadius}, null, 2, null);
        }
    }

    /* JADX INFO: renamed from: isHidden$plugin_locationcomponent_release, reason: from getter */
    public final boolean getIsHidden() {
        return this.isHidden;
    }

    public final boolean isLayerInitialised() {
        return this.locationLayerRenderer.isRendererInitialised();
    }

    public final void onLocationError(LocationError error) {
        error.getClass();
        MapboxLogger.logW(TAG, "Location error: " + error);
    }

    public final void onStart() {
        this.animationManager.onStart();
    }

    public final void onStop() {
        this.animationManager.onStop();
    }

    public final void setHidden$plugin_locationcomponent_release(boolean z14) {
        this.isHidden = z14;
    }

    public final void setLastBearing$plugin_locationcomponent_release(double d14) {
        this.lastBearing = d14;
    }

    public final void setLastLocation$plugin_locationcomponent_release(Point point) {
        this.lastLocation = point;
    }

    public final void setLocationLayerRenderer$plugin_locationcomponent_release(LocationLayerRenderer locationLayerRenderer) {
        locationLayerRenderer.getClass();
        this.locationLayerRenderer = locationLayerRenderer;
    }

    public final void setSettings(LocationComponentSettings locationComponentSettings) {
        locationComponentSettings.getClass();
        this.settings = locationComponentSettings;
    }

    public final void show(boolean forceUpdate) {
        if (forceUpdate || this.isHidden) {
            this.isHidden = false;
            this.locationLayerRenderer.show();
        }
    }

    public final void styleScaling$plugin_locationcomponent_release(LocationComponentSettings settings) {
        String modelScaleExpression;
        settings.getClass();
        LocationPuck locationPuck = settings.getLocationPuck();
        if (locationPuck instanceof LocationPuck2D) {
            modelScaleExpression = ((LocationPuck2D) locationPuck).getScaleExpression();
        } else {
            if (!(locationPuck instanceof LocationPuck3D)) {
                u0.r();
                return;
            }
            modelScaleExpression = ((LocationPuck3D) locationPuck).getModelScaleExpression();
        }
        if (modelScaleExpression != null) {
            LocationLayerRenderer locationLayerRenderer = this.locationLayerRenderer;
            Expected<String, Value> expectedFromJson = Value.fromJson(modelScaleExpression);
            expectedFromJson.getClass();
            String error = expectedFromJson.getError();
            if (error != null) {
                throw new MapboxLocationComponentException(error);
            }
            Value value = expectedFromJson.getValue();
            if (value == null) {
                throw new MapboxLocationComponentException("Error in parsing expression.");
            }
            locationLayerRenderer.styleScaling(value);
        }
    }

    public final void updateAccuracyRadiusAnimator(l<? super ValueAnimator, Unit> block) {
        block.getClass();
        this.animationManager.updateAccuracyRadiusAnimator(block);
    }

    public final void updateBearingAnimator(l<? super ValueAnimator, Unit> block) {
        block.getClass();
        this.animationManager.updateBearingAnimator(block);
    }

    public final void updateCurrentBearing(double[] bearings, l<? super ValueAnimator, Unit> options, boolean forceUpdate) {
        bearings.getClass();
        boolean puckBearingEnabled = this.settings.getPuckBearingEnabled();
        PuckAnimatorManager puckAnimatorManager = this.animationManager;
        if (puckBearingEnabled) {
            puckAnimatorManager.setPuckAnimationEnabled$plugin_locationcomponent_release(true);
            animateToBearing(bearings, options, forceUpdate);
        } else if (puckAnimatorManager.getPuckAnimationEnabled$plugin_locationcomponent_release()) {
            animateToBearing(new double[]{0.0d}, new AnonymousClass1(), forceUpdate);
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0031  */
    public final void updateCurrentPosition(Point[] points, l<? super ValueAnimator, Unit> options) {
        Point[] pointArr;
        points.getClass();
        if (this.settings.getEnabled()) {
            show$default(this, false, 1, null);
        }
        Point point = this.lastLocation;
        if (point != null) {
            w0 w0Var = new w0(2);
            w0Var.a(point);
            w0Var.b(points);
            ArrayList<Object> arrayList = w0Var.f105816a;
            pointArr = (Point[]) arrayList.toArray(new Point[arrayList.size()]);
            if (pointArr == null) {
                w0 w0Var2 = new w0(2);
                w0Var2.b(points);
                w0Var2.b(points);
                ArrayList<Object> arrayList2 = w0Var2.f105816a;
                pointArr = (Point[]) arrayList2.toArray(new Point[arrayList2.size()]);
            }
        } else {
            w0 w0Var3 = new w0(2);
            w0Var3.b(points);
            w0Var3.b(points);
            ArrayList<Object> arrayList3 = w0Var3.f105816a;
            pointArr = (Point[]) arrayList3.toArray(new Point[arrayList3.size()]);
        }
        this.animationManager.animatePosition((Point[]) Arrays.copyOf(pointArr, pointArr.length), options);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void updateHorizontalAccuracyRadius(double[] radius, l<? super ValueAnimator, Unit> options) {
        radius.getClass();
        p005kotlin.jvm.internal.l lVar = new p005kotlin.jvm.internal.l(2);
        double d14 = this.lastAccuracyRadius;
        int i14 = lVar.f105794b;
        int i15 = i14 + 1;
        lVar.f105794b = i15;
        lVar.f105802d[i14] = d14;
        lVar.f105794b = i14 + 2;
        lVar.f105795c[i15] = radius;
        double[] dArrA = lVar.a();
        this.animationManager.animateAccuracyRadius(Arrays.copyOf(dArrA, dArrA.length), options);
        if (radius.length != 0) {
            updateMaxPulsingRadiusToFollowAccuracyRing$plugin_locationcomponent_release(radius[radius.length - 1]);
        } else {
            j.s("Array is empty.");
        }
    }

    public final void updateLocationAnimator(l<? super ValueAnimator, Unit> block) {
        block.getClass();
        this.animationManager.updatePositionAnimator(block);
    }

    public final void updateMaxPulsingRadiusToFollowAccuracyRing$plugin_locationcomponent_release(double radius) {
        if (((int) this.settings.getPulsingMaxRadius()) == -1) {
            this.animationManager.updatePulsingRadius(radius / this.delegateProvider.getMapProjectionDelegate().getMetersPerPixelAtLatitude(this.delegateProvider.getMapCameraManagerDelegate().getCameraState().getCenter().latitude(), this.delegateProvider.getMapCameraManagerDelegate().getCameraState().getZoom()), this.settings);
        }
    }

    public final void updateSettings(LocationComponentSettings settings) {
        settings.getClass();
        this.settings = settings;
        this.positionManager.setLayerAbove$plugin_locationcomponent_release(settings.getLayerAbove());
        this.positionManager.setLayerBelow$plugin_locationcomponent_release(settings.getLayerBelow());
        this.locationLayerRenderer.clearBitmaps();
        this.locationLayerRenderer.removeLayers();
        LocationLayerRenderer locationLayerRenderer = getLocationLayerRenderer(settings);
        this.locationLayerRenderer = locationLayerRenderer;
        locationLayerRenderer.slot(settings.getSlot());
        initialize(this.delegateProvider.getMapStyleManagerDelegate());
    }

    public final void updateStyle(MapboxStyleManager style) {
        style.getClass();
        this.locationLayerRenderer.updateStyle(style);
        this.positionManager.updateStyle(style);
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/mapbox/maps/plugin/locationcomponent/LocationPuckManager$Companion;", "", "()V", "BEARING_UPDATE_THRESHOLD", "", "TAG", "", "plugin-locationcomponent_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.plugin.locationcomponent.LocationPuckManager$updateCurrentBearing$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroid/animation/ValueAnimator;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass1 extends w implements l<ValueAnimator, Unit> {
        public AnonymousClass1() {
            super(1);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(ValueAnimator valueAnimator) {
            valueAnimator.getClass();
            valueAnimator.setDuration(0L);
            valueAnimator.addListener(LocationPuckManager.this.disablePuckAnimationOnEnd);
        }

        @Override // e23.l
        public /* bridge */ /* synthetic */ Unit invoke(ValueAnimator valueAnimator) {
            invoke2(valueAnimator);
            return Unit.INSTANCE;
        }
    }
}
