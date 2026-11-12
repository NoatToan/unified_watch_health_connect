package com.xiaomi.fitness.settingitem.settingitem;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fitness.common.log.Logger;
import java.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
public class CurseSetting {
    public static final int DEFAULT_CYCLE_DAYS = 28;
    public static final int DEFAULT_MENS_DAYS = 5;
    private static final String TAG = "CurseSetting";

    @SerializedName("id")
    @Expose
    private String id;

    @SerializedName("lastMenstrualTime")
    @Expose
    private long lastMenstrualTime;

    @SerializedName("userId")
    @Expose
    private String userId;

    @SerializedName("appBeforeMenstruationPush")
    @Expose
    private int appBeforeMenstruationPush = 3;

    @SerializedName("appBeforeOvulationPush")
    @Expose
    private int appBeforeOvulationPush = 1;

    @SerializedName("appBeforePregnancyPush")
    @Expose
    private int appBeforePregnancyPush = 1;

    @SerializedName("appPush")
    @Expose
    private boolean appPush = false;

    @SerializedName("estimatedMenstrualDays")
    @Expose
    private int estimatedMenstrualDays = 5;

    @SerializedName("firstTime")
    @Expose
    private int firstTime = 0;

    @SerializedName("hardwareBeforeMenstruationPush")
    @Expose
    private int hardwareBeforeMenstruationPush = 3;

    @SerializedName("hardwareBeforeOvulationPush")
    @Expose
    private int hardwareBeforeOvulationPush = 1;

    @SerializedName("hardwareBeforePregnancyPush")
    @Expose
    private int hardwareBeforePregnancyPush = 1;

    @SerializedName("hardwarePush")
    @Expose
    private boolean hardwarePush = false;

    @SerializedName("intelligentPrediction")
    @Expose
    private int intelligentPrediction = 0;

    @SerializedName("algoIntelligentPrediction")
    @Expose
    private int algoIntelligentPrediction = 0;

    @SerializedName("menstrualCycle")
    @Expose
    private int menstrualCycle = 28;

    public void enableAlgoPredict(boolean z) {
        this.algoIntelligentPrediction = z ? 1 : 0;
    }

    public void enablePredict(boolean z) {
        Logger.i(TAG, "enablePredict enable=" + z);
        this.intelligentPrediction = z ? 1 : 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CurseSetting curseSetting = (CurseSetting) obj;
        return this.appBeforeMenstruationPush == curseSetting.appBeforeMenstruationPush && this.appBeforeOvulationPush == curseSetting.appBeforeOvulationPush && this.appPush == curseSetting.appPush && this.estimatedMenstrualDays == curseSetting.estimatedMenstrualDays && this.firstTime == curseSetting.firstTime && this.hardwareBeforeMenstruationPush == curseSetting.hardwareBeforeMenstruationPush && this.hardwareBeforeOvulationPush == curseSetting.hardwareBeforeOvulationPush && this.hardwarePush == curseSetting.hardwarePush && this.intelligentPrediction == curseSetting.intelligentPrediction && this.algoIntelligentPrediction == curseSetting.algoIntelligentPrediction && this.lastMenstrualTime == curseSetting.lastMenstrualTime && this.menstrualCycle == curseSetting.menstrualCycle && Objects.equals(this.id, curseSetting.id) && Objects.equals(this.userId, curseSetting.userId);
    }

    public int getAlgoIntelligentPrediction() {
        return this.algoIntelligentPrediction;
    }

    public int getAppBeforeMenstruationPush() {
        if (!isFirst()) {
            return this.appBeforeMenstruationPush;
        }
        int i = this.appBeforeMenstruationPush;
        if (i <= 0) {
            return 3;
        }
        return i;
    }

    public int getAppBeforeOvulationPush() {
        if (!isFirst()) {
            return this.appBeforeOvulationPush;
        }
        int i = this.appBeforeOvulationPush;
        if (i <= 0) {
            return 1;
        }
        return i;
    }

    public int getAppBeforePregnancyPush() {
        if (!isFirst()) {
            return this.appBeforePregnancyPush;
        }
        int i = this.appBeforePregnancyPush;
        if (i <= 0) {
            return 1;
        }
        return i;
    }

    public int getEstimatedMenstrualDays() {
        int i = this.estimatedMenstrualDays;
        if (i <= 0) {
            return 5;
        }
        return i;
    }

    public int getFirstTime() {
        return this.firstTime;
    }

    public int getHardwareBeforeMenstruationPush() {
        if (!isFirst()) {
            return this.hardwareBeforeMenstruationPush;
        }
        int i = this.hardwareBeforeMenstruationPush;
        if (i <= 0) {
            return 3;
        }
        return i;
    }

    public int getHardwareBeforeOvulationPush() {
        if (!isFirst()) {
            return this.hardwareBeforeOvulationPush;
        }
        int i = this.hardwareBeforeOvulationPush;
        if (i <= 0) {
            return 1;
        }
        return i;
    }

