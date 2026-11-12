package com.ingenic.iwds.remotewakelock;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes18.dex */
interface IRemoteWakeLockService extends IInterface {

    public static class RemoteWakeLockProxy implements IRemoteWakeLockService {
        private IBinder a;

        public RemoteWakeLockProxy(IBinder iBinder) {
            this.a = iBinder;
        }

        @Override // com.ingenic.iwds.remotewakelock.IRemoteWakeLockService
        public void acquireWakeLock(int i, int i2, long j) {
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken("com.ingenic.iwds.remotewakelock.IRemoteWakeLockService");
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(i2);
            parcelObtain.writeLong(j);
            try {
                this.a.transact(5, parcelObtain, null, 0);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
            parcelObtain.recycle();
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.a;
        }

        @Override // com.ingenic.iwds.remotewakelock.IRemoteWakeLockService
        public void destroyRemoteWakeLock(int i, int i2) {
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken("com.ingenic.iwds.remotewakelock.IRemoteWakeLockService");
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(i2);
            try {
                this.a.transact(4, parcelObtain, null, 0);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
            parcelObtain.recycle();
        }

        @Override // com.ingenic.iwds.remotewakelock.IRemoteWakeLockService
        public void newRemoteWakeLock(int i, int i2, int i3, String str) {
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken("com.ingenic.iwds.remotewakelock.IRemoteWakeLockService");
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(i2);
            parcelObtain.writeInt(i3);
            parcelObtain.writeString(str);
            try {
                this.a.transact(3, parcelObtain, null, 0);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
            parcelObtain.recycle();
        }

        @Override // com.ingenic.iwds.remotewakelock.IRemoteWakeLockService
        public int registerRemoteWakeLockCallback(IRemoteWakeLockCallback iRemoteWakeLockCallback) {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            parcelObtain.writeInterfaceToken("com.ingenic.iwds.remotewakelock.IRemoteWakeLockService");
            parcelObtain.writeStrongBinder(iRemoteWakeLockCallback != null ? iRemoteWakeLockCallback.asBinder() : null);
            try {
                this.a.transact(1, parcelObtain, parcelObtain2, 0);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
            parcelObtain2.readException();
            int i = parcelObtain2.readInt();
            parcelObtain.recycle();
            parcelObtain2.recycle();
            return i;
        }

        @Override // com.ingenic.iwds.remotewakelock.IRemoteWakeLockService
        public void releaseWakeLock(int i, int i2) {
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken("com.ingenic.iwds.remotewakelock.IRemoteWakeLockService");
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(i2);
            try {
                this.a.transact(6, parcelObtain, null, 0);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
            parcelObtain.recycle();
        }

        @Override // com.ingenic.iwds.remotewakelock.IRemoteWakeLockService
        public void unregisterRemoteWakeLockCallback(int i) {
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken("com.ingenic.iwds.remotewakelock.IRemoteWakeLockService");
            parcelObtain.writeInt(i);
            try {
                this.a.transact(2, parcelObtain, null, 0);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
            parcelObtain.recycle();
        }
    }

    public static abstract class Stub extends Binder implements IRemoteWakeLockService {
        public static IRemoteWakeLockService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IRemoteWakeLockService iRemoteWakeLockService = (IRemoteWakeLockService) iBinder.queryLocalInterface("com.ingenic.iwds.remotewakelock.IRemoteWakeLockService");
            return iRemoteWakeLockService != null ? iRemoteWakeLockService : new RemoteWakeLockProxy(iBinder);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.ingenic.iwds.remotewakelock.IRemoteWakeLockService");
                    int iRegisterRemoteWakeLockCallback = registerRemoteWakeLockCallback(IRemoteWakeLockCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(iRegisterRemoteWakeLockCallback);
                    return true;
                case 2:
                    parcel.enforceInterface("com.ingenic.iwds.remotewakelock.IRemoteWakeLockService");
                    unregisterRemoteWakeLockCallback(parcel.readInt());
                    return true;
                case 3:
                    parcel.enforceInterface("com.ingenic.iwds.remotewakelock.IRemoteWakeLockService");
                    newRemoteWakeLock(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString());
                    return true;
                case 4:
                    parcel.enforceInterface("com.ingenic.iwds.remotewakelock.IRemoteWakeLockService");
                    destroyRemoteWakeLock(parcel.readInt(), parcel.readInt());
                    return true;
                case 5:
                    parcel.enforceInterface("com.ingenic.iwds.remotewakelock.IRemoteWakeLockService");
                    acquireWakeLock(parcel.readInt(), parcel.readInt(), parcel.readLong());
                    return true;
                case 6:
                    parcel.enforceInterface("com.ingenic.iwds.remotewakelock.IRemoteWakeLockService");
                    releaseWakeLock(parcel.readInt(), parcel.readInt());
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    void acquireWakeLock(int i, int i2, long j);

    void destroyRemoteWakeLock(int i, int i2);

    void newRemoteWakeLock(int i, int i2, int i3, String str);

    int registerRemoteWakeLockCallback(IRemoteWakeLockCallback iRemoteWakeLockCallback);

    void releaseWakeLock(int i, int i2);

    void unregisterRemoteWakeLockCallback(int i);
}
