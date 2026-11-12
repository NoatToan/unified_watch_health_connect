package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes10.dex */
public interface ptc extends IInterface {

    public static abstract class a extends Binder implements ptc {
        static final int TRANSACTION_onLock = 1;

        /* JADX INFO: renamed from: ptc$a$a, reason: collision with other inner class name */
        public static class C1078a implements ptc {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f30745a;

            public C1078a(IBinder iBinder) {
                this.f30745a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f30745a;
            }

            @Override // defpackage.ptc
            public void onLock(boolean z, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_manager_export.listener.ILocalReceiveListener");
                    parcelObtain.writeInt(z ? 1 : 0);
                    parcelObtain.writeInt(i);
                    this.f30745a.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "com.xiaomi.fitness.sport_manager_export.listener.ILocalReceiveListener");
        }

        public static ptc asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.fitness.sport_manager_export.listener.ILocalReceiveListener");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ptc)) ? new C1078a(iBinder) : (ptc) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.xiaomi.fitness.sport_manager_export.listener.ILocalReceiveListener");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.xiaomi.fitness.sport_manager_export.listener.ILocalReceiveListener");
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            onLock(parcel.readInt() != 0, parcel.readInt());
            return true;
        }
    }

    void onLock(boolean z, int i) throws RemoteException;
}
