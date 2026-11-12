package com.huawei.hihealth.dictionary.model;

import com.google.gson.annotations.SerializedName;
import com.huawei.hihealth.dictionary.utils.DictUtils;
import health.compact.a.util.LogUtil;

/* JADX INFO: loaded from: classes.dex */
public class HiHealthDictStat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("associateValue")
    private Double f12283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("statPolicy")
    private String f12284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("mergePolicy")
    private String f12285c;

    @SerializedName("statFieldName")
    private String d;

    @SerializedName("format")
    private String e;

    @SerializedName("statType")
    private int h;

    public void c(int i) {
        if (this.h == 0) {
            this.h = DictUtils.e(i, this.d);
        }
    }

    public boolean i() {
        if (!DictUtils.e(this.d)) {
            LogUtil.c("HiH_HiHealthDictStat", "statFieldName is illegal: ", this.d);
            return false;
        }
        if (HealthDataStatPolicy.validate(this.f12284b)) {
            return true;
        }
        LogUtil.c("HiH_HiHealthDictStat", "statPolicy is illegal: ", this.f12284b);
        return false;
    }

    public int c() {
        return this.h;
    }

    public String a() {
        return this.d;
    }

    public String d() {
        return this.e;
    }

    public String e() {
        return this.f12284b;
    }

    public Double b() {
        return this.f12283a;
    }
}
