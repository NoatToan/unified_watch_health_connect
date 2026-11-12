package com.autonavi.minimap.wearable.contract;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes4.dex */
public interface ISendCallback extends IInterface {

    public static class Default implements ISendCallback {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.autonavi.minimap.wearable.contract.ISendCallback
        public void onSendCallback(int i, String str) {
        }
    }

    public static abstract class Stub extends Binder implements ISendCallback {
        private static final String DESCRIPTOR = "com.autonavi.minimap.wearable.contract.ISendCallback";
        public static final int TRANSACTION_onSendCallback = 1;

        public static class Proxy implements ISendCallback {
            public static ISendCallback sDefaultImpl;
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

            @Override // com.autonavi.minimap.wearable.contract.ISendCallback
            public void onSendCallback(int i, String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str);
                    if (this.mRemote.transact(1, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onSendCallback(i, str);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static ISendCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ISendCallback)) ? new Proxy(iBinder) : (ISendCallback) iInterfaceQueryLocalInterface;
        }

        public static ISendCallback getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(ISendCallback iSendCallback) {
            if (Proxy.sDefaultImpl != null || iSendCallback == null) {
                return false;
            }
            Proxy.sDefaultImpl = iSendCallback;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
            parcel.enforceInterface(DESCRIPTOR);
            onSendCallback(parcel.readInt(), parcel.readString());
            parcel2.writeNoException();
            return true;
        }
    }

    void onSendCallback(int i, String str);
}
