package com.xiaomi.smarthome.core.server.bluetooth;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes10.dex */
public interface IBleChannelWriter extends IInterface {

    public static class Default implements IBleChannelWriter {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.xiaomi.smarthome.core.server.bluetooth.IBleChannelWriter
        public void write(byte[] bArr, int i, IBleResponse iBleResponse) throws RemoteException {
        }

        @Override // com.xiaomi.smarthome.core.server.bluetooth.IBleChannelWriter
        public void writeWithOpCode(int i, byte[] bArr, int i2, IBleResponse iBleResponse) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IBleChannelWriter {
        private static final String DESCRIPTOR = "com.xiaomi.smarthome.core.server.bluetooth.IBleChannelWriter";
        static final int TRANSACTION_write = 1;
        static final int TRANSACTION_writeWithOpCode = 2;

        public static class Proxy implements IBleChannelWriter {
            public static IBleChannelWriter sDefaultImpl;
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            @Override // com.xiaomi.smarthome.core.server.bluetooth.IBleChannelWriter
            public void write(byte[] bArr, int i, IBleResponse iBleResponse) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (bArr == null) {
                        parcelObtain.writeInt(-1);
                    } else {
                        parcelObtain.writeInt(bArr.length);
                    }
                    parcelObtain.writeInt(i);
                    parcelObtain.writeStrongBinder(iBleResponse != null ? iBleResponse.asBinder() : null);
                    if (!this.mRemote.transact(1, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().write(bArr, i, iBleResponse);
                    } else {
                        parcelObtain2.readException();
                        parcelObtain2.readByteArray(bArr);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.smarthome.core.server.bluetooth.IBleChannelWriter
            public void writeWithOpCode(int i, byte[] bArr, int i2, IBleResponse iBleResponse) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    if (bArr == null) {
                        parcelObtain.writeInt(-1);
                    } else {
                        parcelObtain.writeInt(bArr.length);
                    }
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeStrongBinder(iBleResponse != null ? iBleResponse.asBinder() : null);
                    if (!this.mRemote.transact(2, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().writeWithOpCode(i, bArr, i2, iBleResponse);
                    } else {
                        parcelObtain2.readException();
                        parcelObtain2.readByteArray(bArr);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IBleChannelWriter asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IBleChannelWriter)) ? new Proxy(iBinder) : (IBleChannelWriter) iInterfaceQueryLocalInterface;
        }

        public static IBleChannelWriter getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IBleChannelWriter iBleChannelWriter) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iBleChannelWriter == null) {
                return false;
            }
            Proxy.sDefaultImpl = iBleChannelWriter;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            byte[] bArr;
            if (i == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                int i3 = parcel.readInt();
                bArr = i3 >= 0 ? new byte[i3] : null;
                write(bArr, parcel.readInt(), IBleResponse.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                parcel2.writeByteArray(bArr);
                return true;
            }
            if (i != 2) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
            parcel.enforceInterface(DESCRIPTOR);
            int i4 = parcel.readInt();
            int i5 = parcel.readInt();
            bArr = i5 >= 0 ? new byte[i5] : null;
            writeWithOpCode(i4, bArr, parcel.readInt(), IBleResponse.Stub.asInterface(parcel.readStrongBinder()));
            parcel2.writeNoException();
            parcel2.writeByteArray(bArr);
            return true;
        }
    }

    void write(byte[] bArr, int i, IBleResponse iBleResponse) throws RemoteException;

    void writeWithOpCode(int i, byte[] bArr, int i2, IBleResponse iBleResponse) throws RemoteException;
}
