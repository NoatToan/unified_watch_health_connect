package com.cmcc.server;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
public interface d extends IInterface {

    public static abstract class a extends Binder implements d {
        static final int TRANSACTION_getServiceBinder = 1;

        /* JADX INFO: renamed from: com.cmcc.server.d$a$a, reason: collision with other inner class name */
        public static class C0144a implements d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f7018a;

            public C0144a(IBinder iBinder) {
                this.f7018a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f7018a;
            }
        }

        public a() {
            attachInterface(this, "com.cmcc.server.IServiceBinder");
        }

        public static d asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.cmcc.server.IServiceBinder");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof d)) ? new C0144a(iBinder) : (d) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.cmcc.server.IServiceBinder");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.cmcc.server.IServiceBinder");
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            IBinder serviceBinder = getServiceBinder(parcel.readString());
            parcel2.writeNoException();
            parcel2.writeStrongBinder(serviceBinder);
            return true;
        }
    }

    IBinder getServiceBinder(String str) throws RemoteException;
}
