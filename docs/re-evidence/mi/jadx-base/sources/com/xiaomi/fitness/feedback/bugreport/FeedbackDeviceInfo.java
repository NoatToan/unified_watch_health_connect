package com.xiaomi.fitness.feedback.bugreport;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003J\t\u0010!\u001a\u00020\fHÆ\u0003J\t\u0010\"\u001a\u00020\fHÆ\u0003J[\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001J\u0013\u0010$\u001a\u00020\f2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\u0005HÖ\u0001J\t\u0010'\u001a\u00020\u0007HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u001a¨\u0006("}, d2 = {"Lcom/xiaomi/fitness/feedback/bugreport/FeedbackDeviceInfo;", "", "deviceData", "Lcom/xiaomi/fitness/feedback/bugreport/DeviceData;", "type", "", "appName", "", "tagId", "wideTagId", "wideTagContent", "hasFaq", "", "isEcoIot", "<init>", "(Lcom/xiaomi/fitness/feedback/bugreport/DeviceData;ILjava/lang/String;IILjava/lang/String;ZZ)V", "getDeviceData", "()Lcom/xiaomi/fitness/feedback/bugreport/DeviceData;", "getType", "()I", "getAppName", "()Ljava/lang/String;", "getTagId", "getWideTagId", "getWideTagContent", "getHasFaq", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "toString", "feedback_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class FeedbackDeviceInfo {

    @NotNull
    private final String appName;

    @Nullable
    private final DeviceData deviceData;
    private final boolean hasFaq;
    private final boolean isEcoIot;
    private final int tagId;
    private final int type;

    @NotNull
    private final String wideTagContent;
    private final int wideTagId;

    public FeedbackDeviceInfo(@Nullable DeviceData deviceData, int i, @NotNull String appName, int i2, int i3, @NotNull String wideTagContent, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(appName, "appName");
        Intrinsics.checkNotNullParameter(wideTagContent, "wideTagContent");
        this.deviceData = deviceData;
        this.type = i;
        this.appName = appName;
        this.tagId = i2;
        this.wideTagId = i3;
        this.wideTagContent = wideTagContent;
        this.hasFaq = z;
        this.isEcoIot = z2;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final DeviceData getDeviceData() {
        return this.deviceData;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getType() {
        return this.type;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAppName() {
        return this.appName;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getTagId() {
        return this.tagId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getWideTagId() {
        return this.wideTagId;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getWideTagContent() {
        return this.wideTagContent;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getHasFaq() {
        return this.hasFaq;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getIsEcoIot() {
        return this.isEcoIot;
    }

    @NotNull
    public final FeedbackDeviceInfo copy(@Nullable DeviceData deviceData, int type, @NotNull String appName, int tagId, int wideTagId, @NotNull String wideTagContent, boolean hasFaq, boolean isEcoIot) {
        Intrinsics.checkNotNullParameter(appName, "appName");
        Intrinsics.checkNotNullParameter(wideTagContent, "wideTagContent");
        return new FeedbackDeviceInfo(deviceData, type, appName, tagId, wideTagId, wideTagContent, hasFaq, isEcoIot);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FeedbackDeviceInfo)) {
            return false;
        }
        FeedbackDeviceInfo feedbackDeviceInfo = (FeedbackDeviceInfo) other;
        return Intrinsics.areEqual(this.deviceData, feedbackDeviceInfo.deviceData) && this.type == feedbackDeviceInfo.type && Intrinsics.areEqual(this.appName, feedbackDeviceInfo.appName) && this.tagId == feedbackDeviceInfo.tagId && this.wideTagId == feedbackDeviceInfo.wideTagId && Intrinsics.areEqual(this.wideTagContent, feedbackDeviceInfo.wideTagContent) && this.hasFaq == feedbackDeviceInfo.hasFaq && this.isEcoIot == feedbackDeviceInfo.isEcoIot;
    }

    @NotNull
    public final String getAppName() {
        return this.appName;
    }

    @Nullable
    public final DeviceData getDeviceData() {
        return this.deviceData;
    }

    public final boolean getHasFaq() {
        return this.hasFaq;
    }

    public final int getTagId() {
        return this.tagId;
    }

    public final int getType() {
        return this.type;
    }

    @NotNull
    public final String getWideTagContent() {
        return this.wideTagContent;
    }

    public final int getWideTagId() {
        return this.wideTagId;
    }

    public int hashCode() {
        DeviceData deviceData = this.deviceData;
        return ((((((((((((((deviceData == null ? 0 : deviceData.hashCode()) * 31) + Integer.hashCode(this.type)) * 31) + this.appName.hashCode()) * 31) + Integer.hashCode(this.tagId)) * 31) + Integer.hashCode(this.wideTagId)) * 31) + this.wideTagContent.hashCode()) * 31) + Boolean.hashCode(this.hasFaq)) * 31) + Boolean.hashCode(this.isEcoIot);
    }

    public final boolean isEcoIot() {
        return this.isEcoIot;
    }

    @NotNull
    public String toString() {
        return "FeedbackDeviceInfo(deviceData=" + this.deviceData + ", type=" + this.type + ", appName=" + this.appName + ", tagId=" + this.tagId + ", wideTagId=" + this.wideTagId + ", wideTagContent=" + this.wideTagContent + ", hasFaq=" + this.hasFaq + ", isEcoIot=" + this.isEcoIot + ")";
    }

    public /* synthetic */ FeedbackDeviceInfo(DeviceData deviceData, int i, String str, int i2, int i3, String str2, boolean z, boolean z2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(deviceData, i, (i4 & 4) != 0 ? "" : str, (i4 & 8) != 0 ? -1 : i2, (i4 & 16) != 0 ? -1 : i3, (i4 & 32) != 0 ? "" : str2, (i4 & 64) != 0 ? false : z, (i4 & 128) != 0 ? false : z2);
    }
}
