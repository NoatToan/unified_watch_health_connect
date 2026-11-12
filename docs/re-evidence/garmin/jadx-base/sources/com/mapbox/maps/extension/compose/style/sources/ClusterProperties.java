package com.mapbox.maps.extension.compose.style.sources;

import ch.qos.logback.core.CoreConstants;
import com.mapbox.bindgen.Value;
import com.mapbox.maps.extension.compose.style.HoldsValue;
import com.mapbox.maps.extension.compose.style.internal.ComposeTypeUtils;
import com.mapbox.maps.extension.style.expressions.generated.Expression;
import java.util.HashMap;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B+\b\u0016\u0012\"\u0010\u0002\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005`\u0006¢\u0006\u0002\u0010\u0007B\u000f\b\u0016\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nB\r\u0012\u0006\u0010\u0002\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u000f\u001a\u00020\u000bHÆ\u0003J\u0013\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\b\u0010\u0016\u001a\u00020\u0012H\u0017J\t\u0010\u0017\u001a\u00020\u0004HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/mapbox/maps/extension/compose/style/sources/ClusterProperties;", "Lcom/mapbox/maps/extension/compose/style/HoldsValue;", "value", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "(Ljava/util/HashMap;)V", "expression", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "(Lcom/mapbox/maps/extension/style/expressions/generated/Expression;)V", "Lcom/mapbox/bindgen/Value;", "(Lcom/mapbox/bindgen/Value;)V", "getValue", "()Lcom/mapbox/bindgen/Value;", "component1", "copy", "equals", "", "other", "hashCode", "", "isNotInitial", "toString", "Companion", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class ClusterProperties implements HoldsValue {
    public static final ClusterProperties DEFAULT;
    private final Value value;
    public static final ClusterProperties INITIAL = new ClusterProperties(new Value("ClusterProperties.INITIAL"));

    static {
        Value valueNullValue = Value.nullValue();
        valueNullValue.getClass();
        DEFAULT = new ClusterProperties(valueNullValue);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ClusterProperties(HashMap<String, Object> map) {
        this(ComposeTypeUtils.INSTANCE.wrapToValue(map));
        map.getClass();
    }

    public static /* synthetic */ ClusterProperties copy$default(ClusterProperties clusterProperties, Value value, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            value = clusterProperties.getValue();
        }
        return clusterProperties.copy(value);
    }

    public final Value component1() {
        return getValue();
    }

    public final ClusterProperties copy(Value value) {
        value.getClass();
        return new ClusterProperties(value);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ClusterProperties) && s.g(getValue(), ((ClusterProperties) other).getValue());
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
        return "ClusterProperties(value=" + getValue() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public ClusterProperties(Value value) {
        value.getClass();
        this.value = value;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ClusterProperties(Expression expression) {
        this((Value) expression);
        expression.getClass();
    }
}
