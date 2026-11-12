package defpackage;

import android.os.Build;
import android.text.TextUtils;
import com.google.gson.JsonSyntaxException;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.utils.AppTypeUtils;
import com.huawei.operation.utils.CloudParamKeys;
import com.huawei.operation.utils.Constants;
import com.huawei.pluginachievement.manager.db.IAchieveDBMgr;
import com.huawei.pluginachievement.report.bean.H5ResponseData;
import com.huawei.thirdloginbasemodule.ThirdLoginDataStorageUtil;
import health.compact.a.CommonUtil;
import health.compact.a.HiDateUtil;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public class oxb {
    public static H5ResponseData e(String str) {
        LogUtil.d("PLGACHIEVE_H5CalRule", "getH5Params str:", str);
        try {
            return (H5ResponseData) HiJsonUtil.d(str, H5ResponseData.class);
        } catch (JsonSyntaxException unused) {
            LogUtil.e("PLGACHIEVE_H5CalRule", "parseDataInfo trackMetaData is error!");
            return null;
        }
    }

    public static HashMap<String, String> a() {
        HashMap<String, String> map = new HashMap<>(2);
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
        if (TextUtils.isEmpty(accountInfo)) {
            LogUtil.j("PLGACHIEVE_H5CalRule", "getHeaders huid null");
            return map;
        }
        map.put("x-huid", accountInfo);
        map.put("x-version", CommonUtil.a(BaseApplication.getContext()));
        LogUtil.d("PLGACHIEVE_H5CalRule", "getH5Params mapHeaders:", map.toString());
        return map;
    }

    public static JSONObject c(int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            long jA = oxi.a(i, true);
            long jA2 = oxi.a(i, false);
            jSONObject.put(Constants.START_DATE, b(jA));
            jSONObject.put("endDate", b(jA2));
            jSONObject.put("pageNo", "100");
            jSONObject.put(IAchieveDBMgr.PARAM_PAGE_SIZE, "100");
            jSONObject.put(CloudParamKeys.CLIENT_TYPE, fxl.d());
            jSONObject.put("countryCode", LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1010));
            jSONObject.put("siteId", LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1009));
            jSONObject.put("tokenType", String.valueOf(ThirdLoginDataStorageUtil.getTokenTypeValue()));
            jSONObject.put("token", LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1008));
            jSONObject.put("clientVersion", fod.e(BaseApplication.getContext()));
            jSONObject.put("language", pjn.b(null));
            jSONObject.put("appId", BaseApplication.getAppPackage());
            jSONObject.put("appType", String.valueOf(AppTypeUtils.getAppType()));
            String deviceId = LoginInit.getInstance(BaseApplication.getContext()).getDeviceId();
            if (TextUtils.isEmpty(deviceId)) {
                deviceId = "clientnull";
            }
            jSONObject.put("deviceId", deviceId);
            jSONObject.put("deviceType", String.valueOf(CommonUtil.h(BaseApplication.getContext())));
            jSONObject.put("sysVersion", Build.VERSION.RELEASE);
            jSONObject.put("timeZone", HiDateUtil.c((String) null));
            jSONObject.put("ts", String.valueOf(System.currentTimeMillis()));
            jSONObject.put("operType", "1");
            jSONObject.put("infoType", "2");
            LogUtil.d("PLGACHIEVE_H5CalRule", "getH5Params JsonParams:", jSONObject.toString());
            return jSONObject;
        } catch (JSONException e) {
            LogUtil.e("PLGACHIEVE_H5CalRule", "JSONException  ", e.getMessage());
            return jSONObject;
        }
    }

    public static String b(long j) {
        return new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH).format(new Date(j));
    }

    public static long d(String str) {
        Date date;
        try {
            date = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH).parse(str);
        } catch (ParseException e) {
            LogUtil.e("PLGACHIEVE_H5CalRule", "dayToTime exception ", e);
            date = null;
        }
        if (date != null) {
            return date.getTime();
        }
        return 0L;
    }

    public static void e(HashMap<String, Integer> map, String str) {
        if (map == null || TextUtils.isEmpty(str)) {
            return;
        }
        if (map.containsKey(str)) {
            map.put(str, Integer.valueOf(map.get(str).intValue() + 1));
        } else {
            map.put(str, 1);
        }
    }
}
