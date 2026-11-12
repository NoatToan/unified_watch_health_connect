package ih;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes7.dex */
public interface a extends IInterface {

    /* JADX INFO: renamed from: ih.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC1787a extends Binder implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int f93440a = 0;

        /* JADX INFO: renamed from: ih.a$a$a, reason: collision with other inner class name */
        public static class C1788a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final IBinder f93441a;

            public C1788a(IBinder iBinder) {
                this.f93441a = iBinder;
            }

            @Override // ih.a
            public final String a() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.zui.deviceidservice.IDeviceidInterface");
                    this.f93441a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f93441a;
            }

            @Override // ih.a
            public final String b() {
                throw null;
            }

            @Override // ih.a
            public final boolean c() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.zui.deviceidservice.IDeviceidInterface");
                    this.f93441a.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // ih.a
            public final String d0() {
                throw null;
            }

            @Override // ih.a
            public final String e() {
                throw null;
            }

            @Override // ih.a
            public final boolean g() {
                throw null;
            }
        }

        public AbstractBinderC1787a() {
            attachInterface(this, "com.zui.deviceidservice.IDeviceidInterface");
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i14, Parcel parcel, Parcel parcel2, int i15) {
            if (i14 == 1598968902) {
                parcel2.writeString("com.zui.deviceidservice.IDeviceidInterface");
                return true;
            }
            switch (i14) {
                case 1:
                    parcel.enforceInterface("com.zui.deviceidservice.IDeviceidInterface");
                    String strA = a();
                    parcel2.writeNoException();
                    parcel2.writeString(strA);
                    return true;
                case 2:
                    parcel.enforceInterface("com.zui.deviceidservice.IDeviceidInterface");
                    b();
                    throw null;
                case 3:
                    parcel.enforceInterface("com.zui.deviceidservice.IDeviceidInterface");
                    boolean zC = c();
                    parcel2.writeNoException();
                    parcel2.writeInt(zC ? 1 : 0);
                    return true;
                case 4:
                    parcel.enforceInterface("com.zui.deviceidservice.IDeviceidInterface");
                    parcel.readString();
                    d0();
                    throw null;
                case 5:
                    parcel.enforceInterface("com.zui.deviceidservice.IDeviceidInterface");
                    parcel.readString();
                    e();
                    throw null;
                case 6:
                    parcel.enforceInterface("com.zui.deviceidservice.IDeviceidInterface");
                    parcel.readString();
                    g();
                    throw null;
                default:
                    return super.onTransact(i14, parcel, parcel2, i15);
            }
        }
    }

    String a();

    String b();

    boolean c();

    String d0();

    String e();

    boolean g();
}
