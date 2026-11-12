package vg1;

import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.settings.devices.common.FindMyWatchActivity;

/* JADX INFO: loaded from: classes10.dex */
public class p0 implements xt2.a.b {
    public p0(FindMyWatchActivity findMyWatchActivity) {
    }

    @Override // xt2.a.b
    public final void a(rs2.c cVar) {
        i2.c("cancel find my watch sent");
    }

    @Override // xt2.a.b
    public final void b(rs2.c cVar) {
        i2.a aVar = i2.f36769a;
        aVar.getClass();
        i2.a.q(aVar, "cancel find my watch failed to send");
    }
}
