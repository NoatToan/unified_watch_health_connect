package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public interface src extends IInterface {

    public static abstract class a extends Binder implements src {

        /* JADX INFO: renamed from: src$a$a, reason: collision with other inner class name */
        public static class C1106a implements src {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static src f33911b;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f33912a;

            public C1106a(IBinder iBinder) {
                this.f33912a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f33912a;
            }

            @Override // defpackage.src
            public String g() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.asus.msa.SupplementaryDID.IDidAidlInterface");
                    if (!this.f33912a.transact(3, parcelObtain, parcelObtain2, 0) && a.h4() != null) {
                        return a.h4().g();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.src
            public boolean isSupport() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.asus.msa.SupplementaryDID.IDidAidlInterface");
                    if (!this.f33912a.transact(1, parcelObtain, parcelObtain2, 0) && a.h4() != null) {
                        return a.h4().isSupport();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public static src h4() {
            return C1106a.f33911b;
        }

        public static src s2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.asus.msa.SupplementaryDID.IDidAidlInterface");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof src)) ? new C1106a(iBinder) : (src) iInterfaceQueryLocalInterface;
        }
    }

    String g() throws RemoteException;

    boolean isSupport() throws RemoteException;
}
