package com.mapbox.maps.extension.compose.style;

import ch.qos.logback.core.CoreConstants;
import com.mapbox.bindgen.Value;
import com.mapbox.maps.extension.compose.style.internal.ComposeTypeUtils;
import com.mapbox.maps.extension.style.expressions.generated.Expression;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u000f\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\r\u0012\u0006\u0010\u0002\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u000f\u001a\u00020\bHÆ\u0003J\u0013\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\b\u0010\u0016\u001a\u00020\u0003H\u0017J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0013\u0010\n\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0002\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/mapbox/maps/extension/compose/style/BooleanValue;", "Lcom/mapbox/maps/extension/compose/style/HoldsValue;", "value", "", "(Z)V", "expression", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "(Lcom/mapbox/maps/extension/style/expressions/generated/Expression;)V", "Lcom/mapbox/bindgen/Value;", "(Lcom/mapbox/bindgen/Value;)V", "booleanOrNull", "getBooleanOrNull", "()Ljava/lang/Boolean;", "getValue", "()Lcom/mapbox/bindgen/Value;", "component1", "copy", "equals", "other", "", "hashCode", "", "isNotInitial", "toString", "", "Companion", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class BooleanValue implements HoldsValue {
    public static final BooleanValue DEFAULT;
    private final Value value;
    public static final BooleanValue INITIAL = new BooleanValue(new Value("BooleanValue.INITIAL"));

    static {
        Value valueNullValue = Value.nullValue();
        valueNullValue.getClass();
        DEFAULT = new BooleanValue(valueNullValue);
    }

    public BooleanValue(boolean z14) {
        this(ComposeTypeUtils.INSTANCE.wrapToValue(Boolean.valueOf(z14)));
    }

    public static /* synthetic */ BooleanValue copy$default(BooleanValue booleanValue, Value value, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            value = booleanValue.getValue();
        }
        return booleanValue.copy(value);
    }

    public final Value component1() {
        return getValue();
    }

    public final BooleanValue copy(Value value) {
        value.getClass();
        return new BooleanValue(value);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof BooleanValue) && s.g(getValue(), ((BooleanValue) other).getValue());
    }

    public final Boolean getBooleanOrNull() {
        Object contents = getValue().getContents();
        if (contents instanceof Boolean) {
            return (Boolean) contents;
        }
        return null;
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
        return "BooleanValue(value=" + getValue() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public BooleanValue(Value value) {
        value.getClass();
        this.value = value;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BooleanValue(Expression expression) {
        this((Value) expression);
        expression.getClass();
    }
}
