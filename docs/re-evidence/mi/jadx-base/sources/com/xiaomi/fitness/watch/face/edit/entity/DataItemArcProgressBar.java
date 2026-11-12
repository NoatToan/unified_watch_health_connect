package com.xiaomi.fitness.watch.face.edit.entity;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b7\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B»\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0014\u001a\u00020\b\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00104\u001a\u00020\bHÆ\u0003J\t\u00105\u001a\u00020\bHÆ\u0003J\t\u00106\u001a\u00020\bHÆ\u0003J\t\u00107\u001a\u00020\bHÆ\u0003J\t\u00108\u001a\u00020\bHÆ\u0003J\t\u00109\u001a\u00020\bHÆ\u0003J\t\u0010:\u001a\u00020\u000fHÆ\u0003J\t\u0010;\u001a\u00020\bHÆ\u0003J\t\u0010<\u001a\u00020\bHÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010?\u001a\u00020\bHÆ\u0003J\u0010\u0010@\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010-J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003HÆ\u0003JÒ\u0001\u0010B\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0014\u001a\u00020\b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010CJ\u0013\u0010D\u001a\u00020\u000f2\b\u0010E\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010F\u001a\u00020GHÖ\u0001J\t\u0010H\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001fR\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001fR\u0011\u0010\f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001fR\u0011\u0010\r\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001fR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u0010\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001fR\u0011\u0010\u0011\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001fR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001aR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001aR\u0011\u0010\u0014\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001fR\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010.\u001a\u0004\b,\u0010-R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001a¨\u0006I"}, d2 = {"Lcom/xiaomi/fitness/watch/face/edit/entity/DataItemArcProgressBar;", "", "name", "", "source", "ref", "bg", "pivotX", "", "pivotY", "angleStart", "valueStart", "angleRange", "valueRange", "valueUesSourceEnable", "", "barRadius", "barWidth", "endingStyle", "indicatorImage", "indicatorRadius", "supportRecolor", "renderRule", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FFFFFFZFFLjava/lang/String;Ljava/lang/String;FLjava/lang/Boolean;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getSource", "getRef", "getBg", "getPivotX", "()F", "getPivotY", "getAngleStart", "getValueStart", "getAngleRange", "getValueRange", "getValueUesSourceEnable", "()Z", "getBarRadius", "getBarWidth", "getEndingStyle", "getIndicatorImage", "getIndicatorRadius", "getSupportRecolor", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getRenderRule", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FFFFFFZFFLjava/lang/String;Ljava/lang/String;FLjava/lang/Boolean;Ljava/lang/String;)Lcom/xiaomi/fitness/watch/face/edit/entity/DataItemArcProgressBar;", "equals", "other", "hashCode", "", "toString", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DataItemArcProgressBar {
    private final float angleRange;
    private final float angleStart;
    private final float barRadius;
    private final float barWidth;

    @Nullable
    private final String bg;

    @Nullable
    private final String endingStyle;

    @Nullable
    private final String indicatorImage;
    private final float indicatorRadius;

    @Nullable
    private final String name;
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

    public DataItemArcProgressBar(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, float f, float f2, float f3, float f4, float f5, float f6, boolean z, float f7, float f8, @Nullable String str5, @Nullable String str6, float f9, @Nullable Boolean bool, @Nullable String str7) {
        this.name = str;
        this.source = str2;
        this.ref = str3;
        this.bg = str4;
        this.pivotX = f;
        this.pivotY = f2;
        this.angleStart = f3;
        this.valueStart = f4;
        this.angleRange = f5;
        this.valueRange = f6;
        this.valueUesSourceEnable = z;
        this.barRadius = f7;
        this.barWidth = f8;
        this.endingStyle = str5;
        this.indicatorImage = str6;
        this.indicatorRadius = f9;
        this.supportRecolor = bool;
        this.renderRule = str7;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final float getValueRange() {
        return this.valueRange;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final boolean getValueUesSourceEnable() {
        return this.valueUesSourceEnable;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final float getBarRadius() {
        return this.barRadius;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final float getBarWidth() {
        return this.barWidth;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getEndingStyle() {
        return this.endingStyle;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getIndicatorImage() {
        return this.indicatorImage;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final float getIndicatorRadius() {
        return this.indicatorRadius;
    }

    @Nullable
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final Boolean getSupportRecolor() {
        return this.supportRecolor;
    }

    @Nullable
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getRenderRule() {
        return this.renderRule;
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

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getBg() {
        return this.bg;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final float getPivotX() {
        return this.pivotX;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final float getPivotY() {
        return this.pivotY;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final float getAngleStart() {
        return this.angleStart;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final float getValueStart() {
        return this.valueStart;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final float getAngleRange() {
        return this.angleRange;
    }

    @NotNull
    public final DataItemArcProgressBar copy(@Nullable String name, @Nullable String source, @Nullable String ref, @Nullable String bg, float pivotX, float pivotY, float angleStart, float valueStart, float angleRange, float valueRange, boolean valueUesSourceEnable, float barRadius, float barWidth, @Nullable String endingStyle, @Nullable String indicatorImage, float indicatorRadius, @Nullable Boolean supportRecolor, @Nullable String renderRule) {
        return new DataItemArcProgressBar(name, source, ref, bg, pivotX, pivotY, angleStart, valueStart, angleRange, valueRange, valueUesSourceEnable, barRadius, barWidth, endingStyle, indicatorImage, indicatorRadius, supportRecolor, renderRule);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DataItemArcProgressBar)) {
            return false;
        }
        DataItemArcProgressBar dataItemArcProgressBar = (DataItemArcProgressBar) other;
        return Intrinsics.areEqual(this.name, dataItemArcProgressBar.name) && Intrinsics.areEqual(this.source, dataItemArcProgressBar.source) && Intrinsics.areEqual(this.ref, dataItemArcProgressBar.ref) && Intrinsics.areEqual(this.bg, dataItemArcProgressBar.bg) && Float.compare(this.pivotX, dataItemArcProgressBar.pivotX) == 0 && Float.compare(this.pivotY, dataItemArcProgressBar.pivotY) == 0 && Float.compare(this.angleStart, dataItemArcProgressBar.angleStart) == 0 && Float.compare(this.valueStart, dataItemArcProgressBar.valueStart) == 0 && Float.compare(this.angleRange, dataItemArcProgressBar.angleRange) == 0 && Float.compare(this.valueRange, dataItemArcProgressBar.valueRange) == 0 && this.valueUesSourceEnable == dataItemArcProgressBar.valueUesSourceEnable && Float.compare(this.barRadius, dataItemArcProgressBar.barRadius) == 0 && Float.compare(this.barWidth, dataItemArcProgressBar.barWidth) == 0 && Intrinsics.areEqual(this.endingStyle, dataItemArcProgressBar.endingStyle) && Intrinsics.areEqual(this.indicatorImage, dataItemArcProgressBar.indicatorImage) && Float.compare(this.indicatorRadius, dataItemArcProgressBar.indicatorRadius) == 0 && Intrinsics.areEqual(this.supportRecolor, dataItemArcProgressBar.supportRecolor) && Intrinsics.areEqual(this.renderRule, dataItemArcProgressBar.renderRule);
    }

    public final float getAngleRange() {
        return this.angleRange;
    }

    public final float getAngleStart() {
        return this.angleStart;
    }

    public final float getBarRadius() {
        return this.barRadius;
    }

    public final float getBarWidth() {
        return this.barWidth;
    }

    @Nullable
    public final String getBg() {
        return this.bg;
    }

    @Nullable
    public final String getEndingStyle() {
        return this.endingStyle;
    }

    @Nullable
    public final String getIndicatorImage() {
        return this.indicatorImage;
    }

    public final float getIndicatorRadius() {
        return this.indicatorRadius;
    }

    @Nullable
    public final String getName() {
        return this.name;
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
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.bg;
        int iHashCode4 = (((((((((((((((((((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + Float.hashCode(this.pivotX)) * 31) + Float.hashCode(this.pivotY)) * 31) + Float.hashCode(this.angleStart)) * 31) + Float.hashCode(this.valueStart)) * 31) + Float.hashCode(this.angleRange)) * 31) + Float.hashCode(this.valueRange)) * 31) + Boolean.hashCode(this.valueUesSourceEnable)) * 31) + Float.hashCode(this.barRadius)) * 31) + Float.hashCode(this.barWidth)) * 31;
        String str5 = this.endingStyle;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.indicatorImage;
        int iHashCode6 = (((iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31) + Float.hashCode(this.indicatorRadius)) * 31;
        Boolean bool = this.supportRecolor;
        int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str7 = this.renderRule;
        return iHashCode7 + (str7 != null ? str7.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "DataItemArcProgressBar(name=" + this.name + ", source=" + this.source + ", ref=" + this.ref + ", bg=" + this.bg + ", pivotX=" + this.pivotX + ", pivotY=" + this.pivotY + ", angleStart=" + this.angleStart + ", valueStart=" + this.valueStart + ", angleRange=" + this.angleRange + ", valueRange=" + this.valueRange + ", valueUesSourceEnable=" + this.valueUesSourceEnable + ", barRadius=" + this.barRadius + ", barWidth=" + this.barWidth + ", endingStyle=" + this.endingStyle + ", indicatorImage=" + this.indicatorImage + ", indicatorRadius=" + this.indicatorRadius + ", supportRecolor=" + this.supportRecolor + ", renderRule=" + this.renderRule + ")";
    }

    public /* synthetic */ DataItemArcProgressBar(String str, String str2, String str3, String str4, float f, float f2, float f3, float f4, float f5, float f6, boolean z, float f7, float f8, String str5, String str6, float f9, Boolean bool, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i & 16) != 0 ? 0.0f : f, (i & 32) != 0 ? 0.0f : f2, (i & 64) != 0 ? 0.0f : f3, (i & 128) != 0 ? 0.0f : f4, (i & 256) != 0 ? 0.0f : f5, (i & 512) != 0 ? 0.0f : f6, (i & 1024) != 0 ? false : z, (i & 2048) != 0 ? 0.0f : f7, (i & 4096) != 0 ? 0.0f : f8, str5, str6, f9, bool, (i & 131072) != 0 ? null : str7);
    }
}
