package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes10.dex */
public interface bzc extends IInterface {

    public static abstract class a extends Binder implements bzc {
        static final int TRANSACTION_addSportDataChangedListener = 1;
        static final int TRANSACTION_addSportSensorDataChangedListener = 3;
        static final int TRANSACTION_removeSportDataChangedListener = 2;
        static final int TRANSACTION_removeSportSensorDataChangedListener = 4;

        /* JADX INFO: renamed from: bzc$a$a, reason: collision with other inner class name */
        public static class C0103a implements bzc {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f4744a;

            public C0103a(IBinder iBinder) {
                this.f4744a = iBinder;
            }

            @Override // defpackage.bzc
            public void addSportDataChangedListener(String str, ywc ywcVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteDataApi");
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongInterface(ywcVar);
                    this.f4744a.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.bzc
            public void addSportSensorDataChangedListener(String str, exc excVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteDataApi");
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongInterface(excVar);
                    this.f4744a.transact(3, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f4744a;
            }
        }

        public a() {
            attachInterface(this, "com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteDataApi");
        }

        public static bzc asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteDataApi");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof bzc)) ? new C0103a(iBinder) : (bzc) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteDataApi");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteDataApi");
                return true;
            }
            if (i == 1) {
                addSportDataChangedListener(parcel.readString(), ywc.a.asInterface(parcel.readStrongBinder()));
            } else if (i == 2) {
                removeSportDataChangedListener(parcel.readString(), ywc.a.asInterface(parcel.readStrongBinder()));
            } else if (i == 3) {
                addSportSensorDataChangedListener(parcel.readString(), exc.a.asInterface(parcel.readStrongBinder()));
            } else {
                if (i != 4) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                removeSportSensorDataChangedListener(parcel.readString(), exc.a.asInterface(parcel.readStrongBinder()));
            }
            return true;
        }
    }

    void addSportDataChangedListener(String str, ywc ywcVar) throws RemoteException;

    void addSportSensorDataChangedListener(String str, exc excVar) throws RemoteException;

    void removeSportDataChangedListener(String str, ywc ywcVar) throws RemoteException;

    void removeSportSensorDataChangedListener(String str, exc excVar) throws RemoteException;
}
