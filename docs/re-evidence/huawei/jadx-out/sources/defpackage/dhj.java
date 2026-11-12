package defpackage;

import com.huawei.health.browseraction.jumpstrategy.JumpHeartHealthStrategy;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.ui.homehealth.device.featureaction.FeatureType;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes7.dex */
public class dhj extends JumpHeartHealthStrategy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DeviceInfo f31791a = getJumpDeviceInfo();

    @Override // com.huawei.health.browseraction.jumpstrategy.JumpDeviceStrategy
    public boolean onPretreatment() {
        boolean zIsShowEntry = isShowEntry(FeatureType.ECG, this.f31791a);
        if (!isConnected() && !zIsShowEntry) {
            showNotConnectedToast();
            return false;
        }
        if (this.f31791a != null || zIsShowEntry) {
            return true;
        }
        showUnsupportedToast();
        return false;
    }

    @Override // com.huawei.health.browseraction.jumpstrategy.JumpDeviceStrategy
    public boolean checkSupportCapability(DeviceInfo deviceInfo) {
        if (this.featureSupportApi == null || deviceInfo == null) {
            ReleaseLogUtil.e("JumpEcgStrategy", "featureSupportApi or deviceInfo is null");
            return false;
        }
        return this.featureSupportApi.isSupportQuickAPPEcg(deviceInfo);
    }

    @Override // com.huawei.health.browseraction.jumpstrategy.JumpStrategy
    public void jump() {
        jump(FeatureType.ECG, "com.huawei.health.ecg.collection", this.f31791a);
    }
}
