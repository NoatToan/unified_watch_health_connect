package com.xiaomi.smarthome.core.server.internal.api;

import android.os.Bundle;
import android.text.TextUtils;
import com.xiaomi.smarthome.account.AccountDepApi;
import com.xiaomi.smarthome.core.entity.Error;
import com.xiaomi.smarthome.core.entity.account.RefreshServiceTokenResult;
import com.xiaomi.smarthome.core.entity.net.NetError;
import com.xiaomi.smarthome.core.entity.net.NetRequest;
import com.xiaomi.smarthome.core.entity.net.NetResult;
import com.xiaomi.smarthome.core.server.internal.NetCallback;
import com.xiaomi.smarthome.core.server.internal.NetHandle;
import com.xiaomi.smarthome.core.server.internal.globaldynamicsetting.GlobalDynamicSettingManager;
import com.xiaomi.smarthome.core.server.internal.util.KeyValuePairUtil;
import com.xiaomi.smarthome.frame.ErrorCode;
import com.xiaomi.smarthome.frame.server_compact.ServerConstants;
import com.xiaomi.smarthome.library.http.util.CookieUtil;
import com.xiaomi.smarthome.network.NetworkDepApi;
import com.xiaomi.smarthome.setting.LoginSetting;
import com.xiaomi.smarthome.utils.ExtsKt;
import com.xiaomi.youpin.login.entity.account.MiServiceTokenInfo;
import java.io.IOException;
import java.net.CookieManager;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.JavaNetCookieJar;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: loaded from: classes10.dex */
public class MiRechargeApi {
    public static final String RECHARGE_SERVER = "https://web.recharge.mipay.com";
    public static final String TAG = "MiRechargeApi";
    private static volatile MiRechargeApi sInstance;
    private static Object sLock = new Object();
    private CookieManager mCookieManager;
    private OkHttpClient mOkHttpClient;
    private MiServiceTokenInfo mServiceTokenInfo;
    private boolean mIsInitialized = false;
    private Object mRefreshLoginLock = new Object();
    private boolean mRefreshingLogin = false;

