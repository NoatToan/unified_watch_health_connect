package com.xiaomi.ai.android.a.a;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.material.timepicker.TimeModel;
import com.miui.tsmclientsdk.MiTsmConstants;
import com.xiaomi.account.openauth.XiaomiOAuthConstants;
import com.xiaomi.ai.android.capability.StorageCapability;
import com.xiaomi.ai.android.core.e;
import com.xiaomi.ai.android.utils.SecurityUtil;
import com.xiaomi.ai.android.utils.b;
import com.xiaomi.ai.android.utils.c;
import com.xiaomi.ai.api.StdStatuses;
import com.xiaomi.ai.api.common.APIUtils;
import com.xiaomi.smarthome.library.apache.http.protocol.HTTP;
import com.xiaomi.smarthome.library.crypto.rc4coder.Coder;
import defpackage.c4h;
import defpackage.d3s;
import defpackage.e01;
import defpackage.f01;
import defpackage.sus;
import defpackage.tq1;
import defpackage.wpe;
import defpackage.zsd;
import java.io.IOException;
import java.util.Locale;
import java.util.Map;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: loaded from: classes6.dex */
public class a extends tq1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f10859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f10860b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private e h;
    private String i;
    private OkHttpClient j;

    public a(e eVar, int i) {
        String str;
        super(i);
        this.h = eVar;
        if (i != 5) {
            str = i == 6 ? "DAA-TOKEN-V1" : "AA-TOKEN-V1";
            this.j = new OkHttpClient();
            a();
        }
        this.i = str;
        this.j = new OkHttpClient();
        a();
    }

    private String a(String str, String str2) {
        return Base64.encodeToString(SecurityUtil.a((str + str2).getBytes()), 11).trim();
    }

    @Override // defpackage.tq1
    public String getAuthHeader(boolean z, boolean z2, Map<String, String> map) {
        wpe.h("AnonymousProvider", "getAuthHeader: forceRefresh : " + z + " isTrack : " + z2);
        String token = getToken(z, z2);
        if (TextUtils.isEmpty(token)) {
            wpe.e("AnonymousProvider", "getAuthHeader: get access token failed");
            return null;
        }
        if (!this.mChannel.getAivsConfig().c("auth.enable_splice_auth", true)) {
            return token;
        }
        String strA = b.a(8);
        return String.format("%s client_id:%s,api_key:%s,access_token:%s,signature:%s", this.i, this.d, a(strA, this.e), token, a(strA, this.d, this.e));
    }

    @Override // defpackage.tq1
    public String requestToken(boolean z, boolean z2) {
        d3s d3sVar;
        String strA;
        String str;
        String str2;
        f01 f01Var;
        String string;
        int iE = this.mChannel.getAivsConfig().e("auth.req_token_mode");
        if (z && iE == 2) {
            String strOnGetAuthorizationToken = this.mChannel.getListener().onGetAuthorizationToken(this.mChannel);
            if (TextUtils.isEmpty(strOnGetAuthorizationToken)) {
                this.mError = new f01(StdStatuses.MISSING_TOKEN, "token is null");
            }
            return strOnGetAuthorizationToken;
        }
        FormBody formBodyA = a(z);
        if (formBodyA == null) {
            return null;
        }
        e01 e01VarI = this.h.i();
        if (z) {
            d3sVar = new d3s(e01VarI);
            strA = d3sVar.a();
            str = "/anonymous/app/auth/token";
        } else {
            d3sVar = new d3s(e01VarI);
            strA = d3sVar.a();
            str = "/anonymous/app/refresh/token";
        }
        String strConcat = strA.concat(str);
        wpe.h("AnonymousProvider", "requestToken: requestUrl :" + strConcat);
        try {
            Response responseExecute = this.j.newCall(new Request.Builder().url(strConcat).post(formBodyA).addHeader(HTTP.DATE_HEADER, sus.a()).addHeader("Content-type", "application/x-www-form-urlencoded").build()).execute();
            if (responseExecute == null || !responseExecute.isSuccessful()) {
                if (responseExecute != null) {
                    if (responseExecute.code() == 401 || responseExecute.code() == 400) {
                        this.mChannel.clearAuthToken();
                    }
                    string = responseExecute.toString();
                    if (responseExecute.headers() != null) {
                        string = string + "headers=" + responseExecute.headers().toString();
                    }
                    if (responseExecute.body() != null) {
                        string = string + ", body=" + responseExecute.body().string();
                    }
                    updateChannelTrack("sdk.connect.error.code", responseExecute.code(), z2);
                } else {
                    string = "response is null";
                }
                wpe.e("AnonymousProvider", "requestToken: " + string);
                updateTrack("msg", string, false, z2);
                updateTrack("result", -1, true, z2);
                updateChannelTrack("sdk.connect.error.msg", string, z2);
                return null;
            }
            String strString = responseExecute.body().string();
            wpe.b("AnonymousProvider", "bodyStr:" + strString);
            c4h c4hVar = (c4h) APIUtils.getObjectMapper().readTree(strString);
            zsd zsdVarT = c4hVar.T("code");
            if (zsdVarT.G() && zsdVarT.h() == 0) {
                if (!c4hVar.T("result").H()) {
                    String str3 = "no result object in app anonymous body " + strString;
                    wpe.e("AnonymousProvider", "requestToken: " + str3);
                    this.mError = new f01(401, str3);
                    updateTrack("msg", str3, false, z2);
                    updateTrack("result", -1, true, z2);
                    updateChannelTrack("sdk.connect.error.msg", str3, z2);
                    return null;
                }
                c4h c4hVar2 = (c4h) c4hVar.T("result");
                if (!c4hVar2.T(XiaomiOAuthConstants.EXTRA_ACCESS_TOKEN_2).L() || !c4hVar2.T("refresh_token").L() || !c4hVar2.T(XiaomiOAuthConstants.EXTRA_EXPIRES_IN_2).G()) {
                    String str4 = "invalid tokens in app anonymous body " + strString;
                    wpe.e("AnonymousProvider", "requestToken:" + str4);
                    this.mError = new f01(401, str4);
                    updateTrack("msg", str4, false, z2);
                    updateTrack("result", -1, true, z2);
                    updateChannelTrack("sdk.connect.error.msg", str4, z2);
                    return null;
                }
                String strL = c4hVar2.T(XiaomiOAuthConstants.EXTRA_ACCESS_TOKEN_2).l();
                String strL2 = c4hVar2.T("refresh_token").l();
                long j = c4hVar2.T(XiaomiOAuthConstants.EXTRA_EXPIRES_IN_2).j();
                StorageCapability storageCapability = (StorageCapability) this.h.a(StorageCapability.class);
                storageCapability.writeKeyValue(XiaomiOAuthConstants.EXTRA_ACCESS_TOKEN_2, strL);
                storageCapability.writeKeyValue("refresh_token", strL2);
                storageCapability.writeKeyValue("expire_at", String.format(Locale.US, TimeModel.NUMBER_FORMAT, Long.valueOf((System.currentTimeMillis() / 1000) + j)));
                if (TextUtils.isEmpty(strL)) {
                    updateTrack("result", -1, false, z2);
                    updateTrack("msg", "access token is null or empty", true, z2);
                } else {
                    updateTrack("result", 0, true, z2);
                }
                return strL;
            }
            String str5 = "invalid code in app anonymous body " + strString;
            wpe.b("AnonymousProvider", "requestToken" + str5);
            this.mError = new f01(401, str5);
            updateTrack("msg", str5, false, z2);
            updateTrack("result", -1, true, z2);
            updateChannelTrack("sdk.connect.error.msg", str5, z2);
            return null;
        } catch (IOException e) {
            wpe.e("AnonymousProvider", Log.getStackTraceString(e));
            str2 = "network connect failed, " + e.getMessage();
            f01Var = new f01(StdStatuses.CONNECT_FAILED, str2);
            this.mError = f01Var;
            updateTrack("msg", str2, false, z2);
            updateTrack("result", -1, true, z2);
            updateChannelTrack("sdk.connect.error.msg", str2, z2);
            return null;
        } catch (Exception e2) {
            wpe.e("AnonymousProvider", Log.getStackTraceString(e2));
            str2 = "app anonymous auth exception " + e2.getMessage();
            f01Var = new f01(401, str2);
            this.mError = f01Var;
            updateTrack("msg", str2, false, z2);
            updateTrack("result", -1, true, z2);
            updateChannelTrack("sdk.connect.error.msg", str2, z2);
            return null;
        }
    }

    private String a(String str, String str2, String str3) {
        return (b.a(3) + str + b.a(5) + b.a("SHA1", (str + str2 + str3).getBytes()).replace(":", "") + b.a(2) + b.a(3)).toLowerCase();
    }

    private String a(String str, String str2, String str3, String str4, String str5) {
        return (b.a(3) + str + b.a(5) + b.a("SHA1", (str + str2 + str3 + str4 + str5).getBytes()) + b.a(2) + String.format("%08x", Integer.valueOf(b.a(str + str4))) + b.a(3)).toLowerCase().replace(":", "");
    }

    private FormBody a(boolean z) {
        if (TextUtils.isEmpty(this.f10859a) || TextUtils.isEmpty(this.f10860b)) {
            wpe.e("AnonymousProvider", "formRequestParams: cert is null");
            return null;
        }
        String strA = b.a(8);
        String strA2 = a(strA, this.e);
        String strA3 = a(strA, this.d, this.e, this.c, this.f);
        FormBody.Builder builder = new FormBody.Builder();
        String keyValue = ((StorageCapability) this.h.a(StorageCapability.class)).readKeyValue("refresh_token");
        if (z || TextUtils.isEmpty(keyValue)) {
            builder.add("grant_type", "app_token");
        } else {
            builder.add("grant_type", "refresh_token");
            builder.add("refresh_token", keyValue);
        }
        builder.add("client_id", this.d);
        builder.add("api_key", strA2);
        builder.add("device_id", this.c);
        builder.add("package_name", this.g);
        builder.add("md5_sign", this.f10859a.toLowerCase());
        builder.add("sha256_sign", this.f10860b.toLowerCase());
        builder.add(MiTsmConstants.KEY_SIGNATURE, strA3);
        wpe.b("AnonymousProvider", "md5_sign:" + this.f10859a.toLowerCase());
        wpe.b("AnonymousProvider", "sha256_sign:" + this.f10860b.toLowerCase());
        return builder.build();
    }

    private void a() {
        if (this.h.i().c("auth.enable_splice_auth", true)) {
            if (this.h.j() == null) {
                wpe.e("AnonymousProvider", "initProvider: failed, context is not set");
                throw new IllegalArgumentException("context is not set");
            }
            this.c = this.h.h().getDeviceId().b();
            if (this.h.i().f("aivs.env", -1) == -1) {
                wpe.e("AnonymousProvider", "initProvider: failed, KEY_ENV is not set");
                throw new IllegalArgumentException("KEY_ENV is not set");
            }
            String strI = this.h.i().i("auth.client_id");
            this.d = strI;
            if (TextUtils.isEmpty(strI)) {
                wpe.e("AnonymousProvider", "initProvider: failed, CLIENT_ID is not set");
                throw new IllegalArgumentException("CLIENT_ID is not set");
            }
            String strI2 = this.h.i().i("auth.anonymous.api_key");
            this.e = strI2;
            if (TextUtils.isEmpty(strI2)) {
                wpe.e("AnonymousProvider", "initProvider: failed, API_KEY is not set");
                throw new IllegalArgumentException("API_KEY is not set");
            }
            String strI3 = this.h.i().i("auth.anonymous.sign_secret");
            this.f = strI3;
            if (TextUtils.isEmpty(strI3)) {
                wpe.e("AnonymousProvider", "initProvider: failed, SIGN_SECRET is not set");
                throw new IllegalArgumentException("SIGN_SECRET is not set");
            }
            byte[] bArrA = c.a(this.h.j(), this.h.j().getPackageName());
            if (bArrA == null) {
                wpe.e("AnonymousProvider", "initProvider: get signature failed");
                return;
            }
            this.f10859a = b.a(Coder.KEY_MD5, bArrA);
            this.f10860b = b.a("SHA256", bArrA);
            if (this.mAuthType != 5) {
                String strI4 = this.h.i().i("auth.anonymous.device_name");
                this.g = strI4;
                if (!TextUtils.isEmpty(strI4)) {
                    return;
                }
            }
            this.g = this.h.j().getPackageName();
        }
    }
}
