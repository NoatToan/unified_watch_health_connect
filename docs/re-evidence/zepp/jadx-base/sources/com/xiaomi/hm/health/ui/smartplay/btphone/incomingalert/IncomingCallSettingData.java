package com.xiaomi.hm.health.ui.smartplay.btphone.incomingalert;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.xiaomi.hm.health.ui.smartplay.btphone.phonecallalertsetting.AuthStatus;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b%\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0012\u001a\u00020\n¢\u0006\u0004\b7\u00108J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\b\u001a\u00020\u0002HÆ\u0003J\t\u0010\t\u001a\u00020\u0002HÆ\u0003J\t\u0010\u000b\u001a\u00020\nHÆ\u0003JO\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\nHÆ\u0001J\t\u0010\u0015\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u0018\u001a\u00020\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010\u001c\"\u0004\b!\u0010\u001eR\"\u0010\u000e\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u001a\u001a\u0004\b#\u0010\u001c\"\u0004\b$\u0010\u001eR\"\u0010\u000f\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u0010\u0010\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010\u001a\u001a\u0004\b,\u0010\u001c\"\u0004\b-\u0010\u001eR\"\u0010\u0011\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010\u001a\u001a\u0004\b/\u0010\u001c\"\u0004\b0\u0010\u001eR\"\u0010\u0012\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106¨\u00069"}, d2 = {"Lcom/xiaomi/hm/health/ui/smartplay/btphone/incomingalert/IncomingCallSettingData;", "", "", "component1", "component2", "component3", "", "component4", "component5", "component6", "Lcom/xiaomi/hm/health/ui/smartplay/btphone/phonecallalertsetting/AuthStatus;", "component7", "deviceEnable", "alertEnable", "delayEnable", "delayTime", "showContact", "supportShowContact", "authStatus", "copy", "", "toString", "hashCode", "other", "equals", "a", "Z", "getDeviceEnable", "()Z", "setDeviceEnable", "(Z)V", "b", "getAlertEnable", "setAlertEnable", "c", "getDelayEnable", "setDelayEnable", GoogleApiAvailabilityLight.a, LogUtil.I, "getDelayTime", "()I", "setDelayTime", "(I)V", "e", "getShowContact", "setShowContact", "f", "getSupportShowContact", "setSupportShowContact", "g", "Lcom/xiaomi/hm/health/ui/smartplay/btphone/phonecallalertsetting/AuthStatus;", "getAuthStatus", "()Lcom/xiaomi/hm/health/ui/smartplay/btphone/phonecallalertsetting/AuthStatus;", "setAuthStatus", "(Lcom/xiaomi/hm/health/ui/smartplay/btphone/phonecallalertsetting/AuthStatus;)V", "<init>", "(ZZZIZZLcom/xiaomi/hm/health/ui/smartplay/btphone/phonecallalertsetting/AuthStatus;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class IncomingCallSettingData {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private boolean deviceEnable;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private boolean alertEnable;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private boolean delayEnable;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private int delayTime;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private boolean showContact;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    private boolean supportShowContact;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @NotNull
    private AuthStatus authStatus;

    public IncomingCallSettingData() {
        this(false, false, false, 0, false, false, null, 127, null);
    }

    public IncomingCallSettingData(boolean z, boolean z2, boolean z3, int i, boolean z4, boolean z5, @NotNull AuthStatus authStatus) {
        this.deviceEnable = z;
        this.alertEnable = z2;
        this.delayEnable = z3;
        this.delayTime = i;
        this.showContact = z4;
        this.supportShowContact = z5;
        this.authStatus = authStatus;
    }

    public static /* synthetic */ IncomingCallSettingData copy$default(IncomingCallSettingData incomingCallSettingData, boolean z, boolean z2, boolean z3, int i, boolean z4, boolean z5, AuthStatus authStatus, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = incomingCallSettingData.deviceEnable;
        }
        if ((i2 & 2) != 0) {
            z2 = incomingCallSettingData.alertEnable;
        }
        boolean z6 = z2;
        if ((i2 & 4) != 0) {
            z3 = incomingCallSettingData.delayEnable;
        }
        boolean z7 = z3;
        if ((i2 & 8) != 0) {
            i = incomingCallSettingData.delayTime;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            z4 = incomingCallSettingData.showContact;
        }
        boolean z8 = z4;
        if ((i2 & 32) != 0) {
            z5 = incomingCallSettingData.supportShowContact;
        }
        boolean z9 = z5;
        if ((i2 & 64) != 0) {
            authStatus = incomingCallSettingData.authStatus;
        }
        return incomingCallSettingData.copy(z, z6, z7, i3, z8, z9, authStatus);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getDeviceEnable() {
        return this.deviceEnable;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getAlertEnable() {
        return this.alertEnable;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getDelayEnable() {
        return this.delayEnable;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getDelayTime() {
        return this.delayTime;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getShowContact() {
        return this.showContact;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getSupportShowContact() {
        return this.supportShowContact;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final AuthStatus getAuthStatus() {
        return this.authStatus;
    }

    @NotNull
    public final IncomingCallSettingData copy(boolean deviceEnable, boolean alertEnable, boolean delayEnable, int delayTime, boolean showContact, boolean supportShowContact, @NotNull AuthStatus authStatus) {
        return new IncomingCallSettingData(deviceEnable, alertEnable, delayEnable, delayTime, showContact, supportShowContact, authStatus);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IncomingCallSettingData)) {
            return false;
        }
        IncomingCallSettingData incomingCallSettingData = (IncomingCallSettingData) other;
        return this.deviceEnable == incomingCallSettingData.deviceEnable && this.alertEnable == incomingCallSettingData.alertEnable && this.delayEnable == incomingCallSettingData.delayEnable && this.delayTime == incomingCallSettingData.delayTime && this.showContact == incomingCallSettingData.showContact && this.supportShowContact == incomingCallSettingData.supportShowContact && Intrinsics.areEqual(this.authStatus, incomingCallSettingData.authStatus);
    }

    public final boolean getAlertEnable() {
        return this.alertEnable;
    }

    @NotNull
    public final AuthStatus getAuthStatus() {
        return this.authStatus;
    }

    public final boolean getDelayEnable() {
        return this.delayEnable;
    }

    public final int getDelayTime() {
        return this.delayTime;
    }

    public final boolean getDeviceEnable() {
        return this.deviceEnable;
    }

    public final boolean getShowContact() {
        return this.showContact;
    }

    public final boolean getSupportShowContact() {
        return this.supportShowContact;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v11, types: [int] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v6, types: [int] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    public int hashCode() {
        boolean z = this.deviceEnable;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        boolean z2 = this.alertEnable;
        ?? r2 = z2;
        if (z2) {
            r2 = 1;
        }
        int i2 = (i + r2) * 31;
        boolean z3 = this.delayEnable;
        ?? r3 = z3;
        if (z3) {
            r3 = 1;
        }
        int i3 = (((i2 + r3) * 31) + this.delayTime) * 31;
        boolean z4 = this.showContact;
        ?? r4 = z4;
        if (z4) {
            r4 = 1;
        }
        int i4 = (i3 + r4) * 31;
        boolean z5 = this.supportShowContact;
        return ((i4 + (z5 ? 1 : z5)) * 31) + this.authStatus.hashCode();
    }

    public final void setAlertEnable(boolean z) {
        this.alertEnable = z;
    }

    public final void setAuthStatus(@NotNull AuthStatus authStatus) {
        this.authStatus = authStatus;
    }

    public final void setDelayEnable(boolean z) {
        this.delayEnable = z;
    }

    public final void setDelayTime(int i) {
        this.delayTime = i;
    }

    public final void setDeviceEnable(boolean z) {
        this.deviceEnable = z;
    }

    public final void setShowContact(boolean z) {
        this.showContact = z;
    }

    public final void setSupportShowContact(boolean z) {
        this.supportShowContact = z;
    }

    @NotNull
    public String toString() {
        return "IncomingCallSettingData(deviceEnable=" + this.deviceEnable + ", alertEnable=" + this.alertEnable + ", delayEnable=" + this.delayEnable + ", delayTime=" + this.delayTime + ", showContact=" + this.showContact + ", supportShowContact=" + this.supportShowContact + ", authStatus=" + this.authStatus + ")";
    }

    public /* synthetic */ IncomingCallSettingData(boolean z, boolean z2, boolean z3, int i, boolean z4, boolean z5, AuthStatus authStatus, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? false : z2, (i2 & 4) != 0 ? false : z3, (i2 & 8) != 0 ? 3 : i, (i2 & 16) != 0 ? false : z4, (i2 & 32) == 0 ? z5 : false, (i2 & 64) != 0 ? new AuthStatus(false, false, false, false, 8, null) : authStatus);
    }
}
