package defpackage;

import android.app.Activity;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.health.device.callback.BackLogCallback;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.homehealth.backlog.BacklogType;
import com.huawei.ui.homehealth.backlog.backlogevent.BacklogEvent;
import com.huawei.ui.homewear21.R;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public class rkd extends BacklogEvent {
    public rkd() {
        super(BacklogType.BEIDOU_MESSAGE);
    }

    @Override // com.huawei.ui.homehealth.backlog.backlogevent.BacklogEvent
    public void onBacklogClick(String str, final BackLogCallback<Integer> backLogCallback) {
        super.onBacklogClick(str, backLogCallback);
        final Activity activityJ = BaseApplication.j();
        if (activityJ == null) {
            backLogCallback.onFailure(-1, "Activity is null");
            return;
        }
        DeviceInfo deviceInfoById = getDeviceInfoById(str);
        if (deviceInfoById == null) {
            backLogCallback.onFailure(-1, "beidouMessagePage device info is null");
        } else if (deviceInfoById.getDeviceConnectState() != 2) {
            HandlerExecutor.a().post(new Runnable() { // from class: rkg
                @Override // java.lang.Runnable
                public final void run() {
                    rkd.e(activityJ, backLogCallback);
                }
            });
        } else {
            rgd.c(str, activityJ, true, false);
            backLogCallback.onSuccess(0);
        }
    }

    static /* synthetic */ void e(Activity activity, BackLogCallback backLogCallback) {
        qpx.b(activity, BaseApplication.b().getString(R.string.IDS_setting_wearhome_device_disconnected));
        backLogCallback.onFailure(-1, "beidouMessagePage device not CONNECTED");
    }

    @Override // com.huawei.ui.homehealth.backlog.backlogevent.BacklogEvent
    public Map<String, Object> getBiClickParams(String str, String str2) {
        Map<String, Object> popTipEventBiParams = getPopTipEventBiParams();
        popTipEventBiParams.putAll(super.getBiClickParams(str, str2));
        popTipEventBiParams.put("Content", 19);
        return popTipEventBiParams;
    }

    @Override // com.huawei.ui.homehealth.backlog.backlogevent.BacklogEvent
    public Map<String, Object> getBiShowParams(int i, int i2, DeviceInfo deviceInfo) {
        Map<String, Object> popTipEventBiParams = getPopTipEventBiParams();
        popTipEventBiParams.putAll(super.getBiShowParams(i, i2, deviceInfo));
        popTipEventBiParams.put("Content", 111);
        return popTipEventBiParams;
    }

    @Override // com.huawei.ui.homehealth.backlog.backlogevent.BacklogEvent
    public String getTitle() {
        return BaseApplication.b().getString(com.huawei.ui.homehealth.R.string.IDS_backlog_satellite_message_title);
    }

    @Override // com.huawei.ui.homehealth.backlog.backlogevent.BacklogEvent
    public void checkEventComplete(DeviceInfo deviceInfo, BacklogEvent.EventCompleteCallback eventCompleteCallback) {
        if (!isRemind(deviceInfo)) {
            LogUtil.a("BeidouMessageEvent", "isRemind false");
            eventCompleteCallback.onResult(false);
            return;
        }
        rgg rggVarD = rgd.d(deviceInfo, true);
        boolean z = (!rggVarD.e() || rggVarD.b() || rggVarD.a() == 0) ? false : true;
        eventCompleteCallback.onResult(z);
        if (z) {
            reportBiEvent(getBiKey(), getBiShowParams(0, 1, deviceInfo));
        } else {
            updateVisited(deviceInfo, false);
        }
    }
}
