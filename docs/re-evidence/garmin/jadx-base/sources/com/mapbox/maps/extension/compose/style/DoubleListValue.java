package com.mapbox.maps.extension.compose.style;

import ch.qos.logback.core.CoreConstants;
import com.mapbox.bindgen.Value;
import com.mapbox.maps.extension.compose.style.internal.ComposeTypeUtils;
import com.mapbox.maps.extension.style.expressions.generated.Expression;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.h0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0013\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0013\b\u0016\u0012\n\u0010\u0002\u001a\u00020\u0003\"\u00020\u0004¢\u0006\u0002\u0010\u0005B\u0015\b\u0016\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0002\u0010\u0007B\u000f\b\u0016\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nB\r\u0012\u0006\u0010\u0002\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0012\u001a\u00020\u000bHÆ\u0003J\u0013\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\b\u0010\u001a\u001a\u00020\u0015H\u0017J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0019\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00068F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0002\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, d2 = {"Lcom/mapbox/maps/extension/compose/style/DoubleListValue;", "Lcom/mapbox/maps/extension/compose/style/HoldsValue;", "value", "", "", "([D)V", "", "(Ljava/util/List;)V", "expression", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "(Lcom/mapbox/maps/extension/style/expressions/generated/Expression;)V", "Lcom/mapbox/bindgen/Value;", "(Lcom/mapbox/bindgen/Value;)V", "doubleListOrNull", "getDoubleListOrNull", "()Ljava/util/List;", "getValue", "()Lcom/mapbox/bindgen/Value;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "isNotInitial", "toString", "", "Companion", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class DoubleListValue implements HoldsValue {
    public static final DoubleListValue DEFAULT;
    public static final DoubleListValue INITIAL;
    private final Value value;
    public static final int $stable = 8;

    static {
        Value valueValueOf = Value.valueOf("DoubleListValue.INITIAL");
        valueValueOf.getClass();
        INITIAL = new DoubleListValue(valueValueOf);
        Value valueNullValue = Value.nullValue();
        valueNullValue.getClass();
        DEFAULT = new DoubleListValue(valueNullValue);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DoubleListValue(double... dArr) {
        this(ComposeTypeUtils.INSTANCE.wrapToValue(dArr));
        dArr.getClass();
    }

    public static /* synthetic */ DoubleListValue copy$default(DoubleListValue doubleListValue, Value value, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            value = doubleListValue.getValue();
        }
        return doubleListValue.copy(value);
    }

    public final Value component1() {
        return getValue();
    }

    public final DoubleListValue copy(Value value) {
        value.getClass();
        return new DoubleListValue(value);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DoubleListValue) && s.g(getValue(), ((DoubleListValue) other).getValue());
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [boolean] */
    public final List<Double> getDoubleListOrNull() {
        if (getValue().getContents() instanceof ArrayList) {
            Object contents = getValue().getContents();
            contents.getClass();
            ArrayList arrayList = (ArrayList) contents;
            ?? G = s.g(h0.d0(arrayList), "array");
            if (arrayList.size() > G) {
                ArrayList arrayList2 = new ArrayList();
                List listSubList = arrayList.subList(G == true ? 1 : 0, arrayList.size());
                listSubList.getClass();
                for (Object obj : listSubList) {
                    Value value = obj instanceof Value ? (Value) obj : null;
                    Object contents2 = value != null ? value.getContents() : null;
                    Double d14 = contents2 instanceof Double ? (Double) contents2 : null;
                    if (d14 == null) {
                        return null;
                    }
                    arrayList2.add(Double.valueOf(d14.doubleValue()));
                }
                return h0.b1(arrayList2);
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
        return "DoubleListValue(value=" + getValue() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public DoubleListValue(Value value) {
        value.getClass();
        this.value = value;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DoubleListValue(List<Double> list) {
        this(ComposeTypeUtils.INSTANCE.wrapToValue(list));
        list.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DoubleListValue(Expression expression) {
        this((Value) expression);
        expression.getClass();
    }
}
