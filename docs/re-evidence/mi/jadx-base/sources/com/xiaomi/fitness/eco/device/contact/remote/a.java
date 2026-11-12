package com.xiaomi.fitness.eco.device.contact.remote;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.xiaomi.eco.common.connect.IEcoMassDataCallback;
import com.xiaomi.fitness.eco.device.contact.export.b;

/* JADX INFO: loaded from: classes8.dex */
public interface a extends IInterface {

    /* JADX INFO: renamed from: com.xiaomi.fitness.eco.device.contact.remote.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0547a extends Binder implements a {
        static final int TRANSACTION_addDataHandler = 5;
        static final int TRANSACTION_callEco = 2;
        static final int TRANSACTION_callEcoTimeout = 3;
        static final int TRANSACTION_cancelTask = 4;
        static final int TRANSACTION_isIDLE = 1;
        static final int TRANSACTION_removeDataHandler = 6;
        static final int TRANSACTION_sendFile = 7;

        /* JADX INFO: renamed from: com.xiaomi.fitness.eco.device.contact.remote.a$a$a, reason: collision with other inner class name */
        public static class C0548a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f12072a;

            public C0548a(IBinder iBinder) {
                this.f12072a = iBinder;
            }

            @Override // com.xiaomi.fitness.eco.device.contact.remote.a
            public void addDataHandler(int i, com.xiaomi.fitness.eco.device.contact.export.a aVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.eco.device.contact.remote.EcoDeviceContactEngine");
                    parcelObtain.writeInt(i);
                    parcelObtain.writeStrongInterface(aVar);
                    this.f12072a.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f12072a;
            }

            @Override // com.xiaomi.fitness.eco.device.contact.remote.a
            public int callEco(String str, byte[] bArr, boolean z, b bVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.eco.device.contact.remote.EcoDeviceContactEngine");
                    parcelObtain.writeString(str);
                    parcelObtain.writeByteArray(bArr);
                    parcelObtain.writeInt(z ? 1 : 0);
                    parcelObtain.writeStrongInterface(bVar);
                    this.f12072a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.fitness.eco.device.contact.remote.a
            public int callEcoTimeout(String str, byte[] bArr, boolean z, b bVar, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.eco.device.contact.remote.EcoDeviceContactEngine");
                    parcelObtain.writeString(str);
                    parcelObtain.writeByteArray(bArr);
                    parcelObtain.writeInt(z ? 1 : 0);
                    parcelObtain.writeStrongInterface(bVar);
                    parcelObtain.writeInt(i);
                    this.f12072a.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.fitness.eco.device.contact.remote.a
            public void cancelTask(String str, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.eco.device.contact.remote.EcoDeviceContactEngine");
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    this.f12072a.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.fitness.eco.device.contact.remote.a
            public boolean isIDLE() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.eco.device.contact.remote.EcoDeviceContactEngine");
                    this.f12072a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.fitness.eco.device.contact.remote.a
            public void removeDataHandler(int i, com.xiaomi.fitness.eco.device.contact.export.a aVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.eco.device.contact.remote.EcoDeviceContactEngine");
                    parcelObtain.writeInt(i);
                    parcelObtain.writeStrongInterface(aVar);
                    this.f12072a.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.fitness.eco.device.contact.remote.a
            public int sendFile(String str, int i, int i2, String str2, int i3, int i4, IEcoMassDataCallback iEcoMassDataCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.eco.device.contact.remote.EcoDeviceContactEngine");
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeInt(i3);
                    parcelObtain.writeInt(i4);
                    parcelObtain.writeStrongInterface(iEcoMassDataCallback);
                    this.f12072a.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public AbstractBinderC0547a() {
            attachInterface(this, "com.xiaomi.fitness.eco.device.contact.remote.EcoDeviceContactEngine");
        }

        public static a asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.fitness.eco.device.contact.remote.EcoDeviceContactEngine");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof a)) ? new C0548a(iBinder) : (a) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.xiaomi.fitness.eco.device.contact.remote.EcoDeviceContactEngine");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.xiaomi.fitness.eco.device.contact.remote.EcoDeviceContactEngine");
                return true;
            }
            switch (i) {
                case 1:
                    boolean zIsIDLE = isIDLE();
                    parcel2.writeNoException();
                    parcel2.writeInt(zIsIDLE ? 1 : 0);
                    return true;
                case 2:
                    int iCallEco = callEco(parcel.readString(), parcel.createByteArray(), parcel.readInt() != 0, b.a.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(iCallEco);
                    return true;
                case 3:
                    int iCallEcoTimeout = callEcoTimeout(parcel.readString(), parcel.createByteArray(), parcel.readInt() != 0, b.a.asInterface(parcel.readStrongBinder()), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(iCallEcoTimeout);
                    return true;
                case 4:
                    cancelTask(parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 5:
                    addDataHandler(parcel.readInt(), com.xiaomi.fitness.eco.device.contact.export.a.AbstractBinderC0543a.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 6:
                    removeDataHandler(parcel.readInt(), com.xiaomi.fitness.eco.device.contact.export.a.AbstractBinderC0543a.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 7:
                    int iSendFile = sendFile(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readInt(), IEcoMassDataCallback.a.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(iSendFile);
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    void addDataHandler(int i, com.xiaomi.fitness.eco.device.contact.export.a aVar) throws RemoteException;

    int callEco(String str, byte[] bArr, boolean z, b bVar) throws RemoteException;

    int callEcoTimeout(String str, byte[] bArr, boolean z, b bVar, int i) throws RemoteException;

    void cancelTask(String str, int i) throws RemoteException;

    boolean isIDLE() throws RemoteException;

    void removeDataHandler(int i, com.xiaomi.fitness.eco.device.contact.export.a aVar) throws RemoteException;

    int sendFile(String str, int i, int i2, String str2, int i3, int i4, IEcoMassDataCallback iEcoMassDataCallback) throws RemoteException;
}
