package com.huami.device.feature.health.device;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\"'\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00010\u00008F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"", "Lcom/huami/device/feature/health/device/HealthFunc;", "a", "Lkotlin/Lazy;", "getAllFuncList", "()Ljava/util/List;", "allFuncList", "health-base_release"}, k = 2, mv = {1, 5, 1})
public final class HealthFuncKt {

    @NotNull
    private static final Lazy a = LazyKt__LazyJVMKt.lazy(a.a);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00010\u0000H\n"}, d2 = {"", "Lcom/huami/device/feature/health/device/HealthFunc;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<List<HealthFunc<?>>> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final List<HealthFunc<?>> invoke() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(HealthFunc.HR_MODE.INSTANCE);
            arrayList.add(HealthFunc.ATRIAL.INSTANCE);
            arrayList.add(HealthFunc.ATRIAL_ALERT_SLEEP_NOT_DISTURB.INSTANCE);
            arrayList.add(HealthFunc.HIGH_HR_ALERT.INSTANCE);
            arrayList.add(HealthFunc.HR_INTERVAL.INSTANCE);
            arrayList.add(HealthFunc.LOW_HR_ALERT.INSTANCE);
            arrayList.add(HealthFunc.LOW_SPO2_ALERT.INSTANCE);
            arrayList.add(HealthFunc.OSA.INSTANCE);
            arrayList.add(HealthFunc.PRESSURE_ALERT.INSTANCE);
            arrayList.add(HealthFunc.PRESSURE.INSTANCE);
            arrayList.add(HealthFunc.REM.INSTANCE);
            arrayList.add(HealthFunc.SMART_SPO2.INSTANCE);
            arrayList.add(HealthFunc.SPORT_HR.INSTANCE);
            arrayList.add(HealthFunc.BLOOD_PRESSURE.INSTANCE);
            arrayList.add(HealthFunc.SLEEPING_BLOOD_PRESSURE_MONITOR.INSTANCE);
            return arrayList;
        }
    }

    @NotNull
    public static final List<HealthFunc<?>> getAllFuncList() {
        return (List) a.getValue();
    }
}
