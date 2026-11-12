package com.xiaomi.mi_connect_service;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes11.dex */
public interface IMiConnect extends IInterface {
    public static final int ERROR = -1;
    public static final int OK = 0;

    public static class Default implements IMiConnect {
        @Override // com.xiaomi.mi_connect_service.IMiConnect
        public int abortInvitation(String str, byte[] bArr) throws RemoteException {
            return 0;
        }

        @Override // com.xiaomi.mi_connect_service.IMiConnect
        public void acceptConnection(int i, int i2, int i3, boolean z) throws RemoteException {
        }

        @Override // com.xiaomi.mi_connect_service.IMiConnect
        public int acceptInvitation(String str, byte[] bArr) throws RemoteException {
            return 0;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.xiaomi.mi_connect_service.IMiConnect
        public int clientAcceptConnection(String str, byte[] bArr) throws RemoteException {
            return 0;
        }

        @Override // com.xiaomi.mi_connect_service.IMiConnect
        public int clientRejectConnection(String str, byte[] bArr) throws RemoteException {
            return 0;
        }

        @Override // com.xiaomi.mi_connect_service.IMiConnect
        public void clientSendBlock(String str, byte[] bArr, byte[] bArr2) throws RemoteException {
        }

        @Override // com.xiaomi.mi_connect_service.IMiConnect
        public int connectService(String str, byte[] bArr) throws RemoteException {
            return 0;
        }

        @Override // com.xiaomi.mi_connect_service.IMiConnect
        public int connectServiceStatusResponse(String str, byte[] bArr) throws RemoteException {
            return 0;
        }

        @Override // com.xiaomi.mi_connect_service.IMiConnect
        public int createConnection(String str, byte[] bArr, IConnectionCallback iConnectionCallback) throws RemoteException {
            return 0;
        }

        @Override // com.xiaomi.mi_connect_service.IMiConnect
        public void createOutOfBandInfo(String str, byte[] bArr) throws RemoteException {
        }

        @Override // com.xiaomi.mi_connect_service.IMiConnect
        public void destroy(int i, int i2) throws RemoteException {
        }

        @Override // com.xiaomi.mi_connect_service.IMiConnect
        public int destroyConnection(String str, byte[] bArr) throws RemoteException {
            return 0;
        }

        @Override // com.xiaomi.mi_connect_service.IMiConnect
        public byte[] deviceInfoIDM() throws RemoteException {
            return null;
        }

        @Override // com.xiaomi.mi_connect_service.IMiConnect
        public void disconnectFromEndPoint(int i, int i2, int i3) throws RemoteException {
        }

        @Override // com.xiaomi.mi_connect_service.IMiConnect
        public int disconnectService(String str, byte[] bArr) throws RemoteException {
            return 0;
        }

        @Override // com.xiaomi.mi_connect_service.IMiConnect
        public int event(String str, byte[] bArr) throws RemoteException {
            return 0;
        }

        @Override // com.xiaomi.mi_connect_service.IMiConnect
        public byte[] getIdHash() throws RemoteException {
            return null;
        }

        @Override // com.xiaomi.mi_connect_service.IMiConnect
        public int getServiceApiVersion() throws RemoteException {
            return 0;
        }

        @Override // com.xiaomi.mi_connect_service.IMiConnect
        public int inviteConnection(String str, byte[] bArr) throws RemoteException {
            return 0;
        }

        @Override // com.xiaomi.mi_connect_service.IMiConnect
        public void notifyEventResponse(String str, byte[] bArr) throws RemoteException {
        }

        @Override // com.xiaomi.mi_connect_service.IMiConnect
        public int publish(int i, String str, String str2, byte[] bArr) throws RemoteException {
            return 0;
        }

        @Override // com.xiaomi.mi_connect_service.IMiConnect
        public void receivedOutOfBandInfo(String str, byte[] bArr) throws RemoteException {
        }

        @Override // com.xiaomi.mi_connect_service.IMiConnect
        public String registerIDMClient(String str, byte[] bArr, IIDMClientCallback iIDMClientCallback) throws RemoteException {
            return null;
        }

        @Override // com.xiaomi.mi_connect_service.IMiConnect
        public int registerProc(String str, byte[] bArr, IIDMServiceProcCallback iIDMServiceProcCallback) throws RemoteException {
            return 0;
        }

        @Override // com.xiaomi.mi_connect_service.IMiConnect
        public int registerSoundBoxWhiteName(ISoundBoxWhiteNameCallBack iSoundBoxWhiteNameCallBack) throws RemoteException {
            return 0;
        }

        @Override // com.xiaomi.mi_connect_service.IMiConnect
        public void rejectConnection(int i, int i2, int i3) throws RemoteException {
        }

        @Override // com.xiaomi.mi_connect_service.IMiConnect
        public byte[] request(String str, byte[] bArr) throws RemoteException {
            return null;
        }

        @Override // com.xiaomi.mi_connect_service.IMiConnect
        public void requestConnection(int i, int i2, byte[] bArr) throws RemoteException {
        }

        @Override // com.xiaomi.mi_connect_service.IMiConnect
        public int response(String str, byte[] bArr) throws RemoteException {
            return 0;
        }

        @Override // com.xiaomi.mi_connect_service.IMiConnect
        public void sendPayload(int i, int i2, int i3, byte[] bArr) throws RemoteException {
        }

        @Override // com.xiaomi.mi_connect_service.IMiConnect
        public void serverSendBlock(String str, byte[] bArr, byte[] bArr2) throws RemoteException {
        }

        @Override // com.xiaomi.mi_connect_service.IMiConnect
        public void setCallback(int i, int i2, IMiConnectCallback iMiConnectCallback) throws RemoteException {
        }

        @Override // com.xiaomi.mi_connect_service.IMiConnect
        public int setEventCallback(String str, byte[] bArr) throws RemoteException {
            return 0;
        }

        @Override // com.xiaomi.mi_connect_service.IMiConnect
        public int setIPCDataCallback(int i, String str, IIPCDataCallback iIPCDataCallback) throws RemoteException {
            return 0;
        }

        @Override // com.xiaomi.mi_connect_service.IMiConnect
        public void setPrivacyResult(boolean z) throws RemoteException {
        }

        @Override // com.xiaomi.mi_connect_service.IMiConnect
        public void startAdvertising(int i, byte[] bArr, int i2, int i3, byte[] bArr2) throws RemoteException {
        }

        @Override // com.xiaomi.mi_connect_service.IMiConnect
        public String startAdvertisingIDM(String str, byte[] bArr) throws RemoteException {
            return null;
        }

        @Override // com.xiaomi.mi_connect_service.IMiConnect
        public void startDiscovery(int i, byte[] bArr, int i2, int i3, int i4) throws RemoteException {
        }

        @Override // com.xiaomi.mi_connect_service.IMiConnect
        public int startDiscoveryIDM(String str, byte[] bArr) throws RemoteException {
            return 0;
        }

        @Override // com.xiaomi.mi_connect_service.IMiConnect
        public void startDiscoveryV2(int i, byte[] bArr, int i2, int i3, int i4, int[] iArr) throws RemoteException {
        }

        @Override // com.xiaomi.mi_connect_service.IMiConnect
        public long startSap(String str, String str2, int i, boolean z, IApStateCallback iApStateCallback) throws RemoteException {
            return 0L;
        }

        @Override // com.xiaomi.mi_connect_service.IMiConnect
        public int startScannerList(int i, IDeviceScannerCallback iDeviceScannerCallback, String str) throws RemoteException {
            return 0;
        }

        @Override // com.xiaomi.mi_connect_service.IMiConnect
        public void stopAdvertising(int i) throws RemoteException {
        }

        @Override // com.xiaomi.mi_connect_service.IMiConnect
        public int stopAdvertisingIDM(String str, byte[] bArr) throws RemoteException {
            return 0;
        }

        @Override // com.xiaomi.mi_connect_service.IMiConnect
        public void stopDiscovery(int i) throws RemoteException {
        }

        @Override // com.xiaomi.mi_connect_service.IMiConnect
        public int stopDiscoveryIDM(String str, byte[] bArr) throws RemoteException {
            return 0;
        }

        @Override // com.xiaomi.mi_connect_service.IMiConnect
        public void stopSap(long j) throws RemoteException {
        }

        @Override // com.xiaomi.mi_connect_service.IMiConnect
        public int subscribe(int i, String str, String str2, IDpsMessageListener iDpsMessageListener) throws RemoteException {
            return 0;
        }

        @Override // com.xiaomi.mi_connect_service.IMiConnect
        public void subscribeEventResult(String str, byte[] bArr) throws RemoteException {
        }

        @Override // com.xiaomi.mi_connect_service.IMiConnect
        public int unregisterIDMClient(String str) throws RemoteException {
            return 0;
        }

        @Override // com.xiaomi.mi_connect_service.IMiConnect
        public int unregisterProc(String str) throws RemoteException {
            return 0;
        }

        @Override // com.xiaomi.mi_connect_service.IMiConnect
        public int updateCommConfig(int i, int i2, int i3, byte[] bArr, int i4) throws RemoteException {
            return 0;
        }

        @Override // com.xiaomi.mi_connect_service.IMiConnect
        public boolean updateNearbyScreenOffEndpoint(byte[] bArr) throws RemoteException {
            return false;
        }

        @Override // com.xiaomi.mi_connect_service.IMiConnect
        public void updateService(String str, String str2, byte[] bArr) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IMiConnect {
        private static final String DESCRIPTOR = "com.xiaomi.mi_connect_service.IMiConnect";
        static final int TRANSACTION_abortInvitation = 44;
        static final int TRANSACTION_acceptConnection = 8;
        static final int TRANSACTION_acceptInvitation = 43;
        static final int TRANSACTION_clientAcceptConnection = 40;
        static final int TRANSACTION_clientRejectConnection = 41;
        static final int TRANSACTION_clientSendBlock = 51;
        static final int TRANSACTION_connectService = 24;
        static final int TRANSACTION_connectServiceStatusResponse = 28;
        static final int TRANSACTION_createConnection = 17;
        static final int TRANSACTION_createOutOfBandInfo = 48;
        static final int TRANSACTION_destroy = 12;
        static final int TRANSACTION_destroyConnection = 18;
        static final int TRANSACTION_deviceInfoIDM = 32;
        static final int TRANSACTION_disconnectFromEndPoint = 10;
        static final int TRANSACTION_disconnectService = 39;
        static final int TRANSACTION_event = 29;
        static final int TRANSACTION_getIdHash = 13;
        static final int TRANSACTION_getServiceApiVersion = 6;
        static final int TRANSACTION_inviteConnection = 42;
        static final int TRANSACTION_notifyEventResponse = 47;
        static final int TRANSACTION_publish = 15;
        static final int TRANSACTION_receivedOutOfBandInfo = 49;
        static final int TRANSACTION_registerIDMClient = 19;
        static final int TRANSACTION_registerProc = 25;
        static final int TRANSACTION_registerSoundBoxWhiteName = 36;
        static final int TRANSACTION_rejectConnection = 9;
        static final int TRANSACTION_request = 20;
        static final int TRANSACTION_requestConnection = 7;
        static final int TRANSACTION_response = 27;
        static final int TRANSACTION_sendPayload = 11;
        static final int TRANSACTION_serverSendBlock = 52;
        static final int TRANSACTION_setCallback = 1;
        static final int TRANSACTION_setEventCallback = 22;
        static final int TRANSACTION_setIPCDataCallback = 14;
        static final int TRANSACTION_setPrivacyResult = 53;
        static final int TRANSACTION_startAdvertising = 2;
        static final int TRANSACTION_startAdvertisingIDM = 26;
        static final int TRANSACTION_startDiscovery = 4;
        static final int TRANSACTION_startDiscoveryIDM = 21;
        static final int TRANSACTION_startDiscoveryV2 = 31;
        static final int TRANSACTION_startSap = 37;
        static final int TRANSACTION_startScannerList = 35;
        static final int TRANSACTION_stopAdvertising = 3;
        static final int TRANSACTION_stopAdvertisingIDM = 34;
        static final int TRANSACTION_stopDiscovery = 5;
        static final int TRANSACTION_stopDiscoveryIDM = 33;
        static final int TRANSACTION_stopSap = 38;
        static final int TRANSACTION_subscribe = 16;
        static final int TRANSACTION_subscribeEventResult = 46;
        static final int TRANSACTION_unregisterIDMClient = 23;
        static final int TRANSACTION_unregisterProc = 30;
        static final int TRANSACTION_updateCommConfig = 45;
        static final int TRANSACTION_updateNearbyScreenOffEndpoint = 54;
        static final int TRANSACTION_updateService = 50;

        public static class Proxy implements IMiConnect {
            public static IMiConnect sDefaultImpl;
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // com.xiaomi.mi_connect_service.IMiConnect
            public int abortInvitation(String str, byte[] bArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeByteArray(bArr);
                    if (!this.mRemote.transact(44, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().abortInvitation(str, bArr);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.mi_connect_service.IMiConnect
            public void acceptConnection(int i, int i2, int i3, boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeInt(i3);
                    parcelObtain.writeInt(z ? 1 : 0);
                    if (this.mRemote.transact(8, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().acceptConnection(i, i2, i3, z);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.mi_connect_service.IMiConnect
            public int acceptInvitation(String str, byte[] bArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeByteArray(bArr);
                    if (!this.mRemote.transact(43, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().acceptInvitation(str, bArr);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.xiaomi.mi_connect_service.IMiConnect
            public int clientAcceptConnection(String str, byte[] bArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeByteArray(bArr);
                    if (!this.mRemote.transact(40, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().clientAcceptConnection(str, bArr);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.mi_connect_service.IMiConnect
            public int clientRejectConnection(String str, byte[] bArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeByteArray(bArr);
                    if (!this.mRemote.transact(41, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().clientRejectConnection(str, bArr);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.mi_connect_service.IMiConnect
            public void clientSendBlock(String str, byte[] bArr, byte[] bArr2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeByteArray(bArr);
                    parcelObtain.writeByteArray(bArr2);
                    if (this.mRemote.transact(51, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().clientSendBlock(str, bArr, bArr2);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.mi_connect_service.IMiConnect
            public int connectService(String str, byte[] bArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeByteArray(bArr);
                    if (!this.mRemote.transact(24, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().connectService(str, bArr);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.mi_connect_service.IMiConnect
            public int connectServiceStatusResponse(String str, byte[] bArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeByteArray(bArr);
                    if (!this.mRemote.transact(28, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().connectServiceStatusResponse(str, bArr);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.mi_connect_service.IMiConnect
            public int createConnection(String str, byte[] bArr, IConnectionCallback iConnectionCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeByteArray(bArr);
                    parcelObtain.writeStrongBinder(iConnectionCallback != null ? iConnectionCallback.asBinder() : null);
                    if (!this.mRemote.transact(17, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().createConnection(str, bArr, iConnectionCallback);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.mi_connect_service.IMiConnect
            public void createOutOfBandInfo(String str, byte[] bArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeByteArray(bArr);
                    if (this.mRemote.transact(48, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().createOutOfBandInfo(str, bArr);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.mi_connect_service.IMiConnect
            public void destroy(int i, int i2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    if (this.mRemote.transact(12, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().destroy(i, i2);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.mi_connect_service.IMiConnect
            public int destroyConnection(String str, byte[] bArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeByteArray(bArr);
                    if (!this.mRemote.transact(18, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().destroyConnection(str, bArr);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.mi_connect_service.IMiConnect
            public byte[] deviceInfoIDM() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(32, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().deviceInfoIDM();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.createByteArray();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.mi_connect_service.IMiConnect
            public void disconnectFromEndPoint(int i, int i2, int i3) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeInt(i3);
                    if (this.mRemote.transact(10, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().disconnectFromEndPoint(i, i2, i3);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.mi_connect_service.IMiConnect
            public int disconnectService(String str, byte[] bArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeByteArray(bArr);
                    if (!this.mRemote.transact(39, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().disconnectService(str, bArr);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.mi_connect_service.IMiConnect
            public int event(String str, byte[] bArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeByteArray(bArr);
                    if (!this.mRemote.transact(29, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().event(str, bArr);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.mi_connect_service.IMiConnect
            public byte[] getIdHash() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(13, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getIdHash();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.createByteArray();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            @Override // com.xiaomi.mi_connect_service.IMiConnect
            public int getServiceApiVersion() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(6, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getServiceApiVersion();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.mi_connect_service.IMiConnect
            public int inviteConnection(String str, byte[] bArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeByteArray(bArr);
                    if (!this.mRemote.transact(42, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().inviteConnection(str, bArr);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.mi_connect_service.IMiConnect
            public void notifyEventResponse(String str, byte[] bArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeByteArray(bArr);
                    if (this.mRemote.transact(47, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().notifyEventResponse(str, bArr);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.mi_connect_service.IMiConnect
            public int publish(int i, String str, String str2, byte[] bArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeByteArray(bArr);
                    if (!this.mRemote.transact(15, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().publish(i, str, str2, bArr);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.mi_connect_service.IMiConnect
            public void receivedOutOfBandInfo(String str, byte[] bArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeByteArray(bArr);
                    if (this.mRemote.transact(49, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().receivedOutOfBandInfo(str, bArr);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.mi_connect_service.IMiConnect
            public String registerIDMClient(String str, byte[] bArr, IIDMClientCallback iIDMClientCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeByteArray(bArr);
                    parcelObtain.writeStrongBinder(iIDMClientCallback != null ? iIDMClientCallback.asBinder() : null);
                    if (!this.mRemote.transact(19, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().registerIDMClient(str, bArr, iIDMClientCallback);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.mi_connect_service.IMiConnect
            public int registerProc(String str, byte[] bArr, IIDMServiceProcCallback iIDMServiceProcCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeByteArray(bArr);
                    parcelObtain.writeStrongBinder(iIDMServiceProcCallback != null ? iIDMServiceProcCallback.asBinder() : null);
                    if (!this.mRemote.transact(25, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().registerProc(str, bArr, iIDMServiceProcCallback);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.mi_connect_service.IMiConnect
            public int registerSoundBoxWhiteName(ISoundBoxWhiteNameCallBack iSoundBoxWhiteNameCallBack) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeStrongBinder(iSoundBoxWhiteNameCallBack != null ? iSoundBoxWhiteNameCallBack.asBinder() : null);
                    if (!this.mRemote.transact(36, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().registerSoundBoxWhiteName(iSoundBoxWhiteNameCallBack);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.mi_connect_service.IMiConnect
            public void rejectConnection(int i, int i2, int i3) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeInt(i3);
                    if (this.mRemote.transact(9, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().rejectConnection(i, i2, i3);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.mi_connect_service.IMiConnect
            public byte[] request(String str, byte[] bArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeByteArray(bArr);
                    if (!this.mRemote.transact(20, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().request(str, bArr);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.createByteArray();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.mi_connect_service.IMiConnect
            public void requestConnection(int i, int i2, byte[] bArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeByteArray(bArr);
                    if (this.mRemote.transact(7, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().requestConnection(i, i2, bArr);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.mi_connect_service.IMiConnect
            public int response(String str, byte[] bArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeByteArray(bArr);
                    if (!this.mRemote.transact(27, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().response(str, bArr);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.mi_connect_service.IMiConnect
            public void sendPayload(int i, int i2, int i3, byte[] bArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeInt(i3);
                    parcelObtain.writeByteArray(bArr);
                    if (this.mRemote.transact(11, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().sendPayload(i, i2, i3, bArr);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.mi_connect_service.IMiConnect
            public void serverSendBlock(String str, byte[] bArr, byte[] bArr2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeByteArray(bArr);
                    parcelObtain.writeByteArray(bArr2);
                    if (this.mRemote.transact(52, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().serverSendBlock(str, bArr, bArr2);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.mi_connect_service.IMiConnect
            public void setCallback(int i, int i2, IMiConnectCallback iMiConnectCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeStrongBinder(iMiConnectCallback != null ? iMiConnectCallback.asBinder() : null);
                    if (this.mRemote.transact(1, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().setCallback(i, i2, iMiConnectCallback);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.mi_connect_service.IMiConnect
            public int setEventCallback(String str, byte[] bArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeByteArray(bArr);
                    if (!this.mRemote.transact(22, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().setEventCallback(str, bArr);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.mi_connect_service.IMiConnect
            public int setIPCDataCallback(int i, String str, IIPCDataCallback iIPCDataCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongBinder(iIPCDataCallback != null ? iIPCDataCallback.asBinder() : null);
                    if (!this.mRemote.transact(14, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().setIPCDataCallback(i, str, iIPCDataCallback);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.mi_connect_service.IMiConnect
            public void setPrivacyResult(boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(z ? 1 : 0);
                    if (this.mRemote.transact(53, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().setPrivacyResult(z);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.mi_connect_service.IMiConnect
            public void startAdvertising(int i, byte[] bArr, int i2, int i3, byte[] bArr2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeByteArray(bArr);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeInt(i3);
                    parcelObtain.writeByteArray(bArr2);
                    if (this.mRemote.transact(2, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().startAdvertising(i, bArr, i2, i3, bArr2);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.mi_connect_service.IMiConnect
            public String startAdvertisingIDM(String str, byte[] bArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeByteArray(bArr);
                    if (!this.mRemote.transact(26, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().startAdvertisingIDM(str, bArr);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.mi_connect_service.IMiConnect
            public void startDiscovery(int i, byte[] bArr, int i2, int i3, int i4) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeByteArray(bArr);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeInt(i3);
                    parcelObtain.writeInt(i4);
                    if (this.mRemote.transact(4, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().startDiscovery(i, bArr, i2, i3, i4);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.mi_connect_service.IMiConnect
            public int startDiscoveryIDM(String str, byte[] bArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeByteArray(bArr);
                    if (!this.mRemote.transact(21, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().startDiscoveryIDM(str, bArr);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.mi_connect_service.IMiConnect
            public void startDiscoveryV2(int i, byte[] bArr, int i2, int i3, int i4, int[] iArr) throws Throwable {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeByteArray(bArr);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeInt(i3);
                    parcelObtain.writeInt(i4);
                    parcelObtain.writeIntArray(iArr);
                    try {
                        if (this.mRemote.transact(31, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                            parcelObtain2.readException();
                            parcelObtain2.recycle();
                            parcelObtain.recycle();
                        } else {
                            Stub.getDefaultImpl().startDiscoveryV2(i, bArr, i2, i3, i4, iArr);
                            parcelObtain2.recycle();
                            parcelObtain.recycle();
                        }
                    } catch (Throwable th) {
                        th = th;
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }

            @Override // com.xiaomi.mi_connect_service.IMiConnect
            public long startSap(String str, String str2, int i, boolean z, IApStateCallback iApStateCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(z ? 1 : 0);
                    parcelObtain.writeStrongBinder(iApStateCallback != null ? iApStateCallback.asBinder() : null);
                    if (!this.mRemote.transact(37, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().startSap(str, str2, i, z, iApStateCallback);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readLong();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.mi_connect_service.IMiConnect
            public int startScannerList(int i, IDeviceScannerCallback iDeviceScannerCallback, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeStrongBinder(iDeviceScannerCallback != null ? iDeviceScannerCallback.asBinder() : null);
                    parcelObtain.writeString(str);
                    if (!this.mRemote.transact(35, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().startScannerList(i, iDeviceScannerCallback, str);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.mi_connect_service.IMiConnect
            public void stopAdvertising(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    if (this.mRemote.transact(3, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().stopAdvertising(i);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.mi_connect_service.IMiConnect
            public int stopAdvertisingIDM(String str, byte[] bArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeByteArray(bArr);
                    if (!this.mRemote.transact(34, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().stopAdvertisingIDM(str, bArr);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.mi_connect_service.IMiConnect
            public void stopDiscovery(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    if (this.mRemote.transact(5, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().stopDiscovery(i);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.mi_connect_service.IMiConnect
            public int stopDiscoveryIDM(String str, byte[] bArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeByteArray(bArr);
                    if (!this.mRemote.transact(33, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().stopDiscoveryIDM(str, bArr);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.mi_connect_service.IMiConnect
            public void stopSap(long j) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeLong(j);
                    if (this.mRemote.transact(38, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().stopSap(j);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.mi_connect_service.IMiConnect
            public int subscribe(int i, String str, String str2, IDpsMessageListener iDpsMessageListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeStrongBinder(iDpsMessageListener != null ? iDpsMessageListener.asBinder() : null);
                    if (!this.mRemote.transact(16, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().subscribe(i, str, str2, iDpsMessageListener);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.mi_connect_service.IMiConnect
            public void subscribeEventResult(String str, byte[] bArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeByteArray(bArr);
                    if (this.mRemote.transact(46, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().subscribeEventResult(str, bArr);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.mi_connect_service.IMiConnect
            public int unregisterIDMClient(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    if (!this.mRemote.transact(23, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().unregisterIDMClient(str);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.mi_connect_service.IMiConnect
            public int unregisterProc(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    if (!this.mRemote.transact(30, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().unregisterProc(str);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.mi_connect_service.IMiConnect
            public int updateCommConfig(int i, int i2, int i3, byte[] bArr, int i4) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeInt(i3);
                    parcelObtain.writeByteArray(bArr);
                    parcelObtain.writeInt(i4);
                    if (!this.mRemote.transact(45, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().updateCommConfig(i, i2, i3, bArr, i4);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.mi_connect_service.IMiConnect
            public boolean updateNearbyScreenOffEndpoint(byte[] bArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeByteArray(bArr);
                    if (!this.mRemote.transact(54, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().updateNearbyScreenOffEndpoint(bArr);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.mi_connect_service.IMiConnect
            public void updateService(String str, String str2, byte[] bArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeByteArray(bArr);
                    if (this.mRemote.transact(50, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().updateService(str, str2, bArr);
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

        public static IMiConnect asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IMiConnect)) ? new Proxy(iBinder) : (IMiConnect) iInterfaceQueryLocalInterface;
        }

        public static IMiConnect getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IMiConnect iMiConnect) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iMiConnect == null) {
                return false;
            }
            Proxy.sDefaultImpl = iMiConnect;
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
                    setCallback(parcel.readInt(), parcel.readInt(), IMiConnectCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface(DESCRIPTOR);
                    startAdvertising(parcel.readInt(), parcel.createByteArray(), parcel.readInt(), parcel.readInt(), parcel.createByteArray());
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface(DESCRIPTOR);
                    stopAdvertising(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface(DESCRIPTOR);
                    startDiscovery(parcel.readInt(), parcel.createByteArray(), parcel.readInt(), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface(DESCRIPTOR);
                    stopDiscovery(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 6:
                    parcel.enforceInterface(DESCRIPTOR);
                    int serviceApiVersion = getServiceApiVersion();
                    parcel2.writeNoException();
                    parcel2.writeInt(serviceApiVersion);
                    return true;
                case 7:
                    parcel.enforceInterface(DESCRIPTOR);
                    requestConnection(parcel.readInt(), parcel.readInt(), parcel.createByteArray());
                    parcel2.writeNoException();
                    return true;
                case 8:
                    parcel.enforceInterface(DESCRIPTOR);
                    acceptConnection(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 9:
                    parcel.enforceInterface(DESCRIPTOR);
                    rejectConnection(parcel.readInt(), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 10:
                    parcel.enforceInterface(DESCRIPTOR);
                    disconnectFromEndPoint(parcel.readInt(), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 11:
                    parcel.enforceInterface(DESCRIPTOR);
                    sendPayload(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.createByteArray());
                    parcel2.writeNoException();
                    return true;
                case 12:
                    parcel.enforceInterface(DESCRIPTOR);
                    destroy(parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 13:
                    parcel.enforceInterface(DESCRIPTOR);
                    byte[] idHash = getIdHash();
                    parcel2.writeNoException();
                    parcel2.writeByteArray(idHash);
                    return true;
                case 14:
                    parcel.enforceInterface(DESCRIPTOR);
                    int iPCDataCallback = setIPCDataCallback(parcel.readInt(), parcel.readString(), IIPCDataCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(iPCDataCallback);
                    return true;
                case 15:
                    parcel.enforceInterface(DESCRIPTOR);
                    int iPublish = publish(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.createByteArray());
                    parcel2.writeNoException();
                    parcel2.writeInt(iPublish);
                    return true;
                case 16:
                    parcel.enforceInterface(DESCRIPTOR);
                    int iSubscribe = subscribe(parcel.readInt(), parcel.readString(), parcel.readString(), IDpsMessageListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(iSubscribe);
                    return true;
                case 17:
                    parcel.enforceInterface(DESCRIPTOR);
                    int iCreateConnection = createConnection(parcel.readString(), parcel.createByteArray(), IConnectionCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(iCreateConnection);
                    return true;
                case 18:
                    parcel.enforceInterface(DESCRIPTOR);
                    int iDestroyConnection = destroyConnection(parcel.readString(), parcel.createByteArray());
                    parcel2.writeNoException();
                    parcel2.writeInt(iDestroyConnection);
                    return true;
                case 19:
                    parcel.enforceInterface(DESCRIPTOR);
                    String strRegisterIDMClient = registerIDMClient(parcel.readString(), parcel.createByteArray(), IIDMClientCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeString(strRegisterIDMClient);
                    return true;
                case 20:
                    parcel.enforceInterface(DESCRIPTOR);
                    byte[] bArrRequest = request(parcel.readString(), parcel.createByteArray());
                    parcel2.writeNoException();
                    parcel2.writeByteArray(bArrRequest);
                    return true;
                case 21:
                    parcel.enforceInterface(DESCRIPTOR);
                    int iStartDiscoveryIDM = startDiscoveryIDM(parcel.readString(), parcel.createByteArray());
                    parcel2.writeNoException();
                    parcel2.writeInt(iStartDiscoveryIDM);
                    return true;
                case 22:
                    parcel.enforceInterface(DESCRIPTOR);
                    int eventCallback = setEventCallback(parcel.readString(), parcel.createByteArray());
                    parcel2.writeNoException();
                    parcel2.writeInt(eventCallback);
                    return true;
                case 23:
                    parcel.enforceInterface(DESCRIPTOR);
                    int iUnregisterIDMClient = unregisterIDMClient(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(iUnregisterIDMClient);
                    return true;
                case 24:
                    parcel.enforceInterface(DESCRIPTOR);
                    int iConnectService = connectService(parcel.readString(), parcel.createByteArray());
                    parcel2.writeNoException();
                    parcel2.writeInt(iConnectService);
                    return true;
                case 25:
                    parcel.enforceInterface(DESCRIPTOR);
                    int iRegisterProc = registerProc(parcel.readString(), parcel.createByteArray(), IIDMServiceProcCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(iRegisterProc);
                    return true;
                case 26:
                    parcel.enforceInterface(DESCRIPTOR);
                    String strStartAdvertisingIDM = startAdvertisingIDM(parcel.readString(), parcel.createByteArray());
                    parcel2.writeNoException();
                    parcel2.writeString(strStartAdvertisingIDM);
                    return true;
                case 27:
                    parcel.enforceInterface(DESCRIPTOR);
                    int iResponse = response(parcel.readString(), parcel.createByteArray());
                    parcel2.writeNoException();
                    parcel2.writeInt(iResponse);
                    return true;
                case 28:
                    parcel.enforceInterface(DESCRIPTOR);
                    int iConnectServiceStatusResponse = connectServiceStatusResponse(parcel.readString(), parcel.createByteArray());
                    parcel2.writeNoException();
                    parcel2.writeInt(iConnectServiceStatusResponse);
                    return true;
                case 29:
                    parcel.enforceInterface(DESCRIPTOR);
                    int iEvent = event(parcel.readString(), parcel.createByteArray());
                    parcel2.writeNoException();
                    parcel2.writeInt(iEvent);
                    return true;
                case 30:
                    parcel.enforceInterface(DESCRIPTOR);
                    int iUnregisterProc = unregisterProc(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(iUnregisterProc);
                    return true;
                case 31:
                    parcel.enforceInterface(DESCRIPTOR);
                    startDiscoveryV2(parcel.readInt(), parcel.createByteArray(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.createIntArray());
                    parcel2.writeNoException();
                    return true;
                case 32:
                    parcel.enforceInterface(DESCRIPTOR);
                    byte[] bArrDeviceInfoIDM = deviceInfoIDM();
                    parcel2.writeNoException();
                    parcel2.writeByteArray(bArrDeviceInfoIDM);
                    return true;
                case 33:
                    parcel.enforceInterface(DESCRIPTOR);
                    int iStopDiscoveryIDM = stopDiscoveryIDM(parcel.readString(), parcel.createByteArray());
                    parcel2.writeNoException();
                    parcel2.writeInt(iStopDiscoveryIDM);
                    return true;
                case 34:
                    parcel.enforceInterface(DESCRIPTOR);
                    int iStopAdvertisingIDM = stopAdvertisingIDM(parcel.readString(), parcel.createByteArray());
                    parcel2.writeNoException();
                    parcel2.writeInt(iStopAdvertisingIDM);
                    return true;
                case 35:
                    parcel.enforceInterface(DESCRIPTOR);
                    int iStartScannerList = startScannerList(parcel.readInt(), IDeviceScannerCallback.Stub.asInterface(parcel.readStrongBinder()), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(iStartScannerList);
                    return true;
                case 36:
                    parcel.enforceInterface(DESCRIPTOR);
                    int iRegisterSoundBoxWhiteName = registerSoundBoxWhiteName(ISoundBoxWhiteNameCallBack.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(iRegisterSoundBoxWhiteName);
                    return true;
                case 37:
                    parcel.enforceInterface(DESCRIPTOR);
                    long jStartSap = startSap(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt() != 0, IApStateCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeLong(jStartSap);
                    return true;
                case 38:
                    parcel.enforceInterface(DESCRIPTOR);
                    stopSap(parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 39:
                    parcel.enforceInterface(DESCRIPTOR);
                    int iDisconnectService = disconnectService(parcel.readString(), parcel.createByteArray());
                    parcel2.writeNoException();
                    parcel2.writeInt(iDisconnectService);
                    return true;
                case 40:
                    parcel.enforceInterface(DESCRIPTOR);
                    int iClientAcceptConnection = clientAcceptConnection(parcel.readString(), parcel.createByteArray());
                    parcel2.writeNoException();
                    parcel2.writeInt(iClientAcceptConnection);
                    return true;
                case 41:
                    parcel.enforceInterface(DESCRIPTOR);
                    int iClientRejectConnection = clientRejectConnection(parcel.readString(), parcel.createByteArray());
                    parcel2.writeNoException();
                    parcel2.writeInt(iClientRejectConnection);
                    return true;
                case 42:
                    parcel.enforceInterface(DESCRIPTOR);
                    int iInviteConnection = inviteConnection(parcel.readString(), parcel.createByteArray());
                    parcel2.writeNoException();
                    parcel2.writeInt(iInviteConnection);
                    return true;
                case 43:
                    parcel.enforceInterface(DESCRIPTOR);
                    int iAcceptInvitation = acceptInvitation(parcel.readString(), parcel.createByteArray());
                    parcel2.writeNoException();
                    parcel2.writeInt(iAcceptInvitation);
                    return true;
                case 44:
                    parcel.enforceInterface(DESCRIPTOR);
                    int iAbortInvitation = abortInvitation(parcel.readString(), parcel.createByteArray());
                    parcel2.writeNoException();
                    parcel2.writeInt(iAbortInvitation);
                    return true;
                case 45:
                    parcel.enforceInterface(DESCRIPTOR);
                    int iUpdateCommConfig = updateCommConfig(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.createByteArray(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(iUpdateCommConfig);
                    return true;
                case 46:
                    parcel.enforceInterface(DESCRIPTOR);
                    subscribeEventResult(parcel.readString(), parcel.createByteArray());
                    parcel2.writeNoException();
                    return true;
                case 47:
                    parcel.enforceInterface(DESCRIPTOR);
                    notifyEventResponse(parcel.readString(), parcel.createByteArray());
                    parcel2.writeNoException();
                    return true;
                case 48:
                    parcel.enforceInterface(DESCRIPTOR);
                    createOutOfBandInfo(parcel.readString(), parcel.createByteArray());
                    parcel2.writeNoException();
                    return true;
                case 49:
                    parcel.enforceInterface(DESCRIPTOR);
                    receivedOutOfBandInfo(parcel.readString(), parcel.createByteArray());
                    parcel2.writeNoException();
                    return true;
                case 50:
                    parcel.enforceInterface(DESCRIPTOR);
                    updateService(parcel.readString(), parcel.readString(), parcel.createByteArray());
                    parcel2.writeNoException();
                    return true;
                case 51:
                    parcel.enforceInterface(DESCRIPTOR);
                    clientSendBlock(parcel.readString(), parcel.createByteArray(), parcel.createByteArray());
                    parcel2.writeNoException();
                    return true;
                case 52:
                    parcel.enforceInterface(DESCRIPTOR);
                    serverSendBlock(parcel.readString(), parcel.createByteArray(), parcel.createByteArray());
                    parcel2.writeNoException();
                    return true;
                case 53:
                    parcel.enforceInterface(DESCRIPTOR);
                    setPrivacyResult(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 54:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean zUpdateNearbyScreenOffEndpoint = updateNearbyScreenOffEndpoint(parcel.createByteArray());
                    parcel2.writeNoException();
                    parcel2.writeInt(zUpdateNearbyScreenOffEndpoint ? 1 : 0);
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    int abortInvitation(String str, byte[] bArr) throws RemoteException;

    void acceptConnection(int i, int i2, int i3, boolean z) throws RemoteException;

    int acceptInvitation(String str, byte[] bArr) throws RemoteException;

    int clientAcceptConnection(String str, byte[] bArr) throws RemoteException;

    int clientRejectConnection(String str, byte[] bArr) throws RemoteException;

    void clientSendBlock(String str, byte[] bArr, byte[] bArr2) throws RemoteException;

    int connectService(String str, byte[] bArr) throws RemoteException;

    int connectServiceStatusResponse(String str, byte[] bArr) throws RemoteException;

    int createConnection(String str, byte[] bArr, IConnectionCallback iConnectionCallback) throws RemoteException;

    void createOutOfBandInfo(String str, byte[] bArr) throws RemoteException;

    void destroy(int i, int i2) throws RemoteException;

    int destroyConnection(String str, byte[] bArr) throws RemoteException;

    byte[] deviceInfoIDM() throws RemoteException;

    void disconnectFromEndPoint(int i, int i2, int i3) throws RemoteException;

    int disconnectService(String str, byte[] bArr) throws RemoteException;

    int event(String str, byte[] bArr) throws RemoteException;

    byte[] getIdHash() throws RemoteException;

    int getServiceApiVersion() throws RemoteException;

    int inviteConnection(String str, byte[] bArr) throws RemoteException;

    void notifyEventResponse(String str, byte[] bArr) throws RemoteException;

    int publish(int i, String str, String str2, byte[] bArr) throws RemoteException;

    void receivedOutOfBandInfo(String str, byte[] bArr) throws RemoteException;

    String registerIDMClient(String str, byte[] bArr, IIDMClientCallback iIDMClientCallback) throws RemoteException;

    int registerProc(String str, byte[] bArr, IIDMServiceProcCallback iIDMServiceProcCallback) throws RemoteException;

    int registerSoundBoxWhiteName(ISoundBoxWhiteNameCallBack iSoundBoxWhiteNameCallBack) throws RemoteException;

    void rejectConnection(int i, int i2, int i3) throws RemoteException;

    byte[] request(String str, byte[] bArr) throws RemoteException;

    void requestConnection(int i, int i2, byte[] bArr) throws RemoteException;

    int response(String str, byte[] bArr) throws RemoteException;

    void sendPayload(int i, int i2, int i3, byte[] bArr) throws RemoteException;

    void serverSendBlock(String str, byte[] bArr, byte[] bArr2) throws RemoteException;

    void setCallback(int i, int i2, IMiConnectCallback iMiConnectCallback) throws RemoteException;

    int setEventCallback(String str, byte[] bArr) throws RemoteException;

    int setIPCDataCallback(int i, String str, IIPCDataCallback iIPCDataCallback) throws RemoteException;

    void setPrivacyResult(boolean z) throws RemoteException;

    void startAdvertising(int i, byte[] bArr, int i2, int i3, byte[] bArr2) throws RemoteException;

    String startAdvertisingIDM(String str, byte[] bArr) throws RemoteException;

    void startDiscovery(int i, byte[] bArr, int i2, int i3, int i4) throws RemoteException;

    int startDiscoveryIDM(String str, byte[] bArr) throws RemoteException;

    void startDiscoveryV2(int i, byte[] bArr, int i2, int i3, int i4, int[] iArr) throws RemoteException;

    long startSap(String str, String str2, int i, boolean z, IApStateCallback iApStateCallback) throws RemoteException;

    int startScannerList(int i, IDeviceScannerCallback iDeviceScannerCallback, String str) throws RemoteException;

    void stopAdvertising(int i) throws RemoteException;

    int stopAdvertisingIDM(String str, byte[] bArr) throws RemoteException;

    void stopDiscovery(int i) throws RemoteException;

    int stopDiscoveryIDM(String str, byte[] bArr) throws RemoteException;

    void stopSap(long j) throws RemoteException;

    int subscribe(int i, String str, String str2, IDpsMessageListener iDpsMessageListener) throws RemoteException;

    void subscribeEventResult(String str, byte[] bArr) throws RemoteException;

    int unregisterIDMClient(String str) throws RemoteException;

    int unregisterProc(String str) throws RemoteException;

    int updateCommConfig(int i, int i2, int i3, byte[] bArr, int i4) throws RemoteException;

    boolean updateNearbyScreenOffEndpoint(byte[] bArr) throws RemoteException;

    void updateService(String str, String str2, byte[] bArr) throws RemoteException;
}
