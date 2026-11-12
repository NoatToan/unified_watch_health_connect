package com.google.common.eventbus;

import com.google.common.annotations.Beta;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.MoreExecutors;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
@Beta
public class EventBus {
    private static final Logger f = Logger.getLogger(EventBus.class.getName());
    private final String a;
    private final Executor b;
    private final SubscriberExceptionHandler c;
    private final c d;
    private final com.google.common.eventbus.a e;

    public static final class a implements SubscriberExceptionHandler {
        public static final a a = new a();

        private static Logger a(SubscriberExceptionContext subscriberExceptionContext) {
            return Logger.getLogger(EventBus.class.getName() + "." + subscriberExceptionContext.getEventBus().identifier());
        }

        private static String b(SubscriberExceptionContext subscriberExceptionContext) {
            Method subscriberMethod = subscriberExceptionContext.getSubscriberMethod();
            return "Exception thrown by subscriber method " + subscriberMethod.getName() + '(' + subscriberMethod.getParameterTypes()[0].getName() + ") on subscriber " + subscriberExceptionContext.getSubscriber() + " when dispatching event: " + subscriberExceptionContext.getEvent();
        }

        @Override // com.google.common.eventbus.SubscriberExceptionHandler
        public void handleException(Throwable th, SubscriberExceptionContext subscriberExceptionContext) {
            Logger loggerA = a(subscriberExceptionContext);
            Level level = Level.SEVERE;
            if (loggerA.isLoggable(level)) {
                loggerA.log(level, b(subscriberExceptionContext), th);
            }
        }
    }

    public EventBus() {
        this("default");
    }

    public final Executor a() {
        return this.b;
    }

    public void b(Throwable th, SubscriberExceptionContext subscriberExceptionContext) {
        Preconditions.checkNotNull(th);
        Preconditions.checkNotNull(subscriberExceptionContext);
        try {
            this.c.handleException(th, subscriberExceptionContext);
        } catch (Throwable th2) {
            f.log(Level.SEVERE, String.format(Locale.ROOT, "Exception %s thrown while handling exception: %s", th2, th), th2);
        }
    }

    public final String identifier() {
        return this.a;
    }

    public void post(Object obj) {
        Iterator<b> itF = this.d.f(obj);
        if (itF.hasNext()) {
            this.e.a(obj, itF);
        } else {
            if (obj instanceof DeadEvent) {
                return;
            }
            post(new DeadEvent(this, obj));
        }
    }

    public void register(Object obj) {
        this.d.h(obj);
    }

    public String toString() {
        return MoreObjects.toStringHelper(this).addValue(this.a).toString();
    }

    public void unregister(Object obj) {
        this.d.i(obj);
    }

    public EventBus(String str) {
        this(str, MoreExecutors.directExecutor(), com.google.common.eventbus.a.d(), a.a);
    }

    public EventBus(SubscriberExceptionHandler subscriberExceptionHandler) {
        this("default", MoreExecutors.directExecutor(), com.google.common.eventbus.a.d(), subscriberExceptionHandler);
    }

    public EventBus(String str, Executor executor, com.google.common.eventbus.a aVar, SubscriberExceptionHandler subscriberExceptionHandler) {
        this.d = new c(this);
        this.a = (String) Preconditions.checkNotNull(str);
        this.b = (Executor) Preconditions.checkNotNull(executor);
        this.e = (com.google.common.eventbus.a) Preconditions.checkNotNull(aVar);
        this.c = (SubscriberExceptionHandler) Preconditions.checkNotNull(subscriberExceptionHandler);
    }
}
