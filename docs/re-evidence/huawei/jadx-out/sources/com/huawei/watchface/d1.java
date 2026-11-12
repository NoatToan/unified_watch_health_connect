package com.huawei.watchface;

import android.os.Build;
import android.text.TextUtils;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.profile.coordinator.ProfileRequestConstants;
import com.huawei.watchface.api.HwWatchFaceApi;
import com.huawei.watchface.environment.Environment;
import com.huawei.watchface.mvp.model.thread.BaseHttpRequest;
import com.huawei.watchface.utils.CommonUtils;
import com.huawei.watchface.utils.HwLog;
import com.huawei.watchface.utils.LanguageUtils;
import com.huawei.watchface.utils.MobileInfoHelper;
import com.huawei.watchface.utils.WatchFaceHttpUtil;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes20.dex */
public class d1 extends BaseHttpRequest {
    private static String e() {
        StringBuilder sb = new StringBuilder("firmware=");
        sb.append(Build.VERSION.RELEASE);
        sb.append(Constants.VERSION);
        sb.append(CommonUtils.g());
        sb.append("&buildNumber=");
        sb.append(HwWatchFaceApi.getInstance(Environment.getApplicationContext()).getDeviceModel());
        sb.append("&versionCode=80003&locale=");
        sb.append(LanguageUtils.a(false));
        sb.append("&phoneType=");
        sb.append(MobileInfoHelper.getDeviceName());
        sb.append("&isoCode=");
        sb.append(HwWatchFaceApi.getInstance(Environment.getApplicationContext()).getCommonCountryCode());
        sb.append("&ver=1.6&domainType=2");
        HwLog.i("GetOnlineState", "getRequestParams: " + sb.toString());
        return sb.toString();
    }

    public final void a(g4 g4Var, String str) {
        if (g4Var == null) {
            HwLog.i("GetOnlineState", "saveSupportPay supportType is null");
            return;
        }
        String strB = g4Var.b();
        HwLog.i("GetOnlineState", "saveSupportPay supportPay:" + strB);
        if (TextUtils.isEmpty(strB)) {
            HwLog.i("GetOnlineState", "saveSupportPay supportPay is empty");
            return;
        }
        b3.a(Environment.getApplicationContext(), "overseasSupportOnlineInfo" + str, strB);
    }

    public g4 b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        g4 g4VarI = g4.i(str);
        String commonCountryCode = HwWatchFaceApi.getInstance(Environment.getApplicationContext()).getCommonCountryCode();
        if (!TextUtils.isEmpty(commonCountryCode)) {
            if (HwWatchFaceApi.getInstance(Environment.getApplicationContext()).isOversea() || !commonCountryCode.equals("CN")) {
                b3.b(Environment.getApplicationContext(), "overseasSupportOnlineInfo", str);
            } else {
                b3.b(Environment.getApplicationContext(), "SupportOnlineInfo", str);
            }
            a(g4VarI, commonCountryCode);
        }
        return g4VarI;
    }

    public String c(String str) {
        HwLog.i("GetOnlineState", "getResponse url");
        return a(WatchFaceHttpUtil.q() + e(), str, getReqHeaders());
    }

    @Override // com.huawei.watchface.mvp.model.thread.BaseHttpRequest
    public LinkedHashMap getReqHeaders() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(ProfileRequestConstants.X_APPID_KEY, "10003");
        linkedHashMap.put("x-versioncode", String.valueOf(CommonUtils.getVersionCode()));
        return linkedHashMap;
    }
}
