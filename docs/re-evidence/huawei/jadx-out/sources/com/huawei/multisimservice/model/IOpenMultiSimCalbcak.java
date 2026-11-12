package com.huawei.multisimservice.model;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes12.dex */
public interface IOpenMultiSimCalbcak extends IInterface {
    public static final String DESCRIPTOR = "com.huawei.multisimservice.model.IOpenMultiSimCalbcak";

    void getDeviceEUICCInfo(EUICCDeviceInfo eUICCDeviceInfo) throws RemoteException;

    void getDeviceMultiSimInfo(MultiSimDeviceInfo multiSimDeviceInfo) throws RemoteException;

    /* JADX INFO: loaded from: classes40.dex */
    public static abstract class Stub extends Binder implements IOpenMultiSimCalbcak {
        static final int TRANSACTION_getDeviceEUICCInfo = 2;
        static final int TRANSACTION_getDeviceMultiSimInfo = 1;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, IOpenMultiSimCalbcak.DESCRIPTOR);
        }

        public static IOpenMultiSimCalbcak asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IOpenMultiSimCalbcak.DESCRIPTOR);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof IOpenMultiSimCalbcak)) {
                return (IOpenMultiSimCalbcak) iInterfaceQueryLocalInterface;
            }
            return new b(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IOpenMultiSimCalbcak.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IOpenMultiSimCalbcak.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                getDeviceMultiSimInfo((MultiSimDeviceInfo) b.c(parcel, MultiSimDeviceInfo.CREATOR));
                parcel2.writeNoException();
            } else if (i == 2) {
                getDeviceEUICCInfo((EUICCDeviceInfo) b.c(parcel, EUICCDeviceInfo.CREATOR));
                parcel2.writeNoException();
            } else {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            return true;
        }

        static class b implements IOpenMultiSimCalbcak {
            private IBinder d;

            b(IBinder iBinder) {
                this.d = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.d;
            }

            @Override // com.huawei.multisimservice.model.IOpenMultiSimCalbcak
            public void getDeviceMultiSimInfo(MultiSimDeviceInfo multiSimDeviceInfo) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IOpenMultiSimCalbcak.DESCRIPTOR);
                    b.a(parcelObtain, multiSimDeviceInfo, 0);
                    this.d.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.multisimservice.model.IOpenMultiSimCalbcak
            public void getDeviceEUICCInfo(EUICCDeviceInfo eUICCDeviceInfo) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IOpenMultiSimCalbcak.DESCRIPTOR);
                    b.a(parcelObtain, eUICCDeviceInfo, 0);
                    this.d.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }
    }

    /* JADX INFO: loaded from: classes40.dex */
    public static class b {
        /* JADX INFO: Access modifiers changed from: private */
        public static <T> T c(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static <T extends Parcelable> void a(Parcel parcel, T t, int i) {
            if (t != null) {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
            } else {
                parcel.writeInt(0);
            }
        }
    }
}
