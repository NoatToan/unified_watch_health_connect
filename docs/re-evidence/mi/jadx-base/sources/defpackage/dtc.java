package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.xiaomi.wearable.hm.m;

/* JADX INFO: loaded from: classes2.dex */
public interface dtc extends IInterface {

    public static abstract class a extends Binder implements dtc {
        static final int TRANSACTION_onHuamiApiChange = 1;

        /* JADX INFO: renamed from: dtc$a$a, reason: collision with other inner class name */
        public static class C0916a implements dtc {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f15912a;

            public C0916a(IBinder iBinder) {
                this.f15912a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f15912a;
            }

            @Override // defpackage.dtc
            public void onHuamiApiChange(m mVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.common.connect.IHuamiApiCallback");
                    parcelObtain.writeStrongInterface(mVar);
                    this.f15912a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "com.xiaomi.wearable.common.connect.IHuamiApiCallback");
        }

        public static dtc asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.wearable.common.connect.IHuamiApiCallback");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof dtc)) ? new C0916a(iBinder) : (dtc) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.xiaomi.wearable.common.connect.IHuamiApiCallback");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.xiaomi.wearable.common.connect.IHuamiApiCallback");
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            onHuamiApiChange(m.a.asInterface(parcel.readStrongBinder()));
            parcel2.writeNoException();
            return true;
        }
    }

    void onHuamiApiChange(m mVar) throws RemoteException;
}
