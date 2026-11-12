package com.huawei.openalliance.ad;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes12.dex */
public interface yb extends IInterface {
    String a(String str, String str2, String str3);

    public static abstract class a extends Binder implements yb {

        /* JADX INFO: renamed from: com.huawei.openalliance.ad.yb$a$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: classes41.dex */
        static class C0248a implements yb {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static yb f21502a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private IBinder f21503b;

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f21503b;
            }

            @Override // com.huawei.openalliance.ad.yb
            public String a(String str, String str2, String str3) {
                String string;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.heytap.openid.IOpenID");
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeString(str3);
                    if (this.f21503b.transact(1, parcelObtain, parcelObtain2, 0) || a.a() == null) {
                        parcelObtain2.readException();
                        string = parcelObtain2.readString();
                    } else {
                        string = a.a().a(str, str2, str3);
                    }
                    return string;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            C0248a(IBinder iBinder) {
                this.f21503b = iBinder;
            }
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString("com.heytap.openid.IOpenID");
                return true;
            }
            parcel.enforceInterface("com.heytap.openid.IOpenID");
            String strA = a(parcel.readString(), parcel.readString(), parcel.readString());
            parcel2.writeNoException();
            parcel2.writeString(strA);
            return true;
        }

        public static yb a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            try {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.heytap.openid.IOpenID");
                return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof yb)) ? new C0248a(iBinder) : (yb) iInterfaceQueryLocalInterface;
            } catch (Throwable th) {
                hw.c("IOpenID", "IOpenID err: " + th.getClass().getSimpleName());
                return null;
            }
        }

        public static yb a() {
            return C0248a.f21502a;
        }

        public a() {
            attachInterface(this, "com.heytap.openid.IOpenID");
        }
    }
}
