package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes10.dex */
public interface zwc extends IInterface {

    public static abstract class a extends Binder implements zwc {

        /* JADX INFO: renamed from: zwc$a$a, reason: collision with other inner class name */
        public static class C1171a implements zwc {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f41746a;

            public C1171a(IBinder iBinder) {
                this.f41746a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f41746a;
            }

            @Override // defpackage.zwc
            public void onConnectFailure(String str, int i, int i2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_xms.listener.IRemoteDeviceConnectedListener");
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    this.f41746a.transact(2, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.zwc
            public void onConnectStart(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_xms.listener.IRemoteDeviceConnectedListener");
                    parcelObtain.writeString(str);
                    this.f41746a.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.zwc
            public void onConnectSuccess(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_xms.listener.IRemoteDeviceConnectedListener");
                    parcelObtain.writeString(str);
                    this.f41746a.transact(3, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.zwc
            public void onDisconnect(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_xms.listener.IRemoteDeviceConnectedListener");
                    parcelObtain.writeString(str);
                    this.f41746a.transact(4, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public static zwc s2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.fitness.sport_xms.listener.IRemoteDeviceConnectedListener");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof zwc)) ? new C1171a(iBinder) : (zwc) iInterfaceQueryLocalInterface;
        }
    }

    void onConnectFailure(String str, int i, int i2) throws RemoteException;

    void onConnectStart(String str) throws RemoteException;

    void onConnectSuccess(String str) throws RemoteException;

    void onDisconnect(String str) throws RemoteException;
}
