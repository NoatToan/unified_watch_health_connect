package com.xiaomi.fitness.eco.device.manager;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.xiaomi.fitness.eco.device.manager.remote.EcoDeviceModelRemote;

/* JADX INFO: loaded from: classes8.dex */
public interface b extends IInterface {

    public static abstract class a extends Binder implements b {
        static final int TRANSACTION_predicate = 1;

        /* JADX INFO: renamed from: com.xiaomi.fitness.eco.device.manager.b$a$a, reason: collision with other inner class name */
        public static class C0551a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f12077a;

            public C0551a(IBinder iBinder) {
                this.f12077a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f12077a;
            }

            @Override // com.xiaomi.fitness.eco.device.manager.b
            public boolean predicate(EcoDeviceModelRemote ecoDeviceModelRemote) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.eco.device.manager.EcoDeviceModelPredicate");
                    C0552b.d(parcelObtain, ecoDeviceModelRemote, 0);
                    this.f12077a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "com.xiaomi.fitness.eco.device.manager.EcoDeviceModelPredicate");
        }

        public static b asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.fitness.eco.device.manager.EcoDeviceModelPredicate");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof b)) ? new C0551a(iBinder) : (b) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.xiaomi.fitness.eco.device.manager.EcoDeviceModelPredicate");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.xiaomi.fitness.eco.device.manager.EcoDeviceModelPredicate");
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            boolean zPredicate = predicate((EcoDeviceModelRemote) C0552b.c(parcel, EcoDeviceModelRemote.CREATOR));
            parcel2.writeNoException();
            parcel2.writeInt(zPredicate ? 1 : 0);
            return true;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.eco.device.manager.b$b, reason: collision with other inner class name */
    public static class C0552b {
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

    boolean predicate(EcoDeviceModelRemote ecoDeviceModelRemote) throws RemoteException;
}
