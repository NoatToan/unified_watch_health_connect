package com.huawei.phoneservice.feedbackcommon.entity;

import com.google.gson.annotations.SerializedName;
import com.huawei.pluginachievement.manager.db.IAchieveDBMgr;

/* JADX INFO: loaded from: classes13.dex */
public class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("accessToken")
    private String f21857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("problemSourceCode")
    private String f21858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName(IAchieveDBMgr.PARAM_PAGE_SIZE)
    private int f21859c;

    @SerializedName("orderType")
    private int d;

    @SerializedName("problemId")
    private String e;

    public void a(int i) {
        this.f21859c = i;
    }

    public void b(int i) {
        this.d = i;
    }

    public r(String str, String str2, String str3) {
        this.f21857a = str;
        this.f21858b = str2;
        this.e = str3;
    }
}
