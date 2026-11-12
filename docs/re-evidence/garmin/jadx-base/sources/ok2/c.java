package ok2;

import android.os.SystemClock;
import com.garmin.device.filetransfer.core.util.CoreTransferException;
import com.google.android.exoplayer2.audio.SilenceSkippingAudioProcessor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lok2/c;", "", "Lok2/b;", "helper", "Lorg/slf4j/Logger;", "logger", "<init>", "(Lok2/b;Lorg/slf4j/Logger;)V", "a", "file-transfer-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final o13.p<Integer, Long> f132598j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f132599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Logger f132600b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f132601c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReference<cz2.g<Unit>> f132602d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public g0 f132603e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicLong f132604f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicReference<Float> f132605g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicReference<o13.p<Integer, Long>> f132606h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AtomicBoolean f132607i;

    static {
        new a(null);
        f132598j = new o13.p<>(-1, 0L);
    }

    public c(b bVar, Logger logger) {
        bVar.getClass();
        logger.getClass();
        this.f132599a = bVar;
        this.f132600b = logger;
        this.f132601c = new Object();
        this.f132602d = new AtomicReference<>(new cz2.g(SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US, new cl2.g(bVar.a())));
        this.f132604f = new AtomicLong(0L);
        this.f132605g = new AtomicReference<>(Float.valueOf(0.0f));
        this.f132606h = new AtomicReference<>(f132598j);
        this.f132607i = new AtomicBoolean(false);
    }

    public final boolean a() {
        this.f132602d.get().b(Unit.INSTANCE);
        this.f132605g.set(Float.valueOf(0.0f));
        synchronized (this.f132601c) {
            if (this.f132603e == null) {
                return false;
            }
            this.f132603e = null;
            return true;
        }
    }

    public final boolean b() {
        boolean z14;
        synchronized (this.f132601c) {
            z14 = this.f132603e != null;
        }
        return z14;
    }

    public final void c() {
        this.f132606h.set(f132598j);
        this.f132607i.set(false);
    }

    public final void d(g0 g0Var) {
        this.f132602d.getAndSet(new cz2.g<>(SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US, new cl2.g(this.f132599a.a()))).b(Unit.INSTANCE);
        this.f132605g.set(Float.valueOf(0.0f));
        synchronized (this.f132601c) {
            this.f132603e = g0Var;
        }
    }

    public final void e(g0 g0Var, g0 g0Var2) {
        g0Var.getClass();
        g0Var2.getClass();
        synchronized (this.f132601c) {
            try {
                g0 g0Var3 = this.f132603e;
                if (g0Var3 != null && !cl2.c.g(this.f132599a, g0Var3).contains(g0Var) && cl2.c.g(this.f132599a, g0Var2).contains(g0Var)) {
                    this.f132603e = g0Var;
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void f(g0 g0Var, CoreTransferException coreTransferException) {
        e failure;
        g0Var.getClass();
        if ((coreTransferException != null ? coreTransferException.getFailure() : null) == e.f132637e) {
            int iA = g0Var.a();
            Integer numValueOf = Integer.valueOf(iA);
            this.f132599a.a();
            this.f132606h.set(new o13.p<>(numValueOf, Long.valueOf(SystemClock.elapsedRealtime())));
            this.f132600b.info("Device currently busy. Transfers at or below " + g0Var + "(" + iA + ") will be delayed");
        }
        if (coreTransferException == null || (failure = coreTransferException.getFailure()) == null || !failure.a()) {
            return;
        }
        this.f132607i.set(true);
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lok2/c$a;", "", "<init>", "()V", "", "NO_REJECTED_PRIORITY", "I", "Lo13/p;", "", "NO_REJECTED_PAIR", "Lo13/p;", "REJECTED_PRIORITY_TIMEOUT_MILLIS", "J", "file-transfer-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
