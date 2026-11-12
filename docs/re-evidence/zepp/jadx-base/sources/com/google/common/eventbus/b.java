package com.google.common.eventbus;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.j2objc.annotations.Weak;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes3.dex */
class b {

    @Weak
    private EventBus a;

    @VisibleForTesting
    public final Object b;
    private final Method c;
    private final Executor d;

    public class a implements Runnable {
        public final /* synthetic */ Object a;

        public a(Object obj) {
            this.a = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                b.this.f(this.a);
            } catch (InvocationTargetException e) {
                b.this.a.b(e.getCause(), b.this.c(this.a));
            }
        }
    }

    /* JADX INFO: renamed from: com.google.common.eventbus.b$b, reason: collision with other inner class name */
    @VisibleForTesting
    public static final class C0209b extends b {
        public /* synthetic */ C0209b(EventBus eventBus, Object obj, Method method, a aVar) {
            this(eventBus, obj, method);
        }

        @Override // com.google.common.eventbus.b
        public void f(Object obj) throws InvocationTargetException {
            synchronized (this) {
                super.f(obj);
            }
        }

        private C0209b(EventBus eventBus, Object obj, Method method) {
            super(eventBus, obj, method, null);
        }
    }

    public /* synthetic */ b(EventBus eventBus, Object obj, Method method, a aVar) {
        this(eventBus, obj, method);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public SubscriberExceptionContext c(Object obj) {
        return new SubscriberExceptionContext(this.a, obj, this.b, this.c);
    }

    public static b d(EventBus eventBus, Object obj, Method method) {
        return g(method) ? new b(eventBus, obj, method) : new C0209b(eventBus, obj, method, null);
    }

    private static boolean g(Method method) {
        return method.getAnnotation(AllowConcurrentEvents.class) != null;
    }

    public final void e(Object obj) {
        this.d.execute(new a(obj));
    }

    public final boolean equals(@NullableDecl Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.b == bVar.b && this.c.equals(bVar.c);
    }

    @VisibleForTesting
    public void f(Object obj) throws InvocationTargetException {
        try {
            this.c.invoke(this.b, Preconditions.checkNotNull(obj));
        } catch (IllegalAccessException e) {
            throw new Error("Method became inaccessible: " + obj, e);
        } catch (IllegalArgumentException e2) {
            throw new Error("Method rejected target/argument: " + obj, e2);
        } catch (InvocationTargetException e3) {
            if (!(e3.getCause() instanceof Error)) {
                throw e3;
            }
            throw ((Error) e3.getCause());
        }
    }

    public final int hashCode() {
        return ((this.c.hashCode() + 31) * 31) + System.identityHashCode(this.b);
    }

    private b(EventBus eventBus, Object obj, Method method) {
        this.a = eventBus;
        this.b = Preconditions.checkNotNull(obj);
        this.c = method;
        method.setAccessible(true);
        this.d = eventBus.a();
    }
}
