package um2;

import al2.l;
import al2.n;
import com.garmin.device.filetransfer.core.util.CoreTransferException;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.Collection;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicBoolean;
import ok2.a0;
import ok2.g0;
import ok2.w;
import ok2.y;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p13.u;
import rm2.e;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0014BY\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\b\u0012\u00060\tj\u0002`\n\u0018\u00010\b\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lum2/b;", "", "Lrs2/c;", "device", "Lum2/a;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lrm2/e;", "syncFinishedCallback", "", "", "Lcom/garmin/device/filetransfer/DataType;", "downloadTypes", "", "suppressSoftwareDownload", "", "maxAllowedRetries", "", "syncStartTimeoutMillis", "<init>", "(Lrs2/c;Lum2/a;Lrm2/e;Ljava/util/Collection;ZIJ)V", "a", "device-pairing_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Logger f172015n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rs2.c f172016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final um2.a f172017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f172018c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Collection<String> f172019d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f172020e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f172021f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public a0 f172022g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f172023h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Timer f172024i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f172025j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f172026k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AtomicBoolean f172027l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final c f172028m;

    /* JADX INFO: renamed from: um2.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"um2/b$b", "Ljava/util/TimerTask;", "device-pairing_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class C3205b extends TimerTask {
        public C3205b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            boolean z14;
            b bVar = b.this;
            Logger logger = b.f172015n;
            if (bVar.b()) {
                return;
            }
            synchronized (bVar.f172023h) {
                z14 = bVar.f172026k;
            }
            b.f172015n.error("Timed out waiting for sync start. wasRejected:" + z14);
            bVar.a("Sync start timeout", z14);
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"um2/b$c", "Lal2/e;", "device-pairing_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c implements al2.e {
        public c() {
        }

        @Override // al2.m
        public final void B(n nVar) {
        }

        @Override // al2.e
        public final void s(al2.a aVar) {
            long f172494b = aVar.f3759a.getF172494b();
            b bVar = b.this;
            if (f172494b != bVar.f172016a.getF172494b()) {
                return;
            }
            float fA = aVar.a();
            um2.a aVar2 = bVar.f172017b;
            if (aVar2 != null) {
                aVar2.a(fA);
            }
        }

        @Override // al2.m
        public final void u(l lVar) {
            lVar.getClass();
        }

        @Override // al2.e
        public final void y(al2.c cVar) {
            b bVar = b.this;
            Logger logger = b.f172015n;
            bVar.getClass();
            if (cVar.f3775a.getF172494b() != bVar.f172016a.getF172494b()) {
                return;
            }
            al2.b bVar2 = cVar.f3777c;
            if (bVar2.f3774a) {
                CoreTransferException coreTransferException = cVar.f3778d;
                if (bVar2 == al2.b.SUCCESS || bVar2 == al2.b.NO_ITEMS || coreTransferException == null) {
                    bVar.a(null, true);
                    return;
                }
                if (coreTransferException.getFailure().a() || coreTransferException.getFailure() == ok2.e.f132643k || coreTransferException.getFailure() == ok2.e.f132642j) {
                    bVar.a(coreTransferException.getFailure().name(), true);
                    return;
                } else {
                    if (bVar.b()) {
                        return;
                    }
                    bVar.a(coreTransferException.getFailure().name(), false);
                    return;
                }
            }
            if (bVar2 == al2.b.STARTED) {
                g0 g0Var = cVar.f3776b;
                if (g0Var != g0.USER_INITIATED_PREFERRED) {
                    bVar.a("Low priority " + g0Var + " sync started", true);
                    return;
                }
                um2.a aVar = bVar.f172017b;
                if (aVar != null) {
                    aVar.b();
                }
                synchronized (bVar.f172023h) {
                    Timer timer = bVar.f172024i;
                    if (timer != null) {
                        timer.cancel();
                        Unit unit = Unit.INSTANCE;
                    }
                }
            }
        }
    }

    static {
        new a(null);
        f172015n = LoggerFactory.getLogger("PAIR#SettingsSyncHandler");
    }

    public b(rs2.c cVar, um2.a aVar, e eVar, Set set, boolean z14, int i14, long j8, int i15, j jVar) {
        this(cVar, aVar, eVar, (i15 & 8) != 0 ? u.m0(new String[]{"FIT_TYPE_2", "FIT_TYPE_41"}) : set, (i15 & 16) != 0 ? false : z14, (i15 & 32) != 0 ? 1 : i14, (i15 & 64) != 0 ? 30000L : j8);
    }

    public final void a(String str, boolean z14) {
        f172015n.info("handleSyncFinished(" + z14 + ", " + str + ")");
        um2.a aVar = this.f172017b;
        if (aVar != null) {
            aVar.c(str, z14);
        }
        synchronized (this.f172023h) {
            Timer timer = this.f172024i;
            if (timer != null) {
                timer.cancel();
                Unit unit = Unit.INSTANCE;
            }
        }
        this.f172022g.j(this.f172028m);
        e eVar = this.f172018c;
        if (eVar != null) {
            sm2.l lVar = (sm2.l) eVar;
            if (lVar.f132976b.get() == null) {
                return;
            }
            lVar.f160341g.submit(new a0.a(lVar, z14, 13));
        }
    }

    public final boolean b() {
        int i14 = this.f172025j;
        if (i14 >= this.f172020e) {
            return false;
        }
        this.f172025j = i14 + 1;
        w wVarA = this.f172022g.a(this.f172016a.getF172493a());
        if (wVarA == null || !wVarA.l()) {
            wVarA = null;
        }
        if (wVarA == null) {
            return false;
        }
        f172015n.warn("Sync did not complete. Attempt retry: " + this.f172025j);
        c();
        wVarA.f(new y((Collection) null, (Collection) this.f172019d, y.d.BLOCKED, y.d.FORCED, false, 16, (j) null), new um2.c(this));
        return true;
    }

    public final void c() {
        synchronized (this.f172023h) {
            try {
                Timer timer = this.f172024i;
                if (timer != null) {
                    timer.cancel();
                }
                Timer timer2 = new Timer();
                this.f172024i = timer2;
                timer2.schedule(new C3205b(), this.f172021f);
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001c\u0010\t\u001a\n \b*\u0004\u0018\u00010\u00070\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006¨\u0006\u0010"}, d2 = {"Lum2/b$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "LOGGER", "Lorg/slf4j/Logger;", "", "SYNC_START_TIMEOUT", "J", "SETTINGS_DATA_TYPE", "SETTINGS_CHANGE_DATA_TYPE", "device-pairing_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(rs2.c cVar, um2.a aVar, e eVar, Collection<String> collection) {
        this(cVar, aVar, eVar, collection, false, 0, 0L, 112, null);
        cVar.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(rs2.c cVar, um2.a aVar, e eVar, Collection<String> collection, boolean z14) {
        this(cVar, aVar, eVar, collection, z14, 0, 0L, 96, null);
        cVar.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(rs2.c cVar, um2.a aVar, e eVar, Collection<String> collection, boolean z14, int i14) {
        this(cVar, aVar, eVar, collection, z14, i14, 0L, 64, null);
        cVar.getClass();
    }

    public b(rs2.c cVar, um2.a aVar, e eVar, Collection<String> collection, boolean z14, int i14, long j8) {
        cVar.getClass();
        this.f172016a = cVar;
        this.f172017b = aVar;
        this.f172018c = eVar;
        this.f172019d = collection;
        this.f172020e = i14;
        this.f172021f = j8;
        this.f172022g = a0.f132585h.a();
        this.f172023h = new Object();
        this.f172027l = new AtomicBoolean(false);
        this.f172028m = new c();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(rs2.c cVar, um2.a aVar, e eVar) {
        this(cVar, aVar, eVar, null, false, 0, 0L, 120, null);
        cVar.getClass();
    }
}
