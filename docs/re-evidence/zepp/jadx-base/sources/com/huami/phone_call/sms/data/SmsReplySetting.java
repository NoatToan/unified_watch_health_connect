package com.huami.phone_call.sms.data;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J1\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u0002HÆ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u0019\u0010\t\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0013\u001a\u0004\b\u001b\u0010\u0015¨\u0006\u001e"}, d2 = {"Lcom/huami/phone_call/sms/data/SmsReplySetting;", "", "", "component1", "component2", "component3", "component4", "visible", "deviceConnected", "phoneAlertEnable", "replyEnable", "copy", "", "toString", "", "hashCode", "other", "equals", "a", "Z", "getVisible", "()Z", "b", "getDeviceConnected", "c", "getPhoneAlertEnable", GoogleApiAvailabilityLight.a, "getReplyEnable", "<init>", "(ZZZZ)V", "phone_call_sms_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class SmsReplySetting {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final boolean visible;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final boolean deviceConnected;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final boolean phoneAlertEnable;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final boolean replyEnable;

    public SmsReplySetting(boolean z, boolean z2, boolean z3, boolean z4) {
        this.visible = z;
        this.deviceConnected = z2;
        this.phoneAlertEnable = z3;
        this.replyEnable = z4;
    }

    public static /* synthetic */ SmsReplySetting copy$default(SmsReplySetting smsReplySetting, boolean z, boolean z2, boolean z3, boolean z4, int i, Object obj) {
        if ((i & 1) != 0) {
            z = smsReplySetting.visible;
        }
        if ((i & 2) != 0) {
            z2 = smsReplySetting.deviceConnected;
        }
        if ((i & 4) != 0) {
            z3 = smsReplySetting.phoneAlertEnable;
        }
        if ((i & 8) != 0) {
            z4 = smsReplySetting.replyEnable;
        }
        return smsReplySetting.copy(z, z2, z3, z4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getVisible() {
        return this.visible;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getDeviceConnected() {
        return this.deviceConnected;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getPhoneAlertEnable() {
        return this.phoneAlertEnable;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getReplyEnable() {
        return this.replyEnable;
    }

    @NotNull
    public final SmsReplySetting copy(boolean visible, boolean deviceConnected, boolean phoneAlertEnable, boolean replyEnable) {
        return new SmsReplySetting(visible, deviceConnected, phoneAlertEnable, replyEnable);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SmsReplySetting)) {
            return false;
        }
        SmsReplySetting smsReplySetting = (SmsReplySetting) other;
        return this.visible == smsReplySetting.visible && this.deviceConnected == smsReplySetting.deviceConnected && this.phoneAlertEnable == smsReplySetting.phoneAlertEnable && this.replyEnable == smsReplySetting.replyEnable;
    }

    public final boolean getDeviceConnected() {
        return this.deviceConnected;
    }

    public final boolean getPhoneAlertEnable() {
        return this.phoneAlertEnable;
    }

    public final boolean getReplyEnable() {
        return this.replyEnable;
    }

    public final boolean getVisible() {
        return this.visible;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    public int hashCode() {
        boolean z = this.visible;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        boolean z2 = this.deviceConnected;
        ?? r2 = z2;
        if (z2) {
            r2 = 1;
        }
        int i2 = (i + r2) * 31;
        boolean z3 = this.phoneAlertEnable;
        ?? r3 = z3;
        if (z3) {
            r3 = 1;
        }
        int i3 = (i2 + r3) * 31;
        boolean z4 = this.replyEnable;
        return i3 + (z4 ? 1 : z4);
    }

    @NotNull
    public String toString() {
        return "SmsReplySetting(visible=" + this.visible + ", deviceConnected=" + this.deviceConnected + ", phoneAlertEnable=" + this.phoneAlertEnable + ", replyEnable=" + this.replyEnable + ")";
    }
}
