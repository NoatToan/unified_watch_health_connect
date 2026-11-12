package com.huawei.health.sportservice.manager.standflexion;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.media3.common.C;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.health.sportservice.SportDataNotify;
import com.huawei.health.sportservice.manager.BaseSportExamVoiceManager;
import com.huawei.health.sportservice.manager.BaseSportManager;
import com.huawei.health.sportservice.manager.ManagerComponent;
import com.huawei.health.sportservice.template.ComponentName;
import com.huawei.health.sportservice.template.SportComponentType;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwsportmodel.SportAchieveSubscribe;
import com.huawei.hwsportmodel.StandFlexionAchieveType;
import com.tencent.open.apireq.BaseResp;
import defpackage.hau;
import defpackage.iya;
import defpackage.njy;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes31.dex */
@SportComponentType(classify = 1, name = ComponentName.VOICE_MANAGER)
public class StandFlexionVoiceManager extends BaseSportExamVoiceManager implements ManagerComponent {
    private static final int ERROR_VOICE_FULL_BODY = 1;
    private static final int ERROR_VOICE_KNEE_SLIGHTLY = 3;
    private static final int ERROR_VOICE_SIDE_BODY = 2;
    private static final int FIRST_VOICE_STAGE = 1000;
    private static final int FOURTH_VOICE_STAGE = 210000;
    private static final int MSG_GET_SCORE_VOICE = 1;
    private static final int MSG_SOUND_SUCCESS = 4;
    private static final int MSG_SOUND_VOICE_ENCOURAGE = 5;
    private static final int PLAY_DELAY_TIME = 2000;
    private static final int SECOND_VOICE_STAGE = 30000;
    private static final String TAG = "SportService_StandFlexionVoiceManager";
    private static final int THIRD_VOICE_STAGE = 90000;
    private static final int VOICE_INTERVAL_ONE_SECOND = 1000;
    private StandFlexionAchieveType mAchieveType;
    private int mCurrentStatus;
    private boolean mHasSpeakFarWarning;
    private int mPreStatus;
    private int mScore;
    private int mStatus;
    private int mTempHighScore;
    private iya mTrackVoiceManager;
    private long mLastPlayScreenTime = 0;
    private long mLastPlaySideToScreen = 0;
    private long mLastStraightTime = 0;
    private long mLastPlayStartTime = 0;
    private hau mSportCallbackOption = new hau();
    private String mLanguage = "zh-CN";
    private boolean mIsStartSport = false;
    private boolean mIsLegalScore = false;
    private int playStraightSoundCount = 0;
    private Handler mHandler = new KeepStatusScoreHandler(Looper.getMainLooper(), this);

    @Override // com.huawei.health.sportservice.manager.BaseSportExamVoiceManager, com.huawei.health.sportservice.manager.ManagerComponent
    public void init() {
        super.init();
        this.mTrackVoiceManager = new iya(BaseSportManager.getInstance().getSportType(), -1);
    }

