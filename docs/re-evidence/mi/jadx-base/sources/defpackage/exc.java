package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.xiaomi.fitness.sport_manager_export.data.SportWrapper;

/* JADX INFO: loaded from: classes10.dex */
public interface exc extends IInterface {

    public static abstract class a extends Binder implements exc {
        static final int TRANSACTION_onSensorDataChanged = 1;

        /* JADX INFO: renamed from: exc$a$a, reason: collision with other inner class name */
        public static class C0930a implements exc {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f17158a;

            public C0930a(IBinder iBinder) {
                this.f17158a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f17158a;
            }

            @Override // defpackage.exc
            public void onSensorDataChanged(SportWrapper sportWrapper) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_manager_export.listener.IRemoteSensorDataChangedListener");
                    b.d(parcelObtain, sportWrapper, 0);
                    this.f17158a.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "com.xiaomi.fitness.sport_manager_export.listener.IRemoteSensorDataChangedListener");
        }

        public static exc asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.fitness.sport_manager_export.listener.IRemoteSensorDataChangedListener");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof exc)) ? new C0930a(iBinder) : (exc) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.xiaomi.fitness.sport_manager_export.listener.IRemoteSensorDataChangedListener");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.xiaomi.fitness.sport_manager_export.listener.IRemoteSensorDataChangedListener");
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            onSensorDataChanged((SportWrapper) b.c(parcel, SportWrapper.INSTANCE));
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

    void onSensorDataChanged(SportWrapper sportWrapper) throws RemoteException;
}
