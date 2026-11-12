package com.chinatelecom.multisimservice.model;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
public interface IOpenMultiSimCalbcak extends IInterface {
    public static final String DESCRIPTOR = "com.chinatelecom.multisimservice.model.IOpenMultiSimCalbcak";

    void getDeviceMultiSimInfo(MultiSimDeviceInfo multiSimDeviceInfo) throws RemoteException;

    void getProfileDownloadStatus(int i) throws RemoteException;

    /* JADX INFO: loaded from: classes21.dex */
    public static abstract class Stub extends Binder implements IOpenMultiSimCalbcak {
        static final int TRANSACTION_getDeviceMultiSimInfo = 1;
        static final int TRANSACTION_getProfileDownloadStatus = 2;

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
                getDeviceMultiSimInfo((MultiSimDeviceInfo) c.c(parcel, MultiSimDeviceInfo.CREATOR));
                parcel2.writeNoException();
            } else if (i == 2) {
                getProfileDownloadStatus(parcel.readInt());
                parcel2.writeNoException();
            } else {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            return true;
        }

        static class b implements IOpenMultiSimCalbcak {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private IBinder f4046c;

            b(IBinder iBinder) {
                this.f4046c = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f4046c;
            }

            @Override // com.chinatelecom.multisimservice.model.IOpenMultiSimCalbcak
            public void getDeviceMultiSimInfo(MultiSimDeviceInfo multiSimDeviceInfo) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IOpenMultiSimCalbcak.DESCRIPTOR);
                    c.c(parcelObtain, multiSimDeviceInfo, 0);
                    this.f4046c.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.chinatelecom.multisimservice.model.IOpenMultiSimCalbcak
            public void getProfileDownloadStatus(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IOpenMultiSimCalbcak.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    this.f4046c.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static class c {
        /* JADX INFO: Access modifiers changed from: private */
        public static <T> T c(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static <T extends Parcelable> void c(Parcel parcel, T t, int i) {
            if (t != null) {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
            } else {
                parcel.writeInt(0);
            }
        }
    }
}
