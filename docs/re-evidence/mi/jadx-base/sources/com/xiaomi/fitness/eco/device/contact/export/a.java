package com.xiaomi.fitness.eco.device.contact.export;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes8.dex */
public interface a extends IInterface {

    /* JADX INFO: renamed from: com.xiaomi.fitness.eco.device.contact.export.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0543a extends Binder implements a {
        static final int TRANSACTION_handleDataInternal = 1;
        static final int TRANSACTION_handleEcoData = 3;
        static final int TRANSACTION_handleEcoDataInternal = 2;
        static final int TRANSACTION_updateDid = 4;

        /* JADX INFO: renamed from: com.xiaomi.fitness.eco.device.contact.export.a$a$a, reason: collision with other inner class name */
        public static class C0544a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f12070a;

            public C0544a(IBinder iBinder) {
                this.f12070a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f12070a;
            }

            @Override // com.xiaomi.fitness.eco.device.contact.export.a
            public boolean handleDataInternal(String str, int i, byte[] bArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.eco.device.contact.export.EcoDataHandlerRemote");
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeByteArray(bArr);
                    this.f12070a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.fitness.eco.device.contact.export.a
            public boolean handleEcoDataInternal(String str, int i, byte[] bArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.eco.device.contact.export.EcoDataHandlerRemote");
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeByteArray(bArr);
                    this.f12070a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.fitness.eco.device.contact.export.a, com.xiaomi.fitness.eco.device.contact.export.EcoDataHandler
            public void updateDid(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.eco.device.contact.export.EcoDataHandlerRemote");
                    parcelObtain.writeString(str);
                    this.f12070a.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public AbstractBinderC0543a() {
            attachInterface(this, "com.xiaomi.fitness.eco.device.contact.export.EcoDataHandlerRemote");
        }

        public static a asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.fitness.eco.device.contact.export.EcoDataHandlerRemote");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof a)) ? new C0544a(iBinder) : (a) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.xiaomi.fitness.eco.device.contact.export.EcoDataHandlerRemote");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.xiaomi.fitness.eco.device.contact.export.EcoDataHandlerRemote");
                return true;
            }
            if (i == 1) {
                boolean zHandleDataInternal = handleDataInternal(parcel.readString(), parcel.readInt(), parcel.createByteArray());
                parcel2.writeNoException();
                parcel2.writeInt(zHandleDataInternal ? 1 : 0);
            } else if (i == 2) {
                boolean zHandleEcoDataInternal = handleEcoDataInternal(parcel.readString(), parcel.readInt(), parcel.createByteArray());
                parcel2.writeNoException();
                parcel2.writeInt(zHandleEcoDataInternal ? 1 : 0);
            } else if (i == 3) {
                handleEcoData(parcel.readString(), parcel.readString(), parcel.createByteArray());
                parcel2.writeNoException();
            } else {
                if (i != 4) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                updateDid(parcel.readString());
                parcel2.writeNoException();
            }
            return true;
        }
    }

    boolean handleDataInternal(String str, int i, byte[] bArr) throws RemoteException;

    void handleEcoData(String str, String str2, byte[] bArr) throws RemoteException;

    boolean handleEcoDataInternal(String str, int i, byte[] bArr) throws RemoteException;

    void updateDid(String str) throws RemoteException;
}
