package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes8.dex */
public interface hbk extends IInterface {

    public static abstract class a extends Binder implements hbk {
        static final int TRANSACTION_onFail = 2;
        static final int TRANSACTION_onSuccess = 1;

        /* JADX INFO: renamed from: hbk$a$a, reason: collision with other inner class name */
        public static class C0952a implements hbk {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f19911a;

            public C0952a(IBinder iBinder) {
                this.f19911a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f19911a;
            }

            @Override // defpackage.hbk
            public void onFail(int i, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.eco.device.manager.export.RefreshEcoDeviceCallback");
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str);
                    this.f19911a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.hbk
            public void onSuccess() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.eco.device.manager.export.RefreshEcoDeviceCallback");
                    this.f19911a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "com.xiaomi.fitness.eco.device.manager.export.RefreshEcoDeviceCallback");
        }

        public static hbk asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.fitness.eco.device.manager.export.RefreshEcoDeviceCallback");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof hbk)) ? new C0952a(iBinder) : (hbk) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.xiaomi.fitness.eco.device.manager.export.RefreshEcoDeviceCallback");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.xiaomi.fitness.eco.device.manager.export.RefreshEcoDeviceCallback");
                return true;
            }
            if (i == 1) {
                onSuccess();
                parcel2.writeNoException();
            } else {
                if (i != 2) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                onFail(parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
            }
            return true;
        }
    }

    void onFail(int i, String str) throws RemoteException;

    void onSuccess() throws RemoteException;
}
