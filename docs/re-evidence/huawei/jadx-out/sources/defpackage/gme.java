package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.media3.common.C;
import com.google.gson.Gson;
import com.huawei.basefitnessadvice.callback.DataCallback;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.basefitnessadvice.model.FitnessDayPlan;
import com.huawei.basefitnessadvice.model.FitnessPlanCourse;
import com.huawei.basefitnessadvice.model.FitnessWeekPlan;
import com.huawei.basefitnessadvice.model.Plan;
import com.huawei.basefitnessadvice.model.PlanRecord;
import com.huawei.basefitnessadvice.model.intplan.IntPlan;
import com.huawei.haf.localbroadcastmanager.LocalBroadcastManager;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.plan.model.UserFitnessPlanInfo;
import com.huawei.health.plan.model.intplan.IntPlanBean;
import com.huawei.health.sport.model.WorkoutRecord;
import com.huawei.health.suggestion.ResultCallback;
import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import com.huawei.pluginfitnessadvice.FitnessPackageInfo;
import com.huawei.up.model.UserInfomation;
import health.compact.a.LogAnonymous;
import health.compact.a.Services;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes29.dex */
public class gme {
    private static final Object e = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ArrayList<PlanRecord> f35669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ConcurrentHashMap<String, UserFitnessPlanInfo> f35670b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ArrayList<String> f35671c;
    private ArrayList<FitnessPackageInfo> d;
    private Handler f;
    private LocalBroadcastManager g;
    private BroadcastReceiver i;
    private IntentFilter j;

