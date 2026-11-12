package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes10.dex */
public interface ew7 extends IInterface {

    public static abstract class a extends Binder implements ew7 {
        static final int TRANSACTION_call = 1;

        /* JADX INFO: renamed from: ew7$a$a, reason: collision with other inner class name */
        public static class C0929a implements ew7 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f17126a;

            public C0929a(IBinder iBinder) {
                this.f17126a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f17126a;
            }

            @Override // defpackage.ew7
            public void call(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_eco_manager_export.listener.EcoRemoteSportRequestCallback");
                    parcelObtain.writeInt(i);
                    this.f17126a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "com.xiaomi.fitness.sport_eco_manager_export.listener.EcoRemoteSportRequestCallback");
        }

        public static ew7 asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.fitness.sport_eco_manager_export.listener.EcoRemoteSportRequestCallback");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ew7)) ? new C0929a(iBinder) : (ew7) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.xiaomi.fitness.sport_eco_manager_export.listener.EcoRemoteSportRequestCallback");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.xiaomi.fitness.sport_eco_manager_export.listener.EcoRemoteSportRequestCallback");
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            call(parcel.readInt());
            parcel2.writeNoException();
            return true;
        }
    }

    void call(int i) throws RemoteException;
}
