package com.mapbox.common;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f54344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f54345b;

    public /* synthetic */ a(Object obj, int i14) {
        this.f54344a = i14;
        this.f54345b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        switch (this.f54344a) {
            case 0:
                ((ConnectionChangeCallback) this.f54345b).lambda$notifyReachability$0();
                break;
            default:
                RunloopErrorHandler.postErrorToMainLooper$lambda$0((Throwable) this.f54345b);
                break;
        }
    }
}
