package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.xiaomi.fitness.sport_eco_manager_export.data.EcoSportWrapper;

/* JADX INFO: loaded from: classes10.dex */
public interface dsc extends IInterface {

    public static abstract class a extends Binder implements dsc {
        static final int TRANSACTION_onPhoneDataChanged = 1;

        /* JADX INFO: renamed from: dsc$a$a, reason: collision with other inner class name */
        public static class C0915a implements dsc {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f15884a;

            public C0915a(IBinder iBinder) {
                this.f15884a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f15884a;
            }

            @Override // defpackage.dsc
            public void onPhoneDataChanged(EcoSportWrapper ecoSportWrapper) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_eco_manager_export.listener.IEcoRemoteDataChangedListener");
                    b.d(parcelObtain, ecoSportWrapper, 0);
                    this.f15884a.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "com.xiaomi.fitness.sport_eco_manager_export.listener.IEcoRemoteDataChangedListener");
        }

        public static dsc asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.fitness.sport_eco_manager_export.listener.IEcoRemoteDataChangedListener");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof dsc)) ? new C0915a(iBinder) : (dsc) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.xiaomi.fitness.sport_eco_manager_export.listener.IEcoRemoteDataChangedListener");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.xiaomi.fitness.sport_eco_manager_export.listener.IEcoRemoteDataChangedListener");
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            onPhoneDataChanged((EcoSportWrapper) b.c(parcel, EcoSportWrapper.INSTANCE));
            return true;
        }
    }

    public static class b {
        public static <T> T c(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        public static <T extends Parcelable> void d(Parcel parcel, T t, int i) {
            if (t == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
            }
        }
    }

    void onPhoneDataChanged(EcoSportWrapper ecoSportWrapper) throws RemoteException;
}
