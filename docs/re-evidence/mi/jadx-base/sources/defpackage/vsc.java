package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public interface vsc extends IInterface {

    public static abstract class a extends Binder implements vsc {

        /* JADX INFO: renamed from: vsc$a$a, reason: collision with other inner class name */
        public static class C1124a implements vsc {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f37183a;

            public C1124a(IBinder iBinder) {
                this.f37183a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f37183a;
            }

            @Override // defpackage.vsc
            public void onSuccess(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.health.platform.client.impl.sdkservice.IGetPermissionTokenCallback");
                    parcelObtain.writeString(str);
                    this.f37183a.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public static vsc s2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("androidx.health.platform.client.impl.sdkservice.IGetPermissionTokenCallback");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof vsc)) ? new C1124a(iBinder) : (vsc) iInterfaceQueryLocalInterface;
        }
    }

    void onSuccess(String str) throws RemoteException;
}
