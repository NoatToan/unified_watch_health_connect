package com.xiaomi.fitness.watch.face.data;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/watch/face/data/DeviceFaceDeviceConfig;", "", "shape", "", "albumRepeatable", "", "<init>", "(IZ)V", "getShape", "()I", "getAlbumRepeatable", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "toString", "", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DeviceFaceDeviceConfig {

    @SerializedName("album_repeat_download")
    private final boolean albumRepeatable;
    private final int shape;

    public DeviceFaceDeviceConfig(int i, boolean z) {
        this.shape = i;
        this.albumRepeatable = z;
    }

    public static /* synthetic */ DeviceFaceDeviceConfig copy$default(DeviceFaceDeviceConfig deviceFaceDeviceConfig, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = deviceFaceDeviceConfig.shape;
        }
        if ((i2 & 2) != 0) {
            z = deviceFaceDeviceConfig.albumRepeatable;
        }
        return deviceFaceDeviceConfig.copy(i, z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getShape() {
        return this.shape;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getAlbumRepeatable() {
        return this.albumRepeatable;
    }

    @NotNull
    public final DeviceFaceDeviceConfig copy(int shape, boolean albumRepeatable) {
        return new DeviceFaceDeviceConfig(shape, albumRepeatable);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceFaceDeviceConfig)) {
            return false;
        }
        DeviceFaceDeviceConfig deviceFaceDeviceConfig = (DeviceFaceDeviceConfig) other;
        return this.shape == deviceFaceDeviceConfig.shape && this.albumRepeatable == deviceFaceDeviceConfig.albumRepeatable;
    }

    public final boolean getAlbumRepeatable() {
        return this.albumRepeatable;
    }

    public final int getShape() {
        return this.shape;
    }

    public int hashCode() {
        return (Integer.hashCode(this.shape) * 31) + Boolean.hashCode(this.albumRepeatable);
    }

    @NotNull
    public String toString() {
        return "DeviceFaceDeviceConfig(shape=" + this.shape + ", albumRepeatable=" + this.albumRepeatable + ")";
    }
}
