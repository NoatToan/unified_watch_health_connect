package com.xiaomi.fitness.watch.face.request;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.fitness.watch.face.data.DeviceFaceDeviceConfig;
import com.xiaomi.fitness.watch.face.export.data.FaceData;
import com.xiaomi.onetrack.c.q;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\t\u0010\u001d\u001a\u00020\fHÆ\u0003JE\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010\u001f\u001a\u00020\f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0005HÖ\u0001J\t\u0010\"\u001a\u00020\u0007HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006#"}, d2 = {"Lcom/xiaomi/fitness/watch/face/request/FaceOperationListResult;", "", q.f13857a, "Lcom/xiaomi/fitness/watch/face/data/DeviceFaceDeviceConfig;", "id", "", "name", "", "watchface_list", "", "Lcom/xiaomi/fitness/watch/face/export/data/FaceData;", "hasMore", "", "<init>", "(Lcom/xiaomi/fitness/watch/face/data/DeviceFaceDeviceConfig;ILjava/lang/String;Ljava/util/List;Z)V", "getConfig", "()Lcom/xiaomi/fitness/watch/face/data/DeviceFaceDeviceConfig;", "getId", "()I", "getName", "()Ljava/lang/String;", "getWatchface_list", "()Ljava/util/List;", "getHasMore", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class FaceOperationListResult {

    @SerializedName("device_config")
    @Nullable
    private final DeviceFaceDeviceConfig config;

    @SerializedName("has_more")
    private final boolean hasMore;

    @SerializedName("operation_id")
    private final int id;

    @Nullable
    private final String name;

    @SerializedName("watchface_list")
    @NotNull
    private final List<FaceData> watchface_list;

    public FaceOperationListResult(@Nullable DeviceFaceDeviceConfig deviceFaceDeviceConfig, int i, @Nullable String str, @NotNull List<FaceData> watchface_list, boolean z) {
        Intrinsics.checkNotNullParameter(watchface_list, "watchface_list");
        this.config = deviceFaceDeviceConfig;
        this.id = i;
        this.name = str;
        this.watchface_list = watchface_list;
        this.hasMore = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FaceOperationListResult copy$default(FaceOperationListResult faceOperationListResult, DeviceFaceDeviceConfig deviceFaceDeviceConfig, int i, String str, List list, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            deviceFaceDeviceConfig = faceOperationListResult.config;
        }
        if ((i2 & 2) != 0) {
            i = faceOperationListResult.id;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            str = faceOperationListResult.name;
        }
        String str2 = str;
        if ((i2 & 8) != 0) {
            list = faceOperationListResult.watchface_list;
        }
        List list2 = list;
        if ((i2 & 16) != 0) {
            z = faceOperationListResult.hasMore;
        }
        return faceOperationListResult.copy(deviceFaceDeviceConfig, i3, str2, list2, z);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final DeviceFaceDeviceConfig getConfig() {
        return this.config;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final List<FaceData> component4() {
        return this.watchface_list;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getHasMore() {
        return this.hasMore;
    }

    @NotNull
    public final FaceOperationListResult copy(@Nullable DeviceFaceDeviceConfig config, int id, @Nullable String name, @NotNull List<FaceData> watchface_list, boolean hasMore) {
        Intrinsics.checkNotNullParameter(watchface_list, "watchface_list");
        return new FaceOperationListResult(config, id, name, watchface_list, hasMore);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FaceOperationListResult)) {
            return false;
        }
        FaceOperationListResult faceOperationListResult = (FaceOperationListResult) other;
        return Intrinsics.areEqual(this.config, faceOperationListResult.config) && this.id == faceOperationListResult.id && Intrinsics.areEqual(this.name, faceOperationListResult.name) && Intrinsics.areEqual(this.watchface_list, faceOperationListResult.watchface_list) && this.hasMore == faceOperationListResult.hasMore;
    }

    @Nullable
    public final DeviceFaceDeviceConfig getConfig() {
        return this.config;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final int getId() {
        return this.id;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final List<FaceData> getWatchface_list() {
        return this.watchface_list;
    }

    public int hashCode() {
        DeviceFaceDeviceConfig deviceFaceDeviceConfig = this.config;
        int iHashCode = (((deviceFaceDeviceConfig == null ? 0 : deviceFaceDeviceConfig.hashCode()) * 31) + Integer.hashCode(this.id)) * 31;
        String str = this.name;
        return ((((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.watchface_list.hashCode()) * 31) + Boolean.hashCode(this.hasMore);
    }

    @NotNull
    public String toString() {
        return "FaceOperationListResult(config=" + this.config + ", id=" + this.id + ", name=" + this.name + ", watchface_list=" + this.watchface_list + ", hasMore=" + this.hasMore + ")";
    }
}
