package com.huawei.hwsmartinteractmgr;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.huawei.hwsmartinteractmgr.data.SmartMsgDbObject;

/* JADX INFO: loaded from: classes2.dex */
public interface ISmartMsgReadResultListener extends IInterface {
    public static final String DESCRIPTOR = "com.huawei.hwsmartinteractmgr.ISmartMsgReadResultListener";

    void onResult(int i, SmartMsgDbObject smartMsgDbObject) throws RemoteException;

    public static abstract class Stub extends Binder implements ISmartMsgReadResultListener {
        static final int TRANSACTION_onResult = 1;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, ISmartMsgReadResultListener.DESCRIPTOR);
        }

        public static ISmartMsgReadResultListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(ISmartMsgReadResultListener.DESCRIPTOR);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof ISmartMsgReadResultListener)) {
                return (ISmartMsgReadResultListener) iInterfaceQueryLocalInterface;
            }
            return new c(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(ISmartMsgReadResultListener.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(ISmartMsgReadResultListener.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                onResult(parcel.readInt(), (SmartMsgDbObject) e.b(parcel, SmartMsgDbObject.CREATOR));
                parcel2.writeNoException();
                return true;
            }
            return super.onTransact(i, parcel, parcel2, i2);
        }

        /* JADX INFO: loaded from: classes11.dex */
        static class c implements ISmartMsgReadResultListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private IBinder f17705a;

            c(IBinder iBinder) {
                this.f17705a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f17705a;
            }

            @Override // com.huawei.hwsmartinteractmgr.ISmartMsgReadResultListener
            public void onResult(int i, SmartMsgDbObject smartMsgDbObject) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ISmartMsgReadResultListener.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    e.e(parcelObtain, smartMsgDbObject, 0);
                    this.f17705a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }
    }

    /* JADX INFO: loaded from: classes11.dex */
    public static class e {
        /* JADX INFO: Access modifiers changed from: private */
        public static <T> T b(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static <T extends Parcelable> void e(Parcel parcel, T t, int i) {
            if (t != null) {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
            } else {
                parcel.writeInt(0);
            }
        }
    }
}
