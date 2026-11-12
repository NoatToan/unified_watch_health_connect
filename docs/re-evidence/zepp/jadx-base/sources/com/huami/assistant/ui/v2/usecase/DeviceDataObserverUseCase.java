package com.huami.assistant.ui.v2.usecase;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.assistant.AssistantModule;
import com.huami.assistant.ui.v2.datasource.imp.ScheduleRemoteDataSourceImp;
import com.huami.assistant.ui.v2.db.ScheduleDataBase;
import com.huami.assistant.ui.v2.db.dao.ScheduleDao;
import com.huami.assistant.ui.v2.repo.ScheduleRpcApi;
import com.huami.bluetooth.profile.channel.module.assistant.response.Response;
import com.huami.bluetooth.profile.channel.module.schedule.ScheduleCallback;
import com.huami.bluetooth.profile.channel.module.schedule.model.ScheduleModel;
import com.huami.bluetooth.profile.channel.module.schedule.model.ScheduleStatus;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.tekartik.sqflite.Constant;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000=\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0014\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u000f\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0006\u0010\u0006\u001a\u00020\u0004R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001d\u0010\u000f\u001a\u00020\u000b8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\u000eR\u001d\u0010\u0013\u001a\u00020\u00108B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\f\u0010\u0012R\u0016\u0010\u0016\u001a\u00020\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00178B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0018¨\u0006\u001d"}, d2 = {"Lcom/huami/assistant/ui/v2/usecase/DeviceDataObserverUseCase;", "", "Lcom/huami/bluetooth/profile/channel/module/schedule/model/ScheduleStatus;", "item", "", GoogleApiAvailabilityLight.a, Constant.METHOD_EXECUTE, "Landroid/content/Context;", "a", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/assistant/ui/v2/db/dao/ScheduleDao;", "b", "Lkotlin/Lazy;", "()Lcom/huami/assistant/ui/v2/db/dao/ScheduleDao;", "mScheduleDao", "Lcom/huami/assistant/ui/v2/datasource/imp/ScheduleRemoteDataSourceImp;", "c", "()Lcom/huami/assistant/ui/v2/datasource/imp/ScheduleRemoteDataSourceImp;", "remoteDataSource", "com/huami/assistant/ui/v2/usecase/DeviceDataObserverUseCase$callback$1", "Lcom/huami/assistant/ui/v2/usecase/DeviceDataObserverUseCase$callback$1;", "callback", "Lcom/huami/assistant/ui/v2/repo/ScheduleRpcApi;", "()Lcom/huami/assistant/ui/v2/repo/ScheduleRpcApi;", "scheduleRpcApi", "<init>", "(Landroid/content/Context;)V", "Companion", "assistant_release"}, k = 1, mv = {1, 5, 1})
public final class DeviceDataObserverUseCase {

    @NotNull
    private static final String e = "Schedule-->DeviceDataObserverUseCase";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy mScheduleDao = LazyKt__LazyJVMKt.lazy(new b());

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy remoteDataSource = LazyKt__LazyJVMKt.lazy(e.a);

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final DeviceDataObserverUseCase$callback$1 callback = new ScheduleCallback() { // from class: com.huami.assistant.ui.v2.usecase.DeviceDataObserverUseCase$callback$1
        @Override // com.huami.bluetooth.profile.channel.module.schedule.ScheduleCallback
        public void onAddOrUpdateResult(@NotNull Response<Boolean> response) {
        }

        @Override // com.huami.bluetooth.profile.channel.module.schedule.ScheduleCallback
        public void onDeleteResult(@NotNull Response<Boolean> response) {
        }

        @Override // com.huami.bluetooth.profile.channel.module.schedule.ScheduleCallback
        public void onDeviceScheduleChange(@NotNull ScheduleStatus item) {
            this.a.d(item);
        }

        @Override // com.huami.bluetooth.profile.channel.module.schedule.ScheduleCallback
        public void onError(@Nullable String msg, @Nullable Integer code) {
        }

        @Override // com.huami.bluetooth.profile.channel.module.schedule.ScheduleCallback
        public void onQueryDeviceDataResult(@NotNull Response<List<ScheduleModel>> response) {
        }

        @Override // com.huami.bluetooth.profile.channel.module.schedule.ScheduleCallback
        public void onSyncDataToDeviceResult(@NotNull Response<Boolean> response) {
        }
    };

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "Observer device schedule changed.";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/assistant/ui/v2/db/dao/ScheduleDao;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<ScheduleDao> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ScheduleDao invoke() {
            return ScheduleDataBase.INSTANCE.getInstance(DeviceDataObserverUseCase.this.context).scheduleDao();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ ScheduleStatus a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ScheduleStatus scheduleStatus) {
            super(0);
            this.a = scheduleStatus;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "device schedule change:" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.assistant.ui.v2.usecase.DeviceDataObserverUseCase$onDeviceScheduleChange$2", f = "DeviceDataObserverUseCase.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ ScheduleStatus b;
        public final /* synthetic */ DeviceDataObserverUseCase c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ com.huami.assistant.ui.v2.model.ScheduleModel a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(com.huami.assistant.ui.v2.model.ScheduleModel scheduleModel) {
                super(0);
                this.a = scheduleModel;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "onDeviceScheduleChange,delete remote schedule id:" + this.a.getId();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ScheduleStatus scheduleStatus, DeviceDataObserverUseCase deviceDataObserverUseCase, Continuation<? super d> continuation) {
            super(2, continuation);
            this.b = scheduleStatus;
            this.c = deviceDataObserverUseCase;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new d(this.b, this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if ((this.b.getStatus() & 255) == 2) {
                com.huami.assistant.ui.v2.model.ScheduleModel byId = this.c.a().getById(this.b.getId());
                if (byId != null) {
                    if (!byId.getSource().getIsUserSchedule()) {
                        byId = null;
                    }
                    if (byId != null) {
                        this.c.b().delete(byId.getId());
                        HMLog.info(DeviceDataObserverUseCase.e, new a(byId));
                    }
                }
                this.c.a().deleteById(this.b.getId());
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/assistant/ui/v2/datasource/imp/ScheduleRemoteDataSourceImp;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<ScheduleRemoteDataSourceImp> {
        public static final e a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ScheduleRemoteDataSourceImp invoke() {
            return new ScheduleRemoteDataSourceImp();
        }
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [com.huami.assistant.ui.v2.usecase.DeviceDataObserverUseCase$callback$1] */
    public DeviceDataObserverUseCase(@NotNull Context context) {
        this.context = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ScheduleDao a() {
        return (ScheduleDao) this.mScheduleDao.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ScheduleRemoteDataSourceImp b() {
        return (ScheduleRemoteDataSourceImp) this.remoteDataSource.getValue();
    }

    private final ScheduleRpcApi c() {
        return AssistantModule.getScheduleApi();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(ScheduleStatus item) {
        HMLog.info(e, new c(item));
        kotlinx.coroutines.e.f(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new d(item, this, null), 3, null);
    }

    public final void execute() {
        HMLog.info(e, a.a);
        ScheduleRpcApi scheduleRpcApiC = c();
        if (scheduleRpcApiC == null) {
            return;
        }
        scheduleRpcApiC.register(this.callback);
    }
}
