package androidx.camera.core.impl;

import android.util.Size;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DeferrableSurface f5491b;

    public /* synthetic */ a1(String str, DeferrableSurface deferrableSurface) {
        this.f5490a = 0;
        this.f5491b = deferrableSurface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5490a) {
            case 0:
                DeferrableSurface deferrableSurface = this.f5491b;
                Size size = DeferrableSurface.f5464k;
                try {
                    deferrableSurface.f5471e.get();
                    DeferrableSurface.f5466m.decrementAndGet();
                    DeferrableSurface.f5465l.get();
                    deferrableSurface.toString();
                    return;
                } catch (Exception e4) {
                    deferrableSurface.toString();
                    synchronized (deferrableSurface.f5467a) {
                        throw new IllegalArgumentException(String.format("DeferrableSurface %s [closed: %b, use_count: %s] terminated with unexpected exception.", deferrableSurface, Boolean.valueOf(deferrableSurface.f5469c), Integer.valueOf(deferrableSurface.f5468b)), e4);
                    }
                }
            case 1:
                this.f5491b.a();
                return;
            case 2:
                this.f5491b.b();
                return;
            default:
                v.y1.f174117m.remove(this.f5491b);
                return;
        }
    }

    public /* synthetic */ a1(DeferrableSurface deferrableSurface, int i14) {
        this.f5490a = i14;
        this.f5491b = deferrableSurface;
    }
}
