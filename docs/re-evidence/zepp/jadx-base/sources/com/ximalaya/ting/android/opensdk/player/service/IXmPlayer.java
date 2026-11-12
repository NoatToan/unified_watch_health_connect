package com.ximalaya.ting.android.opensdk.player.service;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ximalaya.ting.android.opensdk.httputil.Config;
import com.ximalaya.ting.android.opensdk.model.live.radio.Radio;
import com.ximalaya.ting.android.opensdk.model.statistic.RecordModel;
import com.ximalaya.ting.android.opensdk.model.token.AccessToken;
import com.ximalaya.ting.android.opensdk.model.track.Track;
import com.ximalaya.ting.android.opensdk.model.xdcs.CdnConfigModel;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes22.dex */
public interface IXmPlayer extends IInterface {

    public static abstract class Stub extends Binder implements IXmPlayer {
        private static final String DESCRIPTOR = "com.ximalaya.ting.android.opensdk.player.service.IXmPlayer";
        public static final int TRANSACTION_addPlayList = 28;
        public static final int TRANSACTION_browseAlbums = 52;
        public static final int TRANSACTION_clearPlayCache = 33;
        public static final int TRANSACTION_closeNotification = 120;
        public static final int TRANSACTION_exitSoundAd = 110;
        public static final int TRANSACTION_getAlbumByCategoryId = 69;
        public static final int TRANSACTION_getAlbumByCategoryIdAndTag = 85;
        public static final int TRANSACTION_getAlbumInfo = 64;
        public static final int TRANSACTION_getAttentionAlbum = 63;
        public static final int TRANSACTION_getCategoriesList = 84;
        public static final int TRANSACTION_getCategoryModelList = 56;
        public static final int TRANSACTION_getCurPlayUrl = 46;
        public static final int TRANSACTION_getCurrIndex = 14;
        public static final int TRANSACTION_getCurrentTrackPlayedDuration = 115;
        public static final int TRANSACTION_getDefultPageSize = 68;
        public static final int TRANSACTION_getDuration = 15;
        public static final int TRANSACTION_getHistoryPos = 98;
        public static final int TRANSACTION_getHotContent = 57;
        public static final int TRANSACTION_getLastPlayTrackInAlbum = 100;
        public static final int TRANSACTION_getMainHotContent = 66;
        public static final int TRANSACTION_getMyCollect = 62;
        public static final int TRANSACTION_getNewRank = 67;
        public static final int TRANSACTION_getNextPlayList = 41;
        public static final int TRANSACTION_getParam = 31;
        public static final int TRANSACTION_getParseDeviceInfo = 70;
        public static final int TRANSACTION_getPlayCurrPosition = 16;
        public static final int TRANSACTION_getPlayList = 30;
        public static final int TRANSACTION_getPlayListOrder = 45;
        public static final int TRANSACTION_getPlayListSize = 32;
        public static final int TRANSACTION_getPlayMode = 25;
        public static final int TRANSACTION_getPlaySourceType = 23;
        public static final int TRANSACTION_getPlayerStatus = 13;
        public static final int TRANSACTION_getPrePlayList = 42;
        public static final int TRANSACTION_getProvinces = 81;
        public static final int TRANSACTION_getRadio = 22;
        public static final int TRANSACTION_getRadioList = 82;
        public static final int TRANSACTION_getRadioSchedules = 83;
        public static final int TRANSACTION_getRank = 65;
        public static final int TRANSACTION_getRecommendAlbumListByAlbumId = 80;
        public static final int TRANSACTION_getRecommendAlbumListByTrackId = 79;
        public static final int TRANSACTION_getSourseLists = 51;
        public static final int TRANSACTION_getSpecialListenList = 75;
        public static final int TRANSACTION_getSubjectDetail = 76;
        public static final int TRANSACTION_getSuggestAlbums = 74;
        public static final int TRANSACTION_getTags = 86;
        public static final int TRANSACTION_getTempo = 116;
        public static final int TRANSACTION_getTrack = 21;
        public static final int TRANSACTION_getTrackDetailInfo = 87;
        public static final int TRANSACTION_getTrackInfoSync = 88;
        public static final int TRANSACTION_getTrackListByLastTrack = 58;
        public static final int TRANSACTION_getTrackListByTrackIdAtAlbum = 78;
        public static final int TRANSACTION_getUserInfo = 61;
        public static final int TRANSACTION_hasNextSound = 12;
        public static final int TRANSACTION_hasPreSound = 11;
        public static final int TRANSACTION_haveNextPlayList = 106;
        public static final int TRANSACTION_havePrePlayList = 107;
        public static final int TRANSACTION_init = 47;
        public static final int TRANSACTION_insertPlayListHead = 114;
        public static final int TRANSACTION_isAdPlaying = 105;
        public static final int TRANSACTION_isAdsActive = 18;
        public static final int TRANSACTION_isBuffering = 108;
        public static final int TRANSACTION_isDLNAState = 72;
        public static final int TRANSACTION_isLoading = 112;
        public static final int TRANSACTION_isOnlineSource = 10;
        public static final int TRANSACTION_isPlaying = 17;
        public static final int TRANSACTION_needContinuePlay = 73;
        public static final int TRANSACTION_notifyConfigChange = 119;
        public static final int TRANSACTION_pausePlay = 7;
        public static final int TRANSACTION_pausePlayInMillis = 104;
        public static final int TRANSACTION_permutePlayList = 44;
        public static final int TRANSACTION_play = 4;
        public static final int TRANSACTION_playNext = 3;
        public static final int TRANSACTION_playPre = 2;
        public static final int TRANSACTION_playRadio = 29;
        public static final int TRANSACTION_playRewardVideoAdSuccess = 121;
        public static final int TRANSACTION_registeAdsListener = 38;
        public static final int TRANSACTION_registeCommonBusinessListener = 40;
        public static final int TRANSACTION_registeCustomDataCallBack = 48;
        public static final int TRANSACTION_registeMainDataSupportCallBack = 59;
        public static final int TRANSACTION_registePlayerListener = 36;
        public static final int TRANSACTION_removeListByIndex = 97;
        public static final int TRANSACTION_requestSoundAd = 103;
        public static final int TRANSACTION_resetPlayList = 96;
        public static final int TRANSACTION_resetPlayer = 113;
        public static final int TRANSACTION_seekTo = 9;
        public static final int TRANSACTION_setAdsDataHandlerClassName = 94;
        public static final int TRANSACTION_setAppSecret = 35;
        public static final int TRANSACTION_setAppkeyAndPackId = 117;
        public static final int TRANSACTION_setBreakpointResume = 111;
        public static final int TRANSACTION_setCategoryId = 55;
        public static final int TRANSACTION_setDLNAState = 71;
        public static final int TRANSACTION_setHistoryPosById = 99;
        public static final int TRANSACTION_setNotification = 34;
        public static final int TRANSACTION_setNotificationForNoCrash = 118;
        public static final int TRANSACTION_setPageSize = 26;
        public static final int TRANSACTION_setPlayByAlbumTracks = 54;
        public static final int TRANSACTION_setPlayByTrack = 53;
        public static final int TRANSACTION_setPlayCdnConfigureModel = 95;
        public static final int TRANSACTION_setPlayIndex = 5;
        public static final int TRANSACTION_setPlayList = 27;
        public static final int TRANSACTION_setPlayListChangeListener = 43;
        public static final int TRANSACTION_setPlayMode = 24;
        public static final int TRANSACTION_setPlayModel = 50;
        public static final int TRANSACTION_setPlayStatisticClassName = 93;
        public static final int TRANSACTION_setPlayerProcessRequestEnvironment = 101;
        public static final int TRANSACTION_setProxy = 1;
        public static final int TRANSACTION_setProxyNew = 109;
        public static final int TRANSACTION_setRecordModel = 91;
        public static final int TRANSACTION_setSoundTouchAllParams = 102;
        public static final int TRANSACTION_setTokenInvalidForSDK = 89;
        public static final int TRANSACTION_setTokenToPlayForSDK = 90;
        public static final int TRANSACTION_setVolume = 92;
        public static final int TRANSACTION_startPlay = 6;
        public static final int TRANSACTION_stopPlay = 8;
        public static final int TRANSACTION_subscribeAlbum = 77;
        public static final int TRANSACTION_unregisteAdsListener = 39;
        public static final int TRANSACTION_unregisteCustomDataCallBack = 49;
        public static final int TRANSACTION_unregisteMainDataSupportCallBack = 60;
        public static final int TRANSACTION_unregistePlayerListener = 37;
        public static final int TRANSACTION_updateTrackDownloadUrlInPlayList = 19;
        public static final int TRANSACTION_updateTrackInPlayList = 20;

