package com.mapbox.maps.extension.compose.style;

import ch.qos.logback.core.CoreConstants;
import com.mapbox.bindgen.Value;
import com.mapbox.maps.extension.compose.style.internal.ComposeTypeUtils;
import com.mapbox.maps.extension.style.expressions.generated.Expression;
import com.mapbox.maps.extension.style.utils.ColorUtils;
import o4.d0;
import o4.f0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0001!B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bB\u0014\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\tø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u000b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u000fR\u001c\u0010 \u001a\u0004\u0018\u00010\t8Fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\""}, d2 = {"Lcom/mapbox/maps/extension/compose/style/ColorValue;", "Lcom/mapbox/maps/extension/compose/style/HoldsValue;", "Lcom/mapbox/bindgen/Value;", "value", "<init>", "(Lcom/mapbox/bindgen/Value;)V", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "expression", "(Lcom/mapbox/maps/extension/style/expressions/generated/Expression;)V", "Lo4/d0;", "(JLkotlin/jvm/internal/j;)V", "", "isNotInitial", "()Z", "component1", "()Lcom/mapbox/bindgen/Value;", "copy", "(Lcom/mapbox/bindgen/Value;)Lcom/mapbox/maps/extension/compose/style/ColorValue;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/mapbox/bindgen/Value;", "getValue", "getColorOrNull-QN2ZGVo", "()Lo4/d0;", "colorOrNull", "Companion", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class ColorValue implements HoldsValue {
    public static final ColorValue DEFAULT;
    public static final ColorValue INITIAL;
    private final Value value;

    static {
        Value valueValueOf = Value.valueOf("ColorValue.INITIAL");
        valueValueOf.getClass();
        INITIAL = new ColorValue(valueValueOf);
        Value valueNullValue = Value.nullValue();
        valueNullValue.getClass();
        DEFAULT = new ColorValue(valueNullValue);
    }

    private ColorValue(long j8) {
        this(ComposeTypeUtils.INSTANCE.wrapToValue(d0.a(j8)));
    }

    public static /* synthetic */ ColorValue copy$default(ColorValue colorValue, Value value, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            value = colorValue.getValue();
        }
        return colorValue.copy(value);
    }

    public final Value component1() {
        return getValue();
    }

    public final ColorValue copy(Value value) {
        value.getClass();
        return new ColorValue(value);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ColorValue) && s.g(getValue(), ((ColorValue) other).getValue());
    }

    /* JADX INFO: renamed from: getColorOrNull-QN2ZGVo, reason: not valid java name */
    public final d0 m215getColorOrNullQN2ZGVo() {
        Integer numRgbaExpressionToColorInt;
        if (!(getValue().getContents() instanceof String)) {
            if (!(getValue() instanceof Expression) || (numRgbaExpressionToColorInt = ColorUtils.INSTANCE.rgbaExpressionToColorInt((Expression) getValue())) == null) {
                return null;
            }
            return d0.a(f0.b(numRgbaExpressionToColorInt.intValue()));
        }
        ColorUtils colorUtils = ColorUtils.INSTANCE;
        Object contents = getValue().getContents();
        contents.getClass();
        Integer numRgbaToColor = colorUtils.rgbaToColor((String) contents);
        if (numRgbaToColor != null) {
            return d0.a(f0.b(numRgbaToColor.intValue()));
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
        return "ColorValue(value=" + getValue() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public ColorValue(Value value) {
        value.getClass();
        this.value = value;
    }

    public /* synthetic */ ColorValue(long j8, j jVar) {
        this(j8);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ColorValue(Expression expression) {
        this((Value) expression);
        expression.getClass();
    }
}
