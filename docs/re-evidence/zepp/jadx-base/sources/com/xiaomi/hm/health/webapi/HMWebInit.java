package com.xiaomi.hm.health.webapi;

import android.net.TrafficStats;
import android.os.Build;
import android.text.TextUtils;
import com.huami.account.HMLoginManager;
import com.huami.account.HMLogoutManager;
import com.huami.account.api.model.HMWebAccess;
import com.huami.account.keeper.HMAccountKeeper;
import com.huami.account.service.AnonymousInfoManager;
import com.huami.mifit.sportlib.core.GPSDataController;
import com.huami.network.base.HMHttpConfig;
import com.huami.network.base.HMHttpRequest;
import com.huami.network.base.callback.IHMHttpCallback;
import com.huami.network.base.handler.IHMBasicHttpResponseHandler;
import com.huami.network.base.model.HMHttpRequestData;
import com.huami.network.base.model.HMHttpResponseData;
import com.huami.network.base.util.HMHttpUtils;
import com.huami.network.hmnetwork.callback.IHMAppInfoCallback;
import com.huami.network.hmnetwork.config.HMAppConfig;
import com.huami.network.hmnetwork.exception.GettingTokenErrorException;
import com.huami.network.hmnetwork.exception.GettingTokenInUIThreadException;
import com.huami.network.hmnetwork.server.HMServerDef;
import com.huami.network.hmnetwork.webapi.HMRestfulCodeUtil;
import com.huami.network.hmnetwork.webapi.HMWebUtil;
import com.huami.network.hmnetwork.webapi.WebResponse;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.BraceletApp;
import com.xiaomi.hm.health.baseutil.GlobalConfig;
import com.xiaomi.hm.health.baseutil.NetUtil;
import com.xiaomi.hm.health.privacy.AnonymousManager;
import com.xiaomi.hm.health.utils.ex.CrashReportExtKt;
import com.xiaomi.hm.health.webapi.HMWebInit;
import io.reactivex.Observable;
import io.reactivex.functions.Predicate;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes22.dex */
public class HMWebInit {
    public static final int TIMEOUT_MS = 60000;
    private static final String a = "HTTP_Response";
    private static final String b = "code";
    private static final String c = "mutimelong";
    private static final String d = "0102";
    private static final String[] e = {"huami.health.bindProfile.json"};

    public class a implements IHMHttpCallback {
        private void b(IHMBasicHttpResponseHandler handler) {
            HMLogoutManager.logout(4);
            handler.onCancel(5);
        }

        private void c(IHMBasicHttpResponseHandler handler) {
            HMLogoutManager.logout(2);
            handler.onCancel(2);
        }

