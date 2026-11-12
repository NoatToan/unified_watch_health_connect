package com.amap.api.services.nearby;

import com.amap.api.services.core.LatLonPoint;

/* JADX INFO: loaded from: classes21.dex */
public class UploadInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f3611a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f3612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LatLonPoint f3613c;

    public void setPoint(LatLonPoint latLonPoint) {
        this.f3613c = latLonPoint;
    }

    public LatLonPoint getPoint() {
        return this.f3613c;
    }

    public void setUserID(String str) {
        this.f3612b = str;
    }

    public String getUserID() {
        return this.f3612b;
    }

    public int getCoordType() {
        return this.f3611a;
    }

    public void setCoordType(int i) {
        if (i != 0 && i != 1) {
            this.f3611a = 1;
        } else {
            this.f3611a = i;
        }
    }
}
