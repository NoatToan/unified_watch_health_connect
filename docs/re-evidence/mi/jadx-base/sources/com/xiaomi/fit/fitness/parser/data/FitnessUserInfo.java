package com.xiaomi.fit.fitness.parser.data;

import com.xiaomi.fit.data.common.data.annotation.UserGender;
import com.xiaomi.fitness.user.info.export.MedicalIdSPContract;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u00109\u001a\u00020\u0013H\u0016R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u0018\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0019\u0010\u0007\"\u0004\b\u001a\u0010\tR\u001e\u0010\u001b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u001c\u0010\u0007\"\u0004\b\u001d\u0010\tR\u001e\u0010\u001e\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u001f\u0010\u0007\"\u0004\b \u0010\tR\u001e\u0010!\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\"\u0010\u0007\"\u0004\b#\u0010\tR\u001e\u0010$\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b%\u0010\u0007\"\u0004\b&\u0010\tR\u001e\u0010'\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b(\u0010\u0007\"\u0004\b)\u0010\tR\u001e\u0010*\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b+\u0010\u0007\"\u0004\b,\u0010\tR\u001e\u0010-\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b.\u0010\u000e\"\u0004\b/\u0010\u0010R\u001e\u00100\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b1\u0010\u0007\"\u0004\b2\u0010\tR\u001e\u00103\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b4\u0010\u0007\"\u0004\b5\u0010\tR\u001e\u00106\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b7\u0010\u0007\"\u0004\b8\u0010\t¨\u0006:"}, d2 = {"Lcom/xiaomi/fit/fitness/parser/data/FitnessUserInfo;", "", "<init>", "()V", "height", "", "getHeight", "()Ljava/lang/Integer;", "setHeight", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "weight", "", "getWeight", "()Ljava/lang/Float;", "setWeight", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", MedicalIdSPContract.PREF_BIRTHDAY, "", "getBirth", "()Ljava/lang/String;", "setBirth", "(Ljava/lang/String;)V", "gender", "getGender", "setGender", "vo2Max", "getVo2Max", "setVo2Max", "maxHr", "getMaxHr", "setMaxHr", "historyMaxHr", "getHistoryMaxHr", "setHistoryMaxHr", "historyMinHr", "getHistoryMinHr", "setHistoryMinHr", "goalCal", "getGoalCal", "setGoalCal", "goalStep", "getGoalStep", "setGoalStep", "maximalMet", "getMaximalMet", "setMaximalMet", "goalStand", "getGoalStand", "setGoalStand", "goalSleep", "getGoalSleep", "setGoalSleep", "goalMhs", "getGoalMhs", "setGoalMhs", "toString", "fitness-parser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FitnessUserInfo {

    @Nullable
    private String birth;

    @UserGender
    @Nullable
    private Integer gender;

    @Nullable
    private Integer goalCal;

    @Nullable
    private Integer goalMhs;

    @Nullable
    private Integer goalSleep;

    @Nullable
    private Integer goalStand;

    @Nullable
    private Integer goalStep;

    @Nullable
    private Integer height;

    @Nullable
    private Integer historyMaxHr;

    @Nullable
    private Integer historyMinHr;

    @Nullable
    private Integer maxHr;

    @Nullable
    private Float maximalMet;

    @Nullable
    private Integer vo2Max;

    @Nullable
    private Float weight;

    @Nullable
    public final String getBirth() {
        return this.birth;
    }

    @Nullable
    public final Integer getGender() {
        return this.gender;
    }

    @Nullable
    public final Integer getGoalCal() {
        return this.goalCal;
    }

    @Nullable
    public final Integer getGoalMhs() {
        return this.goalMhs;
    }

    @Nullable
    public final Integer getGoalSleep() {
        return this.goalSleep;
    }

    @Nullable
    public final Integer getGoalStand() {
        return this.goalStand;
    }

    @Nullable
    public final Integer getGoalStep() {
        return this.goalStep;
    }

    @Nullable
    public final Integer getHeight() {
        return this.height;
    }

    @Nullable
    public final Integer getHistoryMaxHr() {
        return this.historyMaxHr;
    }

    @Nullable
    public final Integer getHistoryMinHr() {
        return this.historyMinHr;
    }

    @Nullable
    public final Integer getMaxHr() {
        return this.maxHr;
    }

    @Nullable
    public final Float getMaximalMet() {
        return this.maximalMet;
    }

    @Nullable
    public final Integer getVo2Max() {
        return this.vo2Max;
    }

    @Nullable
    public final Float getWeight() {
        return this.weight;
    }

    public final void setBirth(@Nullable String str) {
        this.birth = str;
    }

    public final void setGender(@Nullable Integer num) {
        this.gender = num;
    }

    public final void setGoalCal(@Nullable Integer num) {
        this.goalCal = num;
    }

    public final void setGoalMhs(@Nullable Integer num) {
        this.goalMhs = num;
    }

    public final void setGoalSleep(@Nullable Integer num) {
        this.goalSleep = num;
    }

    public final void setGoalStand(@Nullable Integer num) {
        this.goalStand = num;
    }

    public final void setGoalStep(@Nullable Integer num) {
        this.goalStep = num;
    }

    public final void setHeight(@Nullable Integer num) {
        this.height = num;
    }

    public final void setHistoryMaxHr(@Nullable Integer num) {
        this.historyMaxHr = num;
    }

    public final void setHistoryMinHr(@Nullable Integer num) {
        this.historyMinHr = num;
    }

    public final void setMaxHr(@Nullable Integer num) {
        this.maxHr = num;
    }

    public final void setMaximalMet(@Nullable Float f) {
        this.maximalMet = f;
    }

    public final void setVo2Max(@Nullable Integer num) {
        this.vo2Max = num;
    }

    public final void setWeight(@Nullable Float f) {
        this.weight = f;
    }

    @NotNull
    public String toString() {
        return "height = " + this.height + ", weight = " + this.weight + ", birth = " + this.birth + ", gender = " + this.gender + ", vo2Max = " + this.vo2Max + ", maxHr = " + this.maxHr + ", historyMaxHr = " + this.historyMaxHr + ", historyMinHr = " + this.historyMinHr + ", goalCal = " + this.goalCal + ", goalStep = " + this.goalStep + ", maximalMet= " + this.maximalMet + ", goalStand = " + this.goalStand + ", goalSleep = " + this.goalSleep + ", goalMhs = " + this.goalMhs;
    }
}
