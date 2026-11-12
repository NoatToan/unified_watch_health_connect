package o53;

import ch.qos.logback.core.CoreConstants;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\b&\u0018\u0000 $2\u00020\u00012\u00020\u0002:\u0001%B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0017¢\u0006\u0004\b\u000e\u0010\u0010J#\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u00052\n\u0010\u0013\u001a\u00060\u0011j\u0002`\u0012H&¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u00052\n\u0010\u0013\u001a\u00060\u0011j\u0002`\u0012H\u0017¢\u0006\u0004\b\u0017\u0010\u0016J'\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019\"\u0004\b\u0000\u0010\u00182\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001d\u001a\u00020\u00142\n\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\u0019¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010 \u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u0000H\u0087\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\fH\u0016¢\u0006\u0004\b\"\u0010#¨\u0006&"}, d2 = {"Lo53/z;", "Lt13/a;", "Lt13/e;", "<init>", "()V", "Lt13/g;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "isDispatchNeeded", "(Lt13/g;)Z", "", "parallelism", "", "name", "limitedParallelism", "(ILjava/lang/String;)Lo53/z;", "(I)Lo53/z;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "", "dispatch", "(Lt13/g;Ljava/lang/Runnable;)V", "dispatchYield", "T", "Lt13/d;", "continuation", "interceptContinuation", "(Lt13/d;)Lt13/d;", "releaseInterceptedContinuation", "(Lt13/d;)V", "other", "plus", "(Lo53/z;)Lo53/z;", "toString", "()Ljava/lang/String;", "Key", "a", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class z extends t13.a implements t13.e {

    /* JADX INFO: renamed from: Key, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public z() {
        super(t13.e.f161746w0);
    }

    public static /* synthetic */ z limitedParallelism$default(z zVar, int i14, String str, int i15, Object obj) {
        if (obj != null) {
            org.apache.commons.lang3.e.w("Super calls with default arguments not supported in this target, function: limitedParallelism");
            return null;
        }
        if ((i15 & 2) != 0) {
            str = null;
        }
        return zVar.limitedParallelism(i14, str);
    }

    public abstract void dispatch(t13.g context, Runnable block);

    public void dispatchYield(t13.g context, Runnable block) {
        u53.g.b(this, context, block);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to o53.z for r3v1 'this'  java.lang.Object
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // t13.a, t13.g
    public <E extends t13.g.a> E get(t13.g.b<E> r4) {
        /*
            r3 = this;
            r4.getClass()
            boolean r0 = r4 instanceof t13.b
            r1 = 0
            if (r0 == 0) goto L24
            t13.b r4 = (t13.b) r4
            t13.g$b r0 = r3.getKey()
            r0.getClass()
            if (r0 == r4) goto L19
            t13.g$b<?> r2 = r4.f161743b
            if (r2 != r0) goto L18
            goto L19
        L18:
            return r1
        L19:
            e23.l<t13.g$a, E extends B> r4 = r4.f161742a
            java.lang.Object r4 = r4.invoke(r3)
            t13.g$a r4 = (t13.g.a) r4
            if (r4 == 0) goto L29
            return r4
        L24:
            t13.e$a r0 = t13.e.f161746w0
            if (r0 != r4) goto L29
            return r3
        L29:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o53.z.get(t13.g$b):t13.g$a");
    }

    @Override // t13.e
    public final <T> t13.d<T> interceptContinuation(t13.d<? super T> continuation) {
        return new u53.f(this, continuation);
    }

    public boolean isDispatchNeeded(t13.g context) {
        return true;
    }

    public z limitedParallelism(int parallelism, String name) {
        oe2.f.i(parallelism);
        return new u53.i(this, parallelism, name);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to o53.z for r2v1 'this'  java.lang.Object
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // t13.a, t13.g
    public t13.g minusKey(t13.g.b<?> r3) {
        /*
            r2 = this;
            r3.getClass()
            boolean r0 = r3 instanceof t13.b
            if (r0 == 0) goto L25
            t13.b r3 = (t13.b) r3
            t13.g$b r0 = r2.getKey()
            r0.getClass()
            if (r0 == r3) goto L18
            t13.g$b<?> r1 = r3.f161743b
            if (r1 != r0) goto L17
            goto L18
        L17:
            return r2
        L18:
            e23.l<t13.g$a, E extends B> r3 = r3.f161742a
            java.lang.Object r3 = r3.invoke(r2)
            t13.g$a r3 = (t13.g.a) r3
            if (r3 == 0) goto L2c
            t13.h r3 = t13.h.f161748a
            return r3
        L25:
            t13.e$a r0 = t13.e.f161746w0
            if (r0 != r3) goto L2c
            t13.h r3 = t13.h.f161748a
            return r3
        L2c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o53.z.minusKey(t13.g$b):t13.g");
    }

    @o13.e
    public final z plus(z other) {
        return other;
    }

    @Override // t13.e
    public final void releaseInterceptedContinuation(t13.d<?> continuation) {
        continuation.getClass();
        u53.f fVar = (u53.f) continuation;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = u53.f.f168731h;
        while (atomicReferenceFieldUpdater.get(fVar) == u53.g.f168737b) {
        }
        Object obj = atomicReferenceFieldUpdater.get(fVar);
        k kVar = obj instanceof k ? (k) obj : null;
        if (kVar != null) {
            kVar.l();
        }
    }

    /* JADX INFO: renamed from: toString */
    public String getF168767c() {
        return getClass().getSimpleName() + '@' + f0.u(this);
    }

    @o13.e
    public /* synthetic */ z limitedParallelism(int parallelism) {
        return limitedParallelism(parallelism, null);
    }

    /* JADX INFO: renamed from: o53.z$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lo53/z$a;", "Lt13/b;", "Lt13/e;", "Lo53/z;", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion extends t13.b<t13.e, z> {
        private Companion() {
            super(t13.e.f161746w0, new ne2.t(28));
        }

        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }
    }
}
