package wb2;

import ch.qos.logback.classic.Logger;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes11.dex */
public abstract class r0 implements fc2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CountDownLatch f184114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f184115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Logger f184116c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Exception f184117d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public hy2.c f184118e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f184119f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final StringBuilder f184120g;

    public r0(String str, long j8) {
        this.f184114a = new CountDownLatch(1);
        this.f184117d = null;
        this.f184120g = new StringBuilder();
        this.f184115b = str;
        this.f184119f = j8;
        String strN = fb1.c.n("SYNC#", str);
        int i14 = gt2.c.f79010a;
        this.f184116c = gt2.b.f79005a.i(strN);
    }

    @Override // fc2.a
    public final void a(hy2.c cVar) {
        this.f184118e = cVar;
        StringBuilder sb3 = this.f184120g;
        String str = this.f184115b;
        sb3.append(str);
        sb3.append(" response code: ");
        sb3.append(e());
        sb3.append("\n");
        sb3.append(str);
        sb3.append(" response body: ");
        sb3.append(d());
        sb3.append("\n");
        if (cVar != null && cVar.b() != null) {
            sb3.append(str);
            sb3.append(" exception: ");
            sb3.append(c());
            sb3.append("\n");
        }
        this.f184114a.countDown();
    }

    public final void b() {
        Logger logger = this.f184116c;
        CountDownLatch countDownLatch = this.f184114a;
        try {
            countDownLatch.await(this.f184119f, TimeUnit.SECONDS);
            if (countDownLatch.getCount() > 0) {
                logger.error("No response for server call");
                this.f184117d = new IOException("No response for server call");
            }
        } catch (InterruptedException e4) {
            logger.error("Sync interrupted.");
            this.f184117d = e4;
        }
    }

    public final Exception c() {
        hy2.c cVar = this.f184118e;
        return cVar != null ? cVar.b() : this.f184117d;
    }

    public final String d() {
        Object data;
        hy2.c cVar = this.f184118e;
        if (cVar == null || (data = cVar.getData()) == null || !(data instanceof String)) {
            return null;
        }
        return (String) data;
    }

    public final int e() {
        hy2.c cVar = this.f184118e;
        if (cVar != null) {
            return cVar.getHttpResponseCode();
        }
        return -1;
    }

    public final boolean f() {
        return c() != null;
    }

    public final boolean g() {
        hy2.c cVar;
        return e() != -1 && (cVar = this.f184118e) != null && !cVar.c() && this.f184118e.b() == null && e() >= 400 && e() < 500;
    }

    public final void h(String str) {
        sn.a.t(this.f184120g, this.f184115b, " endpoint: ", str, "\n");
    }

    public r0(String str) {
        this(str, 45L);
    }
}
