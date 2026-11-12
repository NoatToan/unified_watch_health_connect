package com.huami.feedback.domain;

import android.content.Context;
import com.huami.feedback.repo.DeviceRepository;
import com.huami.feedback.sync.api.DeviceLogSyncError;
import com.huami.feedback.sync.api.device.DeviceType;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.baseutil.FileUtils;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u001d\u0010\b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0086Bø\u0001\u0000¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\f\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000bR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Lcom/huami/feedback/domain/SyncDeviceLogUseCase;", "", "Lcom/huami/feedback/sync/api/DeviceLogSyncError;", "error", "", "a", "Lcom/huami/feedback/sync/api/device/DeviceType;", "deviceType", "invoke", "(Lcom/huami/feedback/sync/api/device/DeviceType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/content/Context;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/feedback/repo/DeviceRepository;", "b", "Lcom/huami/feedback/repo/DeviceRepository;", "deviceRepository", "Lkotlinx/coroutines/CoroutineDispatcher;", "c", "Lkotlinx/coroutines/CoroutineDispatcher;", "defaultDispatcher", "<init>", "(Landroid/content/Context;Lcom/huami/feedback/repo/DeviceRepository;Lkotlinx/coroutines/CoroutineDispatcher;)V", "feedback-impl_release"}, k = 1, mv = {1, 5, 1})
public final class SyncDeviceLogUseCase {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final DeviceRepository deviceRepository;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final CoroutineDispatcher defaultDispatcher;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.feedback.domain.SyncDeviceLogUseCase", f = "SyncDeviceLogUseCase.kt", i = {0}, l = {28}, m = "invoke", n = {"this"}, s = {"L$0"})
    public static final class a extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return SyncDeviceLogUseCase.this.invoke(null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/feedback/sync/api/DeviceLogSyncError;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.feedback.domain.SyncDeviceLogUseCase$invoke$error$1", f = "SyncDeviceLogUseCase.kt", i = {}, l = {29}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super DeviceLogSyncError>, Object> {
        public int a;
        public final /* synthetic */ DeviceType c;
        public final /* synthetic */ String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(DeviceType deviceType, String str, Continuation<? super b> continuation) {
            super(2, continuation);
            this.c = deviceType;
            this.d = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SyncDeviceLogUseCase.this.new b(this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super DeviceLogSyncError> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                DeviceRepository deviceRepository = SyncDeviceLogUseCase.this.deviceRepository;
                DeviceType deviceType = this.c;
                String str = this.d;
                this.a = 1;
                obj = deviceRepository.syncDeviceLog(deviceType, str, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    public SyncDeviceLogUseCase(@NotNull Context context, @NotNull DeviceRepository deviceRepository, @NotNull CoroutineDispatcher coroutineDispatcher) {
        this.context = context;
        this.deviceRepository = deviceRepository;
        this.defaultDispatcher = coroutineDispatcher;
    }

    private final boolean a(DeviceLogSyncError error) {
        return (error == null || error == DeviceLogSyncError.SYNC_SUCCESS || error == DeviceLogSyncError.ERROR_DATA_PACKAGE) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object invoke(@NotNull DeviceType deviceType, @NotNull Continuation<? super DeviceLogSyncError> continuation) throws Throwable {
        a aVar;
        SyncDeviceLogUseCase syncDeviceLogUseCase;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i = aVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.d = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object objWithContext = aVar.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = aVar.d;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            String logRootDir = FileUtils.getLogRootDir(this.context);
            CoroutineDispatcher coroutineDispatcher = this.defaultDispatcher;
            b bVar = new b(deviceType, logRootDir, null);
            aVar.a = this;
            aVar.d = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, bVar, aVar);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
            syncDeviceLogUseCase = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            syncDeviceLogUseCase = (SyncDeviceLogUseCase) aVar.a;
            ResultKt.throwOnFailure(objWithContext);
        }
        DeviceLogSyncError deviceLogSyncError = (DeviceLogSyncError) objWithContext;
        if (syncDeviceLogUseCase.a(deviceLogSyncError)) {
            return deviceLogSyncError;
        }
        return null;
    }

    public /* synthetic */ SyncDeviceLogUseCase(Context context, DeviceRepository deviceRepository, CoroutineDispatcher coroutineDispatcher, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, deviceRepository, (i & 4) != 0 ? Dispatchers.getIO() : coroutineDispatcher);
    }
}
