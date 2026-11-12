package com.xiaomi.hm.health.device.setting.vo;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J'\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u0004HÆ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\t\u0010\r\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0007\u0010\u0012R\u0019\u0010\b\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\t\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/vo/BatteryTipsDialogVo;", "", "", "component1", "", "component2", "component3", "isActive", "position", "freq", "copy", "", "toString", "hashCode", "other", "equals", "a", "Z", "()Z", "b", LogUtil.I, "getPosition", "()I", "c", "getFreq", "<init>", "(ZII)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class BatteryTipsDialogVo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final boolean isActive;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int position;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final int freq;

    public BatteryTipsDialogVo(boolean z, int i, int i2) {
        this.isActive = z;
        this.position = i;
        this.freq = i2;
    }

    public static /* synthetic */ BatteryTipsDialogVo copy$default(BatteryTipsDialogVo batteryTipsDialogVo, boolean z, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            z = batteryTipsDialogVo.isActive;
        }
        if ((i3 & 2) != 0) {
            i = batteryTipsDialogVo.position;
        }
        if ((i3 & 4) != 0) {
            i2 = batteryTipsDialogVo.freq;
        }
        return batteryTipsDialogVo.copy(z, i, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsActive() {
        return this.isActive;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getPosition() {
        return this.position;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getFreq() {
        return this.freq;
    }

    @NotNull
    public final BatteryTipsDialogVo copy(boolean isActive, int position, int freq) {
        return new BatteryTipsDialogVo(isActive, position, freq);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BatteryTipsDialogVo)) {
            return false;
        }
        BatteryTipsDialogVo batteryTipsDialogVo = (BatteryTipsDialogVo) other;
        return this.isActive == batteryTipsDialogVo.isActive && this.position == batteryTipsDialogVo.position && this.freq == batteryTipsDialogVo.freq;
    }

    public final int getFreq() {
        return this.freq;
    }

    public final int getPosition() {
        return this.position;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public int hashCode() {
        boolean z = this.isActive;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return (((r0 * 31) + this.position) * 31) + this.freq;
    }

    public final boolean isActive() {
        return this.isActive;
    }

    @NotNull
    public String toString() {
        return "BatteryTipsDialogVo(isActive=" + this.isActive + ", position=" + this.position + ", freq=" + this.freq + ")";
    }
}
