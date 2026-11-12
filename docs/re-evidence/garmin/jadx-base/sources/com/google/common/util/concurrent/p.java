package com.google.common.util.concurrent;

import com.google.common.base.Supplier;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class p implements Supplier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53625a;

    public /* synthetic */ p(int i14) {
        this.f53625a = i14;
    }

    @Override // com.google.common.base.Supplier
    public final Object get() {
        switch (this.f53625a) {
            case 0:
                return new Striped.WeakSafeReadWriteLock();
            case 1:
                return new Striped.PaddedLock();
            case 2:
                return Striped.lambda$lazyWeakLock$0();
            default:
                return new ReentrantReadWriteLock();
        }
    }
}
