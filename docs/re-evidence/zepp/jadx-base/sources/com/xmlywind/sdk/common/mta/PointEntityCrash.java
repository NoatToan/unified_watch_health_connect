package com.xmlywind.sdk.common.mta;

/* JADX INFO: loaded from: classes22.dex */
public class PointEntityCrash extends PointEntitySuper {
    private String b;

    public static PointEntityCrash WindCrash(String str, String str2) {
        PointEntityCrash pointEntityCrash = new PointEntityCrash();
        pointEntityCrash.setAc_type(PointType.SIGMOB_CRASH);
        pointEntityCrash.setCategory(str);
        pointEntityCrash.setCrashMessage(str2);
        return pointEntityCrash;
    }

    public String getCrashMessage() {
        return this.b;
    }

    public void setCrashMessage(String str) {
        this.b = str;
    }
}
