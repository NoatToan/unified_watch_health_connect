package com.xiaomi.digitalkey.ccc.api;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes7.dex */
public interface IDigitalKeyCallback extends IInterface {
    public static final int CALL_TYPE_BYTEARRY = 6;
    public static final int CALL_TYPE_CAPLIST = 5;
    public static final int CALL_TYPE_DKDATA = 1;
    public static final int CALL_TYPE_DKLIST = 3;
    public static final int CALL_TYPE_DK_SHARE_SEESION = 2;
    public static final int CALL_TYPE_STR = 7;
    public static final int CALL_TYPE_VOID = 4;
    public static final String DESCRIPTOR = "com.xiaomi.digitalkey.ccc.api.IDigitalKeyCallback";
    public static final int ERR_TYPE_NOT_READY = 8;
    public static final int ERR_TYPE_TIMEOUT_1 = 3;
    public static final int ERR_TYPE_TIMEOUT_2 = 4;
    public static final int ERR_TYPE_TIMEOUT_3 = 5;
    public static final int ERR_TYPE_TIMEOUT_4 = 6;
    public static final int ERR_TYPE_UNKNOW = 0;
    public static final int ERR_TYPE_VEHICLE_REJECT = 9;
    public static final int ERR_TYPE_VERSION_APPLET = 2;
    public static final int ERR_TYPE_VERSION_SPAKE = 1;
    public static final int ERR_TYPE_WRONG_CERT = 11;
    public static final int ERR_TYPE_WRONG_CONFIG = 10;
    public static final int ERR_TYPE_WRONG_ECPOINT = 12;
    public static final int ERR_TYPE_WRONG_FORMAT = 127;
    public static final int ERR_TYPE_WRONG_MAX_PSW = 13;
    public static final int ERR_TYPE_WRONG_PSW = 17;
    public static final String EXTRA_DKDATA = "extra_dkdata";
    public static final String EXTRA_DK_SHARESSEION = "extra_dkshare";
    public static final String EXTRA_LIST_BYTEARRY = "extra_bytearry";
    public static final String EXTRA_LIST_INT = "extra_listint";
    public static final String EXTRA_LIST_STR = "extra_liststr";
    public static final String EXTRA_STR = "extra_str";
    public static final String KEY_CALL_TYPE = "type";

    public static class Default implements IDigitalKeyCallback {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.xiaomi.digitalkey.ccc.api.IDigitalKeyCallback
        public void onError(int i) throws RemoteException {
        }

        @Override // com.xiaomi.digitalkey.ccc.api.IDigitalKeyCallback
        public void onResult(Bundle bundle) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IDigitalKeyCallback {
        static final int TRANSACTION_onError = 2;
        static final int TRANSACTION_onResult = 1;

        public static class Proxy implements IDigitalKeyCallback {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IDigitalKeyCallback.DESCRIPTOR;
            }

            @Override // com.xiaomi.digitalkey.ccc.api.IDigitalKeyCallback
            public void onError(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDigitalKeyCallback.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.digitalkey.ccc.api.IDigitalKeyCallback
            public void onResult(Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDigitalKeyCallback.DESCRIPTOR);
                    _Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IDigitalKeyCallback.DESCRIPTOR);
        }

        public static IDigitalKeyCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IDigitalKeyCallback.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IDigitalKeyCallback)) ? new Proxy(iBinder) : (IDigitalKeyCallback) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IDigitalKeyCallback.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IDigitalKeyCallback.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                onResult((Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR));
            } else {
                if (i != 2) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                onError(parcel.readInt());
            }
            parcel2.writeNoException();
            return true;
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
            if (t == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
            }
        }
    }

    void onError(int i) throws RemoteException;

    void onResult(Bundle bundle) throws RemoteException;
}
