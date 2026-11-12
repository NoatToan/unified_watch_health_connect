package com.huawei.operation.utils;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Environment;
import android.os.Process;
import android.os.UserManager;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hmf.annotation.ApiDefine;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.constant.WatchFaceConstant;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.R;
import com.huawei.operation.adapter.PluginOperationAdapter;
import com.huawei.operation.beans.TitleBean;
import com.huawei.operation.share.ResultCallback;
import com.huawei.operation.view.ConfigConstants;
import com.huawei.phoneservice.feedbackcommon.network.FeedbackWebConstants;
import com.huawei.pluginachievement.manager.model.KakaConstants;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import defpackage.dlp;
import defpackage.qrs;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import java.io.File;
import java.io.IOException;
import java.text.Normalizer;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes13.dex */
public class WebViewUtils {
    private static final String APP_PATH_SD_CARD = "/healthshop/.";
    private static final String APP_PATH_SD_CARD_ROOT = "/huawei/";
    private static final String TAG = "PluginOperation_WebViewUtils";
    private static final int TEXT_SIZE_ZOOM_DEFAULT = 100;
    public static final String VMALL_PACKAGE_NAME = "com.vmall.client";
    private static final String WECHAT_PKG_NAME = "com.tencent.mm";
    private static final String WECHAT_WAP_PAY = "weixin://wap/pay?";
    private static int sAppSiteId = 0;
    private static String sDomainMyHuaweiUpLogin = "";
    private static String sHealthRecommendHost = "";
    private static String sHealthVmallHost = "";
    private static String sIdVmallUlr = "";
    private static String sOAuthAccessHost = "";
    private static String sOpenApiVmallHost = "";
    private static List<String> sThirdPkgNames = new ArrayList(Arrays.asList("com.pa.health", "com.zhongan.insurance"));
    private static List<String> sCloudSchemeList = new ArrayList(Arrays.asList("huaweihealth", "huaweischeme", "geo:", "hwt:", "hwmediacenter:", "himovie:", "financeclient:", "wallet:", "mailto:", KakaConstants.SCHEME_TEL));
    private static final String[] BLACK_PATH_LIST = {"/data/data/", "/data/user/"};

    public static boolean isLeftLarger(int i, int i2) {
        return i >= i2;
    }

    private WebViewUtils() {
    }

    public static boolean isWhiteThirdPkg(String str) {
        return !TextUtils.isEmpty(str) && sThirdPkgNames.contains(str);
    }

    public static boolean schemeHandle(Context context, PluginOperationAdapter pluginOperationAdapter, String str) {
        if (context == null || pluginOperationAdapter == null || TextUtils.isEmpty(str)) {
            LogUtil.a(TAG, "mAdapter is null ");
            return false;
        }
        if (!isDeepLinkWhiteUrl(pluginOperationAdapter, str)) {
            return false;
        }
        if (str.startsWith(WECHAT_WAP_PAY)) {
            LogUtil.a(TAG, "checkInstalledWeChatOrAlipay weixin");
            if (!CommonUtil.d(context, "com.tencent.mm")) {
                LogUtil.a(TAG, "not install weixin");
                downloadApkByPackageName(context, "com.tencent.mm");
                return true;
            }
        }
        LogUtil.a(TAG, "scheme in the list return true");
        jumpToActivity(context, str);
        return true;
    }

