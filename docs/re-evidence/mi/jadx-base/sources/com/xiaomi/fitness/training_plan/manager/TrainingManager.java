package com.xiaomi.fitness.training_plan.manager;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.google.gson.Gson;
import com.mibi.sdk.DeductConstants;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.fitness.export.api.FitnessDataGetter;
import com.xiaomi.fit.fitness.export.api.FitnessServerSyncer;
import com.xiaomi.fit.fitness.export.api.TrainingPlanCallback;
import com.xiaomi.fit.fitness.export.di.FitnessDataExtKt;
import com.xiaomi.fitness.account.region.RegionPreference;
import com.xiaomi.fitness.baseui.view.BaseActivity;
import com.xiaomi.fitness.baseui.view.PageState;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.OnDeviceStatusListener;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.internal.extetions.LogExtKt;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiCursorConstants;
import com.xiaomi.fitness.main.export.MainHelper;
import com.xiaomi.fitness.mine.export.IWebSync;
import com.xiaomi.fitness.net.extensions.ScopeExtKt;
import com.xiaomi.fitness.sport_export.ISportAccessApi;
import com.xiaomi.fitness.sport_export.SportAccessExportExtKt;
import com.xiaomi.fitness.trail.export.SportRecordApiKt;
import com.xiaomi.fitness.training_plan.ability_plan.AbilityPlanDetailActivity;
import com.xiaomi.fitness.training_plan.ability_plan.AbilityPlanQuestionActivity;
import com.xiaomi.fitness.training_plan.ability_plan.AbilityPlanRunningCourseDetailActivity;
import com.xiaomi.fitness.training_plan.common.PlanHistoryListActivity;
import com.xiaomi.fitness.training_plan.common.TrainingTypeListActivity;
import com.xiaomi.fitness.training_plan.habit_plan.HabitCreateEntranceDialog;
import com.xiaomi.fitness.training_plan.habit_plan.HabitPlanGuideActivity;
import com.xiaomi.fitness.training_plan.habit_plan.HabitPlanHomeActivity;
import com.xiaomi.fitness.training_plan.habit_plan.HabitPlanSuggestActivity;
import com.xiaomi.fitness.training_plan.manager.TrainingManager;
import com.xiaomi.fitness.training_plan.net.TrainingPlanRequest;
import com.xiaomi.fitness.training_plan.report.TrainPlanReportFragment;
import com.xiaomi.fitness.training_plan.settings.AbilityPlanSettingFragment;
import com.xiaomi.fitness.training_plan.settings.CalendarHelper;
import com.xiaomi.fitness.training_plan.settings.HabitPlanSettingFragment;
import com.xiaomi.fitness.training_plan.util.TrainPlanDeviceUtils;
import com.xiaomi.fitness.training_plan.util.TrainingPlanPreference;
import com.xiaomi.fitness.training_plan.util.TrainingSportUtils;
import com.xiaomi.fitness.training_plan.widget.HabitLaunchSportDialog;
import com.xiaomi.fitness.training_plan_export.manager.ITrainingManager;
import com.xiaomi.fitness.training_plan_export.manager.TrainingManagerExtKt;
import com.xiaomi.fitness.training_plan_export.model.AbilityDayPlanCourse;
import com.xiaomi.fitness.training_plan_export.model.AbilityPlan;
import com.xiaomi.fitness.training_plan_export.model.AbilityPlanCourseContent;
import com.xiaomi.fitness.training_plan_export.model.AbilityPlanRunningCourse;
import com.xiaomi.fitness.training_plan_export.model.AbilityPlanRunningCourseContent;
import com.xiaomi.fitness.training_plan_export.model.AbilityPlanRunningCourseItem;
import com.xiaomi.fitness.training_plan_export.model.AbilityPlanVideoCourse;
import com.xiaomi.fitness.training_plan_export.model.CurrentWeekAbilityPlan;
import com.xiaomi.fitness.training_plan_export.model.CurrentWeekHabitPlan;
import com.xiaomi.fitness.training_plan_export.model.DeviceTrainingInfoParseResult;
import com.xiaomi.fitness.training_plan_export.model.ForceStopCheckResult;
import com.xiaomi.fitness.training_plan_export.model.GetEntranceInfoResult;
import com.xiaomi.fitness.training_plan_export.model.HabitDayPlan;
import com.xiaomi.fitness.training_plan_export.model.HabitPlan;
import com.xiaomi.fitness.training_plan_export.model.RunningPaceRange;
import com.xiaomi.fitness.training_plan_export.model.SportKey;
import com.xiaomi.fitness.training_plan_export.utils.DialogUtils;
import com.xiaomi.fitness.training_plan_export.utils.TrainingPopMedalUtils;
import com.xiaomi.fitness.watch.face.edit.entity.DialWidgetType;
import defpackage.k1j;
import defpackage.qu9;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000Ø\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u009d\u00012\u00020\u0001:\u0002\u009d\u0001B\n\b\u0007¢\u0006\u0005\b\u009c\u0001\u0010\u0013J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J-\u0010\f\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0014\u0010\u0013J0\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u0015H\u0096@¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010#\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u00152\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\nH\u0016¢\u0006\u0004\b%\u0010\u0013J)\u0010)\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020!2\b\u0010(\u001a\u0004\u0018\u00010'H\u0016¢\u0006\u0004\b)\u0010*J)\u0010-\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020!2\b\u0010,\u001a\u0004\u0018\u00010+H\u0016¢\u0006\u0004\b-\u0010.J\u0019\u00102\u001a\u0004\u0018\u0001012\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b2\u00103J\u0019\u00106\u001a\u00020\n2\b\u00105\u001a\u0004\u0018\u000104H\u0016¢\u0006\u0004\b6\u00107J)\u0010:\u001a\u00020\n2\u0006\u00108\u001a\u00020\u00152\u0006\u00109\u001a\u00020\u00172\b\u00105\u001a\u0004\u0018\u000104H\u0016¢\u0006\u0004\b:\u0010;J\u0017\u0010<\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b<\u0010\u0011J\u000f\u0010=\u001a\u00020\nH\u0016¢\u0006\u0004\b=\u0010\u0013J\u0017\u0010>\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b>\u0010\u0011J\u0012\u0010@\u001a\u0004\u0018\u00010?H\u0096@¢\u0006\u0004\b@\u0010AJ\u001a\u0010C\u001a\u0004\u0018\u00010\u00072\u0006\u0010B\u001a\u00020\u0017H\u0096@¢\u0006\u0004\bC\u0010DJ/\u0010I\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010E\u001a\u00020\u00152\u0006\u0010G\u001a\u00020F2\u0006\u0010H\u001a\u00020\u0007H\u0016¢\u0006\u0004\bI\u0010JJ\u0017\u0010K\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0005H\u0016¢\u0006\u0004\bK\u0010LJ\u0017\u0010M\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0005H\u0016¢\u0006\u0004\bM\u0010LJ\u0017\u0010N\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0005H\u0016¢\u0006\u0004\bN\u0010LJ/\u0010Q\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020!2\u0006\u0010O\u001a\u00020!2\u0006\u0010P\u001a\u00020!H\u0016¢\u0006\u0004\bQ\u0010RJ\u0012\u0010T\u001a\u0004\u0018\u00010SH\u0096@¢\u0006\u0004\bT\u0010AJ'\u0010X\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010V\u001a\u00020U2\u0006\u0010W\u001a\u00020\u0015H\u0016¢\u0006\u0004\bX\u0010YJ\u0017\u0010Z\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0005H\u0016¢\u0006\u0004\bZ\u0010LJ'\u0010\\\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u000e\u0010[\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u0016¢\u0006\u0004\b\\\u0010]J'\u0010^\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u000e\u0010[\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u0016¢\u0006\u0004\b^\u0010]J'\u0010a\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010`\u001a\u00020_2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\ba\u0010bJ'\u0010d\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010c\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\bd\u0010eJ\"\u0010i\u001a\u0004\u0018\u00010h2\u0006\u0010\"\u001a\u00020!2\u0006\u0010g\u001a\u00020fH\u0096@¢\u0006\u0004\bi\u0010jJ/\u0010l\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u001d2\u0006\u0010k\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020!2\u0006\u0010g\u001a\u00020fH\u0016¢\u0006\u0004\bl\u0010mJ\u001f\u0010n\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\bn\u0010oJ\u001f\u0010p\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\bp\u0010oJ\u000f\u0010q\u001a\u00020!H\u0016¢\u0006\u0004\bq\u0010rJ\u000f\u0010s\u001a\u00020\nH\u0016¢\u0006\u0004\bs\u0010\u0013J!\u0010v\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010u\u001a\u0004\u0018\u00010tH\u0016¢\u0006\u0004\bv\u0010wJ\u0017\u0010y\u001a\u00020\u00172\u0006\u0010x\u001a\u00020\u0015H\u0016¢\u0006\u0004\by\u0010zJ\u0017\u0010{\u001a\u00020\u00072\u0006\u0010O\u001a\u00020!H\u0016¢\u0006\u0004\b{\u0010|R&\u0010~\u001a\u00020}8\u0006@\u0006X\u0087.¢\u0006\u0016\n\u0004\b~\u0010\u007f\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001\"\u0006\b\u0082\u0001\u0010\u0083\u0001R*\u0010\u0085\u0001\u001a\u00030\u0084\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u0085\u0001\u0010\u0086\u0001\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001\"\u0006\b\u0089\u0001\u0010\u008a\u0001R!\u0010\u0090\u0001\u001a\u00030\u008b\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u008c\u0001\u0010\u008d\u0001\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001R!\u0010\u0095\u0001\u001a\u00030\u0091\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0092\u0001\u0010\u008d\u0001\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001R\u0018\u0010\u0096\u0001\u001a\u00030\u008b\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0096\u0001\u0010\u0097\u0001R\u0018\u0010\u009b\u0001\u001a\u00030\u0098\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001¨\u0006\u009e\u0001"}, d2 = {"Lcom/xiaomi/fitness/training_plan/manager/TrainingManager;", "Lcom/xiaomi/fitness/training_plan_export/manager/ITrainingManager;", "Lcom/xiaomi/fitness/training_plan_export/model/AbilityDayPlanCourse;", "mockCourseData", "()Lcom/xiaomi/fitness/training_plan_export/model/AbilityDayPlanCourse;", "Landroidx/fragment/app/FragmentActivity;", LifecycleConstantKt.TYPE_ACTIVITY, "", "fromRnPlan", "Lkotlin/Function0;", "", "acceptedAction", "checkAndHintCloudSync", "(Landroidx/fragment/app/FragmentActivity;ZLkotlin/jvm/functions/Function0;)V", "Landroid/content/Context;", "context", "launchAbilityPlanQuestionPage", "(Landroid/content/Context;)V", "syncSportReport", "()V", "getTodayUnFinishedTrainingCourse", "", "gender", "", "birthday", "height", "weight", "confirmUserInfo", "(ILjava/lang/String;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/app/Activity;", "launchPlanHistory", "(Landroid/app/Activity;)V", "planType", "", "planId", "launchPlanReport", "(Landroid/content/Context;IJ)V", "syncTrainingPlanWithDeviceIfNeeded", "planID", "Lcom/xiaomi/fitness/training_plan_export/model/AbilityPlan;", "abilityPlan", "gotoAbilityPlanSettingPage", "(Landroid/content/Context;JLcom/xiaomi/fitness/training_plan_export/model/AbilityPlan;)V", "Lcom/xiaomi/fitness/training_plan_export/model/HabitPlan;", "habitPlan", "gotoHabitPlanSettingPage", "(Landroid/content/Context;JLcom/xiaomi/fitness/training_plan_export/model/HabitPlan;)V", "Lqu9;", "training", "Lcom/xiaomi/fitness/training_plan_export/model/DeviceTrainingInfoParseResult;", "unpackTrainingPacket", "(Lqu9;)Lcom/xiaomi/fitness/training_plan_export/model/DeviceTrainingInfoParseResult;", "Lcom/xiaomi/fitness/training_plan_export/manager/ITrainingManager$ISyncCallback;", "callback", "stopTrainingPlan", "(Lcom/xiaomi/fitness/training_plan_export/manager/ITrainingManager$ISyncCallback;)V", "trainingType", "trainingPlan", "syncLocalTrainingPlan2Device", "(ILjava/lang/String;Lcom/xiaomi/fitness/training_plan_export/manager/ITrainingManager$ISyncCallback;)V", "startCreateHabitPlanActivity", "getTodayTrainingInfo", "launchTrainingTypeListActivity", "Lcom/xiaomi/fitness/training_plan_export/model/ForceStopCheckResult;", "checkForceStop", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data", "closeForceStopBubble", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "runningType", "", "runningDistance", "paceFaster", "launchHabitSuggestActivity", "(Landroidx/fragment/app/FragmentActivity;IFZ)V", "testAbilityRunningCourse", "(Landroidx/fragment/app/FragmentActivity;)V", "testAbilityVideoCourse", "testHabitRunningCourse", "courseId", DialWidgetType.DATE, "launchAbilityRunningCourseDetailActivity", "(Landroid/content/Context;JJJ)V", "Lcom/xiaomi/fitness/training_plan_export/model/GetEntranceInfoResult;", "getPlanEntranceInfo", "Lcom/xiaomi/fitness/training_plan_export/model/AbilityPlanVideoCourse;", "videoCourse", "from", "launchVideoCourseInfoActivity", "(Landroid/content/Context;Lcom/xiaomi/fitness/training_plan_export/model/AbilityPlanVideoCourse;I)V", "testHabitSuggestActivity", "dismissCallBack", "showFinishedPop", "(Landroidx/fragment/app/FragmentActivity;Lkotlin/jvm/functions/Function0;)V", "showHabitFirstPop", "Lcom/xiaomi/fitness/training_plan_export/model/HabitDayPlan;", "plan", "showHabitPlanSportDialog", "(Landroidx/fragment/app/FragmentActivity;Lcom/xiaomi/fitness/training_plan_export/model/HabitDayPlan;Z)V", "hasHabitHistory", "showHabitCreatePlanDialog", "(Landroidx/fragment/app/FragmentActivity;ZZ)V", "Lcom/xiaomi/fitness/training_plan_export/model/SportKey;", "sportKey", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "getTheSportReport", "(JLcom/xiaomi/fitness/training_plan_export/model/SportKey;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "type", "gotoSportReport", "(Landroid/app/Activity;IJLcom/xiaomi/fitness/training_plan_export/model/SportKey;)V", "gotoAbilityDetailActivity", "(Landroid/app/Activity;J)V", "gotoHabitHomeActivity", "getInitHabitPlanId", "()J", "clearTrainingPlanSettings", "Lcom/xiaomi/fitness/mine/export/IWebSync;", "iWebSync", "showCloudSyncDialog", "(Landroidx/fragment/app/FragmentActivity;Lcom/xiaomi/fitness/mine/export/IWebSync;)V", "pace", "buildPaceStr", "(I)Ljava/lang/String;", "isCourseIdInAbilityRange", "(J)Z", "Lcom/xiaomi/fit/fitness/export/api/FitnessDataGetter;", "dataGetter", "Lcom/xiaomi/fit/fitness/export/api/FitnessDataGetter;", "getDataGetter", "()Lcom/xiaomi/fit/fitness/export/api/FitnessDataGetter;", "setDataGetter", "(Lcom/xiaomi/fit/fitness/export/api/FitnessDataGetter;)V", "Lcom/xiaomi/fitness/main/export/MainHelper;", "mainHelper", "Lcom/xiaomi/fitness/main/export/MainHelper;", "getMainHelper", "()Lcom/xiaomi/fitness/main/export/MainHelper;", "setMainHelper", "(Lcom/xiaomi/fitness/main/export/MainHelper;)V", "Lcom/xiaomi/fitness/training_plan/net/TrainingPlanRequest;", "trainingPlanRequest$delegate", "Lkotlin/Lazy;", "getTrainingPlanRequest", "()Lcom/xiaomi/fitness/training_plan/net/TrainingPlanRequest;", "trainingPlanRequest", "Lcom/google/gson/Gson;", "gson$delegate", "getGson", "()Lcom/google/gson/Gson;", "gson", "trainingRequest", "Lcom/xiaomi/fitness/training_plan/net/TrainingPlanRequest;", "Lcom/xiaomi/fit/fitness/export/api/FitnessServerSyncer;", "getServerSyncer", "()Lcom/xiaomi/fit/fitness/export/api/FitnessServerSyncer;", "serverSyncer", "<init>", "Companion", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class TrainingManager implements ITrainingManager {
    private static final int MAX_ABILITY_RUNNING_COURSE_ID = 200000;
    private static final int MIN_ABILITY_RUNNING_COURSE_ID = 100000;

    @NotNull
    private static final String TAG = "TrainingManager";
    public FitnessDataGetter dataGetter;

    /* JADX INFO: renamed from: gson$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy gson;
    public MainHelper mainHelper;

    /* JADX INFO: renamed from: trainingPlanRequest$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy trainingPlanRequest = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: dup
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TrainingManager.trainingPlanRequest_delegate$lambda$0();
        }
    });

    @NotNull
    private final TrainingPlanRequest trainingRequest;

    /* JADX INFO: renamed from: com.xiaomi.fitness.training_plan.manager.TrainingManager$clearTrainingPlanSettings$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.training_plan.manager.TrainingManager$clearTrainingPlanSettings$1", f = "TrainingManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C32501 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C32501(Continuation<? super C32501> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C32501(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            TrainingPlanPreference.INSTANCE.setSAVE_PLAN_TO_CALENDAR(false);
            CalendarHelper.INSTANCE.deleteCalendarEvent(ApplicationExtKt.getApplication());
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C32501) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.training_plan.manager.TrainingManager$getTheSportReport$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.training_plan.manager.TrainingManager", f = "TrainingManager.kt", i = {}, l = {456}, m = "getTheSportReport", n = {}, s = {})
    public static final class C32511 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C32511(Continuation<? super C32511> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TrainingManager.this.getTheSportReport(0L, null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.training_plan.manager.TrainingManager$gotoSportReport$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.training_plan.manager.TrainingManager$gotoSportReport$1", f = "TrainingManager.kt", i = {}, l = {472}, m = "invokeSuspend", n = {}, s = {})
    public static final class C32521 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ long $planId;
        final /* synthetic */ SportKey $sportKey;
        final /* synthetic */ int $type;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.training_plan.manager.TrainingManager$gotoSportReport$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.training_plan.manager.TrainingManager$gotoSportReport$1$1", f = "TrainingManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C07991 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Activity $activity;
            final /* synthetic */ long $planId;
            final /* synthetic */ SportBasicReport $report;
            final /* synthetic */ int $type;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C07991(Activity activity, SportBasicReport sportBasicReport, int i, long j, Continuation<? super C07991> continuation) {
                super(2, continuation);
                this.$activity = activity;
                this.$report = sportBasicReport;
                this.$type = i;
                this.$planId = j;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C07991(this.$activity, this.$report, this.$type, this.$planId, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Activity activity = this.$activity;
                if (activity instanceof BaseActivity) {
                    ((BaseActivity) activity).hideLoading();
                }
                if (this.$report != null) {
                    SportRecordApiKt.getSportRecordApi().goSportDetail(this.$activity, this.$report);
                } else {
                    Logger.e(TrainingManager.TAG, "course finished, but can not get report!! type=" + this.$type + " planId=" + this.$planId);
                }
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C07991) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C32521(long j, SportKey sportKey, Activity activity, int i, Continuation<? super C32521> continuation) {
            super(2, continuation);
            this.$planId = j;
            this.$sportKey = sportKey;
            this.$activity = activity;
            this.$type = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return TrainingManager.this.new C32521(this.$planId, this.$sportKey, this.$activity, this.$type, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                TrainingManager trainingManager = TrainingManager.this;
                long j = this.$planId;
                SportKey sportKey = this.$sportKey;
                this.label = 1;
                obj = trainingManager.getTheSportReport(j, sportKey, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            AnyExtKt.main$default(null, new C07991(this.$activity, (SportBasicReport) obj, this.$type, this.$planId, null), 1, null);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C32521) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public TrainingManager() {
        DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).addDeviceStatusListener(new OnDeviceStatusListener() { // from class: com.xiaomi.fitness.training_plan.manager.TrainingManager.1
            @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
            public void onConnectFailure(String did, int errorCode, int retryTimes) {
            }

            @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
            public void onConnectStart(String did) {
            }

            @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
            public void onConnectSuccess(String did) {
                LogExtKt.logi(TrainingManager.TAG, "onConnectSuccess(" + did + ") syncTrainingPlanWithDeviceIfNeeded ");
                TrainingManager.this.syncTrainingPlanWithDeviceIfNeeded();
            }

            @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
            public void onDisconnect(String did) {
            }
        });
        this.gson = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: eup
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TrainingManager.gson_delegate$lambda$1();
            }
        });
        this.trainingRequest = new TrainingPlanRequest();
    }

    private final void checkAndHintCloudSync(FragmentActivity activity, boolean fromRnPlan, final Function0<Unit> acceptedAction) {
        if (!fromRnPlan) {
            acceptedAction.invoke();
        } else if (RegionPreference.INSTANCE.getSyncWeb()) {
            acceptedAction.invoke();
        } else {
            TrainingManagerExtKt.getInstance(ITrainingManager.INSTANCE).showCloudSyncDialog(activity, new IWebSync() { // from class: com.xiaomi.fitness.training_plan.manager.TrainingManager.checkAndHintCloudSync.1
                @Override // com.xiaomi.fitness.mine.export.IWebSync
                public void onPrivacyNotAgree() {
                    IWebSync.DefaultImpls.onPrivacyNotAgree(this);
                }

                @Override // com.xiaomi.fitness.mine.export.IWebSync
                public void onWebSyncAccepted() {
                    acceptedAction.invoke();
                }

                @Override // com.xiaomi.fitness.mine.export.IWebSync
                public void onWebSyncDenied() {
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Gson getGson() {
        return (Gson) this.gson.getValue();
    }

    private final FitnessServerSyncer getServerSyncer() {
        return FitnessDataExtKt.getInstance(FitnessServerSyncer.INSTANCE);
    }

    private final TrainingPlanRequest getTrainingPlanRequest() {
        return (TrainingPlanRequest) this.trainingPlanRequest.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Gson gson_delegate$lambda$1() {
        return new Gson();
    }

    private final AbilityDayPlanCourse mockCourseData() {
        return new AbilityDayPlanCourse("0710EM 强度", 1234567899888L, 1, 2, 1, new AbilityPlanCourseContent(null, new AbilityPlanRunningCourse(2, "跑", CollectionsKt__CollectionsKt.listOf((Object[]) new AbilityPlanRunningCourseContent[]{new AbilityPlanRunningCourseContent(false, 0, CollectionsKt__CollectionsJVMKt.listOf(new AbilityPlanRunningCourseItem(1, 1, new RunningPaceRange(270, 340)))), new AbilityPlanRunningCourseContent(false, 0, CollectionsKt__CollectionsJVMKt.listOf(new AbilityPlanRunningCourseItem(2, 1, new RunningPaceRange(270, 340))))}), 0L, 0L, 24, null)), null, 2345123L, null, 1, 0L, null, 0, 7488, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showCloudSyncDialog$lambda$11$lambda$10(TrainingManager this$0, FragmentActivity activity, final IWebSync iWebSync, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(activity, "$activity");
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        this$0.getMainHelper().showSportHealthCloudSynDialogIfNeed(activity, new IWebSync() { // from class: com.xiaomi.fitness.training_plan.manager.TrainingManager$showCloudSyncDialog$1$1$1
            @Override // com.xiaomi.fitness.mine.export.IWebSync
            public void onPrivacyNotAgree() {
                IWebSync.DefaultImpls.onPrivacyNotAgree(this);
            }

            @Override // com.xiaomi.fitness.mine.export.IWebSync
            public void onWebSyncAccepted() {
                IWebSync iWebSync2 = iWebSync;
                if (iWebSync2 != null) {
                    iWebSync2.onWebSyncAccepted();
                }
            }

            @Override // com.xiaomi.fitness.mine.export.IWebSync
            public void onWebSyncDenied() {
                IWebSync iWebSync2 = iWebSync;
                if (iWebSync2 != null) {
                    iWebSync2.onWebSyncDenied();
                }
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showHabitPlanSportDialog$lambda$5(TrainingManager this$0, final FragmentActivity activity, boolean z, final HabitDayPlan plan) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(activity, "$activity");
        Intrinsics.checkNotNullParameter(plan, "$plan");
        this$0.checkAndHintCloudSync(activity, z, new Function0() { // from class: aup
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TrainingManager.showHabitPlanSportDialog$lambda$5$lambda$4(activity, plan);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showHabitPlanSportDialog$lambda$5$lambda$4(FragmentActivity activity, HabitDayPlan plan) {
        Intrinsics.checkNotNullParameter(activity, "$activity");
        Intrinsics.checkNotNullParameter(plan, "$plan");
        TrainingSportUtils.INSTANCE.startHabitTrainingSport(activity, 1, plan);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showHabitPlanSportDialog$lambda$7(TrainingManager this$0, final FragmentActivity activity, boolean z, final HabitDayPlan plan) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(activity, "$activity");
        Intrinsics.checkNotNullParameter(plan, "$plan");
        this$0.checkAndHintCloudSync(activity, z, new Function0() { // from class: iup
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TrainingManager.showHabitPlanSportDialog$lambda$7$lambda$6(activity, plan);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showHabitPlanSportDialog$lambda$7$lambda$6(FragmentActivity activity, HabitDayPlan plan) {
        Intrinsics.checkNotNullParameter(activity, "$activity");
        Intrinsics.checkNotNullParameter(plan, "$plan");
        TrainingSportUtils.INSTANCE.startHabitTrainingSport(activity, 2, plan);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showHabitPlanSportDialog$lambda$9(TrainingManager this$0, final FragmentActivity activity, boolean z, final HabitDayPlan plan) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(activity, "$activity");
        Intrinsics.checkNotNullParameter(plan, "$plan");
        this$0.checkAndHintCloudSync(activity, z, new Function0() { // from class: cup
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TrainingManager.showHabitPlanSportDialog$lambda$9$lambda$8(activity, plan);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showHabitPlanSportDialog$lambda$9$lambda$8(FragmentActivity activity, HabitDayPlan plan) {
        Intrinsics.checkNotNullParameter(activity, "$activity");
        Intrinsics.checkNotNullParameter(plan, "$plan");
        TrainingSportUtils.INSTANCE.startHabitTrainingSport(activity, 3, plan);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TrainingPlanRequest trainingPlanRequest_delegate$lambda$0() {
        return new TrainingPlanRequest();
    }

    @Override // com.xiaomi.fitness.training_plan_export.manager.ITrainingManager
    @NotNull
    public String buildPaceStr(int pace) {
        int i = pace / 60;
        int i2 = pace - (i * 60);
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append("'");
        if (i2 > 0) {
            if (i2 < 10) {
                sb.append(0);
            }
            sb.append(i2);
        } else {
            sb.append("00");
        }
        sb.append("\"");
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @Override // com.xiaomi.fitness.training_plan_export.manager.ITrainingManager
    @Nullable
    public Object checkForceStop(@NotNull Continuation<? super ForceStopCheckResult> continuation) {
        return this.trainingRequest.checkForceStop(continuation);
    }

    @Override // com.xiaomi.fitness.training_plan_export.manager.ITrainingManager
    public void clearTrainingPlanSettings() {
        ScopeExtKt.scope(Dispatchers.getIO(), new C32501(null));
    }

    @Override // com.xiaomi.fitness.training_plan_export.manager.ITrainingManager
    @Nullable
    public Object closeForceStopBubble(@NotNull String str, @NotNull Continuation<? super Boolean> continuation) {
        return this.trainingRequest.closeForceCloseBubble(str, continuation);
    }

    @Override // com.xiaomi.fitness.training_plan_export.manager.ITrainingManager
    @Nullable
    public Object confirmUserInfo(int i, @NotNull String str, int i2, int i3, @NotNull Continuation<? super Boolean> continuation) throws JSONException {
        TrainingPlanRequest trainingPlanRequest = this.trainingRequest;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("gender", i);
        jSONObject.put("birthday", str);
        jSONObject.put("height", i2);
        jSONObject.put("weight", i3);
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return trainingPlanRequest.confirmUserInfo(string, continuation);
    }

    @NotNull
    public final FitnessDataGetter getDataGetter() {
        FitnessDataGetter fitnessDataGetter = this.dataGetter;
        if (fitnessDataGetter != null) {
            return fitnessDataGetter;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dataGetter");
        return null;
    }

    @Override // com.xiaomi.fitness.training_plan_export.manager.ITrainingManager
    public long getInitHabitPlanId() {
        return 10001L;
    }

    @NotNull
    public final MainHelper getMainHelper() {
        MainHelper mainHelper = this.mainHelper;
        if (mainHelper != null) {
            return mainHelper;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mainHelper");
        return null;
    }

    @Override // com.xiaomi.fitness.training_plan_export.manager.ITrainingManager
    @Nullable
    public Object getPlanEntranceInfo(@NotNull Continuation<? super GetEntranceInfoResult> continuation) {
        return getTrainingPlanRequest().getEntrancePlanInfo(continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.xiaomi.fitness.training_plan_export.manager.ITrainingManager
    @Nullable
    public Object getTheSportReport(long j, @NotNull SportKey sportKey, @NotNull Continuation<? super SportBasicReport> continuation) {
        C32511 c32511;
        if (continuation instanceof C32511) {
            c32511 = (C32511) continuation;
            int i = c32511.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c32511.label = i - Integer.MIN_VALUE;
            } else {
                c32511 = new C32511(continuation);
            }
        } else {
            c32511 = new C32511(continuation);
        }
        Object theReport = c32511.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c32511.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(theReport);
            SportBasicReport theSportReport = getDataGetter().getTheSportReport(sportKey.getSid(), sportKey.getKey(), sportKey.getTime());
            if (theSportReport != null) {
                return theSportReport;
            }
            TrainingPlanRequest trainingPlanRequest = getTrainingPlanRequest();
            c32511.label = 1;
            theReport = trainingPlanRequest.getTheReport(j, sportKey, c32511);
            if (theReport == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(theReport);
        }
        return (SportBasicReport) theReport;
    }

    @Override // com.xiaomi.fitness.training_plan_export.manager.ITrainingManager
    public void getTodayTrainingInfo() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // com.xiaomi.fitness.training_plan_export.manager.ITrainingManager
    public void getTodayUnFinishedTrainingCourse() {
    }

    @Override // com.xiaomi.fitness.training_plan_export.manager.ITrainingManager
    public void gotoAbilityDetailActivity(@NotNull Activity context, long planId) {
        Intrinsics.checkNotNullParameter(context, "context");
        AbilityPlanDetailActivity.INSTANCE.launchWithPlanId(context, planId);
    }

    @Override // com.xiaomi.fitness.training_plan_export.manager.ITrainingManager
    public void gotoAbilityPlanSettingPage(@NotNull Context context, long planID, @Nullable AbilityPlan abilityPlan) {
        Intrinsics.checkNotNullParameter(context, "context");
        AbilityPlanSettingFragment.INSTANCE.launch(context, planID, abilityPlan);
    }

    @Override // com.xiaomi.fitness.training_plan_export.manager.ITrainingManager
    public void gotoHabitHomeActivity(@NotNull Activity context, long planId) {
        Intrinsics.checkNotNullParameter(context, "context");
        HabitPlanHomeActivity.INSTANCE.launchHabitHomeActivity(context, planId);
    }

    @Override // com.xiaomi.fitness.training_plan_export.manager.ITrainingManager
    public void gotoHabitPlanSettingPage(@NotNull Context context, long planID, @Nullable HabitPlan habitPlan) {
        Intrinsics.checkNotNullParameter(context, "context");
        HabitPlanSettingFragment.INSTANCE.launch(context, planID, habitPlan);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.training_plan_export.manager.ITrainingManager
    public void gotoSportReport(@NotNull Activity activity, int type, long planId, @NotNull SportKey sportKey) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(sportKey, "sportKey");
        if (activity instanceof BaseActivity) {
            PageState.DefaultImpls.showLoading$default((PageState) activity, k1j.o1, false, 2, null);
        }
        ScopeExtKt.scopeNet$default(null, new C32521(planId, sportKey, activity, type, null), 1, null);
    }

    @Override // com.xiaomi.fitness.training_plan_export.manager.ITrainingManager
    public boolean isCourseIdInAbilityRange(long courseId) {
        return 100000 <= courseId && courseId < 200001;
    }

    @Override // com.xiaomi.fitness.training_plan_export.manager.ITrainingManager
    public void launchAbilityPlanQuestionPage(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        AbilityPlanQuestionActivity.INSTANCE.launch(context);
    }

    @Override // com.xiaomi.fitness.training_plan_export.manager.ITrainingManager
    public void launchAbilityRunningCourseDetailActivity(@NotNull Context context, long planId, long courseId, long date) {
        Intrinsics.checkNotNullParameter(context, "context");
        Logger.d(TAG, "launchVideoCourseInfoActivity with planId:" + planId);
        AbilityPlanRunningCourseDetailActivity.INSTANCE.launch(context, planId, courseId, date);
    }

    @Override // com.xiaomi.fitness.training_plan_export.manager.ITrainingManager
    public void launchHabitSuggestActivity(@NotNull FragmentActivity context, int runningType, float runningDistance, boolean paceFaster) {
        Intrinsics.checkNotNullParameter(context, "context");
        HabitPlanSuggestActivity.INSTANCE.launchFromCreate(context, runningType, runningDistance, paceFaster);
    }

    @Override // com.xiaomi.fitness.training_plan_export.manager.ITrainingManager
    public void launchPlanHistory(@NotNull Activity context) {
        Intrinsics.checkNotNullParameter(context, "context");
        PlanHistoryListActivity.INSTANCE.launch(context);
    }

    @Override // com.xiaomi.fitness.training_plan_export.manager.ITrainingManager
    public void launchPlanReport(@NotNull Context context, int planType, long planId) {
        Intrinsics.checkNotNullParameter(context, "context");
        TrainPlanReportFragment.INSTANCE.launch(context, planType, planId);
    }

    @Override // com.xiaomi.fitness.training_plan_export.manager.ITrainingManager
    public void launchTrainingTypeListActivity(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        TrainingTypeListActivity.INSTANCE.launch(context);
    }

    @Override // com.xiaomi.fitness.training_plan_export.manager.ITrainingManager
    public void launchVideoCourseInfoActivity(@NotNull Context context, @NotNull AbilityPlanVideoCourse videoCourse, int from) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(videoCourse, "videoCourse");
        Logger.d(TAG, "launchVideoCourseInfoActivity with planId:" + videoCourse.getPlanId() + ",from:" + from);
        TrainingSportUtils.INSTANCE.launchVideoCourseInfoActivity(context, videoCourse, from);
    }

    public final void setDataGetter(@NotNull FitnessDataGetter fitnessDataGetter) {
        Intrinsics.checkNotNullParameter(fitnessDataGetter, "<set-?>");
        this.dataGetter = fitnessDataGetter;
    }

    public final void setMainHelper(@NotNull MainHelper mainHelper) {
        Intrinsics.checkNotNullParameter(mainHelper, "<set-?>");
        this.mainHelper = mainHelper;
    }

    @Override // com.xiaomi.fitness.training_plan_export.manager.ITrainingManager
    public void showCloudSyncDialog(@NotNull final FragmentActivity activity, @Nullable final IWebSync iWebSync) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        DialogUtils dialogUtils = DialogUtils.INSTANCE;
        DialogUtils.DialogBuilder dialogBuilder = new DialogUtils.DialogBuilder();
        dialogBuilder.setTitleRes(Integer.valueOf(k1j.x0));
        dialogBuilder.setMessage(ResourceExtKt.getString(k1j.w0));
        dialogBuilder.setPositiveRes(Integer.valueOf(k1j.y0));
        dialogBuilder.setPositiveClickListener(new Function1() { // from class: bup
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TrainingManager.showCloudSyncDialog$lambda$11$lambda$10(this.f4624a, activity, iWebSync, (DialogInterface) obj);
            }
        });
        Unit unit = Unit.INSTANCE;
        dialogUtils.showTipDialog(activity, dialogBuilder);
    }

    @Override // com.xiaomi.fitness.training_plan_export.manager.ITrainingManager
    public void showFinishedPop(@NotNull FragmentActivity activity, @Nullable Function0<Unit> dismissCallBack) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        TrainingPopMedalUtils.INSTANCE.showTrainingFinishedPop(activity, dismissCallBack);
    }

    @Override // com.xiaomi.fitness.training_plan_export.manager.ITrainingManager
    public void showHabitCreatePlanDialog(@NotNull FragmentActivity activity, boolean hasHabitHistory, boolean fromRnPlan) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        HabitCreateEntranceDialog habitCreateEntranceDialog = new HabitCreateEntranceDialog(hasHabitHistory, fromRnPlan);
        FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        habitCreateEntranceDialog.show(supportFragmentManager);
    }

    @Override // com.xiaomi.fitness.training_plan_export.manager.ITrainingManager
    public void showHabitFirstPop(@NotNull FragmentActivity activity, @Nullable Function0<Unit> dismissCallBack) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        TrainingPopMedalUtils.INSTANCE.showHabitFirstTrainingPop(activity, dismissCallBack);
    }

    @Override // com.xiaomi.fitness.training_plan_export.manager.ITrainingManager
    public void showHabitPlanSportDialog(@NotNull final FragmentActivity activity, @NotNull final HabitDayPlan plan, final boolean fromRnPlan) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(plan, "plan");
        HabitLaunchSportDialog.INSTANCE.defaultBuilder("today_train_to_sport").create().setOutdoorRunClickListener(new Function0() { // from class: fup
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TrainingManager.showHabitPlanSportDialog$lambda$5(this.f18263a, activity, fromRnPlan, plan);
            }
        }).setWalkClickListener(new Function0() { // from class: gup
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TrainingManager.showHabitPlanSportDialog$lambda$7(this.f19351a, activity, fromRnPlan, plan);
            }
        }).setIndoorRunClickListener(new Function0() { // from class: hup
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TrainingManager.showHabitPlanSportDialog$lambda$9(this.f20483a, activity, fromRnPlan, plan);
            }
        }).showIfNeed(activity.getSupportFragmentManager());
    }

    @Override // com.xiaomi.fitness.training_plan_export.manager.ITrainingManager
    public void startCreateHabitPlanActivity(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intent intent = new Intent(context, (Class<?>) HabitPlanGuideActivity.class);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        context.startActivity(intent);
    }

    @Override // com.xiaomi.fitness.training_plan_export.manager.ITrainingManager
    public void stopTrainingPlan(@Nullable ITrainingManager.ISyncCallback callback) {
        TrainPlanDeviceUtils.stopTrainingPlan$default(TrainPlanDeviceUtils.INSTANCE, null, 1, null);
    }

    @Override // com.xiaomi.fitness.training_plan_export.manager.ITrainingManager
    public void syncLocalTrainingPlan2Device(int trainingType, @NotNull String trainingPlan, @Nullable ITrainingManager.ISyncCallback callback) {
        Intrinsics.checkNotNullParameter(trainingPlan, "trainingPlan");
        if (trainingType == 1) {
            TrainPlanDeviceUtils trainPlanDeviceUtils = TrainPlanDeviceUtils.INSTANCE;
            TrainPlanDeviceUtils.syncTraining2Device$default(trainPlanDeviceUtils, trainPlanDeviceUtils.habitPlanData2Proto((CurrentWeekHabitPlan) new Gson().fromJson(trainingPlan, CurrentWeekHabitPlan.class)), null, 2, null);
        } else {
            if (trainingType != 2) {
                return;
            }
            TrainPlanDeviceUtils trainPlanDeviceUtils2 = TrainPlanDeviceUtils.INSTANCE;
            TrainPlanDeviceUtils.syncTraining2Device$default(trainPlanDeviceUtils2, trainPlanDeviceUtils2.abilityPlanData2Proto((CurrentWeekAbilityPlan) new Gson().fromJson(trainingPlan, CurrentWeekAbilityPlan.class)), null, 2, null);
        }
    }

    @Override // com.xiaomi.fitness.training_plan_export.manager.ITrainingManager
    public void syncSportReport() {
    }

    @Override // com.xiaomi.fitness.training_plan_export.manager.ITrainingManager
    public void syncTrainingPlanWithDeviceIfNeeded() {
        LogExtKt.logi("syncTrainingPlanWithDeviceIfNeeded");
        if (SportAccessExportExtKt.getINSTANCE(ISportAccessApi.INSTANCE).isDeviceSupportTrainingPlan()) {
            getServerSyncer().getCurWeekPlan(new TrainingPlanCallback() { // from class: com.xiaomi.fitness.training_plan.manager.TrainingManager.syncTrainingPlanWithDeviceIfNeeded.1
                @Override // com.xiaomi.fit.fitness.export.api.TrainingPlanCallback
                public void onResult(int type, String result) {
                    try {
                        if (TextUtils.isEmpty(result)) {
                            TrainPlanDeviceUtils.stopTrainingPlan$default(TrainPlanDeviceUtils.INSTANCE, null, 1, null);
                            LogExtKt.logi(TrainingManager.TAG, "local plan has none plan, stop device plan!!");
                        } else {
                            Intrinsics.checkNotNull(result);
                            JSONObject jSONObject = new JSONObject(result);
                            long jOptLong = jSONObject.optLong(DeductConstants.KEY_WX_PLAN_ID, 0L);
                            int iOptInt = jSONObject.optInt("plan_type", 0);
                            String strOptString = jSONObject.optString(MiuiCursorConstants.CONTENT);
                            if (jOptLong != 0) {
                                LogExtKt.logi(TrainingManager.TAG, "try sync local plan(" + jOptLong + " - " + iOptInt + ") to device");
                                if (iOptInt == 1) {
                                    CurrentWeekHabitPlan currentWeekHabitPlan = (CurrentWeekHabitPlan) TrainingManager.this.getGson().fromJson(strOptString, CurrentWeekHabitPlan.class);
                                    TrainPlanDeviceUtils trainPlanDeviceUtils = TrainPlanDeviceUtils.INSTANCE;
                                    TrainPlanDeviceUtils.syncTraining2Device$default(trainPlanDeviceUtils, trainPlanDeviceUtils.habitPlanData2Proto(currentWeekHabitPlan), null, 2, null);
                                } else if (iOptInt != 2) {
                                    LogExtKt.logi(TrainingManager.TAG, "local plan has wrong type");
                                } else {
                                    CurrentWeekAbilityPlan currentWeekAbilityPlan = (CurrentWeekAbilityPlan) TrainingManager.this.getGson().fromJson(strOptString, CurrentWeekAbilityPlan.class);
                                    TrainPlanDeviceUtils trainPlanDeviceUtils2 = TrainPlanDeviceUtils.INSTANCE;
                                    TrainPlanDeviceUtils.syncTraining2Device$default(trainPlanDeviceUtils2, trainPlanDeviceUtils2.abilityPlanData2Proto(currentWeekAbilityPlan), null, 2, null);
                                }
                            } else {
                                LogExtKt.logi(TrainingManager.TAG, "local plan has wrong planId");
                            }
                        }
                    } catch (Exception e) {
                        LogExtKt.loge(TrainingManager.TAG, "syncTrainingPlanWithDeviceIfNeeded exception " + e.getMessage());
                    }
                }
            });
        } else {
            LogExtKt.logi(TAG, "device is not support training plan!!");
        }
    }

    @Override // com.xiaomi.fitness.training_plan_export.manager.ITrainingManager
    public void testAbilityRunningCourse(@NotNull FragmentActivity context) {
        Intrinsics.checkNotNullParameter(context, "context");
        TrainingSportUtils.INSTANCE.startAbilitySport(context, mockCourseData());
    }

    @Override // com.xiaomi.fitness.training_plan_export.manager.ITrainingManager
    public void testAbilityVideoCourse(@NotNull FragmentActivity context) {
        Intrinsics.checkNotNullParameter(context, "context");
        TrainingSportUtils.launchVideoCourseInfoActivity$default(TrainingSportUtils.INSTANCE, context, new AbilityPlanVideoCourse(1644231195L, 1234567L, 2), 0, 4, null);
    }

    @Override // com.xiaomi.fitness.training_plan_export.manager.ITrainingManager
    public void testHabitRunningCourse(@NotNull FragmentActivity context) {
        Intrinsics.checkNotNullParameter(context, "context");
        TrainingSportUtils.INSTANCE.startHabitTrainingSport(context, 3, new HabitDayPlan(258436678585189376L, false, 0.2f, System.currentTimeMillis(), 1, 2, null, false, 192, null));
    }

    @Override // com.xiaomi.fitness.training_plan_export.manager.ITrainingManager
    public void testHabitSuggestActivity(@NotNull FragmentActivity context) {
        Intrinsics.checkNotNullParameter(context, "context");
        HabitPlanSuggestActivity.INSTANCE.launchFromCreate(context, 1, 1.2f, true);
    }

    @Override // com.xiaomi.fitness.training_plan_export.manager.ITrainingManager
    @Nullable
    public DeviceTrainingInfoParseResult unpackTrainingPacket(@NotNull qu9 training) {
        Intrinsics.checkNotNullParameter(training, "training");
        return TrainPlanDeviceUtils.INSTANCE.unpackDeviceTrainingInfo(training);
    }
}
