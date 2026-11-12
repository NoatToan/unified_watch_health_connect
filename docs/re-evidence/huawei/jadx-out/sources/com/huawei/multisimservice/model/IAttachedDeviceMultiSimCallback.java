package com.huawei.multisimservice.model;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public interface IAttachedDeviceMultiSimCallback extends IInterface {
    void deleteESimProfileNotify(int i) throws RemoteException;

    void downloadESimProfile(int i, List<SimInfo> list) throws RemoteException;

    void getAttachedDeviceMultiSimInfo(MultiSimDeviceInfo multiSimDeviceInfo) throws RemoteException;

    public static abstract class Stub extends Binder implements IAttachedDeviceMultiSimCallback {
        private static final String DESCRIPTOR = "com.huawei.multisimservice.model.IAttachedDeviceMultiSimCallback";
        static final int TRANSACTION_deleteESimProfileNotify = 3;
        static final int TRANSACTION_downloadESimProfile = 2;
        static final int TRANSACTION_getAttachedDeviceMultiSimInfo = 1;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IAttachedDeviceMultiSimCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof IAttachedDeviceMultiSimCallback)) {
                return (IAttachedDeviceMultiSimCallback) iInterfaceQueryLocalInterface;
            }
            return new a(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                getAttachedDeviceMultiSimInfo(parcel.readInt() != 0 ? MultiSimDeviceInfo.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            }
            if (i == 2) {
                parcel.enforceInterface(DESCRIPTOR);
                downloadESimProfile(parcel.readInt(), parcel.createTypedArrayList(SimInfo.CREATOR));
                parcel2.writeNoException();
                return true;
            }
            if (i != 3) {
                if (i == 1598968902) {
                    parcel2.writeString(DESCRIPTOR);
                    return true;
                }
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel.enforceInterface(DESCRIPTOR);
            deleteESimProfileNotify(parcel.readInt());
            parcel2.writeNoException();
            return true;
        }

        static class a implements IAttachedDeviceMultiSimCallback {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static IAttachedDeviceMultiSimCallback f18083c;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private IBinder f18084b;

            a(IBinder iBinder) {
                this.f18084b = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f18084b;
            }

            @Override // com.huawei.multisimservice.model.IAttachedDeviceMultiSimCallback
            public void getAttachedDeviceMultiSimInfo(MultiSimDeviceInfo multiSimDeviceInfo) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (multiSimDeviceInfo != null) {
                        parcelObtain.writeInt(1);
                        multiSimDeviceInfo.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.f18084b.transact(1, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().getAttachedDeviceMultiSimInfo(multiSimDeviceInfo);
                    } else {
                        parcelObtain2.readException();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.multisimservice.model.IAttachedDeviceMultiSimCallback
            public void downloadESimProfile(int i, List<SimInfo> list) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeTypedList(list);
                    if (!this.f18084b.transact(2, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().downloadESimProfile(i, list);
                    } else {
                        parcelObtain2.readException();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.multisimservice.model.IAttachedDeviceMultiSimCallback
            public void deleteESimProfileNotify(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    if (!this.f18084b.transact(3, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().deleteESimProfileNotify(i);
                    } else {
                        parcelObtain2.readException();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public static boolean setDefaultImpl(IAttachedDeviceMultiSimCallback iAttachedDeviceMultiSimCallback) {
            if (a.f18083c != null || iAttachedDeviceMultiSimCallback == null) {
                return false;
            }
            a.f18083c = iAttachedDeviceMultiSimCallback;
            return true;
        }

        public static IAttachedDeviceMultiSimCallback getDefaultImpl() {
            return a.f18083c;
        }
    }
}
