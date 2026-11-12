package com.huawei.hms.network.embedded;

import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes34.dex */
public final class a9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set<x7> f14572a = new LinkedHashSet();

    public boolean c(x7 x7Var) {
        boolean zContains;
        synchronized (this) {
            zContains = this.f14572a.contains(x7Var);
        }
        return zContains;
    }

    public void b(x7 x7Var) {
        synchronized (this) {
            this.f14572a.add(x7Var);
        }
    }

    public void a(x7 x7Var) {
        synchronized (this) {
            this.f14572a.remove(x7Var);
        }
    }
}
