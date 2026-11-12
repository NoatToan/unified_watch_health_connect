package cn.miao.health.bean;

/* JADX INFO: loaded from: classes.dex */
public class MiaoHealthBaseSportInfo extends MiaoHealthBaseInfo {
    private Double calories;
    private Double distance;
    private Integer frequency;
    private AnalyzeInfo intensionEvaluation;
    private Double speed;
    private AnalyzeInfo sportConsumeEvaluation;
    private SportType sportType = SportType.UNKNOW;
    private AnalyzeInfo stepEvaluation;
    private Double stride;

    public enum SportType {
        UNKNOW,
        WALK,
        RUN,
        CLIMB,
        CYCLING
    }

    public Double getCalories() {
        return this.calories;
    }

    public Double getDistance() {
        return this.distance;
    }

    public Integer getFrequency() {
        return this.frequency;
    }

    public AnalyzeInfo getIntensionEvaluation() {
        return this.intensionEvaluation;
    }

    public Double getSpeed() {
        return this.speed;
    }

    public AnalyzeInfo getSportConsumeEvaluation() {
        return this.sportConsumeEvaluation;
    }

    public SportType getSportType() {
        return this.sportType;
    }

    public AnalyzeInfo getStepEvaluation() {
        return this.stepEvaluation;
    }

    public Double getStride() {
        return this.stride;
    }

    public void setCalories(Double d) {
        this.calories = d;
    }

    public void setDistance(Double d) {
        this.distance = d;
    }

    public void setFrequency(Integer num) {
        this.frequency = num;
    }

    public void setIntensionEvaluation(AnalyzeInfo analyzeInfo) {
        this.intensionEvaluation = analyzeInfo;
    }

    public void setSpeed(Double d) {
        this.speed = d;
    }

    public void setSportConsumeEvaluation(AnalyzeInfo analyzeInfo) {
        this.sportConsumeEvaluation = analyzeInfo;
    }

    public void setSportType(SportType sportType) {
        this.sportType = sportType;
    }

    public void setStepEvaluation(AnalyzeInfo analyzeInfo) {
        this.stepEvaluation = analyzeInfo;
    }

    public void setStride(Double d) {
        this.stride = d;
    }
}
