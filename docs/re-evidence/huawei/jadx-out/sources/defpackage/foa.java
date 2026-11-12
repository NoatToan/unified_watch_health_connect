package defpackage;

import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.outofprocess.mgr.device.ProfileAgent;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.profile.client.connect.ServiceConnectCallback;
import health.compact.a.AuthorizationUtils;
import health.compact.a.Utils;

/* JADX INFO: loaded from: classes7.dex */
public class foa {
    private foa() {
    }

    public static final foa d() {
        return d.d;
    }

    static class d {
        private static final foa d = new foa();
    }

    public void e() {
        if (!LoginInit.getInstance(BaseApplication.getContext()).getIsLogined()) {
            LogUtil.j("Login_SmartLifeInterator", "syncDeviceInfoToSmartLife getIsLogined is false");
            return;
        }
        if (!fns.b()) {
            LogUtil.j("Login_SmartLifeInterator", "syncDeviceInfoToSmartLife PrivacyInteractors.isPrivacyStatementAgreed() is false");
            return;
        }
        if (Utils.o()) {
            LogUtil.j("Login_SmartLifeInterator", "syncDeviceInfoToSmartLife isOversea");
            return;
        }
        mei.e().d();
        if (!AuthorizationUtils.c(BaseApplication.getContext())) {
            LogUtil.j("Login_SmartLifeInterator", "syncDeviceInfoToSmartLife isNeedShowBeforeLogin");
        } else {
            ProfileAgent.PROFILE_AGENT.connectProfile(new ServiceConnectCallback() { // from class: foa.1
                @Override // com.huawei.profile.client.connect.ServiceConnectCallback
                public void onConnect() {
                    LogUtil.a("Login_SmartLifeInterator", "profile connected");
                    ProfileAgent.PROFILE_AGENT.setConnected(true);
                    lsy.a(new Runnable() { // from class: foa.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            new mgz().b();
                            ProfileAgent.PROFILE_AGENT.disconnectProfile();
                        }
                    });
                }

                @Override // com.huawei.profile.client.connect.ServiceConnectCallback
                public void onDisconnect() {
                    ProfileAgent.PROFILE_AGENT.setConnected(false);
                    LogUtil.a("Login_SmartLifeInterator", "profile disconnected");
                }
            });
            LogUtil.a("Login_SmartLifeInterator", "syncDeviceInfoToSmartLife enter");
        }
    }
}
