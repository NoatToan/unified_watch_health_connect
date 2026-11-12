package com.huawei.watchface.mvp.model.webview;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import androidx.core.view.ViewCompat;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.huawei.health.suggestion.model.FitRunPlayAudio;
import com.huawei.hms.hihealth.data.DeviceInfo;
import com.huawei.hms.support.api.entity.pay.HwPayConstant;
import com.huawei.hms.support.api.entity.pay.PayReq;
import com.huawei.hms.support.api.pay.PayResultInfo;
import com.huawei.openalliance.ad.constant.JsbMapKeyNames;
import com.huawei.operation.h5pro.jsmodules.device.DevicePairUtils;
import com.huawei.operation.utils.Constants;
import com.huawei.secure.android.common.encrypt.hash.HMACSHA256;
import com.huawei.secure.android.common.util.EncodeUtil;
import com.huawei.secure.android.common.util.SafeString;
import com.huawei.secure.android.common.webview.SafeWebView;
import com.huawei.watchface.R;
import com.huawei.watchface.api.HwWatchFaceApi;
import com.huawei.watchface.api.WebViewActivity;
import com.huawei.watchface.b3;
import com.huawei.watchface.c1;
import com.huawei.watchface.c2;
import com.huawei.watchface.c5;
import com.huawei.watchface.e4;
import com.huawei.watchface.e5;
import com.huawei.watchface.environment.Environment;
import com.huawei.watchface.f3;
import com.huawei.watchface.flavor.FlavorConfig;
import com.huawei.watchface.g3;
import com.huawei.watchface.g4;
import com.huawei.watchface.h2;
import com.huawei.watchface.i2;
import com.huawei.watchface.i3;
import com.huawei.watchface.k4;
import com.huawei.watchface.m;
import com.huawei.watchface.mvp.model.datatype.GetmarkeHitopIdBean;
import com.huawei.watchface.mvp.model.datatype.InstallWatchFaceBean;
import com.huawei.watchface.mvp.model.datatype.MarketH5Bean;
import com.huawei.watchface.mvp.model.datatype.querysubinfodetail.QuerySubInfoDetailResp;
import com.huawei.watchface.mvp.model.helper.GsonHelper;
import com.huawei.watchface.mvp.model.helper.JsSafeUrlSystemParamManager;
import com.huawei.watchface.mvp.model.helper.systemparam.NewSystemParamManager;
import com.huawei.watchface.mvp.model.helper.systemparam.SystemParamNames;
import com.huawei.watchface.mvp.model.pay.JsPayResult;
import com.huawei.watchface.mvp.model.pay.MagicJsPayResult;
import com.huawei.watchface.o;
import com.huawei.watchface.o0;
import com.huawei.watchface.p0;
import com.huawei.watchface.q0;
import com.huawei.watchface.q4;
import com.huawei.watchface.utils.ArrayUtils;
import com.huawei.watchface.utils.BackgroundTaskUtils;
import com.huawei.watchface.utils.CommonUtils;
import com.huawei.watchface.utils.DensityUtil;
import com.huawei.watchface.utils.HwLog;
import com.huawei.watchface.utils.MobileInfoHelper;
import com.huawei.watchface.utils.WatchFaceHttpUtil;
import com.huawei.watchface.utils.callback.MagicH5LoadingCallback;
import com.huawei.watchface.utils.constants.WatchFaceConstant;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
public class JsInterfaceMarketing {
    public static final String H5_IMAGE_NAME = "h5_image.jpg";
    private static final int LOGIN_TYPE_DO_NOTHING = 0;
    private static final int LOGIN_TYPE_GOTO_DEST = 3;
    private static final int LOGIN_TYPE_GO_HOME = 1;
    private static final int LOGIN_TYPE_REFRESH_CURRENT = 2;
    public static final int RESULT_CODE_GET_IMAGE_CONTENT = 1001;
    private static final String TAG = "JsInterfaceMarketing";
    private static final int TYPE_GET_PARAMS = 1;
    public static final int UNKNOWN_EMUI = 0;
    private static final String WQHD_FOLD_SCREEN = "2480*2200";
    private static final String X_CLIENTTRACEID = MobileInfoHelper.generateUUID();
    private String finalObjJumpUrl = "";
    protected Context mContext;
    private String mDestUrl;
    private MagicH5LoadingCallback mLoadingCallback;
    private int mLoginType;
    private String mResult;
    private SafeWebView mWebview;

    public class a implements f3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ JsPayResult f30383a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f30384b;

        public a(JsPayResult jsPayResult, String str) {
            this.f30383a = jsPayResult;
            this.f30384b = str;
        }

