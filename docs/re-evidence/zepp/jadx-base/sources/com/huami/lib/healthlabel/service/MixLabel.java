package com.huami.lib.healthlabel.service;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.exoplayer2.text.ttml.b;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b5\b\u0086\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0004\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\u0006\u0010\u0012\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0013\u001a\u00020\t\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\t\u0012\u0006\u0010\u0016\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b<\u0010=J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\u000b\u001a\u00020\u0002HÆ\u0003J\t\u0010\f\u001a\u00020\tHÆ\u0003J\t\u0010\r\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003Je\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u00072\b\b\u0002\u0010\u0013\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\t2\b\b\u0002\u0010\u0016\u001a\u00020\u00042\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\t\u0010\u0019\u001a\u00020\u0004HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u001c\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u0019\u0010\u0010\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\u0011\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b'\u0010$\u001a\u0004\b(\u0010&R\u0019\u0010\u0012\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b\u0012\u0010+R\"\u0010\u0013\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u0010\u0014\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010\u001e\u001a\u0004\b3\u0010 \"\u0004\b4\u0010\"R\"\u0010\u0015\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u0010-\u001a\u0004\b6\u0010/\"\u0004\b7\u00101R\u0019\u0010\u0016\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b8\u0010$\u001a\u0004\b9\u0010&R\u001b\u0010\u0017\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b:\u0010$\u001a\u0004\b;\u0010&¨\u0006>"}, d2 = {"Lcom/huami/lib/healthlabel/service/MixLabel;", "", "", "component1", "", "component2", "component3", "", "component4", "", "component5", "component6", "component7", "component8", "component9", "labelId", "labelText", "labelColor", "isShow", "timestamp", "clickCount", "sort", b.H, "reason", "copy", "toString", "hashCode", "other", "equals", "a", LogUtil.I, "getLabelId", "()I", "setLabelId", "(I)V", "b", "Ljava/lang/String;", "getLabelText", "()Ljava/lang/String;", "c", "getLabelColor", GoogleApiAvailabilityLight.a, "Z", "()Z", "e", "J", "getTimestamp", "()J", "setTimestamp", "(J)V", "f", "getClickCount", "setClickCount", "g", "getSort", "setSort", "h", "getBackgroundColor", "i", "getReason", "<init>", "(ILjava/lang/String;Ljava/lang/String;ZJIJLjava/lang/String;Ljava/lang/String;)V", "healthLabel-service_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class MixLabel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private int labelId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String labelText;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final String labelColor;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final boolean isShow;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private long timestamp;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    private int clickCount;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    private long sort;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    @NotNull
    private final String backgroundColor;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    @Nullable
    private final String reason;

    public MixLabel(int i, @NotNull String str, @NotNull String str2, boolean z, long j, int i2, long j2, @NotNull String str3, @Nullable String str4) {
        this.labelId = i;
        this.labelText = str;
        this.labelColor = str2;
        this.isShow = z;
        this.timestamp = j;
        this.clickCount = i2;
        this.sort = j2;
        this.backgroundColor = str3;
        this.reason = str4;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getLabelId() {
        return this.labelId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLabelText() {
        return this.labelText;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLabelColor() {
        return this.labelColor;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIsShow() {
        return this.isShow;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getClickCount() {
        return this.clickCount;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getSort() {
        return this.sort;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getReason() {
        return this.reason;
    }

    @NotNull
    public final MixLabel copy(int labelId, @NotNull String labelText, @NotNull String labelColor, boolean isShow, long timestamp, int clickCount, long sort, @NotNull String backgroundColor, @Nullable String reason) {
        return new MixLabel(labelId, labelText, labelColor, isShow, timestamp, clickCount, sort, backgroundColor, reason);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MixLabel)) {
            return false;
        }
        MixLabel mixLabel = (MixLabel) other;
        return this.labelId == mixLabel.labelId && Intrinsics.areEqual(this.labelText, mixLabel.labelText) && Intrinsics.areEqual(this.labelColor, mixLabel.labelColor) && this.isShow == mixLabel.isShow && this.timestamp == mixLabel.timestamp && this.clickCount == mixLabel.clickCount && this.sort == mixLabel.sort && Intrinsics.areEqual(this.backgroundColor, mixLabel.backgroundColor) && Intrinsics.areEqual(this.reason, mixLabel.reason);
    }

    @NotNull
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final int getClickCount() {
        return this.clickCount;
    }

    @NotNull
    public final String getLabelColor() {
        return this.labelColor;
    }

    public final int getLabelId() {
        return this.labelId;
    }

    @NotNull
    public final String getLabelText() {
        return this.labelText;
    }

    @Nullable
    public final String getReason() {
        return this.reason;
    }

    public final long getSort() {
        return this.sort;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [int] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    public int hashCode() {
        int iHashCode = ((((this.labelId * 31) + this.labelText.hashCode()) * 31) + this.labelColor.hashCode()) * 31;
        boolean z = this.isShow;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int iA = (((((((((iHashCode + r1) * 31) + defpackage.b.a(this.timestamp)) * 31) + this.clickCount) * 31) + defpackage.b.a(this.sort)) * 31) + this.backgroundColor.hashCode()) * 31;
        String str = this.reason;
        return iA + (str == null ? 0 : str.hashCode());
    }

    public final boolean isShow() {
        return this.isShow;
    }

    public final void setClickCount(int i) {
        this.clickCount = i;
    }

    public final void setLabelId(int i) {
        this.labelId = i;
    }

    public final void setSort(long j) {
        this.sort = j;
    }

    public final void setTimestamp(long j) {
        this.timestamp = j;
    }

    @NotNull
    public String toString() {
        return "MixLabel(labelId=" + this.labelId + ", labelText=" + this.labelText + ", labelColor=" + this.labelColor + ", isShow=" + this.isShow + ", timestamp=" + this.timestamp + ", clickCount=" + this.clickCount + ", sort=" + this.sort + ", backgroundColor=" + this.backgroundColor + ", reason=" + ((Object) this.reason) + ')';
    }

    public /* synthetic */ MixLabel(int i, String str, String str2, boolean z, long j, int i2, long j2, String str3, String str4, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, str2, z, (i3 & 16) != 0 ? 0L : j, (i3 & 32) != 0 ? 0 : i2, j2, str3, (i3 & 256) != 0 ? null : str4);
    }
}
