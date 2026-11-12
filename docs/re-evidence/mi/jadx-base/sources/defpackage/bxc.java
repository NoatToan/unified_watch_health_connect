package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.mi.health_provider.data.RecentDailyDataItem;

/* JADX INFO: loaded from: classes5.dex */
public interface bxc extends IInterface {

    public static abstract class a extends Binder implements bxc {

        /* JADX INFO: renamed from: bxc$a$a, reason: collision with other inner class name */
        public static class C0102a implements bxc {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f4697a;

            public C0102a(IBinder iBinder) {
                this.f4697a = iBinder;
            }

            @Override // defpackage.bxc
            public void E0(RecentDailyDataItem recentDailyDataItem) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.mi.health_provider.listener.IRemoteHealthInfoCallback");
                    b.b(parcelObtain, recentDailyDataItem, 0);
                    this.f4697a.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f4697a;
            }
        }

        public static bxc s2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.mi.health_provider.listener.IRemoteHealthInfoCallback");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof bxc)) ? new C0102a(iBinder) : (bxc) iInterfaceQueryLocalInterface;
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

    void E0(RecentDailyDataItem recentDailyDataItem) throws RemoteException;
}
