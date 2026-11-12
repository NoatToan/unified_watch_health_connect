package com.huawei.hms.scankit.p;

/* JADX INFO: loaded from: classes34.dex */
public class c6 implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public j2 f16027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f16028b;

    public c6(j2 j2Var, int i) {
        this.f16027a = j2Var;
        this.f16028b = i;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(c6 c6Var) {
        return Float.compare((-c6Var.f16027a.g()) + c6Var.f16027a.h(), (-this.f16027a.g()) + this.f16027a.h());
    }
}
