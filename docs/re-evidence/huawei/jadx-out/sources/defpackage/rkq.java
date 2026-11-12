package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import com.huawei.health.device.callback.BackLogCallback;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.homehealth.R;
import com.huawei.ui.homehealth.backlog.BacklogType;
import com.huawei.ui.homehealth.backlog.backlogevent.BacklogEvent;
import health.compact.a.LogAnonymous;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public class rkq extends BacklogEvent {
    public rkq() {
        super(BacklogType.MESSAGE_NOTIFICATION);
    }

    @Override // com.huawei.ui.homehealth.backlog.backlogevent.BacklogEvent
    public void onBacklogClick(String str, BackLogCallback<Integer> backLogCallback) {
        super.onBacklogClick(str, backLogCallback);
        try {
            Intent intent = new Intent();
            intent.putExtra("device_id", str);
            intent.setClassName(dmz.y, "com.huawei.ui.device.activity.notification.NotificationSettingActivity");
            iov.d(BaseApplication.getContext(), intent);
            backLogCallback.onSuccess(0);
        } catch (ActivityNotFoundException e) {
            LogUtil.e("MessageNotificationEvent", "startActivity exception: ", LogAnonymous.b(e));
            backLogCallback.onFailure(-1, "NotificationSettingActivity ActivityNotFoundException");
        }
    }

    @Override // com.huawei.ui.homehealth.backlog.backlogevent.BacklogEvent
    public Map<String, Object> getBiShowParams(int i, int i2, DeviceInfo deviceInfo) {
        Map<String, Object> popTipEventBiParams = getPopTipEventBiParams();
        popTipEventBiParams.putAll(super.getBiShowParams(i, i2, deviceInfo));
        popTipEventBiParams.put("Content", 102);
        return popTipEventBiParams;
    }

    @Override // com.huawei.ui.homehealth.backlog.backlogevent.BacklogEvent
    public Map<String, Object> getBiClickParams(String str, String str2) {
        Map<String, Object> popTipEventBiParams = getPopTipEventBiParams();
        popTipEventBiParams.putAll(super.getBiClickParams(str, str2));
        popTipEventBiParams.put("Content", 13);
        return popTipEventBiParams;
    }

    @Override // com.huawei.ui.homehealth.backlog.backlogevent.BacklogEvent
    public String getTitle() {
        return com.huawei.haf.application.BaseApplication.b().getString(R.string.IDS_backlog_service_area_notice_open_title);
    }

    @Override // com.huawei.ui.homehealth.backlog.backlogevent.BacklogEvent
    public void checkEventComplete(DeviceInfo deviceInfo, BacklogEvent.EventCompleteCallback eventCompleteCallback) {
        if (!isRemind(deviceInfo)) {
            LogUtil.a("MessageNotificationEvent", "isRemind false");
            eventCompleteCallback.onResult(false);
            return;
        }
        DeviceCapability deviceCapabilityA = eej.a(deviceInfo.getDeviceIdentify());
        if (deviceCapabilityA == null || !deviceCapabilityA.isMessageAlert()) {
            LogUtil.e("MessageNotificationEvent", "addMessageNotification capability is null");
            eventCompleteCallback.onResult(false);
            return;
        }
        boolean zB = tqp.b(deviceInfo.getProductType());
        eventCompleteCallback.onResult(!zB);
        if (zB) {
            updateVisited(deviceInfo, false);
        } else {
            reportBiEvent(getBiKey(), getBiShowParams(0, 1, deviceInfo));
        }
    }
}
