package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes7.dex */
public interface wnf extends IInterface {

    public static abstract class a extends Binder implements wnf {

        /* JADX INFO: renamed from: wnf$a$a, reason: collision with other inner class name */
        public static class C1134a implements wnf {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f38160a;

            public C1134a(IBinder iBinder) {
                this.f38160a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f38160a;
            }

            @Override // defpackage.wnf
            public void k(String str, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fit.fitness.sync.export.MedicalSyncDataCallback");
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    this.f38160a.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.wnf
            public void m5(String str, ParcelFileDescriptor parcelFileDescriptor) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fit.fitness.sync.export.MedicalSyncDataCallback");
                    parcelObtain.writeString(str);
                    b.b(parcelObtain, parcelFileDescriptor, 0);
                    this.f38160a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.wnf
            public void onSuccess(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fit.fitness.sync.export.MedicalSyncDataCallback");
                    parcelObtain.writeString(str);
                    this.f38160a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public static wnf s2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.fit.fitness.sync.export.MedicalSyncDataCallback");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof wnf)) ? new C1134a(iBinder) : (wnf) iInterfaceQueryLocalInterface;
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

    void k(String str, int i) throws RemoteException;

    void m5(String str, ParcelFileDescriptor parcelFileDescriptor) throws RemoteException;

    void onSuccess(String str) throws RemoteException;
}
