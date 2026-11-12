package com.xiaomi.smarthome.core.server.internal.api;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.miui.tsmclientsdk.MiTsmConstants;
import com.xiaomi.smarthome.account.AccountDepApi;
import com.xiaomi.smarthome.core.entity.Error;
import com.xiaomi.smarthome.core.entity.account.RefreshServiceTokenResult;
import com.xiaomi.smarthome.core.entity.net.KeyValuePair;
import com.xiaomi.smarthome.core.entity.net.NetError;
import com.xiaomi.smarthome.core.entity.net.NetRequest;
import com.xiaomi.smarthome.core.entity.net.NetResult;
import com.xiaomi.smarthome.core.server.internal.NetCallback;
import com.xiaomi.smarthome.core.server.internal.NetHandle;
import com.xiaomi.smarthome.core.server.internal.globaldynamicsetting.GlobalDynamicSettingManager;
import com.xiaomi.smarthome.core.server.internal.util.KeyValuePairUtil;
import com.xiaomi.smarthome.frame.ErrorCode;
import com.xiaomi.smarthome.frame.server_compact.ServerConstants;
import com.xiaomi.smarthome.library.common.threadpool.ThreadPoolManager;
import com.xiaomi.smarthome.library.crypto.CloudCoder;
import com.xiaomi.smarthome.library.crypto.rc4coder.Coder;
import com.xiaomi.smarthome.library.crypto.rc4coder.RC4DropCoder;
import com.xiaomi.smarthome.library.http.util.CookieUtil;
import com.xiaomi.smarthome.network.NetworkDepApi;
import com.xiaomi.smarthome.setting.LoginSetting;
import com.xiaomi.smarthome.utils.ExtsKt;
import com.xiaomi.youpin.login.entity.account.MiServiceTokenInfo;
import java.io.IOException;
import java.net.CookieManager;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Dispatcher;
import okhttp3.JavaNetCookieJar;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: loaded from: classes10.dex */
public class RouterApi {
    public static final String TAG = "RouterApi";
    private static final String XIAOQIANG_SERVER_RELEASE = "https://api.miwifi.com";
    private static volatile RouterApi sInstance;
    private static Object sLock = new Object();
    private CookieManager mCookieManager;
    private OkHttpClient mOkHttpClient;
    private MiServiceTokenInfo mServiceTokenInfo;
    private boolean mIsInitialized = false;
    private Object mRefreshLoginLock = new Object();
    private boolean mRefreshingLogin = false;

    private RouterApi() {
        OkHttpClient.Builder builderDispatcher = new OkHttpClient.Builder().dispatcher(new Dispatcher(ThreadPoolManager.getHttpThreadPool()));
        TimeUnit timeUnit = TimeUnit.SECONDS;
        OkHttpClient.Builder builderWriteTimeout = builderDispatcher.connectTimeout(20L, timeUnit).readTimeout(30L, timeUnit).writeTimeout(30L, timeUnit);
        CookieManager cookieManager = new CookieManager();
        this.mCookieManager = cookieManager;
        this.mOkHttpClient = builderWriteTimeout.cookieJar(new JavaNetCookieJar(cookieManager)).build();
    }

    private String buildUrl(NetRequest netRequest, boolean z) {
        if (z) {
            return XIAOQIANG_SERVER_RELEASE + netRequest.getPath();
        }
        return "https://api.miwifi.com/r" + netRequest.getPath();
    }

