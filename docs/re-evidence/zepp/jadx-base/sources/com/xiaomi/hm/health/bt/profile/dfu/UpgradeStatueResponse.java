package com.xiaomi.hm.health.bt.profile.dfu;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\u0012\u001a\u00020\r\u0012\u0006\u0010\u0015\u001a\u00020\u0007\u0012\u0006\u0010\u0018\u001a\u00020\u0007\u0012\u0006\u0010\u001b\u001a\u00020\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016R\u0019\u0010\f\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0012\u001a\u00020\r8\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0015\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\t\u001a\u0004\b\u0014\u0010\u000bR\u0019\u0010\u0018\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\t\u001a\u0004\b\u0017\u0010\u000bR\u0019\u0010\u001b\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\t\u001a\u0004\b\u001a\u0010\u000b¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/dfu/UpgradeStatueResponse;", "", "", "isOk", "available", "", "toString", "", "a", LogUtil.I, "getCode", "()I", "code", "Lcom/xiaomi/hm/health/bt/profile/dfu/UpgradeStatus;", "b", "Lcom/xiaomi/hm/health/bt/profile/dfu/UpgradeStatus;", "getUpgradeStatus", "()Lcom/xiaomi/hm/health/bt/profile/dfu/UpgradeStatus;", "upgradeStatus", "c", "getFirmwareType", "firmwareType", GoogleApiAvailabilityLight.a, "getFirmwareSize", "firmwareSize", "e", "getFirmwareUpgradedSize", "firmwareUpgradedSize", "<init>", "(ILcom/xiaomi/hm/health/bt/profile/dfu/UpgradeStatus;III)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class UpgradeStatueResponse {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int code;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final UpgradeStatus upgradeStatus;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final int firmwareType;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final int firmwareSize;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private final int firmwareUpgradedSize;

    public UpgradeStatueResponse(int i, @NotNull UpgradeStatus upgradeStatus, int i2, int i3, int i4) {
        this.code = i;
        this.upgradeStatus = upgradeStatus;
        this.firmwareType = i2;
        this.firmwareSize = i3;
        this.firmwareUpgradedSize = i4;
    }

    public final boolean available() {
        return this.upgradeStatus == UpgradeStatus.IDLE;
    }

    public final int getCode() {
        return this.code;
    }

    public final int getFirmwareSize() {
        return this.firmwareSize;
    }

    public final int getFirmwareType() {
        return this.firmwareType;
    }

    public final int getFirmwareUpgradedSize() {
        return this.firmwareUpgradedSize;
    }

    @NotNull
    public final UpgradeStatus getUpgradeStatus() {
        return this.upgradeStatus;
    }

    public final boolean isOk() {
        return this.code == 1;
    }

    @NotNull
    public String toString() {
        return "UpgradeStatueResponse(code=" + this.code + ", upgradeStatus=" + this.upgradeStatus + ", firmwareType=" + this.firmwareType + ", firmwareSize=" + this.firmwareSize + ", firmwareUpgradedSize=" + this.firmwareUpgradedSize + ')';
    }
}
