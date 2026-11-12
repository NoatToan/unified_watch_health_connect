package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.xiaomi.xms.wearable.Status;

/* JADX INFO: loaded from: classes2.dex */
public interface bwc extends IInterface {

    public static abstract class a extends Binder implements bwc {

        /* JADX INFO: renamed from: bwc$a$a, reason: collision with other inner class name */
        public static class C0101a implements bwc {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f4670a;

            public C0101a(IBinder iBinder) {
                this.f4670a = iBinder;
            }

            @Override // defpackage.bwc
            public void a(Status status) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.xms.wearable.auth.IPermissionsCheckCallback");
                    b.b(parcelObtain, status, 0);
                    this.f4670a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f4670a;
            }

            @Override // defpackage.bwc
            public void p2(boolean[] zArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.xms.wearable.auth.IPermissionsCheckCallback");
                    parcelObtain.writeBooleanArray(zArr);
                    this.f4670a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public static bwc s2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.xms.wearable.auth.IPermissionsCheckCallback");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof bwc)) ? new C0101a(iBinder) : (bwc) iInterfaceQueryLocalInterface;
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

    void a(Status status) throws RemoteException;

    void p2(boolean[] zArr) throws RemoteException;
}
