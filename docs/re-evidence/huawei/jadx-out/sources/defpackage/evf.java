package defpackage;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.gms.wearable.WearableStatusCodes;
import com.huawei.haf.common.os.SystemInfo;
import com.huawei.hihealth.HiDeviceInfo;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hms.framework.common.ExceptionCode;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.utils.AppTypeUtils;
import com.huawei.operation.utils.CloudParamKeys;
import com.huawei.operation.utils.Constants;
import com.huawei.operation.utils.PhoneInfoUtils;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import com.huawei.thirdloginbasemodule.ThirdLoginDataStorageUtil;
import com.huawei.trade.datatype.DeviceBenefitQueryParam;
import health.compact.a.CommonUtil;
import health.compact.a.EnvironmentInfo;
import health.compact.a.GRSManager;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes28.dex */
class evf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Set<Integer> f33511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Map<Integer, Long> f33512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static long f33513c;
    private static final boolean d;
    private static String e;

    evf() {
    }

    static {
        HashSet hashSet = new HashSet();
        f33511a = hashSet;
        d = false;
        hashSet.add(4126);
        hashSet.add(Integer.valueOf(WearableStatusCodes.WIFI_CREDENTIAL_SYNC_NO_CREDENTIAL_FETCHED));
        hashSet.add(4031);
        hashSet.add(51500);
    }

    static String a(List<Integer> list, String str, int i, boolean z) {
        d(list, i);
        String strD = d(list, z);
        if (strD == null) {
            ReleaseLogUtil.c("MarketingRequestUtil", "doRequestSync failed, requestUrl is null!!!");
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        HashMap map = new HashMap(16);
        map.put("positionIds", list);
        map.put("ts", Long.valueOf(System.currentTimeMillis()));
        map.put("source", 1);
        map.putAll(a(list, str));
        String str2 = (String) oet.d().e(strD, d(), HiJsonUtil.d(map), String.class);
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        LogUtil.b("MarketingRequestUtil", "doRequestSync(" + list + ", page:" + i + ") finished, time cost: " + (jCurrentTimeMillis2 - jCurrentTimeMillis) + ", length: " + (str2 == null ? 0 : str2.length()));
        return str2;
    }

    private static String d(List<Integer> list, boolean z) {
        String strE;
        if (list == null || list.isEmpty()) {
            LogUtil.d("MarketingRequestUtil", "positionIdList error, instance: " + list);
            return null;
        }
        if (z) {
            strE = GRSManager.c(BaseApplication.getContext()).getUrl("marketingGateWayUrl");
        } else {
            strE = e();
        }
        if (TextUtils.isEmpty(strE)) {
            return null;
        }
        StringBuilder sb = new StringBuilder(strE);
        if (LoginInit.getInstance(BaseApplication.getContext()).isBrowseMode()) {
            if (z) {
                sb.append("/gateway/app/v1/marketing/resourcesAnon");
                return sb.toString();
            }
            sb.append("/positionservice/v1/resourcesAnon");
        } else {
            if (z) {
                sb.append("/gateway/app/v1/marketing/resources");
                return sb.toString();
            }
            sb.append("/positionservice/v1/resources");
        }
        return sb.toString();
    }

    private static String e() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - f33513c > 300000) {
            e = GRSManager.c(BaseApplication.getContext()).getUrl("marketingUrl");
            LogUtil.b("MarketingRequestUtil", "marketing url updated, time cost: " + (System.currentTimeMillis() - jCurrentTimeMillis) + ", url: " + e);
            if (!TextUtils.isEmpty(e)) {
                f33513c = jCurrentTimeMillis;
            }
        }
        return e;
    }

    private static HashMap<String, String> d() {
        Context context = BaseApplication.getContext();
        HashMap<String, String> map = new HashMap<>(16);
        if (!LoginInit.getInstance(context).isBrowseMode()) {
            map.put("x-huid", LoginInit.getInstance(context).getAccountInfo(1011));
            map.put(CloudParamKeys.X_TOKEN_TYPE, String.valueOf(ThirdLoginDataStorageUtil.getTokenTypeValue()));
            map.put(CloudParamKeys.X_TOKEN, LoginInit.getInstance(context).getAccountInfo(1008));
        }
        map.put("Content-type", "application/json");
        map.put(CloudParamKeys.X_CLIENT_VERSION, CommonUtil.c(context));
        map.put(CloudParamKeys.X_SITE_ID, LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1009));
        map.put(CloudParamKeys.X_APP_ID, BaseApplication.getAppPackage());
        String deviceId = LoginInit.getInstance(context).getDeviceId();
        if (TextUtils.isEmpty(deviceId)) {
            deviceId = "clientnull";
        }
        map.put(CloudParamKeys.X_DEVICE_ID, deviceId);
        map.put(CloudParamKeys.X_DEVICE_TYPE, LoginInit.getInstance(BaseApplication.getContext()).getDeviceType());
        map.put(CloudParamKeys.X_TS, String.valueOf(System.currentTimeMillis()));
        map.put(CloudParamKeys.X_APP_TYPE, String.valueOf(AppTypeUtils.getAppType()));
        map.put("x-caller-trace-id", String.valueOf(System.currentTimeMillis()) + Math.random());
        return map;
    }

    private static HashMap<String, String> a(List<Integer> list, String str) {
        Context context = BaseApplication.getContext();
        HashMap<String, String> map = new HashMap<>(16);
        map.put(CloudParamKeys.CLIENT_TYPE, a());
        map.put("clientVersion", e(context));
        map.put("language", pjn.b(null));
        map.put("countryCode", LoginInit.getInstance(context).getAccountInfo(1010));
        d(list, map, str);
        LogUtil.b("MarketingRequestUtil", "getCommonParams params: ", map);
        return map;
    }

    private static void d(List<Integer> list, HashMap<String, String> map, String str) {
        HashMap map2;
        if (map == null) {
            LogUtil.e("MarketingRequestUtil", "getExtendParam paramsMap is null");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            map2 = null;
        } else {
            map2 = (HashMap) HiJsonUtil.d(str, HashMap.class);
            LogUtil.b("MarketingRequestUtil", "getCommonParams extendParam: ", str);
        }
        if (map2 == null) {
            map2 = new HashMap(16);
        }
        map2.put(ParsedFieldTag.KAKA_TASK_LABLE_MATCH, new JSONObject(b()).toString());
        String strC = c();
        if (!TextUtils.isEmpty(strC)) {
            map2.put("common", strC);
        }
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            if (f33511a.contains(it.next())) {
                exu exuVarD = fam.d().d((String) null);
                HashMap map3 = new HashMap(1);
                map3.put("aiaudio", HiJsonUtil.d(fam.d().b().getBody(exuVarD)));
                map2.put("aiaudio", HiJsonUtil.d(map3));
                break;
            }
        }
        if (map2.isEmpty()) {
            LogUtil.e("MarketingRequestUtil", "getExtendParam extendParamMap is empty");
        } else {
            map.put("extendMap", new JSONObject(map2).toString());
        }
    }

    private static Map<String, String> b() {
        HashMap map = new HashMap();
        String terminalMarketingName = PhoneInfoUtils.getTerminalMarketingName();
        map.put("manufacture", new JSONArray((Collection) Collections.singletonList(Build.MANUFACTURER)).toString());
        map.put(Constants.MARKET_NAME, new JSONArray((Collection) Collections.singletonList(terminalMarketingName)).toString());
        map.put(HiDeviceInfo.MARKET_CODE_KEY, new JSONArray((Collection) Collections.singletonList(Build.MODEL)).toString());
        return map;
    }

    private static String c() {
        LogUtil.b("MarketingRequestUtil", "getCurDeviceInfo start");
        List<DeviceBenefitQueryParam> listE = qhu.e("MarketingRequestUtil", DeviceBenefitQueryParam.DeviceBenefitType.DEVICE_BENEFIT_TYPE_ALL);
        if (njy.e(listE)) {
            LogUtil.e("MarketingRequestUtil", "getCurDeviceInfo is empty ");
            return "";
        }
        DeviceBenefitQueryParam deviceBenefitQueryParam = listE.get(0);
        if (deviceBenefitQueryParam == null) {
            LogUtil.e("MarketingRequestUtil", "curDeviceParam is empty ");
            return "";
        }
        HashMap map = new HashMap(4);
        map.put("deviceType", deviceBenefitQueryParam.getDeviceType());
        String deviceSn = deviceBenefitQueryParam.getDeviceSn();
        if (!TextUtils.isEmpty(deviceSn)) {
            map.put("deviceSN", deviceSn);
        }
        int deviceCategory = deviceBenefitQueryParam.getDeviceCategory();
        if (deviceCategory != 0) {
            map.put("deviceCategory", String.valueOf(deviceCategory));
        }
        map.put("snType", String.valueOf(DeviceBenefitQueryParam.DeviceSnType.DEVICE_SN_TYPE_SN.getSnType()));
        LogUtil.b("MarketingRequestUtil", "getCurDeviceInfo end");
        return new JSONObject(map).toString();
    }

    private static String e(Context context) {
        String strA = CommonUtil.a(context);
        return strA.contains(com.huawei.openalliance.ad.constant.Constants.LINK) ? strA.substring(0, strA.indexOf(com.huawei.openalliance.ad.constant.Constants.LINK)) : strA;
    }

    private static String a() {
        if (EnvironmentInfo.m()) {
            LogUtil.b("MarketingRequestUtil", "getClientType is mobile app engine");
            return "1";
        }
        if (qrs.ah(BaseApplication.getContext())) {
            return "5";
        }
        if (SystemInfo.d()) {
            return "1";
        }
        if (SystemInfo.c()) {
            return SystemInfo.j() ? "2" : "1";
        }
        return "3";
    }

    private static void d(List<Integer> list, int i) {
        if (d) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = it.next().intValue() + (ExceptionCode.CRASH_EXCEPTION * i);
                if (f33512b.containsKey(Integer.valueOf(iIntValue)) && f33512b.get(Integer.valueOf(iIntValue)).longValue() - jCurrentTimeMillis < 60000) {
                    LogUtil.e("MarketingRequestUtil", "request same data too often!!!, id: " + iIntValue);
                }
                f33512b.put(Integer.valueOf(iIntValue), Long.valueOf(jCurrentTimeMillis));
            }
        }
    }
}
