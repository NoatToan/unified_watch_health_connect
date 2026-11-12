package com.ingenic.iwds.remotewakelock;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes18.dex */
interface IRemoteWakeLockCallback extends IInterface {

    public static class RemoteWakeLockCallbackPorxy implements IRemoteWakeLockCallback {
        private IBinder a;

        public RemoteWakeLockCallbackPorxy(IBinder iBinder) {
            this.a = iBinder;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.a;
        }

        @Override // com.ingenic.iwds.remotewakelock.IRemoteWakeLockCallback
        public void performAcquireResult(int i, int i2, long j) {
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken("com.ingenic.iwds.remotewakelock.IRemoteWakeLockCallback");
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(i2);
            parcelObtain.writeLong(j);
            try {
                this.a.transact(1, parcelObtain, null, 0);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
            parcelObtain.recycle();
        }

        @Override // com.ingenic.iwds.remotewakelock.IRemoteWakeLockCallback
        public void performAvailableChanged(boolean z) {
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken("com.ingenic.iwds.remotewakelock.IRemoteWakeLockCallback");
            parcelObtain.writeInt(z ? 1 : 0);
            try {
                this.a.transact(2, parcelObtain, null, 0);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
            parcelObtain.recycle();
        }
    }

    public static abstract class Stub extends Binder implements IRemoteWakeLockCallback {
        public static IRemoteWakeLockCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IRemoteWakeLockCallback iRemoteWakeLockCallback = (IRemoteWakeLockCallback) iBinder.queryLocalInterface("com.ingenic.iwds.remotewakelock.IRemoteWakeLockCallback");
            return iRemoteWakeLockCallback != null ? iRemoteWakeLockCallback : new RemoteWakeLockCallbackPorxy(iBinder);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("com.ingenic.iwds.remotewakelock.IRemoteWakeLockCallback");
                performAcquireResult(parcel.readInt(), parcel.readInt(), parcel.readLong());
                return true;
            }
            if (i != 2) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel.enforceInterface("com.ingenic.iwds.remotewakelock.IRemoteWakeLockCallback");
            performAvailableChanged(parcel.readInt() != 0);
            return true;
        }
    }

    void performAcquireResult(int i, int i2, long j);

    void performAvailableChanged(boolean z);
}
