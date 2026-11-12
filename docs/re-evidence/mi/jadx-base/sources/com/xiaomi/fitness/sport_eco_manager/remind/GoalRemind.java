package com.xiaomi.fitness.sport_eco_manager.remind;

import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.sport_eco_manager_export.data.PhoneSportData;
import com.xiaomi.wearable.sport.GoalAchieved;
import defpackage.rvn;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0014\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cJ\u000e\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cJ\u0018\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J \u0010 \u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J \u0010\"\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J(\u0010$\u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010&\u001a\u00020\u0003H\u0016J\u0010\u0010'\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0006\u0010(\u001a\u00020\u001aR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u0015\u0010\rR\u001a\u0010\u0016\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u000f\"\u0004\b\u0018\u0010\u0011R\u000e\u0010%\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/xiaomi/fitness/sport_eco_manager/remind/GoalRemind;", "", "goalType", "", "sportGoalValue", "", DailyRecordKey.sportType, "trainingMode", "<init>", "(IFII)V", "getGoalType", "()I", "setGoalType", "(I)V", "getSportGoalValue", "()F", "setSportGoalValue", "(F)V", "getSportType", "setSportType", "getTrainingMode", "setTrainingMode", "remindDistance", "getRemindDistance", "setRemindDistance", "checkSportGoal", "", "sportData", "Lcom/xiaomi/fitness/sport_eco_manager_export/data/PhoneSportData;", "checkJumpSportGoal", "checkJumpGoalAchieved", "currentAchieved", "onJumpGoalAchieved", "percent", "checkGoalAchieved", "distance", "onGoalAchieved", "lastAchievedGoalPercent", "getNextGoal", "getCal", "onFinishSport", "sport-eco-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GoalRemind {
    private int goalType;
    private int lastAchievedGoalPercent;
    private float remindDistance;
    private float sportGoalValue;
    private int sportType;
    private int trainingMode;

    public GoalRemind() {
        this(0, 0.0f, 0, 0, 15, null);
    }

    private final void checkGoalAchieved(float currentAchieved, int distance, PhoneSportData sportData) {
        float f = (currentAchieved / this.sportGoalValue) * 100;
        int nextGoal = getNextGoal();
        if (f >= nextGoal) {
            onGoalAchieved(nextGoal, currentAchieved, distance, sportData);
            this.lastAchievedGoalPercent = nextGoal;
        }
    }

    private final void checkJumpGoalAchieved(float currentAchieved, PhoneSportData sportData) {
        FitnessLogUtils.d("GoalRemind", "checkJumpGoalAchieved currentAchieved = " + currentAchieved + "; sportGoalValue = " + this.sportGoalValue);
        float f = (float) 100;
        float f2 = (currentAchieved / this.sportGoalValue) * f;
        int nextGoal = getNextGoal();
        float f3 = (float) nextGoal;
        if (f2 >= f3) {
            if (this.goalType == 6) {
                sportData.jumpCount = (int) ((this.sportGoalValue * f3) / f);
            }
            onJumpGoalAchieved(nextGoal, currentAchieved, sportData);
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
        rvn.Y(AppUtil.getApp()).K0(goalAchieved);
    }

    private final void onJumpGoalAchieved(int percent, float currentAchieved, PhoneSportData sportData) {
        GoalAchieved goalAchieved = new GoalAchieved();
        goalAchieved.percent = percent;
        goalAchieved.goalType = this.goalType;
        goalAchieved.jumpCount = sportData.jumpCount;
        goalAchieved.achieved = currentAchieved;
        goalAchieved.total = this.sportGoalValue;
        goalAchieved.sportType = 14;
        int i = sportData.jumpDuration;
        goalAchieved.minute = i / 60;
        goalAchieved.second = i % 60;
        FitnessLogUtils.d("GoalRemind", "goal_achieved = " + goalAchieved);
        rvn.Y(AppUtil.getApp()).N0(goalAchieved);
    }

    public final void checkJumpSportGoal(@NotNull PhoneSportData sportData) {
        Intrinsics.checkNotNullParameter(sportData, "sportData");
        FitnessLogUtils.d("GoalRemind", "checkSportGoal sportData = " + sportData + "; goalType = " + this.goalType);
        int i = this.goalType;
        if (i == -1) {
            return;
        }
        if (i == 1) {
            float f = sportData.jumpDuration / 60;
            checkJumpGoalAchieved(f, sportData);
            a.n().A(this.goalType, this.lastAchievedGoalPercent, (int) ((f / this.sportGoalValue) * 100));
        } else if (i == 2) {
            float cal = getCal(sportData);
            checkJumpGoalAchieved(cal, sportData);
            a.n().A(this.goalType, this.lastAchievedGoalPercent, (int) ((cal / this.sportGoalValue) * 100));
        } else {
            if (i != 6) {
                return;
            }
            float f2 = sportData.jumpCount;
            checkJumpGoalAchieved(f2, sportData);
            a.n().A(this.goalType, this.lastAchievedGoalPercent, (int) ((f2 / this.sportGoalValue) * 100));
        }
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
            a.n().A(this.goalType, this.lastAchievedGoalPercent, (int) ((f / this.sportGoalValue) * 100));
            return;
        }
        if (i == 1) {
            float f2 = sportData.duration / 60;
            checkGoalAchieved(f2, sportData.distance, sportData);
            a.n().A(this.goalType, this.lastAchievedGoalPercent, (int) ((f2 / this.sportGoalValue) * 100));
        } else {
            if (i != 2) {
                return;
            }
            float cal = getCal(sportData);
            checkGoalAchieved(cal, sportData.distance, sportData);
            a.n().A(this.goalType, this.lastAchievedGoalPercent, (int) ((cal / this.sportGoalValue) * 100));
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

    public final int getTrainingMode() {
        return this.trainingMode;
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

    public final void setTrainingMode(int i) {
        this.trainingMode = i;
    }

    public GoalRemind(int i, float f, int i2, int i3) {
        this.goalType = i;
        this.sportGoalValue = f;
        this.sportType = i2;
        this.trainingMode = i3;
    }

    public /* synthetic */ GoalRemind(int i, float f, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? -1 : i, (i4 & 2) != 0 ? 0.0f : f, (i4 & 4) != 0 ? 0 : i2, (i4 & 8) != 0 ? -1 : i3);
    }
}
