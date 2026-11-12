package com.cmcc.server;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import defpackage.kvc;

/* JADX INFO: loaded from: classes4.dex */
public interface c extends IInterface {

    public static abstract class a extends Binder implements c {
        static final int TRANSACTION_downloadEsimProfile = 4;
        static final int TRANSACTION_getAttachedDeviceMultiSimInfo = 3;
        static final int TRANSACTION_registerCallback = 1;
        static final int TRANSACTION_unRegisterCallback = 2;

        /* JADX INFO: renamed from: com.cmcc.server.c$a$a, reason: collision with other inner class name */
        public static class C0143a implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f7017a;

            public C0143a(IBinder iBinder) {
                this.f7017a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f7017a;
            }
        }

        public a() {
            attachInterface(this, "com.cmcc.server.IOpenMultiSim");
        }

        public static c asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.cmcc.server.IOpenMultiSim");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof c)) ? new C0143a(iBinder) : (c) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.cmcc.server.IOpenMultiSim");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.cmcc.server.IOpenMultiSim");
                return true;
            }
            if (i == 1) {
                registerCallback(kvc.a.s2(parcel.readStrongBinder()));
                parcel2.writeNoException();
            } else if (i == 2) {
                unRegisterCallback(kvc.a.s2(parcel.readStrongBinder()));
                parcel2.writeNoException();
            } else if (i == 3) {
                getAttachedDeviceMultiSimInfo();
                parcel2.writeNoException();
            } else {
                if (i != 4) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                downloadEsimProfile(parcel.readString(), parcel.readLong(), parcel.readString());
                parcel2.writeNoException();
            }
            return true;
        }
    }

    void downloadEsimProfile(String str, long j, String str2) throws RemoteException;

    void getAttachedDeviceMultiSimInfo() throws RemoteException;

    void registerCallback(kvc kvcVar) throws RemoteException;

    void unRegisterCallback(kvc kvcVar) throws RemoteException;
}
