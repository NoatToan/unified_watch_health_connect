package com.euicc.server;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.euicc.server.model.IOpenEUICCCalbcak;

/* JADX INFO: loaded from: classes2.dex */
public interface IOpenEUICC extends IInterface {

    public static class Default implements IOpenEUICC {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.euicc.server.IOpenEUICC
        public void downloadEUICCProfile(String str) throws RemoteException {
        }

        @Override // com.euicc.server.IOpenEUICC
        public void getAttachedDeviceEUICCInfo() throws RemoteException {
        }

        @Override // com.euicc.server.IOpenEUICC
        public void registerCallback(IOpenEUICCCalbcak iOpenEUICCCalbcak) throws RemoteException {
        }

        @Override // com.euicc.server.IOpenEUICC
        public void unRegisterCallback(IOpenEUICCCalbcak iOpenEUICCCalbcak) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IOpenEUICC {
        private static final String a = "com.euicc.server.IOpenEUICC";
        public static final int b = 1;
        public static final int c = 2;
        public static final int d = 3;
        public static final int e = 4;

        public static class a implements IOpenEUICC {
            public static IOpenEUICC b;
            private IBinder a;

            public a(IBinder iBinder) {
                this.a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.a;
            }

            public String d() {
                return Stub.a;
            }

            @Override // com.euicc.server.IOpenEUICC
            public void downloadEUICCProfile(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.a);
                    parcelObtain.writeString(str);
                    if (this.a.transact(4, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().downloadEUICCProfile(str);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.euicc.server.IOpenEUICC
            public void getAttachedDeviceEUICCInfo() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.a);
                    if (this.a.transact(3, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().getAttachedDeviceEUICCInfo();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.euicc.server.IOpenEUICC
            public void registerCallback(IOpenEUICCCalbcak iOpenEUICCCalbcak) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.a);
                    parcelObtain.writeStrongBinder(iOpenEUICCCalbcak != null ? iOpenEUICCCalbcak.asBinder() : null);
                    if (this.a.transact(1, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().registerCallback(iOpenEUICCCalbcak);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.euicc.server.IOpenEUICC
            public void unRegisterCallback(IOpenEUICCCalbcak iOpenEUICCCalbcak) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.a);
                    parcelObtain.writeStrongBinder(iOpenEUICCCalbcak != null ? iOpenEUICCCalbcak.asBinder() : null);
                    if (this.a.transact(2, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().unRegisterCallback(iOpenEUICCCalbcak);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, a);
        }

        public static IOpenEUICC asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(a);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IOpenEUICC)) ? new a(iBinder) : (IOpenEUICC) iInterfaceQueryLocalInterface;
        }

        public static IOpenEUICC getDefaultImpl() {
            return a.b;
        }

        public static boolean setDefaultImpl(IOpenEUICC iOpenEUICC) {
            if (a.b != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iOpenEUICC == null) {
                return false;
            }
            a.b = iOpenEUICC;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface(a);
                registerCallback(IOpenEUICCCalbcak.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            }
            if (i == 2) {
                parcel.enforceInterface(a);
                unRegisterCallback(IOpenEUICCCalbcak.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            }
            if (i == 3) {
                parcel.enforceInterface(a);
                getAttachedDeviceEUICCInfo();
                parcel2.writeNoException();
                return true;
            }
            if (i != 4) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString(a);
                return true;
            }
            parcel.enforceInterface(a);
            downloadEUICCProfile(parcel.readString());
            parcel2.writeNoException();
            return true;
        }
    }

    void downloadEUICCProfile(String str) throws RemoteException;

    void getAttachedDeviceEUICCInfo() throws RemoteException;

    void registerCallback(IOpenEUICCCalbcak iOpenEUICCCalbcak) throws RemoteException;

    void unRegisterCallback(IOpenEUICCCalbcak iOpenEUICCCalbcak) throws RemoteException;
}
