package com.google.firebase.messaging;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class p implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f53784b;

    public /* synthetic */ p(Object obj, int i14) {
        this.f53783a = i14;
        this.f53784b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f53783a) {
            case 0:
                ((SharedPreferencesQueue) this.f53784b).syncState();
                break;
            default:
                ((WithinAppServiceConnection.BindRequest) this.f53784b).lambda$arrangeTimeout$0();
                break;
        }
    }
}
