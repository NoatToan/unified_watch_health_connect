package com.google.firebase.messaging;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f53762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f53763c;

    public /* synthetic */ e(Object obj, TaskCompletionSource taskCompletionSource, int i14) {
        this.f53761a = i14;
        this.f53762b = obj;
        this.f53763c = taskCompletionSource;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f53761a) {
            case 0:
                ((FirebaseMessaging) this.f53762b).lambda$deleteToken$9(this.f53763c);
                break;
            case 1:
                ((FirebaseMessaging) this.f53762b).lambda$getToken$7(this.f53763c);
                break;
            case 2:
                ((FirebaseMessaging) this.f53762b).lambda$deleteToken$8(this.f53763c);
                break;
            default:
                ((ImageDownload) this.f53762b).lambda$start$0(this.f53763c);
                break;
        }
    }
}
