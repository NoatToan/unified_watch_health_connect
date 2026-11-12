package com.google.firebase.messaging;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d implements SuccessContinuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f53760b;

    public /* synthetic */ d(String str, int i14) {
        this.f53759a = i14;
        this.f53760b = str;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public final Task then(Object obj) {
        switch (this.f53759a) {
            case 0:
                return FirebaseMessaging.lambda$subscribeToTopic$10(this.f53760b, (TopicsSubscriber) obj);
            default:
                return FirebaseMessaging.lambda$unsubscribeFromTopic$11(this.f53760b, (TopicsSubscriber) obj);
        }
    }
}
