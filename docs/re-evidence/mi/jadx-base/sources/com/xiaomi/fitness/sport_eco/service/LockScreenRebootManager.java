package com.xiaomi.fitness.sport_eco.service;

import com.xiaomi.fitness.sport_eco.service.LockScreenRebootManager;
import com.xiaomi.fitness.sport_eco.view.lockscreen.entity.LockScreenReceiver;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/service/LockScreenRebootManager;", "", "<init>", "()V", "lockScreenReceiver", "Lcom/xiaomi/fitness/sport_eco/view/lockscreen/entity/LockScreenReceiver;", "getLockScreenReceiver", "()Lcom/xiaomi/fitness/sport_eco/view/lockscreen/entity/LockScreenReceiver;", "lockScreenReceiver$delegate", "Lkotlin/Lazy;", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LockScreenRebootManager {

    /* JADX INFO: renamed from: lockScreenReceiver$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy lockScreenReceiver = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: foe
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return LockScreenRebootManager.lockScreenReceiver_delegate$lambda$0();
        }
    });

    private final LockScreenReceiver getLockScreenReceiver() {
        return (LockScreenReceiver) this.lockScreenReceiver.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LockScreenReceiver lockScreenReceiver_delegate$lambda$0() {
        return new LockScreenReceiver();
    }
}
