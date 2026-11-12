package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes7.dex */
public interface vnf extends IInterface {

    public static abstract class a extends Binder implements vnf {

        /* JADX INFO: renamed from: vnf$a$a, reason: collision with other inner class name */
        public static class C1123a implements vnf {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f37063a;

            public C1123a(IBinder iBinder) {
                this.f37063a = iBinder;
            }

            @Override // defpackage.vnf
            public void M0(String str, byte[] bArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fit.fitness.sync.export.MedicalSyncCallback");
                    parcelObtain.writeString(str);
                    parcelObtain.writeByteArray(bArr);
                    this.f37063a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f37063a;
            }

            @Override // defpackage.vnf
            public void k(String str, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fit.fitness.sync.export.MedicalSyncCallback");
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    this.f37063a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public static vnf s2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.fit.fitness.sync.export.MedicalSyncCallback");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof vnf)) ? new C1123a(iBinder) : (vnf) iInterfaceQueryLocalInterface;
        }
    }

    void M0(String str, byte[] bArr) throws RemoteException;

    void k(String str, int i) throws RemoteException;
}
