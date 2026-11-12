package com.huawei.profile.service;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.huawei.profile.profile.ProfileResult;

/* JADX INFO: loaded from: classes42.dex */
public interface PutDeviceExListener extends IInterface {
    public static final String DESCRIPTOR = "com.huawei.profile.service.PutDeviceExListener";

    public static class Default implements PutDeviceExListener {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.huawei.profile.service.PutDeviceExListener
        public void onComplete(ProfileResult profileResult) throws RemoteException {
        }
    }

    void onComplete(ProfileResult profileResult) throws RemoteException;

    public static abstract class Stub extends Binder implements PutDeviceExListener {
        static final int TRANSACTION_onComplete = 1;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, PutDeviceExListener.DESCRIPTOR);
        }

        public static PutDeviceExListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(PutDeviceExListener.DESCRIPTOR);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof PutDeviceExListener)) {
                return (PutDeviceExListener) iInterfaceQueryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(PutDeviceExListener.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(PutDeviceExListener.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                onComplete((ProfileResult) _Parcel.readTypedObject(parcel, ProfileResult.CREATOR));
                parcel2.writeNoException();
                return true;
            }
            return super.onTransact(i, parcel, parcel2, i2);
        }

        static class Proxy implements PutDeviceExListener {
            private IBinder mRemote;

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return PutDeviceExListener.DESCRIPTOR;
            }

            @Override // com.huawei.profile.service.PutDeviceExListener
            public void onComplete(ProfileResult profileResult) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(PutDeviceExListener.DESCRIPTOR);
                    _Parcel.writeTypedObject(parcelObtain, profileResult, 0);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }
    }

    public static class _Parcel {
        /* JADX INFO: Access modifiers changed from: private */
        public static <T> T readTypedObject(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static <T extends Parcelable> void writeTypedObject(Parcel parcel, T t, int i) {
            if (t != null) {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
            } else {
                parcel.writeInt(0);
            }
        }
    }
}
