package defpackage;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import com.xiaomi.push.b;
import com.xiaomi.push.fs;
import com.xiaomi.push.ft;
import com.xiaomi.push.service.XMPushService;

/* JADX INFO: loaded from: classes11.dex */
public class hus implements nws {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public XMPushService f20488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public gws f20489b;
    public int c;
    public Exception d;
    public long j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f20490k;
    public long f = 0;
    public long g = 0;
    public long h = 0;
    public long i = 0;
    public String e = "";

    public hus(XMPushService xMPushService) {
        this.j = 0L;
        this.f20490k = 0L;
        this.f20488a = xMPushService;
        c();
        int iMyUid = Process.myUid();
        try {
            this.f20490k = TrafficStats.getUidRxBytes(iMyUid);
            this.j = TrafficStats.getUidTxBytes(iMyUid);
        } catch (Exception e) {
            x9s.o("Failed to obtain traffic data during initialization: " + e);
            this.f20490k = -1L;
            this.j = -1L;
        }
    }

    private void c() {
        this.g = 0L;
        this.i = 0L;
        this.f = 0L;
        this.h = 0L;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (obs.v(this.f20488a)) {
            this.f = jElapsedRealtime;
        }
        if (this.f20488a.m836c()) {
            this.h = jElapsedRealtime;
        }
    }

    @Override // defpackage.nws
    public void a(gws gwsVar) {
        this.c = 0;
        this.d = null;
        this.f20489b = gwsVar;
        this.e = obs.j(this.f20488a);
        gvs.c(0, fs.CONN_SUCCESS.a());
    }

    public synchronized void b() {
        try {
            XMPushService xMPushService = this.f20488a;
            if (xMPushService == null) {
                return;
            }
            String strJ = obs.j(xMPushService);
            boolean zW = obs.w(this.f20488a);
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j = this.f;
            if (j > 0) {
                this.g += jElapsedRealtime - j;
                this.f = 0L;
            }
            long j2 = this.h;
            if (j2 != 0) {
                this.i += jElapsedRealtime - j2;
                this.h = 0L;
            }
            if (zW) {
                if ((!TextUtils.equals(this.e, strJ) && this.g > 30000) || this.g > 5400000) {
                    d();
                }
                this.e = strJ;
                if (this.f == 0) {
                    this.f = jElapsedRealtime;
                }
                if (this.f20488a.m836c()) {
                    this.h = jElapsedRealtime;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void d() {
        x9s.B("stat connpt = " + this.e + " netDuration = " + this.g + " ChannelDuration = " + this.i + " channelConnectedTime = " + this.h);
        ft ftVar = new ft();
        ftVar.f66a = (byte) 0;
        ftVar.a(fs.CHANNEL_ONLINE_RATE.a());
        ftVar.a(this.e);
        ftVar.d((int) (System.currentTimeMillis() / 1000));
        ftVar.b((int) (this.g / 1000));
        ftVar.c((int) (this.i / 1000));
        b.e().i(ftVar);
        c();
    }

    public Exception a() {
        return this.d;
    }

    @Override // defpackage.nws
    public void a(gws gwsVar, int i, Exception exc) {
        long uidRxBytes;
        long uidTxBytes;
        if (this.c == 0 && this.d == null) {
            this.c = i;
            this.d = exc;
            gvs.k(gwsVar.d(), exc);
        }
        if (i == 22 && this.h != 0) {
            long jB = gwsVar.b() - this.h;
            if (jB < 0) {
                jB = 0;
            }
            this.i += jB + ((long) (qws.f() / 2));
            this.h = 0L;
        }
        b();
        int iMyUid = Process.myUid();
        try {
            uidRxBytes = TrafficStats.getUidRxBytes(iMyUid);
            uidTxBytes = TrafficStats.getUidTxBytes(iMyUid);
        } catch (Exception e) {
            x9s.o("Failed to obtain traffic data: " + e);
            uidRxBytes = -1;
            uidTxBytes = -1L;
        }
        x9s.B("Stats rx=" + (uidRxBytes - this.f20490k) + ", tx=" + (uidTxBytes - this.j));
        this.f20490k = uidRxBytes;
        this.j = uidTxBytes;
    }

    @Override // defpackage.nws
    public void b(gws gwsVar) {
        b();
        this.h = SystemClock.elapsedRealtime();
        gvs.e(0, fs.CONN_SUCCESS.a(), gwsVar.d(), gwsVar.a());
    }

    @Override // defpackage.nws
    public void a(gws gwsVar, Exception exc) {
        gvs.d(0, fs.CHANNEL_CON_FAIL.a(), 1, gwsVar.d(), obs.w(this.f20488a) ? 1 : 0);
        b();
    }
}
