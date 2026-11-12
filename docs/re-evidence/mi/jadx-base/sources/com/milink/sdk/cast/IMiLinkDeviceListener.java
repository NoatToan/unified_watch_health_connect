package com.milink.sdk.cast;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes5.dex */
public interface IMiLinkDeviceListener extends IInterface {

    public static class Default implements IMiLinkDeviceListener {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.milink.sdk.cast.IMiLinkDeviceListener
        public void onFound(MiLinkDevice miLinkDevice) throws RemoteException {
        }

        @Override // com.milink.sdk.cast.IMiLinkDeviceListener
        public void onLost(MiLinkDevice miLinkDevice) throws RemoteException {
        }

        @Override // com.milink.sdk.cast.IMiLinkDeviceListener
        public void onUpdate(MiLinkDevice miLinkDevice) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IMiLinkDeviceListener {
        private static final String DESCRIPTOR = "com.milink.sdk.cast.IMiLinkDeviceListener";
        static final int TRANSACTION_onFound = 1;
        static final int TRANSACTION_onLost = 3;
        static final int TRANSACTION_onUpdate = 2;

        public static class Proxy implements IMiLinkDeviceListener {
            public static IMiLinkDeviceListener sDefaultImpl;
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

            @Override // com.milink.sdk.cast.IMiLinkDeviceListener
            public void onFound(MiLinkDevice miLinkDevice) throws RemoteException {
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
                    if (this.mRemote.transact(1, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onFound(miLinkDevice);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.milink.sdk.cast.IMiLinkDeviceListener
            public void onLost(MiLinkDevice miLinkDevice) throws RemoteException {
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
                    if (this.mRemote.transact(3, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onLost(miLinkDevice);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.milink.sdk.cast.IMiLinkDeviceListener
            public void onUpdate(MiLinkDevice miLinkDevice) throws RemoteException {
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
                    if (this.mRemote.transact(2, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onUpdate(miLinkDevice);
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

        public static IMiLinkDeviceListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IMiLinkDeviceListener)) ? new Proxy(iBinder) : (IMiLinkDeviceListener) iInterfaceQueryLocalInterface;
        }

        public static IMiLinkDeviceListener getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IMiLinkDeviceListener iMiLinkDeviceListener) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iMiLinkDeviceListener == null) {
                return false;
            }
            Proxy.sDefaultImpl = iMiLinkDeviceListener;
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
                onFound(parcel.readInt() != 0 ? MiLinkDevice.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            }
            if (i == 2) {
                parcel.enforceInterface(DESCRIPTOR);
                onUpdate(parcel.readInt() != 0 ? MiLinkDevice.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            }
            if (i != 3) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
            parcel.enforceInterface(DESCRIPTOR);
            onLost(parcel.readInt() != 0 ? MiLinkDevice.CREATOR.createFromParcel(parcel) : null);
            parcel2.writeNoException();
            return true;
        }
    }

    void onFound(MiLinkDevice miLinkDevice) throws RemoteException;

    void onLost(MiLinkDevice miLinkDevice) throws RemoteException;

    void onUpdate(MiLinkDevice miLinkDevice) throws RemoteException;
}
