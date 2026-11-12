package com.mapbox.maps.extension.compose.style.lights.generated;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mapbox.bindgen.Value;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.maps.extension.compose.style.ColorValue;
import com.mapbox.maps.extension.compose.style.DoubleValue;
import com.mapbox.maps.extension.compose.style.StringValue;
import com.mapbox.maps.extension.compose.style.Transition;
import e23.l;
import java.util.HashMap;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/mapbox/maps/extension/compose/style/lights/generated/AmbientLightState;", "holder", "Lcom/mapbox/maps/extension/compose/style/lights/generated/AmbientLightState$Holder;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
public final class AmbientLightState$Companion$Saver$2 extends w implements l<AmbientLightState.Holder, AmbientLightState> {
    public static final AmbientLightState$Companion$Saver$2 INSTANCE = new AmbientLightState$Companion$Saver$2();

    public AmbientLightState$Companion$Saver$2() {
        super(1);
    }

    @Override // e23.l
    public final AmbientLightState invoke(AmbientLightState.Holder holder) {
        holder.getClass();
        MapboxLogger.logD("AmbientLightState", "restore: " + holder);
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
        Value value3 = (Value) map.get(TtmlNode.ATTR_TTS_COLOR);
        ColorValue colorValue = value3 != null ? new ColorValue(value3) : ColorValue.INITIAL;
        Value value4 = (Value) map.get("color-transition");
        Transition transition = value4 != null ? new Transition(value4) : Transition.INITIAL;
        Value value5 = (Value) map.get("color-use-theme");
        StringValue stringValue = value5 != null ? new StringValue(value5) : StringValue.INITIAL;
        Value value6 = (Value) map.get("intensity");
        DoubleValue doubleValue = value6 != null ? new DoubleValue(value6) : DoubleValue.INITIAL;
        Value value7 = (Value) map.get("intensity-transition");
        return new AmbientLightState(str, colorValue, transition, stringValue, doubleValue, value7 != null ? new Transition(value7) : Transition.INITIAL);
    }
}
