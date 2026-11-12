package com.mapbox.maps.extension.compose.style.sources.generated;

import ch.qos.logback.core.CoreConstants;
import com.mapbox.bindgen.Value;
import com.mapbox.maps.MapboxExperimental;
import com.mapbox.maps.extension.compose.style.BooleanValue;
import com.mapbox.maps.extension.compose.style.DoubleValue;
import com.mapbox.maps.extension.compose.style.IdGenerator;
import com.mapbox.maps.extension.compose.style.LongValue;
import com.mapbox.maps.extension.compose.style.PropertyTypesKt;
import com.mapbox.maps.extension.compose.style.StringValue;
import com.mapbox.maps.extension.compose.style.sources.ClusterProperties;
import com.mapbox.maps.extension.compose.style.sources.GeoJSONData;
import com.mapbox.maps.extension.compose.style.sources.PromoteIdValue;
import com.mapbox.maps.extension.compose.style.sources.SourceState;
import com.mapbox.maps.extension.compose.style.sources.TileCacheBudget;
import d4.k;
import d4.l;
import d4.m;
import java.util.Map;
import java.util.Objects;
import o13.p;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.k0;
import p13.u;
import p13.u0;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\bW\b\u0007\u0018\u0000 \u008a\u00012\u00020\u0001:\u0002\u008a\u0001B»\u0001\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u001e\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00060\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0015\u001a\u00020\f\u0012\u0006\u0010\u0016\u001a\u00020\f\u0012\u0006\u0010\u0017\u001a\u00020\f\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001a\u001a\u00020\u0013\u0012\u0006\u0010\u001b\u001a\u00020\u0013\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001e\u001a\u00020\u0013\u0012\u0006\u0010\u001f\u001a\u00020\f\u0012\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#B\u0013\b\u0016\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\"\u0010$J\u000f\u0010(\u001a\u00020%H\u0011¢\u0006\u0004\b&\u0010'J\u001a\u0010+\u001a\u00020\u00072\b\u0010*\u001a\u0004\u0018\u00010)H\u0096\u0002¢\u0006\u0004\b+\u0010,J\u000f\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u0002H\u0016¢\u0006\u0004\b0\u00101J\u001b\u00102\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0005H\u0002¢\u0006\u0004\b2\u00103R\u001a\u00105\u001a\b\u0012\u0004\u0012\u00020\f048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u001a\u00107\u001a\b\u0012\u0004\u0012\u00020\u000e048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00106R\u001a\u00108\u001a\b\u0012\u0004\u0012\u00020\f048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00106R\u001a\u00109\u001a\b\u0012\u0004\u0012\u00020\u0011048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00106R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u00020\u0013048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00106R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020\f048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u00106R\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00020\f048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u00106R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020\f048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u00106R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020\u0018048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u00106R\u001a\u0010?\u001a\b\u0012\u0004\u0012\u00020\u0013048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u00106R\u001a\u0010@\u001a\b\u0012\u0004\u0012\u00020\u0013048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u00106R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00020\u001c048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u00106R\u001a\u0010B\u001a\b\u0012\u0004\u0012\u00020\u0013048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u00106R\u001a\u0010C\u001a\b\u0012\u0004\u0012\u00020\f048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u00106R\u001a\u0010D\u001a\b\u0012\u0004\u0012\u00020 048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u00106R$\u0010J\u001a\u00020\n2\u0006\u0010E\u001a\u00020\n8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR+\u0010\r\u001a\u00020\f2\u0006\u0010K\u001a\u00020\f8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bL\u0010M\"\u0004\bN\u0010O*\u0004\bP\u0010QR+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010K\u001a\u00020\u000e8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bR\u0010S\"\u0004\bT\u0010U*\u0004\bV\u0010QR+\u0010\u0010\u001a\u00020\f2\u0006\u0010K\u001a\u00020\f8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bW\u0010M\"\u0004\bX\u0010O*\u0004\bY\u0010QR+\u0010\u0012\u001a\u00020\u00112\u0006\u0010K\u001a\u00020\u00118F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]*\u0004\b^\u0010QR+\u0010\u0014\u001a\u00020\u00132\u0006\u0010K\u001a\u00020\u00138F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\b_\u0010`\"\u0004\ba\u0010b*\u0004\bc\u0010QR+\u0010\u0015\u001a\u00020\f2\u0006\u0010K\u001a\u00020\f8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bd\u0010M\"\u0004\be\u0010O*\u0004\bf\u0010QR+\u0010\u0016\u001a\u00020\f2\u0006\u0010K\u001a\u00020\f8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bg\u0010M\"\u0004\bh\u0010O*\u0004\bi\u0010QR+\u0010\u0017\u001a\u00020\f2\u0006\u0010K\u001a\u00020\f8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bj\u0010M\"\u0004\bk\u0010O*\u0004\bl\u0010QR+\u0010\u0019\u001a\u00020\u00182\u0006\u0010K\u001a\u00020\u00188F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bm\u0010n\"\u0004\bo\u0010p*\u0004\bq\u0010QR+\u0010\u001a\u001a\u00020\u00132\u0006\u0010K\u001a\u00020\u00138F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\br\u0010`\"\u0004\bs\u0010b*\u0004\bt\u0010QR+\u0010\u001b\u001a\u00020\u00132\u0006\u0010K\u001a\u00020\u00138F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bu\u0010`\"\u0004\bv\u0010b*\u0004\bw\u0010QR+\u0010\u001d\u001a\u00020\u001c2\u0006\u0010K\u001a\u00020\u001c8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bx\u0010y\"\u0004\bz\u0010{*\u0004\b|\u0010QR3\u0010\u001e\u001a\u00020\u00132\u0006\u0010K\u001a\u00020\u00138F@FX\u0087\u008e\u0002¢\u0006\u001a\u0012\u0005\b\u007f\u0010\u0080\u0001\u001a\u0004\b}\u0010`\"\u0004\b~\u0010b*\u0005\b\u0081\u0001\u0010QR.\u0010\u001f\u001a\u00020\f2\u0006\u0010K\u001a\u00020\f8F@FX\u0086\u008e\u0002¢\u0006\u0015\u001a\u0005\b\u0082\u0001\u0010M\"\u0005\b\u0083\u0001\u0010O*\u0005\b\u0084\u0001\u0010QR0\u0010!\u001a\u00020 2\u0006\u0010K\u001a\u00020 8F@FX\u0086\u008e\u0002¢\u0006\u0017\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001\"\u0006\b\u0087\u0001\u0010\u0088\u0001*\u0005\b\u0089\u0001\u0010Q¨\u0006\u008b\u0001"}, d2 = {"Lcom/mapbox/maps/extension/compose/style/sources/generated/GeoJsonSourceState;", "Lcom/mapbox/maps/extension/compose/style/sources/SourceState;", "", "sourceId", "sourceType", "", "Lo13/p;", "", "Lcom/mapbox/bindgen/Value;", "initialProperties", "Lcom/mapbox/maps/extension/compose/style/sources/GeoJSONData;", "initialData", "Lcom/mapbox/maps/extension/compose/style/LongValue;", "maxZoom", "Lcom/mapbox/maps/extension/compose/style/StringValue;", "attribution", "buffer", "Lcom/mapbox/maps/extension/compose/style/DoubleValue;", "tolerance", "Lcom/mapbox/maps/extension/compose/style/BooleanValue;", "cluster", "clusterRadius", "clusterMaxZoom", "clusterMinPoints", "Lcom/mapbox/maps/extension/compose/style/sources/ClusterProperties;", "clusterProperties", "lineMetrics", "generateId", "Lcom/mapbox/maps/extension/compose/style/sources/PromoteIdValue;", "promoteId", "autoMaxZoom", "prefetchZoomDelta", "Lcom/mapbox/maps/extension/compose/style/sources/TileCacheBudget;", "tileCacheBudget", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/mapbox/maps/extension/compose/style/sources/GeoJSONData;Lcom/mapbox/maps/extension/compose/style/LongValue;Lcom/mapbox/maps/extension/compose/style/StringValue;Lcom/mapbox/maps/extension/compose/style/LongValue;Lcom/mapbox/maps/extension/compose/style/DoubleValue;Lcom/mapbox/maps/extension/compose/style/BooleanValue;Lcom/mapbox/maps/extension/compose/style/LongValue;Lcom/mapbox/maps/extension/compose/style/LongValue;Lcom/mapbox/maps/extension/compose/style/LongValue;Lcom/mapbox/maps/extension/compose/style/sources/ClusterProperties;Lcom/mapbox/maps/extension/compose/style/BooleanValue;Lcom/mapbox/maps/extension/compose/style/BooleanValue;Lcom/mapbox/maps/extension/compose/style/sources/PromoteIdValue;Lcom/mapbox/maps/extension/compose/style/BooleanValue;Lcom/mapbox/maps/extension/compose/style/LongValue;Lcom/mapbox/maps/extension/compose/style/sources/TileCacheBudget;)V", "(Ljava/lang/String;)V", "", "UpdateProperties$extension_compose_release", "(Lp3/m;I)V", "UpdateProperties", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "getProperties", "()Ljava/util/Map;", "Lp3/p1;", "maxZoomState", "Lp3/p1;", "attributionState", "bufferState", "toleranceState", "clusterState", "clusterRadiusState", "clusterMaxZoomState", "clusterMinPointsState", "clusterPropertiesState", "lineMetricsState", "generateIdState", "promoteIdState", "autoMaxZoomState", "prefetchZoomDeltaState", "tileCacheBudgetState", "value", "getData", "()Lcom/mapbox/maps/extension/compose/style/sources/GeoJSONData;", "setData", "(Lcom/mapbox/maps/extension/compose/style/sources/GeoJSONData;)V", "data", "<set-?>", "getMaxZoom", "()Lcom/mapbox/maps/extension/compose/style/LongValue;", "setMaxZoom", "(Lcom/mapbox/maps/extension/compose/style/LongValue;)V", "getMaxZoom$delegate", "(Lcom/mapbox/maps/extension/compose/style/sources/generated/GeoJsonSourceState;)Ljava/lang/Object;", "getAttribution", "()Lcom/mapbox/maps/extension/compose/style/StringValue;", "setAttribution", "(Lcom/mapbox/maps/extension/compose/style/StringValue;)V", "getAttribution$delegate", "getBuffer", "setBuffer", "getBuffer$delegate", "getTolerance", "()Lcom/mapbox/maps/extension/compose/style/DoubleValue;", "setTolerance", "(Lcom/mapbox/maps/extension/compose/style/DoubleValue;)V", "getTolerance$delegate", "getCluster", "()Lcom/mapbox/maps/extension/compose/style/BooleanValue;", "setCluster", "(Lcom/mapbox/maps/extension/compose/style/BooleanValue;)V", "getCluster$delegate", "getClusterRadius", "setClusterRadius", "getClusterRadius$delegate", "getClusterMaxZoom", "setClusterMaxZoom", "getClusterMaxZoom$delegate", "getClusterMinPoints", "setClusterMinPoints", "getClusterMinPoints$delegate", "getClusterProperties", "()Lcom/mapbox/maps/extension/compose/style/sources/ClusterProperties;", "setClusterProperties", "(Lcom/mapbox/maps/extension/compose/style/sources/ClusterProperties;)V", "getClusterProperties$delegate", "getLineMetrics", "setLineMetrics", "getLineMetrics$delegate", "getGenerateId", "setGenerateId", "getGenerateId$delegate", "getPromoteId", "()Lcom/mapbox/maps/extension/compose/style/sources/PromoteIdValue;", "setPromoteId", "(Lcom/mapbox/maps/extension/compose/style/sources/PromoteIdValue;)V", "getPromoteId$delegate", "getAutoMaxZoom", "setAutoMaxZoom", "getAutoMaxZoom$annotations", "()V", "getAutoMaxZoom$delegate", "getPrefetchZoomDelta", "setPrefetchZoomDelta", "getPrefetchZoomDelta$delegate", "getTileCacheBudget", "()Lcom/mapbox/maps/extension/compose/style/sources/TileCacheBudget;", "setTileCacheBudget", "(Lcom/mapbox/maps/extension/compose/style/sources/TileCacheBudget;)V", "getTileCacheBudget$delegate", "Companion", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class GeoJsonSourceState extends SourceState {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final k<GeoJsonSourceState, SourceState.Holder> Saver;
    private final p1<StringValue> attributionState;
    private final p1<BooleanValue> autoMaxZoomState;
    private final p1<LongValue> bufferState;
    private final p1<LongValue> clusterMaxZoomState;
    private final p1<LongValue> clusterMinPointsState;
    private final p1<ClusterProperties> clusterPropertiesState;
    private final p1<LongValue> clusterRadiusState;
    private final p1<BooleanValue> clusterState;
    private final p1<BooleanValue> generateIdState;
    private final p1<BooleanValue> lineMetricsState;
    private final p1<LongValue> maxZoomState;
    private final p1<LongValue> prefetchZoomDeltaState;
    private final p1<PromoteIdValue> promoteIdState;
    private final p1<TileCacheBudget> tileCacheBudgetState;
    private final p1<DoubleValue> toleranceState;

    static {
        GeoJsonSourceState$Companion$Saver$1 geoJsonSourceState$Companion$Saver$1 = GeoJsonSourceState$Companion$Saver$1.INSTANCE;
        GeoJsonSourceState$Companion$Saver$2 geoJsonSourceState$Companion$Saver$2 = GeoJsonSourceState$Companion$Saver$2.INSTANCE;
        l lVar = m.f57455a;
        Saver = new l(geoJsonSourceState$Companion$Saver$1, geoJsonSourceState$Companion$Saver$2);
    }

    private GeoJsonSourceState(String str, String str2, Map<String, ? extends p<Boolean, ? extends Value>> map, GeoJSONData geoJSONData, LongValue longValue, StringValue stringValue, LongValue longValue2, DoubleValue doubleValue, BooleanValue booleanValue, LongValue longValue3, LongValue longValue4, LongValue longValue5, ClusterProperties clusterProperties, BooleanValue booleanValue2, BooleanValue booleanValue3, PromoteIdValue promoteIdValue, BooleanValue booleanValue4, LongValue longValue6, TileCacheBudget tileCacheBudget) {
        super(str, str2, map, geoJSONData);
        this.maxZoomState = p0.n(longValue);
        this.attributionState = p0.n(stringValue);
        this.bufferState = p0.n(longValue2);
        this.toleranceState = p0.n(doubleValue);
        this.clusterState = p0.n(booleanValue);
        this.clusterRadiusState = p0.n(longValue3);
        this.clusterMaxZoomState = p0.n(longValue4);
        this.clusterMinPointsState = p0.n(longValue5);
        this.clusterPropertiesState = p0.n(clusterProperties);
        this.lineMetricsState = p0.n(booleanValue2);
        this.generateIdState = p0.n(booleanValue3);
        this.promoteIdState = p0.n(promoteIdValue);
        this.autoMaxZoomState = p0.n(booleanValue4);
        this.prefetchZoomDeltaState = p0.n(longValue6);
        this.tileCacheBudgetState = p0.n(tileCacheBudget);
    }

    @MapboxExperimental
    public static /* synthetic */ void getAutoMaxZoom$annotations() {
    }

    private final Map<String, Value> getProperties() {
        p pVar = getMaxZoom().isNotInitial() ? new p("maxzoom", getMaxZoom().getValue()) : null;
        p pVar2 = getAttribution().isNotInitial() ? new p("attribution", getAttribution().getValue()) : null;
        p pVar3 = getBuffer().isNotInitial() ? new p("buffer", getBuffer().getValue()) : null;
        p pVar4 = getTolerance().isNotInitial() ? new p("tolerance", getTolerance().getValue()) : null;
        p pVar5 = getCluster().isNotInitial() ? new p("cluster", getCluster().getValue()) : null;
        p pVar6 = getClusterRadius().isNotInitial() ? new p("clusterRadius", getClusterRadius().getValue()) : null;
        p pVar7 = getClusterMaxZoom().isNotInitial() ? new p("clusterMaxZoom", getClusterMaxZoom().getValue()) : null;
        p pVar8 = getClusterMinPoints().isNotInitial() ? new p("clusterMinPoints", getClusterMinPoints().getValue()) : null;
        p pVar9 = getClusterProperties().isNotInitial() ? new p("clusterProperties", getClusterProperties().getValue()) : null;
        p pVar10 = getLineMetrics().isNotInitial() ? new p("lineMetrics", getLineMetrics().getValue()) : null;
        p pVar11 = getGenerateId().isNotInitial() ? new p("generateId", getGenerateId().getValue()) : null;
        p pVar12 = getPromoteId().isNotInitial() ? new p("promoteId", getPromoteId().getValue()) : null;
        p pVar13 = getAutoMaxZoom().isNotInitial() ? new p("autoMaxZoom", getAutoMaxZoom().getValue()) : null;
        p pVar14 = new p("prefetch-zoom-delta", getPrefetchZoomDelta().getValue());
        if (!getPrefetchZoomDelta().isNotInitial()) {
            pVar14 = null;
        }
        return u0.l(u.C(new p[]{pVar, pVar2, pVar3, pVar4, pVar5, pVar6, pVar7, pVar8, pVar9, pVar10, pVar11, pVar12, pVar13, pVar14, getTileCacheBudget().isNotInitial() ? new p("tile-cache-budget", getTileCacheBudget().getValue()) : null}));
    }

    @Override // com.mapbox.maps.extension.compose.style.sources.SourceState
    public void UpdateProperties$extension_compose_release(p3.m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(-1387984662);
        if ((i14 & 14) == 0) {
            i15 = (o0VarE.B(this) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i15 & 11) == 2 && o0VarE.b()) {
            o0VarE.e();
        } else {
            x1 x1Var = n.f135158a;
            PropertyTypesKt.ActionWhenNotInitial((e23.p) getSetBuilderPropertyAction(), this.maxZoomState, "maxzoom", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((e23.p) getSetBuilderPropertyAction(), this.attributionState, "attribution", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((e23.p) getSetBuilderPropertyAction(), this.bufferState, "buffer", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((e23.p) getSetBuilderPropertyAction(), this.toleranceState, "tolerance", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((e23.p) getSetBuilderPropertyAction(), this.clusterState, "cluster", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((e23.p) getSetBuilderPropertyAction(), this.clusterRadiusState, "clusterRadius", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((e23.p) getSetBuilderPropertyAction(), this.clusterMaxZoomState, "clusterMaxZoom", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((e23.p) getSetBuilderPropertyAction(), this.clusterMinPointsState, "clusterMinPoints", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((e23.p) getSetBuilderPropertyAction(), this.clusterPropertiesState, "clusterProperties", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((e23.p) getSetBuilderPropertyAction(), this.lineMetricsState, "lineMetrics", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((e23.p) getSetBuilderPropertyAction(), this.generateIdState, "generateId", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((e23.p) getSetBuilderPropertyAction(), this.promoteIdState, "promoteId", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((e23.p) getSetBuilderPropertyAction(), this.autoMaxZoomState, "autoMaxZoom", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((e23.p) getSetPropertyAction(), this.prefetchZoomDeltaState, "prefetch-zoom-delta", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((e23.p) getSetPropertyAction(), this.tileCacheBudgetState, "tile-cache-budget", o0VarE, 384);
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new GeoJsonSourceState$UpdateProperties$1(this, i14);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!GeoJsonSourceState.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        other.getClass();
        GeoJsonSourceState geoJsonSourceState = (GeoJsonSourceState) other;
        return s.g(getSourceId(), geoJsonSourceState.getSourceId()) && s.g(getData(), geoJsonSourceState.getData()) && s.g(getMaxZoom(), geoJsonSourceState.getMaxZoom()) && s.g(getAttribution(), geoJsonSourceState.getAttribution()) && s.g(getBuffer(), geoJsonSourceState.getBuffer()) && s.g(getTolerance(), geoJsonSourceState.getTolerance()) && s.g(getCluster(), geoJsonSourceState.getCluster()) && s.g(getClusterRadius(), geoJsonSourceState.getClusterRadius()) && s.g(getClusterMaxZoom(), geoJsonSourceState.getClusterMaxZoom()) && s.g(getClusterMinPoints(), geoJsonSourceState.getClusterMinPoints()) && s.g(getClusterProperties(), geoJsonSourceState.getClusterProperties()) && s.g(getLineMetrics(), geoJsonSourceState.getLineMetrics()) && s.g(getGenerateId(), geoJsonSourceState.getGenerateId()) && s.g(getPromoteId(), geoJsonSourceState.getPromoteId()) && s.g(getAutoMaxZoom(), geoJsonSourceState.getAutoMaxZoom()) && s.g(getPrefetchZoomDelta(), geoJsonSourceState.getPrefetchZoomDelta()) && s.g(getTileCacheBudget(), geoJsonSourceState.getTileCacheBudget());
    }

    public final StringValue getAttribution() {
        return this.attributionState.getF182175a();
    }

    public final BooleanValue getAutoMaxZoom() {
        return this.autoMaxZoomState.getF182175a();
    }

    public final LongValue getBuffer() {
        return this.bufferState.getF182175a();
    }

    public final BooleanValue getCluster() {
        return this.clusterState.getF182175a();
    }

    public final LongValue getClusterMaxZoom() {
        return this.clusterMaxZoomState.getF182175a();
    }

    public final LongValue getClusterMinPoints() {
        return this.clusterMinPointsState.getF182175a();
    }

    public final ClusterProperties getClusterProperties() {
        return this.clusterPropertiesState.getF182175a();
    }

    public final LongValue getClusterRadius() {
        return this.clusterRadiusState.getF182175a();
    }

    public final GeoJSONData getData() {
        return getGeoJSONData();
    }

    public final BooleanValue getGenerateId() {
        return this.generateIdState.getF182175a();
    }

    public final BooleanValue getLineMetrics() {
        return this.lineMetricsState.getF182175a();
    }

    public final LongValue getMaxZoom() {
        return this.maxZoomState.getF182175a();
    }

    public final LongValue getPrefetchZoomDelta() {
        return this.prefetchZoomDeltaState.getF182175a();
    }

    public final PromoteIdValue getPromoteId() {
        return this.promoteIdState.getF182175a();
    }

    public final TileCacheBudget getTileCacheBudget() {
        return this.tileCacheBudgetState.getF182175a();
    }

    public final DoubleValue getTolerance() {
        return this.toleranceState.getF182175a();
    }

    public int hashCode() {
        return Objects.hash(getSourceId(), getData(), getMaxZoom(), getAttribution(), getBuffer(), getTolerance(), getCluster(), getClusterRadius(), getClusterMaxZoom(), getClusterMinPoints(), getClusterProperties(), getLineMetrics(), getGenerateId(), getPromoteId(), getAutoMaxZoom(), getPrefetchZoomDelta(), getTileCacheBudget());
    }

    public final void setAttribution(StringValue stringValue) {
        stringValue.getClass();
        this.attributionState.setValue(stringValue);
    }

    public final void setAutoMaxZoom(BooleanValue booleanValue) {
        booleanValue.getClass();
        this.autoMaxZoomState.setValue(booleanValue);
    }

    public final void setBuffer(LongValue longValue) {
        longValue.getClass();
        this.bufferState.setValue(longValue);
    }

    public final void setCluster(BooleanValue booleanValue) {
        booleanValue.getClass();
        this.clusterState.setValue(booleanValue);
    }

    public final void setClusterMaxZoom(LongValue longValue) {
        longValue.getClass();
        this.clusterMaxZoomState.setValue(longValue);
    }

    public final void setClusterMinPoints(LongValue longValue) {
        longValue.getClass();
        this.clusterMinPointsState.setValue(longValue);
    }

    public final void setClusterProperties(ClusterProperties clusterProperties) {
        clusterProperties.getClass();
        this.clusterPropertiesState.setValue(clusterProperties);
    }

    public final void setClusterRadius(LongValue longValue) {
        longValue.getClass();
        this.clusterRadiusState.setValue(longValue);
    }

    public final void setData(GeoJSONData geoJSONData) {
        geoJSONData.getClass();
        setGeoJSONData(geoJSONData);
    }

    public final void setGenerateId(BooleanValue booleanValue) {
        booleanValue.getClass();
        this.generateIdState.setValue(booleanValue);
    }

    public final void setLineMetrics(BooleanValue booleanValue) {
        booleanValue.getClass();
        this.lineMetricsState.setValue(booleanValue);
    }

    public final void setMaxZoom(LongValue longValue) {
        longValue.getClass();
        this.maxZoomState.setValue(longValue);
    }

    public final void setPrefetchZoomDelta(LongValue longValue) {
        longValue.getClass();
        this.prefetchZoomDeltaState.setValue(longValue);
    }

    public final void setPromoteId(PromoteIdValue promoteIdValue) {
        promoteIdValue.getClass();
        this.promoteIdState.setValue(promoteIdValue);
    }

    public final void setTileCacheBudget(TileCacheBudget tileCacheBudget) {
        tileCacheBudget.getClass();
        this.tileCacheBudgetState.setValue(tileCacheBudget);
    }

    public final void setTolerance(DoubleValue doubleValue) {
        doubleValue.getClass();
        this.toleranceState.setValue(doubleValue);
    }

    @Override // com.mapbox.maps.extension.compose.style.sources.SourceState
    public String toString() {
        return "GeoJsonSourceState(sourceId=" + getSourceId() + ", maxZoom=" + getMaxZoom() + ", attribution=" + getAttribution() + ", buffer=" + getBuffer() + ", tolerance=" + getTolerance() + ", cluster=" + getCluster() + ", clusterRadius=" + getClusterRadius() + ", clusterMaxZoom=" + getClusterMaxZoom() + ", clusterMinPoints=" + getClusterMinPoints() + ", clusterProperties=" + getClusterProperties() + ", lineMetrics=" + getLineMetrics() + ", generateId=" + getGenerateId() + ", promoteId=" + getPromoteId() + ", autoMaxZoom=" + getAutoMaxZoom() + ", prefetchZoomDelta=" + getPrefetchZoomDelta() + ", tileCacheBudget=" + getTileCacheBudget() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/mapbox/maps/extension/compose/style/sources/generated/GeoJsonSourceState$Companion;", "", "<init>", "()V", "Ld4/k;", "Lcom/mapbox/maps/extension/compose/style/sources/generated/GeoJsonSourceState;", "Lcom/mapbox/maps/extension/compose/style/sources/SourceState$Holder;", "Saver", "Ld4/k;", "getSaver", "()Ld4/k;", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final k<GeoJsonSourceState, SourceState.Holder> getSaver() {
            return GeoJsonSourceState.Saver;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public GeoJsonSourceState(String str) {
        str.getClass();
        k0 k0Var = k0.f134949a;
        k0Var.getClass();
        LongValue longValue = LongValue.INITIAL;
        StringValue stringValue = StringValue.INITIAL;
        DoubleValue doubleValue = DoubleValue.INITIAL;
        BooleanValue booleanValue = BooleanValue.INITIAL;
        this(str, "geojson", k0Var, null, longValue, stringValue, longValue, doubleValue, booleanValue, longValue, longValue, longValue, ClusterProperties.INITIAL, booleanValue, booleanValue, PromoteIdValue.INITIAL, booleanValue, longValue, TileCacheBudget.INITIAL, 8, null);
    }

    public /* synthetic */ GeoJsonSourceState(String str, String str2, Map map, GeoJSONData geoJSONData, LongValue longValue, StringValue stringValue, LongValue longValue2, DoubleValue doubleValue, BooleanValue booleanValue, LongValue longValue3, LongValue longValue4, LongValue longValue5, ClusterProperties clusterProperties, BooleanValue booleanValue2, BooleanValue booleanValue3, PromoteIdValue promoteIdValue, BooleanValue booleanValue4, LongValue longValue6, TileCacheBudget tileCacheBudget, int i14, j jVar) {
        this(str, str2, map, (i14 & 8) != 0 ? GeoJSONData.DEFAULT : geoJSONData, longValue, stringValue, longValue2, doubleValue, booleanValue, longValue3, longValue4, longValue5, clusterProperties, booleanValue2, booleanValue3, promoteIdValue, booleanValue4, longValue6, tileCacheBudget);
    }

    public /* synthetic */ GeoJsonSourceState(String str, String str2, Map map, GeoJSONData geoJSONData, LongValue longValue, StringValue stringValue, LongValue longValue2, DoubleValue doubleValue, BooleanValue booleanValue, LongValue longValue3, LongValue longValue4, LongValue longValue5, ClusterProperties clusterProperties, BooleanValue booleanValue2, BooleanValue booleanValue3, PromoteIdValue promoteIdValue, BooleanValue booleanValue4, LongValue longValue6, TileCacheBudget tileCacheBudget, j jVar) {
        this(str, str2, map, geoJSONData, longValue, stringValue, longValue2, doubleValue, booleanValue, longValue3, longValue4, longValue5, clusterProperties, booleanValue2, booleanValue3, promoteIdValue, booleanValue4, longValue6, tileCacheBudget);
    }

    public /* synthetic */ GeoJsonSourceState(String str, int i14, j jVar) {
        this((i14 & 1) != 0 ? IdGenerator.INSTANCE.generateRandomSourceId("geojson") : str);
    }
}
