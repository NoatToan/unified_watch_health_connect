package ph;

import ch.qos.logback.core.spi.AbstractComponentTracker;
import ph.c.b;

/* JADX INFO: loaded from: classes7.dex */
public class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f137645a;

    public a(c cVar) {
        this.f137645a = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        c cVar = this.f137645a;
        if (cVar.f137647a == null) {
            c.b bVar = cVar.new b(cVar.f137648b);
            cVar.f137647a = bVar;
            bVar.setCancelable(false);
        }
        try {
            if (cVar.f137647a.isShowing()) {
                return;
            }
            cVar.f137647a.show();
            cVar.f137650d.sendEmptyMessageDelayed(1, AbstractComponentTracker.LINGERING_TIMEOUT);
        } catch (Exception e4) {
            nh.d.a(e4);
        }
    }
}
