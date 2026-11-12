package com.mapbox.maps.extension.compose.style.projection.generated;

import ch.qos.logback.core.CoreConstants;
import com.mapbox.bindgen.Value;
import com.mapbox.maps.extension.style.layers.properties.generated.ProjectionName;
import java.util.HashMap;
import o13.p;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.u0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u000f\b\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u000f\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\u0013\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\t2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\rHÖ\u0001R\u0014\u0010\b\u001a\u00020\t8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\f\u001a\u0004\u0018\u00010\r8F¢\u0006\f\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001c"}, d2 = {"Lcom/mapbox/maps/extension/compose/style/projection/generated/Projection;", "", "name", "Lcom/mapbox/maps/extension/style/layers/properties/generated/ProjectionName;", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/ProjectionName;)V", "value", "Lcom/mapbox/bindgen/Value;", "(Lcom/mapbox/bindgen/Value;)V", "notInitial", "", "getNotInitial$extension_compose_release", "()Z", "projectionNameOrNull", "", "getProjectionNameOrNull$annotations", "()V", "getProjectionNameOrNull", "()Ljava/lang/String;", "getValue", "()Lcom/mapbox/bindgen/Value;", "component1", "copy", "equals", "other", "hashCode", "", "toString", "Companion", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class Projection {
    public static final Projection DEFAULT;
    public static final Projection GLOBE;
    public static final Projection INITIAL;
    public static final Projection MERCATOR;
    private final Value value;

    static {
        Value valueValueOf = Value.valueOf("Projection.INITIAL");
        valueValueOf.getClass();
        INITIAL = new Projection(valueValueOf);
        Value valueNullValue = Value.nullValue();
        valueNullValue.getClass();
        DEFAULT = new Projection(valueNullValue);
        MERCATOR = new Projection(ProjectionName.MERCATOR);
        GLOBE = new Projection(ProjectionName.GLOBE);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private Projection(ProjectionName projectionName) {
        Value valueValueOf = Value.valueOf((HashMap<String, Value>) u0.d(new p("name", new Value(projectionName.getValue()))));
        valueValueOf.getClass();
        this(valueValueOf);
    }

    public static /* synthetic */ Projection copy$default(Projection projection, Value value, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            value = projection.value;
        }
        return projection.copy(value);
    }

    public static /* synthetic */ void getProjectionNameOrNull$annotations() {
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Value getValue() {
        return this.value;
    }

    public final Projection copy(Value value) {
        value.getClass();
        return new Projection(value);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Projection) && s.g(this.value, ((Projection) other).value);
    }

    public final boolean getNotInitial$extension_compose_release() {
        return this != INITIAL;
    }

    public final String getProjectionNameOrNull() {
        Value value;
        Object contents = this.value.getContents();
        HashMap map = contents instanceof HashMap ? (HashMap) contents : null;
        Object contents2 = (map == null || (value = (Value) map.get("name")) == null) ? null : value.getContents();
        if (contents2 instanceof String) {
            return (String) contents2;
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
        return "Projection(value=" + this.value + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public Projection(Value value) {
        value.getClass();
        this.value = value;
    }
}
