package com.huawei.watchface;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes20.dex */
public class m3 extends FutureTask implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Runnable f30302a;

    public m3(Callable callable) {
        super(callable);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(Runnable runnable) {
        Runnable runnable2 = this.f30302a;
        n3 n3Var = runnable2 instanceof n3 ? (n3) runnable2 : null;
        if (n3Var != null) {
            return n3Var.compareTo(runnable);
        }
        return 0;
    }

    public m3(Runnable runnable, Object obj) {
        super(runnable, obj);
        this.f30302a = runnable;
    }
}
