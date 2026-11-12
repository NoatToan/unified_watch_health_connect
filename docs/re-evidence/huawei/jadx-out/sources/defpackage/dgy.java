package defpackage;

import com.huawei.health.browseraction.jumpstrategy.JumpHeartHealthStrategy;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.ui.homehealth.device.featureaction.FeatureType;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes7.dex */
public class dgy extends JumpHeartHealthStrategy {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final DeviceInfo f31786c = getJumpDeviceInfo();

    @Override // com.huawei.health.browseraction.jumpstrategy.JumpDeviceStrategy
    public boolean onPretreatment() {
        boolean zIsShowEntry = isShowEntry(FeatureType.ARRHYTHMIA, this.f31786c);
        if (!isConnected() && !zIsShowEntry) {
            showNotConnectedToast();
            return false;
        }
        if (this.f31786c != null || zIsShowEntry) {
            return true;
        }
        showUnsupportedToast();
        return false;
    }

    @Override // com.huawei.health.browseraction.jumpstrategy.JumpDeviceStrategy
    public boolean checkSupportCapability(DeviceInfo deviceInfo) {
        if (this.featureSupportApi == null || deviceInfo == null) {
            ReleaseLogUtil.e("JumpArrhythmiaStrategy", "featureSupportApi or deviceInfo is null");
            return false;
        }
        return this.featureSupportApi.isSupportArrhythmia(deviceInfo);
    }

    @Override // com.huawei.health.browseraction.jumpstrategy.JumpStrategy
    public void jump() {
        jump(FeatureType.ARRHYTHMIA, "com.huawei.health.h5.ppg", this.f31786c);
    }
}
