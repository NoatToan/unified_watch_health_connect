package com.huawei.hmf.tasks.a;

import com.huawei.hmf.tasks.ExecuteResult;
import com.huawei.hmf.tasks.OnSuccessListener;
import com.huawei.hmf.tasks.Task;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public class h<TResult> implements ExecuteResult<TResult> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public OnSuccessListener<TResult> f12634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Executor f12635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f12636c = new Object();

    @Override // com.huawei.hmf.tasks.ExecuteResult
    public final void onComplete(Task<TResult> task) {
        if (!task.isSuccessful() || ((i) task).f12641c) {
            return;
        }
        this.f12635b.execute(new a(task));
    }

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Task f12637a;

        @Override // java.lang.Runnable
        public void run() {
            synchronized (h.this.f12636c) {
                if (h.this.f12634a != null) {
                    h.this.f12634a.onSuccess((TResult) this.f12637a.getResult());
                }
            }
        }

        public a(Task task) {
            this.f12637a = task;
        }
    }

    @Override // com.huawei.hmf.tasks.ExecuteResult
    public void cancel() {
        synchronized (this.f12636c) {
            this.f12634a = null;
        }
    }

    public h(Executor executor, OnSuccessListener<TResult> onSuccessListener) {
        this.f12634a = onSuccessListener;
        this.f12635b = executor;
    }
}
