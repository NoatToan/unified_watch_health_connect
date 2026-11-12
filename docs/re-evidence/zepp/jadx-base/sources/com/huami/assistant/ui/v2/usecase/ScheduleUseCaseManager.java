package com.huami.assistant.ui.v2.usecase;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.assistant.AssistantModule;
import com.huami.assistant.ui.v2.repo.ScheduleRpcApi;
import com.huami.assistant.ui.v2.repo.SettingRepo;
import com.huami.assistant.ui.v2.repo.WorkDayRepo;
import com.huami.bluetooth.profile.channel.module.schedule.model.ScheduleModel;
import com.huami.bluetooth.profile.channel.module.schedule.model.ScheduleVersion;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u000f\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0006\u0010\u0006\u001a\u00020\u0004J\u0006\u0010\u0007\u001a\u00020\u0004R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001d\u0010\u0010\u001a\u00020\f8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u001d\u0010\u0014\u001a\u00020\u00118B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0018\u001a\u00020\u00158B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u000e\u001a\u0004\b\t\u0010\u0017R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00198B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u001a¨\u0006\u001f"}, d2 = {"Lcom/huami/assistant/ui/v2/usecase/ScheduleUseCaseManager;", "", "", "isBind", "", "e", "onDeviceBind", "onBoundedDeviceConnected", "Landroid/content/Context;", "a", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/assistant/ui/v2/usecase/DeviceDataObserverUseCase;", "b", "Lkotlin/Lazy;", "()Lcom/huami/assistant/ui/v2/usecase/DeviceDataObserverUseCase;", "deviceDataObserverUseCase", "Lcom/huami/assistant/ui/v2/usecase/LunarDataUseCase;", "c", "()Lcom/huami/assistant/ui/v2/usecase/LunarDataUseCase;", "lunarDataUseCase", "Lcom/huami/assistant/ui/v2/usecase/CorrectUseScheduleData;", GoogleApiAvailabilityLight.a, "()Lcom/huami/assistant/ui/v2/usecase/CorrectUseScheduleData;", "correctUseScheduleData", "Lcom/huami/assistant/ui/v2/repo/ScheduleRpcApi;", "()Lcom/huami/assistant/ui/v2/repo/ScheduleRpcApi;", "scheduleRpcApi", "<init>", "(Landroid/content/Context;)V", "Companion", "assistant_release"}, k = 1, mv = {1, 5, 1})
public final class ScheduleUseCaseManager {

    @NotNull
    private static final String e = "Schedule-->UseCaseManager";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceDataObserverUseCase = LazyKt__LazyJVMKt.lazy(new b());

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy lunarDataUseCase = LazyKt__LazyJVMKt.lazy(new c());

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy correctUseScheduleData = LazyKt__LazyJVMKt.lazy(new a());

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/assistant/ui/v2/usecase/CorrectUseScheduleData;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<CorrectUseScheduleData> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CorrectUseScheduleData invoke() {
            return new CorrectUseScheduleData(ScheduleUseCaseManager.this.context);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/assistant/ui/v2/usecase/DeviceDataObserverUseCase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<DeviceDataObserverUseCase> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DeviceDataObserverUseCase invoke() {
            return new DeviceDataObserverUseCase(ScheduleUseCaseManager.this.context);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/assistant/ui/v2/usecase/LunarDataUseCase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<LunarDataUseCase> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LunarDataUseCase invoke() {
            return new LunarDataUseCase(ScheduleUseCaseManager.this.context);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "onBoundedDeviceConnected";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public static final e a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "onDeviceBind";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.assistant.ui.v2.usecase.ScheduleUseCaseManager$runUseCase$1", f = "ScheduleUseCaseManager.kt", i = {}, l = {49}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public Object a;
        public int b;
        public final /* synthetic */ boolean d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(boolean z, Continuation<? super f> continuation) {
            super(2, continuation);
            this.d = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return ScheduleUseCaseManager.this.new f(this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ScheduleVersion scheduleVersionQueryVersion;
            ScheduleRpcApi scheduleRpcApiD;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ScheduleRpcApi scheduleRpcApiD2 = ScheduleUseCaseManager.this.d();
                if (scheduleRpcApiD2 != null && (scheduleVersionQueryVersion = scheduleRpcApiD2.queryVersion()) != null) {
                    SettingRepo settingRepo = SettingRepo.INSTANCE;
                    this.a = scheduleVersionQueryVersion;
                    this.b = 1;
                    if (settingRepo.updateScheduleVersion(scheduleVersionQueryVersion, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            WorkDayRepo.INSTANCE.getInstance(ScheduleUseCaseManager.this.context).init();
            ScheduleUseCaseManager.this.b().execute();
            List<ScheduleModel> listFindAll = null;
            if (!this.d && (scheduleRpcApiD = ScheduleUseCaseManager.this.d()) != null) {
                listFindAll = scheduleRpcApiD.findAll();
            }
            SystemCalendarObserverUseCase companion = SystemCalendarObserverUseCase.INSTANCE.getInstance(new WeakReference<>(ScheduleUseCaseManager.this.context));
            companion.execute();
            if (listFindAll != null) {
                companion.sendCorrectSysMsg(listFindAll);
            }
            if (listFindAll != null) {
                ScheduleUseCaseManager scheduleUseCaseManager = ScheduleUseCaseManager.this;
                boolean z = this.d;
                CorrectUseScheduleData correctUseScheduleDataA = scheduleUseCaseManager.a();
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listFindAll, 10));
                Iterator<T> it2 = listFindAll.iterator();
                while (it2.hasNext()) {
                    arrayList.add(com.huami.assistant.ui.v2.model.ScheduleModel.INSTANCE.fromWatchSchedule((ScheduleModel) it2.next()));
                }
                correctUseScheduleDataA.correctData(z, arrayList);
            }
            ScheduleUseCaseManager.this.c().checkLunarDataExpired();
            return Unit.INSTANCE;
        }
    }

    public ScheduleUseCaseManager(@NotNull Context context) {
        this.context = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CorrectUseScheduleData a() {
        return (CorrectUseScheduleData) this.correctUseScheduleData.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DeviceDataObserverUseCase b() {
        return (DeviceDataObserverUseCase) this.deviceDataObserverUseCase.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LunarDataUseCase c() {
        return (LunarDataUseCase) this.lunarDataUseCase.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ScheduleRpcApi d() {
        return AssistantModule.getScheduleApi();
    }

    private final void e(boolean isBind) {
        kotlinx.coroutines.e.f(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new f(isBind, null), 3, null);
    }

    public final void onBoundedDeviceConnected() {
        HMLog.info(e, d.a);
        e(false);
    }

    public final void onDeviceBind() {
        HMLog.info(e, e.a);
        e(true);
    }
}
