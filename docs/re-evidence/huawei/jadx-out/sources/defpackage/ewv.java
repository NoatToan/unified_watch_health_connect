package defpackage;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.utils.AppTypeUtils;
import com.huawei.operation.utils.CloudParamKeys;
import com.huawei.operation.utils.PhoneInfoUtils;
import com.huawei.thirdloginbasemodule.ThirdLoginDataStorageUtil;
import health.compact.a.CommonUtil;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
public class ewv {
    public static HashMap<String, String> b(Context context) {
        HashMap<String, String> map = new HashMap<>(16);
        if (!LoginInit.getInstance(context).isBrowseMode()) {
            map.put("x-huid", LoginInit.getInstance(context).getAccountInfo(1011));
        }
        map.put("x-version", CommonUtil.c(context));
        return map;
    }

    public static HashMap<String, String> e(Context context) {
        HashMap<String, String> map = new HashMap<>(16);
        map.put("deviceType", PhoneInfoUtils.getDeviceModel());
        map.put("phoneType", PhoneInfoUtils.getHuaweiManufaturerOrEmui());
        String deviceId = LoginInit.getInstance(context).getDeviceId();
        if ("".equals(deviceId)) {
            deviceId = "clientnull";
        }
        map.put("deviceId", deviceId);
        map.put("sysVersion", Build.VERSION.RELEASE);
        map.put("bindDeviceType", String.valueOf(CommonUtil.h(context)));
        map.put("wearType", "");
        map.put("appType", String.valueOf(AppTypeUtils.getAppType()));
        map.put("iVersion", String.valueOf(1));
        map.put("countryCode", LoginInit.getInstance(context).getAccountInfo(1010));
        map.put("language", pjn.b(null));
        map.put("ts", String.valueOf(System.currentTimeMillis()));
        String accountInfo = LoginInit.getInstance(context).getAccountInfo(1008);
        if (!TextUtils.isEmpty(accountInfo)) {
            try {
                map.put("token", URLEncoder.encode(accountInfo, StandardCharsets.UTF_8.name()));
            } catch (UnsupportedEncodingException e) {
                LogUtil.e("PostUtil", "token encode Exception ", e.toString());
            }
        }
        map.put("tokenType", String.valueOf(ThirdLoginDataStorageUtil.getTokenTypeValue()));
        map.put("upDeviceType", LoginInit.getInstance(context).getDeviceType());
        if (LoginInit.getInstance(context).isLoginedByWear()) {
            map.put("appId", "com.huawei.bone");
        } else {
            map.put("appId", BaseApplication.getAppPackage());
        }
        map.put("siteId", LoginInit.getInstance(context).getAccountInfo(1009));
        map.put("manufacturer", Build.MANUFACTURER);
        map.put(CloudParamKeys.CLIENT_TYPE, fxl.d());
        return map;
    }
}
