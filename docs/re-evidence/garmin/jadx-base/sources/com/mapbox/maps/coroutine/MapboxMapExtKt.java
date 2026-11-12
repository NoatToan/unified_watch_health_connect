package com.mapbox.maps.coroutine;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.None;
import com.mapbox.bindgen.Value;
import com.mapbox.common.Cancelable;
import com.mapbox.geojson.Feature;
import com.mapbox.maps.CameraOptions;
import com.mapbox.maps.EdgeInsets;
import com.mapbox.maps.FeatureExtensionValue;
import com.mapbox.maps.FeatureStateOperationCallback;
import com.mapbox.maps.GenericEvent;
import com.mapbox.maps.MapboxExperimental;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.QueryFeatureExtensionCallback;
import com.mapbox.maps.QueryFeatureStateCallback;
import com.mapbox.maps.ScreenCoordinate;
import com.mapbox.maps.UtilsKt$suspendMapboxCancellableCoroutine$2$1;
import com.mapbox.maps.extension.style.StyleContract;
import e23.p;
import java.util.List;
import o13.e;
import o13.q;
import o13.r;
import o53.k;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import q53.t;
import r53.s;
import t13.d;
import t13.i;
import u13.f;
import u53.o;
import vb.h;
import x53.c;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001f\u0010\u0006\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001f\u0010\u0006\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\t\u001a\u00020\bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\n\u001aC\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00120\u0011*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a3\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00120\u0011*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a3\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00120\u0011*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0016\u001a?\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001b0\u0011*\u00020\u00002\u0006\u0010\u0018\u001a\u00020\b2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\b2\u0006\u0010\u001a\u001a\u00020\bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001aK\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001f0\u0011*\u00020\u00002\u0006\u0010\u0018\u001a\u00020\b2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\b2\u0006\u0010\u001a\u001a\u00020\b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\bH\u0086@ø\u0001\u0000¢\u0006\u0004\b \u0010!\u001a7\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001f0\u0011*\u00020\u00002\u0006\u0010\u0018\u001a\u00020\b2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\"\u0010#\u001aG\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001f0\u0011*\u00020\u00002\u0006\u0010\u0018\u001a\u00020\b2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\b2\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010$\u001a\u00020\u001bH\u0086@ø\u0001\u0000¢\u0006\u0004\b%\u0010&\u001a!\u0010*\u001a\b\u0012\u0004\u0012\u00020)0(*\u00020\u00002\u0006\u0010'\u001a\u00020\bH\u0007¢\u0006\u0004\b*\u0010+\u001aQ\u00106\u001a\u00020/*\u00020\u00002\f\u0010.\u001a\b\u0012\u0004\u0012\u00020-0,2\u0006\u00100\u001a\u00020/2\n\b\u0002\u00102\u001a\u0004\u0018\u0001012\n\b\u0002\u00104\u001a\u0004\u0018\u0001032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u000105H\u0087@ø\u0001\u0000¢\u0006\u0004\b6\u00107\"\u001b\u0010;\u001a\b\u0012\u0004\u0012\u0002080(*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b9\u0010:\"\u001b\u0010>\u001a\b\u0012\u0004\u0012\u00020<0(*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b=\u0010:\"\u001b\u0010A\u001a\b\u0012\u0004\u0012\u00020?0(*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b@\u0010:\"\u001b\u0010D\u001a\b\u0012\u0004\u0012\u00020B0(*\u00020\u00008F¢\u0006\u0006\u001a\u0004\bC\u0010:\"\u001b\u0010G\u001a\b\u0012\u0004\u0012\u00020E0(*\u00020\u00008F¢\u0006\u0006\u001a\u0004\bF\u0010:\"$\u0010L\u001a\b\u0012\u0004\u0012\u00020H0(*\u00020\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\bJ\u0010K\u001a\u0004\bI\u0010:\"\u001b\u0010O\u001a\b\u0012\u0004\u0012\u00020M0(*\u00020\u00008F¢\u0006\u0006\u001a\u0004\bN\u0010:\"\u001b\u0010R\u001a\b\u0012\u0004\u0012\u00020P0(*\u00020\u00008F¢\u0006\u0006\u001a\u0004\bQ\u0010:\"\u001b\u0010U\u001a\b\u0012\u0004\u0012\u00020S0(*\u00020\u00008F¢\u0006\u0006\u001a\u0004\bT\u0010:\"\u001b\u0010X\u001a\b\u0012\u0004\u0012\u00020V0(*\u00020\u00008F¢\u0006\u0006\u001a\u0004\bW\u0010:\"\u001b\u0010[\u001a\b\u0012\u0004\u0012\u00020Y0(*\u00020\u00008F¢\u0006\u0006\u001a\u0004\bZ\u0010:\"\u001b\u0010^\u001a\b\u0012\u0004\u0012\u00020\\0(*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b]\u0010:\"\u001b\u0010a\u001a\b\u0012\u0004\u0012\u00020_0(*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b`\u0010:\"\u001b\u0010d\u001a\b\u0012\u0004\u0012\u00020b0(*\u00020\u00008F¢\u0006\u0006\u001a\u0004\bc\u0010:\"\u001b\u0010g\u001a\b\u0012\u0004\u0012\u00020e0(*\u00020\u00008F¢\u0006\u0006\u001a\u0004\bf\u0010:\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006h"}, d2 = {"Lcom/mapbox/maps/MapboxMap;", "Lcom/mapbox/maps/Style;", "awaitStyle", "(Lcom/mapbox/maps/MapboxMap;Lt13/d;)Ljava/lang/Object;", "Lcom/mapbox/maps/extension/style/StyleContract$StyleExtension;", "styleExtension", "awaitLoadStyle", "(Lcom/mapbox/maps/MapboxMap;Lcom/mapbox/maps/extension/style/StyleContract$StyleExtension;Lt13/d;)Ljava/lang/Object;", "", TtmlNode.TAG_STYLE, "(Lcom/mapbox/maps/MapboxMap;Ljava/lang/String;Lt13/d;)Ljava/lang/Object;", "sourceIdentifier", "Lcom/mapbox/geojson/Feature;", "cluster", "", MapboxMap.QFE_LIMIT, MapboxMap.QFE_OFFSET, "Lcom/mapbox/bindgen/Expected;", "Lcom/mapbox/maps/FeatureExtensionValue;", "getGeoJsonClusterLeaves", "(Lcom/mapbox/maps/MapboxMap;Ljava/lang/String;Lcom/mapbox/geojson/Feature;JJLt13/d;)Ljava/lang/Object;", "getGeoJsonClusterChildren", "(Lcom/mapbox/maps/MapboxMap;Ljava/lang/String;Lcom/mapbox/geojson/Feature;Lt13/d;)Ljava/lang/Object;", "getGeoJsonClusterExpansionZoom", "sourceId", "sourceLayerId", "featureId", "Lcom/mapbox/bindgen/Value;", "getFeatureState", "(Lcom/mapbox/maps/MapboxMap;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lt13/d;)Ljava/lang/Object;", "stateKey", "Lcom/mapbox/bindgen/None;", "removeFeatureState", "(Lcom/mapbox/maps/MapboxMap;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lt13/d;)Ljava/lang/Object;", "resetFeatureStates", "(Lcom/mapbox/maps/MapboxMap;Ljava/lang/String;Ljava/lang/String;Lt13/d;)Ljava/lang/Object;", RemoteConfigConstants.ResponseFieldKey.STATE, "setFeatureState", "(Lcom/mapbox/maps/MapboxMap;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/mapbox/bindgen/Value;Lt13/d;)Ljava/lang/Object;", "eventName", "Lr53/i;", "Lcom/mapbox/maps/GenericEvent;", "genericEvents", "(Lcom/mapbox/maps/MapboxMap;Ljava/lang/String;)Lr53/i;", "", "Lcom/mapbox/geojson/Point;", "coordinates", "Lcom/mapbox/maps/CameraOptions;", "camera", "Lcom/mapbox/maps/EdgeInsets;", "coordinatesPadding", "", "maxZoom", "Lcom/mapbox/maps/ScreenCoordinate;", "cameraForCoordinates", "(Lcom/mapbox/maps/MapboxMap;Ljava/util/List;Lcom/mapbox/maps/CameraOptions;Lcom/mapbox/maps/EdgeInsets;Ljava/lang/Double;Lcom/mapbox/maps/ScreenCoordinate;Lt13/d;)Ljava/lang/Object;", "Lcom/mapbox/maps/MapLoaded;", "getMapLoadedEvents", "(Lcom/mapbox/maps/MapboxMap;)Lr53/i;", "mapLoadedEvents", "Lcom/mapbox/maps/MapLoadingError;", "getMapLoadingErrorEvents", "mapLoadingErrorEvents", "Lcom/mapbox/maps/StyleLoaded;", "getStyleLoadedEvents", "styleLoadedEvents", "Lcom/mapbox/maps/StyleDataLoaded;", "getStyleDataLoadedEvents", "styleDataLoadedEvents", "Lcom/mapbox/maps/CameraChanged;", "getCameraChangedEvents", "cameraChangedEvents", "Lcom/mapbox/maps/CameraChangedCoalesced;", "getCameraChangedCoalescedEvents", "getCameraChangedCoalescedEvents$annotations", "(Lcom/mapbox/maps/MapboxMap;)V", "cameraChangedCoalescedEvents", "Lcom/mapbox/maps/MapIdle;", "getMapIdleEvents", "mapIdleEvents", "Lcom/mapbox/maps/SourceAdded;", "getSourceAddedEvents", "sourceAddedEvents", "Lcom/mapbox/maps/SourceRemoved;", "getSourceRemovedEvents", "sourceRemovedEvents", "Lcom/mapbox/maps/SourceDataLoaded;", "getSourceDataLoadedEvents", "sourceDataLoadedEvents", "Lcom/mapbox/maps/StyleImageMissing;", "getStyleImageMissingEvents", "styleImageMissingEvents", "Lcom/mapbox/maps/StyleImageRemoveUnused;", "getStyleImageRemoveUnusedEvents", "styleImageRemoveUnusedEvents", "Lcom/mapbox/maps/RenderFrameStarted;", "getRenderFrameStartedEvents", "renderFrameStartedEvents", "Lcom/mapbox/maps/RenderFrameFinished;", "getRenderFrameFinishedEvents", "renderFrameFinishedEvents", "Lcom/mapbox/maps/ResourceRequest;", "getResourceRequestEvents", "resourceRequestEvents", "maps-sdk_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class MapboxMapExtKt {
    public static final Object awaitLoadStyle(MapboxMap mapboxMap, StyleContract.StyleExtension styleExtension, d dVar) {
        i iVar = new i(f.b(dVar));
        mapboxMap.loadStyle(styleExtension, new MapboxMapExtKt$awaitLoadStyle$2$1(iVar));
        Object objA = iVar.a();
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        return objA;
    }

    public static final Object awaitStyle(MapboxMap mapboxMap, d dVar) {
        i iVar = new i(f.b(dVar));
        mapboxMap.getStyle(new MapboxMapExtKt$awaitStyle$2$1(iVar));
        Object objA = iVar.a();
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        return objA;
    }

    @e
    public static final Object cameraForCoordinates(MapboxMap mapboxMap, List list, CameraOptions cameraOptions, EdgeInsets edgeInsets, Double d14, ScreenCoordinate screenCoordinate, d dVar) {
        i iVar = new i(f.b(dVar));
        mapboxMap.cameraForCoordinates(list, cameraOptions, edgeInsets, d14, screenCoordinate, new MapboxMapExtKt$cameraForCoordinates$2$1(iVar));
        Object objA = iVar.a();
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        return objA;
    }

    public static /* synthetic */ Object cameraForCoordinates$default(MapboxMap mapboxMap, List list, CameraOptions cameraOptions, EdgeInsets edgeInsets, Double d14, ScreenCoordinate screenCoordinate, d dVar, int i14, Object obj) {
        if ((i14 & 4) != 0) {
            edgeInsets = null;
        }
        if ((i14 & 8) != 0) {
            d14 = null;
        }
        if ((i14 & 16) != 0) {
            screenCoordinate = null;
        }
        return cameraForCoordinates(mapboxMap, list, cameraOptions, edgeInsets, d14, screenCoordinate, dVar);
    }

    @MapboxExperimental
    public static final r53.i genericEvents(MapboxMap mapboxMap, String str) {
        mapboxMap.getClass();
        str.getClass();
        r53.b bVarF = s.f(new AnonymousClass1(mapboxMap, str, null));
        c cVar = s0.f129406a;
        return s.o(s.A(bVarF, o.f168762a.H()));
    }

    public static final r53.i getCameraChangedCoalescedEvents(MapboxMap mapboxMap) {
        mapboxMap.getClass();
        r53.b bVarF = s.f(new MapboxMapExtKt$cameraChangedCoalescedEvents$1(mapboxMap, null));
        c cVar = s0.f129406a;
        return s.o(s.A(bVarF, o.f168762a.H()));
    }

    @com.mapbox.annotation.MapboxExperimental
    public static /* synthetic */ void getCameraChangedCoalescedEvents$annotations(MapboxMap mapboxMap) {
    }

    public static final r53.i getCameraChangedEvents(MapboxMap mapboxMap) {
        mapboxMap.getClass();
        r53.b bVarF = s.f(new MapboxMapExtKt$cameraChangedEvents$1(mapboxMap, null));
        c cVar = s0.f129406a;
        return s.o(s.A(bVarF, o.f168762a.H()));
    }

    public static final Object getFeatureState(MapboxMap mapboxMap, String str, String str2, String str3, d dVar) throws Throwable {
        final k kVar = new k(f.b(dVar), 1);
        kVar.q();
        kVar.r(new UtilsKt$suspendMapboxCancellableCoroutine$2$1(mapboxMap.getFeatureState(str, str2, str3, new QueryFeatureStateCallback() { // from class: com.mapbox.maps.coroutine.MapboxMapExtKt$getFeatureState$2$1
            @Override // com.mapbox.maps.QueryFeatureStateCallback
            public final void run(Expected<String, Value> expected) {
                expected.getClass();
                d<Expected<String, Value>> dVar2 = kVar;
                int i14 = q.f128596b;
                dVar2.resumeWith(expected);
            }
        })));
        Object objP = kVar.p();
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        return objP;
    }

    public static /* synthetic */ Object getFeatureState$default(MapboxMap mapboxMap, String str, String str2, String str3, d dVar, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            str2 = null;
        }
        return getFeatureState(mapboxMap, str, str2, str3, dVar);
    }

    public static final Object getGeoJsonClusterChildren(MapboxMap mapboxMap, String str, Feature feature, d dVar) throws Throwable {
        final k kVar = new k(f.b(dVar), 1);
        kVar.q();
        kVar.r(new UtilsKt$suspendMapboxCancellableCoroutine$2$1(mapboxMap.getGeoJsonClusterChildren(str, feature, new QueryFeatureExtensionCallback() { // from class: com.mapbox.maps.coroutine.MapboxMapExtKt$getGeoJsonClusterChildren$2$1
            @Override // com.mapbox.maps.QueryFeatureExtensionCallback
            public final void run(Expected<String, FeatureExtensionValue> expected) {
                expected.getClass();
                d<Expected<String, FeatureExtensionValue>> dVar2 = kVar;
                int i14 = q.f128596b;
                dVar2.resumeWith(expected);
            }
        })));
        Object objP = kVar.p();
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        return objP;
    }

    public static final Object getGeoJsonClusterExpansionZoom(MapboxMap mapboxMap, String str, Feature feature, d dVar) throws Throwable {
        final k kVar = new k(f.b(dVar), 1);
        kVar.q();
        kVar.r(new UtilsKt$suspendMapboxCancellableCoroutine$2$1(mapboxMap.getGeoJsonClusterExpansionZoom(str, feature, new QueryFeatureExtensionCallback() { // from class: com.mapbox.maps.coroutine.MapboxMapExtKt$getGeoJsonClusterExpansionZoom$2$1
            @Override // com.mapbox.maps.QueryFeatureExtensionCallback
            public final void run(Expected<String, FeatureExtensionValue> expected) {
                expected.getClass();
                d<Expected<String, FeatureExtensionValue>> dVar2 = kVar;
                int i14 = q.f128596b;
                dVar2.resumeWith(expected);
            }
        })));
        Object objP = kVar.p();
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        return objP;
    }

    public static final Object getGeoJsonClusterLeaves(MapboxMap mapboxMap, String str, Feature feature, long j8, long j14, d dVar) throws Throwable {
        final k kVar = new k(f.b(dVar), 1);
        kVar.q();
        kVar.r(new UtilsKt$suspendMapboxCancellableCoroutine$2$1(mapboxMap.getGeoJsonClusterLeaves(str, feature, j8, j14, new QueryFeatureExtensionCallback() { // from class: com.mapbox.maps.coroutine.MapboxMapExtKt$getGeoJsonClusterLeaves$2$1
            @Override // com.mapbox.maps.QueryFeatureExtensionCallback
            public final void run(Expected<String, FeatureExtensionValue> expected) {
                expected.getClass();
                d<Expected<String, FeatureExtensionValue>> dVar2 = kVar;
                int i14 = q.f128596b;
                dVar2.resumeWith(expected);
            }
        })));
        Object objP = kVar.p();
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        return objP;
    }

    public static final r53.i getMapIdleEvents(MapboxMap mapboxMap) {
        mapboxMap.getClass();
        r53.b bVarF = s.f(new MapboxMapExtKt$mapIdleEvents$1(mapboxMap, null));
        c cVar = s0.f129406a;
        return s.o(s.A(bVarF, o.f168762a.H()));
    }

    public static final r53.i getMapLoadedEvents(MapboxMap mapboxMap) {
        mapboxMap.getClass();
        r53.b bVarF = s.f(new MapboxMapExtKt$mapLoadedEvents$1(mapboxMap, null));
        c cVar = s0.f129406a;
        return s.o(s.A(bVarF, o.f168762a.H()));
    }

    public static final r53.i getMapLoadingErrorEvents(MapboxMap mapboxMap) {
        mapboxMap.getClass();
        r53.b bVarF = s.f(new MapboxMapExtKt$mapLoadingErrorEvents$1(mapboxMap, null));
        c cVar = s0.f129406a;
        return s.o(s.A(bVarF, o.f168762a.H()));
    }

    public static final r53.i getRenderFrameFinishedEvents(MapboxMap mapboxMap) {
        mapboxMap.getClass();
        r53.b bVarF = s.f(new MapboxMapExtKt$renderFrameFinishedEvents$1(mapboxMap, null));
        c cVar = s0.f129406a;
        return s.o(s.A(bVarF, o.f168762a.H()));
    }

    public static final r53.i getRenderFrameStartedEvents(MapboxMap mapboxMap) {
        mapboxMap.getClass();
        r53.b bVarF = s.f(new MapboxMapExtKt$renderFrameStartedEvents$1(mapboxMap, null));
        c cVar = s0.f129406a;
        return s.o(s.A(bVarF, o.f168762a.H()));
    }

    public static final r53.i getResourceRequestEvents(MapboxMap mapboxMap) {
        mapboxMap.getClass();
        r53.b bVarF = s.f(new MapboxMapExtKt$resourceRequestEvents$1(mapboxMap, null));
        c cVar = s0.f129406a;
        return s.o(s.A(bVarF, o.f168762a.H()));
    }

    public static final r53.i getSourceAddedEvents(MapboxMap mapboxMap) {
        mapboxMap.getClass();
        r53.b bVarF = s.f(new MapboxMapExtKt$sourceAddedEvents$1(mapboxMap, null));
        c cVar = s0.f129406a;
        return s.o(s.A(bVarF, o.f168762a.H()));
    }

    public static final r53.i getSourceDataLoadedEvents(MapboxMap mapboxMap) {
        mapboxMap.getClass();
        r53.b bVarF = s.f(new MapboxMapExtKt$sourceDataLoadedEvents$1(mapboxMap, null));
        c cVar = s0.f129406a;
        return s.o(s.A(bVarF, o.f168762a.H()));
    }

    public static final r53.i getSourceRemovedEvents(MapboxMap mapboxMap) {
        mapboxMap.getClass();
        r53.b bVarF = s.f(new MapboxMapExtKt$sourceRemovedEvents$1(mapboxMap, null));
        c cVar = s0.f129406a;
        return s.o(s.A(bVarF, o.f168762a.H()));
    }

    public static final r53.i getStyleDataLoadedEvents(MapboxMap mapboxMap) {
        mapboxMap.getClass();
        r53.b bVarF = s.f(new MapboxMapExtKt$styleDataLoadedEvents$1(mapboxMap, null));
        c cVar = s0.f129406a;
        return s.o(s.A(bVarF, o.f168762a.H()));
    }

    public static final r53.i getStyleImageMissingEvents(MapboxMap mapboxMap) {
        mapboxMap.getClass();
        r53.b bVarF = s.f(new MapboxMapExtKt$styleImageMissingEvents$1(mapboxMap, null));
        c cVar = s0.f129406a;
        return s.o(s.A(bVarF, o.f168762a.H()));
    }

    public static final r53.i getStyleImageRemoveUnusedEvents(MapboxMap mapboxMap) {
        mapboxMap.getClass();
        r53.b bVarF = s.f(new MapboxMapExtKt$styleImageRemoveUnusedEvents$1(mapboxMap, null));
        c cVar = s0.f129406a;
        return s.o(s.A(bVarF, o.f168762a.H()));
    }

    public static final r53.i getStyleLoadedEvents(MapboxMap mapboxMap) {
        mapboxMap.getClass();
        r53.b bVarF = s.f(new MapboxMapExtKt$styleLoadedEvents$1(mapboxMap, null));
        c cVar = s0.f129406a;
        return s.o(s.A(bVarF, o.f168762a.H()));
    }

    public static final Object removeFeatureState(MapboxMap mapboxMap, String str, String str2, String str3, String str4, d dVar) throws Throwable {
        final k kVar = new k(f.b(dVar), 1);
        kVar.q();
        kVar.r(new UtilsKt$suspendMapboxCancellableCoroutine$2$1(mapboxMap.removeFeatureState(str, str2, str3, str4, new FeatureStateOperationCallback() { // from class: com.mapbox.maps.coroutine.MapboxMapExtKt$removeFeatureState$2$1
            @Override // com.mapbox.maps.FeatureStateOperationCallback
            public final void run(Expected<String, None> expected) {
                expected.getClass();
                d<Expected<String, None>> dVar2 = kVar;
                int i14 = q.f128596b;
                dVar2.resumeWith(expected);
            }
        })));
        Object objP = kVar.p();
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        return objP;
    }

    public static /* synthetic */ Object removeFeatureState$default(MapboxMap mapboxMap, String str, String str2, String str3, String str4, d dVar, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            str2 = null;
        }
        if ((i14 & 8) != 0) {
            str4 = null;
        }
        return removeFeatureState(mapboxMap, str, str2, str3, str4, dVar);
    }

    public static final Object resetFeatureStates(MapboxMap mapboxMap, String str, String str2, d dVar) throws Throwable {
        final k kVar = new k(f.b(dVar), 1);
        kVar.q();
        kVar.r(new UtilsKt$suspendMapboxCancellableCoroutine$2$1(mapboxMap.resetFeatureStates(str, str2, new FeatureStateOperationCallback() { // from class: com.mapbox.maps.coroutine.MapboxMapExtKt$resetFeatureStates$2$1
            @Override // com.mapbox.maps.FeatureStateOperationCallback
            public final void run(Expected<String, None> expected) {
                expected.getClass();
                d<Expected<String, None>> dVar2 = kVar;
                int i14 = q.f128596b;
                dVar2.resumeWith(expected);
            }
        })));
        Object objP = kVar.p();
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        return objP;
    }

    public static /* synthetic */ Object resetFeatureStates$default(MapboxMap mapboxMap, String str, String str2, d dVar, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            str2 = null;
        }
        return resetFeatureStates(mapboxMap, str, str2, dVar);
    }

    public static final Object setFeatureState(MapboxMap mapboxMap, String str, String str2, String str3, Value value, d dVar) throws Throwable {
        final k kVar = new k(f.b(dVar), 1);
        kVar.q();
        kVar.r(new UtilsKt$suspendMapboxCancellableCoroutine$2$1(mapboxMap.setFeatureState(str, str2, str3, value, new FeatureStateOperationCallback() { // from class: com.mapbox.maps.coroutine.MapboxMapExtKt$setFeatureState$2$1
            @Override // com.mapbox.maps.FeatureStateOperationCallback
            public final void run(Expected<String, None> expected) {
                expected.getClass();
                d<Expected<String, None>> dVar2 = kVar;
                int i14 = q.f128596b;
                dVar2.resumeWith(expected);
            }
        })));
        Object objP = kVar.p();
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        return objP;
    }

    public static /* synthetic */ Object setFeatureState$default(MapboxMap mapboxMap, String str, String str2, String str3, Value value, d dVar, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            str2 = null;
        }
        return setFeatureState(mapboxMap, str, str2, str3, value, dVar);
    }

    /* JADX INFO: renamed from: com.mapbox.maps.coroutine.MapboxMapExtKt$genericEvents$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lq53/t;", "Lcom/mapbox/maps/GenericEvent;", "", "<anonymous>", "(Lq53/t;)V"}, k = 3, mv = {1, 7, 1})
    @v13.e(c = "com.mapbox.maps.coroutine.MapboxMapExtKt$genericEvents$1", f = "MapboxMapExt.kt", l = {424}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends v13.i implements p<t<? super GenericEvent>, d<? super Unit>, Object> {
        final /* synthetic */ String $eventName;
        final /* synthetic */ MapboxMap $this_genericEvents;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MapboxMap mapboxMap, String str, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$this_genericEvents = mapboxMap;
            this.$eventName = str;
        }

        @Override // v13.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_genericEvents, this.$eventName, dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // e23.p
        public final Object invoke(t<? super GenericEvent> tVar, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(tVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.label;
            if (i14 == 0) {
                r.b(obj);
                t tVar = (t) this.L$0;
                C11621 c11621 = new C11621(this.$this_genericEvents.getNativeObserver().subscribeGenericEvent(this.$eventName, new a(tVar), new MapboxMapExtKt$genericEvents$1$cancelable$2(tVar.getChannel())));
                this.label = 1;
                if (q53.r.a(tVar, c11621, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: com.mapbox.maps.coroutine.MapboxMapExtKt$genericEvents$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
        public /* synthetic */ class C11621 extends p005kotlin.jvm.internal.q implements e23.a<Unit> {
            public C11621(Object obj) {
                super(0, obj, Cancelable.class, "cancel", "cancel()V", 0);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                ((Cancelable) this.receiver).cancel();
            }

            @Override // e23.a
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        }
    }

    public static final Object awaitLoadStyle(MapboxMap mapboxMap, String str, d dVar) {
        i iVar = new i(f.b(dVar));
        mapboxMap.loadStyle(str, new MapboxMapExtKt$awaitLoadStyle$4$1(iVar));
        Object objA = iVar.a();
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        return objA;
    }
}
