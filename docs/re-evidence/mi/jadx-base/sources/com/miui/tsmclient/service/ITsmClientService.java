package com.miui.tsmclient.service;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public interface ITsmClientService extends IInterface {
    public static final String DESCRIPTOR = "com.miui.tsmclient.service.ITsmClientService";

    public static class Default implements ITsmClientService {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.miui.tsmclient.service.ITsmClientService
        public void cancelTask(String str) throws RemoteException {
        }

        @Override // com.miui.tsmclient.service.ITsmClientService
        public void checkNfcEEStatus(IServiceResponse iServiceResponse) throws RemoteException {
        }

        @Override // com.miui.tsmclient.service.ITsmClientService
        public void checkSeUpgrade(IServiceResponse iServiceResponse, Map map) throws RemoteException {
        }

        @Override // com.miui.tsmclient.service.ITsmClientService
        public void enrollUPCard(IServiceResponse iServiceResponse, Map map) throws RemoteException {
        }

        @Override // com.miui.tsmclient.service.ITsmClientService
        public void getCPLC(IServiceResponse iServiceResponse) throws RemoteException {
        }

        @Override // com.miui.tsmclient.service.ITsmClientService
        public void getCardList(IServiceResponse iServiceResponse, boolean z) throws RemoteException {
        }

        @Override // com.miui.tsmclient.service.ITsmClientService
        public void getSeid(IServiceResponse iServiceResponse) throws RemoteException {
        }

        @Override // com.miui.tsmclient.service.ITsmClientService
        public void isServiceAvailable(IServiceResponse iServiceResponse, Map map) throws RemoteException {
        }

        @Override // com.miui.tsmclient.service.ITsmClientService
        public void notifyInappPayResult(IServiceResponse iServiceResponse, Map map) throws RemoteException {
        }

        @Override // com.miui.tsmclient.service.ITsmClientService
        public void preparePayApplet(IServiceResponse iServiceResponse, Map map) throws RemoteException {
        }

        @Override // com.miui.tsmclient.service.ITsmClientService
        public void processCard(IServiceResponse iServiceResponse, Map map) throws RemoteException {
        }

        @Override // com.miui.tsmclient.service.ITsmClientService
        public void queryPan(IServiceResponse iServiceResponse, Map map) throws RemoteException {
        }

        @Override // com.miui.tsmclient.service.ITsmClientService
        public void rechargeCard(IServiceResponse iServiceResponse, Map map) throws RemoteException {
        }

        @Override // com.miui.tsmclient.service.ITsmClientService
        public void requestInappPay(IServiceResponse iServiceResponse, Map map) throws RemoteException {
        }

        @Override // com.miui.tsmclient.service.ITsmClientService
        public void requestVerificationCode(IServiceResponse iServiceResponse, Map map) throws RemoteException {
        }

        @Override // com.miui.tsmclient.service.ITsmClientService
        public void setRfConfig(IServiceResponse iServiceResponse, Map map) throws RemoteException {
        }

        @Override // com.miui.tsmclient.service.ITsmClientService
        public void transferOut(IServiceResponse iServiceResponse, Map map) throws RemoteException {
        }

        @Override // com.miui.tsmclient.service.ITsmClientService
        public void unrestrictESE(IServiceResponse iServiceResponse) throws RemoteException {
        }

        @Override // com.miui.tsmclient.service.ITsmClientService
        public void updateCards(IServiceResponse iServiceResponse, Map map) throws RemoteException {
        }

        @Override // com.miui.tsmclient.service.ITsmClientService
        public void upgradeApplet(IServiceResponse iServiceResponse, Map map) throws RemoteException {
        }

        @Override // com.miui.tsmclient.service.ITsmClientService
        public void upgradeCPLC(IServiceResponse iServiceResponse) throws RemoteException {
        }

        @Override // com.miui.tsmclient.service.ITsmClientService
        public void uploadExceptionUserLog(IServiceResponse iServiceResponse, Map map) throws RemoteException {
        }

        @Override // com.miui.tsmclient.service.ITsmClientService
        public void verifyVerificationCode(IServiceResponse iServiceResponse, Map map) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements ITsmClientService {
        static final int TRANSACTION_cancelTask = 22;
        static final int TRANSACTION_checkNfcEEStatus = 3;
        static final int TRANSACTION_checkSeUpgrade = 20;
        static final int TRANSACTION_enrollUPCard = 14;
        static final int TRANSACTION_getCPLC = 1;
        static final int TRANSACTION_getCardList = 6;
        static final int TRANSACTION_getSeid = 2;
        static final int TRANSACTION_isServiceAvailable = 18;
        static final int TRANSACTION_notifyInappPayResult = 16;
        static final int TRANSACTION_preparePayApplet = 13;
        static final int TRANSACTION_processCard = 8;
        static final int TRANSACTION_queryPan = 12;
        static final int TRANSACTION_rechargeCard = 9;
        static final int TRANSACTION_requestInappPay = 15;
        static final int TRANSACTION_requestVerificationCode = 10;
        static final int TRANSACTION_setRfConfig = 23;
        static final int TRANSACTION_transferOut = 17;
        static final int TRANSACTION_unrestrictESE = 4;
        static final int TRANSACTION_updateCards = 7;
        static final int TRANSACTION_upgradeApplet = 21;
        static final int TRANSACTION_upgradeCPLC = 5;
        static final int TRANSACTION_uploadExceptionUserLog = 19;
        static final int TRANSACTION_verifyVerificationCode = 11;

        public static class Proxy implements ITsmClientService {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.miui.tsmclient.service.ITsmClientService
            public void cancelTask(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ITsmClientService.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(22, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.miui.tsmclient.service.ITsmClientService
            public void checkNfcEEStatus(IServiceResponse iServiceResponse) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ITsmClientService.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iServiceResponse);
                    this.mRemote.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.miui.tsmclient.service.ITsmClientService
            public void checkSeUpgrade(IServiceResponse iServiceResponse, Map map) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ITsmClientService.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iServiceResponse);
                    parcelObtain.writeMap(map);
                    this.mRemote.transact(20, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.miui.tsmclient.service.ITsmClientService
            public void enrollUPCard(IServiceResponse iServiceResponse, Map map) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ITsmClientService.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iServiceResponse);
                    parcelObtain.writeMap(map);
                    this.mRemote.transact(14, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.miui.tsmclient.service.ITsmClientService
            public void getCPLC(IServiceResponse iServiceResponse) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ITsmClientService.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iServiceResponse);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.miui.tsmclient.service.ITsmClientService
            public void getCardList(IServiceResponse iServiceResponse, boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ITsmClientService.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iServiceResponse);
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.mRemote.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return ITsmClientService.DESCRIPTOR;
            }

            @Override // com.miui.tsmclient.service.ITsmClientService
            public void getSeid(IServiceResponse iServiceResponse) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ITsmClientService.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iServiceResponse);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.miui.tsmclient.service.ITsmClientService
            public void isServiceAvailable(IServiceResponse iServiceResponse, Map map) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ITsmClientService.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iServiceResponse);
                    parcelObtain.writeMap(map);
                    this.mRemote.transact(18, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.miui.tsmclient.service.ITsmClientService
            public void notifyInappPayResult(IServiceResponse iServiceResponse, Map map) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ITsmClientService.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iServiceResponse);
                    parcelObtain.writeMap(map);
                    this.mRemote.transact(16, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.miui.tsmclient.service.ITsmClientService
            public void preparePayApplet(IServiceResponse iServiceResponse, Map map) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ITsmClientService.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iServiceResponse);
                    parcelObtain.writeMap(map);
                    this.mRemote.transact(13, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.miui.tsmclient.service.ITsmClientService
            public void processCard(IServiceResponse iServiceResponse, Map map) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ITsmClientService.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iServiceResponse);
                    parcelObtain.writeMap(map);
                    this.mRemote.transact(8, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.miui.tsmclient.service.ITsmClientService
            public void queryPan(IServiceResponse iServiceResponse, Map map) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ITsmClientService.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iServiceResponse);
                    parcelObtain.writeMap(map);
                    this.mRemote.transact(12, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.miui.tsmclient.service.ITsmClientService
            public void rechargeCard(IServiceResponse iServiceResponse, Map map) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ITsmClientService.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iServiceResponse);
                    parcelObtain.writeMap(map);
                    this.mRemote.transact(9, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.miui.tsmclient.service.ITsmClientService
            public void requestInappPay(IServiceResponse iServiceResponse, Map map) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ITsmClientService.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iServiceResponse);
                    parcelObtain.writeMap(map);
                    this.mRemote.transact(15, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.miui.tsmclient.service.ITsmClientService
            public void requestVerificationCode(IServiceResponse iServiceResponse, Map map) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ITsmClientService.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iServiceResponse);
                    parcelObtain.writeMap(map);
                    this.mRemote.transact(10, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.miui.tsmclient.service.ITsmClientService
            public void setRfConfig(IServiceResponse iServiceResponse, Map map) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ITsmClientService.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iServiceResponse);
                    parcelObtain.writeMap(map);
                    this.mRemote.transact(23, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.miui.tsmclient.service.ITsmClientService
            public void transferOut(IServiceResponse iServiceResponse, Map map) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ITsmClientService.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iServiceResponse);
                    parcelObtain.writeMap(map);
                    this.mRemote.transact(17, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.miui.tsmclient.service.ITsmClientService
            public void unrestrictESE(IServiceResponse iServiceResponse) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ITsmClientService.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iServiceResponse);
                    this.mRemote.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.miui.tsmclient.service.ITsmClientService
            public void updateCards(IServiceResponse iServiceResponse, Map map) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ITsmClientService.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iServiceResponse);
                    parcelObtain.writeMap(map);
                    this.mRemote.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.miui.tsmclient.service.ITsmClientService
            public void upgradeApplet(IServiceResponse iServiceResponse, Map map) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ITsmClientService.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iServiceResponse);
                    parcelObtain.writeMap(map);
                    this.mRemote.transact(21, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.miui.tsmclient.service.ITsmClientService
            public void upgradeCPLC(IServiceResponse iServiceResponse) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ITsmClientService.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iServiceResponse);
                    this.mRemote.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.miui.tsmclient.service.ITsmClientService
            public void uploadExceptionUserLog(IServiceResponse iServiceResponse, Map map) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ITsmClientService.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iServiceResponse);
                    parcelObtain.writeMap(map);
                    this.mRemote.transact(19, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.miui.tsmclient.service.ITsmClientService
            public void verifyVerificationCode(IServiceResponse iServiceResponse, Map map) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ITsmClientService.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iServiceResponse);
                    parcelObtain.writeMap(map);
                    this.mRemote.transact(11, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, ITsmClientService.DESCRIPTOR);
        }

        public static ITsmClientService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(ITsmClientService.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ITsmClientService)) ? new Proxy(iBinder) : (ITsmClientService) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(ITsmClientService.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(ITsmClientService.DESCRIPTOR);
                return true;
            }
            switch (i) {
                case 1:
                    getCPLC(IServiceResponse.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 2:
                    getSeid(IServiceResponse.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 3:
                    checkNfcEEStatus(IServiceResponse.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 4:
                    unrestrictESE(IServiceResponse.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 5:
                    upgradeCPLC(IServiceResponse.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 6:
                    getCardList(IServiceResponse.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 7:
                    updateCards(IServiceResponse.Stub.asInterface(parcel.readStrongBinder()), parcel.readHashMap(getClass().getClassLoader()));
                    parcel2.writeNoException();
                    return true;
                case 8:
                    processCard(IServiceResponse.Stub.asInterface(parcel.readStrongBinder()), parcel.readHashMap(getClass().getClassLoader()));
                    parcel2.writeNoException();
                    return true;
                case 9:
                    rechargeCard(IServiceResponse.Stub.asInterface(parcel.readStrongBinder()), parcel.readHashMap(getClass().getClassLoader()));
                    parcel2.writeNoException();
                    return true;
                case 10:
                    requestVerificationCode(IServiceResponse.Stub.asInterface(parcel.readStrongBinder()), parcel.readHashMap(getClass().getClassLoader()));
                    parcel2.writeNoException();
                    return true;
                case 11:
                    verifyVerificationCode(IServiceResponse.Stub.asInterface(parcel.readStrongBinder()), parcel.readHashMap(getClass().getClassLoader()));
                    parcel2.writeNoException();
                    return true;
                case 12:
                    queryPan(IServiceResponse.Stub.asInterface(parcel.readStrongBinder()), parcel.readHashMap(getClass().getClassLoader()));
                    parcel2.writeNoException();
                    return true;
                case 13:
                    preparePayApplet(IServiceResponse.Stub.asInterface(parcel.readStrongBinder()), parcel.readHashMap(getClass().getClassLoader()));
                    parcel2.writeNoException();
                    return true;
                case 14:
                    enrollUPCard(IServiceResponse.Stub.asInterface(parcel.readStrongBinder()), parcel.readHashMap(getClass().getClassLoader()));
                    parcel2.writeNoException();
                    return true;
                case 15:
                    requestInappPay(IServiceResponse.Stub.asInterface(parcel.readStrongBinder()), parcel.readHashMap(getClass().getClassLoader()));
                    parcel2.writeNoException();
                    return true;
                case 16:
                    notifyInappPayResult(IServiceResponse.Stub.asInterface(parcel.readStrongBinder()), parcel.readHashMap(getClass().getClassLoader()));
                    parcel2.writeNoException();
                    return true;
                case 17:
                    transferOut(IServiceResponse.Stub.asInterface(parcel.readStrongBinder()), parcel.readHashMap(getClass().getClassLoader()));
                    parcel2.writeNoException();
                    return true;
                case 18:
                    isServiceAvailable(IServiceResponse.Stub.asInterface(parcel.readStrongBinder()), parcel.readHashMap(getClass().getClassLoader()));
                    parcel2.writeNoException();
                    return true;
                case 19:
                    uploadExceptionUserLog(IServiceResponse.Stub.asInterface(parcel.readStrongBinder()), parcel.readHashMap(getClass().getClassLoader()));
                    parcel2.writeNoException();
                    return true;
                case 20:
                    checkSeUpgrade(IServiceResponse.Stub.asInterface(parcel.readStrongBinder()), parcel.readHashMap(getClass().getClassLoader()));
                    parcel2.writeNoException();
                    return true;
                case 21:
                    upgradeApplet(IServiceResponse.Stub.asInterface(parcel.readStrongBinder()), parcel.readHashMap(getClass().getClassLoader()));
                    parcel2.writeNoException();
                    return true;
                case 22:
                    cancelTask(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 23:
                    setRfConfig(IServiceResponse.Stub.asInterface(parcel.readStrongBinder()), parcel.readHashMap(getClass().getClassLoader()));
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    void cancelTask(String str) throws RemoteException;

    void checkNfcEEStatus(IServiceResponse iServiceResponse) throws RemoteException;

    void checkSeUpgrade(IServiceResponse iServiceResponse, Map map) throws RemoteException;

    void enrollUPCard(IServiceResponse iServiceResponse, Map map) throws RemoteException;

    void getCPLC(IServiceResponse iServiceResponse) throws RemoteException;

    void getCardList(IServiceResponse iServiceResponse, boolean z) throws RemoteException;

    void getSeid(IServiceResponse iServiceResponse) throws RemoteException;

    void isServiceAvailable(IServiceResponse iServiceResponse, Map map) throws RemoteException;

    void notifyInappPayResult(IServiceResponse iServiceResponse, Map map) throws RemoteException;

    void preparePayApplet(IServiceResponse iServiceResponse, Map map) throws RemoteException;

    void processCard(IServiceResponse iServiceResponse, Map map) throws RemoteException;

    void queryPan(IServiceResponse iServiceResponse, Map map) throws RemoteException;

    void rechargeCard(IServiceResponse iServiceResponse, Map map) throws RemoteException;

    void requestInappPay(IServiceResponse iServiceResponse, Map map) throws RemoteException;

    void requestVerificationCode(IServiceResponse iServiceResponse, Map map) throws RemoteException;

    void setRfConfig(IServiceResponse iServiceResponse, Map map) throws RemoteException;

    void transferOut(IServiceResponse iServiceResponse, Map map) throws RemoteException;

    void unrestrictESE(IServiceResponse iServiceResponse) throws RemoteException;

    void updateCards(IServiceResponse iServiceResponse, Map map) throws RemoteException;

    void upgradeApplet(IServiceResponse iServiceResponse, Map map) throws RemoteException;

    void upgradeCPLC(IServiceResponse iServiceResponse) throws RemoteException;

    void uploadExceptionUserLog(IServiceResponse iServiceResponse, Map map) throws RemoteException;

    void verifyVerificationCode(IServiceResponse iServiceResponse, Map map) throws RemoteException;
}