    private MiRechargeApi() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        OkHttpClient.Builder builderWriteTimeout = builder.connectTimeout(20L, timeUnit).readTimeout(30L, timeUnit).writeTimeout(30L, timeUnit);
        CookieManager cookieManager = new CookieManager();
        this.mCookieManager = cookieManager;
        this.mOkHttpClient = builderWriteTimeout.cookieJar(new JavaNetCookieJar(cookieManager)).build();
    }

    private String buildUrl(NetRequest netRequest) {
        return RECHARGE_SERVER + netRequest.getPath();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doUnAuthorized() {
        setInitialized(false);
    }

    public static MiRechargeApi getInstance() {
        if (sInstance == null) {
            synchronized (sLock) {
                try {
                    if (sInstance == null) {
                        sInstance = new MiRechargeApi();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return sInstance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void refreshServiceToken() {
        boolean z;
        String miId = AccountDepApi.getInstance().getMiId();
        boolean zIsMiSystemAccount = AccountDepApi.getInstance().isMiSystemAccount();
        String miPassToken = AccountDepApi.getInstance().getMiPassToken();
        synchronized (this.mRefreshLoginLock) {
            z = true;
            if (!this.mRefreshingLogin) {
                this.mRefreshingLogin = true;
                z = false;
            }
        }
        if (z) {
            return;
        }
        if (zIsMiSystemAccount) {
            try {
                AccountDepApi.getInstance().clearMiServiceTokenInSystem(LoginSetting.SID_RECHARGE_WEB);
            } catch (Exception unused) {
                synchronized (this.mRefreshLoginLock) {
                    this.mRefreshingLogin = false;
                    if (zIsMiSystemAccount) {
                        AccountDepApi.getInstance().clearMiServiceTokenInSystem(LoginSetting.SID_RECHARGE_WEB);
                    }
                    doUnAuthorized();
                    return;
                }
            }
        }
        NetworkDepApi.getInstance().refreshServiceToken(LoginSetting.SID_RECHARGE_WEB, miId, zIsMiSystemAccount, miPassToken, new NetCallback<Bundle, Error>() { // from class: com.xiaomi.smarthome.core.server.internal.api.MiRechargeApi.1
            @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
            public void onCache(Bundle bundle) {
            }

            @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
            public void onFailure(Error error) {
                synchronized (MiRechargeApi.this.mRefreshLoginLock) {
                    MiRechargeApi.this.mRefreshingLogin = false;
                }
                MiRechargeApi.this.doUnAuthorized();
            }

            @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
            public void onSuccess(Bundle bundle) {
                synchronized (MiRechargeApi.this.mRefreshLoginLock) {
                    MiRechargeApi.this.mRefreshingLogin = false;
                }
                bundle.setClassLoader(RefreshServiceTokenResult.class.getClassLoader());
                RefreshServiceTokenResult refreshServiceTokenResult = (RefreshServiceTokenResult) bundle.getParcelable("result");
                AccountDepApi.getInstance().setMiServiceToken(LoginSetting.SID_RECHARGE_WEB, refreshServiceTokenResult.serviceToken, refreshServiceTokenResult.cUserId, refreshServiceTokenResult.ssecurity, LoginSetting.COOKIE_DOMAIN_RECHARGE_WEB, refreshServiceTokenResult.timeDiff);
                AccountDepApi.getInstance().saveAccount();
                MiRechargeApi.this.setInitialized(false);
            }
        });
    }

    public boolean isInitialized() {
        boolean z;
        synchronized (sLock) {
            z = this.mIsInitialized;
        }
        return z;
    }

    public NetHandle sendRequest(NetRequest netRequest, final NetCallback<NetResult, NetError> netCallback) {
        Request requestBuild;
        if (netRequest == null) {
            if (netCallback != null) {
                netCallback.onFailure(new NetError(ErrorCode.INVALID.getCode(), "MiRechargeApi.sendRequest netRequest is null"));
            }
            return new NetHandle(null);
        }
        if (ServerConstants.isInternationalServer(GlobalDynamicSettingManager.getInstance().getServer())) {
            if (netCallback != null) {
                netCallback.onFailure(new NetError(ErrorCode.INVALID.getCode(), "international not support mirecharge-api"));
            }
            return new NetHandle(null);
        }
        String strBuildUrl = buildUrl(netRequest);
        if (!isInitialized()) {
            if (!AccountDepApi.getInstance().isMiLoggedIn()) {
                if (netCallback != null) {
                    netCallback.onFailure(new NetError(ErrorCode.INVALID.getCode(), "not loggedin"));
                }
                return new NetHandle(null);
            }
            String miId = AccountDepApi.getInstance().getMiId();
            this.mServiceTokenInfo = AccountDepApi.getInstance().getMiServiceToken(LoginSetting.SID_RECHARGE_WEB);
            if (TextUtils.isEmpty(miId) || this.mServiceTokenInfo == null) {
                refreshServiceToken();
                if (netCallback != null) {
                    netCallback.onFailure(new NetError(ErrorCode.INVALID.getCode(), "MiRechargeApi.sendRequest(mServiceTokenInfo=null)"));
                }
                return new NetHandle(null);
            }
            CookieUtil.clearAllCookie(this.mCookieManager);
            CookieUtil.addCookie(this.mCookieManager, RECHARGE_SERVER, "userId", miId, LoginSetting.COOKIE_DOMAIN_RECHARGE_WEB, "/");
            CookieManager cookieManager = this.mCookieManager;
            MiServiceTokenInfo miServiceTokenInfo = this.mServiceTokenInfo;
            CookieUtil.addCookie(cookieManager, RECHARGE_SERVER, "serviceToken", miServiceTokenInfo.c, miServiceTokenInfo.f, "/");
            setInitialized(true);
        }
        if (netRequest.getMethod().equals("POST")) {
            Request.Builder builderUrl = new Request.Builder().url(strBuildUrl);
            if (netRequest.getHeaders() != null) {
                builderUrl.headers(KeyValuePairUtil.getHeaders(netRequest.getHeaders()));
            }
            if (netRequest.getQueryParams() != null) {
                builderUrl.post(KeyValuePairUtil.getRequestBody(netRequest.getQueryParams()));
            }
            requestBuild = builderUrl.build();
        } else if (netRequest.getMethod().equals("GET")) {
            Request.Builder builder = new Request.Builder();
            if (netRequest.getHeaders() != null) {
                builder.headers(KeyValuePairUtil.getHeaders(netRequest.getHeaders()));
            }
            if (netRequest.getQueryParams() != null) {
                builder.url(KeyValuePairUtil.getUrlWithQueryString(strBuildUrl, netRequest.getQueryParams()));
            }
            requestBuild = builder.build();
        } else {
            requestBuild = null;
        }
        if (requestBuild == null) {
            if (netCallback != null) {
                netCallback.onFailure(new NetError(ErrorCode.INVALID.getCode(), "MiRechargeApi.sendRequest(request=null)"));
            }
            return new NetHandle(null);
        }
        Call callNewCall = this.mOkHttpClient.newCall(requestBuild);
        callNewCall.enqueue(new Callback() { // from class: com.xiaomi.smarthome.core.server.internal.api.MiRechargeApi.2
            @Override // okhttp3.Callback
            public void onFailure(Call call, IOException iOException) {
                NetCallback netCallback2 = netCallback;
                if (netCallback2 != null) {
                    netCallback2.onFailure(new NetError(ErrorCode.INVALID.getCode(), ExtsKt.getString(iOException)));
                }
            }

            @Override // okhttp3.Callback
            public void onResponse(Call call, Response response) throws IOException {
                if (!response.isSuccessful()) {
                    if (response.code() == 401) {
                        MiRechargeApi.this.refreshServiceToken();
                    }
                    NetCallback netCallback2 = netCallback;
                    if (netCallback2 != null) {
                        netCallback2.onFailure(new NetError(response.code(), ""));
                        return;
                    }
                    return;
                }
                try {
                    String strString = response.body().string();
                    NetResult netResult = new NetResult();
                    netResult.mResponse = strString;
                    NetCallback netCallback3 = netCallback;
                    if (netCallback3 != null) {
                        netCallback3.onSuccess(netResult);
                    }
                } catch (Exception e) {
                    if (netCallback != null) {
                        netCallback.onFailure(new NetError(ErrorCode.INVALID.getCode(), e.getMessage()));
                    }
                }
            }
        });
        return new NetHandle(callNewCall);
    }

    public void setInitialized(boolean z) {
        synchronized (sLock) {
            this.mIsInitialized = z;
        }
    }
}
