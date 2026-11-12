package com.huawei.multisimservice;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.huawei.multisimservice.model.IOpenMultiSimCalbcak;

/* JADX INFO: loaded from: classes40.dex */
public interface IOpenMultiSim extends IInterface {
    public static final String DESCRIPTOR = "com.huawei.multisimservice.IOpenMultiSim";

    void downloadESimProfile(String str) throws RemoteException;

    void downloadEsimProfile(String str, long j, String str2) throws RemoteException;

    void getAttachedDeviceMultiSimInfo() throws RemoteException;

    void registerCallback(IOpenMultiSimCalbcak iOpenMultiSimCalbcak) throws RemoteException;

    void unRegisterCallback(IOpenMultiSimCalbcak iOpenMultiSimCalbcak) throws RemoteException;

    public static abstract class Stub extends Binder implements IOpenMultiSim {
        static final int TRANSACTION_downloadESimProfile = 5;
        static final int TRANSACTION_downloadEsimProfile = 4;
        static final int TRANSACTION_getAttachedDeviceMultiSimInfo = 3;
        static final int TRANSACTION_registerCallback = 1;
        static final int TRANSACTION_unRegisterCallback = 2;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, IOpenMultiSim.DESCRIPTOR);
        }

        public static IOpenMultiSim asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IOpenMultiSim.DESCRIPTOR);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof IOpenMultiSim)) {
                return (IOpenMultiSim) iInterfaceQueryLocalInterface;
            }
            return new e(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IOpenMultiSim.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IOpenMultiSim.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                registerCallback(IOpenMultiSimCalbcak.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
            } else if (i == 2) {
                unRegisterCallback(IOpenMultiSimCalbcak.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
            } else if (i == 3) {
                getAttachedDeviceMultiSimInfo();
                parcel2.writeNoException();
            } else if (i == 4) {
                downloadEsimProfile(parcel.readString(), parcel.readLong(), parcel.readString());
                parcel2.writeNoException();
            } else if (i == 5) {
                downloadESimProfile(parcel.readString());
                parcel2.writeNoException();
            } else {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            return true;
        }

        static class e implements IOpenMultiSim {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private IBinder f18074a;

            e(IBinder iBinder) {
                this.f18074a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f18074a;
            }

            @Override // com.huawei.multisimservice.IOpenMultiSim
            public void registerCallback(IOpenMultiSimCalbcak iOpenMultiSimCalbcak) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IOpenMultiSim.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iOpenMultiSimCalbcak);
                    this.f18074a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.multisimservice.IOpenMultiSim
            public void unRegisterCallback(IOpenMultiSimCalbcak iOpenMultiSimCalbcak) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IOpenMultiSim.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iOpenMultiSimCalbcak);
                    this.f18074a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.multisimservice.IOpenMultiSim
            public void getAttachedDeviceMultiSimInfo() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IOpenMultiSim.DESCRIPTOR);
                    this.f18074a.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.multisimservice.IOpenMultiSim
            public void downloadEsimProfile(String str, long j, String str2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IOpenMultiSim.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeLong(j);
                    parcelObtain.writeString(str2);
                    this.f18074a.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.multisimservice.IOpenMultiSim
            public void downloadESimProfile(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IOpenMultiSim.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.f18074a.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }
    }
}
