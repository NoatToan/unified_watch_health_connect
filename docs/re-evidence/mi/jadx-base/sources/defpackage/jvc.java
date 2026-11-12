package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.chinatelecom.multisimservice.model.MultiSimDeviceInfo;

/* JADX INFO: loaded from: classes4.dex */
public interface jvc extends IInterface {

    public static abstract class a extends Binder implements jvc {

        /* JADX INFO: renamed from: jvc$a$a, reason: collision with other inner class name */
        public static class C0985a implements jvc {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f23178a;

            public C0985a(IBinder iBinder) {
                this.f23178a = iBinder;
            }

            @Override // defpackage.jvc
            public void N0(MultiSimDeviceInfo multiSimDeviceInfo) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.chinatelecom.multisimservice.model.IOpenMultiSimCalbcak");
                    b.b(parcelObtain, multiSimDeviceInfo, 0);
                    this.f23178a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f23178a;
            }

            @Override // defpackage.jvc
            public void c(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.chinatelecom.multisimservice.model.IOpenMultiSimCalbcak");
                    parcelObtain.writeInt(i);
                    this.f23178a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public static jvc s2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.chinatelecom.multisimservice.model.IOpenMultiSimCalbcak");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof jvc)) ? new C0985a(iBinder) : (jvc) iInterfaceQueryLocalInterface;
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

    void N0(MultiSimDeviceInfo multiSimDeviceInfo) throws RemoteException;

    void c(int i) throws RemoteException;
}
