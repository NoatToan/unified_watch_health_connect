package com.xiaomi.hm.health.discovery.jsbridge.entity;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes21.dex */
public class JsCashierSuccessRep {

    @SerializedName("status")
    private final String a = "success";

    public static JsCashierSuccessRep get() {
        return new JsCashierSuccessRep();
    }

    public String getStatus() {
        return "success";
    }

    public String toString() {
        return new Gson().toJson(this);
    }
}
