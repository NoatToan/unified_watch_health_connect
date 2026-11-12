package com.xiaomi.fitness.heartrate.export;

import com.xiaomi.fitness.heartrate.export.HeartrateExportExtKt;
import com.xiaomi.fitness.instance.InstanceExtKt;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\"!\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"instance", "Lcom/xiaomi/fitness/heartrate/export/HeartrateMeasurer;", "Lcom/xiaomi/fitness/heartrate/export/HeartrateMeasurer$Companion;", "getInstance", "(Lcom/xiaomi/fitness/heartrate/export/HeartrateMeasurer$Companion;)Lcom/xiaomi/fitness/heartrate/export/HeartrateMeasurer;", "instance$delegate", "Lkotlin/Lazy;", "heartrate-export_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class HeartrateExportExtKt {

    @NotNull
    private static final Lazy instance$delegate = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: c7c
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return HeartrateExportExtKt.instance_delegate$lambda$0();
        }
    });

    @Nullable
    public static final HeartrateMeasurer getInstance(@NotNull HeartrateMeasurer.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return (HeartrateMeasurer) instance$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HeartrateMeasurer instance_delegate$lambda$0() {
        return (HeartrateMeasurer) InstanceExtKt.getInstance(Reflection.getOrCreateKotlinClass(HeartrateMeasurer.class));
    }
}
