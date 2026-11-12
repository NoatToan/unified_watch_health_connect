package defpackage;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes5.dex */
public final class bet extends bct {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f4135b;
    public final /* synthetic */ bct c;
    public final /* synthetic */ fht d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bet(fht fhtVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, bct bctVar) {
        super(taskCompletionSource);
        this.f4135b = taskCompletionSource2;
        this.c = bctVar;
        this.d = fhtVar;
    }

    @Override // defpackage.bct
    public final void a() {
        synchronized (this.d.f) {
            try {
                fht.n(this.d, this.f4135b);
                if (this.d.f17800k.getAndIncrement() > 0) {
                    this.d.f17799b.d("Already connected to the service.", new Object[0]);
                }
                fht.p(this.d, this.c);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
