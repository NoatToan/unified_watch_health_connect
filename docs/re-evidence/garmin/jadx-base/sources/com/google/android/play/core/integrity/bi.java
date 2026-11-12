package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes14.dex */
class bi extends com.google.android.play.integrity.internal.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final TaskCompletionSource f53344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ bn f53345b;

    public bi(bn bnVar, TaskCompletionSource taskCompletionSource) {
        this.f53345b = bnVar;
        this.f53344a = taskCompletionSource;
    }

    @Override // com.google.android.play.integrity.internal.k
    public final void b(Bundle bundle) {
        this.f53345b.f53353a.v(this.f53344a);
    }

    @Override // com.google.android.play.integrity.internal.k
    public void c(Bundle bundle) {
        this.f53345b.f53353a.v(this.f53344a);
    }

    @Override // com.google.android.play.integrity.internal.k
    public final void d(Bundle bundle) {
        this.f53345b.f53353a.v(this.f53344a);
    }

    @Override // com.google.android.play.integrity.internal.k
    public void e(Bundle bundle) {
        this.f53345b.f53353a.v(this.f53344a);
    }
}
