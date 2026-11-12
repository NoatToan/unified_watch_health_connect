package com.xiaomi.fitness.watch.face.data;

import com.fitness.banner.export.v2.BannerItemV2;
import com.xiaomi.fitness.watch.face.export.data.FaceData;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B[\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0006\u0010\u001c\u001a\u00020\u001dJ\u0006\u0010\u001e\u001a\u00020\u001dJ\u0006\u0010\u001f\u001a\u00020\u001dJ\u0006\u0010 \u001a\u00020\u001dJ\u0006\u0010!\u001a\u00020\u001dJ\u0006\u0010\"\u001a\u00020\u001dJ\u0011\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u000eHÆ\u0003J]\u0010)\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001J\u0013\u0010*\u001a\u00020\u001d2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020\u000eHÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006/"}, d2 = {"Lcom/xiaomi/fitness/watch/face/data/DeviceFaceMarketListItemWrapper;", "", "bannerList", "", "Lcom/fitness/banner/export/v2/BannerItemV2;", "recommendList", "Lcom/xiaomi/fitness/watch/face/data/DeviceFaceRecommendListItem;", "resourcePoolListItem", "Lcom/xiaomi/fitness/watch/face/data/DeviceFaceMarketIndexItem;", "tabData", "Lcom/xiaomi/fitness/watch/face/data/FaceListCommonTab;", "feedWatchFaceListItem", "Lcom/xiaomi/fitness/watch/face/export/data/FaceData;", "desItem", "", "<init>", "(Ljava/util/List;Ljava/util/List;Lcom/xiaomi/fitness/watch/face/data/DeviceFaceMarketIndexItem;Lcom/xiaomi/fitness/watch/face/data/FaceListCommonTab;Lcom/xiaomi/fitness/watch/face/export/data/FaceData;Ljava/lang/String;)V", "getBannerList", "()Ljava/util/List;", "getRecommendList", "getResourcePoolListItem", "()Lcom/xiaomi/fitness/watch/face/data/DeviceFaceMarketIndexItem;", "getTabData", "()Lcom/xiaomi/fitness/watch/face/data/FaceListCommonTab;", "getFeedWatchFaceListItem", "()Lcom/xiaomi/fitness/watch/face/export/data/FaceData;", "getDesItem", "()Ljava/lang/String;", "isBannerListType", "", "isRecommendListType", "isResourcePoolType", "isTabData", "isFeedWatchFaceType", "isDesItemType", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DeviceFaceMarketListItemWrapper {

    @Nullable
    private final List<BannerItemV2> bannerList;

    @Nullable
    private final String desItem;

    @Nullable
    private final FaceData feedWatchFaceListItem;

    @Nullable
    private final List<DeviceFaceRecommendListItem> recommendList;

    @Nullable
    private final DeviceFaceMarketIndexItem resourcePoolListItem;

    @Nullable
    private final FaceListCommonTab tabData;

    public DeviceFaceMarketListItemWrapper() {
        this(null, null, null, null, null, null, 63, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DeviceFaceMarketListItemWrapper copy$default(DeviceFaceMarketListItemWrapper deviceFaceMarketListItemWrapper, List list, List list2, DeviceFaceMarketIndexItem deviceFaceMarketIndexItem, FaceListCommonTab faceListCommonTab, FaceData faceData, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = deviceFaceMarketListItemWrapper.bannerList;
        }
        if ((i & 2) != 0) {
            list2 = deviceFaceMarketListItemWrapper.recommendList;
        }
        List list3 = list2;
        if ((i & 4) != 0) {
            deviceFaceMarketIndexItem = deviceFaceMarketListItemWrapper.resourcePoolListItem;
        }
        DeviceFaceMarketIndexItem deviceFaceMarketIndexItem2 = deviceFaceMarketIndexItem;
        if ((i & 8) != 0) {
            faceListCommonTab = deviceFaceMarketListItemWrapper.tabData;
        }
        FaceListCommonTab faceListCommonTab2 = faceListCommonTab;
        if ((i & 16) != 0) {
            faceData = deviceFaceMarketListItemWrapper.feedWatchFaceListItem;
        }
        FaceData faceData2 = faceData;
        if ((i & 32) != 0) {
            str = deviceFaceMarketListItemWrapper.desItem;
        }
        return deviceFaceMarketListItemWrapper.copy(list, list3, deviceFaceMarketIndexItem2, faceListCommonTab2, faceData2, str);
    }

    @Nullable
    public final List<BannerItemV2> component1() {
        return this.bannerList;
    }

    @Nullable
    public final List<DeviceFaceRecommendListItem> component2() {
        return this.recommendList;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final DeviceFaceMarketIndexItem getResourcePoolListItem() {
        return this.resourcePoolListItem;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final FaceListCommonTab getTabData() {
        return this.tabData;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final FaceData getFeedWatchFaceListItem() {
        return this.feedWatchFaceListItem;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getDesItem() {
        return this.desItem;
    }

    @NotNull
    public final DeviceFaceMarketListItemWrapper copy(@Nullable List<BannerItemV2> bannerList, @Nullable List<DeviceFaceRecommendListItem> recommendList, @Nullable DeviceFaceMarketIndexItem resourcePoolListItem, @Nullable FaceListCommonTab tabData, @Nullable FaceData feedWatchFaceListItem, @Nullable String desItem) {
        return new DeviceFaceMarketListItemWrapper(bannerList, recommendList, resourcePoolListItem, tabData, feedWatchFaceListItem, desItem);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceFaceMarketListItemWrapper)) {
            return false;
        }
        DeviceFaceMarketListItemWrapper deviceFaceMarketListItemWrapper = (DeviceFaceMarketListItemWrapper) other;
        return Intrinsics.areEqual(this.bannerList, deviceFaceMarketListItemWrapper.bannerList) && Intrinsics.areEqual(this.recommendList, deviceFaceMarketListItemWrapper.recommendList) && Intrinsics.areEqual(this.resourcePoolListItem, deviceFaceMarketListItemWrapper.resourcePoolListItem) && Intrinsics.areEqual(this.tabData, deviceFaceMarketListItemWrapper.tabData) && Intrinsics.areEqual(this.feedWatchFaceListItem, deviceFaceMarketListItemWrapper.feedWatchFaceListItem) && Intrinsics.areEqual(this.desItem, deviceFaceMarketListItemWrapper.desItem);
    }

    @Nullable
    public final List<BannerItemV2> getBannerList() {
        return this.bannerList;
    }

    @Nullable
    public final String getDesItem() {
        return this.desItem;
    }

    @Nullable
    public final FaceData getFeedWatchFaceListItem() {
        return this.feedWatchFaceListItem;
    }

    @Nullable
    public final List<DeviceFaceRecommendListItem> getRecommendList() {
        return this.recommendList;
    }

    @Nullable
    public final DeviceFaceMarketIndexItem getResourcePoolListItem() {
        return this.resourcePoolListItem;
    }

    @Nullable
    public final FaceListCommonTab getTabData() {
        return this.tabData;
    }

    public int hashCode() {
        List<BannerItemV2> list = this.bannerList;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<DeviceFaceRecommendListItem> list2 = this.recommendList;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        DeviceFaceMarketIndexItem deviceFaceMarketIndexItem = this.resourcePoolListItem;
        int iHashCode3 = (iHashCode2 + (deviceFaceMarketIndexItem == null ? 0 : deviceFaceMarketIndexItem.hashCode())) * 31;
        FaceListCommonTab faceListCommonTab = this.tabData;
        int iHashCode4 = (iHashCode3 + (faceListCommonTab == null ? 0 : faceListCommonTab.hashCode())) * 31;
        FaceData faceData = this.feedWatchFaceListItem;
        int iHashCode5 = (iHashCode4 + (faceData == null ? 0 : faceData.hashCode())) * 31;
        String str = this.desItem;
        return iHashCode5 + (str != null ? str.hashCode() : 0);
    }

    public final boolean isBannerListType() {
        List<BannerItemV2> list = this.bannerList;
        return list != null && !list.isEmpty() && this.recommendList == null && this.resourcePoolListItem == null && this.tabData == null && this.feedWatchFaceListItem == null && this.desItem == null;
    }

    public final boolean isDesItemType() {
        return this.desItem != null && this.resourcePoolListItem == null && this.bannerList == null && this.recommendList == null && this.tabData == null && this.feedWatchFaceListItem == null;
    }

    public final boolean isFeedWatchFaceType() {
        return this.feedWatchFaceListItem != null && this.bannerList == null && this.recommendList == null && this.resourcePoolListItem == null && this.tabData == null && this.desItem == null;
    }

    public final boolean isRecommendListType() {
        return this.recommendList != null && this.bannerList == null && this.resourcePoolListItem == null && this.tabData == null && this.feedWatchFaceListItem == null && this.desItem == null;
    }

    public final boolean isResourcePoolType() {
        return this.resourcePoolListItem != null && this.bannerList == null && this.recommendList == null && this.tabData == null && this.feedWatchFaceListItem == null && this.desItem == null;
    }

    public final boolean isTabData() {
        return this.tabData != null && this.resourcePoolListItem == null && this.bannerList == null && this.recommendList == null && this.feedWatchFaceListItem == null && this.desItem == null;
    }

    @NotNull
    public String toString() {
        return "DeviceFaceMarketListItemWrapper(bannerList=" + this.bannerList + ", recommendList=" + this.recommendList + ", resourcePoolListItem=" + this.resourcePoolListItem + ", tabData=" + this.tabData + ", feedWatchFaceListItem=" + this.feedWatchFaceListItem + ", desItem=" + this.desItem + ")";
    }

    public DeviceFaceMarketListItemWrapper(@Nullable List<BannerItemV2> list, @Nullable List<DeviceFaceRecommendListItem> list2, @Nullable DeviceFaceMarketIndexItem deviceFaceMarketIndexItem, @Nullable FaceListCommonTab faceListCommonTab, @Nullable FaceData faceData, @Nullable String str) {
        this.bannerList = list;
        this.recommendList = list2;
        this.resourcePoolListItem = deviceFaceMarketIndexItem;
        this.tabData = faceListCommonTab;
        this.feedWatchFaceListItem = faceData;
        this.desItem = str;
    }

    public /* synthetic */ DeviceFaceMarketListItemWrapper(List list, List list2, DeviceFaceMarketIndexItem deviceFaceMarketIndexItem, FaceListCommonTab faceListCommonTab, FaceData faceData, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? null : deviceFaceMarketIndexItem, (i & 8) != 0 ? null : faceListCommonTab, (i & 16) != 0 ? null : faceData, (i & 32) != 0 ? null : str);
    }
}
