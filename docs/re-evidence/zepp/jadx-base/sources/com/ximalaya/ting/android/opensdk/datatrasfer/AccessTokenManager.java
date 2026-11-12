package com.ximalaya.ting.android.opensdk.datatrasfer;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.huami.passport.Configs;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import com.ximalaya.ting.android.opensdk.httputil.BaseBuilder;
import com.ximalaya.ting.android.opensdk.httputil.BaseCall;
import com.ximalaya.ting.android.opensdk.httputil.BaseResponse;
import com.ximalaya.ting.android.opensdk.httputil.IHttpCallBack;
import com.ximalaya.ting.android.opensdk.httputil.XimalayaException;
import com.ximalaya.ting.android.opensdk.httputil.util.SignatureUtil;
import com.ximalaya.ting.android.opensdk.model.token.AccessToken;
import com.ximalaya.ting.android.opensdk.player.XmPlayerManager;
import com.ximalaya.ting.android.opensdk.util.SharedPreferencesUtil;
import com.ximalaya.ting.android.player.MD5;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes22.dex */
public class AccessTokenManager {
    private static final String ACCESS_TOKEN_PREF = "access_token_pref";
    private static final String AUTH2UID = "auth2uid";
    private static final String CLIENT_ID = "client_id";
    private static final String CURRENT_TIME_PREF = "current_time_pref";
    private static final String DEVICE_ID = "device_id";
    private static final String EXPIRE_IN_PREF = "expire_in_pref";
    private static final String GRANT_TYPE = "grant_type";
    private static final String GRANT_TYPE_VALUE = "client_credentials";
    private static final String NONCE = "nonce";
    public static final String REFRESH_TOKEN_PREF = "refresh_token_pref";
    private static final String SIG = "sig";
    public static final String SIMPLE_REDIRECT_URI = "simple_redirect_uri";
    public static final String SIMPLE_SSO_CODE = "simple_sso_code";
    public static final String THIRD_TOKEN = "xm_thirdToken";
    public static final String THIRD_UID = "xm_thirdUid";
    private static final String TIME_STAMP = "timestamp";
    private static AccessTokenManager mSingleton;
    private Context mContext;
    private CommonRequest.ITokenStateChange mITokenStateChange;
    private AccessToken mToken;
    private String redirectUri;
    private String ssoCode;

    private AccessTokenManager() {
    }

    private boolean checkExpire(long j, long j2) {
        return (System.currentTimeMillis() - j2) / 1000 > j;
    }

    public static AccessTokenManager getInstanse() {
        if (mSingleton == null) {
            synchronized (AccessTokenManager.class) {
                if (mSingleton == null) {
                    mSingleton = new AccessTokenManager();
                }
            }
        }
        return mSingleton;
    }

