package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.xiaomi.xms.wearable.Status;

/* JADX INFO: loaded from: classes2.dex */
public interface wuc extends IInterface {

    public static abstract class a extends Binder implements wuc {

        /* JADX INFO: renamed from: wuc$a$a, reason: collision with other inner class name */
        public static class C1138a implements wuc {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f38361a;

            public C1138a(IBinder iBinder) {
                this.f38361a = iBinder;
            }

            @Override // defpackage.wuc
            public void X4(Status status) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.xms.wearable.notify.INotifyCallback");
                    b.b(parcelObtain, status, 0);
                    this.f38361a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f38361a;
            }
        }

        public static wuc s2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.xms.wearable.notify.INotifyCallback");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof wuc)) ? new C1138a(iBinder) : (wuc) iInterfaceQueryLocalInterface;
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

    void X4(Status status) throws RemoteException;
}
