package com.mapbox.maps.extension.compose.style.sources.generated;

import com.mapbox.bindgen.Value;
import com.mapbox.maps.extension.compose.style.BooleanValue;
import com.mapbox.maps.extension.compose.style.DoubleValue;
import com.mapbox.maps.extension.compose.style.LongValue;
import com.mapbox.maps.extension.compose.style.StringValue;
import com.mapbox.maps.extension.compose.style.sources.ClusterProperties;
import com.mapbox.maps.extension.compose.style.sources.GeoJSONData;
import com.mapbox.maps.extension.compose.style.sources.PromoteIdValue;
import com.mapbox.maps.extension.compose.style.sources.SourceState;
import com.mapbox.maps.extension.compose.style.sources.TileCacheBudget;
import e23.l;
import java.util.Map;
import o13.p;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/mapbox/maps/extension/compose/style/sources/generated/GeoJsonSourceState;", "holder", "Lcom/mapbox/maps/extension/compose/style/sources/SourceState$Holder;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
public final class GeoJsonSourceState$Companion$Saver$2 extends w implements l<SourceState.Holder, GeoJsonSourceState> {
    public static final GeoJsonSourceState$Companion$Saver$2 INSTANCE = new GeoJsonSourceState$Companion$Saver$2();

    public GeoJsonSourceState$Companion$Saver$2() {
        super(1);
    }

    @Override // e23.l
    public final GeoJsonSourceState invoke(SourceState.Holder holder) {
        holder.getClass();
        String sourcedId = holder.getSourcedId();
        Map<String, p<Boolean, Value>> savedProperties = holder.getSavedProperties();
        GeoJSONData geoJSONData = holder.getGeoJSONData();
        p<Boolean, Value> pVar = holder.getSavedProperties().get("maxzoom");
        LongValue longValue = pVar != null ? new LongValue(pVar.f128595b) : LongValue.INITIAL;
        p<Boolean, Value> pVar2 = holder.getSavedProperties().get("attribution");
        StringValue stringValue = pVar2 != null ? new StringValue(pVar2.f128595b) : StringValue.INITIAL;
        p<Boolean, Value> pVar3 = holder.getSavedProperties().get("buffer");
        LongValue longValue2 = pVar3 != null ? new LongValue(pVar3.f128595b) : LongValue.INITIAL;
        p<Boolean, Value> pVar4 = holder.getSavedProperties().get("tolerance");
        DoubleValue doubleValue = pVar4 != null ? new DoubleValue(pVar4.f128595b) : DoubleValue.INITIAL;
        p<Boolean, Value> pVar5 = holder.getSavedProperties().get("cluster");
        BooleanValue booleanValue = pVar5 != null ? new BooleanValue(pVar5.f128595b) : BooleanValue.INITIAL;
        p<Boolean, Value> pVar6 = holder.getSavedProperties().get("clusterRadius");
        LongValue longValue3 = pVar6 != null ? new LongValue(pVar6.f128595b) : LongValue.INITIAL;
        p<Boolean, Value> pVar7 = holder.getSavedProperties().get("clusterMaxZoom");
        LongValue longValue4 = pVar7 != null ? new LongValue(pVar7.f128595b) : LongValue.INITIAL;
        p<Boolean, Value> pVar8 = holder.getSavedProperties().get("clusterMinPoints");
        LongValue longValue5 = pVar8 != null ? new LongValue(pVar8.f128595b) : LongValue.INITIAL;
        p<Boolean, Value> pVar9 = holder.getSavedProperties().get("clusterProperties");
        ClusterProperties clusterProperties = pVar9 != null ? new ClusterProperties(pVar9.f128595b) : ClusterProperties.INITIAL;
        p<Boolean, Value> pVar10 = holder.getSavedProperties().get("lineMetrics");
        BooleanValue booleanValue2 = pVar10 != null ? new BooleanValue(pVar10.f128595b) : BooleanValue.INITIAL;
        p<Boolean, Value> pVar11 = holder.getSavedProperties().get("generateId");
        BooleanValue booleanValue3 = pVar11 != null ? new BooleanValue(pVar11.f128595b) : BooleanValue.INITIAL;
        p<Boolean, Value> pVar12 = holder.getSavedProperties().get("promoteId");
        PromoteIdValue promoteIdValue = pVar12 != null ? new PromoteIdValue(pVar12.f128595b) : PromoteIdValue.INITIAL;
        p<Boolean, Value> pVar13 = holder.getSavedProperties().get("autoMaxZoom");
        BooleanValue booleanValue4 = pVar13 != null ? new BooleanValue(pVar13.f128595b) : BooleanValue.INITIAL;
        p<Boolean, Value> pVar14 = holder.getSavedProperties().get("prefetch-zoom-delta");
        LongValue longValue6 = pVar14 != null ? new LongValue(pVar14.f128595b) : LongValue.INITIAL;
        p<Boolean, Value> pVar15 = holder.getSavedProperties().get("tile-cache-budget");
        return new GeoJsonSourceState(sourcedId, "geojson", savedProperties, geoJSONData, longValue, stringValue, longValue2, doubleValue, booleanValue, longValue3, longValue4, longValue5, clusterProperties, booleanValue2, booleanValue3, promoteIdValue, booleanValue4, longValue6, pVar15 != null ? new TileCacheBudget(pVar15.f128595b) : TileCacheBudget.INITIAL, null);
    }
}
