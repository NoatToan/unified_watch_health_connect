package com.xiaomi.ai.android.impl;

import android.accounts.OperationCanceledException;
import android.app.Activity;
import android.util.Log;
import com.xiaomi.account.openauth.XMAuthericationException;
import com.xiaomi.account.openauth.XiaomiOAuthorize;
import com.xiaomi.ai.android.capability.AuthCapability;
import com.xiaomi.ai.android.core.Engine;
import com.xiaomi.ai.android.core.e;
import com.xiaomi.ai.android.utils.DeviceUtils;
import com.xiaomi.common.Optional;
import defpackage.d3s;
import defpackage.e01;
import defpackage.sis;
import defpackage.wpe;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public class OAuthCapabilityImpl extends AuthCapability {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Activity f10948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f10949b;
    private final String c;
    private final int[] d;
    private final e e;

    public OAuthCapabilityImpl(Activity activity, Engine engine, int[] iArr) {
        e eVar = (e) engine;
        this.e = eVar;
        e01 e01VarI = eVar.i();
        this.f10948a = activity;
        this.f10949b = e01VarI.i("auth.client_id");
        this.c = e01VarI.i("auth.oauth.redirect_url");
        this.d = iArr;
    }

    private String a() {
        try {
            String code = new XiaomiOAuthorize().setAppId(Long.parseLong(this.f10949b)).setPlatform(0).setSkipConfirm(true).setNoMiui(true).setRedirectUrl(this.c).setScope(this.d).startGetOAuthCode(this.f10948a).getResult().getCode();
            wpe.b("OAuthCapabilityImpl", "getAppOAuthCode:get auth code:" + code);
            return code;
        } catch (OperationCanceledException | XMAuthericationException | IOException e) {
            wpe.e("OAuthCapabilityImpl", Log.getStackTraceString(e));
            return null;
        }
    }

    private String b() {
        String strB = this.e.h().getDeviceId().b();
        boolean zB = this.e.i().b("auth.oauth.upload_miot_did");
        Optional<String> miotDid = this.e.e().getClientInfo().getMiotDid();
        try {
            String code = new XiaomiOAuthorize().setAppId(Long.parseLong(this.f10949b)).setPlatform(1).setSkipConfirm(true).setNoMiui(true).setRedirectUrl(this.c).setScope(this.d).setDeviceID(strB).setState((zB && miotDid.c()) ? DeviceUtils.getDefaultState(strB, miotDid.b()) : DeviceUtils.getDefaultState(strB)).startGetOAuthCode(this.f10948a).getResult().getCode();
            wpe.b("OAuthCapabilityImpl", "getDeviceOAuthCode: get auth code:" + code);
            return code;
        } catch (OperationCanceledException | XMAuthericationException | IOException e) {
            wpe.e("OAuthCapabilityImpl", Log.getStackTraceString(e));
            return null;
        }
    }

    public String getUserProfile() {
        try {
            return sis.b(new d3s(this.e.i()).c() + "?clientId=" + this.e.i().i("auth.client_id") + "&token=" + this.e.getAccessToken(), null);
        } catch (IOException e) {
            wpe.e("OAuthCapabilityImpl", Log.getStackTraceString(e));
            return null;
        }
    }

    @Override // com.xiaomi.ai.android.capability.AuthCapability
    public String onGetOAuthCode() {
        if (this.e.d() == 4) {
            return a();
        }
        if (this.e.d() == 1) {
            return b();
        }
        return null;
    }

    public boolean refreshToken() {
        this.e.e().getAuthProvider().requestToken(false, false);
        return true;
    }
}
