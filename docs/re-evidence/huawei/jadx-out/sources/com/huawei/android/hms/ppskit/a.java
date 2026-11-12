package com.huawei.android.hms.ppskit;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes4.dex */
public interface a extends IInterface {
    String a();

    String a(String str);

    void a(String str, int i, String str2, String str3);

    void a(String str, String str2, int i);

    /* JADX INFO: renamed from: com.huawei.android.hms.ppskit.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0056a extends Binder implements a {

        /* JADX INFO: renamed from: com.huawei.android.hms.ppskit.a$a$e */
        static class e implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static a f5125a;
            private IBinder e;

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.e;
            }

            @Override // com.huawei.android.hms.ppskit.a
            public void a(String str, String str2, int i) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.huawei.android.hms.ppskit.IPPSChannelInfoService");
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeInt(i);
                    if (this.e.transact(2, parcelObtain, parcelObtain2, 0) || AbstractBinderC0056a.b() == null) {
                        parcelObtain2.readException();
                    } else {
                        AbstractBinderC0056a.b().a(str, str2, i);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.android.hms.ppskit.a
            public void a(String str, int i, String str2, String str3) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.huawei.android.hms.ppskit.IPPSChannelInfoService");
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeString(str3);
                    if (this.e.transact(3, parcelObtain, parcelObtain2, 0) || AbstractBinderC0056a.b() == null) {
                        parcelObtain2.readException();
                    } else {
                        AbstractBinderC0056a.b().a(str, i, str2, str3);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.android.hms.ppskit.a
            public String a(String str) {
                String string;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.huawei.android.hms.ppskit.IPPSChannelInfoService");
                    parcelObtain.writeString(str);
                    if (this.e.transact(4, parcelObtain, parcelObtain2, 0) || AbstractBinderC0056a.b() == null) {
                        parcelObtain2.readException();
                        string = parcelObtain2.readString();
                    } else {
                        string = AbstractBinderC0056a.b().a(str);
                    }
                    return string;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.android.hms.ppskit.a
            public String a() {
                String string;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.huawei.android.hms.ppskit.IPPSChannelInfoService");
                    if (this.e.transact(1, parcelObtain, parcelObtain2, 0) || AbstractBinderC0056a.b() == null) {
                        parcelObtain2.readException();
                        string = parcelObtain2.readString();
                    } else {
                        string = AbstractBinderC0056a.b().a();
                    }
                    return string;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            e(IBinder iBinder) {
                this.e = iBinder;
            }
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1598968902) {
                parcel2.writeString("com.huawei.android.hms.ppskit.IPPSChannelInfoService");
                return true;
            }
            if (i == 1) {
                parcel.enforceInterface("com.huawei.android.hms.ppskit.IPPSChannelInfoService");
                String strA = a();
                parcel2.writeNoException();
                parcel2.writeString(strA);
                return true;
            }
            if (i == 2) {
                parcel.enforceInterface("com.huawei.android.hms.ppskit.IPPSChannelInfoService");
                a(parcel.readString(), parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            }
            if (i == 3) {
                parcel.enforceInterface("com.huawei.android.hms.ppskit.IPPSChannelInfoService");
                a(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            }
            if (i != 4) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel.enforceInterface("com.huawei.android.hms.ppskit.IPPSChannelInfoService");
            String strA2 = a(parcel.readString());
            parcel2.writeNoException();
            parcel2.writeString(strA2);
            return true;
        }

        public static a b() {
            return e.f5125a;
        }

        public static a a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.huawei.android.hms.ppskit.IPPSChannelInfoService");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof a)) ? new e(iBinder) : (a) iInterfaceQueryLocalInterface;
        }
    }
}
