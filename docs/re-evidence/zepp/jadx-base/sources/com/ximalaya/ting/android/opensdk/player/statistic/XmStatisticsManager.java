package com.ximalaya.ting.android.opensdk.player.statistic;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.xiaomi.mipush.sdk.Constants;
import com.ximalaya.ting.android.opensdk.constants.PreferenceConstantsInOpenSdk;
import com.ximalaya.ting.android.opensdk.model.PlayableModel;
import com.ximalaya.ting.android.opensdk.model.history.XmPlayRecord;
import com.ximalaya.ting.android.opensdk.model.statistic.RecordModel;
import com.ximalaya.ting.android.opensdk.model.track.Track;
import com.ximalaya.ting.android.opensdk.player.service.XmPlayListControl;
import com.ximalaya.ting.android.opensdk.player.service.XmPlayerControl;
import com.ximalaya.ting.android.opensdk.player.service.XmPlayerService;
import com.ximalaya.ting.android.opensdk.util.BaseUtil;
import com.ximalaya.ting.android.opensdk.util.Logger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes22.dex */
public class XmStatisticsManager {
    private static final int STAT_ACTIVITY_COUNT = 3;
    private static final int STAT_DATA = 0;
    private static final int STAT_RADIO_COUNT = 2;
    private static final int STAT_TRACK_COUNT = 1;
    private static volatile XmStatisticsManager sInstance;
    private static byte[] sLock = new byte[0];
    private long blockTime1;
    private long blockTime2;
    private Context mContext;
    private boolean mIsKd;
    private boolean mIsSeek;
    private int mKd;
    private XmPlayRecord mRecord;
    private long mTotalLastBlockTime;
    private IXmUserOneDateListener mUserOneDateListener;
    private IXmPlayStatisticUpload upload;
    public String xmCurPlayResource;
    public Map<String, String> xmResourceMap;
    public String xmUploadPlayResource;
    private RecordModel mRecordModel = null;
    private boolean isShouldStatistic = false;
    public int mCurrPos1 = 0;
    private long totalPlaySec = 0;

    private XmStatisticsManager() {
        init();
    }

    public static XmStatisticsManager getInstance() {
        if (sInstance == null) {
            synchronized (sLock) {
                if (sInstance == null) {
                    sInstance = new XmStatisticsManager();
                }
            }
        }
        return sInstance;
    }

    private void init() {
        this.mRecord = new XmPlayRecord();
        XmPlayerControl.mPlayedDuration = 0L;
    }

    private boolean statActivityNow(Track track) {
        return track != null && "radio".equals(track.getKind()) && track.getExtra();
    }

    private boolean statRadioNow(Track track) {
        return track != null && "schedule".equals(track.getKind());
    }

    private boolean statTrackNow(Track track) {
        if (track != null) {
            return PlayableModel.isTrackKind(track.getKind()) || PlayableModel.KIND_TTS.equals(track.getKind());
        }
        return false;
    }

    private void updateXmPlayResource() {
        if (TextUtils.equals(this.xmCurPlayResource, this.xmUploadPlayResource) || TextUtils.isEmpty(this.xmCurPlayResource)) {
            return;
        }
        this.xmUploadPlayResource = this.xmCurPlayResource;
    }

    private void updateXmResource() {
        Map<String, String> map = this.xmResourceMap;
        if (map == null || this.mRecord == null || !map.containsKey("tid")) {
            return;
        }
        this.mRecord.setTid(this.xmResourceMap.get("tid"));
    }

    public boolean checkIsSeek(int i, int i2) {
        int i3 = i - this.mCurrPos1;
        this.mCurrPos1 = i;
        if (Math.abs(i3) > 1200) {
            this.mIsSeek = true;
        } else {
            this.mIsSeek = false;
        }
        return this.mIsSeek;
    }

    public void onPlayProgress(int i, int i2, boolean z) {
        IXmUserOneDateListener iXmUserOneDateListener = this.mUserOneDateListener;
        if (iXmUserOneDateListener != null) {
            iXmUserOneDateListener.onPlayProgress(i, i2, z);
        }
    }

