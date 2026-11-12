package defpackage;

import android.content.Context;
import com.huawei.security.deviceauth.HichainAuthManager;
import ohos.security.deviceauth.sdk.DeviceAuthCallback;
import ohos.security.deviceauth.sdk.GroupAuthManager;

/* JADX INFO: loaded from: classes20.dex */
public class ztw implements GroupAuthManager {
    private HichainAuthManager d;

    @Override // ohos.security.deviceauth.sdk.GroupAuthManager
    public void destroyService() {
    }

    ztw() {
    }

    @Override // ohos.security.deviceauth.sdk.GroupAuthManager
    public int processData(long j, byte[] bArr, DeviceAuthCallback deviceAuthCallback) {
        HichainAuthManager hichainAuthManager = this.d;
        if (hichainAuthManager != null) {
            return hichainAuthManager.processAuthData(b(deviceAuthCallback), j, bArr) ? 0 : -1;
        }
        zud.d("PlatformGroupAuthManager", "instance is null");
        return -1;
    }

    @Override // ohos.security.deviceauth.sdk.GroupAuthManager
    public int authDevice(long j, String str, DeviceAuthCallback deviceAuthCallback) {
        HichainAuthManager hichainAuthManager = this.d;
        if (hichainAuthManager == null) {
            zud.d("PlatformGroupAuthManager", "instance is null");
            return -1;
        }
        return hichainAuthManager.authDevice(b(deviceAuthCallback), j, str);
    }

    @Override // ohos.security.deviceauth.sdk.GroupAuthManager
    public int initService(Context context, String str) {
        HichainAuthManager hichainAuthManager = HichainAuthManager.getInstance(context);
        this.d = hichainAuthManager;
        if (hichainAuthManager != null) {
            return 0;
        }
        zud.d("PlatformGroupAuthManager", "instance is null");
        return -1;
    }

    private HichainAuthManager.HichainAuthCallback b(final DeviceAuthCallback deviceAuthCallback) {
        if (deviceAuthCallback == null) {
            return null;
        }
        return new HichainAuthManager.HichainAuthCallback() { // from class: ohos.security.deviceauth.sdk.PlatformGroupAuthManager$1
            public void onFinish(long j, int i, String str) {
                deviceAuthCallback.onFinish(j, i, str);
            }

            public void onError(long j, int i, int i2, String str) {
                deviceAuthCallback.onError(j, i, i2, str);
            }

            public boolean onTransmit(long j, byte[] bArr) {
                return deviceAuthCallback.onTransmit(j, bArr);
            }

            public String onRequest(long j, int i, String str) {
                return deviceAuthCallback.onRequest(j, i, str);
            }

            public void onSessionKeyReturned(long j, byte[] bArr) {
                deviceAuthCallback.onSessionKeyReturned(j, bArr);
            }
        };
    }
}
