package com.xiaomi.hm.health.bt.profile.dfu;

import android.os.ConditionVariable;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u0000 62\u00020\u0001:\u00016B%\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0010\u001a\u001a\u00020\u0015\u0012\u0006\u0010 \u001a\u00020\u001b¢\u0006\u0004\b4\u00105J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0006\u0010\u000f\u001a\u00020\u0006R\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0019\u0010\u001a\u001a\u00020\u00158\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010 \u001a\u00020\u001b8\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010$\u001a\b\u0012\u0004\u0012\u00020\b0!8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010(\u001a\u00020%8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010+\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010.\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u00101\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00103\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010-¨\u00067"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/dfu/DfuExecutor;", "Lcom/xiaomi/hm/health/bt/profile/dfu/IFirmwareUpgradeCallback;", "Lcom/xiaomi/hm/health/bt/profile/dfu/HMFirmwareType;", "type", "Lcom/xiaomi/hm/health/bt/profile/mili/model/Progress;", "progress", "", "upgradingProgress", "", "none", "onFwStart", "", "result", "onFwStop", "onFwProgress", "run", "", "Lcom/xiaomi/hm/health/bt/profile/dfu/HMFirmwareInfo;", "a", "Ljava/util/List;", "firmwares", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "b", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "getDevice", "()Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "device", "Lcom/xiaomi/hm/health/bt/profile/dfu/IHMFirmwareUpgradeCallback;", "c", "Lcom/xiaomi/hm/health/bt/profile/dfu/IHMFirmwareUpgradeCallback;", "getCallback", "()Lcom/xiaomi/hm/health/bt/profile/dfu/IHMFirmwareUpgradeCallback;", "callback", "Ljava/util/ArrayList;", GoogleApiAvailabilityLight.a, "Ljava/util/ArrayList;", "sizes", "Landroid/os/ConditionVariable;", "e", "Landroid/os/ConditionVariable;", "condition", "f", "Lcom/xiaomi/hm/health/bt/profile/mili/model/Progress;", "mLastProgress", "g", LogUtil.I, "currentFwIndex", "h", "Z", "needBreakUpgrade", "i", "total", "<init>", "(Ljava/util/List;Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;Lcom/xiaomi/hm/health/bt/profile/dfu/IHMFirmwareUpgradeCallback;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class DfuExecutor implements IFirmwareUpgradeCallback {

    @NotNull
    private static final String j = "DfuExecutor";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final List<HMFirmwareInfo> firmwares;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final HMBaseDevice device;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final IHMFirmwareUpgradeCallback callback;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final ArrayList<Integer> sizes = new ArrayList<>();

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final ConditionVariable condition = new ConditionVariable();

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Progress mLastProgress = new Progress();

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private int currentFwIndex = -1;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private boolean needBreakUpgrade = false;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private int total;

    /* JADX WARN: Multi-variable type inference failed */
    public DfuExecutor(@NotNull List<? extends HMFirmwareInfo> list, @NotNull HMBaseDevice hMBaseDevice, @NotNull IHMFirmwareUpgradeCallback iHMFirmwareUpgradeCallback) {
        this.firmwares = list;
        this.device = hMBaseDevice;
        this.callback = iHMFirmwareUpgradeCallback;
        for (HMFirmwareInfo hMFirmwareInfo : list) {
            this.sizes.add(Integer.valueOf(this.total));
            this.total += (int) new File(hMFirmwareInfo.getFwPath()).length();
        }
        this.mLastProgress.total = this.total;
    }

    @NotNull
    public final IHMFirmwareUpgradeCallback getCallback() {
        return this.callback;
    }

    @NotNull
    public final HMBaseDevice getDevice() {
        return this.device;
    }

    @Override // com.xiaomi.hm.health.bt.profile.dfu.IFirmwareUpgradeCallback
    public void onError(int i) {
        IFirmwareUpgradeCallback.DefaultImpls.onError(this, i);
    }

    @Override // com.xiaomi.hm.health.bt.profile.dfu.IHMFirmwareUpgradeCallback
    public void onFwProgress(@NotNull Progress progress) {
        Debug.fi(j, Intrinsics.stringPlus("onProgress:", Integer.valueOf(progress.getPercent())));
        this.mLastProgress.progress = this.sizes.get(this.currentFwIndex).intValue() + progress.progress;
        this.callback.onFwProgress(this.mLastProgress);
    }

    @Override // com.xiaomi.hm.health.bt.profile.dfu.IHMFirmwareUpgradeCallback
    public void onFwStart(int none) {
        Debug.fi(j, "onFwStart");
        this.callback.onFwStart(none);
    }

    @Override // com.xiaomi.hm.health.bt.profile.dfu.IHMFirmwareUpgradeCallback
    public void onFwStop(boolean result) {
        Debug.fi(j, Intrinsics.stringPlus("onFwStop:", Boolean.valueOf(result)));
        if (this.currentFwIndex == this.firmwares.size() - 1 && result) {
            this.condition.open();
            this.callback.onFwStop(true);
        } else {
            if (!result) {
                this.needBreakUpgrade = true;
                this.callback.onFwStop(false);
            }
            this.condition.open();
        }
    }

    public final void run() {
        if (!this.device.isConnected()) {
            Debug.fi(j, "Device is not connected");
            this.callback.onFwStop(false);
            return;
        }
        Debug.fi(j, "In main fw task");
        for (HMFirmwareInfo hMFirmwareInfo : this.firmwares) {
            if (!this.needBreakUpgrade) {
                this.currentFwIndex++;
                Debug.fi(j, Intrinsics.stringPlus("upgrade ", hMFirmwareInfo.getFwPath()));
                getDevice().updateFwUpgrade(hMFirmwareInfo, this);
                this.condition.close();
                this.condition.block();
            }
        }
    }

    @Override // com.xiaomi.hm.health.bt.profile.dfu.IFirmwareUpgradeCallback
    public void upgradingProgress(@NotNull HMFirmwareType type, @NotNull Progress progress) {
        this.callback.onFwProgress(progress);
    }
}
