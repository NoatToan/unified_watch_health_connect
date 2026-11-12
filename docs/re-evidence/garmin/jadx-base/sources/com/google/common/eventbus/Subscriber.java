package com.google.common.eventbus;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.j2objc.annotations.Weak;
import i3.e5;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes14.dex */
@ElementTypesAreNonnullByDefault
class Subscriber {

    @Weak
    private EventBus bus;
    private final Executor executor;
    private final Method method;

    @VisibleForTesting
    final Object target;

    @VisibleForTesting
    public static final class SynchronizedSubscriber extends Subscriber {
        private SynchronizedSubscriber(EventBus eventBus, Object obj, Method method) {
            super(eventBus, obj, method);
        }

        @Override // com.google.common.eventbus.Subscriber
        public void invokeSubscriberMethod(Object obj) {
            synchronized (this) {
                super.invokeSubscriberMethod(obj);
            }
        }
    }

    private Subscriber(EventBus eventBus, Object obj, Method method) {
        this.bus = eventBus;
        this.target = Preconditions.checkNotNull(obj);
        this.method = method;
        method.setAccessible(true);
        this.executor = eventBus.executor();
    }

    private SubscriberExceptionContext context(Object obj) {
        return new SubscriberExceptionContext(this.bus, obj, this.target, this.method);
    }

    public static Subscriber create(EventBus eventBus, Object obj, Method method) {
        return isDeclaredThreadSafe(method) ? new Subscriber(eventBus, obj, method) : new SynchronizedSubscriber(eventBus, obj, method);
    }

    private static boolean isDeclaredThreadSafe(Method method) {
        return method.getAnnotation(AllowConcurrentEvents.class) != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$dispatchEvent$0(Object obj) {
        try {
            invokeSubscriberMethod(obj);
        } catch (InvocationTargetException e4) {
            this.bus.handleSubscriberException(e4.getCause(), context(obj));
        }
    }

    public final void dispatchEvent(final Object obj) {
        this.executor.execute(new Runnable() { // from class: com.google.common.eventbus.a
            @Override // java.lang.Runnable
            public final void run() {
                this.lambda$dispatchEvent$0(obj);
            }
        });
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Subscriber) {
            Subscriber subscriber = (Subscriber) obj;
            if (this.target == subscriber.target && this.method.equals(subscriber.method)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return System.identityHashCode(this.target) + ((this.method.hashCode() + 31) * 31);
    }

    @VisibleForTesting
    public void invokeSubscriberMethod(Object obj) throws InvocationTargetException {
        try {
            this.method.invoke(this.target, Preconditions.checkNotNull(obj));
        } catch (IllegalAccessException e4) {
            throw new Error(e5.f(obj, "Method became inaccessible: "), e4);
        } catch (IllegalArgumentException e14) {
            throw new Error(e5.f(obj, "Method rejected target/argument: "), e14);
        } catch (InvocationTargetException e15) {
            if (!(e15.getCause() instanceof Error)) {
                throw e15;
            }
            throw ((Error) e15.getCause());
        }
    }
}
