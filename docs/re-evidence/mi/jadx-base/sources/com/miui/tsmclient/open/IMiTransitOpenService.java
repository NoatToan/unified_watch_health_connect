package com.miui.tsmclient.open;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public interface IMiTransitOpenService extends IInterface {
    public static final String DESCRIPTOR = "com.miui.tsmclient.open.IMiTransitOpenService";

    public static class Default implements IMiTransitOpenService {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.miui.tsmclient.open.IMiTransitOpenService
        public String deleteCard(Map map) throws RemoteException {
            return null;
        }

        @Override // com.miui.tsmclient.open.IMiTransitOpenService
        public String executeCommands(Map map) throws RemoteException {
            return null;
        }

        @Override // com.miui.tsmclient.open.IMiTransitOpenService
        public String getGiftCard(Map map) throws RemoteException {
            return null;
        }

        @Override // com.miui.tsmclient.open.IMiTransitOpenService
        public String getSeid(Map map) throws RemoteException {
            return null;
        }

        @Override // com.miui.tsmclient.open.IMiTransitOpenService
        public String getServiceStatus(Map map) throws RemoteException {
            return null;
        }

        @Override // com.miui.tsmclient.open.IMiTransitOpenService
        public String issueCard(Map map) throws RemoteException {
            return null;
        }

        @Override // com.miui.tsmclient.open.IMiTransitOpenService
        public String login(Map map) throws RemoteException {
            return null;
        }

        @Override // com.miui.tsmclient.open.IMiTransitOpenService
        public String preIssueCard(Map map) throws RemoteException {
            return null;
        }

        @Override // com.miui.tsmclient.open.IMiTransitOpenService
        public String queryCardInfo(Map map) throws RemoteException {
            return null;
        }

        @Override // com.miui.tsmclient.open.IMiTransitOpenService
        public String recharge(Map map) throws RemoteException {
            return null;
        }
    }

    public static abstract class Stub extends Binder implements IMiTransitOpenService {
        static final int TRANSACTION_deleteCard = 6;
        static final int TRANSACTION_executeCommands = 8;
        static final int TRANSACTION_getGiftCard = 10;
        static final int TRANSACTION_getSeid = 2;
        static final int TRANSACTION_getServiceStatus = 1;
        static final int TRANSACTION_issueCard = 4;
        static final int TRANSACTION_login = 9;
        static final int TRANSACTION_preIssueCard = 3;
        static final int TRANSACTION_queryCardInfo = 7;
        static final int TRANSACTION_recharge = 5;

        public static class Proxy implements IMiTransitOpenService {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.miui.tsmclient.open.IMiTransitOpenService
            public String deleteCard(Map map) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMiTransitOpenService.DESCRIPTOR);
                    parcelObtain.writeMap(map);
                    this.mRemote.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.miui.tsmclient.open.IMiTransitOpenService
            public String executeCommands(Map map) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMiTransitOpenService.DESCRIPTOR);
                    parcelObtain.writeMap(map);
                    this.mRemote.transact(8, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.miui.tsmclient.open.IMiTransitOpenService
            public String getGiftCard(Map map) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMiTransitOpenService.DESCRIPTOR);
                    parcelObtain.writeMap(map);
                    this.mRemote.transact(10, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return IMiTransitOpenService.DESCRIPTOR;
            }

            @Override // com.miui.tsmclient.open.IMiTransitOpenService
            public String getSeid(Map map) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMiTransitOpenService.DESCRIPTOR);
                    parcelObtain.writeMap(map);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.miui.tsmclient.open.IMiTransitOpenService
            public String getServiceStatus(Map map) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMiTransitOpenService.DESCRIPTOR);
                    parcelObtain.writeMap(map);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.miui.tsmclient.open.IMiTransitOpenService
            public String issueCard(Map map) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMiTransitOpenService.DESCRIPTOR);
                    parcelObtain.writeMap(map);
                    this.mRemote.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.miui.tsmclient.open.IMiTransitOpenService
            public String login(Map map) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMiTransitOpenService.DESCRIPTOR);
                    parcelObtain.writeMap(map);
                    this.mRemote.transact(9, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.miui.tsmclient.open.IMiTransitOpenService
            public String preIssueCard(Map map) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMiTransitOpenService.DESCRIPTOR);
                    parcelObtain.writeMap(map);
                    this.mRemote.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.miui.tsmclient.open.IMiTransitOpenService
            public String queryCardInfo(Map map) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMiTransitOpenService.DESCRIPTOR);
                    parcelObtain.writeMap(map);
                    this.mRemote.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.miui.tsmclient.open.IMiTransitOpenService
            public String recharge(Map map) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMiTransitOpenService.DESCRIPTOR);
                    parcelObtain.writeMap(map);
                    this.mRemote.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IMiTransitOpenService.DESCRIPTOR);
        }

        public static IMiTransitOpenService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IMiTransitOpenService.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IMiTransitOpenService)) ? new Proxy(iBinder) : (IMiTransitOpenService) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String serviceStatus;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IMiTransitOpenService.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IMiTransitOpenService.DESCRIPTOR);
                return true;
            }
            switch (i) {
                case 1:
                    serviceStatus = getServiceStatus(parcel.readHashMap(getClass().getClassLoader()));
                    break;
                case 2:
                    serviceStatus = getSeid(parcel.readHashMap(getClass().getClassLoader()));
                    break;
                case 3:
                    serviceStatus = preIssueCard(parcel.readHashMap(getClass().getClassLoader()));
                    break;
                case 4:
                    serviceStatus = issueCard(parcel.readHashMap(getClass().getClassLoader()));
                    break;
                case 5:
                    serviceStatus = recharge(parcel.readHashMap(getClass().getClassLoader()));
                    break;
                case 6:
                    serviceStatus = deleteCard(parcel.readHashMap(getClass().getClassLoader()));
                    break;
                case 7:
                    serviceStatus = queryCardInfo(parcel.readHashMap(getClass().getClassLoader()));
                    break;
                case 8:
                    serviceStatus = executeCommands(parcel.readHashMap(getClass().getClassLoader()));
                    break;
                case 9:
                    serviceStatus = login(parcel.readHashMap(getClass().getClassLoader()));
                    break;
                case 10:
                    serviceStatus = getGiftCard(parcel.readHashMap(getClass().getClassLoader()));
                    break;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel2.writeNoException();
            parcel2.writeString(serviceStatus);
            return true;
        }
    }

    String deleteCard(Map map) throws RemoteException;

    String executeCommands(Map map) throws RemoteException;

    String getGiftCard(Map map) throws RemoteException;

    String getSeid(Map map) throws RemoteException;

    String getServiceStatus(Map map) throws RemoteException;

    String issueCard(Map map) throws RemoteException;

    String login(Map map) throws RemoteException;

    String preIssueCard(Map map) throws RemoteException;

    String queryCardInfo(Map map) throws RemoteException;

    String recharge(Map map) throws RemoteException;
}