        public static class Proxy implements IXmPlayer {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
            public void addPlayList(List<Track> list) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeTypedList(list);
                    this.mRemote.transact(28, parcelObtain, parcelObtain2, 0);
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

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
            public void browseAlbums(long j, int i, int i2, long j2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeLong(j);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeLong(j2);
                    this.mRemote.transact(52, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
            public void clearPlayCache() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(33, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
            public void closeNotification() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(120, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
            public void exitSoundAd() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(110, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
            public void getAlbumByCategoryId(long j, int i, int i2, long j2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeLong(j);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeLong(j2);
                    this.mRemote.transact(69, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
            public void getAlbumByCategoryIdAndTag(long j, int i, int i2, int i3, long j2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeLong(j);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeInt(i3);
                    parcelObtain.writeLong(j2);
                    this.mRemote.transact(85, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
            public void getAlbumInfo(long j, int i, int i2, String str, long j2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeLong(j);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeString(str);
                    parcelObtain.writeLong(j2);
                    this.mRemote.transact(64, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
            public void getAttentionAlbum(int i, String str, long j) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str);
                    parcelObtain.writeLong(j);
                    this.mRemote.transact(63, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
            public void getCategoriesList(int i, int i2, long j) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeLong(j);
                    this.mRemote.transact(84, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
            public void getCategoryModelList(long j) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeLong(j);
                    this.mRemote.transact(56, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
            public String getCurPlayUrl() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(46, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
            public int getCurrIndex() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(14, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
            public long getCurrentTrackPlayedDuration() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(115, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readLong();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
            public int getDefultPageSize() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(68, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
            public int getDuration() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(15, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
            public String getHistoryPos(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(98, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
            public void getHotContent(boolean z, int i, int i2, long j) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(z ? 1 : 0);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeLong(j);
                    this.mRemote.transact(57, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
            public String getLastPlayTrackInAlbum(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(100, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
            public void getMainHotContent(int i, int i2, int i3, long j) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeInt(i3);
                    parcelObtain.writeLong(j);
                    this.mRemote.transact(66, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
            public void getMyCollect(int i, int i2, long j) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeLong(j);
                    this.mRemote.transact(62, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
            public void getNewRank(int i, int i2, int i3, long j) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeInt(i3);
                    parcelObtain.writeLong(j);
                    this.mRemote.transact(67, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
            public void getNextPlayList() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(41, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
            public Map getParam() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(31, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readHashMap(getClass().getClassLoader());
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
            public void getParseDeviceInfo(long j) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeLong(j);
                    this.mRemote.transact(70, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
            public int getPlayCurrPosition() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(16, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
            public List<Track> getPlayList(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    this.mRemote.transact(30, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.createTypedArrayList(Track.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
            public boolean getPlayListOrder() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(45, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
            public int getPlayListSize() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(32, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
            public String getPlayMode() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(25, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
            public int getPlaySourceType() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(23, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
            public int getPlayerStatus() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(13, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
            public void getPrePlayList() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(42, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
            public void getProvinces(long j) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeLong(j);
                    this.mRemote.transact(81, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
            public Radio getRadio() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(22, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0 ? Radio.CREATOR.createFromParcel(parcelObtain2) : null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
            public void getRadioList(int i, long j, int i2, int i3, long j2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeLong(j);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeInt(i3);
                    parcelObtain.writeLong(j2);
                    this.mRemote.transact(82, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
            public void getRadioSchedules(String str, long j) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeLong(j);
                    this.mRemote.transact(83, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
            public void getRank(String str, String str2, int i, long j) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeLong(j);
                    this.mRemote.transact(65, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
            public void getRecommendAlbumListByAlbumId(long j, long j2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeLong(j);
                    parcelObtain.writeLong(j2);
                    this.mRemote.transact(80, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
            public void getRecommendAlbumListByTrackId(long j, long j2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeLong(j);
                    parcelObtain.writeLong(j2);
                    this.mRemote.transact(79, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
            public void getSourseLists(String str, int i, int i2, int i3, int i4, long j) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeInt(i3);
                    parcelObtain.writeInt(i4);
                    parcelObtain.writeLong(j);
                    this.mRemote.transact(51, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
            public void getSpecialListenList(int i, int i2, int i3, long j) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeInt(i3);
                    parcelObtain.writeLong(j);
                    this.mRemote.transact(75, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
            public void getSubjectDetail(int i, int i2, long j, long j2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeLong(j);
                    parcelObtain.writeLong(j2);
                    this.mRemote.transact(76, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
            public void getSuggestAlbums(int i, int i2, boolean z, long j) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeInt(z ? 1 : 0);
                    parcelObtain.writeLong(j);
                    this.mRemote.transact(74, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
            public void getTags(long j, long j2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeLong(j);
                    parcelObtain.writeLong(j2);
                    this.mRemote.transact(86, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
            public float getTempo() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(116, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readFloat();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
            public Track getTrack(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    this.mRemote.transact(21, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0 ? Track.CREATOR.createFromParcel(parcelObtain2) : null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
            public void getTrackDetailInfo(long j, long j2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeLong(j);
                    parcelObtain.writeLong(j2);
                    this.mRemote.transact(87, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
            public Track getTrackInfoSync(long j) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeLong(j);
                    this.mRemote.transact(88, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0 ? Track.CREATOR.createFromParcel(parcelObtain2) : null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
            public void getTrackListByLastTrack(long j, long j2, int i, long j3) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeLong(j);
                    parcelObtain.writeLong(j2);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeLong(j3);
                    this.mRemote.transact(58, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
            public void getTrackListByTrackIdAtAlbum(long j, long j2, boolean z, long j3) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeLong(j);
                    parcelObtain.writeLong(j2);
                    parcelObtain.writeInt(z ? 1 : 0);
                    parcelObtain.writeLong(j3);
                    this.mRemote.transact(78, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
            public void getUserInfo(long j) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeLong(j);
                    this.mRemote.transact(61, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
            public boolean hasNextSound() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(12, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
            public boolean hasPreSound() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(11, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
            public boolean haveNextPlayList() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(106, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
            public boolean havePrePlayList() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(107, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
            public void init(String str, String str2, String str3) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeString(str3);
                    this.mRemote.transact(47, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
            public void insertPlayListHead(List<Track> list) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeTypedList(list);
                    this.mRemote.transact(114, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
            public boolean isAdPlaying() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(105, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
            public boolean isAdsActive() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(18, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
            public boolean isBuffering() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(108, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
            public boolean isDLNAState() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(72, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
            public boolean isLoading() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(112, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
            public boolean isOnlineSource() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(10, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
            public boolean isPlaying() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(17, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
            public void needContinuePlay(boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.mRemote.transact(73, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
            public void notifyConfigChange() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(119, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
            public boolean pausePlay() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
            public void pausePlayInMillis(long j) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeLong(j);
                    this.mRemote.transact(104, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
            public boolean permutePlayList() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(44, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
            public boolean play(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    this.mRemote.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
            public boolean playNext() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
            public boolean playPre() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
            public boolean playRadio(Radio radio) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (radio != null) {
                        parcelObtain.writeInt(1);
                        radio.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    this.mRemote.transact(29, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
            public void playRewardVideoAdSuccess(long j) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeLong(j);
                    this.mRemote.transact(121, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
            public void registeAdsListener(IXmAdsEventDispatcher iXmAdsEventDispatcher) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeStrongBinder(iXmAdsEventDispatcher != null ? iXmAdsEventDispatcher.asBinder() : null);
                    this.mRemote.transact(38, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
            public void registeCommonBusinessListener(IXmCommonBusinessDispatcher iXmCommonBusinessDispatcher) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeStrongBinder(iXmCommonBusinessDispatcher != null ? iXmCommonBusinessDispatcher.asBinder() : null);
                    this.mRemote.transact(40, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
            public void registeCustomDataCallBack(IXmCustomDataCallBack iXmCustomDataCallBack) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeStrongBinder(iXmCustomDataCallBack != null ? iXmCustomDataCallBack.asBinder() : null);
                    this.mRemote.transact(48, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
            public void registeMainDataSupportCallBack(IXmMainDataSupportDataCallback iXmMainDataSupportDataCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeStrongBinder(iXmMainDataSupportDataCallback != null ? iXmMainDataSupportDataCallback.asBinder() : null);
                    this.mRemote.transact(59, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
            public void registePlayerListener(IXmPlayerEventDispatcher iXmPlayerEventDispatcher) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeStrongBinder(iXmPlayerEventDispatcher != null ? iXmPlayerEventDispatcher.asBinder() : null);
                    this.mRemote.transact(36, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
            public void removeListByIndex(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    this.mRemote.transact(97, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
            public void requestSoundAd() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(103, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
            public void resetPlayList() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(96, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
            public void resetPlayer() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(113, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
            public boolean seekTo(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    this.mRemote.transact(9, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
            public void setAdsDataHandlerClassName(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(94, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
            public void setAppSecret(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(35, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
            public void setAppkeyAndPackId(String str, String str2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    this.mRemote.transact(117, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
            public void setBreakpointResume(boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.mRemote.transact(111, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
            public void setCategoryId(int i, long j) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeLong(j);
                    this.mRemote.transact(55, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
            public void setDLNAState(boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.mRemote.transact(71, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
            public void setHistoryPosById(long j, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeLong(j);
                    parcelObtain.writeInt(i);
                    this.mRemote.transact(99, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
            public void setNotification(int i, Notification notification) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    if (notification != null) {
                        parcelObtain.writeInt(1);
                        notification.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    this.mRemote.transact(34, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
            public void setNotificationForNoCrash(int i, Notification notification) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    if (notification != null) {
                        parcelObtain.writeInt(1);
                        notification.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    this.mRemote.transact(118, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
            public void setPageSize(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    this.mRemote.transact(26, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
            public void setPlayByAlbumTracks(String str, int i, long j) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeLong(j);
                    this.mRemote.transact(54, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
            public void setPlayByTrack(String str, long j) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeLong(j);
                    this.mRemote.transact(53, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
            public void setPlayCdnConfigureModel(CdnConfigModel cdnConfigModel) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (cdnConfigModel != null) {
                        parcelObtain.writeInt(1);
                        cdnConfigModel.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    this.mRemote.transact(95, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
            public boolean setPlayIndex(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    this.mRemote.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
            public void setPlayList(Map map, List<Track> list) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeMap(map);
                    parcelObtain.writeTypedList(list);
                    this.mRemote.transact(27, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
            public void setPlayListChangeListener(IXmDataCallback iXmDataCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeStrongBinder(iXmDataCallback != null ? iXmDataCallback.asBinder() : null);
                    this.mRemote.transact(43, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
            public void setPlayMode(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(24, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
            public void setPlayModel(String str, int i, long j) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeLong(j);
                    this.mRemote.transact(50, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
            public void setPlayStatisticClassName(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(93, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
            public void setPlayerProcessRequestEnvironment(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    this.mRemote.transact(101, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
            public void setProxy(String str, int i, String str2, Map map) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeMap(map);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
            public void setProxyNew(Config config) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (config != null) {
                        parcelObtain.writeInt(1);
                        config.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    this.mRemote.transact(109, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    if (parcelObtain2.readInt() != 0) {
                        config.readFromParcel(parcelObtain2);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
            public void setRecordModel(RecordModel recordModel) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (recordModel != null) {
                        parcelObtain.writeInt(1);
                        recordModel.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    this.mRemote.transact(91, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    if (parcelObtain2.readInt() != 0) {
                        recordModel.readFromParcel(parcelObtain2);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
            public void setSoundTouchAllParams(float f, float f2, float f3) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeFloat(f);
                    parcelObtain.writeFloat(f2);
                    parcelObtain.writeFloat(f3);
                    this.mRemote.transact(102, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
            public void setTokenInvalidForSDK(IXmTokenInvalidForSDKCallBack iXmTokenInvalidForSDKCallBack) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeStrongBinder(iXmTokenInvalidForSDKCallBack != null ? iXmTokenInvalidForSDKCallBack.asBinder() : null);
                    this.mRemote.transact(89, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
            public void setTokenToPlayForSDK(AccessToken accessToken) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (accessToken != null) {
                        parcelObtain.writeInt(1);
                        accessToken.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    this.mRemote.transact(90, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    if (parcelObtain2.readInt() != 0) {
                        accessToken.readFromParcel(parcelObtain2);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
            public void setVolume(float f, float f2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeFloat(f);
                    parcelObtain.writeFloat(f2);
                    this.mRemote.transact(92, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
            public boolean startPlay() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
            public boolean stopPlay() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(8, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
            public void subscribeAlbum(String str, boolean z, long j) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(z ? 1 : 0);
                    parcelObtain.writeLong(j);
                    this.mRemote.transact(77, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
            public void unregisteAdsListener(IXmAdsEventDispatcher iXmAdsEventDispatcher) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeStrongBinder(iXmAdsEventDispatcher != null ? iXmAdsEventDispatcher.asBinder() : null);
                    this.mRemote.transact(39, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
            public void unregisteCustomDataCallBack(IXmCustomDataCallBack iXmCustomDataCallBack) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeStrongBinder(iXmCustomDataCallBack != null ? iXmCustomDataCallBack.asBinder() : null);
                    this.mRemote.transact(49, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
            public void unregisteMainDataSupportCallBack(IXmMainDataSupportDataCallback iXmMainDataSupportDataCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeStrongBinder(iXmMainDataSupportDataCallback != null ? iXmMainDataSupportDataCallback.asBinder() : null);
                    this.mRemote.transact(60, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
            public void unregistePlayerListener(IXmPlayerEventDispatcher iXmPlayerEventDispatcher) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeStrongBinder(iXmPlayerEventDispatcher != null ? iXmPlayerEventDispatcher.asBinder() : null);
                    this.mRemote.transact(37, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
            public void updateTrackDownloadUrlInPlayList(Track track) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (track != null) {
                        parcelObtain.writeInt(1);
                        track.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    this.mRemote.transact(19, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    if (parcelObtain2.readInt() != 0) {
                        track.readFromParcel(parcelObtain2);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayer
            public boolean updateTrackInPlayList(Track track) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    boolean z = true;
                    if (track != null) {
                        parcelObtain.writeInt(1);
                        track.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    this.mRemote.transact(20, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    if (parcelObtain2.readInt() == 0) {
                        z = false;
                    }
                    if (parcelObtain2.readInt() != 0) {
                        track.readFromParcel(parcelObtain2);
                    }
                    return z;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IXmPlayer asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IXmPlayer)) ? new Proxy(iBinder) : (IXmPlayer) iInterfaceQueryLocalInterface;
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
                    setProxy(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readHashMap(getClass().getClassLoader()));
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean zPlayPre = playPre();
                    parcel2.writeNoException();
                    parcel2.writeInt(zPlayPre ? 1 : 0);
                    return true;
                case 3:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean zPlayNext = playNext();
                    parcel2.writeNoException();
                    parcel2.writeInt(zPlayNext ? 1 : 0);
                    return true;
                case 4:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean zPlay = play(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(zPlay ? 1 : 0);
                    return true;
                case 5:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean playIndex = setPlayIndex(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(playIndex ? 1 : 0);
                    return true;
                case 6:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean zStartPlay = startPlay();
                    parcel2.writeNoException();
                    parcel2.writeInt(zStartPlay ? 1 : 0);
                    return true;
                case 7:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean zPausePlay = pausePlay();
                    parcel2.writeNoException();
                    parcel2.writeInt(zPausePlay ? 1 : 0);
                    return true;
                case 8:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean zStopPlay = stopPlay();
                    parcel2.writeNoException();
                    parcel2.writeInt(zStopPlay ? 1 : 0);
                    return true;
                case 9:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean zSeekTo = seekTo(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(zSeekTo ? 1 : 0);
                    return true;
                case 10:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean zIsOnlineSource = isOnlineSource();
                    parcel2.writeNoException();
                    parcel2.writeInt(zIsOnlineSource ? 1 : 0);
                    return true;
                case 11:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean zHasPreSound = hasPreSound();
                    parcel2.writeNoException();
                    parcel2.writeInt(zHasPreSound ? 1 : 0);
                    return true;
                case 12:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean zHasNextSound = hasNextSound();
                    parcel2.writeNoException();
                    parcel2.writeInt(zHasNextSound ? 1 : 0);
                    return true;
                case 13:
                    parcel.enforceInterface(DESCRIPTOR);
                    int playerStatus = getPlayerStatus();
                    parcel2.writeNoException();
                    parcel2.writeInt(playerStatus);
                    return true;
                case 14:
                    parcel.enforceInterface(DESCRIPTOR);
                    int currIndex = getCurrIndex();
                    parcel2.writeNoException();
                    parcel2.writeInt(currIndex);
                    return true;
                case 15:
                    parcel.enforceInterface(DESCRIPTOR);
                    int duration = getDuration();
                    parcel2.writeNoException();
                    parcel2.writeInt(duration);
                    return true;
                case 16:
                    parcel.enforceInterface(DESCRIPTOR);
                    int playCurrPosition = getPlayCurrPosition();
                    parcel2.writeNoException();
                    parcel2.writeInt(playCurrPosition);
                    return true;
                case 17:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean zIsPlaying = isPlaying();
                    parcel2.writeNoException();
                    parcel2.writeInt(zIsPlaying ? 1 : 0);
                    return true;
                case 18:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean zIsAdsActive = isAdsActive();
                    parcel2.writeNoException();
                    parcel2.writeInt(zIsAdsActive ? 1 : 0);
                    return true;
                case 19:
                    parcel.enforceInterface(DESCRIPTOR);
                    Track trackCreateFromParcel = parcel.readInt() != 0 ? Track.CREATOR.createFromParcel(parcel) : null;
                    updateTrackDownloadUrlInPlayList(trackCreateFromParcel);
                    parcel2.writeNoException();
                    if (trackCreateFromParcel != null) {
                        parcel2.writeInt(1);
                        trackCreateFromParcel.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 20:
                    parcel.enforceInterface(DESCRIPTOR);
                    Track trackCreateFromParcel2 = parcel.readInt() != 0 ? Track.CREATOR.createFromParcel(parcel) : null;
                    boolean zUpdateTrackInPlayList = updateTrackInPlayList(trackCreateFromParcel2);
                    parcel2.writeNoException();
                    parcel2.writeInt(zUpdateTrackInPlayList ? 1 : 0);
                    if (trackCreateFromParcel2 != null) {
                        parcel2.writeInt(1);
                        trackCreateFromParcel2.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 21:
                    parcel.enforceInterface(DESCRIPTOR);
                    Track track = getTrack(parcel.readInt());
                    parcel2.writeNoException();
                    if (track != null) {
                        parcel2.writeInt(1);
                        track.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 22:
                    parcel.enforceInterface(DESCRIPTOR);
                    Radio radio = getRadio();
                    parcel2.writeNoException();
                    if (radio != null) {
                        parcel2.writeInt(1);
                        radio.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 23:
                    parcel.enforceInterface(DESCRIPTOR);
                    int playSourceType = getPlaySourceType();
                    parcel2.writeNoException();
                    parcel2.writeInt(playSourceType);
                    return true;
                case 24:
                    parcel.enforceInterface(DESCRIPTOR);
                    setPlayMode(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 25:
                    parcel.enforceInterface(DESCRIPTOR);
                    String playMode = getPlayMode();
                    parcel2.writeNoException();
                    parcel2.writeString(playMode);
                    return true;
                case 26:
                    parcel.enforceInterface(DESCRIPTOR);
                    setPageSize(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 27:
                    parcel.enforceInterface(DESCRIPTOR);
                    setPlayList(parcel.readHashMap(getClass().getClassLoader()), parcel.createTypedArrayList(Track.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 28:
                    parcel.enforceInterface(DESCRIPTOR);
                    addPlayList(parcel.createTypedArrayList(Track.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 29:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean zPlayRadio = playRadio(parcel.readInt() != 0 ? Radio.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeInt(zPlayRadio ? 1 : 0);
                    return true;
                case 30:
                    parcel.enforceInterface(DESCRIPTOR);
                    List<Track> playList = getPlayList(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeTypedList(playList);
                    return true;
                case 31:
                    parcel.enforceInterface(DESCRIPTOR);
                    Map param = getParam();
                    parcel2.writeNoException();
                    parcel2.writeMap(param);
                    return true;
                case 32:
                    parcel.enforceInterface(DESCRIPTOR);
                    int playListSize = getPlayListSize();
                    parcel2.writeNoException();
                    parcel2.writeInt(playListSize);
                    return true;
                case 33:
                    parcel.enforceInterface(DESCRIPTOR);
                    clearPlayCache();
                    parcel2.writeNoException();
                    return true;
                case 34:
                    parcel.enforceInterface(DESCRIPTOR);
                    setNotification(parcel.readInt(), parcel.readInt() != 0 ? (Notification) Notification.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 35:
                    parcel.enforceInterface(DESCRIPTOR);
                    setAppSecret(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 36:
                    parcel.enforceInterface(DESCRIPTOR);
                    registePlayerListener(IXmPlayerEventDispatcher.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 37:
                    parcel.enforceInterface(DESCRIPTOR);
                    unregistePlayerListener(IXmPlayerEventDispatcher.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 38:
                    parcel.enforceInterface(DESCRIPTOR);
                    registeAdsListener(IXmAdsEventDispatcher.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 39:
                    parcel.enforceInterface(DESCRIPTOR);
                    unregisteAdsListener(IXmAdsEventDispatcher.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 40:
                    parcel.enforceInterface(DESCRIPTOR);
                    registeCommonBusinessListener(IXmCommonBusinessDispatcher.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 41:
                    parcel.enforceInterface(DESCRIPTOR);
                    getNextPlayList();
                    parcel2.writeNoException();
                    return true;
                case 42:
                    parcel.enforceInterface(DESCRIPTOR);
                    getPrePlayList();
                    parcel2.writeNoException();
                    return true;
                case 43:
                    parcel.enforceInterface(DESCRIPTOR);
                    setPlayListChangeListener(IXmDataCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 44:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean zPermutePlayList = permutePlayList();
                    parcel2.writeNoException();
                    parcel2.writeInt(zPermutePlayList ? 1 : 0);
                    return true;
                case 45:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean playListOrder = getPlayListOrder();
                    parcel2.writeNoException();
                    parcel2.writeInt(playListOrder ? 1 : 0);
                    return true;
                case 46:
                    parcel.enforceInterface(DESCRIPTOR);
                    String curPlayUrl = getCurPlayUrl();
                    parcel2.writeNoException();
                    parcel2.writeString(curPlayUrl);
                    return true;
                case 47:
                    parcel.enforceInterface(DESCRIPTOR);
                    init(parcel.readString(), parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 48:
                    parcel.enforceInterface(DESCRIPTOR);
                    registeCustomDataCallBack(IXmCustomDataCallBack.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 49:
                    parcel.enforceInterface(DESCRIPTOR);
                    unregisteCustomDataCallBack(IXmCustomDataCallBack.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 50:
                    parcel.enforceInterface(DESCRIPTOR);
                    setPlayModel(parcel.readString(), parcel.readInt(), parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 51:
                    parcel.enforceInterface(DESCRIPTOR);
                    getSourseLists(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 52:
                    parcel.enforceInterface(DESCRIPTOR);
                    browseAlbums(parcel.readLong(), parcel.readInt(), parcel.readInt(), parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 53:
                    parcel.enforceInterface(DESCRIPTOR);
                    setPlayByTrack(parcel.readString(), parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 54:
                    parcel.enforceInterface(DESCRIPTOR);
                    setPlayByAlbumTracks(parcel.readString(), parcel.readInt(), parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 55:
                    parcel.enforceInterface(DESCRIPTOR);
                    setCategoryId(parcel.readInt(), parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 56:
                    parcel.enforceInterface(DESCRIPTOR);
                    getCategoryModelList(parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 57:
                    parcel.enforceInterface(DESCRIPTOR);
                    getHotContent(parcel.readInt() != 0, parcel.readInt(), parcel.readInt(), parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 58:
                    parcel.enforceInterface(DESCRIPTOR);
                    getTrackListByLastTrack(parcel.readLong(), parcel.readLong(), parcel.readInt(), parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 59:
                    parcel.enforceInterface(DESCRIPTOR);
                    registeMainDataSupportCallBack(IXmMainDataSupportDataCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 60:
                    parcel.enforceInterface(DESCRIPTOR);
                    unregisteMainDataSupportCallBack(IXmMainDataSupportDataCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 61:
                    parcel.enforceInterface(DESCRIPTOR);
                    getUserInfo(parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 62:
                    parcel.enforceInterface(DESCRIPTOR);
                    getMyCollect(parcel.readInt(), parcel.readInt(), parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 63:
                    parcel.enforceInterface(DESCRIPTOR);
                    getAttentionAlbum(parcel.readInt(), parcel.readString(), parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 64:
                    parcel.enforceInterface(DESCRIPTOR);
                    getAlbumInfo(parcel.readLong(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 65:
                    parcel.enforceInterface(DESCRIPTOR);
                    getRank(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 66:
                    parcel.enforceInterface(DESCRIPTOR);
                    getMainHotContent(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 67:
                    parcel.enforceInterface(DESCRIPTOR);
                    getNewRank(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 68:
                    parcel.enforceInterface(DESCRIPTOR);
                    int defultPageSize = getDefultPageSize();
                    parcel2.writeNoException();
                    parcel2.writeInt(defultPageSize);
                    return true;
                case 69:
                    parcel.enforceInterface(DESCRIPTOR);
                    getAlbumByCategoryId(parcel.readLong(), parcel.readInt(), parcel.readInt(), parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 70:
                    parcel.enforceInterface(DESCRIPTOR);
                    getParseDeviceInfo(parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 71:
                    parcel.enforceInterface(DESCRIPTOR);
                    setDLNAState(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 72:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean zIsDLNAState = isDLNAState();
                    parcel2.writeNoException();
                    parcel2.writeInt(zIsDLNAState ? 1 : 0);
                    return true;
                case 73:
                    parcel.enforceInterface(DESCRIPTOR);
                    needContinuePlay(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 74:
                    parcel.enforceInterface(DESCRIPTOR);
                    getSuggestAlbums(parcel.readInt(), parcel.readInt(), parcel.readInt() != 0, parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 75:
                    parcel.enforceInterface(DESCRIPTOR);
                    getSpecialListenList(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 76:
                    parcel.enforceInterface(DESCRIPTOR);
                    getSubjectDetail(parcel.readInt(), parcel.readInt(), parcel.readLong(), parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 77:
                    parcel.enforceInterface(DESCRIPTOR);
                    subscribeAlbum(parcel.readString(), parcel.readInt() != 0, parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 78:
                    parcel.enforceInterface(DESCRIPTOR);
                    getTrackListByTrackIdAtAlbum(parcel.readLong(), parcel.readLong(), parcel.readInt() != 0, parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 79:
                    parcel.enforceInterface(DESCRIPTOR);
                    getRecommendAlbumListByTrackId(parcel.readLong(), parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 80:
                    parcel.enforceInterface(DESCRIPTOR);
                    getRecommendAlbumListByAlbumId(parcel.readLong(), parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 81:
                    parcel.enforceInterface(DESCRIPTOR);
                    getProvinces(parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 82:
                    parcel.enforceInterface(DESCRIPTOR);
                    getRadioList(parcel.readInt(), parcel.readLong(), parcel.readInt(), parcel.readInt(), parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 83:
                    parcel.enforceInterface(DESCRIPTOR);
                    getRadioSchedules(parcel.readString(), parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 84:
                    parcel.enforceInterface(DESCRIPTOR);
                    getCategoriesList(parcel.readInt(), parcel.readInt(), parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 85:
                    parcel.enforceInterface(DESCRIPTOR);
                    getAlbumByCategoryIdAndTag(parcel.readLong(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 86:
                    parcel.enforceInterface(DESCRIPTOR);
                    getTags(parcel.readLong(), parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 87:
                    parcel.enforceInterface(DESCRIPTOR);
                    getTrackDetailInfo(parcel.readLong(), parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 88:
                    parcel.enforceInterface(DESCRIPTOR);
                    Track trackInfoSync = getTrackInfoSync(parcel.readLong());
                    parcel2.writeNoException();
                    if (trackInfoSync != null) {
                        parcel2.writeInt(1);
                        trackInfoSync.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 89:
                    parcel.enforceInterface(DESCRIPTOR);
                    setTokenInvalidForSDK(IXmTokenInvalidForSDKCallBack.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 90:
                    parcel.enforceInterface(DESCRIPTOR);
                    AccessToken accessTokenCreateFromParcel = parcel.readInt() != 0 ? AccessToken.CREATOR.createFromParcel(parcel) : null;
                    setTokenToPlayForSDK(accessTokenCreateFromParcel);
                    parcel2.writeNoException();
                    if (accessTokenCreateFromParcel != null) {
                        parcel2.writeInt(1);
                        accessTokenCreateFromParcel.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 91:
                    parcel.enforceInterface(DESCRIPTOR);
                    RecordModel recordModelCreateFromParcel = parcel.readInt() != 0 ? RecordModel.CREATOR.createFromParcel(parcel) : null;
                    setRecordModel(recordModelCreateFromParcel);
                    parcel2.writeNoException();
                    if (recordModelCreateFromParcel != null) {
                        parcel2.writeInt(1);
                        recordModelCreateFromParcel.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 92:
                    parcel.enforceInterface(DESCRIPTOR);
                    setVolume(parcel.readFloat(), parcel.readFloat());
                    parcel2.writeNoException();
                    return true;
                case 93:
                    parcel.enforceInterface(DESCRIPTOR);
                    setPlayStatisticClassName(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 94:
                    parcel.enforceInterface(DESCRIPTOR);
                    setAdsDataHandlerClassName(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 95:
                    parcel.enforceInterface(DESCRIPTOR);
                    setPlayCdnConfigureModel(parcel.readInt() != 0 ? CdnConfigModel.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 96:
                    parcel.enforceInterface(DESCRIPTOR);
                    resetPlayList();
                    parcel2.writeNoException();
                    return true;
                case 97:
                    parcel.enforceInterface(DESCRIPTOR);
                    removeListByIndex(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 98:
                    parcel.enforceInterface(DESCRIPTOR);
                    String historyPos = getHistoryPos(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeString(historyPos);
                    return true;
                case 99:
                    parcel.enforceInterface(DESCRIPTOR);
                    setHistoryPosById(parcel.readLong(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 100:
                    parcel.enforceInterface(DESCRIPTOR);
                    String lastPlayTrackInAlbum = getLastPlayTrackInAlbum(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeString(lastPlayTrackInAlbum);
                    return true;
                case 101:
                    parcel.enforceInterface(DESCRIPTOR);
                    setPlayerProcessRequestEnvironment(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 102:
                    parcel.enforceInterface(DESCRIPTOR);
                    setSoundTouchAllParams(parcel.readFloat(), parcel.readFloat(), parcel.readFloat());
                    parcel2.writeNoException();
                    return true;
                case 103:
                    parcel.enforceInterface(DESCRIPTOR);
                    requestSoundAd();
                    parcel2.writeNoException();
                    return true;
                case 104:
                    parcel.enforceInterface(DESCRIPTOR);
                    pausePlayInMillis(parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 105:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean zIsAdPlaying = isAdPlaying();
                    parcel2.writeNoException();
                    parcel2.writeInt(zIsAdPlaying ? 1 : 0);
                    return true;
                case 106:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean zHaveNextPlayList = haveNextPlayList();
                    parcel2.writeNoException();
                    parcel2.writeInt(zHaveNextPlayList ? 1 : 0);
                    return true;
                case 107:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean zHavePrePlayList = havePrePlayList();
                    parcel2.writeNoException();
                    parcel2.writeInt(zHavePrePlayList ? 1 : 0);
                    return true;
                case 108:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean zIsBuffering = isBuffering();
                    parcel2.writeNoException();
                    parcel2.writeInt(zIsBuffering ? 1 : 0);
                    return true;
                case 109:
                    parcel.enforceInterface(DESCRIPTOR);
                    Config configCreateFromParcel = parcel.readInt() != 0 ? Config.CREATOR.createFromParcel(parcel) : null;
                    setProxyNew(configCreateFromParcel);
                    parcel2.writeNoException();
                    if (configCreateFromParcel != null) {
                        parcel2.writeInt(1);
                        configCreateFromParcel.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 110:
                    parcel.enforceInterface(DESCRIPTOR);
                    exitSoundAd();
                    parcel2.writeNoException();
                    return true;
                case 111:
                    parcel.enforceInterface(DESCRIPTOR);
                    setBreakpointResume(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 112:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean zIsLoading = isLoading();
                    parcel2.writeNoException();
                    parcel2.writeInt(zIsLoading ? 1 : 0);
                    return true;
                case 113:
                    parcel.enforceInterface(DESCRIPTOR);
                    resetPlayer();
                    parcel2.writeNoException();
                    return true;
                case 114:
                    parcel.enforceInterface(DESCRIPTOR);
                    insertPlayListHead(parcel.createTypedArrayList(Track.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 115:
                    parcel.enforceInterface(DESCRIPTOR);
                    long currentTrackPlayedDuration = getCurrentTrackPlayedDuration();
                    parcel2.writeNoException();
                    parcel2.writeLong(currentTrackPlayedDuration);
                    return true;
                case 116:
                    parcel.enforceInterface(DESCRIPTOR);
                    float tempo = getTempo();
                    parcel2.writeNoException();
                    parcel2.writeFloat(tempo);
                    return true;
                case 117:
                    parcel.enforceInterface(DESCRIPTOR);
                    setAppkeyAndPackId(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 118:
                    parcel.enforceInterface(DESCRIPTOR);
                    setNotificationForNoCrash(parcel.readInt(), parcel.readInt() != 0 ? (Notification) Notification.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 119:
                    parcel.enforceInterface(DESCRIPTOR);
                    notifyConfigChange();
                    parcel2.writeNoException();
                    return true;
                case 120:
                    parcel.enforceInterface(DESCRIPTOR);
                    closeNotification();
                    parcel2.writeNoException();
                    return true;
                case 121:
                    parcel.enforceInterface(DESCRIPTOR);
                    playRewardVideoAdSuccess(parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    void addPlayList(List<Track> list) throws RemoteException;

    void browseAlbums(long j, int i, int i2, long j2) throws RemoteException;

    void clearPlayCache() throws RemoteException;

    void closeNotification() throws RemoteException;

    void exitSoundAd() throws RemoteException;

    void getAlbumByCategoryId(long j, int i, int i2, long j2) throws RemoteException;

    void getAlbumByCategoryIdAndTag(long j, int i, int i2, int i3, long j2) throws RemoteException;

    void getAlbumInfo(long j, int i, int i2, String str, long j2) throws RemoteException;

    void getAttentionAlbum(int i, String str, long j) throws RemoteException;

    void getCategoriesList(int i, int i2, long j) throws RemoteException;

    void getCategoryModelList(long j) throws RemoteException;

    String getCurPlayUrl() throws RemoteException;

    int getCurrIndex() throws RemoteException;

    long getCurrentTrackPlayedDuration() throws RemoteException;

    int getDefultPageSize() throws RemoteException;

    int getDuration() throws RemoteException;

    String getHistoryPos(String str) throws RemoteException;

    void getHotContent(boolean z, int i, int i2, long j) throws RemoteException;

    String getLastPlayTrackInAlbum(String str) throws RemoteException;

    void getMainHotContent(int i, int i2, int i3, long j) throws RemoteException;

    void getMyCollect(int i, int i2, long j) throws RemoteException;

    void getNewRank(int i, int i2, int i3, long j) throws RemoteException;

    void getNextPlayList() throws RemoteException;

    Map getParam() throws RemoteException;

    void getParseDeviceInfo(long j) throws RemoteException;

    int getPlayCurrPosition() throws RemoteException;

    List<Track> getPlayList(int i) throws RemoteException;

    boolean getPlayListOrder() throws RemoteException;

    int getPlayListSize() throws RemoteException;

    String getPlayMode() throws RemoteException;

    int getPlaySourceType() throws RemoteException;

    int getPlayerStatus() throws RemoteException;

    void getPrePlayList() throws RemoteException;

    void getProvinces(long j) throws RemoteException;

    Radio getRadio() throws RemoteException;

    void getRadioList(int i, long j, int i2, int i3, long j2) throws RemoteException;

    void getRadioSchedules(String str, long j) throws RemoteException;

    void getRank(String str, String str2, int i, long j) throws RemoteException;

    void getRecommendAlbumListByAlbumId(long j, long j2) throws RemoteException;

    void getRecommendAlbumListByTrackId(long j, long j2) throws RemoteException;

    void getSourseLists(String str, int i, int i2, int i3, int i4, long j) throws RemoteException;

    void getSpecialListenList(int i, int i2, int i3, long j) throws RemoteException;

    void getSubjectDetail(int i, int i2, long j, long j2) throws RemoteException;

    void getSuggestAlbums(int i, int i2, boolean z, long j) throws RemoteException;

    void getTags(long j, long j2) throws RemoteException;

    float getTempo() throws RemoteException;

    Track getTrack(int i) throws RemoteException;

    void getTrackDetailInfo(long j, long j2) throws RemoteException;

    Track getTrackInfoSync(long j) throws RemoteException;

    void getTrackListByLastTrack(long j, long j2, int i, long j3) throws RemoteException;

    void getTrackListByTrackIdAtAlbum(long j, long j2, boolean z, long j3) throws RemoteException;

    void getUserInfo(long j) throws RemoteException;

    boolean hasNextSound() throws RemoteException;

    boolean hasPreSound() throws RemoteException;

    boolean haveNextPlayList() throws RemoteException;

    boolean havePrePlayList() throws RemoteException;

    void init(String str, String str2, String str3) throws RemoteException;

    void insertPlayListHead(List<Track> list) throws RemoteException;

    boolean isAdPlaying() throws RemoteException;

    boolean isAdsActive() throws RemoteException;

    boolean isBuffering() throws RemoteException;

    boolean isDLNAState() throws RemoteException;

    boolean isLoading() throws RemoteException;

    boolean isOnlineSource() throws RemoteException;

    boolean isPlaying() throws RemoteException;

    void needContinuePlay(boolean z) throws RemoteException;

    void notifyConfigChange() throws RemoteException;

    boolean pausePlay() throws RemoteException;

    void pausePlayInMillis(long j) throws RemoteException;

    boolean permutePlayList() throws RemoteException;

    boolean play(int i) throws RemoteException;

    boolean playNext() throws RemoteException;

    boolean playPre() throws RemoteException;

    boolean playRadio(Radio radio) throws RemoteException;

    void playRewardVideoAdSuccess(long j) throws RemoteException;

    void registeAdsListener(IXmAdsEventDispatcher iXmAdsEventDispatcher) throws RemoteException;

    void registeCommonBusinessListener(IXmCommonBusinessDispatcher iXmCommonBusinessDispatcher) throws RemoteException;

    void registeCustomDataCallBack(IXmCustomDataCallBack iXmCustomDataCallBack) throws RemoteException;

    void registeMainDataSupportCallBack(IXmMainDataSupportDataCallback iXmMainDataSupportDataCallback) throws RemoteException;

    void registePlayerListener(IXmPlayerEventDispatcher iXmPlayerEventDispatcher) throws RemoteException;

    void removeListByIndex(int i) throws RemoteException;

    void requestSoundAd() throws RemoteException;

    void resetPlayList() throws RemoteException;

    void resetPlayer() throws RemoteException;

    boolean seekTo(int i) throws RemoteException;

    void setAdsDataHandlerClassName(String str) throws RemoteException;

    void setAppSecret(String str) throws RemoteException;

    void setAppkeyAndPackId(String str, String str2) throws RemoteException;

    void setBreakpointResume(boolean z) throws RemoteException;

    void setCategoryId(int i, long j) throws RemoteException;

    void setDLNAState(boolean z) throws RemoteException;

    void setHistoryPosById(long j, int i) throws RemoteException;

    void setNotification(int i, Notification notification) throws RemoteException;

    void setNotificationForNoCrash(int i, Notification notification) throws RemoteException;

    void setPageSize(int i) throws RemoteException;

    void setPlayByAlbumTracks(String str, int i, long j) throws RemoteException;

    void setPlayByTrack(String str, long j) throws RemoteException;

    void setPlayCdnConfigureModel(CdnConfigModel cdnConfigModel) throws RemoteException;

    boolean setPlayIndex(int i) throws RemoteException;

    void setPlayList(Map map, List<Track> list) throws RemoteException;

    void setPlayListChangeListener(IXmDataCallback iXmDataCallback) throws RemoteException;

    void setPlayMode(String str) throws RemoteException;

    void setPlayModel(String str, int i, long j) throws RemoteException;

    void setPlayStatisticClassName(String str) throws RemoteException;

    void setPlayerProcessRequestEnvironment(int i) throws RemoteException;

    void setProxy(String str, int i, String str2, Map map) throws RemoteException;

    void setProxyNew(Config config) throws RemoteException;

    void setRecordModel(RecordModel recordModel) throws RemoteException;

    void setSoundTouchAllParams(float f, float f2, float f3) throws RemoteException;

    void setTokenInvalidForSDK(IXmTokenInvalidForSDKCallBack iXmTokenInvalidForSDKCallBack) throws RemoteException;

    void setTokenToPlayForSDK(AccessToken accessToken) throws RemoteException;

    void setVolume(float f, float f2) throws RemoteException;

    boolean startPlay() throws RemoteException;

    boolean stopPlay() throws RemoteException;

    void subscribeAlbum(String str, boolean z, long j) throws RemoteException;

    void unregisteAdsListener(IXmAdsEventDispatcher iXmAdsEventDispatcher) throws RemoteException;

    void unregisteCustomDataCallBack(IXmCustomDataCallBack iXmCustomDataCallBack) throws RemoteException;

    void unregisteMainDataSupportCallBack(IXmMainDataSupportDataCallback iXmMainDataSupportDataCallback) throws RemoteException;

    void unregistePlayerListener(IXmPlayerEventDispatcher iXmPlayerEventDispatcher) throws RemoteException;

    void updateTrackDownloadUrlInPlayList(Track track) throws RemoteException;

    boolean updateTrackInPlayList(Track track) throws RemoteException;
}
