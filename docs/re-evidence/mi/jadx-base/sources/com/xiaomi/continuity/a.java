package com.xiaomi.continuity;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes7.dex */
public interface a extends IInterface {

    /* JADX INFO: renamed from: com.xiaomi.continuity.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0351a extends Binder implements a {

        /* JADX INFO: renamed from: com.xiaomi.continuity.a$a$a, reason: collision with other inner class name */
        public static class C0352a implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static a f11178b;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f11179a;

            public C0352a(IBinder iBinder) {
                this.f11179a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f11179a;
            }

            @Override // com.xiaomi.continuity.a
            public IBinder x(String str) {
                IBinder strongBinder;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.continuity.IContinuityServiceManager");
                    parcelObtain.writeString(str);
                    if (this.f11179a.transact(1, parcelObtain, parcelObtain2, 0) || AbstractBinderC0351a.h4() == null) {
                        parcelObtain2.readException();
                        strongBinder = parcelObtain2.readStrongBinder();
                    } else {
                        strongBinder = AbstractBinderC0351a.h4().x(str);
                    }
                    return strongBinder;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public static a h4() {
            return C0352a.f11178b;
        }

        public static a s2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.continuity.IContinuityServiceManager");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof a)) ? new C0352a(iBinder) : (a) iInterfaceQueryLocalInterface;
        }
    }

    IBinder x(String str);
}
