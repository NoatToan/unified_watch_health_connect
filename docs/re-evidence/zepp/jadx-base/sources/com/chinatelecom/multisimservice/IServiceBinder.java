package com.chinatelecom.multisimservice;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.chinatelecom.multisimservice.model.ISmartWearServiceInfoCallback;

/* JADX INFO: loaded from: classes2.dex */
public interface IServiceBinder extends IInterface {

    public static class Default implements IServiceBinder {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.chinatelecom.multisimservice.IServiceBinder
        public IBinder getServiceBinder(String str, String str2) throws RemoteException {
            return null;
        }

        @Override // com.chinatelecom.multisimservice.IServiceBinder
        public void getSmartWearServiceInfo() throws RemoteException {
        }

        @Override // com.chinatelecom.multisimservice.IServiceBinder
        public void registCallback(ISmartWearServiceInfoCallback iSmartWearServiceInfoCallback) throws RemoteException {
        }

        @Override // com.chinatelecom.multisimservice.IServiceBinder
        public void unRegistCallback(ISmartWearServiceInfoCallback iSmartWearServiceInfoCallback) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IServiceBinder {
        private static final String a = "com.chinatelecom.multisimservice.IServiceBinder";
        public static final int b = 1;
        public static final int c = 2;
        public static final int d = 3;
        public static final int e = 4;

        public static class a implements IServiceBinder {
            public static IServiceBinder b;
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

            @Override // com.chinatelecom.multisimservice.IServiceBinder
            public IBinder getServiceBinder(String str, String str2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.a);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    if (!this.a.transact(1, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getServiceBinder(str, str2);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readStrongBinder();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.chinatelecom.multisimservice.IServiceBinder
            public void getSmartWearServiceInfo() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.a);
                    if (this.a.transact(4, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().getSmartWearServiceInfo();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.chinatelecom.multisimservice.IServiceBinder
            public void registCallback(ISmartWearServiceInfoCallback iSmartWearServiceInfoCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.a);
                    parcelObtain.writeStrongBinder(iSmartWearServiceInfoCallback != null ? iSmartWearServiceInfoCallback.asBinder() : null);
                    if (this.a.transact(2, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().registCallback(iSmartWearServiceInfoCallback);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.chinatelecom.multisimservice.IServiceBinder
            public void unRegistCallback(ISmartWearServiceInfoCallback iSmartWearServiceInfoCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.a);
                    parcelObtain.writeStrongBinder(iSmartWearServiceInfoCallback != null ? iSmartWearServiceInfoCallback.asBinder() : null);
                    if (this.a.transact(3, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().unRegistCallback(iSmartWearServiceInfoCallback);
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

        public static IServiceBinder asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(a);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IServiceBinder)) ? new a(iBinder) : (IServiceBinder) iInterfaceQueryLocalInterface;
        }

        public static IServiceBinder getDefaultImpl() {
            return a.b;
        }

        public static boolean setDefaultImpl(IServiceBinder iServiceBinder) {
            if (a.b != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iServiceBinder == null) {
                return false;
            }
            a.b = iServiceBinder;
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
                IBinder serviceBinder = getServiceBinder(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeStrongBinder(serviceBinder);
                return true;
            }
            if (i == 2) {
                parcel.enforceInterface(a);
                registCallback(ISmartWearServiceInfoCallback.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            }
            if (i == 3) {
                parcel.enforceInterface(a);
                unRegistCallback(ISmartWearServiceInfoCallback.Stub.asInterface(parcel.readStrongBinder()));
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
            getSmartWearServiceInfo();
            parcel2.writeNoException();
            return true;
        }
    }

    IBinder getServiceBinder(String str, String str2) throws RemoteException;

    void getSmartWearServiceInfo() throws RemoteException;

    void registCallback(ISmartWearServiceInfoCallback iSmartWearServiceInfoCallback) throws RemoteException;

    void unRegistCallback(ISmartWearServiceInfoCallback iSmartWearServiceInfoCallback) throws RemoteException;
}
