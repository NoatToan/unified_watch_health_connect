package p3;

import android.os.Trace;
import ch.qos.logback.core.CoreConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import p005kotlin.KotlinNothingValueException;
import p005kotlin.Metadata;
import p005kotlin.NoWhenBranchMatchedException;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0010\u0012\n\u0010\u0014\u001a\u00060\u0012j\u0002`\u0013¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lp3/g2;", "Lp3/f2;", "Lp3/r;", "composition", "Lp3/p;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lp3/v0;", "composer", "", "Lp3/y2;", "abandonSet", "Lkotlin/Function0;", "", FirebaseAnalytics.Param.CONTENT, "", "reusable", "Lp3/c;", "applier", "", "Landroidx/compose/runtime/platform/SynchronizedObject;", "lock", "<init>", "(Lp3/r;Lp3/p;Lp3/v0;Ljava/util/Set;Le23/p;ZLp3/c;Ljava/lang/Object;)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g2 implements f2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f135088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f135089b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v0 f135090c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e23.p<m, Integer, Unit> f135091d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f135092e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c<?> f135093f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f135094g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicReference<h2> f135095h = new AtomicReference<>(h2.InitialPending);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f135096i = z3.k.a();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p1.h1<p2> f135097j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final z3.l f135098k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final w2<Object> f135099l;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f135100a;

        static {
            int[] iArr = new int[h2.values().length];
            try {
                iArr[h2.InitialPending.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[h2.RecomposePending.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[h2.Recomposing.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[h2.ApplyPending.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[h2.Applied.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[h2.Cancelled.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[h2.Invalid.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f135100a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g2(r rVar, p pVar, v0 v0Var, Set<y2> set, e23.p<? super m, ? super Integer, Unit> pVar2, boolean z14, c<?> cVar, Object obj) {
        this.f135088a = rVar;
        this.f135089b = pVar;
        this.f135090c = v0Var;
        this.f135091d = pVar2;
        this.f135092e = z14;
        this.f135093f = cVar;
        this.f135094g = obj;
        p1.u0<Object> u0Var = p1.i1.f134743a;
        u0Var.getClass();
        this.f135097j = u0Var;
        z3.l lVar = new z3.l();
        lVar.g(set, v0Var.T());
        this.f135098k = lVar;
        this.f135099l = new w2<>(cVar.getCurrent());
    }

    /* JADX WARN: Code duplicated, block: B:33:0x009a A[Catch: Exception -> 0x0023, TryCatch #2 {Exception -> 0x0023, blocks: (B:3:0x0002, B:6:0x001d, B:7:0x0022, B:10:0x0026, B:11:0x002d, B:12:0x002e, B:13:0x0035, B:14:0x0036, B:15:0x003d, B:16:0x003e, B:17:0x0045, B:18:0x0046, B:19:0x0050, B:20:0x0051, B:21:0x0055, B:27:0x007d, B:29:0x008d, B:30:0x0093, B:36:0x00bb, B:38:0x00c3, B:33:0x009a, B:35:0x00a0, B:40:0x00c9, B:41:0x00cf, B:43:0x00d5, B:46:0x00dc, B:47:0x00f7, B:24:0x005c, B:26:0x0062, B:50:0x00fe, B:53:0x010b, B:54:0x010e, B:55:0x0112, B:61:0x013a, B:63:0x0142, B:58:0x0119, B:60:0x011f, B:68:0x014d, B:69:0x0150, B:28:0x007f, B:51:0x0101), top: B:76:0x0002, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00c3 A[Catch: Exception -> 0x0023, TryCatch #2 {Exception -> 0x0023, blocks: (B:3:0x0002, B:6:0x001d, B:7:0x0022, B:10:0x0026, B:11:0x002d, B:12:0x002e, B:13:0x0035, B:14:0x0036, B:15:0x003d, B:16:0x003e, B:17:0x0045, B:18:0x0046, B:19:0x0050, B:20:0x0051, B:21:0x0055, B:27:0x007d, B:29:0x008d, B:30:0x0093, B:36:0x00bb, B:38:0x00c3, B:33:0x009a, B:35:0x00a0, B:40:0x00c9, B:41:0x00cf, B:43:0x00d5, B:46:0x00dc, B:47:0x00f7, B:24:0x005c, B:26:0x0062, B:50:0x00fe, B:53:0x010b, B:54:0x010e, B:55:0x0112, B:61:0x013a, B:63:0x0142, B:58:0x0119, B:60:0x011f, B:68:0x014d, B:69:0x0150, B:28:0x007f, B:51:0x0101), top: B:76:0x0002, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x0142 A[Catch: Exception -> 0x0023, TRY_LEAVE, TryCatch #2 {Exception -> 0x0023, blocks: (B:3:0x0002, B:6:0x001d, B:7:0x0022, B:10:0x0026, B:11:0x002d, B:12:0x002e, B:13:0x0035, B:14:0x0036, B:15:0x003d, B:16:0x003e, B:17:0x0045, B:18:0x0046, B:19:0x0050, B:20:0x0051, B:21:0x0055, B:27:0x007d, B:29:0x008d, B:30:0x0093, B:36:0x00bb, B:38:0x00c3, B:33:0x009a, B:35:0x00a0, B:40:0x00c9, B:41:0x00cf, B:43:0x00d5, B:46:0x00dc, B:47:0x00f7, B:24:0x005c, B:26:0x0062, B:50:0x00fe, B:53:0x010b, B:54:0x010e, B:55:0x0112, B:61:0x013a, B:63:0x0142, B:58:0x0119, B:60:0x011f, B:68:0x014d, B:69:0x0150, B:28:0x007f, B:51:0x0101), top: B:76:0x0002, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x00a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:? A[LOOP:1: B:30:0x0093->B:82:?, LOOP_END, SYNTHETIC] */
    @Override // p3.f2
    public final boolean a(e3 e3Var) throws Exception {
        long j8;
        h2 h2Var;
        h2 h2Var2;
        AtomicReference<h2> atomicReference = this.f135095h;
        try {
            int i14 = a.f135100a[atomicReference.get().ordinal()];
            r rVar = this.f135088a;
            p pVar = this.f135089b;
            switch (i14) {
                case 1:
                    v0 v0Var = this.f135090c;
                    boolean z14 = this.f135092e;
                    if (z14) {
                        v0Var.X();
                    }
                    try {
                        this.f135097j = pVar.b(rVar, e3Var, this.f135091d);
                        if (z14) {
                            v0Var.S();
                        }
                        h2 h2Var3 = h2.InitialPending;
                        h2 h2Var4 = h2.RecomposePending;
                        while (!atomicReference.compareAndSet(h2Var3, h2Var4)) {
                            if (atomicReference.get() != h2Var3) {
                                j2.b("Unexpected state change from: " + h2Var3 + " to: " + h2Var4 + '.');
                                if (this.f135097j.b()) {
                                    c();
                                }
                                return isComplete();
                            }
                        }
                        if (this.f135097j.b()) {
                            c();
                        }
                        return isComplete();
                    } catch (Throwable th3) {
                        if (z14) {
                            v0Var.S();
                        }
                        throw th3;
                    }
                case 2:
                    h2 h2Var5 = h2.RecomposePending;
                    h2 h2Var6 = h2.Recomposing;
                    try {
                        while (!atomicReference.compareAndSet(h2Var5, h2Var6)) {
                            if (atomicReference.get() != h2Var5) {
                                j2.b("Unexpected state change from: " + h2Var5 + " to: " + h2Var6 + '.');
                                j8 = this.f135096i;
                                this.f135096i = z3.k.a();
                                this.f135097j = pVar.q(rVar, e3Var, this.f135097j);
                                this.f135096i = j8;
                                h2Var = h2.Recomposing;
                                h2Var2 = h2.RecomposePending;
                                while (!atomicReference.compareAndSet(h2Var, h2Var2)) {
                                    if (atomicReference.get() != h2Var) {
                                        j2.b("Unexpected state change from: " + h2Var + " to: " + h2Var2 + '.');
                                        if (this.f135097j.b()) {
                                            c();
                                        }
                                        return isComplete();
                                    }
                                }
                                if (this.f135097j.b()) {
                                    c();
                                }
                                return isComplete();
                            }
                        }
                        this.f135096i = z3.k.a();
                        this.f135097j = pVar.q(rVar, e3Var, this.f135097j);
                        this.f135096i = j8;
                        h2Var = h2.Recomposing;
                        h2Var2 = h2.RecomposePending;
                        while (!atomicReference.compareAndSet(h2Var, h2Var2)) {
                            if (atomicReference.get() != h2Var) {
                                j2.b("Unexpected state change from: " + h2Var + " to: " + h2Var2 + '.');
                                if (this.f135097j.b()) {
                                    c();
                                }
                                return isComplete();
                            }
                        }
                        if (this.f135097j.b()) {
                            c();
                        }
                        return isComplete();
                    } catch (Throwable th4) {
                        this.f135096i = j8;
                        h2 h2Var7 = h2.Recomposing;
                        h2 h2Var8 = h2.RecomposePending;
                        while (!atomicReference.compareAndSet(h2Var7, h2Var8)) {
                            if (atomicReference.get() != h2Var7) {
                                j2.b("Unexpected state change from: " + h2Var7 + " to: " + h2Var8 + '.');
                                throw th4;
                            }
                        }
                        throw th4;
                    }
                    j8 = this.f135096i;
                case 3:
                    n.b("Recursive call to resume()");
                    throw new KotlinNothingValueException();
                case 4:
                    throw new IllegalStateException("Pausable composition is complete and apply() should be applied");
                case 5:
                    throw new IllegalStateException("The paused composition has been applied");
                case 6:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 7:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                default:
                    throw new NoWhenBranchMatchedException();
            }
        } catch (Exception e4) {
            atomicReference.set(h2.Invalid);
            throw e4;
        }
    }

    @Override // p3.f2
    public final void apply() throws Exception {
        AtomicReference<h2> atomicReference = this.f135095h;
        try {
            switch (a.f135100a[atomicReference.get().ordinal()]) {
                case 1:
                case 2:
                case 3:
                    throw new IllegalStateException("The paused composition has not completed yet");
                case 4:
                    b();
                    h2 h2Var = h2.ApplyPending;
                    h2 h2Var2 = h2.Applied;
                    while (!atomicReference.compareAndSet(h2Var, h2Var2)) {
                        if (atomicReference.get() != h2Var) {
                            j2.b("Unexpected state change from: " + h2Var + " to: " + h2Var2 + '.');
                            return;
                        }
                    }
                    return;
                case 5:
                    throw new IllegalStateException("The paused composition has already been applied");
                case 6:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 7:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                default:
                    throw new NoWhenBranchMatchedException();
            }
        } catch (Exception e4) {
            atomicReference.set(h2.Invalid);
            throw e4;
        }
    }

    public final void b() {
        z3.q.f202125a.getClass();
        Trace.beginSection("PausedComposition:applyChanges");
        try {
            synchronized (this.f135094g) {
                try {
                    w2<Object> w2Var = this.f135099l;
                    c<?> cVar = this.f135093f;
                    cVar.getClass();
                    w2Var.a(cVar, this.f135098k);
                    this.f135098k.c();
                    this.f135098k.d();
                    this.f135098k.b();
                    this.f135088a.f135245q = null;
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th3) {
                    this.f135098k.b();
                    this.f135088a.f135245q = null;
                    throw th3;
                }
            }
            Trace.endSection();
        } catch (Throwable th4) {
            z3.q.f202125a.getClass();
            Trace.endSection();
            throw th4;
        }
    }

    public final void c() {
        boolean z14;
        h2 h2Var = h2.RecomposePending;
        h2 h2Var2 = h2.ApplyPending;
        while (true) {
            AtomicReference<h2> atomicReference = this.f135095h;
            if (atomicReference.compareAndSet(h2Var, h2Var2)) {
                z14 = true;
                break;
            } else if (atomicReference.get() != h2Var) {
                z14 = false;
                break;
            }
        }
        if (z14) {
            return;
        }
        j2.b("Unexpected state change from: " + h2Var + " to: " + h2Var2 + '.');
    }

    @Override // p3.f2
    public final void cancel() {
        p1.u0<z2> u0Var;
        this.f135095h.set(h2.Cancelled);
        z3.l lVar = this.f135098k;
        if (lVar.f202109d.c()) {
            u0Var = lVar.f202109d;
            lVar.f202109d = p1.i1.a();
            lVar.f202108c.g();
        } else {
            u0Var = null;
        }
        lVar.b();
        r rVar = this.f135088a;
        rVar.f135245q = null;
        if (u0Var != null) {
            rVar.f135249w.f202116k = u0Var;
            rVar.f135251y = 2;
        }
    }

    @Override // p3.f2
    public final boolean isComplete() {
        return this.f135095h.get().compareTo(h2.ApplyPending) >= 0;
    }
}
