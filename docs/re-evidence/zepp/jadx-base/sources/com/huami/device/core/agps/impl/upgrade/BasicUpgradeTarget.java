package com.huami.device.core.agps.impl.upgrade;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.device.core.agps.AgpsUpgradeBuilder;
import com.huami.device.core.agps.api.UpgradeTarget;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.bt.profile.dfu.HMFirmwareInfo;
import com.xiaomi.hm.health.bt.profile.dfu.HMFirmwareType;
import com.xiaomi.hm.health.bt.profile.dfu.IFirmwareUpgradeCallback;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0007\b&\u0018\u00002\u00020\u00012\u00020\u0002B)\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0018\u00100\u001a\u0014\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000f0\u001d¢\u0006\u0004\b1\u00102J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0004J\u001e\u0010\f\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0004J\u0016\u0010\r\u001a\u00020\u00032\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0004J\u0016\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0004J\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0003H\u0016J\u0010\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0005H\u0016J\u0010\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016J\u0010\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0003H&R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bRH\u0010#\u001a4\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( \u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010'\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0019\u0010\b\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R+\u00100\u001a\u0014\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000f0\u001d8\u0006@\u0006¢\u0006\f\n\u0004\b-\u0010\"\u001a\u0004\b.\u0010/¨\u00063"}, d2 = {"Lcom/huami/device/core/agps/impl/upgrade/BasicUpgradeTarget;", "Lcom/huami/device/core/agps/api/UpgradeTarget;", "Lcom/xiaomi/hm/health/bt/profile/dfu/IFirmwareUpgradeCallback;", "", "queryVersions", "", "preCheckCanbeUpgrade", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "device", "", "Lcom/xiaomi/hm/health/bt/profile/dfu/HMFirmwareInfo;", "firmwareInfos", "agpsUpgrade", "getFirmwareTotalSize", "infos", "", "deleteFirmwareInfo", "none", "onFwStart", "result", "onFwStop", "Lcom/xiaomi/hm/health/bt/profile/mili/model/Progress;", "progress", "onFwProgress", "errorCode", "onError", "a", "Lcom/xiaomi/hm/health/bt/profile/mili/model/Progress;", "agpsProgress", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "total", "b", "Lkotlin/jvm/functions/Function2;", "onProgress", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "c", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "source", GoogleApiAvailabilityLight.a, "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "getDevice", "()Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "", "e", "getOnMessage", "()Lkotlin/jvm/functions/Function2;", "onMessage", "<init>", "(Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;Lkotlin/jvm/functions/Function2;)V", "agps-impl_release"}, k = 1, mv = {1, 4, 0})
public abstract class BasicUpgradeTarget implements UpgradeTarget, IFirmwareUpgradeCallback {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private Progress agpsProgress;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private Function2<? super Integer, ? super Integer, Unit> onProgress;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private HMDeviceSource source;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final HMBaseDevice device;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Function2<String, Integer, Unit> onMessage;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class a extends Lambda implements Function1<Boolean, Unit> {
        public final /* synthetic */ AtomicBoolean a;
        public final /* synthetic */ CountDownLatch b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AtomicBoolean atomicBoolean, CountDownLatch countDownLatch) {
            super(1);
            this.a = atomicBoolean;
            this.b = countDownLatch;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            this.a.getAndSet(z);
            this.b.countDown();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BasicUpgradeTarget(@NotNull HMBaseDevice hMBaseDevice, @NotNull Function2<? super String, ? super Integer, Unit> function2) {
        this.device = hMBaseDevice;
        this.onMessage = function2;
    }

    public final boolean agpsUpgrade(@NotNull HMBaseDevice device, @NotNull List<? extends HMFirmwareInfo> firmwareInfos) {
        int firmwareTotalSize = getFirmwareTotalSize(firmwareInfos);
        onFwStart(0);
        boolean z = true;
        int length = 0;
        for (HMFirmwareInfo hMFirmwareInfo : firmwareInfos) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            device.updateFwUpgrade(hMFirmwareInfo, new ItemUpgradeCallback(firmwareTotalSize, length, this, new a(atomicBoolean, countDownLatch)));
            try {
                countDownLatch.await();
            } catch (Exception e) {
                this.onMessage.invoke("agpsUpgrade alm exception:" + e.getMessage(), 1);
            }
            length += (int) new File(hMFirmwareInfo.getFwPath()).length();
            z = z && atomicBoolean.get();
        }
        onFwStop(z);
        return z;
    }

