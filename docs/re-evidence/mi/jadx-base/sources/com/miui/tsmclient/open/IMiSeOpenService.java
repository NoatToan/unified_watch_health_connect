package com.miui.tsmclient.open;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public interface IMiSeOpenService extends IInterface {
    public static final String DESCRIPTOR = "com.miui.tsmclient.open.IMiSeOpenService";

    public static class Default implements IMiSeOpenService {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.miui.tsmclient.open.IMiSeOpenService
        public String executeSeOperation(Map map) throws RemoteException {
            return null;
        }

        @Override // com.miui.tsmclient.open.IMiSeOpenService
        public String getOperationResult(Map map) throws RemoteException {
            return null;
        }

        @Override // com.miui.tsmclient.open.IMiSeOpenService
        public String getSeid(Map map) throws RemoteException {
            return null;
        }

        @Override // com.miui.tsmclient.open.IMiSeOpenService
        public String login(Map map) throws RemoteException {
            return null;
        }
    }

    public static abstract class Stub extends Binder implements IMiSeOpenService {
        static final int TRANSACTION_executeSeOperation = 3;
        static final int TRANSACTION_getOperationResult = 4;
        static final int TRANSACTION_getSeid = 1;
        static final int TRANSACTION_login = 2;

        public static class Proxy implements IMiSeOpenService {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.miui.tsmclient.open.IMiSeOpenService
            public String executeSeOperation(Map map) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMiSeOpenService.DESCRIPTOR);
                    parcelObtain.writeMap(map);
                    this.mRemote.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return IMiSeOpenService.DESCRIPTOR;
            }

            @Override // com.miui.tsmclient.open.IMiSeOpenService
            public String getOperationResult(Map map) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMiSeOpenService.DESCRIPTOR);
                    parcelObtain.writeMap(map);
                    this.mRemote.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.miui.tsmclient.open.IMiSeOpenService
            public String getSeid(Map map) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMiSeOpenService.DESCRIPTOR);
                    parcelObtain.writeMap(map);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.miui.tsmclient.open.IMiSeOpenService
            public String login(Map map) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMiSeOpenService.DESCRIPTOR);
                    parcelObtain.writeMap(map);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IMiSeOpenService.DESCRIPTOR);
        }

        public static IMiSeOpenService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IMiSeOpenService.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IMiSeOpenService)) ? new Proxy(iBinder) : (IMiSeOpenService) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String seid;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IMiSeOpenService.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IMiSeOpenService.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                seid = getSeid(parcel.readHashMap(getClass().getClassLoader()));
            } else if (i == 2) {
                seid = login(parcel.readHashMap(getClass().getClassLoader()));
            } else if (i == 3) {
                seid = executeSeOperation(parcel.readHashMap(getClass().getClassLoader()));
            } else {
                if (i != 4) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                seid = getOperationResult(parcel.readHashMap(getClass().getClassLoader()));
            }
            parcel2.writeNoException();
            parcel2.writeString(seid);
            return true;
        }
    }

    String executeSeOperation(Map map) throws RemoteException;

    String getOperationResult(Map map) throws RemoteException;

    String getSeid(Map map) throws RemoteException;

    String login(Map map) throws RemoteException;
}
