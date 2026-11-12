package com.xmlywind.sdk.common.mta;

/* JADX INFO: loaded from: classes22.dex */
public final class PointEntitySensor extends PointEntityBase {
    private String b;
    private String c;
    private String d;

    public String getMotion_after() {
        return this.c;
    }

    public String getMotion_before() {
        return this.b;
    }

    public String getMotion_interval() {
        return this.d;
    }

    public void setMotion_after(String str) {
        this.c = str;
    }

    public void setMotion_before(String str) {
        this.b = str;
    }

    public void setMotion_interval(String str) {
        this.d = str;
    }
}