    public static String getRandomString(int i) {
        Random random = new Random();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i2 = 0; i2 < i; i2++) {
            stringBuffer.append("abcdefghijklmnopqrstuvwxyz0123456789".charAt(random.nextInt(36)));
        }
        return stringBuffer.toString();
    }

    public static void getTokenByThirdAsync() {
        HashMap map = new HashMap();
        map.put("grant_type", "token_exchange");
        long jCurrentTimeMillis = System.currentTimeMillis();
        map.put("nonce", MD5.md5(jCurrentTimeMillis + ""));
        map.put("timestamp", jCurrentTimeMillis + "");
        map.put("third_uid", getInstanse().getThirdUid());
        map.put(Configs.Params.THIRD_TOKEN, getInstanse().getThirdToken());
        try {
            map.put("client_id", CommonRequest.getInstanse().getAppKey());
        } catch (XimalayaException e) {
            e.printStackTrace();
        }
        CommonRequest.basePostRequest(DTransferConstants.GET_THIRD_LOGIN, map, new IDataCallBack<String>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.AccessTokenManager.3
            @Override // com.ximalaya.ting.android.opensdk.datatrasfer.IDataCallBack
            public void onError(int i, String str) {
            }

            @Override // com.ximalaya.ting.android.opensdk.datatrasfer.IDataCallBack
            public void onSuccess(String str) {
                if (str != null) {
                    try {
                        JSONObject jSONObject = new JSONObject(str);
                        AccessTokenManager.getInstanse().setAccessTokenAndUidByThirdType(jSONObject.optString("access_token"), jSONObject.optLong("expires_in"), AccessTokenManager.getInstanse().getThirdUid(), AccessTokenManager.getInstanse().getThirdToken());
                    } catch (JSONException e2) {
                        e2.printStackTrace();
                    }
                }
            }
        }, new BaseRequest.IRequestCallBack<String>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.AccessTokenManager.4
            @Override // com.ximalaya.ting.android.opensdk.datatrasfer.BaseRequest.IRequestCallBack
            public String success(String str) throws Exception {
                return str;
            }
        });
    }

    public static void getTokenByThirdSync() throws XimalayaException {
        try {
            HashMap map = new HashMap();
            map.put("grant_type", "token_exchange");
            long jCurrentTimeMillis = System.currentTimeMillis();
            map.put("nonce", MD5.md5(jCurrentTimeMillis + ""));
            map.put("timestamp", jCurrentTimeMillis + "");
            map.put("third_uid", getInstanse().getThirdUid());
            map.put(Configs.Params.THIRD_TOKEN, getInstanse().getThirdToken());
            try {
                map.put("client_id", CommonRequest.getInstanse().getAppKey());
            } catch (XimalayaException e) {
                e.printStackTrace();
            }
            Request.Builder builderUrlPost = BaseBuilder.urlPost(CommonRequest.replaceHttpToHttps(DTransferConstants.GET_THIRD_LOGIN), CommonRequest.CommonParams(map), CommonRequest.getInstanse().getAppsecret());
            Response responseDoSync = null;
            try {
                responseDoSync = BaseCall.getInstanse().doSync(builderUrlPost.build());
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            if (responseDoSync == null) {
                throw XimalayaException.getExceptionByCode(1010);
            }
            if (new BaseResponse(responseDoSync).getStatusCode() != 200) {
                throw XimalayaException.getExceptionByCode(1010);
            }
            try {
                JSONObject jSONObject = new JSONObject(responseDoSync.body().string());
                getInstanse().setAccessTokenAndUidByThirdType(jSONObject.optString("access_token"), jSONObject.optLong("expires_in"), getInstanse().getThirdUid(), getInstanse().getThirdToken());
            } catch (Exception unused) {
                throw XimalayaException.getExceptionByCode(1009);
            }
        } catch (Exception unused2) {
            throw XimalayaException.getExceptionByCode(1010);
        }
    }

    public static boolean isThirdToken() {
        return (TextUtils.isEmpty(getInstanse().getThirdToken()) || TextUtils.isEmpty(getInstanse().getThirdUid())) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeToken() {
        this.mToken = null;
        SharedPreferencesUtil.getInstance(this.mContext).removeByKey(ACCESS_TOKEN_PREF);
        SharedPreferencesUtil.getInstance(this.mContext).removeByKey(EXPIRE_IN_PREF);
        SharedPreferencesUtil.getInstance(this.mContext).removeByKey(CURRENT_TIME_PREF);
        SharedPreferencesUtil.getInstance(this.mContext).removeByKey(AUTH2UID);
        SharedPreferencesUtil.getInstance(this.mContext).removeByKey(REFRESH_TOKEN_PREF);
    }

    public synchronized String getAccessToken() {
        AccessToken accessToken = this.mToken;
        if (accessToken != null && !TextUtils.isEmpty(accessToken.getAccessToken())) {
            return this.mToken.getAccessToken();
        }
        return "" + System.currentTimeMillis();
    }

    public Map<String, String> getCommonParams() throws XimalayaException {
        HashMap map = new HashMap();
        map.put("client_id", CommonRequest.getInstanse().getAppKey());
        map.put("grant_type", "client_credentials");
        map.put("device_id", CommonRequest.getInstanse().getDeviceId());
        map.put("nonce", getRandomString(9));
        map.put("timestamp", System.currentTimeMillis() + "");
        map.put("sig", SignatureUtil.generateSignature(CommonRequest.getInstanse().getAppsecret(), map));
        return map;
    }

    public Context getContext() {
        return this.mContext;
    }

    @Nullable
    public String getRefreshToken() {
        AccessToken accessToken = this.mToken;
        if (accessToken != null) {
            return accessToken.getRefreshToken();
        }
        return null;
    }

    public String getThirdToken() {
        return getTokenModel().getThirdToken();
    }

    public String getThirdUid() {
        return getTokenModel().getThirdUid();
    }

    public AccessToken getTokenModel() {
        AccessToken accessToken = this.mToken;
        if (accessToken != null) {
            return accessToken;
        }
        AccessToken accessToken2 = new AccessToken();
        this.mToken = accessToken2;
        return accessToken2;
    }

    public String getUid() {
        AccessToken accessToken = this.mToken;
        return accessToken != null ? accessToken.getUid() : "";
    }

    public boolean hasLogin() {
        return !TextUtils.isEmpty(getUid());
    }

    public void init(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.mContext = applicationContext;
        this.ssoCode = SharedPreferencesUtil.getInstance(applicationContext).getString(SIMPLE_SSO_CODE);
        this.redirectUri = SharedPreferencesUtil.getInstance(this.mContext).getString(SIMPLE_REDIRECT_URI);
        getTokenModel().setThirdUid(SharedPreferencesUtil.getInstance(this.mContext).getString(THIRD_UID));
        getTokenModel().setThirdToken(SharedPreferencesUtil.getInstance(this.mContext).getString(THIRD_TOKEN));
        if (!SharedPreferencesUtil.getInstance(this.mContext).contains(ACCESS_TOKEN_PREF) || !SharedPreferencesUtil.getInstance(this.mContext).contains(EXPIRE_IN_PREF)) {
            update();
            return;
        }
        getTokenModel().setAccessToken(SharedPreferencesUtil.getInstance(this.mContext).getString(ACCESS_TOKEN_PREF));
        getTokenModel().setExpire(SharedPreferencesUtil.getInstance(this.mContext).getLong(EXPIRE_IN_PREF));
        getTokenModel().setLastGetTime(SharedPreferencesUtil.getInstance(this.mContext).getLong(CURRENT_TIME_PREF));
        getTokenModel().setUid(SharedPreferencesUtil.getInstance(this.mContext).getString(AUTH2UID));
        getTokenModel().setRefreshToken(SharedPreferencesUtil.getInstance(this.mContext).getString(REFRESH_TOKEN_PREF));
        if (TextUtils.isEmpty(this.mToken.getAccessToken()) || checkExpire(this.mToken.getExpire(), this.mToken.getLastGetTime())) {
            update();
        }
    }

    public void loginOut(final ILoginOutCallBack iLoginOutCallBack) {
        Request.Builder builderUrlPost;
        try {
            builderUrlPost = BaseBuilder.urlPost(DTransferConstants.SECURE_ACCESS_TOKEN_URL, getInstanse().getCommonParams());
        } catch (XimalayaException e) {
            e.printStackTrace();
            builderUrlPost = null;
        }
        if (builderUrlPost == null) {
            iLoginOutCallBack.onFail(-1, "初始化错误");
        } else {
            BaseCall.getInstanse().doAsync(builderUrlPost.build(), new IHttpCallBack() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.AccessTokenManager.2
                @Override // com.ximalaya.ting.android.opensdk.httputil.IHttpCallBack
                public void onFailure(int i, String str) {
                    iLoginOutCallBack.onFail(i, str);
                }

                @Override // com.ximalaya.ting.android.opensdk.httputil.IHttpCallBack
                public void onResponse(Response response) {
                    if (response.code() != 200) {
                        AccessTokenManager.this.removeToken();
                        iLoginOutCallBack.onFail(response.code(), "http 请求出错");
                        return;
                    }
                    try {
                        JSONObject jSONObject = new JSONObject(response.body().string());
                        AccessTokenManager.this.removeToken();
                        AccessTokenManager.this.ssoCode = null;
                        AccessTokenManager.this.redirectUri = null;
                        SharedPreferencesUtil.getInstance(AccessTokenManager.this.mContext).removeByKey(AccessTokenManager.SIMPLE_SSO_CODE);
                        SharedPreferencesUtil.getInstance(AccessTokenManager.this.mContext).removeByKey(AccessTokenManager.SIMPLE_REDIRECT_URI);
                        SharedPreferencesUtil.getInstance(AccessTokenManager.this.mContext).removeByKey(AccessTokenManager.THIRD_TOKEN);
                        SharedPreferencesUtil.getInstance(AccessTokenManager.this.mContext).removeByKey(AccessTokenManager.THIRD_UID);
                        AccessTokenManager.this.setAccessToken(jSONObject.optString("access_token"), jSONObject.optLong("expires_in"));
                        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.AccessTokenManager.2.1
                            @Override // java.lang.Runnable
                            public void run() {
                                ILoginOutCallBack iLoginOutCallBack2 = iLoginOutCallBack;
                                if (iLoginOutCallBack2 != null) {
                                    iLoginOutCallBack2.onSuccess();
                                }
                            }
                        });
                    } catch (Throwable th) {
                        th.printStackTrace();
                        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.AccessTokenManager.2.2
                            @Override // java.lang.Runnable
                            public void run() {
                                iLoginOutCallBack.onFail(1007, "parse response json data error");
                            }
                        });
                    }
                }
            });
        }
    }

    public void onlyUpdateAccessToken(AccessToken accessToken) {
        if (accessToken == null) {
            removeToken();
            return;
        }
        this.mToken = accessToken;
        SharedPreferencesUtil.getInstance(this.mContext).saveString(ACCESS_TOKEN_PREF, accessToken.getAccessToken());
        SharedPreferencesUtil.getInstance(this.mContext).saveLong(EXPIRE_IN_PREF, accessToken.getExpire());
        SharedPreferencesUtil.getInstance(this.mContext).saveLong(CURRENT_TIME_PREF, accessToken.getLastGetTime());
        SharedPreferencesUtil.getInstance(this.mContext).saveString(AUTH2UID, accessToken.getUid());
        SharedPreferencesUtil.getInstance(this.mContext).saveString(REFRESH_TOKEN_PREF, accessToken.getRefreshToken());
    }

    public void saveSSOCode(String str, String str2) {
        this.ssoCode = str;
        this.redirectUri = str2;
        SharedPreferencesUtil.getInstance(this.mContext).saveString(SIMPLE_SSO_CODE, str);
        SharedPreferencesUtil.getInstance(this.mContext).saveString(SIMPLE_REDIRECT_URI, str2);
    }

    public void setAccessToken(String str, long j) {
        removeToken();
        if (TextUtils.isEmpty(str) || j <= 0) {
            return;
        }
        getTokenModel().setAccessToken(str);
        getTokenModel().setExpire(j);
        long jCurrentTimeMillis = System.currentTimeMillis();
        getTokenModel().setLastGetTime(jCurrentTimeMillis);
        SharedPreferencesUtil.getInstance(this.mContext).saveString(ACCESS_TOKEN_PREF, str);
        SharedPreferencesUtil.getInstance(this.mContext).saveLong(EXPIRE_IN_PREF, j);
        SharedPreferencesUtil.getInstance(this.mContext).saveLong(CURRENT_TIME_PREF, jCurrentTimeMillis);
        XmPlayerManager.getInstance(this.mContext).setTokenToPlayForSDK(getTokenModel());
    }

    public void setAccessTokenAndUid(String str, String str2, long j, String str3) {
        if (TextUtils.isEmpty(str) || j <= 0 || TextUtils.isEmpty(str3)) {
            return;
        }
        getTokenModel().setAccessToken(str);
        getTokenModel().setExpire(j);
        getTokenModel().setUid(str3);
        getTokenModel().setRefreshToken(str2);
        long jCurrentTimeMillis = System.currentTimeMillis();
        getTokenModel().setLastGetTime(jCurrentTimeMillis);
        SharedPreferencesUtil.getInstance(this.mContext).saveString(ACCESS_TOKEN_PREF, str);
        SharedPreferencesUtil.getInstance(this.mContext).saveLong(EXPIRE_IN_PREF, j);
        SharedPreferencesUtil.getInstance(this.mContext).saveLong(CURRENT_TIME_PREF, jCurrentTimeMillis);
        SharedPreferencesUtil.getInstance(this.mContext).saveString(AUTH2UID, str3);
        SharedPreferencesUtil.getInstance(this.mContext).saveString(REFRESH_TOKEN_PREF, str2);
        XmPlayerManager.getInstance(this.mContext).setTokenToPlayForSDK(getTokenModel());
    }

    public void setAccessTokenAndUidByThirdType(String str, long j, String str2, String str3) {
        SharedPreferencesUtil.getInstance(this.mContext).saveString(THIRD_TOKEN, str3);
        SharedPreferencesUtil.getInstance(this.mContext).saveString(THIRD_UID, str2);
        getTokenModel().setThirdToken(str3);
        getTokenModel().setThirdUid(str2);
        setAccessTokenAndUid(str, null, j, str2);
    }

    public void setContext(Context context) {
        this.mContext = context.getApplicationContext();
    }

    public void setITokenStateChange(CommonRequest.ITokenStateChange iTokenStateChange) {
        this.mITokenStateChange = iTokenStateChange;
    }

    public void update() {
        CommonRequest.ITokenStateChange iTokenStateChange = this.mITokenStateChange;
        boolean tokenByRefreshAsync = iTokenStateChange != null ? iTokenStateChange.getTokenByRefreshAsync() : false;
        CommonRequest.ITokenStateChange iTokenStateChange2 = this.mITokenStateChange;
        if (iTokenStateChange2 != null && !tokenByRefreshAsync) {
            removeToken();
            this.mITokenStateChange.tokenLosted();
            return;
        }
        if (iTokenStateChange2 == null || !tokenByRefreshAsync) {
            removeToken();
            if (isThirdToken()) {
                getTokenByThirdAsync();
                return;
            }
            Request.Builder builderUrlPost = null;
            try {
                builderUrlPost = BaseBuilder.urlPost(DTransferConstants.SECURE_ACCESS_TOKEN_URL, getInstanse().getCommonParams());
            } catch (XimalayaException unused) {
            }
            if (builderUrlPost == null) {
                return;
            }
            BaseCall.getInstanse().doAsync(builderUrlPost.build(), new IHttpCallBack() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.AccessTokenManager.1
                @Override // com.ximalaya.ting.android.opensdk.httputil.IHttpCallBack
                public void onFailure(int i, String str) {
                }

                @Override // com.ximalaya.ting.android.opensdk.httputil.IHttpCallBack
                public void onResponse(Response response) {
                    if (response.code() != 200) {
                        AccessTokenManager.this.removeToken();
                        return;
                    }
                    try {
                        JSONObject jSONObject = new JSONObject(response.body().string());
                        AccessTokenManager.this.setAccessToken(jSONObject.optString("access_token"), jSONObject.optLong("expires_in"));
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            });
        }
    }

    @Deprecated
    public void setAccessTokenAndUid(String str, long j, String str2) {
        setAccessTokenAndUid(str, null, j, str2);
    }
}
