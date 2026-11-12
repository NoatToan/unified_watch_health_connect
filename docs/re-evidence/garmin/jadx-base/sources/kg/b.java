package kg;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import j20.x;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public class b implements ig.a {

    /* JADX INFO: renamed from: kg.b$b, reason: collision with other inner class name */
    public static final class ServiceConnectionC2002b implements ServiceConnection {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f104672a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LinkedBlockingQueue<IBinder> f104673b;

        public ServiceConnectionC2002b() {
            this.f104672a = false;
            this.f104673b = new LinkedBlockingQueue<>();
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.f104673b.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
        }
    }

    public static final class c implements IInterface {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final IBinder f104674a;

        public c(IBinder iBinder) {
            this.f104674a = iBinder;
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this.f104674a;
        }

        public final String k0() {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
                this.f104674a.transact(1, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readString();
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }
    }

    @Override // ig.a
    public final String a(Context context) {
        IBinder iBinderPoll;
        ServiceConnectionC2002b serviceConnectionC2002b = new ServiceConnectionC2002b();
        Intent intent = new Intent("com.uodis.opendevice.OPENIDS_SERVICE");
        intent.setPackage("com.huawei.hwid");
        if (context.bindService(intent, serviceConnectionC2002b, 1)) {
            try {
                if (serviceConnectionC2002b.f104672a) {
                    x.h();
                    iBinderPoll = null;
                } else {
                    serviceConnectionC2002b.f104672a = true;
                    iBinderPoll = serviceConnectionC2002b.f104673b.poll(5L, TimeUnit.SECONDS);
                }
                return new c(iBinderPoll).k0();
            } catch (Exception unused) {
            } finally {
                context.unbindService(serviceConnectionC2002b);
            }
        }
        return null;
    }
}
