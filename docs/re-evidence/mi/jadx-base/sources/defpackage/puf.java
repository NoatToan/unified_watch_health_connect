package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.ParcelUuid;
import android.os.RemoteException;
import android.util.SparseArray;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public class puf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f30791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public kpc f30792b;
    public Context c;
    public e d;
    public Handler i;
    public final ParcelUuid e = new ParcelUuid(UUID.randomUUID());
    public final IBinder f = new Binder();
    public boolean g = false;
    public SparseArray<f> h = new SparseArray<>();
    public int j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ServiceConnection f30793k = new a();
    public lpc l = new b();
    public mpc m = new c();

    public class a implements ServiceConnection {
        public a() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            puf.this.f30792b = kpc.a.s2(iBinder);
            puf.this.i.sendMessage(puf.this.i.obtainMessage(1, 2, 0));
            try {
                puf pufVar = puf.this;
                kpc kpcVar = pufVar.f30792b;
                IBinder iBinder2 = pufVar.f;
                puf pufVar2 = puf.this;
                kpcVar.Y0(iBinder2, pufVar2.f30791a, pufVar2.e, pufVar2.l);
            } catch (RemoteException unused) {
                puf.this.i.sendMessage(puf.this.i.obtainMessage(1, -1, 0));
            }
            if (puf.this.g) {
                puf.this.g = false;
                puf.this.h();
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            puf pufVar = puf.this;
            pufVar.f30792b = null;
            pufVar.j = 0;
            puf.this.i.sendMessage(puf.this.i.obtainMessage(1, 0, 0));
        }
    }

    public class b extends lpc.a {
        public b() {
        }

        @Override // defpackage.lpc
        public void C1(ParcelUuid parcelUuid, int i) throws RemoteException {
            StringBuilder sb = new StringBuilder();
            sb.append("onConnectionState() sate=");
            sb.append(i);
            if (puf.this.e.equals(parcelUuid)) {
                puf.this.j = i;
                puf.this.i.sendMessage(puf.this.i.obtainMessage(1, i, 0));
            }
        }
    }

    public class c extends mpc.a {
        public c() {
        }

        @Override // defpackage.mpc
        public void C3(ParcelUuid parcelUuid, int i, byte[] bArr) throws RemoteException {
            StringBuilder sb = new StringBuilder();
            sb.append("mPropertyCallback() property=");
            sb.append(i);
            if (puf.this.e.equals(parcelUuid)) {
                Message messageObtainMessage = puf.this.i.obtainMessage(2);
                messageObtainMessage.arg1 = i;
                messageObtainMessage.obj = bArr;
                puf.this.i.sendMessage(messageObtainMessage);
            }
        }
    }

    public class d implements Handler.Callback {
        public d() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                e eVar = puf.this.d;
                if (eVar != null) {
                    eVar.onState(message.arg1);
                }
                return true;
            }
            if (i != 2) {
                return false;
            }
            int i2 = message.arg1;
            f fVar = (f) puf.this.h.get(i2);
            if (fVar != null) {
                fVar.a(i2, (byte[]) message.obj);
            }
            return true;
        }
    }

    public interface e {
        void onState(int i);
    }

    public interface f {
        void a(int i, byte[] bArr);
    }

    public puf(Context context, String str, e eVar) {
        this.f30791a = str;
        this.c = context;
        this.d = eVar;
        try {
            if (Looper.myLooper() == null) {
                Looper.prepare();
            }
        } catch (RuntimeException unused) {
        }
        this.i = new Handler(new d());
    }

    public void h() {
        kpc kpcVar = this.f30792b;
        if (kpcVar != null) {
            try {
                kpcVar.K3(this.f30791a, this.e);
                return;
            } catch (RemoteException unused) {
                Handler handler = this.i;
                handler.sendMessage(handler.obtainMessage(1, -1, 0));
                return;
            }
        }
        this.g = true;
        Intent intent = new Intent("miui.bluetooth.mible.Service");
        intent.setClassName("com.xiaomi.bluetooth", "com.android.bluetooth.ble.BluetoothMiBleService");
        intent.setPackage("com.xiaomi.bluetooth");
        boolean zBindService = this.c.bindService(intent, this.f30793k, 1);
        if (!zBindService) {
            intent = new Intent("miui.bluetooth.mible.Service");
            intent.setClassName("com.android.bluetooth", "com.android.bluetooth.ble.BluetoothMiBleService");
            intent.setPackage("com.android.bluetooth");
            zBindService = this.c.bindService(intent, this.f30793k, 1);
        }
        if (zBindService) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("connect: bind service error");
        sb.append(intent.toString());
        Handler handler2 = this.i;
        handler2.sendMessage(handler2.obtainMessage(1, -1, 0));
    }

    public void i() {
        kpc kpcVar = this.f30792b;
        if (kpcVar == null) {
            return;
        }
        try {
            kpcVar.T1(this.f, this.f30791a, this.e);
            this.c.unbindService(this.f30793k);
        } catch (RemoteException unused) {
            Handler handler = this.i;
            handler.sendMessage(handler.obtainMessage(1, -1, 0));
        } catch (IllegalArgumentException unused2) {
            Handler handler2 = this.i;
            handler2.sendMessage(handler2.obtainMessage(1, -1, 0));
        }
    }

    public int j() {
        if (!k()) {
            return Integer.MIN_VALUE;
        }
        try {
            return this.f30792b.V0(this.f30791a, this.e);
        } catch (RemoteException unused) {
            return Integer.MIN_VALUE;
        }
    }

    public boolean k() {
        return this.j == 4;
    }

    public boolean l(int i, f fVar) {
        this.h.put(i, fVar);
        kpc kpcVar = this.f30792b;
        if (kpcVar != null) {
            try {
                if (kpcVar.n(this.f30791a, this.e, i, this.m)) {
                    return true;
                }
            } catch (RemoteException unused) {
            }
        }
        this.h.remove(i);
        return false;
    }

    public void m(e eVar) {
        this.d = eVar;
    }
}
