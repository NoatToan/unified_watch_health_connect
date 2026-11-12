package com.autonavi.minimap.wearable.contract;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes4.dex */
public interface IConnectContract extends IInterface {

    public static class Default implements IConnectContract {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.autonavi.minimap.wearable.contract.IConnectContract
        public void connect(String str, IConnectCallback iConnectCallback) {
        }

        @Override // com.autonavi.minimap.wearable.contract.IConnectContract
        public String getVersion() {
            return null;
        }

        @Override // com.autonavi.minimap.wearable.contract.IConnectContract
        public void send(String str, String str2, ISendCallback iSendCallback) {
        }

        @Override // com.autonavi.minimap.wearable.contract.IConnectContract
        public void sendNotify(String str, String str2) {
        }
    }

    public static abstract class Stub extends Binder implements IConnectContract {
        private static final String DESCRIPTOR = "com.autonavi.minimap.wearable.contract.IConnectContract";
        public static final int TRANSACTION_connect = 2;
        public static final int TRANSACTION_getVersion = 4;
        public static final int TRANSACTION_send = 1;
        public static final int TRANSACTION_sendNotify = 3;

        public static class Proxy implements IConnectContract {
            public static IConnectContract sDefaultImpl;
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.autonavi.minimap.wearable.contract.IConnectContract
            public void connect(String str, IConnectCallback iConnectCallback) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongBinder(iConnectCallback != null ? iConnectCallback.asBinder() : null);
                    if (this.mRemote.transact(2, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().connect(str, iConnectCallback);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            @Override // com.autonavi.minimap.wearable.contract.IConnectContract
            public String getVersion() {
                String string;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (this.mRemote.transact(4, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                        string = parcelObtain2.readString();
                    } else {
                        string = Stub.getDefaultImpl().getVersion();
                    }
                    return string;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.autonavi.minimap.wearable.contract.IConnectContract
            public void send(String str, String str2, ISendCallback iSendCallback) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeStrongBinder(iSendCallback != null ? iSendCallback.asBinder() : null);
                    if (this.mRemote.transact(1, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().send(str, str2, iSendCallback);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.autonavi.minimap.wearable.contract.IConnectContract
            public void sendNotify(String str, String str2) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    if (this.mRemote.transact(3, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().sendNotify(str, str2);
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

        public static IConnectContract asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IConnectContract)) ? new Proxy(iBinder) : (IConnectContract) iInterfaceQueryLocalInterface;
        }

        public static IConnectContract getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IConnectContract iConnectContract) {
            if (Proxy.sDefaultImpl != null || iConnectContract == null) {
                return false;
            }
            Proxy.sDefaultImpl = iConnectContract;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1598968902) {
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                send(parcel.readString(), parcel.readString(), ISendCallback.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            }
            if (i == 2) {
                parcel.enforceInterface(DESCRIPTOR);
                connect(parcel.readString(), IConnectCallback.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            }
            if (i == 3) {
                parcel.enforceInterface(DESCRIPTOR);
                sendNotify(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            }
            if (i != 4) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel.enforceInterface(DESCRIPTOR);
            String version = getVersion();
            parcel2.writeNoException();
            parcel2.writeString(version);
            return true;
        }
    }

    void connect(String str, IConnectCallback iConnectCallback);

    String getVersion();

    void send(String str, String str2, ISendCallback iSendCallback);

    void sendNotify(String str, String str2);
}
