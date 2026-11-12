package com.euicc.server;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import defpackage.gvc;

/* JADX INFO: loaded from: classes4.dex */
public interface a extends IInterface {

    /* JADX INFO: renamed from: com.euicc.server.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0147a extends Binder implements a {
        static final int TRANSACTION_downloadEUICCProfile = 4;
        static final int TRANSACTION_getAttachedDeviceEUICCInfo = 3;
        static final int TRANSACTION_registerCallback = 1;
        static final int TRANSACTION_unRegisterCallback = 2;

        /* JADX INFO: renamed from: com.euicc.server.a$a$a, reason: collision with other inner class name */
        public static class C0148a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f7068a;

            public C0148a(IBinder iBinder) {
                this.f7068a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f7068a;
            }
        }

        public AbstractBinderC0147a() {
            attachInterface(this, "com.euicc.server.IOpenEUICC");
        }

        public static a asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.euicc.server.IOpenEUICC");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof a)) ? new C0148a(iBinder) : (a) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.euicc.server.IOpenEUICC");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.euicc.server.IOpenEUICC");
                return true;
            }
            if (i == 1) {
                registerCallback(gvc.a.s2(parcel.readStrongBinder()));
                parcel2.writeNoException();
            } else if (i == 2) {
                unRegisterCallback(gvc.a.s2(parcel.readStrongBinder()));
                parcel2.writeNoException();
            } else if (i == 3) {
                getAttachedDeviceEUICCInfo();
                parcel2.writeNoException();
            } else {
                if (i != 4) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                downloadEUICCProfile(parcel.readString());
                parcel2.writeNoException();
            }
            return true;
        }
    }

    void downloadEUICCProfile(String str) throws RemoteException;

    void getAttachedDeviceEUICCInfo() throws RemoteException;

    void registerCallback(gvc gvcVar) throws RemoteException;

    void unRegisterCallback(gvc gvcVar) throws RemoteException;
}
