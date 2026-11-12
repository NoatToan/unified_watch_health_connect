package com.xiaomi.hm.health.ui.smartplay.btphone.btphone;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.xiaomi.hm.health.ui.smartplay.btphone.phonecallalertsetting.AuthStatus;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u001a\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b(\u0010)J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J1\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u0007HÆ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\n\u0010\u0017\"\u0004\b\u001b\u0010\u0019R\"\u0010\u000b\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010\f\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u0006*"}, d2 = {"Lcom/xiaomi/hm/health/ui/smartplay/btphone/btphone/BtPhoneSettingData;", "", "", "component1", "component2", "Lcom/xiaomi/hm/health/ui/smartplay/btphone/btphone/BtPhonePropertyData;", "component3", "Lcom/xiaomi/hm/health/ui/smartplay/btphone/phonecallalertsetting/AuthStatus;", "component4", "deviceEnable", "isBtConnected", "userSetting", "authStatus", "copy", "", "toString", "", "hashCode", "other", "equals", "a", "Z", "getDeviceEnable", "()Z", "setDeviceEnable", "(Z)V", "b", "setBtConnected", "c", "Lcom/xiaomi/hm/health/ui/smartplay/btphone/btphone/BtPhonePropertyData;", "getUserSetting", "()Lcom/xiaomi/hm/health/ui/smartplay/btphone/btphone/BtPhonePropertyData;", "setUserSetting", "(Lcom/xiaomi/hm/health/ui/smartplay/btphone/btphone/BtPhonePropertyData;)V", GoogleApiAvailabilityLight.a, "Lcom/xiaomi/hm/health/ui/smartplay/btphone/phonecallalertsetting/AuthStatus;", "getAuthStatus", "()Lcom/xiaomi/hm/health/ui/smartplay/btphone/phonecallalertsetting/AuthStatus;", "setAuthStatus", "(Lcom/xiaomi/hm/health/ui/smartplay/btphone/phonecallalertsetting/AuthStatus;)V", "<init>", "(ZZLcom/xiaomi/hm/health/ui/smartplay/btphone/btphone/BtPhonePropertyData;Lcom/xiaomi/hm/health/ui/smartplay/btphone/phonecallalertsetting/AuthStatus;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class BtPhoneSettingData {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private boolean deviceEnable;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private boolean isBtConnected;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private BtPhonePropertyData userSetting;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    private AuthStatus authStatus;

    public BtPhoneSettingData() {
        this(false, false, null, null, 15, null);
    }

    public BtPhoneSettingData(boolean z, boolean z2, @NotNull BtPhonePropertyData btPhonePropertyData, @NotNull AuthStatus authStatus) {
        this.deviceEnable = z;
        this.isBtConnected = z2;
        this.userSetting = btPhonePropertyData;
        this.authStatus = authStatus;
    }

    public static /* synthetic */ BtPhoneSettingData copy$default(BtPhoneSettingData btPhoneSettingData, boolean z, boolean z2, BtPhonePropertyData btPhonePropertyData, AuthStatus authStatus, int i, Object obj) {
        if ((i & 1) != 0) {
            z = btPhoneSettingData.deviceEnable;
        }
        if ((i & 2) != 0) {
            z2 = btPhoneSettingData.isBtConnected;
        }
        if ((i & 4) != 0) {
            btPhonePropertyData = btPhoneSettingData.userSetting;
        }
        if ((i & 8) != 0) {
            authStatus = btPhoneSettingData.authStatus;
        }
        return btPhoneSettingData.copy(z, z2, btPhonePropertyData, authStatus);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getDeviceEnable() {
        return this.deviceEnable;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsBtConnected() {
        return this.isBtConnected;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final BtPhonePropertyData getUserSetting() {
        return this.userSetting;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final AuthStatus getAuthStatus() {
        return this.authStatus;
    }

    @NotNull
    public final BtPhoneSettingData copy(boolean deviceEnable, boolean isBtConnected, @NotNull BtPhonePropertyData userSetting, @NotNull AuthStatus authStatus) {
        return new BtPhoneSettingData(deviceEnable, isBtConnected, userSetting, authStatus);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BtPhoneSettingData)) {
            return false;
        }
        BtPhoneSettingData btPhoneSettingData = (BtPhoneSettingData) other;
        return this.deviceEnable == btPhoneSettingData.deviceEnable && this.isBtConnected == btPhoneSettingData.isBtConnected && Intrinsics.areEqual(this.userSetting, btPhoneSettingData.userSetting) && Intrinsics.areEqual(this.authStatus, btPhoneSettingData.authStatus);
    }

    @NotNull
    public final AuthStatus getAuthStatus() {
        return this.authStatus;
    }

    public final boolean getDeviceEnable() {
        return this.deviceEnable;
    }

    @NotNull
    public final BtPhonePropertyData getUserSetting() {
        return this.userSetting;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    public int hashCode() {
        boolean z = this.deviceEnable;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        boolean z2 = this.isBtConnected;
        return ((((i + (z2 ? 1 : z2)) * 31) + this.userSetting.hashCode()) * 31) + this.authStatus.hashCode();
    }

    public final boolean isBtConnected() {
        return this.isBtConnected;
    }

    public final void setAuthStatus(@NotNull AuthStatus authStatus) {
        this.authStatus = authStatus;
    }

    public final void setBtConnected(boolean z) {
        this.isBtConnected = z;
    }

    public final void setDeviceEnable(boolean z) {
        this.deviceEnable = z;
    }

    public final void setUserSetting(@NotNull BtPhonePropertyData btPhonePropertyData) {
        this.userSetting = btPhonePropertyData;
    }

    @NotNull
    public String toString() {
        return "BtPhoneSettingData(deviceEnable=" + this.deviceEnable + ", isBtConnected=" + this.isBtConnected + ", userSetting=" + this.userSetting + ", authStatus=" + this.authStatus + ")";
    }

    public /* synthetic */ BtPhoneSettingData(boolean z, boolean z2, BtPhonePropertyData btPhonePropertyData, AuthStatus authStatus, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? new BtPhonePropertyData(false, false, 3) : btPhonePropertyData, (i & 8) != 0 ? new AuthStatus(false, false, false, false, 8, null) : authStatus);
    }
}
