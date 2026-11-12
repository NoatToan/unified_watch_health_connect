package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.alipay.sdk.m.c.b;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public class kq implements b {

    public static final class d implements ServiceConnection {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LinkedBlockingQueue<IBinder> f39369b;
        public boolean e;

        public d() {
            this.e = false;
            this.f39369b = new LinkedBlockingQueue<>();
        }

        public IBinder c() throws InterruptedException {
            if (this.e) {
                throw new IllegalStateException();
            }
            this.e = true;
            return this.f39369b.poll(5L, TimeUnit.SECONDS);
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.f39369b.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    public static final class e implements IInterface {
        public IBinder e;

        public e(IBinder iBinder) {
            this.e = iBinder;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.e;
        }

        public String b() throws RemoteException {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
                this.e.transact(1, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readString();
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }
    }

    @Override // com.alipay.sdk.m.c.b
    public String a(Context context) {
        d dVar = new d();
        Intent intent = new Intent("com.uodis.opendevice.OPENIDS_SERVICE");
        intent.setPackage("com.huawei.hwid");
        if (context.bindService(intent, dVar, 1)) {
            try {
                return new e(dVar.c()).b();
            } catch (Exception unused) {
            } finally {
                context.unbindService(dVar);
            }
        }
        return null;
    }
}
