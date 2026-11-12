package com.xiaomi.fitness.sleep.behavior.collection;

import com.xiaomi.fitness.cache.sp.PreferenceSupport;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.sleep.behavior.collection.SleepDataCollectController;
import com.xiaomi.fitness.sleep.trace.extensions.TraceInternalExtKt;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007J\u0006\u0010\u0010\u001a\u00020\u0011J\b\u0010\u0012\u001a\u00020\u000bH\u0002J\b\u0010\u0013\u001a\u00020\u000bH\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\u00020\u000fX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/sleep/behavior/collection/SleepDataCollectController;", "Lcom/xiaomi/fitness/cache/sp/PreferenceSupport;", "<init>", "()V", "mCollectionTaskManager", "Lcom/xiaomi/fitness/sleep/behavior/collection/ICollectionTaskManager;", "getMCollectionTaskManager", "()Lcom/xiaomi/fitness/sleep/behavior/collection/ICollectionTaskManager;", "mCollectionTaskManager$delegate", "Lkotlin/Lazy;", "handle", "", "state", "", "KEY_START_SLEEPING", "", "isMaybeSleeping", "", "startSleeping", "endSleeping", "spName", "getSpName", "()Ljava/lang/String;", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SleepDataCollectController extends PreferenceSupport {

    @NotNull
    private static final String KEY_START_SLEEPING = "sleeping";

    @NotNull
    public static final SleepDataCollectController INSTANCE = new SleepDataCollectController();

    /* JADX INFO: renamed from: mCollectionTaskManager$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy mCollectionTaskManager = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: xim
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SleepDataCollectController.mCollectionTaskManager_delegate$lambda$0();
        }
    });

    @NotNull
    private static final String spName = "health:sleep_collect_ctrl";

    private SleepDataCollectController() {
    }

    private final void endSleeping() {
        remove(KEY_START_SLEEPING);
    }

    private final ICollectionTaskManager getMCollectionTaskManager() {
        return (ICollectionTaskManager) mCollectionTaskManager.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ICollectionTaskManager mCollectionTaskManager_delegate$lambda$0() {
        return TraceInternalExtKt.getInstance(ICollectionTaskManager.INSTANCE);
    }

    private final void startSleeping() {
        putValue(KEY_START_SLEEPING, Boolean.TRUE);
    }

    @Override // com.xiaomi.fitness.cache.sp.PreferenceSupport
    @NotNull
    public String getSpName() {
        return spName;
    }

    public final void handle(int state) {
        if (state == 1) {
            if (isMaybeSleeping()) {
                getMCollectionTaskManager().interruptCollecting(ApplicationExtKt.getApplication(), 0);
                return;
            } else {
                getMCollectionTaskManager().cancelCollecting(ApplicationExtKt.getApplication(), 0);
                return;
            }
        }
        if (state == 2) {
            getMCollectionTaskManager().startCollecting(ApplicationExtKt.getApplication(), 0);
            return;
        }
        if (state == 3) {
            startSleeping();
            getMCollectionTaskManager().startCollecting(ApplicationExtKt.getApplication(), 0);
        } else {
            if (state == 4) {
                endSleeping();
                return;
            }
            throw new IllegalStateException("Unhandled sleep state: " + state);
        }
    }

    public final boolean isMaybeSleeping() {
        Object value = getValue(KEY_START_SLEEPING, Boolean.FALSE);
        Intrinsics.checkNotNull(value);
        return ((Boolean) value).booleanValue();
    }
}
