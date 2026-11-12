package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes10.dex */
public interface jxc extends IInterface {

    public static abstract class a extends Binder implements jxc {
        static final int TRANSACTION_onSync = 1;

        /* JADX INFO: renamed from: jxc$a$a, reason: collision with other inner class name */
        public static class C0987a implements jxc {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f23218a;

            public C0987a(IBinder iBinder) {
                this.f23218a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f23218a;
            }

            @Override // defpackage.jxc
            public void onSync(boolean z, boolean z2, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_manager_export.listener.IRemoteSportSyncDataListener");
                    parcelObtain.writeInt(z ? 1 : 0);
                    parcelObtain.writeInt(z2 ? 1 : 0);
                    parcelObtain.writeInt(i);
                    this.f23218a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "com.xiaomi.fitness.sport_manager_export.listener.IRemoteSportSyncDataListener");
        }

        public static jxc asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.fitness.sport_manager_export.listener.IRemoteSportSyncDataListener");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof jxc)) ? new C0987a(iBinder) : (jxc) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.xiaomi.fitness.sport_manager_export.listener.IRemoteSportSyncDataListener");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.xiaomi.fitness.sport_manager_export.listener.IRemoteSportSyncDataListener");
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
