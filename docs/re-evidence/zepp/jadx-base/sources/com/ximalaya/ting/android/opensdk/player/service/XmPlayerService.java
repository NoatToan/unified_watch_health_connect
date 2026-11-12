package com.ximalaya.ting.android.opensdk.player.service;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Binder;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.PowerManager;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.text.TextUtils;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.huami.moving.ui.animator.AnimatorViewWrapper;
import com.huami.sleep.sleephome.ui.SleepHomeActivity;
import com.huami.sleepassistant.apilib.utils.WebConst;
import com.ximalaya.ting.android.opensdk.constants.ConstantsOpenSdk;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import com.ximalaya.ting.android.opensdk.constants.PreferenceConstantsInOpenSdk;
import com.ximalaya.ting.android.opensdk.datatrasfer.AccessTokenManager;
import com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest;
import com.ximalaya.ting.android.opensdk.datatrasfer.IDataCallBack;
import com.ximalaya.ting.android.opensdk.datatrasfer.IDeviceInfoProvider;
import com.ximalaya.ting.android.opensdk.httputil.BaseCall;
import com.ximalaya.ting.android.opensdk.httputil.Config;
import com.ximalaya.ting.android.opensdk.httputil.HttpDNSUtilForOpenSDK;
import com.ximalaya.ting.android.opensdk.httputil.HttpUrlUtil;
import com.ximalaya.ting.android.opensdk.httputil.IDataSupportCallBack;
import com.ximalaya.ting.android.opensdk.httputil.XmSecretKeyUtil;
import com.ximalaya.ting.android.opensdk.httputil.util.freeflow.FreeFlowServiceUtil;
import com.ximalaya.ting.android.opensdk.model.PlayableModel;
import com.ximalaya.ting.android.opensdk.model.advertis.Advertis;
import com.ximalaya.ting.android.opensdk.model.advertis.AdvertisList;
import com.ximalaya.ting.android.opensdk.model.album.Album;
import com.ximalaya.ting.android.opensdk.model.album.AlbumList;
import com.ximalaya.ting.android.opensdk.model.album.SearchAlbumList;
import com.ximalaya.ting.android.opensdk.model.category.Category;
import com.ximalaya.ting.android.opensdk.model.category.CategoryList;
import com.ximalaya.ting.android.opensdk.model.category.CategoryModel;
import com.ximalaya.ting.android.opensdk.model.live.radio.Radio;
import com.ximalaya.ting.android.opensdk.model.live.schedule.Schedule;
import com.ximalaya.ting.android.opensdk.model.statistic.RecordModel;
import com.ximalaya.ting.android.opensdk.model.token.AccessToken;
import com.ximalaya.ting.android.opensdk.model.track.CommonTrackList;
import com.ximalaya.ting.android.opensdk.model.track.LastPlayTrackList;
import com.ximalaya.ting.android.opensdk.model.track.SearchTrackList;
import com.ximalaya.ting.android.opensdk.model.track.Track;
import com.ximalaya.ting.android.opensdk.model.track.TrackBaseInfo;
import com.ximalaya.ting.android.opensdk.model.track.TrackHotList;
import com.ximalaya.ting.android.opensdk.model.track.TrackList;
import com.ximalaya.ting.android.opensdk.model.xdcs.CdnConfigModel;
import com.ximalaya.ting.android.opensdk.model.xdcs.StatToServerFactoryImplForOpen;
import com.ximalaya.ting.android.opensdk.player.XmPlayerManager;
import com.ximalaya.ting.android.opensdk.player.XmPlayerManagerForPlayer;
import com.ximalaya.ting.android.opensdk.player.advertis.IXmAdsStatusListener;
import com.ximalaya.ting.android.opensdk.player.advertis.OpenSdkAdsDataHandler;
import com.ximalaya.ting.android.opensdk.player.advertis.XmAdsManager;
import com.ximalaya.ting.android.opensdk.player.appnotification.NotificationColorUtils;
import com.ximalaya.ting.android.opensdk.player.appnotification.XmNotificationCreater;
import com.ximalaya.ting.android.opensdk.player.appwidget.WidgetProvider;
import com.ximalaya.ting.android.opensdk.player.mediacontrol.MediaControlManager;
import com.ximalaya.ting.android.opensdk.player.statistic.XmStatisticsManager;
import com.ximalaya.ting.android.opensdk.util.BaseUtil;
import com.ximalaya.ting.android.opensdk.util.DigestUtils;
import com.ximalaya.ting.android.opensdk.util.FileUtilBase;
import com.ximalaya.ting.android.opensdk.util.Logger;
import com.ximalaya.ting.android.opensdk.util.ModelUtil;
import com.ximalaya.ting.android.opensdk.util.MyAsyncTask;
import com.ximalaya.ting.android.opensdk.util.NetworkType;
import com.ximalaya.ting.android.opensdk.util.OnPlayErrorRetryUtilForPlayProcess;
import com.ximalaya.ting.android.opensdk.util.SharedPreferencesUtil;
import com.ximalaya.ting.android.player.DownloadThread;
import com.ximalaya.ting.android.player.IDomainServerIpCallback;
import com.ximalaya.ting.android.player.MediadataCrytoUtil;
import com.ximalaya.ting.android.player.PlayCacheByLRU;
import com.ximalaya.ting.android.player.PlayerUtil;
import com.ximalaya.ting.android.player.StaticConfig;
import com.ximalaya.ting.android.player.XMediaPlayer;
import com.ximalaya.ting.android.player.XMediaPlayerConstants;
import com.ximalaya.ting.android.player.cdn.CdnConstants;
import com.ximalaya.ting.android.player.cdn.CdnUtil;
import com.ximalaya.ting.android.player.xdcs.IStatToServerFactory;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes22.dex */
public class XmPlayerService extends Service {
    private static final int CODEERR = 404;
    private static final int CODE_ALBUM_INFO = 101;
    private static final int CODE_ATTENTION_ALBUM = 107;
    private static final int CODE_COLLECT_ALBUM = 100;
    public static final int CODE_DATA_CHANGE_LOGIN_INOROUT = 116;
    public static final int CODE_GET_ALBUMS_BY_CATEGORY_ID_AND_TAG = 129;
    public static final int CODE_GET_CATEGORIES_LIST = 128;
    public static final int CODE_GET_NEW_ALBUM_RANK = 132;
    public static final int CODE_GET_NEW_TRACK_RANK = 133;
    public static final int CODE_GET_PARSE_DEVICE_INFO = 117;
    public static final int CODE_GET_PROVINCES = 125;
    public static final int CODE_GET_RADIO_LIST = 126;
    public static final int CODE_GET_RADIO_SCHEDULES = 127;
    public static final int CODE_GET_RECOMMEND_ALBUMLIST_BY_ALBUMID = 123;
    public static final int CODE_GET_RECOMMEND_ALBUMLIST_BY_TRACKID = 124;
    public static final int CODE_GET_SPECIALLISTEN = 119;
    public static final int CODE_GET_SUBJECTDETAIL = 120;
    public static final int CODE_GET_SUGGEST_ALBUMS = 118;
    public static final int CODE_GET_TAGS_BY_CATEGORY_ID = 130;
    public static final int CODE_GET_TRACKLIST_BYTRACKIDATALBUM = 122;
    public static final int CODE_GET_TRACK_DETAIL_INFO = 131;
    public static final int CODE_HOT_ALBUM = 115;
    public static final int CODE_HOT_TRACK = 105;
    private static final int CODE_RANK_ALBUM = 103;
    private static final int CODE_RANK_ANCHOR = 104;
    private static final int CODE_RANK_TRACK = 102;
    public static final int CODE_SUBSCRIBE_ALBUM = 121;
    private static final int CODE_USER_INFO = 106;
    private static final String COMMREQUSTM_METHOD_NAME = "getStringByUrlForOpenSDK";
    private static final int COMPLETE_OFFSET = 1000;
    private static final int DEFUALT_NOTIFATION_ID = 10002;
    public static final String FLAG_MUST_TO_SHOW_NOTIFICATION = "flag_must_to_show_notification";
    public static final int LOCAL_RADIO = 0;
    public static final int NATIONAL_RADIO = 1;
    public static final int NET_RADIO = 3;
    private static final String OPENSDK_GETALBUMDATA = "openSDK_getAlbumData";
    private static final String OPENSDK_GETATTENTIONALBUMLIST = "openSDK_getAttentionAlbumList";
    public static final String OPENSDK_GETHOTTRACK = "openSDK_recommentTrack";
    public static final String OPENSDK_GETRANKALBUMLIST = "openSDK_getRankAlbumList";
    public static final String OPENSDK_GETRANKANCHORLIST = "openSDK_getRankAnchorList";
    private static final String OPENSDK_GETSUBSCRIBEALBUMLIST = "openSDK_getSubscribtAlbumList";
    public static final String OPENSDK_GETUSERINFO = "openSDK_getUserInfo";
    public static final String OPENSDK_GET_ALBUMS_BY_CATEGORY_ID_AND_TAG = "opensdk_get_albums_by_category_id_and_tag";
    public static final String OPENSDK_GET_CATEGORIES_LIST = "opensdk_get_categories_list";
    public static final String OPENSDK_GET_HOT_ALBUM = "openSDK_recommentAlbum";
    public static final String OPENSDK_GET_NEW_RANK_ALBUM = "openSDK_getNewRankAlbum";
    public static final String OPENSDK_GET_NEW_RANK_TRACK = "openSDK_getNewRankTrack";
    public static final String OPENSDK_GET_PARSE_DEVICE_INFO = "opensdk_get_parse_device_info";
    public static final String OPENSDK_GET_PROVINCES = "opensdk_get_provinces";
    public static final String OPENSDK_GET_RADIO_LIST = "opensdk_get_radio_list";
    public static final String OPENSDK_GET_RADIO_SCHEDULES = "opensdk_get_radio_schedules";
    public static final String OPENSDK_GET_RANK_TRACK = "openSDK_getRankList";
    public static final String OPENSDK_GET_RECOMMEND_ALBUMLIST_BY_ALBUMID = "opensdk_get_recommend_albumlist_by_albumid";
    public static final String OPENSDK_GET_RECOMMEND_ALBUMLIST_BY_TRACKID = "opensdk_get_recommend_albumlist_by_trackid";
    public static final String OPENSDK_GET_SPECIALLISTEN = "opensdk_get_speciallisten";
    public static final String OPENSDK_GET_SUBJECTDETAIL = "opensdk_get_subjectdetail";
    public static final String OPENSDK_GET_SUGGEST_ALBUMS = "opensdk_get_suggest_albums";
    public static final String OPENSDK_GET_TAGS_BY_CATEGORY_ID = "opensdk_get_tags_by_category_id";
    public static final String OPENSDK_GET_TRACKLIST_BYTRACKIDATALBUM = "opensdk_get_tracklist_bytrackidatalbum";
    public static final String OPENSDK_GET_TRACK_INFO = "openSDK_getTrackInfoDetail";
    public static final String OPENSDK_SUBSCRIBE_ALBUM = "opensdk_subscribe_album";
    public static final int PLAN_NORMAL = 0;
    public static final int PLAN_PAUSE_ON_COMPLETE = -1;
    public static final int PROVINCE_RADIO = 2;
    private static final String TAG = "XmPlayerService";
    private static final String TEMP = ".downtemp";
    public static final int TYPE_HOT_ALBUM = 2;
    public static final int TYPE_HOT_TRACK = 1;
    public static final String TYPE_RANK_ALBUM = "album";
    public static final String TYPE_RANK_ANCHOR = "anchor";
    public static final String TYPE_RANK_TRACK = "track";
    public static boolean isHtcu20 = false;
    private static Service mService;
    private XmAdsManager mAdsManager;
    private Context mAppCtx;
    private String mAppSecret;
    private Runnable mCheckIsPauseTimeRunnable;
    public Config mConfig;
    private IDomainServerIpCallback mIDomainServerIpCallback;
    private IStatToServerFactory mIStatToServerFactory;
    private IXmCommonBusinessDispatcher mIXmCommonBusinessDispatcher;
    private int mLastDuration;
    private PlayableModel mLastModel;
    public XmPlayListControl mListControl;
    private MediaControlManager mMediaControlManager;
    private Notification mNotification;
    private int mNotificationId;
    private int mNotificationIdNoCrash;
    private NotificationManager mNotificationManager;
    private Notification mNotificationNoCrash;
    private XMediaPlayer.OnPlayDataOutputListener mOnPlayDataOutputListener;
    private SharedPreferences mPlayHistory;
    private SharedPreferences mPlayLastPlayTrackInAlbum;
    private XmAdsManager.IPlayStartCallBack mPlayStartCallBack;
    private XmPlayerAudioFocusControl mPlayerAudioFocusControl;
    private XmPlayerConfig mPlayerConfig;
    private XmPlayerControl mPlayerControl;
    private XmPlayerImpl mPlayerImpl;
    private XmStatisticsManager mStatisticsManager;
    private Handler mTimeHandler;
    private WidgetProvider provider;
    private long trackId;
    private RemoteCallbackList<IXmPlayerEventDispatcher> mPlayerDispatcher = new MyRemoteCallbackList();
    private RemoteCallbackList<IXmCustomDataCallBack> mCustomDataCallBack = new MyRemoteCallbackList();
    private RemoteCallbackList<IXmAdsEventDispatcher> mAdsDispatcher = new MyRemoteCallbackList();
    private RemoteCallbackList<IXmMainDataSupportDataCallback> mMainDataSupportCallbackList = new MyRemoteCallbackList();
    private boolean isDLNAState = false;
    private boolean isContinuePlay = false;
    private int c = 0;
    private boolean hasInitNotification = false;
    private boolean resetListed = false;
    private HashSet<Long> playIdList = new HashSet<>();
    private boolean isPlayAdSuccess = false;
    private IXmPlayerStatusListener mPlayerStatusListener = new IXmPlayerStatusListener() { // from class: com.ximalaya.ting.android.opensdk.player.service.XmPlayerService.1
        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayerStatusListener
        public void onBufferProgress(int i) {
            synchronized (XmPlayerService.class) {
                int iBeginBroadcast = XmPlayerService.this.mPlayerDispatcher.beginBroadcast();
                for (int i2 = 0; i2 < iBeginBroadcast; i2++) {
                    try {
                        ((IXmPlayerEventDispatcher) XmPlayerService.this.mPlayerDispatcher.getBroadcastItem(i2)).onBufferProgress(i);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                XmPlayerService.this.mPlayerDispatcher.finishBroadcast();
                XmPlayerService.this.mStatisticsManager.stuckStatistics(i, XmPlayerService.this.mPlayerControl.getDuration(), XmPlayerService.this.mPlayerControl.getCurrentPos());
            }
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayerStatusListener
        public void onBufferingStart() {
            XmPlayerService.this.startCheckIsPauseTime();
            synchronized (XmPlayerService.class) {
                int iBeginBroadcast = XmPlayerService.this.mPlayerDispatcher.beginBroadcast();
                for (int i = 0; i < iBeginBroadcast; i++) {
                    try {
                        ((IXmPlayerEventDispatcher) XmPlayerService.this.mPlayerDispatcher.getBroadcastItem(i)).onBufferingStart();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                XmPlayerService.this.mPlayerDispatcher.finishBroadcast();
            }
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayerStatusListener
        public void onBufferingStop() {
            synchronized (XmPlayerService.class) {
                int iBeginBroadcast = XmPlayerService.this.mPlayerDispatcher.beginBroadcast();
                for (int i = 0; i < iBeginBroadcast; i++) {
                    try {
                        ((IXmPlayerEventDispatcher) XmPlayerService.this.mPlayerDispatcher.getBroadcastItem(i)).onBufferingStop();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                XmPlayerService.this.mPlayerDispatcher.finishBroadcast();
            }
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayerStatusListener
        public boolean onError(XmPlayerException xmPlayerException) {
            Logger.logToSd("onError XmPlayerService 475:" + System.currentTimeMillis());
            if ((XmPlayerService.this.mPlayerControl != null && !XmPlayerService.this.mPlayerControl.isShoudPlay()) || !OnPlayErrorRetryUtilForPlayProcess.onPlayError(xmPlayerException)) {
                synchronized (XmPlayerService.class) {
                    XmNotificationCreater.getInstanse(XmPlayerService.this.mAppCtx).updateViewStateAtPause(XmPlayerService.this.mNotificationManager, XmPlayerService.this.mNotification, XmPlayerService.this.mNotificationId, NotificationColorUtils.isDarkNotificationBar(XmPlayerService.this.mAppCtx));
                    int iBeginBroadcast = XmPlayerService.this.mPlayerDispatcher.beginBroadcast();
                    for (int i = 0; i < iBeginBroadcast; i++) {
                        try {
                            ((IXmPlayerEventDispatcher) XmPlayerService.this.mPlayerDispatcher.getBroadcastItem(i)).onError(xmPlayerException);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    XmPlayerService.this.mPlayerDispatcher.finishBroadcast();
                }
                XmPlayerService.this.mMediaControlManager.stopPlay();
                if (XmPlayerService.this.mPlayerControl != null) {
                    XmPlayerService.this.mPlayerControl.resetMediaPlayer();
                }
            }
            return false;
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayerStatusListener
        public void onPlayPause() {
            Logger.logToSd("onPlayPause XmPlayerService 393:" + System.currentTimeMillis());
            synchronized (XmPlayerService.class) {
                int iBeginBroadcast = XmPlayerService.this.mPlayerDispatcher.beginBroadcast();
                for (int i = 0; i < iBeginBroadcast; i++) {
                    try {
                        ((IXmPlayerEventDispatcher) XmPlayerService.this.mPlayerDispatcher.getBroadcastItem(i)).onPlayPause();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                XmPlayerService.this.mPlayerDispatcher.finishBroadcast();
            }
            Logger.logToSd("xmplayerservice onPlayPause" + new Date());
            XmNotificationCreater.getInstanse(XmPlayerService.this.mAppCtx).updateViewStateAtPause(XmPlayerService.this.mNotificationManager, XmPlayerService.this.mNotification, XmPlayerService.this.mNotificationId, NotificationColorUtils.isDarkNotificationBar(XmPlayerService.this.mAppCtx));
            XmPlayerService.this.sendPlayerPauseBroadCast();
            XmPlayerService.this.mMediaControlManager.pausePlay();
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayerStatusListener
        public void onPlayProgress(int i, int i2) {
            synchronized (XmPlayerService.class) {
                PlayableModel currentPlayableModel = XmPlayerService.this.mListControl.getCurrentPlayableModel();
                PlayableModel realPlayableModelInPlayer = XmPlayerService.this.mPlayerControl.getRealPlayableModelInPlayer();
                int iBeginBroadcast = XmPlayerService.this.mPlayerDispatcher.beginBroadcast();
                for (int i3 = 0; i3 < iBeginBroadcast; i3++) {
                    try {
                        ((IXmPlayerEventDispatcher) XmPlayerService.this.mPlayerDispatcher.getBroadcastItem(i3)).onPlayProgress(i, i2);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                XmPlayerService.this.mPlayerDispatcher.finishBroadcast();
                StringBuilder sb = new StringBuilder();
                sb.append("onPlayProgress XmPlayerService 336: currPos ==");
                sb.append(i);
                sb.append(" duration=");
                sb.append(i2);
                sb.append("  currIsNull =");
                boolean z = true;
                sb.append(currentPlayableModel == null);
                sb.append("   currRealIsNull=");
                if (realPlayableModelInPlayer != null) {
                    z = false;
                }
                sb.append(z);
                sb.append("  ");
                sb.append(System.currentTimeMillis());
                Logger.logToSd(sb.toString());
                if (currentPlayableModel != null && realPlayableModelInPlayer != null) {
                    if (currentPlayableModel.equals(realPlayableModelInPlayer)) {
                        Track track = (Track) currentPlayableModel;
                        if (i > 0 && i < i2 - 1000) {
                            track.setLastPlayedMills(i);
                            if (track.needSaveHistory()) {
                                XmPlayerService.this.saveSoundHistoryPos(currentPlayableModel.getDataId(), i);
                            }
                        } else if (i >= i2 - 1000) {
                            track.setLastPlayedMills(0);
                            if (track.needSaveHistory()) {
                                XmPlayerService.this.saveSoundHistoryPos(currentPlayableModel.getDataId(), 0);
                            }
                        }
                    }
                    XmPlayerService.this.mStatisticsManager.checkIsSeek(i, i2);
                    if (XmPlayerService.this.mPlayerControl != null) {
                        XmPlayerService.this.mStatisticsManager.onPlayProgress(i, i2, XmPlayerService.this.mPlayerControl.isPlayingRadio());
                    }
                    XmPlayerService.this.checkIsPauseTime();
                    if (XmPlayerService.this.mAdsManager != null && PlayableModel.isTrackKind(currentPlayableModel.getKind()) && PlayableModel.isTrackKind(realPlayableModelInPlayer.getKind())) {
                        XmPlayerService.this.mAdsManager.onPlayProgress(i, i2);
                    }
                }
            }
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayerStatusListener
        public void onPlayStart() {
            Logger.logToSd("onPlayStart XmPlayerService 294:" + System.currentTimeMillis());
            if (XmPlayerService.this.mPlayStartCallBack == null || !XmPlayerService.this.mPlayStartCallBack.onPlayStart()) {
                if (XmPlayerService.this.mWillPause) {
                    XmPlayerService.this.mWillPause = false;
                    XmPlayerService.this.pausePlay();
                    return;
                }
                XmPlayerService.this.removeCheckIsPauseTime();
                synchronized (XmPlayerService.class) {
                    int iBeginBroadcast = XmPlayerService.this.mPlayerDispatcher.beginBroadcast();
                    for (int i = 0; i < iBeginBroadcast; i++) {
                        try {
                            ((IXmPlayerEventDispatcher) XmPlayerService.this.mPlayerDispatcher.getBroadcastItem(i)).onPlayStart();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    XmPlayerService.this.mPlayerDispatcher.finishBroadcast();
                }
                XmNotificationCreater.getInstanse(XmPlayerService.this.mAppCtx).updateViewStateAtStart(XmPlayerService.this.mNotificationManager, XmPlayerService.this.mNotification, XmPlayerService.this.mNotificationId, NotificationColorUtils.isDarkNotificationBar(XmPlayerService.this.mAppCtx));
                XmPlayerService.this.sendPlayerStartBroadCast();
                Track track = (Track) XmPlayerService.this.mListControl.getCurrentPlayableModel();
                int currentPos = XmPlayerService.this.mPlayerControl.getCurrentPos();
                XmPlayerService.this.mStatisticsManager.onPlayTrack(track, XmPlayerService.this.mPlayerControl.isOnlineSource(), currentPos, XmPlayerService.this.getCurPlayUrl());
                XmPlayerService.this.mStatisticsManager.onPlayStart(currentPos, XmPlayerService.this.mPlayerControl.isPlayingRadio());
                XmPlayerService.this.mMediaControlManager.startPlay();
                XmPlayerService.this.saveLastPlayTrackInAlbum(track);
                if (XmPlayerService.this.mAdsManager != null) {
                    XmPlayerService.this.mAdsManager.onlyStopPlayer();
                }
                OnPlayErrorRetryUtilForPlayProcess.resertPlayErrorSign();
            }
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayerStatusListener
        public void onPlayStop() {
            Logger.logToSd("onPlayStop XmPlayerService 271:" + System.currentTimeMillis());
            synchronized (XmPlayerService.class) {
                int iBeginBroadcast = XmPlayerService.this.mPlayerDispatcher.beginBroadcast();
                for (int i = 0; i < iBeginBroadcast; i++) {
                    try {
                        ((IXmPlayerEventDispatcher) XmPlayerService.this.mPlayerDispatcher.getBroadcastItem(i)).onPlayStop();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                XmPlayerService.this.mPlayerDispatcher.finishBroadcast();
            }
            XmPlayerService.this.mStatisticsManager.onStopTrack((Track) XmPlayerService.this.mListControl.getCurrentPlayableModel(), XmPlayerService.this.mPlayerControl.getCurrentPos());
            XmPlayerService.this.mStatisticsManager.onPlayStop();
            XmPlayerService.this.mMediaControlManager.stopPlay();
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayerStatusListener
        public void onSoundPlayComplete() {
            final boolean z;
            Logger.logToSd("onSoundPlayComplete XmPlayerService 417:" + System.currentTimeMillis());
            synchronized (XmPlayerService.class) {
                if (XmPlayerService.this.mPauseTimeInMills == -1) {
                    XmPlayerService.this.mPauseTimeInMills = 0L;
                    z = false;
                } else {
                    z = true;
                }
                final int nextIndex = XmPlayerService.this.mListControl.getNextIndex(false);
                int iBeginBroadcast = XmPlayerService.this.mPlayerDispatcher.beginBroadcast();
                for (int i = 0; i < iBeginBroadcast; i++) {
                    try {
                        ((IXmPlayerEventDispatcher) XmPlayerService.this.mPlayerDispatcher.getBroadcastItem(i)).onSoundPlayComplete();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                XmPlayerService.this.mPlayerDispatcher.finishBroadcast();
                XmNotificationCreater.getInstanse(XmPlayerService.this.mAppCtx).updateViewStateAtPause(XmPlayerService.this.mNotificationManager, XmPlayerService.this.mNotification, XmPlayerService.this.mNotificationId, NotificationColorUtils.isDarkNotificationBar(XmPlayerService.this.mAppCtx));
                XmPlayerService.this.sendPlayCompleteBroadCast();
                Track track = (Track) XmPlayerService.this.mLastModel;
                if (track == null) {
                    return;
                }
                if (track.isAudition()) {
                    if (XmPlayerService.this.mPlayerStatusListener != null) {
                        XmPlayerService.this.mPlayerStatusListener.onSoundSwitch(XmPlayerService.this.mLastModel, null);
                    }
                    return;
                }
                track.setLastPlayedMills(0);
                if (track.needSaveHistory()) {
                    XmPlayerService.this.saveSoundHistoryPos(track.getDataId(), 0);
                }
                if (nextIndex >= 0) {
                    track = (Track) XmPlayerService.this.mListControl.getPlayableModel(nextIndex);
                }
                XmAdsManager.PlayAdsCallback playAdsCallback = new XmAdsManager.PlayAdsCallback() { // from class: com.ximalaya.ting.android.opensdk.player.service.XmPlayerService.1.1
                    @Override // com.ximalaya.ting.android.opensdk.player.advertis.XmAdsManager.PlayAdsCallback
                    public void onFinish(boolean z2) {
                        int i2 = nextIndex;
                        if (i2 >= 0) {
                            XmPlayerService.this.play(i2, z, 1);
                            return;
                        }
                        if (XmPlayListControl.PlayMode.PLAY_MODEL_SINGLE.equals(XmPlayerService.this.mListControl.getPlayMode())) {
                            XmPlayerService.this.mListControl.setPlayMode(XmPlayListControl.PlayMode.PLAY_MODEL_LIST);
                        }
                        if (XmPlayerService.this.mPlayerStatusListener != null) {
                            XmPlayerService.this.mPlayerStatusListener.onSoundSwitch(XmPlayerService.this.mLastModel, null);
                        }
                    }
                };
                if (XmPlayerService.this.isDLNAState || track == null || "schedule".equals(track.getKind()) || "radio".equals(track.getKind()) || PlayableModel.KIND_LIVE_FLV.equals(track.getKind()) || XmPlayerService.isHtcu20) {
                    XmPlayerService.this.mAdsManager.stopCurrentAdPlay();
                    Logger.logToSd("play 11:" + System.currentTimeMillis());
                    playAdsCallback.onFinish(true);
                } else {
                    XmPlayerService.this.mAdsManager.playAds(track, 4, playAdsCallback, false);
                }
            }
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayerStatusListener
        public void onSoundPrepared() {
            Logger.logToSd("onSoundPrepared XmPlayerService 192:" + System.currentTimeMillis());
            XmPlayerService xmPlayerService = XmPlayerService.this;
            xmPlayerService.mLastDuration = xmPlayerService.mPlayerControl.getDuration();
            synchronized (XmPlayerService.class) {
                int iBeginBroadcast = XmPlayerService.this.mPlayerDispatcher.beginBroadcast();
                for (int i = 0; i < iBeginBroadcast; i++) {
                    try {
                        ((IXmPlayerEventDispatcher) XmPlayerService.this.mPlayerDispatcher.getBroadcastItem(i)).onSoundPrepared();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                XmPlayerService.this.mPlayerDispatcher.finishBroadcast();
            }
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayerStatusListener
        public void onSoundSwitch(PlayableModel playableModel, PlayableModel playableModel2) {
            Logger.logToSd("onSoundSwitch XmPlayerService 221:" + System.currentTimeMillis());
            if (XmPlayerService.this.getPlayerImpl() != null) {
                XmPlayerService.this.getPlayerImpl().lastRequestTime = System.currentTimeMillis();
            }
            XmPlayerService.this.mWillPause = false;
            Logger.i(XmPlayerService.TAG, DownloadThread.downloadedSize + "");
            SharedPreferencesUtil.getInstance(XmPlayerService.this.mAppCtx).saveString("downloadedSize", "" + DownloadThread.downloadedSize);
            DownloadThread.downloadedSize = 0L;
            synchronized (XmPlayerService.class) {
                int iBeginBroadcast = XmPlayerService.this.mPlayerDispatcher.beginBroadcast();
                for (int i = 0; i < iBeginBroadcast; i++) {
                    try {
                        ((IXmPlayerEventDispatcher) XmPlayerService.this.mPlayerDispatcher.getBroadcastItem(i)).onSoundSwitch((Track) playableModel, (Track) playableModel2);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                XmPlayerService.this.mPlayerDispatcher.finishBroadcast();
            }
            if (playableModel != null && (playableModel instanceof Track)) {
                XmPlayerService.this.mStatisticsManager.onStopTrack((Track) playableModel, XmPlayerService.this.mPlayerControl.getCurrentPos());
            }
            if (XmPlayerService.this.mStatisticsManager != null) {
                XmPlayerService.this.mStatisticsManager.onSoundSwitch();
            }
            boolean zIsDarkNotificationBar = NotificationColorUtils.isDarkNotificationBar(XmPlayerService.this.mAppCtx);
            XmNotificationCreater instanse = XmNotificationCreater.getInstanse(XmPlayerService.this.mAppCtx);
            XmPlayerService xmPlayerService = XmPlayerService.this;
            instanse.updateModelDetail(xmPlayerService.mListControl, xmPlayerService.mNotificationManager, XmPlayerService.this.mNotification, XmPlayerService.this.mNotificationId, zIsDarkNotificationBar);
        }
    };
    private IXmAdsStatusListener mAdsListener = new IXmAdsStatusListener() { // from class: com.ximalaya.ting.android.opensdk.player.service.XmPlayerService.2
        private byte[] mLock = new byte[0];

        @Override // com.ximalaya.ting.android.opensdk.player.advertis.IXmAdsStatusListener
        public void onAdsStartBuffering() {
            Logger.logToSd("mAdsListener onAdsStartBuffering XmPlayerService 672:" + System.currentTimeMillis());
            synchronized (this.mLock) {
                int iBeginBroadcast = XmPlayerService.this.mAdsDispatcher.beginBroadcast();
                for (int i = 0; i < iBeginBroadcast; i++) {
                    try {
                        ((IXmAdsEventDispatcher) XmPlayerService.this.mAdsDispatcher.getBroadcastItem(i)).onAdsStartBuffering();
                    } catch (RemoteException e) {
                        e.printStackTrace();
                    }
                }
                XmPlayerService.this.mAdsDispatcher.finishBroadcast();
            }
        }

        @Override // com.ximalaya.ting.android.opensdk.player.advertis.IXmAdsStatusListener
        public void onAdsStopBuffering() {
            Logger.logToSd("mAdsListener onAdsStopBuffering XmPlayerService 654:" + System.currentTimeMillis());
            synchronized (this.mLock) {
                int iBeginBroadcast = XmPlayerService.this.mAdsDispatcher.beginBroadcast();
                for (int i = 0; i < iBeginBroadcast; i++) {
                    try {
                        ((IXmAdsEventDispatcher) XmPlayerService.this.mAdsDispatcher.getBroadcastItem(i)).onAdsStopBuffering();
                    } catch (RemoteException e) {
                        e.printStackTrace();
                    }
                }
                XmPlayerService.this.mAdsDispatcher.finishBroadcast();
            }
        }

        @Override // com.ximalaya.ting.android.opensdk.player.advertis.IXmAdsStatusListener
        public void onCompletePlayAds() {
            Logger.logToSd("mAdsListener onCompletePlayAds XmPlayerService 636:" + System.currentTimeMillis());
            synchronized (this.mLock) {
                int iBeginBroadcast = XmPlayerService.this.mAdsDispatcher.beginBroadcast();
                for (int i = 0; i < iBeginBroadcast; i++) {
                    try {
                        ((IXmAdsEventDispatcher) XmPlayerService.this.mAdsDispatcher.getBroadcastItem(i)).onCompletePlayAds();
                    } catch (RemoteException e) {
                        e.printStackTrace();
                    }
                }
                XmPlayerService.this.mAdsDispatcher.finishBroadcast();
            }
        }

        @Override // com.ximalaya.ting.android.opensdk.player.advertis.IXmAdsStatusListener
        public void onError(int i, int i2) {
            Logger.logToSd("mAdsListener onError XmPlayerService 618:" + System.currentTimeMillis());
            synchronized (this.mLock) {
                int iBeginBroadcast = XmPlayerService.this.mAdsDispatcher.beginBroadcast();
                for (int i3 = 0; i3 < iBeginBroadcast; i3++) {
                    try {
                        ((IXmAdsEventDispatcher) XmPlayerService.this.mAdsDispatcher.getBroadcastItem(i3)).onError(i, i2);
                    } catch (RemoteException e) {
                        e.printStackTrace();
                    }
                }
                XmPlayerService.this.mAdsDispatcher.finishBroadcast();
            }
        }

        @Override // com.ximalaya.ting.android.opensdk.player.advertis.IXmAdsStatusListener
        public void onGetAdsInfo(AdvertisList advertisList) {
            Logger.logToSd("mAdsListener onGetAdsInfo XmPlayerService 598:" + System.currentTimeMillis());
            synchronized (this.mLock) {
                XmPlayerService.this.startCheckIsPauseTime();
                int iBeginBroadcast = XmPlayerService.this.mAdsDispatcher.beginBroadcast();
                for (int i = 0; i < iBeginBroadcast; i++) {
                    try {
                        ((IXmAdsEventDispatcher) XmPlayerService.this.mAdsDispatcher.getBroadcastItem(i)).onGetAdsInfo(advertisList);
                    } catch (RemoteException e) {
                        e.printStackTrace();
                    }
                }
                XmPlayerService.this.mAdsDispatcher.finishBroadcast();
            }
        }

        @Override // com.ximalaya.ting.android.opensdk.player.advertis.IXmAdsStatusListener
        public void onStartGetAdsInfo() {
            Logger.logToSd("mAdsListener onStartGetAdsInfo XmPlayerService 580:" + System.currentTimeMillis());
            synchronized (this.mLock) {
                int iBeginBroadcast = XmPlayerService.this.mAdsDispatcher.beginBroadcast();
                for (int i = 0; i < iBeginBroadcast; i++) {
                    try {
                        ((IXmAdsEventDispatcher) XmPlayerService.this.mAdsDispatcher.getBroadcastItem(i)).onStartGetAdsInfo();
                    } catch (RemoteException e) {
                        e.printStackTrace();
                    }
                }
                XmPlayerService.this.mAdsDispatcher.finishBroadcast();
            }
        }

        @Override // com.ximalaya.ting.android.opensdk.player.advertis.IXmAdsStatusListener
        public void onStartPlayAds(Advertis advertis, int i) {
            Logger.logToSd("mAdsListener onStartPlayAds XmPlayerService 556:" + System.currentTimeMillis());
            synchronized (this.mLock) {
                if (XmPlayerService.this.mWillPause) {
                    XmPlayerService.this.mWillPause = false;
                    XmPlayerService.this.pausePlay();
                    return;
                }
                int iBeginBroadcast = XmPlayerService.this.mAdsDispatcher.beginBroadcast();
                for (int i2 = 0; i2 < iBeginBroadcast; i2++) {
                    try {
                        ((IXmAdsEventDispatcher) XmPlayerService.this.mAdsDispatcher.getBroadcastItem(i2)).onStartPlayAds(advertis, i);
                    } catch (RemoteException e) {
                        e.printStackTrace();
                    }
                }
                XmPlayerService.this.mAdsDispatcher.finishBroadcast();
            }
        }
    };
    private boolean mustShowNotifation = false;
    private long mMaxSaveTime = -813934592;
    private String mSeparator = "__xm__";
    public boolean isLossAudioFocus = false;
    private long mPauseTimeInMills = 0;
    private boolean mWillPause = false;
    private XmPlayerControl.IPlaySeekListener mPlaySeekListener = new XmPlayerControl.IPlaySeekListener() { // from class: com.ximalaya.ting.android.opensdk.player.service.XmPlayerService.9
        @Override // com.ximalaya.ting.android.opensdk.player.service.XmPlayerControl.IPlaySeekListener
        public void onSeekComplete(int i) {
            if (XmPlayerService.this.mStatisticsManager != null) {
                XmPlayerService.this.mStatisticsManager.onSeekComplete(i);
            }
        }
    };
    private Map<String, List<IDataCallBack<String>>> requestMap = new ConcurrentHashMap();

    public class XmPlayerImpl extends IXmPlayer.Stub {
        private long lastRequestTime;

        public XmPlayerImpl() {
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
        public void addPlayList(List<Track> list) throws RemoteException {
            XmPlayListControl xmPlayListControl = XmPlayerService.this.mListControl;
            if (xmPlayListControl != null) {
                xmPlayListControl.addPlayList(list);
            }
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
        public void browseAlbums(long j, int i, int i2, final long j2) throws RemoteException {
            HashMap map = new HashMap();
            map.put(DTransferConstants.ALBUM_ID, j + "");
            map.put(DTransferConstants.PAGE, i + "");
            map.put("count", i2 + "");
            CommonRequest.getTracks(map, new IDataCallBack<TrackList>() { // from class: com.ximalaya.ting.android.opensdk.player.service.XmPlayerService.XmPlayerImpl.6
                @Override // com.ximalaya.ting.android.opensdk.datatrasfer.IDataCallBack
                public void onError(int i3, String str) {
                    XmPlayerService.this.setCustomCallBackErrData(str, j2);
                }

                @Override // com.ximalaya.ting.android.opensdk.datatrasfer.IDataCallBack
                public void onSuccess(TrackList trackList) {
                    XmPlayerService.this.setCustomCallBackSuccessData(new Gson().toJson(trackList), 3, j2);
                }
            });
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
        public void clearPlayCache() throws RemoteException {
            if (XmPlayerService.this.mPlayerControl != null) {
                PlayerUtil.cleanUpCacheSound(XmPlayerService.this.mPlayerControl.getCurPlayUrl());
            }
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
        public void closeNotification() throws RemoteException {
            XmPlayerService.this.closeNotification();
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
        public void exitSoundAd() throws RemoteException {
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
        public void getAlbumByCategoryId(long j, int i, int i2, final long j2) throws RemoteException {
            HashMap map = new HashMap();
            map.put(DTransferConstants.CATEGORY_ID, j + "");
            map.put(DTransferConstants.PAGE, i + "");
            map.put("count", i2 + "");
            CommonRequest.getAlbums(map, new IDataCallBack<AlbumList>() { // from class: com.ximalaya.ting.android.opensdk.player.service.XmPlayerService.XmPlayerImpl.11
                @Override // com.ximalaya.ting.android.opensdk.datatrasfer.IDataCallBack
                public void onError(int i3, String str) {
                    XmPlayerService.this.setCustomCallBackErrData(str, j2);
                }

                @Override // com.ximalaya.ting.android.opensdk.datatrasfer.IDataCallBack
                public void onSuccess(AlbumList albumList) {
                    XmPlayerService.this.setCustomCallBackSuccessData(new Gson().toJson(albumList), 9, j2);
                }
            });
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
        public void getAlbumByCategoryIdAndTag(long j, int i, int i2, int i3, long j2) throws RemoteException {
            HashMap map = new HashMap();
            map.put("id", j + "");
            map.put(DTransferConstants.PAGE, i2 + "");
            map.put("count", i3 + "");
            if (i != 0) {
                map.put("keywordId", i + "");
            }
            XmPlayerService.this.getRequestMData(map, 129, j2, XmPlayerService.OPENSDK_GET_ALBUMS_BY_CATEGORY_ID_AND_TAG);
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
        public void getAlbumInfo(long j, int i, int i2, String str, long j2) throws RemoteException {
            HashMap map = new HashMap();
            map.put(DTransferConstants.PAGE, i + "");
            if (i2 > 0) {
                map.put(WebConst.QueryParam.PAGE_SIZE, i2 + "");
            } else {
                map.put(WebConst.QueryParam.PAGE_SIZE, "20");
            }
            map.put(DTransferConstants.ALBUMID, j + "");
            map.put("isAsc", "true");
            map.put("device", "android");
            map.put("url_from", str);
            XmPlayerService.this.getRequestMData(map, 101, j2, XmPlayerService.OPENSDK_GETALBUMDATA);
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
        public void getAttentionAlbum(int i, String str, long j) throws RemoteException {
            HashMap map = new HashMap();
            map.put("device", "android");
            if (TextUtils.isEmpty(str)) {
                map.put("sign", "2");
            } else {
                map.put("timeline", str);
                map.put("sign", "1");
            }
            map.put("size", i + "");
            XmPlayerService.this.getRequestMData(map, 107, j, XmPlayerService.OPENSDK_GETATTENTIONALBUMLIST);
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
        public void getCategoriesList(int i, int i2, long j) throws RemoteException {
            XmPlayerService.this.getRequestMData(new HashMap(), 128, j, XmPlayerService.OPENSDK_GET_CATEGORIES_LIST);
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
        public void getCategoryModelList(final long j) throws RemoteException {
            CommonRequest.getCategories(new HashMap(), new IDataCallBack<CategoryList>() { // from class: com.ximalaya.ting.android.opensdk.player.service.XmPlayerService.XmPlayerImpl.3
                @Override // com.ximalaya.ting.android.opensdk.datatrasfer.IDataCallBack
                public void onError(int i, String str) {
                    XmPlayerService.this.setCustomCallBackErrData(str, j);
                }

                @Override // com.ximalaya.ting.android.opensdk.datatrasfer.IDataCallBack
                public void onSuccess(CategoryList categoryList) {
                    ArrayList arrayList = new ArrayList();
                    for (Category category : categoryList.getCategories()) {
                        CategoryModel categoryModel = new CategoryModel();
                        categoryModel.setCategoryId((int) category.getId());
                        categoryModel.setCategoryName(category.getCategoryName());
                        arrayList.add(categoryModel);
                    }
                    XmPlayerService.this.setCustomCallBackSuccessData(new Gson().toJson(arrayList), 4, j);
                }
            });
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
        public String getCurPlayUrl() throws RemoteException {
            if (XmPlayerService.this.mPlayerControl != null) {
                return XmPlayerService.this.mPlayerControl.getCurPlayUrl();
            }
            return null;
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
        public int getCurrIndex() throws RemoteException {
            XmPlayListControl xmPlayListControl = XmPlayerService.this.mListControl;
            if (xmPlayListControl != null) {
                return xmPlayListControl.getCurrIndex();
            }
            return -1;
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
        public long getCurrentTrackPlayedDuration() {
            return XmPlayerControl.mPlayedDuration;
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
        public int getDefultPageSize() throws RemoteException {
            return 20;
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
        public int getDuration() throws RemoteException {
            return XmPlayerService.this.mPlayerControl.getDuration();
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
        public String getHistoryPos(String str) throws RemoteException {
            return XmPlayerService.this.getSoundHistoryPos(str);
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
        public void getHotContent(boolean z, int i, int i2, final long j) throws RemoteException {
            HashMap map = new HashMap();
            map.put(DTransferConstants.CATEGORY_ID, "0");
            map.put(DTransferConstants.PAGE, i + "");
            map.put("count", i2 + "");
            if (z) {
                CommonRequest.getHotTracks(map, new IDataCallBack<TrackHotList>() { // from class: com.ximalaya.ting.android.opensdk.player.service.XmPlayerService.XmPlayerImpl.9
                    @Override // com.ximalaya.ting.android.opensdk.datatrasfer.IDataCallBack
                    public void onError(int i3, String str) {
                        XmPlayerService.this.setCustomCallBackErrData(str, j);
                    }

                    @Override // com.ximalaya.ting.android.opensdk.datatrasfer.IDataCallBack
                    public void onSuccess(TrackHotList trackHotList) {
                        XmPlayerService.this.setCustomCallBackSuccessData(new Gson().toJson(trackHotList), 5, j);
                    }
                });
            } else {
                CommonRequest.getAlbums(map, new IDataCallBack<AlbumList>() { // from class: com.ximalaya.ting.android.opensdk.player.service.XmPlayerService.XmPlayerImpl.8
                    @Override // com.ximalaya.ting.android.opensdk.datatrasfer.IDataCallBack
                    public void onError(int i3, String str) {
                        XmPlayerService.this.setCustomCallBackErrData(str, j);
                    }

                    @Override // com.ximalaya.ting.android.opensdk.datatrasfer.IDataCallBack
                    public void onSuccess(AlbumList albumList) {
                        XmPlayerService.this.setCustomCallBackSuccessData(new Gson().toJson(albumList), 6, j);
                    }
                });
            }
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
        public String getLastPlayTrackInAlbum(String str) throws RemoteException {
            return XmPlayerService.this.getLastPlayTrackInAlbumInner(str);
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
        public void getMainHotContent(int i, int i2, int i3, long j) throws RemoteException {
            HashMap map = new HashMap();
            map.put(DTransferConstants.PAGE, "" + i2);
            map.put("per_page", "" + i3);
            map.put("condition", "hot");
            map.put(DTransferConstants.CATEGORY_NAME, "all");
            map.put(DTransferConstants.TAG_NAME, "");
            map.put("device", "android");
            if (i == 1) {
                XmPlayerService.this.getRequestMData(map, 105, j, XmPlayerService.OPENSDK_GETHOTTRACK);
            } else if (i == 2) {
                map.put("status", "0");
                XmPlayerService.this.getRequestMData(map, 115, j, XmPlayerService.OPENSDK_GET_HOT_ALBUM);
            }
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
        public void getMyCollect(int i, int i2, long j) throws RemoteException {
            HashMap map = new HashMap();
            map.put("pageId", i + "");
            map.put(WebConst.QueryParam.PAGE_SIZE, i2 + "");
            XmPlayerService.this.getRequestMData(map, 100, j, XmPlayerService.OPENSDK_GETSUBSCRIBEALBUMLIST);
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
        public void getNewRank(int i, int i2, int i3, long j) throws RemoteException {
            HashMap map = new HashMap();
            map.put("device", "android");
            map.put("pageId", "" + i2);
            map.put(WebConst.QueryParam.PAGE_SIZE, "" + i3);
            map.put("target", "main");
            if (i == 0) {
                map.put("rankingListId", "21");
                XmPlayerService.this.getRequestMData(map, 132, j, XmPlayerService.OPENSDK_GET_NEW_RANK_ALBUM);
            } else if (i == 1) {
                map.put("rankingListId", "57");
                XmPlayerService.this.getRequestMData(map, 133, j, XmPlayerService.OPENSDK_GET_NEW_RANK_TRACK);
            } else if (i == 2) {
                map.put("rankingListId", "50");
                XmPlayerService.this.getRequestMData(map, 132, j, XmPlayerService.OPENSDK_GET_NEW_RANK_ALBUM);
            }
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
        public void getNextPlayList() throws RemoteException {
            XmPlayerService.this.mListControl.getNextPlayList(false);
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
        public Map<String, String> getParam() throws RemoteException {
            return XmPlayerService.this.mListControl.getParams();
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
        public void getParseDeviceInfo(long j) throws RemoteException {
            XmPlayerService.this.getRequestMData(new HashMap(), 117, j, XmPlayerService.OPENSDK_GET_PARSE_DEVICE_INFO);
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
        public int getPlayCurrPosition() throws RemoteException {
            return XmPlayerService.this.mPlayerControl.getCurrentPos();
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
        public List<Track> getPlayList(int i) throws RemoteException {
            List<Track> playList = XmPlayerService.this.mListControl.getPlayList();
            if (playList == null || playList.size() < 30) {
                return playList;
            }
            int size = playList.size();
            int i2 = i * 30;
            int i3 = i2 + 30;
            if (size <= i2) {
                return null;
            }
            if (i3 > size) {
                i3 = i2 + (size % 30);
            }
            return playList.subList(i2, i3);
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
        public boolean getPlayListOrder() throws RemoteException {
            return XmPlayerService.this.mListControl.getPlayListOrder();
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
        public int getPlayListSize() throws RemoteException {
            if (XmPlayerService.getPlayerSrvice() == null) {
                return 0;
            }
            return XmPlayerService.getPlayerSrvice().getPlayListSize();
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
        public String getPlayMode() throws RemoteException {
            XmPlayListControl xmPlayListControl = XmPlayerService.this.mListControl;
            return xmPlayListControl != null ? xmPlayListControl.getPlayMode().toString() : "";
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
        public int getPlaySourceType() throws RemoteException {
            return XmPlayerService.this.mListControl.getPlaySource();
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
        public int getPlayerStatus() throws RemoteException {
            if (XmPlayerService.this.mAdsManager == null || XmPlayerService.this.mPlayerControl == null) {
                return 7;
            }
            if (XmPlayerService.this.mAdsManager.isAdsActive()) {
                return 3;
            }
            return XmPlayerService.this.mPlayerControl.getPlayerState();
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
        public void getPrePlayList() throws RemoteException {
            XmPlayerService.this.mListControl.getPrePlayList(false);
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
        public void getProvinces(long j) throws RemoteException {
            XmPlayerService.this.getRequestMData(new HashMap(), 125, j, XmPlayerService.OPENSDK_GET_PROVINCES);
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
        public Radio getRadio() throws RemoteException {
            return XmPlayerService.this.mListControl.getRadio();
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
        public void getRadioList(int i, long j, int i2, int i3, long j2) throws RemoteException {
            HashMap map = new HashMap();
            map.put("radioType", i + "");
            if (i == 2) {
                map.put("provinceCode", j + "");
            }
            map.put(WebConst.QueryParam.PAGE_SIZE, i3 + "");
            map.put("pageNum", i2 + "");
            XmPlayerService.this.getRequestMData(map, 126, j2, XmPlayerService.OPENSDK_GET_RADIO_LIST);
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
        public void getRadioSchedules(String str, long j) throws RemoteException {
            HashMap map = new HashMap();
            map.put("radio", str);
            XmPlayerService.this.getRequestMData(map, 127, j, XmPlayerService.OPENSDK_GET_RADIO_SCHEDULES);
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
        public void getRank(String str, String str2, int i, long j) throws RemoteException {
            HashMap map = new HashMap();
            map.put("device", "android");
            map.put("key", str2);
            map.put("pageId", i + "");
            map.put(WebConst.QueryParam.PAGE_SIZE, "20");
            if ("track".equals(str)) {
                XmPlayerService.this.getRequestMData(map, 102, j, XmPlayerService.OPENSDK_GET_RANK_TRACK);
            } else if ("album".equals(str)) {
                XmPlayerService.this.getRequestMData(map, 103, j, XmPlayerService.OPENSDK_GETRANKALBUMLIST);
            } else if (XmPlayerService.TYPE_RANK_ANCHOR.equals(str)) {
                XmPlayerService.this.getRequestMData(map, 104, j, XmPlayerService.OPENSDK_GETRANKANCHORLIST);
            }
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
        public void getRecommendAlbumListByAlbumId(long j, long j2) throws RemoteException {
            HashMap map = new HashMap();
            map.put(DTransferConstants.ALBUMID, j + "");
            XmPlayerService.this.getRequestMData(map, 123, j2, XmPlayerService.OPENSDK_GET_RECOMMEND_ALBUMLIST_BY_ALBUMID);
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
        public void getRecommendAlbumListByTrackId(long j, long j2) throws RemoteException {
            HashMap map = new HashMap();
            map.put("trackId", j + "");
            XmPlayerService.this.getRequestMData(map, 124, j2, XmPlayerService.OPENSDK_GET_RECOMMEND_ALBUMLIST_BY_TRACKID);
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
        public void getSourseLists(String str, int i, int i2, int i3, final int i4, final long j) throws RemoteException {
            HashMap map = new HashMap();
            map.put(DTransferConstants.SEARCH_KEY, str);
            map.put(DTransferConstants.CATEGORY_ID, i + "");
            map.put(DTransferConstants.PAGE, i2 + "");
            map.put("count", i3 + "");
            if (i4 == 1) {
                CommonRequest.getSearchedAlbums(map, new IDataCallBack<SearchAlbumList>() { // from class: com.ximalaya.ting.android.opensdk.player.service.XmPlayerService.XmPlayerImpl.4
                    @Override // com.ximalaya.ting.android.opensdk.datatrasfer.IDataCallBack
                    public void onError(int i5, String str2) {
                        XmPlayerService.this.setCustomCallBackErrData(str2, j);
                    }

                    @Override // com.ximalaya.ting.android.opensdk.datatrasfer.IDataCallBack
                    public void onSuccess(SearchAlbumList searchAlbumList) {
                        XmPlayerService.this.setCustomCallBackSuccessData(new Gson().toJson(searchAlbumList), i4, j);
                    }
                });
            } else if (i4 == 2) {
                CommonRequest.getSearchedTracks(map, new IDataCallBack<SearchTrackList>() { // from class: com.ximalaya.ting.android.opensdk.player.service.XmPlayerService.XmPlayerImpl.5
                    @Override // com.ximalaya.ting.android.opensdk.datatrasfer.IDataCallBack
                    public void onError(int i5, String str2) {
                        XmPlayerService.this.setCustomCallBackErrData(str2, j);
                    }

                    @Override // com.ximalaya.ting.android.opensdk.datatrasfer.IDataCallBack
                    public void onSuccess(SearchTrackList searchTrackList) {
                        XmPlayerService.this.setCustomCallBackSuccessData(new Gson().toJson(searchTrackList), i4, j);
                    }
                });
            }
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
        public void getSpecialListenList(int i, int i2, int i3, long j) throws RemoteException {
            HashMap map = new HashMap();
            map.put("categoryId", i3 + "");
            map.put(AnimatorViewWrapper.SCALE, "2");
            map.put("pageId", i + "");
            map.put(WebConst.QueryParam.PAGE_SIZE, i2 + "");
            XmPlayerService.this.getRequestMData(map, 119, j, XmPlayerService.OPENSDK_GET_SPECIALLISTEN);
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
        public void getSubjectDetail(int i, int i2, long j, long j2) throws RemoteException {
            HashMap map = new HashMap();
            map.put("id", j + "");
            map.put(DTransferConstants.PAGE, i + "");
            map.put("count", i2 + "");
            XmPlayerService.this.getRequestMData(map, 120, j2, XmPlayerService.OPENSDK_GET_SUBJECTDETAIL);
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
        public void getSuggestAlbums(int i, int i2, boolean z, long j) throws RemoteException {
            HashMap map = new HashMap();
            map.put("pageId", "" + i);
            map.put(WebConst.QueryParam.PAGE_SIZE, "" + i2);
            map.put("isLogin", "" + z);
            XmPlayerService.this.getRequestMData(map, 118, j, XmPlayerService.OPENSDK_GET_SUGGEST_ALBUMS);
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
        public void getTags(long j, long j2) {
            HashMap map = new HashMap();
            map.put("categoryId", j + "");
            XmPlayerService.this.getRequestMData(map, 130, j2, XmPlayerService.OPENSDK_GET_TAGS_BY_CATEGORY_ID);
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
        public float getTempo() throws RemoteException {
            if (XmPlayerService.this.mPlayerControl != null) {
                return XmPlayerService.this.mPlayerControl.getTempo();
            }
            return 0.0f;
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
        public Track getTrack(int i) throws RemoteException {
            return (Track) XmPlayerService.this.mListControl.getPlayableModel(i);
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
        public void getTrackDetailInfo(long j, long j2) {
            HashMap map = new HashMap();
            map.put("device", "android");
            map.put("trackId", j + "");
            XmPlayerService.this.getRequestMData(map, 131, j2, XmPlayerService.OPENSDK_GET_TRACK_INFO);
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
        public Track getTrackInfoSync(long j) {
            return null;
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
        public void getTrackListByLastTrack(long j, long j2, int i, final long j3) throws RemoteException {
            HashMap map = new HashMap();
            map.put(DTransferConstants.ALBUM_ID, j + "");
            map.put("track_id", j2 + "");
            map.put("count", i + "");
            CommonRequest.getLastPlayTracks(map, new IDataCallBack<LastPlayTrackList>() { // from class: com.ximalaya.ting.android.opensdk.player.service.XmPlayerService.XmPlayerImpl.10
                @Override // com.ximalaya.ting.android.opensdk.datatrasfer.IDataCallBack
                public void onError(int i2, String str) {
                    XmPlayerService.this.setCustomCallBackErrData(str, j3);
                }

                @Override // com.ximalaya.ting.android.opensdk.datatrasfer.IDataCallBack
                public void onSuccess(LastPlayTrackList lastPlayTrackList) {
                    XmPlayerService.this.setCustomCallBackSuccessData(new Gson().toJson(lastPlayTrackList), 8, j3);
                }
            });
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
        public void getTrackListByTrackIdAtAlbum(long j, long j2, boolean z, long j3) throws RemoteException {
            HashMap map = new HashMap();
            map.put("trackId", j + "");
            map.put(DTransferConstants.ALBUMID, j2 + "");
            map.put("asc", z + "");
            XmPlayerService.this.getRequestMData(map, 122, j3, XmPlayerService.OPENSDK_GET_TRACKLIST_BYTRACKIDATALBUM);
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
        public void getUserInfo(long j) throws RemoteException {
            XmPlayerService.this.getRequestMData(new HashMap(), 106, j, XmPlayerService.OPENSDK_GETUSERINFO);
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
        public boolean hasNextSound() throws RemoteException {
            int currListSize = XmPlayerService.this.mListControl.getCurrListSize();
            if (XmPlayerService.this.mListControl.getPlayMode() != XmPlayListControl.PlayMode.PLAY_MODEL_RANDOM && XmPlayerService.this.mListControl.getPlayMode() != XmPlayListControl.PlayMode.PLAY_MODEL_LIST_LOOP) {
                if (currListSize <= 1) {
                    return false;
                }
                if (XmPlayerService.this.mListControl.getCurrIndex() + 1 >= currListSize && !XmPlayerService.this.mListControl.isLoading()) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
        public boolean hasPreSound() throws RemoteException {
            if (XmPlayerService.this.mListControl.getCurrListSize() <= 1) {
                return false;
            }
            int currIndex = XmPlayerService.this.mListControl.getCurrIndex();
            if (XmPlayerService.this.mListControl.getPlayMode() == XmPlayListControl.PlayMode.PLAY_MODEL_RANDOM || XmPlayerService.this.mListControl.getPlayMode() == XmPlayListControl.PlayMode.PLAY_MODEL_LIST_LOOP) {
                return true;
            }
            return currIndex > 0 && currIndex + (-1) >= 0;
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
        public boolean haveNextPlayList() throws RemoteException {
            XmPlayListControl xmPlayListControl = XmPlayerService.this.mListControl;
            if (xmPlayListControl == null) {
                return false;
            }
            xmPlayListControl.hasNextPage();
            return false;
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
        public boolean havePrePlayList() throws RemoteException {
            XmPlayListControl xmPlayListControl = XmPlayerService.this.mListControl;
            if (xmPlayListControl == null) {
                return false;
            }
            xmPlayListControl.hasPrePage();
            return false;
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
        public void init(String str, String str2, String str3) throws RemoteException {
            CommonRequest.getInstanse().setAppkey(str2);
            CommonRequest.getInstanse().setPackid(str3);
            CommonRequest instanse = CommonRequest.getInstanse();
            XmPlayerService xmPlayerService = XmPlayerService.this;
            instanse.init(xmPlayerService, str, xmPlayerService.getDeviceInfoProvider());
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
        public void insertPlayListHead(List<Track> list) throws RemoteException {
            XmPlayListControl xmPlayListControl = XmPlayerService.this.mListControl;
            if (xmPlayListControl != null) {
                xmPlayListControl.insertPlayListHead(list);
            }
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
        public boolean isAdPlaying() throws RemoteException {
            if (XmPlayerService.this.mAdsManager != null) {
                return XmPlayerService.this.mAdsManager.isAdsPlaying();
            }
            return false;
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
        public boolean isAdsActive() throws RemoteException {
            if (XmPlayerService.this.mAdsManager != null) {
                return XmPlayerService.this.mAdsManager.isAdsActive();
            }
            return false;
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
        public boolean isBuffering() throws RemoteException {
            if (XmPlayerService.this.mPlayerControl != null) {
                return XmPlayerService.this.mPlayerControl.isBuffering() || getPlayerStatus() == 9;
            }
            return false;
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
        public boolean isDLNAState() throws RemoteException {
            if (XmPlayerService.this.mPlayerControl == null) {
                return XmPlayerService.this.isDLNAState;
            }
            XmPlayerService xmPlayerService = XmPlayerService.this;
            xmPlayerService.isDLNAState = xmPlayerService.mPlayerControl.isDLNAState();
            return XmPlayerService.this.isDLNAState;
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
        public boolean isLoading() throws RemoteException {
            if (XmPlayerService.this.mAdsManager != null && XmPlayerService.this.mPlayerControl != null) {
                if (XmPlayerService.this.mPlayerControl.getPlayerState() == 9) {
                    return true;
                }
                if (XmPlayerService.this.mAdsManager.isAdsActive() && !XmPlayerService.this.mAdsManager.isLastIsDuringPlay() && XmPlayerService.this.mAdsManager.getPlayerStatue() != 2) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
        public boolean isOnlineSource() throws RemoteException {
            if (XmPlayerService.this.mPlayerControl != null) {
                return XmPlayerService.this.mPlayerControl.isOnlineSource();
            }
            return false;
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
        public boolean isPlaying() throws RemoteException {
            if (XmPlayerService.getPlayerSrvice() == null) {
                return false;
            }
            return XmPlayerService.getPlayerSrvice().isPlaying();
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
        public void needContinuePlay(boolean z) throws RemoteException {
            XmPlayerService.this.isContinuePlay = z;
            if (XmPlayerService.this.mPlayerAudioFocusControl != null) {
                XmPlayerService.this.mPlayerAudioFocusControl.needContinuePlay(z);
            }
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
        public void notifyConfigChange() throws RemoteException {
            XmPlayerConfig.getInstance(XmPlayerService.this.mAppCtx).onConfigChange();
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
        public boolean pausePlay() throws RemoteException {
            if (XmPlayerService.getPlayerSrvice() == null) {
                return false;
            }
            return XmPlayerService.getPlayerSrvice().pausePlay();
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
        public void pausePlayInMillis(long j) throws RemoteException {
            XmPlayerService.this.mPauseTimeInMills = j;
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
        public boolean permutePlayList() throws RemoteException {
            return XmPlayerService.this.mListControl.permutePlayList();
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
        public boolean play(int i) throws RemoteException {
            if (XmPlayerService.getPlayerSrvice() == null) {
                return false;
            }
            return XmPlayerService.getPlayerSrvice().play(i);
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
        public boolean playNext() throws RemoteException {
            if (XmPlayerService.getPlayerSrvice() == null) {
                return false;
            }
            return XmPlayerService.getPlayerSrvice().playNext();
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
        public boolean playPre() throws RemoteException {
            if (XmPlayerService.getPlayerSrvice() == null) {
                return false;
            }
            return XmPlayerService.getPlayerSrvice().playPre();
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
        public boolean playRadio(Radio radio) throws RemoteException {
            if (XmPlayerService.getPlayerSrvice() == null) {
                return false;
            }
            return XmPlayerService.getPlayerSrvice().playRadio(radio);
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
        public void playRewardVideoAdSuccess(long j) throws RemoteException {
            XmPlayerService.this.playIdList.add(Long.valueOf(j));
            XmPlayerService.this.isPlayAdSuccess = true;
            XmPlayerService.getPlayerSrvice().startPlay();
            SharedPreferencesUtil.getInstance(CommonRequest.getInstanse().getContext()).saveLong(PreferenceConstantsInOpenSdk.OPENSDK_KEY_SDK_CAN_PLAY_AUDIO_NUMS, OpenSdkAdsDataHandler.getInstance().getUnlockTrackNum() - 1);
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
        public void registeAdsListener(IXmAdsEventDispatcher iXmAdsEventDispatcher) throws RemoteException {
            Logger.i(XmPlayerService.TAG, "Process " + Binder.getCallingPid() + "has register AdsListener");
            if (iXmAdsEventDispatcher != null) {
                XmPlayerService.this.mAdsDispatcher.register(iXmAdsEventDispatcher, new MyRemoteCallbackList.ProcessCookie(Binder.getCallingPid(), Binder.getCallingUid()));
            }
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
        public void registeCommonBusinessListener(IXmCommonBusinessDispatcher iXmCommonBusinessDispatcher) throws RemoteException {
            XmPlayerService.this.mIXmCommonBusinessDispatcher = iXmCommonBusinessDispatcher;
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
        public void registeCustomDataCallBack(IXmCustomDataCallBack iXmCustomDataCallBack) throws RemoteException {
            Logger.i(XmPlayerService.TAG, "Process " + Binder.getCallingPid() + "has register CustomDataCallBack");
            if (iXmCustomDataCallBack != null) {
                XmPlayerService.this.mCustomDataCallBack.register(iXmCustomDataCallBack, new MyRemoteCallbackList.ProcessCookie(Binder.getCallingPid(), Binder.getCallingUid()));
            }
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
        public void registeMainDataSupportCallBack(IXmMainDataSupportDataCallback iXmMainDataSupportDataCallback) throws RemoteException {
            if (iXmMainDataSupportDataCallback != null) {
                XmPlayerService.this.mMainDataSupportCallbackList.register(iXmMainDataSupportDataCallback, new MyRemoteCallbackList.ProcessCookie(Binder.getCallingPid(), Binder.getCallingUid()));
            }
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
        public void registePlayerListener(IXmPlayerEventDispatcher iXmPlayerEventDispatcher) throws RemoteException {
            Logger.i(XmPlayerService.TAG, "Process " + Binder.getCallingPid() + "has register PlayerListener");
            if (iXmPlayerEventDispatcher == null || XmPlayerService.this.mPlayerDispatcher == null) {
                return;
            }
            XmPlayerService.this.mPlayerDispatcher.register(iXmPlayerEventDispatcher, new MyRemoteCallbackList.ProcessCookie(Binder.getCallingPid(), Binder.getCallingUid()));
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
        public void removeListByIndex(int i) throws RemoteException {
            XmPlayListControl xmPlayListControl = XmPlayerService.this.mListControl;
            if (xmPlayListControl != null) {
                xmPlayListControl.removeListByIndex(i);
            }
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
        public void requestSoundAd() throws RemoteException {
            Logger.logToSd("requestSoundAd");
            if (isAdsActive() || XmPlayerService.this.mAdsManager == null || !(XmPlayerService.this.mLastModel instanceof Track) || System.currentTimeMillis() - this.lastRequestTime <= 3000) {
                return;
            }
            this.lastRequestTime = System.currentTimeMillis();
            Logger.logToSd("requestSoundAd playAds");
            XmPlayerService.this.mAdsManager.playAds((Track) XmPlayerService.this.mLastModel, 0, null, true);
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
        public void resetPlayList() throws RemoteException {
            XmPlayerService.this.resetListed = true;
            XmPlayListControl xmPlayListControl = XmPlayerService.this.mListControl;
            if (xmPlayListControl != null) {
                xmPlayListControl.resetPlayList();
            }
            boolean zIsDarkNotificationBar = NotificationColorUtils.isDarkNotificationBar(XmPlayerService.this.mAppCtx);
            XmNotificationCreater instanse = XmNotificationCreater.getInstanse(XmPlayerService.this.mAppCtx);
            XmPlayerService xmPlayerService = XmPlayerService.this;
            instanse.updateModelDetail(xmPlayerService.mListControl, xmPlayerService.mNotificationManager, XmPlayerService.this.mNotification, XmPlayerService.this.mNotificationId, zIsDarkNotificationBar);
            if (XmPlayerService.this.mAdsManager != null) {
                XmPlayerService.this.mAdsManager.stopCurrentAdPlay();
            }
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
        public void resetPlayer() throws RemoteException {
            XmPlayerService.this.mLastModel = null;
            if (XmPlayerService.this.mPlayerControl != null) {
                XmPlayerService.this.mPlayerControl.resetMediaPlayer();
            }
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
        public boolean seekTo(int i) throws RemoteException {
            if (XmPlayerService.this.mAdsManager.isAdsActive() || XmPlayerService.this.mListControl.getPlaySource() == 3) {
                return false;
            }
            XmPlayerService.this.mPlayerControl.seekTo(i);
            return true;
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
        public void setAdsDataHandlerClassName(String str) throws RemoteException {
            XmPlayerService.this.mAdsManager.setAdsDataHandlerClassName(str);
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
        public void setAppSecret(String str) throws RemoteException {
            Logger.i(XmPlayerService.TAG, "setAppSecret " + str);
            XmPlayerService.this.mAppSecret = str;
            CommonRequest.getInstanse().init(XmPlayerService.this.mAppCtx, XmPlayerService.this.mAppSecret, XmPlayerService.this.getDeviceInfoProvider());
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
        public void setAppkeyAndPackId(String str, String str2) throws RemoteException {
            CommonRequest.getInstanse().setAppkey(str);
            CommonRequest.getInstanse().setPackid(str2);
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
        public void setBreakpointResume(boolean z) throws RemoteException {
            XmPlayerConfig.getInstance(XmPlayerService.this).setBreakpointResume(z);
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
        public void setCategoryId(int i, final long j) throws RemoteException {
            final HashMap map = new HashMap();
            map.put(DTransferConstants.CATEGORY_ID, i + "");
            CommonRequest.getHotTracks(map, new IDataCallBack<TrackHotList>() { // from class: com.ximalaya.ting.android.opensdk.player.service.XmPlayerService.XmPlayerImpl.2
                @Override // com.ximalaya.ting.android.opensdk.datatrasfer.IDataCallBack
                public void onError(int i2, String str) {
                    XmPlayerService.this.setCustomCallBackErrData(((String) map.get(DTransferConstants.SEARCH_KEY)) + str, j);
                }

                @Override // com.ximalaya.ting.android.opensdk.datatrasfer.IDataCallBack
                public void onSuccess(TrackHotList trackHotList) {
                    if (trackHotList == null || trackHotList.getTracks() == null || trackHotList.getTracks().size() <= 0) {
                        XmPlayerService.this.setCustomCallBackErrData((String) map.get(DTransferConstants.SEARCH_KEY), j);
                    } else {
                        XmPlayerService.getPlayerSrvice().setPlayList(map, trackHotList.getTracks());
                        XmPlayerService.getPlayerSrvice().play(0);
                    }
                }
            });
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
        public void setDLNAState(boolean z) throws RemoteException {
            XmPlayerService.this.isDLNAState = z;
            if (XmPlayerService.this.mPlayerControl != null) {
                XmPlayerService.this.mPlayerControl.setDLNAState(z);
            }
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
        public void setHistoryPosById(long j, int i) throws RemoteException {
            XmPlayerService.this.saveSoundHistoryPos(j, i);
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
        public void setNotification(int i, Notification notification) throws RemoteException {
            if (notification != null) {
                try {
                    if (XmPlayerService.mService != null) {
                        Logger.i(XmPlayerService.TAG, "setNotification");
                        XmPlayerService.mService.startForeground(i, notification);
                        XmPlayerService.this.mNotification = notification;
                        XmPlayerService.this.mNotificationId = i;
                        if (XmPlayerService.this.mAppCtx != null) {
                            XmPlayerService xmPlayerService = XmPlayerService.this;
                            if (xmPlayerService.mListControl != null && xmPlayerService.mNotificationManager != null) {
                                boolean zIsDarkNotificationBar = NotificationColorUtils.isDarkNotificationBar(XmPlayerService.this.mAppCtx);
                                XmNotificationCreater instanse = XmNotificationCreater.getInstanse(XmPlayerService.this.mAppCtx);
                                XmPlayerService xmPlayerService2 = XmPlayerService.this;
                                instanse.updateModelDetail(xmPlayerService2.mListControl, xmPlayerService2.mNotificationManager, XmPlayerService.this.mNotification, XmPlayerService.this.mNotificationId, zIsDarkNotificationBar);
                                XmNotificationCreater.getInstanse(XmPlayerService.this.mAppCtx).updateViewStateAtPause(XmPlayerService.this.mNotificationManager, XmPlayerService.this.mNotification, XmPlayerService.this.mNotificationId, zIsDarkNotificationBar);
                            }
                        }
                    }
                } catch (Exception e) {
                    CdnUtil.statToXDCSError(CdnConstants.PLAY_INFO, "setNotification:" + e.toString());
                }
            }
            if (XmPlayerService.this.mNotificationManager != null) {
                try {
                    XmPlayerService.this.mNotificationManager.cancel(10002);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                if (XmPlayerService.this.mNotificationIdNoCrash != 0) {
                    try {
                        XmPlayerService.this.mNotificationManager.cancel(XmPlayerService.this.mNotificationIdNoCrash);
                    } catch (Exception e3) {
                        e3.printStackTrace();
                    }
                }
            }
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
        public void setNotificationForNoCrash(int i, Notification notification) throws RemoteException {
            if (notification != null) {
                try {
                    XmPlayerService.this.mNotificationNoCrash = notification;
                    XmPlayerService.this.mNotificationIdNoCrash = i;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (XmPlayerService.this.mNotificationManager != null) {
                XmPlayerService.this.mNotificationManager.cancel(10002);
            }
            if (i == 0 || notification != null) {
                return;
            }
            if (XmPlayerService.this.mNotificationManager != null) {
                XmPlayerService.this.mNotificationManager.cancel(i);
            }
            XmPlayerService.this.mNotificationNoCrash = null;
            XmPlayerService.this.mNotificationIdNoCrash = 0;
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
        public void setPageSize(int i) throws RemoteException {
            if (CommonRequest.getInstanse().getDefaultPagesize() != i) {
                CommonRequest.getInstanse().setDefaultPagesize(i);
            }
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0070 A[PHI: r0
          0x0070: PHI (r0v6 boolean) = (r0v2 boolean), (r0v5 boolean), (r0v5 boolean) binds: [B:8:0x000e, B:14:0x0035, B:16:0x004e] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
        public void setPlayByAlbumTracks(String str, int i, long j) throws RemoteException {
            boolean z = true;
            boolean z2 = TextUtils.isEmpty(str) || i < 0;
            if (z2) {
                z = z2;
            } else {
                try {
                    CommonTrackList commonTrackList = (CommonTrackList) new Gson().fromJson(str, new TypeToken<CommonTrackList<Track>>() { // from class: com.ximalaya.ting.android.opensdk.player.service.XmPlayerService.XmPlayerImpl.7
                    }.getType());
                    if (commonTrackList.getTracks() == null || commonTrackList.getTracks().size() == 0) {
                        z2 = true;
                    }
                    if (z2) {
                        z = z2;
                    } else {
                        XmPlayerService.getPlayerSrvice().setPlayList(commonTrackList.getParams(), commonTrackList.getTracks());
                        if (XmPlayerService.getPlayerSrvice().play(i)) {
                            z = z2;
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    CdnUtil.statToXDCSError(CdnConstants.PLAY_INFO, "setPlayByAlbumTracks:" + e.toString());
                }
            }
            if (z) {
                XmPlayerService.this.setCustomCallBackErrData("播放失败", j);
            } else {
                XmPlayerService.this.setCustomCallBackSuccessData("播放成功", 0, j);
            }
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
        public void setPlayByTrack(String str, long j) throws RemoteException {
            boolean zIsEmpty = TextUtils.isEmpty(str);
            if (XmPlayerService.getPlayerSrvice() == null) {
                return;
            }
            if (!zIsEmpty) {
                try {
                    XmPlayerService.getPlayerSrvice().setPlayList(null, Arrays.asList((Track) new Gson().fromJson(str, Track.class)));
                    if (!XmPlayerService.getPlayerSrvice().play(0)) {
                        zIsEmpty = true;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    CdnUtil.statToXDCSError(CdnConstants.PLAY_INFO, "setPlayByTrack:" + e.toString());
                }
            }
            if (zIsEmpty) {
                XmPlayerService.this.setCustomCallBackErrData("播放失败", j);
            }
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
        public void setPlayCdnConfigureModel(CdnConfigModel cdnConfigModel) throws RemoteException {
            CdnUtil.setCdnConfigModel(cdnConfigModel);
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
        public boolean setPlayIndex(int i) throws RemoteException {
            if (XmPlayerService.getPlayerSrvice() == null) {
                return false;
            }
            return XmPlayerService.getPlayerSrvice().play(i, false);
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
        public void setPlayList(Map map, List<Track> list) throws RemoteException {
            if (XmPlayerService.getPlayerSrvice() == null) {
                return;
            }
            XmPlayerService.getPlayerSrvice().setPlayList(map, list);
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
        public void setPlayListChangeListener(IXmDataCallback iXmDataCallback) throws RemoteException {
            XmPlayerService.this.mListControl.setPlayListChangeListener(iXmDataCallback);
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
        public void setPlayMode(String str) throws RemoteException {
            XmPlayListControl xmPlayListControl = XmPlayerService.this.mListControl;
            if (xmPlayListControl != null) {
                xmPlayListControl.setPlayMode(XmPlayListControl.PlayMode.valueOf(str));
            }
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
        public void setPlayModel(String str, int i, final long j) throws RemoteException {
            if (TextUtils.isEmpty(str)) {
                XmPlayerService.this.setCustomCallBackErrData("内容为null", j);
                return;
            }
            final HashMap map = new HashMap();
            map.put(DTransferConstants.SEARCH_KEY, str);
            if (i >= 0) {
                map.put(DTransferConstants.CATEGORY_ID, i + "");
            }
            CommonRequest.getSearchedTracks(map, new IDataCallBack<SearchTrackList>() { // from class: com.ximalaya.ting.android.opensdk.player.service.XmPlayerService.XmPlayerImpl.1
                @Override // com.ximalaya.ting.android.opensdk.datatrasfer.IDataCallBack
                public void onError(int i2, String str2) {
                    XmPlayerService.this.setCustomCallBackErrData(((String) map.get(DTransferConstants.SEARCH_KEY)) + str2, j);
                }

                @Override // com.ximalaya.ting.android.opensdk.datatrasfer.IDataCallBack
                public void onSuccess(SearchTrackList searchTrackList) {
                    if (searchTrackList != null && searchTrackList.getTracks() != null && searchTrackList.getTracks().size() > 0) {
                        XmPlayerService.getPlayerSrvice().setPlayList(map, searchTrackList.getTracks());
                        XmPlayerService.getPlayerSrvice().play(0);
                        return;
                    }
                    XmPlayerService.this.setCustomCallBackErrData(((String) map.get(DTransferConstants.SEARCH_KEY)) + "没有搜索的数据", j);
                }
            });
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
        public void setPlayStatisticClassName(String str) throws RemoteException {
            XmPlayerService.this.mStatisticsManager.setUploadClassName(str);
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
        public void setPlayerProcessRequestEnvironment(int i) throws RemoteException {
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
        public void setProxy(String str, int i, String str2, Map map) throws RemoteException {
            Config config = new Config();
            config.proxyHost = str;
            config.proxyPort = i;
            config.authorization = str2;
            config.property = map;
            setProxyNew(config);
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
        public void setProxyNew(Config config) throws RemoteException {
            Logger.e(XmPlayerService.TAG, "代理 setProxyNew " + config);
            XmPlayerService xmPlayerService = XmPlayerService.this;
            xmPlayerService.mConfig = config;
            xmPlayerService.mPlayerControl.setProxy(config);
            CommonRequest.getInstanse().onlySetHttpConfig(config);
            BaseCall.getInstanse().setHttpConfig(config);
            FileUtilBase.setProxy(XmPlayerService.this, config);
            HttpUrlUtil.mConfig = config;
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
        public void setRecordModel(RecordModel recordModel) throws RemoteException {
            if (XmPlayerService.this.mStatisticsManager != null) {
                XmPlayerService.this.mStatisticsManager.setRecordModel(recordModel);
            }
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
        public void setSoundTouchAllParams(float f, float f2, float f3) throws RemoteException {
            if (XmPlayerService.getPlayerSrvice() == null) {
                return;
            }
            XmPlayerService.getPlayerSrvice().setSoundTouchAllParams(f, f2, f3);
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
        public void setTokenInvalidForSDK(final IXmTokenInvalidForSDKCallBack iXmTokenInvalidForSDKCallBack) throws RemoteException {
            if (BaseUtil.isPlayerProcess(XmPlayerService.this)) {
                if (iXmTokenInvalidForSDKCallBack == null) {
                    CommonRequest.getInstanse().setITokenStateChange(null);
                } else {
                    CommonRequest.getInstanse().onlyUpdateContext(XmPlayerService.this);
                    CommonRequest.getInstanse().setITokenStateChange(new CommonRequest.ITokenStateChange() { // from class: com.ximalaya.ting.android.opensdk.player.service.XmPlayerService.XmPlayerImpl.12
                        @Override // com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.ITokenStateChange
                        public boolean getTokenByRefreshAsync() {
                            System.out.println("XmPlayerImpl呵呵.getTokenByRefreshAsync");
                            try {
                                return iXmTokenInvalidForSDKCallBack.getTokenByRefreshAsync();
                            } catch (Exception e) {
                                e.printStackTrace();
                                return false;
                            }
                        }

                        @Override // com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.ITokenStateChange
                        public boolean getTokenByRefreshSync() {
                            try {
                                AccessToken tokenByRefreshSync = iXmTokenInvalidForSDKCallBack.getTokenByRefreshSync();
                                System.out.println("XmPlayerImpl呵呵.getTokenByRefreshSync  =  " + tokenByRefreshSync);
                                if (tokenByRefreshSync == null) {
                                    return false;
                                }
                                XmPlayerImpl.this.setTokenToPlayForSDK(tokenByRefreshSync);
                                return true;
                            } catch (Exception e) {
                                e.printStackTrace();
                                return false;
                            }
                        }

                        @Override // com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest.ITokenStateChange
                        public void tokenLosted() {
                            System.out.println("XmPlayerImpl.tokenLosted");
                            try {
                                iXmTokenInvalidForSDKCallBack.tokenInvalid();
                            } catch (RemoteException e) {
                                e.printStackTrace();
                            }
                        }
                    });
                }
            }
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
        public void setTokenToPlayForSDK(AccessToken accessToken) throws RemoteException {
            XmPlayListControl xmPlayListControl;
            List<Track> playList;
            AccessTokenManager.getInstanse().setContext(XmPlayerService.this);
            AccessTokenManager.getInstanse().onlyUpdateAccessToken(accessToken);
            if ((accessToken != null && !TextUtils.isEmpty(accessToken.getUid())) || (xmPlayListControl = XmPlayerService.this.mListControl) == null || (playList = xmPlayListControl.getPlayList()) == null || playList.isEmpty()) {
                return;
            }
            for (int i = 0; i < playList.size(); i++) {
                Track track = playList.get(i);
                if (track != null) {
                    track.setAuthorized(false);
                }
            }
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
        public void setVolume(float f, float f2) throws RemoteException {
            XmPlayerService.this.mPlayerControl.setVolume(f, f2);
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
        public boolean startPlay() throws RemoteException {
            if (XmPlayerService.getPlayerSrvice() == null) {
                return false;
            }
            return XmPlayerService.getPlayerSrvice().startPlay();
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
        public boolean stopPlay() throws RemoteException {
            if (XmPlayerService.getPlayerSrvice() == null) {
                return false;
            }
            return XmPlayerService.getPlayerSrvice().stopPlay();
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
        public void subscribeAlbum(String str, boolean z, long j) throws RemoteException {
            long id;
            HashMap map = new HashMap();
            try {
                id = ((Album) new Gson().fromJson(str, Album.class)).getId();
            } catch (Exception e) {
                e.printStackTrace();
                id = 0;
            }
            map.put(DTransferConstants.ALBUMID, id + "");
            map.put("album", str);
            map.put("isSubscribed", z + "");
            XmPlayerService.this.getRequestMData(map, 121, j, XmPlayerService.OPENSDK_SUBSCRIBE_ALBUM);
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
        public void unregisteAdsListener(IXmAdsEventDispatcher iXmAdsEventDispatcher) throws RemoteException {
            if (iXmAdsEventDispatcher != null) {
                XmPlayerService.this.mAdsDispatcher.unregister(iXmAdsEventDispatcher);
            }
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
        public void unregisteCustomDataCallBack(IXmCustomDataCallBack iXmCustomDataCallBack) throws RemoteException {
            if (iXmCustomDataCallBack != null) {
                XmPlayerService.this.mCustomDataCallBack.unregister(iXmCustomDataCallBack);
            }
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
        public void unregisteMainDataSupportCallBack(IXmMainDataSupportDataCallback iXmMainDataSupportDataCallback) throws RemoteException {
            if (iXmMainDataSupportDataCallback != null) {
                XmPlayerService.this.mMainDataSupportCallbackList.unregister(iXmMainDataSupportDataCallback);
            }
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
        public void unregistePlayerListener(IXmPlayerEventDispatcher iXmPlayerEventDispatcher) throws RemoteException {
            if (iXmPlayerEventDispatcher == null || XmPlayerService.this.mPlayerDispatcher == null) {
                return;
            }
            XmPlayerService.this.mPlayerDispatcher.unregister(iXmPlayerEventDispatcher);
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
        public void updateTrackDownloadUrlInPlayList(Track track) throws RemoteException {
            int iIndexOf = XmPlayerService.this.mListControl.getPlayList().indexOf(track);
            if (iIndexOf < 0) {
                return;
            }
            XmPlayerService.this.mListControl.getPlayList().get(iIndexOf).setDownloadedSaveFilePath(track.getDownloadedSaveFilePath());
        }

        @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
        public boolean updateTrackInPlayList(Track track) throws RemoteException {
            int iIndexOf;
            if (track == null || (iIndexOf = XmPlayerService.this.mListControl.getPlayList().indexOf(track)) < 0) {
                return false;
            }
            XmPlayerService.this.mListControl.updateTrackInPlayList(iIndexOf, track);
            boolean zIsDarkNotificationBar = NotificationColorUtils.isDarkNotificationBar(XmPlayerService.this.mAppCtx);
            XmNotificationCreater instanse = XmNotificationCreater.getInstanse(XmPlayerService.this.mAppCtx);
            XmPlayerService xmPlayerService = XmPlayerService.this;
            instanse.updateModelDetail(xmPlayerService.mListControl, xmPlayerService.mNotificationManager, XmPlayerService.this.mNotification, XmPlayerService.this.mNotificationId, zIsDarkNotificationBar);
            return true;
        }
    }

    private void checkIsOk(Context context) {
        File file = new File(getTempFilePath(context));
        if (!file.exists() || file.list().length <= 5) {
            return;
        }
        String[] list = file.list(new FilenameFilter() { // from class: com.ximalaya.ting.android.opensdk.player.service.XmPlayerService.10
            @Override // java.io.FilenameFilter
            public boolean accept(File file2, String str) {
                if (str.endsWith(XmPlayerService.TEMP)) {
                    return true;
                }
                file2.deleteOnExit();
                return false;
            }
        });
        if (list.length > 5) {
            for (String str : list) {
                new File(str).deleteOnExit();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkIsPauseTime() {
        long jCurrentTimeMillis = this.mPauseTimeInMills - System.currentTimeMillis();
        if (this.mPauseTimeInMills <= 0 || jCurrentTimeMillis > 0) {
            return;
        }
        this.mPauseTimeInMills = 0L;
        try {
            if (getPlayerImpl().getPlayerStatus() == 3) {
                pausePlay();
            } else {
                this.mWillPause = true;
            }
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    private void downloadFile(final String str, final String str2) {
        MyAsyncTask.execute(new Runnable() { // from class: com.ximalaya.ting.android.opensdk.player.service.XmPlayerService.11
            @Override // java.lang.Runnable
            public void run() throws Throwable {
                FileOutputStream fileOutputStream = null;
                try {
                    try {
                        try {
                            HttpURLConnection httpURLConnection = HttpUrlUtil.getHttpURLConnection(FileUtilBase.reduceHttpsToHttp(XmPlayerService.this.mAppCtx, str), HttpUrlUtil.mConfig, "GET", new FreeFlowServiceUtil.ISetHttpUrlConnectAttribute() { // from class: com.ximalaya.ting.android.opensdk.player.service.XmPlayerService.11.1
                                @Override // com.ximalaya.ting.android.opensdk.httputil.util.freeflow.FreeFlowServiceUtil.ISetHttpUrlConnectAttribute
                                public void setHttpUrlConnectAttributes(@NonNull HttpURLConnection httpURLConnection2) {
                                    httpURLConnection2.setConnectTimeout(2000);
                                    httpURLConnection2.setReadTimeout(1000);
                                }
                            });
                            httpURLConnection.connect();
                            int responseCode = httpURLConnection.getResponseCode();
                            if (responseCode != 200) {
                                List list = (List) XmPlayerService.this.requestMap.get(str);
                                if (list != null && list.size() > 0) {
                                    Iterator it2 = list.iterator();
                                    while (it2.hasNext()) {
                                        ((IDataCallBack) it2.next()).onError(0, "resCode == " + responseCode);
                                    }
                                }
                                XmPlayerService.this.requestMap.remove(str);
                                return;
                            }
                            InputStream inputStream = httpURLConnection.getInputStream();
                            byte[] bArr = new byte[8192];
                            FileOutputStream fileOutputStream2 = new FileOutputStream(new File(str2 + XmPlayerService.TEMP), false);
                            while (true) {
                                try {
                                    int i = inputStream.read(bArr);
                                    if (i <= 0) {
                                        break;
                                    } else {
                                        fileOutputStream2.write(bArr, 0, i);
                                    }
                                } catch (Exception e) {
                                    e = e;
                                    fileOutputStream = fileOutputStream2;
                                    e.printStackTrace();
                                    List list2 = (List) XmPlayerService.this.requestMap.get(str);
                                    if (list2 != null && list2.size() > 0) {
                                        Iterator it3 = list2.iterator();
                                        while (it3.hasNext()) {
                                            ((IDataCallBack) it3.next()).onError(0, "错误了==" + e.getMessage());
                                        }
                                    }
                                    XmPlayerService.this.requestMap.remove(str);
                                    if (fileOutputStream == null) {
                                        return;
                                    } else {
                                        fileOutputStream.close();
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    fileOutputStream = fileOutputStream2;
                                    if (fileOutputStream != null) {
                                        try {
                                            fileOutputStream.close();
                                        } catch (IOException e2) {
                                            e2.printStackTrace();
                                        }
                                    }
                                    throw th;
                                }
                            }
                            fileOutputStream2.flush();
                            new File(str2 + XmPlayerService.TEMP).renameTo(new File(str2));
                            List list3 = (List) XmPlayerService.this.requestMap.get(str);
                            if (list3 != null && list3.size() > 0) {
                                Iterator it4 = list3.iterator();
                                while (it4.hasNext()) {
                                    ((IDataCallBack) it4.next()).onSuccess(str2);
                                }
                            }
                            XmPlayerService.this.requestMap.remove(str);
                            fileOutputStream2.close();
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } catch (Exception e3) {
                        e = e3;
                    }
                } catch (IOException e4) {
                    e4.printStackTrace();
                }
            }
        });
    }

    private void downloadUrlHaveCallBack(String str, IDataCallBack<String> iDataCallBack) {
        String filePath = getFilePath(str);
        if (new File(filePath).exists()) {
            if (iDataCallBack != null) {
                iDataCallBack.onSuccess(filePath);
                return;
            }
            return;
        }
        List<IDataCallBack<String>> list = this.requestMap.get(str);
        if (list != null && list.size() > 0) {
            list.add(iDataCallBack);
            return;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        copyOnWriteArrayList.add(iDataCallBack);
        this.requestMap.put(str, copyOnWriteArrayList);
        checkIsOk(this.mAppCtx);
        downloadFile(str, filePath);
    }

    public static <T> void getDataWithXDCS(String str, Map<String, String> map, IDataSupportCallBack<T> iDataSupportCallBack, Object... objArr) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public IDeviceInfoProvider getDeviceInfoProvider() {
        return new IDeviceInfoProvider() { // from class: com.ximalaya.ting.android.opensdk.player.service.XmPlayerService.12
            @Override // com.ximalaya.ting.android.opensdk.datatrasfer.IDeviceInfoProvider
            @Nullable
            public String imei() {
                if (XmPlayerService.this.mIXmCommonBusinessDispatcher == null) {
                    return null;
                }
                try {
                    return XmPlayerService.this.mIXmCommonBusinessDispatcher.imei();
                } catch (RemoteException e) {
                    e.printStackTrace();
                    return null;
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.datatrasfer.IDeviceInfoProvider
            @Nullable
            public String macAddress() {
                if (XmPlayerService.this.mIXmCommonBusinessDispatcher == null) {
                    return null;
                }
                try {
                    return XmPlayerService.this.mIXmCommonBusinessDispatcher.macAddress();
                } catch (RemoteException e) {
                    e.printStackTrace();
                    return null;
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.datatrasfer.IDeviceInfoProvider
            @Nullable
            public String oaid() {
                if (XmPlayerService.this.mIXmCommonBusinessDispatcher == null) {
                    return null;
                }
                try {
                    return XmPlayerService.this.mIXmCommonBusinessDispatcher.oaid();
                } catch (RemoteException e) {
                    e.printStackTrace();
                    return null;
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.datatrasfer.IDeviceInfoProvider
            @Nullable
            public String serial() {
                if (XmPlayerService.this.mIXmCommonBusinessDispatcher == null) {
                    return null;
                }
                try {
                    return XmPlayerService.this.mIXmCommonBusinessDispatcher.serial();
                } catch (RemoteException e) {
                    e.printStackTrace();
                    return null;
                }
            }
        };
    }

    private String getFilePath(String str) {
        return getTempDown(this.mAppCtx, DigestUtils.md5Hex(str) + ".xmwifi");
    }

    public static final Intent getIntent(Context context) {
        return new Intent(context, (Class<?>) XmPlayerService.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getLastPlayTrackInAlbumInner(String str) {
        try {
            String string = this.mPlayLastPlayTrackInAlbum.getString(str, null);
            if (TextUtils.isEmpty(string)) {
                return null;
            }
            return string.split(this.mSeparator)[0];
        } catch (Exception unused) {
            return null;
        }
    }

    public static XmPlayerService getPlayerSrvice() {
        return (XmPlayerService) mService;
    }

    private Radio getRadio(PlayableModel playableModel) {
        Schedule scheduleTrackToSchedule = ModelUtil.trackToSchedule((Track) playableModel);
        Radio radio = new Radio();
        radio.setDataId(scheduleTrackToSchedule.getRadioId());
        radio.setKind("schedule");
        radio.setRadioName(scheduleTrackToSchedule.getRadioName());
        radio.setProgramName(scheduleTrackToSchedule.getRelatedProgram().getProgramName());
        radio.setScheduleID(scheduleTrackToSchedule.getDataId());
        radio.setCoverUrlSmall(scheduleTrackToSchedule.getRelatedProgram().getBackPicUrl());
        radio.setCoverUrlLarge(scheduleTrackToSchedule.getRelatedProgram().getBackPicUrl());
        radio.setUpdateAt(System.currentTimeMillis());
        radio.setRate24AacUrl(scheduleTrackToSchedule.getRelatedProgram().getRate24AacUrl());
        radio.setRate24TsUrl(scheduleTrackToSchedule.getRelatedProgram().getRate24AacUrl());
        radio.setRate64AacUrl(scheduleTrackToSchedule.getRelatedProgram().getRate64AacUrl());
        radio.setRate64TsUrl(scheduleTrackToSchedule.getRelatedProgram().getRate64TsUrl());
        radio.setRadioPlayCount(scheduleTrackToSchedule.getRadioPlayCount());
        radio.setProgramId(scheduleTrackToSchedule.getRelatedProgram().getProgramId());
        return radio;
    }

    private String getRadioUrl(Radio radio) {
        boolean zIsConnectMOBILE = NetworkType.isConnectMOBILE(this.mAppCtx);
        if (zIsConnectMOBILE) {
            zIsConnectMOBILE = !this.mPlayerConfig.isUseTrackHighBitrate();
        }
        if (this.mPlayerConfig.isUseSystemPlayer()) {
            if (zIsConnectMOBILE) {
                String rate24TsUrl = radio.getRate24TsUrl();
                return TextUtils.isEmpty(rate24TsUrl) ? radio.getRate64TsUrl() : rate24TsUrl;
            }
            String rate64TsUrl = radio.getRate64TsUrl();
            return TextUtils.isEmpty(rate64TsUrl) ? radio.getRate24TsUrl() : rate64TsUrl;
        }
        if (zIsConnectMOBILE) {
            String rate24AacUrl = radio.getRate24AacUrl();
            return TextUtils.isEmpty(rate24AacUrl) ? radio.getRate64AacUrl() : rate24AacUrl;
        }
        String rate24AacUrl2 = radio.getRate24AacUrl();
        return TextUtils.isEmpty(rate24AacUrl2) ? radio.getRate64AacUrl() : rate24AacUrl2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getRequestMData(Map<String, String> map, final int i, final long j, String str) {
        Logger.e(TAG, "getRequestMData   type = " + i + "   ; urlKey = " + str);
        getDataWithXDCS(COMMREQUSTM_METHOD_NAME, map, new IDataSupportCallBack<String>() { // from class: com.ximalaya.ting.android.opensdk.player.service.XmPlayerService.7
            @Override // com.ximalaya.ting.android.opensdk.httputil.IDataSupportCallBack
            public void onError(int i2, String str2) {
                XmPlayerService.this.setMainDataSupportCallBackErrorData(str2, j);
            }

            @Override // com.ximalaya.ting.android.opensdk.httputil.IDataSupportCallBack
            public void onSuccess(String str2) {
                XmPlayerService.this.setMainDataSupportCallBackSuccessData(str2, i, j);
            }
        }, str);
    }

    private int getSoundHistoryPos(long j) {
        if (!this.mPlayerConfig.isBreakpointResume() || j == 0) {
            return -1;
        }
        try {
            return this.mPlayHistory.getInt("" + j, -1);
        } catch (Exception unused) {
            return (int) this.mPlayHistory.getLong("" + j, -1L);
        }
    }

    private static String getSuffixFromUrl(String str) {
        if (TextUtils.isEmpty(str) || !str.contains(".")) {
            return null;
        }
        return str.substring(str.lastIndexOf("."), str.length());
    }

    public static String getTempDown(Context context, String str) {
        String tempFilePath = getTempFilePath(context);
        File file = new File(tempFilePath);
        if (!file.exists()) {
            file.mkdirs();
        }
        return tempFilePath + File.separator + str;
    }

    @NonNull
    private static String getTempFilePath(Context context) {
        return context.getFilesDir().getPath() + "/downloadtempfile";
    }

    private void initPlayerService() {
        mService = this;
        isHtcu20 = "cn.sh.changxing.htcu20.onlineradio".equals(getPackageName());
        SharedPreferencesUtil.getInstanceForPlayer(this);
        if (this.mIDomainServerIpCallback == null) {
            IDomainServerIpCallback domainServerIpCallBack = HttpDNSUtilForOpenSDK.getDomainServerIpCallBack(this);
            this.mIDomainServerIpCallback = domainServerIpCallBack;
            StaticConfig.setDomainServerIpCallback(domainServerIpCallBack);
        }
        StaticConfig.setUseragent(CommonRequest.getUserAgent());
        if (this.mAppCtx == null) {
            this.mAppCtx = getApplicationContext();
        }
        if (this.provider == null) {
            this.provider = new WidgetProvider();
        }
        if (this.mPlayerConfig == null) {
            this.mPlayerConfig = XmPlayerConfig.getInstance(this.mAppCtx);
        }
        if (this.mPlayerControl == null) {
            XmPlayerControl xmPlayerControl = new XmPlayerControl(this.mAppCtx);
            this.mPlayerControl = xmPlayerControl;
            xmPlayerControl.setPlayerStatusListener(this.mPlayerStatusListener);
            this.mPlayerControl.setOnPlayDataOutputListener(this.mOnPlayDataOutputListener);
            this.mPlayerControl.setPlaySeekListener(this.mPlaySeekListener);
        }
        if (this.mListControl == null) {
            this.mListControl = new XmPlayListControl();
        }
        if (this.mPlayerImpl == null) {
            this.mPlayerImpl = new XmPlayerImpl();
        }
        if (this.mPlayHistory == null) {
            this.mPlayHistory = getSharedPreferences(PreferenceConstantsInOpenSdk.OPENSDK_FILENAME_PLAY_HISTORY_RECORD, 0);
        }
        if (this.mPlayLastPlayTrackInAlbum == null) {
            this.mPlayLastPlayTrackInAlbum = getSharedPreferences(PreferenceConstantsInOpenSdk.OPENSDK_FILENAME_PLAY_TRACK_HISTORY_RECORD, 0);
        }
        if (this.mPlayerAudioFocusControl == null) {
            this.mPlayerAudioFocusControl = new XmPlayerAudioFocusControl(this.mAppCtx);
        }
        XmStatisticsManager xmStatisticsManager = XmStatisticsManager.getInstance();
        this.mStatisticsManager = xmStatisticsManager;
        xmStatisticsManager.setContext(this);
        XmAdsManager xmAdsManager = XmAdsManager.getInstance(this.mAppCtx);
        this.mAdsManager = xmAdsManager;
        xmAdsManager.setAdsStatusListener(this.mAdsListener);
        this.mNotificationManager = (NotificationManager) this.mAppCtx.getSystemService(SleepHomeActivity.FROM_NOTIFICATION);
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannel = new NotificationChannel(XmNotificationCreater.CHANNEL_ID, "播放通知栏", 2);
            notificationChannel.enableLights(false);
            notificationChannel.setShowBadge(false);
            notificationChannel.setSound(null, null);
            notificationChannel.enableVibration(false);
            this.mNotificationManager.createNotificationChannel(notificationChannel);
        }
        if (this.mMediaControlManager == null) {
            try {
                MediaControlManager mediaControlManager = new MediaControlManager(this);
                this.mMediaControlManager = mediaControlManager;
                mediaControlManager.initMediaControl();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (this.mIStatToServerFactory == null) {
            StatToServerFactoryImplForOpen statToServerFactoryImplForOpen = new StatToServerFactoryImplForOpen();
            this.mIStatToServerFactory = statToServerFactoryImplForOpen;
            StaticConfig.setIStatToServerFactory(statToServerFactoryImplForOpen);
        }
        XmSecretKeyUtil.getInstance().init(mService.getApplicationContext());
        if (this.mAppCtx.getApplicationInfo().targetSdkVersion >= 26 && this.mustShowNotifation) {
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.ximalaya.ting.android.opensdk.player.service.XmPlayerService.3
                @Override // java.lang.Runnable
                public void run() {
                    if (XmPlayerService.this.mNotification == null) {
                        if (XmPlayerService.this.mNotificationNoCrash == null) {
                            try {
                                XmPlayerService.this.stopSelf();
                                return;
                            } catch (Exception e2) {
                                e2.printStackTrace();
                                return;
                            }
                        }
                        try {
                            XmPlayerService xmPlayerService = XmPlayerService.this;
                            xmPlayerService.startForeground(xmPlayerService.mNotificationIdNoCrash, XmPlayerService.this.mNotificationNoCrash);
                        } catch (Exception e3) {
                            e3.printStackTrace();
                        }
                    }
                }
            }, 3500L);
        }
        OnPlayErrorRetryUtilForPlayProcess.register(this);
        CommonRequest.getInstanse().onlyUpdateContext(this);
    }

    private boolean isNewList(List<? extends PlayableModel> list) {
        PlayableModel playableModel = this.mLastModel;
        return playableModel == null || list == null || !list.contains(playableModel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void playTrack(final Track track, final boolean z) {
        this.trackId = track.getDataId();
        Logger.logToSd("playTrack 13:" + System.currentTimeMillis());
        final String downloadUrl = getDownloadUrl(track);
        if (track.isPaid() && !track.isFree()) {
            IXmPlayerStatusListener iXmPlayerStatusListener = this.mPlayerStatusListener;
            if (iXmPlayerStatusListener != null) {
                iXmPlayerStatusListener.onBufferingStart();
            }
            HashMap map = new HashMap();
            final long j = this.trackId;
            CommonRequest.updateTrackForPlay(map, new IDataCallBack<String>() { // from class: com.ximalaya.ting.android.opensdk.player.service.XmPlayerService.4
                @Override // com.ximalaya.ting.android.opensdk.datatrasfer.IDataCallBack
                public void onError(int i, String str) {
                    if (j != XmPlayerService.this.trackId) {
                        return;
                    }
                    Logger.logToSd("playTrack 15:" + System.currentTimeMillis());
                    if (XmPlayerService.this.mPlayerStatusListener != null) {
                        XmPlayerService.this.mPlayerStatusListener.onBufferingStop();
                    }
                    if (i == 726) {
                        track.setAuthorized(false);
                        XmPlayerService.this.playTrackInner(null, track, z);
                        XmPlayerService.this.mPlayerStatusListener.onSoundSwitch(track, null);
                    } else {
                        XmPlayerService.this.playTrackInner(downloadUrl, track, z);
                    }
                    Logger.log("playTrack updateTrackForPlay error code:" + i + " msg:" + str);
                }

                @Override // com.ximalaya.ting.android.opensdk.datatrasfer.IDataCallBack
                public void onSuccess(String str) {
                    if (j != XmPlayerService.this.trackId) {
                        return;
                    }
                    Logger.logToSd("playTrack 14:" + System.currentTimeMillis());
                    if (XmPlayerService.this.mPlayerStatusListener != null) {
                        XmPlayerService.this.mPlayerStatusListener.onBufferingStop();
                    }
                    if (TextUtils.isEmpty(str)) {
                        XmPlayerService.this.playTrackInner(downloadUrl, track, z);
                    } else if (!track.isAuthorized() || TextUtils.isEmpty(downloadUrl)) {
                        XmPlayerService.this.playTrackInner(str, track, z);
                    } else {
                        XmPlayerService.this.playTrackInner(downloadUrl, track, z);
                    }
                }
            }, track);
            return;
        }
        Logger.logToSd("playTrack 16:" + System.currentTimeMillis());
        if (TextUtils.isEmpty(downloadUrl)) {
            downloadUrl = getTrackUrl(track);
        }
        if (!TextUtils.isEmpty(downloadUrl) || ((track.getType() == 4 && track.isVideo()) || track.getType() == 2147483547)) {
            if (track.getType() != 2147483547) {
                playTrackInner(downloadUrl, track, z);
                return;
            }
            playTrackInner(downloadUrl + XMediaPlayerConstants.LOCAL_SERVER_SUFFIX, track, z);
            return;
        }
        HashMap map2 = new HashMap();
        final long dataId = track.getDataId();
        map2.put("track_id", dataId + "");
        CommonRequest.getTrackInfo(map2, new IDataCallBack<TrackBaseInfo>() { // from class: com.ximalaya.ting.android.opensdk.player.service.XmPlayerService.5
            @Override // com.ximalaya.ting.android.opensdk.datatrasfer.IDataCallBack
            public void onError(int i, String str) {
                if (dataId == XmPlayerService.this.trackId) {
                    if (XmPlayerService.this.mAdsManager == null || !XmPlayerService.this.mAdsManager.isAdsActive()) {
                        XmPlayerService.this.playTrackInner(null, track, z);
                    }
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.datatrasfer.IDataCallBack
            public void onSuccess(@Nullable TrackBaseInfo trackBaseInfo) {
                if (trackBaseInfo == null || dataId != XmPlayerService.this.trackId) {
                    return;
                }
                if (XmPlayerService.this.mAdsManager == null || !XmPlayerService.this.mAdsManager.isAdsActive()) {
                    String trackUrlByBaseInfo = XmPlayerService.this.getTrackUrlByBaseInfo(trackBaseInfo);
                    TrackBaseInfo.updateTrackBaseInfoToTrack(trackBaseInfo, track);
                    XmPlayerService.this.playTrackInner(trackUrlByBaseInfo, track, z);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void playTrackInner(String str, Track track, boolean z) {
        int soundHistoryPos = getSoundHistoryPos(track.getDataId());
        if (soundHistoryPos < 0 || track.isAudition() || (track.getDataId() > 0 && track.getDuration() > 0 && soundHistoryPos > track.getDuration() * 1000)) {
            soundHistoryPos = 0;
        }
        if (TextUtils.isEmpty(str)) {
            str = getTrackUrl(track);
        }
        boolean zIsScreenOn = ((PowerManager) getSystemService("power")).isScreenOn();
        if (OpenSdkAdsDataHandler.getInstance().isEnableVideoAd() && !this.isPlayAdSuccess && zIsScreenOn) {
            long j = SharedPreferencesUtil.getInstance(this.mAppCtx).getLong(PreferenceConstantsInOpenSdk.OPENSDK_KEY_SDK_CAN_PLAY_AUDIO_NUMS);
            boolean z2 = j == 0 && !this.playIdList.contains(Long.valueOf(track.getDataId()));
            if (!z2 && !this.playIdList.contains(Long.valueOf(track.getDataId()))) {
                SharedPreferencesUtil.getInstance(CommonRequest.getInstanse().getContext()).saveLong(PreferenceConstantsInOpenSdk.OPENSDK_KEY_SDK_CAN_PLAY_AUDIO_NUMS, j - 1);
                this.playIdList.add(Long.valueOf(track.getDataId()));
            }
            if ((!track.isPaid() || track.isFree()) && z2) {
                if (BaseUtil.isAppOnForeground(CommonRequest.getInstanse().getContext())) {
                    popAdTipDialog(track, OpenSdkAdsDataHandler.getInstance().getUnlockTrackNum());
                } else {
                    Toast.makeText(CommonRequest.getInstanse().getContext(), "收听精彩内容前先看段小视频吧，完成观看可解锁" + OpenSdkAdsDataHandler.getInstance().getUnlockTrackNum() + "条声音", 0).show();
                }
                this.mPlayerStatusListener.onPlayPause();
                this.mPlayerControl.pause(false);
                return;
            }
        }
        if (this.isPlayAdSuccess) {
            this.isPlayAdSuccess = false;
        }
        if (z ? this.mPlayerControl.initAndPlay(str, soundHistoryPos) : this.mPlayerControl.initAndNotAutoPlay(str, soundHistoryPos)) {
            return;
        }
        this.mLastModel = null;
    }

    private boolean playTrackPrivate(PlayableModel playableModel, boolean z, int i, boolean z2) throws Exception {
        setLossAudioFocus(false);
        if (z) {
            this.mPlayerAudioFocusControl.setAudioFocusAtStartState();
        }
        if (!z) {
            boolean zIsDarkNotificationBar = NotificationColorUtils.isDarkNotificationBar(this.mAppCtx);
            XmNotificationCreater.getInstanse(this.mAppCtx).updateModelDetail(this.mListControl, this.mNotificationManager, this.mNotification, this.mNotificationId, zIsDarkNotificationBar);
            XmNotificationCreater.getInstanse(this.mAppCtx).updateViewStateAtPause(this.mNotificationManager, this.mNotification, this.mNotificationId, zIsDarkNotificationBar);
        }
        Logger.logToSd("play 6_0 mPlayerControl.resetMediaPlayer:" + System.currentTimeMillis());
        this.mPlayerControl.resetMediaPlayer();
        if (!(playableModel instanceof Track)) {
            if (!(playableModel instanceof Radio)) {
                return false;
            }
            this.mPlayerControl.init(getRadioUrl((Radio) playableModel), 0);
            return true;
        }
        final Track track = (Track) playableModel;
        if (z) {
            Logger.logToSd("play 6:" + System.currentTimeMillis());
            XmAdsManager.PlayAdsCallback playAdsCallback = new XmAdsManager.PlayAdsCallback() { // from class: com.ximalaya.ting.android.opensdk.player.service.XmPlayerService.6
                @Override // com.ximalaya.ting.android.opensdk.player.advertis.XmAdsManager.PlayAdsCallback
                public void onFinish(boolean z3) {
                    Logger.logToSd("play 7:" + System.currentTimeMillis());
                    try {
                        if (XmPlayerService.this.isLossAudioFocus()) {
                            XmPlayerService.this.setLossAudioFocus(false);
                            XmPlayerService.this.playTrack(track, false);
                            if (XmPlayerService.this.mPlayerStatusListener != null) {
                                XmPlayerService.this.mPlayerStatusListener.onPlayPause();
                            }
                        } else {
                            XmPlayerService.this.playTrack(track, z3);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        XmPlayerService.this.mLastModel = null;
                        Logger.logToSd("play 8:" + System.currentTimeMillis());
                        CdnUtil.statToXDCSError(CdnConstants.PLAY_INFO, "playAdsCallback:" + e.toString());
                    }
                }
            };
            if (this.isDLNAState || !z2 || isHtcu20) {
                this.mAdsManager.stopCurrentAdPlay();
                Logger.logToSd("play 11:" + System.currentTimeMillis());
                playAdsCallback.onFinish(true);
            } else {
                Logger.logToSd("play 12:" + System.currentTimeMillis());
                this.mAdsManager.playAds(track, i, playAdsCallback, false);
            }
        } else {
            Logger.logToSd("play 9:" + System.currentTimeMillis());
            try {
                playTrack(track, false);
            } catch (Exception e) {
                Logger.logToSd("play 10:" + System.currentTimeMillis());
                this.mLastModel = null;
                e.printStackTrace();
                CdnUtil.statToXDCSError(CdnConstants.PLAY_INFO, "playTrack:" + e.toString());
            }
        }
        return true;
    }

    private void popAdTipDialog(PlayableModel playableModel, long j) {
        synchronized (XmPlayerService.class) {
            int iBeginBroadcast = this.mPlayerDispatcher.beginBroadcast();
            for (int i = 0; i < iBeginBroadcast; i++) {
                try {
                    ((IXmPlayerEventDispatcher) this.mPlayerDispatcher.getBroadcastItem(i)).popAdTipDialog((Track) playableModel, j);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            this.mPlayerDispatcher.finishBroadcast();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeCheckIsPauseTime() {
        if (getTimeHander() == null || this.mCheckIsPauseTimeRunnable == null) {
            return;
        }
        getTimeHander().removeCallbacks(this.mCheckIsPauseTimeRunnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void saveLastPlayTrackInAlbum(Track track) {
        if (track == null || !PlayableModel.isTrackKind(track.getKind()) || track.getAlbum() == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = this.mPlayLastPlayTrackInAlbum.edit();
        Map<String, ?> all = this.mPlayLastPlayTrackInAlbum.getAll();
        if (all != null && all.size() > 500) {
            for (Map.Entry<String, ?> entry : all.entrySet()) {
                Object value = entry.getValue();
                if (value != null) {
                    if (System.currentTimeMillis() - Long.parseLong(value.toString().split(this.mSeparator)[1]) > this.mMaxSaveTime) {
                        editorEdit.remove(entry.getKey());
                    }
                }
            }
        }
        if (track.getAlbum() == null) {
            return;
        }
        editorEdit.putString("" + track.getAlbum().getAlbumId(), new GsonBuilder().serializeSpecialFloatingPointValues().create().toJson(track) + this.mSeparator + System.currentTimeMillis());
        if (Build.VERSION.SDK_INT >= 9) {
            editorEdit.apply();
        } else {
            editorEdit.commit();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendPlayCompleteBroadCast() {
        this.provider.onReceive(this.mAppCtx, new Intent(ConstantsOpenSdk.STATE_COMPLETE_ACTION));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendPlayerPauseBroadCast() {
        if (this.provider == null || this.mAppCtx == null) {
            return;
        }
        this.provider.onReceive(this.mAppCtx, new Intent(ConstantsOpenSdk.PAUSE_PLAYER_ACTION));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendPlayerStartBroadCast() {
        if (this.provider == null || this.mAppCtx == null) {
            return;
        }
        this.provider.onReceive(this.mAppCtx, new Intent(ConstantsOpenSdk.START_PLAYER_ACTION));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCustomCallBackErrData(String str, long j) {
        setMainDataSupportCallBackErrorData(str, j);
        RemoteCallbackList<IXmCustomDataCallBack> remoteCallbackList = this.mCustomDataCallBack;
        if (remoteCallbackList == null) {
            return;
        }
        int iBeginBroadcast = remoteCallbackList.beginBroadcast();
        for (int i = 0; i < iBeginBroadcast; i++) {
            try {
                ((IXmCustomDataCallBack) this.mCustomDataCallBack.getBroadcastItem(i)).onError(str);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
        this.mCustomDataCallBack.finishBroadcast();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCustomCallBackSuccessData(String str, int i, long j) {
        setMainDataSupportCallBackSuccessData(str, i, j);
        RemoteCallbackList<IXmCustomDataCallBack> remoteCallbackList = this.mCustomDataCallBack;
        if (remoteCallbackList == null) {
            return;
        }
        int iBeginBroadcast = remoteCallbackList.beginBroadcast();
        for (int i2 = 0; i2 < iBeginBroadcast; i2++) {
            try {
                ((IXmCustomDataCallBack) this.mCustomDataCallBack.getBroadcastItem(i2)).onSuccess(str, i);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
        this.mCustomDataCallBack.finishBroadcast();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMainDataSupportCallBackErrorData(String str, long j) {
        RemoteCallbackList<IXmMainDataSupportDataCallback> remoteCallbackList = this.mMainDataSupportCallbackList;
        if (remoteCallbackList == null) {
            return;
        }
        int iBeginBroadcast = remoteCallbackList.beginBroadcast();
        for (int i = 0; i < iBeginBroadcast; i++) {
            try {
                ((IXmMainDataSupportDataCallback) this.mMainDataSupportCallbackList.getBroadcastItem(i)).onError(str, j);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
        this.mMainDataSupportCallbackList.finishBroadcast();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMainDataSupportCallBackSuccessData(String str, int i, long j) {
        RemoteCallbackList<IXmMainDataSupportDataCallback> remoteCallbackList = this.mMainDataSupportCallbackList;
        if (remoteCallbackList == null) {
            return;
        }
        int iBeginBroadcast = remoteCallbackList.beginBroadcast();
        for (int i2 = 0; i2 < iBeginBroadcast; i2++) {
            try {
                ((IXmMainDataSupportDataCallback) this.mMainDataSupportCallbackList.getBroadcastItem(i2)).onSuccess(str, i, j);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
        this.mMainDataSupportCallbackList.finishBroadcast();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startCheckIsPauseTime() {
        if (this.mPauseTimeInMills <= 0) {
            return;
        }
        if (this.mCheckIsPauseTimeRunnable == null) {
            this.mCheckIsPauseTimeRunnable = new Runnable() { // from class: com.ximalaya.ting.android.opensdk.player.service.XmPlayerService.8
                @Override // java.lang.Runnable
                public void run() {
                    XmPlayerService.this.checkIsPauseTime();
                    XmPlayerService.this.getTimeHander().postDelayed(XmPlayerService.this.mCheckIsPauseTimeRunnable, 500L);
                }
            };
        }
        getTimeHander().postDelayed(this.mCheckIsPauseTimeRunnable, 500L);
    }

    public void closeApp() {
        try {
            IXmCommonBusinessDispatcher iXmCommonBusinessDispatcher = this.mIXmCommonBusinessDispatcher;
            if (iXmCommonBusinessDispatcher != null) {
                iXmCommonBusinessDispatcher.closeApp();
            }
        } catch (RemoteException e) {
            Logger.i(TAG, "close app " + e.toString());
        }
        try {
            XmPlayerManager.unBind();
            XmPlayerManagerForPlayer.unBind();
            stopSelf();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        if (mService == null || BaseUtil.isMainProcess(this)) {
            return;
        }
        Logger.i(TAG, "close app use stopself");
        try {
            stopSelf();
        } catch (Exception e3) {
            e3.printStackTrace();
        }
    }

    public void closeNotification() {
        if (this.mNotificationManager != null) {
            stopForeground(true);
            this.mNotificationManager.cancel(this.mNotificationId);
            Logger.log("process closeNotification mNotificationId:" + this.mNotificationId);
        }
    }

    public String getCurPlayUrl() {
        XmPlayerControl xmPlayerControl = this.mPlayerControl;
        if (xmPlayerControl != null) {
            return xmPlayerControl.getCurPlayUrl();
        }
        return null;
    }

    public PlayableModel getCurrPlayModel() {
        XmPlayListControl xmPlayListControl = this.mListControl;
        if (xmPlayListControl != null) {
            return xmPlayListControl.getCurrentPlayableModel();
        }
        return null;
    }

    public String getDownloadUrl(Track track) {
        String str = "";
        if (!track.canPlayTrack()) {
            return "";
        }
        String downloadedSaveFilePath = track.getDownloadedSaveFilePath();
        if (TextUtils.isEmpty(downloadedSaveFilePath)) {
            try {
                IXmCommonBusinessDispatcher iXmCommonBusinessDispatcher = this.mIXmCommonBusinessDispatcher;
                if (iXmCommonBusinessDispatcher != null) {
                    downloadedSaveFilePath = iXmCommonBusinessDispatcher.getDownloadPlayPath(track);
                }
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
        if (TextUtils.isEmpty(downloadedSaveFilePath)) {
            return null;
        }
        try {
            if (!new File(downloadedSaveFilePath).exists()) {
                return null;
            }
            if (downloadedSaveFilePath.contains(XMediaPlayerConstants.XM_SUFFIX)) {
                try {
                    this.mIXmCommonBusinessDispatcher.isOldTrackDownload(track);
                    return "null";
                } catch (Throwable unused) {
                }
            } else {
                str = downloadedSaveFilePath;
            }
            Logger.logToSd("XmPlayerService:method=getTrackUrl:path=" + str);
            return str;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public int getDuration() {
        if (getPlayerImpl() == null) {
            return 0;
        }
        try {
            return getPlayerImpl().getDuration();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public XmPlayerControl getPlayControl() {
        return this.mPlayerControl;
    }

    public int getPlayCurrPosition() {
        if (getPlayerImpl() == null) {
            return 0;
        }
        try {
            return getPlayerImpl().getPlayCurrPosition();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public XmPlayListControl getPlayListControl() {
        return this.mListControl;
    }

    public int getPlayListSize() {
        List<Track> playList = this.mListControl.getPlayList();
        if (playList == null) {
            return 0;
        }
        return playList.size();
    }

    public XmPlayListControl.PlayMode getPlayMode() {
        XmPlayListControl xmPlayListControl = this.mListControl;
        return xmPlayListControl != null ? xmPlayListControl.getPlayMode() : XmPlayListControl.PlayMode.PLAY_MODEL_LIST;
    }

    public PlayableModel getPlayableModel() {
        return this.mListControl.getCurrentPlayableModel();
    }

    public XmPlayerImpl getPlayerImpl() {
        return this.mPlayerImpl;
    }

    public Handler getTimeHander() {
        if (this.mTimeHandler == null) {
            this.mTimeHandler = new Handler(Looper.getMainLooper());
        }
        return this.mTimeHandler;
    }

    public String getTrackUrl(Track track) {
        String playPathHq;
        if (track == null) {
            return null;
        }
        String downloadUrl = getDownloadUrl(track);
        if (!TextUtils.isEmpty(downloadUrl)) {
            return downloadUrl;
        }
        boolean zIsConnectMOBILE = NetworkType.isConnectMOBILE(this.mAppCtx);
        if (zIsConnectMOBILE) {
            zIsConnectMOBILE = !this.mPlayerConfig.isUseTrackHighBitrate();
        }
        if (this.mListControl.getPlaySource() == 2 && (PlayableModel.isTrackKind(track.getKind()) || PlayableModel.KIND_LIVE_FLV.equals(track.getKind()))) {
            if (!zIsConnectMOBILE) {
                if (isHtcu20) {
                    String playUrl64 = track.getPlayUrl64();
                    if (!TextUtils.isEmpty(playUrl64)) {
                        return playUrl64;
                    }
                    String playUrl65 = track.getPlayUrl64();
                    if (!TextUtils.isEmpty(playUrl65)) {
                        return playUrl65;
                    }
                    String playUrl32 = track.getPlayUrl32();
                    if (!TextUtils.isEmpty(playUrl32)) {
                        return playUrl32;
                    }
                    String playUrl64M4a = track.getPlayUrl64M4a();
                    return TextUtils.isEmpty(playUrl64M4a) ? track.getPlayUrl24M4a() : playUrl64M4a;
                }
                String playPathHq2 = track.getPlayPathHq();
                if (!TextUtils.isEmpty(playPathHq2)) {
                    return playPathHq2;
                }
                String playUrl64M4a2 = track.getPlayUrl64M4a();
                if (!TextUtils.isEmpty(playUrl64M4a2)) {
                    return playUrl64M4a2;
                }
                String playUrl24M4a = track.getPlayUrl24M4a();
                if (!TextUtils.isEmpty(playUrl24M4a)) {
                    return playUrl24M4a;
                }
                String playUrl66 = track.getPlayUrl64();
                return TextUtils.isEmpty(playUrl66) ? track.getPlayUrl32() : playUrl66;
            }
            if (isHtcu20) {
                String playUrl33 = TextUtils.isEmpty(track.getPlayPathHq()) ? track.getPlayUrl32() : track.getPlayUrl64();
                if (!TextUtils.isEmpty(playUrl33)) {
                    return playUrl33;
                }
                String playUrl34 = track.getPlayUrl32();
                if (!TextUtils.isEmpty(playUrl34)) {
                    return playUrl34;
                }
                String playUrl67 = track.getPlayUrl64();
                if (!TextUtils.isEmpty(playUrl67)) {
                    return playUrl67;
                }
                String playPathHq3 = track.getPlayPathHq();
                if (!TextUtils.isEmpty(playPathHq3)) {
                    return playPathHq3;
                }
                String playUrl24M4a2 = track.getPlayUrl24M4a();
                return TextUtils.isEmpty(playUrl24M4a2) ? track.getPlayUrl64M4a() : playUrl24M4a2;
            }
            String playUrl24M4a3 = TextUtils.isEmpty(track.getPlayPathHq()) ? track.getPlayUrl24M4a() : track.getPlayUrl64M4a();
            if (!TextUtils.isEmpty(playUrl24M4a3)) {
                return playUrl24M4a3;
            }
            String playUrl24M4a4 = track.getPlayUrl24M4a();
            if (!TextUtils.isEmpty(playUrl24M4a4)) {
                return playUrl24M4a4;
            }
            String playUrl64M4a3 = track.getPlayUrl64M4a();
            if (!TextUtils.isEmpty(playUrl64M4a3)) {
                return playUrl64M4a3;
            }
            String playPathHq4 = track.getPlayPathHq();
            if (!TextUtils.isEmpty(playPathHq4)) {
                return playPathHq4;
            }
            String playUrl35 = track.getPlayUrl32();
            return TextUtils.isEmpty(playUrl35) ? track.getPlayUrl64() : playUrl35;
        }
        if (!"schedule".equals(track.getKind())) {
            if (this.mListControl.getPlaySource() != 3) {
                return downloadUrl;
            }
            if (this.mPlayerConfig.isUseSystemPlayer()) {
                if (zIsConnectMOBILE) {
                    String radioRate24TsUrl = track.getRadioRate24TsUrl();
                    return TextUtils.isEmpty(radioRate24TsUrl) ? track.getRadioRate64TsUrl() : radioRate24TsUrl;
                }
                String radioRate64TsUrl = track.getRadioRate64TsUrl();
                return TextUtils.isEmpty(radioRate64TsUrl) ? track.getRadioRate24TsUrl() : radioRate64TsUrl;
            }
            if (zIsConnectMOBILE) {
                String radioRate24AacUrl = track.getRadioRate24AacUrl();
                return TextUtils.isEmpty(radioRate24AacUrl) ? track.getRadioRate64AacUrl() : radioRate24AacUrl;
            }
            String radioRate64AacUrl = track.getRadioRate64AacUrl();
            return TextUtils.isEmpty(radioRate64AacUrl) ? track.getRadioRate24AacUrl() : radioRate64AacUrl;
        }
        if (zIsConnectMOBILE) {
            playPathHq = TextUtils.isEmpty(track.getPlayPathHq()) ? track.getPlayUrl24M4a() : track.getPlayUrl64M4a();
            if (TextUtils.isEmpty(playPathHq)) {
                playPathHq = track.getPlayUrl24M4a();
                if (TextUtils.isEmpty(playPathHq)) {
                    playPathHq = track.getPlayUrl64M4a();
                    if (TextUtils.isEmpty(playPathHq)) {
                        playPathHq = track.getPlayPathHq();
                        if (TextUtils.isEmpty(playPathHq)) {
                            playPathHq = track.getPlayUrl32();
                            if (TextUtils.isEmpty(playPathHq)) {
                                playPathHq = track.getPlayUrl64();
                            }
                        }
                    }
                }
            }
        } else {
            playPathHq = track.getPlayPathHq();
            if (TextUtils.isEmpty(playPathHq)) {
                playPathHq = track.getPlayUrl64M4a();
                if (TextUtils.isEmpty(playPathHq)) {
                    playPathHq = track.getPlayUrl24M4a();
                    if (TextUtils.isEmpty(playPathHq)) {
                        playPathHq = track.getPlayUrl64();
                        if (TextUtils.isEmpty(playPathHq)) {
                            playPathHq = track.getPlayUrl32();
                        }
                    }
                }
            }
        }
        if (!TextUtils.isEmpty(playPathHq)) {
            return playPathHq;
        }
        if (this.mPlayerConfig.isUseSystemPlayer()) {
            if (zIsConnectMOBILE) {
                String radioRate24TsUrl2 = track.getRadioRate24TsUrl();
                return TextUtils.isEmpty(radioRate24TsUrl2) ? track.getRadioRate64TsUrl() : radioRate24TsUrl2;
            }
            String radioRate64TsUrl2 = track.getRadioRate64TsUrl();
            return TextUtils.isEmpty(radioRate64TsUrl2) ? track.getRadioRate24TsUrl() : radioRate64TsUrl2;
        }
        if (zIsConnectMOBILE) {
            String radioRate24AacUrl2 = track.getRadioRate24AacUrl();
            if (!TextUtils.isEmpty(radioRate24AacUrl2)) {
                return radioRate24AacUrl2;
            }
            String radioRate64AacUrl2 = track.getRadioRate64AacUrl();
            if (!TextUtils.isEmpty(radioRate64AacUrl2)) {
                return radioRate64AacUrl2;
            }
            String radioRate24TsUrl3 = track.getRadioRate24TsUrl();
            return TextUtils.isEmpty(radioRate24TsUrl3) ? track.getRadioRate64TsUrl() : radioRate24TsUrl3;
        }
        String radioRate64AacUrl3 = track.getRadioRate64AacUrl();
        if (!TextUtils.isEmpty(radioRate64AacUrl3)) {
            return radioRate64AacUrl3;
        }
        String radioRate24AacUrl3 = track.getRadioRate24AacUrl();
        if (!TextUtils.isEmpty(radioRate24AacUrl3)) {
            return radioRate24AacUrl3;
        }
        String radioRate64TsUrl3 = track.getRadioRate64TsUrl();
        return TextUtils.isEmpty(radioRate64TsUrl3) ? track.getRadioRate24TsUrl() : radioRate64TsUrl3;
    }

    public String getTrackUrlByBaseInfo(TrackBaseInfo trackBaseInfo) {
        boolean zIsConnectMOBILE = NetworkType.isConnectMOBILE(this.mAppCtx);
        if (zIsConnectMOBILE) {
            zIsConnectMOBILE = !this.mPlayerConfig.isUseTrackHighBitrate();
        }
        if (zIsConnectMOBILE) {
            if (isHtcu20) {
                if (!TextUtils.isEmpty(null)) {
                    return null;
                }
                String playUrl32 = trackBaseInfo.getPlayUrl32();
                if (!TextUtils.isEmpty(playUrl32)) {
                    return playUrl32;
                }
                String playUrl64 = trackBaseInfo.getPlayUrl64();
                if (!TextUtils.isEmpty(playUrl64)) {
                    return playUrl64;
                }
                String playUrl24M4a = trackBaseInfo.getPlayUrl24M4a();
                return TextUtils.isEmpty(playUrl24M4a) ? trackBaseInfo.getPlayUrl64M4a() : playUrl24M4a;
            }
            if (!TextUtils.isEmpty(null)) {
                return null;
            }
            String playUrl24M4a2 = trackBaseInfo.getPlayUrl24M4a();
            if (!TextUtils.isEmpty(playUrl24M4a2)) {
                return playUrl24M4a2;
            }
            String playUrl64M4a = trackBaseInfo.getPlayUrl64M4a();
            if (!TextUtils.isEmpty(playUrl64M4a)) {
                return playUrl64M4a;
            }
            String playUrl33 = trackBaseInfo.getPlayUrl32();
            return TextUtils.isEmpty(playUrl33) ? trackBaseInfo.getPlayUrl64() : playUrl33;
        }
        if (!isHtcu20) {
            if (!TextUtils.isEmpty(null)) {
                return null;
            }
            String playUrl64M4a2 = trackBaseInfo.getPlayUrl64M4a();
            if (!TextUtils.isEmpty(playUrl64M4a2)) {
                return playUrl64M4a2;
            }
            String playUrl24M4a3 = trackBaseInfo.getPlayUrl24M4a();
            if (!TextUtils.isEmpty(playUrl24M4a3)) {
                return playUrl24M4a3;
            }
            String playUrl65 = trackBaseInfo.getPlayUrl64();
            return TextUtils.isEmpty(playUrl65) ? trackBaseInfo.getPlayUrl32() : playUrl65;
        }
        String playUrl66 = trackBaseInfo.getPlayUrl64();
        if (!TextUtils.isEmpty(playUrl66)) {
            return playUrl66;
        }
        String playUrl67 = trackBaseInfo.getPlayUrl64();
        if (!TextUtils.isEmpty(playUrl67)) {
            return playUrl67;
        }
        String playUrl34 = trackBaseInfo.getPlayUrl32();
        if (!TextUtils.isEmpty(playUrl34)) {
            return playUrl34;
        }
        String playUrl64M4a3 = trackBaseInfo.getPlayUrl64M4a();
        return TextUtils.isEmpty(playUrl64M4a3) ? trackBaseInfo.getPlayUrl24M4a() : playUrl64M4a3;
    }

    public XmPlayListControl.PlayMode getXmPlayMode() {
        if (getPlayListControl() != null) {
            try {
                return getPlayListControl().getPlayMode();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return XmPlayListControl.PlayMode.PLAY_MODEL_LIST;
    }

    public boolean isContinuePlay() {
        return this.isContinuePlay;
    }

    public synchronized boolean isLossAudioFocus() {
        return this.isLossAudioFocus;
    }

    public boolean isOnlineResource() {
        return this.mPlayerControl.isOnlineSource();
    }

    public boolean isPlaying() {
        XmPlayerControl xmPlayerControl = this.mPlayerControl;
        boolean z = xmPlayerControl != null && xmPlayerControl.getPlayerState() == 3;
        XmAdsManager xmAdsManager = this.mAdsManager;
        return z || (xmAdsManager != null ? xmAdsManager.isAdsPlaying() : false);
    }

    public void notifProgress(int i, int i2) {
        if (this.mPlayerStatusListener != null) {
            Logger.logToSd("XmPlayerService notifProgress " + i + "   duration :" + i2);
            this.mPlayerStatusListener.onPlayProgress(i, i2);
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        initPlayerService();
        Logger.i(TAG, "onBind " + this.mPlayerImpl.hashCode());
        return this.mPlayerImpl;
    }

    @Override // android.app.Service
    @SuppressLint({"NewApi"})
    public void onCreate() {
        super.onCreate();
        Logger.init(getApplicationContext());
        initPlayerService();
        Logger.i(TAG, "---onCreate");
    }

    @Override // android.app.Service
    public void onDestroy() {
        Logger.i(TAG, "---onDestroy");
        super.onDestroy();
        closeNotification();
        sendPlayerPauseBroadCast();
        stopPlay();
        stopForeground(true);
        this.mMediaControlManager.release();
        this.mPlayerControl.release();
        this.mStatisticsManager.release();
        this.mAdsManager.release();
        XmNotificationCreater.release();
        mService = null;
        this.mPlayerDispatcher.kill();
        this.mCustomDataCallBack.kill();
        this.mAdsDispatcher.kill();
        StaticConfig.release();
        this.mIDomainServerIpCallback = null;
        FileUtilBase.release();
        PlayCacheByLRU.release();
        CommonRequest.release();
        MediadataCrytoUtil.release();
        XmPlayerManagerForPlayer.release();
        OnPlayErrorRetryUtilForPlayProcess.unregister(this);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        if (intent != null) {
            this.mustShowNotifation = intent.getBooleanExtra(FLAG_MUST_TO_SHOW_NOTIFICATION, false);
        } else {
            this.mustShowNotifation = false;
        }
        initPlayerService();
        return 1;
    }

    public boolean pausePlay() {
        Logger.logToSd("pausePlay0:" + Arrays.toString(Thread.currentThread().getStackTrace()) + ":0pausePlay");
        if (!this.mAdsManager.isAdsActive()) {
            XmPlayerAudioFocusControl xmPlayerAudioFocusControl = this.mPlayerAudioFocusControl;
            if (xmPlayerAudioFocusControl != null) {
                xmPlayerAudioFocusControl.setAudioPauseManual(true);
            }
            return this.mPlayerControl.pause();
        }
        this.mAdsManager.pauseAd();
        IXmPlayerStatusListener iXmPlayerStatusListener = this.mPlayerStatusListener;
        if (iXmPlayerStatusListener != null) {
            iXmPlayerStatusListener.onPlayPause();
        }
        return true;
    }

    public boolean play(int i) {
        return play(i, true);
    }

    public boolean playCurrent() {
        int currIndex = this.mListControl.getCurrIndex();
        if (currIndex >= 0) {
            return play(currIndex);
        }
        return false;
    }

    public boolean playNext() {
        int nextIndex = this.mListControl.getNextIndex(true);
        Logger.logToSd("playNext index:" + nextIndex);
        if (nextIndex >= 0) {
            return play(nextIndex, true, 2);
        }
        return false;
    }

    public void playPauseNoNotif() {
        if (this.mPlayerControl != null) {
            Logger.logToSd("playPauseNoNotif:" + Arrays.toString(Thread.currentThread().getStackTrace()) + ":playPauseNoNotif");
            this.mPlayerControl.pause(false);
        }
    }

    public boolean playPre() {
        Logger.logToSd("playPre:" + Arrays.toString(Thread.currentThread().getStackTrace()) + ":playPre");
        int preIndex = this.mListControl.getPreIndex();
        if (preIndex >= 0) {
            return play(preIndex, true, 2);
        }
        return false;
    }

    @Deprecated
    public boolean playRadio(Radio radio) {
        this.mPlayerAudioFocusControl.setAudioFocusAtStartState();
        if (this.mPlayerConfig.isUseSystemPlayer() || radio == null) {
            return false;
        }
        try {
            if (radio.equals(this.mLastModel)) {
                return false;
            }
            this.mPlayerControl.stop();
            this.mListControl.setRadio(radio);
            this.mPlayerStatusListener.onSoundSwitch(this.mLastModel, radio);
            this.mPlayerControl.initAndPlay(getRadioUrl(radio), 0);
            this.mLastModel = radio;
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void requestAudioFocusControl() {
        this.mPlayerAudioFocusControl.setAudioFocusAtStartState();
    }

    @SuppressLint({"NewApi"})
    public void saveSoundHistoryPos(long j, int i) {
        if (j == 0 || !XmPlayerConfig.getInstance(this).isBreakpointResume()) {
            return;
        }
        SharedPreferences.Editor editorEdit = this.mPlayHistory.edit();
        editorEdit.putInt("" + j, i);
        if (Build.VERSION.SDK_INT >= 9) {
            editorEdit.apply();
        } else {
            editorEdit.commit();
        }
    }

    public void seekTo(int i) {
        if (getPlayerImpl() != null) {
            try {
                getPlayerImpl().seekTo(i);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void setLossAudioFocus(boolean z) {
        this.isLossAudioFocus = z;
    }

    public void setPlayDataOutPutListener(XMediaPlayer.OnPlayDataOutputListener onPlayDataOutputListener) {
        XmPlayerControl xmPlayerControl = this.mPlayerControl;
        if (xmPlayerControl != null) {
            xmPlayerControl.setOnPlayDataOutputListener(onPlayDataOutputListener);
        }
        this.mOnPlayDataOutputListener = onPlayDataOutputListener;
    }

    public void setPlayList(Map<String, String> map, List<Track> list) {
        this.mListControl.setPlayList(map, list);
    }

    public void setPlayStartCallback(XmAdsManager.IPlayStartCallBack iPlayStartCallBack) {
        this.mPlayStartCallBack = iPlayStartCallBack;
    }

    public void setSoundTouchAllParams(float f, float f2, float f3) {
        XmPlayerControl xmPlayerControl = this.mPlayerControl;
        if (xmPlayerControl != null) {
            xmPlayerControl.setSoundTouchAllParams(f, f2, f3);
        }
    }

    public void setVolume(float f, float f2) {
        XmPlayerControl xmPlayerControl = this.mPlayerControl;
        if (xmPlayerControl == null) {
            return;
        }
        xmPlayerControl.setVolume(f, f2);
    }

    public boolean startPlay(boolean z) {
        AdvertisList advertisList;
        Logger.logToSd("startPlay:" + Arrays.toString(Thread.currentThread().getStackTrace()) + ":startPlay");
        this.mPlayerAudioFocusControl.setAudioFocusAtStartState();
        XmAdsManager xmAdsManager = this.mAdsManager;
        if (xmAdsManager != null && xmAdsManager.isAdsActive()) {
            Logger.logToSd("startPlay 0");
            int playerStatue = this.mAdsManager.getPlayerStatue();
            if (playerStatue != 1 && playerStatue != 3) {
                Logger.logToSd("startPlay 2");
            } else if (this.mAdsManager.getAdsPlayer() != null) {
                this.mAdsManager.playAd();
                Logger.logToSd("startPlay 1");
                if (this.mAdsListener != null) {
                    XmAdsManager.TaskWrapper lastTask = this.mAdsManager.getLastTask();
                    Advertis advertis = null;
                    if (lastTask != null && (advertisList = lastTask.ads) != null) {
                        advertis = advertisList.getAdvertisList().get(0);
                    }
                    this.mAdsListener.onStartPlayAds(advertis, 0);
                }
                return true;
            }
            return false;
        }
        XmPlayerControl xmPlayerControl = this.mPlayerControl;
        if (xmPlayerControl == null) {
            Logger.logToSd("startPlay 3");
            return false;
        }
        if (z && xmPlayerControl.getPlayerState() == 9) {
            Logger.logToSd("startPlay 4");
            this.mPlayerControl.setShouldPlay(true);
            return false;
        }
        boolean zPlay = this.mPlayerControl.play(true);
        Logger.logToSd("startPlay 5 ret:" + zPlay);
        if (zPlay) {
            return zPlay;
        }
        int currIndex = this.mListControl.getCurrIndex();
        Logger.logToSd("startPlay 6 index:" + currIndex);
        if (currIndex < 0) {
            return zPlay;
        }
        Logger.logToSd("startPlay 7");
        return play(currIndex);
    }

    public boolean stopPlay() {
        Logger.logToSd("stopPlay:" + Arrays.toString(Thread.currentThread().getStackTrace()) + ":stopPlay");
        XmPlayerAudioFocusControl xmPlayerAudioFocusControl = this.mPlayerAudioFocusControl;
        if (xmPlayerAudioFocusControl != null) {
            xmPlayerAudioFocusControl.setAudioFocusAtStopState();
            this.mPlayerAudioFocusControl.setAudioPauseManual(true);
        }
        this.mLastModel = null;
        return this.mPlayerControl.stop();
    }

    public boolean play(int i, boolean z) {
        return play(i, z, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean play(int i, boolean z, int i2) {
        Logger.logToSd("play 0:" + System.currentTimeMillis());
        if (i >= 0 && i < this.mListControl.getCurrListSize()) {
            try {
                this.mListControl.setCurrIndex(i);
                Track track = (Track) this.mListControl.getPlayableModel(i);
                if (track == null) {
                    Logger.e(TAG, "Get current model return null, play fail");
                    this.mLastModel = null;
                    Logger.logToSd("play 1:" + System.currentTimeMillis());
                    return false;
                }
                int iIndexOf = this.mListControl.getPlayList().indexOf(this.mLastModel);
                Track track2 = iIndexOf >= 0 ? this.mListControl.getPlayList().get(iIndexOf) : null;
                if (track2 == null) {
                    track2 = this.mLastModel;
                }
                if ((track2 instanceof Track) && ((Track) track2).getAlbum() != null) {
                    Logger.log("Test statistic track" + ((Track) track2).getAlbum().getRecSrc());
                }
                PlayableModel playableModel = this.mLastModel;
                boolean z2 = playableModel == null || !track.equals(playableModel);
                PlayableModel playableModel2 = this.mLastModel;
                if (playableModel2 != null && track.equals(playableModel2) && track.isAuthorized() == ((Track) this.mLastModel).isAuthorized() && !this.resetListed) {
                    if (this.mLastModel != null && track.getAlbum() != null && ((Track) this.mLastModel).getAlbum() != null && track.getAlbum().getAlbumId() != ((Track) this.mLastModel).getAlbum().getAlbumId()) {
                        this.mPlayerStatusListener.onSoundSwitch(track2, track);
                    }
                    Logger.logToSd("play 3:" + System.currentTimeMillis());
                    this.mLastModel = track;
                    if (z) {
                        if (this.mAdsManager.isAdsActive()) {
                            int playerStatue = this.mAdsManager.getPlayerStatue();
                            if (playerStatue == 1 || playerStatue == 3) {
                                this.mAdsManager.playAd();
                            }
                            Logger.logToSd("play 4:" + System.currentTimeMillis());
                            return false;
                        }
                        boolean zPlay = this.mPlayerControl.play(true);
                        return !zPlay ? playTrackPrivate(this.mLastModel, z, i2, z2) : zPlay;
                    }
                    Logger.logToSd("play 5:" + System.currentTimeMillis());
                    return false;
                }
                this.mPlayerControl.pause(false);
                this.mPlayerStatusListener.onSoundSwitch(track2, track);
                this.mLastModel = track;
                Logger.logToSd("play 2:" + System.currentTimeMillis());
                return playTrackPrivate(track, z, i2, z2);
            } catch (Exception e) {
                e.printStackTrace();
                this.mLastModel = null;
                CdnUtil.statToXDCSError(CdnConstants.PLAY_INFO, "play(0):" + e.toString());
            }
        } else {
            Logger.e(TAG, "Index Out Of Bound, index:" + i + ", total:" + this.mListControl.getCurrListSize());
            this.mLastModel = null;
        }
        return false;
    }

    public String getSoundHistoryPos(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            String[] strArrSplit = str.split(",");
            for (int i = 0; i < strArrSplit.length; i++) {
                strArrSplit[i] = String.valueOf(getSoundHistoryPos(Long.valueOf(strArrSplit[i]).longValue()));
            }
            return TextUtils.join(",", strArrSplit);
        } catch (Exception unused) {
            return null;
        }
    }

    public boolean startPlay() {
        return startPlay(false);
    }
}