        @Override // com.huawei.watchface.f3
        public void a(int i, PayResultInfo payResultInfo) {
            HwLog.i(JsInterfaceMarketing.TAG, "pay onResult retCode: " + i);
            this.f30383a.setPayResultInfo(payResultInfo);
            this.f30383a.setResultCode(i);
            JsInterfaceMarketing.this.callH5PayResult(this.f30383a, this.f30384b);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            JsInterfaceMarketing.this.mWebview.clearHistory();
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            JsInterfaceMarketing.this.mWebview.reload();
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            JsInterfaceMarketing jsInterfaceMarketing = JsInterfaceMarketing.this;
            jsInterfaceMarketing.loadUrlAfterWhiteList(jsInterfaceMarketing.mDestUrl);
        }
    }

    public class e implements i3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ MagicJsPayResult f30389a;

        public e(MagicJsPayResult magicJsPayResult) {
            this.f30389a = magicJsPayResult;
        }

        @Override // com.huawei.watchface.i3
        public void a(int i, PayResultInfo payResultInfo) {
            HwLog.i(JsInterfaceMarketing.TAG, "payVip onResult resultCode:" + i);
            if (i != 0) {
                i2.a((Context) Environment.getApplicationContext()).q();
            } else {
                i2.a(JsInterfaceMarketing.this.mContext).b();
            }
            if (payResultInfo == null) {
                this.f30389a.setResultCode(i);
            } else {
                this.f30389a.copyInfo(payResultInfo);
            }
            JsInterfaceMarketing.this.callH5PayResult(this.f30389a, "transmitPayResult");
        }
    }

    public JsInterfaceMarketing(Context context) {
        this.mContext = context;
        getSupportOnlineServiceState();
    }

    private LinkedHashMap<String, String> buildBiReportInfo(String str) {
        try {
            LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                linkedHashMap.put(next, jSONObject.getString(next));
            }
            return linkedHashMap;
        } catch (JSONException unused) {
            HwLog.e(TAG, "buildBiReportInfo() Build Bi Report Info - JSONException");
            return null;
        }
    }

    private String buildHeightJson(int i) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("dp", Integer.valueOf(DensityUtil.a(i)));
        linkedHashMap.put("pixel", Integer.valueOf(i));
        return c5.a().a(linkedHashMap);
    }

    private void callH5Js(String str, String str2) {
        String strEncodeForJavaScript = EncodeUtil.encodeForJavaScript(str);
        String str3 = TAG;
        HwLog.i(str3, "callH5PayResult encodeMethod: " + strEncodeForJavaScript);
        final String str4 = Constants.JAVA_SCRIPT + strEncodeForJavaScript + Constants.LEFT_BRACKET_ONLY + str2 + Constants.RIGHT_BRACKET_ONLY;
        FlavorConfig.safeHwLog(str3, str4);
        this.mWebview.post(new Runnable() { // from class: com.huawei.watchface.mvp.model.webview.JsInterfaceMarketing$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.lambda$callH5Js$1(str4);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void callH5PayResult(JsPayResult jsPayResult, String str) {
        HwLog.i(TAG, "callH5PayResult jsCallMethod: " + str);
        try {
            if (this.mWebview == null || TextUtils.isEmpty(str)) {
                return;
            }
            callH5Js(str, c5.a().a(jsPayResult));
        } catch (Exception e2) {
            HwLog.i(TAG, "callH5PayResult Exception: " + HwLog.printException(e2));
        }
    }

    private void checkWhiteListAndJumpUrl(String str, boolean z) {
        if (this.mWebview == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            handleEmptyUrl(z);
        } else {
            loadUrlIfWhiteListed(str);
        }
    }

    private void createResult() {
        QuerySubInfoDetailResp querySubInfoDetailRespF;
        JSONObject jSONObject = new JSONObject();
        try {
            Context context = this.mContext;
            if (context == null) {
                HwLog.i(TAG, "mContext is null");
                return;
            }
            String packageName = context.getPackageName();
            jSONObject.put("appPackageName", packageName);
            try {
                PackageInfo packageInfo = this.mContext.getPackageManager().getPackageInfo(packageName, 16384);
                jSONObject.put("appVersionCode", packageInfo.versionCode);
                jSONObject.put("appVersionName", packageInfo.versionName);
            } catch (PackageManager.NameNotFoundException e2) {
                HwLog.e(TAG, HwLog.printException((Exception) e2));
            } catch (RuntimeException e3) {
                HwLog.e(TAG, "runtimeException " + HwLog.printException((Exception) e3));
            }
            int[] iArrK = CommonUtils.k();
            String str = iArrK[0] + "*" + iArrK[1];
            if (p0.k()) {
                str = WQHD_FOLD_SCREEN;
            }
            jSONObject.put("screen", str);
            jSONObject.put("statusbarHeight", buildHeightJson(CommonUtils.e(this.mContext)));
            jSONObject.put("toolbarHeight", buildHeightJson(CommonUtils.g(this.mContext)));
            jSONObject.put("themeColor", getThemeColor());
            jSONObject.put("defaultPadding", getDefaultPaddingProportion());
            jSONObject.put("appLayout", "1".equals(CommonUtils.f()) ? "Pad" : DeviceInfo.STR_TYPE_PHONE);
            jSONObject.put("os", Build.VERSION.RELEASE);
            jSONObject.put("themeVersion", "");
            HwWatchFaceApi hwWatchFaceApi = HwWatchFaceApi.getInstance(this.mContext);
            if (hwWatchFaceApi == null) {
                HwLog.i(TAG, "createResult hwWatchFaceApi is null");
                this.mResult = jSONObject.toString();
                return;
            }
            jSONObject.put("isoCode", hwWatchFaceApi.getCommonCountryCode());
            try {
                jSONObject.put("rom", CommonUtils.g());
                jSONObject.put("emuiVersionCode", p0.c());
                jSONObject.put("emuiVersionName", p0.b());
                jSONObject.put("buildNumeber", MobileInfoHelper.getBuildNumber());
                String strGenerateDeviceIDWithSeparator = MobileInfoHelper.generateDeviceIDWithSeparator();
                if (!TextUtils.isEmpty(strGenerateDeviceIDWithSeparator)) {
                    if (strGenerateDeviceIDWithSeparator.contains(":")) {
                        jSONObject.put("deviceid", SafeString.substring(strGenerateDeviceIDWithSeparator, 0, strGenerateDeviceIDWithSeparator.indexOf(":")));
                        jSONObject.put("deviceId", SafeString.substring(strGenerateDeviceIDWithSeparator, 0, strGenerateDeviceIDWithSeparator.indexOf(":")));
                    }
                    jSONObject.put("idType", SafeString.substring(strGenerateDeviceIDWithSeparator, strGenerateDeviceIDWithSeparator.indexOf("=") + 1));
                }
            } catch (Exception e4) {
                HwLog.e(TAG, "getParams error ==" + HwLog.printException(e4));
            }
            jSONObject.put("nickName", hwWatchFaceApi.getNickName());
            jSONObject.put("hc", hwWatchFaceApi.getCommonCountryCode());
            jSONObject.put("channel", 35001111);
            Locale locale = this.mContext.getResources().getConfiguration().locale;
            if (locale != null) {
                jSONObject.put("lang", locale.getLanguage() + com.huawei.openalliance.ad.constant.Constants.LINK + locale.getCountry());
            }
            jSONObject.put("extParam", "");
            jSONObject.put("userStatus", hwWatchFaceApi.isLogin());
            jSONObject.put("deviceModel", Build.MODEL);
            if (WatchFaceHttpUtil.A() != null) {
                jSONObject.put(HwPayConstant.KEY_SIGN, WatchFaceHttpUtil.A().getSign());
            }
            jSONObject.put("brand", Build.BRAND);
            jSONObject.put("deviceDigest", getDeviceDigest());
            jSONObject.put("UserToken", hwWatchFaceApi.getToken());
            jSONObject.put(JsbMapKeyNames.H5_USER_ID, hwWatchFaceApi.getUserId());
            jSONObject.put(WatchFaceConstant.X_CLIENTTRACEID, X_CLIENTTRACEID);
            jSONObject.put("userHeadUrl", hwWatchFaceApi.getHeadUrl());
            jSONObject.put("isAppMarketVersion", "1");
            String[] strArrM = c2.a(this.mContext).m();
            jSONObject.put("sessionId", ArrayUtils.a(strArrM, 0));
            jSONObject.put("sessionType", ArrayUtils.a(strArrM, 1));
            jSONObject.put("deviceType", hwWatchFaceApi.getDeviceType());
            jSONObject.put(JsbMapKeyNames.H5_NPA, HwWatchFaceApi.getInstance(Environment.getApplicationContext()).getNonPersonalizedAdSwitch(JsbMapKeyNames.H5_NPA));
            jSONObject.put(JsbMapKeyNames.HW_DSP_NPA, HwWatchFaceApi.getInstance(Environment.getApplicationContext()).getNonPersonalizedAdSwitch(JsbMapKeyNames.HW_DSP_NPA));
            jSONObject.put(JsbMapKeyNames.THIRD_DSP_NPA, HwWatchFaceApi.getInstance(Environment.getApplicationContext()).getNonPersonalizedAdSwitch(JsbMapKeyNames.THIRD_DSP_NPA));
            jSONObject.put("aarAbilityVersion", "1019100");
            jSONObject.put(DevicePairUtils.DEVICE_CONNECT_STATE, hwWatchFaceApi.getDeviceConnectState());
            jSONObject.put("connectedEquipment", hwWatchFaceApi.getConnectedEquipment());
            jSONObject.put("watchDeviceId", q0.e());
            jSONObject.put("watchDeviceIdType", "5");
            jSONObject.put("watchDeviceModel", hwWatchFaceApi.getDeviceModel() + hwWatchFaceApi.getSoftVersion());
            jSONObject.put("watchDeviceType", hwWatchFaceApi.getDeviceModel());
            jSONObject.put(HwPayConstant.KEY_SIGN_TYPE, "0");
            e5 e5VarC = e5.c();
            if (e5VarC != null && (querySubInfoDetailRespF = e5VarC.f()) != null) {
                jSONObject.put("memberStatus", querySubInfoDetailRespF.getMemberStatus() != null ? querySubInfoDetailRespF.getMemberStatus() : "0");
                if (querySubInfoDetailRespF.getSubInfo() != null) {
                    jSONObject.put("memberExpireDate", querySubInfoDetailRespF.getSubInfo().getValidDate());
                }
            }
            MagicH5LoadingCallback magicH5LoadingCallback = this.mLoadingCallback;
            if (magicH5LoadingCallback != null) {
                magicH5LoadingCallback.onMagicLoadSuccess();
            }
        } catch (JSONException e5) {
            HwLog.e(TAG, "JSONException" + HwLog.printException((Exception) e5));
        }
        this.mResult = jSONObject.toString();
    }

    private String getDefaultPaddingProportion() {
        float fJ = (CommonUtils.j() * 1.0f) / CommonUtils.f(Environment.getApplicationContext());
        HwLog.i(TAG, "getDefaultPaddingProportion : " + fJ);
        return Float.toString(fJ);
    }

    public static String getDeviceDigest() {
        String strGenerateDeviceIDWithSeparator = MobileInfoHelper.generateDeviceIDWithSeparator();
        String strSubstring = SafeString.substring(strGenerateDeviceIDWithSeparator, 0, strGenerateDeviceIDWithSeparator.indexOf(":"));
        String strA = com.huawei.watchface.b.a(DensityUtil.getStringById(CommonUtils.H() ? R.string.deviceKey : R.string.deviceKeyBelowAndroidO));
        String strGenerateDeviceIDWithSeparator2 = MobileInfoHelper.generateDeviceIDWithSeparator();
        return SafeString.substring(strGenerateDeviceIDWithSeparator2, strGenerateDeviceIDWithSeparator2.indexOf("=") + 1) + "_" + CommonUtils.a(HMACSHA256.hmacEncrypt(CommonUtils.j(strSubstring), CommonUtils.b(strA)));
    }

    private void getSupportOnlineServiceState() {
        b3 b3VarB = b3.b();
        if (b3VarB.c() == null) {
            b3VarB.f();
        }
    }

    private String getThemeColor() {
        String str = "#" + String.format(Locale.ROOT, "%06x", Integer.valueOf(DensityUtil.a(R.color.emui_accent) & ViewCompat.MEASURED_SIZE_MASK));
        HwLog.i(TAG, "getThemeColor : " + str);
        return str;
    }

    private void goBackOrJumpUrl(String str, final boolean z) {
        if (!TextUtils.isEmpty(this.finalObjJumpUrl) && TextUtils.equals(this.finalObjJumpUrl, str)) {
            this.finalObjJumpUrl = "";
        } else {
            this.finalObjJumpUrl = str;
        }
        BackgroundTaskUtils.postInMainThread(new Runnable() { // from class: com.huawei.watchface.mvp.model.webview.JsInterfaceMarketing$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.lambda$goBackOrJumpUrl$3(z);
            }
        });
    }

    private void goJumpUrl(final String str) {
        BackgroundTaskUtils.postInMainThread(new Runnable() { // from class: com.huawei.watchface.mvp.model.webview.JsInterfaceMarketing$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.lambda$goJumpUrl$2(str);
            }
        });
    }

    private void handleEmptyUrl(boolean z) {
        if (this.mWebview.canGoBack()) {
            this.mWebview.goBack();
            return;
        }
        if (z) {
            HwLog.i(TAG, "load watchface home page");
            loadUrlIfWhiteListed(HwWatchFaceApi.getInstance(this.mContext).getWatchFaceUrl(true));
            return;
        }
        HwLog.i(TAG, "H5-back-Url = null and mWebview.canGoBack() is false");
        Context context = this.mContext;
        if (context == null || !(context instanceof WebViewActivity)) {
            return;
        }
        ((WebViewActivity) context).finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: handlePaymentResult, reason: merged with bridge method [inline-methods] */
    public void lambda$payVipIap4$4(int i, PayResultInfo payResultInfo, MagicJsPayResult magicJsPayResult) {
        HwLog.i(TAG, "payVipIap4 onResult resultCode:" + i);
        if (i != 0) {
            i2.a((Context) Environment.getApplicationContext()).q();
        } else {
            i2.a(this.mContext).b();
        }
        if (payResultInfo == null) {
            magicJsPayResult.setResultCode(i);
        } else {
            magicJsPayResult.copyInfo(payResultInfo);
        }
        callH5PayResult(magicJsPayResult, "transmitPayResult");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$callH5Js$1(String str) {
        SafeWebView safeWebView = this.mWebview;
        if (safeWebView != null) {
            safeWebView.evaluateJavascript(str, new ValueCallback() { // from class: com.huawei.watchface.mvp.model.webview.JsInterfaceMarketing$$ExternalSyntheticLambda3
                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(Object obj) {
                    HwLog.i(JsInterfaceMarketing.TAG, "callH5PayResult onReceiveValue value: " + ((String) obj));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$goBackOrJumpUrl$3(boolean z) {
        checkWhiteListAndJumpUrl(this.finalObjJumpUrl, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$goJumpUrl$2(String str) {
        checkWhiteListAndJumpUrl(str, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$jumpByParam$5(MarketH5Bean marketH5Bean) {
        String hitopId;
        String version;
        c1 c1Var = new c1(marketH5Bean.getHitopId());
        GetmarkeHitopIdBean.ListBean listBeanC = c1Var.c(c1Var.g());
        if (listBeanC == null || TextUtils.isEmpty(listBeanC.getHitopId())) {
            HwLog.i(TAG, "jumpByParam listBean or hiTopId is null");
            hitopId = marketH5Bean.getHitopId();
            version = null;
        } else {
            hitopId = listBeanC.getHitopId();
            version = listBeanC.getVersion();
        }
        String from = TextUtils.isEmpty(marketH5Bean.getFrom()) ? "campaign.h5.1005" : marketH5Bean.getFrom();
        String fromSub = TextUtils.isEmpty(marketH5Bean.getFromSub()) ? "aop" : marketH5Bean.getFromSub();
        HwLog.i(TAG, "jumpByParam hiTopId:" + hitopId + ",version:" + version + ",from:" + from + ",fromSub:" + fromSub);
        goJumpUrl(HwWatchFaceApi.getInstance(this.mContext).getMagicWatchFaceDetailUrl(hitopId, version, from, fromSub));
    }

    private void loadUrl() {
        SafeWebView safeWebView;
        String str = TAG;
        HwLog.i(str, "loadUrl type:" + this.mLoginType);
        int i = this.mLoginType;
        if (i == 0) {
            HwLog.i(str, "Do nothing.");
            return;
        }
        if (i == 1) {
            HwLog.i(str, "Go home.");
            SafeWebView safeWebView2 = this.mWebview;
            if (safeWebView2 == null) {
                return;
            }
            safeWebView2.post(new b());
            return;
        }
        if (i == 2) {
            HwLog.i(str, "Refresh current.");
            SafeWebView safeWebView3 = this.mWebview;
            if (safeWebView3 == null) {
                return;
            }
            safeWebView3.post(new c());
            return;
        }
        if (i != 3) {
            return;
        }
        HwLog.i(str, "Go to new page.");
        if (TextUtils.isEmpty(this.mDestUrl) || (safeWebView = this.mWebview) == null) {
            return;
        }
        safeWebView.post(new d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void loadUrlAfterWhiteList(String str) {
        g4 g4VarC = b3.b().c();
        if (g4VarC == null || !g4VarC.a(str)) {
            return;
        }
        this.mWebview.loadUrl(str);
    }

    private void loadUrlIfWhiteListed(String str) {
        g4 g4VarC = b3.b().c();
        if (g4VarC == null || !g4VarC.a(str)) {
            this.mWebview.goBack();
        } else {
            this.mWebview.loadUrl(str);
        }
    }

    @JavascriptInterface
    public void addActionBarBackClickListener(String str) {
        if (JsSafeUrlSystemParamManager.getInstance().isInSensitiveURLWhiteList(this.mWebview, "addActionBarBackClickListener")) {
            goBackOrJumpUrl(str, false);
        }
    }

    @JavascriptInterface
    public void bireport(String str, String str2) {
        if (JsSafeUrlSystemParamManager.getInstance().isInURLWhiteList(this.mWebview)) {
            LinkedHashMap<String, String> linkedHashMapBuildBiReportInfo = buildBiReportInfo(str2);
            if (linkedHashMapBuildBiReportInfo != null) {
                m.d().a(1, str, linkedHashMapBuildBiReportInfo);
            } else {
                HwLog.w(TAG, "bireport() - Bi Info is null.");
            }
        }
    }

    @JavascriptInterface
    public void cancelDownloadApp(String str, String str2, String str3) {
        String str4 = TAG;
        HwLog.i(str4, "cancelDownloadApp() enter ");
        if (JsSafeUrlSystemParamManager.getInstance().isInSensitiveURLWhiteList(this.mWebview, "downloadApp_2")) {
            o0.a((Activity) this.mContext, this.mWebview).a(str, true);
        } else {
            HwLog.e(str4, "cancelDownloadApp() !isInSensitiveURLWhiteList2.");
        }
    }

    @JavascriptInterface
    public void checkLogin(int i, String str, String str2) {
        String str3 = TAG;
        HwLog.i(str3, "checkLogin() loginType: " + i);
        if (!JsSafeUrlSystemParamManager.getInstance().isInURLWhiteList(this.mWebview)) {
            HwLog.i(str3, "checkLogin() !isInURLWhiteList.");
            return;
        }
        if (i < 0 || i > 3) {
            HwLog.w(str3, "checkLogin() wrong type");
            return;
        }
        this.mLoginType = i;
        this.mDestUrl = str;
        if (HwWatchFaceApi.getInstance(this.mContext).isLogin() && HwWatchFaceApi.getInstance(this.mContext).isLoginParamSuitable()) {
            HwLog.i(str3, "checkLogin() has Login");
            loadUrl();
        } else {
            HwLog.i(str3, "checkLogin() not Login");
            InstallWatchFaceBean installWatchFaceBean = new InstallWatchFaceBean();
            installWatchFaceBean.setActionUrl(this.mDestUrl);
            h2.a(this.mContext).a(3, installWatchFaceBean);
        }
    }

    @JavascriptInterface
    public void chooseBuyVip(String str) {
        String str2 = TAG;
        HwLog.i(str2, "chooseBuyVip enter:" + str);
        if (!JsSafeUrlSystemParamManager.getInstance().isInURLWhiteList(this.mWebview)) {
            HwLog.e(str2, "chooseBuyVip() !isInURLWhiteList.");
            return;
        }
        try {
            MarketH5Bean marketH5Bean = (MarketH5Bean) GsonHelper.fromJson(str, MarketH5Bean.class);
            i2.a(this.mContext).a(this.mContext, HwWatchFaceApi.getInstance(this.mContext).getVipPayUrl(TextUtils.isEmpty(marketH5Bean.getFrom()) ? "campaign.h5.1005" : marketH5Bean.getFrom(), TextUtils.isEmpty(marketH5Bean.getFromSub()) ? "aop" : marketH5Bean.getFromSub()));
        } catch (Exception e2) {
            HwLog.e(TAG, "chooseBuyVip error:" + HwLog.printException(e2));
        }
    }

    @JavascriptInterface
    public void downloadApp(String str, String str2) {
        String str3 = TAG;
        HwLog.i(str3, "downloadApp() enter, campId:" + str2);
        if (!JsSafeUrlSystemParamManager.getInstance().isInSensitiveURLWhiteList(this.mWebview, "downloadApp_1")) {
            HwLog.e(str3, "downloadApp() !isInSensitiveURLWhiteList1.");
        } else {
            o0.a((Activity) this.mContext, this.mWebview).a(str, false);
            e4.f("campId", str2);
        }
    }

    @JavascriptInterface
    public void exitMarketPage() {
        String str = TAG;
        HwLog.i(str, "exitMarketPage: enter");
        if (JsSafeUrlSystemParamManager.getInstance().isInURLWhiteList(this.mWebview)) {
            o0.e();
        } else {
            HwLog.e(str, "getNetworkStatus() !isInURLWhiteList.");
        }
    }

    @JavascriptInterface
    public void getApplicationInfo(String str) {
        HwLog.i(TAG, "getApplicationInfo enter");
        getApplicationInfo(str, 9);
    }

    @JavascriptInterface
    public String getMarketH5DefaultDevice() {
        String str = TAG;
        HwLog.i(str, "getMarketH5DefaultDevice: enter");
        if (!JsSafeUrlSystemParamManager.getInstance().isInURLWhiteList(this.mWebview)) {
            HwLog.e(str, "getMarketH5DefaultDevice() !isInURLWhiteList.");
            return "";
        }
        String systemParam = NewSystemParamManager.getSystemParam(SystemParamNames.MARKET_H5_DEFAULT_DEVICE, "{\"name\":\"Galileo-L10E\",\"screen\":\"466*466\",\"themeVersion\":\"1.1\"}");
        HwLog.d(str, "getMarketH5DefaultDevice:" + systemParam);
        return systemParam;
    }

    @JavascriptInterface
    public String getNetworkStatus() {
        if (JsSafeUrlSystemParamManager.getInstance().isInURLWhiteList(this.mWebview)) {
            Context context = this.mContext;
            return context instanceof WebViewActivity ? ((WebViewActivity) context).getNetworkInfo() : "";
        }
        HwLog.e(TAG, "getNetworkStatus() !isInURLWhiteList.");
        return "";
    }

    @JavascriptInterface
    public String getParams() {
        String str = TAG;
        HwLog.i(str, "getParams: enter");
        if (JsSafeUrlSystemParamManager.getInstance().isInSensitiveURLWhiteList(this.mWebview, "getParams")) {
            return getParams(1, "");
        }
        HwLog.i(str, "getParams() !isInSensitiveURLWhiteList.");
        return "";
    }

    @JavascriptInterface
    public String getSystemInstallAppStatus(String str) {
        String str2 = TAG;
        HwLog.i(str2, "getSystemInstallAppStatus: enter ");
        if (!JsSafeUrlSystemParamManager.getInstance().isInURLWhiteList(this.mWebview) || TextUtils.isEmpty(str)) {
            return "0";
        }
        boolean zA = o.a(str);
        HwLog.i(str2, "installHiSkyToneStatus:" + zA);
        return zA ? "1" : "0";
    }

    @JavascriptInterface
    public String getWatchFaceIndexUrl() {
        return !JsSafeUrlSystemParamManager.getInstance().isInURLWhiteList(this.mWebview) ? "" : HwWatchFaceApi.getInstance(this.mContext).getWatchFaceUrl(true);
    }

    @JavascriptInterface
    public String getWatchSign(String str) {
        String str2 = TAG;
        HwLog.i(str2, "getWatchSign enter:" + str);
        if (JsSafeUrlSystemParamManager.getInstance().isInSensitiveURLWhiteList(this.mWebview, "getWatchSign")) {
            return q4.e().f();
        }
        HwLog.e(str2, "getWatchSign() !isInURLWhiteList.");
        return "";
    }

    @JavascriptInterface
    public void goBackForMagicH5(String str) {
        String str2 = TAG;
        HwLog.i(str2, "goBackForMagicH5 enter");
        if (JsSafeUrlSystemParamManager.getInstance().isInURLWhiteList(this.mWebview)) {
            goBackOrJumpUrl(str, true);
        } else {
            HwLog.e(str2, "goBackForMagicH5() !isInURLWhiteList.");
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0066  */
    @JavascriptInterface
    public void hwLog(String str, String str2, String str3) {
        byte b2;
        if (JsSafeUrlSystemParamManager.getInstance().isInURLWhiteList(this.mWebview)) {
            if (TextUtils.isEmpty(str)) {
                HwLog.w(TAG, "logger: tag == null ");
                return;
            }
            if (TextUtils.isEmpty(str3)) {
                HwLog.dBetaLog(str, str2);
                return;
            }
            int iHashCode = str3.hashCode();
            if (iHashCode != 100) {
                if (iHashCode != 101) {
                    if (iHashCode != 105) {
                        if (iHashCode == 119 && str3.equals("w")) {
                            b2 = 1;
                        } else {
                            b2 = -1;
                        }
                    } else if (str3.equals(CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT)) {
                        b2 = 0;
                    } else {
                        b2 = -1;
                    }
                } else if (str3.equals(FitRunPlayAudio.OPPORTUNITY_E)) {
                    b2 = 2;
                } else {
                    b2 = -1;
                }
            } else if (str3.equals("d")) {
                b2 = 3;
            } else {
                b2 = -1;
            }
            if (b2 == 0) {
                HwLog.iBetaLog(str, str2);
                return;
            }
            if (b2 == 1) {
                HwLog.wBetaLog(str, str2);
            } else if (b2 != 2) {
                HwLog.dBetaLog(str, str2);
            } else {
                HwLog.eBetaLog(str, str2);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0066  */
    @JavascriptInterface
    public void hwReleaseLog(String str, String str2, String str3) {
        byte b2;
        if (JsSafeUrlSystemParamManager.getInstance().isInURLWhiteList(this.mWebview)) {
            if (TextUtils.isEmpty(str)) {
                HwLog.w(TAG, "logger: tag == null ");
                return;
            }
            if (TextUtils.isEmpty(str3)) {
                HwLog.d(str, str2);
                return;
            }
            int iHashCode = str3.hashCode();
            if (iHashCode != 100) {
                if (iHashCode != 101) {
                    if (iHashCode != 105) {
                        if (iHashCode == 119 && str3.equals("w")) {
                            b2 = 1;
                        } else {
                            b2 = -1;
                        }
                    } else if (str3.equals(CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT)) {
                        b2 = 0;
                    } else {
                        b2 = -1;
                    }
                } else if (str3.equals(FitRunPlayAudio.OPPORTUNITY_E)) {
                    b2 = 2;
                } else {
                    b2 = -1;
                }
            } else if (str3.equals("d")) {
                b2 = 3;
            } else {
                b2 = -1;
            }
            if (b2 == 0) {
                HwLog.i(str, str2);
                return;
            }
            if (b2 == 1) {
                HwLog.w(str, str2);
            } else if (b2 != 2) {
                HwLog.d(str, str2);
            } else {
                HwLog.e(str, str2);
            }
        }
    }

    @JavascriptInterface
    public String isNetWork() {
        if (!JsSafeUrlSystemParamManager.getInstance().isInURLWhiteList(this.mWebview)) {
            return "";
        }
        return CommonUtils.C() + "";
    }

    @JavascriptInterface
    public boolean isRoot() {
        if (!JsSafeUrlSystemParamManager.getInstance().isInURLWhiteList(this.mWebview)) {
            return false;
        }
        boolean zE = CommonUtils.E();
        HwLog.i(TAG, "isRoot : " + zE);
        return zE;
    }

    @JavascriptInterface
    public String isWifiNet() {
        if (!JsSafeUrlSystemParamManager.getInstance().isInURLWhiteList(this.mWebview)) {
            return "";
        }
        return CommonUtils.l(this.mContext) + "";
    }

    @JavascriptInterface
    public void jumpByParam(String str) {
        String str2 = TAG;
        HwLog.i(str2, "jumpByParam enter:" + str);
        if (!JsSafeUrlSystemParamManager.getInstance().isInURLWhiteList(this.mWebview)) {
            HwLog.e(str2, "jumpByParam() !isInURLWhiteList.");
            return;
        }
        try {
            final MarketH5Bean marketH5Bean = (MarketH5Bean) GsonHelper.fromJson(str, MarketH5Bean.class);
            if (marketH5Bean == null) {
                HwLog.d(str2, "jumpByParam marketH5Bean is null.");
            } else if (TextUtils.isEmpty(marketH5Bean.getHitopId())) {
                HwLog.e(str2, "jumpByParam hiTopId is null");
            } else {
                BackgroundTaskUtils.submit(new Runnable() { // from class: com.huawei.watchface.mvp.model.webview.JsInterfaceMarketing$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.lambda$jumpByParam$5(marketH5Bean);
                    }
                });
            }
        } catch (Exception e2) {
            HwLog.e(TAG, "jumpByParam Exception:" + HwLog.printException(e2));
        }
    }

    @JavascriptInterface
    public void openDownloadApp(String str, String str2, String str3) {
        String str4 = TAG;
        HwLog.i(str4, "openDownloadApp() enter... ");
        if (JsSafeUrlSystemParamManager.getInstance().isInSensitiveURLWhiteList(this.mWebview, "openDownloadApp_1")) {
            o0.a((Activity) this.mContext, this.mWebview).a(str, str3, str2, null);
        } else {
            HwLog.e(str4, "openDownloadApp() !isInSensitiveURLWhiteList1.");
        }
    }

    @JavascriptInterface
    public void pay(String str, String str2) {
        if (JsSafeUrlSystemParamManager.getInstance().isInSensitiveURLWhiteList(this.mWebview, "pay")) {
            JsPayResult jsPayResult = new JsPayResult();
            if (TextUtils.isEmpty(str)) {
                HwLog.i(TAG, "pay payReqJson is null");
                jsPayResult.setResultCode(-1);
                callH5PayResult(jsPayResult, str2);
                return;
            }
            PayReq payReq = (PayReq) c5.a().a(str, PayReq.class);
            if (payReq == null) {
                HwLog.i(TAG, "pay payReq is null");
                jsPayResult.setResultCode(-1);
                callH5PayResult(jsPayResult, str2);
            } else {
                payReq.sdkChannel = 0;
                payReq.serviceCatalog = "X4";
                g3.b().a(payReq, new a(jsPayResult, str2));
            }
        }
    }

    @JavascriptInterface
    public void payVip(String str) {
        String str2 = TAG;
        HwLog.i(str2, "payVip  enter:" + str);
        MagicJsPayResult magicJsPayResult = new MagicJsPayResult();
        if (!JsSafeUrlSystemParamManager.getInstance().isInURLWhiteList(this.mWebview)) {
            HwLog.e(str2, "payVip() !isInURLWhiteList.");
            magicJsPayResult.setResultCode(-1);
            callH5PayResult(magicJsPayResult, "transmitPayResult");
            return;
        }
        try {
            MarketH5Bean marketH5Bean = (MarketH5Bean) GsonHelper.fromJson(str, MarketH5Bean.class);
            if (marketH5Bean != null) {
                i2.a(this.mContext).b(marketH5Bean, magicJsPayResult, new e(magicJsPayResult), CommonUtils.F());
                return;
            }
            HwLog.e(str2, "payVip MarketH5Bean is null");
            magicJsPayResult.setResultCode(-1);
            callH5PayResult(magicJsPayResult, "transmitPayResult");
        } catch (Exception e2) {
            HwLog.e(TAG, "payVip error:" + HwLog.printException(e2));
            magicJsPayResult.setResultCode(-1);
            callH5PayResult(magicJsPayResult, "transmitPayResult");
        }
    }

    @JavascriptInterface
    public void payVipIap4(String str) {
        String str2 = TAG;
        HwLog.i(str2, "payVipIap4  enter:" + str);
        final MagicJsPayResult magicJsPayResult = new MagicJsPayResult();
        if (!JsSafeUrlSystemParamManager.getInstance().isInURLWhiteList(this.mWebview)) {
            HwLog.e(str2, "payVipIap4() !isInURLWhiteList.");
            magicJsPayResult.setResultCode(-1);
            callH5PayResult(magicJsPayResult, "transmitPayResult");
            return;
        }
        try {
            MarketH5Bean marketH5Bean = (MarketH5Bean) GsonHelper.fromJson(str, MarketH5Bean.class);
            if (marketH5Bean != null) {
                i2.a(this.mContext).a(marketH5Bean, magicJsPayResult, new i3() { // from class: com.huawei.watchface.mvp.model.webview.JsInterfaceMarketing$$ExternalSyntheticLambda0
                    @Override // com.huawei.watchface.i3
                    public final void a(int i, PayResultInfo payResultInfo) {
                        this.f$0.lambda$payVipIap4$4(magicJsPayResult, i, payResultInfo);
                    }
                });
                return;
            }
            HwLog.e(str2, "payVipIap4 MarketH5Bean is null");
            magicJsPayResult.setResultCode(-1);
            callH5PayResult(magicJsPayResult, "transmitPayResult");
        } catch (Exception e2) {
            HwLog.e(TAG, "payVipIap4 error:" + HwLog.printException(e2));
            magicJsPayResult.setResultCode(-1);
            callH5PayResult(magicJsPayResult, "transmitPayResult");
        }
    }

    @JavascriptInterface
    public void recordImpressionEvent(String str) {
        String str2 = TAG;
        HwLog.i(str2, "recordImpressionEvent: enter ");
        if (JsSafeUrlSystemParamManager.getInstance().isInURLWhiteList(this.mWebview)) {
            o0.a((Activity) this.mContext, this.mWebview).d(str);
        } else {
            HwLog.e(str2, "recordImpressionEvent() !isInURLWhiteList.");
        }
    }

    @JavascriptInterface
    public void recordShowStartEvent(String str) {
        String str2 = TAG;
        HwLog.i(str2, "recordShowStartEvent: enter");
        if (JsSafeUrlSystemParamManager.getInstance().isInURLWhiteList(this.mWebview)) {
            o0.a((Activity) this.mContext, this.mWebview).e(str);
        } else {
            HwLog.e(str2, "recordShowStartEvent() !isInURLWhiteList.");
        }
    }

    public void setMagicH5LoadingCallback(MagicH5LoadingCallback magicH5LoadingCallback) {
        this.mLoadingCallback = magicH5LoadingCallback;
    }

    public void setWebView(SafeWebView safeWebView) {
        this.mWebview = safeWebView;
    }

    @JavascriptInterface
    public void showBusyNet() {
        if (JsSafeUrlSystemParamManager.getInstance().isInURLWhiteList(this.mWebview)) {
            k4.a(R.string.server_busy);
        }
    }

    @JavascriptInterface
    public void showH5Notice(String str) {
        HwLog.i(TAG, "showH5Notice: enter ");
        if (JsSafeUrlSystemParamManager.getInstance().isInSensitiveURLWhiteList(this.mWebview, "showH5Notice")) {
            k4.b(str);
        }
    }

    @JavascriptInterface
    public void showNoNet() {
        if (JsSafeUrlSystemParamManager.getInstance().isInURLWhiteList(this.mWebview)) {
            k4.a(R.string.network_is_error);
        }
    }

    @JavascriptInterface
    public void startAlbum() {
        if (JsSafeUrlSystemParamManager.getInstance().isInURLWhiteList(this.mWebview)) {
            Context context = this.mContext;
            if (context instanceof WebViewActivity) {
                CommonUtils.a((Activity) context, 1001);
            }
        }
    }

    @JavascriptInterface
    public void triggerClick(String str, String str2, String str3) {
        HwLog.i(TAG, "triggerClick enter , campId:" + str2);
        if (JsSafeUrlSystemParamManager.getInstance().isInURLWhiteList(this.mWebview)) {
            o0 o0VarA = o0.a((Activity) this.mContext, this.mWebview);
            if (o0VarA != null) {
                o0VarA.g(str);
            }
            e4.f("campId", str2);
            e4.f("operator", str3);
        }
    }

    @JavascriptInterface
    public void getApplicationInfo(String str, int i) {
        HwLog.i(TAG, "getApplicationInfo: enter ");
        if (JsSafeUrlSystemParamManager.getInstance().isInSensitiveURLWhiteList(this.mWebview, "getApplicationInfo")) {
            o0.a((Activity) this.mContext, this.mWebview).a(str, i);
        }
    }

    private String getParams(int i, String str) {
        if (i != 1) {
            return "";
        }
        createResult();
        FlavorConfig.safeHwLog(TAG, "mResult:" + this.mResult);
        return this.mResult;
    }

    @JavascriptInterface
    public void openDownloadApp(String str, String str2, String str3, String str4) {
        String str5 = TAG;
        HwLog.i(str5, "openDownloadApp() is operator: " + str4);
        if (!JsSafeUrlSystemParamManager.getInstance().isInSensitiveURLWhiteList(this.mWebview, "openDownloadApp_2")) {
            HwLog.e(str5, "openDownloadApp() !isInSensitiveURLWhiteList2.");
        } else {
            o0.a((Activity) this.mContext, this.mWebview).a(str, str3, str2, str4);
        }
    }

    @JavascriptInterface
    public void downloadApp(String str, String str2, String str3) {
        String str4 = TAG;
        HwLog.i(str4, "downloadApp() enter , campId:" + str2);
        if (!JsSafeUrlSystemParamManager.getInstance().isInSensitiveURLWhiteList(this.mWebview, "downloadApp_2")) {
            HwLog.e(str4, "downloadApp() !isInSensitiveURLWhiteList2.");
            return;
        }
        o0.a((Activity) this.mContext, this.mWebview).a(str, false);
        e4.f("campId", str2);
        e4.f("operator", str3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void callH5PayResult(MagicJsPayResult magicJsPayResult, String str) {
        HwLog.i(TAG, "callH5PayResult jsCallMethod: " + str);
        try {
            if (this.mWebview == null || TextUtils.isEmpty(str)) {
                return;
            }
            callH5Js(str, c5.a().a(magicJsPayResult));
        } catch (Exception e2) {
            HwLog.i(TAG, "callH5PayResult Exception: " + HwLog.printException(e2));
        }
    }
}
