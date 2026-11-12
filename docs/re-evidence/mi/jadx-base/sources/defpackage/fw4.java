package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes7.dex */
public interface fw4 extends IInterface {

    public static abstract class a extends Binder implements fw4 {
        static final int TRANSACTION_initEngine = 1;

        /* JADX INFO: renamed from: fw4$a$a, reason: collision with other inner class name */
        public static class C0938a implements fw4 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f18313a;

            public C0938a(IBinder iBinder) {
                this.f18313a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f18313a;
            }

            @Override // defpackage.fw4
            public void initEngine() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.aivs.CourseScheduleManagerRemote");
                    this.f18313a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "com.xiaomi.fitness.aivs.CourseScheduleManagerRemote");
        }

        public static fw4 asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.fitness.aivs.CourseScheduleManagerRemote");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof fw4)) ? new C0938a(iBinder) : (fw4) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.xiaomi.fitness.aivs.CourseScheduleManagerRemote");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.xiaomi.fitness.aivs.CourseScheduleManagerRemote");
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            initEngine();
            parcel2.writeNoException();
            return true;
        }
    }

    void initEngine() throws RemoteException;
}
