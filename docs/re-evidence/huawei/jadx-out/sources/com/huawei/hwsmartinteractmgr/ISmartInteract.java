package com.huawei.hwsmartinteractmgr;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public interface ISmartInteract extends IInterface {
    public static final String DESCRIPTOR = "com.huawei.hwsmartinteractmgr.ISmartInteract";

    void checkSmartMsg(int i, ISmartMsgReadResultListener iSmartMsgReadResultListener) throws RemoteException;

    public static abstract class Stub extends Binder implements ISmartInteract {
        static final int TRANSACTION_checkSmartMsg = 1;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, ISmartInteract.DESCRIPTOR);
        }

        public static ISmartInteract asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(ISmartInteract.DESCRIPTOR);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof ISmartInteract)) {
                return (ISmartInteract) iInterfaceQueryLocalInterface;
            }
            return new d(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(ISmartInteract.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(ISmartInteract.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                checkSmartMsg(parcel.readInt(), ISmartMsgReadResultListener.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            }
            return super.onTransact(i, parcel, parcel2, i2);
        }

        /* JADX INFO: loaded from: classes11.dex */
        static class d implements ISmartInteract {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private IBinder f17704c;

            d(IBinder iBinder) {
                this.f17704c = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f17704c;
            }

            @Override // com.huawei.hwsmartinteractmgr.ISmartInteract
            public void checkSmartMsg(int i, ISmartMsgReadResultListener iSmartMsgReadResultListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ISmartInteract.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeStrongInterface(iSmartMsgReadResultListener);
                    this.f17704c.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }
    }
}
