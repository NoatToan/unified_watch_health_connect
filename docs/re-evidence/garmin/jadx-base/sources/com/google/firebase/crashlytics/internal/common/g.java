package com.google.firebase.crashlytics.internal.common;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CrashlyticsCore f53706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f53707c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f53708d;

    public /* synthetic */ g(CrashlyticsCore crashlyticsCore, long j8, String str, int i14) {
        this.f53705a = i14;
        this.f53706b = crashlyticsCore;
        this.f53707c = j8;
        this.f53708d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f53705a) {
            case 0:
                this.f53706b.lambda$log$2(this.f53707c, this.f53708d);
                break;
            default:
                this.f53706b.lambda$log$3(this.f53707c, this.f53708d);
                break;
        }
    }
}
