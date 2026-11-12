package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.xiaomi.xms.wearable.Status;

/* JADX INFO: loaded from: classes2.dex */
public interface yvc extends IInterface {

    public static abstract class a extends Binder implements yvc {

        /* JADX INFO: renamed from: yvc$a$a, reason: collision with other inner class name */
        public static class C1159a implements yvc {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f40610a;

            public C1159a(IBinder iBinder) {
                this.f40610a = iBinder;
            }

            @Override // defpackage.yvc
            public void U4(boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.xms.wearable.auth.IPermissionCheckCallback");
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.f40610a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.yvc
            public void a(Status status) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.xms.wearable.auth.IPermissionCheckCallback");
                    b.b(parcelObtain, status, 0);
                    this.f40610a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f40610a;
            }
        }

        public static yvc s2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.xms.wearable.auth.IPermissionCheckCallback");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof yvc)) ? new C1159a(iBinder) : (yvc) iInterfaceQueryLocalInterface;
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

    void U4(boolean z) throws RemoteException;

    void a(Status status) throws RemoteException;
}
