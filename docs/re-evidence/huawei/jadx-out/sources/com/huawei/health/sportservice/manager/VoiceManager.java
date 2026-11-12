package com.huawei.health.sportservice.manager;

import android.content.Context;
import android.os.Vibrator;
import com.huawei.health.sportservice.SportBleStatus;
import com.huawei.health.sportservice.SportDataNotify;
import com.huawei.health.sportservice.SportLaunchParams;
import com.huawei.health.sportservice.constants.SportParamsType;
import com.huawei.health.sportservice.template.ComponentName;
import com.huawei.health.sportservice.template.SportComponentType;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.fitnessdatatype.HeartZoneConf;
import com.huawei.hwfoundationmodel.trackmodel.HeartRateData;
import com.huawei.hwfoundationmodel.trackmodel.MotionPath;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.jsoperation.JsUtil;
import defpackage.gzv;
import defpackage.hau;
import defpackage.hbv;
import defpackage.ive;
import defpackage.iya;
import defpackage.jaq;
import defpackage.jau;
import defpackage.jem;
import defpackage.nkb;
import defpackage.nzd;
import defpackage.pqj;
import health.compact.a.CloudUtils;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes31.dex */
@SportComponentType(classify = 1, name = ComponentName.VOICE_MANAGER)
public class VoiceManager implements ManagerComponent, SportBleStatus {
    private static final int MS_FOR_VIBRATE = 500;
    private static final int NUMBER_ONE_FOR_PUBLIC_USE = 1;
    private static final int NUMBER_THOUSAND_FOR_PUBLIC_USE = 1000;
    private static final String TAG = "SportService_VoiceManager";
    private boolean isRestart;
    private Context mContext;
    private HeartRateData mRealTimeHeartRateDataForPlayVoice;
    private nzd mScienceGuideVoiceHelper;
    private iya mTrackVoiceManager;
    private Vibrator mVibrator;
    private int mSportType = 0;
    private hau mSportCallbackOption = new hau();
    private boolean mHasSetTrackVoiceManagerPlayCount = false;
    private boolean mHasPlayStartVoice = false;
    private boolean mHasPrintLocationLog = false;
    private boolean isHrControl = false;
    private boolean mHasInitTrackVoiceManagerParams = false;

    private boolean isNeedScienceGuide(int i) {
        return i == 264;
    }

    @Override // com.huawei.health.sportservice.manager.ManagerComponent
    public void setParas(SportParamsType sportParamsType, Object obj) {
        if (obj instanceof SportLaunchParams) {
            SportLaunchParams sportLaunchParams = (SportLaunchParams) obj;
            boolean zIsRestart = sportLaunchParams.isRestart();
            this.isRestart = zIsRestart;
            LogUtil.a(TAG, "setParas() isRestart: ", Boolean.valueOf(zIsRestart));
            boolean zBooleanValue = ((Boolean) sportLaunchParams.getExtra("isHrControlCourse", Boolean.class, false)).booleanValue();
            this.isHrControl = zBooleanValue;
            LogUtil.a(TAG, "setParas isHrControl: ", Boolean.valueOf(zBooleanValue));
        }
    }

