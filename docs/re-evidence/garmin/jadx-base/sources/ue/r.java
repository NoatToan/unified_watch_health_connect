package ue;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class r implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f170115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f170116b;

    public /* synthetic */ r(AtomicBoolean atomicBoolean, int i14) {
        this.f170115a = i14;
        this.f170116b = atomicBoolean;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f170115a) {
            case 0:
                this.f170116b.set(true);
                break;
            default:
                this.f170116b.set(true);
                break;
        }
    }
}
