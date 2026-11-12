package kg;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Looper;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes7.dex */
public class g implements ig.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f104679a = false;

    @Override // ig.a
    public final String a(Context context) {
        if (context == null) {
            return null;
        }
        if (!this.f104679a) {
            gg.c cVar = gg.c.b.f77107a;
            Context applicationContext = context.getApplicationContext();
            cVar.getClass();
            boolean z14 = false;
            try {
                PackageInfo packageInfo = applicationContext.getPackageManager().getPackageInfo("com.heytap.openid", 0);
                if (packageInfo != null && packageInfo.getLongVersionCode() >= 1) {
                    z14 = true;
                }
            } catch (PackageManager.NameNotFoundException e4) {
                e4.printStackTrace();
            }
            gg.b.f77100b = z14;
            gg.b.f77099a = true;
            this.f104679a = true;
        }
        boolean z15 = gg.b.f77099a;
        if (!z15) {
            f.n("SDK Need Init First!");
            return null;
        }
        if (!gg.b.f77100b) {
            return null;
        }
        if (!z15) {
            f.n("SDK Need Init First!");
            return null;
        }
        gg.c cVar2 = gg.c.b.f77107a;
        Context applicationContext2 = context.getApplicationContext();
        synchronized (cVar2) {
            try {
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    throw new IllegalStateException("Cannot run on MainThread");
                }
                if (cVar2.f77101a != null) {
                    try {
                        return cVar2.a(applicationContext2);
                    } catch (RemoteException e14) {
                        e14.printStackTrace();
                        return "";
                    }
                }
                Intent intent = new Intent();
                intent.setComponent(new ComponentName("com.heytap.openid", "com.heytap.openid.IdentifyService"));
                intent.setAction("action.com.heytap.openid.OPEN_ID_SERVICE");
                if (applicationContext2.bindService(intent, cVar2.f77105e, 1)) {
                    synchronized (cVar2.f77104d) {
                        try {
                            cVar2.f77104d.wait(3000L);
                        } catch (InterruptedException e15) {
                            e15.printStackTrace();
                        }
                    }
                }
                if (cVar2.f77101a == null) {
                    return "";
                }
                try {
                    return cVar2.a(applicationContext2);
                } catch (RemoteException e16) {
                    e16.printStackTrace();
                    return "";
                }
                throw th;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
