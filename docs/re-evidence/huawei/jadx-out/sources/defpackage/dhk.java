package defpackage;

import com.huawei.health.browseraction.jumpstrategy.JumpHeartHealthStrategy;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.ui.homehealth.device.featureaction.FeatureType;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes7.dex */
public class dhk extends JumpHeartHealthStrategy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DeviceInfo f31792a = getJumpDeviceInfo();

    @Override // com.huawei.health.browseraction.jumpstrategy.JumpDeviceStrategy
    public boolean onPretreatment() {
        boolean zIsShowEntry = isShowEntry(FeatureType.ECG_ANALYSIS, this.f31792a);
        if (!isConnected() && !zIsShowEntry) {
            showNotConnectedToast();
            return false;
        }
        if (this.f31792a != null || zIsShowEntry) {
            return true;
        }
        showUnsupportedToast();
        return false;
    }

    @Override // com.huawei.health.browseraction.jumpstrategy.JumpDeviceStrategy
    public boolean checkSupportCapability(DeviceInfo deviceInfo) {
        if (this.featureSupportApi == null || deviceInfo == null) {
            ReleaseLogUtil.e("JumpEcgAnalysisStrategy", "featureSupportApi or deviceInfo is null");
            return false;
        }
        return this.featureSupportApi.isSupportQuickAPPEcgAnalysic(deviceInfo);
    }

    @Override // com.huawei.health.browseraction.jumpstrategy.JumpStrategy
    public void jump() {
        jump(FeatureType.ECG_ANALYSIS, "com.huawei.health.h5.ecgce", this.f31792a);
    }
}
