package defpackage;

import android.content.Context;
import ohos.security.deviceauth.sdk.DeviceAuthCallback;
import ohos.security.deviceauth.sdk.GroupAuthManager;
import ohos.security.deviceauth.sdk.utils.DeviceUtil;

/* JADX INFO: loaded from: classes20.dex */
public class ztz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile GroupAuthManager f54566a;
    private static volatile ztz d;
    private static final Object e = new Object();

    private ztz() {
    }

    public static ztz c() {
        if (d == null) {
            synchronized (e) {
                if (d == null) {
                    d = new ztz();
                }
            }
        }
        return d;
    }

    public int e(Context context, String str) {
        int iD = zua.d(context);
        if (iD != 0) {
            zud.d("DeviceAuthManager", "Init context failed.");
            return iD;
        }
        c(context);
        return f54566a.initService(context, str);
    }

    public int b(long j, byte[] bArr, DeviceAuthCallback deviceAuthCallback) {
        if (f54566a == null) {
            zud.d("DeviceAuthManager", "processData:The instance of groupAuthManager is not initialized.");
            return -1;
        }
        return f54566a.processData(j, bArr, deviceAuthCallback);
    }

    public int b(long j, String str, DeviceAuthCallback deviceAuthCallback) {
        if (f54566a == null) {
            zud.d("DeviceAuthManager", "authDevice:The instance of groupAuthManager is not initialized.");
            return -1;
        }
        return f54566a.authDevice(j, str, deviceAuthCallback);
    }

    private static void c(Context context) {
        if (f54566a == null) {
            synchronized (e) {
                if (f54566a == null) {
                    if (DeviceUtil.isSystemServiceSupported(context)) {
                        f54566a = new ztw();
                    } else {
                        f54566a = new ztv();
                    }
                }
            }
        }
    }
}
