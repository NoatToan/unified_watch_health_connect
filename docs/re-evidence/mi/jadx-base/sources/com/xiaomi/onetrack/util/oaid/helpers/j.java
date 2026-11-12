package com.xiaomi.onetrack.util.oaid.helpers;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.os.IBinder;
import com.xiaomi.onetrack.util.p;
import java.security.MessageDigest;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes11.dex */
public class j {
    private static final String d = "OppoDeviceIDHelper";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    com.xiaomi.onetrack.util.oaid.a.e f13979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedBlockingQueue<IBinder> f13980b = new LinkedBlockingQueue<>(1);
    ServiceConnection c = new ServiceConnection() { // from class: com.xiaomi.onetrack.util.oaid.helpers.OppoDeviceIDHelper$1
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.f13956a.f13980b.offer(iBinder, 1L, TimeUnit.SECONDS);
            } catch (Exception e) {
                p.a("OppoDeviceIDHelper", e.getMessage());
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            this.f13956a.f13979a = null;
        }
    };
    private String e;

    private boolean b(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.heytap.openid", 0);
            return packageInfo != null && ((long) packageInfo.versionCode) >= 1;
        } catch (Exception e) {
            p.a(d, e.getMessage());
            return true;
        }
    }

    public String a(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName("com.heytap.openid", "com.heytap.openid.IdentifyService"));
        intent.setAction("action.com.heytap.openid.OPEN_ID_SERVICE");
        String strA = "";
        try {
            if (context.bindService(intent, this.c, 1)) {
                try {
                    try {
                        IBinder iBinderPoll = this.f13980b.poll(1L, TimeUnit.SECONDS);
                        if (iBinderPoll == null) {
                            try {
                                context.unbindService(this.c);
                            } catch (Exception e) {
                                p.a(d, e.getMessage());
                            }
                            return "";
                        }
                        com.xiaomi.onetrack.util.oaid.a.e eVarA = com.xiaomi.onetrack.util.oaid.a.e.a.a(iBinderPoll);
                        this.f13979a = eVarA;
                        if (eVarA != null) {
                            strA = a("OUID", context);
                        }
                        context.unbindService(this.c);
                    } catch (Exception e2) {
                        p.a(d, e2.getMessage());
                        context.unbindService(this.c);
                    }
                } catch (Throwable th) {
                    try {
                        context.unbindService(this.c);
                    } catch (Exception e3) {
                        p.a(d, e3.getMessage());
                    }
                    throw th;
                }
            }
        } catch (Exception e4) {
            p.a(d, e4.getMessage());
        }
        return strA;
    }

    private String a(String str, Context context) {
        Signature[] signatureArr;
        String packageName = context.getPackageName();
        if (this.e == null) {
            String string = null;
            try {
                signatureArr = context.getPackageManager().getPackageInfo(packageName, 64).signatures;
            } catch (Exception e) {
                e.printStackTrace();
                signatureArr = null;
            }
            if (signatureArr != null && signatureArr.length > 0) {
                byte[] byteArray = signatureArr[0].toByteArray();
                try {
                    MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
                    if (messageDigest != null) {
                        byte[] bArrDigest = messageDigest.digest(byteArray);
                        StringBuilder sb = new StringBuilder();
                        for (byte b2 : bArrDigest) {
                            sb.append(Integer.toHexString((b2 & 255) | 256).substring(1, 3));
                        }
                        string = sb.toString();
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
            this.e = string;
        }
        return ((com.xiaomi.onetrack.util.oaid.a.e.a.C0836a) this.f13979a).a(packageName, this.e, str);
    }
}
