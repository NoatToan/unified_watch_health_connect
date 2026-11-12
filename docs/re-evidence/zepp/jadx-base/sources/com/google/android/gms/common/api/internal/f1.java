package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: Add missing generic type declarations: [TResult] */
/* JADX INFO: loaded from: classes3.dex */
final class f1<TResult> implements OnCompleteListener<TResult> {
    private final /* synthetic */ TaskCompletionSource a;
    private final /* synthetic */ zav b;

    public f1(zav zavVar, TaskCompletionSource taskCompletionSource) {
        this.b = zavVar;
        this.a = taskCompletionSource;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(@NonNull Task<TResult> task) {
        this.b.b.remove(this.a);
    }
}
