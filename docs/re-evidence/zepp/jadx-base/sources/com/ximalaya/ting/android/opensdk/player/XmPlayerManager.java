package com.ximalaya.ting.android.opensdk.player;

import android.app.Notification;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.xiaomi.mipush.sdk.Constants;
import com.ximalaya.ting.android.opensdk.constants.ConstantsOpenSdk;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import com.ximalaya.ting.android.opensdk.datatrasfer.AccessTokenManager;
import com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest;
import com.ximalaya.ting.android.opensdk.datatrasfer.IDataCallBack;
import com.ximalaya.ting.android.opensdk.datatrasfer.IDeviceInfoProvider;
import com.ximalaya.ting.android.opensdk.httputil.Config;
import com.ximalaya.ting.android.opensdk.model.PlayableModel;
import com.ximalaya.ting.android.opensdk.model.advertis.Advertis;
import com.ximalaya.ting.android.opensdk.model.advertis.AdvertisList;
import com.ximalaya.ting.android.opensdk.model.live.program.Program;
import com.ximalaya.ting.android.opensdk.model.live.radio.Radio;
import com.ximalaya.ting.android.opensdk.model.live.schedule.Schedule;
import com.ximalaya.ting.android.opensdk.model.live.schedule.ScheduleList;
import com.ximalaya.ting.android.opensdk.model.statistic.RecordModel;
import com.ximalaya.ting.android.opensdk.model.token.AccessToken;
import com.ximalaya.ting.android.opensdk.model.track.CommonTrackList;
import com.ximalaya.ting.android.opensdk.model.track.Track;
import com.ximalaya.ting.android.opensdk.model.xdcs.CdnConfigModel;
import com.ximalaya.ting.android.opensdk.player.advertis.IXmAdsStatusListener;
import com.ximalaya.ting.android.opensdk.player.advertis.OpenSdkAdsDataHandler;
import com.ximalaya.ting.android.opensdk.player.constants.PlayerConstants;
import com.ximalaya.ting.android.opensdk.player.service.IXmAdsEventDispatcher;
import com.ximalaya.ting.android.opensdk.player.service.IXmCommonBusinessDispatcher;
import com.ximalaya.ting.android.opensdk.player.service.IXmCommonBusinessHandle;
import com.ximalaya.ting.android.opensdk.player.service.IXmDataCallback;
import com.ximalaya.ting.android.opensdk.player.service.IXmPlayer;
import com.ximalaya.ting.android.opensdk.player.service.IXmPlayerEventDispatcher;
import com.ximalaya.ting.android.opensdk.player.service.IXmPlayerStatusListener;
import com.ximalaya.ting.android.opensdk.player.service.IXmTokenInvalidForSDKCallBack;
import com.ximalaya.ting.android.opensdk.player.service.XmPlayListControl;
import com.ximalaya.ting.android.opensdk.player.service.XmPlayerException;
import com.ximalaya.ting.android.opensdk.player.service.XmPlayerService;
import com.ximalaya.ting.android.opensdk.player.sigmob.RewardVideoAdActivity;
import com.ximalaya.ting.android.opensdk.player.statistic.OpenSdkPlayStatisticUpload;
import com.ximalaya.ting.android.opensdk.util.BaseUtil;
import com.ximalaya.ting.android.opensdk.util.Logger;
import com.ximalaya.ting.android.opensdk.util.ModelUtil;
import com.ximalaya.ting.android.player.PlayerUtil;
import com.ximalaya.ting.android.player.XMediaPlayerConstants;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes22.dex */
public class XmPlayerManager {
    private static final int MSG_ADS_BUFFERING_START = 14;
    private static final int MSG_ADS_BUFFERING_STOP = 15;
    private static final int MSG_BUFFER_PROGRESS_CHANGE = 9;
    private static final int MSG_BUFFER_STATUS_CHANGE = 6;
    private static final int MSG_CLOSE_APP = 20;
    private static final int MSG_COMPLETE_PLAY_ADS = 17;
    private static final int MSG_GET_ADS_INFO = 13;
    private static final int MSG_OLD_CHARGE_TRACK_NEED_REDOWNLOAD = 19;
    private static final int MSG_PLAY_ADS_ERROR = 18;
    private static final int MSG_PLAY_COMPLETE = 4;
    private static final int MSG_PLAY_ERROR = 10;
    private static final int MSG_PLAY_PAUSE = 2;
    private static final int MSG_PLAY_START = 1;
    private static final int MSG_PLAY_STOP = 3;
    private static final int MSG_POP_AD_DIALOG = 21;
    private static final int MSG_PROGRESS_CHANGE = 7;
    private static final int MSG_SOUND_CHANGE = 8;
    private static final int MSG_SOUND_PREPARED = 5;
    private static final int MSG_START_GET_ADS_INFO = 12;
    private static final int MSG_START_PLAY_ADS = 16;
    private static final String TAG = "XmPlayerServiceManager";
    private static int mEnvironment = 1;
    private static Config sHttpConfig = null;
    private static volatile XmPlayerManager sInstance = null;
    private static byte[] sLock = new byte[0];
    private static int sPageSize = 20;
    private Track backCurTrack;
    private AccessToken mAccessToken;
    private Context mAppCtx;
    private List<Track> mCachedPlayList;
    private IConnectListener mConnectListener;
    private PlayableModel mCurModel;
    private IXmDataCallback mDataCallback;
    private IXmCommonBusinessHandle mIXmCommonBusinessHandle;
    private Notification mNotification;
    private Notification mNotificationForNoCrash;
    private IXmPlayer mPlayerStub;
    private boolean mConnected = false;
    private boolean mBindRet = false;
    private int mNotificationId = 0;
    private int mNotificationIdForNoCrash = 0;
    private List<IXmPlayerStatusListener> mPlayerStatusListeners = new CopyOnWriteArrayList();
    private List<IXmAdsStatusListener> mAdsStatusListeners = new CopyOnWriteArrayList();
    private long unlockTrackNum = 3;
    private ServiceConnection mConn = new ServiceConnection() { // from class: com.ximalaya.ting.android.opensdk.player.XmPlayerManager.1
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                Logger.i(XmPlayerManager.TAG, "onServiceConnected progress:" + Process.myPid());
                Logger.logToSd("XmPlayerManager onServiceConnected progress: " + System.currentTimeMillis());
                XmPlayerManager.this.mConnected = true;
                XmPlayerManager.this.mBindRet = true;
                XmPlayerManager.this.mPlayerStub = IXmPlayer.Stub.asInterface(iBinder);
                XmPlayerManager.this.mPlayerStub.registePlayerListener(XmPlayerManager.this.mListenerStub);
                XmPlayerManager.this.mPlayerStub.registeAdsListener(XmPlayerManager.this.mAdsListenerStub);
                if (!BaseUtil.isPlayerProcess(XmPlayerManager.this.mAppCtx)) {
                    XmPlayerManager.this.mPlayerStub.setPlayerProcessRequestEnvironment(XmPlayerManager.mEnvironment);
                    XmPlayerManager.this.mPlayerStub.registeCommonBusinessListener(XmPlayerManager.this.mIXmCommonBusinessDispatcherStub);
                    XmPlayerManager.this.mPlayerStub.setPlayListChangeListener(XmPlayerManager.this.mDataCallbackSub);
                    if (XmPlayerManager.this.mNotification != null) {
                        XmPlayerManager.this.mPlayerStub.setNotification(XmPlayerManager.this.mNotificationId, XmPlayerManager.this.mNotification);
                    } else if (XmPlayerManager.this.mNotificationForNoCrash != null) {
                        XmPlayerManager.this.mPlayerStub.setNotificationForNoCrash(XmPlayerManager.this.mNotificationIdForNoCrash, XmPlayerManager.this.mNotificationForNoCrash);
                    }
                }
                if (XmPlayerManager.this.mAccessToken != null) {
                    XmPlayerManager.this.mPlayerStub.setTokenToPlayForSDK(XmPlayerManager.this.mAccessToken);
                }
                if (!TextUtils.isEmpty(CommonRequest.getInstanse().getAppsecret()) && !BaseUtil.isPlayerProcess(XmPlayerManager.this.mAppCtx)) {
                    if (CommonRequest.getInstanse().getITokenStateChange() != null) {
                        XmPlayerManager.this.mPlayerStub.setTokenInvalidForSDK(XmPlayerManager.this.mTokenInvalidForSDKCallBackStub);
                    }
                    XmPlayerManager.this.mPlayerStub.setAppSecret(CommonRequest.getInstanse().getAppsecret());
                    XmPlayerManager.this.mPlayerStub.setAppkeyAndPackId(CommonRequest.getInstanse().getAppKey(), CommonRequest.getInstanse().getPackId());
                    XmPlayerManager.this.mPlayerStub.setTokenToPlayForSDK(AccessTokenManager.getInstanse().getTokenModel());
                }
                if (!BaseUtil.isPlayerProcess(XmPlayerManager.this.mAppCtx)) {
                    XmPlayerManager.this.mPlayerStub.setAdsDataHandlerClassName(OpenSdkAdsDataHandler.class.getName());
                    XmPlayerManager.this.mPlayerStub.setPlayStatisticClassName(OpenSdkPlayStatisticUpload.class.getName());
                }
                XmPlayerManager.this.mPlayerStub.setBreakpointResume(XmPlayerManager.this.breakpointResume);
                XmPlayerManager.this.setPlayerProxy();
                XmPlayerManager.this.setDefaultPageSize();
                Logger.i(XmPlayerManager.TAG, "onServiceConnected123");
                for (IConnectListener iConnectListener : XmPlayerManager.this.mConnectListenerSet) {
                    if (iConnectListener != null) {
                        iConnectListener.onConnected();
                    }
                }
                if (XmPlayerManager.this.mConnectListener != null) {
                    XmPlayerManager.this.mConnectListener.onConnected();
                }
                XmPlayerManager xmPlayerManager = XmPlayerManager.this;
                xmPlayerManager.mCurModel = xmPlayerManager.mPlayerStub.getTrack(XmPlayerManager.this.mPlayerStub.getCurrIndex());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            Logger.logToSd("XmPlayerManager onServiceDisconnected  " + System.currentTimeMillis());
            XmPlayerManager.this.mConnected = false;
            XmPlayerManager.this.mBindRet = false;
            for (IConnectListener iConnectListener : XmPlayerManager.this.mConnectListenerSet) {
                if (iConnectListener instanceof IConnectAndDisConnectListener) {
                    ((IConnectAndDisConnectListener) iConnectListener).onDisconnected();
                }
            }
            if (XmPlayerManager.this.mConnectListener instanceof IConnectAndDisConnectListener) {
                ((IConnectAndDisConnectListener) XmPlayerManager.this.mConnectListener).onDisconnected();
            }
            XmPlayerManager xmPlayerManager = XmPlayerManager.this;
            xmPlayerManager.init(xmPlayerManager.mNotificationId, XmPlayerManager.this.mNotification);
        }
    };
    private Set<IConnectListener> mConnectListenerSet = new CopyOnWriteArraySet();
    private IXmTokenInvalidForSDKCallBack.Stub mTokenInvalidForSDKCallBackStub = new IXmTokenInvalidForSDKCallBack.Stub() { // from class: com.ximalaya.ting.android.opensdk.player.XmPlayerManager.2
        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmTokenInvalidForSDKCallBack
        public boolean getTokenByRefreshAsync() throws RemoteException {
            CommonRequest.ITokenStateChange iTokenStateChange = CommonRequest.getInstanse().getITokenStateChange();
            if (iTokenStateChange != null) {
                return iTokenStateChange.getTokenByRefreshAsync();
            }
            return false;
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmTokenInvalidForSDKCallBack
        public AccessToken getTokenByRefreshSync() throws RemoteException {
            CommonRequest.ITokenStateChange iTokenStateChange = CommonRequest.getInstanse().getITokenStateChange();
            if (iTokenStateChange == null || !iTokenStateChange.getTokenByRefreshSync()) {
                return null;
            }
            return AccessTokenManager.getInstanse().getTokenModel();
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmTokenInvalidForSDKCallBack
        public void tokenInvalid() throws RemoteException {
            CommonRequest.ITokenStateChange iTokenStateChange = CommonRequest.getInstanse().getITokenStateChange();
            if (iTokenStateChange == null) {
                AccessTokenManager.getInstanse().update();
            } else {
                if (iTokenStateChange.getTokenByRefreshAsync()) {
                    return;
                }
                iTokenStateChange.tokenLosted();
            }
        }
    };
    private IXmCommonBusinessDispatcher.Stub mIXmCommonBusinessDispatcherStub = new IXmCommonBusinessDispatcher.Stub() { // from class: com.ximalaya.ting.android.opensdk.player.XmPlayerManager.3
        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmCommonBusinessDispatcher
        public void closeApp() throws RemoteException {
            XmPlayerManager.this.mUiHandler.removeCallbacksAndMessages(null);
            XmPlayerManager.this.mUiHandler.obtainMessage(20).sendToTarget();
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmCommonBusinessDispatcher
        public String getDownloadPlayPath(Track track) throws RemoteException {
            if (XmPlayerManager.this.mIXmCommonBusinessHandle != null) {
                return XmPlayerManager.this.mIXmCommonBusinessHandle.getDownloadPlayPath(track);
            }
            return null;
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmCommonBusinessDispatcher
        public String imei() throws RemoteException {
            IDeviceInfoProvider deviceInfoProvider = CommonRequest.getInstanse().getDeviceInfoProvider();
            if (deviceInfoProvider != null) {
                return deviceInfoProvider.imei();
            }
            return null;
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmCommonBusinessDispatcher
        public void isOldTrackDownload(Track track) throws RemoteException {
            Message messageObtainMessage = XmPlayerManager.this.mUiHandler.obtainMessage(19);
            messageObtainMessage.obj = track;
            messageObtainMessage.sendToTarget();
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmCommonBusinessDispatcher
        public String macAddress() throws RemoteException {
            IDeviceInfoProvider deviceInfoProvider = CommonRequest.getInstanse().getDeviceInfoProvider();
            if (deviceInfoProvider != null) {
                return deviceInfoProvider.macAddress();
            }
            return null;
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmCommonBusinessDispatcher
        @Nullable
        public String oaid() throws RemoteException {
            IDeviceInfoProvider deviceInfoProvider = CommonRequest.getInstanse().getDeviceInfoProvider();
            if (deviceInfoProvider != null) {
                return deviceInfoProvider.oaid();
            }
            return null;
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmCommonBusinessDispatcher
        public String serial() throws RemoteException {
            IDeviceInfoProvider deviceInfoProvider = CommonRequest.getInstanse().getDeviceInfoProvider();
            if (deviceInfoProvider != null) {
                return deviceInfoProvider.serial();
            }
            return null;
        }
    };
    private IXmAdsEventDispatcher.Stub mAdsListenerStub = new IXmAdsEventDispatcher.Stub() { // from class: com.ximalaya.ting.android.opensdk.player.XmPlayerManager.4
        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmAdsEventDispatcher
        public void onAdsStartBuffering() throws RemoteException {
            XmPlayerManager.this.mUiHandler.obtainMessage(14).sendToTarget();
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmAdsEventDispatcher
        public void onAdsStopBuffering() throws RemoteException {
            XmPlayerManager.this.mUiHandler.obtainMessage(15).sendToTarget();
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmAdsEventDispatcher
        public void onCompletePlayAds() throws RemoteException {
            XmPlayerManager.this.mUiHandler.obtainMessage(17).sendToTarget();
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmAdsEventDispatcher
        public void onError(int i, int i2) throws RemoteException {
            Message messageObtainMessage = XmPlayerManager.this.mUiHandler.obtainMessage(18);
            messageObtainMessage.arg1 = i;
            messageObtainMessage.arg2 = i2;
            messageObtainMessage.sendToTarget();
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmAdsEventDispatcher
        public void onGetAdsInfo(AdvertisList advertisList) throws RemoteException {
            Message messageObtainMessage = XmPlayerManager.this.mUiHandler.obtainMessage(13);
            messageObtainMessage.obj = advertisList;
            messageObtainMessage.sendToTarget();
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmAdsEventDispatcher
        public void onStartGetAdsInfo() throws RemoteException {
            XmPlayerManager.this.mUiHandler.obtainMessage(12).sendToTarget();
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmAdsEventDispatcher
        public void onStartPlayAds(Advertis advertis, int i) throws RemoteException {
            Message messageObtainMessage = XmPlayerManager.this.mUiHandler.obtainMessage(16);
            messageObtainMessage.arg1 = i;
            messageObtainMessage.obj = advertis;
            messageObtainMessage.sendToTarget();
        }
    };
    private IXmPlayerEventDispatcher.Stub mListenerStub = new IXmPlayerEventDispatcher.Stub() { // from class: com.ximalaya.ting.android.opensdk.player.XmPlayerManager.5
        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayerEventDispatcher
        public void onBufferProgress(int i) throws RemoteException {
            Message messageObtainMessage = XmPlayerManager.this.mUiHandler.obtainMessage(9);
            messageObtainMessage.arg1 = i;
            messageObtainMessage.sendToTarget();
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayerEventDispatcher
        public void onBufferingStart() throws RemoteException {
            Message messageObtainMessage = XmPlayerManager.this.mUiHandler.obtainMessage(6);
            messageObtainMessage.obj = Boolean.TRUE;
            messageObtainMessage.sendToTarget();
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayerEventDispatcher
        public void onBufferingStop() throws RemoteException {
            Message messageObtainMessage = XmPlayerManager.this.mUiHandler.obtainMessage(6);
            messageObtainMessage.obj = Boolean.FALSE;
            messageObtainMessage.sendToTarget();
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayerEventDispatcher
        public void onError(XmPlayerException xmPlayerException) throws RemoteException {
            Message messageObtainMessage = XmPlayerManager.this.mUiHandler.obtainMessage(10);
            messageObtainMessage.obj = xmPlayerException;
            messageObtainMessage.sendToTarget();
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayerEventDispatcher
        public void onPlayPause() throws RemoteException {
            XmPlayerManager.this.mUiHandler.obtainMessage(2).sendToTarget();
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayerEventDispatcher
        public void onPlayProgress(int i, int i2) throws RemoteException {
            Message messageObtainMessage = XmPlayerManager.this.mUiHandler.obtainMessage(7);
            messageObtainMessage.arg1 = i;
            messageObtainMessage.arg2 = i2;
            messageObtainMessage.sendToTarget();
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayerEventDispatcher
        public void onPlayStart() throws RemoteException {
            XmPlayerManager.this.mUiHandler.obtainMessage(1).sendToTarget();
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayerEventDispatcher
        public void onPlayStop() throws RemoteException {
            XmPlayerManager.this.mUiHandler.obtainMessage(3).sendToTarget();
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayerEventDispatcher
        public void onSoundPlayComplete() throws RemoteException {
            XmPlayerManager.this.mUiHandler.obtainMessage(4).sendToTarget();
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayerEventDispatcher
        public void onSoundPrepared() throws RemoteException {
            XmPlayerManager.this.mUiHandler.obtainMessage(5).sendToTarget();
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayerEventDispatcher
        public void onSoundSwitch(Track track, Track track2) throws RemoteException {
            Message messageObtainMessage = XmPlayerManager.this.mUiHandler.obtainMessage(8);
            messageObtainMessage.obj = new Object[]{track, track2};
            messageObtainMessage.sendToTarget();
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayerEventDispatcher
        public void popAdTipDialog(Track track, long j) throws RemoteException {
            XmPlayerManager.this.backCurTrack = track;
            XmPlayerManager.this.unlockTrackNum = j;
            XmPlayerManager.this.mUiHandler.obtainMessage(21).sendToTarget();
        }
    };
    private IXmDataCallback.Stub mDataCallbackSub = new IXmDataCallback.Stub() { // from class: com.ximalaya.ting.android.opensdk.player.XmPlayerManager.6
        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmDataCallback
        public void onDataReady(List<Track> list, boolean z, boolean z2) throws RemoteException {
            if (XmPlayerManager.this.mDataCallback != null) {
                XmPlayerManager.this.mDataCallback.onDataReady(list, z, z2);
            }
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmDataCallback
        public void onError(int i, String str, boolean z) throws RemoteException {
            if (XmPlayerManager.this.mDataCallback != null) {
                XmPlayerManager.this.mDataCallback.onError(i, str, z);
            }
        }
    };
    private boolean breakpointResume = true;
    private int mVideoAdState = 0;
    private UIHandler mUiHandler = new UIHandler(Looper.getMainLooper());

    public interface IConnectAndDisConnectListener extends IConnectListener {
        void onDisconnected();
    }

    public interface IConnectListener {
        void onConnected();
    }

    public class UIHandler extends Handler {
        public UIHandler(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    XmPlayerManager.this.handlePlayStart();
                    break;
                case 2:
                    XmPlayerManager.this.handlePlayPause();
                    break;
                case 3:
                    XmPlayerManager.this.handlePlayStop();
                    break;
                case 4:
                    XmPlayerManager.this.handlePlayComplete();
                    break;
                case 5:
                    XmPlayerManager.this.handleSoundPrepared();
                    break;
                case 6:
                    Object obj = message.obj;
                    if (obj instanceof Boolean) {
                        XmPlayerManager.this.handleBufferStatusChange(((Boolean) obj).booleanValue());
                    }
                    break;
                case 7:
                    XmPlayerManager.this.handlePlayProgressChange(message.arg1, message.arg2);
                    break;
                case 8:
                    Object[] objArr = (Object[]) message.obj;
                    XmPlayerManager.this.handleSoundChange((PlayableModel) objArr[0], (PlayableModel) objArr[1]);
                    break;
                case 9:
                    XmPlayerManager.this.handleBufferChange(message.arg1);
                    break;
                case 10:
                    XmPlayerManager.this.handlePlayError((XmPlayerException) message.obj);
                    break;
                case 12:
                    XmPlayerManager.this.handleStartGetAdsInfo();
                    break;
                case 13:
                    XmPlayerManager.this.handleGetAdsInfo((AdvertisList) message.obj);
                    break;
                case 14:
                    XmPlayerManager.this.handleAdsBufferingStart();
                    break;
                case 15:
                    XmPlayerManager.this.handleAdsBufferingStop();
                    break;
                case 16:
                    XmPlayerManager.this.handleStartPlayAds((Advertis) message.obj, message.arg1);
                    break;
                case 17:
                    XmPlayerManager.this.handleCompletePlayAds();
                    break;
                case 18:
                    XmPlayerManager.this.handlePlayAdsError(message.arg1, message.arg2);
                    break;
                case 19:
                    XmPlayerManager.this.handleOldChargeTrackNeedRedownload((Track) message.obj);
                    break;
                case 20:
                    XmPlayerManager.this.handleCloseApp();
                    break;
                case 21:
                    Intent intent = new Intent(XmPlayerManager.this.mAppCtx, (Class<?>) RewardVideoAdActivity.class);
                    intent.setFlags(268435456);
                    intent.putExtra(RewardVideoAdActivity.KEY_UNLOCK_TRACK_NUM, XmPlayerManager.this.unlockTrackNum);
                    XmPlayerManager.this.mAppCtx.startActivity(intent);
                    break;
            }
        }
    }

    private XmPlayerManager(Context context) {
        this.mAppCtx = context.getApplicationContext();
        XMediaPlayerConstants.resetCacheDir(this.mAppCtx);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean checkConnectionStatus() {
        IXmPlayer iXmPlayer;
        if (this.mConnected && (iXmPlayer = this.mPlayerStub) != null && iXmPlayer.asBinder() != null && this.mPlayerStub.asBinder().isBinderAlive()) {
            return true;
        }
        if (!ConstantsOpenSdk.isDebug) {
            return false;
        }
        Logger.logToSd("checkConnectionStatus disconnected" + Log.getStackTraceString(new Throwable()));
        throw new RuntimeException("XmPlayerManager 未初始化 请先执行init ,此提示之会在ConstantsOpenSdk.isDebug=true时提示");
    }

    public static XmPlayerManager getInstance(Context context) {
        if (ConstantsOpenSdk.isDebug && context == null && sInstance != null) {
            Context context2 = sInstance.mAppCtx;
        }
        if (sInstance == null) {
            synchronized (sLock) {
                if (sInstance == null) {
                    sInstance = new XmPlayerManager(context);
                }
            }
        }
        return sInstance;
    }

    public static long getPlayCacheSize() {
        return PlayerUtil.getPlayCacheSize();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleAdsBufferingStart() {
        Iterator<IXmAdsStatusListener> it2 = this.mAdsStatusListeners.iterator();
        while (it2.hasNext()) {
            it2.next().onAdsStartBuffering();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleAdsBufferingStop() {
        Iterator<IXmAdsStatusListener> it2 = this.mAdsStatusListeners.iterator();
        while (it2.hasNext()) {
            it2.next().onAdsStopBuffering();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleBufferChange(int i) {
        Iterator<IXmPlayerStatusListener> it2 = this.mPlayerStatusListeners.iterator();
        while (it2.hasNext()) {
            it2.next().onBufferProgress(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleBufferStatusChange(boolean z) {
        for (IXmPlayerStatusListener iXmPlayerStatusListener : this.mPlayerStatusListeners) {
            if (z) {
                iXmPlayerStatusListener.onBufferingStart();
            } else {
                iXmPlayerStatusListener.onBufferingStop();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleCloseApp() {
        IXmCommonBusinessHandle iXmCommonBusinessHandle = this.mIXmCommonBusinessHandle;
        if (iXmCommonBusinessHandle != null) {
            iXmCommonBusinessHandle.closeApp();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleCompletePlayAds() {
        Iterator<IXmAdsStatusListener> it2 = this.mAdsStatusListeners.iterator();
        while (it2.hasNext()) {
            it2.next().onCompletePlayAds();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleGetAdsInfo(AdvertisList advertisList) {
        Iterator<IXmAdsStatusListener> it2 = this.mAdsStatusListeners.iterator();
        while (it2.hasNext()) {
            it2.next().onGetAdsInfo(advertisList);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleOldChargeTrackNeedRedownload(Track track) {
        IXmCommonBusinessHandle iXmCommonBusinessHandle = this.mIXmCommonBusinessHandle;
        if (iXmCommonBusinessHandle != null) {
            iXmCommonBusinessHandle.isOldTrackDownload(track);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handlePlayAdsError(int i, int i2) {
        Iterator<IXmAdsStatusListener> it2 = this.mAdsStatusListeners.iterator();
        while (it2.hasNext()) {
            it2.next().onError(i, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handlePlayComplete() {
        Iterator<IXmPlayerStatusListener> it2 = this.mPlayerStatusListeners.iterator();
        while (it2.hasNext()) {
            it2.next().onSoundPlayComplete();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handlePlayError(XmPlayerException xmPlayerException) {
        Iterator<IXmPlayerStatusListener> it2 = this.mPlayerStatusListeners.iterator();
        while (it2.hasNext()) {
            it2.next().onError(xmPlayerException);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handlePlayPause() {
        Iterator<IXmPlayerStatusListener> it2 = this.mPlayerStatusListeners.iterator();
        while (it2.hasNext()) {
            it2.next().onPlayPause();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handlePlayProgressChange(int i, int i2) {
        Iterator<IXmPlayerStatusListener> it2 = this.mPlayerStatusListeners.iterator();
        while (it2.hasNext()) {
            it2.next().onPlayProgress(i, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handlePlayStart() {
        Iterator<IXmPlayerStatusListener> it2 = this.mPlayerStatusListeners.iterator();
        while (it2.hasNext()) {
            it2.next().onPlayStart();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handlePlayStop() {
        Iterator<IXmPlayerStatusListener> it2 = this.mPlayerStatusListeners.iterator();
        while (it2.hasNext()) {
            it2.next().onPlayStop();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleSoundChange(PlayableModel playableModel, PlayableModel playableModel2) {
        this.mCurModel = playableModel2;
        Iterator<IXmPlayerStatusListener> it2 = this.mPlayerStatusListeners.iterator();
        while (it2.hasNext()) {
            it2.next().onSoundSwitch(playableModel, playableModel2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleSoundPrepared() {
        Iterator<IXmPlayerStatusListener> it2 = this.mPlayerStatusListeners.iterator();
        while (it2.hasNext()) {
            it2.next().onSoundPrepared();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleStartGetAdsInfo() {
        Iterator<IXmAdsStatusListener> it2 = this.mAdsStatusListeners.iterator();
        while (it2.hasNext()) {
            it2.next().onStartGetAdsInfo();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleStartPlayAds(Advertis advertis, int i) {
        Iterator<IXmAdsStatusListener> it2 = this.mAdsStatusListeners.iterator();
        while (it2.hasNext()) {
            it2.next().onStartPlayAds(advertis, i);
        }
    }

    private boolean isConnectedStatus() {
        IXmPlayer iXmPlayer;
        return this.mConnected && (iXmPlayer = this.mPlayerStub) != null && iXmPlayer.asBinder() != null && this.mPlayerStub.asBinder().isBinderAlive();
    }

    public static void release() {
        Logger.i(TAG, "release");
        if (sInstance != null) {
            if (sInstance.isConnectedStatus()) {
                sInstance.pause();
                sInstance.stop();
                sInstance.mAppCtx.unbindService(sInstance.mConn);
                sInstance.mBindRet = false;
            }
            sInstance.mAppCtx.stopService(XmPlayerService.getIntent(sInstance.mAppCtx));
            sInstance.mNotification = null;
            sInstance.mPlayerStatusListeners.clear();
            sInstance.mAdsStatusListeners.clear();
            sInstance.mConnectListenerSet.clear();
            sInstance.mConnectListener = null;
            sInstance.mCurModel = null;
            sInstance.mConnected = false;
            sInstance.mPlayerStub = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDefaultPageSize() throws RemoteException {
        IXmPlayer iXmPlayer;
        if (checkConnectionStatus() && (iXmPlayer = this.mPlayerStub) != null) {
            iXmPlayer.setPageSize(sPageSize);
        }
    }

    public static void setPlayerProcessRequestEnvironment(int i) {
        if (sInstance == null) {
            mEnvironment = i;
        } else if (sInstance.isConnectedStatus()) {
            try {
                sInstance.mPlayerStub.setPlayerProcessRequestEnvironment(i);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlayerProxy() throws RemoteException {
        IXmPlayer iXmPlayer = this.mPlayerStub;
        if (iXmPlayer != null) {
            iXmPlayer.setProxyNew(sHttpConfig);
        }
    }

    private PlayableModel trackToOther(Track track) {
        if (!checkConnectionStatus()) {
            return null;
        }
        int playSourceType = -1;
        try {
            playSourceType = this.mPlayerStub.getPlaySourceType();
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (track != null) {
            if (playSourceType == 2) {
                return "schedule".equals(track.getKind()) ? ModelUtil.trackToSchedule(track) : track;
            }
            if (playSourceType == 3) {
                if ("radio".equals(track.getKind())) {
                    return ModelUtil.trackToRadio(track);
                }
                if ("schedule".equals(track.getKind())) {
                    return ModelUtil.trackToSchedule(track);
                }
            }
        }
        return null;
    }

    public static void unBind() {
        Logger.i(TAG, "unBind release");
        if (sInstance != null) {
            if (sInstance.mBindRet || (sInstance.mPlayerStub != null && sInstance.mPlayerStub.asBinder() != null && sInstance.mPlayerStub.asBinder().isBinderAlive())) {
                sInstance.mAppCtx.unbindService(sInstance.mConn);
                sInstance.mBindRet = false;
            }
            sInstance.mNotification = null;
            sInstance.mPlayerStatusListeners.clear();
            sInstance.mAdsStatusListeners.clear();
            sInstance.mConnectListenerSet.clear();
            sInstance.mConnectListener = null;
            sInstance.mCurModel = null;
            sInstance.mConnected = false;
            sInstance.mPlayerStub = null;
            sInstance = null;
        }
    }

    public void addAdsStatusListener(IXmAdsStatusListener iXmAdsStatusListener) {
        if (iXmAdsStatusListener == null || this.mAdsStatusListeners.contains(iXmAdsStatusListener)) {
            return;
        }
        this.mAdsStatusListeners.add(iXmAdsStatusListener);
    }

    public void addOnConnectedListerner(IConnectListener iConnectListener) {
        this.mConnectListenerSet.add(iConnectListener);
    }

    public void addPlayerStatusListener(IXmPlayerStatusListener iXmPlayerStatusListener) {
        if (iXmPlayerStatusListener == null || this.mPlayerStatusListeners.contains(iXmPlayerStatusListener)) {
            return;
        }
        this.mPlayerStatusListeners.add(iXmPlayerStatusListener);
    }

    public void addTracksToPlayList(List<Track> list) {
        if (checkConnectionStatus()) {
            try {
                this.mPlayerStub.addPlayList(list);
            } catch (RemoteException e) {
                e.printStackTrace();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public void clearPlayCache() {
        if (isConnectedStatus()) {
            try {
                this.mPlayerStub.clearPlayCache();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void closeNotification() {
        if (isConnectedStatus()) {
            try {
                this.mPlayerStub.closeNotification();
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    public boolean containPlayerStatusListener(IXmPlayerStatusListener iXmPlayerStatusListener) {
        return this.mPlayerStatusListeners.contains(iXmPlayerStatusListener);
    }

    public void deleteWeikeTrackInPlayList(String str) {
        checkConnectionStatus();
    }

    public CommonTrackList getCommonTrackList() {
        if (!isConnectedStatus()) {
            return null;
        }
        try {
            CommonTrackList commonTrackList = new CommonTrackList();
            commonTrackList.setParams(this.mPlayerStub.getParam());
            commonTrackList.setTracks(getPlayList());
            return commonTrackList;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public String getCurPlayUrl() {
        if (!isConnectedStatus()) {
            return null;
        }
        try {
            return this.mPlayerStub.getCurPlayUrl();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public int getCurrPlayType() {
        if (!isConnectedStatus()) {
            return -1;
        }
        try {
            return this.mPlayerStub.getPlaySourceType();
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    public PlayableModel getCurrSound() {
        return getCurrSound(true);
    }

    public Track getCurrSoundIgnoreKind(boolean z) {
        if (!isConnectedStatus()) {
            return null;
        }
        PlayableModel playableModel = this.mCurModel;
        if (playableModel != null && z) {
            return (Track) playableModel;
        }
        try {
            IXmPlayer iXmPlayer = this.mPlayerStub;
            return iXmPlayer.getTrack(iXmPlayer.getCurrIndex());
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public PlayableModel getCurrWeikeSound(boolean z) {
        if (!isConnectedStatus()) {
            return null;
        }
        PlayableModel playableModel = this.mCurModel;
        try {
            IXmPlayer iXmPlayer = this.mPlayerStub;
            Track track = iXmPlayer.getTrack(iXmPlayer.getCurrIndex());
            if (track == null || !track.isWeikeTrack) {
                return null;
            }
            return track;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public int getCurrentIndex() {
        if (!isConnectedStatus()) {
            return -1;
        }
        try {
            return this.mPlayerStub.getCurrIndex();
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    public long getCurrentTrackPlayedDuration() {
        if (!checkConnectionStatus()) {
            return 0L;
        }
        try {
            return this.mPlayerStub.getCurrentTrackPlayedDuration();
        } catch (RemoteException e) {
            e.printStackTrace();
            return 0L;
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0L;
        }
    }

    public int getDuration() {
        if (!isConnectedStatus()) {
            return 0;
        }
        try {
            return this.mPlayerStub.getDuration();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public int getHistoryPos(long j) {
        if (!isConnectedStatus()) {
            return -1;
        }
        try {
            String historyPos = this.mPlayerStub.getHistoryPos(String.valueOf(j));
            if (TextUtils.isEmpty(historyPos)) {
                return -1;
            }
            Logger.log("XmPlayerManager HistoryPos result:" + historyPos);
            return Integer.parseInt(historyPos);
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    public void getNextPlayList() {
        if (isConnectedStatus()) {
            try {
                this.mPlayerStub.getNextPlayList();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public int getPlayCurrPositon() {
        if (!isConnectedStatus()) {
            return 0;
        }
        try {
            return this.mPlayerStub.getPlayCurrPosition();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public List<Track> getPlayList() {
        if (!isConnectedStatus()) {
            return null;
        }
        this.mCachedPlayList = new ArrayList();
        int i = 0;
        while (true) {
            try {
                List<Track> playList = this.mPlayerStub.getPlayList(i);
                if (playList == null) {
                    return this.mCachedPlayList;
                }
                this.mCachedPlayList.addAll(playList);
                if (playList.size() < 30) {
                    return this.mCachedPlayList;
                }
                i++;
            } catch (Exception e) {
                e.printStackTrace();
                return this.mCachedPlayList;
            }
        }
    }

    public boolean getPlayListOrder() {
        if (!isConnectedStatus()) {
            return true;
        }
        try {
            return this.mPlayerStub.getPlayListOrder();
        } catch (Exception e) {
            e.printStackTrace();
            return true;
        }
    }

    public Map<String, String> getPlayListParams() {
        if (!checkConnectionStatus()) {
            return null;
        }
        try {
            return this.mPlayerStub.getParam();
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public int getPlayListSize() {
        if (!isConnectedStatus()) {
            return 0;
        }
        try {
            return this.mPlayerStub.getPlayListSize();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public XmPlayListControl.PlayMode getPlayMode() {
        if (!isConnectedStatus()) {
            return XmPlayListControl.PlayMode.PLAY_MODEL_LIST;
        }
        try {
            return XmPlayListControl.PlayMode.valueOf(this.mPlayerStub.getPlayMode());
        } catch (Exception e) {
            e.printStackTrace();
            return XmPlayListControl.PlayMode.PLAY_MODEL_LIST;
        }
    }

    public int getPlayerStatus() {
        if (!isConnectedStatus()) {
            return 7;
        }
        try {
            return this.mPlayerStub.getPlayerStatus();
        } catch (Exception e) {
            e.printStackTrace();
            return 7;
        }
    }

    public void getPrePlayList() {
        if (isConnectedStatus()) {
            try {
                this.mPlayerStub.getPrePlayList();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public float getTempo() {
        if (!checkConnectionStatus()) {
            return 0.0f;
        }
        try {
            return this.mPlayerStub.getTempo();
        } catch (RemoteException e) {
            e.printStackTrace();
            return 0.0f;
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0.0f;
        }
    }

    public Track getTrack(int i) {
        if (!isConnectedStatus()) {
            return null;
        }
        try {
            return this.mPlayerStub.getTrack(i);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public int getVideoAdState() {
        return this.mVideoAdState;
    }

    public boolean hasNextPlayList() {
        if (!isConnectedStatus()) {
            return false;
        }
        try {
            return this.mPlayerStub.haveNextPlayList();
        } catch (RemoteException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean hasNextSound() {
        if (!isConnectedStatus()) {
            return false;
        }
        try {
            return this.mPlayerStub.hasNextSound();
        } catch (Exception e) {
            e.printStackTrace();
            return true;
        }
    }

    public boolean hasPrePlayList() {
        if (!isConnectedStatus()) {
            return false;
        }
        try {
            return this.mPlayerStub.havePrePlayList();
        } catch (RemoteException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean hasPreSound() {
        if (!isConnectedStatus()) {
            return false;
        }
        try {
            return this.mPlayerStub.hasPreSound();
        } catch (Exception e) {
            e.printStackTrace();
            return true;
        }
    }

    public void init() {
        init(false);
    }

    public void insertTracksToPlayListHead(List<Track> list) {
        if (checkConnectionStatus()) {
            try {
                this.mPlayerStub.insertPlayListHead(list);
            } catch (RemoteException e) {
                e.printStackTrace();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public boolean isAdPlaying() {
        if (!isConnectedStatus()) {
            return false;
        }
        try {
            if (this.mVideoAdState == 2) {
                return true;
            }
            return this.mPlayerStub.isAdPlaying();
        } catch (RemoteException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isAdsActive() {
        if (!isConnectedStatus()) {
            return false;
        }
        try {
            int i = this.mVideoAdState;
            if (i != 2 && i != 0) {
                return this.mPlayerStub.isAdsActive();
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isBuffering() {
        if (!isConnectedStatus()) {
            return false;
        }
        try {
            return this.mPlayerStub.isBuffering();
        } catch (RemoteException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isConnected() {
        return this.mConnected;
    }

    public boolean isDLNAState() {
        if (!isConnectedStatus()) {
            return false;
        }
        try {
            return this.mPlayerStub.isDLNAState();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isLoading() {
        if (!checkConnectionStatus()) {
            return false;
        }
        try {
            int i = this.mVideoAdState;
            if (i != 2 && i != 3) {
                return this.mPlayerStub.isLoading();
            }
            return false;
        } catch (RemoteException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isOnlineSource() {
        if (!isConnectedStatus()) {
            return false;
        }
        try {
            return this.mPlayerStub.isOnlineSource();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isPlaying() {
        if (!isConnectedStatus()) {
            return false;
        }
        try {
            if (this.mVideoAdState == 2) {
                return true;
            }
            return this.mPlayerStub.isPlaying();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void needContinuePlay(boolean z) {
        if (isConnectedStatus()) {
            try {
                this.mPlayerStub.needContinuePlay(z);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void notifiyConfigChange() {
        if (isConnectedStatus()) {
            try {
                this.mPlayerStub.notifyConfigChange();
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    public void pause() {
        if (checkConnectionStatus()) {
            try {
                if (this.mVideoAdState == 2) {
                    LocalBroadcastManager.getInstance(this.mAppCtx).sendBroadcast(new Intent(PlayerConstants.ACTION_PAUSE_VIDEO_AD));
                } else {
                    this.mPlayerStub.pausePlay();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void pausePlayInMillis(long j) {
        if (checkConnectionStatus()) {
            try {
                this.mPlayerStub.pausePlayInMillis(j);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public boolean permutePlayList() {
        if (!checkConnectionStatus()) {
            return false;
        }
        try {
            return this.mPlayerStub.permutePlayList();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void play() {
        if (checkConnectionStatus()) {
            try {
                if (this.mVideoAdState == 3) {
                    LocalBroadcastManager.getInstance(this.mAppCtx).sendBroadcast(new Intent(PlayerConstants.ACTION_PLAY_VIDEO_AD));
                } else {
                    this.mPlayerStub.startPlay();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public boolean playActivityRadio(Radio radio) {
        if (!checkConnectionStatus() || radio == null) {
            return false;
        }
        CommonTrackList commonTrackList = new CommonTrackList();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ModelUtil.radioToTrack(radio, true));
        commonTrackList.setTracks(arrayList);
        commonTrackList.setTotalCount(1);
        commonTrackList.setTotalPage(1);
        playList(commonTrackList, 0);
        return true;
    }

    public void playList(List<Track> list, int i) {
        if (checkConnectionStatus()) {
            if (list == null || list.size() == 0) {
                Logger.i(TAG, "Empty TrackList");
            } else {
                setPlayList(null, list, i, true);
            }
        }
    }

    public void playLiveRadioForSDK(final Radio radio, int i, final int i2) {
        if (checkConnectionStatus() && radio != null) {
            HashMap map = new HashMap();
            map.put("radio_id", radio.getDataId() + "");
            if (i >= 0) {
                map.put(DTransferConstants.WEEKDAY, i + "");
            }
            final boolean z = i == Calendar.getInstance().get(7) - 1;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yy:MM:dd");
            Calendar calendar = Calendar.getInstance();
            if (i >= 0) {
                calendar.set(7, i + 1);
            }
            final String str = simpleDateFormat.format(calendar.getTime());
            CommonRequest.getSchedules(map, new IDataCallBack<ScheduleList>() { // from class: com.ximalaya.ting.android.opensdk.player.XmPlayerManager.7
                @Override // com.ximalaya.ting.android.opensdk.datatrasfer.IDataCallBack
                public void onError(int i3, String str2) {
                }

                @Override // com.ximalaya.ting.android.opensdk.datatrasfer.IDataCallBack
                public void onSuccess(ScheduleList scheduleList) {
                    if (XmPlayerManager.this.checkConnectionStatus() && scheduleList != null) {
                        ArrayList arrayList = new ArrayList();
                        if (scheduleList.getmScheduleList() == null || scheduleList.getmScheduleList().isEmpty()) {
                            Schedule scheduleRadioToSchedule = ModelUtil.radioToSchedule(radio);
                            if (scheduleRadioToSchedule == null) {
                                return;
                            }
                            arrayList.add(scheduleRadioToSchedule);
                            XmPlayerManager.this.playSchedule(arrayList, -1);
                            return;
                        }
                        List<Schedule> list = scheduleList.getmScheduleList();
                        for (Schedule schedule : list) {
                            schedule.setStartTime(str + ":" + schedule.getStartTime());
                            schedule.setEndTime(str + ":" + schedule.getEndTime());
                            Program relatedProgram = schedule.getRelatedProgram();
                            if (relatedProgram == null) {
                                relatedProgram = new Program();
                                schedule.setRelatedProgram(relatedProgram);
                            }
                            relatedProgram.setBackPicUrl(radio.getCoverUrlLarge());
                            schedule.setRadioId(radio.getDataId());
                            schedule.setRadioName(radio.getRadioName());
                            schedule.setRadioPlayCount(radio.getRadioPlayCount());
                            if (z) {
                                if (BaseUtil.isInTime(schedule.getStartTime() + Constants.ACCEPT_TIME_SEPARATOR_SERVER + schedule.getEndTime()) == 0) {
                                    relatedProgram.setRate24AacUrl(radio.getRate24AacUrl());
                                    relatedProgram.setRate24TsUrl(radio.getRate24TsUrl());
                                    relatedProgram.setRate64AacUrl(radio.getRate64AacUrl());
                                    relatedProgram.setRate64TsUrl(radio.getRate64TsUrl());
                                    break;
                                }
                            }
                        }
                        XmPlayerManager.this.playSchedule(list, i2);
                    }
                }
            });
        }
    }

    public void playNext() {
        if (checkConnectionStatus()) {
            try {
                this.mPlayerStub.playNext();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void playPre() {
        if (checkConnectionStatus()) {
            try {
                this.mPlayerStub.playPre();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public boolean playRadio(Radio radio) {
        if (!checkConnectionStatus() || radio == null) {
            return false;
        }
        CommonTrackList commonTrackList = new CommonTrackList();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ModelUtil.radioToTrack(radio, false));
        commonTrackList.setTracks(arrayList);
        commonTrackList.setTotalCount(1);
        commonTrackList.setTotalPage(1);
        playList(commonTrackList, 0);
        return true;
    }

    public void playRewardVideoSuccess() {
        try {
            Track track = this.backCurTrack;
            if (track == null || track.getDataId() == 0) {
                return;
            }
            this.mPlayerStub.playRewardVideoAdSuccess(this.backCurTrack.getDataId());
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public boolean playSchedule(List<Schedule> list, int i) {
        if (!checkConnectionStatus() || list == null) {
            return false;
        }
        try {
            this.mPlayerStub.setPlayList(null, ModelUtil.toTrackList(list));
            if (i == -1) {
                for (int i2 = 0; i2 < list.size(); i2++) {
                    if (BaseUtil.isInTime(list.get(i2).getStartTime() + Constants.ACCEPT_TIME_SEPARATOR_SERVER + list.get(i2).getEndTime()) == 0) {
                        i = i2;
                        break;
                    }
                }
            }
            this.mPlayerStub.play(i);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void playXimaAdudioInPrivateWifi(List<Track> list, int i) {
        if (checkConnectionStatus()) {
            if (list == null || list.size() == 0) {
                Logger.i(TAG, "Empty TrackList");
                return;
            }
            Iterator<Track> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().setType(Track.TYPE_LOCAL_SERVER);
            }
            setPlayList(null, list, i, true);
        }
    }

    public void removeAdsStatusListener(IXmAdsStatusListener iXmAdsStatusListener) {
        List<IXmAdsStatusListener> list;
        if (iXmAdsStatusListener == null || (list = this.mAdsStatusListeners) == null) {
            return;
        }
        list.remove(iXmAdsStatusListener);
    }

    public void removeListByIndex(int i) {
        if (isConnectedStatus()) {
            try {
                this.mPlayerStub.removeListByIndex(i);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void removeOnConnectedListerner(IConnectListener iConnectListener) {
        this.mConnectListenerSet.remove(iConnectListener);
    }

    public void removePlayerStatusListener(IXmPlayerStatusListener iXmPlayerStatusListener) {
        List<IXmPlayerStatusListener> list;
        if (iXmPlayerStatusListener == null || (list = this.mPlayerStatusListeners) == null) {
            return;
        }
        list.remove(iXmPlayerStatusListener);
    }

    public void requestSoundAd() {
        if (isConnectedStatus()) {
            try {
                this.mPlayerStub.requestSoundAd();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void resetPlayList() {
        if (isConnectedStatus()) {
            try {
                this.mPlayerStub.resetPlayList();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void resetPlayer() {
        if (checkConnectionStatus()) {
            try {
                this.mPlayerStub.resetPlayer();
            } catch (RemoteException e) {
                e.printStackTrace();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public void seekTo(int i) {
        if (checkConnectionStatus()) {
            try {
                int i2 = this.mVideoAdState;
                if (i2 != 1 && i2 != 2 && i2 != 3) {
                    this.mPlayerStub.seekTo(i);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void seekToByPercent(float f) {
        seekTo((int) (getDuration() * f));
    }

    public void setAutoLoadPageSizeInner(int i) {
        IXmPlayer iXmPlayer;
        if (sPageSize == i) {
            return;
        }
        sPageSize = i;
        try {
            if (!this.mConnected || (iXmPlayer = this.mPlayerStub) == null || iXmPlayer.asBinder() == null || !this.mPlayerStub.asBinder().isBinderAlive()) {
                return;
            }
            setDefaultPageSize();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setBreakpointResume(boolean z) {
        this.breakpointResume = z;
        if (isConnectedStatus()) {
            try {
                this.mPlayerStub.setBreakpointResume(z);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    public void setCdnConfigModel(CdnConfigModel cdnConfigModel) {
        if (isConnectedStatus()) {
            try {
                this.mPlayerStub.setPlayCdnConfigureModel(cdnConfigModel);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void setCommonBusinessHandle(IXmCommonBusinessHandle iXmCommonBusinessHandle) {
        this.mIXmCommonBusinessHandle = iXmCommonBusinessHandle;
    }

    public void setDLNAState(boolean z) {
        if (isConnectedStatus()) {
            try {
                this.mPlayerStub.setDLNAState(z);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void setHistoryPos(long j, int i) {
        if (isConnectedStatus()) {
            try {
                this.mPlayerStub.setHistoryPosById(j, i);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void setHttpConfig(Config config) {
        sHttpConfig = config;
        if (isConnectedStatus()) {
            try {
                setPlayerProxy();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void setNotificationForNoCrash(int i, Notification notification) {
        this.mNotificationIdForNoCrash = i;
        this.mNotificationForNoCrash = notification;
        if (checkConnectionStatus()) {
            try {
                this.mPlayerStub.setNotificationForNoCrash(this.mNotificationId, this.mNotificationForNoCrash);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Deprecated
    public void setOnConnectedListerner(IConnectListener iConnectListener) {
        this.mConnectListener = iConnectListener;
    }

    public void setPlayList(List<Track> list, int i) {
        if (!checkConnectionStatus() || list == null || list.size() == 0) {
            return;
        }
        setPlayList(null, list, i, false);
    }

    public void setPlayListChangeListener(IXmDataCallback iXmDataCallback) {
        this.mDataCallback = iXmDataCallback;
    }

    public void setPlayMode(XmPlayListControl.PlayMode playMode) {
        if (checkConnectionStatus()) {
            try {
                this.mPlayerStub.setPlayMode(playMode.toString());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void setRecordModel(RecordModel recordModel) {
        if (isConnectedStatus()) {
            try {
                this.mPlayerStub.setRecordModel(recordModel);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void setSoundTouchAllParams(float f, float f2, float f3) {
        if (checkConnectionStatus()) {
            try {
                Logger.log("setSoundTouchAllParams1 tempo:" + f + " pitch:" + f2 + " rate:" + f3);
                this.mPlayerStub.setSoundTouchAllParams(f, f2, f3);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void setTempo(float f) {
        setSoundTouchAllParams(f, 0.0f, 1.0f);
    }

    public void setTokenInvalidForSDK(CommonRequest.ITokenStateChange iTokenStateChange) {
        if (isConnectedStatus()) {
            try {
                if (iTokenStateChange != null) {
                    this.mPlayerStub.setTokenInvalidForSDK(this.mTokenInvalidForSDKCallBackStub);
                } else {
                    this.mPlayerStub.setTokenInvalidForSDK(null);
                }
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    public void setTokenToPlayForSDK(AccessToken accessToken) {
        if (!isConnectedStatus()) {
            this.mAccessToken = accessToken;
            return;
        }
        try {
            this.mPlayerStub.setTokenToPlayForSDK(accessToken);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void setVideoAdState(int i) {
        this.mVideoAdState = i;
    }

    public void setVolume(float f, float f2) {
        if (checkConnectionStatus()) {
            try {
                this.mPlayerStub.setVolume(f, f2);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void stop() {
        if (checkConnectionStatus()) {
            try {
                this.mPlayerStub.stopPlay();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void updateHistoryPosInList(List<? extends Track> list) {
        int i;
        if (!isConnectedStatus() || list == null || list.isEmpty()) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        Iterator<? extends Track> it2 = list.iterator();
        boolean z = true;
        while (true) {
            i = 0;
            if (!it2.hasNext()) {
                try {
                    break;
                } catch (Exception e) {
                    e.printStackTrace();
                    return;
                }
            } else {
                Track next = it2.next();
                if (z) {
                    z = false;
                } else {
                    sb.append(",");
                }
                sb.append(next.getDataId());
            }
        }
        String historyPos = this.mPlayerStub.getHistoryPos(sb.toString());
        if (TextUtils.isEmpty(historyPos)) {
            return;
        }
        String[] strArrSplit = historyPos.split(",");
        if (strArrSplit.length != list.size()) {
            if (ConstantsOpenSdk.isDebug) {
                throw new RuntimeException("track list not equal length with callback data length");
            }
            return;
        }
        Iterator<? extends Track> it3 = list.iterator();
        while (it3.hasNext()) {
            it3.next().setLastPlayedMills(Integer.parseInt(strArrSplit[i]));
            i++;
        }
        Logger.log("HistoryPos result:" + historyPos);
    }

    public void updateTrackDownloadUrlInPlayList(Track track) {
        if (checkConnectionStatus()) {
            try {
                this.mPlayerStub.updateTrackDownloadUrlInPlayList(track);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void updateTrackInPlayList(Track track) {
        if (isConnectedStatus()) {
            try {
                if (this.mPlayerStub.updateTrackInPlayList(track)) {
                    this.mCurModel = null;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void init(boolean z) {
        try {
            if (this.mAppCtx.getApplicationInfo().targetSdkVersion < 26 || Build.VERSION.SDK_INT < 26) {
                Context context = this.mAppCtx;
                context.startService(XmPlayerService.getIntent(context));
            } else {
                try {
                    Context context2 = this.mAppCtx;
                    context2.startService(XmPlayerService.getIntent(context2));
                } catch (Exception e) {
                    if (!z) {
                        Intent intent = XmPlayerService.getIntent(this.mAppCtx);
                        intent.putExtra(XmPlayerService.FLAG_MUST_TO_SHOW_NOTIFICATION, true);
                        this.mAppCtx.startForegroundService(intent);
                    }
                    e.printStackTrace();
                }
            }
            Context context3 = this.mAppCtx;
            this.mBindRet = context3.bindService(XmPlayerService.getIntent(context3), this.mConn, 1);
            Logger.i(TAG, "Bind ret " + this.mBindRet);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public PlayableModel getCurrSound(boolean z) {
        if (!isConnectedStatus()) {
            return null;
        }
        PlayableModel playableModel = this.mCurModel;
        if (playableModel != null && z) {
            return trackToOther((Track) playableModel);
        }
        try {
            IXmPlayer iXmPlayer = this.mPlayerStub;
            return trackToOther(iXmPlayer.getTrack(iXmPlayer.getCurrIndex()));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void setPlayList(CommonTrackList commonTrackList, int i) {
        if (!checkConnectionStatus() || commonTrackList == null || commonTrackList.getTracks() == null || commonTrackList.getTracks().size() == 0) {
            return;
        }
        setPlayList(commonTrackList.getParams(), commonTrackList.getTracks(), i, false);
    }

    public void playList(CommonTrackList commonTrackList, int i) {
        if (!checkConnectionStatus() || commonTrackList == null || commonTrackList.getTracks() == null || commonTrackList.getTracks().size() == 0) {
            return;
        }
        setPlayList(commonTrackList.getParams(), commonTrackList.getTracks(), i, true);
    }

    public void play(int i) {
        if (checkConnectionStatus()) {
            try {
                this.mPlayerStub.play(i);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void setPlayList(Map<String, String> map, List<Track> list, int i, boolean z) {
        if (checkConnectionStatus() && list != null) {
            try {
                int size = list.size();
                if (size < 30) {
                    this.mPlayerStub.setPlayList(map, list);
                } else {
                    for (int i2 = 0; i2 < size / 30; i2++) {
                        if (i2 == 0) {
                            this.mPlayerStub.setPlayList(map, list.subList(i2 * 30, (i2 + 1) * 30));
                        } else {
                            this.mPlayerStub.addPlayList(list.subList(i2 * 30, (i2 + 1) * 30));
                        }
                    }
                    int i3 = size % 30;
                    if (i3 != 0) {
                        int i4 = 30 * (size / 30);
                        this.mPlayerStub.addPlayList(list.subList(i4, i3 + i4));
                    }
                }
                if (z) {
                    this.mPlayerStub.play(i);
                } else {
                    this.mPlayerStub.setPlayIndex(i);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void init(int i, Notification notification) {
        init(i, notification, false);
    }

    private void init(int i, Notification notification, boolean z) {
        IXmPlayer iXmPlayer;
        this.mNotificationId = i;
        this.mNotification = notification;
        Logger.logToSd("XmPlayerManager inited");
        init(z);
        if (!this.mConnected || (iXmPlayer = this.mPlayerStub) == null || iXmPlayer.asBinder() == null || !this.mPlayerStub.asBinder().isBinderAlive()) {
            return;
        }
        try {
            this.mPlayerStub.setNotification(this.mNotificationId, this.mNotification);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