    @Override // com.huawei.health.sportservice.manager.BaseSportExamVoiceManager, com.huawei.health.sportservice.SportLifecycle
    public void onPreSport() {
        super.onPreSport();
        loadDownSound();
        ArrayList arrayList = new ArrayList();
        arrayList.add("STAND_FLEXION_HIGHEST_SCORE");
        arrayList.add("STATUS_CODE_DATA");
        arrayList.add("TIME_ONE_SECOND_DURATION");
        arrayList.add("STAND_FLEXION_SCORE_DATA");
        arrayList.add("STAND_FLEXION_IS_LEGAL_SCORE");
        arrayList.add("STAND_FLEXION_HIGHEST_SCORE_TEMP");
        this.mSportCallbackOption.e(arrayList);
        this.mSportCallbackOption.d(TAG);
        BaseSportManager.getInstance().subscribeNotify(this.mSportCallbackOption, new SportDataNotify() { // from class: com.huawei.health.sportservice.manager.standflexion.StandFlexionVoiceManager$$ExternalSyntheticLambda0
            @Override // com.huawei.health.sportservice.SportDataNotify
            public final void onChange(List list, Map map) {
                this.f$0.m1209xd4be6b3e(list, map);
            }
        });
        BaseSportManager.getInstance().registerAchieveLevel(TAG, new SportAchieveSubscribe() { // from class: com.huawei.health.sportservice.manager.standflexion.StandFlexionVoiceManager$$ExternalSyntheticLambda1
            @Override // com.huawei.hwsportmodel.SportAchieveSubscribe
            public final void onChange(Object obj) {
                this.f$0.m1210xedbfbcdd(obj);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$onPreSport$0$com-huawei-health-sportservice-manager-standflexion-StandFlexionVoiceManager, reason: not valid java name */
    /* synthetic */ void m1209xd4be6b3e(List list, Map map) {
        if (njy.e(list) || map == null) {
            LogUtil.j(TAG, "SportDataNotify failed");
            return;
        }
        if (list.contains("STAND_FLEXION_SCORE_DATA")) {
            this.mScore = ((Integer) map.get("STAND_FLEXION_SCORE_DATA")).intValue();
        }
        if (list.contains("STAND_FLEXION_HIGHEST_SCORE_TEMP")) {
            int iIntValue = ((Integer) map.get("STAND_FLEXION_HIGHEST_SCORE_TEMP")).intValue();
            this.mTempHighScore = iIntValue;
            LogUtil.a(TAG, "STAND_FLEXION_HIGHEST_SCORE_TEMP:", Integer.valueOf(iIntValue));
        }
        if (list.contains("STAND_FLEXION_IS_LEGAL_SCORE")) {
            this.mIsLegalScore = ((Boolean) map.get("STAND_FLEXION_IS_LEGAL_SCORE")).booleanValue();
            playDistinguish();
        }
        if (list.contains("STATUS_CODE_DATA")) {
            this.mScore = 0;
            this.mTempHighScore = 0;
            this.mStatus = ((Integer) map.get("STATUS_CODE_DATA")).intValue();
        }
        if (list.contains("TIME_ONE_SECOND_DURATION")) {
            statusDetect(((Long) map.get("TIME_ONE_SECOND_DURATION")).longValue());
        }
    }

    /* JADX INFO: renamed from: lambda$onPreSport$1$com-huawei-health-sportservice-manager-standflexion-StandFlexionVoiceManager, reason: not valid java name */
    /* synthetic */ void m1210xedbfbcdd(Object obj) {
        if (obj instanceof StandFlexionAchieveType) {
            this.mAchieveType = (StandFlexionAchieveType) obj;
        } else {
            this.mAchieveType = null;
        }
    }

    @Override // com.huawei.health.sportservice.manager.BaseSportExamVoiceManager
    public String getLogTag() {
        return TAG;
    }

    private void playDistinguish() {
        LogUtil.a(TAG, "playDistinguish isRealLegalScore", Boolean.valueOf(isRealLegalScore()));
        if (isRealLegalScore()) {
            speakNativeVoice("L021");
            this.mHandler.removeMessages(4);
            Handler handler = this.mHandler;
            handler.sendMessageDelayed(handler.obtainMessage(4), 2000L);
        }
    }

    private boolean isRealLegalScore() {
        return this.mIsLegalScore && this.mTempHighScore > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void playGetFinalScore() {
        LogUtil.a(TAG, "playGetFinalScore");
        speakNativeVoice("L022");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void playSuccessDistinguishVoice() {
        ReleaseLogUtil.d(TAG, "playSuccessDistinguishVoice isRealLegalScore:", Boolean.valueOf(isRealLegalScore()));
        if (isRealLegalScore()) {
            speakNativeVoice("L024");
            BaseSportManager.getInstance().stagingAndNotification("STAND_FLEXION_HIGHEST_SCORE", Integer.valueOf(this.mTempHighScore));
            this.mHandler.removeMessages(5);
            Handler handler = this.mHandler;
            handler.sendMessageDelayed(handler.obtainMessage(5), 1000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void playEncourageVoice() {
        ReleaseLogUtil.d(TAG, "playEncourageVoice mAchieveType:", Boolean.valueOf(this.mAchieveType == null));
        this.mHandler.removeMessages(1);
        StandFlexionAchieveType standFlexionAchieveType = this.mAchieveType;
        if (standFlexionAchieveType != null) {
            speakNativeVoice(standFlexionAchieveType.getVoicePath());
            Handler handler = this.mHandler;
            handler.sendMessageDelayed(handler.obtainMessage(1), C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
        } else {
            Handler handler2 = this.mHandler;
            handler2.sendMessage(handler2.obtainMessage(1));
        }
    }

    private void statusDetect(long j) {
        if (this.mIsStartSport) {
            if (!this.mHasSpeakFarWarning && this.mStatus == -4) {
                speakNativeVoice("L023");
                this.mHasSpeakFarWarning = true;
            }
            if (this.mStatus == 100 || this.mScore > 0) {
                resetValue();
                this.mHasSpeakFarWarning = false;
                return;
            }
            long j2 = this.mLastPlayStartTime;
            if (j2 == 0) {
                this.mLastPlayStartTime = j;
            } else {
                playErrorVoice(j - j2, j);
            }
        }
    }

    private void resetValue() {
        this.mLastPlayStartTime = 0L;
        this.mLastPlayScreenTime = 0L;
        this.mLastPlaySideToScreen = 0L;
        this.mLastStraightTime = 0L;
        this.playStraightSoundCount = 0;
        this.mPreStatus = 0;
    }

    private boolean isNeedResetErrorIntervalTime() {
        int i;
        int i2 = this.mPreStatus;
        return (i2 == 0 || i2 == (i = this.mCurrentStatus) || i == 0) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x004c  */
    /* JADX WARN: Code duplicated, block: B:22:0x0059  */
    private void playErrorVoice(long j, long j2) {
        int i = this.mStatus;
        if (i != -8 && i != 101) {
            if (i == -3 || i == -2 || i == -1) {
                this.mCurrentStatus = 1;
                if (isUpToThreshold(j, j2, this.mLastPlayScreenTime)) {
                    this.mPreStatus = 1;
                    speakNativeVoice("L001");
                    this.mLastPlayScreenTime = j2;
                }
            } else {
                switch (i) {
                    case BaseResp.CODE_PERMISSION_NOT_GRANTED /* -1003 */:
                    case BaseResp.CODE_UNSUPPORTED_BRANCH /* -1002 */:
                        this.mCurrentStatus = 3;
                        if (isUpToThreshold(j, j2, this.mLastStraightTime)) {
                            this.mPreStatus = 3;
                            speakNativeVoice("L003");
                            this.mLastStraightTime = j2;
                            this.playStraightSoundCount++;
                        }
                        break;
                    case BaseResp.CODE_QQ_LOW_VERSION /* -1001 */:
                        this.mCurrentStatus = 2;
                        if (isUpToThreshold(j, j2, this.mLastPlaySideToScreen)) {
                            this.mPreStatus = 2;
                            speakNativeVoice("L002");
                            this.mLastPlaySideToScreen = j2;
                        }
                        break;
                }
            }
        } else {
            this.mCurrentStatus = 2;
            if (isUpToThreshold(j, j2, this.mLastPlaySideToScreen)) {
                this.mPreStatus = 2;
                speakNativeVoice("L002");
                this.mLastPlaySideToScreen = j2;
            }
        }
        int i2 = this.mStatus;
        if (i2 != -1002 && i2 != -1003) {
            this.playStraightSoundCount = 0;
        } else if (this.playStraightSoundCount >= 2) {
            BaseSportManager.getInstance().stagingAndNotification("STAND_FLEXION_BEND_SHOW", true);
            this.playStraightSoundCount = 0;
        }
    }

    private boolean isUpToThreshold(long j, long j2, long j3) {
        if (isNeedResetErrorIntervalTime()) {
            LogUtil.a(TAG, "mPreStatus:", Integer.valueOf(this.mPreStatus), "mCurrentStatus:", Integer.valueOf(this.mCurrentStatus));
            resetValue();
            return false;
        }
        LogUtil.a(TAG, "duration", Long.valueOf(j2), "mLastPlayTime", Long.valueOf(j3), "interval", Long.valueOf(j));
        if (j2 - j3 <= 1000) {
            return false;
        }
        if (j >= 1000 && j < 2000) {
            return true;
        }
        if (j >= 30000 && j < 31000) {
            return true;
        }
        if (j < 90000 || j >= 91000) {
            return j >= 210000 && j < 211000;
        }
        return true;
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onStartSport() {
        this.mIsStartSport = true;
        speakNativeVoice("L006");
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onResumeSport() {
        iya iyaVar = this.mTrackVoiceManager;
        if (iyaVar != null) {
            iyaVar.f();
        }
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onPauseSport() {
        iya iyaVar = this.mTrackVoiceManager;
        if (iyaVar != null) {
            iyaVar.a();
        }
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    /* JADX INFO: renamed from: onStopSport */
    public void m825x32b3e3a1() {
        if (this.mTrackVoiceManager == null || !BaseSportManager.getInstance().isToSave()) {
            return;
        }
        this.mTrackVoiceManager.i();
    }

    @Override // com.huawei.health.sportservice.manager.BaseSportExamVoiceManager, com.huawei.health.sportservice.manager.ManagerComponent
    public void destroy() {
        super.destroy();
        BaseSportManager.getInstance().cancelSubscribeNotify(this.mSportCallbackOption);
    }

    static class KeepStatusScoreHandler extends BaseHandler<StandFlexionVoiceManager> {
        KeepStatusScoreHandler(Looper looper, StandFlexionVoiceManager standFlexionVoiceManager) {
            super(looper, standFlexionVoiceManager);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        public void handleMessageWhenReferenceNotNull(StandFlexionVoiceManager standFlexionVoiceManager, Message message) {
            if (message == null) {
                LogUtil.j(StandFlexionVoiceManager.TAG, "handleMessage message is null");
                return;
            }
            int i = message.what;
            if (i == 1) {
                standFlexionVoiceManager.playGetFinalScore();
            } else if (i == 4) {
                standFlexionVoiceManager.playSuccessDistinguishVoice();
            } else {
                if (i != 5) {
                    return;
                }
                standFlexionVoiceManager.playEncourageVoice();
            }
        }
    }
}
