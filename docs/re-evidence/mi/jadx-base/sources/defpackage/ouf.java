package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.IBinder;
import android.os.ParcelUuid;
import android.os.RemoteException;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public class ouf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f29694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public auc f29695b;
    public b c;
    public ParcelUuid d;
    public IBinder e;
    public ServiceConnection f = new a();

    public class a implements ServiceConnection {
        public a() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            ouf.this.k(auc.a.s2(iBinder));
            if (ouf.this.c != null) {
                ouf.this.c.onInit(ouf.this);
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            ouf.this.k(null);
            if (ouf.this.c != null) {
                ouf.this.c.onDestroy();
            }
        }
    }

    public interface b {
        void onDestroy();

        void onInit(ouf oufVar);
    }

    public ouf(Context context, b bVar) {
        if (context == null || context.getApplicationContext() == null) {
            throw new IllegalArgumentException("context not valid");
        }
        this.d = new ParcelUuid(UUID.randomUUID());
        this.e = new Binder();
        this.f29694a = context.getApplicationContext();
        this.c = bVar;
    }

    public static ouf f(Context context, b bVar) {
        ouf oufVar = new ouf(context, bVar);
        oufVar.j();
        return oufVar;
    }

    public boolean c(String str, byte[] bArr) {
        if (!d()) {
            return false;
        }
        try {
            return this.f29695b.R2(str, bArr);
        } catch (RemoteException e) {
            e.printStackTrace();
            return false;
        }
    }

    public final boolean d() {
        return this.f29695b != null;
    }

    public void e() {
        try {
            this.f29694a.unbindService(this.f);
        } catch (Exception unused) {
        }
    }

    public int g(String str) {
        if (!d()) {
            return 0;
        }
        try {
            return this.f29695b.F(str);
        } catch (RemoteException e) {
            e.printStackTrace();
            return 0;
        }
    }

    public int h() {
        if (!d()) {
            return -1;
        }
        try {
            return this.f29695b.i2();
        } catch (RemoteException e) {
            e.printStackTrace();
            return -1;
        }
    }

    public boolean i(String str, String str2) {
        if (d()) {
            try {
                return this.f29695b.k1(str, str2) != 0;
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    public final void j() {
        Intent intent = new Intent("miui.bluetooth.mible.DeviceManagerService");
        intent.setComponent(new ComponentName("com.xiaomi.bluetooth", "com.android.bluetooth.ble.app.MiBleDeviceManagerService"));
        boolean zBindService = this.f29694a.bindService(intent, this.f, 1);
        if (!zBindService) {
            intent.setComponent(new ComponentName("com.android.bluetooth", "com.android.bluetooth.ble.app.MiBleDeviceManagerService"));
            zBindService = this.f29694a.bindService(intent, this.f, 1);
        }
        if (zBindService) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("bind manager service error: ");
        sb.append(intent);
        b bVar = this.c;
        if (bVar != null) {
            bVar.onDestroy();
        }
    }

    public final void k(auc aucVar) {
        this.f29695b = aucVar;
    }

    public boolean l(String str, String str2, boolean z) {
        if (d()) {
            try {
                return this.f29695b.f2(str, str2, z ? 1 : 0);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    public boolean m(String str) {
        if (!d()) {
            return false;
        }
        try {
            return this.f29695b.A1(str);
        } catch (RemoteException e) {
            e.printStackTrace();
            return false;
        }
    }
}
