package com.miui.tsmclient.service;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.miui.tsmclient.smartcard.terminal.SmartMxError;

/* JADX INFO: loaded from: classes6.dex */
public interface ITsmTerminalService extends IInterface {
    public static final String DESCRIPTOR = "com.miui.tsmclient.service.ITsmTerminalService";

    public static class Default implements ITsmTerminalService {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.miui.tsmclient.service.ITsmTerminalService
        public void checkNfcEEStatus(SmartMxError smartMxError) throws RemoteException {
        }

        @Override // com.miui.tsmclient.service.ITsmTerminalService
        public void close(SmartMxError smartMxError) throws RemoteException {
        }

        @Override // com.miui.tsmclient.service.ITsmTerminalService
        public String getSignedSpiPK(SmartMxError smartMxError) throws RemoteException {
            return null;
        }

        @Override // com.miui.tsmclient.service.ITsmTerminalService
        public void open(SmartMxError smartMxError, IBinder iBinder) throws RemoteException {
        }

        @Override // com.miui.tsmclient.service.ITsmTerminalService
        public byte[] transmit(byte[] bArr, SmartMxError smartMxError) throws RemoteException {
            return null;
        }
    }

    public static abstract class Stub extends Binder implements ITsmTerminalService {
        static final int TRANSACTION_checkNfcEEStatus = 4;
        static final int TRANSACTION_close = 2;
        static final int TRANSACTION_getSignedSpiPK = 5;
        static final int TRANSACTION_open = 1;
        static final int TRANSACTION_transmit = 3;

        public static class Proxy implements ITsmTerminalService {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.miui.tsmclient.service.ITsmTerminalService
            public void checkNfcEEStatus(SmartMxError smartMxError) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ITsmTerminalService.DESCRIPTOR);
                    this.mRemote.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    if (parcelObtain2.readInt() != 0) {
                        smartMxError.readFromParcel(parcelObtain2);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.miui.tsmclient.service.ITsmTerminalService
            public void close(SmartMxError smartMxError) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ITsmTerminalService.DESCRIPTOR);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    if (parcelObtain2.readInt() != 0) {
                        smartMxError.readFromParcel(parcelObtain2);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return ITsmTerminalService.DESCRIPTOR;
            }

            @Override // com.miui.tsmclient.service.ITsmTerminalService
            public String getSignedSpiPK(SmartMxError smartMxError) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ITsmTerminalService.DESCRIPTOR);
                    this.mRemote.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    String string = parcelObtain2.readString();
                    if (parcelObtain2.readInt() != 0) {
                        smartMxError.readFromParcel(parcelObtain2);
                    }
                    return string;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.miui.tsmclient.service.ITsmTerminalService
            public void open(SmartMxError smartMxError, IBinder iBinder) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ITsmTerminalService.DESCRIPTOR);
                    parcelObtain.writeStrongBinder(iBinder);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    if (parcelObtain2.readInt() != 0) {
                        smartMxError.readFromParcel(parcelObtain2);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.miui.tsmclient.service.ITsmTerminalService
            public byte[] transmit(byte[] bArr, SmartMxError smartMxError) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ITsmTerminalService.DESCRIPTOR);
                    parcelObtain.writeByteArray(bArr);
                    this.mRemote.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    byte[] bArrCreateByteArray = parcelObtain2.createByteArray();
                    if (parcelObtain2.readInt() != 0) {
                        smartMxError.readFromParcel(parcelObtain2);
                    }
                    return bArrCreateByteArray;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, ITsmTerminalService.DESCRIPTOR);
        }

        public static ITsmTerminalService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(ITsmTerminalService.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ITsmTerminalService)) ? new Proxy(iBinder) : (ITsmTerminalService) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(ITsmTerminalService.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(ITsmTerminalService.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                SmartMxError smartMxError = new SmartMxError();
                open(smartMxError, parcel.readStrongBinder());
                parcel2.writeNoException();
                _Parcel.writeTypedObject(parcel2, smartMxError, 1);
            } else if (i == 2) {
                SmartMxError smartMxError2 = new SmartMxError();
                close(smartMxError2);
                parcel2.writeNoException();
                _Parcel.writeTypedObject(parcel2, smartMxError2, 1);
            } else if (i == 3) {
                byte[] bArrCreateByteArray = parcel.createByteArray();
                SmartMxError smartMxError3 = new SmartMxError();
                byte[] bArrTransmit = transmit(bArrCreateByteArray, smartMxError3);
                parcel2.writeNoException();
                parcel2.writeByteArray(bArrTransmit);
                _Parcel.writeTypedObject(parcel2, smartMxError3, 1);
            } else if (i == 4) {
                SmartMxError smartMxError4 = new SmartMxError();
                checkNfcEEStatus(smartMxError4);
                parcel2.writeNoException();
                _Parcel.writeTypedObject(parcel2, smartMxError4, 1);
            } else {
                if (i != 5) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                SmartMxError smartMxError5 = new SmartMxError();
                String signedSpiPK = getSignedSpiPK(smartMxError5);
                parcel2.writeNoException();
                parcel2.writeString(signedSpiPK);
                _Parcel.writeTypedObject(parcel2, smartMxError5, 1);
            }
            return true;
        }
    }

    public static class _Parcel {
        private static <T> T readTypedObject(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static <T extends Parcelable> void writeTypedObject(Parcel parcel, T t, int i) {
            if (t == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
            }
        }
    }

    void checkNfcEEStatus(SmartMxError smartMxError) throws RemoteException;

    void close(SmartMxError smartMxError) throws RemoteException;

    String getSignedSpiPK(SmartMxError smartMxError) throws RemoteException;

    void open(SmartMxError smartMxError, IBinder iBinder) throws RemoteException;

    byte[] transmit(byte[] bArr, SmartMxError smartMxError) throws RemoteException;
}
