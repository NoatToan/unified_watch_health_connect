package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes10.dex */
public interface wwc extends IInterface {

    public static abstract class a extends Binder implements wwc {

        /* JADX INFO: renamed from: wwc$a$a, reason: collision with other inner class name */
        public static class C1140a implements wwc {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f38425a;

            public C1140a(IBinder iBinder) {
                this.f38425a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f38425a;
            }

            @Override // defpackage.wwc
            public void d5(long j) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_xms.listener.IRemoteAidongMemberListener");
                    parcelObtain.writeLong(j);
                    this.f38425a.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.wwc
            public void onError() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_xms.listener.IRemoteAidongMemberListener");
                    this.f38425a.transact(2, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public static wwc s2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.fitness.sport_xms.listener.IRemoteAidongMemberListener");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof wwc)) ? new C1140a(iBinder) : (wwc) iInterfaceQueryLocalInterface;
        }
    }

    void d5(long j) throws RemoteException;

    void onError() throws RemoteException;
}
