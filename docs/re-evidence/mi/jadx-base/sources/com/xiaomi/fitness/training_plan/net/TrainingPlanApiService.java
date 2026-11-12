package com.xiaomi.fitness.training_plan.net;

import com.xiaomi.fitness.net.response.BaseResult;
import com.xiaomi.fitness.net.url.BaseUrl;
import com.xiaomi.fitness.net.url.Secret;
import com.xiaomi.fitness.training_plan.common.TrainReport;
import com.xiaomi.fitness.training_plan_export.model.AbilityDetailSummary;
import com.xiaomi.fitness.training_plan_export.model.ForceStopCheckResult;
import com.xiaomi.fitness.training_plan_export.model.GetEntranceInfoResult;
import com.xiaomi.fitness.training_plan_export.model.HabitPlanHome;
import com.xiaomi.fitness.training_plan_export.model.HabitPlanImprove;
import com.xiaomi.fitness.training_plan_export.model.HabitSuccessResult;
import defpackage.ngh;
import defpackage.u0a;
import defpackage.uua;
import defpackage.zk9;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@BaseUrl(host = "https://hlth.io.mi.com/", path = "app/v1/")
@Secret(pathPrefix = "")
@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u0000 ;2\u00020\u0001:\u0001;J\b\u0010\u0002\u001a\u00020\u0003H'J\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00052\b\b\u0001\u0010\n\u001a\u00020\u000bH§@¢\u0006\u0002\u0010\fJ\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0005H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00052\b\b\u0001\u0010\n\u001a\u00020\u000bH§@¢\u0006\u0002\u0010\fJ\u001e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00052\b\b\u0001\u0010\n\u001a\u00020\u000bH§@¢\u0006\u0002\u0010\fJ\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0005H§@¢\u0006\u0002\u0010\u0007J\u0018\u0010\u0015\u001a\u00020\u00162\b\b\u0001\u0010\n\u001a\u00020\u000bH§@¢\u0006\u0002\u0010\fJ\u0018\u0010\u0017\u001a\u00020\u00182\b\b\u0001\u0010\n\u001a\u00020\u000bH§@¢\u0006\u0002\u0010\fJ\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0005H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00052\b\b\u0001\u0010\n\u001a\u00020\u000bH§@¢\u0006\u0002\u0010\fJ\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0005H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00052\b\b\u0001\u0010\n\u001a\u00020\u000bH§@¢\u0006\u0002\u0010\fJ\u001e\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u00052\b\b\u0001\u0010\n\u001a\u00020\u000bH§@¢\u0006\u0002\u0010\fJ\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u0005H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u00052\b\b\u0001\u0010\n\u001a\u00020\u000bH§@¢\u0006\u0002\u0010\fJ\u0014\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\u0005H§@¢\u0006\u0002\u0010\u0007J\u0014\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\u0005H§@¢\u0006\u0002\u0010\u0007J\u0014\u0010*\u001a\b\u0012\u0004\u0012\u00020+0\u0005H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010,\u001a\b\u0012\u0004\u0012\u00020\t0\u00052\b\b\u0001\u0010\n\u001a\u00020\u000bH§@¢\u0006\u0002\u0010\fJ\u001e\u0010-\u001a\b\u0012\u0004\u0012\u00020.0\u00052\b\b\u0001\u0010\n\u001a\u00020\u000bH§@¢\u0006\u0002\u0010\fJ\u001e\u0010/\u001a\b\u0012\u0004\u0012\u0002000\u00052\b\b\u0001\u0010\n\u001a\u00020\u000bH§@¢\u0006\u0002\u0010\fJ\u001e\u00101\u001a\b\u0012\u0004\u0012\u0002020\u00052\b\b\u0001\u0010\n\u001a\u00020\u000bH§@¢\u0006\u0002\u0010\fJ\u001e\u00103\u001a\b\u0012\u0004\u0012\u00020\t0\u00052\b\b\u0001\u0010\n\u001a\u00020\u000bH§@¢\u0006\u0002\u0010\fJ\u001e\u00104\u001a\b\u0012\u0004\u0012\u0002050\u00052\b\b\u0001\u0010\n\u001a\u00020\u000bH§@¢\u0006\u0002\u0010\fJ\u001e\u00106\u001a\b\u0012\u0004\u0012\u0002070\u00052\b\b\u0001\u0010\n\u001a\u00020\u000bH§@¢\u0006\u0002\u0010\fJ\u001e\u00108\u001a\b\u0012\u0004\u0012\u0002090\u00052\b\b\u0001\u0010\n\u001a\u00020\u000bH§@¢\u0006\u0002\u0010\fJ\u001e\u0010:\u001a\b\u0012\u0004\u0012\u00020\t0\u00052\b\b\u0001\u0010\n\u001a\u00020\u000bH§@¢\u0006\u0002\u0010\f¨\u0006<"}, d2 = {"Lcom/xiaomi/fitness/training_plan/net/TrainingPlanApiService;", "", "getAbilityPlanQuestion", "", "getWeekAbilityPlan", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/fitness/training_plan/net/GetCurAbilityPlanResult;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "confirmUserInfo", "Lcom/xiaomi/fitness/training_plan/net/ExecStatusResult;", "data", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUserAbility", "Lcom/xiaomi/fitness/training_plan/net/UserAbility;", "generateAbilityPlan", "Lcom/xiaomi/fitness/training_plan/net/GenerateAbilityPlanResult;", "getAbilityPlanDetailSummary", "Lcom/xiaomi/fitness/training_plan_export/model/AbilityDetailSummary;", "stopAbilityPlan", "Lcom/xiaomi/fitness/training_plan/net/StopAbilityPlanResult;", "getHabitPlanSuggest", "Lcom/xiaomi/fitness/training_plan/net/GetHabitPlanSuggestResult;", "generateHabitPlan", "Lcom/xiaomi/fitness/training_plan/net/GenerateHabitPlanResult;", "terminateHabitPlan", "Lcom/xiaomi/fitness/training_plan_export/model/HabitSuccessResult;", "getHabitPlanHomeDetail", "Lcom/xiaomi/fitness/training_plan_export/model/HabitPlanHome;", "getHabitPlanImproveCheck", "Lcom/xiaomi/fitness/training_plan_export/model/HabitPlanImprove;", "habitPlanImproveReply", "getAbilityRunningCourseInfo", "Lcom/xiaomi/fitness/training_plan/net/GetAbilityCourseInfo;", "checkForceStop", "Lcom/xiaomi/fitness/training_plan_export/model/ForceStopCheckResult;", "getTrainingPlanHistory", "Lcom/xiaomi/fitness/training_plan/net/GetPlanHistoryResult;", "getHabitPlanDetail", "Lcom/xiaomi/fitness/training_plan/net/GetHabitPlanDetailResult;", "getPlanEntranceInfo", "Lcom/xiaomi/fitness/training_plan_export/model/GetEntranceInfoResult;", "getPlanTypeList", "Lcom/xiaomi/fitness/training_plan/net/GetPlanTypeListResult;", "closeForceStopBubble", "getPlanSportReport", "Lcom/xiaomi/fitness/training_plan/net/GetPlanSportReportListResult;", "getTheSportReport", "Lcom/xiaomi/fitness/training_plan/net/GetTheSportReportResult;", "getHabitPlanSettings", "Lcom/xiaomi/fitness/training_plan/net/SmartRunningRemindSettings;", "updateHabitPlanSettings", "updateAbilityPlanSettings", "Lcom/xiaomi/fitness/training_plan/net/SmartRunningRemindSettingUpdateResult;", "getTrainPlanReport", "Lcom/xiaomi/fitness/training_plan/common/TrainReport;", "getSportPlanSettings", "Lcom/xiaomi/fitness/training_plan/net/SportRemindSettings;", "updateSportPlanSettings", "Companion", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface TrainingPlanApiService {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @NotNull
    public static final String HTTP_HOST = "https://hlth.io.mi.com/";

    @NotNull
    public static final String HTTP_PATH = "app/v1/";

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/fitness/training_plan/net/TrainingPlanApiService$Companion;", "", "<init>", "()V", "HTTP_PATH", "", "HTTP_HOST", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        public static final String HTTP_HOST = "https://hlth.io.mi.com/";

        @NotNull
        public static final String HTTP_PATH = "app/v1/";

        private Companion() {
        }
    }

    @Nullable
    @uua("smart_running/force_stop_check")
    Object checkForceStop(@NotNull Continuation<? super BaseResult<ForceStopCheckResult>> continuation);

    @u0a
    @ngh("smart_running/plan_report/click_bubble")
    @Nullable
    Object closeForceStopBubble(@NotNull @zk9("data") String str, @NotNull Continuation<? super BaseResult<ExecStatusResult>> continuation);

    @u0a
    @ngh("smart_running/improve/user_info")
    @Nullable
    Object confirmUserInfo(@NotNull @zk9("data") String str, @NotNull Continuation<? super BaseResult<ExecStatusResult>> continuation);

    @u0a
    @ngh("smart_running/improve/generate")
    @Nullable
    Object generateAbilityPlan(@NotNull @zk9("data") String str, @NotNull Continuation<? super BaseResult<GenerateAbilityPlanResult>> continuation);

    @u0a
    @ngh("smart_running/build/adjust")
    @Nullable
    Object generateHabitPlan(@NotNull @zk9("data") String str, @NotNull Continuation<? super GenerateHabitPlanResult> continuation);

    @u0a
    @ngh("smart_running/improve/summary")
    @Nullable
    Object getAbilityPlanDetailSummary(@NotNull @zk9("data") String str, @NotNull Continuation<? super BaseResult<AbilityDetailSummary>> continuation);

    @uua
    void getAbilityPlanQuestion();

    @u0a
    @ngh("smart_running/improve/course_detail")
    @Nullable
    Object getAbilityRunningCourseInfo(@NotNull @zk9("data") String str, @NotNull Continuation<? super BaseResult<GetAbilityCourseInfo>> continuation);

    @Nullable
    @uua("smart_running/build/detail")
    Object getHabitPlanDetail(@NotNull Continuation<? super BaseResult<GetHabitPlanDetailResult>> continuation);

    @u0a
    @ngh("smart_running/build/summary")
    @Nullable
    Object getHabitPlanHomeDetail(@NotNull @zk9("data") String str, @NotNull Continuation<? super BaseResult<HabitPlanHome>> continuation);

    @Nullable
    @uua("smart_running/build/improve_check")
    Object getHabitPlanImproveCheck(@NotNull Continuation<? super BaseResult<HabitPlanImprove>> continuation);

    @u0a
    @ngh("smart_running/remind_info")
    @Nullable
    Object getHabitPlanSettings(@NotNull @zk9("data") String str, @NotNull Continuation<? super BaseResult<SmartRunningRemindSettings>> continuation);

    @u0a
    @ngh("smart_running/build/suggest")
    @Nullable
    Object getHabitPlanSuggest(@NotNull @zk9("data") String str, @NotNull Continuation<? super GetHabitPlanSuggestResult> continuation);

    @Nullable
    @uua("smart_running/entrance")
    Object getPlanEntranceInfo(@NotNull Continuation<? super BaseResult<GetEntranceInfoResult>> continuation);

    @u0a
    @ngh("smart_running/plan_report/sport_record")
    @Nullable
    Object getPlanSportReport(@NotNull @zk9("data") String str, @NotNull Continuation<? super BaseResult<GetPlanSportReportListResult>> continuation);

    @Nullable
    @uua("smart_running/plan_list")
    Object getPlanTypeList(@NotNull Continuation<? super BaseResult<GetPlanTypeListResult>> continuation);

    @u0a
    @ngh("plan/remind_info")
    @Nullable
    Object getSportPlanSettings(@NotNull @zk9("data") String str, @NotNull Continuation<? super BaseResult<SportRemindSettings>> continuation);

    @u0a
    @ngh("smart_running/sport_record")
    @Nullable
    Object getTheSportReport(@NotNull @zk9("data") String str, @NotNull Continuation<? super BaseResult<GetTheSportReportResult>> continuation);

    @u0a
    @ngh("smart_running/plan_report")
    @Nullable
    Object getTrainPlanReport(@NotNull @zk9("data") String str, @NotNull Continuation<? super BaseResult<TrainReport>> continuation);

    @u0a
    @ngh("smart_running/plan_report/history")
    @Nullable
    Object getTrainingPlanHistory(@NotNull @zk9("data") String str, @NotNull Continuation<? super BaseResult<GetPlanHistoryResult>> continuation);

    @Nullable
    @uua("smart_running/improve/user_ability")
    Object getUserAbility(@NotNull Continuation<? super BaseResult<UserAbility>> continuation);

    @Nullable
    @uua("smart_running/week_plan")
    Object getWeekAbilityPlan(@NotNull Continuation<? super BaseResult<GetCurAbilityPlanResult>> continuation);

    @u0a
    @ngh("smart_running/build/improve_reply")
    @Nullable
    Object habitPlanImproveReply(@NotNull @zk9("data") String str, @NotNull Continuation<? super BaseResult<HabitSuccessResult>> continuation);

    @Nullable
    @uua("smart_running/improve/terminate")
    Object stopAbilityPlan(@NotNull Continuation<? super BaseResult<StopAbilityPlanResult>> continuation);

    @Nullable
    @uua("smart_running/build/teminate")
    Object terminateHabitPlan(@NotNull Continuation<? super BaseResult<HabitSuccessResult>> continuation);

    @u0a
    @ngh("smart_running/improve/adjust")
    @Nullable
    Object updateAbilityPlanSettings(@NotNull @zk9("data") String str, @NotNull Continuation<? super BaseResult<SmartRunningRemindSettingUpdateResult>> continuation);

    @u0a
    @ngh("smart_running/build/setting")
    @Nullable
    Object updateHabitPlanSettings(@NotNull @zk9("data") String str, @NotNull Continuation<? super BaseResult<ExecStatusResult>> continuation);

    @u0a
    @ngh("plan/remind_set")
    @Nullable
    Object updateSportPlanSettings(@NotNull @zk9("data") String str, @NotNull Continuation<? super BaseResult<ExecStatusResult>> continuation);
}
