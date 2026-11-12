package com.mi.health_provider;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import defpackage.bxc;
import defpackage.dxc;

/* JADX INFO: loaded from: classes5.dex */
public interface a extends IInterface {

    /* JADX INFO: renamed from: com.mi.health_provider.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0309a extends Binder implements a {
        static final int TRANSACTION_getHealthData = 1;
        static final int TRANSACTION_getMedicalCardData = 2;
        static final int TRANSACTION_getVersion = 3;

        /* JADX INFO: renamed from: com.mi.health_provider.a$a$a, reason: collision with other inner class name */
        public static class C0310a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f10074a;

            public C0310a(IBinder iBinder) {
                this.f10074a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f10074a;
            }
        }

        public AbstractBinderC0309a() {
            attachInterface(this, "com.mi.health_provider.IHealthProviderApi");
        }

        public static a asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.mi.health_provider.IHealthProviderApi");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof a)) ? new C0310a(iBinder) : (a) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.mi.health_provider.IHealthProviderApi");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.mi.health_provider.IHealthProviderApi");
                return true;
            }
            if (i == 1) {
                getHealthData(bxc.a.s2(parcel.readStrongBinder()));
                parcel2.writeNoException();
            } else if (i == 2) {
                getMedicalCardData(dxc.a.s2(parcel.readStrongBinder()));
                parcel2.writeNoException();
            } else {
                if (i != 3) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                int version = getVersion();
                parcel2.writeNoException();
                parcel2.writeInt(version);
            }
            return true;
        }
    }

    void getHealthData(bxc bxcVar) throws RemoteException;

    void getMedicalCardData(dxc dxcVar) throws RemoteException;

    int getVersion() throws RemoteException;
}
