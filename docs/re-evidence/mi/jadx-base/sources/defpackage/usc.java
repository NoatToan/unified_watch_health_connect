package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public interface usc extends IInterface {

    public static abstract class a extends Binder implements usc {

        /* JADX INFO: renamed from: usc$a$a, reason: collision with other inner class name */
        public static class C1118a implements usc {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f36085a;

            public C1118a(IBinder iBinder) {
                this.f36085a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f36085a;
            }

            @Override // defpackage.usc
            public void onSuccess(boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.health.platform.client.impl.sdkservice.IGetIsInForegroundCallback");
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.f36085a.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public static usc s2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("androidx.health.platform.client.impl.sdkservice.IGetIsInForegroundCallback");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof usc)) ? new C1118a(iBinder) : (usc) iInterfaceQueryLocalInterface;
        }
    }

    void onSuccess(boolean z) throws RemoteException;
}
