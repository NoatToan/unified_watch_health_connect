package com.xiaomi.hm.health.ui.language;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\r\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0007\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0007\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/hm/health/ui/language/DeviceLanguage;", "", "", "component1", "", "component2", "deviceLanguage", "isFollowSystem", "copy", "", "toString", "hashCode", "other", "equals", "a", LogUtil.I, "getDeviceLanguage", "()I", "setDeviceLanguage", "(I)V", "b", "Z", "()Z", "setFollowSystem", "(Z)V", "<init>", "(IZ)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class DeviceLanguage {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("device_language")
    private int deviceLanguage;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("isFollowSystem")
    private boolean isFollowSystem;

    /* JADX WARN: Multi-variable type inference failed */
    public DeviceLanguage() {
        this(0, 0 == true ? 1 : 0, 3, null);
    }

    public DeviceLanguage(int i, boolean z) {
        this.deviceLanguage = i;
        this.isFollowSystem = z;
    }

    public static /* synthetic */ DeviceLanguage copy$default(DeviceLanguage deviceLanguage, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = deviceLanguage.deviceLanguage;
        }
        if ((i2 & 2) != 0) {
            z = deviceLanguage.isFollowSystem;
        }
        return deviceLanguage.copy(i, z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getDeviceLanguage() {
        return this.deviceLanguage;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsFollowSystem() {
        return this.isFollowSystem;
    }

    @NotNull
    public final DeviceLanguage copy(int deviceLanguage, boolean isFollowSystem) {
        return new DeviceLanguage(deviceLanguage, isFollowSystem);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceLanguage)) {
            return false;
        }
        DeviceLanguage deviceLanguage = (DeviceLanguage) other;
        return this.deviceLanguage == deviceLanguage.deviceLanguage && this.isFollowSystem == deviceLanguage.isFollowSystem;
    }

    public final int getDeviceLanguage() {
        return this.deviceLanguage;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public int hashCode() {
        int i = this.deviceLanguage * 31;
        boolean z = this.isFollowSystem;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return i + r1;
    }

    public final boolean isFollowSystem() {
        return this.isFollowSystem;
    }

    public final void setDeviceLanguage(int i) {
        this.deviceLanguage = i;
    }

    public final void setFollowSystem(boolean z) {
        this.isFollowSystem = z;
    }

    @NotNull
    public String toString() {
        return "DeviceLanguage(deviceLanguage=" + this.deviceLanguage + ", isFollowSystem=" + this.isFollowSystem + ")";
    }

    public /* synthetic */ DeviceLanguage(int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? -1 : i, (i2 & 2) != 0 ? false : z);
    }
}
