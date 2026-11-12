package com.xiaomi.hm.health.discovery;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import androidx.annotation.NonNull;
import com.huami.account.ui.areas.SelectAreaHelper;
import com.huami.ad.entity.LaunchViewEntity;
import com.huami.network.hmnetwork.config.HMAppConfig;
import com.huami.network.hmnetwork.webapi.HMWebUtil;
import com.huami.passport.AccountManager;
import com.huami.tools.log.HMLog;
import com.huami.web.service.WebItem;
import com.xiaomi.hm.health.BraceletApp;
import com.xiaomi.hm.health.baseutil.GlobalUtil;
import com.xiaomi.hm.health.push.HMPushItem;
import com.xiaomi.hm.health.utils.Utils;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.util.Locale;
import java.util.Map;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public class WebActivityUtil {
    private static final String a = "WebActivity";

    private static String a(String key, String value) {
        HMLog.d(a, "Cookie : " + key + SearchCriteria.EQ + value, new Object[0]);
        return key + SearchCriteria.EQ + value;
    }

    private static String b(String key, Map<String, Object> sysParams) {
        HMLog.d(a, "Cookie : " + key + SearchCriteria.EQ + sysParams.get(key), new Object[0]);
        return key + SearchCriteria.EQ + sysParams.get(key);
    }

    private static void c(Context context, Uri uri) throws Exception {
        if (uri == null) {
            return;
        }
        String host = uri.getHost();
        if (TextUtils.isEmpty(host)) {
            return;
        }
        CookieSyncManager.createInstance(context.getApplicationContext());
        CookieManager cookieManager = CookieManager.getInstance();
        cookieManager.setAcceptCookie(true);
        HMLog.d(a, "Cookie : Url-" + uri.toString() + ",Host-" + host, new Object[0]);
        Map<String, Object> systemParams = HMWebUtil.getSystemParams();
        Map<String, String> systemHeader = HMWebUtil.getSystemHeader();
        systemParams.putAll(systemHeader);
        String str = systemHeader.get("security");
        String str2 = systemHeader.get("apptoken");
        if (!TextUtils.isEmpty(str)) {
            cookieManager.setCookie(host, a("security", str));
        } else if (!TextUtils.isEmpty(str2)) {
            cookieManager.setCookie(host, a("security", str2));
            cookieManager.setCookie(host, a("apptoken", str2));
        }
        cookieManager.setCookie(host, b("userid", systemParams));
        cookieManager.setCookie(host, b("appname", systemParams));
        cookieManager.setCookie(host, b("channel", systemParams));
        cookieManager.setCookie(host, b("cv", systemParams));
        cookieManager.setCookie(host, b("v", systemParams));
        cookieManager.setCookie(host, b("appplatform", systemParams));
        cookieManager.setCookie(host, b("lang", systemParams));
        cookieManager.setCookie(host, b("country", systemParams));
        CookieManager.getInstance().flush();
    }

    public static void d(Context context, String url) throws Exception {
        c(context, Uri.parse(url));
    }

    public static String getExtraUAString() {
        try {
            String str = ((" " + (GlobalUtil.isMidong() ? "com.huami.watch.hmwatchmanager" : HMAppConfig.getPackageName()) + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + HMAppConfig.getVersionCode() + "_" + HMAppConfig.getVersionName()) + " NetType/" + Utils.getUserAgentNetTypeParmas()) + " Language/" + (Locale.getDefault().getLanguage() + "_" + Locale.getDefault().getCountry());
            try {
                str = (str + " UserRegion/" + AccountManager.getDefault(BraceletApp.getContext()).getCurrentRegion()) + " UserCountry/" + SelectAreaHelper.getAreaBySave().getValue();
            } catch (Exception e) {
                HMLog.i(a, "getCurrentRegion Exception:" + e, new Object[0]);
            }
            String str2 = str + " Country/" + Locale.getDefault().getCountry();
            HMLog.d(a, "UserAgent : " + str2, new Object[0]);
            return str2;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static void removeCookies(Context context) {
        try {
            CookieSyncManager.createInstance(context);
            CookieManager.getInstance().removeAllCookie();
            CookieSyncManager.getInstance().sync();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @NonNull
    public static WebItem toWebItem(@NotNull HMPushItem entity) {
        WebItem webItem = new WebItem();
        webItem.share = entity.getShare();
        webItem.shareUrl = entity.getShareUrl();
        webItem.url = entity.getMsgUrl();
        webItem.shareTitle = entity.getShareTitle();
        webItem.shareSubtitle = entity.getShareSubTitle();
        webItem.needWriteCookie = entity.getCookie() == 1;
        return webItem;
    }

    @NonNull
    public static WebItem toWebItem(@NotNull LaunchViewEntity entity) {
        WebItem webItem = new WebItem();
        webItem.share = entity.share;
        webItem.shareUrl = entity.shareUrl;
        webItem.url = entity.url;
        webItem.shareTitle = entity.shareTitle;
        webItem.shareSubtitle = entity.shareSubtitle;
        return webItem;
    }
}
