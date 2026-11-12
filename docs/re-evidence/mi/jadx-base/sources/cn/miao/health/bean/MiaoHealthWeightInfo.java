package cn.miao.health.bean;

/* JADX INFO: loaded from: classes.dex */
public class MiaoHealthWeightInfo extends MiaoHealthBaseInfo {
    private AnalyzeInfo bfrEvaluation;
    private AnalyzeInfo bmdEvaluation;
    private Double bmi;
    private AnalyzeInfo bmiEvaluation;
    private AnalyzeInfo boneSaltEvaluation;
    private AnalyzeInfo moistureEvaluation;
    private AnalyzeInfo muscleEvaluation;
    private AnalyzeInfo pcEvaluation;
    private AnalyzeInfo vfEvaluation;
    private Integer weightS;
    private Integer weightT;

    public AnalyzeInfo getBfrEvaluation() {
        return this.bfrEvaluation;
    }

    public AnalyzeInfo getBmdEvaluation() {
        return this.bmdEvaluation;
    }

    public Double getBmi() {
        return this.bmi;
    }

    public AnalyzeInfo getBmiEvaluation() {
        return this.bmiEvaluation;
    }

    public AnalyzeInfo getBoneSaltEvaluation() {
        return this.boneSaltEvaluation;
    }

    public AnalyzeInfo getMoistureEvaluation() {
        return this.moistureEvaluation;
    }

    public AnalyzeInfo getMuscleEvaluation() {
        return this.muscleEvaluation;
    }

    public AnalyzeInfo getPcEvaluation() {
        return this.pcEvaluation;
    }

    public AnalyzeInfo getVfEvaluation() {
        return this.vfEvaluation;
    }

    public Integer getWeightS() {
        return this.weightS;
    }

    public Integer getWeightT() {
        return this.weightT;
    }

    public void setBfrEvaluation(AnalyzeInfo analyzeInfo) {
        this.bfrEvaluation = analyzeInfo;
    }

    public void setBmdEvaluation(AnalyzeInfo analyzeInfo) {
        this.bmdEvaluation = analyzeInfo;
    }

    public void setBmi(Double d) {
        this.bmi = d;
    }

    public void setBmiEvaluation(AnalyzeInfo analyzeInfo) {
        this.bmiEvaluation = analyzeInfo;
    }

    public void setBoneSaltEvaluation(AnalyzeInfo analyzeInfo) {
        this.boneSaltEvaluation = analyzeInfo;
    }

    public void setMoistureEvaluation(AnalyzeInfo analyzeInfo) {
        this.moistureEvaluation = analyzeInfo;
    }

    public void setMuscleEvaluation(AnalyzeInfo analyzeInfo) {
        this.muscleEvaluation = analyzeInfo;
    }

    public void setPcEvaluation(AnalyzeInfo analyzeInfo) {
        this.pcEvaluation = analyzeInfo;
    }

    public void setVfEvaluation(AnalyzeInfo analyzeInfo) {
        this.vfEvaluation = analyzeInfo;
    }

    public void setWeightS(Integer num) {
        this.weightS = num;
    }

    public void setWeightT(Integer num) {
        this.weightT = num;
    }
}
