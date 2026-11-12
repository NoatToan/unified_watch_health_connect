package com.huawei.hms.network.embedded;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
public final class l7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p6 f15042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<y8> f15043b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15044c = 0;

    public boolean c() {
        return this.f15043b.isEmpty();
    }

    public void b(y8 y8Var) {
        this.f15043b.remove(y8Var);
    }

    public y8 b() {
        return e();
    }

    public void a(y8 y8Var) {
        if (this.f15043b.contains(y8Var)) {
            return;
        }
        this.f15043b.add(y8Var);
    }

    public p6 a() {
        return this.f15042a;
    }

    private y8 e() {
        y8 y8Var = null;
        int i = Integer.MAX_VALUE;
        for (y8 y8Var2 : this.f15043b) {
            int size = y8Var2.p.size();
            if (size < y8Var2.o && !y8Var2.k && size < i) {
                y8Var = y8Var2;
                i = size;
            }
        }
        return y8Var;
    }

    @Deprecated
    private y8 d() {
        if (this.f15043b.isEmpty()) {
            return null;
        }
        if (this.f15044c >= this.f15043b.size()) {
            this.f15044c = 0;
        }
        int size = this.f15043b.size();
        for (int i = this.f15044c; i < size; i++) {
            y8 y8Var = this.f15043b.get(i);
            if (y8Var.p.size() < y8Var.o && !y8Var.k) {
                this.f15044c++;
                return y8Var;
            }
        }
        for (int i2 = 0; i2 < this.f15044c; i2++) {
            y8 y8Var2 = this.f15043b.get(i2);
            if (y8Var2.p.size() < y8Var2.o && !y8Var2.k) {
                this.f15044c++;
                return y8Var2;
            }
        }
        return null;
    }

    public l7(p6 p6Var) {
        this.f15042a = p6Var;
    }
}
