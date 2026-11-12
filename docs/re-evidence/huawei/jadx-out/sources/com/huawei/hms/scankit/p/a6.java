package com.huawei.hms.scankit.p;

/* JADX INFO: loaded from: classes34.dex */
public class a6 implements g4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f15976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f15977b;

    public a6(float f, float f2) {
        this.f15977b = f;
        this.f15976a = f2;
    }

    @Override // com.huawei.hms.scankit.p.g4
    public void a(w5 w5Var) {
        float fA = this.f15976a;
        float f = this.f15977b;
        if (fA != f) {
            fA = n6.a(fA - f) + this.f15977b;
        }
        w5Var.b(fA);
        w5Var.a(fA);
    }
}
