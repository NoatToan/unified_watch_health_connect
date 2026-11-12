package com.huami.sky.ui.service;

import android.content.Context;
import android.content.IntentFilter;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.sky.lib.entity.SleepReminderInfo;
import com.huami.sky.lib.repo.reminder.ISleepReminderRepo;
import com.huami.sky.service.SkyNotificationService;
import com.huami.sky.ui.play.SkyPlayConstant;
import com.huami.sky.ui.sleepreminder.notification.SkyReminderAlarmManager;
import com.huami.sky.ui.sleepreminder.notification.SkyReminderNotificationReceiver;
import com.huami.sky.ui.utils.Constant;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.CommonLanguageSettingFragment;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.e;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lcom/huami/sky/ui/service/SkyNotificationServiceImpl;", "Lcom/huami/sky/service/SkyNotificationService;", "", "startSleepReminderAlarm", "cancelSleepReminderAlarm", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "registerReminderReceiver", "unRegisterReminderReceiver", "a", "Landroid/content/Context;", "Lcom/huami/sky/lib/repo/reminder/ISleepReminderRepo;", "b", "Lcom/huami/sky/lib/repo/reminder/ISleepReminderRepo;", CommonLanguageSettingFragment.KEY_REPO, "Lkotlinx/coroutines/CoroutineScope;", "c", "Lkotlinx/coroutines/CoroutineScope;", "skyIOScope", "Lkotlinx/coroutines/Job;", GoogleApiAvailabilityLight.a, "Lkotlinx/coroutines/Job;", "alarmJob", "Lcom/huami/sky/ui/sleepreminder/notification/SkyReminderNotificationReceiver;", "e", "Lcom/huami/sky/ui/sleepreminder/notification/SkyReminderNotificationReceiver;", "reminderReceiver", "<init>", "(Landroid/content/Context;Lcom/huami/sky/lib/repo/reminder/ISleepReminderRepo;)V", "sky-ui_release"}, k = 1, mv = {1, 5, 1})
public final class SkyNotificationServiceImpl implements SkyNotificationService {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final ISleepReminderRepo repo;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final CoroutineScope skyIOScope = CoroutineScopeKt.CoroutineScope(Dispatchers.getIO());

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private Job alarmJob;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private SkyReminderNotificationReceiver reminderReceiver;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Throwable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Throwable th) {
            super(0);
            this.a = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "注册事件提醒广播失败：" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ Throwable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Throwable th) {
            super(0);
            this.a = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "取消事件提醒广播失败：" + this.a;
        }
    }

    /* JADX INFO: renamed from: com.huami.sky.ui.service.SkyNotificationServiceImpl$startSleepReminderAlarm$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sky.ui.service.SkyNotificationServiceImpl$startSleepReminderAlarm$1", f = "SkyNotificationServiceImpl.kt", i = {}, l = {41, 85}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public Object a;
        public int b;

        /* JADX INFO: renamed from: com.huami.sky.ui.service.SkyNotificationServiceImpl$startSleepReminderAlarm$1$a */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ SleepReminderInfo a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(SleepReminderInfo sleepReminderInfo) {
                super(0);
                this.a = sleepReminderInfo;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "接收到入睡通知提醒变化：" + this.a;
            }
        }

        /* JADX INFO: renamed from: com.huami.sky.ui.service.SkyNotificationServiceImpl$startSleepReminderAlarm$1$b */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function0<String> {
            public final /* synthetic */ Throwable a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Throwable th) {
                super(0);
                this.a = th;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "启动入睡通知提醒失败：" + this.a.getMessage();
            }
        }

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SkyNotificationServiceImpl.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:26:0x0063  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objM3845constructorimpl;
            Throwable thM3848exceptionOrNullimpl;
            final SkyNotificationServiceImpl skyNotificationServiceImpl;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.b;
            try {
                if (i != 0) {
                    if (i == 1) {
                        skyNotificationServiceImpl = (SkyNotificationServiceImpl) this.a;
                        ResultKt.throwOnFailure(obj);
                    } else {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    objM3845constructorimpl = Result.m3845constructorimpl(Unit.INSTANCE);
                    thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
                    if (thM3848exceptionOrNullimpl != null) {
                        HMLog.info("SkyNotificationServiceImpl", new b(thM3848exceptionOrNullimpl));
                    }
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                skyNotificationServiceImpl = SkyNotificationServiceImpl.this;
                Result.Companion companion = Result.Companion;
                ISleepReminderRepo iSleepReminderRepo = skyNotificationServiceImpl.repo;
                this.a = skyNotificationServiceImpl;
                this.b = 1;
                obj = iSleepReminderRepo.sleepReminderInfo(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                FlowCollector<SleepReminderInfo> flowCollector = new FlowCollector<SleepReminderInfo>() { // from class: com.huami.sky.ui.service.SkyNotificationServiceImpl$startSleepReminderAlarm$1$invokeSuspend$lambda-1$$inlined$collect$1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    @Nullable
                    public Object emit(SleepReminderInfo sleepReminderInfo, @NotNull Continuation<? super Unit> continuation) {
                        SleepReminderInfo sleepReminderInfo2 = sleepReminderInfo;
                        HMLog.info("SkyNotificationServiceImpl", new SkyNotificationServiceImpl.AnonymousClass1.a(sleepReminderInfo2));
                        SkyReminderAlarmManager.Companion companion2 = SkyReminderAlarmManager.INSTANCE;
                        companion2.getInstance().cancelAlarm(skyNotificationServiceImpl.context);
                        if (sleepReminderInfo2.getSwitch() == 1) {
                            companion2.getInstance().startAlarm(skyNotificationServiceImpl.context, sleepReminderInfo2);
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.a = null;
                this.b = 2;
                if (((Flow) obj).collect(flowCollector, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                objM3845constructorimpl = Result.m3845constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
            }
            thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
            if (thM3848exceptionOrNullimpl != null) {
                HMLog.info("SkyNotificationServiceImpl", new b(thM3848exceptionOrNullimpl));
            }
            return Unit.INSTANCE;
        }
    }

    public SkyNotificationServiceImpl(@NotNull Context context, @NotNull ISleepReminderRepo iSleepReminderRepo) {
        this.context = context;
        this.repo = iSleepReminderRepo;
    }

    @Override // com.huami.sky.service.SkyNotificationService
    public void cancelSleepReminderAlarm() {
        SkyReminderAlarmManager.INSTANCE.getInstance().cancelAlarm(this.context);
        Job job = this.alarmJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.alarmJob = null;
    }

    @Override // com.huami.sky.service.SkyNotificationService
    public void registerReminderReceiver(@NotNull Context context) {
        Object objM3845constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            this.reminderReceiver = new SkyReminderNotificationReceiver();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(SkyPlayConstant.SKY_LOGOUT_ACTION);
            intentFilter.addAction(Constant.SKY_REMINDER_NOTIFICATION_ACTION);
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_SET");
            objM3845constructorimpl = Result.m3845constructorimpl(context.registerReceiver(this.reminderReceiver, intentFilter));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            HMLog.info("SkyNotificationServiceImpl", new a(thM3848exceptionOrNullimpl));
        }
    }

    @Override // com.huami.sky.service.SkyNotificationService
    public void startSleepReminderAlarm() {
        Job job = this.alarmJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.alarmJob = e.f(this.skyIOScope, null, null, new AnonymousClass1(null), 3, null);
    }

    @Override // com.huami.sky.service.SkyNotificationService
    public void unRegisterReminderReceiver(@NotNull Context context) {
        Object objM3845constructorimpl;
        Unit unit;
        try {
            Result.Companion companion = Result.Companion;
            SkyReminderNotificationReceiver skyReminderNotificationReceiver = this.reminderReceiver;
            if (skyReminderNotificationReceiver == null) {
                unit = null;
            } else {
                context.unregisterReceiver(skyReminderNotificationReceiver);
                unit = Unit.INSTANCE;
            }
            objM3845constructorimpl = Result.m3845constructorimpl(unit);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            HMLog.info("SkyNotificationServiceImpl", new b(thM3848exceptionOrNullimpl));
        }
    }
}
