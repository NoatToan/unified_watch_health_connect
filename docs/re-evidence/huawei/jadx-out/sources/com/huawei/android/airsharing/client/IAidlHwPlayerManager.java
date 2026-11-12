package com.huawei.android.airsharing.client;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.huawei.android.airsharing.api.AuthenticationInfo;
import com.huawei.android.airsharing.api.CapabilityResponse;
import com.huawei.android.airsharing.api.ColorSet;
import com.huawei.android.airsharing.api.ConfigInfo;
import com.huawei.android.airsharing.api.ConnectInfo;
import com.huawei.android.airsharing.api.ConnectionInfo;
import com.huawei.android.airsharing.api.DialogInfo;
import com.huawei.android.airsharing.api.EHwTransportState;
import com.huawei.android.airsharing.api.EProjectionMode;
import com.huawei.android.airsharing.api.ERepeatMode;
import com.huawei.android.airsharing.api.ERequestedCapability;
import com.huawei.android.airsharing.api.GrabState;
import com.huawei.android.airsharing.api.HwMediaInfo;
import com.huawei.android.airsharing.api.HwMediaPosition;
import com.huawei.android.airsharing.api.HwObject;
import com.huawei.android.airsharing.api.HwServer;
import com.huawei.android.airsharing.api.IAidlMediaPlayerListener;
import com.huawei.android.airsharing.api.IRemoteCtrlEventProcessor;
import com.huawei.android.airsharing.api.PlayInfo;
import com.huawei.android.airsharing.api.ProjectionDevice;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public interface IAidlHwPlayerManager extends IInterface {
    boolean appendHiSightExInfo(int i, byte[] bArr, int i2, long j) throws RemoteException;

    boolean castConnectDevice(ConnectInfo connectInfo) throws RemoteException;

    boolean castDisconnectDevice(ProjectionDevice projectionDevice) throws RemoteException;

    boolean castPlay(PlayInfo playInfo) throws RemoteException;

    boolean chooseDialogResult(DialogInfo dialogInfo) throws RemoteException;

    void clsHwSharingListener(int i, IAidlHwListener iAidlHwListener) throws RemoteException;

    void colorAdaption(ColorSet colorSet) throws RemoteException;

    boolean configGrabState(int i, long j) throws RemoteException;

    boolean connectDevice(int i, ProjectionDevice projectionDevice) throws RemoteException;

    int connectToServer(HwServer hwServer) throws RemoteException;

    String convertFilePathToDmsUrl(String str) throws RemoteException;

    ICastSession createCastSession(int i) throws RemoteException;

    void disconnect() throws RemoteException;

    boolean disconnectDevice(int i) throws RemoteException;

    ConnectionInfo getConnectionInfo(int i) throws RemoteException;

    ICastSession getCurrentCastSession(ProjectionDevice projectionDevice) throws RemoteException;

    GrabState getCurrentGrabState() throws RemoteException;

    int getHiSightServerPort() throws RemoteException;

    HwMediaInfo getMediaInfo(int i) throws RemoteException;

    int getMsdpServerPort() throws RemoteException;

    HwMediaPosition getPosition(int i) throws RemoteException;

    HwServer getRenderingServer() throws RemoteException;

    int getSdkVersion() throws RemoteException;

    int getSeekTarget(int i) throws RemoteException;

    List<HwServer> getServerList() throws RemoteException;

    String getTargetDevIndication(int i) throws RemoteException;

    String getTargetDevName(int i) throws RemoteException;

    ProjectionDevice getTargetProjectionDevice(int i) throws RemoteException;

    int getVersion() throws RemoteException;

    int getVolume(int i) throws RemoteException;

    boolean hasPlayer(int i) throws RemoteException;

    boolean inputJsonDataForCast(String str) throws RemoteException;

    boolean isCastConnected(ProjectionDevice projectionDevice, EProjectionMode eProjectionMode) throws RemoteException;

    boolean isConnected(int i) throws RemoteException;

    boolean isDisplayConnected(int i) throws RemoteException;

    boolean isDisplayConnecting(int i) throws RemoteException;

    boolean isRendering(int i) throws RemoteException;

    boolean next() throws RemoteException;

    void notifyPositionChanged(int i, HwMediaPosition hwMediaPosition) throws RemoteException;

    void notifyTransportStateChanged(int i, EHwTransportState eHwTransportState) throws RemoteException;

    void notifyVolumeChanged(int i, int i2) throws RemoteException;

    boolean pause(int i) throws RemoteException;

    boolean pauseWifiDisplay(int i) throws RemoteException;

    boolean play(int i, HwMediaInfo hwMediaInfo, ProjectionDevice projectionDevice) throws RemoteException;

    boolean playMedia(int i, HwMediaInfo hwMediaInfo, boolean z, HwObject hwObject) throws RemoteException;

    boolean playMediaItem(int i) throws RemoteException;

    boolean previous() throws RemoteException;

    boolean registerMediaPlayerListener(IAidlMediaPlayerListener iAidlMediaPlayerListener) throws RemoteException;

    CapabilityResponse requestCapability(ERequestedCapability eRequestedCapability) throws RemoteException;

    boolean resume(int i) throws RemoteException;

    boolean resumeWifiDisplay(int i) throws RemoteException;

    boolean seek(int i, String str) throws RemoteException;

    boolean seekTo(int i) throws RemoteException;

    int sendRemoteCtrlData(int i, int i2, byte[] bArr) throws RemoteException;

    boolean setAuthenticationInfo(AuthenticationInfo authenticationInfo) throws RemoteException;

    String setConfigInfo(ConfigInfo configInfo) throws RemoteException;

    boolean setExtendInfo(String str, String str2) throws RemoteException;

    void setHwSharingListener(int i, IAidlHwListener iAidlHwListener) throws RemoteException;

    void setRemoteCtrlEventProcessor(IRemoteCtrlEventProcessor iRemoteCtrlEventProcessor) throws RemoteException;

    boolean setRepeatMode(ERepeatMode eRepeatMode) throws RemoteException;

    boolean setUsingCapability(int i, int i2) throws RemoteException;

    boolean setVolume(int i, int i2) throws RemoteException;

    boolean setVolumeMute(boolean z) throws RemoteException;

    boolean showProjectionActivity(ConfigInfo configInfo) throws RemoteException;

    boolean startScan(int i) throws RemoteException;

    boolean startScanDevice(int i, boolean z) throws RemoteException;

    boolean startServer(int i, String str, String str2) throws RemoteException;

    boolean stop(int i) throws RemoteException;

    boolean stopScan(int i) throws RemoteException;

    boolean stopScanDevice(int i, boolean z) throws RemoteException;

    boolean stopServer(int i) throws RemoteException;

    void subscribServers(int i, String str) throws RemoteException;

    boolean unregisterMediaPlayerListener() throws RemoteException;

    void unsubscribServers(int i, String str) throws RemoteException;

    boolean updateApplication(String str) throws RemoteException;

    boolean updatePlayInfo(PlayInfo playInfo) throws RemoteException;

    public static abstract class Stub extends Binder implements IAidlHwPlayerManager {
        private static final String DESCRIPTOR = "com.huawei.android.airsharing.client.IAidlHwPlayerManager";
        static final int TRANSACTION_appendHiSightExInfo = 40;
        static final int TRANSACTION_castConnectDevice = 51;
        static final int TRANSACTION_castDisconnectDevice = 64;
        static final int TRANSACTION_castPlay = 52;
        static final int TRANSACTION_chooseDialogResult = 70;
        static final int TRANSACTION_clsHwSharingListener = 9;
        static final int TRANSACTION_colorAdaption = 49;
        static final int TRANSACTION_configGrabState = 73;
        static final int TRANSACTION_connectDevice = 28;
        static final int TRANSACTION_connectToServer = 6;
        static final int TRANSACTION_convertFilePathToDmsUrl = 45;
        static final int TRANSACTION_createCastSession = 75;
        static final int TRANSACTION_disconnect = 7;
        static final int TRANSACTION_disconnectDevice = 29;
        static final int TRANSACTION_getConnectionInfo = 47;
        static final int TRANSACTION_getCurrentCastSession = 76;
        static final int TRANSACTION_getCurrentGrabState = 72;
        static final int TRANSACTION_getHiSightServerPort = 39;
        static final int TRANSACTION_getMediaInfo = 18;
        static final int TRANSACTION_getMsdpServerPort = 44;
        static final int TRANSACTION_getPosition = 11;
        static final int TRANSACTION_getRenderingServer = 25;
        static final int TRANSACTION_getSdkVersion = 37;
        static final int TRANSACTION_getSeekTarget = 19;
        static final int TRANSACTION_getServerList = 3;
        static final int TRANSACTION_getTargetDevIndication = 31;
        static final int TRANSACTION_getTargetDevName = 30;
        static final int TRANSACTION_getTargetProjectionDevice = 38;
        static final int TRANSACTION_getVersion = 74;
        static final int TRANSACTION_getVolume = 20;
        static final int TRANSACTION_hasPlayer = 17;
        static final int TRANSACTION_inputJsonDataForCast = 50;
        static final int TRANSACTION_isCastConnected = 65;
        static final int TRANSACTION_isConnected = 32;
        static final int TRANSACTION_isDisplayConnected = 43;
        static final int TRANSACTION_isDisplayConnecting = 33;
        static final int TRANSACTION_isRendering = 16;
        static final int TRANSACTION_next = 57;
        static final int TRANSACTION_notifyPositionChanged = 23;
        static final int TRANSACTION_notifyTransportStateChanged = 24;
        static final int TRANSACTION_notifyVolumeChanged = 22;
        static final int TRANSACTION_pause = 13;
        static final int TRANSACTION_pauseWifiDisplay = 35;
        static final int TRANSACTION_play = 34;
        static final int TRANSACTION_playMedia = 10;
        static final int TRANSACTION_playMediaItem = 59;
        static final int TRANSACTION_previous = 56;
        static final int TRANSACTION_registerMediaPlayerListener = 53;
        static final int TRANSACTION_requestCapability = 69;
        static final int TRANSACTION_resume = 14;
        static final int TRANSACTION_resumeWifiDisplay = 36;
        static final int TRANSACTION_seek = 12;
        static final int TRANSACTION_seekTo = 62;
        static final int TRANSACTION_sendRemoteCtrlData = 42;
        static final int TRANSACTION_setAuthenticationInfo = 46;
        static final int TRANSACTION_setConfigInfo = 68;
        static final int TRANSACTION_setExtendInfo = 67;
        static final int TRANSACTION_setHwSharingListener = 8;
        static final int TRANSACTION_setRemoteCtrlEventProcessor = 41;
        static final int TRANSACTION_setRepeatMode = 58;
        static final int TRANSACTION_setUsingCapability = 48;
        static final int TRANSACTION_setVolume = 21;
        static final int TRANSACTION_setVolumeMute = 63;
        static final int TRANSACTION_showProjectionActivity = 61;
        static final int TRANSACTION_startScan = 60;
        static final int TRANSACTION_startScanDevice = 26;
        static final int TRANSACTION_startServer = 1;
        static final int TRANSACTION_stop = 15;
        static final int TRANSACTION_stopScan = 66;
        static final int TRANSACTION_stopScanDevice = 27;
        static final int TRANSACTION_stopServer = 2;
        static final int TRANSACTION_subscribServers = 4;
        static final int TRANSACTION_unregisterMediaPlayerListener = 54;
        static final int TRANSACTION_unsubscribServers = 5;
        static final int TRANSACTION_updateApplication = 71;
        static final int TRANSACTION_updatePlayInfo = 55;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IAidlHwPlayerManager asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof IAidlHwPlayerManager)) {
                return (IAidlHwPlayerManager) iInterfaceQueryLocalInterface;
            }
            return new a(iBinder);
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
                    boolean zStartServer = startServer(parcel.readInt(), parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(zStartServer ? 1 : 0);
                    return true;
                case 2:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean zStopServer = stopServer(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(zStopServer ? 1 : 0);
                    return true;
                case 3:
                    parcel.enforceInterface(DESCRIPTOR);
                    List<HwServer> serverList = getServerList();
                    parcel2.writeNoException();
                    parcel2.writeTypedList(serverList);
                    return true;
                case 4:
                    parcel.enforceInterface(DESCRIPTOR);
                    subscribServers(parcel.readInt(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface(DESCRIPTOR);
                    unsubscribServers(parcel.readInt(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 6:
                    parcel.enforceInterface(DESCRIPTOR);
                    int iConnectToServer = connectToServer(parcel.readInt() != 0 ? HwServer.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeInt(iConnectToServer);
                    return true;
                case 7:
                    parcel.enforceInterface(DESCRIPTOR);
                    disconnect();
                    parcel2.writeNoException();
                    return true;
                case 8:
                    parcel.enforceInterface(DESCRIPTOR);
                    setHwSharingListener(parcel.readInt(), IAidlHwListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 9:
                    parcel.enforceInterface(DESCRIPTOR);
                    clsHwSharingListener(parcel.readInt(), IAidlHwListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 10:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean zPlayMedia = playMedia(parcel.readInt(), parcel.readInt() != 0 ? HwMediaInfo.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0, parcel.readInt() != 0 ? HwObject.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeInt(zPlayMedia ? 1 : 0);
                    return true;
                case 11:
                    parcel.enforceInterface(DESCRIPTOR);
                    HwMediaPosition position = getPosition(parcel.readInt());
                    parcel2.writeNoException();
                    if (position != null) {
                        parcel2.writeInt(1);
                        position.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 12:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean zSeek = seek(parcel.readInt(), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(zSeek ? 1 : 0);
                    return true;
                case 13:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean zPause = pause(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(zPause ? 1 : 0);
                    return true;
                case 14:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean zResume = resume(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(zResume ? 1 : 0);
                    return true;
                case 15:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean zStop = stop(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(zStop ? 1 : 0);
                    return true;
                case 16:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean zIsRendering = isRendering(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(zIsRendering ? 1 : 0);
                    return true;
                case 17:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean zHasPlayer = hasPlayer(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(zHasPlayer ? 1 : 0);
                    return true;
                case 18:
                    parcel.enforceInterface(DESCRIPTOR);
                    HwMediaInfo mediaInfo = getMediaInfo(parcel.readInt());
                    parcel2.writeNoException();
                    if (mediaInfo != null) {
                        parcel2.writeInt(1);
                        mediaInfo.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 19:
                    parcel.enforceInterface(DESCRIPTOR);
                    int seekTarget = getSeekTarget(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(seekTarget);
                    return true;
                case 20:
                    parcel.enforceInterface(DESCRIPTOR);
                    int volume = getVolume(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(volume);
                    return true;
                case 21:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean volume2 = setVolume(parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(volume2 ? 1 : 0);
                    return true;
                case 22:
                    parcel.enforceInterface(DESCRIPTOR);
                    notifyVolumeChanged(parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 23:
                    parcel.enforceInterface(DESCRIPTOR);
                    notifyPositionChanged(parcel.readInt(), parcel.readInt() != 0 ? HwMediaPosition.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 24:
                    parcel.enforceInterface(DESCRIPTOR);
                    notifyTransportStateChanged(parcel.readInt(), parcel.readInt() != 0 ? EHwTransportState.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 25:
                    parcel.enforceInterface(DESCRIPTOR);
                    HwServer renderingServer = getRenderingServer();
                    parcel2.writeNoException();
                    if (renderingServer != null) {
                        parcel2.writeInt(1);
                        renderingServer.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 26:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean zStartScanDevice = startScanDevice(parcel.readInt(), parcel.readInt() != 0);
                    parcel2.writeNoException();
                    parcel2.writeInt(zStartScanDevice ? 1 : 0);
                    return true;
                case 27:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean zStopScanDevice = stopScanDevice(parcel.readInt(), parcel.readInt() != 0);
                    parcel2.writeNoException();
                    parcel2.writeInt(zStopScanDevice ? 1 : 0);
                    return true;
                case 28:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean zConnectDevice = connectDevice(parcel.readInt(), parcel.readInt() != 0 ? ProjectionDevice.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeInt(zConnectDevice ? 1 : 0);
                    return true;
                case 29:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean zDisconnectDevice = disconnectDevice(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(zDisconnectDevice ? 1 : 0);
                    return true;
                case 30:
                    parcel.enforceInterface(DESCRIPTOR);
                    String targetDevName = getTargetDevName(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeString(targetDevName);
                    return true;
                case 31:
                    parcel.enforceInterface(DESCRIPTOR);
                    String targetDevIndication = getTargetDevIndication(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeString(targetDevIndication);
                    return true;
                case 32:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean zIsConnected = isConnected(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(zIsConnected ? 1 : 0);
                    return true;
                case 33:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean zIsDisplayConnecting = isDisplayConnecting(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(zIsDisplayConnecting ? 1 : 0);
                    return true;
                case 34:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean zPlay = play(parcel.readInt(), parcel.readInt() != 0 ? HwMediaInfo.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? ProjectionDevice.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeInt(zPlay ? 1 : 0);
                    return true;
                case 35:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean zPauseWifiDisplay = pauseWifiDisplay(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(zPauseWifiDisplay ? 1 : 0);
                    return true;
                case 36:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean zResumeWifiDisplay = resumeWifiDisplay(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(zResumeWifiDisplay ? 1 : 0);
                    return true;
                case 37:
                    parcel.enforceInterface(DESCRIPTOR);
                    int sdkVersion = getSdkVersion();
                    parcel2.writeNoException();
                    parcel2.writeInt(sdkVersion);
                    return true;
                case 38:
                    parcel.enforceInterface(DESCRIPTOR);
                    ProjectionDevice targetProjectionDevice = getTargetProjectionDevice(parcel.readInt());
                    parcel2.writeNoException();
                    if (targetProjectionDevice != null) {
                        parcel2.writeInt(1);
                        targetProjectionDevice.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 39:
                    parcel.enforceInterface(DESCRIPTOR);
                    int hiSightServerPort = getHiSightServerPort();
                    parcel2.writeNoException();
                    parcel2.writeInt(hiSightServerPort);
                    return true;
                case 40:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean zAppendHiSightExInfo = appendHiSightExInfo(parcel.readInt(), parcel.createByteArray(), parcel.readInt(), parcel.readLong());
                    parcel2.writeNoException();
                    parcel2.writeInt(zAppendHiSightExInfo ? 1 : 0);
                    return true;
                case 41:
                    parcel.enforceInterface(DESCRIPTOR);
                    setRemoteCtrlEventProcessor(IRemoteCtrlEventProcessor.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 42:
                    parcel.enforceInterface(DESCRIPTOR);
                    int iSendRemoteCtrlData = sendRemoteCtrlData(parcel.readInt(), parcel.readInt(), parcel.createByteArray());
                    parcel2.writeNoException();
                    parcel2.writeInt(iSendRemoteCtrlData);
                    return true;
                case 43:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean zIsDisplayConnected = isDisplayConnected(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(zIsDisplayConnected ? 1 : 0);
                    return true;
                case 44:
                    parcel.enforceInterface(DESCRIPTOR);
                    int msdpServerPort = getMsdpServerPort();
                    parcel2.writeNoException();
                    parcel2.writeInt(msdpServerPort);
                    return true;
                case 45:
                    parcel.enforceInterface(DESCRIPTOR);
                    String strConvertFilePathToDmsUrl = convertFilePathToDmsUrl(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeString(strConvertFilePathToDmsUrl);
                    return true;
                case 46:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean authenticationInfo = setAuthenticationInfo(parcel.readInt() != 0 ? AuthenticationInfo.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeInt(authenticationInfo ? 1 : 0);
                    return true;
                case 47:
                    parcel.enforceInterface(DESCRIPTOR);
                    ConnectionInfo connectionInfo = getConnectionInfo(parcel.readInt());
                    parcel2.writeNoException();
                    if (connectionInfo != null) {
                        parcel2.writeInt(1);
                        connectionInfo.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 48:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean usingCapability = setUsingCapability(parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(usingCapability ? 1 : 0);
                    return true;
                case 49:
                    parcel.enforceInterface(DESCRIPTOR);
                    colorAdaption(parcel.readInt() != 0 ? ColorSet.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 50:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean zInputJsonDataForCast = inputJsonDataForCast(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(zInputJsonDataForCast ? 1 : 0);
                    return true;
                case 51:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean zCastConnectDevice = castConnectDevice(parcel.readInt() != 0 ? ConnectInfo.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeInt(zCastConnectDevice ? 1 : 0);
                    return true;
                case 52:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean zCastPlay = castPlay(parcel.readInt() != 0 ? PlayInfo.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeInt(zCastPlay ? 1 : 0);
                    return true;
                case 53:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean zRegisterMediaPlayerListener = registerMediaPlayerListener(IAidlMediaPlayerListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(zRegisterMediaPlayerListener ? 1 : 0);
                    return true;
                case 54:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean zUnregisterMediaPlayerListener = unregisterMediaPlayerListener();
                    parcel2.writeNoException();
                    parcel2.writeInt(zUnregisterMediaPlayerListener ? 1 : 0);
                    return true;
                case 55:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean zUpdatePlayInfo = updatePlayInfo(parcel.readInt() != 0 ? PlayInfo.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeInt(zUpdatePlayInfo ? 1 : 0);
                    return true;
                case 56:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean zPrevious = previous();
                    parcel2.writeNoException();
                    parcel2.writeInt(zPrevious ? 1 : 0);
                    return true;
                case 57:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean next = next();
                    parcel2.writeNoException();
                    parcel2.writeInt(next ? 1 : 0);
                    return true;
                case 58:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean repeatMode = setRepeatMode(parcel.readInt() != 0 ? ERepeatMode.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeInt(repeatMode ? 1 : 0);
                    return true;
                case 59:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean zPlayMediaItem = playMediaItem(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(zPlayMediaItem ? 1 : 0);
                    return true;
                case 60:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean zStartScan = startScan(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(zStartScan ? 1 : 0);
                    return true;
                case 61:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean zShowProjectionActivity = showProjectionActivity(parcel.readInt() != 0 ? ConfigInfo.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeInt(zShowProjectionActivity ? 1 : 0);
                    return true;
                case 62:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean zSeekTo = seekTo(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(zSeekTo ? 1 : 0);
                    return true;
                case 63:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean volumeMute = setVolumeMute(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    parcel2.writeInt(volumeMute ? 1 : 0);
                    return true;
                case 64:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean zCastDisconnectDevice = castDisconnectDevice(parcel.readInt() != 0 ? ProjectionDevice.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeInt(zCastDisconnectDevice ? 1 : 0);
                    return true;
                case 65:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean zIsCastConnected = isCastConnected(parcel.readInt() != 0 ? ProjectionDevice.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? EProjectionMode.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeInt(zIsCastConnected ? 1 : 0);
                    return true;
                case 66:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean zStopScan = stopScan(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(zStopScan ? 1 : 0);
                    return true;
                case 67:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean extendInfo = setExtendInfo(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(extendInfo ? 1 : 0);
                    return true;
                case 68:
                    parcel.enforceInterface(DESCRIPTOR);
                    String configInfo = setConfigInfo(parcel.readInt() != 0 ? ConfigInfo.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeString(configInfo);
                    return true;
                case 69:
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
                case 70:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean zChooseDialogResult = chooseDialogResult(parcel.readInt() != 0 ? DialogInfo.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeInt(zChooseDialogResult ? 1 : 0);
                    return true;
                case 71:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean zUpdateApplication = updateApplication(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(zUpdateApplication ? 1 : 0);
                    return true;
                case 72:
                    parcel.enforceInterface(DESCRIPTOR);
                    GrabState currentGrabState = getCurrentGrabState();
                    parcel2.writeNoException();
                    if (currentGrabState != null) {
                        parcel2.writeInt(1);
                        currentGrabState.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 73:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean zConfigGrabState = configGrabState(parcel.readInt(), parcel.readLong());
                    parcel2.writeNoException();
                    parcel2.writeInt(zConfigGrabState ? 1 : 0);
                    return true;
                case 74:
                    parcel.enforceInterface(DESCRIPTOR);
                    int version = getVersion();
                    parcel2.writeNoException();
                    parcel2.writeInt(version);
                    return true;
                case 75:
                    parcel.enforceInterface(DESCRIPTOR);
                    ICastSession iCastSessionCreateCastSession = createCastSession(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(iCastSessionCreateCastSession != null ? iCastSessionCreateCastSession.asBinder() : null);
                    return true;
                case 76:
                    parcel.enforceInterface(DESCRIPTOR);
                    ICastSession currentCastSession = getCurrentCastSession(parcel.readInt() != 0 ? ProjectionDevice.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(currentCastSession != null ? currentCastSession.asBinder() : null);
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }

        static class a implements IAidlHwPlayerManager {
            public static IAidlHwPlayerManager d;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private IBinder f5073b;

            a(IBinder iBinder) {
                this.f5073b = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f5073b;
            }

            @Override // com.huawei.android.airsharing.client.IAidlHwPlayerManager
            public boolean startServer(int i, String str, String str2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    if (!this.f5073b.transact(1, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().startServer(i, str, str2);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.android.airsharing.client.IAidlHwPlayerManager
            public boolean stopServer(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    if (!this.f5073b.transact(2, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().stopServer(i);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.android.airsharing.client.IAidlHwPlayerManager
            public List<HwServer> getServerList() throws RemoteException {
                List<HwServer> listCreateTypedArrayList;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.f5073b.transact(3, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        listCreateTypedArrayList = Stub.getDefaultImpl().getServerList();
                    } else {
                        parcelObtain2.readException();
                        listCreateTypedArrayList = parcelObtain2.createTypedArrayList(HwServer.CREATOR);
                    }
                    return listCreateTypedArrayList;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.android.airsharing.client.IAidlHwPlayerManager
            public void subscribServers(int i, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str);
                    if (!this.f5073b.transact(4, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().subscribServers(i, str);
                    } else {
                        parcelObtain2.readException();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.android.airsharing.client.IAidlHwPlayerManager
            public void unsubscribServers(int i, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str);
                    if (!this.f5073b.transact(5, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().unsubscribServers(i, str);
                    } else {
                        parcelObtain2.readException();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.android.airsharing.client.IAidlHwPlayerManager
            public int connectToServer(HwServer hwServer) throws RemoteException {
                int iConnectToServer;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (hwServer != null) {
                        parcelObtain.writeInt(1);
                        hwServer.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.f5073b.transact(6, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        iConnectToServer = Stub.getDefaultImpl().connectToServer(hwServer);
                    } else {
                        parcelObtain2.readException();
                        iConnectToServer = parcelObtain2.readInt();
                    }
                    return iConnectToServer;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.android.airsharing.client.IAidlHwPlayerManager
            public void disconnect() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.f5073b.transact(7, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().disconnect();
                    } else {
                        parcelObtain2.readException();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.android.airsharing.client.IAidlHwPlayerManager
            public void setHwSharingListener(int i, IAidlHwListener iAidlHwListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeStrongBinder(iAidlHwListener != null ? iAidlHwListener.asBinder() : null);
                    if (!this.f5073b.transact(8, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().setHwSharingListener(i, iAidlHwListener);
                    } else {
                        parcelObtain2.readException();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.android.airsharing.client.IAidlHwPlayerManager
            public void clsHwSharingListener(int i, IAidlHwListener iAidlHwListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeStrongBinder(iAidlHwListener != null ? iAidlHwListener.asBinder() : null);
                    if (!this.f5073b.transact(9, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().clsHwSharingListener(i, iAidlHwListener);
                    } else {
                        parcelObtain2.readException();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.android.airsharing.client.IAidlHwPlayerManager
            public boolean playMedia(int i, HwMediaInfo hwMediaInfo, boolean z, HwObject hwObject) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    if (hwMediaInfo != null) {
                        parcelObtain.writeInt(1);
                        hwMediaInfo.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    parcelObtain.writeInt(z ? 1 : 0);
                    if (hwObject != null) {
                        parcelObtain.writeInt(1);
                        hwObject.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.f5073b.transact(10, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().playMedia(i, hwMediaInfo, z, hwObject);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.android.airsharing.client.IAidlHwPlayerManager
            public HwMediaPosition getPosition(int i) throws RemoteException {
                HwMediaPosition hwMediaPositionCreateFromParcel;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    if (!this.f5073b.transact(11, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        hwMediaPositionCreateFromParcel = Stub.getDefaultImpl().getPosition(i);
                    } else {
                        parcelObtain2.readException();
                        hwMediaPositionCreateFromParcel = parcelObtain2.readInt() != 0 ? HwMediaPosition.CREATOR.createFromParcel(parcelObtain2) : null;
                    }
                    return hwMediaPositionCreateFromParcel;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.android.airsharing.client.IAidlHwPlayerManager
            public boolean seek(int i, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str);
                    if (!this.f5073b.transact(12, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().seek(i, str);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.android.airsharing.client.IAidlHwPlayerManager
            public boolean pause(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    if (!this.f5073b.transact(13, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().pause(i);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.android.airsharing.client.IAidlHwPlayerManager
            public boolean resume(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    if (!this.f5073b.transact(14, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().resume(i);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.android.airsharing.client.IAidlHwPlayerManager
            public boolean stop(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    if (!this.f5073b.transact(15, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().stop(i);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.android.airsharing.client.IAidlHwPlayerManager
            public boolean isRendering(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    if (!this.f5073b.transact(16, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().isRendering(i);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.android.airsharing.client.IAidlHwPlayerManager
            public boolean hasPlayer(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    if (!this.f5073b.transact(17, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().hasPlayer(i);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.android.airsharing.client.IAidlHwPlayerManager
            public HwMediaInfo getMediaInfo(int i) throws RemoteException {
                HwMediaInfo hwMediaInfoCreateFromParcel;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    if (!this.f5073b.transact(18, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        hwMediaInfoCreateFromParcel = Stub.getDefaultImpl().getMediaInfo(i);
                    } else {
                        parcelObtain2.readException();
                        hwMediaInfoCreateFromParcel = parcelObtain2.readInt() != 0 ? HwMediaInfo.CREATOR.createFromParcel(parcelObtain2) : null;
                    }
                    return hwMediaInfoCreateFromParcel;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.android.airsharing.client.IAidlHwPlayerManager
            public int getSeekTarget(int i) throws RemoteException {
                int seekTarget;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    if (!this.f5073b.transact(19, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        seekTarget = Stub.getDefaultImpl().getSeekTarget(i);
                    } else {
                        parcelObtain2.readException();
                        seekTarget = parcelObtain2.readInt();
                    }
                    return seekTarget;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.android.airsharing.client.IAidlHwPlayerManager
            public int getVolume(int i) throws RemoteException {
                int volume;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    if (!this.f5073b.transact(20, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        volume = Stub.getDefaultImpl().getVolume(i);
                    } else {
                        parcelObtain2.readException();
                        volume = parcelObtain2.readInt();
                    }
                    return volume;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.android.airsharing.client.IAidlHwPlayerManager
            public boolean setVolume(int i, int i2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    if (!this.f5073b.transact(21, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().setVolume(i, i2);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.android.airsharing.client.IAidlHwPlayerManager
            public void notifyVolumeChanged(int i, int i2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    if (!this.f5073b.transact(22, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().notifyVolumeChanged(i, i2);
                    } else {
                        parcelObtain2.readException();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.android.airsharing.client.IAidlHwPlayerManager
            public void notifyPositionChanged(int i, HwMediaPosition hwMediaPosition) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    if (hwMediaPosition != null) {
                        parcelObtain.writeInt(1);
                        hwMediaPosition.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.f5073b.transact(23, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().notifyPositionChanged(i, hwMediaPosition);
                    } else {
                        parcelObtain2.readException();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.android.airsharing.client.IAidlHwPlayerManager
            public void notifyTransportStateChanged(int i, EHwTransportState eHwTransportState) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    if (eHwTransportState != null) {
                        parcelObtain.writeInt(1);
                        eHwTransportState.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.f5073b.transact(24, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().notifyTransportStateChanged(i, eHwTransportState);
                    } else {
                        parcelObtain2.readException();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.android.airsharing.client.IAidlHwPlayerManager
            public HwServer getRenderingServer() throws RemoteException {
                HwServer hwServerCreateFromParcel;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.f5073b.transact(25, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        hwServerCreateFromParcel = Stub.getDefaultImpl().getRenderingServer();
                    } else {
                        parcelObtain2.readException();
                        hwServerCreateFromParcel = parcelObtain2.readInt() != 0 ? HwServer.CREATOR.createFromParcel(parcelObtain2) : null;
                    }
                    return hwServerCreateFromParcel;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.android.airsharing.client.IAidlHwPlayerManager
            public boolean startScanDevice(int i, boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(z ? 1 : 0);
                    if (!this.f5073b.transact(26, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().startScanDevice(i, z);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.android.airsharing.client.IAidlHwPlayerManager
            public boolean stopScanDevice(int i, boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(z ? 1 : 0);
                    if (!this.f5073b.transact(27, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().stopScanDevice(i, z);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.android.airsharing.client.IAidlHwPlayerManager
            public boolean connectDevice(int i, ProjectionDevice projectionDevice) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    if (projectionDevice != null) {
                        parcelObtain.writeInt(1);
                        projectionDevice.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.f5073b.transact(28, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().connectDevice(i, projectionDevice);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.android.airsharing.client.IAidlHwPlayerManager
            public boolean disconnectDevice(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    if (!this.f5073b.transact(29, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().disconnectDevice(i);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.android.airsharing.client.IAidlHwPlayerManager
            public String getTargetDevName(int i) throws RemoteException {
                String string;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    if (!this.f5073b.transact(30, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        string = Stub.getDefaultImpl().getTargetDevName(i);
                    } else {
                        parcelObtain2.readException();
                        string = parcelObtain2.readString();
                    }
                    return string;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.android.airsharing.client.IAidlHwPlayerManager
            public String getTargetDevIndication(int i) throws RemoteException {
                String string;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    if (!this.f5073b.transact(31, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        string = Stub.getDefaultImpl().getTargetDevIndication(i);
                    } else {
                        parcelObtain2.readException();
                        string = parcelObtain2.readString();
                    }
                    return string;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.android.airsharing.client.IAidlHwPlayerManager
            public boolean isConnected(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    if (!this.f5073b.transact(32, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().isConnected(i);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.android.airsharing.client.IAidlHwPlayerManager
            public boolean isDisplayConnecting(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    if (!this.f5073b.transact(33, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().isDisplayConnecting(i);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.android.airsharing.client.IAidlHwPlayerManager
            public boolean play(int i, HwMediaInfo hwMediaInfo, ProjectionDevice projectionDevice) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    if (hwMediaInfo != null) {
                        parcelObtain.writeInt(1);
                        hwMediaInfo.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (projectionDevice != null) {
                        parcelObtain.writeInt(1);
                        projectionDevice.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.f5073b.transact(34, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().play(i, hwMediaInfo, projectionDevice);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.android.airsharing.client.IAidlHwPlayerManager
            public boolean pauseWifiDisplay(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    if (!this.f5073b.transact(35, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().pauseWifiDisplay(i);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.android.airsharing.client.IAidlHwPlayerManager
            public boolean resumeWifiDisplay(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    if (!this.f5073b.transact(36, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().resumeWifiDisplay(i);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.android.airsharing.client.IAidlHwPlayerManager
            public int getSdkVersion() throws RemoteException {
                int sdkVersion;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.f5073b.transact(37, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        sdkVersion = Stub.getDefaultImpl().getSdkVersion();
                    } else {
                        parcelObtain2.readException();
                        sdkVersion = parcelObtain2.readInt();
                    }
                    return sdkVersion;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.android.airsharing.client.IAidlHwPlayerManager
            public ProjectionDevice getTargetProjectionDevice(int i) throws RemoteException {
                ProjectionDevice projectionDeviceCreateFromParcel;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    if (!this.f5073b.transact(38, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        projectionDeviceCreateFromParcel = Stub.getDefaultImpl().getTargetProjectionDevice(i);
                    } else {
                        parcelObtain2.readException();
                        projectionDeviceCreateFromParcel = parcelObtain2.readInt() != 0 ? ProjectionDevice.CREATOR.createFromParcel(parcelObtain2) : null;
                    }
                    return projectionDeviceCreateFromParcel;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.android.airsharing.client.IAidlHwPlayerManager
            public int getHiSightServerPort() throws RemoteException {
                int hiSightServerPort;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.f5073b.transact(39, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        hiSightServerPort = Stub.getDefaultImpl().getHiSightServerPort();
                    } else {
                        parcelObtain2.readException();
                        hiSightServerPort = parcelObtain2.readInt();
                    }
                    return hiSightServerPort;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.android.airsharing.client.IAidlHwPlayerManager
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
                        if (!this.f5073b.transact(40, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
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

            @Override // com.huawei.android.airsharing.client.IAidlHwPlayerManager
            public void setRemoteCtrlEventProcessor(IRemoteCtrlEventProcessor iRemoteCtrlEventProcessor) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeStrongBinder(iRemoteCtrlEventProcessor != null ? iRemoteCtrlEventProcessor.asBinder() : null);
                    if (!this.f5073b.transact(41, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().setRemoteCtrlEventProcessor(iRemoteCtrlEventProcessor);
                    } else {
                        parcelObtain2.readException();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.android.airsharing.client.IAidlHwPlayerManager
            public int sendRemoteCtrlData(int i, int i2, byte[] bArr) throws RemoteException {
                int iSendRemoteCtrlData;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeByteArray(bArr);
                    if (!this.f5073b.transact(42, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
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

            @Override // com.huawei.android.airsharing.client.IAidlHwPlayerManager
            public boolean isDisplayConnected(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    if (!this.f5073b.transact(43, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().isDisplayConnected(i);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.android.airsharing.client.IAidlHwPlayerManager
            public int getMsdpServerPort() throws RemoteException {
                int msdpServerPort;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.f5073b.transact(44, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        msdpServerPort = Stub.getDefaultImpl().getMsdpServerPort();
                    } else {
                        parcelObtain2.readException();
                        msdpServerPort = parcelObtain2.readInt();
                    }
                    return msdpServerPort;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.android.airsharing.client.IAidlHwPlayerManager
            public String convertFilePathToDmsUrl(String str) throws RemoteException {
                String string;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    if (!this.f5073b.transact(45, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        string = Stub.getDefaultImpl().convertFilePathToDmsUrl(str);
                    } else {
                        parcelObtain2.readException();
                        string = parcelObtain2.readString();
                    }
                    return string;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.android.airsharing.client.IAidlHwPlayerManager
            public boolean setAuthenticationInfo(AuthenticationInfo authenticationInfo) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (authenticationInfo != null) {
                        parcelObtain.writeInt(1);
                        authenticationInfo.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.f5073b.transact(46, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().setAuthenticationInfo(authenticationInfo);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.android.airsharing.client.IAidlHwPlayerManager
            public ConnectionInfo getConnectionInfo(int i) throws RemoteException {
                ConnectionInfo connectionInfoCreateFromParcel;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    if (!this.f5073b.transact(47, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        connectionInfoCreateFromParcel = Stub.getDefaultImpl().getConnectionInfo(i);
                    } else {
                        parcelObtain2.readException();
                        connectionInfoCreateFromParcel = parcelObtain2.readInt() != 0 ? ConnectionInfo.CREATOR.createFromParcel(parcelObtain2) : null;
                    }
                    return connectionInfoCreateFromParcel;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.android.airsharing.client.IAidlHwPlayerManager
            public boolean setUsingCapability(int i, int i2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    if (!this.f5073b.transact(48, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().setUsingCapability(i, i2);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.android.airsharing.client.IAidlHwPlayerManager
            public void colorAdaption(ColorSet colorSet) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (colorSet != null) {
                        parcelObtain.writeInt(1);
                        colorSet.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.f5073b.transact(49, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().colorAdaption(colorSet);
                    } else {
                        parcelObtain2.readException();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.android.airsharing.client.IAidlHwPlayerManager
            public boolean inputJsonDataForCast(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    if (!this.f5073b.transact(50, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().inputJsonDataForCast(str);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.android.airsharing.client.IAidlHwPlayerManager
            public boolean castConnectDevice(ConnectInfo connectInfo) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (connectInfo != null) {
                        parcelObtain.writeInt(1);
                        connectInfo.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.f5073b.transact(51, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().castConnectDevice(connectInfo);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.android.airsharing.client.IAidlHwPlayerManager
            public boolean castPlay(PlayInfo playInfo) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (playInfo != null) {
                        parcelObtain.writeInt(1);
                        playInfo.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.f5073b.transact(52, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().castPlay(playInfo);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.android.airsharing.client.IAidlHwPlayerManager
            public boolean registerMediaPlayerListener(IAidlMediaPlayerListener iAidlMediaPlayerListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeStrongBinder(iAidlMediaPlayerListener != null ? iAidlMediaPlayerListener.asBinder() : null);
                    if (!this.f5073b.transact(53, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().registerMediaPlayerListener(iAidlMediaPlayerListener);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.android.airsharing.client.IAidlHwPlayerManager
            public boolean unregisterMediaPlayerListener() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.f5073b.transact(54, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().unregisterMediaPlayerListener();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.android.airsharing.client.IAidlHwPlayerManager
            public boolean updatePlayInfo(PlayInfo playInfo) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (playInfo != null) {
                        parcelObtain.writeInt(1);
                        playInfo.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.f5073b.transact(55, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().updatePlayInfo(playInfo);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.android.airsharing.client.IAidlHwPlayerManager
            public boolean previous() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.f5073b.transact(56, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().previous();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.android.airsharing.client.IAidlHwPlayerManager
            public boolean next() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.f5073b.transact(57, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().next();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.android.airsharing.client.IAidlHwPlayerManager
            public boolean setRepeatMode(ERepeatMode eRepeatMode) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (eRepeatMode != null) {
                        parcelObtain.writeInt(1);
                        eRepeatMode.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.f5073b.transact(58, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().setRepeatMode(eRepeatMode);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.android.airsharing.client.IAidlHwPlayerManager
            public boolean playMediaItem(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    if (!this.f5073b.transact(59, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().playMediaItem(i);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.android.airsharing.client.IAidlHwPlayerManager
            public boolean startScan(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    if (!this.f5073b.transact(60, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().startScan(i);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.android.airsharing.client.IAidlHwPlayerManager
            public boolean showProjectionActivity(ConfigInfo configInfo) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (configInfo != null) {
                        parcelObtain.writeInt(1);
                        configInfo.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.f5073b.transact(61, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().showProjectionActivity(configInfo);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.android.airsharing.client.IAidlHwPlayerManager
            public boolean seekTo(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    if (!this.f5073b.transact(62, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().seekTo(i);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.android.airsharing.client.IAidlHwPlayerManager
            public boolean setVolumeMute(boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(z ? 1 : 0);
                    if (!this.f5073b.transact(63, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().setVolumeMute(z);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.android.airsharing.client.IAidlHwPlayerManager
            public boolean castDisconnectDevice(ProjectionDevice projectionDevice) throws RemoteException {
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
                    if (!this.f5073b.transact(64, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().castDisconnectDevice(projectionDevice);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.android.airsharing.client.IAidlHwPlayerManager
            public boolean isCastConnected(ProjectionDevice projectionDevice, EProjectionMode eProjectionMode) throws RemoteException {
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
                    if (!this.f5073b.transact(65, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().isCastConnected(projectionDevice, eProjectionMode);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.android.airsharing.client.IAidlHwPlayerManager
            public boolean stopScan(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    if (!this.f5073b.transact(66, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().stopScan(i);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.android.airsharing.client.IAidlHwPlayerManager
            public boolean setExtendInfo(String str, String str2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    if (!this.f5073b.transact(67, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().setExtendInfo(str, str2);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.android.airsharing.client.IAidlHwPlayerManager
            public String setConfigInfo(ConfigInfo configInfo) throws RemoteException {
                String string;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (configInfo != null) {
                        parcelObtain.writeInt(1);
                        configInfo.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.f5073b.transact(68, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        string = Stub.getDefaultImpl().setConfigInfo(configInfo);
                    } else {
                        parcelObtain2.readException();
                        string = parcelObtain2.readString();
                    }
                    return string;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.android.airsharing.client.IAidlHwPlayerManager
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
                    if (!this.f5073b.transact(69, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
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

            @Override // com.huawei.android.airsharing.client.IAidlHwPlayerManager
            public boolean chooseDialogResult(DialogInfo dialogInfo) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (dialogInfo != null) {
                        parcelObtain.writeInt(1);
                        dialogInfo.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.f5073b.transact(70, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().chooseDialogResult(dialogInfo);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.android.airsharing.client.IAidlHwPlayerManager
            public boolean updateApplication(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    if (!this.f5073b.transact(71, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().updateApplication(str);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.android.airsharing.client.IAidlHwPlayerManager
            public GrabState getCurrentGrabState() throws RemoteException {
                GrabState grabStateCreateFromParcel;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.f5073b.transact(72, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        grabStateCreateFromParcel = Stub.getDefaultImpl().getCurrentGrabState();
                    } else {
                        parcelObtain2.readException();
                        grabStateCreateFromParcel = parcelObtain2.readInt() != 0 ? GrabState.CREATOR.createFromParcel(parcelObtain2) : null;
                    }
                    return grabStateCreateFromParcel;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.android.airsharing.client.IAidlHwPlayerManager
            public boolean configGrabState(int i, long j) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeLong(j);
                    if (!this.f5073b.transact(73, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().configGrabState(i, j);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.android.airsharing.client.IAidlHwPlayerManager
            public int getVersion() throws RemoteException {
                int version;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.f5073b.transact(74, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        version = Stub.getDefaultImpl().getVersion();
                    } else {
                        parcelObtain2.readException();
                        version = parcelObtain2.readInt();
                    }
                    return version;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.android.airsharing.client.IAidlHwPlayerManager
            public ICastSession createCastSession(int i) throws RemoteException {
                ICastSession iCastSessionAsInterface;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    if (!this.f5073b.transact(75, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        iCastSessionAsInterface = Stub.getDefaultImpl().createCastSession(i);
                    } else {
                        parcelObtain2.readException();
                        iCastSessionAsInterface = ICastSession.Stub.asInterface(parcelObtain2.readStrongBinder());
                    }
                    return iCastSessionAsInterface;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.android.airsharing.client.IAidlHwPlayerManager
            public ICastSession getCurrentCastSession(ProjectionDevice projectionDevice) throws RemoteException {
                ICastSession iCastSessionAsInterface;
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
                    if (!this.f5073b.transact(76, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        iCastSessionAsInterface = Stub.getDefaultImpl().getCurrentCastSession(projectionDevice);
                    } else {
                        parcelObtain2.readException();
                        iCastSessionAsInterface = ICastSession.Stub.asInterface(parcelObtain2.readStrongBinder());
                    }
                    return iCastSessionAsInterface;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public static boolean setDefaultImpl(IAidlHwPlayerManager iAidlHwPlayerManager) {
            if (a.d != null || iAidlHwPlayerManager == null) {
                return false;
            }
            a.d = iAidlHwPlayerManager;
            return true;
        }

        public static IAidlHwPlayerManager getDefaultImpl() {
            return a.d;
        }
    }
}
