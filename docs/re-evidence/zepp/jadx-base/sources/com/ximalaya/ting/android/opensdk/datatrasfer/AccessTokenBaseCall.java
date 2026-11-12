package com.ximalaya.ting.android.opensdk.datatrasfer;

import android.os.Bundle;
import android.text.TextUtils;
import com.alipay.sdk.m.s.a;
import com.google.gson.Gson;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import com.ximalaya.ting.android.opensdk.httputil.BaseBuilder;
import com.ximalaya.ting.android.opensdk.httputil.BaseCall;
import com.ximalaya.ting.android.opensdk.httputil.BaseResponse;
import com.ximalaya.ting.android.opensdk.httputil.IHttpCallBack;
import com.ximalaya.ting.android.opensdk.httputil.XimalayaException;
import com.ximalaya.ting.android.opensdk.httputil.XmSecretKeyUtil;
import com.ximalaya.ting.android.opensdk.model.SercretPubKey;
import com.ximalaya.ting.android.opensdk.util.DHUtil;
import com.ximalaya.ting.android.opensdk.util.Logger;
import com.ximalaya.ting.android.opensdk.util.SharedPreferencesUtil;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes22.dex */
public class AccessTokenBaseCall {
    public static final String KEY_ACCESS_TOKEN = "access_token";
    public static final String KEY_EXPIRES_IN = "expires_in";
    public static final String KEY_UID = "uid";
    public static HashSet<String> LOGIN_NEED_URL = new HashSet<String>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.AccessTokenBaseCall.1
        {
            add("/subscribe/get_albums_by_uid");
            add("/subscribe/add_or_delete");
            add("/subscribe/batch_add");
            add("/play_history/get_by_uid");
            add("/play_history/upload");
            add("/play_history/batch_upload");
            add("/play_history/batch_delete");
            add("/open_pay/client_place_order");
            add("/open_pay/get_bought_albums");
            add("/open_pay/album_bought_status");
            add("/open_pay/track_bought_status");
            add("/profile/user_info");
            add("/profile/persona");
        }
    };
    private static long lastResetTime;

    private static void checkLoginNeed(String str) throws XimalayaException {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Iterator<String> it2 = LOGIN_NEED_URL.iterator();
        boolean zIsEmpty = TextUtils.isEmpty(AccessTokenManager.getInstanse().getUid());
        while (it2.hasNext()) {
            if (str.contains(it2.next())) {
                if (!zIsEmpty || CommonRequest.getInstanse().getITokenStateChange() == null) {
                    return;
                }
                CommonRequest.getInstanse().getITokenStateChange().tokenLosted();
                throw XimalayaException.getExceptionByCode(1013);
            }
        }
    }

    public static void doAsync(final Request request, final IHttpCallBack iHttpCallBack, final Map<String, String> map, final String str, final String str2) {
        try {
            checkLoginNeed(str2);
            BaseCall.getInstanse().doAsync(request, new IHttpCallBack() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.AccessTokenBaseCall.3
                @Override // com.ximalaya.ting.android.opensdk.httputil.IHttpCallBack
                public void onFailure(int i, String str3) {
                    iHttpCallBack.onFailure(i, str3);
                }

                @Override // com.ximalaya.ting.android.opensdk.httputil.IHttpCallBack
                public void onResponse(Response response) {
                    boolean tokenBySimpleLoginSync;
                    BaseResponse baseResponse = new BaseResponse(response);
                    if (baseResponse.getStatusCode() == 200) {
                        iHttpCallBack.onResponse(response);
                        return;
                    }
                    DataErrorCategory responseHandler = CommonRequest.getInstanse().parseResponseHandler(baseResponse);
                    if (responseHandler == null || TextUtils.isEmpty(responseHandler.getErrorDesc())) {
                        iHttpCallBack.onFailure(1009, XimalayaException.ERR_MESSAGE_MAP.get(1009));
                        return;
                    }
                    if ((responseHandler.getErrorNo() == 701 || responseHandler.getErrorNo() == 702) && (request.url().toString().contains(DTransferConstants.GET_PLAY_INFO_PATH) || request.url().toString().contains(DTransferConstants.GET_ENCRYPT_EXCHANGE_PATH))) {
                        AccessTokenBaseCall.onEncryptExchanage(request, map);
                        try {
                            Response responseDoSync = null;
                            try {
                                responseDoSync = BaseCall.getInstanse().doSync("POST".equals(request.method()) ? BaseBuilder.urlPost(CommonRequest.replaceHttpToHttps(str2), CommonRequest.CommonParams(map), str).build() : BaseBuilder.urlGet(CommonRequest.replaceHttpToHttps(str2), CommonRequest.CommonParams(map), str).build());
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            BaseResponse baseResponse2 = new BaseResponse(responseDoSync);
                            if (baseResponse2.getStatusCode() == 200) {
                                iHttpCallBack.onResponse(responseDoSync);
                                return;
                            }
                            DataErrorCategory responseHandler2 = CommonRequest.getInstanse().parseResponseHandler(baseResponse2);
                            if (responseHandler2 == null || TextUtils.isEmpty(responseHandler2.getErrorDesc())) {
                                iHttpCallBack.onFailure(1009, XimalayaException.ERR_MESSAGE_MAP.get(1009));
                                return;
                            } else {
                                iHttpCallBack.onFailure(responseHandler.getErrorNo(), responseHandler.getErrorDesc());
                                return;
                            }
                        } catch (Exception unused) {
                            iHttpCallBack.onFailure(1002, XimalayaException.ERR_MESSAGE_MAP.get(1002));
                            return;
                        }
                    }
                    if (responseHandler.getErrorNo() != 206) {
                        if (responseHandler.getErrorNo() == 604) {
                            responseHandler.setErrorNo(3);
                        }
                        iHttpCallBack.onFailure(responseHandler.getErrorNo(), responseHandler.getErrorDesc());
                        return;
                    }
                    try {
                        try {
                            tokenBySimpleLoginSync = AccessTokenBaseCall.getTokenBySimpleLoginSync();
                        } catch (IOException e2) {
                            e2.printStackTrace();
                            tokenBySimpleLoginSync = false;
                        }
                        if (!tokenBySimpleLoginSync) {
                            CommonRequest.ITokenStateChange iTokenStateChange = CommonRequest.getInstanse().getITokenStateChange();
                            boolean tokenByRefreshSync = iTokenStateChange != null ? iTokenStateChange.getTokenByRefreshSync() : false;
                            if (iTokenStateChange != null && !tokenByRefreshSync && AccessTokenBaseCall.isNeedLoginUrl(str2)) {
                                iTokenStateChange.tokenLosted();
                                iHttpCallBack.onFailure(1013, XimalayaException.ERR_MESSAGE_MAP.get(1013));
                                return;
                            } else if (!tokenByRefreshSync) {
                                if (AccessTokenManager.isThirdToken()) {
                                    AccessTokenManager.getTokenByThirdSync();
                                } else {
                                    AccessTokenBaseCall.getTokenByOrdinarySync();
                                }
                            }
                        }
                        try {
                            Response responseDoSync2 = BaseCall.getInstanse().doSync("POST".equals(request.method()) ? BaseBuilder.urlPost(str2, CommonRequest.CommonParams(map), str).build() : BaseBuilder.urlGet(str2, CommonRequest.CommonParams(map), str).build());
                            BaseResponse baseResponse3 = new BaseResponse(responseDoSync2);
                            if (baseResponse3.getStatusCode() == 200) {
                                iHttpCallBack.onResponse(responseDoSync2);
                                return;
                            }
                            DataErrorCategory responseHandler3 = CommonRequest.getInstanse().parseResponseHandler(baseResponse3);
                            if (responseHandler3 != null && !TextUtils.isEmpty(responseHandler3.getErrorDesc())) {
                                iHttpCallBack.onFailure(responseHandler3.getErrorNo(), responseHandler3.getErrorDesc());
                                return;
                            }
                            iHttpCallBack.onFailure(1009, XimalayaException.ERR_MESSAGE_MAP.get(1009));
                        } catch (Exception unused2) {
                            iHttpCallBack.onFailure(1002, XimalayaException.ERR_MESSAGE_MAP.get(1002));
                        }
                    } catch (XimalayaException e3) {
                        iHttpCallBack.onFailure(e3.getErrorCode(), e3.getErrorMessage());
                    } catch (Exception e4) {
                        if (TextUtils.isEmpty(e4.getMessage())) {
                            iHttpCallBack.onFailure(1011, XimalayaException.ERR_MESSAGE_MAP.get(1011));
                        } else {
                            iHttpCallBack.onFailure(1011, e4.getMessage());
                        }
                    }
                }
            });
        } catch (XimalayaException e) {
            e.printStackTrace();
            if (iHttpCallBack != null) {
                iHttpCallBack.onFailure(1014, XimalayaException.ERR_MESSAGE_MAP.get(1014));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v5, types: [okhttp3.Response] */
    public static String doSync(Request request, Map<String, String> map, String str, String str2) throws XimalayaException {
        boolean tokenBySimpleLoginSync;
        checkLoginNeed(str2);
        try {
            Response responseDoSync = BaseCall.getInstanse().doSync(request);
            BaseResponse baseResponse = new BaseResponse(responseDoSync);
            String strDoSync = 0;
            Response response = 0;
            if (responseDoSync.code() == 200) {
                return responseDoSync.body().string();
            }
            DataErrorCategory responseHandler = CommonRequest.getInstanse().parseResponseHandler(baseResponse);
            if (responseHandler == null || TextUtils.isEmpty(responseHandler.getErrorDesc())) {
                throw new XimalayaException(1009, baseResponse.toString());
            }
            if ((responseHandler.getErrorNo() != 701 && responseHandler.getErrorNo() != 702) || (!request.url().toString().contains(DTransferConstants.GET_PLAY_INFO_PATH) && !request.url().toString().contains(DTransferConstants.GET_ENCRYPT_EXCHANGE_PATH))) {
                if (responseHandler.getErrorNo() != 206) {
                    return null;
                }
                try {
                    tokenBySimpleLoginSync = getTokenBySimpleLoginSync();
                } catch (IOException e) {
                    e.printStackTrace();
                    tokenBySimpleLoginSync = false;
                }
                if (!tokenBySimpleLoginSync) {
                    CommonRequest.ITokenStateChange iTokenStateChange = CommonRequest.getInstanse().getITokenStateChange();
                    boolean tokenByRefreshSync = iTokenStateChange != null ? iTokenStateChange.getTokenByRefreshSync() : false;
                    if (iTokenStateChange != null && !tokenByRefreshSync && isNeedLoginUrl(str2)) {
                        iTokenStateChange.tokenLosted();
                        throw XimalayaException.getExceptionByCode(1013);
                    }
                    if (!tokenByRefreshSync) {
                        if (AccessTokenManager.isThirdToken()) {
                            AccessTokenManager.getTokenByThirdSync();
                        } else {
                            getTokenByOrdinarySync();
                        }
                    }
                }
                try {
                    BaseResponse baseResponse2 = new BaseResponse(BaseCall.getInstanse().doSync("POST".equals(request.method()) ? BaseBuilder.urlPost(CommonRequest.replaceHttpToHttps(str2), CommonRequest.CommonParams(map), str).build() : BaseBuilder.urlGet(CommonRequest.replaceHttpToHttps(str2), CommonRequest.CommonParams(map), str).build()));
                    if (baseResponse2.getStatusCode() == 200) {
                        return baseResponse2.getResponseBodyToString();
                    }
                    DataErrorCategory responseHandler2 = CommonRequest.getInstanse().parseResponseHandler(baseResponse2);
                    if (responseHandler2 != null && !TextUtils.isEmpty(responseHandler2.getErrorDesc())) {
                        throw new XimalayaException(responseHandler2.getErrorNo(), responseHandler2.getErrorDesc());
                    }
                    throw XimalayaException.getExceptionByCode(1009);
                } catch (Exception e2) {
                    if (!TextUtils.isEmpty(e2.getMessage())) {
                        throw XimalayaException.getExceptionByCode(1007);
                    }
                    e2.printStackTrace();
                    throw XimalayaException.getExceptionByCode(1009);
                }
            }
            onEncryptExchanage(request, map);
            try {
                try {
                    strDoSync = BaseCall.getInstanse().doSync("POST".equals(request.method()) ? BaseBuilder.urlPost(CommonRequest.replaceHttpToHttps(str2), CommonRequest.CommonParams(map), str).build() : BaseBuilder.urlGet(CommonRequest.replaceHttpToHttps(str2), CommonRequest.CommonParams(map), str).build());
                    response = strDoSync;
                } catch (Exception e3) {
                    e3.printStackTrace();
                }
                BaseResponse baseResponse3 = new BaseResponse(response);
                if (baseResponse3.getStatusCode() == 200) {
                    return baseResponse3.getResponseBodyToString();
                }
                DataErrorCategory responseHandler3 = CommonRequest.getInstanse().parseResponseHandler(baseResponse3);
                if (responseHandler3 != null && !TextUtils.isEmpty(responseHandler3.getErrorDesc())) {
                    throw new XimalayaException(responseHandler3.getErrorNo(), responseHandler3.getErrorDesc());
                }
                throw XimalayaException.getExceptionByCode(1009);
            } catch (Exception unused) {
                return strDoSync;
            }
        } catch (XimalayaException e4) {
            throw e4;
        } catch (Exception e5) {
            if (TextUtils.isEmpty(e5.getMessage())) {
                throw new XimalayaException(1011, XimalayaException.ERR_MESSAGE_MAP.get(1011));
            }
            throw new XimalayaException(1011, e5.getMessage());
        }
    }

    private static String getString(Bundle bundle, String str, String str2) {
        String string;
        return (bundle == null || (string = bundle.getString(str)) == null) ? str2 : string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void getTokenByOrdinarySync() throws XimalayaException {
        try {
            Response responseDoSync = null;
            try {
                responseDoSync = BaseCall.getInstanse().doSync(BaseBuilder.urlPost(DTransferConstants.SECURE_ACCESS_TOKEN_URL, AccessTokenManager.getInstanse().getCommonParams()).build());
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (responseDoSync == null) {
                throw XimalayaException.getExceptionByCode(1010);
            }
            if (new BaseResponse(responseDoSync).getStatusCode() != 200) {
                throw XimalayaException.getExceptionByCode(1010);
            }
            try {
                JSONObject jSONObject = new JSONObject(responseDoSync.body().string());
                AccessTokenManager.getInstanse().setAccessToken(jSONObject.optString("access_token"), jSONObject.optLong("expires_in"));
            } catch (Exception unused) {
                throw XimalayaException.getExceptionByCode(1009);
            }
        } catch (Exception unused2) {
            throw XimalayaException.getExceptionByCode(1010);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean getTokenBySimpleLoginSync() throws IOException {
        SharedPreferencesUtil sharedPreferencesUtil = SharedPreferencesUtil.getInstance(AccessTokenManager.getInstanse().getContext());
        if (sharedPreferencesUtil.contains(AccessTokenManager.SIMPLE_SSO_CODE)) {
            String string = sharedPreferencesUtil.getString(AccessTokenManager.SIMPLE_SSO_CODE);
            String strSimpleLoginSync = CommonRequest.simpleLoginSync(new HashMap<String, String>(string, sharedPreferencesUtil) { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.AccessTokenBaseCall.4
                public final /* synthetic */ SharedPreferencesUtil val$preferencesUtil;
                public final /* synthetic */ String val$ssoCode;

                {
                    this.val$ssoCode = string;
                    this.val$preferencesUtil = sharedPreferencesUtil;
                    put("sso_code", string);
                    put("redirect_uri", sharedPreferencesUtil.getString(AccessTokenManager.SIMPLE_REDIRECT_URI));
                }
            });
            if (!TextUtils.isEmpty(strSimpleLoginSync)) {
                try {
                    Bundle bundle = (Bundle) Class.forName("com.ximalaya.ting.android.opensdk.auth.utils.Utility").getDeclaredMethod("parseUrl", String.class).invoke(null, strSimpleLoginSync);
                    if (bundle != null && bundle.containsKey("access_token") && !TextUtils.isEmpty(getString(bundle, "access_token", ""))) {
                        String string2 = getString(bundle, "expires_in", "");
                        long jCurrentTimeMillis = 0;
                        if (!TextUtils.isEmpty(string2) && !string2.equals("0")) {
                            jCurrentTimeMillis = System.currentTimeMillis() + (Long.parseLong(string2) * 1000);
                        }
                        AccessTokenManager.getInstanse().setAccessTokenAndUid(getString(bundle, "access_token", ""), jCurrentTimeMillis, string.split(a.l)[0]);
                        return true;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isNeedLoginUrl(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Iterator<String> it2 = LOGIN_NEED_URL.iterator();
        while (it2.hasNext()) {
            if (str.contains(it2.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void onEncryptExchanage(Request request, Map<String, String> map) {
        Logger.logToSd("onEncryptExchanage   1 " + request.url().toString());
        if (System.currentTimeMillis() - lastResetTime < 2000) {
            return;
        }
        lastResetTime = System.currentTimeMillis();
        XmSecretKeyUtil.getInstance().reset();
        if (!request.url().toString().contains(DTransferConstants.GET_PLAY_INFO_PATH)) {
            map.put(DTransferConstants.PUB_KEY, DHUtil.initPartyAKey().getPublicKey().toString());
            return;
        }
        int i = 3;
        while (i > 0) {
            try {
                Response responseDoSync = BaseCall.getInstanse().doSync(BaseBuilder.urlPost(DTransferConstants.GET_ENCRYPT_EXCHANGE, CommonRequest.CommonParams(new HashMap<String, String>() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.AccessTokenBaseCall.2
                    {
                        put(DTransferConstants.PUB_KEY, this.val$dhKeyPair.getPublicKey().toString());
                    }
                }), CommonRequest.getInstanse().getAppsecret()).build());
                BaseResponse baseResponse = new BaseResponse(responseDoSync);
                Logger.logToSd("onEncryptExchanage  2 " + baseResponse.getStatusCode());
                if (baseResponse.getStatusCode() != 200) {
                    throw new Exception();
                }
                XmSecretKeyUtil.getInstance().updateShareData((SercretPubKey) new Gson().fromJson(responseDoSync.body().string(), SercretPubKey.class));
                i = 0;
            } catch (Exception unused) {
                i--;
            }
        }
    }
}
