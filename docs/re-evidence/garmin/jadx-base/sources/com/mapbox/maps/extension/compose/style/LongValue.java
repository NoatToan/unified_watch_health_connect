package com.mapbox.maps.extension.compose.style;

import ch.qos.logback.core.CoreConstants;
import com.mapbox.bindgen.Value;
import com.mapbox.maps.extension.compose.style.internal.ComposeTypeUtils;
import com.mapbox.maps.extension.style.expressions.generated.Expression;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u000f\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\r\u0012\u0006\u0010\u0002\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u000f\u001a\u00020\bHÆ\u0003J\u0013\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\b\u0010\u0017\u001a\u00020\u0012H\u0017J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0013\u0010\n\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0002\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001b"}, d2 = {"Lcom/mapbox/maps/extension/compose/style/LongValue;", "Lcom/mapbox/maps/extension/compose/style/HoldsValue;", "value", "", "(J)V", "expression", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "(Lcom/mapbox/maps/extension/style/expressions/generated/Expression;)V", "Lcom/mapbox/bindgen/Value;", "(Lcom/mapbox/bindgen/Value;)V", "longOrNull", "getLongOrNull", "()Ljava/lang/Long;", "getValue", "()Lcom/mapbox/bindgen/Value;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "isNotInitial", "toString", "", "Companion", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class LongValue implements HoldsValue {
    public static final LongValue DEFAULT;
    private final Value value;
    public static final LongValue INITIAL = new LongValue(new Value("LongValue.INITIAL"));

    static {
        Value valueNullValue = Value.nullValue();
        valueNullValue.getClass();
        DEFAULT = new LongValue(valueNullValue);
    }

    public LongValue(long j8) {
        this(ComposeTypeUtils.INSTANCE.wrapToValue(Long.valueOf(j8)));
    }

    public static /* synthetic */ LongValue copy$default(LongValue longValue, Value value, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            value = longValue.getValue();
        }
        return longValue.copy(value);
    }

    public final Value component1() {
        return getValue();
    }

    public final LongValue copy(Value value) {
        value.getClass();
        return new LongValue(value);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof LongValue) && s.g(getValue(), ((LongValue) other).getValue());
    }

    public final Long getLongOrNull() {
        Object contents = getValue().getContents();
        Number number = contents instanceof Number ? (Number) contents : null;
        if (number != null) {
            return Long.valueOf(number.longValue());
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
        return "LongValue(value=" + getValue() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public LongValue(Value value) {
        value.getClass();
        this.value = value;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LongValue(Expression expression) {
        this((Value) expression);
        expression.getClass();
    }
}
