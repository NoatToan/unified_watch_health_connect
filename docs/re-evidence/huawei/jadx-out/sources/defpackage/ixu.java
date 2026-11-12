package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import com.huawei.haf.handler.ExtendHandler;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.healthcloud.plugintrack.manager.inteface.ITrackPointDataUpdater;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.Constants;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public class ixu {
    private static final Object d = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<jbw> f38182a;
    private ExtendHandler e;
    private ScheduledExecutorService g;
    private List<jbw> h;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f38184c = 0.0f;
    private float f = 0.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f38183b = null;
    private ITrackPointDataUpdater j = null;

    public void a() {
        List<jbw> listE = jac.e(this.f38183b, "track_point_data.txt");
        this.h = listE;
        if (listE == null) {
            this.h = new ArrayList(16);
        } else {
            this.f38184c = 0.0f;
            this.f = 0.0f;
            for (jbw jbwVar : listE) {
                this.f38184c += jbwVar.c();
                this.f += jbwVar.d();
            }
            this.f38184c /= 1000.0f;
        }
        List<jbw> list = this.h;
        ReleaseLogUtil.d("Track_TrackPointDataUtils", "recoveryPointData ", list == null ? Constants.NULL : Integer.valueOf(list.size()));
    }

    public List<jbw> e() {
        return this.h;
    }

    public void d(Context context, boolean z) {
        LogUtil.a("Track_TrackPointDataUtils", "initTrackPointDataUtils ", this);
        if (this.e == null) {
            this.e = HandlerCenter.b(new Handler.Callback(this) { // from class: ixu.2
                @Override // android.os.Handler.Callback
                public boolean handleMessage(Message message) {
                    return false;
                }
            }, "TrackPointDataThread");
        }
        if (context != null) {
            this.f38183b = context;
        } else {
            this.f38183b = BaseApplication.getContext();
        }
        if (z) {
            a();
        } else {
            this.h = new ArrayList(16);
        }
        this.f38182a = new ArrayList(16);
        c();
    }

    public void d() {
        ITrackPointDataUpdater iTrackPointDataUpdater = this.j;
        if (iTrackPointDataUpdater != null) {
            e(iTrackPointDataUpdater.getDistance(), this.j.getActiveCalorie(), System.currentTimeMillis() + TimeUnit.MINUTES.toMillis(1L));
        } else {
            LogUtil.j("Track_TrackPointDataUtils", "stopTrackPointDataUtils mUpdater is null");
        }
        h();
        this.j = null;
    }

    public void b() {
        LogUtil.a("Track_TrackPointDataUtils", "destroyTrackPointDataUtils");
        ExtendHandler extendHandler = this.e;
        if (extendHandler != null) {
            extendHandler.quit(false);
            this.e = null;
        }
        jaf.c(this.f38183b, "track_point_data.txt");
    }

    public void e(float f, float f2, long j) {
        float f3 = this.f38184c;
        float f4 = this.f;
        long millis = (j / TimeUnit.MINUTES.toMillis(1L)) * TimeUnit.MINUTES.toMillis(1L);
        jbw jbwVar = new jbw();
        jbwVar.c(millis - TimeUnit.MINUTES.toMillis(1L));
        jbwVar.d(millis);
        jbwVar.e(f - f4);
        jbwVar.b((f2 - f3) * 1000.0f);
        this.h.add(jbwVar);
        this.f38182a.add(jbwVar);
        this.f38184c = f2;
        this.f = f;
        f();
    }

    private void f() {
        ExtendHandler extendHandler = this.e;
        if (extendHandler == null) {
            LogUtil.j("Track_TrackPointDataUtils", "mExtendHandler is null");
        } else {
            extendHandler.postTask(new Runnable() { // from class: ixu.1
                @Override // java.lang.Runnable
                public void run() {
                    if (jaf.b(ixu.this.f38183b, "track_point_data.txt", (List<jbw>) ixu.this.f38182a)) {
                        ixu.this.f38182a.clear();
                    }
                }
            });
        }
    }

    public void e(ITrackPointDataUpdater iTrackPointDataUpdater) {
        if (iTrackPointDataUpdater != null) {
            this.j = iTrackPointDataUpdater;
        }
    }

    private void c() {
        ReleaseLogUtil.d("Track_TrackPointDataUtils", "registerMinuteChangedReceiver");
        synchronized (d) {
            ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1);
            this.g = scheduledExecutorServiceNewScheduledThreadPool;
            scheduledExecutorServiceNewScheduledThreadPool.scheduleAtFixedRate(new e(), 0L, 1L, TimeUnit.SECONDS);
        }
    }

    private void h() {
        ReleaseLogUtil.d("Track_TrackPointDataUtils", "unregisterMinuteChangedReceiver");
        synchronized (d) {
            ScheduledExecutorService scheduledExecutorService = this.g;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdown();
                this.g = null;
            }
        }
    }

    class e implements Runnable {
        private long e;

        e() {
            long jCurrentTimeMillis = System.currentTimeMillis() / TimeUnit.MINUTES.toMillis(1L);
            this.e = jCurrentTimeMillis;
            ReleaseLogUtil.d("Track_TrackPointDataUtils", "SoftTimerTick start time ", Long.valueOf(jCurrentTimeMillis));
        }

        @Override // java.lang.Runnable
        public void run() {
            long jCurrentTimeMillis = System.currentTimeMillis() / TimeUnit.MINUTES.toMillis(1L);
            long j = this.e;
            if (j != jCurrentTimeMillis) {
                LogUtil.a("Track_TrackPointDataUtils", "Time Changed old ", Long.valueOf(j), " new ", Long.valueOf(jCurrentTimeMillis));
                if (ixu.this.j == null) {
                    ReleaseLogUtil.e("Track_TrackPointDataUtils", "mUpdater is null");
                } else {
                    ixu.this.e(ixu.this.j.getDistance(), ixu.this.j.getActiveCalorie(), System.currentTimeMillis());
                }
                this.e = jCurrentTimeMillis;
            }
        }
    }

    public void e(float f) {
        if (f <= 0.0f) {
            LogUtil.j("Track_TrackPointDataUtils", "changePointDataByRatio the ratio is illegal! ratio = ", Float.valueOf(f));
            return;
        }
        List<jbw> list = this.h;
        if (list == null || list.size() <= 0) {
            return;
        }
        for (jbw jbwVar : this.h) {
            jbwVar.e(jbwVar.d() * f);
            jbwVar.b(jbwVar.c() * f);
        }
    }
}
