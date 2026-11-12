package defpackage;

import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwdevicemgr.R;
import health.compact.a.EzPluginManager;
import health.compact.a.LanguageUtil;
import health.compact.a.LogUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class lwd {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f40960b = new Object();
    private static volatile lwd e;

    private lwd() {
    }

    public static lwd c() {
        if (e == null) {
            synchronized (f40960b) {
                if (e == null) {
                    e = new lwd();
                }
            }
        }
        return e;
    }

    public void d(DeviceInfo deviceInfo) {
        LogUtil.b("CmccAiManager", "initCmccDeviceInfo Entry");
        if (deviceInfo == null) {
            LogUtil.e("CmccAiManager", "initCmccDeviceInfo deviceInfo is null");
            return;
        }
        String strJ = lvi.j(deviceInfo.getProductType());
        if (TextUtils.isEmpty(strJ)) {
            LogUtil.e("CmccAiManager", "initCmccDeviceInfo uuid is null");
            return;
        }
        if (e(SharedPreferenceManager.e(BaseApplication.b(), "cmcc_ai_device_info", b(deviceInfo)))) {
            ReleaseLogUtil.d("R_CmccAiManager", "initCmccDeviceInfo cmccAiDeviceInfoStr is not empty");
            return;
        }
        phx.d dVarA = a(strJ);
        if (dVarA == null) {
            LogUtil.e("CmccAiManager", "initCmccDeviceInfo cmccAi is null");
            return;
        }
        String strC = c(deviceInfo, dVarA, strJ);
        if (TextUtils.isEmpty(strC)) {
            LogUtil.e("CmccAiManager", "initCmccDeviceInfo body is empty");
        } else {
            d(deviceInfo, b(strC), strJ);
        }
    }

    private phx.d a(String str) {
        LogUtil.b("CmccAiManager", "getEzPluginCmccAiInfo Entry");
        pic picVarA = EzPluginManager.b().a(str);
        if (picVarA == null) {
            LogUtil.e("CmccAiManager", "getEzPluginCmccAiInfo pluginInfo is null");
            return null;
        }
        phx phxVarJ = picVarA.j();
        if (phxVarJ == null) {
            LogUtil.e("CmccAiManager", "getEzPluginCmccAiInfo ezPluginCustomizationInfo is null");
            return null;
        }
        phx.d dVarC = phxVarJ.c();
        LogUtil.b("CmccAiManager", "getEzPluginCmccAiInfo cmccAi is ", Boolean.valueOf(dVarC == null));
        return dVarC;
    }

    private String a(DeviceInfo deviceInfo) {
        String hiLinkDeviceId = deviceInfo.getHiLinkDeviceId();
        String deviceSubModelId = deviceInfo.getDeviceSubModelId();
        if (TextUtils.isEmpty(hiLinkDeviceId) || TextUtils.isEmpty(deviceSubModelId)) {
            LogUtil.e("CmccAiManager", "getProdIdAndSubId prodId or subId is empty");
            return "";
        }
        return hiLinkDeviceId + "_" + deviceSubModelId;
    }

    public boolean e(DeviceInfo deviceInfo, String str) {
        if (TextUtils.isEmpty(str) || deviceInfo == null) {
            LogUtil.e("CmccAiManager", "isSupportCmccProduct uuid is empty or deviceInfo is null");
            return false;
        }
        phx.d dVarA = a(str);
        if (dVarA == null) {
            LogUtil.e("CmccAiManager", "isSupportCmccProduct cmccAi is null");
            return false;
        }
        List<String> listB = dVarA.b();
        if (CollectionUtils.a(listB)) {
            LogUtil.e("CmccAiManager", "isSupportCmccProduct supportProductList is empty");
            return false;
        }
        if (listB.contains(a(deviceInfo)) && dVarA.d() == 1) {
            LogUtil.e("CmccAiManager", "isSupportCmccProduct is support device");
            return true;
        }
        LogUtil.e("CmccAiManager", "isSupportCmccProduct not support device");
        return false;
    }

    public void d(DeviceInfo deviceInfo, lwb.d dVar, String str) {
        if (deviceInfo == null || dVar == null) {
            ReleaseLogUtil.d("R_CmccAiManager", "saveCmccDataInfoToSp deviceInfo or dataInfo is null");
            return;
        }
        phx.d dVarA = a(str);
        if (dVarA == null) {
            LogUtil.e("CmccAiManager", "saveCmccDataInfoToSp cmccAi is null");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("deviceId", dVar.e());
            jSONObject.put("deviceNo", dVar.c());
            jSONObject.put("deviceSecret", dVar.d());
            jSONObject.put("productId", dVar.a());
            jSONObject.put("productKey", dVarA.e());
            SharedPreferenceManager.e(BaseApplication.b(), "cmcc_ai_device_info", b(deviceInfo), jSONObject.toString(), new StorageParams(1));
            ReleaseLogUtil.d("R_CmccAiManager", "saveCmccDataInfoToSp setSharedPreference is success");
        } catch (JSONException e2) {
            ReleaseLogUtil.d("R_CmccAiManager", "saveCmccDataInfoToSp jsonException is", ExceptionUtils.c(e2));
        }
    }

    public String b(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            ReleaseLogUtil.d("R_CmccAiManager", "getCmccDeviceInfoSpKey deviceInfo is null");
            return "";
        }
        return a(deviceInfo) + "_" + deviceInfo.getDeviceUdid();
    }

    public boolean d() {
        return !Utils.o() && LanguageUtil.l(BaseApplication.b());
    }

    private String c(DeviceInfo deviceInfo, phx.d dVar, String str) {
        LogUtil.b("CmccAiManager", "getBody Entry");
        if (!e(deviceInfo, str)) {
            LogUtil.e("CmccAiManager", "getBody isSupportCmccProduct is false");
            return "";
        }
        String strA = dVar.a();
        String strE = dVar.e();
        if (TextUtils.isEmpty(strA) || TextUtils.isEmpty(strE)) {
            LogUtil.e("CmccAiManager", "getBody cmccProductId or cmccProductKey is empty");
            return "";
        }
        String unConvertedUdid = deviceInfo.getUnConvertedUdid();
        if (TextUtils.isEmpty(unConvertedUdid) || unConvertedUdid.length() < 11) {
            LogUtil.e("CmccAiManager", "getBody sn or macAddress is empty or sn.length < 11");
            return "";
        }
        String strSubstring = unConvertedUdid.substring(unConvertedUdid.length() - 11);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("deviceNoType", "SN");
            jSONObject.put("deviceNo", strSubstring);
            jSONObject.put("productId", strA);
            jSONObject.put("productKey", strE);
        } catch (JSONException e2) {
            LogUtil.e("CmccAiManager", "getBody exception is", ExceptionUtils.c(e2));
        }
        return jSONObject.toString();
    }

    private lwb.d b(String str) {
        LogUtil.b("CmccAiManager", "requestCmccDeviceInfo Entry");
        HashMap map = new HashMap();
        map.put("Content-type", "application/json");
        String string = BaseApplication.b().getResources().getString(R.string.lingxi_domain_name);
        lwb lwbVar = (lwb) oet.d().e(string + "/v2/customer/device/secret/info", map, str, lwb.class);
        if (lwbVar == null) {
            ReleaseLogUtil.d("R_CmccAiManager", "requestCmccDeviceInfo cmccDeviceInfo is null");
            return null;
        }
        if (lwbVar.e() != 200) {
            ReleaseLogUtil.d("R_CmccAiManager", "requestCmccDeviceInfo cmccDeviceInfo failed , getCode is :", Integer.valueOf(lwbVar.e()));
            return null;
        }
        lwb.d dVarA = lwbVar.a();
        if (dVarA == null) {
            ReleaseLogUtil.d("R_CmccAiManager", "requestCmccDeviceInfo cmccDeviceInfo failed , dataInfo is null");
            return dVarA;
        }
        LogUtil.e("CmccAiManager", "requestCmccDeviceInfo dataInfo is ", dVarA.toString());
        return dVarA;
    }

    private boolean e(String str) {
        if (TextUtils.isEmpty(str)) {
            ReleaseLogUtil.d("R_CmccAiManager", "isCmccAiDeviceInfoValid cmccAiDeviceInfo is empty");
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("deviceId");
            String strOptString2 = jSONObject.optString("deviceSecret");
            if (!TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(strOptString2)) {
                LogUtil.b("R_CmccAiManager", "isCmccAiDeviceInfoValid cmccDeviceId and cmccDeviceSecret is not empty");
                return true;
            }
        } catch (JSONException e2) {
            ReleaseLogUtil.d("R_CmccAiManager", "isCmccAiDeviceInfoValid JSONException ", ExceptionUtils.c(e2));
        }
        return false;
    }
}