        private void d(IHMBasicHttpResponseHandler handler, long mutexTime) {
            HMLogoutManager.mutex(mutexTime);
            handler.onCancel(3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean e(HMHttpResponseData hMHttpResponseData, String str) throws Exception {
            return hMHttpResponseData.getUrl().contains(str);
        }

        private boolean f(HMHttpRequestData request, HMHttpResponseData response, IHMBasicHttpResponseHandler handler) {
            try {
                WebResponse webResponse = WebResponse.parse(new String(response.getResponseBody()));
                int i = webResponse.code;
                if (i != 0) {
                    if (i != -1) {
                        return false;
                    }
                    try {
                        d(handler, new JSONObject(webResponse.data).getLong(HMLogoutManager.PARAM_LOGIN_TIME) * 1000);
                    } catch (Exception unused) {
                        c(handler);
                    }
                    return true;
                }
                if (HMLoginManager.isHuamiSDKLogin()) {
                    HMWebAccess.setHadFreshToken(false);
                    handler.onFailure(HMHttpRequest.createFailureResponse(request));
                    HMLog.i(HMWebInit.a, "fresh token if invalid", new Object[0]);
                } else {
                    c(handler);
                }
                return true;
            } catch (Exception e) {
                HMLog.i(HMWebInit.a, e.toString(), new Object[0]);
                for (StackTraceElement stackTraceElement : e.getStackTrace()) {
                    HMLog.i(HMWebInit.a, stackTraceElement.toString(), new Object[0]);
                }
                return false;
            }
        }

        private boolean g(HMHttpRequestData request, HMHttpResponseData response, IHMBasicHttpResponseHandler handler) {
            try {
                if (HMRestfulCodeUtil.isAuthInvalid(response.getStatusCode())) {
                    try {
                        JSONObject jSONObject = new JSONObject(WebResponse.parse(new String(response.getResponseBody())).data);
                        String string = jSONObject.getString("code");
                        if ("0108".equals(string)) {
                            d(handler, jSONObject.getLong(HMWebInit.c));
                            return true;
                        }
                        if (HMWebAccess.AUTH_SERVER_ERROR_DISABLE_APP_LOGIN.equals(string) || HMWebAccess.AUTH_SERVER_ERROR_ACCOUNT_DISABLE.equals(string)) {
                            b(handler);
                            return true;
                        }
                        HMWebAccess.setHadFreshToken(false);
                        handler.onFailure(HMHttpRequest.createFailureResponse(request));
                        HMLog.i(HMWebInit.a, "fresh token if invalid", new Object[0]);
                        return true;
                    } catch (Exception e) {
                        HMLog.i(HMWebInit.a, e.toString(), new Object[0]);
                    }
                }
            } catch (Exception unused) {
            }
            return false;
        }

        @Override // com.huami.network.base.callback.IHMHttpCallback
        public Map<String, String> getHeader() throws Exception {
            return HMWebUtil.getSystemHeader();
        }

        @Override // com.huami.network.base.callback.IHMHttpCallback
        public void log(HMHttpResponseData data) {
            String str;
            try {
                int i = BraceletApp.getContext().getApplicationInfo().uid;
                long uidRxBytes = TrafficStats.getUidRxBytes(i);
                long uidTxBytes = TrafficStats.getUidTxBytes(i);
                StringBuilder sb = new StringBuilder();
                sb.append("\n>>> TrafficStats <<<\nrx:\t");
                String str2 = "UNSUPPORTED";
                if (uidRxBytes == -1) {
                    str = "UNSUPPORTED";
                } else {
                    str = uidRxBytes + " bytes";
                }
                sb.append(str);
                sb.append("\ntx:\t");
                if (uidTxBytes != -1) {
                    str2 = uidTxBytes + " bytes";
                }
                sb.append(str2);
                HMLog.i(HMWebInit.a, sb.toString(), new Object[0]);
            } catch (Exception unused) {
                HMLog.i(HMWebInit.a, "TrafficStats error", new Object[0]);
            }
            if (data != null) {
                Map<String, String> header = data.getHeader();
                String str3 = "";
                String str4 = (header == null || !header.containsKey("X-Request-Id")) ? "" : header.get("X-Request-Id");
                StringBuilder sb2 = new StringBuilder();
                sb2.append("\n>>>> Response <<<<");
                sb2.append(data.toString());
                if (!TextUtils.isEmpty(str4)) {
                    str3 = "X-Request-Id:" + str4;
                }
                sb2.append(str3);
                HMLog.i(HMWebInit.a, sb2.toString(), new Object[0]);
            }
        }

        @Override // com.huami.network.base.callback.IHMHttpCallback
        public boolean needCancelBeforeResponse(HMHttpRequestData request, final HMHttpResponseData response, IHMBasicHttpResponseHandler handler) {
            ServerFaultHelper.handleApiStatus(request.getUrl(), response.getStatusCode());
            if (!HMWebInit.d(response.getUrl())) {
                return false;
            }
            if (!response.getUrl().contains(HMServerDef.RESPONSE_FORMAT)) {
                return g(request, response, handler);
            }
            if (Observable.fromArray(HMWebInit.e).any(new Predicate() { // from class: com.xiaomi.hm.health.webapi.a
                @Override // io.reactivex.functions.Predicate
                public final boolean test(Object obj) {
                    return HMWebInit.a.e(response, (String) obj);
                }
            }).blockingGet().booleanValue()) {
                return g(request, response, handler);
            }
            return response.isSuccess() && f(request, response, handler);
        }

        @Override // com.huami.network.base.callback.IHMHttpCallback
        public boolean onPreRequest(Map<String, String> header, HMHttpRequestData data) {
            if (header != null && !TextUtils.isEmpty(data.getTag())) {
                header.put("X-Request-Id", data.getTag());
            }
            Map<String, Object> params = data.getParams();
            if (params != null) {
                long validUid = HMLoginManager.getValidUid();
                if (validUid != -1) {
                    if (params.containsKey("userid")) {
                        params.put("userid", Long.valueOf(validUid));
                    }
                    if (params.containsKey("userId")) {
                        params.put("userId", Long.valueOf(validUid));
                    }
                }
            }
            HMLog.i(HMWebInit.a, "\n>>>> Curl <<<<\n" + HMWebUtil.assembleCurl(header, data), new Object[0]);
            HMLog.i(HMWebInit.a, "NetType:" + NetUtil.getNetType(BraceletApp.getContext()), new Object[0]);
            return true;
        }
    }

    public class b implements IHMAppInfoCallback {
        private AtomicBoolean a = new AtomicBoolean(false);

        @Override // com.huami.network.hmnetwork.callback.IHMAppInfoCallback
        public String getUserId() {
            return String.valueOf(HMLoginManager.getValidUid());
        }

        @Override // com.huami.network.hmnetwork.callback.IHMAppInfoCallback
        public boolean isAdultForAds() {
            return HMLoginManager.isAdult();
        }

        @Override // com.huami.network.hmnetwork.callback.IHMAppInfoCallback
        public boolean isHuamiSDKLogin() {
            return HMLoginManager.isHuamiSDKLogin() || AnonymousInfoManager.getAnonymousInfo() != null;
        }

        @Override // com.huami.network.hmnetwork.callback.IHMAppInfoCallback
        public boolean isNetworkConnected() {
            return NetUtil.isNetworkConnected(BraceletApp.getContext());
        }

        @Override // com.huami.network.hmnetwork.callback.IHMAppInfoCallback
        public boolean isUserValid() {
            return HMLoginManager.isUserValid() || AnonymousManager.isAnonymousLogin();
        }

        @Override // com.huami.network.hmnetwork.callback.IHMAppInfoCallback
        public void processHeader(Map<String, String> header) throws GettingTokenErrorException, GettingTokenInUIThreadException {
            if (HMHttpUtils.isMainThread()) {
                throw new GettingTokenInUIThreadException();
            }
            if (!this.a.getAndSet(true)) {
                HMLoginManager.oldAccount2HuamiAccount();
            }
            header.put("hm-privacy-diagnostics", String.valueOf(HMLoginManager.getHmPrivacyDiagnostics()));
            header.put("hm-privacy-ceip", String.valueOf(HMAccountKeeper.INSTANCE.readAgreeUserExperience()));
            if (HMLoginManager.isOldAccount()) {
                header.put("security", HMLoginManager.getSecurity());
            } else if (HMLoginManager.isHuamiSDKLogin() || AnonymousInfoManager.getAnonymousInfo() != null) {
                String token = HMWebAccess.getToken();
                if (TextUtils.isEmpty(token)) {
                    throw new GettingTokenErrorException();
                }
                header.put("apptoken", token);
            }
            header.put("User-Agent", HMWebInit.userAgentInfo());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean d(String url) {
        return HMLoginManager.isUserValid() && (TextUtils.isEmpty(url) || !HMServerDef.isThirdUrl(url)) && !GPSDataController.getInstance().isRunning();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String e(Exception exc) {
        return "User-Agent添加失败：" + exc.toString();
    }

    public static void initHttp() {
        HMWebUtil.initHttp(new a(), new b(), HMHttpConfig.Builder.get().setTimeout(60000).create());
    }

    public static boolean processResponse(int httpCode, String response, String url) {
        if (d(url)) {
            return false;
        }
        try {
            if (HMRestfulCodeUtil.isAuthInvalid(httpCode)) {
                try {
                    JSONObject jSONObject = new JSONObject(WebResponse.parse(response).data);
                    String string = jSONObject.getString("code");
                    if ("0108".equals(string)) {
                        HMLogoutManager.mutex(jSONObject.getLong(c));
                        return true;
                    }
                    if (!HMWebAccess.AUTH_SERVER_ERROR_DISABLE_APP_LOGIN.equals(string) && !HMWebAccess.AUTH_SERVER_ERROR_ACCOUNT_DISABLE.equals(string)) {
                        if ("0102".equals(string)) {
                            HMWebAccess.setHadFreshToken(false);
                        }
                        HMLog.i(a, "fresh token if invalid", new Object[0]);
                        return true;
                    }
                    HMLogoutManager.logout(4);
                    return true;
                } catch (Exception e2) {
                    HMLog.i(a, e2.toString(), new Object[0]);
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static String userAgentInfo() {
        StringBuilder sb = new StringBuilder();
        try {
            sb.append(GlobalConfig.get().isBuildAmazfit() ? "Amazfit/" : "Zepp/");
            sb.append(HMAppConfig.getVersionName());
            sb.append(" (");
            sb.append(Build.MODEL);
            sb.append("; Android ");
            sb.append(Build.VERSION.RELEASE);
            sb.append("; Density/");
            sb.append(BraceletApp.getContext().getResources().getDisplayMetrics().density);
            sb.append(")");
        } catch (Exception e2) {
            HMLog.error(a, new Function0() { // from class: gp3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return HMWebInit.e(e2);
                }
            });
            CrashReportExtKt.reportManual(e2);
            e2.printStackTrace();
        }
        return sb.toString();
    }
}
