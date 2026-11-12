package de.greenrobot.event;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes22.dex */
public class EventBusBuilder {
    private static final ExecutorService i = Executors.newCachedThreadPool();
    public boolean e;
    public List<Class<?>> h;
    public boolean a = true;
    public boolean b = true;
    public boolean c = true;
    public boolean d = true;
    public boolean f = true;
    public ExecutorService g = i;

    public EventBus build() {
        return new EventBus(this);
    }

    public EventBusBuilder eventInheritance(boolean z) {
        this.f = z;
        return this;
    }

    public EventBusBuilder executorService(ExecutorService executorService) {
        this.g = executorService;
        return this;
    }

    public EventBus installDefaultEventBus() {
        EventBus eventBus;
        synchronized (EventBus.class) {
            if (EventBus.p != null) {
                throw new EventBusException("Default instance already exists. It may be only set once before it's used the first time to ensure consistent behavior.");
            }
            EventBus.p = build();
            eventBus = EventBus.p;
        }
        return eventBus;
    }

    public EventBusBuilder logNoSubscriberMessages(boolean z) {
        this.b = z;
        return this;
    }

    public EventBusBuilder logSubscriberExceptions(boolean z) {
        this.a = z;
        return this;
    }

    public EventBusBuilder sendNoSubscriberEvent(boolean z) {
        this.d = z;
        return this;
    }

    public EventBusBuilder sendSubscriberExceptionEvent(boolean z) {
        this.c = z;
        return this;
    }

    public EventBusBuilder skipMethodVerificationFor(Class<?> cls) {
        if (this.h == null) {
            this.h = new ArrayList();
        }
        this.h.add(cls);
        return this;
    }

    public EventBusBuilder throwSubscriberException(boolean z) {
        this.e = z;
        return this;
    }
}
