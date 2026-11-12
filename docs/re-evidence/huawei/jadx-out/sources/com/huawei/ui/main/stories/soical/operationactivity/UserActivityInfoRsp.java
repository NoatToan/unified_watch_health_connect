package com.huawei.ui.main.stories.soical.operationactivity;

import com.google.gson.annotations.SerializedName;
import defpackage.wog;
import java.util.List;

/* JADX INFO: loaded from: classes43.dex */
public class UserActivityInfoRsp {

    @SerializedName("resultCode")
    private String resultCode;

    @SerializedName("resultDesc")
    private String resultDesc;

    @SerializedName("userActivityInfo")
    private wog userActivityInfo;

    @SerializedName("userActivityInfoList")
    private List<wog> userActivityInfoList;

    public String getResultCode() {
        return this.resultCode;
    }

    public List<wog> getUserActivityInfoList() {
        return this.userActivityInfoList;
    }

    public String toString() {
        return "UserActivityInfoRsp{resultCode='" + this.resultCode + "', resultDesc='" + this.resultDesc + "', userActivityInfo=" + this.userActivityInfo + ", userActivityInfoList=" + this.userActivityInfoList + '}';
    }
}
