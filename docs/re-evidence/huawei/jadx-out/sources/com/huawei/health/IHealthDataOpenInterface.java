package com.huawei.health;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public interface IHealthDataOpenInterface extends IInterface {
    public static final String DESCRIPTOR = "com.huawei.health.IHealthDataOpenInterface";

    void getHealthData(long j, long j2, IBaseCommonCallback iBaseCommonCallback) throws RemoteException;

    public static abstract class Stub extends Binder implements IHealthDataOpenInterface {
        static final int TRANSACTION_getHealthData = 1;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, IHealthDataOpenInterface.DESCRIPTOR);
        }

        public static IHealthDataOpenInterface asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IHealthDataOpenInterface.DESCRIPTOR);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof IHealthDataOpenInterface)) {
                return (IHealthDataOpenInterface) iInterfaceQueryLocalInterface;
            }
            return new d(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IHealthDataOpenInterface.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IHealthDataOpenInterface.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                getHealthData(parcel.readLong(), parcel.readLong(), IBaseCommonCallback.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            }
            return super.onTransact(i, parcel, parcel2, i2);
        }

        static class d implements IHealthDataOpenInterface {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private IBinder f6122a;

            d(IBinder iBinder) {
                this.f6122a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f6122a;
            }

            @Override // com.huawei.health.IHealthDataOpenInterface
            public void getHealthData(long j, long j2, IBaseCommonCallback iBaseCommonCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHealthDataOpenInterface.DESCRIPTOR);
                    parcelObtain.writeLong(j);
                    parcelObtain.writeLong(j2);
                    parcelObtain.writeStrongInterface(iBaseCommonCallback);
                    this.f6122a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }
    }
}
