package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes10.dex */
public interface cxc extends IInterface {

    public static abstract class a extends Binder implements cxc {

        /* JADX INFO: renamed from: cxc$a$a, reason: collision with other inner class name */
        public static class C0906a implements cxc {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f14827a;

            public C0906a(IBinder iBinder) {
                this.f14827a = iBinder;
            }

            @Override // defpackage.cxc
            public void C0(boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_xms.listener.IRemoteIsDeviceSportingListener");
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.f14827a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f14827a;
            }
        }

        public static cxc s2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.fitness.sport_xms.listener.IRemoteIsDeviceSportingListener");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof cxc)) ? new C0906a(iBinder) : (cxc) iInterfaceQueryLocalInterface;
        }
    }

    void C0(boolean z) throws RemoteException;
}
