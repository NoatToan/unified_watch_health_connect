package com.autonavi.minimap.wearable.contract;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes4.dex */
public interface IConnectCallback extends IInterface {

    public static class Default implements IConnectCallback {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.autonavi.minimap.wearable.contract.IConnectCallback
        public void onConnect(int i, String str) {
        }

        @Override // com.autonavi.minimap.wearable.contract.IConnectCallback
        public void onDisconnect(int i, String str) {
        }

        @Override // com.autonavi.minimap.wearable.contract.IConnectCallback
        public void onReceive(String str) {
        }
    }

    public static abstract class Stub extends Binder implements IConnectCallback {
        private static final String DESCRIPTOR = "com.autonavi.minimap.wearable.contract.IConnectCallback";
        public static final int TRANSACTION_onConnect = 1;
        public static final int TRANSACTION_onDisconnect = 3;
        public static final int TRANSACTION_onReceive = 2;

        public static class Proxy implements IConnectCallback {
            public static IConnectCallback sDefaultImpl;
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

            @Override // com.autonavi.minimap.wearable.contract.IConnectCallback
            public void onConnect(int i, String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str);
                    if (this.mRemote.transact(1, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onConnect(i, str);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.autonavi.minimap.wearable.contract.IConnectCallback
            public void onDisconnect(int i, String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str);
                    if (this.mRemote.transact(3, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onDisconnect(i, str);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.autonavi.minimap.wearable.contract.IConnectCallback
            public void onReceive(String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    if (this.mRemote.transact(2, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onReceive(str);
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

        public static IConnectCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IConnectCallback)) ? new Proxy(iBinder) : (IConnectCallback) iInterfaceQueryLocalInterface;
        }

        public static IConnectCallback getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IConnectCallback iConnectCallback) {
            if (Proxy.sDefaultImpl != null || iConnectCallback == null) {
                return false;
            }
            Proxy.sDefaultImpl = iConnectCallback;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                onConnect(parcel.readInt(), parcel.readString());
            } else if (i == 2) {
                parcel.enforceInterface(DESCRIPTOR);
                onReceive(parcel.readString());
            } else {
                if (i != 3) {
                    if (i != 1598968902) {
                        return super.onTransact(i, parcel, parcel2, i2);
                    }
                    parcel2.writeString(DESCRIPTOR);
                    return true;
                }
                parcel.enforceInterface(DESCRIPTOR);
                onDisconnect(parcel.readInt(), parcel.readString());
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void onConnect(int i, String str);

    void onDisconnect(int i, String str);

    void onReceive(String str);
}
