package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes10.dex */
public interface psc extends IInterface {

    public static abstract class a extends Binder implements psc {
        static final int TRANSACTION_onFtpStateChange = 1;

        /* JADX INFO: renamed from: psc$a$a, reason: collision with other inner class name */
        public static class C1076a implements psc {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f30703a;

            public C1076a(IBinder iBinder) {
                this.f30703a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f30703a;
            }

            @Override // defpackage.psc
            public void onFtpStateChange(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_eco_manager_export.listener.IFtpStateReceiveListener");
                    parcelObtain.writeString(str);
                    this.f30703a.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "com.xiaomi.fitness.sport_eco_manager_export.listener.IFtpStateReceiveListener");
        }

        public static psc asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.fitness.sport_eco_manager_export.listener.IFtpStateReceiveListener");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof psc)) ? new C1076a(iBinder) : (psc) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.xiaomi.fitness.sport_eco_manager_export.listener.IFtpStateReceiveListener");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.xiaomi.fitness.sport_eco_manager_export.listener.IFtpStateReceiveListener");
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            onFtpStateChange(parcel.readString());
            return true;
        }
    }

    void onFtpStateChange(String str) throws RemoteException;
}
