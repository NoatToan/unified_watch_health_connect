package com.xiaomi.hm.health.device.setting.vo;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J'\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\t\u0010\r\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u0019\u0010\t\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/vo/IncomingCallVo;", "", "", "component1", "component2", "", "component3", "enable", "enableDelayNotification", "delaySecond", "copy", "", "toString", "hashCode", "other", "equals", "a", "Z", "getEnable", "()Z", "b", "getEnableDelayNotification", "c", LogUtil.I, "getDelaySecond", "()I", "<init>", "(ZZI)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class IncomingCallVo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final boolean enable;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final boolean enableDelayNotification;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final int delaySecond;

    public IncomingCallVo(boolean z, boolean z2, int i) {
        this.enable = z;
        this.enableDelayNotification = z2;
        this.delaySecond = i;
    }

    public static /* synthetic */ IncomingCallVo copy$default(IncomingCallVo incomingCallVo, boolean z, boolean z2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = incomingCallVo.enable;
        }
        if ((i2 & 2) != 0) {
            z2 = incomingCallVo.enableDelayNotification;
        }
        if ((i2 & 4) != 0) {
            i = incomingCallVo.delaySecond;
        }
        return incomingCallVo.copy(z, z2, i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getEnable() {
        return this.enable;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getEnableDelayNotification() {
        return this.enableDelayNotification;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getDelaySecond() {
        return this.delaySecond;
    }

    @NotNull
    public final IncomingCallVo copy(boolean enable, boolean enableDelayNotification, int delaySecond) {
        return new IncomingCallVo(enable, enableDelayNotification, delaySecond);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IncomingCallVo)) {
            return false;
        }
        IncomingCallVo incomingCallVo = (IncomingCallVo) other;
        return this.enable == incomingCallVo.enable && this.enableDelayNotification == incomingCallVo.enableDelayNotification && this.delaySecond == incomingCallVo.delaySecond;
    }

    public final int getDelaySecond() {
        return this.delaySecond;
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public final boolean getEnableDelayNotification() {
        return this.enableDelayNotification;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    public int hashCode() {
        boolean z = this.enable;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        boolean z2 = this.enableDelayNotification;
        return ((i + (z2 ? 1 : z2)) * 31) + this.delaySecond;
    }

    @NotNull
    public String toString() {
        return "IncomingCallVo(enable=" + this.enable + ", enableDelayNotification=" + this.enableDelayNotification + ", delaySecond=" + this.delaySecond + ")";
    }
}
