package com.huawei.openalliance.ad;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes12.dex */
public interface gq extends IInterface {
    void a();

    void a(gp gpVar);

    void b(gp gpVar);

    public static abstract class a extends Binder implements gq {

        /* JADX INFO: renamed from: com.huawei.openalliance.ad.gq$a$a, reason: collision with other inner class name */
        static class C0209a implements gq {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static gq f18833a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private IBinder f18834b;

            @Override // com.huawei.openalliance.ad.gq
            public void b(gp gpVar) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.hihonor.cloudservice.oaid.IOAIDService");
                    parcelObtain.writeStrongBinder(gpVar != null ? gpVar.asBinder() : null);
                    if (this.f18834b.transact(3, parcelObtain, parcelObtain2, 0) || a.b() == null) {
                        parcelObtain2.readException();
                    } else {
                        a.b().b(gpVar);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f18834b;
            }

            @Override // com.huawei.openalliance.ad.gq
            public void a(gp gpVar) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.hihonor.cloudservice.oaid.IOAIDService");
                    parcelObtain.writeStrongBinder(gpVar != null ? gpVar.asBinder() : null);
                    if (this.f18834b.transact(2, parcelObtain, parcelObtain2, 0) || a.b() == null) {
                        parcelObtain2.readException();
                    } else {
                        a.b().a(gpVar);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.openalliance.ad.gq
            public void a() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.hihonor.cloudservice.oaid.IOAIDService");
                    if (this.f18834b.transact(1, parcelObtain, parcelObtain2, 0) || a.b() == null) {
                        parcelObtain2.readException();
                    } else {
                        a.b().a();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            C0209a(IBinder iBinder) {
                this.f18834b = iBinder;
            }
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface("com.hihonor.cloudservice.oaid.IOAIDService");
                a();
            } else if (i == 2) {
                parcel.enforceInterface("com.hihonor.cloudservice.oaid.IOAIDService");
                a(gp.a.a(parcel.readStrongBinder()));
            } else {
                if (i != 3) {
                    if (i != 1598968902) {
                        return super.onTransact(i, parcel, parcel2, i2);
                    }
                    parcel2.writeString("com.hihonor.cloudservice.oaid.IOAIDService");
                    return true;
                }
                parcel.enforceInterface("com.hihonor.cloudservice.oaid.IOAIDService");
                b(gp.a.a(parcel.readStrongBinder()));
            }
            parcel2.writeNoException();
            return true;
        }

        public static gq b() {
            return C0209a.f18833a;
        }

        public static gq a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.hihonor.cloudservice.oaid.IOAIDService");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof gq)) ? new C0209a(iBinder) : (gq) iInterfaceQueryLocalInterface;
        }
    }
}
