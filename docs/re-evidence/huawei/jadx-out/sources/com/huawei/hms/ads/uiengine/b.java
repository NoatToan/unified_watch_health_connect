package com.huawei.hms.ads.uiengine;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes10.dex */
public interface b extends IInterface {
    void a(com.huawei.hms.ads.uiengine.a aVar);

    void a(String str, com.huawei.hms.ads.uiengine.a aVar);

    void b(com.huawei.hms.ads.uiengine.a aVar);

    void b(String str, com.huawei.hms.ads.uiengine.a aVar);

    void c(String str, com.huawei.hms.ads.uiengine.a aVar);

    void d(String str, com.huawei.hms.ads.uiengine.a aVar);

    public static abstract class a extends Binder implements b {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        /* JADX INFO: renamed from: com.huawei.hms.ads.uiengine.b$a$a, reason: collision with other inner class name */
        static class C0106a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static b f12853a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private IBinder f12854b;

            @Override // com.huawei.hms.ads.uiengine.b
            public void d(String str, com.huawei.hms.ads.uiengine.a aVar) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.huawei.hms.ads.uiengine.IMultiMPlayingManager");
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
                    if (this.f12854b.transact(4, parcelObtain, parcelObtain2, 0) || a.a() == null) {
                        parcelObtain2.readException();
                    } else {
                        a.a().d(str, aVar);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hms.ads.uiengine.b
            public void c(String str, com.huawei.hms.ads.uiengine.a aVar) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.huawei.hms.ads.uiengine.IMultiMPlayingManager");
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
                    if (this.f12854b.transact(3, parcelObtain, parcelObtain2, 0) || a.a() == null) {
                        parcelObtain2.readException();
                    } else {
                        a.a().c(str, aVar);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hms.ads.uiengine.b
            public void b(String str, com.huawei.hms.ads.uiengine.a aVar) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.huawei.hms.ads.uiengine.IMultiMPlayingManager");
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
                    if (this.f12854b.transact(2, parcelObtain, parcelObtain2, 0) || a.a() == null) {
                        parcelObtain2.readException();
                    } else {
                        a.a().b(str, aVar);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hms.ads.uiengine.b
            public void b(com.huawei.hms.ads.uiengine.a aVar) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.huawei.hms.ads.uiengine.IMultiMPlayingManager");
                    parcelObtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
                    if (this.f12854b.transact(6, parcelObtain, parcelObtain2, 0) || a.a() == null) {
                        parcelObtain2.readException();
                    } else {
                        a.a().b(aVar);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f12854b;
            }

            @Override // com.huawei.hms.ads.uiengine.b
            public void a(String str, com.huawei.hms.ads.uiengine.a aVar) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.huawei.hms.ads.uiengine.IMultiMPlayingManager");
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
                    if (this.f12854b.transact(1, parcelObtain, parcelObtain2, 0) || a.a() == null) {
                        parcelObtain2.readException();
                    } else {
                        a.a().a(str, aVar);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hms.ads.uiengine.b
            public void a(com.huawei.hms.ads.uiengine.a aVar) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.huawei.hms.ads.uiengine.IMultiMPlayingManager");
                    parcelObtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
                    if (this.f12854b.transact(5, parcelObtain, parcelObtain2, 0) || a.a() == null) {
                        parcelObtain2.readException();
                    } else {
                        a.a().a(aVar);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            C0106a(IBinder iBinder) {
                this.f12854b = iBinder;
            }
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1598968902) {
                switch (i) {
                    case 1:
                        parcel.enforceInterface("com.huawei.hms.ads.uiengine.IMultiMPlayingManager");
                        a(parcel.readString(), com.huawei.hms.ads.uiengine.a.AbstractBinderC0104a.a(parcel.readStrongBinder()));
                        break;
                    case 2:
                        parcel.enforceInterface("com.huawei.hms.ads.uiengine.IMultiMPlayingManager");
                        b(parcel.readString(), com.huawei.hms.ads.uiengine.a.AbstractBinderC0104a.a(parcel.readStrongBinder()));
                        break;
                    case 3:
                        parcel.enforceInterface("com.huawei.hms.ads.uiengine.IMultiMPlayingManager");
                        c(parcel.readString(), com.huawei.hms.ads.uiengine.a.AbstractBinderC0104a.a(parcel.readStrongBinder()));
                        break;
                    case 4:
                        parcel.enforceInterface("com.huawei.hms.ads.uiengine.IMultiMPlayingManager");
                        d(parcel.readString(), com.huawei.hms.ads.uiengine.a.AbstractBinderC0104a.a(parcel.readStrongBinder()));
                        break;
                    case 5:
                        parcel.enforceInterface("com.huawei.hms.ads.uiengine.IMultiMPlayingManager");
                        a(com.huawei.hms.ads.uiengine.a.AbstractBinderC0104a.a(parcel.readStrongBinder()));
                        break;
                    case 6:
                        parcel.enforceInterface("com.huawei.hms.ads.uiengine.IMultiMPlayingManager");
                        b(com.huawei.hms.ads.uiengine.a.AbstractBinderC0104a.a(parcel.readStrongBinder()));
                        break;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeNoException();
                return true;
            }
            parcel2.writeString("com.huawei.hms.ads.uiengine.IMultiMPlayingManager");
            return true;
        }

        public static b a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.huawei.hms.ads.uiengine.IMultiMPlayingManager");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof b)) ? new C0106a(iBinder) : (b) iInterfaceQueryLocalInterface;
        }

        public static b a() {
            return C0106a.f12853a;
        }

        public a() {
            attachInterface(this, "com.huawei.hms.ads.uiengine.IMultiMPlayingManager");
        }
    }
}
