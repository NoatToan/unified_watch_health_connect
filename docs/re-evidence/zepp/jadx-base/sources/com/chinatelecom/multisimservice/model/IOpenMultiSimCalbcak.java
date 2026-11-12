package com.chinatelecom.multisimservice.model;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public interface IOpenMultiSimCalbcak extends IInterface {

    public static class Default implements IOpenMultiSimCalbcak {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.chinatelecom.multisimservice.model.IOpenMultiSimCalbcak
        public void getDeviceMultiSimInfo(MultiSimDeviceInfo multiSimDeviceInfo) throws RemoteException {
        }

        @Override // com.chinatelecom.multisimservice.model.IOpenMultiSimCalbcak
        public void getProfileDownloadStatus(int i) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IOpenMultiSimCalbcak {
        private static final String a = "com.chinatelecom.multisimservice.model.IOpenMultiSimCalbcak";
        public static final int b = 1;
        public static final int c = 2;

        public static class a implements IOpenMultiSimCalbcak {
            public static IOpenMultiSimCalbcak b;
            private IBinder a;

            public a(IBinder iBinder) {
                this.a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.a;
            }

            public String d() {
                return Stub.a;
            }

            @Override // com.chinatelecom.multisimservice.model.IOpenMultiSimCalbcak
            public void getDeviceMultiSimInfo(MultiSimDeviceInfo multiSimDeviceInfo) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.a);
                    if (multiSimDeviceInfo != null) {
                        parcelObtain.writeInt(1);
                        multiSimDeviceInfo.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.a.transact(1, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().getDeviceMultiSimInfo(multiSimDeviceInfo);
                    }
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
                    parcelObtain.writeInterfaceToken(Stub.a);
                    parcelObtain.writeInt(i);
                    if (this.a.transact(2, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().getProfileDownloadStatus(i);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, a);
        }

        public static IOpenMultiSimCalbcak asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(a);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IOpenMultiSimCalbcak)) ? new a(iBinder) : (IOpenMultiSimCalbcak) iInterfaceQueryLocalInterface;
        }

        public static IOpenMultiSimCalbcak getDefaultImpl() {
            return a.b;
        }

        public static boolean setDefaultImpl(IOpenMultiSimCalbcak iOpenMultiSimCalbcak) {
            if (a.b != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iOpenMultiSimCalbcak == null) {
                return false;
            }
            a.b = iOpenMultiSimCalbcak;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface(a);
                getDeviceMultiSimInfo(parcel.readInt() != 0 ? MultiSimDeviceInfo.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            }
            if (i != 2) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString(a);
                return true;
            }
            parcel.enforceInterface(a);
            getProfileDownloadStatus(parcel.readInt());
            parcel2.writeNoException();
            return true;
        }
    }

    void getDeviceMultiSimInfo(MultiSimDeviceInfo multiSimDeviceInfo) throws RemoteException;

    void getProfileDownloadStatus(int i) throws RemoteException;
}
