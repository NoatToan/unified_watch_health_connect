package com.xiaomi.fitness.watch.face.edit.entity;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b)\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0093\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\u0007\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0007HÆ\u0003J\t\u0010*\u001a\u00020\u0007HÆ\u0003J\t\u0010+\u001a\u00020\u0007HÆ\u0003J\t\u0010,\u001a\u00020\u0007HÆ\u0003J\t\u0010-\u001a\u00020\u0007HÆ\u0003J\t\u0010.\u001a\u00020\u0007HÆ\u0003J\t\u0010/\u001a\u00020\u000eHÆ\u0003J\u0010\u00100\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010\"J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0007HÆ\u0003J\u009a\u0001\u00103\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u0007HÆ\u0001¢\u0006\u0002\u00104J\u0013\u00105\u001a\u00020\u000e2\b\u00106\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00107\u001a\u000208HÖ\u0001J\t\u00109\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0019R\u0011\u0010\u000b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019R\u0011\u0010\f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0019R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010#\u001a\u0004\b!\u0010\"R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0015R\u0011\u0010\u0011\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0019¨\u0006:"}, d2 = {"Lcom/xiaomi/fitness/watch/face/edit/entity/DataItemPointer;", "", "name", "", "source", "ref", "pivotX", "", "pivotY", "angleStart", "valueStart", "angleRange", "valueRange", "valueUesSourceEnable", "", "supportRecolor", "renderRule", "parameter", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FFFFFFZLjava/lang/Boolean;Ljava/lang/String;F)V", "getName", "()Ljava/lang/String;", "getSource", "getRef", "getPivotX", "()F", "getPivotY", "getAngleStart", "getValueStart", "getAngleRange", "getValueRange", "getValueUesSourceEnable", "()Z", "getSupportRecolor", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getRenderRule", "getParameter", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FFFFFFZLjava/lang/Boolean;Ljava/lang/String;F)Lcom/xiaomi/fitness/watch/face/edit/entity/DataItemPointer;", "equals", "other", "hashCode", "", "toString", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DataItemPointer {
    private final float angleRange;
    private final float angleStart;

    @Nullable
    private final String name;
    private final float parameter;
    private final float pivotX;
    private final float pivotY;

    @Nullable
    private final String ref;

    @Nullable
    private final String renderRule;

    @Nullable
    private final String source;

    @Nullable
    private final Boolean supportRecolor;
    private final float valueRange;
    private final float valueStart;
    private final boolean valueUesSourceEnable;

    public DataItemPointer() {
        this(null, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, null, null, 0.0f, 8191, null);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final boolean getValueUesSourceEnable() {
        return this.valueUesSourceEnable;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Boolean getSupportRecolor() {
        return this.supportRecolor;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getRenderRule() {
        return this.renderRule;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final float getParameter() {
        return this.parameter;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRef() {
        return this.ref;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final float getPivotX() {
        return this.pivotX;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final float getPivotY() {
        return this.pivotY;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final float getAngleStart() {
        return this.angleStart;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final float getValueStart() {
        return this.valueStart;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final float getAngleRange() {
        return this.angleRange;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final float getValueRange() {
        return this.valueRange;
    }

    @NotNull
    public final DataItemPointer copy(@Nullable String name, @Nullable String source, @Nullable String ref, float pivotX, float pivotY, float angleStart, float valueStart, float angleRange, float valueRange, boolean valueUesSourceEnable, @Nullable Boolean supportRecolor, @Nullable String renderRule, float parameter) {
        return new DataItemPointer(name, source, ref, pivotX, pivotY, angleStart, valueStart, angleRange, valueRange, valueUesSourceEnable, supportRecolor, renderRule, parameter);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DataItemPointer)) {
            return false;
        }
        DataItemPointer dataItemPointer = (DataItemPointer) other;
        return Intrinsics.areEqual(this.name, dataItemPointer.name) && Intrinsics.areEqual(this.source, dataItemPointer.source) && Intrinsics.areEqual(this.ref, dataItemPointer.ref) && Float.compare(this.pivotX, dataItemPointer.pivotX) == 0 && Float.compare(this.pivotY, dataItemPointer.pivotY) == 0 && Float.compare(this.angleStart, dataItemPointer.angleStart) == 0 && Float.compare(this.valueStart, dataItemPointer.valueStart) == 0 && Float.compare(this.angleRange, dataItemPointer.angleRange) == 0 && Float.compare(this.valueRange, dataItemPointer.valueRange) == 0 && this.valueUesSourceEnable == dataItemPointer.valueUesSourceEnable && Intrinsics.areEqual(this.supportRecolor, dataItemPointer.supportRecolor) && Intrinsics.areEqual(this.renderRule, dataItemPointer.renderRule) && Float.compare(this.parameter, dataItemPointer.parameter) == 0;
    }

    public final float getAngleRange() {
        return this.angleRange;
    }

    public final float getAngleStart() {
        return this.angleStart;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    public final float getParameter() {
        return this.parameter;
    }

    public final float getPivotX() {
        return this.pivotX;
    }

    public final float getPivotY() {
        return this.pivotY;
    }

    @Nullable
    public final String getRef() {
        return this.ref;
    }

    @Nullable
    public final String getRenderRule() {
        return this.renderRule;
    }

    @Nullable
    public final String getSource() {
        return this.source;
    }

    @Nullable
    public final Boolean getSupportRecolor() {
        return this.supportRecolor;
    }

    public final float getValueRange() {
        return this.valueRange;
    }

    public final float getValueStart() {
        return this.valueStart;
    }

    public final boolean getValueUesSourceEnable() {
        return this.valueUesSourceEnable;
    }

    public int hashCode() {
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.source;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.ref;
        int iHashCode3 = (((((((((((((((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + Float.hashCode(this.pivotX)) * 31) + Float.hashCode(this.pivotY)) * 31) + Float.hashCode(this.angleStart)) * 31) + Float.hashCode(this.valueStart)) * 31) + Float.hashCode(this.angleRange)) * 31) + Float.hashCode(this.valueRange)) * 31) + Boolean.hashCode(this.valueUesSourceEnable)) * 31;
        Boolean bool = this.supportRecolor;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str4 = this.renderRule;
        return ((iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31) + Float.hashCode(this.parameter);
    }

    @NotNull
    public String toString() {
        return "DataItemPointer(name=" + this.name + ", source=" + this.source + ", ref=" + this.ref + ", pivotX=" + this.pivotX + ", pivotY=" + this.pivotY + ", angleStart=" + this.angleStart + ", valueStart=" + this.valueStart + ", angleRange=" + this.angleRange + ", valueRange=" + this.valueRange + ", valueUesSourceEnable=" + this.valueUesSourceEnable + ", supportRecolor=" + this.supportRecolor + ", renderRule=" + this.renderRule + ", parameter=" + this.parameter + ")";
    }

    public DataItemPointer(@Nullable String str, @Nullable String str2, @Nullable String str3, float f, float f2, float f3, float f4, float f5, float f6, boolean z, @Nullable Boolean bool, @Nullable String str4, float f7) {
        this.name = str;
        this.source = str2;
        this.ref = str3;
        this.pivotX = f;
        this.pivotY = f2;
        this.angleStart = f3;
        this.valueStart = f4;
        this.angleRange = f5;
        this.valueRange = f6;
        this.valueUesSourceEnable = z;
        this.supportRecolor = bool;
        this.renderRule = str4;
        this.parameter = f7;
    }

    public /* synthetic */ DataItemPointer(String str, String str2, String str3, float f, float f2, float f3, float f4, float f5, float f6, boolean z, Boolean bool, String str4, float f7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? 0.0f : f, (i & 16) != 0 ? 0.0f : f2, (i & 32) != 0 ? 0.0f : f3, (i & 64) != 0 ? 0.0f : f4, (i & 128) != 0 ? 0.0f : f5, (i & 256) != 0 ? 0.0f : f6, (i & 512) != 0 ? false : z, (i & 1024) != 0 ? null : bool, (i & 2048) == 0 ? str4 : null, (i & 4096) == 0 ? f7 : 0.0f);
    }
}
