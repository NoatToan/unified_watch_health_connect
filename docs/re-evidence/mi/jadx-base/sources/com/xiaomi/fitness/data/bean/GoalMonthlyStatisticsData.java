package com.xiaomi.fitness.data.bean;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0007HÆ\u0003J\t\u0010\"\u001a\u00020\u0007HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0007HÆ\u0003JE\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u0007HÆ\u0001J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020\u0007HÖ\u0001J\t\u0010*\u001a\u00020+HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001e\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0016\"\u0004\b\u001a\u0010\u0018R\u001e\u0010\t\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0012\"\u0004\b\u001c\u0010\u0014R\u001e\u0010\n\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0016\"\u0004\b\u001e\u0010\u0018¨\u0006,"}, d2 = {"Lcom/xiaomi/fitness/data/bean/GoalMonthlyStatisticsData;", "", "totalCalorie", "", "chickenleg", "", "calorieRankPercent", "", "totalStep", "stepKilometres", "stepRankPercent", "<init>", "(JFIIFI)V", "getTotalCalorie", "()J", "setTotalCalorie", "(J)V", "getChickenleg", "()F", "setChickenleg", "(F)V", "getCalorieRankPercent", "()I", "setCalorieRankPercent", "(I)V", "getTotalStep", "setTotalStep", "getStepKilometres", "setStepKilometres", "getStepRankPercent", "setStepRankPercent", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GoalMonthlyStatisticsData {

    @SerializedName("calorie_rank_percent")
    private int calorieRankPercent;

    @SerializedName("chickenleg")
    private float chickenleg;

    @SerializedName("step_kilometres")
    private float stepKilometres;

    @SerializedName("step_rank_percent")
    private int stepRankPercent;

    @SerializedName("total_calorie")
    private long totalCalorie;

    @SerializedName("total_step")
    private int totalStep;

    public GoalMonthlyStatisticsData(long j, float f, int i, int i2, float f2, int i3) {
        this.totalCalorie = j;
        this.chickenleg = f;
        this.calorieRankPercent = i;
        this.totalStep = i2;
        this.stepKilometres = f2;
        this.stepRankPercent = i3;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTotalCalorie() {
        return this.totalCalorie;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getChickenleg() {
        return this.chickenleg;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getCalorieRankPercent() {
        return this.calorieRankPercent;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getTotalStep() {
        return this.totalStep;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final float getStepKilometres() {
        return this.stepKilometres;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getStepRankPercent() {
        return this.stepRankPercent;
    }

    @NotNull
    public final GoalMonthlyStatisticsData copy(long totalCalorie, float chickenleg, int calorieRankPercent, int totalStep, float stepKilometres, int stepRankPercent) {
        return new GoalMonthlyStatisticsData(totalCalorie, chickenleg, calorieRankPercent, totalStep, stepKilometres, stepRankPercent);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GoalMonthlyStatisticsData)) {
            return false;
        }
        GoalMonthlyStatisticsData goalMonthlyStatisticsData = (GoalMonthlyStatisticsData) other;
        return this.totalCalorie == goalMonthlyStatisticsData.totalCalorie && Float.compare(this.chickenleg, goalMonthlyStatisticsData.chickenleg) == 0 && this.calorieRankPercent == goalMonthlyStatisticsData.calorieRankPercent && this.totalStep == goalMonthlyStatisticsData.totalStep && Float.compare(this.stepKilometres, goalMonthlyStatisticsData.stepKilometres) == 0 && this.stepRankPercent == goalMonthlyStatisticsData.stepRankPercent;
    }

    public final int getCalorieRankPercent() {
        return this.calorieRankPercent;
    }

    public final float getChickenleg() {
        return this.chickenleg;
    }

    public final float getStepKilometres() {
        return this.stepKilometres;
    }

    public final int getStepRankPercent() {
        return this.stepRankPercent;
    }

    public final long getTotalCalorie() {
        return this.totalCalorie;
    }

    public final int getTotalStep() {
        return this.totalStep;
    }

    public int hashCode() {
        return (((((((((Long.hashCode(this.totalCalorie) * 31) + Float.hashCode(this.chickenleg)) * 31) + Integer.hashCode(this.calorieRankPercent)) * 31) + Integer.hashCode(this.totalStep)) * 31) + Float.hashCode(this.stepKilometres)) * 31) + Integer.hashCode(this.stepRankPercent);
    }

    public final void setCalorieRankPercent(int i) {
        this.calorieRankPercent = i;
    }

    public final void setChickenleg(float f) {
        this.chickenleg = f;
    }

    public final void setStepKilometres(float f) {
        this.stepKilometres = f;
    }

    public final void setStepRankPercent(int i) {
        this.stepRankPercent = i;
    }

    public final void setTotalCalorie(long j) {
        this.totalCalorie = j;
    }

    public final void setTotalStep(int i) {
        this.totalStep = i;
    }

    @NotNull
    public String toString() {
        return "GoalMonthlyStatisticsData(totalCalorie=" + this.totalCalorie + ", chickenleg=" + this.chickenleg + ", calorieRankPercent=" + this.calorieRankPercent + ", totalStep=" + this.totalStep + ", stepKilometres=" + this.stepKilometres + ", stepRankPercent=" + this.stepRankPercent + ")";
    }
}
