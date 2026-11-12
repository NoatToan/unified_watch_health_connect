package com.xiaomi.ai.android.a.a;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.android.material.timepicker.TimeModel;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.huami.passport.Configs;
import com.xiaomi.ai.android.capability.StorageCapability;
import com.xiaomi.ai.android.core.d;
import com.xiaomi.ai.android.utils.SecurityUtil;
import com.xiaomi.ai.android.utils.b;
import com.xiaomi.ai.api.StdStatuses;
import com.xiaomi.ai.api.common.APIUtils;
import com.xiaomi.ai.b.g;
import com.xiaomi.ai.core.AivsConfig;
import com.xiaomi.ai.core.c;
import com.xiaomi.ai.error.AivsError;
import com.xiaomi.ai.log.Logger;
import java.io.IOException;
import java.util.Locale;
import java.util.Map;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.apache.commons.fileupload.FileUploadBase;

/* JADX INFO: loaded from: classes18.dex */
public class a extends com.xiaomi.ai.a.a {
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;
    private String j;
    private d k;
    private String l;
    private OkHttpClient m;

    /* JADX WARN: Code duplicated, block: B:11:0x0020 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x0021  */
    public a(d dVar, int i) {
        String str;
        super(i);
        this.k = dVar;
        if (i != 5) {
            str = i == 6 ? "DAA-TOKEN-V1" : "AA-TOKEN-V1";
            this.m = new OkHttpClient();
            if (c()) {
                throw new IllegalArgumentException("AnonymousProvider: illegal config");
            }
        }
        this.l = str;
        this.m = new OkHttpClient();
        if (c()) {
            throw new IllegalArgumentException("AnonymousProvider: illegal config");
        }
    }

    private String a(String str, String str2) {
        return Base64.encodeToString(SecurityUtil.a((str + str2).getBytes()), 11).trim();
    }

