package com.mapbox.maps.extension.compose.style.sources;

import ch.qos.logback.core.CoreConstants;
import com.mapbox.bindgen.Value;
import com.mapbox.maps.extension.compose.style.HoldsValue;
import com.mapbox.maps.extension.compose.style.internal.ComposeTypeUtils;
import com.mapbox.maps.extension.style.expressions.generated.Expression;
import com.mapbox.maps.extension.style.types.PromoteId;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005B\u001b\b\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bB\r\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u000e\u001a\u00020\nHÆ\u0003J\u0013\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\b\u0010\u0016\u001a\u00020\u0011H\u0017J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/mapbox/maps/extension/compose/style/sources/PromoteIdValue;", "Lcom/mapbox/maps/extension/compose/style/HoldsValue;", "propertyName", "", "sourceId", "(Ljava/lang/String;Ljava/lang/String;)V", "expression", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "(Lcom/mapbox/maps/extension/style/expressions/generated/Expression;Ljava/lang/String;)V", "value", "Lcom/mapbox/bindgen/Value;", "(Lcom/mapbox/bindgen/Value;)V", "getValue", "()Lcom/mapbox/bindgen/Value;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "isNotInitial", "toString", "Companion", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class PromoteIdValue implements HoldsValue {
    public static final PromoteIdValue DEFAULT;
    private final Value value;
    public static final PromoteIdValue INITIAL = new PromoteIdValue(new Value("PromoteIdValue.INITIAL"));

    static {
        Value valueNullValue = Value.nullValue();
        valueNullValue.getClass();
        DEFAULT = new PromoteIdValue(valueNullValue);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PromoteIdValue(String str, String str2) {
        this(ComposeTypeUtils.INSTANCE.wrapToValue(new PromoteId(str, str2)));
        str.getClass();
    }

    public static /* synthetic */ PromoteIdValue copy$default(PromoteIdValue promoteIdValue, Value value, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            value = promoteIdValue.getValue();
        }
        return promoteIdValue.copy(value);
    }

    public final Value component1() {
        return getValue();
    }

    public final PromoteIdValue copy(Value value) {
        value.getClass();
        return new PromoteIdValue(value);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PromoteIdValue) && s.g(getValue(), ((PromoteIdValue) other).getValue());
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
        return "PromoteIdValue(value=" + getValue() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public PromoteIdValue(Value value) {
        value.getClass();
        this.value = value;
    }

    public /* synthetic */ PromoteIdValue(String str, String str2, int i14, j jVar) {
        this(str, (i14 & 2) != 0 ? null : str2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PromoteIdValue(Expression expression) {
        this(expression, (String) null, 2, (j) (0 == true ? 1 : 0));
        expression.getClass();
    }

    public /* synthetic */ PromoteIdValue(Expression expression, String str, int i14, j jVar) {
        this(expression, (i14 & 2) != 0 ? null : str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PromoteIdValue(Expression expression, String str) {
        this(ComposeTypeUtils.INSTANCE.wrapToValue(new PromoteId(expression, str)));
        expression.getClass();
    }
}
