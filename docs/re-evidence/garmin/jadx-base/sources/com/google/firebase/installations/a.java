package com.google.firebase.installations;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FirebaseInstallations f53748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f53749c;

    public /* synthetic */ a(FirebaseInstallations firebaseInstallations, boolean z14, int i14) {
        this.f53747a = i14;
        this.f53748b = firebaseInstallations;
        this.f53749c = z14;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f53747a) {
            case 0:
                this.f53748b.lambda$doRegistrationOrRefresh$3(this.f53749c);
                break;
            default:
                this.f53748b.lambda$getToken$2(this.f53749c);
                break;
        }
    }
}
