package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.xiaomi.xms.wearable.Status;

/* JADX INFO: loaded from: classes2.dex */
public interface r0d extends IInterface {

    public static abstract class a extends Binder implements r0d {

        /* JADX INFO: renamed from: r0d$a$a, reason: collision with other inner class name */
        public static class C1094a implements r0d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f32047a;

            public C1094a(IBinder iBinder) {
                this.f32047a = iBinder;
            }

            @Override // defpackage.r0d
            public void V4(Status status) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.xms.wearable.node.IWearAppLaunchedCallback");
                    b.b(parcelObtain, status, 0);
                    this.f32047a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f32047a;
            }
        }

        public static r0d s2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.xms.wearable.node.IWearAppLaunchedCallback");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof r0d)) ? new C1094a(iBinder) : (r0d) iInterfaceQueryLocalInterface;
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

    void V4(Status status) throws RemoteException;
}
