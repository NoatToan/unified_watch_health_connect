package com.miui.tsmclient.dkf;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
public interface IICCOA2DKFRequestService extends IInterface {
    public static final String DESCRIPTOR = "com.miui.tsmclient.dkf.IICCOA2DKFRequestService";

    public static class Default implements IICCOA2DKFRequestService {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.miui.tsmclient.dkf.IICCOA2DKFRequestService
        public String dkfRequest(int i, String str) throws RemoteException {
            return null;
        }
    }

    public static abstract class Stub extends Binder implements IICCOA2DKFRequestService {
        static final int TRANSACTION_dkfRequest = 1;

        public static class Proxy implements IICCOA2DKFRequestService {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.miui.tsmclient.dkf.IICCOA2DKFRequestService
            public String dkfRequest(int i, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IICCOA2DKFRequestService.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return IICCOA2DKFRequestService.DESCRIPTOR;
            }
        }

        public Stub() {
            attachInterface(this, IICCOA2DKFRequestService.DESCRIPTOR);
        }

        public static IICCOA2DKFRequestService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IICCOA2DKFRequestService.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IICCOA2DKFRequestService)) ? new Proxy(iBinder) : (IICCOA2DKFRequestService) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IICCOA2DKFRequestService.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IICCOA2DKFRequestService.DESCRIPTOR);
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            String strDkfRequest = dkfRequest(parcel.readInt(), parcel.readString());
            parcel2.writeNoException();
            parcel2.writeString(strDkfRequest);
            return true;
        }
    }

    String dkfRequest(int i, String str) throws RemoteException;
}
