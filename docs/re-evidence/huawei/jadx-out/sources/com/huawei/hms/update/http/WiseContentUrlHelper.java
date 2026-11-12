package com.huawei.hms.update.http;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.android.SystemUtils;
import com.huawei.hms.framework.network.grs.GrsApp;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.framework.network.grs.GrsClient;
import com.huawei.hms.support.log.HMSLog;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Locale;

/* JADX INFO: loaded from: classes34.dex */
public class WiseContentUrlHelper {
    private static String a(String str) throws UnsupportedEncodingException {
        StringBuilder sb = new StringBuilder("?country=");
        sb.append(URLEncoder.encode(str, "UTF-8"));
        String phoneModel = SystemUtils.getPhoneModel();
        String andoridVersion = SystemUtils.getAndoridVersion();
        String manufacturer = SystemUtils.getManufacturer();
        if (b(phoneModel)) {
            sb.append("&phoneModel=");
            sb.append(URLEncoder.encode(phoneModel, "UTF-8"));
        }
        if (b(andoridVersion)) {
            sb.append("&androidVersion=");
            sb.append(URLEncoder.encode(andoridVersion, "UTF-8"));
        }
        if (b(manufacturer)) {
            sb.append("&MFR=");
            sb.append(URLEncoder.encode(manufacturer, "UTF-8"));
        }
        return sb.toString();
    }

    private static boolean b(String str) {
        return (TextUtils.isEmpty(str) || str.equals("unknown")) ? false : true;
    }

    public static String syncGetUrl(Context context) {
        String strA = "";
        if (context == null) {
            HMSLog.e("WiseContentUrlHelper", "<syncGettUrl> context is null.");
            return "";
        }
        Context applicationContext = context.getApplicationContext();
        String strA2 = a(applicationContext);
        if (TextUtils.isEmpty(strA2)) {
            HMSLog.e("WiseContentUrlHelper", "<syncGettUrl> getIssueCountryCode is empty");
            return "";
        }
        String strA3 = a(applicationContext, strA2);
        if (TextUtils.isEmpty(strA3)) {
            HMSLog.e("WiseContentUrlHelper", "<syncGettUrl> synGetGrsUrl is empty");
            return "";
        }
        try {
            strA = a(strA2);
        } catch (UnsupportedEncodingException e) {
            HMSLog.e("WiseContentUrlHelper", "<syncGettUrl> UnsupportedEncodingException," + e.getMessage());
        } catch (RuntimeException e2) {
            HMSLog.e("WiseContentUrlHelper", "<syncGettUrl> RuntimeException," + e2.getMessage());
        }
        HMSLog.i("WiseContentUrlHelper", "<syncGettUrl> requestParam: " + strA);
        return strA3 + "/cch5/HMS/core/sdk/install.json" + strA;
    }

    private static String a(Context context) {
        String issueCountryCode = GrsApp.getInstance().getIssueCountryCode(context);
        if (!TextUtils.isEmpty(issueCountryCode)) {
            issueCountryCode = issueCountryCode.toUpperCase(Locale.ENGLISH);
        }
        if (!"UNKNOWN".equalsIgnoreCase(issueCountryCode) && !TextUtils.isEmpty(issueCountryCode)) {
            return issueCountryCode;
        }
        HMSLog.e("WiseContentUrlHelper", "<getIssueCountryCode> Failed to get device issue country");
        return "";
    }

    private static String a(Context context, String str) {
        HMSLog.i("WiseContentUrlHelper", "<syncInternalGetGrsUrl> Start to query GRS");
        GrsBaseInfo grsBaseInfo = new GrsBaseInfo();
        grsBaseInfo.setIssueCountry(str);
        return new GrsClient(context, grsBaseInfo).synGetGrsUrl("com.huawei.cloud.hmscoreInstallerSDK", "ROOT");
    }
}
