package com.huawei.openalliance.ad.hsf;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.huawei.openalliance.ad.hw;

/* JADX INFO: loaded from: classes12.dex */
public interface c extends IInterface {
    void a(String str, int i);

    public static abstract class a extends Binder implements c {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        /* JADX INFO: renamed from: com.huawei.openalliance.ad.hsf.c$a$a, reason: collision with other inner class name */
        static class C0214a implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private IBinder f18923a;

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f18923a;
            }

            @Override // com.huawei.openalliance.ad.hsf.c
            public void a(String str, int i) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.huawei.hsf.pm.service.IPackageInstalledCallback");
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    this.f18923a.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            C0214a(IBinder iBinder) {
                this.f18923a = iBinder;
            }
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface("com.huawei.hsf.pm.service.IPackageInstalledCallback");
                a(parcel.readString(), parcel.readInt());
                return true;
            }
            if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel2.writeString("com.huawei.hsf.pm.service.IPackageInstalledCallback");
            return true;
        }

        public static c a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            try {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.huawei.hsf.pm.service.IPackageInstalledCallback");
                return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof c)) ? new C0214a(iBinder) : (c) iInterfaceQueryLocalInterface;
            } catch (Throwable th) {
                hw.c("IPackageInstalledCallback", "IPackageInstalledCallback err: " + th.getClass().getSimpleName());
                return null;
            }
        }

        public a() {
            attachInterface(this, "com.huawei.hsf.pm.service.IPackageInstalledCallback");
        }
    }
}
