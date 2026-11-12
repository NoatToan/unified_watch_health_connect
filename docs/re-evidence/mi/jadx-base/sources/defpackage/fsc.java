package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes10.dex */
public interface fsc extends IInterface {

    public static abstract class a extends Binder implements fsc {
        static final int TRANSACTION_onSync = 1;

        /* JADX INFO: renamed from: fsc$a$a, reason: collision with other inner class name */
        public static class C0936a implements fsc {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f18152a;

            public C0936a(IBinder iBinder) {
                this.f18152a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f18152a;
            }

            @Override // defpackage.fsc
            public void onSync(boolean z, boolean z2, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_eco_manager_export.listener.IEcoRemoteSportSyncDataListener");
                    parcelObtain.writeInt(z ? 1 : 0);
                    parcelObtain.writeInt(z2 ? 1 : 0);
                    parcelObtain.writeInt(i);
                    this.f18152a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "com.xiaomi.fitness.sport_eco_manager_export.listener.IEcoRemoteSportSyncDataListener");
        }

        public static fsc asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.fitness.sport_eco_manager_export.listener.IEcoRemoteSportSyncDataListener");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof fsc)) ? new C0936a(iBinder) : (fsc) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.xiaomi.fitness.sport_eco_manager_export.listener.IEcoRemoteSportSyncDataListener");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.xiaomi.fitness.sport_eco_manager_export.listener.IEcoRemoteSportSyncDataListener");
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            onSync(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt());
            parcel2.writeNoException();
            return true;
        }
    }

    void onSync(boolean z, boolean z2, int i) throws RemoteException;
}
