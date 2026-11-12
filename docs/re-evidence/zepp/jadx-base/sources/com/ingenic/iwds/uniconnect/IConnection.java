package com.ingenic.iwds.uniconnect;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes18.dex */
public interface IConnection extends IInterface {

    public static abstract class Stub extends Binder implements IConnection {
        public static final int PackageHeaderSize = 10;
        private byte[] a = null;

        public static class a implements IConnection {
            private IBinder a;

            public a(IBinder iBinder) {
                this.a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.a;
            }

            @Override // com.ingenic.iwds.uniconnect.IConnection
            public int available() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.ingenic.iwds.uniconnect.IConnection");
                    this.a.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ingenic.iwds.uniconnect.IConnection
            public void close() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.ingenic.iwds.uniconnect.IConnection");
                    this.a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ingenic.iwds.uniconnect.IConnection
            public int getMaxPayloadSize() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.ingenic.iwds.uniconnect.IConnection");
                    this.a.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ingenic.iwds.uniconnect.IConnection
            public int handshake() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.ingenic.iwds.uniconnect.IConnection");
                    this.a.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ingenic.iwds.uniconnect.IConnection
            public long open(String str, int i, String str2, String str3) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.ingenic.iwds.uniconnect.IConnection");
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeString(str3);
                    this.a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readLong();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ingenic.iwds.uniconnect.IConnection
            public int read(byte[] bArr, int i, int i2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.ingenic.iwds.uniconnect.IConnection");
                    if (bArr == null) {
                        parcelObtain.writeInt(-1);
                    } else {
                        parcelObtain.writeInt(i2);
                    }
                    this.a.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    int i3 = parcelObtain2.readInt();
                    if (i3 >= 0) {
                        System.arraycopy(parcelObtain2.createByteArray(), 0, bArr, i, i3);
                    }
                    return i3;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ingenic.iwds.uniconnect.IConnection
            public int write(byte[] bArr, int i, int i2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.ingenic.iwds.uniconnect.IConnection");
                    parcelObtain.writeByteArray(bArr, i, i2);
                    this.a.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, "com.ingenic.iwds.uniconnect.IConnection");
        }

        public static IConnection asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.ingenic.iwds.uniconnect.IConnection");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IConnection)) ? new a(iBinder) : (IConnection) iInterfaceQueryLocalInterface;
        }

        public void allocReadBuffer(int i) {
            this.a = new byte[i];
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1598968902) {
                parcel2.writeString("com.ingenic.iwds.uniconnect.IConnection");
                return true;
            }
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.ingenic.iwds.uniconnect.IConnection");
                    long jOpen = open(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeLong(jOpen);
                    return true;
                case 2:
                    parcel.enforceInterface("com.ingenic.iwds.uniconnect.IConnection");
                    close();
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface("com.ingenic.iwds.uniconnect.IConnection");
                    byte[] bArrCreateByteArray = parcel.createByteArray();
                    int iWrite = write(bArrCreateByteArray, 0, bArrCreateByteArray.length);
                    parcel2.writeNoException();
                    parcel2.writeInt(iWrite);
                    return true;
                case 4:
                    parcel.enforceInterface("com.ingenic.iwds.uniconnect.IConnection");
                    int i3 = parcel.readInt();
                    byte[] bArr = i3 < 0 ? null : this.a;
                    int i4 = read(bArr, 0, i3);
                    parcel2.writeNoException();
                    parcel2.writeInt(i4);
                    if (i4 >= 0) {
                        parcel2.writeByteArray(bArr);
                    }
                    return true;
                case 5:
                    parcel.enforceInterface("com.ingenic.iwds.uniconnect.IConnection");
                    int iAvailable = available();
                    parcel2.writeNoException();
                    parcel2.writeInt(iAvailable);
                    return true;
                case 6:
                    parcel.enforceInterface("com.ingenic.iwds.uniconnect.IConnection");
                    int iHandshake = handshake();
                    parcel2.writeNoException();
                    parcel2.writeInt(iHandshake);
                    return true;
                case 7:
                    parcel.enforceInterface("com.ingenic.iwds.uniconnect.IConnection");
                    int maxPayloadSize = getMaxPayloadSize();
                    parcel2.writeNoException();
                    parcel2.writeInt(maxPayloadSize);
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    int available() throws RemoteException;

    void close() throws RemoteException;

    int getMaxPayloadSize() throws RemoteException;

    int handshake() throws RemoteException;

    long open(String str, int i, String str2, String str3) throws RemoteException;

    int read(byte[] bArr, int i, int i2) throws RemoteException;

    int write(byte[] bArr, int i, int i2) throws RemoteException;
}
