package com.huawei.health.sportservice.manager.skip;

import android.content.Context;
import com.huawei.health.sportservice.SportDataNotify;
import com.huawei.health.sportservice.SportLaunchParams;
import com.huawei.health.sportservice.constants.SportParamsType;
import com.huawei.health.sportservice.manager.BaseSportManager;
import com.huawei.health.sportservice.manager.ManagerComponent;
import com.huawei.health.sportservice.template.ComponentName;
import com.huawei.health.sportservice.template.SportComponentType;
import com.huawei.healthcloud.plugintrack.manager.voice.BaseSoundEffectManager;
import com.huawei.healthcloud.plugintrack.manager.voice.constructor.ChineseVoiceConstructor;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwfoundationmodel.trackmodel.HeartRateData;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwsportmodel.SkipAchieveType;
import com.huawei.hwsportmodel.SportAchieveSubscribe;
import defpackage.hau;
import defpackage.iya;
import defpackage.jaq;
import defpackage.jau;
import defpackage.jax;
import defpackage.jcp;
import defpackage.pqj;
import defpackage.pqk;
import defpackage.pqp;
import defpackage.pqq;
import health.compact.a.CloudUtils;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.UnitUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes31.dex */
@SportComponentType(classify = 1, name = ComponentName.VOICE_MANAGER)
public class SkipVoiceManager implements ManagerComponent {
    private static final int COUNTDOWN_TIME = 10;
    private static final int FIRST_VOICE_STAGE = 1000;
    private static final int FOURTH_VOICE_STAGE = 210000;
    private static final int SECOND_VOICE_STAGE = 30000;
    private static final String SKIP_DOWN = "SKIP_DOWN";
    private static final String TAG = "SportService_SkipVoiceManager";
    private static final int THIRD_VOICE_STAGE = 90000;
    private static final int VOICE_INTERVAL_ONE_SECOND = 1000;
    private int mDataSource;
    private boolean mHasSpeakFarWarning;
    private boolean mIsSupportMultilingual;
    private HeartRateData mRealTimeHeartRateDataForPlayVoice;
    private BaseSoundEffectManager mSoundEffectManager;
    private int mStatus;
    private float mTargetTime;
    private iya mTrackVoiceManager;
    private hau mSportCallbackOption = new hau();
    private String mLanguage = "zh-CN";
    private int mSkipTimesIntervalType = 10;
    private long mLastPlayTime = 0;
    private long mLastPlayStartTime = 0;
    private boolean mIsStartSport = false;

    @Override // com.huawei.health.sportservice.manager.ManagerComponent
    public void setParas(SportParamsType sportParamsType, Object obj) {
        if (obj instanceof SportLaunchParams) {
            int dataSource = ((SportLaunchParams) obj).getDataSource();
            this.mDataSource = dataSource;
            LogUtil.a(TAG, "setParas() mDataSource: ", Integer.valueOf(dataSource));
        }
    }

    @Override // com.huawei.health.sportservice.manager.ManagerComponent
    public boolean supportParas(SportParamsType sportParamsType) {
        return SportParamsType.SPORT_LAUNCH_PARAS.equals(sportParamsType);
    }

    @Override // com.huawei.health.sportservice.manager.ManagerComponent
    public void init() {
        LogUtil.a(TAG, "init() isSkipVoiceEnable: ", Boolean.valueOf(jaq.d()), ", isRunningPageVoiceEnable: ", Boolean.valueOf(isRunningPageVoiceEnable()));
        if (jaq.d()) {
            jau.c().j(TAG);
            this.mTrackVoiceManager = new iya(BaseSportManager.getInstance().getSportType(), -1);
            this.mSoundEffectManager = new BaseSoundEffectManager(BaseApplication.getContext());
            if (pqj.b().b(BaseApplication.getContext(), "Sport")) {
                this.mIsSupportMultilingual = true;
                pqj.b().init(pqp.c(pqq.c(BaseApplication.getContext()), pqj.b().d(pqj.e()), "Sport", BaseApplication.getContext().getResources().getConfiguration().locale));
                return;
            }
            return;
        }
        LogUtil.j(TAG, "init() isSkipVoiceEnable: disable");
        this.mTrackVoiceManager = null;
        this.mSoundEffectManager = null;
    }