    private String a(String str, String str2, String str3) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str);
        stringBuffer.append(str2);
        stringBuffer.append(str3);
        String strReplace = b.a("SHA1", stringBuffer.toString().getBytes()).replace(":", "");
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append(b.a(3));
        stringBuffer2.append(str);
        stringBuffer2.append(b.a(5));
        stringBuffer2.append(strReplace);
        stringBuffer2.append(b.a(2));
        stringBuffer2.append(b.a(3));
        return stringBuffer2.toString().toLowerCase();
    }

    private String a(String str, String str2, String str3, String str4, String str5) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str);
        stringBuffer.append(str2);
        stringBuffer.append(str3);
        stringBuffer.append(str4);
        stringBuffer.append(str5);
        String strA = b.a("SHA1", stringBuffer.toString().getBytes());
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append(b.a(3));
        stringBuffer2.append(str);
        stringBuffer2.append(b.a(5));
        stringBuffer2.append(strA);
        stringBuffer2.append(b.a(2));
        stringBuffer2.append(String.format("%08x", Integer.valueOf(b.a(str + str4))));
        stringBuffer2.append(b.a(3));
        return stringBuffer2.toString().toLowerCase().replace(":", "");
    }

    private FormBody a(boolean z) {
        String strA = b.a(8);
        String strA2 = a(strA, this.h);
        String strA3 = a(strA, this.g, this.h, this.f, this.i);
        FormBody.Builder builder = new FormBody.Builder();
        if (z) {
            builder.add("grant_type", Configs.Params.APP_TOKEN);
        } else {
            String keyValue = ((StorageCapability) this.k.a(StorageCapability.class)).readKeyValue("refresh_token");
            builder.add("grant_type", "refresh_token");
            builder.add("refresh_token", keyValue);
        }
        builder.add("client_id", this.g);
        builder.add("api_key", strA2);
        builder.add("device_id", this.f);
        builder.add("package_name", this.j);
        builder.add("md5_sign", this.d.toLowerCase());
        builder.add("sha256_sign", this.e.toLowerCase());
        builder.add("signature", strA3);
        return builder.build();
    }

    private boolean c() {
        String str;
        if (this.k.a() == null) {
            str = "initProvider: failed, context is not set";
        } else {
            byte[] bArrA = com.xiaomi.ai.android.utils.d.a(this.k.a(), this.k.a().getPackageName());
            this.d = b.a("MD5", bArrA);
            this.e = b.a("SHA256", bArrA);
            this.f = this.k.m().getDeviceId().get();
            if (this.k.b().getInt(AivsConfig.ENV, -1) == -1) {
                str = "initProvider: failed, KEY_ENV is not set";
            } else {
                String string = this.k.b().getString(AivsConfig.Auth.CLIENT_ID);
                this.g = string;
                if (TextUtils.isEmpty(string)) {
                    str = "initProvider: failed, CLIENT_ID is not set";
                } else {
                    String string2 = this.k.b().getString(AivsConfig.Auth.Anonymous.API_KEY);
                    this.h = string2;
                    if (TextUtils.isEmpty(string2)) {
                        str = "initProvider: failed, API_KEY is not set";
                    } else {
                        String string3 = this.k.b().getString(AivsConfig.Auth.Anonymous.SIGN_SECRET);
                        this.i = string3;
                        if (!TextUtils.isEmpty(string3)) {
                            if (this.a != 5) {
                                String string4 = this.k.b().getString(AivsConfig.Auth.Anonymous.DEVICE_NAME);
                                this.j = string4;
                                if (!TextUtils.isEmpty(string4)) {
                                    return true;
                                }
                            }
                            this.j = this.k.a().getPackageName();
                            return true;
                        }
                        str = "initProvider: failed, SIGN_SECRET is not set";
                    }
                }
            }
        }
        Logger.d("AnonymousProvider", str);
        return false;
    }

    @Override // com.xiaomi.ai.a.a
    public String a(boolean z, boolean z2) {
        c cVar;
        String strE;
        String str;
        String str2;
        AivsError aivsError;
        String string;
        int i = this.b.getAivsConfig().getInt(AivsConfig.Auth.REQ_TOKEN_MODE);
        if (z && i == 2) {
            return this.b.getListener().d(this.b);
        }
        FormBody formBodyA = a(z);
        AivsConfig aivsConfigB = this.k.b();
        if (z) {
            cVar = new c(aivsConfigB);
            strE = cVar.e();
            str = "/anonymous/app/auth/token";
        } else {
            cVar = new c(aivsConfigB);
            strE = cVar.e();
            str = "/anonymous/app/refresh/token";
        }
        String strConcat = strE.concat(str);
        Logger.b("AnonymousProvider", "requestToken: requestUrl :" + strConcat);
        try {
            Response responseExecute = FirebasePerfOkHttpClient.execute(this.m.newCall(new Request.Builder().url(strConcat).post(formBodyA).addHeader("Date", g.a()).addHeader(FileUploadBase.CONTENT_TYPE, "application/x-www-form-urlencoded").build()));
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
                Logger.d("AnonymousProvider", "requestToken: " + string);
                a("msg", string, false, z2);
                a("result", -1, true, z2);
                a("sdk.connect.error.msg", string, z2);
                return null;
            }
            String strString = responseExecute.body().string();
            Logger.a("AnonymousProvider", "bodyStr:" + strString);
            ObjectNode objectNode = (ObjectNode) APIUtils.getObjectMapper().readTree(strString);
            JsonNode jsonNodePath = objectNode.path("code");
            if (jsonNodePath.isNumber() && jsonNodePath.asInt() == 0) {
                if (!objectNode.path("result").isObject()) {
                    String str3 = "no result object in app anonymous body " + strString;
                    Logger.d("AnonymousProvider", "requestToken: " + str3);
                    this.c = new AivsError(401, str3);
                    a("msg", str3, false, z2);
                    a("result", -1, true, z2);
                    a("sdk.connect.error.msg", str3, z2);
                    return null;
                }
                ObjectNode objectNode2 = (ObjectNode) objectNode.path("result");
                if (objectNode2.path("access_token").isTextual() && objectNode2.path("refresh_token").isTextual() && objectNode2.path("expires_in").isNumber()) {
                    String strAsText = objectNode2.path("access_token").asText();
                    String strAsText2 = objectNode2.path("refresh_token").asText();
                    long jAsLong = objectNode2.path("expires_in").asLong();
                    StorageCapability storageCapability = (StorageCapability) this.k.a(StorageCapability.class);
                    storageCapability.writeKeyValue("access_token", strAsText);
                    storageCapability.writeKeyValue("refresh_token", strAsText2);
                    storageCapability.writeKeyValue("expire_at", String.format(Locale.US, TimeModel.NUMBER_FORMAT, Long.valueOf((System.currentTimeMillis() / 1000) + jAsLong)));
                    if (TextUtils.isEmpty(strAsText)) {
                        a("result", -1, false, z2);
                        a("msg", "access token is null or empty", true, z2);
                    } else {
                        a("result", 0, true, z2);
                    }
                    return strAsText;
                }
                String str4 = "invalid tokens in app anonymous body " + strString;
                Logger.d("AnonymousProvider", "requestToken:" + str4);
                this.c = new AivsError(401, str4);
                a("msg", str4, false, z2);
                a("result", -1, true, z2);
                a("sdk.connect.error.msg", str4, z2);
                return null;
            }
            String str5 = "invalid code in app anonymous body " + strString;
            Logger.a("AnonymousProvider", "requestToken" + str5);
            this.c = new AivsError(401, str5);
            a("msg", str5, false, z2);
            a("result", -1, true, z2);
            a("sdk.connect.error.msg", str5, z2);
            return null;
        } catch (IOException e) {
            Logger.d("AnonymousProvider", Log.getStackTraceString(e));
            str2 = "network connect failed, " + e.getMessage();
            aivsError = new AivsError(StdStatuses.CONNECT_FAILED, str2);
            this.c = aivsError;
            a("msg", str2, false, z2);
            a("result", -1, true, z2);
            a("sdk.connect.error.msg", str2, z2);
            return null;
        } catch (Exception e2) {
            Logger.d("AnonymousProvider", Log.getStackTraceString(e2));
            str2 = "app anonymous auth exception " + e2.getMessage();
            aivsError = new AivsError(401, str2);
            this.c = aivsError;
            a("msg", str2, false, z2);
            a("result", -1, true, z2);
            a("sdk.connect.error.msg", str2, z2);
            return null;
        }
    }

    @Override // com.xiaomi.ai.a.a
    public String a(boolean z, boolean z2, Map<String, String> map) {
        Logger.b("AnonymousProvider", "getAuthHeader: forceRefresh : " + z + " isTrack : " + z2);
        String strB = b(z, z2);
        if (TextUtils.isEmpty(strB)) {
            Logger.d("AnonymousProvider", "getAuthHeader: get access token failed");
            return null;
        }
        String strA = b.a(8);
        return String.format("%s client_id:%s,api_key:%s,access_token:%s,signature:%s", this.l, this.g, a(strA, this.h), strB, a(strA, this.g, this.h));
    }
}
