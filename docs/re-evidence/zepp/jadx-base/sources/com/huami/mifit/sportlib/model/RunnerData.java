package com.huami.mifit.sportlib.model;

/* JADX INFO: loaded from: classes11.dex */
public class RunnerData {
    private static RunnerData j;
    private boolean a = true;
    private String b;
    private int c;
    private float d;
    private int e;
    private int f;
    private String g;
    private boolean h;
    private int i;

    public static RunnerData getRunner() {
        if (j == null) {
            j = new RunnerData();
        }
        return j;
    }

    public static void setRunnerData(RunnerData runnerData) {
        j = runnerData;
    }

    public int getAge() {
        return this.c;
    }

    public int getGender() {
        return this.f;
    }

    public int getHeight() {
        return this.e;
    }

    public int getLocationProviderType() {
        return this.i;
    }

    public String getUid() {
        return this.b;
    }

    public float getWeight() {
        return this.d;
    }

    public boolean isMainlandUser() {
        return this.h;
    }

    public boolean isMetric() {
        return this.a;
    }

    public boolean isPlay() {
        return "play".equals(this.g);
    }

    public void setAge(int i) {
        this.c = i;
    }

    public void setGender(int i) {
        this.f = i;
    }

    public void setHeight(int i) {
        this.e = i;
    }

    public void setLocationProviderType(int i) {
        this.i = i;
    }

    public void setMainlandUser(boolean z) {
        this.h = z;
        setLocationProviderType(z ? 2 : 1);
    }

    public void setMetric(boolean z) {
        this.a = z;
    }

    public void setPlay(String str) {
        this.g = str;
    }

    public void setUid(String str) {
        this.b = str;
    }

    public void setWeight(float f) {
        this.d = f;
    }

    public String toString() {
        return "RunnerData{uid='" + this.b + "', age=" + this.c + ", isMetric=" + this.a + ", weight=" + this.d + ", height=" + this.e + ", gender=" + this.f + ", isPlay=" + this.g + ", isMainlandUser=" + this.h + ", locationProviderType=" + this.i + '}';
    }
}
