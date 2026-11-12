package com.xmlywind.sdk.common.mta;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes22.dex */
public final class PointEntityWindError extends PointEntityWind {
    private String b;
    private String c;

    public static PointEntityWindError WindError(String str, int i, String str2) {
        PointEntityWindError pointEntityWindError = new PointEntityWindError();
        pointEntityWindError.setAc_type(PointType.WIND_COMMON);
        pointEntityWindError.setCategory(str);
        pointEntityWindError.setError_code(String.valueOf(i));
        if (!TextUtils.isEmpty(str2)) {
            pointEntityWindError.setError_message(str2);
        }
        return pointEntityWindError;
    }

    public String getError_code() {
        return this.c;
    }

    public String getError_message() {
        return this.b;
    }

    public void setError_code(String str) {
        this.c = str;
    }

    public void setError_message(String str) {
        this.b = str;
    }
}
