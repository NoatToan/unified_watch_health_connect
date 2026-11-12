package com.huawei.watchface.utils;

import android.app.Application;
import android.text.TextUtils;
import com.huawei.hms.network.embedded.j2;
import com.huawei.hms.network.embedded.w9;
import com.huawei.hms.support.hwid.common.constants.CommonConstant;
import com.huawei.picture.security.account.bean.HitopRespInfo;
import com.huawei.secure.android.common.encrypt.utils.EncryptUtil;
import com.huawei.secure.android.common.ssl.SSFCompatiableSystemCA;
import com.huawei.secure.android.common.util.SafeString;
import com.huawei.watchface.api.HwWatchFaceApi;
import com.huawei.watchface.c2;
import com.huawei.watchface.e4;
import com.huawei.watchface.environment.Environment;
import com.huawei.watchface.flavor.FlavorConfig;
import com.huawei.watchface.h5;
import com.huawei.watchface.i;
import com.huawei.watchface.mvp.model.datatype.WatchFaceSignBean;
import com.huawei.watchface.mvp.model.helper.GsonHelper;
import com.huawei.watchface.mvp.model.thread.GetSignThread;
import com.huawei.watchface.q0;
import com.huawei.watchface.q2;
import com.huawei.watchface.v0;
import com.huawei.watchface.y2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
public class WatchFaceHttpUtil {
    public static final String CONTENT_TYPE = "Content-Type";
    public static final String HTTP_CONFIG_JSON = "http_config_json";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f30611a = new HashMap(32);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map f30612b = new ConcurrentHashMap(32);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ExecutorService f30613c = Executors.newCachedThreadPool();
    public static Map d = new ConcurrentHashMap();

    public static WatchFaceSignBean A() {
        String strA = LanguageUtils.a(false);
        String deviceModel = HwWatchFaceApi.getInstance(Environment.getApplicationContext()).getDeviceModel();
        HwLog.i("WatchFaceHttpUtil", "getSignBean() language: " + strA + ", getSignBean deviceName:" + deviceModel);
        WatchFaceSignBean watchFaceSignBean = (WatchFaceSignBean) f30611a.get(strA + deviceModel);
        if (watchFaceSignBean == null) {
            HwLog.i("WatchFaceHttpUtil", "getSignBean() sign is null, get again");
            Object objB = B();
            if (objB instanceof WatchFaceSignBean) {
                HwLog.i("WatchFaceHttpUtil", "getSignBean() getSignBeanAgain success");
                return (WatchFaceSignBean) objB;
            }
        }
        return watchFaceSignBean;
    }

