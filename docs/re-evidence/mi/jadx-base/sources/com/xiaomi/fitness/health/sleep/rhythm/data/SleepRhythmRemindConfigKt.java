package com.xiaomi.fitness.health.sleep.rhythm.data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0001¨\u0006\u0002"}, d2 = {"deepCopy", "Lcom/xiaomi/fitness/health/sleep/rhythm/data/SleepRhythmRemindConfig;", "health_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSleepRhythmRemindConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepRhythmRemindConfig.kt\ncom/xiaomi/fitness/health/sleep/rhythm/data/SleepRhythmRemindConfigKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,10:1\n1557#2:11\n1628#2,3:12\n*S KotlinDebug\n*F\n+ 1 SleepRhythmRemindConfig.kt\ncom/xiaomi/fitness/health/sleep/rhythm/data/SleepRhythmRemindConfigKt\n*L\n10#1:11\n10#1:12,3\n*E\n"})
public final class SleepRhythmRemindConfigKt {
    @NotNull
    public static final SleepRhythmRemindConfig deepCopy(@NotNull SleepRhythmRemindConfig sleepRhythmRemindConfig) {
        Intrinsics.checkNotNullParameter(sleepRhythmRemindConfig, "<this>");
        boolean zIsEnable = sleepRhythmRemindConfig.isEnable();
        int dayRemindCount = sleepRhythmRemindConfig.getDayRemindCount();
        List<Integer> remindTimes = sleepRhythmRemindConfig.getRemindTimes();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(remindTimes, 10));
        Iterator<T> it = remindTimes.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((Number) it.next()).intValue()));
        }
        return new SleepRhythmRemindConfig(zIsEnable, dayRemindCount, CollectionsKt___CollectionsKt.toList(arrayList));
    }
}
