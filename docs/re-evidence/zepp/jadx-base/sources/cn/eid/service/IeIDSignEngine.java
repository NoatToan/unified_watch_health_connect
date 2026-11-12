package cn.eid.service;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public interface IeIDSignEngine extends IInterface {

    public static class Default implements IeIDSignEngine {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // cn.eid.service.IeIDSignEngine
        public RespParams createeID() throws RemoteException {
            return null;
        }

        @Override // cn.eid.service.IeIDSignEngine
        public RespParams eIDAvailable(String str) throws RemoteException {
            return null;
        }

        @Override // cn.eid.service.IeIDSignEngine
        public RespParams getVerison() throws RemoteException {
            return null;
        }

        @Override // cn.eid.service.IeIDSignEngine
        public RespParams geteIDDigitalId() throws RemoteException {
            return null;
        }

        @Override // cn.eid.service.IeIDSignEngine
        public RespParams geteIDInfo() throws RemoteException {
            return null;
        }

        @Override // cn.eid.service.IeIDSignEngine
        public RespParams sign(String str) throws RemoteException {
            return null;
        }
    }

    public static abstract class Stub extends Binder implements IeIDSignEngine {
        private static final String DESCRIPTOR = "cn.eid.service.IeIDSignEngine";
        public static final int TRANSACTION_createeID = 2;
        public static final int TRANSACTION_eIDAvailable = 1;
        public static final int TRANSACTION_getVerison = 6;
        public static final int TRANSACTION_geteIDDigitalId = 3;
        public static final int TRANSACTION_geteIDInfo = 4;
        public static final int TRANSACTION_sign = 5;

        public static class Proxy implements IeIDSignEngine {
            public static IeIDSignEngine sDefaultImpl;
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // cn.eid.service.IeIDSignEngine
            public RespParams createeID() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(2, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().createeID();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0 ? RespParams.CREATOR.createFromParcel(parcelObtain2) : null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // cn.eid.service.IeIDSignEngine
            public RespParams eIDAvailable(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    if (!this.mRemote.transact(1, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().eIDAvailable(str);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0 ? RespParams.CREATOR.createFromParcel(parcelObtain2) : null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            @Override // cn.eid.service.IeIDSignEngine
            public RespParams getVerison() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(6, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getVerison();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0 ? RespParams.CREATOR.createFromParcel(parcelObtain2) : null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // cn.eid.service.IeIDSignEngine
            public RespParams geteIDDigitalId() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(3, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().geteIDDigitalId();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0 ? RespParams.CREATOR.createFromParcel(parcelObtain2) : null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // cn.eid.service.IeIDSignEngine
            public RespParams geteIDInfo() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(4, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().geteIDInfo();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0 ? RespParams.CREATOR.createFromParcel(parcelObtain2) : null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // cn.eid.service.IeIDSignEngine
            public RespParams sign(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    if (!this.mRemote.transact(5, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().sign(str);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0 ? RespParams.CREATOR.createFromParcel(parcelObtain2) : null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IeIDSignEngine asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IeIDSignEngine)) ? new Proxy(iBinder) : (IeIDSignEngine) iInterfaceQueryLocalInterface;
        }

        public static IeIDSignEngine getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IeIDSignEngine ieIDSignEngine) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (ieIDSignEngine == null) {
                return false;
            }
            Proxy.sDefaultImpl = ieIDSignEngine;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1598968902) {
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
            switch (i) {
                case 1:
                    parcel.enforceInterface(DESCRIPTOR);
                    RespParams respParamsEIDAvailable = eIDAvailable(parcel.readString());
                    parcel2.writeNoException();
                    if (respParamsEIDAvailable != null) {
                        parcel2.writeInt(1);
                        respParamsEIDAvailable.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 2:
                    parcel.enforceInterface(DESCRIPTOR);
                    RespParams respParamsCreateeID = createeID();
                    parcel2.writeNoException();
                    if (respParamsCreateeID != null) {
                        parcel2.writeInt(1);
                        respParamsCreateeID.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 3:
                    parcel.enforceInterface(DESCRIPTOR);
                    RespParams respParams = geteIDDigitalId();
                    parcel2.writeNoException();
                    if (respParams != null) {
                        parcel2.writeInt(1);
                        respParams.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 4:
                    parcel.enforceInterface(DESCRIPTOR);
                    RespParams respParams2 = geteIDInfo();
                    parcel2.writeNoException();
                    if (respParams2 != null) {
                        parcel2.writeInt(1);
                        respParams2.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 5:
                    parcel.enforceInterface(DESCRIPTOR);
                    RespParams respParamsSign = sign(parcel.readString());
                    parcel2.writeNoException();
                    if (respParamsSign != null) {
                        parcel2.writeInt(1);
                        respParamsSign.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 6:
                    parcel.enforceInterface(DESCRIPTOR);
                    RespParams verison = getVerison();
                    parcel2.writeNoException();
                    if (verison != null) {
                        parcel2.writeInt(1);
                        verison.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    RespParams createeID() throws RemoteException;

    RespParams eIDAvailable(String str) throws RemoteException;

    RespParams getVerison() throws RemoteException;

    RespParams geteIDDigitalId() throws RemoteException;

    RespParams geteIDInfo() throws RemoteException;

    RespParams sign(String str) throws RemoteException;
}
