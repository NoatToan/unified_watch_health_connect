package com.xiaomi.fitness.health.sleep.interfere.utils;

import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.health.sleep.interfere.utils.TaskInfoUtils;
import com.xiaomi.fitness.util.ExtUtilKt;
import defpackage.c0j;
import defpackage.qxi;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00072\u0006\u0010\u000e\u001a\u00020\u0006J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u0006R3\u0010\u0004\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00070\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/interfere/utils/TaskInfoUtils;", "", "<init>", "()V", "taskInfoMap", "", "", "Lkotlin/Pair;", "", "getTaskInfoMap", "()Ljava/util/Map;", "taskInfoMap$delegate", "Lkotlin/Lazy;", "getTaskTitleAndDescByType", "type", "isAutoCompleteTask", "", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TaskInfoUtils {

    @NotNull
    public static final TaskInfoUtils INSTANCE = new TaskInfoUtils();

    /* JADX INFO: renamed from: taskInfoMap$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy taskInfoMap = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: p1p
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TaskInfoUtils.taskInfoMap_delegate$lambda$0();
        }
    });

    private TaskInfoUtils() {
    }

    private final Map<String, Pair<Integer, Integer>> getTaskInfoMap() {
        return (Map) taskInfoMap.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map taskInfoMap_delegate$lambda$0() {
        return MapsKt__MapsKt.mapOf(TuplesKt.to("TIMELY_SLEEP", new Pair(Integer.valueOf(c0j.Jg), Integer.valueOf(c0j.Ig))), TuplesKt.to("TIMELY_WAKE_UP", new Pair(Integer.valueOf(c0j.Gg), Integer.valueOf(c0j.Fg))), TuplesKt.to("LIMIT_NAPS", new Pair(Integer.valueOf(c0j.Hg), Integer.valueOf(qxi.F0))), TuplesKt.to("BREATH_RELAX", new Pair(Integer.valueOf(c0j.Dg), Integer.valueOf(c0j.Cg))), TuplesKt.to("EXERCISE_30MIN", new Pair(Integer.valueOf(qxi.I0), Integer.valueOf(c0j.Qg))), TuplesKt.to("SUNLIGHT_EXPOSURE", new Pair(Integer.valueOf(c0j.Pg), Integer.valueOf(c0j.Kg))), TuplesKt.to("NO_SCREENS_30MIN", new Pair(Integer.valueOf(c0j.Pg), Integer.valueOf(qxi.G0))), TuplesKt.to("NO_CAFFEINE_AFTER_5PM", new Pair(Integer.valueOf(c0j.Pg), Integer.valueOf(qxi.H0))), TuplesKt.to("VITAMIN_C_INTAKE", new Pair(Integer.valueOf(c0j.Pg), Integer.valueOf(c0j.Lg))), TuplesKt.to("DRINK_MILK", new Pair(Integer.valueOf(c0j.Pg), Integer.valueOf(c0j.Mg))), TuplesKt.to("EAT_NUTS", new Pair(Integer.valueOf(c0j.Pg), Integer.valueOf(c0j.Ng))), TuplesKt.to("MAGNESIUM_FOODS", new Pair(Integer.valueOf(c0j.Pg), Integer.valueOf(c0j.Og))));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Nullable
    public final Pair<String, String> getTaskTitleAndDescByType(@NotNull String type) {
        Intrinsics.checkNotNullParameter(type, "type");
        Pair<Integer, Integer> pair = getTaskInfoMap().get(type);
        if (pair == null) {
            return null;
        }
        switch (type.hashCode()) {
            case -1875889185:
                if (type.equals("NO_SCREENS_30MIN")) {
                    return new Pair<>(ExtUtilKt.getString(pair.getFirst().intValue()), ResourceExtKt.getQuantityString(ApplicationExtKt.getApplication(), pair.getSecond().intValue(), 30, 30));
                }
                break;
            case -1234640614:
                if (type.equals("LIMIT_NAPS")) {
                    return new Pair<>(ExtUtilKt.getString(pair.getFirst().intValue()), ResourceExtKt.getQuantityString(ApplicationExtKt.getApplication(), pair.getSecond().intValue(), 1, 1));
                }
                break;
            case -1190326681:
                if (type.equals("NO_CAFFEINE_AFTER_5PM")) {
                    return new Pair<>(ExtUtilKt.getString(pair.getFirst().intValue()), ResourceExtKt.getQuantityString(ApplicationExtKt.getApplication(), pair.getSecond().intValue(), 17, 17));
                }
                break;
            case 1841446286:
                if (type.equals("EXERCISE_30MIN")) {
                    return new Pair<>(ResourceExtKt.getQuantityString(ApplicationExtKt.getApplication(), pair.getFirst().intValue(), 30, 30), ExtUtilKt.getString(pair.getSecond().intValue()));
                }
                break;
        }
        return new Pair<>(ExtUtilKt.getString(pair.getFirst().intValue()), ExtUtilKt.getString(pair.getSecond().intValue()));
    }

    public final boolean isAutoCompleteTask(@NotNull String type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return Intrinsics.areEqual(type, "LIMIT_NAPS") || Intrinsics.areEqual(type, "EXERCISE_30MIN");
    }
}
