package com.ingenic.iwds.uniconnect;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ingenic.iwds.DeviceDescriptor;

/* JADX INFO: loaded from: classes18.dex */
public interface IConnectionService extends IInterface {

    public static abstract class Stub extends Binder implements IConnectionService {

        public static class a implements IConnectionService {
            private IBinder a;

            public a(IBinder iBinder) {
                this.a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.a;
            }

            @Override // com.ingenic.iwds.uniconnect.IConnectionService
            public IConnection createConnection(IConnectionCallBack iConnectionCallBack) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.ingenic.iwds.uniconnect.IConnectionService");
                    parcelObtain.writeStrongBinder(iConnectionCallBack != null ? iConnectionCallBack.asBinder() : null);
                    this.a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return IConnection.Stub.asInterface(parcelObtain2.readStrongBinder());
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ingenic.iwds.uniconnect.IConnectionService
            public DeviceDescriptor[] getConnectedDeviceDescriptors() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.ingenic.iwds.uniconnect.IConnectionService");
                    this.a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (DeviceDescriptor[]) parcelObtain2.createTypedArray(DeviceDescriptor.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, "com.ingenic.iwds.uniconnect.IConnectionService");
        }

        public static IConnectionService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.ingenic.iwds.uniconnect.IConnectionService");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IConnectionService)) ? new a(iBinder) : (IConnectionService) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("com.ingenic.iwds.uniconnect.IConnectionService");
                IConnection iConnectionCreateConnection = createConnection(IConnectionCallBack.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                parcel2.writeStrongBinder(iConnectionCreateConnection != null ? iConnectionCreateConnection.asBinder() : null);
                return true;
            }
            if (i != 2) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString("com.ingenic.iwds.uniconnect.IConnectionService");
                return true;
            }
            parcel.enforceInterface("com.ingenic.iwds.uniconnect.IConnectionService");
            DeviceDescriptor[] connectedDeviceDescriptors = getConnectedDeviceDescriptors();
            parcel2.writeNoException();
            parcel2.writeTypedArray(connectedDeviceDescriptors, 1);
            return true;
        }
    }

    IConnection createConnection(IConnectionCallBack iConnectionCallBack) throws RemoteException;

    DeviceDescriptor[] getConnectedDeviceDescriptors() throws RemoteException;
}
