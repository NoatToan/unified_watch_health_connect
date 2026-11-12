package com.mapbox.maps.extension.compose.style.sources.generated;

import ch.qos.logback.core.CoreConstants;
import com.mapbox.bindgen.Value;
import com.mapbox.maps.MapboxExperimental;
import com.mapbox.maps.extension.compose.style.DoubleListValue;
import com.mapbox.maps.extension.compose.style.IdGenerator;
import com.mapbox.maps.extension.compose.style.LongValue;
import com.mapbox.maps.extension.compose.style.PropertyTypesKt;
import com.mapbox.maps.extension.compose.style.StringListValue;
import com.mapbox.maps.extension.compose.style.StringValue;
import com.mapbox.maps.extension.compose.style.sources.RasterLayers;
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
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b5\b\u0007\u0018\u0000 _2\u00020\u0001:\u0001_B\u0081\u0001\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u001e\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00060\u0005\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0014\u001a\u00020\n\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aB\u0013\b\u0016\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u001bJ\u000f\u0010\u001f\u001a\u00020\u001cH\u0011¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\"\u001a\u00020\u00072\b\u0010!\u001a\u0004\u0018\u00010 H\u0096\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0002H\u0016¢\u0006\u0004\b'\u0010(J\u001b\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0005H\u0002¢\u0006\u0004\b)\u0010*R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020\n0+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020\f0+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010-R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\u000e0+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010-R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020\u00100+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010-R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020\u00100+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010-R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020\u00100+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010-R\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020\n0+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010-R\u001a\u00104\u001a\b\u0012\u0004\u0012\u00020\u00150+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010-R\u001a\u00105\u001a\b\u0012\u0004\u0012\u00020\u00170+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010-R+\u0010\u000b\u001a\u00020\n2\u0006\u00106\u001a\u00020\n8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\b7\u00108\"\u0004\b9\u0010:*\u0004\b;\u0010<R+\u0010\r\u001a\u00020\f2\u0006\u00106\u001a\u00020\f8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@*\u0004\bA\u0010<R+\u0010\u000f\u001a\u00020\u000e2\u0006\u00106\u001a\u00020\u000e8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bB\u0010C\"\u0004\bD\u0010E*\u0004\bF\u0010<R+\u0010\u0011\u001a\u00020\u00102\u0006\u00106\u001a\u00020\u00108F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bG\u0010H\"\u0004\bI\u0010J*\u0004\bK\u0010<R+\u0010\u0012\u001a\u00020\u00102\u0006\u00106\u001a\u00020\u00108F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bL\u0010H\"\u0004\bM\u0010J*\u0004\bN\u0010<R+\u0010\u0013\u001a\u00020\u00102\u0006\u00106\u001a\u00020\u00108F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bO\u0010H\"\u0004\bP\u0010J*\u0004\bQ\u0010<R+\u0010\u0014\u001a\u00020\n2\u0006\u00106\u001a\u00020\n8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bR\u00108\"\u0004\bS\u0010:*\u0004\bT\u0010<R+\u0010\u0016\u001a\u00020\u00152\u0006\u00106\u001a\u00020\u00158F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bU\u0010V\"\u0004\bW\u0010X*\u0004\bY\u0010<R+\u0010\u0018\u001a\u00020\u00172\u0006\u00106\u001a\u00020\u00178F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]*\u0004\b^\u0010<¨\u0006`"}, d2 = {"Lcom/mapbox/maps/extension/compose/style/sources/generated/RasterArraySourceState;", "Lcom/mapbox/maps/extension/compose/style/sources/SourceState;", "", "sourceId", "sourceType", "", "Lo13/p;", "", "Lcom/mapbox/bindgen/Value;", "initialProperties", "Lcom/mapbox/maps/extension/compose/style/StringValue;", "url", "Lcom/mapbox/maps/extension/compose/style/StringListValue;", "tiles", "Lcom/mapbox/maps/extension/compose/style/DoubleListValue;", "bounds", "Lcom/mapbox/maps/extension/compose/style/LongValue;", "minZoom", "maxZoom", "tileSize", "attribution", "Lcom/mapbox/maps/extension/compose/style/sources/RasterLayers;", "rasterLayers", "Lcom/mapbox/maps/extension/compose/style/sources/TileCacheBudget;", "tileCacheBudget", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/mapbox/maps/extension/compose/style/StringValue;Lcom/mapbox/maps/extension/compose/style/StringListValue;Lcom/mapbox/maps/extension/compose/style/DoubleListValue;Lcom/mapbox/maps/extension/compose/style/LongValue;Lcom/mapbox/maps/extension/compose/style/LongValue;Lcom/mapbox/maps/extension/compose/style/LongValue;Lcom/mapbox/maps/extension/compose/style/StringValue;Lcom/mapbox/maps/extension/compose/style/sources/RasterLayers;Lcom/mapbox/maps/extension/compose/style/sources/TileCacheBudget;)V", "(Ljava/lang/String;)V", "", "UpdateProperties$extension_compose_release", "(Lp3/m;I)V", "UpdateProperties", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "getProperties", "()Ljava/util/Map;", "Lp3/p1;", "urlState", "Lp3/p1;", "tilesState", "boundsState", "minZoomState", "maxZoomState", "tileSizeState", "attributionState", "rasterLayersState", "tileCacheBudgetState", "<set-?>", "getUrl", "()Lcom/mapbox/maps/extension/compose/style/StringValue;", "setUrl", "(Lcom/mapbox/maps/extension/compose/style/StringValue;)V", "getUrl$delegate", "(Lcom/mapbox/maps/extension/compose/style/sources/generated/RasterArraySourceState;)Ljava/lang/Object;", "getTiles", "()Lcom/mapbox/maps/extension/compose/style/StringListValue;", "setTiles", "(Lcom/mapbox/maps/extension/compose/style/StringListValue;)V", "getTiles$delegate", "getBounds", "()Lcom/mapbox/maps/extension/compose/style/DoubleListValue;", "setBounds", "(Lcom/mapbox/maps/extension/compose/style/DoubleListValue;)V", "getBounds$delegate", "getMinZoom", "()Lcom/mapbox/maps/extension/compose/style/LongValue;", "setMinZoom", "(Lcom/mapbox/maps/extension/compose/style/LongValue;)V", "getMinZoom$delegate", "getMaxZoom", "setMaxZoom", "getMaxZoom$delegate", "getTileSize", "setTileSize", "getTileSize$delegate", "getAttribution", "setAttribution", "getAttribution$delegate", "getRasterLayers", "()Lcom/mapbox/maps/extension/compose/style/sources/RasterLayers;", "setRasterLayers", "(Lcom/mapbox/maps/extension/compose/style/sources/RasterLayers;)V", "getRasterLayers$delegate", "getTileCacheBudget", "()Lcom/mapbox/maps/extension/compose/style/sources/TileCacheBudget;", "setTileCacheBudget", "(Lcom/mapbox/maps/extension/compose/style/sources/TileCacheBudget;)V", "getTileCacheBudget$delegate", "Companion", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@MapboxExperimental
public final class RasterArraySourceState extends SourceState {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final k<RasterArraySourceState, SourceState.Holder> Saver;
    private final p1<StringValue> attributionState;
    private final p1<DoubleListValue> boundsState;
    private final p1<LongValue> maxZoomState;
    private final p1<LongValue> minZoomState;
    private final p1<RasterLayers> rasterLayersState;
    private final p1<TileCacheBudget> tileCacheBudgetState;
    private final p1<LongValue> tileSizeState;
    private final p1<StringListValue> tilesState;
    private final p1<StringValue> urlState;

