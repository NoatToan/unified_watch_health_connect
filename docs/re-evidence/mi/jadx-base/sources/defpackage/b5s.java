package defpackage;

import com.xiaomi.hm.health.bt.profile.gdsp.gps.SportType;
import com.xiaomi.hm.health.bt.profile.sport.IHMSportListener;
import com.xiaomi.hm.health.bt.profile.sport.SportCommand;
import com.xiaomi.hm.health.bt.profile.sport.SportConfig;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public class b5s implements IHMSportListener, aj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public pbs f3832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public IHMSportListener f3833b = null;
    public Timer c = null;
    public TimerTask d = null;
    public Object e = new Object();
    public int f = -1;
    public ExecutorService g = Executors.newSingleThreadExecutor();

    public class a extends TimerTask {
        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            b5s.this.f3832a.c(SportCommand.HEART, null);
        }
    }

    public b5s(jet jetVar) {
        this.f3832a = null;
        pbs pbsVar = new pbs(jetVar);
        this.f3832a = pbsVar;
        pbsVar.b(this);
    }

    public final /* synthetic */ void e(SportConfig sportConfig) {
        t5t.m("HMSportController", "sendConfig start");
        t5t.m("HMSportController", "sendConfig stop:" + (this.f3832a.init() && (this.f != 0 || this.f3832a.d(sportConfig))));
    }

    public final void f() {
        synchronized (this.e) {
            try {
                TimerTask timerTask = this.d;
                if (timerTask != null) {
                    timerTask.cancel();
                }
                Timer timer = this.c;
                if (timer != null) {
                    timer.cancel();
                    this.c.purge();
                }
                this.c = new Timer("sport");
                a aVar = new a();
                this.d = aVar;
                this.c.schedule(aVar, 5000L, 5000L);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized void g(final SportConfig sportConfig, IHMSportListener iHMSportListener) {
        t5t.m("HMSportController", "SportConfig:" + sportConfig);
        if (this.f == 1) {
            return;
        }
        this.f3833b = iHMSportListener;
        this.f = sportConfig.getSource();
        this.g.execute(new Runnable() { // from class: z4s
            @Override // java.lang.Runnable
            public final void run() {
                this.f40878a.e(sportConfig);
            }
        });
    }

    public final /* synthetic */ void h(SportCommand sportCommand, r6t r6tVar) {
        boolean zC;
        t5t.m("HMSportController", "sendCommand start");
        SportCommand sportCommand2 = SportCommand.PAUSE;
        if (sportCommand == sportCommand2) {
            f();
        } else if (sportCommand == SportCommand.RESUME || sportCommand == SportCommand.STOP) {
            j();
        }
        if (this.f3832a.n()) {
            zC = this.f3832a.f(sportCommand, r6tVar);
        } else {
            if (r6tVar != null && (sportCommand == SportCommand.SHOW || sportCommand == sportCommand2)) {
                r6t r6tVar2 = new r6t();
                r6tVar2.q(r6tVar.l());
                r6tVar2.k(r6tVar.j());
                SportType sportTypeR = r6tVar.r();
                if (sportTypeR == SportType.SPORT_TYPE_ODRUN) {
                    r6tVar2.s(r6tVar.n());
                    r6tVar2.b(r6tVar.a());
                } else if (sportTypeR == SportType.SPORT_TYPE_IDRUN) {
                    r6tVar2.z(r6tVar.v());
                    r6tVar2.x(r6tVar.t());
                } else if (sportTypeR == SportType.SPORT_TYPE_RIDING) {
                    r6tVar2.u(r6tVar.p());
                    r6tVar2.g(r6tVar.f());
                } else if (sportTypeR == SportType.SPORT_TYPE_WALKING) {
                    r6tVar2.x(r6tVar.t());
                    r6tVar2.u(r6tVar.p());
                }
                r6tVar = r6tVar2;
            }
            zC = this.f3832a.c(sportCommand, r6tVar);
        }
        if (sportCommand == SportCommand.STOP) {
            zC &= i();
        }
        t5t.m("HMSportController", "sendCommand stop:" + zC);
    }

    public final boolean i() {
        this.f = -1;
        return this.f3832a.deInit();
    }

    public void j() {
        synchronized (this.e) {
            try {
                TimerTask timerTask = this.d;
                if (timerTask != null) {
                    timerTask.cancel();
                }
                Timer timer = this.c;
                if (timer != null) {
                    timer.cancel();
                    this.c.purge();
                }
                this.c = null;
                this.d = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ void k(SportCommand sportCommand, r6t r6tVar) {
        t5t.m("HMSportController", "sendCommandPiece start");
        t5t.m("HMSportController", "sendCommandPiece stop:" + (sportCommand == SportCommand.STOP ? i() : this.f3832a.f(sportCommand, r6tVar)));
    }

    public synchronized void l(final SportCommand sportCommand, final r6t r6tVar) {
        t5t.m("HMSportController", "sendCommand:" + sportCommand);
        if (this.f != 0) {
            return;
        }
        this.g.execute(new Runnable() { // from class: y4s
            @Override // java.lang.Runnable
            public final void run() {
                this.f39795a.h(sportCommand, r6tVar);
            }
        });
    }

    public final synchronized void m(final SportCommand sportCommand, final r6t r6tVar) {
        t5t.m("HMSportController", "sendCommandPiece:" + sportCommand);
        if (this.f != 1) {
            return;
        }
        this.g.execute(new Runnable() { // from class: a5s
            @Override // java.lang.Runnable
            public final void run() {
                this.f663a.k(sportCommand, r6tVar);
            }
        });
    }

    @Override // com.xiaomi.hm.health.bt.profile.sport.IHMSportListener
    public void onSportCommand(SportCommand sportCommand) {
        if (sportCommand == SportCommand.PAUSE) {
            f();
        } else if (sportCommand == SportCommand.RESUME || sportCommand == SportCommand.STOP) {
            j();
        }
        IHMSportListener iHMSportListener = this.f3833b;
        if (iHMSportListener != null) {
            iHMSportListener.onSportCommand(sportCommand);
        }
    }

    @Override // defpackage.aj
    public void a(@NotNull SportConfig sportConfig, @NotNull IHMSportListener iHMSportListener) {
        g(sportConfig, iHMSportListener);
    }

    @Override // defpackage.aj
    public void b(@NotNull SportCommand sportCommand, @NotNull r6t r6tVar) {
        m(sportCommand, r6tVar);
    }

    @Override // defpackage.aj
    public void a(@NotNull SportCommand sportCommand, @NotNull r6t r6tVar) {
        l(sportCommand, r6tVar);
    }

    @Override // defpackage.aj
    public void a() {
        this.f = -1;
        j();
    }
}
