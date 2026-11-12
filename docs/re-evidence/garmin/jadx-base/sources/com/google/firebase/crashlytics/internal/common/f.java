package com.google.firebase.crashlytics.internal.common;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CrashlyticsCore f53702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f53703c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f53704d;

    public /* synthetic */ f(CrashlyticsCore crashlyticsCore, String str, String str2, int i14) {
        this.f53701a = i14;
        this.f53702b = crashlyticsCore;
        this.f53703c = str;
        this.f53704d = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f53701a) {
            case 0:
                this.f53702b.lambda$setCustomKey$5(this.f53703c, this.f53704d);
                break;
            default:
                this.f53702b.lambda$setInternalKey$7(this.f53703c, this.f53704d);
                break;
        }
    }
}
