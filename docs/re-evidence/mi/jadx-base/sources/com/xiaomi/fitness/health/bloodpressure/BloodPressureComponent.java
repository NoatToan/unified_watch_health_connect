package com.xiaomi.fitness.health.bloodpressure;

import com.xiaomi.fitness.baseui.utils.NotificationPermission;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.component.AppComponent;
import com.xiaomi.fitness.component.ComponentTask;
import com.xiaomi.fitness.health.bloodpressure.BloodPressureComponent;
import com.xiaomi.fitness.health.bloodpressure.remind.BloodPressurePoint;
import com.xiaomi.fitness.health.bloodpressure.repository.BloodPressurePreRepository;
import com.xiaomi.fitness.health.bloodpressure.repository.IBloodPressurePreRepository;
import dagger.hilt.android.EntryPointAccessors;
import defpackage.c0j;
import defpackage.j03;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\b\u0010\u0006\u001a\u00020\u0005H\u0007¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/fitness/health/bloodpressure/BloodPressureComponent;", "", "<init>", "()V", "asyncInit", "", "registerAlarmPermission", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AppComponent(namespace = "血压")
public final class BloodPressureComponent {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair registerAlarmPermission$lambda$0(IBloodPressurePreRepository bloodPressurePrefRepo) {
        Intrinsics.checkNotNullParameter(bloodPressurePrefRepo, "$bloodPressurePrefRepo");
        boolean zAreEqual = Intrinsics.areEqual(bloodPressurePrefRepo.getPrefValue(BloodPressurePreRepository.KEY_MEASURE_REMIND_ENABLE, Boolean.FALSE), Boolean.TRUE);
        Logger.i("addFuncName", "blood-pressure: " + zAreEqual);
        if (zAreEqual) {
            return new Pair(ResourceExtKt.getString(c0j.Y1), 1);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit registerAlarmPermission$lambda$1(IBloodPressurePreRepository bloodPressurePrefRepo, Boolean bool, Boolean bool2) {
        Intrinsics.checkNotNullParameter(bloodPressurePrefRepo, "$bloodPressurePrefRepo");
        Boolean bool3 = Boolean.FALSE;
        if (Intrinsics.areEqual(bool, bool3) || Intrinsics.areEqual(bool2, bool3)) {
            bloodPressurePrefRepo.setPreValue(BloodPressurePreRepository.KEY_MEASURE_REMIND_ENABLE, bool3);
        }
        return Unit.INSTANCE;
    }

    @ComponentTask(notEarlierThan = 11, onMainThread = false)
    public final void asyncInit() {
        j03.c(ApplicationExtKt.getApplication(), true);
        ((BloodPressurePoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), BloodPressurePoint.class)).getBloodPressureRemindBiz().startListener(ApplicationExtKt.getApplication());
    }

    @ComponentTask(notLaterThan = 3)
    public final void registerAlarmPermission() {
        final IBloodPressurePreRepository bloodPressurePrefRepo = ((BloodPressurePoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), BloodPressurePoint.class)).getBloodPressurePrefRepo();
        NotificationPermission notificationPermission = NotificationPermission.INSTANCE;
        notificationPermission.addFuncName(new Function0() { // from class: yy2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BloodPressureComponent.registerAlarmPermission$lambda$0(bloodPressurePrefRepo);
            }
        });
        notificationPermission.registerListener(new Function2() { // from class: zy2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return BloodPressureComponent.registerAlarmPermission$lambda$1(bloodPressurePrefRepo, (Boolean) obj, (Boolean) obj2);
            }
        });
    }
}