    public int getHardwareBeforePregnancyPush() {
        if (!isFirst()) {
            return this.hardwareBeforePregnancyPush;
        }
        int i = this.hardwareBeforePregnancyPush;
        if (i <= 0) {
            return 1;
        }
        return i;
    }

    public String getId() {
        return this.id;
    }

    public int getIntelligentPrediction() {
        return this.intelligentPrediction;
    }

    public long getLastMenstrualTime() {
        long j = this.lastMenstrualTime;
        if (j <= 0) {
            return 0L;
        }
        return FitnessDateUtils.changeToDestZeroTimeOneDay(j / 1000, 0, FitnessDateUtils.getCurrentTZOffsetInSec()) * 1000;
    }

    public int getMenstrualCycle() {
        return this.menstrualCycle;
    }

    public String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.appBeforeMenstruationPush), Integer.valueOf(this.appBeforeOvulationPush), Boolean.valueOf(this.appPush), Integer.valueOf(this.estimatedMenstrualDays), Integer.valueOf(this.firstTime), Integer.valueOf(this.hardwareBeforeMenstruationPush), Integer.valueOf(this.hardwareBeforeOvulationPush), Boolean.valueOf(this.hardwarePush), this.id, Integer.valueOf(this.intelligentPrediction), Integer.valueOf(this.algoIntelligentPrediction), Long.valueOf(this.lastMenstrualTime), Integer.valueOf(this.menstrualCycle), this.userId);
    }

    public boolean isAlgoPredictEnable() {
        return this.algoIntelligentPrediction != 0;
    }

    public boolean isAppPush() {
        return this.appPush;
    }

    public boolean isFirst() {
        return getLastMenstrualTime() == 0;
    }

    public boolean isHardwarePush() {
        return this.hardwarePush;
    }

    public boolean isPredictEnable() {
        boolean z = this.intelligentPrediction != 0;
        Logger.i(TAG, "isPredictEnable enable=" + z);
        return z;
    }

    public void setAlgoIntelligentPrediction(int i) {
        this.algoIntelligentPrediction = i;
    }

    public void setAppBeforeMenstruationPush(int i) {
        this.appBeforeMenstruationPush = i;
    }

    public void setAppBeforeOvulationPush(int i) {
        this.appBeforeOvulationPush = i;
    }

    public void setAppBeforePregnancyPush(int i) {
        this.appBeforePregnancyPush = i;
    }

    public void setAppPush(boolean z) {
        this.appPush = z;
    }

    public void setEstimatedMenstrualDays(int i) {
        this.estimatedMenstrualDays = i;
    }

    public void setFirst(boolean z) {
        this.firstTime = !z ? 1 : 0;
    }

    public void setFirstTime(int i) {
        this.firstTime = i;
    }

    public void setHardwareBeforeMenstruationPush(int i) {
        this.hardwareBeforeMenstruationPush = i;
    }

    public void setHardwareBeforeOvulationPush(int i) {
        this.hardwareBeforeOvulationPush = i;
    }

    public void setHardwareBeforePregnancyPush(int i) {
        this.hardwareBeforePregnancyPush = i;
    }

    public void setHardwarePush(boolean z) {
        this.hardwarePush = z;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setIntelligentPrediction(int i) {
        this.intelligentPrediction = i;
    }

    public void setLastMenstrualTime(long j) {
        Logger.d(TAG, "setLastMenstrualTime: " + j);
        this.lastMenstrualTime = FitnessDateUtils.changeToDestZeroTimeOneDay(j / 1000, FitnessDateUtils.getCurrentTZOffsetInSec(), 0) * 1000;
    }

    public void setMenstrualCycle(int i) {
        this.menstrualCycle = i;
    }

    public void setUserId(String str) {
        this.userId = str;
    }

    public String toString() {
        return "CurseSetting{appBeforeMenstruationPush=" + this.appBeforeMenstruationPush + ", appBeforeOvulationPush=" + this.appBeforeOvulationPush + ", appBeforePregnancyPush=" + this.appBeforePregnancyPush + ", appPush=" + this.appPush + ", estimatedMenstrualDays=" + this.estimatedMenstrualDays + ", firstTime=" + this.firstTime + ", hardwareBeforeMenstruationPush=" + this.hardwareBeforeMenstruationPush + ", hardwareBeforeOvulationPush=" + this.hardwareBeforeOvulationPush + ", hardwareBeforePregnancyPush=" + this.hardwareBeforePregnancyPush + ", hardwarePush=" + this.hardwarePush + ", intelligentPrediction=" + this.intelligentPrediction + ", algoIntelligentPrediction=" + this.algoIntelligentPrediction + ", lastMenstrualTime=" + this.lastMenstrualTime + ", menstrualCycle=" + this.menstrualCycle + "}@" + hashCode();
    }
}
