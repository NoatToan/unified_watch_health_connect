package com.xiaomi.fitness.watch.face.data;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.fitness.watch.face.export.data.FaceData;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0007\u0012\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\u0011\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u0011\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007HÆ\u0003J\u0011\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J]\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00072\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00072\b\b\u0002\u0010\r\u001a\u00020\u0003HÆ\u0001J\u0013\u0010 \u001a\u00020\u00032\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020%HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011¨\u0006&"}, d2 = {"Lcom/xiaomi/fitness/watch/face/data/DeviceFaceIndexList;", "", "inWhiteList", "", "device_config", "Lcom/xiaomi/fitness/watch/face/data/DeviceFaceDeviceConfig;", "resource_pool_list", "", "Lcom/xiaomi/fitness/watch/face/data/DeviceFaceMarketIndexItem;", "feed_watchface_list", "Lcom/xiaomi/fitness/watch/face/export/data/FaceData;", "tab_list", "Lcom/xiaomi/fitness/watch/face/data/FaceListCommonTab;", "hasMore", "<init>", "(ZLcom/xiaomi/fitness/watch/face/data/DeviceFaceDeviceConfig;Ljava/util/List;Ljava/util/List;Ljava/util/List;Z)V", "getInWhiteList", "()Z", "getDevice_config", "()Lcom/xiaomi/fitness/watch/face/data/DeviceFaceDeviceConfig;", "getResource_pool_list", "()Ljava/util/List;", "getFeed_watchface_list", "getTab_list", "getHasMore", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DeviceFaceIndexList {

    @SerializedName("device_config")
    @NotNull
    private final DeviceFaceDeviceConfig device_config;

    @SerializedName("feed_watchface_list")
    @Nullable
    private final List<FaceData> feed_watchface_list;

    @SerializedName("has_more")
    private final boolean hasMore;

    @SerializedName("in_white_list")
    private final boolean inWhiteList;

    @SerializedName("resource_pool_list")
    @Nullable
    private final List<DeviceFaceMarketIndexItem> resource_pool_list;

    @Nullable
    private final List<FaceListCommonTab> tab_list;

    public DeviceFaceIndexList(boolean z, @NotNull DeviceFaceDeviceConfig device_config, @Nullable List<DeviceFaceMarketIndexItem> list, @Nullable List<FaceData> list2, @Nullable List<FaceListCommonTab> list3, boolean z2) {
        Intrinsics.checkNotNullParameter(device_config, "device_config");
        this.inWhiteList = z;
        this.device_config = device_config;
        this.resource_pool_list = list;
        this.feed_watchface_list = list2;
        this.tab_list = list3;
        this.hasMore = z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DeviceFaceIndexList copy$default(DeviceFaceIndexList deviceFaceIndexList, boolean z, DeviceFaceDeviceConfig deviceFaceDeviceConfig, List list, List list2, List list3, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = deviceFaceIndexList.inWhiteList;
        }
        if ((i & 2) != 0) {
            deviceFaceDeviceConfig = deviceFaceIndexList.device_config;
        }
        DeviceFaceDeviceConfig deviceFaceDeviceConfig2 = deviceFaceDeviceConfig;
        if ((i & 4) != 0) {
            list = deviceFaceIndexList.resource_pool_list;
        }
        List list4 = list;
        if ((i & 8) != 0) {
            list2 = deviceFaceIndexList.feed_watchface_list;
        }
        List list5 = list2;
        if ((i & 16) != 0) {
            list3 = deviceFaceIndexList.tab_list;
        }
        List list6 = list3;
        if ((i & 32) != 0) {
            z2 = deviceFaceIndexList.hasMore;
        }
        return deviceFaceIndexList.copy(z, deviceFaceDeviceConfig2, list4, list5, list6, z2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getInWhiteList() {
        return this.inWhiteList;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final DeviceFaceDeviceConfig getDevice_config() {
        return this.device_config;
    }

    @Nullable
    public final List<DeviceFaceMarketIndexItem> component3() {
        return this.resource_pool_list;
    }

    @Nullable
    public final List<FaceData> component4() {
        return this.feed_watchface_list;
    }

    @Nullable
    public final List<FaceListCommonTab> component5() {
        return this.tab_list;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getHasMore() {
        return this.hasMore;
    }

    @NotNull
    public final DeviceFaceIndexList copy(boolean inWhiteList, @NotNull DeviceFaceDeviceConfig device_config, @Nullable List<DeviceFaceMarketIndexItem> resource_pool_list, @Nullable List<FaceData> feed_watchface_list, @Nullable List<FaceListCommonTab> tab_list, boolean hasMore) {
        Intrinsics.checkNotNullParameter(device_config, "device_config");
        return new DeviceFaceIndexList(inWhiteList, device_config, resource_pool_list, feed_watchface_list, tab_list, hasMore);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceFaceIndexList)) {
            return false;
        }
        DeviceFaceIndexList deviceFaceIndexList = (DeviceFaceIndexList) other;
        return this.inWhiteList == deviceFaceIndexList.inWhiteList && Intrinsics.areEqual(this.device_config, deviceFaceIndexList.device_config) && Intrinsics.areEqual(this.resource_pool_list, deviceFaceIndexList.resource_pool_list) && Intrinsics.areEqual(this.feed_watchface_list, deviceFaceIndexList.feed_watchface_list) && Intrinsics.areEqual(this.tab_list, deviceFaceIndexList.tab_list) && this.hasMore == deviceFaceIndexList.hasMore;
    }

    @NotNull
    public final DeviceFaceDeviceConfig getDevice_config() {
        return this.device_config;
    }

    @Nullable
    public final List<FaceData> getFeed_watchface_list() {
        return this.feed_watchface_list;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final boolean getInWhiteList() {
        return this.inWhiteList;
    }

    @Nullable
    public final List<DeviceFaceMarketIndexItem> getResource_pool_list() {
        return this.resource_pool_list;
    }

    @Nullable
    public final List<FaceListCommonTab> getTab_list() {
        return this.tab_list;
    }

    public int hashCode() {
        int iHashCode = ((Boolean.hashCode(this.inWhiteList) * 31) + this.device_config.hashCode()) * 31;
        List<DeviceFaceMarketIndexItem> list = this.resource_pool_list;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<FaceData> list2 = this.feed_watchface_list;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<FaceListCommonTab> list3 = this.tab_list;
        return ((iHashCode3 + (list3 != null ? list3.hashCode() : 0)) * 31) + Boolean.hashCode(this.hasMore);
    }

    @NotNull
    public String toString() {
        return "DeviceFaceIndexList(inWhiteList=" + this.inWhiteList + ", device_config=" + this.device_config + ", resource_pool_list=" + this.resource_pool_list + ", feed_watchface_list=" + this.feed_watchface_list + ", tab_list=" + this.tab_list + ", hasMore=" + this.hasMore + ")";
    }
}
