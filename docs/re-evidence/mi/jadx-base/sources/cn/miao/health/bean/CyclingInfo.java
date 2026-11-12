package cn.miao.health.bean;

/* JADX INFO: loaded from: classes.dex */
public class CyclingInfo extends SportBaseInfo {
    private Integer pedalNum = 0;
    private Double weight;

    public Integer getPedalNum() {
        return this.pedalNum;
    }

    public Double getWeight() {
        return this.weight;
    }

    public void setPedalNum(Integer num) {
        this.pedalNum = num;
    }

    public void setWeight(Double d) {
        this.weight = d;
    }
}
