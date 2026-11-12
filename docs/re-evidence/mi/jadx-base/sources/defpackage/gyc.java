package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public interface gyc extends IInterface {

    public static abstract class a extends Binder implements gyc {

        /* JADX INFO: renamed from: gyc$a$a, reason: collision with other inner class name */
        public static class C0950a implements gyc {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f19461a;

            public C0950a(IBinder iBinder) {
                this.f19461a = iBinder;
            }

            @Override // defpackage.gyc
            public void S0() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.xms.wearable.IServiceConnectedListener");
                    this.f19461a.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f19461a;
            }
        }

        public static gyc s2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.xms.wearable.IServiceConnectedListener");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof gyc)) ? new C0950a(iBinder) : (gyc) iInterfaceQueryLocalInterface;
        }
    }

    void S0() throws RemoteException;
}
