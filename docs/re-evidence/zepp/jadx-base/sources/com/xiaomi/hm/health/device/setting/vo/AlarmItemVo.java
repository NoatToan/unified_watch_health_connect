package com.xiaomi.hm.health.device.setting.vo;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\u000b\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\r\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0007\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/vo/AlarmItemVo;", "", "", "component1", "", "component2", "enable", "count", "copy", "", "toString", "hashCode", "other", "equals", "a", "Z", "getEnable", "()Z", "b", LogUtil.I, "getCount", "()I", "<init>", "(ZI)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class AlarmItemVo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final boolean enable;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int count;

    public AlarmItemVo(boolean z, int i) {
        this.enable = z;
        this.count = i;
    }

    public static /* synthetic */ AlarmItemVo copy$default(AlarmItemVo alarmItemVo, boolean z, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = alarmItemVo.enable;
        }
        if ((i2 & 2) != 0) {
            i = alarmItemVo.count;
        }
        return alarmItemVo.copy(z, i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getEnable() {
        return this.enable;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getCount() {
        return this.count;
    }

    @NotNull
    public final AlarmItemVo copy(boolean enable, int count) {
        return new AlarmItemVo(enable, count);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AlarmItemVo)) {
            return false;
        }
        AlarmItemVo alarmItemVo = (AlarmItemVo) other;
        return this.enable == alarmItemVo.enable && this.count == alarmItemVo.count;
    }

    public final int getCount() {
        return this.count;
    }

    public final boolean getEnable() {
        return this.enable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z = this.enable;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return (r0 * 31) + this.count;
    }

    @NotNull
    public String toString() {
        return "AlarmItemVo(enable=" + this.enable + ", count=" + this.count + ")";
    }
}
