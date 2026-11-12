package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes5.dex */
public interface vuo extends IInterface {

    public static abstract class a extends Binder implements vuo {

        /* JADX INFO: renamed from: vuo$a$a, reason: collision with other inner class name */
        public static class C1127a implements vuo {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f37241a;

            public C1127a(IBinder iBinder) {
                this.f37241a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f37241a;
            }

            @Override // defpackage.vuo
            public void onSuccess(boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.mi.command.callback.SyncWebStatusCallback");
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.f37241a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public static vuo s2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.mi.command.callback.SyncWebStatusCallback");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof vuo)) ? new C1127a(iBinder) : (vuo) iInterfaceQueryLocalInterface;
        }
    }

    void onSuccess(boolean z) throws RemoteException;
}
