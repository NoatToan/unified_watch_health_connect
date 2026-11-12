package com.xiaomi.fitness.habit.constants;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/habit/constants/HabitConstant;", "", "<init>", "()V", "BASE_HOST", "", "HEALTH_PATH", "HEALTH_HOST", "habit_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HabitConstant {

    @NotNull
    public static final String BASE_HOST = "watch.iot.mi.com";

    @NotNull
    public static final String HEALTH_HOST = "https://watch.iot.mi.com/";

    @NotNull
    public static final String HEALTH_PATH = "cgi-op/api/v1/miwear/";

    @NotNull
    public static final HabitConstant INSTANCE = new HabitConstant();

    private HabitConstant() {
    }
}
