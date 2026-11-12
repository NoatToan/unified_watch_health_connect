package com.huawei.android.airsharing.client;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.huawei.android.airsharing.api.CapabilityResponse;
import com.huawei.android.airsharing.api.EProjectionMode;
import com.huawei.android.airsharing.api.ERequestedCapability;
import com.huawei.android.airsharing.api.IRemoteCtrlEventProcessor;
import com.huawei.android.airsharing.api.ProjectionDevice;

/* JADX INFO: loaded from: classes22.dex */
public interface ICastSession extends IInterface {
    boolean addDevice(ProjectionDevice projectionDevice, EProjectionMode eProjectionMode) throws RemoteException;

    boolean appendHiSightExInfo(int i, byte[] bArr, int i2, long j) throws RemoteException;

    EProjectionMode getCurrentProjectionMode() throws RemoteException;

    int getDisplayId() throws RemoteException;

    IRemotePlayController getRemotePlayController(ProjectionDevice projectionDevice) throws RemoteException;

    int getSessionIndex() throws RemoteException;

    int getSessionServerPort() throws RemoteException;

    boolean inputJsonDataForCast(String str) throws RemoteException;

    void registerListener(IAidlHwListener iAidlHwListener) throws RemoteException;

    boolean removeDevice(ProjectionDevice projectionDevice) throws RemoteException;

    CapabilityResponse requestCapability(ERequestedCapability eRequestedCapability) throws RemoteException;

    boolean requestSwitchProjectionMode(EProjectionMode eProjectionMode) throws RemoteException;

    int sendRemoteCtrlData(int i, int i2, byte[] bArr) throws RemoteException;

    void setRemoteCtrlEventProcessor(IRemoteCtrlEventProcessor iRemoteCtrlEventProcessor) throws RemoteException;

    void unRegisterListener() throws RemoteException;

