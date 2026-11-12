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
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u001b\b\u0016\u0012\u0012\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\"\u00020\u0004¢\u0006\u0002\u0010\u0005B\u0015\b\u0016\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0002\u0010\u0007B\u000f\b\u0016\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nB\r\u0012\u0006\u0010\u0002\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0012\u001a\u00020\u000bHÆ\u0003J\u0013\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\b\u0010\u001a\u001a\u00020\u0015H\u0017J\t\u0010\u001b\u001a\u00020\u0004HÖ\u0001R\u0019\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00068F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0002\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lcom/mapbox/maps/extension/compose/style/StringListValue;", "Lcom/mapbox/maps/extension/compose/style/HoldsValue;", "value", "", "", "([Ljava/lang/String;)V", "", "(Ljava/util/List;)V", "expression", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "(Lcom/mapbox/maps/extension/style/expressions/generated/Expression;)V", "Lcom/mapbox/bindgen/Value;", "(Lcom/mapbox/bindgen/Value;)V", "stringListOrNull", "getStringListOrNull", "()Ljava/util/List;", "getValue", "()Lcom/mapbox/bindgen/Value;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "isNotInitial", "toString", "Companion", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class StringListValue implements HoldsValue {
    public static final StringListValue DEFAULT;
    private final Value value;
    public static final StringListValue INITIAL = new StringListValue(new Value("StringListValue.INITIAL"));

    static {
        Value valueNullValue = Value.nullValue();
        valueNullValue.getClass();
        DEFAULT = new StringListValue(valueNullValue);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StringListValue(String... strArr) {
        this(ComposeTypeUtils.INSTANCE.wrapToValue(strArr));
        strArr.getClass();
    }

    public static /* synthetic */ StringListValue copy$default(StringListValue stringListValue, Value value, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            value = stringListValue.getValue();
        }
        return stringListValue.copy(value);
    }

    public final Value component1() {
        return getValue();
    }

    public final StringListValue copy(Value value) {
        value.getClass();
        return new StringListValue(value);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof StringListValue) && s.g(getValue(), ((StringListValue) other).getValue());
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [boolean] */
    public final List<String> getStringListOrNull() {
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
                    String str = contents2 instanceof String ? (String) contents2 : null;
                    if (str == null) {
                        return null;
                    }
                    arrayList2.add(str);
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
        return "StringListValue(value=" + getValue() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public StringListValue(Value value) {
        value.getClass();
        this.value = value;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StringListValue(List<String> list) {
        this(ComposeTypeUtils.INSTANCE.wrapToValue(list));
        list.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StringListValue(Expression expression) {
        this((Value) expression);
        expression.getClass();
    }
}
