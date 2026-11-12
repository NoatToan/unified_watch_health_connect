package cn.miao.health.bean;

/* JADX INFO: loaded from: classes.dex */
public class SportConsume extends SportBaseInfo {
    private Integer height;
    private Integer sex;
    private Double sportConsume;
    private Integer step = 0;
    private Double weight;

    public Integer getHeight() {
        return this.height;
    }

    public Integer getSex() {
        return this.sex;
    }

    public Double getSportConsume() {
        return this.sportConsume;
    }

    public Integer getStep() {
        return this.step;
    }

    public Double getWeight() {
        return this.weight;
    }

    public void setHeight(Integer num) {
        this.height = num;
    }

    public void setSex(Integer num) {
        this.sex = num;
    }

    public void setSportConsume(Double d) {
        this.sportConsume = d;
    }

    public void setStep(Integer num) {
        this.step = num;
    }

    public void setWeight(Double d) {
        this.weight = d;
    }
}
