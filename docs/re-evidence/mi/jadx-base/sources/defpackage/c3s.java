package defpackage;

import com.google.android.material.timepicker.TimeModel;
import com.xiaomi.account.openauth.XiaomiOAuthConstants;
import com.xiaomi.ai.api.StdStatuses;
import com.xiaomi.ai.api.common.APIUtils;
import java.io.IOException;
import java.util.Map;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: loaded from: classes7.dex */
public class c3s extends tq1 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f4903k;
    public String l;
    public String m;
    public OkHttpClient n;

    public c3s(gt3 gt3Var) {
        super(3, gt3Var);
        this.n = new OkHttpClient();
        a();
    }

    public final void a() {
        if (this.mChannel.getAivsConfig().c("auth.enable_splice_auth", true)) {
            if (this.mChannel.getAivsConfig().f("aivs.env", -1) == -1) {
                wpe.e("DeviceTokenProvider", "initProvider: failed, ENV is not set");
                throw new IllegalArgumentException("ENV is not set");
            }
            String strI = this.mChannel.getAivsConfig().i("auth.client_id");
            this.f4903k = strI;
            if (yrs.b(strI)) {
                wpe.e("DeviceTokenProvider", "initProvider: CLIENT_ID is not set");
                throw new IllegalArgumentException("CLIENT_ID is not set");
            }
            if (!this.mChannel.getClientInfo().getDeviceId().c()) {
                wpe.e("DeviceTokenProvider", "initProvider: device id is not set");
                throw new IllegalArgumentException("device id is not set");
            }
            this.l = this.mChannel.getClientInfo().getDeviceId().b();
            if (this.mChannel.getAivsConfig().e("auth.req_token_mode") == 1) {
                return;
            }
            String strI2 = this.mChannel.getAivsConfig().i("auth.device_token.sign");
            this.m = strI2;
            if (yrs.b(strI2)) {
                wpe.e("DeviceTokenProvider", "initProvider: SIGN is not set");
                throw new IllegalArgumentException("AivsConfig.Auth.DeviceToken.SIGN is not set");
            }
        }
    }

    @Override // defpackage.tq1
    public String getAuthHeader(boolean z, boolean z2, Map<String, String> map) {
        wpe.h("DeviceTokenProvider", "getAuthHeader: forceRefresh : " + z + " isTrack : " + z2);
        String token = getToken(z, z2);
        if (!yrs.b(token)) {
            return !this.mChannel.getAivsConfig().c("auth.enable_splice_auth", true) ? token : String.format("%s app_id:%s,access_token:%s", "TP-TOKEN-V1", this.f4903k, token);
        }
        wpe.e("DeviceTokenProvider", "getAuthHeader: get access token failed");
        return null;
    }

    @Override // defpackage.tq1
    public String requestToken(boolean z, boolean z2) {
        String str;
        f01 f01Var;
        String string;
        int iE = this.mChannel.getAivsConfig().e("auth.req_token_mode");
        if (z && iE == 2) {
            String strOnGetAuthorizationToken = this.mChannel.getListener().onGetAuthorizationToken(this.mChannel);
            if (yrs.b(strOnGetAuthorizationToken)) {
                this.mError = new f01(StdStatuses.MISSING_TOKEN, "token is null");
            }
            return strOnGetAuthorizationToken;
        }
        FormBody.Builder builder = new FormBody.Builder();
        builder.add("client_id", this.f4903k);
        builder.add("device", l12.f(this.l.getBytes(), 11));
        if (!z) {
            builder.add("refresh_token", this.mChannel.getListener().onRead(this.mChannel, "refresh_token"));
        }
        builder.add("sign", this.m);
        try {
            Response responseExecute = this.n.newCall(new Request.Builder().url(new d3s(this.mChannel.getAivsConfig()).e().concat(z ? "/thirdparty/auth/token" : "/thirdparty/refresh/token")).post(builder.build()).build()).execute();
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
                wpe.e("DeviceTokenProvider", "requestToken: " + string);
                updateTrack("msg", string, false, z2);
                updateTrack("result", -1, true, z2);
                updateChannelTrack("sdk.connect.error.msg", string, z2);
                return null;
            }
            String strString = responseExecute.body().string();
            c4h c4hVar = (c4h) APIUtils.getObjectMapper().readTree(strString);
            if (c4hVar == null) {
                String str2 = "invalid device token body " + strString;
                wpe.e("DeviceTokenProvider", "requestToken" + str2);
                this.mError = new f01(401, str2);
                updateTrack("msg", str2, false, z2);
                updateTrack("result", -1, true, z2);
                updateChannelTrack("sdk.connect.error.msg", str2, z2);
                return null;
            }
            zsd zsdVarT = c4hVar.T("code");
            if (zsdVarT.G() && zsdVarT.h() == 0) {
                if (!c4hVar.T("result").H()) {
                    String str3 = "no result object in device token body " + strString;
                    wpe.e("DeviceTokenProvider", "requestToken: " + str3);
                    this.mError = new f01(401, str3);
                    updateTrack("msg", str3, false, z2);
                    updateTrack("result", -1, true, z2);
                    updateChannelTrack("sdk.connect.error.msg", str3, z2);
                    return null;
                }
                c4h c4hVar2 = (c4h) c4hVar.T("result");
                if (c4hVar2 != null && c4hVar2.T(XiaomiOAuthConstants.EXTRA_ACCESS_TOKEN_2).L() && c4hVar2.T("refresh_token").L() && c4hVar2.T(XiaomiOAuthConstants.EXTRA_EXPIRES_IN_2).G()) {
                    String strL = c4hVar2.T(XiaomiOAuthConstants.EXTRA_ACCESS_TOKEN_2).l();
                    String strL2 = c4hVar2.T("refresh_token").l();
                    long j = c4hVar2.T(XiaomiOAuthConstants.EXTRA_EXPIRES_IN_2).j();
                    this.mChannel.getListener().onWrite(this.mChannel, XiaomiOAuthConstants.EXTRA_ACCESS_TOKEN_2, strL);
                    this.mChannel.getListener().onWrite(this.mChannel, "refresh_token", strL2);
                    this.mChannel.getListener().onWrite(this.mChannel, "expire_at", String.format(TimeModel.NUMBER_FORMAT, Long.valueOf((System.currentTimeMillis() / 1000) + j)));
                    if (yrs.b(strL)) {
                        updateTrack("result", -1, false, z2);
                        updateTrack("msg", "access token is null or empty", true, z2);
                    } else {
                        updateTrack("result", 0, true, z2);
                    }
                    return strL;
                }
                String str4 = "invalid tokens in device token body " + strString;
                wpe.e("DeviceTokenProvider", "requestToken:" + str4);
                this.mError = new f01(401, str4);
                updateTrack("msg", str4, false, z2);
                updateTrack("result", -1, true, z2);
                updateChannelTrack("sdk.connect.error.msg", str4, z2);
                return null;
            }
            String str5 = "invalid code in device token body " + strString;
            wpe.e("DeviceTokenProvider", "requestToken" + str5);
            this.mError = new f01(401, str5);
            updateTrack("msg", str5, false, z2);
            updateTrack("result", -1, true, z2);
            updateChannelTrack("sdk.connect.error.msg", str5, z2);
            return null;
        } catch (IOException e) {
            wpe.e("DeviceTokenProvider", wpe.o(e));
            str = "network connect failed, " + e.getMessage();
            f01Var = new f01(StdStatuses.CONNECT_FAILED, str);
            this.mError = f01Var;
            updateTrack("msg", str, false, z2);
            updateTrack("result", -1, true, z2);
            updateChannelTrack("sdk.connect.error.msg", str, z2);
            return null;
        } catch (Exception e2) {
            wpe.e("DeviceTokenProvider", wpe.o(e2));
            str = "device token auth exception " + e2.getMessage();
            f01Var = new f01(401, str);
            this.mError = f01Var;
            updateTrack("msg", str, false, z2);
            updateTrack("result", -1, true, z2);
            updateChannelTrack("sdk.connect.error.msg", str, z2);
            return null;
        }
    }
}
