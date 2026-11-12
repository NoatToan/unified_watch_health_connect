package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.chinatelecom.multisimservice.model.SmartWearServiceInfo;

/* JADX INFO: loaded from: classes4.dex */
public interface pyc extends IInterface {

    public static abstract class a extends Binder implements pyc {

        /* JADX INFO: renamed from: pyc$a$a, reason: collision with other inner class name */
        public static class C1082a implements pyc {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f30894a;

            public C1082a(IBinder iBinder) {
                this.f30894a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f30894a;
            }

            @Override // defpackage.pyc
            public void p(SmartWearServiceInfo smartWearServiceInfo) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.chinatelecom.multisimservice.model.ISmartWearServiceInfoCallback");
                    b.b(parcelObtain, smartWearServiceInfo, 0);
                    this.f30894a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public static pyc s2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.chinatelecom.multisimservice.model.ISmartWearServiceInfoCallback");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof pyc)) ? new C1082a(iBinder) : (pyc) iInterfaceQueryLocalInterface;
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

    void p(SmartWearServiceInfo smartWearServiceInfo) throws RemoteException;
}
