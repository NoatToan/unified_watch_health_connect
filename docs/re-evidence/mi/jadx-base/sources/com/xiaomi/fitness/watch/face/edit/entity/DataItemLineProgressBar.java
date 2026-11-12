package com.xiaomi.fitness.watch.face.edit.entity;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b4\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B±\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\b\u0012\b\b\u0002\u0010\u0014\u001a\u00020\b\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0016\u0010\u0017J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00102\u001a\u00020\bHÆ\u0003J\t\u00103\u001a\u00020\bHÆ\u0003J\t\u00104\u001a\u00020\bHÆ\u0003J\t\u00105\u001a\u00020\bHÆ\u0003J\t\u00106\u001a\u00020\bHÆ\u0003J\t\u00107\u001a\u00020\bHÆ\u0003J\t\u00108\u001a\u00020\u000fHÆ\u0003J\t\u00109\u001a\u00020\bHÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010<\u001a\u00020\bHÆ\u0003J\t\u0010=\u001a\u00020\bHÆ\u0003J\u0010\u0010>\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010,JÆ\u0001\u0010?\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0013\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0002\u0010@J\u0013\u0010A\u001a\u00020\u000f2\b\u0010B\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010C\u001a\u00020DHÖ\u0001J\t\u0010E\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0019R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001eR\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001eR\u0011\u0010\f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001eR\u0011\u0010\r\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001eR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u0010\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001eR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0019R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0019R\u0011\u0010\u0013\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001eR\u0011\u0010\u0014\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001eR\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010-\u001a\u0004\b+\u0010,¨\u0006F"}, d2 = {"Lcom/xiaomi/fitness/watch/face/edit/entity/DataItemLineProgressBar;", "", "name", "", "source", "ref", "bg", "startX", "", "startY", "endX", "endY", "valueStart", "valueRange", "valueUesSourceEnable", "", "barWidth", "endingStyle", "indicatorImage", "indicatorOffsetX", "indicatorOffsetY", "supportRecolor", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FFFFFFZFLjava/lang/String;Ljava/lang/String;FFLjava/lang/Boolean;)V", "getName", "()Ljava/lang/String;", "getSource", "getRef", "getBg", "getStartX", "()F", "getStartY", "getEndX", "getEndY", "getValueStart", "getValueRange", "getValueUesSourceEnable", "()Z", "getBarWidth", "getEndingStyle", "getIndicatorImage", "getIndicatorOffsetX", "getIndicatorOffsetY", "getSupportRecolor", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FFFFFFZFLjava/lang/String;Ljava/lang/String;FFLjava/lang/Boolean;)Lcom/xiaomi/fitness/watch/face/edit/entity/DataItemLineProgressBar;", "equals", "other", "hashCode", "", "toString", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DataItemLineProgressBar {
    private final float barWidth;

    @Nullable
    private final String bg;
    private final float endX;
    private final float endY;

    @Nullable
    private final String endingStyle;

    @Nullable
    private final String indicatorImage;
    private final float indicatorOffsetX;
    private final float indicatorOffsetY;

    @Nullable
    private final String name;

    @Nullable
    private final String ref;

    @Nullable
    private final String source;
    private final float startX;
    private final float startY;

    @Nullable
    private final Boolean supportRecolor;
    private final float valueRange;
    private final float valueStart;
    private final boolean valueUesSourceEnable;

    public DataItemLineProgressBar(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, float f, float f2, float f3, float f4, float f5, float f6, boolean z, float f7, @Nullable String str5, @Nullable String str6, float f8, float f9, @Nullable Boolean bool) {
        this.name = str;
        this.source = str2;
        this.ref = str3;
        this.bg = str4;
        this.startX = f;
        this.startY = f2;
        this.endX = f3;
        this.endY = f4;
        this.valueStart = f5;
        this.valueRange = f6;
        this.valueUesSourceEnable = z;
        this.barWidth = f7;
        this.endingStyle = str5;
        this.indicatorImage = str6;
        this.indicatorOffsetX = f8;
        this.indicatorOffsetY = f9;
        this.supportRecolor = bool;
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
    public final float getBarWidth() {
        return this.barWidth;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getEndingStyle() {
        return this.endingStyle;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getIndicatorImage() {
        return this.indicatorImage;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final float getIndicatorOffsetX() {
        return this.indicatorOffsetX;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final float getIndicatorOffsetY() {
        return this.indicatorOffsetY;
    }

    @Nullable
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final Boolean getSupportRecolor() {
        return this.supportRecolor;
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
    public final float getStartX() {
        return this.startX;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final float getStartY() {
        return this.startY;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final float getEndX() {
        return this.endX;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final float getEndY() {
        return this.endY;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final float getValueStart() {
        return this.valueStart;
    }

    @NotNull
    public final DataItemLineProgressBar copy(@Nullable String name, @Nullable String source, @Nullable String ref, @Nullable String bg, float startX, float startY, float endX, float endY, float valueStart, float valueRange, boolean valueUesSourceEnable, float barWidth, @Nullable String endingStyle, @Nullable String indicatorImage, float indicatorOffsetX, float indicatorOffsetY, @Nullable Boolean supportRecolor) {
        return new DataItemLineProgressBar(name, source, ref, bg, startX, startY, endX, endY, valueStart, valueRange, valueUesSourceEnable, barWidth, endingStyle, indicatorImage, indicatorOffsetX, indicatorOffsetY, supportRecolor);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DataItemLineProgressBar)) {
            return false;
        }
        DataItemLineProgressBar dataItemLineProgressBar = (DataItemLineProgressBar) other;
        return Intrinsics.areEqual(this.name, dataItemLineProgressBar.name) && Intrinsics.areEqual(this.source, dataItemLineProgressBar.source) && Intrinsics.areEqual(this.ref, dataItemLineProgressBar.ref) && Intrinsics.areEqual(this.bg, dataItemLineProgressBar.bg) && Float.compare(this.startX, dataItemLineProgressBar.startX) == 0 && Float.compare(this.startY, dataItemLineProgressBar.startY) == 0 && Float.compare(this.endX, dataItemLineProgressBar.endX) == 0 && Float.compare(this.endY, dataItemLineProgressBar.endY) == 0 && Float.compare(this.valueStart, dataItemLineProgressBar.valueStart) == 0 && Float.compare(this.valueRange, dataItemLineProgressBar.valueRange) == 0 && this.valueUesSourceEnable == dataItemLineProgressBar.valueUesSourceEnable && Float.compare(this.barWidth, dataItemLineProgressBar.barWidth) == 0 && Intrinsics.areEqual(this.endingStyle, dataItemLineProgressBar.endingStyle) && Intrinsics.areEqual(this.indicatorImage, dataItemLineProgressBar.indicatorImage) && Float.compare(this.indicatorOffsetX, dataItemLineProgressBar.indicatorOffsetX) == 0 && Float.compare(this.indicatorOffsetY, dataItemLineProgressBar.indicatorOffsetY) == 0 && Intrinsics.areEqual(this.supportRecolor, dataItemLineProgressBar.supportRecolor);
    }

    public final float getBarWidth() {
        return this.barWidth;
    }

    @Nullable
    public final String getBg() {
        return this.bg;
    }

    public final float getEndX() {
        return this.endX;
    }

    public final float getEndY() {
        return this.endY;
    }

    @Nullable
    public final String getEndingStyle() {
        return this.endingStyle;
    }

    @Nullable
    public final String getIndicatorImage() {
        return this.indicatorImage;
    }

    public final float getIndicatorOffsetX() {
        return this.indicatorOffsetX;
    }

    public final float getIndicatorOffsetY() {
        return this.indicatorOffsetY;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getRef() {
        return this.ref;
    }

    @Nullable
    public final String getSource() {
        return this.source;
    }

    public final float getStartX() {
        return this.startX;
    }

    public final float getStartY() {
        return this.startY;
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
        int iHashCode4 = (((((((((((((((((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + Float.hashCode(this.startX)) * 31) + Float.hashCode(this.startY)) * 31) + Float.hashCode(this.endX)) * 31) + Float.hashCode(this.endY)) * 31) + Float.hashCode(this.valueStart)) * 31) + Float.hashCode(this.valueRange)) * 31) + Boolean.hashCode(this.valueUesSourceEnable)) * 31) + Float.hashCode(this.barWidth)) * 31;
        String str5 = this.endingStyle;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.indicatorImage;
        int iHashCode6 = (((((iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31) + Float.hashCode(this.indicatorOffsetX)) * 31) + Float.hashCode(this.indicatorOffsetY)) * 31;
        Boolean bool = this.supportRecolor;
        return iHashCode6 + (bool != null ? bool.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "DataItemLineProgressBar(name=" + this.name + ", source=" + this.source + ", ref=" + this.ref + ", bg=" + this.bg + ", startX=" + this.startX + ", startY=" + this.startY + ", endX=" + this.endX + ", endY=" + this.endY + ", valueStart=" + this.valueStart + ", valueRange=" + this.valueRange + ", valueUesSourceEnable=" + this.valueUesSourceEnable + ", barWidth=" + this.barWidth + ", endingStyle=" + this.endingStyle + ", indicatorImage=" + this.indicatorImage + ", indicatorOffsetX=" + this.indicatorOffsetX + ", indicatorOffsetY=" + this.indicatorOffsetY + ", supportRecolor=" + this.supportRecolor + ")";
    }

    public /* synthetic */ DataItemLineProgressBar(String str, String str2, String str3, String str4, float f, float f2, float f3, float f4, float f5, float f6, boolean z, float f7, String str5, String str6, float f8, float f9, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i & 16) != 0 ? 0.0f : f, (i & 32) != 0 ? 0.0f : f2, (i & 64) != 0 ? 0.0f : f3, (i & 128) != 0 ? 0.0f : f4, (i & 256) != 0 ? 0.0f : f5, (i & 512) != 0 ? 0.0f : f6, (i & 1024) != 0 ? false : z, (i & 2048) != 0 ? 0.0f : f7, str5, str6, (i & 16384) != 0 ? 0.0f : f8, (i & 32768) != 0 ? 0.0f : f9, bool);
    }
}
