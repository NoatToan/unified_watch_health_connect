package com.xiaomi.fitness.sleep.trace.extensions;

import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.sleep.behavior.collection.ICollectionTaskManager;
import com.xiaomi.fitness.sleep.trace.SleepTracerInternal;
import com.xiaomi.fitness.sleep.trace.extensions.TraceInternalExtKt;
import dagger.hilt.android.EntryPointAccessors;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u001f\u0010\u0000\u001a\u00020\u0001*\u00020\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u001f\u0010\u0000\u001a\u00020\u0007*\u00020\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u0003\u0010\t¨\u0006\u000b"}, d2 = {"instance", "Lcom/xiaomi/fitness/sleep/trace/SleepTracerInternal;", "Lcom/xiaomi/fitness/sleep/trace/SleepTracerInternal$Companion;", "getInstance", "(Lcom/xiaomi/fitness/sleep/trace/SleepTracerInternal$Companion;)Lcom/xiaomi/fitness/sleep/trace/SleepTracerInternal;", "instance$delegate", "Lkotlin/Lazy;", "Lcom/xiaomi/fitness/sleep/behavior/collection/ICollectionTaskManager;", "Lcom/xiaomi/fitness/sleep/behavior/collection/ICollectionTaskManager$Companion;", "(Lcom/xiaomi/fitness/sleep/behavior/collection/ICollectionTaskManager$Companion;)Lcom/xiaomi/fitness/sleep/behavior/collection/ICollectionTaskManager;", "instance$delegate$1", "sleep-trace_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class TraceInternalExtKt {

    @NotNull
    private static final Lazy instance$delegate = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: jkp
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TraceInternalExtKt.instance_delegate$lambda$0();
        }
    });

    @NotNull
    private static final Lazy instance$delegate$1 = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: kkp
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TraceInternalExtKt.instance_delegate$lambda$1();
        }
    });

    @NotNull
    public static final SleepTracerInternal getInstance(@NotNull SleepTracerInternal.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return (SleepTracerInternal) instance$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SleepTracerInternal instance_delegate$lambda$0() {
        return ((SleepTracerPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), SleepTracerPoint.class)).getSleepTracerInternal();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ICollectionTaskManager instance_delegate$lambda$1() {
        return ((SleepTracerPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), SleepTracerPoint.class)).getCollectTaskManager();
    }

    @NotNull
    public static final ICollectionTaskManager getInstance(@NotNull ICollectionTaskManager.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return (ICollectionTaskManager) instance$delegate$1.getValue();
    }
}
