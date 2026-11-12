package com.xiaomi.fitness.training_plan_export.manager;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.mine.export.IWebSync;
import com.xiaomi.fitness.training_plan_export.model.AbilityPlan;
import com.xiaomi.fitness.training_plan_export.model.AbilityPlanVideoCourse;
import com.xiaomi.fitness.training_plan_export.model.DeviceTrainingInfoParseResult;
import com.xiaomi.fitness.training_plan_export.model.ForceStopCheckResult;
import com.xiaomi.fitness.training_plan_export.model.GetEntranceInfoResult;
import com.xiaomi.fitness.training_plan_export.model.HabitDayPlan;
import com.xiaomi.fitness.training_plan_export.model.HabitPlan;
import com.xiaomi.fitness.training_plan_export.model.SportKey;
import com.xiaomi.fitness.watch.face.edit.entity.DialWidgetType;
import defpackage.qu9;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\bf\u0018\u0000 w2\u00020\u0001:\u0002wxJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H&¢\u0006\u0004\b\t\u0010\bJ0\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\nH¦@¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0013H&¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0017H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001c\u001a\u00020\u001bH&¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010\"\u001a\u00020\u00042\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 H&¢\u0006\u0004\b\"\u0010#J+\u0010&\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\n2\u0006\u0010%\u001a\u00020\f2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 H&¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b(\u0010\u0006J\u000f\u0010)\u001a\u00020\u0004H&¢\u0006\u0004\b)\u0010\bJ\u000f\u0010*\u001a\u00020\u0004H&¢\u0006\u0004\b*\u0010\bJ\u0017\u0010+\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b+\u0010\u0006J\u0012\u0010-\u001a\u0004\u0018\u00010,H¦@¢\u0006\u0004\b-\u0010.J\u001a\u00100\u001a\u0004\u0018\u00010\u00102\u0006\u0010/\u001a\u00020\fH¦@¢\u0006\u0004\b0\u00101J/\u00107\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u0002022\u0006\u00103\u001a\u00020\n2\u0006\u00105\u001a\u0002042\u0006\u00106\u001a\u00020\u0010H&¢\u0006\u0004\b7\u00108J\u0017\u00109\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u000202H&¢\u0006\u0004\b9\u0010:J\u0017\u0010;\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u000202H&¢\u0006\u0004\b;\u0010:J\u0017\u0010<\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u000202H&¢\u0006\u0004\b<\u0010:J\u0017\u0010=\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u000202H&¢\u0006\u0004\b=\u0010:J/\u0010@\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010>\u001a\u00020\u00172\u0006\u0010?\u001a\u00020\u0017H&¢\u0006\u0004\b@\u0010AJ)\u0010E\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010C\u001a\u00020B2\b\b\u0002\u0010D\u001a\u00020\nH&¢\u0006\u0004\bE\u0010FJ\u0012\u0010H\u001a\u0004\u0018\u00010GH¦@¢\u0006\u0004\bH\u0010.J'\u0010L\u001a\u00020\u00042\u0006\u0010I\u001a\u0002022\u000e\u0010K\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010JH&¢\u0006\u0004\bL\u0010MJ'\u0010N\u001a\u00020\u00042\u0006\u0010I\u001a\u0002022\u000e\u0010K\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010JH&¢\u0006\u0004\bN\u0010MJ)\u0010R\u001a\u00020\u00042\u0006\u0010I\u001a\u0002022\u0006\u0010P\u001a\u00020O2\b\b\u0002\u0010Q\u001a\u00020\u0010H&¢\u0006\u0004\bR\u0010SJ)\u0010U\u001a\u00020\u00042\u0006\u0010I\u001a\u0002022\u0006\u0010T\u001a\u00020\u00102\b\b\u0002\u0010Q\u001a\u00020\u0010H&¢\u0006\u0004\bU\u0010VJ)\u0010Z\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010W\u001a\u00020\u00172\b\u0010Y\u001a\u0004\u0018\u00010XH&¢\u0006\u0004\bZ\u0010[J)\u0010^\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010W\u001a\u00020\u00172\b\u0010]\u001a\u0004\u0018\u00010\\H&¢\u0006\u0004\b^\u0010_J\"\u0010c\u001a\u0004\u0018\u00010b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010a\u001a\u00020`H¦@¢\u0006\u0004\bc\u0010dJ/\u0010f\u001a\u00020\u00042\u0006\u0010I\u001a\u00020\u00132\u0006\u0010e\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010a\u001a\u00020`H&¢\u0006\u0004\bf\u0010gJ\u001f\u0010h\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0017H&¢\u0006\u0004\bh\u0010iJ!\u0010j\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00132\b\b\u0002\u0010\u0018\u001a\u00020\u0017H&¢\u0006\u0004\bj\u0010iJ\u000f\u0010k\u001a\u00020\u0017H&¢\u0006\u0004\bk\u0010lJ\u000f\u0010m\u001a\u00020\u0004H&¢\u0006\u0004\bm\u0010\bJ#\u0010p\u001a\u00020\u00042\u0006\u0010I\u001a\u0002022\n\b\u0002\u0010o\u001a\u0004\u0018\u00010nH&¢\u0006\u0004\bp\u0010qJ\u0017\u0010s\u001a\u00020\f2\u0006\u0010r\u001a\u00020\nH&¢\u0006\u0004\bs\u0010tJ\u0017\u0010u\u001a\u00020\u00102\u0006\u0010>\u001a\u00020\u0017H&¢\u0006\u0004\bu\u0010v¨\u0006y"}, d2 = {"Lcom/xiaomi/fitness/training_plan_export/manager/ITrainingManager;", "", "Landroid/content/Context;", "context", "", "launchAbilityPlanQuestionPage", "(Landroid/content/Context;)V", "syncSportReport", "()V", "getTodayUnFinishedTrainingCourse", "", "gender", "", "birthday", "height", "weight", "", "confirmUserInfo", "(ILjava/lang/String;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/app/Activity;", "launchPlanHistory", "(Landroid/app/Activity;)V", "planType", "", "planId", "launchPlanReport", "(Landroid/content/Context;IJ)V", "Lqu9;", "training", "Lcom/xiaomi/fitness/training_plan_export/model/DeviceTrainingInfoParseResult;", "unpackTrainingPacket", "(Lqu9;)Lcom/xiaomi/fitness/training_plan_export/model/DeviceTrainingInfoParseResult;", "Lcom/xiaomi/fitness/training_plan_export/manager/ITrainingManager$ISyncCallback;", "callback", "stopTrainingPlan", "(Lcom/xiaomi/fitness/training_plan_export/manager/ITrainingManager$ISyncCallback;)V", "trainingType", "trainingPlan", "syncLocalTrainingPlan2Device", "(ILjava/lang/String;Lcom/xiaomi/fitness/training_plan_export/manager/ITrainingManager$ISyncCallback;)V", "startCreateHabitPlanActivity", "getTodayTrainingInfo", "syncTrainingPlanWithDeviceIfNeeded", "launchTrainingTypeListActivity", "Lcom/xiaomi/fitness/training_plan_export/model/ForceStopCheckResult;", "checkForceStop", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data", "closeForceStopBubble", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/fragment/app/FragmentActivity;", "runningType", "", "runningDistance", "paceFaster", "launchHabitSuggestActivity", "(Landroidx/fragment/app/FragmentActivity;IFZ)V", "testAbilityRunningCourse", "(Landroidx/fragment/app/FragmentActivity;)V", "testAbilityVideoCourse", "testHabitRunningCourse", "testHabitSuggestActivity", "courseId", DialWidgetType.DATE, "launchAbilityRunningCourseDetailActivity", "(Landroid/content/Context;JJJ)V", "Lcom/xiaomi/fitness/training_plan_export/model/AbilityPlanVideoCourse;", "videoCourse", "from", "launchVideoCourseInfoActivity", "(Landroid/content/Context;Lcom/xiaomi/fitness/training_plan_export/model/AbilityPlanVideoCourse;I)V", "Lcom/xiaomi/fitness/training_plan_export/model/GetEntranceInfoResult;", "getPlanEntranceInfo", LifecycleConstantKt.TYPE_ACTIVITY, "Lkotlin/Function0;", "dismissCallBack", "showHabitFirstPop", "(Landroidx/fragment/app/FragmentActivity;Lkotlin/jvm/functions/Function0;)V", "showFinishedPop", "Lcom/xiaomi/fitness/training_plan_export/model/HabitDayPlan;", "habitDayPlan", "fromRnPlan", "showHabitPlanSportDialog", "(Landroidx/fragment/app/FragmentActivity;Lcom/xiaomi/fitness/training_plan_export/model/HabitDayPlan;Z)V", "hasHabitHistory", "showHabitCreatePlanDialog", "(Landroidx/fragment/app/FragmentActivity;ZZ)V", "planID", "Lcom/xiaomi/fitness/training_plan_export/model/AbilityPlan;", "abilityPlan", "gotoAbilityPlanSettingPage", "(Landroid/content/Context;JLcom/xiaomi/fitness/training_plan_export/model/AbilityPlan;)V", "Lcom/xiaomi/fitness/training_plan_export/model/HabitPlan;", "habitPlan", "gotoHabitPlanSettingPage", "(Landroid/content/Context;JLcom/xiaomi/fitness/training_plan_export/model/HabitPlan;)V", "Lcom/xiaomi/fitness/training_plan_export/model/SportKey;", "sportKey", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "getTheSportReport", "(JLcom/xiaomi/fitness/training_plan_export/model/SportKey;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "type", "gotoSportReport", "(Landroid/app/Activity;IJLcom/xiaomi/fitness/training_plan_export/model/SportKey;)V", "gotoAbilityDetailActivity", "(Landroid/app/Activity;J)V", "gotoHabitHomeActivity", "getInitHabitPlanId", "()J", "clearTrainingPlanSettings", "Lcom/xiaomi/fitness/mine/export/IWebSync;", "iWebSync", "showCloudSyncDialog", "(Landroidx/fragment/app/FragmentActivity;Lcom/xiaomi/fitness/mine/export/IWebSync;)V", "pace", "buildPaceStr", "(I)Ljava/lang/String;", "isCourseIdInAbilityRange", "(J)Z", "Companion", "ISyncCallback", "training-plan-export_release"}, k = 1, mv = {2, 0, 0})
public interface ITrainingManager {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/training_plan_export/manager/ITrainingManager$Companion;", "", "<init>", "()V", "training-plan-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void gotoHabitHomeActivity$default(ITrainingManager iTrainingManager, Activity activity, long j, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: gotoHabitHomeActivity");
            }
            if ((i & 2) != 0) {
                j = 0;
            }
            iTrainingManager.gotoHabitHomeActivity(activity, j);
        }

        public static /* synthetic */ void launchVideoCourseInfoActivity$default(ITrainingManager iTrainingManager, Context context, AbilityPlanVideoCourse abilityPlanVideoCourse, int i, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: launchVideoCourseInfoActivity");
            }
            if ((i2 & 4) != 0) {
                i = 0;
            }
            iTrainingManager.launchVideoCourseInfoActivity(context, abilityPlanVideoCourse, i);
        }

        public static /* synthetic */ void showCloudSyncDialog$default(ITrainingManager iTrainingManager, FragmentActivity fragmentActivity, IWebSync iWebSync, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showCloudSyncDialog");
            }
            if ((i & 2) != 0) {
                iWebSync = null;
            }
            iTrainingManager.showCloudSyncDialog(fragmentActivity, iWebSync);
        }

        public static /* synthetic */ void showHabitCreatePlanDialog$default(ITrainingManager iTrainingManager, FragmentActivity fragmentActivity, boolean z, boolean z2, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showHabitCreatePlanDialog");
            }
            if ((i & 4) != 0) {
                z2 = false;
            }
            iTrainingManager.showHabitCreatePlanDialog(fragmentActivity, z, z2);
        }

        public static /* synthetic */ void showHabitPlanSportDialog$default(ITrainingManager iTrainingManager, FragmentActivity fragmentActivity, HabitDayPlan habitDayPlan, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showHabitPlanSportDialog");
            }
            if ((i & 4) != 0) {
                z = false;
            }
            iTrainingManager.showHabitPlanSportDialog(fragmentActivity, habitDayPlan, z);
        }

        public static /* synthetic */ void stopTrainingPlan$default(ITrainingManager iTrainingManager, ISyncCallback iSyncCallback, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: stopTrainingPlan");
            }
            if ((i & 1) != 0) {
                iSyncCallback = null;
            }
            iTrainingManager.stopTrainingPlan(iSyncCallback);
        }

        public static /* synthetic */ void syncLocalTrainingPlan2Device$default(ITrainingManager iTrainingManager, int i, String str, ISyncCallback iSyncCallback, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: syncLocalTrainingPlan2Device");
            }
            if ((i2 & 4) != 0) {
                iSyncCallback = null;
            }
            iTrainingManager.syncLocalTrainingPlan2Device(i, str, iSyncCallback);
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/training_plan_export/manager/ITrainingManager$ISyncCallback;", "", "onSuccess", "", "onFail", "msg", "", "code", "", "training-plan-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface ISyncCallback {
        void onFail(@NotNull String msg, int code);

        void onSuccess();
    }

    @NotNull
    String buildPaceStr(int pace);

    @Nullable
    Object checkForceStop(@NotNull Continuation<? super ForceStopCheckResult> continuation);

    void clearTrainingPlanSettings();

    @Nullable
    Object closeForceStopBubble(@NotNull String str, @NotNull Continuation<? super Boolean> continuation);

    @Nullable
    Object confirmUserInfo(int i, @NotNull String str, int i2, int i3, @NotNull Continuation<? super Boolean> continuation);

    long getInitHabitPlanId();

    @Nullable
    Object getPlanEntranceInfo(@NotNull Continuation<? super GetEntranceInfoResult> continuation);

    @Nullable
    Object getTheSportReport(long j, @NotNull SportKey sportKey, @NotNull Continuation<? super SportBasicReport> continuation);

    void getTodayTrainingInfo();

    void getTodayUnFinishedTrainingCourse();

    void gotoAbilityDetailActivity(@NotNull Activity context, long planId);

    void gotoAbilityPlanSettingPage(@NotNull Context context, long planID, @Nullable AbilityPlan abilityPlan);

    void gotoHabitHomeActivity(@NotNull Activity context, long planId);

    void gotoHabitPlanSettingPage(@NotNull Context context, long planID, @Nullable HabitPlan habitPlan);

    void gotoSportReport(@NotNull Activity activity, int type, long planId, @NotNull SportKey sportKey);

    boolean isCourseIdInAbilityRange(long courseId);

    void launchAbilityPlanQuestionPage(@NotNull Context context);

    void launchAbilityRunningCourseDetailActivity(@NotNull Context context, long planId, long courseId, long date);

    void launchHabitSuggestActivity(@NotNull FragmentActivity context, int runningType, float runningDistance, boolean paceFaster);

    void launchPlanHistory(@NotNull Activity context);

    void launchPlanReport(@NotNull Context context, int planType, long planId);

    void launchTrainingTypeListActivity(@NotNull Context context);

    void launchVideoCourseInfoActivity(@NotNull Context context, @NotNull AbilityPlanVideoCourse videoCourse, int from);

    void showCloudSyncDialog(@NotNull FragmentActivity activity, @Nullable IWebSync iWebSync);

    void showFinishedPop(@NotNull FragmentActivity activity, @Nullable Function0<Unit> dismissCallBack);

    void showHabitCreatePlanDialog(@NotNull FragmentActivity activity, boolean hasHabitHistory, boolean fromRnPlan);

    void showHabitFirstPop(@NotNull FragmentActivity activity, @Nullable Function0<Unit> dismissCallBack);

    void showHabitPlanSportDialog(@NotNull FragmentActivity activity, @NotNull HabitDayPlan habitDayPlan, boolean fromRnPlan);

    void startCreateHabitPlanActivity(@NotNull Context context);

    void stopTrainingPlan(@Nullable ISyncCallback callback);

    void syncLocalTrainingPlan2Device(int trainingType, @NotNull String trainingPlan, @Nullable ISyncCallback callback);

    void syncSportReport();

    void syncTrainingPlanWithDeviceIfNeeded();

    void testAbilityRunningCourse(@NotNull FragmentActivity context);

    void testAbilityVideoCourse(@NotNull FragmentActivity context);

    void testHabitRunningCourse(@NotNull FragmentActivity context);

    void testHabitSuggestActivity(@NotNull FragmentActivity context);

    @Nullable
    DeviceTrainingInfoParseResult unpackTrainingPacket(@NotNull qu9 training);
}
