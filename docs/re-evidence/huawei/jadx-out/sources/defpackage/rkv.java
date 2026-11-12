package defpackage;

import com.huawei.haf.application.BaseApplication;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hihealthservice.old.model.OldToNewMotionPath;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.h5pro.jsmodules.fallDetection.FallDetectionUtil;
import com.huawei.ui.homehealth.R;
import com.huawei.ui.homehealth.backlog.BacklogType;
import com.huawei.ui.homehealth.backlog.backlogevent.BacklogEvent;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public class rkv extends BacklogEvent {
    public rkv() {
        super(BacklogType.SOS_HELP_SETTINGS);
    }

    @Override // com.huawei.ui.homehealth.backlog.backlogevent.BacklogEvent
    public void checkEventComplete(DeviceInfo deviceInfo, BacklogEvent.EventCompleteCallback eventCompleteCallback) {
        if (!isRemind(deviceInfo)) {
            LogUtil.a("SosEmergencySettingEvent", "isRemind false");
            eventCompleteCallback.onResult(false);
            return;
        }
        boolean zD = eey.d(deviceInfo, OldToNewMotionPath.SPORT_TYPE_PINGPONG);
        LogUtil.a("SosEmergencySettingEvent", "addSosHelp isSupport:", Boolean.valueOf(zD));
        if (zD) {
            boolean z = FallDetectionUtil.queryEmergencyContactsNumber() == 0 || !FallDetectionUtil.isHasPermissions(deviceInfo.getDeviceIdentify());
            eventCompleteCallback.onResult(z);
            if (z) {
                reportBiEvent(getBiKey(), getBiShowParams(0, 1, deviceInfo));
                return;
            } else {
                updateVisited(deviceInfo, false);
                return;
            }
        }
        eventCompleteCallback.onResult(false);
    }

    @Override // com.huawei.ui.homehealth.backlog.backlogevent.BacklogEvent
    public String getBiKey() {
        return "";
    }

    @Override // com.huawei.ui.homehealth.backlog.backlogevent.BacklogEvent
    public Map<String, Object> getBiShowParams(int i, int i2, DeviceInfo deviceInfo) {
        Map<String, Object> popTipEventBiParams = getPopTipEventBiParams();
        popTipEventBiParams.putAll(super.getBiShowParams(i, i2, deviceInfo));
        popTipEventBiParams.put("Content", 114);
        return popTipEventBiParams;
    }

    @Override // com.huawei.ui.homehealth.backlog.backlogevent.BacklogEvent
    public String getTitle() {
        return BaseApplication.b().getString(R.string.IDS_backlog_h5_SOS_help_settings_title);
    }
}
