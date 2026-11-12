package com.xiaomi.hm.health.di.koin.spo2;

import android.content.Context;
import androidx.annotation.MainThread;
import androidx.annotation.WorkerThread;
import com.huami.account.utils.PolicyTipUtil;
import com.huami.bloodoxygen.bluetooth.sync.Spo2DeviceApi;
import com.huami.bloodoxygen.bluetooth.usecase.other.BloodOxygenBleLifecycleUseCase;
import com.huami.bloodoxygen.core.koin.BloodOxygenKoinScopeKt;
import com.huami.bloodoxygen.core.koin.BoSleepInfo;
import com.huami.bloodoxygen.core.local.config.BloodOxygenCoroutineScope;
import com.huami.bloodoxygen.core.usecase.odi.ProduceOdiUseCase;
import com.huami.bloodoxygen.core.usecase.other.BloodOxygenLifecycleUseCase;
import com.huami.bloodoxygen.core.usecase.other.ClearAllUserDataUseCase;
import com.huami.bloodoxygen.core.usecase.other.UploadBloodOxygenEventsUseCase;
import com.huami.bloodoxygen.service.odi.SleepBreathScore;
import com.huami.bloodoxygen.service.osaevent.DifficultBreath;
import com.huami.bloodoxygen.ui.base.BloodOxygenDetailActivity;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.sleep.usercase.GetSleepTimeUseCase;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.e;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\"\u0010#J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0004\u001a\u00020\u0002H\u0007J\b\u0010\u0006\u001a\u00020\u0005H\u0007J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0007J\t\u0010\n\u001a\u00020\u0005H\u0096\u0001J\t\u0010\u000b\u001a\u00020\u0005H\u0096\u0001J\t\u0010\f\u001a\u00020\u0005H\u0096\u0001J\u0011\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0096\u0001J\u0006\u0010\u0010\u001a\u00020\u0002J\"\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011J\u000e\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0014J,\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00150\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\b\b\u0002\u0010\u0019\u001a\u00020\u0011J\u000e\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001cR\u0016\u0010!\u001a\u00020\u00078\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006$"}, d2 = {"Lcom/xiaomi/hm/health/di/koin/spo2/Spo2Proxy;", "Lcom/huami/bloodoxygen/bluetooth/sync/Spo2DeviceApi;", "", PointCategory.LOAD, "unLoad", "", "uploadData", "", "date", "produceOdi", "isOsaEnable", "supportOsa", "supportSpo2", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "device", "syncFromDevice", "clearData", "", "from", "to", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/huami/bloodoxygen/service/odi/SleepBreathScore;", "getSleepBreathScoreListFlow", "getLatestSleepBreathScoreFlow", "splitIntervalTimeMillis", "Lcom/huami/bloodoxygen/service/osaevent/DifficultBreath;", "getDifficultBreathListFlow", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "navigateToDetailActivity", "b", "Ljava/lang/String;", "TAG", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class Spo2Proxy implements Spo2DeviceApi {

    @NotNull
    public static final Spo2Proxy INSTANCE = new Spo2Proxy();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final String TAG = "Spo2Proxy";
    private final /* synthetic */ Spo2DeviceApi a = (Spo2DeviceApi) BloodOxygenKoinScopeKt.getBloodOxygenKoinScope().get(Reflection.getOrCreateKotlinClass(Spo2DeviceApi.class), null, null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.di.koin.spo2.Spo2Proxy$clearData$1", f = "Spo2Proxy.kt", i = {}, l = {56}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ClearAllUserDataUseCase clearAllUserDataUseCase = (ClearAllUserDataUseCase) BloodOxygenKoinScopeKt.getBloodOxygenKoinScope().get(Reflection.getOrCreateKotlinClass(ClearAllUserDataUseCase.class), null, null);
                this.a = 1;
                if (clearAllUserDataUseCase.execute(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "produceOdiUseCase is null";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "sleep time pair is null";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ Throwable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Throwable th) {
            super(0);
            this.a = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "uploadData error " + this.a.getMessage();
        }
    }

    private Spo2Proxy() {
    }

    public static /* synthetic */ Flow getDifficultBreathListFlow$default(Spo2Proxy spo2Proxy, long j, long j2, long j3, int i, Object obj) {
        if ((i & 4) != 0) {
            j3 = 3600000;
        }
        return spo2Proxy.getDifficultBreathListFlow(j, j2, j3);
    }

    @JvmStatic
    @MainThread
    public static final void load() {
        if (PolicyTipUtil.isNeedIntercept()) {
            return;
        }
        unLoad();
        ((BloodOxygenLifecycleUseCase) BloodOxygenKoinScopeKt.getBloodOxygenKoinScope().get(Reflection.getOrCreateKotlinClass(BloodOxygenLifecycleUseCase.class), null, null)).load();
        ((BloodOxygenBleLifecycleUseCase) BloodOxygenKoinScopeKt.getBloodOxygenKoinScope().get(Reflection.getOrCreateKotlinClass(BloodOxygenBleLifecycleUseCase.class), null, null)).load();
        MigrateHelper.INSTANCE.migrateDataNotUploaded();
    }

    @JvmStatic
    public static final void produceOdi(@NotNull String date) {
        ProduceOdiUseCase produceOdiUseCase = (ProduceOdiUseCase) BloodOxygenKoinScopeKt.getBloodOxygenKoinScope().getOrNull(Reflection.getOrCreateKotlinClass(ProduceOdiUseCase.class), null, null);
        if (produceOdiUseCase == null) {
            HMLog.info(TAG, b.a);
            return;
        }
        Pair<Long, Long> pairExecute = new GetSleepTimeUseCase().execute(date);
        if (pairExecute == null) {
            HMLog.info(TAG, c.a);
        } else {
            produceOdiUseCase.execute(new BoSleepInfo(date, pairExecute.getFirst().longValue(), pairExecute.getSecond().longValue(), new ArrayList()));
        }
    }

    @JvmStatic
    public static final void unLoad() {
        ((BloodOxygenLifecycleUseCase) BloodOxygenKoinScopeKt.getBloodOxygenKoinScope().get(Reflection.getOrCreateKotlinClass(BloodOxygenLifecycleUseCase.class), null, null)).unLoad();
        BloodOxygenKoinScopeKt.getBloodOxygenKoinScope().close();
    }

    @JvmStatic
    @WorkerThread
    public static final boolean uploadData() {
        Object objM3845constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(Boolean.valueOf(((UploadBloodOxygenEventsUseCase) BloodOxygenKoinScopeKt.getBloodOxygenKoinScope().get(Reflection.getOrCreateKotlinClass(UploadBloodOxygenEventsUseCase.class), null, null)).execute() && MigrateHelper.INSTANCE.uploadDataNotMigrated()));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            HMLog.info(TAG, new d(thM3848exceptionOrNullimpl));
        }
        Boolean bool = Boolean.FALSE;
        if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
            objM3845constructorimpl = bool;
        }
        return ((Boolean) objM3845constructorimpl).booleanValue();
    }

    public final void clearData() {
        e.f((CoroutineScope) BloodOxygenKoinScopeKt.getBloodOxygenKoinScope().get(Reflection.getOrCreateKotlinClass(BloodOxygenCoroutineScope.class), null, null), null, null, new a(null), 3, null);
    }

    @NotNull
    public final Flow<List<DifficultBreath>> getDifficultBreathListFlow(long from, long to, long splitIntervalTimeMillis) {
        return Spo2ModuleKt.getSpo2Service().getDifficultBreathListFlow(from, to, splitIntervalTimeMillis);
    }

    @NotNull
    public final Flow<SleepBreathScore> getLatestSleepBreathScoreFlow() {
        return Spo2ModuleKt.getSpo2Service().getLatestSleepBreathScoreFlow();
    }

    @NotNull
    public final Flow<List<SleepBreathScore>> getSleepBreathScoreListFlow(long from, long to) {
        return Spo2ModuleKt.getSpo2Service().getSleepBreathScoreListFlow(from, to);
    }

    @Override // com.huami.bloodoxygen.bluetooth.sync.Spo2DeviceApi
    public boolean isOsaEnable() {
        return this.a.isOsaEnable();
    }

    public final void navigateToDetailActivity(@NotNull Context context) {
        BloodOxygenDetailActivity.INSTANCE.launch(context);
    }

    @Override // com.huami.bloodoxygen.bluetooth.sync.Spo2DeviceApi
    public boolean supportOsa() {
        return this.a.supportOsa();
    }

    @Override // com.huami.bloodoxygen.bluetooth.sync.Spo2DeviceApi
    public boolean supportSpo2() {
        return this.a.supportSpo2();
    }

    @Override // com.huami.bloodoxygen.bluetooth.sync.Spo2DeviceApi
    public void syncFromDevice(@NotNull HMBaseDevice device) {
        this.a.syncFromDevice(device);
    }
}
