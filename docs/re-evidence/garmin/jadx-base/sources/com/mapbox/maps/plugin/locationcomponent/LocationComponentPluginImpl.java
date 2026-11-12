package com.mapbox.maps.plugin.locationcomponent;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import ch.qos.logback.core.CoreConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.mapbox.bindgen.Expected;
import com.mapbox.common.location.LocationError;
import com.mapbox.geojson.Point;
import com.mapbox.maps.MapboxLocationComponentException;
import com.mapbox.maps.MapboxStyleManager;
import com.mapbox.maps.RenderedQueryGeometry;
import com.mapbox.maps.RenderedQueryOptions;
import com.mapbox.maps.plugin.PuckBearing;
import com.mapbox.maps.plugin.delegates.MapDelegateProvider;
import com.mapbox.maps.plugin.delegates.MapFeatureQueryDelegate;
import com.mapbox.maps.plugin.locationcomponent.animators.PuckAnimatorManager;
import com.mapbox.maps.plugin.locationcomponent.generated.LocationComponentAttributeParser;
import com.mapbox.maps.plugin.locationcomponent.generated.LocationComponentSettings;
import com.mapbox.maps.plugin.locationcomponent.generated.LocationComponentSettingsBase;
import com.mapbox.maps.plugin.locationcomponent.model.AnimatableModel;
import e23.l;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.x;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0013\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u001f\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0011\u0010\u001d\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001f\u0010\u0005J\u000f\u0010 \u001a\u00020\bH\u0016¢\u0006\u0004\b \u0010\u0005J)\u0010'\u001a\u00020\b2\u0006\u0010\"\u001a\u00020!2\b\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(J9\u0010'\u001a\u00020\b2\u0006\u0010\"\u001a\u00020!2\b\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010&\u001a\u00020%2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010*\u001a\u00020)H\u0001¢\u0006\u0004\b+\u0010,J9\u00102\u001a\u00020\b2\u0012\u0010.\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140-\"\u00020\u00142\u0014\u00101\u001a\u0010\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\b\u0018\u00010/H\u0016¢\u0006\u0004\b2\u00103J1\u00107\u001a\u00020\b2\n\u00106\u001a\u000204\"\u0002052\u0014\u00101\u001a\u0010\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\b\u0018\u00010/H\u0016¢\u0006\u0004\b7\u00108J1\u0010:\u001a\u00020\b2\n\u00109\u001a\u000204\"\u0002052\u0014\u00101\u001a\u0010\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\b\u0018\u00010/H\u0016¢\u0006\u0004\b:\u00108J#\u0010;\u001a\u00020\b2\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\b0/H\u0016¢\u0006\u0004\b;\u0010<J#\u0010=\u001a\u00020\b2\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\b0/H\u0016¢\u0006\u0004\b=\u0010<J\u0017\u0010@\u001a\u00020\b2\u0006\u0010?\u001a\u00020>H\u0016¢\u0006\u0004\b@\u0010AJ#\u0010B\u001a\u00020\b2\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\b0/H\u0016¢\u0006\u0004\bB\u0010<J\u0017\u0010E\u001a\u00020\b2\u0006\u0010D\u001a\u00020CH\u0016¢\u0006\u0004\bE\u0010FJ\u0017\u0010I\u001a\u00020\b2\u0006\u0010H\u001a\u00020GH\u0016¢\u0006\u0004\bI\u0010JJ\u000f\u0010K\u001a\u00020\bH\u0014¢\u0006\u0004\bK\u0010\u0005J\u0017\u0010P\u001a\u00020\b2\u0006\u0010M\u001a\u00020LH\u0000¢\u0006\u0004\bN\u0010OJ\u000f\u0010Q\u001a\u00020\bH\u0002¢\u0006\u0004\bQ\u0010\u0005J\u000f\u0010R\u001a\u00020\bH\u0002¢\u0006\u0004\bR\u0010\u0005J\u001b\u0010V\u001a\u00020\b*\u00020S2\u0006\u0010U\u001a\u00020TH\u0002¢\u0006\u0004\bV\u0010WR\u0016\u0010D\u001a\u00020C8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bD\u0010XR\u001c\u0010Z\u001a\b\u0012\u0004\u0012\u00020!0Y8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bZ\u0010[R*\u0010*\u001a\u0004\u0018\u00010)8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b*\u0010\\\u0012\u0004\ba\u0010\u0005\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R*\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u001a\u0010b\u0012\u0004\be\u0010\u0005\u001a\u0004\bc\u0010\u001e\"\u0004\bd\u0010\u001cR(\u0010g\u001a\u00020f8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\bg\u0010h\u0012\u0004\bm\u0010\u0005\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR\u0018\u0010n\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010oR\u0018\u0010p\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010qR\u0018\u0010r\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u0010qR\u001a\u0010t\u001a\b\u0012\u0004\u0012\u00020\u00060s8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010uR\u001a\u0010v\u001a\b\u0012\u0004\u0012\u00020\f0s8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bv\u0010uR\u001a\u0010w\u001a\b\u0012\u0004\u0012\u00020\u00100s8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bw\u0010uR \u0010x\u001a\u00020\u00068\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bx\u0010y\u0012\u0004\b|\u0010\u0005\u001a\u0004\bz\u0010{R\"\u0010}\u001a\u00020\f8\u0000X\u0081\u0004¢\u0006\u0014\n\u0004\b}\u0010~\u0012\u0005\b\u0081\u0001\u0010\u0005\u001a\u0005\b\u007f\u0010\u0080\u0001R&\u0010\u0082\u0001\u001a\u00020\u00108\u0000X\u0081\u0004¢\u0006\u0017\n\u0006\b\u0082\u0001\u0010\u0083\u0001\u0012\u0005\b\u0086\u0001\u0010\u0005\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001R'\u0010U\u001a\u00020T8\u0014@\u0014X\u0094.¢\u0006\u0017\n\u0005\bU\u0010\u0087\u0001\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001\"\u0006\b\u008a\u0001\u0010\u008b\u0001¨\u0006\u008c\u0001"}, d2 = {"Lcom/mapbox/maps/plugin/locationcomponent/LocationComponentPluginImpl;", "Lcom/mapbox/maps/plugin/locationcomponent/LocationComponentPlugin;", "Lcom/mapbox/maps/plugin/locationcomponent/LocationConsumer;", "Lcom/mapbox/maps/plugin/locationcomponent/generated/LocationComponentSettingsBase;", "<init>", "()V", "Lcom/mapbox/maps/plugin/locationcomponent/OnIndicatorPositionChangedListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "addOnIndicatorPositionChangedListener", "(Lcom/mapbox/maps/plugin/locationcomponent/OnIndicatorPositionChangedListener;)V", "removeOnIndicatorPositionChangedListener", "Lcom/mapbox/maps/plugin/locationcomponent/OnIndicatorBearingChangedListener;", "addOnIndicatorBearingChangedListener", "(Lcom/mapbox/maps/plugin/locationcomponent/OnIndicatorBearingChangedListener;)V", "removeOnIndicatorBearingChangedListener", "Lcom/mapbox/maps/plugin/locationcomponent/OnIndicatorAccuracyRadiusChangedListener;", "addOnIndicatorAccuracyRadiusChangedListener", "(Lcom/mapbox/maps/plugin/locationcomponent/OnIndicatorAccuracyRadiusChangedListener;)V", "removeOnIndicatorAccuracyRadiusChangedListener", "Lcom/mapbox/geojson/Point;", "point", "Lcom/mapbox/maps/plugin/locationcomponent/PuckLocatedAtPointListener;", "isLocatedAt", "(Lcom/mapbox/geojson/Point;Lcom/mapbox/maps/plugin/locationcomponent/PuckLocatedAtPointListener;)V", "Lcom/mapbox/maps/plugin/locationcomponent/LocationProvider;", "locationProvider", "setLocationProvider", "(Lcom/mapbox/maps/plugin/locationcomponent/LocationProvider;)V", "getLocationProvider", "()Lcom/mapbox/maps/plugin/locationcomponent/LocationProvider;", "onStart", "onStop", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "pixelRatio", "bind", "(Landroid/content/Context;Landroid/util/AttributeSet;F)V", "Lcom/mapbox/maps/plugin/locationcomponent/LocationPuckManager;", "locationPuckManager", "bind$plugin_locationcomponent_release", "(Landroid/content/Context;Landroid/util/AttributeSet;FLcom/mapbox/maps/plugin/locationcomponent/LocationProvider;Lcom/mapbox/maps/plugin/locationcomponent/LocationPuckManager;)V", "", FirebaseAnalytics.Param.LOCATION, "Lkotlin/Function1;", "Landroid/animation/ValueAnimator;", "options", "onLocationUpdated", "([Lcom/mapbox/geojson/Point;Le23/l;)V", "", "", "bearing", "onBearingUpdated", "([DLe23/l;)V", "radius", "onHorizontalAccuracyRadiusUpdated", "onPuckLocationAnimatorDefaultOptionsUpdated", "(Le23/l;)V", "onPuckBearingAnimatorDefaultOptionsUpdated", "Lcom/mapbox/common/location/LocationError;", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "onError", "(Lcom/mapbox/common/location/LocationError;)V", "onPuckAccuracyRadiusAnimatorDefaultOptionsUpdated", "Lcom/mapbox/maps/plugin/delegates/MapDelegateProvider;", "delegateProvider", "onDelegateProvider", "(Lcom/mapbox/maps/plugin/delegates/MapDelegateProvider;)V", "Lcom/mapbox/maps/MapboxStyleManager;", TtmlNode.TAG_STYLE, "onStyleChanged", "(Lcom/mapbox/maps/MapboxStyleManager;)V", "applySettings", "Lcom/mapbox/maps/plugin/locationcomponent/model/AnimatableModel;", "animatableModel", "bindToAnimatableModel$plugin_locationcomponent_release", "(Lcom/mapbox/maps/plugin/locationcomponent/model/AnimatableModel;)V", "bindToAnimatableModel", "activateLocationComponent", "deactivateLocationComponent", "Lcom/mapbox/maps/plugin/locationcomponent/DefaultLocationProvider;", "Lcom/mapbox/maps/plugin/locationcomponent/generated/LocationComponentSettings;", "internalSettings", "updatePuckBearingSettings", "(Lcom/mapbox/maps/plugin/locationcomponent/DefaultLocationProvider;Lcom/mapbox/maps/plugin/locationcomponent/generated/LocationComponentSettings;)V", "Lcom/mapbox/maps/plugin/delegates/MapDelegateProvider;", "Ljava/lang/ref/WeakReference;", "weakContext", "Ljava/lang/ref/WeakReference;", "Lcom/mapbox/maps/plugin/locationcomponent/LocationPuckManager;", "getLocationPuckManager$plugin_locationcomponent_release", "()Lcom/mapbox/maps/plugin/locationcomponent/LocationPuckManager;", "setLocationPuckManager$plugin_locationcomponent_release", "(Lcom/mapbox/maps/plugin/locationcomponent/LocationPuckManager;)V", "getLocationPuckManager$plugin_locationcomponent_release$annotations", "Lcom/mapbox/maps/plugin/locationcomponent/LocationProvider;", "getLocationProvider$plugin_locationcomponent_release", "setLocationProvider$plugin_locationcomponent_release", "getLocationProvider$plugin_locationcomponent_release$annotations", "", "isLocationComponentActivated", "Z", "isLocationComponentActivated$plugin_locationcomponent_release", "()Z", "setLocationComponentActivated$plugin_locationcomponent_release", "(Z)V", "isLocationComponentActivated$plugin_locationcomponent_release$annotations", "lastIndicatorPosition", "Lcom/mapbox/geojson/Point;", "lastIndicatorBearing", "Ljava/lang/Double;", "lastIndicatorAccuracyRadius", "Ljava/util/concurrent/CopyOnWriteArraySet;", "onIndicatorPositionChangedListeners", "Ljava/util/concurrent/CopyOnWriteArraySet;", "onIndicatorBearingChangedListeners", "onIndicatorAccuracyRadiusChangedListeners", "indicatorPositionChangedListener", "Lcom/mapbox/maps/plugin/locationcomponent/OnIndicatorPositionChangedListener;", "getIndicatorPositionChangedListener$plugin_locationcomponent_release", "()Lcom/mapbox/maps/plugin/locationcomponent/OnIndicatorPositionChangedListener;", "getIndicatorPositionChangedListener$plugin_locationcomponent_release$annotations", "indicatorBearingChangedListener", "Lcom/mapbox/maps/plugin/locationcomponent/OnIndicatorBearingChangedListener;", "getIndicatorBearingChangedListener$plugin_locationcomponent_release", "()Lcom/mapbox/maps/plugin/locationcomponent/OnIndicatorBearingChangedListener;", "getIndicatorBearingChangedListener$plugin_locationcomponent_release$annotations", "indicatorAccuracyRadiusChangedListener", "Lcom/mapbox/maps/plugin/locationcomponent/OnIndicatorAccuracyRadiusChangedListener;", "getIndicatorAccuracyRadiusChangedListener$plugin_locationcomponent_release", "()Lcom/mapbox/maps/plugin/locationcomponent/OnIndicatorAccuracyRadiusChangedListener;", "getIndicatorAccuracyRadiusChangedListener$plugin_locationcomponent_release$annotations", "Lcom/mapbox/maps/plugin/locationcomponent/generated/LocationComponentSettings;", "getInternalSettings", "()Lcom/mapbox/maps/plugin/locationcomponent/generated/LocationComponentSettings;", "setInternalSettings", "(Lcom/mapbox/maps/plugin/locationcomponent/generated/LocationComponentSettings;)V", "plugin-locationcomponent_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class LocationComponentPluginImpl extends LocationComponentSettingsBase implements LocationComponentPlugin, LocationConsumer {
    private MapDelegateProvider delegateProvider;
    protected LocationComponentSettings internalSettings;
    private boolean isLocationComponentActivated;
    private Double lastIndicatorAccuracyRadius;
    private Double lastIndicatorBearing;
    private Point lastIndicatorPosition;
    private LocationProvider locationProvider;
    private LocationPuckManager locationPuckManager;
    private WeakReference<Context> weakContext;
    private final CopyOnWriteArraySet<OnIndicatorPositionChangedListener> onIndicatorPositionChangedListeners = new CopyOnWriteArraySet<>();
    private final CopyOnWriteArraySet<OnIndicatorBearingChangedListener> onIndicatorBearingChangedListeners = new CopyOnWriteArraySet<>();
    private final CopyOnWriteArraySet<OnIndicatorAccuracyRadiusChangedListener> onIndicatorAccuracyRadiusChangedListeners = new CopyOnWriteArraySet<>();
    private final OnIndicatorPositionChangedListener indicatorPositionChangedListener = new OnIndicatorPositionChangedListener() { // from class: com.mapbox.maps.plugin.locationcomponent.c
        @Override // com.mapbox.maps.plugin.locationcomponent.OnIndicatorPositionChangedListener
        public final void onIndicatorPositionChanged(Point point) {
            LocationComponentPluginImpl.indicatorPositionChangedListener$lambda$1(this.f54567a, point);
        }
    };
    private final OnIndicatorBearingChangedListener indicatorBearingChangedListener = new OnIndicatorBearingChangedListener() { // from class: com.mapbox.maps.plugin.locationcomponent.d
        @Override // com.mapbox.maps.plugin.locationcomponent.OnIndicatorBearingChangedListener
        public final void onIndicatorBearingChanged(double d14) {
            LocationComponentPluginImpl.indicatorBearingChangedListener$lambda$7(this.f54568a, d14);
        }
    };
    private final OnIndicatorAccuracyRadiusChangedListener indicatorAccuracyRadiusChangedListener = new OnIndicatorAccuracyRadiusChangedListener() { // from class: com.mapbox.maps.plugin.locationcomponent.e
        @Override // com.mapbox.maps.plugin.locationcomponent.OnIndicatorAccuracyRadiusChangedListener
        public final void onIndicatorAccuracyRadiusChanged(double d14) {
            LocationComponentPluginImpl.indicatorAccuracyRadiusChangedListener$lambda$8(this.f54569a, d14);
        }
    };

    private final void activateLocationComponent() {
        if (getInternalSettings().getEnabled()) {
            MapDelegateProvider mapDelegateProvider = this.delegateProvider;
            if (mapDelegateProvider == null) {
                s.m("delegateProvider");
                throw null;
            }
            MapboxStyleManager mapStyleManagerDelegate = mapDelegateProvider.getMapStyleManagerDelegate();
            LocationPuckManager locationPuckManager = this.locationPuckManager;
            if (locationPuckManager != null && locationPuckManager.isLayerInitialised() && this.isLocationComponentActivated) {
                return;
            }
            if (this.locationPuckManager == null) {
                LocationComponentSettings internalSettings = getInternalSettings();
                WeakReference<Context> weakReference = this.weakContext;
                if (weakReference == null) {
                    s.m("weakContext");
                    throw null;
                }
                MapDelegateProvider mapDelegateProvider2 = this.delegateProvider;
                if (mapDelegateProvider2 == null) {
                    s.m("delegateProvider");
                    throw null;
                }
                this.locationPuckManager = new LocationPuckManager(internalSettings, weakReference, mapDelegateProvider2, new LocationComponentPositionManager(mapStyleManagerDelegate, getInternalSettings().getLayerAbove(), getInternalSettings().getLayerBelow()), new PuckAnimatorManager(this.indicatorPositionChangedListener, this.indicatorBearingChangedListener, this.indicatorAccuracyRadiusChangedListener, mapStyleManagerDelegate.getPixelRatio()));
            }
            LocationPuckManager locationPuckManager2 = this.locationPuckManager;
            if (locationPuckManager2 != null) {
                locationPuckManager2.initialize(mapStyleManagerDelegate);
            }
            LocationPuckManager locationPuckManager3 = this.locationPuckManager;
            if (locationPuckManager3 != null) {
                locationPuckManager3.onStart();
            }
            LocationProvider locationProvider = this.locationProvider;
            if (locationProvider != null) {
                locationProvider.registerLocationConsumer(this);
            }
            this.isLocationComponentActivated = true;
        }
    }

    private final void deactivateLocationComponent() {
        LocationPuckManager locationPuckManager = this.locationPuckManager;
        if (locationPuckManager != null) {
            locationPuckManager.cleanUp();
        }
        this.locationPuckManager = null;
        LocationProvider locationProvider = this.locationProvider;
        if (locationProvider != null) {
            locationProvider.unRegisterLocationConsumer(this);
        }
        this.isLocationComponentActivated = false;
    }

    public static /* synthetic */ void getIndicatorAccuracyRadiusChangedListener$plugin_locationcomponent_release$annotations() {
    }

    public static /* synthetic */ void getIndicatorBearingChangedListener$plugin_locationcomponent_release$annotations() {
    }

    public static /* synthetic */ void getIndicatorPositionChangedListener$plugin_locationcomponent_release$annotations() {
    }

    public static /* synthetic */ void getLocationProvider$plugin_locationcomponent_release$annotations() {
    }

    public static /* synthetic */ void getLocationPuckManager$plugin_locationcomponent_release$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void indicatorAccuracyRadiusChangedListener$lambda$8(LocationComponentPluginImpl locationComponentPluginImpl, double d14) {
        locationComponentPluginImpl.getClass();
        locationComponentPluginImpl.lastIndicatorAccuracyRadius = Double.valueOf(d14);
        Iterator<OnIndicatorAccuracyRadiusChangedListener> it = locationComponentPluginImpl.onIndicatorAccuracyRadiusChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().onIndicatorAccuracyRadiusChanged(d14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void indicatorBearingChangedListener$lambda$7(LocationComponentPluginImpl locationComponentPluginImpl, double d14) {
        locationComponentPluginImpl.getClass();
        locationComponentPluginImpl.lastIndicatorBearing = Double.valueOf(d14);
        Iterator<OnIndicatorBearingChangedListener> it = locationComponentPluginImpl.onIndicatorBearingChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().onIndicatorBearingChanged(d14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void indicatorPositionChangedListener$lambda$1(LocationComponentPluginImpl locationComponentPluginImpl, Point point) {
        locationComponentPluginImpl.getClass();
        point.getClass();
        locationComponentPluginImpl.lastIndicatorPosition = point;
        Iterator<OnIndicatorPositionChangedListener> it = locationComponentPluginImpl.onIndicatorPositionChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().onIndicatorPositionChanged(point);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void isLocatedAt$lambda$6(PuckLocatedAtPointListener puckLocatedAtPointListener, Expected expected) {
        puckLocatedAtPointListener.getClass();
        expected.getClass();
        List list = (List) expected.getValue();
        if (list != null) {
            if (list.isEmpty()) {
                puckLocatedAtPointListener.onResult(false);
            } else {
                puckLocatedAtPointListener.onResult(true);
            }
        }
        String str = (String) expected.getError();
        if (str != null) {
            throw new MapboxLocationComponentException(str);
        }
    }

    public static /* synthetic */ void isLocationComponentActivated$plugin_locationcomponent_release$annotations() {
    }

    private final void updatePuckBearingSettings(DefaultLocationProvider defaultLocationProvider, LocationComponentSettings locationComponentSettings) {
        PuckBearing puckBearing = locationComponentSettings.getPuckBearing();
        if (!locationComponentSettings.getPuckBearingEnabled()) {
            puckBearing = null;
        }
        defaultLocationProvider.updatePuckBearing(puckBearing);
    }

    @Override // com.mapbox.maps.plugin.locationcomponent.LocationComponentPlugin
    public void addOnIndicatorAccuracyRadiusChangedListener(OnIndicatorAccuracyRadiusChangedListener listener) {
        listener.getClass();
        this.onIndicatorAccuracyRadiusChangedListeners.add(listener);
        Double d14 = this.lastIndicatorAccuracyRadius;
        if (d14 != null) {
            listener.onIndicatorAccuracyRadiusChanged(d14.doubleValue());
        }
    }

    @Override // com.mapbox.maps.plugin.locationcomponent.LocationComponentPlugin
    public void addOnIndicatorBearingChangedListener(OnIndicatorBearingChangedListener listener) {
        listener.getClass();
        this.onIndicatorBearingChangedListeners.add(listener);
        Double d14 = this.lastIndicatorBearing;
        if (d14 != null) {
            listener.onIndicatorBearingChanged(d14.doubleValue());
        }
    }

    @Override // com.mapbox.maps.plugin.locationcomponent.LocationComponentPlugin
    public void addOnIndicatorPositionChangedListener(OnIndicatorPositionChangedListener listener) {
        listener.getClass();
        this.onIndicatorPositionChangedListeners.add(listener);
        Point point = this.lastIndicatorPosition;
        if (point != null) {
            listener.onIndicatorPositionChanged(point);
        }
    }

    @Override // com.mapbox.maps.plugin.locationcomponent.generated.LocationComponentSettingsBase
    public void applySettings() {
        if (getInternalSettings().getEnabled() && !this.isLocationComponentActivated) {
            WeakReference<Context> weakReference = this.weakContext;
            if (weakReference == null) {
                s.m("weakContext");
                throw null;
            }
            Context context = weakReference.get();
            if (context != null) {
                if (this.locationProvider == null) {
                    this.locationProvider = new DefaultLocationProvider(context);
                }
                activateLocationComponent();
            }
        }
        if (!getInternalSettings().getEnabled()) {
            deactivateLocationComponent();
            return;
        }
        LocationPuckManager locationPuckManager = this.locationPuckManager;
        if (locationPuckManager != null) {
            locationPuckManager.updateSettings(getInternalSettings());
        }
        LocationProvider locationProvider = this.locationProvider;
        DefaultLocationProvider defaultLocationProvider = locationProvider instanceof DefaultLocationProvider ? (DefaultLocationProvider) locationProvider : null;
        if (defaultLocationProvider != null) {
            updatePuckBearingSettings(defaultLocationProvider, getInternalSettings());
        }
    }

    @Override // com.mapbox.maps.plugin.ContextBinder
    public void bind(Context context, AttributeSet attrs, float pixelRatio) {
        context.getClass();
        this.weakContext = new WeakReference<>(context);
        setInternalSettings(LocationComponentAttributeParser.INSTANCE.parseLocationComponentSettings(context, attrs, pixelRatio));
        if (getInternalSettings().getEnabled() && this.locationProvider == null) {
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            DefaultLocationProvider defaultLocationProvider = new DefaultLocationProvider(applicationContext);
            updatePuckBearingSettings(defaultLocationProvider, getInternalSettings());
            this.locationProvider = defaultLocationProvider;
        }
    }

    public final void bind$plugin_locationcomponent_release(Context context, AttributeSet attrs, float pixelRatio, LocationProvider locationProvider, LocationPuckManager locationPuckManager) {
        context.getClass();
        locationProvider.getClass();
        locationPuckManager.getClass();
        this.weakContext = new WeakReference<>(context);
        setInternalSettings(LocationComponentAttributeParser.INSTANCE.parseLocationComponentSettings(context, attrs, pixelRatio));
        this.locationProvider = locationProvider;
        this.locationPuckManager = locationPuckManager;
    }

    public final void bindToAnimatableModel$plugin_locationcomponent_release(AnimatableModel animatableModel) {
        animatableModel.getClass();
        MapDelegateProvider mapDelegateProvider = this.delegateProvider;
        if (mapDelegateProvider != null) {
            animatableModel.bindTo$plugin_locationcomponent_release(mapDelegateProvider.getMapFeatureStateDelegate());
        } else {
            s.m("delegateProvider");
            throw null;
        }
    }

    @Override // com.mapbox.maps.plugin.MapPlugin
    public void cleanup() {
        LocationComponentPlugin.DefaultImpls.cleanup(this);
    }

    /* JADX INFO: renamed from: getIndicatorAccuracyRadiusChangedListener$plugin_locationcomponent_release, reason: from getter */
    public final OnIndicatorAccuracyRadiusChangedListener getIndicatorAccuracyRadiusChangedListener() {
        return this.indicatorAccuracyRadiusChangedListener;
    }

    /* JADX INFO: renamed from: getIndicatorBearingChangedListener$plugin_locationcomponent_release, reason: from getter */
    public final OnIndicatorBearingChangedListener getIndicatorBearingChangedListener() {
        return this.indicatorBearingChangedListener;
    }

    /* JADX INFO: renamed from: getIndicatorPositionChangedListener$plugin_locationcomponent_release, reason: from getter */
    public final OnIndicatorPositionChangedListener getIndicatorPositionChangedListener() {
        return this.indicatorPositionChangedListener;
    }

    @Override // com.mapbox.maps.plugin.locationcomponent.generated.LocationComponentSettingsBase
    public LocationComponentSettings getInternalSettings() {
        LocationComponentSettings locationComponentSettings = this.internalSettings;
        if (locationComponentSettings != null) {
            return locationComponentSettings;
        }
        s.m("internalSettings");
        throw null;
    }

    @Override // com.mapbox.maps.plugin.locationcomponent.LocationComponentPlugin
    public LocationProvider getLocationProvider() {
        return this.locationProvider;
    }

    public final LocationProvider getLocationProvider$plugin_locationcomponent_release() {
        return this.locationProvider;
    }

    /* JADX INFO: renamed from: getLocationPuckManager$plugin_locationcomponent_release, reason: from getter */
    public final LocationPuckManager getLocationPuckManager() {
        return this.locationPuckManager;
    }

    @Override // com.mapbox.maps.plugin.MapPlugin
    public void initialize() {
        LocationComponentPlugin.DefaultImpls.initialize(this);
    }

    @Override // com.mapbox.maps.plugin.locationcomponent.LocationComponentPlugin
    public void isLocatedAt(Point point, PuckLocatedAtPointListener listener) {
        point.getClass();
        listener.getClass();
        MapDelegateProvider mapDelegateProvider = this.delegateProvider;
        if (mapDelegateProvider == null) {
            s.m("delegateProvider");
            throw null;
        }
        MapFeatureQueryDelegate mapFeatureQueryDelegate = mapDelegateProvider.getMapFeatureQueryDelegate();
        MapDelegateProvider mapDelegateProvider2 = this.delegateProvider;
        if (mapDelegateProvider2 != null) {
            mapFeatureQueryDelegate.queryRenderedFeatures(new RenderedQueryGeometry(mapDelegateProvider2.getMapCameraManagerDelegate().pixelForCoordinate(point)), new RenderedQueryOptions(x.k(LocationComponentConstants.LOCATION_INDICATOR_LAYER, LocationComponentConstants.MODEL_LAYER), null), new a(listener));
        } else {
            s.m("delegateProvider");
            throw null;
        }
    }

    /* JADX INFO: renamed from: isLocationComponentActivated$plugin_locationcomponent_release, reason: from getter */
    public final boolean getIsLocationComponentActivated() {
        return this.isLocationComponentActivated;
    }

    @Override // com.mapbox.maps.plugin.locationcomponent.LocationConsumer
    public void onBearingUpdated(double[] bearing, l<? super ValueAnimator, Unit> options) {
        bearing.getClass();
        LocationPuckManager locationPuckManager = this.locationPuckManager;
        if (locationPuckManager != null) {
            LocationPuckManager.updateCurrentBearing$default(locationPuckManager, Arrays.copyOf(bearing, bearing.length), options, false, 4, null);
        }
    }

    @Override // com.mapbox.maps.plugin.MapPlugin
    public void onDelegateProvider(MapDelegateProvider delegateProvider) {
        delegateProvider.getClass();
        this.delegateProvider = delegateProvider;
    }

    @Override // com.mapbox.maps.plugin.locationcomponent.LocationConsumer
    public void onError(LocationError error) {
        error.getClass();
        LocationPuckManager locationPuckManager = this.locationPuckManager;
        if (locationPuckManager != null) {
            locationPuckManager.onLocationError(error);
        }
    }

    @Override // com.mapbox.maps.plugin.locationcomponent.LocationConsumer
    public void onHorizontalAccuracyRadiusUpdated(double[] radius, l<? super ValueAnimator, Unit> options) {
        radius.getClass();
        LocationPuckManager locationPuckManager = this.locationPuckManager;
        if (locationPuckManager != null) {
            locationPuckManager.updateHorizontalAccuracyRadius(Arrays.copyOf(radius, radius.length), options);
        }
    }

    @Override // com.mapbox.maps.plugin.locationcomponent.LocationConsumer
    public void onLocationUpdated(Point[] location, l<? super ValueAnimator, Unit> options) {
        location.getClass();
        LocationPuckManager locationPuckManager = this.locationPuckManager;
        if (locationPuckManager != null) {
            locationPuckManager.updateCurrentPosition((Point[]) Arrays.copyOf(location, location.length), options);
        }
    }

    @Override // com.mapbox.maps.plugin.locationcomponent.LocationConsumer
    public void onPuckAccuracyRadiusAnimatorDefaultOptionsUpdated(l<? super ValueAnimator, Unit> options) {
        options.getClass();
        LocationPuckManager locationPuckManager = this.locationPuckManager;
        if (locationPuckManager != null) {
            locationPuckManager.updateAccuracyRadiusAnimator(options);
        }
    }

    @Override // com.mapbox.maps.plugin.locationcomponent.LocationConsumer
    public void onPuckBearingAnimatorDefaultOptionsUpdated(l<? super ValueAnimator, Unit> options) {
        options.getClass();
        LocationPuckManager locationPuckManager = this.locationPuckManager;
        if (locationPuckManager != null) {
            locationPuckManager.updateBearingAnimator(options);
        }
    }

    @Override // com.mapbox.maps.plugin.locationcomponent.LocationConsumer
    public void onPuckLocationAnimatorDefaultOptionsUpdated(l<? super ValueAnimator, Unit> options) {
        options.getClass();
        LocationPuckManager locationPuckManager = this.locationPuckManager;
        if (locationPuckManager != null) {
            locationPuckManager.updateLocationAnimator(options);
        }
    }

    @Override // com.mapbox.maps.plugin.LifecyclePlugin
    public void onStart() {
        activateLocationComponent();
    }

    @Override // com.mapbox.maps.plugin.LifecyclePlugin
    public void onStop() {
        this.isLocationComponentActivated = false;
        LocationPuckManager locationPuckManager = this.locationPuckManager;
        if (locationPuckManager != null) {
            locationPuckManager.onStop();
        }
        LocationProvider locationProvider = this.locationProvider;
        if (locationProvider != null) {
            locationProvider.unRegisterLocationConsumer(this);
        }
    }

    @Override // com.mapbox.maps.plugin.MapStyleObserverPlugin
    public void onStyleChanged(MapboxStyleManager style) {
        style.getClass();
        LocationPuckManager locationPuckManager = this.locationPuckManager;
        if (locationPuckManager != null) {
            locationPuckManager.updateStyle(style);
        }
    }

    @Override // com.mapbox.maps.plugin.locationcomponent.LocationComponentPlugin
    public void removeOnIndicatorAccuracyRadiusChangedListener(OnIndicatorAccuracyRadiusChangedListener listener) {
        listener.getClass();
        this.onIndicatorAccuracyRadiusChangedListeners.remove(listener);
    }

    @Override // com.mapbox.maps.plugin.locationcomponent.LocationComponentPlugin
    public void removeOnIndicatorBearingChangedListener(OnIndicatorBearingChangedListener listener) {
        listener.getClass();
        this.onIndicatorBearingChangedListeners.remove(listener);
    }

    @Override // com.mapbox.maps.plugin.locationcomponent.LocationComponentPlugin
    public void removeOnIndicatorPositionChangedListener(OnIndicatorPositionChangedListener listener) {
        listener.getClass();
        this.onIndicatorPositionChangedListeners.remove(listener);
    }

    @Override // com.mapbox.maps.plugin.locationcomponent.generated.LocationComponentSettingsBase
    public void setInternalSettings(LocationComponentSettings locationComponentSettings) {
        locationComponentSettings.getClass();
        this.internalSettings = locationComponentSettings;
    }

    public final void setLocationComponentActivated$plugin_locationcomponent_release(boolean z14) {
        this.isLocationComponentActivated = z14;
    }

    @Override // com.mapbox.maps.plugin.locationcomponent.LocationComponentPlugin
    public void setLocationProvider(LocationProvider locationProvider) {
        locationProvider.getClass();
        LocationProvider locationProvider2 = this.locationProvider;
        if (locationProvider2 != null) {
            locationProvider2.unRegisterLocationConsumer(this);
        }
        this.locationProvider = locationProvider;
        if (this.isLocationComponentActivated) {
            locationProvider.registerLocationConsumer(this);
        }
    }

    public final void setLocationProvider$plugin_locationcomponent_release(LocationProvider locationProvider) {
        this.locationProvider = locationProvider;
    }

    public final void setLocationPuckManager$plugin_locationcomponent_release(LocationPuckManager locationPuckManager) {
        this.locationPuckManager = locationPuckManager;
    }
}
