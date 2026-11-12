package com.huawei.profile.profile;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes42.dex */
public interface StreamDataReader extends IInterface {
    public static final String DESCRIPTOR = "com.huawei.profile.profile.StreamDataReader";

    public static class Default implements StreamDataReader {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.huawei.profile.profile.StreamDataReader
        public byte[] read(int i) throws RemoteException {
            return null;
        }
    }

    byte[] read(int i) throws RemoteException;

    public static abstract class Stub extends Binder implements StreamDataReader {
        static final int TRANSACTION_read = 1;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, StreamDataReader.DESCRIPTOR);
        }

        public static StreamDataReader asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(StreamDataReader.DESCRIPTOR);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof StreamDataReader)) {
                return (StreamDataReader) iInterfaceQueryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(StreamDataReader.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(StreamDataReader.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                byte[] bArr = read(parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeByteArray(bArr);
                return true;
            }
            return super.onTransact(i, parcel, parcel2, i2);
        }

        static class Proxy implements StreamDataReader {
            private IBinder mRemote;

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return StreamDataReader.DESCRIPTOR;
            }

            @Override // com.huawei.profile.profile.StreamDataReader
            public byte[] read(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(StreamDataReader.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.createByteArray();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }
    }
}