    private boolean isRunningPageVoiceEnable() {
        if (this.mDataSource == 7) {
            return true;
        }
        return jaq.a();
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onPreSport() {
        if (jaq.d()) {
            initVoiceLanguage();
            loadSkipDownSound();
            ArrayList arrayList = new ArrayList();
            arrayList.add("SKIP_NUM_DATA");
            arrayList.add("STATUS_CODE_DATA");
            arrayList.add("TIME_ONE_SECOND_DURATION");
            arrayList.add("HEART_RATE_DATA");
            this.mSportCallbackOption.e(arrayList);
            this.mSportCallbackOption.d(TAG);
            initSpeakTimeVoiceInterval();
            initTargetCountdownVoice();
            BaseSportManager.getInstance().subscribeNotify(this.mSportCallbackOption, new SportDataNotify() { // from class: com.huawei.health.sportservice.manager.skip.SkipVoiceManager$$ExternalSyntheticLambda0
                @Override // com.huawei.health.sportservice.SportDataNotify
                public final void onChange(List list, Map map) {
                    this.f$0.m1206x86e9fb1e(list, map);
                }
            });
            BaseSportManager.getInstance().registerAchieveLevel(TAG, new SportAchieveSubscribe() { // from class: com.huawei.health.sportservice.manager.skip.SkipVoiceManager$$ExternalSyntheticLambda1
                @Override // com.huawei.hwsportmodel.SportAchieveSubscribe
                public final void onChange(Object obj) {
                    this.f$0.m1207x1b286abd(obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: lambda$onPreSport$0$com-huawei-health-sportservice-manager-skip-SkipVoiceManager, reason: not valid java name */
    /* synthetic */ void m1206x86e9fb1e(List list, Map map) {
        if (list.contains("SKIP_NUM_DATA")) {
            int iIntValue = ((Integer) map.get("SKIP_NUM_DATA")).intValue();
            if (iIntValue % this.mSkipTimesIntervalType == 0 && iIntValue > 0) {
                speakSkipTimes(iIntValue);
            }
            if (this.mSoundEffectManager == null || !isRunningPageVoiceEnable()) {
                return;
            }
            this.mSoundEffectManager.a(SKIP_DOWN);
            return;
        }
        if (list.contains("STATUS_CODE_DATA")) {
            this.mStatus = ((Integer) map.get("STATUS_CODE_DATA")).intValue();
            return;
        }
        if (list.contains("TIME_ONE_SECOND_DURATION")) {
            long jLongValue = ((Long) map.get("TIME_ONE_SECOND_DURATION")).longValue();
            statusDetect(jLongValue);
            detectCountdownEndVoice(jLongValue);
        } else if (list.contains("HEART_RATE_DATA")) {
            playWarningVoice(((Integer) map.get("HEART_RATE_DATA")).intValue());
        }
    }

    /* JADX INFO: renamed from: lambda$onPreSport$1$com-huawei-health-sportservice-manager-skip-SkipVoiceManager, reason: not valid java name */
    /* synthetic */ void m1207x1b286abd(Object obj) {
        if (obj instanceof SkipAchieveType) {
            speakNativeVoice(((SkipAchieveType) obj).getVoicePath());
        }
    }

    private void initVoiceLanguage() {
        if (LanguageUtil.o(BaseApplication.getContext())) {
            this.mLanguage = "zh-CN";
        } else {
            this.mLanguage = "en";
        }
    }

    private void initTargetCountdownVoice() {
        if (BaseSportManager.getInstance().getTargetType() != 0) {
            return;
        }
        this.mTargetTime = BaseSportManager.getInstance().getTargetValue();
    }

    private void detectCountdownEndVoice(long j) {
        float f = this.mTargetTime;
        if (f < 1.0E-7d) {
            return;
        }
        float f2 = f - ((j * 1.0f) / 1000.0f);
        if (f2 > 10.0f || f2 <= 9.0f) {
            return;
        }
        speakNativeVoice("L001");
    }

    private void statusDetect(long j) {
        if (this.mIsStartSport) {
            if (!this.mHasSpeakFarWarning && this.mStatus == 1004) {
                speakNativeVoice("L016");
                this.mHasSpeakFarWarning = true;
            }
            if (this.mStatus == 0) {
                this.mLastPlayStartTime = 0L;
                this.mLastPlayTime = 0L;
                this.mHasSpeakFarWarning = false;
                return;
            }
            long j2 = this.mLastPlayStartTime;
            if (j2 == 0) {
                this.mLastPlayStartTime = j;
            } else if (isUpToThreshold(j - j2, j)) {
                speakNativeVoice("L003");
                this.mLastPlayTime = j;
            }
        }
    }

    private boolean isUpToThreshold(long j, long j2) {
        LogUtil.a(TAG, "duration", Long.valueOf(j2), "mLastPlayTime", Long.valueOf(this.mLastPlayTime), "interval", Long.valueOf(j));
        if (j2 - this.mLastPlayTime <= 1000) {
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

    private void initSpeakTimeVoiceInterval() {
        int i;
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(20002), "value_upper_voice_interval");
        if (strE == null) {
            LogUtil.j(TAG, "SkipTimesIntervalType is ten");
            return;
        }
        try {
            i = Integer.parseInt(strE);
        } catch (NumberFormatException e) {
            LogUtil.e(TAG, LogAnonymous.b(e));
            i = 10;
        }
        if (i == 100) {
            LogUtil.a(TAG, "SkipTimesIntervalType is HUNDRED");
            this.mSkipTimesIntervalType = i;
        }
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onStartSport() {
        if (jaq.d()) {
            this.mIsStartSport = true;
            if (BaseSportManager.getInstance().getDataSource() == 7) {
                speakNativeVoice("L002");
            } else if (BaseSportManager.getInstance().getDataSource() == 5) {
                speakNativeVoice("S003");
            }
        }
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

    @Override // com.huawei.health.sportservice.manager.ManagerComponent
    public void destroy() {
        if (this.mTrackVoiceManager != null) {
            jau.c().h(TAG);
        }
        BaseSportManager.getInstance().cancelSubscribeNotify(this.mSportCallbackOption);
    }

    private void loadSkipDownSound() {
        jax jaxVar = new jax(SKIP_DOWN, 0, jcp.d().d("S001", "ogg", "zh-CN"));
        ArrayList arrayList = new ArrayList();
        arrayList.add(jaxVar);
        BaseSoundEffectManager baseSoundEffectManager = this.mSoundEffectManager;
        if (baseSoundEffectManager != null) {
            baseSoundEffectManager.e(arrayList);
        }
    }

    private void speakSkipTimes(int i) {
        if (!isRunningPageVoiceEnable()) {
            LogUtil.j(TAG, "speakSkipTimes() isRunningPageVoiceEnable false, return");
            return;
        }
        if (i % this.mSkipTimesIntervalType != 0) {
            return;
        }
        if (this.mIsSupportMultilingual) {
            multilingualSkipTimes(i);
            return;
        }
        if (this.mTrackVoiceManager != null && "en".equals(this.mLanguage)) {
            this.mTrackVoiceManager.d(i);
            return;
        }
        ArrayList arrayList = new ArrayList(16);
        ChineseVoiceConstructor.b(arrayList, Integer.valueOf(i));
        jau.c().d(ChineseVoiceConstructor.e((List<String>) arrayList));
    }

    private void multilingualSkipTimes(int i) {
        pqk pqkVar = new pqk();
        pqkVar.e(Integer.valueOf(i));
        SkipMultilingualVoiceContent.playMultipleSourcesVoice(SkipMultilingualVoiceContent.SKIP_NUM.value(), pqkVar);
    }

    private void speakNativeVoice(String str) {
        LogUtil.a(TAG, "speakNativeVoice() voice: ", str);
        if (!isRunningPageVoiceEnable()) {
            LogUtil.j(TAG, "speakNativeVoice() isRunningPageVoiceEnable false, return");
            return;
        }
        if (this.mIsSupportMultilingual) {
            speakMultilingual(str);
            return;
        }
        String strD = jcp.d().d(str, "mp3", this.mLanguage);
        jau.c().e("assert" + strD);
    }

    private void speakMultilingual(String str) {
        SkipMultilingualVoiceContent.playMultipleSourcesVoice(SkipMultilingualVoiceContent.getTranslationMap(str), new pqk());
    }

    private void playWarningVoice(int i) {
        if (!isRunningPageVoiceEnable()) {
            LogUtil.j(TAG, "playWarningVoice() isRunningPageVoiceEnable false, return");
            return;
        }
        if (this.mTrackVoiceManager != null) {
            if (isEnableCurLang(BaseApplication.getContext()) && i > 0 && i <= 220) {
                if (this.mRealTimeHeartRateDataForPlayVoice == null) {
                    this.mRealTimeHeartRateDataForPlayVoice = new HeartRateData();
                }
                this.mRealTimeHeartRateDataForPlayVoice.saveHeartRate(i);
                this.mRealTimeHeartRateDataForPlayVoice.saveTime(System.currentTimeMillis());
                this.mTrackVoiceManager.b(this.mRealTimeHeartRateDataForPlayVoice);
                LogUtil.d(TAG, "play voice,and play warning(hr value valid): HeartRateData is ", Integer.valueOf(this.mRealTimeHeartRateDataForPlayVoice.acquireHeartRate()));
                return;
            }
            LogUtil.j(TAG, "play voice, no play warning");
            return;
        }
        LogUtil.j(TAG, "will play voice but mTrackVoiceManager is null");
    }

    private boolean isEnableCurLang(Context context) {
        if (this.mIsSupportMultilingual) {
            return true;
        }
        return isRealChineseMainland(context);
    }

    private static boolean isRealChineseMainland(Context context) {
        if (context != null) {
            return LanguageUtil.l(context) && !CloudUtils.d() && CommonUtil.v(context) && !UnitUtil.f();
        }
        LogUtil.e(TAG, "context == null");
        return false;
    }
}
