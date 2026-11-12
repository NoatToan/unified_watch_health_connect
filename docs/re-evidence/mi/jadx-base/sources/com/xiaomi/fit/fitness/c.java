package com.xiaomi.fit.fitness;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes7.dex */
public interface c extends IInterface {

    public static abstract class a extends Binder implements c {
        static final int TRANSACTION_onResult = 1;

        /* JADX INFO: renamed from: com.xiaomi.fit.fitness.c$a$a, reason: collision with other inner class name */
        public static class C0365a implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f11305a;

            public C0365a(IBinder iBinder) {
                this.f11305a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f11305a;
            }

            @Override // com.xiaomi.fit.fitness.c
            public void onResult(int i, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fit.fitness.TrainingPlanRemoteCallback");
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str);
                    this.f11305a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "com.xiaomi.fit.fitness.TrainingPlanRemoteCallback");
        }

        public static c asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.fit.fitness.TrainingPlanRemoteCallback");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof c)) ? new C0365a(iBinder) : (c) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.xiaomi.fit.fitness.TrainingPlanRemoteCallback");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.xiaomi.fit.fitness.TrainingPlanRemoteCallback");
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            onResult(parcel.readInt(), parcel.readString());
            parcel2.writeNoException();
            return true;
        }
    }

    void onResult(int i, String str) throws RemoteException;
}
