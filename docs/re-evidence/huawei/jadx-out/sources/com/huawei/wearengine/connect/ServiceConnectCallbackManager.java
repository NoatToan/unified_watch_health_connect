package com.huawei.wearengine.connect;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes46.dex */
public interface ServiceConnectCallbackManager extends IInterface {
    public static final String DESCRIPTOR = "com.huawei.wearengine.connect.ServiceConnectCallbackManager";

    int registerConnectCallback(ServiceConnectCallback serviceConnectCallback) throws RemoteException;

    int registerOtaServiceConnectCallback(ServiceConnectCallback serviceConnectCallback) throws RemoteException;

    int unregisterConnectCallback(ServiceConnectCallback serviceConnectCallback) throws RemoteException;

    int unregisterOtaServiceConnectCallback(ServiceConnectCallback serviceConnectCallback) throws RemoteException;

    public static abstract class Stub extends Binder implements ServiceConnectCallbackManager {
        static final int TRANSACTION_registerConnectCallback = 1;
        static final int TRANSACTION_registerOtaServiceConnectCallback = 3;
        static final int TRANSACTION_unregisterConnectCallback = 2;
        static final int TRANSACTION_unregisterOtaServiceConnectCallback = 4;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, ServiceConnectCallbackManager.DESCRIPTOR);
        }

        public static ServiceConnectCallbackManager asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(ServiceConnectCallbackManager.DESCRIPTOR);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof ServiceConnectCallbackManager)) {
                return (ServiceConnectCallbackManager) iInterfaceQueryLocalInterface;
            }
            return new c(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(ServiceConnectCallbackManager.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(ServiceConnectCallbackManager.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                int iRegisterConnectCallback = registerConnectCallback(ServiceConnectCallback.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                parcel2.writeInt(iRegisterConnectCallback);
            } else if (i == 2) {
                int iUnregisterConnectCallback = unregisterConnectCallback(ServiceConnectCallback.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                parcel2.writeInt(iUnregisterConnectCallback);
            } else if (i == 3) {
                int iRegisterOtaServiceConnectCallback = registerOtaServiceConnectCallback(ServiceConnectCallback.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                parcel2.writeInt(iRegisterOtaServiceConnectCallback);
            } else if (i == 4) {
                int iUnregisterOtaServiceConnectCallback = unregisterOtaServiceConnectCallback(ServiceConnectCallback.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                parcel2.writeInt(iUnregisterOtaServiceConnectCallback);
            } else {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            return true;
        }

        static class c implements ServiceConnectCallbackManager {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private IBinder f30765a;

            c(IBinder iBinder) {
                this.f30765a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f30765a;
            }

            @Override // com.huawei.wearengine.connect.ServiceConnectCallbackManager
            public int registerConnectCallback(ServiceConnectCallback serviceConnectCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ServiceConnectCallbackManager.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(serviceConnectCallback);
                    this.f30765a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.wearengine.connect.ServiceConnectCallbackManager
            public int unregisterConnectCallback(ServiceConnectCallback serviceConnectCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ServiceConnectCallbackManager.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(serviceConnectCallback);
                    this.f30765a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.wearengine.connect.ServiceConnectCallbackManager
            public int registerOtaServiceConnectCallback(ServiceConnectCallback serviceConnectCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ServiceConnectCallbackManager.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(serviceConnectCallback);
                    this.f30765a.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.wearengine.connect.ServiceConnectCallbackManager
            public int unregisterOtaServiceConnectCallback(ServiceConnectCallback serviceConnectCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ServiceConnectCallbackManager.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(serviceConnectCallback);
                    this.f30765a.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }
    }
}
