package com.huawei.ui.homehealth.backlog.backlogevent;

import android.text.TextUtils;
import com.huawei.health.device.callback.BackLogCallback;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceCategoryFragment;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.homehealth.backlog.BacklogType;
import defpackage.dse;
import defpackage.lmf;
import defpackage.lsp;
import defpackage.lvl;
import defpackage.njy;
import defpackage.riq;
import health.compact.a.SharedPreferenceManager;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public abstract class BacklogEvent {
    private static final int ACTION_CANCEL = 1;
    protected static final int ACTION_SHOW = 0;
    private static final String BI_TYPE_KEY = "type";
    private static final int EVENT_CANCEL = 2;
    protected static final int EVENT_SHOW = 1;
    protected static final String STATUS_DEFAULT = "0";
    protected static final String STATUS_SHOW = "1";
    private static final String STATUS_VISITED = "2";
    private static final String TAG = "BacklogEvent";
    protected final BacklogType mType;

    public interface EventCompleteCallback {
        void onResult(boolean z);
    }

    public void checkEventComplete(DeviceInfo deviceInfo, EventCompleteCallback eventCompleteCallback) {
    }

    public abstract String getTitle();

    public BacklogEvent(BacklogType backlogType) {
        this.mType = backlogType;
    }

    public void onBacklogClick(String str, BackLogCallback<Integer> backLogCallback) {
        if (TextUtils.isEmpty(getBiKey())) {
            return;
        }
        reportBiEvent(getBiKey(), getBiClickParams(this.mType.getId(), str));
    }

    protected DeviceInfo getDeviceInfoById(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (riq.a() != null && str.equals(riq.a().getDeviceIdentify())) {
            return riq.a();
        }
        List<DeviceInfo> listD = lvl.d();
        if (njy.e(listD)) {
            return null;
        }
        for (DeviceInfo deviceInfo : listD) {
            if (str.equals(deviceInfo.getDeviceIdentify())) {
                LogUtil.a(TAG, "deviceInfo is local DeviceInfo");
                return deviceInfo;
            }
        }
        return null;
    }

    public void reportBiEvent(String str, Map<String, Object> map) {
        if (map == null) {
            return;
        }
        lmf.d().c(BaseApplication.getContext(), str, map, 0);
    }

    protected Map<String, Object> getPopTipEventBiParams() {
        HashMap map = new HashMap(16);
        map.put("tipType", "2");
        map.put("Page", "To-Do Page");
        DeviceInfo deviceInfoA = riq.a();
        if (deviceInfoA == null) {
            return map;
        }
        map.put("device_name", deviceInfoA.getDeviceName());
        map.put(DeviceCategoryFragment.DEVICE_TYPE, Integer.valueOf(deviceInfoA.getProductType()));
        map.put("HiLinkDeviceId", deviceInfoA.getHiLinkDeviceId());
        return map;
    }

    public Map<String, Object> getBiClickParams(String str, String str2) {
        HashMap map = new HashMap(16);
        map.put("click", 1);
        map.put("type", str);
        return map;
    }

    public dse createBacklogBean(DeviceInfo deviceInfo) {
        dse dseVar = new dse(this.mType.getId(), getTitle());
        dseVar.c(isVisited(deviceInfo));
        dseVar.b(deviceInfo.getDeviceIdentify());
        return dseVar;
    }

    protected boolean isVisited(DeviceInfo deviceInfo) {
        String deviceIdentify = deviceInfo.getDeviceIdentify();
        return SharedPreferenceManager.b(getModuleId(deviceIdentify), getSharedPreferenceKey(this.mType.getId(), deviceIdentify), false);
    }

    protected boolean isRemind(DeviceInfo deviceInfo) {
        return !SharedPreferenceManager.b(getModuleId(deviceInfo.getDeviceIdentify()), getSharedPreferenceDeleteKey(this.mType.getId()), false);
    }

    public void updateVisited(DeviceInfo deviceInfo, boolean z) {
        String deviceIdentify = deviceInfo.getDeviceIdentify();
        SharedPreferenceManager.a(getModuleId(deviceIdentify), getSharedPreferenceKey(this.mType.getId(), deviceIdentify), z);
    }

    public void updateRemind(DeviceInfo deviceInfo) {
        if (!TextUtils.isEmpty(getBiKey())) {
            reportBiEvent(getBiKey(), getBiShowParams(1, 2, deviceInfo));
        }
        SharedPreferenceManager.a(getModuleId(deviceInfo.getDeviceIdentify()), getSharedPreferenceDeleteKey(this.mType.getId()), true);
    }

    public Map<String, Object> getBiShowParams(int i, int i2, DeviceInfo deviceInfo) {
        HashMap map = new HashMap(16);
        map.put("tipType", 2);
        map.put("Action", Integer.valueOf(i));
        map.put("device_name", deviceInfo.getDeviceName());
        map.put(DeviceCategoryFragment.DEVICE_TYPE, String.valueOf(deviceInfo.getProductType()));
        map.put("HiLinkDeviceId", deviceInfo.getHiLinkDeviceId());
        map.put("Page", "To-Do Page");
        map.put("Event", Integer.valueOf(i2));
        return map;
    }

    protected String getModuleId(String str) {
        return "Pending_Setting_moduleId_" + lsp.b(com.huawei.haf.application.BaseApplication.b(), str);
    }

    protected String getSharedPreferenceKey(String str, String str2) {
        return lsp.b(com.huawei.haf.application.BaseApplication.b(), "BACkLOG_" + str + "_" + str2);
    }

    protected String getSharedPreferenceDeleteKey(String str) {
        return lsp.b(com.huawei.haf.application.BaseApplication.b(), "BACkLOG_DELETE_" + str);
    }

    protected void setCache(DeviceInfo deviceInfo, String str) {
        String deviceIdentify = deviceInfo.getDeviceIdentify();
        SharedPreferenceManager.c(getModuleId(deviceIdentify), getSharedPreferenceStatusKey(this.mType.getId(), deviceIdentify), str);
    }

    protected boolean readCache(DeviceInfo deviceInfo) {
        String deviceIdentify = deviceInfo.getDeviceIdentify();
        String strB = SharedPreferenceManager.b(getModuleId(deviceIdentify), getSharedPreferenceStatusKey(this.mType.getId(), deviceIdentify), "0");
        LogUtil.a(TAG, "addWechatBinding Network unAvailable,lastStatus:", strB);
        return "1".equals(strB) || "2".equals(strB);
    }

    protected String getSharedPreferenceStatusKey(String str, String str2) {
        return lsp.b(com.huawei.haf.application.BaseApplication.b(), "BACkLOG_STATUS_" + str + "_" + str2);
    }

    public String getBiKey() {
        return AnalyticsValue.DEVICE_POP_TIP_EVENT_VALUE.value();
    }
}
