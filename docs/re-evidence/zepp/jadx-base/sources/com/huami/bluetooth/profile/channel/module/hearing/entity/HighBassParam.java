package com.huami.bluetooth.profile.channel.module.hearing.entity;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b \u0010!J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0004HÆ\u0003J\t\u0010\b\u001a\u00020\u0004HÆ\u0003J\t\u0010\t\u001a\u00020\u0004HÆ\u0003J;\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u0004HÆ\u0001J\t\u0010\u0010\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\n\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u000b\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0019\u0010\f\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017R\u0019\u0010\r\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0015\u001a\u0004\b\u001d\u0010\u0017R\u0019\u0010\u000e\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0015\u001a\u0004\b\u001f\u0010\u0017¨\u0006\""}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/hearing/entity/HighBassParam;", "", "", "toString", "", "component1", "component2", "component3", "component4", "component5", "mode", "leftBass", "leftHighPitch", "rightBass", "rightHighPitch", "copy", "hashCode", "other", "", "equals", "a", LogUtil.I, "getMode", "()I", "b", "getLeftBass", "c", "getLeftHighPitch", GoogleApiAvailabilityLight.a, "getRightBass", "e", "getRightHighPitch", "<init>", "(IIIII)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class HighBassParam {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int mode;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int leftBass;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final int leftHighPitch;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final int rightBass;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private final int rightHighPitch;

    public HighBassParam(int i, int i2, int i3, int i4, int i5) {
        this.mode = i;
        this.leftBass = i2;
        this.leftHighPitch = i3;
        this.rightBass = i4;
        this.rightHighPitch = i5;
    }

    public static /* synthetic */ HighBassParam copy$default(HighBassParam highBassParam, int i, int i2, int i3, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i = highBassParam.mode;
        }
        if ((i6 & 2) != 0) {
            i2 = highBassParam.leftBass;
        }
        int i7 = i2;
        if ((i6 & 4) != 0) {
            i3 = highBassParam.leftHighPitch;
        }
        int i8 = i3;
        if ((i6 & 8) != 0) {
            i4 = highBassParam.rightBass;
        }
        int i9 = i4;
        if ((i6 & 16) != 0) {
            i5 = highBassParam.rightHighPitch;
        }
        return highBassParam.copy(i, i7, i8, i9, i5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getMode() {
        return this.mode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getLeftBass() {
        return this.leftBass;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getLeftHighPitch() {
        return this.leftHighPitch;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getRightBass() {
        return this.rightBass;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getRightHighPitch() {
        return this.rightHighPitch;
    }

    @NotNull
    public final HighBassParam copy(int mode, int leftBass, int leftHighPitch, int rightBass, int rightHighPitch) {
        return new HighBassParam(mode, leftBass, leftHighPitch, rightBass, rightHighPitch);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HighBassParam)) {
            return false;
        }
        HighBassParam highBassParam = (HighBassParam) other;
        return this.mode == highBassParam.mode && this.leftBass == highBassParam.leftBass && this.leftHighPitch == highBassParam.leftHighPitch && this.rightBass == highBassParam.rightBass && this.rightHighPitch == highBassParam.rightHighPitch;
    }

    public final int getLeftBass() {
        return this.leftBass;
    }

    public final int getLeftHighPitch() {
        return this.leftHighPitch;
    }

    public final int getMode() {
        return this.mode;
    }

    public final int getRightBass() {
        return this.rightBass;
    }

    public final int getRightHighPitch() {
        return this.rightHighPitch;
    }

    public int hashCode() {
        return (((((((this.mode * 31) + this.leftBass) * 31) + this.leftHighPitch) * 31) + this.rightBass) * 31) + this.rightHighPitch;
    }

    @NotNull
    public String toString() {
        return "HighBass{mode=" + this.mode + ", leftBass=" + this.leftBass + ", leftHighPitch=" + this.leftHighPitch + ", rightBass=" + this.rightBass + ", rightHighPitch=" + this.rightHighPitch + ", }";
    }
}
