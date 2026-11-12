package com.xiaomi.fitness.device.contact.remote;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import defpackage.nl5;
import defpackage.utc;

/* JADX INFO: loaded from: classes8.dex */
public interface a extends IInterface {

    /* JADX INFO: renamed from: com.xiaomi.fitness.device.contact.remote.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0416a extends Binder implements a {
        static final int TRANSACTION_addDataHandler = 8;
        static final int TRANSACTION_call = 2;
        static final int TRANSACTION_callTimeout = 4;
        static final int TRANSACTION_callTimeoutWithData = 5;
        static final int TRANSACTION_callWithData = 3;
        static final int TRANSACTION_cancelTask = 7;
        static final int TRANSACTION_isIDLE = 1;
        static final int TRANSACTION_removeDataHandler = 9;
        static final int TRANSACTION_sendFile = 6;

        /* JADX INFO: renamed from: com.xiaomi.fitness.device.contact.remote.a$a$a, reason: collision with other inner class name */
        public static class C0417a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f11898a;

            public C0417a(IBinder iBinder) {
                this.f11898a = iBinder;
            }

            @Override // com.xiaomi.fitness.device.contact.remote.a
            public void addDataHandler(nl5 nl5Var) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.device.contact.remote.DeviceContactEngine");
                    parcelObtain.writeStrongInterface(nl5Var);
                    this.f11898a.transact(8, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f11898a;
            }

            @Override // com.xiaomi.fitness.device.contact.remote.a
            public int call(String str, byte[] bArr, boolean z, com.xiaomi.fitness.device.contact.export.a aVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.device.contact.remote.DeviceContactEngine");
                    parcelObtain.writeString(str);
                    parcelObtain.writeByteArray(bArr);
                    parcelObtain.writeInt(z ? 1 : 0);
                    parcelObtain.writeStrongInterface(aVar);
                    this.f11898a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.fitness.device.contact.remote.a
            public int callTimeout(String str, byte[] bArr, boolean z, com.xiaomi.fitness.device.contact.export.a aVar, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.device.contact.remote.DeviceContactEngine");
                    parcelObtain.writeString(str);
                    parcelObtain.writeByteArray(bArr);
                    parcelObtain.writeInt(z ? 1 : 0);
                    parcelObtain.writeStrongInterface(aVar);
                    parcelObtain.writeInt(i);
                    this.f11898a.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.fitness.device.contact.remote.a
            public int callTimeoutWithData(String str, int i, byte[] bArr, boolean z, com.xiaomi.fitness.device.contact.export.a aVar, int i2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.device.contact.remote.DeviceContactEngine");
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeByteArray(bArr);
                    parcelObtain.writeInt(z ? 1 : 0);
                    parcelObtain.writeStrongInterface(aVar);
                    parcelObtain.writeInt(i2);
                    this.f11898a.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.fitness.device.contact.remote.a
            public int callWithData(String str, int i, byte[] bArr, boolean z, com.xiaomi.fitness.device.contact.export.a aVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.device.contact.remote.DeviceContactEngine");
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeByteArray(bArr);
                    parcelObtain.writeInt(z ? 1 : 0);
                    parcelObtain.writeStrongInterface(aVar);
                    this.f11898a.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.fitness.device.contact.remote.a
            public void cancelTask(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.device.contact.remote.DeviceContactEngine");
                    parcelObtain.writeInt(i);
                    this.f11898a.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.fitness.device.contact.remote.a
            public boolean isIDLE() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.device.contact.remote.DeviceContactEngine");
                    this.f11898a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.fitness.device.contact.remote.a
            public int sendFile(String str, int i, int i2, String str2, int i3, utc utcVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.device.contact.remote.DeviceContactEngine");
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeInt(i3);
                    parcelObtain.writeStrongInterface(utcVar);
                    this.f11898a.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public AbstractBinderC0416a() {
            attachInterface(this, "com.xiaomi.fitness.device.contact.remote.DeviceContactEngine");
        }

        public static a asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.fitness.device.contact.remote.DeviceContactEngine");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof a)) ? new C0417a(iBinder) : (a) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.xiaomi.fitness.device.contact.remote.DeviceContactEngine");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.xiaomi.fitness.device.contact.remote.DeviceContactEngine");
                return true;
            }
            switch (i) {
                case 1:
                    boolean zIsIDLE = isIDLE();
                    parcel2.writeNoException();
                    parcel2.writeInt(zIsIDLE ? 1 : 0);
                    return true;
                case 2:
                    int iCall = call(parcel.readString(), parcel.createByteArray(), parcel.readInt() != 0, com.xiaomi.fitness.device.contact.export.a.AbstractBinderC0414a.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(iCall);
                    return true;
                case 3:
                    int iCallWithData = callWithData(parcel.readString(), parcel.readInt(), parcel.createByteArray(), parcel.readInt() != 0, com.xiaomi.fitness.device.contact.export.a.AbstractBinderC0414a.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(iCallWithData);
                    return true;
                case 4:
                    int iCallTimeout = callTimeout(parcel.readString(), parcel.createByteArray(), parcel.readInt() != 0, com.xiaomi.fitness.device.contact.export.a.AbstractBinderC0414a.asInterface(parcel.readStrongBinder()), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(iCallTimeout);
                    return true;
                case 5:
                    int iCallTimeoutWithData = callTimeoutWithData(parcel.readString(), parcel.readInt(), parcel.createByteArray(), parcel.readInt() != 0, com.xiaomi.fitness.device.contact.export.a.AbstractBinderC0414a.asInterface(parcel.readStrongBinder()), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(iCallTimeoutWithData);
                    return true;
                case 6:
                    int iSendFile = sendFile(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readInt(), utc.a.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(iSendFile);
                    return true;
                case 7:
                    cancelTask(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 8:
                    addDataHandler(nl5.a.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 9:
                    removeDataHandler(parcel.readInt(), nl5.a.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    void addDataHandler(nl5 nl5Var) throws RemoteException;

    int call(String str, byte[] bArr, boolean z, com.xiaomi.fitness.device.contact.export.a aVar) throws RemoteException;

    int callTimeout(String str, byte[] bArr, boolean z, com.xiaomi.fitness.device.contact.export.a aVar, int i) throws RemoteException;

    int callTimeoutWithData(String str, int i, byte[] bArr, boolean z, com.xiaomi.fitness.device.contact.export.a aVar, int i2) throws RemoteException;

    int callWithData(String str, int i, byte[] bArr, boolean z, com.xiaomi.fitness.device.contact.export.a aVar) throws RemoteException;

    void cancelTask(int i) throws RemoteException;

    boolean isIDLE() throws RemoteException;

    void removeDataHandler(int i, nl5 nl5Var) throws RemoteException;

    int sendFile(String str, int i, int i2, String str2, int i3, utc utcVar) throws RemoteException;
}
