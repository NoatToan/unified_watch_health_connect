package cz2;

import ch.qos.logback.core.spi.AbstractComponentTracker;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import o13.t;
import o53.b0;
import o53.l1;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;
import r1.q2;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u000bB)\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcz2/q;", "T", "", "Lkotlin/Function0;", "", "stillAliveListener", "", "pollingIntervalMillis", "maxPollingDurationMillis", "<init>", "(Le23/a;JJ)V", "a", "util-coroutines_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class q<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e23.a<Unit> f56959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f56960b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f56961c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f56962d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o53.s f56963e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicLong f56964f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicReference<l1> f56965g;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Lo53/b0;", "invoke", "()Lo53/b0;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    public static final class b extends w implements e23.a<b0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f56966a = new b();

        public b() {
            super(0);
        }

        @Override // e23.a
        public final b0 invoke() {
            return q2.l("PolledProgressMonitor");
        }
    }

    static {
        new a(null);
    }

    public q(e23.a<Unit> aVar, long j8, long j14) {
        aVar.getClass();
        this.f56959a = aVar;
        this.f56960b = j8;
        this.f56961c = j14;
        this.f56962d = o13.m.b(b.f56966a);
        this.f56963e = gl.b.b();
        this.f56964f = new AtomicLong(0L);
        this.f56965g = new AtomicReference<>(null);
        if (j8 <= 0 || j14 <= 0) {
            vb.h.s("Polling milliseconds must be greater than 0");
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcz2/q$a;", "", "<init>", "()V", "", "DEFAULT_MAX_POLLING_MILLIS", "J", "DEFAULT_POLLING_INTERVAL_MILLIS", "util-coroutines_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ q(e23.a aVar, long j8, long j14, int i14, p005kotlin.jvm.internal.j jVar) {
        this(aVar, (i14 & 2) != 0 ? AbstractComponentTracker.LINGERING_TIMEOUT : j8, (i14 & 4) != 0 ? 600000L : j14);
    }
}
