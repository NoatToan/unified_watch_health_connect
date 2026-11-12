package com.xiaomi.fitness.training_plan.settings;

import android.content.Context;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.training_plan.net.SmartRunningRemindSettingUpdateResult;
import com.xiaomi.fitness.training_plan.net.SmartRunningRemindSettings;
import com.xiaomi.fitness.training_plan.net.TrainingPlanRequest;
import com.xiaomi.fitness.training_plan.util.CalendarUtilsKt;
import com.xiaomi.fitness.training_plan.util.TrainingPlanPreference;
import com.xiaomi.fitness.training_plan_export.model.AbilityDayPlan;
import com.xiaomi.fitness.training_plan_export.model.AbilityDayPlanCourse;
import com.xiaomi.fitness.training_plan_export.model.AbilityPlan;
import defpackage.chi;
import defpackage.k1j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 @2\u00020\u0001:\u0001@B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"J\u000e\u0010#\u001a\u00020 2\u0006\u0010$\u001a\u00020%J\u000e\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u0010J\u0017\u0010)\u001a\u00020\u00102\b\u0010*\u001a\u0004\u0018\u00010%H\u0002¢\u0006\u0002\u0010+J\u0010\u0010,\u001a\u00020\u00102\u0006\u0010-\u001a\u00020.H\u0002J\u0010\u0010/\u001a\u00020\n2\u0006\u0010(\u001a\u00020'H\u0002J\u000e\u00100\u001a\u00020\u00102\u0006\u0010(\u001a\u00020'J\u0010\u00101\u001a\u00020\u00102\u0006\u00102\u001a\u00020.H\u0002J \u00103\u001a\u00020 2\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u00020\u00062\b\b\u0002\u00107\u001a\u00020\nJ\u000e\u00108\u001a\u00020 2\u0006\u00104\u001a\u000205J$\u00109\u001a\u00020 2\u0006\u00104\u001a\u0002052\u0014\u0010:\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020 \u0018\u00010;J\u000e\u0010<\u001a\b\u0012\u0004\u0012\u00020>0=H\u0002J\u000e\u0010?\u001a\u00020 2\u0006\u00104\u001a\u000205R\u0019\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R\u001a\u0010\u0018\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014R\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006A"}, d2 = {"Lcom/xiaomi/fitness/training_plan/settings/AbilityPlanSettingVM;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "<init>", "()V", "mAbilityPlanSettings", "Landroidx/lifecycle/MutableLiveData;", "Lcom/xiaomi/fitness/training_plan/net/SmartRunningRemindSettings;", "getMAbilityPlanSettings", "()Landroidx/lifecycle/MutableLiveData;", "reminderSwitch", "", "getReminderSwitch", "()Z", "setReminderSwitch", "(Z)V", "reminderTime", "", "getReminderTime", "()Ljava/lang/String;", "setReminderTime", "(Ljava/lang/String;)V", "runningDays", "getRunningDays", "setRunningDays", "strengthDays", "getStrengthDays", "setStrengthDays", "thisWeekDayPlans", "Ljava/util/ArrayList;", "Lcom/xiaomi/fitness/training_plan_export/model/AbilityDayPlan;", "dayPlans", "handleDayPlans", "", "abilityPlan", "Lcom/xiaomi/fitness/training_plan_export/model/AbilityPlan;", "getAbilityPlanSettings", "planID", "", "getSelectedDays", "", "days", "getHM", "time", "(Ljava/lang/Long;)Ljava/lang/String;", "getStringHour", "hour", "", "checkIsSuccessive", "getCustomRepeatFormatString", "getStringMinute", "minute", "updateAbilityPlanSettings", "context", "Landroid/content/Context;", "settings", "isDays", "deleteCalendarIfNeed", "delAndAddAbilityToCalendar", "addCallback", "Lkotlin/Function1;", "buildAbilityCalendarEvent", "", "Lcom/xiaomi/fitness/training_plan/settings/CalendarHelper$CalendarReminderEvent;", "showCalendarInfo", "Companion", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAbilityPlanSettingVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbilityPlanSettingVM.kt\ncom/xiaomi/fitness/training_plan/settings/AbilityPlanSettingVM\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,272:1\n1863#2,2:273\n1557#2:275\n1628#2,3:276\n1863#2:279\n1863#2,2:280\n1864#2:282\n*S KotlinDebug\n*F\n+ 1 AbilityPlanSettingVM.kt\ncom/xiaomi/fitness/training_plan/settings/AbilityPlanSettingVM\n*L\n46#1:273,2\n85#1:275\n85#1:276,3\n245#1:279\n249#1:280,2\n245#1:282\n*E\n"})
public final class AbilityPlanSettingVM extends AbsViewModel {
    private static final int ONE_DAY_MILLION = 86400000;

