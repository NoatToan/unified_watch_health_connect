package cn.miao.health.bean;

/* JADX INFO: loaded from: classes.dex */
public class HeartInfo extends BaseInputInfo {
    private Integer age;
    private Integer conventionHeartRate;
    private Integer heartRate;
    private Integer heartRateMax;
    private Integer heartRateMin;
    private Integer heartRateResting = 80;
    private String measureTime;
    private Integer sportHeartRate;

    public Integer getAge() {
        return this.age;
    }

    public Integer getConventionHeartRate() {
        return this.conventionHeartRate;
    }

    public Integer getHeartRate() {
        return this.heartRate;
    }

    public Integer getHeartRateMax() {
        return this.heartRateMax;
    }

    public Integer getHeartRateMin() {
        return this.heartRateMin;
    }

    public Integer getHeartRateResting() {
        return this.heartRateResting;
    }

    public String getMeasureTime() {
        return this.measureTime;
    }

    public Integer getSportHeartRate() {
        return this.sportHeartRate;
    }

    public void setAge(Integer num) {
        this.age = num;
    }

    public void setConventionHeartRate(Integer num) {
        this.conventionHeartRate = num;
    }

    public void setHeartRate(Integer num) {
        this.heartRate = num;
    }

    public void setHeartRateMax(Integer num) {
        this.heartRateMax = num;
    }

    public void setHeartRateMin(Integer num) {
        this.heartRateMin = num;
    }

    public void setHeartRateResting(Integer num) {
        this.heartRateResting = num;
    }

    public void setMeasureTime(String str) {
        this.measureTime = str;
    }

    public void setSportHeartRate(Integer num) {
        this.sportHeartRate = num;
    }
}
