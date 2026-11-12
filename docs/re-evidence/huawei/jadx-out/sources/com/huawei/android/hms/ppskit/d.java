package com.huawei.android.hms.ppskit;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes4.dex */
public interface d extends IInterface {
    void a(String str, int i, String str2);

    public static abstract class a extends Binder implements d {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1598968902) {
                parcel2.writeString("com.huawei.android.hms.ppskit.IPPSResultCallback");
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel.enforceInterface("com.huawei.android.hms.ppskit.IPPSResultCallback");
            a(parcel.readString(), parcel.readInt(), parcel.readString());
            parcel2.writeNoException();
            return true;
        }

        static class c implements d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static d f5128a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private IBinder f5129c;

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f5129c;
            }

            @Override // com.huawei.android.hms.ppskit.d
            public void a(String str, int i, String str2) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.huawei.android.hms.ppskit.IPPSResultCallback");
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str2);
                    if (this.f5129c.transact(1, parcelObtain, parcelObtain2, 0) || a.a() == null) {
                        parcelObtain2.readException();
                    } else {
                        a.a().a(str, i, str2);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            c(IBinder iBinder) {
                this.f5129c = iBinder;
            }
        }

        public static d a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.huawei.android.hms.ppskit.IPPSResultCallback");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof d)) ? new c(iBinder) : (d) iInterfaceQueryLocalInterface;
        }

        public static d a() {
            return c.f5128a;
        }

        public a() {
            attachInterface(this, "com.huawei.android.hms.ppskit.IPPSResultCallback");
        }
    }
}
