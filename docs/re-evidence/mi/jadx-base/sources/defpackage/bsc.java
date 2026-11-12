package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes10.dex */
public interface bsc extends IInterface {

    public static abstract class a extends Binder implements bsc {
        static final int TRANSACTION_ecoDeviceFault = 2;
        static final int TRANSACTION_onLock = 1;
        static final int TRANSACTION_onModeSwitch = 3;

        /* JADX INFO: renamed from: bsc$a$a, reason: collision with other inner class name */
        public static class C0098a implements bsc {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f4559a;

            public C0098a(IBinder iBinder) {
                this.f4559a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f4559a;
            }

            @Override // defpackage.bsc
            public void ecoDeviceFault(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_eco_manager_export.listener.IEcoLocalReceiveListener");
                    parcelObtain.writeInt(i);
                    this.f4559a.transact(2, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.bsc
            public void onLock(boolean z, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_eco_manager_export.listener.IEcoLocalReceiveListener");
                    parcelObtain.writeInt(z ? 1 : 0);
                    parcelObtain.writeInt(i);
                    this.f4559a.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.bsc
            public void onModeSwitch(boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_eco_manager_export.listener.IEcoLocalReceiveListener");
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.f4559a.transact(3, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "com.xiaomi.fitness.sport_eco_manager_export.listener.IEcoLocalReceiveListener");
        }

        public static bsc asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.fitness.sport_eco_manager_export.listener.IEcoLocalReceiveListener");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof bsc)) ? new C0098a(iBinder) : (bsc) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.xiaomi.fitness.sport_eco_manager_export.listener.IEcoLocalReceiveListener");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.xiaomi.fitness.sport_eco_manager_export.listener.IEcoLocalReceiveListener");
                return true;
            }
            if (i == 1) {
                onLock(parcel.readInt() != 0, parcel.readInt());
            } else if (i == 2) {
                ecoDeviceFault(parcel.readInt());
            } else {
                if (i != 3) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                onModeSwitch(parcel.readInt() != 0);
            }
            return true;
        }
    }

    void ecoDeviceFault(int i) throws RemoteException;

    void onLock(boolean z, int i) throws RemoteException;

    void onModeSwitch(boolean z) throws RemoteException;
}