    static {
        RasterArraySourceState$Companion$Saver$1 rasterArraySourceState$Companion$Saver$1 = RasterArraySourceState$Companion$Saver$1.INSTANCE;
        RasterArraySourceState$Companion$Saver$2 rasterArraySourceState$Companion$Saver$2 = RasterArraySourceState$Companion$Saver$2.INSTANCE;
        l lVar = m.f57455a;
        Saver = new l(rasterArraySourceState$Companion$Saver$1, rasterArraySourceState$Companion$Saver$2);
    }

    private RasterArraySourceState(String str, String str2, Map<String, ? extends p<Boolean, ? extends Value>> map, StringValue stringValue, StringListValue stringListValue, DoubleListValue doubleListValue, LongValue longValue, LongValue longValue2, LongValue longValue3, StringValue stringValue2, RasterLayers rasterLayers, TileCacheBudget tileCacheBudget) {
        super(str, str2, map, null, 8, null);
        this.urlState = p0.n(stringValue);
        this.tilesState = p0.n(stringListValue);
        this.boundsState = p0.n(doubleListValue);
        this.minZoomState = p0.n(longValue);
        this.maxZoomState = p0.n(longValue2);
        this.tileSizeState = p0.n(longValue3);
        this.attributionState = p0.n(stringValue2);
        this.rasterLayersState = p0.n(rasterLayers);
        this.tileCacheBudgetState = p0.n(tileCacheBudget);
    }

