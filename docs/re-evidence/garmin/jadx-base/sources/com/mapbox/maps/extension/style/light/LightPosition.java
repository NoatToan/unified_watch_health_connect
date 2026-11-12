package com.mapbox.maps.extension.style.light;

import ch.qos.logback.core.CoreConstants;
import com.mapbox.bindgen.Value;
import com.mapbox.maps.extension.style.types.LightDsl;
import com.mapbox.maps.extension.style.utils.TypeUtils;
import java.util.List;
import org.apache.commons.lang3.e;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.x;

/* JADX INFO: loaded from: classes3.dex */
@LightDsl
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0013\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u0007\u001a\u00020\u0003HÂ\u0003J\t\u0010\b\u001a\u00020\u0003HÂ\u0003J\t\u0010\t\u001a\u00020\u0003HÂ\u0003J'\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0013J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\u0006\u0010\u0016\u001a\u00020\u0017R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/mapbox/maps/extension/style/light/LightPosition;", "", "radialCoordinate", "", "azimuthalAngle", "polarAngle", "(DDD)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toDoubleArray", "", "toList", "", "toString", "", "toValue", "Lcom/mapbox/bindgen/Value;", "Companion", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class LightPosition {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final double azimuthalAngle;
    private final double polarAngle;
    private final double radialCoordinate;

    public LightPosition(double d14, double d15, double d16) {
        this.radialCoordinate = d14;
        this.azimuthalAngle = d15;
        this.polarAngle = d16;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    private final double getRadialCoordinate() {
        return this.radialCoordinate;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    private final double getAzimuthalAngle() {
        return this.azimuthalAngle;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    private final double getPolarAngle() {
        return this.polarAngle;
    }

    public static /* synthetic */ LightPosition copy$default(LightPosition lightPosition, double d14, double d15, double d16, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            d14 = lightPosition.radialCoordinate;
        }
        double d17 = d14;
        if ((i14 & 2) != 0) {
            d15 = lightPosition.azimuthalAngle;
        }
        double d18 = d15;
        if ((i14 & 4) != 0) {
            d16 = lightPosition.polarAngle;
        }
        return lightPosition.copy(d17, d18, d16);
    }

    public final LightPosition copy(double radialCoordinate, double azimuthalAngle, double polarAngle) {
        return new LightPosition(radialCoordinate, azimuthalAngle, polarAngle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LightPosition)) {
            return false;
        }
        LightPosition lightPosition = (LightPosition) other;
        return Double.compare(this.radialCoordinate, lightPosition.radialCoordinate) == 0 && Double.compare(this.azimuthalAngle, lightPosition.azimuthalAngle) == 0 && Double.compare(this.polarAngle, lightPosition.polarAngle) == 0;
    }

    public int hashCode() {
        return Double.hashCode(this.polarAngle) + e.b(Double.hashCode(this.radialCoordinate) * 31, 31, this.azimuthalAngle);
    }

    public final double[] toDoubleArray() {
        return new double[]{this.radialCoordinate, this.azimuthalAngle, this.polarAngle};
    }

    public final List<Double> toList() {
        return x.k(Double.valueOf(this.radialCoordinate), Double.valueOf(this.azimuthalAngle), Double.valueOf(this.polarAngle));
    }

    public String toString() {
        return "LightPosition(radialCoordinate=" + this.radialCoordinate + ", azimuthalAngle=" + this.azimuthalAngle + ", polarAngle=" + this.polarAngle + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final Value toValue() {
        return TypeUtils.INSTANCE.wrapToValue(new double[]{this.radialCoordinate, this.azimuthalAngle, this.polarAngle});
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0013\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0014\u0010\u0007\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¨\u0006\u000b"}, d2 = {"Lcom/mapbox/maps/extension/style/light/LightPosition$Companion;", "", "()V", "fromArray", "Lcom/mapbox/maps/extension/style/light/LightPosition;", "positionArray", "", "fromList", "positionList", "", "", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final LightPosition fromArray(double[] positionArray) {
            positionArray.getClass();
            return new LightPosition(positionArray[0], positionArray[1], positionArray[2]);
        }

        public final LightPosition fromList(List<Double> positionList) {
            positionList.getClass();
            return new LightPosition(positionList.get(0).doubleValue(), positionList.get(1).doubleValue(), positionList.get(2).doubleValue());
        }

        private Companion() {
        }
    }
}
