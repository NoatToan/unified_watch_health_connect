package com.mapbox.maps.extension.compose.style.precipitations.generated;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mapbox.bindgen.Value;
import com.mapbox.maps.extension.compose.style.ColorValue;
import com.mapbox.maps.extension.compose.style.DoubleListValue;
import com.mapbox.maps.extension.compose.style.DoubleValue;
import com.mapbox.maps.extension.compose.style.StringValue;
import com.mapbox.maps.extension.compose.style.Transition;
import com.mapbox.maps.extension.compose.style.precipitations.SnowStateApplier;
import e23.l;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/mapbox/maps/extension/compose/style/precipitations/generated/SnowState;", "holder", "Lcom/mapbox/maps/extension/compose/style/precipitations/generated/SnowState$Holder;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
public final class SnowState$Companion$Saver$2 extends w implements l<SnowState.Holder, SnowState> {
    public static final SnowState$Companion$Saver$2 INSTANCE = new SnowState$Companion$Saver$2();

    public SnowState$Companion$Saver$2() {
        super(1);
    }

    @Override // e23.l
    public final SnowState invoke(SnowState.Holder holder) {
        holder.getClass();
        SnowStateApplier snowStateApplier = new SnowStateApplier(holder.getSavedProperties(), null, holder.getEnabled(), 2, null);
        Value value = holder.getSavedProperties().get("center-thinning");
        DoubleValue doubleValue = value != null ? new DoubleValue(value) : DoubleValue.INITIAL;
        Value value2 = holder.getSavedProperties().get("center-thinning-transition");
        Transition transition = value2 != null ? new Transition(value2) : Transition.INITIAL;
        Value value3 = holder.getSavedProperties().get(TtmlNode.ATTR_TTS_COLOR);
        ColorValue colorValue = value3 != null ? new ColorValue(value3) : ColorValue.INITIAL;
        Value value4 = holder.getSavedProperties().get("color-transition");
        Transition transition2 = value4 != null ? new Transition(value4) : Transition.INITIAL;
        Value value5 = holder.getSavedProperties().get("color-use-theme");
        StringValue stringValue = value5 != null ? new StringValue(value5) : StringValue.INITIAL;
        Value value6 = holder.getSavedProperties().get("density");
        DoubleValue doubleValue2 = value6 != null ? new DoubleValue(value6) : DoubleValue.INITIAL;
        Value value7 = holder.getSavedProperties().get("density-transition");
        Transition transition3 = value7 != null ? new Transition(value7) : Transition.INITIAL;
        Value value8 = holder.getSavedProperties().get("direction");
        DoubleListValue doubleListValue = value8 != null ? new DoubleListValue(value8) : DoubleListValue.INITIAL;
        Value value9 = holder.getSavedProperties().get("direction-transition");
        Transition transition4 = value9 != null ? new Transition(value9) : Transition.INITIAL;
        Value value10 = holder.getSavedProperties().get("flake-size");
        DoubleValue doubleValue3 = value10 != null ? new DoubleValue(value10) : DoubleValue.INITIAL;
        Value value11 = holder.getSavedProperties().get("flake-size-transition");
        Transition transition5 = value11 != null ? new Transition(value11) : Transition.INITIAL;
        Value value12 = holder.getSavedProperties().get("intensity");
        DoubleValue doubleValue4 = value12 != null ? new DoubleValue(value12) : DoubleValue.INITIAL;
        Value value13 = holder.getSavedProperties().get("intensity-transition");
        Transition transition6 = value13 != null ? new Transition(value13) : Transition.INITIAL;
        Value value14 = holder.getSavedProperties().get("opacity");
        DoubleValue doubleValue5 = value14 != null ? new DoubleValue(value14) : DoubleValue.INITIAL;
        Value value15 = holder.getSavedProperties().get("opacity-transition");
        Transition transition7 = value15 != null ? new Transition(value15) : Transition.INITIAL;
        Value value16 = holder.getSavedProperties().get("vignette");
        DoubleValue doubleValue6 = value16 != null ? new DoubleValue(value16) : DoubleValue.INITIAL;
        Value value17 = holder.getSavedProperties().get("vignette-color");
        ColorValue colorValue2 = value17 != null ? new ColorValue(value17) : ColorValue.INITIAL;
        Value value18 = holder.getSavedProperties().get("vignette-color-transition");
        Transition transition8 = value18 != null ? new Transition(value18) : Transition.INITIAL;
        Value value19 = holder.getSavedProperties().get("vignette-color-use-theme");
        StringValue stringValue2 = value19 != null ? new StringValue(value19) : StringValue.INITIAL;
        Value value20 = holder.getSavedProperties().get("vignette-transition");
        return new SnowState(snowStateApplier, doubleValue, transition, colorValue, transition2, stringValue, doubleValue2, transition3, doubleListValue, transition4, doubleValue3, transition5, doubleValue4, transition6, doubleValue5, transition7, doubleValue6, colorValue2, transition8, stringValue2, value20 != null ? new Transition(value20) : Transition.INITIAL, null);
    }
}
