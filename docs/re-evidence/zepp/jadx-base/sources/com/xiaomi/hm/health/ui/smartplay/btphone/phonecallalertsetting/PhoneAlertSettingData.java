package com.xiaomi.hm.health.ui.smartplay.btphone.phonecallalertsetting;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0016\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\"\u0010#J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J)\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\n\u001a\u00020\u0006HÆ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R$\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\n\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006$"}, d2 = {"Lcom/xiaomi/hm/health/ui/smartplay/btphone/phonecallalertsetting/PhoneAlertSettingData;", "", "Lcom/xiaomi/hm/health/ui/smartplay/btphone/phonecallalertsetting/AuthStatus;", "component1", "Lcom/xiaomi/hm/health/ui/smartplay/btphone/phonecallalertsetting/ShowAuthInfo;", "component2", "", "component3", "authStatus", "showAuthInfo", "deviceEnable", "copy", "", "toString", "", "hashCode", "other", "equals", "a", "Lcom/xiaomi/hm/health/ui/smartplay/btphone/phonecallalertsetting/AuthStatus;", "getAuthStatus", "()Lcom/xiaomi/hm/health/ui/smartplay/btphone/phonecallalertsetting/AuthStatus;", "b", "Lcom/xiaomi/hm/health/ui/smartplay/btphone/phonecallalertsetting/ShowAuthInfo;", "getShowAuthInfo", "()Lcom/xiaomi/hm/health/ui/smartplay/btphone/phonecallalertsetting/ShowAuthInfo;", "setShowAuthInfo", "(Lcom/xiaomi/hm/health/ui/smartplay/btphone/phonecallalertsetting/ShowAuthInfo;)V", "c", "Z", "getDeviceEnable", "()Z", "setDeviceEnable", "(Z)V", "<init>", "(Lcom/xiaomi/hm/health/ui/smartplay/btphone/phonecallalertsetting/AuthStatus;Lcom/xiaomi/hm/health/ui/smartplay/btphone/phonecallalertsetting/ShowAuthInfo;Z)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class PhoneAlertSettingData {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final AuthStatus authStatus;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    private ShowAuthInfo showAuthInfo;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private boolean deviceEnable;

    public PhoneAlertSettingData() {
        this(null, null, false, 7, null);
    }

    public PhoneAlertSettingData(@NotNull AuthStatus authStatus, @Nullable ShowAuthInfo showAuthInfo, boolean z) {
        this.authStatus = authStatus;
        this.showAuthInfo = showAuthInfo;
        this.deviceEnable = z;
    }

    public static /* synthetic */ PhoneAlertSettingData copy$default(PhoneAlertSettingData phoneAlertSettingData, AuthStatus authStatus, ShowAuthInfo showAuthInfo, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            authStatus = phoneAlertSettingData.authStatus;
        }
        if ((i & 2) != 0) {
            showAuthInfo = phoneAlertSettingData.showAuthInfo;
        }
        if ((i & 4) != 0) {
            z = phoneAlertSettingData.deviceEnable;
        }
        return phoneAlertSettingData.copy(authStatus, showAuthInfo, z);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final AuthStatus getAuthStatus() {
        return this.authStatus;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ShowAuthInfo getShowAuthInfo() {
        return this.showAuthInfo;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getDeviceEnable() {
        return this.deviceEnable;
    }

    @NotNull
    public final PhoneAlertSettingData copy(@NotNull AuthStatus authStatus, @Nullable ShowAuthInfo showAuthInfo, boolean deviceEnable) {
        return new PhoneAlertSettingData(authStatus, showAuthInfo, deviceEnable);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PhoneAlertSettingData)) {
            return false;
        }
        PhoneAlertSettingData phoneAlertSettingData = (PhoneAlertSettingData) other;
        return Intrinsics.areEqual(this.authStatus, phoneAlertSettingData.authStatus) && Intrinsics.areEqual(this.showAuthInfo, phoneAlertSettingData.showAuthInfo) && this.deviceEnable == phoneAlertSettingData.deviceEnable;
    }

    @NotNull
    public final AuthStatus getAuthStatus() {
        return this.authStatus;
    }

    public final boolean getDeviceEnable() {
        return this.deviceEnable;
    }

    @Nullable
    public final ShowAuthInfo getShowAuthInfo() {
        return this.showAuthInfo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v7 */
    public int hashCode() {
        int iHashCode = this.authStatus.hashCode() * 31;
        ShowAuthInfo showAuthInfo = this.showAuthInfo;
        int iHashCode2 = (iHashCode + (showAuthInfo == null ? 0 : showAuthInfo.hashCode())) * 31;
        boolean z = this.deviceEnable;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iHashCode2 + r1;
    }

    public final void setDeviceEnable(boolean z) {
        this.deviceEnable = z;
    }

    public final void setShowAuthInfo(@Nullable ShowAuthInfo showAuthInfo) {
        this.showAuthInfo = showAuthInfo;
    }

    @NotNull
    public String toString() {
        return "PhoneAlertSettingData(authStatus=" + this.authStatus + ", showAuthInfo=" + this.showAuthInfo + ", deviceEnable=" + this.deviceEnable + ")";
    }

    public /* synthetic */ PhoneAlertSettingData(AuthStatus authStatus, ShowAuthInfo showAuthInfo, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new AuthStatus(false, false, false, false, 15, null) : authStatus, (i & 2) != 0 ? null : showAuthInfo, (i & 4) != 0 ? false : z);
    }
}
