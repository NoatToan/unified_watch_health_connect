package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.xiaomi.xms.wearable.Status;
import com.xiaomi.xms.wearable.auth.Permission;

/* JADX INFO: loaded from: classes2.dex */
public interface xvc extends IInterface {

    public static abstract class a extends Binder implements xvc {

        /* JADX INFO: renamed from: xvc$a$a, reason: collision with other inner class name */
        public static class C1151a implements xvc {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f39503a;

            public C1151a(IBinder iBinder) {
                this.f39503a = iBinder;
            }

            @Override // defpackage.xvc
            public void D(Permission[] permissionArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.xms.wearable.auth.IPermissionCallback");
                    parcelObtain.writeTypedArray(permissionArr, 0);
                    this.f39503a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.xvc
            public void a(Status status) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.xms.wearable.auth.IPermissionCallback");
                    b.b(parcelObtain, status, 0);
                    this.f39503a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f39503a;
            }
        }

        public static xvc s2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.xms.wearable.auth.IPermissionCallback");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof xvc)) ? new C1151a(iBinder) : (xvc) iInterfaceQueryLocalInterface;
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

    void D(Permission[] permissionArr) throws RemoteException;

    void a(Status status) throws RemoteException;
}
