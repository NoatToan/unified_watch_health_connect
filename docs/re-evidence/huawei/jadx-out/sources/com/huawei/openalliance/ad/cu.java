package com.huawei.openalliance.ad;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes12.dex */
public interface cu extends IInterface {
    String a();

    boolean b();

    public static abstract class a {

        /* JADX INFO: renamed from: com.huawei.openalliance.ad.cu$a$a, reason: collision with other inner class name */
        static class C0199a implements cu {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private IBinder f18368a;

            public String c() {
                return "com.uodis.opendevice.aidl.OpenDeviceIdentifierService";
            }

            @Override // com.huawei.openalliance.ad.cu
            public boolean b() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(c());
                    this.f18368a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f18368a;
            }

            @Override // com.huawei.openalliance.ad.cu
            public String a() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(c());
                    this.f18368a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            C0199a(IBinder iBinder) {
                this.f18368a = iBinder;
            }
        }

        public static cu a(IBinder iBinder) {
            return new C0199a(iBinder);
        }
    }
}
