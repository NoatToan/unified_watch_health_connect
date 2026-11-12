package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.xiaomi.fitness.sport_xms.data.UserInfo;

/* JADX INFO: loaded from: classes10.dex */
public interface nxc extends IInterface {

    public static abstract class a extends Binder implements nxc {

        /* JADX INFO: renamed from: nxc$a$a, reason: collision with other inner class name */
        public static class C1059a implements nxc {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f28540a;

            public C1059a(IBinder iBinder) {
                this.f28540a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f28540a;
            }

            @Override // defpackage.nxc
            public void r(UserInfo userInfo) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_xms.listener.IRemoteUserInfoListener");
                    b.b(parcelObtain, userInfo, 0);
                    this.f28540a.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public static nxc s2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.fitness.sport_xms.listener.IRemoteUserInfoListener");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof nxc)) ? new C1059a(iBinder) : (nxc) iInterfaceQueryLocalInterface;
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

    void r(UserInfo userInfo) throws RemoteException;
}
