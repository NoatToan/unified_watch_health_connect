package com.huawei.hmf.tasks.a;

import com.huawei.hmf.tasks.ExecuteResult;
import com.huawei.hmf.tasks.OnFailureListener;
import com.huawei.hmf.tasks.Task;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public class f<TResult> implements ExecuteResult<TResult> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public OnFailureListener f12627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Executor f12628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f12629c = new Object();

    @Override // com.huawei.hmf.tasks.ExecuteResult
    public final void onComplete(Task<TResult> task) {
        if (task.isSuccessful() || ((i) task).f12641c) {
            return;
        }
        this.f12628b.execute(new a(task));
    }

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Task f12630a;

        @Override // java.lang.Runnable
        public void run() {
            synchronized (f.this.f12629c) {
                if (f.this.f12627a != null) {
                    f.this.f12627a.onFailure(this.f12630a.getException());
                }
            }
        }

        public a(Task task) {
            this.f12630a = task;
        }
    }

    @Override // com.huawei.hmf.tasks.ExecuteResult
    public void cancel() {
        synchronized (this.f12629c) {
            this.f12627a = null;
        }
    }

    public f(Executor executor, OnFailureListener onFailureListener) {
        this.f12627a = onFailureListener;
        this.f12628b = executor;
    }
}
