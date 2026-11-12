package com.xiaomi.fitness.eco.detail.util;

import android.content.Context;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.eco.detail.model.PowerDistribute;
import defpackage.b0o;
import defpackage.dki;
import defpackage.j1j;
import defpackage.x44;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J-\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/eco/detail/util/PowerUtil;", "", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "sportValues", "", "checkPowerDistributeValid", "(Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;)Z", "Landroid/content/Context;", "context", "sport", "", "Lb0o;", "createPowerDistributeModel", "(Landroid/content/Context;Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;Z)Ljava/util/List;", "Lcom/xiaomi/fitness/eco/detail/model/PowerDistribute;", "powerDistribute", "createDistributeModelList", "(Landroid/content/Context;Lcom/xiaomi/fitness/eco/detail/model/PowerDistribute;)Ljava/util/List;", "<init>", "()V", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class PowerUtil {

    @NotNull
    public static final PowerUtil INSTANCE = new PowerUtil();

    private PowerUtil() {
    }

    private final boolean checkPowerDistributeValid(SportBasicReport sportValues) {
        return (sportValues.getPowerActiveRecoveryDuration() == null || sportValues.getPowerEnduranceDuration() == null || sportValues.getPowerRhythmDuration() == null || sportValues.getPowerLactateThresholdDuration() == null || sportValues.getPowerMaxVo2Duration() == null || sportValues.getPowerAnaerobicDuration() == null || sportValues.getPowerExtremeDuration() == null) ? false : true;
    }

    public static /* synthetic */ List createPowerDistributeModel$default(PowerUtil powerUtil, Context context, SportBasicReport sportBasicReport, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return powerUtil.createPowerDistributeModel(context, sportBasicReport, z);
    }

    @NotNull
    public final List<b0o> createDistributeModelList(@NotNull Context context, @NotNull PowerDistribute powerDistribute) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(powerDistribute, "powerDistribute");
        LinkedList linkedList = new LinkedList();
        if (powerDistribute.getSumDuration() == 0) {
            return linkedList;
        }
        linkedList.add(new b0o(0, powerDistribute.getPowerActiveRecoveryDuration(), ResourceExtKt.getString(j1j.A2), powerDistribute.getRecoveryPer(), x44.a(dki.m1), 0));
        linkedList.add(new b0o(1, powerDistribute.getPowerEnduranceDuration(), ResourceExtKt.getString(j1j.s4), powerDistribute.getEndurancePer(), x44.a(dki.j1), 0));
        linkedList.add(new b0o(2, powerDistribute.getPowerRhythmDuration(), ResourceExtKt.getString(j1j.S6), powerDistribute.getRhythmPer(), x44.a(dki.n1), 0));
        linkedList.add(new b0o(3, powerDistribute.getPowerLactateThresholdDuration(), ResourceExtKt.getString(j1j.g5), powerDistribute.getThresholdbicPer(), x44.a(dki.o1), 0));
        linkedList.add(new b0o(4, powerDistribute.getPowerMaxVo2Duration(), ResourceExtKt.getString(j1j.D5), powerDistribute.getMaxVo2Per(), x44.a(dki.l1), 0));
        linkedList.add(new b0o(5, powerDistribute.getPowerAnaerobicDuration(), ResourceExtKt.getString(j1j.F2), powerDistribute.getAnaerobicPer(), x44.a(dki.i1), 0));
        linkedList.add(new b0o(6, powerDistribute.getPowerExtremeDuration(), ResourceExtKt.getString(j1j.l5), powerDistribute.getExtremePer(), x44.a(dki.k1), 0));
        return linkedList;
    }

    @NotNull
    public final List<b0o> createPowerDistributeModel(@NotNull Context context, @NotNull SportBasicReport sportValues, boolean sport) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sportValues, "sportValues");
        ArrayList arrayList = new ArrayList();
        if (!checkPowerDistributeValid(sportValues)) {
            return arrayList;
        }
        Integer powerActiveRecoveryDuration = sportValues.getPowerActiveRecoveryDuration();
        Intrinsics.checkNotNull(powerActiveRecoveryDuration);
        int iIntValue = powerActiveRecoveryDuration.intValue();
        Integer powerEnduranceDuration = sportValues.getPowerEnduranceDuration();
        Intrinsics.checkNotNull(powerEnduranceDuration);
        int iIntValue2 = powerEnduranceDuration.intValue();
        Integer powerRhythmDuration = sportValues.getPowerRhythmDuration();
        Intrinsics.checkNotNull(powerRhythmDuration);
        int iIntValue3 = powerRhythmDuration.intValue();
        Integer powerLactateThresholdDuration = sportValues.getPowerLactateThresholdDuration();
        Intrinsics.checkNotNull(powerLactateThresholdDuration);
        int iIntValue4 = powerLactateThresholdDuration.intValue();
        Integer powerMaxVo2Duration = sportValues.getPowerMaxVo2Duration();
        Intrinsics.checkNotNull(powerMaxVo2Duration);
        int iIntValue5 = powerMaxVo2Duration.intValue();
        Integer powerAnaerobicDuration = sportValues.getPowerAnaerobicDuration();
        Intrinsics.checkNotNull(powerAnaerobicDuration);
        int iIntValue6 = powerAnaerobicDuration.intValue();
        Integer powerExtremeDuration = sportValues.getPowerExtremeDuration();
        Intrinsics.checkNotNull(powerExtremeDuration);
        return createDistributeModelList(context, new PowerDistribute(iIntValue, iIntValue2, iIntValue3, iIntValue4, iIntValue5, iIntValue6, powerExtremeDuration.intValue()));
    }
}
