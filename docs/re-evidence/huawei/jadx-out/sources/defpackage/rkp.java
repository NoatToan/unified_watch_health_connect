package defpackage;

import android.app.Activity;
import android.content.Context;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.device.callback.BackLogCallback;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.utils.CustomPermissionAction;
import com.huawei.ui.homehealth.R;
import com.huawei.ui.homehealth.backlog.BacklogType;
import com.huawei.ui.homehealth.backlog.backlogevent.BacklogEvent;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public class rkp extends BacklogEvent {
    public rkp() {
        super(BacklogType.NEAR_DEVICE_PERMISSION);
    }

    @Override // com.huawei.ui.homehealth.backlog.backlogevent.BacklogEvent
    public void onBacklogClick(String str, final BackLogCallback<Integer> backLogCallback) {
        super.onBacklogClick(str, backLogCallback);
        Activity activityJ = BaseApplication.j();
        if (activityJ == null) {
            backLogCallback.onFailure(-1, "Activity is null ");
        } else {
            PermissionUtil.d(activityJ, PermissionUtil.PermissionType.SCAN, new CustomPermissionAction(activityJ) { // from class: rkp.3
                @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
                public void onGranted() {
                    LogUtil.a("NearDevicePermissionEvent", "mNearbyPermissionCallback granted");
                    backLogCallback.onSuccess(0);
                }

                @Override // com.huawei.ui.commonui.utils.CustomPermissionAction, com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
                public void onDenied(String str2) {
                    super.onDenied(str2);
                    backLogCallback.onFailure(-1, "nearDevicePermission denied by the user");
                }

                @Override // com.huawei.ui.commonui.utils.CustomPermissionAction, com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
                public void onForeverDenied(PermissionUtil.PermissionType permissionType) {
                    super.onForeverDenied(permissionType);
                    backLogCallback.onFailure(-1, "nearDevicePermission permission onForeverDenied by the user");
                }
            });
        }
    }

    @Override // com.huawei.ui.homehealth.backlog.backlogevent.BacklogEvent
    public Map<String, Object> getBiClickParams(String str, String str2) {
        Map<String, Object> popTipEventBiParams = getPopTipEventBiParams();
        popTipEventBiParams.putAll(super.getBiClickParams(str, str2));
        popTipEventBiParams.put("Content", 16);
        return popTipEventBiParams;
    }

    @Override // com.huawei.ui.homehealth.backlog.backlogevent.BacklogEvent
    public Map<String, Object> getBiShowParams(int i, int i2, DeviceInfo deviceInfo) {
        Map<String, Object> popTipEventBiParams = getPopTipEventBiParams();
        popTipEventBiParams.putAll(super.getBiShowParams(i, i2, deviceInfo));
        popTipEventBiParams.put("Content", 105);
        return popTipEventBiParams;
    }

    @Override // com.huawei.ui.homehealth.backlog.backlogevent.BacklogEvent
    public String getTitle() {
        return BaseApplication.b().getString(R.string.IDS_backlog_nearby_device_title);
    }

    @Override // com.huawei.ui.homehealth.backlog.backlogevent.BacklogEvent
    public void checkEventComplete(DeviceInfo deviceInfo, BacklogEvent.EventCompleteCallback eventCompleteCallback) {
        if (!isRemind(deviceInfo)) {
            LogUtil.a("NearDevicePermissionEvent", "isRemind false");
            eventCompleteCallback.onResult(false);
            return;
        }
        boolean zA = a(BaseApplication.b());
        eventCompleteCallback.onResult(!zA);
        if (zA) {
            updateVisited(deviceInfo, false);
        } else {
            reportBiEvent(getBiKey(), getBiShowParams(0, 1, deviceInfo));
        }
    }

    private static boolean a(Context context) {
        if (context == null) {
            LogUtil.a("NearDevicePermissionEvent", "checkNearbyPermission context == null");
            return false;
        }
        PermissionUtil.PermissionResult permissionResultE = PermissionUtil.e(context, PermissionUtil.PermissionType.SCAN);
        LogUtil.a("NearDevicePermissionEvent", "checkNearbyPermission result=", permissionResultE);
        return permissionResultE == PermissionUtil.PermissionResult.GRANTED;
    }
}
