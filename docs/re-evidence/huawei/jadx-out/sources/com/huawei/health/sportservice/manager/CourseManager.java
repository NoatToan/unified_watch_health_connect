package com.huawei.health.sportservice.manager;

import android.text.TextUtils;
import android.util.Pair;
import com.huawei.health.hearratecontrol.HeartRateControlConfigApi;
import com.huawei.health.hearratecontrol.callback.ConfigCallBack;
import com.huawei.health.sport.ITargetUpdateListener;
import com.huawei.health.sportservice.SportCourseParams;
import com.huawei.health.sportservice.SportLaunchParams;
import com.huawei.health.sportservice.constants.SportObserverType;
import com.huawei.health.sportservice.constants.SportParamsType;
import com.huawei.health.sportservice.template.ComponentName;
import com.huawei.health.sportservice.template.SportComponentType;
import com.huawei.pluginfitnessadvice.ChoreographedSingleAction;
import com.huawei.pluginfitnessadvice.FitWorkout;
import defpackage.fgf;
import defpackage.gze;
import defpackage.ien;
import defpackage.njy;
import health.compact.a.Services;
import health.compact.a.util.LogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
@SportComponentType(classify = 1, name = ComponentName.COURSE_MANAGER)
public class CourseManager implements ITargetUpdateListener, ManagerComponent {
    private static final String TAG = "SportService_CourseManager";
    private String mCourseId;
    private int mCurrentStageIndex = -1;
    private FitWorkout mFitWorkout;
    private List<ChoreographedSingleAction> mSingleActionList;
    private int mSportType;

    @Override // com.huawei.health.sportservice.manager.ManagerComponent
    public void setParas(SportParamsType sportParamsType, Object obj) {
        LogUtil.a(TAG, "enter setParas");
        if (SportParamsType.SPORT_LAUNCH_PARAS.equals(sportParamsType) && (obj instanceof SportLaunchParams)) {
            SportLaunchParams sportLaunchParams = (SportLaunchParams) obj;
            this.mSportType = sportLaunchParams.getSportType();
            String str = (String) sportLaunchParams.getExtra("HEART_RATE_CONTROL_COURSE_ID", String.class);
            this.mCourseId = str;
            LogUtil.a(TAG, "mCourseId = ", str);
            if (TextUtils.isEmpty(this.mCourseId)) {
                return;
            }
            updateCourseData();
            getCourseConfigInfo();
        }
    }

