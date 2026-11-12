package com.twitter.sdk.android.core.internal.scribe;

import android.content.Context;
import com.twitter.sdk.android.core.internal.CommonUtils;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes18.dex */
public abstract class EventsHandler<T> implements EventsStorageListener {
    public final Context context;
    public final ScheduledExecutorService executor;
    public EventsStrategy<T> strategy;

    public class a implements Runnable {
        public final /* synthetic */ Object a;
        public final /* synthetic */ boolean b;

        public a(Object obj, boolean z) {
            this.a = obj;
            this.b = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                EventsHandler.this.strategy.recordEvent((T) this.a);
                if (this.b) {
                    EventsHandler.this.strategy.rollFileOver();
                }
            } catch (Exception e) {
                CommonUtils.logControlledError(EventsHandler.this.context, "Failed to record event.", e);
            }
        }
    }

    public class b implements Runnable {
        public final /* synthetic */ Object a;

        public b(Object obj) {
            this.a = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                EventsHandler.this.strategy.recordEvent((T) this.a);
            } catch (Exception e) {
                CommonUtils.logControlledError(EventsHandler.this.context, "Failed to record event", e);
            }
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                EventsHandler.this.strategy.sendEvents();
            } catch (Exception e) {
                CommonUtils.logControlledError(EventsHandler.this.context, "Failed to send events files.", e);
            }
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                EventsHandler eventsHandler = EventsHandler.this;
                EventsStrategy<T> eventsStrategy = eventsHandler.strategy;
                eventsHandler.strategy = eventsHandler.getDisabledEventsStrategy();
                eventsStrategy.deleteAllEvents();
            } catch (Exception e) {
                CommonUtils.logControlledError(EventsHandler.this.context, "Failed to disable events.", e);
            }
        }
    }

    public EventsHandler(Context context, EventsStrategy<T> eventsStrategy, EventsFilesManager eventsFilesManager, ScheduledExecutorService scheduledExecutorService) {
        this.context = context.getApplicationContext();
        this.executor = scheduledExecutorService;
        this.strategy = eventsStrategy;
        eventsFilesManager.registerRollOverListener(this);
    }

    public void disable() {
        executeAsync(new d());
    }

    public void executeAsync(Runnable runnable) {
        try {
            this.executor.submit(runnable);
        } catch (Exception e) {
            CommonUtils.logControlledError(this.context, "Failed to submit events task", e);
        }
    }

    public void executeSync(Runnable runnable) {
        try {
            this.executor.submit(runnable).get();
        } catch (Exception e) {
            CommonUtils.logControlledError(this.context, "Failed to run events task", e);
        }
    }

    public abstract EventsStrategy<T> getDisabledEventsStrategy();

    @Override // com.twitter.sdk.android.core.internal.scribe.EventsStorageListener
    public void onRollOver(String str) {
        executeAsync(new c());
    }

    public void recordEventAsync(T t, boolean z) {
        executeAsync(new a(t, z));
    }

    public void recordEventSync(T t) {
        executeSync(new b(t));
    }
}