    @NotNull
    public static final String TAG = "AbilityPlanSettingVM";
    private boolean reminderSwitch;

    @NotNull
    private final MutableLiveData<SmartRunningRemindSettings> mAbilityPlanSettings = new MutableLiveData<>();

    @NotNull
    private String reminderTime = "18:00";

    @NotNull
    private String runningDays = "";

    @NotNull
    private String strengthDays = "";

    @NotNull
    private final ArrayList<AbilityDayPlan> thisWeekDayPlans = new ArrayList<>();

    @NotNull
    private final ArrayList<AbilityDayPlan> dayPlans = new ArrayList<>();

    /* JADX INFO: renamed from: com.xiaomi.fitness.training_plan.settings.AbilityPlanSettingVM$delAndAddAbilityToCalendar$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.training_plan.settings.AbilityPlanSettingVM$delAndAddAbilityToCalendar$1", f = "AbilityPlanSettingVM.kt", i = {0}, l = {SportReportBaseParser.ReportType.avgFreq}, m = "invokeSuspend", n = {"result"}, s = {"Z$0"})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<Boolean, Unit> $addCallback;
        final /* synthetic */ Context $context;
        boolean Z$0;
        int label;
        final /* synthetic */ AbilityPlanSettingVM this$0;

        /* JADX INFO: renamed from: com.xiaomi.fitness.training_plan.settings.AbilityPlanSettingVM$delAndAddAbilityToCalendar$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.training_plan.settings.AbilityPlanSettingVM$delAndAddAbilityToCalendar$1$1", f = "AbilityPlanSettingVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C08011 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Function1<Boolean, Unit> $addCallback;
            final /* synthetic */ boolean $result;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C08011(Function1<? super Boolean, Unit> function1, boolean z, Continuation<? super C08011> continuation) {
                super(2, continuation);
                this.$addCallback = function1;
                this.$result = z;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C08011(this.$addCallback, this.$result, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Function1<Boolean, Unit> function1 = this.$addCallback;
                if (function1 == null) {
                    return null;
                }
                function1.invoke2(Boxing.boxBoolean(this.$result));
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C08011) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Context context, AbilityPlanSettingVM abilityPlanSettingVM, Function1<? super Boolean, Unit> function1, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$context = context;
            this.this$0 = abilityPlanSettingVM;
            this.$addCallback = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$context, this.this$0, this.$addCallback, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean z;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CalendarHelper calendarHelper = CalendarHelper.INSTANCE;
                calendarHelper.deleteCalendarEvent(this.$context);
                List<CalendarHelper.CalendarReminderEvent> listBuildAbilityCalendarEvent = this.this$0.buildAbilityCalendarEvent();
                if (!listBuildAbilityCalendarEvent.isEmpty()) {
                    boolean zSaveToCalendar = calendarHelper.saveToCalendar(this.$context, listBuildAbilityCalendarEvent);
                    MainCoroutineDispatcher main = Dispatchers.getMain();
                    C08011 c08011 = new C08011(this.$addCallback, zSaveToCalendar, null);
                    this.Z$0 = zSaveToCalendar;
                    this.label = 1;
                    if (BuildersKt.withContext(main, c08011, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    z = zSaveToCalendar;
                } else {
                    Function1<Boolean, Unit> function1 = this.$addCallback;
                    if (function1 != null) {
                        function1.invoke2(Boxing.boxBoolean(false));
                    }
                    Logger.i(AbilityPlanSettingVM.TAG, "can not add ability to calendar with empty events!!");
                }
                return Unit.INSTANCE;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = this.Z$0;
            ResultKt.throwOnFailure(obj);
            Logger.d(AbilityPlanSettingVM.TAG, "save ability to calendar result:" + z);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.training_plan.settings.AbilityPlanSettingVM$deleteCalendarIfNeed$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.training_plan.settings.AbilityPlanSettingVM$deleteCalendarIfNeed$1", f = "AbilityPlanSettingVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C32821 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $context;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C32821(Context context, Continuation<? super C32821> continuation) {
            super(2, continuation);
            this.$context = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C32821(this.$context, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CalendarHelper.INSTANCE.deleteCalendarEvent(this.$context);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C32821) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.training_plan.settings.AbilityPlanSettingVM$getAbilityPlanSettings$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.training_plan.settings.AbilityPlanSettingVM$getAbilityPlanSettings$1", f = "AbilityPlanSettingVM.kt", i = {}, l = {64}, m = "invokeSuspend", n = {}, s = {})
    public static final class C32831 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $planID;
        int label;
        final /* synthetic */ AbilityPlanSettingVM this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C32831(long j, AbilityPlanSettingVM abilityPlanSettingVM, Continuation<? super C32831> continuation) {
            super(2, continuation);
            this.$planID = j;
            this.this$0 = abilityPlanSettingVM;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C32831(this.$planID, this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String remindTime;
            String runningDays;
            String strengthDays;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                TrainingPlanRequest trainingPlanRequest = new TrainingPlanRequest();
                long j = this.$planID;
                this.label = 1;
                obj = trainingPlanRequest.getPlanSettings(j, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            SmartRunningRemindSettings smartRunningRemindSettings = (SmartRunningRemindSettings) obj;
            Logger.i(AbilityPlanSettingVM.TAG, "getAbilityPlanSettings:" + smartRunningRemindSettings);
            this.this$0.setReminderSwitch(smartRunningRemindSettings != null ? smartRunningRemindSettings.getRemindSwitch() : false);
            AbilityPlanSettingVM abilityPlanSettingVM = this.this$0;
            String remindTime2 = smartRunningRemindSettings != null ? smartRunningRemindSettings.getRemindTime() : null;
            if (remindTime2 == null || remindTime2.length() == 0) {
                remindTime = "18:00";
            } else {
                remindTime = smartRunningRemindSettings != null ? smartRunningRemindSettings.getRemindTime() : null;
                Intrinsics.checkNotNull(remindTime);
            }
            abilityPlanSettingVM.setReminderTime(remindTime);
            AbilityPlanSettingVM abilityPlanSettingVM2 = this.this$0;
            String str = "";
            if (smartRunningRemindSettings == null || (runningDays = smartRunningRemindSettings.getRunningDays()) == null) {
                runningDays = "";
            }
            abilityPlanSettingVM2.setRunningDays(runningDays);
            AbilityPlanSettingVM abilityPlanSettingVM3 = this.this$0;
            if (smartRunningRemindSettings != null && (strengthDays = smartRunningRemindSettings.getStrengthDays()) != null) {
                str = strengthDays;
            }
            abilityPlanSettingVM3.setStrengthDays(str);
            this.this$0.getMAbilityPlanSettings().postValue(new SmartRunningRemindSettings(this.this$0.getReminderSwitch(), this.this$0.getReminderTime(), this.this$0.getRunningDays(), this.this$0.getStrengthDays()));
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C32831) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.training_plan.settings.AbilityPlanSettingVM$showCalendarInfo$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.training_plan.settings.AbilityPlanSettingVM$showCalendarInfo$1", f = "AbilityPlanSettingVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C32841 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $context;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C32841(Context context, Continuation<? super C32841> continuation) {
            super(2, continuation);
            this.$context = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C32841(this.$context, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CalendarHelper.INSTANCE.testCalendar(this.$context);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C32841) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.training_plan.settings.AbilityPlanSettingVM$updateAbilityPlanSettings$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.training_plan.settings.AbilityPlanSettingVM$updateAbilityPlanSettings$1", f = "AbilityPlanSettingVM.kt", i = {}, l = {171}, m = "invokeSuspend", n = {}, s = {})
    public static final class C32851 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ boolean $isDays;
        final /* synthetic */ SmartRunningRemindSettings $settings;
        int label;
        final /* synthetic */ AbilityPlanSettingVM this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C32851(SmartRunningRemindSettings smartRunningRemindSettings, AbilityPlanSettingVM abilityPlanSettingVM, boolean z, Context context, Continuation<? super C32851> continuation) {
            super(2, continuation);
            this.$settings = smartRunningRemindSettings;
            this.this$0 = abilityPlanSettingVM;
            this.$isDays = z;
            this.$context = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(boolean z) {
            Logger.i(AbilityPlanSettingVM.TAG, "updateAbilityPlanSettings add to calendar result:" + z);
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C32851(this.$settings, this.this$0, this.$isDays, this.$context, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                TrainingPlanRequest trainingPlanRequest = new TrainingPlanRequest();
                SmartRunningRemindSettings smartRunningRemindSettings = this.$settings;
                this.label = 1;
                obj = trainingPlanRequest.updateAbilityPlanSettings(smartRunningRemindSettings, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            SmartRunningRemindSettingUpdateResult smartRunningRemindSettingUpdateResult = (SmartRunningRemindSettingUpdateResult) obj;
            if (smartRunningRemindSettingUpdateResult == null || !smartRunningRemindSettingUpdateResult.getSuccess()) {
                this.this$0.getMAbilityPlanSettings().postValue(new SmartRunningRemindSettings(this.this$0.getReminderSwitch(), this.this$0.getReminderTime(), this.this$0.getRunningDays(), this.this$0.getStrengthDays()));
                Logger.i(AbilityPlanSettingVM.TAG, "update ");
            } else {
                this.this$0.setReminderSwitch(this.$settings.getRemindSwitch());
                this.this$0.setReminderTime(this.$settings.getRemindTime());
                AbilityPlanSettingVM abilityPlanSettingVM = this.this$0;
                String runningDays = this.$settings.getRunningDays();
                if (runningDays == null) {
                    runningDays = "";
                }
                abilityPlanSettingVM.setRunningDays(runningDays);
                AbilityPlanSettingVM abilityPlanSettingVM2 = this.this$0;
                String strengthDays = this.$settings.getStrengthDays();
                abilityPlanSettingVM2.setStrengthDays(strengthDays != null ? strengthDays : "");
                if (this.$isDays && (!smartRunningRemindSettingUpdateResult.getPlans().isEmpty())) {
                    this.this$0.dayPlans.clear();
                    this.this$0.dayPlans.addAll(smartRunningRemindSettingUpdateResult.getPlans());
                    if (TrainingPlanPreference.INSTANCE.getSAVE_PLAN_TO_CALENDAR()) {
                        this.this$0.delAndAddAbilityToCalendar(this.$context, new Function1() { // from class: com.xiaomi.fitness.training_plan.settings.a
                            @Override // kotlin.jvm.functions.Function1
                            /* JADX INFO: renamed from: invoke */
                            public final Object invoke2(Object obj2) {
                                return AbilityPlanSettingVM.C32851.invokeSuspend$lambda$0(((Boolean) obj2).booleanValue());
                            }
                        });
                    }
                }
                this.this$0.getMAbilityPlanSettings().postValue(this.$settings);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C32851) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<CalendarHelper.CalendarReminderEvent> buildAbilityCalendarEvent() {
        ArrayList arrayList = new ArrayList();
        ArrayList<AbilityDayPlan> arrayList2 = new ArrayList();
        arrayList2.addAll(this.thisWeekDayPlans);
        arrayList2.addAll(this.dayPlans);
        for (AbilityDayPlan abilityDayPlan : arrayList2) {
            try {
                long date = abilityDayPlan.getDate() * ((long) 1000);
                long j = ((long) 86400000) + date;
                List<AbilityDayPlanCourse> courseList = abilityDayPlan.getCourseList();
                if (courseList != null) {
                    Iterator it = courseList.iterator();
                    while (it.hasNext()) {
                        Iterator it2 = it;
                        arrayList.add(new CalendarHelper.CalendarReminderEvent(((AbilityDayPlanCourse) it.next()).getName(), ResourceExtKt.getString(k1j.q0), date, j, ""));
                        it = it2;
                    }
                }
            } catch (Exception e) {
                Logger.e(TAG, "buildCalendarEvent exception", e);
            }
        }
        return arrayList;
    }

    private final boolean checkIsSuccessive(int[] days) {
        int length = days.length;
        for (int i = 1; i < length; i++) {
            if (days[i - 1] != days[i] - 1) {
                return false;
            }
        }
        return true;
    }

    private final String getHM(Long time) {
        if (time == null) {
            return "";
        }
        int iLongValue = (int) (time.longValue() / ((long) 3600));
        int iLongValue2 = (int) ((time.longValue() - ((long) (iLongValue * 3600))) / ((long) 60));
        return getStringHour(iLongValue) + ":" + getStringMinute(iLongValue2);
    }

    private final String getStringHour(int hour) {
        if (hour > 9) {
            StringBuilder sb = new StringBuilder();
            sb.append(hour);
            return sb.toString();
        }
        return "0" + hour;
    }

    private final String getStringMinute(int minute) {
        if (minute > 9) {
            StringBuilder sb = new StringBuilder();
            sb.append(minute);
            return sb.toString();
        }
        return "0" + minute;
    }

    public static /* synthetic */ void updateAbilityPlanSettings$default(AbilityPlanSettingVM abilityPlanSettingVM, Context context, SmartRunningRemindSettings smartRunningRemindSettings, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        abilityPlanSettingVM.updateAbilityPlanSettings(context, smartRunningRemindSettings, z);
    }

    public final void delAndAddAbilityToCalendar(@NotNull Context context, @Nullable Function1<? super Boolean, Unit> addCallback) {
        Intrinsics.checkNotNullParameter(context, "context");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(context, this, addCallback, null), 3, null);
    }

    public final void deleteCalendarIfNeed(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C32821(context, null), 3, null);
    }

    public final void getAbilityPlanSettings(long planID) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C32831(planID, this, null), 3, null);
    }

    @NotNull
    public final String getCustomRepeatFormatString(@NotNull int[] days) {
        Intrinsics.checkNotNullParameter(days, "days");
        Objects.requireNonNull(days);
        int length = days.length;
        boolean zCheckIsSuccessive = checkIsSuccessive(days);
        String[] stringArray = ResourceExtKt.getStringArray(ApplicationExtKt.getApplication(), chi.c);
        if (length == 0) {
            return "";
        }
        if (length == 7) {
            String string = ApplicationExtKt.getApplication().getString(k1j.t1);
            Intrinsics.checkNotNull(string);
            return string;
        }
        if (length == 1) {
            String string2 = ApplicationExtKt.getApplication().getString(k1j.r1, stringArray[days[0] - 1]);
            Intrinsics.checkNotNull(string2);
            return string2;
        }
        if (length > 3 && zCheckIsSuccessive) {
            String string3 = ApplicationExtKt.getApplication().getString(k1j.s1, stringArray[days[0] - 1], stringArray[days[days.length - 1] - 1]);
            Intrinsics.checkNotNull(string3);
            return string3;
        }
        StringBuilder sb = new StringBuilder(ApplicationExtKt.getApplication().getString(k1j.r1));
        int i = 2;
        if (2 <= length) {
            while (true) {
                sb.append(",%");
                sb.append(i);
                sb.append("$");
                sb.append("s");
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        int length2 = days.length;
        String[] strArr = new String[length2];
        int length3 = days.length;
        for (int i2 = 0; i2 < length3; i2++) {
            strArr[i2] = stringArray[days[i2] - 1];
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String string4 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string4, "toString(...)");
        Object[] objArrCopyOf = Arrays.copyOf(strArr, length2);
        String str = String.format(string4, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    @NotNull
    public final MutableLiveData<SmartRunningRemindSettings> getMAbilityPlanSettings() {
        return this.mAbilityPlanSettings;
    }

    public final boolean getReminderSwitch() {
        return this.reminderSwitch;
    }

    @NotNull
    public final String getReminderTime() {
        return this.reminderTime;
    }

    @NotNull
    public final String getRunningDays() {
        return this.runningDays;
    }

    @NotNull
    public final int[] getSelectedDays(@NotNull String days) {
        Intrinsics.checkNotNullParameter(days, "days");
        try {
            List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) days, new String[]{","}, false, 0, 6, (Object) null);
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listSplit$default, 10));
            Iterator it = listSplit$default.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(Integer.parseInt((String) it.next())));
            }
            return CollectionsKt___CollectionsKt.toIntArray(arrayList);
        } catch (Exception e) {
            Logger.e(TAG, "getSelectedDays exception", e);
            return new int[0];
        }
    }

    @NotNull
    public final String getStrengthDays() {
        return this.strengthDays;
    }

    public final void handleDayPlans(@Nullable AbilityPlan abilityPlan) {
        List<AbilityDayPlan> planCourseList;
        Date date = new Date();
        if (abilityPlan == null || (planCourseList = abilityPlan.getPlanCourseList()) == null) {
            return;
        }
        for (AbilityDayPlan abilityDayPlan : planCourseList) {
            try {
                this.thisWeekDayPlans.add(abilityDayPlan);
                Date date2 = new Date(abilityDayPlan.getDate() * ((long) 1000));
                if (!CalendarUtilsKt.isDayBefore(date2, date) && CalendarUtilsKt.isSameWeek(date2, date)) {
                    this.thisWeekDayPlans.add(abilityDayPlan);
                } else if (CalendarUtilsKt.isDayAfter(date2, date)) {
                    this.dayPlans.add(abilityDayPlan);
                }
            } catch (Exception e) {
                Logger.e(TAG, "handleThisWeekDayPlans exception", e);
            }
        }
    }

    public final void setReminderSwitch(boolean z) {
        this.reminderSwitch = z;
    }

    public final void setReminderTime(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.reminderTime = str;
    }

    public final void setRunningDays(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.runningDays = str;
    }

    public final void setStrengthDays(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.strengthDays = str;
    }

    public final void showCalendarInfo(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C32841(context, null), 3, null);
    }

    public final void updateAbilityPlanSettings(@NotNull Context context, @NotNull SmartRunningRemindSettings settings, boolean isDays) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(settings, "settings");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C32851(settings, this, isDays, context, null), 3, null);
    }
}