    private byte[] byteArraysConcat(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return bArr3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doUnAuthorized() {
        setInitialized(false);
    }

    private Pair<List<KeyValuePair>, String> encrypt(NetRequest netRequest, String str, boolean z) {
        String strEncryptBASE64;
        String str2 = z ? "" : "/r";
        String str3 = str2 + netRequest.getPath();
        String strGenerateNonce = CloudCoder.generateNonce(this.mServiceTokenInfo.e);
        try {
            strEncryptBASE64 = Coder.encryptBASE64(Coder.sha256Hash(byteArraysConcat(Coder.decryptBASE64(this.mServiceTokenInfo.d), Coder.decryptBASE64(strGenerateNonce))));
        } catch (InvalidKeyException | NoSuchAlgorithmException | Exception unused) {
            strEncryptBASE64 = null;
        }
        if (strEncryptBASE64 == null) {
            return null;
        }
        TreeMap treeMap = new TreeMap();
        TreeMap treeMap2 = new TreeMap();
        ArrayList arrayList = new ArrayList();
        RC4DropCoder rC4DropCoder = new RC4DropCoder(strEncryptBASE64);
        List<KeyValuePair> queryParams = netRequest.getQueryParams();
        if (queryParams != null) {
            for (KeyValuePair keyValuePair : queryParams) {
                if (!TextUtils.isEmpty(keyValuePair.getKey()) && !TextUtils.isEmpty(keyValuePair.getValue())) {
                    treeMap2.put(keyValuePair.getKey(), keyValuePair.getValue());
                }
            }
        }
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
            if (str.startsWith("miwifi.")) {
                str = str.substring(7);
            }
            if (queryParams != null) {
                for (KeyValuePair keyValuePair2 : queryParams) {
                    if (keyValuePair2.getKey().equalsIgnoreCase("deviceId")) {
                        str = keyValuePair2.getValue();
                        break;
                    }
                }
            }
            if (!TextUtils.isEmpty(str)) {
                treeMap2.put("deviceId", str);
            }
        }
        treeMap2.put("rc4_hash__", CloudCoder.generateSignature(netRequest.getMethod(), str3, treeMap2, strEncryptBASE64));
        for (Map.Entry entry : treeMap2.entrySet()) {
            String strEncrypt = rC4DropCoder.encrypt((String) entry.getValue());
            treeMap.put((String) entry.getKey(), strEncrypt);
            arrayList.add(new KeyValuePair((String) entry.getKey(), strEncrypt));
        }
        arrayList.add(new KeyValuePair(MiTsmConstants.KEY_SIGNATURE, CloudCoder.generateSignature(netRequest.getMethod(), str3, treeMap, strEncryptBASE64)));
        arrayList.add(new KeyValuePair("_nonce", strGenerateNonce));
        return Pair.create(arrayList, strGenerateNonce);
    }

