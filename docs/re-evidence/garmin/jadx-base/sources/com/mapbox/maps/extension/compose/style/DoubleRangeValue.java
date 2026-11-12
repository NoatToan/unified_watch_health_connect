package com.mapbox.maps.extension.compose.style;

import android.util.Range;
import ch.qos.logback.core.CoreConstants;
import com.mapbox.bindgen.Value;
import com.mapbox.maps.extension.compose.style.internal.ComposeTypeUtils;
import com.mapbox.maps.extension.style.expressions.generated.Expression;
import java.util.ArrayList;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.x;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005B\u0015\b\u0016\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0002\u0010\bB\u000f\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bB\r\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\t\u0010\u0014\u001a\u00020\rHÆ\u0003J\u0013\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\b\u0010\u001c\u001a\u00020\u0017H\u0017J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0019\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00078F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lcom/mapbox/maps/extension/compose/style/DoubleRangeValue;", "Lcom/mapbox/maps/extension/compose/style/HoldsValue;", "lower", "", "upper", "(DD)V", "range", "Landroid/util/Range;", "(Landroid/util/Range;)V", "expression", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "(Lcom/mapbox/maps/extension/style/expressions/generated/Expression;)V", "value", "Lcom/mapbox/bindgen/Value;", "(Lcom/mapbox/bindgen/Value;)V", "rangeOrNull", "getRangeOrNull", "()Landroid/util/Range;", "getValue", "()Lcom/mapbox/bindgen/Value;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "isNotInitial", "toString", "", "Companion", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class DoubleRangeValue implements HoldsValue {
    public static final DoubleRangeValue DEFAULT;
    public static final DoubleRangeValue INITIAL;
    private final Value value;
    public static final int $stable = 8;

    static {
        Value valueValueOf = Value.valueOf("DoubleRangeValue.INITIAL");
        valueValueOf.getClass();
        INITIAL = new DoubleRangeValue(valueValueOf);
        Value valueNullValue = Value.nullValue();
        valueNullValue.getClass();
        DEFAULT = new DoubleRangeValue(valueNullValue);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DoubleRangeValue(Range<Double> range) {
        range.getClass();
        Object lower = range.getLower();
        lower.getClass();
        double dDoubleValue = ((Number) lower).doubleValue();
        Object upper = range.getUpper();
        upper.getClass();
        this(dDoubleValue, ((Number) upper).doubleValue());
    }

    public static /* synthetic */ DoubleRangeValue copy$default(DoubleRangeValue doubleRangeValue, Value value, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            value = doubleRangeValue.getValue();
        }
        return doubleRangeValue.copy(value);
    }

    public final Value component1() {
        return getValue();
    }

    public final DoubleRangeValue copy(Value value) {
        value.getClass();
        return new DoubleRangeValue(value);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DoubleRangeValue) && s.g(getValue(), ((DoubleRangeValue) other).getValue());
    }

    public final Range<Double> getRangeOrNull() {
        if (getValue().getContents() instanceof ArrayList) {
            Object contents = getValue().getContents();
            contents.getClass();
            ArrayList arrayList = (ArrayList) contents;
            boolean zG = s.g(h0.d0(arrayList), "array");
            if (arrayList.size() == (zG ? 1 : 0) + 2) {
                Object obj = arrayList.get(zG ? 1 : 0);
                Value value = obj instanceof Value ? (Value) obj : null;
                Object contents2 = value != null ? value.getContents() : null;
                Double d14 = contents2 instanceof Double ? (Double) contents2 : null;
                Object obj2 = arrayList.get((zG ? 1 : 0) + 1);
                Value value2 = obj2 instanceof Value ? (Value) obj2 : null;
                Object contents3 = value2 != null ? value2.getContents() : null;
                Double d15 = contents3 instanceof Double ? (Double) contents3 : null;
                if (d15 != null && d14 != null) {
                    try {
                        return new Range<>(d14, d15);
                    } catch (IllegalArgumentException unused) {
                    }
                }
            }
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
        return "DoubleRangeValue(value=" + getValue() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public DoubleRangeValue(double d14, double d15) {
        this(ComposeTypeUtils.INSTANCE.wrapToValue(x.k(Double.valueOf(d14), Double.valueOf(d15))));
    }

    public DoubleRangeValue(Value value) {
        value.getClass();
        this.value = value;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DoubleRangeValue(Expression expression) {
        this((Value) expression);
        expression.getClass();
    }
}
