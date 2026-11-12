package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes8.dex */
public interface bv7 extends IInterface {

    public static abstract class a extends Binder implements bv7 {
        static final int TRANSACTION_onCanceled = 2;
        static final int TRANSACTION_onConfirm = 1;

        /* JADX INFO: renamed from: bv7$a$a, reason: collision with other inner class name */
        public static class C0100a implements bv7 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f4634a;

            public C0100a(IBinder iBinder) {
                this.f4634a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f4634a;
            }

            @Override // defpackage.bv7
            public void onCanceled() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.eco.device.manager.remote.EcoOOBCallback");
                    this.f4634a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.bv7
            public void onConfirm() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.eco.device.manager.remote.EcoOOBCallback");
                    this.f4634a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "com.xiaomi.fitness.eco.device.manager.remote.EcoOOBCallback");
        }

        public static bv7 asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.fitness.eco.device.manager.remote.EcoOOBCallback");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof bv7)) ? new C0100a(iBinder) : (bv7) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.xiaomi.fitness.eco.device.manager.remote.EcoOOBCallback");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.xiaomi.fitness.eco.device.manager.remote.EcoOOBCallback");
                return true;
            }
            if (i == 1) {
                onConfirm();
                parcel2.writeNoException();
            } else {
                if (i != 2) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                onCanceled();
                parcel2.writeNoException();
            }
            return true;
        }
    }

    void onCanceled() throws RemoteException;

    void onConfirm() throws RemoteException;
}