    @Override // com.huawei.health.sportservice.manager.ManagerComponent
    public boolean supportParas(SportParamsType sportParamsType) {
        return SportParamsType.SPORT_LAUNCH_PARAS.equals(sportParamsType);
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onPreSport() {
        LogUtil.a(TAG, "enter onPreSport");
        BaseSportManager.getInstance().addObserver(SportObserverType.COURSE_TARGET_OBSERVE, TAG, this);
    }

    @Override // com.huawei.health.sportservice.manager.ManagerComponent
    public void init() {
        LogUtil.a(TAG, "enter init");
    }

    private void initCourse() {
        LogUtil.a(TAG, "initCourse");
        courseInitDataChange();
        this.mCurrentStageIndex = -1;
        courseActionChange();
    }

    @Override // com.huawei.health.sport.ITargetUpdateListener
    public void onTargetDataUpdate(gze gzeVar) {
        LogUtil.a(TAG, "onTargetDataUpdate");
    }

    @Override // com.huawei.health.sport.ITargetUpdateListener
    public void onStateUpdate(int i, String str) {
        LogUtil.a(TAG, "onStateUpdate");
        if (i == 201) {
            courseActionChange();
            return;
        }
        if (i == 200) {
            SportCourseParams sportCourseParams = new SportCourseParams();
            sportCourseParams.setCourseFinished(true);
            BaseSportManager.getInstance().setParas(SportParamsType.COURSE_INFO, sportCourseParams);
            LogUtil.a(TAG, "course finished");
            return;
        }
        LogUtil.a(TAG, "error type");
    }

    private void courseActionChange() {
        LogUtil.a(TAG, "enter courseActionChange");
        if (njy.e(this.mSingleActionList)) {
            LogUtil.a(TAG, "courseActionChange: mSingleActionList is empty");
        }
        int i = this.mCurrentStageIndex + 1;
        this.mCurrentStageIndex = i;
        if (njy.c(this.mSingleActionList, i)) {
            SportCourseParams sportCourseParams = new SportCourseParams();
            sportCourseParams.addExtra("COURSE_ACTION_INDEX", Integer.valueOf(this.mCurrentStageIndex));
            sportCourseParams.addExtra("COURSE_ACTION_DATA", this.mSingleActionList.get(this.mCurrentStageIndex));
            BaseSportManager.getInstance().setParas(SportParamsType.COURSE_INFO, sportCourseParams);
            LogUtil.a(TAG, "mCurrentStageIndex = ", Integer.valueOf(this.mCurrentStageIndex));
        }
    }

    private void setSingleActionList() {
        List<ChoreographedSingleAction> listB = ien.b(this.mFitWorkout);
        this.mSingleActionList = listB;
        LogUtil.a(TAG, " mSingleActionList = ", listB);
    }

    private void updateCourseData() {
        ((HeartRateControlConfigApi) Services.b("EcologyDevice", HeartRateControlConfigApi.class)).getCourseInfoByCourseId(this.mSportType, this.mCourseId, new ConfigCallBack() { // from class: com.huawei.health.sportservice.manager.CourseManager$$ExternalSyntheticLambda1
            @Override // com.huawei.health.hearratecontrol.callback.ConfigCallBack
            public final void onResponse(Object obj) {
                this.f$0.m1182x24dd1aa((FitWorkout) obj);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$updateCourseData$0$com-huawei-health-sportservice-manager-CourseManager, reason: not valid java name */
    /* synthetic */ void m1182x24dd1aa(FitWorkout fitWorkout) {
        this.mFitWorkout = fitWorkout;
        LogUtil.a(TAG, " mFitWorkout = ", fitWorkout);
        BaseSportManager.getInstance().stagingData("COURSE_DATA", this.mFitWorkout);
        SportCourseParams sportCourseParams = new SportCourseParams();
        sportCourseParams.addExtra("COURSE_DATA", this.mFitWorkout);
        BaseSportManager.getInstance().setParas(SportParamsType.COURSE_INFO, sportCourseParams);
        setSingleActionList();
        initCourse();
    }

    private void getCourseConfigInfo() {
        ((HeartRateControlConfigApi) Services.b("EcologyDevice", HeartRateControlConfigApi.class)).requestGlobalConfigByType(this.mSportType, new ConfigCallBack() { // from class: com.huawei.health.sportservice.manager.CourseManager$$ExternalSyntheticLambda0
            @Override // com.huawei.health.hearratecontrol.callback.ConfigCallBack
            public final void onResponse(Object obj) {
                CourseManager.lambda$getCourseConfigInfo$1((fgf) obj);
            }
        });
    }

    static /* synthetic */ void lambda$getCourseConfigInfo$1(fgf fgfVar) {
        LogUtil.a(TAG, "getCourseConfigInfo courseConfigInfo = ", fgfVar);
        SportCourseParams sportCourseParams = new SportCourseParams();
        sportCourseParams.addExtra("COURSE_CONFIG_DATA", fgfVar);
        BaseSportManager.getInstance().setParas(SportParamsType.COURSE_INFO, sportCourseParams);
    }

    private void courseInitDataChange() {
        LogUtil.a(TAG, "enter courseDataUpdate");
        HashMap map = new HashMap();
        if (this.mFitWorkout == null || this.mSingleActionList == null) {
            LogUtil.d(TAG, "mFitWorkout or singleActionList is null");
            return;
        }
        SportCourseParams sportCourseParams = new SportCourseParams();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (ChoreographedSingleAction choreographedSingleAction : this.mSingleActionList) {
            arrayList.add(choreographedSingleAction.getAction() != null ? choreographedSingleAction.getAction().getName() : "");
            arrayList2.add(Integer.valueOf((int) (choreographedSingleAction.getTargetConfig() != null ? choreographedSingleAction.getTargetConfig().getValueL() : 0.0d)));
            arrayList3.add(new Pair(Integer.valueOf(choreographedSingleAction.getIntensityConfig() != null ? (int) choreographedSingleAction.getIntensityConfig().getValueL() : 0), Integer.valueOf(choreographedSingleAction.getIntensityConfig() != null ? (int) choreographedSingleAction.getIntensityConfig().getValueH() : 0)));
            try {
                arrayList4.add(new Pair(Integer.valueOf(Integer.parseInt(choreographedSingleAction.getExtendProperty("rpm_min"))), Integer.valueOf(Integer.parseInt(choreographedSingleAction.getExtendProperty("rpm_max")))));
            } catch (NumberFormatException unused) {
                LogUtil.c(TAG, "NumberFormatException, get cadence ");
            }
        }
        map.put("COURSE_NAME_LIST", arrayList);
        map.put("COURSE_DURATION_LIST", arrayList2);
        map.put("COURSE_HEART_RATE_LIST", arrayList3);
        map.put("COURSE_CADENCE_LIST", arrayList4);
        map.put("COURSE_DURATION", Integer.valueOf(this.mFitWorkout.acquireDuration()));
        LogUtil.a(TAG, "outputMap ", map);
        sportCourseParams.setCourseNameList(arrayList);
        sportCourseParams.setCourseDurationList(arrayList2);
        sportCourseParams.setCourseHeartRateList(arrayList3);
        sportCourseParams.setCourseTotalTime(this.mFitWorkout.acquireDuration());
        sportCourseParams.addExtra("COURSE_CADENCE_LIST", arrayList4);
        sportCourseParams.addExtra("COURSE_MAX_HEART_RATE", Integer.valueOf(this.mFitWorkout.getUpperHeartRateAdjust()));
        sportCourseParams.addExtra("COURSE_MIN_HEART_RATE", Integer.valueOf(this.mFitWorkout.getLowerHeartRateAdjust()));
        BaseSportManager.getInstance().setParas(SportParamsType.COURSE_INFO, sportCourseParams);
    }
}
