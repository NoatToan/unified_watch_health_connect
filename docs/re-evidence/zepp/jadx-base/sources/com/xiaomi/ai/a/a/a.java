package com.xiaomi.ai.a.a;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.android.material.timepicker.TimeModel;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.xiaomi.ai.api.StdStatuses;
import com.xiaomi.ai.api.common.APIUtils;
import com.xiaomi.ai.b.f;
import com.xiaomi.ai.core.AivsConfig;
import com.xiaomi.ai.error.AivsError;
import com.xiaomi.ai.log.Logger;
import java.io.IOException;
import java.util.Map;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: loaded from: classes18.dex */
public class a extends com.xiaomi.ai.a.a {
    private String d;
    private String e;
    private String f;
    private OkHttpClient g;

    public a(com.xiaomi.ai.core.a aVar) {
        super(3, aVar);
        this.g = new OkHttpClient();
        if (!c()) {
            throw new IllegalArgumentException("DeviceTokenProvider: illegal config");
        }
    }

    private boolean c() {
        String str;
        if (this.b.getAivsConfig().getInt(AivsConfig.ENV, -1) == -1) {
            str = "initProvider: failed, ENV is not set";
        } else {
            String string = this.b.getAivsConfig().getString(AivsConfig.Auth.CLIENT_ID);
            this.d = string;
            if (f.a(string)) {
                str = "initProvider: CLIENT_ID is not set";
            } else if (this.b.getClientInfo().getDeviceId().isPresent()) {
                this.e = this.b.getClientInfo().getDeviceId().get();
                if (this.b.getAivsConfig().getInt(AivsConfig.Auth.REQ_TOKEN_MODE) == 1) {
                    return true;
                }
                String string2 = this.b.getAivsConfig().getString(AivsConfig.Auth.DeviceToken.SIGN);
                this.f = string2;
                if (!f.a(string2)) {
                    return true;
                }
                str = "initProvider: SIGN is not set";
            } else {
                str = "initProvider: device id is not set";
            }
        }
        Logger.d("DeviceTokenProvider", str);
        return false;
    }

    @Override // com.xiaomi.ai.a.a
    public String a(boolean z, boolean z2) {
        String str;
        AivsError aivsError;
        String string;
        int i = this.b.getAivsConfig().getInt(AivsConfig.Auth.REQ_TOKEN_MODE);
        if (z && i == 2) {
            return this.b.getListener().d(this.b);
        }
        FormBody.Builder builder = new FormBody.Builder();
        builder.add("client_id", this.d);
        builder.add("device", com.xiaomi.ai.b.a.b(this.e.getBytes(), 11));
        if (!z) {
            builder.add("refresh_token", this.b.getListener().a(this.b, "refresh_token"));
        }
        builder.add("sign", this.f);
        try {
            Response responseExecute = FirebasePerfOkHttpClient.execute(this.g.newCall(new Request.Builder().url(new com.xiaomi.ai.core.c(this.b.getAivsConfig()).f().concat(z ? "/thirdparty/auth/token" : "/thirdparty/refresh/token")).post(builder.build()).build()));
            if (responseExecute == null || !responseExecute.isSuccessful()) {
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
                    a("sdk.connect.error.code", responseExecute.code(), z2);
                } else {
                    string = "response is null";
                }
                Logger.d("DeviceTokenProvider", "requestToken: " + string);
                a("msg", string, false, z2);
                a("result", -1, true, z2);
                a("sdk.connect.error.msg", string, z2);
                return null;
            }
            String strString = responseExecute.body().string();
            ObjectNode objectNode = (ObjectNode) APIUtils.getObjectMapper().readTree(strString);
            if (objectNode == null) {
                String str2 = "invalid device token body " + strString;
                Logger.d("DeviceTokenProvider", "requestToken" + str2);
                this.c = new AivsError(401, str2);
                a("msg", str2, false, z2);
                a("result", -1, true, z2);
                a("sdk.connect.error.msg", str2, z2);
                return null;
            }
            JsonNode jsonNodePath = objectNode.path("code");
            if (jsonNodePath.isNumber() && jsonNodePath.asInt() == 0) {
                if (!objectNode.path("result").isObject()) {
                    String str3 = "no result object in device token body " + strString;
                    Logger.d("DeviceTokenProvider", "requestToken: " + str3);
                    this.c = new AivsError(401, str3);
                    a("msg", str3, false, z2);
                    a("result", -1, true, z2);
                    a("sdk.connect.error.msg", str3, z2);
                    return null;
                }
                ObjectNode objectNode2 = (ObjectNode) objectNode.path("result");
                if (objectNode2 != null && objectNode2.path("access_token").isTextual() && objectNode2.path("refresh_token").isTextual() && objectNode2.path("expires_in").isNumber()) {
                    String strAsText = objectNode2.path("access_token").asText();
                    String strAsText2 = objectNode2.path("refresh_token").asText();
                    long jAsLong = objectNode2.path("expires_in").asLong();
                    this.b.getListener().a(this.b, "access_token", strAsText);
                    this.b.getListener().a(this.b, "refresh_token", strAsText2);
                    this.b.getListener().a(this.b, "expire_at", String.format(TimeModel.NUMBER_FORMAT, Long.valueOf((System.currentTimeMillis() / 1000) + jAsLong)));
                    if (f.a(strAsText)) {
                        a("result", -1, false, z2);
                        a("msg", "access token is null or empty", true, z2);
                    } else {
                        a("result", 0, true, z2);
                    }
                    return strAsText;
                }
                String str4 = "invalid tokens in device token body " + strString;
                Logger.d("DeviceTokenProvider", "requestToken:" + str4);
                this.c = new AivsError(401, str4);
                a("msg", str4, false, z2);
                a("result", -1, true, z2);
                a("sdk.connect.error.msg", str4, z2);
                return null;
            }
            String str5 = "invalid code in device token body " + strString;
            Logger.d("DeviceTokenProvider", "requestToken" + str5);
            this.c = new AivsError(401, str5);
            a("msg", str5, false, z2);
            a("result", -1, true, z2);
            a("sdk.connect.error.msg", str5, z2);
            return null;
        } catch (IOException e) {
            Logger.d("DeviceTokenProvider", Logger.throwableToString(e));
            str = "network connect failed, " + e.getMessage();
            aivsError = new AivsError(StdStatuses.CONNECT_FAILED, str);
            this.c = aivsError;
            a("msg", str, false, z2);
            a("result", -1, true, z2);
            a("sdk.connect.error.msg", str, z2);
            return null;
        } catch (Exception e2) {
            Logger.d("DeviceTokenProvider", Logger.throwableToString(e2));
            str = "device token auth exception " + e2.getMessage();
            aivsError = new AivsError(401, str);
            this.c = aivsError;
            a("msg", str, false, z2);
            a("result", -1, true, z2);
            a("sdk.connect.error.msg", str, z2);
            return null;
        }
    }

    @Override // com.xiaomi.ai.a.a
    public String a(boolean z, boolean z2, Map<String, String> map) {
        Logger.b("DeviceTokenProvider", "getAuthHeader: forceRefresh : " + z + " isTrack : " + z2);
        String strB = b(z, z2);
        if (!f.a(strB)) {
            return String.format("%s app_id:%s,access_token:%s", "TP-TOKEN-V1", this.d, strB);
        }
        Logger.d("DeviceTokenProvider", "getAuthHeader: get access token failed");
        return null;
    }
}
