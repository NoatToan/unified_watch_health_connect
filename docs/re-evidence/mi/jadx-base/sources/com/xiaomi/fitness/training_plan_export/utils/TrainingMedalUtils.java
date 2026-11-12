package com.xiaomi.fitness.training_plan_export.utils;

import defpackage.joi;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/training_plan_export/utils/TrainingMedalUtils;", "", "<init>", "()V", "calcHabitMedalIcon", "", "finishTimes", "calcAbilityIcon", "training-plan-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TrainingMedalUtils {

    @NotNull
    public static final TrainingMedalUtils INSTANCE = new TrainingMedalUtils();

    private TrainingMedalUtils() {
    }

    public final int calcAbilityIcon(int finishTimes) {
        if (finishTimes >= 30) {
            return joi.f;
        }
        if (finishTimes >= 10) {
            return joi.e;
        }
        if (finishTimes >= 5) {
            return joi.d;
        }
        if (finishTimes >= 1) {
            return joi.c;
        }
        return -1;
    }

    public final int calcHabitMedalIcon(int finishTimes) {
        if (finishTimes >= 30) {
            return joi.n;
        }
        return finishTimes >= 10 ? joi.m : joi.l;
    }
}
