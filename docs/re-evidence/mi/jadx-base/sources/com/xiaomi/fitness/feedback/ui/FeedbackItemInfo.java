package com.xiaomi.fitness.feedback.ui;

import com.xiaomi.fitness.feedback.bugreport.DeviceData;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\"\b\u0086\b\u0018\u0000 /2\u00020\u0001:\u0001/Be\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0011\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\fHÆ\u0003J\t\u0010(\u001a\u00020\u000eHÆ\u0003J\t\u0010)\u001a\u00020\u000eHÆ\u0003Jm\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000eHÆ\u0001J\u0013\u0010+\u001a\u00020\u000e2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020\u0003HÖ\u0001J\t\u0010.\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u000f\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010 ¨\u00060"}, d2 = {"Lcom/xiaomi/fitness/feedback/ui/FeedbackItemInfo;", "", "type", "", "title", "", "moduleId", "id", "sort", "deviceData", "Lcom/xiaomi/fitness/feedback/bugreport/DeviceData;", "subItemList", "", "hasFaq", "", "isEcoIot", "<init>", "(ILjava/lang/String;IIILcom/xiaomi/fitness/feedback/bugreport/DeviceData;Ljava/util/List;ZZ)V", "getType", "()I", "getTitle", "()Ljava/lang/String;", "getModuleId", "getId", "getSort", "getDeviceData", "()Lcom/xiaomi/fitness/feedback/bugreport/DeviceData;", "setDeviceData", "(Lcom/xiaomi/fitness/feedback/bugreport/DeviceData;)V", "getSubItemList", "()Ljava/util/List;", "getHasFaq", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "Companion", "feedback_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class FeedbackItemInfo {
    public static final int TYPE_APP = 12;
    public static final int TYPE_BOTTOM = 13;
    public static final int TYPE_DEVICE_ITEM = 11;
    public static final int TYPE_LABEL_ITEM = 10;

    @Nullable
    private DeviceData deviceData;
    private final boolean hasFaq;
    private final int id;
    private final boolean isEcoIot;
    private final int moduleId;
    private final int sort;

    @Nullable
    private final List<FeedbackItemInfo> subItemList;

    @NotNull
    private final String title;
    private final int type;

    public FeedbackItemInfo(int i, @NotNull String title, int i2, int i3, int i4, @Nullable DeviceData deviceData, @Nullable List<FeedbackItemInfo> list, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.type = i;
        this.title = title;
        this.moduleId = i2;
        this.id = i3;
        this.sort = i4;
        this.deviceData = deviceData;
        this.subItemList = list;
        this.hasFaq = z;
        this.isEcoIot = z2;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getType() {
        return this.type;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getModuleId() {
        return this.moduleId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getSort() {
        return this.sort;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final DeviceData getDeviceData() {
        return this.deviceData;
    }

    @Nullable
    public final List<FeedbackItemInfo> component7() {
        return this.subItemList;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getHasFaq() {
        return this.hasFaq;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getIsEcoIot() {
        return this.isEcoIot;
    }

    @NotNull
    public final FeedbackItemInfo copy(int type, @NotNull String title, int moduleId, int id, int sort, @Nullable DeviceData deviceData, @Nullable List<FeedbackItemInfo> subItemList, boolean hasFaq, boolean isEcoIot) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new FeedbackItemInfo(type, title, moduleId, id, sort, deviceData, subItemList, hasFaq, isEcoIot);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FeedbackItemInfo)) {
            return false;
        }
        FeedbackItemInfo feedbackItemInfo = (FeedbackItemInfo) other;
        return this.type == feedbackItemInfo.type && Intrinsics.areEqual(this.title, feedbackItemInfo.title) && this.moduleId == feedbackItemInfo.moduleId && this.id == feedbackItemInfo.id && this.sort == feedbackItemInfo.sort && Intrinsics.areEqual(this.deviceData, feedbackItemInfo.deviceData) && Intrinsics.areEqual(this.subItemList, feedbackItemInfo.subItemList) && this.hasFaq == feedbackItemInfo.hasFaq && this.isEcoIot == feedbackItemInfo.isEcoIot;
    }

    @Nullable
    public final DeviceData getDeviceData() {
        return this.deviceData;
    }

    public final boolean getHasFaq() {
        return this.hasFaq;
    }

    public final int getId() {
        return this.id;
    }

    public final int getModuleId() {
        return this.moduleId;
    }

    public final int getSort() {
        return this.sort;
    }

    @Nullable
    public final List<FeedbackItemInfo> getSubItemList() {
        return this.subItemList;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = ((((((((Integer.hashCode(this.type) * 31) + this.title.hashCode()) * 31) + Integer.hashCode(this.moduleId)) * 31) + Integer.hashCode(this.id)) * 31) + Integer.hashCode(this.sort)) * 31;
        DeviceData deviceData = this.deviceData;
        int iHashCode2 = (iHashCode + (deviceData == null ? 0 : deviceData.hashCode())) * 31;
        List<FeedbackItemInfo> list = this.subItemList;
        return ((((iHashCode2 + (list != null ? list.hashCode() : 0)) * 31) + Boolean.hashCode(this.hasFaq)) * 31) + Boolean.hashCode(this.isEcoIot);
    }

    public final boolean isEcoIot() {
        return this.isEcoIot;
    }

    public final void setDeviceData(@Nullable DeviceData deviceData) {
        this.deviceData = deviceData;
    }

    @NotNull
    public String toString() {
        return "FeedbackItemInfo(type=" + this.type + ", title=" + this.title + ", moduleId=" + this.moduleId + ", id=" + this.id + ", sort=" + this.sort + ", deviceData=" + this.deviceData + ", subItemList=" + this.subItemList + ", hasFaq=" + this.hasFaq + ", isEcoIot=" + this.isEcoIot + ")";
    }

    public /* synthetic */ FeedbackItemInfo(int i, String str, int i2, int i3, int i4, DeviceData deviceData, List list, boolean z, boolean z2, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, i2, (i5 & 8) != 0 ? -1 : i3, (i5 & 16) != 0 ? 1 : i4, (i5 & 32) != 0 ? null : deviceData, (i5 & 64) != 0 ? null : list, (i5 & 128) != 0 ? false : z, (i5 & 256) != 0 ? false : z2);
    }
}
