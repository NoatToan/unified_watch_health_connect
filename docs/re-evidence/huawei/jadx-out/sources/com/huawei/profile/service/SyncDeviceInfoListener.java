package com.huawei.profile.service;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.Map;

/* JADX INFO: loaded from: classes42.dex */
public interface SyncDeviceInfoListener extends IInterface {
    public static final String DESCRIPTOR = "com.huawei.profile.service.SyncDeviceInfoListener";

    public static class Default implements SyncDeviceInfoListener {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.huawei.profile.service.SyncDeviceInfoListener
        public void onComplete(Map map) throws RemoteException {
        }
    }

    void onComplete(Map map) throws RemoteException;

    public static abstract class Stub extends Binder implements SyncDeviceInfoListener {
        static final int TRANSACTION_onComplete = 1;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, SyncDeviceInfoListener.DESCRIPTOR);
        }

        public static SyncDeviceInfoListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(SyncDeviceInfoListener.DESCRIPTOR);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof SyncDeviceInfoListener)) {
                return (SyncDeviceInfoListener) iInterfaceQueryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(SyncDeviceInfoListener.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(SyncDeviceInfoListener.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                onComplete(parcel.readHashMap(getClass().getClassLoader()));
                parcel2.writeNoException();
                return true;
            }
            return super.onTransact(i, parcel, parcel2, i2);
        }

        static class Proxy implements SyncDeviceInfoListener {
            private IBinder mRemote;

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return SyncDeviceInfoListener.DESCRIPTOR;
            }

            @Override // com.huawei.profile.service.SyncDeviceInfoListener
            public void onComplete(Map map) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(SyncDeviceInfoListener.DESCRIPTOR);
                    parcelObtain.writeMap(map);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }
    }
}
