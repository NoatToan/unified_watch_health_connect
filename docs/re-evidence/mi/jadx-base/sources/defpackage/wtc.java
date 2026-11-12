package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.xiaomi.xms.wearable.Status;

/* JADX INFO: loaded from: classes2.dex */
public interface wtc extends IInterface {

    public static abstract class a extends Binder implements wtc {

        /* JADX INFO: renamed from: wtc$a$a, reason: collision with other inner class name */
        public static class C1137a implements wtc {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f38338a;

            public C1137a(IBinder iBinder) {
                this.f38338a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f38338a;
            }

            @Override // defpackage.wtc
            public void t3(Status status) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.xms.wearable.message.IMessageCallback");
                    b.b(parcelObtain, status, 0);
                    this.f38338a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public static wtc s2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.xms.wearable.message.IMessageCallback");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof wtc)) ? new C1137a(iBinder) : (wtc) iInterfaceQueryLocalInterface;
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

    void t3(Status status) throws RemoteException;
}
