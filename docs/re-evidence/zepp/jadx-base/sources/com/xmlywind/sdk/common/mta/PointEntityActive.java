package com.xmlywind.sdk.common.mta;

/* JADX INFO: loaded from: classes22.dex */
public class PointEntityActive extends PointEntitySuper {
    private String b;
    private String c;

    public static PointEntityActive ActiveTracking(String str, String str2, String str3, String str4) {
        PointEntityActive pointEntityActive = new PointEntityActive();
        pointEntityActive.setAc_type(PointType.WIND_ACTIVE);
        pointEntityActive.setCategory(str);
        pointEntityActive.setActive_id(str2);
        pointEntityActive.setDuration(str3);
        pointEntityActive.setTimestamp(str4);
        pointEntityActive.commit();
        return pointEntityActive;
    }

    public String getActive_id() {
        return this.b;
    }

    public String getDuration() {
        return this.c;
    }

    public void setActive_id(String str) {
        this.b = str;
    }

    public void setDuration(String str) {
        this.c = str;
    }
}
