package com.xiaomi.ai.android.impl;

import android.accounts.OperationCanceledException;
import android.app.Activity;
import android.util.Log;
import com.xiaomi.account.openauth.XMAuthericationException;
import com.xiaomi.account.openauth.XiaomiOAuthorize;
import com.xiaomi.ai.android.capability.AuthCapability;
import com.xiaomi.ai.android.core.Engine;
import com.xiaomi.ai.android.core.d;
import com.xiaomi.ai.android.utils.DeviceUtils;
import com.xiaomi.ai.core.AivsConfig;
import com.xiaomi.ai.log.Logger;
import com.xiaomi.common.Optional;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
public class OAuthCapabilityImpl extends AuthCapability {
    private Activity a;
    private String b;
    private String c;
    private int[] d;
    private d e;

    public OAuthCapabilityImpl(Activity activity, Engine engine, int[] iArr) {
        d dVar = (d) engine;
        this.e = dVar;
        AivsConfig aivsConfigB = dVar.b();
        this.a = activity;
        this.b = aivsConfigB.getString(AivsConfig.Auth.CLIENT_ID);
        this.c = aivsConfigB.getString(AivsConfig.Auth.OAuth.REDIRECT_URL);
        this.d = iArr;
    }

    private String a() {
        try {
            String code = new XiaomiOAuthorize().setAppId(Long.parseLong(this.b)).setPlatform(0).setSkipConfirm(true).setNoMiui(true).setRedirectUrl(this.c).setScope(this.d).startGetOAuthCode(this.a).getResult().getCode();
            Logger.a("OAuthCapabilityImpl", "getAppOAuthCode:get auth code:" + code);
            return code;
        } catch (OperationCanceledException | XMAuthericationException | IOException e) {
            Logger.d("OAuthCapabilityImpl", Log.getStackTraceString(e));
            return null;
        }
    }

    private String b() {
        String str = this.e.m().getDeviceId().get();
        boolean z = this.e.b().getBoolean(AivsConfig.Auth.OAuth.ENABLE_UPLOAD_MIOT_DID);
        Optional<String> miotDid = this.e.g().getClientInfo().getMiotDid();
        try {
            String code = new XiaomiOAuthorize().setAppId(Long.parseLong(this.b)).setPlatform(1).setSkipConfirm(true).setNoMiui(true).setRedirectUrl(this.c).setScope(this.d).setDeviceID(str).setState((z && miotDid.isPresent()) ? DeviceUtils.getDefaultState(str, miotDid.get()) : DeviceUtils.getDefaultState(str)).startGetOAuthCode(this.a).getResult().getCode();
            Logger.a("OAuthCapabilityImpl", "getDeviceOAuthCode: get auth code:" + code);
            return code;
        } catch (OperationCanceledException | XMAuthericationException | IOException e) {
            Logger.d("OAuthCapabilityImpl", Log.getStackTraceString(e));
            return null;
        }
    }

    public String getUserProfile() {
        try {
            return com.xiaomi.ai.b.d.a(new com.xiaomi.ai.core.c(this.e.b()).g() + "?clientId=" + this.e.b().getString(AivsConfig.Auth.CLIENT_ID) + "&token=" + this.e.getAccessToken(), (Map<String, String>) null);
        } catch (IOException e) {
            Logger.d("OAuthCapabilityImpl", Log.getStackTraceString(e));
            return null;
        }
    }

    @Override // com.xiaomi.ai.android.capability.AuthCapability
    public String onGetOAuthCode() {
        if (this.e.l() == 4) {
            return a();
        }
        if (this.e.l() == 1) {
            return b();
        }
        return null;
    }

    public boolean refreshToken() {
        this.e.g().getAuthProvider().a(false, false);
        return true;
    }
}
