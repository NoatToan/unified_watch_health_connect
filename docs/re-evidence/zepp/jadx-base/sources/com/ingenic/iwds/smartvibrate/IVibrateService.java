package com.ingenic.iwds.smartvibrate;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes18.dex */
public interface IVibrateService extends IInterface {

    public static abstract class Stub extends Binder implements IVibrateService {

        public static class a implements IVibrateService {
            private IBinder a;

            public a(IBinder iBinder) {
                this.a = iBinder;
            }

            @Override // com.ingenic.iwds.smartvibrate.IVibrateService
            public int Drv2605Vibrate(int[] iArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.ingenic.iwds.smartvibrate.IVibrateService");
                    parcelObtain.writeIntArray(iArr);
                    this.a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    int i = parcelObtain2.readInt();
                    parcelObtain2.readIntArray(iArr);
                    return i;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.a;
            }
        }

        public Stub() {
            attachInterface(this, "com.ingenic.iwds.smartvibrate.IVibrateService");
        }

        public static IVibrateService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.ingenic.iwds.smartvibrate.IVibrateService");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IVibrateService)) ? new a(iBinder) : (IVibrateService) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString("com.ingenic.iwds.smartvibrate.IVibrateService");
                return true;
            }
            parcel.enforceInterface("com.ingenic.iwds.smartvibrate.IVibrateService");
            int[] iArrCreateIntArray = parcel.createIntArray();
            int iDrv2605Vibrate = Drv2605Vibrate(iArrCreateIntArray);
            parcel2.writeNoException();
            parcel2.writeInt(iDrv2605Vibrate);
            parcel2.writeIntArray(iArrCreateIntArray);
            return true;
        }
    }

    int Drv2605Vibrate(int[] iArr) throws RemoteException;
}
