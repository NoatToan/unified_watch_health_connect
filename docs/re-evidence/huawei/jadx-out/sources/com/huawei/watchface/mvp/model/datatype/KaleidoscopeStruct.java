package com.huawei.watchface.mvp.model.datatype;

import com.huawei.secure.android.common.util.SafeString;

/* JADX INFO: loaded from: classes20.dex */
public class KaleidoscopeStruct {
    private int materialImageIndex;
    private String materialImageName;

    public KaleidoscopeStruct(int i, String str) {
        this.materialImageIndex = i;
        this.materialImageName = str;
    }

    public int getMaterialImageIndex() {
        return this.materialImageIndex;
    }

    public String getMaterialImageName() {
        return this.materialImageName;
    }

    public String getSubMaterialImageName() {
        String str = this.materialImageName;
        return SafeString.substring(str, 0, str.indexOf("."));
    }

    public void setMaterialImageIndex(int i) {
        this.materialImageIndex = i;
    }

    public void setMaterialImageName(String str) {
        this.materialImageName = str;
    }

    public String toString() {
        return "KaleidoscopeStruct{materialImageIndex=" + this.materialImageIndex + ", materialImageName='" + this.materialImageName + "'}";
    }
}
