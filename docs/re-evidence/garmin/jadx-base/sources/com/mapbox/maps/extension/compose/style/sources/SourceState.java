package com.mapbox.maps.extension.compose.style.sources;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.gncs.NotificationConstants;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.None;
import com.mapbox.bindgen.Value;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.extension.compose.style.internal.GeoJSONDataParceler;
import com.mapbox.maps.extension.compose.style.internal.PairParceler;
import e23.p;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import k23.g;
import o13.r;
import o53.a0;
import o53.b0;
import o53.c0;
import o53.l1;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.k0;
import p13.t0;
import p13.y;
import p3.m;
import q53.i;
import q53.l;
import r53.g2;
import r53.j;
import r53.q2;
import r53.y1;
import r53.z1;
import u53.o;
import v13.e;
import vb.h;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010#\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b'\u0018\u0000 ^2\u00020\u0001:\u0002^_BC\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u001e\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00060\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0015\u0010\u0013J\u001f\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\bH\u0000¢\u0006\u0004\b\u001c\u0010\u001aJ\u0019\u0010\u001e\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0017\u001a\u00020\u0002H\u0004¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010#\u001a\u00020 H\u0000¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020\u0002H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010(\u001a\u00020\u0011H!¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b)\u0010*J+\u0010,\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000f2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0005H\u0002¢\u0006\u0004\b,\u0010-J\u001b\u00100\u001a\u00020/*\u00020.2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b0\u00101J\u001b\u00102\u001a\u00020/*\u00020.2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b2\u00101J#\u00105\u001a\u00020/*\u00020.2\u0006\u00104\u001a\u0002032\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b5\u00106J1\u00109\u001a\u00020\u0011*\f\u0012\u0004\u0012\u00020\b07j\u0002`82\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0082@ø\u0001\u0000¢\u0006\u0004\b9\u0010:J1\u0010;\u001a\u00020\u0011*\f\u0012\u0004\u0012\u00020\b07j\u0002`82\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0082@ø\u0001\u0000¢\u0006\u0004\b;\u0010:J\u0017\u0010<\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b<\u0010*J\u0017\u0010=\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b=\u0010*J'\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010>\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001b\u0010?R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010@\u001a\u0004\bA\u0010%R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010@R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010BR\u001c\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00020C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0018\u0010F\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010H\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u001c\u0010K\u001a\b\u0012\u0004\u0012\u00020\n0J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR*\u0010M\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\n8\u0004@DX\u0084\u000e¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\u001a\u0010T\u001a\b\u0012\u0004\u0012\u0002030S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0016\u0010V\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010IR,\u0010X\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00110W8\u0004X\u0084\u0004¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[R,\u0010\\\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00110W8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\\\u0010Y\u001a\u0004\b]\u0010[\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006`"}, d2 = {"Lcom/mapbox/maps/extension/compose/style/sources/SourceState;", "", "", "sourceId", "sourceType", "", "Lo13/p;", "", "Lcom/mapbox/bindgen/Value;", "initialProperties", "Lcom/mapbox/maps/extension/compose/style/sources/GeoJSONData;", "initialGeoJsonData", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/mapbox/maps/extension/compose/style/sources/GeoJSONData;)V", "layerId", "Lcom/mapbox/maps/MapboxMap;", "mapboxMap", "", "attachToLayer$extension_compose_release", "(Ljava/lang/String;Lcom/mapbox/maps/MapboxMap;)V", "attachToLayer", "detachFromLayer$extension_compose_release", "detachFromLayer", "name", "value", "setProperty$extension_compose_release", "(Ljava/lang/String;Lcom/mapbox/bindgen/Value;)V", "setProperty", "setBuilderProperty$extension_compose_release", "setBuilderProperty", "getProperty", "(Ljava/lang/String;)Lcom/mapbox/bindgen/Value;", "Lcom/mapbox/maps/extension/compose/style/sources/SourceState$Holder;", "save$extension_compose_release", "()Lcom/mapbox/maps/extension/compose/style/sources/SourceState$Holder;", "save", "toString", "()Ljava/lang/String;", "UpdateProperties$extension_compose_release", "(Lp3/m;I)V", "UpdateProperties", "attachTo", "(Lcom/mapbox/maps/MapboxMap;)V", "cachedProperties", "addSource", "(Lcom/mapbox/maps/MapboxMap;Ljava/util/Map;)Z", "Lo53/b0;", "Lo53/l1;", "launchCollectGeoJsonData", "(Lo53/b0;Lcom/mapbox/maps/MapboxMap;)Lo53/l1;", "launchCollectPropertyFlows", "Lcom/mapbox/maps/extension/compose/style/sources/PropertyDetails;", "details", "launchCollectProperty", "(Lo53/b0;Lcom/mapbox/maps/extension/compose/style/sources/PropertyDetails;Lcom/mapbox/maps/MapboxMap;)Lo53/l1;", "Lr53/z1;", "Lcom/mapbox/maps/extension/compose/style/sources/PropertyValueFlow;", "collectBuilderProperty", "(Lr53/z1;Ljava/lang/String;Lcom/mapbox/maps/MapboxMap;Lt13/d;)Ljava/lang/Object;", "collectProperty", "detachFrom", "removeSource", "isBuilderProperty", "(Ljava/lang/String;Lcom/mapbox/bindgen/Value;Z)V", "Ljava/lang/String;", "getSourceId", "Lcom/mapbox/maps/MapboxMap;", "", "associatedLayers", "Ljava/util/Set;", "mapboxMapScope", "Lo53/b0;", "isGeoJsonSource", "Z", "Lq53/i;", "geoJSONDataChannel", "Lq53/i;", "geoJSONData", "Lcom/mapbox/maps/extension/compose/style/sources/GeoJSONData;", "getGeoJSONData", "()Lcom/mapbox/maps/extension/compose/style/sources/GeoJSONData;", "setGeoJSONData", "(Lcom/mapbox/maps/extension/compose/style/sources/GeoJSONData;)V", "Lr53/y1;", "propertiesFlowsToCollect", "Lr53/y1;", "sourceAddedExternally", "Lkotlin/reflect/KFunction2;", "setBuilderPropertyAction", "Lk23/g;", "getSetBuilderPropertyAction", "()Lk23/g;", "setPropertyAction", "getSetPropertyAction", "Companion", "Holder", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public abstract class SourceState {

    @Deprecated
    private static final String GEO_JSON_SOURCE_TYPE = "geojson";

    @Deprecated
    private static final String TAG = "SourceState";
    private Set<String> associatedLayers;
    private GeoJSONData geoJSONData;
    private i<GeoJSONData> geoJSONDataChannel;
    private final boolean isGeoJsonSource;
    private MapboxMap mapboxMap;
    private b0 mapboxMapScope;
    private final y1<PropertyDetails> propertiesFlowsToCollect;
    private final g<Unit> setBuilderPropertyAction;
    private final g<Unit> setPropertyAction;
    private boolean sourceAddedExternally;
    private final String sourceId;
    private final String sourceType;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.style.sources.SourceState$collectBuilderProperty$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @e(c = "com.mapbox.maps.extension.compose.style.sources.SourceState", f = "SourceState.kt", l = {271}, m = "collectBuilderProperty")
    public static final class AnonymousClass1 extends v13.c {
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(t13.d<? super AnonymousClass1> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SourceState.this.collectBuilderProperty(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.style.sources.SourceState$collectProperty$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @e(c = "com.mapbox.maps.extension.compose.style.sources.SourceState", f = "SourceState.kt", l = {296}, m = "collectProperty")
    public static final class C42001 extends v13.c {
        int label;
        /* synthetic */ Object result;

        public C42001(t13.d<? super C42001> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SourceState.this.collectProperty(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.style.sources.SourceState$launchCollectGeoJsonData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 7, 1})
    @e(c = "com.mapbox.maps.extension.compose.style.sources.SourceState$launchCollectGeoJsonData$1", f = "SourceState.kt", l = {419}, m = "invokeSuspend")
    public static final class C42021 extends v13.i implements p<b0, t13.d<? super Unit>, Object> {
        final /* synthetic */ MapboxMap $mapboxMap;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42021(MapboxMap mapboxMap, t13.d<? super C42021> dVar) {
            super(2, dVar);
            this.$mapboxMap = mapboxMap;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$1$lambda$0(String str) {
            MapboxLogger.logE(SourceState.TAG, "setStyleGeoJSONSourceData failed: " + str);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return SourceState.this.new C42021(this.$mapboxMap, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((C42021) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:16:0x004b A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:19:0x0054 A[Catch: all -> 0x001d, TRY_LEAVE, TryCatch #1 {all -> 0x001d, blocks: (B:6:0x0019, B:17:0x004c, B:19:0x0054, B:14:0x003b, B:13:0x0033), top: B:29:0x0005 }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0049 -> B:17:0x004c). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // v13.a
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                u13.a r0 = u13.a.COROUTINE_SUSPENDED
                int r1 = r9.label
                r2 = 1
                if (r1 == 0) goto L26
                if (r1 != r2) goto L1f
                java.lang.Object r1 = r9.L$3
                q53.k r1 = (q53.k) r1
                java.lang.Object r3 = r9.L$2
                q53.v r3 = (q53.v) r3
                java.lang.Object r4 = r9.L$1
                com.mapbox.maps.extension.compose.style.sources.SourceState r4 = (com.mapbox.maps.extension.compose.style.sources.SourceState) r4
                java.lang.Object r5 = r9.L$0
                com.mapbox.maps.MapboxMap r5 = (com.mapbox.maps.MapboxMap) r5
                o13.r.b(r10)     // Catch: java.lang.Throwable -> L1d
                goto L4c
            L1d:
                r10 = move-exception
                goto L8f
            L1f:
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                vb.h.z(r10)
                r10 = 0
                return r10
            L26:
                o13.r.b(r10)
                com.mapbox.maps.extension.compose.style.sources.SourceState r10 = com.mapbox.maps.extension.compose.style.sources.SourceState.this
                q53.i r3 = com.mapbox.maps.extension.compose.style.sources.SourceState.access$getGeoJSONDataChannel$p(r10)
                com.mapbox.maps.MapboxMap r10 = r9.$mapboxMap
                com.mapbox.maps.extension.compose.style.sources.SourceState r1 = com.mapbox.maps.extension.compose.style.sources.SourceState.this
                q53.k r4 = r3.iterator()     // Catch: java.lang.Throwable -> L1d
                r5 = r4
                r4 = r1
                r1 = r5
                r5 = r10
            L3b:
                r9.L$0 = r5     // Catch: java.lang.Throwable -> L1d
                r9.L$1 = r4     // Catch: java.lang.Throwable -> L1d
                r9.L$2 = r3     // Catch: java.lang.Throwable -> L1d
                r9.L$3 = r1     // Catch: java.lang.Throwable -> L1d
                r9.label = r2     // Catch: java.lang.Throwable -> L1d
                java.lang.Object r10 = r1.a(r9)     // Catch: java.lang.Throwable -> L1d
                if (r10 != r0) goto L4c
                return r0
            L4c:
                java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L1d
                boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L1d
                if (r10 == 0) goto L88
                java.lang.Object r10 = r1.next()     // Catch: java.lang.Throwable -> L1d
                com.mapbox.maps.extension.compose.style.sources.GeoJSONData r10 = (com.mapbox.maps.extension.compose.style.sources.GeoJSONData) r10     // Catch: java.lang.Throwable -> L1d
                java.lang.String r6 = "SourceState"
                java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1d
                r7.<init>()     // Catch: java.lang.Throwable -> L1d
                java.lang.String r8 = "setGeoJsonSourceData: "
                r7.append(r8)     // Catch: java.lang.Throwable -> L1d
                r7.append(r10)     // Catch: java.lang.Throwable -> L1d
                java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L1d
                com.mapbox.maps.MapboxLogger.logD(r6, r7)     // Catch: java.lang.Throwable -> L1d
                java.lang.String r6 = r4.getSourceId()     // Catch: java.lang.Throwable -> L1d
                java.lang.String r7 = ""
                com.mapbox.maps.GeoJSONSourceData r10 = r10.getData$extension_compose_release()     // Catch: java.lang.Throwable -> L1d
                com.mapbox.bindgen.Expected r10 = r5.setStyleGeoJSONSourceData(r6, r7, r10)     // Catch: java.lang.Throwable -> L1d
                com.mapbox.maps.extension.compose.style.sources.b r6 = new com.mapbox.maps.extension.compose.style.sources.b     // Catch: java.lang.Throwable -> L1d
                r7 = 1
                r6.<init>(r7)     // Catch: java.lang.Throwable -> L1d
                r10.onError(r6)     // Catch: java.lang.Throwable -> L1d
                goto L3b
            L88:
                r10 = 0
                r3.c(r10)
                kotlin.Unit r10 = p005kotlin.Unit.INSTANCE
                return r10
            L8f:
                throw r10     // Catch: java.lang.Throwable -> L90
            L90:
                r0 = move-exception
                og.a.v(r3, r10)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mapbox.maps.extension.compose.style.sources.SourceState.C42021.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.style.sources.SourceState$launchCollectProperty$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 7, 1})
    @e(c = "com.mapbox.maps.extension.compose.style.sources.SourceState$launchCollectProperty$1", f = "SourceState.kt", l = {264, 266}, m = "invokeSuspend")
    public static final class C42031 extends v13.i implements p<b0, t13.d<? super Unit>, Object> {
        final /* synthetic */ PropertyDetails $details;
        final /* synthetic */ MapboxMap $mapboxMap;
        int label;
        final /* synthetic */ SourceState this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42031(PropertyDetails propertyDetails, SourceState sourceState, MapboxMap mapboxMap, t13.d<? super C42031> dVar) {
            super(2, dVar);
            this.$details = propertyDetails;
            this.this$0 = sourceState;
            this.$mapboxMap = mapboxMap;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new C42031(this.$details, this.this$0, this.$mapboxMap, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((C42031) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x004e, code lost:
        
            if (r1.collectBuilderProperty(r6, r2, r4, r5) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0065, code lost:
        
            if (r1.collectProperty(r6, r3, r4, r5) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0067, code lost:
        
            return r0;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.label;
            if (i14 == 0) {
                r.b(obj);
                MapboxLogger.logD(SourceState.TAG, "startCollectingPropertyFlows: start collecting " + this.$details);
                boolean zIsBuilderProperty = this.$details.isBuilderProperty();
                SourceState sourceState = this.this$0;
                if (zIsBuilderProperty) {
                    z1<Value> valueFlow = this.$details.getValueFlow();
                    String name = this.$details.getName();
                    MapboxMap mapboxMap = this.$mapboxMap;
                    this.label = 1;
                } else {
                    z1<Value> valueFlow2 = this.$details.getValueFlow();
                    String name2 = this.$details.getName();
                    MapboxMap mapboxMap2 = this.$mapboxMap;
                    this.label = 2;
                }
            } else {
                if (i14 != 1 && i14 != 2) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.style.sources.SourceState$launchCollectPropertyFlows$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 7, 1})
    @e(c = "com.mapbox.maps.extension.compose.style.sources.SourceState$launchCollectPropertyFlows$1", f = "SourceState.kt", l = {249}, m = "invokeSuspend")
    public static final class C42041 extends v13.i implements p<b0, t13.d<? super Unit>, Object> {
        final /* synthetic */ MapboxMap $mapboxMap;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42041(MapboxMap mapboxMap, t13.d<? super C42041> dVar) {
            super(2, dVar);
            this.$mapboxMap = mapboxMap;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            C42041 c42041 = SourceState.this.new C42041(this.$mapboxMap, dVar);
            c42041.L$0 = obj;
            return c42041;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((C42041) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.label;
            if (i14 == 0) {
                r.b(obj);
                final b0 b0Var = (b0) this.L$0;
                y1 y1Var = SourceState.this.propertiesFlowsToCollect;
                final SourceState sourceState = SourceState.this;
                final MapboxMap mapboxMap = this.$mapboxMap;
                j<PropertyDetails> jVar = new j<PropertyDetails>() { // from class: com.mapbox.maps.extension.compose.style.sources.SourceState.launchCollectPropertyFlows.1.1
                    /* JADX INFO: renamed from: emit, reason: avoid collision after fix types in other method */
                    public final Object emit2(PropertyDetails propertyDetails, t13.d<? super Unit> dVar) {
                        sourceState.launchCollectProperty(b0Var, propertyDetails, mapboxMap);
                        return Unit.INSTANCE;
                    }

                    @Override // r53.j
                    public /* bridge */ /* synthetic */ Object emit(PropertyDetails propertyDetails, t13.d dVar) {
                        return emit2(propertyDetails, (t13.d<? super Unit>) dVar);
                    }
                };
                this.label = 1;
                if (y1Var.collect(jVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            o2.c.f();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SourceState(String str, String str2, Map<String, ? extends o13.p<Boolean, ? extends Value>> map, GeoJSONData geoJSONData) {
        str.getClass();
        str2.getClass();
        map.getClass();
        geoJSONData.getClass();
        this.sourceId = str;
        this.sourceType = str2;
        this.associatedLayers = new LinkedHashSet();
        this.isGeoJsonSource = str2.equals(GEO_JSON_SOURCE_TYPE);
        this.geoJSONDataChannel = l.a(-1, 6, null);
        this.geoJSONData = geoJSONData;
        this.propertiesFlowsToCollect = g2.b(Integer.MAX_VALUE, 0, null, 6);
        for (Map.Entry<String, ? extends o13.p<Boolean, ? extends Value>> entry : map.entrySet()) {
            String key = entry.getKey();
            o13.p<Boolean, ? extends Value> value = entry.getValue();
            boolean zBooleanValue = value.f128594a.booleanValue();
            Value value2 = (Value) value.f128595b;
            if (zBooleanValue) {
                setBuilderProperty$extension_compose_release(key, value2);
            } else {
                setProperty$extension_compose_release(key, value2);
            }
        }
        this.setBuilderPropertyAction = new SourceState$setBuilderPropertyAction$1(this);
        this.setPropertyAction = new SourceState$setPropertyAction$1(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean addSource(MapboxMap mapboxMap, Map<String, ? extends Value> cachedProperties) {
        MapboxLogger.logD(TAG, "Adding source: " + this.sourceType + " - " + this.sourceId);
        if (mapboxMap.styleSourceExists(this.sourceId)) {
            MapboxLogger.logW(TAG, "Source already exists: " + this.sourceId);
            androidx.core.view.j.y("Source ", this.sourceId, " already exists in map ", mapboxMap);
            return false;
        }
        HashMap map = new HashMap();
        map.put(NotificationConstants.KEY_DATA_MIME_TYPE, new Value(this.sourceType));
        if (this.isGeoJsonSource && !cachedProperties.containsKey("data")) {
            Value valueNullValue = Value.nullValue();
            valueNullValue.getClass();
            map.put("data", valueNullValue);
        }
        map.putAll(cachedProperties);
        List<PropertyDetails> listA = this.propertiesFlowsToCollect.a();
        int iA = t0.a(y.r(listA, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        for (PropertyDetails propertyDetails : listA) {
            o13.p pVar = new o13.p(propertyDetails.getName(), propertyDetails.getValueFlow().getValue());
            linkedHashMap.put(pVar.f128594a, pVar.f128595b);
        }
        map.putAll(linkedHashMap);
        MapboxLogger.logD(TAG, "Setting all properties in one go: " + map);
        String str = this.sourceId;
        Value valueValueOf = Value.valueOf((HashMap<String, Value>) map);
        valueValueOf.getClass();
        Object objFold = mapboxMap.addStyleSource(str, valueValueOf).fold(new b(2), new a(this, 1));
        objFold.getClass();
        return ((Boolean) objFold).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean addSource$lambda$3(String str) {
        str.getClass();
        MapboxLogger.logE(TAG, "Failed to add source: ".concat(str));
        return Boolean.FALSE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean addSource$lambda$4(SourceState sourceState, None none) {
        sourceState.getClass();
        none.getClass();
        MapboxLogger.logD(TAG, "Added source: " + sourceState.sourceType + " - " + sourceState.sourceId);
        if (sourceState.isGeoJsonSource && !s.g(sourceState.geoJSONData, GeoJSONData.DEFAULT)) {
            sourceState.geoJSONDataChannel.i(sourceState.geoJSONData);
        }
        return Boolean.TRUE;
    }

    private final void attachTo(MapboxMap mapboxMap) {
        boolean zAddSource;
        MapboxLogger.logD(TAG, "attachTo() called for " + this.sourceId);
        if (mapboxMap.styleSourceExists(this.sourceId)) {
            MapboxLogger.logW(TAG, "Source [" + this.sourceId + "] already exists. This might lead to conflicting states.");
            zAddSource = true;
            this.sourceAddedExternally = true;
        } else {
            k0 k0Var = k0.f134949a;
            k0Var.getClass();
            zAddSource = addSource(mapboxMap, k0Var);
        }
        if (zAddSource) {
            x53.c cVar = s0.f129406a;
            u53.d dVarA = c0.a(o.f168762a.H().plus(ge1.b.h()).plus(new a0("SourceStateMapboxMapScope_" + this.sourceId)));
            this.mapboxMapScope = dVarA;
            if (this.isGeoJsonSource) {
                launchCollectGeoJsonData(dVarA, mapboxMap);
            }
            launchCollectPropertyFlows(dVarA, mapboxMap);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object collectBuilderProperty(z1<Value> z1Var, String str, MapboxMap mapboxMap, t13.d<? super Unit> dVar) {
        AnonymousClass1 anonymousClass1;
        if (dVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) dVar;
            int i14 = anonymousClass1.label;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i14 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(dVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(dVar);
        }
        Object obj = anonymousClass1.result;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = anonymousClass1.label;
        if (i15 == 0) {
            r.b(obj);
            j<? super Value> anonymousClass2 = new AnonymousClass2(str, this, mapboxMap);
            anonymousClass1.label = 1;
            if (z1Var.collect(anonymousClass2, anonymousClass1) == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        o2.c.f();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object collectProperty(z1<Value> z1Var, String str, MapboxMap mapboxMap, t13.d<? super Unit> dVar) {
        C42001 c42001;
        if (dVar instanceof C42001) {
            c42001 = (C42001) dVar;
            int i14 = c42001.label;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                c42001.label = i14 - Integer.MIN_VALUE;
            } else {
                c42001 = new C42001(dVar);
            }
        } else {
            c42001 = new C42001(dVar);
        }
        Object obj = c42001.result;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = c42001.label;
        if (i15 == 0) {
            r.b(obj);
            j<? super Value> c42012 = new C42012(str, mapboxMap, this);
            c42001.label = 1;
            if (z1Var.collect(c42012, c42001) == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        o2.c.f();
        return null;
    }

    private final void detachFrom(MapboxMap mapboxMap) {
        removeSource(mapboxMap);
        b0 b0Var = this.mapboxMapScope;
        if (b0Var != null) {
            c0.c(b0Var, null);
        }
        if (this.isGeoJsonSource) {
            this.geoJSONDataChannel = l.a(-1, 6, null);
        }
    }

    private final l1 launchCollectGeoJsonData(b0 b0Var, MapboxMap mapboxMap) {
        x53.c cVar = s0.f129406a;
        return ge1.b.T(b0Var, x53.b.f189152a, null, new C42021(mapboxMap, null), 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final l1 launchCollectProperty(b0 b0Var, PropertyDetails propertyDetails, MapboxMap mapboxMap) {
        return ge1.b.T(b0Var, null, null, new C42031(propertyDetails, this, mapboxMap, null), 3);
    }

    private final l1 launchCollectPropertyFlows(b0 b0Var, MapboxMap mapboxMap) {
        return ge1.b.T(b0Var, null, null, new C42041(mapboxMap, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeSource(MapboxMap mapboxMap) {
        MapboxLogger.logD(TAG, "Removing " + this.sourceType + " source: " + this.sourceId);
        mapboxMap.removeStyleSourceUnchecked(this.sourceId).onError(new a(this, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void removeSource$lambda$5(SourceState sourceState, String str) {
        sourceState.getClass();
        str.getClass();
        MapboxLogger.logE(TAG, "Failed to remove " + sourceState.sourceType + " Source " + sourceState.sourceId + ": " + str);
    }

    private final void setProperty(String name, Value value, boolean isBuilderProperty) {
        Object next;
        MapboxLogger.logD(TAG, "setProperty() called with: name = " + name + ", value = " + value + ", isBuilderProperty = " + isBuilderProperty);
        Iterator<T> it = this.propertiesFlowsToCollect.a().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!s.g(((PropertyDetails) next).getName(), name));
        PropertyDetails propertyDetails = (PropertyDetails) next;
        if (propertyDetails != null) {
            propertyDetails.getValueFlow().setValue(value);
            return;
        }
        MapboxLogger.logD(TAG, "setProperty: emitting new property to listen to: " + name);
        this.propertiesFlowsToCollect.d(new PropertyDetails(name, isBuilderProperty, q2.a(value)));
    }

    public abstract void UpdateProperties$extension_compose_release(m mVar, int i14);

    public final void attachToLayer$extension_compose_release(String layerId, MapboxMap mapboxMap) {
        layerId.getClass();
        mapboxMap.getClass();
        MapboxLogger.logD(TAG, this.sourceType + " - " + this.sourceId + " attachToLayer: layerId=" + layerId);
        MapboxMap mapboxMap2 = this.mapboxMap;
        if (mapboxMap2 != null && mapboxMap2 != mapboxMap) {
            MapboxLogger.logW(TAG, "The source state should not be used across multiple map instances!");
        }
        this.mapboxMap = mapboxMap;
        if (this.associatedLayers.add(layerId) && this.associatedLayers.size() == 1) {
            attachTo(mapboxMap);
        }
    }

    public final void detachFromLayer$extension_compose_release(String layerId, MapboxMap mapboxMap) {
        layerId.getClass();
        mapboxMap.getClass();
        MapboxLogger.logD(TAG, this.sourceType + ' ' + this.sourceId + " detachFromLayer: layerId=" + layerId);
        this.associatedLayers.remove(layerId);
        if (!this.associatedLayers.isEmpty() || this.sourceAddedExternally) {
            return;
        }
        detachFrom(mapboxMap);
        this.mapboxMap = null;
    }

    public final GeoJSONData getGeoJSONData() {
        return this.geoJSONData;
    }

    public final Value getProperty(String name) {
        Object next;
        z1<Value> valueFlow;
        name.getClass();
        Iterator<T> it = this.propertiesFlowsToCollect.a().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!s.g(((PropertyDetails) next).getName(), name));
        PropertyDetails propertyDetails = (PropertyDetails) next;
        if (propertyDetails == null || (valueFlow = propertyDetails.getValueFlow()) == null) {
            return null;
        }
        return valueFlow.getValue();
    }

    public final g<Unit> getSetBuilderPropertyAction() {
        return this.setBuilderPropertyAction;
    }

    public final g<Unit> getSetPropertyAction() {
        return this.setPropertyAction;
    }

    public final String getSourceId() {
        return this.sourceId;
    }

    public final Holder save$extension_compose_release() {
        String str = this.sourceId;
        List<PropertyDetails> listA = this.propertiesFlowsToCollect.a();
        int iA = t0.a(y.r(listA, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        for (PropertyDetails propertyDetails : listA) {
            o13.p pVar = new o13.p(propertyDetails.getName(), new o13.p(Boolean.valueOf(propertyDetails.isBuilderProperty()), propertyDetails.getValueFlow().getValue()));
            linkedHashMap.put(pVar.f128594a, pVar.f128595b);
        }
        return new Holder(str, linkedHashMap, this.geoJSONData);
    }

    public final void setBuilderProperty$extension_compose_release(String name, Value value) {
        name.getClass();
        value.getClass();
        setProperty(name, value, true);
    }

    public final void setGeoJSONData(GeoJSONData geoJSONData) {
        geoJSONData.getClass();
        if (s.g(this.geoJSONData, geoJSONData)) {
            return;
        }
        this.geoJSONData = geoJSONData;
        this.geoJSONDataChannel.i(geoJSONData);
    }

    public final void setProperty$extension_compose_release(String name, Value value) {
        name.getClass();
        value.getClass();
        setProperty(name, value, false);
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("SourceState(sourceType=");
        sb3.append(this.sourceType);
        sb3.append(", sourceId=");
        return androidx.room.a0.m(sb3, this.sourceId, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/mapbox/maps/extension/compose/style/sources/SourceState$Companion;", "", "()V", "GEO_JSON_SOURCE_TYPE", "", "TAG", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u001e\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u0004\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ(\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012JF\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022 \b\u0002\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u00042\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000eJ\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0018J \u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u000eR/\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b'\u0010\u0010R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010(\u001a\u0004\b)\u0010\u0012¨\u0006*"}, d2 = {"Lcom/mapbox/maps/extension/compose/style/sources/SourceState$Holder;", "Landroid/os/Parcelable;", "", "sourcedId", "", "Lo13/p;", "", "Lcom/mapbox/bindgen/Value;", "savedProperties", "Lcom/mapbox/maps/extension/compose/style/sources/GeoJSONData;", "geoJSONData", "<init>", "(Ljava/lang/String;Ljava/util/Map;Lcom/mapbox/maps/extension/compose/style/sources/GeoJSONData;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/Map;", "component3", "()Lcom/mapbox/maps/extension/compose/style/sources/GeoJSONData;", "copy", "(Ljava/lang/String;Ljava/util/Map;Lcom/mapbox/maps/extension/compose/style/sources/GeoJSONData;)Lcom/mapbox/maps/extension/compose/style/sources/SourceState$Holder;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getSourcedId", "Ljava/util/Map;", "getSavedProperties", "Lcom/mapbox/maps/extension/compose/style/sources/GeoJSONData;", "getGeoJSONData", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class Holder implements Parcelable {
        private final GeoJSONData geoJSONData;
        private final Map<String, o13.p<Boolean, Value>> savedProperties;
        private final String sourcedId;
        public static final Parcelable.Creator<Holder> CREATOR = new Creator();
        public static final int $stable = 8;

        /* JADX WARN: Multi-variable type inference failed */
        public Holder(String str, Map<String, ? extends o13.p<Boolean, ? extends Value>> map, GeoJSONData geoJSONData) {
            str.getClass();
            map.getClass();
            geoJSONData.getClass();
            this.sourcedId = str;
            this.savedProperties = map;
            this.geoJSONData = geoJSONData;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Holder copy$default(Holder holder, String str, Map map, GeoJSONData geoJSONData, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                str = holder.sourcedId;
            }
            if ((i14 & 2) != 0) {
                map = holder.savedProperties;
            }
            if ((i14 & 4) != 0) {
                geoJSONData = holder.geoJSONData;
            }
            return holder.copy(str, map, geoJSONData);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getSourcedId() {
            return this.sourcedId;
        }

        public final Map<String, o13.p<Boolean, Value>> component2() {
            return this.savedProperties;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final GeoJSONData getGeoJSONData() {
            return this.geoJSONData;
        }

        public final Holder copy(String sourcedId, Map<String, ? extends o13.p<Boolean, ? extends Value>> savedProperties, GeoJSONData geoJSONData) {
            sourcedId.getClass();
            savedProperties.getClass();
            geoJSONData.getClass();
            return new Holder(sourcedId, savedProperties, geoJSONData);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Holder)) {
                return false;
            }
            Holder holder = (Holder) other;
            return s.g(this.sourcedId, holder.sourcedId) && s.g(this.savedProperties, holder.savedProperties) && s.g(this.geoJSONData, holder.geoJSONData);
        }

        public final GeoJSONData getGeoJSONData() {
            return this.geoJSONData;
        }

        public final Map<String, o13.p<Boolean, Value>> getSavedProperties() {
            return this.savedProperties;
        }

        public final String getSourcedId() {
            return this.sourcedId;
        }

        public int hashCode() {
            return this.geoJSONData.hashCode() + am.j.b(this.savedProperties, this.sourcedId.hashCode() * 31, 31);
        }

        public String toString() {
            return "Holder(sourcedId=" + this.sourcedId + ", savedProperties=" + this.savedProperties + ", geoJSONData=" + this.geoJSONData + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            parcel.getClass();
            parcel.writeString(this.sourcedId);
            Iterator itU = am.j.u(this.savedProperties, parcel);
            while (itU.hasNext()) {
                Map.Entry entry = (Map.Entry) itU.next();
                parcel.writeString((String) entry.getKey());
                PairParceler.INSTANCE.write((o13.p<Boolean, ? extends Value>) entry.getValue(), parcel, flags);
            }
            GeoJSONDataParceler.INSTANCE.write(this.geoJSONData, parcel, flags);
        }

        @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Holder> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Holder createFromParcel(Parcel parcel) {
                parcel.getClass();
                String string = parcel.readString();
                int i14 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i14);
                for (int i15 = 0; i15 != i14; i15++) {
                    linkedHashMap.put(parcel.readString(), PairParceler.INSTANCE.create(parcel));
                }
                return new Holder(string, linkedHashMap, GeoJSONDataParceler.INSTANCE.m216create(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Holder[] newArray(int i14) {
                return new Holder[i14];
            }
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.style.sources.SourceState$collectProperty$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "value", "Lcom/mapbox/bindgen/Value;"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C42012 implements j<Value> {
        final /* synthetic */ MapboxMap $mapboxMap;
        final /* synthetic */ String $name;
        final /* synthetic */ SourceState this$0;

        public C42012(String str, MapboxMap mapboxMap, SourceState sourceState) {
            this.$name = str;
            this.$mapboxMap = mapboxMap;
            this.this$0 = sourceState;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void emit$lambda$0(String str, Value value, SourceState sourceState, String str2) {
            str.getClass();
            value.getClass();
            sourceState.getClass();
            str2.getClass();
            MapboxLogger.logE(SourceState.TAG, "Failed to set source property " + str + " as " + value + " on " + sourceState.getSourceId() + ": " + str2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void emit$lambda$1(String str, Value value, None none) {
            str.getClass();
            value.getClass();
            none.getClass();
            MapboxLogger.logD(SourceState.TAG, "settingProperty: name=" + str + ", value=" + value + " executed");
        }

        /* JADX INFO: renamed from: emit, reason: avoid collision after fix types in other method */
        public final Object emit2(final Value value, t13.d<? super Unit> dVar) {
            MapboxLogger.logD(SourceState.TAG, "settingProperty: name=" + this.$name + ", value=" + value + " ...");
            Expected<String, None> styleSourceProperty = this.$mapboxMap.setStyleSourceProperty(this.this$0.getSourceId(), this.$name, value);
            final String str = this.$name;
            final SourceState sourceState = this.this$0;
            Expected<String, None> expectedOnError = styleSourceProperty.onError(new Expected.Action() { // from class: com.mapbox.maps.extension.compose.style.sources.c
                @Override // com.mapbox.bindgen.Expected.Action
                public final void run(Object obj) {
                    SourceState.C42012.emit$lambda$0(str, value, sourceState, (String) obj);
                }
            });
            final String str2 = this.$name;
            expectedOnError.onValue(new Expected.Action() { // from class: com.mapbox.maps.extension.compose.style.sources.d
                @Override // com.mapbox.bindgen.Expected.Action
                public final void run(Object obj) {
                    SourceState.C42012.emit$lambda$1(str2, value, (None) obj);
                }
            });
            return Unit.INSTANCE;
        }

        @Override // r53.j
        public /* bridge */ /* synthetic */ Object emit(Value value, t13.d dVar) {
            return emit2(value, (t13.d<? super Unit>) dVar);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.style.sources.SourceState$collectBuilderProperty$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "value", "Lcom/mapbox/bindgen/Value;"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass2 implements j<Value> {
        final /* synthetic */ MapboxMap $mapboxMap;
        final /* synthetic */ String $name;
        final /* synthetic */ SourceState this$0;

        public AnonymousClass2(String str, SourceState sourceState, MapboxMap mapboxMap) {
            this.$name = str;
            this.this$0 = sourceState;
            this.$mapboxMap = mapboxMap;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Map emit$lambda$0(SourceState sourceState, String str) {
            sourceState.getClass();
            str.getClass();
            MapboxLogger.logW(SourceState.TAG, "Unable to cache " + sourceState.getSourceId() + " properties: " + str);
            k0 k0Var = k0.f134949a;
            k0Var.getClass();
            return k0Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Map emit$lambda$1(Value value) {
            value.getClass();
            Object contents = value.getContents();
            contents.getClass();
            return (Map) contents;
        }

        /* JADX INFO: renamed from: emit, reason: avoid collision after fix types in other method */
        public final Object emit2(Value value, t13.d<? super Unit> dVar) {
            Map map;
            MapboxLogger.logD(SourceState.TAG, "collectBuilderProperty: name=" + this.$name + ", value=" + value + " ...");
            if (this.this$0.sourceAddedExternally) {
                int i14 = 0;
                Object objFold = this.$mapboxMap.getStyleSourceProperties(this.this$0.getSourceId()).fold(new a(this.this$0, i14), new b(i14));
                objFold.getClass();
                map = (Map) objFold;
            } else {
                map = k0.f134949a;
                map.getClass();
            }
            this.this$0.removeSource(this.$mapboxMap);
            this.this$0.addSource(this.$mapboxMap, map);
            return Unit.INSTANCE;
        }

        @Override // r53.j
        public /* bridge */ /* synthetic */ Object emit(Value value, t13.d dVar) {
            return emit2(value, (t13.d<? super Unit>) dVar);
        }
    }

    public /* synthetic */ SourceState(String str, String str2, Map map, GeoJSONData geoJSONData, int i14, p005kotlin.jvm.internal.j jVar) {
        this(str, str2, map, (i14 & 8) != 0 ? GeoJSONData.DEFAULT : geoJSONData);
    }
}
