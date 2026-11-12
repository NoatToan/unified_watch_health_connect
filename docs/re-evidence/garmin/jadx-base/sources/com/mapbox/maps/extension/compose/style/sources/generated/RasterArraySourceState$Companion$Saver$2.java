package com.mapbox.maps.extension.compose.style.sources.generated;

import com.mapbox.bindgen.Value;
import com.mapbox.maps.extension.compose.style.DoubleListValue;
import com.mapbox.maps.extension.compose.style.LongValue;
import com.mapbox.maps.extension.compose.style.StringListValue;
import com.mapbox.maps.extension.compose.style.StringValue;
import com.mapbox.maps.extension.compose.style.sources.RasterLayers;
import com.mapbox.maps.extension.compose.style.sources.SourceState;
import com.mapbox.maps.extension.compose.style.sources.TileCacheBudget;
import e23.l;
import java.util.Map;
import o13.p;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/mapbox/maps/extension/compose/style/sources/generated/RasterArraySourceState;", "holder", "Lcom/mapbox/maps/extension/compose/style/sources/SourceState$Holder;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
public final class RasterArraySourceState$Companion$Saver$2 extends w implements l<SourceState.Holder, RasterArraySourceState> {
    public static final RasterArraySourceState$Companion$Saver$2 INSTANCE = new RasterArraySourceState$Companion$Saver$2();

    public RasterArraySourceState$Companion$Saver$2() {
        super(1);
    }

    @Override // e23.l
    public final RasterArraySourceState invoke(SourceState.Holder holder) {
        holder.getClass();
        String sourcedId = holder.getSourcedId();
        Map<String, p<Boolean, Value>> savedProperties = holder.getSavedProperties();
        p<Boolean, Value> pVar = holder.getSavedProperties().get("url");
        StringValue stringValue = pVar != null ? new StringValue(pVar.f128595b) : StringValue.INITIAL;
        p<Boolean, Value> pVar2 = holder.getSavedProperties().get("tiles");
        StringListValue stringListValue = pVar2 != null ? new StringListValue(pVar2.f128595b) : StringListValue.INITIAL;
        p<Boolean, Value> pVar3 = holder.getSavedProperties().get("bounds");
        DoubleListValue doubleListValue = pVar3 != null ? new DoubleListValue(pVar3.f128595b) : DoubleListValue.INITIAL;
        p<Boolean, Value> pVar4 = holder.getSavedProperties().get("minzoom");
        LongValue longValue = pVar4 != null ? new LongValue(pVar4.f128595b) : LongValue.INITIAL;
        p<Boolean, Value> pVar5 = holder.getSavedProperties().get("maxzoom");
        LongValue longValue2 = pVar5 != null ? new LongValue(pVar5.f128595b) : LongValue.INITIAL;
        p<Boolean, Value> pVar6 = holder.getSavedProperties().get("tileSize");
        LongValue longValue3 = pVar6 != null ? new LongValue(pVar6.f128595b) : LongValue.INITIAL;
        p<Boolean, Value> pVar7 = holder.getSavedProperties().get("attribution");
        StringValue stringValue2 = pVar7 != null ? new StringValue(pVar7.f128595b) : StringValue.INITIAL;
        p<Boolean, Value> pVar8 = holder.getSavedProperties().get("rasterLayers");
        RasterLayers rasterLayers = pVar8 != null ? new RasterLayers(pVar8.f128595b) : RasterLayers.INITIAL;
        p<Boolean, Value> pVar9 = holder.getSavedProperties().get("tile-cache-budget");
        return new RasterArraySourceState(sourcedId, "raster-array", savedProperties, stringValue, stringListValue, doubleListValue, longValue, longValue2, longValue3, stringValue2, rasterLayers, pVar9 != null ? new TileCacheBudget(pVar9.f128595b) : TileCacheBudget.INITIAL, null);
    }
}
