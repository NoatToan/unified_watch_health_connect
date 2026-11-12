package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.xiaomi.xms.wearable.Status;

/* JADX INFO: loaded from: classes2.dex */
public interface q0d extends IInterface {

    public static abstract class a extends Binder implements q0d {

        /* JADX INFO: renamed from: q0d$a$a, reason: collision with other inner class name */
        public static class C1084a implements q0d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f30952a;

            public C1084a(IBinder iBinder) {
                this.f30952a = iBinder;
            }

            @Override // defpackage.q0d
            public void T2(boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.xms.wearable.node.IWearAppInstalledCallback");
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.f30952a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.q0d
            public void a(Status status) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.xms.wearable.node.IWearAppInstalledCallback");
                    b.b(parcelObtain, status, 0);
                    this.f30952a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f30952a;
            }
        }

        public static q0d s2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.xms.wearable.node.IWearAppInstalledCallback");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof q0d)) ? new C1084a(iBinder) : (q0d) iInterfaceQueryLocalInterface;
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

    void T2(boolean z) throws RemoteException;

    void a(Status status) throws RemoteException;
}
