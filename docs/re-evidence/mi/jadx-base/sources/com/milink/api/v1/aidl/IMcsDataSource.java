package com.milink.api.v1.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes5.dex */
public interface IMcsDataSource extends IInterface {

    public static class Default implements IMcsDataSource {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.milink.api.v1.aidl.IMcsDataSource
        public String getNextPhoto(String str, boolean z) throws RemoteException {
            return null;
        }

        @Override // com.milink.api.v1.aidl.IMcsDataSource
        public String getPrevPhoto(String str, boolean z) throws RemoteException {
            return null;
        }
    }

    public static abstract class Stub extends Binder implements IMcsDataSource {
        private static final String DESCRIPTOR = "com.milink.api.v1.aidl.IMcsDataSource";
        static final int TRANSACTION_getNextPhoto = 2;
        static final int TRANSACTION_getPrevPhoto = 1;

        public static class Proxy implements IMcsDataSource {
            public static IMcsDataSource sDefaultImpl;
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

            @Override // com.milink.api.v1.aidl.IMcsDataSource
            public String getNextPhoto(String str, boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(z ? 1 : 0);
                    if (!this.mRemote.transact(2, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getNextPhoto(str, z);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.milink.api.v1.aidl.IMcsDataSource
            public String getPrevPhoto(String str, boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(z ? 1 : 0);
                    if (!this.mRemote.transact(1, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getPrevPhoto(str, z);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IMcsDataSource asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IMcsDataSource)) ? new Proxy(iBinder) : (IMcsDataSource) iInterfaceQueryLocalInterface;
        }

        public static IMcsDataSource getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IMcsDataSource iMcsDataSource) {
            if (Proxy.sDefaultImpl != null || iMcsDataSource == null) {
                return false;
            }
            Proxy.sDefaultImpl = iMcsDataSource;
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
                String prevPhoto = getPrevPhoto(parcel.readString(), parcel.readInt() != 0);
                parcel2.writeNoException();
                parcel2.writeString(prevPhoto);
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
            String nextPhoto = getNextPhoto(parcel.readString(), parcel.readInt() != 0);
            parcel2.writeNoException();
            parcel2.writeString(nextPhoto);
            return true;
        }
    }

    String getNextPhoto(String str, boolean z) throws RemoteException;

    String getPrevPhoto(String str, boolean z) throws RemoteException;
}
