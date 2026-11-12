package com.mapbox.maps.extension.compose.style.layers.generated;

import ch.qos.logback.core.CoreConstants;
import com.mapbox.bindgen.Value;
import com.mapbox.maps.extension.compose.style.HoldsValue;
import com.mapbox.maps.extension.style.expressions.generated.Expression;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\n\u001a\u00020\u0006HÆ\u0003J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\b\u0010\u0012\u001a\u00020\rH\u0017J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/mapbox/maps/extension/compose/style/layers/generated/HillshadeIlluminationAnchorValue;", "Lcom/mapbox/maps/extension/compose/style/HoldsValue;", "expression", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "(Lcom/mapbox/maps/extension/style/expressions/generated/Expression;)V", "value", "Lcom/mapbox/bindgen/Value;", "(Lcom/mapbox/bindgen/Value;)V", "getValue", "()Lcom/mapbox/bindgen/Value;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "isNotInitial", "toString", "", "Companion", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class HillshadeIlluminationAnchorValue implements HoldsValue {
    public static final HillshadeIlluminationAnchorValue DEFAULT;
    public static final HillshadeIlluminationAnchorValue INITIAL;
    public static final HillshadeIlluminationAnchorValue MAP;
    public static final HillshadeIlluminationAnchorValue VIEWPORT;
    private final Value value;

    static {
        Value valueValueOf = Value.valueOf("HillshadeIlluminationAnchorValue.INITIAL");
        valueValueOf.getClass();
        INITIAL = new HillshadeIlluminationAnchorValue(valueValueOf);
        Value valueNullValue = Value.nullValue();
        valueNullValue.getClass();
        DEFAULT = new HillshadeIlluminationAnchorValue(valueNullValue);
        MAP = new HillshadeIlluminationAnchorValue(new Value("map"));
        VIEWPORT = new HillshadeIlluminationAnchorValue(new Value("viewport"));
    }

    public HillshadeIlluminationAnchorValue(Value value) {
        value.getClass();
        this.value = value;
    }

    public static /* synthetic */ HillshadeIlluminationAnchorValue copy$default(HillshadeIlluminationAnchorValue hillshadeIlluminationAnchorValue, Value value, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            value = hillshadeIlluminationAnchorValue.getValue();
        }
        return hillshadeIlluminationAnchorValue.copy(value);
    }

    public final Value component1() {
        return getValue();
    }

    public final HillshadeIlluminationAnchorValue copy(Value value) {
        value.getClass();
        return new HillshadeIlluminationAnchorValue(value);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof HillshadeIlluminationAnchorValue) && s.g(getValue(), ((HillshadeIlluminationAnchorValue) other).getValue());
    }

    @Override // com.mapbox.maps.extension.compose.style.HoldsValue
    public Value getValue() {
        return this.value;
    }

    public int hashCode() {
        return getValue().hashCode();
    }

    @Override // com.mapbox.maps.extension.compose.style.HoldsValue
    public boolean isNotInitial() {
        return this != INITIAL;
    }

    public String toString() {
        return "HillshadeIlluminationAnchorValue(value=" + getValue() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HillshadeIlluminationAnchorValue(Expression expression) {
        this((Value) expression);
        expression.getClass();
    }
}