    public final void deleteFirmwareInfo(@NotNull List<? extends HMFirmwareInfo> infos) {
        for (HMFirmwareInfo hMFirmwareInfo : infos) {
            boolean zDelete = new File(hMFirmwareInfo.getFwPath()).delete();
            this.onMessage.invoke("Delete file " + hMFirmwareInfo.getFwPath() + " result:" + zDelete, 0);
        }
    }

    @NotNull
    public final HMBaseDevice getDevice() {
        return this.device;
    }

    public final int getFirmwareTotalSize(@NotNull List<? extends HMFirmwareInfo> firmwareInfos) {
        Iterator<? extends HMFirmwareInfo> it2 = firmwareInfos.iterator();
        int length = 0;
        while (it2.hasNext()) {
            length += (int) new File(it2.next().getFwPath()).length();
        }
        return length;
    }

    @NotNull
    public final Function2<String, Integer, Unit> getOnMessage() {
        return this.onMessage;
    }

    @Override // com.xiaomi.hm.health.bt.profile.dfu.IFirmwareUpgradeCallback
    public abstract void onError(int errorCode);

    @Override // com.xiaomi.hm.health.bt.profile.dfu.IHMFirmwareUpgradeCallback
    public void onFwProgress(@NotNull Progress progress) {
        this.onMessage.invoke("onFwProgress:" + progress, Integer.valueOf(progress.progress));
        Listener upgradeListener$agps_impl_release = AgpsUpgradeBuilder.INSTANCE.getUpgradeListener$agps_impl_release();
        if (upgradeListener$agps_impl_release != null) {
            upgradeListener$agps_impl_release.onProgress(progress);
        }
        this.agpsProgress = progress;
    }

    @Override // com.xiaomi.hm.health.bt.profile.dfu.IHMFirmwareUpgradeCallback
    public void onFwStart(int none) {
        this.onMessage.invoke("onFwStart", 0);
        Listener upgradeListener$agps_impl_release = AgpsUpgradeBuilder.INSTANCE.getUpgradeListener$agps_impl_release();
        if (upgradeListener$agps_impl_release != null) {
            upgradeListener$agps_impl_release.onStart();
        }
    }

    @Override // com.xiaomi.hm.health.bt.profile.dfu.IHMFirmwareUpgradeCallback
    public void onFwStop(boolean result) {
        this.onMessage.invoke("onFwStop:" + result, 1);
        AgpsUpgradeBuilder agpsUpgradeBuilder = AgpsUpgradeBuilder.INSTANCE;
        Listener upgradeListener$agps_impl_release = agpsUpgradeBuilder.getUpgradeListener$agps_impl_release();
        if (upgradeListener$agps_impl_release != null) {
            upgradeListener$agps_impl_release.onResult(result, null);
        }
        Listener upgradeListener$agps_impl_release2 = agpsUpgradeBuilder.getUpgradeListener$agps_impl_release();
        if (upgradeListener$agps_impl_release2 != null) {
            upgradeListener$agps_impl_release2.onStop();
        }
    }

    public final boolean preCheckCanbeUpgrade() {
        DeviceInfo deviceInfo = this.device.getDeviceInfo();
        if (deviceInfo == null) {
            this.onMessage.invoke(" deviceInfo is null!!!", 0);
            return false;
        }
        this.source = deviceInfo.getDeviceSource();
        if (deviceInfo.getDeviceFeature() == null) {
            this.onMessage.invoke("Feature is null!!!", 0);
            return false;
        }
        if (this.device.isConnected()) {
            return true;
        }
        this.onMessage.invoke("Device is not connected", 0);
        return false;
    }

    @Override // com.huami.device.core.agps.api.UpgradeTarget
    public int queryVersions() {
        return 0;
    }

    @Override // com.xiaomi.hm.health.bt.profile.dfu.IFirmwareUpgradeCallback
    public void upgradingProgress(@NotNull HMFirmwareType hMFirmwareType, @NotNull Progress progress) {
        IFirmwareUpgradeCallback.DefaultImpls.upgradingProgress(this, hMFirmwareType, progress);
    }
}
