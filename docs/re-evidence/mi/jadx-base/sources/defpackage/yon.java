package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes10.dex */
public interface yon extends IInterface {

    public static abstract class a extends Binder implements yon {
        static final int TRANSACTION_onFinishSport = 4;
        static final int TRANSACTION_onPauseSport = 2;
        static final int TRANSACTION_onRestartSport = 3;
        static final int TRANSACTION_onStartSport = 1;

        /* JADX INFO: renamed from: yon$a$a, reason: collision with other inner class name */
        public static class C1156a implements yon {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f40383a;

            public C1156a(IBinder iBinder) {
                this.f40383a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f40383a;
            }

            @Override // defpackage.yon
            public void onFinishSport() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_manager_export.keep_alive.SportKeepAliveListener");
                    this.f40383a.transact(4, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.yon
            public void onPauseSport() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_manager_export.keep_alive.SportKeepAliveListener");
                    this.f40383a.transact(2, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.yon
            public void onRestartSport() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_manager_export.keep_alive.SportKeepAliveListener");
                    this.f40383a.transact(3, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.yon
            public void onStartSport() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_manager_export.keep_alive.SportKeepAliveListener");
                    this.f40383a.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "com.xiaomi.fitness.sport_manager_export.keep_alive.SportKeepAliveListener");
        }

        public static yon asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.fitness.sport_manager_export.keep_alive.SportKeepAliveListener");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof yon)) ? new C1156a(iBinder) : (yon) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.xiaomi.fitness.sport_manager_export.keep_alive.SportKeepAliveListener");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.xiaomi.fitness.sport_manager_export.keep_alive.SportKeepAliveListener");
                return true;
            }
            if (i == 1) {
                onStartSport();
            } else if (i == 2) {
                onPauseSport();
            } else if (i == 3) {
                onRestartSport();
            } else {
                if (i != 4) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                onFinishSport();
            }
            return true;
        }
    }

    void onFinishSport() throws RemoteException;

    void onPauseSport() throws RemoteException;

    void onRestartSport() throws RemoteException;

    void onStartSport() throws RemoteException;
}
