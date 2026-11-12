package com.huawei.hms.hmsscankit.api;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.huawei.hms.feature.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes10.dex */
public interface IRemoteCreator extends IInterface {
    public static final String DESCRIPTOR = "com.huawei.hms.hmsscankit.api.IRemoteCreator";

    /* JADX INFO: loaded from: classes34.dex */
    public static class Default implements IRemoteCreator {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.huawei.hms.hmsscankit.api.IRemoteCreator
        public IRemoteDecoderDelegate newRemoteDecoderDelegate() throws RemoteException {
            return null;
        }

        @Override // com.huawei.hms.hmsscankit.api.IRemoteCreator
        public IRemoteHmsDecoderDelegate newRemoteHmsDecoderDelegate() throws RemoteException {
            return null;
        }

        @Override // com.huawei.hms.hmsscankit.api.IRemoteCreator
        public IRemoteViewDelegate newRemoteViewDelegate(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) throws RemoteException {
            return null;
        }
    }

    public static abstract class Stub extends Binder implements IRemoteCreator {
        static final int TRANSACTION_newRemoteDecoderDelegate = 2;
        static final int TRANSACTION_newRemoteHmsDecoderDelegate = 3;
        static final int TRANSACTION_newRemoteViewDelegate = 1;

        static class Proxy implements IRemoteCreator {
            private IBinder mRemote;

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IRemoteCreator.DESCRIPTOR;
            }

            @Override // com.huawei.hms.hmsscankit.api.IRemoteCreator
            public IRemoteDecoderDelegate newRemoteDecoderDelegate() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IRemoteCreator.DESCRIPTOR);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return IRemoteDecoderDelegate.Stub.asInterface(parcelObtain2.readStrongBinder());
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hms.hmsscankit.api.IRemoteCreator
            public IRemoteHmsDecoderDelegate newRemoteHmsDecoderDelegate() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IRemoteCreator.DESCRIPTOR);
                    this.mRemote.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return IRemoteHmsDecoderDelegate.Stub.asInterface(parcelObtain2.readStrongBinder());
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hms.hmsscankit.api.IRemoteCreator
            public IRemoteViewDelegate newRemoteViewDelegate(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IRemoteCreator.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iObjectWrapper);
                    parcelObtain.writeStrongInterface(iObjectWrapper2);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return IRemoteViewDelegate.Stub.asInterface(parcelObtain2.readStrongBinder());
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IRemoteCreator.DESCRIPTOR);
        }

        public static IRemoteCreator asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IRemoteCreator.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IRemoteCreator)) ? new Proxy(iBinder) : (IRemoteCreator) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IRemoteCreator.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IRemoteCreator.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                IRemoteViewDelegate iRemoteViewDelegateNewRemoteViewDelegate = newRemoteViewDelegate(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                parcel2.writeStrongInterface(iRemoteViewDelegateNewRemoteViewDelegate);
            } else if (i == 2) {
                IRemoteDecoderDelegate iRemoteDecoderDelegateNewRemoteDecoderDelegate = newRemoteDecoderDelegate();
                parcel2.writeNoException();
                parcel2.writeStrongInterface(iRemoteDecoderDelegateNewRemoteDecoderDelegate);
            } else {
                if (i != 3) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                IRemoteHmsDecoderDelegate iRemoteHmsDecoderDelegateNewRemoteHmsDecoderDelegate = newRemoteHmsDecoderDelegate();
                parcel2.writeNoException();
                parcel2.writeStrongInterface(iRemoteHmsDecoderDelegateNewRemoteHmsDecoderDelegate);
            }
            return true;
        }
    }

    IRemoteDecoderDelegate newRemoteDecoderDelegate() throws RemoteException;

    IRemoteHmsDecoderDelegate newRemoteHmsDecoderDelegate() throws RemoteException;

    IRemoteViewDelegate newRemoteViewDelegate(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) throws RemoteException;
}