    private gme() {
        this.f35669a = new ArrayList<>(10);
        this.j = new IntentFilter();
        this.i = new BroadcastReceiver() { // from class: gme.3
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                LogUtil.a("Suggestion_FitnessPackagePlanManager", "receive account broadcast ");
                if (context == null || intent == null) {
                    ReleaseLogUtil.e("Suggestion_FitnessPackagePlanManager", "BroadcastReceiver context == null || intent == null");
                } else if ("com.huawei.plugin.account.logout".equals(intent.getAction())) {
                    ReleaseLogUtil.d("Suggestion_FitnessPackagePlanManager", "receive account remove broadcast");
                    gme.this.j();
                }
            }
        };
        this.f = new Handler(Looper.getMainLooper());
        this.d = new ArrayList<>(10);
        this.f35671c = new ArrayList<>(10);
        this.f35670b = new ConcurrentHashMap<>(10);
        this.j.addAction("com.huawei.plugin.account.logout");
        LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance();
        this.g = localBroadcastManager;
        localBroadcastManager.registerReceiver(this.i, this.j);
    }

    public static final gme c() {
        return d.f35688b;
    }

    static class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final gme f35688b = new gme();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        this.d.clear();
        synchronized (e) {
            this.f35671c.clear();
        }
        this.f35670b.clear();
        this.f35669a.clear();
        glw.c().e();
    }

    public UserFitnessPlanInfo d(String str) {
        if (str == null) {
            return null;
        }
        return this.f35670b.get(str);
    }

    public PlanRecord e(String str) {
        if (str == null) {
            ReleaseLogUtil.a("Suggestion_FitnessPackagePlanManager", "getFitnessPlanRecord planId == null");
            return null;
        }
        UserFitnessPlanInfo userFitnessPlanInfo = this.f35670b.get(str);
        if (userFitnessPlanInfo == null) {
            ReleaseLogUtil.a("Suggestion_FitnessPackagePlanManager", "getFitnessPlanRecord such planId = ", str, " has no planrecord");
            return null;
        }
        return gmg.b(userFitnessPlanInfo);
    }

    public PlanRecord c(String str) {
        if (str == null) {
            ReleaseLogUtil.e("Suggestion_FitnessPackagePlanManager", "getDoingPlanRecord planId == null");
            return null;
        }
        UserFitnessPlanInfo userFitnessPlanInfoI = i();
        if (userFitnessPlanInfoI == null) {
            ReleaseLogUtil.e("Suggestion_FitnessPackagePlanManager", "getDoingPlanRecord such planId = ", str, " has no planrecord");
            return null;
        }
        return gmg.b(userFitnessPlanInfoI);
    }

    public void c(final UiCallback<List<PlanRecord>> uiCallback) {
        LogUtil.a("Suggestion_FitnessPackagePlanManager", "getAllPlanRecords enter");
        ThreadPoolManager.c().execute(new Runnable() { // from class: gme.1
            @Override // java.lang.Runnable
            public void run() {
                gme.this.f35669a = gme.c().d();
                if (Utils.j()) {
                    uiCallback.onSuccess(gme.this.f35669a);
                } else {
                    ReleaseLogUtil.d("Suggestion_FitnessPackagePlanManager", "getAllPlanRecords not china version");
                    uiCallback.onFailure(9999, "No china version");
                }
            }
        });
    }

    public ArrayList<PlanRecord> d() {
        LogUtil.a("Suggestion_FitnessPackagePlanManager", "getPlanRecords enter");
        ArrayList<PlanRecord> arrayList = new ArrayList<>(10);
        if (Utils.j()) {
            Iterator<Map.Entry<String, UserFitnessPlanInfo>> it = this.f35670b.entrySet().iterator();
            while (it.hasNext()) {
                PlanRecord planRecordB = gmg.b(it.next().getValue());
                if (planRecordB != null) {
                    arrayList.add(planRecordB);
                }
            }
        }
        this.f35669a = arrayList;
        LogUtil.a("Suggestion_FitnessPackagePlanManager", "getPlanRecords leave");
        return arrayList;
    }

    private float e(WorkoutRecord workoutRecord) {
        if (workoutRecord == null) {
            return Float.MIN_VALUE;
        }
        float fB = (float) b(workoutRecord.acquireWorkoutId());
        if (((int) fB) == 0) {
            return Float.MIN_VALUE;
        }
        return workoutRecord.acquireCalorie() / fB;
    }

    public float b(WorkoutRecord workoutRecord, UserInfomation userInfomation) {
        float fE;
        List<FitnessPlanCourse> listB;
        float fB = 0.0f;
        if (userInfomation != null) {
            fE = e(workoutRecord);
            if (fE < 0.0f) {
                fE = userInfomation.getWeightOrDefaultValue();
            }
            LogUtil.d("Suggestion_FitnessPackagePlanManager", "getDayShouldCompleteCalorie userWeight = ", Float.valueOf(fE));
        } else {
            fE = 0.0f;
        }
        if (workoutRecord != null && (listB = b(workoutRecord)) != null) {
            for (FitnessPlanCourse fitnessPlanCourse : listB) {
                if (fitnessPlanCourse != null) {
                    fB = (float) (((double) fB) + (b(fitnessPlanCourse.acquireCourseId()) * ((double) fE)));
                }
            }
        }
        return fB;
    }

    public float e(WorkoutRecord workoutRecord, UserInfomation userInfomation) {
        float weightOrDefaultValue;
        FitnessDayPlan fitnessDayPlan;
        if (userInfomation != null) {
            weightOrDefaultValue = userInfomation.getWeightOrDefaultValue();
            LogUtil.d("Suggestion_FitnessPackagePlanManager", "getWeekShouldCompleteCalorie userWeight = ", Float.valueOf(weightOrDefaultValue));
        } else {
            weightOrDefaultValue = 0.0f;
        }
        if (workoutRecord != null) {
            UserFitnessPlanInfo userFitnessPlanInfo = this.f35670b.get(workoutRecord.acquirePlanId());
            if (userFitnessPlanInfo == null) {
                ReleaseLogUtil.e("Suggestion_FitnessPackagePlanManager", "getWeekShouldCompleteCalorie planId is not exists: ", workoutRecord.acquirePlanId());
                return 0.0f;
            }
            long jA = ift.a(ifw.e(workoutRecord.acquireWorkoutDate(), "yyyy-MM-dd") * 1000);
            List<FitnessWeekPlan> listAcquireWeekPlanList = userFitnessPlanInfo.acquireWeekPlanList();
            if (listAcquireWeekPlanList != null) {
                for (FitnessWeekPlan fitnessWeekPlan : listAcquireWeekPlanList) {
                    if (fitnessWeekPlan != null && (fitnessDayPlan = fitnessWeekPlan.acquireWeekList().get(0)) != null && jA - ift.a(fitnessDayPlan.acquireDate()) <= 604800000) {
                        return c(weightOrDefaultValue, fitnessWeekPlan);
                    }
                }
            }
        }
        return 0.0f;
    }

    private float c(float f, FitnessWeekPlan fitnessWeekPlan) {
        List<FitnessPlanCourse> listAcquireDayPlanCourses;
        float fB = 0.0f;
        if (fitnessWeekPlan == null || fitnessWeekPlan.acquireWeekList() == null) {
            ReleaseLogUtil.e("Suggestion_FitnessPackagePlanManager", "getCalorieInOneDay, weekPlan == null || weekPlan.acquireWeekList() == null");
            return 0.0f;
        }
        for (FitnessDayPlan fitnessDayPlan : fitnessWeekPlan.acquireWeekList()) {
            if (fitnessDayPlan != null && fitnessDayPlan.acquireDayPlanCourses() != null && (listAcquireDayPlanCourses = fitnessDayPlan.acquireDayPlanCourses()) != null) {
                Iterator<FitnessPlanCourse> it = listAcquireDayPlanCourses.iterator();
                while (it.hasNext()) {
                    FitnessPlanCourse next = it.next();
                    fB = (float) (((double) fB) + (next == null ? 0.0d : b(next.acquireCourseId()) * ((double) f)));
                }
            }
        }
        return fB;
    }

    private List<FitnessPlanCourse> b(WorkoutRecord workoutRecord) {
        if (workoutRecord == null) {
            ReleaseLogUtil.e("Suggestion_FitnessPackagePlanManager", "getDayCourses, record == null");
            return null;
        }
        UserFitnessPlanInfo userFitnessPlanInfo = this.f35670b.get(workoutRecord.acquirePlanId());
        if (userFitnessPlanInfo == null) {
            ReleaseLogUtil.e("Suggestion_FitnessPackagePlanManager", "getDayCourses planId is not exists: ", workoutRecord.acquirePlanId());
            return null;
        }
        List<FitnessWeekPlan> listAcquireWeekPlanList = userFitnessPlanInfo.acquireWeekPlanList();
        if (listAcquireWeekPlanList == null) {
            ReleaseLogUtil.e("Suggestion_FitnessPackagePlanManager", "getDayCourses, weekPlanList == null");
            return null;
        }
        long jA = ift.a(ifw.e(workoutRecord.acquireWorkoutDate(), "yyyy-MM-dd") * 1000);
        for (FitnessWeekPlan fitnessWeekPlan : listAcquireWeekPlanList) {
            if (fitnessWeekPlan != null && fitnessWeekPlan.acquireWeekList() != null) {
                for (FitnessDayPlan fitnessDayPlan : fitnessWeekPlan.acquireWeekList()) {
                    if (fitnessDayPlan != null && jA == ift.a(fitnessDayPlan.acquireDate())) {
                        LogUtil.d("Suggestion_FitnessPackagePlanManager", "find time is ", Long.valueOf(jA));
                        return fitnessDayPlan.acquireDayPlanCourses();
                    }
                }
            }
        }
        return null;
    }

    public float c(WorkoutRecord workoutRecord) {
        LogUtil.a("Suggestion_FitnessPackagePlanManager", "updateLocalFitnessPkgInfo");
        if (workoutRecord == null) {
            ReleaseLogUtil.e("Suggestion_FitnessPackagePlanManager", "updateLocalFitnessPkgInfo invalid parameters, workoutRecord == null");
            return 0.0f;
        }
        UserFitnessPlanInfo userFitnessPlanInfoI = i();
        if (userFitnessPlanInfoI == null) {
            ReleaseLogUtil.e("Suggestion_FitnessPackagePlanManager", "updateLocalFitnessPkgInfo info == null");
            return 0.0f;
        }
        d(workoutRecord, userFitnessPlanInfoI);
        LogUtil.a("Suggestion_FitnessPackagePlanManager", "burnedCalorie = ", Float.valueOf(gmg.a(gmg.c(userFitnessPlanInfoI))));
        LogUtil.a("Suggestion_FitnessPackagePlanManager", "totalCalorie = ", userFitnessPlanInfoI.acquireTotalCalorie());
        ghf ghfVarE = gnw.e(userFitnessPlanInfoI);
        String strValueOf = String.valueOf(gnw.b(ghfVarE));
        LogUtil.a("Suggestion_FitnessPackagePlanManager", "rate = ", strValueOf);
        userFitnessPlanInfoI.saveCompleteRate(strValueOf);
        userFitnessPlanInfoI.saveFinishTime(System.currentTimeMillis());
        this.f35670b.put(userFitnessPlanInfoI.acquirePlanId(), userFitnessPlanInfoI);
        b(userFitnessPlanInfoI, new UiCallback<Object>() { // from class: gme.6
            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            public void onFailure(int i, String str) {
                ReleaseLogUtil.e("Suggestion_FitnessPackagePlanManager", "updateFitnessPlan onFailure errorCode = ", Integer.valueOf(i));
            }

            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            public void onSuccess(Object obj) {
                LogUtil.a("Suggestion_FitnessPackagePlanManager", "onSuccess data", obj);
            }
        });
        return gnw.b(ghfVarE);
    }

    public float d(UserFitnessPlanInfo userFitnessPlanInfo) {
        if (userFitnessPlanInfo == null) {
            LogUtil.j("Suggestion_FitnessPackagePlanManager", "getPlanTotalCalorie info is null");
            return 0.0f;
        }
        return a(userFitnessPlanInfo.acquireWeekPlanList()) / 1000.0f;
    }

    public float d(FitnessPackageInfo fitnessPackageInfo) {
        if (fitnessPackageInfo == null) {
            LogUtil.j("Suggestion_FitnessPackagePlanManager", "getPackageTotalCalorie info is null");
            return 0.0f;
        }
        return a(fitnessPackageInfo.acquireFitnessWeekPlanList());
    }

    private float a(List<FitnessWeekPlan> list) {
        float fE = 0.0f;
        if (njy.e(list)) {
            LogUtil.j("Suggestion_FitnessPackagePlanManager", "getTotalCalorie weekPlanList is empty");
            return 0.0f;
        }
        UserProfileMgrApi userProfileMgrApi = (UserProfileMgrApi) Services.d("HWUserProfileMgr", UserProfileMgrApi.class);
        if (userProfileMgrApi == null) {
            LogUtil.j("Suggestion_FitnessPackagePlanManager", "getTotalCalorie : userProfileMgrApi is null.");
            return 0.0f;
        }
        if (!o() && !userProfileMgrApi.waitInit()) {
            LogUtil.e("Suggestion_FitnessPackagePlanManager", "getTotalCalorie waitInit fail");
            return 0.0f;
        }
        UserInfomation userInfo = userProfileMgrApi.getUserInfo();
        if (userInfo == null) {
            LogUtil.j("Suggestion_FitnessPackagePlanManager", "getTotalCalorie userInfo is null");
            return 0.0f;
        }
        for (FitnessWeekPlan fitnessWeekPlan : list) {
            if (fitnessWeekPlan != null) {
                List<FitnessDayPlan> listAcquireWeekList = fitnessWeekPlan.acquireWeekList();
                if (njy.e(listAcquireWeekList)) {
                    LogUtil.j("Suggestion_FitnessPackagePlanManager", "dayPlanList is empty");
                } else {
                    Iterator<FitnessDayPlan> it = listAcquireWeekList.iterator();
                    while (it.hasNext()) {
                        fE += e(userInfo, it.next());
                    }
                }
            }
        }
        return fE;
    }

    private float e(UserInfomation userInfomation, FitnessDayPlan fitnessDayPlan) {
        float fAcquireCalorie = 0.0f;
        if (userInfomation == null || fitnessDayPlan == null) {
            ReleaseLogUtil.e("Suggestion_FitnessPackagePlanManager", "getDayPlanCalorie, userInfo == null || dayPlan == null");
            return 0.0f;
        }
        List<FitnessPlanCourse> listAcquireDayPlanCourses = fitnessDayPlan.acquireDayPlanCourses();
        if (listAcquireDayPlanCourses != null) {
            for (FitnessPlanCourse fitnessPlanCourse : listAcquireDayPlanCourses) {
                if (fitnessPlanCourse != null) {
                    fAcquireCalorie += fitnessPlanCourse.acquireCalorie() * userInfomation.getWeightOrDefaultValue();
                }
            }
        }
        return fAcquireCalorie;
    }

    public double b(String str) {
        return gms.a().c(str);
    }

    private void d(WorkoutRecord workoutRecord, UserFitnessPlanInfo userFitnessPlanInfo) {
        long time;
        if (workoutRecord == null || userFitnessPlanInfo == null) {
            ReleaseLogUtil.e("Suggestion_FitnessPackagePlanManager", "updatePlanInfo record == null || info == null");
            return;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
        String strValueOf = String.valueOf(workoutRecord.getPlanTrainDate());
        LogUtil.a("Suggestion_FitnessPackagePlanManager", "updatePlanInfo getPlanTrainDate", Integer.valueOf(workoutRecord.getPlanTrainDate()));
        if (TextUtils.isEmpty(strValueOf)) {
            LogUtil.e("Suggestion_FitnessPackagePlanManager", "updatePlanInfo dayWorkoutPlanDate isEmpty");
            return;
        }
        try {
            Date date = simpleDateFormat.parse(strValueOf);
            time = date != null ? date.getTime() : 0L;
        } catch (ParseException e2) {
            LogUtil.e("Suggestion_FitnessPackagePlanManager", "ParseException = ", LogAnonymous.b(e2));
        }
        a(workoutRecord, userFitnessPlanInfo, time);
    }

    private void a(WorkoutRecord workoutRecord, UserFitnessPlanInfo userFitnessPlanInfo, long j) {
        if (workoutRecord == null || userFitnessPlanInfo == null) {
            ReleaseLogUtil.e("Suggestion_FitnessPackagePlanManager", "updatePlanInfo record == null || info == null");
            return;
        }
        List<FitnessWeekPlan> listAcquireWeekPlanList = userFitnessPlanInfo.acquireWeekPlanList();
        if (listAcquireWeekPlanList == null) {
            return;
        }
        for (FitnessWeekPlan fitnessWeekPlan : listAcquireWeekPlanList) {
            if (fitnessWeekPlan != null) {
                for (FitnessDayPlan fitnessDayPlan : fitnessWeekPlan.acquireWeekList()) {
                    if (fitnessDayPlan != null && c(workoutRecord, j, fitnessDayPlan)) {
                        return;
                    }
                }
            }
        }
    }

    private boolean c(WorkoutRecord workoutRecord, long j, FitnessDayPlan fitnessDayPlan) {
        long jC = ift.c(j);
        long jC2 = ift.c(fitnessDayPlan.acquireDate());
        if (jC != ift.c(workoutRecord.acquireExerciseTime()) && (d(workoutRecord) || a(workoutRecord))) {
            LogUtil.a("Suggestion_FitnessPackagePlanManager", "updatePlanInfo invalid workoutRecord");
            return true;
        }
        if (jC != jC2) {
            return false;
        }
        LogUtil.a("Suggestion_FitnessPackagePlanManager", "current == target, and value = ", Long.valueOf(jC));
        b(workoutRecord, fitnessDayPlan);
        return false;
    }

    private void b(WorkoutRecord workoutRecord, FitnessDayPlan fitnessDayPlan) {
        if (workoutRecord == null || fitnessDayPlan == null) {
            ReleaseLogUtil.e("Suggestion_FitnessPackagePlanManager", "updatePlanCourseInfo record == null || dayPlan == null");
            return;
        }
        List<FitnessPlanCourse> listAcquireDayPlanCourses = fitnessDayPlan.acquireDayPlanCourses();
        for (int i = 0; i < listAcquireDayPlanCourses.size(); i++) {
            FitnessPlanCourse fitnessPlanCourse = listAcquireDayPlanCourses.get(i);
            if (fitnessPlanCourse != null) {
                int iAcquireWorkoutOrder = workoutRecord.acquireWorkoutOrder();
                LogUtil.a("Suggestion_FitnessPackagePlanManager", "updatePlanCourseInfo workoutOrder:", Integer.valueOf(iAcquireWorkoutOrder), "courseId:", fitnessPlanCourse.acquireCourseId(), workoutRecord.acquireWorkoutId());
                if (fitnessPlanCourse.acquireCourseId().equals(workoutRecord.acquireWorkoutId()) && workoutRecord.acquireWorkoutOrder() == i + 1) {
                    e(workoutRecord, fitnessPlanCourse);
                }
            }
        }
    }

    private void e(WorkoutRecord workoutRecord, FitnessPlanCourse fitnessPlanCourse) {
        if (workoutRecord == null || fitnessPlanCourse == null) {
            ReleaseLogUtil.e("Suggestion_FitnessPackagePlanManager", "updateCourseInfo record == null || course == null");
            return;
        }
        if (!fitnessPlanCourse.acquireFinishStatus()) {
            LogUtil.a("Suggestion_FitnessPackagePlanManager", "update corresponding course = ", fitnessPlanCourse.acquireName());
            if (workoutRecord.acquireFinishRate() >= 60.0f) {
                fitnessPlanCourse.saveFinishStatus(true);
            }
            fitnessPlanCourse.saveBurnedCalorie(workoutRecord.acquireActualCalorie());
            fitnessPlanCourse.saveWorkoutTime(workoutRecord.getDuration());
            return;
        }
        if (fitnessPlanCourse.acquireBurnedCalorie() < workoutRecord.acquireActualCalorie()) {
            fitnessPlanCourse.saveBurnedCalorie(workoutRecord.acquireActualCalorie());
        }
        if (fitnessPlanCourse.acquireWorkoutTime() < workoutRecord.getDuration()) {
            fitnessPlanCourse.saveWorkoutTime(workoutRecord.getDuration());
        }
    }

    public int b(long j) {
        UserFitnessPlanInfo userFitnessPlanInfoI = i();
        if (userFitnessPlanInfoI == null) {
            ReleaseLogUtil.e("Suggestion_FitnessPackagePlanManager", "getTodayTaskStatus info == null");
            return 0;
        }
        List<FitnessWeekPlan> listAcquireWeekPlanList = userFitnessPlanInfoI.acquireWeekPlanList();
        if (listAcquireWeekPlanList == null) {
            return 0;
        }
        int iC = 0;
        int i = 0;
        for (FitnessWeekPlan fitnessWeekPlan : listAcquireWeekPlanList) {
            if (fitnessWeekPlan != null) {
                for (FitnessDayPlan fitnessDayPlan : fitnessWeekPlan.acquireWeekList()) {
                    if (fitnessDayPlan != null && ift.a(fitnessDayPlan.acquireDate()) == ift.a(j)) {
                        LogUtil.d("Suggestion_FitnessPackagePlanManager", "find today exercise course");
                        List<FitnessPlanCourse> listAcquireDayPlanCourses = fitnessDayPlan.acquireDayPlanCourses();
                        int size = listAcquireDayPlanCourses == null ? 0 : listAcquireDayPlanCourses.size();
                        iC = c(iC, listAcquireDayPlanCourses);
                        i = size;
                    }
                }
            }
        }
        if (iC == 0) {
            return 0;
        }
        return iC == i ? 2 : 1;
    }

    private int c(int i, List<FitnessPlanCourse> list) {
        if (list == null) {
            ReleaseLogUtil.e("Suggestion_FitnessPackagePlanManager", "getRealFinishWorkoutNumber, courseList == null");
            return 0;
        }
        for (FitnessPlanCourse fitnessPlanCourse : list) {
            if (fitnessPlanCourse != null && fitnessPlanCourse.acquireFinishStatus()) {
                i++;
            }
        }
        return i;
    }

    private boolean d(WorkoutRecord workoutRecord) {
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
        if (accountInfo == null) {
            ReleaseLogUtil.e("Suggestion_FitnessPackagePlanManager", "hasExercised accountInfo == null");
            return true;
        }
        Plan planA = a();
        if (planA == null) {
            ReleaseLogUtil.e("Suggestion_FitnessPackagePlanManager", "hasExercised fitnessPlan == null");
            return true;
        }
        List<WorkoutRecord> listA = gmw.a(accountInfo, planA.acquireId(), workoutRecord.acquireWorkoutDate());
        if (listA.isEmpty()) {
            ReleaseLogUtil.e("Suggestion_FitnessPackagePlanManager", "hasExercised recordList.isEmpty()");
            return false;
        }
        long jA = ift.a(workoutRecord.acquireExerciseTime());
        for (int i = 0; i < listA.size(); i++) {
            if (jA == ift.a(listA.get(i).acquireExerciseTime())) {
                ReleaseLogUtil.d("Suggestion_FitnessPackagePlanManager", "hasExercised realZeroTime == historyZeroTime");
                return false;
            }
        }
        return true;
    }

    public boolean a(WorkoutRecord workoutRecord) {
        Plan planA = a();
        if (planA == null) {
            ReleaseLogUtil.e("Suggestion_FitnessPackagePlanManager", "hasWorkoutTimeBeyondPlanLastTime fitnessPlan == null");
            return true;
        }
        if (ift.a(workoutRecord.acquireExerciseTime()) <= ift.a(ifw.e(planA.getEndDate(), "yyyy-MM-dd") * 1000)) {
            return false;
        }
        ReleaseLogUtil.d("Suggestion_FitnessPackagePlanManager", "hasWorkoutTimeBeyondPlanLastTime plan expired");
        return true;
    }

    public UserFitnessPlanInfo i() {
        final UserFitnessPlanInfo[] userFitnessPlanInfoArr = {null};
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        gmi.b().b(new UiCallback<ghf>() { // from class: gme.8
            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            public void onFailure(int i, String str) {
                LogUtil.a("Suggestion_FitnessPackagePlanManager", "readCurrentPlanFromIntPlan errorCode = ", Integer.valueOf(i), "errorInfo = ", str);
                countDownLatch.countDown();
            }

            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public void onSuccess(ghf ghfVar) {
                if (ghfVar == null || ghfVar.d() == null) {
                    LogUtil.a("Suggestion_FitnessPackagePlanManager", "readCurrentPlanFromIntPlan UserFitnessPlanInfo == null");
                } else {
                    UserFitnessPlanInfo userFitnessPlanInfoD = ghfVar.d();
                    userFitnessPlanInfoArr[0] = userFitnessPlanInfoD;
                    LogUtil.a("Suggestion_FitnessPackagePlanManager", "readCurrentPlanFromIntPlan onSuccess");
                    if (userFitnessPlanInfoD.acquirePlanId() != null) {
                        gme.this.f35670b.putIfAbsent(userFitnessPlanInfoD.acquirePlanId(), userFitnessPlanInfoD);
                    }
                }
                countDownLatch.countDown();
            }
        });
        try {
            if (!countDownLatch.await(C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS, TimeUnit.MILLISECONDS)) {
                LogUtil.j("Suggestion_FitnessPackagePlanManager", "readCurrentPlanFromIntPlan wait timeout");
            }
        } catch (InterruptedException unused) {
            LogUtil.e("Suggestion_FitnessPackagePlanManager", "interrupted while waiting for readCurrentPlanFromIntPlan");
        }
        return userFitnessPlanInfoArr[0];
    }

    public Plan a() {
        UserFitnessPlanInfo userFitnessPlanInfoI;
        if (Utils.j() && (userFitnessPlanInfoI = i()) != null) {
            return gmg.e(userFitnessPlanInfoI);
        }
        return null;
    }

    public void b(UserFitnessPlanInfo userFitnessPlanInfo, final UiCallback<Object> uiCallback) {
        LogUtil.a("Suggestion_FitnessPackagePlanManager", "updateFitnessPlan");
        if (g()) {
            uiCallback.onFailure(Constants.COORDINATE_FAIL_DEF, "this is overseas version");
            return;
        }
        userFitnessPlanInfo.savePlanStatus(0);
        userFitnessPlanInfo.saveFinishTime(System.currentTimeMillis());
        ghw.b().updateFitnessPackagePlan(userFitnessPlanInfo, new DataCallback() { // from class: gme.7
            @Override // com.huawei.basefitnessadvice.callback.DataCallback
            public void onFailure(int i, String str) {
                ReleaseLogUtil.e("Suggestion_FitnessPackagePlanManager", "updateFitnessPlan onFailure errorCode = ", Integer.valueOf(i));
                uiCallback.onFailure(gme.this.f, i, str);
            }

            @Override // com.huawei.basefitnessadvice.callback.DataCallback
            public void onSuccess(JSONObject jSONObject) {
                LogUtil.a("Suggestion_FitnessPackagePlanManager", "updateFitnessPlan success. data ", jSONObject);
                uiCallback.onSuccess(gme.this.f, jSONObject);
                glw.c().e();
            }
        });
    }

    public void a(String str) {
        final UserFitnessPlanInfo userFitnessPlanInfoI;
        if (g() || (userFitnessPlanInfoI = i()) == null) {
            return;
        }
        userFitnessPlanInfoI.saveName(str);
        ghw.b().updateFitnessPackagePlan(userFitnessPlanInfoI, new DataCallback() { // from class: gme.10
            @Override // com.huawei.basefitnessadvice.callback.DataCallback
            public void onFailure(int i, String str2) {
                ReleaseLogUtil.e("Suggestion_FitnessPackagePlanManager", "updateCurrentFitnessPlanName errorCode = ", Integer.valueOf(i));
            }

            @Override // com.huawei.basefitnessadvice.callback.DataCallback
            public void onSuccess(JSONObject jSONObject) {
                LogUtil.j("Suggestion_FitnessPackagePlanManager", "updateCurrentFitnessPlanName onSuccess");
                glw.c().e();
                gme.this.b(userFitnessPlanInfoI);
                btq.e().e("PLAN_UPDATE");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(UserFitnessPlanInfo userFitnessPlanInfo) {
        LogUtil.a("Suggestion_FitnessPackagePlanManager", "updateLocalPlanRecord enter");
        if (userFitnessPlanInfo == null) {
            LogUtil.j("Suggestion_FitnessPackagePlanManager", "updateLocalPlanRecord info == null");
            return false;
        }
        PlanRecord planRecordB = gmg.b(userFitnessPlanInfo);
        if (planRecordB == null) {
            LogUtil.j("Suggestion_FitnessPackagePlanManager", "updateLocalPlanRecord doingRecord == null");
            return false;
        }
        for (int i = 0; i < this.f35669a.size(); i++) {
            if (this.f35669a.get(i).acquirePlanId().equals(planRecordB.acquirePlanId())) {
                this.f35669a.remove(i);
                this.f35669a.add(planRecordB);
                this.f35670b.put(userFitnessPlanInfo.acquirePlanId(), userFitnessPlanInfo);
                LogUtil.a("Suggestion_FitnessPackagePlanManager", "updateLocalPlanRecord success");
                return true;
            }
        }
        LogUtil.a("Suggestion_FitnessPackagePlanManager", "updateLocalPlanRecord fail");
        return false;
    }

    public void e(int i) {
        UserFitnessPlanInfo userFitnessPlanInfoI;
        if (g() || (userFitnessPlanInfoI = i()) == null) {
            return;
        }
        userFitnessPlanInfoI.saveRemindTime(i);
        b(i);
        ghw.b().updateFitnessPackagePlan(userFitnessPlanInfoI, new DataCallback() { // from class: gme.9
            @Override // com.huawei.basefitnessadvice.callback.DataCallback
            public void onFailure(int i2, String str) {
                ReleaseLogUtil.e("Suggestion_FitnessPackagePlanManager", "updateCurrentFitnessPlanRemindTime errorCode = ", Integer.valueOf(i2));
            }

            @Override // com.huawei.basefitnessadvice.callback.DataCallback
            public void onSuccess(JSONObject jSONObject) {
                LogUtil.j("Suggestion_FitnessPackagePlanManager", "updateCurrentFitnessPlanRemindTime onSuccess");
                glw.c().e();
            }
        });
    }

    public void b(int i) {
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
        ghf ghfVarF = f();
        if (ghfVarF == null || accountInfo == null) {
            return;
        }
        glq.e(ghfVarF, true, i);
    }

    private ghf f() {
        LogUtil.a("Suggestion_FitnessPackagePlanManager", "getIntPlanImpl getCurrentIntPlan");
        ghf ghfVarA = gmi.b().a();
        if (ghfVarA != null) {
            return ghfVarA;
        }
        UserFitnessPlanInfo userFitnessPlanInfoI = i();
        LogUtil.a("Suggestion_FitnessPackagePlanManager", "getIntPlanImpl convertFitnessPlan");
        return gnw.e(userFitnessPlanInfoI);
    }

    public boolean b() {
        return glq.a();
    }

    public int h() {
        return glq.d();
    }

    public void e(ghr ghrVar, UiCallback uiCallback) {
        int iC;
        boolean z;
        if (g()) {
            uiCallback.onFailure(Constants.COORDINATE_FAIL_DEF, "this is overseas version");
            return;
        }
        if (uiCallback == null) {
            LogUtil.j("Suggestion_FitnessPackagePlanManager", "invalid parameters, callback is null");
            return;
        }
        String strE = ghrVar.e();
        long jCurrentTimeMillis = System.currentTimeMillis();
        gho ghoVarA = ghrVar.a();
        if (ghoVarA != null) {
            strE = ghoVarA.d();
            jCurrentTimeMillis = ghoVarA.e();
            iC = ghoVarA.c();
            LogUtil.a("Suggestion_FitnessPackagePlanManager", "isGeneralPlan planTempId = ", strE, " startTime = ", Long.valueOf(jCurrentTimeMillis), " remindTime = ", Integer.valueOf(iC));
            z = true;
        } else {
            iC = 1080;
            z = false;
        }
        int i = iC;
        long j = jCurrentTimeMillis;
        if (strE == null || strE.isEmpty()) {
            LogUtil.j("Suggestion_FitnessPackagePlanManager", "invalid parameters, planTempId is null or empty");
            uiCallback.onFailure(-1, "invalid parameters, planTempId is null or empty");
            return;
        }
        FitnessPackageInfo fitnessPackageInfoB = gms.a().b(strE);
        if (fitnessPackageInfoB == null) {
            LogUtil.j("Suggestion_FitnessPackagePlanManager", "plan package not exists");
            uiCallback.onFailure(-1, "plan package not exists");
            return;
        }
        UserFitnessPlanInfo userFitnessPlanInfoB = b(fitnessPackageInfoB, j, i, z);
        if (userFitnessPlanInfoB == null) {
            LogUtil.j("Suggestion_FitnessPackagePlanManager", "user fitness plan info is null.");
            uiCallback.onFailure(this.f, -1, "user fitness plan info is null.");
        } else if (gnw.f35849b && !z) {
            c(userFitnessPlanInfoB, (UiCallback<IntPlan>) uiCallback);
        } else {
            e((UiCallback<UserFitnessPlanInfo>) uiCallback, userFitnessPlanInfoB);
        }
    }

    private void e(final UiCallback<UserFitnessPlanInfo> uiCallback, UserFitnessPlanInfo userFitnessPlanInfo) {
        ghw.b().createFitnessPackagePlan(userFitnessPlanInfo, new DataCallback() { // from class: gme.13
            @Override // com.huawei.basefitnessadvice.callback.DataCallback
            public void onFailure(int i, String str) {
                ReleaseLogUtil.e("Suggestion_FitnessPackagePlanManager", "createFitnessPackagePlan errorCode = ", Integer.valueOf(i), " errorInfo = ", str);
                uiCallback.onFailure(gme.this.f, i, str);
            }

            @Override // com.huawei.basefitnessadvice.callback.DataCallback
            public void onSuccess(JSONObject jSONObject) {
                if (jSONObject == null) {
                    uiCallback.onFailure(gme.this.f, -1, "cloud has no doing plan data");
                    return;
                }
                String string = jSONObject.toString();
                LogUtil.a("Suggestion_FitnessPackagePlanManager", "createFitnessPackagePlan onSuccess data = ", jSONObject);
                gme.this.g(string);
                UserFitnessPlanInfo userFitnessPlanInfo2 = (UserFitnessPlanInfo) new Gson().fromJson(jSONObject.optString("userFitnessPlanInfo"), UserFitnessPlanInfo.class);
                FitnessPackageInfo fitnessPackageInfoB = gms.a().b(userFitnessPlanInfo2.acquirePlanTempId());
                if (fitnessPackageInfoB != null) {
                    userFitnessPlanInfo2.saveCardPicture(fitnessPackageInfoB.acquirePicture());
                }
                gme.this.f35670b.put(userFitnessPlanInfo2.acquirePlanId(), userFitnessPlanInfo2);
                gme.this.f35669a.add(gmg.b(userFitnessPlanInfo2));
                gmi.b().a(userFitnessPlanInfo2);
                gme.this.b(userFitnessPlanInfo2.acquireRemindTime());
                uiCallback.onSuccess(gme.this.f, userFitnessPlanInfo2);
            }
        });
    }

    private void c(final UserFitnessPlanInfo userFitnessPlanInfo, final UiCallback<IntPlan> uiCallback) {
        IntPlanBean intPlanBean = new IntPlanBean(gnw.c(userFitnessPlanInfo));
        LogUtil.d("Suggestion_FitnessPackagePlanManager", "createIntPlan bean = ", intPlanBean);
        gmi.b().c(intPlanBean, new UiCallback<IntPlan>() { // from class: gme.14
            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            public void onFailure(int i, String str) {
                LogUtil.j("Suggestion_FitnessPackagePlanManager", "create new IntPlan fallback");
                gme.this.e(userFitnessPlanInfo, (UiCallback<IntPlan>) uiCallback);
            }

            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onSuccess(IntPlan intPlan) {
                LogUtil.d("Suggestion_FitnessPackagePlanManager", "create new IntPlan success.");
                uiCallback.onSuccess(intPlan);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(UserFitnessPlanInfo userFitnessPlanInfo, final UiCallback<IntPlan> uiCallback) {
        ghw.b().createFitnessPackagePlan(userFitnessPlanInfo, new DataCallback() { // from class: gme.5
            @Override // com.huawei.basefitnessadvice.callback.DataCallback
            public void onFailure(int i, String str) {
                LogUtil.e("Suggestion_FitnessPackagePlanManager", "createFitnessPackagePlan errorCode = ", Integer.valueOf(i), " errorInfo = ", str);
                uiCallback.onFailure(gme.this.f, i, str);
            }

            @Override // com.huawei.basefitnessadvice.callback.DataCallback
            public void onSuccess(JSONObject jSONObject) {
                if (jSONObject == null) {
                    uiCallback.onFailure(gme.this.f, -1, "cloud has no doing plan data");
                    return;
                }
                String string = jSONObject.toString();
                LogUtil.a("Suggestion_FitnessPackagePlanManager", "createFallBack onSuccess data = ", jSONObject);
                gme.this.g(string);
                UserFitnessPlanInfo userFitnessPlanInfo2 = (UserFitnessPlanInfo) new Gson().fromJson(jSONObject.optString("userFitnessPlanInfo"), UserFitnessPlanInfo.class);
                FitnessPackageInfo fitnessPackageInfoB = gms.a().b(userFitnessPlanInfo2.acquirePlanTempId());
                if (fitnessPackageInfoB != null) {
                    userFitnessPlanInfo2.saveCardPicture(fitnessPackageInfoB.acquirePicture());
                }
                gme.this.f35670b.put(userFitnessPlanInfo2.acquirePlanId(), userFitnessPlanInfo2);
                gme.this.f35669a.add(gmg.b(userFitnessPlanInfo2));
                ghf ghfVarA = gmi.b().a(userFitnessPlanInfo2);
                gme.this.b(userFitnessPlanInfo2.acquireRemindTime());
                uiCallback.onSuccess(gme.this.f, ghfVarA);
                btq.e().e("PLAN_CREATE");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(String str) {
        HashMap map = new HashMap(10);
        if (idy.d()) {
            map.put("create_time", Long.valueOf(System.currentTimeMillis()));
            map.put("type", 1);
        }
        map.put(ParsedFieldTag.GOAL, 3);
        map.put("data", str);
        idy.b("1120008", map);
    }

    public void d(final ResultCallback resultCallback) {
        if (resultCallback == null) {
            LogUtil.j("Suggestion_FitnessPackagePlanManager", "queryAllCompletedFitnessPlan callback == null");
        } else if (g()) {
            resultCallback.onResult(Constants.COORDINATE_FAIL_DEF, "this is overseas version");
        } else {
            ghw.b().queryFitnessPlanSummary(new DataCallback() { // from class: gme.4
                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onFailure(int i, String str) {
                    ReleaseLogUtil.e("Suggestion_FitnessPackagePlanManager", "queryAllCompletedFitnessPlan errorCode = ", Integer.valueOf(i));
                    resultCallback.onResult(i, str);
                }

                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onSuccess(JSONObject jSONObject) {
                    LogUtil.d("Suggestion_FitnessPackagePlanManager", "queryAllCompletedFitnessPlan onSuccess");
                    synchronized (gme.e) {
                        gme.this.e(jSONObject);
                        gme.this.e(resultCallback);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(final ResultCallback resultCallback) {
        if (njy.e(this.f35671c)) {
            LogUtil.a("Suggestion_FitnessPackagePlanManager", "cloud has no completed fitness plan");
            resultCallback.onResult(0, "mAllCompletedPlanIds.isEmpty()");
        } else {
            Iterator<String> it = this.f35671c.iterator();
            while (it.hasNext()) {
                ghw.b().queryFitnessPkgPlan(it.next(), new DataCallback() { // from class: gme.2
                    @Override // com.huawei.basefitnessadvice.callback.DataCallback
                    public void onFailure(int i, String str) {
                        LogUtil.j("Suggestion_FitnessPackagePlanManager", "errorCode = ", Integer.valueOf(i), "; errorInfo = ", str);
                        resultCallback.onResult(i, str);
                    }

                    @Override // com.huawei.basefitnessadvice.callback.DataCallback
                    public void onSuccess(JSONObject jSONObject) {
                        if (jSONObject == null) {
                            resultCallback.onResult(-1, "cloud has data");
                            return;
                        }
                        LogUtil.a("Suggestion_FitnessPackagePlanManager", "getCloudCompletedPlanDetails onSuccess");
                        gme.this.b(jSONObject.optString("userFitnessPlanInfo"), resultCallback);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str, ResultCallback resultCallback) {
        UserFitnessPlanInfo userFitnessPlanInfo = (UserFitnessPlanInfo) new Gson().fromJson(str, UserFitnessPlanInfo.class);
        if (userFitnessPlanInfo != null) {
            String strAcquirePlanId = userFitnessPlanInfo.acquirePlanId();
            this.f35670b.put(strAcquirePlanId, userFitnessPlanInfo);
            if (this.f35671c.size() > 0) {
                ArrayList<String> arrayList = this.f35671c;
                if (strAcquirePlanId.equals(arrayList.get(arrayList.size() - 1))) {
                    resultCallback.onResult(0, "has finished download plans");
                }
            }
            if (userFitnessPlanInfo.acquirePlanStatus() == 0) {
                glw.c().e();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(JSONObject jSONObject) {
        if (jSONObject == null) {
            LogUtil.j("Suggestion_FitnessPackagePlanManager", "getCloudCompletedPlanIds, data == null");
            return;
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("userFitnessPlanList");
        if (jSONArrayOptJSONArray != null) {
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                try {
                    String string = jSONArrayOptJSONArray.optJSONObject(i).getString("planId");
                    if (!this.f35671c.contains(string)) {
                        this.f35671c.add(string);
                    }
                } catch (JSONException e2) {
                    LogUtil.e("Suggestion_FitnessPackagePlanManager", LogAnonymous.b(e2));
                }
            }
        }
    }

    private UserFitnessPlanInfo b(FitnessPackageInfo fitnessPackageInfo, long j, int i, boolean z) {
        if (fitnessPackageInfo == null) {
            LogUtil.e("Suggestion_FitnessPackagePlanManager", "buildUserFitnessPackage info == null");
            return null;
        }
        UserProfileMgrApi userProfileMgrApi = (UserProfileMgrApi) Services.d("HWUserProfileMgr", UserProfileMgrApi.class);
        if (userProfileMgrApi == null) {
            LogUtil.j("Suggestion_FitnessPackagePlanManager", "buildUserFitnessPackage : userProfileMgrApi is null.");
            return null;
        }
        UserInfomation userInfo = userProfileMgrApi.getUserInfo();
        if (userInfo == null) {
            LogUtil.j("Suggestion_FitnessPackagePlanManager", "userInfo == null");
            return null;
        }
        float weightOrDefaultValue = userInfo.getWeightOrDefaultValue();
        UserFitnessPlanInfo userFitnessPlanInfo = new UserFitnessPlanInfo();
        userFitnessPlanInfo.savePlanTempId(fitnessPackageInfo.acquirePlanTempId());
        userFitnessPlanInfo.saveName(fitnessPackageInfo.acquireName());
        userFitnessPlanInfo.savePicture(fitnessPackageInfo.acquirePicture());
        userFitnessPlanInfo.saveCardPicture(fitnessPackageInfo.acquireCardPicture());
        userFitnessPlanInfo.saveDescription(fitnessPackageInfo.acquireDescription());
        userFitnessPlanInfo.saveRemindTime(i);
        if (z) {
            return d(fitnessPackageInfo, userFitnessPlanInfo, j);
        }
        return d(weightOrDefaultValue, fitnessPackageInfo, userFitnessPlanInfo, j);
    }

    private UserFitnessPlanInfo d(float f, FitnessPackageInfo fitnessPackageInfo, UserFitnessPlanInfo userFitnessPlanInfo, long j) {
        ArrayList arrayList = new ArrayList(10);
        List<FitnessWeekPlan> listAcquireFitnessWeekPlanList = fitnessPackageInfo.acquireFitnessWeekPlanList();
        if (njy.e(listAcquireFitnessWeekPlanList)) {
            LogUtil.j("Suggestion_FitnessPackagePlanManager", "convertFitnessPlan fitnessWeekPlanList == null");
            return null;
        }
        double dB = 0.0d;
        int i = 0;
        for (FitnessWeekPlan fitnessWeekPlan : listAcquireFitnessWeekPlanList) {
            FitnessWeekPlan fitnessWeekPlan2 = new FitnessWeekPlan();
            fitnessWeekPlan2.saveWeekOrder(fitnessWeekPlan.acquireWeekOrder());
            fitnessWeekPlan2.saveWeekDesc(fitnessWeekPlan.acquireWeekDesc());
            fitnessWeekPlan2.saveWeekPeriod(fitnessWeekPlan.acquireWeekPeriod());
            ArrayList arrayList2 = new ArrayList(10);
            for (FitnessDayPlan fitnessDayPlan : fitnessWeekPlan.acquireWeekList()) {
                FitnessDayPlan fitnessDayPlan2 = (FitnessDayPlan) fitnessDayPlan.clone();
                fitnessDayPlan2.saveStartTime(j + (((long) i) * 86400000));
                arrayList2.add(fitnessDayPlan2);
                dB = b(f, dB, fitnessDayPlan.acquireDayPlanCourses());
                i++;
            }
            fitnessWeekPlan2.saveWeekList(arrayList2);
            arrayList.add(fitnessWeekPlan2);
        }
        LogUtil.a("Suggestion_FitnessPackagePlanManager", "totalCalorie = ", Double.valueOf(dB), "cal");
        float f2 = ((float) dB) / 1000.0f;
        LogUtil.a("Suggestion_FitnessPackagePlanManager", "kCal = ", Float.valueOf(f2), ParsedFieldTag.K_CAL);
        userFitnessPlanInfo.saveTotalCalorie(String.valueOf(f2));
        userFitnessPlanInfo.saveWeekPlanList(arrayList);
        return userFitnessPlanInfo;
    }

    private UserFitnessPlanInfo d(FitnessPackageInfo fitnessPackageInfo, UserFitnessPlanInfo userFitnessPlanInfo, long j) {
        userFitnessPlanInfo.saveIntroduction(fitnessPackageInfo.acquireIntroduction());
        userFitnessPlanInfo.saveDisplayStyle(fitnessPackageInfo.acquireDisplayStyle());
        userFitnessPlanInfo.savePlanCategory(fitnessPackageInfo.acquirePlanCategory());
        userFitnessPlanInfo.saveBeginDate(j / 1000);
        ArrayList arrayList = new ArrayList(10);
        List<FitnessWeekPlan> listAcquireWeeklyPlanList = fitnessPackageInfo.acquireWeeklyPlanList();
        if (njy.e(listAcquireWeeklyPlanList)) {
            LogUtil.j("Suggestion_FitnessPackagePlanManager", "convertGeneralPlan fitnessWeekPlanList == null");
            return null;
        }
        for (FitnessWeekPlan fitnessWeekPlan : listAcquireWeeklyPlanList) {
            FitnessWeekPlan fitnessWeekPlan2 = new FitnessWeekPlan();
            fitnessWeekPlan2.saveWeekOrder(fitnessWeekPlan.acquireWeekOrder());
            ArrayList arrayList2 = new ArrayList(10);
            Iterator<FitnessDayPlan> it = fitnessWeekPlan.acquireDailyPlanList().iterator();
            int i = 0;
            while (it.hasNext()) {
                FitnessDayPlan fitnessDayPlan = (FitnessDayPlan) it.next().clone();
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(new Date(j));
                int i2 = 7;
                int iB = (ift.b(calendar.get(7)) + i) % 7;
                if (iB != 0) {
                    i2 = iB;
                }
                fitnessDayPlan.saveDayOrder(i2);
                arrayList2.add(fitnessDayPlan);
                i++;
            }
            fitnessWeekPlan2.saveDailyPlanList(arrayList2);
            arrayList.add(fitnessWeekPlan2);
        }
        userFitnessPlanInfo.saveWeeklyPlanList(arrayList);
        return userFitnessPlanInfo;
    }

    private double b(float f, double d2, List<FitnessPlanCourse> list) {
        if (list != null) {
            for (FitnessPlanCourse fitnessPlanCourse : list) {
                if (fitnessPlanCourse != null) {
                    d2 += fitnessPlanCourse.acquireWorkoutRealCal() * ((double) f);
                }
            }
        }
        return d2;
    }

    private boolean g() {
        boolean zD = gyy.c.d();
        LogUtil.d("Suggestion_FitnessPackagePlanManager", "getIsOversea() = ", Boolean.valueOf(zD));
        return zD;
    }

    private boolean o() {
        return Looper.getMainLooper() == Looper.myLooper();
    }
}
