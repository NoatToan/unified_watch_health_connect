package com.huawei.health;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public interface ITrackDataForDeveloper extends IInterface {
    public static final String DESCRIPTOR = "com.huawei.health.ITrackDataForDeveloper";

    void onDataChange(Bundle bundle) throws RemoteException;

    void onStateChanged(int i) throws RemoteException;

    public static abstract class Stub extends Binder implements ITrackDataForDeveloper {
        static final int TRANSACTION_onDataChange = 2;
        static final int TRANSACTION_onStateChanged = 1;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, ITrackDataForDeveloper.DESCRIPTOR);
        }

        public static ITrackDataForDeveloper asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(ITrackDataForDeveloper.DESCRIPTOR);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof ITrackDataForDeveloper)) {
                return (ITrackDataForDeveloper) iInterfaceQueryLocalInterface;
            }
            return new d(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(ITrackDataForDeveloper.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(ITrackDataForDeveloper.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                onStateChanged(parcel.readInt());
                parcel2.writeNoException();
            } else {
                if (i != 2) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                Bundle bundle = (Bundle) e.b(parcel, Bundle.CREATOR);
                onDataChange(bundle);
                parcel2.writeNoException();
                e.c(parcel2, bundle, 1);
            }
            return true;
        }

        static class d implements ITrackDataForDeveloper {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private IBinder f6125b;

            d(IBinder iBinder) {
                this.f6125b = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f6125b;
            }

            @Override // com.huawei.health.ITrackDataForDeveloper
            public void onStateChanged(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ITrackDataForDeveloper.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    this.f6125b.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.health.ITrackDataForDeveloper
            public void onDataChange(Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ITrackDataForDeveloper.DESCRIPTOR);
                    e.c(parcelObtain, bundle, 0);
                    this.f6125b.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    if (parcelObtain2.readInt() != 0) {
                        bundle.readFromParcel(parcelObtain2);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }
    }

    public static class e {
        /* JADX INFO: Access modifiers changed from: private */
        public static <T> T b(Parcel parcel, Parcelable.Creator<T> creator) {
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
