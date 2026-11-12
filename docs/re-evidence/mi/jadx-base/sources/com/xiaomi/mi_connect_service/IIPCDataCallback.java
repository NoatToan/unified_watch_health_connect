package com.xiaomi.mi_connect_service;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes11.dex */
public interface IIPCDataCallback extends IInterface {

    public static class Default implements IIPCDataCallback {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.xiaomi.mi_connect_service.IIPCDataCallback
        public void onAudioData(String str, byte[] bArr, byte[] bArr2, int i) throws RemoteException {
        }

        @Override // com.xiaomi.mi_connect_service.IIPCDataCallback
        public void onVideoData(String str, byte[] bArr, byte[] bArr2, int i) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IIPCDataCallback {
        private static final String DESCRIPTOR = "com.xiaomi.mi_connect_service.IIPCDataCallback";
        static final int TRANSACTION_onAudioData = 2;
        static final int TRANSACTION_onVideoData = 1;

        public static class Proxy implements IIPCDataCallback {
            public static IIPCDataCallback sDefaultImpl;
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

            @Override // com.xiaomi.mi_connect_service.IIPCDataCallback
            public void onAudioData(String str, byte[] bArr, byte[] bArr2, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeByteArray(bArr);
                    parcelObtain.writeByteArray(bArr2);
                    parcelObtain.writeInt(i);
                    if (this.mRemote.transact(2, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onAudioData(str, bArr, bArr2, i);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.mi_connect_service.IIPCDataCallback
            public void onVideoData(String str, byte[] bArr, byte[] bArr2, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeByteArray(bArr);
                    parcelObtain.writeByteArray(bArr2);
                    parcelObtain.writeInt(i);
                    if (this.mRemote.transact(1, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onVideoData(str, bArr, bArr2, i);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IIPCDataCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IIPCDataCallback)) ? new Proxy(iBinder) : (IIPCDataCallback) iInterfaceQueryLocalInterface;
        }

        public static IIPCDataCallback getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IIPCDataCallback iIPCDataCallback) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iIPCDataCallback == null) {
                return false;
            }
            Proxy.sDefaultImpl = iIPCDataCallback;
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
                onVideoData(parcel.readString(), parcel.createByteArray(), parcel.createByteArray(), parcel.readInt());
                return true;
            }
            if (i == 2) {
                parcel.enforceInterface(DESCRIPTOR);
                onAudioData(parcel.readString(), parcel.createByteArray(), parcel.createByteArray(), parcel.readInt());
                return true;
            }
            if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel2.writeString(DESCRIPTOR);
            return true;
        }
    }

    void onAudioData(String str, byte[] bArr, byte[] bArr2, int i) throws RemoteException;

    void onVideoData(String str, byte[] bArr, byte[] bArr2, int i) throws RemoteException;
}
