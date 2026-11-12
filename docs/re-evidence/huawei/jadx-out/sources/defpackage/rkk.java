package defpackage;

import com.huawei.haf.application.BaseApplication;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hihealthservice.old.model.OldToNewMotionPath;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.h5pro.jsmodules.fallDetection.FallDetectionUtil;
import com.huawei.ui.homehealth.R;
import com.huawei.ui.homehealth.backlog.BacklogType;
import com.huawei.ui.homehealth.backlog.backlogevent.BacklogEvent;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public class rkk extends BacklogEvent {
    public rkk() {
        super(BacklogType.FALL_DETECTION);
    }

    @Override // com.huawei.ui.homehealth.backlog.backlogevent.BacklogEvent
    public void checkEventComplete(final DeviceInfo deviceInfo, final BacklogEvent.EventCompleteCallback eventCompleteCallback) {
        if (!isRemind(deviceInfo)) {
            LogUtil.a("FallDetectionEvent", "isRemind false");
            eventCompleteCallback.onResult(false);
            return;
        }
        boolean zD = eey.d(deviceInfo, OldToNewMotionPath.SPORT_TYPE_PINGPONG);
        LogUtil.a("FallDetectionEvent", "addFallDetection isSupport:", Boolean.valueOf(zD));
        if (!zD) {
            eventCompleteCallback.onResult(false);
        } else {
            FallDetectionUtil.getSwitchStatusFromCloud(new IBaseResponseCallback() { // from class: rkl
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    this.f47411a.e(eventCompleteCallback, deviceInfo, i, obj);
                }
            });
        }
    }

    /* synthetic */ void e(BacklogEvent.EventCompleteCallback eventCompleteCallback, DeviceInfo deviceInfo, int i, Object obj) {
        LogUtil.a("FallDetectionEvent", "addFallDetection objData:", Integer.valueOf(i), ":", obj);
        if (i != 0) {
            eventCompleteCallback.onResult(false);
            return;
        }
        if (!(obj instanceof Integer)) {
            eventCompleteCallback.onResult(false);
            updateVisited(deviceInfo, false);
            return;
        }
        boolean z = ((Integer) obj).intValue() == -1;
        eventCompleteCallback.onResult(z);
        if (z) {
            reportBiEvent(getBiKey(), getBiShowParams(0, 1, deviceInfo));
        } else {
            updateVisited(deviceInfo, false);
        }
    }

    @Override // com.huawei.ui.homehealth.backlog.backlogevent.BacklogEvent
    public String getBiKey() {
        return "";
    }

    @Override // com.huawei.ui.homehealth.backlog.backlogevent.BacklogEvent
    public Map<String, Object> getBiShowParams(int i, int i2, DeviceInfo deviceInfo) {
        Map<String, Object> popTipEventBiParams = getPopTipEventBiParams();
        popTipEventBiParams.putAll(super.getBiShowParams(i, i2, deviceInfo));
        popTipEventBiParams.put("Content", 115);
        return popTipEventBiParams;
    }

    @Override // com.huawei.ui.homehealth.backlog.backlogevent.BacklogEvent
    public String getTitle() {
        return BaseApplication.b().getString(R.string.IDS_backlog_h5_fall_detection_title);
    }
}
