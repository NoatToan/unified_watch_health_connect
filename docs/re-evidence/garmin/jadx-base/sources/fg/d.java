package fg;

import android.app.Activity;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f71204a;

    public d(Activity activity) {
        this.f71204a = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f71204a.finish();
    }
}
