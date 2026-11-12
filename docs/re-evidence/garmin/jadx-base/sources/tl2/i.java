package tl2;

import android.os.Handler;
import android.os.HandlerThread;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import com.google.common.util.concurrent.ListeningScheduledExecutorService;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.common.util.concurrent.SettableFuture;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\nB#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Ltl2/i;", "", "Lcom/garmin/device/nfc/g;", "dispatcher", "", "lockId", "Lpl2/e;", "cachedCapabilities", "<init>", "(Lcom/garmin/device/nfc/g;BLpl2/e;)V", "a", "nfc_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final g f165328k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Logger f165329l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final ListeningScheduledExecutorService f165330m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.garmin.device.nfc.g f165331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte f165332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final pl2.e f165333c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HandlerThread f165334d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final PriorityQueue<c> f165335e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f165336f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c f165337g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final CopyOnWriteArraySet f165338h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AtomicBoolean f165339i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Handler f165340j;

    static {
        new a(null);
        f165328k = new g(0);
        f165329l = LoggerFactory.getLogger("PAY#NFC#NfcTransferManager");
        f165330m = MoreExecutors.listeningDecorator(Executors.newSingleThreadScheduledExecutor());
    }

    public i(com.garmin.device.nfc.g gVar, byte b14, pl2.e eVar) {
        gVar.getClass();
        this.f165331a = gVar;
        this.f165332b = b14;
        this.f165333c = eVar;
        HandlerThread handlerThread = new HandlerThread("NfcTransferManager_HandlerThread");
        this.f165334d = handlerThread;
        this.f165335e = new PriorityQueue<>(11, f165328k);
        this.f165338h = new CopyOnWriteArraySet();
        this.f165339i = new AtomicBoolean(false);
        handlerThread.start();
        this.f165340j = new Handler(handlerThread.getLooper());
    }

    public static int e(i iVar, com.garmin.device.nfc.i iVar2, com.garmin.device.nfc.g.f fVar, long j8, int i14) {
        if ((i14 & 4) != 0) {
            j8 = AbstractComponentTracker.LINGERING_TIMEOUT;
        }
        iVar.getClass();
        xl2.b bVar = new xl2.b(iVar2, j8, 0, fVar);
        return iVar.f(new xl2.a(iVar.a(bVar), c.EnumC3105c.HIGH_PRIORITY_MESSAGE, false, 4, null));
    }

    public final e a(f fVar) {
        int i14 = this.f165336f;
        this.f165336f = i14 + 1;
        return new e(fVar, this.f165331a, this.f165340j, i14, this.f165332b);
    }

    public final int b(ul2.d dVar) {
        e eVarA = a(dVar);
        pl2.e eVar = this.f165333c;
        if (eVar != null) {
            eVar.getCapabilities();
        }
        return f(new ul2.c(eVarA, 2048, null, 4, null));
    }

    public final int c(ul2.d dVar) {
        e eVarA = a(dVar);
        pl2.e eVar = this.f165333c;
        if (eVar != null) {
            eVar.getCapabilities();
        }
        return f(new ul2.c(eVarA, 2048, c.EnumC3105c.HIGH_PRIORITY_MESSAGE));
    }

    public final SettableFuture d(com.garmin.device.nfc.i iVar, long j8, int i14) {
        xl2.b bVar = new xl2.b(iVar, j8, i14, null, 8, null);
        f(new xl2.a(a(bVar), c.EnumC3105c.HIGH_PRIORITY_MESSAGE, false, 4, null));
        return bVar.f191316f;
    }

    public final int f(c cVar) {
        synchronized (this.f165335e) {
            this.f165335e.add(cVar);
        }
        g(true);
        return cVar.f165291h;
    }

    public final void g(boolean z14) {
        c cVarRemove;
        synchronized (this.f165335e) {
            try {
                c cVar = this.f165337g;
                if (cVar != null) {
                    if (cVar.f165293j.get() == 1) {
                        return;
                    }
                }
                if (this.f165335e.isEmpty()) {
                    cVarRemove = null;
                } else {
                    if (z14) {
                        c cVarPeek = this.f165335e.peek();
                        c.EnumC3105c enumC3105c = cVarPeek != null ? cVarPeek.f165285b : null;
                        c.EnumC3105c enumC3105c2 = c.EnumC3105c.MULTI_PACKAGE_APDU;
                        if (enumC3105c == enumC3105c2) {
                            c cVar2 = this.f165337g;
                            if ((cVar2 != null ? cVar2.f165285b : null) != enumC3105c2) {
                                f165330m.schedule((Runnable) new h(this, 0), 15L, TimeUnit.SECONDS);
                                return;
                            }
                        }
                    }
                    cVarRemove = this.f165335e.remove();
                }
                c cVar3 = this.f165337g;
                Integer numValueOf = cVar3 != null ? Integer.valueOf(cVar3.f165291h) : null;
                if (numValueOf != null) {
                    f165329l.trace("Finished transfer: " + numValueOf);
                }
                this.f165337g = cVarRemove;
                boolean z15 = cVarRemove != null;
                if (this.f165339i.compareAndSet(!z15, z15)) {
                    Iterator it = this.f165338h.iterator();
                    while (it.hasNext()) {
                        ((j) it.next()).a(z15);
                    }
                }
                if (cVarRemove != null) {
                    f165329l.trace("Started transfer: " + Integer.valueOf(cVarRemove.f165291h));
                    c cVar4 = cVarRemove;
                    h hVar = new h(this, 1);
                    if (!cVar4.f165293j.compareAndSet(0, 1)) {
                        throw new IllegalStateException("startTransfer can only be called once.");
                    }
                    cVar4.f165294k = hVar;
                    cVar4.a();
                    cVar4.h(new b(cVar4, 0), 10);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001c\u0010\t\u001a\n \u0005*\u0004\u0018\u00010\b0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Ltl2/i$a;", "", "<init>", "()V", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "LOGGER", "Lorg/slf4j/Logger;", "Lcom/google/common/util/concurrent/ListeningScheduledExecutorService;", "EXECUTOR_SERVICE", "Lcom/google/common/util/concurrent/ListeningScheduledExecutorService;", "", "LOWEST_PRIORITY_DELAY", "J", "nfc_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ i(com.garmin.device.nfc.g gVar, byte b14, pl2.e eVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(gVar, b14, (i14 & 4) != 0 ? null : eVar);
    }
}