    private final Map<String, Value> getProperties() {
        return u0.l(u.C(new p[]{getUrl().isNotInitial() ? new p("url", getUrl().getValue()) : null, getTiles().isNotInitial() ? new p("tiles", getTiles().getValue()) : null, getBounds().isNotInitial() ? new p("bounds", getBounds().getValue()) : null, getMinZoom().isNotInitial() ? new p("minzoom", getMinZoom().getValue()) : null, getMaxZoom().isNotInitial() ? new p("maxzoom", getMaxZoom().getValue()) : null, getTileSize().isNotInitial() ? new p("tileSize", getTileSize().getValue()) : null, getAttribution().isNotInitial() ? new p("attribution", getAttribution().getValue()) : null, getRasterLayers().isNotInitial() ? new p("rasterLayers", getRasterLayers().getValue()) : null, getTileCacheBudget().isNotInitial() ? new p("tile-cache-budget", getTileCacheBudget().getValue()) : null}));
    }

    @Override // com.mapbox.maps.extension.compose.style.sources.SourceState
    public void UpdateProperties$extension_compose_release(p3.m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(-1255005904);
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
            PropertyTypesKt.ActionWhenNotInitial((e23.p) getSetBuilderPropertyAction(), this.rasterLayersState, "rasterLayers", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((e23.p) getSetPropertyAction(), this.tileCacheBudgetState, "tile-cache-budget", o0VarE, 384);
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new RasterArraySourceState$UpdateProperties$1(this, i14);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!RasterArraySourceState.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        other.getClass();
        RasterArraySourceState rasterArraySourceState = (RasterArraySourceState) other;
        return s.g(getSourceId(), rasterArraySourceState.getSourceId()) && s.g(getUrl(), rasterArraySourceState.getUrl()) && s.g(getTiles(), rasterArraySourceState.getTiles()) && s.g(getBounds(), rasterArraySourceState.getBounds()) && s.g(getMinZoom(), rasterArraySourceState.getMinZoom()) && s.g(getMaxZoom(), rasterArraySourceState.getMaxZoom()) && s.g(getTileSize(), rasterArraySourceState.getTileSize()) && s.g(getAttribution(), rasterArraySourceState.getAttribution()) && s.g(getRasterLayers(), rasterArraySourceState.getRasterLayers()) && s.g(getTileCacheBudget(), rasterArraySourceState.getTileCacheBudget());
    }

    public final StringValue getAttribution() {
        return this.attributionState.getF182175a();
    }

    public final DoubleListValue getBounds() {
        return this.boundsState.getF182175a();
    }

    public final LongValue getMaxZoom() {
        return this.maxZoomState.getF182175a();
    }

    public final LongValue getMinZoom() {
        return this.minZoomState.getF182175a();
    }

    public final RasterLayers getRasterLayers() {
        return this.rasterLayersState.getF182175a();
    }

    public final TileCacheBudget getTileCacheBudget() {
        return this.tileCacheBudgetState.getF182175a();
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

    public int hashCode() {
        return Objects.hash(getSourceId(), getUrl(), getTiles(), getBounds(), getMinZoom(), getMaxZoom(), getTileSize(), getAttribution(), getRasterLayers(), getTileCacheBudget());
    }

    public final void setAttribution(StringValue stringValue) {
        stringValue.getClass();
        this.attributionState.setValue(stringValue);
    }

    public final void setBounds(DoubleListValue doubleListValue) {
        doubleListValue.getClass();
        this.boundsState.setValue(doubleListValue);
    }

    public final void setMaxZoom(LongValue longValue) {
        longValue.getClass();
        this.maxZoomState.setValue(longValue);
    }

    public final void setMinZoom(LongValue longValue) {
        longValue.getClass();
        this.minZoomState.setValue(longValue);
    }

    public final void setRasterLayers(RasterLayers rasterLayers) {
        rasterLayers.getClass();
        this.rasterLayersState.setValue(rasterLayers);
    }

    public final void setTileCacheBudget(TileCacheBudget tileCacheBudget) {
        tileCacheBudget.getClass();
        this.tileCacheBudgetState.setValue(tileCacheBudget);
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

    @Override // com.mapbox.maps.extension.compose.style.sources.SourceState
    public String toString() {
        return "RasterArraySourceState(sourceId=" + getSourceId() + ", url=" + getUrl() + ", tiles=" + getTiles() + ", bounds=" + getBounds() + ", minZoom=" + getMinZoom() + ", maxZoom=" + getMaxZoom() + ", tileSize=" + getTileSize() + ", attribution=" + getAttribution() + ", rasterLayers=" + getRasterLayers() + ", tileCacheBudget=" + getTileCacheBudget() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/mapbox/maps/extension/compose/style/sources/generated/RasterArraySourceState$Companion;", "", "<init>", "()V", "Ld4/k;", "Lcom/mapbox/maps/extension/compose/style/sources/generated/RasterArraySourceState;", "Lcom/mapbox/maps/extension/compose/style/sources/SourceState$Holder;", "Saver", "Ld4/k;", "getSaver", "()Ld4/k;", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final k<RasterArraySourceState, SourceState.Holder> getSaver() {
            return RasterArraySourceState.Saver;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public RasterArraySourceState(String str) {
        str.getClass();
        k0 k0Var = k0.f134949a;
        k0Var.getClass();
        StringValue stringValue = StringValue.INITIAL;
        StringListValue stringListValue = StringListValue.INITIAL;
        DoubleListValue doubleListValue = DoubleListValue.INITIAL;
        LongValue longValue = LongValue.INITIAL;
        this(str, "raster-array", k0Var, stringValue, stringListValue, doubleListValue, longValue, longValue, longValue, stringValue, RasterLayers.INITIAL, TileCacheBudget.INITIAL);
    }

    public /* synthetic */ RasterArraySourceState(String str, String str2, Map map, StringValue stringValue, StringListValue stringListValue, DoubleListValue doubleListValue, LongValue longValue, LongValue longValue2, LongValue longValue3, StringValue stringValue2, RasterLayers rasterLayers, TileCacheBudget tileCacheBudget, j jVar) {
        this(str, str2, map, stringValue, stringListValue, doubleListValue, longValue, longValue2, longValue3, stringValue2, rasterLayers, tileCacheBudget);
    }

    public /* synthetic */ RasterArraySourceState(String str, int i14, j jVar) {
        this((i14 & 1) != 0 ? IdGenerator.INSTANCE.generateRandomSourceId("raster-array") : str);
    }
}
