package com.huawei.hmf.tasks.a;

import com.huawei.hmf.tasks.CancellationToken;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes33.dex */
public class c extends CancellationToken {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<Runnable> f12616a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f12617b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f12618c = false;

    @Override // com.huawei.hmf.tasks.CancellationToken
    public CancellationToken register(Runnable runnable) {
        synchronized (this.f12617b) {
            if (this.f12618c) {
                runnable.run();
            } else {
                this.f12616a.add(runnable);
            }
        }
        return this;
    }

    @Override // com.huawei.hmf.tasks.CancellationToken
    public boolean isCancellationRequested() {
        return this.f12618c;
    }

    public final void a() {
        if (this.f12618c) {
            return;
        }
        synchronized (this.f12617b) {
            this.f12618c = true;
            Iterator<Runnable> it = this.f12616a.iterator();
            while (it.hasNext()) {
                it.next().run();
            }
        }
    }
}
