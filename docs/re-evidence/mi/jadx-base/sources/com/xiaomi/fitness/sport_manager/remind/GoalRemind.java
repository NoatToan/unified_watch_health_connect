package com.xiaomi.fitness.sport_manager.remind;

import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.sport_manager_export.data.PhoneSportData;
import com.xiaomi.wearable.sport.GoalAchieved;
import defpackage.ukf;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019J \u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J(\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010 \u001a\u00020\u0003H\u0016J\u0010\u0010!\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0006\u0010\"\u001a\u00020\u0017R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\fR\u001a\u0010\u0013\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000e\"\u0004\b\u0015\u0010\u0010R\u000e\u0010\u001f\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/xiaomi/fitness/sport_manager/remind/GoalRemind;", "", "goalType", "", "sportGoalValue", "", DailyRecordKey.sportType, "<init>", "(IFI)V", "getGoalType", "()I", "setGoalType", "(I)V", "getSportGoalValue", "()F", "setSportGoalValue", "(F)V", "getSportType", "setSportType", "remindDistance", "getRemindDistance", "setRemindDistance", "checkSportGoal", "", "sportData", "Lcom/xiaomi/fitness/sport_manager_export/data/PhoneSportData;", "checkGoalAchieved", "currentAchieved", "distance", "onGoalAchieved", "percent", "lastAchievedGoalPercent", "getNextGoal", "getCal", "onFinishSport", "sport-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GoalRemind {
    private int goalType;
    private int lastAchievedGoalPercent;
    private float remindDistance;
    private float sportGoalValue;
    private int sportType;

    public GoalRemind() {
        this(0, 0.0f, 0, 7, null);
    }

    private final void checkGoalAchieved(float currentAchieved, int distance, PhoneSportData sportData) {
        float f = (currentAchieved / this.sportGoalValue) * 100;
        int nextGoal = getNextGoal();
        if (f >= nextGoal) {
            onGoalAchieved(nextGoal, currentAchieved, distance, sportData);
            this.lastAchievedGoalPercent = nextGoal;
        }
    }

    private final void onGoalAchieved(int percent, float currentAchieved, int distance, PhoneSportData sportData) {
        GoalAchieved goalAchieved = new GoalAchieved();
        goalAchieved.percent = percent;
        int i = this.goalType;
        goalAchieved.goalType = i;
        goalAchieved.distance = distance;
        if (i == 1) {
            goalAchieved.achieved = this.remindDistance;
        } else {
            goalAchieved.achieved = currentAchieved;
        }
        goalAchieved.total = this.sportGoalValue;
        int i2 = this.sportType;
        if (i2 == 3 || i2 == 1) {
            goalAchieved.sportType = 1;
        } else if (i2 == 7 || i2 == 6) {
            goalAchieved.sportType = 6;
        } else if (i2 == 2) {
            goalAchieved.sportType = 2;
        } else {
            goalAchieved.sportType = 1;
        }
        int i3 = sportData.duration;
        goalAchieved.minute = i3 / 60;
        goalAchieved.second = i3 % 60;
        FitnessLogUtils.d("GoalRemind", "goal_achieved = " + goalAchieved);
        ukf.U(AppUtil.getApp()).G0(goalAchieved);
    }

    public final void checkSportGoal(@NotNull PhoneSportData sportData) {
        Intrinsics.checkNotNullParameter(sportData, "sportData");
        int i = this.goalType;
        if (i == -1) {
            return;
        }
        if (i == 0) {
            int i2 = sportData.distance;
            float f = i2 / 1000.0f;
            checkGoalAchieved(f, i2, sportData);
            a.v().I(this.goalType, this.lastAchievedGoalPercent, (int) ((f / this.sportGoalValue) * 100));
            return;
        }
        if (i == 1) {
            float f2 = sportData.duration / 60;
            checkGoalAchieved(f2, sportData.distance, sportData);
            a.v().I(this.goalType, this.lastAchievedGoalPercent, (int) ((f2 / this.sportGoalValue) * 100));
        } else {
            if (i != 2) {
                return;
            }
            float cal = getCal(sportData);
            checkGoalAchieved(cal, sportData.distance, sportData);
            a.v().I(this.goalType, this.lastAchievedGoalPercent, (int) ((cal / this.sportGoalValue) * 100));
        }
    }

    public int getCal(@NotNull PhoneSportData sportData) {
        Intrinsics.checkNotNullParameter(sportData, "sportData");
        return Math.abs((int) (sportData.calorie / 1000));
    }

    public final int getGoalType() {
        return this.goalType;
    }

    public int getNextGoal() {
        int i = this.lastAchievedGoalPercent;
        if (i == 0) {
            return 30;
        }
        if (i == 30) {
            return 50;
        }
        if (i == 50) {
            return 80;
        }
        if (i == 80) {
            return 90;
        }
        if (i == 90) {
            return 100;
        }
        if (i != 100) {
            return i + 50;
        }
        return 150;
    }

    public final float getRemindDistance() {
        return this.remindDistance;
    }

    public final float getSportGoalValue() {
        return this.sportGoalValue;
    }

    public final int getSportType() {
        return this.sportType;
    }

    public final void onFinishSport() {
        this.lastAchievedGoalPercent = 0;
    }

    public final void setGoalType(int i) {
        this.goalType = i;
    }

    public final void setRemindDistance(float f) {
        this.remindDistance = f;
    }

    public final void setSportGoalValue(float f) {
        this.sportGoalValue = f;
    }

    public final void setSportType(int i) {
        this.sportType = i;
    }

    public GoalRemind(int i, float f, int i2) {
        this.goalType = i;
        this.sportGoalValue = f;
        this.sportType = i2;
    }

    public /* synthetic */ GoalRemind(int i, float f, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? -1 : i, (i3 & 2) != 0 ? 0.0f : f, (i3 & 4) != 0 ? 0 : i2);
    }
}
