package com.huami.musiccontrol.bean;

import com.baidu.ocr.sdk.utils.LogUtil;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\t\u0010\u0007\u001a\u00020\u0005HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001R\u0019\u0010\b\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/huami/musiccontrol/bean/VolumeInfo;", "", "other", "", "equals", "", "hashCode", "component1", "volume", "copy", "", "toString", "a", LogUtil.I, "getVolume", "()I", "<init>", "(I)V", "music_control_release"}, k = 1, mv = {1, 4, 1})
public final /* data */ class VolumeInfo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int volume;

    public VolumeInfo(int i) {
        this.volume = i;
    }

    public static /* synthetic */ VolumeInfo copy$default(VolumeInfo volumeInfo, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = volumeInfo.volume;
        }
        return volumeInfo.copy(i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getVolume() {
        return this.volume;
    }

    @NotNull
    public final VolumeInfo copy(int volume) {
        return new VolumeInfo(volume);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(VolumeInfo.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Objects.requireNonNull(other, "null cannot be cast to non-null type com.huami.musiccontrol.bean.VolumeInfo");
        return this.volume == ((VolumeInfo) other).volume;
    }

    public final int getVolume() {
        return this.volume;
    }

    public int hashCode() {
        return this.volume;
    }

    @NotNull
    public String toString() {
        return "VolumeInfo(volume=" + this.volume + ")";
    }
}
