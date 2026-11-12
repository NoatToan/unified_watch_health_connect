package defpackage;

import android.os.Bundle;
import com.smarthome.core.HostApi;
import com.smarthome.core.SmartCallBack;
import com.smarthome.core.SmartHomeSDK;
import com.smarthome.core.network.SmartTokenInfo;
import com.xiaomi.smarthome.core.entity.Error;
import com.xiaomi.smarthome.core.entity.account.RefreshServiceTokenResult;
import com.xiaomi.smarthome.core.server.internal.NetCallback;
import com.xiaomi.smarthome.network.NetworkDepApi;

/* JADX INFO: loaded from: classes6.dex */
public class bkg extends NetworkDepApi {

    public class a implements SmartCallBack<SmartTokenInfo> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ NetCallback f4314a;

        public a(NetCallback netCallback) {
            this.f4314a = netCallback;
        }

        @Override // com.smarthome.core.SmartCallBack
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(SmartTokenInfo smartTokenInfo) {
            NetCallback netCallback = this.f4314a;
            if (netCallback != null) {
                if (smartTokenInfo == null) {
                    netCallback.onFailure(new Error(-1, "refreshServiceToken failed"));
                    return;
                }
                RefreshServiceTokenResult refreshServiceTokenResult = new RefreshServiceTokenResult();
                refreshServiceTokenResult.userId = smartTokenInfo.getMiId();
                refreshServiceTokenResult.passToken = smartTokenInfo.getPassToken();
                refreshServiceTokenResult.serviceToken = smartTokenInfo.getServiceToken();
                refreshServiceTokenResult.ssecurity = smartTokenInfo.getSsecurity();
                refreshServiceTokenResult.timeDiff = smartTokenInfo.getTimeDiff();
                refreshServiceTokenResult.cUserId = smartTokenInfo.getCUserId();
                Bundle bundle = new Bundle();
                bundle.putParcelable("result", refreshServiceTokenResult);
                this.f4314a.onSuccess(bundle);
            }
        }

        @Override // com.smarthome.core.SmartCallBack
        public void onFailure(int i, String str) {
            NetCallback netCallback = this.f4314a;
            if (netCallback != null) {
                netCallback.onFailure(new Error(i, str));
            }
        }
    }

    @Override // com.xiaomi.smarthome.network.NetworkDepApi
    public String HashedDeviceIdUtil() {
        return null;
    }

    @Override // com.xiaomi.smarthome.network.NetworkDepApi
    public void doUnAuthorized() {
        HostApi hostApi = SmartHomeSDK.INSTANCE.getHostApi();
        if (hostApi != null) {
            hostApi.onUnAuthorized();
        }
    }

    @Override // com.xiaomi.smarthome.network.NetworkDepApi
    public String getFcmToken() {
        return null;
    }

    @Override // com.xiaomi.smarthome.network.NetworkDepApi
    public String getPushId() {
        return null;
    }

    @Override // com.xiaomi.smarthome.network.NetworkDepApi
    public void installCommonOnce() {
    }

    @Override // com.xiaomi.smarthome.network.NetworkDepApi
    public void log401AfterRefreshToken(String str) {
    }

    @Override // com.xiaomi.smarthome.network.NetworkDepApi
    public void log401Exp(String str) {
    }

    @Override // com.xiaomi.smarthome.network.NetworkDepApi
    public void postCatchedException(Throwable th) {
    }

    @Override // com.xiaomi.smarthome.network.NetworkDepApi
    public void refreshServiceToken(String str, String str2, boolean z, String str3, NetCallback<Bundle, Error> netCallback) {
        HostApi hostApi = SmartHomeSDK.INSTANCE.getHostApi();
        if (hostApi != null) {
            hostApi.refreshServiceToken(str, str2, new a(netCallback));
        }
    }

    @Override // com.xiaomi.smarthome.network.NetworkDepApi
    public void statCuserId() {
    }
}
