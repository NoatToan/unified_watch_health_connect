package com.huawei.hihealth.dictionary.model;

import com.google.gson.annotations.SerializedName;
import com.huawei.health.messagecenter.model.CommonUtil;
import com.huawei.hihealth.dictionary.utils.DictUtils;
import health.compact.a.util.LogUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class HiHealthDictField {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("mergeMode")
    private HiHealthDictMergeMode f12277a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("mergePolicy")
    private String f12279c;

    @SerializedName("fullValidate")
    private boolean d;

    @SerializedName("format")
    private String e;

    @SerializedName("name")
    private String f;

    @SerializedName(CommonUtil.PARAM_HEALTH_TYPE)
    private int g;

    @SerializedName("unit")
    private String i;

    @SerializedName("validatePolicies")
    private String n;

    @SerializedName("optional")
    private boolean j = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("isOverSea")
    private boolean f12278b = true;

    @SerializedName("statPolicies")
    private List<HiHealthDictStat> h = new ArrayList();

    public void a(int i) {
        c(i);
        d(i);
    }

    private void c(int i) {
        if (this.g == 0) {
            this.g = DictUtils.e(i, this.f);
        }
    }

    public void d(int i) {
        List<HiHealthDictStat> list = this.h;
        if (list == null) {
            LogUtil.e("HiH_HiHealthDictField", "statPolicies is null, no need to genarate type id.");
            return;
        }
        Iterator<HiHealthDictStat> it = list.iterator();
        while (it.hasNext()) {
            it.next().c(i);
        }
    }

    public boolean i() {
        if (!DictUtils.e(this.f)) {
            LogUtil.c("HiH_HiHealthDictField", "name is illegal: ", this.f);
            return false;
        }
        HiHealthDictMergeMode hiHealthDictMergeMode = this.f12277a;
        if (hiHealthDictMergeMode != null && (!HealthDataMergePolicy.validate(hiHealthDictMergeMode.c()) || !HealthDataMergePolicy.validate(this.f12277a.e()))) {
            LogUtil.c("HiH_HiHealthDictField", "mergePolicy is illegal: ", this.f12279c);
            return false;
        }
        List<HiHealthDictStat> list = this.h;
        if (list == null) {
            return true;
        }
        for (HiHealthDictStat hiHealthDictStat : list) {
            if (!hiHealthDictStat.i()) {
                LogUtil.c("HiH_HiHealthDictField", "statPolicy is illegal: ", hiHealthDictStat.a());
                return false;
            }
        }
        return true;
    }

    public boolean b() {
        return this.d;
    }

    public void c(boolean z) {
        this.d = z;
    }

    public void a(boolean z) {
        this.j = z;
    }

    public String f() {
        return this.n;
    }

    public void b(String str) {
        this.n = str;
    }

    public int e() {
        return this.g;
    }

    public void e(int i) {
        this.g = i;
    }

    public String c() {
        return this.f;
    }

    public void e(String str) {
        this.f = str;
    }

    public String d() {
        return this.e;
    }

    public void a(String str) {
        this.e = str;
    }

    public boolean g() {
        return this.j;
    }

    public HiHealthDictMergeMode a() {
        return this.f12277a;
    }

    public boolean h() {
        return this.f12278b;
    }

    public List<HiHealthDictStat> j() {
        return this.h;
    }
}
