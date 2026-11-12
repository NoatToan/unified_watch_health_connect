package com.xiaomi.fitness.watch.face.data;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.fitness.watch.face.export.data.FaceData;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\nHÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006 "}, d2 = {"Lcom/xiaomi/fitness/watch/face/data/FaceEntranceRespV4;", "", "deviceConfig", "Lcom/xiaomi/fitness/watch/face/data/FaceDeviceConfig;", "faceList", "", "Lcom/xiaomi/fitness/watch/face/export/data/FaceData;", "inWhiteList", "", "recentOnlineData", "Lcom/xiaomi/fitness/watch/face/data/RecentOnlineData;", "<init>", "(Lcom/xiaomi/fitness/watch/face/data/FaceDeviceConfig;Ljava/util/List;ZLcom/xiaomi/fitness/watch/face/data/RecentOnlineData;)V", "getDeviceConfig", "()Lcom/xiaomi/fitness/watch/face/data/FaceDeviceConfig;", "getFaceList", "()Ljava/util/List;", "getInWhiteList", "()Z", "getRecentOnlineData", "()Lcom/xiaomi/fitness/watch/face/data/RecentOnlineData;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "watch-face-export_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class FaceEntranceRespV4 {

    @SerializedName("device_config")
    @NotNull
    private final FaceDeviceConfig deviceConfig;

    @SerializedName("watchface_list")
    @Nullable
    private final List<FaceData> faceList;

    @SerializedName("in_white_list")
    private final boolean inWhiteList;

    @SerializedName("recent_online")
    @Nullable
    private final RecentOnlineData recentOnlineData;

    public FaceEntranceRespV4(@NotNull FaceDeviceConfig deviceConfig, @Nullable List<FaceData> list, boolean z, @Nullable RecentOnlineData recentOnlineData) {
        Intrinsics.checkNotNullParameter(deviceConfig, "deviceConfig");
        this.deviceConfig = deviceConfig;
        this.faceList = list;
        this.inWhiteList = z;
        this.recentOnlineData = recentOnlineData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FaceEntranceRespV4 copy$default(FaceEntranceRespV4 faceEntranceRespV4, FaceDeviceConfig faceDeviceConfig, List list, boolean z, RecentOnlineData recentOnlineData, int i, Object obj) {
        if ((i & 1) != 0) {
            faceDeviceConfig = faceEntranceRespV4.deviceConfig;
        }
        if ((i & 2) != 0) {
            list = faceEntranceRespV4.faceList;
        }
        if ((i & 4) != 0) {
            z = faceEntranceRespV4.inWhiteList;
        }
        if ((i & 8) != 0) {
            recentOnlineData = faceEntranceRespV4.recentOnlineData;
        }
        return faceEntranceRespV4.copy(faceDeviceConfig, list, z, recentOnlineData);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final FaceDeviceConfig getDeviceConfig() {
        return this.deviceConfig;
    }

    @Nullable
    public final List<FaceData> component2() {
        return this.faceList;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getInWhiteList() {
        return this.inWhiteList;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final RecentOnlineData getRecentOnlineData() {
        return this.recentOnlineData;
    }

    @NotNull
    public final FaceEntranceRespV4 copy(@NotNull FaceDeviceConfig deviceConfig, @Nullable List<FaceData> faceList, boolean inWhiteList, @Nullable RecentOnlineData recentOnlineData) {
        Intrinsics.checkNotNullParameter(deviceConfig, "deviceConfig");
        return new FaceEntranceRespV4(deviceConfig, faceList, inWhiteList, recentOnlineData);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FaceEntranceRespV4)) {
            return false;
        }
        FaceEntranceRespV4 faceEntranceRespV4 = (FaceEntranceRespV4) other;
        return Intrinsics.areEqual(this.deviceConfig, faceEntranceRespV4.deviceConfig) && Intrinsics.areEqual(this.faceList, faceEntranceRespV4.faceList) && this.inWhiteList == faceEntranceRespV4.inWhiteList && Intrinsics.areEqual(this.recentOnlineData, faceEntranceRespV4.recentOnlineData);
    }

    @NotNull
    public final FaceDeviceConfig getDeviceConfig() {
        return this.deviceConfig;
    }

    @Nullable
    public final List<FaceData> getFaceList() {
        return this.faceList;
    }

    public final boolean getInWhiteList() {
        return this.inWhiteList;
    }

    @Nullable
    public final RecentOnlineData getRecentOnlineData() {
        return this.recentOnlineData;
    }

    public int hashCode() {
        int iHashCode = this.deviceConfig.hashCode() * 31;
        List<FaceData> list = this.faceList;
        int iHashCode2 = (((iHashCode + (list == null ? 0 : list.hashCode())) * 31) + Boolean.hashCode(this.inWhiteList)) * 31;
        RecentOnlineData recentOnlineData = this.recentOnlineData;
        return iHashCode2 + (recentOnlineData != null ? recentOnlineData.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "FaceEntranceRespV4(deviceConfig=" + this.deviceConfig + ", faceList=" + this.faceList + ", inWhiteList=" + this.inWhiteList + ", recentOnlineData=" + this.recentOnlineData + ")";
    }
}
