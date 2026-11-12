package com.xiaomi.smarthome.core.server.internal.bluetooth.security;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.xiaomi.smarthome.core.server.bluetooth.IBleResponse;

/* JADX INFO: loaded from: classes10.dex */
public interface ISecureConnectHandler extends IInterface {

    public static class Default implements ISecureConnectHandler {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.security.ISecureConnectHandler
        public void cancel() throws RemoteException {
        }

        @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.security.ISecureConnectHandler
        public void sendCommand(int i, Bundle bundle, IBleResponse iBleResponse) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements ISecureConnectHandler {
        private static final String DESCRIPTOR = "com.xiaomi.smarthome.core.server.internal.bluetooth.security.ISecureConnectHandler";
        static final int TRANSACTION_cancel = 1;
        static final int TRANSACTION_sendCommand = 2;

        public static class Proxy implements ISecureConnectHandler {
            public static ISecureConnectHandler sDefaultImpl;
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.security.ISecureConnectHandler
            public void cancel() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (this.mRemote.transact(1, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().cancel();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.security.ISecureConnectHandler
            public void sendCommand(int i, Bundle bundle, IBleResponse iBleResponse) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    parcelObtain.writeStrongBinder(iBleResponse != null ? iBleResponse.asBinder() : null);
                    if (this.mRemote.transact(2, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().sendCommand(i, bundle, iBleResponse);
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

        public static ISecureConnectHandler asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ISecureConnectHandler)) ? new Proxy(iBinder) : (ISecureConnectHandler) iInterfaceQueryLocalInterface;
        }

        public static ISecureConnectHandler getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(ISecureConnectHandler iSecureConnectHandler) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iSecureConnectHandler == null) {
                return false;
            }
            Proxy.sDefaultImpl = iSecureConnectHandler;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                cancel();
                parcel2.writeNoException();
                return true;
            }
            if (i != 2) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
            parcel.enforceInterface(DESCRIPTOR);
            sendCommand(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, IBleResponse.Stub.asInterface(parcel.readStrongBinder()));
            parcel2.writeNoException();
            return true;
        }
    }

    void cancel() throws RemoteException;

    void sendCommand(int i, Bundle bundle, IBleResponse iBleResponse) throws RemoteException;
}
