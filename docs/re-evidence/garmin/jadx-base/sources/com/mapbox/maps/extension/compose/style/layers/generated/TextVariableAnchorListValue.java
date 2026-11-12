package com.mapbox.maps.extension.compose.style.layers.generated;

import ch.qos.logback.core.CoreConstants;
import com.mapbox.bindgen.Value;
import com.mapbox.maps.extension.compose.style.HoldsValue;
import com.mapbox.maps.extension.compose.style.internal.ComposeTypeUtils;
import com.mapbox.maps.extension.style.expressions.generated.Expression;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0015\b\u0016\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005B\u000f\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB\r\u0012\u0006\u0010\u0002\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\r\u001a\u00020\tHÆ\u0003J\u0013\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\tHÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\b\u0010\u0015\u001a\u00020\u0010H\u0017J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/mapbox/maps/extension/compose/style/layers/generated/TextVariableAnchorListValue;", "Lcom/mapbox/maps/extension/compose/style/HoldsValue;", "value", "", "Lcom/mapbox/maps/extension/compose/style/layers/generated/TextVariableAnchor;", "(Ljava/util/List;)V", "expression", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "(Lcom/mapbox/maps/extension/style/expressions/generated/Expression;)V", "Lcom/mapbox/bindgen/Value;", "(Lcom/mapbox/bindgen/Value;)V", "getValue", "()Lcom/mapbox/bindgen/Value;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "isNotInitial", "toString", "", "Companion", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class TextVariableAnchorListValue implements HoldsValue {
    public static final TextVariableAnchorListValue DEFAULT;
    public static final TextVariableAnchorListValue INITIAL;
    private final Value value;

    static {
        Value valueValueOf = Value.valueOf("TextVariableAnchorListValue.INITIAL");
        valueValueOf.getClass();
        INITIAL = new TextVariableAnchorListValue(valueValueOf);
        Value valueNullValue = Value.nullValue();
        valueNullValue.getClass();
        DEFAULT = new TextVariableAnchorListValue(valueNullValue);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextVariableAnchorListValue(List<TextVariableAnchor> list) {
        this(ComposeTypeUtils.INSTANCE.wrapToValue(list));
        list.getClass();
    }

    public static /* synthetic */ TextVariableAnchorListValue copy$default(TextVariableAnchorListValue textVariableAnchorListValue, Value value, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            value = textVariableAnchorListValue.getValue();
        }
        return textVariableAnchorListValue.copy(value);
    }

    public final Value component1() {
        return getValue();
    }

    public final TextVariableAnchorListValue copy(Value value) {
        value.getClass();
        return new TextVariableAnchorListValue(value);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof TextVariableAnchorListValue) && s.g(getValue(), ((TextVariableAnchorListValue) other).getValue());
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
        return "TextVariableAnchorListValue(value=" + getValue() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public TextVariableAnchorListValue(Value value) {
        value.getClass();
        this.value = value;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextVariableAnchorListValue(Expression expression) {
        this((Value) expression);
        expression.getClass();
    }
}
