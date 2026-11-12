package defpackage;

import com.google.android.material.timepicker.TimeModel;
import com.xiaomi.account.openauth.XiaomiOAuthConstants;
import com.xiaomi.ai.api.StdStatuses;
import com.xiaomi.ai.api.common.APIUtils;
import com.xiaomi.common.Optional;
import com.xiaomi.smarthome.library.apache.http.protocol.HTTP;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: loaded from: classes7.dex */
public class res extends tq1 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f32477k;
    public String l;
    public String m;
    public String n;
    public OkHttpClient o;

    public res(int i, gt3 gt3Var) {
        super(i, gt3Var);
        this.o = new OkHttpClient();
        e();
    }

    public final String b() {
        String strOnRead = this.mChannel.getListener().onRead(this.mChannel, XiaomiOAuthConstants.EXTRA_ACCESS_TOKEN_2);
        if (yrs.b(strOnRead)) {
            return null;
        }
        String strOnRead2 = this.mChannel.getListener().onRead(this.mChannel, "expire_at");
        if (yrs.b(strOnRead2) || Long.parseLong(strOnRead2) - (System.currentTimeMillis() / 1000) <= 0) {
            return null;
        }
        wpe.b("OAuthProvider", "getToken: use cachedAccessToken:" + strOnRead);
        return strOnRead;
    }

    public final String c(boolean z) {
        String strOnRead;
        StringBuilder sb = new StringBuilder();
        int i = this.mAuthType;
        sb.append("?pt=");
        if (i == 1) {
            sb.append(1);
            sb.append(gv5.CONNECT_STR);
            sb.append("scope_data=");
            sb.append(d());
        } else {
            sb.append(0);
        }
        sb.append(gv5.CONNECT_STR);
        sb.append("client_id=");
        sb.append(this.f32477k);
        sb.append(gv5.CONNECT_STR);
        sb.append("client_secret=");
        sb.append(this.m);
        sb.append(gv5.CONNECT_STR);
        sb.append("redirect_uri=");
        sb.append(this.l);
        sb.append(gv5.CONNECT_STR);
        if (z) {
            strOnRead = this.mChannel.getListener().onGetOAuthCode(this.mChannel);
            if (yrs.b(strOnRead)) {
                wpe.e("OAuthProvider", "get authCode fail");
                return null;
            }
            wpe.h("OAuthProvider", "requestToken: get auth code:" + strOnRead);
            sb.append("grant_type=");
            sb.append("authorization_code");
            sb.append(gv5.CONNECT_STR);
            sb.append("code=");
        } else {
            wpe.h("OAuthProvider", "requestToken: refresh token");
            sb.append("grant_type=");
            sb.append("refresh_token");
            sb.append(gv5.CONNECT_STR);
            sb.append("refresh_token=");
            strOnRead = this.mChannel.getListener().onRead(this.mChannel, "refresh_token");
        }
        sb.append(strOnRead);
        return new d3s(this.mChannel.getAivsConfig()).k().concat("/oauth2/auth/token").concat(sb.toString());
    }

    public final String d() {
        Optional<String> miotDid = this.mChannel.getClientInfo().getMiotDid();
        return l12.f(((this.mChannel.getAivsConfig().b("auth.oauth.upload_miot_did") && miotDid.c()) ? String.format("{\"d\":\"%s\",\"md\":\"%s\"}", this.n, miotDid.b()) : String.format("{\"d\":\"%s\"}", this.n)).getBytes(), 11);
    }

    public final void e() {
        if (this.mChannel.getAivsConfig().c("auth.enable_splice_auth", true)) {
            int i = this.mAuthType;
            if (i != 4 && i != 1) {
                wpe.e("OAuthProvider", "initProvider: unsupported authType=" + this.mAuthType);
                throw new IllegalArgumentException("unsupported authType : " + this.mAuthType);
            }
            if (!this.mChannel.getClientInfo().getDeviceId().c()) {
                wpe.e("OAuthProvider", "initProvider: device id is not set");
                throw new IllegalArgumentException("device id is not set");
            }
            this.n = this.mChannel.getClientInfo().getDeviceId().b();
            String strI = this.mChannel.getAivsConfig().i("auth.client_id");
            this.f32477k = strI;
            if (yrs.b(strI)) {
                wpe.e("OAuthProvider", "initProvider: CLIENT_ID is not set");
                throw new IllegalArgumentException("CLIENT_ID is not set");
            }
            if (this.mChannel.getAivsConfig().e("auth.req_token_mode") == 1) {
                return;
            }
            String strI2 = this.mChannel.getAivsConfig().i("auth.oauth.redirect_url");
            if (yrs.b(strI2)) {
                wpe.e("OAuthProvider", "initProvider: REDIRECT_URL is not set");
                throw new IllegalArgumentException("REDIRECT_URL is not set");
            }
            String strI3 = this.mChannel.getAivsConfig().i("auth.oauth.client_secret");
            if (yrs.b(strI3)) {
                wpe.e("OAuthProvider", "initProvider: CLIENT_SECRET is not set");
                throw new IllegalArgumentException("CLIENT_SECRET is not set");
            }
            try {
                this.l = URLEncoder.encode(strI2, "UTF-8");
                this.m = URLEncoder.encode(strI3, "UTF-8");
            } catch (UnsupportedEncodingException e) {
                wpe.e("OAuthProvider", wpe.o(e));
                throw new IllegalArgumentException("redirectUrl or clientSecret is illegal");
            }
        }
    }

    public final boolean f() {
        int i;
        if (!this.mChannel.getAivsConfig().b("connection.enable_refresh_token_limit")) {
            return false;
        }
        try {
            String strOnRead = this.mChannel.getListener().onRead(this.mChannel, "updated_at");
            long j = !yrs.b(strOnRead) ? Long.parseLong(strOnRead) : 0L;
            long jCurrentTimeMillis = (System.currentTimeMillis() / 1000) - j;
            if (jCurrentTimeMillis < 0) {
                wpe.e("OAuthProvider", "RefreshLimit false,illegal update time:" + j);
                g();
                return false;
            }
            if (jCurrentTimeMillis > this.mChannel.getAivsConfig().e("connection.refresh_token_min_interval")) {
                g();
                return false;
            }
            try {
                String strOnRead2 = this.mChannel.getListener().onRead(this.mChannel, "refresh_times_during_limit");
                i = !yrs.b(strOnRead2) ? Integer.parseInt(strOnRead2) : 0;
            } catch (NumberFormatException e) {
                wpe.k("OAuthProvider", "RefreshLimit false : no request time" + e.toString());
            }
            int i2 = i + 1;
            boolean z = i2 > this.mChannel.getAivsConfig().e("connection.max_refresh_times_during_limit");
            wpe.h("OAuthProvider", "requestTimes: " + i2 + " updateAt: " + j);
            this.mChannel.getListener().onWrite(this.mChannel, "refresh_times_during_limit", String.valueOf(i2));
            return z;
        } catch (NumberFormatException e2) {
            wpe.k("OAuthProvider", "RefreshLimit false : no update time" + e2.toString());
            g();
            return false;
        }
    }

    public final void g() {
        this.mChannel.getListener().onRemove(this.mChannel, "refresh_times_during_limit");
        this.mChannel.getListener().onWrite(this.mChannel, "updated_at", String.valueOf(System.currentTimeMillis() / 1000));
    }

    @Override // defpackage.tq1
    public String getAuthHeader(boolean z, boolean z2, Map<String, String> map) {
        String str;
        wpe.h("OAuthProvider", "getAuthHeader: forceRefresh : " + z + " isTrack : " + z2);
        this.mError = null;
        String token = getToken(z, z2);
        if (yrs.b(token)) {
            str = "getAuthHeader: get access token failed";
        } else {
            if (!this.mChannel.getAivsConfig().c("auth.enable_splice_auth", true)) {
                return token;
            }
            String strI = this.mChannel.getAivsConfig().i("auth.client_id");
            int i = this.mAuthType;
            if (i == 1) {
                return String.format("%s app_id:%s,scope_data:%s,access_token:%s", "DO-TOKEN-V1", strI, d(), token);
            }
            if (i == 4) {
                return String.format("%s dev_app_id:%s,access_token:%s", "AO-TOKEN-V1", strI, token);
            }
            str = "getAuthHeader: unsupported authType=" + this.mAuthType;
        }
        wpe.e("OAuthProvider", str);
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:82:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:84:0x0304  */
    @Override // defpackage.tq1
    public String requestToken(boolean z, boolean z2) {
        StringBuilder sb;
        String str;
        String string;
        String str2;
        String string2;
        StringBuilder sb2;
        if (f()) {
            wpe.h("OAuthProvider", "requestToken limited");
            String strB = b();
            updateTrack("status", 7, false, z2);
            if (!yrs.b(strB)) {
                updateTrack("result", 0, true, z2);
                return strB;
            }
            updateTrack("msg", "requestToken limited token null", false, z2);
            updateTrack("result", -1, true, z2);
            return null;
        }
        int iE = this.mChannel.getAivsConfig().e("auth.req_token_mode");
        if (z && iE == 2) {
            updateTrack("status", 6, false, z2);
            String strOnGetAuthorizationToken = this.mChannel.getListener().onGetAuthorizationToken(this.mChannel);
            if (!yrs.b(strOnGetAuthorizationToken)) {
                updateTrack("result", 0, true, z2);
                return strOnGetAuthorizationToken;
            }
            this.mError = new f01(StdStatuses.MISSING_TOKEN, "token is null");
            updateTrack("msg", "onGetAuthorizationToken null", false, z2);
            updateTrack("result", -1, true, z2);
            return null;
        }
        String strC = c(z);
        wpe.b("OAuthProvider", "requestToken:" + strC);
        try {
            Response responseExecute = this.o.newCall(new Request.Builder().url(strC).get().addHeader(HTTP.DATE_HEADER, sus.a()).build()).execute();
            if (responseExecute == null || !responseExecute.isSuccessful()) {
                wpe.e("OAuthProvider", "requestToken: request failed, response=" + responseExecute);
                if (responseExecute != null) {
                    if (responseExecute.code() == 401 || responseExecute.code() == 400) {
                        this.mChannel.clearAuthToken();
                    }
                    string2 = responseExecute.toString();
                    if (responseExecute.headers() != null) {
                        string2 = string2 + "headers=" + responseExecute.headers().toString();
                    }
                    if (responseExecute.body() != null) {
                        string2 = string2 + ", body=" + responseExecute.body().string();
                    }
                    wpe.e("OAuthProvider", "requestToken: " + string2);
                    updateTrack("msg", string2, false, z2);
                    updateTrack("result", -1, true, z2);
                    updateChannelTrack("sdk.connect.error.code", responseExecute.code(), z2);
                }
                if (z) {
                    str2 = "oauth_code_2_token";
                } else {
                    str2 = "oauth_refresh_2_token";
                }
                updateChannelTrack("sdk.connect.error.substep", str2, z2);
                return null;
            }
            String strString = responseExecute.body().string();
            c4h c4hVar = (c4h) APIUtils.getObjectMapper().readTree(strString);
            if (c4hVar != null && c4hVar.T(XiaomiOAuthConstants.EXTRA_ACCESS_TOKEN_2).L() && c4hVar.T("refresh_token").L() && c4hVar.T(XiaomiOAuthConstants.EXTRA_EXPIRES_IN_2).G()) {
                wpe.b("OAuthProvider", "requestToken: bodyStr=" + strString);
                String strL = c4hVar.T(XiaomiOAuthConstants.EXTRA_ACCESS_TOKEN_2).l();
                String strL2 = c4hVar.T("refresh_token").l();
                long j = c4hVar.T(XiaomiOAuthConstants.EXTRA_EXPIRES_IN_2).j();
                this.mChannel.getListener().onWrite(this.mChannel, XiaomiOAuthConstants.EXTRA_ACCESS_TOKEN_2, strL);
                this.mChannel.getListener().onWrite(this.mChannel, "refresh_token", strL2);
                this.mChannel.getListener().onWrite(this.mChannel, "expire_at", String.format(TimeModel.NUMBER_FORMAT, Long.valueOf((System.currentTimeMillis() / 1000) + j)));
                if (yrs.b(strL)) {
                    updateTrack("result", -1, false, z2);
                    updateTrack("msg", "access token is null or empty", true, z2);
                    updateChannelTrack("sdk.connect.error.msg", "access token is null or empty", z2);
                } else {
                    this.mChannel.getListener().onWrite(this.mChannel, "refresh_at", String.format(TimeModel.NUMBER_FORMAT, Long.valueOf(System.currentTimeMillis() / 1000)));
                    updateTrack("result", 0, true, z2);
                }
                return strL;
            }
            wpe.e("OAuthProvider", "requestToken: invalid body " + strString);
            if (this.mAuthType == 1) {
                sb2 = new StringBuilder();
                sb2.append("invalid device oauth body ");
            } else {
                sb2 = new StringBuilder();
                sb2.append("invalid app oauth body ");
            }
            sb2.append(strString);
            String string3 = sb2.toString();
            this.mError = new f01(401, string3);
            updateTrack("msg", string3, false, z2);
            updateTrack("result", -1, true, z2);
            string2 = string3 + strString;
            updateChannelTrack("sdk.connect.error.msg", string2, z2);
        } catch (IOException e) {
            wpe.e("OAuthProvider", wpe.o(e));
            string = "network connect failed, " + e.getMessage();
            this.mError = new f01(StdStatuses.CONNECT_FAILED, string);
            finishTrack(-1, -1, string, z2);
            updateChannelTrack("sdk.connect.error.msg", string, z2);
        } catch (Exception e2) {
            wpe.e("OAuthProvider", wpe.o(e2));
            if (this.mAuthType == 1) {
                sb = new StringBuilder();
                str = "device oauth requestToken fail: ";
            } else {
                sb = new StringBuilder();
                str = "app oauth requestToken fail: ";
            }
            sb.append(str);
            sb.append(e2.getMessage());
            string = sb.toString();
            this.mError = new f01(401, string);
            updateTrack("msg", string, false, z2);
            updateTrack("result", -1, true, z2);
            updateChannelTrack("sdk.connect.error.msg", string, z2);
        }
        if (z) {
            str2 = "oauth_code_2_token";
        } else {
            str2 = "oauth_refresh_2_token";
        }
        updateChannelTrack("sdk.connect.error.substep", str2, z2);
        return null;
    }
}