    public void onPlayStart(int i, boolean z) {
        IXmUserOneDateListener iXmUserOneDateListener = this.mUserOneDateListener;
        if (iXmUserOneDateListener != null) {
            iXmUserOneDateListener.onPlayStart(i, z);
        }
    }

    public void onPlayStop() {
        IXmUserOneDateListener iXmUserOneDateListener = this.mUserOneDateListener;
        if (iXmUserOneDateListener != null) {
            iXmUserOneDateListener.onPlayStop();
        }
    }

    public void onPlayTrack(Track track, boolean z, int i, String str) {
        if (track == null || this.mRecord == null) {
            return;
        }
        this.isShouldStatistic = true;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (track.getDataId() != this.mRecord.getId() || (track.getDataId() == this.mRecord.getId() && XmPlayerService.getPlayerSrvice() != null && XmPlayerService.getPlayerSrvice().getXmPlayMode() == XmPlayListControl.PlayMode.PLAY_MODEL_SINGLE_LOOP)) {
            this.mTotalLastBlockTime = 0L;
            this.mIsKd = false;
            this.mKd = 0;
            this.blockTime1 = 0L;
            this.blockTime2 = 0L;
            this.mRecord.setDuration(0L);
            XmPlayerControl.mPlayedDuration = 0L;
            this.mRecord.setStartTime(jCurrentTimeMillis);
            if (!TextUtils.isEmpty(str)) {
                this.mRecord.setTrack_url(str);
            }
            if ("schedule".equals(track.getKind()) || "radio".equals(track.getKind())) {
                if (track.getExtra()) {
                    this.mRecord.setId(track.getDataId());
                    this.mRecord.setActivityId(track.getTrackActivityId());
                    this.mRecord.setIfPlayTrack(false);
                    this.mRecord.setIfPlayActivity(true);
                } else {
                    if (BaseUtil.isInTime(track.getStartTime() + Constants.ACCEPT_TIME_SEPARATOR_SERVER + track.getEndTime()) != 0) {
                        this.mRecord.setIfPlayTrack(true);
                        this.mRecord.setId(track.getDataId());
                        Logger.i("StatisticsManager", "object :track" + this.mRecord.getId());
                    } else {
                        if ("schedule".equals(track.getKind())) {
                            this.mRecord.setId(track.getRadioId());
                        } else if ("radio".equals(track.getKind())) {
                            this.mRecord.setId(track.getDataId());
                        }
                        this.mRecord.setIfPlayTrack(false);
                        this.mRecord.setIfPlayActivity(false);
                    }
                }
                Logger.i("StatisticsManager", "object :radio" + this.mRecord.getId() + " isPlayTrack:" + this.mRecord.isPlayTrack() + " isActivity:" + this.mRecord.isActivity());
            } else if (PlayableModel.isTrackKind(track.getKind()) || PlayableModel.KIND_TTS.equals(track.getKind())) {
                this.mRecord.setIfPlayTrack(true);
                this.mRecord.setId(track.getDataId());
                this.mRecord.setRecordKind(1);
                if (track.getAlbum() != null) {
                    this.mRecord.setAlbumId(track.getAlbum().getAlbumId());
                }
                Logger.i("StatisticsManager", "object :track" + this.mRecord.getId());
            } else if (PlayableModel.KIND_LIVE_FLV.equals(track.getKind())) {
                this.mRecord.setIfPlayTrack(true);
                this.mRecord.setId(track.getDataId());
                this.mRecord.setLiveRoomId(track.getLiveRoomId());
                if (track.getAnnouncer() != null) {
                    this.mRecord.setAnchorId(track.getAnnouncer().getAnnouncerId());
                }
                this.mRecord.setRecordKind(4);
            }
            this.mRecord.setBusinessType(track.getBusinessType());
            this.mRecord.setChannelId(track.getChannelId());
            this.mRecord.setPlayType(!z ? 1 : 0);
            if (this.upload != null && statTrackNow(track)) {
                this.mRecord.setStatType(1);
                this.upload.upLoadData(this.mRecord);
            } else if (this.upload != null && statRadioNow(track)) {
                this.mRecord.setStatType(2);
                this.upload.upLoadData(this.mRecord);
            } else if (this.upload != null && statActivityNow(track)) {
                this.mRecord.setStatType(3);
                this.upload.upLoadData(this.mRecord);
            }
        }
        if (this.mRecord.isPlayTrack()) {
            XmPlayerControl.mLastPostion = i;
        } else {
            XmPlayerControl.mLastPostion = System.currentTimeMillis();
        }
    }

