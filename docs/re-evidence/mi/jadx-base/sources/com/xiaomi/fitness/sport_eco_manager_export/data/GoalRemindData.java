package com.xiaomi.fitness.sport_eco_manager_export.data;

import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0011\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u0015\u0010\r¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/sport_eco_manager_export/data/GoalRemindData;", "Ljava/io/Serializable;", "goalType", "", "sportGoalValue", "", DailyRecordKey.sportType, "trainingMode", "<init>", "(IFII)V", "getGoalType", "()I", "setGoalType", "(I)V", "getSportGoalValue", "()F", "setSportGoalValue", "(F)V", "getSportType", "setSportType", "getTrainingMode", "setTrainingMode", "sport-eco-manager-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GoalRemindData implements Serializable {
    private int goalType;
    private float sportGoalValue;
    private int sportType;
    private int trainingMode;

    public GoalRemindData() {
        this(0, 0.0f, 0, 0, 15, null);
    }

    public final int getGoalType() {
        return this.goalType;
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

    public final void setGoalType(int i) {
        this.goalType = i;
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

    public GoalRemindData(int i, float f, int i2, int i3) {
        this.goalType = i;
        this.sportGoalValue = f;
        this.sportType = i2;
        this.trainingMode = i3;
    }

    public /* synthetic */ GoalRemindData(int i, float f, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? -1 : i, (i4 & 2) != 0 ? 0.0f : f, (i4 & 4) != 0 ? 0 : i2, (i4 & 8) != 0 ? -1 : i3);
    }
}
