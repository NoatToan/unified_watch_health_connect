package com.mapbox.maps;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.gncs.NotificationConstants;
import com.mapbox.annotation.module.MapboxModuleType;
import com.mapbox.bindgen.Expected;
import com.mapbox.common.EventsServerOptions;
import com.mapbox.common.EventsService;
import com.mapbox.common.SdkInformation;
import com.mapbox.common.TelemetryService;
import com.mapbox.common.module.provider.MapboxModuleProvider;
import com.mapbox.common.module.provider.ModuleProviderArgument;
import com.mapbox.maps.geofencing.MapGeofencingConsent;
import com.mapbox.maps.module.MapTelemetry;
import com.mapbox.maps.plugin.MapDelegateProviderImpl;
import com.mapbox.maps.plugin.MapPluginRegistry;
import o13.r;
import o53.a0;
import o53.b0;
import o53.c0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u000e\u001a\u00020\r*\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\f¢\u0006\u0004\b\u0019\u0010\u001aJ%\u0010!\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b!\u0010\"J-\u0010*\u001a\u00020)2\u0006\u0010#\u001a\u00020 2\u0006\u0010$\u001a\u00020\r2\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b*\u0010+J\u0015\u0010,\u001a\u00020%2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b,\u0010-J\r\u0010.\u001a\u00020'¢\u0006\u0004\b.\u0010/J\r\u00101\u001a\u000200¢\u0006\u0004\b1\u0010\u0003R\u0016\u00102\u001a\u00020%8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106¨\u00067"}, d2 = {"Lcom/mapbox/maps/MapProvider;", "", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/mapbox/annotation/module/MapboxModuleType;", NotificationConstants.KEY_DATA_MIME_TYPE, "", "Lcom/mapbox/common/module/provider/ModuleProviderArgument;", "paramsProvider", "(Landroid/content/Context;Lcom/mapbox/annotation/module/MapboxModuleType;)[Lcom/mapbox/common/module/provider/ModuleProviderArgument;", "Lcom/mapbox/maps/MapView;", "Lcom/mapbox/maps/MapController;", "getController", "(Lcom/mapbox/maps/MapView;)Lcom/mapbox/maps/MapController;", "Lcom/mapbox/maps/MapInitOptions;", "mapInitOptions", "Lcom/mapbox/maps/MapClient;", "mapClient", "Lcom/mapbox/maps/NativeMapImpl;", "getNativeMapWrapper", "(Lcom/mapbox/maps/MapInitOptions;Lcom/mapbox/maps/MapClient;)Lcom/mapbox/maps/NativeMapImpl;", "mapView", "Lcom/mapbox/maps/Map;", "getNativeMapCore", "(Lcom/mapbox/maps/MapView;)Lcom/mapbox/maps/Map;", "nativeMap", "Lcom/mapbox/maps/NativeObserver;", "nativeObserver", "", "pixelRatio", "Lcom/mapbox/maps/MapboxMap;", "getMapboxMap", "(Lcom/mapbox/maps/NativeMapImpl;Lcom/mapbox/maps/NativeObserver;F)Lcom/mapbox/maps/MapboxMap;", "mapboxMap", "mapController", "Lcom/mapbox/maps/module/MapTelemetry;", "telemetry", "Lcom/mapbox/maps/geofencing/MapGeofencingConsent;", "mapGeofencingConsent", "Lcom/mapbox/maps/plugin/MapPluginRegistry;", "getMapPluginRegistry", "(Lcom/mapbox/maps/MapboxMap;Lcom/mapbox/maps/MapController;Lcom/mapbox/maps/module/MapTelemetry;Lcom/mapbox/maps/geofencing/MapGeofencingConsent;)Lcom/mapbox/maps/plugin/MapPluginRegistry;", "getMapTelemetryInstance", "(Landroid/content/Context;)Lcom/mapbox/maps/module/MapTelemetry;", "getMapGeofencingConsent", "()Lcom/mapbox/maps/geofencing/MapGeofencingConsent;", "", "flushPendingEvents", "mapTelemetry", "Lcom/mapbox/maps/module/MapTelemetry;", "Lo53/b0;", "mainScope", "Lo53/b0;", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class MapProvider {
    public static final MapProvider INSTANCE = new MapProvider();
    private static final b0 mainScope;
    private static MapTelemetry mapTelemetry;

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MapboxModuleType.values().length];
            try {
                iArr[MapboxModuleType.MapTelemetry.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.MapProvider$getMapTelemetryInstance$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "Lcom/mapbox/common/module/provider/ModuleProviderArgument;", "it", "Lcom/mapbox/annotation/module/MapboxModuleType;", "invoke", "(Lcom/mapbox/annotation/module/MapboxModuleType;)[Lcom/mapbox/common/module/provider/ModuleProviderArgument;"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass2 extends w implements e23.l<MapboxModuleType, ModuleProviderArgument[]> {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Context context) {
            super(1);
            this.$context = context;
        }

        @Override // e23.l
        public final ModuleProviderArgument[] invoke(MapboxModuleType mapboxModuleType) {
            mapboxModuleType.getClass();
            return MapProvider.INSTANCE.paramsProvider(this.$context, MapboxModuleType.MapTelemetry);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.MapProvider$getMapTelemetryInstance$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 7, 1})
    @v13.e(c = "com.mapbox.maps.MapProvider$getMapTelemetryInstance$3", f = "MapProvider.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass3 extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {
        int label;

        public AnonymousClass3(t13.d<? super AnonymousClass3> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new AnonymousClass3(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((AnonymousClass3) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            MapTelemetry mapTelemetry = MapProvider.mapTelemetry;
            if (mapTelemetry != null) {
                mapTelemetry.onAppUserTurnstileEvent();
                return Unit.INSTANCE;
            }
            s.m("mapTelemetry");
            throw null;
        }
    }

    static {
        t13.g gVarPlus = new a0(MapController.TAG).plus(ge1.b.h());
        x53.c cVar = s0.f129406a;
        mainScope = c0.a(gVarPlus.plus(u53.o.f168762a));
    }

    private MapProvider() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void flushPendingEvents$lambda$1(Expected expected) {
        expected.getClass();
        String str = (String) expected.getError();
        if (str != null) {
            MapboxLogger.logE(MapController.TAG, "EventsService flush error: ".concat(str));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void flushPendingEvents$lambda$3(Expected expected) {
        expected.getClass();
        String str = (String) expected.getError();
        if (str != null) {
            MapboxLogger.logE(MapController.TAG, "TelemetryService flush error: ".concat(str));
        }
    }

    private final MapController getController(MapView mapView) {
        return mapView.getMapController$maps_sdk_release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ModuleProviderArgument[] paramsProvider(Context context, MapboxModuleType type) {
        if (WhenMappings.$EnumSwitchMapping$0[type.ordinal()] == 1) {
            return new ModuleProviderArgument[]{new ModuleProviderArgument(Context.class, context.getApplicationContext())};
        }
        com.google.protobuf.a.i(type.name(), " module is not supported by the Maps SDK");
        return null;
    }

    public final void flushPendingEvents() {
        EventsService.getOrCreate(new EventsServerOptions(new SdkInformation(com.mapbox.maps.base.BuildConfig.MAPBOX_SDK_IDENTIFIER, com.mapbox.maps.base.BuildConfig.MAPBOX_SDK_VERSION, null), null)).flush(new com.google.protobuf.a(20));
        TelemetryService.getOrCreate().flush(new com.google.protobuf.a(21));
    }

    public final MapGeofencingConsent getMapGeofencingConsent() {
        return new MapGeofencingConsentImpl();
    }

    public final MapPluginRegistry getMapPluginRegistry(MapboxMap mapboxMap, MapController mapController, MapTelemetry telemetry, MapGeofencingConsent mapGeofencingConsent) {
        mapboxMap.getClass();
        mapController.getClass();
        telemetry.getClass();
        mapGeofencingConsent.getClass();
        return new MapPluginRegistry(new MapDelegateProviderImpl(mapboxMap, mapController, telemetry, mapGeofencingConsent));
    }

    public final MapTelemetry getMapTelemetryInstance(Context context) {
        context.getClass();
        if (mapTelemetry == null) {
            mapTelemetry = (MapTelemetry) MapboxModuleProvider.INSTANCE.createModule(MapboxModuleType.MapTelemetry, new AnonymousClass2(context));
        }
        ge1.b.T(mainScope, null, null, new AnonymousClass3(null), 3);
        MapTelemetry mapTelemetry2 = mapTelemetry;
        if (mapTelemetry2 != null) {
            return mapTelemetry2;
        }
        s.m("mapTelemetry");
        throw null;
    }

    public final MapboxMap getMapboxMap(NativeMapImpl nativeMap, NativeObserver nativeObserver, float pixelRatio) {
        nativeMap.getClass();
        nativeObserver.getClass();
        return MapboxMap.INSTANCE.invoke$maps_sdk_release(nativeMap, nativeObserver, pixelRatio);
    }

    public final Map getNativeMapCore(MapView mapView) {
        mapView.getClass();
        return getController(mapView).getNativeMap().getMap();
    }

    public final NativeMapImpl getNativeMapWrapper(MapInitOptions mapInitOptions, MapClient mapClient) {
        mapInitOptions.getClass();
        mapClient.getClass();
        return new NativeMapImpl(new Map(mapClient, mapInitOptions.getMapOptions()));
    }
}
