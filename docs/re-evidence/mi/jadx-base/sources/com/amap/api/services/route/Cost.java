package com.amap.api.services.route;

/* JADX INFO: loaded from: classes4.dex */
public class Cost {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f6649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f6650b;
    private String c;
    private float d;
    private int e;

    public float getDuration() {
        return this.f6649a;
    }

    public float getTollDistance() {
        return this.f6650b;
    }

    public String getTollRoad() {
        return this.c;
    }

    public float getTolls() {
        return this.d;
    }

    public int getTrafficLights() {
        return this.e;
    }

    public void setDuration(float f) {
        this.f6649a = f;
    }

    public void setTollDistance(float f) {
        this.f6650b = f;
    }

    public void setTollRoad(String str) {
        this.c = str;
    }

    public void setTolls(float f) {
        this.d = f;
    }

    public void setTrafficLights(int i) {
        this.e = i;
    }
}
