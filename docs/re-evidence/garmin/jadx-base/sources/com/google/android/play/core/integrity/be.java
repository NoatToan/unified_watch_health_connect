package com.google.android.play.core.integrity;

import android.content.Context;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes14.dex */
final class be extends com.google.android.play.integrity.internal.t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f53329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ bn f53330b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public be(bn bnVar, TaskCompletionSource taskCompletionSource, Context context) {
        super(taskCompletionSource);
        this.f53329a = context;
        this.f53330b = bnVar;
    }

    @Override // com.google.android.play.integrity.internal.t
    public final void b() {
        this.f53330b.f53356d.trySetResult(Integer.valueOf(com.google.android.play.integrity.internal.ai.a(this.f53329a)));
    }
}
