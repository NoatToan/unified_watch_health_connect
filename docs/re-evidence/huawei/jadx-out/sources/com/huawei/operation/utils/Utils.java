package com.huawei.operation.utils;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.ArrayMap;
import com.huawei.health.h5pro.utils.GeneralUtil;
import com.huawei.hihealth.HiSyncOption;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hmf.annotation.ApiDefine;
import com.huawei.hmf.annotation.Singleton;
import com.huawei.hms.kit.awareness.barrier.internal.e.a;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcloudmodel.model.wjx.WjxRequestManager;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.R;
import com.huawei.operation.adapter.PluginOperationAdapter;
import com.huawei.operation.h5pro.H5proUtil;
import com.huawei.operation.operation.PluginOperation;
import com.huawei.operation.view.ConfigConstants;
import com.huawei.operation.view.CustomWebView;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public class Utils {
    private static final String H5_NEED_LOGIN_URL = "isNeedLogin";
    private static final String H5_URL_PREFIX = "file:///data/data/com\\.huawei\\.health/files/plugins/";
    private static final String H5_URL_PREFIX_THIRD_PHONE_ANDROID_11 = "file:///data/user/0/com\\.huawei\\.health/files/plugins/";
    private static final String H5_URL_SUFFIX = "/H5/dist/index\\.html";
    private static final String HUAWEI_SCHEME = "huaweischeme://";
    private static final String JAPAN_COUNTRY_CODE = "JP";
    private static final int MAX_ARRAY_SIZE = 2;
    private static final String NEED_LOGIN_URL = "needLogin";
    private static final String SYMBOL_PARSE_COLOR = "#%06X";
    private static final int SYMBOL_PARSE_COLOR_HEX = 16777215;
    private static final String TAG = "PluginOperation_Utils";
    private static final String THIRD_DEVICE_H5_URL_PREFIX = "file://%s/plugins/";
    private static final String URL_FATHER_PATH = "../";
    private static List<String> sGpsHiLinkDeviceIdWhiteList;
    private static List<String> sLocalDeepLinkWhiteUrlList;
    private static List<String> sLocalOverSeasDeepLinkWhiteUrlList;
    private static List<String> sLocalOverSeasWhiteUrlList;
    private static final String BREATHE_PRACTICE_URL = "file:///android_asset/breathePractice/index.html";
    private static ArrayList<String> sInnerStressGameUrlList = new ArrayList<>(Arrays.asList(BREATHE_PRACTICE_URL));
    private static ArrayList<String> sInnerOperationUrlList = new ArrayList<>(Arrays.asList("file:///android_asset/operation/MessageH5/html/recommendIndex1.html", "file:///android_asset/operation/MessageH5/html/recommendBohee.html", "file:///android_asset/operation/MessageH5/html/honorBracelet.html", "file:///android_asset/operation/MessageH5/html/recommendIndex2.html", "file:///android_asset/operation/MessageH5/html/huaweiBracelet.html", "file:///android_asset/operation/activity/web/html/activityShare.html?activityId=110", "file:///android_asset/operation/activity/web/html/activityShare.html?activityId=166"));
    private static ArrayList<String> sLocalWhiteUrlList = new ArrayList<>(Arrays.asList("HWWHITEULR#hicloud.com", "HWWHITEULR#dbankcloud.cn", "HWWHITEULR#heartide.com", "HWWHITEULR#boohee.com", "HWWHITEULR#boohee.cn", "HWWHITEULR#zhongan.com", "HWWHITEULR#chunyuyisheng.com", "HWWHITEULR#alipay.com", "HWWHITEULR#unionpay.com", "HWWHITEULR#95516.com", "HWWHITEULR#miaomore.com", "HWWHITEULR#qq.com", "HWWHITEULR#xiumi.us", "HWWHITEULR#json.cn", "HWWHITEULR#sojump.com", "HWWHITEULR#wenjuan.com", "HWWHITEULR#mikecrm.com", "HWWHITEULR#nike.com", "HWWHITEULR#vmall.com", "HWWHITEULR#vmall.cn", "HWWHITEULR#weixinbridge.com", "HWWHITEULR#psy-1.com", "HWWHITEULR#codoon.com", "HWWHITEULR#idata-power.com", "HWWHITEULR#cardniu.com", "HWWHITEULR#miaohealth.net", "HWWHITEULR#tenpay.com", "HWWHITEULR#guahao.com", "HWWHITEULR#wenjuan.net", "HWWHITEULR#wjx.top", "HWWHITEULR#dbankcdn.com", "HWWHITEULR#dbankcdn.cn", "HWWHITEULR#hihonorcdn.com", "HWWHITEULR#tips-drru.platform.dbankcloud.ru", "HWWHITEULR#hihonor.com", "HWWHITEULR#socialmaster.cn", "HWWHITEULR#guahao-inc.com", "HWWHITEULR#huawei.com", "HWWHITEULR#huawei.com.cn", "HWWHITEULR#wjx.cn", "HWWHITEULR#baidu.com", "HWWHITEULR#jinxiang.com", "HWWHITEULR#techbrood.com", "HWWHITEULR#hao123.com", "HWWHITEULR#sina.com", "HWWHITEULR#sobot.com", "HWWHITEULR#jenk.gd.cn", "HWWHITEULR#psychicspet.com", "HWWHITEULR#jd.com", "HWWHITEULR#pingan.com", "HWWHITEULR#pingan.com.cn", "HWWHITEULR#inveno.com", "HWWHITEULR#ptbchina.com", "HWWHITEULR#ctrip.com", "HWWHITEULR#c-ctrip.com", "HWWHITEULR#honor.cn", "HWWHITEULR#flyh6.cn", "HWWHITEULR#weixin.sleepeazz.com", "HWWHITEULR#zhongan-health.oss-cn-hzfinance.aliyuncs.com", "HWWHITEULR#h5.wiseinheart.com", "HWWHITEULR#wjx.com", "HWWHITEULR#995120.cn", "HWWHITEULR#merch.szx.abchina.com", "HWWHITEULR#site.fphis.com", "HWWHITEULR#open2.ehaoyao.com", "HWWHITEULR#pin.ehaoyao.com", "HWWHITEULR#paycenter.ehaoyao.com", "HWWHITEULR#wechat.jhm2012.com", "HWWHITEULR#wechatbch.jhm2012.com", "HWWHITEULR#fd.walkup.cc", "HWWHITEULR#zgstgyw.n.gongyibao.cn", "HWWHITEULR#gw.n.gongyibao.cn", "HWWHITEULR#cgf.org.cn", "HWWHITEULR#wx.cgf.org.cn", "HWWHITEULR#lingxi360.com", "HWWHITEULR#live.onespax.com", "HWWHITEULR#m.syh.dong24.com", "HWWHITEULR#api.live.yongdongli.net", "HWWHITEULR#i.meituan.com", "HWWHITEULR#m.lrts.me", "HWWHITEULR#h5hosting-drru.dbankcdn.ru", "HWWHITEULR#sporthealth-drru.dbankcdn.ru", "HWWHITEULR#api-drru.theme.dbankcloud.ru", "HWWHITEULR#cube.meituan.com", "HWWHITEULR#t.taopiaopiao.com", "HWWHITEULR#o2o.dailyyoga.com.cn", "HWWHITEULR#kylin.tuhu.cn", "HWWHITEULR#dushu365.com", "HWWHITEULR#maoyan.com", "HWWHITEULR#quickapp-o2o-dev.teddymobile.net", "HWWHITEULR#quickapp-o2o.teddymobile.cn", "HWWHITEULR#quickapp-o2o-staging.teddymobile.cn", "HWWHITEULR#dev.teddymobile.net", "HWWHITEULR#ecm.teddymobile.cn", "HWWHITEULR#taobao.com", "HWWHITEULR#tmall.com", "HWWHITEULR#pinduoduo.com", "HWWHITEULR#jingxi.com", "HWWHITEULR#ug-drcn.media.dbankcloud.com", "HWWHITEULR#apk.360buyimg.com", "HWWHITEULR#jk.cn", "HWWHITEULR#aihuishou.com", "HWWHITEULR#huishoubao.com", "HWWHITEULR#healthjd.com", "HWWHITEULR#genebox.cn", "HWWHITEULR#gaotoo.net", "HWWHITEULR#mitem.jd.hk", "HWWHITEULR#jkcsjd.com", "HWWHITEULR#didi.cn", "HWWHITEULR#page.udache.com", "HWWHITEULR#yiyaojd.com", "HWWHITEULR#pajk.cn", "HWWHITEULR#pajk.com.cn", "HWWHITEULR#jkwlx.cn", "HWWHITEULR#jkwlx.net", "HWWHITEULR#jkwlx.com.cn", "HWWHITEULR#pajk-ent.com", "HWWHITEULR#pahys.com", "HWWHITEULR#pahys.com.cn", "HWWHITEULR#pajkdc.com", "HWWHITEULR#pahys.net", "HWWHITEULR#lingxigames.com", "HWWHITEULR#letsleep.cn", "HWWHITEULR#17u.cn", "HWWHITEULR#hitv.com", "HWWHITEULR#mgtv.com", "HWWHITEULR#pahys.cn", "HWWHITEULR#ivs.chinamobiledevice.com", "HWWHITEULR#msv6.wosms.cn"));
    private static OperationUtilsApi operationUtilsApi = (OperationUtilsApi) Services.d("PluginOperation", OperationUtilsApi.class);

    public static int filterResultCode(int i) {
        if (i != 0 && i != 1 && i != 2) {
            if (i == 3 || i == 7) {
                return 2;
            }
            switch (i) {
                case 1001:
                case 1002:
                case 1003:
                    break;
                default:
                    return 4;
            }
        }
        return i;
    }

    static {
        sLocalOverSeasWhiteUrlList = null;
        addBuildConfigToWhiteUrlList(sLocalWhiteUrlList, "");
        ArrayList arrayList = new ArrayList(10);
        sLocalOverSeasWhiteUrlList = arrayList;
        arrayList.add("HWWHITEULR#health.vmall.com");
        sLocalOverSeasWhiteUrlList.add("HWWHITEULR#resourcephs1.vmall.com");
        sLocalOverSeasWhiteUrlList.add("HWWHITEULR#resourcephs2.vmall.com");
        sLocalOverSeasWhiteUrlList.add("HWWHITEULR#dbankcdn.com");
        sLocalOverSeasWhiteUrlList.add("HWWHITEULR#dbankcdn.cn");
        sLocalOverSeasWhiteUrlList.add("HWWHITEULR#hihonorcdn.com");
        sLocalOverSeasWhiteUrlList.add("HWWHITEULR#dbankcloud.cn");
        sLocalOverSeasWhiteUrlList.add("HWWHITEULR#dbankcloud.ru");
        sLocalOverSeasWhiteUrlList.add("HWWHITEULR#h5.health.huawei.com");
        sLocalOverSeasWhiteUrlList.add("HWWHITEULR#dbankcloud.com");
        sLocalOverSeasWhiteUrlList.add("HWWHITEULR#msv6.wosms.cn");
        addBuildConfigToWhiteUrlList(sLocalOverSeasWhiteUrlList, "");
        sLocalOverSeasDeepLinkWhiteUrlList = new ArrayList(Arrays.asList("alipays:", "alipay", "weixin://wap/pay?", "cmblife://pay?", "hiapplink://com.huawei.appmarket"));
        sLocalDeepLinkWhiteUrlList = new ArrayList(Arrays.asList("alipays:", "alipay", "weixin://wap/pay?", "cmblife://pay?", "hiapplink://com.huawei.appmarket"));
        sGpsHiLinkDeviceIdWhiteList = new ArrayList(Arrays.asList("M0EB", "M0EC", "M0EO", "M0ER", "M0EU", "M0ET", "M0ES"));
    }

    private Utils() {
    }

    private static void addBuildConfigToWhiteUrlList(List<String> list, String str) {
        if (list == null || TextUtils.isEmpty(str)) {
            return;
        }
        for (String str2 : str.split(",")) {
            if (!TextUtils.isEmpty(str2)) {
                list.add(str2);
            }
        }
    }

    private static List<String> fetchLocalWhiteUrlList() {
        if (health.compact.a.Utils.o()) {
            return sLocalOverSeasWhiteUrlList;
        }
        return sLocalWhiteUrlList;
    }

    public static List<String> fetchLocalDeepLinkWhiteUrlList() {
        if (health.compact.a.Utils.o()) {
            return sLocalOverSeasDeepLinkWhiteUrlList;
        }
        return sLocalDeepLinkWhiteUrlList;
    }

    public static Date stringToDate(String str) {
        try {
            return new SimpleDateFormat("yyyyMMdd").parse(str);
        } catch (ParseException unused) {
            LogUtil.e(TAG, "stringToDate ParseException");
            return null;
        }
    }

    public static boolean needAuth(Context context) {
        if (context == null || !CommonUtil.cl()) {
            return true;
        }
        return !Boolean.parseBoolean(SharedPreferenceManager.e(context, Integer.toString(30007), "open_service_auth_key"));
    }

    public static boolean isBleWhiteUrl(String str) {
        if (TextUtils.isEmpty(str) || !GeneralUtil.isSafePath(str)) {
            return false;
        }
        if (isDeviceH5Url(str)) {
            return true;
        }
        return !health.compact.a.Utils.h() && str.startsWith(BREATHE_PRACTICE_URL);
    }

    public static boolean isWhiteFileUrl(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return isDeviceH5Url(str) || sInnerStressGameUrlList.contains(str) || isStoreDemoFileUrl(str);
    }

    private static boolean isDeviceH5Url(String str) {
        if (str.contains("../")) {
            return false;
        }
        return Pattern.compile("file:///data/data/com\\.huawei\\.health/files/plugins/[A-Za-z0-9-]+/[A-Za-z0-9-]+").matcher(str).lookingAt() || Pattern.compile("file:///data/user/0/com\\.huawei\\.health/files/plugins/[A-Za-z0-9-]+/[A-Za-z0-9-]+").matcher(str).lookingAt();
    }

    private static boolean isStoreDemoFileUrl(String str) {
        return sInnerOperationUrlList.contains(str);
    }

    public static boolean isWhiteUrlLogicJudge(String str, PluginOperationAdapter pluginOperationAdapter) {
        LogUtil.a(TAG, "Utils isWhiteUrl enter");
        if (TextUtils.isEmpty(str) || pluginOperationAdapter == null) {
            LogUtil.a(TAG, "isWhiteUrl currentUrl isEmpty or mAdapter is null");
            return false;
        }
        String hostByJdk = getHostByJdk(str);
        LogUtil.a(TAG, "urlHost is : ", hostByJdk);
        if (TextUtils.isEmpty(hostByJdk)) {
            LogUtil.a(TAG, "isWhiteUrl urlHost is Null");
            return false;
        }
        List<String> listQueryUrlList = pluginOperationAdapter.queryUrlList("HWWHITEULR");
        if (listQueryUrlList != null && !listQueryUrlList.isEmpty()) {
            LogUtil.a(TAG, "isWhiteUrl in cloudWhiteUrlList size = ", Integer.valueOf(listQueryUrlList.size()));
        } else {
            listQueryUrlList = fetchLocalWhiteUrlList();
            LogUtil.a(TAG, "isWhiteUrl in fetchLocalWhiteUrlList");
        }
        return checkHostInQueryList(listQueryUrlList, hostByJdk);
    }

    private static boolean checkHostInQueryList(List<String> list, String str) {
        for (String str2 : list) {
            if (!TextUtils.isEmpty(str2) && str2.contains("#")) {
                String[] strArrSplit = str2.split("#", 2);
                if (strArrSplit.length == 2 && str.endsWith(strArrSplit[1])) {
                    try {
                        if (str.length() >= strArrSplit[1].length()) {
                            String strSubstring = str.substring(0, str.length() - strArrSplit[1].length());
                            LogUtil.d(TAG, "checkHostInQueryList isWhiteUrl urlTmp is ", strSubstring);
                            if (TextUtils.isEmpty(strSubstring)) {
                                LogUtil.a(TAG, "checkHostInQueryList isWhiteUrl in TextUtils.isEmpty(urlTmp)");
                                return true;
                            }
                            if (!strSubstring.endsWith(".")) {
                                LogUtil.a(TAG, "checkHostInQueryList isWhiteUrl in !urlTmp.endsWith(.)");
                            } else {
                                boolean zMatches = strSubstring.matches("^[A-Za-z0-9.-]+$");
                                LogUtil.a(TAG, "checkHostInQueryList isWhiteUrl in isValied matches : ", Boolean.valueOf(zMatches));
                                if (zMatches) {
                                    return true;
                                }
                            }
                        } else {
                            LogUtil.a(TAG, "index is out of Bounds in urlHost.");
                            return false;
                        }
                    } catch (Exception unused) {
                        LogUtil.e(TAG, "checkHostInQueryList isWhiteUrl Exception");
                    }
                }
            }
            return false;
        }
        LogUtil.a(TAG, "No host in the array. return false.");
        return false;
    }

    public static void getWjxSurveyId(final String str, final Handler handler) {
        LogUtil.a(TAG, "checkAndGetWjxSurveyId");
        if (TextUtils.isEmpty(str) || handler == null) {
            LogUtil.j(TAG, "checkAndGetWjxSurveyId url or handler is empty");
        } else {
            WjxRequestManager.getSurveyId(new IBaseResponseCallback() { // from class: com.huawei.operation.utils.Utils.1
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    String str2;
                    LogUtil.a(Utils.TAG, "checkAndGetWjxSurveyId  errorCode = ", Integer.valueOf(i));
                    if (!(obj instanceof String)) {
                        str2 = "";
                    } else {
                        str2 = (String) obj;
                    }
                    String strNewPathConcat = str;
                    if (!TextUtils.isEmpty(str2)) {
                        LogUtil.a(Utils.TAG, "checkAndGetWjxSurveyId surveyId.length = ", Integer.valueOf(str2.length()));
                        strNewPathConcat = OperationUtils.newPathConcat(str, Constants.WENJUANXING_URL_PARAM, str2);
                    }
                    Message messageObtainMessage = handler.obtainMessage();
                    messageObtainMessage.obj = strNewPathConcat;
                    messageObtainMessage.what = 20010;
                    handler.sendMessage(messageObtainMessage);
                }
            });
        }
    }

    public static String getHostByJdk(String str) {
        LogUtil.a(TAG, "getHostByJDK enter");
        if (TextUtils.isEmpty(str)) {
            LogUtil.j(TAG, "getHostByJDK ", "urlString is empty");
            return "";
        }
        try {
            return new URL(str).getHost();
        } catch (MalformedURLException e) {
            LogUtil.e(TAG, "getHostByJDK ", e.getMessage());
            return "";
        }
    }

    public static boolean isHttpOrHttps(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith("http://") || str.startsWith("https://");
    }

    public static String int2Hex(int i) {
        String str = String.format(Locale.ENGLISH, SYMBOL_PARSE_COLOR, Integer.valueOf(i & 16777215));
        LogUtil.d(TAG, "int2Hex: " + str);
        return str;
    }

    public static String getCountryCode() {
        return Locale.getDefault().getCountry();
    }

    public static boolean isNotSupportBrowseUrl(String str) {
        return operationUtilsApi.isNotSupportBrowseUrl(str);
    }

    public static boolean isMatchThirdDeviceH5UrlPrefix(String str) {
        if (TextUtils.isEmpty(str) || str.contains("../")) {
            LogUtil.e(TAG, "isMatchThirdDeviceH5UrlPrefix invalid url");
            return false;
        }
        try {
            String str2 = String.format(Locale.ENGLISH, THIRD_DEVICE_H5_URL_PREFIX, BaseApplication.getContext().getFilesDir().getCanonicalPath());
            LogUtil.a(TAG, "isMatchThirdDeviceH5UrlPrefix:", str2);
            return str.startsWith(str2);
        } catch (IOException unused) {
            LogUtil.e(TAG, "isMatchThirdDeviceH5UrlPrefix exception");
        }
    }

    /* JADX INFO: loaded from: classes41.dex */
    @ApiDefine(uri = OperationUtilsApi.class)
    @Singleton
    public static class OperationUtilsApiImpl implements OperationUtilsApi {
        @Override // com.huawei.operation.utils.OperationUtilsApi
        public boolean isNotSupportBrowseUrl(String str) {
            if (!LoginInit.getInstance(BaseApplication.getContext()).isBrowseMode()) {
                return false;
            }
            if (TextUtils.isEmpty(str)) {
                LogUtil.j(Utils.TAG, "isNotSupportBrowseUrl url is null!");
                return true;
            }
            if (str.contains(Utils.HUAWEI_SCHEME) || str.contains(ConfigConstants.VMALL_URL) || str.contains(Utils.NEED_LOGIN_URL) || str.contains(Utils.H5_NEED_LOGIN_URL)) {
                return true;
            }
            return new ArrayList(Arrays.asList(BaseApplication.getContext().getResources().getStringArray(R.array.need_login_url_list))).contains(str);
        }

        @Override // com.huawei.operation.utils.OperationUtilsApi
        public boolean isChallengeActivity(int i) {
            return ActivityType.isChallengeActivity(i);
        }

        @Override // com.huawei.operation.utils.OperationUtilsApi
        public void initH5pro() {
            H5proUtil.initH5pro();
        }

        @Override // com.huawei.operation.utils.OperationUtilsApi
        public boolean isOperation(String str) {
            return OperationUtils.isOperation(str);
        }

        @Override // com.huawei.operation.utils.OperationUtilsApi
        public boolean isModuleOperatedToOversea(String str) {
            return OperationUtils.isModuleOperatedToOversea(str);
        }

        @Override // com.huawei.operation.utils.OperationUtilsApi
        public boolean isSupportCountry(String str, String str2, int i) {
            return OperationUtils.isSupportCountry(str, str2, i);
        }

        @Override // com.huawei.operation.utils.OperationUtilsApi
        public String getUserPrivacyFromCloud(String str) {
            return OperationUtils.getUserPrivacyFromCloud(str);
        }
    }

    /* JADX INFO: loaded from: classes41.dex */
    public enum ActivityType {
        ACTIVITY_TYPE_MARATHON(200),
        ACTIVITY_TYPE_RUN(a.D),
        ACTIVITY_TYPE_RIDE(a.K),
        ACTIVITY_TYPE_SINGLE_RUN(a.L),
        ACTIVITY_TYPE_SINGLE_RIDE(a.M),
        ACTIVITY_TYPE_CHALLENGE(218);

        int mActivityType;

        ActivityType(int i) {
            this.mActivityType = i;
        }

        public int getActivityType() {
            return this.mActivityType;
        }

        public static boolean isChallengeActivity(int i) {
            for (ActivityType activityType : values()) {
                if (activityType.getActivityType() == i) {
                    return true;
                }
            }
            return false;
        }
    }

    public static boolean isShowJapanCustomer(Context context) {
        if (context != null) {
            return LanguageUtil.ag(context) && JAPAN_COUNTRY_CODE.equals(LoginInit.getInstance(context).getAccountInfo(1010));
        }
        LogUtil.j(TAG, "isShowJapanCustomer() context is null");
        return false;
    }

    public static boolean isNeedLoginWithVmallUrl(final String str, Context context, final CustomWebView customWebView) {
        if (!health.compact.a.Utils.o() || !LoginInit.getInstance(context).isBrowseMode() || TextUtils.isEmpty(str) || context == null || customWebView == null || !WebViewUtils.isVmallUrl(str)) {
            return false;
        }
        LoginInit.getInstance(context).browsingToLogin(new IBaseResponseCallback() { // from class: com.huawei.operation.utils.Utils$$ExternalSyntheticLambda0
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                Utils.lambda$isNeedLoginWithVmallUrl$0(customWebView, str, i, obj);
            }
        }, "");
        return true;
    }

    static /* synthetic */ void lambda$isNeedLoginWithVmallUrl$0(CustomWebView customWebView, String str, int i, Object obj) {
        if (i == 0) {
            customWebView.reload(str);
        } else {
            LogUtil.j(TAG, "onPageFinished login failed.");
        }
    }

    public static String parseUri(String str, String str2) {
        LogUtil.a(TAG, "parseUri");
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            if (!str.contains("://") && !str.contains("?")) {
                str = TextUtils.concat("?", str).toString();
            }
            try {
                String queryParameter = Uri.parse(str).getQueryParameter(str2);
                return queryParameter == null ? "" : Uri.decode(queryParameter);
            } catch (UnsupportedOperationException e) {
                LogUtil.e(TAG, "parseUri -> " + e.getMessage());
            }
        }
        return "";
    }

    public static ArrayMap<String, String> parseUri(String str) {
        LogUtil.a(TAG, "parseUri all");
        ArrayMap<String, String> arrayMap = new ArrayMap<>();
        if (!TextUtils.isEmpty(str)) {
            if (!str.contains("://") && !str.contains("?")) {
                str = TextUtils.concat("?", str).toString();
            }
            try {
                Uri uri = Uri.parse(str);
                Set<String> queryParameterNames = uri.getQueryParameterNames();
                if (queryParameterNames != null && !queryParameterNames.isEmpty()) {
                    for (String str2 : queryParameterNames) {
                        if (!TextUtils.isEmpty(str2)) {
                            String queryParameter = uri.getQueryParameter(str2);
                            arrayMap.put(str2, queryParameter == null ? "" : Uri.decode(queryParameter));
                        }
                    }
                }
            } catch (UnsupportedOperationException e) {
                LogUtil.e(TAG, "parseUri -> " + e.getMessage());
            }
        }
        return arrayMap;
    }

    public static PluginOperationAdapter initPluginOperationAdapter() {
        try {
            Object objInvoke = Class.forName("com.huawei.hwadpaterhealthmgr.PluginOperationAdapterImpl").getMethod("getInstance", Context.class).invoke(null, BaseApplication.getContext());
            if (!(objInvoke instanceof PluginOperationAdapter)) {
                LogUtil.e(TAG, "initPluginOperationAdapter fail");
                return null;
            }
            LogUtil.a(TAG, "initPluginOperationAdapter success:", objInvoke);
            PluginOperation.getInstance(BaseApplication.getContext()).setAdapter((PluginOperationAdapter) objInvoke);
            return (PluginOperationAdapter) objInvoke;
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException e) {
            LogUtil.e(TAG, "initPluginOperationAdapter fail:", e.getMessage());
            return null;
        }
    }

    public static void syncCloudAfterInsert() {
        LogUtil.a(TAG, "sync cloud start");
        HiSyncOption hiSyncOption = new HiSyncOption();
        hiSyncOption.setSyncModel(2);
        hiSyncOption.setSyncAction(0);
        hiSyncOption.setSyncDataType(20000);
        hiSyncOption.setSyncMethod(2);
        hiSyncOption.setSyncScope(1);
        HiHealthNativeApi.a(BaseApplication.getContext()).synCloud(hiSyncOption, null);
        LogUtil.a(TAG, "sync cloud over");
    }

    public static boolean isDeviceInGpsWhiteList(String str) {
        if (health.compact.a.Utils.o()) {
            LogUtil.a(TAG, "isDeviceInGpsWhiteList oversea version, whitelist not active");
            return false;
        }
        if (TextUtils.isEmpty(str)) {
            LogUtil.j(TAG, "isDeviceInGpsWhiteList hiLinkDeviceId is null");
            return false;
        }
        LogUtil.a(TAG, "isDeviceInGpsWhiteList hiLinkDeviceId:", str);
        return sGpsHiLinkDeviceIdWhiteList.contains(str);
    }
}
