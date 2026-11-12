package com.huawei.hwservicesmgr;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.clockwork.companion.partnerapi.SmartWatchInfo;
import com.huawei.datatype.DeviceCommand;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.devicemgr.business.entity.DeviceParameter;
import com.huawei.health.devicemgr.business.entity.HwGetDevicesParameter;
import com.huawei.health.devicemgr.business.entity.Result;
import com.huawei.hwcommonmodel.datatypes.TransferFileInfo;
import com.huawei.hwdevice.phoneprocess.mgr.connectmgr.DeviceDialogMessage;
import com.huawei.hwdevice.phoneprocess.mgr.hwmenstrualmanager.bean.MenstrualSwitchStatus;
import com.huawei.hwdevicemgr.framework.INoitifyPhoneServiceCallback;
import com.huawei.syncmgr.SyncOption;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public interface IWearPhoneServiceAIDL extends IInterface {
    public static final String DESCRIPTOR = "com.huawei.hwservicesmgr.IWearPhoneServiceAIDL";

    void addDevice(DeviceParameter deviceParameter, String str, IAddDeviceStateAIDLCallback iAddDeviceStateAIDLCallback) throws RemoteException;

    String dialogMessage(DeviceDialogMessage deviceDialogMessage, IBluetoothDialogAidlCallback iBluetoothDialogAidlCallback) throws RemoteException;

    void forceConnectDevice() throws RemoteException;

    Result getCommonData(DeviceInfo deviceInfo, String str, String str2) throws RemoteException;

    List<DeviceInfo> getDeviceList(int i, HwGetDevicesParameter hwGetDevicesParameter, String str) throws RemoteException;

    void getFile(TransferFileInfo transferFileInfo, ITransferSleepAndDFXFileCallback iTransferSleepAndDFXFileCallback) throws RemoteException;

    Result getMatterTimeInfo(DeviceInfo deviceInfo, int i) throws RemoteException;

    SmartWatchInfo getPendingConnectWatchInfo() throws RemoteException;

    boolean isCoreSleepSyncing() throws RemoteException;

    boolean isCouldGetWifiConfigurationInformation() throws RemoteException;

    void isLoudspeakerMuteOpenOrCloseHeartRate(int i, int i2, IHeartRateStateAIDLCallback iHeartRateStateAIDLCallback) throws RemoteException;

    boolean isOutgoingCall() throws RemoteException;

    boolean isPrompt() throws RemoteException;

    void migrateUsedDeviceList(List<DeviceInfo> list) throws RemoteException;

    void notifyAllSyncTask() throws RemoteException;

    boolean notifyPhoneService(String str, DeviceInfo deviceInfo, int i, String str2) throws RemoteException;

    void openSystemBluetoothSwitch(boolean z) throws RemoteException;

    Map queryDeviceCapability(int i, String str, String str2) throws RemoteException;

    void registMusicMgrCallback(HwMusicMgrCallback hwMusicMgrCallback) throws RemoteException;

    void registerBinder(IBinder iBinder, String str, String str2) throws RemoteException;

    void registerCallback(String str, INoitifyPhoneServiceCallback iNoitifyPhoneServiceCallback) throws RemoteException;

    void registerCoreSleepProgressListener(IBaseCallback iBaseCallback) throws RemoteException;

    void registerDeviceStateCallBack(IDeviceStateAIDLCallback iDeviceStateAIDLCallback) throws RemoteException;

    void registerLinkageDeviceCommandListener(LinkageDeviceCommandListener linkageDeviceCommandListener) throws RemoteException;

    void registerLinkageDeviceDataListener(IBaseCallback iBaseCallback) throws RemoteException;

    void registerWorkOutCallback(IBaseCallback iBaseCallback) throws RemoteException;

    void sendDeviceData(DeviceCommand deviceCommand) throws RemoteException;

    void sendEcgBlockList(String str, IBaseCallback iBaseCallback) throws RemoteException;

    void sendMenstrualSwitch(MenstrualSwitchStatus menstrualSwitchStatus) throws RemoteException;

    void sendOTAFileData(DeviceInfo deviceInfo, String str, String str2, int i, IOTAResultAIDLCallback iOTAResultAIDLCallback) throws RemoteException;

    void sendWifiConfigurationInformation() throws RemoteException;

    void setAwFileCallback(IBaseCallback iBaseCallback) throws RemoteException;

    void setBinder(String str, IBinder iBinder, IBaseCallback iBaseCallback) throws RemoteException;

    void setSuggestionBinder(IBinder iBinder) throws RemoteException;

    void starSycnCoreSleep(SyncOption syncOption, IBaseCallback iBaseCallback) throws RemoteException;

    void startRequestFile(String str, ITransferSleepAndDFXFileCallback iTransferSleepAndDFXFileCallback) throws RemoteException;

    void startSyncWorkOut() throws RemoteException;

    void stopRequestFile(String str, IBaseCallback iBaseCallback) throws RemoteException;

    void stopTransferFile(String str, int i, IBaseCallback iBaseCallback) throws RemoteException;

    void switchDevice(List<DeviceInfo> list, String str) throws RemoteException;

    void transFileUnite(String str, String str2, IAppTransferFileResultAIDLCallback iAppTransferFileResultAIDLCallback, ParcelFileDescriptor parcelFileDescriptor) throws RemoteException;

    void unPair(List<String> list, boolean z) throws RemoteException;

    void unRegisterDeviceStateCallBack(IDeviceStateAIDLCallback iDeviceStateAIDLCallback) throws RemoteException;

    void unRegisterMusicMgrCallback() throws RemoteException;

    void unregisterCallback(String str) throws RemoteException;

    public static abstract class Stub extends Binder implements IWearPhoneServiceAIDL {
        static final int TRANSACTION_addDevice = 6;
        static final int TRANSACTION_dialogMessage = 27;
        static final int TRANSACTION_forceConnectDevice = 10;
        static final int TRANSACTION_getCommonData = 45;
        static final int TRANSACTION_getDeviceList = 35;
        static final int TRANSACTION_getFile = 11;
        static final int TRANSACTION_getMatterTimeInfo = 44;
        static final int TRANSACTION_getPendingConnectWatchInfo = 25;
        static final int TRANSACTION_isCoreSleepSyncing = 40;
        static final int TRANSACTION_isCouldGetWifiConfigurationInformation = 34;
        static final int TRANSACTION_isLoudspeakerMuteOpenOrCloseHeartRate = 13;
        static final int TRANSACTION_isOutgoingCall = 18;
        static final int TRANSACTION_isPrompt = 17;
        static final int TRANSACTION_migrateUsedDeviceList = 8;
        static final int TRANSACTION_notifyAllSyncTask = 30;
        static final int TRANSACTION_notifyPhoneService = 36;
        static final int TRANSACTION_openSystemBluetoothSwitch = 12;
        static final int TRANSACTION_queryDeviceCapability = 2;
        static final int TRANSACTION_registMusicMgrCallback = 23;
        static final int TRANSACTION_registerBinder = 1;
        static final int TRANSACTION_registerCallback = 37;
        static final int TRANSACTION_registerCoreSleepProgressListener = 41;
        static final int TRANSACTION_registerDeviceStateCallBack = 3;
        static final int TRANSACTION_registerLinkageDeviceCommandListener = 42;
        static final int TRANSACTION_registerLinkageDeviceDataListener = 43;
        static final int TRANSACTION_registerWorkOutCallback = 15;
        static final int TRANSACTION_sendDeviceData = 5;
        static final int TRANSACTION_sendEcgBlockList = 31;
        static final int TRANSACTION_sendMenstrualSwitch = 29;
        static final int TRANSACTION_sendOTAFileData = 9;
        static final int TRANSACTION_sendWifiConfigurationInformation = 33;
        static final int TRANSACTION_setAwFileCallback = 26;
        static final int TRANSACTION_setBinder = 28;
        static final int TRANSACTION_setSuggestionBinder = 32;
        static final int TRANSACTION_starSycnCoreSleep = 39;
        static final int TRANSACTION_startRequestFile = 21;
        static final int TRANSACTION_startSyncWorkOut = 14;
        static final int TRANSACTION_stopRequestFile = 22;
        static final int TRANSACTION_stopTransferFile = 20;
        static final int TRANSACTION_switchDevice = 7;
        static final int TRANSACTION_transFileUnite = 19;
        static final int TRANSACTION_unPair = 16;
        static final int TRANSACTION_unRegisterDeviceStateCallBack = 4;
        static final int TRANSACTION_unRegisterMusicMgrCallback = 24;
        static final int TRANSACTION_unregisterCallback = 38;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, IWearPhoneServiceAIDL.DESCRIPTOR);
        }

        public static IWearPhoneServiceAIDL asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IWearPhoneServiceAIDL.DESCRIPTOR);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof IWearPhoneServiceAIDL)) {
                return (IWearPhoneServiceAIDL) iInterfaceQueryLocalInterface;
            }
            return new c(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IWearPhoneServiceAIDL.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IWearPhoneServiceAIDL.DESCRIPTOR);
                return true;
            }
            switch (i) {
                case 1:
                    registerBinder(parcel.readStrongBinder(), parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 2:
                    Map mapQueryDeviceCapability = queryDeviceCapability(parcel.readInt(), parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeMap(mapQueryDeviceCapability);
                    return true;
                case 3:
                    registerDeviceStateCallBack(IDeviceStateAIDLCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 4:
                    unRegisterDeviceStateCallBack(IDeviceStateAIDLCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 5:
                    sendDeviceData((DeviceCommand) b.b(parcel, DeviceCommand.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 6:
                    addDevice((DeviceParameter) b.b(parcel, DeviceParameter.CREATOR), parcel.readString(), IAddDeviceStateAIDLCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 7:
                    switchDevice(parcel.createTypedArrayList(DeviceInfo.CREATOR), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 8:
                    migrateUsedDeviceList(parcel.createTypedArrayList(DeviceInfo.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 9:
                    sendOTAFileData((DeviceInfo) b.b(parcel, DeviceInfo.CREATOR), parcel.readString(), parcel.readString(), parcel.readInt(), IOTAResultAIDLCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 10:
                    forceConnectDevice();
                    parcel2.writeNoException();
                    return true;
                case 11:
                    getFile((TransferFileInfo) b.b(parcel, TransferFileInfo.CREATOR), ITransferSleepAndDFXFileCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 12:
                    openSystemBluetoothSwitch(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 13:
                    isLoudspeakerMuteOpenOrCloseHeartRate(parcel.readInt(), parcel.readInt(), IHeartRateStateAIDLCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 14:
                    startSyncWorkOut();
                    parcel2.writeNoException();
                    return true;
                case 15:
                    registerWorkOutCallback(IBaseCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 16:
                    unPair(parcel.createStringArrayList(), parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 17:
                    boolean zIsPrompt = isPrompt();
                    parcel2.writeNoException();
                    parcel2.writeInt(zIsPrompt ? 1 : 0);
                    return true;
                case 18:
                    boolean zIsOutgoingCall = isOutgoingCall();
                    parcel2.writeNoException();
                    parcel2.writeInt(zIsOutgoingCall ? 1 : 0);
                    return true;
                case 19:
                    transFileUnite(parcel.readString(), parcel.readString(), IAppTransferFileResultAIDLCallback.Stub.asInterface(parcel.readStrongBinder()), (ParcelFileDescriptor) b.b(parcel, ParcelFileDescriptor.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 20:
                    stopTransferFile(parcel.readString(), parcel.readInt(), IBaseCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 21:
                    startRequestFile(parcel.readString(), ITransferSleepAndDFXFileCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 22:
                    stopRequestFile(parcel.readString(), IBaseCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 23:
                    registMusicMgrCallback(HwMusicMgrCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 24:
                    unRegisterMusicMgrCallback();
                    parcel2.writeNoException();
                    return true;
                case 25:
                    SmartWatchInfo pendingConnectWatchInfo = getPendingConnectWatchInfo();
                    parcel2.writeNoException();
                    b.b(parcel2, pendingConnectWatchInfo, 1);
                    return true;
                case 26:
                    setAwFileCallback(IBaseCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 27:
                    String strDialogMessage = dialogMessage((DeviceDialogMessage) b.b(parcel, DeviceDialogMessage.CREATOR), IBluetoothDialogAidlCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeString(strDialogMessage);
                    return true;
                case 28:
                    setBinder(parcel.readString(), parcel.readStrongBinder(), IBaseCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 29:
                    sendMenstrualSwitch((MenstrualSwitchStatus) b.b(parcel, MenstrualSwitchStatus.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 30:
                    notifyAllSyncTask();
                    parcel2.writeNoException();
                    return true;
                case 31:
                    sendEcgBlockList(parcel.readString(), IBaseCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 32:
                    setSuggestionBinder(parcel.readStrongBinder());
                    parcel2.writeNoException();
                    return true;
                case 33:
                    sendWifiConfigurationInformation();
                    parcel2.writeNoException();
                    return true;
                case 34:
                    boolean zIsCouldGetWifiConfigurationInformation = isCouldGetWifiConfigurationInformation();
                    parcel2.writeNoException();
                    parcel2.writeInt(zIsCouldGetWifiConfigurationInformation ? 1 : 0);
                    return true;
                case 35:
                    List<DeviceInfo> deviceList = getDeviceList(parcel.readInt(), (HwGetDevicesParameter) b.b(parcel, HwGetDevicesParameter.CREATOR), parcel.readString());
                    parcel2.writeNoException();
                    b.c(parcel2, deviceList, 1);
                    return true;
                case 36:
                    boolean zNotifyPhoneService = notifyPhoneService(parcel.readString(), (DeviceInfo) b.b(parcel, DeviceInfo.CREATOR), parcel.readInt(), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(zNotifyPhoneService ? 1 : 0);
                    return true;
                case 37:
                    registerCallback(parcel.readString(), INoitifyPhoneServiceCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 38:
                    unregisterCallback(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 39:
                    starSycnCoreSleep((SyncOption) b.b(parcel, SyncOption.CREATOR), IBaseCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 40:
                    boolean zIsCoreSleepSyncing = isCoreSleepSyncing();
                    parcel2.writeNoException();
                    parcel2.writeInt(zIsCoreSleepSyncing ? 1 : 0);
                    return true;
                case 41:
                    registerCoreSleepProgressListener(IBaseCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 42:
                    registerLinkageDeviceCommandListener(LinkageDeviceCommandListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 43:
                    registerLinkageDeviceDataListener(IBaseCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 44:
                    Result matterTimeInfo = getMatterTimeInfo((DeviceInfo) b.b(parcel, DeviceInfo.CREATOR), parcel.readInt());
                    parcel2.writeNoException();
                    b.b(parcel2, matterTimeInfo, 1);
                    return true;
                case 45:
                    Result commonData = getCommonData((DeviceInfo) b.b(parcel, DeviceInfo.CREATOR), parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    b.b(parcel2, commonData, 1);
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }

        /* JADX INFO: loaded from: classes11.dex */
        static class c implements IWearPhoneServiceAIDL {
            private IBinder d;

            c(IBinder iBinder) {
                this.d = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.d;
            }

            @Override // com.huawei.hwservicesmgr.IWearPhoneServiceAIDL
            public void registerBinder(IBinder iBinder, String str, String str2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IWearPhoneServiceAIDL.DESCRIPTOR);
                    parcelObtain.writeStrongBinder(iBinder);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    this.d.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hwservicesmgr.IWearPhoneServiceAIDL
            public Map queryDeviceCapability(int i, String str, String str2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IWearPhoneServiceAIDL.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    this.d.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readHashMap(getClass().getClassLoader());
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hwservicesmgr.IWearPhoneServiceAIDL
            public void registerDeviceStateCallBack(IDeviceStateAIDLCallback iDeviceStateAIDLCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IWearPhoneServiceAIDL.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iDeviceStateAIDLCallback);
                    this.d.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hwservicesmgr.IWearPhoneServiceAIDL
            public void unRegisterDeviceStateCallBack(IDeviceStateAIDLCallback iDeviceStateAIDLCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IWearPhoneServiceAIDL.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iDeviceStateAIDLCallback);
                    this.d.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hwservicesmgr.IWearPhoneServiceAIDL
            public void sendDeviceData(DeviceCommand deviceCommand) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IWearPhoneServiceAIDL.DESCRIPTOR);
                    b.b(parcelObtain, deviceCommand, 0);
                    this.d.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hwservicesmgr.IWearPhoneServiceAIDL
            public void addDevice(DeviceParameter deviceParameter, String str, IAddDeviceStateAIDLCallback iAddDeviceStateAIDLCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IWearPhoneServiceAIDL.DESCRIPTOR);
                    b.b(parcelObtain, deviceParameter, 0);
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongInterface(iAddDeviceStateAIDLCallback);
                    this.d.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hwservicesmgr.IWearPhoneServiceAIDL
            public void switchDevice(List<DeviceInfo> list, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IWearPhoneServiceAIDL.DESCRIPTOR);
                    b.c(parcelObtain, list, 0);
                    parcelObtain.writeString(str);
                    this.d.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hwservicesmgr.IWearPhoneServiceAIDL
            public void migrateUsedDeviceList(List<DeviceInfo> list) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IWearPhoneServiceAIDL.DESCRIPTOR);
                    b.c(parcelObtain, list, 0);
                    this.d.transact(8, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hwservicesmgr.IWearPhoneServiceAIDL
            public void sendOTAFileData(DeviceInfo deviceInfo, String str, String str2, int i, IOTAResultAIDLCallback iOTAResultAIDLCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IWearPhoneServiceAIDL.DESCRIPTOR);
                    b.b(parcelObtain, deviceInfo, 0);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeStrongInterface(iOTAResultAIDLCallback);
                    this.d.transact(9, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hwservicesmgr.IWearPhoneServiceAIDL
            public void forceConnectDevice() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IWearPhoneServiceAIDL.DESCRIPTOR);
                    this.d.transact(10, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hwservicesmgr.IWearPhoneServiceAIDL
            public void getFile(TransferFileInfo transferFileInfo, ITransferSleepAndDFXFileCallback iTransferSleepAndDFXFileCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IWearPhoneServiceAIDL.DESCRIPTOR);
                    b.b(parcelObtain, transferFileInfo, 0);
                    parcelObtain.writeStrongInterface(iTransferSleepAndDFXFileCallback);
                    this.d.transact(11, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hwservicesmgr.IWearPhoneServiceAIDL
            public void openSystemBluetoothSwitch(boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IWearPhoneServiceAIDL.DESCRIPTOR);
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.d.transact(12, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hwservicesmgr.IWearPhoneServiceAIDL
            public void isLoudspeakerMuteOpenOrCloseHeartRate(int i, int i2, IHeartRateStateAIDLCallback iHeartRateStateAIDLCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IWearPhoneServiceAIDL.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeStrongInterface(iHeartRateStateAIDLCallback);
                    this.d.transact(13, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hwservicesmgr.IWearPhoneServiceAIDL
            public void startSyncWorkOut() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IWearPhoneServiceAIDL.DESCRIPTOR);
                    this.d.transact(14, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hwservicesmgr.IWearPhoneServiceAIDL
            public void registerWorkOutCallback(IBaseCallback iBaseCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IWearPhoneServiceAIDL.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iBaseCallback);
                    this.d.transact(15, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hwservicesmgr.IWearPhoneServiceAIDL
            public void unPair(List<String> list, boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IWearPhoneServiceAIDL.DESCRIPTOR);
                    parcelObtain.writeStringList(list);
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.d.transact(16, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hwservicesmgr.IWearPhoneServiceAIDL
            public boolean isPrompt() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IWearPhoneServiceAIDL.DESCRIPTOR);
                    this.d.transact(17, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hwservicesmgr.IWearPhoneServiceAIDL
            public boolean isOutgoingCall() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IWearPhoneServiceAIDL.DESCRIPTOR);
                    this.d.transact(18, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hwservicesmgr.IWearPhoneServiceAIDL
            public void transFileUnite(String str, String str2, IAppTransferFileResultAIDLCallback iAppTransferFileResultAIDLCallback, ParcelFileDescriptor parcelFileDescriptor) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IWearPhoneServiceAIDL.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeStrongInterface(iAppTransferFileResultAIDLCallback);
                    b.b(parcelObtain, parcelFileDescriptor, 0);
                    this.d.transact(19, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hwservicesmgr.IWearPhoneServiceAIDL
            public void stopTransferFile(String str, int i, IBaseCallback iBaseCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IWearPhoneServiceAIDL.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeStrongInterface(iBaseCallback);
                    this.d.transact(20, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hwservicesmgr.IWearPhoneServiceAIDL
            public void startRequestFile(String str, ITransferSleepAndDFXFileCallback iTransferSleepAndDFXFileCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IWearPhoneServiceAIDL.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongInterface(iTransferSleepAndDFXFileCallback);
                    this.d.transact(21, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hwservicesmgr.IWearPhoneServiceAIDL
            public void stopRequestFile(String str, IBaseCallback iBaseCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IWearPhoneServiceAIDL.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongInterface(iBaseCallback);
                    this.d.transact(22, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hwservicesmgr.IWearPhoneServiceAIDL
            public void registMusicMgrCallback(HwMusicMgrCallback hwMusicMgrCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IWearPhoneServiceAIDL.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(hwMusicMgrCallback);
                    this.d.transact(23, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hwservicesmgr.IWearPhoneServiceAIDL
            public void unRegisterMusicMgrCallback() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IWearPhoneServiceAIDL.DESCRIPTOR);
                    this.d.transact(24, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hwservicesmgr.IWearPhoneServiceAIDL
            public SmartWatchInfo getPendingConnectWatchInfo() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IWearPhoneServiceAIDL.DESCRIPTOR);
                    this.d.transact(25, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (SmartWatchInfo) b.b(parcelObtain2, SmartWatchInfo.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hwservicesmgr.IWearPhoneServiceAIDL
            public void setAwFileCallback(IBaseCallback iBaseCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IWearPhoneServiceAIDL.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iBaseCallback);
                    this.d.transact(26, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hwservicesmgr.IWearPhoneServiceAIDL
            public String dialogMessage(DeviceDialogMessage deviceDialogMessage, IBluetoothDialogAidlCallback iBluetoothDialogAidlCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IWearPhoneServiceAIDL.DESCRIPTOR);
                    b.b(parcelObtain, deviceDialogMessage, 0);
                    parcelObtain.writeStrongInterface(iBluetoothDialogAidlCallback);
                    this.d.transact(27, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hwservicesmgr.IWearPhoneServiceAIDL
            public void setBinder(String str, IBinder iBinder, IBaseCallback iBaseCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IWearPhoneServiceAIDL.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongBinder(iBinder);
                    parcelObtain.writeStrongInterface(iBaseCallback);
                    this.d.transact(28, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hwservicesmgr.IWearPhoneServiceAIDL
            public void sendMenstrualSwitch(MenstrualSwitchStatus menstrualSwitchStatus) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IWearPhoneServiceAIDL.DESCRIPTOR);
                    b.b(parcelObtain, menstrualSwitchStatus, 0);
                    this.d.transact(29, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hwservicesmgr.IWearPhoneServiceAIDL
            public void notifyAllSyncTask() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IWearPhoneServiceAIDL.DESCRIPTOR);
                    this.d.transact(30, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hwservicesmgr.IWearPhoneServiceAIDL
            public void sendEcgBlockList(String str, IBaseCallback iBaseCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IWearPhoneServiceAIDL.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongInterface(iBaseCallback);
                    this.d.transact(31, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hwservicesmgr.IWearPhoneServiceAIDL
            public void setSuggestionBinder(IBinder iBinder) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IWearPhoneServiceAIDL.DESCRIPTOR);
                    parcelObtain.writeStrongBinder(iBinder);
                    this.d.transact(32, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hwservicesmgr.IWearPhoneServiceAIDL
            public void sendWifiConfigurationInformation() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IWearPhoneServiceAIDL.DESCRIPTOR);
                    this.d.transact(33, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hwservicesmgr.IWearPhoneServiceAIDL
            public boolean isCouldGetWifiConfigurationInformation() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IWearPhoneServiceAIDL.DESCRIPTOR);
                    this.d.transact(34, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hwservicesmgr.IWearPhoneServiceAIDL
            public List<DeviceInfo> getDeviceList(int i, HwGetDevicesParameter hwGetDevicesParameter, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IWearPhoneServiceAIDL.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    b.b(parcelObtain, hwGetDevicesParameter, 0);
                    parcelObtain.writeString(str);
                    this.d.transact(35, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.createTypedArrayList(DeviceInfo.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hwservicesmgr.IWearPhoneServiceAIDL
            public boolean notifyPhoneService(String str, DeviceInfo deviceInfo, int i, String str2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IWearPhoneServiceAIDL.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    b.b(parcelObtain, deviceInfo, 0);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str2);
                    this.d.transact(36, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hwservicesmgr.IWearPhoneServiceAIDL
            public void registerCallback(String str, INoitifyPhoneServiceCallback iNoitifyPhoneServiceCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IWearPhoneServiceAIDL.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongInterface(iNoitifyPhoneServiceCallback);
                    this.d.transact(37, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hwservicesmgr.IWearPhoneServiceAIDL
            public void unregisterCallback(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IWearPhoneServiceAIDL.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.d.transact(38, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hwservicesmgr.IWearPhoneServiceAIDL
            public void starSycnCoreSleep(SyncOption syncOption, IBaseCallback iBaseCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IWearPhoneServiceAIDL.DESCRIPTOR);
                    b.b(parcelObtain, syncOption, 0);
                    parcelObtain.writeStrongInterface(iBaseCallback);
                    this.d.transact(39, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hwservicesmgr.IWearPhoneServiceAIDL
            public boolean isCoreSleepSyncing() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IWearPhoneServiceAIDL.DESCRIPTOR);
                    this.d.transact(40, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hwservicesmgr.IWearPhoneServiceAIDL
            public void registerCoreSleepProgressListener(IBaseCallback iBaseCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IWearPhoneServiceAIDL.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iBaseCallback);
                    this.d.transact(41, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hwservicesmgr.IWearPhoneServiceAIDL
            public void registerLinkageDeviceCommandListener(LinkageDeviceCommandListener linkageDeviceCommandListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IWearPhoneServiceAIDL.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(linkageDeviceCommandListener);
                    this.d.transact(42, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hwservicesmgr.IWearPhoneServiceAIDL
            public void registerLinkageDeviceDataListener(IBaseCallback iBaseCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IWearPhoneServiceAIDL.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iBaseCallback);
                    this.d.transact(43, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hwservicesmgr.IWearPhoneServiceAIDL
            public Result getMatterTimeInfo(DeviceInfo deviceInfo, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IWearPhoneServiceAIDL.DESCRIPTOR);
                    b.b(parcelObtain, deviceInfo, 0);
                    parcelObtain.writeInt(i);
                    this.d.transact(44, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (Result) b.b(parcelObtain2, Result.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hwservicesmgr.IWearPhoneServiceAIDL
            public Result getCommonData(DeviceInfo deviceInfo, String str, String str2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IWearPhoneServiceAIDL.DESCRIPTOR);
                    b.b(parcelObtain, deviceInfo, 0);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    this.d.transact(45, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (Result) b.b(parcelObtain2, Result.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }
    }

    /* JADX INFO: loaded from: classes11.dex */
    public static class b {
        /* JADX INFO: Access modifiers changed from: private */
        public static <T> T b(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static <T extends Parcelable> void b(Parcel parcel, T t, int i) {
            if (t != null) {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
            } else {
                parcel.writeInt(0);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static <T extends Parcelable> void c(Parcel parcel, List<T> list, int i) {
            if (list == null) {
                parcel.writeInt(-1);
                return;
            }
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                b(parcel, list.get(i2), i);
            }
        }
    }
}
