package com.amap.api.services.route;

/* JADX INFO: loaded from: classes21.dex */
public class Cost {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f3685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f3686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f3687c;
    private float d;
    private int e;

    public float getDuration() {
        return this.f3685a;
    }

    public void setDuration(float f) {
        this.f3685a = f;
    }

    public float getTollDistance() {
        return this.f3686b;
    }

    public void setTollDistance(float f) {
        this.f3686b = f;
    }

    public String getTollRoad() {
        return this.f3687c;
    }

    public void setTollRoad(String str) {
        this.f3687c = str;
    }

    public float getTolls() {
        return this.d;
    }

    public void setTolls(float f) {
        this.d = f;
    }

    public int getTrafficLights() {
        return this.e;
    }

    public void setTrafficLights(int i) {
        this.e = i;
    }
}
