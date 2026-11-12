package defpackage;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.utils.NetworkUtil;
import com.huawei.health.device.callback.BackLogCallback;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.device.utlis.FindNetworkUtils;
import com.huawei.ui.homehealth.R;
import com.huawei.ui.homehealth.backlog.BacklogType;
import com.huawei.ui.homehealth.backlog.backlogevent.BacklogEvent;
import health.compact.a.SharedPreferenceManager;
import java.util.HashMap;

/* JADX INFO: loaded from: classes17.dex */
public class rkm extends BacklogEvent {
    public rkm() {
        super(BacklogType.FIND_NETWORK);
    }

    @Override // com.huawei.ui.homehealth.backlog.backlogevent.BacklogEvent
    public void onBacklogClick(String str, BackLogCallback<Integer> backLogCallback) {
        super.onBacklogClick(str, backLogCallback);
        Activity activityJ = BaseApplication.j();
        if (activityJ == null) {
            backLogCallback.onFailure(-1, "Activity is null ");
            return;
        }
        String strB = SharedPreferenceManager.b(getModuleId(str), getSharedPreferenceKey(this.mType.getId() + CommonConstant.RETKEY.DISPLAYNAME, str), "");
        if (!TextUtils.isEmpty(strB)) {
            FindNetworkUtils.b(activityJ, strB);
            backLogCallback.onFailure(-1, "account tip");
            return;
        }
        DeviceInfo deviceInfoA = tfn.a().a(str);
        if (deviceInfoA == null) {
            LogUtil.j("FindNetworkEvent", "deviceInfo is null");
            backLogCallback.onFailure(-1, "deviceInfo is null");
        } else {
            a(deviceInfoA, 2, activityJ, backLogCallback);
        }
    }

    private void a(DeviceInfo deviceInfo, int i, Context context, final BackLogCallback<Integer> backLogCallback) {
        FindNetworkUtils.d(deviceInfo, i, context, new FindNetworkUtils.IFindNetworkCallback() { // from class: rkm.5
            @Override // com.huawei.ui.device.utlis.FindNetworkUtils.IFindNetworkCallback
            public void onSuccess(int i2, HashMap<String, Object> map) {
                if (i2 == 1) {
                    backLogCallback.onSuccess(0);
                } else {
                    backLogCallback.onFailure(-1, "register fail");
                }
            }

            @Override // com.huawei.ui.device.utlis.FindNetworkUtils.IFindNetworkCallback
            public void onFail(String str) {
                LogUtil.j("FindNetworkEvent", str);
                backLogCallback.onFailure(-1, str);
            }
        });
    }

    @Override // com.huawei.ui.homehealth.backlog.backlogevent.BacklogEvent
    public String getBiKey() {
        return "";
    }

    @Override // com.huawei.ui.homehealth.backlog.backlogevent.BacklogEvent
    public String getTitle() {
        return BaseApplication.b().getString(R.string.IDS_backlog_open_watch_search_service);
    }

    @Override // com.huawei.ui.homehealth.backlog.backlogevent.BacklogEvent
    public void checkEventComplete(DeviceInfo deviceInfo, BacklogEvent.EventCompleteCallback eventCompleteCallback) {
        if (!isRemind(deviceInfo)) {
            LogUtil.a("FindNetworkEvent", "isRemind false");
            eventCompleteCallback.onResult(false);
        } else if (!NetworkUtil.i()) {
            eventCompleteCallback.onResult(readCache(deviceInfo));
        } else if (FindNetworkUtils.a(deviceInfo, BaseApplication.b())) {
            e(deviceInfo, eventCompleteCallback);
        } else {
            eventCompleteCallback.onResult(false);
            updateVisited(deviceInfo, false);
        }
    }

    private void e(final DeviceInfo deviceInfo, final BacklogEvent.EventCompleteCallback eventCompleteCallback) {
        FindNetworkUtils.c(BaseApplication.b(), new FindNetworkUtils.IFindNetworkCallback() { // from class: rkm.2
            @Override // com.huawei.ui.device.utlis.FindNetworkUtils.IFindNetworkCallback
            public void onSuccess(int i, HashMap<String, Object> map) {
                if (i == 1) {
                    rkm.this.d(deviceInfo, eventCompleteCallback);
                } else {
                    rkm.this.c(deviceInfo, eventCompleteCallback);
                }
            }

            @Override // com.huawei.ui.device.utlis.FindNetworkUtils.IFindNetworkCallback
            public void onFail(String str) {
                LogUtil.j("FindNetworkEvent", "queryFindNetworkStatus fail message:", str);
                rkm.this.c(deviceInfo, eventCompleteCallback);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(final DeviceInfo deviceInfo, final BacklogEvent.EventCompleteCallback eventCompleteCallback) {
        FindNetworkUtils.e(deviceInfo, BaseApplication.b(), new FindNetworkUtils.IFindNetworkCallback() { // from class: rkm.1
            @Override // com.huawei.ui.device.utlis.FindNetworkUtils.IFindNetworkCallback
            public void onSuccess(int i, HashMap<String, Object> map) {
                rkm.this.a(deviceInfo, i, map, eventCompleteCallback);
            }

            @Override // com.huawei.ui.device.utlis.FindNetworkUtils.IFindNetworkCallback
            public void onFail(String str) {
                LogUtil.j("FindNetworkEvent", "queryRegisterStatus fail message:", str);
                rkm.this.c(deviceInfo, eventCompleteCallback);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(DeviceInfo deviceInfo, int i, HashMap<String, Object> map, BacklogEvent.EventCompleteCallback eventCompleteCallback) {
        String string;
        Object obj;
        String deviceIdentify = deviceInfo.getDeviceIdentify();
        if (i == 0) {
            setCache(deviceInfo, "1");
            eventCompleteCallback.onResult(true);
            SharedPreferenceManager.b(getModuleId(deviceIdentify), getSharedPreferenceKey(this.mType.getId() + CommonConstant.RETKEY.DISPLAYNAME, deviceIdentify));
            return;
        }
        if (i == 1) {
            setCache(deviceInfo, "0");
            c(deviceInfo, eventCompleteCallback);
            SharedPreferenceManager.b(getModuleId(deviceIdentify), getSharedPreferenceKey(this.mType.getId() + CommonConstant.RETKEY.DISPLAYNAME, deviceIdentify));
            return;
        }
        if (i == 2) {
            setCache(deviceInfo, "1");
            eventCompleteCallback.onResult(true);
            if (map != null && map.containsKey("displayName") && (obj = map.get("displayName")) != null) {
                string = obj.toString();
            } else {
                string = "";
            }
            SharedPreferenceManager.c(getModuleId(deviceIdentify), getSharedPreferenceKey(this.mType.getId() + CommonConstant.RETKEY.DISPLAYNAME, deviceIdentify), string);
            return;
        }
        c(deviceInfo, eventCompleteCallback);
        SharedPreferenceManager.b(getModuleId(deviceIdentify), getSharedPreferenceKey(this.mType.getId() + CommonConstant.RETKEY.DISPLAYNAME, deviceIdentify));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(DeviceInfo deviceInfo, BacklogEvent.EventCompleteCallback eventCompleteCallback) {
        eventCompleteCallback.onResult(false);
        updateVisited(deviceInfo, false);
    }
}
