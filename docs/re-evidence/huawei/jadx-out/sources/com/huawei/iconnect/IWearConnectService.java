package com.huawei.iconnect;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes40.dex */
public interface IWearConnectService extends IInterface {
    public static final String DESCRIPTOR = "com.huawei.iconnect.IWearConnectService";

    String getHuaweiPhoneIndex() throws RemoteException;

    public static abstract class Stub extends Binder implements IWearConnectService {
        static final int TRANSACTION_getHuaweiPhoneIndex = 1;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, IWearConnectService.DESCRIPTOR);
        }

        public static IWearConnectService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IWearConnectService.DESCRIPTOR);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof IWearConnectService)) {
                return (IWearConnectService) iInterfaceQueryLocalInterface;
            }
            return new d(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IWearConnectService.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IWearConnectService.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                String huaweiPhoneIndex = getHuaweiPhoneIndex();
                parcel2.writeNoException();
                parcel2.writeString(huaweiPhoneIndex);
                return true;
            }
            return super.onTransact(i, parcel, parcel2, i2);
        }

        static class d implements IWearConnectService {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private IBinder f17767b;

            d(IBinder iBinder) {
                this.f17767b = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f17767b;
            }

            @Override // com.huawei.iconnect.IWearConnectService
            public String getHuaweiPhoneIndex() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IWearConnectService.DESCRIPTOR);
                    this.f17767b.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }
    }
}
