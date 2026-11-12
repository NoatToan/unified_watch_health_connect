package com.xiaomi.mi_connect_service;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes11.dex */
public interface ISoundBoxWhiteNameCallBack extends IInterface {

    public static class Default implements ISoundBoxWhiteNameCallBack {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.xiaomi.mi_connect_service.ISoundBoxWhiteNameCallBack
        public int onWriteWhiteName(String str) throws RemoteException {
            return 0;
        }
    }

    public static abstract class Stub extends Binder implements ISoundBoxWhiteNameCallBack {
        private static final String DESCRIPTOR = "com.xiaomi.mi_connect_service.ISoundBoxWhiteNameCallBack";
        static final int TRANSACTION_onWriteWhiteName = 1;

        public static class Proxy implements ISoundBoxWhiteNameCallBack {
            public static ISoundBoxWhiteNameCallBack sDefaultImpl;
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            @Override // com.xiaomi.mi_connect_service.ISoundBoxWhiteNameCallBack
            public int onWriteWhiteName(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    if (!this.mRemote.transact(1, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().onWriteWhiteName(str);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static ISoundBoxWhiteNameCallBack asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ISoundBoxWhiteNameCallBack)) ? new Proxy(iBinder) : (ISoundBoxWhiteNameCallBack) iInterfaceQueryLocalInterface;
        }

        public static ISoundBoxWhiteNameCallBack getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(ISoundBoxWhiteNameCallBack iSoundBoxWhiteNameCallBack) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iSoundBoxWhiteNameCallBack == null) {
                return false;
            }
            Proxy.sDefaultImpl = iSoundBoxWhiteNameCallBack;
            return true;
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
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
            parcel.enforceInterface(DESCRIPTOR);
            int iOnWriteWhiteName = onWriteWhiteName(parcel.readString());
            parcel2.writeNoException();
            parcel2.writeInt(iOnWriteWhiteName);
            return true;
        }
    }

    int onWriteWhiteName(String str) throws RemoteException;
}
