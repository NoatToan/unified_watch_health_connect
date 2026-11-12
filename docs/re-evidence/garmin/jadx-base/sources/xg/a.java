package xg;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes7.dex */
public interface a extends IInterface {

    /* JADX INFO: renamed from: xg.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC3550a extends Binder implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int f190717a = 0;

        /* JADX INFO: renamed from: xg.a$a$a, reason: collision with other inner class name */
        public static class C3551a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final IBinder f190718a;

            public C3551a(IBinder iBinder) {
                this.f190718a = iBinder;
            }

            @Override // xg.a
            public final String a() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.samsung.android.deviceidservice.IDeviceIdService");
                    this.f190718a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f190718a;
            }

            @Override // xg.a
            public final String b() {
                throw null;
            }

            @Override // xg.a
            public final String e() {
                throw null;
            }
        }

        public AbstractBinderC3550a() {
            attachInterface(this, "com.samsung.android.deviceidservice.IDeviceIdService");
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i14, Parcel parcel, Parcel parcel2, int i15) {
            if (i14 == 1) {
                parcel.enforceInterface("com.samsung.android.deviceidservice.IDeviceIdService");
                String strA = a();
                parcel2.writeNoException();
                parcel2.writeString(strA);
                return true;
            }
            if (i14 == 2) {
                parcel.enforceInterface("com.samsung.android.deviceidservice.IDeviceIdService");
                parcel.readString();
                b();
                throw null;
            }
            if (i14 != 3) {
                if (i14 != 1598968902) {
                    return super.onTransact(i14, parcel, parcel2, i15);
                }
                parcel2.writeString("com.samsung.android.deviceidservice.IDeviceIdService");
                return true;
            }
            parcel.enforceInterface("com.samsung.android.deviceidservice.IDeviceIdService");
            parcel.readString();
            e();
            throw null;
        }
    }

    String a();

    String b();

    String e();
}
