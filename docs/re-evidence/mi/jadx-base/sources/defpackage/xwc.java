package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.xiaomi.fitness.sport_xms.data.CourseVipInfo;

/* JADX INFO: loaded from: classes10.dex */
public interface xwc extends IInterface {

    public static abstract class a extends Binder implements xwc {

        /* JADX INFO: renamed from: xwc$a$a, reason: collision with other inner class name */
        public static class C1152a implements xwc {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f39531a;

            public C1152a(IBinder iBinder) {
                this.f39531a = iBinder;
            }

            @Override // defpackage.xwc
            public void Z1(CourseVipInfo courseVipInfo) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_xms.listener.IRemoteCourseVipInfoListener");
                    b.b(parcelObtain, courseVipInfo, 0);
                    this.f39531a.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f39531a;
            }
        }

        public static xwc s2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.fitness.sport_xms.listener.IRemoteCourseVipInfoListener");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof xwc)) ? new C1152a(iBinder) : (xwc) iInterfaceQueryLocalInterface;
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

    void Z1(CourseVipInfo courseVipInfo) throws RemoteException;
}
