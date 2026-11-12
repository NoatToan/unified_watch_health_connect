package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import ohos.security.deviceauth.sdk.DeviceAuthCallback;
import ohos.security.deviceauth.sdk.GroupManager;
import ohos.security.deviceauth.sdk.PlatformGroupManager;
import ohos.security.deviceauth.sdk.utils.DeviceUtil;

/* JADX INFO: loaded from: classes20.dex */
public class zty {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f54565c = new Object();
    private static volatile GroupManager d;
    private static volatile zty e;

    private zty() {
    }

    public static zty d() {
        if (e == null) {
            synchronized (f54565c) {
                if (e == null) {
                    e = new zty();
                }
            }
        }
        return e;
    }

    public int c(Context context, String str) {
        int iD = zua.d(context);
        if (iD != 0) {
            zud.d("DeviceGroupManager", "Init context failed.");
            return iD;
        }
        a(context);
        return d.initService(context, str);
    }

    public int d(String str, DeviceAuthCallback deviceAuthCallback) {
        if (d == null) {
            zud.d("DeviceGroupManager", "registerCallback:The instance of groupManager is not initialized.");
            return -1;
        }
        return d.registerCallback(str, deviceAuthCallback);
    }

    public int c(long j, String str, String str2) {
        if (d == null) {
            zud.d("DeviceGroupManager", "createGroup:The instance of groupManager is not initialized.");
            return -1;
        }
        return d.createGroup(j, str, str2);
    }

    public int e(long j, String str, String str2) {
        if (d == null) {
            zud.d("DeviceGroupManager", "deleteGroup:The instance of groupManager is not initialized.");
            return -1;
        }
        return d.deleteGroup(j, str, str2);
    }

    public int a(long j, String str, String str2) {
        if (d == null) {
            zud.d("DeviceGroupManager", "addMemberToGroup:The instance of groupManager is not initialized.");
            return -1;
        }
        return d.addMemberToGroup(j, str, str2);
    }

    public int d(long j, String str, String str2) {
        if (d == null) {
            zud.d("DeviceGroupManager", "deleteMemberFromGroup:The instance of groupManager is not initialized.");
            return -1;
        }
        return d.deleteMemberFromGroup(j, str, str2);
    }

    public int a(long j, byte[] bArr) {
        if (d == null) {
            zud.d("DeviceGroupManager", "processData:The instance of groupManager is not initialized.");
            return -1;
        }
        return d.processData(j, bArr);
    }

    public List<String> c(String str, String str2) {
        if (d == null) {
            zud.d("DeviceGroupManager", "getGroupInfo:The instance of groupManager is not initialized.");
            return new ArrayList(0);
        }
        return d.getGroupInfo(str, str2);
    }

    public boolean a(String str, String str2, String str3) {
        if (d == null) {
            zud.d("DeviceGroupManager", "isDeviceInGroup:The instance of groupManager is not initialized.");
            return false;
        }
        return d.isDeviceInGroup(str, str2, str3);
    }

    private static void a(Context context) {
        if (d == null) {
            synchronized (f54565c) {
                if (d == null) {
                    if (DeviceUtil.isSystemServiceSupported(context)) {
                        d = new PlatformGroupManager();
                    } else {
                        d = new ztx();
                    }
                }
            }
        }
    }
}
