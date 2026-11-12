package com.xiaomi.fitness.devicesettings.bluttooth.sleepmodel;

import com.xiaomi.fitness.devicesettings.bluttooth.sleepmodel.SleepModelHelperImpl;
import com.xiaomi.fitness.devicesettings.export.SleepModelHelper;
import defpackage.q14;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\t\u0010\nJ+\u0010\u0007\u001a\u00020\u00052\u001a\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/sleepmodel/SleepModelHelperImpl;", "Lcom/xiaomi/fitness/devicesettings/export/SleepModelHelper;", "Lkotlin/Function2;", "", "Lq14;", "", "callback", "getSleepModelTime", "(Lkotlin/jvm/functions/Function2;)V", "<init>", "()V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SleepModelHelperImpl implements SleepModelHelper {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getSleepModelTime$lambda$0(Function2 callback, int i, q14 q14Var) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        callback.invoke(Integer.valueOf(i), q14Var);
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.devicesettings.export.SleepModelHelper
    public void getSleepModelTime(@NotNull final Function2<? super Integer, ? super q14, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        SleepModelManager.INSTANCE.loadSleepModelData(new Function2() { // from class: jqm
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return SleepModelHelperImpl.getSleepModelTime$lambda$0(callback, ((Integer) obj).intValue(), (q14) obj2);
            }
        });
    }
}
