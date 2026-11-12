package cn.miao.health.bean;

/* JADX INFO: loaded from: classes.dex */
public class MenstrualInfo extends BaseInputInfo {
    private Integer avgCycleDays;
    private Integer avgMenstrualDays;
    private String endTime;
    private Integer menstrualDays;
    private String startTime;

    public Integer getAvgCycleDays() {
        return this.avgCycleDays;
    }

    public Integer getAvgMenstrualDays() {
        return this.avgMenstrualDays;
    }

    public String getEndTime() {
        return this.endTime;
    }

    public Integer getMenstrualDays() {
        return this.menstrualDays;
    }

    public String getStartTime() {
        return this.startTime;
    }

    public void setAvgCycleDays(Integer num) {
        this.avgCycleDays = num;
    }

    public void setAvgMenstrualDays(Integer num) {
        this.avgMenstrualDays = num;
    }

    public void setEndTime(String str) {
        this.endTime = str;
    }

    public void setMenstrualDays(Integer num) {
        this.menstrualDays = num;
    }

    public void setStartTime(String str) {
        this.startTime = str;
    }
}
