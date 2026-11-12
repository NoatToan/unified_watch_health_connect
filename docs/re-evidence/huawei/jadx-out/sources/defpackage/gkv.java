package defpackage;

import com.huawei.haf.application.BaseApplication;
import com.huawei.login.ui.login.LoginInit;
import health.compact.a.GRSManager;

/* JADX INFO: loaded from: classes29.dex */
public class gkv {
    public static String z() {
        return a(cm() + "/getFilters");
    }

    public static String e() {
        return a(cn() + "/getAggregatePageByType");
    }

    public static String ao() {
        return a(ch() + "/getWorkoutList");
    }

    public static String am() {
        return a(ch() + "/getWorkoutInfo");
    }

    public static String ap() {
        return a(ch() + "/getWorkoutPackageInfo");
    }

    public static String aw() {
        return a(ch() + "/getWorkoutsInfo");
    }

    public static String p() {
        return a(ch() + "/getActionList");
    }

    public static String aa() {
        return a(ch() + "/getFitnessActionInfo");
    }

    public static String ab() {
        return a(ch() + "/getFitnessPackage");
    }

    public static String f() {
        return ch() + "/createFitnessPlan";
    }

    public static String bd() {
        return ch() + "/postRunPlan";
    }

    public static String as() {
        return a(ch() + "/getWorkoutUrl");
    }

    public static String ay() {
        return ch() + "/postBhavior";
    }

    public static String ai() {
        return ch() + "/getMyPlan";
    }

    public static String m() {
        return ch() + "/finishExercise";
    }

    public static String ag() {
        return ch() + "/getPlanProgress";
    }

    public static String s() {
        return ch() + "/finishPlan";
    }

    public static String bn() {
        return ch() + "/queryPlanStatistics";
    }

    public static String bu() {
        return ch() + "/queryTrainStatistics";
    }

    public static String bw() {
        return ch() + "/queryTrainCount";
    }

    public static String bo() {
        return ch() + "/queryTrainCountByWorkoutId";
    }

    public static String ak() {
        return ch() + "/getUserBestRecords";
    }

    public static String bf() {
        return ch() + "/postBestRecord";
    }

    public static String bl() {
        return ch() + "/postTrainBestRecords";
    }

    public static String af() {
        return a(ch() + "/getMultiLanguage");
    }

    public static String bq() {
        return a(ch() + "/queryTopicList");
    }

    public static String ar() {
        return a(ch() + "/getWorkoutsByTopicId");
    }

    public static String g() {
        return ch() + "/collectBehavior";
    }

    public static String i() {
        return ch() + "/deleteBehavior";
    }

    public static String x() {
        return ch() + "/getBehaviorList";
    }

    public static String al() {
        return GRSManager.c(BaseApplication.b()).getUrl("healthCloudUrl") + "/dataRecommend/resource/v1/recommendResources";
    }

    public static String o() {
        return ch() + "/deleteUserWorkout";
    }

    public static String n() {
        return ch() + "/deleteLogs";
    }

    public static String aj() {
        return a(ch() + "/getRunRecoWorkout");
    }

    public static String bk() {
        return ch() + "/queryFitnessPlanSummary";
    }

    public static String bm() {
        return ch() + "/queryFitnessPlanDetail";
    }

    public static String br() {
        return ch() + "/queryMyDoingFitnessPlan";
    }

    public static String bb() {
        return ch() + "/myFinishPlans";
    }

    public static String an() {
        return a(ch() + "/getRecommendWorkout");
    }

    public static String ae() {
        return ch() + "/getRecWorkoutByCourseTypeAnon";
    }

    public static String bv() {
        return ch() + "/queryTrainList";
    }

    public static String bh() {
        return ch() + "/postPlanRemind";
    }

    public static String at() {
        return ch() + "/modifyPlanName";
    }

    public static String cb() {
        return ch() + "/updateFitnessPlan";
    }

    public static String b() {
        return cp() + "/allowCreateOldPlan";
    }

    public static String bp() {
        return ch() + "/queryOperationPage";
    }

    public static String aq() {
        return a(ch() + "/getWorkoutsByType");
    }

