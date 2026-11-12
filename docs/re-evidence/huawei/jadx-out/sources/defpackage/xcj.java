package defpackage;

import com.apprichtap.haptic.base.PrebakedEffectId;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.ui.thirdpartservice.syncdata.callback.RefreshTokenCallback;
import com.huawei.ui.thirdpartservice.syncdata.oauth.OauthManager;
import com.huawei.ui.thirdpartservice.syncdata.strava.StravaConfig;

/* JADX INFO: loaded from: classes20.dex */
public class xcj extends OauthManager {
    @Override // com.huawei.ui.thirdpartservice.syncdata.oauth.OauthManager
    public int getThirdAccountType() {
        return 27;
    }

    public static xcj c() {
        return b.d;
    }

    private xcj() {
    }

    public void b(boolean z, StravaConfig stravaConfig, RefreshTokenCallback refreshTokenCallback) {
        super.checkConnectStatus(z, b(refreshTokenCallback, stravaConfig));
    }

    @Override // com.huawei.ui.thirdpartservice.syncdata.oauth.OauthManager
    public void checkConnectStatus(boolean z, RefreshTokenCallback refreshTokenCallback) {
        super.checkConnectStatus(z, b(refreshTokenCallback, new StravaConfig()));
    }

    private d b(RefreshTokenCallback refreshTokenCallback, StravaConfig stravaConfig) {
        String accountInfo = LoginInit.getInstance(BaseApplication.b()).getAccountInfo(1010);
        d dVar = new d(refreshTokenCallback);
        stravaConfig.d(null, accountInfo, dVar);
        return dVar;
    }

    static class d implements StravaConfig.StravaEnableCallback, RefreshTokenCallback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private RefreshTokenCallback f52699b;
        private boolean d = false;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f52698a = false;

        d(RefreshTokenCallback refreshTokenCallback) {
            this.f52699b = refreshTokenCallback;
        }

        @Override // com.huawei.ui.thirdpartservice.syncdata.callback.RefreshTokenCallback
        public void refreshResult(boolean z, boolean z2) {
            LogUtil.a("StravaOauthManager", "refreshResult isReady", Boolean.valueOf(this.d), Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(this.f52698a));
            RefreshTokenCallback refreshTokenCallback = this.f52699b;
            if (refreshTokenCallback == null) {
                return;
            }
            boolean z3 = false;
            if (this.d) {
                if (z2 && this.f52698a) {
                    z3 = true;
                }
                refreshTokenCallback.refreshResult(z, z3);
                return;
            }
            this.d = true;
            if (z && z2) {
                z3 = true;
            }
            this.f52698a = z3;
        }

        @Override // com.huawei.ui.thirdpartservice.syncdata.strava.StravaConfig.StravaEnableCallback
        public void onAbilityCallback(boolean z) {
            LogUtil.a("StravaOauthManager", "onAbilityCallback isReady", Boolean.valueOf(this.d), Boolean.valueOf(this.f52698a), Boolean.valueOf(z));
            RefreshTokenCallback refreshTokenCallback = this.f52699b;
            if (refreshTokenCallback == null) {
                return;
            }
            if (this.d) {
                refreshTokenCallback.refreshResult(true, this.f52698a && z);
            } else {
                this.d = true;
                this.f52698a = z;
            }
        }
    }

    @Override // com.huawei.ui.thirdpartservice.syncdata.oauth.OauthManager
    public String getConnectTimeKey() {
        return "key_strava_connect_time";
    }

    @Override // com.huawei.ui.thirdpartservice.syncdata.oauth.OauthManager
    public String getModuleId() {
        return String.valueOf(PrebakedEffectId.RT_SWING);
    }

    static class b {
        private static xcj d = new xcj();
    }
}
