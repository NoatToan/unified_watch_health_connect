package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes10.dex */
public interface hsc extends IInterface {

    public static abstract class a extends Binder implements hsc {
        static final int TRANSACTION_addSportDataChangedListener = 1;
        static final int TRANSACTION_removeSportDataChangedListener = 2;

        /* JADX INFO: renamed from: hsc$a$a, reason: collision with other inner class name */
        public static class C0956a implements hsc {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f20403a;

            public C0956a(IBinder iBinder) {
                this.f20403a = iBinder;
            }

            @Override // defpackage.hsc
            public void addSportDataChangedListener(String str, dsc dscVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteDataApi");
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongInterface(dscVar);
                    this.f20403a.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f20403a;
            }
        }

        public a() {
            attachInterface(this, "com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteDataApi");
        }

        public static hsc asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteDataApi");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof hsc)) ? new C0956a(iBinder) : (hsc) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteDataApi");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteDataApi");
                return true;
            }
            if (i == 1) {
                addSportDataChangedListener(parcel.readString(), dsc.a.asInterface(parcel.readStrongBinder()));
            } else {
                if (i != 2) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                removeSportDataChangedListener(parcel.readString(), dsc.a.asInterface(parcel.readStrongBinder()));
            }
            return true;
        }
    }

    void addSportDataChangedListener(String str, dsc dscVar) throws RemoteException;

    void removeSportDataChangedListener(String str, dsc dscVar) throws RemoteException;
}
