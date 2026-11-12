package com.xmlywind.devicehelper.oaId.helpers;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.os.IBinder;
import android.os.Looper;
import com.xmlywind.logger.SigmobLog;
import java.security.MessageDigest;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes22.dex */
public class g {
    public com.xmlywind.devicehelper.oaId.a.e b;
    private Context e;
    private String f;
    public String a = "OUID";
    public final LinkedBlockingQueue<IBinder> c = new LinkedBlockingQueue<>(1);
    public ServiceConnection d = new ServiceConnection() { // from class: com.xmlywind.devicehelper.oaId.helpers.g.1
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                g.this.c.put(iBinder);
            } catch (Throwable unused) {
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            g.this.b = null;
        }
    };

    public g(Context context) {
        this.e = context;
    }

    @SuppressLint({"WrongConstant"})
    private String a(String str) {
        Signature[] signatureArr;
        String packageName = this.e.getPackageName();
        if (this.f == null) {
            String string = null;
            try {
                signatureArr = this.e.getPackageManager().getPackageInfo(packageName, 64).signatures;
            } catch (Exception e) {
                SigmobLog.e(e.getMessage());
                signatureArr = null;
            }
            if (signatureArr != null && signatureArr.length > 0) {
                byte[] byteArray = signatureArr[0].toByteArray();
                try {
                    MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
                    if (messageDigest != null) {
                        byte[] bArrDigest = messageDigest.digest(byteArray);
                        StringBuilder sb = new StringBuilder();
                        for (byte b : bArrDigest) {
                            sb.append(Integer.toHexString((b & 255) | 256).substring(1, 3));
                        }
                        string = sb.toString();
                    }
                } catch (Exception e2) {
                    SigmobLog.e(e2.getMessage());
                }
            }
            this.f = string;
        }
        return ((com.xmlywind.devicehelper.oaId.a.e.a.C1060a) this.b).a(packageName, this.f, str);
    }

    private boolean a() {
        try {
            PackageInfo packageInfo = this.e.getPackageManager().getPackageInfo("com.heytap.openid", 0);
            if (packageInfo == null) {
                return false;
            }
            return (Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : (long) packageInfo.versionCode) >= 1;
        } catch (Exception e) {
            SigmobLog.e(e.getMessage());
            return false;
        }
    }

    public void a(DevicesIDsHelper.AppIdsUpdater appIdsUpdater) {
        if (a() && Looper.myLooper() != Looper.getMainLooper()) {
            Intent intent = new Intent();
            intent.setComponent(new ComponentName("com.heytap.openid", "com.heytap.openid.IdentifyService"));
            intent.setAction("action.com.heytap.openid.OPEN_ID_SERVICE");
            if (this.e.bindService(intent, this.d, 1)) {
                try {
                    com.xmlywind.devicehelper.oaId.a.e eVarA = com.xmlywind.devicehelper.oaId.a.e.a.a(this.c.take());
                    this.b = eVarA;
                    if (eVarA != null) {
                        String strA = a("OUID");
                        if (appIdsUpdater != null) {
                            appIdsUpdater.OnIdsAvalid(strA);
                        }
                    }
                } catch (Throwable th) {
                    try {
                        SigmobLog.e(th.getMessage());
                    } finally {
                        this.e.unbindService(this.d);
                    }
                }
            }
        }
    }
}
