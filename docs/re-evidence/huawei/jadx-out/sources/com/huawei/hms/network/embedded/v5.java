package com.huawei.hms.network.embedded;

import com.huawei.hms.framework.common.Logger;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes34.dex */
public abstract class v5 {
    public static final String d = "IQuery";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ExecutorService f15491b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public w5 f15490a = new w5();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public i5 f15492c = i5.e;

    public abstract w5 b(i5 i5Var);

    public final v5 a(v5 v5Var) {
        if (!this.f15490a.c()) {
            Logger.i(d, "the next quary will not execute!");
            return this;
        }
        this.f15490a.b(false);
        v5Var.f15490a = this.f15490a;
        v5Var.a();
        return this;
    }

    public final v5 a(i5 i5Var) {
        this.f15492c = i5Var;
        return this;
    }

    public final v5 a() {
        this.f15492c.b(this.f15490a);
        w5 w5VarB = b(this.f15492c);
        this.f15490a = w5VarB;
        if (w5VarB == null) {
            this.f15490a = new w5();
        }
        this.f15492c.a(this.f15490a);
        return this;
    }
}