    public static RouterApi getInstance() {
        if (sInstance == null) {
            synchronized (sLock) {
                try {
                    if (sInstance == null) {
                        sInstance = new RouterApi();
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
                AccountDepApi.getInstance().clearMiServiceTokenInSystem(LoginSetting.SID_XIAO_QIANG);
            } catch (Exception unused) {
                synchronized (this.mRefreshLoginLock) {
                    this.mRefreshingLogin = false;
                    if (zIsMiSystemAccount) {
                        AccountDepApi.getInstance().clearMiServiceTokenInSystem(LoginSetting.SID_XIAO_QIANG);
                    }
                    doUnAuthorized();
                    return;
                }
            }
        }
        NetworkDepApi.getInstance().refreshServiceToken(LoginSetting.SID_XIAO_QIANG, miId, zIsMiSystemAccount, miPassToken, new NetCallback<Bundle, Error>() { // from class: com.xiaomi.smarthome.core.server.internal.api.RouterApi.1
            @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
            public void onCache(Bundle bundle) {
            }

            @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
            public void onFailure(Error error) {
                synchronized (RouterApi.this.mRefreshLoginLock) {
                    RouterApi.this.mRefreshingLogin = false;
                }
                RouterApi.this.doUnAuthorized();
            }

            @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
            public void onSuccess(Bundle bundle) {
                synchronized (RouterApi.this.mRefreshLoginLock) {
                    RouterApi.this.mRefreshingLogin = false;
                }
                bundle.setClassLoader(RefreshServiceTokenResult.class.getClassLoader());
                RefreshServiceTokenResult refreshServiceTokenResult = (RefreshServiceTokenResult) bundle.getParcelable("result");
                AccountDepApi.getInstance().setMiServiceToken(LoginSetting.SID_XIAO_QIANG, refreshServiceTokenResult.serviceToken, refreshServiceTokenResult.cUserId, refreshServiceTokenResult.ssecurity, LoginSetting.COOKIE_DOMAIN_XIAO_QIANG, refreshServiceTokenResult.timeDiff);
                AccountDepApi.getInstance().saveAccount();
                RouterApi.this.setInitialized(false);
            }
        });
    }

    public String decrypt(String str, String str2) throws SecurityException {
        try {
            String strEncryptBASE64 = Coder.encryptBASE64(Coder.sha256Hash(byteArraysConcat(Coder.decryptBASE64(this.mServiceTokenInfo.d), Coder.decryptBASE64(str2))));
            if (strEncryptBASE64 == null) {
                return null;
            }
            return new RC4DropCoder(strEncryptBASE64).decrypt(str);
        } catch (InvalidKeyException | NoSuchAlgorithmException | Exception unused) {
            return null;
        }
    }

    public boolean isInitialized() {
        boolean z;
        synchronized (sLock) {
            z = this.mIsInitialized;
        }
        return z;
    }

    public NetHandle sendRequest(NetRequest netRequest, String str, boolean z, final NetCallback<NetResult, NetError> netCallback) {
        Request requestBuild;
        if (netRequest == null) {
            if (netCallback != null) {
                netCallback.onFailure(new NetError(ErrorCode.INVALID.getCode(), "RouterApi.sendRequest(netRequest=null)"));
            }
            return new NetHandle(null);
        }
        if (ServerConstants.isInternationalServer(GlobalDynamicSettingManager.getInstance().getServer())) {
            if (netCallback != null) {
                netCallback.onFailure(new NetError(ErrorCode.INVALID.getCode(), "international not support router-api"));
            }
            return new NetHandle(null);
        }
        String strBuildUrl = buildUrl(netRequest, z);
        if (!isInitialized()) {
            if (!AccountDepApi.getInstance().isMiLoggedIn()) {
                if (netCallback != null) {
                    netCallback.onFailure(new NetError(ErrorCode.INVALID.getCode(), "not loggedin"));
                }
                return new NetHandle(null);
            }
            String miId = AccountDepApi.getInstance().getMiId();
            this.mServiceTokenInfo = AccountDepApi.getInstance().getMiServiceToken(LoginSetting.SID_XIAO_QIANG);
            if (TextUtils.isEmpty(miId) || this.mServiceTokenInfo == null) {
                refreshServiceToken();
                if (netCallback != null) {
                    netCallback.onFailure(new NetError(ErrorCode.INVALID.getCode(), "RouterApi.sendRequest(mServiceTokenInfo=null)"));
                }
                return new NetHandle(null);
            }
            CookieUtil.clearAllCookie(this.mCookieManager);
            CookieUtil.addCookie(this.mCookieManager, XIAOQIANG_SERVER_RELEASE, "userId", miId, LoginSetting.COOKIE_DOMAIN_XIAO_QIANG, "/");
            CookieManager cookieManager = this.mCookieManager;
            MiServiceTokenInfo miServiceTokenInfo = this.mServiceTokenInfo;
            CookieUtil.addCookie(cookieManager, XIAOQIANG_SERVER_RELEASE, "serviceToken", miServiceTokenInfo.c, miServiceTokenInfo.f, "/");
            setInitialized(true);
        }
        final Pair<List<KeyValuePair>, String> pairEncrypt = encrypt(netRequest, str, z);
        if (pairEncrypt == null) {
            if (netCallback != null) {
                netCallback.onFailure(new NetError(ErrorCode.INVALID.getCode(), "RouterApi.sendRequest(pair=null)"));
            }
            return new NetHandle(null);
        }
        if (netRequest.getMethod().equals("POST")) {
            requestBuild = new Request.Builder().url(strBuildUrl).headers(KeyValuePairUtil.getHeaders(netRequest.getHeaders())).post(KeyValuePairUtil.getRequestBody((List) pairEncrypt.first)).build();
        } else {
            requestBuild = netRequest.getMethod().equals("GET") ? new Request.Builder().url(KeyValuePairUtil.getUrlWithQueryString(strBuildUrl, (List) pairEncrypt.first)).headers(KeyValuePairUtil.getHeaders(netRequest.getHeaders())).build() : null;
        }
        if (requestBuild == null) {
            if (netCallback != null) {
                netCallback.onFailure(new NetError(ErrorCode.INVALID.getCode(), "RouterApi.sendRequest(request=null)"));
            }
            return new NetHandle(null);
        }
        Call callNewCall = this.mOkHttpClient.newCall(requestBuild);
        callNewCall.enqueue(new Callback() { // from class: com.xiaomi.smarthome.core.server.internal.api.RouterApi.2
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
                        RouterApi.this.refreshServiceToken();
                    }
                    NetCallback netCallback2 = netCallback;
                    if (netCallback2 != null) {
                        netCallback2.onFailure(new NetError(response.code(), ""));
                        return;
                    }
                    return;
                }
                try {
                    String strDecrypt = RouterApi.this.decrypt(response.body().string(), (String) pairEncrypt.second);
                    NetResult netResult = new NetResult();
                    netResult.mResponse = strDecrypt;
                    NetCallback netCallback3 = netCallback;
                    if (netCallback3 != null) {
                        netCallback3.onSuccess(netResult);
                    }
                } catch (Exception e) {
                    if (netCallback != null) {
                        netCallback.onFailure(new NetError(ErrorCode.INVALID.getCode(), ExtsKt.getString(e)));
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
