package com.miui.tsmclient.service;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.miui.tsmclient.smartcard.terminal.SmartMxError;

/* JADX INFO: loaded from: classes6.dex */
public interface INfcConfigService extends IInterface {
    public static final String DESCRIPTOR = "com.miui.tsmclient.service.INfcConfigService";

    public static class Default implements INfcConfigService {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.miui.tsmclient.service.INfcConfigService
        public boolean setConfig(String str, SmartMxError smartMxError) throws RemoteException {
            return false;
        }

        @Override // com.miui.tsmclient.service.INfcConfigService
        public boolean setConfigByUrl(String str, SmartMxError smartMxError) throws RemoteException {
            return false;
        }
    }

    public static abstract class Stub extends Binder implements INfcConfigService {
        static final int TRANSACTION_setConfig = 1;
        static final int TRANSACTION_setConfigByUrl = 2;

        public static class Proxy implements INfcConfigService {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return INfcConfigService.DESCRIPTOR;
            }

            @Override // com.miui.tsmclient.service.INfcConfigService
            public boolean setConfig(String str, SmartMxError smartMxError) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(INfcConfigService.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    boolean z = parcelObtain2.readInt() != 0;
                    if (parcelObtain2.readInt() != 0) {
                        smartMxError.readFromParcel(parcelObtain2);
                    }
                    return z;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.miui.tsmclient.service.INfcConfigService
            public boolean setConfigByUrl(String str, SmartMxError smartMxError) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(INfcConfigService.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    boolean z = parcelObtain2.readInt() != 0;
                    if (parcelObtain2.readInt() != 0) {
                        smartMxError.readFromParcel(parcelObtain2);
                    }
                    return z;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, INfcConfigService.DESCRIPTOR);
        }

        public static INfcConfigService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(INfcConfigService.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof INfcConfigService)) ? new Proxy(iBinder) : (INfcConfigService) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(INfcConfigService.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(INfcConfigService.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                String string = parcel.readString();
                SmartMxError smartMxError = new SmartMxError();
                boolean config = setConfig(string, smartMxError);
                parcel2.writeNoException();
                parcel2.writeInt(config ? 1 : 0);
                _Parcel.writeTypedObject(parcel2, smartMxError, 1);
            } else {
                if (i != 2) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                String string2 = parcel.readString();
                SmartMxError smartMxError2 = new SmartMxError();
                boolean configByUrl = setConfigByUrl(string2, smartMxError2);
                parcel2.writeNoException();
                parcel2.writeInt(configByUrl ? 1 : 0);
                _Parcel.writeTypedObject(parcel2, smartMxError2, 1);
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

    boolean setConfig(String str, SmartMxError smartMxError) throws RemoteException;

    boolean setConfigByUrl(String str, SmartMxError smartMxError) throws RemoteException;
}
