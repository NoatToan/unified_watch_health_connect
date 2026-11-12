package com.google.firebase.remoteconfig;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Continuation, SuccessContinuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f53814b;

    public /* synthetic */ a(Object obj, int i14) {
        this.f53813a = i14;
        this.f53814b = obj;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        switch (this.f53813a) {
            case 0:
                return Boolean.valueOf(((FirebaseRemoteConfig) this.f53814b).processActivatePutTask(task));
            default:
                return FirebaseRemoteConfig.lambda$ensureInitialized$0((Task) this.f53814b, task);
        }
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        return ((FirebaseRemoteConfig) this.f53814b).lambda$fetchAndActivate$1((Void) obj);
    }
}
