package com.mapbox.maps.extension.compose.style.lights.generated;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mapbox.bindgen.Value;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.maps.extension.compose.style.BooleanValue;
import com.mapbox.maps.extension.compose.style.ColorValue;
import com.mapbox.maps.extension.compose.style.DoubleListValue;
import com.mapbox.maps.extension.compose.style.DoubleValue;
import com.mapbox.maps.extension.compose.style.StringValue;
import com.mapbox.maps.extension.compose.style.Transition;
import e23.l;
import java.util.HashMap;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/mapbox/maps/extension/compose/style/lights/generated/DirectionalLightState;", "holder", "Lcom/mapbox/maps/extension/compose/style/lights/generated/DirectionalLightState$Holder;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
public final class DirectionalLightState$Companion$Saver$2 extends w implements l<DirectionalLightState.Holder, DirectionalLightState> {
    public static final DirectionalLightState$Companion$Saver$2 INSTANCE = new DirectionalLightState$Companion$Saver$2();

    public DirectionalLightState$Companion$Saver$2() {
        super(1);
    }

    @Override // e23.l
    public final DirectionalLightState invoke(DirectionalLightState.Holder holder) {
        holder.getClass();
        MapboxLogger.logD("DirectionalLightState", "restore: " + holder);
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
        Value value3 = (Value) map.get("cast-shadows");
        BooleanValue booleanValue = value3 != null ? new BooleanValue(value3) : BooleanValue.INITIAL;
        Value value4 = (Value) map.get(TtmlNode.ATTR_TTS_COLOR);
        ColorValue colorValue = value4 != null ? new ColorValue(value4) : ColorValue.INITIAL;
        Value value5 = (Value) map.get("color-transition");
        Transition transition = value5 != null ? new Transition(value5) : Transition.INITIAL;
        Value value6 = (Value) map.get("color-use-theme");
        StringValue stringValue = value6 != null ? new StringValue(value6) : StringValue.INITIAL;
        Value value7 = (Value) map.get("direction");
        DoubleListValue doubleListValue = value7 != null ? new DoubleListValue(value7) : DoubleListValue.INITIAL;
        Value value8 = (Value) map.get("direction-transition");
        Transition transition2 = value8 != null ? new Transition(value8) : Transition.INITIAL;
        Value value9 = (Value) map.get("intensity");
        DoubleValue doubleValue = value9 != null ? new DoubleValue(value9) : DoubleValue.INITIAL;
        Value value10 = (Value) map.get("intensity-transition");
        Transition transition3 = value10 != null ? new Transition(value10) : Transition.INITIAL;
        Value value11 = (Value) map.get("shadow-intensity");
        DoubleValue doubleValue2 = value11 != null ? new DoubleValue(value11) : DoubleValue.INITIAL;
        Value value12 = (Value) map.get("shadow-intensity-transition");
        return new DirectionalLightState(str, booleanValue, colorValue, transition, stringValue, doubleListValue, transition2, doubleValue, transition3, doubleValue2, value12 != null ? new Transition(value12) : Transition.INITIAL);
    }
}
