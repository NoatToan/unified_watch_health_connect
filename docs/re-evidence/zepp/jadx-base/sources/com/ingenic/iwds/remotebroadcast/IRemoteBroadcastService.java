package com.ingenic.iwds.remotebroadcast;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes18.dex */
interface IRemoteBroadcastService extends IInterface {

    public static class RemoteBroadcastServiceProxy implements IRemoteBroadcastService {
        private IBinder a;

        public RemoteBroadcastServiceProxy(IBinder iBinder) {
            this.a = iBinder;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.a;
        }

        @Override // com.ingenic.iwds.remotebroadcast.IRemoteBroadcastService
        public int registerRemoteBroadcastCallback(IRemoteBroadcastCallback iRemoteBroadcastCallback) {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            parcelObtain.writeInterfaceToken("com.ingenic.iwds.remotebroadcast.IRemoteBroadcastService");
            parcelObtain.writeStrongBinder(iRemoteBroadcastCallback != null ? iRemoteBroadcastCallback.asBinder() : null);
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

        @Override // com.ingenic.iwds.remotebroadcast.IRemoteBroadcastService
        public void registerRemoteReceiver(int i, int i2, IntentFilter intentFilter, String str) {
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken("com.ingenic.iwds.remotebroadcast.IRemoteBroadcastService");
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(i2);
            if (intentFilter != null) {
                parcelObtain.writeInt(1);
                intentFilter.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            parcelObtain.writeString(str);
            try {
                this.a.transact(3, parcelObtain, null, 0);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
            parcelObtain.recycle();
        }

        @Override // com.ingenic.iwds.remotebroadcast.IRemoteBroadcastService
        public void sendRemoteBroadcast(int i, Intent intent, String str) {
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken("com.ingenic.iwds.remotebroadcast.IRemoteBroadcastService");
            parcelObtain.writeInt(i);
            if (intent != null) {
                parcelObtain.writeInt(1);
                intent.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            parcelObtain.writeString(str);
            try {
                this.a.transact(5, parcelObtain, null, 0);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
            parcelObtain.recycle();
        }

        @Override // com.ingenic.iwds.remotebroadcast.IRemoteBroadcastService
        public void unregisterRemoteBroadcastCallback(int i) {
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken("com.ingenic.iwds.remotebroadcast.IRemoteBroadcastService");
            parcelObtain.writeInt(i);
            try {
                this.a.transact(2, parcelObtain, null, 0);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
            parcelObtain.recycle();
        }

        @Override // com.ingenic.iwds.remotebroadcast.IRemoteBroadcastService
        public void unregisterRemoteReceiver(int i, int i2) {
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken("com.ingenic.iwds.remotebroadcast.IRemoteBroadcastService");
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(i2);
            try {
                this.a.transact(4, parcelObtain, null, 0);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
            parcelObtain.recycle();
        }
    }

    public static abstract class Stub extends Binder implements IRemoteBroadcastService {
        public static IRemoteBroadcastService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IRemoteBroadcastService iRemoteBroadcastService = (IRemoteBroadcastService) iBinder.queryLocalInterface("com.ingenic.iwds.remotebroadcast.IRemoteBroadcastService");
            return iRemoteBroadcastService != null ? iRemoteBroadcastService : new RemoteBroadcastServiceProxy(iBinder);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("com.ingenic.iwds.remotebroadcast.IRemoteBroadcastService");
                int iRegisterRemoteBroadcastCallback = registerRemoteBroadcastCallback(IRemoteBroadcastCallback.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                parcel2.writeInt(iRegisterRemoteBroadcastCallback);
                return true;
            }
            if (i == 2) {
                parcel.enforceInterface("com.ingenic.iwds.remotebroadcast.IRemoteBroadcastService");
                unregisterRemoteBroadcastCallback(parcel.readInt());
                return true;
            }
            if (i == 3) {
                parcel.enforceInterface("com.ingenic.iwds.remotebroadcast.IRemoteBroadcastService");
                registerRemoteReceiver(parcel.readInt(), parcel.readInt(), parcel.readInt() != 0 ? (IntentFilter) IntentFilter.CREATOR.createFromParcel(parcel) : null, parcel.readString());
                return true;
            }
            if (i == 4) {
                parcel.enforceInterface("com.ingenic.iwds.remotebroadcast.IRemoteBroadcastService");
                unregisterRemoteReceiver(parcel.readInt(), parcel.readInt());
                return true;
            }
            if (i != 5) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel.enforceInterface("com.ingenic.iwds.remotebroadcast.IRemoteBroadcastService");
            sendRemoteBroadcast(parcel.readInt(), parcel.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(parcel) : null, parcel.readString());
            return true;
        }
    }

    int registerRemoteBroadcastCallback(IRemoteBroadcastCallback iRemoteBroadcastCallback);

    void registerRemoteReceiver(int i, int i2, IntentFilter intentFilter, String str);

    void sendRemoteBroadcast(int i, Intent intent, String str);

    void unregisterRemoteBroadcastCallback(int i);

    void unregisterRemoteReceiver(int i, int i2);
}
