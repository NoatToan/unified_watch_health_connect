package com.amap.api.services.help;

import com.amap.api.services.core.LatLonPoint;

/* JADX INFO: loaded from: classes21.dex */
public class InputtipsQuery implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f3593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f3594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f3595c = false;
    private String d = null;
    private LatLonPoint e;

    public InputtipsQuery(String str, String str2) {
        this.f3593a = str;
        this.f3594b = str2;
    }

    public String getKeyword() {
        return this.f3593a;
    }

    public String getCity() {
        return this.f3594b;
    }

    public void setType(String str) {
        this.d = str;
    }

    public String getType() {
        return this.d;
    }

    public void setCityLimit(boolean z) {
        this.f3595c = z;
    }

    public boolean getCityLimit() {
        return this.f3595c;
    }

    public void setLocation(LatLonPoint latLonPoint) {
        this.e = latLonPoint;
    }

    public LatLonPoint getLocation() {
        return this.e;
    }
}
