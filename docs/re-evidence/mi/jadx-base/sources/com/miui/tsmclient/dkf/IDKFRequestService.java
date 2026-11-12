package com.miui.tsmclient.dkf;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
public interface IDKFRequestService extends IInterface {
    public static final String DESCRIPTOR = "com.miui.tsmclient.dkf.IDKFRequestService";

    public static class Default implements IDKFRequestService {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.miui.tsmclient.dkf.IDKFRequestService
        public byte[] dkfRequest(int i, byte[] bArr) throws RemoteException {
            return null;
        }
    }

    public static abstract class Stub extends Binder implements IDKFRequestService {
        static final int TRANSACTION_dkfRequest = 1;

        public static class Proxy implements IDKFRequestService {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.miui.tsmclient.dkf.IDKFRequestService
            public byte[] dkfRequest(int i, byte[] bArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDKFRequestService.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeByteArray(bArr);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.createByteArray();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return IDKFRequestService.DESCRIPTOR;
            }
        }

        public Stub() {
            attachInterface(this, IDKFRequestService.DESCRIPTOR);
        }

        public static IDKFRequestService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IDKFRequestService.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IDKFRequestService)) ? new Proxy(iBinder) : (IDKFRequestService) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IDKFRequestService.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IDKFRequestService.DESCRIPTOR);
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            byte[] bArrDkfRequest = dkfRequest(parcel.readInt(), parcel.createByteArray());
            parcel2.writeNoException();
            parcel2.writeByteArray(bArrDkfRequest);
            return true;
        }
    }

    byte[] dkfRequest(int i, byte[] bArr) throws RemoteException;
}
