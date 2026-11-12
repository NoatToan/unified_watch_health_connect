package com.xiaomi.hm.health.discovery.jsbridge.entity;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.huami.ecg.core.db.entity.EcgData;
import com.xiaomi.hm.health.cashier.CashierPay;

/* JADX INFO: loaded from: classes21.dex */
public class JsCashierErrorRep {

    @SerializedName("errorCode")
    private String a;

    @SerializedName("errorMessage")
    private String b;

    public JsCashierErrorRep() {
        this.a = EcgData.DEFAULT_DIGIT_VALUE;
    }

    public static JsCashierErrorRep get(int error) {
        return new JsCashierErrorRep(error);
    }

    public String getError() {
        return this.a;
    }

    public String toString() {
        return new Gson().toJson(this);
    }

    public JsCashierErrorRep(int error, String msg) {
        this.a = EcgData.DEFAULT_DIGIT_VALUE;
        this.a = String.valueOf(error);
        this.b = msg;
    }

    public JsCashierErrorRep(int error) {
        this.a = EcgData.DEFAULT_DIGIT_VALUE;
        this.a = String.valueOf(error);
        this.b = CashierPay.getMessage(error);
    }
}
