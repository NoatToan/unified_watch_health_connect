package com.huami.network.hmnetwork.webapi;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.huami.network.base.HMHttpConfig;
import com.huami.network.base.HMHttpRequest;
import com.huami.network.base.callback.IHMHttpCallback;
import com.huami.network.base.handler.IHMBasicHttpResponseHandler;
import com.huami.network.base.handler.IHMFileDownloadResponseHandler;
import com.huami.network.base.model.HMHttpRequestData;
import com.huami.network.base.model.Support;
import com.huami.network.base.util.HMHttpUtils;
import com.huami.network.hmnetwork.callback.IHMAppInfoCallback;
import com.huami.network.hmnetwork.callback.IHMGetTokenCallback;
import com.huami.network.hmnetwork.config.HMAppConfig;
import com.huami.network.hmnetwork.exception.GettingTokenErrorException;
import com.huami.network.hmnetwork.exception.GettingTokenInUIThreadException;
import com.huami.network.hmnetwork.model.account.ThirdLoginState;
import com.huami.network.hmnetwork.server.HMServerDef;
import com.huami.network.hmnetwork.webapi.HMWebUtil;
import com.huami.tools.log.HMLog;
import java.io.File;
import java.net.URI;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class HMWebUtil {
    public static final String UNDER_LINE = "_";
    private static final String a = "HMWebUtil";
    private static final int b = -1;
    private static final String c = "android";
    private static String d = null;
    private static IHMAppInfoCallback e = null;
    private static ExecutorService f = Executors.newSingleThreadExecutor();
    private static final String g = "curl";
    private static final String h = " ";
    private static final String i = "";
    private static final String j = "-X GET";
    private static final String k = "-X POST";
    private static final String l = "-X DELETE";
    private static final String m = "-X PUT";
    private static final String n = "--header";
    private static final String o = "--data";
    private static final String p = "content-type";
    private static final String q = "/";
    private static final String r = "&";
    private static final String s = "'";
    private static final String t = ":";
    private static final String u = "?";
    private static final String v = "=";
    private static final String w = "-i";

    @Deprecated
    public static String assembleCurl(Map<String, String> map, HMHttpRequestData hMHttpRequestData) {
        if (hMHttpRequestData == null) {
            return null;
        }
        if (hMHttpRequestData.isUseParams()) {
            return k(map, hMHttpRequestData.getParams(), hMHttpRequestData.getUrl(), hMHttpRequestData.getSupport());
        }
        if (hMHttpRequestData.isUseEntity()) {
            return h(map, hMHttpRequestData.getEntity(), hMHttpRequestData.getUrl(), hMHttpRequestData.getSupport());
        }
        return hMHttpRequestData.isUseDownload() ? hMHttpRequestData.getUrl() : hMHttpRequestData.getUrl();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0062  */
    /* JADX WARN: Code duplicated, block: B:23:0x006c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0076 A[PHI: r2 r3
      0x0076: PHI (r2v6 java.lang.String) = (r2v5 java.lang.String), (r2v4 java.lang.String) binds: [B:24:0x0074, B:20:0x0060] A[DONT_GENERATE, DONT_INLINE]
      0x0076: PHI (r3v3 java.lang.String) = (r3v2 java.lang.String), (r3v4 java.lang.String) binds: [B:24:0x0074, B:20:0x0060] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:27:0x007c  */
    private static String d(Set<Object> set) {
        String string;
        if (n(set)) {
            return "";
        }
        Iterator<Object> it2 = set.iterator();
        if (set.size() == 1) {
            Object next = it2.next();
            if (next instanceof String) {
                return " --data '" + next.toString() + s;
            }
        } else if (set.size() == 2) {
            Object next2 = it2.next();
            Object next3 = it2.next();
            if ((next2 instanceof String) && (next3 instanceof String)) {
                String string2 = next2.toString();
                if (HMHttpUtils.isContentType(string2)) {
                    string = next3.toString();
                    if (HMHttpUtils.isContentType(string)) {
                        string2 = next3.toString();
                        if (HMHttpUtils.isContentType(string2)) {
                            string = next2.toString();
                            if (!HMHttpUtils.isContentType(string)) {
                                if (!TextUtils.isEmpty(string2) && !TextUtils.isEmpty(string)) {
                                    return " --header 'content-type:" + string2 + s + " " + o + " " + s + string + s;
                                }
                            }
                        }
                    } else if (!TextUtils.isEmpty(string2)) {
                        return " --header 'content-type:" + string2 + s + " " + o + " " + s + string + s;
                    }
                } else {
                    string2 = next3.toString();
                    if (HMHttpUtils.isContentType(string2)) {
                        string = next2.toString();
                        if (!HMHttpUtils.isContentType(string)) {
                            if (!TextUtils.isEmpty(string2)) {
                                return " --header 'content-type:" + string2 + s + " " + o + " " + s + string + s;
                            }
                        }
                    }
                }
            }
        }
        return "";
    }

    @Deprecated
    public static void doRequest(String str, Map<String, Object> map, Support.RequestSupport requestSupport, IHMBasicHttpResponseHandler iHMBasicHttpResponseHandler) {
        doRequest(str, map, requestSupport, false, iHMBasicHttpResponseHandler);
    }

    @Deprecated
    public static void doRequestList(List<HMHttpRequestData> list, boolean z, boolean z2, IHMBasicHttpResponseHandler iHMBasicHttpResponseHandler) {
        IHMAppInfoCallback iHMAppInfoCallback;
        if (z && ((iHMAppInfoCallback = e) == null || !iHMAppInfoCallback.isUserValid())) {
            if (iHMBasicHttpResponseHandler != null) {
                iHMBasicHttpResponseHandler.onCancel(1);
                return;
            }
            return;
        }
        IHMAppInfoCallback iHMAppInfoCallback2 = e;
        if (iHMAppInfoCallback2 != null && iHMAppInfoCallback2.isNetworkConnected()) {
            t(list);
            HMHttpRequest.getInstance().requestList(list, null, true, z2, iHMBasicHttpResponseHandler, new HMHttpConfig[0]);
        } else {
            HMLog.e(a, "doRequestList network invalid", new Object[0]);
            if (iHMBasicHttpResponseHandler != null) {
                iHMBasicHttpResponseHandler.onCancel(4);
            }
        }
    }

    @Deprecated
    public static void doSeparateRequest(String str, Map<String, String> map, Map<String, Object> map2, Support.RequestSupport requestSupport, boolean z, boolean z2, IHMBasicHttpResponseHandler iHMBasicHttpResponseHandler, HMHttpConfig... hMHttpConfigArr) {
        if (r(z, iHMBasicHttpResponseHandler)) {
            return;
        }
        HMHttpRequest.getInstance().separateRequest(str, map, map2, requestSupport, z2, iHMBasicHttpResponseHandler, hMHttpConfigArr);
    }

    private static String e(Map<String, String> map) {
        if (m(map)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (String str : map.keySet()) {
            sb.append(" ");
            sb.append(n);
            sb.append(" ");
            sb.append(s);
            sb.append(str);
            sb.append(":");
            sb.append(map.get(str));
            sb.append(s);
        }
        return sb.toString();
    }

    private static String f(Map<String, Object> map) {
        if (m(map)) {
            return "";
        }
        return " --data '" + i(map) + s;
    }

    private static void g(StringBuilder sb, Map<String, String> map, Set<Object> set, String str, String str2) {
        sb.append(str2);
        sb.append(e(map));
        sb.append(d(set));
        sb.append(" ");
        sb.append(s);
        sb.append(str);
        sb.append(s);
    }

    @Deprecated
    public static String getLang() {
        return Locale.getDefault().getLanguage() + "_" + Locale.getDefault().getCountry();
    }

    @Deprecated
    public static Map<String, Object> getPartnerParams(String str, ThirdLoginState thirdLoginState) {
        Map<String, Object> systemParams = getSystemParams();
        systemParams.put(HMWebParameter.PARAM_THIRD_APP_ID, str);
        systemParams.put(HMWebParameter.PARAM_PARTNER_THIRD_APP_UID, thirdLoginState.uid);
        systemParams.put("access_token", thirdLoginState.accessToken);
        systemParams.put("expires_in", String.valueOf(thirdLoginState.expiresIn));
        systemParams.put("refresh_token", thirdLoginState.refreshToken);
        systemParams.put("nick_name", thirdLoginState.nickName);
        return systemParams;
    }

    @Deprecated
    public static Map<String, String> getSystemHeader() throws GettingTokenErrorException, GettingTokenInUIThreadException {
        String country = Locale.getDefault().getCountry();
        HashMap map = new HashMap();
        map.put("appname", HMAppConfig.getPackageName());
        map.put("channel", HMAppConfig.getChannel());
        map.put("cv", HMAppConfig.getVersionCode() + "_" + HMAppConfig.getVersionName());
        map.put("v", "2.0");
        map.put("appplatform", HMAppConfig.getDeviceType());
        map.put("lang", Locale.getDefault().getLanguage() + "_" + country);
        map.put("country", country);
        map.put("timezone", TimeZone.getDefault().getID());
        IHMAppInfoCallback iHMAppInfoCallback = e;
        if (iHMAppInfoCallback != null) {
            if (!iHMAppInfoCallback.isAdultForAds()) {
                map.put(HMWebParameter.PARAM_DELIVERY_TYPE, HMWebParameter.PARAM_DELIVERY_TYPE_VALUE);
            }
            e.processHeader(map);
        }
        return map;
    }

    @Deprecated
    public static void getSystemHeaderAsync(final IHMGetTokenCallback iHMGetTokenCallback) {
        if (HMHttpUtils.isMainThread()) {
            f.execute(new Runnable() { // from class: hp3
                @Override // java.lang.Runnable
                public final void run() {
                    HMWebUtil.o(iHMGetTokenCallback);
                }
            });
            return;
        }
        try {
            iHMGetTokenCallback.onSuccess(getSystemHeader());
        } catch (Exception e2) {
            iHMGetTokenCallback.onError(e2);
        }
    }

    @Deprecated
    public static Map<String, Object> getSystemParams() {
        return getSystemParams(true);
    }

    @Deprecated
    public static String getUserId() {
        IHMAppInfoCallback iHMAppInfoCallback = e;
        return iHMAppInfoCallback == null ? String.valueOf(-1) : iHMAppInfoCallback.getUserId();
    }

    private static String h(Map<String, String> map, Set<Object> set, String str, Support.RequestSupport requestSupport) {
        StringBuilder sb = new StringBuilder();
        sb.append(g);
        sb.append(" ");
        if (requestSupport == Support.RequestSupport.POST) {
            g(sb, map, set, str, k);
        } else {
            if (requestSupport != Support.RequestSupport.PUT) {
                return str;
            }
            g(sb, map, set, str, m);
        }
        sb.append(" ");
        sb.append(w);
        return sb.toString();
    }

    private static String i(Map<String, Object> map) {
        if (m(map)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (String str : map.keySet()) {
            if (z) {
                z = false;
                sb.append(str);
                sb.append("=");
                sb.append(map.get(str));
            } else {
                sb.append("&");
                sb.append(str);
                sb.append("=");
                sb.append(map.get(str));
            }
        }
        return sb.toString();
    }

    @Deprecated
    public static void initHttp(IHMHttpCallback iHMHttpCallback, IHMAppInfoCallback iHMAppInfoCallback, HMHttpConfig hMHttpConfig) {
        e = iHMAppInfoCallback;
        HMHttpRequest.initHttpRequest(hMHttpConfig);
        HMHttpRequest.getInstance().setCallback(iHMHttpCallback);
    }

    @Deprecated
    public static boolean isHuamiSDKLogin() {
        IHMAppInfoCallback iHMAppInfoCallback = e;
        return iHMAppInfoCallback != null && iHMAppInfoCallback.isHuamiSDKLogin();
    }

    private static void j(StringBuilder sb, Map<String, String> map, Map<String, Object> map2, String str, String str2) {
        sb.append(str2);
        sb.append(e(map));
        sb.append(f(map2));
        sb.append(" ");
        sb.append(s);
        sb.append(str);
        sb.append(s);
    }

    private static String k(Map<String, String> map, Map<String, Object> map2, String str, Support.RequestSupport requestSupport) {
        StringBuilder sb = new StringBuilder();
        sb.append(g);
        sb.append(" ");
        if (requestSupport == Support.RequestSupport.GET) {
            sb.append(j);
            sb.append(e(map));
            sb.append(" ");
            sb.append(s);
            sb.append(l(str, map2));
            sb.append(s);
        } else if (requestSupport == Support.RequestSupport.POST) {
            j(sb, map, map2, str, k);
        } else if (requestSupport == Support.RequestSupport.DELETE) {
            j(sb, map, map2, str, l);
        } else {
            if (requestSupport != Support.RequestSupport.PUT) {
                return str;
            }
            j(sb, map, map2, str, m);
        }
        sb.append(" ");
        sb.append(w);
        return sb.toString();
    }

    private static String l(String str, Map<String, Object> map) {
        String strSubstring;
        if (str == null) {
            return null;
        }
        try {
            if (str.length() > 0 && str.lastIndexOf("/") == str.length() - 1) {
                str = str.substring(0, str.length() - 1);
            }
            String rawQuery = URI.create(str).getRawQuery();
            if (rawQuery == null) {
                strSubstring = str + u;
            } else if ("".equalsIgnoreCase(rawQuery)) {
                strSubstring = str + "";
            } else {
                strSubstring = str.substring(0, str.indexOf(u) + 1);
                s(map, rawQuery);
            }
            return strSubstring + i(map);
        } catch (Exception unused) {
            HMLog.e(a, "assembleUrl error!!!", new Object[0]);
            return str;
        }
    }

    private static boolean m(Map<?, ?> map) {
        return map == null || map.isEmpty();
    }

    private static boolean n(Set<Object> set) {
        return set == null || set.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void o(final IHMGetTokenCallback iHMGetTokenCallback) {
        try {
            final Map<String, String> systemHeader = getSystemHeader();
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: jp3
                @Override // java.lang.Runnable
                public final void run() {
                    iHMGetTokenCallback.onSuccess(systemHeader);
                }
            });
        } catch (Exception e2) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: ip3
                @Override // java.lang.Runnable
                public final void run() {
                    iHMGetTokenCallback.onError(e2);
                }
            });
        }
    }

    @Deprecated
    private static boolean r(boolean z, IHMBasicHttpResponseHandler iHMBasicHttpResponseHandler) {
        IHMAppInfoCallback iHMAppInfoCallback;
        if (z && ((iHMAppInfoCallback = e) == null || !iHMAppInfoCallback.isUserValid())) {
            if (iHMBasicHttpResponseHandler != null) {
                iHMBasicHttpResponseHandler.onCancel(1);
            }
            return true;
        }
        IHMAppInfoCallback iHMAppInfoCallback2 = e;
        if (iHMAppInfoCallback2 != null && iHMAppInfoCallback2.isNetworkConnected()) {
            return false;
        }
        HMLog.e(a, "doRequest network invalid", new Object[0]);
        if (iHMBasicHttpResponseHandler != null) {
            iHMBasicHttpResponseHandler.onCancel(4);
        }
        return true;
    }

    private static void s(Map<String, Object> map, String str) {
        for (String str2 : str.split("&")) {
            String[] strArrSplit = str2.split("=");
            if (!map.containsKey(strArrSplit[0])) {
                if (strArrSplit.length == 0) {
                    map.put(strArrSplit[0], "");
                } else {
                    map.put(strArrSplit[0], strArrSplit[1]);
                }
            }
        }
    }

    @Deprecated
    public static void setRequester(String str) {
        d = str;
    }

    private static void t(List<HMHttpRequestData> list) {
        for (HMHttpRequestData hMHttpRequestData : list) {
            hMHttpRequestData.setUrl(u(hMHttpRequestData.getUrl()));
        }
    }

    private static String u(String str) {
        if (HMServerDef.isThirdUrl(str)) {
            return str;
        }
        HashMap map = new HashMap();
        if (TextUtils.isEmpty(d)) {
            return str;
        }
        map.put("r", d);
        map.put("t", String.valueOf(System.currentTimeMillis()));
        return l(str, map);
    }

    @Deprecated
    public static void doRequest(String str, Map<String, Object> map, Support.RequestSupport requestSupport, boolean z, IHMBasicHttpResponseHandler iHMBasicHttpResponseHandler) {
        if (r(true, iHMBasicHttpResponseHandler)) {
            return;
        }
        HMHttpRequest.getInstance().request(u(str), map, requestSupport, z, iHMBasicHttpResponseHandler);
    }

    @Deprecated
    public static Map<String, Object> getSystemParams(boolean z) {
        HashMap map = new HashMap();
        String country = Locale.getDefault().getCountry();
        map.put("v", "2.0");
        map.put("appid", String.valueOf(HMAppConfig.APP_ID));
        map.put("callid", String.valueOf(System.currentTimeMillis()));
        map.put("lang", Locale.getDefault().getLanguage() + "_" + country);
        map.put("country", country);
        map.put("timezone", TimeZone.getDefault().getID());
        map.put("channel", HMAppConfig.getChannel());
        map.put("device", "android_" + Build.VERSION.SDK_INT);
        map.put("device_type", HMAppConfig.getDeviceType());
        map.put("cv", HMAppConfig.getVersionCode() + "_" + HMAppConfig.getVersionName());
        if (z) {
            IHMAppInfoCallback iHMAppInfoCallback = e;
            map.put("userid", iHMAppInfoCallback == null ? "" : iHMAppInfoCallback.getUserId());
        }
        return map;
    }

    @Deprecated
    public static void doSeparateRequest(String str, Map<String, String> map, Set<Object> set, Support.RequestSupport requestSupport, boolean z, boolean z2, IHMBasicHttpResponseHandler iHMBasicHttpResponseHandler, HMHttpConfig... hMHttpConfigArr) {
        if (r(z, iHMBasicHttpResponseHandler)) {
            return;
        }
        HMHttpRequest.getInstance().separateRequest(str, map, set, requestSupport, z2, iHMBasicHttpResponseHandler, hMHttpConfigArr);
    }

    @Deprecated
    public static void doSeparateRequest(String str, Set<Object> set, Support.RequestSupport requestSupport, boolean z, boolean z2, IHMBasicHttpResponseHandler iHMBasicHttpResponseHandler, HMHttpConfig... hMHttpConfigArr) {
        if (r(z, iHMBasicHttpResponseHandler)) {
            return;
        }
        HMHttpRequest.getInstance().separateRequest(str, set, requestSupport, z2, iHMBasicHttpResponseHandler, hMHttpConfigArr);
    }

    @Deprecated
    public static void doSeparateRequest(String str, Map<String, String> map, File file, Support.RequestSupport requestSupport, boolean z, boolean z2, IHMFileDownloadResponseHandler iHMFileDownloadResponseHandler, HMHttpConfig... hMHttpConfigArr) {
        if (r(z, iHMFileDownloadResponseHandler)) {
            return;
        }
        HMHttpRequest.getInstance().separateRequest(str, map, file, requestSupport, z2, iHMFileDownloadResponseHandler, hMHttpConfigArr);
    }
}
