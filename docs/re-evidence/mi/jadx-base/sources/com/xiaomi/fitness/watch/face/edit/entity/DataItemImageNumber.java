package com.xiaomi.fitness.watch.face.edit.entity;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b1\b\u0086\b\u0018\u00002\u00020\u0001B¯\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0007HÆ\u0003J\t\u0010/\u001a\u00020\u0007HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00101\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010 J\u0010\u00102\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010 J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00104\u001a\u00020\u000fHÆ\u0003J\t\u00105\u001a\u00020\u0007HÆ\u0003J\t\u00106\u001a\u00020\u0007HÆ\u0003J\u0010\u00107\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010 J\t\u00108\u001a\u00020\u0007HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J¶\u0001\u0010:\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u00072\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u00072\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010;J\u0013\u0010<\u001a\u00020\u000b2\b\u0010=\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010>\u001a\u00020\u0007HÖ\u0001J\t\u0010?\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\u001f\u0010 R\u0015\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\"\u0010 R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0018R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u0010\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001cR\u0011\u0010\u0011\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001cR\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010!\u001a\u0004\b(\u0010 R\u0011\u0010\u0013\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001cR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0018¨\u0006@"}, d2 = {"Lcom/xiaomi/fitness/watch/face/edit/entity/DataItemImageNumber;", "", "name", "", "source", "ref", "totalDigits", "", "decimalDigits", "align", "leadingZero", "", "trailingZero", "unitIcon", "rotation", "", "space", "decimalOffsetX", "supportRecolor", "parameter", "renderRule", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;FIILjava/lang/Boolean;ILjava/lang/String;)V", "getName", "()Ljava/lang/String;", "getSource", "getRef", "getTotalDigits", "()I", "getDecimalDigits", "getAlign", "getLeadingZero", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getTrailingZero", "getUnitIcon", "getRotation", "()F", "getSpace", "getDecimalOffsetX", "getSupportRecolor", "getParameter", "getRenderRule", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;FIILjava/lang/Boolean;ILjava/lang/String;)Lcom/xiaomi/fitness/watch/face/edit/entity/DataItemImageNumber;", "equals", "other", "hashCode", "toString", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DataItemImageNumber {

    @Nullable
    private final String align;
    private final int decimalDigits;
    private final int decimalOffsetX;

    @Nullable
    private final Boolean leadingZero;

    @Nullable
    private final String name;
    private final int parameter;

    @Nullable
    private final String ref;

    @Nullable
    private final String renderRule;
    private final float rotation;

    @Nullable
    private final String source;
    private final int space;

    @Nullable
    private final Boolean supportRecolor;
    private final int totalDigits;

    @Nullable
    private final Boolean trailingZero;

    @Nullable
    private final String unitIcon;

    public DataItemImageNumber() {
        this(null, null, null, 0, 0, null, null, null, null, 0.0f, 0, 0, null, 0, null, 32767, null);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final float getRotation() {
        return this.rotation;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getSpace() {
        return this.space;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final int getDecimalOffsetX() {
        return this.decimalOffsetX;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Boolean getSupportRecolor() {
        return this.supportRecolor;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final int getParameter() {
        return this.parameter;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
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

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getTotalDigits() {
        return this.totalDigits;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getDecimalDigits() {
        return this.decimalDigits;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getAlign() {
        return this.align;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Boolean getLeadingZero() {
        return this.leadingZero;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Boolean getTrailingZero() {
        return this.trailingZero;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getUnitIcon() {
        return this.unitIcon;
    }

    @NotNull
    public final DataItemImageNumber copy(@Nullable String name, @Nullable String source, @Nullable String ref, int totalDigits, int decimalDigits, @Nullable String align, @Nullable Boolean leadingZero, @Nullable Boolean trailingZero, @Nullable String unitIcon, float rotation, int space, int decimalOffsetX, @Nullable Boolean supportRecolor, int parameter, @Nullable String renderRule) {
        return new DataItemImageNumber(name, source, ref, totalDigits, decimalDigits, align, leadingZero, trailingZero, unitIcon, rotation, space, decimalOffsetX, supportRecolor, parameter, renderRule);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DataItemImageNumber)) {
            return false;
        }
        DataItemImageNumber dataItemImageNumber = (DataItemImageNumber) other;
        return Intrinsics.areEqual(this.name, dataItemImageNumber.name) && Intrinsics.areEqual(this.source, dataItemImageNumber.source) && Intrinsics.areEqual(this.ref, dataItemImageNumber.ref) && this.totalDigits == dataItemImageNumber.totalDigits && this.decimalDigits == dataItemImageNumber.decimalDigits && Intrinsics.areEqual(this.align, dataItemImageNumber.align) && Intrinsics.areEqual(this.leadingZero, dataItemImageNumber.leadingZero) && Intrinsics.areEqual(this.trailingZero, dataItemImageNumber.trailingZero) && Intrinsics.areEqual(this.unitIcon, dataItemImageNumber.unitIcon) && Float.compare(this.rotation, dataItemImageNumber.rotation) == 0 && this.space == dataItemImageNumber.space && this.decimalOffsetX == dataItemImageNumber.decimalOffsetX && Intrinsics.areEqual(this.supportRecolor, dataItemImageNumber.supportRecolor) && this.parameter == dataItemImageNumber.parameter && Intrinsics.areEqual(this.renderRule, dataItemImageNumber.renderRule);
    }

    @Nullable
    public final String getAlign() {
        return this.align;
    }

    public final int getDecimalDigits() {
        return this.decimalDigits;
    }

    public final int getDecimalOffsetX() {
        return this.decimalOffsetX;
    }

    @Nullable
    public final Boolean getLeadingZero() {
        return this.leadingZero;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    public final int getParameter() {
        return this.parameter;
    }

    @Nullable
    public final String getRef() {
        return this.ref;
    }

    @Nullable
    public final String getRenderRule() {
        return this.renderRule;
    }

    public final float getRotation() {
        return this.rotation;
    }

    @Nullable
    public final String getSource() {
        return this.source;
    }

    public final int getSpace() {
        return this.space;
    }

    @Nullable
    public final Boolean getSupportRecolor() {
        return this.supportRecolor;
    }

    public final int getTotalDigits() {
        return this.totalDigits;
    }

    @Nullable
    public final Boolean getTrailingZero() {
        return this.trailingZero;
    }

    @Nullable
    public final String getUnitIcon() {
        return this.unitIcon;
    }

    public int hashCode() {
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.source;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.ref;
        int iHashCode3 = (((((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + Integer.hashCode(this.totalDigits)) * 31) + Integer.hashCode(this.decimalDigits)) * 31;
        String str4 = this.align;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.leadingZero;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.trailingZero;
        int iHashCode6 = (iHashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str5 = this.unitIcon;
        int iHashCode7 = (((((((iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31) + Float.hashCode(this.rotation)) * 31) + Integer.hashCode(this.space)) * 31) + Integer.hashCode(this.decimalOffsetX)) * 31;
        Boolean bool3 = this.supportRecolor;
        int iHashCode8 = (((iHashCode7 + (bool3 == null ? 0 : bool3.hashCode())) * 31) + Integer.hashCode(this.parameter)) * 31;
        String str6 = this.renderRule;
        return iHashCode8 + (str6 != null ? str6.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "DataItemImageNumber(name=" + this.name + ", source=" + this.source + ", ref=" + this.ref + ", totalDigits=" + this.totalDigits + ", decimalDigits=" + this.decimalDigits + ", align=" + this.align + ", leadingZero=" + this.leadingZero + ", trailingZero=" + this.trailingZero + ", unitIcon=" + this.unitIcon + ", rotation=" + this.rotation + ", space=" + this.space + ", decimalOffsetX=" + this.decimalOffsetX + ", supportRecolor=" + this.supportRecolor + ", parameter=" + this.parameter + ", renderRule=" + this.renderRule + ")";
    }

    public DataItemImageNumber(@Nullable String str, @Nullable String str2, @Nullable String str3, int i, int i2, @Nullable String str4, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable String str5, float f, int i3, int i4, @Nullable Boolean bool3, int i5, @Nullable String str6) {
        this.name = str;
        this.source = str2;
        this.ref = str3;
        this.totalDigits = i;
        this.decimalDigits = i2;
        this.align = str4;
        this.leadingZero = bool;
        this.trailingZero = bool2;
        this.unitIcon = str5;
        this.rotation = f;
        this.space = i3;
        this.decimalOffsetX = i4;
        this.supportRecolor = bool3;
        this.parameter = i5;
        this.renderRule = str6;
    }

    public /* synthetic */ DataItemImageNumber(String str, String str2, String str3, int i, int i2, String str4, Boolean bool, Boolean bool2, String str5, float f, int i3, int i4, Boolean bool3, int i5, String str6, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? null : str, (i6 & 2) != 0 ? null : str2, (i6 & 4) != 0 ? null : str3, (i6 & 8) != 0 ? 0 : i, (i6 & 16) != 0 ? 0 : i2, (i6 & 32) != 0 ? null : str4, (i6 & 64) != 0 ? null : bool, (i6 & 128) != 0 ? null : bool2, (i6 & 256) != 0 ? null : str5, (i6 & 512) != 0 ? 0.0f : f, (i6 & 1024) != 0 ? 0 : i3, (i6 & 2048) != 0 ? 0 : i4, (i6 & 4096) != 0 ? null : bool3, (i6 & 8192) == 0 ? i5 : 0, (i6 & 16384) != 0 ? null : str6);
    }
}
