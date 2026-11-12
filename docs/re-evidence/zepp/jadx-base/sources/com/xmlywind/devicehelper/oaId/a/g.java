package com.xmlywind.devicehelper.oaId.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes22.dex */
public interface g extends IInterface {

    public static abstract class a extends Binder implements g {

        /* JADX INFO: renamed from: com.xmlywind.devicehelper.oaId.a.g$a$a, reason: collision with other inner class name */
        public static class C1061a implements g {
            private IBinder a;

            public C1061a(IBinder iBinder) {
                this.a = iBinder;
            }

            @Override // com.xmlywind.devicehelper.oaId.a.g
            public String a() {
                String string;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.bun.lib.MsaIdInterface");
                    this.a.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    string = parcelObtain2.readString();
                } catch (Throwable unused) {
                    parcelObtain.recycle();
                    parcelObtain2.recycle();
                    string = null;
                }
                parcelObtain.recycle();
                parcelObtain2.recycle();
                return string;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.a;
            }
        }
    }

    String a();
}
