package de.greenrobot.event.util;

import android.app.Activity;
import android.util.Log;
import de.greenrobot.event.EventBus;
import java.lang.reflect.Constructor;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes22.dex */
public class AsyncExecutor {
    private final Executor a;
    private final Constructor<?> b;
    private final EventBus c;
    private final Object d;

    public static class Builder {
        private Executor a;
        private Class<?> b;
        private EventBus c;

        public /* synthetic */ Builder(a aVar) {
            this();
        }

        public AsyncExecutor build() {
            return buildForScope(null);
        }

        public AsyncExecutor buildForActivityScope(Activity activity) {
            return buildForScope(activity.getClass());
        }

        public AsyncExecutor buildForScope(Object obj) {
            if (this.c == null) {
                this.c = EventBus.getDefault();
            }
            if (this.a == null) {
                this.a = Executors.newCachedThreadPool();
            }
            if (this.b == null) {
                this.b = ThrowableFailureEvent.class;
            }
            return new AsyncExecutor(this.a, this.c, this.b, obj, null);
        }

        public Builder eventBus(EventBus eventBus) {
            this.c = eventBus;
            return this;
        }

        public Builder failureEventType(Class<?> cls) {
            this.b = cls;
            return this;
        }

        public Builder threadPool(Executor executor) {
            this.a = executor;
            return this;
        }

        private Builder() {
        }
    }

    public interface RunnableEx {
        void run() throws Exception;
    }

    public class a implements Runnable {
        public final /* synthetic */ RunnableEx a;

        public a(RunnableEx runnableEx) {
            this.a = runnableEx;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.a.run();
            } catch (Exception e) {
                try {
                    Object objNewInstance = AsyncExecutor.this.b.newInstance(e);
                    if (objNewInstance instanceof HasExecutionScope) {
                        ((HasExecutionScope) objNewInstance).setExecutionScope(AsyncExecutor.this.d);
                    }
                    AsyncExecutor.this.c.post(objNewInstance);
                } catch (Exception e2) {
                    Log.e(EventBus.TAG, "Original exception:", e);
                    throw new RuntimeException("Could not create failure event", e2);
                }
            }
        }
    }

    public /* synthetic */ AsyncExecutor(Executor executor, EventBus eventBus, Class cls, Object obj, a aVar) {
        this(executor, eventBus, cls, obj);
    }

    public static Builder builder() {
        return new Builder(null);
    }

    public static AsyncExecutor create() {
        return new Builder(null).build();
    }

    public void execute(RunnableEx runnableEx) {
        this.a.execute(new a(runnableEx));
    }

    private AsyncExecutor(Executor executor, EventBus eventBus, Class<?> cls, Object obj) {
        this.a = executor;
        this.c = eventBus;
        this.d = obj;
        try {
            this.b = cls.getConstructor(Throwable.class);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException("Failure event class must have a constructor with one parameter of type Throwable", e);
        }
    }
}
