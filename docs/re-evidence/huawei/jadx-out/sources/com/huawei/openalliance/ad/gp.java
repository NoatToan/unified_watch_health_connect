package com.huawei.openalliance.ad;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes12.dex */
public interface gp extends IInterface {
    void a(int i, long j, boolean z, float f, double d, String str);

    void a(int i, Bundle bundle);

    public static abstract class a extends Binder implements gp {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        /* JADX INFO: renamed from: com.huawei.openalliance.ad.gp$a$a, reason: collision with other inner class name */
        static class C0208a implements gp {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static gp f18831a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private IBinder f18832b;

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f18832b;
            }

            @Override // com.huawei.openalliance.ad.gp
            public void a(int i, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.hihonor.cloudservice.oaid.IOAIDCallBack");
                    parcelObtain.writeInt(i);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.f18832b.transact(2, parcelObtain, parcelObtain2, 0) || a.a() == null) {
                        parcelObtain2.readException();
                    } else {
                        a.a().a(i, bundle);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.openalliance.ad.gp
            public void a(int i, long j, boolean z, float f, double d, String str) throws Throwable {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.hihonor.cloudservice.oaid.IOAIDCallBack");
                    parcelObtain.writeInt(i);
                    parcelObtain.writeLong(j);
                    parcelObtain.writeInt(z ? 1 : 0);
                    parcelObtain.writeFloat(f);
                    parcelObtain.writeDouble(d);
                    parcelObtain.writeString(str);
                    try {
                        if (this.f18832b.transact(1, parcelObtain, parcelObtain2, 0) || a.a() == null) {
                            parcelObtain2.readException();
                        } else {
                            a.a().a(i, j, z, f, d, str);
                        }
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                    } catch (Throwable th) {
                        th = th;
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }

            C0208a(IBinder iBinder) {
                this.f18832b = iBinder;
            }
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface("com.hihonor.cloudservice.oaid.IOAIDCallBack");
                a(parcel.readInt(), parcel.readLong(), parcel.readInt() != 0, parcel.readFloat(), parcel.readDouble(), parcel.readString());
            } else {
                if (i != 2) {
                    if (i != 1598968902) {
                        return super.onTransact(i, parcel, parcel2, i2);
                    }
                    parcel2.writeString("com.hihonor.cloudservice.oaid.IOAIDCallBack");
                    return true;
                }
                parcel.enforceInterface("com.hihonor.cloudservice.oaid.IOAIDCallBack");
                a(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
            }
            parcel2.writeNoException();
            return true;
        }

        public static gp a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.hihonor.cloudservice.oaid.IOAIDCallBack");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof gp)) ? new C0208a(iBinder) : (gp) iInterfaceQueryLocalInterface;
        }

        public static gp a() {
            return C0208a.f18831a;
        }

        public a() {
            attachInterface(this, "com.hihonor.cloudservice.oaid.IOAIDCallBack");
        }
    }
}