    public static Object B() {
        FutureTask futureTask = new FutureTask(new Callable() { // from class: com.huawei.watchface.utils.WatchFaceHttpUtil$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return WatchFaceHttpUtil.L();
            }
        });
        f30613c.execute(futureTask);
        try {
            return futureTask.get();
        } catch (InterruptedException unused) {
            HwLog.e("WatchFaceHttpUtil", "getSignBeanAgain InterruptedException!");
            return null;
        } catch (ExecutionException unused2) {
            HwLog.e("WatchFaceHttpUtil", "getSignBeanAgain ExecutionException!");
            return null;
        }
    }

    public static WatchFaceSignBean C() {
        String strA = LanguageUtils.a(false);
        String deviceModel = HwWatchFaceApi.getInstance(Environment.getApplicationContext()).getDeviceModel();
        HwLog.i("WatchFaceHttpUtil", "getSignBean language:" + strA + " getSignBean deviceName:" + deviceModel);
        return (WatchFaceSignBean) f30611a.get(strA + deviceModel);
    }

    public static String D() {
        String strB = b();
        if (TextUtils.isEmpty(strB)) {
            HwLog.e("WatchFaceHttpUtil", "getSignUrl() baseUrl is null");
            return "";
        }
        return strB + "servicesupport/theme/tis/service/getFrontParam.do?";
    }

    public static String E() {
        String strB = b();
        if (TextUtils.isEmpty(strB)) {
            HwLog.e("WatchFaceHttpUtil", "getSystemParamUrl() baseUrl is null");
            return "";
        }
        return strB + "servicesupport/theme/getSystemParam.do?";
    }

    public static String F() {
        String strB = b();
        if (TextUtils.isEmpty(strB)) {
            HwLog.e("WatchFaceHttpUtil", "getThemeAppRefreshUrl() baseUrl is null");
            return "";
        }
        return strB + "servicesupport/theme/tis/v1/service/token/refresh";
    }

    public static String G() {
        String strB = b();
        if (TextUtils.isEmpty(strB)) {
            HwLog.e("WatchFaceHttpUtil", "getThemeAppSignInUrl() baseUrl is null");
            return "";
        }
        return strB + "servicesupport/theme/tis/v1/service/user/signin";
    }

    public static String H() {
        String strB = b();
        if (TextUtils.isEmpty(strB)) {
            HwLog.e("WatchFaceHttpUtil", "getTryOutWatchFaceInfoUrl() baseUrl is null");
            return "";
        }
        return strB + "servicesupport/theme/tis/service/v2/experience/apply?";
    }

    public static String I() {
        String strB = b();
        if (TextUtils.isEmpty(strB)) {
            HwLog.e("WatchFaceHttpUtil", "getWatchFaceUrl() baseUrl is null");
            return "";
        }
        return strB + "servicesupport/theme/v2/getThemeList.do?";
    }

    public static String J() {
        String strB = b();
        if (TextUtils.isEmpty(strB)) {
            HwLog.e("WatchFaceHttpUtil", "getWatchFaceUrlBase() baseUrl is null");
            return "";
        }
        return strB + "servicesupport/theme/";
    }

    public static String K() {
        String strB = b();
        if (TextUtils.isEmpty(strB)) {
            HwLog.e("WatchFaceHttpUtil", "getWatchfaceSignatureUrl() baseUrl is null");
            return "";
        }
        return strB + "servicesupport/theme/v2/service/resource/getresourcesign";
    }

    public static /* synthetic */ Object L() {
        HwLog.i("WatchFaceHttpUtil", "getSignBeanAgain watchFaceSignBean is null.");
        GetSignThread getSignThread = new GetSignThread();
        return getSignThread.b(getSignThread.e());
    }

    public static boolean a(int i) {
        return 90200008 == i;
    }

    public static void b(WatchFaceSignBean watchFaceSignBean) {
        String strA = LanguageUtils.a(false);
        String deviceModel = HwWatchFaceApi.getInstance(Environment.getApplicationContext()).getDeviceModel();
        HwLog.i("WatchFaceHttpUtil", "setSignBean language:" + strA + "setSignBean deviceName:" + deviceModel);
        HashMap map = f30611a;
        map.put(strA + deviceModel, watchFaceSignBean);
        if (watchFaceSignBean == null) {
            HwLog.e("WatchFaceHttpUtil", "signBean is null.");
            return;
        }
        map.put(CommonConstant.StartQrLoginQrValue.QRSCENE_DEFAULT + deviceModel, watchFaceSignBean);
    }

    public static String c(String str) {
        HwLog.i("WatchFaceHttpUtil", "getWatchFaceH5Url() countryCode: " + str);
        String strC = e4.c(Environment.getApplicationContext(), str);
        if (!TextUtils.isEmpty(strC)) {
            return strC;
        }
        HwLog.i("WatchFaceHttpUtil", "getWatchFaceH5Url() url is empty.");
        String strA = v0.a().a("watchFaceH5", str);
        e4.a(Environment.getApplicationContext(), str, strA);
        return strA;
    }

    public static String d() {
        String strB = b();
        if (TextUtils.isEmpty(strB)) {
            HwLog.e("WatchFaceHttpUtil", "getBatchReportUrl() baseUrl is null");
            return "";
        }
        return strB + "servicesupport/tis/service/v1/usrbehavior/applyrecord/batchreport.do?";
    }

    public static boolean e(String str) {
        int iIndexOf = str.indexOf(":");
        return iIndexOf != -1 && "http".equalsIgnoreCase(SafeString.substring(str, 0, iIndexOf));
    }

    public static Map f() {
        Map map = f30612b;
        if (q2.isEmpty(map)) {
            q2.a(map, (Object) "x-brandChannel", (Object) String.valueOf(q0.d()));
            q2.a(map, (Object) "x-appBrand", (Object) String.valueOf(q0.b()));
            q2.a(map, (Object) "x-packagename", (Object) Environment.b());
        }
        Application applicationContext = Environment.getApplicationContext();
        if (applicationContext != null) {
            q2.a(map, (Object) "x-accountBrand", (Object) HwWatchFaceApi.getInstance(applicationContext).getAccountBrand());
        }
        return map;
    }

    public static String g() {
        String strB = b();
        if (TextUtils.isEmpty(strB)) {
            HwLog.e("WatchFaceHttpUtil", "getBatchCreateAddurl() baseUrl is null");
            return "";
        }
        return strB + "servicesupport/theme/service/v1/coupons/unlock.do?";
    }

    public static String getFileCreateResourceUrl() {
        String strB = b();
        if (TextUtils.isEmpty(strB)) {
            HwLog.e("WatchFaceHttpUtil", "getFileCreateResourceUrl() baseUrl is null");
            return "";
        }
        return strB + "servicesupport/theme/service/v2/images/file/create?";
    }

    public static String getPortraitDeleteUrl() {
        String strB = b();
        if (TextUtils.isEmpty(strB)) {
            HwLog.e("WatchFaceHttpUtil", "getPortraitDeleteUrl() baseUrl is null");
            return "";
        }
        return strB + "servicesupport/theme/service/v2/images/file/delete?";
    }

    public static String getPortraitDetachedUrl() {
        String strB = b();
        if (TextUtils.isEmpty(strB)) {
            HwLog.e("WatchFaceHttpUtil", "getPortraitDetachedUrl() baseUrl is null");
            return "";
        }
        return strB + "servicesupport/theme/service/v1/portrait/detached?";
    }

    public static String h() {
        String strB = b();
        if (TextUtils.isEmpty(strB)) {
            HwLog.e("WatchFaceHttpUtil", "getDesignerUrl() baseUrl is null");
            return "";
        }
        return strB + "servicesupport/theme/getDeveloper.do?";
    }

    public static String i() {
        String strB = b();
        if (TextUtils.isEmpty(strB)) {
            HwLog.e("WatchFaceHttpUtil", "getDownloadQueryUrl() baseUrl is null");
            return "";
        }
        return strB + "servicesupport/theme/tis/service/v2/downloadinfo/queryfree?";
    }

    public static String j() {
        String strB = b();
        if (TextUtils.isEmpty(strB)) {
            HwLog.e("WatchFaceHttpUtil", "getDownloadQueryUrl() baseUrl is null");
            return "";
        }
        return strB + "servicesupport/theme/tis/service/v2/downloadinfo/query?";
    }

    public static String k() {
        String strB = b();
        if (TextUtils.isEmpty(strB)) {
            HwLog.i("WatchFaceHttpUtil", "getJoinCnVipIAP4Url() baseUrl is null");
            return "";
        }
        return strB + "servicesupport/theme/v2/service/member/pre-order";
    }

    public static String l() {
        String strB = b();
        if (TextUtils.isEmpty(strB)) {
            HwLog.i("WatchFaceHttpUtil", "getJoinVipIAP4Url() baseUrl is null");
            return "";
        }
        return strB + "servicesupport/theme/v1/service/member/iap4createdouble";
    }

    public static String m() {
        String strB = b();
        if (TextUtils.isEmpty(strB)) {
            HwLog.w("WatchFaceHttpUtil", "getJoinVipUrl() baseUrl is null");
            return "";
        }
        return strB + "servicesupport/theme/ttdservice/service/v1/subscription/create";
    }

    public static String n() {
        String strB = b();
        if (TextUtils.isEmpty(strB)) {
            HwLog.w("WatchFaceHttpUtil", "getJoinVipV2Url() baseUrl is null");
            return "";
        }
        return strB + "servicesupport/theme/ttdservice/service/v2/subscription/create";
    }

    public static String o() {
        String strB = b();
        if (TextUtils.isEmpty(strB)) {
            HwLog.w("WatchFaceHttpUtil", "getJoinVipUrl() baseUrl is null");
            return "";
        }
        return strB + "servicesupport/theme/service/v1/resourceinfo/similar/get";
    }

    public static String p() {
        String strB = b();
        if (TextUtils.isEmpty(strB)) {
            HwLog.e("WatchFaceHttpUtil", "getMemberSignatureUrl() baseUrl is null");
            return "";
        }
        return strB + "servicesupport/theme/v2/service/member/checkright";
    }

    public static String q() {
        String strB = b();
        if (TextUtils.isEmpty(strB)) {
            HwLog.e("WatchFaceHttpUtil", "getOnlineStateUrl() baseUrl is null");
            return "";
        }
        return strB + "servicesupport/theme/getSupportOnlineInfo.do?";
    }

    public static String r() {
        String strB = b();
        if (TextUtils.isEmpty(strB)) {
            HwLog.e("WatchFaceHttpUtil", "getBuyHistoryUrl() baseUrl is null");
            return "";
        }
        return strB + "servicesupport/theme/tis/service/v2/getBuySourceByIds";
    }

    public static String s() {
        String strB = b();
        if (TextUtils.isEmpty(strB)) {
            HwLog.e("WatchFaceHttpUtil", "getPayResultUrl() baseUrl is null");
            return "";
        }
        return strB + "/servicesupport/theme/tis/service/v2/payresult/add?";
    }

    public static String t() {
        String strB = b();
        if (TextUtils.isEmpty(strB)) {
            HwLog.e("WatchFaceHttpUtil", "getPersonalizedContentUrl() baseUrl is null");
            return "";
        }
        return strB + "servicesupport/theme/getPersonalizedContent.do?";
    }

    public static WatchFaceSignBean u() {
        String strA = LanguageUtils.a(false);
        String deviceName = MobileInfoHelper.getDeviceName();
        HwLog.i("WatchFaceHttpUtil", "getPhoneTypeSignBeanNoFutureTask language:" + strA + "deviceName:" + deviceName);
        return (WatchFaceSignBean) f30611a.get(strA + deviceName);
    }

    public static String v() {
        String strA = a("campaign");
        if (TextUtils.isEmpty(strA)) {
            HwLog.e("WatchFaceHttpUtil", "getPpsAdUploadUrl() baseUrl is null");
            return "";
        }
        return strA + "music-mcs-service/v2/service/ppsJoinResult/report";
    }

    public static String w() {
        String strB = b();
        if (TextUtils.isEmpty(strB)) {
            HwLog.e("WatchFaceHttpUtil", "getQueryAll() baseUrl is null");
            return "";
        }
        return strB + "servicesupport/theme/ttdservice/service/v1/subscription/queryall?";
    }

    public static String x() {
        String strB = b();
        if (TextUtils.isEmpty(strB)) {
            HwLog.w("WatchFaceHttpUtil", "getQueryCouponsUrl() baseUrl is null");
            return "";
        }
        return strB + "servicesupport/theme/service/v1/coupons/byproduct.do?";
    }

    public static String y() {
        String strB = b();
        if (TextUtils.isEmpty(strB)) {
            HwLog.i("WatchFaceHttpUtil", "getQueryVipIAP4Url() baseUrl is null");
            return "";
        }
        return strB + "servicesupport/theme/v1/service/memberproduct/list";
    }

    public static String z() {
        String strB = b();
        if (TextUtils.isEmpty(strB)) {
            HwLog.w("WatchFaceHttpUtil", "getJoinVipUrl() baseUrl is null");
            return "";
        }
        return strB + "servicesupport/theme/ttdservice/service/v1/product/querybytype?";
    }

    public static void a(WatchFaceSignBean watchFaceSignBean) {
        String strA = LanguageUtils.a(false);
        String deviceName = MobileInfoHelper.getDeviceName();
        HwLog.i("WatchFaceHttpUtil", "setGreySignBean language:" + strA + "setGreySignBean deviceName:" + deviceName);
        HashMap map = f30611a;
        map.put(strA + deviceName, watchFaceSignBean);
        if (watchFaceSignBean == null) {
            HwLog.e("WatchFaceHttpUtil", "signBean is null.");
            return;
        }
        map.put(CommonConstant.StartQrLoginQrValue.QRSCENE_DEFAULT + deviceName, watchFaceSignBean);
    }

    public static String c() {
        String strB = b();
        if (TextUtils.isEmpty(strB)) {
            HwLog.e("WatchFaceHttpUtil", "getBatchCreateAddurl() baseUrl is null");
            return "";
        }
        return strB + "servicesupport/theme/tis/service/v2/order/add?";
    }

    public static String d(String str) {
        HwLog.i("WatchFaceHttpUtil", "getWatchFaceUrl() countryCode: " + str);
        String strD = e4.d(Environment.getApplicationContext(), str);
        if (!TextUtils.isEmpty(strD)) {
            return strD;
        }
        HwLog.i("WatchFaceHttpUtil", "getWatchFaceUrl() url is empty.");
        String strA = v0.a().a("watchFace", str);
        e4.b(Environment.getApplicationContext(), str, strA);
        return strA;
    }

    public static String g(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return SafeString.replace(str, "http:", "https:");
    }

    public static String e() {
        String strB = b();
        if (TextUtils.isEmpty(strB)) {
            HwLog.i("WatchFaceHttpUtil", "getComboPurchaseUrl() baseUrl is null");
            return "";
        }
        return strB + "servicesupport/theme/v1/service/combo-purchase/pre-order";
    }

    public static String b(LinkedHashMap linkedHashMap) {
        if (!q2.a((Map) linkedHashMap, (Object) HTTP_CONFIG_JSON)) {
            return null;
        }
        String strA = q2.a((Map) linkedHashMap, HTTP_CONFIG_JSON);
        q2.b(linkedHashMap, HTTP_CONFIG_JSON);
        return strA;
    }

    public static String a(String str, String str2, LinkedHashMap linkedHashMap, Class cls) {
        String strC;
        if (TextUtils.isEmpty(str)) {
            strC = "";
        } else {
            i iVar = new i();
            iVar.l();
            iVar.h(str);
            iVar.b(cls);
            iVar.g(str2);
            a((Map) linkedHashMap);
            iVar.d(linkedHashMap);
            h5 h5VarA = y2.b().a(str, str2, linkedHashMap, b(linkedHashMap), iVar);
            strC = h5VarA != null ? h5VarA.c() : null;
            if (!c2.a(Environment.getApplicationContext()).y()) {
                if (c2.a(Environment.getApplicationContext()).a(new HitopRespInfo(str, b(strC), strC))) {
                    q2.a((Map) linkedHashMap, (Object) "usertoken", (Object) c2.a(Environment.getApplicationContext()).o());
                    c2.a(Environment.getApplicationContext()).f(true);
                    return a(str, str2, linkedHashMap, cls);
                }
            }
            iVar.f(strC);
            iVar.a(h5VarA != null ? h5VarA.b() : null);
            iVar.m();
            iVar.j();
        }
        FlavorConfig.printNetworkLog(str, str2, GsonHelper.toJson(linkedHashMap), strC);
        return strC;
    }

    public static String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String strOptString = null;
        try {
            JSONObject jSONObject = new JSONObject(str);
            strOptString = jSONObject.optString("resultcode");
            if (TextUtils.isEmpty(strOptString)) {
                strOptString = jSONObject.optString("resultCode");
            }
        } catch (Exception e) {
            HwLog.e("WatchFaceHttpUtil", "getResultCode fail:" + HwLog.printException(e));
        }
        return strOptString == null ? "" : strOptString;
    }

    public static /* synthetic */ String f(String str) {
        String commonCountryCode = HwWatchFaceApi.getInstance(Environment.getApplicationContext()).getCommonCountryCode();
        String str2 = str + "_" + commonCountryCode;
        if (!TextUtils.isEmpty((CharSequence) d.get(str2))) {
            HwLog.d("WatchFaceHttpUtil", "get getBaseUrl from grsUrlMap");
            return (String) d.get(str2);
        }
        HwLog.i("WatchFaceHttpUtil", "get getNoCheckUrl");
        String strA = v0.a().a(str, commonCountryCode);
        d.put(str2, strA);
        return strA;
    }

    public static String b() {
        return a("watchFace");
    }

    public static String b(String str, String str2, LinkedHashMap linkedHashMap) {
        if (TextUtils.isEmpty(str)) {
            HwLog.e("WatchFaceHttpUtil", "doPost url is empty...");
            return null;
        }
        if (e(str)) {
            str = g(str);
        }
        return a(str, str2, linkedHashMap);
    }

    public static void a(HttpURLConnection httpURLConnection, LinkedHashMap linkedHashMap) {
        if (httpURLConnection == null || ArrayUtils.a(linkedHashMap)) {
            return;
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            try {
                httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            } catch (IllegalArgumentException e) {
                HwLog.i("WatchFaceHttpUtil", "generatePenetrateHeaders() e: " + HwLog.printException((Exception) e));
            }
        }
        HwLog.i("WatchFaceHttpUtil", "generatePenetrateHeaders");
    }

    public static String a(InputStream inputStream) {
        if (inputStream == null) {
            HwLog.e("WatchFaceHttpUtil", "getResponseLine inputStream is null");
            return "";
        }
        return a(inputStream, "");
    }

    public static String a(InputStream inputStream, String str) throws Throwable {
        BufferedReader bufferedReader;
        char c2;
        InputStreamReader inputStreamReader = null;
        BufferedReader bufferedReader2 = null;
        BufferedReader bufferedReader3 = null;
        inputStreamReader = null;
        inputStreamReader = null;
        inputStreamReader = null;
        try {
            try {
                InputStreamReader inputStreamReader2 = new InputStreamReader(inputStream, "UTF-8");
                try {
                    BufferedReader bufferedReader4 = new BufferedReader(inputStreamReader2);
                    try {
                        StringBuffer stringBuffer = new StringBuffer(32);
                        while (true) {
                            int i = bufferedReader4.read();
                            if (i == -1 || (c2 = (char) i) == '\n') {
                                break;
                                break;
                            }
                            if (stringBuffer.length() < 104857600) {
                                stringBuffer.append(c2);
                            } else {
                                throw new IllegalStateException("input too long");
                            }
                        }
                        String string = stringBuffer.toString();
                        a(inputStreamReader2, bufferedReader4, inputStream);
                        return string;
                    } catch (UnsupportedEncodingException unused) {
                        bufferedReader2 = bufferedReader4;
                        bufferedReader = bufferedReader2;
                        inputStreamReader = inputStreamReader2;
                        HwLog.e("WatchFaceHttpUtil", "getResponseLine doRequest UnsupportedEncodingException!");
                        a(inputStreamReader, bufferedReader, inputStream);
                        return str;
                    } catch (IOException unused2) {
                        bufferedReader3 = bufferedReader4;
                        bufferedReader = bufferedReader3;
                        inputStreamReader = inputStreamReader2;
                        HwLog.e("WatchFaceHttpUtil", "getResponseLine doRequest IOException!");
                        a(inputStreamReader, bufferedReader, inputStream);
                        return str;
                    } catch (Throwable th) {
                        th = th;
                        inputStreamReader = inputStreamReader2;
                        bufferedReader = bufferedReader4;
                        a(inputStreamReader, bufferedReader, inputStream);
                        throw th;
                    }
                } catch (UnsupportedEncodingException unused3) {
                } catch (IOException unused4) {
                } catch (Throwable th2) {
                    th = th2;
                    bufferedReader = null;
                    inputStreamReader = inputStreamReader2;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (UnsupportedEncodingException unused5) {
            bufferedReader = null;
        } catch (IOException unused6) {
            bufferedReader = null;
        } catch (Throwable th4) {
            th = th4;
            bufferedReader = null;
        }
    }

    public static void a(InputStreamReader inputStreamReader, BufferedReader bufferedReader, InputStream inputStream) {
        if (inputStreamReader != null) {
            try {
                inputStreamReader.close();
            } catch (IOException unused) {
                HwLog.e("WatchFaceHttpUtil", "closeStream doRequest close InputStreamReader error!");
            }
        }
        if (bufferedReader != null) {
            try {
                bufferedReader.close();
            } catch (IOException unused2) {
                HwLog.e("WatchFaceHttpUtil", "closeStream doRequest close BufferedReader error!");
            }
        }
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused3) {
                HwLog.e("WatchFaceHttpUtil", "closeStream doRequest close response error!");
            }
        }
    }

    public static byte[] a(String str, boolean z, HttpsURLConnection httpsURLConnection, HostnameVerifier hostnameVerifier) {
        byte[] bytes;
        if (str != null) {
            try {
                bytes = str.getBytes("UTF-8");
            } catch (UnsupportedEncodingException unused) {
                HwLog.e("WatchFaceHttpUtil", "getData UnsupportedEncodingException");
                bytes = null;
            }
        } else {
            bytes = null;
        }
        if (bytes == null) {
            HwLog.e("WatchFaceHttpUtil", "getData null post dataInfos!");
            return bytes;
        }
        httpsURLConnection.setHostnameVerifier(hostnameVerifier);
        a(httpsURLConnection, bytes);
        HwLog.i("WatchFaceHttpUtil", "getData set end");
        if (!z) {
            httpsURLConnection.setRequestProperty(j2.v, "identity");
        }
        HwLog.i("WatchFaceHttpUtil", "getData setRequestProperty jsonObject already!");
        return bytes;
    }

    public static InputStream a(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getInputStream();
        } catch (UnsupportedEncodingException unused) {
            HwLog.e("WatchFaceHttpUtil", "getInputStream UnsupportedEncodingException");
            return null;
        } catch (IOException unused2) {
            HwLog.e("WatchFaceHttpUtil", "getInputStream IOException");
            return null;
        }
    }

    public static void a(OutputStream outputStream) {
        if (outputStream != null) {
            try {
                outputStream.flush();
                outputStream.close();
            } catch (IOException unused) {
                HwLog.e("WatchFaceHttpUtil", "closeOutputStream IOException");
            }
        }
    }

    public static String a(String str, String str2, LinkedHashMap linkedHashMap) {
        if (str != null && str2 != null) {
            return a(str, str2, false, linkedHashMap);
        }
        HwLog.e("WatchFaceHttpUtil", "doHttpsPost url or data is null.");
        return null;
    }

    public static String a(String str, String str2, boolean z, LinkedHashMap linkedHashMap) throws Throwable {
        try {
            URL url = new URL(str);
            try {
                HttpsURLConnection httpsURLConnection = url.openConnection() instanceof HttpsURLConnection ? (HttpsURLConnection) url.openConnection() : null;
                HwLog.i("WatchFaceHttpUtil", "doPostRequest (HttpsURLConnection)url.openConnection();");
                if (httpsURLConnection == null) {
                    HwLog.e("WatchFaceHttpUtil", "doPostRequest urlConnection is null.");
                    return null;
                }
                if (a(httpsURLConnection)) {
                    return null;
                }
                try {
                    httpsURLConnection.setRequestMethod("POST");
                    if (str.contains("servicesupport/theme/service/v2/images/file/create?")) {
                        httpsURLConnection.setConnectTimeout(5000);
                        httpsURLConnection.setReadTimeout(5000);
                    }
                    a(httpsURLConnection, linkedHashMap);
                    HwLog.i("WatchFaceHttpUtil", "doPostRequest setRequestMethod(HTTP_POST);!");
                    byte[] bArrA = a(str2, z, httpsURLConnection, SSLSocketFactory.STRICT_HOSTNAME_VERIFIER);
                    if (bArrA == null) {
                        HwLog.e("WatchFaceHttpUtil", "doPostRequest dataInfos is null.");
                        return null;
                    }
                    InputStream inputStreamA = a(bArrA, httpsURLConnection);
                    String strA = a(inputStreamA);
                    if (inputStreamA != null) {
                        try {
                            inputStreamA.close();
                            return strA;
                        } catch (IOException unused) {
                            HwLog.e("WatchFaceHttpUtil", "doPostRequest close response IOException error!");
                        }
                    }
                    return strA;
                } catch (ProtocolException unused2) {
                    HwLog.e("WatchFaceHttpUtil", "doPostRequest setRequestMethod failed");
                    return null;
                }
            } catch (IOException unused3) {
                HwLog.e("WatchFaceHttpUtil", "doPostRequest openConnection failed");
                return null;
            }
        } catch (MalformedURLException unused4) {
            HwLog.e("WatchFaceHttpUtil", "doPostRequest MalformedURLException");
            return null;
        }
    }

    public static boolean a(HttpsURLConnection httpsURLConnection) {
        try {
            httpsURLConnection.setSSLSocketFactory(SSFCompatiableSystemCA.getInstance(Environment.getApplicationContext(), EncryptUtil.genSecureRandom()));
            HwLog.i("WatchFaceHttpUtil", "SecureSSLSocketFactory.BROWSER_COMPATIBLE_HOSTNAME_VERIFIER !");
            return false;
        } catch (IOException unused) {
            HwLog.e("WatchFaceHttpUtil", "setScoketFactoryFunc IOException");
            return true;
        } catch (KeyManagementException unused2) {
            HwLog.e("WatchFaceHttpUtil", "setScoketFactoryFunc KeyStoreException");
            return true;
        } catch (KeyStoreException unused3) {
            HwLog.e("WatchFaceHttpUtil", "setScoketFactoryFunc KeyManagementException");
            return true;
        } catch (NoSuchAlgorithmException unused4) {
            HwLog.e("WatchFaceHttpUtil", "setScoketFactoryFunc NoSuchAlgorithmException");
            return true;
        } catch (CertificateException unused5) {
            HwLog.e("WatchFaceHttpUtil", "setScoketFactoryFunc CertificateException");
            return true;
        }
    }

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0039: MOVE (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:14:0x0039 */
    public static InputStream a(byte[] bArr, HttpsURLConnection httpsURLConnection) throws Throwable {
        OutputStream outputStream;
        OutputStream outputStream2;
        OutputStream outputStream3 = null;
        try {
            try {
                httpsURLConnection.connect();
                HwLog.i("WatchFaceHttpUtil", "getHttpsResponseStream connect");
                outputStream = httpsURLConnection.getOutputStream();
                try {
                    HwLog.i("WatchFaceHttpUtil", "getHttpsResponseStream getoutput");
                    outputStream.write(bArr);
                    HwLog.i("WatchFaceHttpUtil", "getHttpsResponseStream write");
                    HwLog.i("WatchFaceHttpUtil", "getHttpsResponseStream finally closeOutputStream!");
                    a(outputStream);
                    return a((HttpURLConnection) httpsURLConnection);
                } catch (IOException unused) {
                    HwLog.e("WatchFaceHttpUtil", "getHttpsResponseStream IOException");
                    HwLog.i("WatchFaceHttpUtil", "getHttpsResponseStream finally closeOutputStream!");
                    a(outputStream);
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                outputStream3 = outputStream2;
                HwLog.i("WatchFaceHttpUtil", "getHttpsResponseStream finally closeOutputStream!");
                a(outputStream3);
                throw th;
            }
        } catch (IOException unused2) {
            outputStream = null;
        } catch (Throwable th2) {
            th = th2;
            HwLog.i("WatchFaceHttpUtil", "getHttpsResponseStream finally closeOutputStream!");
            a(outputStream3);
            throw th;
        }
    }

    public static void a(HttpURLConnection httpURLConnection, byte[] bArr) {
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoInput(true);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(30000);
        String requestProperty = httpURLConnection.getRequestProperty("Content-Type");
        HwLog.i("WatchFaceHttpUtil", "setUrlConnectionCommon() contentType: " + requestProperty);
        if (TextUtils.isEmpty(requestProperty)) {
            httpURLConnection.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
        }
        httpURLConnection.setRequestProperty("Content-Length", String.valueOf(bArr.length));
        httpURLConnection.setRequestProperty("Connection", w9.j);
        String strValueOf = String.valueOf(q0.d());
        httpURLConnection.setRequestProperty("x-brandChannel", strValueOf);
        Application applicationContext = Environment.getApplicationContext();
        if (applicationContext != null) {
            String accountBrand = HwWatchFaceApi.getInstance(applicationContext).getAccountBrand();
            httpURLConnection.setRequestProperty("x-accountBrand", accountBrand);
            String packageName = applicationContext.getPackageName();
            httpURLConnection.setRequestProperty("x-packagename", packageName);
            HwLog.i("WatchFaceHttpUtil", "setUrlConnectionCommon() accountBrand: " + accountBrand + ", pkgName: " + packageName);
        }
        String strValueOf2 = String.valueOf(q0.b());
        httpURLConnection.setRequestProperty("x-appBrand", strValueOf2);
        HwLog.i("WatchFaceHttpUtil", "setUrlConnectionCommon() brandChannel: " + strValueOf + ", appBrandId: " + strValueOf2);
    }

    public static String a(final String str) {
        try {
            FutureTask futureTask = new FutureTask(new Callable() { // from class: com.huawei.watchface.utils.WatchFaceHttpUtil$$ExternalSyntheticLambda1
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return WatchFaceHttpUtil.f(str);
                }
            });
            f30613c.execute(futureTask);
            return (String) futureTask.get();
        } catch (InterruptedException unused) {
            HwLog.e("WatchFaceHttpUtil", "getBaseUrl InterruptedException!");
            return "";
        } catch (ExecutionException unused2) {
            HwLog.e("WatchFaceHttpUtil", "getBaseUrl ExecutionException!");
            return "";
        } catch (Exception unused3) {
            HwLog.e("WatchFaceHttpUtil", "getBaseUrl Exception!");
            return "";
        }
    }

    public static void a(Map map) {
        if (map == null) {
            new LinkedHashMap();
            return;
        }
        if (ArrayUtils.a(map)) {
            return;
        }
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            if (str == null || str2 == null) {
                it.remove();
            }
        }
    }

    public static String a(LinkedHashMap linkedHashMap) {
        if (ArrayUtils.a(linkedHashMap)) {
            return "";
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            try {
                jSONObject.put((String) entry.getKey(), entry.getValue());
            } catch (JSONException e) {
                HwLog.i("WatchFaceHttpUtil", "convertMapParamsToJson: " + HwLog.printException((Exception) e));
            }
        }
        return jSONObject.toString();
    }

    public static void a() {
        HashMap map = f30611a;
        if (map == null) {
            return;
        }
        map.clear();
    }
}
