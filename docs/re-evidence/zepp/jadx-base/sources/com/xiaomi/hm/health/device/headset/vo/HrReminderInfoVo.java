package com.xiaomi.hm.health.device.headset.vo;

import com.huami.bluetooth.profile.ecf.data.HrReminderInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u001a\u0010\u001bJ\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001f\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R$\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0007\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0007\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/hm/health/device/headset/vo/HrReminderInfoVo;", "", "Lcom/huami/bluetooth/profile/ecf/data/HrReminderInfo;", "component1", "", "component2", "hrReminderInfo", "isEnable", "copy", "", "toString", "", "hashCode", "other", "equals", "a", "Lcom/huami/bluetooth/profile/ecf/data/HrReminderInfo;", "getHrReminderInfo", "()Lcom/huami/bluetooth/profile/ecf/data/HrReminderInfo;", "setHrReminderInfo", "(Lcom/huami/bluetooth/profile/ecf/data/HrReminderInfo;)V", "b", "Z", "()Z", "setEnable", "(Z)V", "<init>", "(Lcom/huami/bluetooth/profile/ecf/data/HrReminderInfo;Z)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class HrReminderInfoVo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @Nullable
    private HrReminderInfo hrReminderInfo;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private boolean isEnable;

    /* JADX WARN: Multi-variable type inference failed */
    public HrReminderInfoVo() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    public HrReminderInfoVo(@Nullable HrReminderInfo hrReminderInfo, boolean z) {
        this.hrReminderInfo = hrReminderInfo;
        this.isEnable = z;
    }

    public static /* synthetic */ HrReminderInfoVo copy$default(HrReminderInfoVo hrReminderInfoVo, HrReminderInfo hrReminderInfo, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            hrReminderInfo = hrReminderInfoVo.hrReminderInfo;
        }
        if ((i & 2) != 0) {
            z = hrReminderInfoVo.isEnable;
        }
        return hrReminderInfoVo.copy(hrReminderInfo, z);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final HrReminderInfo getHrReminderInfo() {
        return this.hrReminderInfo;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsEnable() {
        return this.isEnable;
    }

    @NotNull
    public final HrReminderInfoVo copy(@Nullable HrReminderInfo hrReminderInfo, boolean isEnable) {
        return new HrReminderInfoVo(hrReminderInfo, isEnable);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HrReminderInfoVo)) {
            return false;
        }
        HrReminderInfoVo hrReminderInfoVo = (HrReminderInfoVo) other;
        return Intrinsics.areEqual(this.hrReminderInfo, hrReminderInfoVo.hrReminderInfo) && this.isEnable == hrReminderInfoVo.isEnable;
    }

    @Nullable
    public final HrReminderInfo getHrReminderInfo() {
        return this.hrReminderInfo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public int hashCode() {
        HrReminderInfo hrReminderInfo = this.hrReminderInfo;
        int iHashCode = (hrReminderInfo == null ? 0 : hrReminderInfo.hashCode()) * 31;
        boolean z = this.isEnable;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iHashCode + r1;
    }

    public final boolean isEnable() {
        return this.isEnable;
    }

    public final void setEnable(boolean z) {
        this.isEnable = z;
    }

    public final void setHrReminderInfo(@Nullable HrReminderInfo hrReminderInfo) {
        this.hrReminderInfo = hrReminderInfo;
    }

    @NotNull
    public String toString() {
        return "HrReminderInfoVo(hrReminderInfo=" + this.hrReminderInfo + ", isEnable=" + this.isEnable + ")";
    }

    public /* synthetic */ HrReminderInfoVo(HrReminderInfo hrReminderInfo, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : hrReminderInfo, (i & 2) != 0 ? false : z);
    }
}
