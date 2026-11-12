package fi.firstbeat.ete;

/* JADX INFO: loaded from: classes22.dex */
public class EteResults {
    public int aerobicFeedbackNumber;
    public int artifactPercent;
    public int correctedHr;
    public int cumulativeEnergyExpenditure;
    public int dailyPerformance;
    public int energyExpenditure;
    public int maximalHr;
    public int maximalMet;
    public int maximalMetMinutes;
    public int minimalHr;
    public int percentAchieved;
    public int phraseNumber;
    public int[] phraseVariable = new int[2];
    public int recoveryTime;
    public int trainingEffect;
    public int trainingLoadPeak;

    public enum RecognizedState {
        VERY_INTENSIVE_SPORT,
        INTENSIVE_SPORT,
        MODERATE_SPORT,
        LIGHT_PHYSICAL_ACTIVITY,
        RECOVERY,
        RECOVERY_FROM_EXERCISE,
        STRESS,
        NO_RRI_SIGNAL_OR_ACC_ACTIVITY,
        UNRECOGNIZED
    }
}
