package com.amap.api.services.help;

import com.amap.api.services.core.LatLonPoint;

/* JADX INFO: loaded from: classes4.dex */
public class InputtipsQuery implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f6580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f6581b;
    private boolean c = false;
    private String d = null;
    private LatLonPoint e;

    public InputtipsQuery(String str, String str2) {
        this.f6580a = str;
        this.f6581b = str2;
    }

    public String getCity() {
        return this.f6581b;
    }

    public boolean getCityLimit() {
        return this.c;
    }

    public String getKeyword() {
        return this.f6580a;
    }

    public LatLonPoint getLocation() {
        return this.e;
    }

    public String getType() {
        return this.d;
    }

    public void setCityLimit(boolean z) {
        this.c = z;
    }

    public void setLocation(LatLonPoint latLonPoint) {
        this.e = latLonPoint;
    }

    public void setType(String str) {
        this.d = str;
    }
}
