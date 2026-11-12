package com.xiaomi.fitness.health.export;

import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.health.export.HealthPageExtKt;
import dagger.hilt.android.EntryPointAccessors;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n\"\u001f\u0010\u0000\u001a\u00020\u0001*\u00020\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u000e\u0010\u000b\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"instance", "Lcom/xiaomi/fitness/health/export/IHealthPage;", "Lcom/xiaomi/fitness/health/export/IHealthPage$Companion;", "getInstance", "(Lcom/xiaomi/fitness/health/export/IHealthPage$Companion;)Lcom/xiaomi/fitness/health/export/IHealthPage;", "instance$delegate", "Lkotlin/Lazy;", "curseActionValid", "", "action", "", "COMMON_CALENDAR_CALENDAR_ACTIVITY", "", HealthPageExtKt.WEAR_WEIGHT_STATUS_MESSAGE, "health-export_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class HealthPageExtKt {

    @NotNull
    public static final String COMMON_CALENDAR_CALENDAR_ACTIVITY = "/common/calendar/CalendarActivity";

    @NotNull
    public static final String WEAR_WEIGHT_STATUS_MESSAGE = "WEAR_WEIGHT_STATUS_MESSAGE";

    @NotNull
    private static final Lazy instance$delegate = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: q0c
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return HealthPageExtKt.instance_delegate$lambda$0();
        }
    });

    public static final boolean curseActionValid(int i) {
        return i == 1 || i == 2 || i == 3;
    }

    @NotNull
    public static final IHealthPage getInstance(@NotNull IHealthPage.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return (IHealthPage) instance$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IHealthPage instance_delegate$lambda$0() {
        return ((HealthPagePoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HealthPagePoint.class)).getHealthPage();
    }
}