    @Override // com.huawei.health.sportservice.manager.ManagerComponent
    public boolean supportParas(SportParamsType sportParamsType) {
        return SportParamsType.SPORT_LAUNCH_PARAS.equals(sportParamsType);
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onPreSport() {
        LogUtil.a(TAG, "onPreSport()");
        this.mContext = BaseApplication.getContext();
        this.mSportType = BaseSportManager.getInstance().getSportType();
        initVoiceHelper();
        initHeartRateZone();
        if (BaseSportManager.getInstance().isVoiceEnable()) {
            initVoiceAndSmartCoachService();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add("TIME_ONE_SECOND_DURATION");
        arrayList.add("DISTANCE_DATA");
        arrayList.add("HEART_RATE_DATA");
        arrayList.add("LAST_KILOMETER_PACE_DATA");
        this.mSportCallbackOption.e(arrayList);
        this.mSportCallbackOption.d(TAG);
        BaseSportManager.getInstance().subscribeNotify(this.mSportCallbackOption, getSportDataNotify());
        LogUtil.a(TAG, "BaseSportManager.getInstance().subscribeNotify()");
        BaseSportManager.getInstance().registerSportBleStatus(TAG, this);
        LogUtil.a(TAG, "BaseSportManager.getInstance().registerSportBleStatus()");
    }

    private SportDataNotify getSportDataNotify() {
        return new SportDataNotify() { // from class: com.huawei.health.sportservice.manager.VoiceManager$$ExternalSyntheticLambda0
            @Override // com.huawei.health.sportservice.SportDataNotify
            public final void onChange(List list, Map map) {
                this.f$0.m1198xb8b5c8e6(list, map);
            }
        };
    }

    /* JADX INFO: renamed from: lambda$getSportDataNotify$0$com-huawei-health-sportservice-manager-VoiceManager, reason: not valid java name */
    /* synthetic */ void m1198xb8b5c8e6(List list, Map map) {
        if (list.contains("TIME_ONE_SECOND_DURATION") || list.contains("LAST_KILOMETER_PACE_DATA")) {
            LogUtil.a(TAG, "tagList: ", list, ", sportDataMap: ", map);
            long sportDurationData = getSportDurationData(map);
            int sportDistanceData = getSportDistanceData(map);
            long sportLastKilometerPaceData = getSportLastKilometerPaceData(map);
            int sportHeartRateData = getSportHeartRateData(map);
            if (sportDurationData > 0 && list.contains("LAST_KILOMETER_PACE_DATA")) {
                playVoice(sportDurationData, sportDistanceData, sportLastKilometerPaceData, sportHeartRateData);
                return;
            }
            if (sportDurationData > 0 && sportDistanceData > 0) {
                onCreateVoice(sportDurationData, sportDistanceData);
            }
            if (sportDurationData > 0) {
                handleScienceGuideVoiceData();
                playVoice(sportDurationData, sportDistanceData, sportLastKilometerPaceData, sportHeartRateData);
                playWarningVoice(sportHeartRateData);
            }
            if (sportDistanceData > 0) {
                setTrackVoiceManagerPlayCount(sportDistanceData);
            }
        }
    }

    private long getSportDurationData(Map<String, Object> map) {
        Object obj = map.get("TIME_ONE_SECOND_DURATION");
        if (obj instanceof Long) {
            return ((Long) obj).longValue();
        }
        return 0L;
    }

    private int getSportDistanceData(Map<String, Object> map) {
        Object obj = map.get("DISTANCE_DATA");
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        return 0;
    }

    private long getSportLastKilometerPaceData(Map<String, Object> map) {
        Object obj = map.get("LAST_KILOMETER_PACE_DATA");
        if (obj instanceof Long) {
            return ((Long) obj).longValue();
        }
        return -1L;
    }

    private int getSportHeartRateData(Map<String, Object> map) {
        Object obj = map.get("HEART_RATE_DATA");
        int iIntValue = obj instanceof Integer ? ((Integer) obj).intValue() : 0;
        if (hbv.b(iIntValue)) {
            return iIntValue;
        }
        return -1;
    }

    private void initVoiceHelper() {
        LogUtil.a(TAG, "initVoiceHelper()");
        if (this.mScienceGuideVoiceHelper == null && isEnableCurLang(this.mContext) && isNeedScienceGuide(this.mSportType)) {
            LogUtil.a(TAG, "initVoiceHelper() new ScienceGuideVoiceHelper()");
            this.mScienceGuideVoiceHelper = new nzd();
        }
    }

    private void initHeartRateZone() {
        int iA;
        int iC;
        LogUtil.a(TAG, "initHeartRateZone()");
        HeartZoneConf heartZoneConfJ = nkb.d().j();
        if (heartZoneConfJ != null) {
            if (heartZoneConfJ.getClassifyMethod() == 0) {
                iA = nkb.d().h();
                iC = nkb.d().g();
            } else {
                iA = nkb.d().a();
                iC = nkb.d().c();
            }
            if (this.mScienceGuideVoiceHelper != null) {
                LogUtil.a(TAG, "initHeartRateZone() initParams() warmUp: ", Integer.valueOf(iC), ", reduceFat: ", Integer.valueOf(iA));
                this.mScienceGuideVoiceHelper.e(iC, iA - 1);
            }
        }
    }

    private void initVoiceAndSmartCoachService() {
        if (!UnitUtil.f()) {
            jau.c().j(TAG);
            LogUtil.a(TAG, "startVoiceService");
            if (isEnableCurLang(this.mContext)) {
                LogUtil.a(TAG, "new TrackVoiceManager()");
                this.mTrackVoiceManager = new iya(this.mSportType, -1);
            }
        }
        if (this.mSportType != 264 || this.isHrControl) {
            return;
        }
        LogUtil.a(TAG, "startSmartCoachVoiceFunction()");
        jem.b(264, -1, true);
    }

    private void onCreateVoice(long j, int i) {
        if (this.mHasInitTrackVoiceManagerParams || this.mTrackVoiceManager == null) {
            return;
        }
        LogUtil.a(TAG, "onCreateVoice() sportDuration: ", Long.valueOf(j), ", totalDistanceValid: ", Integer.valueOf(i), ", mHasPlayStartVoice: ", Boolean.valueOf(this.mHasPlayStartVoice));
        this.mTrackVoiceManager.a(j, i);
        this.mHasInitTrackVoiceManagerParams = true;
        if (this.mHasPlayStartVoice || this.isRestart) {
            return;
        }
        vibrateAndPlayStartSportVoice();
    }

    private void setTrackVoiceManagerPlayCount(int i) {
        iya iyaVar;
        if (!isEnableCurLang(this.mContext) || (iyaVar = this.mTrackVoiceManager) == null || this.mHasSetTrackVoiceManagerPlayCount || iyaVar.e() == 0 || this.mTrackVoiceManager.b() == 1) {
            return;
        }
        int iE = i / this.mTrackVoiceManager.e();
        LogUtil.a(TAG, "setPlayCount() startDistance: ", Integer.valueOf(i), ", setPlayCount: ", Integer.valueOf(iE));
        this.mTrackVoiceManager.e(iE);
        this.mHasSetTrackVoiceManagerPlayCount = true;
    }

    private void handleScienceGuideVoiceData() {
        if (this.mContext == null || this.mScienceGuideVoiceHelper == null) {
            return;
        }
        Object data = BaseSportManager.getInstance().getData("SPEED_DATA");
        int iIntValue = data instanceof Integer ? ((Integer) data).intValue() : 0;
        Object data2 = BaseSportManager.getInstance().getData("STEP_RATE_DATA");
        int iIntValue2 = data2 instanceof Integer ? ((Integer) data2).intValue() : 0;
        Object data3 = BaseSportManager.getInstance().getData("RUNNING_POSTURE_DATA");
        gzv gzvVar = data3 instanceof gzv ? (gzv) data3 : null;
        Object data4 = BaseSportManager.getInstance().getData(JsUtil.DataFunc.MOTION_PATH_DATA);
        ArrayList<HeartRateData> arrayListRequestHeartRateList = data4 instanceof MotionPath ? ((MotionPath) data4).requestHeartRateList() : null;
        if (this.isHrControl) {
            this.mScienceGuideVoiceHelper.b(iIntValue, iIntValue2, gzvVar, this.mContext);
        } else {
            this.mScienceGuideVoiceHelper.a(iIntValue, iIntValue2, gzvVar, arrayListRequestHeartRateList, this.mContext);
        }
    }

    private void playVoice(long j, int i, long j2, int i2) {
        if (this.mTrackVoiceManager != null && isEnableCurLang(this.mContext) && !UnitUtil.f()) {
            long j3 = (i < 1000 || i % 1000 >= 500) ? -1L : 1000 * j2;
            LogUtil.a(TAG, "playVoice() duration: ", Long.valueOf(j), ", distance: ", Integer.valueOf(i), ", lastKilometerPace: ", Long.valueOf(j2), ", heartRate: ", Integer.valueOf(i2));
            this.mTrackVoiceManager.a(j, i, j3, i2);
            return;
        }
        LogUtil.j(TAG, "will play voice but mTrackVoiceManager is null");
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onStartSport() {
        LogUtil.a(TAG, "onStartSport() isRestart: ", Boolean.valueOf(this.isRestart));
        if (this.isRestart) {
            return;
        }
        vibrateAndPlayStartSportVoice();
    }

    private void vibrateAndPlayStartSportVoice() {
        vibrate();
        if (this.mTrackVoiceManager == null || !isEnableCurLang(this.mContext)) {
            return;
        }
        this.mTrackVoiceManager.j();
        this.mHasPlayStartVoice = true;
    }

    private void vibrate() {
        Vibrator vibrator = this.mVibrator;
        if (vibrator == null) {
            Object systemService = BaseApplication.getContext().getSystemService("vibrator");
            if (systemService instanceof Vibrator) {
                this.mVibrator = (Vibrator) systemService;
                return;
            }
            return;
        }
        vibrator.vibrate(500L);
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onResumeSport() {
        LogUtil.a(TAG, "onResumeSport()");
        vibrate();
        if (this.mTrackVoiceManager == null || !isEnableCurLang(this.mContext)) {
            return;
        }
        this.mTrackVoiceManager.f();
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onPauseSport() {
        LogUtil.a(TAG, "onPauseSport()");
        vibrate();
        if (this.mTrackVoiceManager == null || !isEnableCurLang(this.mContext)) {
            return;
        }
        this.mTrackVoiceManager.a();
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    /* JADX INFO: renamed from: onStopSport */
    public void m825x32b3e3a1() {
        LogUtil.a(TAG, "onStopSport()");
        speakStopSport();
        jau.c().h(TAG);
    }

    private void speakStopSport() {
        if (!BaseSportManager.getInstance().isToSave()) {
            LogUtil.a(TAG, "speakStopSport() not play stop sport voice");
            return;
        }
        vibrate();
        if (this.mTrackVoiceManager == null || !isEnableCurLang(this.mContext)) {
            return;
        }
        if (LanguageUtil.o(this.mContext)) {
            LogUtil.a(TAG, " stop voice");
            this.mTrackVoiceManager.o();
        } else {
            this.mTrackVoiceManager.i();
        }
    }

    private void playWarningVoice(int i) {
        if (this.mTrackVoiceManager != null && isEnableCurLang(this.mContext) && hbv.b(i)) {
            if (this.mRealTimeHeartRateDataForPlayVoice == null) {
                this.mRealTimeHeartRateDataForPlayVoice = new HeartRateData();
            }
            this.mRealTimeHeartRateDataForPlayVoice.saveHeartRate(i);
            this.mRealTimeHeartRateDataForPlayVoice.saveTime(System.currentTimeMillis());
            this.mTrackVoiceManager.b(this.mRealTimeHeartRateDataForPlayVoice);
            LogUtil.a(TAG, "play voice and play warning(hr value valid): HeartRateData is ", Integer.valueOf(this.mRealTimeHeartRateDataForPlayVoice.acquireHeartRate()));
        }
    }

    private boolean isEnableCurLang(Context context) {
        if (pqj.b().b(context)) {
            return true;
        }
        return isRealChineseMainland(context);
    }

    private boolean isRealChineseMainland(Context context) {
        if (context == null) {
            LogUtil.e(TAG, "context == null");
            return false;
        }
        boolean zL = LanguageUtil.l(context);
        boolean zD = CloudUtils.d();
        boolean zV = CommonUtil.v(context);
        boolean zF = UnitUtil.f();
        if (!this.mHasPrintLocationLog) {
            ReleaseLogUtil.d(TAG, "a: ", Boolean.valueOf(zL), ", b: ", Boolean.valueOf(zD), ", c: ", Boolean.valueOf(zV), ", d: ", Boolean.valueOf(zF));
            this.mHasPrintLocationLog = true;
        }
        return zL && !zD && zV && !zF;
    }

    public void startSportGuide(int i, Context context) {
        LogUtil.a(TAG, "startSportGuide() sportType: ", Integer.valueOf(i));
        if (isEnableCurLang(context) && jaq.a()) {
            if (i == 264) {
                LogUtil.a(TAG, "startSportGuide() play voice 1");
                ive.c().b(9, 0);
            } else if (hbv.e(i) || i == 281) {
                LogUtil.a(TAG, "startSportGuide() play voice 2");
                ive.c().b(29, 0);
            } else {
                LogUtil.a(TAG, "startSportGuide() error sportType: ", Integer.valueOf(i));
            }
        }
    }

    public void playConnectVoice(int i, int i2) {
        if (isEnableCurLang(this.mContext) && jaq.a()) {
            ive.c().b(i, i2);
        }
    }

    @Override // com.huawei.health.sportservice.SportBleStatus
    public void onConnected() {
        if (isEnableCurLang(this.mContext) && jaq.a()) {
            LogUtil.a(TAG, "onConnected() play voice CONNECT_SUCCESS");
            ive.c().b(8, 0);
        }
    }

    @Override // com.huawei.health.sportservice.SportBleStatus
    public void onReadSuccess() {
        Object data = BaseSportManager.getInstance().getData("DISTANCE_DATA");
        int i = this.mSportType;
        LogUtil.a(TAG, "onReadSuccess() mSportType: ", Integer.valueOf(i), ", mContext: ", this.mContext, ", distanceObj: ", data);
        if ((data instanceof Integer) && ((Integer) data).intValue() == 0) {
            startSportGuide(this.mSportType, this.mContext);
        }
    }

    @Override // com.huawei.health.sportservice.manager.ManagerComponent
    public void destroy() {
        BaseSportManager.getInstance().cancelSubscribeNotify(this.mSportCallbackOption);
    }
}
