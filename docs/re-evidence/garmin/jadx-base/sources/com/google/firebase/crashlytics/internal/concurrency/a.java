package com.google.firebase.crashlytics.internal.concurrency;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Callable f53712b;

    public /* synthetic */ a(Callable callable, int i14) {
        this.f53711a = i14;
        this.f53712b = callable;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        switch (this.f53711a) {
            case 0:
                return CrashlyticsWorker.lambda$submit$0(this.f53712b, task);
            case 1:
                return CrashlyticsWorker.lambda$submitTask$2(this.f53712b, task);
            case 2:
                return CrashlyticsWorker.lambda$submitTask$3(this.f53712b, task);
            default:
                return CrashlyticsWorker.lambda$submitTaskOnSuccess$4(this.f53712b, task);
        }
    }
}
