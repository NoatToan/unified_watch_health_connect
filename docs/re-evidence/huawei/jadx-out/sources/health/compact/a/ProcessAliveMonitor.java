package health.compact.a;

import android.content.Context;
import com.huawei.health.monitor.proc.prompt.PromptRecord;
import defpackage.ipb;
import defpackage.njy;
import defpackage.nzz;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class ProcessAliveMonitor {
    private static ProcessAliveMonitor e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f36624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f36625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private PromptRecord f36626c;

    private ProcessAliveMonitor(Context context) {
        Object obj = new Object();
        this.f36624a = obj;
        this.f36625b = null;
        this.f36626c = null;
        synchronized (obj) {
            this.f36625b = context;
            this.f36626c = new PromptRecord(context);
            long jD = AliveStatusMgr.d(this.f36625b);
            if (jD >= 300000) {
                health.compact.a.hwlogsmodel.ReleaseLogUtil.e("Step_ProcessAliveMonitor", "think process unexpect death long time, deathMills = ", Long.valueOf(jD));
                com.huawei.hwlogsmodel.LogUtil.j("Step_ProcessAliveMonitor", "death long time,working unusuall!!!");
                boolean zA = nzz.a();
                com.huawei.hwlogsmodel.LogUtil.a("Step_ProcessAliveMonitor", "isKeepAlive:", Boolean.valueOf(zA));
                if (zA) {
                    health.compact.a.hwlogsmodel.ReleaseLogUtil.d("Step_ProcessAliveMonitor", "isDeathLongTime(notEmui) true,need prompt");
                    this.f36626c.c(true);
                    ipb.j();
                    c();
                    return;
                }
                List<String> listD = ThirdMobileManager.d(this.f36625b);
                com.huawei.hwlogsmodel.LogUtil.a("Step_ProcessAliveMonitor", "hasThirdMobileMgr(isEmui) :", Boolean.valueOf(njy.e(listD)));
                boolean zB = SharedPreferenceManager.b(Integer.toString(10000), "clickKeepAliveGuide", false);
                if (njy.e(listD) && !zB && jD >= 10800000) {
                    health.compact.a.hwlogsmodel.ReleaseLogUtil.d("Step_ProcessAliveMonitor", "isDeathLongTime(Emui) true and hasThirdMobileMgr(Emui) false,Can Prompt Tips!!!");
                    this.f36626c.c(true);
                    c();
                    ipb.b(this.f36625b);
                    return;
                }
                if (njy.e(listD)) {
                    com.huawei.hwlogsmodel.LogUtil.a("Step_ProcessAliveMonitor", "isDeathLongTime(Emui) true and hasThirdMobileMgr(Emui) false,not need prompt");
                    this.f36626c.c(false);
                    c();
                    ipb.b(this.f36625b);
                    return;
                }
                ipb.e(listD);
                health.compact.a.hwlogsmodel.ReleaseLogUtil.d("Step_ProcessAliveMonitor", "isDeathLongTime(Emui) true and hasThirdMobileMgr(Emui) true,Can Prompt Tips!!!");
                this.f36626c.c(true);
                c();
                return;
            }
            com.huawei.hwlogsmodel.LogUtil.a("Step_ProcessAliveMonitor", "isDeathLongTime false,working correct");
            this.f36626c.c(false);
            c();
        }
    }

    public static ProcessAliveMonitor c(Context context) {
        synchronized (ProcessAliveMonitor.class) {
            try {
                if (context == null) {
                    com.huawei.hwlogsmodel.LogUtil.j("Step_ProcessAliveMonitor", "getInstance context null,return null");
                    return null;
                }
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    context = applicationContext;
                } else {
                    com.huawei.hwlogsmodel.LogUtil.j("Step_ProcessAliveMonitor", "appContext null,use context(not null)");
                }
                if (e == null) {
                    e = new ProcessAliveMonitor(context);
                }
                return e;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        synchronized (this.f36624a) {
            AliveStatusMgr.e(this.f36625b);
        }
    }

    public boolean d() {
        boolean zA;
        synchronized (this.f36624a) {
            zA = this.f36626c.a();
        }
        return zA;
    }

    public void b() {
        synchronized (this.f36624a) {
            this.f36626c.d();
        }
    }

    public void e() {
        synchronized (this.f36624a) {
            this.f36626c.c();
            i();
        }
    }

    public void a() {
        synchronized (this.f36624a) {
            this.f36626c.e();
            i();
        }
    }

    private void i() {
        AliveStatusMgr.b(this.f36625b);
    }
}
