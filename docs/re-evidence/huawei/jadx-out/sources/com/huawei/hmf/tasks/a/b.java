package com.huawei.hmf.tasks.a;

import com.huawei.hmf.tasks.ExecuteResult;
import com.huawei.hmf.tasks.OnCanceledListener;
import com.huawei.hmf.tasks.Task;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes10.dex */
public class b<TResult> implements ExecuteResult<TResult> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public OnCanceledListener f12612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Executor f12613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f12614c = new Object();

    @Override // com.huawei.hmf.tasks.ExecuteResult
    public final void onComplete(Task<TResult> task) {
        if (((i) task).f12641c) {
            this.f12613b.execute(new a());
        }
    }

    public class a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            synchronized (b.this.f12614c) {
                if (b.this.f12612a != null) {
                    b.this.f12612a.onCanceled();
                }
            }
        }

        public a() {
        }
    }

    @Override // com.huawei.hmf.tasks.ExecuteResult
    public void cancel() {
        synchronized (this.f12614c) {
            this.f12612a = null;
        }
    }

    public b(Executor executor, OnCanceledListener onCanceledListener) {
        this.f12612a = onCanceledListener;
        this.f12613b = executor;
    }
}
