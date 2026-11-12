package com.huawei.openalliance.ad.media;

import android.content.Context;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.fp;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.media.listener.ReportVideoTimeListener;
import com.huawei.openalliance.ad.utils.bu;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes12.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set<ReportVideoTimeListener> f19612a = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f19613b = Constants.TIMEOUT_TASK_ID + hashCode();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f19614c;
    private long d;
    private long e;
    private long f;
    private boolean g;
    private boolean h;
    private int i;
    private Context j;

    public void b(int i) {
        c(i);
        long jAk = fp.b(this.j).ak();
        if (hw.a()) {
            hw.a("VideoPlayTimeProcessor", "notifyVideoTimeWithVideoPause: %s", Long.valueOf(jAk));
        }
        bu.a(new Runnable() { // from class: com.huawei.openalliance.ad.media.b.1
            @Override // java.lang.Runnable
            public void run() {
                if (hw.a()) {
                    hw.a("VideoPlayTimeProcessor", "notifyVideoTimeWithVideoPause: videoStartTime %s , videoPauseTime %s", Long.valueOf(b.this.e), Long.valueOf(b.this.f));
                }
                if (b.this.g) {
                    return;
                }
                if (b.this.e == 0) {
                    b bVar = b.this;
                    bVar.b(bVar.f19614c);
                    return;
                }
                long j = b.this.f - b.this.e;
                b bVar2 = b.this;
                if (j > bVar2.i || j < 0) {
                    j = b.this.i;
                }
                bVar2.b(j);
                b.this.g = true;
            }
        }, this.f19613b, jAk);
    }

    public void a(ReportVideoTimeListener reportVideoTimeListener) {
        if (reportVideoTimeListener == null) {
            return;
        }
        this.f19612a.add(reportVideoTimeListener);
    }

    public void a(long j) {
        if (this.g || this.h) {
            this.g = false;
            this.h = true;
            return;
        }
        long j2 = this.f19614c;
        if (j2 != 0) {
            long jCurrentTimeMillis = System.currentTimeMillis() - this.f19614c;
            if (hw.a()) {
                hw.a("VideoPlayTimeProcessor", "notifyVideoTimeWithVideoEnd: videoTime %s  ,playTime %s", Long.valueOf(jCurrentTimeMillis), Long.valueOf(j));
            }
            if (jCurrentTimeMillis <= j && jCurrentTimeMillis >= 0) {
                j = jCurrentTimeMillis;
            }
            b(j);
            this.f19614c = 0L;
        } else {
            b(j2);
        }
        if (this.d != 0) {
            this.d = 0L;
        }
        this.h = true;
    }

    public void a(int i) {
        if (hw.a()) {
            hw.a("VideoPlayTimeProcessor", "notifyVideoTimeWithVideoStop");
        }
        a(i);
        bu.a(this.f19613b);
        this.f19614c = 0L;
    }

    public void a() {
        if (hw.a()) {
            hw.a("VideoPlayTimeProcessor", "notifyVideoTimeWithVideoStart: videoStartTime %s ", Long.valueOf(this.f19614c));
        }
        if (this.f19614c == 0) {
            this.f19614c = System.currentTimeMillis();
        } else {
            bu.a(this.f19613b);
        }
        if (this.d != 0) {
            this.d = 0L;
        }
        this.h = false;
    }

    private void c(int i) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.d = jCurrentTimeMillis;
        this.f = jCurrentTimeMillis;
        this.i = i;
        this.e = this.f19614c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(long j) {
        hw.b("VideoPlayTimeProcessor", "notifyVideoTime: videoTime: %s ", Long.valueOf(j));
        Iterator<ReportVideoTimeListener> it = this.f19612a.iterator();
        while (it.hasNext()) {
            it.next().reportVideoTime(j);
        }
    }

    public b(Context context) {
        this.j = context;
    }
}
