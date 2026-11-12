package com.xiaomi.mi_connect_service;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes11.dex */
public interface IDeviceMessageListener extends IInterface {
    public static final int ERROR = -1;
    public static final int OK = 0;

    public static class Default implements IDeviceMessageListener {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.xiaomi.mi_connect_service.IDeviceMessageListener
        public void onMessage(DpsCallbackData dpsCallbackData) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IDeviceMessageListener {
        private static final String DESCRIPTOR = "com.xiaomi.mi_connect_service.IDeviceMessageListener";
        static final int TRANSACTION_onMessage = 1;

        public static class Proxy implements IDeviceMessageListener {
            public static IDeviceMessageListener sDefaultImpl;
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

            @Override // com.xiaomi.mi_connect_service.IDeviceMessageListener
            public void onMessage(DpsCallbackData dpsCallbackData) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (dpsCallbackData != null) {
                        parcelObtain.writeInt(1);
                        dpsCallbackData.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.mRemote.transact(1, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onMessage(dpsCallbackData);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IDeviceMessageListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IDeviceMessageListener)) ? new Proxy(iBinder) : (IDeviceMessageListener) iInterfaceQueryLocalInterface;
        }

        public static IDeviceMessageListener getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IDeviceMessageListener iDeviceMessageListener) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iDeviceMessageListener == null) {
                return false;
            }
            Proxy.sDefaultImpl = iDeviceMessageListener;
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
                onMessage(parcel.readInt() != 0 ? DpsCallbackData.CREATOR.createFromParcel(parcel) : null);
                return true;
            }
            if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel2.writeString(DESCRIPTOR);
            return true;
        }
    }

    void onMessage(DpsCallbackData dpsCallbackData) throws RemoteException;
}
