package com.huawei.health.h5pro.load.rule;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes28.dex */
@Deprecated
public class RuleVo {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("rule")
    private String f6968c;

    @SerializedName("columns")
    private String[] d;

    public String[] getColumns() {
        return this.d;
    }

    public String getRule() {
        return this.f6968c;
    }

    public void setColumns(String[] strArr) {
        this.d = strArr;
    }

    public void setRule(String str) {
        this.f6968c = str;
    }
}
