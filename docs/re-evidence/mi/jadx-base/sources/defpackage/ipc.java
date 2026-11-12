package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes10.dex */
public interface ipc extends IInterface {

    public static abstract class a extends Binder implements ipc {
        static final int TRANSACTION_onApplyLocationPermission = 1;

        /* JADX INFO: renamed from: ipc$a$a, reason: collision with other inner class name */
        public static class C0974a implements ipc {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f21974a;

            public C0974a(IBinder iBinder) {
                this.f21974a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f21974a;
            }

            @Override // defpackage.ipc
            public void onApplyLocationPermission() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_manager_export.listener.IBgLocationPermissionListener");
                    this.f21974a.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "com.xiaomi.fitness.sport_manager_export.listener.IBgLocationPermissionListener");
        }

        public static ipc asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.fitness.sport_manager_export.listener.IBgLocationPermissionListener");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ipc)) ? new C0974a(iBinder) : (ipc) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.xiaomi.fitness.sport_manager_export.listener.IBgLocationPermissionListener");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.xiaomi.fitness.sport_manager_export.listener.IBgLocationPermissionListener");
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            onApplyLocationPermission();
            return true;
        }
    }

    void onApplyLocationPermission() throws RemoteException;
}
