package com.xiaomi.fitness.watch.face.request;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.fitness.watch.face.data.FaceDeviceConfig;
import com.xiaomi.fitness.watch.face.export.data.FaceData;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/fitness/watch/face/request/FaceDetailResultV2;", "", "deviceConfig", "Lcom/xiaomi/fitness/watch/face/data/FaceDeviceConfig;", "watchFace", "Lcom/xiaomi/fitness/watch/face/export/data/FaceData;", "recommend_list", "", "<init>", "(Lcom/xiaomi/fitness/watch/face/data/FaceDeviceConfig;Lcom/xiaomi/fitness/watch/face/export/data/FaceData;Ljava/util/List;)V", "getDeviceConfig", "()Lcom/xiaomi/fitness/watch/face/data/FaceDeviceConfig;", "getWatchFace", "()Lcom/xiaomi/fitness/watch/face/export/data/FaceData;", "getRecommend_list", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class FaceDetailResultV2 {

    @SerializedName("device_config")
    @Nullable
    private final FaceDeviceConfig deviceConfig;

    @Nullable
    private final List<FaceData> recommend_list;

    @SerializedName("watch_face")
    @NotNull
    private final FaceData watchFace;

    public FaceDetailResultV2(@Nullable FaceDeviceConfig faceDeviceConfig, @NotNull FaceData watchFace, @Nullable List<FaceData> list) {
        Intrinsics.checkNotNullParameter(watchFace, "watchFace");
        this.deviceConfig = faceDeviceConfig;
        this.watchFace = watchFace;
        this.recommend_list = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FaceDetailResultV2 copy$default(FaceDetailResultV2 faceDetailResultV2, FaceDeviceConfig faceDeviceConfig, FaceData faceData, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            faceDeviceConfig = faceDetailResultV2.deviceConfig;
        }
        if ((i & 2) != 0) {
            faceData = faceDetailResultV2.watchFace;
        }
        if ((i & 4) != 0) {
            list = faceDetailResultV2.recommend_list;
        }
        return faceDetailResultV2.copy(faceDeviceConfig, faceData, list);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final FaceDeviceConfig getDeviceConfig() {
        return this.deviceConfig;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final FaceData getWatchFace() {
        return this.watchFace;
    }

    @Nullable
    public final List<FaceData> component3() {
        return this.recommend_list;
    }

    @NotNull
    public final FaceDetailResultV2 copy(@Nullable FaceDeviceConfig deviceConfig, @NotNull FaceData watchFace, @Nullable List<FaceData> recommend_list) {
        Intrinsics.checkNotNullParameter(watchFace, "watchFace");
        return new FaceDetailResultV2(deviceConfig, watchFace, recommend_list);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FaceDetailResultV2)) {
            return false;
        }
        FaceDetailResultV2 faceDetailResultV2 = (FaceDetailResultV2) other;
        return Intrinsics.areEqual(this.deviceConfig, faceDetailResultV2.deviceConfig) && Intrinsics.areEqual(this.watchFace, faceDetailResultV2.watchFace) && Intrinsics.areEqual(this.recommend_list, faceDetailResultV2.recommend_list);
    }

    @Nullable
    public final FaceDeviceConfig getDeviceConfig() {
        return this.deviceConfig;
    }

    @Nullable
    public final List<FaceData> getRecommend_list() {
        return this.recommend_list;
    }

    @NotNull
    public final FaceData getWatchFace() {
        return this.watchFace;
    }

    public int hashCode() {
        FaceDeviceConfig faceDeviceConfig = this.deviceConfig;
        int iHashCode = (((faceDeviceConfig == null ? 0 : faceDeviceConfig.hashCode()) * 31) + this.watchFace.hashCode()) * 31;
        List<FaceData> list = this.recommend_list;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "FaceDetailResultV2(deviceConfig=" + this.deviceConfig + ", watchFace=" + this.watchFace + ", recommend_list=" + this.recommend_list + ")";
    }
}
