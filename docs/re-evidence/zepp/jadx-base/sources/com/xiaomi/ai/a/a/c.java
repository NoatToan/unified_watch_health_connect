package com.xiaomi.ai.a.a;

import com.amazon.identity.auth.device.endpoint.OauthCodeForTokenRequest;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.android.material.timepicker.TimeModel;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.huami.watch.companion.watchface.cloud.WatchFaceApi;
import com.xiaomi.ai.api.StdStatuses;
import com.xiaomi.ai.api.common.APIUtils;
import com.xiaomi.ai.b.f;
import com.xiaomi.ai.b.g;
import com.xiaomi.ai.core.AivsConfig;
import com.xiaomi.ai.error.AivsError;
import com.xiaomi.ai.log.Logger;
import com.xiaomi.common.Optional;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: loaded from: classes18.dex */
public class c extends com.xiaomi.ai.a.a {
    private String d;
    private String e;
    private String f;
    private String g;
    private OkHttpClient h;

    public c(int i, com.xiaomi.ai.core.a aVar) {
        super(i, aVar);
        this.h = new OkHttpClient();
        if (f()) {
            return;
        }
        throw new IllegalArgumentException("OAuthProvider: illegal config, authType=" + this.a);
    }

    private String c() {
        String strA = this.b.getListener().a(this.b, "access_token");
        if (f.a(strA)) {
            return null;
        }
        String strA2 = this.b.getListener().a(this.b, "expire_at");
        if (f.a(strA2) || Long.parseLong(strA2) - (System.currentTimeMillis() / 1000) <= 0) {
            return null;
        }
        Logger.a("OAuthProvider", "getToken: use cachedAccessToken:" + strA);
        return strA;
    }

    private void d() {
        this.b.getListener().b(this.b, "refresh_times_during_limit");
        this.b.getListener().a(this.b, WatchFaceApi.SORT_UPDATED, String.valueOf(System.currentTimeMillis() / 1000));
    }

    private boolean e() {
        int i;
        if (!this.b.getAivsConfig().getBoolean(AivsConfig.Connection.ENABLE_REFRESH_TOKEN_LIMIT)) {
            return false;
        }
        try {
            String strA = this.b.getListener().a(this.b, WatchFaceApi.SORT_UPDATED);
            long j = !f.a(strA) ? Long.parseLong(strA) : 0L;
            long jCurrentTimeMillis = (System.currentTimeMillis() / 1000) - j;
            if (jCurrentTimeMillis <= 0) {
                Logger.d("OAuthProvider", "RefreshLimit false,illegal update time:" + j);
                d();
                return false;
            }
            if (!(jCurrentTimeMillis <= ((long) this.b.getAivsConfig().getInt(AivsConfig.Connection.REFRESH_TOKEN_MIN_INTERVAL)))) {
                d();
                return false;
            }
            try {
                String strA2 = this.b.getListener().a(this.b, "refresh_times_during_limit");
                i = !f.a(strA2) ? Integer.parseInt(strA2) : 0;
            } catch (NumberFormatException e) {
                Logger.c("OAuthProvider", "RefreshLimit false : no request time" + e.toString());
            }
            int i2 = i + 1;
            boolean z = i2 > this.b.getAivsConfig().getInt(AivsConfig.Connection.MAX_REFRESH_TIMES_DURING_LIMIT);
            Logger.b("OAuthProvider", "requestTimes: " + i2 + " updateAt: " + j);
            this.b.getListener().a(this.b, "refresh_times_during_limit", String.valueOf(i2));
            return z;
        } catch (NumberFormatException e2) {
            Logger.c("OAuthProvider", "RefreshLimit false : no update time" + e2.toString());
            d();
            return false;
        }
    }

    private boolean f() {
        String strThrowableToString;
        int i = this.a;
        if (i != 4 && i != 1) {
            strThrowableToString = "initProvider: unsupported authType=" + this.a;
        } else if (this.b.getClientInfo().getDeviceId().isPresent()) {
            this.g = this.b.getClientInfo().getDeviceId().get();
            String string = this.b.getAivsConfig().getString(AivsConfig.Auth.CLIENT_ID);
            this.d = string;
            if (f.a(string)) {
                strThrowableToString = "initProvider: CLIENT_ID is not set";
            } else {
                if (this.b.getAivsConfig().getInt(AivsConfig.Auth.REQ_TOKEN_MODE) == 1) {
                    return true;
                }
                String string2 = this.b.getAivsConfig().getString(AivsConfig.Auth.OAuth.REDIRECT_URL);
                if (f.a(string2)) {
                    strThrowableToString = "initProvider: REDIRECT_URL is not set";
                } else {
                    String string3 = this.b.getAivsConfig().getString(AivsConfig.Auth.OAuth.CLIENT_SECRET);
                    if (f.a(string3)) {
                        strThrowableToString = "initProvider: CLIENT_SECRET is not set";
                    } else {
                        try {
                            this.e = URLEncoder.encode(string2, "UTF-8");
                            this.f = URLEncoder.encode(string3, "UTF-8");
                            return true;
                        } catch (UnsupportedEncodingException e) {
                            strThrowableToString = Logger.throwableToString(e);
                        }
                    }
                }
            }
        } else {
            strThrowableToString = "initProvider: device id is not set";
        }
        Logger.d("OAuthProvider", strThrowableToString);
        return false;
    }

