package com.huawei.unitedevice.callback;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.huawei.unitedevice.hwcommonfilemgr.entity.CommonFileInfoParcel;

/* JADX INFO: loaded from: classes45.dex */
public interface IBaseFileResponseCallback extends IInterface {
    public static final String DESCRIPTOR = "com.huawei.unitedevice.callback.IBaseFileResponseCallback";

    void onResponse(int i, CommonFileInfoParcel commonFileInfoParcel) throws RemoteException;

    public static abstract class Stub extends Binder implements IBaseFileResponseCallback {
        static final int TRANSACTION_onResponse = 1;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, IBaseFileResponseCallback.DESCRIPTOR);
        }

        public static IBaseFileResponseCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IBaseFileResponseCallback.DESCRIPTOR);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof IBaseFileResponseCallback)) {
                return (IBaseFileResponseCallback) iInterfaceQueryLocalInterface;
            }
            return new a(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IBaseFileResponseCallback.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IBaseFileResponseCallback.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                onResponse(parcel.readInt(), (CommonFileInfoParcel) c.c(parcel, CommonFileInfoParcel.CREATOR));
                parcel2.writeNoException();
                return true;
            }
            return super.onTransact(i, parcel, parcel2, i2);
        }

        static class a implements IBaseFileResponseCallback {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private IBinder f29860b;

            a(IBinder iBinder) {
                this.f29860b = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f29860b;
            }

            @Override // com.huawei.unitedevice.callback.IBaseFileResponseCallback
            public void onResponse(int i, CommonFileInfoParcel commonFileInfoParcel) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IBaseFileResponseCallback.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    c.b(parcelObtain, commonFileInfoParcel, 0);
                    this.f29860b.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }
    }

    public static class c {
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
