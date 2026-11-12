package com.unionpay.blepayservice;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes18.dex */
public interface IBLETransCMDService extends IInterface {

    public static class Default implements IBLETransCMDService {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.unionpay.blepayservice.IBLETransCMDService
        public int close() throws RemoteException {
            return 0;
        }

        @Override // com.unionpay.blepayservice.IBLETransCMDService
        public boolean isClosed() throws RemoteException {
            return false;
        }

        @Override // com.unionpay.blepayservice.IBLETransCMDService
        public byte[] transmit(byte[] bArr) throws RemoteException {
            return null;
        }
    }

    public static abstract class Stub extends Binder implements IBLETransCMDService {
        private static final String a = "com.unionpay.blepayservice.IBLETransCMDService";
        public static final int b = 1;
        public static final int c = 2;
        public static final int d = 3;

        public static class a implements IBLETransCMDService {
            public static IBLETransCMDService b;
            private IBinder a;

            public a(IBinder iBinder) {
                this.a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.a;
            }

            @Override // com.unionpay.blepayservice.IBLETransCMDService
            public int close() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.a);
                    if (!this.a.transact(1, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().close();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String d() {
                return Stub.a;
            }

            @Override // com.unionpay.blepayservice.IBLETransCMDService
            public boolean isClosed() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.a);
                    if (!this.a.transact(2, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().isClosed();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.unionpay.blepayservice.IBLETransCMDService
            public byte[] transmit(byte[] bArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.a);
                    parcelObtain.writeByteArray(bArr);
                    if (!this.a.transact(3, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().transmit(bArr);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.createByteArray();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, a);
        }

        public static IBLETransCMDService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(a);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IBLETransCMDService)) ? new a(iBinder) : (IBLETransCMDService) iInterfaceQueryLocalInterface;
        }

        public static IBLETransCMDService getDefaultImpl() {
            return a.b;
        }

        public static boolean setDefaultImpl(IBLETransCMDService iBLETransCMDService) {
            if (a.b != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iBLETransCMDService == null) {
                return false;
            }
            a.b = iBLETransCMDService;
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
                int iClose = close();
                parcel2.writeNoException();
                parcel2.writeInt(iClose);
                return true;
            }
            if (i == 2) {
                parcel.enforceInterface(a);
                boolean zIsClosed = isClosed();
                parcel2.writeNoException();
                parcel2.writeInt(zIsClosed ? 1 : 0);
                return true;
            }
            if (i != 3) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString(a);
                return true;
            }
            parcel.enforceInterface(a);
            byte[] bArrTransmit = transmit(parcel.createByteArray());
            parcel2.writeNoException();
            parcel2.writeByteArray(bArrTransmit);
            return true;
        }
    }

    int close() throws RemoteException;

    boolean isClosed() throws RemoteException;

    byte[] transmit(byte[] bArr) throws RemoteException;
}
