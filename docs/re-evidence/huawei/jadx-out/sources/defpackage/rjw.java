package defpackage;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.device.callback.BackLogCallback;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hihealth.HiUserPreference;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.ui.homehealth.R;
import com.huawei.ui.homehealth.backlog.BacklogType;
import com.huawei.ui.homehealth.backlog.backlogevent.BacklogEvent;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.Utils;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public class rjw extends BacklogEvent {
    private final Object d;

    public rjw() {
        super(BacklogType.ACCOUNT_SYNC);
        this.d = new Object();
    }

    @Override // com.huawei.ui.homehealth.backlog.backlogevent.BacklogEvent
    public void onBacklogClick(final String str, final BackLogCallback<Integer> backLogCallback) {
        super.onBacklogClick(str, backLogCallback);
        if (BluetoothAdapter.getDefaultAdapter() == null) {
            backLogCallback.onFailure(-1, "BluetoothAdapter is null.");
            return;
        }
        if (!BluetoothAdapter.getDefaultAdapter().isEnabled()) {
            backLogCallback.onFailure(-1, "Bluetooth is not enabled or cannot be used.");
            return;
        }
        Activity activityJ = BaseApplication.j();
        if (activityJ == null) {
            backLogCallback.onFailure(-1, "Activity is null ");
            return;
        }
        DeviceInfo deviceInfoById = getDeviceInfoById(str);
        if (deviceInfoById == null) {
            backLogCallback.onFailure(-1, "device info is null");
        } else if (deviceInfoById.getDeviceConnectState() != 2) {
            backLogCallback.onFailure(-1, "Device is not connected.");
        } else {
            activityJ.runOnUiThread(new Runnable() { // from class: rjz
                @Override // java.lang.Runnable
                public final void run() {
                    rjw.e(backLogCallback, str);
                }
            });
        }
    }

    static /* synthetic */ void e(BackLogCallback backLogCallback, String str) {
        tpe tpeVarB = tpe.b();
        tpeVarB.d((BackLogCallback<Integer>) backLogCallback);
        tpeVarB.e(true);
        tpeVarB.d(str);
        tpeVarB.e();
    }

    @Override // com.huawei.ui.homehealth.backlog.backlogevent.BacklogEvent
    public Map<String, Object> getBiClickParams(String str, String str2) {
        Map<String, Object> popTipEventBiParams = getPopTipEventBiParams();
        popTipEventBiParams.putAll(super.getBiClickParams(str, str2));
        popTipEventBiParams.put("Content", 15);
        return popTipEventBiParams;
    }

    @Override // com.huawei.ui.homehealth.backlog.backlogevent.BacklogEvent
    public Map<String, Object> getBiShowParams(int i, int i2, DeviceInfo deviceInfo) {
        Map<String, Object> popTipEventBiParams = getPopTipEventBiParams();
        popTipEventBiParams.putAll(super.getBiShowParams(i, i2, deviceInfo));
        popTipEventBiParams.put("Content", 104);
        return popTipEventBiParams;
    }

    @Override // com.huawei.ui.homehealth.backlog.backlogevent.BacklogEvent
    public String getTitle() {
        return BaseApplication.b().getString(R.string.IDS_backlog_sync_huawei_account);
    }

    @Override // com.huawei.ui.homehealth.backlog.backlogevent.BacklogEvent
    public void checkEventComplete(final DeviceInfo deviceInfo, final BacklogEvent.EventCompleteCallback eventCompleteCallback) {
        if (!isRemind(deviceInfo)) {
            LogUtil.a("AccountSyncEvent", "isRemind false");
            eventCompleteCallback.onResult(false);
            return;
        }
        DeviceCapability deviceCapabilityA = eej.a(deviceInfo.getDeviceIdentify());
        if (deviceCapabilityA == null || !deviceCapabilityA.isSupportSyncAccount()) {
            LogUtil.j("AccountSyncEvent", "addAccountSync capability is null");
            eventCompleteCallback.onResult(false);
        } else {
            ThreadPoolManager.c().a("AccountSyncEvent", new Runnable() { // from class: rjt
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.e(deviceInfo, eventCompleteCallback);
                }
            });
        }
    }

    /* synthetic */ void e(DeviceInfo deviceInfo, BacklogEvent.EventCompleteCallback eventCompleteCallback) {
        synchronized (this.d) {
            if (!b(com.huawei.hwcommonmodel.application.BaseApplication.getContext(), deviceInfo.getDeviceIdentify())) {
                LogUtil.e("AccountSyncEvent", "addAccountSync sp is false");
                eventCompleteCallback.onResult(false);
                updateVisited(deviceInfo, false);
                return;
            }
            String accountInfo = LoginInit.getInstance(com.huawei.hwcommonmodel.application.BaseApplication.getContext()).getAccountInfo(1001);
            if (Utils.h() && !TextUtils.isEmpty(accountInfo)) {
                eventCompleteCallback.onResult(true);
                reportBiEvent(getBiKey(), getBiShowParams(0, 1, deviceInfo));
                return;
            }
            LogUtil.a("AccountSyncEvent", "addAccountSync accountName is null");
            eventCompleteCallback.onResult(false);
            updateVisited(deviceInfo, false);
        }
    }

    public static boolean b(Context context, String str) {
        LogUtil.a("AccountSyncEvent", "isShowSyncAccountFlagInSharePreference enter");
        String strE = SharedPreferenceManager.e(com.huawei.hwcommonmodel.application.BaseApplication.getContext(), Integer.toString(10008), "currentIsNoCloud");
        LogUtil.a("AccountSyncEvent", "isNoCloudToWithCloud:", strE);
        if ("1".equals(strE)) {
            LogUtil.a("AccountSyncEvent", "this is noCloud with cloud scenes");
            SharedPreferenceManager.e(com.huawei.hwcommonmodel.application.BaseApplication.getContext(), Integer.toString(10008), "currentIsNoCloud", "0", null);
            return true;
        }
        HiUserPreference userPreference = HiHealthManager.d(context).getUserPreference("sync_account_dialog_mark");
        if (userPreference != null) {
            String value = userPreference.getValue();
            LogUtil.a("AccountSyncEvent", "getValueFromDevice:", value);
            if ("1".equals(value)) {
                LogUtil.a("AccountSyncEvent", "getValueFromDevice scenes");
                return true;
            }
        } else {
            LogUtil.a("AccountSyncEvent", "userPreference is null");
        }
        String strE2 = SharedPreferenceManager.e(com.huawei.hwcommonmodel.application.BaseApplication.getContext(), String.valueOf(10005), "KEY_SHOW_SYNC_ACCOUNT_ARK_UI_ON_REMINDERS_FLAG".concat(str));
        String strE3 = SharedPreferenceManager.e(com.huawei.hwcommonmodel.application.BaseApplication.getContext(), String.valueOf(10005), "KEY_SHOW_SYNC_ACCOUNT_ON_HOME_ACTIVITY_FLAG".concat(str));
        LogUtil.a("AccountSyncEvent", "accountSyncValue:", strE2, ",accountFlagValue:", strE3);
        if (TextUtils.isEmpty(strE2)) {
            return "true".equals(strE3);
        }
        return "UNCOMPLETE".equals(strE2);
    }
}
