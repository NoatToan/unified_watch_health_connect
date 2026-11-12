package defpackage;

import android.content.ActivityNotFoundException;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.huawei.health.device.connectivity.comm.MeasurableDevice;
import com.huawei.health.device.fatscale.multiusers.MultiUsersManager;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.health.device.util.EventBus;
import com.huawei.health.device.wifi.interfaces.CommBaseCallbackInterface;
import com.huawei.health.ecologydevice.manager.ResourceManager;
import com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceCategoryFragment;
import com.huawei.hms.support.feature.result.CommonConstant;
import com.huawei.hwcloudmodel.callback.ICloudOperationResult;
import com.huawei.hwcloudmodel.model.CloudCommonReponse;
import com.huawei.hwcloudmodel.model.unite.AuthorizeSubUserInfo;
import com.huawei.hwcloudmodel.model.unite.DeviceServiceInfo;
import com.huawei.hwcloudmodel.model.unite.WifiDeviceControlDataModelReq;
import com.huawei.hwcloudmodel.model.unite.WifiDeviceExitAuthorizeSubUserReq;
import com.huawei.hwcloudmodel.model.unite.WifiDeviceGetAuthorizeSubUserReq;
import com.huawei.hwcloudmodel.model.unite.WifiDeviceGetAuthorizeSubUserRsp;
import com.huawei.hwcloudmodel.model.unite.WifiDeviceServiceInfoReq;
import com.huawei.hwcloudmodel.model.unite.WifiDeviceServiceInfoRsp;
import com.huawei.hwcloudmodel.model.unite.WifiDeviceUnbindReq;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.utils.Constants;
import com.huawei.pluginachievement.manager.model.KakaConstants;
import com.huawei.plugindevice.R;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.wisecloud.drmclient.license.HwDrmConstant;
import health.compact.a.CommonUtil;
import health.compact.a.CompileParameterUtil;
import health.compact.a.GRSManager;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.UnitUtil;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class ean {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String[] f32595a = {"e4b0b1d5-2003-4d88-8b5f-c4f64542040b", "a8ba095d-4123-43c4-a30a-0240011c58de"};

    public static void d(Context context) {
        ArrayList<eby> arrayListA = ecf.a();
        if (njy.e(arrayListA)) {
            LogUtil.e("WifiDeviceControl", "setMetricOrImperialUnit deviceIdList is null");
            return;
        }
        for (eby ebyVar : arrayListA) {
            if (h(ebyVar.getProductId())) {
                b(context, ebyVar.e());
            }
        }
    }

    private static void b(Context context, final String str) {
        if (TextUtils.isEmpty(str)) {
            dyg.a(false, "WifiDeviceControl", "setMetricOrImperialUnit deviceId is null");
            return;
        }
        boolean zF = UnitUtil.f();
        dyg.a(true, "WifiDeviceControl", "current setting unit is ", Boolean.valueOf(zF));
        ArrayList arrayList = new ArrayList(16);
        DeviceServiceInfo deviceServiceInfo = new DeviceServiceInfo();
        HashMap map = new HashMap(16);
        if (zF) {
            map.put("weightUnit", "2");
        } else {
            map.put("weightUnit", "1");
        }
        deviceServiceInfo.setData(map);
        deviceServiceInfo.setSid("setDevParam");
        arrayList.add(deviceServiceInfo);
        WifiDeviceControlDataModelReq wifiDeviceControlDataModelReq = new WifiDeviceControlDataModelReq();
        wifiDeviceControlDataModelReq.setDeviceServiceInfo(arrayList);
        wifiDeviceControlDataModelReq.setDevId(str);
        lqo.b(context).e(wifiDeviceControlDataModelReq, new ICloudOperationResult<CloudCommonReponse>() { // from class: ean.3
            @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void operationResult(CloudCommonReponse cloudCommonReponse, String str2, boolean z) {
                if (z) {
                    dyg.a(false, "WifiDeviceControl", "set unit success ");
                    return;
                }
                if (cloudCommonReponse != null) {
                    Integer resultCode = cloudCommonReponse.getResultCode();
                    int iIntValue = resultCode.intValue();
                    dyg.a(false, "WifiDeviceControl", "errorCode = ", resultCode, " | errorDes = ", cloudCommonReponse.getResultDesc());
                    if (iIntValue == 112000000) {
                        ean.k(str);
                    }
                }
            }
        });
    }

    public static boolean e() {
        ArrayList<String> arrayListA;
        return CompileParameterUtil.c("SUPPORT_WIFI_WEIGHT_DEVICE", false) && (arrayListA = drw.e().a()) != null && arrayListA.size() > 0;
    }

    public static ArrayList<elh> c() {
        ArrayList<String> arrayListD;
        ArrayList<elh> arrayList = new ArrayList<>(16);
        if (CompileParameterUtil.c("SUPPORT_WIFI_WEIGHT_DEVICE", false) && (arrayListD = drw.e().d(HealthDevice.HealthDeviceKind.HDK_WEIGHT)) != null && arrayListD.size() > 0) {
            Iterator<String> it = arrayListD.iterator();
            while (it.hasNext()) {
                elh elhVarD = ResourceManager.c().d(it.next());
                if (elhVarD != null && n(elhVarD.t())) {
                    arrayList.add(elhVarD);
                }
            }
        }
        return arrayList;
    }

    private static boolean n(String str) {
        dyg.e(false, "WifiDeviceControl", "isSupportPressureWifiDevice productId : ", str);
        for (String str2 : f32595a) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static void e(Context context) {
        ArrayList<eby> arrayListD;
        if (context == null) {
            dyg.a(false, "WifiDeviceControl", "goToUnBindWiFiDevice context is null");
            return;
        }
        if (!CompileParameterUtil.c("SUPPORT_WIFI_WEIGHT_DEVICE", false) || (arrayListD = drw.e().d()) == null || arrayListD.size() == 0) {
            return;
        }
        Intent intent = new Intent();
        intent.setPackage(BaseApplication.getAppPackage());
        intent.setClassName(BaseApplication.getAppPackage(), "com.huawei.health.device.ui.DeviceMainActivity");
        if (arrayListD.size() > 0) {
            MeasurableDevice measurableDeviceA = dmp.d().a(arrayListD.get(0).getSerialNumber(), false);
            if (!(measurableDeviceA instanceof eby)) {
                dyg.a(false, "WifiDeviceControl", "goToUnBindWiFiDevice device is null");
            } else {
                Bundle bundle = new Bundle();
                intent.setAction("SWITCH_PLUGINDEVICE");
                bundle.putString("arg1", "DeviceInfoList");
                eby ebyVar = (eby) measurableDeviceA;
                bundle.putString("productId", ebyVar.getProductId());
                ContentValues contentValues = new ContentValues();
                contentValues.put("productId", ebyVar.getProductId());
                contentValues.put("uniqueId", ebyVar.getUniqueId());
                bundle.putParcelable("commonDeviceInfo", contentValues);
                intent.putExtras(bundle);
            }
        } else {
            intent.putExtra("kind", HealthDevice.HealthDeviceKind.HDK_WEIGHT.name());
            intent.putExtra("view", "WiFiBindDevice");
        }
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            LogUtil.e("WifiDeviceControl", "goToUnBindWiFiDevice exception");
        }
    }

    public static void a(Map<String, String> map, String str, Context context) {
        if (map == null || context == null) {
            LogUtil.j("WifiDeviceControl", "setUserInfo userInfo or context is null");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("WifiDeviceControl", "setUserInfo sid is null");
            return;
        }
        String str2 = map.get("uid");
        if (TextUtils.isEmpty(str2) || str2.equals(MultiUsersManager.INSTANCE.getMainUser().i())) {
            map.put("uid", "0");
        }
        ArrayList<eby> arrayListD = drw.e().d();
        if (!njy.b(arrayListD)) {
            LogUtil.j("WifiDeviceControl", "setUserInfo not bind wifi device");
            return;
        }
        for (eby ebyVar : arrayListD) {
            if (!dor.b(dxm.f(ebyVar.getSerialNumber()))) {
                map.remove("month");
            }
            d(map, ebyVar.e(), str, context);
        }
    }

    public static void d(Map<String, String> map, final String str, String str2, Context context) {
        if (map == null || map.isEmpty()) {
            LogUtil.j("WifiDeviceControl", "setUserInfo userInfoMap is null");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("WifiDeviceControl", "setUserInfo deviceId is null");
            return;
        }
        String strE = e(str2, str);
        if (TextUtils.isEmpty(strE)) {
            LogUtil.j("WifiDeviceControl", "setUserInfo newSid is null");
            return;
        }
        LogUtil.a("WifiDeviceControl", "setUserInfo newSid:", strE, " deviceId: ", CommonUtil.n(str), " uid: ", Boolean.valueOf("0".equals(map.get("uid"))));
        Map<String, String> mapB = b(map, str);
        ArrayList arrayList = new ArrayList(16);
        DeviceServiceInfo deviceServiceInfo = new DeviceServiceInfo();
        deviceServiceInfo.setData(mapB);
        deviceServiceInfo.setSid(strE);
        arrayList.add(deviceServiceInfo);
        WifiDeviceControlDataModelReq wifiDeviceControlDataModelReq = new WifiDeviceControlDataModelReq();
        wifiDeviceControlDataModelReq.setDevId(str);
        wifiDeviceControlDataModelReq.setDeviceServiceInfo(arrayList);
        lqo.b(context).e(wifiDeviceControlDataModelReq, new ICloudOperationResult<CloudCommonReponse>() { // from class: ean.4
            @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void operationResult(CloudCommonReponse cloudCommonReponse, String str3, boolean z) {
                if (z) {
                    LogUtil.a("WifiDeviceControl", "setUserInfo success");
                    return;
                }
                if (cloudCommonReponse == null) {
                    LogUtil.j("WifiDeviceControl", "setUserInfo response is null");
                    return;
                }
                Integer resultCode = cloudCommonReponse.getResultCode();
                int iIntValue = resultCode.intValue();
                LogUtil.j("WifiDeviceControl", "setUserInfo errorCode:", resultCode, "|errorDesc:", cloudCommonReponse.getResultDesc());
                if (iIntValue == 112000000) {
                    ean.k(str);
                }
            }
        });
    }

    private static String e(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            dyg.d(false, "WifiDeviceControl", "getSid sid is ", Boolean.valueOf(TextUtils.isEmpty(str)), " or deviceID is ", Boolean.valueOf(TextUtils.isEmpty(dyg.b(str2))));
            return null;
        }
        HealthDevice healthDeviceC = drw.e().c(str2);
        if (!(healthDeviceC instanceof eby)) {
            LogUtil.j("WifiDeviceControl", "healthDevice is not instanceof WiFiDevice");
            return null;
        }
        if (((eby) healthDeviceC).a().m() != 2) {
            return str.indexOf("_") >= 0 ? str.substring(0, str.indexOf("_")) : str;
        }
        if (str.indexOf("_") != -1) {
            return str;
        }
        return str + "_" + LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
    }

    public static void b(String str, boolean z) {
        Iterator<dnj> it = MultiUsersManager.INSTANCE.getAllUser().iterator();
        while (it.hasNext()) {
            d(str, it.next(), z);
        }
    }

    private static void d(String str, dnj dnjVar, boolean z) {
        String serialNumber;
        Map<String, String> mapA = a(str, dnjVar, z);
        if (e(dnjVar)) {
            dnjVar.b(ece.f32732a);
        }
        Iterator<eby> it = drw.e().d().iterator();
        while (true) {
            if (!it.hasNext()) {
                serialNumber = "";
                break;
            }
            eby next = it.next();
            if (TextUtils.equals(next.e(), str)) {
                serialNumber = next.getSerialNumber();
                break;
            }
        }
        if (dor.b(dxm.f(serialNumber))) {
            mapA.put("month", String.valueOf(dor.e(dnjVar.j())));
        }
        d(mapA, str, dnjVar.g(), BaseApplication.getContext());
    }

    private static Map<String, String> a(String str, dnj dnjVar, boolean z) {
        String strI;
        LogUtil.a("WifiDeviceControl", "getUserParam isHagridDevice:", Boolean.valueOf(z));
        HashMap map = new HashMap(16);
        map.put("id", LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011));
        map.put("uid", e(dnjVar) ? String.valueOf(0) : dnjVar.i());
        map.put(CommonConstant.KEY_GENDER, String.valueOf((int) dne.a(dnjVar.d())));
        map.put("age", String.valueOf(dor.a(dnjVar.j(), dnjVar.c())));
        map.put("height", String.valueOf(dnjVar.e()));
        map.put("isDelete", String.valueOf(0));
        if (e(dnjVar)) {
            strI = String.valueOf(0);
        } else {
            strI = dnjVar.i();
        }
        if (z) {
            map.put("currentWeight", String.valueOf(dnjVar.r()));
            return map;
        }
        String strB = b(str, strI);
        if (strB != null && !TextUtils.isEmpty(strB)) {
            LogUtil.a("WifiDeviceControl", "getUserParam deviceUser is not null");
            String strJ = j(strB);
            String strA = a(strB);
            String strA2 = a(strJ, z);
            if (!TextUtils.isEmpty(strA2) && !"0".equals(strA2)) {
                map.put("currentWeight", strA2);
            } else {
                LogUtil.a("WifiDeviceControl", "getUserParam currentWeight is null");
                map.put("currentWeight", String.valueOf(dnjVar.r()));
            }
            if (!TextUtils.isEmpty(strA) && !"0".equals(strA)) {
                map.put("bodyRes", strA);
            }
            return map;
        }
        LogUtil.j("WifiDeviceControl", "getUserParam deviceUser is null");
        map.put("currentWeight", String.valueOf(dnjVar.r()));
        return map;
    }

    private static String a(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("WifiDeviceControl", "getUserWeightData weight is null");
            return null;
        }
        try {
            float f = Float.parseFloat(str);
            if (f != 0.0f && !Float.isNaN(f)) {
                int i = z ? 100 : 10;
                LogUtil.a("WifiDeviceControl", "getUserWeightData weightDivision:", Integer.valueOf(i));
                return new BigDecimal(str).divide(new BigDecimal(String.valueOf(i))).toPlainString();
            }
            LogUtil.j("WifiDeviceControl", "getUserWeightData weight is error");
            return null;
        } catch (NumberFormatException unused) {
            LogUtil.e("WifiDeviceControl", "getUserWeightData NumberFormatException");
        }
    }

    private static boolean e(dnj dnjVar) {
        String strI = dnjVar.i();
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
        if (strI == null) {
            LogUtil.j("WifiDeviceControl", "isMainUser uuid is null");
            return true;
        }
        if ("0".equals(strI) || "".equals(strI)) {
            LogUtil.j("WifiDeviceControl", "isMainUser:", strI);
            return true;
        }
        if (!Constants.NULL.equalsIgnoreCase(strI) && !strI.equals(accountInfo)) {
            return false;
        }
        LogUtil.j("WifiDeviceControl", "isMainUser:", strI);
        return true;
    }

    private static Map<String, String> b(Map<String, String> map, String str) {
        String str2 = map.get("currentWeight");
        HashMap map2 = new HashMap(16);
        map2.putAll(map);
        float fH = qrs.h(str2);
        if (fH != 0.0f && !Float.isNaN(fH)) {
            int i = i(str) ? 100 : 10;
            LogUtil.a("WifiDeviceControl", "setUserInfoWeightData weightDivision:", Integer.valueOf(i), "|deviceId:", dyg.b(str));
            LogUtil.d("WifiDeviceControl", "setUserInfoWeightData weight = ", Float.valueOf(fH), ",devId = ", str);
            map2.put("currentWeight", new BigDecimal(str2).multiply(new BigDecimal(String.valueOf(i))).toPlainString());
            return map2;
        }
        map2.remove("currentWeight");
        LogUtil.j("WifiDeviceControl", "setUserInfoWeightData weight is error");
        return map2;
    }

    public static void a() {
        ArrayList<String> arrayListA = drw.e().a();
        if (arrayListA == null || arrayListA.size() <= 0) {
            dyg.c(false, "WifiDeviceControl", "getPressureCalibrateList deviceIdList is null");
            return;
        }
        for (String str : arrayListA) {
            c(str, ecf.g(str));
        }
    }

    public static void c(String str, String str2) {
        dyg.a(false, "WifiDeviceControl", "getPressureCalibrateList");
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            dyg.a(false, "WifiDeviceControl", "getPressureCalibrateList deviceId or productId is empty");
            return;
        }
        final String str3 = "pressure_calibrate_hrv_userinfo_" + str2;
        if (!TextUtils.isEmpty(SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10000), str3))) {
            dyg.a(false, "WifiDeviceControl", "getPressureCalibrateList hrvUserInfo is not empty");
            return;
        }
        WifiDeviceServiceInfoReq wifiDeviceServiceInfoReq = new WifiDeviceServiceInfoReq();
        wifiDeviceServiceInfoReq.setDevId(str);
        wifiDeviceServiceInfoReq.setSid("devResult");
        lqo.b(dxw.d()).d(wifiDeviceServiceInfoReq, new ICloudOperationResult<WifiDeviceServiceInfoRsp>() { // from class: ean.2
            @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void operationResult(WifiDeviceServiceInfoRsp wifiDeviceServiceInfoRsp, String str4, boolean z) {
                if (!z || wifiDeviceServiceInfoRsp == null || wifiDeviceServiceInfoRsp.getDeviceServiceInfo() == null || wifiDeviceServiceInfoRsp.getDeviceServiceInfo().isEmpty()) {
                    return;
                }
                Iterator<DeviceServiceInfo> it = wifiDeviceServiceInfoRsp.getDeviceServiceInfo().iterator();
                while (it.hasNext()) {
                    Map<String, String> data = it.next().getData();
                    if (!data.isEmpty()) {
                        for (Map.Entry<String, String> entry : data.entrySet()) {
                            ean.e(str3, entry.getKey(), entry);
                        }
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(String str, String str2, Map.Entry<String, String> entry) {
        if (TextUtils.equals(str2, "hrvUserInfo")) {
            j(str, entry.getValue());
        }
        if (TextUtils.equals(str2, "hrvUserInfo1")) {
            j(str, entry.getValue());
        }
        if (TextUtils.equals(str2, "hrvUserInfo2")) {
            j(str, entry.getValue());
        }
        if (TextUtils.equals(str2, "hrvUserInfo3")) {
            j(str, entry.getValue());
        }
        if (TextUtils.equals(str2, "hrvUserInfo4")) {
            j(str, entry.getValue());
        }
    }

    private static void j(String str, String str2) {
        String strValueOf = String.valueOf(LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011));
        if (TextUtils.isEmpty(str2)) {
            dyg.a(false, "WifiDeviceControl", "handleUserHrvInfo hrvUserInfo is empty");
            return;
        }
        if (TextUtils.isEmpty(strValueOf)) {
            dyg.a(false, "WifiDeviceControl", "handleUserHrvInfo huid is empty");
            return;
        }
        if (str2.contains(":")) {
            dyg.a(false, "WifiDeviceControl", "handleUserHrvInfo mHrvUserInfo is new");
            int iIndexOf = str2.indexOf(":");
            if (iIndexOf == -1) {
                LogUtil.e("WifiDeviceControl", "handleUserHrvInfo index = INVALID_NUMBER_TYPE");
                return;
            } else if (strValueOf.equals(str2.substring(0, iIndexOf).trim())) {
                f(str, str2.substring(str2.indexOf(":") + 1, str2.length()));
                return;
            } else {
                dyg.a(false, "WifiDeviceControl", "handleUserHrvInfo huid is not same");
                return;
            }
        }
        dyg.a(false, "WifiDeviceControl", "handleUserHrvInfo mHrvUserInfo is old");
        f(str, str2);
    }

    private static void f(String str, String str2) {
        SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10000), str, str2, null);
    }

    public static void k(String str) {
        drw.e().f(str);
    }

    public static void d() {
        dyg.a(false, "WifiDeviceControl", "confirmDevUserInfo in");
        ArrayList<String> arrayListA = drw.e().a();
        if (arrayListA == null || arrayListA.size() <= 0) {
            dyg.a(false, "WifiDeviceControl", "confirmDevUserInfo deviceIdList is null");
            return;
        }
        dyg.a(false, "WifiDeviceControl", "confirmDevUserInfo deviceIdList size:", Integer.valueOf(arrayListA.size()));
        for (String str : arrayListA) {
            e(str);
            d(str, "devUserInfoNew");
        }
    }

    private static void c(String str, eah.d dVar) {
        LogUtil.a("WifiDeviceControl", "confirmDeviceUserInfo");
        String strB = b(str);
        List<dnj> allUser = MultiUsersManager.INSTANCE.getAllUser();
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
        Map<String, String> mapD = dVar.d();
        Iterator<dnj> it = allUser.iterator();
        while (it.hasNext()) {
            String strI = it.next().i();
            if (String.valueOf(0).equals(strI)) {
                strI = accountInfo;
            }
            if (mapD.containsKey(strI)) {
                c(strB, strI, mapD.get(strI), str);
            } else {
                LogUtil.j("WifiDeviceControl", "confirmDeviceUserInfo key ", strI, " user is not has");
            }
        }
        EventBus.a(new EventBus.d("device_user_success"));
    }

    private static void c(String str, String str2, String str3, String str4) {
        String strD = d(str, str2, str4);
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return;
        }
        dyg.e(false, "WifiDeviceControl", "uid is ", str2, "value is:", str3);
        SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10000), strD, str3, null);
    }

    private static String d(String str, String str2, String str3) {
        return "wifi_devuserinfo_" + str + str2 + str3;
    }

    public static void d(final String str, final String str2) {
        if (TextUtils.isEmpty(str)) {
            dyg.c(false, "WifiDeviceControl", "devId is null");
            return;
        }
        if (TextUtils.isEmpty(str2)) {
            dyg.c(false, "WifiDeviceControl", "sid is null");
            return;
        }
        WifiDeviceServiceInfoReq wifiDeviceServiceInfoReq = new WifiDeviceServiceInfoReq();
        wifiDeviceServiceInfoReq.setDevId(str);
        wifiDeviceServiceInfoReq.setSid(str2);
        lqo.b(dxw.d()).d(wifiDeviceServiceInfoReq, new ICloudOperationResult<WifiDeviceServiceInfoRsp>() { // from class: ean.5
            @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void operationResult(WifiDeviceServiceInfoRsp wifiDeviceServiceInfoRsp, String str3, boolean z) {
                int iIntValue;
                String resultDesc;
                if (wifiDeviceServiceInfoRsp != null) {
                    LogUtil.d("WifiDeviceControl", "getDeviceUserInfo rsp:", wifiDeviceServiceInfoRsp.toString());
                }
                if (!z) {
                    if (wifiDeviceServiceInfoRsp == null) {
                        iIntValue = Constants.CODE_UNKNOWN_ERROR;
                        resultDesc = "getDeviceUserInfo() occured unknown error";
                    } else {
                        iIntValue = wifiDeviceServiceInfoRsp.getResultCode().intValue();
                        resultDesc = wifiDeviceServiceInfoRsp.getResultDesc();
                    }
                    dyg.d(false, "WifiDeviceControl", "getDeviceUserInfo() errCode = ", Integer.valueOf(iIntValue), ", getDeviceUserInfo() resultDesc:", resultDesc);
                    return;
                }
                if (wifiDeviceServiceInfoRsp != null && wifiDeviceServiceInfoRsp.getDeviceServiceInfo() != null && !wifiDeviceServiceInfoRsp.getDeviceServiceInfo().isEmpty()) {
                    ean.b(str, str2, wifiDeviceServiceInfoRsp);
                } else if ("devUserInfoNew".equals(str2)) {
                    ean.d(str, "devUserInfo");
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(String str, String str2, WifiDeviceServiceInfoRsp wifiDeviceServiceInfoRsp) {
        for (DeviceServiceInfo deviceServiceInfo : wifiDeviceServiceInfoRsp.getDeviceServiceInfo()) {
            String userData = deviceServiceInfo.getUserData();
            String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
            if (!TextUtils.isEmpty(userData)) {
                dyg.a(false, "WifiDeviceControl", "saveDeviceUser dev user info is new Version");
                eah eahVar = new eah();
                eahVar.e(userData);
                eah.d dVarB = eahVar.b(accountInfo);
                if (dVarB != null) {
                    c(str, dVarB);
                } else {
                    if (i(str)) {
                        LogUtil.a("WifiDeviceControl", "saveDeviceUser hagrid device delete local data");
                        d(str);
                        EventBus.a(new EventBus.d("device_user_success"));
                    }
                    dyg.a(false, "WifiDeviceControl", "saveDeviceUser not found UserData for new device");
                }
            } else {
                Map<String, String> data = deviceServiceInfo.getData();
                if (data != null) {
                    dyg.a(false, "WifiDeviceControl", "saveDeviceUser dev user info is old Version");
                    eah eahVar2 = new eah();
                    eahVar2.c(data);
                    eah.d dVarB2 = eahVar2.b(accountInfo);
                    if (dVarB2 != null) {
                        c(str, dVarB2);
                    } else {
                        dyg.a(false, "WifiDeviceControl", "saveDeviceUser not found UserData for old device");
                    }
                } else {
                    if ("devUserInfoNew".equals(str2)) {
                        d(str, "devUserInfo");
                    }
                    dyg.a(false, "WifiDeviceControl", "saveDeviceUser not dev user info");
                }
            }
        }
    }

    public static String b(String str, String str2) {
        if (String.valueOf(0).equals(str2)) {
            str2 = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
        }
        return SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10000), d(b(str), str2, str));
    }

    public static String b(String str) {
        String str2 = "huawei";
        if (!"huawei".equals(f(str))) {
            str2 = "honor";
            if (!"honor".equals(f(str))) {
                if (i(str)) {
                    str2 = "hygride";
                } else {
                    str2 = "otherScale";
                }
            }
        }
        LogUtil.a("WifiDeviceControl", "getScaleType() scaleType:", str2);
        return str2;
    }

    public static void d(String str) {
        Iterator<dnj> it = MultiUsersManager.INSTANCE.getAllUser().iterator();
        while (it.hasNext()) {
            a(str, it.next().i());
        }
    }

    public static void a(String str, String str2) {
        if (String.valueOf(0).equals(str2)) {
            str2 = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
        }
        SharedPreferenceManager.b(BaseApplication.getContext(), String.valueOf(10000), d(b(str), str2, str));
    }

    public static String j(String str) {
        if (TextUtils.isEmpty(str)) {
            dyg.a(false, "WifiDeviceControl", "devUserInfo is null");
            return null;
        }
        String[] strArrSplit = str.split("\\|");
        if (strArrSplit.length >= 4) {
            return strArrSplit[2];
        }
        return null;
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            dyg.a(false, "WifiDeviceControl", "devUserInfo is null");
            return null;
        }
        String[] strArrSplit = str.split("\\|");
        if (strArrSplit.length >= 4) {
            return strArrSplit[3];
        }
        return null;
    }

    public static void c(Context context, String str, View.OnClickListener onClickListener, View.OnClickListener onClickListener2) {
        if (context == null) {
            dyg.a(false, "WifiDeviceControl", "showNoWiFiDeviceDialog context is null");
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            dyg.a(false, "WifiDeviceControl", "showNoWiFiDeviceDialog deviceId is null");
            k(str);
        }
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(context);
        builder.b(R.string.IDS_device_wifi_device_does_not_exist);
        builder.a(R.string.IDS_settings_button_cancal, onClickListener);
        builder.c(R.string.IDS_device_bind_device, onClickListener2);
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builder.c();
        noTitleCustomAlertDialogC.setCancelable(false);
        noTitleCustomAlertDialogC.show();
    }

    public static String f(String str) throws Throwable {
        String strG = ecf.g(str);
        if (TextUtils.isEmpty(strG)) {
            dyg.a(false, "WifiDeviceControl", "get productId error");
            return null;
        }
        if (strG.equals("e4b0b1d5-2003-4d88-8b5f-c4f64542040b")) {
            return "huawei";
        }
        if (strG.equals("a8ba095d-4123-43c4-a30a-0240011c58de")) {
            return "honor";
        }
        dyg.d(false, "WifiDeviceControl", "isHuaweiOrHonorScale default");
        return null;
    }

    public static boolean i(String str) throws Throwable {
        String strG = ecf.g(str);
        if (TextUtils.isEmpty(strG)) {
            LogUtil.a("WifiDeviceControl", "get productId error");
            return false;
        }
        return dxm.y(strG);
    }

    public static void a(final String str, final CommBaseCallbackInterface commBaseCallbackInterface) {
        if (commBaseCallbackInterface == null) {
            dyg.a(false, "WifiDeviceControl", "getDeviceSubUser callback is null");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            dyg.a(false, "WifiDeviceControl", "getDeviceSubUser deviceId error");
            commBaseCallbackInterface.onResult(-1, "", null);
        } else {
            dyg.a(false, "WifiDeviceControl", "getDeviceSubUser deviceId:", dyg.b(str));
            WifiDeviceGetAuthorizeSubUserReq wifiDeviceGetAuthorizeSubUserReq = new WifiDeviceGetAuthorizeSubUserReq();
            wifiDeviceGetAuthorizeSubUserReq.setDevId(str);
            lqo.b(dxw.d()).b(wifiDeviceGetAuthorizeSubUserReq, new ICloudOperationResult<WifiDeviceGetAuthorizeSubUserRsp>() { // from class: ean.6
                @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public void operationResult(WifiDeviceGetAuthorizeSubUserRsp wifiDeviceGetAuthorizeSubUserRsp, String str2, boolean z) {
                    ean.c(wifiDeviceGetAuthorizeSubUserRsp, z, str, commBaseCallbackInterface);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(WifiDeviceGetAuthorizeSubUserRsp wifiDeviceGetAuthorizeSubUserRsp, boolean z, String str, CommBaseCallbackInterface commBaseCallbackInterface) {
        int iIntValue;
        String resultDesc;
        if (z) {
            eal ealVar = new eal();
            ealVar.c(str);
            if (wifiDeviceGetAuthorizeSubUserRsp != null) {
                List<AuthorizeSubUserInfo> authorizeSubUserList = wifiDeviceGetAuthorizeSubUserRsp.getAuthorizeSubUserList();
                if (authorizeSubUserList != null && authorizeSubUserList.size() > 0) {
                    for (AuthorizeSubUserInfo authorizeSubUserInfo : authorizeSubUserList) {
                        ealVar.e(authorizeSubUserInfo.getSubHuid(), authorizeSubUserInfo.getNickName(), authorizeSubUserInfo.getUserAccount());
                    }
                }
                if (ealVar.e() != null && ealVar.e().size() > 0) {
                    ecf.c(ealVar);
                } else {
                    ecf.b(str);
                }
            } else {
                ecf.b(str);
                dyg.d(false, "WifiDeviceControl", "getDeviceSubUser() get Sub User is null");
            }
            commBaseCallbackInterface.onResult(0, "", ealVar);
            return;
        }
        if (wifiDeviceGetAuthorizeSubUserRsp == null) {
            iIntValue = Constants.CODE_UNKNOWN_ERROR;
            resultDesc = "getDeviceSubUser() occured unknown error ";
        } else {
            iIntValue = wifiDeviceGetAuthorizeSubUserRsp.getResultCode().intValue();
            resultDesc = wifiDeviceGetAuthorizeSubUserRsp.getResultDesc();
        }
        commBaseCallbackInterface.onResult(iIntValue, resultDesc, null);
        dyg.d(false, "WifiDeviceControl", "getDeviceSubUser() errCode = ", Integer.valueOf(iIntValue), ", getDeviceSubUser() resultDesc:", resultDesc);
    }

    public static void e(String str) {
        dyg.a(false, "WifiDeviceControl", "getMultiAccountAbility");
        String str2 = "support_multi_account_" + str;
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), "wifi_weight_device", str2);
        String strE2 = SharedPreferenceManager.e(BaseApplication.getContext(), "wifi_weight_device", m(str) + "_" + str2);
        if (TextUtils.isEmpty(strE) || "-1".equals(strE) || TextUtils.isEmpty(strE2)) {
            dyg.a(false, "WifiDeviceControl", "getMultiAccountAbility start");
            c(str, (CommBaseCallbackInterface) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(WifiDeviceServiceInfoRsp wifiDeviceServiceInfoRsp, String str, String str2, CommBaseCallbackInterface commBaseCallbackInterface) {
        Iterator<DeviceServiceInfo> it = wifiDeviceServiceInfoRsp.getDeviceServiceInfo().iterator();
        while (it.hasNext()) {
            Map<String, String> data = it.next().getData();
            if (data != null) {
                SharedPreferenceManager.e(BaseApplication.getContext(), "wifi_weight_device", str2, data.get("multiAccount"), null);
                SharedPreferenceManager.e(BaseApplication.getContext(), "wifi_weight_device", m(str) + "_" + str2, peh.c(data), null);
                if (commBaseCallbackInterface != null) {
                    commBaseCallbackInterface.onResult(0, "", null);
                }
            }
        }
    }

    public static void c(final String str, final CommBaseCallbackInterface commBaseCallbackInterface) {
        dyg.a(false, "WifiDeviceControl", "getMultiAccountCapability");
        if (TextUtils.isEmpty(str)) {
            dyg.c(false, "WifiDeviceControl", "getMultiAccountCapability deviceId is null");
            return;
        }
        WifiDeviceServiceInfoReq wifiDeviceServiceInfoReq = new WifiDeviceServiceInfoReq();
        wifiDeviceServiceInfoReq.setDevId(str);
        wifiDeviceServiceInfoReq.setSid("devCapabilitySet");
        final String str2 = "support_multi_account_" + str;
        lqo.b(BaseApplication.getContext()).d(wifiDeviceServiceInfoReq, new ICloudOperationResult<WifiDeviceServiceInfoRsp>() { // from class: ean.8
            @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void operationResult(WifiDeviceServiceInfoRsp wifiDeviceServiceInfoRsp, String str3, boolean z) {
                if (!z) {
                    dyg.d(false, "WifiDeviceControl", "getMultiAccountCapability status fail. text: ", str3, ", res: ", wifiDeviceServiceInfoRsp);
                    ean.a(wifiDeviceServiceInfoRsp, commBaseCallbackInterface, str2);
                    return;
                }
                if (wifiDeviceServiceInfoRsp == null || wifiDeviceServiceInfoRsp.getDeviceServiceInfo() == null || wifiDeviceServiceInfoRsp.getDeviceServiceInfo().isEmpty()) {
                    dyg.a(false, "WifiDeviceControl", "getMultiAccountCapability info is empty.");
                    ean.a(wifiDeviceServiceInfoRsp, commBaseCallbackInterface, str2);
                } else {
                    dyg.c(false, "WifiDeviceControl", "getMultiAccountCapability isSuccess");
                    ean.c(wifiDeviceServiceInfoRsp, str, str2, commBaseCallbackInterface);
                }
                dyg.a(false, "WifiDeviceControl", "getMultiAccountCapability res: ", wifiDeviceServiceInfoRsp, ", text: ", str3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(WifiDeviceServiceInfoRsp wifiDeviceServiceInfoRsp, CommBaseCallbackInterface commBaseCallbackInterface, String str) {
        int iIntValue;
        String resultDesc;
        SharedPreferenceManager.e(BaseApplication.getContext(), "wifi_weight_device", str, "-1", null);
        if (wifiDeviceServiceInfoRsp == null) {
            iIntValue = Constants.CODE_UNKNOWN_ERROR;
            resultDesc = "handleMultiAccountError() occured unknown error";
        } else {
            iIntValue = wifiDeviceServiceInfoRsp.getResultCode().intValue();
            resultDesc = wifiDeviceServiceInfoRsp.getResultDesc();
        }
        if (commBaseCallbackInterface != null) {
            commBaseCallbackInterface.onResult(iIntValue, resultDesc, null);
        }
    }

    public static void d(int i) {
        String str;
        dyg.a(false, "WifiDeviceControl", "sendEventToKaKa");
        if (i == 82 || i == 85) {
            str = "e4b0b1d5-2003-4d88-8b5f-c4f64542040b";
        } else if (i == 84 || i == 86) {
            str = "a8ba095d-4123-43c4-a30a-0240011c58de";
        } else {
            dyg.c(false, "WifiDeviceControl", "sendEventToKaKa productId is error");
            return;
        }
        elh elhVarD = ResourceManager.c().d(str);
        if (elhVarD == null || elhVarD.s().size() <= 0) {
            dyg.c(false, "WifiDeviceControl", "sendEventToKaKa productInfo is empty");
            return;
        }
        String strD = elhVarD.l().d();
        dyg.e(false, "WifiDeviceControl", "deviceName is ", strD);
        HashMap map = new HashMap(16);
        map.put("device_name", strD);
        map.put(DeviceCategoryFragment.DEVICE_TYPE, elhVarD.m().name());
        map.put("measure_time", new SimpleDateFormat(HwDrmConstant.TIME_FORMAT).format(new Date(System.currentTimeMillis())));
        ddq.d().setEvent(BaseApplication.getContext(), String.valueOf(KakaConstants.TASK_MEASURE_TODAY_WEIGHT), map);
    }

    public static void c(Context context, eby ebyVar, elh elhVar) {
        dyg.a(false, "WifiDeviceControl", "sendBindDeviceEventToKaKa.");
        if (context == null || ebyVar == null) {
            dyg.c(false, "WifiDeviceControl", "sendBindDeviceEventToKaKa context or wifiDevice is null.");
            return;
        }
        if (elhVar == null) {
            dyg.c(false, "WifiDeviceControl", "sendBindDeviceEventToKaKa productInfo is null.");
            return;
        }
        if ("sent".equals(SharedPreferenceManager.e(context, String.valueOf(10000), "wife_device_send_event_to_kaka_" + elhVar.h()))) {
            dyg.a(false, "WifiDeviceControl", "sendBindDeviceEventToKaKa have send kaka info.");
            return;
        }
        HashMap map = new HashMap(16);
        map.put("macAddress", erh.d(ebyVar.getAddress()));
        map.put("device_name", elhVar.l().d());
        map.put(DeviceCategoryFragment.DEVICE_TYPE, elhVar.m());
        map.put("deviceId", elhVar.h());
        map.put("productId", elhVar.t());
        ddq.d().setEvent(BaseApplication.getContext(), String.valueOf(1500), map);
        SharedPreferenceManager.e(context, String.valueOf(10000), "wife_device_send_event_to_kaka_" + elhVar.h(), "sent", null);
    }

    public static void c(String str, String str2, ICloudOperationResult iCloudOperationResult) {
        if (TextUtils.isEmpty(str2)) {
            LogUtil.j("WifiDeviceControl", "setHagridAutoUpgrade autoUpgrade is null");
            return;
        }
        if (!"1".equals(str2) && !"0".equals(str2)) {
            LogUtil.j("WifiDeviceControl", "setHagridAutoUpgrade autoUpgrade is error,", str2);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("WifiDeviceControl", "setHagridAutoUpgrade deviceId is null");
            ArrayList<eby> arrayListA = ecf.a();
            if (njy.e(arrayListA)) {
                LogUtil.j("WifiDeviceControl", "setHagridAutoUpgrade allWifiDevices is null");
                return;
            }
            LogUtil.a("WifiDeviceControl", "setHagridAutoUpgrade devices size:", Integer.valueOf(arrayListA.size()));
            for (eby ebyVar : arrayListA) {
                if (dxm.y(ebyVar.getProductId())) {
                    String strE = ebyVar.e();
                    LogUtil.a("WifiDeviceControl", "setHagridAutoUpgrade wifiDeviceId:", dyg.b(strE));
                    b(strE, str2, iCloudOperationResult);
                }
            }
            return;
        }
        LogUtil.a("WifiDeviceControl", "setHagridAutoUpgrade autoUpgrade:", str2);
        b(str, str2, iCloudOperationResult);
    }

    private static void b(String str, String str2, ICloudOperationResult iCloudOperationResult) {
        LogUtil.a("WifiDeviceControl", "sendHagrideAutoUpgtadeStatus autoUpgrade", str2);
        DeviceServiceInfo deviceServiceInfo = new DeviceServiceInfo();
        HashMap map = new HashMap(16);
        map.put("upgrade_auto", str2);
        deviceServiceInfo.setData(map);
        deviceServiceInfo.setSid("setDevParam");
        ArrayList arrayList = new ArrayList(16);
        arrayList.add(deviceServiceInfo);
        WifiDeviceControlDataModelReq wifiDeviceControlDataModelReq = new WifiDeviceControlDataModelReq();
        wifiDeviceControlDataModelReq.setDeviceServiceInfo(arrayList);
        wifiDeviceControlDataModelReq.setDevId(str);
        lqo.b(BaseApplication.getContext()).e(wifiDeviceControlDataModelReq, (ICloudOperationResult<CloudCommonReponse>) iCloudOperationResult);
    }

    public static void a(String str, String str2, boolean z) {
        if (!"1".equals(str2) && !"0".equals(str2)) {
            LogUtil.j("WifiDeviceControl", "setHagridBindSuccessParameter autoUpgrade is error,", str2);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("WifiDeviceControl", "setHagridBindSuccessParameter deviceId is null");
            ArrayList<eby> arrayListA = ecf.a();
            if (njy.e(arrayListA)) {
                LogUtil.j("WifiDeviceControl", "setHagridBindSuccessParameter allWifiDevices is null");
                return;
            }
            LogUtil.a("WifiDeviceControl", "setHagridBindSuccessParameter devices size:", Integer.valueOf(arrayListA.size()));
            for (eby ebyVar : arrayListA) {
                if (dxm.y(ebyVar.getProductId())) {
                    String strE = ebyVar.e();
                    LogUtil.a("WifiDeviceControl", "setHagridBindSuccessParameter wifiDeviceId:", dyg.b(strE));
                    b(strE, str2, z);
                }
            }
            return;
        }
        b(str, str2, z);
    }

    private static void b(final String str, final String str2, boolean z) {
        String str3;
        LogUtil.a("WifiDeviceControl", "sendHagridBindSuccessParameter autoUpgradeStatus:", str2, "|isOpen:", Boolean.valueOf(z));
        if (z) {
            str3 = "1";
        } else {
            str3 = "0";
        }
        DeviceServiceInfo deviceServiceInfo = new DeviceServiceInfo();
        HashMap map = new HashMap(16);
        map.put("dft", str3);
        map.put("upgrade_auto", str2);
        deviceServiceInfo.setData(map);
        deviceServiceInfo.setSid("setDevParam");
        ArrayList arrayList = new ArrayList(16);
        arrayList.add(deviceServiceInfo);
        WifiDeviceControlDataModelReq wifiDeviceControlDataModelReq = new WifiDeviceControlDataModelReq();
        wifiDeviceControlDataModelReq.setDeviceServiceInfo(arrayList);
        wifiDeviceControlDataModelReq.setDevId(str);
        lqo.b(BaseApplication.getContext()).e(wifiDeviceControlDataModelReq, new ICloudOperationResult<CloudCommonReponse>() { // from class: ean.9
            @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void operationResult(CloudCommonReponse cloudCommonReponse, String str4, boolean z2) {
                if (z2) {
                    eas.b(str, str2);
                    LogUtil.a("WifiDeviceControl", "sendHagridBindSuccessParameter success ");
                } else {
                    if (cloudCommonReponse == null) {
                        dyg.d(false, "WifiDeviceControl", "sendHagridBindSuccessParameter cloudCommonReponse is null");
                        return;
                    }
                    Integer resultCode = cloudCommonReponse.getResultCode();
                    resultCode.intValue();
                    dyg.d(false, "WifiDeviceControl", "sendHagridBindSuccessParameter errorCode:", resultCode);
                }
            }
        });
    }

    public static void a(String str, ICloudOperationResult iCloudOperationResult) {
        String url = GRSManager.c(BaseApplication.getContext()).getUrl("ROOT");
        if (TextUtils.isEmpty(url)) {
            LogUtil.a("WifiDeviceControl", "[grs][syncGrsUrl] grsUrl is empty.ignore");
            return;
        }
        LogUtil.a("WifiDeviceControl", "[grs][syncGrsUrl] begin syncGrsUrl ", str, url);
        DeviceServiceInfo deviceServiceInfo = new DeviceServiceInfo();
        HashMap map = new HashMap(16);
        map.put("set_ota_url", url);
        deviceServiceInfo.setData(map);
        deviceServiceInfo.setSid("setDevParam");
        ArrayList arrayList = new ArrayList(16);
        arrayList.add(deviceServiceInfo);
        WifiDeviceControlDataModelReq wifiDeviceControlDataModelReq = new WifiDeviceControlDataModelReq();
        wifiDeviceControlDataModelReq.setDeviceServiceInfo(arrayList);
        wifiDeviceControlDataModelReq.setDevId(str);
        lqo.b(BaseApplication.getContext()).e(wifiDeviceControlDataModelReq, (ICloudOperationResult<CloudCommonReponse>) iCloudOperationResult);
    }

    public static void e(boolean z) {
        String str;
        dyg.a(false, "WifiDeviceControl", "setUserCollectionSwitch isOpen:", Boolean.valueOf(z));
        ArrayList<eby> arrayListA = ecf.a();
        if (njy.e(arrayListA)) {
            LogUtil.j("WifiDeviceControl", "setUserCollectionSwitch exit: no wifi device connected!");
            return;
        }
        LogUtil.a("WifiDeviceControl", "setUserCollectionSwitch devices size:", Integer.valueOf(arrayListA.size()));
        for (eby ebyVar : arrayListA) {
            if (!h(ebyVar.getProductId()) && ebyVar.a().m() == 1) {
                if (z) {
                    str = "1";
                } else {
                    str = "0";
                }
                g(ebyVar.e(), str);
            }
        }
    }

    private static void g(String str, String str2) {
        LogUtil.j("WifiDeviceControl", "sendUserCollectionSwitch status:", str2);
        DeviceServiceInfo deviceServiceInfo = new DeviceServiceInfo();
        HashMap map = new HashMap(16);
        map.put("dft", str2);
        deviceServiceInfo.setData(map);
        deviceServiceInfo.setSid("setDevParam");
        ArrayList arrayList = new ArrayList(16);
        arrayList.add(deviceServiceInfo);
        WifiDeviceControlDataModelReq wifiDeviceControlDataModelReq = new WifiDeviceControlDataModelReq();
        wifiDeviceControlDataModelReq.setDeviceServiceInfo(arrayList);
        wifiDeviceControlDataModelReq.setDevId(str);
        lqo.b(BaseApplication.getContext()).e(wifiDeviceControlDataModelReq, new ICloudOperationResult<CloudCommonReponse>() { // from class: ean.10
            @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public void operationResult(CloudCommonReponse cloudCommonReponse, String str3, boolean z) {
                if (z) {
                    LogUtil.a("WifiDeviceControl", "sendUserCollectionSwitch success ");
                } else if (cloudCommonReponse != null) {
                    Integer resultCode = cloudCommonReponse.getResultCode();
                    resultCode.intValue();
                    dyg.d(false, "WifiDeviceControl", "sendUserCollectionSwitch errorCode =", resultCode);
                }
            }
        });
    }

    public static boolean h(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return "a8ba095d-4123-43c4-a30a-0240011c58de".equals(str) || "e4b0b1d5-2003-4d88-8b5f-c4f64542040b".equals(str);
    }

    public static void e(String str, ICloudOperationResult iCloudOperationResult) {
        dyg.a(false, "WifiDeviceControl", "getHagridDeviceUnit in");
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("WifiDeviceControl", "getHagridDeviceUnit deviceId is null");
            return;
        }
        WifiDeviceServiceInfoReq wifiDeviceServiceInfoReq = new WifiDeviceServiceInfoReq();
        wifiDeviceServiceInfoReq.setDevId(str);
        wifiDeviceServiceInfoReq.setSid("devCapabilitySet");
        lqo.b(BaseApplication.getContext()).d(wifiDeviceServiceInfoReq, (ICloudOperationResult<WifiDeviceServiceInfoRsp>) iCloudOperationResult);
    }

    public static void g(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.e("WifiDeviceControl", "unBindDevice deviceid is empty");
            return;
        }
        WifiDeviceUnbindReq wifiDeviceUnbindReq = new WifiDeviceUnbindReq();
        wifiDeviceUnbindReq.setDevId(str);
        LogUtil.a("WifiDeviceControl", "unBindDevice :", dyg.b(str));
        lqo.b(dxw.d()).e(wifiDeviceUnbindReq, new ICloudOperationResult<CloudCommonReponse>() { // from class: ean.7
            @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void operationResult(CloudCommonReponse cloudCommonReponse, String str2, boolean z) {
                int iIntValue;
                String resultDesc;
                LogUtil.a("WifiDeviceControl", "unBindDevice :", Boolean.valueOf(z));
                if (z) {
                    return;
                }
                if (cloudCommonReponse == null) {
                    iIntValue = Constants.CODE_UNKNOWN_ERROR;
                    resultDesc = "unBindDevice() occured unknown error";
                } else {
                    iIntValue = cloudCommonReponse.getResultCode().intValue();
                    resultDesc = cloudCommonReponse.getResultDesc();
                }
                LogUtil.j("WifiDeviceControl", " unBindDevice error:", Integer.valueOf(iIntValue), ", unBindDevice() resultDesc:", resultDesc);
            }
        });
    }

    public static void c(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("WifiDeviceControl", "unBindDevice deviceid is empty");
            return;
        }
        WifiDeviceExitAuthorizeSubUserReq wifiDeviceExitAuthorizeSubUserReq = new WifiDeviceExitAuthorizeSubUserReq();
        wifiDeviceExitAuthorizeSubUserReq.setDevId(str);
        LogUtil.a("WifiDeviceControl", "exitWifiDeviceAuthorizeSubUser :", dyg.b(str));
        lqo.b(dxw.d()).b(wifiDeviceExitAuthorizeSubUserReq, new ICloudOperationResult<CloudCommonReponse>() { // from class: ean.1
            @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public void operationResult(CloudCommonReponse cloudCommonReponse, String str2, boolean z) {
                int iIntValue;
                String resultDesc;
                LogUtil.a("WifiDeviceControl", "exitWifiDeviceAuthorizeSubUser :", Boolean.valueOf(z));
                if (z) {
                    return;
                }
                if (cloudCommonReponse == null) {
                    iIntValue = Constants.CODE_UNKNOWN_ERROR;
                    resultDesc = "exitWifiDeviceAuthorizeSubUser() occured unknown error";
                } else {
                    iIntValue = cloudCommonReponse.getResultCode().intValue();
                    resultDesc = cloudCommonReponse.getResultDesc();
                }
                LogUtil.j("WifiDeviceControl", " unBindDevice error:", Integer.valueOf(iIntValue), ", exitWifiDeviceAuthorizeSubUser() resultDesc:", resultDesc);
            }
        });
    }

    public static int e(String str, int i) {
        LogUtil.a("WifiDeviceControl", "enter getSupportDeviceCapabilityByValue");
        if (TextUtils.isEmpty(str) || i < 0) {
            LogUtil.j("WifiDeviceControl", "address or capabilityValue of device is error");
            return -100;
        }
        String strL = l(str);
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), "wifi_weight_device", m(strL) + "_support_multi_account_" + strL);
        if (TextUtils.isEmpty(strE)) {
            LogUtil.j("WifiDeviceControl", "the capability of weight fat in sp is empty");
            return -100;
        }
        Map<Integer, String> mapA = a(peh.b(strE));
        if (mapA.size() == 0) {
            LogUtil.j("WifiDeviceControl", "the capability value map is empty");
            return -100;
        }
        String str2 = mapA.get(Integer.valueOf(i));
        if (TextUtils.isEmpty(str2)) {
            LogUtil.j("WifiDeviceControl", "the current capability value is empty");
            return -100;
        }
        try {
            return Integer.parseInt(str2);
        } catch (NumberFormatException unused) {
            LogUtil.e("WifiDeviceControl", "isSupportDeviceCapabilityByValue NumberFormatException");
            return -100;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:32:0x0084  */
    private static Map<Integer, String> a(Map<String, String> map) {
        byte b2;
        LogUtil.a("WifiDeviceControl", "enter getCapabilityValueMap");
        HashMap map2 = new HashMap(16);
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            key.hashCode();
            switch (key) {
                case "supportSmoothimpedance":
                    b2 = 0;
                    break;
                case "supportHwBtOTA":
                    b2 = 1;
                    break;
                case "supportMultiFreqMeas":
                    b2 = 2;
                    break;
                case "support8electrodeMeasOnly":
                    b2 = 3;
                    break;
                case "supportEncryptJSON":
                    b2 = 4;
                    break;
                case "supportYouthMeas":
                    b2 = 5;
                    break;
                default:
                    b2 = -1;
                    break;
            }
            if (b2 == 0) {
                map2.put(43, entry.getValue());
            } else if (b2 == 1) {
                map2.put(19, entry.getValue());
            } else if (b2 == 2) {
                map2.put(18, entry.getValue());
            } else if (b2 == 3) {
                map2.put(39, entry.getValue());
            } else if (b2 == 4) {
                map2.put(24, entry.getValue());
            } else if (b2 == 5) {
                map2.put(20, entry.getValue());
            } else {
                LogUtil.j("WifiDeviceControl", "getCapabilityValueMap getKey is empty");
            }
        }
        return map2;
    }

    private static String l(String str) {
        LogUtil.a("WifiDeviceControl", "enter getWeightFatDeviceIdByAddress");
        for (eby ebyVar : drw.e().d()) {
            if (str.equals(dxm.f(ebyVar.getSerialNumber()))) {
                return ebyVar.e();
            }
        }
        return "";
    }

    private static String m(String str) {
        LogUtil.a("WifiDeviceControl", "enter getDeviceSoftwareVersionByAddress");
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("WifiDeviceControl", "getDeviceSoftwareVersionByDeviceId deviceId is empty");
            return "";
        }
        for (eby ebyVar : drw.e().d()) {
            if (str.equals(ebyVar.e())) {
                LogUtil.a("WifiDeviceControl", "deviceId equals tempDeviceId");
                return ebyVar.a().k();
            }
        }
        return "";
    }
}
