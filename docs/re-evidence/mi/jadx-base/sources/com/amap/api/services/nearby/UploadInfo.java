package com.amap.api.services.nearby;

import com.amap.api.services.core.LatLonPoint;

/* JADX INFO: loaded from: classes4.dex */
public class UploadInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f6594a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f6595b;
    private LatLonPoint c;

    public int getCoordType() {
        return this.f6594a;
    }

    public LatLonPoint getPoint() {
        return this.c;
    }

    public String getUserID() {
        return this.f6595b;
    }

    public void setCoordType(int i) {
        if (i == 0 || i == 1) {
            this.f6594a = i;
        } else {
            this.f6594a = 1;
        }
    }

    public void setPoint(LatLonPoint latLonPoint) {
        this.c = latLonPoint;
    }

    public void setUserID(String str) {
        this.f6595b = str;
    }
}
