package com.miui.tsmclient.entity.digitalkey;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes6.dex */
public class RetryPolicy {

    @SerializedName("retryPolicy")
    PolicyInfo mPolicyInfo;

    public PolicyInfo getPolicyInfo() {
        return this.mPolicyInfo;
    }

    public String toJson() {
        return new Gson().toJson(this, RetryPolicy.class);
    }
}
