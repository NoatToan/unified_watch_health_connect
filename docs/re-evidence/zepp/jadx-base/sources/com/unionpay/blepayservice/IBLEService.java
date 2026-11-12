package com.unionpay.blepayservice;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes18.dex */
public interface IBLEService extends IInterface {

    public static class Default implements IBLEService {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.unionpay.blepayservice.IBLEService
        public String bleSEStatus() throws RemoteException {
            return null;
        }

        @Override // com.unionpay.blepayservice.IBLEService
        public int closeLogicChannel(int i) throws RemoteException {
            return 0;
        }

        @Override // com.unionpay.blepayservice.IBLEService
        public String getBTCInfo() throws RemoteException {
            return null;
        }

        @Override // com.unionpay.blepayservice.IBLEService
        public String getCPLCInfo() throws RemoteException {
            return null;
        }

        @Override // com.unionpay.blepayservice.IBLEService
        public int init() throws RemoteException {
            return 0;
        }

        @Override // com.unionpay.blepayservice.IBLEService
        public Channel openLogicChannel(byte[] bArr) throws RemoteException {
            return null;
        }
    }

    public static abstract class Stub extends Binder implements IBLEService {
        private static final String a = "com.unionpay.blepayservice.IBLEService";
        public static final int b = 1;
        public static final int c = 2;
        public static final int d = 3;
        public static final int e = 4;
        public static final int f = 5;
        public static final int g = 6;

        public static class a implements IBLEService {
            public static IBLEService b;
            private IBinder a;

            public a(IBinder iBinder) {
                this.a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.a;
            }

            @Override // com.unionpay.blepayservice.IBLEService
            public String bleSEStatus() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.a);
                    if (!this.a.transact(4, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().bleSEStatus();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.unionpay.blepayservice.IBLEService
            public int closeLogicChannel(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.a);
                    parcelObtain.writeInt(i);
                    if (!this.a.transact(3, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().closeLogicChannel(i);
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

            @Override // com.unionpay.blepayservice.IBLEService
            public String getBTCInfo() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.a);
                    if (!this.a.transact(5, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getBTCInfo();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.unionpay.blepayservice.IBLEService
            public String getCPLCInfo() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.a);
                    if (!this.a.transact(6, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getCPLCInfo();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.unionpay.blepayservice.IBLEService
            public int init() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.a);
                    if (!this.a.transact(1, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().init();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.unionpay.blepayservice.IBLEService
            public Channel openLogicChannel(byte[] bArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.a);
                    parcelObtain.writeByteArray(bArr);
                    if (!this.a.transact(2, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().openLogicChannel(bArr);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0 ? Channel.CREATOR.createFromParcel(parcelObtain2) : null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, a);
        }

        public static IBLEService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(a);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IBLEService)) ? new a(iBinder) : (IBLEService) iInterfaceQueryLocalInterface;
        }

        public static IBLEService getDefaultImpl() {
            return a.b;
        }

        public static boolean setDefaultImpl(IBLEService iBLEService) {
            if (a.b != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iBLEService == null) {
                return false;
            }
            a.b = iBLEService;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1598968902) {
                parcel2.writeString(a);
                return true;
            }
            switch (i) {
                case 1:
                    parcel.enforceInterface(a);
                    int iInit = init();
                    parcel2.writeNoException();
                    parcel2.writeInt(iInit);
                    return true;
                case 2:
                    parcel.enforceInterface(a);
                    Channel channelOpenLogicChannel = openLogicChannel(parcel.createByteArray());
                    parcel2.writeNoException();
                    if (channelOpenLogicChannel != null) {
                        parcel2.writeInt(1);
                        channelOpenLogicChannel.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 3:
                    parcel.enforceInterface(a);
                    int iCloseLogicChannel = closeLogicChannel(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(iCloseLogicChannel);
                    return true;
                case 4:
                    parcel.enforceInterface(a);
                    String strBleSEStatus = bleSEStatus();
                    parcel2.writeNoException();
                    parcel2.writeString(strBleSEStatus);
                    return true;
                case 5:
                    parcel.enforceInterface(a);
                    String bTCInfo = getBTCInfo();
                    parcel2.writeNoException();
                    parcel2.writeString(bTCInfo);
                    return true;
                case 6:
                    parcel.enforceInterface(a);
                    String cPLCInfo = getCPLCInfo();
                    parcel2.writeNoException();
                    parcel2.writeString(cPLCInfo);
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    String bleSEStatus() throws RemoteException;

    int closeLogicChannel(int i) throws RemoteException;

    String getBTCInfo() throws RemoteException;

    String getCPLCInfo() throws RemoteException;

    int init() throws RemoteException;

    Channel openLogicChannel(byte[] bArr) throws RemoteException;
}
