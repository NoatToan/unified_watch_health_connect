package cn.miao.health.bean;

/* JADX INFO: loaded from: classes.dex */
public class BloodPressureInfo extends BaseInputInfo {
    private Integer age;
    private Integer diastolicPressure;
    private String measuringTime;
    private Integer sex;
    private Integer systolicPressure;

    public Integer getAge() {
        return this.age;
    }

    public Integer getDiastolicPressure() {
        return this.diastolicPressure;
    }

    public String getMeasuringTime() {
        return this.measuringTime;
    }

    public Integer getSex() {
        return this.sex;
    }

    public Integer getSystolicPressure() {
        return this.systolicPressure;
    }

    public void setAge(Integer num) {
        this.age = num;
    }

    public void setDiastolicPressure(Integer num) {
        this.diastolicPressure = num;
    }

    public void setMeasuringTime(String str) {
        this.measuringTime = str;
    }

    public void setSex(Integer num) {
        this.sex = num;
    }

    public void setSystolicPressure(Integer num) {
        this.systolicPressure = num;
    }
}
