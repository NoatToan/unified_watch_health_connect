package com.miui.tsmclientsdk;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public interface IMiTsmStatusService extends IInterface {
    public static final String DESCRIPTOR = "com.miui.tsmclientsdk.IMiTsmStatusService";

    public static class Default implements IMiTsmStatusService {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.miui.tsmclientsdk.IMiTsmStatusService
        public int getPhoneStatus() throws RemoteException {
            return 0;
        }
    }

    public static abstract class Stub extends Binder implements IMiTsmStatusService {
        static final int TRANSACTION_getPhoneStatus = 1;

        public static class Proxy implements IMiTsmStatusService {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IMiTsmStatusService.DESCRIPTOR;
            }

            @Override // com.miui.tsmclientsdk.IMiTsmStatusService
            public int getPhoneStatus() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMiTsmStatusService.DESCRIPTOR);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IMiTsmStatusService.DESCRIPTOR);
        }

        public static IMiTsmStatusService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IMiTsmStatusService.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IMiTsmStatusService)) ? new Proxy(iBinder) : (IMiTsmStatusService) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IMiTsmStatusService.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IMiTsmStatusService.DESCRIPTOR);
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            int phoneStatus = getPhoneStatus();
            parcel2.writeNoException();
            parcel2.writeInt(phoneStatus);
            return true;
        }
    }

    int getPhoneStatus() throws RemoteException;
}
