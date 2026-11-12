package com.huawei.hihealth.dictionary.model;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes2.dex */
public class HiHealthDictMergeMode {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("sourceInternalMergePolicy")
    private String f12280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("compareKey")
    private String f12281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("mergePolicy")
    private String f12282c;

    @SerializedName("categoryPriority")
    private String[] d;

    @SerializedName("dataSourcePriority")
    private int[] e;

    public String c() {
        return this.f12282c;
    }

    public int[] d() {
        return (int[]) this.e.clone();
    }

    public String[] b() {
        return (String[]) this.d.clone();
    }

    public String a() {
        return this.f12281b;
    }

    public String e() {
        return this.f12280a;
    }
}
