package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.cmcc.server.model.MultiSimDeviceInfo;

/* JADX INFO: loaded from: classes4.dex */
public interface kvc extends IInterface {

    public static abstract class a extends Binder implements kvc {

        /* JADX INFO: renamed from: kvc$a$a, reason: collision with other inner class name */
        public static class C1003a implements kvc {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f24333a;

            public C1003a(IBinder iBinder) {
                this.f24333a = iBinder;
            }

            @Override // defpackage.kvc
            public void J4(MultiSimDeviceInfo multiSimDeviceInfo) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.cmcc.server.model.IOpenMultiSimCallback");
                    b.b(parcelObtain, multiSimDeviceInfo, 0);
                    this.f24333a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f24333a;
            }

            @Override // defpackage.kvc
            public void c(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.cmcc.server.model.IOpenMultiSimCallback");
                    parcelObtain.writeInt(i);
                    this.f24333a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public static kvc s2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.cmcc.server.model.IOpenMultiSimCallback");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof kvc)) ? new C1003a(iBinder) : (kvc) iInterfaceQueryLocalInterface;
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

    void J4(MultiSimDeviceInfo multiSimDeviceInfo) throws RemoteException;

    void c(int i) throws RemoteException;
}
