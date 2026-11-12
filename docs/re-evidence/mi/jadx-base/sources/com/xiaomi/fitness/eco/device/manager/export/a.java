package com.xiaomi.fitness.eco.device.manager.export;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes8.dex */
public interface a extends IInterface {

    /* JADX INFO: renamed from: com.xiaomi.fitness.eco.device.manager.export.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0556a extends Binder implements a {
        static final int TRANSACTION_onRemoteChange = 1;

        /* JADX INFO: renamed from: com.xiaomi.fitness.eco.device.manager.export.a$a$a, reason: collision with other inner class name */
        public static class C0557a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f12091a;

            public C0557a(IBinder iBinder) {
                this.f12091a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f12091a;
            }
        }

        public AbstractBinderC0556a() {
            attachInterface(this, "com.xiaomi.fitness.eco.device.manager.export.OnEcoProductChangeRemoteListener");
        }

        public static a asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.fitness.eco.device.manager.export.OnEcoProductChangeRemoteListener");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof a)) ? new C0557a(iBinder) : (a) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.xiaomi.fitness.eco.device.manager.export.OnEcoProductChangeRemoteListener");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.xiaomi.fitness.eco.device.manager.export.OnEcoProductChangeRemoteListener");
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            onRemoteChange();
            parcel2.writeNoException();
            return true;
        }
    }

    void onRemoteChange() throws RemoteException;
}
