package defpackage;

import android.content.Context;
import ohos.security.deviceauth.sdk.DeviceAuthCallback;
import ohos.security.deviceauth.sdk.GroupAuthManager;
import ohos.security.deviceauth.sdk.NativeDas;

/* JADX INFO: loaded from: classes20.dex */
class ztv implements GroupAuthManager {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f54562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f54563c = false;

    ztv() {
    }

    @Override // ohos.security.deviceauth.sdk.GroupAuthManager
    public int initService(Context context, String str) {
        if (this.f54563c) {
            return 0;
        }
        if (!NativeDas.isLibraryLoaded()) {
            zud.d("NativeGroupAuthManager", "The local library was not loaded successfully, the service could not be initialized.");
            return -1;
        }
        if (context == null || context.getFilesDir() == null) {
            zud.d("NativeGroupAuthManager", "initService: Invalid context.");
            return -1;
        }
        int iInitService = NativeDas.initService(context.getFilesDir().getPath(), str);
        if (iInitService != 0) {
            zud.d("NativeGroupAuthManager", "initService: Init group manager service failed.");
            return iInitService;
        }
        long gaInstance = NativeDas.getGaInstance();
        this.f54562b = gaInstance;
        if (gaInstance == 0) {
            zud.d("NativeGroupAuthManager", "initService: Get instance of ga failed.");
            return -1;
        }
        this.f54563c = true;
        return 0;
    }

    @Override // ohos.security.deviceauth.sdk.GroupAuthManager
    public void destroyService() {
        if (this.f54563c) {
            NativeDas.destroyService();
            this.f54563c = false;
        }
    }

    @Override // ohos.security.deviceauth.sdk.GroupAuthManager
    public int processData(long j, byte[] bArr, DeviceAuthCallback deviceAuthCallback) {
        if (!this.f54563c) {
            zud.d("NativeGroupAuthManager", "The service is not started. Please call the initService first.");
            return -1;
        }
        return NativeDas.processGaData(this.f54562b, j, bArr, deviceAuthCallback);
    }

    @Override // ohos.security.deviceauth.sdk.GroupAuthManager
    public int authDevice(long j, String str, DeviceAuthCallback deviceAuthCallback) {
        if (!this.f54563c) {
            zud.d("NativeGroupAuthManager", "The service is not started. Please call the initService first.");
            return -1;
        }
        return NativeDas.authDevice(this.f54562b, j, str, deviceAuthCallback);
    }
}
