package defpackage;

import android.text.TextUtils;
import com.alipay.sdk.m.s.e;
import com.huawei.agconnect.apms.Agent;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.messagecenter.model.CommonUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwdevice.phoneprocess.mgr.hwsynctaskmanager.synctask.AbstractSyncTask;
import com.huawei.hwdevicemgr.R;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class lwe extends AbstractSyncTask {
    public lwe() {
        super("CMCC_AI_SYNC_TASK");
    }

    @Override // com.huawei.hwdevice.phoneprocess.mgr.hwsynctaskmanager.synctask.AbstractSyncTask
    public void startTask(IBaseResponseCallback iBaseResponseCallback) {
        long j;
        LogUtil.b("CmccAiTask", "startTask entry");
        if (iBaseResponseCallback == null) {
            LogUtil.e("CmccAiTask", "startTask callback is null");
            return;
        }
        DeviceInfo deviceInfoD = mgg.d("CmccAiTask");
        if (deviceInfoD == null) {
            LogUtil.e("CmccAiTask", "startTask deviceInfo is null");
            iBaseResponseCallback.a(-1, "");
            return;
        }
        String strJ = mmx.j(deviceInfoD.getProductType());
        String deviceUdid = deviceInfoD.getDeviceUdid();
        if (!lwd.c().e(deviceInfoD, strJ)) {
            LogUtil.b("R_CmccAiTask", "startTask isSupportCmccProduct is false");
            iBaseResponseCallback.a(-1, "");
            return;
        }
        try {
            j = Long.parseLong((String) Objects.requireNonNull(SharedPreferenceManager.e(BaseApplication.b(), "request_cmcc_ai_report_module_id", "request_cmcc_ai_report_time" + deviceUdid)));
        } catch (NumberFormatException e) {
            LogUtil.b("CmccAiTask", "startTask numberFormatException ", ExceptionUtils.c(e));
            j = 0;
        }
        LogUtil.b("CmccAiTask", "startTask lastTime is ", Long.valueOf(j));
        if (System.currentTimeMillis() - j < 86400000) {
            ReleaseLogUtil.c("R_CmccAiTask", "startTask System.currentTimeMillis() - lastTime < 24 hour ");
            iBaseResponseCallback.a(-1, "");
            return;
        }
        try {
            String strD = d(deviceInfoD);
            if (TextUtils.isEmpty(strD)) {
                ReleaseLogUtil.c("R_CmccAiTask", "startTask body is empty");
                iBaseResponseCallback.a(-1, "");
            } else {
                d(strD, deviceUdid, iBaseResponseCallback);
            }
        } catch (JSONException e2) {
            LogUtil.b("CmccAiTask", "startTask jsonException ", ExceptionUtils.c(e2));
            iBaseResponseCallback.a(-1, "");
        }
    }

    private void d(String str, String str2, IBaseResponseCallback iBaseResponseCallback) throws JSONException {
        LogUtil.b("CmccAiTask", "requestCmccAiReport entry");
        HashMap map = new HashMap();
        map.put("Content-type", "application/json");
        String string = BaseApplication.b().getResources().getString(R.string.lingxi_domain_name);
        String str3 = (String) oet.d().e(string + "/v2/customer/device/report", map, str, String.class);
        if (TextUtils.isEmpty(str3)) {
            ReleaseLogUtil.c("R_CmccAiTask", "requestCmccAiReport requestReport failed, cmccReportInfo is empty");
            iBaseResponseCallback.a(-1, "");
            return;
        }
        String strOptString = new JSONObject(str3).optString("code");
        if ("200".equals(strOptString)) {
            ReleaseLogUtil.c("R_CmccAiTask", "requestCmccAiReport requestReport success, ", Long.valueOf(System.currentTimeMillis()));
            SharedPreferenceManager.e(BaseApplication.b(), "request_cmcc_ai_report_module_id", "request_cmcc_ai_report_time" + str2, String.valueOf(System.currentTimeMillis()), new StorageParams());
            iBaseResponseCallback.a(0, "");
            return;
        }
        ReleaseLogUtil.c("R_CmccAiTask", "requestCmccAiReport requestReport failed, code is ", strOptString);
        iBaseResponseCallback.a(-1, "");
    }

    private String d(DeviceInfo deviceInfo) throws JSONException {
        String strB = lwd.c().b(deviceInfo);
        if (TextUtils.isEmpty(strB)) {
            LogUtil.e("CmccAiTask", "getBody spKey is empty");
            return "";
        }
        String strE = SharedPreferenceManager.e(BaseApplication.b(), "cmcc_ai_device_info", strB);
        if (TextUtils.isEmpty(strE)) {
            LogUtil.e("CmccAiTask", "getBody cmccAiDeviceInfoStr is empty");
            return "";
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject(strE);
        jSONObject.put("deviceId", jSONObject2.optString("deviceId"));
        jSONObject.put("deviceSecret", jSONObject2.optString("deviceSecret"));
        jSONObject.put("productId", jSONObject2.optString("productId"));
        jSONObject.put("productKey", jSONObject2.optString("productKey"));
        jSONObject.put(e.n, a());
        return jSONObject.toString();
    }

    private JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        ArrayList arrayList = new ArrayList(1);
        arrayList.add("127.0.0.1");
        jSONObject.put("innerIp", arrayList);
        jSONObject.put("netSpeed", "0Mbps");
        jSONObject.put("netType", "");
        jSONObject.put("platform", Agent.OS_NAME);
        jSONObject.put("sdkVersion", "ai_http_1.0");
        jSONObject.put("firmwareVersion", "");
        jSONObject.put(CommonUtil.IMEI, "");
        jSONObject.put("cmei", "");
        jSONObject.put("mac", "");
        return jSONObject;
    }
}
