package com.huawei.hms.scankit.p;

/* JADX INFO: loaded from: classes34.dex */
public final class i6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f16139a;

    i6(boolean z) {
        this.f16139a = z;
    }

    public void a(u6[] u6VarArr) {
        if (!this.f16139a || u6VarArr == null || u6VarArr.length < 3) {
            return;
        }
        u6 u6Var = u6VarArr[0];
        u6VarArr[0] = u6VarArr[2];
        u6VarArr[2] = u6Var;
    }
}
