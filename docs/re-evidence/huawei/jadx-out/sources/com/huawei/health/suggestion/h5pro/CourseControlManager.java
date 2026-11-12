package com.huawei.health.suggestion.h5pro;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.basefitnessadvice.model.intplan.IntPlan;
import com.huawei.controlcenter.featureability.sdk.model.ExtraParams;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.router.AppRouter;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.course.api.CourseApi;
import com.huawei.health.distributedservice.api.DistributedApi;
import com.huawei.health.marketing.datatype.SingleDailyMomentContent;
import com.huawei.health.plan.api.PlanApi;
import com.huawei.health.sport.model.WorkoutRecord;
import com.huawei.health.sport.model.data.RecordPlanInfo;
import com.huawei.health.sport.utils.SportSupportUtil;
import com.huawei.health.suggestion.CoachController;
import com.huawei.health.suggestion.ui.fitness.activity.CoachActivity;
import com.huawei.health.suggestion.ui.fitness.activity.LongCoachActivity;
import com.huawei.health.suggestion.ui.fitness.callback.TrainDetailConnectCallback;
import com.huawei.health.suggestion.ui.fitness.module.CoachData;
import com.huawei.health.suggestion.ui.fitness.module.Motion;
import com.huawei.health.suggestion.util.CourseEquipmentConnectionTipsUtil;
import com.huawei.health.suggestion.util.JumpUtil;
import com.huawei.hms.network.embedded.x2;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.db.bean.ContentTemplateRecord;
import com.huawei.operation.utils.WebViewHelp;
import com.huawei.pluginfitnessadvice.FitWorkout;
import com.huawei.pluginfitnessadvice.Video;
import com.huawei.pluginfitnessadvice.VideoSegment;
import com.huawei.pluginfitnessadvice.WorkoutAction;
import com.huawei.pluginsport.multilingualaudio.AudioResDownloadListener;
import com.huawei.pluginsport.multilingualaudio.AudioResProviderInterface;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.utils.CustomPermissionAction;
import com.tencent.connect.share.QzonePublish;
import defpackage.gcn;
import defpackage.gzx;
import defpackage.hip;
import defpackage.hjd;
import defpackage.hjr;
import defpackage.hjs;
import defpackage.hkt;
import defpackage.hmd;
import defpackage.hmf;
import defpackage.ied;
import defpackage.iei;
import defpackage.iov;
import defpackage.njy;
import defpackage.pcd;
import defpackage.pea;
import defpackage.pqj;
import defpackage.pqq;
import health.compact.a.CommonUtil;
import health.compact.a.EnvironmentInfo;
import health.compact.a.LogAnonymous;
import health.compact.a.Services;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import health.compact.a.utils.StringUtils;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class CourseControlManager {
    public static final int COMMON_COURSE_TYPE = 0;
    private static final int COURSE_TYPE = -1;
    private static final int HISTORY_ENTRY = 1;
    public static final int RESULT_SUCCESS = 0;
    public static final int SERIES_COURSE_TYPE = 1;
    private static final String TAG = "Suggestion_CourseControlManager";
    public static final int THE_FIRST_OF_LIST_NUMBER = 0;
    private static final int WORKOUT_PAGE = 2;
    private static AbstractMap.SimpleEntry<FitWorkout, pcd> mFitAndJumpMap;

    public static void startLongCoachActivity(Context context, FitWorkout fitWorkout, pcd pcdVar) {
        if (fitWorkout == null || pcdVar == null || TextUtils.isEmpty(pcdVar.j()) || context == null) {
            ReleaseLogUtil.e(TAG, "startLongCoachActivity fitWorkout == null || courseJumpParameter == null, context:", context);
            return;
        }
        ReleaseLogUtil.d(TAG, "startLongCoachActivity");
        gcn.c().stopLastAutoTrack();
        gcn.c().pourInterfaceToKitSportApi();
        WorkoutRecord workoutRecordD = pea.d(fitWorkout, pcdVar);
        CoachData coachData = getCoachData(fitWorkout, 1, pcdVar.k());
        startLongCoachPreAction(context, fitWorkout, workoutRecordD, coachData, pcdVar.ag());
        Intent intent = new Intent(context, (Class<?>) LongCoachActivity.class);
        intent.putExtra("isafterrun", pcdVar.ai());
        LogUtil.a(TAG, "startLongCoachActivity is screen recording = ", Integer.valueOf(fitWorkout.getAntiScreenRecording()));
        intent.putExtra("IS_SUPPORT_RECORD", fitWorkout.getAntiScreenRecording());
        intent.putExtra("equipment_course", fitWorkout.isEquipmentCourse());
        intent.putExtra(ContentTemplateRecord.MOTIONS, coachData);
        intent.putExtra("commodityFlag", fitWorkout.acquireCommodityFlag());
        intent.putExtra("workout_package_id", pcdVar.z());
        intent.putExtra("course_belong_type", getCourseBelongType(pcdVar.z()));
        intent.putExtra("workoutrecord", workoutRecordD);
        intent.putExtra("long_coach_type", fitWorkout.getVideoProperty());
        intent.putExtra("long_coach_video_url", pcdVar.j());
        String extendPropertyString = fitWorkout.getExtendPropertyString("resourceType");
        LogUtil.a(TAG, "resourceType is ", extendPropertyString);
        if (!TextUtils.isEmpty(extendPropertyString)) {
            intent.putExtra("resource_type", extendPropertyString);
        }
        intent.putExtra("havenexttrain", pcdVar.ae());
        intent.putExtra(QzonePublish.PUBLISH_TO_QZONE_VIDEO_DURATION, fitWorkout.acquireDuration());
        intent.putExtra("long_coach_subtitle_url", pcdVar.t());
        intent.putExtra("long_coach_show_action", fitWorkout.getWorkoutActionProperty());
        intent.putExtra("long_coach_need_calories", fitWorkout.getShowCalories());
        intent.putExtra("long_coach_need_countdown", fitWorkout.getShowCountdown());
        intent.putExtra("long_coach_need_heart_rate", fitWorkout.getShowHeartRate());
        intent.putExtra("plan_execute_time", pcdVar.f());
        intent.putExtra("coach_detail_name", fitWorkout.acquireName());
        intent.putExtra("coach_detail_picture", StringUtils.c((Object) (!TextUtils.isEmpty(fitWorkout.acquireMidPicture()) ? fitWorkout.acquireMidPicture() : fitWorkout.acquirePicture())));
        intent.putExtra("BI_INTENT_COURSE", (Serializable) getIntentCourseBiMap(fitWorkout, pcdVar));
        intent.putExtra("moveTaskToBack", pcdVar.an());
        recordTrainEvent(4, fitWorkout, pcdVar.z());
        putEntranceData(intent, pcdVar);
        startLongCoachAfterAction(fitWorkout, pcdVar);
        iov.d(context, intent);
        mFitAndJumpMap = new AbstractMap.SimpleEntry<>(fitWorkout, pcdVar);
    }

    public static AbstractMap.SimpleEntry<FitWorkout, pcd> getFitAndJumpMap() {
        return mFitAndJumpMap;
    }

    public static CoachData getCoachData(FitWorkout fitWorkout, int i, String str) {
        ArrayList arrayList = new ArrayList(hkt.c(fitWorkout, i));
        CoachData coachData = new CoachData();
        coachData.saveWorkId(fitWorkout.acquireId());
        coachData.savePlanId(str);
        coachData.saveMotions(arrayList);
        coachData.saveDuration(fitWorkout.acquireDuration());
        coachData.setBackgroundMusicUrl(fitWorkout.getBackgroundMusic());
        coachData.setCalorieStartTime(fitWorkout.getCalorieStartTime());
        coachData.setPrimaryClassify(fitWorkout.getPrimaryClassify());
        return coachData;
    }

    public static int getCourseBelongType(String str) {
        return TextUtils.isEmpty(str) ? 0 : 1;
    }

    public static int getRecordType(String str) {
        return TextUtils.isEmpty(str) ? 0 : 1;
    }

    private static Map<String, Object> getIntentCourseBiMap(FitWorkout fitWorkout, pcd pcdVar) {
        HashMap map = new HashMap(getBiMapData(fitWorkout, pcdVar));
        if (fitWorkout != null) {
            String strE = gzx.e(fitWorkout.acquireClasses());
            if (TextUtils.isEmpty(strE)) {
                strE = gzx.c(fitWorkout.getPrimaryClassify());
            }
            map.put("course_type", strE);
            map.put("body_position", gzx.d(fitWorkout.acquireTrainingpoints()));
            map.put("course_rate", String.valueOf(fitWorkout.acquireDifficulty()));
            map.put("workout_name", fitWorkout.acquireName());
            map.put("workout_id", fitWorkout.acquireId());
        }
        return map;
    }

    public static Map<String, Object> getBiMapData(FitWorkout fitWorkout, pcd pcdVar) {
        if (fitWorkout == null || pcdVar == null) {
            LogUtil.a(TAG, "getBiMapData fitWorkout == null || courseJumpParameter == null");
            return new HashMap();
        }
        HashMap map = new HashMap(getBiMap(pcdVar));
        map.put("resourceType", Integer.valueOf(hkt.b(fitWorkout)));
        map.put("entrance", pcdVar.c());
        map.put("supportDevice", Integer.valueOf(CourseEquipmentConnectionTipsUtil.a(CourseEquipmentConnectionTipsUtil.e(fitWorkout, pcdVar.e()))));
        return map;
    }

    public static Map<String, Object> getBiMap(pcd pcdVar) {
        if (pcdVar == null) {
            LogUtil.j(TAG, "getBiMap courseJumpParameter == null");
            return new HashMap();
        }
        HashMap map = new HashMap(6);
        map.put(WebViewHelp.BI_KEY_PULL_FROM, pcdVar.n());
        map.put("resourceId", pcdVar.p());
        map.put("resourceName", pcdVar.r());
        map.put("pullOrder", pcdVar.l());
        map.put("algId", pcdVar.a());
        map.put("promoteTag", pcdVar.m());
        map.put(x2.AB_INFO, pcdVar.b());
        map.put("itemId", pcdVar.h());
        return map;
    }

    public static void startLongCoachPreAction(Context context, FitWorkout fitWorkout, WorkoutRecord workoutRecord, CoachData coachData, boolean z) {
        hjs.b().e(fitWorkout);
        if (fitWorkout.isLongExplainVideoCourse()) {
            CoachController.c().d(false);
        } else {
            getCourseDetailDeviceHelper(context, fitWorkout, workoutRecord, z).d(true);
        }
        workoutRecord.saveExerciseTime(System.currentTimeMillis());
        workoutRecord.saveCategory(fitWorkout.getCategory());
        List<Motion> listAcquireMotions = coachData.acquireMotions();
        if (!fitWorkout.isEquipmentCourse() && njy.c(listAcquireMotions, 0)) {
            setVideoSegmentIntoMotion(fitWorkout, listAcquireMotions.get(0));
        }
        if (fitWorkout.isRealSceneCourse()) {
            hjr.a(fitWorkout.getRoadBookList());
        }
        LogUtil.a(TAG, "startLongCoachPreAction isRealSceneCourse:", Boolean.valueOf(fitWorkout.isRealSceneCourse()), " isEquipmentCourse:", Boolean.valueOf(fitWorkout.isEquipmentCourse()), " isLongExplainVideoCourse:", Boolean.valueOf(fitWorkout.isLongExplainVideoCourse()));
    }

    private static hjd getCourseDetailDeviceHelper(Context context, FitWorkout fitWorkout, WorkoutRecord workoutRecord, boolean z) {
        hjd hjdVar = new hjd(new Handler(), context);
        hjdVar.b(fitWorkout);
        hjdVar.b(workoutRecord);
        ReleaseLogUtil.d(TAG, "startCoach activity isDeviceTrain:", Boolean.valueOf(z));
        hjdVar.a(z);
        return hjdVar;
    }

    private static void setVideoSegmentIntoMotion(FitWorkout fitWorkout, Motion motion) {
        WorkoutAction workoutAction;
        Video video;
        if (fitWorkout == null || motion == null) {
            ReleaseLogUtil.e(TAG, "setVideoSegmentIntoMotion mFitWorkout or motion null");
            return;
        }
        List<WorkoutAction> listAcquireWorkoutActions = fitWorkout.acquireWorkoutActions();
        if (njy.e(listAcquireWorkoutActions, 0) || (workoutAction = listAcquireWorkoutActions.get(0)) == null || workoutAction.getAction() == null) {
            return;
        }
        List extendPropertyList = workoutAction.getAction().getExtendPropertyList("actionVideo", Video[].class);
        if (njy.e(extendPropertyList, 0) || (video = (Video) extendPropertyList.get(0)) == null) {
            return;
        }
        List<VideoSegment> videoSegmentList = video.getVideoSegmentList();
        if (njy.b(videoSegmentList)) {
            motion.setVideoSegments(videoSegmentList);
        }
    }

    private static void putEntranceData(Intent intent, pcd pcdVar) {
        if (pcdVar != null) {
            try {
                intent.putExtra("bundlekey", pea.b(pcdVar));
                intent.putExtra("topic_name", pcdVar.x());
                intent.putExtra("entrance", pcdVar.c());
                intent.putExtra("ISPLANFIT", pcdVar.al());
            } catch (BadParcelableException e) {
                LogUtil.e(TAG, "startCoachActivity putEntranceData", LogAnonymous.b(e));
            }
        }
    }

    public static void recordTrainEvent(int i, FitWorkout fitWorkout, String str) {
        CourseApi courseApi = (CourseApi) Services.b("CoursePlanService", CourseApi.class);
        WorkoutRecord workoutRecord = new WorkoutRecord();
        workoutRecord.saveWorkoutId(fitWorkout.acquireId());
        workoutRecord.saveVersion(fitWorkout.accquireVersion());
        workoutRecord.saveCourseBelongType(getCourseBelongType(str));
        workoutRecord.saveWorkoutPackageId(str);
        if (i == 0) {
            courseApi.postUserCourse(workoutRecord, 0);
            return;
        }
        if (!Utils.o()) {
            courseApi.postUserCourse(workoutRecord, 4);
        }
        if (fitWorkout.isLongExplainVideoCourse()) {
            courseApi.postUserCourse(workoutRecord, 1);
        }
    }

    public static void startCoachActivity(Context context, final FitWorkout fitWorkout, final pcd pcdVar, boolean z) {
        ReleaseLogUtil.d(TAG, "startCoachActivity");
        gcn.c().stopLastAutoTrack();
        if (fitWorkout == null || pcdVar == null || context == null) {
            ReleaseLogUtil.e(TAG, "startCoachActivity fitWorkout == null || courseJumpParameter == null, context:", Boolean.valueOf(context == null));
            return;
        }
        WorkoutRecord workoutRecordD = pea.d(fitWorkout, pcdVar);
        int gender = getGender(fitWorkout);
        CoachData coachData = getCoachData(fitWorkout, gender, pcdVar.k());
        if (njy.e(coachData.acquireMotions())) {
            ReleaseLogUtil.e(TAG, "startCoachActivity mCoachData.acquireMotions() empty gender", Integer.valueOf(gender));
            return;
        }
        gcn.c().pourInterfaceToKitSportApi();
        hjs.b().e(fitWorkout);
        getCourseDetailDeviceHelper(context, fitWorkout, workoutRecordD, pcdVar.ag()).d(false);
        Intent intent = new Intent(context, (Class<?>) CoachActivity.class);
        LogUtil.a(TAG, "startCoachActivity is screen recording = ", Integer.valueOf(fitWorkout.getAntiScreenRecording()));
        intent.putExtra("IS_SUPPORT_RECORD", fitWorkout.getAntiScreenRecording());
        intent.putExtra("BASE_AUDIO_TIMBRE", fitWorkout.getTimbre());
        intent.putExtra("isafterrun", pcdVar.ai());
        intent.putExtra(ContentTemplateRecord.MOTIONS, coachData);
        intent.putExtra("coachstartposition", 0);
        intent.putExtra("workout_package_id", pcdVar.z());
        intent.putExtra("course_belong_type", getCourseBelongType(pcdVar.z()));
        intent.putExtra("havenexttrain", pcdVar.ae());
        intent.putExtra("workoutrecord", workoutRecordD);
        intent.putExtra("plan_execute_time", pcdVar.f());
        intent.putExtra("BI_INTENT_COURSE", (Serializable) getIntentCourseBiMap(fitWorkout, pcdVar));
        intent.putExtra("moveTaskToBack", pcdVar.an());
        intent.putExtra("KEY_INTENT_EQUIPMENT_TYPE", z ? CourseEquipmentConnectionTipsUtil.e(fitWorkout, pcdVar.e()) : 0);
        intent.putExtra("commodityFlag", fitWorkout.acquireCommodityFlag());
        intent.putExtra("BI_INTENT_COURSE", (Serializable) getIntentCourseBiMap(fitWorkout, pcdVar));
        putEntranceData(intent, pcdVar);
        iov.d(context, intent);
        iei.a(fitWorkout);
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.health.suggestion.h5pro.CourseControlManager$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                CourseControlManager.lambda$startCoachActivity$0(fitWorkout, pcdVar);
            }
        });
        hip.e(fitWorkout);
    }

    static /* synthetic */ void lambda$startCoachActivity$0(FitWorkout fitWorkout, pcd pcdVar) {
        recordTrainEvent(4, fitWorkout, pcdVar.z());
        iei.d(fitWorkout, getBiMapData(fitWorkout, pcdVar), false);
    }

    private static int getGender(FitWorkout fitWorkout) {
        int iE = ied.e();
        LogUtil.a(TAG, "getGender: ", Integer.valueOf(iE));
        return fitWorkout.getCourseAttr() != 2 ? fitWorkout.getCourseAttr() : iE;
    }

    public static pcd buildCommonParameter(hmf hmfVar, String str, boolean z) {
        if (hmfVar == null) {
            ReleaseLogUtil.e(TAG, "buildCommonParameter trainDetailIntentData == null || courseJumpParameter == null");
            return new pcd("");
        }
        pcd pcdVar = new pcd(hmfVar.y());
        pcdVar.g(str);
        pcdVar.a(z);
        pcdVar.b(hmfVar.ab());
        pcdVar.t(hmfVar.aa());
        pcdVar.e(hmfVar.i());
        pcdVar.h(hmfVar.l());
        pcdVar.o(hmfVar.t());
        pcdVar.m(hmfVar.r());
        pcdVar.k(hmfVar.k());
        pcdVar.e(hmfVar.b());
        pcdVar.f(hmfVar.m());
        pcdVar.d(hmfVar.d());
        pcdVar.c(hmfVar.g());
        pcdVar.g(hmfVar.ai());
        pcdVar.a(hmfVar.e());
        pcdVar.b(hmfVar.j());
        pcdVar.q(hmfVar.u());
        pcdVar.j(hmfVar.ac());
        pcdVar.n(hmfVar.p());
        pcdVar.f(hmfVar.af());
        pcdVar.f(hmfVar.q());
        pcdVar.a(hmfVar.x());
        pcdVar.b(hmfVar.v());
        return pcdVar;
    }

    public static void devicesConnectDialogPositive(Context context, FitWorkout fitWorkout, pcd pcdVar, ArrayList<WorkoutRecord> arrayList) {
        if (fitWorkout == null || pcdVar == null) {
            ReleaseLogUtil.e(TAG, "devicesConnectDialogPositive fitWorkout == null || courseJumpParameter == nul");
            return;
        }
        WorkoutRecord workoutRecordD = pea.d(fitWorkout, pcdVar);
        CoachData coachData = getCoachData(fitWorkout, 1, pcdVar.k());
        startLongCoachPreAction(context, fitWorkout, workoutRecordD, coachData, pcdVar.ag());
        hmd hmdVar = new hmd();
        CourseEquipmentConnectionTipsUtil.b(pcdVar, hmdVar, fitWorkout, coachData, 0);
        hmdVar.a(pcdVar.z());
        hmdVar.a(getCourseBelongType(pcdVar.z()));
        if (arrayList == null) {
            arrayList = new ArrayList<>(1);
            arrayList.add(workoutRecordD);
        }
        CourseEquipmentConnectionTipsUtil.a(hmdVar, fitWorkout.getWorkoutActionProperty(), pcdVar.j(), arrayList, workoutRecordD);
    }

    public static void startAiCourse(Context context, FitWorkout fitWorkout, pcd pcdVar, boolean z) {
        if (fitWorkout == null || pcdVar == null) {
            ReleaseLogUtil.e(TAG, "startAiCourse fitWorkout == null || courseJumpParameter == null");
            return;
        }
        gcn.c().stopLastAutoTrack();
        Bundle bundle = new Bundle();
        IntPlan currentIntPlan = ((PlanApi) Services.b("CoursePlanService", PlanApi.class)).getCurrentIntPlan();
        WorkoutRecord workoutRecordD = pea.d(fitWorkout, pcdVar);
        if (!TextUtils.isEmpty(pcdVar.k())) {
            workoutRecordD.setPlanTrainDate(DateFormatUtil.a(pcdVar.f()));
        }
        bundle.putString("plan_name", hkt.c(currentIntPlan, pcdVar.k()) ? currentIntPlan.getMetaInfo().getName() : "");
        bundle.putInt("type", hkt.c(currentIntPlan, pcdVar.k()) ? currentIntPlan.getPlanType().getType() : -1);
        if ("FitnessResult".equals(pcdVar.c())) {
            bundle.putInt("pullFrom", 1);
        } else {
            bundle.putInt("pullFrom", 2);
        }
        bundle.putParcelable(NotificationCompat.CATEGORY_WORKOUT, fitWorkout);
        bundle.putString("workid", fitWorkout.acquireId());
        bundle.putString("planid", pcdVar.k());
        bundle.putLong("planstarttime", pcdVar.f());
        bundle.putString("entrance", pcdVar.c());
        bundle.putString("biPullfrom", pcdVar.n());
        bundle.putString("promoteTag", pcdVar.m());
        bundle.putInt("resourceType", hkt.b(fitWorkout));
        bundle.putBoolean("isFirstDownload", z);
        LogUtil.a(TAG, "isFirstDownload:", Boolean.valueOf(z));
        recordTrainEvent(4, fitWorkout, pcdVar.z());
        JumpUtil.c(context, workoutRecordD, bundle);
        hjd hjdVar = new hjd(new Handler(), context);
        hjdVar.b(fitWorkout);
        hjdVar.b(workoutRecordD);
        hjdVar.e(false);
    }

    public static void checkMultilingualAudio(Context context, FitWorkout fitWorkout, final UiCallback<Integer> uiCallback) {
        if (fitWorkout == null) {
            ReleaseLogUtil.e(TAG, "checkMultilingualAudio fitWorkout == null");
            return;
        }
        if (!Utils.o()) {
            uiCallback.onSuccess(0);
            return;
        }
        AudioResProviderInterface audioResProviderInterface = (AudioResProviderInterface) AppRouter.e(AudioResProviderInterface.ROUTER_PATH_AUDIO_RES_DOWNLOAD, AudioResProviderInterface.class);
        boolean zB = pqj.b().b(context);
        String str = fitWorkout.isRunModelCourse() ? "Sport" : SingleDailyMomentContent.COURSE_TYPE;
        ReleaseLogUtil.d(TAG, "service = ", Boolean.valueOf(audioResProviderInterface != null), "isEnableCurLang = ", Boolean.valueOf(zB));
        if (audioResProviderInterface != null && zB && !fitWorkout.isLongVideoCourse()) {
            final boolean[] zArr = {false};
            audioResProviderInterface.queryOrDownAudioResource(BaseApplication.getActivity(), pqq.b(context, str), context.getResources().getString(R.string.IDS_hwh_base_model_multilingualaudio), new AudioResDownloadListener() { // from class: com.huawei.health.suggestion.h5pro.CourseControlManager$$ExternalSyntheticLambda2
                @Override // com.huawei.pluginsport.multilingualaudio.AudioResDownloadListener
                public final void onResult(int i) {
                    CourseControlManager.lambda$checkMultilingualAudio$2(zArr, uiCallback, i);
                }
            });
        } else {
            uiCallback.onSuccess(0);
        }
    }

    static /* synthetic */ void lambda$checkMultilingualAudio$2(final boolean[] zArr, final UiCallback uiCallback, int i) {
        ReleaseLogUtil.d(TAG, "result = ", Integer.valueOf(i));
        HandlerExecutor.b(new Runnable() { // from class: com.huawei.health.suggestion.h5pro.CourseControlManager$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                CourseControlManager.lambda$checkMultilingualAudio$1(zArr, uiCallback);
            }
        });
    }

    static /* synthetic */ void lambda$checkMultilingualAudio$1(boolean[] zArr, UiCallback uiCallback) {
        if (!zArr[0]) {
            uiCallback.onSuccess(0);
        }
        zArr[0] = true;
    }

    public static void startTrackActivity(Context context, FitWorkout fitWorkout, pcd pcdVar) {
        RecordPlanInfo recordPlanInfo;
        ReleaseLogUtil.d(TAG, "startTrackActivity");
        if (fitWorkout == null || pcdVar == null) {
            LogUtil.e(TAG, "mFitWorkout is null.");
            return;
        }
        WorkoutRecord workoutRecordD = pea.d(fitWorkout, pcdVar);
        int iAcquireWorkoutOrder = workoutRecordD.acquireWorkoutOrder();
        String strAcquirePlanId = workoutRecordD.acquirePlanId();
        ReleaseLogUtil.d(TAG, "CustomPermissionAction onGranted. run workout:", fitWorkout.acquireName(), Integer.valueOf(fitWorkout.getMusicRunFlag()), "planId:", strAcquirePlanId);
        if (!TextUtils.isEmpty(strAcquirePlanId) || "entrance_custom_course".equals(pcdVar.c())) {
            RecordPlanInfo recordPlanInfo2 = new RecordPlanInfo(strAcquirePlanId, DateFormatUtil.a(pcdVar.f()), iAcquireWorkoutOrder, pcdVar.ab());
            IntPlan currentIntPlan = ((PlanApi) Services.b("CoursePlanService", PlanApi.class)).getCurrentIntPlan();
            if (currentIntPlan != null) {
                recordPlanInfo2.setPlanType(currentIntPlan.getPlanType().getType());
            }
            recordPlanInfo = recordPlanInfo2;
        } else {
            recordPlanInfo = null;
        }
        Bundle bundle = new Bundle();
        bundle.putSerializable("BI_INTENT_COURSE", (Serializable) getIntentCourseBiMap(fitWorkout, pcdVar));
        bundle.putString("workout_package_id", pcdVar.z());
        bundle.putInt("course_belong_type", getCourseBelongType(pcdVar.z()));
        bundle.putInt("sport_type", pcdVar.q());
        JumpUtil.d(context, fitWorkout, recordPlanInfo, bundle);
        recordTrainEvent(4, fitWorkout, pcdVar.z());
        iei.d(fitWorkout, getBiMapData(fitWorkout, pcdVar), false);
    }

    public static void startLongCoachAfterAction(FitWorkout fitWorkout, pcd pcdVar) {
        if (fitWorkout == null || pcdVar == null) {
            ReleaseLogUtil.e(TAG, "startLongCoachAfterAction fitWorkout == null || courseJumpParameter == null");
            return;
        }
        iei.d(fitWorkout, getBiMapData(fitWorkout, pcdVar), false);
        iei.a();
        iei.a(fitWorkout);
    }

    public static void initFa(Context context, FitWorkout fitWorkout, String str, long j, UiCallback<Integer> uiCallback) {
        LogUtil.a(TAG, "start to initFA");
        if (context == null || fitWorkout == null || uiCallback == null) {
            ReleaseLogUtil.e(TAG, "context == null || fitWorkout == null || uiCallback == null", Boolean.valueOf(fitWorkout == null));
        } else {
            PermissionUtil.d(context, PermissionUtil.PermissionType.DISTRIBUTED_DATASYNC, new WeekDistributed(context, fitWorkout, str, j, uiCallback));
        }
    }

    static class WeekDistributed extends CustomPermissionAction {
        private final WeakReference<Context> mContext;
        private final long mCoursePlanTime;
        private final FitWorkout mFitWorkout;
        private final String mPlanId;
        private final UiCallback<Integer> mUiCallback;

        public WeekDistributed(Context context, FitWorkout fitWorkout, String str, long j, UiCallback<Integer> uiCallback) {
            super(context);
            this.mContext = new WeakReference<>(context);
            this.mFitWorkout = fitWorkout;
            this.mPlanId = str;
            this.mCoursePlanTime = j;
            this.mUiCallback = uiCallback;
        }

        @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
        public void onGranted() {
            LogUtil.a(CourseControlManager.TAG, "initFA get the DISTRIBUTED_DATASYNC permission");
            ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.health.suggestion.h5pro.CourseControlManager$WeekDistributed$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m1221xd8c831dc();
                }
            });
        }

        /* JADX INFO: renamed from: lambda$onGranted$0$com-huawei-health-suggestion-h5pro-CourseControlManager$WeekDistributed, reason: not valid java name */
        /* synthetic */ void m1221xd8c831dc() {
            Context context = this.mContext.get();
            if (context == null) {
                LogUtil.j(CourseControlManager.TAG, "initFA context == null");
                return;
            }
            DistributedApi distributedApi = (DistributedApi) Services.b("DistributedService", DistributedApi.class);
            if (!distributedApi.isHopEnabled(context)) {
                ReleaseLogUtil.d(CourseControlManager.TAG, "initFA onFailure isHopEnable false");
                this.mUiCallback.onFailure(-1, "isHopEnable is false");
                return;
            }
            TrainDetailConnectCallback trainDetailConnectCallback = new TrainDetailConnectCallback(this.mFitWorkout, this.mPlanId, this.mCoursePlanTime, this.mUiCallback);
            int iRegister = distributedApi.register(context.getPackageName(), CourseControlManager.getRegisterToken(context, null), CourseControlManager.createExtraParams(this.mFitWorkout.acquireName(), this.mFitWorkout.getSmartScreeFlag()), trainDetailConnectCallback);
            trainDetailConnectCallback.setToken(iRegister);
            ReleaseLogUtil.d(CourseControlManager.TAG, "the faToken is: ", Integer.valueOf(iRegister));
            if (iRegister > 0) {
                distributedApi.showDeviceList(iRegister, CourseControlManager.createExtraParams(this.mFitWorkout.acquireName(), this.mFitWorkout.getSmartScreeFlag()));
            } else {
                this.mUiCallback.onFailure(-1, "faToken < 0");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static IBinder getRegisterToken(Context context, IBinder iBinder) {
        Activity activityJ;
        try {
            if (!(context instanceof Activity) && (activityJ = com.huawei.haf.application.BaseApplication.j()) != null) {
                context = activityJ;
            }
            if (context == null) {
                ReleaseLogUtil.e(TAG, "getRegisterToken validContext == null");
                return iBinder;
            }
            Object objInvoke = Activity.class.getMethod("getActivityToken", new Class[0]).invoke(context, new Object[0]);
            if (objInvoke instanceof IBinder) {
                return (IBinder) objInvoke;
            }
            return iBinder;
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            ReleaseLogUtil.a(TAG, "getRegisterToken appear exception, eeror Message:", LogAnonymous.b(e));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ExtraParams createExtraParams(String str, int i) {
        DistributedApi distributedApi = (DistributedApi) Services.b("DistributedService", DistributedApi.class);
        String strCreateExFilterParamsWithSameAccount = distributedApi.createExFilterParamsWithSameAccount(null);
        LogUtil.a(TAG, "FA mJsonParams is: ", strCreateExFilterParamsWithSameAccount);
        LogUtil.a(TAG, "fitWorkout name: ", str, " view: ", Integer.valueOf(i));
        return distributedApi.createExtraParams(i == 0 ? new String[0] : new String[]{"09C"}, "com.huawei.ohos.healthtv.hmservice", str, strCreateExFilterParamsWithSameAccount);
    }

    public static boolean isSupportFaController(int i) {
        boolean zBc = CommonUtil.bc();
        int iAe = CommonUtil.ae();
        boolean zIsSupportCenterController = ((DistributedApi) Services.b("DistributedService", DistributedApi.class)).isSupportCenterController(com.huawei.haf.application.BaseApplication.b());
        ReleaseLogUtil.d(TAG, "the phone can't use FA,isHarmony: ", Boolean.valueOf(zBc), " systemVersionCode: ", Integer.valueOf(iAe), " isSupportCenterController: ", Boolean.valueOf(zIsSupportCenterController));
        return !SportSupportUtil.h() && !EnvironmentInfo.m() && i == 1 && zIsSupportCenterController;
    }
}
