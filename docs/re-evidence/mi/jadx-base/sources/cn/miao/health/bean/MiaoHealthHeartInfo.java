package cn.miao.health.bean;

/* JADX INFO: loaded from: classes.dex */
public class MiaoHealthHeartInfo extends MiaoHealthBaseInfo {
    private AnalyzeInfo conventionHeart;
    private AnalyzeInfo heartIntension;
    private Integer heartRateReserve;
    private Integer heartRateSportMax;
    private AnalyzeInfo hrrEvaluation;
    private AnalyzeInfo sportHeartEvaluation;
    private AnalyzeInfo thrEvaluation;

    public AnalyzeInfo getConventionHeart() {
        return this.conventionHeart;
    }

    public AnalyzeInfo getHeartIntension() {
        return this.heartIntension;
    }

    public Integer getHeartRateReserve() {
        return this.heartRateReserve;
    }

    public Integer getHeartRateSportMax() {
        return this.heartRateSportMax;
    }

    public AnalyzeInfo getHrrEvaluation() {
        return this.hrrEvaluation;
    }

    public AnalyzeInfo getSportHeartEvaluation() {
        return this.sportHeartEvaluation;
    }

    public AnalyzeInfo getThrEvaluation() {
        return this.thrEvaluation;
    }

    public void setConventionHeart(AnalyzeInfo analyzeInfo) {
        this.conventionHeart = analyzeInfo;
    }

    public void setHeartIntension(AnalyzeInfo analyzeInfo) {
        this.heartIntension = analyzeInfo;
    }

    public void setHeartRateReserve(Integer num) {
        this.heartRateReserve = num;
    }

    public void setHeartRateSportMax(Integer num) {
        this.heartRateSportMax = num;
    }

    public void setHrrEvaluation(AnalyzeInfo analyzeInfo) {
        this.hrrEvaluation = analyzeInfo;
    }

    public void setSportHeartEvaluation(AnalyzeInfo analyzeInfo) {
        this.sportHeartEvaluation = analyzeInfo;
    }

    public void setThrEvaluation(AnalyzeInfo analyzeInfo) {
        this.thrEvaluation = analyzeInfo;
    }
}