    private String g() {
        Optional<String> miotDid = this.b.getClientInfo().getMiotDid();
        return com.xiaomi.ai.b.a.b(((this.b.getAivsConfig().getBoolean(AivsConfig.Auth.OAuth.ENABLE_UPLOAD_MIOT_DID) && miotDid.isPresent()) ? String.format("{\"d\":\"%s\",\"md\":\"%s\"}", this.g, miotDid.get()) : String.format("{\"d\":\"%s\"}", this.g)).getBytes(), 11);
    }

    /* JADX WARN: Code duplicated, block: B:91:0x03f9  */
    /* JADX WARN: Code duplicated, block: B:92:0x03fc  */
    @Override // com.xiaomi.ai.a.a
    public String a(boolean z, boolean z2) {
        String str;
        AivsError aivsError;
        String str2;
        String string;
        String str3;
        AivsError aivsError2;
        String str4 = "expires_in";
        if (e()) {
            Logger.b("OAuthProvider", "requestToken limited");
            String strC = c();
            a("status", 7, false, z2);
            if (!f.a(strC)) {
                a("result", 0, true, z2);
                return strC;
            }
            a("msg", "requestToken limited token null", false, z2);
            a("result", -1, true, z2);
            return null;
        }
        int i = this.b.getAivsConfig().getInt(AivsConfig.Auth.REQ_TOKEN_MODE);
        if (z && i == 2) {
            a("status", 6, false, z2);
            String strD = this.b.getListener().d(this.b);
            if (!f.a(strD)) {
                a("result", 0, true, z2);
                return strD;
            }
            a("msg", "onGetAuthorizationToken null", false, z2);
            a("result", -1, true, z2);
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        int i2 = this.a;
        stringBuffer.append("?pt=");
        if (i2 == 1) {
            stringBuffer.append(1);
            stringBuffer.append(com.alipay.sdk.m.s.a.l);
            stringBuffer.append("scope_data=");
            stringBuffer.append(g());
        } else {
            stringBuffer.append(0);
        }
        stringBuffer.append(com.alipay.sdk.m.s.a.l);
        stringBuffer.append("client_id=");
        stringBuffer.append(this.d);
        stringBuffer.append(com.alipay.sdk.m.s.a.l);
        stringBuffer.append("client_secret=");
        stringBuffer.append(this.f);
        stringBuffer.append(com.alipay.sdk.m.s.a.l);
        stringBuffer.append("redirect_uri=");
        stringBuffer.append(this.e);
        stringBuffer.append(com.alipay.sdk.m.s.a.l);
        if (z) {
            String strC2 = this.b.getListener().c(this.b);
            if (f.a(strC2)) {
                Logger.d("OAuthProvider", "get authCode fail");
                return null;
            }
            Logger.b("OAuthProvider", "requestToken: get auth code:" + strC2);
            stringBuffer.append("grant_type=");
            stringBuffer.append(OauthCodeForTokenRequest.AUTHORIZATION_CODE_GRANT);
            stringBuffer.append(com.alipay.sdk.m.s.a.l);
            stringBuffer.append("code=");
            stringBuffer.append(strC2);
        } else {
            Logger.b("OAuthProvider", "requestToken: refresh token");
            stringBuffer.append("grant_type=");
            stringBuffer.append("refresh_token");
            stringBuffer.append(com.alipay.sdk.m.s.a.l);
            stringBuffer.append("refresh_token=");
            stringBuffer.append(this.b.getListener().a(this.b, "refresh_token"));
        }
        String strConcat = new com.xiaomi.ai.core.c(this.b.getAivsConfig()).d().concat("/oauth2/auth/token").concat(stringBuffer.toString());
        Logger.a("OAuthProvider", "requestToken:" + strConcat);
        try {
            Response responseExecute = FirebasePerfOkHttpClient.execute(this.h.newCall(new Request.Builder().url(strConcat).get().addHeader("Date", g.a()).build()));
            try {
                if (responseExecute == null || !responseExecute.isSuccessful()) {
                    Logger.d("OAuthProvider", "requestToken: request failed, response=" + responseExecute);
                    if (responseExecute != null) {
                        if (responseExecute.code() == 401 || responseExecute.code() == 400) {
                            this.b.clearAuthToken();
                        }
                        string = responseExecute.toString();
                        if (responseExecute.headers() != null) {
                            string = string + "headers=" + responseExecute.headers().toString();
                        }
                        if (responseExecute.body() != null) {
                            string = string + ", body=" + responseExecute.body().string();
                        }
                        Logger.d("OAuthProvider", "requestToken: " + string);
                        a("msg", string, false, z2);
                        a("result", -1, true, z2);
                        a("sdk.connect.error.code", responseExecute.code(), z2);
                    }
                    if (z) {
                        str2 = "oauth_code_2_token";
                    } else {
                        str2 = "oauth_refresh_2_token";
                    }
                    a("sdk.connect.error.substep", str2, z2);
                    return null;
                }
                String strString = responseExecute.body().string();
                ObjectNode objectNode = (ObjectNode) APIUtils.getObjectMapper().readTree(strString);
                if (objectNode != null && objectNode.path("access_token").isTextual() && objectNode.path("refresh_token").isTextual() && objectNode.path("expires_in").isNumber()) {
                    Logger.a("OAuthProvider", "requestToken: bodyStr=" + strString);
                    String strAsText = objectNode.path("access_token").asText();
                    String strAsText2 = objectNode.path("refresh_token").asText();
                    long jAsLong = objectNode.path("expires_in").asLong();
                    this.b.getListener().a(this.b, "access_token", strAsText);
                    this.b.getListener().a(this.b, "refresh_token", strAsText2);
                    this.b.getListener().a(this.b, "expire_at", String.format(TimeModel.NUMBER_FORMAT, Long.valueOf((System.currentTimeMillis() / 1000) + jAsLong)));
                    if (f.a(strAsText)) {
                        a("result", -1, false, z2);
                        a("msg", "access token is null or empty", true, z2);
                        a("sdk.connect.error.msg", "access token is null or empty", z2);
                    } else {
                        this.b.getListener().a(this.b, "refresh_at", String.format(TimeModel.NUMBER_FORMAT, Long.valueOf(System.currentTimeMillis() / 1000)));
                        a("result", 0, true, z2);
                    }
                    return strAsText;
                }
                Logger.d("OAuthProvider", "requestToken: invalid body " + strString);
                if (this.a == 1) {
                    str3 = "invalid device oauth body " + strString;
                    aivsError2 = new AivsError(401, str3);
                } else {
                    str3 = "invalid app oauth body " + strString;
                    aivsError2 = new AivsError(401, str3);
                }
                this.c = aivsError2;
                a("msg", str3, false, z2);
                a("result", -1, true, z2);
                string = str3 + strString;
                Logger.d("OAuthProvider", Logger.throwableToString(e));
                str = "network connect failed, " + e.getMessage();
                this.c = new AivsError(StdStatuses.CONNECT_FAILED, str);
                a(-1, -1, str, z2);
                a(str4, str, z2);
                if (z) {
                    str2 = "oauth_code_2_token";
                } else {
                    str2 = "oauth_refresh_2_token";
                }
                a("sdk.connect.error.substep", str2, z2);
                return null;
                a("sdk.connect.error.msg", string, z2);
            } catch (IOException e) {
                e = e;
                Logger.d("OAuthProvider", Logger.throwableToString(e));
                str = "network connect failed, " + e.getMessage();
                this.c = new AivsError(StdStatuses.CONNECT_FAILED, str);
                a(-1, -1, str, z2);
                a(str4, str, z2);
            } catch (Exception e2) {
                e = e2;
                Logger.d("OAuthProvider", Logger.throwableToString(e));
                if (this.a == 1) {
                    str = "device oauth requestToken fail: " + e.getMessage();
                    aivsError = new AivsError(401, str);
                } else {
                    str = "app oauth requestToken fail: " + e.getMessage();
                    aivsError = new AivsError(401, str);
                }
                this.c = aivsError;
                a("msg", str, false, z2);
                a("result", -1, true, z2);
                a(str4, str, z2);
            }
        } catch (IOException e3) {
            e = e3;
            str4 = r6;
        } catch (Exception e4) {
            e = e4;
            str4 = r6;
        }
        if (z) {
            str2 = "oauth_code_2_token";
        } else {
            str2 = "oauth_refresh_2_token";
        }
        a("sdk.connect.error.substep", str2, z2);
        return null;
    }

    @Override // com.xiaomi.ai.a.a
    public String a(boolean z, boolean z2, Map<String, String> map) {
        String str;
        Logger.b("OAuthProvider", "getAuthHeader: forceRefresh : " + z + " isTrack : " + z2);
        this.c = null;
        String strB = b(z, z2);
        if (f.a(strB)) {
            str = "getAuthHeader: get access token failed";
        } else {
            String string = this.b.getAivsConfig().getString(AivsConfig.Auth.CLIENT_ID);
            int i = this.a;
            if (i == 1) {
                return String.format("%s app_id:%s,scope_data:%s,access_token:%s", "DO-TOKEN-V1", string, g(), strB);
            }
            if (i == 4) {
                return String.format("%s dev_app_id:%s,access_token:%s", "AO-TOKEN-V1", string, strB);
            }
            str = "getAuthHeader: unsupported authType=" + this.a;
        }
        Logger.d("OAuthProvider", str);
        return null;
    }
}
