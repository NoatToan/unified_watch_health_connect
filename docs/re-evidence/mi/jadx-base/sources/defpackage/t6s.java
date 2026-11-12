package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;

/* JADX INFO: loaded from: classes11.dex */
public class t6s implements j7s {
    public static boolean h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f34395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ServiceConnection f34396b;
    public volatile int c = 0;
    public volatile String d = null;
    public volatile boolean e = false;
    public volatile String f = null;
    public final Object g = new Object();

    public class a implements ServiceConnection {
        public a() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            new Thread(new e7s(this, iBinder)).start();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    public static class b {
        public static String a(IBinder iBinder) {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
                iBinder.transact(1, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readString();
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }

        public static boolean b(IBinder iBinder) {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
                iBinder.transact(2, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readInt() != 0;
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }
    }

    public t6s(Context context) {
        this.f34395a = context;
        d();
    }

    private void d() {
        int i;
        this.f34396b = new a();
        Intent intent = new Intent("com.uodis.opendevice.OPENIDS_SERVICE");
        intent.setPackage("com.huawei.hwid");
        try {
            i = this.f34395a.bindService(intent, this.f34396b, 1) ? 1 : 2;
        } catch (Exception unused) {
        }
        this.c = i;
    }

    public static boolean h(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.huawei.hwid", 128);
            boolean z = (packageInfo.applicationInfo.flags & 1) != 0;
            h = packageInfo.versionCode >= 20602000;
            return z;
        } catch (Exception unused) {
        }
    }

    public final void f(String str) {
        if (this.c != 1 || Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        synchronized (this.g) {
            try {
                x9s.o("huawei's " + str + " wait...");
                this.g.wait(3000L);
            } catch (Exception unused) {
            }
        }
    }

    public final void i() {
        ServiceConnection serviceConnection = this.f34396b;
        if (serviceConnection != null) {
            try {
                this.f34395a.unbindService(serviceConnection);
            } catch (Exception unused) {
            }
        }
    }

    @Override // defpackage.j7s
    /* JADX INFO: renamed from: a */
    public boolean mo66a() {
        return h;
    }

    @Override // defpackage.j7s
    public String a() {
        f("getOAID");
        return this.d;
    }
}
