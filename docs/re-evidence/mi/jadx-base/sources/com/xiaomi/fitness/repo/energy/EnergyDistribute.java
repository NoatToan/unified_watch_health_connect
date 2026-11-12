package com.xiaomi.fitness.repo.energy;

import com.xiaomi.fit.fitness.export.data.item.EnergyItem;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\"\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bJ \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bJ5\u0010\u000b\u001a\u0004\u0018\u00010\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0002\u0010\u0010J\"\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002J$\u0010\u0012\u001a\u00020\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0014H\u0002¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/repo/energy/EnergyDistribute;", "", "<init>", "()V", "calcDuration", "", "", "list", "", "Lcom/xiaomi/fit/fitness/export/data/item/EnergyItem;", "calcHalfHourStateValue", "getRsiMmpValue", "", "numAct", "numStress", "numRecovery", "(Ljava/util/List;III)Ljava/lang/Float;", "calStateNum", "avgEnergyState", "states", "", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nEnergyDistribute.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EnergyDistribute.kt\ncom/xiaomi/fitness/repo/energy/EnergyDistribute\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,114:1\n1863#2,2:115\n1863#2,2:117\n*S KotlinDebug\n*F\n+ 1 EnergyDistribute.kt\ncom/xiaomi/fitness/repo/energy/EnergyDistribute\n*L\n82#1:115,2\n99#1:117,2\n*E\n"})
public final class EnergyDistribute {

    @NotNull
    public static final EnergyDistribute INSTANCE = new EnergyDistribute();

    private EnergyDistribute() {
    }

    private final float avgEnergyState(List<EnergyItem> list, Set<Integer> states) {
        Integer stateValue;
        int i = 0;
        int iIntValue = 0;
        for (EnergyItem energyItem : list) {
            if (CollectionsKt___CollectionsKt.contains(states, energyItem.getState()) && (stateValue = energyItem.getStateValue()) != null) {
                iIntValue += stateValue.intValue();
                i++;
            }
        }
        if (i > 0) {
            return (iIntValue * 1.0f) / i;
        }
        return 0.0f;
    }

    private final Map<Integer, Integer> calStateNum(List<EnergyItem> list) {
        Iterator<T> it = list.iterator();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (it.hasNext()) {
            Integer state = ((EnergyItem) it.next()).getState();
            if (state != null && state.intValue() == 1) {
                i++;
            } else if (state != null && state.intValue() == 2) {
                i3++;
            } else if (state != null && state.intValue() == 3) {
                i2++;
            }
        }
        return MapsKt__MapsKt.mutableMapOf(TuplesKt.to(1, Integer.valueOf(i)), TuplesKt.to(3, Integer.valueOf(i2)), TuplesKt.to(2, Integer.valueOf(i3)));
    }

    private final Float getRsiMmpValue(List<EnergyItem> list, int numAct, int numStress, int numRecovery) {
        float f = numStress + numAct + numRecovery;
        if (f >= 6.0f) {
            return (((float) numAct) * 1.0f) / f > 0.5f ? Float.valueOf(avgEnergyState(list, SetsKt__SetsJVMKt.setOf(1))) : Float.valueOf(avgEnergyState(list, SetsKt__SetsKt.setOf((Object[]) new Integer[]{2, 3})));
        }
        return null;
    }

    @NotNull
    public final Map<Integer, Integer> calcDuration(@NotNull List<EnergyItem> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        Iterator<EnergyItem> it = list.iterator();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (it.hasNext()) {
            Integer state = it.next().getState();
            int iIntValue = state != null ? state.intValue() : 0;
            if (iIntValue == 1) {
                i++;
            } else if (iIntValue == 2) {
                i3++;
            } else if (iIntValue == 3) {
                i2++;
            }
        }
        return MapsKt__MapsKt.mutableMapOf(TuplesKt.to(1, Integer.valueOf(i)), TuplesKt.to(3, Integer.valueOf(i2)), TuplesKt.to(2, Integer.valueOf(i3)));
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0078  */
    @NotNull
    public final Map<Integer, Integer> calcHalfHourStateValue(@NotNull List<EnergyItem> list) {
        int iFloatValue;
        int i;
        Intrinsics.checkNotNullParameter(list, "list");
        Map<Integer, Integer> mapCalStateNum = calStateNum(list);
        Integer num = mapCalStateNum.get(1);
        Intrinsics.checkNotNull(num);
        int iIntValue = num.intValue();
        Integer num2 = mapCalStateNum.get(2);
        Intrinsics.checkNotNull(num2);
        int iIntValue2 = num2.intValue();
        Integer num3 = mapCalStateNum.get(3);
        Intrinsics.checkNotNull(num3);
        int iIntValue3 = num3.intValue();
        float f = iIntValue + iIntValue2 + iIntValue3;
        int iFloatValue2 = 0;
        if (f < 6.0f) {
            iFloatValue = 0;
            i = 0;
        } else if ((iIntValue * 1.0f) / f > 0.5f) {
            Float rsiMmpValue = getRsiMmpValue(list, iIntValue, iIntValue2, iIntValue3);
            i = 0;
            iFloatValue2 = rsiMmpValue != null ? (int) rsiMmpValue.floatValue() : 0;
            iFloatValue = 0;
        } else {
            Float rsiMmpValue2 = getRsiMmpValue(list, iIntValue, iIntValue2, iIntValue3);
            if (rsiMmpValue2 != null) {
                iFloatValue = (int) rsiMmpValue2.floatValue();
                if (iFloatValue <= 0) {
                    i = iFloatValue;
                    iFloatValue = 0;
                } else {
                    i = 0;
                }
            } else {
                iFloatValue = 0;
                i = 0;
            }
        }
        return MapsKt__MapsKt.mutableMapOf(TuplesKt.to(1, Integer.valueOf(iFloatValue2)), TuplesKt.to(3, Integer.valueOf(iFloatValue)), TuplesKt.to(2, Integer.valueOf(i)));
    }
}
