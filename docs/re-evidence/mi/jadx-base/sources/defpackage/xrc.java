package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes7.dex */
public interface xrc extends IInterface {

    public static abstract class a extends Binder implements xrc {

        /* JADX INFO: renamed from: xrc$a$a, reason: collision with other inner class name */
        public static class C1148a implements xrc {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f39387a;

            public C1148a(IBinder iBinder) {
                this.f39387a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f39387a;
            }
        }

        public a() {
            attachInterface(this, "com.xiaomi.eco.common.connect.IEcoConnectManagerService");
        }

        public static xrc asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.eco.common.connect.IEcoConnectManagerService");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof xrc)) ? new C1148a(iBinder) : (xrc) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel2.writeString("com.xiaomi.eco.common.connect.IEcoConnectManagerService");
            return true;
        }
    }
}
