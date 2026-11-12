package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.xiaomi.fitness.sport_xms.data.WearSensorData;

/* JADX INFO: loaded from: classes10.dex */
public interface lxc extends IInterface {

    public static abstract class a extends Binder implements lxc {
        static final int TRANSACTION_onSportXmsSensorDataChanged = 1;

        /* JADX INFO: renamed from: lxc$a$a, reason: collision with other inner class name */
        public static class C1011a implements lxc {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f25520a;

            public C1011a(IBinder iBinder) {
                this.f25520a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f25520a;
            }

            @Override // defpackage.lxc
            public void onSportXmsSensorDataChanged(WearSensorData wearSensorData) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_xms.listener.IRemoteSportXmsSensorDataChangedListener");
                    b.d(parcelObtain, wearSensorData, 0);
                    this.f25520a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "com.xiaomi.fitness.sport_xms.listener.IRemoteSportXmsSensorDataChangedListener");
        }

        public static lxc asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.fitness.sport_xms.listener.IRemoteSportXmsSensorDataChangedListener");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof lxc)) ? new C1011a(iBinder) : (lxc) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.xiaomi.fitness.sport_xms.listener.IRemoteSportXmsSensorDataChangedListener");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.xiaomi.fitness.sport_xms.listener.IRemoteSportXmsSensorDataChangedListener");
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            onSportXmsSensorDataChanged((WearSensorData) b.c(parcel, WearSensorData.INSTANCE));
            parcel2.writeNoException();
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

    void onSportXmsSensorDataChanged(WearSensorData wearSensorData) throws RemoteException;
}
