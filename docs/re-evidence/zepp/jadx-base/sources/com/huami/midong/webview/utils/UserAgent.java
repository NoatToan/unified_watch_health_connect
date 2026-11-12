package com.huami.midong.webview.utils;

import android.content.Context;
import android.text.TextUtils;
import com.huami.passport.AccountManager;
import com.huami.watch.companion.account.UserInfoManager;
import com.huami.watch.util.AppUtil;
import com.huami.watch.util.I18nUtil;
import com.huami.watch.util.Log;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;

/* JADX INFO: loaded from: classes11.dex */
public class UserAgent {
    private static final String PARAM_COUNTRY = "Country";
    private static final String PARAM_LANGUAGE = "Language";
    private static final String PARAM_NET_TYPE = "NetType";
    private static final String PARAM_USER_CONTRACT = "UserCountry";
    private static final String PARAM_USER_REGION = "UserRegion";
    private static final String TAG = "JsBridgeUserAgent";
    private static final String UNDER_LINE = "_";

    public static String getUserAgent(Context context, String str) {
        StringBuilder sb = new StringBuilder(str.contains(" wv") ? str.replace(" wv", "") : str.replace("Version/", "xxx/"));
        sb.append(" ");
        sb.append(context.getPackageName());
        sb.append(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE);
        sb.append(AppUtil.getVersionCode(context));
        sb.append("_");
        sb.append(AppUtil.getVersionName(context));
        String netTypeParams = NetUtil.getNetTypeParams(context);
        sb.append(" NetType/");
        sb.append(netTypeParams);
        sb.append(" Language/");
        sb.append(I18nUtil.getLocaleStr(context));
        sb.append(" Country/");
        sb.append(I18nUtil.getLocaleCountry(context));
        String currentRegion = AccountManager.getDefault(context).getCurrentRegion();
        sb.append(" UserRegion/");
        sb.append(currentRegion);
        String country = UserInfoManager.get().getCountry();
        if (TextUtils.isEmpty(country)) {
            country = I18nUtil.getLocaleCountry(context);
        }
        sb.append(" UserCountry/");
        sb.append(country);
        Log.d(TAG, " final userAgentString : " + sb.toString(), new Object[0]);
        return sb.toString();
    }
}
