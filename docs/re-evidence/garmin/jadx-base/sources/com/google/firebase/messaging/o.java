package com.google.firebase.messaging;

import android.content.Intent;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o implements Continuation, OnCompleteListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f53781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f53782b;

    public /* synthetic */ o(Object obj, Object obj2) {
        this.f53781a = obj;
        this.f53782b = obj2;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        ((EnhancedIntentService) this.f53781a).lambda$onStartCommand$1((Intent) this.f53782b, task);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        return ((RequestDeduplicator) this.f53781a).lambda$getOrStartGetTokenRequest$0((String) this.f53782b, task);
    }
}
