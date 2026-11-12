package com.huawei.openalliance.ad.hsf;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.huawei.openalliance.ad.hw;

/* JADX INFO: loaded from: classes12.dex */
public interface d extends IInterface {
    void a(String str, String str2, c cVar, int i);

    public static abstract class a extends Binder implements d {

        /* JADX INFO: renamed from: com.huawei.openalliance.ad.hsf.d$a$a, reason: collision with other inner class name */
        static class C0215a implements d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private IBinder f18924a;

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f18924a;
            }

            @Override // com.huawei.openalliance.ad.hsf.d
            public void a(String str, String str2, c cVar, int i) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.huawei.hsf.pm.service.IPackageManager");
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeStrongBinder(cVar != null ? cVar.asBinder() : null);
                    parcelObtain.writeInt(i);
                    this.f18924a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            C0215a(IBinder iBinder) {
                this.f18924a = iBinder;
            }
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString("com.huawei.hsf.pm.service.IPackageManager");
                return true;
            }
            parcel.enforceInterface("com.huawei.hsf.pm.service.IPackageManager");
            a(parcel.readString(), parcel.readString(), c.a.a(parcel.readStrongBinder()), parcel.readInt());
            parcel2.writeNoException();
            return true;
        }

        public static d a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            try {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.huawei.hsf.pm.service.IPackageManager");
                return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof d)) ? new C0215a(iBinder) : (d) iInterfaceQueryLocalInterface;
            } catch (Throwable th) {
                hw.c("IPackageManager", "IPackageManager err: " + th.getClass().getSimpleName());
                return null;
            }
        }
    }
}
