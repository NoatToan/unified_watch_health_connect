package com.huami.passport.entity;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.huami.passport.Configs;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class Entity implements Serializable {

    @SerializedName("error_code")
    private String errorCode;

    @SerializedName(Configs.Params.MUTIME)
    private String mutime;

    @SerializedName(Configs.Params.MUTIME_LONG)
    private long mutimeLong;

    @SerializedName(Configs.Params.NEXT_ACTIONS)
    private List<NextActions> nextActions;

    @SerializedName("result")
    private String result;

    @SerializedName("user_id")
    private String userId;

    public String getErrorCode() {
        return this.errorCode;
    }

    public String getMutime() {
        return this.mutime;
    }

    public long getMutimeLong() {
        return this.mutimeLong;
    }

    public List<NextActions> getNextActions() {
        return this.nextActions;
    }

    public String getResult() {
        return this.result;
    }

    public String getUserId() {
        return this.userId;
    }

    public boolean hasError() {
        return !TextUtils.isEmpty(this.errorCode);
    }

    public void setErrorCode(String str) {
        this.errorCode = str;
    }

    public void setMutime(String str) {
        this.mutime = str;
    }

    public void setMutimeLong(long j) {
        this.mutimeLong = j;
    }

    public void setNextActions(List<NextActions> list) {
        this.nextActions = list;
    }

    public void setResult(String str) {
        this.result = str;
    }

    public void setUserId(String str) {
        this.userId = str;
    }
}
