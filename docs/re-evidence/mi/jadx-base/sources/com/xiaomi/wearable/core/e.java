package com.xiaomi.wearable.core;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public interface e extends IInterface {

    public static abstract class a extends Binder implements e {
        static final int TRANSACTION_addDeviceDataHandler = 12;
        static final int TRANSACTION_addDeviceInfo = 5;
        static final int TRANSACTION_addDeviceStateListener = 20;
        static final int TRANSACTION_call = 10;
        static final int TRANSACTION_cancel = 11;
        static final int TRANSACTION_closeMassChannel = 17;
        static final int TRANSACTION_closeUnauthConnection = 24;
        static final int TRANSACTION_connect = 18;
        static final int TRANSACTION_disconnect = 19;
        static final int TRANSACTION_getCurrentDevice = 4;
        static final int TRANSACTION_getDeviceCapabilities = 8;
        static final int TRANSACTION_getDeviceCapabilitiesV2 = 25;
        static final int TRANSACTION_isIdle = 14;
        static final int TRANSACTION_openMassChannel = 15;
        static final int TRANSACTION_openUnauthConnection = 22;
        static final int TRANSACTION_removeAllDeviceInfo = 7;
        static final int TRANSACTION_removeDeviceDataHandler = 13;
        static final int TRANSACTION_removeDeviceInfo = 6;
        static final int TRANSACTION_removeDeviceStateListener = 21;
        static final int TRANSACTION_sendMassData = 16;
        static final int TRANSACTION_setAppCapabilities = 9;
        static final int TRANSACTION_setChannel = 1;
        static final int TRANSACTION_setCurrentDevice = 2;
        static final int TRANSACTION_setWearMode = 3;
        static final int TRANSACTION_unauthCall = 23;

        /* JADX INFO: renamed from: com.xiaomi.wearable.core.e$a$a, reason: collision with other inner class name */
        public static class C0863a implements e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f14384a;

            public C0863a(IBinder iBinder) {
                this.f14384a = iBinder;
            }

            @Override // com.xiaomi.wearable.core.e
            public void addDeviceDataHandler(String str, int i, c cVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.core.IMiWearCore");
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeStrongInterface(cVar);
                    this.f14384a.transact(12, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.core.e
            public void addDeviceInfo(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.core.IMiWearCore");
                    parcelObtain.writeString(str);
                    this.f14384a.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.core.e
            public void addDeviceStateListener(d dVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.core.IMiWearCore");
                    parcelObtain.writeStrongInterface(dVar);
                    this.f14384a.transact(20, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f14384a;
            }

            @Override // com.xiaomi.wearable.core.e
            public int call(int i, String str, byte[] bArr, boolean z, ICallback iCallback, int i2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.core.IMiWearCore");
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str);
                    parcelObtain.writeByteArray(bArr);
                    parcelObtain.writeInt(z ? 1 : 0);
                    parcelObtain.writeStrongInterface(iCallback);
                    parcelObtain.writeInt(i2);
                    this.f14384a.transact(10, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.core.e
            public boolean cancel(String str, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.core.IMiWearCore");
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    this.f14384a.transact(11, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.core.e
            public void closeMassChannel(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.core.IMiWearCore");
                    parcelObtain.writeInt(i);
                    this.f14384a.transact(17, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.core.e
            public void closeUnauthConnection(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.core.IMiWearCore");
                    parcelObtain.writeString(str);
                    this.f14384a.transact(24, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.core.e
            public void connect(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.core.IMiWearCore");
                    parcelObtain.writeString(str);
                    this.f14384a.transact(18, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.core.e
            public void disconnect(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.core.IMiWearCore");
                    parcelObtain.writeString(str);
                    this.f14384a.transact(19, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.core.e
            public DeviceInfo getCurrentDevice() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.core.IMiWearCore");
                    this.f14384a.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (DeviceInfo) b.c(parcelObtain2, DeviceInfo.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.core.e
            public int getDeviceCapabilities(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.core.IMiWearCore");
                    parcelObtain.writeString(str);
                    this.f14384a.transact(8, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.core.e
            public int getDeviceCapabilitiesV2(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.core.IMiWearCore");
                    parcelObtain.writeString(str);
                    this.f14384a.transact(25, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.core.e
            public boolean isIdle(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.core.IMiWearCore");
                    parcelObtain.writeString(str);
                    this.f14384a.transact(14, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.core.e
            public int openMassChannel(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.core.IMiWearCore");
                    parcelObtain.writeString(str);
                    this.f14384a.transact(15, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.core.e
            public void openUnauthConnection(String str, com.xiaomi.wearable.core.a aVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.core.IMiWearCore");
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongInterface(aVar);
                    this.f14384a.transact(22, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.core.e
            public void removeAllDeviceInfo() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.core.IMiWearCore");
                    this.f14384a.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.core.e
            public void removeDeviceInfo(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.core.IMiWearCore");
                    parcelObtain.writeString(str);
                    this.f14384a.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.core.e
            public void sendMassData(int i, byte[] bArr, ICallback iCallback, int i2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.core.IMiWearCore");
                    parcelObtain.writeInt(i);
                    parcelObtain.writeByteArray(bArr);
                    parcelObtain.writeStrongInterface(iCallback);
                    parcelObtain.writeInt(i2);
                    this.f14384a.transact(16, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.core.e
            public void setAppCapabilities(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.core.IMiWearCore");
                    parcelObtain.writeInt(i);
                    this.f14384a.transact(9, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.core.e
            public void setChannel(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.core.IMiWearCore");
                    parcelObtain.writeString(str);
                    this.f14384a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.core.e
            public void setCurrentDevice(String str, boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.core.IMiWearCore");
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.f14384a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.core.e
            public void setWearMode(String str, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.core.IMiWearCore");
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    this.f14384a.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.core.e
            public void unauthCall(String str, byte[] bArr, boolean z, ICallback iCallback, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.core.IMiWearCore");
                    parcelObtain.writeString(str);
                    parcelObtain.writeByteArray(bArr);
                    parcelObtain.writeInt(z ? 1 : 0);
                    parcelObtain.writeStrongInterface(iCallback);
                    parcelObtain.writeInt(i);
                    this.f14384a.transact(23, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "com.xiaomi.wearable.core.IMiWearCore");
        }

        public static e asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.wearable.core.IMiWearCore");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof e)) ? new C0863a(iBinder) : (e) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.xiaomi.wearable.core.IMiWearCore");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.xiaomi.wearable.core.IMiWearCore");
                return true;
            }
            switch (i) {
                case 1:
                    setChannel(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 2:
                    setCurrentDevice(parcel.readString(), parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 3:
                    setWearMode(parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 4:
                    DeviceInfo currentDevice = getCurrentDevice();
                    parcel2.writeNoException();
                    b.d(parcel2, currentDevice, 1);
                    return true;
                case 5:
                    addDeviceInfo(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 6:
                    removeDeviceInfo(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 7:
                    removeAllDeviceInfo();
                    parcel2.writeNoException();
                    return true;
                case 8:
                    int deviceCapabilities = getDeviceCapabilities(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(deviceCapabilities);
                    return true;
                case 9:
                    setAppCapabilities(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 10:
                    int iCall = call(parcel.readInt(), parcel.readString(), parcel.createByteArray(), parcel.readInt() != 0, ICallback.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(iCall);
                    return true;
                case 11:
                    boolean zCancel = cancel(parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(zCancel ? 1 : 0);
                    return true;
                case 12:
                    addDeviceDataHandler(parcel.readString(), parcel.readInt(), c.a.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 13:
                    removeDeviceDataHandler(parcel.readString(), parcel.readInt(), c.a.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 14:
                    boolean zIsIdle = isIdle(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(zIsIdle ? 1 : 0);
                    return true;
                case 15:
                    int iOpenMassChannel = openMassChannel(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(iOpenMassChannel);
                    return true;
                case 16:
                    sendMassData(parcel.readInt(), parcel.createByteArray(), ICallback.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 17:
                    closeMassChannel(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 18:
                    connect(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 19:
                    disconnect(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 20:
                    addDeviceStateListener(d.a.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 21:
                    removeDeviceStateListener(d.a.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 22:
                    openUnauthConnection(parcel.readString(), com.xiaomi.wearable.core.a.AbstractBinderC0858a.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 23:
                    unauthCall(parcel.readString(), parcel.createByteArray(), parcel.readInt() != 0, ICallback.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 24:
                    closeUnauthConnection(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 25:
                    int deviceCapabilitiesV2 = getDeviceCapabilitiesV2(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(deviceCapabilitiesV2);
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

    void addDeviceDataHandler(String str, int i, c cVar) throws RemoteException;

    void addDeviceInfo(String str) throws RemoteException;

    void addDeviceStateListener(d dVar) throws RemoteException;

    int call(int i, String str, byte[] bArr, boolean z, ICallback iCallback, int i2) throws RemoteException;

    boolean cancel(String str, int i) throws RemoteException;

    void closeMassChannel(int i) throws RemoteException;

    void closeUnauthConnection(String str) throws RemoteException;

    void connect(String str) throws RemoteException;

    void disconnect(String str) throws RemoteException;

    DeviceInfo getCurrentDevice() throws RemoteException;

    int getDeviceCapabilities(String str) throws RemoteException;

    int getDeviceCapabilitiesV2(String str) throws RemoteException;

    boolean isIdle(String str) throws RemoteException;

    int openMassChannel(String str) throws RemoteException;

    void openUnauthConnection(String str, com.xiaomi.wearable.core.a aVar) throws RemoteException;

    void removeAllDeviceInfo() throws RemoteException;

    void removeDeviceDataHandler(String str, int i, c cVar) throws RemoteException;

    void removeDeviceInfo(String str) throws RemoteException;

    void removeDeviceStateListener(d dVar) throws RemoteException;

    void sendMassData(int i, byte[] bArr, ICallback iCallback, int i2) throws RemoteException;

    void setAppCapabilities(int i) throws RemoteException;

    void setChannel(String str) throws RemoteException;

    void setCurrentDevice(String str, boolean z) throws RemoteException;

    void setWearMode(String str, int i) throws RemoteException;

    void unauthCall(String str, byte[] bArr, boolean z, ICallback iCallback, int i) throws RemoteException;
}
