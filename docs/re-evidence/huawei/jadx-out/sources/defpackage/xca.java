package defpackage;

import com.huawei.ui.thirdpartservice.syncdata.strava.StravaConfig;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class xca implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ StravaConfig f52693c;

    public /* synthetic */ xca(StravaConfig stravaConfig) {
        this.f52693c = stravaConfig;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f52693c.d();
    }
}
