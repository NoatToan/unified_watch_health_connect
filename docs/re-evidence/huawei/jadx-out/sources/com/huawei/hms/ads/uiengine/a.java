package com.huawei.hms.ads.uiengine;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes10.dex */
public interface a extends IInterface {
    long a();

    void a(Bundle bundle);

    void a(String str);

    void b();

    void b(Bundle bundle);

    void b(String str);

    void c(Bundle bundle);

    void c(String str);

    void d(Bundle bundle);

    /* JADX INFO: renamed from: com.huawei.hms.ads.uiengine.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0104a extends Binder implements a {

        /* JADX INFO: renamed from: com.huawei.hms.ads.uiengine.a$a$a, reason: collision with other inner class name */
        static class C0105a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static a f12851a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private IBinder f12852b;

            @Override // com.huawei.hms.ads.uiengine.a
            public void d(Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.huawei.hms.ads.uiengine.IMediaplayerAgent");
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.f12852b.transact(5, parcelObtain, parcelObtain2, 0) || AbstractBinderC0104a.c() == null) {
                        parcelObtain2.readException();
                    } else {
                        AbstractBinderC0104a.c().d(bundle);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hms.ads.uiengine.a
            public void c(String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.huawei.hms.ads.uiengine.IMediaplayerAgent");
                    parcelObtain.writeString(str);
                    if (this.f12852b.transact(9, parcelObtain, parcelObtain2, 0) || AbstractBinderC0104a.c() == null) {
                        parcelObtain2.readException();
                    } else {
                        AbstractBinderC0104a.c().c(str);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hms.ads.uiengine.a
            public void c(Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.huawei.hms.ads.uiengine.IMediaplayerAgent");
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.f12852b.transact(4, parcelObtain, parcelObtain2, 0) || AbstractBinderC0104a.c() == null) {
                        parcelObtain2.readException();
                    } else {
                        AbstractBinderC0104a.c().c(bundle);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hms.ads.uiengine.a
            public void b(String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.huawei.hms.ads.uiengine.IMediaplayerAgent");
                    parcelObtain.writeString(str);
                    if (this.f12852b.transact(8, parcelObtain, parcelObtain2, 0) || AbstractBinderC0104a.c() == null) {
                        parcelObtain2.readException();
                    } else {
                        AbstractBinderC0104a.c().b(str);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hms.ads.uiengine.a
            public void b(Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.huawei.hms.ads.uiengine.IMediaplayerAgent");
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.f12852b.transact(3, parcelObtain, parcelObtain2, 0) || AbstractBinderC0104a.c() == null) {
                        parcelObtain2.readException();
                    } else {
                        AbstractBinderC0104a.c().b(bundle);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hms.ads.uiengine.a
            public void b() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.huawei.hms.ads.uiengine.IMediaplayerAgent");
                    if (this.f12852b.transact(7, parcelObtain, parcelObtain2, 0) || AbstractBinderC0104a.c() == null) {
                        parcelObtain2.readException();
                    } else {
                        AbstractBinderC0104a.c().b();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f12852b;
            }

            @Override // com.huawei.hms.ads.uiengine.a
            public void a(String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.huawei.hms.ads.uiengine.IMediaplayerAgent");
                    parcelObtain.writeString(str);
                    if (this.f12852b.transact(6, parcelObtain, parcelObtain2, 0) || AbstractBinderC0104a.c() == null) {
                        parcelObtain2.readException();
                    } else {
                        AbstractBinderC0104a.c().a(str);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hms.ads.uiengine.a
            public void a(Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.huawei.hms.ads.uiengine.IMediaplayerAgent");
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.f12852b.transact(2, parcelObtain, parcelObtain2, 0) || AbstractBinderC0104a.c() == null) {
                        parcelObtain2.readException();
                    } else {
                        AbstractBinderC0104a.c().a(bundle);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hms.ads.uiengine.a
            public long a() {
                long jA;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.huawei.hms.ads.uiengine.IMediaplayerAgent");
                    if (this.f12852b.transact(1, parcelObtain, parcelObtain2, 0) || AbstractBinderC0104a.c() == null) {
                        parcelObtain2.readException();
                        jA = parcelObtain2.readLong();
                    } else {
                        jA = AbstractBinderC0104a.c().a();
                    }
                    return jA;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            C0105a(IBinder iBinder) {
                this.f12852b = iBinder;
            }
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1598968902) {
                switch (i) {
                    case 1:
                        parcel.enforceInterface("com.huawei.hms.ads.uiengine.IMediaplayerAgent");
                        long jA = a();
                        parcel2.writeNoException();
                        parcel2.writeLong(jA);
                        return true;
                    case 2:
                        parcel.enforceInterface("com.huawei.hms.ads.uiengine.IMediaplayerAgent");
                        a(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                        parcel2.writeNoException();
                        return true;
                    case 3:
                        parcel.enforceInterface("com.huawei.hms.ads.uiengine.IMediaplayerAgent");
                        b(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                        parcel2.writeNoException();
                        return true;
                    case 4:
                        parcel.enforceInterface("com.huawei.hms.ads.uiengine.IMediaplayerAgent");
                        c(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                        parcel2.writeNoException();
                        return true;
                    case 5:
                        parcel.enforceInterface("com.huawei.hms.ads.uiengine.IMediaplayerAgent");
                        d(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                        parcel2.writeNoException();
                        return true;
                    case 6:
                        parcel.enforceInterface("com.huawei.hms.ads.uiengine.IMediaplayerAgent");
                        a(parcel.readString());
                        parcel2.writeNoException();
                        return true;
                    case 7:
                        parcel.enforceInterface("com.huawei.hms.ads.uiengine.IMediaplayerAgent");
                        b();
                        parcel2.writeNoException();
                        return true;
                    case 8:
                        parcel.enforceInterface("com.huawei.hms.ads.uiengine.IMediaplayerAgent");
                        b(parcel.readString());
                        parcel2.writeNoException();
                        return true;
                    case 9:
                        parcel.enforceInterface("com.huawei.hms.ads.uiengine.IMediaplayerAgent");
                        c(parcel.readString());
                        parcel2.writeNoException();
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            }
            parcel2.writeString("com.huawei.hms.ads.uiengine.IMediaplayerAgent");
            return true;
        }

        public static a c() {
            return C0105a.f12851a;
        }

        public static a a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.huawei.hms.ads.uiengine.IMediaplayerAgent");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof a)) ? new C0105a(iBinder) : (a) iInterfaceQueryLocalInterface;
        }
    }
}
