package fi.firstbeat.common;

/* JADX INFO: loaded from: classes22.dex */
public class FbtParameters {
    public int activityClass;
    public int age;
    public Gender gender = Gender.FEMALE;
    public int height;
    public int maximalHr;
    public int maximalMet;
    public int minimalHr;
    public int monthlyLoad;
    public int recoveryTime;
    public int weight;

    public enum Gender {
        FEMALE,
        MALE
    }
}
