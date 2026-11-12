package com.milink.api.v1.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes5.dex */
public interface IMcsOpenMiracastListener extends IInterface {

    public static class Default implements IMcsOpenMiracastListener {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.milink.api.v1.aidl.IMcsOpenMiracastListener
        public void openFailure(String str, String str2, String str3, String str4) throws RemoteException {
        }

        @Override // com.milink.api.v1.aidl.IMcsOpenMiracastListener
        public void openSuccess(String str, String str2, String str3) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IMcsOpenMiracastListener {
        private static final String DESCRIPTOR = "com.milink.api.v1.aidl.IMcsOpenMiracastListener";
        static final int TRANSACTION_openFailure = 2;
        static final int TRANSACTION_openSuccess = 1;

        public static class Proxy implements IMcsOpenMiracastListener {
            public static IMcsOpenMiracastListener sDefaultImpl;
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            @Override // com.milink.api.v1.aidl.IMcsOpenMiracastListener
            public void openFailure(String str, String str2, String str3, String str4) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeString(str3);
                    parcelObtain.writeString(str4);
                    if (this.mRemote.transact(2, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().openFailure(str, str2, str3, str4);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.milink.api.v1.aidl.IMcsOpenMiracastListener
            public void openSuccess(String str, String str2, String str3) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeString(str3);
                    if (this.mRemote.transact(1, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().openSuccess(str, str2, str3);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IMcsOpenMiracastListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IMcsOpenMiracastListener)) ? new Proxy(iBinder) : (IMcsOpenMiracastListener) iInterfaceQueryLocalInterface;
        }

        public static IMcsOpenMiracastListener getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IMcsOpenMiracastListener iMcsOpenMiracastListener) {
            if (Proxy.sDefaultImpl != null || iMcsOpenMiracastListener == null) {
                return false;
            }
            Proxy.sDefaultImpl = iMcsOpenMiracastListener;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                openSuccess(parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            }
            if (i != 2) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
            parcel.enforceInterface(DESCRIPTOR);
            openFailure(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            parcel2.writeNoException();
            return true;
        }
    }

    void openFailure(String str, String str2, String str3, String str4) throws RemoteException;

    void openSuccess(String str, String str2, String str3) throws RemoteException;
}
