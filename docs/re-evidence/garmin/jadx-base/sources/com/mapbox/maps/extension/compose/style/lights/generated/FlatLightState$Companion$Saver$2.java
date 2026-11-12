package com.mapbox.maps.extension.compose.style.lights.generated;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mapbox.bindgen.Value;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.maps.extension.compose.style.ColorValue;
import com.mapbox.maps.extension.compose.style.DoubleListValue;
import com.mapbox.maps.extension.compose.style.DoubleValue;
import com.mapbox.maps.extension.compose.style.StringValue;
import com.mapbox.maps.extension.compose.style.Transition;
import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import e23.l;
import java.util.HashMap;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/mapbox/maps/extension/compose/style/lights/generated/FlatLightState;", "holder", "Lcom/mapbox/maps/extension/compose/style/lights/generated/FlatLightState$Holder;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
public final class FlatLightState$Companion$Saver$2 extends w implements l<FlatLightState.Holder, FlatLightState> {
    public static final FlatLightState$Companion$Saver$2 INSTANCE = new FlatLightState$Companion$Saver$2();

    public FlatLightState$Companion$Saver$2() {
        super(1);
    }

    @Override // e23.l
    public final FlatLightState invoke(FlatLightState.Holder holder) {
        holder.getClass();
        MapboxLogger.logD("FlatLightState", "restore: " + holder);
        Value value = holder.getSavedProperties().get(TtmlNode.ATTR_ID);
        value.getClass();
        Object contents = value.getContents();
        contents.getClass();
        String str = (String) contents;
        Value value2 = holder.getSavedProperties().get("properties");
        value2.getClass();
        Object contents2 = value2.getContents();
        contents2.getClass();
        HashMap map = (HashMap) contents2;
        Value value3 = (Value) map.get("anchor");
        AnchorValue anchorValue = value3 != null ? new AnchorValue(value3) : AnchorValue.INITIAL;
        Value value4 = (Value) map.get(TtmlNode.ATTR_TTS_COLOR);
        ColorValue colorValue = value4 != null ? new ColorValue(value4) : ColorValue.INITIAL;
        Value value5 = (Value) map.get("color-transition");
        Transition transition = value5 != null ? new Transition(value5) : Transition.INITIAL;
        Value value6 = (Value) map.get("color-use-theme");
        StringValue stringValue = value6 != null ? new StringValue(value6) : StringValue.INITIAL;
        Value value7 = (Value) map.get("intensity");
        DoubleValue doubleValue = value7 != null ? new DoubleValue(value7) : DoubleValue.INITIAL;
        Value value8 = (Value) map.get("intensity-transition");
        Transition transition2 = value8 != null ? new Transition(value8) : Transition.INITIAL;
        Value value9 = (Value) map.get(ModelSourceWrapper.POSITION);
        DoubleListValue doubleListValue = value9 != null ? new DoubleListValue(value9) : DoubleListValue.INITIAL;
        Value value10 = (Value) map.get("position-transition");
        return new FlatLightState(str, anchorValue, colorValue, transition, stringValue, doubleValue, transition2, doubleListValue, value10 != null ? new Transition(value10) : Transition.INITIAL);
    }
}
