package com.fitness.banner.export.v2;

import com.example.statistics.export.OneTrackExtKt;
import com.google.gson.annotations.SerializedName;
import com.miui.tsmclient.entity.CardUIInfo;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiCursorConstants;
import com.xiaomi.fitness.health.sleep.ui.SleepAnimalShareActivity;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B¹\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0007HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u00109\u001a\u00020\u0003HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\u0011\u0010<\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0003J\u0010\u0010=\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010*J\u0010\u0010>\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010*J\u0010\u0010?\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010*J\u0010\u0010@\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010*J\u000b\u0010A\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\t\u0010B\u001a\u00020\u0003HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0019HÆ\u0003JÆ\u0001\u0010D\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00032\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÆ\u0001¢\u0006\u0002\u0010EJ\u0013\u0010F\u001a\u00020G2\b\u0010H\u001a\u0004\u0018\u00010IHÖ\u0003J\t\u0010J\u001a\u00020\u0003HÖ\u0001J\t\u0010K\u001a\u00020\u0007HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001dR\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001dR\u001e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010+\u001a\u0004\b)\u0010*R\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010+\u001a\u0004\b,\u0010*R\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010+\u001a\u0004\b-\u0010*R\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010+\u001a\u0004\b.\u0010*R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0016\u0010\u0017\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001dR\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u00103¨\u0006L"}, d2 = {"Lcom/fitness/banner/export/v2/BannerItemDetail;", "Ljava/io/Serializable;", "resourceId", "", "bannerId", "fitnessCardId", "mainTitle", "", CardUIInfo.KEY_SUBTITILE, "deliverStatisticType", "extendObj", "Lcom/fitness/banner/export/v2/ExtendObj;", "deliverType", "sourceList", "", "Lcom/fitness/banner/export/v2/SourceItem;", "startTime", "", "endTime", "createTime", "changeTime", "displayExtra", "Lcom/fitness/banner/export/v2/DisplayExtra;", "timeCategory", "repeatExtra", "Lcom/fitness/banner/export/v2/RepeatExtra;", "<init>", "(IIILjava/lang/String;Ljava/lang/String;ILcom/fitness/banner/export/v2/ExtendObj;ILjava/util/List;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Lcom/fitness/banner/export/v2/DisplayExtra;ILcom/fitness/banner/export/v2/RepeatExtra;)V", "getResourceId", "()I", "getBannerId", "getFitnessCardId", "getMainTitle", "()Ljava/lang/String;", "getSubTitle", "getDeliverStatisticType", "getExtendObj", "()Lcom/fitness/banner/export/v2/ExtendObj;", "getDeliverType", "getSourceList", "()Ljava/util/List;", "getStartTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getEndTime", "getCreateTime", "getChangeTime", "getDisplayExtra", "()Lcom/fitness/banner/export/v2/DisplayExtra;", "getTimeCategory", "getRepeatExtra", "()Lcom/fitness/banner/export/v2/RepeatExtra;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "copy", "(IIILjava/lang/String;Ljava/lang/String;ILcom/fitness/banner/export/v2/ExtendObj;ILjava/util/List;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Lcom/fitness/banner/export/v2/DisplayExtra;ILcom/fitness/banner/export/v2/RepeatExtra;)Lcom/fitness/banner/export/v2/BannerItemDetail;", "equals", "", "other", "", "hashCode", "toString", "banner-export_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class BannerItemDetail implements Serializable {

    @SerializedName("banner_id")
    private final int bannerId;

    @SerializedName("change_time")
    @Nullable
    private final Long changeTime;

    @SerializedName(MiuiCursorConstants.CREATE_TIME)
    @Nullable
    private final Long createTime;

    @SerializedName(OneTrackExtKt.KEY_DELIVER_STATISTIC_TYPE)
    private final int deliverStatisticType;

    @SerializedName("deliver_type")
    private final int deliverType;

    @SerializedName("display_extra")
    @Nullable
    private final DisplayExtra displayExtra;

    @SerializedName(SleepAnimalShareActivity.PARAM_ANIMAL_END_TIME)
    @Nullable
    private final Long endTime;

    @SerializedName("extend_field")
    @Nullable
    private final ExtendObj extendObj;

    @SerializedName("fitness_card_id")
    private final int fitnessCardId;

    @SerializedName("main_title")
    @NotNull
    private final String mainTitle;

    @SerializedName("repeat_extra")
    @Nullable
    private final RepeatExtra repeatExtra;

    @SerializedName("resource_id")
    private final int resourceId;

    @SerializedName("icon_jump_source")
    @Nullable
    private final List<SourceItem> sourceList;

    @SerializedName(SleepAnimalShareActivity.PARAM_ANIMAL_START_TIME)
    @Nullable
    private final Long startTime;

    @SerializedName("sub_title")
    @Nullable
    private final String subTitle;

    @SerializedName("time_category")
    private final int timeCategory;

    public BannerItemDetail(int i, int i2, int i3, @NotNull String mainTitle, @Nullable String str, int i4, @Nullable ExtendObj extendObj, int i5, @Nullable List<SourceItem> list, @Nullable Long l, @Nullable Long l2, @Nullable Long l3, @Nullable Long l4, @Nullable DisplayExtra displayExtra, int i6, @Nullable RepeatExtra repeatExtra) {
        Intrinsics.checkNotNullParameter(mainTitle, "mainTitle");
        this.resourceId = i;
        this.bannerId = i2;
        this.fitnessCardId = i3;
        this.mainTitle = mainTitle;
        this.subTitle = str;
        this.deliverStatisticType = i4;
        this.extendObj = extendObj;
        this.deliverType = i5;
        this.sourceList = list;
        this.startTime = l;
        this.endTime = l2;
        this.createTime = l3;
        this.changeTime = l4;
        this.displayExtra = displayExtra;
        this.timeCategory = i6;
        this.repeatExtra = repeatExtra;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getResourceId() {
        return this.resourceId;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Long getStartTime() {
        return this.startTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Long getEndTime() {
        return this.endTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Long getCreateTime() {
        return this.createTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Long getChangeTime() {
        return this.changeTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final DisplayExtra getDisplayExtra() {
        return this.displayExtra;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final int getTimeCategory() {
        return this.timeCategory;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final RepeatExtra getRepeatExtra() {
        return this.repeatExtra;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getBannerId() {
        return this.bannerId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getFitnessCardId() {
        return this.fitnessCardId;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getMainTitle() {
        return this.mainTitle;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSubTitle() {
        return this.subTitle;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getDeliverStatisticType() {
        return this.deliverStatisticType;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final ExtendObj getExtendObj() {
        return this.extendObj;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getDeliverType() {
        return this.deliverType;
    }

    @Nullable
    public final List<SourceItem> component9() {
        return this.sourceList;
    }

    @NotNull
    public final BannerItemDetail copy(int resourceId, int bannerId, int fitnessCardId, @NotNull String mainTitle, @Nullable String subTitle, int deliverStatisticType, @Nullable ExtendObj extendObj, int deliverType, @Nullable List<SourceItem> sourceList, @Nullable Long startTime, @Nullable Long endTime, @Nullable Long createTime, @Nullable Long changeTime, @Nullable DisplayExtra displayExtra, int timeCategory, @Nullable RepeatExtra repeatExtra) {
        Intrinsics.checkNotNullParameter(mainTitle, "mainTitle");
        return new BannerItemDetail(resourceId, bannerId, fitnessCardId, mainTitle, subTitle, deliverStatisticType, extendObj, deliverType, sourceList, startTime, endTime, createTime, changeTime, displayExtra, timeCategory, repeatExtra);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BannerItemDetail)) {
            return false;
        }
        BannerItemDetail bannerItemDetail = (BannerItemDetail) other;
        return this.resourceId == bannerItemDetail.resourceId && this.bannerId == bannerItemDetail.bannerId && this.fitnessCardId == bannerItemDetail.fitnessCardId && Intrinsics.areEqual(this.mainTitle, bannerItemDetail.mainTitle) && Intrinsics.areEqual(this.subTitle, bannerItemDetail.subTitle) && this.deliverStatisticType == bannerItemDetail.deliverStatisticType && Intrinsics.areEqual(this.extendObj, bannerItemDetail.extendObj) && this.deliverType == bannerItemDetail.deliverType && Intrinsics.areEqual(this.sourceList, bannerItemDetail.sourceList) && Intrinsics.areEqual(this.startTime, bannerItemDetail.startTime) && Intrinsics.areEqual(this.endTime, bannerItemDetail.endTime) && Intrinsics.areEqual(this.createTime, bannerItemDetail.createTime) && Intrinsics.areEqual(this.changeTime, bannerItemDetail.changeTime) && Intrinsics.areEqual(this.displayExtra, bannerItemDetail.displayExtra) && this.timeCategory == bannerItemDetail.timeCategory && Intrinsics.areEqual(this.repeatExtra, bannerItemDetail.repeatExtra);
    }

    public final int getBannerId() {
        return this.bannerId;
    }

    @Nullable
    public final Long getChangeTime() {
        return this.changeTime;
    }

    @Nullable
    public final Long getCreateTime() {
        return this.createTime;
    }

    public final int getDeliverStatisticType() {
        return this.deliverStatisticType;
    }

    public final int getDeliverType() {
        return this.deliverType;
    }

    @Nullable
    public final DisplayExtra getDisplayExtra() {
        return this.displayExtra;
    }

    @Nullable
    public final Long getEndTime() {
        return this.endTime;
    }

    @Nullable
    public final ExtendObj getExtendObj() {
        return this.extendObj;
    }

    public final int getFitnessCardId() {
        return this.fitnessCardId;
    }

    @NotNull
    public final String getMainTitle() {
        return this.mainTitle;
    }

    @Nullable
    public final RepeatExtra getRepeatExtra() {
        return this.repeatExtra;
    }

    public final int getResourceId() {
        return this.resourceId;
    }

    @Nullable
    public final List<SourceItem> getSourceList() {
        return this.sourceList;
    }

    @Nullable
    public final Long getStartTime() {
        return this.startTime;
    }

    @Nullable
    public final String getSubTitle() {
        return this.subTitle;
    }

    public final int getTimeCategory() {
        return this.timeCategory;
    }

    public int hashCode() {
        int iHashCode = ((((((Integer.hashCode(this.resourceId) * 31) + Integer.hashCode(this.bannerId)) * 31) + Integer.hashCode(this.fitnessCardId)) * 31) + this.mainTitle.hashCode()) * 31;
        String str = this.subTitle;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.deliverStatisticType)) * 31;
        ExtendObj extendObj = this.extendObj;
        int iHashCode3 = (((iHashCode2 + (extendObj == null ? 0 : extendObj.hashCode())) * 31) + Integer.hashCode(this.deliverType)) * 31;
        List<SourceItem> list = this.sourceList;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        Long l = this.startTime;
        int iHashCode5 = (iHashCode4 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.endTime;
        int iHashCode6 = (iHashCode5 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.createTime;
        int iHashCode7 = (iHashCode6 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.changeTime;
        int iHashCode8 = (iHashCode7 + (l4 == null ? 0 : l4.hashCode())) * 31;
        DisplayExtra displayExtra = this.displayExtra;
        int iHashCode9 = (((iHashCode8 + (displayExtra == null ? 0 : displayExtra.hashCode())) * 31) + Integer.hashCode(this.timeCategory)) * 31;
        RepeatExtra repeatExtra = this.repeatExtra;
        return iHashCode9 + (repeatExtra != null ? repeatExtra.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "BannerItemDetail(resourceId=" + this.resourceId + ", bannerId=" + this.bannerId + ", fitnessCardId=" + this.fitnessCardId + ", mainTitle=" + this.mainTitle + ", subTitle=" + this.subTitle + ", deliverStatisticType=" + this.deliverStatisticType + ", extendObj=" + this.extendObj + ", deliverType=" + this.deliverType + ", sourceList=" + this.sourceList + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", createTime=" + this.createTime + ", changeTime=" + this.changeTime + ", displayExtra=" + this.displayExtra + ", timeCategory=" + this.timeCategory + ", repeatExtra=" + this.repeatExtra + ")";
    }

    public /* synthetic */ BannerItemDetail(int i, int i2, int i3, String str, String str2, int i4, ExtendObj extendObj, int i5, List list, Long l, Long l2, Long l3, Long l4, DisplayExtra displayExtra, int i6, RepeatExtra repeatExtra, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, (i7 & 4) != 0 ? 0 : i3, (i7 & 8) != 0 ? "" : str, (i7 & 16) != 0 ? null : str2, (i7 & 32) != 0 ? 1 : i4, (i7 & 64) != 0 ? null : extendObj, i5, (i7 & 256) != 0 ? null : list, (i7 & 512) != 0 ? null : l, (i7 & 1024) != 0 ? null : l2, (i7 & 2048) != 0 ? null : l3, (i7 & 4096) != 0 ? null : l4, (i7 & 8192) != 0 ? null : displayExtra, (i7 & 16384) != 0 ? 0 : i6, (i7 & 32768) != 0 ? null : repeatExtra);
    }
}
