package defpackage;

import com.miui.tsmclient.util.DoorCardConstants;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes5.dex */
public abstract class t00<V> extends yed implements lhe<V> {
    public static final boolean d;
    public static final Logger e;
    public static final b f;
    public static final Object g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Object f34144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile e f34145b;
    public volatile l c;

    public static abstract class b {
        public b() {
        }

        public abstract boolean a(t00<?> t00Var, e eVar, e eVar2);

        public abstract boolean b(t00<?> t00Var, Object obj, Object obj2);

        public abstract boolean c(t00<?> t00Var, l lVar, l lVar2);

        public abstract e d(t00<?> t00Var, e eVar);

        public abstract l e(t00<?> t00Var, l lVar);

        public abstract void f(l lVar, l lVar2);

        public abstract void g(l lVar, Thread thread);
    }

    public static final class c {
        public static final c c;
        public static final c d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f34146a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Throwable f34147b;

        static {
            if (t00.d) {
                d = null;
                c = null;
            } else {
                d = new c(false, null);
                c = new c(true, null);
            }
        }

        public c(boolean z, Throwable th) {
            this.f34146a = z;
            this.f34147b = th;
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d f34148b = new d(new a("Failure occurred while trying to finish a future."));

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Throwable f34149a;

        public class a extends Throwable {
            public a(String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        public d(Throwable th) {
            this.f34149a = (Throwable) c6i.o(th);
        }
    }

    public static final class f extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<l, Thread> f34152a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<l, l> f34153b;
        public final AtomicReferenceFieldUpdater<t00, l> c;
        public final AtomicReferenceFieldUpdater<t00, e> d;
        public final AtomicReferenceFieldUpdater<t00, Object> e;

        public f(AtomicReferenceFieldUpdater<l, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<l, l> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<t00, l> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<t00, e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<t00, Object> atomicReferenceFieldUpdater5) {
            super();
            this.f34152a = atomicReferenceFieldUpdater;
            this.f34153b = atomicReferenceFieldUpdater2;
            this.c = atomicReferenceFieldUpdater3;
            this.d = atomicReferenceFieldUpdater4;
            this.e = atomicReferenceFieldUpdater5;
        }

        @Override // t00.b
        public boolean a(t00<?> t00Var, e eVar, e eVar2) {
            return q10.a(this.d, t00Var, eVar, eVar2);
        }

        @Override // t00.b
        public boolean b(t00<?> t00Var, Object obj, Object obj2) {
            return q10.a(this.e, t00Var, obj, obj2);
        }

        @Override // t00.b
        public boolean c(t00<?> t00Var, l lVar, l lVar2) {
            return q10.a(this.c, t00Var, lVar, lVar2);
        }

        @Override // t00.b
        public e d(t00<?> t00Var, e eVar) {
            return this.d.getAndSet(t00Var, eVar);
        }

        @Override // t00.b
        public l e(t00<?> t00Var, l lVar) {
            return this.c.getAndSet(t00Var, lVar);
        }

        @Override // t00.b
        public void f(l lVar, l lVar2) {
            this.f34153b.lazySet(lVar, lVar2);
        }

        @Override // t00.b
        public void g(l lVar, Thread thread) {
            this.f34152a.lazySet(lVar, thread);
        }
    }

    public static final class g<V> implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final t00<V> f34154a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final lhe<? extends V> f34155b;

        public g(t00<V> t00Var, lhe<? extends V> lheVar) {
            this.f34154a = t00Var;
            this.f34155b = lheVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f34154a.f34144a != this) {
                return;
            }
            if (t00.f.b(this.f34154a, this, t00.u(this.f34155b))) {
                t00.r(this.f34154a);
            }
        }
    }

    public static final class h extends b {
        public h() {
            super();
        }

