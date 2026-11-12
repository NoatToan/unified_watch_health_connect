package com.huawei.openalliance.ad.utils;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.yb;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes12.dex */
public class cc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f20521a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f20522b = "";

    /* JADX INFO: Access modifiers changed from: private */
    public static String b(Context context, IBinder iBinder) {
        String packageName = context.getPackageName();
        if (f20521a == null) {
            try {
                byte[] bArrDigest = MessageDigest.getInstance("SHA1").digest(context.getPackageManager().getPackageInfo(packageName, 64).signatures[0].toByteArray());
                StringBuilder sb = new StringBuilder();
                for (byte b2 : bArrDigest) {
                    sb.append(Integer.toHexString((b2 & 255) | 256).substring(1, 3));
                }
                String string = sb.toString();
                f20521a = string;
                return a(iBinder, packageName, string);
            } catch (Throwable th) {
                hw.c("OIdentifierManager", "realGetOUID ex: %s", th.getClass().getSimpleName());
            }
        }
        return a(iBinder, packageName, f20521a);
    }

    private static String a(IBinder iBinder, String str, String str2) {
        try {
            yb ybVar = (yb) yb.a.class.getDeclaredMethod("a", IBinder.class).invoke(null, iBinder);
            if (ybVar == null) {
                hw.c("OIdentifierManager", "IOpenID is null");
            }
            return ybVar.a(str, str2, "OUID");
        } catch (Throwable th) {
            hw.c("OIdentifierManager", "getSerId error: %s", th.getClass().getSimpleName());
            return null;
        }
    }

    public static String a(final Context context) {
        Intent intent = new Intent("action.com.heytap.openid.OPEN_ID_SERVICE");
        intent.setComponent(new ComponentName("com.heytap.openid", "com.heytap.openid.IdentifyService"));
        try {
            if (!context.bindService(intent, new ServiceConnection() { // from class: com.huawei.openalliance.ad.utils.cc.1
                @Override // android.content.ServiceConnection
                public void onServiceDisconnected(ComponentName componentName) {
                    hw.b("OIdentifierManager", "HeyTap IdentifyService disconnected");
                }

                @Override // android.content.ServiceConnection
                public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                    hw.b("OIdentifierManager", "HeyTap IdentifyService connected");
                    try {
                        String strB = cc.b(context, iBinder);
                        if (strB == null || strB.length() == 0) {
                            hw.c("OIdentifierManager", "HeyTap OUID get failed");
                        } else {
                            String unused = cc.f20522b = strB;
                        }
                        try {
                            context.unbindService(this);
                        } catch (Throwable th) {
                            hw.c("OIdentifierManager", "HeyTap IdentifyService, unbind service error: %s", th.getClass().getSimpleName());
                        }
                    } catch (Throwable th2) {
                        try {
                            hw.c("OIdentifierManager", "HeyTap IdentifyService, bind service error: %s", th2.getClass().getSimpleName());
                        } finally {
                            try {
                                context.unbindService(this);
                            } catch (Throwable th3) {
                                hw.c("OIdentifierManager", "HeyTap IdentifyService, unbind service error: %s", th3.getClass().getSimpleName());
                            }
                        }
                    }
                }
            }, 1)) {
                hw.c("OIdentifierManager", "HeyTap IdentifyService bind failed");
            }
        } catch (Throwable th) {
            hw.c("OIdentifierManager", "get oaid error: %s", th.getClass().getSimpleName());
        }
        return f20522b;
    }
}
