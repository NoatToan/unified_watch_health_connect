package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public interface zoc extends IInterface {

    public static abstract class a extends Binder implements zoc {

        /* JADX INFO: renamed from: zoc$a$a, reason: collision with other inner class name */
        public static class C1169a implements zoc {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static zoc f41519b;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f41520a;

            public C1169a(IBinder iBinder) {
                this.f41520a = iBinder;
            }

            @Override // defpackage.zoc
            public boolean M4(boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    parcelObtain.writeInt(z ? 1 : 0);
                    if (!this.f41520a.transact(2, parcelObtain, parcelObtain2, 0) && a.h4() != null) {
                        return a.h4().M4(z);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f41520a;
            }

            @Override // defpackage.zoc
            public String getId() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    if (!this.f41520a.transact(1, parcelObtain, parcelObtain2, 0) && a.h4() != null) {
                        return a.h4().getId();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public static zoc h4() {
            return C1169a.f41519b;
        }

        public static zoc s2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof zoc)) ? new C1169a(iBinder) : (zoc) iInterfaceQueryLocalInterface;
        }
    }

    boolean M4(boolean z) throws RemoteException;

    String getId() throws RemoteException;
}
