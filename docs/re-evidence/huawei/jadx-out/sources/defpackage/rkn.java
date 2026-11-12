package defpackage;

import android.app.Activity;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.handler.HandlerExecutor;
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
public class rkn extends BacklogEvent {
    public rkn() {
        super(BacklogType.LOCATION_PERMISSION);
    }

    @Override // com.huawei.ui.homehealth.backlog.backlogevent.BacklogEvent
    public void onBacklogClick(String str, final BackLogCallback<Integer> backLogCallback) {
        super.onBacklogClick(str, backLogCallback);
        final Activity activityJ = BaseApplication.j();
        if (activityJ == null) {
            backLogCallback.onFailure(-1, "Activity is null ");
        } else {
            HandlerExecutor.c(new Runnable() { // from class: rkr
                @Override // java.lang.Runnable
                public final void run() {
                    this.f47424b.e(activityJ, backLogCallback);
                }
            });
        }
    }

    /* synthetic */ void e(final Activity activity, final BackLogCallback backLogCallback) {
        PermissionUtil.d(activity, PermissionUtil.PermissionType.LOCATION, new CustomPermissionAction(activity) { // from class: rkn.2
            @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
            public void onGranted() {
                LogUtil.j("LocationPermissionEvent", "mBaseCallback onGranted");
                rkn.this.a(activity, backLogCallback);
            }

            @Override // com.huawei.ui.commonui.utils.CustomPermissionAction, com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
            public void onDenied(String str) {
                backLogCallback.onFailure(-1, "locationPermission denied by the user");
            }

            @Override // com.huawei.ui.commonui.utils.CustomPermissionAction, com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
            public void onForeverDenied(PermissionUtil.PermissionType permissionType) {
                backLogCallback.onFailure(-1, "locationPermission permission onForeverDenied by the user");
                super.onForeverDenied(permissionType);
            }
        });
    }

    @Override // com.huawei.ui.homehealth.backlog.backlogevent.BacklogEvent
    public Map<String, Object> getBiClickParams(String str, String str2) {
        Map<String, Object> popTipEventBiParams = getPopTipEventBiParams();
        popTipEventBiParams.putAll(super.getBiClickParams(str, str2));
        popTipEventBiParams.put("Content", 2);
        return popTipEventBiParams;
    }

    @Override // com.huawei.ui.homehealth.backlog.backlogevent.BacklogEvent
    public Map<String, Object> getBiShowParams(int i, int i2, DeviceInfo deviceInfo) {
        Map<String, Object> popTipEventBiParams = getPopTipEventBiParams();
        popTipEventBiParams.putAll(super.getBiShowParams(i, i2, deviceInfo));
        popTipEventBiParams.put("Content", 106);
        return popTipEventBiParams;
    }

    @Override // com.huawei.ui.homehealth.backlog.backlogevent.BacklogEvent
    public String getTitle() {
        return BaseApplication.b().getString(R.string.IDS_backlog_location_information_title);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Activity activity, final BackLogCallback<Integer> backLogCallback) {
        if (!PermissionUtil.a()) {
            backLogCallback.onSuccess(0);
        } else {
            LogUtil.a("LocationPermissionEvent", "applyBackgroundLocationPermission requestPermission");
            PermissionUtil.d(activity, PermissionUtil.PermissionType.LOCATION_WITH_BACKGROUND, new CustomPermissionAction(activity) { // from class: rkn.5
                @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
                public void onGranted() {
                    backLogCallback.onSuccess(0);
                }

                @Override // com.huawei.ui.commonui.utils.CustomPermissionAction, com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
                public void onDenied(String str) {
                    super.onDenied(str);
                    backLogCallback.onFailure(-1, "BackgroundLocationPermission denied by the user");
                }

                @Override // com.huawei.ui.commonui.utils.CustomPermissionAction, com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
                public void onForeverDenied(PermissionUtil.PermissionType permissionType) {
                    super.onForeverDenied(permissionType);
                    backLogCallback.onFailure(-1, "BackgroundLocationPermission permission onForeverDenied by the user");
                }
            });
        }
    }

    @Override // com.huawei.ui.homehealth.backlog.backlogevent.BacklogEvent
    public void checkEventComplete(DeviceInfo deviceInfo, BacklogEvent.EventCompleteCallback eventCompleteCallback) {
        if (!isRemind(deviceInfo)) {
            LogUtil.a("LocationPermissionEvent", "isRemind false");
            eventCompleteCallback.onResult(false);
            return;
        }
        PermissionUtil.PermissionResult permissionResultE = PermissionUtil.e(BaseApplication.b(), PermissionUtil.PermissionType.LOCATION_WITH_BACKGROUND);
        boolean z = permissionResultE == PermissionUtil.PermissionResult.DENIED || permissionResultE == PermissionUtil.PermissionResult.FOREVER_DENIED;
        LogUtil.a("LocationPermissionEvent", "addLocationPermission operate:", Boolean.valueOf(z));
        eventCompleteCallback.onResult(z);
        if (z) {
            reportBiEvent(getBiKey(), getBiShowParams(0, 1, deviceInfo));
        } else {
            updateVisited(deviceInfo, false);
        }
    }
}
