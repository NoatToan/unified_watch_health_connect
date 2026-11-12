package vg1;

import android.os.Handler;
import com.garmin.android.apps.connectmobile.settings.devices.common.FindMyWatchActivity;

/* JADX INFO: loaded from: classes10.dex */
public class o0 implements xt2.a.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FindMyWatchActivity f178144a;

    public o0(FindMyWatchActivity findMyWatchActivity) {
        this.f178144a = findMyWatchActivity;
    }

    @Override // xt2.a.d
    public final void c(rs2.c cVar) {
        Handler handler = this.f178144a.f42783a;
        if (handler != null) {
            handler.post(new n0(this, 1));
        }
    }

    @Override // xt2.a.d
    public final void d(rs2.c cVar) {
        Handler handler = this.f178144a.f42783a;
        if (handler != null) {
            handler.post(new n0(this, 0));
        }
    }
}
