package com.mapbox.maps.extension.compose.style.layers;

import ch.qos.logback.core.CoreConstants;
import com.mapbox.bindgen.Value;
import com.mapbox.maps.MapboxExperimental;
import com.mapbox.maps.extension.compose.style.internal.ComposeTypeUtils;
import com.mapbox.maps.extension.style.expressions.generated.Expression;
import o13.p;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0001*B)\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\tB\u0019\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\fB\u0011\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0007\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u001e\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J2\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u0011R%\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010\u0013R\u0013\u0010$\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b#\u0010\u0017R\u0013\u0010&\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b%\u0010\u0017R\u0014\u0010)\u001a\u00020\u001c8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006+"}, d2 = {"Lcom/mapbox/maps/extension/compose/style/layers/ModelIdValue;", "", "Lcom/mapbox/bindgen/Value;", "value", "Lo13/p;", "", "modelInfo", "<init>", "(Lcom/mapbox/bindgen/Value;Lo13/p;)V", "(Ljava/lang/String;)V", "modelId", "uri", "(Ljava/lang/String;Ljava/lang/String;)V", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "expression", "(Lcom/mapbox/maps/extension/style/expressions/generated/Expression;)V", "component1", "()Lcom/mapbox/bindgen/Value;", "component2", "()Lo13/p;", "copy", "(Lcom/mapbox/bindgen/Value;Lo13/p;)Lcom/mapbox/maps/extension/compose/style/layers/ModelIdValue;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/mapbox/bindgen/Value;", "getValue", "Lo13/p;", "getModelInfo", "getModelIdOrNull", "modelIdOrNull", "getUriOrNull", "uriOrNull", "getNotInitial$extension_compose_release", "()Z", "notInitial", "Companion", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@MapboxExperimental
public final /* data */ class ModelIdValue {
    public static final ModelIdValue DEFAULT;
    public static final ModelIdValue INITIAL;
    private final p<String, String> modelInfo;
    private final Value value;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Value valueValueOf = Value.valueOf("ModelId.INITIAL");
        valueValueOf.getClass();
        int i14 = 2;
        INITIAL = new ModelIdValue(valueValueOf, 0 == true ? 1 : 0, i14, 0 == true ? 1 : 0);
        Value valueNullValue = Value.nullValue();
        valueNullValue.getClass();
        DEFAULT = new ModelIdValue(valueNullValue, 0 == true ? 1 : 0, i14, 0 == true ? 1 : 0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ModelIdValue(String str, String str2) {
        this(new Value(str), (p<String, String>) new p(str, str2));
        str.getClass();
        str2.getClass();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ModelIdValue copy$default(ModelIdValue modelIdValue, Value value, p pVar, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            value = modelIdValue.value;
        }
        if ((i14 & 2) != 0) {
            pVar = modelIdValue.modelInfo;
        }
        return modelIdValue.copy(value, pVar);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Value getValue() {
        return this.value;
    }

    public final p<String, String> component2() {
        return this.modelInfo;
    }

    public final ModelIdValue copy(Value value, p<String, String> modelInfo) {
        value.getClass();
        return new ModelIdValue(value, modelInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ModelIdValue)) {
            return false;
        }
        ModelIdValue modelIdValue = (ModelIdValue) other;
        return s.g(this.value, modelIdValue.value) && s.g(this.modelInfo, modelIdValue.modelInfo);
    }

    public final String getModelIdOrNull() {
        Object contents = this.value.getContents();
        if (contents instanceof String) {
            return (String) contents;
        }
        return null;
    }

    public final p<String, String> getModelInfo() {
        return this.modelInfo;
    }

    public final boolean getNotInitial$extension_compose_release() {
        return this != INITIAL;
    }

    public final String getUriOrNull() {
        p<String, String> pVar = this.modelInfo;
        if (pVar != null) {
            return pVar.f128595b;
        }
        return null;
    }

    public final Value getValue() {
        return this.value;
    }

    public int hashCode() {
        int iHashCode = this.value.hashCode() * 31;
        p<String, String> pVar = this.modelInfo;
        return iHashCode + (pVar == null ? 0 : pVar.hashCode());
    }

    public String toString() {
        return "ModelIdValue(value=" + this.value + ", modelInfo=" + this.modelInfo + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ ModelIdValue(Value value, p pVar, int i14, j jVar) {
        this(value, (p<String, String>) ((i14 & 2) != 0 ? null : pVar));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ModelIdValue(String str) {
        this(ComposeTypeUtils.INSTANCE.wrapToValue(str), null, 2, 0 == true ? 1 : 0);
        str.getClass();
    }

    public ModelIdValue(Value value, p<String, String> pVar) {
        value.getClass();
        this.value = value;
        this.modelInfo = pVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ModelIdValue(Expression expression) {
        this(expression, null, 2, 0 == true ? 1 : 0);
        expression.getClass();
    }
}
