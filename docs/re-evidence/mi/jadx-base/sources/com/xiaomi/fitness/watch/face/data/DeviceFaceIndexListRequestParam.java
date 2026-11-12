package com.xiaomi.fitness.watch.face.data;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000eJ<\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fitness/watch/face/data/DeviceFaceIndexListRequestParam;", "", "model", "", "firmwareVersion", "page", "", MediaStoreUtil.MediaInfo.SIZE, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getModel", "()Ljava/lang/String;", "getFirmwareVersion", "getPage", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSize", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/xiaomi/fitness/watch/face/data/DeviceFaceIndexListRequestParam;", "equals", "", "other", "hashCode", "toString", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DeviceFaceIndexListRequestParam {

    @SerializedName("firmware_version")
    @Nullable
    private final String firmwareVersion;

    @SerializedName("model")
    @NotNull
    private final String model;

    @SerializedName("page")
    @Nullable
    private final Integer page;

    @SerializedName(MediaStoreUtil.MediaInfo.SIZE)
    @Nullable
    private final Integer size;

    public DeviceFaceIndexListRequestParam(@NotNull String model, @Nullable String str, @Nullable Integer num, @Nullable Integer num2) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.model = model;
        this.firmwareVersion = str;
        this.page = num;
        this.size = num2;
    }

    public static /* synthetic */ DeviceFaceIndexListRequestParam copy$default(DeviceFaceIndexListRequestParam deviceFaceIndexListRequestParam, String str, String str2, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deviceFaceIndexListRequestParam.model;
        }
        if ((i & 2) != 0) {
            str2 = deviceFaceIndexListRequestParam.firmwareVersion;
        }
        if ((i & 4) != 0) {
            num = deviceFaceIndexListRequestParam.page;
        }
        if ((i & 8) != 0) {
            num2 = deviceFaceIndexListRequestParam.size;
        }
        return deviceFaceIndexListRequestParam.copy(str, str2, num, num2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getModel() {
        return this.model;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFirmwareVersion() {
        return this.firmwareVersion;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getPage() {
        return this.page;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getSize() {
        return this.size;
    }

    @NotNull
    public final DeviceFaceIndexListRequestParam copy(@NotNull String model, @Nullable String firmwareVersion, @Nullable Integer page, @Nullable Integer size) {
        Intrinsics.checkNotNullParameter(model, "model");
        return new DeviceFaceIndexListRequestParam(model, firmwareVersion, page, size);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceFaceIndexListRequestParam)) {
            return false;
        }
        DeviceFaceIndexListRequestParam deviceFaceIndexListRequestParam = (DeviceFaceIndexListRequestParam) other;
        return Intrinsics.areEqual(this.model, deviceFaceIndexListRequestParam.model) && Intrinsics.areEqual(this.firmwareVersion, deviceFaceIndexListRequestParam.firmwareVersion) && Intrinsics.areEqual(this.page, deviceFaceIndexListRequestParam.page) && Intrinsics.areEqual(this.size, deviceFaceIndexListRequestParam.size);
    }

    @Nullable
    public final String getFirmwareVersion() {
        return this.firmwareVersion;
    }

    @NotNull
    public final String getModel() {
        return this.model;
    }

    @Nullable
    public final Integer getPage() {
        return this.page;
    }

    @Nullable
    public final Integer getSize() {
        return this.size;
    }

    public int hashCode() {
        int iHashCode = this.model.hashCode() * 31;
        String str = this.firmwareVersion;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.page;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.size;
        return iHashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "DeviceFaceIndexListRequestParam(model=" + this.model + ", firmwareVersion=" + this.firmwareVersion + ", page=" + this.page + ", size=" + this.size + ")";
    }
}
