package zj;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes7.dex */
public interface a extends IInterface {

    /* JADX INFO: renamed from: zj.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC3825a extends Binder implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int f204888a = 0;

        /* JADX INFO: renamed from: zj.a$a$a, reason: collision with other inner class name */
        public static class C3826a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final IBinder f204889a;

            public C3826a(IBinder iBinder) {
                this.f204889a = iBinder;
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f204889a;
            }

            @Override // zj.a
            public final IBinder w(int i14) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.dsi.ant.ipc.aidl.IAntServiceAidl");
                    parcelObtain.writeInt(i14);
                    this.f204889a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readStrongBinder();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public AbstractBinderC3825a() {
            attachInterface(this, "com.dsi.ant.ipc.aidl.IAntServiceAidl");
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i14, Parcel parcel, Parcel parcel2, int i15) {
            if (i14 != 1) {
                if (i14 != 1598968902) {
                    return super.onTransact(i14, parcel, parcel2, i15);
                }
                parcel2.writeString("com.dsi.ant.ipc.aidl.IAntServiceAidl");
                return true;
            }
            parcel.enforceInterface("com.dsi.ant.ipc.aidl.IAntServiceAidl");
            IBinder iBinderW = w(parcel.readInt());
            parcel2.writeNoException();
            parcel2.writeStrongBinder(iBinderW);
            return true;
        }
    }

    IBinder w(int i14);
}
