package com.xmlywind.sdk.common.mta;

/* JADX INFO: loaded from: classes22.dex */
public final class PointEntitySigmobError extends PointEntitySigmob {
    private String b;

    public static PointEntitySigmobError SigmobError(String str, int i, String str2) {
        PointEntitySigmobError pointEntitySigmobError = new PointEntitySigmobError();
        pointEntitySigmobError.setAc_type("9");
        pointEntitySigmobError.setCategory(str);
        pointEntitySigmobError.setSub_category(String.valueOf(i));
        pointEntitySigmobError.setError_message(str2);
        return pointEntitySigmobError;
    }

    @Override // com.xmlywind.sdk.common.mta.PointEntitySigmob
    public String getError_message() {
        return this.b;
    }

    @Override // com.xmlywind.sdk.common.mta.PointEntitySigmob
    public void setError_message(String str) {
        this.b = str;
    }
}
