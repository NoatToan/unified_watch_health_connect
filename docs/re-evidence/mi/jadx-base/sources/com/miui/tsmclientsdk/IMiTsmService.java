package com.miui.tsmclientsdk;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public interface IMiTsmService extends IInterface {
    public static final String DESCRIPTOR = "com.miui.tsmclientsdk.IMiTsmService";

    public static class Default implements IMiTsmService {
        @Override // com.miui.tsmclientsdk.IMiTsmService
        public void addMiPayShortcut(IMiTsmResponse iMiTsmResponse, String str) throws RemoteException {
        }

        @Override // com.miui.tsmclientsdk.IMiTsmService
        public void addMipay(IMiTsmResponse iMiTsmResponse, String str) throws RemoteException {
        }

        @Override // com.miui.tsmclientsdk.IMiTsmService
        public void addMipayCard(IMiTsmResponse iMiTsmResponse, String str, int i, String str2) throws RemoteException {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.miui.tsmclientsdk.IMiTsmService
        public void createSSD(IMiTsmResponse iMiTsmResponse, int i) throws RemoteException {
        }

        @Override // com.miui.tsmclientsdk.IMiTsmService
        public void deleteAllBankCard(IMiTsmResponse iMiTsmResponse) throws RemoteException {
        }

        @Override // com.miui.tsmclientsdk.IMiTsmService
        public void deleteBankCard(IMiTsmResponse iMiTsmResponse, String str) throws RemoteException {
        }

        @Override // com.miui.tsmclientsdk.IMiTsmService
        public void getActiveCards(IMiTsmResponse iMiTsmResponse, String str) throws RemoteException {
        }

        @Override // com.miui.tsmclientsdk.IMiTsmService
        public void getCPLC(IMiTsmResponse iMiTsmResponse) throws RemoteException {
        }

        @Override // com.miui.tsmclientsdk.IMiTsmService
        public void getCardInfo(IMiTsmResponse iMiTsmResponse, List<String> list) throws RemoteException {
        }

        @Override // com.miui.tsmclientsdk.IMiTsmService
        public void getCardsQuantity(IMiTsmResponse iMiTsmResponse, String str) throws RemoteException {
        }

        @Override // com.miui.tsmclientsdk.IMiTsmService
        public void getCardsState(IMiTsmResponse iMiTsmResponse) throws RemoteException {
        }

        @Override // com.miui.tsmclientsdk.IMiTsmService
        public void getData(IMiTsmResponse iMiTsmResponse, String str, Bundle bundle) throws RemoteException {
        }

        @Override // com.miui.tsmclientsdk.IMiTsmService
        public void getDefaultCard(IMiTsmResponse iMiTsmResponse, String str) throws RemoteException {
        }

        @Override // com.miui.tsmclientsdk.IMiTsmService
        public void getMiPayStatus(IMiTsmResponse iMiTsmResponse) throws RemoteException {
        }

        @Override // com.miui.tsmclientsdk.IMiTsmService
        public void getSeBankCards(IMiTsmResponse iMiTsmResponse) throws RemoteException {
        }

        @Override // com.miui.tsmclientsdk.IMiTsmService
        public void getTransCardState(IMiTsmResponse iMiTsmResponse) throws RemoteException {
        }

        @Override // com.miui.tsmclientsdk.IMiTsmService
        public void isBankCardAvailable(IMiTsmResponse iMiTsmResponse) throws RemoteException {
        }

        @Override // com.miui.tsmclientsdk.IMiTsmService
        public void loadMipayCard(IMiTsmResponse iMiTsmResponse, String str) throws RemoteException {
        }

        @Override // com.miui.tsmclientsdk.IMiTsmService
        public void manageBankCard(IMiTsmResponse iMiTsmResponse, String str, int i) throws RemoteException {
        }

        @Override // com.miui.tsmclientsdk.IMiTsmService
        public void manageVirtualSimCard(IMiTsmResponse iMiTsmResponse, String str, int i) throws RemoteException {
        }

        @Override // com.miui.tsmclientsdk.IMiTsmService
        public void notifyPayResult(IMiTsmResponse iMiTsmResponse, Bundle bundle) throws RemoteException {
        }

        @Override // com.miui.tsmclientsdk.IMiTsmService
        public void requestInappTransaction(IMiTsmResponse iMiTsmResponse, Bundle bundle, int i) throws RemoteException {
        }

        @Override // com.miui.tsmclientsdk.IMiTsmService
        public void requestPin(IMiTsmResponse iMiTsmResponse, int i) throws RemoteException {
        }

        @Override // com.miui.tsmclientsdk.IMiTsmService
        public void requestPinWithBundle(IMiTsmResponse iMiTsmResponse, Bundle bundle, int i) throws RemoteException {
        }

        @Override // com.miui.tsmclientsdk.IMiTsmService
        public void setDefaultCard(IMiTsmResponse iMiTsmResponse, String str, Bundle bundle) throws RemoteException {
        }

        @Override // com.miui.tsmclientsdk.IMiTsmService
        public void syncBankCardStatus(IMiTsmResponse iMiTsmResponse) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IMiTsmService {
        static final int TRANSACTION_addMiPayShortcut = 15;
        static final int TRANSACTION_addMipay = 25;
        static final int TRANSACTION_addMipayCard = 21;
        static final int TRANSACTION_createSSD = 4;
        static final int TRANSACTION_deleteAllBankCard = 10;
        static final int TRANSACTION_deleteBankCard = 9;
        static final int TRANSACTION_getActiveCards = 7;
        static final int TRANSACTION_getCPLC = 1;
        static final int TRANSACTION_getCardInfo = 6;
        static final int TRANSACTION_getCardsQuantity = 5;
        static final int TRANSACTION_getCardsState = 22;
        static final int TRANSACTION_getData = 23;
        static final int TRANSACTION_getDefaultCard = 2;
        static final int TRANSACTION_getMiPayStatus = 17;
        static final int TRANSACTION_getSeBankCards = 8;
        static final int TRANSACTION_getTransCardState = 13;
        static final int TRANSACTION_isBankCardAvailable = 12;
        static final int TRANSACTION_loadMipayCard = 24;
        static final int TRANSACTION_manageBankCard = 11;
        static final int TRANSACTION_manageVirtualSimCard = 16;
        static final int TRANSACTION_notifyPayResult = 20;
        static final int TRANSACTION_requestInappTransaction = 18;
        static final int TRANSACTION_requestPin = 19;
        static final int TRANSACTION_requestPinWithBundle = 26;
        static final int TRANSACTION_setDefaultCard = 3;
        static final int TRANSACTION_syncBankCardStatus = 14;

        public static class Proxy implements IMiTsmService {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // com.miui.tsmclientsdk.IMiTsmService
            public void addMiPayShortcut(IMiTsmResponse iMiTsmResponse, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMiTsmService.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMiTsmResponse);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(15, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.miui.tsmclientsdk.IMiTsmService
            public void addMipay(IMiTsmResponse iMiTsmResponse, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMiTsmService.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMiTsmResponse);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(25, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.miui.tsmclientsdk.IMiTsmService
            public void addMipayCard(IMiTsmResponse iMiTsmResponse, String str, int i, String str2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMiTsmService.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMiTsmResponse);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str2);
                    this.mRemote.transact(21, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.miui.tsmclientsdk.IMiTsmService
            public void createSSD(IMiTsmResponse iMiTsmResponse, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMiTsmService.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMiTsmResponse);
                    parcelObtain.writeInt(i);
                    this.mRemote.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.miui.tsmclientsdk.IMiTsmService
            public void deleteAllBankCard(IMiTsmResponse iMiTsmResponse) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMiTsmService.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMiTsmResponse);
                    this.mRemote.transact(10, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.miui.tsmclientsdk.IMiTsmService
            public void deleteBankCard(IMiTsmResponse iMiTsmResponse, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMiTsmService.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMiTsmResponse);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(9, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.miui.tsmclientsdk.IMiTsmService
            public void getActiveCards(IMiTsmResponse iMiTsmResponse, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMiTsmService.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMiTsmResponse);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.miui.tsmclientsdk.IMiTsmService
            public void getCPLC(IMiTsmResponse iMiTsmResponse) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMiTsmService.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMiTsmResponse);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.miui.tsmclientsdk.IMiTsmService
            public void getCardInfo(IMiTsmResponse iMiTsmResponse, List<String> list) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMiTsmService.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMiTsmResponse);
                    parcelObtain.writeStringList(list);
                    this.mRemote.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.miui.tsmclientsdk.IMiTsmService
            public void getCardsQuantity(IMiTsmResponse iMiTsmResponse, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMiTsmService.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMiTsmResponse);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.miui.tsmclientsdk.IMiTsmService
            public void getCardsState(IMiTsmResponse iMiTsmResponse) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMiTsmService.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMiTsmResponse);
                    this.mRemote.transact(22, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.miui.tsmclientsdk.IMiTsmService
            public void getData(IMiTsmResponse iMiTsmResponse, String str, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMiTsmService.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMiTsmResponse);
                    parcelObtain.writeString(str);
                    _Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    this.mRemote.transact(23, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.miui.tsmclientsdk.IMiTsmService
            public void getDefaultCard(IMiTsmResponse iMiTsmResponse, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMiTsmService.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMiTsmResponse);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return IMiTsmService.DESCRIPTOR;
            }

            @Override // com.miui.tsmclientsdk.IMiTsmService
            public void getMiPayStatus(IMiTsmResponse iMiTsmResponse) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMiTsmService.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMiTsmResponse);
                    this.mRemote.transact(17, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.miui.tsmclientsdk.IMiTsmService
            public void getSeBankCards(IMiTsmResponse iMiTsmResponse) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMiTsmService.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMiTsmResponse);
                    this.mRemote.transact(8, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.miui.tsmclientsdk.IMiTsmService
            public void getTransCardState(IMiTsmResponse iMiTsmResponse) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMiTsmService.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMiTsmResponse);
                    this.mRemote.transact(13, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.miui.tsmclientsdk.IMiTsmService
            public void isBankCardAvailable(IMiTsmResponse iMiTsmResponse) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMiTsmService.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMiTsmResponse);
                    this.mRemote.transact(12, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.miui.tsmclientsdk.IMiTsmService
            public void loadMipayCard(IMiTsmResponse iMiTsmResponse, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMiTsmService.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMiTsmResponse);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(24, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.miui.tsmclientsdk.IMiTsmService
            public void manageBankCard(IMiTsmResponse iMiTsmResponse, String str, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMiTsmService.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMiTsmResponse);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    this.mRemote.transact(11, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.miui.tsmclientsdk.IMiTsmService
            public void manageVirtualSimCard(IMiTsmResponse iMiTsmResponse, String str, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMiTsmService.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMiTsmResponse);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    this.mRemote.transact(16, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.miui.tsmclientsdk.IMiTsmService
            public void notifyPayResult(IMiTsmResponse iMiTsmResponse, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMiTsmService.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMiTsmResponse);
                    _Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    this.mRemote.transact(20, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.miui.tsmclientsdk.IMiTsmService
            public void requestInappTransaction(IMiTsmResponse iMiTsmResponse, Bundle bundle, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMiTsmService.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMiTsmResponse);
                    _Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    parcelObtain.writeInt(i);
                    this.mRemote.transact(18, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.miui.tsmclientsdk.IMiTsmService
            public void requestPin(IMiTsmResponse iMiTsmResponse, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMiTsmService.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMiTsmResponse);
                    parcelObtain.writeInt(i);
                    this.mRemote.transact(19, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.miui.tsmclientsdk.IMiTsmService
            public void requestPinWithBundle(IMiTsmResponse iMiTsmResponse, Bundle bundle, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMiTsmService.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMiTsmResponse);
                    _Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    parcelObtain.writeInt(i);
                    this.mRemote.transact(26, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.miui.tsmclientsdk.IMiTsmService
            public void setDefaultCard(IMiTsmResponse iMiTsmResponse, String str, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMiTsmService.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMiTsmResponse);
                    parcelObtain.writeString(str);
                    _Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    this.mRemote.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.miui.tsmclientsdk.IMiTsmService
            public void syncBankCardStatus(IMiTsmResponse iMiTsmResponse) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMiTsmService.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMiTsmResponse);
                    this.mRemote.transact(14, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IMiTsmService.DESCRIPTOR);
        }

        public static IMiTsmService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IMiTsmService.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IMiTsmService)) ? new Proxy(iBinder) : (IMiTsmService) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IMiTsmService.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IMiTsmService.DESCRIPTOR);
                return true;
            }
            switch (i) {
                case 1:
                    getCPLC(IMiTsmResponse.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 2:
                    getDefaultCard(IMiTsmResponse.Stub.asInterface(parcel.readStrongBinder()), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 3:
                    setDefaultCard(IMiTsmResponse.Stub.asInterface(parcel.readStrongBinder()), parcel.readString(), (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 4:
                    createSSD(IMiTsmResponse.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 5:
                    getCardsQuantity(IMiTsmResponse.Stub.asInterface(parcel.readStrongBinder()), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 6:
                    getCardInfo(IMiTsmResponse.Stub.asInterface(parcel.readStrongBinder()), parcel.createStringArrayList());
                    parcel2.writeNoException();
                    return true;
                case 7:
                    getActiveCards(IMiTsmResponse.Stub.asInterface(parcel.readStrongBinder()), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 8:
                    getSeBankCards(IMiTsmResponse.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 9:
                    deleteBankCard(IMiTsmResponse.Stub.asInterface(parcel.readStrongBinder()), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 10:
                    deleteAllBankCard(IMiTsmResponse.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 11:
                    manageBankCard(IMiTsmResponse.Stub.asInterface(parcel.readStrongBinder()), parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 12:
                    isBankCardAvailable(IMiTsmResponse.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 13:
                    getTransCardState(IMiTsmResponse.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 14:
                    syncBankCardStatus(IMiTsmResponse.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 15:
                    addMiPayShortcut(IMiTsmResponse.Stub.asInterface(parcel.readStrongBinder()), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 16:
                    manageVirtualSimCard(IMiTsmResponse.Stub.asInterface(parcel.readStrongBinder()), parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 17:
                    getMiPayStatus(IMiTsmResponse.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 18:
                    requestInappTransaction(IMiTsmResponse.Stub.asInterface(parcel.readStrongBinder()), (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 19:
                    requestPin(IMiTsmResponse.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 20:
                    notifyPayResult(IMiTsmResponse.Stub.asInterface(parcel.readStrongBinder()), (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 21:
                    addMipayCard(IMiTsmResponse.Stub.asInterface(parcel.readStrongBinder()), parcel.readString(), parcel.readInt(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 22:
                    getCardsState(IMiTsmResponse.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 23:
                    getData(IMiTsmResponse.Stub.asInterface(parcel.readStrongBinder()), parcel.readString(), (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 24:
                    loadMipayCard(IMiTsmResponse.Stub.asInterface(parcel.readStrongBinder()), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 25:
                    addMipay(IMiTsmResponse.Stub.asInterface(parcel.readStrongBinder()), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 26:
                    requestPinWithBundle(IMiTsmResponse.Stub.asInterface(parcel.readStrongBinder()), (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    public static class _Parcel {
        /* JADX INFO: Access modifiers changed from: private */
        public static <T> T readTypedObject(Parcel parcel, Parcelable.Creator<T> creator) {
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

    void addMiPayShortcut(IMiTsmResponse iMiTsmResponse, String str) throws RemoteException;

    void addMipay(IMiTsmResponse iMiTsmResponse, String str) throws RemoteException;

    void addMipayCard(IMiTsmResponse iMiTsmResponse, String str, int i, String str2) throws RemoteException;

    void createSSD(IMiTsmResponse iMiTsmResponse, int i) throws RemoteException;

    void deleteAllBankCard(IMiTsmResponse iMiTsmResponse) throws RemoteException;

    void deleteBankCard(IMiTsmResponse iMiTsmResponse, String str) throws RemoteException;

    void getActiveCards(IMiTsmResponse iMiTsmResponse, String str) throws RemoteException;

    void getCPLC(IMiTsmResponse iMiTsmResponse) throws RemoteException;

    void getCardInfo(IMiTsmResponse iMiTsmResponse, List<String> list) throws RemoteException;

    void getCardsQuantity(IMiTsmResponse iMiTsmResponse, String str) throws RemoteException;

    void getCardsState(IMiTsmResponse iMiTsmResponse) throws RemoteException;

    void getData(IMiTsmResponse iMiTsmResponse, String str, Bundle bundle) throws RemoteException;

    void getDefaultCard(IMiTsmResponse iMiTsmResponse, String str) throws RemoteException;

    void getMiPayStatus(IMiTsmResponse iMiTsmResponse) throws RemoteException;

    void getSeBankCards(IMiTsmResponse iMiTsmResponse) throws RemoteException;

    void getTransCardState(IMiTsmResponse iMiTsmResponse) throws RemoteException;

    void isBankCardAvailable(IMiTsmResponse iMiTsmResponse) throws RemoteException;

    void loadMipayCard(IMiTsmResponse iMiTsmResponse, String str) throws RemoteException;

    void manageBankCard(IMiTsmResponse iMiTsmResponse, String str, int i) throws RemoteException;

    void manageVirtualSimCard(IMiTsmResponse iMiTsmResponse, String str, int i) throws RemoteException;

    void notifyPayResult(IMiTsmResponse iMiTsmResponse, Bundle bundle) throws RemoteException;

    void requestInappTransaction(IMiTsmResponse iMiTsmResponse, Bundle bundle, int i) throws RemoteException;

    void requestPin(IMiTsmResponse iMiTsmResponse, int i) throws RemoteException;

    void requestPinWithBundle(IMiTsmResponse iMiTsmResponse, Bundle bundle, int i) throws RemoteException;

    void setDefaultCard(IMiTsmResponse iMiTsmResponse, String str, Bundle bundle) throws RemoteException;

    void syncBankCardStatus(IMiTsmResponse iMiTsmResponse) throws RemoteException;
}
