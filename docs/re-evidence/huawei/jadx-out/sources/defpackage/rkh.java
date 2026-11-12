package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import androidx.appcompat.app.AppCompatDelegate;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.device.callback.BackLogCallback;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.homehealth.R;
import com.huawei.ui.homehealth.backlog.BacklogType;
import com.huawei.ui.homehealth.backlog.backlogevent.BacklogEvent;
import health.compact.a.LogAnonymous;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public class rkh extends BacklogEvent {
    public rkh() {
        super(BacklogType.CONNECT_PROTECT);
    }

    @Override // com.huawei.ui.homehealth.backlog.backlogevent.BacklogEvent
    public void onBacklogClick(String str, BackLogCallback<Integer> backLogCallback) {
        super.onBacklogClick(str, backLogCallback);
        Activity activityJ = BaseApplication.j();
        if (activityJ == null) {
            backLogCallback.onFailure(-1, "Activity is null ");
            return;
        }
        try {
            mir.d(false);
            rdp.d(activityJ, "11073");
            backLogCallback.onSuccess(0);
        } catch (ActivityNotFoundException e) {
            LogUtil.e("ConnectProtectEvent", "startActivity exception: ", LogAnonymous.b(e));
            backLogCallback.onFailure(-1, "connectProtect ActivityNotFoundException");
        }
    }

    @Override // com.huawei.ui.homehealth.backlog.backlogevent.BacklogEvent
    public Map<String, Object> getBiClickParams(String str, String str2) {
        Map<String, Object> popTipEventBiParams = getPopTipEventBiParams();
        popTipEventBiParams.putAll(super.getBiClickParams(str, str2));
        popTipEventBiParams.put("Content", 5);
        return popTipEventBiParams;
    }

    @Override // com.huawei.ui.homehealth.backlog.backlogevent.BacklogEvent
    public Map<String, Object> getBiShowParams(int i, int i2, DeviceInfo deviceInfo) {
        Map<String, Object> popTipEventBiParams = getPopTipEventBiParams();
        popTipEventBiParams.putAll(super.getBiShowParams(i, i2, deviceInfo));
        popTipEventBiParams.put("Content", Integer.valueOf(AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY));
        return popTipEventBiParams;
    }

    @Override // com.huawei.ui.homehealth.backlog.backlogevent.BacklogEvent
    public String getTitle() {
        return BaseApplication.b().getString(R.string.IDS_backlog_disconnect_protection_title);
    }

    @Override // com.huawei.ui.homehealth.backlog.backlogevent.BacklogEvent
    public void checkEventComplete(DeviceInfo deviceInfo, BacklogEvent.EventCompleteCallback eventCompleteCallback) {
        if (!isRemind(deviceInfo)) {
            LogUtil.a("ConnectProtectEvent", "isRemind false");
            eventCompleteCallback.onResult(false);
            return;
        }
        boolean z = nzz.c() && !nzz.c(BaseApplication.b());
        LogUtil.a("ConnectProtectEvent", "addConnectProtect enable:", Boolean.valueOf(z));
        eventCompleteCallback.onResult(z);
        if (z) {
            reportBiEvent(getBiKey(), getBiShowParams(0, 1, deviceInfo));
        } else {
            updateVisited(deviceInfo, false);
        }
    }
}
