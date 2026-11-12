package com.huawei.hwotamanager;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes11.dex */
public interface IUpgradeStatusCallBack extends IInterface {
    public static final String DESCRIPTOR = "com.huawei.hwotamanager.IUpgradeStatusCallBack";

    void onStatus(String str, String str2) throws RemoteException;

    public static abstract class Stub extends Binder implements IUpgradeStatusCallBack {
        static final int TRANSACTION_onStatus = 1;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, IUpgradeStatusCallBack.DESCRIPTOR);
        }

        public static IUpgradeStatusCallBack asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IUpgradeStatusCallBack.DESCRIPTOR);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof IUpgradeStatusCallBack)) {
                return (IUpgradeStatusCallBack) iInterfaceQueryLocalInterface;
            }
            return new c(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IUpgradeStatusCallBack.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IUpgradeStatusCallBack.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                onStatus(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            }
            return super.onTransact(i, parcel, parcel2, i2);
        }

        static class c implements IUpgradeStatusCallBack {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private IBinder f17662b;

            c(IBinder iBinder) {
                this.f17662b = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f17662b;
            }

            @Override // com.huawei.hwotamanager.IUpgradeStatusCallBack
            public void onStatus(String str, String str2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IUpgradeStatusCallBack.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    this.f17662b.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }
    }
}
