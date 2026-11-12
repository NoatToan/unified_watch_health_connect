package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.xiaomi.fitness.sport_xms.data.PhoneData;

/* JADX INFO: loaded from: classes10.dex */
public interface kxc extends IInterface {

    public static abstract class a extends Binder implements kxc {

        /* JADX INFO: renamed from: kxc$a$a, reason: collision with other inner class name */
        public static class C1004a implements kxc {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f24390a;

            public C1004a(IBinder iBinder) {
                this.f24390a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f24390a;
            }

            @Override // defpackage.kxc
            public void p4(PhoneData phoneData) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_xms.listener.IRemoteSportXmsDataChangedListener");
                    b.b(parcelObtain, phoneData, 0);
                    this.f24390a.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public static kxc s2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.fitness.sport_xms.listener.IRemoteSportXmsDataChangedListener");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof kxc)) ? new C1004a(iBinder) : (kxc) iInterfaceQueryLocalInterface;
        }
    }

    public static class b {
        public static <T extends Parcelable> void b(Parcel parcel, T t, int i) {
            if (t == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
            }
        }
    }

    void p4(PhoneData phoneData) throws RemoteException;
}
