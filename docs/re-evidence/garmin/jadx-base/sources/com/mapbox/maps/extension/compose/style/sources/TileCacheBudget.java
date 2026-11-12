package com.mapbox.maps.extension.compose.style.sources;

import ch.qos.logback.core.CoreConstants;
import com.mapbox.bindgen.Value;
import com.mapbox.maps.TileCacheBudgetInMegabytes;
import com.mapbox.maps.TileCacheBudgetInTiles;
import com.mapbox.maps.extension.compose.style.HoldsValue;
import com.mapbox.maps.extension.compose.style.internal.ComposeTypeUtils;
import com.mapbox.maps.extension.style.expressions.generated.Expression;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u000f\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tB\r\u0012\u0006\u0010\u0002\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u000e\u001a\u00020\nHÆ\u0003J\u0013\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\nHÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\b\u0010\u0016\u001a\u00020\u0011H\u0017J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001a"}, d2 = {"Lcom/mapbox/maps/extension/compose/style/sources/TileCacheBudget;", "Lcom/mapbox/maps/extension/compose/style/HoldsValue;", "value", "Lcom/mapbox/maps/TileCacheBudgetInMegabytes;", "(Lcom/mapbox/maps/TileCacheBudgetInMegabytes;)V", "Lcom/mapbox/maps/TileCacheBudgetInTiles;", "(Lcom/mapbox/maps/TileCacheBudgetInTiles;)V", "expression", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "(Lcom/mapbox/maps/extension/style/expressions/generated/Expression;)V", "Lcom/mapbox/bindgen/Value;", "(Lcom/mapbox/bindgen/Value;)V", "getValue", "()Lcom/mapbox/bindgen/Value;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "isNotInitial", "toString", "", "Companion", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class TileCacheBudget implements HoldsValue {
    public static final TileCacheBudget DEFAULT;
    private final Value value;
    public static final TileCacheBudget INITIAL = new TileCacheBudget(new Value("TileCacheBudget.INITIAL"));

    static {
        Value valueNullValue = Value.nullValue();
        valueNullValue.getClass();
        DEFAULT = new TileCacheBudget(valueNullValue);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TileCacheBudget(TileCacheBudgetInMegabytes tileCacheBudgetInMegabytes) {
        this(ComposeTypeUtils.INSTANCE.wrapToValue(tileCacheBudgetInMegabytes));
        tileCacheBudgetInMegabytes.getClass();
    }

    public static /* synthetic */ TileCacheBudget copy$default(TileCacheBudget tileCacheBudget, Value value, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            value = tileCacheBudget.getValue();
        }
        return tileCacheBudget.copy(value);
    }

    public final Value component1() {
        return getValue();
    }

    public final TileCacheBudget copy(Value value) {
        value.getClass();
        return new TileCacheBudget(value);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof TileCacheBudget) && s.g(getValue(), ((TileCacheBudget) other).getValue());
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
        return "TileCacheBudget(value=" + getValue() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public TileCacheBudget(Value value) {
        value.getClass();
        this.value = value;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TileCacheBudget(TileCacheBudgetInTiles tileCacheBudgetInTiles) {
        this(ComposeTypeUtils.INSTANCE.wrapToValue(tileCacheBudgetInTiles));
        tileCacheBudgetInTiles.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TileCacheBudget(Expression expression) {
        this((Value) expression);
        expression.getClass();
    }
}
