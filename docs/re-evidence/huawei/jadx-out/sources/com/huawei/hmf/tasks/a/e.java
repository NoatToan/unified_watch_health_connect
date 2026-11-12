package com.huawei.hmf.tasks.a;

import com.huawei.hmf.tasks.OnCanceledListener;
import com.huawei.hmf.tasks.OnFailureListener;
import com.huawei.hmf.tasks.OnSuccessListener;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes33.dex */
public class e<TResult> implements OnSuccessListener<TResult>, OnFailureListener, OnCanceledListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f12624a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i<Void> f12626c;
    public int d;
    public Exception e;
    public boolean f;

    @Override // com.huawei.hmf.tasks.OnSuccessListener
    public void onSuccess(TResult tresult) {
        synchronized (this.f12624a) {
            this.d++;
            a();
        }
    }

    @Override // com.huawei.hmf.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        synchronized (this.f12624a) {
            this.d++;
            this.e = exc;
            a();
        }
    }

    @Override // com.huawei.hmf.tasks.OnCanceledListener
    public void onCanceled() {
        synchronized (this.f12624a) {
            this.d++;
            this.f = true;
            a();
        }
    }

    public final void a() {
        if (this.d >= this.f12625b) {
            if (this.e != null) {
                this.f12626c.a(new ExecutionException("a task failed", this.e));
            } else if (this.f) {
                this.f12626c.a();
            } else {
                this.f12626c.a((Void) null);
            }
        }
    }

    public e(int i, i<Void> iVar) {
        this.f12625b = i;
        this.f12626c = iVar;
    }
}
