package com.xiaomi.fitness.notify.data;

import com.xiaomi.wearable.hm.BroadcastsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BW\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0004HÆ\u0003Ji\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0004HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010¨\u0006&"}, d2 = {"Lcom/xiaomi/fitness/notify/data/FocusNotificationParamV2ProgressInfo;", "", BroadcastsKt.SILENT_PUSHING_PROGRESS, "colorProgress", "", "colorProgressEnd", "picForward", "picMiddleUnselected", "picMiddle", "picEndUnselected", "picEnd", "<init>", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getProgress", "()Ljava/lang/Object;", "getColorProgress", "()Ljava/lang/String;", "getColorProgressEnd", "getPicForward", "getPicMiddleUnselected", "getPicMiddle", "getPicEndUnselected", "getPicEnd", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "notify-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class FocusNotificationParamV2ProgressInfo {

    @Nullable
    private final String colorProgress;

    @Nullable
    private final String colorProgressEnd;

    @Nullable
    private final String picEnd;

    @Nullable
    private final String picEndUnselected;

    @Nullable
    private final String picForward;

    @Nullable
    private final String picMiddle;

    @Nullable
    private final String picMiddleUnselected;

    @Nullable
    private final Object progress;

    public FocusNotificationParamV2ProgressInfo(@Nullable Object obj, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7) {
        this.progress = obj;
        this.colorProgress = str;
        this.colorProgressEnd = str2;
        this.picForward = str3;
        this.picMiddleUnselected = str4;
        this.picMiddle = str5;
        this.picEndUnselected = str6;
        this.picEnd = str7;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Object getProgress() {
        return this.progress;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getColorProgress() {
        return this.colorProgress;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getColorProgressEnd() {
        return this.colorProgressEnd;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPicForward() {
        return this.picForward;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getPicMiddleUnselected() {
        return this.picMiddleUnselected;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getPicMiddle() {
        return this.picMiddle;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getPicEndUnselected() {
        return this.picEndUnselected;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getPicEnd() {
        return this.picEnd;
    }

    @NotNull
    public final FocusNotificationParamV2ProgressInfo copy(@Nullable Object progress, @Nullable String colorProgress, @Nullable String colorProgressEnd, @Nullable String picForward, @Nullable String picMiddleUnselected, @Nullable String picMiddle, @Nullable String picEndUnselected, @Nullable String picEnd) {
        return new FocusNotificationParamV2ProgressInfo(progress, colorProgress, colorProgressEnd, picForward, picMiddleUnselected, picMiddle, picEndUnselected, picEnd);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FocusNotificationParamV2ProgressInfo)) {
            return false;
        }
        FocusNotificationParamV2ProgressInfo focusNotificationParamV2ProgressInfo = (FocusNotificationParamV2ProgressInfo) other;
        return Intrinsics.areEqual(this.progress, focusNotificationParamV2ProgressInfo.progress) && Intrinsics.areEqual(this.colorProgress, focusNotificationParamV2ProgressInfo.colorProgress) && Intrinsics.areEqual(this.colorProgressEnd, focusNotificationParamV2ProgressInfo.colorProgressEnd) && Intrinsics.areEqual(this.picForward, focusNotificationParamV2ProgressInfo.picForward) && Intrinsics.areEqual(this.picMiddleUnselected, focusNotificationParamV2ProgressInfo.picMiddleUnselected) && Intrinsics.areEqual(this.picMiddle, focusNotificationParamV2ProgressInfo.picMiddle) && Intrinsics.areEqual(this.picEndUnselected, focusNotificationParamV2ProgressInfo.picEndUnselected) && Intrinsics.areEqual(this.picEnd, focusNotificationParamV2ProgressInfo.picEnd);
    }

    @Nullable
    public final String getColorProgress() {
        return this.colorProgress;
    }

    @Nullable
    public final String getColorProgressEnd() {
        return this.colorProgressEnd;
    }

    @Nullable
    public final String getPicEnd() {
        return this.picEnd;
    }

    @Nullable
    public final String getPicEndUnselected() {
        return this.picEndUnselected;
    }

    @Nullable
    public final String getPicForward() {
        return this.picForward;
    }

    @Nullable
    public final String getPicMiddle() {
        return this.picMiddle;
    }

    @Nullable
    public final String getPicMiddleUnselected() {
        return this.picMiddleUnselected;
    }

    @Nullable
    public final Object getProgress() {
        return this.progress;
    }

    public int hashCode() {
        Object obj = this.progress;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        String str = this.colorProgress;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.colorProgressEnd;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.picForward;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.picMiddleUnselected;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.picMiddle;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.picEndUnselected;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.picEnd;
        return iHashCode7 + (str7 != null ? str7.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "FocusNotificationParamV2ProgressInfo(progress=" + this.progress + ", colorProgress=" + this.colorProgress + ", colorProgressEnd=" + this.colorProgressEnd + ", picForward=" + this.picForward + ", picMiddleUnselected=" + this.picMiddleUnselected + ", picMiddle=" + this.picMiddle + ", picEndUnselected=" + this.picEndUnselected + ", picEnd=" + this.picEnd + ")";
    }
}