        @Override // t00.b
        public boolean a(t00<?> t00Var, e eVar, e eVar2) {
            synchronized (t00Var) {
                try {
                    if (t00Var.f34145b != eVar) {
                        return false;
                    }
                    t00Var.f34145b = eVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // t00.b
        public boolean b(t00<?> t00Var, Object obj, Object obj2) {
            synchronized (t00Var) {
                try {
                    if (t00Var.f34144a != obj) {
                        return false;
                    }
                    t00Var.f34144a = obj2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // t00.b
        public boolean c(t00<?> t00Var, l lVar, l lVar2) {
            synchronized (t00Var) {
                try {
                    if (t00Var.c != lVar) {
                        return false;
                    }
                    t00Var.c = lVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // t00.b
        public e d(t00<?> t00Var, e eVar) {
            e eVar2;
            synchronized (t00Var) {
                try {
                    eVar2 = t00Var.f34145b;
                    if (eVar2 != eVar) {
                        t00Var.f34145b = eVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return eVar2;
        }

        @Override // t00.b
        public l e(t00<?> t00Var, l lVar) {
            l lVar2;
            synchronized (t00Var) {
                try {
                    lVar2 = t00Var.c;
                    if (lVar2 != lVar) {
                        t00Var.c = lVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return lVar2;
        }

        @Override // t00.b
        public void f(l lVar, l lVar2) {
            lVar.f34159b = lVar2;
        }

        @Override // t00.b
        public void g(l lVar, Thread thread) {
            lVar.f34158a = thread;
        }
    }

    public interface i<V> extends lhe<V> {
    }

    public static abstract class j<V> extends t00<V> implements i<V> {
        @Override // defpackage.t00, defpackage.lhe
        public void addListener(Runnable runnable, Executor executor) {
            super.addListener(runnable, executor);
        }

        @Override // defpackage.t00, java.util.concurrent.Future
        public boolean cancel(boolean z) {
            return super.cancel(z);
        }

        @Override // defpackage.t00, java.util.concurrent.Future
        public V get() throws ExecutionException, InterruptedException {
            return (V) super.get();
        }

        @Override // defpackage.t00, java.util.concurrent.Future
        public boolean isCancelled() {
            return super.isCancelled();
        }

        @Override // defpackage.t00, java.util.concurrent.Future
        public boolean isDone() {
            return super.isDone();
        }

        @Override // defpackage.t00, java.util.concurrent.Future
        public V get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
            return (V) super.get(j, timeUnit);
        }
    }

    public static final class k extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Unsafe f34156a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final long f34157b;
        public static final long c;
        public static final long d;
        public static final long e;
        public static final long f;

        public class a implements PrivilegedExceptionAction<Unsafe> {
            @Override // java.security.PrivilegedExceptionAction
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Unsafe run() throws Exception {
                for (Field field : Unsafe.class.getDeclaredFields()) {
                    field.setAccessible(true);
                    Object obj = field.get(null);
                    if (Unsafe.class.isInstance(obj)) {
                        return (Unsafe) Unsafe.class.cast(obj);
                    }
                }
                throw new NoSuchFieldError("the Unsafe");
            }
        }

        static {
            Unsafe unsafe;
            try {
                try {
                    unsafe = Unsafe.getUnsafe();
                } catch (PrivilegedActionException e2) {
                    throw new RuntimeException("Could not initialize intrinsics", e2.getCause());
                }
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(new a());
            }
            try {
                c = unsafe.objectFieldOffset(t00.class.getDeclaredField(PluginDeviceInfo.FICONON));
                f34157b = unsafe.objectFieldOffset(t00.class.getDeclaredField(PluginDeviceInfo.FDESC));
                d = unsafe.objectFieldOffset(t00.class.getDeclaredField(PluginDeviceInfo.FMODEL));
                e = unsafe.objectFieldOffset(l.class.getDeclaredField(PluginDeviceInfo.FMODEL));
                f = unsafe.objectFieldOffset(l.class.getDeclaredField(PluginDeviceInfo.FDESC));
                f34156a = unsafe;
            } catch (Exception e3) {
                vdp.e(e3);
                throw new RuntimeException(e3);
            }
        }

        public k() {
            super();
        }

        @Override // t00.b
        public boolean a(t00<?> t00Var, e eVar, e eVar2) {
            return u00.a(f34156a, t00Var, f34157b, eVar, eVar2);
        }

        @Override // t00.b
        public boolean b(t00<?> t00Var, Object obj, Object obj2) {
            return u00.a(f34156a, t00Var, d, obj, obj2);
        }

        @Override // t00.b
        public boolean c(t00<?> t00Var, l lVar, l lVar2) {
            return u00.a(f34156a, t00Var, c, lVar, lVar2);
        }

        @Override // t00.b
        public e d(t00<?> t00Var, e eVar) {
            e eVar2;
            do {
                eVar2 = t00Var.f34145b;
                if (eVar == eVar2) {
                    return eVar2;
                }
            } while (!a(t00Var, eVar2, eVar));
            return eVar2;
        }

        @Override // t00.b
        public l e(t00<?> t00Var, l lVar) {
            l lVar2;
            do {
                lVar2 = t00Var.c;
                if (lVar == lVar2) {
                    return lVar2;
                }
            } while (!c(t00Var, lVar2, lVar));
            return lVar2;
        }

        @Override // t00.b
        public void f(l lVar, l lVar2) {
            f34156a.putObject(lVar, f, lVar2);
        }

        @Override // t00.b
        public void g(l lVar, Thread thread) {
            f34156a.putObject(lVar, e, thread);
        }
    }

    public static final class l {
        public static final l c = new l(false);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public volatile Thread f34158a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public volatile l f34159b;

        public l() {
            t00.f.g(this, Thread.currentThread());
        }

        public l(boolean z) {
        }

        public void a(l lVar) {
            t00.f.f(this, lVar);
        }

        public void b() {
            Thread thread = this.f34158a;
            if (thread != null) {
                this.f34158a = null;
                LockSupport.unpark(thread);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.logging.Logger] */
    /* JADX WARN: Type inference failed for: r2v2, types: [t00$a] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v5 */
    static {
        boolean z;
        b hVar;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        d = z;
        e = Logger.getLogger(t00.class.getName());
        ?? r2 = 0;
        r2 = 0;
        try {
            hVar = new k();
            th = null;
        } catch (Throwable th) {
            th = th;
            try {
                hVar = new f(AtomicReferenceFieldUpdater.newUpdater(l.class, Thread.class, PluginDeviceInfo.FMODEL), AtomicReferenceFieldUpdater.newUpdater(l.class, l.class, PluginDeviceInfo.FDESC), AtomicReferenceFieldUpdater.newUpdater(t00.class, l.class, PluginDeviceInfo.FICONON), AtomicReferenceFieldUpdater.newUpdater(t00.class, e.class, PluginDeviceInfo.FDESC), AtomicReferenceFieldUpdater.newUpdater(t00.class, Object.class, PluginDeviceInfo.FMODEL));
            } catch (Throwable th2) {
                hVar = new h();
                r2 = th2;
            }
        }
        f = hVar;
        if (r2 != 0) {
            ?? r0 = e;
            Level level = Level.SEVERE;
            r0.log(level, "UnsafeAtomicHelper is broken!", th);
            r0.log(level, "SafeAtomicHelper is broken!", r2);
        }
        g = new Object();
    }

    public static CancellationException p(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void r(t00<?> t00Var) {
        e eVar = null;
        while (true) {
            t00Var.z();
            t00Var.m();
            e eVarQ = t00Var.q(eVar);
            while (eVarQ != null) {
                eVar = eVarQ.c;
                Runnable runnable = eVarQ.f34150a;
                Objects.requireNonNull(runnable);
                Runnable runnable2 = runnable;
                if (runnable2 instanceof g) {
                    g gVar = (g) runnable2;
                    t00Var = gVar.f34154a;
                    if (t00Var.f34144a == gVar) {
                        if (f.b(t00Var, gVar, u(gVar.f34155b))) {
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = eVarQ.f34151b;
                    Objects.requireNonNull(executor);
                    s(runnable2, executor);
                }
                eVarQ = eVar;
            }
            return;
        }
    }

    public static void s(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            Logger logger = e;
            Level level = Level.SEVERE;
            String strValueOf = String.valueOf(runnable);
            String strValueOf2 = String.valueOf(executor);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 57 + strValueOf2.length());
            sb.append("RuntimeException while executing runnable ");
            sb.append(strValueOf);
            sb.append(" with executor ");
            sb.append(strValueOf2);
            logger.log(level, sb.toString(), (Throwable) e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static Object u(lhe<?> lheVar) {
        Throwable thA;
        if (lheVar instanceof i) {
            Object cVar = ((t00) lheVar).f34144a;
            if (cVar instanceof c) {
                c cVar2 = (c) cVar;
                if (cVar2.f34146a) {
                    cVar = cVar2.f34147b != null ? new c(false, cVar2.f34147b) : c.d;
                }
            }
            Objects.requireNonNull(cVar);
            return cVar;
        }
        if ((lheVar instanceof yed) && (thA = zed.a((yed) lheVar)) != null) {
            return new d(thA);
        }
        boolean zIsCancelled = lheVar.isCancelled();
        if ((!d) && zIsCancelled) {
            c cVar3 = c.d;
            Objects.requireNonNull(cVar3);
            return cVar3;
        }
        try {
            Object objV = v(lheVar);
            if (!zIsCancelled) {
                return objV == null ? g : objV;
            }
            String strValueOf = String.valueOf(lheVar);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 84);
            sb.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
            sb.append(strValueOf);
            return new c(false, new IllegalArgumentException(sb.toString()));
        } catch (CancellationException e2) {
            if (zIsCancelled) {
                return new c(false, e2);
            }
            String strValueOf2 = String.valueOf(lheVar);
            StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 77);
            sb2.append("get() threw CancellationException, despite reporting isCancelled() == false: ");
            sb2.append(strValueOf2);
            return new d(new IllegalArgumentException(sb2.toString(), e2));
        } catch (ExecutionException e3) {
            if (!zIsCancelled) {
                return new d(e3.getCause());
            }
            String strValueOf3 = String.valueOf(lheVar);
            StringBuilder sb3 = new StringBuilder(strValueOf3.length() + 84);
            sb3.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
            sb3.append(strValueOf3);
            return new c(false, new IllegalArgumentException(sb3.toString(), e3));
        } catch (Throwable th) {
            return new d(th);
        }
    }

    private static <V> V v(Future<V> future) throws ExecutionException {
        V v;
        boolean z = false;
        while (true) {
            try {
                v = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return v;
    }

    public final void A(l lVar) {
        lVar.f34158a = null;
        while (true) {
            l lVar2 = this.c;
            if (lVar2 == l.c) {
                return;
            }
            l lVar3 = null;
            while (lVar2 != null) {
                l lVar4 = lVar2.f34159b;
                if (lVar2.f34158a != null) {
                    lVar3 = lVar2;
                } else if (lVar3 != null) {
                    lVar3.f34159b = lVar4;
                    if (lVar3.f34158a == null) {
                    }
                } else if (!f.c(this, lVar2, lVar4)) {
                }
                lVar2 = lVar4;
            }
            return;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public boolean B(V v) {
        if (v == null) {
            v = (V) g;
        }
        if (!f.b(this, null, v)) {
            return false;
        }
        r(this);
        return true;
    }

    public boolean C(Throwable th) {
        if (!f.b(this, null, new d((Throwable) c6i.o(th)))) {
            return false;
        }
        r(this);
        return true;
    }

    public boolean D(lhe<? extends V> lheVar) {
        d dVar;
        c6i.o(lheVar);
        Object obj = this.f34144a;
        if (obj == null) {
            if (lheVar.isDone()) {
                if (!f.b(this, null, u(lheVar))) {
                    return false;
                }
                r(this);
                return true;
            }
            g gVar = new g(this, lheVar);
            if (f.b(this, null, gVar)) {
                try {
                    lheVar.addListener(gVar, vx6.INSTANCE);
                } catch (Throwable th) {
                    try {
                        dVar = new d(th);
                    } catch (Throwable unused) {
                        dVar = d.f34148b;
                    }
                    f.b(this, gVar, dVar);
                }
                return true;
            }
            obj = this.f34144a;
        }
        if (obj instanceof c) {
            lheVar.cancel(((c) obj).f34146a);
        }
        return false;
    }

    public final boolean E() {
        Object obj = this.f34144a;
        return (obj instanceof c) && ((c) obj).f34146a;
    }

    @Override // defpackage.yed
    public final Throwable a() {
        if (!(this instanceof i)) {
            return null;
        }
        Object obj = this.f34144a;
        if (obj instanceof d) {
            return ((d) obj).f34149a;
        }
        return null;
    }

    public void addListener(Runnable runnable, Executor executor) {
        e eVar;
        c6i.p(runnable, "Runnable was null.");
        c6i.p(executor, "Executor was null.");
        if (!isDone() && (eVar = this.f34145b) != e.d) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.c = eVar;
                if (f.a(this, eVar, eVar2)) {
                    return;
                } else {
                    eVar = this.f34145b;
                }
            } while (eVar != e.d);
        }
        s(runnable, executor);
    }

    public boolean cancel(boolean z) {
        c cVar;
        Object obj = this.f34144a;
        if (!(obj == null) && !(obj instanceof g)) {
            return false;
        }
        if (d) {
            cVar = new c(z, new CancellationException("Future.cancel() was called."));
        } else {
            cVar = z ? c.c : c.d;
            Objects.requireNonNull(cVar);
        }
        t00<V> t00Var = this;
        boolean z2 = false;
        while (true) {
            if (f.b(t00Var, obj, cVar)) {
                if (z) {
                    t00Var.w();
                }
                r(t00Var);
                if (!(obj instanceof g)) {
                    return true;
                }
                lhe<? extends V> lheVar = ((g) obj).f34155b;
                if (!(lheVar instanceof i)) {
                    lheVar.cancel(z);
                    return true;
                }
                t00Var = (t00) lheVar;
                obj = t00Var.f34144a;
                if (!(obj == null) && !(obj instanceof g)) {
                    return true;
                }
                z2 = true;
            } else {
                obj = t00Var.f34144a;
                if (!(obj instanceof g)) {
                    return z2;
                }
            }
        }
    }

    public V get(long j2, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j2);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f34144a;
        if ((obj != null) && (!(obj instanceof g))) {
            return t(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            l lVar = this.c;
            if (lVar != l.c) {
                l lVar2 = new l();
                while (true) {
                    lVar2.a(lVar);
                    if (f.c(this, lVar, lVar2)) {
                        do {
                            nfh.a(this, nanos);
                            if (Thread.interrupted()) {
                                A(lVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f34144a;
                            if ((obj2 != null) && (!(obj2 instanceof g))) {
                                return t(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        A(lVar2);
                        break;
                    }
                    lVar = this.c;
                    if (lVar == l.c) {
                    }
                }
            }
            Object obj3 = this.f34144a;
            Objects.requireNonNull(obj3);
            return t(obj3);
        }
        while (nanos > 0) {
            Object obj4 = this.f34144a;
            if ((obj4 != null) && (!(obj4 instanceof g))) {
                return t(obj4);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        String lowerCase2 = timeUnit.toString().toLowerCase(locale);
        StringBuilder sb = new StringBuilder(String.valueOf(lowerCase2).length() + 28);
        sb.append("Waited ");
        sb.append(j2);
        sb.append(" ");
        sb.append(lowerCase2);
        String string3 = sb.toString();
        if (nanos + 1000 < 0) {
            String strConcat = String.valueOf(string3).concat(" (plus ");
            long j3 = -nanos;
            long jConvert = timeUnit.convert(j3, TimeUnit.NANOSECONDS);
            long nanos2 = j3 - timeUnit.toNanos(jConvert);
            boolean z = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String strValueOf = String.valueOf(strConcat);
                StringBuilder sb2 = new StringBuilder(strValueOf.length() + 21 + String.valueOf(lowerCase).length());
                sb2.append(strValueOf);
                sb2.append(jConvert);
                sb2.append(" ");
                sb2.append(lowerCase);
                String string4 = sb2.toString();
                if (z) {
                    string4 = String.valueOf(string4).concat(",");
                }
                strConcat = String.valueOf(string4).concat(" ");
            }
            if (z) {
                String strValueOf2 = String.valueOf(strConcat);
                StringBuilder sb3 = new StringBuilder(strValueOf2.length() + 33);
                sb3.append(strValueOf2);
                sb3.append(nanos2);
                sb3.append(" nanoseconds ");
                strConcat = sb3.toString();
            }
            string3 = String.valueOf(strConcat).concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(String.valueOf(string3).concat(" but future completed as timeout expired"));
        }
        StringBuilder sb4 = new StringBuilder(String.valueOf(string3).length() + 5 + String.valueOf(string).length());
        sb4.append(string3);
        sb4.append(" for ");
        sb4.append(string);
        throw new TimeoutException(sb4.toString());
    }

    public boolean isCancelled() {
        return this.f34144a instanceof c;
    }

    public boolean isDone() {
        Object obj = this.f34144a;
        return (!(obj instanceof g)) & (obj != null);
    }

    public final void k(StringBuilder sb) {
        try {
            Object objV = v(this);
            sb.append("SUCCESS, result=[");
            n(sb, objV);
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e3) {
            sb.append("FAILURE, cause=[");
            sb.append(e3.getCause());
            sb.append("]");
        }
    }

    public final void l(StringBuilder sb) {
        String string;
        int length = sb.length();
        sb.append(DoorCardConstants.FLOW_CONTROL_STATUS_PENDING);
        Object obj = this.f34144a;
        if (obj instanceof g) {
            sb.append(", setFuture=[");
            o(sb, ((g) obj).f34155b);
            sb.append("]");
        } else {
            try {
                string = qlo.a(y());
            } catch (RuntimeException | StackOverflowError e2) {
                String strValueOf = String.valueOf(e2.getClass());
                StringBuilder sb2 = new StringBuilder(strValueOf.length() + 38);
                sb2.append("Exception thrown from implementation: ");
                sb2.append(strValueOf);
                string = sb2.toString();
            }
            if (string != null) {
                sb.append(", info=[");
                sb.append(string);
                sb.append("]");
            }
        }
        if (isDone()) {
            sb.delete(length, sb.length());
            k(sb);
        }
    }

    public void m() {
    }

    public final void n(StringBuilder sb, Object obj) {
        if (obj == null) {
            sb.append(AbstractJsonLexerKt.NULL);
        } else {
            if (obj == this) {
                sb.append("this future");
                return;
            }
            sb.append(obj.getClass().getName());
            sb.append(gv5.CONNECT_VALUE_STR);
            sb.append(Integer.toHexString(System.identityHashCode(obj)));
        }
    }

    public final void o(StringBuilder sb, Object obj) {
        try {
            if (obj == this) {
                sb.append("this future");
            } else {
                sb.append(obj);
            }
        } catch (RuntimeException e2) {
            e = e2;
            sb.append("Exception thrown from implementation: ");
            sb.append(e.getClass());
        } catch (StackOverflowError e3) {
            e = e3;
            sb.append("Exception thrown from implementation: ");
            sb.append(e.getClass());
        }
    }

    public final e q(e eVar) {
        e eVar2 = eVar;
        e eVarD = f.d(this, e.d);
        while (eVarD != null) {
            e eVar3 = eVarD.c;
            eVarD.c = eVar2;
            eVar2 = eVarD;
            eVarD = eVar3;
        }
        return eVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final V t(Object obj) throws ExecutionException {
        if (obj instanceof c) {
            throw p("Task was cancelled.", ((c) obj).f34147b);
        }
        if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f34149a);
        }
        return obj == g ? (V) e2h.a() : obj;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            k(sb);
        } else {
            l(sb);
        }
        sb.append("]");
        return sb.toString();
    }

    public void w() {
    }

    public final void x(Future<?> future) {
        if ((future != null) && isCancelled()) {
            future.cancel(E());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String y() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        long delay = ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS);
        StringBuilder sb = new StringBuilder(41);
        sb.append("remaining delay=[");
        sb.append(delay);
        sb.append(" ms]");
        return sb.toString();
    }

    public final void z() {
        for (l lVarE = f.e(this, l.c); lVarE != null; lVarE = lVarE.f34159b) {
            lVarE.b();
        }
    }

    public static final class e {
        public static final e d = new e();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Runnable f34150a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Executor f34151b;
        public e c;

        public e(Runnable runnable, Executor executor) {
            this.f34150a = runnable;
            this.f34151b = executor;
        }

        public e() {
            this.f34150a = null;
            this.f34151b = null;
        }
    }

    public V get() throws ExecutionException, InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f34144a;
            if ((obj2 != null) & (!(obj2 instanceof g))) {
                return t(obj2);
            }
            l lVar = this.c;
            if (lVar != l.c) {
                l lVar2 = new l();
                do {
                    lVar2.a(lVar);
                    if (f.c(this, lVar, lVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f34144a;
                            } else {
                                A(lVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof g))));
                        return t(obj);
                    }
                    lVar = this.c;
                } while (lVar != l.c);
            }
            Object obj3 = this.f34144a;
            Objects.requireNonNull(obj3);
            return t(obj3);
        }
        throw new InterruptedException();
    }
}
