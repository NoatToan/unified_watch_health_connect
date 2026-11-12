package com.xiaomi.hm.health.device.setting.vo;

import com.xiaomi.hm.health.bt.model.PasswordInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u001f\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0006\u0010\u0011R\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/vo/DevicePwdVo;", "", "", "component1", "Lcom/xiaomi/hm/health/bt/model/PasswordInfo;", "component2", "isSupport", "passwordInfo", "copy", "", "toString", "", "hashCode", "other", "equals", "a", "Z", "()Z", "b", "Lcom/xiaomi/hm/health/bt/model/PasswordInfo;", "getPasswordInfo", "()Lcom/xiaomi/hm/health/bt/model/PasswordInfo;", "<init>", "(ZLcom/xiaomi/hm/health/bt/model/PasswordInfo;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class DevicePwdVo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final boolean isSupport;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    private final PasswordInfo passwordInfo;

    public DevicePwdVo(boolean z, @Nullable PasswordInfo passwordInfo) {
        this.isSupport = z;
        this.passwordInfo = passwordInfo;
    }

    public static /* synthetic */ DevicePwdVo copy$default(DevicePwdVo devicePwdVo, boolean z, PasswordInfo passwordInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            z = devicePwdVo.isSupport;
        }
        if ((i & 2) != 0) {
            passwordInfo = devicePwdVo.passwordInfo;
        }
        return devicePwdVo.copy(z, passwordInfo);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsSupport() {
        return this.isSupport;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final PasswordInfo getPasswordInfo() {
        return this.passwordInfo;
    }

    @NotNull
    public final DevicePwdVo copy(boolean isSupport, @Nullable PasswordInfo passwordInfo) {
        return new DevicePwdVo(isSupport, passwordInfo);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DevicePwdVo)) {
            return false;
        }
        DevicePwdVo devicePwdVo = (DevicePwdVo) other;
        return this.isSupport == devicePwdVo.isSupport && Intrinsics.areEqual(this.passwordInfo, devicePwdVo.passwordInfo);
    }

    @Nullable
    public final PasswordInfo getPasswordInfo() {
        return this.passwordInfo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z = this.isSupport;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        PasswordInfo passwordInfo = this.passwordInfo;
        return i + (passwordInfo == null ? 0 : passwordInfo.hashCode());
    }

    public final boolean isSupport() {
        return this.isSupport;
    }

    @NotNull
    public String toString() {
        return "DevicePwdVo(isSupport=" + this.isSupport + ", passwordInfo=" + this.passwordInfo + ")";
    }

    public /* synthetic */ DevicePwdVo(boolean z, PasswordInfo passwordInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? null : passwordInfo);
    }
}
