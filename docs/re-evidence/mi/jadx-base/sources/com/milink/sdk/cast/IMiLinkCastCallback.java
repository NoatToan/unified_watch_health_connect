package com.milink.sdk.cast;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes5.dex */
public interface IMiLinkCastCallback extends IInterface {

    public static class Default implements IMiLinkCastCallback {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.milink.sdk.cast.IMiLinkCastCallback
        public void onConnected(MiLinkDevice miLinkDevice, int i) throws RemoteException {
        }

        @Override // com.milink.sdk.cast.IMiLinkCastCallback
        public void onConnectionChange(int i, MiLinkDevice miLinkDevice, int i2) throws RemoteException {
        }

        @Override // com.milink.sdk.cast.IMiLinkCastCallback
        public void onDisconnected(MiLinkDevice miLinkDevice, int i) throws RemoteException {
        }

        @Override // com.milink.sdk.cast.IMiLinkCastCallback
        public void onFailure(int i, int i2) throws RemoteException {
        }

        @Override // com.milink.sdk.cast.IMiLinkCastCallback
        public void onInit() throws RemoteException {
        }

        @Override // com.milink.sdk.cast.IMiLinkCastCallback
        public void onPrivateProtectChange(int i, int i2) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IMiLinkCastCallback {
        private static final String DESCRIPTOR = "com.milink.sdk.cast.IMiLinkCastCallback";
        static final int TRANSACTION_onConnected = 2;
        static final int TRANSACTION_onConnectionChange = 5;
        static final int TRANSACTION_onDisconnected = 3;
        static final int TRANSACTION_onFailure = 4;
        static final int TRANSACTION_onInit = 1;
        static final int TRANSACTION_onPrivateProtectChange = 6;

        public static class Proxy implements IMiLinkCastCallback {
            public static IMiLinkCastCallback sDefaultImpl;
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

            @Override // com.milink.sdk.cast.IMiLinkCastCallback
            public void onConnected(MiLinkDevice miLinkDevice, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (miLinkDevice != null) {
                        parcelObtain.writeInt(1);
                        miLinkDevice.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    parcelObtain.writeInt(i);
                    if (this.mRemote.transact(2, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onConnected(miLinkDevice, i);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.milink.sdk.cast.IMiLinkCastCallback
            public void onConnectionChange(int i, MiLinkDevice miLinkDevice, int i2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    if (miLinkDevice != null) {
                        parcelObtain.writeInt(1);
                        miLinkDevice.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    parcelObtain.writeInt(i2);
                    if (this.mRemote.transact(5, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onConnectionChange(i, miLinkDevice, i2);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.milink.sdk.cast.IMiLinkCastCallback
            public void onDisconnected(MiLinkDevice miLinkDevice, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (miLinkDevice != null) {
                        parcelObtain.writeInt(1);
                        miLinkDevice.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    parcelObtain.writeInt(i);
                    if (this.mRemote.transact(3, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onDisconnected(miLinkDevice, i);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.milink.sdk.cast.IMiLinkCastCallback
            public void onFailure(int i, int i2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    if (this.mRemote.transact(4, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onFailure(i, i2);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.milink.sdk.cast.IMiLinkCastCallback
            public void onInit() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (this.mRemote.transact(1, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onInit();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.milink.sdk.cast.IMiLinkCastCallback
            public void onPrivateProtectChange(int i, int i2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    if (this.mRemote.transact(6, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onPrivateProtectChange(i, i2);
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

        public static IMiLinkCastCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IMiLinkCastCallback)) ? new Proxy(iBinder) : (IMiLinkCastCallback) iInterfaceQueryLocalInterface;
        }

        public static IMiLinkCastCallback getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IMiLinkCastCallback iMiLinkCastCallback) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iMiLinkCastCallback == null) {
                return false;
            }
            Proxy.sDefaultImpl = iMiLinkCastCallback;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1598968902) {
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
            switch (i) {
                case 1:
                    parcel.enforceInterface(DESCRIPTOR);
                    onInit();
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface(DESCRIPTOR);
                    onConnected(parcel.readInt() != 0 ? MiLinkDevice.CREATOR.createFromParcel(parcel) : null, parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface(DESCRIPTOR);
                    onDisconnected(parcel.readInt() != 0 ? MiLinkDevice.CREATOR.createFromParcel(parcel) : null, parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface(DESCRIPTOR);
                    onFailure(parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface(DESCRIPTOR);
                    onConnectionChange(parcel.readInt(), parcel.readInt() != 0 ? MiLinkDevice.CREATOR.createFromParcel(parcel) : null, parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 6:
                    parcel.enforceInterface(DESCRIPTOR);
                    onPrivateProtectChange(parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    void onConnected(MiLinkDevice miLinkDevice, int i) throws RemoteException;

    void onConnectionChange(int i, MiLinkDevice miLinkDevice, int i2) throws RemoteException;

    void onDisconnected(MiLinkDevice miLinkDevice, int i) throws RemoteException;

    void onFailure(int i, int i2) throws RemoteException;

    void onInit() throws RemoteException;

    void onPrivateProtectChange(int i, int i2) throws RemoteException;
}
