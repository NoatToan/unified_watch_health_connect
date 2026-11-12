package com.xiaomi.fitness.training_plan.settings;

import android.content.Context;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.training_plan.net.ExecStatusResult;
import com.xiaomi.fitness.training_plan.net.SmartRunningRemindSettings;
import com.xiaomi.fitness.training_plan.net.TrainingPlanRequest;
import com.xiaomi.fitness.training_plan.util.HabitCalendarUtils;
import com.xiaomi.fitness.training_plan_export.model.HabitPlan;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 *2\u00020\u0001:\u0001*B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eJ\u000e\u0010!\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020\u0006J\u000e\u0010#\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020%J$\u0010&\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020%2\u0014\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010(J\u000e\u0010)\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020%R\u0019\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\b¨\u0006+"}, d2 = {"Lcom/xiaomi/fitness/training_plan/settings/HabitPlanSettingVM;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "<init>", "()V", "mGetHabitPlanSettings", "Landroidx/lifecycle/MutableLiveData;", "Lcom/xiaomi/fitness/training_plan/net/SmartRunningRemindSettings;", "getMGetHabitPlanSettings", "()Landroidx/lifecycle/MutableLiveData;", "reminderSwitch", "", "getReminderSwitch", "()Z", "setReminderSwitch", "(Z)V", "habitPlan", "Lcom/xiaomi/fitness/training_plan_export/model/HabitPlan;", "getHabitPlan", "()Lcom/xiaomi/fitness/training_plan_export/model/HabitPlan;", "setHabitPlan", "(Lcom/xiaomi/fitness/training_plan_export/model/HabitPlan;)V", "reminderTime", "", "getReminderTime", "()Ljava/lang/String;", "setReminderTime", "(Ljava/lang/String;)V", "getHabitPlanSettings", "", "planId", "", "updateSettingsResult", "getUpdateSettingsResult", "updateHabitPlanSettings", "settings", "deleteCalendarIfNeed", "context", "Landroid/content/Context;", "delAndAddHabitToCalendar", "addCallback", "Lkotlin/Function1;", "showCalendarInfo", "Companion", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HabitPlanSettingVM extends AbsViewModel {

    @NotNull
    public static final String TAG = "HabitPlanSettingVM";

    @Nullable
    private HabitPlan habitPlan;
    private boolean reminderSwitch;

    @NotNull
    private final MutableLiveData<SmartRunningRemindSettings> mGetHabitPlanSettings = new MutableLiveData<>();

    @NotNull
    private String reminderTime = "18:00";

    @NotNull
    private final MutableLiveData<SmartRunningRemindSettings> updateSettingsResult = new MutableLiveData<>();

    /* JADX INFO: renamed from: com.xiaomi.fitness.training_plan.settings.HabitPlanSettingVM$delAndAddHabitToCalendar$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.training_plan.settings.HabitPlanSettingVM$delAndAddHabitToCalendar$1", f = "HabitPlanSettingVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<Boolean, Unit> $addCallback;
        final /* synthetic */ Context $context;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Context context, Function1<? super Boolean, Unit> function1, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$context = context;
            this.$addCallback = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return HabitPlanSettingVM.this.new AnonymousClass1(this.$context, this.$addCallback, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (HabitPlanSettingVM.this.getHabitPlan() == null) {
                Logger.i(HabitPlanSettingVM.TAG, "can not save habit to calendar with empty habit plan!!");
                return Unit.INSTANCE;
            }
            CalendarHelper.INSTANCE.deleteCalendarEvent(this.$context);
            boolean zAddLoopHabitCalendarEvent = HabitCalendarUtils.INSTANCE.addLoopHabitCalendarEvent(this.$context, HabitPlanSettingVM.this.getHabitPlan(), false);
            Function1<Boolean, Unit> function1 = this.$addCallback;
            if (function1 != null) {
                function1.invoke2(Boxing.boxBoolean(zAddLoopHabitCalendarEvent));
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.training_plan.settings.HabitPlanSettingVM$deleteCalendarIfNeed$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.training_plan.settings.HabitPlanSettingVM$deleteCalendarIfNeed$1", f = "HabitPlanSettingVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C32861 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $context;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C32861(Context context, Continuation<? super C32861> continuation) {
            super(2, continuation);
            this.$context = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C32861(this.$context, continuation);
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
            return ((C32861) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.training_plan.settings.HabitPlanSettingVM$getHabitPlanSettings$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.training_plan.settings.HabitPlanSettingVM$getHabitPlanSettings$1", f = "HabitPlanSettingVM.kt", i = {}, l = {29}, m = "invokeSuspend", n = {}, s = {})
    public static final class C32871 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $planId;
        int label;
        final /* synthetic */ HabitPlanSettingVM this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C32871(long j, HabitPlanSettingVM habitPlanSettingVM, Continuation<? super C32871> continuation) {
            super(2, continuation);
            this.$planId = j;
            this.this$0 = habitPlanSettingVM;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C32871(this.$planId, this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String remindTime;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                TrainingPlanRequest trainingPlanRequest = new TrainingPlanRequest();
                long j = this.$planId;
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
            Logger.i(HabitPlanSettingVM.TAG, "getHabitPlanSettings:" + smartRunningRemindSettings + " planId:" + this.$planId);
            this.this$0.setReminderSwitch(smartRunningRemindSettings != null ? smartRunningRemindSettings.getRemindSwitch() : false);
            HabitPlanSettingVM habitPlanSettingVM = this.this$0;
            String remindTime2 = smartRunningRemindSettings != null ? smartRunningRemindSettings.getRemindTime() : null;
            if (remindTime2 == null || remindTime2.length() == 0) {
                remindTime = "18:00";
            } else {
                remindTime = smartRunningRemindSettings != null ? smartRunningRemindSettings.getRemindTime() : null;
                Intrinsics.checkNotNull(remindTime);
            }
            habitPlanSettingVM.setReminderTime(remindTime);
            this.this$0.getMGetHabitPlanSettings().postValue(new SmartRunningRemindSettings(this.this$0.getReminderSwitch(), this.this$0.getReminderTime(), null, null));
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C32871) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.training_plan.settings.HabitPlanSettingVM$showCalendarInfo$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.training_plan.settings.HabitPlanSettingVM$showCalendarInfo$1", f = "HabitPlanSettingVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C32881 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $context;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C32881(Context context, Continuation<? super C32881> continuation) {
            super(2, continuation);
            this.$context = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C32881(this.$context, continuation);
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
            return ((C32881) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.training_plan.settings.HabitPlanSettingVM$updateHabitPlanSettings$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.training_plan.settings.HabitPlanSettingVM$updateHabitPlanSettings$1", f = "HabitPlanSettingVM.kt", i = {}, l = {49}, m = "invokeSuspend", n = {}, s = {})
    public static final class C32891 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ SmartRunningRemindSettings $settings;
        int label;
        final /* synthetic */ HabitPlanSettingVM this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C32891(SmartRunningRemindSettings smartRunningRemindSettings, HabitPlanSettingVM habitPlanSettingVM, Continuation<? super C32891> continuation) {
            super(2, continuation);
            this.$settings = smartRunningRemindSettings;
            this.this$0 = habitPlanSettingVM;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C32891(this.$settings, this.this$0, continuation);
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
                obj = trainingPlanRequest.updateHabitPlanSettings(smartRunningRemindSettings, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            ExecStatusResult execStatusResult = (ExecStatusResult) obj;
            if (execStatusResult == null || !execStatusResult.getResult()) {
                this.this$0.getUpdateSettingsResult().postValue(new SmartRunningRemindSettings(this.this$0.getReminderSwitch(), this.this$0.getReminderTime(), null, null));
            } else {
                this.this$0.setReminderSwitch(this.$settings.getRemindSwitch());
                this.this$0.setReminderTime(this.$settings.getRemindTime());
                this.this$0.getUpdateSettingsResult().postValue(this.$settings);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C32891) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final void delAndAddHabitToCalendar(@NotNull Context context, @Nullable Function1<? super Boolean, Unit> addCallback) {
        Intrinsics.checkNotNullParameter(context, "context");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(context, addCallback, null), 3, null);
    }

    public final void deleteCalendarIfNeed(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C32861(context, null), 3, null);
    }

    @Nullable
    public final HabitPlan getHabitPlan() {
        return this.habitPlan;
    }

    public final void getHabitPlanSettings(long planId) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C32871(planId, this, null), 3, null);
    }

    @NotNull
    public final MutableLiveData<SmartRunningRemindSettings> getMGetHabitPlanSettings() {
        return this.mGetHabitPlanSettings;
    }

    public final boolean getReminderSwitch() {
        return this.reminderSwitch;
    }

    @NotNull
    public final String getReminderTime() {
        return this.reminderTime;
    }

    @NotNull
    public final MutableLiveData<SmartRunningRemindSettings> getUpdateSettingsResult() {
        return this.updateSettingsResult;
    }

    public final void setHabitPlan(@Nullable HabitPlan habitPlan) {
        this.habitPlan = habitPlan;
    }

    public final void setReminderSwitch(boolean z) {
        this.reminderSwitch = z;
    }

    public final void setReminderTime(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.reminderTime = str;
    }

    public final void showCalendarInfo(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C32881(context, null), 3, null);
    }

    public final void updateHabitPlanSettings(@NotNull SmartRunningRemindSettings settings) {
        Intrinsics.checkNotNullParameter(settings, "settings");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C32891(settings, this, null), 3, null);
    }
}
