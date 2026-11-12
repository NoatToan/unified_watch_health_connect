package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.xiaomi.fitness.device.manager.remote.DeviceModelRemote;

/* JADX INFO: loaded from: classes9.dex */
public interface y56 extends IInterface {

    public static abstract class a extends Binder implements y56 {
        static final int TRANSACTION_getCurrentDeviceModel = 8;
        static final int TRANSACTION_getCurrentStatus = 2;
        static final int TRANSACTION_getDeviceInfo = 3;
        static final int TRANSACTION_getDeviceModel = 4;
        static final int TRANSACTION_getDeviceStatus = 6;
        static final int TRANSACTION_getVersion = 9;
        static final int TRANSACTION_isConnected = 5;
        static final int TRANSACTION_isCurrentConnected = 1;
        static final int TRANSACTION_setDeviceStatus = 7;

        /* JADX INFO: renamed from: y56$a$a, reason: collision with other inner class name */
        public static class C1154a implements y56 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f39803a;

            public C1154a(IBinder iBinder) {
                this.f39803a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f39803a;
            }

            @Override // defpackage.y56
            public DeviceModelRemote getCurrentDeviceModel() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.research.DeviceInfoFetcher");
                    this.f39803a.transact(8, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (DeviceModelRemote) b.c(parcelObtain2, DeviceModelRemote.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.y56
            public int getCurrentStatus() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.research.DeviceInfoFetcher");
                    this.f39803a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.y56
            public String getDeviceInfo(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.research.DeviceInfoFetcher");
                    parcelObtain.writeString(str);
                    this.f39803a.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.y56
            public DeviceModelRemote getDeviceModel(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.research.DeviceInfoFetcher");
                    parcelObtain.writeString(str);
                    this.f39803a.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (DeviceModelRemote) b.c(parcelObtain2, DeviceModelRemote.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.y56
            public int getDeviceStatus(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.research.DeviceInfoFetcher");
                    parcelObtain.writeString(str);
                    this.f39803a.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.y56
            public boolean isConnected(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.research.DeviceInfoFetcher");
                    parcelObtain.writeString(str);
                    this.f39803a.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.y56
            public boolean isCurrentConnected() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.research.DeviceInfoFetcher");
                    this.f39803a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.y56
            public void setDeviceStatus(String str, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.research.DeviceInfoFetcher");
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    this.f39803a.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "com.xiaomi.fitness.research.DeviceInfoFetcher");
        }

        public static y56 asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.fitness.research.DeviceInfoFetcher");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof y56)) ? new C1154a(iBinder) : (y56) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.xiaomi.fitness.research.DeviceInfoFetcher");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.xiaomi.fitness.research.DeviceInfoFetcher");
                return true;
            }
            switch (i) {
                case 1:
                    boolean zIsCurrentConnected = isCurrentConnected();
                    parcel2.writeNoException();
                    parcel2.writeInt(zIsCurrentConnected ? 1 : 0);
                    return true;
                case 2:
                    int currentStatus = getCurrentStatus();
                    parcel2.writeNoException();
                    parcel2.writeInt(currentStatus);
                    return true;
                case 3:
                    String deviceInfo = getDeviceInfo(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeString(deviceInfo);
                    return true;
                case 4:
                    DeviceModelRemote deviceModel = getDeviceModel(parcel.readString());
                    parcel2.writeNoException();
                    b.d(parcel2, deviceModel, 1);
                    return true;
                case 5:
                    boolean zIsConnected = isConnected(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(zIsConnected ? 1 : 0);
                    return true;
                case 6:
                    int deviceStatus = getDeviceStatus(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(deviceStatus);
                    return true;
                case 7:
                    setDeviceStatus(parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 8:
                    DeviceModelRemote currentDeviceModel = getCurrentDeviceModel();
                    parcel2.writeNoException();
                    b.d(parcel2, currentDeviceModel, 1);
                    return true;
                case 9:
                    int version = getVersion();
                    parcel2.writeNoException();
                    parcel2.writeInt(version);
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    public static class b {
        public static <T> T c(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        public static <T extends Parcelable> void d(Parcel parcel, T t, int i) {
            if (t == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
            }
        }
    }

    DeviceModelRemote getCurrentDeviceModel() throws RemoteException;

    int getCurrentStatus() throws RemoteException;

    String getDeviceInfo(String str) throws RemoteException;

    DeviceModelRemote getDeviceModel(String str) throws RemoteException;

    int getDeviceStatus(String str) throws RemoteException;

    int getVersion() throws RemoteException;

    boolean isConnected(String str) throws RemoteException;

    boolean isCurrentConnected() throws RemoteException;

    void setDeviceStatus(String str, int i) throws RemoteException;
}
