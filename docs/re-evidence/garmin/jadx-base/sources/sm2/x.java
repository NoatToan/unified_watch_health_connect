package sm2;

import java.util.TimerTask;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lsm2/x;", "Ljava/util/TimerTask;", "device-pairing_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class x extends TimerTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w f160361a;

    public x(w wVar) {
        this.f160361a = wVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        w.a(this.f160361a, "Response timeout");
    }
}
