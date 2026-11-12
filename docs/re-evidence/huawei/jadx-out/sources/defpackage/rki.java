package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Build;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.device.callback.BackLogCallback;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.operation.OperationKey;
import com.huawei.ui.homehealth.R;
import com.huawei.ui.homehealth.backlog.BacklogType;
import com.huawei.ui.homehealth.backlog.backlogevent.BacklogEvent;
import health.compact.a.LogAnonymous;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public class rki extends BacklogEvent {
    private boolean e;

    public rki() {
        super(BacklogType.ENABLE_NOTIFICATION);
        this.e = false;
    }

    @Override // com.huawei.ui.homehealth.backlog.backlogevent.BacklogEvent
    public void onBacklogClick(String str, BackLogCallback<Integer> backLogCallback) {
        super.onBacklogClick(str, backLogCallback);
        Activity activityJ = BaseApplication.j();
        if (activityJ == null) {
            backLogCallback.onFailure(-1, "Activity is null ");
            return;
        }
        if (this.e) {
            c(this.mType.getId(), "service_not_running");
        } else {
            c(this.mType.getId(), "permission_close");
        }
        try {
            activityJ.startActivity(new Intent("android.settings.ACTION_NOTIFICATION_LISTENER_SETTINGS"));
            backLogCallback.onSuccess(0);
            tqp.d("reopen_notifications_by_service_exe_time");
        } catch (ActivityNotFoundException e) {
            LogUtil.e("EnableNotificationEvent", "startActivity exception: ", LogAnonymous.b(e));
            backLogCallback.onFailure(-1, "NotificationSettingActivity ActivityNotFoundException");
        }
    }

    @Override // com.huawei.ui.homehealth.backlog.backlogevent.BacklogEvent
    public Map<String, Object> getBiClickParams(String str, String str2) {
        Map<String, Object> popTipEventBiParams = getPopTipEventBiParams();
        popTipEventBiParams.putAll(super.getBiClickParams(str, str2));
        popTipEventBiParams.put("Content", 10);
        return popTipEventBiParams;
    }

    @Override // com.huawei.ui.homehealth.backlog.backlogevent.BacklogEvent
    public Map<String, Object> getBiShowParams(int i, int i2, DeviceInfo deviceInfo) {
        Map<String, Object> popTipEventBiParams = getPopTipEventBiParams();
        popTipEventBiParams.putAll(super.getBiShowParams(i, i2, deviceInfo));
        popTipEventBiParams.put("Content", 108);
        return popTipEventBiParams;
    }

    @Override // com.huawei.ui.homehealth.backlog.backlogevent.BacklogEvent
    public String getTitle() {
        return BaseApplication.b().getString(R.string.IDS_backlog_reopen_message_title);
    }

    @Override // com.huawei.ui.homehealth.backlog.backlogevent.BacklogEvent
    public void checkEventComplete(DeviceInfo deviceInfo, BacklogEvent.EventCompleteCallback eventCompleteCallback) {
        if (tqp.g()) {
            eventCompleteCallback.onResult(true);
            this.e = true;
            return;
        }
        this.e = false;
        if (Build.VERSION.SDK_INT > 35) {
            LogUtil.a("EnableNotificationEvent", "SDK_INT:", Integer.valueOf(Build.VERSION.SDK_INT));
            eventCompleteCallback.onResult(false);
        } else {
            if (!isRemind(deviceInfo)) {
                LogUtil.a("EnableNotificationEvent", "isRemind false");
                eventCompleteCallback.onResult(false);
                return;
            }
            boolean zE = tqp.e(BaseApplication.b(), true);
            eventCompleteCallback.onResult(zE);
            if (zE) {
                reportBiEvent(getBiKey(), getBiShowParams(0, 1, deviceInfo));
            } else {
                updateVisited(deviceInfo, false);
            }
        }
    }

    @Override // com.huawei.ui.homehealth.backlog.backlogevent.BacklogEvent
    public void updateRemind(DeviceInfo deviceInfo) {
        super.updateRemind(deviceInfo);
        tqp.d("reopen_notifications_by_service_exe_time");
    }

    private void c(String str, String str2) {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("reason", str2);
        linkedHashMap.put("backlog_type", str);
        OpAnalyticsUtil.getInstance().setEvent(OperationKey.HEALTH_APP_DEVICE_BACKLOG.value(), linkedHashMap);
    }
}
