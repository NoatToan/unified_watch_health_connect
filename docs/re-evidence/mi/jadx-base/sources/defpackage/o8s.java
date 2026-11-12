package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes11.dex */
public class o8s implements j7s {
    public static boolean f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f28866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ServiceConnection f28867b;
    public volatile int c = 0;
    public volatile a d = null;
    public final Object e = new Object();

    public class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f28868a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f28869b;
        public String c;
        public String d;

        public a() {
            this.f28868a = null;
            this.f28869b = null;
            this.c = null;
            this.d = null;
        }
    }

    public class b implements ServiceConnection {
        public b() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (o8s.this.d != null) {
                return;
            }
            new Thread(new w8s(this, iBinder)).start();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    public static class c {
        public static String a(IBinder iBinder, String str, String str2, String str3) {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("com.heytap.openid.IOpenID");
                parcelObtain.writeString(str);
                parcelObtain.writeString(str2);
                parcelObtain.writeString(str3);
                iBinder.transact(1, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readString();
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }
    }

    public o8s(Context context) {
        this.f28866a = context;
        g();
    }

    private void g() {
        int i;
        this.f28867b = new b();
        Intent intent = new Intent();
        intent.setClassName("com.heytap.openid", "com.heytap.openid.IdentifyService");
        intent.setAction("action.com.heytap.openid.OPEN_ID_SERVICE");
        try {
            i = this.f28866a.bindService(intent, this.f28867b, 1) ? 1 : 2;
        } catch (Exception unused) {
        }
        this.c = i;
    }

    private void i(String str) {
        if (this.c != 1 || Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        synchronized (this.e) {
            try {
                x9s.o("oppo's " + str + " wait...");
                this.e.wait(3000L);
            } catch (Exception unused) {
            }
        }
    }

    public static boolean j(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.heytap.openid", 128);
            if (packageInfo != null) {
                long longVersionCode = Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode;
                boolean z = (packageInfo.applicationInfo.flags & 1) != 0;
                f = longVersionCode >= 1;
                if (z) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String k() {
        try {
            Signature[] signatureArr = this.f28866a.getPackageManager().getPackageInfo(this.f28866a.getPackageName(), 64).signatures;
            MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
            StringBuilder sb = new StringBuilder();
            for (byte b2 : messageDigest.digest(signatureArr[0].toByteArray())) {
                sb.append(Integer.toHexString((b2 & 255) | 256).substring(1, 3));
            }
            return sb.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        ServiceConnection serviceConnection = this.f28867b;
        if (serviceConnection != null) {
            try {
                this.f28866a.unbindService(serviceConnection);
            } catch (Exception unused) {
            }
        }
    }

    @Override // defpackage.j7s
    /* JADX INFO: renamed from: a */
    public boolean mo66a() {
        return f;
    }

    @Override // defpackage.j7s
    public String a() {
        i("getOAID");
        if (this.d == null) {
            return null;
        }
        return this.d.f28869b;
    }
}
