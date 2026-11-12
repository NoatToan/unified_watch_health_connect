package com.xiaomi.fitness.device.manager;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.xiaomi.fitness.device.manager.remote.DeviceModelRemote;

/* JADX INFO: loaded from: classes8.dex */
public interface d extends IInterface {

    public static abstract class a extends Binder implements d {
        static final int TRANSACTION_predicate = 1;

        /* JADX INFO: renamed from: com.xiaomi.fitness.device.manager.d$a$a, reason: collision with other inner class name */
        public static class C0423a implements d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f11905a;

            public C0423a(IBinder iBinder) {
                this.f11905a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f11905a;
            }

            @Override // com.xiaomi.fitness.device.manager.d
            public boolean predicate(DeviceModelRemote deviceModelRemote) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.device.manager.DeviceModelPredicate");
                    b.d(parcelObtain, deviceModelRemote, 0);
                    this.f11905a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "com.xiaomi.fitness.device.manager.DeviceModelPredicate");
        }

        public static d asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.fitness.device.manager.DeviceModelPredicate");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof d)) ? new C0423a(iBinder) : (d) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.xiaomi.fitness.device.manager.DeviceModelPredicate");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.xiaomi.fitness.device.manager.DeviceModelPredicate");
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            boolean zPredicate = predicate((DeviceModelRemote) b.c(parcel, DeviceModelRemote.CREATOR));
            parcel2.writeNoException();
            parcel2.writeInt(zPredicate ? 1 : 0);
            return true;
        }
    }

    public static class b {
        public static <T> T c(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        public static <T extends Parcelable> void d(Parcel parcel, T t, int i) {
            if (t == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
            }
        }
    }

    boolean predicate(DeviceModelRemote deviceModelRemote) throws RemoteException;
}
