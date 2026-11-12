package com.ingenic.iwds.devicemanager;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes18.dex */
public interface IDeviceManagerService extends IInterface {

    public static abstract class Stub extends Binder implements IDeviceManagerService {

        public static class a implements IDeviceManagerService {
            private IBinder a;

            public a(IBinder iBinder) {
                this.a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.a;
            }

            @Override // com.ingenic.iwds.devicemanager.IDeviceManagerService
            public boolean isWearOnRightHand() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.ingenic.iwds.devicemanager.IDeviceManagerService");
                    this.a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ingenic.iwds.devicemanager.IDeviceManagerService
            public boolean setWearOnRightHand(boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.ingenic.iwds.devicemanager.IDeviceManagerService");
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, "com.ingenic.iwds.devicemanager.IDeviceManagerService");
        }

        public static IDeviceManagerService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.ingenic.iwds.devicemanager.IDeviceManagerService");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IDeviceManagerService)) ? new a(iBinder) : (IDeviceManagerService) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("com.ingenic.iwds.devicemanager.IDeviceManagerService");
                boolean zIsWearOnRightHand = isWearOnRightHand();
                parcel2.writeNoException();
                parcel2.writeInt(zIsWearOnRightHand ? 1 : 0);
                return true;
            }
            if (i != 2) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString("com.ingenic.iwds.devicemanager.IDeviceManagerService");
                return true;
            }
            parcel.enforceInterface("com.ingenic.iwds.devicemanager.IDeviceManagerService");
            boolean wearOnRightHand = setWearOnRightHand(parcel.readInt() != 0);
            parcel2.writeNoException();
            parcel2.writeInt(wearOnRightHand ? 1 : 0);
            return true;
        }
    }

    boolean isWearOnRightHand() throws RemoteException;

    boolean setWearOnRightHand(boolean z) throws RemoteException;
}
