package com.huawei.hihealth;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface IDataReadResultListenerOhos extends IInterface {
    public static final String DESCRIPTOR = "com.huawei.hihealth.IDataReadResultListenerOhos";

    public static class Default implements IDataReadResultListenerOhos {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.huawei.hihealth.IDataReadResultListenerOhos
        public void onResult(List<HiHealthKitDataOhos> list, int i, int i2) throws RemoteException {
        }
    }

    void onResult(List<HiHealthKitDataOhos> list, int i, int i2) throws RemoteException;

    public static abstract class Stub extends Binder implements IDataReadResultListenerOhos {
        static final int TRANSACTION_onResult = 1;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, IDataReadResultListenerOhos.DESCRIPTOR);
        }

        public static IDataReadResultListenerOhos asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IDataReadResultListenerOhos.DESCRIPTOR);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof IDataReadResultListenerOhos)) {
                return (IDataReadResultListenerOhos) iInterfaceQueryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IDataReadResultListenerOhos.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IDataReadResultListenerOhos.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                onResult(parcel.createTypedArrayList(HiHealthKitDataOhos.CREATOR), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            }
            return super.onTransact(i, parcel, parcel2, i2);
        }

        static class Proxy implements IDataReadResultListenerOhos {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private IBinder f12017c;

            Proxy(IBinder iBinder) {
                this.f12017c = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f12017c;
            }

            @Override // com.huawei.hihealth.IDataReadResultListenerOhos
            public void onResult(List<HiHealthKitDataOhos> list, int i, int i2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDataReadResultListenerOhos.DESCRIPTOR);
                    _Parcel.c(parcelObtain, list, 0);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    this.f12017c.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }
    }

    public static class _Parcel {
        private static <T extends Parcelable> void c(Parcel parcel, T t, int i) {
            if (t != null) {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
            } else {
                parcel.writeInt(0);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static <T extends Parcelable> void c(Parcel parcel, List<T> list, int i) {
            if (list == null) {
                parcel.writeInt(-1);
                return;
            }
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                c(parcel, list.get(i2), i);
            }
        }
    }
}
