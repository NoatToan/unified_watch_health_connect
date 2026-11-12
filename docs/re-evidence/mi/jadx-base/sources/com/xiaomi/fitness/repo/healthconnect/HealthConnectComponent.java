package com.xiaomi.fitness.repo.healthconnect;

import com.xiaomi.fitness.access.export.AccessManager;
import com.xiaomi.fitness.access.export.AccessManagerExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.component.AppComponent;
import com.xiaomi.fitness.component.ComponentTask;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import com.xiaomi.fitness.net.extensions.ScopeExtKt;
import com.xiaomi.fitness.repo.healthconnect.utils.HealthConnectDBTriggerUtils;
import com.xiaomi.fitness.repo.healthconnect.utils.HealthConnectSyncUtils;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/fitness/repo/healthconnect/HealthConnectComponent;", "", "<init>", "()V", "checkAndStartSync", "", "Companion", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AppComponent(namespace = "health_connect")
public final class HealthConnectComponent {

    @NotNull
    private static final String TAG = "HealthConnectComponent";

    /* JADX INFO: renamed from: com.xiaomi.fitness.repo.healthconnect.HealthConnectComponent$checkAndStartSync$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.repo.healthconnect.HealthConnectComponent$checkAndStartSync$1", f = "HealthConnectComponent.kt", i = {}, l = {38}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    RegionManager.Companion companion = RegionManager.INSTANCE;
                    boolean zIsInland = RegionExtKt.isInland(RegionExtKt.getInstance(companion));
                    boolean zIsHealthConnectInstalled = AccessManagerExtKt.getInstance(AccessManager.INSTANCE).isHealthConnectInstalled(ApplicationExtKt.getApplication());
                    Logger.i(HealthConnectComponent.TAG, "init hc info:" + zIsInland + " - " + RegionExtKt.getInstance(companion).getCurrentRegion() + " - " + zIsHealthConnectInstalled);
                    if (zIsInland || !zIsHealthConnectInstalled) {
                        Logger.i(HealthConnectComponent.TAG, "main land do not use health connect!!");
                    } else {
                        HealthConnectDBTriggerUtils healthConnectDBTriggerUtils = HealthConnectDBTriggerUtils.INSTANCE;
                        this.label = 1;
                        if (healthConnectDBTriggerUtils.updateTriggersIfNeeded(this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                HealthConnectSyncUtils healthConnectSyncUtils = HealthConnectSyncUtils.INSTANCE;
                healthConnectSyncUtils.syncDailyRecords(CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"step", "hr", "spo2", "calorie", "sleep"}));
                healthConnectSyncUtils.syncReport();
                HealthConnectDataSyncedReceiver.INSTANCE.register();
            } catch (Exception e) {
                Logger.e(HealthConnectComponent.TAG, "init hc during device process start " + e.getMessage(), e);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @ComponentTask(notLaterThan = 4, processName = ":device")
    public final void checkAndStartSync() {
        Logger.d(TAG, "health connect checkAndStartSync ");
        ScopeExtKt.scope(Dispatchers.getIO(), new AnonymousClass1(null));
    }
}
