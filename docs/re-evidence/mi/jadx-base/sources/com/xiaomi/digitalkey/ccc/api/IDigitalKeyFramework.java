package com.xiaomi.digitalkey.ccc.api;

import android.net.Uri;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes7.dex */
public interface IDigitalKeyFramework extends IInterface {
    public static final String DESCRIPTOR = "com.xiaomi.digitalkey.ccc.api.IDigitalKeyFramework";

    public static class Default implements IDigitalKeyFramework {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.xiaomi.digitalkey.ccc.api.IDigitalKeyFramework
        public void confirmDigitalKeySharing(Uri uri, IDigitalKeyCallback iDigitalKeyCallback) throws RemoteException {
        }

        @Override // com.xiaomi.digitalkey.ccc.api.IDigitalKeyFramework
        public void queryImportRequest(String str, IDigitalKeyCallback iDigitalKeyCallback) throws RemoteException {
        }

        @Override // com.xiaomi.digitalkey.ccc.api.IDigitalKeyFramework
        public void startRedeemSharing(String str, IDigitalKeyCallback iDigitalKeyCallback) throws RemoteException {
        }

        @Override // com.xiaomi.digitalkey.ccc.api.IDigitalKeyFramework
        public void terminateDigitalKey(String str, IDigitalKeyCallback iDigitalKeyCallback) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IDigitalKeyFramework {
        static final int TRANSACTION_confirmDigitalKeySharing = 2;
        static final int TRANSACTION_queryImportRequest = 4;
        static final int TRANSACTION_startRedeemSharing = 3;
        static final int TRANSACTION_terminateDigitalKey = 1;

        public static class Proxy implements IDigitalKeyFramework {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.xiaomi.digitalkey.ccc.api.IDigitalKeyFramework
            public void confirmDigitalKeySharing(Uri uri, IDigitalKeyCallback iDigitalKeyCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDigitalKeyFramework.DESCRIPTOR);
                    _Parcel.writeTypedObject(parcelObtain, uri, 0);
                    parcelObtain.writeStrongInterface(iDigitalKeyCallback);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return IDigitalKeyFramework.DESCRIPTOR;
            }

            @Override // com.xiaomi.digitalkey.ccc.api.IDigitalKeyFramework
            public void queryImportRequest(String str, IDigitalKeyCallback iDigitalKeyCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDigitalKeyFramework.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongInterface(iDigitalKeyCallback);
                    this.mRemote.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.digitalkey.ccc.api.IDigitalKeyFramework
            public void startRedeemSharing(String str, IDigitalKeyCallback iDigitalKeyCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDigitalKeyFramework.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongInterface(iDigitalKeyCallback);
                    this.mRemote.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.digitalkey.ccc.api.IDigitalKeyFramework
            public void terminateDigitalKey(String str, IDigitalKeyCallback iDigitalKeyCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDigitalKeyFramework.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongInterface(iDigitalKeyCallback);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IDigitalKeyFramework.DESCRIPTOR);
        }

        public static IDigitalKeyFramework asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IDigitalKeyFramework.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IDigitalKeyFramework)) ? new Proxy(iBinder) : (IDigitalKeyFramework) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IDigitalKeyFramework.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IDigitalKeyFramework.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                terminateDigitalKey(parcel.readString(), IDigitalKeyCallback.Stub.asInterface(parcel.readStrongBinder()));
            } else if (i == 2) {
                confirmDigitalKeySharing((Uri) _Parcel.readTypedObject(parcel, Uri.CREATOR), IDigitalKeyCallback.Stub.asInterface(parcel.readStrongBinder()));
            } else if (i == 3) {
                startRedeemSharing(parcel.readString(), IDigitalKeyCallback.Stub.asInterface(parcel.readStrongBinder()));
            } else {
                if (i != 4) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                queryImportRequest(parcel.readString(), IDigitalKeyCallback.Stub.asInterface(parcel.readStrongBinder()));
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

    void confirmDigitalKeySharing(Uri uri, IDigitalKeyCallback iDigitalKeyCallback) throws RemoteException;

    void queryImportRequest(String str, IDigitalKeyCallback iDigitalKeyCallback) throws RemoteException;

    void startRedeemSharing(String str, IDigitalKeyCallback iDigitalKeyCallback) throws RemoteException;

    void terminateDigitalKey(String str, IDigitalKeyCallback iDigitalKeyCallback) throws RemoteException;
}
