package com.mapbox.maps.extension.compose.style.sources;

import ch.qos.logback.core.CoreConstants;
import com.mapbox.bindgen.Value;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import r53.z1;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u000b\b\u0082\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0010\u0010\t\u001a\f\u0012\u0004\u0012\u00020\u00070\u0006j\u0002`\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0010\u001a\f\u0012\u0004\u0012\u00020\u00070\u0006j\u0002`\bHÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J8\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\b\u0002\u0010\t\u001a\f\u0012\u0004\u0012\u00020\u00070\u0006j\u0002`\bHÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\rJ\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u0005\u0010\u000fR!\u0010\t\u001a\f\u0012\u0004\u0012\u00020\u00070\u0006j\u0002`\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b\u001f\u0010\u0011¨\u0006 "}, d2 = {"Lcom/mapbox/maps/extension/compose/style/sources/PropertyDetails;", "", "", "name", "", "isBuilderProperty", "Lr53/z1;", "Lcom/mapbox/bindgen/Value;", "Lcom/mapbox/maps/extension/compose/style/sources/PropertyValueFlow;", "valueFlow", "<init>", "(Ljava/lang/String;ZLr53/z1;)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "()Lr53/z1;", "copy", "(Ljava/lang/String;ZLr53/z1;)Lcom/mapbox/maps/extension/compose/style/sources/PropertyDetails;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "Z", "Lr53/z1;", "getValueFlow", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
final /* data */ class PropertyDetails {
    private final boolean isBuilderProperty;
    private final String name;
    private final z1<Value> valueFlow;

    public PropertyDetails(String str, boolean z14, z1<Value> z1Var) {
        str.getClass();
        z1Var.getClass();
        this.name = str;
        this.isBuilderProperty = z14;
        this.valueFlow = z1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PropertyDetails copy$default(PropertyDetails propertyDetails, String str, boolean z14, z1 z1Var, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = propertyDetails.name;
        }
        if ((i14 & 2) != 0) {
            z14 = propertyDetails.isBuilderProperty;
        }
        if ((i14 & 4) != 0) {
            z1Var = propertyDetails.valueFlow;
        }
        return propertyDetails.copy(str, z14, z1Var);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsBuilderProperty() {
        return this.isBuilderProperty;
    }

    public final z1<Value> component3() {
        return this.valueFlow;
    }

    public final PropertyDetails copy(String name, boolean isBuilderProperty, z1<Value> valueFlow) {
        name.getClass();
        valueFlow.getClass();
        return new PropertyDetails(name, isBuilderProperty, valueFlow);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PropertyDetails)) {
            return false;
        }
        PropertyDetails propertyDetails = (PropertyDetails) other;
        return s.g(this.name, propertyDetails.name) && this.isBuilderProperty == propertyDetails.isBuilderProperty && s.g(this.valueFlow, propertyDetails.valueFlow);
    }

    public final String getName() {
        return this.name;
    }

    public final z1<Value> getValueFlow() {
        return this.valueFlow;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    public int hashCode() {
        int iHashCode = this.name.hashCode() * 31;
        boolean z14 = this.isBuilderProperty;
        ?? r14 = z14;
        if (z14) {
            r14 = 1;
        }
        return this.valueFlow.hashCode() + ((iHashCode + r14) * 31);
    }

    public final boolean isBuilderProperty() {
        return this.isBuilderProperty;
    }

    public String toString() {
        return "PropertyDetails(name=" + this.name + ", isBuilderProperty=" + this.isBuilderProperty + ", valueFlow=" + this.valueFlow + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
