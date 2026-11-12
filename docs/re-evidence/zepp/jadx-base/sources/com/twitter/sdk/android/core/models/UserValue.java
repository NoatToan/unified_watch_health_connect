package com.twitter.sdk.android.core.models;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes18.dex */
public class UserValue {

    @SerializedName("id_str")
    public final String idStr;

    public UserValue(String str) {
        this.idStr = str;
    }
}
