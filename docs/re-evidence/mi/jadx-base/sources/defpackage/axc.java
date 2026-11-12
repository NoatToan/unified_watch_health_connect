package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes10.dex */
public interface axc extends IInterface {

    public static abstract class a extends Binder implements axc {

        /* JADX INFO: renamed from: axc$a$a, reason: collision with other inner class name */
        public static class C0094a implements axc {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f3536a;

            public C0094a(IBinder iBinder) {
                this.f3536a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f3536a;
            }

            @Override // defpackage.axc
            public void o5(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_xms.listener.IRemoteDeviceModeListener");
                    parcelObtain.writeInt(i);
                    this.f3536a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.axc
            public void onError(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_xms.listener.IRemoteDeviceModeListener");
                    parcelObtain.writeInt(i);
                    this.f3536a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public static axc s2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.fitness.sport_xms.listener.IRemoteDeviceModeListener");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof axc)) ? new C0094a(iBinder) : (axc) iInterfaceQueryLocalInterface;
        }
    }

    void o5(int i) throws RemoteException;

    void onError(int i) throws RemoteException;
}
