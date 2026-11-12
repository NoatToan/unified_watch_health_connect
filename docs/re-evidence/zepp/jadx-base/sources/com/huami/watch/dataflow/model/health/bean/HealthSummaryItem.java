package com.huami.watch.dataflow.model.health.bean;

import com.facebook.appevents.UserDataStore;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.SerializedName;
import com.huami.watch.dataflow.model.DataSummaryItem;
import com.huami.watch.util.ArraysUtil;
import com.xiaomi.hm.health.Constant;
import com.xiaomi.hm.health.dataprocess.StepsInfo;
import com.xiaomi.hm.health.device.event.StatEvent;
import java.util.ArrayList;
import kotlin.text.Typography;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;

/* JADX INFO: loaded from: classes16.dex */
public class HealthSummaryItem extends DataSummaryItem {

    @SerializedName(AppMeasurementSdk.ConditionalUserProperty.ACTIVE)
    private int active;

    @SerializedName("calory_goal")
    private int caloryGoal;
    private ExtraData extraData;

    @SerializedName("floor_count")
    private int floorCount;

    @SerializedName(StatEvent.EventParams.TYPE_CARD_GOAL)
    private int goal;

    @SerializedName("slp")
    private Sleep sleep;

    @SerializedName(StepsInfo.KEY_STEP_INFO)
    private Step step;

    @SerializedName("v")
    private int version;

    public static class ExtraData {
        private int avgCalorie;
        private String calorieTip;
        private int totalCalorie;

        public int getAvgCalorie() {
            return this.avgCalorie;
        }

        public String getCalorieTip() {
            return this.calorieTip;
        }

        public int getTotalCalorie() {
            return this.totalCalorie;
        }

        public void setAvgCalorie(int i) {
            this.avgCalorie = i;
        }

        public void setCalorieTip(String str) {
            this.calorieTip = str;
        }

        public void setTotalCalorie(int i) {
            this.totalCalorie = i;
        }

        public String toString() {
            return "totalCalorie : " + this.totalCalorie + ", calorieTip : " + this.calorieTip + ", avgCalorie : " + this.avgCalorie;
        }
    }

    public static class Sleep {

        @SerializedName(StepsInfo.KEY_STEP_WALK_TIME)
        private int awakeTime;

        @SerializedName(Constant.PAI_KEY_DAILY_PAI)
        private int deepTime;

        @SerializedName("ed")
        private int endTime;

        @SerializedName("lt")
        private int shallowTime;

        @SerializedName(UserDataStore.STATE)
        private int startTime;

        public int getAwakeTime() {
            return this.awakeTime;
        }

        public int getDeepTime() {
            return this.deepTime;
        }

        public int getDuration() {
            return (this.deepTime + this.shallowTime) * 60;
        }

        public int getEndTime() {
            return this.endTime;
        }

        public int getShallowTime() {
            return this.shallowTime;
        }

        public int getStartTime() {
            return this.startTime;
        }

        public void setAwakeTime(int i) {
            this.awakeTime = i;
        }

        public void setDeepTime(int i) {
            this.deepTime = i;
        }

        public void setEndTime(int i) {
            this.endTime = i;
        }

        public void setShallowTime(int i) {
            this.shallowTime = i;
        }

        public void setStartTime(int i) {
            this.startTime = i;
        }

        public String toString() {
            return "startTime : " + this.startTime + ", endTime : " + this.endTime + ", deepTime : " + this.deepTime + ", shallowTime : " + this.shallowTime + ", awakeTime : " + this.awakeTime;
        }
    }

    public static class StageStep {

        @SerializedName("cal")
        private int calories;

        @SerializedName("dis")
        private int distance;

        @SerializedName("step")
        private int step;

        @SerializedName("time")
        private int time;

        public int getCalories() {
            return this.calories;
        }

        public int getDistance() {
            return this.distance;
        }

        public int getStep() {
            return this.step;
        }

        public int getTime() {
            return this.time;
        }

        public void setCalories(int i) {
            this.calories = i;
        }

        public void setDistance(int i) {
            this.distance = i;
        }

        public void setStep(int i) {
            this.step = i;
        }

        public void setTime(int i) {
            this.time = i;
        }

        public String toString() {
            return "time : " + this.time + ", step : " + this.step + ", calories : " + this.calories + ", distance : " + this.distance;
        }
    }

    public static class Step {

        @SerializedName("cal")
        private float calories;

        @SerializedName("dis")
        private int dis;

        @SerializedName(StepsInfo.KEY_STAGE)
        private ArrayList<StageStep> stageList;

        @SerializedName("ttl")
        private int total;

        public float getCalories() {
            return this.calories;
        }

        public int getDis() {
            return this.dis;
        }

        public ArrayList<StageStep> getStageList() {
            return this.stageList;
        }

        public int getTotal() {
            return this.total;
        }

        public void setCalories(float f) {
            this.calories = f;
        }

        public void setDis(int i) {
            this.dis = i;
        }

        public void setStageList(ArrayList<StageStep> arrayList) {
            this.stageList = arrayList;
        }

        public void setTotal(int i) {
            this.total = i;
        }

        public String toString() {
            return "<Total: " + this.total + ", Calories: " + this.calories + ", Dis: " + this.dis + ", StageList: " + ArraysUtil.toString(this.stageList) + Typography.greater;
        }
    }

    public int getActive() {
        return this.active;
    }

    public int getCaloryGoal() {
        return this.caloryGoal;
    }

    public ExtraData getExtraData() {
        return this.extraData;
    }

    public int getFloorCount() {
        return this.floorCount;
    }

    public int getGoal() {
        return this.goal;
    }

    public Sleep getSleep() {
        return this.sleep;
    }

    public Step getStep() {
        return this.step;
    }

    public int getVersion() {
        return this.version;
    }

    public void setActive(int i) {
        this.active = i;
    }

    public void setCaloryGoal(int i) {
        this.caloryGoal = this.caloryGoal;
    }

    public void setExtraData(ExtraData extraData) {
        this.extraData = extraData;
    }

    public void setFloorCount(int i) {
        this.floorCount = i;
    }

    public void setGoal(int i) {
        this.goal = i;
    }

    public void setSleep(Sleep sleep) {
        this.sleep = sleep;
    }

    public void setStep(Step step) {
        this.step = step;
    }

    public void setVersion(int i) {
        this.version = i;
    }

    public String toString() {
        return "\nHealthSummary<" + this.date + ", goal : " + this.goal + ", caloryGoal : " + this.caloryGoal + ", active : " + this.active + ", floor : " + this.floorCount + "\n\t\tStep" + this.step + "\n\t\tSleep<" + this.sleep + SearchCriteria.GT + "\n\t\tExtraData<" + this.extraData + SearchCriteria.GT + SearchCriteria.GT;
    }
}
