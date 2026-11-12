package com.mapbox.maps.extension.compose.style.sources.generated;

import ch.qos.logback.core.CoreConstants;
import com.mapbox.bindgen.Value;
import com.mapbox.maps.extension.compose.style.BooleanValue;
import com.mapbox.maps.extension.compose.style.DoubleListValue;
import com.mapbox.maps.extension.compose.style.DoubleValue;
import com.mapbox.maps.extension.compose.style.IdGenerator;
import com.mapbox.maps.extension.compose.style.LongValue;
import com.mapbox.maps.extension.compose.style.PropertyTypesKt;
import com.mapbox.maps.extension.compose.style.StringListValue;
import com.mapbox.maps.extension.compose.style.StringValue;
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
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\bQ\b\u0007\u0018\u0000 \u0083\u00012\u00020\u0001:\u0002\u0083\u0001B±\u0001\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u001e\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00060\u0005\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0014\u001a\u00020\n\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u0010\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001e\u001a\u00020\u0010\u0012\u0006\u0010\u001f\u001a\u00020\u001c\u0012\u0006\u0010 \u001a\u00020\u001c¢\u0006\u0004\b!\u0010\"B\u0013\b\u0016\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b!\u0010#J\u000f\u0010'\u001a\u00020$H\u0011¢\u0006\u0004\b%\u0010&J\u001a\u0010*\u001a\u00020\u00072\b\u0010)\u001a\u0004\u0018\u00010(H\u0096\u0002¢\u0006\u0004\b*\u0010+J\u000f\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0002H\u0016¢\u0006\u0004\b/\u00100J\u001b\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0005H\u0002¢\u0006\u0004\b1\u00102R\u001a\u00104\u001a\b\u0012\u0004\u0012\u00020\n038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u001a\u00106\u001a\b\u0012\u0004\u0012\u00020\f038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00105R\u001a\u00107\u001a\b\u0012\u0004\u0012\u00020\u000e038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00105R\u001a\u00108\u001a\b\u0012\u0004\u0012\u00020\u0010038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00105R\u001a\u00109\u001a\b\u0012\u0004\u0012\u00020\u0010038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00105R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u00020\u0010038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00105R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020\n038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u00105R\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00020\u0015038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u00105R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020\u0017038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u00105R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020\u0010038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u00105R\u001a\u0010?\u001a\b\u0012\u0004\u0012\u00020\u001a038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u00105R\u001a\u0010@\u001a\b\u0012\u0004\u0012\u00020\u001c038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u00105R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00020\u0010038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u00105R\u001a\u0010B\u001a\b\u0012\u0004\u0012\u00020\u001c038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u00105R\u001a\u0010C\u001a\b\u0012\u0004\u0012\u00020\u001c038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u00105R+\u0010\u000b\u001a\u00020\n2\u0006\u0010D\u001a\u00020\n8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bE\u0010F\"\u0004\bG\u0010H*\u0004\bI\u0010JR+\u0010\r\u001a\u00020\f2\u0006\u0010D\u001a\u00020\f8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bK\u0010L\"\u0004\bM\u0010N*\u0004\bO\u0010JR+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010D\u001a\u00020\u000e8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010S*\u0004\bT\u0010JR+\u0010\u0011\u001a\u00020\u00102\u0006\u0010D\u001a\u00020\u00108F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bU\u0010V\"\u0004\bW\u0010X*\u0004\bY\u0010JR+\u0010\u0012\u001a\u00020\u00102\u0006\u0010D\u001a\u00020\u00108F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bZ\u0010V\"\u0004\b[\u0010X*\u0004\b\\\u0010JR+\u0010\u0013\u001a\u00020\u00102\u0006\u0010D\u001a\u00020\u00108F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\b]\u0010V\"\u0004\b^\u0010X*\u0004\b_\u0010JR+\u0010\u0014\u001a\u00020\n2\u0006\u0010D\u001a\u00020\n8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\b`\u0010F\"\u0004\ba\u0010H*\u0004\bb\u0010JR+\u0010\u0016\u001a\u00020\u00152\u0006\u0010D\u001a\u00020\u00158F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bc\u0010d\"\u0004\be\u0010f*\u0004\bg\u0010JR+\u0010\u0018\u001a\u00020\u00172\u0006\u0010D\u001a\u00020\u00178F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bh\u0010i\"\u0004\bj\u0010k*\u0004\bl\u0010JR+\u0010\u0019\u001a\u00020\u00102\u0006\u0010D\u001a\u00020\u00108F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bm\u0010V\"\u0004\bn\u0010X*\u0004\bo\u0010JR+\u0010\u001b\u001a\u00020\u001a2\u0006\u0010D\u001a\u00020\u001a8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bp\u0010q\"\u0004\br\u0010s*\u0004\bt\u0010JR+\u0010\u001d\u001a\u00020\u001c2\u0006\u0010D\u001a\u00020\u001c8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bu\u0010v\"\u0004\bw\u0010x*\u0004\by\u0010JR+\u0010\u001e\u001a\u00020\u00102\u0006\u0010D\u001a\u00020\u00108F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bz\u0010V\"\u0004\b{\u0010X*\u0004\b|\u0010JR+\u0010\u001f\u001a\u00020\u001c2\u0006\u0010D\u001a\u00020\u001c8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\b}\u0010v\"\u0004\b~\u0010x*\u0004\b\u007f\u0010JR.\u0010 \u001a\u00020\u001c2\u0006\u0010D\u001a\u00020\u001c8F@FX\u0086\u008e\u0002¢\u0006\u0015\u001a\u0005\b\u0080\u0001\u0010v\"\u0005\b\u0081\u0001\u0010x*\u0005\b\u0082\u0001\u0010J¨\u0006\u0084\u0001"}, d2 = {"Lcom/mapbox/maps/extension/compose/style/sources/generated/RasterDemSourceState;", "Lcom/mapbox/maps/extension/compose/style/sources/SourceState;", "", "sourceId", "sourceType", "", "Lo13/p;", "", "Lcom/mapbox/bindgen/Value;", "initialProperties", "Lcom/mapbox/maps/extension/compose/style/StringValue;", "url", "Lcom/mapbox/maps/extension/compose/style/StringListValue;", "tiles", "Lcom/mapbox/maps/extension/compose/style/DoubleListValue;", "bounds", "Lcom/mapbox/maps/extension/compose/style/LongValue;", "minZoom", "maxZoom", "tileSize", "attribution", "Lcom/mapbox/maps/extension/compose/style/sources/generated/EncodingValue;", "encoding", "Lcom/mapbox/maps/extension/compose/style/BooleanValue;", "volatile", "prefetchZoomDelta", "Lcom/mapbox/maps/extension/compose/style/sources/TileCacheBudget;", "tileCacheBudget", "Lcom/mapbox/maps/extension/compose/style/DoubleValue;", "minimumTileUpdateInterval", "maxOverscaleFactorForParentTiles", "tileRequestsDelay", "tileNetworkRequestsDelay", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/mapbox/maps/extension/compose/style/StringValue;Lcom/mapbox/maps/extension/compose/style/StringListValue;Lcom/mapbox/maps/extension/compose/style/DoubleListValue;Lcom/mapbox/maps/extension/compose/style/LongValue;Lcom/mapbox/maps/extension/compose/style/LongValue;Lcom/mapbox/maps/extension/compose/style/LongValue;Lcom/mapbox/maps/extension/compose/style/StringValue;Lcom/mapbox/maps/extension/compose/style/sources/generated/EncodingValue;Lcom/mapbox/maps/extension/compose/style/BooleanValue;Lcom/mapbox/maps/extension/compose/style/LongValue;Lcom/mapbox/maps/extension/compose/style/sources/TileCacheBudget;Lcom/mapbox/maps/extension/compose/style/DoubleValue;Lcom/mapbox/maps/extension/compose/style/LongValue;Lcom/mapbox/maps/extension/compose/style/DoubleValue;Lcom/mapbox/maps/extension/compose/style/DoubleValue;)V", "(Ljava/lang/String;)V", "", "UpdateProperties$extension_compose_release", "(Lp3/m;I)V", "UpdateProperties", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "getProperties", "()Ljava/util/Map;", "Lp3/p1;", "urlState", "Lp3/p1;", "tilesState", "boundsState", "minZoomState", "maxZoomState", "tileSizeState", "attributionState", "encodingState", "volatileState", "prefetchZoomDeltaState", "tileCacheBudgetState", "minimumTileUpdateIntervalState", "maxOverscaleFactorForParentTilesState", "tileRequestsDelayState", "tileNetworkRequestsDelayState", "<set-?>", "getUrl", "()Lcom/mapbox/maps/extension/compose/style/StringValue;", "setUrl", "(Lcom/mapbox/maps/extension/compose/style/StringValue;)V", "getUrl$delegate", "(Lcom/mapbox/maps/extension/compose/style/sources/generated/RasterDemSourceState;)Ljava/lang/Object;", "getTiles", "()Lcom/mapbox/maps/extension/compose/style/StringListValue;", "setTiles", "(Lcom/mapbox/maps/extension/compose/style/StringListValue;)V", "getTiles$delegate", "getBounds", "()Lcom/mapbox/maps/extension/compose/style/DoubleListValue;", "setBounds", "(Lcom/mapbox/maps/extension/compose/style/DoubleListValue;)V", "getBounds$delegate", "getMinZoom", "()Lcom/mapbox/maps/extension/compose/style/LongValue;", "setMinZoom", "(Lcom/mapbox/maps/extension/compose/style/LongValue;)V", "getMinZoom$delegate", "getMaxZoom", "setMaxZoom", "getMaxZoom$delegate", "getTileSize", "setTileSize", "getTileSize$delegate", "getAttribution", "setAttribution", "getAttribution$delegate", "getEncoding", "()Lcom/mapbox/maps/extension/compose/style/sources/generated/EncodingValue;", "setEncoding", "(Lcom/mapbox/maps/extension/compose/style/sources/generated/EncodingValue;)V", "getEncoding$delegate", "getVolatile", "()Lcom/mapbox/maps/extension/compose/style/BooleanValue;", "setVolatile", "(Lcom/mapbox/maps/extension/compose/style/BooleanValue;)V", "getVolatile$delegate", "getPrefetchZoomDelta", "setPrefetchZoomDelta", "getPrefetchZoomDelta$delegate", "getTileCacheBudget", "()Lcom/mapbox/maps/extension/compose/style/sources/TileCacheBudget;", "setTileCacheBudget", "(Lcom/mapbox/maps/extension/compose/style/sources/TileCacheBudget;)V", "getTileCacheBudget$delegate", "getMinimumTileUpdateInterval", "()Lcom/mapbox/maps/extension/compose/style/DoubleValue;", "setMinimumTileUpdateInterval", "(Lcom/mapbox/maps/extension/compose/style/DoubleValue;)V", "getMinimumTileUpdateInterval$delegate", "getMaxOverscaleFactorForParentTiles", "setMaxOverscaleFactorForParentTiles", "getMaxOverscaleFactorForParentTiles$delegate", "getTileRequestsDelay", "setTileRequestsDelay", "getTileRequestsDelay$delegate", "getTileNetworkRequestsDelay", "setTileNetworkRequestsDelay", "getTileNetworkRequestsDelay$delegate", "Companion", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class RasterDemSourceState extends SourceState {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final k<RasterDemSourceState, SourceState.Holder> Saver;
    private final p1<StringValue> attributionState;
    private final p1<DoubleListValue> boundsState;
    private final p1<EncodingValue> encodingState;
    private final p1<LongValue> maxOverscaleFactorForParentTilesState;
    private final p1<LongValue> maxZoomState;
    private final p1<LongValue> minZoomState;
    private final p1<DoubleValue> minimumTileUpdateIntervalState;
    private final p1<LongValue> prefetchZoomDeltaState;
    private final p1<TileCacheBudget> tileCacheBudgetState;
    private final p1<DoubleValue> tileNetworkRequestsDelayState;
    private final p1<DoubleValue> tileRequestsDelayState;
    private final p1<LongValue> tileSizeState;
    private final p1<StringListValue> tilesState;
    private final p1<StringValue> urlState;
    private final p1<BooleanValue> volatileState;

    static {
        RasterDemSourceState$Companion$Saver$1 rasterDemSourceState$Companion$Saver$1 = RasterDemSourceState$Companion$Saver$1.INSTANCE;
        RasterDemSourceState$Companion$Saver$2 rasterDemSourceState$Companion$Saver$2 = RasterDemSourceState$Companion$Saver$2.INSTANCE;
        l lVar = m.f57455a;
        Saver = new l(rasterDemSourceState$Companion$Saver$1, rasterDemSourceState$Companion$Saver$2);
    }

    private RasterDemSourceState(String str, String str2, Map<String, ? extends p<Boolean, ? extends Value>> map, StringValue stringValue, StringListValue stringListValue, DoubleListValue doubleListValue, LongValue longValue, LongValue longValue2, LongValue longValue3, StringValue stringValue2, EncodingValue encodingValue, BooleanValue booleanValue, LongValue longValue4, TileCacheBudget tileCacheBudget, DoubleValue doubleValue, LongValue longValue5, DoubleValue doubleValue2, DoubleValue doubleValue3) {
        super(str, str2, map, null, 8, null);
        this.urlState = p0.n(stringValue);
        this.tilesState = p0.n(stringListValue);
        this.boundsState = p0.n(doubleListValue);
        this.minZoomState = p0.n(longValue);
        this.maxZoomState = p0.n(longValue2);
        this.tileSizeState = p0.n(longValue3);
        this.attributionState = p0.n(stringValue2);
        this.encodingState = p0.n(encodingValue);
        this.volatileState = p0.n(booleanValue);
        this.prefetchZoomDeltaState = p0.n(longValue4);
        this.tileCacheBudgetState = p0.n(tileCacheBudget);
        this.minimumTileUpdateIntervalState = p0.n(doubleValue);
        this.maxOverscaleFactorForParentTilesState = p0.n(longValue5);
        this.tileRequestsDelayState = p0.n(doubleValue2);
        this.tileNetworkRequestsDelayState = p0.n(doubleValue3);
    }

    private final Map<String, Value> getProperties() {
        p pVar = getUrl().isNotInitial() ? new p("url", getUrl().getValue()) : null;
        p pVar2 = getTiles().isNotInitial() ? new p("tiles", getTiles().getValue()) : null;
        p pVar3 = getBounds().isNotInitial() ? new p("bounds", getBounds().getValue()) : null;
        p pVar4 = getMinZoom().isNotInitial() ? new p("minzoom", getMinZoom().getValue()) : null;
        p pVar5 = getMaxZoom().isNotInitial() ? new p("maxzoom", getMaxZoom().getValue()) : null;
        p pVar6 = getTileSize().isNotInitial() ? new p("tileSize", getTileSize().getValue()) : null;
        p pVar7 = getAttribution().isNotInitial() ? new p("attribution", getAttribution().getValue()) : null;
        p pVar8 = getEncoding().isNotInitial() ? new p("encoding", getEncoding().getValue()) : null;
        p pVar9 = getVolatile().isNotInitial() ? new p("volatile", getVolatile().getValue()) : null;
        p pVar10 = getPrefetchZoomDelta().isNotInitial() ? new p("prefetch-zoom-delta", getPrefetchZoomDelta().getValue()) : null;
        p pVar11 = getTileCacheBudget().isNotInitial() ? new p("tile-cache-budget", getTileCacheBudget().getValue()) : null;
        p pVar12 = getMinimumTileUpdateInterval().isNotInitial() ? new p("minimum-tile-update-interval", getMinimumTileUpdateInterval().getValue()) : null;
        p pVar13 = getMaxOverscaleFactorForParentTiles().isNotInitial() ? new p("max-overscale-factor-for-parent-tiles", getMaxOverscaleFactorForParentTiles().getValue()) : null;
        p pVar14 = new p("tile-requests-delay", getTileRequestsDelay().getValue());
        if (!getTileRequestsDelay().isNotInitial()) {
            pVar14 = null;
        }
        return u0.l(u.C(new p[]{pVar, pVar2, pVar3, pVar4, pVar5, pVar6, pVar7, pVar8, pVar9, pVar10, pVar11, pVar12, pVar13, pVar14, getTileNetworkRequestsDelay().isNotInitial() ? new p("tile-network-requests-delay", getTileNetworkRequestsDelay().getValue()) : null}));
    }

    @Override // com.mapbox.maps.extension.compose.style.sources.SourceState
    public void UpdateProperties$extension_compose_release(p3.m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(353905174);
        if ((i14 & 14) == 0) {
            i15 = (o0VarE.B(this) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i15 & 11) == 2 && o0VarE.b()) {
            o0VarE.e();
        } else {
            x1 x1Var = n.f135158a;
            PropertyTypesKt.ActionWhenNotInitial((e23.p) getSetBuilderPropertyAction(), this.urlState, "url", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((e23.p) getSetBuilderPropertyAction(), this.tilesState, "tiles", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((e23.p) getSetBuilderPropertyAction(), this.boundsState, "bounds", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((e23.p) getSetBuilderPropertyAction(), this.minZoomState, "minzoom", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((e23.p) getSetBuilderPropertyAction(), this.maxZoomState, "maxzoom", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((e23.p) getSetBuilderPropertyAction(), this.tileSizeState, "tileSize", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((e23.p) getSetBuilderPropertyAction(), this.attributionState, "attribution", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((e23.p) getSetBuilderPropertyAction(), this.encodingState, "encoding", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((e23.p) getSetBuilderPropertyAction(), this.volatileState, "volatile", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((e23.p) getSetPropertyAction(), this.prefetchZoomDeltaState, "prefetch-zoom-delta", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((e23.p) getSetPropertyAction(), this.tileCacheBudgetState, "tile-cache-budget", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((e23.p) getSetPropertyAction(), this.minimumTileUpdateIntervalState, "minimum-tile-update-interval", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((e23.p) getSetPropertyAction(), this.maxOverscaleFactorForParentTilesState, "max-overscale-factor-for-parent-tiles", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((e23.p) getSetPropertyAction(), this.tileRequestsDelayState, "tile-requests-delay", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((e23.p) getSetPropertyAction(), this.tileNetworkRequestsDelayState, "tile-network-requests-delay", o0VarE, 384);
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new RasterDemSourceState$UpdateProperties$1(this, i14);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!RasterDemSourceState.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        other.getClass();
        RasterDemSourceState rasterDemSourceState = (RasterDemSourceState) other;
        return s.g(getSourceId(), rasterDemSourceState.getSourceId()) && s.g(getUrl(), rasterDemSourceState.getUrl()) && s.g(getTiles(), rasterDemSourceState.getTiles()) && s.g(getBounds(), rasterDemSourceState.getBounds()) && s.g(getMinZoom(), rasterDemSourceState.getMinZoom()) && s.g(getMaxZoom(), rasterDemSourceState.getMaxZoom()) && s.g(getTileSize(), rasterDemSourceState.getTileSize()) && s.g(getAttribution(), rasterDemSourceState.getAttribution()) && s.g(getEncoding(), rasterDemSourceState.getEncoding()) && s.g(getVolatile(), rasterDemSourceState.getVolatile()) && s.g(getPrefetchZoomDelta(), rasterDemSourceState.getPrefetchZoomDelta()) && s.g(getTileCacheBudget(), rasterDemSourceState.getTileCacheBudget()) && s.g(getMinimumTileUpdateInterval(), rasterDemSourceState.getMinimumTileUpdateInterval()) && s.g(getMaxOverscaleFactorForParentTiles(), rasterDemSourceState.getMaxOverscaleFactorForParentTiles()) && s.g(getTileRequestsDelay(), rasterDemSourceState.getTileRequestsDelay()) && s.g(getTileNetworkRequestsDelay(), rasterDemSourceState.getTileNetworkRequestsDelay());
    }

    public final StringValue getAttribution() {
        return this.attributionState.getF182175a();
    }

    public final DoubleListValue getBounds() {
        return this.boundsState.getF182175a();
    }

    public final EncodingValue getEncoding() {
        return this.encodingState.getF182175a();
    }

    public final LongValue getMaxOverscaleFactorForParentTiles() {
        return this.maxOverscaleFactorForParentTilesState.getF182175a();
    }

    public final LongValue getMaxZoom() {
        return this.maxZoomState.getF182175a();
    }

    public final LongValue getMinZoom() {
        return this.minZoomState.getF182175a();
    }

    public final DoubleValue getMinimumTileUpdateInterval() {
        return this.minimumTileUpdateIntervalState.getF182175a();
    }

    public final LongValue getPrefetchZoomDelta() {
        return this.prefetchZoomDeltaState.getF182175a();
    }

    public final TileCacheBudget getTileCacheBudget() {
        return this.tileCacheBudgetState.getF182175a();
    }

    public final DoubleValue getTileNetworkRequestsDelay() {
        return this.tileNetworkRequestsDelayState.getF182175a();
    }

    public final DoubleValue getTileRequestsDelay() {
        return this.tileRequestsDelayState.getF182175a();
    }

    public final LongValue getTileSize() {
        return this.tileSizeState.getF182175a();
    }

    public final StringListValue getTiles() {
        return this.tilesState.getF182175a();
    }

    public final StringValue getUrl() {
        return this.urlState.getF182175a();
    }

    public final BooleanValue getVolatile() {
        return this.volatileState.getF182175a();
    }

    public int hashCode() {
        return Objects.hash(getSourceId(), getUrl(), getTiles(), getBounds(), getMinZoom(), getMaxZoom(), getTileSize(), getAttribution(), getEncoding(), getVolatile(), getPrefetchZoomDelta(), getTileCacheBudget(), getMinimumTileUpdateInterval(), getMaxOverscaleFactorForParentTiles(), getTileRequestsDelay(), getTileNetworkRequestsDelay());
    }

    public final void setAttribution(StringValue stringValue) {
        stringValue.getClass();
        this.attributionState.setValue(stringValue);
    }

    public final void setBounds(DoubleListValue doubleListValue) {
        doubleListValue.getClass();
        this.boundsState.setValue(doubleListValue);
    }

    public final void setEncoding(EncodingValue encodingValue) {
        encodingValue.getClass();
        this.encodingState.setValue(encodingValue);
    }

    public final void setMaxOverscaleFactorForParentTiles(LongValue longValue) {
        longValue.getClass();
        this.maxOverscaleFactorForParentTilesState.setValue(longValue);
    }

    public final void setMaxZoom(LongValue longValue) {
        longValue.getClass();
        this.maxZoomState.setValue(longValue);
    }

    public final void setMinZoom(LongValue longValue) {
        longValue.getClass();
        this.minZoomState.setValue(longValue);
    }

    public final void setMinimumTileUpdateInterval(DoubleValue doubleValue) {
        doubleValue.getClass();
        this.minimumTileUpdateIntervalState.setValue(doubleValue);
    }

    public final void setPrefetchZoomDelta(LongValue longValue) {
        longValue.getClass();
        this.prefetchZoomDeltaState.setValue(longValue);
    }

    public final void setTileCacheBudget(TileCacheBudget tileCacheBudget) {
        tileCacheBudget.getClass();
        this.tileCacheBudgetState.setValue(tileCacheBudget);
    }

    public final void setTileNetworkRequestsDelay(DoubleValue doubleValue) {
        doubleValue.getClass();
        this.tileNetworkRequestsDelayState.setValue(doubleValue);
    }

    public final void setTileRequestsDelay(DoubleValue doubleValue) {
        doubleValue.getClass();
        this.tileRequestsDelayState.setValue(doubleValue);
    }

    public final void setTileSize(LongValue longValue) {
        longValue.getClass();
        this.tileSizeState.setValue(longValue);
    }

    public final void setTiles(StringListValue stringListValue) {
        stringListValue.getClass();
        this.tilesState.setValue(stringListValue);
    }

    public final void setUrl(StringValue stringValue) {
        stringValue.getClass();
        this.urlState.setValue(stringValue);
    }

    public final void setVolatile(BooleanValue booleanValue) {
        booleanValue.getClass();
        this.volatileState.setValue(booleanValue);
    }

    @Override // com.mapbox.maps.extension.compose.style.sources.SourceState
    public String toString() {
        return "RasterDemSourceState(sourceId=" + getSourceId() + ", url=" + getUrl() + ", tiles=" + getTiles() + ", bounds=" + getBounds() + ", minZoom=" + getMinZoom() + ", maxZoom=" + getMaxZoom() + ", tileSize=" + getTileSize() + ", attribution=" + getAttribution() + ", encoding=" + getEncoding() + ", volatile=" + getVolatile() + ", prefetchZoomDelta=" + getPrefetchZoomDelta() + ", tileCacheBudget=" + getTileCacheBudget() + ", minimumTileUpdateInterval=" + getMinimumTileUpdateInterval() + ", maxOverscaleFactorForParentTiles=" + getMaxOverscaleFactorForParentTiles() + ", tileRequestsDelay=" + getTileRequestsDelay() + ", tileNetworkRequestsDelay=" + getTileNetworkRequestsDelay() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/mapbox/maps/extension/compose/style/sources/generated/RasterDemSourceState$Companion;", "", "<init>", "()V", "Ld4/k;", "Lcom/mapbox/maps/extension/compose/style/sources/generated/RasterDemSourceState;", "Lcom/mapbox/maps/extension/compose/style/sources/SourceState$Holder;", "Saver", "Ld4/k;", "getSaver", "()Ld4/k;", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final k<RasterDemSourceState, SourceState.Holder> getSaver() {
            return RasterDemSourceState.Saver;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public RasterDemSourceState(String str) {
        str.getClass();
        k0 k0Var = k0.f134949a;
        k0Var.getClass();
        StringValue stringValue = StringValue.INITIAL;
        StringListValue stringListValue = StringListValue.INITIAL;
        DoubleListValue doubleListValue = DoubleListValue.INITIAL;
        LongValue longValue = LongValue.INITIAL;
        EncodingValue encodingValue = EncodingValue.INITIAL;
        BooleanValue booleanValue = BooleanValue.INITIAL;
        TileCacheBudget tileCacheBudget = TileCacheBudget.INITIAL;
        DoubleValue doubleValue = DoubleValue.INITIAL;
        this(str, "raster-dem", k0Var, stringValue, stringListValue, doubleListValue, longValue, longValue, longValue, stringValue, encodingValue, booleanValue, longValue, tileCacheBudget, doubleValue, longValue, doubleValue, doubleValue);
    }

    public /* synthetic */ RasterDemSourceState(String str, String str2, Map map, StringValue stringValue, StringListValue stringListValue, DoubleListValue doubleListValue, LongValue longValue, LongValue longValue2, LongValue longValue3, StringValue stringValue2, EncodingValue encodingValue, BooleanValue booleanValue, LongValue longValue4, TileCacheBudget tileCacheBudget, DoubleValue doubleValue, LongValue longValue5, DoubleValue doubleValue2, DoubleValue doubleValue3, j jVar) {
        this(str, str2, map, stringValue, stringListValue, doubleListValue, longValue, longValue2, longValue3, stringValue2, encodingValue, booleanValue, longValue4, tileCacheBudget, doubleValue, longValue5, doubleValue2, doubleValue3);
    }

    public /* synthetic */ RasterDemSourceState(String str, int i14, j jVar) {
        this((i14 & 1) != 0 ? IdGenerator.INSTANCE.generateRandomSourceId("raster-dem") : str);
    }
}
