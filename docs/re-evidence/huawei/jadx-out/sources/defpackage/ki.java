package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.media3.common.C;
import com.alipay.sdk.m.a.a;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes4.dex */
public class ki {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f39307b = null;
    public String d = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f39308c = null;
    public final Object e = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ServiceConnection f39306a = new e();

    public static class b {
        public static final ki e = new ki(null);
    }

    public class e implements ServiceConnection {
        public e() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            ki.this.f39307b = a.AbstractBinderC0015a.a(iBinder);
            synchronized (ki.this.e) {
                ki.this.e.notify();
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            ki.this.f39307b = null;
        }
    }

    public /* synthetic */ ki(e eVar) {
    }

    public final String a(Context context, String str) {
        Signature[] signatureArr;
        if (TextUtils.isEmpty(this.d)) {
            this.d = context.getPackageName();
        }
        if (TextUtils.isEmpty(this.f39308c)) {
            String string = null;
            try {
                signatureArr = context.getPackageManager().getPackageInfo(this.d, 64).signatures;
            } catch (PackageManager.NameNotFoundException e2) {
                e2.printStackTrace();
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
                } catch (NoSuchAlgorithmException e3) {
                    e3.printStackTrace();
                }
            }
            this.f39308c = string;
        }
        String strC = ((a.AbstractBinderC0015a.c) this.f39307b).c(this.d, this.f39308c, str);
        return TextUtils.isEmpty(strC) ? "" : strC;
    }

    public boolean c(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.heytap.openid", 0);
            if (Build.VERSION.SDK_INT >= 28) {
                return packageInfo != null && packageInfo.getLongVersionCode() >= 1;
            }
            return packageInfo != null && packageInfo.versionCode >= 1;
        } catch (PackageManager.NameNotFoundException e2) {
            e2.printStackTrace();
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0047 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:47:0x004b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public String d(Context context, String str) {
        synchronized (this) {
            if (Looper.myLooper() != Looper.getMainLooper()) {
                if (this.f39307b == null) {
                    Intent intent = new Intent();
                    intent.setComponent(new ComponentName("com.heytap.openid", "com.heytap.openid.IdentifyService"));
                    intent.setAction("action.com.heytap.openid.OPEN_ID_SERVICE");
                    if (context.bindService(intent, this.f39306a, 1)) {
                        synchronized (this.e) {
                            try {
                                this.e.wait(C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
                            } catch (InterruptedException e2) {
                                e2.printStackTrace();
                            }
                        }
                        if (this.f39307b == null) {
                            return "";
                        }
                        try {
                            return a(context, str);
                        } catch (RemoteException e3) {
                            e3.printStackTrace();
                            return "";
                        }
                    }
                    if (this.f39307b == null) {
                        return "";
                    }
                    return a(context, str);
                }
                try {
                    return a(context, str);
                } catch (RemoteException e4) {
                    e4.printStackTrace();
                    return "";
                }
                throw th;
            }
            throw new IllegalStateException("Cannot run on MainThread");
        }
    }
}
