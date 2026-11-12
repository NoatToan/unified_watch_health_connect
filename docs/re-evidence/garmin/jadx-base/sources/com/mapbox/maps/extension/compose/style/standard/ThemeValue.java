package com.mapbox.maps.extension.compose.style.standard;

import ch.qos.logback.core.CoreConstants;
import com.mapbox.bindgen.Value;
import com.mapbox.maps.extension.style.expressions.generated.Expression;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u000f\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\r\u0012\u0006\u0010\u0002\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0013\u001a\u00020\bHÆ\u0003J\u0013\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\n\u001a\u00020\u000b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001b"}, d2 = {"Lcom/mapbox/maps/extension/compose/style/standard/ThemeValue;", "", "value", "", "(Ljava/lang/String;)V", "expression", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "(Lcom/mapbox/maps/extension/style/expressions/generated/Expression;)V", "Lcom/mapbox/bindgen/Value;", "(Lcom/mapbox/bindgen/Value;)V", "notInitial", "", "getNotInitial$extension_compose_release", "()Z", "presetNameOrNull", "getPresetNameOrNull", "()Ljava/lang/String;", "getValue", "()Lcom/mapbox/bindgen/Value;", "component1", "copy", "equals", "other", "hashCode", "", "toString", "Companion", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class ThemeValue {
    public static final ThemeValue DEFAULT;
    public static final ThemeValue FADED;
    public static final ThemeValue INITIAL;
    public static final ThemeValue MONOCHROME;
    private final Value value;

    static {
        Value valueValueOf = Value.valueOf("ThemeValue.INITIAL");
        valueValueOf.getClass();
        INITIAL = new ThemeValue(valueValueOf);
        DEFAULT = new ThemeValue("default");
        FADED = new ThemeValue("faded");
        MONOCHROME = new ThemeValue("monochrome");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ThemeValue(String str) {
        this(new Value(str));
        str.getClass();
    }

    public static /* synthetic */ ThemeValue copy$default(ThemeValue themeValue, Value value, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            value = themeValue.value;
        }
        return themeValue.copy(value);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Value getValue() {
        return this.value;
    }

    public final ThemeValue copy(Value value) {
        value.getClass();
        return new ThemeValue(value);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ThemeValue) && s.g(this.value, ((ThemeValue) other).value);
    }

    public final boolean getNotInitial$extension_compose_release() {
        return this != INITIAL;
    }

    public final String getPresetNameOrNull() {
        Object contents = this.value.getContents();
        if (contents instanceof String) {
            return (String) contents;
        }
        return null;
    }

    public final Value getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    public String toString() {
        return "ThemeValue(value=" + this.value + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public ThemeValue(Value value) {
        value.getClass();
        this.value = value;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ThemeValue(Expression expression) {
        this((Value) expression);
        expression.getClass();
    }
}
