package com.xiaomi.eco.common.connect;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.clockwork.companion.partnerapi.EcoAppNotificationConfig;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public interface a extends IInterface {

    /* JADX INFO: renamed from: com.xiaomi.eco.common.connect.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0357a extends Binder implements a {
        static final int TRANSACTION_bind = 1;
        static final int TRANSACTION_bindV2 = 2;
        static final int TRANSACTION_call = 15;
        static final int TRANSACTION_callTimeout = 17;
        static final int TRANSACTION_callTimeoutWithData = 18;
        static final int TRANSACTION_callWithData = 16;
        static final int TRANSACTION_cancel = 11;
        static final int TRANSACTION_cancelTasks = 21;
        static final int TRANSACTION_connect = 3;
        static final int TRANSACTION_connectV2 = 4;
        static final int TRANSACTION_connectionType = 14;
        static final int TRANSACTION_destroy = 8;
        static final int TRANSACTION_disconnect = 7;
        static final int TRANSACTION_getName = 5;
        static final int TRANSACTION_isIDLE = 22;
        static final int TRANSACTION_readNotificationConfig = 13;
        static final int TRANSACTION_removeBond = 6;
        static final int TRANSACTION_resetBleManager = 9;
        static final int TRANSACTION_sendFile = 19;
        static final int TRANSACTION_sendMessage = 20;
        static final int TRANSACTION_setCurrent = 10;
        static final int TRANSACTION_setNotificationConfig = 12;

        /* JADX INFO: renamed from: com.xiaomi.eco.common.connect.a$a$a, reason: collision with other inner class name */
        public static class C0358a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f11286a;

            public C0358a(IBinder iBinder) {
                this.f11286a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f11286a;
            }

            @Override // com.xiaomi.eco.common.connect.a
            public void bind(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.eco.common.connect.IEcoApiCall");
                    parcelObtain.writeString(str);
                    this.f11286a.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.eco.common.connect.a
            public void bindV2(String str, String str2, String str3, String str4, String str5, String str6, boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.eco.common.connect.IEcoApiCall");
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeString(str3);
                    parcelObtain.writeString(str4);
                    parcelObtain.writeString(str5);
                    parcelObtain.writeString(str6);
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.f11286a.transact(2, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.eco.common.connect.a
            public int call(byte[] bArr, boolean z, com.xiaomi.eco.common.connect.b bVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.eco.common.connect.IEcoApiCall");
                    parcelObtain.writeByteArray(bArr);
                    parcelObtain.writeInt(z ? 1 : 0);
                    parcelObtain.writeStrongInterface(bVar);
                    this.f11286a.transact(15, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.eco.common.connect.a
            public int callTimeout(byte[] bArr, boolean z, com.xiaomi.eco.common.connect.b bVar, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.eco.common.connect.IEcoApiCall");
                    parcelObtain.writeByteArray(bArr);
                    parcelObtain.writeInt(z ? 1 : 0);
                    parcelObtain.writeStrongInterface(bVar);
                    parcelObtain.writeInt(i);
                    this.f11286a.transact(17, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.eco.common.connect.a
            public int callTimeoutWithData(int i, byte[] bArr, boolean z, com.xiaomi.eco.common.connect.b bVar, int i2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.eco.common.connect.IEcoApiCall");
                    parcelObtain.writeInt(i);
                    parcelObtain.writeByteArray(bArr);
                    parcelObtain.writeInt(z ? 1 : 0);
                    parcelObtain.writeStrongInterface(bVar);
                    parcelObtain.writeInt(i2);
                    this.f11286a.transact(18, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.eco.common.connect.a
            public int callWithData(int i, byte[] bArr, boolean z, com.xiaomi.eco.common.connect.b bVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.eco.common.connect.IEcoApiCall");
                    parcelObtain.writeInt(i);
                    parcelObtain.writeByteArray(bArr);
                    parcelObtain.writeInt(z ? 1 : 0);
                    parcelObtain.writeStrongInterface(bVar);
                    this.f11286a.transact(16, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.eco.common.connect.a
            public void cancel(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.eco.common.connect.IEcoApiCall");
                    parcelObtain.writeInt(i);
                    this.f11286a.transact(11, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.eco.common.connect.a
            public void cancelTasks(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.eco.common.connect.IEcoApiCall");
                    parcelObtain.writeInt(i);
                    this.f11286a.transact(21, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.eco.common.connect.a
            public void connect(String str, byte[] bArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.eco.common.connect.IEcoApiCall");
                    parcelObtain.writeString(str);
                    parcelObtain.writeByteArray(bArr);
                    this.f11286a.transact(3, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.eco.common.connect.a
            public void connectV2(String str, byte[] bArr, String str2, String str3, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.eco.common.connect.IEcoApiCall");
                    parcelObtain.writeString(str);
                    parcelObtain.writeByteArray(bArr);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeString(str3);
                    parcelObtain.writeInt(i);
                    this.f11286a.transact(4, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.eco.common.connect.a
            public int connectionType() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.eco.common.connect.IEcoApiCall");
                    this.f11286a.transact(14, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.eco.common.connect.a
            public void destroy() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.eco.common.connect.IEcoApiCall");
                    this.f11286a.transact(8, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.eco.common.connect.a
            public void disconnect() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.eco.common.connect.IEcoApiCall");
                    this.f11286a.transact(7, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.eco.common.connect.a
            public String getName() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.eco.common.connect.IEcoApiCall");
                    this.f11286a.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.eco.common.connect.a
            public boolean isIDLE() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.eco.common.connect.IEcoApiCall");
                    this.f11286a.transact(22, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.eco.common.connect.a
            public void readNotificationConfig() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.eco.common.connect.IEcoApiCall");
                    this.f11286a.transact(13, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.eco.common.connect.a
            public void removeBond() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.eco.common.connect.IEcoApiCall");
                    this.f11286a.transact(6, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.eco.common.connect.a
            public void resetBleManager() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.eco.common.connect.IEcoApiCall");
                    this.f11286a.transact(9, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.eco.common.connect.a
            public int sendFile(int i, int i2, String str, int i3, int i4, IEcoMassDataCallback iEcoMassDataCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.eco.common.connect.IEcoApiCall");
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i3);
                    parcelObtain.writeInt(i4);
                    parcelObtain.writeStrongInterface(iEcoMassDataCallback);
                    this.f11286a.transact(19, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.eco.common.connect.a
            public void sendMessage(String str, String str2, byte[] bArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.eco.common.connect.IEcoApiCall");
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeByteArray(bArr);
                    this.f11286a.transact(20, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.eco.common.connect.a
            public void setCurrent(boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.eco.common.connect.IEcoApiCall");
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.f11286a.transact(10, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.eco.common.connect.a
            public void setNotificationConfig(List<EcoAppNotificationConfig> list) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.eco.common.connect.IEcoApiCall");
                    b.b(parcelObtain, list, 0);
                    this.f11286a.transact(12, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public AbstractBinderC0357a() {
            attachInterface(this, "com.xiaomi.eco.common.connect.IEcoApiCall");
        }

        public static a asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.eco.common.connect.IEcoApiCall");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof a)) ? new C0358a(iBinder) : (a) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.xiaomi.eco.common.connect.IEcoApiCall");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.xiaomi.eco.common.connect.IEcoApiCall");
                return true;
            }
            switch (i) {
                case 1:
                    bind(parcel.readString());
                    return true;
                case 2:
                    bindV2(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
                    return true;
                case 3:
                    connect(parcel.readString(), parcel.createByteArray());
                    return true;
                case 4:
                    connectV2(parcel.readString(), parcel.createByteArray(), parcel.readString(), parcel.readString(), parcel.readInt());
                    return true;
                case 5:
                    String name = getName();
                    parcel2.writeNoException();
                    parcel2.writeString(name);
                    return true;
                case 6:
                    removeBond();
                    return true;
                case 7:
                    disconnect();
                    return true;
                case 8:
                    destroy();
                    return true;
                case 9:
                    resetBleManager();
                    return true;
                case 10:
                    setCurrent(parcel.readInt() != 0);
                    return true;
                case 11:
                    cancel(parcel.readInt());
                    return true;
                case 12:
                    setNotificationConfig(parcel.createTypedArrayList(EcoAppNotificationConfig.CREATOR));
                    return true;
                case 13:
                    readNotificationConfig();
                    return true;
                case 14:
                    int iConnectionType = connectionType();
                    parcel2.writeNoException();
                    parcel2.writeInt(iConnectionType);
                    return true;
                case 15:
                    int iCall = call(parcel.createByteArray(), parcel.readInt() != 0, com.xiaomi.eco.common.connect.b.a.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(iCall);
                    return true;
                case 16:
                    int iCallWithData = callWithData(parcel.readInt(), parcel.createByteArray(), parcel.readInt() != 0, com.xiaomi.eco.common.connect.b.a.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(iCallWithData);
                    return true;
                case 17:
                    int iCallTimeout = callTimeout(parcel.createByteArray(), parcel.readInt() != 0, com.xiaomi.eco.common.connect.b.a.asInterface(parcel.readStrongBinder()), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(iCallTimeout);
                    return true;
                case 18:
                    int iCallTimeoutWithData = callTimeoutWithData(parcel.readInt(), parcel.createByteArray(), parcel.readInt() != 0, com.xiaomi.eco.common.connect.b.a.asInterface(parcel.readStrongBinder()), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(iCallTimeoutWithData);
                    return true;
                case 19:
                    int iSendFile = sendFile(parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readInt(), IEcoMassDataCallback.a.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(iSendFile);
                    return true;
                case 20:
                    sendMessage(parcel.readString(), parcel.readString(), parcel.createByteArray());
                    parcel2.writeNoException();
                    return true;
                case 21:
                    cancelTasks(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 22:
                    boolean zIsIDLE = isIDLE();
                    parcel2.writeNoException();
                    parcel2.writeInt(zIsIDLE ? 1 : 0);
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    public static class b {
        public static <T extends Parcelable> void b(Parcel parcel, List<T> list, int i) {
            if (list == null) {
                parcel.writeInt(-1);
                return;
            }
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                c(parcel, list.get(i2), i);
            }
        }

        public static <T extends Parcelable> void c(Parcel parcel, T t, int i) {
            if (t == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
            }
        }
    }

    void bind(String str) throws RemoteException;

    void bindV2(String str, String str2, String str3, String str4, String str5, String str6, boolean z) throws RemoteException;

    int call(byte[] bArr, boolean z, com.xiaomi.eco.common.connect.b bVar) throws RemoteException;

    int callTimeout(byte[] bArr, boolean z, com.xiaomi.eco.common.connect.b bVar, int i) throws RemoteException;

    int callTimeoutWithData(int i, byte[] bArr, boolean z, com.xiaomi.eco.common.connect.b bVar, int i2) throws RemoteException;

    int callWithData(int i, byte[] bArr, boolean z, com.xiaomi.eco.common.connect.b bVar) throws RemoteException;

    void cancel(int i) throws RemoteException;

    void cancelTasks(int i) throws RemoteException;

    void connect(String str, byte[] bArr) throws RemoteException;

    void connectV2(String str, byte[] bArr, String str2, String str3, int i) throws RemoteException;

    int connectionType() throws RemoteException;

    void destroy() throws RemoteException;

    void disconnect() throws RemoteException;

    String getName() throws RemoteException;

    boolean isIDLE() throws RemoteException;

    void readNotificationConfig() throws RemoteException;

    void removeBond() throws RemoteException;

    void resetBleManager() throws RemoteException;

    int sendFile(int i, int i2, String str, int i3, int i4, IEcoMassDataCallback iEcoMassDataCallback) throws RemoteException;

    void sendMessage(String str, String str2, byte[] bArr) throws RemoteException;

    void setCurrent(boolean z) throws RemoteException;

    void setNotificationConfig(List<EcoAppNotificationConfig> list) throws RemoteException;
}
