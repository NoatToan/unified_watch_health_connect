package com.miui.tsmclient.entity.doorcardv3;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes6.dex */
public class CalTaskData {

    @SerializedName("isOverLimit")
    private boolean isOverLimit;

    @SerializedName("errorTip")
    private String mErrorTip;

    @SerializedName("taskCount")
    private int mTaskCount;

    @SerializedName("taskLimit")
    private int mTaskLimit;

    public String getErrorTip() {
        return this.mErrorTip;
    }

    public int getTaskCount() {
        return this.mTaskCount;
    }

    public boolean isOverLimit() {
        return this.isOverLimit;
    }
}