    public static String q() {
        return a(ch() + "/getActionInfo");
    }

    public static String t() {
        return a(cp() + "/getAllPlans");
    }

    public static String c() {
        return cp() + "/achievementForecast";
    }

    public static String j() {
        return cp() + "/createPlan";
    }

    public static String be() {
        return cp() + "/postFeedback";
    }

    public static String ah() {
        return cp() + "/getPlanReport";
    }

    public static String y() {
        return cp() + "/getCoachAdvice";
    }

    public static String u() {
        return cp() + "/getCurrentReportIndex";
    }

    public static String cf() {
        return cp() + "/updatePlan";
    }

    public static String cg() {
        return cp() + "/updatePlanDate";
    }

    public static String cc() {
        return cp() + "/updatePlanReport";
    }

    public static String ce() {
        return ch() + "/workoutCompletionPunch";
    }

    private static String a(String str) {
        if (!LoginInit.getInstance(BaseApplication.b()).isBrowseMode()) {
            return str;
        }
        return str + "Anon";
    }

    private static String ch() {
        return GRSManager.c(BaseApplication.b()).getUrl("sportSuggestUrl");
    }

    private static String cp() {
        return ch() + "/intRunningPlan";
    }

    public static String bi() {
        return GRSManager.c(BaseApplication.b()).getUrl("marketingGateWayUrl") + "/healthFitnessPlan/app/v1/myCompetitions";
    }

    public static String bt() {
        return GRSManager.c(BaseApplication.b()).getUrl("activityUrl") + "/activity/setEvent";
    }

    private static String cj() {
        return ch() + "/intPlan";
    }

    public static String au() {
        return cj() + "/updateCustomAction";
    }

    public static String av() {
        return cj() + "/postFeedback";
    }

    public static String w() {
        return cj() + "/getDoingPlan";
    }

    public static String h() {
        return cj() + "/createPlan";
    }

    public static String bx() {
        return cj() + "/stopPlan";
    }

    public static String by() {
        return cj() + "/updatePlan";
    }

    public static String bg() {
        return cj() + "/postPlanReport";
    }

    public static String ad() {
        return cj() + "/getPlanReport";
    }

    public static String r() {
        return cj() + "/generateReport";
    }

    public static String ca() {
        return cj() + "/updatePlanProperty";
    }

    public static String bz() {
        return cj() + "/updatePlanDayRecord";
    }

    public static String k() {
        return cj() + "/deletePlanExerciseRecord";
    }

    public static String bs() {
        return cj() + "/replacePlanSchedule";
    }

    public static String ax() {
        return cj() + "/v1/leavePlan";
    }

    public static String a() {
        return cj() + "/v1/cancelLeave";
    }

    public static String cd() {
        return cj() + "/v1/updatePlanCalendar";
    }

    public static String d() {
        return ch() + "/addUserDefinedWorkout";
    }

    public static String az() {
        return ch() + "/modifyUserDefinedWorkout";
    }

    public static String cl() {
        return ch() + "/deleteUserDefinedWorkout";
    }

    public static String ci() {
        return cm() + "/getFilterTab";
    }

    private static String cn() {
        return ch() + "/v1";
    }

    private static String cm() {
        return ch() + "/v2";
    }

    private static String co() {
        return GRSManager.c(BaseApplication.b()).getUrl("messageCenterUrl") + "/messageCenter";
    }

    private static String b(String str, boolean z) {
        if (LoginInit.getInstance(BaseApplication.b()).isBrowseMode() && z) {
            return str;
        }
        return "/user" + str;
    }

    public static String bj() {
        return co() + b("/queryAudiosPackageBySeriesId", true);
    }

    public static String v() {
        return co() + b("/getBehaviorList", false);
    }

    public static String ba() {
        return co() + "/operateFavoriteAudio";
    }

    public static String l() {
        return co() + b("/deletePlayRecord", false);
    }

    public static String bc() {
        return ch() + "/v2" + b("/getNavigationCourseList", true);
    }

    public static String ac() {
        return ch() + "/getSnapShotAndAlgorithmAnon";
    }

    public static String ck() {
        return ch() + "/queryMaxScore";
    }
}
