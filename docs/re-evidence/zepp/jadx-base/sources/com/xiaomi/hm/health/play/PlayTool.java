package com.xiaomi.hm.health.play;

import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.xiaomi.hm.health.smalltool.model.Tool;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b%\b\u0086\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\u0011\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u0012\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0013\u001a\u00020\n\u0012\b\b\u0002\u0010\u0014\u001a\u00020\n\u0012\b\b\u0002\u0010\u0015\u001a\u00020\n¢\u0006\u0004\b;\u0010<J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0007\u0010\u0006J\t\u0010\b\u001a\u00020\u0004HÆ\u0003J\t\u0010\t\u001a\u00020\u0004HÆ\u0003J\t\u0010\u000b\u001a\u00020\nHÆ\u0003J\t\u0010\f\u001a\u00020\nHÆ\u0003J\t\u0010\r\u001a\u00020\nHÆ\u0003Jd\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00022\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00042\b\b\u0003\u0010\u0011\u001a\u00020\u00042\b\b\u0003\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\n2\b\b\u0002\u0010\u0014\u001a\u00020\n2\b\b\u0002\u0010\u0015\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0019\u001a\u00020\u0018HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u001c\u001a\u00020\n2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u000e\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R$\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u0006\"\u0004\b$\u0010%R$\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010\"\u001a\u0004\b'\u0010\u0006\"\u0004\b(\u0010%R\"\u0010\u0011\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u0010\u0012\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010*\u001a\u0004\b0\u0010,\"\u0004\b1\u0010.R\"\u0010\u0013\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b\u0013\u00104\"\u0004\b5\u00106R\"\u0010\u0014\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u00103\u001a\u0004\b\u0014\u00104\"\u0004\b8\u00106R\"\u0010\u0015\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u00103\u001a\u0004\b\u0015\u00104\"\u0004\b:\u00106¨\u0006="}, d2 = {"Lcom/xiaomi/hm/health/play/PlayTool;", "", "Lcom/xiaomi/hm/health/smalltool/model/Tool;", "component1", "", "component2", "()Ljava/lang/Integer;", "component3", "component4", "component5", "", "component6", "component7", "component8", SessionDescription.s, "toolNameRes", "toolIconRes", "subTitleRes", "subLongTitleRes", "isDeviceActive", "isLongCard", "isShow", "copy", "(Lcom/xiaomi/hm/health/smalltool/model/Tool;Ljava/lang/Integer;Ljava/lang/Integer;IIZZZ)Lcom/xiaomi/hm/health/play/PlayTool;", "", "toString", "hashCode", "other", "equals", "a", "Lcom/xiaomi/hm/health/smalltool/model/Tool;", "getTool", "()Lcom/xiaomi/hm/health/smalltool/model/Tool;", "b", "Ljava/lang/Integer;", "getToolNameRes", "setToolNameRes", "(Ljava/lang/Integer;)V", "c", "getToolIconRes", "setToolIconRes", GoogleApiAvailabilityLight.a, LogUtil.I, "getSubTitleRes", "()I", "setSubTitleRes", "(I)V", "e", "getSubLongTitleRes", "setSubLongTitleRes", "f", "Z", "()Z", "setDeviceActive", "(Z)V", "g", "setLongCard", "h", "setShow", "<init>", "(Lcom/xiaomi/hm/health/smalltool/model/Tool;Ljava/lang/Integer;Ljava/lang/Integer;IIZZZ)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class PlayTool {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final Tool tool;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    private Integer toolNameRes;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    private Integer toolIconRes;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private int subTitleRes;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private int subLongTitleRes;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    private boolean isDeviceActive;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    private boolean isLongCard;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    private boolean isShow;

    public PlayTool(@NotNull Tool tool, @StringRes @Nullable Integer num, @DrawableRes @Nullable Integer num2, @StringRes int i, @StringRes int i2, boolean z, boolean z2, boolean z3) {
        this.tool = tool;
        this.toolNameRes = num;
        this.toolIconRes = num2;
        this.subTitleRes = i;
        this.subLongTitleRes = i2;
        this.isDeviceActive = z;
        this.isLongCard = z2;
        this.isShow = z3;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Tool getTool() {
        return this.tool;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getToolNameRes() {
        return this.toolNameRes;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getToolIconRes() {
        return this.toolIconRes;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getSubTitleRes() {
        return this.subTitleRes;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getSubLongTitleRes() {
        return this.subLongTitleRes;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getIsDeviceActive() {
        return this.isDeviceActive;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getIsLongCard() {
        return this.isLongCard;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getIsShow() {
        return this.isShow;
    }

    @NotNull
    public final PlayTool copy(@NotNull Tool tool, @StringRes @Nullable Integer toolNameRes, @DrawableRes @Nullable Integer toolIconRes, @StringRes int subTitleRes, @StringRes int subLongTitleRes, boolean isDeviceActive, boolean isLongCard, boolean isShow) {
        return new PlayTool(tool, toolNameRes, toolIconRes, subTitleRes, subLongTitleRes, isDeviceActive, isLongCard, isShow);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlayTool)) {
            return false;
        }
        PlayTool playTool = (PlayTool) other;
        return this.tool == playTool.tool && Intrinsics.areEqual(this.toolNameRes, playTool.toolNameRes) && Intrinsics.areEqual(this.toolIconRes, playTool.toolIconRes) && this.subTitleRes == playTool.subTitleRes && this.subLongTitleRes == playTool.subLongTitleRes && this.isDeviceActive == playTool.isDeviceActive && this.isLongCard == playTool.isLongCard && this.isShow == playTool.isShow;
    }

    public final int getSubLongTitleRes() {
        return this.subLongTitleRes;
    }

    public final int getSubTitleRes() {
        return this.subTitleRes;
    }

    @NotNull
    public final Tool getTool() {
        return this.tool;
    }

    @Nullable
    public final Integer getToolIconRes() {
        return this.toolIconRes;
    }

    @Nullable
    public final Integer getToolNameRes() {
        return this.toolNameRes;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [int] */
    /* JADX WARN: Type inference failed for: r0v13, types: [int] */
    /* JADX WARN: Type inference failed for: r0v15, types: [int] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v9, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v4 */
    public int hashCode() {
        int iHashCode = this.tool.hashCode() * 31;
        Integer num = this.toolNameRes;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.toolIconRes;
        int iHashCode3 = (((((iHashCode2 + (num2 != null ? num2.hashCode() : 0)) * 31) + this.subTitleRes) * 31) + this.subLongTitleRes) * 31;
        boolean z = this.isDeviceActive;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = (iHashCode3 + r1) * 31;
        boolean z2 = this.isLongCard;
        ?? r2 = z2;
        if (z2) {
            r2 = 1;
        }
        int i2 = (i + r2) * 31;
        boolean z3 = this.isShow;
        return i2 + (z3 ? 1 : z3);
    }

    public final boolean isDeviceActive() {
        return this.isDeviceActive;
    }

    public final boolean isLongCard() {
        return this.isLongCard;
    }

    public final boolean isShow() {
        return this.isShow;
    }

    public final void setDeviceActive(boolean z) {
        this.isDeviceActive = z;
    }

    public final void setLongCard(boolean z) {
        this.isLongCard = z;
    }

    public final void setShow(boolean z) {
        this.isShow = z;
    }

    public final void setSubLongTitleRes(int i) {
        this.subLongTitleRes = i;
    }

    public final void setSubTitleRes(int i) {
        this.subTitleRes = i;
    }

    public final void setToolIconRes(@Nullable Integer num) {
        this.toolIconRes = num;
    }

    public final void setToolNameRes(@Nullable Integer num) {
        this.toolNameRes = num;
    }

    @NotNull
    public String toString() {
        return "PlayTool(tool=" + this.tool + ", toolNameRes=" + this.toolNameRes + ", toolIconRes=" + this.toolIconRes + ", subTitleRes=" + this.subTitleRes + ", subLongTitleRes=" + this.subLongTitleRes + ", isDeviceActive=" + this.isDeviceActive + ", isLongCard=" + this.isLongCard + ", isShow=" + this.isShow + ")";
    }

    public /* synthetic */ PlayTool(Tool tool, Integer num, Integer num2, int i, int i2, boolean z, boolean z2, boolean z3, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(tool, (i3 & 2) != 0 ? null : num, (i3 & 4) == 0 ? num2 : null, (i3 & 8) != 0 ? 0 : i, (i3 & 16) != 0 ? 0 : i2, (i3 & 32) != 0 ? false : z, (i3 & 64) == 0 ? z2 : false, (i3 & 128) != 0 ? true : z3);
    }
}
