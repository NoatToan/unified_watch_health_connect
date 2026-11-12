package defpackage;

import io.sentry.exception.ExceptionMechanismException;
import io.sentry.protocol.g;
import io.sentry.protocol.o;
import io.sentry.protocol.t;
import io.sentry.protocol.u;
import io.sentry.protocol.v;
import io.sentry.util.p;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.List;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.TestOnly;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Internal
public final class gvl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final tvl f19375a;

    public gvl(@NotNull tvl tvlVar) {
        this.f19375a = (tvl) p.c(tvlVar, "The SentryStackTraceFactory is required.");
    }

    @TestOnly
    @NotNull
    public Deque<o> a(@NotNull Throwable th) {
        Thread threadCurrentThread;
        g gVar;
        boolean zIsSnapshot;
        ArrayDeque arrayDeque = new ArrayDeque();
        HashSet hashSet = new HashSet();
        while (th != null && hashSet.add(th)) {
            boolean z = false;
            if (th instanceof ExceptionMechanismException) {
                ExceptionMechanismException exceptionMechanismException = (ExceptionMechanismException) th;
                g exceptionMechanism = exceptionMechanismException.getExceptionMechanism();
                Throwable throwable = exceptionMechanismException.getThrowable();
                threadCurrentThread = exceptionMechanismException.getThread();
                zIsSnapshot = exceptionMechanismException.isSnapshot();
                gVar = exceptionMechanism;
                th = throwable;
            } else {
                threadCurrentThread = Thread.currentThread();
                gVar = null;
                zIsSnapshot = false;
            }
            if (gVar != null && Boolean.FALSE.equals(gVar.h())) {
                z = true;
            }
            arrayDeque.addFirst(b(th, gVar, Long.valueOf(threadCurrentThread.getId()), this.f19375a.a(th.getStackTrace(), z), zIsSnapshot));
            th = th.getCause();
        }
        return arrayDeque;
    }

    @NotNull
    public final o b(@NotNull Throwable th, @Nullable g gVar, @Nullable Long l, @Nullable List<t> list, boolean z) {
        Package r0 = th.getClass().getPackage();
        String name = th.getClass().getName();
        o oVar = new o();
        String message = th.getMessage();
        if (r0 != null) {
            name = name.replace(r0.getName() + ".", "");
        }
        String name2 = r0 != null ? r0.getName() : null;
        if (list != null && !list.isEmpty()) {
            u uVar = new u(list);
            if (z) {
                uVar.e(Boolean.TRUE);
            }
            oVar.n(uVar);
        }
        oVar.o(l);
        oVar.p(name);
        oVar.l(gVar);
        oVar.m(name2);
        oVar.r(message);
        return oVar;
    }

    @NotNull
    public List<o> c(@NotNull Throwable th) {
        return d(a(th));
    }

    @NotNull
    public final List<o> d(@NotNull Deque<o> deque) {
        return new ArrayList(deque);
    }

    @NotNull
    public List<o> e(@NotNull v vVar, @NotNull g gVar, @NotNull Throwable th) {
        u uVarN = vVar.n();
        if (uVarN == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(b(th, gVar, vVar.l(), uVarN.d(), true));
        return arrayList;
    }
}
