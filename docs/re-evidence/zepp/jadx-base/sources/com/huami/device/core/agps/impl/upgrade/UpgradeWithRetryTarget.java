package com.huami.device.core.agps.impl.upgrade;

import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.device.core.agps.AgpsUpgradeBuilder;
import com.huami.device.core.agps.impl.AgpsAnalytics;
import com.huami.device.core.agps.impl.store.FileUtil;
import com.huami.tools.log.HMLog;
import com.loc.z;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.profile.dfu.HMFirmwareInfo;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import java.io.File;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001BA\u0012\u0006\u00104\u001a\u000203\u0012\u0006\u0010.\u001a\u00020+\u0012\u0006\u00100\u001a\u00020\u0002\u0012\u0006\u00102\u001a\u00020\u0002\u0012\u0018\u00106\u001a\u0014\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r0\b¢\u0006\u0004\b7\u00108J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016JB\u0010\u000f\u001a\u00020\u000428\u0010\u000e\u001a4\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r\u0018\u00010\bH\u0016J\u0010\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0006H\u0016J\u0010\u0010\u0013\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0012H\u0016J\u0010\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0004H\u0016J\u0010\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0006H\u0016R\u0016\u0010\u0016\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001f\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010'\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010*\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010.\u001a\u00020+8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u00100\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010\u001bR\u0016\u00102\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010\u001b¨\u00069"}, d2 = {"Lcom/huami/device/core/agps/impl/upgrade/UpgradeWithRetryTarget;", "Lcom/huami/device/core/agps/impl/upgrade/BasicUpgradeTarget;", "Lcom/huami/device/core/agps/impl/upgrade/AGPSFirmwareStore;", "store", "", "a", "", "queryVersions", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "total", "progress", "", "onProgress", "upgrade", "none", "onFwStart", "Lcom/xiaomi/hm/health/bt/profile/mili/model/Progress;", "onFwProgress", "result", "onFwStop", "errorCode", "onError", "f", LogUtil.I, "g", "Lcom/huami/device/core/agps/impl/upgrade/AGPSFirmwareStore;", "currentStore", "h", "Z", "upgradeResult", "", "i", "J", "startTime", "Ljava/util/concurrent/atomic/AtomicBoolean;", z.j, "Ljava/util/concurrent/atomic/AtomicBoolean;", "isTransferFinished", hl.k, "Lcom/xiaomi/hm/health/bt/profile/mili/model/Progress;", "localProgress", "Lcom/huami/device/core/agps/impl/AgpsAnalytics;", "l", "Lcom/huami/device/core/agps/impl/AgpsAnalytics;", "analytics", "m", "primaryStore", GoogleApiAvailabilityLight.b, "secondaryStore", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "device", "", "onMessage", "<init>", "(Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;Lcom/huami/device/core/agps/impl/AgpsAnalytics;Lcom/huami/device/core/agps/impl/upgrade/AGPSFirmwareStore;Lcom/huami/device/core/agps/impl/upgrade/AGPSFirmwareStore;Lkotlin/jvm/functions/Function2;)V", "agps-impl_release"}, k = 1, mv = {1, 4, 0})
public final class UpgradeWithRetryTarget extends BasicUpgradeTarget {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private int errorCode;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private AGPSFirmwareStore currentStore;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private boolean upgradeResult;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private long startTime;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private AtomicBoolean isTransferFinished;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private Progress localProgress;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final AgpsAnalytics analytics;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final AGPSFirmwareStore primaryStore;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final AGPSFirmwareStore secondaryStore;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "[AGPS-ERROR] download agps files error, then can not update agps";
        }
    }

    public UpgradeWithRetryTarget(@NotNull HMBaseDevice hMBaseDevice, @NotNull AgpsAnalytics agpsAnalytics, @NotNull AGPSFirmwareStore aGPSFirmwareStore, @NotNull AGPSFirmwareStore aGPSFirmwareStore2, @NotNull Function2<? super String, ? super Integer, Unit> function2) {
        super(hMBaseDevice, function2);
        this.analytics = agpsAnalytics;
        this.primaryStore = aGPSFirmwareStore;
        this.secondaryStore = aGPSFirmwareStore2;
        this.isTransferFinished = new AtomicBoolean(false);
    }

    private final boolean a(AGPSFirmwareStore store) {
        try {
            List<HMFirmwareInfo> aGPSFirmwares = store.getAGPSFirmwares();
            if (aGPSFirmwares.isEmpty()) {
                getOnMessage().invoke("getAgpsFiles failed!!!", 0);
                return false;
            }
            boolean zAgpsUpgrade = agpsUpgrade(getDevice(), aGPSFirmwares);
            deleteFirmwareInfo(aGPSFirmwares);
            return zAgpsUpgrade;
        } catch (Throwable unused) {
            getOnMessage().invoke("AGPS file error", 0);
            HMLog.error$default(null, null, null, a.a, 7, null);
            return false;
        }
    }

    @Override // com.huami.device.core.agps.impl.upgrade.BasicUpgradeTarget, com.xiaomi.hm.health.bt.profile.dfu.IFirmwareUpgradeCallback
    public void onError(int errorCode) {
        this.errorCode = errorCode;
        getOnMessage().invoke("error code ---> " + errorCode, 0);
        Listener upgradeListener$agps_impl_release = AgpsUpgradeBuilder.INSTANCE.getUpgradeListener$agps_impl_release();
        if (upgradeListener$agps_impl_release != null) {
            upgradeListener$agps_impl_release.onResult(false, Integer.valueOf(errorCode));
        }
    }

    @Override // com.huami.device.core.agps.impl.upgrade.BasicUpgradeTarget, com.xiaomi.hm.health.bt.profile.dfu.IHMFirmwareUpgradeCallback
    public void onFwProgress(@NotNull Progress progress) {
        super.onFwProgress(progress);
        this.localProgress = progress;
        if (progress.getPercent() != 100 || this.isTransferFinished.get()) {
            return;
        }
        this.isTransferFinished.set(true);
        this.analytics.recordTransferSuccessEvent(System.currentTimeMillis() - this.startTime);
    }

    @Override // com.huami.device.core.agps.impl.upgrade.BasicUpgradeTarget, com.xiaomi.hm.health.bt.profile.dfu.IHMFirmwareUpgradeCallback
    public void onFwStart(int none) {
        this.startTime = System.currentTimeMillis();
        super.onFwStart(none);
    }

    @Override // com.huami.device.core.agps.impl.upgrade.BasicUpgradeTarget, com.xiaomi.hm.health.bt.profile.dfu.IHMFirmwareUpgradeCallback
    public void onFwStop(boolean result) {
        if (Intrinsics.areEqual(this.currentStore, this.primaryStore) && this.upgradeResult) {
            super.onFwStop(result);
        }
        if (Intrinsics.areEqual(this.currentStore, this.secondaryStore)) {
            super.onFwStop(result);
        }
        if (result) {
            this.analytics.recordUpgradeSuccessEvent(System.currentTimeMillis() - this.startTime);
        }
        Progress progress = this.localProgress;
        if ((progress != null ? progress.getPercent() : 0) < 99) {
            this.analytics.recordTransferFailureEvent(System.currentTimeMillis() - this.startTime);
        }
    }

    @Override // com.huami.device.core.agps.impl.upgrade.BasicUpgradeTarget, com.huami.device.core.agps.api.UpgradeTarget
    public int queryVersions() {
        return 0;
    }

    @Override // com.huami.device.core.agps.api.UpgradeTarget
    public boolean upgrade(@Nullable Function2<? super Integer, ? super Integer, Unit> onProgress) {
        if (!preCheckCanbeUpgrade()) {
            getOnMessage().invoke("pre check false", 0);
            return false;
        }
        if (!(getDevice() instanceof HMMiLiProDevice)) {
            getOnMessage().invoke("device is not HMMiLiProDevice", 0);
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        getOnMessage().invoke("主资源升级开始", 1);
        AGPSFirmwareStore aGPSFirmwareStore = this.primaryStore;
        this.currentStore = aGPSFirmwareStore;
        this.upgradeResult = a(aGPSFirmwareStore);
        FileUtil fileUtil = FileUtil.INSTANCE;
        fileUtil.deleteFile(new File(this.primaryStore.getTempDir()));
        getOnMessage().invoke("主资源升级AGPS结果：" + this.upgradeResult, 1);
        if (!this.upgradeResult) {
            this.analytics.recordUpgradeFailEvent(System.currentTimeMillis() - jCurrentTimeMillis);
            if (this.errorCode == 68) {
                this.errorCode = 0;
                getOnMessage().invoke("备用AGPS资源升级", 1);
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                AGPSFirmwareStore aGPSFirmwareStore2 = this.secondaryStore;
                this.currentStore = aGPSFirmwareStore2;
                this.upgradeResult = a(aGPSFirmwareStore2);
                this.analytics.recordRetryEvent(System.currentTimeMillis() - jCurrentTimeMillis2);
                getOnMessage().invoke("备用AGPS资源升级结果: " + this.upgradeResult, 1);
                fileUtil.deleteFile(new File(this.secondaryStore.getTempDir()));
            }
        }
        super.onFwStop(this.upgradeResult);
        return this.upgradeResult;
    }
}
