package com.huami.bluetooth.profile.ecf.data;

import kotlin.Metadata;
import org.cybergarage.http.HTTP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0012\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J!\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001b\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001b\u001a\u00020\u00188@@\u0000X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Lcom/huami/bluetooth/profile/ecf/data/NoiseControl;", "", "Lcom/huami/bluetooth/profile/ecf/data/NoiseControlType;", "component1", "Lcom/huami/bluetooth/profile/ecf/data/NoiseReductionMode;", "component2", "noiseControlType", "noiseReductionMode", "copy", "", "toString", "", "hashCode", "other", "", "equals", "a", "Lcom/huami/bluetooth/profile/ecf/data/NoiseControlType;", "getNoiseControlType", "()Lcom/huami/bluetooth/profile/ecf/data/NoiseControlType;", "b", "Lcom/huami/bluetooth/profile/ecf/data/NoiseReductionMode;", "getNoiseReductionMode", "()Lcom/huami/bluetooth/profile/ecf/data/NoiseReductionMode;", "", "getBytes$bluetooth_release", "()[B", HTTP.CONTENT_RANGE_BYTES, "<init>", "(Lcom/huami/bluetooth/profile/ecf/data/NoiseControlType;Lcom/huami/bluetooth/profile/ecf/data/NoiseReductionMode;)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class NoiseControl {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @Nullable
    private final NoiseControlType noiseControlType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    private final NoiseReductionMode noiseReductionMode;

    public NoiseControl(@Nullable NoiseControlType noiseControlType, @Nullable NoiseReductionMode noiseReductionMode) {
        this.noiseControlType = noiseControlType;
        this.noiseReductionMode = noiseReductionMode;
    }

    public static /* synthetic */ NoiseControl copy$default(NoiseControl noiseControl, NoiseControlType noiseControlType, NoiseReductionMode noiseReductionMode, int i, Object obj) {
        if ((i & 1) != 0) {
            noiseControlType = noiseControl.noiseControlType;
        }
        if ((i & 2) != 0) {
            noiseReductionMode = noiseControl.noiseReductionMode;
        }
        return noiseControl.copy(noiseControlType, noiseReductionMode);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final NoiseControlType getNoiseControlType() {
        return this.noiseControlType;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final NoiseReductionMode getNoiseReductionMode() {
        return this.noiseReductionMode;
    }

    @NotNull
    public final NoiseControl copy(@Nullable NoiseControlType noiseControlType, @Nullable NoiseReductionMode noiseReductionMode) {
        return new NoiseControl(noiseControlType, noiseReductionMode);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NoiseControl)) {
            return false;
        }
        NoiseControl noiseControl = (NoiseControl) other;
        return this.noiseControlType == noiseControl.noiseControlType && this.noiseReductionMode == noiseControl.noiseReductionMode;
    }

    @NotNull
    public final byte[] getBytes$bluetooth_release() {
        NoiseControl noiseControl = getNoiseControlType() != null && getNoiseReductionMode() != null ? this : null;
        byte[] bArr = noiseControl != null ? new byte[]{noiseControl.getNoiseControlType().getByte$bluetooth_release(), noiseControl.getNoiseReductionMode().getByte$bluetooth_release()} : null;
        return bArr == null ? new byte[0] : bArr;
    }

    @Nullable
    public final NoiseControlType getNoiseControlType() {
        return this.noiseControlType;
    }

    @Nullable
    public final NoiseReductionMode getNoiseReductionMode() {
        return this.noiseReductionMode;
    }

    public int hashCode() {
        NoiseControlType noiseControlType = this.noiseControlType;
        int iHashCode = (noiseControlType == null ? 0 : noiseControlType.hashCode()) * 31;
        NoiseReductionMode noiseReductionMode = this.noiseReductionMode;
        return iHashCode + (noiseReductionMode != null ? noiseReductionMode.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "NoiseControl(noiseControlType=" + this.noiseControlType + ", noiseReductionMode=" + this.noiseReductionMode + ')';
    }
}
