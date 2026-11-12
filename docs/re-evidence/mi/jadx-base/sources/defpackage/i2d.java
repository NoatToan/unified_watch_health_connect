package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public interface i2d extends IInterface {

    public static abstract class a extends Binder implements i2d {

        /* JADX INFO: renamed from: i2d$a$a, reason: collision with other inner class name */
        public static class C0963a implements i2d {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static i2d f20697b;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f20698a;

            public C0963a(IBinder iBinder) {
                this.f20698a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f20698a;
            }

            @Override // defpackage.i2d
            public String g() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.android.creator.IdsSupplier");
                    if (!this.f20698a.transact(3, parcelObtain, parcelObtain2, 0) && a.h4() != null) {
                        return a.h4().g();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public static i2d h4() {
            return C0963a.f20697b;
        }

        public static i2d s2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.android.creator.IdsSupplier");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof i2d)) ? new C0963a(iBinder) : (i2d) iInterfaceQueryLocalInterface;
        }
    }

    String g() throws RemoteException;
}
