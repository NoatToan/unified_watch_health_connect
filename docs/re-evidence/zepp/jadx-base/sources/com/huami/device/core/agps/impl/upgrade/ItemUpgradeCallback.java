package com.huami.device.core.agps.impl.upgrade;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.xiaomi.hm.health.bt.profile.dfu.HMFirmwareType;
import com.xiaomi.hm.health.bt.profile.dfu.IFirmwareUpgradeCallback;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0001\u0012\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016R\u0016\u0010\u0010\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0012\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0016\u0010\u0015\u001a\u00020\u00018\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R%\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00168\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Lcom/huami/device/core/agps/impl/upgrade/ItemUpgradeCallback;", "Lcom/xiaomi/hm/health/bt/profile/dfu/IFirmwareUpgradeCallback;", "", "none", "", "onFwStart", "", "result", "onFwStop", "errorCode", "onError", "Lcom/xiaomi/hm/health/bt/profile/mili/model/Progress;", "progress", "onFwProgress", "a", LogUtil.I, "totalSize", "b", "bsize", "c", "Lcom/xiaomi/hm/health/bt/profile/dfu/IFirmwareUpgradeCallback;", "totalCallback", "Lkotlin/Function1;", GoogleApiAvailabilityLight.a, "Lkotlin/jvm/functions/Function1;", "getOnStop", "()Lkotlin/jvm/functions/Function1;", "onStop", "<init>", "(IILcom/xiaomi/hm/health/bt/profile/dfu/IFirmwareUpgradeCallback;Lkotlin/jvm/functions/Function1;)V", "agps-impl_release"}, k = 1, mv = {1, 4, 0})
public final class ItemUpgradeCallback implements IFirmwareUpgradeCallback {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int totalSize;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int bsize;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final IFirmwareUpgradeCallback totalCallback;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Function1<Boolean, Unit> onStop;

    /* JADX WARN: Multi-variable type inference failed */
    public ItemUpgradeCallback(int i, int i2, @NotNull IFirmwareUpgradeCallback iFirmwareUpgradeCallback, @NotNull Function1<? super Boolean, Unit> function1) {
        this.totalSize = i;
        this.bsize = i2;
        this.totalCallback = iFirmwareUpgradeCallback;
        this.onStop = function1;
    }

    @NotNull
    public final Function1<Boolean, Unit> getOnStop() {
        return this.onStop;
    }

    @Override // com.xiaomi.hm.health.bt.profile.dfu.IFirmwareUpgradeCallback
    public void onError(int errorCode) {
        this.totalCallback.onError(errorCode);
    }

    @Override // com.xiaomi.hm.health.bt.profile.dfu.IHMFirmwareUpgradeCallback
    public void onFwProgress(@NotNull Progress progress) {
        this.totalCallback.onFwProgress(new Progress(this.totalSize, this.bsize + progress.progress));
    }

    @Override // com.xiaomi.hm.health.bt.profile.dfu.IHMFirmwareUpgradeCallback
    public void onFwStart(int none) {
    }

    @Override // com.xiaomi.hm.health.bt.profile.dfu.IHMFirmwareUpgradeCallback
    public void onFwStop(boolean result) {
        this.onStop.invoke(Boolean.valueOf(result));
    }

    @Override // com.xiaomi.hm.health.bt.profile.dfu.IFirmwareUpgradeCallback
    public void upgradingProgress(@NotNull HMFirmwareType hMFirmwareType, @NotNull Progress progress) {
        IFirmwareUpgradeCallback.DefaultImpls.upgradingProgress(this, hMFirmwareType, progress);
    }
}
