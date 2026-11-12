package fi.firstbeat.tha;

/* JADX INFO: loaded from: classes22.dex */
public class ThaResults {
    public int currentStatus;
    public int fitnessLevelIncrease;
    public int wtlSum;
    public int wtlSumOptimalMax;
    public int wtlSumOptimalMin;
    public int wtlSumOverreaching;
    public Vo2maxTrend vo2maxTrend = Vo2maxTrend.NO_RESULT;
    public Vo2maxTrendType vo2maxTrendType = Vo2maxTrendType.NONE;
    public TrainingLoadTrend trainingLoadTrend = TrainingLoadTrend.NO_RESULT;
    public WeeklyTrainingLoad wtl = WeeklyTrainingLoad.NO_RESULT;
    public FitnessClassification fitnessClass = FitnessClassification.NO_RESULT;

    public enum FitnessClassification {
        NO_RESULT,
        VERY_POOR,
        POOR,
        AVERAGE,
        GOOD,
        EXCELLENT,
        SUPERIOR
    }

    public enum TrainingLoadTrend {
        NO_RESULT,
        DECREASING,
        NO_CHANGE,
        INCREASING
    }

    public enum Vo2maxTrend {
        NO_RESULT,
        DECREASING,
        MAINTAINING,
        INCREASING
    }

    public enum Vo2maxTrendType {
        RUNNING,
        CYCLING,
        NONE
    }

    public enum WeeklyTrainingLoad {
        NO_RESULT,
        VERY_EASY,
        EASY,
        MODERATE,
        HARD,
        OVERREACHING
    }
}
