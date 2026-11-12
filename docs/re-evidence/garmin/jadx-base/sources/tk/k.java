package tk;

import android.content.Context;
import android.os.RemoteException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import uk.u;

/* JADX INFO: loaded from: classes7.dex */
public class k extends c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Pattern f165241i = Pattern.compile("(\\d\\.\\d{2})\\.\\d{2}\\+VIVBCN\\d\\.\\d{2}");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final byte[] f165242j = {-7, -1, -1, -1, -1, -1, -1, -1};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f165243f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f165244g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ScheduledFuture<?> f165245h;

    public final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final byte[] f165246a;

        public a(byte[] bArr) {
            this.f165246a = bArr;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                k.this.f165210d.f(this.f165246a);
            } catch (RemoteException unused) {
            }
        }
    }

    public k(sk.a aVar, String str, String str2, c.e eVar, Context context) {
        super(aVar, str, str2, eVar, context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        this.f165243f = scheduledThreadPoolExecutor;
        this.f165244g = new Object();
        this.f165208b.f165227h = 129;
        scheduledThreadPoolExecutor.setContinueExistingPeriodicTasksAfterShutdownPolicy(false);
        scheduledThreadPoolExecutor.setExecuteExistingDelayedTasksAfterShutdownPolicy(false);
    }

    @Override // tk.c
    public final void a() {
        this.f165243f.shutdown();
    }

    @Override // tk.c
    public final yk.a b() {
        return new yk.a();
    }

    @Override // tk.c
    public final wk.a c() {
        return new wk.a();
    }

    public final void h() {
        synchronized (this.f165244g) {
            try {
                ScheduledFuture<?> scheduledFuture = this.f165245h;
                if (scheduledFuture == null) {
                    return;
                }
                scheduledFuture.cancel(true);
                this.f165245h = null;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public void i(byte[] bArr, byte b14, byte b15, u.a aVar) {
        this.f165208b.a(new j(this, aVar, b14, b15, bArr));
    }

    public void j(uk.i iVar) {
        int i14 = c.d.f165214a[iVar.ordinal()];
        if (i14 == 2 || i14 == 3) {
            this.f165208b.b();
        }
        if (iVar == uk.i.FINISHED_WITH_FAILURE || iVar == uk.i.FINISHED_WITH_SUCCESS) {
            k(30000L, f165242j);
        } else {
            h();
        }
    }

    public final void k(long j8, byte[] bArr) {
        synchronized (this.f165244g) {
            try {
                if (this.f165245h != null) {
                    return;
                }
                this.f165245h = this.f165243f.schedule(new a(bArr), j8, TimeUnit.MILLISECONDS);
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
