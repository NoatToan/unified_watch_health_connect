package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes10.dex */
public interface hy7 extends IInterface {

    public static abstract class a extends Binder implements hy7 {
        static final int TRANSACTION_onFinishSport = 4;
        static final int TRANSACTION_onPauseSport = 2;
        static final int TRANSACTION_onRestartSport = 3;
        static final int TRANSACTION_onStartSport = 1;

        /* JADX INFO: renamed from: hy7$a$a, reason: collision with other inner class name */
        public static class C0960a implements hy7 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f20604a;

            public C0960a(IBinder iBinder) {
                this.f20604a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f20604a;
            }

            @Override // defpackage.hy7
            public void onFinishSport() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_eco_manager_export.keep_alive.EcoSportKeepAliveListener");
                    this.f20604a.transact(4, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.hy7
            public void onPauseSport() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_eco_manager_export.keep_alive.EcoSportKeepAliveListener");
                    this.f20604a.transact(2, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.hy7
            public void onRestartSport() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_eco_manager_export.keep_alive.EcoSportKeepAliveListener");
                    this.f20604a.transact(3, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.hy7
            public void onStartSport() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_eco_manager_export.keep_alive.EcoSportKeepAliveListener");
                    this.f20604a.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "com.xiaomi.fitness.sport_eco_manager_export.keep_alive.EcoSportKeepAliveListener");
        }

        public static hy7 asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.fitness.sport_eco_manager_export.keep_alive.EcoSportKeepAliveListener");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof hy7)) ? new C0960a(iBinder) : (hy7) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.xiaomi.fitness.sport_eco_manager_export.keep_alive.EcoSportKeepAliveListener");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.xiaomi.fitness.sport_eco_manager_export.keep_alive.EcoSportKeepAliveListener");
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
