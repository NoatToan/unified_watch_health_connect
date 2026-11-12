package com.cmcc.server;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.cmcc.server.model.IOpenMultiSimCallback;

/* JADX INFO: loaded from: classes2.dex */
public interface IOpenMultiSim extends IInterface {

    public static class Default implements IOpenMultiSim {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.cmcc.server.IOpenMultiSim
        public void downloadEsimProfile(String str) throws RemoteException {
        }

        @Override // com.cmcc.server.IOpenMultiSim
        public void getAttachedDeviceMultiSimInfo() throws RemoteException {
        }

        @Override // com.cmcc.server.IOpenMultiSim
        public void registerCallback(IOpenMultiSimCallback iOpenMultiSimCallback) throws RemoteException {
        }

        @Override // com.cmcc.server.IOpenMultiSim
        public void unRegisterCallback(IOpenMultiSimCallback iOpenMultiSimCallback) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IOpenMultiSim {
        private static final String a = "com.cmcc.server.IOpenMultiSim";
        public static final int b = 1;
        public static final int c = 2;
        public static final int d = 3;
        public static final int e = 4;

        public static class a implements IOpenMultiSim {
            public static IOpenMultiSim b;
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

            @Override // com.cmcc.server.IOpenMultiSim
            public void downloadEsimProfile(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.a);
                    parcelObtain.writeString(str);
                    if (this.a.transact(4, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().downloadEsimProfile(str);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.cmcc.server.IOpenMultiSim
            public void getAttachedDeviceMultiSimInfo() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.a);
                    if (this.a.transact(3, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().getAttachedDeviceMultiSimInfo();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.cmcc.server.IOpenMultiSim
            public void registerCallback(IOpenMultiSimCallback iOpenMultiSimCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.a);
                    parcelObtain.writeStrongBinder(iOpenMultiSimCallback != null ? iOpenMultiSimCallback.asBinder() : null);
                    if (this.a.transact(1, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().registerCallback(iOpenMultiSimCallback);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.cmcc.server.IOpenMultiSim
            public void unRegisterCallback(IOpenMultiSimCallback iOpenMultiSimCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.a);
                    parcelObtain.writeStrongBinder(iOpenMultiSimCallback != null ? iOpenMultiSimCallback.asBinder() : null);
                    if (this.a.transact(2, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().unRegisterCallback(iOpenMultiSimCallback);
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

        public static IOpenMultiSim asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(a);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IOpenMultiSim)) ? new a(iBinder) : (IOpenMultiSim) iInterfaceQueryLocalInterface;
        }

        public static IOpenMultiSim getDefaultImpl() {
            return a.b;
        }

        public static boolean setDefaultImpl(IOpenMultiSim iOpenMultiSim) {
            if (a.b != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iOpenMultiSim == null) {
                return false;
            }
            a.b = iOpenMultiSim;
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
                registerCallback(IOpenMultiSimCallback.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            }
            if (i == 2) {
                parcel.enforceInterface(a);
                unRegisterCallback(IOpenMultiSimCallback.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            }
            if (i == 3) {
                parcel.enforceInterface(a);
                getAttachedDeviceMultiSimInfo();
                parcel2.writeNoException();
                return true;
            }
            if (i != 4) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString(a);
                return true;
            }
            parcel.enforceInterface(a);
            downloadEsimProfile(parcel.readString());
            parcel2.writeNoException();
            return true;
        }
    }

    void downloadEsimProfile(String str) throws RemoteException;

    void getAttachedDeviceMultiSimInfo() throws RemoteException;

    void registerCallback(IOpenMultiSimCallback iOpenMultiSimCallback) throws RemoteException;

    void unRegisterCallback(IOpenMultiSimCallback iOpenMultiSimCallback) throws RemoteException;
}
