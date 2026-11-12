package com.mapbox.maps.extension.compose;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.mapbox.annotation.MapboxExperimental;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.None;
import com.mapbox.geojson.Point;
import com.mapbox.maps.CameraChanged;
import com.mapbox.maps.CameraChangedCoalesced;
import com.mapbox.maps.FeatureStateOperationCallback;
import com.mapbox.maps.GenericEvent;
import com.mapbox.maps.MapIdle;
import com.mapbox.maps.MapLoaded;
import com.mapbox.maps.MapLoadingError;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.QueriedRenderedFeature;
import com.mapbox.maps.RenderFrameFinished;
import com.mapbox.maps.RenderFrameStarted;
import com.mapbox.maps.RenderedQueryGeometry;
import com.mapbox.maps.RenderedQueryOptions;
import com.mapbox.maps.ResourceRequest;
import com.mapbox.maps.ScreenCoordinate;
import com.mapbox.maps.SourceAdded;
import com.mapbox.maps.SourceDataLoaded;
import com.mapbox.maps.SourceRemoved;
import com.mapbox.maps.StyleDataLoaded;
import com.mapbox.maps.StyleImageMissing;
import com.mapbox.maps.StyleImageRemoveUnused;
import com.mapbox.maps.StyleLoaded;
import com.mapbox.maps.coroutine.MapFeatureQueryDelegateExtKt;
import com.mapbox.maps.extension.style.expressions.generated.Expression;
import com.mapbox.maps.interactions.FeatureState;
import com.mapbox.maps.interactions.FeatureStateKey;
import com.mapbox.maps.interactions.FeaturesetFeature;
import com.mapbox.maps.interactions.TypedFeaturesetDescriptor;
import com.mapbox.maps.plugin.delegates.MapFeatureQueryDelegate;
import com.mapbox.maps.plugin.gestures.generated.GesturesSettings;
import com.mapbox.maps.plugin.gestures.generated.GesturesSettingsKt;
import d4.k;
import d4.l;
import d4.m;
import e23.p;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o13.q;
import o13.r;
import o53.j;
import okhttp3.internal.http.StatusLine;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;
import p3.l0;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.x1;
import r53.i;
import r53.l1;
import r53.p2;
import r53.q2;
import r53.s;
import r53.z1;
import t13.d;
import u13.a;
import u13.f;
import v13.c;
import v13.e;
import vb.h;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u008e\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 v2\u00020\u0001:\u0002vwB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006J\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u000b\u0010\fJ5\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015JQ\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012\"\f\b\u0000\u0010\u0017*\u0006\u0012\u0002\b\u00030\u00162\u0010\u0010\u0019\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\u00182\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0087@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u001cJ+\u0010 \u001a\u00028\u0000\"\b\b\u0000\u0010\u001e*\u00020\u001d2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0087@ø\u0001\u0000¢\u0006\u0004\b \u0010!J?\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020#0\u0011\"\b\b\u0000\u0010\u001e*\u00020\u001d2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00162\u0006\u0010\"\u001a\u00028\u0000H\u0087@ø\u0001\u0000¢\u0006\u0004\b$\u0010%JS\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020#0\u0011\"\b\b\u0000\u0010\u001e*\u00020\u001d\"\u000e\b\u0001\u0010'*\b\u0012\u0004\u0012\u00028\u00000&2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00162\n\b\u0002\u0010(\u001a\u0004\u0018\u00018\u0001H\u0087@ø\u0001\u0000¢\u0006\u0004\b)\u0010*J/\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020#0\u00112\u000e\u0010\u0019\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0018H\u0087@ø\u0001\u0000¢\u0006\u0004\b+\u0010,J\u001b\u00100\u001a\u00020/2\u0006\u0010.\u001a\u00020-H\u0086@ø\u0001\u0000¢\u0006\u0004\b0\u00101J\u0017\u00107\u001a\u0002042\u0006\u00103\u001a\u000202H\u0001¢\u0006\u0004\b5\u00106J\u0017\u00108\u001a\u0002042\u0006\u00103\u001a\u000202H\u0003¢\u0006\u0004\b8\u00106R\u001c\u0010:\u001a\n\u0012\u0006\u0012\u0004\u0018\u000102098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u001d\u0010@\u001a\b\u0012\u0004\u0012\u00020?0\t8\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u001d\u0010E\u001a\b\u0012\u0004\u0012\u00020D0\t8\u0006¢\u0006\f\n\u0004\bE\u0010A\u001a\u0004\bF\u0010CR\u001d\u0010H\u001a\b\u0012\u0004\u0012\u00020G0\t8\u0006¢\u0006\f\n\u0004\bH\u0010A\u001a\u0004\bI\u0010CR\u001d\u0010K\u001a\b\u0012\u0004\u0012\u00020J0\t8\u0006¢\u0006\f\n\u0004\bK\u0010A\u001a\u0004\bL\u0010CR\u001d\u0010N\u001a\b\u0012\u0004\u0012\u00020M0\t8\u0006¢\u0006\f\n\u0004\bN\u0010A\u001a\u0004\bO\u0010CR&\u0010Q\u001a\b\u0012\u0004\u0012\u00020P0\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bQ\u0010A\u0012\u0004\bS\u0010\u0006\u001a\u0004\bR\u0010CR\u001d\u0010U\u001a\b\u0012\u0004\u0012\u00020T0\t8\u0006¢\u0006\f\n\u0004\bU\u0010A\u001a\u0004\bV\u0010CR\u001d\u0010X\u001a\b\u0012\u0004\u0012\u00020W0\t8\u0006¢\u0006\f\n\u0004\bX\u0010A\u001a\u0004\bY\u0010CR\u001d\u0010[\u001a\b\u0012\u0004\u0012\u00020Z0\t8\u0006¢\u0006\f\n\u0004\b[\u0010A\u001a\u0004\b\\\u0010CR\u001d\u0010^\u001a\b\u0012\u0004\u0012\u00020]0\t8\u0006¢\u0006\f\n\u0004\b^\u0010A\u001a\u0004\b_\u0010CR\u001d\u0010a\u001a\b\u0012\u0004\u0012\u00020`0\t8\u0006¢\u0006\f\n\u0004\ba\u0010A\u001a\u0004\bb\u0010CR\u001d\u0010d\u001a\b\u0012\u0004\u0012\u00020c0\t8\u0006¢\u0006\f\n\u0004\bd\u0010A\u001a\u0004\be\u0010CR\u001d\u0010g\u001a\b\u0012\u0004\u0012\u00020f0\t8\u0006¢\u0006\f\n\u0004\bg\u0010A\u001a\u0004\bh\u0010CR\u001d\u0010j\u001a\b\u0012\u0004\u0012\u00020i0\t8\u0006¢\u0006\f\n\u0004\bj\u0010A\u001a\u0004\bk\u0010CR\u001d\u0010m\u001a\b\u0012\u0004\u0012\u00020l0\t8\u0006¢\u0006\f\n\u0004\bm\u0010A\u001a\u0004\bn\u0010CR+\u0010u\u001a\u00020\u00022\u0006\u0010o\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bp\u0010q\"\u0004\br\u0010\u0005*\u0004\bs\u0010t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006x"}, d2 = {"Lcom/mapbox/maps/extension/compose/MapState;", "", "Lcom/mapbox/maps/plugin/gestures/generated/GesturesSettings;", "initialGesturesSettings", "<init>", "(Lcom/mapbox/maps/plugin/gestures/generated/GesturesSettings;)V", "()V", "", "eventName", "Lr53/i;", "Lcom/mapbox/maps/GenericEvent;", "genericEvents", "(Ljava/lang/String;)Lr53/i;", "Lcom/mapbox/maps/RenderedQueryGeometry;", "geometry", "Lcom/mapbox/maps/RenderedQueryOptions;", "options", "Lcom/mapbox/bindgen/Expected;", "", "Lcom/mapbox/maps/QueriedRenderedFeature;", "queryRenderedFeatures", "(Lcom/mapbox/maps/RenderedQueryGeometry;Lcom/mapbox/maps/RenderedQueryOptions;Lt13/d;)Ljava/lang/Object;", "Lcom/mapbox/maps/interactions/FeaturesetFeature;", "FF", "Lcom/mapbox/maps/interactions/TypedFeaturesetDescriptor;", "descriptor", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "filter", "(Lcom/mapbox/maps/interactions/TypedFeaturesetDescriptor;Lcom/mapbox/maps/RenderedQueryGeometry;Lcom/mapbox/maps/extension/style/expressions/generated/Expression;Lt13/d;)Ljava/lang/Object;", "Lcom/mapbox/maps/interactions/FeatureState;", "FS", "featuresetFeature", "getFeatureState", "(Lcom/mapbox/maps/interactions/FeaturesetFeature;Lt13/d;)Ljava/lang/Object;", RemoteConfigConstants.ResponseFieldKey.STATE, "Lcom/mapbox/bindgen/None;", "setFeatureState", "(Lcom/mapbox/maps/interactions/FeaturesetFeature;Lcom/mapbox/maps/interactions/FeatureState;Lt13/d;)Ljava/lang/Object;", "Lcom/mapbox/maps/interactions/FeatureStateKey;", "FSK", "stateKey", "removeFeatureState", "(Lcom/mapbox/maps/interactions/FeaturesetFeature;Lcom/mapbox/maps/interactions/FeatureStateKey;Lt13/d;)Ljava/lang/Object;", "resetFeatureStates", "(Lcom/mapbox/maps/interactions/TypedFeaturesetDescriptor;Lt13/d;)Ljava/lang/Object;", "Lcom/mapbox/geojson/Point;", "coordinate", "Lcom/mapbox/maps/ScreenCoordinate;", "pixelForCoordinate", "(Lcom/mapbox/geojson/Point;Lt13/d;)Ljava/lang/Object;", "Lcom/mapbox/maps/MapboxMap;", "mapboxMap", "", "BindToMap$extension_compose_release", "(Lcom/mapbox/maps/MapboxMap;Lp3/m;I)V", "BindToMap", "UpdateGesturesSettings", "Lr53/z1;", "mapboxMapFlow", "Lr53/z1;", "Lp3/p1;", "gesturesState", "Lp3/p1;", "Lcom/mapbox/maps/MapLoaded;", "mapLoadedEvents", "Lr53/i;", "getMapLoadedEvents", "()Lr53/i;", "Lcom/mapbox/maps/MapLoadingError;", "mapLoadingErrorEvents", "getMapLoadingErrorEvents", "Lcom/mapbox/maps/StyleLoaded;", "styleLoadedEvents", "getStyleLoadedEvents", "Lcom/mapbox/maps/StyleDataLoaded;", "styleDataLoadedEvents", "getStyleDataLoadedEvents", "Lcom/mapbox/maps/CameraChanged;", "cameraChangedEvents", "getCameraChangedEvents", "Lcom/mapbox/maps/CameraChangedCoalesced;", "cameraChangedCoalescedEvents", "getCameraChangedCoalescedEvents", "getCameraChangedCoalescedEvents$annotations", "Lcom/mapbox/maps/MapIdle;", "mapIdleEvents", "getMapIdleEvents", "Lcom/mapbox/maps/SourceAdded;", "sourceAddedEvents", "getSourceAddedEvents", "Lcom/mapbox/maps/SourceRemoved;", "sourceRemovedEvents", "getSourceRemovedEvents", "Lcom/mapbox/maps/SourceDataLoaded;", "sourceDataLoadedEvents", "getSourceDataLoadedEvents", "Lcom/mapbox/maps/StyleImageMissing;", "styleImageMissingEvents", "getStyleImageMissingEvents", "Lcom/mapbox/maps/StyleImageRemoveUnused;", "styleImageRemoveUnusedEvents", "getStyleImageRemoveUnusedEvents", "Lcom/mapbox/maps/RenderFrameStarted;", "renderFrameStartedEvents", "getRenderFrameStartedEvents", "Lcom/mapbox/maps/RenderFrameFinished;", "renderFrameFinishedEvents", "getRenderFrameFinishedEvents", "Lcom/mapbox/maps/ResourceRequest;", "resourceRequestEvents", "getResourceRequestEvents", "<set-?>", "getGesturesSettings", "()Lcom/mapbox/maps/plugin/gestures/generated/GesturesSettings;", "setGesturesSettings", "getGesturesSettings$delegate", "(Lcom/mapbox/maps/extension/compose/MapState;)Ljava/lang/Object;", "gesturesSettings", "Companion", "Holder", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class MapState {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String GESTURES_SETTINGS_KEY = "GesturesSettings";
    private static final k<MapState, Holder> Saver;
    private static final String TAG = "MapState";
    private final i<CameraChangedCoalesced> cameraChangedCoalescedEvents;
    private final i<CameraChanged> cameraChangedEvents;
    private final p1<GesturesSettings> gesturesState;
    private final i<MapIdle> mapIdleEvents;
    private final i<MapLoaded> mapLoadedEvents;
    private final i<MapLoadingError> mapLoadingErrorEvents;
    private final z1<MapboxMap> mapboxMapFlow;
    private final i<RenderFrameFinished> renderFrameFinishedEvents;
    private final i<RenderFrameStarted> renderFrameStartedEvents;
    private final i<ResourceRequest> resourceRequestEvents;
    private final i<SourceAdded> sourceAddedEvents;
    private final i<SourceDataLoaded> sourceDataLoadedEvents;
    private final i<SourceRemoved> sourceRemovedEvents;
    private final i<StyleDataLoaded> styleDataLoadedEvents;
    private final i<StyleImageMissing> styleImageMissingEvents;
    private final i<StyleImageRemoveUnused> styleImageRemoveUnusedEvents;
    private final i<StyleLoaded> styleLoadedEvents;

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.MapState$getFeatureState$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @e(c = "com.mapbox.maps.extension.compose.MapState", f = "MapState.kt", l = {294, 473}, m = "getFeatureState")
    public static final class C39601<FS extends FeatureState> extends c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C39601(d<? super C39601> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MapState.this.getFeatureState(null, this);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.MapState$pixelForCoordinate$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @e(c = "com.mapbox.maps.extension.compose.MapState", f = "MapState.kt", l = {StatusLine.HTTP_MISDIRECTED_REQUEST}, m = "pixelForCoordinate")
    public static final class C39611 extends c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C39611(d<? super C39611> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MapState.this.pixelForCoordinate(null, this);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.MapState$queryRenderedFeatures$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @e(c = "com.mapbox.maps.extension.compose.MapState", f = "MapState.kt", l = {249, 249}, m = "queryRenderedFeatures")
    public static final class C39621 extends c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C39621(d<? super C39621> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MapState.this.queryRenderedFeatures((RenderedQueryGeometry) null, (RenderedQueryOptions) null, this);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.MapState$queryRenderedFeatures$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @e(c = "com.mapbox.maps.extension.compose.MapState", f = "MapState.kt", l = {268, 473}, m = "queryRenderedFeatures")
    public static final class C39632<FF extends FeaturesetFeature<?>> extends c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public C39632(d<? super C39632> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MapState.this.queryRenderedFeatures(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.MapState$removeFeatureState$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @e(c = "com.mapbox.maps.extension.compose.MapState", f = "MapState.kt", l = {354, 473}, m = "removeFeatureState")
    public static final class C39641<FS extends FeatureState, FSK extends FeatureStateKey<FS>> extends c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C39641(d<? super C39641> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MapState.this.removeFeatureState(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.MapState$resetFeatureStates$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @e(c = "com.mapbox.maps.extension.compose.MapState", f = "MapState.kt", l = {384, 473}, m = "resetFeatureStates")
    public static final class C39651 extends c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C39651(d<? super C39651> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MapState.this.resetFeatureStates(null, this);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.MapState$setFeatureState$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @e(c = "com.mapbox.maps.extension.compose.MapState", f = "MapState.kt", l = {320, 473}, m = "setFeatureState")
    public static final class C39661<FS extends FeatureState> extends c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C39661(d<? super C39661> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MapState.this.setFeatureState(null, null, this);
        }
    }

    static {
        MapState$Companion$Saver$1 mapState$Companion$Saver$1 = MapState$Companion$Saver$1.INSTANCE;
        MapState$Companion$Saver$2 mapState$Companion$Saver$2 = MapState$Companion$Saver$2.INSTANCE;
        l lVar = m.f57455a;
        Saver = new l(mapState$Companion$Saver$1, mapState$Companion$Saver$2);
    }

    public MapState(GesturesSettings gesturesSettings) {
        gesturesSettings.getClass();
        p2 p2VarA = q2.a(null);
        this.mapboxMapFlow = p2VarA;
        this.gesturesState = p0.n(gesturesSettings);
        this.mapLoadedEvents = s.N(p2VarA, new MapState$special$$inlined$flatMapLatest$1(null));
        this.mapLoadingErrorEvents = s.N(p2VarA, new MapState$special$$inlined$flatMapLatest$2(null));
        this.styleLoadedEvents = s.N(p2VarA, new MapState$special$$inlined$flatMapLatest$3(null));
        this.styleDataLoadedEvents = s.N(p2VarA, new MapState$special$$inlined$flatMapLatest$4(null));
        this.cameraChangedEvents = s.N(p2VarA, new MapState$special$$inlined$flatMapLatest$5(null));
        this.cameraChangedCoalescedEvents = s.N(p2VarA, new MapState$special$$inlined$flatMapLatest$6(null));
        this.mapIdleEvents = s.N(p2VarA, new MapState$special$$inlined$flatMapLatest$7(null));
        this.sourceAddedEvents = s.N(p2VarA, new MapState$special$$inlined$flatMapLatest$8(null));
        this.sourceRemovedEvents = s.N(p2VarA, new MapState$special$$inlined$flatMapLatest$9(null));
        this.sourceDataLoadedEvents = s.N(p2VarA, new MapState$special$$inlined$flatMapLatest$10(null));
        this.styleImageMissingEvents = s.N(p2VarA, new MapState$special$$inlined$flatMapLatest$11(null));
        this.styleImageRemoveUnusedEvents = s.N(p2VarA, new MapState$special$$inlined$flatMapLatest$12(null));
        this.renderFrameStartedEvents = s.N(p2VarA, new MapState$special$$inlined$flatMapLatest$13(null));
        this.renderFrameFinishedEvents = s.N(p2VarA, new MapState$special$$inlined$flatMapLatest$14(null));
        this.resourceRequestEvents = s.N(p2VarA, new MapState$special$$inlined$flatMapLatest$15(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:6:0x0022  */
    public final void UpdateGesturesSettings(MapboxMap mapboxMap, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(2125675165);
        x1 x1Var = n.f135158a;
        o0VarE.L(1157296644);
        boolean zB = o0VarE.B(this);
        Object objQ = o0VarE.q();
        if (zB) {
            objQ = new MapState$UpdateGesturesSettings$1$1(this);
            o0VarE.K(objQ);
        } else {
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new MapState$UpdateGesturesSettings$1$1(this);
                o0VarE.K(objQ);
            }
        }
        o0VarE.g0(false);
        mapboxMap.gesturesPlugin((e23.l) objQ);
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new AnonymousClass2(mapboxMap, i14);
    }

    @MapboxExperimental
    public static /* synthetic */ void getCameraChangedCoalescedEvents$annotations() {
    }

    public static /* synthetic */ Object queryRenderedFeatures$default(MapState mapState, TypedFeaturesetDescriptor typedFeaturesetDescriptor, RenderedQueryGeometry renderedQueryGeometry, Expression expression, d dVar, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            renderedQueryGeometry = null;
        }
        if ((i14 & 4) != 0) {
            expression = null;
        }
        return mapState.queryRenderedFeatures(typedFeaturesetDescriptor, renderedQueryGeometry, expression, dVar);
    }

    public static /* synthetic */ Object removeFeatureState$default(MapState mapState, FeaturesetFeature featuresetFeature, FeatureStateKey featureStateKey, d dVar, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            featureStateKey = null;
        }
        return mapState.removeFeatureState(featuresetFeature, featureStateKey, dVar);
    }

    public final void BindToMap$extension_compose_release(MapboxMap mapboxMap, p3.m mVar, int i14) {
        mapboxMap.getClass();
        o0 o0VarE = mVar.E(-835881013);
        x1 x1Var = n.f135158a;
        UpdateGesturesSettings(mapboxMap, o0VarE, (i14 & 112) | 8);
        l0.a(Unit.INSTANCE, new MapState$BindToMap$1(this, mapboxMap), o0VarE);
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new MapState$BindToMap$2(this, mapboxMap, i14);
    }

    @com.mapbox.maps.MapboxExperimental
    public final i<GenericEvent> genericEvents(String eventName) {
        eventName.getClass();
        return s.N(this.mapboxMapFlow, new MapState$genericEvents$$inlined$flatMapLatest$1(null, eventName));
    }

    public final i<CameraChangedCoalesced> getCameraChangedCoalescedEvents() {
        return this.cameraChangedCoalescedEvents;
    }

    public final i<CameraChanged> getCameraChangedEvents() {
        return this.cameraChangedEvents;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @com.mapbox.maps.MapboxExperimental
    public final <FS extends FeatureState> Object getFeatureState(FeaturesetFeature<FS> featuresetFeature, d<? super FS> dVar) throws Throwable {
        C39601 c39601;
        if (dVar instanceof C39601) {
            c39601 = (C39601) dVar;
            int i14 = c39601.label;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                c39601.label = i14 - Integer.MIN_VALUE;
            } else {
                c39601 = new C39601(dVar);
            }
        } else {
            c39601 = new C39601(dVar);
        }
        Object objX = c39601.result;
        a aVar = a.COROUTINE_SUSPENDED;
        int i15 = c39601.label;
        if (i15 == 0) {
            r.b(objX);
            l1 l1Var = new l1(this.mapboxMapFlow);
            c39601.L$0 = featuresetFeature;
            c39601.label = 1;
            objX = s.x(l1Var, c39601);
            if (objX != aVar) {
            }
        }
        if (i15 != 1) {
            if (i15 != 2) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objX);
            return objX;
        }
        featuresetFeature = (FeaturesetFeature) c39601.L$0;
        r.b(objX);
        MapboxMap mapboxMap = (MapboxMap) objX;
        c39601.L$0 = featuresetFeature;
        c39601.L$1 = mapboxMap;
        c39601.L$2 = c39601;
        c39601.label = 2;
        o53.k kVar = new o53.k(f.b(c39601), 1);
        kVar.q();
        kVar.r(new MapState$getFeatureState$2$1$1(mapboxMap.getFeatureState(featuresetFeature, new MapState$getFeatureState$2$1$cancelable$1(kVar))));
        Object objP = kVar.p();
        return objP == aVar ? aVar : objP;
    }

    public final GesturesSettings getGesturesSettings() {
        return this.gesturesState.getF182175a();
    }

    public final i<MapIdle> getMapIdleEvents() {
        return this.mapIdleEvents;
    }

    public final i<MapLoaded> getMapLoadedEvents() {
        return this.mapLoadedEvents;
    }

    public final i<MapLoadingError> getMapLoadingErrorEvents() {
        return this.mapLoadingErrorEvents;
    }

    public final i<RenderFrameFinished> getRenderFrameFinishedEvents() {
        return this.renderFrameFinishedEvents;
    }

    public final i<RenderFrameStarted> getRenderFrameStartedEvents() {
        return this.renderFrameStartedEvents;
    }

    public final i<ResourceRequest> getResourceRequestEvents() {
        return this.resourceRequestEvents;
    }

    public final i<SourceAdded> getSourceAddedEvents() {
        return this.sourceAddedEvents;
    }

    public final i<SourceDataLoaded> getSourceDataLoadedEvents() {
        return this.sourceDataLoadedEvents;
    }

    public final i<SourceRemoved> getSourceRemovedEvents() {
        return this.sourceRemovedEvents;
    }

    public final i<StyleDataLoaded> getStyleDataLoadedEvents() {
        return this.styleDataLoadedEvents;
    }

    public final i<StyleImageMissing> getStyleImageMissingEvents() {
        return this.styleImageMissingEvents;
    }

    public final i<StyleImageRemoveUnused> getStyleImageRemoveUnusedEvents() {
        return this.styleImageRemoveUnusedEvents;
    }

    public final i<StyleLoaded> getStyleLoadedEvents() {
        return this.styleLoadedEvents;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object pixelForCoordinate(Point point, d<? super ScreenCoordinate> dVar) {
        C39611 c39611;
        if (dVar instanceof C39611) {
            c39611 = (C39611) dVar;
            int i14 = c39611.label;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                c39611.label = i14 - Integer.MIN_VALUE;
            } else {
                c39611 = new C39611(dVar);
            }
        } else {
            c39611 = new C39611(dVar);
        }
        Object objX = c39611.result;
        a aVar = a.COROUTINE_SUSPENDED;
        int i15 = c39611.label;
        if (i15 == 0) {
            r.b(objX);
            l1 l1Var = new l1(this.mapboxMapFlow);
            c39611.L$0 = point;
            c39611.label = 1;
            objX = s.x(l1Var, c39611);
            if (objX == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            point = (Point) c39611.L$0;
            r.b(objX);
        }
        return ((MapboxMap) objX).pixelForCoordinate(point);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @com.mapbox.maps.MapboxExperimental
    public final <FF extends FeaturesetFeature<?>> Object queryRenderedFeatures(TypedFeaturesetDescriptor<?, FF> typedFeaturesetDescriptor, RenderedQueryGeometry renderedQueryGeometry, Expression expression, d<? super List<? extends FF>> dVar) throws Throwable {
        C39632 c39632;
        if (dVar instanceof C39632) {
            c39632 = (C39632) dVar;
            int i14 = c39632.label;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                c39632.label = i14 - Integer.MIN_VALUE;
            } else {
                c39632 = new C39632(dVar);
            }
        } else {
            c39632 = new C39632(dVar);
        }
        Object objX = c39632.result;
        a aVar = a.COROUTINE_SUSPENDED;
        int i15 = c39632.label;
        if (i15 == 0) {
            r.b(objX);
            l1 l1Var = new l1(this.mapboxMapFlow);
            c39632.L$0 = typedFeaturesetDescriptor;
            c39632.L$1 = renderedQueryGeometry;
            c39632.L$2 = expression;
            c39632.label = 1;
            objX = s.x(l1Var, c39632);
            if (objX != aVar) {
            }
        }
        if (i15 != 1) {
            if (i15 != 2) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objX);
            return objX;
        }
        expression = (Expression) c39632.L$2;
        renderedQueryGeometry = (RenderedQueryGeometry) c39632.L$1;
        typedFeaturesetDescriptor = (TypedFeaturesetDescriptor) c39632.L$0;
        r.b(objX);
        MapboxMap mapboxMap = (MapboxMap) objX;
        c39632.L$0 = typedFeaturesetDescriptor;
        c39632.L$1 = renderedQueryGeometry;
        c39632.L$2 = expression;
        c39632.L$3 = mapboxMap;
        c39632.L$4 = c39632;
        c39632.label = 2;
        o53.k kVar = new o53.k(f.b(c39632), 1);
        kVar.q();
        kVar.r(new MapState$queryRenderedFeatures$3$1$1(mapboxMap.queryRenderedFeatures(typedFeaturesetDescriptor, renderedQueryGeometry, expression, new MapState$queryRenderedFeatures$3$1$cancelable$1(kVar))));
        Object objP = kVar.p();
        return objP == aVar ? aVar : objP;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @com.mapbox.maps.MapboxExperimental
    public final <FS extends FeatureState, FSK extends FeatureStateKey<FS>> Object removeFeatureState(FeaturesetFeature<FS> featuresetFeature, FSK fsk, d<? super Expected<String, None>> dVar) throws Throwable {
        C39641 c39641;
        if (dVar instanceof C39641) {
            c39641 = (C39641) dVar;
            int i14 = c39641.label;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                c39641.label = i14 - Integer.MIN_VALUE;
            } else {
                c39641 = new C39641(dVar);
            }
        } else {
            c39641 = new C39641(dVar);
        }
        Object objX = c39641.result;
        a aVar = a.COROUTINE_SUSPENDED;
        int i15 = c39641.label;
        if (i15 == 0) {
            r.b(objX);
            l1 l1Var = new l1(this.mapboxMapFlow);
            c39641.L$0 = featuresetFeature;
            c39641.L$1 = fsk;
            c39641.label = 1;
            objX = s.x(l1Var, c39641);
            if (objX != aVar) {
            }
        }
        if (i15 != 1) {
            if (i15 != 2) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objX);
            return objX;
        }
        fsk = (FSK) c39641.L$1;
        featuresetFeature = (FeaturesetFeature) c39641.L$0;
        r.b(objX);
        MapboxMap mapboxMap = (MapboxMap) objX;
        c39641.L$0 = featuresetFeature;
        c39641.L$1 = fsk;
        c39641.L$2 = mapboxMap;
        c39641.L$3 = c39641;
        c39641.label = 2;
        final o53.k kVar = new o53.k(f.b(c39641), 1);
        kVar.q();
        kVar.r(new MapState$removeFeatureState$2$1$1(mapboxMap.removeFeatureState(featuresetFeature, fsk, new FeatureStateOperationCallback() { // from class: com.mapbox.maps.extension.compose.MapState$removeFeatureState$2$1$cancelable$1
            @Override // com.mapbox.maps.FeatureStateOperationCallback
            public final void run(Expected<String, None> expected) {
                expected.getClass();
                j<Expected<String, None>> jVar = kVar;
                int i16 = q.f128596b;
                jVar.resumeWith(expected);
            }
        })));
        Object objP = kVar.p();
        return objP == aVar ? aVar : objP;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @com.mapbox.maps.MapboxExperimental
    public final Object resetFeatureStates(TypedFeaturesetDescriptor<?, ?> typedFeaturesetDescriptor, d<? super Expected<String, None>> dVar) throws Throwable {
        C39651 c39651;
        if (dVar instanceof C39651) {
            c39651 = (C39651) dVar;
            int i14 = c39651.label;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                c39651.label = i14 - Integer.MIN_VALUE;
            } else {
                c39651 = new C39651(dVar);
            }
        } else {
            c39651 = new C39651(dVar);
        }
        Object objX = c39651.result;
        a aVar = a.COROUTINE_SUSPENDED;
        int i15 = c39651.label;
        if (i15 == 0) {
            r.b(objX);
            l1 l1Var = new l1(this.mapboxMapFlow);
            c39651.L$0 = typedFeaturesetDescriptor;
            c39651.label = 1;
            objX = s.x(l1Var, c39651);
            if (objX != aVar) {
            }
        }
        if (i15 != 1) {
            if (i15 != 2) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objX);
            return objX;
        }
        typedFeaturesetDescriptor = (TypedFeaturesetDescriptor) c39651.L$0;
        r.b(objX);
        MapboxMap mapboxMap = (MapboxMap) objX;
        c39651.L$0 = typedFeaturesetDescriptor;
        c39651.L$1 = mapboxMap;
        c39651.L$2 = c39651;
        c39651.label = 2;
        final o53.k kVar = new o53.k(f.b(c39651), 1);
        kVar.q();
        kVar.r(new MapState$resetFeatureStates$2$1$1(mapboxMap.resetFeatureStates(typedFeaturesetDescriptor, new FeatureStateOperationCallback() { // from class: com.mapbox.maps.extension.compose.MapState$resetFeatureStates$2$1$cancelable$1
            @Override // com.mapbox.maps.FeatureStateOperationCallback
            public final void run(Expected<String, None> expected) {
                expected.getClass();
                j<Expected<String, None>> jVar = kVar;
                int i16 = q.f128596b;
                jVar.resumeWith(expected);
            }
        })));
        Object objP = kVar.p();
        return objP == aVar ? aVar : objP;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @com.mapbox.maps.MapboxExperimental
    public final <FS extends FeatureState> Object setFeatureState(FeaturesetFeature<FS> featuresetFeature, FS fs3, d<? super Expected<String, None>> dVar) throws Throwable {
        C39661 c39661;
        if (dVar instanceof C39661) {
            c39661 = (C39661) dVar;
            int i14 = c39661.label;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                c39661.label = i14 - Integer.MIN_VALUE;
            } else {
                c39661 = new C39661(dVar);
            }
        } else {
            c39661 = new C39661(dVar);
        }
        Object objX = c39661.result;
        a aVar = a.COROUTINE_SUSPENDED;
        int i15 = c39661.label;
        if (i15 == 0) {
            r.b(objX);
            l1 l1Var = new l1(this.mapboxMapFlow);
            c39661.L$0 = featuresetFeature;
            c39661.L$1 = fs3;
            c39661.label = 1;
            objX = s.x(l1Var, c39661);
            if (objX != aVar) {
            }
        }
        if (i15 != 1) {
            if (i15 != 2) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objX);
            return objX;
        }
        fs3 = (FS) c39661.L$1;
        featuresetFeature = (FeaturesetFeature) c39661.L$0;
        r.b(objX);
        MapboxMap mapboxMap = (MapboxMap) objX;
        c39661.L$0 = featuresetFeature;
        c39661.L$1 = fs3;
        c39661.L$2 = mapboxMap;
        c39661.L$3 = c39661;
        c39661.label = 2;
        final o53.k kVar = new o53.k(f.b(c39661), 1);
        kVar.q();
        kVar.r(new MapState$setFeatureState$2$1$1(mapboxMap.setFeatureState(featuresetFeature, fs3, new FeatureStateOperationCallback() { // from class: com.mapbox.maps.extension.compose.MapState$setFeatureState$2$1$cancelable$1
            @Override // com.mapbox.maps.FeatureStateOperationCallback
            public final void run(Expected<String, None> expected) {
                expected.getClass();
                j<Expected<String, None>> jVar = kVar;
                int i16 = q.f128596b;
                jVar.resumeWith(expected);
            }
        })));
        Object objP = kVar.p();
        return objP == aVar ? aVar : objP;
    }

    public final void setGesturesSettings(GesturesSettings gesturesSettings) {
        gesturesSettings.getClass();
        this.gesturesState.setValue(gesturesSettings);
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/mapbox/maps/extension/compose/MapState$Companion;", "", "<init>", "()V", "Ld4/k;", "Lcom/mapbox/maps/extension/compose/MapState;", "Lcom/mapbox/maps/extension/compose/MapState$Holder;", "Saver", "Ld4/k;", "getSaver", "()Ld4/k;", "", "GESTURES_SETTINGS_KEY", "Ljava/lang/String;", "TAG", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final k<MapState, Holder> getSaver() {
            return MapState.Saver;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0015\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003HÆ\u0003J\u001f\u0010\t\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003HÆ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bHÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/mapbox/maps/extension/compose/MapState$Holder;", "Landroid/os/Parcelable;", "savedProperties", "", "", "(Ljava/util/Map;)V", "getSavedProperties", "()Ljava/util/Map;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class Holder implements Parcelable {
        private final Map<String, Parcelable> savedProperties;
        public static final Parcelable.Creator<Holder> CREATOR = new Creator();
        public static final int $stable = 8;

        /* JADX WARN: Multi-variable type inference failed */
        public Holder(Map<String, ? extends Parcelable> map) {
            map.getClass();
            this.savedProperties = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Holder copy$default(Holder holder, Map map, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                map = holder.savedProperties;
            }
            return holder.copy(map);
        }

        public final Map<String, Parcelable> component1() {
            return this.savedProperties;
        }

        public final Holder copy(Map<String, ? extends Parcelable> savedProperties) {
            savedProperties.getClass();
            return new Holder(savedProperties);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Holder) && p005kotlin.jvm.internal.s.g(this.savedProperties, ((Holder) other).savedProperties);
        }

        public final Map<String, Parcelable> getSavedProperties() {
            return this.savedProperties;
        }

        public int hashCode() {
            return this.savedProperties.hashCode();
        }

        public String toString() {
            return "Holder(savedProperties=" + this.savedProperties + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            parcel.getClass();
            Iterator itU = am.j.u(this.savedProperties, parcel);
            while (itU.hasNext()) {
                Map.Entry entry = (Map.Entry) itU.next();
                parcel.writeString((String) entry.getKey());
                parcel.writeParcelable((Parcelable) entry.getValue(), flags);
            }
        }

        @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Holder> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Holder createFromParcel(Parcel parcel) {
                parcel.getClass();
                int i14 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i14);
                for (int i15 = 0; i15 != i14; i15++) {
                    linkedHashMap.put(parcel.readString(), parcel.readParcelable(Holder.class.getClassLoader()));
                }
                return new Holder(linkedHashMap);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Holder[] newArray(int i14) {
                return new Holder[i14];
            }
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.MapState$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/mapbox/maps/plugin/gestures/generated/GesturesSettings$Builder;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass1 extends w implements e23.l<GesturesSettings.Builder, Unit> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // e23.l
        public /* bridge */ /* synthetic */ Unit invoke(GesturesSettings.Builder builder) {
            invoke2(builder);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(GesturesSettings.Builder builder) {
            builder.getClass();
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.MapState$UpdateGesturesSettings$2, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass2 extends w implements p<p3.m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ MapboxMap $mapboxMap;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(MapboxMap mapboxMap, int i14) {
            super(2);
            this.$mapboxMap = mapboxMap;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(p3.m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(p3.m mVar, int i14) {
            MapState.this.UpdateGesturesSettings(this.$mapboxMap, mVar, this.$$changed | 1);
        }
    }

    @com.mapbox.maps.MapboxExperimental
    public final <FS extends FeatureState, FSK extends FeatureStateKey<FS>> Object removeFeatureState(FeaturesetFeature<FS> featuresetFeature, d<? super Expected<String, None>> dVar) {
        return removeFeatureState$default(this, featuresetFeature, null, dVar, 2, null);
    }

    @com.mapbox.maps.MapboxExperimental
    public final <FF extends FeaturesetFeature<?>> Object queryRenderedFeatures(TypedFeaturesetDescriptor<?, FF> typedFeaturesetDescriptor, d<? super List<? extends FF>> dVar) {
        return queryRenderedFeatures$default(this, typedFeaturesetDescriptor, null, null, dVar, 6, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object queryRenderedFeatures(RenderedQueryGeometry renderedQueryGeometry, RenderedQueryOptions renderedQueryOptions, d<? super Expected<String, List<QueriedRenderedFeature>>> dVar) {
        C39621 c39621;
        if (dVar instanceof C39621) {
            c39621 = (C39621) dVar;
            int i14 = c39621.label;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                c39621.label = i14 - Integer.MIN_VALUE;
            } else {
                c39621 = new C39621(dVar);
            }
        } else {
            c39621 = new C39621(dVar);
        }
        Object objX = c39621.result;
        a aVar = a.COROUTINE_SUSPENDED;
        int i15 = c39621.label;
        if (i15 == 0) {
            r.b(objX);
            l1 l1Var = new l1(this.mapboxMapFlow);
            c39621.L$0 = renderedQueryGeometry;
            c39621.L$1 = renderedQueryOptions;
            c39621.label = 1;
            objX = s.x(l1Var, c39621);
            if (objX != aVar) {
            }
        }
        if (i15 != 1) {
            if (i15 == 2) {
                r.b(objX);
                return objX;
            }
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        renderedQueryOptions = (RenderedQueryOptions) c39621.L$1;
        renderedQueryGeometry = (RenderedQueryGeometry) c39621.L$0;
        r.b(objX);
        c39621.L$0 = null;
        c39621.L$1 = null;
        c39621.label = 2;
        Object objQueryRenderedFeatures = MapFeatureQueryDelegateExtKt.queryRenderedFeatures((MapFeatureQueryDelegate) objX, renderedQueryGeometry, renderedQueryOptions, c39621);
        return objQueryRenderedFeatures == aVar ? aVar : objQueryRenderedFeatures;
    }

    @com.mapbox.maps.MapboxExperimental
    public final <FF extends FeaturesetFeature<?>> Object queryRenderedFeatures(TypedFeaturesetDescriptor<?, FF> typedFeaturesetDescriptor, RenderedQueryGeometry renderedQueryGeometry, d<? super List<? extends FF>> dVar) {
        return queryRenderedFeatures$default(this, typedFeaturesetDescriptor, renderedQueryGeometry, null, dVar, 4, null);
    }

    public MapState() {
        this(GesturesSettingsKt.GesturesSettings(AnonymousClass1.INSTANCE));
    }
}