    public void onSeekComplete(int i) {
        IXmUserOneDateListener iXmUserOneDateListener = this.mUserOneDateListener;
        if (iXmUserOneDateListener != null) {
            iXmUserOneDateListener.onSeekComplete(i);
        }
    }

    public void onSoundSwitch() {
        IXmUserOneDateListener iXmUserOneDateListener = this.mUserOneDateListener;
        if (iXmUserOneDateListener != null) {
            iXmUserOneDateListener.onSoundSwitch();
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0146  */
    public void onStopTrack(Track track, int i) {
        XmPlayRecord xmPlayRecord;
        long time;
        long jCurrentTimeMillis;
        int duration;
        if (track == null || (xmPlayRecord = this.mRecord) == null || !this.isShouldStatistic) {
            return;
        }
        this.isShouldStatistic = false;
        if (xmPlayRecord instanceof XmPlayRecord) {
            if (xmPlayRecord.isPlayTrack()) {
                this.mRecord.setPlayedSecs(i);
                time = 0;
                jCurrentTimeMillis = 0;
            } else {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yy:MM:dd:HH:mm", Locale.getDefault());
                if (TextUtils.isEmpty(track.getStartTime()) || TextUtils.isEmpty(track.getEndTime())) {
                    this.mRecord.setPlayedSecs(0L);
                    time = 0;
                    jCurrentTimeMillis = 0;
                } else {
                    try {
                        time = simpleDateFormat.parse(track.getStartTime()).getTime();
                        try {
                            jCurrentTimeMillis = System.currentTimeMillis();
                            try {
                                this.mRecord.setPlayedSecs(simpleDateFormat.parse(simpleDateFormat.format(new Date(System.currentTimeMillis()))).getTime() - time);
                            } catch (ParseException unused) {
                                this.mRecord.setPlayedSecs(0L);
                            }
                        } catch (ParseException unused2) {
                            jCurrentTimeMillis = 0;
                        }
                    } catch (ParseException unused3) {
                        time = 0;
                        jCurrentTimeMillis = 0;
                    }
                }
                this.mRecord.setProgramId(track.getProgramId());
                this.mRecord.setProgramScheduleId(track.getScheduleId());
            }
            int i2 = (int) XmPlayerControl.mPlayedDuration;
            long j = i2;
            this.totalPlaySec += j;
            SharedPreferences sharedPreferences = this.mContext.getSharedPreferences(PreferenceConstantsInOpenSdk.OPENSDK_FILENAME_TOTAL_PLAY_SEC, 4);
            long j2 = sharedPreferences.getLong(PreferenceConstantsInOpenSdk.OPENSDK_KEY_LISTENED_TIME_BEFORE_APPRAISED, 0L) * 1000;
            Logger.i("fjsdoifj", j2 + "    " + this.totalPlaySec);
            if (this.totalPlaySec > j2 && this.mContext != null && !sharedPreferences.getBoolean(PreferenceConstantsInOpenSdk.OPENSDK_KEY_IS_TIME_TO_APPRAISED, false)) {
                sharedPreferences.edit().putBoolean(PreferenceConstantsInOpenSdk.OPENSDK_KEY_IS_TIME_TO_APPRAISED, true).apply();
            }
            this.mRecord.setDuration(j);
            this.mRecord.setSendDataTime(System.currentTimeMillis());
            if (jCurrentTimeMillis == 0) {
                try {
                    jCurrentTimeMillis = new SimpleDateFormat("yy:MM:dd:HH:mm", Locale.getDefault()).parse(track.getEndTime()).getTime();
                } catch (Exception unused4) {
                    jCurrentTimeMillis = System.currentTimeMillis();
                }
            }
            this.mRecord.setEndTime(jCurrentTimeMillis);
            if (!this.mRecord.isPlayTrack()) {
                long j3 = jCurrentTimeMillis - time;
                if (j3 != 0) {
                    duration = (int) (j / j3);
                } else {
                    duration = 0;
                }
            } else if (track.getDuration() != 0) {
                duration = i2 / track.getDuration();
            } else {
                duration = 0;
            }
            this.mRecord.setClientTraffic((((long) duration) * track.getDownloadSize()) / 1000);
            Logger.log("Test statistic track onStopTrack old" + this.mRecord.getRecSrc());
            if (!TextUtils.isEmpty(track.getRecSrc())) {
                this.mRecord.setRecSrc(track.getRecSrc());
                this.mRecord.setRecTrack(track.getRecTrack());
            } else if (track.getAlbum() != null) {
                this.mRecord.setRecSrc(track.getAlbum().getRecSrc());
                this.mRecord.setRecTrack(track.getAlbum().getRecTrack());
                Logger.log("Test statistic track onStopTrack new" + track.getAlbum().getRecSrc());
            }
            this.mRecord.setPlaySource(track.getPlaySource());
            RecordModel recordModel = this.mRecordModel;
            if (recordModel != null) {
                this.mRecord.setConnect_type(recordModel.getType());
                this.mRecord.setConnect_device(this.mRecordModel.getDevice());
                this.mRecord.setConnect_deviceName(this.mRecordModel.getDeviceName());
            }
            this.mRecord.setStatType(0);
            if (this.upload == null) {
                this.upload = OpenSdkPlayStatisticUpload.getInstance();
            }
            Logger.i("StatisticsManager", "stop:position=" + i + "durtion=" + this.mRecord.getDuration());
            if (TextUtils.isEmpty(this.xmUploadPlayResource)) {
                this.xmUploadPlayResource = this.xmCurPlayResource;
            }
            this.mRecord.setBlockCount(this.mKd);
            this.mRecord.setBlockDuration(this.mTotalLastBlockTime);
            this.mRecord.setXmUploadPlayResource(this.xmUploadPlayResource);
            this.mRecord.setStartedPosition(i);
            updateXmResource();
            this.mRecord.setLocalWifi(track.getType() == 2147483547);
            this.upload.upLoadData(this.mRecord);
            updateXmPlayResource();
            XmPlayerControl.mPlayedDuration = 0L;
        }
    }

    public void release() {
        synchronized (sLock) {
            XmPlayerControl.mPlayedDuration = 0L;
            XmPlayerControl.mLastPostion = 0L;
            IXmUserOneDateListener iXmUserOneDateListener = this.mUserOneDateListener;
            if (iXmUserOneDateListener != null) {
                iXmUserOneDateListener.release();
            }
        }
    }

    public void setContext(Context context) {
        this.mContext = context;
    }

    public void setRecordModel(RecordModel recordModel) {
        this.mRecordModel = recordModel;
    }

    public void setUploadClassName(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            this.upload = (IXmPlayStatisticUpload) Class.forName(str).getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
        }
    }

    public void setUploadHandler(IXmPlayStatisticUpload iXmPlayStatisticUpload) {
        this.upload = iXmPlayStatisticUpload;
    }

    public void setUserOneDateListener(IXmUserOneDateListener iXmUserOneDateListener) {
        this.mUserOneDateListener = iXmUserOneDateListener;
    }

    public void setmIsSeek(boolean z) {
        this.mIsSeek = z;
    }

    public void stuckStatistics(int i, int i2, int i3) {
        int i4 = i != 0 ? (i * i2) / 100 : 0;
        if (i3 <= 15000 || i3 >= i2 - 15000 || i <= 5) {
            return;
        }
        if (i3 >= i4) {
            this.mIsKd = true;
            if (this.mIsSeek) {
                return;
            }
            this.mKd++;
            this.blockTime1 = System.currentTimeMillis();
            return;
        }
        if (i3 >= i4 + 3000 || !this.mIsKd) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.blockTime2 = jCurrentTimeMillis;
        long j = this.blockTime1;
        if (j != 0) {
            this.mTotalLastBlockTime += jCurrentTimeMillis - j;
            this.mIsKd = false;
        }
    }
}
