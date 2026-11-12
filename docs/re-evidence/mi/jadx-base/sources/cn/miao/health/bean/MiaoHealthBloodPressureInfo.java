package cn.miao.health.bean;

/* JADX INFO: loaded from: classes.dex */
public class MiaoHealthBloodPressureInfo extends MiaoHealthBaseInfo {
    private AnalyzeInfo dpEvaluation;
    private AnalyzeInfo spEvaluation;

    public AnalyzeInfo getDpEvaluation() {
        return this.dpEvaluation;
    }

    public AnalyzeInfo getSpEvaluation() {
        return this.spEvaluation;
    }

    public void setDpEvaluation(AnalyzeInfo analyzeInfo) {
        this.dpEvaluation = analyzeInfo;
    }

    public void setSpEvaluation(AnalyzeInfo analyzeInfo) {
        this.spEvaluation = analyzeInfo;
    }
}
