package com.ingenic.iwds.remotebroadcast;

import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes18.dex */
interface IRemoteBroadcastCallback extends IInterface {

    public static class RemoteBroadcastCallbackProxy implements IRemoteBroadcastCallback {
        private IBinder a;

        public RemoteBroadcastCallbackProxy(IBinder iBinder) {
            this.a = iBinder;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.a;
        }

        @Override // com.ingenic.iwds.remotebroadcast.IRemoteBroadcastCallback
        public void performReceive(int i, Intent intent) {
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken("com.ingenic.iwds.remotebroadcast.IRemoteBroadcastCallback");
            parcelObtain.writeInt(i);
            if (intent != null) {
                parcelObtain.writeInt(1);
                intent.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            try {
                this.a.transact(2, parcelObtain, null, 0);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
            parcelObtain.recycle();
        }

        @Override // com.ingenic.iwds.remotebroadcast.IRemoteBroadcastCallback
        public void performSendResult(Intent intent, String str, int i) {
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken("com.ingenic.iwds.remotebroadcast.IRemoteBroadcastCallback");
            if (intent != null) {
                parcelObtain.writeInt(1);
                intent.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            parcelObtain.writeString(str);
            parcelObtain.writeInt(i);
            try {
                this.a.transact(1, parcelObtain, null, 0);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
            parcelObtain.recycle();
        }
    }

    public static abstract class Stub extends Binder implements IRemoteBroadcastCallback {
        public static IRemoteBroadcastCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IRemoteBroadcastCallback iRemoteBroadcastCallback = (IRemoteBroadcastCallback) iBinder.queryLocalInterface("com.ingenic.iwds.remotebroadcast.IRemoteBroadcastCallback");
            return iRemoteBroadcastCallback != null ? iRemoteBroadcastCallback : new RemoteBroadcastCallbackProxy(iBinder);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("com.ingenic.iwds.remotebroadcast.IRemoteBroadcastCallback");
                performSendResult(parcel.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readInt());
                return true;
            }
            if (i != 2) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel.enforceInterface("com.ingenic.iwds.remotebroadcast.IRemoteBroadcastCallback");
            performReceive(parcel.readInt(), parcel.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(parcel) : null);
            return true;
        }
    }

    void performReceive(int i, Intent intent);

    void performSendResult(Intent intent, String str, int i);
}
