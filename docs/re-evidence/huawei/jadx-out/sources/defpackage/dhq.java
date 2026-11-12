package defpackage;

import android.content.Intent;
import com.huawei.health.browseraction.jumpstrategy.JumpDeviceStrategy;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.fitnessdatatype.FitnessSleepType;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.device.activity.notificationlive.NotificationLiveActivity;

/* JADX INFO: loaded from: classes7.dex */
public class dhq extends JumpDeviceStrategy {
    private final DeviceInfo e = getJumpDeviceInfo();

    @Override // com.huawei.health.browseraction.jumpstrategy.JumpDeviceStrategy
    public boolean onPretreatment() {
        if (!isConnected()) {
            showNotConnectedToast();
            return false;
        }
        if (this.e != null) {
            return true;
        }
        showUnsupportedToast();
        return false;
    }

    @Override // com.huawei.health.browseraction.jumpstrategy.JumpDeviceStrategy
    public boolean checkSupportCapability(DeviceInfo deviceInfo) {
        if (this.featureSupportApi == null || deviceInfo == null) {
            return false;
        }
        return this.featureSupportApi.isSupportNotificationLive(deviceInfo);
    }

    @Override // com.huawei.health.browseraction.jumpstrategy.JumpStrategy
    public void jump() {
        if (this.mContext == null) {
            LogUtil.j("JumpLiveWindowStrategy", "mContext is null");
            return;
        }
        boolean zD = eey.d(this.e, FitnessSleepType.HW_FITNESS_NOON);
        LogUtil.a("JumpLiveWindowStrategy", "isSupportLiveView", Boolean.valueOf(zD));
        Intent intent = new Intent(this.mContext, (Class<?>) NotificationLiveActivity.class);
        intent.putExtra("device_id", this.e.getDeviceIdentify());
        intent.putExtra("LiveViewType", zD);
        iov.d(this.mContext, intent);
    }
}
