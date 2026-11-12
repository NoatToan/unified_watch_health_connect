package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.mi.health_provider.data.MedicalAidRecord;

/* JADX INFO: loaded from: classes5.dex */
public interface dxc extends IInterface {

    public static abstract class a extends Binder implements dxc {

        /* JADX INFO: renamed from: dxc$a$a, reason: collision with other inner class name */
        public static class C0917a implements dxc {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f16029a;

            public C0917a(IBinder iBinder) {
                this.f16029a = iBinder;
            }

            @Override // defpackage.dxc
            public void W4(MedicalAidRecord medicalAidRecord) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.mi.health_provider.listener.IRemoteMedicalCardCallback");
                    b.b(parcelObtain, medicalAidRecord, 0);
                    this.f16029a.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f16029a;
            }
        }

        public static dxc s2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.mi.health_provider.listener.IRemoteMedicalCardCallback");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof dxc)) ? new C0917a(iBinder) : (dxc) iInterfaceQueryLocalInterface;
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

    void W4(MedicalAidRecord medicalAidRecord) throws RemoteException;
}
