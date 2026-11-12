package defpackage;

import androidx.annotation.RestrictTo;
import com.miui.tsmclient.util.DoorCardConstants;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.util.Locale;
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

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public abstract class p10<V> implements lhe<V> {
    public static final boolean d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger e = Logger.getLogger(p10.class.getName());
    public static final b f;
    public static final Object g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Object f29887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile e f29888b;
    public volatile i c;

    public static abstract class b {
        public b() {
        }

        public abstract boolean a(p10<?> p10Var, e eVar, e eVar2);

        public abstract boolean b(p10<?> p10Var, Object obj, Object obj2);

        public abstract boolean c(p10<?> p10Var, i iVar, i iVar2);

        public abstract void d(i iVar, i iVar2);

        public abstract void e(i iVar, Thread thread);
    }

    public static final class c {
        public static final c c;
        public static final c d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f29889a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Throwable f29890b;

        static {
            if (p10.d) {
                d = null;
                c = null;
            } else {
                d = new c(false, null);
                c = new c(true, null);
            }
        }

        public c(boolean z, Throwable th) {
            this.f29889a = z;
            this.f29890b = th;
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d f29891b = new d(new a("Failure occurred while trying to finish a future."));

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Throwable f29892a;

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
            this.f29892a = (Throwable) p10.d(th);
        }
    }

    public static final class e {
        public static final e d = new e(null, null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Runnable f29893a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Executor f29894b;
        public e c;

        public e(Runnable runnable, Executor executor) {
            this.f29893a = runnable;
            this.f29894b = executor;
        }
    }

    public static final class f extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<i, Thread> f29895a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<i, i> f29896b;
        public final AtomicReferenceFieldUpdater<p10, i> c;
        public final AtomicReferenceFieldUpdater<p10, e> d;
        public final AtomicReferenceFieldUpdater<p10, Object> e;

        public f(AtomicReferenceFieldUpdater<i, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<i, i> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<p10, i> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<p10, e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<p10, Object> atomicReferenceFieldUpdater5) {
            super();
            this.f29895a = atomicReferenceFieldUpdater;
            this.f29896b = atomicReferenceFieldUpdater2;
            this.c = atomicReferenceFieldUpdater3;
            this.d = atomicReferenceFieldUpdater4;
            this.e = atomicReferenceFieldUpdater5;
        }

        @Override // p10.b
        public boolean a(p10<?> p10Var, e eVar, e eVar2) {
            return q10.a(this.d, p10Var, eVar, eVar2);
        }

        @Override // p10.b
        public boolean b(p10<?> p10Var, Object obj, Object obj2) {
            return q10.a(this.e, p10Var, obj, obj2);
        }

        @Override // p10.b
        public boolean c(p10<?> p10Var, i iVar, i iVar2) {
            return q10.a(this.c, p10Var, iVar, iVar2);
        }

        @Override // p10.b
        public void d(i iVar, i iVar2) {
            this.f29896b.lazySet(iVar, iVar2);
        }

        @Override // p10.b
        public void e(i iVar, Thread thread) {
            this.f29895a.lazySet(iVar, thread);
        }
    }

    public static final class g<V> implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p10<V> f29897a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final lhe<? extends V> f29898b;

        @Override // java.lang.Runnable
        public void run() {
            if (this.f29897a.f29887a != this) {
                return;
            }
            if (p10.f.b(this.f29897a, this, p10.i(this.f29898b))) {
                p10.f(this.f29897a);
            }
        }
    }

    public static final class h extends b {
        public h() {
            super();
        }

        @Override // p10.b
        public boolean a(p10<?> p10Var, e eVar, e eVar2) {
            synchronized (p10Var) {
                try {
                    if (p10Var.f29888b != eVar) {
                        return false;
                    }
                    p10Var.f29888b = eVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // p10.b
        public boolean b(p10<?> p10Var, Object obj, Object obj2) {
            synchronized (p10Var) {
                try {
                    if (p10Var.f29887a != obj) {
                        return false;
                    }
                    p10Var.f29887a = obj2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // p10.b
        public boolean c(p10<?> p10Var, i iVar, i iVar2) {
            synchronized (p10Var) {
                try {
                    if (p10Var.c != iVar) {
                        return false;
                    }
                    p10Var.c = iVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // p10.b
        public void d(i iVar, i iVar2) {
            iVar.f29900b = iVar2;
        }

        @Override // p10.b
        public void e(i iVar, Thread thread) {
            iVar.f29899a = thread;
        }
    }

    public static final class i {
        public static final i c = new i(false);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public volatile Thread f29899a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public volatile i f29900b;

        public i(boolean z) {
        }

        public void a(i iVar) {
            p10.f.d(this, iVar);
        }

        public void b() {
            Thread thread = this.f29899a;
            if (thread != null) {
                this.f29899a = null;
                LockSupport.unpark(thread);
            }
        }

        public i() {
            p10.f.e(this, Thread.currentThread());
        }
    }

    static {
        b hVar;
        try {
            hVar = new f(AtomicReferenceFieldUpdater.newUpdater(i.class, Thread.class, PluginDeviceInfo.FMODEL), AtomicReferenceFieldUpdater.newUpdater(i.class, i.class, PluginDeviceInfo.FDESC), AtomicReferenceFieldUpdater.newUpdater(p10.class, i.class, PluginDeviceInfo.FICONON), AtomicReferenceFieldUpdater.newUpdater(p10.class, e.class, PluginDeviceInfo.FDESC), AtomicReferenceFieldUpdater.newUpdater(p10.class, Object.class, PluginDeviceInfo.FMODEL));
            th = null;
        } catch (Throwable th) {
            th = th;
            hVar = new h();
        }
        f = hVar;
        if (th != null) {
            e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        g = new Object();
    }

    private void a(StringBuilder sb) {
        try {
            Object objJ = j(this);
            sb.append("SUCCESS, result=[");
            sb.append(q(objJ));
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

    private static CancellationException c(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    public static <T> T d(T t) {
        t.getClass();
        return t;
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
    public static void f(p10<?> p10Var) {
        e eVar = null;
        while (true) {
            p10Var.m();
            p10Var.b();
            e eVarE = p10Var.e(eVar);
            while (eVarE != null) {
                eVar = eVarE.c;
                Runnable runnable = eVarE.f29893a;
                if (runnable instanceof g) {
                    g gVar = (g) runnable;
                    p10Var = gVar.f29897a;
                    if (p10Var.f29887a == gVar) {
                        if (f.b(p10Var, gVar, i(gVar.f29898b))) {
                        }
                    } else {
                        continue;
                    }
                } else {
                    g(runnable, eVarE.f29894b);
                }
                eVarE = eVar;
            }
            return;
        }
    }

    private static void g(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private V h(Object obj) throws ExecutionException {
        if (obj instanceof c) {
            throw c("Task was cancelled.", ((c) obj).f29890b);
        }
        if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f29892a);
        }
        if (obj == g) {
            return null;
        }
        return obj;
    }

    public static Object i(lhe<?> lheVar) {
        if (lheVar instanceof p10) {
            Object obj = ((p10) lheVar).f29887a;
            if (!(obj instanceof c)) {
                return obj;
            }
            c cVar = (c) obj;
            if (cVar.f29889a) {
                return cVar.f29890b != null ? new c(false, cVar.f29890b) : c.d;
            }
            return obj;
        }
        boolean zIsCancelled = lheVar.isCancelled();
        if ((!d) && zIsCancelled) {
            return c.d;
        }
        try {
            Object objJ = j(lheVar);
            return objJ == null ? g : objJ;
        } catch (CancellationException e2) {
            if (zIsCancelled) {
                return new c(false, e2);
            }
            return new d(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + lheVar, e2));
        } catch (ExecutionException e3) {
            return new d(e3.getCause());
        } catch (Throwable th) {
            return new d(th);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static <V> V j(Future<V> future) throws ExecutionException {
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

    private void m() {
        i iVar;
        do {
            iVar = this.c;
        } while (!f.c(this, iVar, i.c));
        while (iVar != null) {
            iVar.b();
            iVar = iVar.f29900b;
        }
    }

    @Override // defpackage.lhe
    public final void addListener(Runnable runnable, Executor executor) {
        d(runnable);
        d(executor);
        e eVar = this.f29888b;
        if (eVar != e.d) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.c = eVar;
                if (f.a(this, eVar, eVar2)) {
                    return;
                } else {
                    eVar = this.f29888b;
                }
            } while (eVar != e.d);
        }
        g(runnable, executor);
    }

    public void b() {
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        c cVar;
        Object obj = this.f29887a;
        if (!(obj == null) && !(obj instanceof g)) {
            return false;
        }
        if (d) {
            cVar = new c(z, new CancellationException("Future.cancel() was called."));
        } else {
            cVar = z ? c.c : c.d;
        }
        p10<V> p10Var = this;
        boolean z2 = false;
        while (true) {
            if (f.b(p10Var, obj, cVar)) {
                if (z) {
                    p10Var.k();
                }
                f(p10Var);
                if (!(obj instanceof g)) {
                    return true;
                }
                lhe<? extends V> lheVar = ((g) obj).f29898b;
                if (!(lheVar instanceof p10)) {
                    lheVar.cancel(z);
                    return true;
                }
                p10Var = (p10) lheVar;
                obj = p10Var.f29887a;
                if (!(obj == null) && !(obj instanceof g)) {
                    return true;
                }
                z2 = true;
            } else {
                obj = p10Var.f29887a;
                if (!(obj instanceof g)) {
                    return z2;
                }
            }
        }
    }

    public final e e(e eVar) {
        e eVar2;
        do {
            eVar2 = this.f29888b;
        } while (!f.a(this, eVar2, e.d));
        e eVar3 = eVar;
        e eVar4 = eVar2;
        while (eVar4 != null) {
            e eVar5 = eVar4.c;
            eVar4.c = eVar3;
            eVar3 = eVar4;
            eVar4 = eVar5;
        }
        return eVar3;
    }

    @Override // java.util.concurrent.Future
    public final V get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f29887a;
        if ((obj != null) && (!(obj instanceof g))) {
            return h(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            i iVar = this.c;
            if (iVar != i.c) {
                i iVar2 = new i();
                while (true) {
                    iVar2.a(iVar);
                    if (f.c(this, iVar, iVar2)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                n(iVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f29887a;
                            if ((obj2 != null) && (!(obj2 instanceof g))) {
                                return h(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        n(iVar2);
                        break;
                    }
                    iVar = this.c;
                    if (iVar == i.c) {
                    }
                }
            }
            return h(this.f29887a);
        }
        while (nanos > 0) {
            Object obj3 = this.f29887a;
            if ((obj3 != null) && (!(obj3 instanceof g))) {
                return h(obj3);
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
        String str = "Waited " + j + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String str2 = str + " (plus ";
            long j2 = -nanos;
            long jConvert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
            long nanos2 = j2 - timeUnit.toNanos(jConvert);
            boolean z = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String str3 = str2 + jConvert + " " + lowerCase;
                if (z) {
                    str3 = str3 + ",";
                }
                str2 = str3 + " ";
            }
            if (z) {
                str2 = str2 + nanos2 + " nanoseconds ";
            }
            str = str2 + "delay)";
        }
        if (isDone()) {
            throw new TimeoutException(str + " but future completed as timeout expired");
        }
        throw new TimeoutException(str + " for " + string);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f29887a instanceof c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.f29887a;
        return (!(obj instanceof g)) & (obj != null);
    }

    public void k() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String l() {
        Object obj = this.f29887a;
        if (obj instanceof g) {
            return "setFuture=[" + q(((g) obj).f29898b) + "]";
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final void n(i iVar) {
        iVar.f29899a = null;
        while (true) {
            i iVar2 = this.c;
            if (iVar2 == i.c) {
                return;
            }
            i iVar3 = null;
            while (iVar2 != null) {
                i iVar4 = iVar2.f29900b;
                if (iVar2.f29899a != null) {
                    iVar3 = iVar2;
                } else if (iVar3 != null) {
                    iVar3.f29900b = iVar4;
                    if (iVar3.f29899a == null) {
                    }
                } else if (!f.c(this, iVar2, iVar4)) {
                }
                iVar2 = iVar4;
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
    public boolean o(V v) {
        if (v == null) {
            v = (V) g;
        }
        if (!f.b(this, null, v)) {
            return false;
        }
        f(this);
        return true;
    }

    public boolean p(Throwable th) {
        if (!f.b(this, null, new d((Throwable) d(th)))) {
            return false;
        }
        f(this);
        return true;
    }

    public final String q(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    public String toString() {
        String strL;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            a(sb);
        } else {
            try {
                strL = l();
            } catch (RuntimeException e2) {
                strL = "Exception thrown from implementation: " + e2.getClass();
            }
            if (strL != null && !strL.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(strL);
                sb.append("]");
            } else if (isDone()) {
                a(sb);
            } else {
                sb.append(DoorCardConstants.FLOW_CONTROL_STATUS_PENDING);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final V get() throws ExecutionException, InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f29887a;
            if ((obj2 != null) & (!(obj2 instanceof g))) {
                return h(obj2);
            }
            i iVar = this.c;
            if (iVar != i.c) {
                i iVar2 = new i();
                do {
                    iVar2.a(iVar);
                    if (f.c(this, iVar, iVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f29887a;
                            } else {
                                n(iVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof g))));
                        return h(obj);
                    }
                    iVar = this.c;
                } while (iVar != i.c);
            }
            return h(this.f29887a);
        }
        throw new InterruptedException();
    }
}
