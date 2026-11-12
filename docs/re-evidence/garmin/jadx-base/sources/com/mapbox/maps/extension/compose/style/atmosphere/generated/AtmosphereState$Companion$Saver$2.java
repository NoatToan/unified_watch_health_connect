package com.mapbox.maps.extension.compose.style.atmosphere.generated;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mapbox.bindgen.Value;
import com.mapbox.maps.extension.compose.style.ColorValue;
import com.mapbox.maps.extension.compose.style.DoubleRangeValue;
import com.mapbox.maps.extension.compose.style.DoubleValue;
import com.mapbox.maps.extension.compose.style.StringValue;
import com.mapbox.maps.extension.compose.style.Transition;
import com.mapbox.maps.extension.compose.style.atmosphere.AtmosphereStateApplier;
import e23.l;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/mapbox/maps/extension/compose/style/atmosphere/generated/AtmosphereState;", "holder", "Lcom/mapbox/maps/extension/compose/style/atmosphere/generated/AtmosphereState$Holder;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
public final class AtmosphereState$Companion$Saver$2 extends w implements l<AtmosphereState.Holder, AtmosphereState> {
    public static final AtmosphereState$Companion$Saver$2 INSTANCE = new AtmosphereState$Companion$Saver$2();

    public AtmosphereState$Companion$Saver$2() {
        super(1);
    }

    @Override // e23.l
    public final AtmosphereState invoke(AtmosphereState.Holder holder) {
        holder.getClass();
        AtmosphereStateApplier atmosphereStateApplier = new AtmosphereStateApplier(holder.getSavedProperties(), null, 2, null);
        Value value = holder.getSavedProperties().get(TtmlNode.ATTR_TTS_COLOR);
        ColorValue colorValue = value != null ? new ColorValue(value) : ColorValue.INITIAL;
        Value value2 = holder.getSavedProperties().get("color-transition");
        Transition transition = value2 != null ? new Transition(value2) : Transition.INITIAL;
        Value value3 = holder.getSavedProperties().get("color-use-theme");
        StringValue stringValue = value3 != null ? new StringValue(value3) : StringValue.INITIAL;
        Value value4 = holder.getSavedProperties().get("high-color");
        ColorValue colorValue2 = value4 != null ? new ColorValue(value4) : ColorValue.INITIAL;
        Value value5 = holder.getSavedProperties().get("high-color-transition");
        Transition transition2 = value5 != null ? new Transition(value5) : Transition.INITIAL;
        Value value6 = holder.getSavedProperties().get("high-color-use-theme");
        StringValue stringValue2 = value6 != null ? new StringValue(value6) : StringValue.INITIAL;
        Value value7 = holder.getSavedProperties().get("horizon-blend");
        DoubleValue doubleValue = value7 != null ? new DoubleValue(value7) : DoubleValue.INITIAL;
        Value value8 = holder.getSavedProperties().get("horizon-blend-transition");
        Transition transition3 = value8 != null ? new Transition(value8) : Transition.INITIAL;
        Value value9 = holder.getSavedProperties().get("range");
        DoubleRangeValue doubleRangeValue = value9 != null ? new DoubleRangeValue(value9) : DoubleRangeValue.INITIAL;
        Value value10 = holder.getSavedProperties().get("range-transition");
        Transition transition4 = value10 != null ? new Transition(value10) : Transition.INITIAL;
        Value value11 = holder.getSavedProperties().get("space-color");
        ColorValue colorValue3 = value11 != null ? new ColorValue(value11) : ColorValue.INITIAL;
        Value value12 = holder.getSavedProperties().get("space-color-transition");
        Transition transition5 = value12 != null ? new Transition(value12) : Transition.INITIAL;
        Value value13 = holder.getSavedProperties().get("space-color-use-theme");
        StringValue stringValue3 = value13 != null ? new StringValue(value13) : StringValue.INITIAL;
        Value value14 = holder.getSavedProperties().get("star-intensity");
        DoubleValue doubleValue2 = value14 != null ? new DoubleValue(value14) : DoubleValue.INITIAL;
        Value value15 = holder.getSavedProperties().get("star-intensity-transition");
        Transition transition6 = value15 != null ? new Transition(value15) : Transition.INITIAL;
        Value value16 = holder.getSavedProperties().get("vertical-range");
        DoubleRangeValue doubleRangeValue2 = value16 != null ? new DoubleRangeValue(value16) : DoubleRangeValue.INITIAL;
        Value value17 = holder.getSavedProperties().get("vertical-range-transition");
        return new AtmosphereState(atmosphereStateApplier, colorValue, transition, stringValue, colorValue2, transition2, stringValue2, doubleValue, transition3, doubleRangeValue, transition4, colorValue3, transition5, stringValue3, doubleValue2, transition6, doubleRangeValue2, value17 != null ? new Transition(value17) : Transition.INITIAL, null);
    }
}
