package com.xiaomi.fitness.watch.face.data;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.onetrack.c.q;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/watch/face/data/FaceTabAllResp;", "", q.f13857a, "Lcom/xiaomi/fitness/watch/face/data/DeviceFaceDeviceConfig;", "tabInfoList", "", "Lcom/xiaomi/fitness/watch/face/data/FaceAllTabInfo;", "<init>", "(Lcom/xiaomi/fitness/watch/face/data/DeviceFaceDeviceConfig;Ljava/util/List;)V", "getConfig", "()Lcom/xiaomi/fitness/watch/face/data/DeviceFaceDeviceConfig;", "getTabInfoList", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class FaceTabAllResp {

    @SerializedName("device_config")
    @Nullable
    private final DeviceFaceDeviceConfig config;

    @SerializedName("tab_info_list")
    @Nullable
    private final List<FaceAllTabInfo> tabInfoList;

    public FaceTabAllResp(@Nullable DeviceFaceDeviceConfig deviceFaceDeviceConfig, @Nullable List<FaceAllTabInfo> list) {
        this.config = deviceFaceDeviceConfig;
        this.tabInfoList = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FaceTabAllResp copy$default(FaceTabAllResp faceTabAllResp, DeviceFaceDeviceConfig deviceFaceDeviceConfig, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            deviceFaceDeviceConfig = faceTabAllResp.config;
        }
        if ((i & 2) != 0) {
            list = faceTabAllResp.tabInfoList;
        }
        return faceTabAllResp.copy(deviceFaceDeviceConfig, list);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final DeviceFaceDeviceConfig getConfig() {
        return this.config;
    }

    @Nullable
    public final List<FaceAllTabInfo> component2() {
        return this.tabInfoList;
    }

    @NotNull
    public final FaceTabAllResp copy(@Nullable DeviceFaceDeviceConfig config, @Nullable List<FaceAllTabInfo> tabInfoList) {
        return new FaceTabAllResp(config, tabInfoList);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FaceTabAllResp)) {
            return false;
        }
        FaceTabAllResp faceTabAllResp = (FaceTabAllResp) other;
        return Intrinsics.areEqual(this.config, faceTabAllResp.config) && Intrinsics.areEqual(this.tabInfoList, faceTabAllResp.tabInfoList);
    }

    @Nullable
    public final DeviceFaceDeviceConfig getConfig() {
        return this.config;
    }

    @Nullable
    public final List<FaceAllTabInfo> getTabInfoList() {
        return this.tabInfoList;
    }

    public int hashCode() {
        DeviceFaceDeviceConfig deviceFaceDeviceConfig = this.config;
        int iHashCode = (deviceFaceDeviceConfig == null ? 0 : deviceFaceDeviceConfig.hashCode()) * 31;
        List<FaceAllTabInfo> list = this.tabInfoList;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "FaceTabAllResp(config=" + this.config + ", tabInfoList=" + this.tabInfoList + ")";
    }
}
