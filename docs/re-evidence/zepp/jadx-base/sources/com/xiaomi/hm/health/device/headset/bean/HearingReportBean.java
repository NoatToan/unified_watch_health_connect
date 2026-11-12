package com.xiaomi.hm.health.device.headset.bean;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import defpackage.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b#\b\u0086\b\u0018\u0000 72\u00020\u0001:\u00017BC\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0005¢\u0006\u0004\b5\u00106J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0005HÆ\u0003J\t\u0010\b\u001a\u00020\u0005HÆ\u0003J\t\u0010\t\u001a\u00020\u0005HÆ\u0003JE\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u0005HÆ\u0001J\t\u0010\u0012\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001cR\"\u0010\f\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010\r\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010!\u001a\u0004\b'\u0010#\"\u0004\b(\u0010%R\"\u0010\u000e\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010!\u001a\u0004\b*\u0010#\"\u0004\b+\u0010%R\"\u0010\u000f\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010!\u001a\u0004\b-\u0010#\"\u0004\b.\u0010%R\"\u00101\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104¨\u00068"}, d2 = {"Lcom/xiaomi/hm/health/device/headset/bean/HearingReportBean;", "", "", "component1", "component2", "", "component3", "component4", "component5", "component6", "leftUserTime", "rightUserTime", "leftInnerEarVolume", "rightInnerEarVolume", "leftScore", "rightScore", "copy", "", "toString", "hashCode", "other", "", "equals", "a", "J", "getLeftUserTime", "()J", "setLeftUserTime", "(J)V", "b", "getRightUserTime", "setRightUserTime", "c", LogUtil.I, "getLeftInnerEarVolume", "()I", "setLeftInnerEarVolume", "(I)V", GoogleApiAvailabilityLight.a, "getRightInnerEarVolume", "setRightInnerEarVolume", "e", "getLeftScore", "setLeftScore", "f", "getRightScore", "setRightScore", "g", "Z", "isRefreshUserTime", "()Z", "setRefreshUserTime", "(Z)V", "<init>", "(JJIIII)V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class HearingReportBean {
    public static final long EAR_USE_TIME_INVALID_VALUE = 4294967295L;
    public static final int INNER_EAR_VOLUME_INVALID_VALUE = 255;
    public static final int SCORE_INVALID_VALUE = 255;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private long leftUserTime;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private long rightUserTime;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private int leftInnerEarVolume;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private int rightInnerEarVolume;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private int leftScore;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    private int rightScore;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private boolean isRefreshUserTime;

    public HearingReportBean() {
        this(0L, 0L, 0, 0, 0, 0, 63, null);
    }

    public HearingReportBean(long j, long j2, int i, int i2, int i3, int i4) {
        this.leftUserTime = j;
        this.rightUserTime = j2;
        this.leftInnerEarVolume = i;
        this.rightInnerEarVolume = i2;
        this.leftScore = i3;
        this.rightScore = i4;
        this.isRefreshUserTime = true;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getLeftUserTime() {
        return this.leftUserTime;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getRightUserTime() {
        return this.rightUserTime;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getLeftInnerEarVolume() {
        return this.leftInnerEarVolume;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getRightInnerEarVolume() {
        return this.rightInnerEarVolume;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getLeftScore() {
        return this.leftScore;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getRightScore() {
        return this.rightScore;
    }

    @NotNull
    public final HearingReportBean copy(long leftUserTime, long rightUserTime, int leftInnerEarVolume, int rightInnerEarVolume, int leftScore, int rightScore) {
        return new HearingReportBean(leftUserTime, rightUserTime, leftInnerEarVolume, rightInnerEarVolume, leftScore, rightScore);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HearingReportBean)) {
            return false;
        }
        HearingReportBean hearingReportBean = (HearingReportBean) other;
        return this.leftUserTime == hearingReportBean.leftUserTime && this.rightUserTime == hearingReportBean.rightUserTime && this.leftInnerEarVolume == hearingReportBean.leftInnerEarVolume && this.rightInnerEarVolume == hearingReportBean.rightInnerEarVolume && this.leftScore == hearingReportBean.leftScore && this.rightScore == hearingReportBean.rightScore;
    }

    public final int getLeftInnerEarVolume() {
        return this.leftInnerEarVolume;
    }

    public final int getLeftScore() {
        return this.leftScore;
    }

    public final long getLeftUserTime() {
        return this.leftUserTime;
    }

    public final int getRightInnerEarVolume() {
        return this.rightInnerEarVolume;
    }

    public final int getRightScore() {
        return this.rightScore;
    }

    public final long getRightUserTime() {
        return this.rightUserTime;
    }

    public int hashCode() {
        return (((((((((b.a(this.leftUserTime) * 31) + b.a(this.rightUserTime)) * 31) + this.leftInnerEarVolume) * 31) + this.rightInnerEarVolume) * 31) + this.leftScore) * 31) + this.rightScore;
    }

    /* JADX INFO: renamed from: isRefreshUserTime, reason: from getter */
    public final boolean getIsRefreshUserTime() {
        return this.isRefreshUserTime;
    }

    public final void setLeftInnerEarVolume(int i) {
        this.leftInnerEarVolume = i;
    }

    public final void setLeftScore(int i) {
        this.leftScore = i;
    }

    public final void setLeftUserTime(long j) {
        this.leftUserTime = j;
    }

    public final void setRefreshUserTime(boolean z) {
        this.isRefreshUserTime = z;
    }

    public final void setRightInnerEarVolume(int i) {
        this.rightInnerEarVolume = i;
    }

    public final void setRightScore(int i) {
        this.rightScore = i;
    }

    public final void setRightUserTime(long j) {
        this.rightUserTime = j;
    }

    @NotNull
    public String toString() {
        return "HearingReportBean(leftUserTime=" + this.leftUserTime + ", rightUserTime=" + this.rightUserTime + ", leftInnerEarVolume=" + this.leftInnerEarVolume + ", rightInnerEarVolume=" + this.rightInnerEarVolume + ", leftScore=" + this.leftScore + ", rightScore=" + this.rightScore + ")";
    }

    public /* synthetic */ HearingReportBean(long j, long j2, int i, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? 4294967295L : j, (i5 & 2) == 0 ? j2 : 4294967295L, (i5 & 4) != 0 ? 255 : i, (i5 & 8) != 0 ? 255 : i2, (i5 & 16) != 0 ? 255 : i3, (i5 & 32) == 0 ? i4 : 255);
    }
}
