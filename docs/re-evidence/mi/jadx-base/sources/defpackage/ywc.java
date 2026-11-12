package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.xiaomi.fitness.sport_manager_export.data.SportWrapper;

/* JADX INFO: loaded from: classes10.dex */
public interface ywc extends IInterface {

    public static abstract class a extends Binder implements ywc {
        static final int TRANSACTION_onLocationChanged = 2;
        static final int TRANSACTION_onPhoneDataChanged = 1;

        /* JADX INFO: renamed from: ywc$a$a, reason: collision with other inner class name */
        public static class C1160a implements ywc {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f40638a;

            public C1160a(IBinder iBinder) {
                this.f40638a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f40638a;
            }

            @Override // defpackage.ywc
            public void onLocationChanged(SportWrapper sportWrapper) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_manager_export.listener.IRemoteDataChangedListener");
                    b.d(parcelObtain, sportWrapper, 0);
                    this.f40638a.transact(2, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.ywc
            public void onPhoneDataChanged(SportWrapper sportWrapper) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_manager_export.listener.IRemoteDataChangedListener");
                    b.d(parcelObtain, sportWrapper, 0);
                    this.f40638a.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "com.xiaomi.fitness.sport_manager_export.listener.IRemoteDataChangedListener");
        }

        public static ywc asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.fitness.sport_manager_export.listener.IRemoteDataChangedListener");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ywc)) ? new C1160a(iBinder) : (ywc) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.xiaomi.fitness.sport_manager_export.listener.IRemoteDataChangedListener");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.xiaomi.fitness.sport_manager_export.listener.IRemoteDataChangedListener");
                return true;
            }
            if (i == 1) {
                onPhoneDataChanged((SportWrapper) b.c(parcel, SportWrapper.INSTANCE));
            } else {
                if (i != 2) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                onLocationChanged((SportWrapper) b.c(parcel, SportWrapper.INSTANCE));
            }
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

    void onLocationChanged(SportWrapper sportWrapper) throws RemoteException;

    void onPhoneDataChanged(SportWrapper sportWrapper) throws RemoteException;
}
