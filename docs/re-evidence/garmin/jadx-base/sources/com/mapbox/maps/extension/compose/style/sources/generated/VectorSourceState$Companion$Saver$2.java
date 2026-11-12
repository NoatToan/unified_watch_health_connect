package com.mapbox.maps.extension.compose.style.sources.generated;

import com.mapbox.bindgen.Value;
import com.mapbox.maps.extension.compose.style.BooleanValue;
import com.mapbox.maps.extension.compose.style.DoubleListValue;
import com.mapbox.maps.extension.compose.style.DoubleValue;
import com.mapbox.maps.extension.compose.style.LongValue;
import com.mapbox.maps.extension.compose.style.StringListValue;
import com.mapbox.maps.extension.compose.style.StringValue;
import com.mapbox.maps.extension.compose.style.sources.PromoteIdValue;
import com.mapbox.maps.extension.compose.style.sources.SourceState;
import com.mapbox.maps.extension.compose.style.sources.TileCacheBudget;
import e23.l;
import java.util.Map;
import o13.p;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/mapbox/maps/extension/compose/style/sources/generated/VectorSourceState;", "holder", "Lcom/mapbox/maps/extension/compose/style/sources/SourceState$Holder;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
public final class VectorSourceState$Companion$Saver$2 extends w implements l<SourceState.Holder, VectorSourceState> {
    public static final VectorSourceState$Companion$Saver$2 INSTANCE = new VectorSourceState$Companion$Saver$2();

    public VectorSourceState$Companion$Saver$2() {
        super(1);
    }

    @Override // e23.l
    public final VectorSourceState invoke(SourceState.Holder holder) {
        holder.getClass();
        String sourcedId = holder.getSourcedId();
        Map<String, p<Boolean, Value>> savedProperties = holder.getSavedProperties();
        p<Boolean, Value> pVar = holder.getSavedProperties().get("url");
        StringValue stringValue = pVar != null ? new StringValue(pVar.f128595b) : StringValue.INITIAL;
        p<Boolean, Value> pVar2 = holder.getSavedProperties().get("tiles");
        StringListValue stringListValue = pVar2 != null ? new StringListValue(pVar2.f128595b) : StringListValue.INITIAL;
        p<Boolean, Value> pVar3 = holder.getSavedProperties().get("bounds");
        DoubleListValue doubleListValue = pVar3 != null ? new DoubleListValue(pVar3.f128595b) : DoubleListValue.INITIAL;
        p<Boolean, Value> pVar4 = holder.getSavedProperties().get("scheme");
        SchemeValue schemeValue = pVar4 != null ? new SchemeValue(pVar4.f128595b) : SchemeValue.INITIAL;
        p<Boolean, Value> pVar5 = holder.getSavedProperties().get("minzoom");
        LongValue longValue = pVar5 != null ? new LongValue(pVar5.f128595b) : LongValue.INITIAL;
        p<Boolean, Value> pVar6 = holder.getSavedProperties().get("maxzoom");
        LongValue longValue2 = pVar6 != null ? new LongValue(pVar6.f128595b) : LongValue.INITIAL;
        p<Boolean, Value> pVar7 = holder.getSavedProperties().get("attribution");
        StringValue stringValue2 = pVar7 != null ? new StringValue(pVar7.f128595b) : StringValue.INITIAL;
        p<Boolean, Value> pVar8 = holder.getSavedProperties().get("promoteId");
        PromoteIdValue promoteIdValue = pVar8 != null ? new PromoteIdValue(pVar8.f128595b) : PromoteIdValue.INITIAL;
        p<Boolean, Value> pVar9 = holder.getSavedProperties().get("volatile");
        BooleanValue booleanValue = pVar9 != null ? new BooleanValue(pVar9.f128595b) : BooleanValue.INITIAL;
        p<Boolean, Value> pVar10 = holder.getSavedProperties().get("prefetch-zoom-delta");
        LongValue longValue3 = pVar10 != null ? new LongValue(pVar10.f128595b) : LongValue.INITIAL;
        p<Boolean, Value> pVar11 = holder.getSavedProperties().get("tile-cache-budget");
        TileCacheBudget tileCacheBudget = pVar11 != null ? new TileCacheBudget(pVar11.f128595b) : TileCacheBudget.INITIAL;
        p<Boolean, Value> pVar12 = holder.getSavedProperties().get("minimum-tile-update-interval");
        DoubleValue doubleValue = pVar12 != null ? new DoubleValue(pVar12.f128595b) : DoubleValue.INITIAL;
        p<Boolean, Value> pVar13 = holder.getSavedProperties().get("max-overscale-factor-for-parent-tiles");
        LongValue longValue4 = pVar13 != null ? new LongValue(pVar13.f128595b) : LongValue.INITIAL;
        p<Boolean, Value> pVar14 = holder.getSavedProperties().get("tile-requests-delay");
        DoubleValue doubleValue2 = pVar14 != null ? new DoubleValue(pVar14.f128595b) : DoubleValue.INITIAL;
        p<Boolean, Value> pVar15 = holder.getSavedProperties().get("tile-network-requests-delay");
        return new VectorSourceState(sourcedId, "vector", savedProperties, stringValue, stringListValue, doubleListValue, schemeValue, longValue, longValue2, stringValue2, promoteIdValue, booleanValue, longValue3, tileCacheBudget, doubleValue, longValue4, doubleValue2, pVar15 != null ? new DoubleValue(pVar15.f128595b) : DoubleValue.INITIAL, null);
    }
}
