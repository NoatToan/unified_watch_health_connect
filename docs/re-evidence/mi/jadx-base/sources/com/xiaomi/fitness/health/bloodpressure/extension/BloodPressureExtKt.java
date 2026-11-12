package com.xiaomi.fitness.health.bloodpressure.extension;

import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.health.bloodpressure.extension.BloodPressureExtKt;
import com.xiaomi.fitness.health.bloodpressure.remind.BloodPressurePoint;
import com.xiaomi.fitness.health.bloodpressure.remind.BloodPressureRemindBiz;
import com.xiaomi.fitness.health.bloodpressure.repository.IBloodPressurePreRepository;
import dagger.hilt.android.EntryPointAccessors;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0002\u001a\u00020\u0006*\u00020\u0006\"\u001f\u0010\u0000\u001a\u00020\u0001*\u00020\u00018FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"instance", "Lcom/xiaomi/fitness/health/bloodpressure/repository/IBloodPressurePreRepository;", "getInstance", "(Lcom/xiaomi/fitness/health/bloodpressure/repository/IBloodPressurePreRepository;)Lcom/xiaomi/fitness/health/bloodpressure/repository/IBloodPressurePreRepository;", "instance$delegate", "Lkotlin/Lazy;", "Lcom/xiaomi/fitness/health/bloodpressure/remind/BloodPressureRemindBiz;", "health_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class BloodPressureExtKt {

    @NotNull
    private static final Lazy instance$delegate = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: rz2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return BloodPressureExtKt.instance_delegate$lambda$0();
        }
    });

    @NotNull
    public static final IBloodPressurePreRepository getInstance(@NotNull IBloodPressurePreRepository iBloodPressurePreRepository) {
        Intrinsics.checkNotNullParameter(iBloodPressurePreRepository, "<this>");
        return (IBloodPressurePreRepository) instance$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IBloodPressurePreRepository instance_delegate$lambda$0() {
        return ((BloodPressurePoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), BloodPressurePoint.class)).getBloodPressurePrefRepo();
    }

    @NotNull
    public static final BloodPressureRemindBiz getInstance(@NotNull BloodPressureRemindBiz bloodPressureRemindBiz) {
        Intrinsics.checkNotNullParameter(bloodPressureRemindBiz, "<this>");
        return ((BloodPressurePoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), BloodPressurePoint.class)).getBloodPressureRemindBiz();
    }
}
