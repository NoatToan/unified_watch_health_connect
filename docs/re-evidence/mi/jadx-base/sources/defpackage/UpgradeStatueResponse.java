package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: pv, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u0006\u0012\u0006\u0010\u0012\u001a\u00020\u0006\u0012\u0006\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0017J\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0010\u0010\b\u001a\u0004\b\u0011\u0010\nR\u0017\u0010\u0012\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0012\u0010\b\u001a\u0004\b\u0013\u0010\nR\u0017\u0010\u0014\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0014\u0010\b\u001a\u0004\b\u0015\u0010\n¨\u0006\u0018"}, d2 = {"Lpv;", "", "", PluginDeviceInfo.FBLUETOOTHPAIR, "", "toString", "", "code", "I", PluginDeviceInfo.FMODEL, "()I", "Lqv;", "upgradeStatus", "Lqv;", PluginDeviceInfo.FICONOFFLINE, "()Lqv;", "firmwareType", PluginDeviceInfo.FICONON, "firmwareSize", PluginDeviceInfo.FDESC, "firmwareUpgradedSize", PluginDeviceInfo.FICONOFF, "<init>", "(ILqv;III)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class UpgradeStatueResponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from toString */
    public final int code;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from toString */
    @NotNull
    public final UpgradeStatus upgradeStatus;

    /* JADX INFO: renamed from: c, reason: from toString */
    public final int firmwareType;

    /* JADX INFO: renamed from: d, reason: from toString */
    public final int firmwareSize;

    /* JADX INFO: renamed from: e, reason: from toString */
    public final int firmwareUpgradedSize;

    public UpgradeStatueResponse(int i, @NotNull UpgradeStatus upgradeStatus, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(upgradeStatus, "upgradeStatus");
        this.code = i;
        this.upgradeStatus = upgradeStatus;
        this.firmwareType = i2;
        this.firmwareSize = i3;
        this.firmwareUpgradedSize = i4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getFirmwareSize() {
        return this.firmwareSize;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getFirmwareType() {
        return this.firmwareType;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getFirmwareUpgradedSize() {
        return this.firmwareUpgradedSize;
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final UpgradeStatus getUpgradeStatus() {
        return this.upgradeStatus;
    }

    public final boolean f() {
        return this.code == 1;
    }

    @NotNull
    public String toString() {
        return "UpgradeStatueResponse(code=" + this.code + ", upgradeStatus=" + this.upgradeStatus + ", firmwareType=" + this.firmwareType + ", firmwareSize=" + this.firmwareSize + ", firmwareUpgradedSize=" + this.firmwareUpgradedSize + ')';
    }
}
