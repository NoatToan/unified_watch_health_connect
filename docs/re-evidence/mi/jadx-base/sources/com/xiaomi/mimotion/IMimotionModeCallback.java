package com.xiaomi.mimotion;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes11.dex */
public interface IMimotionModeCallback extends IInterface {
    public static final String DESCRIPTOR = "com.xiaomi.mimotion.IMimotionModeCallback";

    public static class Default implements IMimotionModeCallback {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.xiaomi.mimotion.IMimotionModeCallback
        public void onUpdateMimotionMode(boolean z) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IMimotionModeCallback {
        static final int TRANSACTION_onUpdateMimotionMode = 1;

        public static class Proxy implements IMimotionModeCallback {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IMimotionModeCallback.DESCRIPTOR;
            }

            @Override // com.xiaomi.mimotion.IMimotionModeCallback
            public void onUpdateMimotionMode(boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMimotionModeCallback.DESCRIPTOR);
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.mRemote.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IMimotionModeCallback.DESCRIPTOR);
        }

        public static IMimotionModeCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IMimotionModeCallback.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IMimotionModeCallback)) ? new Proxy(iBinder) : (IMimotionModeCallback) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IMimotionModeCallback.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IMimotionModeCallback.DESCRIPTOR);
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            onUpdateMimotionMode(parcel.readInt() != 0);
            return true;
        }
    }

    void onUpdateMimotionMode(boolean z) throws RemoteException;
}
