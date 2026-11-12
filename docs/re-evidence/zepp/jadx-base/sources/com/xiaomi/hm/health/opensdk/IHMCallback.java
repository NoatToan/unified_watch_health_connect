package com.xiaomi.hm.health.opensdk;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes21.dex */
public interface IHMCallback extends IInterface {
    public static final String DESCRIPTOR = "com.xiaomi.hm.health.opensdk.IHMCallback";

    public static class Default implements IHMCallback {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.xiaomi.hm.health.opensdk.IHMCallback
        public void onProgress(int progress) throws RemoteException {
        }

        @Override // com.xiaomi.hm.health.opensdk.IHMCallback
        public void onStart() throws RemoteException {
        }

        @Override // com.xiaomi.hm.health.opensdk.IHMCallback
        public void onStop(int result) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IHMCallback {
        public static final int a = 1;
        public static final int b = 2;
        public static final int c = 3;

        public static class a implements IHMCallback {
            public static IHMCallback b;
            private IBinder a;

            public a(IBinder remote) {
                this.a = remote;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.a;
            }

            public String d() {
                return IHMCallback.DESCRIPTOR;
            }

            @Override // com.xiaomi.hm.health.opensdk.IHMCallback
            public void onProgress(int progress) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHMCallback.DESCRIPTOR);
                    parcelObtain.writeInt(progress);
                    if (this.a.transact(2, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onProgress(progress);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.hm.health.opensdk.IHMCallback
            public void onStart() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHMCallback.DESCRIPTOR);
                    if (this.a.transact(1, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onStart();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.hm.health.opensdk.IHMCallback
            public void onStop(int result) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHMCallback.DESCRIPTOR);
                    parcelObtain.writeInt(result);
                    if (this.a.transact(3, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onStop(result);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IHMCallback.DESCRIPTOR);
        }

        public static IHMCallback asInterface(IBinder obj) {
            if (obj == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = obj.queryLocalInterface(IHMCallback.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IHMCallback)) ? new a(obj) : (IHMCallback) iInterfaceQueryLocalInterface;
        }

        public static IHMCallback getDefaultImpl() {
            return a.b;
        }

        public static boolean setDefaultImpl(IHMCallback impl) {
            if (a.b != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (impl == null) {
                return false;
            }
            a.b = impl;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            if (code == 1598968902) {
                reply.writeString(IHMCallback.DESCRIPTOR);
                return true;
            }
            if (code == 1) {
                data.enforceInterface(IHMCallback.DESCRIPTOR);
                onStart();
                reply.writeNoException();
                return true;
            }
            if (code == 2) {
                data.enforceInterface(IHMCallback.DESCRIPTOR);
                onProgress(data.readInt());
                reply.writeNoException();
                return true;
            }
            if (code != 3) {
                return super.onTransact(code, data, reply, flags);
            }
            data.enforceInterface(IHMCallback.DESCRIPTOR);
            onStop(data.readInt());
            reply.writeNoException();
            return true;
        }
    }

    void onProgress(int progress) throws RemoteException;

    void onStart() throws RemoteException;

    void onStop(int result) throws RemoteException;
}
