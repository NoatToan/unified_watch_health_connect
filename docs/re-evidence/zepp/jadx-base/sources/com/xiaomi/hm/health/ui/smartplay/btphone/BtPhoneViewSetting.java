package com.xiaomi.hm.health.ui.smartplay.btphone;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u001c\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b)\u0010*J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0002HÆ\u0003J\t\u0010\b\u001a\u00020\u0002HÆ\u0003J;\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019R\"\u0010\u000b\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\u0015\u001a\u0004\b$\u0010\u0017\"\u0004\b%\u0010\u0019R\"\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010\u0015\u001a\u0004\b'\u0010\u0017\"\u0004\b(\u0010\u0019¨\u0006+"}, d2 = {"Lcom/xiaomi/hm/health/ui/smartplay/btphone/BtPhoneViewSetting;", "", "", "component1", "component2", "", "component3", "component4", "component5", "btPhoneEnable", "delayAlertEnable", "delayAlertTime", "deviceEnable", "contactPermissionGained", "copy", "", "toString", "hashCode", "other", "equals", "a", "Z", "getBtPhoneEnable", "()Z", "setBtPhoneEnable", "(Z)V", "b", "getDelayAlertEnable", "setDelayAlertEnable", "c", LogUtil.I, "getDelayAlertTime", "()I", "setDelayAlertTime", "(I)V", GoogleApiAvailabilityLight.a, "getDeviceEnable", "setDeviceEnable", "e", "getContactPermissionGained", "setContactPermissionGained", "<init>", "(ZZIZZ)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class BtPhoneViewSetting {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private boolean btPhoneEnable;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private boolean delayAlertEnable;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private int delayAlertTime;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private boolean deviceEnable;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private boolean contactPermissionGained;

    public BtPhoneViewSetting() {
        this(false, false, 0, false, false, 31, null);
    }

    public BtPhoneViewSetting(boolean z, boolean z2, int i, boolean z3, boolean z4) {
        this.btPhoneEnable = z;
        this.delayAlertEnable = z2;
        this.delayAlertTime = i;
        this.deviceEnable = z3;
        this.contactPermissionGained = z4;
    }

    public static /* synthetic */ BtPhoneViewSetting copy$default(BtPhoneViewSetting btPhoneViewSetting, boolean z, boolean z2, int i, boolean z3, boolean z4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = btPhoneViewSetting.btPhoneEnable;
        }
        if ((i2 & 2) != 0) {
            z2 = btPhoneViewSetting.delayAlertEnable;
        }
        boolean z5 = z2;
        if ((i2 & 4) != 0) {
            i = btPhoneViewSetting.delayAlertTime;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            z3 = btPhoneViewSetting.deviceEnable;
        }
        boolean z6 = z3;
        if ((i2 & 16) != 0) {
            z4 = btPhoneViewSetting.contactPermissionGained;
        }
        return btPhoneViewSetting.copy(z, z5, i3, z6, z4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getBtPhoneEnable() {
        return this.btPhoneEnable;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getDelayAlertEnable() {
        return this.delayAlertEnable;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getDelayAlertTime() {
        return this.delayAlertTime;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getDeviceEnable() {
        return this.deviceEnable;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getContactPermissionGained() {
        return this.contactPermissionGained;
    }

    @NotNull
    public final BtPhoneViewSetting copy(boolean btPhoneEnable, boolean delayAlertEnable, int delayAlertTime, boolean deviceEnable, boolean contactPermissionGained) {
        return new BtPhoneViewSetting(btPhoneEnable, delayAlertEnable, delayAlertTime, deviceEnable, contactPermissionGained);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BtPhoneViewSetting)) {
            return false;
        }
        BtPhoneViewSetting btPhoneViewSetting = (BtPhoneViewSetting) other;
        return this.btPhoneEnable == btPhoneViewSetting.btPhoneEnable && this.delayAlertEnable == btPhoneViewSetting.delayAlertEnable && this.delayAlertTime == btPhoneViewSetting.delayAlertTime && this.deviceEnable == btPhoneViewSetting.deviceEnable && this.contactPermissionGained == btPhoneViewSetting.contactPermissionGained;
    }

    public final boolean getBtPhoneEnable() {
        return this.btPhoneEnable;
    }

    public final boolean getContactPermissionGained() {
        return this.contactPermissionGained;
    }

    public final boolean getDelayAlertEnable() {
        return this.delayAlertEnable;
    }

    public final int getDelayAlertTime() {
        return this.delayAlertTime;
    }

    public final boolean getDeviceEnable() {
        return this.deviceEnable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v4, types: [int] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    public int hashCode() {
        boolean z = this.btPhoneEnable;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        boolean z2 = this.delayAlertEnable;
        ?? r2 = z2;
        if (z2) {
            r2 = 1;
        }
        int i2 = (((i + r2) * 31) + this.delayAlertTime) * 31;
        boolean z3 = this.deviceEnable;
        ?? r3 = z3;
        if (z3) {
            r3 = 1;
        }
        int i3 = (i2 + r3) * 31;
        boolean z4 = this.contactPermissionGained;
        return i3 + (z4 ? 1 : z4);
    }

    public final void setBtPhoneEnable(boolean z) {
        this.btPhoneEnable = z;
    }

    public final void setContactPermissionGained(boolean z) {
        this.contactPermissionGained = z;
    }

    public final void setDelayAlertEnable(boolean z) {
        this.delayAlertEnable = z;
    }

    public final void setDelayAlertTime(int i) {
        this.delayAlertTime = i;
    }

    public final void setDeviceEnable(boolean z) {
        this.deviceEnable = z;
    }

    @NotNull
    public String toString() {
        return "BtPhoneViewSetting(btPhoneEnable=" + this.btPhoneEnable + ", delayAlertEnable=" + this.delayAlertEnable + ", delayAlertTime=" + this.delayAlertTime + ", deviceEnable=" + this.deviceEnable + ", contactPermissionGained=" + this.contactPermissionGained + ")";
    }

    public /* synthetic */ BtPhoneViewSetting(boolean z, boolean z2, int i, boolean z3, boolean z4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? false : z2, (i2 & 4) != 0 ? 3 : i, (i2 & 8) != 0 ? false : z3, (i2 & 16) != 0 ? false : z4);
    }
}
