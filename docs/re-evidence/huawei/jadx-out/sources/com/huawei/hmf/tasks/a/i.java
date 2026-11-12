package com.huawei.hmf.tasks.a;

import android.app.Activity;
import com.huawei.hmf.tasks.Continuation;
import com.huawei.hmf.tasks.ExecuteResult;
import com.huawei.hmf.tasks.OnCanceledListener;
import com.huawei.hmf.tasks.OnCompleteListener;
import com.huawei.hmf.tasks.OnFailureListener;
import com.huawei.hmf.tasks.OnSuccessListener;
import com.huawei.hmf.tasks.SuccessContinuation;
import com.huawei.hmf.tasks.Task;
import com.huawei.hmf.tasks.TaskExecutors;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public class i<TResult> extends Task<TResult> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f12640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile boolean f12641c;
    public TResult d;
    public Exception e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f12639a = new Object();
    public List<ExecuteResult<TResult>> f = new ArrayList();

    @Override // com.huawei.hmf.tasks.Task
    public Task<TResult> addOnCanceledListener(OnCanceledListener onCanceledListener) {
        return a((ExecuteResult) new com.huawei.hmf.tasks.a.b(TaskExecutors.uiThread(), onCanceledListener));
    }

    @Override // com.huawei.hmf.tasks.Task
    public Task<TResult> addOnFailureListener(OnFailureListener onFailureListener) {
        return a((ExecuteResult) new f(TaskExecutors.uiThread(), onFailureListener));
    }

    @Override // com.huawei.hmf.tasks.Task
    public <TContinuationResult> Task<TContinuationResult> continueWith(Continuation<TResult, TContinuationResult> continuation) {
        Executor executorUiThread = TaskExecutors.uiThread();
        i iVar = new i();
        addOnCompleteListener(executorUiThread, new e(this, iVar, continuation));
        return iVar;
    }

    @Override // com.huawei.hmf.tasks.Task
    public <TContinuationResult> Task<TContinuationResult> continueWithTask(Continuation<TResult, Task<TContinuationResult>> continuation) {
        Executor executorUiThread = TaskExecutors.uiThread();
        i iVar = new i();
        addOnCompleteListener(executorUiThread, new d(this, continuation, iVar));
        return iVar;
    }

    @Override // com.huawei.hmf.tasks.Task
    public boolean isSuccessful() {
        boolean z;
        synchronized (this.f12639a) {
            z = this.f12640b && !this.f12641c && this.e == null;
        }
        return z;
    }

    @Override // com.huawei.hmf.tasks.Task
    public <TContinuationResult> Task<TContinuationResult> onSuccessTask(SuccessContinuation<TResult, TContinuationResult> successContinuation) {
        Executor executorUiThread = TaskExecutors.uiThread();
        i iVar = new i();
        addOnSuccessListener(executorUiThread, new a(this, successContinuation, iVar));
        addOnFailureListener(new b(this, iVar));
        a((ExecuteResult) new com.huawei.hmf.tasks.a.b(TaskExecutors.uiThread(), new c(this, iVar)));
        return iVar;
    }

    @Override // com.huawei.hmf.tasks.Task
    public <TContinuationResult> Task<TContinuationResult> onSuccessTask(Executor executor, SuccessContinuation<TResult, TContinuationResult> successContinuation) {
        i iVar = new i();
        addOnSuccessListener(executor, new a(this, successContinuation, iVar));
        addOnFailureListener(new b(this, iVar));
        a((ExecuteResult) new com.huawei.hmf.tasks.a.b(TaskExecutors.uiThread(), new c(this, iVar)));
        return iVar;
    }

    @Override // com.huawei.hmf.tasks.Task
    public boolean isComplete() {
        boolean z;
        synchronized (this.f12639a) {
            z = this.f12640b;
        }
        return z;
    }

    @Override // com.huawei.hmf.tasks.Task
    public boolean isCanceled() {
        return this.f12641c;
    }

    @Override // com.huawei.hmf.tasks.Task
    public final <E extends Throwable> TResult getResultThrowException(Class<E> cls) throws Throwable {
        TResult tresult;
        synchronized (this.f12639a) {
            if (cls != null) {
                if (cls.isInstance(this.e)) {
                    throw cls.cast(this.e);
                }
            }
            if (this.e != null) {
                throw new RuntimeException(this.e);
            }
            tresult = this.d;
        }
        return tresult;
    }

    @Override // com.huawei.hmf.tasks.Task
    public TResult getResult() {
        TResult tresult;
        synchronized (this.f12639a) {
            if (this.e != null) {
                throw new RuntimeException(this.e);
            }
            tresult = this.d;
        }
        return tresult;
    }

    @Override // com.huawei.hmf.tasks.Task
    public Exception getException() {
        Exception exc;
        synchronized (this.f12639a) {
            exc = this.e;
        }
        return exc;
    }

    @Override // com.huawei.hmf.tasks.Task
    public <TContinuationResult> Task<TContinuationResult> continueWithTask(Executor executor, Continuation<TResult, Task<TContinuationResult>> continuation) {
        i iVar = new i();
        addOnCompleteListener(executor, new d(this, continuation, iVar));
        return iVar;
    }

    @Override // com.huawei.hmf.tasks.Task
    public <TContinuationResult> Task<TContinuationResult> continueWith(Executor executor, Continuation<TResult, TContinuationResult> continuation) {
        i iVar = new i();
        addOnCompleteListener(executor, new e(this, iVar, continuation));
        return iVar;
    }

    public final void b() {
        synchronized (this.f12639a) {
            Iterator<ExecuteResult<TResult>> it = this.f.iterator();
            while (it.hasNext()) {
                try {
                    it.next().onComplete(this);
                } catch (RuntimeException e2) {
                    throw e2;
                } catch (Exception e3) {
                    throw new RuntimeException(e3);
                }
            }
            this.f = null;
        }
    }

    @Override // com.huawei.hmf.tasks.Task
    public Task<TResult> addOnSuccessListener(Executor executor, OnSuccessListener<TResult> onSuccessListener) {
        return a((ExecuteResult) new h(executor, onSuccessListener));
    }

    @Override // com.huawei.hmf.tasks.Task
    public Task<TResult> addOnSuccessListener(OnSuccessListener<TResult> onSuccessListener) {
        return addOnSuccessListener(TaskExecutors.uiThread(), onSuccessListener);
    }

    @Override // com.huawei.hmf.tasks.Task
    public Task<TResult> addOnSuccessListener(Activity activity, OnSuccessListener<TResult> onSuccessListener) {
        h hVar = new h(TaskExecutors.uiThread(), onSuccessListener);
        g.a(activity, hVar);
        return a((ExecuteResult) hVar);
    }

    @Override // com.huawei.hmf.tasks.Task
    public Task<TResult> addOnFailureListener(Executor executor, OnFailureListener onFailureListener) {
        return a((ExecuteResult) new f(executor, onFailureListener));
    }

    @Override // com.huawei.hmf.tasks.Task
    public Task<TResult> addOnFailureListener(Activity activity, OnFailureListener onFailureListener) {
        f fVar = new f(TaskExecutors.uiThread(), onFailureListener);
        g.a(activity, fVar);
        return a((ExecuteResult) fVar);
    }

    @Override // com.huawei.hmf.tasks.Task
    public Task<TResult> addOnCompleteListener(Executor executor, OnCompleteListener<TResult> onCompleteListener) {
        return a((ExecuteResult) new com.huawei.hmf.tasks.a.d(executor, onCompleteListener));
    }

    @Override // com.huawei.hmf.tasks.Task
    public Task<TResult> addOnCompleteListener(OnCompleteListener<TResult> onCompleteListener) {
        return addOnCompleteListener(TaskExecutors.uiThread(), onCompleteListener);
    }

    @Override // com.huawei.hmf.tasks.Task
    public Task<TResult> addOnCompleteListener(Activity activity, OnCompleteListener<TResult> onCompleteListener) {
        com.huawei.hmf.tasks.a.d dVar = new com.huawei.hmf.tasks.a.d(TaskExecutors.uiThread(), onCompleteListener);
        g.a(activity, dVar);
        return a((ExecuteResult) dVar);
    }

    @Override // com.huawei.hmf.tasks.Task
    public Task<TResult> addOnCanceledListener(Executor executor, OnCanceledListener onCanceledListener) {
        return a((ExecuteResult) new com.huawei.hmf.tasks.a.b(executor, onCanceledListener));
    }

    @Override // com.huawei.hmf.tasks.Task
    public Task<TResult> addOnCanceledListener(Activity activity, OnCanceledListener onCanceledListener) {
        com.huawei.hmf.tasks.a.b bVar = new com.huawei.hmf.tasks.a.b(TaskExecutors.uiThread(), onCanceledListener);
        g.a(activity, bVar);
        return a((ExecuteResult) bVar);
    }

    public final boolean a() {
        synchronized (this.f12639a) {
            if (this.f12640b) {
                return false;
            }
            this.f12640b = true;
            this.f12641c = true;
            this.f12639a.notifyAll();
            b();
            return true;
        }
    }

    public final void a(TResult tresult) {
        synchronized (this.f12639a) {
            if (!this.f12640b) {
                this.f12640b = true;
                this.d = tresult;
                this.f12639a.notifyAll();
                b();
            }
        }
    }

    /* JADX INFO: loaded from: classes33.dex */
    public class a implements OnSuccessListener<TResult> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ SuccessContinuation f12642a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ i f12643b;

        @Override // com.huawei.hmf.tasks.OnSuccessListener
        public void onSuccess(TResult tresult) {
            try {
                Task taskThen = this.f12642a.then(tresult);
                if (taskThen == null) {
                    this.f12643b.a((Exception) new NullPointerException("SuccessContinuation returned null"));
                } else {
                    ((i) taskThen).addOnCompleteListener(TaskExecutors.uiThread(), new C0087a());
                }
            } catch (Exception e) {
                this.f12643b.a(e);
            }
        }

        /* JADX INFO: Add missing generic type declarations: [TContinuationResult] */
        /* JADX INFO: renamed from: com.huawei.hmf.tasks.a.i$a$a, reason: collision with other inner class name */
        public class C0087a<TContinuationResult> implements OnCompleteListener<TContinuationResult> {
            @Override // com.huawei.hmf.tasks.OnCompleteListener
            public void onComplete(Task<TContinuationResult> task) {
                if (task.isSuccessful()) {
                    a.this.f12643b.a(task.getResult());
                } else if (((i) task).f12641c) {
                    a.this.f12643b.a();
                } else {
                    a.this.f12643b.a(task.getException());
                }
            }

            public C0087a() {
            }
        }

        public a(i iVar, SuccessContinuation successContinuation, i iVar2) {
            this.f12642a = successContinuation;
            this.f12643b = iVar2;
        }
    }

    public class b implements OnFailureListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i f12645a;

        @Override // com.huawei.hmf.tasks.OnFailureListener
        public void onFailure(Exception exc) {
            this.f12645a.a(exc);
        }

        public b(i iVar, i iVar2) {
            this.f12645a = iVar2;
        }
    }

    public class c implements OnCanceledListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i f12646a;

        @Override // com.huawei.hmf.tasks.OnCanceledListener
        public void onCanceled() {
            this.f12646a.a();
        }

        public c(i iVar, i iVar2) {
            this.f12646a = iVar2;
        }
    }

    /* JADX INFO: loaded from: classes33.dex */
    public class d implements OnCompleteListener<TResult> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Continuation f12647a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ i f12648b;

        @Override // com.huawei.hmf.tasks.OnCompleteListener
        public void onComplete(Task<TResult> task) {
            try {
                Task task2 = (Task) this.f12647a.then(task);
                if (task2 == null) {
                    this.f12648b.a((Exception) new NullPointerException("Continuation returned null"));
                } else {
                    ((i) task2).addOnCompleteListener(TaskExecutors.uiThread(), new a());
                }
            } catch (Exception e) {
                this.f12648b.a(e);
            }
        }

        /* JADX INFO: Add missing generic type declarations: [TContinuationResult] */
        public class a<TContinuationResult> implements OnCompleteListener<TContinuationResult> {
            @Override // com.huawei.hmf.tasks.OnCompleteListener
            public void onComplete(Task<TContinuationResult> task) {
                if (task.isSuccessful()) {
                    d.this.f12648b.a(task.getResult());
                } else if (((i) task).f12641c) {
                    d.this.f12648b.a();
                } else {
                    d.this.f12648b.a(task.getException());
                }
            }

            public a() {
            }
        }

        public d(i iVar, Continuation continuation, i iVar2) {
            this.f12647a = continuation;
            this.f12648b = iVar2;
        }
    }

    public final void a(Exception exc) {
        synchronized (this.f12639a) {
            if (!this.f12640b) {
                this.f12640b = true;
                this.e = exc;
                this.f12639a.notifyAll();
                b();
            }
        }
    }

    public class e implements OnCompleteListener<TResult> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i f12650a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Continuation f12651b;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.huawei.hmf.tasks.OnCompleteListener
        public void onComplete(Task<TResult> task) {
            if (((i) task).f12641c) {
                this.f12650a.a();
                return;
            }
            try {
                this.f12650a.a(this.f12651b.then(task));
            } catch (Exception e) {
                this.f12650a.a(e);
            }
        }

        public e(i iVar, i iVar2, Continuation continuation) {
            this.f12650a = iVar2;
            this.f12651b = continuation;
        }
    }

    public Task<TResult> a(ExecuteResult<TResult> executeResult) {
        boolean zIsComplete;
        synchronized (this.f12639a) {
            zIsComplete = isComplete();
            if (!zIsComplete) {
                this.f.add(executeResult);
            }
        }
        if (zIsComplete) {
            executeResult.onComplete(this);
        }
        return this;
    }
}