    public static void downloadApkByPackageName(Context context, String str) {
        health.compact.a.LogUtil.b(TAG, "downloadApkByPackageName");
        if (context == null || str == null) {
            health.compact.a.LogUtil.e(TAG, "downloadApkByPackageName null");
            return;
        }
        Uri uri = Uri.parse("market://details?id=" + str);
        if (uri != null) {
            health.compact.a.LogUtil.b(TAG, "downloadApkByPackageName startActivity");
            Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, uri);
            intent.addFlags(268435456);
            startActivitySecurity(context, intent, context.getString(R.string.IDS_device_fragment_application_market));
            return;
        }
        health.compact.a.LogUtil.d(TAG, "uri is null!");
    }

    public static boolean isDeepLinkWhiteUrl(PluginOperationAdapter pluginOperationAdapter, String str) {
        if (pluginOperationAdapter == null || TextUtils.isEmpty(str)) {
            LogUtil.j(TAG, "adapter or url is null ");
            return false;
        }
        if (isCloudScheme(str)) {
            return true;
        }
        List<String> listQueryUrlList = pluginOperationAdapter.queryUrlList("DEEPLINKWHITEURL");
        if (listQueryUrlList != null && !listQueryUrlList.isEmpty()) {
            LogUtil.a(TAG, "deepLink whiteUrl size = ", Integer.valueOf(listQueryUrlList.size()));
        } else {
            listQueryUrlList = Utils.fetchLocalDeepLinkWhiteUrlList();
            LogUtil.a(TAG, "deepLink whiteUrl in fetchLocalWhiteUrlList");
        }
        return checkDeepLinkInQueryList(listQueryUrlList, str);
    }

    private static boolean checkDeepLinkInQueryList(List<String> list, String str) {
        for (String str2 : list) {
            if (TextUtils.isEmpty(str2)) {
                return false;
            }
            if (str.startsWith(str2)) {
                return true;
            }
        }
        LogUtil.a(TAG, "scheme not in the list return false.");
        return false;
    }

    public static boolean schemeHandleVmall(Context context, String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            boolean zContains = false;
            for (String str3 : context.getResources().getStringArray(R.array.vmall_array)) {
                zContains = str2.contains(str3);
                if (zContains) {
                    break;
                }
            }
            if (zContains && str.startsWith(Constants.VMALL_OPEN_SCHEME_URL)) {
                jumpToActivity(context, str);
                return true;
            }
        }
        return false;
    }

    private static boolean isCloudScheme(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Iterator<String> it = sCloudSchemeList.iterator();
        while (it.hasNext()) {
            if (str.startsWith(it.next())) {
                return true;
            }
        }
        return false;
    }

    private static void startActivitySecurity(Context context, Intent intent, String str) {
        ResolveInfo resolveInfoResolveActivity;
        LogUtil.a(TAG, "startActivitySecurity with ", str);
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null || (resolveInfoResolveActivity = packageManager.resolveActivity(intent, 65536)) == null) {
            return;
        }
        ComponentName componentName = new ComponentName(resolveInfoResolveActivity.activityInfo.packageName, resolveInfoResolveActivity.activityInfo.name);
        intent.setComponent(componentName);
        qrs.c(intent, componentName.getPackageName(), context, str);
    }

    private static void jumpToActivity(Context context, String str) {
        LogUtil.a(TAG, "jumpToActivity");
        try {
            Intent intent = new Intent();
            intent.setAction(CommonConstant.ACTION.HWID_SCHEME_URL);
            intent.setFlags(268435456);
            intent.setData(Uri.parse(str));
            intent.addCategory("android.intent.category.BROWSABLE");
            intent.setComponent(null);
            intent.setSelector(null);
            context.startActivity(intent);
            LogUtil.a(TAG, "jump to scheme view");
        } catch (ActivityNotFoundException unused) {
            LogUtil.e(TAG, "jumpToActivity ActivityNotFoundException");
        }
    }

    public static void jumpToBrowsers(String str) {
        ResolveInfo next;
        if (TextUtils.isEmpty(str)) {
            LogUtil.j(TAG, "jumpBrowsers webUrl is null");
            return;
        }
        try {
            Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(str));
            intent.setFlags(268435456);
            Context contextB = BaseApplication.b();
            PackageManager packageManager = contextB.getPackageManager();
            if (packageManager == null) {
                return;
            }
            List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 131072);
            if (listQueryIntentActivities != null && !listQueryIntentActivities.isEmpty()) {
                HashSet hashSet = new HashSet();
                hashSet.add(VMALL_PACKAGE_NAME);
                Iterator<ResolveInfo> it = listQueryIntentActivities.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (hashSet.contains(next.activityInfo.packageName));
                if (next != null) {
                    ComponentName componentName = new ComponentName(next.activityInfo.packageName, next.activityInfo.name);
                    intent.setComponent(componentName);
                    qrs.c(intent, componentName.getPackageName(), BaseApplication.j(), contextB.getString(com.huawei.ui.commonui.R.string.IDS_browser_app_name));
                    return;
                } else {
                    LogUtil.j(TAG, "All candidates are blacklisted, fallback to system chooser.");
                    intent.setComponent(null);
                    contextB.startActivity(intent);
                    return;
                }
            }
            LogUtil.j(TAG, "No app can handle this URL");
        } catch (ActivityNotFoundException | UnsupportedOperationException e) {
            LogUtil.e(TAG, "jumpBrowsers exception", e);
        }
    }

    public static File createImageFile() throws IOException {
        File externalStoragePublicDirectory;
        if (PermissionUtil.a()) {
            externalStoragePublicDirectory = com.huawei.hwcommonmodel.application.BaseApplication.getContext().getExternalFilesDir(APP_PATH_SD_CARD + Environment.DIRECTORY_PICTURES);
        } else {
            externalStoragePublicDirectory = null;
        }
        if (externalStoragePublicDirectory == null) {
            externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory("/huawei/" + com.huawei.hwcommonmodel.application.BaseApplication.getContext().getPackageName() + APP_PATH_SD_CARD + Environment.DIRECTORY_PICTURES);
        }
        if (!externalStoragePublicDirectory.exists() && !externalStoragePublicDirectory.mkdirs()) {
            LogUtil.d(TAG, "storageDir.mkdirs failure");
        }
        return File.createTempFile("JPEG_" + new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date()) + "_", ".jpg", externalStoragePublicDirectory);
    }

    public static boolean isUnreasonableTitle(ArrayList<String> arrayList, String str) {
        if (arrayList == null || TextUtils.isEmpty(str) || arrayList.isEmpty()) {
            return true;
        }
        String strNormalize = Normalizer.normalize(str, Normalizer.Form.NFKC);
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            if (strNormalize.contains(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static void setTokenKeyUrlSp(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return;
        }
        SharedPreferenceManager.e(context, Integer.toString(10011), "WEB_VIEW_GRS_TOKEN_URL_KEY", str, new StorageParams());
    }

    public static String getTokenKeyUrlSp(Context context) {
        if (context == null) {
            return "";
        }
        return SharedPreferenceManager.e(context, Integer.toString(10011), "WEB_VIEW_GRS_TOKEN_URL_KEY");
    }

    public static void setActivityKeyUrlSp(Context context, String str) {
        SharedPreferenceManager.e(context, Integer.toString(10011), "WEB_VIEW_GRS_ACTIVITY_URL_KEY", str, new StorageParams());
    }

    public static String getActivityKeyUrlSp(Context context) {
        return SharedPreferenceManager.e(context, Integer.toString(10011), "WEB_VIEW_GRS_ACTIVITY_URL_KEY");
    }

    public static void setActivityPortalUrlSp(Context context, String str) {
        SharedPreferenceManager.e(context, Integer.toString(10011), "WEB_VIEW_GRS_ACTIVITY_PORTAL_KEY", str, new StorageParams());
    }

    public static String getActivityPortalUrlSp(Context context) {
        return SharedPreferenceManager.e(context, Integer.toString(10011), "WEB_VIEW_GRS_ACTIVITY_PORTAL_KEY");
    }

    public static void goToPkgAppDialog(final Context context, final String str, String str2, final String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || !(context instanceof Activity)) {
            return;
        }
        CustomTextAlertDialog.Builder builder = new CustomTextAlertDialog.Builder(context);
        builder.e(context.getString(R.string.IDS_hwh_open_service_pop_up_notification_note)).a(String.format(Locale.ROOT, context.getString(R.string.IDS_hwh_me_healthshop_go_to_pkg_app), str2)).b(context.getString(R.string.IDS_apphelp_pwindows_continue_button), new View.OnClickListener() { // from class: com.huawei.operation.utils.WebViewUtils.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (TextUtils.isEmpty(str3)) {
                    try {
                        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(str);
                        if (launchIntentForPackage != null) {
                            context.startActivity(launchIntentForPackage);
                            return;
                        }
                        return;
                    } catch (ActivityNotFoundException unused) {
                        LogUtil.a(WebViewUtils.TAG, "activity not found exception3.");
                        return;
                    }
                }
                try {
                    Intent intent = new Intent();
                    intent.setClassName(str, str3);
                    context.startActivity(intent);
                } catch (ActivityNotFoundException e) {
                    LogUtil.e(WebViewUtils.TAG, "goToPkgAppDialog ActivityNotFoundException", e.getMessage());
                }
            }
        }).a(context.getString(R.string.IDS_settings_button_cancal), new View.OnClickListener() { // from class: com.huawei.operation.utils.WebViewUtils.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a(WebViewUtils.TAG, "goToPkgAppDialog setNegativeButton");
            }
        });
        if (((Activity) context).isFinishing()) {
            LogUtil.a(TAG, "goToPkgAppDialog Activity isFinishing");
            return;
        }
        CustomTextAlertDialog customTextAlertDialogB = builder.b();
        customTextAlertDialogB.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.huawei.operation.utils.WebViewUtils$$ExternalSyntheticLambda0
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                LogUtil.a(WebViewUtils.TAG, "goToPkgAppDialog setOnCancelListener");
            }
        });
        customTextAlertDialogB.show();
    }

    public static boolean isVmallUrl(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.contains(ConfigConstants.VMALL_URL) || str.contains(ConfigConstants.VMALL_CN_URL);
    }

    public static boolean isHealthVmall(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.d(TAG, "isHealthVmall is empty url");
            return false;
        }
        String healthRecommendHost = getHealthRecommendHost();
        if (healthRecommendHost == null) {
            LogUtil.e(TAG, "isHealthVmall healthRecommendHost is null");
            return false;
        }
        if (CommonUtil.cl()) {
            if (str.startsWith(healthRecommendHost + "/healthMallPlat/vmall/index.html#/agrSign")) {
                return false;
            }
            if (str.startsWith(healthRecommendHost + "/healthMallPlat/")) {
                LogUtil.d(TAG, "isHealthVmall is true in test version");
                return true;
            }
        } else {
            if (str.startsWith(healthRecommendHost + "/healthMallPlat/vmall/index.html#/agrSign")) {
                return false;
            }
            if (str.startsWith(healthRecommendHost + "/healthMallPlat/")) {
                LogUtil.d(TAG, "isHealthVmall is true in release version");
                return true;
            }
        }
        LogUtil.d(TAG, "isHealthVmall is false");
        return false;
    }

    public static boolean isVmallMcpLoginUrl(String str) {
        String openApiVmallHost = getOpenApiVmallHost();
        LogUtil.d(TAG, "isVmallMcpLoginUrl openApiVmallHost = ", openApiVmallHost);
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(openApiVmallHost);
        sb.append(UriConstants.URL_VMALL_CAS_MCP_LOGIN);
        return str.startsWith(sb.toString());
    }

    public static boolean isUpLoginUrl(String str) {
        String healthIdVmallHost = getHealthIdVmallHost();
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(healthIdVmallHost);
        sb.append(UriConstants.URL_VMALL_CAS_ST_LOGIN);
        return str.startsWith(sb.toString());
    }

    public static boolean isValidUrl(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String lowerCase = str.toLowerCase(Locale.ENGLISH);
        return lowerCase.startsWith("https://") || lowerCase.startsWith("http://") || lowerCase.startsWith(Constants.PREFIX_FILE);
    }

    public static String replaceSpace(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return str.replace(" ", Constants.PERCENT_20);
    }

    public static boolean cannotGoBackUrl(String str) {
        if (TextUtils.isEmpty(str) || isVmallMcpLoginUrl(str) || isUpLoginUrl(str)) {
            return true;
        }
        if (str.startsWith(getHealthRecommendHost() + UriConstants.URL_VMALL_SIGN)) {
            return true;
        }
        if (str.startsWith(getOAuthAccessHost() + UriConstants.OAUTH_URL_AUTHORIZE)) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getDomainMyHuaweiUpLogin());
        sb.append(UriConstants.OAUTH_URL_LOGINAUTH);
        return str.startsWith(sb.toString()) || str.contains(UriConstants.OAUTH_URL_LOGINCALLBACK);
    }

    public static String getHealthRecommendHost() {
        int iN = CommonUtil.n(com.huawei.hwcommonmodel.application.BaseApplication.getContext(), LoginInit.getInstance(com.huawei.hwcommonmodel.application.BaseApplication.getContext()).getAccountInfo(1009));
        if (iN == sAppSiteId && !TextUtils.isEmpty(sHealthRecommendHost)) {
            return sHealthRecommendHost;
        }
        String url = GRSManager.c(com.huawei.hwcommonmodel.application.BaseApplication.getContext()).getUrl("healthRecommendUrl");
        sAppSiteId = iN;
        sHealthRecommendHost = url;
        return url;
    }

    public static String getHealthIdVmallHost() {
        int iN = CommonUtil.n(com.huawei.hwcommonmodel.application.BaseApplication.getContext(), LoginInit.getInstance(com.huawei.hwcommonmodel.application.BaseApplication.getContext()).getAccountInfo(1009));
        if (iN == sAppSiteId && !TextUtils.isEmpty(sIdVmallUlr)) {
            return sIdVmallUlr;
        }
        String url = GRSManager.c(com.huawei.hwcommonmodel.application.BaseApplication.getContext()).getUrl("domainHwidVmall");
        sAppSiteId = iN;
        sIdVmallUlr = url;
        return url;
    }

    public static String getHealthVmallHost() {
        int iN = CommonUtil.n(com.huawei.hwcommonmodel.application.BaseApplication.getContext(), LoginInit.getInstance(com.huawei.hwcommonmodel.application.BaseApplication.getContext()).getAccountInfo(1009));
        if (iN == sAppSiteId && !TextUtils.isEmpty(sHealthVmallHost)) {
            return sHealthVmallHost;
        }
        String url = GRSManager.c(com.huawei.hwcommonmodel.application.BaseApplication.getContext()).getUrl("domainHealthVmall");
        sAppSiteId = iN;
        sHealthVmallHost = url;
        return url;
    }

    public static String getOpenApiVmallHost() {
        int iN = CommonUtil.n(com.huawei.hwcommonmodel.application.BaseApplication.getContext(), LoginInit.getInstance(com.huawei.hwcommonmodel.application.BaseApplication.getContext()).getAccountInfo(1009));
        if (iN == sAppSiteId && !TextUtils.isEmpty(sOpenApiVmallHost)) {
            return sOpenApiVmallHost;
        }
        String url = GRSManager.c(com.huawei.hwcommonmodel.application.BaseApplication.getContext()).getUrl("domainOpenapiVmall");
        sAppSiteId = iN;
        sOpenApiVmallHost = url;
        return url;
    }

    public static String getUrl(String str) {
        return Constants.JAVA_SCRIPT + str;
    }

    public static String getUrl(String str, String str2) {
        return Constants.JAVA_SCRIPT + str + Constants.LEFT_BRACKET + str2 + Constants.RIGHT_BRACKET;
    }

    public static String getUrl(String str, String str2, String str3) {
        return Constants.JAVA_SCRIPT + str + Constants.LEFT_BRACKET + str2 + Constants.RIGHT_BRACKET + str3;
    }

    public static String getUrlForHtml(String str, String str2) {
        return Constants.JAVA_SCRIPT + str + Constants.LEFT_BRACKET_ONLY + str2 + Constants.RIGHT_BRACKET_ONLY;
    }

    public static ArrayList<String> getTitleList() {
        ArrayList<String> arrayList = new ArrayList<>(12);
        arrayList.add("http:");
        arrayList.add("https:");
        arrayList.add("404 Not Found");
        arrayList.add(".html");
        arrayList.add(".xhtml");
        arrayList.add(".htm");
        arrayList.add(".asp");
        arrayList.add(".jsp");
        arrayList.add(".php");
        arrayList.add(WatchFaceConstant.XML_SUFFIX);
        arrayList.add(".css");
        return arrayList;
    }

    public static ArrayList<TitleBean> getLocalTitleBeans(Context context) {
        ArrayList<TitleBean> arrayList = new ArrayList<>(26);
        arrayList.add(OperationUtils.getTitleBean(ConfigConstants.MIOAMORE_URL, "x", TitleBean.RIGHT_BTN_TYPE_MORE));
        arrayList.add(OperationUtils.getTitleBean(ConfigConstants.HW_HEALTH_SHOP_URL, "x", ""));
        arrayList.add(OperationUtils.getTitleBean(ConfigConstants.HW_HEALTH_MESSAGEH5, "x", ""));
        arrayList.add(OperationUtils.getTitleBean(ConfigConstants.HW_HEALTH_ACTIVITY_URL, "x", ""));
        arrayList.add(OperationUtils.getTitleBean(ConfigConstants.HW_HEALTH_ACHIEVEMENT_URL, "x", ""));
        addTripartiteLink(arrayList);
        arrayList.add(OperationUtils.getTitleBean(ConfigConstants.WENJUAN_NET_URL, "x", ""));
        arrayList.add(OperationUtils.getTitleBean(ConfigConstants.SOJUMP_URL, "x", ""));
        arrayList.add(OperationUtils.getTitleBean(ConfigConstants.WENJUAN_COM_URL, "x", ""));
        arrayList.add(OperationUtils.getTitleBean(ConfigConstants.MIKECRM_URL, "x", ""));
        arrayList.add(OperationUtils.getTitleBean(ConfigConstants.WJX_URL, "x", ""));
        String healthVmallHost = getHealthVmallHost();
        if (TextUtils.isEmpty(healthVmallHost)) {
            LogUtil.j(TAG, "getLocalTitleBeans healthVmall is empty");
            healthVmallHost = "http:/";
        }
        LogUtil.d(TAG, "getLocalTitleBeans healthVmall = ", healthVmallHost);
        arrayList.add(OperationUtils.getTitleBean(healthVmallHost + ConfigConstants.HELP_URL, TitleBean.LEFT_BTN_TYPE_ARROW, ""));
        arrayList.add(OperationUtils.getTitleBean(ConfigConstants.VMALL_URL, TitleBean.LEFT_BTN_TYPE_ARROW, ""));
        arrayList.add(OperationUtils.getTitleBean(ConfigConstants.VMALL_CN_URL, TitleBean.LEFT_BTN_TYPE_ARROW, ""));
        arrayList.add(OperationUtils.getTitleBean(ConfigConstants.WATCH_FACE_URL, TitleBean.LEFT_BTN_TYPE_ARROW, ""));
        arrayList.add(OperationUtils.getTitleBean(ConfigConstants.WATCH_FACE_NEW_URL, TitleBean.LEFT_BTN_TYPE_ARROW, ""));
        arrayList.add(OperationUtils.getTitleBean(getActivityKeyUrlSp(context), "x", ""));
        return arrayList;
    }

    private static void addTripartiteLink(ArrayList<TitleBean> arrayList) {
        arrayList.add(OperationUtils.getTitleBean(ConfigConstants.HEARTIDE_URL, "x", ""));
        arrayList.add(OperationUtils.getTitleBean(ConfigConstants.BOOHEE_COM_URL, "x", ""));
        arrayList.add(OperationUtils.getTitleBean(ConfigConstants.BOOHEE_CN_URL, "x", ""));
        arrayList.add(OperationUtils.getTitleBean(ConfigConstants.ZHONG_AN_URL, "x", ""));
        arrayList.add(OperationUtils.getTitleBean(ConfigConstants.ALIPAY_URL, "x", ""));
        arrayList.add(OperationUtils.getTitleBean(ConfigConstants.UNIONPAY_URL, "x", ""));
        arrayList.add(OperationUtils.getTitleBean(ConfigConstants.PAY_95516_URL, "x", ""));
        arrayList.add(OperationUtils.getTitleBean(ConfigConstants.MIAOHEALTH_URL, "x", ""));
        arrayList.add(OperationUtils.getTitleBean(ConfigConstants.TENPAY_URL, "x", ""));
        arrayList.add(OperationUtils.getTitleBean(ConfigConstants.CHUNYUYISHENG_URL, "x", ""));
        arrayList.add(OperationUtils.getTitleBean(ConfigConstants.CODOON_URL, "x", ""));
        arrayList.add(OperationUtils.getTitleBean(ConfigConstants.GUAHAO_URL, "x", ""));
    }

    public static void processSslError(SslError sslError) {
        switch (sslError.getPrimaryError()) {
            case 0:
                LogUtil.a(TAG, "onReceivedSslError SSL_NOTYETVALID");
                break;
            case 1:
                LogUtil.a(TAG, "onReceivedSslError SSL_EXPIRED");
                break;
            case 2:
                LogUtil.a(TAG, "onReceivedSslError SSL_IDMISMATCH");
                break;
            case 3:
                LogUtil.a(TAG, "onReceivedSslError SSL_UNTRUSTED");
                break;
            case 4:
                LogUtil.a(TAG, "onReceivedSslError SSL_DATE_INVALID");
                break;
            case 5:
                LogUtil.a(TAG, "onReceivedSslError SSL_INVALID");
                break;
            case 6:
                LogUtil.a(TAG, "onReceivedSslError SSL_MAX_ERROR");
                break;
        }
    }

    public static boolean isFullScreen(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j(TAG, " url is null");
            return false;
        }
        try {
            if ("ON".equals(Uri.parse(str).getQueryParameter("FullScreen"))) {
                LogUtil.a(TAG, " FullScreen=ON");
                return true;
            }
        } catch (UnsupportedOperationException e) {
            LogUtil.e(TAG, "isFullScreen Exception = ", e.getMessage());
        }
        return false;
    }

    /* JADX INFO: loaded from: classes41.dex */
    @ApiDefine(uri = ActivityHtmlPathApi.class)
    public static class ActivityHtmlPathImpl implements ActivityHtmlPathApi {
        @Override // com.huawei.operation.utils.ActivityHtmlPathApi
        public String getActivityHtmlPath() {
            return WebViewUtils.getHtmlPath(null);
        }

        @Override // com.huawei.operation.utils.ActivityHtmlPathApi
        public String getActivityHtmlPath(dlp dlpVar) {
            return WebViewUtils.getHtmlPath(dlpVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String getHtmlPath(dlp dlpVar) {
        if (dlpVar != null && dlpVar.x() == 1) {
            return getGroupPkHtmlPath();
        }
        return getGroupPkHtmlPath() + Constants.ACTIVITY_URL_CN;
    }

    private static String getGroupPkHtmlPath() {
        if (CommonUtil.ap() || CommonUtil.ao()) {
            return Constants.H5_URL_BASE_PATH_BETA;
        }
        if (CommonUtil.cl() || CommonUtil.ba()) {
            return Constants.H5_URL_BASE_PATH_TEST;
        }
        return Constants.H5_URL_BASE_PATH_RELEASE;
    }

    public static void setWebSettings(Context context, WebView webView, boolean z) {
        if (webView == null) {
            LogUtil.j(TAG, "webView is null");
            return;
        }
        WebSettings settings = webView.getSettings();
        settings.setGeolocationEnabled(false);
        settings.setAllowContentAccess(false);
        if (CommonUtil.ab(context)) {
            settings.setCacheMode(-1);
        } else {
            settings.setCacheMode(1);
        }
        settings.setSupportZoom(true);
        settings.setTextSize(WebSettings.TextSize.SMALLER);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowFileAccess(false);
        settings.setJavaScriptEnabled(false);
        if (z) {
            settings.setTextZoom(100);
        }
    }

    public static String strBuilder(String... strArr) {
        if (strArr == null || strArr.length <= 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(strArr.length * 16);
        for (String str : strArr) {
            sb.append(str);
        }
        return sb.toString();
    }

    public static String getOAuthAccessHost() {
        int iN = CommonUtil.n(com.huawei.hwcommonmodel.application.BaseApplication.getContext(), LoginInit.getInstance(com.huawei.hwcommonmodel.application.BaseApplication.getContext()).getAccountInfo(1009));
        if (iN == sAppSiteId && !TextUtils.isEmpty(sOAuthAccessHost)) {
            return sOAuthAccessHost;
        }
        String url = GRSManager.c(com.huawei.hwcommonmodel.application.BaseApplication.getContext()).getUrl("domainAccessTokenUrl");
        sAppSiteId = iN;
        sOAuthAccessHost = url;
        return url;
    }

    public static String getDomainMyHuaweiUpLogin() {
        int iN = CommonUtil.n(com.huawei.hwcommonmodel.application.BaseApplication.getContext(), LoginInit.getInstance(com.huawei.hwcommonmodel.application.BaseApplication.getContext()).getAccountInfo(1009));
        if (iN == sAppSiteId && !TextUtils.isEmpty(sDomainMyHuaweiUpLogin)) {
            return sDomainMyHuaweiUpLogin;
        }
        String url = GRSManager.c(com.huawei.hwcommonmodel.application.BaseApplication.getContext()).getUrl("domainMyHuaweiUpLogin");
        sAppSiteId = iN;
        sDomainMyHuaweiUpLogin = url;
        return url;
    }

    public static void initMyTabGrsUrl(ResultCallback resultCallback) {
        Context context = com.huawei.hwcommonmodel.application.BaseApplication.getContext();
        setTokenKeyUrlSp(context, GRSManager.c(context).getUrl("getToken"));
        String url = GRSManager.c(context).getUrl("domainContentcenterDbankcdnNew");
        LogUtil.a(TAG, "miao host name = ", url);
        setActivityKeyUrlSp(context, url);
        setActivityPortalUrlSp(context, GRSManager.c(context).getUrl("activityUrl"));
        String url2 = GRSManager.c(context).getUrl("domainMVmall");
        String url3 = GRSManager.c(context).getUrl("domainMVmallDetail");
        String healthRecommendHost = getHealthRecommendHost();
        ArrayList arrayList = new ArrayList();
        arrayList.add(url2);
        arrayList.add(healthRecommendHost + "/miniShop/html/");
        arrayList.add(healthRecommendHost);
        arrayList.add(url);
        arrayList.add(url3);
        resultCallback.onResult(0, arrayList);
    }

    public static boolean checkUriIsValid(Context context, Uri uri) {
        synchronized (WebViewUtils.class) {
            boolean zEquals = true;
            try {
                if (uri == null) {
                    LogUtil.j(TAG, "checkUriIsValid: uri is null");
                    return false;
                }
                String path = uri.getPath();
                if (!TextUtils.isEmpty(path) && !path.contains(FeedbackWebConstants.INVALID_FILE_NAME_PRE)) {
                    for (String str : BLACK_PATH_LIST) {
                        if (path.startsWith(str)) {
                            zEquals = false;
                            break;
                        }
                    }
                }
                if (zEquals) {
                    String userInfo = uri.getUserInfo();
                    if (!TextUtils.isEmpty(userInfo)) {
                        zEquals = TextUtils.equals(userInfo, String.valueOf(((UserManager) context.getSystemService("user")).getSerialNumberForUser(Process.myUserHandle())));
                    }
                }
                LogUtil.a(TAG, "checkUriIsValid: isValid -> " + zEquals);
                return zEquals;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
