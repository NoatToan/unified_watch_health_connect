package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public interface lyc extends IInterface {

    public static abstract class a extends Binder implements lyc {

        /* JADX INFO: renamed from: lyc$a$a, reason: collision with other inner class name */
        public static class C1013a implements lyc {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f25551a;

            public C1013a(IBinder iBinder) {
                this.f25551a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f25551a;
            }

            @Override // defpackage.lyc
            public void onSuccess() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.health.platform.client.impl.sdkservice.ISetPermissionTokenCallback");
                    this.f25551a.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public static lyc s2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("androidx.health.platform.client.impl.sdkservice.ISetPermissionTokenCallback");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof lyc)) ? new C1013a(iBinder) : (lyc) iInterfaceQueryLocalInterface;
        }
    }

    void onSuccess() throws RemoteException;
}
