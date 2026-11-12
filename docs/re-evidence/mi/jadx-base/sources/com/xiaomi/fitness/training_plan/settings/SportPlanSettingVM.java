package com.xiaomi.fitness.training_plan.settings;

import android.content.Context;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.training_plan.net.ExecStatusResult;
import com.xiaomi.fitness.training_plan.net.SmartRunningRemindSettings;
import com.xiaomi.fitness.training_plan.net.SportRemindSettings;
import com.xiaomi.fitness.training_plan.net.TrainingPlanRequest;
import com.xiaomi.fitness.training_plan.util.SportCalendarUtils;
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
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 ,2\u00020\u0001:\u0001,B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 J&\u0010#\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010$\u001a\u00020\n2\u0006\u0010%\u001a\u00020\u0016J\u000e\u0010&\u001a\u00020\u001c2\u0006\u0010'\u001a\u00020(J$\u0010)\u001a\u00020\u001c2\u0006\u0010'\u001a\u00020(2\u0014\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010+R\u0019\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\b¨\u0006-"}, d2 = {"Lcom/xiaomi/fitness/training_plan/settings/SportPlanSettingVM;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "<init>", "()V", "mGetSportPlanSettings", "Landroidx/lifecycle/MutableLiveData;", "Lcom/xiaomi/fitness/training_plan/net/SmartRunningRemindSettings;", "getMGetSportPlanSettings", "()Landroidx/lifecycle/MutableLiveData;", "reminderSwitch", "", "getReminderSwitch", "()Z", "setReminderSwitch", "(Z)V", "sportPlanSetting", "Lcom/xiaomi/fitness/training_plan/net/SportRemindSettings;", "getSportPlanSetting", "()Lcom/xiaomi/fitness/training_plan/net/SportRemindSettings;", "setSportPlanSetting", "(Lcom/xiaomi/fitness/training_plan/net/SportRemindSettings;)V", "reminderTime", "", "getReminderTime", "()Ljava/lang/String;", "setReminderTime", "(Ljava/lang/String;)V", "getSportPlanSettings", "", "planId", "", "planType", "", "updateSettingsResult", "getUpdateSettingsResult", "updateSportPlanSettings", "remindSwitch", "remindTime", "deleteCalendarIfNeed", "context", "Landroid/content/Context;", "delAndAddSportToCalendar", "addCallback", "Lkotlin/Function1;", "Companion", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SportPlanSettingVM extends AbsViewModel {

    @NotNull
    public static final String TAG = "SportPlanSettingVM";
    private boolean reminderSwitch;

    @Nullable
    private SportRemindSettings sportPlanSetting;

    @NotNull
    private final MutableLiveData<SmartRunningRemindSettings> mGetSportPlanSettings = new MutableLiveData<>();

    @NotNull
    private String reminderTime = "18:00";

    @NotNull
    private final MutableLiveData<SmartRunningRemindSettings> updateSettingsResult = new MutableLiveData<>();

    /* JADX INFO: renamed from: com.xiaomi.fitness.training_plan.settings.SportPlanSettingVM$delAndAddSportToCalendar$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.training_plan.settings.SportPlanSettingVM$delAndAddSportToCalendar$1", f = "SportPlanSettingVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
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
            return SportPlanSettingVM.this.new AnonymousClass1(this.$context, this.$addCallback, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (SportPlanSettingVM.this.getSportPlanSetting() == null) {
                Logger.i(SportPlanSettingVM.TAG, "can not save sport to calendar with empty sport plan!!");
                return Unit.INSTANCE;
            }
            CalendarHelper.INSTANCE.deleteCalendarEvent(this.$context);
            boolean zAddLoopSportCalendarEvent = SportCalendarUtils.INSTANCE.addLoopSportCalendarEvent(this.$context, SportPlanSettingVM.this.getSportPlanSetting());
            Function1<Boolean, Unit> function1 = this.$addCallback;
            if (function1 != null) {
                function1.invoke2(Boxing.boxBoolean(zAddLoopSportCalendarEvent));
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.training_plan.settings.SportPlanSettingVM$deleteCalendarIfNeed$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.training_plan.settings.SportPlanSettingVM$deleteCalendarIfNeed$1", f = "SportPlanSettingVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C32901 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $context;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C32901(Context context, Continuation<? super C32901> continuation) {
            super(2, continuation);
            this.$context = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C32901(this.$context, continuation);
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
            return ((C32901) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.training_plan.settings.SportPlanSettingVM$getSportPlanSettings$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.training_plan.settings.SportPlanSettingVM$getSportPlanSettings$1", f = "SportPlanSettingVM.kt", i = {}, l = {31}, m = "invokeSuspend", n = {}, s = {})
    public static final class C32911 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $planId;
        final /* synthetic */ int $planType;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C32911(long j, int i, Continuation<? super C32911> continuation) {
            super(2, continuation);
            this.$planId = j;
            this.$planType = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SportPlanSettingVM.this.new C32911(this.$planId, this.$planType, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            SportPlanSettingVM sportPlanSettingVM;
            String remindTime;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SportPlanSettingVM sportPlanSettingVM2 = SportPlanSettingVM.this;
                TrainingPlanRequest trainingPlanRequest = new TrainingPlanRequest();
                long j = this.$planId;
                int i2 = this.$planType;
                this.L$0 = sportPlanSettingVM2;
                this.label = 1;
                Object sportPlanSettings = trainingPlanRequest.getSportPlanSettings(j, i2, this);
                if (sportPlanSettings == coroutine_suspended) {
                    return coroutine_suspended;
                }
                sportPlanSettingVM = sportPlanSettingVM2;
                obj = sportPlanSettings;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sportPlanSettingVM = (SportPlanSettingVM) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            sportPlanSettingVM.setSportPlanSetting((SportRemindSettings) obj);
            Logger.i(SportPlanSettingVM.TAG, "getSportPlanSettings:" + SportPlanSettingVM.this.getSportPlanSetting() + " planId:" + this.$planId);
            SportPlanSettingVM sportPlanSettingVM3 = SportPlanSettingVM.this;
            SportRemindSettings sportPlanSetting = sportPlanSettingVM3.getSportPlanSetting();
            sportPlanSettingVM3.setReminderSwitch(sportPlanSetting != null ? sportPlanSetting.getRemindSwitch() : false);
            SportPlanSettingVM sportPlanSettingVM4 = SportPlanSettingVM.this;
            SportRemindSettings sportPlanSetting2 = sportPlanSettingVM4.getSportPlanSetting();
            String remindTime2 = sportPlanSetting2 != null ? sportPlanSetting2.getRemindTime() : null;
            if (remindTime2 == null || remindTime2.length() == 0) {
                remindTime = "18:00";
            } else {
                SportRemindSettings sportPlanSetting3 = SportPlanSettingVM.this.getSportPlanSetting();
                remindTime = sportPlanSetting3 != null ? sportPlanSetting3.getRemindTime() : null;
                Intrinsics.checkNotNull(remindTime);
            }
            sportPlanSettingVM4.setReminderTime(remindTime);
            SportPlanSettingVM.this.getMGetSportPlanSettings().postValue(new SmartRunningRemindSettings(SportPlanSettingVM.this.getReminderSwitch(), SportPlanSettingVM.this.getReminderTime(), null, null));
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C32911) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.training_plan.settings.SportPlanSettingVM$updateSportPlanSettings$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.training_plan.settings.SportPlanSettingVM$updateSportPlanSettings$1", f = "SportPlanSettingVM.kt", i = {}, l = {51}, m = "invokeSuspend", n = {}, s = {})
    public static final class C32921 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $planId;
        final /* synthetic */ int $planType;
        final /* synthetic */ boolean $remindSwitch;
        final /* synthetic */ String $remindTime;
        int label;
        final /* synthetic */ SportPlanSettingVM this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C32921(long j, int i, boolean z, String str, SportPlanSettingVM sportPlanSettingVM, Continuation<? super C32921> continuation) {
            super(2, continuation);
            this.$planId = j;
            this.$planType = i;
            this.$remindSwitch = z;
            this.$remindTime = str;
            this.this$0 = sportPlanSettingVM;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C32921(this.$planId, this.$planType, this.$remindSwitch, this.$remindTime, this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                TrainingPlanRequest trainingPlanRequest = new TrainingPlanRequest();
                long j = this.$planId;
                int i2 = this.$planType;
                boolean z = this.$remindSwitch;
                String str = this.$remindTime;
                this.label = 1;
                obj = trainingPlanRequest.updateSportPlanSettings(j, i2, z, str, this);
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
                this.this$0.setReminderSwitch(this.$remindSwitch);
                this.this$0.setReminderTime(this.$remindTime);
                this.this$0.getUpdateSettingsResult().postValue(new SmartRunningRemindSettings(this.this$0.getReminderSwitch(), this.this$0.getReminderTime(), null, null));
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C32921) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final void delAndAddSportToCalendar(@NotNull Context context, @Nullable Function1<? super Boolean, Unit> addCallback) {
        Intrinsics.checkNotNullParameter(context, "context");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new AnonymousClass1(context, addCallback, null), 2, null);
    }

    public final void deleteCalendarIfNeed(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C32901(context, null), 2, null);
    }

    @NotNull
    public final MutableLiveData<SmartRunningRemindSettings> getMGetSportPlanSettings() {
        return this.mGetSportPlanSettings;
    }

    public final boolean getReminderSwitch() {
        return this.reminderSwitch;
    }

    @NotNull
    public final String getReminderTime() {
        return this.reminderTime;
    }

    @Nullable
    public final SportRemindSettings getSportPlanSetting() {
        return this.sportPlanSetting;
    }

    public final void getSportPlanSettings(long planId, int planType) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C32911(planId, planType, null), 3, null);
    }

    @NotNull
    public final MutableLiveData<SmartRunningRemindSettings> getUpdateSettingsResult() {
        return this.updateSettingsResult;
    }

    public final void setReminderSwitch(boolean z) {
        this.reminderSwitch = z;
    }

    public final void setReminderTime(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.reminderTime = str;
    }

    public final void setSportPlanSetting(@Nullable SportRemindSettings sportRemindSettings) {
        this.sportPlanSetting = sportRemindSettings;
    }

    public final void updateSportPlanSettings(long planId, int planType, boolean remindSwitch, @NotNull String remindTime) {
        Intrinsics.checkNotNullParameter(remindTime, "remindTime");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C32921(planId, planType, remindSwitch, remindTime, this, null), 3, null);
    }
}
