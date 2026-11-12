package com.chinatelecom.multisimservice.model;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes21.dex */
public interface ISmartWearServiceInfoCallback extends IInterface {
    public static final String DESCRIPTOR = "com.chinatelecom.multisimservice.model.ISmartWearServiceInfoCallback";

    void getSmartWearServiceInfo(SmartWearServiceInfo smartWearServiceInfo) throws RemoteException;

    public static abstract class Stub extends Binder implements ISmartWearServiceInfoCallback {
        static final int TRANSACTION_getSmartWearServiceInfo = 1;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, ISmartWearServiceInfoCallback.DESCRIPTOR);
        }

        public static ISmartWearServiceInfoCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(ISmartWearServiceInfoCallback.DESCRIPTOR);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof ISmartWearServiceInfoCallback)) {
                return (ISmartWearServiceInfoCallback) iInterfaceQueryLocalInterface;
            }
            return new c(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(ISmartWearServiceInfoCallback.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(ISmartWearServiceInfoCallback.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                getSmartWearServiceInfo((SmartWearServiceInfo) e.c(parcel, SmartWearServiceInfo.CREATOR));
                parcel2.writeNoException();
                return true;
            }
            return super.onTransact(i, parcel, parcel2, i2);
        }

        static class c implements ISmartWearServiceInfoCallback {
            private IBinder e;

            c(IBinder iBinder) {
                this.e = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.e;
            }

            @Override // com.chinatelecom.multisimservice.model.ISmartWearServiceInfoCallback
            public void getSmartWearServiceInfo(SmartWearServiceInfo smartWearServiceInfo) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ISmartWearServiceInfoCallback.DESCRIPTOR);
                    e.b(parcelObtain, smartWearServiceInfo, 0);
                    this.e.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }
    }

    public static class e {
        /* JADX INFO: Access modifiers changed from: private */
        public static <T> T c(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static <T extends Parcelable> void b(Parcel parcel, T t, int i) {
            if (t != null) {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
            } else {
                parcel.writeInt(0);
            }
        }
    }
}
