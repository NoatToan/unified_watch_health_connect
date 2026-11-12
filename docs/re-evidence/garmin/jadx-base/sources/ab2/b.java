package ab2;

import android.os.Handler;
import android.os.HandlerThread;
import androidx.lifecycle.y0;
import gt2.c;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import sd2.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lab2/b;", "Ljava/util/Observer;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements Observer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f2642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final y0<ArrayList<f>> f2643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final rd2.f f2644c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Logger f2645d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Handler f2646e;

    static {
        b bVar = new b();
        f2642a = bVar;
        f2643b = new y0<>();
        rd2.f fVarA = rd2.f.a();
        fVarA.getClass();
        f2644c = fVarA;
        int i14 = c.f79010a;
        Logger loggerH = gt2.b.f79005a.h("DevicesRepositoryLiveData");
        f2645d = loggerH;
        loggerH.debug("initializing...");
        HandlerThread handlerThread = new HandlerThread("DevicesRepositoryLiveData", 0);
        handlerThread.start();
        f2646e = new Handler(handlerThread.getLooper());
        loggerH.debug("handler ready");
        fVarA.addObserver(bVar);
        loggerH.debug("observing devices table");
    }

    private b() {
    }

    public static y0 a() {
        Logger logger = f2645d;
        logger.debug("loadAllLive: returning 'liveData' reference");
        Handler handler = f2646e;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            if (!handler.postDelayed(new a(0), 250L)) {
                logger.warn("scheduleQuery: failed to post to queue");
            }
        }
        return f2643b;
    }

    @Override // java.util.Observer
    public final void update(Observable observable, Object obj) {
        Handler handler;
        if (f2643b.f8011b.f128470d <= 0 || (handler = f2646e) == null) {
            return;
        }
        handler.removeCallbacksAndMessages(null);
        if (handler.postDelayed(new a(0), 750L)) {
            return;
        }
        f2645d.warn("scheduleQuery: failed to post to queue");
    }
}