    public static abstract class Stub extends Binder implements ICastSession {
        private static final String DESCRIPTOR = "com.huawei.android.airsharing.client.ICastSession";
        static final int TRANSACTION_addDevice = 5;
        static final int TRANSACTION_appendHiSightExInfo = 10;
        static final int TRANSACTION_getCurrentProjectionMode = 15;
        static final int TRANSACTION_getDisplayId = 4;
        static final int TRANSACTION_getRemotePlayController = 13;
        static final int TRANSACTION_getSessionIndex = 1;
        static final int TRANSACTION_getSessionServerPort = 12;
        static final int TRANSACTION_inputJsonDataForCast = 7;
        static final int TRANSACTION_registerListener = 2;
        static final int TRANSACTION_removeDevice = 6;
        static final int TRANSACTION_requestCapability = 11;
        static final int TRANSACTION_requestSwitchProjectionMode = 14;
        static final int TRANSACTION_sendRemoteCtrlData = 8;
        static final int TRANSACTION_setRemoteCtrlEventProcessor = 9;
        static final int TRANSACTION_unRegisterListener = 3;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static ICastSession asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof ICastSession)) {
                return (ICastSession) iInterfaceQueryLocalInterface;
            }
            return new e(iBinder);
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
                    int sessionIndex = getSessionIndex();
                    parcel2.writeNoException();
                    parcel2.writeInt(sessionIndex);
                    return true;
                case 2:
                    parcel.enforceInterface(DESCRIPTOR);
                    registerListener(IAidlHwListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface(DESCRIPTOR);
                    unRegisterListener();
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface(DESCRIPTOR);
                    int displayId = getDisplayId();
                    parcel2.writeNoException();
                    parcel2.writeInt(displayId);
                    return true;
                case 5:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean zAddDevice = addDevice(parcel.readInt() != 0 ? ProjectionDevice.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? EProjectionMode.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeInt(zAddDevice ? 1 : 0);
                    return true;
                case 6:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean zRemoveDevice = removeDevice(parcel.readInt() != 0 ? ProjectionDevice.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeInt(zRemoveDevice ? 1 : 0);
                    return true;
                case 7:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean zInputJsonDataForCast = inputJsonDataForCast(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(zInputJsonDataForCast ? 1 : 0);
                    return true;
                case 8:
                    parcel.enforceInterface(DESCRIPTOR);
                    int iSendRemoteCtrlData = sendRemoteCtrlData(parcel.readInt(), parcel.readInt(), parcel.createByteArray());
                    parcel2.writeNoException();
                    parcel2.writeInt(iSendRemoteCtrlData);
                    return true;
                case 9:
                    parcel.enforceInterface(DESCRIPTOR);
                    setRemoteCtrlEventProcessor(IRemoteCtrlEventProcessor.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 10:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean zAppendHiSightExInfo = appendHiSightExInfo(parcel.readInt(), parcel.createByteArray(), parcel.readInt(), parcel.readLong());
                    parcel2.writeNoException();
                    parcel2.writeInt(zAppendHiSightExInfo ? 1 : 0);
                    return true;
                case 11:
                    parcel.enforceInterface(DESCRIPTOR);
                    CapabilityResponse capabilityResponseRequestCapability = requestCapability(parcel.readInt() != 0 ? ERequestedCapability.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    if (capabilityResponseRequestCapability != null) {
                        parcel2.writeInt(1);
                        capabilityResponseRequestCapability.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 12:
                    parcel.enforceInterface(DESCRIPTOR);
                    int sessionServerPort = getSessionServerPort();
                    parcel2.writeNoException();
                    parcel2.writeInt(sessionServerPort);
                    return true;
                case 13:
                    parcel.enforceInterface(DESCRIPTOR);
                    IRemotePlayController remotePlayController = getRemotePlayController(parcel.readInt() != 0 ? ProjectionDevice.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(remotePlayController != null ? remotePlayController.asBinder() : null);
                    return true;
                case 14:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean zRequestSwitchProjectionMode = requestSwitchProjectionMode(parcel.readInt() != 0 ? EProjectionMode.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeInt(zRequestSwitchProjectionMode ? 1 : 0);
                    return true;
                case 15:
                    parcel.enforceInterface(DESCRIPTOR);
                    EProjectionMode currentProjectionMode = getCurrentProjectionMode();
                    parcel2.writeNoException();
                    if (currentProjectionMode != null) {
                        parcel2.writeInt(1);
                        currentProjectionMode.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }

        static class e implements ICastSession {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static ICastSession f5074a;
            private IBinder d;

            e(IBinder iBinder) {
                this.d = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.d;
            }

            @Override // com.huawei.android.airsharing.client.ICastSession
            public int getSessionIndex() throws RemoteException {
                int sessionIndex;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.d.transact(1, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        sessionIndex = Stub.getDefaultImpl().getSessionIndex();
                    } else {
                        parcelObtain2.readException();
                        sessionIndex = parcelObtain2.readInt();
                    }
                    return sessionIndex;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.android.airsharing.client.ICastSession
            public void registerListener(IAidlHwListener iAidlHwListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeStrongBinder(iAidlHwListener != null ? iAidlHwListener.asBinder() : null);
                    if (!this.d.transact(2, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().registerListener(iAidlHwListener);
                    } else {
                        parcelObtain2.readException();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.android.airsharing.client.ICastSession
            public void unRegisterListener() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.d.transact(3, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().unRegisterListener();
                    } else {
                        parcelObtain2.readException();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.android.airsharing.client.ICastSession
            public int getDisplayId() throws RemoteException {
                int displayId;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.d.transact(4, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        displayId = Stub.getDefaultImpl().getDisplayId();
                    } else {
                        parcelObtain2.readException();
                        displayId = parcelObtain2.readInt();
                    }
                    return displayId;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.android.airsharing.client.ICastSession
            public boolean addDevice(ProjectionDevice projectionDevice, EProjectionMode eProjectionMode) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (projectionDevice != null) {
                        parcelObtain.writeInt(1);
                        projectionDevice.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (eProjectionMode != null) {
                        parcelObtain.writeInt(1);
                        eProjectionMode.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.d.transact(5, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().addDevice(projectionDevice, eProjectionMode);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.android.airsharing.client.ICastSession
            public boolean removeDevice(ProjectionDevice projectionDevice) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (projectionDevice != null) {
                        parcelObtain.writeInt(1);
                        projectionDevice.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.d.transact(6, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().removeDevice(projectionDevice);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.android.airsharing.client.ICastSession
            public boolean inputJsonDataForCast(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    if (!this.d.transact(7, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().inputJsonDataForCast(str);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.android.airsharing.client.ICastSession
            public int sendRemoteCtrlData(int i, int i2, byte[] bArr) throws RemoteException {
                int iSendRemoteCtrlData;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeByteArray(bArr);
                    if (!this.d.transact(8, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        iSendRemoteCtrlData = Stub.getDefaultImpl().sendRemoteCtrlData(i, i2, bArr);
                    } else {
                        parcelObtain2.readException();
                        iSendRemoteCtrlData = parcelObtain2.readInt();
                    }
                    return iSendRemoteCtrlData;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.android.airsharing.client.ICastSession
            public void setRemoteCtrlEventProcessor(IRemoteCtrlEventProcessor iRemoteCtrlEventProcessor) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeStrongBinder(iRemoteCtrlEventProcessor != null ? iRemoteCtrlEventProcessor.asBinder() : null);
                    if (!this.d.transact(9, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().setRemoteCtrlEventProcessor(iRemoteCtrlEventProcessor);
                    } else {
                        parcelObtain2.readException();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.android.airsharing.client.ICastSession
            public boolean appendHiSightExInfo(int i, byte[] bArr, int i2, long j) throws Throwable {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeByteArray(bArr);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeLong(j);
                    try {
                        if (!this.d.transact(10, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                            boolean zAppendHiSightExInfo = Stub.getDefaultImpl().appendHiSightExInfo(i, bArr, i2, j);
                            parcelObtain2.recycle();
                            parcelObtain.recycle();
                            return zAppendHiSightExInfo;
                        }
                        parcelObtain2.readException();
                        boolean z = parcelObtain2.readInt() != 0;
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                        return z;
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

            @Override // com.huawei.android.airsharing.client.ICastSession
            public CapabilityResponse requestCapability(ERequestedCapability eRequestedCapability) throws RemoteException {
                CapabilityResponse capabilityResponseCreateFromParcel;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (eRequestedCapability != null) {
                        parcelObtain.writeInt(1);
                        eRequestedCapability.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.d.transact(11, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        capabilityResponseCreateFromParcel = Stub.getDefaultImpl().requestCapability(eRequestedCapability);
                    } else {
                        parcelObtain2.readException();
                        capabilityResponseCreateFromParcel = parcelObtain2.readInt() != 0 ? CapabilityResponse.CREATOR.createFromParcel(parcelObtain2) : null;
                    }
                    return capabilityResponseCreateFromParcel;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.android.airsharing.client.ICastSession
            public int getSessionServerPort() throws RemoteException {
                int sessionServerPort;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.d.transact(12, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        sessionServerPort = Stub.getDefaultImpl().getSessionServerPort();
                    } else {
                        parcelObtain2.readException();
                        sessionServerPort = parcelObtain2.readInt();
                    }
                    return sessionServerPort;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.android.airsharing.client.ICastSession
            public IRemotePlayController getRemotePlayController(ProjectionDevice projectionDevice) throws RemoteException {
                IRemotePlayController iRemotePlayControllerAsInterface;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (projectionDevice != null) {
                        parcelObtain.writeInt(1);
                        projectionDevice.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.d.transact(13, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        iRemotePlayControllerAsInterface = Stub.getDefaultImpl().getRemotePlayController(projectionDevice);
                    } else {
                        parcelObtain2.readException();
                        iRemotePlayControllerAsInterface = IRemotePlayController.Stub.asInterface(parcelObtain2.readStrongBinder());
                    }
                    return iRemotePlayControllerAsInterface;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.android.airsharing.client.ICastSession
            public boolean requestSwitchProjectionMode(EProjectionMode eProjectionMode) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (eProjectionMode != null) {
                        parcelObtain.writeInt(1);
                        eProjectionMode.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.d.transact(14, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().requestSwitchProjectionMode(eProjectionMode);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.android.airsharing.client.ICastSession
            public EProjectionMode getCurrentProjectionMode() throws RemoteException {
                EProjectionMode eProjectionModeCreateFromParcel;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.d.transact(15, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        eProjectionModeCreateFromParcel = Stub.getDefaultImpl().getCurrentProjectionMode();
                    } else {
                        parcelObtain2.readException();
                        eProjectionModeCreateFromParcel = parcelObtain2.readInt() != 0 ? EProjectionMode.CREATOR.createFromParcel(parcelObtain2) : null;
                    }
                    return eProjectionModeCreateFromParcel;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public static boolean setDefaultImpl(ICastSession iCastSession) {
            if (e.f5074a != null || iCastSession == null) {
                return false;
            }
            e.f5074a = iCastSession;
            return true;
        }

        public static ICastSession getDefaultImpl() {
            return e.f5074a;
        }
    }
}
