package cn.miao.health.bean;

/* JADX INFO: loaded from: classes.dex */
public class ManualInputInfo extends BaseInputInfo {
    private Double distance;
    private Double duration;
    private Integer height;
    private Integer sex;
    private SportType sportType;
    private Double velocity;
    private Double weight;

    public enum SportType {
        WALK,
        RUN,
        CLIMB,
        CYCLING,
        BREASTSTROKE,
        BACKSTROKE,
        FREESTYLE,
        BUTTERFLYSTROKE,
        MEDLEYSTROKE,
        FREELANCE
    }

    public Double getDistance() {
        return this.distance;
    }

    public Double getDuration() {
        return this.duration;
    }

    public Integer getHeight() {
        return this.height;
    }

    public Integer getSex() {
        return this.sex;
    }

    public SportType getSportType() {
        return this.sportType;
    }

    public Double getVelocity() {
        return this.velocity;
    }

    public Double getWeight() {
        return this.weight;
    }

    public void setDistance(Double d) {
        this.distance = d;
    }

    public void setDuration(Double d) {
        this.duration = d;
    }

    public void setHeight(Integer num) {
        this.height = num;
    }

    public void setSex(Integer num) {
        this.sex = num;
    }

    public void setSportType(SportType sportType) {
        this.sportType = sportType;
    }

    public void setVelocity(Double d) {
        this.velocity = d;
    }

    public void setWeight(Double d) {
        this.weight = d;
    }
}
