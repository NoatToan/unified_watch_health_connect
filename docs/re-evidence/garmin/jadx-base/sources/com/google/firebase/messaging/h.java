package com.google.firebase.messaging;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class h implements SuccessContinuation, RequestDeduplicator.GetTokenRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FirebaseMessaging f53768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f53769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Store.Token f53770c;

    public /* synthetic */ h(FirebaseMessaging firebaseMessaging, String str, Store.Token token) {
        this.f53768a = firebaseMessaging;
        this.f53769b = str;
        this.f53770c = token;
    }

    @Override // com.google.firebase.messaging.RequestDeduplicator.GetTokenRequest
    public Task start() {
        return this.f53768a.lambda$blockingGetToken$14(this.f53769b, this.f53770c);
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        return this.f53768a.lambda$blockingGetToken$13(this.f53769b, this.f53770c, (String) obj);
    }
}
