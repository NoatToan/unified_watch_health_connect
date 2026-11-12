package com.mapbox.maps.extension.compose.style.sources.generated;

import com.mapbox.bindgen.Value;
import com.mapbox.maps.extension.compose.style.LongValue;
import com.mapbox.maps.extension.compose.style.PointListValue;
import com.mapbox.maps.extension.compose.style.StringValue;
import com.mapbox.maps.extension.compose.style.sources.SourceState;
import e23.l;
import java.util.Map;
import o13.p;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/mapbox/maps/extension/compose/style/sources/generated/ImageSourceState;", "holder", "Lcom/mapbox/maps/extension/compose/style/sources/SourceState$Holder;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
public final class ImageSourceState$Companion$Saver$2 extends w implements l<SourceState.Holder, ImageSourceState> {
    public static final ImageSourceState$Companion$Saver$2 INSTANCE = new ImageSourceState$Companion$Saver$2();

    public ImageSourceState$Companion$Saver$2() {
        super(1);
    }

    @Override // e23.l
    public final ImageSourceState invoke(SourceState.Holder holder) {
        holder.getClass();
        String sourcedId = holder.getSourcedId();
        Map<String, p<Boolean, Value>> savedProperties = holder.getSavedProperties();
        p<Boolean, Value> pVar = holder.getSavedProperties().get("url");
        StringValue stringValue = pVar != null ? new StringValue(pVar.f128595b) : StringValue.INITIAL;
        p<Boolean, Value> pVar2 = holder.getSavedProperties().get("coordinates");
        PointListValue pointListValue = pVar2 != null ? new PointListValue(pVar2.f128595b) : PointListValue.INITIAL;
        p<Boolean, Value> pVar3 = holder.getSavedProperties().get("prefetch-zoom-delta");
        return new ImageSourceState(sourcedId, "image", savedProperties, stringValue, pointListValue, pVar3 != null ? new LongValue(pVar3.f128595b) : LongValue.INITIAL, null);
    }
}
