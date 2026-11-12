package com.huawei.hmf.tasks.a;

import com.huawei.hmf.tasks.ExecuteResult;
import com.huawei.hmf.tasks.OnCompleteListener;
import com.huawei.hmf.tasks.Task;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public class d<TResult> implements ExecuteResult<TResult> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public OnCompleteListener<TResult> f12619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Executor f12620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f12621c = new Object();

    @Override // com.huawei.hmf.tasks.ExecuteResult
    public final void onComplete(Task<TResult> task) {
        this.f12620b.execute(new a(task));
    }

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Task f12622a;

        @Override // java.lang.Runnable
        public void run() {
            synchronized (d.this.f12621c) {
                if (d.this.f12619a != null) {
                    d.this.f12619a.onComplete(this.f12622a);
                }
            }
        }

        public a(Task task) {
            this.f12622a = task;
        }
    }

    @Override // com.huawei.hmf.tasks.ExecuteResult
    public void cancel() {
        synchronized (this.f12621c) {
            this.f12619a = null;
        }
    }

    public d(Executor executor, OnCompleteListener<TResult> onCompleteListener) {
        this.f12619a = onCompleteListener;
        this.f12620b = executor;
    }
}
