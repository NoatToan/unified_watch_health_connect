package com.google.android.play.integrity.internal;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes14.dex */
final class w extends t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f53451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ t f53452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ ae f53453c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(ae aeVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, t tVar) {
        super(taskCompletionSource);
        this.f53451a = taskCompletionSource2;
        this.f53452b = tVar;
        this.f53453c = aeVar;
    }

    @Override // com.google.android.play.integrity.internal.t
    public final void b() {
        synchronized (this.f53453c.f53414g) {
            try {
                ae.o(this.f53453c, this.f53451a);
                if (this.f53453c.f53420m.getAndIncrement() > 0) {
                    this.f53453c.f53410c.d("Already connected to the service.", new Object[0]);
                }
                ae.q(this.f53453c, this.f53452b);
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
